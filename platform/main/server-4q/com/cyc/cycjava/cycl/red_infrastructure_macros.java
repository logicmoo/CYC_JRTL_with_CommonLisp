package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class red_infrastructure_macros extends SubLTranslatedFile {
    public static final SubLFile me = new red_infrastructure_macros();

    public static final String myName = "com.cyc.cycjava.cycl.red_infrastructure_macros";

    public static final String myFingerPrint = "63986bd00b5efd5da61d914c1d317bdab5ac4f0c4994314831c6f2c53a29176a";





    // defconstant
    private static final SubLSymbol $red_infrastructure_test_red_value$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-RED-VALUE*");

    // deflexical
    // dummy doc info
    private static final SubLSymbol $reddef_lex_prvt_2$ = makeSymbol("REDDEF-LEX-PRVT-2");

    // deflexical
    // dummy doc info
    private static final SubLSymbol $reddef_lex_prvt$ = makeSymbol("REDDEF-LEX-PRVT");

    // deflexical
    // dummy doc info
    public static final SubLSymbol $reddef_lex_prot$ = makeSymbol("REDDEF-LEX-PROT");

    // deflexical
    // dummy doc info
    public static final SubLSymbol $reddef_lex_publ$ = makeSymbol("REDDEF-LEX-PUBL");

    // defparameter
    // dummy doc info
    private static final SubLSymbol $reddef_par_prvt$ = makeSymbol("REDDEF-PAR-PRVT");

    // defparameter
    // dummy doc info
    public static final SubLSymbol $reddef_par_prot$ = makeSymbol("REDDEF-PAR-PROT");

    // defparameter
    // dummy doc info
    public static final SubLSymbol $reddef_par_publ$ = makeSymbol("REDDEF-PAR-PUBL");

    // defvar
    // dummy doc info
    private static final SubLSymbol $reddef_var_prvt$ = makeSymbol("REDDEF-VAR-PRVT");

    // defvar
    // dummy doc info
    public static final SubLSymbol $reddef_var_prot$ = makeSymbol("REDDEF-VAR-PROT");

    // defvar
    // dummy doc info
    public static final SubLSymbol $reddef_var_publ$ = makeSymbol("REDDEF-VAR-PUBL");

    // deflexical
    // dummy doc info
    private static final SubLSymbol $reddef_gbl_prvt$ = makeSymbol("REDDEF-GBL-PRVT");

    // deflexical
    // dummy doc info
    public static final SubLSymbol $reddef_gbl_prot$ = makeSymbol("REDDEF-GBL-PROT");

    // deflexical
    // dummy doc info
    public static final SubLSymbol $reddef_gbl_publ$ = makeSymbol("REDDEF-GBL-PUBL");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("NAME"), makeSymbol("DEFAULTVALUE"), makeSymbol("DESCRIPTION"));

    public static final SubLSymbol DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");

    public static final SubLSymbol RED_DEF_HELPER = makeSymbol("RED-DEF-HELPER");









    public static final SubLList $list7 = list(makeKeyword("PARAMETER"));

    public static final SubLSymbol DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");

    public static final SubLSymbol DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");

    public static final SubLSymbol DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");

    public static final SubLList $list11 = list(makeKeyword("LEXICAL"));

    public static final SubLSymbol DEFLEXICAL_PROTECTED = makeSymbol("DEFLEXICAL-PROTECTED");



    public static final SubLSymbol DEFGLOBAL_PUBLIC = makeSymbol("DEFGLOBAL-PUBLIC");

    public static final SubLList $list15 = list(makeKeyword("GLOBAL"));

    public static final SubLSymbol DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");

    public static final SubLSymbol DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");

    public static final SubLSymbol DEFVAR_PUBLIC = makeSymbol("DEFVAR-PUBLIC");

    public static final SubLList $list19 = list(makeKeyword("VAR"));

    public static final SubLSymbol DEFVAR_PROTECTED = makeSymbol("DEFVAR-PROTECTED");

    public static final SubLSymbol DEFVAR_PRIVATE = makeSymbol("DEFVAR-PRIVATE");

    public static final SubLList $list22 = list(makeKeyword("PARAMETER"), makeKeyword("LIST"));

    public static final SubLList $list23 = list(makeKeyword("LEXICAL"), makeKeyword("LIST"));

    public static final SubLList $list24 = list(makeKeyword("GLOBAL"), makeKeyword("LIST"));

    public static final SubLList $list25 = list(makeKeyword("VAR"), makeKeyword("LIST"));

    public static final SubLList $list26 = list(makeSymbol("NAME"));

    public static final SubLSymbol RED_REINITIALIZE_VARIABLE_HELPER = makeSymbol("RED-REINITIALIZE-VARIABLE-HELPER");

    public static final SubLList $list28 = list(new SubLObject[]{ makeSymbol("DEFINE-RED-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-VAR-PUBLIC"), makeSymbol("DEFINE-RED-VAR-PROTECTED"), makeSymbol("DEFINE-RED-VAR-PRIVATE"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PUBLIC"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PROTECTED"), makeSymbol("DEFINE-RED-LIST-PARAMETER-PRIVATE"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-LEXICAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PUBLIC"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PROTECTED"), makeSymbol("DEFINE-RED-LIST-GLOBAL-PRIVATE"), makeSymbol("DEFINE-RED-LIST-VAR-PUBLIC"), makeSymbol("DEFINE-RED-LIST-VAR-PROTECTED"), makeSymbol("DEFINE-RED-LIST-VAR-PRIVATE") });



    public static final SubLSymbol RED_REINITIALIZE_VARIABLE = makeSymbol("RED-REINITIALIZE-VARIABLE");

    public static final SubLList $list31 = list(makeString("redtest.crtl.worldfile"));

    public static final SubLString $$$dflt = makeString("dflt");

    public static final SubLString $str33$_cyc_CycC_Linux_head_run_world_la = makeString("/cyc/CycC/Linux/head/run/world/latest.load");

    public static final SubLSymbol REDDEF_LEX_PRVT_2 = makeSymbol("REDDEF-LEX-PRVT-2");



    public static final SubLSymbol $red_infrastructure_test_key$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-KEY*");

    public static final SubLSymbol REDDEF_LEX_PRVT = makeSymbol("REDDEF-LEX-PRVT");

    public static final SubLSymbol $red_infrastructure_test_default$ = makeSymbol("*RED-INFRASTRUCTURE-TEST-DEFAULT*");

    public static final SubLSymbol REDDEF_LEX_PROT = makeSymbol("REDDEF-LEX-PROT");

    public static final SubLSymbol REDDEF_LEX_PUBL = makeSymbol("REDDEF-LEX-PUBL");

    public static final SubLSymbol REDDEF_PAR_PRVT = makeSymbol("REDDEF-PAR-PRVT");



    public static final SubLSymbol REDDEF_PAR_PROT = makeSymbol("REDDEF-PAR-PROT");

    public static final SubLSymbol REDDEF_PAR_PUBL = makeSymbol("REDDEF-PAR-PUBL");

    public static final SubLSymbol REDDEF_VAR_PRVT = makeSymbol("REDDEF-VAR-PRVT");



    public static final SubLSymbol REDDEF_VAR_PROT = makeSymbol("REDDEF-VAR-PROT");

    public static final SubLSymbol REDDEF_VAR_PUBL = makeSymbol("REDDEF-VAR-PUBL");

    public static final SubLSymbol REDDEF_GBL_PRVT = makeSymbol("REDDEF-GBL-PRVT");



    public static final SubLSymbol REDDEF_GBL_PROT = makeSymbol("REDDEF-GBL-PROT");

    public static final SubLSymbol REDDEF_GBL_PUBL = makeSymbol("REDDEF-GBL-PUBL");

    public static final SubLString $str53$reddef_gbl_publ_didn_t_have_the_d = makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");

    public static final SubLString $str54$reddef_gbl_prot_didn_t_have_the_d = makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");

    public static final SubLString $str55$reddef_gbl_prvt_didn_t_have_the_d = makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");

    public static final SubLString $str56$reddef_var_publ_didn_t_have_the_d = makeString("reddef-var-publ didn't have the default value(~s) ~s~%");

    public static final SubLString $str57$reddef_var_prot_didn_t_have_the_d = makeString("reddef-var-prot didn't have the default value(~s) ~s~%");

    public static final SubLString $str58$reddef_var_prvt_didn_t_have_the_d = makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");

    public static final SubLString $str59$reddef_lex_publ_didn_t_have_the_d = makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");

    public static final SubLString $str60$reddef_lex_prot_didn_t_have_the_d = makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");

    public static final SubLString $str61$reddef_lex_prvt_didn_t_have_the_d = makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");

    public static final SubLString $str62$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");

    public static final SubLString $str63$reddef_par_publ_didn_t_have_the_d = makeString("reddef-par-publ didn't have the default value(~s) ~s~%");

    public static final SubLString $str64$reddef_par_prot_didn_t_have_the_d = makeString("reddef-par-prot didn't have the default value(~s) ~s~%");

    public static final SubLString $str65$reddef_par_prvt_didn_t_have_the_d = makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");

    public static final SubLString $str66$reddef_gbl_publ_didn_t_have_the_v = makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str67$reddef_gbl_prot_didn_t_have_the_v = makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str68$reddef_gbl_prvt_didn_t_have_the_v = makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str69$reddef_var_publ_didn_t_have_the_v = makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str70$reddef_var_prot_didn_t_have_the_v = makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str71$reddef_var_prvt_didn_t_have_the_v = makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str72$reddef_lex_publ_didn_t_have_the_v = makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str73$reddef_lex_prot_didn_t_have_the_v = makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str74$reddef_lex_prvt_didn_t_have_the_v = makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str75$reddef_lex_prvt_2_didn_t_have_the = makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str76$reddef_par_publ_didn_t_have_the_v = makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str77$reddef_par_prot_didn_t_have_the_v = makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");

    public static final SubLString $str78$reddef_par_prvt_didn_t_have_the_v = makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");

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

    public static SubLObject red_def_helper(final SubLObject key, final SubLObject name, final SubLObject defaultvalue, final SubLObject ltype, SubLObject valuetype) {
        if (valuetype == UNPROVIDED) {
            valuetype = $SIMPLE;
        }
        final SubLObject red_sym = red_infrastructure.new_red_symbol(key, name, defaultvalue, ltype, valuetype);
        red_infrastructure.register_red(red_sym);
        return red_infrastructure.red_value(red_sym);
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
        declareMacro(me, "define_red_parameter_public", "DEFINE-RED-PARAMETER-PUBLIC");
        declareMacro(me, "define_red_parameter_protected", "DEFINE-RED-PARAMETER-PROTECTED");
        declareMacro(me, "define_red_parameter_private", "DEFINE-RED-PARAMETER-PRIVATE");
        declareMacro(me, "define_red_lexical_public", "DEFINE-RED-LEXICAL-PUBLIC");
        declareMacro(me, "define_red_lexical_protected", "DEFINE-RED-LEXICAL-PROTECTED");
        declareMacro(me, "define_red_lexical_private", "DEFINE-RED-LEXICAL-PRIVATE");
        declareMacro(me, "define_red_global_public", "DEFINE-RED-GLOBAL-PUBLIC");
        declareMacro(me, "define_red_global_protected", "DEFINE-RED-GLOBAL-PROTECTED");
        declareMacro(me, "define_red_global_private", "DEFINE-RED-GLOBAL-PRIVATE");
        declareMacro(me, "define_red_var_public", "DEFINE-RED-VAR-PUBLIC");
        declareMacro(me, "define_red_var_protected", "DEFINE-RED-VAR-PROTECTED");
        declareMacro(me, "define_red_var_private", "DEFINE-RED-VAR-PRIVATE");
        declareMacro(me, "define_red_list_parameter_public", "DEFINE-RED-LIST-PARAMETER-PUBLIC");
        declareMacro(me, "define_red_list_parameter_protected", "DEFINE-RED-LIST-PARAMETER-PROTECTED");
        declareMacro(me, "define_red_list_parameter_private", "DEFINE-RED-LIST-PARAMETER-PRIVATE");
        declareMacro(me, "define_red_list_lexical_public", "DEFINE-RED-LIST-LEXICAL-PUBLIC");
        declareMacro(me, "define_red_list_lexical_protected", "DEFINE-RED-LIST-LEXICAL-PROTECTED");
        declareMacro(me, "define_red_list_lexical_private", "DEFINE-RED-LIST-LEXICAL-PRIVATE");
        declareMacro(me, "define_red_list_global_public", "DEFINE-RED-LIST-GLOBAL-PUBLIC");
        declareMacro(me, "define_red_list_global_protected", "DEFINE-RED-LIST-GLOBAL-PROTECTED");
        declareMacro(me, "define_red_list_global_private", "DEFINE-RED-LIST-GLOBAL-PRIVATE");
        declareMacro(me, "define_red_list_var_public", "DEFINE-RED-LIST-VAR-PUBLIC");
        declareMacro(me, "define_red_list_var_protected", "DEFINE-RED-LIST-VAR-PROTECTED");
        declareMacro(me, "define_red_list_var_private", "DEFINE-RED-LIST-VAR-PRIVATE");
        declareMacro(me, "red_reinitialize_variable", "RED-REINITIALIZE-VARIABLE");
        declareFunction(me, "red_def_helper", "RED-DEF-HELPER", 4, 1, false);
        declareFunction(me, "red_reinitialize_variable_helper", "RED-REINITIALIZE-VARIABLE-HELPER", 1, 0, false);
        declareFunction(me, "red_infa_unit_test", "RED-INFA-UNIT-TEST", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_red_infrastructure_macros_file() {
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

    public static SubLObject setup_red_infrastructure_macros_file() {
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

    
}

/**
 * Total time: 328 ms
 */
