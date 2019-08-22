package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class meta_macros extends SubLTranslatedFile {
    public static final SubLFile me = new meta_macros();

    public static final String myName = "com.cyc.cycjava.cycl.meta_macros";

    public static final String myFingerPrint = "4c63ef0605b624d2dbe615fd1156f574a27662e427f97632c90dc17a0fcebae9";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLString $$$TEMP = makeString("TEMP");





    public static SubLObject with_temp_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject vars = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        vars = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject temp_var = make_temp_var(var);
            v_bindings = cons(list(var, list(QUOTE, temp_var)), v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        v_bindings = nreverse(v_bindings);
        return listS(CLET, v_bindings, append(body, NIL));
    }

    public static SubLObject make_temp_var(final SubLObject v_object) {
        if (v_object.isString()) {
            return make_symbol(v_object);
        }
        if (v_object.isSymbol()) {
            return make_temp_var(symbol_name(v_object));
        }
        return make_temp_var($$$TEMP);
    }

    public static SubLObject declare_indention_pattern(final SubLObject operator, final SubLObject pattern) {
        assert NIL != symbolp(operator) : "Types.symbolp(operator) " + "CommonSymbols.NIL != Types.symbolp(operator) " + operator;
        assert NIL != listp(pattern) : "Types.listp(pattern) " + "CommonSymbols.NIL != Types.listp(pattern) " + pattern;
        return NIL;
    }

    public static SubLObject declare_meta_macros_file() {
        declareMacro(me, "with_temp_vars", "WITH-TEMP-VARS");
        declareFunction(me, "make_temp_var", "MAKE-TEMP-VAR", 1, 0, false);
        declareFunction(me, "declare_indention_pattern", "DECLARE-INDENTION-PATTERN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_meta_macros_file() {
        return NIL;
    }

    public static SubLObject setup_meta_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_meta_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_meta_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_meta_macros_file();
    }

    
}

/**
 * Total time: 31 ms
 */
