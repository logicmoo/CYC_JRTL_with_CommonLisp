package com.cyc.cycjava.cycl.sksi.sks_indexing;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sks_indexing_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_indexing_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_indexing_utilities";

    public static final String myFingerPrint = "15e248e453784eed48c9fb7c6614ea8ef6b4db55fd21cac11ada076a9a0c5ce7";

    public static SubLObject sksi_query_forms_unifyP(final SubLObject query_form1, final SubLObject query_form2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unification_result = unification.unify(query_form1, query_form2, UNPROVIDED, UNPROVIDED);
        final SubLObject unification_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == unification_result) {
            return NIL;
        }
        if (NIL != bindings.unification_success_token_p(unification_result)) {
            return T;
        }
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = unification_result;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL != binding_binds_same_type_termsP(binding)) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject binding_binds_same_type_termsP(final SubLObject binding) {
        final SubLObject term1 = binding.first();
        final SubLObject term2 = binding.rest();
        if ((NIL != cycl_grammar.hl_variable_p(term1)) && (NIL != cycl_grammar.hl_variable_p(term2))) {
            return T;
        }
        if ((NIL != cycl_grammar.hl_variable_p(term1)) && (NIL == cycl_grammar.hl_variable_p(term2))) {
            return NIL;
        }
        if ((NIL == cycl_grammar.hl_variable_p(term1)) && (NIL != cycl_grammar.hl_variable_p(term2))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject declare_sksi_sks_indexing_utilities_file() {
        declareFunction(me, "sksi_query_forms_unifyP", "SKSI-QUERY-FORMS-UNIFY?", 2, 0, false);
        declareFunction(me, "binding_binds_same_type_termsP", "BINDING-BINDS-SAME-TYPE-TERMS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_indexing_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_sks_indexing_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_indexing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_indexing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_indexing_utilities_file();
    }

    
}

/**
 * Total time: 14 ms
 */
