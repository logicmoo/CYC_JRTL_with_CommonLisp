/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ARGUMENTS
 * source file: /cyc/top/cycl/arguments.lisp
 * created:     2019/07/03 17:37:21
 */
public final class arguments extends SubLTranslatedFile implements V12 {
    public static final SubLObject lookup_asserted_argument(SubLObject assertion, SubLObject truth, SubLObject strength) {
        {
            SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
            if (((NIL != asserted_argument) && (truth == com.cyc.cycjava.cycl.arguments.asserted_argument_truth(asserted_argument))) && (strength == com.cyc.cycjava.cycl.arguments.asserted_argument_strength(asserted_argument))) {
                return asserted_argument;
            }
        }
        return NIL;
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

    public static final SubLFile me = new arguments();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $argument_types$ = makeSymbol("*ARGUMENT-TYPES*");

    // deflexical
    /**
     * A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls). hard-codes
     * the type hierarchy: ARGUMENT / BELIEF DEDUCTION / ASSERTED-ARGUMENT
     */
    @LispMethod(comment = "A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls). hard-codes\r\nthe type hierarchy: ARGUMENT / BELIEF DEDUCTION / ASSERTED-ARGUMENT\ndeflexical\nA list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls). hard-codes\nthe type hierarchy: ARGUMENT / BELIEF DEDUCTION / ASSERTED-ARGUMENT")
    private static final SubLSymbol $argument_type_hierarchy$ = makeSymbol("*ARGUMENT-TYPE-HIERARCHY*");

    // deflexical
    // Asserted argument -> HL TV mapping
    /**
     * Asserted argument -> HL TV mapping
     */
    @LispMethod(comment = "Asserted argument -> HL TV mapping\ndeflexical")
    private static final SubLSymbol $asserted_argument_tv_table$ = makeSymbol("*ASSERTED-ARGUMENT-TV-TABLE*");

    // deflexical
    // Tokens representing the possible asserted arguments
    /**
     * Tokens representing the possible asserted arguments
     */
    @LispMethod(comment = "Tokens representing the possible asserted arguments\ndeflexical")
    private static final SubLSymbol $asserted_arguments$ = makeSymbol("*ASSERTED-ARGUMENTS*");

    // deflexical
    // The module which denotes that an assertion is the support.
    /**
     * The module which denotes that an assertion is the support.
     */
    @LispMethod(comment = "The module which denotes that an assertion is the support.\ndeflexical")
    public static final SubLSymbol $assertion_support_module$ = makeSymbol("*ASSERTION-SUPPORT-MODULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_arguments = makeString("mapping Cyc arguments");

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    private static final SubLSymbol ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");

    static private final SubLList $list5 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc belief arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_belief_arguments = makeString("mapping Cyc belief arguments");

    private static final SubLSymbol DO_ARGUMENTS = makeSymbol("DO-ARGUMENTS");

    private static final SubLSymbol BELIEF_P = makeSymbol("BELIEF-P");

    static private final SubLList $list10 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc asserted arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_asserted_arguments = makeString("mapping Cyc asserted arguments");

    static private final SubLList $list14 = list(makeSymbol("OBJECT"));

    static private final SubLString $str15$Return_T_iff_OBJECT_is_an_HL_argu = makeString("Return T iff OBJECT is an HL argument structure.");

    static private final SubLList $list16 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $$$unexpected_argument_type = makeString("unexpected argument type");

    static private final SubLList $list18 = list(makeKeyword("ARGUMENT"), makeKeyword("BELIEF"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("DEDUCTION"));

    static private final SubLList $list19 = list(list(makeKeyword("ARGUMENT"), NIL), list(makeKeyword("BELIEF"), list(makeKeyword("ARGUMENT"))), list(makeKeyword("ASSERTED-ARGUMENT"), list(makeKeyword("BELIEF"))), list(makeKeyword("DEDUCTION"), list(makeKeyword("ARGUMENT"))));

    private static final SubLSymbol ARGUMENT_TYPE_PROPER_GENLS = makeSymbol("ARGUMENT-TYPE-PROPER-GENLS");

    private static final SubLSymbol ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");

    static private final SubLList $list22 = list(makeSymbol("ARGUMENT1"), makeSymbol("ARGUMENT2"));

    static private final SubLString $str23$Return_T_iff_ARGUMENT1_and_ARGUME = makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent ");

    private static final SubLSymbol ARGUMENT_TRUTH = makeSymbol("ARGUMENT-TRUTH");

    static private final SubLList $list25 = list(makeSymbol("ARGUMENT"));

    static private final SubLString $str26$Return_the_truth_of_ARGUMENT_ = makeString("Return the truth of ARGUMENT.");

    static private final SubLList $list27 = list(list(makeSymbol("ARGUMENT"), makeSymbol("ARGUMENT-P")));

    static private final SubLList $list28 = list(makeSymbol("TRUTH-P"));

    private static final SubLSymbol ARGUMENT_STRENGTH = makeSymbol("ARGUMENT-STRENGTH");

    static private final SubLString $str30$Return_the_strength_of_ARGUMENT_ = makeString("Return the strength of ARGUMENT.");

    static private final SubLList $list31 = list(makeSymbol("EL-STRENGTH-P"));

    static private final SubLString $$$unexpected_belief_type = makeString("unexpected belief type");

    static private final SubLString $str33$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL asserted argument structure.");

    private static final SubLSymbol EL_STRENGTH_SPEC_P = makeSymbol("EL-STRENGTH-SPEC-P");

    static private final SubLList $list36 = list(list(makeKeyword("ASSERTED-TRUE-MON"), makeKeyword("TRUE-MON")), list(makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("TRUE-DEF")), list(makeKeyword("ASSERTED-UNKNOWN"), makeKeyword("UNKNOWN")), list(makeKeyword("ASSERTED-FALSE-DEF"), makeKeyword("FALSE-DEF")), list(makeKeyword("ASSERTED-FALSE-MON"), makeKeyword("FALSE-MON")));

    private static final SubLSymbol TV_P = makeSymbol("TV-P");

    static private final SubLList $list40 = list(makeKeyword("LOCAL"));

    private static final SubLString $str42$Return_T_iff_OBJECT_can_be_a_supp = makeString("Return T iff OBJECT can be a support in an argument.");

    private static final SubLSymbol $SYNTACTICALLY_ILL_FORMED = makeKeyword("SYNTACTICALLY-ILL-FORMED");

    private static final SubLSymbol $sym45$SUPPORT__ = makeSymbol("SUPPORT-<");

    private static final SubLSymbol SUPPORT_MODULE = makeSymbol("SUPPORT-MODULE");

    static private final SubLList $list48 = list(makeSymbol("SUPPORT"));

    private static final SubLString $str49$Return_the_module_of_SUPPORT_ = makeString("Return the module of SUPPORT.");

    private static final SubLList $list50 = list(list(makeSymbol("SUPPORT"), makeSymbol("SUPPORT-P")));

    private static final SubLList $list51 = list(makeSymbol("HL-SUPPORT-MODULE-P"));

    private static final SubLString $str53$Return_the_sentence_of_SUPPORT_ = makeString("Return the sentence of SUPPORT.");

    private static final SubLList $list54 = list(makeSymbol("CONSP"));

    private static final SubLSymbol SUPPORT_FORMULA = makeSymbol("SUPPORT-FORMULA");

    private static final SubLList $list56 = list(makeSymbol("SUPPORT-SENTENCE"));

    private static final SubLString $str58$Return_the_microtheory_of_SUPPORT = makeString("Return the microtheory of SUPPORT.");

    static private final SubLList $list59 = list(makeSymbol("HLMT-P"));

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

    // Definitions
    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to an argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to an argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to an argument for ASSERTION.\nMESSAGE is a progress message string.")
    public static final SubLObject do_arguments_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject argument = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    argument = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_arguments;
                        destructuring_bind_must_listp(current, datum, $list_alt0);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_ASSERTIONS, list(assertion, message), listS(CDOLIST, list(argument, list(ASSERTION_ARGUMENTS, assertion)), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to an argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to an argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to an argument for ASSERTION.\nMESSAGE is a progress message string.")
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

    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to a belief argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to a belief argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to a belief argument for ASSERTION.\nMESSAGE is a progress message string.")
    public static final SubLObject do_beliefs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject argument = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    argument = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_belief_arguments;
                        destructuring_bind_must_listp(current, datum, $list_alt5);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_ARGUMENTS, list(assertion, argument, message), listS(PWHEN, list(BELIEF_P, argument), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to a belief argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to a belief argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to a belief argument for ASSERTION.\nMESSAGE is a progress message string.")
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

    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to an asserted argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to an asserted argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to an asserted argument for ASSERTION.\nMESSAGE is a progress message string.")
    public static final SubLObject do_asserted_arguments_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject argument = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    argument = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_asserted_arguments;
                        destructuring_bind_must_listp(current, datum, $list_alt10);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_ARGUMENTS, list(assertion, argument, message), listS(PWHEN, list(ASSERTED_ARGUMENT_P, argument), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.
     * ASSERTION is bound to an assertion.
     * ARGUMENT is bound to an asserted argument for ASSERTION.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\r\nASSERTION is bound to an assertion.\r\nARGUMENT is bound to an asserted argument for ASSERTION.\r\nMESSAGE is a progress message string.\nIterate over all HL assertion datastructures, executing BODY within the scope of ARGUMENT and ASSERTION.\nASSERTION is bound to an assertion.\nARGUMENT is bound to an asserted argument for ASSERTION.\nMESSAGE is a progress message string.")
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

    /**
     * Return T iff OBJECT is an HL argument structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL argument structure.")
    public static final SubLObject argument_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.arguments.belief_p(v_object)) || (NIL != deduction_handles.deduction_p(v_object)));
    }

    /**
     * Return T iff OBJECT is an HL argument structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL argument structure.")
    public static SubLObject argument_p(final SubLObject v_object) {
        return makeBoolean((NIL != belief_p(v_object)) || (NIL != deduction_handles.deduction_p(v_object)));
    }

    /**
     * Return T if ARGUMENT is a valid argument.
     * ROBUST requests more thorough checking.
     */
    @LispMethod(comment = "Return T if ARGUMENT is a valid argument.\r\nROBUST requests more thorough checking.\nReturn T if ARGUMENT is a valid argument.\nROBUST requests more thorough checking.")
    public static final SubLObject valid_argument_alt(SubLObject argument, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return T;
        } else {
            if (NIL != deduction_handles.deduction_p(argument)) {
                return deduction_handles.valid_deduction(argument, robust);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T if ARGUMENT is a valid argument.
     * ROBUST requests more thorough checking.
     */
    @LispMethod(comment = "Return T if ARGUMENT is a valid argument.\r\nROBUST requests more thorough checking.\nReturn T if ARGUMENT is a valid argument.\nROBUST requests more thorough checking.")
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

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies an argument.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies an argument.")
    public static final SubLObject argument_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.arguments.belief_spec_p(v_object)) || (NIL != deductions_high.deduction_spec_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies an argument.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies an argument.")
    public static SubLObject argument_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != belief_spec_p(v_object)) || (NIL != deductions_high.deduction_spec_p(v_object)));
    }

    public static final SubLObject argument_to_argument_spec_alt(SubLObject argument) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return com.cyc.cycjava.cycl.arguments.belief_to_belief_spec(argument);
        } else {
            if (NIL != deduction_handles.deduction_p(argument)) {
                return deductions_high.deduction_to_deduction_spec(argument);
            } else {
                Errors.error($$$unexpected_argument_type);
            }
        }
        return NIL;
    }

    public static SubLObject argument_to_argument_spec(final SubLObject argument) {
        assert NIL != argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        if (NIL != belief_p(argument)) {
            return belief_to_belief_spec(argument);
        }
        if (NIL != deduction_handles.deduction_p(argument)) {
            return deductions_high.deduction_to_deduction_spec(argument);
        }
        Errors.error($$$unexpected_argument_type);
        return NIL;
    }

    /**
     * Returns the type of the argument specified by ARGUMENT-SPEC
     */
    @LispMethod(comment = "Returns the type of the argument specified by ARGUMENT-SPEC")
    public static final SubLObject argument_spec_type_alt(SubLObject argument_spec) {
        return argument_spec.first();
    }

    /**
     * Returns the type of the argument specified by ARGUMENT-SPEC
     */
    @LispMethod(comment = "Returns the type of the argument specified by ARGUMENT-SPEC")
    public static SubLObject argument_spec_type(final SubLObject argument_spec) {
        return argument_spec.first();
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies a type of argument; i.e.
    :argument, :belief, :asserted-argument, or :deduction.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies a type of argument; i.e.\r\n:argument, :belief, :asserted-argument, or :deduction.")
    public static final SubLObject argument_type_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $argument_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies a type of argument; i.e.
    :argument, :belief, :asserted-argument, or :deduction.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies a type of argument; i.e.\r\n:argument, :belief, :asserted-argument, or :deduction.")
    public static SubLObject argument_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $argument_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls)
     */
    @LispMethod(comment = "A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls)")
    public static final SubLObject argument_type_hierarchy_alt() {
        return $argument_type_hierarchy$.getGlobalValue();
    }

    /**
     * A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls)
     */
    @LispMethod(comment = "A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls)")
    public static SubLObject argument_type_hierarchy() {
        return $argument_type_hierarchy$.getGlobalValue();
    }

    /**
     * Returns the proper genls of ARGUMENT-TYPE in the hard-coded hierarchy
     */
    @LispMethod(comment = "Returns the proper genls of ARGUMENT-TYPE in the hard-coded hierarchy")
    public static final SubLObject argument_type_proper_genls_alt(SubLObject argument_type) {
        {
            SubLObject pair = assoc(argument_type, com.cyc.cycjava.cycl.arguments.argument_type_hierarchy(), UNPROVIDED, UNPROVIDED);
            if (NIL == pair) {
                return NIL;
            } else {
                {
                    SubLObject immediate_proper_genls = copy_list(second(pair));
                    SubLObject recursive_proper_genls = Mapping.mapcan(ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, EMPTY_SUBL_OBJECT_ARRAY);
                    return append(immediate_proper_genls, recursive_proper_genls);
                }
            }
        }
    }

    /**
     * Returns the proper genls of ARGUMENT-TYPE in the hard-coded hierarchy
     */
    @LispMethod(comment = "Returns the proper genls of ARGUMENT-TYPE in the hard-coded hierarchy")
    public static SubLObject argument_type_proper_genls(final SubLObject argument_type) {
        final SubLObject pair = assoc(argument_type, argument_type_hierarchy(), UNPROVIDED, UNPROVIDED);
        if (NIL == pair) {
            return NIL;
        }
        final SubLObject immediate_proper_genls = copy_list(second(pair));
        final SubLObject recursive_proper_genls = Mapping.mapcan(ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, EMPTY_SUBL_OBJECT_ARRAY);
        return append(immediate_proper_genls, recursive_proper_genls);
    }

    /**
     * Returns the genls of ARGUMENT-TYPE in the hard-coded hierarchy
     */
    @LispMethod(comment = "Returns the genls of ARGUMENT-TYPE in the hard-coded hierarchy")
    public static final SubLObject argument_type_genls_alt(SubLObject argument_type) {
        return cons(argument_type, com.cyc.cycjava.cycl.arguments.argument_type_proper_genls(argument_type));
    }

    /**
     * Returns the genls of ARGUMENT-TYPE in the hard-coded hierarchy
     */
    @LispMethod(comment = "Returns the genls of ARGUMENT-TYPE in the hard-coded hierarchy")
    public static SubLObject argument_type_genls(final SubLObject argument_type) {
        return cons(argument_type, argument_type_proper_genls(argument_type));
    }

    /**
     * Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.
     */
    @LispMethod(comment = "Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.")
    public static final SubLObject argument_equal_alt(SubLObject argument1, SubLObject argument2) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.arguments.argument_p(argument1)) && (NIL != com.cyc.cycjava.cycl.arguments.argument_p(argument2))) && ((argument1 == argument2) || (NIL != (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument1) ? ((SubLObject) (makeBoolean((NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument2)) && (NIL != com.cyc.cycjava.cycl.arguments.belief_equal(argument1, argument2))))) : makeBoolean((NIL != deduction_handles.deduction_p(argument2)) && (NIL != deductions_high.deduction_equal(argument1, argument2)))))));
    }

    /**
     * Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.
     */
    @LispMethod(comment = "Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.")
    public static SubLObject argument_equal(final SubLObject argument1, final SubLObject argument2) {
        return makeBoolean(((NIL != argument_p(argument1)) && (NIL != argument_p(argument2))) && (argument1.eql(argument2) || (NIL != (NIL != belief_p(argument1) ? makeBoolean((NIL != belief_p(argument2)) && (NIL != belief_equal(argument1, argument2))) : makeBoolean((NIL != deduction_handles.deduction_p(argument2)) && (NIL != deductions_high.deduction_equal(argument1, argument2)))))));
    }

    /**
     * Return the truth of ARGUMENT.
     */
    @LispMethod(comment = "Return the truth of ARGUMENT.")
    public static final SubLObject argument_truth_alt(SubLObject argument) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return com.cyc.cycjava.cycl.arguments.belief_truth(argument);
        } else {
            return deductions_high.deduction_truth(argument);
        }
    }

    /**
     * Return the truth of ARGUMENT.
     */
    @LispMethod(comment = "Return the truth of ARGUMENT.")
    public static SubLObject argument_truth(final SubLObject argument) {
        SubLTrampolineFile.enforceType(argument, ARGUMENT_P);
        if (NIL != belief_p(argument)) {
            return belief_truth(argument);
        }
        return deductions_high.deduction_truth(argument);
    }

    /**
     * Return the HL tv of ARGUMENT.
     */
    @LispMethod(comment = "Return the HL tv of ARGUMENT.")
    public static final SubLObject argument_tv_alt(SubLObject argument) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return com.cyc.cycjava.cycl.arguments.belief_tv(argument);
        } else {
            {
                SubLObject truth = deductions_high.deduction_truth(argument);
                SubLObject strength = deductions_high.deduction_strength(argument);
                return enumeration_types.tv_from_truth_strength(truth, strength);
            }
        }
    }

    /**
     * Return the HL tv of ARGUMENT.
     */
    @LispMethod(comment = "Return the HL tv of ARGUMENT.")
    public static SubLObject argument_tv(final SubLObject argument) {
        assert NIL != argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        if (NIL != belief_p(argument)) {
            return belief_tv(argument);
        }
        final SubLObject truth = deductions_high.deduction_truth(argument);
        final SubLObject strength = deductions_high.deduction_strength(argument);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }

    /**
     * Return the strength of ARGUMENT.
     */
    @LispMethod(comment = "Return the strength of ARGUMENT.")
    public static final SubLObject argument_strength_alt(SubLObject argument) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return com.cyc.cycjava.cycl.arguments.belief_strength(argument);
        } else {
            return deductions_high.deduction_strength(argument);
        }
    }

    /**
     * Return the strength of ARGUMENT.
     */
    @LispMethod(comment = "Return the strength of ARGUMENT.")
    public static SubLObject argument_strength(final SubLObject argument) {
        SubLTrampolineFile.enforceType(argument, ARGUMENT_P);
        if (NIL != belief_p(argument)) {
            return belief_strength(argument);
        }
        return deductions_high.deduction_strength(argument);
    }

    /**
     * Remove ARGUMENT from the KB, and unhook it from ASSERTION.
     */
    @LispMethod(comment = "Remove ARGUMENT from the KB, and unhook it from ASSERTION.")
    public static final SubLObject remove_argument_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.arguments.belief_p(argument)) {
            return com.cyc.cycjava.cycl.arguments.remove_belief(argument, assertion);
        } else {
            return deductions_interface.kb_remove_deduction(argument);
        }
    }

    /**
     * Remove ARGUMENT from the KB, and unhook it from ASSERTION.
     */
    @LispMethod(comment = "Remove ARGUMENT from the KB, and unhook it from ASSERTION.")
    public static SubLObject remove_argument(final SubLObject argument, final SubLObject support) {
        if (NIL != belief_p(argument)) {
            return remove_belief(argument, support);
        }
        return deductions_interface.kb_remove_deduction(argument);
    }

    /**
     * Return T iff OBJECT is an HL belief structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL belief structure.")
    public static final SubLObject belief_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_p(v_object);
    }

    /**
     * Return T iff OBJECT is an HL belief structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL belief structure.")
    public static SubLObject belief_p(final SubLObject v_object) {
        return asserted_argument_p(v_object);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies a belief.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies a belief.")
    public static final SubLObject belief_spec_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_spec_p(v_object);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT specifies a belief.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT specifies a belief.")
    public static SubLObject belief_spec_p(final SubLObject v_object) {
        return asserted_argument_spec_p(v_object);
    }

    public static final SubLObject belief_to_belief_spec_alt(SubLObject belief) {
        SubLTrampolineFile.checkType(belief, BELIEF_P);
        if (NIL != com.cyc.cycjava.cycl.arguments.asserted_argument_p(belief)) {
            return com.cyc.cycjava.cycl.arguments.asserted_argument_to_asserted_argument_spec(belief);
        } else {
            Errors.error($$$unexpected_belief_type);
        }
        return NIL;
    }

    public static SubLObject belief_to_belief_spec(final SubLObject belief) {
        assert NIL != belief_p(belief) : "! arguments.belief_p(belief) " + ("arguments.belief_p(belief) " + "CommonSymbols.NIL != arguments.belief_p(belief) ") + belief;
        if (NIL != asserted_argument_p(belief)) {
            return asserted_argument_to_asserted_argument_spec(belief);
        }
        Errors.error($$$unexpected_belief_type);
        return NIL;
    }

    public static final SubLObject remove_belief_alt(SubLObject belief, SubLObject assertion) {
        return hl_modifiers.kb_remove_asserted_argument(assertion, belief);
    }

    public static SubLObject remove_belief(final SubLObject belief, final SubLObject assertion) {
        return assertions_interface.kb_remove_asserted_argument(assertion, belief);
    }

    public static final SubLObject belief_equal_alt(SubLObject belief1, SubLObject belief2) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_equal(belief1, belief2);
    }

    public static SubLObject belief_equal(final SubLObject belief1, final SubLObject belief2) {
        return asserted_argument_equal(belief1, belief2);
    }

    public static final SubLObject belief_truth_alt(SubLObject belief) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_truth(belief);
    }

    public static SubLObject belief_truth(final SubLObject belief) {
        return asserted_argument_truth(belief);
    }

    public static final SubLObject belief_strength_alt(SubLObject belief) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_strength(belief);
    }

    public static SubLObject belief_strength(final SubLObject belief) {
        return asserted_argument_strength(belief);
    }

    public static final SubLObject belief_tv_alt(SubLObject belief) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_tv(belief);
    }

    public static SubLObject belief_tv(final SubLObject belief) {
        return asserted_argument_tv(belief);
    }

    /**
     * Return T iff OBJECT is an HL asserted argument structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL asserted argument structure.")
    public static final SubLObject asserted_argument_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_token_p(v_object);
    }

    /**
     * Return T iff OBJECT is an HL asserted argument structure.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL asserted argument structure.")
    public static SubLObject asserted_argument_p(final SubLObject v_object) {
        return asserted_argument_token_p(v_object);
    }

    /**
     * pattern : (:asserted-argument <el-strength-spec-p>)
     */
    @LispMethod(comment = "pattern : (:asserted-argument <el-strength-spec-p>)")
    public static final SubLObject asserted_argument_spec_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && ($ASSERTED_ARGUMENT == v_object.first())) && (NIL != enumeration_types.el_strength_spec_p(second(v_object))));
    }

    /**
     * pattern : (:asserted-argument <el-strength-spec-p>)
     */
    @LispMethod(comment = "pattern : (:asserted-argument <el-strength-spec-p>)")
    public static SubLObject asserted_argument_spec_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && ($ASSERTED_ARGUMENT == v_object.first())) && (NIL != enumeration_types.el_strength_spec_p(second(v_object))));
    }

    public static final SubLObject asserted_argument_to_asserted_argument_spec_alt(SubLObject asserted_argument) {
        {
            SubLObject strength = com.cyc.cycjava.cycl.arguments.asserted_argument_strength(asserted_argument);
            SubLObject argument_spec = com.cyc.cycjava.cycl.arguments.create_asserted_argument_spec(strength);
            return argument_spec;
        }
    }

    public static SubLObject asserted_argument_to_asserted_argument_spec(final SubLObject asserted_argument) {
        final SubLObject strength = asserted_argument_strength(asserted_argument);
        final SubLObject argument_spec = create_asserted_argument_spec(strength);
        return argument_spec;
    }

    /**
     * Create an asserted argument for ASSERTION with TV.
     */
    @LispMethod(comment = "Create an asserted argument for ASSERTION with TV.")
    public static final SubLObject create_asserted_argument_alt(SubLObject assertion, SubLObject tv) {
        return com.cyc.cycjava.cycl.arguments.asserted_argument_token_from_tv(tv);
    }

    /**
     * Create an asserted argument for ASSERTION with TV.
     */
    @LispMethod(comment = "Create an asserted argument for ASSERTION with TV.")
    public static SubLObject create_asserted_argument(final SubLObject assertion, final SubLObject tv) {
        return asserted_argument_token_from_tv(tv);
    }

    public static final SubLObject create_asserted_argument_spec_alt(SubLObject strength_spec) {
        SubLTrampolineFile.checkType(strength_spec, EL_STRENGTH_SPEC_P);
        return list($ASSERTED_ARGUMENT, strength_spec);
    }

    public static SubLObject create_asserted_argument_spec(final SubLObject strength_spec) {
        assert NIL != enumeration_types.el_strength_spec_p(strength_spec) : "! enumeration_types.el_strength_spec_p(strength_spec) " + ("enumeration_types.el_strength_spec_p(strength_spec) " + "CommonSymbols.NIL != enumeration_types.el_strength_spec_p(strength_spec) ") + strength_spec;
        return list($ASSERTED_ARGUMENT, strength_spec);
    }

    public static final SubLObject asserted_argument_spec_strength_spec_alt(SubLObject asserted_argument_spec) {
        return second(asserted_argument_spec);
    }

    public static SubLObject asserted_argument_spec_strength_spec(final SubLObject asserted_argument_spec) {
        return second(asserted_argument_spec);
    }

    public static final SubLObject kb_remove_asserted_argument_internal_alt(SubLObject asserted_argument) {
        return NIL;
    }

    public static SubLObject kb_remove_asserted_argument_internal(final SubLObject asserted_argument) {
        return NIL;
    }

    public static final SubLObject asserted_argument_tokens_alt() {
        return $asserted_arguments$.getGlobalValue();
    }

    public static SubLObject asserted_argument_tokens() {
        return $asserted_arguments$.getGlobalValue();
    }

    public static final SubLObject asserted_argument_token_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $asserted_arguments$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject asserted_argument_token_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $asserted_arguments$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject asserted_argument_token_from_tv_alt(SubLObject tv) {
        SubLTrampolineFile.checkType(tv, TV_P);
        return find(tv, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(SECOND), UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject asserted_argument_token_from_tv(final SubLObject tv) {
        assert NIL != enumeration_types.tv_p(tv) : "! enumeration_types.tv_p(tv) " + ("enumeration_types.tv_p(tv) " + "CommonSymbols.NIL != enumeration_types.tv_p(tv) ") + tv;
        return find(tv, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(SECOND), UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject tv_from_asserted_argument_token_alt(SubLObject asserted_argument) {
        return second(find(asserted_argument, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tv_from_asserted_argument_token(final SubLObject asserted_argument) {
        return second(find(asserted_argument, $asserted_argument_tv_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject make_empty_local_support_set_alt() {
        return $list_alt40;
    }

    public static SubLObject make_empty_local_support_set() {
        return $list40;
    }

    public static final SubLObject asserted_argument_equal_alt(SubLObject asserted_argument1, SubLObject asserted_argument2) {
        return eq(asserted_argument1, asserted_argument2);
    }

    public static SubLObject asserted_argument_equal(final SubLObject asserted_argument1, final SubLObject asserted_argument2) {
        return eq(asserted_argument1, asserted_argument2);
    }

    public static final SubLObject asserted_argument_tv_alt(SubLObject asserted_argument) {
        if (NIL != com.cyc.cycjava.cycl.arguments.asserted_argument_token_p(asserted_argument)) {
            return com.cyc.cycjava.cycl.arguments.tv_from_asserted_argument_token(asserted_argument);
        }
        return NIL;
    }

    public static SubLObject asserted_argument_tv(final SubLObject asserted_argument) {
        if (NIL != asserted_argument_token_p(asserted_argument)) {
            return tv_from_asserted_argument_token(asserted_argument);
        }
        return NIL;
    }

    public static final SubLObject asserted_argument_strength_alt(SubLObject asserted_argument) {
        return enumeration_types.tv_strength(com.cyc.cycjava.cycl.arguments.asserted_argument_tv(asserted_argument));
    }

    public static SubLObject asserted_argument_strength(final SubLObject asserted_argument) {
        return enumeration_types.tv_strength(asserted_argument_tv(asserted_argument));
    }

    public static final SubLObject asserted_argument_truth_alt(SubLObject asserted_argument) {
        return enumeration_types.tv_truth(com.cyc.cycjava.cycl.arguments.asserted_argument_tv(asserted_argument));
    }

    public static SubLObject asserted_argument_truth(final SubLObject asserted_argument) {
        return enumeration_types.tv_truth(asserted_argument_tv(asserted_argument));
    }

    public static final SubLObject list_of_cycl_support_p_alt(SubLObject v_object) {
        if (NIL == list_utilities.proper_list_p(v_object)) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = v_object;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.arguments.cycl_support_p(support)) {
                    return NIL;
                }
            }
        }
        return T;
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

    /**
     * Return T iff OBJECT can be canonicalized into a support in an argument.
     */
    @LispMethod(comment = "Return T iff OBJECT can be canonicalized into a support in an argument.")
    public static final SubLObject cycl_support_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || ((((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first()))) && (NIL != possibly_sentence_p(second(v_object)))) && (NIL != hlmt.hlmt_p(third(v_object)))) && (NIL != enumeration_types.el_strength_p(fourth(v_object)))));
    }

    @LispMethod(comment = "Return T iff OBJECT can be canonicalized into a support in an argument.")
    public static SubLObject cycl_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || ((((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first()))) && (NIL != possibly_sentence_p(second(v_object)))) && (NIL != hlmt.hlmt_p(third(v_object)))) && (NIL != enumeration_types.el_strength_p(fourth(v_object)))));
    }

    /**
     * Return T iff OBJECT can be a support in an argument.
     */
    @LispMethod(comment = "Return T iff OBJECT can be a support in an argument.")
    public static final SubLObject support_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) || (NIL != kb_hl_supports.kb_hl_support_p(v_object))) || (NIL != com.cyc.cycjava.cycl.arguments.hl_support_p(v_object)));
    }

    @LispMethod(comment = "Return T iff OBJECT can be a support in an argument.")
    public static SubLObject support_p(final SubLObject v_object) {
        return makeBoolean((NIL != reified_support_p(v_object)) || (NIL != hl_support_p(v_object)));
    }

    public static SubLObject reified_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || (NIL != kb_hl_support_handles.kb_hl_support_p(v_object)));
    }

    public static final SubLObject supports_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.arguments.support_list_p(v_object);
    }

    public static SubLObject supports_p(final SubLObject v_object) {
        return support_list_p(v_object);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a support list
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a support list")
    public static final SubLObject support_list_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(SUPPORT_P, v_object, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a support list
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a support list")
    public static SubLObject support_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(SUPPORT_P, v_object, UNPROVIDED)));
    }

    /**
     * Return T if SUPPORT is a valid kb deduction support.
     * ROBUST requests more thorough checking.
     */
    @LispMethod(comment = "Return T if SUPPORT is a valid kb deduction support.\r\nROBUST requests more thorough checking.\nReturn T if SUPPORT is a valid kb deduction support.\nROBUST requests more thorough checking.")
    public static final SubLObject valid_supportP_alt(SubLObject support, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertion_handles.valid_assertionP(support, UNPROVIDED);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.valid_kb_hl_supportP(support, robust);
            } else {
                if (NIL != com.cyc.cycjava.cycl.arguments.hl_support_p(support)) {
                    return com.cyc.cycjava.cycl.arguments.valid_hl_supportP(support);
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Return T if SUPPORT is a valid kb deduction support.\r\nROBUST requests more thorough checking.\nReturn T if SUPPORT is a valid kb deduction support.\nROBUST requests more thorough checking.")
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

    public static final SubLObject ill_formed_hl_supportP_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return com.cyc.cycjava.cycl.arguments.assertion_syntactically_illformedP(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return com.cyc.cycjava.cycl.arguments.kb_hl_support_syntactically_illformedP(support);
            } else {
                if (NIL != com.cyc.cycjava.cycl.arguments.hl_support_p(support)) {
                    return com.cyc.cycjava.cycl.arguments.hl_support_syntactically_illformedP(support);
                }
            }
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

    /**
     * Return a reason for illformedness IFF HL-SUPPORT's formula is not syntactically well-formed in its Mt.
     */
    @LispMethod(comment = "Return a reason for illformedness IFF HL-SUPPORT\'s formula is not syntactically well-formed in its Mt.")
    public static final SubLObject hl_support_syntactically_illformedP_alt(SubLObject hl_support) {
        {
            SubLObject brokenness = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            if (NIL == wff.el_wff_syntaxP(com.cyc.cycjava.cycl.arguments.hl_support_sentence(hl_support), UNPROVIDED)) {
                                brokenness = $SYNTACTICALLY_ILL_FORMED;
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return brokenness;
        }
    }

    @LispMethod(comment = "Return a reason for illformedness IFF HL-SUPPORT\'s formula is not syntactically well-formed in its Mt.")
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

    /**
     * Return a reason for illformedness IFF KB-HL-SUPPORT's formula is not syntactically well-formed in its Mt.
     */
    @LispMethod(comment = "Return a reason for illformedness IFF KB-HL-SUPPORT\'s formula is not syntactically well-formed in its Mt.")
    public static final SubLObject kb_hl_support_syntactically_illformedP_alt(SubLObject kb_hl_support) {
        {
            SubLObject brokenness = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            if (NIL == wff.el_wff_syntaxP(kb_hl_supports.kb_hl_support_sentence(kb_hl_support), UNPROVIDED)) {
                                brokenness = $SYNTACTICALLY_ILL_FORMED;
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return brokenness;
        }
    }

    @LispMethod(comment = "Return a reason for illformedness IFF KB-HL-SUPPORT\'s formula is not syntactically well-formed in its Mt.")
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

    /**
     * Return a reason for illformedness  IFF ASSERTION's formula is not syntactically well-formed in its Mt.
     */
    @LispMethod(comment = "Return a reason for illformedness  IFF ASSERTION\'s formula is not syntactically well-formed in its Mt.")
    public static final SubLObject assertion_syntactically_illformedP_alt(SubLObject assertion) {
        {
            SubLObject brokenness = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            if (NIL == wff.el_wff_syntaxP(fi.assertion_hl_formula(assertion, UNPROVIDED), UNPROVIDED)) {
                                brokenness = $SYNTACTICALLY_ILL_FORMED;
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                brokenness = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return brokenness;
        }
    }

    @LispMethod(comment = "Return a reason for illformedness  IFF ASSERTION\'s formula is not syntactically well-formed in its Mt.")
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

    public static final SubLObject support_equal_alt(SubLObject support1, SubLObject support2) {
        if ((NIL != assertion_handles.assertion_p(support1)) || (NIL != assertion_handles.assertion_p(support2))) {
            return eq(support1, support2);
        } else {
            if ((NIL != kb_hl_supports.kb_hl_support_p(support1)) || (NIL != kb_hl_supports.kb_hl_support_p(support2))) {
                return eq(support1, support2);
            } else {
                return equal(support1, support2);
            }
        }
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

    /**
     * Imposes an arbitrary but consistent total order between supports.
     */
    @LispMethod(comment = "Imposes an arbitrary but consistent total order between supports.")
    public static final SubLObject support_L_alt(SubLObject support1, SubLObject support2) {
        if (NIL != assertion_handles.assertion_p(support1)) {
            if (NIL != assertion_handles.assertion_p(support2)) {
                if (NIL != assertions_high.rule_assertionP(support1)) {
                    if (NIL != assertions_high.rule_assertionP(support2)) {
                        return numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
                    } else {
                        return T;
                    }
                } else {
                    if (NIL != assertions_high.rule_assertionP(support2)) {
                        return NIL;
                    } else {
                        return numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
                    }
                }
            } else {
                return T;
            }
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support1)) {
                if (NIL != assertion_handles.assertion_p(support2)) {
                    return NIL;
                } else {
                    if (NIL != kb_hl_supports.kb_hl_support_p(support2)) {
                        return numL(kb_hl_supports.kb_hl_support_id(support1), kb_hl_supports.kb_hl_support_id(support2));
                    } else {
                        return T;
                    }
                }
            } else {
                if (NIL != assertion_handles.assertion_p(support2)) {
                    return NIL;
                } else {
                    if (NIL != kb_hl_supports.kb_hl_support_p(support2)) {
                        return NIL;
                    } else {
                        return kb_utilities.term_L(support1, support2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Imposes an arbitrary but consistent total order between supports.")
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

    /**
     * Destructively sort SUPPORTS into a canonical order
     */
    @LispMethod(comment = "Destructively sort SUPPORTS into a canonical order")
    public static final SubLObject sort_supports_alt(SubLObject supports) {
        return Sort.sort(supports, symbol_function($sym54$SUPPORT__), UNPROVIDED);
    }

    @LispMethod(comment = "Destructively sort SUPPORTS into a canonical order")
    public static SubLObject sort_supports(final SubLObject supports) {
        return Sort.sort(supports, symbol_function($sym45$SUPPORT__), UNPROVIDED);
    }

    /**
     * Return the module of SUPPORT.
     */
    @LispMethod(comment = "Return the module of SUPPORT.")
    public static final SubLObject support_module_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return $assertion_support_module$.getGlobalValue();
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_module(support);
            } else {
                return com.cyc.cycjava.cycl.arguments.hl_support_module(support);
            }
        }
    }

    /**
     * Return the module of SUPPORT.
     */
    @LispMethod(comment = "Return the module of SUPPORT.")
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

    /**
     * Return the sentence of SUPPORT.
     */
    @LispMethod(comment = "Return the sentence of SUPPORT.")
    public static final SubLObject support_sentence_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_sentence(support);
            } else {
                return com.cyc.cycjava.cycl.arguments.hl_support_sentence(support);
            }
        }
    }

    /**
     * Return the sentence of SUPPORT.
     */
    @LispMethod(comment = "Return the sentence of SUPPORT.")
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

    /**
     *
     *
     * @return CYCL-TERM-P; the operator of the sentence of SUPPORT.
     */
    @LispMethod(comment = "@return CYCL-TERM-P; the operator of the sentence of SUPPORT.")
    public static final SubLObject support_sentence_operator_alt(SubLObject support) {
        return cycl_utilities.formula_operator(com.cyc.cycjava.cycl.arguments.support_sentence(support));
    }

    /**
     *
     *
     * @return CYCL-TERM-P; the operator of the sentence of SUPPORT.
     */
    @LispMethod(comment = "@return CYCL-TERM-P; the operator of the sentence of SUPPORT.")
    public static SubLObject support_sentence_operator(final SubLObject support) {
        return cycl_utilities.formula_operator(support_sentence(support));
    }

    public static final SubLObject support_formula_alt(SubLObject support) {
        return com.cyc.cycjava.cycl.arguments.support_sentence(support);
    }

    public static SubLObject support_formula(final SubLObject support) {
        return support_sentence(support);
    }

    /**
     * Return the EL sentence of SUPPORT.
     */
    @LispMethod(comment = "Return the EL sentence of SUPPORT.")
    public static final SubLObject support_el_sentence_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_formula(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_el_sentence(support);
            } else {
                return cycl_utilities.hl_to_el(com.cyc.cycjava.cycl.arguments.hl_support_sentence(support));
            }
        }
    }

    @LispMethod(comment = "Return the EL sentence of SUPPORT.")
    public static SubLObject support_el_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_sentence(support);
        }
        return cycl_utilities.hl_to_el(hl_support_sentence(support));
    }

    /**
     * Return the sentence of SUPPORT in #$ist form.
     */
    @LispMethod(comment = "Return the sentence of SUPPORT in #$ist form.")
    public static final SubLObject support_ist_sentence_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_ist_formula(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_ist_sentence(support);
            } else {
                return make_ist_sentence(com.cyc.cycjava.cycl.arguments.hl_support_mt(support), com.cyc.cycjava.cycl.arguments.hl_support_sentence(support));
            }
        }
    }

    @LispMethod(comment = "Return the sentence of SUPPORT in #$ist form.")
    public static SubLObject support_ist_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_ist_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_ist_sentence(support);
        }
        return make_ist_sentence(hl_support_mt(support), hl_support_sentence(support));
    }/**
     * Return the sentence of SUPPORT in #$ist form.
     */


    /**
     * Return the EL sentence of SUPPORT in #$ist form.
     */
    @LispMethod(comment = "Return the EL sentence of SUPPORT in #$ist form.")
    public static final SubLObject support_el_ist_sentence_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_ist_formula(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_el_ist_sentence(support);
            } else {
                return make_ist_sentence(com.cyc.cycjava.cycl.arguments.support_elmt(support), com.cyc.cycjava.cycl.arguments.support_el_sentence(support));
            }
        }
    }

    @LispMethod(comment = "Return the EL sentence of SUPPORT in #$ist form.")
    public static SubLObject support_el_ist_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_ist_formula(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_ist_sentence(support);
        }
        return make_ist_sentence(support_elmt(support), support_el_sentence(support));
    }/**
     * Return the EL sentence of SUPPORT in #$ist form.
     */


    /**
     *
     *
     * @return listp; a cons representing SUPPORT's formula in some form,
    maybe a CNF, maybe a GAF formula, or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing SUPPORT\'s formula in some form,\r\nmaybe a CNF, maybe a GAF formula, or NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static final SubLObject support_cons_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cons(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_cons(support);
            } else {
                return elf_to_list(com.cyc.cycjava.cycl.arguments.hl_support_sentence(support));
            }
        }
    }

    /**
     *
     *
     * @return listp; a cons representing SUPPORT's formula in some form,
    maybe a CNF, maybe a GAF formula, or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing SUPPORT\'s formula in some form,\r\nmaybe a CNF, maybe a GAF formula, or NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static SubLObject support_cons(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cons(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_cons(support);
        }
        return elf_to_list(hl_support_sentence(support));
    }

    /**
     * Return the microtheory of SUPPORT.
     */
    @LispMethod(comment = "Return the microtheory of SUPPORT.")
    public static final SubLObject support_mt_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_mt(support);
            } else {
                return com.cyc.cycjava.cycl.arguments.hl_support_mt(support);
            }
        }
    }

    @LispMethod(comment = "Return the microtheory of SUPPORT.")
    public static SubLObject support_mt(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_mt(support);
        }
        return hl_support_mt(support);
    }/**
     * Return the microtheory of SUPPORT.
     */


    /**
     * Return the EL form of the microtheory of SUPPORT
     */
    @LispMethod(comment = "Return the EL form of the microtheory of SUPPORT")
    public static final SubLObject support_elmt_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_elmt(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_elmt(support);
            } else {
                return cycl_utilities.hl_to_el(com.cyc.cycjava.cycl.arguments.hl_support_mt(support));
            }
        }
    }

    @LispMethod(comment = "Return the EL form of the microtheory of SUPPORT")
    public static SubLObject support_elmt(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_elmt(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_elmt(support);
        }
        return cycl_utilities.hl_to_el(hl_support_mt(support));
    }/**
     * Return the EL form of the microtheory of SUPPORT
     */


    /**
     * Return a justification for SUPPORT.
     */
    @LispMethod(comment = "Return a justification for SUPPORT.")
    public static final SubLObject support_justification_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_justification(support);
            } else {
                return hl_supports.hl_support_justify(support);
            }
        }
    }

    @LispMethod(comment = "Return a justification for SUPPORT.")
    public static SubLObject support_justification(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_justification(support);
        }
        return hl_supports.hl_support_justify(support);
    }/**
     * Return a justification for SUPPORT.
     */


    /**
     * Return the truth of SUPPORT.
     */
    @LispMethod(comment = "Return the truth of SUPPORT.")
    public static final SubLObject support_truth_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        return enumeration_types.tv_truth(com.cyc.cycjava.cycl.arguments.support_tv(support));
    }

    @LispMethod(comment = "Return the truth of SUPPORT.")
    public static SubLObject support_truth(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        return enumeration_types.tv_truth(support_tv(support));
    }/**
     * Return the truth of SUPPORT.
     */


    /**
     * Return the strength of SUPPORT.
     */
    @LispMethod(comment = "Return the strength of SUPPORT.")
    public static final SubLObject support_strength_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        return enumeration_types.tv_strength(com.cyc.cycjava.cycl.arguments.support_tv(support));
    }

    @LispMethod(comment = "Return the strength of SUPPORT.")
    public static SubLObject support_strength(final SubLObject support) {
        SubLTrampolineFile.enforceType(support, SUPPORT_P);
        return enumeration_types.tv_strength(support_tv(support));
    }/**
     * Return the strength of SUPPORT.
     */


    public static final SubLObject support_tv_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.cyc_assertion_tv(support);
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return kb_hl_supports.kb_hl_support_tv(support);
            } else {
                return com.cyc.cycjava.cycl.arguments.hl_support_tv(support);
            }
        }
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

    /**
     * Return a sorted list of canonicalized supports.  This is not destructive.
     */
    @LispMethod(comment = "Return a sorted list of canonicalized supports.  This is not destructive.")
    public static final SubLObject canonicalize_supports_alt(SubLObject supports, SubLObject possibly_create_new_kb_hl_supportsP) {
        if (possibly_create_new_kb_hl_supportsP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportsP = T;
        }
        {
            SubLObject new_supports = NIL;
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                new_supports = cons(com.cyc.cycjava.cycl.arguments.canonicalize_support(support, possibly_create_new_kb_hl_supportsP), new_supports);
            }
            return Sort.sort(new_supports, $sym54$SUPPORT__, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Return a sorted list of canonicalized supports.  This is not destructive.")
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
    }/**
     * Return a sorted list of canonicalized supports.  This is not destructive.
     */


    /**
     * Canonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.
     * Otherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?
     * is non-NIL, it may create a new one.
     */
    @LispMethod(comment = "Canonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.\r\nOtherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?\r\nis non-NIL, it may create a new one.\nCanonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.\nOtherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?\nis non-NIL, it may create a new one.")
    public static final SubLObject canonicalize_support_alt(SubLObject support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = T;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return support;
            } else {
                return com.cyc.cycjava.cycl.arguments.canonicalize_hl_support(support, possibly_create_new_kb_hl_supportP);
            }
        }
    }

    @LispMethod(comment = "Canonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.\r\nOtherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?\r\nis non-NIL, it may create a new one.\nCanonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.\nOtherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?\nis non-NIL, it may create a new one.")
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
    }/**
     * Canonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.
     * Otherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?
     * is non-NIL, it may create a new one.
     */


    public static final SubLObject canonicalize_hl_support_alt(SubLObject hl_support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = T;
        }
        {
            SubLObject canon_support = com.cyc.cycjava.cycl.arguments.assertion_from_hl_support(hl_support);
            if (NIL == canon_support) {
                if (NIL != possibly_create_new_kb_hl_supportP) {
                    canon_support = kb_hl_supports.find_or_possibly_create_kb_hl_support(hl_support);
                } else {
                    canon_support = kb_hl_supports.find_kb_hl_support(hl_support);
                }
            }
            return NIL != canon_support ? ((SubLObject) (canon_support)) : hl_support;
        }
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

    /**
     * Does OBJECT represent an HL support?
     */
    @LispMethod(comment = "Does OBJECT represent an HL support?")
    public static final SubLObject hl_support_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isList() && (NIL != list_utilities.proper_list_p(v_object))) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first())));
    }

    @LispMethod(comment = "Does OBJECT represent an HL support?")
    public static SubLObject hl_support_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && (NIL != list_utilities.proper_list_p(v_object))) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != hl_supports.hl_support_module_p(v_object.first())));
    }/**
     * Does OBJECT represent an HL support?
     */


    /**
     * Construct a new HL support.
     */
    @LispMethod(comment = "Construct a new HL support.")
    public static final SubLObject make_hl_support_alt(SubLObject hl_module, SubLObject sentence, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        SubLTrampolineFile.checkType(hl_module, HL_SUPPORT_MODULE_P);
        SubLTrampolineFile.checkType(sentence, POSSIBLY_CYCL_SENTENCE_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(tv, TV_P);
        return list(hl_module, sentence, mt, tv);
    }

    @LispMethod(comment = "Construct a new HL support.")
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
    }/**
     * Construct a new HL support.
     */


    /**
     * Returns ASSERTION encoded as an HL support
     */
    @LispMethod(comment = "Returns ASSERTION encoded as an HL support")
    public static final SubLObject hl_support_from_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.arguments.support_module(assertion);
            SubLObject formula = com.cyc.cycjava.cycl.arguments.support_formula(assertion);
            SubLObject mt = com.cyc.cycjava.cycl.arguments.support_mt(assertion);
            SubLObject tv = com.cyc.cycjava.cycl.arguments.support_tv(assertion);
            return com.cyc.cycjava.cycl.arguments.make_hl_support(hl_module, formula, mt, tv);
        }
    }

    @LispMethod(comment = "Returns ASSERTION encoded as an HL support")
    public static SubLObject hl_support_from_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject hl_module = support_module(assertion);
        final SubLObject formula = support_formula(assertion);
        final SubLObject mt = support_mt(assertion);
        final SubLObject tv = support_tv(assertion);
        return make_hl_support(hl_module, formula, mt, tv);
    }/**
     * Returns ASSERTION encoded as an HL support
     */


    public static final SubLObject assertion_from_hl_support_alt(SubLObject hl_support) {
        {
            SubLObject assertion = NIL;
            if (com.cyc.cycjava.cycl.arguments.hl_support_module(hl_support) == $assertion_support_module$.getGlobalValue()) {
                assertion = czer_meta.find_assertion_cycl(com.cyc.cycjava.cycl.arguments.hl_support_sentence(hl_support), com.cyc.cycjava.cycl.arguments.hl_support_mt(hl_support));
            }
            return assertion;
        }
    }

    public static SubLObject assertion_from_hl_support(final SubLObject hl_support) {
        SubLObject assertion = NIL;
        if (hl_support_module(hl_support).eql($assertion_support_module$.getGlobalValue())) {
            assertion = czer_meta.find_assertion_cycl(hl_support_sentence(hl_support), hl_support_mt(hl_support));
        }
        return assertion;
    }

    public static final SubLObject valid_hl_supportP_alt(SubLObject hl_support) {
        return makeBoolean(((((((NIL != com.cyc.cycjava.cycl.arguments.hl_support_p(hl_support)) && (NIL != hl_supports.hl_support_module_p(com.cyc.cycjava.cycl.arguments.hl_support_module(hl_support)))) && (NIL != possibly_sentence_p(com.cyc.cycjava.cycl.arguments.hl_support_sentence(hl_support)))) && (NIL == cycl_utilities.expression_find_if($sym84$INVALID_INDEXED_TERM_, com.cyc.cycjava.cycl.arguments.hl_support_sentence(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if($sym84$INVALID_INDEXED_TERM_, com.cyc.cycjava.cycl.arguments.hl_support_mt(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL != hlmt.closed_hlmt_p(com.cyc.cycjava.cycl.arguments.hl_support_mt(hl_support)))) && (NIL != enumeration_types.tv_p(com.cyc.cycjava.cycl.arguments.hl_support_tv(hl_support))));
    }

    public static SubLObject valid_hl_supportP(final SubLObject hl_support) {
        return makeBoolean(((((((NIL != hl_support_p(hl_support)) && (NIL != hl_supports.hl_support_module_p(hl_support_module(hl_support)))) && (NIL != possibly_sentence_p(hl_support_sentence(hl_support)))) && (NIL == cycl_utilities.expression_find_if($sym76$INVALID_INDEXED_TERM_, hl_support_sentence(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if($sym76$INVALID_INDEXED_TERM_, hl_support_mt(hl_support), UNPROVIDED, UNPROVIDED))) && (NIL != hlmt.closed_hlmt_p(hl_support_mt(hl_support)))) && (NIL != enumeration_types.tv_p(hl_support_tv(hl_support))));
    }

    public static final SubLObject hl_support_with_module_p_alt(SubLObject v_object, SubLObject module) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.arguments.hl_support_p(v_object)) && (module == com.cyc.cycjava.cycl.arguments.hl_support_module(v_object)));
    }

    public static SubLObject hl_support_with_module_p(final SubLObject v_object, final SubLObject module) {
        return makeBoolean((NIL != hl_support_p(v_object)) && module.eql(hl_support_module(v_object)));
    }

    public static final SubLObject hl_support_module_alt(SubLObject hl_support) {
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        return hl_support.first();
    }

    public static SubLObject hl_support_module(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        return hl_support.first();
    }

    public static final SubLObject hl_support_sentence_alt(SubLObject hl_support) {
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        return second(hl_support);
    }

    public static SubLObject hl_support_sentence(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        return second(hl_support);
    }

    public static final SubLObject hl_support_mt_alt(SubLObject hl_support) {
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        return third(hl_support);
    }

    public static SubLObject hl_support_mt(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        return third(hl_support);
    }

    public static final SubLObject hl_support_tv_alt(SubLObject hl_support) {
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        return fourth(hl_support);
    }

    public static SubLObject hl_support_tv(final SubLObject hl_support) {
        assert NIL != hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        return fourth(hl_support);
    }

    public static final SubLObject genl_preds_support_p_alt(SubLObject hl_support) {
        return eq(com.cyc.cycjava.cycl.arguments.hl_support_module(hl_support), $GENLPREDS);
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

    public static final SubLObject hl_justification_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static SubLObject hl_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static final SubLObject hl_justification_list_p_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p(HL_JUSTIFICATION_P, v_object);
    }

    public static SubLObject hl_justification_list_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(HL_JUSTIFICATION_P, v_object);
    }

    public static final SubLObject non_empty_hl_justification_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static SubLObject non_empty_hl_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(SUPPORT_P), v_object, UNPROVIDED)));
    }

    public static final SubLObject empty_hl_justification_p_alt(SubLObject v_object) {
        return sublisp_null(v_object);
    }

    public static SubLObject empty_hl_justification_p(final SubLObject v_object) {
        return sublisp_null(v_object);
    }

    public static final SubLObject justification_equal_alt(SubLObject justification1, SubLObject justification2) {
        return list_utilities.multisets_equalP(justification1, justification2, SUPPORT_EQUAL);
    }

    public static SubLObject justification_equal(final SubLObject justification1, final SubLObject justification2) {
        return list_utilities.multisets_equalP(justification1, justification2, SUPPORT_EQUAL);
    }

    public static final SubLObject canonicalize_hl_justification_alt(SubLObject hl_justification) {
        SubLTrampolineFile.checkType(hl_justification, HL_JUSTIFICATION_P);
        return Sort.sort(copy_list(hl_justification), symbol_function($sym54$SUPPORT__), UNPROVIDED);
    }

    public static SubLObject canonicalize_hl_justification(final SubLObject hl_justification) {
        assert NIL != hl_justification_p(hl_justification) : "! arguments.hl_justification_p(hl_justification) " + ("arguments.hl_justification_p(hl_justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(hl_justification) ") + hl_justification;
        return Sort.sort(copy_list(hl_justification), symbol_function($sym45$SUPPORT__), UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is an hl-justification-p made entirely of hl-support-p objects.
     */
    @LispMethod(comment = "Return T iff OBJECT is an hl-justification-p made entirely of hl-support-p objects.")
    public static final SubLObject hl_support_justification_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(HL_SUPPORT_P), v_object, UNPROVIDED)));
    }

    @LispMethod(comment = "Return T iff OBJECT is an hl-justification-p made entirely of hl-support-p objects.")
    public static SubLObject hl_support_justification_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(HL_SUPPORT_P), v_object, UNPROVIDED)));
    }/**
     * Return T iff OBJECT is an hl-justification-p made entirely of hl-support-p objects.
     */


    /**
     * Convert HL-JUSTIFICATION into an hl-support-justification-p
     */
    @LispMethod(comment = "Convert HL-JUSTIFICATION into an hl-support-justification-p")
    public static final SubLObject hl_justification_to_hl_support_justification_alt(SubLObject hl_justification) {
        SubLTrampolineFile.checkType(hl_justification, HL_JUSTIFICATION_P);
        {
            SubLObject supports = NIL;
            SubLObject cdolist_list_var = hl_justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(support)) {
                    support = com.cyc.cycjava.cycl.arguments.hl_support_from_assertion(support);
                }
                supports = cons(support, supports);
            }
            return nreverse(supports);
        }
    }

    /**
     * Convert HL-JUSTIFICATION into an hl-support-justification-p
     */
    @LispMethod(comment = "Convert HL-JUSTIFICATION into an hl-support-justification-p")
    public static SubLObject hl_justification_to_hl_support_justification(final SubLObject hl_justification) {
        assert NIL != hl_justification_p(hl_justification) : "! arguments.hl_justification_p(hl_justification) " + ("arguments.hl_justification_p(hl_justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(hl_justification) ") + hl_justification;
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

    public static final SubLObject declare_arguments_file_alt() {
        declareMacro("do_arguments", "DO-ARGUMENTS");
        declareMacro("do_beliefs", "DO-BELIEFS");
        declareMacro("do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
        declareFunction("argument_p", "ARGUMENT-P", 1, 0, false);
        declareFunction("valid_argument", "VALID-ARGUMENT", 1, 1, false);
        declareFunction("argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction("argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
        declareFunction("argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
        declareFunction("argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
        declareFunction("argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false);
        new com.cyc.cycjava.cycl.arguments.$argument_type_proper_genls$UnaryFunction();
        declareFunction("argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
        declareFunction("argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
        declareFunction("argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
        declareFunction("argument_tv", "ARGUMENT-TV", 1, 0, false);
        declareFunction("argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction("remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
        declareFunction("belief_p", "BELIEF-P", 1, 0, false);
        declareFunction("belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
        declareFunction("belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
        declareFunction("remove_belief", "REMOVE-BELIEF", 2, 0, false);
        declareFunction("belief_equal", "BELIEF-EQUAL", 2, 0, false);
        declareFunction("belief_truth", "BELIEF-TRUTH", 1, 0, false);
        declareFunction("belief_strength", "BELIEF-STRENGTH", 1, 0, false);
        declareFunction("belief_tv", "BELIEF-TV", 1, 0, false);
        declareFunction("asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.arguments.$asserted_argument_p$UnaryFunction();
        declareFunction("asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction("asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction("create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
        declareFunction("kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
        declareFunction("asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
        declareFunction("asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        declareFunction("asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
        declareFunction("tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
        declareFunction("make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
        declareFunction("asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
        declareFunction("asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
        declareFunction("asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction("asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
        declareFunction("kb_lookup_asserted_argument", "KB-LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("lookup_asserted_argument", "LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
        declareFunction("cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
        declareFunction("support_p", "SUPPORT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.arguments.$support_p$UnaryFunction();
        declareFunction("supports_p", "SUPPORTS-P", 1, 0, false);
        declareFunction("support_list_p", "SUPPORT-LIST-P", 1, 0, false);
        declareFunction("valid_supportP", "VALID-SUPPORT?", 1, 1, false);
        declareFunction("ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
        declareFunction("hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("support_equal", "SUPPORT-EQUAL", 2, 0, false);
        new com.cyc.cycjava.cycl.arguments.$support_equal$BinaryFunction();
        declareFunction("support_L", "SUPPORT-<", 2, 0, false);
        new com.cyc.cycjava.cycl.arguments.$support_L$BinaryFunction();
        declareFunction("sort_supports", "SORT-SUPPORTS", 1, 0, false);
        declareFunction("support_module", "SUPPORT-MODULE", 1, 0, false);
        declareFunction("support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
        declareFunction("support_formula", "SUPPORT-FORMULA", 1, 0, false);
        declareFunction("support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
        declareFunction("support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
        declareFunction("support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        declareFunction("support_cons", "SUPPORT-CONS", 1, 0, false);
        declareFunction("support_mt", "SUPPORT-MT", 1, 0, false);
        new com.cyc.cycjava.cycl.arguments.$support_mt$UnaryFunction();
        declareFunction("support_elmt", "SUPPORT-ELMT", 1, 0, false);
        declareFunction("support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
        declareFunction("support_truth", "SUPPORT-TRUTH", 1, 0, false);
        declareFunction("support_strength", "SUPPORT-STRENGTH", 1, 0, false);
        declareFunction("support_tv", "SUPPORT-TV", 1, 0, false);
        declareFunction("canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
        declareFunction("canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
        declareFunction("canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
        declareFunction("hl_support_p", "HL-SUPPORT-P", 1, 0, false);
        declareFunction("make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
        declareFunction("hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
        declareFunction("assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
        declareFunction("valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
        declareFunction("hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
        declareFunction("hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction("hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
        declareFunction("hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
        declareFunction("genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
        declareFunction("hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
        declareFunction("non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false);
        new com.cyc.cycjava.cycl.arguments.$justification_equal$BinaryFunction();
        declareFunction("canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
        declareFunction("hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
        declareFunction("hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_arguments_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_arguments", "DO-ARGUMENTS");
            declareMacro("do_beliefs", "DO-BELIEFS");
            declareMacro("do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
            declareFunction("argument_p", "ARGUMENT-P", 1, 0, false);
            declareFunction("valid_argument", "VALID-ARGUMENT", 1, 1, false);
            declareFunction("argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
            declareFunction("argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
            declareFunction("argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
            declareFunction("argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
            declareFunction("argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
            declareFunction("argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false);
            new arguments.$argument_type_proper_genls$UnaryFunction();
            declareFunction("argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
            declareFunction("argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
            declareFunction("argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
            declareFunction("argument_tv", "ARGUMENT-TV", 1, 0, false);
            declareFunction("argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
            declareFunction("remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
            declareFunction("belief_p", "BELIEF-P", 1, 0, false);
            declareFunction("belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
            declareFunction("belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
            declareFunction("remove_belief", "REMOVE-BELIEF", 2, 0, false);
            declareFunction("belief_equal", "BELIEF-EQUAL", 2, 0, false);
            declareFunction("belief_truth", "BELIEF-TRUTH", 1, 0, false);
            declareFunction("belief_strength", "BELIEF-STRENGTH", 1, 0, false);
            declareFunction("belief_tv", "BELIEF-TV", 1, 0, false);
            declareFunction("asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false);
            new arguments.$asserted_argument_p$UnaryFunction();
            declareFunction("asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
            declareFunction("asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
            declareFunction("create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
            declareFunction("create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
            declareFunction("asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
            declareFunction("kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
            declareFunction("asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
            declareFunction("asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
            declareFunction("asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
            declareFunction("tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
            declareFunction("make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
            declareFunction("asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
            declareFunction("asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
            declareFunction("asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
            declareFunction("asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
            declareFunction("list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
            declareFunction("cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
            declareFunction("support_p", "SUPPORT-P", 1, 0, false);
            new arguments.$support_p$UnaryFunction();
            declareFunction("reified_support_p", "REIFIED-SUPPORT-P", 1, 0, false);
            declareFunction("supports_p", "SUPPORTS-P", 1, 0, false);
            declareFunction("support_list_p", "SUPPORT-LIST-P", 1, 0, false);
            declareFunction("valid_supportP", "VALID-SUPPORT?", 1, 1, false);
            declareFunction("ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
            declareFunction("hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
            declareFunction("kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
            declareFunction("assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
            declareFunction("support_equal", "SUPPORT-EQUAL", 2, 0, false);
            new arguments.$support_equal$BinaryFunction();
            declareFunction("support_L", "SUPPORT-<", 2, 0, false);
            new arguments.$support_L$BinaryFunction();
            declareFunction("sort_supports", "SORT-SUPPORTS", 1, 0, false);
            declareFunction("support_module", "SUPPORT-MODULE", 1, 0, false);
            declareFunction("support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
            declareFunction("support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
            declareFunction("support_formula", "SUPPORT-FORMULA", 1, 0, false);
            declareFunction("support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
            declareFunction("support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
            declareFunction("support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
            declareFunction("support_cons", "SUPPORT-CONS", 1, 0, false);
            declareFunction("support_mt", "SUPPORT-MT", 1, 0, false);
            new arguments.$support_mt$UnaryFunction();
            declareFunction("support_elmt", "SUPPORT-ELMT", 1, 0, false);
            declareFunction("support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
            declareFunction("support_truth", "SUPPORT-TRUTH", 1, 0, false);
            declareFunction("support_strength", "SUPPORT-STRENGTH", 1, 0, false);
            declareFunction("support_tv", "SUPPORT-TV", 1, 0, false);
            declareFunction("hl_support_from_support", "HL-SUPPORT-FROM-SUPPORT", 1, 0, false);
            declareFunction("contextualize_support", "CONTEXTUALIZE-SUPPORT", 2, 0, false);
            declareFunction("canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
            declareFunction("canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
            declareFunction("canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
            declareFunction("hl_support_p", "HL-SUPPORT-P", 1, 0, false);
            declareFunction("make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
            declareFunction("hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
            declareFunction("assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
            declareFunction("valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
            declareFunction("hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
            declareFunction("hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
            declareFunction("hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
            declareFunction("hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
            declareFunction("hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
            declareFunction("genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
            declareFunction("contextualize_hl_support", "CONTEXTUALIZE-HL-SUPPORT", 2, 0, false);
            declareFunction("hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
            declareFunction("hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
            declareFunction("non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
            declareFunction("empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
            declareFunction("justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false);
            new arguments.$justification_equal$BinaryFunction();
            declareFunction("canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
            declareFunction("hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
            declareFunction("hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
            declareFunction("reified_support_has_dependent_with_supportP", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
            declareFunction("reified_support_has_dependent_with_supportP_kb_hl_support_aware_version", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("kb_lookup_asserted_argument", "KB-LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
            declareFunction("lookup_asserted_argument", "LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_arguments_file_Previous() {
        declareMacro("do_arguments", "DO-ARGUMENTS");
        declareMacro("do_beliefs", "DO-BELIEFS");
        declareMacro("do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
        declareFunction("argument_p", "ARGUMENT-P", 1, 0, false);
        declareFunction("valid_argument", "VALID-ARGUMENT", 1, 1, false);
        declareFunction("argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction("argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
        declareFunction("argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
        declareFunction("argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
        declareFunction("argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false);
        new arguments.$argument_type_proper_genls$UnaryFunction();
        declareFunction("argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
        declareFunction("argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
        declareFunction("argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
        declareFunction("argument_tv", "ARGUMENT-TV", 1, 0, false);
        declareFunction("argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction("remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
        declareFunction("belief_p", "BELIEF-P", 1, 0, false);
        declareFunction("belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
        declareFunction("belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
        declareFunction("remove_belief", "REMOVE-BELIEF", 2, 0, false);
        declareFunction("belief_equal", "BELIEF-EQUAL", 2, 0, false);
        declareFunction("belief_truth", "BELIEF-TRUTH", 1, 0, false);
        declareFunction("belief_strength", "BELIEF-STRENGTH", 1, 0, false);
        declareFunction("belief_tv", "BELIEF-TV", 1, 0, false);
        declareFunction("asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false);
        new arguments.$asserted_argument_p$UnaryFunction();
        declareFunction("asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
        declareFunction("asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction("create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        declareFunction("asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
        declareFunction("kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
        declareFunction("asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
        declareFunction("asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        declareFunction("asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
        declareFunction("tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
        declareFunction("make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
        declareFunction("asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
        declareFunction("asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
        declareFunction("asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
        declareFunction("asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
        declareFunction("list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
        declareFunction("cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
        declareFunction("support_p", "SUPPORT-P", 1, 0, false);
        new arguments.$support_p$UnaryFunction();
        declareFunction("reified_support_p", "REIFIED-SUPPORT-P", 1, 0, false);
        declareFunction("supports_p", "SUPPORTS-P", 1, 0, false);
        declareFunction("support_list_p", "SUPPORT-LIST-P", 1, 0, false);
        declareFunction("valid_supportP", "VALID-SUPPORT?", 1, 1, false);
        declareFunction("ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
        declareFunction("hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        declareFunction("support_equal", "SUPPORT-EQUAL", 2, 0, false);
        new arguments.$support_equal$BinaryFunction();
        declareFunction("support_L", "SUPPORT-<", 2, 0, false);
        new arguments.$support_L$BinaryFunction();
        declareFunction("sort_supports", "SORT-SUPPORTS", 1, 0, false);
        declareFunction("support_module", "SUPPORT-MODULE", 1, 0, false);
        declareFunction("support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
        declareFunction("support_formula", "SUPPORT-FORMULA", 1, 0, false);
        declareFunction("support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
        declareFunction("support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
        declareFunction("support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        declareFunction("support_cons", "SUPPORT-CONS", 1, 0, false);
        declareFunction("support_mt", "SUPPORT-MT", 1, 0, false);
        new arguments.$support_mt$UnaryFunction();
        declareFunction("support_elmt", "SUPPORT-ELMT", 1, 0, false);
        declareFunction("support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
        declareFunction("support_truth", "SUPPORT-TRUTH", 1, 0, false);
        declareFunction("support_strength", "SUPPORT-STRENGTH", 1, 0, false);
        declareFunction("support_tv", "SUPPORT-TV", 1, 0, false);
        declareFunction("hl_support_from_support", "HL-SUPPORT-FROM-SUPPORT", 1, 0, false);
        declareFunction("contextualize_support", "CONTEXTUALIZE-SUPPORT", 2, 0, false);
        declareFunction("canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
        declareFunction("canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
        declareFunction("canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
        declareFunction("hl_support_p", "HL-SUPPORT-P", 1, 0, false);
        declareFunction("make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
        declareFunction("hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
        declareFunction("assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
        declareFunction("valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
        declareFunction("hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
        declareFunction("hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction("hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
        declareFunction("hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
        declareFunction("genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
        declareFunction("contextualize_hl_support", "CONTEXTUALIZE-HL-SUPPORT", 2, 0, false);
        declareFunction("hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
        declareFunction("non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        declareFunction("justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false);
        new arguments.$justification_equal$BinaryFunction();
        declareFunction("canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
        declareFunction("hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
        declareFunction("hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        declareFunction("reified_support_has_dependent_with_supportP", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        declareFunction("reified_support_has_dependent_with_supportP_kb_hl_support_aware_version", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
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

    public static final SubLObject setup_arguments_file_alt() {
        register_cyc_api_function(ARGUMENT_P, $list_alt14, $str_alt15$Return_T_iff_OBJECT_is_an_HL_argu, NIL, $list_alt16);
        register_cyc_api_function(ARGUMENT_EQUAL, $list_alt22, $str_alt23$Return_T_iff_ARGUMENT1_and_ARGUME, NIL, $list_alt16);
        register_cyc_api_function(ARGUMENT_TRUTH, $list_alt25, $str_alt26$Return_the_truth_of_ARGUMENT_, $list_alt27, $list_alt28);
        register_cyc_api_function(ARGUMENT_STRENGTH, $list_alt25, $str_alt30$Return_the_strength_of_ARGUMENT_, $list_alt27, $list_alt31);
        register_cyc_api_function(ASSERTED_ARGUMENT_P, $list_alt14, $str_alt33$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list_alt16);
        register_cyc_api_function(KB_LOOKUP_ASSERTED_ARGUMENT, $list_alt46, $str_alt47$Return_the_asserted_argument_with, $list_alt48, $list_alt49);
        register_cyc_api_function(SUPPORT_P, $list_alt14, $str_alt51$Return_T_iff_OBJECT_can_be_a_supp, NIL, $list_alt16);
        register_cyc_api_function(SUPPORT_MODULE, $list_alt57, $str_alt58$Return_the_module_of_SUPPORT_, $list_alt59, $list_alt60);
        register_cyc_api_function(SUPPORT_SENTENCE, $list_alt57, $str_alt62$Return_the_sentence_of_SUPPORT_, $list_alt59, $list_alt63);
        define_obsolete_register(SUPPORT_FORMULA, $list_alt65);
        register_cyc_api_function(SUPPORT_MT, $list_alt57, $str_alt67$Return_the_microtheory_of_SUPPORT, $list_alt59, $list_alt68);
        register_cyc_api_function(SUPPORT_TRUTH, $list_alt57, $str_alt70$Return_the_truth_of_SUPPORT_, $list_alt59, $list_alt28);
        register_cyc_api_function(SUPPORT_STRENGTH, $list_alt57, $str_alt72$Return_the_strength_of_SUPPORT_, $list_alt59, $list_alt31);
        register_cyc_api_function(HL_SUPPORT_P, $list_alt14, $str_alt74$Does_OBJECT_represent_an_HL_suppo, NIL, $list_alt16);
        register_cyc_api_function(MAKE_HL_SUPPORT, $list_alt80, $str_alt81$Construct_a_new_HL_support_, $list_alt82, $list_alt83);
        return NIL;
    }

    public static SubLObject setup_arguments_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(KB_LOOKUP_ASSERTED_ARGUMENT, $list_alt46, $str_alt47$Return_the_asserted_argument_with, $list_alt48, $list_alt49);
            register_cyc_api_function(SUPPORT_P, $list_alt14, $str_alt51$Return_T_iff_OBJECT_can_be_a_supp, NIL, $list_alt16);
            register_cyc_api_function(SUPPORT_MODULE, $list_alt57, $str_alt58$Return_the_module_of_SUPPORT_, $list_alt59, $list_alt60);
            register_cyc_api_function(SUPPORT_SENTENCE, $list_alt57, $str_alt62$Return_the_sentence_of_SUPPORT_, $list_alt59, $list_alt63);
            define_obsolete_register(SUPPORT_FORMULA, $list_alt65);
            register_cyc_api_function(SUPPORT_MT, $list_alt57, $str_alt67$Return_the_microtheory_of_SUPPORT, $list_alt59, $list_alt68);
            register_cyc_api_function(SUPPORT_TRUTH, $list_alt57, $str_alt70$Return_the_truth_of_SUPPORT_, $list_alt59, $list_alt28);
            register_cyc_api_function(SUPPORT_STRENGTH, $list_alt57, $str_alt72$Return_the_strength_of_SUPPORT_, $list_alt59, $list_alt31);
            register_cyc_api_function(HL_SUPPORT_P, $list_alt14, $str_alt74$Does_OBJECT_represent_an_HL_suppo, NIL, $list_alt16);
            register_cyc_api_function(MAKE_HL_SUPPORT, $list_alt80, $str_alt81$Construct_a_new_HL_support_, $list_alt82, $list_alt83);
        }
        return NIL;
    }

    public static SubLObject setup_arguments_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc belief arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_arguments_file();
    }

    static private final SubLList $list_alt10 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc asserted arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void initializeVariables() {
        init_arguments_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_arguments_file();
    }

    static {
    }

    static private final SubLList $list_alt14 = list(makeSymbol("OBJECT"));

    public static final class $argument_type_proper_genls$UnaryFunction extends UnaryFunction {
        public $argument_type_proper_genls$UnaryFunction() {
            super(extractFunctionNamed("ARGUMENT-TYPE-PROPER-GENLS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return argument_type_proper_genls(arg1);
        }
    }

    static private final SubLString $str_alt15$Return_T_iff_OBJECT_is_an_HL_argu = makeString("Return T iff OBJECT is an HL argument structure.");

    static private final SubLList $list_alt16 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt18 = list(makeKeyword("ARGUMENT"), makeKeyword("BELIEF"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("DEDUCTION"));

    public static final class $asserted_argument_p$UnaryFunction extends UnaryFunction {
        public $asserted_argument_p$UnaryFunction() {
            super(extractFunctionNamed("ASSERTED-ARGUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return asserted_argument_p(arg1);
        }
    }

    static private final SubLList $list_alt19 = list(list(makeKeyword("ARGUMENT"), NIL), list(makeKeyword("BELIEF"), list(makeKeyword("ARGUMENT"))), list(makeKeyword("ASSERTED-ARGUMENT"), list(makeKeyword("BELIEF"))), list(makeKeyword("DEDUCTION"), list(makeKeyword("ARGUMENT"))));

    public static final class $support_p$UnaryFunction extends UnaryFunction {
        public $support_p$UnaryFunction() {
            super(extractFunctionNamed("SUPPORT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return support_p(arg1);
        }
    }

    static private final SubLList $list_alt22 = list(makeSymbol("ARGUMENT1"), makeSymbol("ARGUMENT2"));

    public static final class $support_equal$BinaryFunction extends BinaryFunction {
        public $support_equal$BinaryFunction() {
            super(extractFunctionNamed("SUPPORT-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return support_equal(arg1, arg2);
        }
    }

    static private final SubLString $str_alt23$Return_T_iff_ARGUMENT1_and_ARGUME = makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.");

    static private final SubLList $list_alt25 = list(makeSymbol("ARGUMENT"));

    static private final SubLString $str_alt26$Return_the_truth_of_ARGUMENT_ = makeString("Return the truth of ARGUMENT.");

    public static final class $support_L$BinaryFunction extends BinaryFunction {
        public $support_L$BinaryFunction() {
            super(extractFunctionNamed("SUPPORT-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return support_L(arg1, arg2);
        }
    }

    static private final SubLList $list_alt27 = list(list(makeSymbol("ARGUMENT"), makeSymbol("ARGUMENT-P")));

    static private final SubLList $list_alt28 = list(makeSymbol("TRUTH-P"));

    public static final class $support_mt$UnaryFunction extends UnaryFunction {
        public $support_mt$UnaryFunction() {
            super(extractFunctionNamed("SUPPORT-MT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return support_mt(arg1);
        }
    }

    static private final SubLString $str_alt30$Return_the_strength_of_ARGUMENT_ = makeString("Return the strength of ARGUMENT.");

    static private final SubLList $list_alt31 = list(makeSymbol("EL-STRENGTH-P"));

    public static final class $justification_equal$BinaryFunction extends BinaryFunction {
        public $justification_equal$BinaryFunction() {
            super(extractFunctionNamed("JUSTIFICATION-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return justification_equal(arg1, arg2);
        }
    }

    static private final SubLString $str_alt33$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL asserted argument structure.");

    static private final SubLList $list_alt36 = list(list(makeKeyword("ASSERTED-TRUE-MON"), makeKeyword("TRUE-MON")), list(makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("TRUE-DEF")), list(makeKeyword("ASSERTED-UNKNOWN"), makeKeyword("UNKNOWN")), list(makeKeyword("ASSERTED-FALSE-DEF"), makeKeyword("FALSE-DEF")), list(makeKeyword("ASSERTED-FALSE-MON"), makeKeyword("FALSE-MON")));

    static private final SubLList $list_alt40 = list(makeKeyword("LOCAL"));

    private static final SubLSymbol KB_LOOKUP_ASSERTED_ARGUMENT = makeSymbol("KB-LOOKUP-ASSERTED-ARGUMENT");

    static private final SubLList $list_alt46 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("STRENGTH"));

    static private final SubLString $str_alt47$Return_the_asserted_argument_with = makeString("Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\n   Return NIL otherwise.");

    static private final SubLList $list_alt48 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")), list(makeSymbol("STRENGTH"), makeSymbol("EL-STRENGTH-P")));

    static private final SubLList $list_alt49 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTED-ARGUMENT-P")));

    static private final SubLString $str_alt51$Return_T_iff_OBJECT_can_be_a_supp = makeString("Return T iff OBJECT can be a support in an argument.");

    static private final SubLSymbol $sym54$SUPPORT__ = makeSymbol("SUPPORT-<");

    static private final SubLList $list_alt57 = list(makeSymbol("SUPPORT"));

    static private final SubLString $str_alt58$Return_the_module_of_SUPPORT_ = makeString("Return the module of SUPPORT.");

    static private final SubLList $list_alt59 = list(list(makeSymbol("SUPPORT"), makeSymbol("SUPPORT-P")));

    static private final SubLList $list_alt60 = list(makeSymbol("HL-SUPPORT-MODULE-P"));

    static private final SubLString $str_alt62$Return_the_sentence_of_SUPPORT_ = makeString("Return the sentence of SUPPORT.");

    static private final SubLList $list_alt63 = list(makeSymbol("CONSP"));

    static private final SubLList $list_alt65 = list(makeSymbol("SUPPORT-SENTENCE"));

    static private final SubLString $str_alt67$Return_the_microtheory_of_SUPPORT = makeString("Return the microtheory of SUPPORT.");

    static private final SubLList $list_alt68 = list(makeSymbol("HLMT-P"));

    static private final SubLString $str_alt70$Return_the_truth_of_SUPPORT_ = makeString("Return the truth of SUPPORT.");

    static private final SubLString $str_alt72$Return_the_strength_of_SUPPORT_ = makeString("Return the strength of SUPPORT.");

    static private final SubLString $str_alt74$Does_OBJECT_represent_an_HL_suppo = makeString("Does OBJECT represent an HL support?");

    static private final SubLList $list_alt80 = list(makeSymbol("HL-MODULE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")));

    static private final SubLString $str_alt81$Construct_a_new_HL_support_ = makeString("Construct a new HL support.");

    static private final SubLList $list_alt82 = list(list(makeSymbol("HL-MODULE"), makeSymbol("HL-SUPPORT-MODULE-P")), list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-CYCL-SENTENCE-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("TV"), makeSymbol("TV-P")));

    static private final SubLList $list_alt83 = list(makeSymbol("HL-SUPPORT-P"));

    static private final SubLSymbol $sym84$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");
}

/**
 * Total time: 324 ms
 */
