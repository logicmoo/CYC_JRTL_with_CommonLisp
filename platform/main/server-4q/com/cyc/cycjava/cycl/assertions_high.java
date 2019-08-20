/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.clauses.atomic_clause_p;
import static com.cyc.cycjava.cycl.clauses.cnf_formula;
import static com.cyc.cycjava.cycl.clauses.cnf_p;
import static com.cyc.cycjava.cycl.clauses.ground_clause_p;
import static com.cyc.cycjava.cycl.clauses.lifting_clause_p;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_forts;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg0;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_constants;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_forts;
import static com.cyc.cycjava.cycl.cycl_utilities.negate;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.set_contents.new_set_contents;
import static com.cyc.cycjava.cycl.set_contents.set_contents_add;
import static com.cyc.cycjava.cycl.set_contents.set_contents_element_list;
import static com.cyc.cycjava.cycl.set_contents.set_contents_size;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ASSERTIONS-HIGH
 * source file: /cyc/top/cycl/assertions-high.lisp
 * created:     2019/07/03 17:37:21
 */
public final class assertions_high extends SubLTranslatedFile implements V12 {
    public static final SubLObject timestamp_asserted_assertion_int(SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.assertions_high.asserted_assertionP(assertion)) {
            assertions_interface.kb_set_assertion_asserted_by(assertion, who);
            assertions_interface.kb_set_assertion_asserted_when(assertion, when);
            assertions_interface.kb_set_assertion_asserted_why(assertion, why);
            assertions_interface.kb_set_assertion_asserted_second(assertion, second);
        }
        return assertion;
    }

    public static final SubLFile me = new assertions_high();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tl_assertion_capacity$ = makeSymbol("*TL-ASSERTION-CAPACITY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $assertion_dump_id_table$ = makeSymbol("*ASSERTION-DUMP-ID-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");

    static private final SubLList $list6 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol ASSERTION_DEPENDENTS = makeSymbol("ASSERTION-DEPENDENTS");

    static private final SubLList $list9 = list(list(makeSymbol("LIT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list10 = list(makeKeyword("SENSE"), makeKeyword("PREDICATE"), $DONE);

    private static final SubLSymbol $sym13$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    private static final SubLSymbol DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");

    private static final SubLSymbol $sym18$CNF_VAR = makeUninternedSymbol("CNF-VAR");

    private static final SubLSymbol $sym19$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol ASSERTION_CNF = makeSymbol("ASSERTION-CNF");

    private static final SubLSymbol DO_ALL_LITS_AS_ASENTS = makeSymbol("DO-ALL-LITS-AS-ASENTS");

    static private final SubLList $list22 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping assertions for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list23 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLString $$$mapping_assertions_for_sweep = makeString("mapping assertions for sweep");

    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol ASSERTIONS_AROUND = makeSymbol("ASSERTIONS-AROUND");

    static private final SubLList $list31 = list(makeSymbol("NEXT-ASSERTION-ID"));

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    static private final SubLList $list34 = list(makeSymbol("ASSERTION"));

    private static final SubLString $str35$Return_the_cnf_of_ASSERTION______ = makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");

    private static final SubLList $list36 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list37 = list(makeSymbol("CNF-P"));

    private static final SubLString $str40$Return_the_mt_of_ASSERTION_ = makeString("Return the mt of ASSERTION.");

    private static final SubLList $list41 = list(makeSymbol("HLMT-P"));

    private static final SubLSymbol ASSERTION_DIRECTION = makeSymbol("ASSERTION-DIRECTION");

    private static final SubLString $str43$Return_the_direction_of_ASSERTION = makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");

    private static final SubLList $list44 = list(makeSymbol("DIRECTION-P"));

    private static final SubLSymbol ASSERTION_TRUTH = makeSymbol("ASSERTION-TRUTH");

    private static final SubLString $str46$Return_the_current_truth_of_ASSER = makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");

    private static final SubLList $list47 = list(makeSymbol("TRUTH-P"));

    private static final SubLSymbol ASSERTION_STRENGTH = makeSymbol("ASSERTION-STRENGTH");

    private static final SubLString $str49$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");

    private static final SubLList $list50 = list(makeSymbol("EL-STRENGTH-P"));

    private static final SubLSymbol ASSERTION_VARIABLE_NAMES = makeSymbol("ASSERTION-VARIABLE-NAMES");

    private static final SubLString $str52$Return_the_variable_names_for_ASS = makeString("Return the variable names for ASSERTION.");

    private static final SubLList $list53 = list(makeSymbol("LISTP"));

    private static final SubLSymbol ASSERTED_BY = makeSymbol("ASSERTED-BY");

    private static final SubLString $str55$Returns_the_cyclist_who_asserted_ = makeString("Returns the cyclist who asserted ASSERTION.");

    private static final SubLString $str57$Returns_the_day_when_ASSERTION_wa = makeString("Returns the day when ASSERTION was asserted.");

    private static final SubLList $list58 = list(makeSymbol("INTEGERP"));

    private static final SubLString $str60$Return_a_formula_for_ASSERTION_ = makeString("Return a formula for ASSERTION.");

    private static final SubLList $list61 = list(makeSymbol("EL-FORMULA-P"));



    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    private static final SubLString $str64$Return_a_formula_in___ist_format_ = makeString("Return a formula in #$ist format for ASSERTION.");

    private static final SubLSymbol $sym66$ASSERTION_MENTIONS_TERM_ = makeSymbol("ASSERTION-MENTIONS-TERM?");

    private static final SubLList $list67 = list(makeSymbol("ASSERTION"), makeSymbol("TERM"));

    private static final SubLString $str68$Return_T_iff_ASSERTION_s_formula_ = makeString("Return T iff ASSERTION\'s formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");

    private static final SubLList $list69 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    private static final SubLList $list70 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol ASSERTION_MENTIONS_TERM = makeSymbol("ASSERTION-MENTIONS-TERM");

    private static final SubLString $str72$_see_assertion_mentions_term_ = makeString("@see assertion-mentions-term?");



    private static final SubLSymbol $sym74$KB_TMS_METHOD_ = makeSymbol("KB-TMS-METHOD?");

    private static final SubLList $list75 = list(reader_make_constant_shell("reconsiderAssertionDeductions"), reader_make_constant_shell("repropagateAssertion"));

    private static final SubLList $list76 = list(makeSymbol("TMS-RECONSIDER-ASSERTION-DEDUCTIONS"), makeSymbol("REPROPAGATE-FORWARD-ASSERTION"));

    private static final SubLString $str79$Could_not_determine_assertion_typ = makeString("Could not determine assertion type for ~S");

    private static final SubLSymbol ASSERTION_TYPE_P = makeSymbol("ASSERTION-TYPE-P");

    private static final SubLSymbol ASSERTION_HAS_TYPE = makeSymbol("ASSERTION-HAS-TYPE");

    private static final SubLList $list82 = list(makeSymbol("ASSERTION-HAS-TYPE?"));

    private static final SubLSymbol $sym83$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol GAF_PREDICATE = makeSymbol("GAF-PREDICATE");

    private static final SubLString $str85$Return_the_predicate_of_gaf_ASSER = makeString("Return the predicate of gaf ASSERTION.");

    private static final SubLSymbol GAF_ARG0 = makeSymbol("GAF-ARG0");

    private static final SubLString $str87$Return_arg_0__the_predicate__of_t = makeString("Return arg 0 (the predicate) of the gaf ASSERTION.");

    private static final SubLString $str89$Return_arg_1_of_the_gaf_ASSERTION = makeString("Return arg 1 of the gaf ASSERTION.");

    private static final SubLString $str91$Return_arg_2_of_the_gaf_ASSERTION = makeString("Return arg 2 of the gaf ASSERTION.");

    private static final SubLSymbol GAF_ARG3 = makeSymbol("GAF-ARG3");

    private static final SubLString $str93$Return_arg_3_of_the_gaf_ASSERTION = makeString("Return arg 3 of the gaf ASSERTION.");

    private static final SubLSymbol GAF_ARG4 = makeSymbol("GAF-ARG4");

    private static final SubLString $str95$Return_arg_4_of_the_gaf_ASSERTION = makeString("Return arg 4 of the gaf ASSERTION.");

    private static final SubLSymbol GAF_ARG5 = makeSymbol("GAF-ARG5");

    private static final SubLString $str97$Return_arg_5_of_the_gaf_ASSERTION = makeString("Return arg 5 of the gaf ASSERTION.");

    private static final SubLSymbol ASSERTION_HAS_DIRECTION = makeSymbol("ASSERTION-HAS-DIRECTION");

    private static final SubLList $list100 = list(makeSymbol("ASSERTION-HAS-DIRECTION?"));

    private static final SubLSymbol $sym102$FORWARD_ASSERTION_ = makeSymbol("FORWARD-ASSERTION?");

    private static final SubLString $str103$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :FORWARD.");

    private static final SubLSymbol $sym105$BACKWARD_ASSERTION_ = makeSymbol("BACKWARD-ASSERTION?");

    private static final SubLString $str106$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :BACKWARD.");

    private static final SubLSymbol $sym108$CODE_ASSERTION_ = makeSymbol("CODE-ASSERTION?");

    private static final SubLString $str109$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :CODE.");

    private static final SubLSymbol $sym111$ASSERTION_HAS_TRUTH_ = makeSymbol("ASSERTION-HAS-TRUTH?");

    private static final SubLList $list112 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"));

    private static final SubLString $str113$Return_T_iff_ASSERTION_s_current_ = makeString("Return T iff ASSERTION's current truth is TRUTH.");

    private static final SubLList $list114 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    private static final SubLSymbol ASSERTION_HAS_TRUTH = makeSymbol("ASSERTION-HAS-TRUTH");

    private static final SubLString $str116$_see_assertion_has_truth_ = makeString("@see assertion-has-truth?");

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLSymbol GENERALIZED_DATE_P = makeSymbol("GENERALIZED-DATE-P");

    private static final SubLSymbol $sym119$ASSERTION_ASSERTED_DATE_ = makeSymbol("ASSERTION-ASSERTED-DATE?");

    private static final SubLSymbol INTERN_EL_VAR = makeSymbol("INTERN-EL-VAR");

    private static final SubLSymbol MAKE_VARIABLE_BINDING = makeSymbol("MAKE-VARIABLE-BINDING");

    private static final SubLSymbol TL_TIMESTAMP_ASSERTED_ASSERTION = makeSymbol("TL-TIMESTAMP-ASSERTED-ASSERTION");

    private static final SubLSymbol $tl_assertion_lookaside_table$ = makeSymbol("*TL-ASSERTION-LOOKASIDE-TABLE*");

    private static final SubLList $list128 = list(makeSymbol("VALID-ASSERTION?"));

    private static final SubLSymbol INVALID_ASSERTION = makeSymbol("INVALID-ASSERTION");

    private static final SubLList $list130 = list(makeSymbol("INVALID-ASSERTION?"));

    private static final SubLString $str139$Removing_broken_assertions__pass_ = makeString("Removing broken assertions: pass ~S");

    private static final SubLString $str143$_______removed_assertion___A__rea = makeString("~& ... removed assertion #~A (reason = ~S) ...~%");

    private static final SubLList $list145 = list(NIL);

    private static final SubLSymbol $sym148$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");

    private static final SubLSymbol $INVALID_SENTENCE_TERM = makeKeyword("INVALID-SENTENCE-TERM");

    private static final SubLSymbol $INVALID_MT_TERM = makeKeyword("INVALID-MT-TERM");

    private static final SubLSymbol $BAD_VAR_NAMES = makeKeyword("BAD-VAR-NAMES");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $NOT_AN_ASSERTION = makeKeyword("NOT-AN-ASSERTION");

    private static final SubLSymbol ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");

    private static final SubLSymbol NOT_EQL = makeSymbol("NOT-EQL");

    private static final SubLSymbol $sym160$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLString $str161$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has an asserted argument.");

    private static final SubLSymbol $sym163$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    private static final SubLString $str164$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has some deduced argument");

    private static final SubLSymbol $sym165$FORWARD_DEDUCTION_ = makeSymbol("FORWARD-DEDUCTION?");

    private static final SubLSymbol $sym166$FORWARD_NOT_CODE_DEDUCTION_ = makeSymbol("FORWARD-NOT-CODE-DEDUCTION?");

    private static final SubLSymbol GET_ASSERTED_ARGUMENT = makeSymbol("GET-ASSERTED-ARGUMENT");

    private static final SubLString $str168$Return_the_asserted_argument_for_ = makeString("Return the asserted argument for ASSERTION, or nil if none present.");

    private static final SubLList $list169 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTED-ARGUMENT-P")));

    private static final SubLSymbol ASSERTION_HAS_DEPENDENTS_P = makeSymbol("ASSERTION-HAS-DEPENDENTS-P");

    private static final SubLString $str171$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has dependents.");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLList $list174 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));

    private static final SubLList $list175 = list(list(makeSymbol("*ASSERTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*"), list(QUOTE, makeSymbol("ASSERTION-DUMP-ID"))));

    // Definitions
    /**
     * Iterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.
     * ARGUMENT-VAR is bound to an argument
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.\r\nARGUMENT-VAR is bound to an argument\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.\nARGUMENT-VAR is bound to an argument\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_assertion_arguments_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argument_var = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    argument_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    assertion = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(argument_var, list(ASSERTION_ARGUMENTS, assertion), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * Iterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.
     * ARGUMENT-VAR is bound to an argument
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.\r\nARGUMENT-VAR is bound to an argument\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all the arguments of ASSERTION, executing BODY within the scope of ARGUMENT-VAR.\nARGUMENT-VAR is bound to an argument\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_assertion_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_var = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        argument_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(argument_var, list(ASSERTION_ARGUMENTS, assertion), $DONE, done), append(body, NIL));
    }

    /**
     * Iterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.
     * DEDUCTION-VAR is bound to an argument
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.\r\nDEDUCTION-VAR is bound to an argument\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.\nDEDUCTION-VAR is bound to an argument\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_assertion_dependents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject deduction_var = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    deduction_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    assertion = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_2, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(deduction_var, list(ASSERTION_DEPENDENTS, assertion), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.
     * DEDUCTION-VAR is bound to an argument
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.\r\nDEDUCTION-VAR is bound to an argument\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all the dependents of ASSERTION, executing BODY within the scope of DEDUCTION-VAR.\nDEDUCTION-VAR is bound to an argument\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_assertion_dependents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        deduction_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET_CONTENTS, list(deduction_var, list(ASSERTION_DEPENDENTS, assertion), $DONE, done), append(body, NIL));
    }

    /**
     * Iterates over all literals of the clause for ASSERTION, first negative, then positive,
     * treating them as atomic sentences.
     * If PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.
     * If SENSE is non-nil, then only literals of SENSE are included.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterates over all literals of the clause for ASSERTION, first negative, then positive,\r\ntreating them as atomic sentences.\r\nIf PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.\r\nIf SENSE is non-nil, then only literals of SENSE are included.\r\nIteration halts as soon as DONE becomes non-nil.\nIterates over all literals of the clause for ASSERTION, first negative, then positive,\ntreating them as atomic sentences.\nIf PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.\nIf SENSE is non-nil, then only literals of SENSE are included.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_assertion_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject lit_var = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    lit_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    assertion = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            if (NIL == member(current_3, $list_alt9, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt8);
                        }
                        {
                            SubLObject sense_tail = property_list_member($SENSE, current);
                            SubLObject sense = (NIL != sense_tail) ? ((SubLObject) (cadr(sense_tail))) : NIL;
                            SubLObject predicate_tail = property_list_member($PREDICATE, current);
                            SubLObject predicate = (NIL != predicate_tail) ? ((SubLObject) (cadr(predicate_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != predicate) {
                                    {
                                        SubLObject predicate_var = $sym12$PREDICATE_VAR;
                                        return list(CLET, list(list(predicate_var, predicate)), list(DO_ASSERTION_LITERALS, list(lit_var, assertion, $SENSE, sense, $DONE, done), listS(PWHEN, list(EQ, predicate_var, list(ATOMIC_SENTENCE_PREDICATE, lit_var)), append(body, NIL))));
                                    }
                                } else {
                                    {
                                        SubLObject cnf_var = $sym17$CNF_VAR;
                                        SubLObject assertion_var = $sym18$ASSERTION_VAR;
                                        return list(CLET, list(list(assertion_var, assertion)), list(CLET, list(list(cnf_var, list(ASSERTION_CNF, assertion_var))), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, cnf_var, $SENSE, sense, $DONE, done), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterates over all literals of the clause for ASSERTION, first negative, then positive,
     * treating them as atomic sentences.
     * If PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.
     * If SENSE is non-nil, then only literals of SENSE are included.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterates over all literals of the clause for ASSERTION, first negative, then positive,\r\ntreating them as atomic sentences.\r\nIf PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.\r\nIf SENSE is non-nil, then only literals of SENSE are included.\r\nIteration halts as soon as DONE becomes non-nil.\nIterates over all literals of the clause for ASSERTION, first negative, then positive,\ntreating them as atomic sentences.\nIf PREDICATE is non-nil, then only literals whose predicate is PREDICATE are included.\nIf SENSE is non-nil, then only literals of SENSE are included.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_assertion_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        lit_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$3, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject sense_tail = property_list_member($SENSE, current);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != predicate) {
            final SubLObject predicate_var = $sym13$PREDICATE_VAR;
            return list(CLET, list(list(predicate_var, predicate)), list(DO_ASSERTION_LITERALS, list(lit_var, assertion, $SENSE, sense, $DONE, done), listS(PWHEN, list(EQL, predicate_var, list(ATOMIC_SENTENCE_PREDICATE, lit_var)), append(body, NIL))));
        }
        final SubLObject cnf_var = $sym18$CNF_VAR;
        final SubLObject assertion_var = $sym19$ASSERTION_VAR;
        return list(CLET, list(list(assertion_var, assertion)), list(CLET, list(list(cnf_var, list(ASSERTION_CNF, assertion_var))), listS(DO_ALL_LITS_AS_ASENTS, list(lit_var, cnf_var, $SENSE, sense, $DONE, done), append(body, NIL))));
    }

    public static SubLObject do_recent_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$4, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject num_tail = property_list_member($NUM, current);
        final SubLObject num = (NIL != num_tail) ? cadr(num_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_assertions_for_sweep;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PIF, list(POSITIVE_INTEGER_P, num), listS(PROGRESS_CSOME, list(var, list(ASSERTIONS_AROUND, $list31, num, num), progress_message, done), append(body, NIL)), listS(DO_ASSERTIONS, list(var, progress_message, $DONE, done), append(body, NIL)));
    }

    /**
     * Return the cnf of ASSERTION.
     *
     * @unknown If you know the assertion is a gaf,
    consider using gaf-formula instead,
    if you do not explicitly need a CNF.
     */
    @LispMethod(comment = "Return the cnf of ASSERTION.\r\n\r\n@unknown If you know the assertion is a gaf,\r\nconsider using gaf-formula instead,\r\nif you do not explicitly need a CNF.")
    public static final SubLObject assertion_cnf_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_cnf(assertion))) : NIL;
    }

    /**
     * Return the cnf of ASSERTION.
     *
     * @unknown If you know the assertion is a gaf,
    consider using gaf-formula instead,
    if you do not explicitly need a CNF.
     */
    @LispMethod(comment = "Return the cnf of ASSERTION.\r\n\r\n@unknown If you know the assertion is a gaf,\r\nconsider using gaf-formula instead,\r\nif you do not explicitly need a CNF.")
    public static SubLObject assertion_cnf(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_cnf(assertion) : NIL;
    }

    /**
     * Like @xref assertion-cnf except handles negated GAFs more intuitively.
     *
     * @unknown consider promoting to assertion-cnf.
     */
    @LispMethod(comment = "Like @xref assertion-cnf except handles negated GAFs more intuitively.\r\n\r\n@unknown consider promoting to assertion-cnf.")
    public static final SubLObject intuitive_assertion_cnf_alt(SubLObject assertion) {
        if (NIL != assertion_handles.assertion_handle_validP(assertion)) {
            if ((NIL != assertion_utilities.false_assertionP(assertion)) && (NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion))) {
                return clause_utilities.make_false_gaf_cnf(com.cyc.cycjava.cycl.assertions_high.gaf_formula(assertion));
            } else {
                return assertions_interface.kb_assertion_cnf(assertion);
            }
        }
        return NIL;
    }

    /**
     * Like @xref assertion-cnf except handles negated GAFs more intuitively.
     *
     * @unknown consider promoting to assertion-cnf.
     */
    @LispMethod(comment = "Like @xref assertion-cnf except handles negated GAFs more intuitively.\r\n\r\n@unknown consider promoting to assertion-cnf.")
    public static SubLObject intuitive_assertion_cnf(final SubLObject assertion) {
        if (NIL == assertion_handles.assertion_handle_validP(assertion)) {
            return NIL;
        }
        if ((NIL != assertion_utilities.false_assertionP(assertion)) && (NIL != gaf_assertionP(assertion))) {
            return clause_utilities.make_false_gaf_cnf(gaf_formula(assertion));
        }
        return assertions_interface.kb_assertion_cnf(assertion);
    }

    public static SubLObject intuitive_cnf(final SubLObject cnf, final SubLObject truth) {
        if ((NIL != clauses.gaf_cnfP(cnf)) && ($FALSE == truth)) {
            return clause_utilities.make_false_gaf_cnf(clause_utilities.gaf_cnf_literal(cnf));
        }
        return cnf;
    }

    /**
     * Return the CNF of ASSERTION, or NIL if none can be found.
     */
    @LispMethod(comment = "Return the CNF of ASSERTION, or NIL if none can be found.")
    public static final SubLObject possibly_assertion_cnf_alt(SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_possibly_assertion_cnf(assertion))) : NIL;
    }

    /**
     * Return the CNF of ASSERTION, or NIL if none can be found.
     */
    @LispMethod(comment = "Return the CNF of ASSERTION, or NIL if none can be found.")
    public static SubLObject possibly_assertion_cnf(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_possibly_assertion_cnf(assertion) : NIL;
    }

    /**
     * Return the mt of ASSERTION.
     */
    @LispMethod(comment = "Return the mt of ASSERTION.")
    public static final SubLObject assertion_mt_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_mt(assertion))) : NIL;
    }

    /**
     * Return the mt of ASSERTION.
     */
    @LispMethod(comment = "Return the mt of ASSERTION.")
    public static SubLObject assertion_mt(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_mt(assertion) : NIL;
    }

    public static final SubLObject assertion_gaf_hl_formula_alt(SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_gaf_hl_formula(assertion))) : NIL;
    }

    public static SubLObject assertion_gaf_hl_formula(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_gaf_hl_formula(assertion) : NIL;
    }

    /**
     *
     *
     * @return listp; a cons representing ASSERTION's formula in some form,
    maybe a CNF, maybe a GAF formula, or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing ASSERTION\'s formula in some form,\r\nmaybe a CNF, maybe a GAF formula, or NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static final SubLObject assertion_cons_alt(SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_cons(assertion))) : NIL;
    }

    /**
     *
     *
     * @return listp; a cons representing ASSERTION's formula in some form,
    maybe a CNF, maybe a GAF formula, or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing ASSERTION\'s formula in some form,\r\nmaybe a CNF, maybe a GAF formula, or NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static SubLObject assertion_cons(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_cons(assertion) : NIL;
    }

    /**
     * Return T iff ASSERTION is a ground atomic formula (gaf).
     */
    @LispMethod(comment = "Return T iff ASSERTION is a ground atomic formula (gaf).")
    public static final SubLObject gaf_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.valid_assertion_handleP(assertion)) && (NIL != assertions_interface.kb_gaf_assertionP(assertion)));
    }

    /**
     * Return T iff ASSERTION is a ground atomic formula (gaf).
     */
    @LispMethod(comment = "Return T iff ASSERTION is a ground atomic formula (gaf).")
    public static SubLObject gaf_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.valid_assertion_handleP(assertion)) && (NIL != assertions_interface.kb_gaf_assertionP(assertion)));
    }

    /**
     * Return T iff ASSERTION is a rule, i.e. not a ground atomic formula (gaf).
     */
    @LispMethod(comment = "Return T iff ASSERTION is a rule, i.e. not a ground atomic formula (gaf).")
    public static final SubLObject rule_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)));
    }

    /**
     * Return T iff ASSERTION is a rule, i.e. not a ground atomic formula (gaf).
     */
    @LispMethod(comment = "Return T iff ASSERTION is a rule, i.e. not a ground atomic formula (gaf).")
    public static SubLObject rule_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.valid_assertion_handleP(assertion)) && (NIL != assertions_interface.kb_rule_assertionP(assertion)));
    }

    /**
     * Return the direction of ASSERTION (either :backward, :forward or :code).
     */
    @LispMethod(comment = "Return the direction of ASSERTION (either :backward, :forward or :code).")
    public static final SubLObject assertion_direction_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_direction(assertion))) : NIL;
    }

    /**
     * Return the direction of ASSERTION (either :backward, :forward or :code).
     */
    @LispMethod(comment = "Return the direction of ASSERTION (either :backward, :forward or :code).")
    public static SubLObject assertion_direction(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_direction(assertion) : NIL;
    }

    /**
     * Return the current truth of ASSERTION -- either :true :false or :unknown.
     */
    @LispMethod(comment = "Return the current truth of ASSERTION -- either :true :false or :unknown.")
    public static final SubLObject assertion_truth_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_truth(assertion))) : NIL;
    }

    /**
     * Return the current truth of ASSERTION -- either :true :false or :unknown.
     */
    @LispMethod(comment = "Return the current truth of ASSERTION -- either :true :false or :unknown.")
    public static SubLObject assertion_truth(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_truth(assertion) : NIL;
    }

    /**
     * Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.
     */
    @LispMethod(comment = "Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.")
    public static final SubLObject assertion_strength_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_strength(assertion))) : NIL;
    }

    /**
     * Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.
     */
    @LispMethod(comment = "Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.")
    public static SubLObject assertion_strength(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_strength(assertion) : NIL;
    }

    /**
     * Return the variable names for ASSERTION.
     */
    @LispMethod(comment = "Return the variable names for ASSERTION.")
    public static final SubLObject assertion_variable_names_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_variable_names(assertion))) : NIL;
    }

    /**
     * Return the variable names for ASSERTION.
     */
    @LispMethod(comment = "Return the variable names for ASSERTION.")
    public static SubLObject assertion_variable_names(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_variable_names(assertion) : NIL;
    }

    /**
     * Returns the cyclist who asserted ASSERTION.
     */
    @LispMethod(comment = "Returns the cyclist who asserted ASSERTION.")
    public static final SubLObject asserted_by_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_asserted_by(assertion))) : NIL;
    }

    /**
     * Returns the cyclist who asserted ASSERTION.
     */
    @LispMethod(comment = "Returns the cyclist who asserted ASSERTION.")
    public static SubLObject asserted_by(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_by(assertion) : NIL;
    }

    /**
     * Returns the day when ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the day when ASSERTION was asserted.")
    public static final SubLObject asserted_when_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_asserted_when(assertion))) : NIL;
    }

    /**
     * Returns the day when ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the day when ASSERTION was asserted.")
    public static SubLObject asserted_when(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_when(assertion) : NIL;
    }

    /**
     * Returns the reason why ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the reason why ASSERTION was asserted.")
    public static final SubLObject asserted_why_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_asserted_why(assertion))) : NIL;
    }

    /**
     * Returns the reason why ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the reason why ASSERTION was asserted.")
    public static SubLObject asserted_why(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_why(assertion) : NIL;
    }

    /**
     * Returns the second of the day when ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the second of the day when ASSERTION was asserted.")
    public static final SubLObject asserted_second_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_asserted_second(assertion))) : NIL;
    }

    /**
     * Returns the second of the day when ASSERTION was asserted.
     */
    @LispMethod(comment = "Returns the second of the day when ASSERTION was asserted.")
    public static SubLObject asserted_second(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_second(assertion) : NIL;
    }

    /**
     * Return a list of the arguments for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the arguments for ASSERTION.")
    public static final SubLObject assertion_arguments_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_arguments(assertion))) : NIL;
    }

    /**
     * Return a list of the arguments for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the arguments for ASSERTION.")
    public static SubLObject assertion_arguments(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_arguments(assertion) : NIL;
    }

    /**
     * Return a list of the dependents of ASSERTION.
     */
    @LispMethod(comment = "Return a list of the dependents of ASSERTION.")
    public static final SubLObject assertion_dependents_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? ((SubLObject) (assertions_interface.kb_assertion_dependents(assertion))) : NIL;
    }

    /**
     * Return a list of the dependents of ASSERTION.
     */
    @LispMethod(comment = "Return a list of the dependents of ASSERTION.")
    public static SubLObject assertion_dependents(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_dependents(assertion) : NIL;
    }

    public static SubLObject assertion_dependent_list(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? set_contents.set_contents_element_list(assertions_interface.kb_assertion_dependents(assertion)) : NIL;
    }

    /**
     * Cyc has its own notion of tv (truth + strength) as a legacy of when the Cyc
     * and HL sides were entangled.
     */
    @LispMethod(comment = "Cyc has its own notion of tv (truth + strength) as a legacy of when the Cyc\r\nand HL sides were entangled.\nCyc has its own notion of tv (truth + strength) as a legacy of when the Cyc\nand HL sides were entangled.")
    public static final SubLObject cyc_assertion_tv_alt(SubLObject assertion) {
        {
            SubLObject truth = com.cyc.cycjava.cycl.assertions_high.assertion_truth(assertion);
            SubLObject strength = com.cyc.cycjava.cycl.assertions_high.assertion_strength(assertion);
            return enumeration_types.tv_from_truth_strength(truth, strength);
        }
    }

    /**
     * Cyc has its own notion of tv (truth + strength) as a legacy of when the Cyc
     * and HL sides were entangled.
     */
    @LispMethod(comment = "Cyc has its own notion of tv (truth + strength) as a legacy of when the Cyc\r\nand HL sides were entangled.\nCyc has its own notion of tv (truth + strength) as a legacy of when the Cyc\nand HL sides were entangled.")
    public static SubLObject cyc_assertion_tv(final SubLObject assertion) {
        final SubLObject truth = assertion_truth(assertion);
        final SubLObject strength = assertion_strength(assertion);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }

    /**
     * Return a formula for ASSERTION.
     */
    @LispMethod(comment = "Return a formula for ASSERTION.")
    public static final SubLObject assertion_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) {
            return com.cyc.cycjava.cycl.assertions_high.gaf_el_formula(assertion);
        } else {
            {
                SubLObject cnf = com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion);
                if (NIL != cnf_p(cnf)) {
                    return cnf_formula(cnf, com.cyc.cycjava.cycl.assertions_high.assertion_truth(assertion));
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Return a formula for ASSERTION.
     */
    @LispMethod(comment = "Return a formula for ASSERTION.")
    public static SubLObject assertion_formula(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        if (NIL != gaf_assertionP(assertion)) {
            return gaf_el_formula(assertion);
        }
        final SubLObject cnf = assertion_cnf(assertion);
        if (NIL != clauses.cnf_p(cnf)) {
            return clauses.cnf_formula(cnf, assertion_truth(assertion));
        }
        return NIL;
    }

    /**
     * Return a formula in #$ist format for ASSERTION.
     */
    @LispMethod(comment = "Return a formula in #$ist format for ASSERTION.")
    public static final SubLObject assertion_ist_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list($$ist, com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion), com.cyc.cycjava.cycl.assertions_high.assertion_formula(assertion));
    }

    /**
     * Return a formula in #$ist format for ASSERTION.
     */
    @LispMethod(comment = "Return a formula in #$ist format for ASSERTION.")
    public static SubLObject assertion_ist_formula(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list($$ist, assertion_mt(assertion), assertion_formula(assertion));
    }

    public static SubLObject assertion_ist_sentence(final SubLObject assertion) {
        return assertion_ist_formula(assertion);
    }

    /**
     *
     *
     * @unknown loses information
     */
    @LispMethod(comment = "@unknown loses information")
    public static final SubLObject assertion_to_hl_assertion_spec_alt(SubLObject assertion) {
        {
            SubLObject cnf = com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion);
            SubLObject mt = com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion);
            SubLObject direction = com.cyc.cycjava.cycl.assertions_high.assertion_direction(assertion);
            SubLObject variable_map = com.cyc.cycjava.cycl.assertions_high.assertion_variable_names(assertion);
            return hl_storage_modules.new_hl_assertion_spec(cnf, mt, direction, variable_map);
        }
    }

    /**
     *
     *
     * @unknown loses information
     */
    @LispMethod(comment = "@unknown loses information")
    public static SubLObject assertion_to_hl_assertion_spec(final SubLObject assertion) {
        final SubLObject cnf = assertion_cnf(assertion);
        final SubLObject mt = assertion_mt(assertion);
        final SubLObject direction = assertion_direction(assertion);
        final SubLObject variable_map = assertion_variable_names(assertion);
        return hl_storage_modules.new_hl_assertion_spec(cnf, mt, direction, variable_map);
    }

    /**
     *
     *
     * @return listp; a list of hl-assertible-p
     */
    @LispMethod(comment = "@return listp; a list of hl-assertible-p")
    public static final SubLObject assertion_to_hl_assertibles_alt(SubLObject assertion) {
        {
            SubLObject assertibles = NIL;
            SubLObject hl_assertion_spec = com.cyc.cycjava.cycl.assertions_high.assertion_to_hl_assertion_spec(assertion);
            SubLObject v_arguments = com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion);
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                {
                    SubLObject argument_spec = arguments.argument_to_argument_spec(argument);
                    SubLObject assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, argument_spec);
                    assertibles = cons(assertible, assertibles);
                }
            }
            return assertibles;
        }
    }

    /**
     *
     *
     * @return listp; a list of hl-assertible-p
     */
    @LispMethod(comment = "@return listp; a list of hl-assertible-p")
    public static SubLObject assertion_to_hl_assertibles(final SubLObject assertion) {
        SubLObject assertibles = NIL;
        final SubLObject hl_assertion_spec = assertion_to_hl_assertion_spec(assertion);
        SubLObject cdolist_list_var;
        final SubLObject v_arguments = cdolist_list_var = assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argument_spec = arguments.argument_to_argument_spec(argument);
            final SubLObject assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, argument_spec);
            assertibles = cons(assertible, assertibles);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return assertibles;
    }

    /**
     * Return T iff ASSERTION's formula or mt contains TERM.
     * If assertion is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s formula or mt contains TERM.\r\nIf assertion is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s formula or mt contains TERM.\nIf assertion is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static final SubLObject assertion_mentions_termP_alt(SubLObject assertion, SubLObject v_term) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(v_term, HL_TERM_P);
        {
            SubLObject cons = com.cyc.cycjava.cycl.assertions_high.assertion_cons(assertion);
            if (NIL != list_utilities.tree_find(v_term, cons, symbol_function(EQUAL), UNPROVIDED)) {
                return T;
            } else {
                {
                    SubLObject mt = com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion);
                    if (NIL != list_utilities.tree_find(v_term, mt, symbol_function(EQUAL), UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), cons, UNPROVIDED)) {
                            {
                                SubLObject sub_assertions = list_utilities.tree_gather(cons, symbol_function(ASSERTION_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = sub_assertions;
                                SubLObject sub_assertion = NIL;
                                for (sub_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_assertion = cdolist_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.assertions_high.assertion_mentions_termP(sub_assertion, v_term)) {
                                        return T;
                                    }
                                }
                                return NIL;
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     * Return T iff ASSERTION's formula or mt contains TERM.
     * If assertion is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s formula or mt contains TERM.\r\nIf assertion is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s formula or mt contains TERM.\nIf assertion is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static SubLObject assertion_mentions_termP(final SubLObject assertion, final SubLObject v_term) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        final SubLObject cons = assertion_cons(assertion);
        if (NIL != list_utilities.tree_find(v_term, cons, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        final SubLObject mt = assertion_mt(assertion);
        if (NIL != list_utilities.tree_find(v_term, mt, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), cons, UNPROVIDED)) {
            SubLObject cdolist_list_var;
            final SubLObject sub_assertions = cdolist_list_var = list_utilities.tree_gather(cons, symbol_function(ASSERTION_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sub_assertion = NIL;
            sub_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertion_mentions_termP(sub_assertion, v_term)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_assertion = cdolist_list_var.first();
            } 
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @see assertion-mentions-term?
     */
    @LispMethod(comment = "@see assertion-mentions-term?")
    public static final SubLObject assertion_mentions_term_alt(SubLObject assertion, SubLObject v_term) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(v_term, HL_TERM_P);
        return com.cyc.cycjava.cycl.assertions_high.assertion_mentions_termP(assertion, v_term);
    }

    /**
     *
     *
     * @see assertion-mentions-term?
     */
    @LispMethod(comment = "@see assertion-mentions-term?")
    public static SubLObject assertion_mentions_term(final SubLObject assertion, final SubLObject v_term) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return assertion_mentions_termP(assertion, v_term);
    }

    /**
     *
     *
     * @return cnf-p or el-formula-p
    Returns the HL clause of ASSERTION if it's a gaf, otherwise returns its CNF.
     */
    @LispMethod(comment = "@return cnf-p or el-formula-p\r\nReturns the HL clause of ASSERTION if it\'s a gaf, otherwise returns its CNF.")
    public static final SubLObject assertion_cnf_or_gaf_hl_formula_alt(SubLObject assertion) {
        return NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion) ? ((SubLObject) (com.cyc.cycjava.cycl.assertions_high.assertion_gaf_hl_formula(assertion))) : com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion);
    }

    /**
     *
     *
     * @return cnf-p or el-formula-p
    Returns the HL clause of ASSERTION if it's a gaf, otherwise returns its CNF.
     */
    @LispMethod(comment = "@return cnf-p or el-formula-p\r\nReturns the HL clause of ASSERTION if it\'s a gaf, otherwise returns its CNF.")
    public static SubLObject assertion_cnf_or_gaf_hl_formula(final SubLObject assertion) {
        return NIL != gaf_assertionP(assertion) ? assertion_gaf_hl_formula(assertion) : assertion_cnf(assertion);
    }

    public static final SubLObject backward_ruleP_alt(SubLObject assertion) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertions_high.rule_assertionP(assertion)) && (NIL != com.cyc.cycjava.cycl.assertions_high.backward_assertionP(assertion)));
    }

    public static SubLObject backward_ruleP(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != backward_assertionP(assertion)));
    }

    public static final SubLObject forward_ruleP_alt(SubLObject assertion) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertions_high.rule_assertionP(assertion)) && (NIL != com.cyc.cycjava.cycl.assertions_high.forward_assertionP(assertion)));
    }

    public static SubLObject forward_ruleP(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != forward_assertionP(assertion)));
    }

    /**
     * Return T iff ASSERTION is a single-literal rule
     */
    @LispMethod(comment = "Return T iff ASSERTION is a single-literal rule")
    public static final SubLObject single_literal_ruleP_alt(SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.assertions_high.rule_assertionP(assertion)) {
            {
                SubLObject cnf = com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion);
                SubLObject pos_lit_count = length(pos_lits(cnf));
                SubLObject neg_lit_count = length(neg_lits(cnf));
                return numE(ONE_INTEGER, add(pos_lit_count, neg_lit_count));
            }
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION is a single-literal rule
     */
    @LispMethod(comment = "Return T iff ASSERTION is a single-literal rule")
    public static SubLObject single_literal_ruleP(final SubLObject assertion) {
        if (NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = length(clauses.neg_lits(cnf));
            return numE(ONE_INTEGER, add(pos_lit_count, neg_lit_count));
        }
        return NIL;
    }

    public static SubLObject single_literal_antecedent_ruleP(final SubLObject assertion) {
        if (NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = length(clauses.neg_lits(cnf));
            return makeBoolean(ONE_INTEGER.numE(pos_lit_count) && ONE_INTEGER.numE(neg_lit_count));
        }
        return NIL;
    }

    public static SubLObject two_literal_antecedent_ruleP(final SubLObject assertion) {
        if (NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = length(clauses.neg_lits(cnf));
            return makeBoolean(ONE_INTEGER.numE(pos_lit_count) && TWO_INTEGER.numE(neg_lit_count));
        }
        return NIL;
    }

    public static SubLObject forward_tms_ruleP(final SubLObject rule) {
        if (NIL != forward_ruleP(rule)) {
            final SubLObject cnf = assertion_cnf(rule);
            final SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject witness = NIL;
            if (NIL == witness) {
                SubLObject csome_list_var = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = csome_list_var.first();
                while ((NIL == witness) && (NIL != csome_list_var)) {
                    final SubLObject operator = cycl_utilities.el_formula_operator(pos_lit);
                    if ((NIL != cycl_tms_predicateP(operator)) || ((NIL != kb_utilities.kbeq(operator, $$performSubL)) && (NIL != list_utilities.tree_find_if($sym74$KB_TMS_METHOD_, pos_lit, UNPROVIDED)))) {
                        witness = pos_lit;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                } 
            }
            return list_utilities.sublisp_boolean(witness);
        }
        return NIL;
    }

    public static SubLObject cycl_tms_predicateP(final SubLObject operator) {
        return list_utilities.member_kbeqP(operator, $list75);
    }

    public static SubLObject kb_tms_methodP(final SubLObject method) {
        return makeBoolean((NIL != subl_promotions.function_symbol_p(method)) && (NIL != list_utilities.member_eqP(method, $list76)));
    }

    public static final SubLObject backward_gafP_alt(SubLObject assertion) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) && (NIL != com.cyc.cycjava.cycl.assertions_high.backward_assertionP(assertion)));
    }

    public static SubLObject backward_gafP(final SubLObject assertion) {
        return makeBoolean((NIL != gaf_assertionP(assertion)) && (NIL != backward_assertionP(assertion)));
    }

    public static final SubLObject forward_gafP_alt(SubLObject assertion) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) && (NIL != com.cyc.cycjava.cycl.assertions_high.forward_assertionP(assertion)));
    }

    public static SubLObject forward_gafP(final SubLObject assertion) {
        return makeBoolean((NIL != gaf_assertionP(assertion)) && (NIL != forward_assertionP(assertion)));
    }

    /**
     * Return the current type of ASSERTION -- either :GAF or :RULE.
     */
    @LispMethod(comment = "Return the current type of ASSERTION -- either :GAF or :RULE.")
    public static final SubLObject assertion_type_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) {
            return $GAF;
        } else {
            return $RULE;
        }
    }

    /**
     * Return the current type of ASSERTION -- either :GAF or :RULE.
     */
    @LispMethod(comment = "Return the current type of ASSERTION -- either :GAF or :RULE.")
    public static SubLObject assertion_type(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != gaf_assertionP(assertion)) {
            return $GAF;
        }
        if (NIL != rule_assertionP(assertion)) {
            return $RULE;
        }
        Errors.warn($str79$Could_not_determine_assertion_typ, assertion);
        return NIL;
    }

    /**
     * Return T iff ASSERTION has MT.
     */
    @LispMethod(comment = "Return T iff ASSERTION has MT.")
    public static final SubLObject assertion_has_mtP_alt(SubLObject assertion, SubLObject mt) {
        return hlmt.hlmt_equal(mt, com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion));
    }

    /**
     * Return T iff ASSERTION has MT.
     */
    @LispMethod(comment = "Return T iff ASSERTION has MT.")
    public static SubLObject assertion_has_mtP(final SubLObject assertion, final SubLObject mt) {
        return hlmt.hlmt_equal(mt, assertion_mt(assertion));
    }

    /**
     * Return T iff ASSERTION's current type is TYPE.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s current type is TYPE.")
    public static final SubLObject assertion_has_typeP_alt(SubLObject assertion, SubLObject type) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(type, ASSERTION_TYPE_P);
        return eq(type, com.cyc.cycjava.cycl.assertions_high.assertion_type(assertion));
    }

    /**
     * Return T iff ASSERTION's current type is TYPE.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s current type is TYPE.")
    public static SubLObject assertion_has_typeP(final SubLObject assertion, final SubLObject type) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.assertion_type_p(type) : "! enumeration_types.assertion_type_p(type) " + ("enumeration_types.assertion_type_p(type) " + "CommonSymbols.NIL != enumeration_types.assertion_type_p(type) ") + type;
        return eq(type, assertion_type(assertion));
    }

    public static final SubLObject assertion_has_type_alt(SubLObject assertion, SubLObject type) {
        return com.cyc.cycjava.cycl.assertions_high.assertion_has_typeP(assertion, type);
    }

    public static SubLObject assertion_has_type(final SubLObject assertion, final SubLObject type) {
        return assertion_has_typeP(assertion, type);
    }

    /**
     * Return T iff ASSERTION is ground, i.e. has no free variables.
     */
    @LispMethod(comment = "Return T iff ASSERTION is ground, i.e. has no free variables.")
    public static final SubLObject ground_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) || (NIL != ground_clause_p(com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion)))));
    }

    /**
     * Return T iff ASSERTION is ground, i.e. has no free variables.
     */
    @LispMethod(comment = "Return T iff ASSERTION is ground, i.e. has no free variables.")
    public static SubLObject ground_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != gaf_assertionP(assertion)) || (NIL != clauses.ground_clause_p(assertion_cnf(assertion)))));
    }

    /**
     * Return T iff ASSERTION is atomic, i.e. has only a single literal.
     */
    @LispMethod(comment = "Return T iff ASSERTION is atomic, i.e. has only a single literal.")
    public static final SubLObject atomic_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion)) || (NIL != atomic_clause_p(com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion)))));
    }

    /**
     * Return T iff ASSERTION is atomic, i.e. has only a single literal.
     */
    @LispMethod(comment = "Return T iff ASSERTION is atomic, i.e. has only a single literal.")
    public static SubLObject atomic_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != gaf_assertionP(assertion)) || (NIL != clauses.atomic_clause_p(assertion_cnf(assertion)))));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a meta-assertion.")
    public static final SubLObject meta_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), com.cyc.cycjava.cycl.assertions_high.assertion_cons(assertion), UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a meta-assertion.")
    public static SubLObject meta_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), assertion_cons(assertion), UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is an assertion that expresses a lifting rule between mts.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is an assertion that expresses a lifting rule between mts.")
    public static final SubLObject lifting_assertion_p_alt(SubLObject assertion) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertions_high.rule_assertionP(assertion)) && (NIL != lifting_clause_p(com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion))));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is an assertion that expresses a lifting rule between mts.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is an assertion that expresses a lifting rule between mts.")
    public static SubLObject lifting_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != clauses.lifting_clause_p(assertion_cnf(assertion))));
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in ASSERTION, optionally without duplicates and in no particular order.
    Optionally recurses into narts and sub-assertions, and optionally includes the mt of the assertion.
     * @unknown pace
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in ASSERTION, optionally without duplicates and in no particular order.\r\nOptionally recurses into narts and sub-assertions, and optionally includes the mt of the assertion.\r\n@unknown pace")
    public static final SubLObject assertion_forts_alt(SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject include_mtP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (include_mtP == UNPROVIDED) {
            include_mtP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject result = formula_forts(com.cyc.cycjava.cycl.assertions_high.assertion_cnf_or_gaf_hl_formula(assertion), penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
            if (NIL != include_mtP) {
                {
                    SubLObject mt_forts = expression_forts(com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, subs_tooP, UNPROVIDED);
                    result = append(result, mt_forts);
                    if (NIL != delete_duplicatesP) {
                        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in ASSERTION, optionally without duplicates and in no particular order.
    Optionally recurses into narts and sub-assertions, and optionally includes the mt of the assertion.
     * @unknown pace
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in ASSERTION, optionally without duplicates and in no particular order.\r\nOptionally recurses into narts and sub-assertions, and optionally includes the mt of the assertion.\r\n@unknown pace")
    public static SubLObject assertion_forts(final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject include_mtP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (include_mtP == UNPROVIDED) {
            include_mtP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject result = cycl_utilities.formula_forts(assertion_cnf_or_gaf_hl_formula(assertion), penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
        if (NIL != include_mtP) {
            final SubLObject mt_forts = cycl_utilities.expression_forts(assertion_mt(assertion), penetrate_hl_structuresP, subs_tooP, UNPROVIDED);
            result = append(result, mt_forts);
            if (NIL != delete_duplicatesP) {
                result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in ASSERTION, in no particular order.
    Recurses into narts and sub-assertions, and includes the mt of the assertion (if it's a constant).
     * @unknown pace
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in ASSERTION, in no particular order.\r\nRecurses into narts and sub-assertions, and includes the mt of the assertion (if it\'s a constant).\r\n@unknown pace")
    public static final SubLObject assertion_constants_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return formula_constants(list(com.cyc.cycjava.cycl.assertions_high.assertion_cnf_or_gaf_hl_formula(assertion), com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion)), T);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in ASSERTION, in no particular order.
    Recurses into narts and sub-assertions, and includes the mt of the assertion (if it's a constant).
     * @unknown pace
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in ASSERTION, in no particular order.\r\nRecurses into narts and sub-assertions, and includes the mt of the assertion (if it\'s a constant).\r\n@unknown pace")
    public static SubLObject assertion_constants(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return cycl_utilities.formula_constants(list(assertion_cnf_or_gaf_hl_formula(assertion), assertion_mt(assertion)), T);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Does not put a #$not around negated gafs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nDoes not put a #$not around negated gafs.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nDoes not put a #$not around negated gafs.")
    public static final SubLObject gaf_formula_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertions_high.gaf_hl_formula(assertion);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Does not put a #$not around negated gafs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nDoes not put a #$not around negated gafs.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nDoes not put a #$not around negated gafs.")
    public static SubLObject gaf_formula(final SubLObject assertion) {
        return gaf_hl_formula(assertion);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Does not put a #$not around negated gafs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nDoes not put a #$not around negated gafs.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nDoes not put a #$not around negated gafs.")
    public static final SubLObject gaf_hl_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, $sym65$GAF_ASSERTION_);
        return com.cyc.cycjava.cycl.assertions_high.assertion_gaf_hl_formula(assertion);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Does not put a #$not around negated gafs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nDoes not put a #$not around negated gafs.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nDoes not put a #$not around negated gafs.")
    public static SubLObject gaf_hl_formula(final SubLObject assertion) {
        assert NIL != gaf_assertionP(assertion) : "! assertions_high.gaf_assertionP(assertion) " + ("assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) ") + assertion;
        return assertion_gaf_hl_formula(assertion);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Puts a #$not around negated gafs.
     * Does not do any uncanonicalization or conversion of HL terms in args to EL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nPuts a #$not around negated gafs.\r\nDoes not do any uncanonicalization or conversion of HL terms in args to EL.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nPuts a #$not around negated gafs.\nDoes not do any uncanonicalization or conversion of HL terms in args to EL.")
    public static final SubLObject gaf_el_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, $sym65$GAF_ASSERTION_);
        return com.cyc.cycjava.cycl.assertions_high.assertion_gaf_el_formula(assertion);
    }

    /**
     * Return the formula for ASSERTION, which must be a gaf.
     * Puts a #$not around negated gafs.
     * Does not do any uncanonicalization or conversion of HL terms in args to EL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the formula for ASSERTION, which must be a gaf.\r\nPuts a #$not around negated gafs.\r\nDoes not do any uncanonicalization or conversion of HL terms in args to EL.\r\n\r\n@unknown pace\nReturn the formula for ASSERTION, which must be a gaf.\nPuts a #$not around negated gafs.\nDoes not do any uncanonicalization or conversion of HL terms in args to EL.")
    public static SubLObject gaf_el_formula(final SubLObject assertion) {
        assert NIL != gaf_assertionP(assertion) : "! assertions_high.gaf_assertionP(assertion) " + ("assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) ") + assertion;
        return assertion_gaf_el_formula(assertion);
    }

    /**
     * Returns the EL formula of ASSERTION if it's a gaf, otherwise returns nil.
     * This will return (#$not <blah>) for negated gafs.
     */
    @LispMethod(comment = "Returns the EL formula of ASSERTION if it\'s a gaf, otherwise returns nil.\r\nThis will return (#$not <blah>) for negated gafs.\nReturns the EL formula of ASSERTION if it\'s a gaf, otherwise returns nil.\nThis will return (#$not <blah>) for negated gafs.")
    public static final SubLObject assertion_gaf_el_formula_alt(SubLObject assertion) {
        {
            SubLObject formula = com.cyc.cycjava.cycl.assertions_high.assertion_gaf_hl_formula(assertion);
            return (NIL != formula) && ($FALSE == com.cyc.cycjava.cycl.assertions_high.assertion_truth(assertion)) ? ((SubLObject) (negate(formula))) : formula;
        }
    }

    /**
     * Returns the EL formula of ASSERTION if it's a gaf, otherwise returns nil.
     * This will return (#$not <blah>) for negated gafs.
     */
    @LispMethod(comment = "Returns the EL formula of ASSERTION if it\'s a gaf, otherwise returns nil.\r\nThis will return (#$not <blah>) for negated gafs.\nReturns the EL formula of ASSERTION if it\'s a gaf, otherwise returns nil.\nThis will return (#$not <blah>) for negated gafs.")
    public static SubLObject assertion_gaf_el_formula(final SubLObject assertion) {
        final SubLObject formula = assertion_gaf_hl_formula(assertion);
        return (NIL != formula) && ($FALSE == assertion_truth(assertion)) ? cycl_utilities.negate(formula) : formula;
    }

    /**
     * Return args of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return args of the gaf ASSERTION.")
    public static final SubLObject gaf_args_alt(SubLObject assertion) {
        return formula_args(com.cyc.cycjava.cycl.assertions_high.gaf_formula(assertion), UNPROVIDED);
    }

    /**
     * Return args of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return args of the gaf ASSERTION.")
    public static SubLObject gaf_args(final SubLObject assertion) {
        return cycl_utilities.formula_args(gaf_formula(assertion), UNPROVIDED);
    }

    /**
     * Return arg N of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg N of the gaf ASSERTION.")
    public static final SubLObject gaf_arg_alt(SubLObject assertion, SubLObject n) {
        return nth(n, com.cyc.cycjava.cycl.assertions_high.gaf_formula(assertion));
    }

    /**
     * Return arg N of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg N of the gaf ASSERTION.")
    public static SubLObject gaf_arg(final SubLObject assertion, final SubLObject n) {
        return nth(n, gaf_formula(assertion));
    }

    /**
     * Return the predicate of gaf ASSERTION.
     */
    @LispMethod(comment = "Return the predicate of gaf ASSERTION.")
    public static final SubLObject gaf_predicate_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return formula_arg0(com.cyc.cycjava.cycl.assertions_high.gaf_hl_formula(assertion));
    }

    /**
     * Return the predicate of gaf ASSERTION.
     */
    @LispMethod(comment = "Return the predicate of gaf ASSERTION.")
    public static SubLObject gaf_predicate(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }

    /**
     * Return arg 0 (the predicate) of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 0 (the predicate) of the gaf ASSERTION.")
    public static final SubLObject gaf_arg0_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return formula_arg0(com.cyc.cycjava.cycl.assertions_high.gaf_hl_formula(assertion));
    }

    /**
     * Return arg 0 (the predicate) of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 0 (the predicate) of the gaf ASSERTION.")
    public static SubLObject gaf_arg0(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }

    /**
     * Return arg 1 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 1 of the gaf ASSERTION.")
    public static final SubLObject gaf_arg1_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.assertions_high.gaf_arg(assertion, ONE_INTEGER);
    }

    /**
     * Return arg 1 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 1 of the gaf ASSERTION.")
    public static SubLObject gaf_arg1(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, ONE_INTEGER);
    }

    /**
     * Return arg 2 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 2 of the gaf ASSERTION.")
    public static final SubLObject gaf_arg2_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.assertions_high.gaf_arg(assertion, TWO_INTEGER);
    }

    /**
     * Return arg 2 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 2 of the gaf ASSERTION.")
    public static SubLObject gaf_arg2(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, TWO_INTEGER);
    }

    /**
     * Return arg 3 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 3 of the gaf ASSERTION.")
    public static final SubLObject gaf_arg3_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.assertions_high.gaf_arg(assertion, THREE_INTEGER);
    }

    /**
     * Return arg 3 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 3 of the gaf ASSERTION.")
    public static SubLObject gaf_arg3(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, THREE_INTEGER);
    }

    /**
     * Return arg 4 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 4 of the gaf ASSERTION.")
    public static final SubLObject gaf_arg4_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.assertions_high.gaf_arg(assertion, FOUR_INTEGER);
    }

    /**
     * Return arg 4 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 4 of the gaf ASSERTION.")
    public static SubLObject gaf_arg4(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, FOUR_INTEGER);
    }

    /**
     * Return arg 5 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 5 of the gaf ASSERTION.")
    public static final SubLObject gaf_arg5_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.assertions_high.gaf_arg(assertion, FIVE_INTEGER);
    }

    /**
     * Return arg 5 of the gaf ASSERTION.
     */
    @LispMethod(comment = "Return arg 5 of the gaf ASSERTION.")
    public static SubLObject gaf_arg5(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, FIVE_INTEGER);
    }

    /**
     * Return T iff ASSERTION has DIRECTION as its direction.
     */
    @LispMethod(comment = "Return T iff ASSERTION has DIRECTION as its direction.")
    public static final SubLObject assertion_has_directionP_alt(SubLObject assertion, SubLObject direction) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        return eq(direction, com.cyc.cycjava.cycl.assertions_high.assertion_direction(assertion));
    }

    /**
     * Return T iff ASSERTION has DIRECTION as its direction.
     */
    @LispMethod(comment = "Return T iff ASSERTION has DIRECTION as its direction.")
    public static SubLObject assertion_has_directionP(final SubLObject assertion, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        return eq(direction, assertion_direction(assertion));
    }

    public static final SubLObject assertion_has_direction_alt(SubLObject assertion, SubLObject direction) {
        return com.cyc.cycjava.cycl.assertions_high.assertion_has_directionP(assertion, direction);
    }

    public static SubLObject assertion_has_direction(final SubLObject assertion, final SubLObject direction) {
        return assertion_has_directionP(assertion, direction);
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :FORWARD.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :FORWARD.")
    public static final SubLObject forward_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($FORWARD == com.cyc.cycjava.cycl.assertions_high.assertion_direction(assertion)));
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :FORWARD.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :FORWARD.")
    public static SubLObject forward_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($FORWARD == assertion_direction(assertion)));
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :BACKWARD.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :BACKWARD.")
    public static final SubLObject backward_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($BACKWARD == com.cyc.cycjava.cycl.assertions_high.assertion_direction(assertion)));
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :BACKWARD.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :BACKWARD.")
    public static SubLObject backward_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($BACKWARD == assertion_direction(assertion)));
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :CODE.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :CODE.")
    public static final SubLObject code_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($CODE == com.cyc.cycjava.cycl.assertions_high.assertion_direction(assertion)));
    }

    /**
     * Predicate returns T iff ASSERTION's direction is :CODE.
     */
    @LispMethod(comment = "Predicate returns T iff ASSERTION\'s direction is :CODE.")
    public static SubLObject code_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($CODE == assertion_direction(assertion)));
    }

    /**
     * Return T iff ASSERTION's current truth is TRUTH.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s current truth is TRUTH.")
    public static final SubLObject assertion_has_truthP_alt(SubLObject assertion, SubLObject truth) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(truth, TRUTH_P);
        return eq(com.cyc.cycjava.cycl.assertions_high.assertion_truth(assertion), truth);
    }

    /**
     * Return T iff ASSERTION's current truth is TRUTH.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s current truth is TRUTH.")
    public static SubLObject assertion_has_truthP(final SubLObject assertion, final SubLObject truth) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        return eq(assertion_truth(assertion), truth);
    }

    /**
     *
     *
     * @see assertion-has-truth?
     */
    @LispMethod(comment = "@see assertion-has-truth?")
    public static final SubLObject assertion_has_truth_alt(SubLObject assertion, SubLObject truth) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(truth, TRUTH_P);
        return com.cyc.cycjava.cycl.assertions_high.assertion_has_truthP(assertion, truth);
    }

    /**
     *
     *
     * @see assertion-has-truth?
     */
    @LispMethod(comment = "@see assertion-has-truth?")
    public static SubLObject assertion_has_truth(final SubLObject assertion, final SubLObject truth) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        return assertion_has_truthP(assertion, truth);
    }

    /**
     *
     *
     * @return el-formula-p; a CycL date on which ASSERTION was asserted to the greatest
    degree of precision known.
     */
    @LispMethod(comment = "@return el-formula-p; a CycL date on which ASSERTION was asserted to the greatest\r\ndegree of precision known.")
    public static final SubLObject assertion_date_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject day = com.cyc.cycjava.cycl.assertions_high.asserted_when(assertion);
            SubLObject second = com.cyc.cycjava.cycl.assertions_high.asserted_second(assertion);
            if (NIL == day) {
                return NIL;
            } else {
                if (NIL == second) {
                    return date_utilities.universal_date_to_cycl_date(day);
                } else {
                    return date_utilities.extended_universal_date_to_cycl_date(add(multiply(day, $int$1000000), second));
                }
            }
        }
    }

    /**
     *
     *
     * @return el-formula-p; a CycL date on which ASSERTION was asserted to the greatest
    degree of precision known.
     */
    @LispMethod(comment = "@return el-formula-p; a CycL date on which ASSERTION was asserted to the greatest\r\ndegree of precision known.")
    public static SubLObject assertion_date(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject day = asserted_when(assertion);
        final SubLObject second = asserted_second(assertion);
        if (NIL == day) {
            return NIL;
        }
        if (NIL == second) {
            return date_utilities.universal_date_to_cycl_date(day);
        }
        return date_utilities.extended_universal_date_to_cycl_date(add(multiply(day, $int$1000000), second));
    }

    /**
     * Return T iff ASSERTION was asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return T iff ASSERTION was asserted on the date CYCL-DATE.")
    public static final SubLObject assertion_asserted_dateP_alt(SubLObject assertion, SubLObject cycl_date) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(cycl_date, GENERALIZED_DATE_P);
        {
            SubLObject ass_date = com.cyc.cycjava.cycl.assertions_high.assertion_date(assertion);
            return NIL != ass_date ? ((SubLObject) (time_interval_utilities.date_interval_subsumesP(cycl_date, ass_date))) : NIL;
        }
    }

    /**
     * Return T iff ASSERTION was asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return T iff ASSERTION was asserted on the date CYCL-DATE.")
    public static SubLObject assertion_asserted_dateP(final SubLObject assertion, final SubLObject cycl_date) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "! date_utilities.generalized_date_p(cycl_date) " + ("date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) ") + cycl_date;
        final SubLObject ass_date = assertion_date(assertion);
        return NIL != ass_date ? time_interval_utilities.date_interval_subsumesP(cycl_date, ass_date) : NIL;
    }

    /**
     * Return an iterator of all assertions asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return an iterator of all assertions asserted on the date CYCL-DATE.")
    public static final SubLObject new_assertion_asserted_date_iterator_alt(SubLObject cycl_date) {
        SubLTrampolineFile.checkType(cycl_date, GENERALIZED_DATE_P);
        {
            SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            SubLObject filter_args = list(cycl_date);
            return iteration.new_filter_iterator(input_iterator, $sym102$ASSERTION_ASSERTED_DATE_, filter_args);
        }
    }

    /**
     * Return an iterator of all assertions asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return an iterator of all assertions asserted on the date CYCL-DATE.")
    public static SubLObject new_assertion_asserted_date_iterator(final SubLObject cycl_date) {
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "! date_utilities.generalized_date_p(cycl_date) " + ("date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) ") + cycl_date;
        final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
        final SubLObject filter_args = list(cycl_date);
        return iteration.new_filter_iterator(input_iterator, $sym119$ASSERTION_ASSERTED_DATE_, filter_args);
    }

    /**
     * Return a list of all asserted assertions that were asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return a list of all asserted assertions that were asserted on the date CYCL-DATE.")
    public static final SubLObject all_assertions_asserted_date_alt(SubLObject cycl_date) {
        SubLTrampolineFile.checkType(cycl_date, GENERALIZED_DATE_P);
        {
            SubLObject assertions = NIL;
            SubLObject iterator_var = com.cyc.cycjava.cycl.assertions_high.new_assertion_asserted_date_iterator(cycl_date);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                {
                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(token_var != assertion);
                    if (NIL != valid) {
                        assertions = cons(assertion, assertions);
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            } 
            return nreverse(assertions);
        }
    }

    /**
     * Return a list of all asserted assertions that were asserted on the date CYCL-DATE.
     */
    @LispMethod(comment = "Return a list of all asserted assertions that were asserted on the date CYCL-DATE.")
    public static SubLObject all_assertions_asserted_date(final SubLObject cycl_date) {
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "! date_utilities.generalized_date_p(cycl_date) " + ("date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) ") + cycl_date;
        SubLObject assertions = NIL;
        final SubLObject iterator_var = new_assertion_asserted_date_iterator(cycl_date);
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while (NIL == done_var) {
            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
            final SubLObject valid = makeBoolean(!token_var.eql(assertion));
            if (NIL != valid) {
                assertions = cons(assertion, assertions);
            }
            done_var = makeBoolean(NIL == valid);
        } 
        return nreverse(assertions);
    }

    /**
     * Return a list of the EL variables, for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the EL variables, for ASSERTION.")
    public static final SubLObject assertion_el_variables_alt(SubLObject assertion) {
        return Mapping.mapcar(symbol_function(INTERN_EL_VAR), com.cyc.cycjava.cycl.assertions_high.assertion_variable_names(assertion));
    }

    /**
     * Return a list of the EL variables, for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the EL variables, for ASSERTION.")
    public static SubLObject assertion_el_variables(final SubLObject assertion) {
        return Mapping.mapcar(symbol_function(INTERN_EL_VAR), assertion_variable_names(assertion));
    }

    /**
     * Return a list of the HL variables, for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the HL variables, for ASSERTION.")
    public static final SubLObject assertion_hl_variables_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return NIL != com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(assertion) ? ((SubLObject) (NIL)) : variables.gather_hl_variables(com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion));
    }

    /**
     * Return a list of the HL variables, for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the HL variables, for ASSERTION.")
    public static SubLObject assertion_hl_variables(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return NIL != gaf_assertionP(assertion) ? NIL : variables.gather_hl_variables(assertion_cnf(assertion));
    }

    /**
     * Return a list of the HL variables which are free in ASSERTION.
     */
    @LispMethod(comment = "Return a list of the HL variables which are free in ASSERTION.")
    public static final SubLObject assertion_free_hl_variables_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return backward_utilities.inference_clause_free_variables(com.cyc.cycjava.cycl.assertions_high.assertion_cnf(assertion));
    }

    /**
     * Return a list of the HL variables which are free in ASSERTION.
     */
    @LispMethod(comment = "Return a list of the HL variables which are free in ASSERTION.")
    public static SubLObject assertion_free_hl_variables(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return backward_utilities.inference_clause_free_variables(assertion_cnf(assertion));
    }

    /**
     * Return the corresponding HL variable for EL-VARIABLE in ASSERTION, if one exists.
     */
    @LispMethod(comment = "Return the corresponding HL variable for EL-VARIABLE in ASSERTION, if one exists.")
    public static final SubLObject assertion_el_variable_to_hl_alt(SubLObject assertion, SubLObject el_variable) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(el_variable, EL_VARIABLE_P);
        {
            SubLObject variable_names = com.cyc.cycjava.cycl.assertions_high.assertion_variable_names(assertion);
            SubLObject el_variable_name = cycl_variables.el_var_name(el_variable);
            SubLObject hl_variable_id = position(el_variable_name, variable_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != hl_variable_id) {
                return variables.find_variable_by_id(hl_variable_id);
            }
        }
        return NIL;
    }

    /**
     * Return the corresponding HL variable for EL-VARIABLE in ASSERTION, if one exists.
     */
    @LispMethod(comment = "Return the corresponding HL variable for EL-VARIABLE in ASSERTION, if one exists.")
    public static SubLObject assertion_el_variable_to_hl(final SubLObject assertion, final SubLObject el_variable) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != cycl_grammar.el_variable_p(el_variable) : "! cycl_grammar.el_variable_p(el_variable) " + ("cycl_grammar.el_variable_p(el_variable) " + "CommonSymbols.NIL != cycl_grammar.el_variable_p(el_variable) ") + el_variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject el_variable_name = cycl_variables.el_var_name(el_variable);
        final SubLObject hl_variable_id = position(el_variable_name, variable_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_variable_id) {
            return variables.find_variable_by_id(hl_variable_id);
        }
        return NIL;
    }

    /**
     * Return the corresponding EL variable for HL VARIABLE in ASSERTION, if one exists.
     */
    @LispMethod(comment = "Return the corresponding EL variable for HL VARIABLE in ASSERTION, if one exists.")
    public static final SubLObject assertion_hl_variable_to_el_alt(SubLObject assertion, SubLObject variable) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(variable, VARIABLE_P);
        {
            SubLObject variable_names = com.cyc.cycjava.cycl.assertions_high.assertion_variable_names(assertion);
            SubLObject hl_variable_id = variables.variable_id(variable);
            SubLObject el_variable_name = nth(hl_variable_id, variable_names);
            if (el_variable_name.isString()) {
                return cycl_variables.make_el_var(el_variable_name);
            }
        }
        return NIL;
    }

    /**
     * Return the corresponding EL variable for HL VARIABLE in ASSERTION, if one exists.
     */
    @LispMethod(comment = "Return the corresponding EL variable for HL VARIABLE in ASSERTION, if one exists.")
    public static SubLObject assertion_hl_variable_to_el(final SubLObject assertion, final SubLObject variable) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != variables.variable_p(variable) : "! variables.variable_p(variable) " + ("variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) ") + variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject hl_variable_id = variables.variable_id(variable);
        final SubLObject el_variable_name = nth(hl_variable_id, variable_names);
        if (el_variable_name.isString()) {
            return cycl_variables.make_el_var(el_variable_name);
        }
        return NIL;
    }

    public static SubLObject assertion_hl_to_el_variable_map(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), assertion_hl_variables(assertion), new SubLObject[]{ assertion_el_variables(assertion) });
    }

    public static final SubLObject timestamp_asserted_assertion_alt(SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
                kb_control_vars.record_hl_transcript_operation(list(TL_TIMESTAMP_ASSERTED_ASSERTION, canon_tl.tl_quotify(assertion), list_utilities.quotify(who), list_utilities.quotify(when), list_utilities.quotify(why), list_utilities.quotify(second)));
            }
            return com.cyc.cycjava.cycl.assertions_high.timestamp_asserted_assertion_int(assertion, who, when, why, second);
        }
    }

    public static SubLObject timestamp_asserted_assertion(final SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation(list(TL_TIMESTAMP_ASSERTED_ASSERTION, canon_tl.tl_quotify(assertion), list_utilities.quotify(who), list_utilities.quotify(when), list_utilities.quotify(why), list_utilities.quotify(second)));
        }
        return assertions_interface.kb_timestamp_asserted_assertion(assertion, who, when, why, second);
    }

    public static final SubLObject remove_asserted_assertion_timestamp_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject result = assertions_low.asserted_assertion_timestampedP(assertion);
            com.cyc.cycjava.cycl.assertions_high.timestamp_asserted_assertion(assertion, NIL, NIL, NIL, NIL);
            return result;
        }
    }

    public static SubLObject remove_asserted_assertion_timestamp(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject result = assertions_low.asserted_assertion_timestampedP(assertion);
        timestamp_asserted_assertion(assertion, NIL, NIL, NIL, NIL);
        return result;
    }

    public static final SubLObject tl_timestamp_asserted_assertion_alt(SubLObject tl_assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        return com.cyc.cycjava.cycl.assertions_high.timestamp_asserted_assertion(com.cyc.cycjava.cycl.assertions_high.tl_find_assertion(tl_assertion), canon_tl.transform_tl_terms_to_hl(who), canon_tl.transform_tl_terms_to_hl(when), canon_tl.transform_tl_terms_to_hl(why), canon_tl.transform_tl_terms_to_hl(second));
    }

    public static SubLObject tl_timestamp_asserted_assertion(final SubLObject tl_assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second) {
        return timestamp_asserted_assertion(tl_find_assertion(tl_assertion), canon_tl.transform_tl_terms_to_hl(who), canon_tl.transform_tl_terms_to_hl(when), canon_tl.transform_tl_terms_to_hl(why), canon_tl.transform_tl_terms_to_hl(second));
    }

    public static final SubLObject tl_cache_assertion_alt(SubLObject tl_assertion, SubLObject hl_assertion) {
        $tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, hl_assertion, $tl_assertion_capacity$.getGlobalValue(), symbol_function(EQUAL)));
        return tl_assertion;
    }

    public static SubLObject tl_cache_assertion(final SubLObject tl_assertion, final SubLObject hl_assertion) {
        $tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, hl_assertion, $tl_assertion_capacity$.getGlobalValue(), symbol_function(EQUAL)));
        return tl_assertion;
    }

    public static final SubLObject tl_find_assertion_alt(SubLObject tl_assertion) {
        {
            SubLObject hl_assertion = list_utilities.alist_lookup_without_values($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != hl_assertion) {
                $tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_promote($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, symbol_function(EQUAL)));
            } else {
                hl_assertion = canon_tl.tl_term_to_hl(tl_assertion);
                com.cyc.cycjava.cycl.assertions_high.tl_cache_assertion(tl_assertion, hl_assertion);
            }
            return hl_assertion;
        }
    }

    public static SubLObject tl_find_assertion(final SubLObject tl_assertion) {
        SubLObject hl_assertion = list_utilities.alist_lookup_without_values($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != hl_assertion) {
            $tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_promote($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, symbol_function(EQUAL)));
        } else {
            hl_assertion = canon_tl.tl_term_to_hl(tl_assertion);
            tl_cache_assertion(tl_assertion, hl_assertion);
        }
        return hl_assertion;
    }

    public static final SubLObject invalid_assertionP_alt(SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)));
    }

    public static SubLObject invalid_assertionP(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)));
    }

    public static final SubLObject invalid_assertion_robustP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertions_low.valid_assertion_robustP(assertion)));
    }

    public static SubLObject invalid_assertion_robustP(final SubLObject assertion) {
        final SubLObject invalidP = makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertions_low.valid_assertion_robustP(assertion)));
        if (NIL == invalidP) {
            SubLObject cdolist_list_var;
            final SubLObject narts = cdolist_list_var = cycl_utilities.expression_gather(assertion, symbol_function(NART_P), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject nart = NIL;
            nart = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != narts_high.invalid_nart_robustP(nart)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                nart = cdolist_list_var.first();
            } 
        }
        return invalidP;
    }

    public static final SubLObject valid_assertion_alt(SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return assertion_handles.valid_assertionP(assertion, UNPROVIDED);
    }

    public static SubLObject valid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return assertion_handles.valid_assertionP(assertion, UNPROVIDED);
    }

    public static final SubLObject invalid_assertion_alt(SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return com.cyc.cycjava.cycl.assertions_high.invalid_assertionP(assertion, UNPROVIDED);
    }

    public static SubLObject invalid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return invalid_assertionP(assertion, UNPROVIDED);
    }

    public static final SubLObject assertion_id_from_recipe_alt(SubLObject cnf, SubLObject mt) {
        {
            SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
            return NIL != assertion ? ((SubLObject) (assertion_handles.assertion_id(assertion))) : NIL;
        }
    }

    public static SubLObject assertion_id_from_recipe(final SubLObject cnf, final SubLObject mt) {
        final SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
        return NIL != assertion_handles.assertion_p(assertion) ? assertion_handles.assertion_id(assertion) : NIL;
    }

    public static SubLObject assertions_around_assertion(final SubLObject assertion, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return assertions_around(assertion_handles.assertion_id(assertion), total, before, after);
    }

    public static SubLObject assertions_around(final SubLObject assertion_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != subl_promotions.non_negative_integer_p(assertion_id) : "! subl_promotions.non_negative_integer_p(assertion_id) " + ("subl_promotions.non_negative_integer_p(assertion_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(assertion_id) ") + assertion_id;
        return kb_objects_around_id(FIND_ASSERTION_BY_ID, ZERO_INTEGER, assertion_id, assertion_handles.next_assertion_id(), total, before, after);
    }

    public static SubLObject kb_objects_around_id(final SubLObject lookup_method, final SubLObject min_id, SubLObject focal_id, final SubLObject high_limit, final SubLObject total, SubLObject before, SubLObject after) {
        SubLObject before_objects = NIL;
        SubLObject after_objects = NIL;
        SubLObject before_sofar = ZERO_INTEGER;
        SubLObject after_sofar = ZERO_INTEGER;
        focal_id = max(ZERO_INTEGER, min(focal_id, high_limit));
        before = min(before, total);
        after = min(after, total);
        SubLObject doneP = makeBoolean(before_sofar.numGE(before) || focal_id.numLE(min_id));
        if (NIL == doneP) {
            SubLObject id;
            SubLObject v_object;
            for (id = NIL, id = number_utilities.f_1_(focal_id); NIL == doneP; doneP = makeBoolean(before_sofar.numGE(before) || id.numLE(min_id)) , id = add(id, MINUS_ONE_INTEGER)) {
                v_object = funcall(lookup_method, id);
                if (NIL != v_object) {
                    before_objects = cons(v_object, before_objects);
                    before_sofar = add(before_sofar, ONE_INTEGER);
                }
            }
        }
        doneP = makeBoolean(after_sofar.numGE(after) || focal_id.numGE(high_limit));
        if (NIL == doneP) {
            SubLObject id;
            SubLObject v_object;
            for (id = NIL, id = focal_id; NIL == doneP; doneP = makeBoolean(after_sofar.numGE(after) || id.numGE(high_limit)) , id = number_utilities.f_1X(id)) {
                v_object = funcall(lookup_method, id);
                if (NIL != v_object) {
                    after_objects = cons(v_object, after_objects);
                    after_sofar = add(after_sofar, ONE_INTEGER);
                }
            }
        }
        return nconc(before_objects, nreverse(after_objects));
    }

    /**
     * Create a new assertion with CNF in MT.
     */
    @LispMethod(comment = "Create a new assertion with CNF in MT.")
    public static final SubLObject create_assertion(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        SubLTrampolineFile.checkType(cnf, CNF_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        return com.cyc.cycjava.cycl.assertions_high.create_assertion_int(cnf, mt, var_names, direction);
    }

    public static SubLObject create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (asserted_argument == UNPROVIDED) {
            asserted_argument = NIL;
        }
        assert NIL != clauses.cnf_p(cnf) : "! clauses.cnf_p(cnf) " + ("clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) ") + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        return create_assertion_int(cnf, mt, var_names, direction, truth, strength, asserted_argument);
    }

    /**
     * Create a new assertion with cnf from GAF in MT.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Create a new assertion with cnf from GAF in MT.\r\n\r\n@unknown pace")
    public static final SubLObject create_gaf(SubLObject gaf, SubLObject mt, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        SubLTrampolineFile.checkType(gaf, EL_FORMULA_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        return com.cyc.cycjava.cycl.assertions_high.create_assertion_int(clause_utilities.make_gaf_cnf(gaf), mt, NIL, direction);
    }

    public static SubLObject create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (asserted_argument == UNPROVIDED) {
            asserted_argument = NIL;
        }
        assert NIL != el_formula_p(gaf) : "! el_utilities.el_formula_p(gaf) " + ("el_utilities.el_formula_p(gaf) " + "CommonSymbols.NIL != el_utilities.el_formula_p(gaf) ") + gaf;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        return create_assertion_int(clause_utilities.make_gaf_cnf(gaf), mt, NIL, direction, truth, strength, asserted_argument);
    }

    /**
     * Return assertion in MT with CNF, if it exists -- else create it.
     */
    @LispMethod(comment = "Return assertion in MT with CNF, if it exists -- else create it.")
    public static final SubLObject find_or_create_assertion(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        SubLTrampolineFile.checkType(cnf, CNF_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        {
            SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
            return NIL != assertion ? ((SubLObject) (assertion)) : com.cyc.cycjava.cycl.assertions_high.create_assertion(cnf, mt, var_names, direction);
        }
    }

    public static SubLObject find_or_create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (asserted_argument == UNPROVIDED) {
            asserted_argument = NIL;
        }
        assert NIL != clauses.cnf_p(cnf) : "! clauses.cnf_p(cnf) " + ("clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) ") + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        SubLObject new_assertionP = NIL;
        SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
        if (NIL == assertion) {
            assertion = create_assertion(cnf, mt, var_names, direction, truth, strength, asserted_argument);
            new_assertionP = T;
        }
        return values(assertion, new_assertionP);
    }

    /**
     * Return gaf assertion in MT with formula GAF, if it exists -- else create it.
     */
    @LispMethod(comment = "Return gaf assertion in MT with formula GAF, if it exists -- else create it.")
    public static final SubLObject find_or_create_gaf(SubLObject gaf, SubLObject mt, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        {
            SubLObject assertion = kb_indexing.find_gaf(gaf, mt);
            return NIL != assertion ? ((SubLObject) (assertion)) : com.cyc.cycjava.cycl.assertions_high.create_gaf(gaf, mt, direction);
        }
    }

    public static SubLObject find_or_create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (asserted_argument == UNPROVIDED) {
            asserted_argument = NIL;
        }
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        final SubLObject assertion = kb_indexing.find_gaf(gaf, mt);
        return NIL != assertion ? assertion : create_gaf(gaf, mt, direction, truth, strength, asserted_argument);
    }

    /**
     * Create a new assertion with CNF in MT.
     */
    @LispMethod(comment = "Create a new assertion with CNF in MT.")
    public static final SubLObject create_assertion_int(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        {
            SubLObject assertion = assertions_interface.kb_create_assertion(cnf, mt);
            if (NIL != assertion) {
                assertions_interface.kb_set_assertion_variable_names(assertion, var_names);
                assertions_interface.kb_set_assertion_direction(assertion, direction);
            }
            return assertion;
        }
    }

    public static SubLObject create_assertion_int(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = (NIL != clauses.gaf_cnfP(cnf)) ? $FORWARD : $BACKWARD;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (asserted_argument == UNPROVIDED) {
            asserted_argument = NIL;
        }
        return assertions_interface.kb_create_assertion(cnf, mt, var_names, direction, truth, strength, asserted_argument);
    }

    /**
     * Remove ASSERTION.
     */
    @LispMethod(comment = "Remove ASSERTION.")
    public static final SubLObject remove_assertion_alt(SubLObject assertion) {
        return assertions_interface.kb_remove_assertion(assertion);
    }

    /**
     * Remove ASSERTION.
     */
    @LispMethod(comment = "Remove ASSERTION.")
    public static SubLObject remove_assertion(final SubLObject assertion) {
        return assertions_interface.kb_remove_assertion(assertion);
    }

    /**
     * Remove all assertions that mention invalid indexed terms.
     */
    @LispMethod(comment = "Remove all assertions that mention invalid indexed terms.")
    public static final SubLObject remove_broken_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject grand_total = ZERO_INTEGER;
                SubLObject passes = ZERO_INTEGER;
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    passes = add(passes, ONE_INTEGER);
                    {
                        SubLObject message = format(NIL, $str_alt115$Removing_broken_assertions__pass_, passes);
                        SubLObject total = ZERO_INTEGER;
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total_4 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType(message, STRINGP);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble(message);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject ass = NIL;
                                        while (NIL != id) {
                                            ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                                note_percent_progress(sofar, total_4);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != com.cyc.cycjava.cycl.assertions_high.possibly_remove_broken_assertion(ass)) {
                                                    total = add(total, ONE_INTEGER);
                                                }
                                            }
                                            id = do_id_index_next_id(idx, T, id, state_var);
                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                        grand_total = add(grand_total, total);
                        doneP = zerop(total);
                    }
                } 
                return values(grand_total, passes);
            }
        }
    }

    /**
     * Remove all assertions that mention invalid indexed terms.
     */
    @LispMethod(comment = "Remove all assertions that mention invalid indexed terms.")
    public static SubLObject remove_broken_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject grand_total = ZERO_INTEGER;
        SubLObject passes = ZERO_INTEGER;
        SubLObject total;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = zerop(total)) {
            passes = add(passes, ONE_INTEGER);
            final SubLObject message = format(NIL, $str139$Removing_broken_assertions__pass_, passes);
            total = ZERO_INTEGER;
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = message;
            final SubLObject total_$5 = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                    final SubLObject idx_$6 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$6, $SKIP)) {
                        final SubLObject idx_$7 = idx_$6;
                        if (NIL == id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$7);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject ass;
                            SubLObject id;
                            SubLObject reason;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    id = assertion_handles.assertion_id(ass);
                                    reason = possibly_remove_broken_assertion(ass);
                                    if ($OK != reason) {
                                        format(T, $str143$_______removed_assertion___A__rea, id, reason);
                                        total = add(total, ONE_INTEGER);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$5);
                                }
                            }
                        }
                        final SubLObject idx_$8 = idx_$6;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$8)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$8);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$8);
                            final SubLObject end_id = id_index_next_id(idx_$8);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    final SubLObject id2 = assertion_handles.assertion_id(ass2);
                                    final SubLObject reason2 = possibly_remove_broken_assertion(ass2);
                                    if ($OK != reason2) {
                                        format(T, $str143$_______removed_assertion___A__rea, id2, reason2);
                                        total = add(total, ONE_INTEGER);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$5);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            grand_total = add(grand_total, total);
        }
        return values(grand_total, passes);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list($DONE);

    static private final SubLList $list_alt6 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject possibly_remove_broken_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                {
                    SubLObject brokenP = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject cons = com.cyc.cycjava.cycl.assertions_high.assertion_cons(assertion);
                                        SubLObject mt = com.cyc.cycjava.cycl.assertions_high.assertion_mt(assertion);
                                        SubLObject variable_names = com.cyc.cycjava.cycl.assertions_high.assertion_variable_names(assertion);
                                        brokenP = makeBoolean(((($list_alt119.equal(cons) || (NIL == cons)) || (NIL != list_utilities.tree_find_if(symbol_function($sym120$INVALID_INDEXED_TERM_), cons, UNPROVIDED))) || (NIL != list_utilities.tree_find_if(symbol_function($sym120$INVALID_INDEXED_TERM_), mt, UNPROVIDED))) || (!variable_names.isList()));
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        brokenP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != brokenP) {
                        {
                            SubLObject ignore_errors_tag = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            {
                                                SubLObject _prev_bind_0_5 = Errors.$continue_cerrorP$.currentBinding(thread);
                                                try {
                                                    Errors.$continue_cerrorP$.bind(T, thread);
                                                    try {
                                                        tms.tms_remove_assertion(assertion);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                                    try {
                                                                        com.cyc.cycjava.cycl.assertions_high.remove_assertion(assertion);
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                                                    assertion_handles.deregister_assertion_id(assertion_handles.assertion_id(assertion));
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_5, thread);
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                            }
                        }
                    }
                    return brokenP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject possibly_remove_broken_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            SubLObject brokenP = NIL;
            SubLObject msg = NIL;
            SubLObject reason = $OK;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject cons = assertion_cons(assertion);
                        final SubLObject mt = assertion_mt(assertion);
                        final SubLObject variable_names = assertion_variable_names(assertion);
                        if ($list145.equal(cons)) {
                            reason = $TAUTOLOGY;
                        } else
                            if (NIL == cons) {
                                reason = $NO_SENTENCE;
                            } else
                                if (NIL != list_utilities.tree_find_if(symbol_function($sym148$INVALID_INDEXED_TERM_), cons, UNPROVIDED)) {
                                    reason = $INVALID_SENTENCE_TERM;
                                } else
                                    if (NIL != list_utilities.tree_find_if(symbol_function($sym148$INVALID_INDEXED_TERM_), mt, UNPROVIDED)) {
                                        reason = $INVALID_MT_TERM;
                                    } else
                                        if (!variable_names.isList()) {
                                            reason = $BAD_VAR_NAMES;
                                        }




                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (msg.isString()) {
                reason = $CANNOT_UNPACK;
            }
            brokenP = ($OK == reason) ? NIL : T;
            if (NIL != brokenP) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$10 = Errors.$continue_cerrorP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind(T, thread);
                                try {
                                    tms.tms_remove_assertion(assertion);
                                } finally {
                                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                            try {
                                                remove_assertion(assertion);
                                            } finally {
                                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values_$13 = getValuesAsVector();
                                                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                        assertion_handles.deregister_assertion_id(assertion_handles.assertion_id(assertion));
                                                    }
                                                    restoreValuesFromVector(_values_$13);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            } finally {
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$10, thread);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            }
            return reason;
        }
        return $NOT_AN_ASSERTION;
    }

    static private final SubLList $list_alt8 = list(list(makeSymbol("LIT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(makeKeyword("SENSE"), makeKeyword("PREDICATE"), $DONE);

    static private final SubLSymbol $sym12$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    static private final SubLSymbol $sym17$CNF_VAR = makeUninternedSymbol("CNF-VAR");

    static private final SubLSymbol $sym18$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    static private final SubLList $list_alt22 = list(makeSymbol("ASSERTION"));

    static private final SubLString $str_alt23$Return_the_cnf_of_ASSERTION______ = makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");

    static private final SubLList $list_alt24 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list_alt25 = list(makeSymbol("CNF-P"));

    static private final SubLString $str_alt27$Return_the_mt_of_ASSERTION_ = makeString("Return the mt of ASSERTION.");

    static private final SubLList $list_alt28 = list(makeSymbol("HLMT-P"));

    static private final SubLString $str_alt30$Return_the_direction_of_ASSERTION = makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");

    static private final SubLList $list_alt31 = list(makeSymbol("DIRECTION-P"));

    static private final SubLString $str_alt33$Return_the_current_truth_of_ASSER = makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");

    static private final SubLList $list_alt34 = list(makeSymbol("TRUTH-P"));

    static private final SubLString $str_alt36$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");

    static private final SubLList $list_alt37 = list(makeSymbol("EL-STRENGTH-P"));

    static private final SubLString $str_alt39$Return_the_variable_names_for_ASS = makeString("Return the variable names for ASSERTION.");

    static private final SubLList $list_alt40 = list(makeSymbol("LISTP"));

    static private final SubLString $str_alt42$Returns_the_cyclist_who_asserted_ = makeString("Returns the cyclist who asserted ASSERTION.");

    static private final SubLString $str_alt44$Returns_the_day_when_ASSERTION_wa = makeString("Returns the day when ASSERTION was asserted.");

    static private final SubLList $list_alt45 = list(makeSymbol("INTEGERP"));

    static private final SubLString $str_alt47$Return_a_formula_for_ASSERTION_ = makeString("Return a formula for ASSERTION.");

    static private final SubLList $list_alt48 = list(makeSymbol("EL-FORMULA-P"));

    static private final SubLString $str_alt51$Return_a_formula_in___ist_format_ = makeString("Return a formula in #$ist format for ASSERTION.");

    static private final SubLSymbol $sym53$ASSERTION_MENTIONS_TERM_ = makeSymbol("ASSERTION-MENTIONS-TERM?");

    static private final SubLList $list_alt54 = list(makeSymbol("ASSERTION"), makeSymbol("TERM"));

    static private final SubLString $str_alt55$Return_T_iff_ASSERTION_s_formula_ = makeString("Return T iff ASSERTION\'s formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");

    static private final SubLList $list_alt56 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    static private final SubLList $list_alt57 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt59$_see_assertion_mentions_term_ = makeString("@see assertion-mentions-term?");

    static private final SubLList $list_alt64 = list(makeSymbol("ASSERTION-HAS-TYPE?"));

    static private final SubLSymbol $sym65$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLString $str_alt68$Return_the_predicate_of_gaf_ASSER = makeString("Return the predicate of gaf ASSERTION.");

    static private final SubLString $str_alt70$Return_arg_0__the_predicate__of_t = makeString("Return arg 0 (the predicate) of the gaf ASSERTION.");

    static private final SubLString $str_alt72$Return_arg_1_of_the_gaf_ASSERTION = makeString("Return arg 1 of the gaf ASSERTION.");

    static private final SubLString $str_alt74$Return_arg_2_of_the_gaf_ASSERTION = makeString("Return arg 2 of the gaf ASSERTION.");

    static private final SubLString $str_alt76$Return_arg_3_of_the_gaf_ASSERTION = makeString("Return arg 3 of the gaf ASSERTION.");

    /**
     * Return an existing argument on ASSERTION which matches ARGUMENT, otherwise NIL.
     */
    @LispMethod(comment = "Return an existing argument on ASSERTION which matches ARGUMENT, otherwise NIL.")
    public static final SubLObject matching_argument_on_assertion_alt(SubLObject assertion, SubLObject argument) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        return find(argument, com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), symbol_function(ARGUMENT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return an existing argument on ASSERTION which matches ARGUMENT, otherwise NIL.
     */
    @LispMethod(comment = "Return an existing argument on ASSERTION which matches ARGUMENT, otherwise NIL.")
    public static SubLObject matching_argument_on_assertion(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        return find(argument, assertion_arguments(assertion), symbol_function(ARGUMENT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt78$Return_arg_4_of_the_gaf_ASSERTION = makeString("Return arg 4 of the gaf ASSERTION.");

    static private final SubLString $str_alt80$Return_arg_5_of_the_gaf_ASSERTION = makeString("Return arg 5 of the gaf ASSERTION.");

    static private final SubLList $list_alt83 = list(makeSymbol("ASSERTION-HAS-DIRECTION?"));

    static private final SubLSymbol $sym85$FORWARD_ASSERTION_ = makeSymbol("FORWARD-ASSERTION?");

    /**
     *
     *
     * @return boolean; T if ARGUMENT is the sole argument for ASSERTION; NIL if there are other, different arguments.
     */
    @LispMethod(comment = "@return boolean; T if ARGUMENT is the sole argument for ASSERTION; NIL if there are other, different arguments.")
    public static final SubLObject only_argument_of_assertion_p_alt(SubLObject assertion, SubLObject argument) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        return makeBoolean(NIL == memberP(argument, com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), NOT_EQ, UNPROVIDED));
    }

    /**
     *
     *
     * @return boolean; T if ARGUMENT is the sole argument for ASSERTION; NIL if there are other, different arguments.
     */
    @LispMethod(comment = "@return boolean; T if ARGUMENT is the sole argument for ASSERTION; NIL if there are other, different arguments.")
    public static SubLObject only_argument_of_assertion_p(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        return makeBoolean(NIL == assertion_has_some_argument_other_thanP(assertion, argument));
    }

    static private final SubLString $str_alt86$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :FORWARD.");

    static private final SubLSymbol $sym88$BACKWARD_ASSERTION_ = makeSymbol("BACKWARD-ASSERTION?");

    static private final SubLString $str_alt89$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :BACKWARD.");

    static private final SubLSymbol $sym91$CODE_ASSERTION_ = makeSymbol("CODE-ASSERTION?");

    public static SubLObject assertion_has_some_argument_other_thanP(final SubLObject assertion, final SubLObject argument) {
        return subl_promotions.memberP(argument, assertion_arguments(assertion), NOT_EQL, UNPROVIDED);
    }

    static private final SubLString $str_alt92$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :CODE.");

    static private final SubLSymbol $sym94$ASSERTION_HAS_TRUTH_ = makeSymbol("ASSERTION-HAS-TRUTH?");

    /**
     * Return non-nil IFF assertion has an asserted argument.
     */
    @LispMethod(comment = "Return non-nil IFF assertion has an asserted argument.")
    public static final SubLObject asserted_assertionP_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(ASSERTED_ARGUMENT_P), com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return non-nil IFF assertion has an asserted argument.
     */
    @LispMethod(comment = "Return non-nil IFF assertion has an asserted argument.")
    public static SubLObject asserted_assertionP(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    static private final SubLList $list_alt95 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"));

    static private final SubLString $str_alt96$Return_T_iff_ASSERTION_s_current_ = makeString("Return T iff ASSERTION's current truth is TRUTH.");

    static private final SubLList $list_alt97 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    /**
     * Return non-nil IFF assertion has some deduced argument
     */
    @LispMethod(comment = "Return non-nil IFF assertion has some deduced argument")
    public static final SubLObject deduced_assertionP_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(DEDUCTION_P), com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return non-nil IFF assertion has some deduced argument
     */
    @LispMethod(comment = "Return non-nil IFF assertion has some deduced argument")
    public static SubLObject deduced_assertionP(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(DEDUCTION_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    static private final SubLString $str_alt99$_see_assertion_has_truth_ = makeString("@see assertion-has-truth?");

    public static SubLObject only_deduced_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != deduced_assertionP(assertion)) && (NIL == asserted_assertionP(assertion)));
    }

    static private final SubLSymbol $sym102$ASSERTION_ASSERTED_DATE_ = makeSymbol("ASSERTION-ASSERTED-DATE?");

    /**
     *
     *
     * @return boolean; T if ASSERTION has a forward-deduced argument
     */
    @LispMethod(comment = "@return boolean; T if ASSERTION has a forward-deduced argument")
    public static final SubLObject forward_deduced_assertionP(SubLObject assertion) {
        return list_utilities.sublisp_boolean(find_if(symbol_function($sym132$FORWARD_DEDUCTION_), com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject forward_deduced_assertionP(final SubLObject assertion, SubLObject include_code_deduced_assertionsP) {
        if (include_code_deduced_assertionsP == UNPROVIDED) {
            include_code_deduced_assertionsP = T;
        }
        return list_utilities.sublisp_boolean(find_if(NIL != include_code_deduced_assertionsP ? symbol_function($sym165$FORWARD_DEDUCTION_) : symbol_function($sym166$FORWARD_NOT_CODE_DEDUCTION_), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    static private final SubLList $list_alt109 = list(makeSymbol("VALID-ASSERTION?"));

    /**
     * Return the asserted argument for ASSERTION, or nil if none present.
     */
    @LispMethod(comment = "Return the asserted argument for ASSERTION, or nil if none present.")
    public static final SubLObject get_asserted_argument_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return find_if(symbol_function(ASSERTED_ARGUMENT_P), com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the asserted argument for ASSERTION, or nil if none present.
     */
    @LispMethod(comment = "Return the asserted argument for ASSERTION, or nil if none present.")
    public static SubLObject get_asserted_argument(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return find_if(symbol_function(ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLList $list_alt111 = list(makeSymbol("INVALID-ASSERTION?"));

    static private final SubLString $str_alt115$Removing_broken_assertions__pass_ = makeString("Removing broken assertions: pass ~S");

    public static SubLObject get_asserted_argument_and_more(final SubLObject assertion) {
        final SubLObject v_arguments = assertion_arguments(assertion);
        final SubLObject asserted_argument = find_if(symbol_function(ASSERTED_ARGUMENT_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject last_argumentP = (NIL != asserted_argument) ? list_utilities.singletonP(v_arguments) : NIL;
        return values(asserted_argument, last_argumentP);
    }

    static private final SubLList $list_alt119 = list(NIL);

    static private final SubLSymbol $sym120$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");

    static private final SubLSymbol $sym127$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    /**
     * Return a list of the deduction arguments (if any) for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the deduction arguments (if any) for ASSERTION.")
    public static final SubLObject assertion_deductions_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list_utilities.remove_if_not(symbol_function(DEDUCTION_P), com.cyc.cycjava.cycl.assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of the deduction arguments (if any) for ASSERTION.
     */
    @LispMethod(comment = "Return a list of the deduction arguments (if any) for ASSERTION.")
    public static SubLObject assertion_deductions(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return list_utilities.remove_if_not(symbol_function(DEDUCTION_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt128$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has an asserted argument.");

    static private final SubLSymbol $sym130$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    static private final SubLString $str_alt131$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has some deduced argument");

    /**
     *
     *
     * @return integerp; the number of arguments depending on ASSERTION.
     */
    @LispMethod(comment = "@return integerp; the number of arguments depending on ASSERTION.")
    public static final SubLObject assertion_dependent_count_alt(SubLObject assertion) {
        return length(com.cyc.cycjava.cycl.assertions_high.assertion_dependents(assertion));
    }

    /**
     *
     *
     * @return integerp; the number of arguments depending on ASSERTION.
     */
    @LispMethod(comment = "@return integerp; the number of arguments depending on ASSERTION.")
    public static SubLObject assertion_dependent_count(final SubLObject assertion) {
        return assertions_low.assertion_dependent_count_internal(assertion);
    }

    static private final SubLSymbol $sym132$FORWARD_DEDUCTION_ = makeSymbol("FORWARD-DEDUCTION?");

    /**
     * Return non-nil IFF assertion has dependents.
     */
    @LispMethod(comment = "Return non-nil IFF assertion has dependents.")
    public static final SubLObject assertion_has_dependents_p_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.assertions_high.assertion_dependents(assertion));
    }

    /**
     * Return non-nil IFF assertion has dependents.
     */
    @LispMethod(comment = "Return non-nil IFF assertion has dependents.")
    public static SubLObject assertion_has_dependents_p(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return assertions_low.assertion_has_dependents_p_internal(assertion);
    }

    static private final SubLString $str_alt134$Return_the_asserted_argument_for_ = makeString("Return the asserted argument for ASSERTION, or nil if none present.");

    /**
     * Return a randomly chosen assertion satisfying TEST
     */
    @LispMethod(comment = "Return a randomly chosen assertion satisfying TEST")
    public static final SubLObject random_assertion_alt(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (assertion_handles.assertion_count().numG(ZERO_INTEGER)) {
            {
                SubLObject max_id = assertion_handles.next_assertion_id();
                SubLObject v_answer = NIL;
                while (NIL == v_answer) {
                    {
                        SubLObject candidate = assertion_handles.find_assertion_by_id(random.random(max_id));
                        if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                            v_answer = candidate;
                        }
                    }
                } 
                return v_answer;
            }
        }
        return NIL;
    }

    /**
     * Return a randomly chosen assertion satisfying TEST
     */
    @LispMethod(comment = "Return a randomly chosen assertion satisfying TEST")
    public static SubLObject random_assertion(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        return assertions_low.random_assertion_internal(test);
    }

    static private final SubLList $list_alt135 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTED-ARGUMENT-P")));

    /**
     * Return N randomly chosen assertions that satisfy TEST
     * All assertions are different unless ALLOW-REPEATS? is non-nil.
     */
    @LispMethod(comment = "Return N randomly chosen assertions that satisfy TEST\r\nAll assertions are different unless ALLOW-REPEATS? is non-nil.\nReturn N randomly chosen assertions that satisfy TEST\nAll assertions are different unless ALLOW-REPEATS? is non-nil.")
    public static final SubLObject sample_assertions_alt(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        if (NIL != allow_repeatsP) {
            {
                SubLObject result = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    result = cons(com.cyc.cycjava.cycl.assertions_high.random_assertion(test), result);
                }
                return result;
            }
        }
        {
            SubLObject result = new_set_contents(n, symbol_function(EQ));
            while (set_contents_size(result).numL(n)) {
                result = set_contents_add(com.cyc.cycjava.cycl.assertions_high.random_assertion(test), result, symbol_function(EQ));
            } 
            return set_contents_element_list(result);
        }
    }

    /**
     * Return N randomly chosen assertions that satisfy TEST
     * All assertions are different unless ALLOW-REPEATS? is non-nil.
     */
    @LispMethod(comment = "Return N randomly chosen assertions that satisfy TEST\r\nAll assertions are different unless ALLOW-REPEATS? is non-nil.\nReturn N randomly chosen assertions that satisfy TEST\nAll assertions are different unless ALLOW-REPEATS? is non-nil.")
    public static SubLObject sample_assertions(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        if (NIL != allow_repeatsP) {
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                result = cons(random_assertion(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_assertion(test), result, symbol_function(EQL))) {
        }
        return set_contents.set_contents_element_list(result);
    }

    static private final SubLString $str_alt137$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has dependents.");

    static private final SubLList $list_alt141 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));

    static private final SubLList $list_alt142 = list(list(makeSymbol("*ASSERTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*"), list(QUOTE, makeSymbol("ASSERTION-DUMP-ID"))));

    public static final SubLObject random_rule_alt() {
        return keyhash.keyhash_random_key(assertions_low.kb_rule_set());
    }

    public static SubLObject random_rule() {
        return assertions_low.random_rule_internal();
    }

    public static final SubLObject random_gaf_alt() {
        {
            SubLObject gaf = NIL;
            while (NIL == com.cyc.cycjava.cycl.assertions_high.gaf_assertionP(gaf)) {
                gaf = com.cyc.cycjava.cycl.assertions_high.random_assertion(UNPROVIDED);
            } 
            return gaf;
        }
    }

    public static SubLObject random_gaf() {
        return assertions_low.random_gaf_internal();
    }

    /**
     * Return T iff OBJECT is an assertion checkpoint.
     */
    @LispMethod(comment = "Return T iff OBJECT is an assertion checkpoint.")
    public static final SubLObject assertion_checkpoint_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is an assertion checkpoint.
     */
    @LispMethod(comment = "Return T iff OBJECT is an assertion checkpoint.")
    public static SubLObject assertion_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    /**
     * return assertion-checkpoint-p; the current assertion checkpoint
     */
    @LispMethod(comment = "return assertion-checkpoint-p; the current assertion checkpoint")
    public static final SubLObject new_assertion_checkpoint_alt() {
        {
            SubLObject assertion_count = assertion_handles.assertion_count();
            SubLObject next_assertion_id = assertion_handles.next_assertion_id();
            return list(assertion_count, next_assertion_id);
        }
    }

    /**
     * return assertion-checkpoint-p; the current assertion checkpoint
     */
    @LispMethod(comment = "return assertion-checkpoint-p; the current assertion checkpoint")
    public static SubLObject new_assertion_checkpoint() {
        final SubLObject assertion_count = assertion_handles.assertion_count();
        final SubLObject next_assertion_id = assertion_handles.next_assertion_id();
        return list(assertion_count, next_assertion_id);
    }

    /**
     * Return T iff ASSERTION-CHECKPOINT is still current
     */
    @LispMethod(comment = "Return T iff ASSERTION-CHECKPOINT is still current")
    public static final SubLObject assertion_checkpoint_currentP_alt(SubLObject assertion_checkpoint) {
        {
            SubLObject datum = assertion_checkpoint;
            SubLObject current = datum;
            SubLObject checkpoint_count = NIL;
            SubLObject checkpoint_next_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            checkpoint_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            checkpoint_next_id = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(checkpoint_count.numE(assertion_handles.assertion_count()) && checkpoint_next_id.numE(assertion_handles.next_assertion_id()));
            } else {
                cdestructuring_bind_error(datum, $list_alt141);
            }
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION-CHECKPOINT is still current
     */
    @LispMethod(comment = "Return T iff ASSERTION-CHECKPOINT is still current")
    public static SubLObject assertion_checkpoint_currentP(final SubLObject assertion_checkpoint) {
        SubLObject checkpoint_count = NIL;
        SubLObject checkpoint_next_id = NIL;
        destructuring_bind_must_consp(assertion_checkpoint, assertion_checkpoint, $list174);
        checkpoint_count = assertion_checkpoint.first();
        SubLObject current = assertion_checkpoint.rest();
        destructuring_bind_must_consp(current, assertion_checkpoint, $list174);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(checkpoint_count.numE(assertion_handles.assertion_count()) && checkpoint_next_id.numE(assertion_handles.next_assertion_id()));
        }
        cdestructuring_bind_error(assertion_checkpoint, $list174);
        return NIL;
    }

    public static final SubLObject with_assertion_dump_id_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt142, append(body, NIL));
        }
    }

    public static SubLObject with_assertion_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list175, append(body, NIL));
    }

    /**
     * Return the id of ASSERTION to use during a KB dump.
     */
    @LispMethod(comment = "Return the id of ASSERTION to use during a KB dump.")
    public static final SubLObject assertion_dump_id_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = assertion_handles.assertion_id(assertion);
                SubLObject dump_table = $assertion_dump_id_table$.getDynamicValue(thread);
                if (NIL != dump_table) {
                    id = id_index_lookup(dump_table, id, UNPROVIDED);
                }
                return id;
            }
        }
    }

    /**
     * Return the id of ASSERTION to use during a KB dump.
     */
    @LispMethod(comment = "Return the id of ASSERTION to use during a KB dump.")
    public static SubLObject assertion_dump_id(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject dump_table = $assertion_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    /**
     * Return the assertion with DUMP-ID during a KB load.
     */
    @LispMethod(comment = "Return the assertion with DUMP-ID during a KB load.")
    public static final SubLObject find_assertion_by_dump_id_alt(SubLObject dump_id) {
        return assertion_handles.find_assertion_by_id(dump_id);
    }

    /**
     * Return the assertion with DUMP-ID during a KB load.
     */
    @LispMethod(comment = "Return the assertion with DUMP-ID during a KB load.")
    public static SubLObject find_assertion_by_dump_id(final SubLObject dump_id) {
        return assertion_handles.find_assertion_by_id(dump_id);
    }

    public static final SubLObject declare_assertions_high_file_alt() {
        declareMacro("do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
        declareMacro("do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
        declareMacro("do_assertion_literals", "DO-ASSERTION-LITERALS");
        declareFunction("assertion_cnf", "ASSERTION-CNF", 1, 0, false);
        declareFunction("intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
        declareFunction("possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
        declareFunction("assertion_mt", "ASSERTION-MT", 1, 0, false);
        new com.cyc.cycjava.cycl.assertions_high.$assertion_mt$UnaryFunction();
        declareFunction("assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
        declareFunction("assertion_cons", "ASSERTION-CONS", 1, 0, false);
        declareFunction("gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
        declareFunction("assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
        declareFunction("assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
        declareFunction("assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
        declareFunction("assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
        declareFunction("asserted_by", "ASSERTED-BY", 1, 0, false);
        declareFunction("asserted_when", "ASSERTED-WHEN", 1, 0, false);
        declareFunction("asserted_why", "ASSERTED-WHY", 1, 0, false);
        declareFunction("asserted_second", "ASSERTED-SECOND", 1, 0, false);
        declareFunction("assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction("assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
        declareFunction("cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
        declareFunction("assertion_formula", "ASSERTION-FORMULA", 1, 0, false);
        new com.cyc.cycjava.cycl.assertions_high.$assertion_formula$UnaryFunction();
        declareFunction("assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
        declareFunction("assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
        declareFunction("assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
        declareFunction("assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
        declareFunction("assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
        declareFunction("assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
        declareFunction("rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
        declareFunction("backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
        declareFunction("forward_ruleP", "FORWARD-RULE?", 1, 0, false);
        declareFunction("single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
        declareFunction("backward_gafP", "BACKWARD-GAF?", 1, 0, false);
        declareFunction("forward_gafP", "FORWARD-GAF?", 1, 0, false);
        declareFunction("assertion_type", "ASSERTION-TYPE", 1, 0, false);
        declareFunction("assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
        declareFunction("assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
        declareFunction("assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
        declareFunction("ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
        declareFunction("atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
        declareFunction("meta_assertionP", "META-ASSERTION?", 1, 0, false);
        declareFunction("lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
        declareFunction("assertion_forts", "ASSERTION-FORTS", 1, 4, false);
        declareFunction("assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
        declareFunction("gaf_formula", "GAF-FORMULA", 1, 0, false);
        new com.cyc.cycjava.cycl.assertions_high.$gaf_formula$UnaryFunction();
        declareFunction("gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
        declareFunction("gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
        declareFunction("assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
        declareFunction("gaf_args", "GAF-ARGS", 1, 0, false);
        declareFunction("gaf_arg", "GAF-ARG", 2, 0, false);
        declareFunction("gaf_predicate", "GAF-PREDICATE", 1, 0, false);
        declareFunction("gaf_arg0", "GAF-ARG0", 1, 0, false);
        declareFunction("gaf_arg1", "GAF-ARG1", 1, 0, false);
        declareFunction("gaf_arg2", "GAF-ARG2", 1, 0, false);
        declareFunction("gaf_arg3", "GAF-ARG3", 1, 0, false);
        declareFunction("gaf_arg4", "GAF-ARG4", 1, 0, false);
        declareFunction("gaf_arg5", "GAF-ARG5", 1, 0, false);
        declareFunction("assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
        declareFunction("assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
        declareFunction("forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
        declareFunction("backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
        declareFunction("code_assertionP", "CODE-ASSERTION?", 1, 0, false);
        declareFunction("assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
        declareFunction("assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
        declareFunction("assertion_date", "ASSERTION-DATE", 1, 0, false);
        declareFunction("assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false);
        declareFunction("new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false);
        declareFunction("all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false);
        declareFunction("assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
        declareFunction("assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
        declareFunction("assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
        declareFunction("assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
        declareFunction("assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
        declareFunction("timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
        declareFunction("remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
        declareFunction("tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
        declareFunction("tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
        declareFunction("tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
        declareFunction("timestamp_asserted_assertion_int", "TIMESTAMP-ASSERTED-ASSERTION-INT", 1, 4, false);
        declareFunction("invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false);
        new com.cyc.cycjava.cycl.assertions_high.$invalid_assertionP$UnaryFunction();
        new com.cyc.cycjava.cycl.assertions_high.$invalid_assertionP$BinaryFunction();
        declareFunction("invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
        declareFunction("valid_assertion", "VALID-ASSERTION", 1, 1, false);
        new com.cyc.cycjava.cycl.assertions_high.$valid_assertion$UnaryFunction();
        new com.cyc.cycjava.cycl.assertions_high.$valid_assertion$BinaryFunction();
        declareFunction("invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
        declareFunction("assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
        declareFunction("create_assertion", "CREATE-ASSERTION", 2, 2, false);
        declareFunction("create_gaf", "CREATE-GAF", 2, 1, false);
        declareFunction("find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 2, false);
        declareFunction("find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 1, false);
        declareFunction("create_assertion_int", "CREATE-ASSERTION-INT", 2, 2, false);
        declareFunction("remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
        declareFunction("remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
        declareFunction("possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
        declareFunction("matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
        declareFunction("only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
        declareFunction("asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
        declareFunction("deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction("forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction("get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
        declareFunction("assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
        declareFunction("assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
        declareFunction("assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
        declareFunction("random_assertion", "RANDOM-ASSERTION", 0, 1, false);
        declareFunction("sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
        declareFunction("random_rule", "RANDOM-RULE", 0, 0, false);
        declareFunction("random_gaf", "RANDOM-GAF", 0, 0, false);
        declareFunction("assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
        declareFunction("new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
        declareFunction("assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
        declareMacro("with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
        declareFunction("assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
        declareFunction("find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_assertions_high_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
            declareMacro("do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
            declareMacro("do_assertion_literals", "DO-ASSERTION-LITERALS");
            declareMacro("do_recent_assertions", "DO-RECENT-ASSERTIONS");
            declareFunction("assertion_cnf", "ASSERTION-CNF", 1, 0, false);
            declareFunction("intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
            declareFunction("intuitive_cnf", "INTUITIVE-CNF", 2, 0, false);
            declareFunction("possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
            declareFunction("assertion_mt", "ASSERTION-MT", 1, 0, false);
            new assertions_high.$assertion_mt$UnaryFunction();
            declareFunction("assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
            declareFunction("assertion_cons", "ASSERTION-CONS", 1, 0, false);
            declareFunction("gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
            declareFunction("rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
            declareFunction("assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
            declareFunction("assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
            declareFunction("assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
            declareFunction("assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
            declareFunction("asserted_by", "ASSERTED-BY", 1, 0, false);
            declareFunction("asserted_when", "ASSERTED-WHEN", 1, 0, false);
            declareFunction("asserted_why", "ASSERTED-WHY", 1, 0, false);
            declareFunction("asserted_second", "ASSERTED-SECOND", 1, 0, false);
            declareFunction("assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
            declareFunction("assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
            declareFunction("assertion_dependent_list", "ASSERTION-DEPENDENT-LIST", 1, 0, false);
            declareFunction("cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
            declareFunction("assertion_formula", "ASSERTION-FORMULA", 1, 0, false);
            new assertions_high.$assertion_formula$UnaryFunction();
            declareFunction("assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
            declareFunction("assertion_ist_sentence", "ASSERTION-IST-SENTENCE", 1, 0, false);
            declareFunction("assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
            declareFunction("assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
            declareFunction("assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
            declareFunction("assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
            declareFunction("assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
            declareFunction("backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
            declareFunction("forward_ruleP", "FORWARD-RULE?", 1, 0, false);
            declareFunction("single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
            declareFunction("single_literal_antecedent_ruleP", "SINGLE-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
            declareFunction("two_literal_antecedent_ruleP", "TWO-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
            declareFunction("forward_tms_ruleP", "FORWARD-TMS-RULE?", 1, 0, false);
            declareFunction("cycl_tms_predicateP", "CYCL-TMS-PREDICATE?", 1, 0, false);
            declareFunction("kb_tms_methodP", "KB-TMS-METHOD?", 1, 0, false);
            declareFunction("backward_gafP", "BACKWARD-GAF?", 1, 0, false);
            declareFunction("forward_gafP", "FORWARD-GAF?", 1, 0, false);
            declareFunction("assertion_type", "ASSERTION-TYPE", 1, 0, false);
            declareFunction("assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
            declareFunction("assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
            declareFunction("assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
            declareFunction("ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
            declareFunction("atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
            declareFunction("meta_assertionP", "META-ASSERTION?", 1, 0, false);
            declareFunction("lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
            declareFunction("assertion_forts", "ASSERTION-FORTS", 1, 4, false);
            declareFunction("assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
            declareFunction("gaf_formula", "GAF-FORMULA", 1, 0, false);
            new assertions_high.$gaf_formula$UnaryFunction();
            declareFunction("gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
            declareFunction("gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
            declareFunction("assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
            declareFunction("gaf_args", "GAF-ARGS", 1, 0, false);
            declareFunction("gaf_arg", "GAF-ARG", 2, 0, false);
            declareFunction("gaf_predicate", "GAF-PREDICATE", 1, 0, false);
            declareFunction("gaf_arg0", "GAF-ARG0", 1, 0, false);
            declareFunction("gaf_arg1", "GAF-ARG1", 1, 0, false);
            declareFunction("gaf_arg2", "GAF-ARG2", 1, 0, false);
            declareFunction("gaf_arg3", "GAF-ARG3", 1, 0, false);
            declareFunction("gaf_arg4", "GAF-ARG4", 1, 0, false);
            declareFunction("gaf_arg5", "GAF-ARG5", 1, 0, false);
            declareFunction("assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
            declareFunction("assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
            declareFunction("forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
            declareFunction("backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
            declareFunction("code_assertionP", "CODE-ASSERTION?", 1, 0, false);
            declareFunction("assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
            declareFunction("assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
            declareFunction("assertion_date", "ASSERTION-DATE", 1, 0, false);
            declareFunction("assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false);
            declareFunction("new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false);
            declareFunction("all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false);
            declareFunction("assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
            declareFunction("assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
            declareFunction("assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
            declareFunction("assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
            declareFunction("assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
            declareFunction("assertion_hl_to_el_variable_map", "ASSERTION-HL-TO-EL-VARIABLE-MAP", 1, 0, false);
            declareFunction("timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
            declareFunction("remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
            declareFunction("tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
            declareFunction("tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
            declareFunction("tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
            declareFunction("invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false);
            new assertions_high.$invalid_assertionP$UnaryFunction();
            new assertions_high.$invalid_assertionP$BinaryFunction();
            declareFunction("invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
            declareFunction("valid_assertion", "VALID-ASSERTION", 1, 1, false);
            new assertions_high.$valid_assertion$UnaryFunction();
            new assertions_high.$valid_assertion$BinaryFunction();
            declareFunction("invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
            declareFunction("assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
            declareFunction("assertions_around_assertion", "ASSERTIONS-AROUND-ASSERTION", 1, 3, false);
            declareFunction("assertions_around", "ASSERTIONS-AROUND", 1, 3, false);
            declareFunction("kb_objects_around_id", "KB-OBJECTS-AROUND-ID", 7, 0, false);
            declareFunction("create_assertion", "CREATE-ASSERTION", 2, 5, false);
            declareFunction("create_gaf", "CREATE-GAF", 2, 4, false);
            declareFunction("find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 5, false);
            declareFunction("find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 4, false);
            declareFunction("create_assertion_int", "CREATE-ASSERTION-INT", 2, 5, false);
            declareFunction("remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
            declareFunction("remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
            declareFunction("possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
            declareFunction("matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
            declareFunction("only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
            declareFunction("assertion_has_some_argument_other_thanP", "ASSERTION-HAS-SOME-ARGUMENT-OTHER-THAN?", 2, 0, false);
            declareFunction("asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
            declareFunction("deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
            declareFunction("only_deduced_assertionP", "ONLY-DEDUCED-ASSERTION?", 1, 0, false);
            declareFunction("forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 1, false);
            declareFunction("get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
            declareFunction("get_asserted_argument_and_more", "GET-ASSERTED-ARGUMENT-AND-MORE", 1, 0, false);
            declareFunction("assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
            declareFunction("assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
            declareFunction("assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
            declareFunction("random_assertion", "RANDOM-ASSERTION", 0, 1, false);
            declareFunction("sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
            declareFunction("random_rule", "RANDOM-RULE", 0, 0, false);
            declareFunction("random_gaf", "RANDOM-GAF", 0, 0, false);
            declareFunction("assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
            declareFunction("new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
            declareFunction("assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
            declareMacro("with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
            declareFunction("assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
            declareFunction("find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("timestamp_asserted_assertion_int", "TIMESTAMP-ASSERTED-ASSERTION-INT", 1, 4, false);
            declareFunction("create_assertion", "CREATE-ASSERTION", 2, 2, false);
            declareFunction("create_gaf", "CREATE-GAF", 2, 1, false);
            declareFunction("find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 2, false);
            declareFunction("find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 1, false);
            declareFunction("create_assertion_int", "CREATE-ASSERTION-INT", 2, 2, false);
            declareFunction("forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_assertions_high_file_Previous() {
        declareMacro("do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
        declareMacro("do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
        declareMacro("do_assertion_literals", "DO-ASSERTION-LITERALS");
        declareMacro("do_recent_assertions", "DO-RECENT-ASSERTIONS");
        declareFunction("assertion_cnf", "ASSERTION-CNF", 1, 0, false);
        declareFunction("intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
        declareFunction("intuitive_cnf", "INTUITIVE-CNF", 2, 0, false);
        declareFunction("possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
        declareFunction("assertion_mt", "ASSERTION-MT", 1, 0, false);
        new assertions_high.$assertion_mt$UnaryFunction();
        declareFunction("assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
        declareFunction("assertion_cons", "ASSERTION-CONS", 1, 0, false);
        declareFunction("gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
        declareFunction("rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
        declareFunction("assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
        declareFunction("assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
        declareFunction("assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
        declareFunction("assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
        declareFunction("asserted_by", "ASSERTED-BY", 1, 0, false);
        declareFunction("asserted_when", "ASSERTED-WHEN", 1, 0, false);
        declareFunction("asserted_why", "ASSERTED-WHY", 1, 0, false);
        declareFunction("asserted_second", "ASSERTED-SECOND", 1, 0, false);
        declareFunction("assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction("assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
        declareFunction("assertion_dependent_list", "ASSERTION-DEPENDENT-LIST", 1, 0, false);
        declareFunction("cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
        declareFunction("assertion_formula", "ASSERTION-FORMULA", 1, 0, false);
        new assertions_high.$assertion_formula$UnaryFunction();
        declareFunction("assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
        declareFunction("assertion_ist_sentence", "ASSERTION-IST-SENTENCE", 1, 0, false);
        declareFunction("assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
        declareFunction("assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
        declareFunction("assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
        declareFunction("assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
        declareFunction("assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
        declareFunction("backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
        declareFunction("forward_ruleP", "FORWARD-RULE?", 1, 0, false);
        declareFunction("single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
        declareFunction("single_literal_antecedent_ruleP", "SINGLE-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        declareFunction("two_literal_antecedent_ruleP", "TWO-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        declareFunction("forward_tms_ruleP", "FORWARD-TMS-RULE?", 1, 0, false);
        declareFunction("cycl_tms_predicateP", "CYCL-TMS-PREDICATE?", 1, 0, false);
        declareFunction("kb_tms_methodP", "KB-TMS-METHOD?", 1, 0, false);
        declareFunction("backward_gafP", "BACKWARD-GAF?", 1, 0, false);
        declareFunction("forward_gafP", "FORWARD-GAF?", 1, 0, false);
        declareFunction("assertion_type", "ASSERTION-TYPE", 1, 0, false);
        declareFunction("assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
        declareFunction("assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
        declareFunction("assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
        declareFunction("ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
        declareFunction("atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
        declareFunction("meta_assertionP", "META-ASSERTION?", 1, 0, false);
        declareFunction("lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
        declareFunction("assertion_forts", "ASSERTION-FORTS", 1, 4, false);
        declareFunction("assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
        declareFunction("gaf_formula", "GAF-FORMULA", 1, 0, false);
        new assertions_high.$gaf_formula$UnaryFunction();
        declareFunction("gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
        declareFunction("gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
        declareFunction("assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
        declareFunction("gaf_args", "GAF-ARGS", 1, 0, false);
        declareFunction("gaf_arg", "GAF-ARG", 2, 0, false);
        declareFunction("gaf_predicate", "GAF-PREDICATE", 1, 0, false);
        declareFunction("gaf_arg0", "GAF-ARG0", 1, 0, false);
        declareFunction("gaf_arg1", "GAF-ARG1", 1, 0, false);
        declareFunction("gaf_arg2", "GAF-ARG2", 1, 0, false);
        declareFunction("gaf_arg3", "GAF-ARG3", 1, 0, false);
        declareFunction("gaf_arg4", "GAF-ARG4", 1, 0, false);
        declareFunction("gaf_arg5", "GAF-ARG5", 1, 0, false);
        declareFunction("assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
        declareFunction("assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
        declareFunction("forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
        declareFunction("backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
        declareFunction("code_assertionP", "CODE-ASSERTION?", 1, 0, false);
        declareFunction("assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
        declareFunction("assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
        declareFunction("assertion_date", "ASSERTION-DATE", 1, 0, false);
        declareFunction("assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false);
        declareFunction("new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false);
        declareFunction("all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false);
        declareFunction("assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
        declareFunction("assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
        declareFunction("assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
        declareFunction("assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
        declareFunction("assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
        declareFunction("assertion_hl_to_el_variable_map", "ASSERTION-HL-TO-EL-VARIABLE-MAP", 1, 0, false);
        declareFunction("timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
        declareFunction("remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
        declareFunction("tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
        declareFunction("tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
        declareFunction("tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
        declareFunction("invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false);
        new assertions_high.$invalid_assertionP$UnaryFunction();
        new assertions_high.$invalid_assertionP$BinaryFunction();
        declareFunction("invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
        declareFunction("valid_assertion", "VALID-ASSERTION", 1, 1, false);
        new assertions_high.$valid_assertion$UnaryFunction();
        new assertions_high.$valid_assertion$BinaryFunction();
        declareFunction("invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
        declareFunction("assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
        declareFunction("assertions_around_assertion", "ASSERTIONS-AROUND-ASSERTION", 1, 3, false);
        declareFunction("assertions_around", "ASSERTIONS-AROUND", 1, 3, false);
        declareFunction("kb_objects_around_id", "KB-OBJECTS-AROUND-ID", 7, 0, false);
        declareFunction("create_assertion", "CREATE-ASSERTION", 2, 5, false);
        declareFunction("create_gaf", "CREATE-GAF", 2, 4, false);
        declareFunction("find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 5, false);
        declareFunction("find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 4, false);
        declareFunction("create_assertion_int", "CREATE-ASSERTION-INT", 2, 5, false);
        declareFunction("remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
        declareFunction("remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
        declareFunction("possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
        declareFunction("matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
        declareFunction("only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
        declareFunction("assertion_has_some_argument_other_thanP", "ASSERTION-HAS-SOME-ARGUMENT-OTHER-THAN?", 2, 0, false);
        declareFunction("asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
        declareFunction("deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction("only_deduced_assertionP", "ONLY-DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction("forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 1, false);
        declareFunction("get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
        declareFunction("get_asserted_argument_and_more", "GET-ASSERTED-ARGUMENT-AND-MORE", 1, 0, false);
        declareFunction("assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
        declareFunction("assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
        declareFunction("assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
        declareFunction("random_assertion", "RANDOM-ASSERTION", 0, 1, false);
        declareFunction("sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
        declareFunction("random_rule", "RANDOM-RULE", 0, 0, false);
        declareFunction("random_gaf", "RANDOM-GAF", 0, 0, false);
        declareFunction("assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
        declareFunction("new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
        declareFunction("assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
        declareMacro("with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
        declareFunction("assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
        declareFunction("find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_assertions_high_file_alt() {
        deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", NIL != boundp($tl_assertion_lookaside_table$) ? ((SubLObject) ($tl_assertion_lookaside_table$.getGlobalValue())) : NIL);
        deflexical("*TL-ASSERTION-CAPACITY*", FIVE_INTEGER);
        defparameter("*ASSERTION-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_assertions_high_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", SubLTrampolineFile.maybeDefault($tl_assertion_lookaside_table$, $tl_assertion_lookaside_table$, NIL));
            deflexical("*TL-ASSERTION-CAPACITY*", FIVE_INTEGER);
            defparameter("*ASSERTION-DUMP-ID-TABLE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", NIL != boundp($tl_assertion_lookaside_table$) ? ((SubLObject) ($tl_assertion_lookaside_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_assertions_high_file_Previous() {
        deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", SubLTrampolineFile.maybeDefault($tl_assertion_lookaside_table$, $tl_assertion_lookaside_table$, NIL));
        deflexical("*TL-ASSERTION-CAPACITY*", FIVE_INTEGER);
        defparameter("*ASSERTION-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_assertions_high_file_alt() {
        register_cyc_api_function(ASSERTION_CNF, $list_alt22, $str_alt23$Return_the_cnf_of_ASSERTION______, $list_alt24, $list_alt25);
        register_cyc_api_function(ASSERTION_MT, $list_alt22, $str_alt27$Return_the_mt_of_ASSERTION_, $list_alt24, $list_alt28);
        register_cyc_api_function(ASSERTION_DIRECTION, $list_alt22, $str_alt30$Return_the_direction_of_ASSERTION, $list_alt24, $list_alt31);
        register_cyc_api_function(ASSERTION_TRUTH, $list_alt22, $str_alt33$Return_the_current_truth_of_ASSER, $list_alt24, $list_alt34);
        register_cyc_api_function(ASSERTION_STRENGTH, $list_alt22, $str_alt36$Return_the_current_argumentation_, $list_alt24, $list_alt37);
        register_cyc_api_function(ASSERTION_VARIABLE_NAMES, $list_alt22, $str_alt39$Return_the_variable_names_for_ASS, $list_alt24, $list_alt40);
        register_cyc_api_function(ASSERTED_BY, $list_alt22, $str_alt42$Returns_the_cyclist_who_asserted_, $list_alt24, NIL);
        register_cyc_api_function(ASSERTED_WHEN, $list_alt22, $str_alt44$Returns_the_day_when_ASSERTION_wa, $list_alt24, $list_alt45);
        register_cyc_api_function(ASSERTION_FORMULA, $list_alt22, $str_alt47$Return_a_formula_for_ASSERTION_, $list_alt24, $list_alt48);
        register_cyc_api_function(ASSERTION_IST_FORMULA, $list_alt22, $str_alt51$Return_a_formula_in___ist_format_, $list_alt24, $list_alt48);
        register_cyc_api_function($sym53$ASSERTION_MENTIONS_TERM_, $list_alt54, $str_alt55$Return_T_iff_ASSERTION_s_formula_, $list_alt56, $list_alt57);
        register_obsolete_cyc_api_function(ASSERTION_MENTIONS_TERM, NIL, $list_alt54, $str_alt59$_see_assertion_mentions_term_, $list_alt56, $list_alt57);
        define_obsolete_register(ASSERTION_HAS_TYPE, $list_alt64);
        register_cyc_api_function(GAF_PREDICATE, $list_alt22, $str_alt68$Return_the_predicate_of_gaf_ASSER, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG0, $list_alt22, $str_alt70$Return_arg_0__the_predicate__of_t, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG1, $list_alt22, $str_alt72$Return_arg_1_of_the_gaf_ASSERTION, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG2, $list_alt22, $str_alt74$Return_arg_2_of_the_gaf_ASSERTION, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG3, $list_alt22, $str_alt76$Return_arg_3_of_the_gaf_ASSERTION, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG4, $list_alt22, $str_alt78$Return_arg_4_of_the_gaf_ASSERTION, $list_alt24, NIL);
        register_cyc_api_function(GAF_ARG5, $list_alt22, $str_alt80$Return_arg_5_of_the_gaf_ASSERTION, $list_alt24, NIL);
        define_obsolete_register(ASSERTION_HAS_DIRECTION, $list_alt83);
        register_cyc_api_function($sym85$FORWARD_ASSERTION_, $list_alt22, $str_alt86$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
        register_cyc_api_function($sym88$BACKWARD_ASSERTION_, $list_alt22, $str_alt89$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
        register_cyc_api_function($sym91$CODE_ASSERTION_, $list_alt22, $str_alt92$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
        register_cyc_api_function($sym94$ASSERTION_HAS_TRUTH_, $list_alt95, $str_alt96$Return_T_iff_ASSERTION_s_current_, $list_alt97, $list_alt57);
        register_obsolete_cyc_api_function(ASSERTION_HAS_TRUTH, NIL, $list_alt95, $str_alt99$_see_assertion_has_truth_, $list_alt97, $list_alt57);
        declare_defglobal($tl_assertion_lookaside_table$);
        define_obsolete_register(VALID_ASSERTION, $list_alt109);
        define_obsolete_register(INVALID_ASSERTION, $list_alt111);
        register_cyc_api_function($sym127$ASSERTED_ASSERTION_, $list_alt22, $str_alt128$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
        register_cyc_api_function($sym130$DEDUCED_ASSERTION_, $list_alt22, $str_alt131$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
        register_cyc_api_function(GET_ASSERTED_ARGUMENT, $list_alt22, $str_alt134$Return_the_asserted_argument_for_, $list_alt24, $list_alt135);
        register_cyc_api_function(ASSERTION_HAS_DEPENDENTS_P, $list_alt22, $str_alt137$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
        return NIL;
    }

    public static SubLObject setup_assertions_high_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(ASSERTION_CNF, $list34, $str35$Return_the_cnf_of_ASSERTION______, $list36, $list37);
            register_cyc_api_function(ASSERTION_MT, $list34, $str40$Return_the_mt_of_ASSERTION_, $list36, $list41);
            register_cyc_api_function(ASSERTION_DIRECTION, $list34, $str43$Return_the_direction_of_ASSERTION, $list36, $list44);
            register_cyc_api_function(ASSERTION_TRUTH, $list34, $str46$Return_the_current_truth_of_ASSER, $list36, $list47);
            register_cyc_api_function(ASSERTION_STRENGTH, $list34, $str49$Return_the_current_argumentation_, $list36, $list50);
            register_cyc_api_function(ASSERTION_VARIABLE_NAMES, $list34, $str52$Return_the_variable_names_for_ASS, $list36, $list53);
            register_cyc_api_function(ASSERTED_BY, $list34, $str55$Returns_the_cyclist_who_asserted_, $list36, NIL);
            register_cyc_api_function(ASSERTED_WHEN, $list34, $str57$Returns_the_day_when_ASSERTION_wa, $list36, $list58);
            register_cyc_api_function(ASSERTION_FORMULA, $list34, $str60$Return_a_formula_for_ASSERTION_, $list36, $list61);
            register_cyc_api_function(ASSERTION_IST_FORMULA, $list34, $str64$Return_a_formula_in___ist_format_, $list36, $list61);
            register_cyc_api_function($sym66$ASSERTION_MENTIONS_TERM_, $list67, $str68$Return_T_iff_ASSERTION_s_formula_, $list69, $list70);
            register_obsolete_cyc_api_function(ASSERTION_MENTIONS_TERM, NIL, $list67, $str72$_see_assertion_mentions_term_, $list69, $list70);
            define_obsolete_register(ASSERTION_HAS_TYPE, $list82);
            register_cyc_api_function(GAF_PREDICATE, $list34, $str85$Return_the_predicate_of_gaf_ASSER, $list36, NIL);
            register_cyc_api_function(GAF_ARG0, $list34, $str87$Return_arg_0__the_predicate__of_t, $list36, NIL);
            register_cyc_api_function(GAF_ARG1, $list34, $str89$Return_arg_1_of_the_gaf_ASSERTION, $list36, NIL);
            register_cyc_api_function(GAF_ARG2, $list34, $str91$Return_arg_2_of_the_gaf_ASSERTION, $list36, NIL);
            register_cyc_api_function(GAF_ARG3, $list34, $str93$Return_arg_3_of_the_gaf_ASSERTION, $list36, NIL);
            register_cyc_api_function(GAF_ARG4, $list34, $str95$Return_arg_4_of_the_gaf_ASSERTION, $list36, NIL);
            register_cyc_api_function(GAF_ARG5, $list34, $str97$Return_arg_5_of_the_gaf_ASSERTION, $list36, NIL);
            define_obsolete_register(ASSERTION_HAS_DIRECTION, $list100);
            register_cyc_api_function($sym102$FORWARD_ASSERTION_, $list34, $str103$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
            register_cyc_api_function($sym105$BACKWARD_ASSERTION_, $list34, $str106$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
            register_cyc_api_function($sym108$CODE_ASSERTION_, $list34, $str109$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
            register_cyc_api_function($sym111$ASSERTION_HAS_TRUTH_, $list112, $str113$Return_T_iff_ASSERTION_s_current_, $list114, $list70);
            register_obsolete_cyc_api_function(ASSERTION_HAS_TRUTH, NIL, $list112, $str116$_see_assertion_has_truth_, $list114, $list70);
            declare_defglobal($tl_assertion_lookaside_table$);
            define_obsolete_register(VALID_ASSERTION, $list128);
            define_obsolete_register(INVALID_ASSERTION, $list130);
            register_cyc_api_function($sym160$ASSERTED_ASSERTION_, $list34, $str161$Return_non_nil_IFF_assertion_has_, $list36, $list70);
            register_cyc_api_function($sym163$DEDUCED_ASSERTION_, $list34, $str164$Return_non_nil_IFF_assertion_has_, $list36, $list70);
            register_cyc_api_function(GET_ASSERTED_ARGUMENT, $list34, $str168$Return_the_asserted_argument_for_, $list36, $list169);
            register_cyc_api_function(ASSERTION_HAS_DEPENDENTS_P, $list34, $str171$Return_non_nil_IFF_assertion_has_, $list36, $list70);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(ASSERTION_CNF, $list_alt22, $str_alt23$Return_the_cnf_of_ASSERTION______, $list_alt24, $list_alt25);
            register_cyc_api_function(ASSERTION_MT, $list_alt22, $str_alt27$Return_the_mt_of_ASSERTION_, $list_alt24, $list_alt28);
            register_cyc_api_function(ASSERTION_DIRECTION, $list_alt22, $str_alt30$Return_the_direction_of_ASSERTION, $list_alt24, $list_alt31);
            register_cyc_api_function(ASSERTION_TRUTH, $list_alt22, $str_alt33$Return_the_current_truth_of_ASSER, $list_alt24, $list_alt34);
            register_cyc_api_function(ASSERTION_STRENGTH, $list_alt22, $str_alt36$Return_the_current_argumentation_, $list_alt24, $list_alt37);
            register_cyc_api_function(ASSERTION_VARIABLE_NAMES, $list_alt22, $str_alt39$Return_the_variable_names_for_ASS, $list_alt24, $list_alt40);
            register_cyc_api_function(ASSERTED_BY, $list_alt22, $str_alt42$Returns_the_cyclist_who_asserted_, $list_alt24, NIL);
            register_cyc_api_function(ASSERTED_WHEN, $list_alt22, $str_alt44$Returns_the_day_when_ASSERTION_wa, $list_alt24, $list_alt45);
            register_cyc_api_function(ASSERTION_FORMULA, $list_alt22, $str_alt47$Return_a_formula_for_ASSERTION_, $list_alt24, $list_alt48);
            register_cyc_api_function(ASSERTION_IST_FORMULA, $list_alt22, $str_alt51$Return_a_formula_in___ist_format_, $list_alt24, $list_alt48);
            register_cyc_api_function($sym53$ASSERTION_MENTIONS_TERM_, $list_alt54, $str_alt55$Return_T_iff_ASSERTION_s_formula_, $list_alt56, $list_alt57);
            register_obsolete_cyc_api_function(ASSERTION_MENTIONS_TERM, NIL, $list_alt54, $str_alt59$_see_assertion_mentions_term_, $list_alt56, $list_alt57);
            define_obsolete_register(ASSERTION_HAS_TYPE, $list_alt64);
            register_cyc_api_function(GAF_PREDICATE, $list_alt22, $str_alt68$Return_the_predicate_of_gaf_ASSER, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG0, $list_alt22, $str_alt70$Return_arg_0__the_predicate__of_t, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG1, $list_alt22, $str_alt72$Return_arg_1_of_the_gaf_ASSERTION, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG2, $list_alt22, $str_alt74$Return_arg_2_of_the_gaf_ASSERTION, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG3, $list_alt22, $str_alt76$Return_arg_3_of_the_gaf_ASSERTION, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG4, $list_alt22, $str_alt78$Return_arg_4_of_the_gaf_ASSERTION, $list_alt24, NIL);
            register_cyc_api_function(GAF_ARG5, $list_alt22, $str_alt80$Return_arg_5_of_the_gaf_ASSERTION, $list_alt24, NIL);
            define_obsolete_register(ASSERTION_HAS_DIRECTION, $list_alt83);
            register_cyc_api_function($sym85$FORWARD_ASSERTION_, $list_alt22, $str_alt86$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
            register_cyc_api_function($sym88$BACKWARD_ASSERTION_, $list_alt22, $str_alt89$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
            register_cyc_api_function($sym91$CODE_ASSERTION_, $list_alt22, $str_alt92$Predicate_returns_T_iff_ASSERTION, NIL, $list_alt57);
            register_cyc_api_function($sym94$ASSERTION_HAS_TRUTH_, $list_alt95, $str_alt96$Return_T_iff_ASSERTION_s_current_, $list_alt97, $list_alt57);
            register_obsolete_cyc_api_function(ASSERTION_HAS_TRUTH, NIL, $list_alt95, $str_alt99$_see_assertion_has_truth_, $list_alt97, $list_alt57);
            define_obsolete_register(VALID_ASSERTION, $list_alt109);
            define_obsolete_register(INVALID_ASSERTION, $list_alt111);
            register_cyc_api_function($sym127$ASSERTED_ASSERTION_, $list_alt22, $str_alt128$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
            register_cyc_api_function($sym130$DEDUCED_ASSERTION_, $list_alt22, $str_alt131$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
            register_cyc_api_function(GET_ASSERTED_ARGUMENT, $list_alt22, $str_alt134$Return_the_asserted_argument_for_, $list_alt24, $list_alt135);
            register_cyc_api_function(ASSERTION_HAS_DEPENDENTS_P, $list_alt22, $str_alt137$Return_non_nil_IFF_assertion_has_, $list_alt24, $list_alt57);
        }
        return NIL;
    }

    public static SubLObject setup_assertions_high_file_Previous() {
        register_cyc_api_function(ASSERTION_CNF, $list34, $str35$Return_the_cnf_of_ASSERTION______, $list36, $list37);
        register_cyc_api_function(ASSERTION_MT, $list34, $str40$Return_the_mt_of_ASSERTION_, $list36, $list41);
        register_cyc_api_function(ASSERTION_DIRECTION, $list34, $str43$Return_the_direction_of_ASSERTION, $list36, $list44);
        register_cyc_api_function(ASSERTION_TRUTH, $list34, $str46$Return_the_current_truth_of_ASSER, $list36, $list47);
        register_cyc_api_function(ASSERTION_STRENGTH, $list34, $str49$Return_the_current_argumentation_, $list36, $list50);
        register_cyc_api_function(ASSERTION_VARIABLE_NAMES, $list34, $str52$Return_the_variable_names_for_ASS, $list36, $list53);
        register_cyc_api_function(ASSERTED_BY, $list34, $str55$Returns_the_cyclist_who_asserted_, $list36, NIL);
        register_cyc_api_function(ASSERTED_WHEN, $list34, $str57$Returns_the_day_when_ASSERTION_wa, $list36, $list58);
        register_cyc_api_function(ASSERTION_FORMULA, $list34, $str60$Return_a_formula_for_ASSERTION_, $list36, $list61);
        register_cyc_api_function(ASSERTION_IST_FORMULA, $list34, $str64$Return_a_formula_in___ist_format_, $list36, $list61);
        register_cyc_api_function($sym66$ASSERTION_MENTIONS_TERM_, $list67, $str68$Return_T_iff_ASSERTION_s_formula_, $list69, $list70);
        register_obsolete_cyc_api_function(ASSERTION_MENTIONS_TERM, NIL, $list67, $str72$_see_assertion_mentions_term_, $list69, $list70);
        define_obsolete_register(ASSERTION_HAS_TYPE, $list82);
        register_cyc_api_function(GAF_PREDICATE, $list34, $str85$Return_the_predicate_of_gaf_ASSER, $list36, NIL);
        register_cyc_api_function(GAF_ARG0, $list34, $str87$Return_arg_0__the_predicate__of_t, $list36, NIL);
        register_cyc_api_function(GAF_ARG1, $list34, $str89$Return_arg_1_of_the_gaf_ASSERTION, $list36, NIL);
        register_cyc_api_function(GAF_ARG2, $list34, $str91$Return_arg_2_of_the_gaf_ASSERTION, $list36, NIL);
        register_cyc_api_function(GAF_ARG3, $list34, $str93$Return_arg_3_of_the_gaf_ASSERTION, $list36, NIL);
        register_cyc_api_function(GAF_ARG4, $list34, $str95$Return_arg_4_of_the_gaf_ASSERTION, $list36, NIL);
        register_cyc_api_function(GAF_ARG5, $list34, $str97$Return_arg_5_of_the_gaf_ASSERTION, $list36, NIL);
        define_obsolete_register(ASSERTION_HAS_DIRECTION, $list100);
        register_cyc_api_function($sym102$FORWARD_ASSERTION_, $list34, $str103$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
        register_cyc_api_function($sym105$BACKWARD_ASSERTION_, $list34, $str106$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
        register_cyc_api_function($sym108$CODE_ASSERTION_, $list34, $str109$Predicate_returns_T_iff_ASSERTION, NIL, $list70);
        register_cyc_api_function($sym111$ASSERTION_HAS_TRUTH_, $list112, $str113$Return_T_iff_ASSERTION_s_current_, $list114, $list70);
        register_obsolete_cyc_api_function(ASSERTION_HAS_TRUTH, NIL, $list112, $str116$_see_assertion_has_truth_, $list114, $list70);
        declare_defglobal($tl_assertion_lookaside_table$);
        define_obsolete_register(VALID_ASSERTION, $list128);
        define_obsolete_register(INVALID_ASSERTION, $list130);
        register_cyc_api_function($sym160$ASSERTED_ASSERTION_, $list34, $str161$Return_non_nil_IFF_assertion_has_, $list36, $list70);
        register_cyc_api_function($sym163$DEDUCED_ASSERTION_, $list34, $str164$Return_non_nil_IFF_assertion_has_, $list36, $list70);
        register_cyc_api_function(GET_ASSERTED_ARGUMENT, $list34, $str168$Return_the_asserted_argument_for_, $list36, $list169);
        register_cyc_api_function(ASSERTION_HAS_DEPENDENTS_P, $list34, $str171$Return_non_nil_IFF_assertion_has_, $list36, $list70);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_assertions_high_file();
    }

    @Override
    public void initializeVariables() {
        init_assertions_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertions_high_file();
    }

    static {
    }

    public static final class $assertion_mt$UnaryFunction extends UnaryFunction {
        public $assertion_mt$UnaryFunction() {
            super(extractFunctionNamed("ASSERTION-MT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return assertion_mt(arg1);
        }
    }

    public static final class $assertion_formula$UnaryFunction extends UnaryFunction {
        public $assertion_formula$UnaryFunction() {
            super(extractFunctionNamed("ASSERTION-FORMULA"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return assertion_formula(arg1);
        }
    }

    public static final class $gaf_formula$UnaryFunction extends UnaryFunction {
        public $gaf_formula$UnaryFunction() {
            super(extractFunctionNamed("GAF-FORMULA"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gaf_formula(arg1);
        }
    }

    public static final class $invalid_assertionP$UnaryFunction extends UnaryFunction {
        public $invalid_assertionP$UnaryFunction() {
            super(extractFunctionNamed("INVALID-ASSERTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_assertionP(arg1, assertions_high.$invalid_assertionP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $invalid_assertionP$BinaryFunction extends BinaryFunction {
        public $invalid_assertionP$BinaryFunction() {
            super(extractFunctionNamed("INVALID-ASSERTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return invalid_assertionP(arg1, arg2);
        }
    }

    public static final class $valid_assertion$UnaryFunction extends UnaryFunction {
        public $valid_assertion$UnaryFunction() {
            super(extractFunctionNamed("VALID-ASSERTION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return valid_assertion(arg1, assertions_high.$valid_assertion$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $valid_assertion$BinaryFunction extends BinaryFunction {
        public $valid_assertion$BinaryFunction() {
            super(extractFunctionNamed("VALID-ASSERTION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return valid_assertion(arg1, arg2);
        }
    }
}

