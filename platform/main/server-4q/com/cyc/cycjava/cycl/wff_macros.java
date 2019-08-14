/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wff_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new wff_macros();

 public static final String myName = "com.cyc.cycjava.cycl.wff_macros";


    static private final SubLList $list1 = list(list(makeSymbol("*WITHIN-WFF?*"), T));

    static private final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_formula$ = makeSymbol("*WFF-FORMULA*");

    public static final SubLSymbol $wff_original_formula$ = makeSymbol("*WFF-ORIGINAL-FORMULA*");

    static private final SubLList $list6 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-ORIGINAL-FORMULA")));

    static private final SubLList $list7 = list(makeSymbol("WFF-ORIGINAL-FORMULA"));

    static private final SubLList $list8 = list(makeSymbol("EXPANSION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_expansion_formula$ = makeSymbol("*WFF-EXPANSION-FORMULA*");

    static private final SubLList $list10 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-EXPANSION-FORMULA")));

    static private final SubLList $list11 = list(makeSymbol("WFF-EXPANSION-FORMULA"));

    static private final SubLList $list12 = list(makeSymbol("STATE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_memoization_state$ = makeSymbol("*WFF-MEMOIZATION-STATE*");

    static private final SubLList $list15 = list(makeSymbol("*WFF-MEMOIZATION-STATE*"));

    static private final SubLList $list16 = list(makeSymbol("PUNLESS"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("RESET-WFF-STATE")));

    private static final SubLSymbol WITH_SPECIFIED_WFF_MEMOIZATION_STATE = makeSymbol("WITH-SPECIFIED-WFF-MEMOIZATION-STATE");

    static private final SubLList $list18 = list(makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE"));

    private static final SubLSymbol POSSIBLY_NEW_WFF_MEMOIZATION_STATE = makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_WFF_MEMOIZATION_STATE = makeSymbol("WITH-WFF-MEMOIZATION-STATE");

    private static final SubLString $$$wff_memoization_state = makeString("wff memoization state");

    private static final SubLSymbol $unexpanded_formula$ = makeSymbol("*UNEXPANDED-FORMULA*");

    static private final SubLList $list23 = list(list(makeSymbol("*VALIDATE-EXPANSIONS?*"), NIL), list(makeSymbol("*VALIDATING-EXPANSION?*"), T));

    private static final SubLList $list24 = list(list(makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*"), NIL));

    private static final SubLSymbol VALIDATING_EXPANSION_OF = makeSymbol("VALIDATING-EXPANSION-OF");

    private static final SubLList $list26 = list(makeSymbol("VARIABLE"), makeSymbol("KEYWORD"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("VACCESS"), list(QUOTE, makeSymbol("PROTECTED"))));

    private static final SubLSymbol SELF_EVALUATING_FORM_P = makeSymbol("SELF-EVALUATING-FORM-P");

    private static final SubLSymbol VACCESS = makeSymbol("VACCESS");

    private static final SubLSymbol NOTE_WFF_PROPERTY = makeSymbol("NOTE-WFF-PROPERTY");

    private static final SubLList $list38 = list(makeSymbol("PROPERTIES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$WFF_SVS = makeUninternedSymbol("WFF-SVS");

    private static final SubLSymbol NEW_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("NEW-WFF-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol WITH_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-WFF-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol WITH_WFF_PROPERTIES = makeSymbol("WITH-WFF-PROPERTIES");

    static private final SubLList $list43 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"));

    private static final SubLList $list44 = list(makeSymbol("WFF-SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym45$SVS = makeUninternedSymbol("SVS");

    private static final SubLSymbol $wff_properties$ = makeSymbol("*WFF-PROPERTIES*");

    private static final SubLSymbol WITH_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-SPECIAL-VARIABLE-STATE");

    private static final SubLList $list48 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("STRICT")));

    private static final SubLList $list49 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("ASSERTIVE")));

    private static final SubLList $list50 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("LENIENT")));

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    public static final SubLObject within_wff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    // Definitions
    public static SubLObject within_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    /**
     *
     *
     * @return boolean; t iff currently within wff checking
     */
    @LispMethod(comment = "@return boolean; t iff currently within wff checking")
    public static final SubLObject within_wffP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_vars.$within_wffP$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return boolean; t iff currently within wff checking
     */
    @LispMethod(comment = "@return boolean; t iff currently within wff checking")
    public static SubLObject within_wffP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$within_wffP$.getDynamicValue(thread);
    }

    public static final SubLObject with_wff_formula_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject formula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            formula = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($wff_formula$, formula), list($wff_original_formula$, list(FIF, $list_alt6, $list_alt7, formula))), append(body, NIL));
            }
        }
    }

    public static SubLObject with_wff_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        formula = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($wff_formula$, formula), list($wff_original_formula$, list(FIF, $list6, $list7, formula))), append(body, NIL));
    }

    public static final SubLObject with_wff_expansion_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject expansion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            expansion = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($wff_expansion_formula$, list(FIF, $list_alt10, $list_alt11, expansion))), append(body, NIL));
            }
        }
    }

    public static SubLObject with_wff_expansion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject expansion = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        expansion = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($wff_expansion_formula$, list(FIF, $list10, $list11, expansion))), append(body, NIL));
    }

    public static final SubLObject with_specified_wff_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject state = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            state = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, list(list($wff_memoization_state$, state)), listS(WITH_MEMOIZATION_STATE, $list_alt15, $list_alt16, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_specified_wff_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        state = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list(list($wff_memoization_state$, state)), listS(WITH_MEMOIZATION_STATE, $list15, $list16, append(body, NIL)));
    }

    public static final SubLObject with_wff_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SPECIFIED_WFF_MEMOIZATION_STATE, $list_alt18, append(body, NIL));
        }
    }

    public static SubLObject with_wff_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SPECIFIED_WFF_MEMOIZATION_STATE, $list18, append(body, NIL));
    }

    public static final SubLObject possibly_new_wff_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != wff_vars.$wff_memoization_state$.getDynamicValue(thread) ? ((SubLObject) (wff_vars.$wff_memoization_state$.getDynamicValue(thread))) : memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject possibly_new_wff_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != wff_vars.$wff_memoization_state$.getDynamicValue(thread) ? wff_vars.$wff_memoization_state$.getDynamicValue(thread) : memoization_state.new_memoization_state($$$wff_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * execute BODY while maintaining wf-expansion-handling state
     */
    @LispMethod(comment = "execute BODY while maintaining wf-expansion-handling state")
    public static final SubLObject validating_expansion_of_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject formula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            formula = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, bq_cons(list($unexpanded_formula$, formula), $list_alt22), append(body, NIL));
            }
        }
    }

    /**
     * execute BODY while maintaining wf-expansion-handling state
     */
    @LispMethod(comment = "execute BODY while maintaining wf-expansion-handling state")
    public static SubLObject validating_expansion_of(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        formula = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, bq_cons(list($unexpanded_formula$, formula), $list23), append(body, NIL));
    }

    /**
     * execute BODY while maintaining wf-expansion-handling state
     */
    @LispMethod(comment = "execute BODY while maintaining wf-expansion-handling state")
    public static final SubLObject validating_expansion_of_nat_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject formula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            formula = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt23, listS(VALIDATING_EXPANSION_OF, formula, append(body, NIL)));
            }
        }
    }

    /**
     * execute BODY while maintaining wf-expansion-handling state
     */
    @LispMethod(comment = "execute BODY while maintaining wf-expansion-handling state")
    public static SubLObject validating_expansion_of_nat(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        formula = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list24, listS(VALIDATING_EXPANSION_OF, formula, append(body, NIL)));
    }

    /**
     * If VARIABLE is non-nil, defines it as a defparameter.
     * Regardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and
     * attaches the information of (VARIABLE INITIALIZATION) to it.
     *
     * @unknown evaluates INITIALIZATION twice due to a translator bug with defparameter-wff
     */
    @LispMethod(comment = "If VARIABLE is non-nil, defines it as a defparameter.\r\nRegardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and\r\nattaches the information of (VARIABLE INITIALIZATION) to it.\r\n\r\n@unknown evaluates INITIALIZATION twice due to a translator bug with defparameter-wff\nIf VARIABLE is non-nil, defines it as a defparameter.\nRegardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and\nattaches the information of (VARIABLE INITIALIZATION) to it.")
    public static final SubLObject defparameter_wff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject keyword = NIL;
            SubLObject initialization = NIL;
            SubLObject documentation = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            initialization = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            documentation = current.first();
            current = current.rest();
            {
                SubLObject vaccess = (current.isCons()) ? ((SubLObject) (current.first())) : PROTECTED;
                destructuring_bind_must_listp(current, datum, $list_alt25);
                current = current.rest();
                if (NIL == current) {
                    if (NIL != variable) {
                        SubLTrampolineFile.checkType(variable, SYMBOLP);
                    }
                    SubLTrampolineFile.checkType(keyword, KEYWORDP);
                    SubLTrampolineFile.checkType(initialization, SELF_EVALUATING_FORM_P);
                    SubLTrampolineFile.checkType(documentation, STRINGP);
                    SubLTrampolineFile.checkType(vaccess, SYMBOLP);
                    if (NIL != variable) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, vaccess, variable))), list(DEFPARAMETER, variable, initialization, documentation), list(NOTE_WFF_PROPERTY, keyword, list(QUOTE, variable), initialization));
                    } else {
                        return list(NOTE_WFF_PROPERTY, keyword, NIL, initialization);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt25);
                }
            }
        }
        return NIL;
    }

    /**
     * If VARIABLE is non-nil, defines it as a defparameter.
     * Regardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and
     * attaches the information of (VARIABLE INITIALIZATION) to it.
     *
     * @unknown evaluates INITIALIZATION twice due to a translator bug with defparameter-wff
     */
    @LispMethod(comment = "If VARIABLE is non-nil, defines it as a defparameter.\r\nRegardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and\r\nattaches the information of (VARIABLE INITIALIZATION) to it.\r\n\r\n@unknown evaluates INITIALIZATION twice due to a translator bug with defparameter-wff\nIf VARIABLE is non-nil, defines it as a defparameter.\nRegardless of whether VARIABLE is NIL, registers KEYWORD as a valid wff-property-p and\nattaches the information of (VARIABLE INITIALIZATION) to it.")
    public static SubLObject defparameter_wff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject keyword = NIL;
        SubLObject initialization = NIL;
        SubLObject documentation = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        initialization = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        documentation = current.first();
        current = current.rest();
        final SubLObject vaccess = (current.isCons()) ? current.first() : PROTECTED;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list26);
            return NIL;
        }
        if (((NIL != variable) && (!assertionsDisabledSynth)) && (NIL == symbolp(variable))) {
            throw new AssertionError(variable);
        }
        assert NIL != keywordp(keyword) : "! keywordp(keyword) " + ("Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) ") + keyword;
        assert NIL != list_utilities.self_evaluating_form_p(initialization) : "! list_utilities.self_evaluating_form_p(initialization) " + ("list_utilities.self_evaluating_form_p(initialization) " + "CommonSymbols.NIL != list_utilities.self_evaluating_form_p(initialization) ") + initialization;
        assert NIL != stringp(documentation) : "! stringp(documentation) " + ("Types.stringp(documentation) " + "CommonSymbols.NIL != Types.stringp(documentation) ") + documentation;
        assert NIL != symbolp(vaccess) : "! symbolp(vaccess) " + ("Types.symbolp(vaccess) " + "CommonSymbols.NIL != Types.symbolp(vaccess) ") + vaccess;
        if (NIL != variable) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, vaccess, variable))), list(DEFPARAMETER, variable, initialization, documentation), list(NOTE_WFF_PROPERTY, keyword, list(QUOTE, variable), initialization));
        }
        return list(NOTE_WFF_PROPERTY, keyword, NIL, initialization);
    }

    public static final SubLObject with_wff_properties_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_properties = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            v_properties = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject wff_svs = $sym38$WFF_SVS;
                return list(CLET, list(list(wff_svs, list(NEW_WFF_SPECIAL_VARIABLE_STATE, v_properties))), listS(WITH_WFF_SPECIAL_VARIABLE_STATE, wff_svs, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_wff_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        v_properties = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject wff_svs = $sym39$WFF_SVS;
        return list(CLET, list(list(wff_svs, list(NEW_WFF_SPECIAL_VARIABLE_STATE, v_properties))), listS(WITH_WFF_SPECIAL_VARIABLE_STATE, wff_svs, append(body, NIL)));
    }

    public static final SubLObject new_wff_special_variable_state_alt(SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            wff_vars.check_wff_properties(v_properties);
            {
                SubLObject svs = special_variable_state.new_special_variable_state(NIL);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(wff_vars.wff_properties_table()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject indicator = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject data = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject datum = data;
                            SubLObject current = datum;
                            SubLObject var = NIL;
                            SubLObject v_default = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt42);
                            var = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt42);
                            v_default = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != var) {
                                    {
                                        SubLObject desired_value = getf(v_properties, indicator, v_default);
                                        if (!desired_value.equal(v_default)) {
                                            special_variable_state.special_variable_state_push(svs, var, desired_value);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt42);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return svs;
            }
        }
    }

    public static SubLObject new_wff_special_variable_state(final SubLObject v_properties) {
        wff_vars.check_wff_properties(v_properties);
        final SubLObject svs = special_variable_state.new_special_variable_state(NIL);
        SubLObject remainder;
        SubLObject property;
        SubLObject desired_value;
        SubLObject data;
        SubLObject current;
        SubLObject datum;
        SubLObject var;
        SubLObject v_default;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            desired_value = cadr(remainder);
            data = dictionary.dictionary_lookup_without_values(wff_vars.wff_properties_table(), property, UNPROVIDED);
            datum = current = data;
            var = NIL;
            v_default = NIL;
            destructuring_bind_must_consp(current, datum, $list43);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list43);
            v_default = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != var) {
                    special_variable_state.special_variable_state_push(svs, var, desired_value);
                }
            } else {
                cdestructuring_bind_error(datum, $list43);
            }
        }
        return svs;
    }

    public static final SubLObject with_wff_special_variable_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject wff_svs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            wff_svs = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject svs = $sym44$SVS;
                return list(CLET, list(list(svs, wff_svs), list($wff_properties$, svs)), listS(WITH_SPECIAL_VARIABLE_STATE, svs, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_wff_special_variable_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject wff_svs = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        wff_svs = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject svs = $sym45$SVS;
        return list(CLET, list(list(svs, wff_svs), list($wff_properties$, svs)), listS(WITH_SPECIAL_VARIABLE_STATE, svs, append(body, NIL)));
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("*WITHIN-WFF?*"), T));

    static private final SubLList $list_alt2 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-ORIGINAL-FORMULA")));

    public static SubLObject with_strict_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list48, append(body, NIL));
    }

    static private final SubLList $list_alt7 = list(makeSymbol("WFF-ORIGINAL-FORMULA"));

    static private final SubLList $list_alt8 = list(makeSymbol("EXPANSION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject with_assertive_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list49, append(body, NIL));
    }

    static private final SubLList $list_alt10 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-EXPANSION-FORMULA")));

    static private final SubLList $list_alt11 = list(makeSymbol("WFF-EXPANSION-FORMULA"));

    static private final SubLList $list_alt12 = list(makeSymbol("STATE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject with_lenient_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list50, append(body, NIL));
    }

    static private final SubLList $list_alt15 = list(makeSymbol("*WFF-MEMOIZATION-STATE*"));

    static private final SubLList $list_alt16 = list(makeSymbol("PUNLESS"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("RESET-WFF-STATE")));

    public static SubLObject declare_wff_macros_file() {
        declareMacro("within_wff", "WITHIN-WFF");
        declareFunction("within_wffP", "WITHIN-WFF?", 0, 0, false);
        declareMacro("with_wff_formula", "WITH-WFF-FORMULA");
        declareMacro("with_wff_expansion", "WITH-WFF-EXPANSION");
        declareMacro("with_specified_wff_memoization_state", "WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
        declareMacro("with_wff_memoization_state", "WITH-WFF-MEMOIZATION-STATE");
        declareFunction("possibly_new_wff_memoization_state", "POSSIBLY-NEW-WFF-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("validating_expansion_of", "VALIDATING-EXPANSION-OF");
        declareMacro("validating_expansion_of_nat", "VALIDATING-EXPANSION-OF-NAT");
        declareMacro("defparameter_wff", "DEFPARAMETER-WFF");
        declareMacro("with_wff_properties", "WITH-WFF-PROPERTIES");
        declareFunction("new_wff_special_variable_state", "NEW-WFF-SPECIAL-VARIABLE-STATE", 1, 0, false);
        declareMacro("with_wff_special_variable_state", "WITH-WFF-SPECIAL-VARIABLE-STATE");
        declareMacro("with_strict_wff", "WITH-STRICT-WFF");
        declareMacro("with_assertive_wff", "WITH-ASSERTIVE-WFF");
        declareMacro("with_lenient_wff", "WITH-LENIENT-WFF");
        return NIL;
    }

    static private final SubLList $list_alt18 = list(makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE"));

    static private final SubLList $list_alt22 = list(list(makeSymbol("*VALIDATE-EXPANSIONS?*"), NIL), list(makeSymbol("*VALIDATING-EXPANSION?*"), T));

    static private final SubLList $list_alt23 = list(list(makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*"), NIL));

    static private final SubLList $list_alt25 = list(makeSymbol("VARIABLE"), makeSymbol("KEYWORD"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("VACCESS"), list(QUOTE, makeSymbol("PROTECTED"))));

    public static SubLObject init_wff_macros_file() {
        return NIL;
    }

    public static SubLObject setup_wff_macros_file() {
        register_macro_helper(POSSIBLY_NEW_WFF_MEMOIZATION_STATE, WITH_WFF_MEMOIZATION_STATE);
        register_macro_helper(NEW_WFF_SPECIAL_VARIABLE_STATE, WITH_WFF_PROPERTIES);
        return NIL;
    }

    static private final SubLList $list_alt37 = list(makeSymbol("PROPERTIES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_wff_macros_file();
    }

    static private final SubLSymbol $sym38$WFF_SVS = makeUninternedSymbol("WFF-SVS");

    @Override
    public void initializeVariables() {
        init_wff_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt42 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"));

    static private final SubLList $list_alt43 = list(makeSymbol("WFF-SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym44$SVS = makeUninternedSymbol("SVS");
}

/**
 * Total time: 140 ms synthetic
 */
