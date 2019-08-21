package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.cyc_testing.inference_testing_helpers;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.inference_testing_helpers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_testing_helpers extends SubLTranslatedFile {
    public static final SubLFile me = new inference_testing_helpers();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.inference_testing_helpers";

    public static final String myFingerPrint = "62bdd879a552d7c3bc57d61618a8e59d101d8dda6bab9bafc8ede9f9625e77e2";

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    public static final SubLSymbol $sym1$PRED_SPEC_ = makeSymbol("PRED-SPEC?");



    public static final SubLSymbol PRINT_CREATE = makeSymbol("PRINT-CREATE");







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    public static final SubLSymbol SPECIAL = makeSymbol("SPECIAL");

    public static SubLObject pred_specP(final SubLObject v_const) {
        return genls.genlsP(v_const, $$Predicate, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_var_spec(final SubLObject var, final SubLObject types) {
        return cons(var, types);
    }

    public static SubLObject var_spec_var(final SubLObject var_spec) {
        return var_spec.first();
    }

    public static SubLObject var_const_name(final SubLObject var, SubLObject predP) {
        if (predP == UNPROVIDED) {
            predP = NIL;
        }
        final SubLObject res = delete(CHAR_hyphen, Strings.string_capitalize(symbol_name(var), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != predP) {
            Strings.nstring_downcase(res, ZERO_INTEGER, ONE_INTEGER);
        }
        return res;
    }

    public static SubLObject var_spec_const_name(final SubLObject var_spec) {
        final SubLObject predP = list_utilities.any_in_list(symbol_function($sym1$PRED_SPEC_), var_spec_types(var_spec), UNPROVIDED);
        return var_const_name(var_spec_var(var_spec), predP);
    }

    public static SubLObject var_spec_types(final SubLObject var_spec) {
        return var_spec.rest();
    }

    public static SubLObject print_create_var_spec_constant(final SubLObject var_spec) {
        final SubLObject var = var_spec_var(var_spec);
        if (var.isCons()) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = reverse(var);
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(print_create_var_constant(var2), result);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            } 
            return result;
        }
        return list(print_create_var_constant(var));
    }

    public static SubLObject print_create_var_constant(final SubLObject var) {
        return list(CSETQ, var, list(PRINT_CREATE, var_const_name(var, UNPROVIDED), list(QUOTE, var)));
    }

    public static SubLObject var_spec_def(final SubLObject var_spec) {
        final SubLObject var = var_spec_var(var_spec);
        final SubLObject types = reverse(var_spec_types(var_spec));
        if (var.isCons()) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = reverse(var);
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(var_spec_def(make_var_spec(var2, types)), result);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            } 
            return apply(symbol_function(APPEND), result);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = reverse(types);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(LIST, $$isa, var, type), result);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject declare_special_vars(final SubLObject vars) {
        return list(DECLARE, bq_cons(SPECIAL, append(vars, NIL)));
    }

    public static SubLObject declare_inference_testing_helpers_file() {
        declareFunction(me, "pred_specP", "PRED-SPEC?", 1, 0, false);
        declareFunction(me, "make_var_spec", "MAKE-VAR-SPEC", 2, 0, false);
        declareFunction(me, "var_spec_var", "VAR-SPEC-VAR", 1, 0, false);
        declareFunction(me, "var_const_name", "VAR-CONST-NAME", 1, 1, false);
        declareFunction(me, "var_spec_const_name", "VAR-SPEC-CONST-NAME", 1, 0, false);
        declareFunction(me, "var_spec_types", "VAR-SPEC-TYPES", 1, 0, false);
        declareFunction(me, "print_create_var_spec_constant", "PRINT-CREATE-VAR-SPEC-CONSTANT", 1, 0, false);
        declareFunction(me, "print_create_var_constant", "PRINT-CREATE-VAR-CONSTANT", 1, 0, false);
        declareFunction(me, "var_spec_def", "VAR-SPEC-DEF", 1, 0, false);
        declareFunction(me, "declare_special_vars", "DECLARE-SPECIAL-VARS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_testing_helpers_file() {
        return NIL;
    }

    public static SubLObject setup_inference_testing_helpers_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_testing_helpers_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_testing_helpers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_testing_helpers_file();
    }

    static {











    }
}

/**
 * Total time: 75 ms
 */
