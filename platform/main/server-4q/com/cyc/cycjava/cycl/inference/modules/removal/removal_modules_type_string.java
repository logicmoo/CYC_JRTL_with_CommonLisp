package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.string_typing;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_type_string extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_type_string();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string";

    public static final String myFingerPrint = "ac4a59849b6e02f3841ee7a5abc153a01252ab3569c7f17465e91ee62a27b027";

    private static final SubLObject $$typeFromString = reader_make_constant_shell(makeString("typeFromString"));





    private static final SubLSymbol $REMOVAL_TYPE_STRING_UNIFY_ARG2 = makeKeyword("REMOVAL-TYPE-STRING-UNIFY-ARG2");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeFromString :fully-bound :not-fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });

    private static final SubLSymbol $REMOVAL_TYPE_STRING_CHECK_POS = makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeFromString :fully-bound :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });

    private static final SubLSymbol $REMOVAL_TYPE_STRING_CHECK_POS_NEG = makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS-NEG");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeFromString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("typeFromString")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$typeFromString :fully-bound :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$typeFromString \"Patrick AFB\" #$Individual))") });



    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));



    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));



    private static final SubLSymbol REMOVAL_TYPE_STRING_ARG2_UNBOUND = makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND");

    private static final SubLList $list15 = list(cons(T, T));

    private static final SubLSymbol REMOVAL_TYPE_STRING_ALL_BOUND = makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND");

    private static final SubLSymbol REMOVAL_TYPE_STRING_ALL_BOUND_NEG = makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG");

    public static SubLObject removal_type_string_arg2_unbound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else
                if (pcase_var.eql($INDIVIDUAL)) {
                    type2 = $$Individual;
                }

            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(type2, cycl_utilities.formula_arg2(asent, UNPROVIDED), T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject bound_arg2 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg2(asent, UNPROVIDED));
                final SubLObject unified_asent = replace_formula_arg(TWO_INTEGER, bound_arg2, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
            }
        }
        return NIL;
    }

    public static SubLObject removal_type_string_all_bound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else
                if (pcase_var.eql($INDIVIDUAL)) {
                    type2 = $$Individual;
                }

            if (type2.eql(cycl_utilities.formula_arg2(asent, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), $list15, NIL);
            }
        }
        return NIL;
    }

    public static SubLObject removal_type_string_all_bound_neg(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (cycl_utilities.formula_arg1(asent, UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, UNPROVIDED));
            SubLObject type2 = NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql($COLLECTION)) {
                type2 = $$Collection;
            } else
                if (pcase_var.eql($INDIVIDUAL)) {
                    type2 = $$Individual;
                }

            if (!type2.eql(cycl_utilities.formula_arg2(asent, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), $list15, NIL);
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_type_string_file() {
        declareFunction(me, "removal_type_string_arg2_unbound", "REMOVAL-TYPE-STRING-ARG2-UNBOUND", 1, 1, false);
        declareFunction(me, "removal_type_string_all_bound", "REMOVAL-TYPE-STRING-ALL-BOUND", 1, 1, false);
        declareFunction(me, "removal_type_string_all_bound_neg", "REMOVAL-TYPE-STRING-ALL-BOUND-NEG", 1, 1, false);
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
        note_funcall_helper_function(REMOVAL_TYPE_STRING_ARG2_UNBOUND);
        note_funcall_helper_function(REMOVAL_TYPE_STRING_ALL_BOUND);
        note_funcall_helper_function(REMOVAL_TYPE_STRING_ALL_BOUND_NEG);
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

    
}

/**
 * Total time: 84 ms
 */
