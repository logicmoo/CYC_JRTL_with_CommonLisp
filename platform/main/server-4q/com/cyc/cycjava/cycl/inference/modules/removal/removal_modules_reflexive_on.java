package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_reflexive_on extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on";
    public static String myFingerPrint = "73c4796a6598b0c194daa1aef1f63790dde4a265a6bc8d2154364d5fc873374f";
    private static SubLObject $$reflexiveOn;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $sym2$FULLY_BOUND_P;
    private static SubLList $list3;
    private static SubLSymbol $REFLEXIVE_ON;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLSymbol $sym7$REFLEXIVE_ON_COMPLETNESS;
    private static SubLSymbol $REMOVAL_REFLEXIVE_ON;
    private static SubLList $list9;
    private static SubLSymbol $EQUALITY;
    private static SubLObject $$equals;
    private static SubLSymbol $ISA;
    private static SubLSymbol $DEFN;
    private static SubLString $str14$Couldn_t_validate____isa__S__S__i;
    private static SubLObject $$isa;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 800L)
    public static SubLObject reflexive_on_predicateP(SubLObject v_object) {
        return makeBoolean((!ONE_INTEGER.eql(somewhere_cache.some_pred_assertion_somewhere_argnum($$reflexiveOn)) || NIL != somewhere_cache.some_pred_assertion_somewhereP($$reflexiveOn, v_object, ONE_INTEGER, UNPROVIDED))
                && NIL != kb_mapping_utilities.some_pred_value(v_object, $$reflexiveOn, ONE_INTEGER, $TRUE));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1100L)
    public static SubLObject reflexive_on_cols(SubLObject pred) {
        return kb_mapping_utilities.pred_values(pred, $$reflexiveOn, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1200L)
    public static SubLObject removal_reflexive_on_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            SubLObject fully_bound_arg = Sequences.find_if($sym2$FULLY_BOUND_P, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject successP = NIL;
            SubLObject current;
            SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
            arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings && NIL == successP) {
                    SubLObject csome_list_var = reflexive_on_cols(pred);
                    SubLObject col = NIL;
                    col = csome_list_var.first();
                    while (NIL == successP && NIL != csome_list_var) {
                        if (NIL != at_defns.has_typeP(fully_bound_arg, col, UNPROVIDED)) {
                            SubLObject sentence = bindings.subst_bindings(v_bindings, asent);
                            SubLObject support = arguments.make_hl_support($REFLEXIVE_ON, sentence, UNPROVIDED, UNPROVIDED);
                            backward.removal_add_node(support, v_bindings, justification);
                            successP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1900L)
    public static SubLObject reflexive_on_completness(SubLObject asent) {
        return (NIL != variables.fully_bound_p(asent)) ? $INCOMPLETE : $GROSSLY_INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 2900L)
    public static SubLObject supports_for_reflexive_on(SubLObject literal, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
        SubLObject current;
        SubLObject datum = current = atomic_sentence;
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != reflexive_on_predicateP(pred) && NIL == ans) {
                SubLObject csome_list_var = reflexive_on_cols(pred);
                SubLObject col = NIL;
                col = csome_list_var.first();
                while (NIL == ans && NIL != csome_list_var) {
                    SubLObject reflexive_on_assertion = NIL;
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        reflexive_on_assertion = kb_mapping_utilities.fpred_u_v_holds_gaf($$reflexiveOn, pred, col, ONE_INTEGER, TWO_INTEGER, $TRUE);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if (NIL != reflexive_on_assertion && NIL != at_defns.has_typeP(arg1, col, UNPROVIDED)) {
                        if (!arg1.equal(arg2)) {
                            ans = cons(reflexive_on_isa_support(arg2, col, mt), ans);
                            ans = cons(arguments.make_hl_support($EQUALITY, el_utilities.make_binary_formula($$equals, arg1, arg2), mt, UNPROVIDED), ans);
                        }
                        ans = cons(reflexive_on_isa_support(arg1, col, mt), ans);
                        ans = cons(reflexive_on_assertion, ans);
                    }
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 3700L)
    public static SubLObject reflexive_on_isa_support(SubLObject v_term, SubLObject col, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_module = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != isa.isaP(v_term, col, UNPROVIDED, UNPROVIDED)) {
                support_module = $ISA;
            } else if (NIL != at_defns.has_typeP(v_term, col, UNPROVIDED)) {
                support_module = $DEFN;
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == support_module) {
            Errors.error($str14$Couldn_t_validate____isa__S__S__i, v_term, col, mt);
        }
        return arguments.make_hl_support(support_module, el_utilities.make_binary_formula($$isa, v_term, col), mt, UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_reflexive_on_file() {
        declareFunction(myName, "reflexive_on_predicateP", "REFLEXIVE-ON-PREDICATE?", 1, 0, false);
        new $reflexive_on_predicateP$UnaryFunction();
        declareFunction(myName, "reflexive_on_cols", "REFLEXIVE-ON-COLS", 1, 0, false);
        declareFunction(myName, "removal_reflexive_on_expand", "REMOVAL-REFLEXIVE-ON-EXPAND", 1, 1, false);
        declareFunction(myName, "reflexive_on_completness", "REFLEXIVE-ON-COMPLETNESS", 1, 0, false);
        declareFunction(myName, "supports_for_reflexive_on", "SUPPORTS-FOR-REFLEXIVE-ON", 2, 0, false);
        declareFunction(myName, "reflexive_on_isa_support", "REFLEXIVE-ON-ISA-SUPPORT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_reflexive_on_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_reflexive_on_file() {
        utilities_macros.note_funcall_helper_function($sym7$REFLEXIVE_ON_COMPLETNESS);
        inference_modules.inference_removal_module($REMOVAL_REFLEXIVE_ON, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_reflexive_on_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_reflexive_on_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_reflexive_on_file();
    }

    static {
        me = new removal_modules_reflexive_on();
        $$reflexiveOn = makeConstSym(("reflexiveOn"));
        $TRUE = makeKeyword("TRUE");
        $sym2$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
        $list3 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
        $REFLEXIVE_ON = makeKeyword("REFLEXIVE-ON");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $sym7$REFLEXIVE_ON_COMPLETNESS = makeSymbol("REFLEXIVE-ON-COMPLETNESS");
        $REMOVAL_REFLEXIVE_ON = makeKeyword("REMOVAL-REFLEXIVE-ON");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
                        list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))),
                        cons(list(makeKeyword("TEST"), makeSymbol("REFLEXIVE-ON-PREDICATE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REFLEXIVE-ON-COMPLETNESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), makeKeyword("EXAMPLE"),
                makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });
        $EQUALITY = makeKeyword("EQUALITY");
        $$equals = makeConstSym(("equals"));
        $ISA = makeKeyword("ISA");
        $DEFN = makeKeyword("DEFN");
        $str14$Couldn_t_validate____isa__S__S__i = makeString("Couldn't validate (#$isa ~S ~S) in ~S");
        $$isa = makeConstSym(("isa"));
    }

    public static class $reflexive_on_predicateP$UnaryFunction extends UnaryFunction {
        public $reflexive_on_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REFLEXIVE-ON-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return reflexive_on_predicateP(arg1);
        }
    }
}
/*
 *
 * Total time: 104 ms
 *
 */