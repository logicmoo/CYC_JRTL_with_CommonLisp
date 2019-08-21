package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.wff_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class wff_vars extends SubLTranslatedFile {
    public static final SubLFile me = new wff_vars();

    public static final String myName = "com.cyc.cycjava.cycl.wff_vars";

    public static final String myFingerPrint = "7776700015cc94655d4203b9e0991df34e3fde5110fedb01f9dd21474c4c88b0";

    // defvar
    // Definitions
    /**
     * A dictionary mapping WFF property keywords to a list of the form
     * (<corresponding variable> <default value>). Initialized via @xref
     * defparameter-wff.
     */
    private static final SubLSymbol $wff_properties_table$ = makeSymbol("*WFF-PROPERTIES-TABLE*");

    // defparameter
    // Dynamically bound to the user-specified WFF properties
    public static final SubLSymbol $wff_properties$ = makeSymbol("*WFF-PROPERTIES*");



    // defparameter
    /**
     * Should WFF print out debugging messages during its computation? Setting or
     * binding this to T can be useful when trying to figure out why WFF is
     * rejecting something and why-not-wff is not yielding a useful result.
     */
    public static final SubLSymbol $wff_debugP$ = makeSymbol("*WFF-DEBUG?*");

    // defparameter
    /**
     * require that constants referenced by a formula be valid for the formula to be
     * valid?
     */
    public static final SubLSymbol $validate_constantsP$ = makeSymbol("*VALIDATE-CONSTANTS?*");

    // defparameter
    // do not impose arg-type constraints on variables?
    public static final SubLSymbol $recognize_variablesP$ = makeSymbol("*RECOGNIZE-VARIABLES?*");

    // defparameter
    // should asserted gafs that introduce sbhl conflicts be rejected?
    public static final SubLSymbol $reject_sbhl_conflictsP$ = makeSymbol("*REJECT-SBHL-CONFLICTS?*");

    // defparameter
    // restrict assertions involving skolems?
    public static final SubLSymbol $inhibit_skolem_assertsP$ = makeSymbol("*INHIBIT-SKOLEM-ASSERTS?*");

    // defparameter
    // canonicalize evaluatable expressions to their result when possible?
    public static final SubLSymbol $simplify_evaluatable_expressionsP$ = makeSymbol("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*");

    // defparameter
    // must evaluatable literals be satisfiable to be deemed wffs?
    public static final SubLSymbol $enforce_evaluatable_satisfiabilityP$ = makeSymbol("*ENFORCE-EVALUATABLE-SATISFIABILITY?*");

    // defparameter
    /**
     * must predicates of gafs asserted to vocab mts must be definitional
     * predicates?
     */
    public static final SubLSymbol $enforce_only_definitional_gafs_in_vocab_mtP$ = makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*");

    // defparameter
    /**
     * whether to inhibit asserting semantically dubious #$commutativeInArgs or
     * #$commutativeInArgsAndRest gafs, based on what is already in the KB, as
     * determined by @xref ok-wrt-partial-commutativity?
     */
    public static final SubLSymbol $inhibit_cyclic_commutative_in_argsP$ = makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*");

    // defparameter
    /**
     * Whether we note more than one wff violation, and continue at wff checks even
     * after failure.
     */
    public static final SubLSymbol $accumulating_wff_violationsP$ = makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*");

    // defparameter
    // should wff violations be recorded for presentation?
    public static final SubLSymbol $noting_wff_violationsP$ = makeSymbol("*NOTING-WFF-VIOLATIONS?*");

    // defparameter
    // should sufficient defn violations be included in wff violations?
    public static final SubLSymbol $include_suf_defn_violationsP$ = makeSymbol("*INCLUDE-SUF-DEFN-VIOLATIONS?*");

    // defparameter
    // require wff literals to pass idiosyncratic constraints?
    public static final SubLSymbol $enforce_literal_wff_idiosyncrasiesP$ = makeSymbol("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*");

    // defparameter
    // is wff module only gathering terse violation data?
    public static final SubLSymbol $wff_violation_data_terseP$ = makeSymbol("*WFF-VIOLATION-DATA-TERSE?*");

    // defparameter
    // transient state variable; is t during the execution of kwt-wff?
    public static final SubLSymbol $permit_keyword_variablesP$ = makeSymbol("*PERMIT-KEYWORD-VARIABLES?*");

    // defparameter
    // transient state variable; is t sometimes and nil other times
    public static final SubLSymbol $permit_generic_arg_variablesP$ = makeSymbol("*PERMIT-GENERIC-ARG-VARIABLES?*");

    // defparameter
    // should wff tests be applied to expansions (in addition to given form)?
    public static final SubLSymbol $validate_expansionsP$ = makeSymbol("*VALIDATE-EXPANSIONS?*");

    // defparameter
    // transient state variable; is t during the execution of wff?
    public static final SubLSymbol $within_wffP$ = makeSymbol("*WITHIN-WFF?*");

    // deflexical
    private static final SubLSymbol $wff_modes$ = makeSymbol("*WFF-MODES*");

    // defparameter
    public static final SubLSymbol $wff_constraint_mt$ = makeSymbol("*WFF-CONSTRAINT-MT*");

    // defparameter
    // formula being appraised by wff module
    public static final SubLSymbol $wff_formula$ = makeSymbol("*WFF-FORMULA*");

    // defparameter
    // original formula being appraised by wff module
    public static final SubLSymbol $wff_original_formula$ = makeSymbol("*WFF-ORIGINAL-FORMULA*");

    // defparameter
    // expansion formula being appraised by wff module
    public static final SubLSymbol $wff_expansion_formula$ = makeSymbol("*WFF-EXPANSION-FORMULA*");

    // defparameter
    // descriptions of how the current argument to wff? is incoherent
    public static final SubLSymbol $coherence_violations$ = makeSymbol("*COHERENCE-VIOLATIONS*");

    // defparameter
    // descriptions of how the current argument to wff? is invalid
    public static final SubLSymbol $wff_violations$ = makeSymbol("*WFF-VIOLATIONS*");

    // defparameter
    /**
     * descriptions of how a relational expresion is not valid wrt arity constraints
     */
    public static final SubLSymbol $arity_violations$ = makeSymbol("*ARITY-VIOLATIONS*");

    // defparameter
    /**
     * suggestions for making a non-wff formula wff will be attempted with this is
     * non-nil
     */
    public static final SubLSymbol $provide_wff_suggestionsP$ = makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*");

    // defparameter
    // descriptions of how the current invalid argument to wff? can be fixed
    public static final SubLSymbol $wff_suggestions$ = makeSymbol("*WFF-SUGGESTIONS*");

    // defparameter
    /**
     * transient state variable; contains the current memoization state during
     * execution of wff?
     */
    public static final SubLSymbol $wff_memoization_state$ = makeSymbol("*WFF-MEMOIZATION-STATE*");

    // defparameter
    // within wff tests applied to expansion (in addition to given form)?
    public static final SubLSymbol $validating_expansionP$ = makeSymbol("*VALIDATING-EXPANSION?*");

    // defparameter
    // original formula whose expansion is being considered?
    public static final SubLSymbol $unexpanded_formula$ = makeSymbol("*UNEXPANDED-FORMULA*");





    public static final SubLSymbol $wff_mode$ = makeSymbol("*WFF-MODE*");



    public static final SubLSymbol $sym4$_WFF_DEBUG__ = makeSymbol("*WFF-DEBUG?*");

    private static final SubLSymbol $kw5$VALIDATE_CONSTANTS_ = makeKeyword("VALIDATE-CONSTANTS?");

    public static final SubLSymbol $sym6$_VALIDATE_CONSTANTS__ = makeSymbol("*VALIDATE-CONSTANTS?*");

    private static final SubLSymbol $kw7$RECOGNIZE_VARIABLES_ = makeKeyword("RECOGNIZE-VARIABLES?");

    public static final SubLSymbol $sym8$_RECOGNIZE_VARIABLES__ = makeSymbol("*RECOGNIZE-VARIABLES?*");

    private static final SubLSymbol $kw9$REJECT_SBHL_CONFLICTS_ = makeKeyword("REJECT-SBHL-CONFLICTS?");

    public static final SubLSymbol $sym10$_REJECT_SBHL_CONFLICTS__ = makeSymbol("*REJECT-SBHL-CONFLICTS?*");

    private static final SubLSymbol $kw11$INHIBIT_SKOLEM_ASSERTS_ = makeKeyword("INHIBIT-SKOLEM-ASSERTS?");

    public static final SubLSymbol $sym12$_INHIBIT_SKOLEM_ASSERTS__ = makeSymbol("*INHIBIT-SKOLEM-ASSERTS?*");

    private static final SubLSymbol $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_ = makeKeyword("SIMPLIFY-EVALUATABLE-EXPRESSIONS?");

    public static final SubLSymbol $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__ = makeSymbol("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*");

    private static final SubLSymbol $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_ = makeKeyword("ENFORCE-EVALUATABLE-SATISFIABILITY?");

    public static final SubLSymbol $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__ = makeSymbol("*ENFORCE-EVALUATABLE-SATISFIABILITY?*");

    private static final SubLSymbol $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_ = makeKeyword("ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?");

    public static final SubLSymbol $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__ = makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*");

    private static final SubLSymbol $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_ = makeKeyword("INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?");

    public static final SubLSymbol $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__ = makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*");

    private static final SubLSymbol $kw21$ACCUMULATING_VIOLATIONS_ = makeKeyword("ACCUMULATING-VIOLATIONS?");

    public static final SubLSymbol $sym22$_ACCUMULATING_WFF_VIOLATIONS__ = makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*");

    private static final SubLSymbol $kw23$NOTING_VIOLATIONS_ = makeKeyword("NOTING-VIOLATIONS?");

    public static final SubLSymbol $sym24$_NOTING_WFF_VIOLATIONS__ = makeSymbol("*NOTING-WFF-VIOLATIONS?*");

    private static final SubLSymbol $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_ = makeKeyword("INCLUDE-SUF-DEFN-VIOLATIONS?");

    public static final SubLSymbol $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__ = makeSymbol("*INCLUDE-SUF-DEFN-VIOLATIONS?*");

    private static final SubLSymbol $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_ = makeKeyword("ENFORCE-LITERAL-IDIOSYNCRASIES?");

    public static final SubLSymbol $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__ = makeSymbol("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*");

    private static final SubLSymbol $kw29$VIOLATION_DATA_TERSE_ = makeKeyword("VIOLATION-DATA-TERSE?");

    public static final SubLSymbol $sym30$_WFF_VIOLATION_DATA_TERSE__ = makeSymbol("*WFF-VIOLATION-DATA-TERSE?*");

    private static final SubLSymbol $kw31$PERMIT_KEYWORD_VARIABLES_ = makeKeyword("PERMIT-KEYWORD-VARIABLES?");

    public static final SubLSymbol $sym32$_PERMIT_KEYWORD_VARIABLES__ = makeSymbol("*PERMIT-KEYWORD-VARIABLES?*");

    private static final SubLSymbol $kw33$PERMIT_GENERIC_ARG_VARIABLES_ = makeKeyword("PERMIT-GENERIC-ARG-VARIABLES?");

    public static final SubLSymbol $sym34$_PERMIT_GENERIC_ARG_VARIABLES__ = makeSymbol("*PERMIT-GENERIC-ARG-VARIABLES?*");

    private static final SubLSymbol $kw35$VALIDATE_EXPANSIONS_ = makeKeyword("VALIDATE-EXPANSIONS?");

    public static final SubLSymbol $sym36$_VALIDATE_EXPANSIONS__ = makeSymbol("*VALIDATE-EXPANSIONS?*");









    private static final SubLSymbol $NL_TERM_MAP = makeKeyword("NL-TERM-MAP");

    private static final SubLSymbol $NL_LIST_OUTPUT = makeKeyword("NL-LIST-OUTPUT");





    private static final SubLSymbol WFF_PROPERTY_P = makeSymbol("WFF-PROPERTY-P");

    private static final SubLSymbol WFF_MODE_P = makeSymbol("WFF-MODE-P");

    private static final SubLList $list47 = list(makeKeyword("STRICT"), makeKeyword("LENIENT"), makeKeyword("ASSERTIVE"));





    static final boolean assertionsDisabledSynth = true;

    public static SubLObject wff_properties_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_properties_table$.getDynamicValue(thread);
    }

    public static SubLObject note_wff_property(final SubLObject keyword, final SubLObject variable, final SubLObject v_default) {
        return dictionary.dictionary_enter(wff_properties_table(), keyword, list(variable, v_default));
    }

    public static SubLObject wff_property_variable(final SubLObject property) {
        return dictionary.dictionary_lookup(wff_properties_table(), property, UNPROVIDED).first();
    }

    public static SubLObject wff_property_default(final SubLObject property) {
        return second(dictionary.dictionary_lookup(wff_properties_table(), property, UNPROVIDED));
    }

    public static SubLObject get_wff_property(final SubLObject v_properties, final SubLObject property) {
        return getf(v_properties, property, wff_property_default(property));
    }

    public static SubLObject wff_property_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != dictionary_utilities.dictionary_has_keyP(wff_properties_table(), v_object)));
    }

    public static SubLObject wff_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_properties$.getDynamicValue(thread);
    }

    public static SubLObject wff_debugP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_debugP$.getDynamicValue(thread);
    }

    public static SubLObject wff_violation_data_terseP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_violation_data_terseP$.getDynamicValue(thread);
    }

    public static SubLObject check_wff_properties(final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != wff_property_p(property) : "wff_vars.wff_property_p(property) " + "CommonSymbols.NIL != wff_vars.wff_property_p(property) " + property;
        }
        if (((NIL != getf(v_properties, $WFF_MODE, NIL)) && (!assertionsDisabledSynth)) && (NIL == wff_mode_p(getf(v_properties, $WFF_MODE, NIL)))) {
            throw new AssertionError(getf(v_properties, $WFF_MODE, NIL));
        }
        return NIL;
    }

    public static SubLObject wff_mode_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $wff_modes$.getGlobalValue());
    }

    public static SubLObject wff_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_mode$.getDynamicValue(thread);
    }

    public static SubLObject wff_strictP() {
        return eq($STRICT, wff_mode());
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

    public static SubLObject wff_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_formula$.getDynamicValue(thread);
    }

    public static SubLObject wff_original_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_original_formula$.getDynamicValue(thread);
    }

    public static SubLObject wff_expansion_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $wff_expansion_formula$.getDynamicValue(thread);
    }

    public static SubLObject validating_expansionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $validating_expansionP$.getDynamicValue(thread);
    }

    public static SubLObject validate_expansionsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $validate_expansionsP$.getDynamicValue(thread)) && (NIL == validating_expansionP()));
    }

    public static SubLObject unexpanded_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $unexpanded_formula$.getDynamicValue(thread);
    }

    public static SubLObject declare_wff_vars_file() {
        declareFunction(me, "wff_properties_table", "WFF-PROPERTIES-TABLE", 0, 0, false);
        declareFunction(me, "note_wff_property", "NOTE-WFF-PROPERTY", 3, 0, false);
        declareFunction(me, "wff_property_variable", "WFF-PROPERTY-VARIABLE", 1, 0, false);
        declareFunction(me, "wff_property_default", "WFF-PROPERTY-DEFAULT", 1, 0, false);
        declareFunction(me, "get_wff_property", "GET-WFF-PROPERTY", 2, 0, false);
        declareFunction(me, "wff_property_p", "WFF-PROPERTY-P", 1, 0, false);
        declareFunction(me, "wff_properties", "WFF-PROPERTIES", 0, 0, false);
        declareFunction(me, "wff_debugP", "WFF-DEBUG?", 0, 0, false);
        declareFunction(me, "wff_violation_data_terseP", "WFF-VIOLATION-DATA-TERSE?", 0, 0, false);
        declareFunction(me, "check_wff_properties", "CHECK-WFF-PROPERTIES", 1, 0, false);
        declareFunction(me, "wff_mode_p", "WFF-MODE-P", 1, 0, false);
        declareFunction(me, "wff_mode", "WFF-MODE", 0, 0, false);
        declareFunction(me, "wff_strictP", "WFF-STRICT?", 0, 0, false);
        declareFunction(me, "wff_lenientP", "WFF-LENIENT?", 0, 0, false);
        declareFunction(me, "wff_assertiveP", "WFF-ASSERTIVE?", 0, 0, false);
        declareFunction(me, "wff_constraint_mt", "WFF-CONSTRAINT-MT", 0, 0, false);
        declareFunction(me, "wff_formula", "WFF-FORMULA", 0, 0, false);
        declareFunction(me, "wff_original_formula", "WFF-ORIGINAL-FORMULA", 0, 0, false);
        declareFunction(me, "wff_expansion_formula", "WFF-EXPANSION-FORMULA", 0, 0, false);
        declareFunction(me, "validating_expansionP", "VALIDATING-EXPANSION?", 0, 0, false);
        declareFunction(me, "validate_expansionsP", "VALIDATE-EXPANSIONS?", 0, 0, false);
        declareFunction(me, "unexpanded_formula", "UNEXPANDED-FORMULA", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_wff_vars_file() {
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

    public static SubLObject setup_wff_vars_file() {
        note_wff_property($WFF_MODE, $wff_mode$, $ASSERTIVE);
        note_wff_property($DEBUG_, $sym4$_WFF_DEBUG__, NIL);
        note_wff_property($kw5$VALIDATE_CONSTANTS_, $sym6$_VALIDATE_CONSTANTS__, T);
        note_wff_property($kw7$RECOGNIZE_VARIABLES_, $sym8$_RECOGNIZE_VARIABLES__, T);
        note_wff_property($kw9$REJECT_SBHL_CONFLICTS_, $sym10$_REJECT_SBHL_CONFLICTS__, T);
        note_wff_property($kw11$INHIBIT_SKOLEM_ASSERTS_, $sym12$_INHIBIT_SKOLEM_ASSERTS__, T);
        note_wff_property($kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__, NIL);
        note_wff_property($kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__, T);
        note_wff_property($kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__, NIL);
        note_wff_property($kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__, T);
        note_wff_property($kw21$ACCUMULATING_VIOLATIONS_, $sym22$_ACCUMULATING_WFF_VIOLATIONS__, NIL);
        note_wff_property($kw23$NOTING_VIOLATIONS_, $sym24$_NOTING_WFF_VIOLATIONS__, NIL);
        note_wff_property($kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__, T);
        note_wff_property($kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__, T);
        note_wff_property($kw29$VIOLATION_DATA_TERSE_, $sym30$_WFF_VIOLATION_DATA_TERSE__, NIL);
        note_wff_property($kw31$PERMIT_KEYWORD_VARIABLES_, $sym32$_PERMIT_KEYWORD_VARIABLES__, NIL);
        note_wff_property($kw33$PERMIT_GENERIC_ARG_VARIABLES_, $sym34$_PERMIT_GENERIC_ARG_VARIABLES__, NIL);
        note_wff_property($kw35$VALIDATE_EXPANSIONS_, $sym36$_VALIDATE_EXPANSIONS__, NIL);
        note_wff_property($IO_MODE, NIL, $NL);
        note_wff_property($NL_VERBOSITY, NIL, $VERBOSE);
        note_wff_property($NL_TERM_MAP, NIL, NIL);
        note_wff_property($NL_LIST_OUTPUT, NIL, NIL);
        note_wff_property($VIOLATIONS, NIL, NIL);
        return NIL;
    }

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
