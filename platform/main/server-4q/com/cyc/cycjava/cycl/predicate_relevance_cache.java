package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class predicate_relevance_cache extends SubLTranslatedFile {
    public static final SubLFile me = new predicate_relevance_cache();

    public static final String myName = "com.cyc.cycjava.cycl.predicate_relevance_cache";

    public static final String myFingerPrint = "89d0662fa109b38b953416e6c48026a3456c7f66028f42604da3b1265d2563aa";

    // deflexical
    private static final SubLSymbol $pred_relevance_cache_size$ = makeSymbol("*PRED-RELEVANCE-CACHE-SIZE*");

















    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLSymbol $spec_pred_fort_cache$ = makeSymbol("*SPEC-PRED-FORT-CACHE*");

    public static final SubLSymbol $spec_inverse_fort_cache$ = makeSymbol("*SPEC-INVERSE-FORT-CACHE*");

    public static final SubLSymbol $genl_pred_fort_cache$ = makeSymbol("*GENL-PRED-FORT-CACHE*");

    public static final SubLSymbol $genl_inverse_fort_cache$ = makeSymbol("*GENL-INVERSE-FORT-CACHE*");

    public static final SubLSymbol $spec_pred_naut_cache$ = makeSymbol("*SPEC-PRED-NAUT-CACHE*");

    public static final SubLSymbol $spec_inverse_naut_cache$ = makeSymbol("*SPEC-INVERSE-NAUT-CACHE*");

    public static final SubLSymbol $genl_pred_naut_cache$ = makeSymbol("*GENL-PRED-NAUT-CACHE*");

    public static final SubLSymbol $genl_inverse_naut_cache$ = makeSymbol("*GENL-INVERSE-NAUT-CACHE*");

    public static final SubLSymbol ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");

    public static final SubLSymbol ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");

    public static final SubLSymbol ALL_GENL_PREDICATES = makeSymbol("ALL-GENL-PREDICATES");

    public static final SubLSymbol ALL_GENL_INVERSES = makeSymbol("ALL-GENL-INVERSES");

    public static final SubLSymbol $sym13$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

    public static final SubLSymbol $sym14$SPEC_INVERSE_ = makeSymbol("SPEC-INVERSE?");

    public static final SubLSymbol $sym15$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

    public static final SubLSymbol $sym16$GENL_INVERSE_ = makeSymbol("GENL-INVERSE?");

    public static SubLObject cached_spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (NIL != forts.fort_p(genl)) && (NIL != forts.fort_p(spec)) ? fort_cache_spec_predP(genl, spec, mt) : naut_cache_spec_predP(genl, spec, mt);
    }

    public static SubLObject cached_spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (NIL != forts.fort_p(genl)) && (NIL != forts.fort_p(spec)) ? fort_cache_spec_inverseP(genl, spec, mt) : naut_cache_spec_inverseP(genl, spec, mt);
    }

    public static SubLObject cached_genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (NIL != forts.fort_p(spec)) && (NIL != forts.fort_p(genl)) ? fort_cache_genl_predP(spec, genl, mt) : naut_cache_genl_predP(spec, genl, mt);
    }

    public static SubLObject cached_genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (NIL != forts.fort_p(genl)) && (NIL != forts.fort_p(spec)) ? fort_cache_genl_inverseP(spec, genl, mt) : naut_cache_genl_inverseP(spec, genl, mt);
    }

    public static SubLObject clear_predicate_relevance_cache() {
        clear_spec_pred_fort_cache();
        clear_spec_pred_naut_cache();
        clear_spec_inverse_fort_cache();
        clear_spec_inverse_naut_cache();
        clear_genl_pred_fort_cache();
        clear_genl_pred_naut_cache();
        clear_genl_inverse_fort_cache();
        clear_genl_inverse_naut_cache();
        return NIL;
    }

    public static SubLObject fort_cache_relevant_predP(final SubLObject v_cache, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt, final SubLObject update_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = list(key_pred, mt);
        thread.resetMultipleValues();
        SubLObject relevant_predicates = cache.cache_get(v_cache, key);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == entryP) {
            relevant_predicates = update_relevant_pred_fort_cache(update_function, key_pred, mt);
            cache.cache_set(v_cache, key, relevant_predicates);
        }
        return set_contents.set_contents_memberP(relevant_pred, relevant_predicates, symbol_function(EQL));
    }

    public static SubLObject update_relevant_pred_fort_cache(final SubLObject update_function, final SubLObject pred, final SubLObject mt) {
        if (update_function.eql(ALL_SPEC_PREDICATES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_predicates(pred, mt, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
        }
        if (update_function.eql(ALL_SPEC_INVERSES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_inverses(pred, mt, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
        }
        if (update_function.eql(ALL_GENL_PREDICATES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_predicates(pred, mt, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
        }
        if (update_function.eql(ALL_GENL_INVERSES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_inverses(pred, mt, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
        }
        return set_utilities.construct_set_contents_from_list(funcall(update_function, pred, mt), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject naut_cache_relevant_predP(final SubLObject v_cache, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt, final SubLObject update_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = list(key_pred, relevant_pred, mt);
        thread.resetMultipleValues();
        SubLObject relevant_predP = cache.cache_get(v_cache, key);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == entryP) {
            relevant_predP = update_relevant_pred_naut_cache(update_function, key_pred, relevant_pred, mt);
            cache.cache_set(v_cache, key, relevant_predP);
        }
        return relevant_predP;
    }

    public static SubLObject update_relevant_pred_naut_cache(final SubLObject update_function, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt) {
        if (update_function.eql($sym13$SPEC_PREDICATE_)) {
            return genl_predicates.spec_predicateP(key_pred, relevant_pred, mt, UNPROVIDED);
        }
        if (update_function.eql($sym14$SPEC_INVERSE_)) {
            return genl_predicates.spec_inverseP(key_pred, relevant_pred, mt, UNPROVIDED);
        }
        if (update_function.eql($sym15$GENL_PREDICATE_)) {
            return genl_predicates.genl_predicateP(key_pred, relevant_pred, mt, UNPROVIDED);
        }
        if (update_function.eql($sym16$GENL_INVERSE_)) {
            return genl_predicates.genl_inverseP(key_pred, relevant_pred, mt, UNPROVIDED);
        }
        return funcall(update_function, key_pred, relevant_pred, mt);
    }

    public static SubLObject fort_cache_spec_predP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return fort_cache_relevant_predP($spec_pred_fort_cache$.getGlobalValue(), genl, spec, mt, ALL_SPEC_PREDICATES);
    }

    public static SubLObject naut_cache_spec_predP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return naut_cache_relevant_predP($spec_pred_naut_cache$.getGlobalValue(), genl, spec, mt, $sym13$SPEC_PREDICATE_);
    }

    public static SubLObject clear_spec_pred_fort_cache() {
        return cache.cache_clear($spec_pred_fort_cache$.getGlobalValue());
    }

    public static SubLObject clear_spec_pred_naut_cache() {
        return cache.cache_clear($spec_pred_naut_cache$.getGlobalValue());
    }

    public static SubLObject fort_cache_spec_inverseP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return fort_cache_relevant_predP($spec_inverse_fort_cache$.getGlobalValue(), genl, spec, mt, ALL_SPEC_INVERSES);
    }

    public static SubLObject naut_cache_spec_inverseP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return naut_cache_relevant_predP($spec_inverse_naut_cache$.getGlobalValue(), genl, spec, mt, $sym14$SPEC_INVERSE_);
    }

    public static SubLObject clear_spec_inverse_fort_cache() {
        return cache.cache_clear($spec_inverse_fort_cache$.getGlobalValue());
    }

    public static SubLObject clear_spec_inverse_naut_cache() {
        return cache.cache_clear($spec_inverse_naut_cache$.getGlobalValue());
    }

    public static SubLObject fort_cache_genl_predP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return fort_cache_relevant_predP($genl_pred_fort_cache$.getGlobalValue(), spec, genl, mt, ALL_GENL_PREDICATES);
    }

    public static SubLObject naut_cache_genl_predP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return naut_cache_relevant_predP($genl_pred_naut_cache$.getGlobalValue(), spec, genl, mt, $sym15$GENL_PREDICATE_);
    }

    public static SubLObject clear_genl_pred_fort_cache() {
        return cache.cache_clear($genl_pred_fort_cache$.getGlobalValue());
    }

    public static SubLObject clear_genl_pred_naut_cache() {
        return cache.cache_clear($genl_pred_naut_cache$.getGlobalValue());
    }

    public static SubLObject fort_cache_genl_inverseP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return fort_cache_relevant_predP($genl_inverse_fort_cache$.getGlobalValue(), spec, genl, mt, ALL_GENL_INVERSES);
    }

    public static SubLObject naut_cache_genl_inverseP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return naut_cache_relevant_predP($genl_inverse_naut_cache$.getGlobalValue(), spec, genl, mt, $sym16$GENL_INVERSE_);
    }

    public static SubLObject clear_genl_inverse_fort_cache() {
        return cache.cache_clear($spec_inverse_fort_cache$.getGlobalValue());
    }

    public static SubLObject clear_genl_inverse_naut_cache() {
        return cache.cache_clear($spec_inverse_naut_cache$.getGlobalValue());
    }

    public static SubLObject declare_predicate_relevance_cache_file() {
        declareFunction(me, "cached_spec_predP", "CACHED-SPEC-PRED?", 2, 1, false);
        declareFunction(me, "cached_spec_inverseP", "CACHED-SPEC-INVERSE?", 2, 1, false);
        declareFunction(me, "cached_genl_predP", "CACHED-GENL-PRED?", 2, 1, false);
        declareFunction(me, "cached_genl_inverseP", "CACHED-GENL-INVERSE?", 2, 1, false);
        declareFunction(me, "clear_predicate_relevance_cache", "CLEAR-PREDICATE-RELEVANCE-CACHE", 0, 0, false);
        declareFunction(me, "fort_cache_relevant_predP", "FORT-CACHE-RELEVANT-PRED?", 5, 0, false);
        declareFunction(me, "update_relevant_pred_fort_cache", "UPDATE-RELEVANT-PRED-FORT-CACHE", 3, 0, false);
        declareFunction(me, "naut_cache_relevant_predP", "NAUT-CACHE-RELEVANT-PRED?", 5, 0, false);
        declareFunction(me, "update_relevant_pred_naut_cache", "UPDATE-RELEVANT-PRED-NAUT-CACHE", 4, 0, false);
        declareFunction(me, "fort_cache_spec_predP", "FORT-CACHE-SPEC-PRED?", 3, 0, false);
        declareFunction(me, "naut_cache_spec_predP", "NAUT-CACHE-SPEC-PRED?", 3, 0, false);
        declareFunction(me, "clear_spec_pred_fort_cache", "CLEAR-SPEC-PRED-FORT-CACHE", 0, 0, false);
        declareFunction(me, "clear_spec_pred_naut_cache", "CLEAR-SPEC-PRED-NAUT-CACHE", 0, 0, false);
        declareFunction(me, "fort_cache_spec_inverseP", "FORT-CACHE-SPEC-INVERSE?", 3, 0, false);
        declareFunction(me, "naut_cache_spec_inverseP", "NAUT-CACHE-SPEC-INVERSE?", 3, 0, false);
        declareFunction(me, "clear_spec_inverse_fort_cache", "CLEAR-SPEC-INVERSE-FORT-CACHE", 0, 0, false);
        declareFunction(me, "clear_spec_inverse_naut_cache", "CLEAR-SPEC-INVERSE-NAUT-CACHE", 0, 0, false);
        declareFunction(me, "fort_cache_genl_predP", "FORT-CACHE-GENL-PRED?", 3, 0, false);
        declareFunction(me, "naut_cache_genl_predP", "NAUT-CACHE-GENL-PRED?", 3, 0, false);
        declareFunction(me, "clear_genl_pred_fort_cache", "CLEAR-GENL-PRED-FORT-CACHE", 0, 0, false);
        declareFunction(me, "clear_genl_pred_naut_cache", "CLEAR-GENL-PRED-NAUT-CACHE", 0, 0, false);
        declareFunction(me, "fort_cache_genl_inverseP", "FORT-CACHE-GENL-INVERSE?", 3, 0, false);
        declareFunction(me, "naut_cache_genl_inverseP", "NAUT-CACHE-GENL-INVERSE?", 3, 0, false);
        declareFunction(me, "clear_genl_inverse_fort_cache", "CLEAR-GENL-INVERSE-FORT-CACHE", 0, 0, false);
        declareFunction(me, "clear_genl_inverse_naut_cache", "CLEAR-GENL-INVERSE-NAUT-CACHE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_predicate_relevance_cache_file() {
        deflexical("*PRED-RELEVANCE-CACHE-SIZE*", $int$128);
        deflexical("*SPEC-PRED-FORT-CACHE*", SubLTrampolineFile.maybeDefault($spec_pred_fort_cache$, $spec_pred_fort_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*SPEC-INVERSE-FORT-CACHE*", SubLTrampolineFile.maybeDefault($spec_inverse_fort_cache$, $spec_inverse_fort_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*GENL-PRED-FORT-CACHE*", SubLTrampolineFile.maybeDefault($genl_pred_fort_cache$, $genl_pred_fort_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*GENL-INVERSE-FORT-CACHE*", SubLTrampolineFile.maybeDefault($genl_inverse_fort_cache$, $genl_inverse_fort_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*SPEC-PRED-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($spec_pred_naut_cache$, $spec_pred_naut_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*SPEC-INVERSE-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($spec_inverse_naut_cache$, $spec_inverse_naut_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*GENL-PRED-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($genl_pred_naut_cache$, $genl_pred_naut_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        deflexical("*GENL-INVERSE-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($genl_inverse_naut_cache$, $genl_inverse_naut_cache$, () -> cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), symbol_function(EQUAL))));
        return NIL;
    }

    public static SubLObject setup_predicate_relevance_cache_file() {
        declare_defglobal($spec_pred_fort_cache$);
        declare_defglobal($spec_inverse_fort_cache$);
        declare_defglobal($genl_pred_fort_cache$);
        declare_defglobal($genl_inverse_fort_cache$);
        declare_defglobal($spec_pred_naut_cache$);
        declare_defglobal($spec_inverse_naut_cache$);
        declare_defglobal($genl_pred_naut_cache$);
        declare_defglobal($genl_inverse_naut_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_predicate_relevance_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_predicate_relevance_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_predicate_relevance_cache_file();
    }

    
}

/**
 * Total time: 120 ms
 */
