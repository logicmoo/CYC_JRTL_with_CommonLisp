/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$nat_matching_predicate$;
import static com.cyc.cycjava.cycl.control_vars.$perform_equals_unification$;
import static com.cyc.cycjava.cycl.control_vars.within_askP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.deduction_handles.deduction_p;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_general_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_quantified_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.equals_lits;
import static com.cyc.cycjava.cycl.el_utilities.evaluate_litP;
import static com.cyc.cycjava.cycl.el_utilities.existentially_bind_vars;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.quoted_isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.result_genl_litP;
import static com.cyc.cycjava.cycl.el_utilities.result_isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.strip_sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.tou_lits;
import static com.cyc.cycjava.cycl.el_utilities.true_sentence_litP;
import static com.cyc.cycjava.cycl.equals.equalsP;
import static com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p;
import static com.cyc.cycjava.cycl.hlmt.hlmt_equal;
import static com.cyc.cycjava.cycl.hlmt.hlmt_equalP;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.transform_list_utilities.quiescent_transform;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CZER-UTILITIES
 * source file: /cyc/top/cycl/czer-utilities.lisp
 * created:     2019/07/03 17:37:29
 */
public final class czer_utilities extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_118_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa")), T), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing")), NIL), list(list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), T), list(list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), NIL), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")), NIL), list(list(ONE_INTEGER, ONE_INTEGER), T), list(list(ONE_INTEGER, TWO_INTEGER), NIL), list(list(ONE_INTEGER, reader_make_constant_shell("Thing")), NIL), list(list(ONE_INTEGER, makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), makeSymbol("?X")), T), list(list(makeSymbol("?X"), makeSymbol("?Y")), T), list(list(reader_make_constant_shell("Thing"), makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), reader_make_constant_shell("Thing")), NIL), list(list(reader_make_constant_shell("Thing"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"))), NIL), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing"))), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), TWO_INTEGER, ONE_INTEGER)), T), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), THREE_INTEGER, ONE_INTEGER)), NIL), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Cat")))), T), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Frog")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Frog")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Frog")))), NIL), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y"))))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), NIL), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("conceptuallyRelated"), makeSymbol("?Y"), makeSymbol("?X"))))), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("conceptuallyRelated"), makeSymbol("?Y"), makeSymbol("?X")))))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))))), NIL), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("forAll"), makeSymbol("?X"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))), reader_make_constant_shell("BaseKB"), makeKeyword("DNF")), NIL) });
    }

    static private final SubLString $str_alt50$ = makeString("");

    public static final SubLFile me = new czer_utilities();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $formula_arg_intP_caching_state$ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quoted_formula_arg_intP_caching_state$ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sentence_arg_intP_caching_state$ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quoted_sentence_arg_intP_caching_state$ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $some_sentence_arg_intP_caching_state$ = makeSymbol("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $some_quoted_sentence_arg_intP_caching_state$ = makeSymbol("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    // defparameter
    // Temporary control variable; should eventually stay T.
    /**
     * Temporary control variable; should eventually stay T.
     */
    @LispMethod(comment = "Temporary control variable; should eventually stay T.\ndefparameter")
    private static final SubLSymbol $czer_evaluatable_predicate_fix_enabledP$ = makeSymbol("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $opaque_arg_wrt_quoting_target$ = makeSymbol("*OPAQUE-ARG-WRT-QUOTING-TARGET*");



    private static final SubLObject $const3$canonicalizerDirectiveForArgAndRe = reader_make_constant_shell("canonicalizerDirectiveForArgAndRest");





    static private final SubLList $list6 = list(reader_make_constant_shell("LeaveVariablesAtEL"));

    private static final SubLObject $const7$LeaveSomeTermsAtELAndAllowKeyword = reader_make_constant_shell("LeaveSomeTermsAtELAndAllowKeywordVariables");

    static private final SubLList $list8 = list(reader_make_constant_shell("LeaveSomeTermsAtEL"), reader_make_constant_shell("AllowKeywordVariables"));



    static private final SubLList $list10 = list(reader_make_constant_shell("AllowGenericArgVariables"));



    static private final SubLList $list12 = list(reader_make_constant_shell("LeaveSomeTermsAtEL"));

    static private final SubLList $list13 = list(reader_make_constant_shell("LeaveSomeTermsAtELAndAllowKeywordVariables"));



    static private final SubLList $list15 = list(reader_make_constant_shell("AllowKeywordVariables"));

    static private final SubLString $str17$X__d = makeString("X-~d");

    static private final SubLString $str19$_a_was_not_a_canonical_variable = makeString("~a was not a canonical variable");

    private static final SubLObject $const20$RelaxArgTypeConstraintsForVariabl = reader_make_constant_shell("RelaxArgTypeConstraintsForVariables");







    private static final SubLObject $$CycLExpression_Assertible = reader_make_constant_shell("CycLExpression-Assertible");

    private static final SubLObject $$CycLExpression_Askable = reader_make_constant_shell("CycLExpression-Askable");

    private static final SubLSymbol $sym26$FORMULA_ARG_INT_ = makeSymbol("FORMULA-ARG-INT?");



    private static final SubLSymbol $sym28$_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $sym30$QUOTED_FORMULA_ARG_INT_ = makeSymbol("QUOTED-FORMULA-ARG-INT?");

    private static final SubLSymbol $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym32$SENTENCE_ARG_INT_ = makeSymbol("SENTENCE-ARG-INT?");



    private static final SubLSymbol $sym34$_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym35$CLEAR_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym36$QUOTED_SENTENCE_ARG_INT_ = makeSymbol("QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym39$SOME_SENTENCE_ARG_INT_ = makeSymbol("SOME-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym41$CLEAR_SOME_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SOME-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym42$SOME_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("SOME-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLSymbol $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    private static final SubLSymbol $sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_ = makeSymbol("CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?");

    private static final SubLObject $$CycLSentence_Askable = reader_make_constant_shell("CycLSentence-Askable");

    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell("CycLSentence-Assertible");





    private static final SubLSymbol NPUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("NPUT-BACK-CLAUSE-EL-VARIABLES");

    private static final SubLSymbol PUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("PUT-BACK-CLAUSE-EL-VARIABLES");



    private static final SubLString $$$function = makeString("function");





    private static final SubLSymbol $sym58$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str59$ = makeString("");

    private static final SubLString $str60$__s = makeString("-~s");

    private static final SubLSymbol $sym61$_X = makeSymbol("?X");

    private static final SubLString $str62$Could_not_create_a_unique_HL_var_ = makeString("Could not create a unique HL var wrt ~a");

    private static final SubLSymbol $sym64$CYC_VAR_ = makeSymbol("CYC-VAR?");





    private static final SubLSymbol $sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");

    private static final SubLSymbol NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");

    private static final SubLSymbol $sym71$EQUALS_EL_MEMOIZED_ = makeSymbol("EQUALS-EL-MEMOIZED?");

    private static final SubLSymbol CLAUSAL_FORM_P = makeSymbol("CLAUSAL-FORM-P");

    private static final SubLString $str76$Unexpected_clausal_form__s = makeString("Unexpected clausal form ~s");

    private static final SubLSymbol $sym77$NON_NULL_CLOSED_TERM_ = makeSymbol("NON-NULL-CLOSED-TERM?");

    private static final SubLSymbol $sym78$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EL_VARIABLE_TOKEN = makeSymbol("EL-VARIABLE-TOKEN");

    private static final SubLSymbol $OPAQUIFIED_EL_VARIABLE = makeKeyword("OPAQUIFIED-EL-VARIABLE");

    private static final SubLSymbol $sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_ = makeSymbol("RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?");



    private static final SubLSymbol $sym85$EVALUATABLE_EXPRESSION_ = makeSymbol("EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");

    private static final SubLString $str87$_s__s_does_not_adequately_specify = makeString("~s ~s does not adequately specify a microtheory.");

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell("ist-Asserted");

    private static final SubLSymbol $sym89$HL_VAR_ = makeSymbol("HL-VAR?");



    private static final SubLSymbol $sym91$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");

    private static final SubLSymbol ESCAPE_TERM = makeSymbol("ESCAPE-TERM");

    private static final SubLSymbol NESCAPE_QUOTE_HL_VARS = makeSymbol("NESCAPE-QUOTE-HL-VARS");

    private static final SubLSymbol $sym94$DECONTEXTUALIZED_CLAUSE_ = makeSymbol("DECONTEXTUALIZED-CLAUSE?");

    private static final SubLSymbol GENERALIZED_IST_CLAUSE_P = makeSymbol("GENERALIZED-IST-CLAUSE-P");

    private static final SubLList $list96 = list(reader_make_constant_shell("ist"), reader_make_constant_shell("ist-Asserted"));

    private static final SubLSymbol OPAQUE_ARG_WRT_QUOTING_SEEKER = makeSymbol("OPAQUE-ARG-WRT-QUOTING-SEEKER");

    private static final SubLSymbol $OPAQUE_ARG_FOUND = makeKeyword("OPAQUE-ARG-FOUND");

    private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");





    private static final SubLSymbol $sym108$LIT__ = makeSymbol("LIT-<");

    private static final SubLSymbol CLAUSE_BINDING_LIST_PAIRS_LITERAL = makeSymbol("CLAUSE-BINDING-LIST-PAIRS-LITERAL");

    private static final SubLList $list110 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("EL-TO-HL-BINDINGS"), makeSymbol("FREE-EL-VARS"));

    private static final SubLSymbol $sym111$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol $sym112$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");

    private static final SubLString $str115$__Error__assert_failed__S___ = makeString("~%Error: assert failed ~S.~%");

    private static final SubLString $str116$__Error__Can_t_find_assertion___ = makeString("~%Error: Can't find assertion:~%");

    private static final SubLString $str118$__Form___A_in__A__ = makeString("~%Form: ~A in ~A~%");

    private static final SubLString $str119$__Error__assert_failed__ = makeString("~%Error: assert failed~%");

    private static final SubLString $str120$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A~%");

    private static final SubLString $str121$__The_assertion_is__S___ = makeString("~%The assertion is ~S.~%");

    private static final SubLString $str122$__Its_EL_form_is__S_in__S___ = makeString("~%Its EL form is ~S in ~S.~%");

    private static final SubLString $str123$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A in ~A~%");

    private static final SubLString $str124$__Its_New_EL_form_is__S_in__S___ = makeString("~%Its New EL form is ~S in ~S.~%");

    private static final SubLString $str125$__Error__EL_mismatch___Original__ = makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");

    private static final SubLString $str126$__Error__assert_failed___S__ = makeString("~%Error: assert failed: ~S~%");

    private static final SubLString $str127$__Error__unassert_failed___S__ = makeString("~%Error: unassert failed: ~S~%");

    private static final SubLSymbol $sym128$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLObject $list135 = _constant_135_initializer();

    // Definitions
    public static final SubLObject some_canonicalizer_directive_assertionsP_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(relation)) {
            if (NIL != com.cyc.cycjava.cycl.czer_utilities.some_canonicalizer_directive_assertions_somewhereP(relation)) {
                {
                    SubLObject cdolist_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
                    SubLObject czer_pred = NIL;
                    for (czer_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , czer_pred = cdolist_list_var.first()) {
                        if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(relation, czer_pred, mt, ONE_INTEGER, $TRUE)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject some_canonicalizer_directive_assertionsP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != forts.fort_p(relation)) && (NIL != some_canonicalizer_directive_assertions_somewhereP(relation))) {
            SubLObject cdolist_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
            SubLObject czer_pred = NIL;
            czer_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(relation, czer_pred, mt, ONE_INTEGER, $TRUE)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                czer_pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Return T iff RELATION is known to have any canonicalizer-directive assertions stated about it at all.
     */
    @LispMethod(comment = "Return T iff RELATION is known to have any canonicalizer-directive assertions stated about it at all.")
    public static final SubLObject some_canonicalizer_directive_assertions_somewhereP_alt(SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            {
                SubLObject foundP = NIL;
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
                        SubLObject czer_pred = NIL;
                        for (czer_pred = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , czer_pred = csome_list_var.first()) {
                            if (NIL != somewhere_cache.some_pred_assertion_somewhereP(czer_pred, relation, ONE_INTEGER, UNPROVIDED)) {
                                foundP = T;
                            }
                        }
                    }
                }
                return foundP;
            }
        }
        return NIL;
    }

    /**
     * Return T iff RELATION is known to have any canonicalizer-directive assertions stated about it at all.
     */
    @LispMethod(comment = "Return T iff RELATION is known to have any canonicalizer-directive assertions stated about it at all.")
    public static SubLObject some_canonicalizer_directive_assertions_somewhereP(final SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                SubLObject csome_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
                SubLObject czer_pred = NIL;
                czer_pred = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if (NIL != somewhere_cache.some_pred_assertion_somewhereP(czer_pred, relation, ONE_INTEGER, UNPROVIDED)) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    czer_pred = csome_list_var.first();
                } 
            }
            return foundP;
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether the canonicalizer should respect DIRECTIVE when
    canonicalizing the ARGNUMth argument position of RELATION in MT.
     */
    @LispMethod(comment = "@return booleanp; whether the canonicalizer should respect DIRECTIVE when\r\ncanonicalizing the ARGNUMth argument position of RELATION in MT.")
    public static final SubLObject canonicalizer_directive_for_argP_alt(SubLObject relation, SubLObject argnum, SubLObject directive, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                if (NIL == com.cyc.cycjava.cycl.czer_utilities.some_canonicalizer_directive_assertions_somewhereP(relation)) {
                    return NIL;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject pred_var = $$canonicalizerDirectiveForArg;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                                        SubLObject done_var = resultP;
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
                                                                SubLObject done_var_1 = resultP;
                                                                SubLObject token_var_2 = NIL;
                                                                while (NIL == done_var_1) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                        SubLObject valid_3 = makeBoolean(token_var_2 != ass);
                                                                        if (NIL != valid_3) {
                                                                            {
                                                                                SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                                                                SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                                                                resultP = makeBoolean(argnum.eql(asserted_argnum) && (directive == asserted_directive));
                                                                            }
                                                                        }
                                                                        done_var_1 = makeBoolean((NIL == valid_3) || (NIL != resultP));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $const3$canonicalizerDirectiveForArgAndRe;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                                        SubLObject done_var = resultP;
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
                                                                SubLObject done_var_5 = resultP;
                                                                SubLObject token_var_6 = NIL;
                                                                while (NIL == done_var_5) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                        SubLObject valid_7 = makeBoolean(token_var_6 != ass);
                                                                        if (NIL != valid_7) {
                                                                            {
                                                                                SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                                                                SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                                                                resultP = makeBoolean(((NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) && argnum.numGE(asserted_argnum)) && (directive == asserted_directive));
                                                                            }
                                                                        }
                                                                        done_var_5 = makeBoolean((NIL == valid_7) || (NIL != resultP));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$canonicalizerDirectiveForAllArgs;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                                        SubLObject done_var = resultP;
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
                                                                SubLObject done_var_9 = resultP;
                                                                SubLObject token_var_10 = NIL;
                                                                while (NIL == done_var_9) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                        SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                                        if (NIL != valid_11) {
                                                                            {
                                                                                SubLObject asserted_directive = assertions_high.gaf_arg2(ass);
                                                                                resultP = eq(directive, asserted_directive);
                                                                            }
                                                                        }
                                                                        done_var_9 = makeBoolean((NIL == valid_11) || (NIL != resultP));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == resultP) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.czer_utilities.direct_spec_canonicalizer_directives(directive);
                        SubLObject spec_directive = NIL;
                        for (spec_directive = csome_list_var.first(); !((NIL != resultP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , spec_directive = csome_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(relation, argnum, spec_directive, mt)) {
                                resultP = T;
                            }
                        }
                    }
                }
                return resultP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether the canonicalizer should respect DIRECTIVE when
    canonicalizing the ARGNUMth argument position of RELATION in MT.
     */
    @LispMethod(comment = "@return booleanp; whether the canonicalizer should respect DIRECTIVE when\r\ncanonicalizing the ARGNUMth argument position of RELATION in MT.")
    public static SubLObject canonicalizer_directive_for_argP(final SubLObject relation, final SubLObject argnum, final SubLObject directive, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        if (NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            SubLObject pred_var = $$canonicalizerDirectiveForArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = resultP;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                if (NIL != valid_$3) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = makeBoolean(argnum.eql(asserted_argnum) && (NIL != kb_utilities.kbeq(directive, asserted_directive)));
                                }
                                done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
            pred_var = $const3$canonicalizerDirectiveForArgAndRe;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$2 = resultP;
                            final SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(ass));
                                if (NIL != valid_$4) {
                                    final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                    final SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                    resultP = makeBoolean(((NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) && argnum.numGE(asserted_argnum)) && (NIL != kb_utilities.kbeq(directive, asserted_directive)));
                                }
                                done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
            pred_var = $$canonicalizerDirectiveForAllArgs;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = resultP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$3 = resultP;
                            final SubLObject token_var_$4 = NIL;
                            while (NIL == done_var_$3) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                                if (NIL != valid_$5) {
                                    final SubLObject asserted_directive2 = assertions_high.gaf_arg2(ass);
                                    resultP = kb_utilities.kbeq(directive, asserted_directive2);
                                }
                                done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != resultP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != resultP));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == resultP) {
            SubLObject csome_list_var = direct_spec_canonicalizer_directives(directive);
            SubLObject spec_directive = NIL;
            spec_directive = csome_list_var.first();
            while ((NIL == resultP) && (NIL != csome_list_var)) {
                if (NIL != canonicalizer_directive_for_argP(relation, argnum, spec_directive, mt)) {
                    resultP = T;
                }
                csome_list_var = csome_list_var.rest();
                spec_directive = csome_list_var.first();
            } 
        }
        return resultP;
    }

    /**
     *
     *
     * @return listp; all direct genlCanonicalizerDirectives of DIRECTIVE
     */
    @LispMethod(comment = "@return listp; all direct genlCanonicalizerDirectives of DIRECTIVE")
    public static final SubLObject direct_genl_canonicalizer_directives_alt(SubLObject directive) {
        {
            SubLObject pcase_var = directive;
            if (pcase_var.eql($$LeaveSomeTermsAtEL)) {
                return $list_alt6;
            } else {
                if (pcase_var.eql($const7$LeaveSomeTermsAtELAndAllowKeyword)) {
                    return $list_alt8;
                } else {
                    if (pcase_var.eql($$AllowKeywordVariables)) {
                        return $list_alt10;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; all direct genlCanonicalizerDirectives of DIRECTIVE
     */
    @LispMethod(comment = "@return listp; all direct genlCanonicalizerDirectives of DIRECTIVE")
    public static SubLObject direct_genl_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql($$LeaveSomeTermsAtEL)) {
            return $list6;
        }
        if (directive.eql($const7$LeaveSomeTermsAtELAndAllowKeyword)) {
            return $list8;
        }
        if (directive.eql($$AllowKeywordVariables)) {
            return $list10;
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; all direct specCanonicalizerDirectives of DIRECTIVE
     */
    @LispMethod(comment = "@return listp; all direct specCanonicalizerDirectives of DIRECTIVE")
    public static final SubLObject direct_spec_canonicalizer_directives_alt(SubLObject directive) {
        {
            SubLObject pcase_var = directive;
            if (pcase_var.eql($$LeaveVariablesAtEL)) {
                return $list_alt12;
            } else {
                if (pcase_var.eql($$LeaveSomeTermsAtEL)) {
                    return $list_alt13;
                } else {
                    if (pcase_var.eql($$AllowKeywordVariables)) {
                        return $list_alt13;
                    } else {
                        if (pcase_var.eql($$AllowGenericArgVariables)) {
                            return $list_alt15;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; all direct specCanonicalizerDirectives of DIRECTIVE
     */
    @LispMethod(comment = "@return listp; all direct specCanonicalizerDirectives of DIRECTIVE")
    public static SubLObject direct_spec_canonicalizer_directives(final SubLObject directive) {
        if (directive.eql($$LeaveVariablesAtEL)) {
            return $list12;
        }
        if (directive.eql($$LeaveSomeTermsAtEL)) {
            return $list13;
        }
        if (directive.eql($$AllowKeywordVariables)) {
            return $list13;
        }
        if (directive.eql($$AllowGenericArgVariables)) {
            return $list15;
        }
        return NIL;
    }

    public static final SubLObject get_nth_canonical_variable_alt(SubLObject n, SubLObject type) {
        if (type == UNPROVIDED) {
            type = czer_vars.$canonical_variable_type$.getDynamicValue();
        }
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($EL_VAR)) {
                return cycl_variables.make_el_var(format(NIL, $str_alt17$X__d, n));
            } else {
                if (pcase_var.eql($KB_VAR)) {
                    return variables.find_variable_by_id(n);
                }
            }
        }
        return NIL;
    }

    public static SubLObject get_nth_canonical_variable(final SubLObject n, SubLObject type) {
        if (type == UNPROVIDED) {
            type = czer_vars.$canonical_variable_type$.getDynamicValue();
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($EL_VAR)) {
            return cycl_variables.make_el_var(format(NIL, $str17$X__d, n));
        }
        if (pcase_var.eql($KB_VAR)) {
            return variables.find_variable_by_id(n);
        }
        return NIL;
    }

    public static final SubLObject canonical_variable_number_alt(SubLObject var) {
        if (NIL != cycl_grammar.el_variable_p(var)) {
            {
                SubLObject name = cycl_variables.el_var_name(var);
                SubLObject suffix = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
                SubLObject num = string_utilities.string_to_integer(suffix);
                if (num.isInteger()) {
                    return num;
                }
            }
        } else {
            if (NIL != cycl_grammar.hl_variable_p(var)) {
                return variables.variable_id(var);
            }
        }
        return Errors.error($str_alt19$_a_was_not_a_canonical_variable, var);
    }

    public static SubLObject canonical_variable_number(final SubLObject var) {
        if (NIL != cycl_grammar.el_variable_p(var)) {
            final SubLObject name = cycl_variables.el_var_name(var);
            final SubLObject suffix = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
            final SubLObject num = string_utilities.string_to_integer(suffix);
            if (num.isInteger()) {
                return num;
            }
        } else
            if (NIL != cycl_grammar.hl_variable_p(var)) {
                return variables.variable_id(var);
            }

        return Errors.error($str19$_a_was_not_a_canonical_variable, var);
    }

    /**
     *
     *
     * @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit generic args as variables.
     */
    @LispMethod(comment = "@return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit generic args as variables.")
    public static final SubLObject arg_permits_generic_arg_variablesP_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(reln, argnum, $$AllowGenericArgVariables, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit generic args as variables.
     */
    @LispMethod(comment = "@return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit generic args as variables.")
    public static SubLObject arg_permits_generic_arg_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, $$AllowGenericArgVariables, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit keywords as variables.
     */
    @LispMethod(comment = "@return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit keywords as variables.")
    public static final SubLObject arg_permits_keyword_variablesP_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(reln, argnum, $$AllowKeywordVariables, mt);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit keywords as variables.
     */
    @LispMethod(comment = "@return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit keywords as variables.")
    public static SubLObject arg_permits_keyword_variablesP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return canonicalizer_directive_for_argP(reln, argnum, $$AllowKeywordVariables, mt);
        }
        return NIL;
    }

    public static final SubLObject relax_arg_type_constraints_for_variables_for_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(relation, argnum, $const20$RelaxArgTypeConstraintsForVariabl, mt);
    }

    public static SubLObject relax_arg_type_constraints_for_variables_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $const20$RelaxArgTypeConstraintsForVariabl, mt);
    }

    public static final SubLObject dont_reorder_commutative_terms_for_args_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject argnums = NIL;
                if (NIL == com.cyc.cycjava.cycl.czer_utilities.some_canonicalizer_directive_assertions_somewhereP(relation)) {
                    return NIL;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForArg, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
                                SubLObject cdolist_list_var = assertions;
                                SubLObject ass = NIL;
                                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                    {
                                        SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                        if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                                            argnums = cons(asserted_argnum, argnums);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($const3$canonicalizerDirectiveForArgAndRe, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
                                SubLObject cdolist_list_var = assertions;
                                SubLObject ass = NIL;
                                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                    {
                                        SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                        SubLObject v_arity = arity.arity(relation);
                                        if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                                            {
                                                SubLObject end_var = add(v_arity, ONE_INTEGER);
                                                SubLObject argnum = NIL;
                                                for (argnum = asserted_argnum; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                                                    argnums = cons(argnum, argnums);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForAllArgs, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                if (NIL != assertions) {
                                    {
                                        SubLObject v_arity = arity.arity(relation);
                                        SubLObject end_var = add(v_arity, ONE_INTEGER);
                                        SubLObject argnum = NIL;
                                        for (argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                                            argnums = cons(argnum, argnums);
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject dont_reorder_commutative_terms_for_args(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums = NIL;
        if (NIL == some_canonicalizer_directive_assertions_somewhereP(relation)) {
            return NIL;
        }
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForArg, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    argnums = cons(asserted_argnum, argnums);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($const3$canonicalizerDirectiveForArgAndRe, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, THREE_INTEGER, $TRUE);
            ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                final SubLObject v_arity = arity.arity(relation);
                if (NIL != subl_promotions.non_negative_integer_p(asserted_argnum)) {
                    SubLObject end_var;
                    SubLObject argnum;
                    for (end_var = add(v_arity, ONE_INTEGER), argnum = NIL, argnum = asserted_argnum; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                        argnums = cons(argnum, argnums);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$canonicalizerDirectiveForAllArgs, relation, $$DontReOrderCommutativeTerms, ONE_INTEGER, TWO_INTEGER, $TRUE);
            if (NIL != assertions) {
                final SubLObject v_arity2 = arity.arity(relation);
                SubLObject end_var2;
                SubLObject argnum2;
                for (end_var2 = add(v_arity2, ONE_INTEGER), argnum2 = NIL, argnum2 = ONE_INTEGER; !argnum2.numGE(end_var2); argnum2 = number_utilities.f_1X(argnum2)) {
                    argnums = cons(argnum2, argnums);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean, return t iff arguments in position ARGNUM
    of RELATION are constrained to be something that might be an assertion.
     * @see :variable *possibly-meta-arg-type*
     */
    @LispMethod(comment = "@return boolean, return t iff arguments in position ARGNUM\r\nof RELATION are constrained to be something that might be an assertion.\r\n@see :variable *possibly-meta-arg-type*")
    public static final SubLObject possibly_assertion_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        } else {
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean, return t iff arguments in position ARGNUM
    of RELATION are constrained to be something that might be an assertion.
     * @see :variable *possibly-meta-arg-type*
     */
    @LispMethod(comment = "@return boolean, return t iff arguments in position ARGNUM\r\nof RELATION are constrained to be something that might be an assertion.\r\n@see :variable *possibly-meta-arg-type*")
    public static SubLObject possibly_assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean, return t iff arguments in position ARGNUM
    of RELATION are constrained to be assertions.
     * @see :variable *meta-arg-type*
     */
    @LispMethod(comment = "@return boolean, return t iff arguments in position ARGNUM\r\nof RELATION are constrained to be assertions.\r\n@see :variable *meta-arg-type*")
    public static final SubLObject assertion_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        } else {
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean, return t iff arguments in position ARGNUM
    of RELATION are constrained to be assertions.
     * @see :variable *meta-arg-type*
     */
    @LispMethod(comment = "@return boolean, return t iff arguments in position ARGNUM\r\nof RELATION are constrained to be assertions.\r\n@see :variable *meta-arg-type*")
    public static SubLObject assertion_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP(czer_vars.$meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg position PSN of relation RELN is constrained to be a spec of #$CycLIndexedTerm.
     */
    @LispMethod(comment = "@return boolean; t iff arg position PSN of relation RELN is constrained to be a spec of #$CycLIndexedTerm.")
    public static final SubLObject indexed_argP_alt(SubLObject reln, SubLObject psn) {
        if (psn.numG(ZERO_INTEGER)) {
            {
                SubLObject formulaP = NIL;
                if (NIL == formulaP) {
                    {
                        SubLObject csome_list_var = kb_accessors.argn_isa(reln, psn, UNPROVIDED);
                        SubLObject type = NIL;
                        for (type = csome_list_var.first(); !((NIL != formulaP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                            if (NIL != genls.genlsP(type, $$CycLIndexedTerm, UNPROVIDED, UNPROVIDED)) {
                                formulaP = T;
                            }
                        }
                    }
                }
                return formulaP;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg position PSN of relation RELN is constrained to be a spec of #$CycLIndexedTerm.
     */
    @LispMethod(comment = "@return boolean; t iff arg position PSN of relation RELN is constrained to be a spec of #$CycLIndexedTerm.")
    public static SubLObject indexed_argP(final SubLObject reln, final SubLObject psn) {
        if (psn.numG(ZERO_INTEGER)) {
            SubLObject formulaP = NIL;
            if (NIL == formulaP) {
                SubLObject csome_list_var = kb_accessors.argn_isa(reln, psn, UNPROVIDED);
                SubLObject type = NIL;
                type = csome_list_var.first();
                while ((NIL == formulaP) && (NIL != csome_list_var)) {
                    if (NIL != genls.genlsP(type, $$CycLIndexedTerm, UNPROVIDED, UNPROVIDED)) {
                        formulaP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    type = csome_list_var.first();
                } 
            }
            return formulaP;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an CycLExpression .
    (note: such args need only pass syntactic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an CycLExpression .\r\n(note: such args need only pass syntactic wf tests)")
    public static final SubLObject expression_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an CycLExpression .
    (note: such args need only pass syntactic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an CycLExpression .\r\n(note: such args need only pass syntactic wf tests)")
    public static SubLObject expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject assertible_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    public static SubLObject askable_expression_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLExpression_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLExpression_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff RELATION's ARGNUMth arg is constrained to be a collection whose instances are Cyc formulas.
     * @see formula-denoting-collection?
     */
    @LispMethod(comment = "@return boolean; t iff RELATION\'s ARGNUMth arg is constrained to be a collection whose instances are Cyc formulas.\r\n@see formula-denoting-collection?")
    public static final SubLObject formula_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isInteger()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.formula_arg_intP(relation, argnum, mt)) || (NIL != com.cyc.cycjava.cycl.czer_utilities.quoted_formula_arg_intP(relation, argnum, mt)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff RELATION's ARGNUMth arg is constrained to be a collection whose instances are Cyc formulas.
     * @see formula-denoting-collection?
     */
    @LispMethod(comment = "@return boolean; t iff RELATION\'s ARGNUMth arg is constrained to be a collection whose instances are Cyc formulas.\r\n@see formula-denoting-collection?")
    public static SubLObject formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isInteger())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return makeBoolean((NIL != formula_arg_intP(relation, argnum, mt)) || (NIL != quoted_formula_arg_intP(relation, argnum, mt)));
    }

    public static final SubLObject clear_formula_arg_intP_alt() {
        {
            SubLObject cs = $formula_arg_intP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_formula_arg_intP() {
        final SubLObject cs = $formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_formula_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject formula_arg_intP_internal_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static final SubLObject formula_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject caching_state = $formula_arg_intP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym24$FORMULA_ARG_INT_, $sym26$_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (argnum == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_utilities.formula_arg_intP_internal(relation, argnum, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym26$FORMULA_ARG_INT_, $sym28$_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_quoted_formula_arg_intP_alt() {
        {
            SubLObject cs = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_quoted_formula_arg_intP() {
        final SubLObject cs = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_quoted_formula_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($quoted_formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($quoted_formula_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject quoted_formula_arg_intP_internal_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject quoted_formula_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLFormula, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static final SubLObject quoted_formula_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject caching_state = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym29$QUOTED_FORMULA_ARG_INT_, $sym30$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (argnum == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_utilities.quoted_formula_arg_intP_internal(relation, argnum, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject quoted_formula_arg_intP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $quoted_formula_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym30$QUOTED_FORMULA_ARG_INT_, $sym31$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(quoted_formula_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return boolean; t iff RELATION's ARGNUMth arg is constrained to be a collection whose instances are Cyc sentences.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION\'s ARGNUMth arg is constrained to be a collection whose instances are Cyc sentences.")
    public static final SubLObject sentence_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isInteger()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.sentence_arg_intP(relation, argnum, mt)) || (NIL != com.cyc.cycjava.cycl.czer_utilities.quoted_sentence_arg_intP(relation, argnum, mt)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff RELATION's ARGNUMth arg is constrained to be a collection whose instances are Cyc sentences.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION\'s ARGNUMth arg is constrained to be a collection whose instances are Cyc sentences.")
    public static SubLObject sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isInteger())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        mt = hlmt.hlmt_monad_mt(mt);
        return makeBoolean((NIL != sentence_arg_intP(relation, argnum, mt)) || (NIL != quoted_sentence_arg_intP(relation, argnum, mt)));
    }

    public static final SubLObject clear_sentence_arg_intP_alt() {
        {
            SubLObject cs = $sentence_arg_intP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_sentence_arg_intP() {
        final SubLObject cs = $sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_sentence_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sentence_arg_intP_internal_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static final SubLObject sentence_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        {
            SubLObject caching_state = $sentence_arg_intP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym31$SENTENCE_ARG_INT_, $sym33$_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (argnum == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_utilities.sentence_arg_intP_internal(relation, argnum, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = $sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym32$SENTENCE_ARG_INT_, $sym34$_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym35$CLEAR_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_quoted_sentence_arg_intP_alt() {
        {
            SubLObject cs = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_quoted_sentence_arg_intP() {
        final SubLObject cs = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_quoted_sentence_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($quoted_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($quoted_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, argnum, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject quoted_sentence_arg_intP_internal_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static SubLObject quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
    }

    public static final SubLObject quoted_sentence_arg_intP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        {
            SubLObject caching_state = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym34$QUOTED_SENTENCE_ARG_INT_, $sym35$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (argnum == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_utilities.quoted_sentence_arg_intP_internal(relation, argnum, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject quoted_sentence_arg_intP(final SubLObject relation, final SubLObject argnum, final SubLObject mt) {
        SubLObject caching_state = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym36$QUOTED_SENTENCE_ARG_INT_, $sym37$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym38$CLEAR_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(quoted_sentence_arg_intP_internal(relation, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject some_sentence_argP(final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != some_sentence_arg_intP(reln, mt)) || (NIL != some_quoted_sentence_arg_intP(reln, mt)));
    }

    public static SubLObject clear_some_sentence_arg_intP() {
        final SubLObject cs = $some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($some_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject some_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.arg_isa(relation, mt), mt, UNPROVIDED);
    }

    public static SubLObject some_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = $some_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym39$SOME_SENTENCE_ARG_INT_, $sym40$_SOME_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym41$CLEAR_SOME_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(some_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_some_quoted_sentence_arg_intP() {
        final SubLObject cs = $some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($some_quoted_sentence_arg_intP_caching_state$.getGlobalValue(), list(relation, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject some_quoted_sentence_arg_intP_internal(final SubLObject relation, final SubLObject mt) {
        return genls.any_specP($$CycLSentence, kb_accessors.arg_quoted_isa(relation, mt), mt, UNPROVIDED);
    }

    public static SubLObject some_quoted_sentence_arg_intP(final SubLObject relation, final SubLObject mt) {
        SubLObject caching_state = $some_quoted_sentence_arg_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym42$SOME_QUOTED_SENTENCE_ARG_INT_, $sym43$_SOME_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback($sym44$CLEAR_SOME_QUOTED_SENTENCE_ARG_INT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(some_quoted_sentence_arg_intP_internal(relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an askable formula
    (note: such args need only pass syntactic and arity wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an askable formula\r\n(note: such args need only pass syntactic and arity wf tests)")
    public static final SubLObject askable_formula_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an askable formula
    (note: such args need only pass syntactic and arity wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an askable formula\r\n(note: such args need only pass syntactic and arity wf tests)")
    public static SubLObject askable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an assertable formula
    (note: such args need pass semantic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an assertable formula\r\n(note: such args need pass semantic wf tests)")
    public static final SubLObject assertable_formula_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an assertable formula
    (note: such args need pass semantic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an assertable formula\r\n(note: such args need pass semantic wf tests)")
    public static SubLObject assertable_formula_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Askable.
    (note: such args need only pass syntactic and arity wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Askable.\r\n(note: such args need only pass syntactic and arity wf tests)")
    public static final SubLObject askable_sentence_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Askable.
    (note: such args need only pass syntactic and arity wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Askable.\r\n(note: such args need only pass syntactic and arity wf tests)")
    public static SubLObject askable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Askable, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Assertible.
    (note: such args need pass semantic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Assertible.\r\n(note: such args need pass semantic wf tests)")
    public static final SubLObject assertable_sentence_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            if (NIL != cyc_const_logical_operator_p(relation)) {
                return T;
            }
            return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Assertible.
    (note: such args need pass semantic wf tests)
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLSentence-Assertible.\r\n(note: such args need pass semantic wf tests)")
    public static SubLObject assertable_sentence_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == forts.fort_p(relation)) || (!argnum.isNumber())) || (!argnum.numG(ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != cyc_const_logical_operator_p(relation)) {
            return T;
        }
        return makeBoolean((NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLDenotationalTerm
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLDenotationalTerm")
    public static final SubLObject denotational_term_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of RELATION is an #$CycLDenotationalTerm
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of RELATION is an #$CycLDenotationalTerm")
    public static SubLObject denotational_term_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            return makeBoolean((NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED)) || (NIL != genls.any_specP($$CycLDenotationalTerm, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject leave_some_terms_at_el_for_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(relation, argnum, $$LeaveSomeTermsAtEL, mt);
    }

    public static SubLObject leave_some_terms_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $$LeaveSomeTermsAtEL, mt);
    }

    public static final SubLObject leave_variables_at_el_for_argP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.canonicalizer_directive_for_argP(relation, argnum, $$LeaveVariablesAtEL, mt);
    }

    public static SubLObject leave_variables_at_el_for_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return canonicalizer_directive_for_argP(relation, argnum, $$LeaveVariablesAtEL, mt);
    }

    public static final SubLObject arg_isa_quotedP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
                {
                    SubLObject ans = NIL;
                    SubLObject arg_isa_quoted_arg = kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                    if (NIL != arg_isa_quoted_arg) {
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    ans = kb_mapping_utilities.fpred_value(relation, kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    return ans;
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_isa_quotedP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != forts.fort_p(relation)) && argnum.isNumber()) && argnum.numG(ZERO_INTEGER)) {
            SubLObject ans = NIL;
            final SubLObject arg_isa_quoted_arg = kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
            if (NIL != arg_isa_quoted_arg) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    ans = kb_mapping_utilities.fpred_value(relation, kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return ans;
        }
        return NIL;
    }

    /**
     * returns t iff PRED is a #$DistributingMetaKnowledgePredicate.
     */
    @LispMethod(comment = "returns t iff PRED is a #$DistributingMetaKnowledgePredicate.")
    public static final SubLObject distributing_meta_predP_alt(SubLObject pred) {
        return fort_types_interface.distributing_meta_knowledge_predicate_p(pred);
    }

    /**
     * returns t iff PRED is a #$DistributingMetaKnowledgePredicate.
     */
    @LispMethod(comment = "returns t iff PRED is a #$DistributingMetaKnowledgePredicate.")
    public static SubLObject distributing_meta_predP(final SubLObject pred) {
        return fort_types_interface.distributing_meta_knowledge_predicate_p(pred);
    }

    public static final SubLObject find_hl_gaf_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject assertion = com.cyc.cycjava.cycl.czer_utilities.safe_find_gaf_genl_mts(formula, mt);
            if (NIL != term.kb_assertionP(assertion)) {
                return assertion;
            } else {
                if (NIL != mt) {
                    return list($$ist, mt, formula);
                } else {
                    return formula;
                }
            }
        }
    }

    public static SubLObject find_hl_gaf(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        if (NIL != mt) {
            return list($$ist, mt, formula);
        }
        return formula;
    }

    public static final SubLObject find_hl_gaf_if_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject assertion = com.cyc.cycjava.cycl.czer_utilities.safe_find_gaf_genl_mts(formula, mt);
            if (NIL != term.kb_assertionP(assertion)) {
                return assertion;
            }
        }
        return NIL;
    }

    public static SubLObject find_hl_gaf_if(final SubLObject formula, final SubLObject mt) {
        final SubLObject assertion = safe_find_gaf_genl_mts(formula, mt);
        if (NIL != term.kb_assertionP(assertion)) {
            return assertion;
        }
        return NIL;
    }

    public static final SubLObject safe_find_gaf_genl_mts_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject gaf = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            gaf = kb_indexing.find_gaf_genl_mts(formula, mt);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return gaf;
        }
    }

    public static SubLObject safe_find_gaf_genl_mts(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gaf = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    gaf = kb_indexing.find_gaf_genl_mts(formula, mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return gaf;
    }

    /**
     *
     *
     * @param list
     * 		list; a list of length 2, a clause/binding-list pair.
     * @return clause
     */
    @LispMethod(comment = "@param list\r\n\t\tlist; a list of length 2, a clause/binding-list pair.\r\n@return clause")
    public static final SubLObject nput_back_clause_el_variables_alt(SubLObject list) {
        {
            SubLObject clause = list.first();
            SubLObject blist = second(list);
            clause = com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(clause);
            {
                SubLObject cdolist_list_var = blist;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
                }
            }
            return clause;
        }
    }

    /**
     *
     *
     * @param list
     * 		list; a list of length 2, a clause/binding-list pair.
     * @return clause
     */
    @LispMethod(comment = "@param list\r\n\t\tlist; a list of length 2, a clause/binding-list pair.\r\n@return clause")
    public static SubLObject nput_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = second(list);
        clause = nescape_quote_hl_vars(clause);
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return clause;
    }

    /**
     *
     *
     * @param list
     * 		list; a list of length 2, a clause/binding-list pair.
     * @return clause
     */
    @LispMethod(comment = "@param list\r\n\t\tlist; a list of length 2, a clause/binding-list pair.\r\n@return clause")
    public static final SubLObject put_back_clause_el_variables_alt(SubLObject list) {
        {
            SubLObject clause = list.first();
            SubLObject blist = second(list);
            clause = com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(copy_tree(clause));
            {
                SubLObject cdolist_list_var = blist;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
                }
            }
            return clause;
        }
    }

    /**
     *
     *
     * @param list
     * 		list; a list of length 2, a clause/binding-list pair.
     * @return clause
     */
    @LispMethod(comment = "@param list\r\n\t\tlist; a list of length 2, a clause/binding-list pair.\r\n@return clause")
    public static SubLObject put_back_clause_el_variables(final SubLObject list) {
        SubLObject clause = list.first();
        final SubLObject blist = second(list);
        clause = nescape_quote_hl_vars(copy_tree(clause));
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause = nsubst(binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return clause;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of clause/binding list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)), or they could also be triples and the
    third elements are ignored.
    This is the return value of @xref canonicalize-cycl.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of clause/binding list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)), or they could also be triples and the\r\nthird elements are ignored.\r\nThis is the return value of @xref canonicalize-cycl.")
    public static final SubLObject list_of_clause_binding_list_pairs_p_alt(SubLObject v_object) {
        if (!v_object.isCons()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = v_object;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                if (!(((NIL != list_utilities.lengthLE(pair, THREE_INTEGER, UNPROVIDED)) && (NIL != clauses.cnf_p(pair.first()))) && (NIL != bindings.binding_list_p(second(pair))))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of clause/binding list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)), or they could also be triples and the
    third elements are ignored.
    This is the return value of @xref canonicalize-cycl.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of clause/binding list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)), or they could also be triples and the\r\nthird elements are ignored.\r\nThis is the return value of @xref canonicalize-cycl.")
    public static SubLObject list_of_clause_binding_list_pairs_p(final SubLObject v_object) {
        if (!v_object.isCons()) {
            return NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == list_utilities.lengthLE(pair, THREE_INTEGER, UNPROVIDED)) || (NIL == clauses.cnf_p(pair.first()))) || (NIL == bindings.binding_list_p(second(pair)))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject clause_binding_list_pairs_literal(final SubLObject v_object) {
        return clauses.singleton_clause_literal(v_object.first());
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the EL variables substituted back in according to the binding lists.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the EL variables substituted back in according to the binding lists.")
    public static final SubLObject nextract_el_clauses_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (Mapping.mapcar(NPUT_BACK_CLAUSE_EL_VARIABLES, thing))) : thing;
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the EL variables substituted back in according to the binding lists.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the EL variables substituted back in according to the binding lists.")
    public static SubLObject nextract_el_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(NPUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the EL variables substituted back in according to the binding lists.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the EL variables substituted back in according to the binding lists.")
    public static final SubLObject extract_el_clauses_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (Mapping.mapcar(PUT_BACK_CLAUSE_EL_VARIABLES, thing))) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the EL variables substituted back in according to the binding lists.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the EL variables substituted back in according to the binding lists.")
    public static SubLObject extract_el_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(PUT_BACK_CLAUSE_EL_VARIABLES, thing) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the blists ignored and the clauses unmodified.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the blists ignored and the clauses unmodified.")
    public static final SubLObject extract_hl_clauses_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (Mapping.mapcar(FIRST, thing))) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the blists ignored and the clauses unmodified.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the blists ignored and the clauses unmodified.")
    public static SubLObject extract_hl_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(FIRST, thing) : thing;
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the blists ignored and the clauses unmodified.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the blists ignored and the clauses unmodified.")
    public static final SubLObject nextract_hl_clauses_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (list_utilities.nmapcar(FIRST, thing))) : thing;
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the blists ignored and the clauses unmodified.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the blists ignored and the clauses unmodified.")
    public static SubLObject nextract_hl_clauses(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? list_utilities.nmapcar(FIRST, thing) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the clauses ignored and the blists unmodified.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the clauses ignored and the blists unmodified.")
    public static final SubLObject extract_blists_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (Mapping.mapcar(SECOND, thing))) : thing;
    }

    /**
     * This is not destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the clauses ignored and the blists unmodified.
     */
    @LispMethod(comment = "This is not destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the clauses ignored and the blists unmodified.")
    public static SubLObject extract_blists(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? Mapping.mapcar(SECOND, thing) : thing;
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the clauses ignored and the blists unmodified.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the clauses ignored and the blists unmodified.")
    public static final SubLObject nextract_blists_alt(SubLObject thing) {
        return NIL != com.cyc.cycjava.cycl.czer_utilities.list_of_clause_binding_list_pairs_p(thing) ? ((SubLObject) (list_utilities.nmapcar(SECOND, thing))) : thing;
    }

    /**
     * This is destructive.
     *
     * @param thing
     * 		list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
     * @return list; a list of clauses with the clauses ignored and the blists unmodified.
     */
    @LispMethod(comment = "This is destructive.\r\n\r\n@param thing\r\n\t\tlist; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))\r\n@return list; a list of clauses with the clauses ignored and the blists unmodified.")
    public static SubLObject nextract_blists(final SubLObject thing) {
        return NIL != list_of_clause_binding_list_pairs_p(thing) ? list_utilities.nmapcar(SECOND, thing) : thing;
    }

    public static final SubLObject fn_tou_lit_alt(SubLObject fn_term, SubLObject literals) {
        {
            SubLObject tou = NIL;
            if (NIL == tou) {
                {
                    SubLObject csome_list_var = tou_lits(literals);
                    SubLObject lit = NIL;
                    for (lit = csome_list_var.first(); !((NIL != tou) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                        if (fn_term.equal(literal_arg2(lit, UNPROVIDED))) {
                            tou = lit;
                        }
                    }
                }
            }
            return tou;
        }
    }

    public static SubLObject fn_tou_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject tou = NIL;
        if (NIL == tou) {
            SubLObject csome_list_var = tou_lits(literals);
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == tou) && (NIL != csome_list_var)) {
                if (fn_term.equal(literal_arg2(lit, UNPROVIDED))) {
                    tou = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return tou;
    }

    public static final SubLObject fn_equals_lit_alt(SubLObject fn_term, SubLObject literals) {
        {
            SubLObject equals_lit = NIL;
            if (NIL == equals_lit) {
                {
                    SubLObject csome_list_var = equals_lits(literals);
                    SubLObject lit = NIL;
                    for (lit = csome_list_var.first(); !((NIL != equals_lit) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                        if (fn_term.equal(third(lit))) {
                            equals_lit = lit;
                        }
                    }
                }
            }
            return equals_lit;
        }
    }

    public static SubLObject fn_equals_lit(final SubLObject fn_term, final SubLObject literals) {
        SubLObject equals_lit = NIL;
        if (NIL == equals_lit) {
            SubLObject csome_list_var = equals_lits(literals);
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == equals_lit) && (NIL != csome_list_var)) {
                if (fn_term.equal(third(lit))) {
                    equals_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return equals_lit;
    }

    public static final SubLObject fn_evaluate_lit_alt(SubLObject fn_term, SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            SubLObject evaluate_lit = NIL;
            if (NIL == evaluate_lit) {
                {
                    SubLObject csome_list_var = literals;
                    SubLObject lit = NIL;
                    for (lit = csome_list_var.first(); !((NIL != evaluate_lit) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                        if ((NIL != evaluate_litP(lit, UNPROVIDED)) && (NIL != funcall(test, fn_term, literal_arg2(lit, UNPROVIDED)))) {
                            evaluate_lit = lit;
                        }
                    }
                }
            }
            return evaluate_lit;
        }
    }

    public static SubLObject fn_evaluate_lit(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLObject evaluate_lit = NIL;
        if (NIL == evaluate_lit) {
            SubLObject csome_list_var = literals;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == evaluate_lit) && (NIL != csome_list_var)) {
                if ((NIL != evaluate_litP(lit, UNPROVIDED)) && (NIL != funcall(test, fn_term, literal_arg2(lit, UNPROVIDED)))) {
                    evaluate_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return evaluate_lit;
    }

    public static final SubLObject fn_some_non_evaluatable_referenceP_alt(SubLObject fn_term, SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $czer_evaluatable_predicate_fix_enabledP$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject non_evaluatable_reference = NIL;
                if (NIL == non_evaluatable_reference) {
                    {
                        SubLObject csome_list_var = literals;
                        SubLObject lit = NIL;
                        for (lit = csome_list_var.first(); !((NIL != non_evaluatable_reference) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                            {
                                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(lit);
                                if (!((NIL != forts.fort_p(predicate)) && (NIL != relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED)))) {
                                    if (NIL != list_utilities.tree_find(fn_term, lit, test, UNPROVIDED)) {
                                        non_evaluatable_reference = lit;
                                    }
                                }
                            }
                        }
                    }
                }
                return non_evaluatable_reference;
            }
        }
    }

    public static SubLObject fn_some_non_evaluatable_referenceP(final SubLObject fn_term, final SubLObject literals, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $czer_evaluatable_predicate_fix_enabledP$.getDynamicValue(thread)) {
            return T;
        }
        SubLObject non_evaluatable_reference = NIL;
        if (NIL == non_evaluatable_reference) {
            SubLObject csome_list_var = literals;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == non_evaluatable_reference) && (NIL != csome_list_var)) {
                final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(lit);
                if (((NIL == forts.fort_p(predicate)) || (NIL == relation_evaluation.evaluatable_predicateP(predicate, UNPROVIDED))) && (NIL != list_utilities.tree_find(fn_term, lit, test, UNPROVIDED))) {
                    non_evaluatable_reference = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return non_evaluatable_reference;
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$termOfUnit ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$termOfUnit ?FUNCTION FN-TERM)")
    public static final SubLObject make_nart_var_tou_lit_alt(SubLObject fn_term) {
        return make_binary_formula($$termOfUnit, com.cyc.cycjava.cycl.czer_utilities.make_nart_var_for_tou_lit(cycl_utilities.formula_arg0(fn_term)), fn_term);
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$termOfUnit ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$termOfUnit ?FUNCTION FN-TERM)")
    public static SubLObject make_nart_var_tou_lit(final SubLObject fn_term) {
        return make_binary_formula($$termOfUnit, make_nart_var_for_tou_lit(cycl_utilities.formula_arg0(fn_term)), fn_term);
    }

    public static final SubLObject make_nart_var_for_tou_lit_alt(SubLObject fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
                {
                    SubLObject orig_var = list_utilities.alist_lookup(czer_main.$tou_skolem_blist$.getDynamicValue(thread), fn, UNPROVIDED, UNPROVIDED);
                    if (NIL != orig_var) {
                        return orig_var;
                    }
                }
            }
            return cycl_variables.make_el_var(com.cyc.cycjava.cycl.czer_utilities.clause_new_el_var_name(NIL != forts.fort_p(fn) ? ((SubLObject) (constants_high.constant_name(fn))) : $$$function));
        }
    }

    public static SubLObject make_nart_var_for_tou_lit(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
            final SubLObject orig_var = list_utilities.alist_lookup(czer_main.$tou_skolem_blist$.getDynamicValue(thread), fn, UNPROVIDED, UNPROVIDED);
            if (NIL != orig_var) {
                return orig_var;
            }
        }
        return cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(fn) ? constants_high.constant_name(fn) : $$$function));
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$equals ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$equals ?FUNCTION FN-TERM)")
    public static final SubLObject make_nart_var_equals_lit_alt(SubLObject fn_term) {
        return make_binary_formula($$equals, cycl_variables.make_el_var(com.cyc.cycjava.cycl.czer_utilities.clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? ((SubLObject) (constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)))) : $$$function)), fn_term);
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$equals ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$equals ?FUNCTION FN-TERM)")
    public static SubLObject make_nart_var_equals_lit(final SubLObject fn_term) {
        return make_binary_formula($$equals, cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : $$$function)), fn_term);
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$evaluate ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$evaluate ?FUNCTION FN-TERM)")
    public static final SubLObject make_nart_var_evaluate_lit_alt(SubLObject fn_term) {
        return make_binary_formula($$evaluate, cycl_variables.make_el_var(com.cyc.cycjava.cycl.czer_utilities.clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? ((SubLObject) (constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)))) : $$$function)), fn_term);
    }

    /**
     *
     *
     * @return literal; a literal of the form (#$evaluate ?FUNCTION FN-TERM)
     */
    @LispMethod(comment = "@return literal; a literal of the form (#$evaluate ?FUNCTION FN-TERM)")
    public static SubLObject make_nart_var_evaluate_lit(final SubLObject fn_term) {
        return make_binary_formula($$evaluate, cycl_variables.make_el_var(clause_new_el_var_name(NIL != forts.fort_p(cycl_utilities.formula_arg0(fn_term)) ? constants_high.constant_name(cycl_utilities.formula_arg0(fn_term)) : $$$function)), fn_term);
    }

    public static final SubLObject clause_new_el_var_name_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_name = com.cyc.cycjava.cycl.czer_utilities.unique_var_name_wrt(name, czer_vars.$clause_el_var_names$.getDynamicValue(thread));
                if (NIL == subl_promotions.memberP(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread), symbol_function($sym49$STRING_), UNPROVIDED)) {
                    czer_vars.$clause_el_var_names$.setDynamicValue(cons(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread)), thread);
                }
                return new_name;
            }
        }
    }

    public static SubLObject clause_new_el_var_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_name = unique_var_name_wrt(name, czer_vars.$clause_el_var_names$.getDynamicValue(thread));
        if (NIL == subl_promotions.memberP(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread), symbol_function($sym58$STRING_), UNPROVIDED)) {
            czer_vars.$clause_el_var_names$.setDynamicValue(cons(new_name, czer_vars.$clause_el_var_names$.getDynamicValue(thread)), thread);
        }
        return new_name;
    }

    public static final SubLObject unique_var_name_wrt_alt(SubLObject string, SubLObject strings) {
        {
            SubLObject n = NIL;
            SubLObject post = NIL;
            SubLObject new_string = NIL;
            SubLObject var_string = NIL;
            for (n = ZERO_INTEGER, post = $str_alt50$, new_string = cconcatenate(string, post), var_string = com.cyc.cycjava.cycl.czer_utilities.make_czer_el_var_name(new_string); NIL != subl_promotions.memberP(var_string, strings, symbol_function($sym49$STRING_), UNPROVIDED); n = add(n, ONE_INTEGER) , post = format(NIL, $str_alt51$__s, n) , new_string = cconcatenate(string, post) , var_string = com.cyc.cycjava.cycl.czer_utilities.make_czer_el_var_name(new_string)) {
            }
            return var_string;
        }
    }

    public static SubLObject unique_var_name_wrt(final SubLObject string, final SubLObject strings) {
        SubLObject n = NIL;
        SubLObject post = NIL;
        SubLObject new_string = NIL;
        SubLObject var_string = NIL;
        n = ZERO_INTEGER;
        post = $str59$;
        for (new_string = cconcatenate(string, post), var_string = make_czer_el_var_name(new_string); NIL != subl_promotions.memberP(var_string, strings, symbol_function($sym58$STRING_), UNPROVIDED); var_string = make_czer_el_var_name(new_string)) {
            n = add(n, ONE_INTEGER);
            post = format(NIL, $str60$__s, n);
            new_string = cconcatenate(string, post);
        }
        return var_string;
    }

    public static final SubLObject unique_el_var_wrt_expression_alt(SubLObject expression, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $sym52$_X;
        }
        {
            SubLObject new_var = v_default;
            while (NIL != cycl_utilities.expression_find(new_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                new_var = czer_main.uniquify(new_var);
            } 
            return new_var;
        }
    }

    public static SubLObject unique_el_var_wrt_expression(final SubLObject expression, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $sym61$_X;
        }
        SubLObject new_var;
        for (new_var = v_default; NIL != cycl_utilities.expression_find(new_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED); new_var = czer_main.uniquify(new_var)) {
        }
        return new_var;
    }

    /**
     *
     *
     * @return hl-variable-p; an HL variable which does not occur in EXPRESSION.
    If EXPRESSION2 is provided, the returned HL variable will not occur in EXPRESSION2 either.
     */
    @LispMethod(comment = "@return hl-variable-p; an HL variable which does not occur in EXPRESSION.\r\nIf EXPRESSION2 is provided, the returned HL variable will not occur in EXPRESSION2 either.")
    public static final SubLObject unique_hl_var_wrt_expression_alt(SubLObject expression, SubLObject expression2) {
        if (expression2 == UNPROVIDED) {
            expression2 = NIL;
        }
        {
            SubLObject end_var = variables.variable_count();
            SubLObject num = NIL;
            for (num = ZERO_INTEGER; !num.numGE(end_var); num = number_utilities.f_1X(num)) {
                {
                    SubLObject hl_var = variables.find_variable_by_id(num);
                    if ((NIL == cycl_utilities.expression_find(hl_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find(hl_var, expression2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        return hl_var;
                    }
                }
            }
        }
        return Errors.error($str_alt53$Could_not_create_a_unique_HL_var_, expression);
    }

    /**
     *
     *
     * @return hl-variable-p; an HL variable which does not occur in EXPRESSION.
    If EXPRESSION2 is provided, the returned HL variable will not occur in EXPRESSION2 either.
     */
    @LispMethod(comment = "@return hl-variable-p; an HL variable which does not occur in EXPRESSION.\r\nIf EXPRESSION2 is provided, the returned HL variable will not occur in EXPRESSION2 either.")
    public static SubLObject unique_hl_var_wrt_expression(final SubLObject expression, SubLObject expression2) {
        if (expression2 == UNPROVIDED) {
            expression2 = NIL;
        }
        SubLObject end_var;
        SubLObject num;
        SubLObject hl_var;
        for (end_var = variables.variable_count(), num = NIL, num = ZERO_INTEGER; !num.numGE(end_var); num = number_utilities.f_1X(num)) {
            hl_var = variables.find_variable_by_id(num);
            if ((NIL == cycl_utilities.expression_find(hl_var, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find(hl_var, expression2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return hl_var;
            }
        }
        return Errors.error($str62$Could_not_create_a_unique_HL_var_, expression);
    }

    /**
     *
     *
     * @return string; the name of the EL variable that would be created from STRING,
    if STRING were made into an EL variable.
     */
    @LispMethod(comment = "@return string; the name of the EL variable that would be created from STRING,\r\nif STRING were made into an EL variable.")
    public static final SubLObject make_czer_el_var_name_alt(SubLObject string) {
        return cycl_variables.el_var_name(cycl_variables.make_el_var(string));
    }

    /**
     *
     *
     * @return string; the name of the EL variable that would be created from STRING,
    if STRING were made into an EL variable.
     */
    @LispMethod(comment = "@return string; the name of the EL variable that would be created from STRING,\r\nif STRING were made into an EL variable.")
    public static SubLObject make_czer_el_var_name(final SubLObject string) {
        return cycl_variables.el_var_name(cycl_variables.make_el_var(string));
    }

    /**
     *
     *
     * @return boolean; t iff CANDIDATE-VARIABLE is a variable, according to whatever definition of variable the canonicalizer is using at the time.
     * @see :function cyc-var?
     * @see :variable *canon-var-function*
     */
    @LispMethod(comment = "@return boolean; t iff CANDIDATE-VARIABLE is a variable, according to whatever definition of variable the canonicalizer is using at the time.\r\n@see :function cyc-var?\r\n@see :variable *canon-var-function*")
    public static final SubLObject canon_varP_alt(SubLObject candidate_variable) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != candidate_variable) && (NIL != (czer_vars.$canon_var_function$.getDynamicValue(thread) == $DEFAULT ? ((SubLObject) (cycl_variables.cyc_varP(candidate_variable))) : funcall(czer_vars.$canon_var_function$.getDynamicValue(thread), candidate_variable))));
        }
    }

    /**
     *
     *
     * @return boolean; t iff CANDIDATE-VARIABLE is a variable, according to whatever definition of variable the canonicalizer is using at the time.
     * @see :function cyc-var?
     * @see :variable *canon-var-function*
     */
    @LispMethod(comment = "@return boolean; t iff CANDIDATE-VARIABLE is a variable, according to whatever definition of variable the canonicalizer is using at the time.\r\n@see :function cyc-var?\r\n@see :variable *canon-var-function*")
    public static SubLObject canon_varP(final SubLObject candidate_variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != candidate_variable) && (NIL != (czer_vars.$canon_var_function$.getDynamicValue(thread) == $DEFAULT ? cycl_variables.cyc_varP(candidate_variable) : funcall(czer_vars.$canon_var_function$.getDynamicValue(thread), candidate_variable))));
    }

    public static final SubLObject true_sentenceP_alt(SubLObject formula) {
        if (NIL == el_negation_p(formula)) {
            return true_sentence_litP(formula);
        }
        return NIL;
    }

    public static SubLObject true_sentenceP(final SubLObject formula) {
        if (NIL == el_negation_p(formula)) {
            return true_sentence_litP(formula);
        }
        return NIL;
    }

    public static final SubLObject true_negated_varP_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym55$CYC_VAR_;
        }
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.czer_utilities.true_sentenceP(formula)) && (NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != funcall(varP, cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED))));
    }

    public static SubLObject true_negated_varP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        return makeBoolean(((NIL != true_sentenceP(formula)) && (NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != funcall(varP, cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED))));
    }

    public static final SubLObject true_negated_formulaP_alt(SubLObject formula) {
        if (NIL != com.cyc.cycjava.cycl.czer_utilities.true_sentenceP(formula)) {
            return makeBoolean((NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))) || (NIL != el_quantified_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject true_negated_formulaP(final SubLObject formula) {
        if (NIL != true_sentenceP(formula)) {
            return makeBoolean((NIL != el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))) || (NIL != el_quantified_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))));
        }
        return NIL;
    }

    public static final SubLObject true_var_formulaP_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym55$CYC_VAR_;
        }
        if (NIL != com.cyc.cycjava.cycl.czer_utilities.true_sentenceP(formula)) {
            return funcall(varP, cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject true_var_formulaP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        if (NIL != true_sentenceP(formula)) {
            return funcall(varP, cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject encapsulate_formulaP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sequence_var(formula, UNPROVIDED)) {
                if ((((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != el_formula_p(formula))) && (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_operator(formula)))) && (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED))) {
                    return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
                } else {
                    {
                        SubLObject result = NIL;
                        SubLObject tempformula = (NIL != sequence_var(formula, UNPROVIDED)) ? ((SubLObject) (strip_sequence_var(formula))) : formula;
                        SubLObject formula_13 = tempformula;
                        result = com.cyc.cycjava.cycl.czer_utilities.encapsulate_formulaP(formula_13);
                        return result;
                    }
                }
            } else {
                if ((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != cycl_variables.el_varP(formula))) {
                    return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
                } else {
                    if ((NIL != czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.czer_utilities.intensional_formulaP(formula))) {
                        return czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject encapsulate_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            if ((((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != el_formula_p(formula))) && (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_operator(formula)))) && (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED))) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            SubLObject result = NIL;
            final SubLObject formula_$13;
            final SubLObject tempformula = formula_$13 = (NIL != sequence_var(formula, UNPROVIDED)) ? strip_sequence_var(formula) : formula;
            result = encapsulate_formulaP(formula_$13);
            return result;
        } else {
            if ((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread)) && (NIL != cycl_variables.el_varP(formula))) {
                return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
            }
            if ((NIL != czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread)) && (NIL != intensional_formulaP(formula))) {
                return czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    public static final SubLObject encapsulate_formula_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym55$CYC_VAR_;
        }
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            return make_unary_formula($$trueSentence, formula);
        } else {
            if (NIL != funcall(varP, formula)) {
                return com.cyc.cycjava.cycl.czer_utilities.make_var_formula_lit(formula);
            } else {
                if (NIL != com.cyc.cycjava.cycl.czer_utilities.intensional_formulaP(formula)) {
                    return com.cyc.cycjava.cycl.czer_utilities.make_intensional_lit(formula);
                } else {
                    return formula;
                }
            }
        }
    }

    public static SubLObject encapsulate_formula(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym64$CYC_VAR_;
        }
        if (NIL != sequence_var(formula, UNPROVIDED)) {
            return make_unary_formula($$trueSentence, formula);
        }
        if (NIL != funcall(varP, formula)) {
            return make_var_formula_lit(formula);
        }
        if (NIL != intensional_formulaP(formula)) {
            return make_intensional_lit(formula);
        }
        return formula;
    }

    public static final SubLObject intensional_formulaP_alt(SubLObject formula) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.czer_utilities.within_disjunctionP()) && (NIL == com.cyc.cycjava.cycl.czer_utilities.within_negated_disjunctionP())) && (((NIL != el_universal_p(formula)) && ((NIL == el_quantified_negation_p(formula)) || (NIL == com.cyc.cycjava.cycl.czer_utilities.within_negationP()))) || (((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula))) && ((NIL != com.cyc.cycjava.cycl.czer_utilities.within_negationP()) || (NIL != el_quantified_negation_p(formula)))))) || ((NIL != within_askP()) && (((NIL != com.cyc.cycjava.cycl.czer_utilities.within_negationP()) && ((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula)))) || ((NIL == com.cyc.cycjava.cycl.czer_utilities.within_negationP()) && (NIL != el_universal_p(formula))))));
    }

    public static SubLObject intensional_formulaP(final SubLObject formula) {
        return makeBoolean((((NIL != within_disjunctionP()) && (NIL == within_negated_disjunctionP())) && (((NIL != el_universal_p(formula)) && ((NIL == el_quantified_negation_p(formula)) || (NIL == within_negationP()))) || (((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula))) && ((NIL != within_negationP()) || (NIL != el_quantified_negation_p(formula)))))) || ((NIL != within_askP()) && (((NIL != within_negationP()) && ((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula)))) || ((NIL == within_negationP()) && (NIL != el_universal_p(formula))))));
    }

    public static final SubLObject make_var_formula_lit_alt(SubLObject var) {
        return make_unary_formula($$trueSentence, var);
    }

    public static SubLObject make_var_formula_lit(final SubLObject var) {
        return make_unary_formula($$trueSentence, var);
    }

    public static final SubLObject make_intensional_lit_alt(SubLObject formula) {
        if (((NIL != within_askP()) && (NIL != com.cyc.cycjava.cycl.czer_utilities.within_negationP())) && (NIL != el_general_existential_p(formula))) {
            return com.cyc.cycjava.cycl.czer_utilities.make_intensional_lit_int(formula);
        } else {
            if (NIL != com.cyc.cycjava.cycl.czer_utilities.within_negationP()) {
                return make_unary_formula($$trueSentence, formula);
            } else {
                if (NIL != within_askP()) {
                    return make_unary_formula($$trueSentence, formula);
                } else {
                    return com.cyc.cycjava.cycl.czer_utilities.make_intensional_lit_int(formula);
                }
            }
        }
    }

    public static SubLObject make_intensional_lit(final SubLObject formula) {
        if (((NIL != within_askP()) && (NIL != within_negationP())) && (NIL != el_general_existential_p(formula))) {
            return make_intensional_lit_int(formula);
        }
        if (NIL != within_negationP()) {
            return make_unary_formula($$trueSentence, formula);
        }
        if (NIL != within_askP()) {
            return make_unary_formula($$trueSentence, formula);
        }
        return make_intensional_lit_int(formula);
    }

    public static final SubLObject make_intensional_lit_int_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                    try {
                        czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                        result = cycl_utilities.negate(make_unary_formula($$trueSentence, simplifier.simplify_cycl_sentence(clausifier.do_negations(cycl_utilities.negate(formula)), UNPROVIDED)));
                    } finally {
                        czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject make_intensional_lit_int(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            result = cycl_utilities.negate(make_unary_formula($$trueSentence, simplifier.simplify_cycl_sentence(clausifier.do_negations(cycl_utilities.negate(formula)), UNPROVIDED)));
        } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return boolean; T iff FORMULA could be expanded, i.e. its operator
    has either an #$expansion or an #$expansionDefn visible from MT.
     */
    @LispMethod(comment = "@return boolean; T iff FORMULA could be expanded, i.e. its operator\r\nhas either an #$expansion or an #$expansionDefn visible from MT.")
    public static final SubLObject formula_has_expansionP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.czer_utilities.relation_has_expansionP(cycl_utilities.formula_operator(formula), mt);
    }

    /**
     *
     *
     * @return boolean; T iff FORMULA could be expanded, i.e. its operator
    has either an #$expansion or an #$expansionDefn visible from MT.
     */
    @LispMethod(comment = "@return boolean; T iff FORMULA could be expanded, i.e. its operator\r\nhas either an #$expansion or an #$expansionDefn visible from MT.")
    public static SubLObject formula_has_expansionP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return relation_has_expansionP(cycl_utilities.formula_operator(formula), mt);
    }

    /**
     *
     *
     * @return boolean; T iff RELATION has either an #$expansion or an #$expansionDefn visible from MT.
     */
    @LispMethod(comment = "@return boolean; T iff RELATION has either an #$expansion or an #$expansionDefn visible from MT.")
    public static final SubLObject relation_has_expansionP_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(relation)) {
                {
                    SubLObject result = NIL;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            result = verbosifier.el_expansionP(relation);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; T iff RELATION has either an #$expansion or an #$expansionDefn visible from MT.
     */
    @LispMethod(comment = "@return boolean; T iff RELATION has either an #$expansion or an #$expansionDefn visible from MT.")
    public static SubLObject relation_has_expansionP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(relation)) {
            SubLObject result = NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                result = verbosifier.el_expansionP(relation);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject within_negationP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return czer_vars.$within_negationP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_negationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$within_negationP$.getDynamicValue(thread);
    }

    public static final SubLObject within_disjunctionP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return at_vars.$within_disjunctionP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_disjunctionP$.getDynamicValue(thread);
    }

    /**
     * is the subformula being considered within a conjunction?
     */
    @LispMethod(comment = "is the subformula being considered within a conjunction?")
    public static final SubLObject within_conjunctionP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return at_vars.$within_conjunctionP$.getDynamicValue(thread);
        }
    }

    /**
     * is the subformula being considered within a conjunction?
     */
    @LispMethod(comment = "is the subformula being considered within a conjunction?")
    public static SubLObject within_conjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_conjunctionP$.getDynamicValue(thread);
    }

    public static final SubLObject within_negated_disjunctionP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return at_vars.$within_negated_disjunctionP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_negated_disjunctionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_negated_disjunctionP$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return boolean; t iff FUNC1 and FUNC2 commute with each other.
     */
    @LispMethod(comment = "@return boolean; t iff FUNC1 and FUNC2 commute with each other.")
    public static final SubLObject commuting_functionsP_alt(SubLObject func1, SubLObject func2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(func1)) && (NIL != forts.fort_p(func2))) && ((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func1, func2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func2, func1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     *
     *
     * @return boolean; t iff FUNC1 and FUNC2 commute with each other.
     */
    @LispMethod(comment = "@return boolean; t iff FUNC1 and FUNC2 commute with each other.")
    public static SubLObject commuting_functionsP(final SubLObject func1, final SubLObject func2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(func1)) && (NIL != forts.fort_p(func2))) && ((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func1, func2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$functionCommutesWith, func2, func1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * is FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:
     * 1. FUNCTOR is a fort which is directly asserted to be reifiable
     * 2. FUNCTOR is a reifiable-function-denoting naut,
     * i.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),
     * such that INNER-FUNCTOR denotes a reifiable function.
     */
    @LispMethod(comment = "is FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:\r\n1. FUNCTOR is a fort which is directly asserted to be reifiable\r\n2. FUNCTOR is a reifiable-function-denoting naut,\r\ni.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),\r\nsuch that INNER-FUNCTOR denotes a reifiable function.\nis FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:\n1. FUNCTOR is a fort which is directly asserted to be reifiable\n2. FUNCTOR is a reifiable-function-denoting naut,\ni.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),\nsuch that INNER-FUNCTOR denotes a reifiable function.")
    public static final SubLObject reifiable_functorP_alt(SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(functor)) || (NIL != term.first_order_nautP(functor))) && (NIL != fort_types_interface.isa_reifiable_functionP(functor, mt)));
    }

    @LispMethod(comment = "is FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:\r\n1. FUNCTOR is a fort which is directly asserted to be reifiable\r\n2. FUNCTOR is a reifiable-function-denoting naut,\r\ni.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),\r\nsuch that INNER-FUNCTOR denotes a reifiable function.\nis FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:\n1. FUNCTOR is a fort which is directly asserted to be reifiable\n2. FUNCTOR is a reifiable-function-denoting naut,\ni.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),\nsuch that INNER-FUNCTOR denotes a reifiable function.")
    public static SubLObject reifiable_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(functor)) || (NIL != term.first_order_nautP(functor))) && (NIL != fort_types_interface.isa_reifiable_functionP(functor, mt)));
    }

    public static final SubLObject reifiable_function_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != (NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread) ? ((SubLObject) (makeBoolean((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term))) || (NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_functorP(cycl_utilities.nat_functor(v_term), mt))))) : makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_functorP(cycl_utilities.nat_functor(v_term), mt)) && (NIL != term.closed_fn_termP(v_term))))));
        }
    }

    public static SubLObject reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != (NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread) ? makeBoolean((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term))) || (NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt))) : makeBoolean((NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt)) && (NIL != term.closed_fn_termP(v_term))))));
    }

    public static final SubLObject wf_reifiable_function_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_function_termP(v_term, mt)) && (NIL != wff.el_wftP(v_term, mt, UNPROVIDED)));
    }

    public static SubLObject wf_reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != reifiable_function_termP(v_term, mt)) && (NIL != wff.el_wftP(v_term, mt, UNPROVIDED)));
    }

    public static final SubLObject reifiable_termP_alt(SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_function_termP(v_term, UNPROVIDED))) || (NIL != term.skolem_termP(v_term)));
    }

    public static SubLObject reifiable_termP(final SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != reifiable_function_termP(v_term, UNPROVIDED))) || (NIL != term.skolem_termP(v_term)));
    }

    public static final SubLObject reifiable_nat_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL == constant_p(v_term)) && (NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_termP(v_term)));
    }

    public static SubLObject reifiable_nat_termP(final SubLObject v_term) {
        return makeBoolean((NIL == constant_p(v_term)) && (NIL != reifiable_termP(v_term)));
    }

    /**
     * returns T for terms that could be reified, but are not yet reified in the KB
     */
    @LispMethod(comment = "returns T for terms that could be reified, but are not yet reified in the KB")
    public static final SubLObject unreified_reifiable_nat_termP_alt(SubLObject v_term) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_nat_termP(v_term)) && (NIL == nart_handles.nart_p(v_term))) && (NIL == narts_high.find_nart(v_term)));
    }

    @LispMethod(comment = "returns T for terms that could be reified, but are not yet reified in the KB")
    public static SubLObject unreified_reifiable_nat_termP(final SubLObject v_term) {
        return makeBoolean(((NIL != reifiable_nat_termP(v_term)) && (NIL == nart_handles.nart_p(v_term))) && (NIL == narts_high.find_nart(v_term)));
    }

    public static final SubLObject reifiable_nautP_alt(SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym55$CYC_VAR_);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.closed_nautP(v_term, varP)) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.reifiable_function_termP(v_term, mt)) || (NIL != narts_high.find_nart(v_term)));
        }
        return NIL;
    }

    public static SubLObject reifiable_nautP(final SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym64$CYC_VAR_);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.closed_nautP(v_term, varP)) {
            return makeBoolean((NIL != reifiable_function_termP(v_term, mt)) || (NIL != narts_high.find_nart(v_term)));
        }
        return NIL;
    }

    public static final SubLObject fort_or_naut_with_corresponding_nartP_alt(SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) || (NIL != com.cyc.cycjava.cycl.czer_utilities.naut_with_corresponding_nartP(v_term)));
    }

    public static SubLObject fort_or_naut_with_corresponding_nartP(final SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) || (NIL != naut_with_corresponding_nartP(v_term)));
    }

    public static final SubLObject list_of_fort_or_naut_with_corresponding_nartP_alt(SubLObject obj) {
        return list_utilities.list_of_type_p($sym59$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, obj);
    }

    public static SubLObject list_of_fort_or_naut_with_corresponding_nartP(final SubLObject obj) {
        return list_utilities.list_of_type_p($sym68$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, obj);
    }

    /**
     *
     *
     * @return booleanp; t iff TERM is a naut which has
    an already-reified NART counterpart.
     */
    @LispMethod(comment = "@return booleanp; t iff TERM is a naut which has\r\nan already-reified NART counterpart.")
    public static final SubLObject naut_with_corresponding_nartP_alt(SubLObject v_term) {
        if (NIL != term.ground_nautP(v_term, symbol_function(VARIABLE_P))) {
            return list_utilities.sublisp_boolean(narts_high.find_nart(v_term));
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t iff TERM is a naut which has
    an already-reified NART counterpart.
     */
    @LispMethod(comment = "@return booleanp; t iff TERM is a naut which has\r\nan already-reified NART counterpart.")
    public static SubLObject naut_with_corresponding_nartP(final SubLObject v_term) {
        if (NIL != term.ground_nautP(v_term, symbol_function(VARIABLE_P))) {
            return list_utilities.sublisp_boolean(narts_high.find_nart(v_term));
        }
        return NIL;
    }

    public static final SubLObject evaluatable_function_symbolP_alt(SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(symbol)) && (NIL != fort_types_interface.evaluatable_function_p(symbol)));
    }

    public static SubLObject evaluatable_function_symbolP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(symbol)) && (NIL != fort_types_interface.evaluatable_function_p(symbol)));
    }

    public static final SubLObject evaluatable_function_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != com.cyc.cycjava.cycl.czer_utilities.evaluatable_function_symbolP(cycl_utilities.nat_functor(v_term), mt)));
    }

    public static SubLObject evaluatable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != evaluatable_function_symbolP(cycl_utilities.nat_functor(v_term), mt)));
    }

    /**
     * Transforms CNF (<neg-lits> <pos-lits>) into an #$or sentence of disjoined literals
     */
    @LispMethod(comment = "Transforms CNF (<neg-lits> <pos-lits>) into an #$or sentence of disjoined literals")
    public static final SubLObject unpackage_cnf_clause_alt(SubLObject cnf) {
        {
            SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE_ATOMIC), clauses.neg_lits(cnf));
            SubLObject pos_lits = clauses.pos_lits(cnf);
            return simplifier.disjoin(nunion(neg_lits, pos_lits, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
    }

    /**
     * Transforms CNF (<neg-lits> <pos-lits>) into an #$or sentence of disjoined literals
     */
    @LispMethod(comment = "Transforms CNF (<neg-lits> <pos-lits>) into an #$or sentence of disjoined literals")
    public static SubLObject unpackage_cnf_clause(final SubLObject cnf) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE_ATOMIC), clauses.neg_lits(cnf));
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        return simplifier.disjoin(nunion(neg_lits, pos_lits, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject unpackage_dnf_clause(final SubLObject dnf) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE_ATOMIC), clauses.neg_lits(dnf));
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        return simplifier.conjoin(nunion(neg_lits, pos_lits, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject equals_el_memoizedP_internal_alt(SubLObject object_1, SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(object_1, object_2, mt, clausal_form, T);
    }

    public static SubLObject equals_el_memoizedP_internal(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, T, T);
    }

    public static final SubLObject equals_el_memoizedP_alt(SubLObject object_1, SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.czer_utilities.equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym62$EQUALS_EL_MEMOIZED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym62$EQUALS_EL_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym62$EQUALS_EL_MEMOIZED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(object_1, object_2, mt, clausal_form);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (object_1.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (object_2.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && clausal_form.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_utilities.equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(object_1, object_2, mt, clausal_form));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject equals_el_memoizedP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$EQUALS_EL_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$EQUALS_EL_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym71$EQUALS_EL_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(object_1, object_2, mt, clausal_form);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (object_1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (object_2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && clausal_form.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(equals_el_memoizedP_internal(object_1, object_2, mt, clausal_form)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(object_1, object_2, mt, clausal_form));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject queries_equal_at_elP_alt(SubLObject query1, SubLObject query2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_utilities.equals_elP(query1, query2, mt, $DNF);
    }

    public static SubLObject queries_equal_at_elP(final SubLObject query1, final SubLObject query2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return equals_elP(query1, query2, mt, $DNF, UNPROVIDED);
    }

    public static SubLObject terms_equal_at_elP(final SubLObject term1, final SubLObject term2, SubLObject perform_equals_unification) {
        if (perform_equals_unification == UNPROVIDED) {
            perform_equals_unification = $perform_equals_unification$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
        try {
            $perform_equals_unification$.bind(perform_equals_unification, thread);
            result = makeBoolean((NIL != equals.equalsP(term1, term2, UNPROVIDED, UNPROVIDED)) || (NIL != equals.equalsP(cycl_utilities.hl_to_el(term1), cycl_utilities.hl_to_el(term2), UNPROVIDED, UNPROVIDED)));
        } finally {
            $perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param CLAUSAL-FORM
     * 		clausal-form-p; if OBJECT-1 and OBJECT-2 are sentences, this parameter
     * 		determines whether to canonicalize them as assertions or as queries -- whether to assume
     * 		universal or existential quantification for any free variables.
     */
    @LispMethod(comment = "@param CLAUSAL-FORM\r\n\t\tclausal-form-p; if OBJECT-1 and OBJECT-2 are sentences, this parameter\r\n\t\tdetermines whether to canonicalize them as assertions or as queries -- whether to assume\r\n\t\tuniversal or existential quantification for any free variables.")
    public static final SubLObject equals_elP(SubLObject object_1, SubLObject object_2, SubLObject mt, SubLObject clausal_form) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(object_1, object_2, mt, clausal_form, NIL);
    }

    public static SubLObject equals_elP(final SubLObject object_1, final SubLObject object_2, SubLObject mt, SubLObject clausal_form, SubLObject canonicalize_sentencesP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = $CNF;
        }
        if (canonicalize_sentencesP == UNPROVIDED) {
            canonicalize_sentencesP = T;
        }
        return equals_el_intP(object_1, object_2, mt, clausal_form, NIL, canonicalize_sentencesP);
    }

    /**
     *
     *
     * @param MEMOIZED-INTERNALS?
     * 		boolean; just because there's a memoization state around doesn't mean this should be called using memoized internals.
     * 		returns t iff OBJECT-1 and OBJECT-2 are deemed equal at the EL
     */
    @LispMethod(comment = "@param MEMOIZED-INTERNALS?\r\n\t\tboolean; just because there\'s a memoization state around doesn\'t mean this should be called using memoized internals.\r\n\t\treturns t iff OBJECT-1 and OBJECT-2 are deemed equal at the EL")
    public static final SubLObject equals_el_intP(SubLObject object_1, SubLObject object_2, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        SubLTrampolineFile.checkType(clausal_form, CLAUSAL_FORM_P);
        SubLTrampolineFile.checkType(memoized_internalsP, BOOLEANP);
        if (NIL != equalsP(object_1, object_2, UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            if (NIL != assertion_handles.assertion_p(object_1)) {
                if (NIL != assertion_handles.assertion_p(object_2)) {
                    return equalsP(uncanonicalizer.assertion_el_ist_formula(object_1), uncanonicalizer.assertion_el_ist_formula(object_2), UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != el_formula_p(object_2)) {
                        return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(uncanonicalizer.assertion_el_ist_formula(object_1), object_2, mt, clausal_form, memoized_internalsP);
                    }
                }
            } else {
                if (NIL != assertion_handles.assertion_p(object_2)) {
                    if (NIL != el_formula_p(object_1)) {
                        return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(object_1, uncanonicalizer.assertion_el_ist_formula(object_2), mt, clausal_form, memoized_internalsP);
                    }
                } else {
                    if (NIL != nart_handles.nart_p(object_1)) {
                        if (NIL != possibly_naut_p(object_2)) {
                            return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(narts_high.nart_hl_formula(object_1), object_2, mt, clausal_form, memoized_internalsP);
                        }
                    } else {
                        if ((NIL != nart_handles.nart_p(object_2)) && (NIL != possibly_naut_p(object_1))) {
                            return com.cyc.cycjava.cycl.czer_utilities.equals_el_intP(object_1, narts_high.nart_hl_formula(object_2), mt, clausal_form, memoized_internalsP);
                        } else {
                            if ((NIL != cycl_variables.cyc_varP(object_1)) && (NIL != cycl_variables.cyc_varP(object_2))) {
                                return T;
                            } else {
                                if ((NIL != el_formula_p(object_1)) && (NIL != el_formula_p(object_2))) {
                                    return com.cyc.cycjava.cycl.czer_utilities.el_expression_equalP(object_1, object_2, mt, clausal_form, memoized_internalsP);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject equals_el_intP(final SubLObject object_1, final SubLObject object_2, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP, final SubLObject canonicalize_sentencesP) {
        assert NIL != clause_utilities.clausal_form_p(clausal_form) : "! clause_utilities.clausal_form_p(clausal_form) " + ("clause_utilities.clausal_form_p(clausal_form) " + "CommonSymbols.NIL != clause_utilities.clausal_form_p(clausal_form) ") + clausal_form;
        assert NIL != booleanp(memoized_internalsP) : "! booleanp(memoized_internalsP) " + ("Types.booleanp(memoized_internalsP) " + "CommonSymbols.NIL != Types.booleanp(memoized_internalsP) ") + memoized_internalsP;
        if (NIL != equals.equalsP(object_1, object_2, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != assertion_handles.assertion_p(object_1)) {
            if (NIL != assertion_handles.assertion_p(object_2)) {
                return equals.equalsP(uncanonicalizer.assertion_el_ist_formula(object_1), uncanonicalizer.assertion_el_ist_formula(object_2), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != el_formula_p(object_2)) {
                return equals_el_intP(uncanonicalizer.assertion_el_ist_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
            }
        } else
            if (NIL != assertion_handles.assertion_p(object_2)) {
                if (NIL != el_formula_p(object_1)) {
                    return equals_el_intP(object_1, uncanonicalizer.assertion_el_ist_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                }
            } else
                if (NIL != nart_handles.nart_p(object_1)) {
                    if (NIL != possibly_naut_p(object_2)) {
                        return equals_el_intP(narts_high.nart_hl_formula(object_1), object_2, mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                    }
                } else {
                    if ((NIL != nart_handles.nart_p(object_2)) && (NIL != possibly_naut_p(object_1))) {
                        return equals_el_intP(object_1, narts_high.nart_hl_formula(object_2), mt, clausal_form, memoized_internalsP, canonicalize_sentencesP);
                    }
                    if ((NIL != cycl_variables.cyc_varP(object_1)) && (NIL != cycl_variables.cyc_varP(object_2))) {
                        return T;
                    }
                    if ((NIL != el_formula_p(object_1)) && (NIL != el_formula_p(object_2))) {
                        return NIL != canonicalize_sentencesP ? el_expression_equalP(object_1, object_2, mt, clausal_form, memoized_internalsP) : NIL;
                    }
                }


        return NIL;
    }

    /**
     *
     *
     * @param EXPR1
    el-formula-p
     * 		
     * @param EXPR2
    el-formula-p
     * 		
     * @param MT
    Microtheory
     * 		
     * @param MEMOIZED-INTERNALS?
    boolean
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param EXPR1\nel-formula-p\r\n\t\t\r\n@param EXPR2\nel-formula-p\r\n\t\t\r\n@param MT\nMicrotheory\r\n\t\t\r\n@param MEMOIZED-INTERNALS?\nboolean\r\n\t\t\r\n@return boolean")
    public static final SubLObject el_expression_equalP_alt(SubLObject expr1, SubLObject expr2, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = NIL;
        }
        if (memoized_internalsP == UNPROVIDED) {
            memoized_internalsP = NIL;
        }
        {
            SubLObject el_1 = com.cyc.cycjava.cycl.czer_utilities.canonicalize_for_equals_el(expr1, mt, clausal_form, memoized_internalsP);
            SubLObject el_2 = com.cyc.cycjava.cycl.czer_utilities.canonicalize_for_equals_el(expr2, mt, clausal_form, memoized_internalsP);
            if ((NIL != el_formula_p(el_1)) && (NIL != el_formula_p(el_2))) {
                return com.cyc.cycjava.cycl.czer_utilities.el_expression_equal_unification_successfulP(unification_utilities.unify_clauses(list_utilities.nmapcar(symbol_function(FIRST), el_1), list_utilities.nmapcar(symbol_function(FIRST), el_2), T, UNPROVIDED));
            } else {
                {
                    SubLObject term_1 = (NIL != memoized_internalsP) ? ((SubLObject) (czer_main.canonicalize_term_memoized(expr1, mt))) : czer_main.canonicalize_term(expr1, mt);
                    SubLObject term_2 = (NIL != memoized_internalsP) ? ((SubLObject) (czer_main.canonicalize_term_memoized(expr2, mt))) : czer_main.canonicalize_term(expr2, mt);
                    return equalsP(term_1, term_2, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    /**
     *
     *
     * @param EXPR1
    el-formula-p
     * 		
     * @param EXPR2
    el-formula-p
     * 		
     * @param MT
    Microtheory
     * 		
     * @param MEMOIZED-INTERNALS?
    boolean
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param EXPR1\nel-formula-p\r\n\t\t\r\n@param EXPR2\nel-formula-p\r\n\t\t\r\n@param MT\nMicrotheory\r\n\t\t\r\n@param MEMOIZED-INTERNALS?\nboolean\r\n\t\t\r\n@return boolean")
    public static SubLObject el_expression_equalP(final SubLObject expr1, final SubLObject expr2, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (clausal_form == UNPROVIDED) {
            clausal_form = NIL;
        }
        if (memoized_internalsP == UNPROVIDED) {
            memoized_internalsP = NIL;
        }
        final SubLObject el_1 = canonicalize_for_equals_el(expr1, mt, clausal_form, memoized_internalsP);
        final SubLObject el_2 = canonicalize_for_equals_el(expr2, mt, clausal_form, memoized_internalsP);
        if ((NIL != el_formula_p(el_1)) && (NIL != el_formula_p(el_2))) {
            return el_expression_equal_unification_successfulP(unification_utilities.unify_clauses(list_utilities.nmapcar(symbol_function(FIRST), el_1), list_utilities.nmapcar(symbol_function(FIRST), el_2), T, UNPROVIDED));
        }
        final SubLObject term_1 = (NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr1, mt) : czer_main.canonicalize_term(expr1, mt);
        final SubLObject term_2 = (NIL != memoized_internalsP) ? czer_main.canonicalize_term_memoized(expr2, mt) : czer_main.canonicalize_term(expr2, mt);
        return equals.equalsP(term_1, term_2, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject canonicalize_for_equals_el_alt(SubLObject expression, SubLObject mt, SubLObject clausal_form, SubLObject memoized_internalsP) {
        {
            SubLObject pcase_var = clausal_form;
            if (pcase_var.eql($CNF)) {
                if (NIL != memoized_internalsP) {
                    return czer_main.canonicalize_wf_cycl_memoized(expression, mt);
                } else {
                    return czer_main.canonicalize_wf_cycl(expression, mt);
                }
            } else {
                if (pcase_var.eql($DNF)) {
                    if (NIL != memoized_internalsP) {
                        return czer_main.canonicalize_ask_memoized(expression, mt);
                    } else {
                        return czer_main.canonicalize_ask(expression, mt);
                    }
                } else {
                    return Errors.error($str_alt67$Unexpected_clausal_form__s, clausal_form);
                }
            }
        }
    }

    public static SubLObject canonicalize_for_equals_el(final SubLObject expression, final SubLObject mt, final SubLObject clausal_form, final SubLObject memoized_internalsP) {
        if (clausal_form.eql($CNF)) {
            if (NIL != memoized_internalsP) {
                return czer_main.canonicalize_wf_cycl_memoized(expression, mt);
            }
            return czer_main.canonicalize_wf_cycl(expression, mt);
        } else {
            if (!clausal_form.eql($DNF)) {
                return Errors.error($str76$Unexpected_clausal_form__s, clausal_form);
            }
            if (NIL != memoized_internalsP) {
                return czer_main.canonicalize_ask_memoized(expression, mt);
            }
            return czer_main.canonicalize_ask(expression, mt);
        }
    }

    public static final SubLObject el_expression_equal_unification_successfulP_alt(SubLObject unification_result) {
        if ((NIL != list_utilities.singletonP(unification_result)) && (NIL != bindings.unification_success_token_p(unification_result.first()))) {
            return T;
        } else {
            if (NIL == unification_result) {
                return NIL;
            } else {
                if (NIL == list_utilities.tree_find_if($sym68$NON_NULL_CLOSED_TERM_, unification_result, UNPROVIDED)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject el_expression_equal_unification_successfulP(final SubLObject unification_result) {
        if ((NIL != list_utilities.singletonP(unification_result)) && (NIL != bindings.unification_success_token_p(unification_result.first()))) {
            return T;
        }
        if (NIL == unification_result) {
            return NIL;
        }
        if (NIL == list_utilities.tree_find_if($sym77$NON_NULL_CLOSED_TERM_, unification_result, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject problem_queries_equal_modulo_el_var_names(final SubLObject problem_query_1, final SubLObject problem_query_2) {
        return equal_modulo_el_var_names_int(problem_query_1, problem_query_2, T);
    }

    public static SubLObject equal_modulo_el_var_names(final SubLObject object_1, final SubLObject object_2) {
        return equal_modulo_el_var_names_int(object_1, object_2, NIL);
    }

    public static SubLObject equal_modulo_el_var_names_int(SubLObject object_1, SubLObject object_2, final SubLObject problem_queriesP) {
        if (object_1.equal(object_2)) {
            return T;
        }
        if (NIL == list_utilities.tree_find_if($sym78$EL_VAR_, object_1, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == list_utilities.tree_find_if($sym78$EL_VAR_, object_2, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject opaque_object_1 = transform_list_utilities.transform(object_1, $sym78$EL_VAR_, EL_VARIABLE_TOKEN, UNPROVIDED);
        final SubLObject opaque_object_2 = transform_list_utilities.transform(object_2, $sym78$EL_VAR_, EL_VARIABLE_TOKEN, UNPROVIDED);
        if (opaque_object_1.equal(opaque_object_2)) {
            if (NIL != problem_queriesP) {
                object_1 = inference_czer.problem_query_el_formula(object_1);
                object_2 = inference_czer.problem_query_el_formula(object_2);
            }
            return equals_elP(object_1, object_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject el_variable_token(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return $OPAQUIFIED_EL_VARIABLE;
    }

    public static final SubLObject non_null_closed_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject non_null_closed_termP(final SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    /**
     * Delete things that are deemed duplicates at the EL, preferring to keep indexed terms over their EL counterparts.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Delete things that are deemed duplicates at the EL, preferring to keep indexed terms over their EL counterparts.\r\n\r\n@unknown bgottesm")
    public static final SubLObject delete_el_duplicates_alt(SubLObject list_of_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(list_of_terms, NON_DOTTED_LIST_P);
            {
                SubLObject result = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt70$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = list_of_terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                        if (NIL != cycl_utilities.reified_term_p(v_term)) {
                                            result = delete(v_term, result, $sym62$EQUALS_EL_MEMOIZED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            result = cons(v_term, result);
                                        } else {
                                            {
                                                SubLObject item_var = v_term;
                                                if (NIL == member(item_var, result, $sym62$EQUALS_EL_MEMOIZED_, symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    @LispMethod(comment = "Delete things that are deemed duplicates at the EL, preferring to keep indexed terms over their EL counterparts.\r\n\r\n@unknown bgottesm")
    public static SubLObject delete_el_duplicates(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(list_of_terms) : "! list_utilities.non_dotted_list_p(list_of_terms) " + ("list_utilities.non_dotted_list_p(list_of_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_of_terms) ") + list_of_terms;
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = list_of_terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.reified_term_p(v_term)) {
                        result = delete(v_term, result, $sym71$EQUALS_EL_MEMOIZED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        result = cons(v_term, result);
                    } else {
                        final SubLObject item_var = v_term;
                        if (NIL == member(item_var, result, $sym71$EQUALS_EL_MEMOIZED_, symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering.")
    public static final SubLObject cnfs_reorder_equalP_alt(SubLObject cnf1, SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf1), varP), UNPROVIDED).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf2), varP), UNPROVIDED).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering.")
    public static SubLObject cnfs_reorder_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf1), varP), UNPROVIDED).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(czer_main.canonicalize_clause_commutative_terms(cnf2), varP), UNPROVIDED).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal reordering.")
    public static final SubLObject cnfs_reorder_literals_equalP_alt(SubLObject cnf1, SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf1, varP), varP).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf2, varP), varP).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal reordering.")
    public static SubLObject cnfs_reorder_literals_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf1, varP), varP).first(), czer_main.rename_clause_vars(czer_main.sort_clause_literals(cnf2, varP), varP).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical term reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical term reordering.")
    public static final SubLObject cnfs_reorder_terms_equalP_alt(SubLObject cnf1, SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf1), varP).first(), czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf2), varP).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical term reordering.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical term reordering.")
    public static SubLObject cnfs_reorder_terms_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf1), varP).first(), czer_main.rename_clause_vars(czer_main.canonicalize_clause_commutative_terms(cnf2), varP).first());
    }

    public static final SubLObject ordered_cnf_unifyP_alt(SubLObject cnf1, SubLObject cnf2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.ordered_literals_unify(clauses.neg_lits(cnf1), clauses.neg_lits(cnf2))) && (NIL != com.cyc.cycjava.cycl.czer_utilities.ordered_literals_unify(clauses.pos_lits(cnf1), clauses.pos_lits(cnf2))));
    }

    public static SubLObject ordered_cnf_unifyP(final SubLObject cnf1, final SubLObject cnf2) {
        return makeBoolean((NIL != ordered_literals_unify(clauses.neg_lits(cnf1), clauses.neg_lits(cnf2))) && (NIL != ordered_literals_unify(clauses.pos_lits(cnf1), clauses.pos_lits(cnf2))));
    }

    public static final SubLObject ordered_literals_unify_alt(SubLObject literals1, SubLObject literals2) {
        return makeBoolean((length(literals1).numE(length(literals2)) && (NIL != com.cyc.cycjava.cycl.czer_utilities.ordered_literals_unify_int(literals1, literals2))) && (NIL != com.cyc.cycjava.cycl.czer_utilities.ordered_literals_unify_int(literals2, literals1)));
    }

    public static SubLObject ordered_literals_unify(final SubLObject literals1, final SubLObject literals2) {
        return makeBoolean((length(literals1).numE(length(literals2)) && (NIL != ordered_literals_unify_int(literals1, literals2))) && (NIL != ordered_literals_unify_int(literals2, literals1)));
    }

    public static final SubLObject ordered_literals_unify_int_alt(SubLObject literals1, SubLObject literals2) {
        {
            SubLObject failsP = NIL;
            SubLObject lits1 = NIL;
            SubLObject lits2 = NIL;
            SubLObject lit1 = NIL;
            SubLObject lit2 = NIL;
            for (lits1 = literals1, lits2 = literals2, lit1 = lits1.first(), lit2 = lits2.first(); !(((NIL != failsP) || (NIL == lit1)) || (NIL == lit2)); lits1 = lits1.rest() , lits2 = lits2.rest() , lit1 = lits1.first() , lit2 = lits2.first()) {
                failsP = makeBoolean(NIL == unification_utilities.asent_unify(lit1, lit2, UNPROVIDED, UNPROVIDED));
            }
            return makeBoolean(NIL == failsP);
        }
    }

    public static SubLObject ordered_literals_unify_int(final SubLObject literals1, final SubLObject literals2) {
        SubLObject failsP;
        SubLObject lits1;
        SubLObject lits2;
        SubLObject lit1;
        SubLObject lit2;
        for (failsP = NIL, lits1 = NIL, lits2 = NIL, lit1 = NIL, lit2 = NIL, lits1 = literals1, lits2 = literals2, lit1 = lits1.first(), lit2 = lits2.first(); ((NIL == failsP) && (NIL != lit1)) && (NIL != lit2); failsP = makeBoolean(NIL == unification_utilities.asent_unify(lit1, lit2, UNPROVIDED, UNPROVIDED)) , lits1 = lits1.rest() , lits2 = lits2.rest() , lit1 = lits1.first() , lit2 = lits2.first()) {
        }
        return makeBoolean(NIL == failsP);
    }

    /**
     * Return the nart implementing NAUT if it exists.
     */
    @LispMethod(comment = "Return the nart implementing NAUT if it exists.")
    public static final SubLObject el_find_nart_alt(SubLObject naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nat = czer_main.canonicalize_fn_term_int(naut, T, NIL, UNPROVIDED);
                if (NIL != nart_handles.nart_p(nat)) {
                    return nat;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.czer_utilities.robust_nart_lookupP()) {
                        {
                            SubLObject _prev_bind_0 = $nat_matching_predicate$.currentBinding(thread);
                            try {
                                $nat_matching_predicate$.bind($sym71$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_, thread);
                                nat = narts_high.find_nart(nat);
                            } finally {
                                $nat_matching_predicate$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return nat;
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return the nart implementing NAUT if it exists.")
    public static SubLObject el_find_nart(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = czer_main.canonicalize_fn_term_int(naut, T, NIL, UNPROVIDED);
        if (NIL != nart_handles.nart_p(nat)) {
            return nat;
        }
        if (NIL != robust_nart_lookupP()) {
            final SubLObject _prev_bind_0 = $nat_matching_predicate$.currentBinding(thread);
            try {
                $nat_matching_predicate$.bind($sym82$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_, thread);
                nat = narts_high.find_nart(nat);
            } finally {
                $nat_matching_predicate$.rebind(_prev_bind_0, thread);
            }
            return nat;
        }
        return NIL;
    }/**
     * Return the nart implementing NAUT if it exists.
     */


    /**
     * If OBJECT is a naut, return the nart implementing OBJECT if it exists.
     * Otherwise return NIL.
     *
     * @return nart-p or nil
     */
    @LispMethod(comment = "If OBJECT is a naut, return the nart implementing OBJECT if it exists.\r\nOtherwise return NIL.\r\n\r\n@return nart-p or nil\nIf OBJECT is a naut, return the nart implementing OBJECT if it exists.\nOtherwise return NIL.")
    public static final SubLObject el_find_if_nart_alt(SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            {
                SubLObject nart = com.cyc.cycjava.cycl.czer_utilities.el_find_nart(v_object);
                if (NIL != nart_handles.nart_p(nart)) {
                    return nart;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "If OBJECT is a naut, return the nart implementing OBJECT if it exists.\r\nOtherwise return NIL.\r\n\r\n@return nart-p or nil\nIf OBJECT is a naut, return the nart implementing OBJECT if it exists.\nOtherwise return NIL.")
    public static SubLObject el_find_if_nart(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject nart = el_find_nart(v_object);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return NIL;
    }/**
     * If OBJECT is a naut, return the nart implementing OBJECT if it exists.
     * Otherwise return NIL.
     *
     * @return nart-p or nil
     */


    /**
     * returns t iff the recanonicalized version of CANDIDATE-NAT equals TARGET-NAT.
     */
    @LispMethod(comment = "returns t iff the recanonicalized version of CANDIDATE-NAT equals TARGET-NAT.")
    public static final SubLObject recanonicalized_candidate_nat_equals_nat_formulaP_alt(SubLObject candidate_nat, SubLObject target_nat) {
        return equal(com.cyc.cycjava.cycl.czer_utilities.recanonicalize_candidate_nat(candidate_nat), target_nat);
    }

    @LispMethod(comment = "returns t iff the recanonicalized version of CANDIDATE-NAT equals TARGET-NAT.")
    public static SubLObject recanonicalized_candidate_nat_equals_nat_formulaP(final SubLObject candidate_nat, final SubLObject target_nat) {
        return equal(recanonicalize_candidate_nat(candidate_nat), target_nat);
    }/**
     * returns t iff the recanonicalized version of CANDIDATE-NAT equals TARGET-NAT.
     */


    public static final SubLObject recanonicalize_candidate_nat_alt(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)) {
                return nat;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$recanonicalizing_candidate_natP$.currentBinding(thread);
                    try {
                        czer_vars.$recanonicalizing_candidate_natP$.bind(T, thread);
                        result = czer_main.canonicalize_term(nat, UNPROVIDED);
                    } finally {
                        czer_vars.$recanonicalizing_candidate_natP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != nart_handles.nart_p(result)) {
                    return narts_high.nart_hl_formula(result);
                } else {
                    return result;
                }
            }
        }
    }

    public static SubLObject recanonicalize_candidate_nat(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)) {
            return nat;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$recanonicalizing_candidate_natP$.currentBinding(thread);
        try {
            czer_vars.$recanonicalizing_candidate_natP$.bind(T, thread);
            result = czer_main.canonicalize_term(nat, UNPROVIDED);
        } finally {
            czer_vars.$recanonicalizing_candidate_natP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != nart_handles.nart_p(result)) {
            return narts_high.nart_hl_formula(result);
        }
        return result;
    }

    /**
     * returns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).
     * This can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.
     * If it's set to :default, it used to be t iff we're in the canonicalizer, the wff-checker, or the recanonicalizer,
     * but now (after Nov 2002) the default is nil.  It's too inefficient to try this by default; the problem should be
     * solved at its root by recanonicalizing the uncanonical narts.
     */
    @LispMethod(comment = "returns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).\r\nThis can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.\r\nIf it\'s set to :default, it used to be t iff we\'re in the canonicalizer, the wff-checker, or the recanonicalizer,\r\nbut now (after Nov 2002) the default is nil.  It\'s too inefficient to try this by default; the problem should be\r\nsolved at its root by recanonicalizing the uncanonical narts.\nreturns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).\nThis can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.\nIf it\'s set to :default, it used to be t iff we\'re in the canonicalizer, the wff-checker, or the recanonicalizer,\nbut now (after Nov 2002) the default is nil.  It\'s too inefficient to try this by default; the problem should be\nsolved at its root by recanonicalizing the uncanonical narts.")
    public static final SubLObject robust_nart_lookupP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($DEFAULT == czer_vars.$robust_nart_lookup$.getDynamicValue(thread)) {
                return NIL;
            } else {
                return czer_vars.$robust_nart_lookup$.getDynamicValue(thread);
            }
        }
    }

    @LispMethod(comment = "returns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).\r\nThis can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.\r\nIf it\'s set to :default, it used to be t iff we\'re in the canonicalizer, the wff-checker, or the recanonicalizer,\r\nbut now (after Nov 2002) the default is nil.  It\'s too inefficient to try this by default; the problem should be\r\nsolved at its root by recanonicalizing the uncanonical narts.\nreturns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).\nThis can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.\nIf it\'s set to :default, it used to be t iff we\'re in the canonicalizer, the wff-checker, or the recanonicalizer,\nbut now (after Nov 2002) the default is nil.  It\'s too inefficient to try this by default; the problem should be\nsolved at its root by recanonicalizing the uncanonical narts.")
    public static SubLObject robust_nart_lookupP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == czer_vars.$robust_nart_lookup$.getDynamicValue(thread)) {
            return NIL;
        }
        return czer_vars.$robust_nart_lookup$.getDynamicValue(thread);
    }/**
     * returns t iff we want to look up narts robustly (by recanonicalization of narts already existing in the KB).
     * This can be set to t or nil by the global variable *robust-nart-lookup*, but can also be set to :default.
     * If it's set to :default, it used to be t iff we're in the canonicalizer, the wff-checker, or the recanonicalizer,
     * but now (after Nov 2002) the default is nil.  It's too inefficient to try this by default; the problem should be
     * solved at its root by recanonicalizing the uncanonical narts.
     */


    /**
     * Sorts FORTS such that the sort will remain stable across images.
     */
    @LispMethod(comment = "Sorts FORTS such that the sort will remain stable across images.")
    public static final SubLObject sort_forts_external_alt(SubLObject v_forts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = v_forts;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$new_canonicalizerP$.currentBinding(thread);
                    try {
                        czer_vars.$new_canonicalizerP$.bind(T, thread);
                        result = cycl_utilities.formula_args(czer_main.canonicalize_term(bq_cons($$TheSet, append(v_forts, NIL)), UNPROVIDED), UNPROVIDED);
                    } finally {
                        czer_vars.$new_canonicalizerP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Sorts FORTS such that the sort will remain stable across images.")
    public static SubLObject sort_forts_external(final SubLObject v_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(v_forts) : "! list_utilities.non_dotted_list_p(v_forts) " + ("list_utilities.non_dotted_list_p(v_forts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_forts) ") + v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$new_canonicalizerP$.currentBinding(thread);
        try {
            czer_vars.$new_canonicalizerP$.bind(T, thread);
            result = cycl_utilities.formula_args(czer_main.canonicalize_term(bq_cons($$TheSet, append(v_forts, NIL)), UNPROVIDED), UNPROVIDED);
        } finally {
            czer_vars.$new_canonicalizerP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Sorts FORTS such that the sort will remain stable across images.
     */


    /**
     * moves #$isa, #$quotedIsa, #$resultIsa, #$genls, and #$resultGenl literals to front of LITERALS
     */
    @LispMethod(comment = "moves #$isa, #$quotedIsa, #$resultIsa, #$genls, and #$resultGenl literals to front of LITERALS")
    public static final SubLObject definitional_lits_to_front_alt(SubLObject literals) {
        {
            SubLObject isa_lits = NIL;
            SubLObject genls_lits = NIL;
            SubLObject rest = NIL;
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if (NIL != isa_litP(lit)) {
                    isa_lits = cons(lit, isa_lits);
                } else {
                    if (NIL != quoted_isa_litP(lit)) {
                        isa_lits = cons(lit, isa_lits);
                    } else {
                        if (NIL != result_isa_litP(lit)) {
                            isa_lits = cons(lit, isa_lits);
                        } else {
                            if (NIL != genls_litP(lit)) {
                                genls_lits = cons(lit, genls_lits);
                            } else {
                                if (NIL != result_genl_litP(lit)) {
                                    genls_lits = cons(lit, genls_lits);
                                } else {
                                    rest = cons(lit, rest);
                                }
                            }
                        }
                    }
                }
            }
            return nconc(nreverse(isa_lits), nreverse(genls_lits), nreverse(rest));
        }
    }

    @LispMethod(comment = "moves #$isa, #$quotedIsa, #$resultIsa, #$genls, and #$resultGenl literals to front of LITERALS")
    public static SubLObject definitional_lits_to_front(final SubLObject literals) {
        SubLObject isa_lits = NIL;
        SubLObject genls_lits = NIL;
        SubLObject rest = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa_litP(lit)) {
                isa_lits = cons(lit, isa_lits);
            } else
                if (NIL != quoted_isa_litP(lit)) {
                    isa_lits = cons(lit, isa_lits);
                } else
                    if (NIL != result_isa_litP(lit)) {
                        isa_lits = cons(lit, isa_lits);
                    } else
                        if (NIL != genls_litP(lit)) {
                            genls_lits = cons(lit, genls_lits);
                        } else
                            if (NIL != result_genl_litP(lit)) {
                                genls_lits = cons(lit, genls_lits);
                            } else {
                                rest = cons(lit, rest);
                            }




            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nconc(nreverse(isa_lits), nreverse(genls_lits), nreverse(rest));
    }/**
     * moves #$isa, #$quotedIsa, #$resultIsa, #$genls, and #$resultGenl literals to front of LITERALS
     */


    public static final SubLObject evaluatable_expressions_out_alt(SubLObject formula) {
        return quiescent_transform(formula, $sym74$EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject evaluatable_expressions_out(final SubLObject formula) {
        return transform_list_utilities.quiescent_transform(formula, $sym85$EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return 0 sentence; SENTENCE, with any outermost #$ists stripped.
     * @return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which
    case the innermost mt specified by #$ist is returned, and MT is ignored.
    Yields an error if the mt is not specified in either of these two ways.
     */
    @LispMethod(comment = "@return 0 sentence; SENTENCE, with any outermost #$ists stripped.\r\n@return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which\r\ncase the innermost mt specified by #$ist is returned, and MT is ignored.\r\nYields an error if the mt is not specified in either of these two ways.")
    public static final SubLObject unwrap_if_ist(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_int(sentence, mt, T);
    }

    public static SubLObject unwrap_if_ist(final SubLObject sentence, final SubLObject mt, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        return unwrap_if_ist_int(sentence, mt, T, T, allow_spec_predsP);
    }

    /**
     * Like @xref unwrap-if-ist except doesn't error if no mt is specified.
     */
    @LispMethod(comment = "Like @xref unwrap-if-ist except doesn\'t error if no mt is specified.")
    public static final SubLObject unwrap_if_ist_permissive_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_int(sentence, mt, NIL);
    }

    @LispMethod(comment = "Like @xref unwrap-if-ist except doesn\'t error if no mt is specified.")
    public static SubLObject unwrap_if_ist_permissive(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_int(sentence, mt, NIL, T, UNPROVIDED);
    }/**
     * Like @xref unwrap-if-ist except doesn't error if no mt is specified.
     */


    public static SubLObject unwrap_if_ist_discard_mt(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return values(unwrap_if_ist_int(sentence, mt, NIL, NIL, UNPROVIDED));
    }

    /**
     * Like @xref unwrap-if-ist except canonicalizes the returned mt
     * if it's different from MT.
     */
    @LispMethod(comment = "Like @xref unwrap-if-ist except canonicalizes the returned mt\r\nif it\'s different from MT.\nLike @xref unwrap-if-ist except canonicalizes the returned mt\nif it\'s different from MT.")
    public static final SubLObject unwrap_if_ist_canonical_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_canonical_int(sentence, mt, T);
    }

    @LispMethod(comment = "Like @xref unwrap-if-ist except canonicalizes the returned mt\r\nif it\'s different from MT.\nLike @xref unwrap-if-ist except canonicalizes the returned mt\nif it\'s different from MT.")
    public static SubLObject unwrap_if_ist_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, T, T);
    }/**
     * Like @xref unwrap-if-ist except canonicalizes the returned mt
     * if it's different from MT.
     */


    /**
     * Like @xref unwrap-if-ist-permissive except canonicalizes the returned mt
     * if it's different from MT.
     */
    @LispMethod(comment = "Like @xref unwrap-if-ist-permissive except canonicalizes the returned mt\r\nif it\'s different from MT.\nLike @xref unwrap-if-ist-permissive except canonicalizes the returned mt\nif it\'s different from MT.")
    public static final SubLObject unwrap_if_ist_permissive_canonical_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_canonical_int(sentence, mt, NIL);
    }

    @LispMethod(comment = "Like @xref unwrap-if-ist-permissive except canonicalizes the returned mt\r\nif it\'s different from MT.\nLike @xref unwrap-if-ist-permissive except canonicalizes the returned mt\nif it\'s different from MT.")
    public static SubLObject unwrap_if_ist_permissive_canonical(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return unwrap_if_ist_canonical_int(sentence, mt, NIL, T);
    }/**
     * Like @xref unwrap-if-ist-permissive except canonicalizes the returned mt
     * if it's different from MT.
     */


    public static final SubLObject unwrap_if_ist_canonical_int(SubLObject sentence, SubLObject mt, SubLObject errorP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_mt = mt;
                thread.resetMultipleValues();
                {
                    SubLObject sentence_15 = com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_int(sentence, mt, errorP);
                    SubLObject mt_16 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence = sentence_15;
                    mt = mt_16;
                }
                if (NIL == hlmt_equal(original_mt, mt)) {
                    mt = czer_main.canonicalize_mt(mt);
                }
            }
            return values(sentence, mt);
        }
    }

    public static SubLObject unwrap_if_ist_canonical_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_mt = mt;
        thread.resetMultipleValues();
        final SubLObject sentence_$15 = unwrap_if_ist_int(sentence, mt, errorP, require_closed_mtP, UNPROVIDED);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$15;
        mt = mt_$16;
        if (NIL == hlmt.hlmt_equal(original_mt, mt)) {
            mt = czer_main.canonicalize_mt(mt);
        }
        return subl_promotions.values2(sentence, mt);
    }

    public static final SubLObject unwrap_if_ist_int(SubLObject sentence, SubLObject mt, SubLObject errorP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence_17 = com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_recursive(sentence, mt);
                SubLObject mt_18 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sentence = sentence_17;
                mt = mt_18;
            }
            if (NIL != errorP) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == mt) {
                        Errors.error($str_alt76$_s__s_does_not_adequately_specify, sentence, mt);
                    }
                }
            }
            return values(sentence, mt);
        }
    }

    public static SubLObject unwrap_if_ist_int(SubLObject sentence, SubLObject mt, final SubLObject errorP, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$17 = unwrap_if_ist_recursive(sentence, mt, require_closed_mtP, allow_spec_predsP);
        final SubLObject mt_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$17;
        mt = mt_$18;
        if (((NIL != errorP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == mt)) {
            Errors.error($str87$_s__s_does_not_adequately_specify, sentence, mt);
        }
        return subl_promotions.values2(sentence, mt);
    }

    /**
     *
     *
     * @return 0 sentence; SENTENCE, with any outermost #$ists stripped.
     * @return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which
    case the innermost mt specified by #$ist is returned, and MT is ignored.
    Yields an error if the mt is not specified in either of these two ways.
     */
    @LispMethod(comment = "@return 0 sentence; SENTENCE, with any outermost #$ists stripped.\r\n@return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which\r\ncase the innermost mt specified by #$ist is returned, and MT is ignored.\r\nYields an error if the mt is not specified in either of these two ways.")
    public static final SubLObject unwrap_if_ist_recursive(SubLObject sentence, SubLObject mt) {
        if ((NIL != ist_sentence_p(sentence)) && (NIL != closed_possibly_hlmt_p(cycl_utilities.sentence_arg1(sentence, UNPROVIDED)))) {
            return com.cyc.cycjava.cycl.czer_utilities.unwrap_if_ist_recursive(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
        } else {
            return values(sentence, mt);
        }
    }

    public static SubLObject unwrap_if_ist_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject require_closed_mtP, SubLObject allow_spec_predsP) {
        if (allow_spec_predsP == UNPROVIDED) {
            allow_spec_predsP = NIL;
        }
        if (((NIL != ist_sentence_p(sentence, allow_spec_predsP)) && ((NIL == require_closed_mtP) || (NIL != hlmt.closed_possibly_hlmt_p(cycl_utilities.sentence_arg1(sentence, UNPROVIDED))))) && (NIL == kb_utilities.kbeq($$ist_Asserted, cycl_utilities.atomic_sentence_predicate(sentence)))) {
            return unwrap_if_ist_recursive(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), cycl_utilities.sentence_arg1(sentence, UNPROVIDED), require_closed_mtP, UNPROVIDED);
        }
        return subl_promotions.values2(sentence, mt);
    }

    public static final SubLObject possibly_quoted_cycl_formula_p_alt(SubLObject v_object) {
        return cycl_grammar.cycl_formula_p(com.cyc.cycjava.cycl.czer_utilities.unwrap_quotes(v_object));
    }

    public static SubLObject possibly_quoted_cycl_formula_p(final SubLObject v_object) {
        return cycl_grammar.cycl_formula_p(unwrap_quotes(v_object));
    }

    /**
     * Unquotes EXPRESSION as many times as is necessary to get at the first non-quoted embedded expression.
     *
     * @unknown this operation has very strange and possibly inconsistent semantics.  Only use this for syntactic operations.
     */
    @LispMethod(comment = "Unquotes EXPRESSION as many times as is necessary to get at the first non-quoted embedded expression.\r\n\r\n@unknown this operation has very strange and possibly inconsistent semantics.  Only use this for syntactic operations.")
    public static final SubLObject unwrap_quotes_alt(SubLObject expression) {
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            return com.cyc.cycjava.cycl.czer_utilities.unwrap_quotes(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        } else {
            return expression;
        }
    }

    @LispMethod(comment = "Unquotes EXPRESSION as many times as is necessary to get at the first non-quoted embedded expression.\r\n\r\n@unknown this operation has very strange and possibly inconsistent semantics.  Only use this for syntactic operations.")
    public static SubLObject unwrap_quotes(final SubLObject expression) {
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            return unwrap_quotes(cycl_utilities.formula_arg1(expression, UNPROVIDED));
        }
        return expression;
    }/**
     * Unquotes EXPRESSION as many times as is necessary to get at the first non-quoted embedded expression.
     *
     * @unknown this operation has very strange and possibly inconsistent semantics.  Only use this for syntactic operations.
     */


    public static final SubLObject quoted_term_with_hl_varP_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.fast_quote_term_p(v_object)) && (NIL != cycl_utilities.expression_find_if(symbol_function($sym77$HL_VAR_), v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject quoted_term_with_hl_varP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.fast_quote_term_p(v_object)) && (NIL != cycl_utilities.expression_find_if(symbol_function($sym89$HL_VAR_), v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject escape_term_alt(SubLObject v_term) {
        return NIL != cycl_grammar.fast_escape_quote_term_p(v_term) ? ((SubLObject) (v_term)) : make_unary_formula($$EscapeQuote, v_term);
    }

    public static SubLObject escape_term(final SubLObject v_term) {
        return NIL != cycl_grammar.fast_escape_quote_term_p(v_term) ? v_term : make_unary_formula($$EscapeQuote, v_term);
    }

    public static final SubLObject possibly_escape_quote_hl_vars_alt(SubLObject v_object, SubLObject destructiveP) {
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (NIL == cycl_utilities.expression_find_if($sym79$QUOTED_TERM_WITH_HL_VAR_, v_object, UNPROVIDED, UNPROVIDED)) {
            return v_object;
        } else {
            if (NIL != destructiveP) {
                return com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(v_object);
            } else {
                return com.cyc.cycjava.cycl.czer_utilities.escape_quote_hl_vars(v_object);
            }
        }
    }

    public static SubLObject possibly_escape_quote_hl_vars(final SubLObject v_object, SubLObject destructiveP) {
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (NIL == cycl_utilities.expression_find_if($sym91$QUOTED_TERM_WITH_HL_VAR_, v_object, UNPROVIDED, UNPROVIDED)) {
            return v_object;
        }
        if (NIL != destructiveP) {
            return nescape_quote_hl_vars(v_object);
        }
        return escape_quote_hl_vars(v_object);
    }

    public static final SubLObject escape_quote_hl_vars_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(copy_tree(v_object));
    }

    public static SubLObject escape_quote_hl_vars(final SubLObject v_object) {
        return nescape_quote_hl_vars(copy_tree(v_object));
    }

    public static final SubLObject nescape_quote_hl_vars_alt(SubLObject v_object) {
        if (NIL != cycl_grammar.fast_quote_term_p(v_object)) {
            return list_utilities.tree_ntransform_if(v_object, $sym77$HL_VAR_, ESCAPE_TERM, UNPROVIDED);
        } else {
            if (v_object.isCons()) {
                return rplacd(rplaca(v_object, com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(v_object.first())), com.cyc.cycjava.cycl.czer_utilities.nescape_quote_hl_vars(v_object.rest()));
            } else {
                return v_object;
            }
        }
    }

    public static SubLObject nescape_quote_hl_vars(final SubLObject v_object) {
        if (NIL != cycl_grammar.fast_quote_term_p(v_object)) {
            return list_utilities.tree_ntransform_if(v_object, $sym89$HL_VAR_, ESCAPE_TERM, UNPROVIDED);
        }
        if (v_object.isCons()) {
            return rplacd(rplaca(v_object, nescape_quote_hl_vars(v_object.first())), NIL != list_utilities.non_dotted_list_p(v_object) ? list_utilities.nmapcar(NESCAPE_QUOTE_HL_VARS, v_object.rest()) : nescape_quote_hl_vars(v_object.rest()));
        }
        return v_object;
    }

    public static final SubLObject decontextualized_clausesP_alt(SubLObject v_clauses) {
        return list_utilities.every_in_list($sym81$DECONTEXTUALIZED_CLAUSE_, v_clauses, UNPROVIDED);
    }

    public static SubLObject decontextualized_clausesP(final SubLObject v_clauses) {
        return list_utilities.every_in_list($sym94$DECONTEXTUALIZED_CLAUSE_, v_clauses, UNPROVIDED);
    }

    public static final SubLObject decontextualized_clauseP_alt(SubLObject clause) {
        {
            SubLObject contextualizedP = NIL;
            {
                SubLObject rest = NIL;
                for (rest = clauses.neg_lits(clause); !((NIL != contextualizedP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject asent = rest.first();
                        if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                            contextualizedP = T;
                        }
                    }
                }
            }
            {
                SubLObject rest = NIL;
                for (rest = clauses.pos_lits(clause); !((NIL != contextualizedP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject asent = rest.first();
                        if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                            contextualizedP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == contextualizedP);
        }
    }

    public static SubLObject decontextualized_clauseP(final SubLObject clause) {
        SubLObject contextualizedP;
        SubLObject rest;
        SubLObject asent;
        for (contextualizedP = NIL, rest = NIL, rest = clauses.neg_lits(clause); (NIL == contextualizedP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = T;
            }
        }
        for (rest = NIL, rest = clauses.pos_lits(clause); (NIL == contextualizedP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == kb_accessors.decontextualized_literalP(asent)) {
                contextualizedP = T;
            }
        }
        return makeBoolean(NIL == contextualizedP);
    }

    public static final SubLObject generalized_ist_clauses_p_alt(SubLObject v_clauses) {
        if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
            return list_utilities.every_in_list(GENERALIZED_IST_CLAUSE_P, v_clauses, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject generalized_ist_clauses_p(final SubLObject v_clauses) {
        if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
            return list_utilities.every_in_list(GENERALIZED_IST_CLAUSE_P, v_clauses, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject generalized_ist_clause_p_alt(SubLObject clause) {
        {
            SubLObject non_istP = NIL;
            {
                SubLObject rest = NIL;
                for (rest = clauses.neg_lits(clause); !((NIL != non_istP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject asent = rest.first();
                        if (NIL == com.cyc.cycjava.cycl.czer_utilities.generalized_ist_literal_p(asent)) {
                            non_istP = T;
                        }
                    }
                }
            }
            {
                SubLObject rest = NIL;
                for (rest = clauses.pos_lits(clause); !((NIL != non_istP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject asent = rest.first();
                        if (NIL == com.cyc.cycjava.cycl.czer_utilities.generalized_ist_literal_p(asent)) {
                            non_istP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == non_istP);
        }
    }

    public static SubLObject generalized_ist_clause_p(final SubLObject clause) {
        SubLObject non_istP;
        SubLObject rest;
        SubLObject asent;
        for (non_istP = NIL, rest = NIL, rest = clauses.neg_lits(clause); (NIL == non_istP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == generalized_ist_literal_p(asent)) {
                non_istP = T;
            }
        }
        for (rest = NIL, rest = clauses.pos_lits(clause); (NIL == non_istP) && (NIL != rest); rest = rest.rest()) {
            asent = rest.first();
            if (NIL == generalized_ist_literal_p(asent)) {
                non_istP = T;
            }
        }
        return makeBoolean(NIL == non_istP);
    }

    public static final SubLObject generalized_ist_literal_p_alt(SubLObject v_object) {
        return cycl_utilities.atomic_sentence_with_any_of_preds_p(v_object, $list_alt83);
    }

    public static SubLObject generalized_ist_literal_p(final SubLObject v_object) {
        return cycl_utilities.atomic_sentence_with_any_of_preds_p(v_object, $list96);
    }

    public static final SubLObject opaque_arg_wrt_quoting_seeker_alt(SubLObject formula, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_utilities.opaque_arg_wrt_quotingP(formula, argnum)) {
                {
                    SubLObject arg = cycl_utilities.formula_arg(formula, argnum, UNPROVIDED);
                    SubLObject target = $opaque_arg_wrt_quoting_target$.getDynamicValue(thread);
                    if (NIL != list_utilities.tree_find(target, arg, symbol_function(EQUAL), UNPROVIDED)) {
                        com.cyc.cycjava.cycl.czer_utilities.note_opaque_reference_to_term(target, formula);
                    }
                }
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject opaque_arg_wrt_quoting_seeker(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.opaque_arg_wrt_quotingP(formula, argnum)) {
            final SubLObject arg = cycl_utilities.formula_arg(formula, argnum, UNPROVIDED);
            final SubLObject target = $opaque_arg_wrt_quoting_target$.getDynamicValue(thread);
            if (NIL != list_utilities.tree_find(target, arg, symbol_function(EQUAL), UNPROVIDED)) {
                note_opaque_reference_to_term(target, formula);
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject note_opaque_reference_to_term_alt(SubLObject v_term, SubLObject formula) {
        return sublisp_throw($OPAQUE_ARG_FOUND, formula);
    }

    public static SubLObject note_opaque_reference_to_term(final SubLObject v_term, final SubLObject formula) {
        return sublisp_throw($OPAQUE_ARG_FOUND, formula);
    }

    /**
     * Return T iff FORMULA references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff FORMULA references TERM opaquely.")
    public static final SubLObject formula_references_term_opaquelyP_alt(SubLObject formula, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(formula, CYCL_FORMULA_P);
            {
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
                        SubLObject _prev_bind_1 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                            cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                            cycl_utilities.expression_find(v_term, formula, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
                        } finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_1, thread);
                            $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
                }
                return list_utilities.sublisp_boolean(result);
            }
        }
    }

    @LispMethod(comment = "Return T iff FORMULA references TERM opaquely.")
    public static SubLObject formula_references_term_opaquelyP(final SubLObject formula, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_formula_p(formula) : "! cycl_grammar.cycl_formula_p(formula) " + ("cycl_grammar.cycl_formula_p(formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(formula) ") + formula;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.expression_find(v_term, formula, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
        } finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }/**
     * Return T iff FORMULA references TERM opaquely.
     */


    /**
     * Return T iff ASSERTION references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff ASSERTION references TERM opaquely.")
    public static final SubLObject assertion_references_term_opaquelyP_alt(SubLObject assertion, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
                        SubLObject _prev_bind_1 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                            cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                            cycl_utilities.assertion_find(v_term, assertion, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
                        } finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_1, thread);
                            $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
                }
                return list_utilities.sublisp_boolean(result);
            }
        }
    }

    @LispMethod(comment = "Return T iff ASSERTION references TERM opaquely.")
    public static SubLObject assertion_references_term_opaquelyP(final SubLObject assertion, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($OPAQUE_ARG_FOUND);
            final SubLObject _prev_bind_0 = $opaque_arg_wrt_quoting_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                $opaque_arg_wrt_quoting_target$.bind(v_term, thread);
                cycl_utilities.$opaque_arg_function$.bind(OPAQUE_ARG_WRT_QUOTING_SEEKER, thread);
                cycl_utilities.assertion_find(v_term, assertion, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                $opaque_arg_wrt_quoting_target$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, $OPAQUE_ARG_FOUND);
        } finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(result);
    }/**
     * Return T iff ASSERTION references TERM opaquely.
     */


    /**
     * Return T iff KB-HL-SUPPORT references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff KB-HL-SUPPORT references TERM opaquely.")
    public static final SubLObject kb_hl_support_references_term_opaquelyP_alt(SubLObject kb_hl_support, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        SubLTrampolineFile.checkType(kb_hl_support, KB_HL_SUPPORT_P);
        {
            SubLObject sentence = kb_hl_supports.kb_hl_support_ist_sentence(kb_hl_support);
            return com.cyc.cycjava.cycl.czer_utilities.formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
        }
    }

    @LispMethod(comment = "Return T iff KB-HL-SUPPORT references TERM opaquely.")
    public static SubLObject kb_hl_support_references_term_opaquelyP(final SubLObject kb_hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : "! kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + ("kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + "CommonSymbols.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) ") + kb_hl_support;
        final SubLObject sentence = kb_hl_supports_high.kb_hl_support_ist_sentence(kb_hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }/**
     * Return T iff KB-HL-SUPPORT references TERM opaquely.
     */


    /**
     * Return T iff HL-SUPPORT references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff HL-SUPPORT references TERM opaquely.")
    public static final SubLObject hl_support_references_term_opaquelyP_alt(SubLObject hl_support, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        {
            SubLObject sentence = arguments.support_ist_sentence(hl_support);
            return com.cyc.cycjava.cycl.czer_utilities.formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
        }
    }

    @LispMethod(comment = "Return T iff HL-SUPPORT references TERM opaquely.")
    public static SubLObject hl_support_references_term_opaquelyP(final SubLObject hl_support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        final SubLObject sentence = arguments.support_ist_sentence(hl_support);
        return formula_references_term_opaquelyP(sentence, v_term, penetrate_hl_structuresP);
    }/**
     * Return T iff HL-SUPPORT references TERM opaquely.
     */


    /**
     * Return T iff SUPPORT references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff SUPPORT references TERM opaquely.")
    public static final SubLObject support_references_term_opaquelyP_alt(SubLObject support, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return com.cyc.cycjava.cycl.czer_utilities.assertion_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return com.cyc.cycjava.cycl.czer_utilities.kb_hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
            } else {
                return com.cyc.cycjava.cycl.czer_utilities.hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
            }
        }
    }

    @LispMethod(comment = "Return T iff SUPPORT references TERM opaquely.")
    public static SubLObject support_references_term_opaquelyP(final SubLObject support, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertion_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
        }
        return hl_support_references_term_opaquelyP(support, v_term, penetrate_hl_structuresP);
    }/**
     * Return T iff SUPPORT references TERM opaquely.
     */


    /**
     * Return T iff DEDUCTION references TERM opaquely.
     */
    @LispMethod(comment = "Return T iff DEDUCTION references TERM opaquely.")
    public static final SubLObject deduction_references_term_opaquelyP_alt(SubLObject deduction, SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        {
            SubLObject support = deductions_high.deduction_assertion(deduction);
            if (NIL != com.cyc.cycjava.cycl.czer_utilities.support_references_term_opaquelyP(support, penetrate_hl_structuresP, UNPROVIDED)) {
                return T;
            }
        }
        {
            SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.czer_utilities.support_references_term_opaquelyP(support, v_term, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff DEDUCTION references TERM opaquely.")
    public static SubLObject deduction_references_term_opaquelyP(final SubLObject deduction, final SubLObject v_term, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject support = deductions_high.deduction_supported_object(deduction);
        if (NIL != support_references_term_opaquelyP(support, penetrate_hl_structuresP, UNPROVIDED)) {
            return T;
        }
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support2 = NIL;
        support2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != support_references_term_opaquelyP(support2, v_term, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support2 = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Return T iff DEDUCTION references TERM opaquely.
     */


    /**
     * Return a list of assertions that reference TERM opaquely in MT.
     */
    @LispMethod(comment = "Return a list of assertions that reference TERM opaquely in MT.")
    public static final SubLObject term_opaque_assertions_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
            {
                SubLObject assertions = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                    {
                                                        SubLObject done_var_19 = NIL;
                                                        SubLObject token_var_20 = NIL;
                                                        while (NIL == done_var_19) {
                                                            {
                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                SubLObject valid_21 = makeBoolean(token_var_20 != assertion);
                                                                if (NIL != valid_21) {
                                                                    if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                                        if (NIL != com.cyc.cycjava.cycl.czer_utilities.assertion_references_term_opaquelyP(assertion, v_term, NIL)) {
                                                                            assertions = set_contents.set_contents_add(assertion, assertions, symbol_function(EQ));
                                                                        }
                                                                    }
                                                                }
                                                                done_var_19 = makeBoolean(NIL == valid_21);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
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
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return set_contents.set_contents_element_list(assertions);
            }
        }
    }

    @LispMethod(comment = "Return a list of assertions that reference TERM opaquely in MT.")
    public static SubLObject term_opaque_assertions(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "! kb_indexing_datastructures.indexed_term_p(v_term) " + ("kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) ") + v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(symbol_function(KBEQ));
        SubLObject assertions = set_contents.new_set_contents(ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$19 = NIL;
                            final SubLObject token_var_$20 = NIL;
                            while (NIL == done_var_$19) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion));
                                if (((NIL != valid_$21) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) && (NIL != assertion_references_term_opaquelyP(assertion, v_term, NIL))) {
                                    assertions = set_contents.set_contents_add(assertion, assertions, test);
                                }
                                done_var_$19 = makeBoolean(NIL == valid_$21);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(assertions);
    }/**
     * Return a list of assertions that reference TERM opaquely in MT.
     */


    /**
     * Return a list of all assertions that reference TERM opaquely.
     */
    @LispMethod(comment = "Return a list of all assertions that reference TERM opaquely.")
    public static final SubLObject all_term_opaque_assertions_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.czer_utilities.term_opaque_assertions(v_term, $$EverythingPSC);
    }

    @LispMethod(comment = "Return a list of all assertions that reference TERM opaquely.")
    public static SubLObject all_term_opaque_assertions(final SubLObject v_term) {
        return term_opaque_assertions(v_term, $$EverythingPSC);
    }/**
     * Return a list of all assertions that reference TERM opaquely.
     */


    /**
     * Return a list of deductions that reference TERM opaquely in MT.
     */
    @LispMethod(comment = "Return a list of deductions that reference TERM opaquely in MT.")
    public static final SubLObject term_opaque_deductions_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
            {
                SubLObject deductions = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                    {
                                                        SubLObject done_var_23 = NIL;
                                                        SubLObject token_var_24 = NIL;
                                                        while (NIL == done_var_23) {
                                                            {
                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_24);
                                                                SubLObject valid_25 = makeBoolean(token_var_24 != assertion);
                                                                if (NIL != valid_25) {
                                                                    if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                                        {
                                                                            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                                                            SubLObject deduction = NIL;
                                                                            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                                                                                if (NIL != deduction_p(deduction)) {
                                                                                    if (NIL != com.cyc.cycjava.cycl.czer_utilities.deduction_references_term_opaquelyP(deduction, v_term, NIL)) {
                                                                                        deductions = set_contents.set_contents_add(deduction, deductions, symbol_function(EQ));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var_23 = makeBoolean(NIL == valid_25);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
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
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return set_contents.set_contents_element_list(deductions);
            }
        }
    }

    @LispMethod(comment = "Return a list of deductions that reference TERM opaquely in MT.")
    public static SubLObject term_opaque_deductions(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "! kb_indexing_datastructures.indexed_term_p(v_term) " + ("kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) ") + v_term;
        final SubLObject test = hash_table_utilities.to_hash_test(symbol_function(KBEQ));
        SubLObject deductions = set_contents.new_set_contents(ZERO_INTEGER, test);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$23 = NIL;
                            final SubLObject token_var_$24 = NIL;
                            while (NIL == done_var_$23) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
                                if ((NIL != valid_$25) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                    SubLObject deduction = NIL;
                                    deduction = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if ((NIL != deduction_handles.deduction_p(deduction)) && (NIL != deduction_references_term_opaquelyP(deduction, v_term, NIL))) {
                                            deductions = set_contents.set_contents_add(deduction, deductions, test);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        deduction = cdolist_list_var.first();
                                    } 
                                }
                                done_var_$23 = makeBoolean(NIL == valid_$25);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set_contents.set_contents_element_list(deductions);
    }/**
     * Return a list of deductions that reference TERM opaquely in MT.
     */


    /**
     * Return a list of all deductions that reference TERM opaquely.
     */
    @LispMethod(comment = "Return a list of all deductions that reference TERM opaquely.")
    public static final SubLObject all_term_opaque_deductions_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.czer_utilities.term_opaque_deductions(v_term, $$EverythingPSC);
    }

    @LispMethod(comment = "Return a list of all deductions that reference TERM opaquely.")
    public static SubLObject all_term_opaque_deductions(final SubLObject v_term) {
        return term_opaque_deductions(v_term, $$EverythingPSC);
    }/**
     * Return a list of all deductions that reference TERM opaquely.
     */


    public static SubLObject canonicalize_el_query(final SubLObject sentence, SubLObject mt, SubLObject canonicalize_variablesP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (canonicalize_variablesP == UNPROVIDED) {
            canonicalize_variablesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.cycl_truth_value_p(sentence)) {
            return sentence;
        }
        thread.resetMultipleValues();
        SubLObject dnf_clauses_items = czer_main.canonicalize_ask_sentence(sentence, mt);
        final SubLObject canonical_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject dnf_clauses = NIL;
        SubLObject all_quantified_vars = NIL;
        if (NIL == dnf_clauses_items) {
            return $$False;
        }
        SubLObject cdolist_list_var;
        dnf_clauses_items = cdolist_list_var = Sort.sort(dnf_clauses_items, $sym108$LIT__, CLAUSE_BINDING_LIST_PAIRS_LITERAL);
        SubLObject dnf_clauses_item = NIL;
        dnf_clauses_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dnf_clauses_item;
            SubLObject dnf_clause = NIL;
            SubLObject el_to_hl_bindings = NIL;
            SubLObject free_el_vars = NIL;
            destructuring_bind_must_consp(current, datum, $list110);
            dnf_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list110);
            el_to_hl_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list110);
            free_el_vars = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject hl_vars = bindings.bindings_variables(el_to_hl_bindings);
                final SubLObject quantified_hl_vars = set_difference(hl_vars, free_el_vars, UNPROVIDED, UNPROVIDED);
                SubLObject quantified_vars = bindings.apply_bindings(el_to_hl_bindings, quantified_hl_vars);
                dnf_clause = bindings.apply_bindings_backwards(el_to_hl_bindings, dnf_clause);
                quantified_vars = bindings.apply_bindings_backwards(el_to_hl_bindings, quantified_vars);
                dnf_clauses = cons(dnf_clause, dnf_clauses);
                all_quantified_vars = union(all_quantified_vars, quantified_vars, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list110);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf_clauses_item = cdolist_list_var.first();
        } 
        dnf_clauses = nreverse(dnf_clauses);
        if (NIL != canonicalize_variablesP) {
            final SubLObject el_vars = nreverse(cycl_utilities.expression_gather(dnf_clauses, $sym78$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject var_bindings = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject n = NIL;
            list_var = el_vars;
            el_var = list_var.first();
            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
                final SubLObject default_el_var = variables.get_default_el_var(n);
                var_bindings = bindings.add_variable_binding(el_var, default_el_var, var_bindings);
            }
            dnf_clauses = bindings.apply_bindings(var_bindings, dnf_clauses);
            all_quantified_vars = bindings.apply_bindings(var_bindings, all_quantified_vars);
        }
        all_quantified_vars = nreverse(Sort.sort(all_quantified_vars, $sym111$TERM__, UNPROVIDED));
        SubLObject result = existentially_bind_vars(clauses.dnf_formula_from_clauses(dnf_clauses), all_quantified_vars);
        if (NIL == kb_utilities.kbeq(mt, canonical_mt)) {
            result = make_ist_sentence(canonical_mt, result);
        }
        return result;
    }

    /**
     * Returns the given EL SENTENCE after canonicalizing it to HL in the given MT and then transforming it back to EL.
     */
    @LispMethod(comment = "Returns the given EL SENTENCE after canonicalizing it to HL in the given MT and then transforming it back to EL.")
    public static final SubLObject canonicalize_el_sentence(SubLObject sentence, SubLObject mt) {
        SubLTrampolineFile.checkType(sentence, CYCL_FORMULA_P);
        return uncanonicalizer.cnfs_el_formula(com.cyc.cycjava.cycl.czer_utilities.extract_el_clauses(czer_main.el_to_hl(sentence, mt)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt, SubLObject canonicalize_variablesP) {
        if (canonicalize_variablesP == UNPROVIDED) {
            canonicalize_variablesP = NIL;
        }
        assert NIL != cycl_grammar.cycl_formula_p(sentence) : "! cycl_grammar.cycl_formula_p(sentence) " + ("cycl_grammar.cycl_formula_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(sentence) ") + sentence;
        final SubLObject hl = czer_main.el_to_hl(sentence, mt);
        SubLObject cnfs = NIL;
        if (NIL != canonicalize_variablesP) {
            cnfs = cycl_utilities.hl_to_el(extract_hl_clauses(hl));
        } else {
            cnfs = extract_el_clauses(hl);
        }
        return uncanonicalizer.cnfs_el_formula(cnfs, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Checks to see if the canonicalized results of form1 and form2
     * are equal in microtheory *mt*.  If mt is not specified, defaults to the
     * current binding of *mt*.  Form1 and form2 should be wff cycl.
     * Returns T if the canonicalized forms are equal, else nil.
     * If *BOTH* optional arguments are supplied they will be used as the
     * already canonicalized forms of form1 and form2.  This allows useful
     * output of all arguments if wanted.  See canon-forms-equal? for the
     * format needed for canon-form1 and canon-form2.
     */
    @LispMethod(comment = "Checks to see if the canonicalized results of form1 and form2\r\nare equal in microtheory *mt*.  If mt is not specified, defaults to the\r\ncurrent binding of *mt*.  Form1 and form2 should be wff cycl.\r\nReturns T if the canonicalized forms are equal, else nil.\r\nIf *BOTH* optional arguments are supplied they will be used as the\r\nalready canonicalized forms of form1 and form2.  This allows useful\r\noutput of all arguments if wanted.  See canon-forms-equal? for the\r\nformat needed for canon-form1 and canon-form2.\nChecks to see if the canonicalized results of form1 and form2\nare equal in microtheory *mt*.  If mt is not specified, defaults to the\ncurrent binding of *mt*.  Form1 and form2 should be wff cycl.\nReturns T if the canonicalized forms are equal, else nil.\nIf *BOTH* optional arguments are supplied they will be used as the\nalready canonicalized forms of form1 and form2.  This allows useful\noutput of all arguments if wanted.  See canon-forms-equal? for the\nformat needed for canon-form1 and canon-form2.")
    public static final SubLObject canon_equalP_alt(SubLObject form1, SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_mt1 = NIL;
                SubLObject canon_mt2 = NIL;
                if (!((NIL != canon_form1) && (NIL != canon_form2))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form1_27 = czer_main.canonicalize_cycl_sentence(form1, mt);
                        SubLObject canon_mt1_28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form1 = canon_form1_27;
                        canon_mt1 = canon_mt1_28;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form2_29 = czer_main.canonicalize_cycl_sentence(form2, mt);
                        SubLObject canon_mt2_30 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form2 = canon_form2_29;
                        canon_mt2 = canon_mt2_30;
                    }
                }
                return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt_equalP(canon_mt1, canon_mt2)));
            }
        }
    }

    @LispMethod(comment = "Checks to see if the canonicalized results of form1 and form2\r\nare equal in microtheory *mt*.  If mt is not specified, defaults to the\r\ncurrent binding of *mt*.  Form1 and form2 should be wff cycl.\r\nReturns T if the canonicalized forms are equal, else nil.\r\nIf *BOTH* optional arguments are supplied they will be used as the\r\nalready canonicalized forms of form1 and form2.  This allows useful\r\noutput of all arguments if wanted.  See canon-forms-equal? for the\r\nformat needed for canon-form1 and canon-form2.\nChecks to see if the canonicalized results of form1 and form2\nare equal in microtheory *mt*.  If mt is not specified, defaults to the\ncurrent binding of *mt*.  Form1 and form2 should be wff cycl.\nReturns T if the canonicalized forms are equal, else nil.\nIf *BOTH* optional arguments are supplied they will be used as the\nalready canonicalized forms of form1 and form2.  This allows useful\noutput of all arguments if wanted.  See canon-forms-equal? for the\nformat needed for canon-form1 and canon-form2.")
    public static SubLObject canon_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$27 = czer_main.canonicalize_cycl_sentence(form1, mt);
            final SubLObject canon_mt1_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$27;
            canon_mt1 = canon_mt1_$28;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$29 = czer_main.canonicalize_cycl_sentence(form2, mt);
            final SubLObject canon_mt2_$30 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$29;
            canon_mt2 = canon_mt2_$30;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }/**
     * Checks to see if the canonicalized results of form1 and form2
     * are equal in microtheory *mt*.  If mt is not specified, defaults to the
     * current binding of *mt*.  Form1 and form2 should be wff cycl.
     * Returns T if the canonicalized forms are equal, else nil.
     * If *BOTH* optional arguments are supplied they will be used as the
     * already canonicalized forms of form1 and form2.  This allows useful
     * output of all arguments if wanted.  See canon-forms-equal? for the
     * format needed for canon-form1 and canon-form2.
     */


    /**
     * Like @xref canon-equal? except calls canonicalize-ask-sentence instead of canonicalize-cycl-sentence
     */
    @LispMethod(comment = "Like @xref canon-equal? except calls canonicalize-ask-sentence instead of canonicalize-cycl-sentence")
    public static final SubLObject canon_query_equalP_alt(SubLObject query1, SubLObject query2, SubLObject mt, SubLObject canon_query1, SubLObject canon_query2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_query1 == UNPROVIDED) {
            canon_query1 = NIL;
        }
        if (canon_query2 == UNPROVIDED) {
            canon_query2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_mt1 = NIL;
                SubLObject canon_mt2 = NIL;
                if (!((NIL != canon_query1) && (NIL != canon_query2))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_query1_31 = czer_main.canonicalize_ask_sentence(query1, mt);
                        SubLObject canon_mt1_32 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_query1 = canon_query1_31;
                        canon_mt1 = canon_mt1_32;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_query2_33 = czer_main.canonicalize_ask_sentence(query2, mt);
                        SubLObject canon_mt2_34 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_query2 = canon_query2_33;
                        canon_mt2 = canon_mt2_34;
                    }
                }
                return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.canon_forms_equalP(canon_query1, canon_query2, UNPROVIDED)) && (NIL != hlmt_equalP(canon_mt1, canon_mt2)));
            }
        }
    }

    @LispMethod(comment = "Like @xref canon-equal? except calls canonicalize-ask-sentence instead of canonicalize-cycl-sentence")
    public static SubLObject canon_query_equalP(final SubLObject query1, final SubLObject query2, SubLObject mt, SubLObject canon_query1, SubLObject canon_query2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_query1 == UNPROVIDED) {
            canon_query1 = NIL;
        }
        if (canon_query2 == UNPROVIDED) {
            canon_query2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_query1) || (NIL == canon_query2)) {
            thread.resetMultipleValues();
            final SubLObject canon_query1_$31 = czer_main.canonicalize_ask_sentence(query1, mt);
            final SubLObject canon_mt1_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_query1 = canon_query1_$31;
            canon_mt1 = canon_mt1_$32;
            thread.resetMultipleValues();
            final SubLObject canon_query2_$33 = czer_main.canonicalize_ask_sentence(query2, mt);
            final SubLObject canon_mt2_$34 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_query2 = canon_query2_$33;
            canon_mt2 = canon_mt2_$34;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_query1, canon_query2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }/**
     * Like @xref canon-equal? except calls canonicalize-ask-sentence instead of canonicalize-cycl-sentence
     */


    /**
     * Like @xref canon-equal? except calls test-canonicalize-assert-sentence instead of canonicalize-cycl-sentence
     */
    @LispMethod(comment = "Like @xref canon-equal? except calls test-canonicalize-assert-sentence instead of canonicalize-cycl-sentence")
    public static final SubLObject canon_assert_equalP_alt(SubLObject form1, SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_mt1 = NIL;
                SubLObject canon_mt2 = NIL;
                if (!((NIL != canon_form1) && (NIL != canon_form2))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form1_35 = czer_main.test_canonicalize_assert_sentence(form1, mt);
                        SubLObject canon_mt1_36 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form1 = canon_form1_35;
                        canon_mt1 = canon_mt1_36;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form2_37 = czer_main.test_canonicalize_assert_sentence(form2, mt);
                        SubLObject canon_mt2_38 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form2 = canon_form2_37;
                        canon_mt2 = canon_mt2_38;
                    }
                }
                return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt_equalP(canon_mt1, canon_mt2)));
            }
        }
    }

    @LispMethod(comment = "Like @xref canon-equal? except calls test-canonicalize-assert-sentence instead of canonicalize-cycl-sentence")
    public static SubLObject canon_assert_equalP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$35 = czer_main.test_canonicalize_assert_sentence(form1, mt);
            final SubLObject canon_mt1_$36 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$35;
            canon_mt1 = canon_mt1_$36;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$37 = czer_main.test_canonicalize_assert_sentence(form2, mt);
            final SubLObject canon_mt2_$38 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$37;
            canon_mt2 = canon_mt2_$38;
        }
        return makeBoolean((NIL != canon_forms_equalP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }/**
     * Like @xref canon-equal? except calls test-canonicalize-assert-sentence instead of canonicalize-cycl-sentence
     */


    /**
     * Like @xref canon-assert-equal? except handles skolem terms differing only in
     * name.  The strategy used is to make a skolem term to defining assertions map for
     * each form, then attempt to unify the terms with equivalent definitions.  In the
     * case of identical definitions of N skolem terms within a form, we must attempt
     * multiple unifications until we have isomorphism.
     */
    @LispMethod(comment = "Like @xref canon-assert-equal? except handles skolem terms differing only in\r\nname.  The strategy used is to make a skolem term to defining assertions map for\r\neach form, then attempt to unify the terms with equivalent definitions.  In the\r\ncase of identical definitions of N skolem terms within a form, we must attempt\r\nmultiple unifications until we have isomorphism.\nLike @xref canon-assert-equal? except handles skolem terms differing only in\nname.  The strategy used is to make a skolem term to defining assertions map for\neach form, then attempt to unify the terms with equivalent definitions.  In the\ncase of identical definitions of N skolem terms within a form, we must attempt\nmultiple unifications until we have isomorphism.")
    public static final SubLObject canon_assert_isomorphicP_alt(SubLObject form1, SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canon_mt1 = NIL;
                SubLObject canon_mt2 = NIL;
                if (!((NIL != canon_form1) && (NIL != canon_form2))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form1_39 = czer_main.test_canonicalize_assert_sentence(form1, mt);
                        SubLObject canon_mt1_40 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form1 = canon_form1_39;
                        canon_mt1 = canon_mt1_40;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject canon_form2_41 = czer_main.test_canonicalize_assert_sentence(form2, mt);
                        SubLObject canon_mt2_42 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        canon_form2 = canon_form2_41;
                        canon_mt2 = canon_mt2_42;
                    }
                }
                return makeBoolean((NIL != com.cyc.cycjava.cycl.czer_utilities.canon_forms_isomorphicP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt_equalP(canon_mt1, canon_mt2)));
            }
        }
    }

    @LispMethod(comment = "Like @xref canon-assert-equal? except handles skolem terms differing only in\r\nname.  The strategy used is to make a skolem term to defining assertions map for\r\neach form, then attempt to unify the terms with equivalent definitions.  In the\r\ncase of identical definitions of N skolem terms within a form, we must attempt\r\nmultiple unifications until we have isomorphism.\nLike @xref canon-assert-equal? except handles skolem terms differing only in\nname.  The strategy used is to make a skolem term to defining assertions map for\neach form, then attempt to unify the terms with equivalent definitions.  In the\ncase of identical definitions of N skolem terms within a form, we must attempt\nmultiple unifications until we have isomorphism.")
    public static SubLObject canon_assert_isomorphicP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject canon_form1, SubLObject canon_form2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (canon_form1 == UNPROVIDED) {
            canon_form1 = NIL;
        }
        if (canon_form2 == UNPROVIDED) {
            canon_form2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_mt1 = NIL;
        SubLObject canon_mt2 = NIL;
        if ((NIL == canon_form1) || (NIL == canon_form2)) {
            thread.resetMultipleValues();
            final SubLObject canon_form1_$39 = czer_main.test_canonicalize_assert_sentence(form1, mt);
            final SubLObject canon_mt1_$40 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form1 = canon_form1_$39;
            canon_mt1 = canon_mt1_$40;
            thread.resetMultipleValues();
            final SubLObject canon_form2_$41 = czer_main.test_canonicalize_assert_sentence(form2, mt);
            final SubLObject canon_mt2_$42 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_form2 = canon_form2_$41;
            canon_mt2 = canon_mt2_$42;
        }
        return makeBoolean((NIL != canon_forms_isomorphicP(canon_form1, canon_form2, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(canon_mt1, canon_mt2)));
    }/**
     * Like @xref canon-assert-equal? except handles skolem terms differing only in
     * name.  The strategy used is to make a skolem term to defining assertions map for
     * each form, then attempt to unify the terms with equivalent definitions.  In the
     * case of identical definitions of N skolem terms within a form, we must attempt
     * multiple unifications until we have isomorphism.
     */


    /**
     * Checks to see if the canonical forms form1 and form2
     * are equal.  Returns T if (test canonized forms) is t , else nil.
     * Canon-form1 and Canon-form2 are expected to be
     * in the form '( (canon-formula binding-list) (canon-formula
     * binding-list) ... ) i.e. the format returned from canonicalize-cycl
     */
    @LispMethod(comment = "Checks to see if the canonical forms form1 and form2\r\nare equal.  Returns T if (test canonized forms) is t , else nil.\r\nCanon-form1 and Canon-form2 are expected to be\r\nin the form \'( (canon-formula binding-list) (canon-formula\r\nbinding-list) ... ) i.e. the format returned from canonicalize-cycl\nChecks to see if the canonical forms form1 and form2\nare equal.  Returns T if (test canonized forms) is t , else nil.\nCanon-form1 and Canon-form2 are expected to be\nin the form \'( (canon-formula binding-list) (canon-formula\nbinding-list) ... ) i.e. the format returned from canonicalize-cycl")
    public static final SubLObject canon_forms_equalP_alt(SubLObject canon_form1, SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return eq(canon_form1, canon_form2);
        } else {
            return list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2), test);
        }
    }

    @LispMethod(comment = "Checks to see if the canonical forms form1 and form2\r\nare equal.  Returns T if (test canonized forms) is t , else nil.\r\nCanon-form1 and Canon-form2 are expected to be\r\nin the form \'( (canon-formula binding-list) (canon-formula\r\nbinding-list) ... ) i.e. the format returned from canonicalize-cycl\nChecks to see if the canonical forms form1 and form2\nare equal.  Returns T if (test canonized forms) is t , else nil.\nCanon-form1 and Canon-form2 are expected to be\nin the form \'( (canon-formula binding-list) (canon-formula\nbinding-list) ... ) i.e. the format returned from canonicalize-cycl")
    public static SubLObject canon_forms_equalP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        return list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2), test);
    }/**
     * Checks to see if the canonical forms form1 and form2
     * are equal.  Returns T if (test canonized forms) is t , else nil.
     * Canon-form1 and Canon-form2 are expected to be
     * in the form '( (canon-formula binding-list) (canon-formula
     * binding-list) ... ) i.e. the format returned from canonicalize-cycl
     */


    /**
     * Checks to see if the canonical forms form1 and form2 are isomorphically
     * equal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and
     * Canon-form2 are expected to be in the form '( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl
     */
    @LispMethod(comment = "Checks to see if the canonical forms form1 and form2 are isomorphically\r\nequal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and\r\nCanon-form2 are expected to be in the form \'( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl\nChecks to see if the canonical forms form1 and form2 are isomorphically\nequal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and\nCanon-form2 are expected to be in the form \'( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl")
    public static final SubLObject canon_forms_isomorphicP_alt(SubLObject canon_form1, SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return eq(canon_form1, canon_form2);
        }
        {
            SubLObject canon_form1_skolem_terms = cycl_utilities.formula_gather(canon_form1, $sym93$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject canon_form2_skolem_terms = cycl_utilities.formula_gather(canon_form2, $sym93$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject skolem_term_def_map = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
            if (length(canon_form1_skolem_terms) != length(canon_form2_skolem_terms)) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = canon_form1_skolem_terms;
                SubLObject canon_form1_skolem_term = NIL;
                for (canon_form1_skolem_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_form1_skolem_term = cdolist_list_var.first()) {
                    {
                        SubLObject term_formulas = NIL;
                        SubLObject cdolist_list_var_43 = kb_accessors.ata(canon_form1_skolem_term, UNPROVIDED);
                        SubLObject term_assertion = NIL;
                        for (term_assertion = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , term_assertion = cdolist_list_var_43.first()) {
                            if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form1_skolem_term, NIL)) {
                                term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form1_skolem_term, NIL), term_formulas);
                            }
                        }
                        sethash(canon_form1_skolem_term, skolem_term_def_map, term_formulas);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = canon_form2_skolem_terms;
                SubLObject canon_form2_skolem_term = NIL;
                for (canon_form2_skolem_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_form2_skolem_term = cdolist_list_var.first()) {
                    {
                        SubLObject term_formulas = NIL;
                        SubLObject cdolist_list_var_44 = kb_accessors.ata(canon_form2_skolem_term, UNPROVIDED);
                        SubLObject term_assertion = NIL;
                        for (term_assertion = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , term_assertion = cdolist_list_var_44.first()) {
                            if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form2_skolem_term, NIL)) {
                                term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form2_skolem_term, NIL), term_formulas);
                            }
                        }
                        sethash(canon_form2_skolem_term, skolem_term_def_map, term_formulas);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = list_utilities.permute_list(canon_form1_skolem_terms, UNPROVIDED);
                SubLObject canon_form1_skolem_terms_permuted = NIL;
                for (canon_form1_skolem_terms_permuted = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , canon_form1_skolem_terms_permuted = cdolist_list_var.first()) {
                    {
                        SubLObject canon_form2_transformed = canon_form2;
                        SubLObject canon_form2_skolem_terms_used = NIL;
                        SubLObject canon_form2_skolem_term = NIL;
                        SubLObject canon_form2_skolem_term_45 = NIL;
                        SubLObject canon_form1_skolem_term = NIL;
                        SubLObject canon_form1_skolem_term_46 = NIL;
                        for (canon_form2_skolem_term = canon_form2_skolem_terms, canon_form2_skolem_term_45 = canon_form2_skolem_term.first(), canon_form1_skolem_term = canon_form1_skolem_terms_permuted, canon_form1_skolem_term_46 = canon_form1_skolem_term.first(); !((NIL == canon_form1_skolem_term) && (NIL == canon_form2_skolem_term)); canon_form2_skolem_term = canon_form2_skolem_term.rest() , canon_form2_skolem_term_45 = canon_form2_skolem_term.first() , canon_form1_skolem_term = canon_form1_skolem_term.rest() , canon_form1_skolem_term_46 = canon_form1_skolem_term.first()) {
                            if (NIL == list_utilities.member_eqP(canon_form2_skolem_term_45, canon_form2_skolem_terms_used)) {
                                if (NIL != list_utilities.sets_equalP(gethash(canon_form1_skolem_term_46, skolem_term_def_map, UNPROVIDED), gethash(canon_form2_skolem_term_45, skolem_term_def_map, UNPROVIDED), symbol_function(EQUAL))) {
                                    canon_form2_skolem_terms_used = cons(canon_form2_skolem_term_45, canon_form2_skolem_terms_used);
                                    canon_form2_transformed = list_utilities.tree_substitute(canon_form2_transformed, canon_form2_skolem_term_45, canon_form1_skolem_term_46);
                                }
                            }
                        }
                        if (NIL != list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2_transformed), test)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Checks to see if the canonical forms form1 and form2 are isomorphically\r\nequal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and\r\nCanon-form2 are expected to be in the form \'( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl\nChecks to see if the canonical forms form1 and form2 are isomorphically\nequal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and\nCanon-form2 are expected to be in the form \'( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl")
    public static SubLObject canon_forms_isomorphicP(final SubLObject canon_form1, final SubLObject canon_form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (canon_form1.isAtom() || canon_form2.isAtom()) {
            return kb_utilities.kbeq(canon_form1, canon_form2);
        }
        final SubLObject canon_form1_skolem_terms = cycl_utilities.formula_gather(canon_form1, $sym112$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject canon_form2_skolem_terms = cycl_utilities.formula_gather(canon_form2, $sym112$SKOLEM_NART_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject skolem_term_def_map = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
        if (!length(canon_form1_skolem_terms).numE(length(canon_form2_skolem_terms))) {
            return NIL;
        }
        SubLObject cdolist_list_var = canon_form1_skolem_terms;
        SubLObject canon_form1_skolem_term = NIL;
        canon_form1_skolem_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject term_formulas = NIL;
            SubLObject cdolist_list_var_$43 = kb_accessors.ata(canon_form1_skolem_term, UNPROVIDED);
            SubLObject term_assertion = NIL;
            term_assertion = cdolist_list_var_$43.first();
            while (NIL != cdolist_list_var_$43) {
                if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form1_skolem_term, NIL)) {
                    term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form1_skolem_term, NIL), term_formulas);
                }
                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                term_assertion = cdolist_list_var_$43.first();
            } 
            sethash(canon_form1_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_term = cdolist_list_var.first();
        } 
        cdolist_list_var = canon_form2_skolem_terms;
        SubLObject canon_form2_skolem_term = NIL;
        canon_form2_skolem_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject term_formulas = NIL;
            SubLObject cdolist_list_var_$44 = kb_accessors.ata(canon_form2_skolem_term, UNPROVIDED);
            SubLObject term_assertion = NIL;
            term_assertion = cdolist_list_var_$44.first();
            while (NIL != cdolist_list_var_$44) {
                if (NIL == properties.term_quoted_in_gafP(term_assertion, canon_form2_skolem_term, NIL)) {
                    term_formulas = cons(list_utilities.tree_substitute(assertions_high.assertion_formula(term_assertion), canon_form2_skolem_term, NIL), term_formulas);
                }
                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                term_assertion = cdolist_list_var_$44.first();
            } 
            sethash(canon_form2_skolem_term, skolem_term_def_map, term_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            canon_form2_skolem_term = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.permute_list(canon_form1_skolem_terms, UNPROVIDED);
        SubLObject canon_form1_skolem_terms_permuted = NIL;
        canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject canon_form2_transformed = canon_form2;
            SubLObject canon_form2_skolem_terms_used = NIL;
            SubLObject canon_form2_skolem_term2 = NIL;
            SubLObject canon_form2_skolem_term_$45 = NIL;
            SubLObject canon_form1_skolem_term2 = NIL;
            SubLObject canon_form1_skolem_term_$46 = NIL;
            canon_form2_skolem_term2 = canon_form2_skolem_terms;
            canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
            canon_form1_skolem_term2 = canon_form1_skolem_terms_permuted;
            canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            while ((NIL != canon_form1_skolem_term2) || (NIL != canon_form2_skolem_term2)) {
                if ((NIL == list_utilities.member_kbeqP(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used)) && (NIL != list_utilities.sets_equalP(gethash(canon_form1_skolem_term_$46, skolem_term_def_map, UNPROVIDED), gethash(canon_form2_skolem_term_$45, skolem_term_def_map, UNPROVIDED), symbol_function(EQUAL)))) {
                    canon_form2_skolem_terms_used = cons(canon_form2_skolem_term_$45, canon_form2_skolem_terms_used);
                    canon_form2_transformed = list_utilities.tree_substitute(canon_form2_transformed, canon_form2_skolem_term_$45, canon_form1_skolem_term_$46);
                }
                canon_form2_skolem_term2 = canon_form2_skolem_term2.rest();
                canon_form2_skolem_term_$45 = canon_form2_skolem_term2.first();
                canon_form1_skolem_term2 = canon_form1_skolem_term2.rest();
                canon_form1_skolem_term_$46 = canon_form1_skolem_term2.first();
            } 
            if (NIL != list_utilities.sets_equalP(Mapping.mapcar(symbol_function(FIRST), canon_form1), Mapping.mapcar(symbol_function(FIRST), canon_form2_transformed), test)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            canon_form1_skolem_terms_permuted = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Checks to see if the canonical forms form1 and form2 are isomorphically
     * equal.  Returns T if (test canonized forms) is t, else nil.  Canon-form1 and
     * Canon-form2 are expected to be in the form '( (canon-formula binding-list) (canon-formula binding-list) ... ) i.e. the format returned from canonicalize-cycl
     */


    /**
     * Checks to see if the canonicalized results of form1 and form2
     * are equal in microtheory *mt* with some of the el variable names substituted back
     * in for the hl names.  Currently any universals explicitly appearing in a quantifier
     * will be have its el name substituted back in for the uniquified name, but this should
     * have no effect since the uniquified variable was replaced by an hl variable.
     * If mt is not specified, defaults to the
     * current binding of *mt*.  Test will be used to compare the canonicalized versions.
     * form1 and form2 should be wff cycl.
     * Returns T if the canonicalized forms are equal, else nil.
     * If an optional argument is supplied it will be used as the
     * binding list where each element is a pair (el-name . unique-gen-name) for
     * the corresponding form (i.e. form1 bindings1) and form will be assumed to
     * be in canonical form.  To convey that a form is canonicalized but there are
     * no variable bindings ((t . t)) may be used.  Bindings are substituted in from
     * left to right.
     */
    @LispMethod(comment = "Checks to see if the canonicalized results of form1 and form2\r\nare equal in microtheory *mt* with some of the el variable names substituted back\r\nin for the hl names.  Currently any universals explicitly appearing in a quantifier\r\nwill be have its el name substituted back in for the uniquified name, but this should\r\nhave no effect since the uniquified variable was replaced by an hl variable.\r\nIf mt is not specified, defaults to the\r\ncurrent binding of *mt*.  Test will be used to compare the canonicalized versions.\r\nform1 and form2 should be wff cycl.\r\nReturns T if the canonicalized forms are equal, else nil.\r\nIf an optional argument is supplied it will be used as the\r\nbinding list where each element is a pair (el-name . unique-gen-name) for\r\nthe corresponding form (i.e. form1 bindings1) and form will be assumed to\r\nbe in canonical form.  To convey that a form is canonicalized but there are\r\nno variable bindings ((t . t)) may be used.  Bindings are substituted in from\r\nleft to right.\nChecks to see if the canonicalized results of form1 and form2\nare equal in microtheory *mt* with some of the el variable names substituted back\nin for the hl names.  Currently any universals explicitly appearing in a quantifier\nwill be have its el name substituted back in for the uniquified name, but this should\nhave no effect since the uniquified variable was replaced by an hl variable.\nIf mt is not specified, defaults to the\ncurrent binding of *mt*.  Test will be used to compare the canonicalized versions.\nform1 and form2 should be wff cycl.\nReturns T if the canonicalized forms are equal, else nil.\nIf an optional argument is supplied it will be used as the\nbinding list where each element is a pair (el-name . unique-gen-name) for\nthe corresponding form (i.e. form1 bindings1) and form will be assumed to\nbe in canonical form.  To convey that a form is canonicalized but there are\nno variable bindings ((t . t)) may be used.  Bindings are substituted in from\nleft to right.")
    public static final SubLObject canon_equal_hl_namesP_alt(SubLObject form1, SubLObject form2, SubLObject mt, SubLObject test, SubLObject bindings1, SubLObject bindings2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (bindings1 == UNPROVIDED) {
            bindings1 = NIL;
        }
        if (bindings2 == UNPROVIDED) {
            bindings2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject canon1 = NIL;
                SubLObject bind1 = NIL;
                SubLObject canon2 = NIL;
                SubLObject bind2 = NIL;
                if (NIL != bindings1) {
                    canon1 = form1;
                    bind1 = bindings1;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form1, mt);
                        SubLObject subordinate_fi_ops = thread.secondMultipleValue();
                        SubLObject uniquified_bindings = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        canon1 = temp_cnf;
                        bind1 = uniquified_bindings;
                    }
                }
                if (NIL != bindings2) {
                    canon2 = form2;
                    bind2 = bindings2;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form2, mt);
                        SubLObject subordinate_fi_ops = thread.secondMultipleValue();
                        SubLObject uniquified_bindings = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        canon2 = temp_cnf;
                        bind2 = uniquified_bindings;
                    }
                }
                {
                    SubLObject cdolist_list_var = bind1;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        canon1 = subst(binding.first(), binding.rest(), canon1, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject cdolist_list_var = bind2;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        canon2 = subst(binding.first(), binding.rest(), canon2, UNPROVIDED, UNPROVIDED);
                    }
                }
                result = com.cyc.cycjava.cycl.czer_utilities.canon_forms_equalP(canon1, canon2, test);
                return result;
            }
        }
    }

    @LispMethod(comment = "Checks to see if the canonicalized results of form1 and form2\r\nare equal in microtheory *mt* with some of the el variable names substituted back\r\nin for the hl names.  Currently any universals explicitly appearing in a quantifier\r\nwill be have its el name substituted back in for the uniquified name, but this should\r\nhave no effect since the uniquified variable was replaced by an hl variable.\r\nIf mt is not specified, defaults to the\r\ncurrent binding of *mt*.  Test will be used to compare the canonicalized versions.\r\nform1 and form2 should be wff cycl.\r\nReturns T if the canonicalized forms are equal, else nil.\r\nIf an optional argument is supplied it will be used as the\r\nbinding list where each element is a pair (el-name . unique-gen-name) for\r\nthe corresponding form (i.e. form1 bindings1) and form will be assumed to\r\nbe in canonical form.  To convey that a form is canonicalized but there are\r\nno variable bindings ((t . t)) may be used.  Bindings are substituted in from\r\nleft to right.\nChecks to see if the canonicalized results of form1 and form2\nare equal in microtheory *mt* with some of the el variable names substituted back\nin for the hl names.  Currently any universals explicitly appearing in a quantifier\nwill be have its el name substituted back in for the uniquified name, but this should\nhave no effect since the uniquified variable was replaced by an hl variable.\nIf mt is not specified, defaults to the\ncurrent binding of *mt*.  Test will be used to compare the canonicalized versions.\nform1 and form2 should be wff cycl.\nReturns T if the canonicalized forms are equal, else nil.\nIf an optional argument is supplied it will be used as the\nbinding list where each element is a pair (el-name . unique-gen-name) for\nthe corresponding form (i.e. form1 bindings1) and form will be assumed to\nbe in canonical form.  To convey that a form is canonicalized but there are\nno variable bindings ((t . t)) may be used.  Bindings are substituted in from\nleft to right.")
    public static SubLObject canon_equal_hl_namesP(final SubLObject form1, final SubLObject form2, SubLObject mt, SubLObject test, SubLObject bindings1, SubLObject bindings2) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (bindings1 == UNPROVIDED) {
            bindings1 = NIL;
        }
        if (bindings2 == UNPROVIDED) {
            bindings2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject canon1 = NIL;
        SubLObject bind1 = NIL;
        SubLObject canon2 = NIL;
        SubLObject bind2 = NIL;
        if (NIL != bindings1) {
            canon1 = form1;
            bind1 = bindings1;
        } else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form1, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon1 = temp_cnf;
            bind1 = uniquified_bindings;
        }
        if (NIL != bindings2) {
            canon2 = form2;
            bind2 = bindings2;
        } else {
            thread.resetMultipleValues();
            final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(form2, mt);
            final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
            final SubLObject uniquified_bindings = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            canon2 = temp_cnf;
            bind2 = uniquified_bindings;
        }
        SubLObject cdolist_list_var = bind1;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            canon1 = subst(binding.first(), binding.rest(), canon1, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        cdolist_list_var = bind2;
        binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            canon2 = subst(binding.first(), binding.rest(), canon2, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        result = canon_forms_equalP(canon1, canon2, test);
        return result;
    }/**
     * Checks to see if the canonicalized results of form1 and form2
     * are equal in microtheory *mt* with some of the el variable names substituted back
     * in for the hl names.  Currently any universals explicitly appearing in a quantifier
     * will be have its el name substituted back in for the uniquified name, but this should
     * have no effect since the uniquified variable was replaced by an hl variable.
     * If mt is not specified, defaults to the
     * current binding of *mt*.  Test will be used to compare the canonicalized versions.
     * form1 and form2 should be wff cycl.
     * Returns T if the canonicalized forms are equal, else nil.
     * If an optional argument is supplied it will be used as the
     * binding list where each element is a pair (el-name . unique-gen-name) for
     * the corresponding form (i.e. form1 bindings1) and form will be assumed to
     * be in canonical form.  To convey that a form is canonicalized but there are
     * no variable bindings ((t . t)) may be used.  Bindings are substituted in from
     * left to right.
     */


    /**
     * Checks if constant occurs in formula
     */
    @LispMethod(comment = "Checks if constant occurs in formula")
    public static final SubLObject constant_occurs_in_formulaP_alt(SubLObject constant, SubLObject formula) {
        if (NIL != com.cyc.cycjava.cycl.czer_utilities.find_anywhere(constant, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    @LispMethod(comment = "Checks if constant occurs in formula")
    public static SubLObject constant_occurs_in_formulaP(final SubLObject constant, final SubLObject formula) {
        if (NIL != find_anywhere(constant, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }/**
     * Checks if constant occurs in formula
     */


    /**
     * canonicalizes a formula and returns it and the value of the uniquified binding list
     * excluding bindings for universals.  The variable bindings
     * that are returned are essentially the uniquified bindings for variables that appear in skolems.
     */
    @LispMethod(comment = "canonicalizes a formula and returns it and the value of the uniquified binding list\r\nexcluding bindings for universals.  The variable bindings\r\nthat are returned are essentially the uniquified bindings for variables that appear in skolems.\ncanonicalizes a formula and returns it and the value of the uniquified binding list\nexcluding bindings for universals.  The variable bindings\nthat are returned are essentially the uniquified bindings for variables that appear in skolems.")
    public static final SubLObject canonicalize_and_return_skolem_vars_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = NIL;
                SubLObject var_bindings = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject temp_cnf = czer_main.canonicalize_cycl_test(formula, mt);
                    SubLObject subordinate_fi_ops = thread.secondMultipleValue();
                    SubLObject uniquified_bindings = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    cnf = temp_cnf;
                    var_bindings = uniquified_bindings;
                }
                {
                    SubLObject universals = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), list_utilities.mapappend(symbol_function(SECOND), cnf)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = universals;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        if (NIL != rassoc(var, var_bindings, UNPROVIDED, UNPROVIDED)) {
                            var_bindings = delete(var, var_bindings, symbol_function(EQL), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return values(cnf, var_bindings);
            }
        }
    }

    @LispMethod(comment = "canonicalizes a formula and returns it and the value of the uniquified binding list\r\nexcluding bindings for universals.  The variable bindings\r\nthat are returned are essentially the uniquified bindings for variables that appear in skolems.\ncanonicalizes a formula and returns it and the value of the uniquified binding list\nexcluding bindings for universals.  The variable bindings\nthat are returned are essentially the uniquified bindings for variables that appear in skolems.")
    public static SubLObject canonicalize_and_return_skolem_vars(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf = NIL;
        SubLObject var_bindings = NIL;
        thread.resetMultipleValues();
        final SubLObject temp_cnf = czer_main.canonicalize_cycl_test(formula, mt);
        final SubLObject subordinate_fi_ops = thread.secondMultipleValue();
        final SubLObject uniquified_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        cnf = temp_cnf;
        var_bindings = uniquified_bindings;
        SubLObject cdolist_list_var;
        final SubLObject universals = cdolist_list_var = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), list_utilities.mapappend(symbol_function(SECOND), cnf)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rassoc(var, var_bindings, UNPROVIDED, UNPROVIDED)) {
                var_bindings = delete(var, var_bindings, symbol_function(EQL), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return subl_promotions.values2(cnf, var_bindings);
    }/**
     * canonicalizes a formula and returns it and the value of the uniquified binding list
     * excluding bindings for universals.  The variable bindings
     * that are returned are essentially the uniquified bindings for variables that appear in skolems.
     */


    /**
     * find-anywhere searches a nested tree for the first occurrence of
     * object such that (test object tree) is true.  find-anywhere returns
     * the first level of tree that meets this test.  If key is non-nil
     * then key is applied to tree before test.  Key should be able to
     * accept atoms.  In the case that object is nil then t is returned if
     * a match is found.
     */
    @LispMethod(comment = "find-anywhere searches a nested tree for the first occurrence of\r\nobject such that (test object tree) is true.  find-anywhere returns\r\nthe first level of tree that meets this test.  If key is non-nil\r\nthen key is applied to tree before test.  Key should be able to\r\naccept atoms.  In the case that object is nil then t is returned if\r\na match is found.\nfind-anywhere searches a nested tree for the first occurrence of\nobject such that (test object tree) is true.  find-anywhere returns\nthe first level of tree that meets this test.  If key is non-nil\nthen key is applied to tree before test.  Key should be able to\naccept atoms.  In the case that object is nil then t is returned if\na match is found.")
    public static final SubLObject find_anywhere_alt(SubLObject v_object, SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return tree;
            } else {
                return T;
            }
        } else {
            if (tree.isCons()) {
                {
                    SubLObject first_result = com.cyc.cycjava.cycl.czer_utilities.find_anywhere(v_object, tree.first(), test, key);
                    SubLObject rest_result = ((NIL != first_result) || (NIL == tree.rest())) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.czer_utilities.find_anywhere(v_object, tree.rest(), test, key);
                    if (NIL != first_result) {
                        return first_result;
                    } else {
                        if (NIL != rest_result) {
                            return rest_result;
                        } else {
                            return NIL;
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "find-anywhere searches a nested tree for the first occurrence of\r\nobject such that (test object tree) is true.  find-anywhere returns\r\nthe first level of tree that meets this test.  If key is non-nil\r\nthen key is applied to tree before test.  Key should be able to\r\naccept atoms.  In the case that object is nil then t is returned if\r\na match is found.\nfind-anywhere searches a nested tree for the first occurrence of\nobject such that (test object tree) is true.  find-anywhere returns\nthe first level of tree that meets this test.  If key is non-nil\nthen key is applied to tree before test.  Key should be able to\naccept atoms.  In the case that object is nil then t is returned if\na match is found.")
    public static SubLObject find_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return tree;
            }
            return T;
        } else {
            if (!tree.isCons()) {
                return NIL;
            }
            final SubLObject first_result = find_anywhere(v_object, tree.first(), test, key);
            final SubLObject rest_result = ((NIL != first_result) || (NIL == tree.rest())) ? NIL : find_anywhere(v_object, tree.rest(), test, key);
            if (NIL != first_result) {
                return first_result;
            }
            if (NIL != rest_result) {
                return rest_result;
            }
            return NIL;
        }
    }/**
     * find-anywhere searches a nested tree for the first occurrence of
     * object such that (test object tree) is true.  find-anywhere returns
     * the first level of tree that meets this test.  If key is non-nil
     * then key is applied to tree before test.  Key should be able to
     * accept atoms.  In the case that object is nil then t is returned if
     * a match is found.
     */


    /**
     * find-anywhere searches a nested tree for all occurrences of
     * object such that (test object tree) is true.  find-anywhere returns
     * a list of all topmost tree subtrees that meets this test.  If key is
     * non-nil
     * then key is applied to tree before test.  Key should be able to
     * accept atoms.  In the case that object is nil then (t) is returned if
     * a match is found.  Basket is a list that the list of results is
     * appended to i.e. find-all-anywhere => (append results basket)
     */
    @LispMethod(comment = "find-anywhere searches a nested tree for all occurrences of\r\nobject such that (test object tree) is true.  find-anywhere returns\r\na list of all topmost tree subtrees that meets this test.  If key is\r\nnon-nil\r\nthen key is applied to tree before test.  Key should be able to\r\naccept atoms.  In the case that object is nil then (t) is returned if\r\na match is found.  Basket is a list that the list of results is\r\nappended to i.e. find-all-anywhere => (append results basket)\nfind-anywhere searches a nested tree for all occurrences of\nobject such that (test object tree) is true.  find-anywhere returns\na list of all topmost tree subtrees that meets this test.  If key is\nnon-nil\nthen key is applied to tree before test.  Key should be able to\naccept atoms.  In the case that object is nil then (t) is returned if\na match is found.  Basket is a list that the list of results is\nappended to i.e. find-all-anywhere => (append results basket)")
    public static final SubLObject find_all_anywhere_alt(SubLObject v_object, SubLObject tree, SubLObject test, SubLObject key, SubLObject basket) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (basket == UNPROVIDED) {
            basket = NIL;
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return cons(tree, basket);
            } else {
                return cons(T, basket);
            }
        } else {
            if (tree.isCons()) {
                return NIL == tree.rest() ? ((SubLObject) (com.cyc.cycjava.cycl.czer_utilities.find_all_anywhere(v_object, tree.first(), test, key, basket))) : com.cyc.cycjava.cycl.czer_utilities.find_all_anywhere(v_object, tree.rest(), test, key, com.cyc.cycjava.cycl.czer_utilities.find_all_anywhere(v_object, tree.first(), test, key, basket));
            } else {
                return basket;
            }
        }
    }

    @LispMethod(comment = "find-anywhere searches a nested tree for all occurrences of\r\nobject such that (test object tree) is true.  find-anywhere returns\r\na list of all topmost tree subtrees that meets this test.  If key is\r\nnon-nil\r\nthen key is applied to tree before test.  Key should be able to\r\naccept atoms.  In the case that object is nil then (t) is returned if\r\na match is found.  Basket is a list that the list of results is\r\nappended to i.e. find-all-anywhere => (append results basket)\nfind-anywhere searches a nested tree for all occurrences of\nobject such that (test object tree) is true.  find-anywhere returns\na list of all topmost tree subtrees that meets this test.  If key is\nnon-nil\nthen key is applied to tree before test.  Key should be able to\naccept atoms.  In the case that object is nil then (t) is returned if\na match is found.  Basket is a list that the list of results is\nappended to i.e. find-all-anywhere => (append results basket)")
    public static SubLObject find_all_anywhere(final SubLObject v_object, final SubLObject tree, SubLObject test, SubLObject key, SubLObject basket) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (basket == UNPROVIDED) {
            basket = NIL;
        }
        if (NIL != funcall(test, v_object, funcall(key, tree))) {
            if (NIL != tree) {
                return cons(tree, basket);
            }
            return cons(T, basket);
        } else {
            if (tree.isCons()) {
                return NIL == tree.rest() ? find_all_anywhere(v_object, tree.first(), test, key, basket) : find_all_anywhere(v_object, tree.rest(), test, key, find_all_anywhere(v_object, tree.first(), test, key, basket));
            }
            return basket;
        }
    }/**
     * find-anywhere searches a nested tree for all occurrences of
     * object such that (test object tree) is true.  find-anywhere returns
     * a list of all topmost tree subtrees that meets this test.  If key is
     * non-nil
     * then key is applied to tree before test.  Key should be able to
     * accept atoms.  In the case that object is nil then (t) is returned if
     * a match is found.  Basket is a list that the list of results is
     * appended to i.e. find-all-anywhere => (append results basket)
     */


    /**
     * assert the form, find it, unassert it and return its el-form
     */
    @LispMethod(comment = "assert the form, find it, unassert it and return its el-form")
    public static final SubLObject return_uncanon_alt(SubLObject form, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            format(T, $str_alt96$__Error__assert_failed__S___, form);
                        } else {
                            {
                                SubLObject assertion = czer_meta.find_some_assertion_cycl(form, mt);
                                if (NIL == assertion) {
                                    format(T, $str_alt97$__Error__Can_t_find_assertion___);
                                } else {
                                    {
                                        SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                                        fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        result = el_form;
                                    }
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "assert the form, find it, unassert it and return its el-form")
    public static SubLObject return_uncanon(final SubLObject form, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                format(T, $str115$__Error__assert_failed__S___, form);
            } else {
                final SubLObject assertion = czer_meta.find_some_assertion_cycl(form, mt);
                if (NIL == assertion) {
                    format(T, $str116$__Error__Can_t_find_assertion___);
                } else {
                    final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                    fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    result = el_form;
                }
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * assert the form, find it, unassert it and return its el-form
     */


    public static final SubLObject uncanon_original_test_alt(SubLObject form, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_utilities.uncanon_test(form, mt, T, UNPROVIDED);
    }

    public static SubLObject uncanon_original_test(final SubLObject form, final SubLObject mt) {
        return uncanon_test(form, mt, T, UNPROVIDED);
    }

    /**
     * assert the form, find it, unassert it, compare to its el-form, if the same, then return t,
     * if not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.
     * assert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil
     */
    @LispMethod(comment = "assert the form, find it, unassert it, compare to its el-form, if the same, then return t,\r\nif not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.\r\nassert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil\nassert the form, find it, unassert it, compare to its el-form, if the same, then return t,\nif not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.\nassert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil")
    public static final SubLObject uncanon_test_alt(SubLObject form, SubLObject mt, SubLObject require_original_equalP, SubLObject verboseP) {
        if (require_original_equalP == UNPROVIDED) {
            require_original_equalP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = T;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if (NIL != verboseP) {
                            format(T, $str_alt99$__Form___A_in__A__, form, mt);
                        }
                        if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            format(T, $str_alt100$__Error__assert_failed__);
                        } else {
                            {
                                SubLObject assertions = czer_meta.find_assertions_cycl(form, mt);
                                if (NIL == assertions) {
                                    format(T, $str_alt101$__Error__Can_t_find_assertions___, form);
                                } else {
                                    {
                                        SubLObject cdolist_list_var = assertions;
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if (NIL != verboseP) {
                                                format(T, $str_alt102$__The_assertion_is__S___, assertion);
                                            }
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                                                SubLObject el_mt = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != verboseP) {
                                                    format(T, $str_alt103$__Its_EL_form_is__S_in__S___, el_form, el_mt);
                                                }
                                                if (!(form.equal(el_form) && mt.equal(el_mt))) {
                                                    if (NIL != require_original_equalP) {
                                                        result = NIL;
                                                    } else {
                                                        fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        fi.safe_fi($ASSERT, el_form, el_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        {
                                                            SubLObject assertions_47 = czer_meta.find_assertions_cycl(el_form, el_mt);
                                                            if (NIL == assertions_47) {
                                                                format(T, $str_alt104$__Error__Can_t_find_assertions___, el_form, el_mt);
                                                            } else {
                                                                {
                                                                    SubLObject doneP = NIL;
                                                                    if (NIL == doneP) {
                                                                        {
                                                                            SubLObject csome_list_var = assertions_47;
                                                                            SubLObject assertion2 = NIL;
                                                                            for (assertion2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion2 = csome_list_var.first()) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject new_el_form = uncanonicalizer.assertion_el_formula(assertion2);
                                                                                    SubLObject new_el_mt = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != verboseP) {
                                                                                        format(T, $str_alt105$__Its_New_EL_form_is__S_in__S___, new_el_form, new_el_mt);
                                                                                    }
                                                                                    if (!(el_form.equal(new_el_form) && el_mt.equal(new_el_mt))) {
                                                                                        format(T, $str_alt106$__Error__EL_mismatch___Original__, new_el_form, el_form);
                                                                                        result = NIL;
                                                                                        doneP = T;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        fi.safe_fi($UNASSERT, el_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "assert the form, find it, unassert it, compare to its el-form, if the same, then return t,\r\nif not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.\r\nassert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil\nassert the form, find it, unassert it, compare to its el-form, if the same, then return t,\nif not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.\nassert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil")
    public static SubLObject uncanon_test(final SubLObject form, final SubLObject mt, SubLObject require_original_equalP, SubLObject verboseP) {
        if (require_original_equalP == UNPROVIDED) {
            require_original_equalP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = T;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            if (NIL != verboseP) {
                format(T, $str118$__Form___A_in__A__, form, mt);
            }
            if (NIL == fi.safe_fi($ASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                format(T, $str119$__Error__assert_failed__);
            } else {
                final SubLObject assertions = czer_meta.find_assertions_cycl(form, mt);
                if (NIL == assertions) {
                    format(T, $str120$__Error__Can_t_find_assertions___, form);
                } else {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != verboseP) {
                            format(T, $str121$__The_assertion_is__S___, assertion);
                        }
                        thread.resetMultipleValues();
                        final SubLObject el_form = uncanonicalizer.assertion_el_formula(assertion);
                        final SubLObject el_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != verboseP) {
                            format(T, $str122$__Its_EL_form_is__S_in__S___, el_form, el_mt);
                        }
                        if ((!form.equal(el_form)) || (!mt.equal(el_mt))) {
                            if (NIL != require_original_equalP) {
                                result = NIL;
                            } else {
                                fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                fi.safe_fi($ASSERT, el_form, el_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject assertions_$47 = czer_meta.find_assertions_cycl(el_form, el_mt);
                                if (NIL == assertions_$47) {
                                    format(T, $str123$__Error__Can_t_find_assertions___, el_form, el_mt);
                                } else {
                                    SubLObject doneP = NIL;
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var = assertions_$47;
                                        SubLObject assertion2 = NIL;
                                        assertion2 = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            thread.resetMultipleValues();
                                            final SubLObject new_el_form = uncanonicalizer.assertion_el_formula(assertion2);
                                            final SubLObject new_el_mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != verboseP) {
                                                format(T, $str124$__Its_New_EL_form_is__S_in__S___, new_el_form, new_el_mt);
                                            }
                                            if ((!el_form.equal(new_el_form)) || (!el_mt.equal(new_el_mt))) {
                                                format(T, $str125$__Error__EL_mismatch___Original__, new_el_form, el_form);
                                                result = NIL;
                                                doneP = T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            assertion2 = csome_list_var.first();
                                        } 
                                    }
                                }
                                fi.safe_fi($UNASSERT, el_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
                fi.safe_fi($UNASSERT, form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * assert the form, find it, unassert it, compare to its el-form, if the same, then return t,
     * if not the same then, unless REQUIRE-ORIGINAL-EQUAL?, you get a second chance.
     * assert el-form, find it, unassert it, compare the new-el-form to el-form, if the same, then return t, else return nil
     */


    /**
     * Some assertions require other assertions to already be
     * present in the KB before they're asserted.
     * Assert the forms in form-list, then assert form2 and return the el-form of form2
     */
    @LispMethod(comment = "Some assertions require other assertions to already be\r\npresent in the KB before they\'re asserted.\r\nAssert the forms in form-list, then assert form2 and return the el-form of form2\nSome assertions require other assertions to already be\npresent in the KB before they\'re asserted.\nAssert the forms in form-list, then assert form2 and return the el-form of form2")
    public static final SubLObject assert_return_uncanon_alt(SubLObject form_list, SubLObject form2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        {
                            SubLObject cdolist_list_var = form_list;
                            SubLObject assert_form = NIL;
                            for (assert_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assert_form = cdolist_list_var.first()) {
                                if (NIL == fi.safe_fi($ASSERT, assert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    format(T, $str_alt107$__Error__assert_failed___S__, assert_form);
                                }
                            }
                        }
                        {
                            SubLObject el_form2 = com.cyc.cycjava.cycl.czer_utilities.return_uncanon(form2, mt);
                            SubLObject cdolist_list_var = form_list;
                            SubLObject unassert_form = NIL;
                            for (unassert_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unassert_form = cdolist_list_var.first()) {
                                if (NIL == fi.safe_fi($UNASSERT, unassert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    format(T, $str_alt108$__Error__unassert_failed___S__, unassert_form);
                                }
                            }
                            result = el_form2;
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Some assertions require other assertions to already be\r\npresent in the KB before they\'re asserted.\r\nAssert the forms in form-list, then assert form2 and return the el-form of form2\nSome assertions require other assertions to already be\npresent in the KB before they\'re asserted.\nAssert the forms in form-list, then assert form2 and return the el-form of form2")
    public static SubLObject assert_return_uncanon(final SubLObject form_list, final SubLObject form2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            SubLObject cdolist_list_var = form_list;
            SubLObject assert_form = NIL;
            assert_form = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fi.safe_fi($ASSERT, assert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(T, $str126$__Error__assert_failed___S__, assert_form);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assert_form = cdolist_list_var.first();
            } 
            final SubLObject el_form2 = return_uncanon(form2, mt);
            SubLObject cdolist_list_var2 = form_list;
            SubLObject unassert_form = NIL;
            unassert_form = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL == fi.safe_fi($UNASSERT, unassert_form, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(T, $str127$__Error__unassert_failed___S__, unassert_form);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                unassert_form = cdolist_list_var2.first();
            } 
            result = el_form2;
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Some assertions require other assertions to already be
     * present in the KB before they're asserted.
     * Assert the forms in form-list, then assert form2 and return the el-form of form2
     */


    public static final SubLObject canon_mal_resultP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = czer_main.canonicalize_cycl(formula, mt);
            return com.cyc.cycjava.cycl.czer_utilities.canon_form_mal_resultP(result);
        }
    }

    public static SubLObject canon_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_cycl(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static final SubLObject canon_ask_mal_resultP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = czer_main.canonicalize_ask(formula, mt);
            return com.cyc.cycjava.cycl.czer_utilities.canon_form_mal_resultP(result);
        }
    }

    public static SubLObject canon_ask_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_ask(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static final SubLObject canon_query_mal_resultP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = czer_main.canonicalize_query(formula, mt, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.czer_utilities.canon_form_mal_resultP(result);
        }
    }

    public static SubLObject canon_query_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.canonicalize_query(formula, mt, UNPROVIDED, UNPROVIDED);
        return canon_form_mal_resultP(result);
    }

    public static final SubLObject canon_assert_mal_resultP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = czer_main.test_canonicalize_assert(formula, mt);
            return com.cyc.cycjava.cycl.czer_utilities.canon_form_mal_resultP(result);
        }
    }

    public static SubLObject canon_assert_mal_resultP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = czer_main.test_canonicalize_assert(formula, mt);
        return canon_form_mal_resultP(result);
    }

    public static final SubLObject canon_form_mal_resultP_alt(SubLObject formula) {
        return makeBoolean((NIL == formula) || ($$False == formula));
    }

    public static SubLObject canon_form_mal_resultP(final SubLObject formula) {
        return makeBoolean((NIL == formula) || (NIL != kb_utilities.kbeq($$False, formula)));
    }

    public static final SubLObject declare_czer_utilities_file_alt() {
        declareFunction("some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
        declareFunction("some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction("canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
        declareFunction("direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction("direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction("get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
        declareFunction("canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
        declareFunction("arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
        declareFunction("arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
        declareFunction("relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
        declareFunction("dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
        declareFunction("possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
        declareFunction("assertion_argP", "ASSERTION-ARG?", 2, 1, false);
        declareFunction("indexed_argP", "INDEXED-ARG?", 2, 0, false);
        declareFunction("expression_argP", "EXPRESSION-ARG?", 2, 1, false);
        declareFunction("formula_argP", "FORMULA-ARG?", 2, 1, false);
        declareFunction("clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction("remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction("remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("sentence_argP", "SENTENCE-ARG?", 2, 1, false);
        declareFunction("clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction("assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction("askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction("assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction("denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
        declareFunction("leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction("leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction("arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
        declareFunction("distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
        declareFunction("find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
        declareFunction("find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
        declareFunction("safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
        declareFunction("nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction("put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction("list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
        declareFunction("nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction("extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction("extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction("nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction("extract_blists", "EXTRACT-BLISTS", 1, 0, false);
        declareFunction("nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
        declareFunction("fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
        declareFunction("fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
        declareFunction("fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
        declareFunction("fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
        declareFunction("make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
        declareFunction("make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
        declareFunction("make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
        declareFunction("make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
        declareFunction("clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
        declareFunction("unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
        declareFunction("unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction("unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction("make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
        declareFunction("canon_varP", "CANON-VAR?", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_utilities.$canon_varP$UnaryFunction();
        declareFunction("true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
        declareFunction("true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
        declareFunction("true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
        declareFunction("true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
        declareFunction("encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
        declareFunction("encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
        declareFunction("intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
        declareFunction("make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
        declareFunction("make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
        declareFunction("make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
        declareFunction("formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
        declareFunction("relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
        declareFunction("within_negationP", "WITHIN-NEGATION?", 0, 0, false);
        declareFunction("within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
        declareFunction("within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
        declareFunction("within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
        declareFunction("commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
        declareFunction("reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
        declareFunction("reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
        declareFunction("reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction("unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction("reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
        declareFunction("fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
        declareFunction("evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction("equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
        declareFunction("equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
        declareFunction("queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
        declareFunction("equals_elP", "EQUALS-EL?", 2, 2, false);
        declareFunction("equals_el_intP", "EQUALS-EL-INT?", 5, 0, false);
        declareFunction("el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
        declareFunction("canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
        declareFunction("el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
        declareFunction("non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
        declareFunction("delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
        declareFunction("cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
        declareFunction("cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
        declareFunction("cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
        declareFunction("ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
        declareFunction("ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
        declareFunction("ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
        declareFunction("el_find_nart", "EL-FIND-NART", 1, 0, false);
        declareFunction("el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
        declareFunction("recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
        declareFunction("recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
        declareFunction("robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
        declareFunction("sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
        declareFunction("definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
        declareFunction("evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("unwrap_if_ist", "UNWRAP-IF-IST", 2, 0, false);
        declareFunction("unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
        declareFunction("unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
        declareFunction("unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
        declareFunction("unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 3, 0, false);
        declareFunction("unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 3, 0, false);
        declareFunction("unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 2, 0, false);
        declareFunction("possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
        declareFunction("unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
        declareFunction("quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_utilities.$quoted_term_with_hl_varP$UnaryFunction();
        declareFunction("escape_term", "ESCAPE-TERM", 1, 0, false);
        declareFunction("possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
        declareFunction("escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction("nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction("decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
        declareFunction("decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
        declareFunction("generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
        declareFunction("generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_utilities.$generalized_ist_clause_p$UnaryFunction();
        declareFunction("generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
        declareFunction("opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
        declareFunction("note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
        declareFunction("formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
        declareFunction("all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
        declareFunction("term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
        declareFunction("all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
        declareFunction("canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 0, false);
        declareFunction("canon_equalP", "CANON-EQUAL?", 2, 3, false);
        declareFunction("canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
        declareFunction("canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
        declareFunction("canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
        declareFunction("canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
        declareFunction("canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
        declareFunction("canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
        declareFunction("constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
        declareFunction("canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
        declareFunction("find_anywhere", "FIND-ANYWHERE", 2, 2, false);
        declareFunction("find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
        declareFunction("return_uncanon", "RETURN-UNCANON", 2, 0, false);
        declareFunction("uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
        declareFunction("uncanon_test", "UNCANON-TEST", 2, 2, false);
        declareFunction("assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
        declareFunction("canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_czer_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
            declareFunction("some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
            declareFunction("canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
            declareFunction("direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
            declareFunction("direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
            declareFunction("get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
            declareFunction("canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
            declareFunction("arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
            declareFunction("arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
            declareFunction("relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
            declareFunction("dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
            declareFunction("possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
            declareFunction("assertion_argP", "ASSERTION-ARG?", 2, 1, false);
            declareFunction("indexed_argP", "INDEXED-ARG?", 2, 0, false);
            declareFunction("expression_argP", "EXPRESSION-ARG?", 2, 1, false);
            declareFunction("assertible_expression_argP", "ASSERTIBLE-EXPRESSION-ARG?", 2, 1, false);
            declareFunction("askable_expression_argP", "ASKABLE-EXPRESSION-ARG?", 2, 1, false);
            declareFunction("formula_argP", "FORMULA-ARG?", 2, 1, false);
            declareFunction("clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
            declareFunction("remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
            declareFunction("formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
            declareFunction("formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
            declareFunction("clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
            declareFunction("remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
            declareFunction("quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
            declareFunction("quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
            declareFunction("sentence_argP", "SENTENCE-ARG?", 2, 1, false);
            declareFunction("clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
            declareFunction("remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
            declareFunction("sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
            declareFunction("sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
            declareFunction("clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
            declareFunction("remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
            declareFunction("quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
            declareFunction("quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
            declareFunction("some_sentence_argP", "SOME-SENTENCE-ARG?", 1, 1, false);
            declareFunction("clear_some_sentence_arg_intP", "CLEAR-SOME-SENTENCE-ARG-INT?", 0, 0, false);
            declareFunction("remove_some_sentence_arg_intP", "REMOVE-SOME-SENTENCE-ARG-INT?", 2, 0, false);
            declareFunction("some_sentence_arg_intP_internal", "SOME-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
            declareFunction("some_sentence_arg_intP", "SOME-SENTENCE-ARG-INT?", 2, 0, false);
            declareFunction("clear_some_quoted_sentence_arg_intP", "CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
            declareFunction("remove_some_quoted_sentence_arg_intP", "REMOVE-SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
            declareFunction("some_quoted_sentence_arg_intP_internal", "SOME-QUOTED-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
            declareFunction("some_quoted_sentence_arg_intP", "SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
            declareFunction("askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
            declareFunction("assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
            declareFunction("askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
            declareFunction("assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
            declareFunction("denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
            declareFunction("leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
            declareFunction("leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
            declareFunction("arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
            declareFunction("distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
            declareFunction("find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
            declareFunction("find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
            declareFunction("safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
            declareFunction("nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
            declareFunction("put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
            declareFunction("list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
            declareFunction("clause_binding_list_pairs_literal", "CLAUSE-BINDING-LIST-PAIRS-LITERAL", 1, 0, false);
            declareFunction("nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
            declareFunction("extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
            declareFunction("extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
            declareFunction("nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
            declareFunction("extract_blists", "EXTRACT-BLISTS", 1, 0, false);
            declareFunction("nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
            declareFunction("fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
            declareFunction("fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
            declareFunction("fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
            declareFunction("fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
            declareFunction("make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
            declareFunction("make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
            declareFunction("make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
            declareFunction("make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
            declareFunction("clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
            declareFunction("unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
            declareFunction("unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
            declareFunction("unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
            declareFunction("make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
            declareFunction("canon_varP", "CANON-VAR?", 1, 0, false);
            new czer_utilities.$canon_varP$UnaryFunction();
            declareFunction("true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
            declareFunction("true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
            declareFunction("true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
            declareFunction("true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
            declareFunction("encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
            declareFunction("encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
            declareFunction("intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
            declareFunction("make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
            declareFunction("make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
            declareFunction("make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
            declareFunction("formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
            declareFunction("relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
            declareFunction("within_negationP", "WITHIN-NEGATION?", 0, 0, false);
            declareFunction("within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
            declareFunction("within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
            declareFunction("within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
            declareFunction("commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
            declareFunction("reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
            declareFunction("reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
            declareFunction("wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
            declareFunction("reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
            declareFunction("reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
            declareFunction("unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
            declareFunction("reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
            declareFunction("fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
            declareFunction("list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
            declareFunction("naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
            declareFunction("evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
            declareFunction("evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
            declareFunction("unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
            declareFunction("unpackage_dnf_clause", "UNPACKAGE-DNF-CLAUSE", 1, 0, false);
            declareFunction("equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
            declareFunction("equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
            declareFunction("queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
            declareFunction("terms_equal_at_elP", "TERMS-EQUAL-AT-EL?", 2, 1, false);
            declareFunction("equals_elP", "EQUALS-EL?", 2, 3, false);
            declareFunction("equals_el_intP", "EQUALS-EL-INT?", 6, 0, false);
            declareFunction("el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
            declareFunction("canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
            declareFunction("el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
            declareFunction("problem_queries_equal_modulo_el_var_names", "PROBLEM-QUERIES-EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
            declareFunction("equal_modulo_el_var_names", "EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
            declareFunction("equal_modulo_el_var_names_int", "EQUAL-MODULO-EL-VAR-NAMES-INT", 3, 0, false);
            declareFunction("el_variable_token", "EL-VARIABLE-TOKEN", 0, 1, false);
            declareFunction("non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
            declareFunction("delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
            declareFunction("cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
            declareFunction("cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
            declareFunction("cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
            declareFunction("ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
            declareFunction("ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
            declareFunction("ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
            declareFunction("el_find_nart", "EL-FIND-NART", 1, 0, false);
            declareFunction("el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
            declareFunction("recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
            declareFunction("recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
            declareFunction("robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
            declareFunction("sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
            declareFunction("definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
            declareFunction("evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
            declareFunction("unwrap_if_ist", "UNWRAP-IF-IST", 2, 1, false);
            declareFunction("unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
            declareFunction("unwrap_if_ist_discard_mt", "UNWRAP-IF-IST-DISCARD-MT", 1, 1, false);
            declareFunction("unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
            declareFunction("unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
            declareFunction("unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 4, 0, false);
            declareFunction("unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 4, 1, false);
            declareFunction("unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 3, 1, false);
            declareFunction("possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
            declareFunction("unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
            declareFunction("quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false);
            new czer_utilities.$quoted_term_with_hl_varP$UnaryFunction();
            declareFunction("escape_term", "ESCAPE-TERM", 1, 0, false);
            declareFunction("possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
            declareFunction("escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
            declareFunction("nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
            declareFunction("decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
            declareFunction("decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
            declareFunction("generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
            declareFunction("generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false);
            new czer_utilities.$generalized_ist_clause_p$UnaryFunction();
            declareFunction("generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
            declareFunction("opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
            declareFunction("note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
            declareFunction("formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
            declareFunction("term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
            declareFunction("all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
            declareFunction("term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
            declareFunction("all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
            declareFunction("canonicalize_el_query", "CANONICALIZE-EL-QUERY", 1, 2, false);
            declareFunction("canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 1, false);
            declareFunction("canon_equalP", "CANON-EQUAL?", 2, 3, false);
            declareFunction("canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
            declareFunction("canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
            declareFunction("canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
            declareFunction("canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
            declareFunction("canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
            declareFunction("canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
            declareFunction("constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
            declareFunction("canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
            declareFunction("find_anywhere", "FIND-ANYWHERE", 2, 2, false);
            declareFunction("find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
            declareFunction("return_uncanon", "RETURN-UNCANON", 2, 0, false);
            declareFunction("uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
            declareFunction("uncanon_test", "UNCANON-TEST", 2, 2, false);
            declareFunction("assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
            declareFunction("canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
            declareFunction("canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
            declareFunction("canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
            declareFunction("canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
            declareFunction("canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("equals_elP", "EQUALS-EL?", 2, 2, false);
            declareFunction("equals_el_intP", "EQUALS-EL-INT?", 5, 0, false);
            declareFunction("unwrap_if_ist", "UNWRAP-IF-IST", 2, 0, false);
            declareFunction("unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 3, 0, false);
            declareFunction("unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 3, 0, false);
            declareFunction("unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 2, 0, false);
            declareFunction("canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_czer_utilities_file_Previous() {
        declareFunction("some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
        declareFunction("some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        declareFunction("canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
        declareFunction("direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction("direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
        declareFunction("get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
        declareFunction("canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
        declareFunction("arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
        declareFunction("arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
        declareFunction("relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
        declareFunction("dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
        declareFunction("possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
        declareFunction("assertion_argP", "ASSERTION-ARG?", 2, 1, false);
        declareFunction("indexed_argP", "INDEXED-ARG?", 2, 0, false);
        declareFunction("expression_argP", "EXPRESSION-ARG?", 2, 1, false);
        declareFunction("assertible_expression_argP", "ASSERTIBLE-EXPRESSION-ARG?", 2, 1, false);
        declareFunction("askable_expression_argP", "ASKABLE-EXPRESSION-ARG?", 2, 1, false);
        declareFunction("formula_argP", "FORMULA-ARG?", 2, 1, false);
        declareFunction("clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction("remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
        declareFunction("remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
        declareFunction("sentence_argP", "SENTENCE-ARG?", 2, 1, false);
        declareFunction("clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
        declareFunction("quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
        declareFunction("some_sentence_argP", "SOME-SENTENCE-ARG?", 1, 1, false);
        declareFunction("clear_some_sentence_arg_intP", "CLEAR-SOME-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_some_sentence_arg_intP", "REMOVE-SOME-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction("some_sentence_arg_intP_internal", "SOME-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        declareFunction("some_sentence_arg_intP", "SOME-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction("clear_some_quoted_sentence_arg_intP", "CLEAR-SOME-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
        declareFunction("remove_some_quoted_sentence_arg_intP", "REMOVE-SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction("some_quoted_sentence_arg_intP_internal", "SOME-QUOTED-SENTENCE-ARG-INT?-INTERNAL", 2, 0, false);
        declareFunction("some_quoted_sentence_arg_intP", "SOME-QUOTED-SENTENCE-ARG-INT?", 2, 0, false);
        declareFunction("askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction("assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
        declareFunction("askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction("assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
        declareFunction("denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
        declareFunction("leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction("leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
        declareFunction("arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
        declareFunction("distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
        declareFunction("find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
        declareFunction("find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
        declareFunction("safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
        declareFunction("nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction("put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
        declareFunction("list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
        declareFunction("clause_binding_list_pairs_literal", "CLAUSE-BINDING-LIST-PAIRS-LITERAL", 1, 0, false);
        declareFunction("nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction("extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
        declareFunction("extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction("nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
        declareFunction("extract_blists", "EXTRACT-BLISTS", 1, 0, false);
        declareFunction("nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
        declareFunction("fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
        declareFunction("fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
        declareFunction("fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
        declareFunction("fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
        declareFunction("make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
        declareFunction("make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
        declareFunction("make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
        declareFunction("make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
        declareFunction("clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
        declareFunction("unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
        declareFunction("unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction("unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
        declareFunction("make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
        declareFunction("canon_varP", "CANON-VAR?", 1, 0, false);
        new czer_utilities.$canon_varP$UnaryFunction();
        declareFunction("true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
        declareFunction("true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
        declareFunction("true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
        declareFunction("true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
        declareFunction("encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
        declareFunction("encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
        declareFunction("intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
        declareFunction("make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
        declareFunction("make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
        declareFunction("make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
        declareFunction("formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
        declareFunction("relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
        declareFunction("within_negationP", "WITHIN-NEGATION?", 0, 0, false);
        declareFunction("within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
        declareFunction("within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
        declareFunction("within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
        declareFunction("commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
        declareFunction("reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
        declareFunction("reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
        declareFunction("reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction("unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
        declareFunction("reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
        declareFunction("fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
        declareFunction("evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
        declareFunction("evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction("unpackage_dnf_clause", "UNPACKAGE-DNF-CLAUSE", 1, 0, false);
        declareFunction("equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
        declareFunction("equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
        declareFunction("queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
        declareFunction("terms_equal_at_elP", "TERMS-EQUAL-AT-EL?", 2, 1, false);
        declareFunction("equals_elP", "EQUALS-EL?", 2, 3, false);
        declareFunction("equals_el_intP", "EQUALS-EL-INT?", 6, 0, false);
        declareFunction("el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
        declareFunction("canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
        declareFunction("el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
        declareFunction("problem_queries_equal_modulo_el_var_names", "PROBLEM-QUERIES-EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        declareFunction("equal_modulo_el_var_names", "EQUAL-MODULO-EL-VAR-NAMES", 2, 0, false);
        declareFunction("equal_modulo_el_var_names_int", "EQUAL-MODULO-EL-VAR-NAMES-INT", 3, 0, false);
        declareFunction("el_variable_token", "EL-VARIABLE-TOKEN", 0, 1, false);
        declareFunction("non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
        declareFunction("delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
        declareFunction("cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
        declareFunction("cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
        declareFunction("cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
        declareFunction("ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
        declareFunction("ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
        declareFunction("ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
        declareFunction("el_find_nart", "EL-FIND-NART", 1, 0, false);
        declareFunction("el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
        declareFunction("recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
        declareFunction("recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
        declareFunction("robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
        declareFunction("sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
        declareFunction("definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
        declareFunction("evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("unwrap_if_ist", "UNWRAP-IF-IST", 2, 1, false);
        declareFunction("unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
        declareFunction("unwrap_if_ist_discard_mt", "UNWRAP-IF-IST-DISCARD-MT", 1, 1, false);
        declareFunction("unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
        declareFunction("unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
        declareFunction("unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 4, 0, false);
        declareFunction("unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 4, 1, false);
        declareFunction("unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 3, 1, false);
        declareFunction("possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
        declareFunction("unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
        declareFunction("quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false);
        new czer_utilities.$quoted_term_with_hl_varP$UnaryFunction();
        declareFunction("escape_term", "ESCAPE-TERM", 1, 0, false);
        declareFunction("possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
        declareFunction("escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction("nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
        declareFunction("decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
        declareFunction("decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
        declareFunction("generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
        declareFunction("generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false);
        new czer_utilities.$generalized_ist_clause_p$UnaryFunction();
        declareFunction("generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
        declareFunction("opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
        declareFunction("note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
        declareFunction("formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
        declareFunction("term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
        declareFunction("all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
        declareFunction("term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
        declareFunction("all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
        declareFunction("canonicalize_el_query", "CANONICALIZE-EL-QUERY", 1, 2, false);
        declareFunction("canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 1, false);
        declareFunction("canon_equalP", "CANON-EQUAL?", 2, 3, false);
        declareFunction("canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
        declareFunction("canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
        declareFunction("canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
        declareFunction("canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
        declareFunction("canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
        declareFunction("canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
        declareFunction("constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
        declareFunction("canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
        declareFunction("find_anywhere", "FIND-ANYWHERE", 2, 2, false);
        declareFunction("find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
        declareFunction("return_uncanon", "RETURN-UNCANON", 2, 0, false);
        declareFunction("uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
        declareFunction("uncanon_test", "UNCANON-TEST", 2, 2, false);
        declareFunction("assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
        declareFunction("canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
        declareFunction("canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_czer_utilities_file() {
        deflexical("*FORMULA-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SOME-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        deflexical("*SOME-QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
        defparameter("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*", NIL);
        defparameter("*OPAQUE-ARG-WRT-QUOTING-TARGET*", NIL);
        return NIL;
    }

    public static final SubLObject setup_czer_utilities_file_alt() {
        memoization_state.note_globally_cached_function($sym24$FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym29$QUOTED_FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym31$SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym34$QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_memoized_function($sym62$EQUALS_EL_MEMOIZED_);
        note_funcall_helper_function(OPAQUE_ARG_WRT_QUOTING_SEEKER);
        define_test_case_table_int($sym110$EQUALS_EL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt118);
        return NIL;
    }

    public static SubLObject setup_czer_utilities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function($sym26$FORMULA_ARG_INT_);
            memoization_state.note_globally_cached_function($sym30$QUOTED_FORMULA_ARG_INT_);
            memoization_state.note_globally_cached_function($sym32$SENTENCE_ARG_INT_);
            memoization_state.note_globally_cached_function($sym36$QUOTED_SENTENCE_ARG_INT_);
            memoization_state.note_globally_cached_function($sym39$SOME_SENTENCE_ARG_INT_);
            memoization_state.note_globally_cached_function($sym42$SOME_QUOTED_SENTENCE_ARG_INT_);
            memoization_state.note_memoized_function($sym71$EQUALS_EL_MEMOIZED_);
            note_funcall_helper_function(EL_VARIABLE_TOKEN);
            note_funcall_helper_function(OPAQUE_ARG_WRT_QUOTING_SEEKER);
            define_test_case_table_int($sym128$EQUALS_EL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list135);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym24$FORMULA_ARG_INT_);
            memoization_state.note_globally_cached_function($sym29$QUOTED_FORMULA_ARG_INT_);
            memoization_state.note_globally_cached_function($sym31$SENTENCE_ARG_INT_);
            memoization_state.note_globally_cached_function($sym34$QUOTED_SENTENCE_ARG_INT_);
            memoization_state.note_memoized_function($sym62$EQUALS_EL_MEMOIZED_);
            define_test_case_table_int($sym110$EQUALS_EL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt118);
        }
        return NIL;
    }

    public static SubLObject setup_czer_utilities_file_Previous() {
        memoization_state.note_globally_cached_function($sym26$FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym30$QUOTED_FORMULA_ARG_INT_);
        memoization_state.note_globally_cached_function($sym32$SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym36$QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym39$SOME_SENTENCE_ARG_INT_);
        memoization_state.note_globally_cached_function($sym42$SOME_QUOTED_SENTENCE_ARG_INT_);
        memoization_state.note_memoized_function($sym71$EQUALS_EL_MEMOIZED_);
        note_funcall_helper_function(EL_VARIABLE_TOKEN);
        note_funcall_helper_function(OPAQUE_ARG_WRT_QUOTING_SEEKER);
        define_test_case_table_int($sym128$EQUALS_EL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list135);
        return NIL;
    }

    private static SubLObject _constant_135_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa")), T), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing")), NIL), list(list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), T), list(list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), NIL), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")), NIL), list(list(ONE_INTEGER, ONE_INTEGER), T), list(list(ONE_INTEGER, TWO_INTEGER), NIL), list(list(ONE_INTEGER, reader_make_constant_shell("Thing")), NIL), list(list(ONE_INTEGER, makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), makeSymbol("?X")), T), list(list(makeSymbol("?X"), makeSymbol("?Y")), T), list(list(reader_make_constant_shell("Thing"), makeSymbol("?X")), NIL), list(list(makeSymbol("?X"), reader_make_constant_shell("Thing")), NIL), list(list(reader_make_constant_shell("Thing"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"))), NIL), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing"))), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Thing"))), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), TWO_INTEGER, ONE_INTEGER)), T), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), THREE_INTEGER, ONE_INTEGER)), NIL), list(list(list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell("TheSet"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("January")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("February"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("January")))), T), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("January")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("February"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("January")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("February"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("March")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("January")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("February"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("March")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("January")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("February"))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("February")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("March")))), NIL), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y"))))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), NIL), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("conceptuallyRelated"), makeSymbol("?Y"), makeSymbol("?X"))))), list(reader_make_constant_shell("thereExists"), makeSymbol("?Y"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("conceptuallyRelated"), makeSymbol("?Y"), makeSymbol("?X")))))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))))), NIL), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("forAll"), makeSymbol("?X"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), T), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?X"))), reader_make_constant_shell("BaseKB"), makeKeyword("DNF")), NIL), list(list(reader_make_constant_shell("TheEmptySet"), list(reader_make_constant_shell("TheSet"))), T), list(list(list(reader_make_constant_shell("Unity"), list(ZERO_INTEGER, reader_make_constant_shell("TheEmptySet"))), list(reader_make_constant_shell("Unity"), list(ZERO_INTEGER, list(reader_make_constant_shell("TheSet"))))), T) });
    }

    @Override
    public void declareFunctions() {
        declare_czer_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_utilities_file();
    }

    static {
    }

    public static final class $canon_varP$UnaryFunction extends UnaryFunction {
        public $canon_varP$UnaryFunction() {
            super(extractFunctionNamed("CANON-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canon_varP(arg1);
        }
    }

    public static final class $quoted_term_with_hl_varP$UnaryFunction extends UnaryFunction {
        public $quoted_term_with_hl_varP$UnaryFunction() {
            super(extractFunctionNamed("QUOTED-TERM-WITH-HL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return quoted_term_with_hl_varP(arg1);
        }
    }

    public static final class $generalized_ist_clause_p$UnaryFunction extends UnaryFunction {
        public $generalized_ist_clause_p$UnaryFunction() {
            super(extractFunctionNamed("GENERALIZED-IST-CLAUSE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generalized_ist_clause_p(arg1);
        }
    }

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("LeaveVariablesAtEL"));

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("LeaveSomeTermsAtEL"), reader_make_constant_shell("AllowKeywordVariables"));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("AllowGenericArgVariables"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("LeaveSomeTermsAtEL"));

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("LeaveSomeTermsAtELAndAllowKeywordVariables"));

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("AllowKeywordVariables"));

    static private final SubLString $str_alt17$X__d = makeString("X-~d");

    static private final SubLString $str_alt19$_a_was_not_a_canonical_variable = makeString("~a was not a canonical variable");

    static private final SubLSymbol $sym24$FORMULA_ARG_INT_ = makeSymbol("FORMULA-ARG-INT?");

    static private final SubLSymbol $sym26$_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");

    public static final SubLSymbol $kw28$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym29$QUOTED_FORMULA_ARG_INT_ = makeSymbol("QUOTED-FORMULA-ARG-INT?");

    static private final SubLSymbol $sym30$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");

    static private final SubLSymbol $sym31$SENTENCE_ARG_INT_ = makeSymbol("SENTENCE-ARG-INT?");

    static private final SubLSymbol $sym33$_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");

    static private final SubLSymbol $sym34$QUOTED_SENTENCE_ARG_INT_ = makeSymbol("QUOTED-SENTENCE-ARG-INT?");

    static private final SubLSymbol $sym35$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");

    static private final SubLSymbol $sym49$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt51$__s = makeString("-~s");

    static private final SubLSymbol $sym52$_X = makeSymbol("?X");

    static private final SubLString $str_alt53$Could_not_create_a_unique_HL_var_ = makeString("Could not create a unique HL var wrt ~a");

    static private final SubLSymbol $sym55$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym59$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");

    static private final SubLSymbol $sym62$EQUALS_EL_MEMOIZED_ = makeSymbol("EQUALS-EL-MEMOIZED?");

    static private final SubLString $str_alt67$Unexpected_clausal_form__s = makeString("Unexpected clausal form ~s");

    static private final SubLSymbol $sym68$NON_NULL_CLOSED_TERM_ = makeSymbol("NON-NULL-CLOSED-TERM?");

    static private final SubLString $str_alt70$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym71$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_ = makeSymbol("RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?");

    static private final SubLSymbol $sym74$EVALUATABLE_EXPRESSION_ = makeSymbol("EVALUATABLE-EXPRESSION?");

    static private final SubLString $str_alt76$_s__s_does_not_adequately_specify = makeString("~s ~s does not adequately specify a microtheory.");

    static private final SubLSymbol $sym77$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLSymbol $sym79$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");

    static private final SubLSymbol $sym81$DECONTEXTUALIZED_CLAUSE_ = makeSymbol("DECONTEXTUALIZED-CLAUSE?");

    static private final SubLList $list_alt83 = list(reader_make_constant_shell("ist"), reader_make_constant_shell("ist-Asserted"));

    static private final SubLSymbol $sym93$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");

    static private final SubLString $str_alt96$__Error__assert_failed__S___ = makeString("~%Error: assert failed ~S.~%");

    static private final SubLString $str_alt97$__Error__Can_t_find_assertion___ = makeString("~%Error: Can't find assertion:~%");

    static private final SubLString $str_alt99$__Form___A_in__A__ = makeString("~%Form: ~A in ~A~%");

    static private final SubLString $str_alt100$__Error__assert_failed__ = makeString("~%Error: assert failed~%");

    static private final SubLString $str_alt101$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A~%");

    static private final SubLString $str_alt102$__The_assertion_is__S___ = makeString("~%The assertion is ~S.~%");

    static private final SubLString $str_alt103$__Its_EL_form_is__S_in__S___ = makeString("~%Its EL form is ~S in ~S.~%");

    static private final SubLString $str_alt104$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A in ~A~%");

    static private final SubLString $str_alt105$__Its_New_EL_form_is__S_in__S___ = makeString("~%Its New EL form is ~S in ~S.~%");

    static private final SubLString $str_alt106$__Error__EL_mismatch___Original__ = makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");

    static private final SubLString $str_alt107$__Error__assert_failed___S__ = makeString("~%Error: assert failed: ~S~%");

    static private final SubLString $str_alt108$__Error__unassert_failed___S__ = makeString("~%Error: unassert failed: ~S~%");

    static private final SubLSymbol $sym110$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLString $$$pace = makeString("pace");

    public static final SubLObject $list_alt118 = com.cyc.cycjava.cycl.czer_utilities._constant_118_initializer();
}

/**
 * Total time: 1182 ms
 */
