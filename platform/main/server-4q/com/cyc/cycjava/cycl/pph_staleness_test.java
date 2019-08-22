package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_staleness_test extends SubLTranslatedFile {
    public static final SubLFile me = new pph_staleness_test();

    public static final String myName = "com.cyc.cycjava.cycl.pph_staleness_test";

    public static final String myFingerPrint = "1c589a386c74a589c30dcf2f5957902d9e74e1f7db6629ebd691ec9395de5c68";



    // deflexical
    /**
     * Non-NIL iff the cost of rebuilding the store in an end-user's image outweighs
     * the benefits. @note - Ignored during build process, when staleness is never
     * acceptable.
     */
    private static final SubLSymbol $gen_template_store_staleness_acceptableP$ = makeSymbol("*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*");

    // deflexical
    private static final SubLSymbol $gen_template_store_known_staleP$ = makeSymbol("*GEN-TEMPLATE-STORE-KNOWN-STALE?*");

    // deflexical
    private static final SubLSymbol $gen_template_store_revision_globals$ = makeSymbol("*GEN-TEMPLATE-STORE-REVISION-GLOBALS*");

    // Internal Constants
    public static final SubLSymbol $gen_template_store_revisions$ = makeSymbol("*GEN-TEMPLATE-STORE-REVISIONS*");

    public static final SubLSymbol $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__ = makeSymbol("*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*");

    public static final SubLSymbol $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__ = makeSymbol("*GEN-TEMPLATE-STORE-KNOWN-STALE?*");

    public static final SubLList $list3 = list(makeSymbol("*PPH-DATA-STRUCTURES-CODE-REVISION*"));

    public static final SubLString $str4$gen_template_store_not_present___ = makeString("gen-template store not present.~%");

    public static final SubLString $str5$gen_template_store_built_with_sta = makeString("gen-template store built with stale code~%");

    public static final SubLSymbol $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_ = makeSymbol("GEN-TEMPLATE-STORE-REVISIONS-STALE?");

    private static final SubLString $str7$gen_template_store_built_with_sta = makeString("gen-template store built with stale version of ~S~%");

    public static SubLObject gen_template_store_known_stale_p() {
        return $gen_template_store_known_staleP$.getGlobalValue();
    }

    public static SubLObject declare_gen_template_store_known_stale() {
        $gen_template_store_known_staleP$.setGlobalValue(T);
        return $gen_template_store_known_staleP$.getGlobalValue();
    }

    public static SubLObject declare_gen_template_store_not_known_stale() {
        $gen_template_store_known_staleP$.setGlobalValue(NIL);
        return $gen_template_store_known_staleP$.getGlobalValue();
    }

    public static SubLObject declare_gen_template_store_staleness_acceptable() {
        $gen_template_store_staleness_acceptableP$.setGlobalValue(T);
        return $gen_template_store_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject declare_gen_template_store_staleness_unacceptable() {
        $gen_template_store_staleness_acceptableP$.setGlobalValue(NIL);
        return $gen_template_store_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject gen_template_store_staleness_acceptableP() {
        return $gen_template_store_staleness_acceptableP$.getGlobalValue();
    }

    public static SubLObject gen_template_store_staleP() {
        SubLObject staleP = NIL;
        if (NIL != gen_template_store_known_stale_p()) {
            staleP = T;
        } else
            if (NIL == pph_data_structures.gen_template_store_present_p()) {
                Errors.warn($str4$gen_template_store_not_present___);
                staleP = T;
            } else
                if (NIL != gen_template_store_revisions_staleP()) {
                    Errors.warn($str5$gen_template_store_built_with_sta);
                    staleP = T;
                }


        if (NIL != staleP) {
            declare_gen_template_store_known_stale();
        } else {
            declare_gen_template_store_not_known_stale();
        }
        return staleP;
    }

    public static SubLObject gen_template_store_revisions_staleP_internal() {
        SubLObject staleP = NIL;
        if ((NIL != $gen_template_store_revisions$.getGlobalValue()) && (NIL == staleP)) {
            SubLObject csome_list_var;
            SubLObject global;
            for (csome_list_var = $gen_template_store_revision_globals$.getGlobalValue(), global = NIL, global = csome_list_var.first(); (NIL == staleP) && (NIL != csome_list_var); staleP = gen_template_store_revision_staleP(global, UNPROVIDED) , csome_list_var = csome_list_var.rest() , global = csome_list_var.first()) {
            }
        }
        return staleP;
    }

    public static SubLObject gen_template_store_revisions_staleP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gen_template_store_revisions_staleP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(gen_template_store_revisions_staleP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject gen_template_store_unfinishedP() {
        return makeBoolean(NIL == list_utilities.proper_list_p($gen_template_store_revisions$.getGlobalValue()));
    }

    public static SubLObject declare_gen_template_store_revisions_not_stale() {
        gen_template_store_note_revisions();
        return $gen_template_store_revisions$.getGlobalValue();
    }

    public static SubLObject gen_template_store_note_revisions() {
        gen_template_store_clear_revisions();
        SubLObject cdolist_list_var = $gen_template_store_revision_globals$.getGlobalValue();
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $gen_template_store_revisions$.setGlobalValue(list_utilities.alist_enter($gen_template_store_revisions$.getGlobalValue(), global, symbol_value(global), UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        declare_gen_template_store_staleness_unacceptable();
        return $gen_template_store_revisions$.getGlobalValue();
    }

    public static SubLObject gen_template_store_clear_revisions() {
        $gen_template_store_revisions$.setGlobalValue(NIL);
        return $gen_template_store_revisions$.getGlobalValue();
    }

    public static SubLObject gen_template_store_revision_staleP(final SubLObject global, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = T;
        }
        final SubLObject recorded_value = list_utilities.alist_lookup($gen_template_store_revisions$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
        final SubLObject current_value = symbol_value(global);
        final SubLObject okP = equal(recorded_value, current_value);
        if ((NIL == okP) && (NIL != warnP)) {
            Errors.warn($str7$gen_template_store_built_with_sta, global);
        }
        return makeBoolean(NIL == okP);
    }

    public static SubLObject declare_pph_staleness_test_file() {
        declareFunction(me, "gen_template_store_known_stale_p", "GEN-TEMPLATE-STORE-KNOWN-STALE-P", 0, 0, false);
        declareFunction(me, "declare_gen_template_store_known_stale", "DECLARE-GEN-TEMPLATE-STORE-KNOWN-STALE", 0, 0, false);
        declareFunction(me, "declare_gen_template_store_not_known_stale", "DECLARE-GEN-TEMPLATE-STORE-NOT-KNOWN-STALE", 0, 0, false);
        declareFunction(me, "declare_gen_template_store_staleness_acceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE", 0, 0, false);
        declareFunction(me, "declare_gen_template_store_staleness_unacceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-UNACCEPTABLE", 0, 0, false);
        declareFunction(me, "gen_template_store_staleness_acceptableP", "GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?", 0, 0, false);
        declareFunction(me, "gen_template_store_staleP", "GEN-TEMPLATE-STORE-STALE?", 0, 0, false);
        declareFunction(me, "gen_template_store_revisions_staleP_internal", "GEN-TEMPLATE-STORE-REVISIONS-STALE?-INTERNAL", 0, 0, false);
        declareFunction(me, "gen_template_store_revisions_staleP", "GEN-TEMPLATE-STORE-REVISIONS-STALE?", 0, 0, false);
        declareFunction(me, "gen_template_store_unfinishedP", "GEN-TEMPLATE-STORE-UNFINISHED?", 0, 0, false);
        declareFunction(me, "declare_gen_template_store_revisions_not_stale", "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE", 0, 0, false);
        declareFunction(me, "gen_template_store_note_revisions", "GEN-TEMPLATE-STORE-NOTE-REVISIONS", 0, 0, false);
        declareFunction(me, "gen_template_store_clear_revisions", "GEN-TEMPLATE-STORE-CLEAR-REVISIONS", 0, 0, false);
        declareFunction(me, "gen_template_store_revision_staleP", "GEN-TEMPLATE-STORE-REVISION-STALE?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_staleness_test_file() {
        deflexical("*GEN-TEMPLATE-STORE-REVISIONS*", SubLTrampolineFile.maybeDefault($gen_template_store_revisions$, $gen_template_store_revisions$, NIL));
        deflexical("*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*", SubLTrampolineFile.maybeDefault($sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__, $gen_template_store_staleness_acceptableP$, NIL));
        deflexical("*GEN-TEMPLATE-STORE-KNOWN-STALE?*", SubLTrampolineFile.maybeDefault($sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__, $gen_template_store_known_staleP$, NIL));
        deflexical("*GEN-TEMPLATE-STORE-REVISION-GLOBALS*", $list3);
        return NIL;
    }

    public static SubLObject setup_pph_staleness_test_file() {
        declare_defglobal($gen_template_store_revisions$);
        declare_defglobal($sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__);
        declare_defglobal($sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__);
        memoization_state.note_memoized_function($sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_);
        return NIL;
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

    
}

/**
 * Total time: 30 ms
 */
