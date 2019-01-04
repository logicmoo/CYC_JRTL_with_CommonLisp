package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_utilities";
    public static final String myFingerPrint = "dcd44590712798797edb6835f49e333dded220514e799f070144582754700257";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1170L)
    public static SubLSymbol $reformulator_settings_for_query_processing$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1965L)
    public static SubLSymbol $reformulator_settings_for_wff_violation_resolution$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2593L)
    public static SubLSymbol $reformulator_settings_for_dates_reformulation$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3322L)
    public static SubLSymbol $reformulator_settings_for_exception_rules$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$RECURSION_LIMIT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 751L)
    public static SubLObject reformulate_cycls(final SubLObject cycls, SubLObject mt, SubLObject settings) {
        if (mt == reformulator_utilities.UNPROVIDED) {
            mt = (SubLObject)reformulator_utilities.NIL;
        }
        if (settings == reformulator_utilities.UNPROVIDED) {
            settings = (SubLObject)reformulator_utilities.NIL;
        }
        SubLObject result = (SubLObject)reformulator_utilities.NIL;
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = (SubLObject)reformulator_utilities.NIL;
        cycl = cdolist_list_var.first();
        while (reformulator_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(reformulator_hub.reformulate_cycl(cycl, mt, settings), result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1281L)
    public static SubLObject reformulate_query_cycls(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities.ZERO_INTEGER;
        }
        SubLObject temp_result = (SubLObject)reformulator_utilities.NIL;
        SubLObject result = (SubLObject)reformulator_utilities.NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = (SubLObject)reformulator_utilities.NIL;
        expression = cdolist_list_var.first();
        while (reformulator_utilities.NIL != cdolist_list_var) {
            temp_result = reformulate_cycl_query_processing(expression, mt, limit);
            if (reformulator_utilities.NIL != el_utilities.el_formula_p(temp_result)) {
                result = (SubLObject)ConsesLow.cons(temp_result, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1601L)
    public static SubLObject reformulate_cycl_query_processing(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities.$reformulator_settings_for_query_processing$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities.$reformulator_settings_for_query_processing$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2112L)
    public static SubLObject reformulate_cycl_wff_options(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities.$reformulator_settings_for_wff_violation_resolution$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities.$reformulator_settings_for_wff_violation_resolution$.getDynamicValue(thread)), (SubLObject)ConsesLow.list(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2710L)
    public static SubLObject reformulate_cycl_dates(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities.$reformulator_settings_for_dates_reformulation$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities.$reformulator_settings_for_dates_reformulation$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3058L)
    public static SubLObject reformulator_first_of(final SubLObject thing1, final SubLObject thing2) {
        return (reformulator_utilities.NIL != thing1) ? thing1 : thing2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3494L)
    public static SubLObject reformulate_cycl_exception_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities.$reformulator_settings_for_exception_rules$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities.$reformulator_settings_for_exception_rules$.getDynamicValue(thread)), expression);
    }
    
    public static SubLObject declare_reformulator_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_cycls", "REFORMULATE-CYCLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_query_cycls", "REFORMULATE-QUERY-CYCLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_cycl_query_processing", "REFORMULATE-CYCL-QUERY-PROCESSING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_cycl_wff_options", "REFORMULATE-CYCL-WFF-OPTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_cycl_dates", "REFORMULATE-CYCL-DATES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulator_first_of", "REFORMULATOR-FIRST-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities", "reformulate_cycl_exception_rules", "REFORMULATE-CYCL-EXCEPTION-RULES", 2, 1, false);
        return (SubLObject)reformulator_utilities.NIL;
    }
    
    public static SubLObject init_reformulator_utilities_file() {
        reformulator_utilities.$reformulator_settings_for_query_processing$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUERY-PROCESSING*", (SubLObject)reformulator_utilities.$list0);
        reformulator_utilities.$reformulator_settings_for_wff_violation_resolution$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-WFF-VIOLATION-RESOLUTION*", (SubLObject)reformulator_utilities.$list2);
        reformulator_utilities.$reformulator_settings_for_dates_reformulation$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-DATES-REFORMULATION*", (SubLObject)reformulator_utilities.$list3);
        reformulator_utilities.$reformulator_settings_for_exception_rules$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-EXCEPTION-RULES*", (SubLObject)reformulator_utilities.$list4);
        return (SubLObject)reformulator_utilities.NIL;
    }
    
    public static SubLObject setup_reformulator_utilities_file() {
        return (SubLObject)reformulator_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_utilities_file();
    }
    
    public void initializeVariables() {
        init_reformulator_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_utilities_file();
    }
    
    static {
        me = (SubLFile)new reformulator_utilities();
        reformulator_utilities.$reformulator_settings_for_query_processing$ = null;
        reformulator_utilities.$reformulator_settings_for_wff_violation_resolution$ = null;
        reformulator_utilities.$reformulator_settings_for_dates_reformulation$ = null;
        reformulator_utilities.$reformulator_settings_for_exception_rules$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryProcessingRLModule")));
        $kw1$RECURSION_LIMIT = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule")));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DatesReformulatorRLModule")));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Simplify"))));
    }
}

/*

	Total time: 75 ms
	
*/