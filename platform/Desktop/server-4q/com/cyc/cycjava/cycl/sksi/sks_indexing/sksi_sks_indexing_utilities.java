package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_indexing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_indexing_utilities";
    public static final String myFingerPrint = "15e248e453784eed48c9fb7c6614ea8ef6b4db55fd21cac11ada076a9a0c5ce7";
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-indexing-utilities.lisp", position = 860L)
    public static SubLObject sksi_query_forms_unifyP(final SubLObject query_form1, final SubLObject query_form2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unification_result = unification.unify(query_form1, query_form2, (SubLObject)sksi_sks_indexing_utilities.UNPROVIDED, (SubLObject)sksi_sks_indexing_utilities.UNPROVIDED);
        final SubLObject unification_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_sks_indexing_utilities.NIL == unification_result) {
            return (SubLObject)sksi_sks_indexing_utilities.NIL;
        }
        if (sksi_sks_indexing_utilities.NIL != bindings.unification_success_token_p(unification_result)) {
            return (SubLObject)sksi_sks_indexing_utilities.T;
        }
        SubLObject failP = (SubLObject)sksi_sks_indexing_utilities.NIL;
        if (sksi_sks_indexing_utilities.NIL == failP) {
            SubLObject csome_list_var = unification_result;
            SubLObject binding = (SubLObject)sksi_sks_indexing_utilities.NIL;
            binding = csome_list_var.first();
            while (sksi_sks_indexing_utilities.NIL == failP && sksi_sks_indexing_utilities.NIL != csome_list_var) {
                if (sksi_sks_indexing_utilities.NIL != binding_binds_same_type_termsP(binding)) {
                    failP = (SubLObject)sksi_sks_indexing_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_indexing_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-indexing-utilities.lisp", position = 1385L)
    public static SubLObject binding_binds_same_type_termsP(final SubLObject binding) {
        final SubLObject term1 = binding.first();
        final SubLObject term2 = binding.rest();
        if (sksi_sks_indexing_utilities.NIL != cycl_grammar.hl_variable_p(term1) && sksi_sks_indexing_utilities.NIL != cycl_grammar.hl_variable_p(term2)) {
            return (SubLObject)sksi_sks_indexing_utilities.T;
        }
        if (sksi_sks_indexing_utilities.NIL != cycl_grammar.hl_variable_p(term1) && sksi_sks_indexing_utilities.NIL == cycl_grammar.hl_variable_p(term2)) {
            return (SubLObject)sksi_sks_indexing_utilities.NIL;
        }
        if (sksi_sks_indexing_utilities.NIL == cycl_grammar.hl_variable_p(term1) && sksi_sks_indexing_utilities.NIL != cycl_grammar.hl_variable_p(term2)) {
            return (SubLObject)sksi_sks_indexing_utilities.NIL;
        }
        return (SubLObject)sksi_sks_indexing_utilities.T;
    }
    
    public static SubLObject declare_sksi_sks_indexing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_indexing_utilities", "sksi_query_forms_unifyP", "SKSI-QUERY-FORMS-UNIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_indexing_utilities", "binding_binds_same_type_termsP", "BINDING-BINDS-SAME-TYPE-TERMS?", 1, 0, false);
        return (SubLObject)sksi_sks_indexing_utilities.NIL;
    }
    
    public static SubLObject init_sksi_sks_indexing_utilities_file() {
        return (SubLObject)sksi_sks_indexing_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_sks_indexing_utilities_file() {
        return (SubLObject)sksi_sks_indexing_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_sks_indexing_utilities_file();
    }
    
    public void initializeVariables() {
        init_sksi_sks_indexing_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_sks_indexing_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_indexing_utilities();
    }
}

/*

	Total time: 14 ms
	
*/