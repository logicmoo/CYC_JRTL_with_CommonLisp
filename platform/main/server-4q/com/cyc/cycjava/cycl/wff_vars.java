/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WFF-VARS
 * source file: /cyc/top/cycl/wff-vars.lisp
 * created:     2019/07/03 17:37:19
 */
public final class wff_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new wff_vars();



    // defvar
    // Definitions
    /**
     * A dictionary mapping WFF property keywords to a list of the form
     * (<corresponding variable> <default value>). Initialized via @xref
     * defparameter-wff.
     */
    @LispMethod(comment = "A dictionary mapping WFF property keywords to a list of the form\r\n(<corresponding variable> <default value>). Initialized via @xref\r\ndefparameter-wff.\ndefvar\nA dictionary mapping WFF property keywords to a list of the form\n(<corresponding variable> <default value>). Initialized via @xref\ndefparameter-wff.")
    private static final SubLSymbol $wff_properties_table$ = makeSymbol("*WFF-PROPERTIES-TABLE*");

    // defparameter
    // Dynamically bound to the user-specified WFF properties
    /**
     * Dynamically bound to the user-specified WFF properties
     */
    @LispMethod(comment = "Dynamically bound to the user-specified WFF properties\ndefparameter")
    public static final SubLSymbol $wff_properties$ = makeSymbol("*WFF-PROPERTIES*");



































    // defparameter
    // transient state variable; is t during the execution of wff?
    /**
     * transient state variable; is t during the execution of wff?
     */
    @LispMethod(comment = "transient state variable; is t during the execution of wff?\ndefparameter")
    public static final SubLSymbol $within_wffP$ = makeSymbol("*WITHIN-WFF?*");

    // deflexical
    /**
     *
     *
     * @see *wff-mode*
     */
    @LispMethod(comment = "@see *wff-mode*\ndeflexical")
    private static final SubLSymbol $wff_modes$ = makeSymbol("*WFF-MODES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $wff_constraint_mt$ = makeSymbol("*WFF-CONSTRAINT-MT*");

    // defparameter
    // formula being appraised by wff module
    /**
     * formula being appraised by wff module
     */
    @LispMethod(comment = "formula being appraised by wff module\ndefparameter")
    public static final SubLSymbol $wff_formula$ = makeSymbol("*WFF-FORMULA*");

    // defparameter
    // original formula being appraised by wff module
    /**
     * original formula being appraised by wff module
     */
    @LispMethod(comment = "original formula being appraised by wff module\ndefparameter")
    public static final SubLSymbol $wff_original_formula$ = makeSymbol("*WFF-ORIGINAL-FORMULA*");

    // defparameter
    // expansion formula being appraised by wff module
    /**
     * expansion formula being appraised by wff module
     */
    @LispMethod(comment = "expansion formula being appraised by wff module\ndefparameter")
    public static final SubLSymbol $wff_expansion_formula$ = makeSymbol("*WFF-EXPANSION-FORMULA*");

    // defparameter
    // descriptions of how the current argument to wff? is incoherent
    /**
     * descriptions of how the current argument to wff? is incoherent
     */
    @LispMethod(comment = "descriptions of how the current argument to wff? is incoherent\ndefparameter")
    public static final SubLSymbol $coherence_violations$ = makeSymbol("*COHERENCE-VIOLATIONS*");

    // defparameter
    // descriptions of how the current argument to wff? is invalid
    /**
     * descriptions of how the current argument to wff? is invalid
     */
    @LispMethod(comment = "descriptions of how the current argument to wff? is invalid\ndefparameter")
    public static final SubLSymbol $wff_violations$ = makeSymbol("*WFF-VIOLATIONS*");

    // defparameter
    /**
     * descriptions of how a relational expresion is not valid wrt arity constraints
     */
    @LispMethod(comment = "descriptions of how a relational expresion is not valid wrt arity constraints\ndefparameter")
    public static final SubLSymbol $arity_violations$ = makeSymbol("*ARITY-VIOLATIONS*");

    // defparameter
    /**
     * suggestions for making a non-wff formula wff will be attempted with this is
     * non-nil
     */
    @LispMethod(comment = "suggestions for making a non-wff formula wff will be attempted with this is\r\nnon-nil\ndefparameter\nsuggestions for making a non-wff formula wff will be attempted with this is\nnon-nil")
    public static final SubLSymbol $provide_wff_suggestionsP$ = makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*");

    // defparameter
    // descriptions of how the current invalid argument to wff? can be fixed
    /**
     * descriptions of how the current invalid argument to wff? can be fixed
     */
    @LispMethod(comment = "descriptions of how the current invalid argument to wff? can be fixed\ndefparameter")
    public static final SubLSymbol $wff_suggestions$ = makeSymbol("*WFF-SUGGESTIONS*");

    // defparameter
    /**
     * transient state variable; contains the current memoization state during
     * execution of wff?
     */
    @LispMethod(comment = "transient state variable; contains the current memoization state during\r\nexecution of wff?\ndefparameter\ntransient state variable; contains the current memoization state during\nexecution of wff?")
    public static final SubLSymbol $wff_memoization_state$ = makeSymbol("*WFF-MEMOIZATION-STATE*");

    // defparameter
    // within wff tests applied to expansion (in addition to given form)?
    /**
     * within wff tests applied to expansion (in addition to given form)?
     */
    @LispMethod(comment = "within wff tests applied to expansion (in addition to given form)?\ndefparameter")
    public static final SubLSymbol $validating_expansionP$ = makeSymbol("*VALIDATING-EXPANSION?*");

    // defparameter
    // original formula whose expansion is being considered?
    /**
     * original formula whose expansion is being considered?
     */
    @LispMethod(comment = "original formula whose expansion is being considered?\ndefparameter")
    public static final SubLSymbol $unexpanded_formula$ = makeSymbol("*UNEXPANDED-FORMULA*");

    public static final SubLSymbol $wff_mode$ = makeSymbol("*WFF-MODE*");

    public static final SubLSymbol $wff_debugP$ = makeSymbol("*WFF-DEBUG?*");

    private static final SubLSymbol $kw5$VALIDATE_CONSTANTS_ = makeKeyword("VALIDATE-CONSTANTS?");

    public static final SubLSymbol $validate_constantsP$ = makeSymbol("*VALIDATE-CONSTANTS?*");

    private static final SubLSymbol $kw7$RECOGNIZE_VARIABLES_ = makeKeyword("RECOGNIZE-VARIABLES?");

    public static final SubLSymbol $recognize_variablesP$ = makeSymbol("*RECOGNIZE-VARIABLES?*");

    private static final SubLSymbol $kw9$REJECT_SBHL_CONFLICTS_ = makeKeyword("REJECT-SBHL-CONFLICTS?");

    public static final SubLSymbol $reject_sbhl_conflictsP$ = makeSymbol("*REJECT-SBHL-CONFLICTS?*");

    private static final SubLSymbol $kw11$INHIBIT_SKOLEM_ASSERTS_ = makeKeyword("INHIBIT-SKOLEM-ASSERTS?");

    public static final SubLSymbol $inhibit_skolem_assertsP$ = makeSymbol("*INHIBIT-SKOLEM-ASSERTS?*");

    private static final SubLSymbol $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_ = makeKeyword("SIMPLIFY-EVALUATABLE-EXPRESSIONS?");

    public static final SubLSymbol $simplify_evaluatable_expressionsP$ = makeSymbol("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*");

    private static final SubLSymbol $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_ = makeKeyword("ENFORCE-EVALUATABLE-SATISFIABILITY?");

    public static final SubLSymbol $enforce_evaluatable_satisfiabilityP$ = makeSymbol("*ENFORCE-EVALUATABLE-SATISFIABILITY?*");

    private static final SubLSymbol $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_ = makeKeyword("ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?");

    public static final SubLSymbol $enforce_only_definitional_gafs_in_vocab_mtP$ = makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*");

    private static final SubLSymbol $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_ = makeKeyword("INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?");

    public static final SubLSymbol $inhibit_cyclic_commutative_in_argsP$ = makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*");

    private static final SubLSymbol $kw21$ACCUMULATING_VIOLATIONS_ = makeKeyword("ACCUMULATING-VIOLATIONS?");

    public static final SubLSymbol $accumulating_wff_violationsP$ = makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*");

    private static final SubLSymbol $kw23$NOTING_VIOLATIONS_ = makeKeyword("NOTING-VIOLATIONS?");

    public static final SubLSymbol $noting_wff_violationsP$ = makeSymbol("*NOTING-WFF-VIOLATIONS?*");

    private static final SubLSymbol $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_ = makeKeyword("INCLUDE-SUF-DEFN-VIOLATIONS?");

    public static final SubLSymbol $include_suf_defn_violationsP$ = makeSymbol("*INCLUDE-SUF-DEFN-VIOLATIONS?*");

    private static final SubLSymbol $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_ = makeKeyword("ENFORCE-LITERAL-IDIOSYNCRASIES?");

    public static final SubLSymbol $enforce_literal_wff_idiosyncrasiesP$ = makeSymbol("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*");

    private static final SubLSymbol $kw29$VIOLATION_DATA_TERSE_ = makeKeyword("VIOLATION-DATA-TERSE?");

    public static final SubLSymbol $wff_violation_data_terseP$ = makeSymbol("*WFF-VIOLATION-DATA-TERSE?*");

    private static final SubLSymbol $kw31$PERMIT_KEYWORD_VARIABLES_ = makeKeyword("PERMIT-KEYWORD-VARIABLES?");

    public static final SubLSymbol $permit_keyword_variablesP$ = makeSymbol("*PERMIT-KEYWORD-VARIABLES?*");

    private static final SubLSymbol $kw33$PERMIT_GENERIC_ARG_VARIABLES_ = makeKeyword("PERMIT-GENERIC-ARG-VARIABLES?");

    public static final SubLSymbol $permit_generic_arg_variablesP$ = makeSymbol("*PERMIT-GENERIC-ARG-VARIABLES?*");

    private static final SubLSymbol $kw35$VALIDATE_EXPANSIONS_ = makeKeyword("VALIDATE-EXPANSIONS?");

    public static final SubLSymbol $validate_expansionsP$ = makeSymbol("*VALIDATE-EXPANSIONS?*");

    private static final SubLSymbol $NL_TERM_MAP = makeKeyword("NL-TERM-MAP");

    private static final SubLSymbol $NL_LIST_OUTPUT = makeKeyword("NL-LIST-OUTPUT");

    private static final SubLSymbol WFF_PROPERTY_P = makeSymbol("WFF-PROPERTY-P");

    private static final SubLSymbol WFF_MODE_P = makeSymbol("WFF-MODE-P");

    private static final SubLList $list47 = list(makeKeyword("STRICT"), makeKeyword("LENIENT"), makeKeyword("ASSERTIVE"));

    static final boolean assertionsDisabledSynth = true;

    public static final SubLObject wff_properties_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_properties_table$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_properties_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_properties_table$.getDynamicValue(thread);
    }

    public static final SubLObject note_wff_property_alt(SubLObject keyword, SubLObject variable, SubLObject v_default) {
        return dictionary.dictionary_enter(com.cyc.cycjava.cycl.wff_vars.wff_properties_table(), keyword, list(variable, v_default));
    }

    public static SubLObject note_wff_property(final SubLObject keyword, final SubLObject variable, final SubLObject v_default) {
        return dictionary.dictionary_enter(wff_properties_table(), keyword, list(variable, v_default));
    }

    public static final SubLObject wff_property_variable_alt(SubLObject property) {
        return dictionary.dictionary_lookup(com.cyc.cycjava.cycl.wff_vars.wff_properties_table(), property, UNPROVIDED).first();
    }

    public static SubLObject wff_property_variable(final SubLObject property) {
        return dictionary.dictionary_lookup(wff_properties_table(), property, UNPROVIDED).first();
    }

    public static final SubLObject wff_property_default_alt(SubLObject property) {
        return second(dictionary.dictionary_lookup(com.cyc.cycjava.cycl.wff_vars.wff_properties_table(), property, UNPROVIDED));
    }

    public static SubLObject wff_property_default(final SubLObject property) {
        return second(dictionary.dictionary_lookup(wff_properties_table(), property, UNPROVIDED));
    }

    public static SubLObject get_wff_property(final SubLObject v_properties, final SubLObject property) {
        return getf(v_properties, property, wff_property_default(property));
    }

    public static final SubLObject wff_property_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != dictionary_utilities.dictionary_has_keyP(com.cyc.cycjava.cycl.wff_vars.wff_properties_table(), v_object)));
    }

    public static SubLObject wff_property_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != dictionary_utilities.dictionary_has_keyP(wff_properties_table(), v_object)));
    }

    /**
     * Returns the current WFF properties.  @note result is not destructible.
     */
    @LispMethod(comment = "Returns the current WFF properties.  @note result is not destructible.")
    public static final SubLObject wff_properties_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_properties$.getDynamicValue(thread);
        }
    }

    /**
     * Returns the current WFF properties.  @note result is not destructible.
     */
    @LispMethod(comment = "Returns the current WFF properties.  @note result is not destructible.")
    public static SubLObject wff_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_properties$.getDynamicValue(thread);
    }

    public static final SubLObject wff_debugP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_debugP$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_debugP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_debugP$.getDynamicValue(thread);
    }

    public static final SubLObject wff_violation_data_terseP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_violation_data_terseP$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_violation_data_terseP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_violation_data_terseP$.getDynamicValue(thread);
    }

    public static final SubLObject check_wff_properties_alt(SubLObject v_properties) {
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, WFF_PROPERTY_P);
                    }
                }
            }
        }
        if (NIL != getf(v_properties, $WFF_MODE, NIL)) {
            SubLTrampolineFile.checkType(getf(v_properties, $WFF_MODE, NIL), WFF_MODE_P);
        }
        return NIL;
    }

    public static SubLObject check_wff_properties(final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "! list_utilities.property_list_p(v_properties) " + ("list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) ") + v_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_property_p(property) : "! wff_vars.wff_property_p(property) " + ("wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) ") + property;
        }
        if (((NIL != getf(v_properties, $WFF_MODE, NIL)) && (!assertionsDisabledSynth)) && (NIL == wff_mode_p(getf(v_properties, $WFF_MODE, NIL)))) {
            throw new AssertionError(getf(v_properties, $WFF_MODE, NIL));
        }
        return NIL;
    }

    public static final SubLObject wff_mode_p_alt(SubLObject v_object) {
        return member_eqP(v_object, $wff_modes$.getGlobalValue());
    }

    public static SubLObject wff_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $wff_modes$.getGlobalValue());
    }

    public static final SubLObject wff_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_mode$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_mode$.getDynamicValue(thread);
    }

    public static final SubLObject wff_strictP_alt() {
        return eq($STRICT, com.cyc.cycjava.cycl.wff_vars.wff_mode());
    }

    public static SubLObject wff_strictP() {
        return eq($STRICT, wff_mode());
    }

    public static final SubLObject wff_lenientP_alt() {
        return eq($LENIENT, com.cyc.cycjava.cycl.wff_vars.wff_mode());
    }

    public static SubLObject wff_lenientP() {
        return makeBoolean(($ASSERTIVE == wff_mode()) || ($LENIENT == wff_mode()));
    }

    public static SubLObject wff_assertiveP() {
        return eq($ASSERTIVE, wff_mode());
    }

    public static SubLObject wff_constraint_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_constraint_mt$.getDynamicValue(thread);
    }

    public static final SubLObject wff_formula_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_formula$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_formula$.getDynamicValue(thread);
    }

    public static final SubLObject wff_original_formula_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_original_formula$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_original_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_original_formula$.getDynamicValue(thread);
    }

    public static final SubLObject wff_expansion_formula_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $wff_expansion_formula$.getDynamicValue(thread);
        }
    }

    public static SubLObject wff_expansion_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_expansion_formula$.getDynamicValue(thread);
    }

    public static final SubLObject validating_expansionP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $validating_expansionP$.getDynamicValue(thread);
        }
    }

    public static SubLObject validating_expansionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $validating_expansionP$.getDynamicValue(thread);
    }

    public static final SubLObject validate_expansionsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $validate_expansionsP$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.wff_vars.validating_expansionP()));
        }
    }

    public static SubLObject validate_expansionsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $validate_expansionsP$.getDynamicValue(thread)) && (NIL == validating_expansionP()));
    }

    public static final SubLObject unexpanded_formula_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $unexpanded_formula$.getDynamicValue(thread);
        }
    }

    public static SubLObject unexpanded_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $unexpanded_formula$.getDynamicValue(thread);
    }

    public static SubLObject declare_wff_vars_file() {
        declareFunction("wff_properties_table", "WFF-PROPERTIES-TABLE", 0, 0, false);
        declareFunction("note_wff_property", "NOTE-WFF-PROPERTY", 3, 0, false);
        declareFunction("wff_property_variable", "WFF-PROPERTY-VARIABLE", 1, 0, false);
        declareFunction("wff_property_default", "WFF-PROPERTY-DEFAULT", 1, 0, false);
        declareFunction("get_wff_property", "GET-WFF-PROPERTY", 2, 0, false);
        declareFunction("wff_property_p", "WFF-PROPERTY-P", 1, 0, false);
        declareFunction("wff_properties", "WFF-PROPERTIES", 0, 0, false);
        declareFunction("wff_debugP", "WFF-DEBUG?", 0, 0, false);
        declareFunction("wff_violation_data_terseP", "WFF-VIOLATION-DATA-TERSE?", 0, 0, false);
        declareFunction("check_wff_properties", "CHECK-WFF-PROPERTIES", 1, 0, false);
        declareFunction("wff_mode_p", "WFF-MODE-P", 1, 0, false);
        declareFunction("wff_mode", "WFF-MODE", 0, 0, false);
        declareFunction("wff_strictP", "WFF-STRICT?", 0, 0, false);
        declareFunction("wff_lenientP", "WFF-LENIENT?", 0, 0, false);
        declareFunction("wff_assertiveP", "WFF-ASSERTIVE?", 0, 0, false);
        declareFunction("wff_constraint_mt", "WFF-CONSTRAINT-MT", 0, 0, false);
        declareFunction("wff_formula", "WFF-FORMULA", 0, 0, false);
        declareFunction("wff_original_formula", "WFF-ORIGINAL-FORMULA", 0, 0, false);
        declareFunction("wff_expansion_formula", "WFF-EXPANSION-FORMULA", 0, 0, false);
        declareFunction("validating_expansionP", "VALIDATING-EXPANSION?", 0, 0, false);
        declareFunction("validate_expansionsP", "VALIDATE-EXPANSIONS?", 0, 0, false);
        declareFunction("unexpanded_formula", "UNEXPANDED-FORMULA", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_wff_vars_file_alt() {
        defvar("*WFF-PROPERTIES-TABLE*", dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        defparameter("*WFF-PROPERTIES*", NIL);
        defparameter("*WFF-MODE*", $STRICT);
        defparameter("*WFF-DEBUG?*", NIL);
        defparameter("*VALIDATE-CONSTANTS?*", T);
        defparameter("*RECOGNIZE-VARIABLES?*", T);
        defparameter("*REJECT-SBHL-CONFLICTS?*", T);
        defparameter("*INHIBIT-SKOLEM-ASSERTS?*", T);
        defparameter("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*", NIL);
        defparameter("*ENFORCE-EVALUATABLE-SATISFIABILITY?*", T);
        defparameter("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", NIL);
        defparameter("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", T);
        defparameter("*ACCUMULATING-WFF-VIOLATIONS?*", NIL);
        defparameter("*NOTING-WFF-VIOLATIONS?*", NIL);
        defparameter("*INCLUDE-SUF-DEFN-VIOLATIONS?*", T);
        defparameter("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*", T);
        defparameter("*WFF-VIOLATION-DATA-TERSE?*", NIL);
        defparameter("*PERMIT-KEYWORD-VARIABLES?*", NIL);
        defparameter("*PERMIT-GENERIC-ARG-VARIABLES?*", NIL);
        defparameter("*VALIDATE-EXPANSIONS?*", NIL);
        defparameter("*WITHIN-WFF?*", NIL);
        deflexical("*WFF-MODES*", $list_alt43);
        defparameter("*WFF-FORMULA*", NIL);
        defparameter("*WFF-ORIGINAL-FORMULA*", NIL);
        defparameter("*WFF-EXPANSION-FORMULA*", NIL);
        defparameter("*COHERENCE-VIOLATIONS*", NIL);
        defparameter("*WFF-VIOLATIONS*", NIL);
        defparameter("*ARITY-VIOLATIONS*", NIL);
        defparameter("*PROVIDE-WFF-SUGGESTIONS?*", NIL);
        defparameter("*WFF-SUGGESTIONS*", NIL);
        defparameter("*WFF-MEMOIZATION-STATE*", NIL);
        defparameter("*VALIDATING-EXPANSION?*", NIL);
        defparameter("*UNEXPANDED-FORMULA*", NIL);
        return NIL;
    }

    public static SubLObject init_wff_vars_file() {
        if (SubLFiles.USE_V1) {
            defvar("*WFF-PROPERTIES-TABLE*", dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            defparameter("*WFF-PROPERTIES*", NIL);
            defparameter("*WFF-MODE*", $ASSERTIVE);
            defparameter("*WFF-DEBUG?*", NIL);
            defparameter("*VALIDATE-CONSTANTS?*", T);
            defparameter("*RECOGNIZE-VARIABLES?*", T);
            defparameter("*REJECT-SBHL-CONFLICTS?*", T);
            defparameter("*INHIBIT-SKOLEM-ASSERTS?*", T);
            defparameter("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*", NIL);
            defparameter("*ENFORCE-EVALUATABLE-SATISFIABILITY?*", T);
            defparameter("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", NIL);
            defparameter("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", T);
            defparameter("*ACCUMULATING-WFF-VIOLATIONS?*", NIL);
            defparameter("*NOTING-WFF-VIOLATIONS?*", NIL);
            defparameter("*INCLUDE-SUF-DEFN-VIOLATIONS?*", T);
            defparameter("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*", T);
            defparameter("*WFF-VIOLATION-DATA-TERSE?*", NIL);
            defparameter("*PERMIT-KEYWORD-VARIABLES?*", NIL);
            defparameter("*PERMIT-GENERIC-ARG-VARIABLES?*", NIL);
            defparameter("*VALIDATE-EXPANSIONS?*", NIL);
            defparameter("*WITHIN-WFF?*", NIL);
            deflexical("*WFF-MODES*", $list47);
            defparameter("*WFF-CONSTRAINT-MT*", NIL);
            defparameter("*WFF-FORMULA*", NIL);
            defparameter("*WFF-ORIGINAL-FORMULA*", NIL);
            defparameter("*WFF-EXPANSION-FORMULA*", NIL);
            defparameter("*COHERENCE-VIOLATIONS*", NIL);
            defparameter("*WFF-VIOLATIONS*", NIL);
            defparameter("*ARITY-VIOLATIONS*", NIL);
            defparameter("*PROVIDE-WFF-SUGGESTIONS?*", NIL);
            defparameter("*WFF-SUGGESTIONS*", NIL);
            defparameter("*WFF-MEMOIZATION-STATE*", NIL);
            defparameter("*VALIDATING-EXPANSION?*", NIL);
            defparameter("*UNEXPANDED-FORMULA*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*WFF-MODE*", $STRICT);
            deflexical("*WFF-MODES*", $list_alt43);
        }
        return NIL;
    }

    public static SubLObject init_wff_vars_file_Previous() {
        defvar("*WFF-PROPERTIES-TABLE*", dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        defparameter("*WFF-PROPERTIES*", NIL);
        defparameter("*WFF-MODE*", $ASSERTIVE);
        defparameter("*WFF-DEBUG?*", NIL);
        defparameter("*VALIDATE-CONSTANTS?*", T);
        defparameter("*RECOGNIZE-VARIABLES?*", T);
        defparameter("*REJECT-SBHL-CONFLICTS?*", T);
        defparameter("*INHIBIT-SKOLEM-ASSERTS?*", T);
        defparameter("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*", NIL);
        defparameter("*ENFORCE-EVALUATABLE-SATISFIABILITY?*", T);
        defparameter("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", NIL);
        defparameter("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", T);
        defparameter("*ACCUMULATING-WFF-VIOLATIONS?*", NIL);
        defparameter("*NOTING-WFF-VIOLATIONS?*", NIL);
        defparameter("*INCLUDE-SUF-DEFN-VIOLATIONS?*", T);
        defparameter("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*", T);
        defparameter("*WFF-VIOLATION-DATA-TERSE?*", NIL);
        defparameter("*PERMIT-KEYWORD-VARIABLES?*", NIL);
        defparameter("*PERMIT-GENERIC-ARG-VARIABLES?*", NIL);
        defparameter("*VALIDATE-EXPANSIONS?*", NIL);
        defparameter("*WITHIN-WFF?*", NIL);
        deflexical("*WFF-MODES*", $list47);
        defparameter("*WFF-CONSTRAINT-MT*", NIL);
        defparameter("*WFF-FORMULA*", NIL);
        defparameter("*WFF-ORIGINAL-FORMULA*", NIL);
        defparameter("*WFF-EXPANSION-FORMULA*", NIL);
        defparameter("*COHERENCE-VIOLATIONS*", NIL);
        defparameter("*WFF-VIOLATIONS*", NIL);
        defparameter("*ARITY-VIOLATIONS*", NIL);
        defparameter("*PROVIDE-WFF-SUGGESTIONS?*", NIL);
        defparameter("*WFF-SUGGESTIONS*", NIL);
        defparameter("*WFF-MEMOIZATION-STATE*", NIL);
        defparameter("*VALIDATING-EXPANSION?*", NIL);
        defparameter("*UNEXPANDED-FORMULA*", NIL);
        return NIL;
    }

    public static final SubLObject setup_wff_vars_file_alt() {
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($WFF_MODE, $wff_mode$, $STRICT);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($DEBUG_, $wff_debugP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw5$VALIDATE_CONSTANTS_, $validate_constantsP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw7$RECOGNIZE_VARIABLES_, $recognize_variablesP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw9$REJECT_SBHL_CONFLICTS_, $reject_sbhl_conflictsP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw11$INHIBIT_SKOLEM_ASSERTS_, $inhibit_skolem_assertsP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $simplify_evaluatable_expressionsP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $enforce_evaluatable_satisfiabilityP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $enforce_only_definitional_gafs_in_vocab_mtP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $inhibit_cyclic_commutative_in_argsP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw21$ACCUMULATING_VIOLATIONS_, $accumulating_wff_violationsP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw23$NOTING_VIOLATIONS_, $noting_wff_violationsP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $include_suf_defn_violationsP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $enforce_literal_wff_idiosyncrasiesP$, T);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw29$VIOLATION_DATA_TERSE_, $wff_violation_data_terseP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw31$PERMIT_KEYWORD_VARIABLES_, $permit_keyword_variablesP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw33$PERMIT_GENERIC_ARG_VARIABLES_, $permit_generic_arg_variablesP$, NIL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($kw35$VALIDATE_EXPANSIONS_, $validate_expansionsP$, NIL);
        register_html_state_variable($validate_expansionsP$);
        register_html_interface_variable($validate_expansionsP$);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($IO_MODE, NIL, $NL);
        com.cyc.cycjava.cycl.wff_vars.note_wff_property($VIOLATIONS, NIL, NIL);
        return NIL;
    }

    public static SubLObject setup_wff_vars_file() {
        if (SubLFiles.USE_V1) {
            note_wff_property($WFF_MODE, $wff_mode$, $ASSERTIVE);
            note_wff_property($DEBUG_, $wff_debugP$, NIL);
            note_wff_property($kw5$VALIDATE_CONSTANTS_, $validate_constantsP$, T);
            note_wff_property($kw7$RECOGNIZE_VARIABLES_, $recognize_variablesP$, T);
            note_wff_property($kw9$REJECT_SBHL_CONFLICTS_, $reject_sbhl_conflictsP$, T);
            note_wff_property($kw11$INHIBIT_SKOLEM_ASSERTS_, $inhibit_skolem_assertsP$, T);
            note_wff_property($kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $simplify_evaluatable_expressionsP$, NIL);
            note_wff_property($kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $enforce_evaluatable_satisfiabilityP$, T);
            note_wff_property($kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $enforce_only_definitional_gafs_in_vocab_mtP$, NIL);
            note_wff_property($kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $inhibit_cyclic_commutative_in_argsP$, T);
            note_wff_property($kw21$ACCUMULATING_VIOLATIONS_, $accumulating_wff_violationsP$, NIL);
            note_wff_property($kw23$NOTING_VIOLATIONS_, $noting_wff_violationsP$, NIL);
            note_wff_property($kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $include_suf_defn_violationsP$, T);
            note_wff_property($kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $enforce_literal_wff_idiosyncrasiesP$, T);
            note_wff_property($kw29$VIOLATION_DATA_TERSE_, $wff_violation_data_terseP$, NIL);
            note_wff_property($kw31$PERMIT_KEYWORD_VARIABLES_, $permit_keyword_variablesP$, NIL);
            note_wff_property($kw33$PERMIT_GENERIC_ARG_VARIABLES_, $permit_generic_arg_variablesP$, NIL);
            note_wff_property($kw35$VALIDATE_EXPANSIONS_, $validate_expansionsP$, NIL);
            note_wff_property($IO_MODE, NIL, $NL);
            note_wff_property($NL_VERBOSITY, NIL, $VERBOSE);
            note_wff_property($NL_TERM_MAP, NIL, NIL);
            note_wff_property($NL_LIST_OUTPUT, NIL, NIL);
            note_wff_property($VIOLATIONS, NIL, NIL);
        }
        if (SubLFiles.USE_V2) {
            com.cyc.cycjava.cycl.wff_vars.note_wff_property($WFF_MODE, $wff_mode$, $STRICT);
            register_html_state_variable($validate_expansionsP$);
            register_html_interface_variable($validate_expansionsP$);
        }
        return NIL;
    }

    public static SubLObject setup_wff_vars_file_Previous() {
        note_wff_property($WFF_MODE, $wff_mode$, $ASSERTIVE);
        note_wff_property($DEBUG_, $wff_debugP$, NIL);
        note_wff_property($kw5$VALIDATE_CONSTANTS_, $validate_constantsP$, T);
        note_wff_property($kw7$RECOGNIZE_VARIABLES_, $recognize_variablesP$, T);
        note_wff_property($kw9$REJECT_SBHL_CONFLICTS_, $reject_sbhl_conflictsP$, T);
        note_wff_property($kw11$INHIBIT_SKOLEM_ASSERTS_, $inhibit_skolem_assertsP$, T);
        note_wff_property($kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $simplify_evaluatable_expressionsP$, NIL);
        note_wff_property($kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $enforce_evaluatable_satisfiabilityP$, T);
        note_wff_property($kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $enforce_only_definitional_gafs_in_vocab_mtP$, NIL);
        note_wff_property($kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $inhibit_cyclic_commutative_in_argsP$, T);
        note_wff_property($kw21$ACCUMULATING_VIOLATIONS_, $accumulating_wff_violationsP$, NIL);
        note_wff_property($kw23$NOTING_VIOLATIONS_, $noting_wff_violationsP$, NIL);
        note_wff_property($kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $include_suf_defn_violationsP$, T);
        note_wff_property($kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $enforce_literal_wff_idiosyncrasiesP$, T);
        note_wff_property($kw29$VIOLATION_DATA_TERSE_, $wff_violation_data_terseP$, NIL);
        note_wff_property($kw31$PERMIT_KEYWORD_VARIABLES_, $permit_keyword_variablesP$, NIL);
        note_wff_property($kw33$PERMIT_GENERIC_ARG_VARIABLES_, $permit_generic_arg_variablesP$, NIL);
        note_wff_property($kw35$VALIDATE_EXPANSIONS_, $validate_expansionsP$, NIL);
        note_wff_property($IO_MODE, NIL, $NL);
        note_wff_property($NL_VERBOSITY, NIL, $VERBOSE);
        note_wff_property($NL_TERM_MAP, NIL, NIL);
        note_wff_property($NL_LIST_OUTPUT, NIL, NIL);
        note_wff_property($VIOLATIONS, NIL, NIL);
        return NIL;
    }

    static private final SubLList $list_alt43 = list(makeKeyword("STRICT"), makeKeyword("LENIENT"));

    @Override
    public void declareFunctions() {
        declare_wff_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_wff_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_vars_file();
    }

    static {
    }
}

/**
 * Total time: 130 ms synthetic
 */
