package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class deductions_high extends SubLTranslatedFile {
    public static final SubLFile me = new deductions_high();

    public static final String myName = "com.cyc.cycjava.cycl.deductions_high";

    public static final String myFingerPrint = "a039d6d2e83a3ce998f53b8cf341cdd51d0d90353ce2e360e427ff276caa2c13";

    // defparameter
    public static final SubLSymbol $deduction_dump_id_table$ = makeSymbol("*DEDUCTION-DUMP-ID-TABLE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("SUPPORT"), makeSymbol("DEDUCTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol DEDUCTION_SUPPORTS = makeSymbol("DEDUCTION-SUPPORTS");

    private static final SubLList $list6 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list7 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));



    private static final SubLSymbol $sym9$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");



    private static final SubLSymbol DO_DEDUCTIONS_BACKWARDS = makeSymbol("DO-DEDUCTIONS-BACKWARDS");

    private static final SubLSymbol $sym12$SOFAR_VAR = makeUninternedSymbol("SOFAR-VAR");

    private static final SubLSymbol $sym13$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLList $list14 = list(list(makeSymbol("DEDUCTION-COUNT")));

    public static final SubLList $list15 = list(ZERO_INTEGER);







    private static final SubLSymbol $sym19$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");



    private static final SubLList $list22 = list(makeSymbol("NEXT-DEDUCTION-ID"));





    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");



    public static final SubLList $list27 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping deductions for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list28 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));



    private static final SubLString $$$mapping_deductions_for_sweep = makeString("mapping deductions for sweep");





    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol DEDUCTIONS_AROUND = makeSymbol("DEDUCTIONS-AROUND");

    private static final SubLSymbol DO_DEDUCTIONS = makeSymbol("DO-DEDUCTIONS");





    private static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");









    private static final SubLInteger $int$500 = makeInteger(500);



    private static final SubLSymbol SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");

    private static final SubLObject $$skolem = reader_make_constant_shell(makeString("skolem"));

    private static final SubLSymbol DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");

    private static final SubLList $list48 = list(makeSymbol("DEDUCTION"));

    private static final SubLString $str49$Return_the_support_for_which_DEDU = makeString("Return the support for which DEDUCTION is a deduction.");

    private static final SubLList $list50 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));

    private static final SubLList $list51 = list(makeSymbol("SUPPORT-P"));

    private static final SubLSymbol DEDUCTION_SUPPORTED_OBJECT = makeSymbol("DEDUCTION-SUPPORTED-OBJECT");



    private static final SubLSymbol DEDUCTION_TRUTH = makeSymbol("DEDUCTION-TRUTH");

    private static final SubLString $str55$Return_the_truth_of_DEDUCTION____ = makeString("Return the truth of DEDUCTION -- either :true :false or :unknown.");

    private static final SubLList $list56 = list(makeSymbol("TRUTH-P"));

    private static final SubLSymbol DEDUCTION_STRENGTH = makeSymbol("DEDUCTION-STRENGTH");

    private static final SubLString $str58$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown.");

    private static final SubLList $list59 = list(makeSymbol("EL-STRENGTH-P"));

    private static final SubLList $list60 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));

    private static final SubLList $list61 = list(list(makeSymbol("*DEDUCTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-DEDUCTION-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("DEDUCTION-DUMP-ID"))));



    public static SubLObject do_deduction_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = NIL;
        SubLObject deduction = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        support = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        deduction = current.first();
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
        return listS(DO_LIST, list(support, list(DEDUCTION_SUPPORTS, deduction), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_deductions_backwards(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        deduction_var = current.first();
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
            if (NIL == member(current_$2, $list7, UNPROVIDED, UNPROVIDED)) {
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
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = $sym9$PROGRESS_MESSAGE_VAR;
            return list(CLET, list(list(progress_message_var, progress_message)), listS(DO_DEDUCTIONS_BACKWARDS, list(deduction_var, $PROGRESS_MESSAGE, progress_message_var, $DONE, done), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject sofar_var = $sym12$SOFAR_VAR;
            final SubLObject total_var = $sym13$TOTAL_VAR;
            return list(CLET, list(bq_cons(total_var, $list14), bq_cons(sofar_var, $list15)), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_DEDUCTIONS_BACKWARDS, list(deduction_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar_var, total_var), list(CINC, sofar_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym19$ID_VAR;
        return list(DO_NUMBERS, list(new SubLObject[]{ id_var, $START, $list22, $END, MINUS_ONE_INTEGER, $DELTA, MINUS_ONE_INTEGER, $DONE, done }), list(CLET, list(list(deduction_var, list(FIND_DEDUCTION_BY_ID, id_var))), listS(PWHEN, deduction_var, append(body, NIL))));
    }

    public static SubLObject do_recent_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list27);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list27);
            if (NIL == member(current_$3, $list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list27);
        }
        final SubLObject num_tail = property_list_member($NUM, current);
        final SubLObject num = (NIL != num_tail) ? cadr(num_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_deductions_for_sweep;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PIF, list(POSITIVE_INTEGER_P, num), listS(PROGRESS_CSOME, list(var, list(DEDUCTIONS_AROUND, $list22, num, num), progress_message, done), append(body, NIL)), listS(DO_DEDUCTIONS, list(var, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject deduction_spec_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && ($DEDUCTION == v_object.first())) && (NIL != arguments.non_empty_hl_justification_p(second(v_object)))) && ((NIL == third(v_object)) || (NIL != bindings.bindings_p(third(v_object)))));
    }

    public static SubLObject create_deduction_spec(final SubLObject supports, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        assert NIL != arguments.hl_justification_p(supports) : "arguments.hl_justification_p(supports) " + "CommonSymbols.NIL != arguments.hl_justification_p(supports) " + supports;
        assert NIL != bindings.bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        assert NIL != listp(pragmatic_support_mts) : "Types.listp(pragmatic_support_mts) " + "CommonSymbols.NIL != Types.listp(pragmatic_support_mts) " + pragmatic_support_mts;
        final SubLObject canon_supports = arguments.canonicalize_supports(supports, T);
        return list($DEDUCTION, canon_supports, v_bindings, pragmatic_support_mts);
    }

    public static SubLObject deduction_to_deduction_spec(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        final SubLObject supports = deduction_supports(deduction);
        final SubLObject v_bindings = deduction_bindings(deduction);
        final SubLObject pragmatic_support_mts = deduction_pragmatic_support_mts(deduction);
        final SubLObject deduction_spec = create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
        return deduction_spec;
    }

    public static SubLObject deduction_spec_supports(final SubLObject deduction_spec) {
        return nth(ONE_INTEGER, deduction_spec);
    }

    public static SubLObject deduction_spec_bindings(final SubLObject deduction_spec) {
        return nth(TWO_INTEGER, deduction_spec);
    }

    public static SubLObject deduction_spec_pragmatic_support_mts(final SubLObject deduction_spec) {
        return nth(THREE_INTEGER, deduction_spec);
    }

    public static SubLObject create_deduction_with_tv(final SubLObject assertion, final SubLObject supports, final SubLObject tv, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject deduction = create_deduction(assertion, supports, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), v_bindings, pragmatic_support_mts);
        return deduction;
    }

    public static SubLObject create_deduction_for_hl_support(final SubLObject hl_support, final SubLObject justification) {
        final SubLObject tv = arguments.hl_support_tv(hl_support);
        final SubLObject deduction = create_deduction_with_tv(hl_support, justification, tv, UNPROVIDED, UNPROVIDED);
        return deduction;
    }

    public static SubLObject create_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        return deductions_interface.kb_create_deduction(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
    }

    public static SubLObject remove_deduction(final SubLObject deduction) {
        return deductions_interface.kb_remove_deduction(deduction);
    }

    public static SubLObject set_deduction_strength(final SubLObject deduction, final SubLObject new_strength) {
        return deductions_interface.kb_set_deduction_strength(deduction, new_strength);
    }

    public static SubLObject find_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        return deductions_interface.kb_lookup_deduction(supported_object, supports, truth);
    }

    public static SubLObject random_deduction(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (deduction_handles.deduction_count().numG(ZERO_INTEGER)) {
            final SubLObject max_id = deduction_handles.next_deduction_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
                candidate = deduction_handles.find_deduction_by_id(random.random(max_id));
                if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                }
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject sample_deductions(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
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
                result = cons(random_deduction(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_deduction(test), result, symbol_function(EQL))) {
        }
        return set_contents.set_contents_element_list(result);
    }

    public static SubLObject deduction_supports_equal(final SubLObject supports1, final SubLObject supports2) {
        return makeBoolean(length(supports1).numE(length(supports2)) && (NIL != list_utilities.sets_equalP(supports1, supports2, SUPPORT_EQUAL)));
    }

    public static SubLObject deduction_equal(final SubLObject deduction1, final SubLObject deduction2) {
        return makeBoolean((deduction_supported_object(deduction1).equal(deduction_supported_object(deduction2)) && arguments.argument_truth(deduction1).eql(arguments.argument_truth(deduction2))) && (NIL != deduction_supports_equal(deduction_supports(deduction1), deduction_supports(deduction2))));
    }

    public static SubLObject invalid_deduction(final SubLObject deduction, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != deduction_handles.deduction_p(deduction)) && (NIL == deduction_handles.valid_deduction(deduction, robust)));
    }

    public static SubLObject forward_deductionP(final SubLObject deduction) {
        return forward_deduction_intP(deduction, T);
    }

    public static SubLObject forward_not_code_deductionP(final SubLObject deduction) {
        return forward_deduction_intP(deduction, NIL);
    }

    public static SubLObject forward_deduction_intP(final SubLObject deduction, final SubLObject include_code_assertionsP) {
        if (NIL != deduction_handles.deduction_p(deduction)) {
            SubLObject shyP;
            SubLObject rest;
            SubLObject support;
            for (shyP = NIL, rest = NIL, rest = deduction_supports(deduction); (NIL == shyP) && (NIL != rest); shyP = makeBoolean((((NIL == assertions_high.forward_assertionP(support)) && ((NIL == include_code_assertionsP) || (NIL == assertions_high.code_assertionP(support)))) && (NIL == kb_hl_support_handles.kb_hl_support_p(support))) && (NIL == arguments.hl_support_p(support))) , rest = rest.rest()) {
                support = rest.first();
            }
            return makeBoolean(NIL == shyP);
        }
        return NIL;
    }

    public static SubLObject lifting_deduction_p(final SubLObject deduction) {
        if (NIL != deduction_handles.deduction_p(deduction)) {
            if (NIL != kb_accessors.decontextualized_assertionP(deduction_supported_object(deduction))) {
                return T;
            }
            SubLObject cdolist_list_var = deduction_supports(deduction);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.lifting_assertion_p(support)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject skolem_deduction_p(final SubLObject deduction) {
        return assertion_utilities.gaf_assertion_with_pred_p(deduction_supported_object(deduction), $$skolem);
    }

    public static SubLObject deduction_assertion(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? deductions_interface.kb_deduction_supported_object(deduction) : NIL;
    }

    public static SubLObject deduction_supported_object(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? deductions_interface.kb_deduction_supported_object(deduction) : NIL;
    }

    public static SubLObject deduction_truth(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL == deduction_handles.deduction_handle_validP(deduction)) {
            return $UNKNOWN;
        }
        return deductions_interface.kb_deduction_truth(deduction);
    }

    public static SubLObject deduction_strength(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? deductions_interface.kb_deduction_strength(deduction) : NIL;
    }

    public static SubLObject deduction_supports(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? kb_hl_supports_high.possibly_unreify_kb_hl_supports(deductions_interface.kb_deduction_supports(deduction)) : NIL;
    }

    public static SubLObject deduction_bindings(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? deductions_interface.kb_deduction_bindings(deduction) : NIL;
    }

    public static SubLObject deduction_pragmatic_support_mts(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return NIL != deduction_handles.deduction_handle_validP(deduction) ? deductions_interface.kb_deduction_pragmatic_support_mts(deduction) : NIL;
    }

    public static SubLObject deduction_mt(final SubLObject deduction) {
        final SubLObject supported_object = deduction_supported_object(deduction);
        return arguments.support_mt(supported_object);
    }

    public static SubLObject deduction_id_from_recipe(final SubLObject assertion, final SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLObject deduction = find_deduction(assertion, supports, truth);
        return NIL != deduction_handles.deduction_p(deduction) ? deduction_handles.deduction_id(deduction) : NIL;
    }

    public static SubLObject deduction_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_deduction_checkpoint() {
        final SubLObject deduction_count = deduction_handles.deduction_count();
        final SubLObject next_deduction_id = deduction_handles.next_deduction_id();
        return list(deduction_count, next_deduction_id);
    }

    public static SubLObject deduction_checkpoint_currentP(final SubLObject deduction_checkpoint) {
        SubLObject checkpoint_count = NIL;
        SubLObject checkpoint_next_id = NIL;
        destructuring_bind_must_consp(deduction_checkpoint, deduction_checkpoint, $list60);
        checkpoint_count = deduction_checkpoint.first();
        SubLObject current = deduction_checkpoint.rest();
        destructuring_bind_must_consp(current, deduction_checkpoint, $list60);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(checkpoint_count.numE(deduction_handles.deduction_count()) && checkpoint_next_id.numE(deduction_handles.next_deduction_id()));
        }
        cdestructuring_bind_error(deduction_checkpoint, $list60);
        return NIL;
    }

    public static SubLObject deduction_dump_id(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject dump_table = $deduction_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static SubLObject find_deduction_by_dump_id(final SubLObject dump_id) {
        return deduction_handles.find_deduction_by_id(dump_id);
    }

    public static SubLObject with_deduction_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list61, append(body, NIL));
    }

    public static SubLObject deductions_around_deduction(final SubLObject deduction, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return deductions_around(deduction_handles.deduction_id(deduction), total, before, after);
    }

    public static SubLObject deductions_around(final SubLObject deduction_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != subl_promotions.non_negative_integer_p(deduction_id) : "subl_promotions.non_negative_integer_p(deduction_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(deduction_id) " + deduction_id;
        return assertions_high.kb_objects_around_id(FIND_DEDUCTION_BY_ID, ZERO_INTEGER, deduction_id, deduction_handles.next_deduction_id(), total, before, after);
    }

    public static SubLObject declare_deductions_high_file() {
        declareMacro(me, "do_deduction_supports", "DO-DEDUCTION-SUPPORTS");
        declareMacro(me, "do_deductions_backwards", "DO-DEDUCTIONS-BACKWARDS");
        declareMacro(me, "do_recent_deductions", "DO-RECENT-DEDUCTIONS");
        declareFunction(me, "deduction_spec_p", "DEDUCTION-SPEC-P", 1, 0, false);
        declareFunction(me, "create_deduction_spec", "CREATE-DEDUCTION-SPEC", 1, 2, false);
        declareFunction(me, "deduction_to_deduction_spec", "DEDUCTION-TO-DEDUCTION-SPEC", 1, 0, false);
        declareFunction(me, "deduction_spec_supports", "DEDUCTION-SPEC-SUPPORTS", 1, 0, false);
        declareFunction(me, "deduction_spec_bindings", "DEDUCTION-SPEC-BINDINGS", 1, 0, false);
        declareFunction(me, "deduction_spec_pragmatic_support_mts", "DEDUCTION-SPEC-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        declareFunction(me, "create_deduction_with_tv", "CREATE-DEDUCTION-WITH-TV", 3, 2, false);
        declareFunction(me, "create_deduction_for_hl_support", "CREATE-DEDUCTION-FOR-HL-SUPPORT", 2, 0, false);
        declareFunction(me, "create_deduction", "CREATE-DEDUCTION", 4, 2, false);
        declareFunction(me, "remove_deduction", "REMOVE-DEDUCTION", 1, 0, false);
        declareFunction(me, "set_deduction_strength", "SET-DEDUCTION-STRENGTH", 2, 0, false);
        declareFunction(me, "find_deduction", "FIND-DEDUCTION", 2, 1, false);
        declareFunction(me, "random_deduction", "RANDOM-DEDUCTION", 0, 1, false);
        declareFunction(me, "sample_deductions", "SAMPLE-DEDUCTIONS", 0, 3, false);
        declareFunction(me, "deduction_supports_equal", "DEDUCTION-SUPPORTS-EQUAL", 2, 0, false);
        declareFunction(me, "deduction_equal", "DEDUCTION-EQUAL", 2, 0, false);
        declareFunction(me, "invalid_deduction", "INVALID-DEDUCTION", 1, 1, false);
        declareFunction(me, "forward_deductionP", "FORWARD-DEDUCTION?", 1, 0, false);
        declareFunction(me, "forward_not_code_deductionP", "FORWARD-NOT-CODE-DEDUCTION?", 1, 0, false);
        declareFunction(me, "forward_deduction_intP", "FORWARD-DEDUCTION-INT?", 2, 0, false);
        declareFunction(me, "lifting_deduction_p", "LIFTING-DEDUCTION-P", 1, 0, false);
        declareFunction(me, "skolem_deduction_p", "SKOLEM-DEDUCTION-P", 1, 0, false);
        declareFunction(me, "deduction_assertion", "DEDUCTION-ASSERTION", 1, 0, false);
        declareFunction(me, "deduction_supported_object", "DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(me, "deduction_truth", "DEDUCTION-TRUTH", 1, 0, false);
        declareFunction(me, "deduction_strength", "DEDUCTION-STRENGTH", 1, 0, false);
        declareFunction(me, "deduction_supports", "DEDUCTION-SUPPORTS", 1, 0, false);
        declareFunction(me, "deduction_bindings", "DEDUCTION-BINDINGS", 1, 0, false);
        declareFunction(me, "deduction_pragmatic_support_mts", "DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        declareFunction(me, "deduction_mt", "DEDUCTION-MT", 1, 0, false);
        declareFunction(me, "deduction_id_from_recipe", "DEDUCTION-ID-FROM-RECIPE", 2, 1, false);
        declareFunction(me, "deduction_checkpoint_p", "DEDUCTION-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_deduction_checkpoint", "NEW-DEDUCTION-CHECKPOINT", 0, 0, false);
        declareFunction(me, "deduction_checkpoint_currentP", "DEDUCTION-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "deduction_dump_id", "DEDUCTION-DUMP-ID", 1, 0, false);
        declareFunction(me, "find_deduction_by_dump_id", "FIND-DEDUCTION-BY-DUMP-ID", 1, 0, false);
        declareMacro(me, "with_deduction_dump_id_table", "WITH-DEDUCTION-DUMP-ID-TABLE");
        declareFunction(me, "deductions_around_deduction", "DEDUCTIONS-AROUND-DEDUCTION", 1, 3, false);
        declareFunction(me, "deductions_around", "DEDUCTIONS-AROUND", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_deductions_high_file() {
        defparameter("*DEDUCTION-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_deductions_high_file() {
        register_obsolete_cyc_api_function(DEDUCTION_ASSERTION, NIL, $list48, $str49$Return_the_support_for_which_DEDU, $list50, $list51);
        register_cyc_api_function(DEDUCTION_SUPPORTED_OBJECT, $list48, $str49$Return_the_support_for_which_DEDU, $list50, $list51);
        register_cyc_api_function(DEDUCTION_TRUTH, $list48, $str55$Return_the_truth_of_DEDUCTION____, $list50, $list56);
        register_cyc_api_function(DEDUCTION_STRENGTH, $list48, $str58$Return_the_current_argumentation_, $list50, $list59);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deductions_high_file();
    }

    @Override
    public void initializeVariables() {
        init_deductions_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deductions_high_file();
    }

    
}

/**
 * Total time: 223 ms
 */
