package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class api_control_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.api_control_vars";
    public static final String myFingerPrint = "294321e27ae6cc914e4c97c4df92d3b8f092f50cd7eebb090f988202e437ea6a";
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 557L)
    public static SubLSymbol $cfasl_constant_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 801L)
    public static SubLSymbol $cfasl_constant_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1002L)
    public static SubLSymbol $cfasl_nart_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1159L)
    public static SubLSymbol $cfasl_nart_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1339L)
    public static SubLSymbol $cfasl_assertion_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1511L)
    public static SubLSymbol $cfasl_assertion_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1706L)
    public static SubLSymbol $cfasl_deduction_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 1878L)
    public static SubLSymbol $cfasl_deduction_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 2073L)
    public static SubLSymbol $cfasl_kb_hl_support_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 2250L)
    public static SubLSymbol $cfasl_kb_hl_support_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 2457L)
    public static SubLSymbol $cfasl_clause_struc_handle_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 2638L)
    public static SubLSymbol $cfasl_clause_struc_handle_lookup_func$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 2842L)
    public static SubLSymbol $the_cyclist$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 3048L)
    public static SubLSymbol $use_local_queueP$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 3090L)
    public static SubLSymbol $default_ke_purpose$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 3356L)
    public static SubLSymbol $ke_purpose$;
    @SubLTranslatedFile.SubL(source = "cycl/api-control-vars.lisp", position = 3566L)
    public static SubLSymbol $generate_readable_fi_results$;
    private static final SubLSymbol $sym0$_THE_CYCLIST_;
    private static final SubLSymbol $sym1$_USE_LOCAL_QUEUE__;
    private static final SubLSymbol $sym2$_KE_PURPOSE_;
    
    public static SubLObject declare_api_control_vars_file() {
        return (SubLObject)api_control_vars.NIL;
    }
    
    public static SubLObject init_api_control_vars_file() {
        api_control_vars.$cfasl_constant_handle_func$ = SubLFiles.defparameter("*CFASL-CONSTANT-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_constant_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_nart_handle_func$ = SubLFiles.defparameter("*CFASL-NART-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_nart_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-NART-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_assertion_handle_func$ = SubLFiles.defparameter("*CFASL-ASSERTION-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_assertion_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_deduction_handle_func$ = SubLFiles.defparameter("*CFASL-DEDUCTION-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_deduction_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_kb_hl_support_handle_func$ = SubLFiles.defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_clause_struc_handle_func$ = SubLFiles.defparameter("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$cfasl_clause_struc_handle_lookup_func$ = SubLFiles.defparameter("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$the_cyclist$ = SubLFiles.defvar("*THE-CYCLIST*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$use_local_queueP$ = SubLFiles.defparameter("*USE-LOCAL-QUEUE?*", (SubLObject)api_control_vars.T);
        api_control_vars.$default_ke_purpose$ = SubLFiles.defparameter("*DEFAULT-KE-PURPOSE*", (SubLObject)api_control_vars.NIL);
        api_control_vars.$ke_purpose$ = SubLFiles.defparameter("*KE-PURPOSE*", api_control_vars.$default_ke_purpose$.getDynamicValue());
        api_control_vars.$generate_readable_fi_results$ = SubLFiles.defparameter("*GENERATE-READABLE-FI-RESULTS*", (SubLObject)api_control_vars.T);
        return (SubLObject)api_control_vars.NIL;
    }
    
    public static SubLObject setup_api_control_vars_file() {
        utilities_macros.register_html_state_variable((SubLObject)api_control_vars.$sym0$_THE_CYCLIST_);
        utilities_macros.register_html_state_variable((SubLObject)api_control_vars.$sym1$_USE_LOCAL_QUEUE__);
        utilities_macros.register_html_state_variable((SubLObject)api_control_vars.$sym2$_KE_PURPOSE_);
        return (SubLObject)api_control_vars.NIL;
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
        me = (SubLFile)new api_control_vars();
        api_control_vars.$cfasl_constant_handle_func$ = null;
        api_control_vars.$cfasl_constant_handle_lookup_func$ = null;
        api_control_vars.$cfasl_nart_handle_func$ = null;
        api_control_vars.$cfasl_nart_handle_lookup_func$ = null;
        api_control_vars.$cfasl_assertion_handle_func$ = null;
        api_control_vars.$cfasl_assertion_handle_lookup_func$ = null;
        api_control_vars.$cfasl_deduction_handle_func$ = null;
        api_control_vars.$cfasl_deduction_handle_lookup_func$ = null;
        api_control_vars.$cfasl_kb_hl_support_handle_func$ = null;
        api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$ = null;
        api_control_vars.$cfasl_clause_struc_handle_func$ = null;
        api_control_vars.$cfasl_clause_struc_handle_lookup_func$ = null;
        api_control_vars.$the_cyclist$ = null;
        api_control_vars.$use_local_queueP$ = null;
        api_control_vars.$default_ke_purpose$ = null;
        api_control_vars.$ke_purpose$ = null;
        api_control_vars.$generate_readable_fi_results$ = null;
        $sym0$_THE_CYCLIST_ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $sym1$_USE_LOCAL_QUEUE__ = SubLObjectFactory.makeSymbol("*USE-LOCAL-QUEUE?*");
        $sym2$_KE_PURPOSE_ = SubLObjectFactory.makeSymbol("*KE-PURPOSE*");
    }
}

/*

	Total time: 29 ms
	
*/