package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class predicate_relevance_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.predicate_relevance_cache";
    public static final String myFingerPrint = "89d0662fa109b38b953416e6c48026a3456c7f66028f42604da3b1265d2563aa";
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2247L)
    private static SubLSymbol $pred_relevance_cache_size$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2312L)
    private static SubLSymbol $spec_pred_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2407L)
    private static SubLSymbol $spec_inverse_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2501L)
    private static SubLSymbol $genl_pred_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2595L)
    private static SubLSymbol $genl_inverse_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2689L)
    private static SubLSymbol $spec_pred_naut_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2784L)
    private static SubLSymbol $spec_inverse_naut_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2878L)
    private static SubLSymbol $genl_pred_naut_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2972L)
    private static SubLSymbol $genl_inverse_naut_cache$;
    private static final SubLInteger $int0$128;
    private static final SubLSymbol $sym1$_SPEC_PRED_FORT_CACHE_;
    private static final SubLSymbol $sym2$_SPEC_INVERSE_FORT_CACHE_;
    private static final SubLSymbol $sym3$_GENL_PRED_FORT_CACHE_;
    private static final SubLSymbol $sym4$_GENL_INVERSE_FORT_CACHE_;
    private static final SubLSymbol $sym5$_SPEC_PRED_NAUT_CACHE_;
    private static final SubLSymbol $sym6$_SPEC_INVERSE_NAUT_CACHE_;
    private static final SubLSymbol $sym7$_GENL_PRED_NAUT_CACHE_;
    private static final SubLSymbol $sym8$_GENL_INVERSE_NAUT_CACHE_;
    private static final SubLSymbol $sym9$ALL_SPEC_PREDICATES;
    private static final SubLSymbol $sym10$ALL_SPEC_INVERSES;
    private static final SubLSymbol $sym11$ALL_GENL_PREDICATES;
    private static final SubLSymbol $sym12$ALL_GENL_INVERSES;
    private static final SubLSymbol $sym13$SPEC_PREDICATE_;
    private static final SubLSymbol $sym14$SPEC_INVERSE_;
    private static final SubLSymbol $sym15$GENL_PREDICATE_;
    private static final SubLSymbol $sym16$GENL_INVERSE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 971L)
    public static SubLObject cached_spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == predicate_relevance_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (predicate_relevance_cache.NIL != forts.fort_p(genl) && predicate_relevance_cache.NIL != forts.fort_p(spec)) ? fort_cache_spec_predP(genl, spec, mt) : naut_cache_spec_predP(genl, spec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1293L)
    public static SubLObject cached_spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == predicate_relevance_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (predicate_relevance_cache.NIL != forts.fort_p(genl) && predicate_relevance_cache.NIL != forts.fort_p(spec)) ? fort_cache_spec_inverseP(genl, spec, mt) : naut_cache_spec_inverseP(genl, spec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1506L)
    public static SubLObject cached_genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == predicate_relevance_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (predicate_relevance_cache.NIL != forts.fort_p(spec) && predicate_relevance_cache.NIL != forts.fort_p(genl)) ? fort_cache_genl_predP(spec, genl, mt) : naut_cache_genl_predP(spec, genl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1710L)
    public static SubLObject cached_genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == predicate_relevance_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (predicate_relevance_cache.NIL != forts.fort_p(genl) && predicate_relevance_cache.NIL != forts.fort_p(spec)) ? fort_cache_genl_inverseP(spec, genl, mt) : naut_cache_genl_inverseP(spec, genl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1923L)
    public static SubLObject clear_predicate_relevance_cache() {
        clear_spec_pred_fort_cache();
        clear_spec_pred_naut_cache();
        clear_spec_inverse_fort_cache();
        clear_spec_inverse_naut_cache();
        clear_genl_pred_fort_cache();
        clear_genl_pred_naut_cache();
        clear_genl_inverse_fort_cache();
        clear_genl_inverse_naut_cache();
        return (SubLObject)predicate_relevance_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 3066L)
    public static SubLObject fort_cache_relevant_predP(final SubLObject v_cache, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt, final SubLObject update_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (SubLObject)ConsesLow.list(key_pred, mt);
        thread.resetMultipleValues();
        SubLObject relevant_predicates = cache.cache_get(v_cache, key);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (predicate_relevance_cache.NIL == entryP) {
            relevant_predicates = update_relevant_pred_fort_cache(update_function, key_pred, mt);
            cache.cache_set(v_cache, key, relevant_predicates);
        }
        return set_contents.set_contents_memberP(relevant_pred, relevant_predicates, Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 3529L)
    public static SubLObject update_relevant_pred_fort_cache(final SubLObject update_function, final SubLObject pred, final SubLObject mt) {
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym9$ALL_SPEC_PREDICATES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_predicates(pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL), (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym10$ALL_SPEC_INVERSES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_inverses(pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL), (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym11$ALL_GENL_PREDICATES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_predicates(pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL), (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym12$ALL_GENL_INVERSES)) {
            return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_inverses(pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL), (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        return set_utilities.construct_set_contents_from_list(Functions.funcall(update_function, pred, mt), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQL), (SubLObject)predicate_relevance_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 4157L)
    public static SubLObject naut_cache_relevant_predP(final SubLObject v_cache, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt, final SubLObject update_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (SubLObject)ConsesLow.list(key_pred, relevant_pred, mt);
        thread.resetMultipleValues();
        SubLObject relevant_predP = cache.cache_get(v_cache, key);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (predicate_relevance_cache.NIL == entryP) {
            relevant_predP = update_relevant_pred_naut_cache(update_function, key_pred, relevant_pred, mt);
            cache.cache_set(v_cache, key, relevant_predP);
        }
        return relevant_predP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 4563L)
    public static SubLObject update_relevant_pred_naut_cache(final SubLObject update_function, final SubLObject key_pred, final SubLObject relevant_pred, final SubLObject mt) {
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym13$SPEC_PREDICATE_)) {
            return genl_predicates.spec_predicateP(key_pred, relevant_pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym14$SPEC_INVERSE_)) {
            return genl_predicates.spec_inverseP(key_pred, relevant_pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym15$GENL_PREDICATE_)) {
            return genl_predicates.genl_predicateP(key_pred, relevant_pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        if (update_function.eql((SubLObject)predicate_relevance_cache.$sym16$GENL_INVERSE_)) {
            return genl_predicates.genl_inverseP(key_pred, relevant_pred, mt, (SubLObject)predicate_relevance_cache.UNPROVIDED);
        }
        return Functions.funcall(update_function, key_pred, relevant_pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5052L)
    public static SubLObject fort_cache_spec_predP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return fort_cache_relevant_predP(predicate_relevance_cache.$spec_pred_fort_cache$.getGlobalValue(), genl, spec, mt, (SubLObject)predicate_relevance_cache.$sym9$ALL_SPEC_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5214L)
    public static SubLObject naut_cache_spec_predP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return naut_cache_relevant_predP(predicate_relevance_cache.$spec_pred_naut_cache$.getGlobalValue(), genl, spec, mt, (SubLObject)predicate_relevance_cache.$sym13$SPEC_PREDICATE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5358L)
    public static SubLObject clear_spec_pred_fort_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_pred_fort_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5451L)
    public static SubLObject clear_spec_pred_naut_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_pred_naut_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5544L)
    public static SubLObject fort_cache_spec_inverseP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return fort_cache_relevant_predP(predicate_relevance_cache.$spec_inverse_fort_cache$.getGlobalValue(), genl, spec, mt, (SubLObject)predicate_relevance_cache.$sym10$ALL_SPEC_INVERSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5712L)
    public static SubLObject naut_cache_spec_inverseP(final SubLObject genl, final SubLObject spec, final SubLObject mt) {
        return naut_cache_relevant_predP(predicate_relevance_cache.$spec_inverse_naut_cache$.getGlobalValue(), genl, spec, mt, (SubLObject)predicate_relevance_cache.$sym14$SPEC_INVERSE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5860L)
    public static SubLObject clear_spec_inverse_fort_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_inverse_fort_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5959L)
    public static SubLObject clear_spec_inverse_naut_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_inverse_naut_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6058L)
    public static SubLObject fort_cache_genl_predP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return fort_cache_relevant_predP(predicate_relevance_cache.$genl_pred_fort_cache$.getGlobalValue(), spec, genl, mt, (SubLObject)predicate_relevance_cache.$sym11$ALL_GENL_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6220L)
    public static SubLObject naut_cache_genl_predP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return naut_cache_relevant_predP(predicate_relevance_cache.$genl_pred_naut_cache$.getGlobalValue(), spec, genl, mt, (SubLObject)predicate_relevance_cache.$sym15$GENL_PREDICATE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6364L)
    public static SubLObject clear_genl_pred_fort_cache() {
        return cache.cache_clear(predicate_relevance_cache.$genl_pred_fort_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6457L)
    public static SubLObject clear_genl_pred_naut_cache() {
        return cache.cache_clear(predicate_relevance_cache.$genl_pred_naut_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6550L)
    public static SubLObject fort_cache_genl_inverseP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return fort_cache_relevant_predP(predicate_relevance_cache.$genl_inverse_fort_cache$.getGlobalValue(), spec, genl, mt, (SubLObject)predicate_relevance_cache.$sym12$ALL_GENL_INVERSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6718L)
    public static SubLObject naut_cache_genl_inverseP(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return naut_cache_relevant_predP(predicate_relevance_cache.$genl_inverse_naut_cache$.getGlobalValue(), spec, genl, mt, (SubLObject)predicate_relevance_cache.$sym16$GENL_INVERSE_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6866L)
    public static SubLObject clear_genl_inverse_fort_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_inverse_fort_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6965L)
    public static SubLObject clear_genl_inverse_naut_cache() {
        return cache.cache_clear(predicate_relevance_cache.$spec_inverse_naut_cache$.getGlobalValue());
    }
    
    public static SubLObject declare_predicate_relevance_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "cached_spec_predP", "CACHED-SPEC-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "cached_spec_inverseP", "CACHED-SPEC-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "cached_genl_predP", "CACHED-GENL-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "cached_genl_inverseP", "CACHED-GENL-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_predicate_relevance_cache", "CLEAR-PREDICATE-RELEVANCE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "fort_cache_relevant_predP", "FORT-CACHE-RELEVANT-PRED?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "update_relevant_pred_fort_cache", "UPDATE-RELEVANT-PRED-FORT-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "naut_cache_relevant_predP", "NAUT-CACHE-RELEVANT-PRED?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "update_relevant_pred_naut_cache", "UPDATE-RELEVANT-PRED-NAUT-CACHE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "fort_cache_spec_predP", "FORT-CACHE-SPEC-PRED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "naut_cache_spec_predP", "NAUT-CACHE-SPEC-PRED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_spec_pred_fort_cache", "CLEAR-SPEC-PRED-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_spec_pred_naut_cache", "CLEAR-SPEC-PRED-NAUT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "fort_cache_spec_inverseP", "FORT-CACHE-SPEC-INVERSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "naut_cache_spec_inverseP", "NAUT-CACHE-SPEC-INVERSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_spec_inverse_fort_cache", "CLEAR-SPEC-INVERSE-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_spec_inverse_naut_cache", "CLEAR-SPEC-INVERSE-NAUT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "fort_cache_genl_predP", "FORT-CACHE-GENL-PRED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "naut_cache_genl_predP", "NAUT-CACHE-GENL-PRED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_genl_pred_fort_cache", "CLEAR-GENL-PRED-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_genl_pred_naut_cache", "CLEAR-GENL-PRED-NAUT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "fort_cache_genl_inverseP", "FORT-CACHE-GENL-INVERSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "naut_cache_genl_inverseP", "NAUT-CACHE-GENL-INVERSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_genl_inverse_fort_cache", "CLEAR-GENL-INVERSE-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_relevance_cache", "clear_genl_inverse_naut_cache", "CLEAR-GENL-INVERSE-NAUT-CACHE", 0, 0, false);
        return (SubLObject)predicate_relevance_cache.NIL;
    }
    
    public static SubLObject init_predicate_relevance_cache_file() {
        predicate_relevance_cache.$pred_relevance_cache_size$ = SubLFiles.deflexical("*PRED-RELEVANCE-CACHE-SIZE*", (SubLObject)predicate_relevance_cache.$int0$128);
        predicate_relevance_cache.$spec_pred_fort_cache$ = SubLFiles.deflexical("*SPEC-PRED-FORT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym1$_SPEC_PRED_FORT_CACHE_, predicate_relevance_cache.$spec_pred_fort_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$spec_inverse_fort_cache$ = SubLFiles.deflexical("*SPEC-INVERSE-FORT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym2$_SPEC_INVERSE_FORT_CACHE_, predicate_relevance_cache.$spec_inverse_fort_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$genl_pred_fort_cache$ = SubLFiles.deflexical("*GENL-PRED-FORT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym3$_GENL_PRED_FORT_CACHE_, predicate_relevance_cache.$genl_pred_fort_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$genl_inverse_fort_cache$ = SubLFiles.deflexical("*GENL-INVERSE-FORT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym4$_GENL_INVERSE_FORT_CACHE_, predicate_relevance_cache.$genl_inverse_fort_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$spec_pred_naut_cache$ = SubLFiles.deflexical("*SPEC-PRED-NAUT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym5$_SPEC_PRED_NAUT_CACHE_, predicate_relevance_cache.$spec_pred_naut_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$spec_inverse_naut_cache$ = SubLFiles.deflexical("*SPEC-INVERSE-NAUT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym6$_SPEC_INVERSE_NAUT_CACHE_, predicate_relevance_cache.$spec_inverse_naut_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$genl_pred_naut_cache$ = SubLFiles.deflexical("*GENL-PRED-NAUT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym7$_GENL_PRED_NAUT_CACHE_, predicate_relevance_cache.$genl_pred_naut_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        predicate_relevance_cache.$genl_inverse_naut_cache$ = SubLFiles.deflexical("*GENL-INVERSE-NAUT-CACHE*", maybeDefault((SubLObject)predicate_relevance_cache.$sym8$_GENL_INVERSE_NAUT_CACHE_, predicate_relevance_cache.$genl_inverse_naut_cache$, ()->(cache.new_cache(predicate_relevance_cache.$pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_relevance_cache.EQUAL)))));
        return (SubLObject)predicate_relevance_cache.NIL;
    }
    
    public static SubLObject setup_predicate_relevance_cache_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym1$_SPEC_PRED_FORT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym2$_SPEC_INVERSE_FORT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym3$_GENL_PRED_FORT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym4$_GENL_INVERSE_FORT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym5$_SPEC_PRED_NAUT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym6$_SPEC_INVERSE_NAUT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym7$_GENL_PRED_NAUT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_relevance_cache.$sym8$_GENL_INVERSE_NAUT_CACHE_);
        return (SubLObject)predicate_relevance_cache.NIL;
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
    
    static {
        me = (SubLFile)new predicate_relevance_cache();
        predicate_relevance_cache.$pred_relevance_cache_size$ = null;
        predicate_relevance_cache.$spec_pred_fort_cache$ = null;
        predicate_relevance_cache.$spec_inverse_fort_cache$ = null;
        predicate_relevance_cache.$genl_pred_fort_cache$ = null;
        predicate_relevance_cache.$genl_inverse_fort_cache$ = null;
        predicate_relevance_cache.$spec_pred_naut_cache$ = null;
        predicate_relevance_cache.$spec_inverse_naut_cache$ = null;
        predicate_relevance_cache.$genl_pred_naut_cache$ = null;
        predicate_relevance_cache.$genl_inverse_naut_cache$ = null;
        $int0$128 = SubLObjectFactory.makeInteger(128);
        $sym1$_SPEC_PRED_FORT_CACHE_ = SubLObjectFactory.makeSymbol("*SPEC-PRED-FORT-CACHE*");
        $sym2$_SPEC_INVERSE_FORT_CACHE_ = SubLObjectFactory.makeSymbol("*SPEC-INVERSE-FORT-CACHE*");
        $sym3$_GENL_PRED_FORT_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-PRED-FORT-CACHE*");
        $sym4$_GENL_INVERSE_FORT_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-FORT-CACHE*");
        $sym5$_SPEC_PRED_NAUT_CACHE_ = SubLObjectFactory.makeSymbol("*SPEC-PRED-NAUT-CACHE*");
        $sym6$_SPEC_INVERSE_NAUT_CACHE_ = SubLObjectFactory.makeSymbol("*SPEC-INVERSE-NAUT-CACHE*");
        $sym7$_GENL_PRED_NAUT_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-PRED-NAUT-CACHE*");
        $sym8$_GENL_INVERSE_NAUT_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-NAUT-CACHE*");
        $sym9$ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDICATES");
        $sym10$ALL_SPEC_INVERSES = SubLObjectFactory.makeSymbol("ALL-SPEC-INVERSES");
        $sym11$ALL_GENL_PREDICATES = SubLObjectFactory.makeSymbol("ALL-GENL-PREDICATES");
        $sym12$ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("ALL-GENL-INVERSES");
        $sym13$SPEC_PREDICATE_ = SubLObjectFactory.makeSymbol("SPEC-PREDICATE?");
        $sym14$SPEC_INVERSE_ = SubLObjectFactory.makeSymbol("SPEC-INVERSE?");
        $sym15$GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("GENL-PREDICATE?");
        $sym16$GENL_INVERSE_ = SubLObjectFactory.makeSymbol("GENL-INVERSE?");
    }
}

/*

	Total time: 120 ms
	
*/