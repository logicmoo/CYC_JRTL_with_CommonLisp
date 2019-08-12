/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      META-MACROS
 * source file: /cyc/top/cycl/meta-macros.lisp
 * created:     2019/07/03 17:37:05
 */
public final class meta_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new meta_macros();

 public static final String myName = "com.cyc.cycjava.cycl.meta_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$TEMP = makeString("TEMP");

    // Definitions
    public static final SubLObject with_temp_vars_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject vars = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            vars = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject v_bindings = NIL;
                SubLObject cdolist_list_var = vars;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject temp_var = com.cyc.cycjava.cycl.meta_macros.make_temp_var(var);
                        v_bindings = cons(list(var, list(QUOTE, temp_var)), v_bindings);
                    }
                }
                v_bindings = nreverse(v_bindings);
                return listS(CLET, v_bindings, append(body, NIL));
            }
        }
    }

    // Definitions
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

    /**
     * Return an uninterned varable using OBJECT as a naming basis.
     */
    @LispMethod(comment = "Return an uninterned varable using OBJECT as a naming basis.")
    public static final SubLObject make_temp_var_alt(SubLObject v_object) {
        if (v_object.isString()) {
            return make_symbol(v_object);
        } else {
            if (v_object.isSymbol()) {
                return com.cyc.cycjava.cycl.meta_macros.make_temp_var(symbol_name(v_object));
            } else {
                return com.cyc.cycjava.cycl.meta_macros.make_temp_var($$$TEMP);
            }
        }
    }

    /**
     * Return an uninterned varable using OBJECT as a naming basis.
     */
    @LispMethod(comment = "Return an uninterned varable using OBJECT as a naming basis.")
    public static SubLObject make_temp_var(final SubLObject v_object) {
        if (v_object.isString()) {
            return make_symbol(v_object);
        }
        if (v_object.isSymbol()) {
            return make_temp_var(symbol_name(v_object));
        }
        return make_temp_var($$$TEMP);
    }

    /**
     * Declare that forms with OPERATOR should be indented as if PATTERN were its pattern.
     */
    @LispMethod(comment = "Declare that forms with OPERATOR should be indented as if PATTERN were its pattern.")
    public static final SubLObject declare_indention_pattern_alt(SubLObject operator, SubLObject pattern) {
        SubLTrampolineFile.checkType(operator, SYMBOLP);
        SubLTrampolineFile.checkType(pattern, LISTP);
        return NIL;
    }

    @LispMethod(comment = "Declare that forms with OPERATOR should be indented as if PATTERN were its pattern.")
    public static SubLObject declare_indention_pattern(final SubLObject operator, final SubLObject pattern) {
        assert NIL != symbolp(operator) : "! symbolp(operator) " + ("Types.symbolp(operator) " + "CommonSymbols.NIL != Types.symbolp(operator) ") + operator;
        assert NIL != listp(pattern) : "! listp(pattern) " + ("Types.listp(pattern) " + "CommonSymbols.NIL != Types.listp(pattern) ") + pattern;
        return NIL;
    }

    public static SubLObject declare_meta_macros_file() {
        declareMacro("with_temp_vars", "WITH-TEMP-VARS");
        declareFunction("make_temp_var", "MAKE-TEMP-VAR", 1, 0, false);
        declareFunction("declare_indention_pattern", "DECLARE-INDENTION-PATTERN", 2, 0, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("VARS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static {
    }
}

/**
 * Total time: 31 ms
 */
