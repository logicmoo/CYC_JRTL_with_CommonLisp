/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RED-INFRASTRUCTURE-MACROS
 * source file: /cyc/top/cycl/red-infrastructure-macros.lisp
 * created:     2019/07/03 17:37:15
 */
public final class red_infrastructure_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new red_infrastructure_macros();

 public static final String myName = "com.cyc.cycjava.cycl.red_infrastructure_macros";


    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $red_infrastructure_test_red_value$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-RED-VALUE*");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    private static final SubLSymbol $reddef_lex_prvt_2$ = makeSymbol("REDDEF-LEX-PRVT-2");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    private static final SubLSymbol $reddef_lex_prvt$ = makeSymbol("REDDEF-LEX-PRVT");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    public static final SubLSymbol $reddef_lex_prot$ = makeSymbol("REDDEF-LEX-PROT");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    public static final SubLSymbol $reddef_lex_publ$ = makeSymbol("REDDEF-LEX-PUBL");

    // defparameter
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefparameter")
    private static final SubLSymbol $reddef_par_prvt$ = makeSymbol("REDDEF-PAR-PRVT");

    // defparameter
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefparameter")
    public static final SubLSymbol $reddef_par_prot$ = makeSymbol("REDDEF-PAR-PROT");

    // defparameter
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefparameter")
    public static final SubLSymbol $reddef_par_publ$ = makeSymbol("REDDEF-PAR-PUBL");

    // defvar
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefvar")
    private static final SubLSymbol $reddef_var_prvt$ = makeSymbol("REDDEF-VAR-PRVT");

    // defvar
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefvar")
    public static final SubLSymbol $reddef_var_prot$ = makeSymbol("REDDEF-VAR-PROT");

    // defvar
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndefvar")
    public static final SubLSymbol $reddef_var_publ$ = makeSymbol("REDDEF-VAR-PUBL");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    private static final SubLSymbol $reddef_gbl_prvt$ = makeSymbol("REDDEF-GBL-PRVT");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    public static final SubLSymbol $reddef_gbl_prot$ = makeSymbol("REDDEF-GBL-PROT");

    // deflexical
    // dummy doc info
    /**
     * dummy doc info
     */
    @LispMethod(comment = "dummy doc info\ndeflexical")
    public static final SubLSymbol $reddef_gbl_publ$ = makeSymbol("REDDEF-GBL-PUBL");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("NAME"), makeSymbol("DEFAULTVALUE"), makeSymbol("DESCRIPTION"));

    private static final SubLSymbol DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");

    private static final SubLSymbol RED_DEF_HELPER = makeSymbol("RED-DEF-HELPER");

    static private final SubLList $list7 = list(makeKeyword("PARAMETER"));

    private static final SubLSymbol DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");

    private static final SubLSymbol DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");

    private static final SubLSymbol DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");

    static private final SubLList $list11 = list(makeKeyword("LEXICAL"));

    private static final SubLSymbol DEFLEXICAL_PROTECTED = makeSymbol("DEFLEXICAL-PROTECTED");

    private static final SubLSymbol DEFGLOBAL_PUBLIC = makeSymbol("DEFGLOBAL-PUBLIC");

    static private final SubLList $list15 = list(makeKeyword("GLOBAL"));

    private static final SubLSymbol DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");

    private static final SubLSymbol DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");

    private static final SubLSymbol DEFVAR_PUBLIC = makeSymbol("DEFVAR-PUBLIC");

    static private final SubLList $list19 = list(makeKeyword("VAR"));

    private static final SubLSymbol DEFVAR_PROTECTED = makeSymbol("DEFVAR-PROTECTED");

    private static final SubLSymbol DEFVAR_PRIVATE = makeSymbol("DEFVAR-PRIVATE");

    static private final SubLList $list22 = list(makeKeyword("PARAMETER"), $LIST);

    static private final SubLList $list23 = list(makeKeyword("LEXICAL"), $LIST);

    static private final SubLList $list24 = list(makeKeyword("GLOBAL"), $LIST);

    static private final SubLList $list25 = list(makeKeyword("VAR"), $LIST);

    static private final SubLList $list26 = list(makeSymbol("NAME"));

    private static final SubLSymbol RED_REINITIALIZE_VARIABLE_HELPER = makeSymbol("RED-REINITIALIZE-VARIABLE-HELPER");

    static private final SubLList $list28 = list(new SubLObject[]{ makeSymbol("DEFINE-RED-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-VAR-PUBLIC"), makeSymbol("DEFINE-RED-VAR-PROTECTED"), makeSymbol("DEFINE-RED-VAR-PRIVATE"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-VAR-PUBLIC"), makeSymbol("DEFINE-RED-LIST-VAR-PROTECTED"), makeSymbol("DEFINE-RED-LIST-VAR-PRIVATE") });

    private static final SubLSymbol RED_REINITIALIZE_VARIABLE = makeSymbol("RED-REINITIALIZE-VARIABLE");

    static private final SubLList $list31 = list(makeString("redtest.crtl.worldfile"));

    static private final SubLString $$$dflt = makeString("dflt");

    static private final SubLString $str33$_cyc_CycC_Linux_head_run_world_la = makeString("/cyc/CycC/Linux/head/run/world/latest.load");

    private static final SubLSymbol REDDEF_LEX_PRVT_2 = makeSymbol("REDDEF-LEX-PRVT-2");

    public static final SubLSymbol $red_infrastructure_test_key$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-KEY*");

    private static final SubLSymbol REDDEF_LEX_PRVT = makeSymbol("REDDEF-LEX-PRVT");

    public static final SubLSymbol $red_infrastructure_test_default$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-DEFAULT*");

    private static final SubLSymbol REDDEF_LEX_PROT = makeSymbol("REDDEF-LEX-PROT");

    private static final SubLSymbol REDDEF_LEX_PUBL = makeSymbol("REDDEF-LEX-PUBL");

    private static final SubLSymbol REDDEF_PAR_PRVT = makeSymbol("REDDEF-PAR-PRVT");

    private static final SubLSymbol REDDEF_PAR_PROT = makeSymbol("REDDEF-PAR-PROT");

    private static final SubLSymbol REDDEF_PAR_PUBL = makeSymbol("REDDEF-PAR-PUBL");

    private static final SubLSymbol REDDEF_VAR_PRVT = makeSymbol("REDDEF-VAR-PRVT");

    private static final SubLSymbol REDDEF_VAR_PROT = makeSymbol("REDDEF-VAR-PROT");

    private static final SubLSymbol REDDEF_VAR_PUBL = makeSymbol("REDDEF-VAR-PUBL");

    private static final SubLSymbol REDDEF_GBL_PRVT = makeSymbol("REDDEF-GBL-PRVT");

    private static final SubLSymbol REDDEF_GBL_PROT = makeSymbol("REDDEF-GBL-PROT");

    private static final SubLSymbol REDDEF_GBL_PUBL = makeSymbol("REDDEF-GBL-PUBL");

    static private final SubLString $str53$reddef_gbl_publ_didn_t_have_the_d = makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str54$reddef_gbl_prot_didn_t_have_the_d = makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str55$reddef_gbl_prvt_didn_t_have_the_d = makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str56$reddef_var_publ_didn_t_have_the_d = makeString("reddef-var-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str57$reddef_var_prot_didn_t_have_the_d = makeString("reddef-var-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str58$reddef_var_prvt_didn_t_have_the_d = makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str59$reddef_lex_publ_didn_t_have_the_d = makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str60$reddef_lex_prot_didn_t_have_the_d = makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str61$reddef_lex_prvt_didn_t_have_the_d = makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str62$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");

    static private final SubLString $str63$reddef_par_publ_didn_t_have_the_d = makeString("reddef-par-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str64$reddef_par_prot_didn_t_have_the_d = makeString("reddef-par-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str65$reddef_par_prvt_didn_t_have_the_d = makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str66$reddef_gbl_publ_didn_t_have_the_v = makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str67$reddef_gbl_prot_didn_t_have_the_v = makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str68$reddef_gbl_prvt_didn_t_have_the_v = makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str69$reddef_var_publ_didn_t_have_the_v = makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str70$reddef_var_prot_didn_t_have_the_v = makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str71$reddef_var_prvt_didn_t_have_the_v = makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str72$reddef_lex_publ_didn_t_have_the_v = makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str73$reddef_lex_prot_didn_t_have_the_v = makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str74$reddef_lex_prvt_didn_t_have_the_v = makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str75$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str76$reddef_par_publ_didn_t_have_the_v = makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str77$reddef_par_prot_didn_t_have_the_v = makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str78$reddef_par_prvt_didn_t_have_the_v = makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");

    // Definitions
    /**
     * Define a red public parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_parameter_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt7), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Define a red public parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_parameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list7), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_parameter_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt7), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_parameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list7), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red private parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_parameter_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt7), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red private parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red private parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_parameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list7), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_lexical_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt11), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red public lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_lexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list11), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red protected lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_lexical_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt11), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red protected lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_lexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list11), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_lexical_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt11), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red private lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_lexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list11), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_global_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt15), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red public global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_global_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list15), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_global_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt15), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_global_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list15), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_global_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt15), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red private global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_global_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list15), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_var_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt19), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red public var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_var_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list19), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_var_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt19), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_var_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list19), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_var_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt19), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_var_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list19), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_list_parameter_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt22), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red public parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_list_parameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list22), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_parameter_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt22), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red protected parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_parameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list22), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private parameter.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red private parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_list_parameter_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFPARAMETER_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt22), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red private parameter.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_list_parameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFPARAMETER_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list22), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red public lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_list_lexical_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt23), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red public lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_list_lexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list23), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it.
     */
    @LispMethod(comment = "Define a red protected lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static final SubLObject define_red_list_lexical_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt23), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red protected lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it.")
    public static SubLObject define_red_list_lexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list23), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private lexical.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_lexical_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFLEXICAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt23), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red private lexical.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_lexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFLEXICAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list23), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_global_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt24), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red public global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_global_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list24), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_global_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt24), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red protected global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_global_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list24), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red private global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_global_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFGLOBAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt24), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red private global.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red private global.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_global_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFGLOBAL_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list24), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red public var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_var_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt25), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     * Define a red public var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red public var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_var_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PUBLIC, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list25), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_var_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt25), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_var_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PROTECTED, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list25), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */
    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static final SubLObject define_red_list_var_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject name = NIL;
            SubLObject defaultvalue = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defaultvalue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFVAR_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list_alt25), description);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Define a red protected var.\r\n\r\n@param KEY\r\n\t\teither a list of strings or keywords, or a symbol whose value is a list of strings or keywords.\r\n@param NAME\r\n\t\tsymbol name.\r\n@param DEFAULTVALUE\r\n\t\tthe default value, if its a symbol, use the value of the symbol.\r\n@param DESCRIPTION\r\n\t\ta string with the doc info in it")
    public static SubLObject define_red_list_var_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject name = NIL;
        SubLObject defaultvalue = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        defaultvalue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEFVAR_PRIVATE, name, listS(RED_DEF_HELPER, list(FIF, list(SYMBOLP, list(QUOTE, key)), list(SYMBOL_VALUE, list(QUOTE, key)), list(QUOTE, key)), list(QUOTE, name), list(FIF, list(SYMBOLP, list(QUOTE, defaultvalue)), list(SYMBOL_VALUE, list(QUOTE, defaultvalue)), list(QUOTE, defaultvalue)), $list25), description);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }/**
     * Define a red protected var.
     *
     * @param KEY
     * 		either a list of strings or keywords, or a symbol whose value is a list of strings or keywords.
     * @param NAME
     * 		symbol name.
     * @param DEFAULTVALUE
     * 		the default value, if its a symbol, use the value of the symbol.
     * @param DESCRIPTION
     * 		a string with the doc info in it
     */


    public static final SubLObject red_reinitialize_variable_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            name = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RED_REINITIALIZE_VARIABLE_HELPER, list(QUOTE, name));
            } else {
                cdestructuring_bind_error(datum, $list_alt26);
            }
        }
        return NIL;
    }

    public static SubLObject red_reinitialize_variable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RED_REINITIALIZE_VARIABLE_HELPER, list(QUOTE, name));
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    public static final SubLObject red_def_helper_alt(SubLObject key, SubLObject name, SubLObject defaultvalue, SubLObject ltype, SubLObject valuetype) {
        if (valuetype == UNPROVIDED) {
            valuetype = $SIMPLE;
        }
        {
            SubLObject red_sym = red_infrastructure.new_red_symbol(key, name, defaultvalue, ltype, valuetype);
            red_infrastructure.register_red(red_sym);
            return red_infrastructure.red_value(red_sym);
        }
    }

    public static SubLObject red_def_helper(final SubLObject key, final SubLObject name, final SubLObject defaultvalue, final SubLObject ltype, SubLObject valuetype) {
        if (valuetype == UNPROVIDED) {
            valuetype = $SIMPLE;
        }
        final SubLObject red_sym = red_infrastructure.new_red_symbol(key, name, defaultvalue, ltype, valuetype);
        red_infrastructure.register_red(red_sym);
        return red_infrastructure.red_value(red_sym);
    }

    public static final SubLObject red_reinitialize_variable_helper_alt(SubLObject name) {
        {
            SubLObject red_sym = dictionary.dictionary_lookup(red_infrastructure.$red_variables_dictionary$.getGlobalValue(), name, UNPROVIDED);
            if (NIL != red_sym) {
                red_infrastructure._csetf_red_symbol_set_from_red(red_sym, NIL);
                set(red_infrastructure.red_symbol_name(red_sym), red_infrastructure.red_value(red_sym));
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject red_reinitialize_variable_helper(final SubLObject name) {
        final SubLObject red_sym = dictionary.dictionary_lookup(red_infrastructure.$red_variables_dictionary$.getGlobalValue(), name, UNPROVIDED);
        if (NIL != red_sym) {
            red_infrastructure._csetf_red_symbol_set_from_red(red_sym, NIL);
            set(red_infrastructure.red_symbol_name(red_sym), red_infrastructure.red_value(red_sym));
            return T;
        }
        return NIL;
    }

    public static final SubLObject red_infa_unit_test_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject save_red_variables_dictionary = NIL;
                SubLObject save_red_symbols_list = NIL;
                SubLObject save_repositories_loaded = NIL;
                SubLObject errors = NIL;
                save_red_variables_dictionary = red_infrastructure.$red_variables_dictionary$.getGlobalValue();
                red_infrastructure.$red_variables_dictionary$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                save_red_symbols_list = red_infrastructure.$red_symbols_list$.getGlobalValue();
                red_infrastructure.$red_symbols_list$.setGlobalValue(NIL);
                save_repositories_loaded = red_infrastructure.$repositories_loaded$.getGlobalValue();
                red_infrastructure.$repositories_loaded$.setGlobalValue(NIL);
                $reddef_gbl_publ$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_gbl_prot$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_gbl_prvt$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_lex_publ$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_lex_prot$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_lex_prvt$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_lex_prvt_2$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
                $reddef_par_publ$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                $reddef_par_prot$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                $reddef_par_prvt$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                $reddef_var_publ$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                $reddef_var_prot$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                $reddef_var_prvt$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PROT, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PRVT_2, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PROT, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
                red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
                if (!$reddef_gbl_publ$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt53$reddef_gbl_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue()), errors);
                }
                if (!$reddef_gbl_prot$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt54$reddef_gbl_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue()), errors);
                }
                if (!$reddef_gbl_prvt$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt55$reddef_gbl_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue()), errors);
                }
                if (!$reddef_var_publ$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt56$reddef_var_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_publ$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_var_prot$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt57$reddef_var_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prot$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_var_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt58$reddef_var_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_lex_publ$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt59$reddef_lex_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prot$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt60$reddef_lex_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prvt$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt61$reddef_lex_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prvt_2$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt62$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue()), errors);
                }
                if (!$reddef_par_publ$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt63$reddef_par_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_publ$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_par_prot$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt64$reddef_par_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prot$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_par_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt65$reddef_par_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue(thread)), errors);
                }
                red_infrastructure.set_red_symbols();
                if (!$reddef_gbl_publ$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt66$reddef_gbl_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue()), errors);
                }
                if (!$reddef_gbl_prot$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt67$reddef_gbl_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue()), errors);
                }
                if (!$reddef_gbl_prvt$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt68$reddef_gbl_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue()), errors);
                }
                if (!$reddef_var_publ$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt69$reddef_var_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_publ$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_var_prot$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt70$reddef_var_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prot$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_var_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt71$reddef_var_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_lex_publ$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt72$reddef_lex_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prot$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt73$reddef_lex_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prvt$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt74$reddef_lex_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue()), errors);
                }
                if (!$reddef_lex_prvt_2$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt75$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue()), errors);
                }
                if (!$reddef_par_publ$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt76$reddef_par_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_publ$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_par_prot$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt77$reddef_par_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prot$.getDynamicValue(thread)), errors);
                }
                if (!$reddef_par_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
                    errors = cons(format(NIL, $str_alt78$reddef_par_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue(thread)), errors);
                }
                red_infrastructure.$red_variables_dictionary$.setGlobalValue(save_red_variables_dictionary);
                red_infrastructure.$red_symbols_list$.setGlobalValue(save_red_symbols_list);
                red_infrastructure.$repositories_loaded$.setGlobalValue(save_repositories_loaded);
                return nreverse(errors);
            }
        }
    }

    public static SubLObject red_infa_unit_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject save_red_variables_dictionary = NIL;
        SubLObject save_red_symbols_list = NIL;
        SubLObject save_repositories_loaded = NIL;
        SubLObject errors = NIL;
        save_red_variables_dictionary = red_infrastructure.$red_variables_dictionary$.getGlobalValue();
        red_infrastructure.$red_variables_dictionary$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        save_red_symbols_list = red_infrastructure.$red_symbols_list$.getGlobalValue();
        red_infrastructure.$red_symbols_list$.setGlobalValue(NIL);
        save_repositories_loaded = red_infrastructure.$repositories_loaded$.getGlobalValue();
        red_infrastructure.$repositories_loaded$.setGlobalValue(NIL);
        $reddef_gbl_publ$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_gbl_prot$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_gbl_prvt$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_lex_publ$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_lex_prot$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_lex_prvt$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_lex_prvt_2$.setGlobalValue($red_infrastructure_test_default$.getGlobalValue());
        $reddef_par_publ$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        $reddef_par_prot$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        $reddef_par_prvt$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        $reddef_var_publ$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        $reddef_var_prot$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        $reddef_var_prvt$.setDynamicValue($red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PROT, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_LEX_PRVT_2, $red_infrastructure_test_default$.getGlobalValue(), $LEXICAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PROT, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_GBL_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $GLOBAL, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_PAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $PARAMETER, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol($red_infrastructure_test_key$.getGlobalValue(), REDDEF_VAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $VAR, UNPROVIDED));
        if (!$reddef_gbl_publ$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str53$reddef_gbl_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue()), errors);
        }
        if (!$reddef_gbl_prot$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str54$reddef_gbl_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue()), errors);
        }
        if (!$reddef_gbl_prvt$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str55$reddef_gbl_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue()), errors);
        }
        if (!$reddef_var_publ$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str56$reddef_var_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_publ$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_var_prot$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str57$reddef_var_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prot$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_var_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str58$reddef_var_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_lex_publ$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str59$reddef_lex_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prot$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str60$reddef_lex_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prvt$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str61$reddef_lex_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prvt_2$.getGlobalValue().equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str62$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue()), errors);
        }
        if (!$reddef_par_publ$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str63$reddef_par_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_publ$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_par_prot$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str64$reddef_par_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prot$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_par_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_default$.getGlobalValue())) {
            errors = cons(format(NIL, $str65$reddef_par_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue(thread)), errors);
        }
        red_infrastructure.set_red_symbols();
        if (!$reddef_gbl_publ$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str66$reddef_gbl_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue()), errors);
        }
        if (!$reddef_gbl_prot$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str67$reddef_gbl_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue()), errors);
        }
        if (!$reddef_gbl_prvt$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str68$reddef_gbl_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue()), errors);
        }
        if (!$reddef_var_publ$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str69$reddef_var_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_publ$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_var_prot$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str70$reddef_var_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prot$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_var_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str71$reddef_var_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_lex_publ$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str72$reddef_lex_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prot$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str73$reddef_lex_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prvt$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str74$reddef_lex_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue()), errors);
        }
        if (!$reddef_lex_prvt_2$.getGlobalValue().equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str75$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue()), errors);
        }
        if (!$reddef_par_publ$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str76$reddef_par_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_publ$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_par_prot$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str77$reddef_par_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prot$.getDynamicValue(thread)), errors);
        }
        if (!$reddef_par_prvt$.getDynamicValue(thread).equal($red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = cons(format(NIL, $str78$reddef_par_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue(thread)), errors);
        }
        red_infrastructure.$red_variables_dictionary$.setGlobalValue(save_red_variables_dictionary);
        red_infrastructure.$red_symbols_list$.setGlobalValue(save_red_symbols_list);
        red_infrastructure.$repositories_loaded$.setGlobalValue(save_repositories_loaded);
        return nreverse(errors);
    }

    public static SubLObject declare_red_infrastructure_macros_file() {
        declareMacro("define_red_parameter_public", "DEFINE-RED-PARAMETER-PUBLIC");
        declareMacro("define_red_parameter_protected", "DEFINE-RED-PARAMETER-PROTECTED");
        declareMacro("define_red_parameter_private", "DEFINE-RED-PARAMETER-PRIVATE");
        declareMacro("define_red_lexical_public", "DEFINE-RED-LEXICAL-PUBLIC");
        declareMacro("define_red_lexical_protected", "DEFINE-RED-LEXICAL-PROTECTED");
        declareMacro("define_red_lexical_private", "DEFINE-RED-LEXICAL-PRIVATE");
        declareMacro("define_red_global_public", "DEFINE-RED-GLOBAL-PUBLIC");
        declareMacro("define_red_global_protected", "DEFINE-RED-GLOBAL-PROTECTED");
        declareMacro("define_red_global_private", "DEFINE-RED-GLOBAL-PRIVATE");
        declareMacro("define_red_var_public", "DEFINE-RED-VAR-PUBLIC");
        declareMacro("define_red_var_protected", "DEFINE-RED-VAR-PROTECTED");
        declareMacro("define_red_var_private", "DEFINE-RED-VAR-PRIVATE");
        declareMacro("define_red_list_parameter_public", "DEFINE-RED-LIST-PARAMETER-PUBLIC");
        declareMacro("define_red_list_parameter_protected", "DEFINE-RED-LIST-PARAMETER-PROTECTED");
        declareMacro("define_red_list_parameter_private", "DEFINE-RED-LIST-PARAMETER-PRIVATE");
        declareMacro("define_red_list_lexical_public", "DEFINE-RED-LIST-LEXICAL-PUBLIC");
        declareMacro("define_red_list_lexical_protected", "DEFINE-RED-LIST-LEXICAL-PROTECTED");
        declareMacro("define_red_list_lexical_private", "DEFINE-RED-LIST-LEXICAL-PRIVATE");
        declareMacro("define_red_list_global_public", "DEFINE-RED-LIST-GLOBAL-PUBLIC");
        declareMacro("define_red_list_global_protected", "DEFINE-RED-LIST-GLOBAL-PROTECTED");
        declareMacro("define_red_list_global_private", "DEFINE-RED-LIST-GLOBAL-PRIVATE");
        declareMacro("define_red_list_var_public", "DEFINE-RED-LIST-VAR-PUBLIC");
        declareMacro("define_red_list_var_protected", "DEFINE-RED-LIST-VAR-PROTECTED");
        declareMacro("define_red_list_var_private", "DEFINE-RED-LIST-VAR-PRIVATE");
        declareMacro("red_reinitialize_variable", "RED-REINITIALIZE-VARIABLE");
        declareFunction("red_def_helper", "RED-DEF-HELPER", 4, 1, false);
        declareFunction("red_reinitialize_variable_helper", "RED-REINITIALIZE-VARIABLE-HELPER", 1, 0, false);
        declareFunction("red_infa_unit_test", "RED-INFA-UNIT-TEST", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_red_infrastructure_macros_file_alt() {
        defconstant("*RED-INFRASTRUCTURE-TEST-KEY*", $list_alt31);
        defconstant("*RED-INFRASTRUCTURE-TEST-DEFAULT*", $$$dflt);
        defconstant("*RED-INFRASTRUCTURE-TEST-RED-VALUE*", $str_alt33$_cyc_CycC_Linux_head_run_world_la);
        deflexical("REDDEF-LEX-PRVT-2", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($list_alt31.isSymbol() ? ((SubLObject) (symbol_value($list_alt31))) : $list_alt31, REDDEF_LEX_PRVT_2, $$$dflt.isSymbol() ? ((SubLObject) (symbol_value($$$dflt))) : $$$dflt, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        defparameter("REDDEF-PAR-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defparameter("REDDEF-PAR-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defparameter("REDDEF-PAR-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defvar("REDDEF-VAR-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        defvar("REDDEF-VAR-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        defvar("REDDEF-VAR-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        deflexical("REDDEF-GBL-PRVT", NIL != boundp(REDDEF_GBL_PRVT) ? ((SubLObject) ($reddef_gbl_prvt$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
        deflexical("REDDEF-GBL-PROT", NIL != boundp(REDDEF_GBL_PROT) ? ((SubLObject) ($reddef_gbl_prot$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
        deflexical("REDDEF-GBL-PUBL", NIL != boundp(REDDEF_GBL_PUBL) ? ((SubLObject) ($reddef_gbl_publ$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_red_infrastructure_macros_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*RED-INFRASTRUCTURE-TEST-KEY*", $list31);
            defconstant("*RED-INFRASTRUCTURE-TEST-DEFAULT*", $$$dflt);
            defconstant("*RED-INFRASTRUCTURE-TEST-RED-VALUE*", $str33$_cyc_CycC_Linux_head_run_world_la);
            deflexical("REDDEF-LEX-PRVT-2", red_def_helper($list31.isSymbol() ? symbol_value($list31) : $list31, REDDEF_LEX_PRVT_2, $$$dflt.isSymbol() ? symbol_value($$$dflt) : $$$dflt, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            defparameter("REDDEF-PAR-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defparameter("REDDEF-PAR-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defparameter("REDDEF-PAR-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defvar("REDDEF-VAR-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            defvar("REDDEF-VAR-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            defvar("REDDEF-VAR-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            deflexical("REDDEF-GBL-PRVT", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PRVT, $reddef_gbl_prvt$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
            deflexical("REDDEF-GBL-PROT", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PROT, $reddef_gbl_prot$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
            deflexical("REDDEF-GBL-PUBL", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PUBL, $reddef_gbl_publ$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("REDDEF-LEX-PRVT-2", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($list_alt31.isSymbol() ? ((SubLObject) (symbol_value($list_alt31))) : $list_alt31, REDDEF_LEX_PRVT_2, $$$dflt.isSymbol() ? ((SubLObject) (symbol_value($$$dflt))) : $$$dflt, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            deflexical("REDDEF-LEX-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_LEX_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
            defparameter("REDDEF-PAR-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defparameter("REDDEF-PAR-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defparameter("REDDEF-PAR-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_PAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
            defvar("REDDEF-VAR-PRVT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            defvar("REDDEF-VAR-PROT", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            defvar("REDDEF-VAR-PUBL", com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_VAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
            deflexical("REDDEF-GBL-PRVT", NIL != boundp(REDDEF_GBL_PRVT) ? ((SubLObject) ($reddef_gbl_prvt$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PRVT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
            deflexical("REDDEF-GBL-PROT", NIL != boundp(REDDEF_GBL_PROT) ? ((SubLObject) ($reddef_gbl_prot$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PROT, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
            deflexical("REDDEF-GBL-PUBL", NIL != boundp(REDDEF_GBL_PUBL) ? ((SubLObject) ($reddef_gbl_publ$.getGlobalValue())) : com.cyc.cycjava.cycl.red_infrastructure_macros.red_def_helper($red_infrastructure_test_key$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_key$))) : $red_infrastructure_test_key$, REDDEF_GBL_PUBL, $red_infrastructure_test_default$.isSymbol() ? ((SubLObject) (symbol_value($red_infrastructure_test_default$))) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_red_infrastructure_macros_file_Previous() {
        defconstant("*RED-INFRASTRUCTURE-TEST-KEY*", $list31);
        defconstant("*RED-INFRASTRUCTURE-TEST-DEFAULT*", $$$dflt);
        defconstant("*RED-INFRASTRUCTURE-TEST-RED-VALUE*", $str33$_cyc_CycC_Linux_head_run_world_la);
        deflexical("REDDEF-LEX-PRVT-2", red_def_helper($list31.isSymbol() ? symbol_value($list31) : $list31, REDDEF_LEX_PRVT_2, $$$dflt.isSymbol() ? symbol_value($$$dflt) : $$$dflt, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        deflexical("REDDEF-LEX-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_LEX_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $LEXICAL, UNPROVIDED));
        defparameter("REDDEF-PAR-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defparameter("REDDEF-PAR-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defparameter("REDDEF-PAR-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_PAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $PARAMETER, UNPROVIDED));
        defvar("REDDEF-VAR-PRVT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        defvar("REDDEF-VAR-PROT", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        defvar("REDDEF-VAR-PUBL", red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_VAR_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $VAR, UNPROVIDED));
        deflexical("REDDEF-GBL-PRVT", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PRVT, $reddef_gbl_prvt$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PRVT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
        deflexical("REDDEF-GBL-PROT", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PROT, $reddef_gbl_prot$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PROT, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
        deflexical("REDDEF-GBL-PUBL", SubLTrampolineFile.maybeDefault(REDDEF_GBL_PUBL, $reddef_gbl_publ$, () -> red_def_helper($red_infrastructure_test_key$.isSymbol() ? symbol_value($red_infrastructure_test_key$) : $red_infrastructure_test_key$, REDDEF_GBL_PUBL, $red_infrastructure_test_default$.isSymbol() ? symbol_value($red_infrastructure_test_default$) : $red_infrastructure_test_default$, $GLOBAL, UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_red_infrastructure_macros_file_alt() {
        register_macro_helper(RED_DEF_HELPER, $list_alt28);
        register_macro_helper(RED_REINITIALIZE_VARIABLE_HELPER, RED_REINITIALIZE_VARIABLE);
        declare_defglobal(REDDEF_GBL_PRVT);
        declare_defglobal(REDDEF_GBL_PROT);
        declare_defglobal(REDDEF_GBL_PUBL);
        sunit_external.define_test_category($$$Red_infrastructure, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_red_infrastructure_macros_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(RED_DEF_HELPER, $list28);
            register_macro_helper(RED_REINITIALIZE_VARIABLE_HELPER, RED_REINITIALIZE_VARIABLE);
            declare_defglobal(REDDEF_GBL_PRVT);
            declare_defglobal(REDDEF_GBL_PROT);
            declare_defglobal(REDDEF_GBL_PUBL);
        }
        if (SubLFiles.USE_V2) {
            sunit_external.define_test_category($$$Red_infrastructure, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_red_infrastructure_macros_file_Previous() {
        register_macro_helper(RED_DEF_HELPER, $list28);
        register_macro_helper(RED_REINITIALIZE_VARIABLE_HELPER, RED_REINITIALIZE_VARIABLE);
        declare_defglobal(REDDEF_GBL_PRVT);
        declare_defglobal(REDDEF_GBL_PROT);
        declare_defglobal(REDDEF_GBL_PUBL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_red_infrastructure_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_red_infrastructure_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_red_infrastructure_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("KEY"), makeSymbol("NAME"), makeSymbol("DEFAULTVALUE"), makeSymbol("DESCRIPTION"));

    static private final SubLList $list_alt7 = list(makeKeyword("PARAMETER"));

    static private final SubLList $list_alt11 = list(makeKeyword("LEXICAL"));

    static private final SubLList $list_alt15 = list(makeKeyword("GLOBAL"));

    static private final SubLList $list_alt19 = list(makeKeyword("VAR"));

    static private final SubLList $list_alt22 = list(makeKeyword("PARAMETER"), $LIST);

    static private final SubLList $list_alt23 = list(makeKeyword("LEXICAL"), $LIST);

    static private final SubLList $list_alt24 = list(makeKeyword("GLOBAL"), $LIST);

    static private final SubLList $list_alt25 = list(makeKeyword("VAR"), $LIST);

    static private final SubLList $list_alt26 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeSymbol("DEFINE-RED-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-VAR-PUBLIC"), makeSymbol("DEFINE-RED-VAR-PROTECTED"), makeSymbol("DEFINE-RED-VAR-PRIVATE"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-VAR-PUBLIC"), makeSymbol("DEFINE-RED-LIST-VAR-PROTECTED"), makeSymbol("DEFINE-RED-LIST-VAR-PRIVATE") });

    static private final SubLList $list_alt31 = list(makeString("redtest.crtl.worldfile"));

    static private final SubLString $str_alt33$_cyc_CycC_Linux_head_run_world_la = makeString("/cyc/CycC/Linux/head/run/world/latest.load");

    static private final SubLString $str_alt53$reddef_gbl_publ_didn_t_have_the_d = makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt54$reddef_gbl_prot_didn_t_have_the_d = makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt55$reddef_gbl_prvt_didn_t_have_the_d = makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt56$reddef_var_publ_didn_t_have_the_d = makeString("reddef-var-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt57$reddef_var_prot_didn_t_have_the_d = makeString("reddef-var-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt58$reddef_var_prvt_didn_t_have_the_d = makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt59$reddef_lex_publ_didn_t_have_the_d = makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt60$reddef_lex_prot_didn_t_have_the_d = makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt61$reddef_lex_prvt_didn_t_have_the_d = makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt62$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt63$reddef_par_publ_didn_t_have_the_d = makeString("reddef-par-publ didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt64$reddef_par_prot_didn_t_have_the_d = makeString("reddef-par-prot didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt65$reddef_par_prvt_didn_t_have_the_d = makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");

    static private final SubLString $str_alt66$reddef_gbl_publ_didn_t_have_the_v = makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt67$reddef_gbl_prot_didn_t_have_the_v = makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt68$reddef_gbl_prvt_didn_t_have_the_v = makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt69$reddef_var_publ_didn_t_have_the_v = makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt70$reddef_var_prot_didn_t_have_the_v = makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt71$reddef_var_prvt_didn_t_have_the_v = makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt72$reddef_lex_publ_didn_t_have_the_v = makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt73$reddef_lex_prot_didn_t_have_the_v = makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt74$reddef_lex_prvt_didn_t_have_the_v = makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt75$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt76$reddef_par_publ_didn_t_have_the_v = makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt77$reddef_par_prot_didn_t_have_the_v = makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $str_alt78$reddef_par_prvt_didn_t_have_the_v = makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");

    static private final SubLString $$$Red_infrastructure = makeString("Red infrastructure");
}

/**
 * Total time: 328 ms
 */
