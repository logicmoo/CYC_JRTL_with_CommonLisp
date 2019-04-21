package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_staleness_test extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_staleness_test";
    public static final String myFingerPrint = "1c589a386c74a589c30dcf2f5957902d9e74e1f7db6629ebd691ec9395de5c68";
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 864L)
    private static SubLSymbol $gen_template_store_revisions$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1062L)
    private static SubLSymbol $gen_template_store_staleness_acceptableP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1302L)
    private static SubLSymbol $gen_template_store_known_staleP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2238L)
    private static SubLSymbol $gen_template_store_revision_globals$;
    private static final SubLSymbol $sym0$_GEN_TEMPLATE_STORE_REVISIONS_;
    private static final SubLSymbol $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__;
    private static final SubLSymbol $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__;
    private static final SubLList $list3;
    private static final SubLString $str4$gen_template_store_not_present___;
    private static final SubLString $str5$gen_template_store_built_with_sta;
    private static final SubLSymbol $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_;
    private static final SubLString $str7$gen_template_store_built_with_sta;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1361L)
    public static SubLObject gen_template_store_known_stale_p() {
        return pph_staleness_test.$gen_template_store_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1459L)
    public static SubLObject declare_gen_template_store_known_stale() {
        pph_staleness_test.$gen_template_store_known_staleP$.setGlobalValue((SubLObject)pph_staleness_test.T);
        return pph_staleness_test.$gen_template_store_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1609L)
    public static SubLObject declare_gen_template_store_not_known_stale() {
        pph_staleness_test.$gen_template_store_known_staleP$.setGlobalValue((SubLObject)pph_staleness_test.NIL);
        return pph_staleness_test.$gen_template_store_known_staleP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1765L)
    public static SubLObject declare_gen_template_store_staleness_acceptable() {
        pph_staleness_test.$gen_template_store_staleness_acceptableP$.setGlobalValue((SubLObject)pph_staleness_test.T);
        return pph_staleness_test.$gen_template_store_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1942L)
    public static SubLObject declare_gen_template_store_staleness_unacceptable() {
        pph_staleness_test.$gen_template_store_staleness_acceptableP$.setGlobalValue((SubLObject)pph_staleness_test.NIL);
        return pph_staleness_test.$gen_template_store_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2123L)
    public static SubLObject gen_template_store_staleness_acceptableP() {
        return pph_staleness_test.$gen_template_store_staleness_acceptableP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2342L)
    public static SubLObject gen_template_store_staleP() {
        SubLObject staleP = (SubLObject)pph_staleness_test.NIL;
        if (pph_staleness_test.NIL != gen_template_store_known_stale_p()) {
            staleP = (SubLObject)pph_staleness_test.T;
        }
        else if (pph_staleness_test.NIL == pph_data_structures.gen_template_store_present_p()) {
            Errors.warn((SubLObject)pph_staleness_test.$str4$gen_template_store_not_present___);
            staleP = (SubLObject)pph_staleness_test.T;
        }
        else if (pph_staleness_test.NIL != gen_template_store_revisions_staleP()) {
            Errors.warn((SubLObject)pph_staleness_test.$str5$gen_template_store_built_with_sta);
            staleP = (SubLObject)pph_staleness_test.T;
        }
        if (pph_staleness_test.NIL != staleP) {
            declare_gen_template_store_known_stale();
        }
        else {
            declare_gen_template_store_not_known_stale();
        }
        return staleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3061L)
    public static SubLObject gen_template_store_revisions_staleP_internal() {
        SubLObject staleP = (SubLObject)pph_staleness_test.NIL;
        if (pph_staleness_test.NIL != pph_staleness_test.$gen_template_store_revisions$.getGlobalValue() && pph_staleness_test.NIL == staleP) {
            SubLObject csome_list_var;
            SubLObject global;
            for (csome_list_var = pph_staleness_test.$gen_template_store_revision_globals$.getGlobalValue(), global = (SubLObject)pph_staleness_test.NIL, global = csome_list_var.first(); pph_staleness_test.NIL == staleP && pph_staleness_test.NIL != csome_list_var; staleP = gen_template_store_revision_staleP(global, (SubLObject)pph_staleness_test.UNPROVIDED), csome_list_var = csome_list_var.rest(), global = csome_list_var.first()) {}
        }
        return staleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3061L)
    public static SubLObject gen_template_store_revisions_staleP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_staleness_test.NIL;
        if (pph_staleness_test.NIL == v_memoization_state) {
            return gen_template_store_revisions_staleP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_staleness_test.$sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, (SubLObject)pph_staleness_test.UNPROVIDED);
        if (pph_staleness_test.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_staleness_test.$sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, (SubLObject)pph_staleness_test.ZERO_INTEGER, (SubLObject)pph_staleness_test.NIL, (SubLObject)pph_staleness_test.EQ, (SubLObject)pph_staleness_test.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_staleness_test.$sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)pph_staleness_test.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gen_template_store_revisions_staleP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)pph_staleness_test.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3341L)
    public static SubLObject gen_template_store_unfinishedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_staleness_test.NIL == list_utilities.proper_list_p(pph_staleness_test.$gen_template_store_revisions$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3457L)
    public static SubLObject declare_gen_template_store_revisions_not_stale() {
        gen_template_store_note_revisions();
        return pph_staleness_test.$gen_template_store_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3795L)
    public static SubLObject gen_template_store_note_revisions() {
        gen_template_store_clear_revisions();
        SubLObject cdolist_list_var = pph_staleness_test.$gen_template_store_revision_globals$.getGlobalValue();
        SubLObject global = (SubLObject)pph_staleness_test.NIL;
        global = cdolist_list_var.first();
        while (pph_staleness_test.NIL != cdolist_list_var) {
            pph_staleness_test.$gen_template_store_revisions$.setGlobalValue(list_utilities.alist_enter(pph_staleness_test.$gen_template_store_revisions$.getGlobalValue(), global, Symbols.symbol_value(global), (SubLObject)pph_staleness_test.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        declare_gen_template_store_staleness_unacceptable();
        return pph_staleness_test.$gen_template_store_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 4164L)
    public static SubLObject gen_template_store_clear_revisions() {
        pph_staleness_test.$gen_template_store_revisions$.setGlobalValue((SubLObject)pph_staleness_test.NIL);
        return pph_staleness_test.$gen_template_store_revisions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 4305L)
    public static SubLObject gen_template_store_revision_staleP(final SubLObject global, SubLObject warnP) {
        if (warnP == pph_staleness_test.UNPROVIDED) {
            warnP = (SubLObject)pph_staleness_test.T;
        }
        final SubLObject recorded_value = list_utilities.alist_lookup(pph_staleness_test.$gen_template_store_revisions$.getGlobalValue(), global, (SubLObject)pph_staleness_test.UNPROVIDED, (SubLObject)pph_staleness_test.UNPROVIDED);
        final SubLObject current_value = Symbols.symbol_value(global);
        final SubLObject okP = Equality.equal(recorded_value, current_value);
        if (pph_staleness_test.NIL == okP && pph_staleness_test.NIL != warnP) {
            Errors.warn((SubLObject)pph_staleness_test.$str7$gen_template_store_built_with_sta, global);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_staleness_test.NIL == okP);
    }
    
    public static SubLObject declare_pph_staleness_test_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_known_stale_p", "GEN-TEMPLATE-STORE-KNOWN-STALE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "declare_gen_template_store_known_stale", "DECLARE-GEN-TEMPLATE-STORE-KNOWN-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "declare_gen_template_store_not_known_stale", "DECLARE-GEN-TEMPLATE-STORE-NOT-KNOWN-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "declare_gen_template_store_staleness_acceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "declare_gen_template_store_staleness_unacceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-UNACCEPTABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_staleness_acceptableP", "GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_staleP", "GEN-TEMPLATE-STORE-STALE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_revisions_staleP_internal", "GEN-TEMPLATE-STORE-REVISIONS-STALE?-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_revisions_staleP", "GEN-TEMPLATE-STORE-REVISIONS-STALE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_unfinishedP", "GEN-TEMPLATE-STORE-UNFINISHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "declare_gen_template_store_revisions_not_stale", "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_note_revisions", "GEN-TEMPLATE-STORE-NOTE-REVISIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_clear_revisions", "GEN-TEMPLATE-STORE-CLEAR-REVISIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_staleness_test", "gen_template_store_revision_staleP", "GEN-TEMPLATE-STORE-REVISION-STALE?", 1, 1, false);
        return (SubLObject)pph_staleness_test.NIL;
    }
    
    public static SubLObject init_pph_staleness_test_file() {
        pph_staleness_test.$gen_template_store_revisions$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE-REVISIONS*", (SubLObject)(maybeDefault((SubLObject)pph_staleness_test.$sym0$_GEN_TEMPLATE_STORE_REVISIONS_, pph_staleness_test.$gen_template_store_revisions$, pph_staleness_test.NIL)));
        pph_staleness_test.$gen_template_store_staleness_acceptableP$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*", (SubLObject)(maybeDefault((SubLObject)pph_staleness_test.$sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__, pph_staleness_test.$gen_template_store_staleness_acceptableP$, pph_staleness_test.NIL)));
        pph_staleness_test.$gen_template_store_known_staleP$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE-KNOWN-STALE?*", (SubLObject)(maybeDefault((SubLObject)pph_staleness_test.$sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__, pph_staleness_test.$gen_template_store_known_staleP$, pph_staleness_test.NIL)));
        pph_staleness_test.$gen_template_store_revision_globals$ = SubLFiles.deflexical("*GEN-TEMPLATE-STORE-REVISION-GLOBALS*", (SubLObject)pph_staleness_test.$list3);
        return (SubLObject)pph_staleness_test.NIL;
    }
    
    public static SubLObject setup_pph_staleness_test_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)pph_staleness_test.$sym0$_GEN_TEMPLATE_STORE_REVISIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_staleness_test.$sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_staleness_test.$sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__);
        memoization_state.note_memoized_function((SubLObject)pph_staleness_test.$sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_);
        return (SubLObject)pph_staleness_test.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_staleness_test_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_staleness_test_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_staleness_test_file();
    }
    
    static {
        me = (SubLFile)new pph_staleness_test();
        pph_staleness_test.$gen_template_store_revisions$ = null;
        pph_staleness_test.$gen_template_store_staleness_acceptableP$ = null;
        pph_staleness_test.$gen_template_store_known_staleP$ = null;
        pph_staleness_test.$gen_template_store_revision_globals$ = null;
        $sym0$_GEN_TEMPLATE_STORE_REVISIONS_ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-STORE-REVISIONS*");
        $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*");
        $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__ = SubLObjectFactory.makeSymbol("*GEN-TEMPLATE-STORE-KNOWN-STALE?*");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DATA-STRUCTURES-CODE-REVISION*"));
        $str4$gen_template_store_not_present___ = SubLObjectFactory.makeString("gen-template store not present.~%");
        $str5$gen_template_store_built_with_sta = SubLObjectFactory.makeString("gen-template store built with stale code~%");
        $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_ = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-REVISIONS-STALE?");
        $str7$gen_template_store_built_with_sta = SubLObjectFactory.makeString("gen-template store built with stale version of ~S~%");
    }
}

/*

	Total time: 30 ms
	
*/