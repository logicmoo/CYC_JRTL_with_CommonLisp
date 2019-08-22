package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class variable_unification extends SubLTranslatedFile {
    public static final SubLFile me = new variable_unification();

    public static final String myName = "com.cyc.cycjava.cycl.variable_unification";

    public static final String myFingerPrint = "9d0e66c6f2e88020263f45ab848a43d619390aeeac2988efb1d0d4cf9a2f283c";

    // deflexical
    private static final SubLSymbol $variable_similarity_default_fudge_factor$ = makeSymbol("*VARIABLE-SIMILARITY-DEFAULT-FUDGE-FACTOR*");

    // defparameter
    // The Mt to use in literal-set-> (if any).
    private static final SubLSymbol $literal_set_G_mt$ = makeSymbol("*LITERAL-SET->-MT*");



    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("NEGATION-OPERATOR"), makeSymbol("NEGATED-SENTENCE"));

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("or")));



    public static final SubLSymbol APPLY_DEMORGANS = makeSymbol("APPLY-DEMORGANS");

    public static final SubLList $list4 = list(reader_make_constant_shell(makeString("and")));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    public static final SubLSymbol CONVERT_TO_DNF_INT = makeSymbol("CONVERT-TO-DNF-INT");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    public static final SubLSymbol COLLAPSE_GROUPS = makeSymbol("COLLAPSE-GROUPS");

    public static final SubLSymbol GATHER_DNF_ARG_CONSTRAINTS_INT = makeSymbol("GATHER-DNF-ARG-CONSTRAINTS-INT");



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    public static final SubLList $list13 = list(list(makeKeyword("TEST"), makeSymbol("IRREFLEXIVE-PREDICATE?")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("BIND"), makeSymbol("VAR1"))), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("BIND"), makeSymbol("VAR2"))));

    public static final SubLSymbol VAR2 = makeSymbol("VAR2");



    public static final SubLSymbol GET_VAR_MAP_FOR_FORMULA = makeSymbol("GET-VAR-MAP-FOR-FORMULA");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list18 = list(list(makeKeyword("BIND"), makeSymbol("COL")));



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    public static final SubLSymbol VARIABLE_SIMILARITY = makeSymbol("VARIABLE-SIMILARITY");

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    public static final SubLSymbol $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_ = makeSymbol("VARIABLE-SIMILARITY-ABOUT-THE-SAME?");

    public static final SubLSymbol $sym26$CYC_VAR_ = makeSymbol("CYC-VAR?");



    private static final SubLList $list28 = cons(makeSymbol("VAR1"), makeSymbol("VARS"));

    public static final SubLList $list29 = cons(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VARS"));



    private static final SubLList $list31 = cons(reader_make_constant_shell(makeString("and")), makeKeyword("ANYTHING"));

    private static final SubLSymbol $sym32$CAR_CDR_EQUAL_ = makeSymbol("CAR-CDR-EQUAL?");

    private static final SubLSymbol FIND_REDUNDANT_LITERALS = makeSymbol("FIND-REDUNDANT-LITERALS");

    private static final SubLList $list34 = cons(reader_make_constant_shell(makeString("or")), makeKeyword("ANYTHING"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLSymbol $sym38$LITERAL_SET__ = makeSymbol("LITERAL-SET->");

    private static final SubLSymbol SET_ELEMENT_LIST = makeSymbol("SET-ELEMENT-LIST");

    private static final SubLSymbol $sym40$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

    private static final SubLSymbol LITERAL_FREE_VARIABLES_CACHED = makeSymbol("LITERAL-FREE-VARIABLES-CACHED");

    private static final SubLSymbol $literal_free_variables_cached_caching_state$ = makeSymbol("*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*");



    private static final SubLSymbol FIND_UNCONNECTED_LITERALS = makeSymbol("FIND-UNCONNECTED-LITERALS");

    private static final SubLSymbol FIND_INCONSISTENT_LITERALS = makeSymbol("FIND-INCONSISTENT-LITERALS");

    private static final SubLSymbol ARG_POSITIONS_EQ = makeSymbol("ARG-POSITIONS-EQ");







    private static final SubLList $list51 = list(makeSymbol("CAE-TEST-CASE-TABLES"), makeSymbol("VARIABLE-UNIFICATION-TEST-CASE-TABLES"));







    private static final SubLList $list55 = list(list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing")))))), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing")))))));

    private static final SubLSymbol $sym56$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLSymbol GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST = makeSymbol("GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST");

    private static final SubLSymbol $sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_ = makeSymbol("INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?");



    private static final SubLObject $list60 = _constant_60_initializer();

    public static final SubLList $list61 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y"))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), makeSymbol("?Z")))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), makeSymbol("?Z")))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?W"), makeSymbol("?V")))), list(list(THREE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), NIL), list(list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Collection"))))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?W"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection"))))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection"))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))))), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Z")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"))))), list(list(TWO_INTEGER, TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("concomitantProcedures")), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SURG-PROC"), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?SURG-PROC"), makeSymbol("?PAT"))))))), NIL), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("concomitantProcedures")), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SURG-PROC"), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?SURG-PROC"), makeSymbol("?PAT")))))), list(list(TWO_INTEGER, TWO_INTEGER, TWO_INTEGER))) });

    public static final SubLList $list62 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Event"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Person")))), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), reader_make_constant_shell(makeString("Pi-Number")))), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), reader_make_constant_shell(makeString("Pi-Number"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Event")))), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Event"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), reader_make_constant_shell(makeString("Pi-Number")))), reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(TWO_INTEGER))));

    public static SubLObject apply_demorgans(final SubLObject formula) {
        if (NIL == el_formula_p(formula)) {
            return formula;
        }
        if (NIL != el_negation_or_unknown_sentence_p(formula)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(formula, UNPROVIDED);
            SubLObject negation_operator = NIL;
            SubLObject negated_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            negation_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            negated_sentence = current.first();
            current = current.rest();
            if (NIL != current) {
                cdestructuring_bind_error(datum, $list0);
                return NIL;
            }
            if (NIL != el_conjunction_p(negated_sentence)) {
                SubLObject ans = $list1;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_negation_or_unknown_sentence_p(child)) {
                        ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                    } else {
                        ans = append(ans, list(apply_demorgans(make_unary_formula(negation_operator, child))));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
                return ans;
            }
            if (NIL != el_disjunction_p(negated_sentence)) {
                SubLObject ans = $list4;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_negation_or_unknown_sentence_p(child)) {
                        ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                    } else {
                        ans = append(ans, list(apply_demorgans(make_unary_formula(negation_operator, child))));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
                return ans;
            }
            if (NIL != el_existential_p(negated_sentence)) {
                return make_universal(quantified_var(negated_sentence), apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
            }
            if (NIL != el_universal_p(negated_sentence)) {
                return make_existential(quantified_var(negated_sentence), apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
            }
            return formula;
        } else {
            if (NIL != el_conjunction_p(formula)) {
                return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
            }
            if (NIL != el_disjunction_p(formula)) {
                return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
            }
            return formula;
        }
    }

    public static SubLObject el_negation_or_unknown_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_negation_p(v_object)) || (NIL != el_formula_with_operator_p(v_object, $$unknownSentence)));
    }

    public static SubLObject separate_bindings_from_sentence(final SubLObject formula) {
        return separate_bindings_recursive(formula);
    }

    public static SubLObject separate_bindings_recursive(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term = v_term;
        SubLObject quantifiers = NIL;
        if (NIL != el_formula_p(v_term)) {
            if (NIL == literalP(v_term)) {
                if ((NIL != el_existential_p(v_term)) || (NIL != el_universal_p(v_term))) {
                    new_term = quantified_sub_sentence(v_term);
                    quantifiers = list(list_utilities.first_n(TWO_INTEGER, v_term));
                } else {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_term, $IGNORE);
                    SubLObject child = NIL;
                    child = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        thread.resetMultipleValues();
                        final SubLObject new_arg = separate_bindings_recursive(child);
                        final SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_term = nreplace_formula_arg(argnum, new_arg, new_term);
                        quantifiers = append(quantifiers, v_bindings);
                        cdolist_list_var = cdolist_list_var.rest();
                        child = cdolist_list_var.first();
                    } 
                }
            }
        }
        return values(new_term, quantifiers);
    }

    public static SubLObject collapse_groups(final SubLObject formula) {
        if ((NIL == el_formula_p(formula)) || (NIL != narts_high.naut_p(formula))) {
            return formula;
        }
        if ((NIL == el_conjunction_p(formula)) && (NIL == el_disjunction_p(formula))) {
            return formula;
        }
        final SubLObject children = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject new_children = NIL;
        SubLObject cdolist_list_var = children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            child = collapse_groups(child);
            if (child.isList() && child.first().eql(formula.first())) {
                new_children = append(new_children, child.rest());
            } else {
                new_children = append(new_children, list(child));
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthE(new_children, ONE_INTEGER, UNPROVIDED)) {
            return new_children.first();
        }
        return make_el_formula(formula.first(), new_children, UNPROVIDED);
    }

    public static SubLObject convert_to_dnf_int(final SubLObject formula) {
        if ((NIL == el_conjunction_p(formula)) && (NIL == el_disjunction_p(formula))) {
            return formula;
        }
        final SubLObject old_operator = formula.first();
        final SubLObject old_children = formula.rest();
        SubLObject new_children = Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), old_children);
        final SubLObject new_formula = collapse_groups(cons(old_operator, new_children));
        new_children = new_formula.rest();
        if ((!new_formula.isList()) || (!new_formula.first().eql($$and))) {
            return new_formula;
        }
        SubLObject or_child = NIL;
        SubLObject cdolist_list_var = new_children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (child.isList() && child.first().eql($$or)) {
                or_child = child;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        if (NIL == or_child) {
            return new_formula;
        }
        new_children = remove(or_child, new_children, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject or_formula = $list1;
        SubLObject cdolist_list_var2;
        final SubLObject or_children = cdolist_list_var2 = or_child.rest();
        SubLObject child2 = NIL;
        child2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            child2 = collapse_groups(append(cons($$and, new_children), list(child2)));
            or_formula = cons(child2, or_formula);
            cdolist_list_var2 = cdolist_list_var2.rest();
            child2 = cdolist_list_var2.first();
        } 
        or_formula = reverse(or_formula);
        return collapse_groups(cons(or_formula.first(), Mapping.mapcar(symbol_function(COLLAPSE_GROUPS), Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), or_formula.rest()))));
    }

    public static SubLObject convert_to_dnf(final SubLObject formula, SubLObject apply_demorgansP) {
        if (apply_demorgansP == UNPROVIDED) {
            apply_demorgansP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject new_formula = separate_bindings_from_sentence(NIL != apply_demorgansP ? apply_demorgans(formula) : copy_list(formula));
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_formula = collapse_groups(new_formula);
        new_formula = convert_to_dnf_int(new_formula);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_formula = append(binding, list(new_formula));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return new_formula;
    }

    public static SubLObject gather_dnf_arg_constraints_int(final SubLObject formula, final SubLObject mt) {
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject mt_list = make_list(length(args), mt);
        SubLObject ans = (NIL != el_conjunction_p(formula)) ? simplifier.conjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), args, new SubLObject[]{ mt_list }), UNPROVIDED) : NIL != el_disjunction_p(formula) ? simplifier.disjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), args, new SubLObject[]{ mt_list }), UNPROVIDED) : NIL != el_existential_p(formula) ? replace_formula_arg(TWO_INTEGER, gather_dnf_arg_constraints_int(cycl_utilities.formula_arg2(formula, UNPROVIDED), mt), formula) : NIL != el_universal_p(formula) ? replace_formula_arg(TWO_INTEGER, gather_dnf_arg_constraints_int(cycl_utilities.formula_arg2(formula, UNPROVIDED), mt), formula) : NIL != el_negation_or_unknown_sentence_p(formula) ? gather_dnf_arg_constraints_int(cycl_utilities.formula_arg1(formula, UNPROVIDED), mt) : at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
        ans = list_utilities.tree_remove_all_if(symbol_function(NULL), ans, UNPROVIDED);
        ans = collapse_groups(ans);
        return ans;
    }

    public static SubLObject gather_dnf_arg_constraints(final SubLObject formula, final SubLObject mt) {
        final SubLObject dnf = convert_to_dnf(formula, UNPROVIDED);
        final SubLObject constraints = gather_dnf_arg_constraints_int(dnf, mt);
        return convert_to_dnf(constraints, UNPROVIDED);
    }

    public static SubLObject can_unifyP(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        return makeBoolean(NIL == find(var2, dictionary.dictionary_lookup(get_incompatible_variables_in_complex_sentence(formula, mt), var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_incompatible_variables_in_complex_sentence(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_disjunction = gather_dnf_arg_constraints(formula, mt);
        final SubLObject constraints = (NIL != el_disjunction_p(constraint_disjunction)) ? cycl_utilities.formula_args(constraint_disjunction, UNPROVIDED) : NIL != constraint_disjunction ? list(constraint_disjunction) : NIL;
        final SubLObject incompatibles = find_irreflexive_incompatibles(formula, mt);
        if (NIL != list_utilities.non_empty_list_p(constraints)) {
            SubLObject cdolist_list_var;
            final SubLObject vars = cdolist_list_var = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = vars;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL == known_incompatible_varsP(incompatibles, var1, var2)) {
                        SubLObject candidateP = NIL;
                        SubLObject compatibleP = NIL;
                        SubLObject cdolist_list_var_$2 = constraints;
                        SubLObject possibility = NIL;
                        possibility = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if ((NIL != list_utilities.tree_find(var1, possibility, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.tree_find(var2, possibility, UNPROVIDED, UNPROVIDED))) {
                                candidateP = T;
                                final SubLObject varmap = get_var_map_for_formula(possibility, mt);
                                add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap), incompatibles);
                                if (NIL == known_incompatible_varsP(incompatibles, var1, var2)) {
                                    compatibleP = T;
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            possibility = cdolist_list_var_$2.first();
                        } 
                        if ((NIL != candidateP) && (NIL == compatibleP)) {
                            dictionary_utilities.dictionary_pushnew(incompatibles, var1, var2, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var2, var1, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    var2 = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                var1 = cdolist_list_var.first();
            } 
            return incompatibles;
        }
        final SubLObject varmap2 = get_var_map_for_formula(constraints, mt);
        add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap2), incompatibles);
        return incompatibles;
    }

    public static SubLObject find_irreflexive_incompatibles(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject incompatibles = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject clausal_form = clausifier.cnf_clausal_form(formula, mt);
        if (!$$True.eql(clausal_form)) {
            SubLObject cdolist_list_var = clausal_form;
            SubLObject disjunction = NIL;
            disjunction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = disjunction;
                SubLObject lits = NIL;
                lits = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    SubLObject cdolist_list_var_$4 = lits;
                    SubLObject lit = NIL;
                    lit = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        thread.resetMultipleValues();
                        final SubLObject success = formula_pattern_match.formula_matches_pattern(lit, $list13);
                        final SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            final SubLObject var2 = list_utilities.alist_lookup_without_values(v_bindings, VAR2, UNPROVIDED, UNPROVIDED);
                            final SubLObject var3 = list_utilities.alist_lookup_without_values(v_bindings, VAR1, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var3, var2, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var2, var3, UNPROVIDED, UNPROVIDED);
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        lit = cdolist_list_var_$4.first();
                    } 
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    lits = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                disjunction = cdolist_list_var.first();
            } 
        }
        return incompatibles;
    }

    public static SubLObject add_incompatibles(SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject incompatible_vars = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = incompatible_vars;
            SubLObject incompatible_var = NIL;
            incompatible_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_pushnew(target, var, incompatible_var, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                incompatible_var = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target;
    }

    public static SubLObject known_incompatible_varsP(final SubLObject incompatibles, final SubLObject var1, final SubLObject var2) {
        return find(var2, dictionary.dictionary_lookup_without_values(incompatibles, var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_var_map_for_formula_internal(final SubLObject formula, final SubLObject mt) {
        return value_tables.get_variable_mapping_table_for_formulas(formula, formula, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_var_map_for_formula(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return get_var_map_for_formula_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_VAR_MAP_FOR_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(get_var_map_for_formula_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_incompatible_variables_in_complex_sentence_as_alist(final SubLObject formula, final SubLObject mt) {
        final SubLObject v_dictionary = get_incompatible_variables_in_complex_sentence(formula, mt);
        return dictionary_utilities.dictionary_to_alist(v_dictionary);
    }

    public static SubLObject gather_constraining_types_for_variable_in_constraint_conjunction(final SubLObject formula, final SubLObject var, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_universal_p(formula)) || (NIL != el_general_existential_p(formula))) {
            return gather_constraining_types_for_variable_in_constraint_conjunction(quantified_sub_sentence(formula), var, mt);
        }
        final SubLObject literals = (NIL != el_conjunction_p(formula)) ? cycl_utilities.formula_args(formula, UNPROVIDED) : list(formula);
        final SubLObject isa_types = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject genls_types = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_negation_or_unknown_sentence_p(literal)) {
                literal = cycl_utilities.formula_arg1(literal, UNPROVIDED);
                thread.resetMultipleValues();
                SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list18));
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), isa_types);
                }
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list18));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), genls_types);
                }
            } else {
                thread.resetMultipleValues();
                SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list18));
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), isa_types);
                }
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list18));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), genls_types);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return values(isa_types, genls_types);
    }

    public static SubLObject variable_similarity_given_constraint_conjunction(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_types1 = gather_constraining_types_for_variable_in_constraint_conjunction(formula, var1, mt);
        final SubLObject genls_types1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject isa_types2 = gather_constraining_types_for_variable_in_constraint_conjunction(formula, var2, mt);
        final SubLObject genls_types2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((set.set_size(isa_types1).numG(ZERO_INTEGER) && set.set_size(isa_types2).numG(ZERO_INTEGER)) || (set.set_size(genls_types1).numG(ZERO_INTEGER) && set.set_size(genls_types2).numG(ZERO_INTEGER))) {
            final SubLObject isa_types3 = set_utilities.set_intersection(list(isa_types1, isa_types2), UNPROVIDED);
            final SubLObject genls_types3 = set_utilities.set_intersection(list(genls_types1, genls_types2), UNPROVIDED);
            SubLObject score = $float$0_0;
            SubLObject set_contents_var = set.do_set_internal(isa_types3);
            SubLObject basis_object;
            SubLObject state;
            SubLObject type;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                type = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                    score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                }
            }
            set_contents_var = set.do_set_internal(genls_types3);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                type = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                    score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                }
            }
            return score;
        }
        return NIL;
    }

    public static SubLObject variable_similarity_internal(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        SubLObject total = $float$0_0;
        SubLObject count = ZERO_INTEGER;
        final SubLObject constraints = gather_dnf_arg_constraints(formula, mt);
        SubLObject cdolist_list_var;
        final SubLObject constraint_conjunctions = cdolist_list_var = (constraints.isList() && constraints.first().eql($$or)) ? constraints.rest() : list(constraints);
        SubLObject constraint_conjunction = NIL;
        constraint_conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_similarity = variable_similarity_given_constraint_conjunction(constraint_conjunction, var1, var2, mt);
            if (NIL != v_similarity) {
                total = add(v_similarity, total);
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_conjunction = cdolist_list_var.first();
        } 
        if (count.numG(ZERO_INTEGER)) {
            return divide(total, count);
        }
        return NIL;
    }

    public static SubLObject variable_similarity(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return variable_similarity_internal(formula, var1, var2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VARIABLE_SIMILARITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VARIABLE_SIMILARITY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, VARIABLE_SIMILARITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, var1, var2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (var1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (var2.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(variable_similarity_internal(formula, var1, var2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, var1, var2, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject variable_similarity_about_the_sameP(final SubLObject sim1, final SubLObject sim2, SubLObject fudge_factor) {
        if (fudge_factor == UNPROVIDED) {
            fudge_factor = $variable_similarity_default_fudge_factor$.getGlobalValue();
        }
        if (sim1.numE(sim2)) {
            return T;
        }
        if ((fudge_factor.numG(ZERO_INTEGER) && multiply(fudge_factor, sim1).numG(sim2)) && multiply(fudge_factor, sim2).numG(sim1)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject attempt_to_combine_variables_in_complex_combination(final SubLObject formula, final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject allow_duplicate_literalsP, SubLObject free_variables_onlyP, SubLObject varP) {
        if (allow_duplicate_literalsP == UNPROVIDED) {
            allow_duplicate_literalsP = NIL;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        if (varP == UNPROVIDED) {
            varP = $sym26$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(varP) : "Types.function_spec_p(varP) " + "CommonSymbols.NIL != Types.function_spec_p(varP) " + varP;
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject incompatibles = get_incompatible_variables_in_complex_sentence(formula, elmt);
                final SubLObject source_vars = (NIL != free_variables_onlyP) ? sentence_free_variables(source_formula, NIL, varP, UNPROVIDED) : list_utilities.tree_gather(source_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject target_vars = (NIL != free_variables_onlyP) ? sentence_free_variables(target_formula, NIL, varP, UNPROVIDED) : list_utilities.tree_gather(target_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject hit_count = dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER);
                SubLObject matches = NIL;
                SubLObject cdolist_list_var = source_vars;
                SubLObject source_var_i = NIL;
                source_var_i = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5 = target_vars;
                    SubLObject target_var_j = NIL;
                    target_var_j = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, UNPROVIDED);
                        final SubLObject redundant = new_redundant_literals(formula, elmt, source_var_i, target_var_j);
                        if ((NIL != funcall(varP, source_var_i)) && (NIL != funcall(varP, target_var_j))) {
                            SubLObject possibleP = makeBoolean((NIL != allow_duplicate_literalsP) || (NIL == redundant));
                            if (((NIL != incomp) && (NIL != possibleP)) && (NIL != subl_promotions.memberP(target_var_j, incomp, UNPROVIDED, UNPROVIDED))) {
                                possibleP = NIL;
                            }
                            if ((NIL != possibleP) && (!source_var_i.eql(target_var_j))) {
                                matches = list_utilities.alist_push(matches, source_var_i, target_var_j, UNPROVIDED);
                                dictionary_utilities.dictionary_increment(hit_count, source_var_i, UNPROVIDED);
                                dictionary_utilities.dictionary_increment(hit_count, target_var_j, UNPROVIDED);
                            }
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        target_var_j = cdolist_list_var_$5.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    source_var_i = cdolist_list_var.first();
                } 
                cdolist_list_var = matches;
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject var1 = NIL;
                    SubLObject vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list28);
                    var1 = current.first();
                    current = vars = current.rest();
                    if (NIL != list_utilities.singletonP(vars)) {
                        final SubLObject var2 = list_utilities.only_one(vars);
                        final SubLObject var1_count = dictionary.dictionary_lookup_without_values(hit_count, var1, UNPROVIDED);
                        final SubLObject var2_count = dictionary.dictionary_lookup_without_values(hit_count, var2, UNPROVIDED);
                        if (var1_count.eql(ONE_INTEGER) && var2_count.eql(ONE_INTEGER)) {
                            result = list_utilities.alist_enter(result, var1, var2, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
                if ((NIL == result) && (NIL == list_utilities.empty_list_p(matches))) {
                    result = pick_variable_to_combine(matches, formula, elmt, allow_duplicate_literalsP);
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject pick_variable_to_combine(final SubLObject matches, final SubLObject formula, final SubLObject elmt, final SubLObject allow_duplicate_literalsP) {
        SubLObject scored = NIL;
        SubLObject cdolist_list_var = matches;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject source_var = NIL;
            SubLObject target_vars = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            source_var = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$7;
            target_vars = cdolist_list_var_$7 = current;
            SubLObject target_var = NIL;
            target_var = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                if ((NIL != allow_duplicate_literalsP) || (NIL == new_redundant_literals(formula, elmt, source_var, target_var))) {
                    final SubLObject score = variable_similarity(formula, source_var, target_var, elmt);
                    if (NIL != score) {
                        scored = list_utilities.alist_enter(scored, cons(source_var, target_var), score, UNPROVIDED);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                target_var = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject duplicates = list_utilities.duplicates(scored, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR);
        SubLObject non_duplicates = copy_list(scored);
        SubLObject cdolist_list_var2 = duplicates;
        SubLObject duplicate = NIL;
        duplicate = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            non_duplicates = delete(duplicate.rest(), non_duplicates, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            duplicate = cdolist_list_var2.first();
        } 
        if (NIL != list_utilities.non_empty_list_p(non_duplicates)) {
            final SubLObject best = number_utilities.maximum(non_duplicates, CDR).first();
            return list(best);
        }
        return NIL;
    }

    public static SubLObject literals_redundantP(final SubLObject literal1, final SubLObject literal2, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        if (!length(literal1).numE(length(literal2))) {
            return NIL;
        }
        SubLObject argpos = ZERO_INTEGER;
        SubLObject arg1 = NIL;
        SubLObject arg1_$8 = NIL;
        SubLObject arg2 = NIL;
        SubLObject arg2_$9 = NIL;
        arg1 = literal1;
        arg1_$8 = arg1.first();
        arg2 = literal2;
        arg2_$9 = arg2.first();
        while ((NIL != arg2) || (NIL != arg1)) {
            if ((((NIL != var1) && (NIL != var2)) && (((NIL == find(var1, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(var2, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || ((NIL == find(var1, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(var2, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) || (((((!argpos.numE(ZERO_INTEGER)) || ((NIL == genl_predicates.genl_predP(arg1_$8, arg2_$9, mt, UNPROVIDED)) && (NIL == genl_predicates.genl_predP(arg2_$9, arg1_$8, mt, UNPROVIDED)))) && ((NIL == cycl_variables.cyc_varP(arg1_$8)) || (!arg1_$8.equal(arg2_$9)))) && (((NIL == var1) || (NIL == var2)) || (((!arg1_$8.equal(var1)) || (!arg2_$9.equal(var2))) && ((!arg1_$8.equal(var2)) || (!arg2_$9.equal(var1)))))) && (((NIL != cycl_variables.cyc_varP(arg1_$8)) || (NIL != cycl_variables.cyc_varP(arg2_$9))) || ((NIL == genls.genlsP(arg1_$8, arg2_$9, mt, UNPROVIDED)) && (NIL == genls.genlsP(arg2_$9, arg1_$8, mt, UNPROVIDED)))))) {
                return NIL;
            }
            argpos = add(argpos, ONE_INTEGER);
            arg1 = arg1.rest();
            arg1_$8 = arg1.first();
            arg2 = arg2.rest();
            arg2_$9 = arg2.first();
        } 
        return T;
    }

    public static SubLObject redundant_literals_in_conjunctionP(final SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        SubLObject redundant_pairs = NIL;
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list31)) {
            SubLObject cdolist_list_var;
            final SubLObject literals = cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject literal1 = NIL;
            literal1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$10 = literals;
                SubLObject literal2 = NIL;
                literal2 = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if ((!literal1.eql(literal2)) && (NIL != literals_redundantP(literal1, literal2, mt, var1, var2))) {
                        redundant_pairs = cons(cons(literal1, literal2), redundant_pairs);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    literal2 = cdolist_list_var_$10.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                literal1 = cdolist_list_var.first();
            } 
        }
        return redundant_pairs;
    }

    public static SubLObject new_redundant_literals(final SubLObject formula, final SubLObject mt, final SubLObject var1, final SubLObject var2) {
        return remove_if($sym32$CAR_CDR_EQUAL_, find_redundant_literals_int(formula, mt, var1, var2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject car_cdr_equalP(final SubLObject pair) {
        return equal(pair.first(), pair.rest());
    }

    public static SubLObject find_redundant_literals(final SubLObject formula, final SubLObject mt) {
        return find_redundant_literals_int(formula, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_redundant_literals_int(SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        formula = convert_to_dnf(formula, UNPROVIDED);
        formula = separate_bindings_from_sentence(formula);
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list34)) {
            SubLObject redundant_pairs = NIL;
            SubLObject cdolist_list_var;
            final SubLObject conjunctions = cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject conjunction = NIL;
            conjunction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                redundant_pairs = append(redundant_pairs, redundant_literals_in_conjunctionP(conjunction, mt, var1, var2));
                cdolist_list_var = cdolist_list_var.rest();
                conjunction = cdolist_list_var.first();
            } 
            return redundant_pairs;
        }
        return redundant_literals_in_conjunctionP(formula, mt, var1, var2);
    }

    public static SubLObject shortest_paths_between_variables_in_conjunction(final SubLObject formula) {
        final SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
        final SubLObject variable_count = length(v_variables);
        final SubLObject literals = (formula.isList() && formula.first().eql($$and)) ? formula.rest() : list(formula);
        final SubLObject shortest_paths = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11;
            final SubLObject literal_variables = cdolist_list_var_$11 = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                SubLObject cdolist_list_var_$12 = literal_variables;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    if (var1.eql(var2)) {
                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ZERO_INTEGER);
                    } else {
                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ONE_INTEGER);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    var2 = cdolist_list_var_$12.first();
                } 
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                var1 = cdolist_list_var_$11.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        SubLObject i;
        SubLObject cdolist_list_var2;
        SubLObject var3;
        SubLObject cdolist_list_var_$13;
        SubLObject var4;
        SubLObject shortest_path;
        SubLObject cdolist_list_var_$14;
        SubLObject var1_2;
        SubLObject d1;
        SubLObject d2;
        SubLObject path_length;
        for (i = NIL, i = ZERO_INTEGER; i.numL(variable_count); i = add(i, ONE_INTEGER)) {
            cdolist_list_var2 = v_variables;
            var3 = NIL;
            var3 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                cdolist_list_var_$13 = v_variables;
                var4 = NIL;
                var4 = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    if (NIL == dictionary_utilities.dictionary_has_keyP(shortest_paths, list(var3, var4))) {
                        shortest_path = NIL;
                        cdolist_list_var_$14 = v_variables;
                        var1_2 = NIL;
                        var1_2 = cdolist_list_var_$14.first();
                        while (NIL != cdolist_list_var_$14) {
                            d1 = dictionary.dictionary_lookup(shortest_paths, list(var3, var1_2), UNPROVIDED);
                            d2 = dictionary.dictionary_lookup(shortest_paths, list(var1_2, var4), UNPROVIDED);
                            path_length = ((NIL != d1) && (NIL != d2)) ? add(d1, d2) : NIL;
                            if ((NIL != path_length) && ((NIL == shortest_path) || path_length.numL(shortest_path))) {
                                dictionary.dictionary_enter(shortest_paths, list(var3, var4), path_length);
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            var1_2 = cdolist_list_var_$14.first();
                        } 
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    var4 = cdolist_list_var_$13.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                var3 = cdolist_list_var2.first();
            } 
        }
        return dictionary_utilities.dictionary_to_alist(shortest_paths);
    }

    public static SubLObject find_fully_connected_subsets_in_conjunction(final SubLObject formula) {
        SubLObject sets = NIL;
        final SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
        final SubLObject literals = (NIL != el_conjunction_p(formula)) ? cycl_utilities.formula_args(formula, UNPROVIDED) : list(formula);
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_set = set.new_set(symbol_function(EQL), UNPROVIDED);
            set.set_add(variable, v_set);
            sets = cons(v_set, sets);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15;
            final SubLObject literal_variables = cdolist_list_var_$15 = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject cdolist_list_var_$16 = literal_variables;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    if (!var1.eql(var2)) {
                        SubLObject var1_set = NIL;
                        SubLObject var2_set = NIL;
                        SubLObject cdolist_list_var_$17 = sets;
                        SubLObject v_set2 = NIL;
                        v_set2 = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            if (NIL != set.set_memberP(var1, v_set2)) {
                                var1_set = v_set2;
                            }
                            if (NIL != set.set_memberP(var2, v_set2)) {
                                var2_set = v_set2;
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            v_set2 = cdolist_list_var_$17.first();
                        } 
                        if (!var1_set.eql(var2_set)) {
                            sets = remove(var1_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sets = remove(var2_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sets = cons(set_utilities.set_union(list(var1_set, var2_set), UNPROVIDED), sets);
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    var2 = cdolist_list_var_$16.first();
                } 
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                var1 = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = literals;
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((cycl_utilities.atomic_sentence_predicate(literal).eql($$not) || cycl_utilities.atomic_sentence_predicate(literal).eql($$unknownSentence)) || cycl_utilities.atomic_sentence_predicate(literal).eql($$assertedSentence)) {
                literal = cycl_utilities.formula_arg1(literal, UNPROVIDED);
            }
            final SubLObject literal_variables = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.empty_list_p(literal_variables)) {
                sets = cons(set_utilities.new_singleton_set(literal, symbol_function(EQ)), sets);
            } else {
                SubLObject cdolist_list_var_$18 = sets;
                SubLObject v_set3 = NIL;
                v_set3 = cdolist_list_var_$18.first();
                while (NIL != cdolist_list_var_$18) {
                    if ((NIL == literal_variables) || (NIL != set.set_memberP(literal_variables.first(), v_set3))) {
                        set.set_add(literal, v_set3);
                    }
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    v_set3 = cdolist_list_var_$18.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        SubLObject ans = NIL;
        SubLObject cdolist_list_var2 = sets;
        SubLObject v_set = NIL;
        v_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject set_as_list = set.set_element_list(v_set);
            ans = cons(remove_if(symbol_function($sym26$CYC_VAR_), set_as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_set = cdolist_list_var2.first();
        } 
        return ans;
    }

    public static SubLObject literal_set_G(final SubLObject set1, final SubLObject set2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variables1 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set1), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject variables2 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set2), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject consistent1 = makeBoolean(((NIL == $literal_set_G_mt$.getDynamicValue(thread)) || (!ONE_INTEGER.numE(set.set_size(set1)))) || (NIL != sentence_internally_consistentP(set.set_element_list(set1).first(), $literal_set_G_mt$.getDynamicValue(thread))));
        final SubLObject consistent2 = makeBoolean(((NIL == $literal_set_G_mt$.getDynamicValue(thread)) || (!ONE_INTEGER.numE(set.set_size(set2)))) || (NIL != sentence_internally_consistentP(set.set_element_list(set2).first(), $literal_set_G_mt$.getDynamicValue(thread))));
        if ((NIL != consistent1) && (NIL == consistent2)) {
            return T;
        }
        if ((NIL != consistent2) && (NIL == consistent1)) {
            return NIL;
        }
        if (set.set_size(set1).numG(set.set_size(set2))) {
            return T;
        }
        if (set.set_size(set1).numL(set.set_size(set2))) {
            return NIL;
        }
        if (length(variables1).numG(length(variables2))) {
            return T;
        }
        if (length(variables1).numL(length(variables2))) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject find_fully_connected_subsets(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dnf_formula = convert_to_dnf(formula, NIL);
        thread.resetMultipleValues();
        final SubLObject bare_dnf_formula = separate_bindings_from_sentence(dnf_formula);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject conjunctions = (NIL != el_disjunction_p(bare_dnf_formula)) ? cycl_utilities.el_formula_args(bare_dnf_formula, UNPROVIDED) : list(bare_dnf_formula);
        final SubLObject simple_disjunctionP = sublisp_null(find_if(EL_CONJUNCTION_P, conjunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject sets_of_connected_literals = NIL;
        final SubLObject all_literals = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = conjunctions;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$19;
            final SubLObject sets_of_connected_literals_in_conjunction = cdolist_list_var_$19 = find_fully_connected_subsets_in_conjunction(conjunction);
            SubLObject set_of_connected_literals_in_conjunction = NIL;
            set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                set_utilities.set_add_all(set_of_connected_literals_in_conjunction, all_literals);
                final SubLObject reused_set = (NIL != simple_disjunctionP) ? find_literal_set_with_vars(set_of_connected_literals_in_conjunction, sets_of_connected_literals) : NIL;
                final SubLObject v_set = (NIL != reused_set) ? reused_set : set.new_set(symbol_function(EQ), UNPROVIDED);
                set_utilities.set_add_all(set_of_connected_literals_in_conjunction, v_set);
                sets_of_connected_literals = cons(v_set, sets_of_connected_literals);
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            conjunction = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(all_literals);
        SubLObject basis_object;
        SubLObject state;
        SubLObject literal;
        SubLObject containing_sets;
        SubLObject cdolist_list_var2;
        SubLObject set_of_connected_literals;
        SubLObject containing_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            literal = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                containing_sets = NIL;
                cdolist_list_var2 = sets_of_connected_literals;
                set_of_connected_literals = NIL;
                set_of_connected_literals = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != set.set_memberP(literal, set_of_connected_literals)) {
                        containing_sets = cons(set_of_connected_literals, containing_sets);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    set_of_connected_literals = cdolist_list_var2.first();
                } 
                if (NIL != list_utilities.lengthG(containing_sets, ONE_INTEGER, UNPROVIDED)) {
                    cdolist_list_var2 = containing_sets;
                    containing_set = NIL;
                    containing_set = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sets_of_connected_literals = remove(containing_set, sets_of_connected_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        containing_set = cdolist_list_var2.first();
                    } 
                    sets_of_connected_literals = cons(set_utilities.set_union(containing_sets, UNPROVIDED), sets_of_connected_literals);
                }
            }
        }
        sets_of_connected_literals = Sort.sort(sets_of_connected_literals, symbol_function($sym38$LITERAL_SET__), UNPROVIDED);
        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_connected_literals);
    }

    public static SubLObject find_literal_set_with_vars(final SubLObject literals, final SubLObject sets) {
        SubLObject match = NIL;
        SubLObject vars = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20 = literal_free_variables_cached(literal);
            SubLObject var = NIL;
            var = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                final SubLObject item_var = var;
                if (NIL == member(item_var, vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                    vars = cons(item_var, vars);
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                var = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        vars = Sort.sort(vars, symbol_function($sym40$STRING_), symbol_function(EL_VAR_NAME));
        if ((NIL != vars) && (NIL == match)) {
            SubLObject csome_list_var = sets;
            SubLObject v_set = NIL;
            v_set = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                SubLObject set_vars = NIL;
                final SubLObject set_contents_var = set.do_set_internal(v_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject literal2;
                SubLObject cdolist_list_var2;
                SubLObject var2;
                SubLObject item_var2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    literal2 = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, literal2)) {
                        cdolist_list_var2 = literal_free_variables_cached(literal2);
                        var2 = NIL;
                        var2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            item_var2 = var2;
                            if (NIL == member(item_var2, set_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                                set_vars = cons(item_var2, set_vars);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            var2 = cdolist_list_var2.first();
                        } 
                    }
                }
                if (Sort.sort(remove_duplicates(set_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym40$STRING_), symbol_function(EL_VAR_NAME)).equal(vars)) {
                    match = v_set;
                }
                csome_list_var = csome_list_var.rest();
                v_set = csome_list_var.first();
            } 
        }
        return match;
    }

    public static SubLObject clear_literal_free_variables_cached() {
        final SubLObject cs = $literal_free_variables_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_literal_free_variables_cached(final SubLObject literal) {
        return memoization_state.caching_state_remove_function_results_with_args($literal_free_variables_cached_caching_state$.getGlobalValue(), list(literal), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject literal_free_variables_cached_internal(final SubLObject literal) {
        return literal_free_variables(literal, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject literal_free_variables_cached(final SubLObject literal) {
        SubLObject caching_state = $literal_free_variables_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LITERAL_FREE_VARIABLES_CACHED, $literal_free_variables_cached_caching_state$, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, literal, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(literal_free_variables_cached_internal(literal)));
            memoization_state.caching_state_put(caching_state, literal, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject find_unconnected_literals(final SubLObject formula) {
        final SubLObject literals = find_fully_connected_subsets(formula);
        SubLObject done_oneP = NIL;
        SubLObject arg_positions = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject set_o_literals = NIL;
        set_o_literals = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.tree_find_if($sym26$CYC_VAR_, set_o_literals, UNPROVIDED)) {
                if (NIL == done_oneP) {
                    done_oneP = T;
                } else {
                    SubLObject cdolist_list_var_$21 = set_o_literals;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var_$21.first();
                    while (NIL != cdolist_list_var_$21) {
                        arg_positions = append(arg_positions, arg_positions_eq(literal, formula));
                        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                        literal = cdolist_list_var_$21.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            set_o_literals = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static SubLObject sentences_consistentP(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence3 = list($$and, sentence1, sentence2);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
        try {
            parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
            ans = cyclifier.cyclifier_wffP(sentence3, mt);
        } finally {
            parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject sentence_internally_consistentP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
        try {
            parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
            final SubLObject wffP = ans = cyclifier.cyclifier_wffP(sentence, mt);
        } finally {
            parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject find_inconsistent_literals_in_conjunction(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inconsistent_pairs = NIL;
        final SubLObject literals = (formula.isList() && formula.first().eql($$and)) ? formula.rest() : list(formula);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = literals;
                SubLObject literal_1 = NIL;
                literal_1 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$22 = literals;
                    SubLObject literal_2 = NIL;
                    literal_2 = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        if ((!literal_1.eql(literal_2)) && (NIL == sentences_consistentP(literal_1, literal_2, mt))) {
                            inconsistent_pairs = cons(list(literal_1, literal_2), inconsistent_pairs);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        literal_2 = cdolist_list_var_$22.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    literal_1 = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return inconsistent_pairs;
    }

    public static SubLObject find_consistent_subsets(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dnf_formula = convert_to_dnf(formula, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject bare_dnf_formula = separate_bindings_from_sentence(dnf_formula);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject conjunctions = (bare_dnf_formula.isList() && bare_dnf_formula.first().eql($$or)) ? bare_dnf_formula.rest() : list(bare_dnf_formula);
        SubLObject inconsistent_pairs = NIL;
        SubLObject sets_of_consistent_literals = NIL;
        final SubLObject all_literals = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = conjunctions;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conjunction_literals = (conjunction.isList() && conjunction.first().eql($$and)) ? conjunction.rest() : list(conjunction);
            inconsistent_pairs = append(inconsistent_pairs, find_inconsistent_literals_in_conjunction(conjunction, mt));
            set_utilities.set_add_all(conjunction_literals, all_literals);
            cdolist_list_var = cdolist_list_var.rest();
            conjunction = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(all_literals);
        SubLObject basis_object;
        SubLObject state;
        SubLObject literal;
        SubLObject consistent_set;
        SubLObject cdolist_list_var2;
        SubLObject v_set;
        SubLObject consistentP;
        SubLObject set_contents_var_$24;
        SubLObject basis_object_$25;
        SubLObject state_$26;
        SubLObject other_literal;
        SubLObject cdolist_list_var_$27;
        SubLObject inconsistent_pair;
        SubLObject v_set2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            literal = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                consistent_set = NIL;
                cdolist_list_var2 = sets_of_consistent_literals;
                v_set = NIL;
                v_set = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    consistentP = T;
                    set_contents_var_$24 = set.do_set_internal(v_set);
                    for (basis_object_$25 = set_contents.do_set_contents_basis_object(set_contents_var_$24), state_$26 = NIL, state_$26 = set_contents.do_set_contents_initial_state(basis_object_$25, set_contents_var_$24); NIL == set_contents.do_set_contents_doneP(basis_object_$25, state_$26); state_$26 = set_contents.do_set_contents_update_state(state_$26)) {
                        other_literal = set_contents.do_set_contents_next(basis_object_$25, state_$26);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$26, other_literal)) {
                            cdolist_list_var_$27 = inconsistent_pairs;
                            inconsistent_pair = NIL;
                            inconsistent_pair = cdolist_list_var_$27.first();
                            while (NIL != cdolist_list_var_$27) {
                                if (inconsistent_pair.first().eql(literal) && second(inconsistent_pair).eql(other_literal)) {
                                    consistentP = NIL;
                                }
                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                inconsistent_pair = cdolist_list_var_$27.first();
                            } 
                        }
                    }
                    if (NIL != consistentP) {
                        consistent_set = v_set;
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_set = cdolist_list_var2.first();
                } 
                if (NIL == consistent_set) {
                    v_set2 = set.new_set(symbol_function(EQ), UNPROVIDED);
                    sets_of_consistent_literals = cons(v_set2, sets_of_consistent_literals);
                    consistent_set = v_set2;
                }
                set.set_add(literal, consistent_set);
            }
        }
        final SubLObject _prev_bind_0 = $literal_set_G_mt$.currentBinding(thread);
        try {
            $literal_set_G_mt$.bind(mt, thread);
            sets_of_consistent_literals = Sort.sort(sets_of_consistent_literals, symbol_function($sym38$LITERAL_SET__), UNPROVIDED);
        } finally {
            $literal_set_G_mt$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_consistent_literals);
    }

    public static SubLObject arg_positions_eq(final SubLObject item, final SubLObject formula) {
        SubLObject arg_positions = cycl_utilities.arg_positions_dfs(item, formula, symbol_function(EQUAL));
        SubLObject arg_positions_not_eq = NIL;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.eql(cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED))) {
                arg_positions_not_eq = cons(arg_pos, arg_positions_not_eq);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_positions_not_eq;
        arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_positions = remove(arg_pos, arg_positions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static SubLObject arg_positions_eql(final SubLObject item, final SubLObject formula) {
        SubLObject arg_positions = cycl_utilities.arg_positions_dfs(item, formula, symbol_function(EQUAL));
        SubLObject arg_positions_not_eql = NIL;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.eql(cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED))) {
                arg_positions_not_eql = cons(arg_pos, arg_positions_not_eql);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_positions_not_eql;
        arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_positions = remove(arg_pos, arg_positions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static SubLObject find_inconsistent_literals(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_positions = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject literal_subsets = find_consistent_subsets(formula, mt);
                if ((NIL == list_utilities.lengthE(literal_subsets.first(), ONE_INTEGER, UNPROVIDED)) || (NIL != sentence_internally_consistentP(literal_subsets.first().first(), mt))) {
                    literal_subsets = literal_subsets.rest();
                }
                final SubLObject inconsistent_literals = Mapping.mapcan(symbol_function(IDENTITY), literal_subsets, EMPTY_SUBL_OBJECT_ARRAY);
                arg_positions = Mapping.mapcan(symbol_function(ARG_POSITIONS_EQ), inconsistent_literals, new SubLObject[]{ make_list(length(inconsistent_literals), formula) });
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return arg_positions;
    }

    public static SubLObject incompatible_var_map_alists_equalP(final SubLObject map1, final SubLObject map2) {
        return list_utilities.alist_E(map1, map2, symbol_function(EQL), symbol_function($sym56$SETS_EQUAL_));
    }

    public static SubLObject declare_variable_unification_file() {
        declareFunction(me, "apply_demorgans", "APPLY-DEMORGANS", 1, 0, false);
        declareFunction(me, "el_negation_or_unknown_sentence_p", "EL-NEGATION-OR-UNKNOWN-SENTENCE-P", 1, 0, false);
        declareFunction(me, "separate_bindings_from_sentence", "SEPARATE-BINDINGS-FROM-SENTENCE", 1, 0, false);
        declareFunction(me, "separate_bindings_recursive", "SEPARATE-BINDINGS-RECURSIVE", 1, 0, false);
        declareFunction(me, "collapse_groups", "COLLAPSE-GROUPS", 1, 0, false);
        declareFunction(me, "convert_to_dnf_int", "CONVERT-TO-DNF-INT", 1, 0, false);
        declareFunction(me, "convert_to_dnf", "CONVERT-TO-DNF", 1, 1, false);
        declareFunction(me, "gather_dnf_arg_constraints_int", "GATHER-DNF-ARG-CONSTRAINTS-INT", 2, 0, false);
        declareFunction(me, "gather_dnf_arg_constraints", "GATHER-DNF-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "can_unifyP", "CAN-UNIFY?", 4, 0, false);
        declareFunction(me, "get_incompatible_variables_in_complex_sentence", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE", 2, 0, false);
        declareFunction(me, "find_irreflexive_incompatibles", "FIND-IRREFLEXIVE-INCOMPATIBLES", 2, 0, false);
        declareFunction(me, "add_incompatibles", "ADD-INCOMPATIBLES", 2, 0, false);
        declareFunction(me, "known_incompatible_varsP", "KNOWN-INCOMPATIBLE-VARS?", 3, 0, false);
        declareFunction(me, "get_var_map_for_formula_internal", "GET-VAR-MAP-FOR-FORMULA-INTERNAL", 2, 0, false);
        declareFunction(me, "get_var_map_for_formula", "GET-VAR-MAP-FOR-FORMULA", 2, 0, false);
        declareFunction(me, "get_incompatible_variables_in_complex_sentence_as_alist", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST", 2, 0, false);
        declareFunction(me, "gather_constraining_types_for_variable_in_constraint_conjunction", "GATHER-CONSTRAINING-TYPES-FOR-VARIABLE-IN-CONSTRAINT-CONJUNCTION", 3, 0, false);
        declareFunction(me, "variable_similarity_given_constraint_conjunction", "VARIABLE-SIMILARITY-GIVEN-CONSTRAINT-CONJUNCTION", 4, 0, false);
        declareFunction(me, "variable_similarity_internal", "VARIABLE-SIMILARITY-INTERNAL", 4, 0, false);
        declareFunction(me, "variable_similarity", "VARIABLE-SIMILARITY", 4, 0, false);
        declareFunction(me, "variable_similarity_about_the_sameP", "VARIABLE-SIMILARITY-ABOUT-THE-SAME?", 2, 1, false);
        declareFunction(me, "attempt_to_combine_variables_in_complex_combination", "ATTEMPT-TO-COMBINE-VARIABLES-IN-COMPLEX-COMBINATION", 4, 3, false);
        declareFunction(me, "pick_variable_to_combine", "PICK-VARIABLE-TO-COMBINE", 4, 0, false);
        declareFunction(me, "literals_redundantP", "LITERALS-REDUNDANT?", 3, 2, false);
        declareFunction(me, "redundant_literals_in_conjunctionP", "REDUNDANT-LITERALS-IN-CONJUNCTION?", 2, 2, false);
        declareFunction(me, "new_redundant_literals", "NEW-REDUNDANT-LITERALS", 4, 0, false);
        declareFunction(me, "car_cdr_equalP", "CAR-CDR-EQUAL?", 1, 0, false);
        declareFunction(me, "find_redundant_literals", "FIND-REDUNDANT-LITERALS", 2, 0, false);
        declareFunction(me, "find_redundant_literals_int", "FIND-REDUNDANT-LITERALS-INT", 2, 2, false);
        declareFunction(me, "shortest_paths_between_variables_in_conjunction", "SHORTEST-PATHS-BETWEEN-VARIABLES-IN-CONJUNCTION", 1, 0, false);
        declareFunction(me, "find_fully_connected_subsets_in_conjunction", "FIND-FULLY-CONNECTED-SUBSETS-IN-CONJUNCTION", 1, 0, false);
        declareFunction(me, "literal_set_G", "LITERAL-SET->", 2, 0, false);
        declareFunction(me, "find_fully_connected_subsets", "FIND-FULLY-CONNECTED-SUBSETS", 1, 0, false);
        declareFunction(me, "find_literal_set_with_vars", "FIND-LITERAL-SET-WITH-VARS", 2, 0, false);
        declareFunction(me, "clear_literal_free_variables_cached", "CLEAR-LITERAL-FREE-VARIABLES-CACHED", 0, 0, false);
        declareFunction(me, "remove_literal_free_variables_cached", "REMOVE-LITERAL-FREE-VARIABLES-CACHED", 1, 0, false);
        declareFunction(me, "literal_free_variables_cached_internal", "LITERAL-FREE-VARIABLES-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "literal_free_variables_cached", "LITERAL-FREE-VARIABLES-CACHED", 1, 0, false);
        declareFunction(me, "find_unconnected_literals", "FIND-UNCONNECTED-LITERALS", 1, 0, false);
        declareFunction(me, "sentences_consistentP", "SENTENCES-CONSISTENT?", 3, 0, false);
        declareFunction(me, "sentence_internally_consistentP", "SENTENCE-INTERNALLY-CONSISTENT?", 2, 0, false);
        declareFunction(me, "find_inconsistent_literals_in_conjunction", "FIND-INCONSISTENT-LITERALS-IN-CONJUNCTION", 2, 0, false);
        declareFunction(me, "find_consistent_subsets", "FIND-CONSISTENT-SUBSETS", 2, 0, false);
        declareFunction(me, "arg_positions_eq", "ARG-POSITIONS-EQ", 2, 0, false);
        declareFunction(me, "arg_positions_eql", "ARG-POSITIONS-EQL", 2, 0, false);
        declareFunction(me, "find_inconsistent_literals", "FIND-INCONSISTENT-LITERALS", 2, 0, false);
        declareFunction(me, "incompatible_var_map_alists_equalP", "INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_variable_unification_file() {
        deflexical("*VARIABLE-SIMILARITY-DEFAULT-FUDGE-FACTOR*", $float$1_1);
        defparameter("*LITERAL-SET->-MT*", NIL);
        deflexical("*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_variable_unification_file() {
        memoization_state.note_memoized_function(GET_VAR_MAP_FOR_FORMULA);
        memoization_state.note_memoized_function(VARIABLE_SIMILARITY);
        note_funcall_helper_function($sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_);
        register_external_symbol(FIND_REDUNDANT_LITERALS);
        memoization_state.note_globally_cached_function(LITERAL_FREE_VARIABLES_CACHED);
        register_external_symbol(FIND_UNCONNECTED_LITERALS);
        register_external_symbol(FIND_INCONSISTENT_LITERALS);
        define_test_case_table_int(APPLY_DEMORGANS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $TINY, $WORKING_, T }), $list55);
        define_test_case_table_int(GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, list(new SubLObject[]{ $TEST, symbol_function($sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list60);
        define_test_case_table_int(FIND_UNCONNECTED_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list61);
        define_test_case_table_int(FIND_INCONSISTENT_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list62);
        return NIL;
    }

    private static SubLObject _constant_60_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("cCF-contains")), makeSymbol("?X"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?DEATH"), makeSymbol("?Y")), list(makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?HOSPITAL-ADMIT-REASON")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventHasDiagnosis")), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell(makeString("HeartCondition"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("causeOfDeathEvent")), makeSymbol("?DEATH"), reader_make_constant_shell(makeString("HeartCondition"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventHasDiagnosis")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFLeftVentricleEjectionFraction")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?X"), makeSymbol("?W"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X"), makeSymbol("?W")), list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?W")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), reader_make_constant_shell(makeString("Angina"))), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFSymptomType")), makeSymbol("?SYMPTOM"), makeSymbol("?SYMPTOM-TYPE")), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE")), list(makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?CCF-EVENT"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell(makeString("cCFAnginaRestPain")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANGINA-REST-PAIN")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?ANIMAL"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("cCFHematocritTestValue")), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(makeSymbol("?SCALAR-VALUE"), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y")), list(makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("ElectrophysiologyStudy-CCFManagement"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("SurgicalProcedure_eps"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))) });
    }

    @Override
    public void declareFunctions() {
        declare_variable_unification_file();
    }

    @Override
    public void initializeVariables() {
        init_variable_unification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_variable_unification_file();
    }

    
}

/**
 * Total time: 682 ms
 */
