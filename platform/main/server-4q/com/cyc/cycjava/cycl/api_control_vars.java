/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      API-CONTROL-VARS
 * source file: /cyc/top/cycl/api-control-vars.lisp
 * created:     2019/07/03 17:37:17
 */
public final class api_control_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new api_control_vars();



    // defparameter
    // Definitions
    /**
     * Function used to determine constant handles during CFASL output. If NIL, the
     * default used is CONSTANT-INTERNAL-ID
     */
    @LispMethod(comment = "Function used to determine constant handles during CFASL output. If NIL, the\r\ndefault used is CONSTANT-INTERNAL-ID\ndefparameter\nFunction used to determine constant handles during CFASL output. If NIL, the\ndefault used is CONSTANT-INTERNAL-ID")
    public static final SubLSymbol $cfasl_constant_handle_func$ = makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up constants from their handles during CFASL input. If
     * NIL, the default used is FIND-CONSTANT-BY-INTERNAL-ID
     */
    @LispMethod(comment = "Function used to look up constants from their handles during CFASL input. If\r\nNIL, the default used is FIND-CONSTANT-BY-INTERNAL-ID\ndefparameter\nFunction used to look up constants from their handles during CFASL input. If\nNIL, the default used is FIND-CONSTANT-BY-INTERNAL-ID")
    public static final SubLSymbol $cfasl_constant_handle_lookup_func$ = makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*");

    // defparameter
    /**
     * Function used to determine NART handles during CFASL output. If NIL, the
     * default used is NART-ID
     */
    @LispMethod(comment = "Function used to determine NART handles during CFASL output. If NIL, the\r\ndefault used is NART-ID\ndefparameter\nFunction used to determine NART handles during CFASL output. If NIL, the\ndefault used is NART-ID")
    public static final SubLSymbol $cfasl_nart_handle_func$ = makeSymbol("*CFASL-NART-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up NARTs from their handles during CFASL input. If NIL,
     * the default used is FIND-NART-BY-ID
     */
    @LispMethod(comment = "Function used to look up NARTs from their handles during CFASL input. If NIL,\r\nthe default used is FIND-NART-BY-ID\ndefparameter\nFunction used to look up NARTs from their handles during CFASL input. If NIL,\nthe default used is FIND-NART-BY-ID")
    public static final SubLSymbol $cfasl_nart_handle_lookup_func$ = makeSymbol("*CFASL-NART-HANDLE-LOOKUP-FUNC*");

    // defparameter
    /**
     * Function used to determine assertion handles during CFASL output. If NIL, the
     * default used is ASSERTION-ID
     */
    @LispMethod(comment = "Function used to determine assertion handles during CFASL output. If NIL, the\r\ndefault used is ASSERTION-ID\ndefparameter\nFunction used to determine assertion handles during CFASL output. If NIL, the\ndefault used is ASSERTION-ID")
    public static final SubLSymbol $cfasl_assertion_handle_func$ = makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up assertions from their handles during CFASL input. If
     * NIL, the default used is FIND-ASSERTION-BY-ID
     */
    @LispMethod(comment = "Function used to look up assertions from their handles during CFASL input. If\r\nNIL, the default used is FIND-ASSERTION-BY-ID\ndefparameter\nFunction used to look up assertions from their handles during CFASL input. If\nNIL, the default used is FIND-ASSERTION-BY-ID")
    public static final SubLSymbol $cfasl_assertion_handle_lookup_func$ = makeSymbol("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*");

    // defparameter
    /**
     * Function used to determine deduction handles during CFASL output. If NIL, the
     * default used is DEDUCTION-ID
     */
    @LispMethod(comment = "Function used to determine deduction handles during CFASL output. If NIL, the\r\ndefault used is DEDUCTION-ID\ndefparameter\nFunction used to determine deduction handles during CFASL output. If NIL, the\ndefault used is DEDUCTION-ID")
    public static final SubLSymbol $cfasl_deduction_handle_func$ = makeSymbol("*CFASL-DEDUCTION-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up deductions from their handles during CFASL input. If
     * NIL, the default used is FIND-DEDUCTION-BY-ID
     */
    @LispMethod(comment = "Function used to look up deductions from their handles during CFASL input. If\r\nNIL, the default used is FIND-DEDUCTION-BY-ID\ndefparameter\nFunction used to look up deductions from their handles during CFASL input. If\nNIL, the default used is FIND-DEDUCTION-BY-ID")
    public static final SubLSymbol $cfasl_deduction_handle_lookup_func$ = makeSymbol("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*");

    // defparameter
    /**
     * Function used to determine KB HL supports during CFASL output. If NIL, the
     * default used is KB-HL-SUPPORT-ID
     */
    @LispMethod(comment = "Function used to determine KB HL supports during CFASL output. If NIL, the\r\ndefault used is KB-HL-SUPPORT-ID\ndefparameter\nFunction used to determine KB HL supports during CFASL output. If NIL, the\ndefault used is KB-HL-SUPPORT-ID")
    public static final SubLSymbol $cfasl_kb_hl_support_handle_func$ = makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up KB HL supports from their handles during CFASL
     * input. If NIL, the default used is FIND-KB-HL-SUPPORT-BY-ID
     */
    @LispMethod(comment = "Function used to look up KB HL supports from their handles during CFASL\r\ninput. If NIL, the default used is FIND-KB-HL-SUPPORT-BY-ID\ndefparameter\nFunction used to look up KB HL supports from their handles during CFASL\ninput. If NIL, the default used is FIND-KB-HL-SUPPORT-BY-ID")
    public static final SubLSymbol $cfasl_kb_hl_support_handle_lookup_func$ = makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*");

    // defparameter
    /**
     * Function used to determine clause-struc handles during CFASL output. If NIL,
     * the default used is CLAUSE-STRUC-ID
     */
    @LispMethod(comment = "Function used to determine clause-struc handles during CFASL output. If NIL,\r\nthe default used is CLAUSE-STRUC-ID\ndefparameter\nFunction used to determine clause-struc handles during CFASL output. If NIL,\nthe default used is CLAUSE-STRUC-ID")
    public static final SubLSymbol $cfasl_clause_struc_handle_func$ = makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*");

    // defparameter
    /**
     * Function used to look up clause-strucs from their handles during CFASL input.
     * If NIL, the default used is FIND-CLAUSE-STRUC-BY-ID
     */
    @LispMethod(comment = "Function used to look up clause-strucs from their handles during CFASL input.\r\nIf NIL, the default used is FIND-CLAUSE-STRUC-BY-ID\ndefparameter\nFunction used to look up clause-strucs from their handles during CFASL input.\nIf NIL, the default used is FIND-CLAUSE-STRUC-BY-ID")
    public static final SubLSymbol $cfasl_clause_struc_handle_lookup_func$ = makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*");



    // defparameter
    // The purpose to use for KE by default. NIL = General Cyc KE.
    /**
     * The purpose to use for KE by default.  NIL = General Cyc KE.
     */
    @LispMethod(comment = "The purpose to use for KE by default.  NIL = General Cyc KE.\ndefparameter\nThe purpose to use for KE by default. NIL = General Cyc KE.")
    public static final SubLSymbol $default_ke_purpose$ = makeSymbol("*DEFAULT-KE-PURPOSE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $generate_readable_fi_results$ = makeSymbol("*GENERATE-READABLE-FI-RESULTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    public static final SubLSymbol $use_local_queueP$ = makeSymbol("*USE-LOCAL-QUEUE?*");

    public static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    public static SubLObject declare_api_control_vars_file() {
        return NIL;
    }

    public static SubLObject init_api_control_vars_file() {
        defparameter("*CFASL-CONSTANT-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*", NIL);
        defparameter("*CFASL-NART-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-NART-HANDLE-LOOKUP-FUNC*", NIL);
        defparameter("*CFASL-ASSERTION-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*", NIL);
        defparameter("*CFASL-DEDUCTION-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*", NIL);
        defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*", NIL);
        defparameter("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*", NIL);
        defparameter("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*", NIL);
        defvar("*THE-CYCLIST*", NIL);
        defparameter("*USE-LOCAL-QUEUE?*", T);
        defparameter("*DEFAULT-KE-PURPOSE*", NIL);
        defparameter("*KE-PURPOSE*", $default_ke_purpose$.getDynamicValue());
        defparameter("*GENERATE-READABLE-FI-RESULTS*", T);
        return NIL;
    }

    public static SubLObject setup_api_control_vars_file() {
        register_html_state_variable($the_cyclist$);
        register_html_state_variable($use_local_queueP$);
        register_html_state_variable($ke_purpose$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_api_control_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_api_control_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_api_control_vars_file();
    }

    static {
    }
}

/**
 * Total time: 29 ms
 */
