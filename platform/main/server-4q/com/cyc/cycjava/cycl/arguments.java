package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.el_utilities.elf_to_list;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class arguments extends SubLTranslatedFile {
    public static final SubLFile me = new arguments();

    public static final String myName = "com.cyc.cycjava.cycl.arguments";

    public static final String myFingerPrint = "358519124b8b7472f3bc2bf9e4dbd194c5369a554e1a35e6656b0b08d75a0974";

    // deflexical
    private static final SubLSymbol $argument_types$ = makeSymbol("*ARGUMENT-TYPES*");

    // deflexical
    /**
     * A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls). hard-codes
     * the type hierarchy: ARGUMENT / BELIEF DEDUCTION / ASSERTED-ARGUMENT
     */
    private static final SubLSymbol $argument_type_hierarchy$ = makeSymbol("*ARGUMENT-TYPE-HIERARCHY*");

    // deflexical
    // Asserted argument -> HL TV mapping
    private static final SubLSymbol $asserted_argument_tv_table$ = makeSymbol("*ASSERTED-ARGUMENT-TV-TABLE*");

    // deflexical
    // Tokens representing the possible asserted arguments
    private static final SubLSymbol $asserted_arguments$ = makeSymbol("*ASSERTED-ARGUMENTS*");

    // deflexical
    // The module which denotes that an assertion is the support.
    public static final SubLSymbol $assertion_support_module$ = makeSymbol("*ASSERTION-SUPPORT-MODULE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_arguments = makeString("mapping Cyc arguments");

    public static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");



    public static final SubLSymbol ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");

    public static final SubLList $list5 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc belief arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_belief_arguments = makeString("mapping Cyc belief arguments");

    public static final SubLSymbol DO_ARGUMENTS = makeSymbol("DO-ARGUMENTS");



    public static final SubLSymbol BELIEF_P = makeSymbol("BELIEF-P");

    public static final SubLList $list10 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc asserted arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_asserted_arguments = makeString("mapping Cyc asserted arguments");





    public static final SubLList $list14 = list(makeSymbol("OBJECT"));

    public static final SubLString $str15$Return_T_iff_OBJECT_is_an_HL_argu = makeString("Return T iff OBJECT is an HL argument structure.");

    public static final SubLList $list16 = list(makeSymbol("BOOLEANP"));

    public static final SubLString $$$unexpected_argument_type = makeString("unexpected argument type");

    public static final SubLList $list18 = list(makeKeyword("ARGUMENT"), makeKeyword("BELIEF"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("DEDUCTION"));

    public static final SubLList $list19 = list(list(makeKeyword("ARGUMENT"), NIL), list(makeKeyword("BELIEF"), list(makeKeyword("ARGUMENT"))), list(makeKeyword("ASSERTED-ARGUMENT"), list(makeKeyword("BELIEF"))), list(makeKeyword("DEDUCTION"), list(makeKeyword("ARGUMENT"))));

    public static final SubLSymbol ARGUMENT_TYPE_PROPER_GENLS = makeSymbol("ARGUMENT-TYPE-PROPER-GENLS");

    public static final SubLSymbol ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");

    public static final SubLList $list22 = list(makeSymbol("ARGUMENT1"), makeSymbol("ARGUMENT2"));

    public static final SubLString $str23$Return_T_iff_ARGUMENT1_and_ARGUME = makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent ");

    public static final SubLSymbol ARGUMENT_TRUTH = makeSymbol("ARGUMENT-TRUTH");

    public static final SubLList $list25 = list(makeSymbol("ARGUMENT"));

    public static final SubLString $str26$Return_the_truth_of_ARGUMENT_ = makeString("Return the truth of ARGUMENT.");

    public static final SubLList $list27 = list(list(makeSymbol("ARGUMENT"), makeSymbol("ARGUMENT-P")));

    public static final SubLList $list28 = list(makeSymbol("TRUTH-P"));

    public static final SubLSymbol ARGUMENT_STRENGTH = makeSymbol("ARGUMENT-STRENGTH");

    public static final SubLString $str30$Return_the_strength_of_ARGUMENT_ = makeString("Return the strength of ARGUMENT.");

    public static final SubLList $list31 = list(makeSymbol("EL-STRENGTH-P"));

    public static final SubLString $$$unexpected_belief_type = makeString("unexpected belief type");

    public static final SubLString $str33$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL asserted argument structure.");



    public static final SubLSymbol EL_STRENGTH_SPEC_P = makeSymbol("EL-STRENGTH-SPEC-P");

    public static final SubLList $list36 = list(list(makeKeyword("ASSERTED-TRUE-MON"), makeKeyword("TRUE-MON")), list(makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("TRUE-DEF")), list(makeKeyword("ASSERTED-UNKNOWN"), makeKeyword("UNKNOWN")), list(makeKeyword("ASSERTED-FALSE-DEF"), makeKeyword("FALSE-DEF")), list(makeKeyword("ASSERTED-FALSE-MON"), makeKeyword("FALSE-MON")));



    public static final SubLSymbol TV_P = makeSymbol("TV-P");



    public static final SubLList $list40 = list(makeKeyword("LOCAL"));



    private static final SubLString $str42$Return_T_iff_OBJECT_can_be_a_supp = makeString("Return T iff OBJECT can be a support in an argument.");



    private static final SubLSymbol $SYNTACTICALLY_ILL_FORMED = makeKeyword("SYNTACTICALLY-ILL-FORMED");

    private static final SubLSymbol $sym45$SUPPORT__ = makeSymbol("SUPPORT-<");



    private static final SubLSymbol SUPPORT_MODULE = makeSymbol("SUPPORT-MODULE");

    public static final SubLList $list48 = list(makeSymbol("SUPPORT"));

    private static final SubLString $str49$Return_the_module_of_SUPPORT_ = makeString("Return the module of SUPPORT.");

    private static final SubLList $list50 = list(list(makeSymbol("SUPPORT"), makeSymbol("SUPPORT-P")));

    private static final SubLList $list51 = list(makeSymbol("HL-SUPPORT-MODULE-P"));



    private static final SubLString $str53$Return_the_sentence_of_SUPPORT_ = makeString("Return the sentence of SUPPORT.");

    private static final SubLList $list54 = list(makeSymbol("CONSP"));

    private static final SubLSymbol SUPPORT_FORMULA = makeSymbol("SUPPORT-FORMULA");

    private static final SubLList $list56 = list(makeSymbol("SUPPORT-SENTENCE"));



    private static final SubLString $str58$Return_the_microtheory_of_SUPPORT = makeString("Return the microtheory of SUPPORT.");

    public static final SubLList $list59 = list(makeSymbol("HLMT-P"));

    private static final SubLSymbol SUPPORT_TRUTH = makeSymbol("SUPPORT-TRUTH");

    private static final SubLString $str61$Return_the_truth_of_SUPPORT_ = makeString("Return the truth of SUPPORT.");

    private static final SubLSymbol SUPPORT_STRENGTH = makeSymbol("SUPPORT-STRENGTH");

    private static final SubLString $str63$Return_the_strength_of_SUPPORT_ = makeString("Return the strength of SUPPORT.");



    private static final SubLString $str65$Does_OBJECT_represent_an_HL_suppo = makeString("Does OBJECT represent an HL support?");



    private static final SubLSymbol HL_SUPPORT_MODULE_P = makeSymbol("HL-SUPPORT-MODULE-P");

    private static final SubLSymbol POSSIBLY_CYCL_SENTENCE_P = makeSymbol("POSSIBLY-CYCL-SENTENCE-P");



    private static final SubLSymbol MAKE_HL_SUPPORT = makeSymbol("MAKE-HL-SUPPORT");

    private static final SubLList $list71 = list(makeSymbol("HL-MODULE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")));

    private static final SubLString $str72$Construct_a_new_HL_support_ = makeString("Construct a new HL support.");

    private static final SubLList $list73 = list(list(makeSymbol("HL-MODULE"), makeSymbol("HL-SUPPORT-MODULE-P")), list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-CYCL-SENTENCE-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("TV"), makeSymbol("TV-P")));

    private static final SubLList $list74 = list(makeSymbol("HL-SUPPORT-P"));



    private static final SubLSymbol $sym76$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");



    private static final SubLList $list78 = list(makeSymbol("HL-MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));



    private static final SubLSymbol SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");

    private static final SubLSymbol KB_LOOKUP_ASSERTED_ARGUMENT = makeSymbol("KB-LOOKUP-ASSERTED-ARGUMENT");

    public static SubLObject do_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject argument = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$mapping_Cyc_arguments;
        destructuring_bind_must_listp(current, datum, $list0);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_ASSERTIONS, list(assertion, message), listS(CDOLIST, list(argument, list(ASSERTION_ARGUMENTS, assertion)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject do_beliefs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject argument = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$mapping_Cyc_belief_arguments;
        destructuring_bind_must_listp(current, datum, $list5);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_ARGUMENTS, list(assertion, argument, message), listS(PWHEN, list(BELIEF_P, argument), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject do_asserted_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject argument = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$mapping_Cyc_asserted_arguments;
        destructuring_bind_must_listp(current, datum, $list10);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_ARGUMENTS, list(assertion, argument, message), listS(PWHEN, list(ASSERTED_ARGUMENT_P, argument), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject argument_p(final SubLObject v_object) {
        return makeBoolean((NIL != belief_p(v_object)) || (NIL != deduction_handles.deduction_p(v_object)));
    }

    public static SubLObject valid_argument(final SubLObject argument, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL != belief_p(argument)) {
            return T;
        }
        if (NIL != deduction_handles.deduction_p(argument)) {
            return deduction_handles.valid_deduction(argument, robust);
        }
        return NIL;
    }

    public static SubLObject argument_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != belief_spec_p(v_object)) || (NIL != deductions_high.deduction_spec_p(v_object)));
    }

    public static SubLObject argument_to_argument_spec(final SubLObject argument) {
        assert NIL != argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != belief_p(argument)) {
            return belief_to_belief_spec(argument);
        }
        if (NIL != deduction_handles.deduction_p(argument)) {
            return deductions_high.deduction_to_deduction_spec(argument);
        }
        Errors.error($$$unexpected_argument_type);
        return NIL;
    }

    public static SubLObject argument_spec_type(final SubLObject argument_spec) {
        return argument_spec.first();
    }

    public static SubLObject argument_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $argument_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject argument_type_hierarchy() {
        return $argument_type_hierarchy$.getGlobalValue();
    }

    public static SubLObject argument_type_proper_genls(final SubLObject argument_type) {
        final SubLObject pair = assoc(argument_type, argument_type_hierarchy(), UNPROVIDED, UNPROVIDED);
        if (NIL == pair) {
            return NIL;
        }
        final SubLObject immediate_proper_genls = copy_list(second(pair));
        final SubLObject recursive_proper_genls = Mapping.mapcan(ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, EMPTY_SUBL_OBJECT_ARRAY);
        return append(immediate_proper_genls, recursive_proper_genls);
    }

    public static SubLObject argument_type_genls(final SubLObject argument_type) {
        return cons(argument_type, argument_type_proper_genls(argument_type));
    }

    public static SubLObject argument_equal(final SubLObject argument1, final SubLObject argument2) {
        return makeBoolean(((NIL != argument_p(argument1)) && (NIL != argument_p(argument2))) && (argument1.eql(argument2) || (NIL != (NIL != belief_p(argument1) ? makeBoolean((NIL != belief_p(argument2)) && (NIL != belief_equal(argument1, argument2))) : makeBoolean((NIL != deduction_handles.deduction_p(argument2)) && (NIL != deductions_high.deduction_equal(argument1, argument2)))))));
    }

    public static SubLObject argument_truth(final SubLObject argument) {
        SubLTrampolineFile.enforceType(argument, ARGUMENT_P);
        if (NIL != belief_p(argument)) {
            return belief_truth(argument);
        }
        return deductions_high.deduction_truth(argument);
    }

    public static SubLObject argument_tv(final SubLObject argument) {
        assert NIL != argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != belief_p(argument)) {
            return belief_tv(argument);
        }
        final SubLObject truth = deductions_high.deduction_truth(argument);
        final SubLObject strength = deductions_high.deduction_strength(argument);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }

    public static SubLObject argument_strength(final SubLObject argument) {
        SubLTrampolineFile.enforceType(argument, ARGUMENT_P);
        if (NIL != belief_p(argument)) {
            return belief_strength(argument);
        }
        return deductions_high.deduction_strength(argument);
    }

    public static SubLObject remove_argument(final SubLObject argument, final SubLObject support) {
        if (NIL != belief_p(argument)) {
            return remove_belief(argument, support);
        }
        return deductions_interface.kb_remove_deduction(argument);
    }

    public static SubLObject belief_p(final SubLObject v_object) {
        return asserted_argument_p(v_object);
    }

    public static SubLObject belief_spec_p(final SubLObject v_object) {
        return asserted_argument_spec_p(v_object);
    }

    public static SubLObject belief_to_belief_spec(final SubLObject belief) {
        assert NIL != belief_p(belief) : "arguments.belief_p(belief) " + "CommonSymbols.NIL != arguments.belief_p(belief) " + belief;
        if (NIL != asserted_argument_p(belief)) {
            return asserted_argument_to_asserted_argument_spec(belief);
        }
        Errors.error($$$unexpected_belief_type);
        return NIL;
    }

    public static SubLObject remove_belief(final SubLObject belief, final SubLObject assertion) {
        return assertions_interface.kb_remove_asserted_argument(assertion, belief);
    }

    public static SubLObject belief_equal(final SubLObject belief1, final SubLObject belief2) {
        return asserted_argument_equal(belief1, belief2);
    }

    public static SubLObject belief_truth(final SubLObject belief) {
        return asserted_argument_truth(belief);
    }

    public static SubLObject belief_strength(final SubLObject belief) {
        return asserted_argument_strength(belief);
    }

    public static SubLObject belief_tv(final SubLObject belief) {
        return asserted_argument_tv(belief);
    }

    public static SubLObject asserted_argument_p(final SubLObject v_object) {
        return asserted_argument_token_p(v_object);
    }

    public static SubLObject asserted_argument_spec_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && ($ASSERTED_ARGUMENT == v_object.first())) && (NIL != enumeration_types.el_strength_spec_p(second(v_object))));
    }

    public static SubLObject asserted_argument_to_asserted_argument_spec(final SubLObject asserted_argument) {
        final SubLObject strength = asserted_argument_strength(asserted_argument);
        final SubLObject argument_spec = create_asserted_argument_spec(strength);
        return argument_spec;
    }

    public static SubLObject create_asserted_argument(final SubLObject assertion, final SubLObject tv) {
        return asserted_argument_token_from_tv(tv);
    }

    public static SubLObject create_asserted_argument_spec(final SubLObject strength_spec) {
        assert NIL != enumeration_types.el_strength_spec_p(strength_spec) : "enumeration_types.el_strength_spec_p(strength_spec) " + "CommonSymbols.NIL != enumeration_types.el_strength_spec_p(strength_spec) " + strength_spec;
        return list($ASSERTED_ARGUMENT, strength_spec);
    }

    public static SubLObject asserted_argument_spec_strength_spec(final SubLObject asserted_argument_spec) {
        return second(asserted_argument_spec);
    }

    public static SubLObject kb_remove_asserted_argument_internal(final SubLObject asserted_argument) {
        return NIL;
    }

    public static SubLObject asserted_argument_tokens() {
        return $asserted_arguments$.getGlobalValue();
    }

    public static SubLObject asserted_argument_token_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $asserted_arguments$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject asserted_argument_token_from_tv(final SubLObject tv) {
        assert NIL != enumeration_types.tv_p(tv) : "enumeration_types.tv_p(tv) " + "CommonSymbols.NIL != enumeration_types.tv_p(tv) " + tv;
        return find(tv, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(SECOND), UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject tv_from_asserted_argument_token(final SubLObject asserted_argument) {
        return second(find(asserted_argument, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject make_empty_local_support_set() {
        return $list40;
    }

    public static SubLObject asserted_argument_equal(final SubLObject asserted_argument1, final SubLObject asserted_argument2) {
        return eq(asserted_argument1, asserted_argument2);
    }

    public static SubLObject asserted_argument_tv(final SubLObject asserted_argument) {
        if (NIL != asserted_argument_token_p(asserted_argument)) {
            return tv_from_asserted_argument_token(asserted_argument);
        }
        return NIL;
    }

    public static SubLObject asserted_argument_strength(final SubLObject asserted_argument) {
        return enumeration_types.tv_strength(asserted_argument_tv(asserted_argument));
    }

    public static SubLObject asserted_argument_truth(final SubLObject asserted_argument) {
        return enumeration_types.tv_truth(asserted_argument_tv(asserted_argument));
    }

    public static SubLObject list_of_cycl_support_p(final SubLObject v_object) {
        if (NIL == list_utilities.proper_list_p(v_object)) {
            return NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_support_p(support)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject cycl_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || ((((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first()))) && (NIL != possibly_sentence_p(second(v_object)))) && (NIL != hlmt.hlmt_p(third(v_object)))) && (NIL != enumeration_types.el_strength_p(fourth(v_object)))));
    }

    public static SubLObject support_p(final SubLObject v_object) {
        return makeBoolean((NIL != reified_support_p(v_object)) || (NIL != hl_support_p(v_object)));
    }

    public static SubLObject reified_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || (NIL != kb_hl_support_handles.kb_hl_support_p(v_object)));
    }

    public static SubLObject supports_p(final SubLObject v_object) {
        return support_list_p(v_object);
    }

    public static SubLObject support_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(SUPPORT_P, v_object, UNPROVIDED)));
    }

    public static SubLObject valid_supportP(final SubLObject support, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertion_handles.valid_assertionP(support, UNPROVIDED);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_handles.valid_kb_hl_supportP(support, robust);
        }
        if (NIL != hl_support_p(support)) {
            return valid_hl_supportP(support);
        }
        return NIL;
    }

    public static SubLObject ill_formed_hl_supportP(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertion_syntactically_illformedP(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_syntactically_illformedP(support);
        }
        if (NIL != hl_support_p(support)) {
            return hl_support_syntactically_illformedP(support);
        }
        return NIL;
    }

    public static SubLObject hl_support_syntactically_illformedP(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == wff.el_wff_syntaxP(hl_support_sentence(hl_support), UNPROVIDED)) {
                        brokenness = $SYNTACTICALLY_ILL_FORMED;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }

    public static SubLObject kb_hl_support_syntactically_illformedP(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == wff.el_wff_syntaxP(kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support), UNPROVIDED)) {
                        brokenness = $SYNTACTICALLY_ILL_FORMED;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }

    public static SubLObject assertion_syntactically_illformedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == wff.el_wff_syntaxP(fi.assertion_hl_formula(assertion, UNPROVIDED), UNPROVIDED)) {
                        brokenness = $SYNTACTICALLY_ILL_FORMED;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }

    public static SubLObject support_equal(final SubLObject support1, final SubLObject support2) {
        if ((NIL != assertion_handles.assertion_p(support1)) || (NIL != assertion_handles.assertion_p(support2))) {
            return eql(support1, support2);
        }
        if ((NIL != kb_hl_support_handles.kb_hl_support_p(support1)) || (NIL != kb_hl_support_handles.kb_hl_support_p(support2))) {
            return eql(support1, support2);
        }
        return equal(support1, support2);
    }

    public static SubLObject support_L(final SubLObject support1, final SubLObject support2) {
        if (NIL != assertion_handles.assertion_p(support1)) {
            if (NIL == assertion_handles.assertion_p(support2)) {
                return T;
            }
            if (NIL != assertions_high.rule_assertionP(support1)) {
                if (NIL != assertions_high.rule_assertionP(support2)) {
                    return numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
                }
                return T;
            } else {
                if (NIL != assertions_high.rule_assertionP(support2)) {
                    return NIL;
                }
                return numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
            }
        } else
            if (NIL != kb_hl_support_handles.kb_hl_support_p(support1)) {
                if (NIL != assertion_handles.assertion_p(support2)) {
                    return NIL;
                }
                if (NIL != kb_hl_support_handles.kb_hl_support_p(support2)) {
                    return numL(kb_hl_support_handles.kb_hl_support_id(support1), kb_hl_support_handles.kb_hl_support_id(support2));
                }
                return T;
            } else {
                if (NIL != assertion_handles.assertion_p(support2)) {
                    return NIL;
                }
                if (NIL != kb_hl_support_handles.kb_hl_support_p(support2)) {
                    return NIL;
                }
                return kb_utilities.term_L(support1, support2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

    }

    public static SubLObject sort_supports(final SubLObject supports) {
        return Sort.sort(supports, symbol_function($sym45$SUPPORT__), UNPROVIDED);
    }

    public static SubLObject support_module(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return $assertion_support_module$.getGlobalValue();
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_module(support);
        }
        return hl_support_module(support);
    }

    public static SubLObject support_sentence(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_sentence(support);
        }
        return hl_support_sentence(support);
    }

    public static SubLObject support_sentence_operator(final SubLObject support) {
        return cycl_utilities.formula_operator(support_sentence(support));
    }

    public static SubLObject support_formula(final SubLObject support) {
        return support_sentence(support);
    }

    public static SubLObject support_el_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_sentence(support);
        }
        return cycl_utilities.hl_to_el(hl_support_sentence(support));
    }

    public static SubLObject support_ist_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_ist_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_ist_sentence(support);
        }
        return make_ist_sentence(hl_support_mt(support), hl_support_sentence(support));
    }

    public static SubLObject support_el_ist_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_ist_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_ist_sentence(support);
        }
        return make_ist_sentence(support_elmt(support), support_el_sentence(support));
    }

    public static SubLObject support_cons(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cons(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_cons(support);
        }
        return elf_to_list(hl_support_sentence(support));
    }

    public static SubLObject support_mt(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_mt(support);
        }
        return hl_support_mt(support);
    }

    public static SubLObject support_elmt(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_elmt(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_elmt(support);
        }
        return cycl_utilities.hl_to_el(hl_support_mt(support));
    }

    public static SubLObject support_justification(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_justification(support);
        }
        return hl_supports.hl_support_justify(support);
    }

    public static SubLObject support_truth(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        return enumeration_types.tv_truth(support_tv(support));
    }

    public static SubLObject support_strength(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        return enumeration_types.tv_strength(support_tv(support));
    }

    public static SubLObject support_tv(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.cyc_assertion_tv(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_tv(support);
        }
        return hl_support_tv(support);
    }

    public static SubLObject hl_support_from_support(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return hl_support_from_assertion(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_hl_support(support);
        }
        return support;
    }

    public static SubLObject contextualize_support(final SubLObject support, final SubLObject new_mt) {
        return contextualize_hl_support(hl_support_from_support(support), new_mt);
    }

    public static SubLObject canonicalize_supports(final SubLObject supports, SubLObject possibly_create_new_kb_hl_supportsP) {
        if (possibly_create_new_kb_hl_supportsP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportsP = T;
        }
        SubLObject new_supports = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_supports = cons(canonicalize_support(support, possibly_create_new_kb_hl_supportsP), new_supports);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return Sort.sort(new_supports, $sym45$SUPPORT__, UNPROVIDED);
    }

    public static SubLObject canonicalize_support(final SubLObject support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = T;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return support;
        }
        return canonicalize_hl_support(support, possibly_create_new_kb_hl_supportP);
    }

    public static SubLObject canonicalize_hl_support(final SubLObject hl_support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = T;
        }
        SubLObject canon_support = assertion_from_hl_support(hl_support);
        if (NIL == canon_support) {
            if (NIL != possibly_create_new_kb_hl_supportP) {
                canon_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support(hl_support);
            } else {
                canon_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            }
        }
        return NIL != canon_support ? canon_support : hl_support;
    }

    public static SubLObject hl_support_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && (NIL != list_utilities.proper_list_p(v_object))) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first())));
    }

    public static SubLObject make_hl_support(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        SubLTrampolineFile.enforceType(hl_module, HL_SUPPORT_MODULE_P);
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_CYCL_SENTENCE_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(tv, TV_P);
        return list(hl_module, sentence, mt, tv);
    }

    public static SubLObject hl_support_from_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject hl_module = support_module(assertion);
        final SubLObject formula = support_formula(assertion);
        final SubLObject mt = support_mt(assertion);
        final SubLObject tv = support_tv(assertion);
        return make_hl_support(hl_module, formula, mt, tv);
    }

    public static SubLObject assertion_from_hl_support(final SubLObject hl_support) {
        SubLObject assertion = NIL;
        if (hl_support_module(hl_support).eql($assertion_support_module$.getGlobalValue())) {
            assertion = czer_meta.find_assertion_cycl(hl_support_sentence(hl_support), hl_support_mt(hl_support));
        }
        return assertion;
    }

    public static SubLObject valid_hl_supportP(final SubLObject hl_support) {
        return makeBoolean(((((((NIL != hl_support_p(hl_support)) && (NIL != hl_supports.hl_support_module_p(hl_support_module(hl_support)))) && (NIL != possibly_sentence_p(hl_support_sentence(hl_support)))) && (NIL == cycl_utilities.expression_find_if($sym76$INVALID_INDEXED_TERM_, hl_support_sentence(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if($sym76$INVALID_INDEXED_TERM_, hl_support_mt(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL != hlmt.closed_hlmt_p(hl_support_mt(hl_support)))) && (NIL != enumeration_types.tv_p(hl_support_tv(hl_support))));
    }

    public static SubLObject hl_support_with_module_p(final SubLObject v_object, final SubLObject module) {
        return makeBoolean((NIL != hl_support_p(v_object)) && module.eql(hl_support_module(v_object)));
    }

    public static SubLObject hl_support_module(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) " + hl_support;
        return hl_support.first();
    }

    public static SubLObject hl_support_sentence(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) " + hl_support;
        return second(hl_support);
    }

    public static SubLObject hl_support_mt(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) " + hl_support;
        return third(hl_support);
    }

    public static SubLObject hl_support_tv(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) " + hl_support;
        return fourth(hl_support);
    }

    public static SubLObject genl_preds_support_p(final SubLObject hl_support) {
        return eq(hl_support_module(hl_support), $GENLPREDS);
    }

    public static SubLObject contextualize_hl_support(final SubLObject hl_support, final SubLObject new_mt) {
        SubLObject hl_module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(hl_support, hl_support, $list78);
        hl_module = hl_support.first();
        SubLObject current = hl_support.rest();
        destructuring_bind_must_consp(current, hl_support, $list78);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list78);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list78);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return make_hl_support(hl_module, sentence, new_mt, tv);
        }
        cdestructuring_bind_error(hl_support, $list78);
        return NIL;
    }

    public static SubLObject hl_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static SubLObject hl_justification_list_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(HL_JUSTIFICATION_P, v_object);
    }

    public static SubLObject non_empty_hl_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static SubLObject empty_hl_justification_p(final SubLObject v_object) {
        return sublisp_null(v_object);
    }

    public static SubLObject justification_equal(final SubLObject justification1, final SubLObject justification2) {
        return list_utilities.multisets_equalP(justification1, justification2, SUPPORT_EQUAL);
    }

    public static SubLObject canonicalize_hl_justification(final SubLObject hl_justification) {
        assert NIL != hl_justification_p(hl_justification) : "arguments.hl_justification_p(hl_justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(hl_justification) " + hl_justification;
        return Sort.sort(copy_list(hl_justification), symbol_function($sym45$SUPPORT__), UNPROVIDED);
    }

    public static SubLObject hl_support_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(HL_SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static SubLObject hl_justification_to_hl_support_justification(final SubLObject hl_justification) {
        assert NIL != hl_justification_p(hl_justification) : "arguments.hl_justification_p(hl_justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(hl_justification) " + hl_justification;
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = hl_justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(support)) {
                support = hl_support_from_assertion(support);
            }
            supports = cons(support, supports);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return nreverse(supports);
    }

    public static SubLObject reified_support_has_dependent_with_supportP(SubLObject reified_support, final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(reified_support)) {
            return assertion_utilities.assertion_has_dependent_with_supportP(reified_support, support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        if (NIL == hl_support_p(reified_support)) {
            return NIL;
        }
        reified_support = kb_hl_supports_high.find_kb_hl_support(reified_support);
        if (NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        return NIL;
    }

    public static SubLObject reified_support_has_dependent_with_supportP_kb_hl_support_aware_version(SubLObject reified_support, final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(reified_support)) {
            return assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version(reified_support, support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        if (NIL == hl_support_p(reified_support)) {
            return NIL;
        }
        reified_support = kb_hl_supports_high.find_kb_hl_support(reified_support);
        if (NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        return NIL;
    }

    public static SubLObject declare_arguments_file() {
        declareMacro(me, "do_arguments", "DO-ARGUMENTS");
        declareMacro(me, "do_beliefs", "DO-BELIEFS");
        declareMacro(me, "do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
        declareFunction(me, "argument_p", "ARGUMENT-P", 1, 0, false);
        declareFunction(me, "valid_argument", "VALID-ARGUMENT", 1, 1, false);
        declareFunction(me, "argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction(me, "argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
        declareFunction(me, "argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
        declareFunction(me, "argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
        declareFunction(me, "argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
        declareFunction(me, "argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false);
        new arguments.$argument_type_proper_genls$UnaryFunction();
        declareFunction(me, "argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
        declareFunction(me, "argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
        declareFunction(me, "argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
        declareFunction(me, "argument_tv", "ARGUMENT-TV", 1, 0, false);
        declareFunction(me, "argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction(me, "remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
        declareFunction(me, "belief_p", "BELIEF-P", 1, 0, false);
        declareFunction(me, "belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
        declareFunction(me, "belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
        declareFunction(me, "remove_belief", "REMOVE-BELIEF", 2, 0, false);
        declareFunction(me, "belief_equal", "BELIEF-EQUAL", 2, 0, false);
        declareFunction(me, "belief_truth", "BELIEF-TRUTH", 1, 0, false);
        declareFunction(me, "belief_strength", "BELIEF-STRENGTH", 1, 0, false);
        declareFunction(me, "belief_tv", "BELIEF-TV", 1, 0, false);
        declareFunction(me, "asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false);
        new arguments.$asserted_argument_p$UnaryFunction();
        declareFunction(me, "asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction(me, "asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction(me, "create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction(me, "create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction(me, "asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
        declareFunction(me, "kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
        declareFunction(me, "asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
        declareFunction(me, "asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        declareFunction(me, "asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
        declareFunction(me, "tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
        declareFunction(me, "make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
        declareFunction(me, "asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
        declareFunction(me, "asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
        declareFunction(me, "asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction(me, "asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
        declareFunction(me, "list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
        declareFunction(me, "cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
        declareFunction(me, "support_p", "SUPPORT-P", 1, 0, false);
        new arguments.$support_p$UnaryFunction();
        declareFunction(me, "reified_support_p", "REIFIED-SUPPORT-P", 1, 0, false);
        declareFunction(me, "supports_p", "SUPPORTS-P", 1, 0, false);
        declareFunction(me, "support_list_p", "SUPPORT-LIST-P", 1, 0, false);
        declareFunction(me, "valid_supportP", "VALID-SUPPORT?", 1, 1, false);
        declareFunction(me, "ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
        declareFunction(me, "hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction(me, "kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction(me, "assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction(me, "support_equal", "SUPPORT-EQUAL", 2, 0, false);
        new arguments.$support_equal$BinaryFunction();
        declareFunction(me, "support_L", "SUPPORT-<", 2, 0, false);
        new arguments.$support_L$BinaryFunction();
        declareFunction(me, "sort_supports", "SORT-SUPPORTS", 1, 0, false);
        declareFunction(me, "support_module", "SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
        declareFunction(me, "support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
        declareFunction(me, "support_formula", "SUPPORT-FORMULA", 1, 0, false);
        declareFunction(me, "support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
        declareFunction(me, "support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
        declareFunction(me, "support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        declareFunction(me, "support_cons", "SUPPORT-CONS", 1, 0, false);
        declareFunction(me, "support_mt", "SUPPORT-MT", 1, 0, false);
        new arguments.$support_mt$UnaryFunction();
        declareFunction(me, "support_elmt", "SUPPORT-ELMT", 1, 0, false);
        declareFunction(me, "support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "support_truth", "SUPPORT-TRUTH", 1, 0, false);
        declareFunction(me, "support_strength", "SUPPORT-STRENGTH", 1, 0, false);
        declareFunction(me, "support_tv", "SUPPORT-TV", 1, 0, false);
        declareFunction(me, "hl_support_from_support", "HL-SUPPORT-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "contextualize_support", "CONTEXTUALIZE-SUPPORT", 2, 0, false);
        declareFunction(me, "canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
        declareFunction(me, "canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
        declareFunction(me, "canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
        declareFunction(me, "hl_support_p", "HL-SUPPORT-P", 1, 0, false);
        declareFunction(me, "make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
        declareFunction(me, "hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
        declareFunction(me, "assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
        declareFunction(me, "hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
        declareFunction(me, "hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction(me, "hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
        declareFunction(me, "hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
        declareFunction(me, "genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
        declareFunction(me, "contextualize_hl_support", "CONTEXTUALIZE-HL-SUPPORT", 2, 0, false);
        declareFunction(me, "hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction(me, "hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
        declareFunction(me, "non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction(me, "empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction(me, "justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false);
        new arguments.$justification_equal$BinaryFunction();
        declareFunction(me, "canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
        declareFunction(me, "hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "reified_support_has_dependent_with_supportP", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        declareFunction(me, "reified_support_has_dependent_with_supportP_kb_hl_support_aware_version", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_arguments_file() {
        deflexical("*ARGUMENT-TYPES*", $list18);
        deflexical("*ARGUMENT-TYPE-HIERARCHY*", $list19);
        deflexical("*ASSERTED-ARGUMENT-TV-TABLE*", $list36);
        deflexical("*ASSERTED-ARGUMENTS*", Mapping.mapcar(symbol_function(FIRST), $asserted_argument_tv_table$.getGlobalValue()));
        deflexical("*ASSERTION-SUPPORT-MODULE*", $ASSERTION);
        return NIL;
    }

    public static SubLObject setup_arguments_file() {
        register_cyc_api_function(ARGUMENT_P, $list14, $str15$Return_T_iff_OBJECT_is_an_HL_argu, NIL, $list16);
        register_cyc_api_function(ARGUMENT_EQUAL, $list22, $str23$Return_T_iff_ARGUMENT1_and_ARGUME, NIL, $list16);
        register_cyc_api_function(ARGUMENT_TRUTH, $list25, $str26$Return_the_truth_of_ARGUMENT_, $list27, $list28);
        register_cyc_api_function(ARGUMENT_STRENGTH, $list25, $str30$Return_the_strength_of_ARGUMENT_, $list27, $list31);
        register_cyc_api_function(ASSERTED_ARGUMENT_P, $list14, $str33$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list16);
        register_cyc_api_function(SUPPORT_P, $list14, $str42$Return_T_iff_OBJECT_can_be_a_supp, NIL, $list16);
        register_cyc_api_function(SUPPORT_MODULE, $list48, $str49$Return_the_module_of_SUPPORT_, $list50, $list51);
        register_cyc_api_function(SUPPORT_SENTENCE, $list48, $str53$Return_the_sentence_of_SUPPORT_, $list50, $list54);
        define_obsolete_register(SUPPORT_FORMULA, $list56);
        register_cyc_api_function(SUPPORT_MT, $list48, $str58$Return_the_microtheory_of_SUPPORT, $list50, $list59);
        register_cyc_api_function(SUPPORT_TRUTH, $list48, $str61$Return_the_truth_of_SUPPORT_, $list50, $list28);
        register_cyc_api_function(SUPPORT_STRENGTH, $list48, $str63$Return_the_strength_of_SUPPORT_, $list50, $list31);
        register_cyc_api_function(HL_SUPPORT_P, $list14, $str65$Does_OBJECT_represent_an_HL_suppo, NIL, $list16);
        register_cyc_api_function(MAKE_HL_SUPPORT, $list71, $str72$Construct_a_new_HL_support_, $list73, $list74);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_arguments_file();
    }

    @Override
    public void initializeVariables() {
        init_arguments_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_arguments_file();
    }

    

    public static final class $argument_type_proper_genls$UnaryFunction extends UnaryFunction {
        public $argument_type_proper_genls$UnaryFunction() {
            super(extractFunctionNamed("ARGUMENT-TYPE-PROPER-GENLS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return argument_type_proper_genls(arg1);
        }
    }

    public static final class $asserted_argument_p$UnaryFunction extends UnaryFunction {
        public $asserted_argument_p$UnaryFunction() {
            super(extractFunctionNamed("ASSERTED-ARGUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return asserted_argument_p(arg1);
        }
    }

    public static final class $support_p$UnaryFunction extends UnaryFunction {
        public $support_p$UnaryFunction() {
            super(extractFunctionNamed("SUPPORT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return support_p(arg1);
        }
    }

    public static final class $support_equal$BinaryFunction extends BinaryFunction {
        public $support_equal$BinaryFunction() {
            super(extractFunctionNamed("SUPPORT-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return support_equal(arg1, arg2);
        }
    }

    public static final class $support_L$BinaryFunction extends BinaryFunction {
        public $support_L$BinaryFunction() {
            super(extractFunctionNamed("SUPPORT-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return support_L(arg1, arg2);
        }
    }

    public static final class $support_mt$UnaryFunction extends UnaryFunction {
        public $support_mt$UnaryFunction() {
            super(extractFunctionNamed("SUPPORT-MT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return support_mt(arg1);
        }
    }

    public static final class $justification_equal$BinaryFunction extends BinaryFunction {
        public $justification_equal$BinaryFunction() {
            super(extractFunctionNamed("JUSTIFICATION-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return justification_equal(arg1, arg2);
        }
    }

	/**
	 * Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.
	 * Return NIL otherwise.
	 */
	@LispMethod(comment = "Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\r\nReturn NIL otherwise.\nReturn the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\nReturn NIL otherwise.")
	public static final SubLObject kb_lookup_asserted_argument(SubLObject assertion, SubLObject truth, SubLObject strength) {
	    SubLTrampolineFile.checkType(assertion, ASSERTION_P);
	    SubLTrampolineFile.checkType(truth, TRUTH_P);
	    SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
	    if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
	        return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_ASSERTED_ARGUMENT, list(QUOTE, assertion), list(QUOTE, truth), list(QUOTE, strength)));
	    } else {
	        return com.cyc.cycjava.cycl.arguments.lookup_asserted_argument(assertion, truth, strength);
	    }
	}

	public static final SubLObject lookup_asserted_argument(SubLObject assertion, SubLObject truth, SubLObject strength) {
	    {
	        SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
	        if (((NIL != asserted_argument) && (truth == com.cyc.cycjava.cycl.arguments.asserted_argument_truth(asserted_argument))) && (strength == com.cyc.cycjava.cycl.arguments.asserted_argument_strength(asserted_argument))) {
	            return asserted_argument;
	        }
	    }
	    return NIL;
	}
}

/**
 * Total time: 324 ms
 */
