package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.string_typing;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_type_string extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "ac4a59849b6e02f3841ee7a5abc153a01252ab3569c7f17465e91ee62a27b027";
    private static SubLObject $$typeFromString;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_TYPE_STRING_UNIFY_ARG2;
    private static SubLList $list4;
    private static SubLSymbol $REMOVAL_TYPE_STRING_CHECK_POS;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_TYPE_STRING_CHECK_POS_NEG;
    private static SubLList $list8;
    private static SubLSymbol $COLLECTION;
    private static SubLObject $$Collection;
    private static SubLSymbol $INDIVIDUAL;
    private static SubLObject $$Individual;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND;
    private static SubLList $list15;
    private static SubLSymbol $sym16$REMOVAL_TYPE_STRING_ALL_BOUND;
    private static SubLSymbol $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2300L)
    public static SubLObject removal_type_string_arg2_unbound(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else if (pcase_var.eql($INDIVIDUAL)) {
                type2 = $$Individual;
            }
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(type2, cycl_utilities.formula_arg2(asent, UNPROVIDED), T, T);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject bound_arg2 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg2(asent, UNPROVIDED));
                SubLObject unified_asent = el_utilities.replace_formula_arg(TWO_INTEGER, bound_arg2, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2900L)
    public static SubLObject removal_type_string_all_bound(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else if (pcase_var.eql($INDIVIDUAL)) {
                type2 = $$Individual;
            }
            if (type2.eql(cycl_utilities.formula_arg2(asent, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), $list15, NIL);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 3400L)
    public static SubLObject removal_type_string_all_bound_neg(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else if (pcase_var.eql($INDIVIDUAL)) {
                type2 = $$Individual;
            }
            if (!type2.eql(cycl_utilities.formula_arg2(asent, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), $list15, NIL);
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_type_string_file() {
        declareFunction("removal_type_string_arg2_unbound", "REMOVAL-TYPE-STRING-ARG2-UNBOUND", 1, 1, false);
        declareFunction("removal_type_string_all_bound", "REMOVAL-TYPE-STRING-ALL-BOUND", 1, 1, false);
        declareFunction("removal_type_string_all_bound_neg", "REMOVAL-TYPE-STRING-ALL-BOUND-NEG", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_type_string_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_type_string_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$typeFromString);
        preference_modules.doomed_unless_arg_bindable($POS, $$typeFromString, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$typeFromString);
        inference_modules.inference_removal_module($REMOVAL_TYPE_STRING_UNIFY_ARG2, $list4);
        inference_modules.inference_removal_module($REMOVAL_TYPE_STRING_CHECK_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_TYPE_STRING_CHECK_POS_NEG, $list8);
        utilities_macros.note_funcall_helper_function($sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND);
        utilities_macros.note_funcall_helper_function($sym16$REMOVAL_TYPE_STRING_ALL_BOUND);
        utilities_macros.note_funcall_helper_function($sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_type_string_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_type_string_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_type_string_file();
    }

    static {
        me = new removal_modules_type_string();
        $$typeFromString = makeConstSym(("typeFromString"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_TYPE_STRING_UNIFY_ARG2 = makeKeyword("REMOVAL-TYPE-STRING-UNIFY-ARG2");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeFromString :fully-bound :not-fully-bound)"),
                makeKeyword("EXAMPLE"), makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });
        $REMOVAL_TYPE_STRING_CHECK_POS = makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeFromString :fully-bound :fully-bound)"), makeKeyword("EXAMPLE"),
                makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });
        $REMOVAL_TYPE_STRING_CHECK_POS_NEG = makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS-NEG");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$typeFromString :fully-bound :fully-bound))"),
                makeKeyword("EXAMPLE"), makeString("(#$not (#$typeFromString \"Patrick AFB\" #$Individual))") });
        $COLLECTION = makeKeyword("COLLECTION");
        $$Collection = makeConstSym(("Collection"));
        $INDIVIDUAL = makeKeyword("INDIVIDUAL");
        $$Individual = makeConstSym(("Individual"));
        $OPAQUE = makeKeyword("OPAQUE");
        $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND = makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND");
        $list15 = list(cons(T, T));
        $sym16$REMOVAL_TYPE_STRING_ALL_BOUND = makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND");
        $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG = makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG");
    }
}
/*
 *
 * Total time: 84 ms
 *
 */