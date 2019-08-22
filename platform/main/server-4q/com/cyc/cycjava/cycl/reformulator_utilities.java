package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_utilities";

    public static final String myFingerPrint = "dcd44590712798797edb6835f49e333dded220514e799f070144582754700257";

    // defparameter
    public static final SubLSymbol $reformulator_settings_for_query_processing$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUERY-PROCESSING*");

    // defparameter
    public static final SubLSymbol $reformulator_settings_for_wff_violation_resolution$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-WFF-VIOLATION-RESOLUTION*");

    // defparameter
    public static final SubLSymbol $reformulator_settings_for_dates_reformulation$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-DATES-REFORMULATION*");

    // defparameter
    public static final SubLSymbol $reformulator_settings_for_exception_rules$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-EXCEPTION-RULES*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("FOCUS"), reader_make_constant_shell(makeString("QueryProcessingRLModule")));



    public static final SubLList $list2 = list(makeKeyword("FOCUS"), reader_make_constant_shell(makeString("WffViolationResolutionRLModule")));

    public static final SubLList $list3 = list(makeKeyword("FOCUS"), reader_make_constant_shell(makeString("DatesReformulatorRLModule")));

    public static final SubLList $list4 = list(makeKeyword("MODES"), list(reader_make_constant_shell(makeString("ReformulatorMode-Simplify"))));

    public static SubLObject reformulate_cycls(final SubLObject cycls, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(reformulator_hub.reformulate_cycl(cycl, mt, settings), result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject reformulate_query_cycls(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        SubLObject temp_result = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            temp_result = reformulate_cycl_query_processing(expression, mt, limit);
            if (NIL != el_formula_p(temp_result)) {
                result = cons(temp_result, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject reformulate_cycl_query_processing(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_query_processing$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_query_processing$.getDynamicValue(thread)), expression);
    }

    public static SubLObject reformulate_cycl_wff_options(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_wff_violation_resolution$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_wff_violation_resolution$.getDynamicValue(thread)), list(expression));
    }

    public static SubLObject reformulate_cycl_dates(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_dates_reformulation$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_dates_reformulation$.getDynamicValue(thread)), expression);
    }

    public static SubLObject reformulator_first_of(final SubLObject thing1, final SubLObject thing2) {
        return NIL != thing1 ? thing1 : thing2;
    }

    public static SubLObject reformulate_cycl_exception_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_exception_rules$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_exception_rules$.getDynamicValue(thread)), expression);
    }

    public static SubLObject declare_reformulator_utilities_file() {
        declareFunction(me, "reformulate_cycls", "REFORMULATE-CYCLS", 1, 2, false);
        declareFunction(me, "reformulate_query_cycls", "REFORMULATE-QUERY-CYCLS", 2, 1, false);
        declareFunction(me, "reformulate_cycl_query_processing", "REFORMULATE-CYCL-QUERY-PROCESSING", 2, 1, false);
        declareFunction(me, "reformulate_cycl_wff_options", "REFORMULATE-CYCL-WFF-OPTIONS", 2, 1, false);
        declareFunction(me, "reformulate_cycl_dates", "REFORMULATE-CYCL-DATES", 2, 1, false);
        declareFunction(me, "reformulator_first_of", "REFORMULATOR-FIRST-OF", 2, 0, false);
        declareFunction(me, "reformulate_cycl_exception_rules", "REFORMULATE-CYCL-EXCEPTION-RULES", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_reformulator_utilities_file() {
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUERY-PROCESSING*", $list0);
        defparameter("*REFORMULATOR-SETTINGS-FOR-WFF-VIOLATION-RESOLUTION*", $list2);
        defparameter("*REFORMULATOR-SETTINGS-FOR-DATES-REFORMULATION*", $list3);
        defparameter("*REFORMULATOR-SETTINGS-FOR-EXCEPTION-RULES*", $list4);
        return NIL;
    }

    public static SubLObject setup_reformulator_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_utilities_file();
    }

    
}

/**
 * Total time: 75 ms
 */
