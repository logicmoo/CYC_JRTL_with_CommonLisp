package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.wff_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.wff_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class wff_macros extends SubLTranslatedFile {
    public static final SubLFile me = new wff_macros();

    public static final String myName = "com.cyc.cycjava.cycl.wff_macros";

    public static final String myFingerPrint = "c3f289d81e78e3f1b1f096e63e3cdbeb2a983572ba9574570a0b29a89ac27a5e";



    public static final SubLList $list1 = list(list(makeSymbol("*WITHIN-WFF?*"), T));

    public static final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_formula$ = makeSymbol("*WFF-FORMULA*");

    public static final SubLSymbol $wff_original_formula$ = makeSymbol("*WFF-ORIGINAL-FORMULA*");



    public static final SubLList $list6 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-ORIGINAL-FORMULA")));

    public static final SubLList $list7 = list(makeSymbol("WFF-ORIGINAL-FORMULA"));

    public static final SubLList $list8 = list(makeSymbol("EXPANSION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_expansion_formula$ = makeSymbol("*WFF-EXPANSION-FORMULA*");

    public static final SubLList $list10 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-EXPANSION-FORMULA")));

    public static final SubLList $list11 = list(makeSymbol("WFF-EXPANSION-FORMULA"));

    public static final SubLList $list12 = list(makeSymbol("STATE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $wff_memoization_state$ = makeSymbol("*WFF-MEMOIZATION-STATE*");



    public static final SubLList $list15 = list(makeSymbol("*WFF-MEMOIZATION-STATE*"));

    public static final SubLList $list16 = list(makeSymbol("PUNLESS"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("RESET-WFF-STATE")));

    public static final SubLSymbol WITH_SPECIFIED_WFF_MEMOIZATION_STATE = makeSymbol("WITH-SPECIFIED-WFF-MEMOIZATION-STATE");

    public static final SubLList $list18 = list(makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE"));

    public static final SubLSymbol POSSIBLY_NEW_WFF_MEMOIZATION_STATE = makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE");

    public static final SubLSymbol WITH_WFF_MEMOIZATION_STATE = makeSymbol("WITH-WFF-MEMOIZATION-STATE");

    private static final SubLString $$$wff_memoization_state = makeString("wff memoization state");

    private static final SubLSymbol $unexpanded_formula$ = makeSymbol("*UNEXPANDED-FORMULA*");

    public static final SubLList $list23 = list(list(makeSymbol("*VALIDATE-EXPANSIONS?*"), NIL), list(makeSymbol("*VALIDATING-EXPANSION?*"), T));

    private static final SubLList $list24 = list(list(makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*"), NIL));

    private static final SubLSymbol VALIDATING_EXPANSION_OF = makeSymbol("VALIDATING-EXPANSION-OF");

    private static final SubLList $list26 = list(makeSymbol("VARIABLE"), makeSymbol("KEYWORD"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("VACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PROTECTED"))));







    private static final SubLSymbol SELF_EVALUATING_FORM_P = makeSymbol("SELF-EVALUATING-FORM-P");









    private static final SubLSymbol VACCESS = makeSymbol("VACCESS");



    private static final SubLSymbol NOTE_WFF_PROPERTY = makeSymbol("NOTE-WFF-PROPERTY");

    private static final SubLList $list38 = list(makeSymbol("PROPERTIES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$WFF_SVS = makeUninternedSymbol("WFF-SVS");

    private static final SubLSymbol NEW_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("NEW-WFF-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol WITH_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-WFF-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol WITH_WFF_PROPERTIES = makeSymbol("WITH-WFF-PROPERTIES");

    public static final SubLList $list43 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"));

    private static final SubLList $list44 = list(makeSymbol("WFF-SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym45$SVS = makeUninternedSymbol("SVS");

    private static final SubLSymbol $wff_properties$ = makeSymbol("*WFF-PROPERTIES*");

    private static final SubLSymbol WITH_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-SPECIAL-VARIABLE-STATE");

    private static final SubLList $list48 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("STRICT")));

    private static final SubLList $list49 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("ASSERTIVE")));

    private static final SubLList $list50 = list(list(makeSymbol("*WFF-MODE*"), makeKeyword("LENIENT")));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject within_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject within_wffP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$within_wffP$.getDynamicValue(thread);
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

    public static SubLObject with_wff_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SPECIFIED_WFF_MEMOIZATION_STATE, $list18, append(body, NIL));
    }

    public static SubLObject possibly_new_wff_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != wff_vars.$wff_memoization_state$.getDynamicValue(thread) ? wff_vars.$wff_memoization_state$.getDynamicValue(thread) : memoization_state.new_memoization_state($$$wff_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        assert NIL != list_utilities.self_evaluating_form_p(initialization) : "list_utilities.self_evaluating_form_p(initialization) " + "CommonSymbols.NIL != list_utilities.self_evaluating_form_p(initialization) " + initialization;
        assert NIL != stringp(documentation) : "Types.stringp(documentation) " + "CommonSymbols.NIL != Types.stringp(documentation) " + documentation;
        assert NIL != symbolp(vaccess) : "Types.symbolp(vaccess) " + "CommonSymbols.NIL != Types.symbolp(vaccess) " + vaccess;
        if (NIL != variable) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, vaccess, variable))), list(DEFPARAMETER, variable, initialization, documentation), list(NOTE_WFF_PROPERTY, keyword, list(QUOTE, variable), initialization));
        }
        return list(NOTE_WFF_PROPERTY, keyword, NIL, initialization);
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

    public static SubLObject with_strict_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list48, append(body, NIL));
    }

    public static SubLObject with_assertive_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list49, append(body, NIL));
    }

    public static SubLObject with_lenient_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list50, append(body, NIL));
    }

    public static SubLObject declare_wff_macros_file() {
        declareMacro(me, "within_wff", "WITHIN-WFF");
        declareFunction(me, "within_wffP", "WITHIN-WFF?", 0, 0, false);
        declareMacro(me, "with_wff_formula", "WITH-WFF-FORMULA");
        declareMacro(me, "with_wff_expansion", "WITH-WFF-EXPANSION");
        declareMacro(me, "with_specified_wff_memoization_state", "WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
        declareMacro(me, "with_wff_memoization_state", "WITH-WFF-MEMOIZATION-STATE");
        declareFunction(me, "possibly_new_wff_memoization_state", "POSSIBLY-NEW-WFF-MEMOIZATION-STATE", 0, 0, false);
        declareMacro(me, "validating_expansion_of", "VALIDATING-EXPANSION-OF");
        declareMacro(me, "validating_expansion_of_nat", "VALIDATING-EXPANSION-OF-NAT");
        declareMacro(me, "defparameter_wff", "DEFPARAMETER-WFF");
        declareMacro(me, "with_wff_properties", "WITH-WFF-PROPERTIES");
        declareFunction(me, "new_wff_special_variable_state", "NEW-WFF-SPECIAL-VARIABLE-STATE", 1, 0, false);
        declareMacro(me, "with_wff_special_variable_state", "WITH-WFF-SPECIAL-VARIABLE-STATE");
        declareMacro(me, "with_strict_wff", "WITH-STRICT-WFF");
        declareMacro(me, "with_assertive_wff", "WITH-ASSERTIVE-WFF");
        declareMacro(me, "with_lenient_wff", "WITH-LENIENT-WFF");
        return NIL;
    }

    public static SubLObject init_wff_macros_file() {
        return NIL;
    }

    public static SubLObject setup_wff_macros_file() {
        register_macro_helper(POSSIBLY_NEW_WFF_MEMOIZATION_STATE, WITH_WFF_MEMOIZATION_STATE);
        register_macro_helper(NEW_WFF_SPECIAL_VARIABLE_STATE, WITH_WFF_PROPERTIES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wff_macros_file();
    }

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
}

/**
 * Total time: 140 ms synthetic
 */
