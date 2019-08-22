/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class assertions_high extends SubLTranslatedFile {
    public static final SubLFile me = new assertions_high();

    public static final String myName = "com.cyc.cycjava.cycl.assertions_high";

    public static final String myFingerPrint = "c6dc687939519d69446fa9a4d6b82299b6e4cd544b3594edfdea38d57acf472b";



    // deflexical
    private static final SubLSymbol $tl_assertion_capacity$ = makeSymbol("*TL-ASSERTION-CAPACITY*");

    // defparameter
    public static final SubLSymbol $assertion_dump_id_table$ = makeSymbol("*ASSERTION-DUMP-ID-TABLE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");

    public static final SubLList $list6 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol ASSERTION_DEPENDENTS = makeSymbol("ASSERTION-DEPENDENTS");

    public static final SubLList $list9 = list(list(makeSymbol("LIT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list10 = list(makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("DONE"));





    private static final SubLSymbol $sym13$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");



    private static final SubLSymbol DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");





    private static final SubLSymbol $sym18$CNF_VAR = makeUninternedSymbol("CNF-VAR");

    private static final SubLSymbol $sym19$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    private static final SubLSymbol ASSERTION_CNF = makeSymbol("ASSERTION-CNF");

    private static final SubLSymbol DO_ALL_LITS_AS_ASENTS = makeSymbol("DO-ALL-LITS-AS-ASENTS");

    public static final SubLList $list22 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping assertions for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list23 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));





    private static final SubLString $$$mapping_assertions_for_sweep = makeString("mapping assertions for sweep");





    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol ASSERTIONS_AROUND = makeSymbol("ASSERTIONS-AROUND");

    public static final SubLList $list31 = list(makeSymbol("NEXT-ASSERTION-ID"));

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");



    public static final SubLList $list34 = list(makeSymbol("ASSERTION"));

    private static final SubLString $str35$Return_the_cnf_of_ASSERTION______ = makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");

    private static final SubLList $list36 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    public static final SubLList $list37 = list(makeSymbol("CNF-P"));





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

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    private static final SubLString $str64$Return_a_formula_in___ist_format_ = makeString("Return a formula in #$ist format for ASSERTION.");



    private static final SubLSymbol $sym66$ASSERTION_MENTIONS_TERM_ = makeSymbol("ASSERTION-MENTIONS-TERM?");

    private static final SubLList $list67 = list(makeSymbol("ASSERTION"), makeSymbol("TERM"));

    private static final SubLString $str68$Return_T_iff_ASSERTION_s_formula_ = makeString("Return T iff ASSERTION\'s formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");

    private static final SubLList $list69 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));

    private static final SubLList $list70 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol ASSERTION_MENTIONS_TERM = makeSymbol("ASSERTION-MENTIONS-TERM");

    private static final SubLString $str72$_see_assertion_mentions_term_ = makeString("@see assertion-mentions-term?");

    private static final SubLObject $$performSubL = reader_make_constant_shell(makeString("performSubL"));

    private static final SubLSymbol $sym74$KB_TMS_METHOD_ = makeSymbol("KB-TMS-METHOD?");

    private static final SubLList $list75 = list(reader_make_constant_shell(makeString("reconsiderAssertionDeductions")), reader_make_constant_shell(makeString("repropagateAssertion")));

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

    private static final SubLList $list175 = list(list(makeSymbol("*ASSERTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-DUMP-ID"))));

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

    public static SubLObject assertion_cnf(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_cnf(assertion) : NIL;
    }

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

    public static SubLObject possibly_assertion_cnf(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_possibly_assertion_cnf(assertion) : NIL;
    }

    public static SubLObject assertion_mt(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_mt(assertion) : NIL;
    }

    public static SubLObject assertion_gaf_hl_formula(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_gaf_hl_formula(assertion) : NIL;
    }

    public static SubLObject assertion_cons(final SubLObject assertion) {
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_cons(assertion) : NIL;
    }

    public static SubLObject gaf_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.valid_assertion_handleP(assertion)) && (NIL != assertions_interface.kb_gaf_assertionP(assertion)));
    }

    public static SubLObject rule_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.valid_assertion_handleP(assertion)) && (NIL != assertions_interface.kb_rule_assertionP(assertion)));
    }

    public static SubLObject assertion_direction(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_direction(assertion) : NIL;
    }

    public static SubLObject assertion_truth(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_truth(assertion) : NIL;
    }

    public static SubLObject assertion_strength(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_strength(assertion) : NIL;
    }

    public static SubLObject assertion_variable_names(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_variable_names(assertion) : NIL;
    }

    public static SubLObject asserted_by(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_by(assertion) : NIL;
    }

    public static SubLObject asserted_when(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_when(assertion) : NIL;
    }

    public static SubLObject asserted_why(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_why(assertion) : NIL;
    }

    public static SubLObject asserted_second(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_asserted_second(assertion) : NIL;
    }

    public static SubLObject assertion_arguments(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_arguments(assertion) : NIL;
    }

    public static SubLObject assertion_dependents(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? assertions_interface.kb_assertion_dependents(assertion) : NIL;
    }

    public static SubLObject assertion_dependent_list(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != assertion_handles.assertion_handle_validP(assertion) ? set_contents.set_contents_element_list(assertions_interface.kb_assertion_dependents(assertion)) : NIL;
    }

    public static SubLObject cyc_assertion_tv(final SubLObject assertion) {
        final SubLObject truth = assertion_truth(assertion);
        final SubLObject strength = assertion_strength(assertion);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }

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

    public static SubLObject assertion_ist_formula(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list($$ist, assertion_mt(assertion), assertion_formula(assertion));
    }

    public static SubLObject assertion_ist_sentence(final SubLObject assertion) {
        return assertion_ist_formula(assertion);
    }

    public static SubLObject assertion_to_hl_assertion_spec(final SubLObject assertion) {
        final SubLObject cnf = assertion_cnf(assertion);
        final SubLObject mt = assertion_mt(assertion);
        final SubLObject direction = assertion_direction(assertion);
        final SubLObject variable_map = assertion_variable_names(assertion);
        return hl_storage_modules.new_hl_assertion_spec(cnf, mt, direction, variable_map);
    }

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

    public static SubLObject assertion_mentions_term(final SubLObject assertion, final SubLObject v_term) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(v_term, HL_TERM_P);
        return assertion_mentions_termP(assertion, v_term);
    }

    public static SubLObject assertion_cnf_or_gaf_hl_formula(final SubLObject assertion) {
        return NIL != gaf_assertionP(assertion) ? assertion_gaf_hl_formula(assertion) : assertion_cnf(assertion);
    }

    public static SubLObject backward_ruleP(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != backward_assertionP(assertion)));
    }

    public static SubLObject forward_ruleP(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != forward_assertionP(assertion)));
    }

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

    public static SubLObject backward_gafP(final SubLObject assertion) {
        return makeBoolean((NIL != gaf_assertionP(assertion)) && (NIL != backward_assertionP(assertion)));
    }

    public static SubLObject forward_gafP(final SubLObject assertion) {
        return makeBoolean((NIL != gaf_assertionP(assertion)) && (NIL != forward_assertionP(assertion)));
    }

    public static SubLObject assertion_type(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != gaf_assertionP(assertion)) {
            return $GAF;
        }
        if (NIL != rule_assertionP(assertion)) {
            return $RULE;
        }
        Errors.warn($str79$Could_not_determine_assertion_typ, assertion);
        return NIL;
    }

    public static SubLObject assertion_has_mtP(final SubLObject assertion, final SubLObject mt) {
        return hlmt.hlmt_equal(mt, assertion_mt(assertion));
    }

    public static SubLObject assertion_has_typeP(final SubLObject assertion, final SubLObject type) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.assertion_type_p(type) : "enumeration_types.assertion_type_p(type) " + "CommonSymbols.NIL != enumeration_types.assertion_type_p(type) " + type;
        return eq(type, assertion_type(assertion));
    }

    public static SubLObject assertion_has_type(final SubLObject assertion, final SubLObject type) {
        return assertion_has_typeP(assertion, type);
    }

    public static SubLObject ground_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != gaf_assertionP(assertion)) || (NIL != clauses.ground_clause_p(assertion_cnf(assertion)))));
    }

    public static SubLObject atomic_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ((NIL != gaf_assertionP(assertion)) || (NIL != clauses.atomic_clause_p(assertion_cnf(assertion)))));
    }

    public static SubLObject meta_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), assertion_cons(assertion), UNPROVIDED)));
    }

    public static SubLObject lifting_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != rule_assertionP(assertion)) && (NIL != clauses.lifting_clause_p(assertion_cnf(assertion))));
    }

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
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
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

    public static SubLObject assertion_constants(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return cycl_utilities.formula_constants(list(assertion_cnf_or_gaf_hl_formula(assertion), assertion_mt(assertion)), T);
    }

    public static SubLObject gaf_formula(final SubLObject assertion) {
        return gaf_hl_formula(assertion);
    }

    public static SubLObject gaf_hl_formula(final SubLObject assertion) {
        assert NIL != gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        return assertion_gaf_hl_formula(assertion);
    }

    public static SubLObject gaf_el_formula(final SubLObject assertion) {
        assert NIL != gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        return assertion_gaf_el_formula(assertion);
    }

    public static SubLObject assertion_gaf_el_formula(final SubLObject assertion) {
        final SubLObject formula = assertion_gaf_hl_formula(assertion);
        return (NIL != formula) && ($FALSE == assertion_truth(assertion)) ? cycl_utilities.negate(formula) : formula;
    }

    public static SubLObject gaf_args(final SubLObject assertion) {
        return cycl_utilities.formula_args(gaf_formula(assertion), UNPROVIDED);
    }

    public static SubLObject gaf_arg(final SubLObject assertion, final SubLObject n) {
        return nth(n, gaf_formula(assertion));
    }

    public static SubLObject gaf_predicate(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }

    public static SubLObject gaf_arg0(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }

    public static SubLObject gaf_arg1(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, ONE_INTEGER);
    }

    public static SubLObject gaf_arg2(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, TWO_INTEGER);
    }

    public static SubLObject gaf_arg3(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, THREE_INTEGER);
    }

    public static SubLObject gaf_arg4(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, FOUR_INTEGER);
    }

    public static SubLObject gaf_arg5(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return gaf_arg(assertion, FIVE_INTEGER);
    }

    public static SubLObject assertion_has_directionP(final SubLObject assertion, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        return eq(direction, assertion_direction(assertion));
    }

    public static SubLObject assertion_has_direction(final SubLObject assertion, final SubLObject direction) {
        return assertion_has_directionP(assertion, direction);
    }

    public static SubLObject forward_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($FORWARD == assertion_direction(assertion)));
    }

    public static SubLObject backward_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($BACKWARD == assertion_direction(assertion)));
    }

    public static SubLObject code_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && ($CODE == assertion_direction(assertion)));
    }

    public static SubLObject assertion_has_truthP(final SubLObject assertion, final SubLObject truth) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        return eq(assertion_truth(assertion), truth);
    }

    public static SubLObject assertion_has_truth(final SubLObject assertion, final SubLObject truth) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        return assertion_has_truthP(assertion, truth);
    }

    public static SubLObject assertion_date(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
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

    public static SubLObject assertion_asserted_dateP(final SubLObject assertion, final SubLObject cycl_date) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) " + cycl_date;
        final SubLObject ass_date = assertion_date(assertion);
        return NIL != ass_date ? time_interval_utilities.date_interval_subsumesP(cycl_date, ass_date) : NIL;
    }

    public static SubLObject new_assertion_asserted_date_iterator(final SubLObject cycl_date) {
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) " + cycl_date;
        final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
        final SubLObject filter_args = list(cycl_date);
        return iteration.new_filter_iterator(input_iterator, $sym119$ASSERTION_ASSERTED_DATE_, filter_args);
    }

    public static SubLObject all_assertions_asserted_date(final SubLObject cycl_date) {
        assert NIL != date_utilities.generalized_date_p(cycl_date) : "date_utilities.generalized_date_p(cycl_date) " + "CommonSymbols.NIL != date_utilities.generalized_date_p(cycl_date) " + cycl_date;
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

    public static SubLObject assertion_el_variables(final SubLObject assertion) {
        return Mapping.mapcar(symbol_function(INTERN_EL_VAR), assertion_variable_names(assertion));
    }

    public static SubLObject assertion_hl_variables(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return NIL != gaf_assertionP(assertion) ? NIL : variables.gather_hl_variables(assertion_cnf(assertion));
    }

    public static SubLObject assertion_free_hl_variables(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return backward_utilities.inference_clause_free_variables(assertion_cnf(assertion));
    }

    public static SubLObject assertion_el_variable_to_hl(final SubLObject assertion, final SubLObject el_variable) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != cycl_grammar.el_variable_p(el_variable) : "cycl_grammar.el_variable_p(el_variable) " + "CommonSymbols.NIL != cycl_grammar.el_variable_p(el_variable) " + el_variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject el_variable_name = cycl_variables.el_var_name(el_variable);
        final SubLObject hl_variable_id = position(el_variable_name, variable_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_variable_id) {
            return variables.find_variable_by_id(hl_variable_id);
        }
        return NIL;
    }

    public static SubLObject assertion_hl_variable_to_el(final SubLObject assertion, final SubLObject variable) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != variables.variable_p(variable) : "variables.variable_p(variable) " + "CommonSymbols.NIL != variables.variable_p(variable) " + variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject hl_variable_id = variables.variable_id(variable);
        final SubLObject el_variable_name = nth(hl_variable_id, variable_names);
        if (el_variable_name.isString()) {
            return cycl_variables.make_el_var(el_variable_name);
        }
        return NIL;
    }

    public static SubLObject assertion_hl_to_el_variable_map(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), assertion_hl_variables(assertion), new SubLObject[]{ assertion_el_variables(assertion) });
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

    public static SubLObject remove_asserted_assertion_timestamp(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject result = assertions_low.asserted_assertion_timestampedP(assertion);
        timestamp_asserted_assertion(assertion, NIL, NIL, NIL, NIL);
        return result;
    }

    public static SubLObject tl_timestamp_asserted_assertion(final SubLObject tl_assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second) {
        return timestamp_asserted_assertion(tl_find_assertion(tl_assertion), canon_tl.transform_tl_terms_to_hl(who), canon_tl.transform_tl_terms_to_hl(when), canon_tl.transform_tl_terms_to_hl(why), canon_tl.transform_tl_terms_to_hl(second));
    }

    public static SubLObject tl_cache_assertion(final SubLObject tl_assertion, final SubLObject hl_assertion) {
        $tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values($tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, hl_assertion, $tl_assertion_capacity$.getGlobalValue(), symbol_function(EQUAL)));
        return tl_assertion;
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

    public static SubLObject invalid_assertionP(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)));
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

    public static SubLObject valid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return assertion_handles.valid_assertionP(assertion, UNPROVIDED);
    }

    public static SubLObject invalid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return invalid_assertionP(assertion, UNPROVIDED);
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
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
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
        assert NIL != subl_promotions.non_negative_integer_p(assertion_id) : "subl_promotions.non_negative_integer_p(assertion_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(assertion_id) " + assertion_id;
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
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        return create_assertion_int(cnf, mt, var_names, direction, truth, strength, asserted_argument);
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
        assert NIL != el_formula_p(gaf) : "el_utilities.el_formula_p(gaf) " + "CommonSymbols.NIL != el_utilities.el_formula_p(gaf) " + gaf;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        return create_assertion_int(clause_utilities.make_gaf_cnf(gaf), mt, NIL, direction, truth, strength, asserted_argument);
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
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        SubLObject new_assertionP = NIL;
        SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
        if (NIL == assertion) {
            assertion = create_assertion(cnf, mt, var_names, direction, truth, strength, asserted_argument);
            new_assertionP = T;
        }
        return values(assertion, new_assertionP);
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
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        final SubLObject assertion = kb_indexing.find_gaf(gaf, mt);
        return NIL != assertion ? assertion : create_gaf(gaf, mt, direction, truth, strength, asserted_argument);
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

    public static SubLObject remove_assertion(final SubLObject assertion) {
        return assertions_interface.kb_remove_assertion(assertion);
    }

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

    public static SubLObject possibly_remove_broken_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
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

    public static SubLObject matching_argument_on_assertion(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        return find(argument, assertion_arguments(assertion), symbol_function(ARGUMENT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject only_argument_of_assertion_p(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        return makeBoolean(NIL == assertion_has_some_argument_other_thanP(assertion, argument));
    }

    public static SubLObject assertion_has_some_argument_other_thanP(final SubLObject assertion, final SubLObject argument) {
        return subl_promotions.memberP(argument, assertion_arguments(assertion), NOT_EQL, UNPROVIDED);
    }

    public static SubLObject asserted_assertionP(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject deduced_assertionP(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(find_if(symbol_function(DEDUCTION_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject only_deduced_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != deduced_assertionP(assertion)) && (NIL == asserted_assertionP(assertion)));
    }

    public static SubLObject forward_deduced_assertionP(final SubLObject assertion, SubLObject include_code_deduced_assertionsP) {
        if (include_code_deduced_assertionsP == UNPROVIDED) {
            include_code_deduced_assertionsP = T;
        }
        return list_utilities.sublisp_boolean(find_if(NIL != include_code_deduced_assertionsP ? symbol_function($sym165$FORWARD_DEDUCTION_) : symbol_function($sym166$FORWARD_NOT_CODE_DEDUCTION_), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_asserted_argument(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return find_if(symbol_function(ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_asserted_argument_and_more(final SubLObject assertion) {
        final SubLObject v_arguments = assertion_arguments(assertion);
        final SubLObject asserted_argument = find_if(symbol_function(ASSERTED_ARGUMENT_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject last_argumentP = (NIL != asserted_argument) ? list_utilities.singletonP(v_arguments) : NIL;
        return values(asserted_argument, last_argumentP);
    }

    public static SubLObject assertion_deductions(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return list_utilities.remove_if_not(symbol_function(DEDUCTION_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_dependent_count(final SubLObject assertion) {
        return assertions_low.assertion_dependent_count_internal(assertion);
    }

    public static SubLObject assertion_has_dependents_p(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return assertions_low.assertion_has_dependents_p_internal(assertion);
    }

    public static SubLObject random_assertion(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        return assertions_low.random_assertion_internal(test);
    }

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
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
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

    public static SubLObject random_rule() {
        return assertions_low.random_rule_internal();
    }

    public static SubLObject random_gaf() {
        return assertions_low.random_gaf_internal();
    }

    public static SubLObject assertion_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_assertion_checkpoint() {
        final SubLObject assertion_count = assertion_handles.assertion_count();
        final SubLObject next_assertion_id = assertion_handles.next_assertion_id();
        return list(assertion_count, next_assertion_id);
    }

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

    public static SubLObject with_assertion_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list175, append(body, NIL));
    }

    public static SubLObject assertion_dump_id(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject dump_table = $assertion_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static SubLObject find_assertion_by_dump_id(final SubLObject dump_id) {
        return assertion_handles.find_assertion_by_id(dump_id);
    }

    public static SubLObject declare_assertions_high_file() {
        declareMacro(me, "do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
        declareMacro(me, "do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
        declareMacro(me, "do_assertion_literals", "DO-ASSERTION-LITERALS");
        declareMacro(me, "do_recent_assertions", "DO-RECENT-ASSERTIONS");
        declareFunction(me, "assertion_cnf", "ASSERTION-CNF", 1, 0, false);
        declareFunction(me, "intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
        declareFunction(me, "intuitive_cnf", "INTUITIVE-CNF", 2, 0, false);
        declareFunction(me, "possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
        declareFunction(me, "assertion_mt", "ASSERTION-MT", 1, 0, false);
        new assertions_high.$assertion_mt$UnaryFunction();
        declareFunction(me, "assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
        declareFunction(me, "assertion_cons", "ASSERTION-CONS", 1, 0, false);
        declareFunction(me, "gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
        declareFunction(me, "rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
        declareFunction(me, "assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
        declareFunction(me, "assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
        declareFunction(me, "assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
        declareFunction(me, "assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
        declareFunction(me, "asserted_by", "ASSERTED-BY", 1, 0, false);
        declareFunction(me, "asserted_when", "ASSERTED-WHEN", 1, 0, false);
        declareFunction(me, "asserted_why", "ASSERTED-WHY", 1, 0, false);
        declareFunction(me, "asserted_second", "ASSERTED-SECOND", 1, 0, false);
        declareFunction(me, "assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction(me, "assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
        declareFunction(me, "assertion_dependent_list", "ASSERTION-DEPENDENT-LIST", 1, 0, false);
        declareFunction(me, "cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
        declareFunction(me, "assertion_formula", "ASSERTION-FORMULA", 1, 0, false);
        new assertions_high.$assertion_formula$UnaryFunction();
        declareFunction(me, "assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
        declareFunction(me, "assertion_ist_sentence", "ASSERTION-IST-SENTENCE", 1, 0, false);
        declareFunction(me, "assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
        declareFunction(me, "assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
        declareFunction(me, "assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
        declareFunction(me, "assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
        declareFunction(me, "assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
        declareFunction(me, "backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
        declareFunction(me, "forward_ruleP", "FORWARD-RULE?", 1, 0, false);
        declareFunction(me, "single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
        declareFunction(me, "single_literal_antecedent_ruleP", "SINGLE-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        declareFunction(me, "two_literal_antecedent_ruleP", "TWO-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        declareFunction(me, "forward_tms_ruleP", "FORWARD-TMS-RULE?", 1, 0, false);
        declareFunction(me, "cycl_tms_predicateP", "CYCL-TMS-PREDICATE?", 1, 0, false);
        declareFunction(me, "kb_tms_methodP", "KB-TMS-METHOD?", 1, 0, false);
        declareFunction(me, "backward_gafP", "BACKWARD-GAF?", 1, 0, false);
        declareFunction(me, "forward_gafP", "FORWARD-GAF?", 1, 0, false);
        declareFunction(me, "assertion_type", "ASSERTION-TYPE", 1, 0, false);
        declareFunction(me, "assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
        declareFunction(me, "assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
        declareFunction(me, "assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
        declareFunction(me, "ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
        declareFunction(me, "atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
        declareFunction(me, "meta_assertionP", "META-ASSERTION?", 1, 0, false);
        declareFunction(me, "lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
        declareFunction(me, "assertion_forts", "ASSERTION-FORTS", 1, 4, false);
        declareFunction(me, "assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
        declareFunction(me, "gaf_formula", "GAF-FORMULA", 1, 0, false);
        new assertions_high.$gaf_formula$UnaryFunction();
        declareFunction(me, "gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
        declareFunction(me, "gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
        declareFunction(me, "assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
        declareFunction(me, "gaf_args", "GAF-ARGS", 1, 0, false);
        declareFunction(me, "gaf_arg", "GAF-ARG", 2, 0, false);
        declareFunction(me, "gaf_predicate", "GAF-PREDICATE", 1, 0, false);
        declareFunction(me, "gaf_arg0", "GAF-ARG0", 1, 0, false);
        declareFunction(me, "gaf_arg1", "GAF-ARG1", 1, 0, false);
        declareFunction(me, "gaf_arg2", "GAF-ARG2", 1, 0, false);
        declareFunction(me, "gaf_arg3", "GAF-ARG3", 1, 0, false);
        declareFunction(me, "gaf_arg4", "GAF-ARG4", 1, 0, false);
        declareFunction(me, "gaf_arg5", "GAF-ARG5", 1, 0, false);
        declareFunction(me, "assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
        declareFunction(me, "assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
        declareFunction(me, "forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
        declareFunction(me, "backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
        declareFunction(me, "code_assertionP", "CODE-ASSERTION?", 1, 0, false);
        declareFunction(me, "assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
        declareFunction(me, "assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
        declareFunction(me, "assertion_date", "ASSERTION-DATE", 1, 0, false);
        declareFunction(me, "assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false);
        declareFunction(me, "new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false);
        declareFunction(me, "all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false);
        declareFunction(me, "assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
        declareFunction(me, "assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
        declareFunction(me, "assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
        declareFunction(me, "assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
        declareFunction(me, "assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
        declareFunction(me, "assertion_hl_to_el_variable_map", "ASSERTION-HL-TO-EL-VARIABLE-MAP", 1, 0, false);
        declareFunction(me, "timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
        declareFunction(me, "remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
        declareFunction(me, "tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
        declareFunction(me, "tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
        declareFunction(me, "tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
        declareFunction(me, "invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false);
        new assertions_high.$invalid_assertionP$UnaryFunction();
        new assertions_high.$invalid_assertionP$BinaryFunction();
        declareFunction(me, "invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
        declareFunction(me, "valid_assertion", "VALID-ASSERTION", 1, 1, false);
        new assertions_high.$valid_assertion$UnaryFunction();
        new assertions_high.$valid_assertion$BinaryFunction();
        declareFunction(me, "invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
        declareFunction(me, "assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
        declareFunction(me, "assertions_around_assertion", "ASSERTIONS-AROUND-ASSERTION", 1, 3, false);
        declareFunction(me, "assertions_around", "ASSERTIONS-AROUND", 1, 3, false);
        declareFunction(me, "kb_objects_around_id", "KB-OBJECTS-AROUND-ID", 7, 0, false);
        declareFunction(me, "create_assertion", "CREATE-ASSERTION", 2, 5, false);
        declareFunction(me, "create_gaf", "CREATE-GAF", 2, 4, false);
        declareFunction(me, "find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 5, false);
        declareFunction(me, "find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 4, false);
        declareFunction(me, "create_assertion_int", "CREATE-ASSERTION-INT", 2, 5, false);
        declareFunction(me, "remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
        declareFunction(me, "remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
        declareFunction(me, "possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
        declareFunction(me, "matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
        declareFunction(me, "only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
        declareFunction(me, "assertion_has_some_argument_other_thanP", "ASSERTION-HAS-SOME-ARGUMENT-OTHER-THAN?", 2, 0, false);
        declareFunction(me, "asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
        declareFunction(me, "deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction(me, "only_deduced_assertionP", "ONLY-DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction(me, "forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 1, false);
        declareFunction(me, "get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
        declareFunction(me, "get_asserted_argument_and_more", "GET-ASSERTED-ARGUMENT-AND-MORE", 1, 0, false);
        declareFunction(me, "assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
        declareFunction(me, "assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
        declareFunction(me, "assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
        declareFunction(me, "random_assertion", "RANDOM-ASSERTION", 0, 1, false);
        declareFunction(me, "sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
        declareFunction(me, "random_rule", "RANDOM-RULE", 0, 0, false);
        declareFunction(me, "random_gaf", "RANDOM-GAF", 0, 0, false);
        declareFunction(me, "assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
        declareFunction(me, "assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
        declareMacro(me, "with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
        declareFunction(me, "assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
        declareFunction(me, "find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_assertions_high_file() {
        deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", SubLTrampolineFile.maybeDefault($tl_assertion_lookaside_table$, $tl_assertion_lookaside_table$, NIL));
        deflexical("*TL-ASSERTION-CAPACITY*", FIVE_INTEGER);
        defparameter("*ASSERTION-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_assertions_high_file() {
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

