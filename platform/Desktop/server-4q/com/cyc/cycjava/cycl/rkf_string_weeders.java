package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_string_weeders extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_string_weeders";
    public static final String myFingerPrint = "86b618f95ece3484f607488382730b1d8042a2fcaa79a1e8c979ee9b37a0e2d4";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1078L)
    private static SubLSymbol $rkf_preposition_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1268L)
    private static SubLSymbol $rkf_determiner_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1455L)
    private static SubLSymbol $rkf_verb_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1625L)
    private static SubLSymbol $rkf_adjective_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2060L)
    private static SubLSymbol $rkf_adverb_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2237L)
    private static SubLSymbol $rkf_noun_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2751L)
    private static SubLSymbol $rkf_conjunction_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3127L)
    private static SubLSymbol $rkf_pronoun_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3306L)
    private static SubLSymbol $rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3700L)
    private static SubLSymbol $rkf_number_stringP_caching_state$;
    private static final SubLSymbol $kw0$CLEARED;
    private static final SubLSymbol $sym1$RKF_PREPOSITION_STRING_;
    private static final SubLObject $const2$Preposition;
    private static final SubLSymbol $sym3$_RKF_PREPOSITION_STRING__CACHING_STATE_;
    private static final SubLInteger $int4$512;
    private static final SubLInteger $int5$256;
    private static final SubLSymbol $sym6$RKF_DETERMINER_STRING_;
    private static final SubLObject $const7$Determiner;
    private static final SubLSymbol $sym8$_RKF_DETERMINER_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym9$RKF_VERB_STRING_;
    private static final SubLObject $const10$Verb;
    private static final SubLSymbol $sym11$_RKF_VERB_STRING__CACHING_STATE_;
    private static final SubLInteger $int12$2048;
    private static final SubLInteger $int13$1024;
    private static final SubLSymbol $sym14$RKF_ADJECTIVE_STRING_;
    private static final SubLObject $const15$Adjective;
    private static final SubLObject $const16$gerund;
    private static final SubLObject $const17$perfect;
    private static final SubLSymbol $sym18$_RKF_ADJECTIVE_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym19$RKF_ADVERB_STRING_;
    private static final SubLObject $const20$Adverb;
    private static final SubLSymbol $sym21$_RKF_ADVERB_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym22$RKF_NOUN_STRING_;
    private static final SubLObject $const23$Noun;
    private static final SubLSymbol $sym24$_RKF_NOUN_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym25$RKF_CONJUNCTION_STRING_;
    private static final SubLString $str26$Conjunction;
    private static final SubLObject $const27$SubordinatingConjunction;
    private static final SubLObject $const28$CoordinatingConjunction;
    private static final SubLSymbol $sym29$_RKF_CONJUNCTION_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym30$RKF_PRONOUN_STRING_;
    private static final SubLObject $const31$Pronoun;
    private static final SubLSymbol $sym32$_RKF_PRONOUN_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym33$RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING_;
    private static final SubLObject $const34$WHPronoun;
    private static final SubLObject $const35$PossessivePronoun;
    private static final SubLSymbol $sym36$_RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym37$RKF_NUMBER_STRING_;
    private static final SubLObject $const38$Number_SP;
    private static final SubLSymbol $sym39$_RKF_NUMBER_STRING__CACHING_STATE_;
    private static final SubLSymbol $sym40$STRINGP;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 706L)
    public static SubLObject clear_all_rkf_stringP_caches() {
        lexicon_accessors.clear_agr_of_det_string();
        clear_rkf_preposition_stringP();
        clear_rkf_determiner_stringP();
        clear_rkf_verb_stringP();
        clear_rkf_adjective_stringP();
        clear_rkf_adverb_stringP();
        clear_rkf_noun_stringP();
        clear_rkf_conjunction_stringP();
        clear_rkf_pronoun_stringP();
        clear_rkf_number_stringP();
        return (SubLObject)rkf_string_weeders.$kw0$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1078L)
    public static SubLObject clear_rkf_preposition_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_preposition_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1078L)
    public static SubLObject remove_rkf_preposition_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_preposition_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1078L)
    public static SubLObject rkf_preposition_stringP_internal(final SubLObject string) {
        return lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const2$Preposition, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1078L)
    public static SubLObject rkf_preposition_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_preposition_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym1$RKF_PREPOSITION_STRING_, (SubLObject)rkf_string_weeders.$sym3$_RKF_PREPOSITION_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int4$512, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int5$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_preposition_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1268L)
    public static SubLObject clear_rkf_determiner_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_determiner_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1268L)
    public static SubLObject remove_rkf_determiner_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_determiner_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1268L)
    public static SubLObject rkf_determiner_stringP_internal(final SubLObject string) {
        return lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const7$Determiner, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1268L)
    public static SubLObject rkf_determiner_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_determiner_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym6$RKF_DETERMINER_STRING_, (SubLObject)rkf_string_weeders.$sym8$_RKF_DETERMINER_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int4$512, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int5$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_determiner_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1455L)
    public static SubLObject clear_rkf_verb_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_verb_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1455L)
    public static SubLObject remove_rkf_verb_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_verb_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1455L)
    public static SubLObject rkf_verb_stringP_internal(final SubLObject string) {
        return lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const10$Verb, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1455L)
    public static SubLObject rkf_verb_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_verb_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym9$RKF_VERB_STRING_, (SubLObject)rkf_string_weeders.$sym11$_RKF_VERB_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_verb_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1625L)
    public static SubLObject clear_rkf_adjective_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_adjective_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1625L)
    public static SubLObject remove_rkf_adjective_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_adjective_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1625L)
    public static SubLObject rkf_adjective_stringP_internal(final SubLObject string) {
        if (rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const15$Adjective, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED)) {
            return (SubLObject)rkf_string_weeders.T;
        }
        final SubLObject words = lexicon_cache.words_of_string(string, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
        SubLObject ans = (SubLObject)rkf_string_weeders.NIL;
        if (rkf_string_weeders.NIL == ans) {
            SubLObject csome_list_var = words;
            SubLObject word = (SubLObject)rkf_string_weeders.NIL;
            word = csome_list_var.first();
            while (rkf_string_weeders.NIL == ans && rkf_string_weeders.NIL != csome_list_var) {
                final SubLObject preds = lexicon_accessors.preds_of_stringXword(string, word, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
                if (rkf_string_weeders.NIL != subl_promotions.memberP(rkf_string_weeders.$const16$gerund, preds, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) || rkf_string_weeders.NIL != conses_high.member(rkf_string_weeders.$const17$perfect, preds, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED)) {
                    ans = (SubLObject)rkf_string_weeders.T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 1625L)
    public static SubLObject rkf_adjective_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_adjective_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym14$RKF_ADJECTIVE_STRING_, (SubLObject)rkf_string_weeders.$sym18$_RKF_ADJECTIVE_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_adjective_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2060L)
    public static SubLObject clear_rkf_adverb_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_adverb_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2060L)
    public static SubLObject remove_rkf_adverb_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_adverb_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2060L)
    public static SubLObject rkf_adverb_stringP_internal(final SubLObject string) {
        return lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const20$Adverb, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2060L)
    public static SubLObject rkf_adverb_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_adverb_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym19$RKF_ADVERB_STRING_, (SubLObject)rkf_string_weeders.$sym21$_RKF_ADVERB_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_adverb_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2237L)
    public static SubLObject clear_rkf_noun_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_noun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2237L)
    public static SubLObject remove_rkf_noun_stringP(final SubLObject string, SubLObject mt) {
        if (mt == rkf_string_weeders.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_noun_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string, mt), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2237L)
    public static SubLObject rkf_noun_stringP_internal(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const23$Noun, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED)) {
            return (SubLObject)rkf_string_weeders.T;
        }
        final SubLObject words = lexicon_cache.words_of_string(string, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
        SubLObject ans = (SubLObject)rkf_string_weeders.NIL;
        if (rkf_string_weeders.NIL == ans) {
            SubLObject csome_list_var = words;
            SubLObject word = (SubLObject)rkf_string_weeders.NIL;
            word = csome_list_var.first();
            while (rkf_string_weeders.NIL == ans && rkf_string_weeders.NIL != csome_list_var) {
                final SubLObject preds = lexicon_accessors.preds_of_stringXword(string, word, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
                if (rkf_string_weeders.NIL != subl_promotions.memberP(rkf_string_weeders.$const16$gerund, preds, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED)) {
                    ans = (SubLObject)rkf_string_weeders.T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            }
        }
        if (rkf_string_weeders.NIL == ans && rkf_string_weeders.NIL != lexicon_accessors.denots_of_name_string(string, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, (SubLObject)rkf_string_weeders.UNPROVIDED)) {
            ans = (SubLObject)rkf_string_weeders.T;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2237L)
    public static SubLObject rkf_noun_stringP(final SubLObject string, SubLObject mt) {
        if (mt == rkf_string_weeders.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = rkf_string_weeders.$rkf_noun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym22$RKF_NOUN_STRING_, (SubLObject)rkf_string_weeders.$sym24$_RKF_NOUN_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.TWO_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_string_weeders.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_string_weeders.NIL;
            collision = cdolist_list_var.first();
            while (rkf_string_weeders.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_string_weeders.NIL != cached_args && rkf_string_weeders.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_noun_stringP_internal(string, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2751L)
    public static SubLObject clear_rkf_conjunction_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_conjunction_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2751L)
    public static SubLObject remove_rkf_conjunction_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_conjunction_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2751L)
    public static SubLObject rkf_conjunction_stringP_internal(final SubLObject string) {
        if (rkf_string_weeders.NIL != constants_high.find_constant((SubLObject)rkf_string_weeders.$str26$Conjunction)) {
            return lexicon_accessors.string_is_posP(string, constants_high.find_constant((SubLObject)rkf_string_weeders.$str26$Conjunction), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const27$SubordinatingConjunction, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) || rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const28$CoordinatingConjunction, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 2751L)
    public static SubLObject rkf_conjunction_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_conjunction_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym25$RKF_CONJUNCTION_STRING_, (SubLObject)rkf_string_weeders.$sym29$_RKF_CONJUNCTION_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_conjunction_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3127L)
    public static SubLObject clear_rkf_pronoun_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_pronoun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3127L)
    public static SubLObject remove_rkf_pronoun_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_pronoun_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3127L)
    public static SubLObject rkf_pronoun_stringP_internal(final SubLObject string) {
        return lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const31$Pronoun, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3127L)
    public static SubLObject rkf_pronoun_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_pronoun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym30$RKF_PRONOUN_STRING_, (SubLObject)rkf_string_weeders.$sym32$_RKF_PRONOUN_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_pronoun_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3306L)
    public static SubLObject clear_rkf_unambiguous_non_possessive_pronoun_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3306L)
    public static SubLObject remove_rkf_unambiguous_non_possessive_pronoun_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3306L)
    public static SubLObject rkf_unambiguous_non_possessive_pronoun_stringP_internal(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const31$Pronoun, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) && rkf_string_weeders.NIL == lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const34$WHPronoun, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) && rkf_string_weeders.NIL == lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const35$PossessivePronoun, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) && rkf_string_weeders.NIL == lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const7$Determiner, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3306L)
    public static SubLObject rkf_unambiguous_non_possessive_pronoun_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym33$RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING_, (SubLObject)rkf_string_weeders.$sym36$_RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUAL, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_unambiguous_non_possessive_pronoun_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3700L)
    public static SubLObject clear_rkf_number_stringP() {
        final SubLObject cs = rkf_string_weeders.$rkf_number_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3700L)
    public static SubLObject remove_rkf_number_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_string_weeders.$rkf_number_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3700L)
    public static SubLObject rkf_number_stringP_internal(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_string_weeders.NIL != lexicon_accessors.string_is_posP(string, rkf_string_weeders.$const38$Number_SP, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED) || rkf_string_weeders.NIL != string_utilities.digit_stringP(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3700L)
    public static SubLObject rkf_number_stringP(final SubLObject string) {
        SubLObject caching_state = rkf_string_weeders.$rkf_number_stringP_caching_state$.getGlobalValue();
        if (rkf_string_weeders.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_string_weeders.$sym37$RKF_NUMBER_STRING_, (SubLObject)rkf_string_weeders.$sym39$_RKF_NUMBER_STRING__CACHING_STATE_, (SubLObject)rkf_string_weeders.$int12$2048, (SubLObject)rkf_string_weeders.EQUALP, (SubLObject)rkf_string_weeders.ONE_INTEGER, (SubLObject)rkf_string_weeders.$int13$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_number_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_string_weeders.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 3921L)
    public static SubLObject rkf_name_stringP(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(lexicon_accessors.denots_of_name_string(string, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, (SubLObject)rkf_string_weeders.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 4077L)
    public static SubLObject rkf_unknown_stringP(final SubLObject string, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_string_weeders.NIL == nl_trie.nl_trie_search(string, (SubLObject)rkf_string_weeders.UNPROVIDED, (SubLObject)rkf_string_weeders.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-string-weeders.lisp", position = 4240L)
    public static SubLObject rkf_string_starting_with_determiner(final SubLObject phrase) {
        assert rkf_string_weeders.NIL != Types.stringp(phrase) : phrase;
        final SubLObject first_token_of_string = rkf_concept_harvester.rkf_ch_string_tokenize(phrase).first();
        if (rkf_string_weeders.NIL != rkf_determiner_stringP(first_token_of_string)) {
            return first_token_of_string;
        }
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    public static SubLObject declare_rkf_string_weeders_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_all_rkf_stringP_caches", "CLEAR-ALL-RKF-STRING?-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_preposition_stringP", "CLEAR-RKF-PREPOSITION-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_preposition_stringP", "REMOVE-RKF-PREPOSITION-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_preposition_stringP_internal", "RKF-PREPOSITION-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_preposition_stringP", "RKF-PREPOSITION-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_determiner_stringP", "CLEAR-RKF-DETERMINER-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_determiner_stringP", "REMOVE-RKF-DETERMINER-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_determiner_stringP_internal", "RKF-DETERMINER-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_determiner_stringP", "RKF-DETERMINER-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_verb_stringP", "CLEAR-RKF-VERB-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_verb_stringP", "REMOVE-RKF-VERB-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_verb_stringP_internal", "RKF-VERB-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_verb_stringP", "RKF-VERB-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_adjective_stringP", "CLEAR-RKF-ADJECTIVE-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_adjective_stringP", "REMOVE-RKF-ADJECTIVE-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_adjective_stringP_internal", "RKF-ADJECTIVE-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_adjective_stringP", "RKF-ADJECTIVE-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_adverb_stringP", "CLEAR-RKF-ADVERB-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_adverb_stringP", "REMOVE-RKF-ADVERB-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_adverb_stringP_internal", "RKF-ADVERB-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_adverb_stringP", "RKF-ADVERB-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_noun_stringP", "CLEAR-RKF-NOUN-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_noun_stringP", "REMOVE-RKF-NOUN-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_noun_stringP_internal", "RKF-NOUN-STRING?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_noun_stringP", "RKF-NOUN-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_conjunction_stringP", "CLEAR-RKF-CONJUNCTION-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_conjunction_stringP", "REMOVE-RKF-CONJUNCTION-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_conjunction_stringP_internal", "RKF-CONJUNCTION-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_conjunction_stringP", "RKF-CONJUNCTION-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_pronoun_stringP", "CLEAR-RKF-PRONOUN-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_pronoun_stringP", "REMOVE-RKF-PRONOUN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_pronoun_stringP_internal", "RKF-PRONOUN-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_pronoun_stringP", "RKF-PRONOUN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_unambiguous_non_possessive_pronoun_stringP", "CLEAR-RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_unambiguous_non_possessive_pronoun_stringP", "REMOVE-RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_unambiguous_non_possessive_pronoun_stringP_internal", "RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_unambiguous_non_possessive_pronoun_stringP", "RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "clear_rkf_number_stringP", "CLEAR-RKF-NUMBER-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "remove_rkf_number_stringP", "REMOVE-RKF-NUMBER-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_number_stringP_internal", "RKF-NUMBER-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_number_stringP", "RKF-NUMBER-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_name_stringP", "RKF-NAME-STRING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_unknown_stringP", "RKF-UNKNOWN-STRING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_string_weeders", "rkf_string_starting_with_determiner", "RKF-STRING-STARTING-WITH-DETERMINER", 1, 0, false);
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    public static SubLObject init_rkf_string_weeders_file() {
        rkf_string_weeders.$rkf_preposition_stringP_caching_state$ = SubLFiles.deflexical("*RKF-PREPOSITION-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_determiner_stringP_caching_state$ = SubLFiles.deflexical("*RKF-DETERMINER-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_verb_stringP_caching_state$ = SubLFiles.deflexical("*RKF-VERB-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_adjective_stringP_caching_state$ = SubLFiles.deflexical("*RKF-ADJECTIVE-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_adverb_stringP_caching_state$ = SubLFiles.deflexical("*RKF-ADVERB-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_noun_stringP_caching_state$ = SubLFiles.deflexical("*RKF-NOUN-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_conjunction_stringP_caching_state$ = SubLFiles.deflexical("*RKF-CONJUNCTION-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_pronoun_stringP_caching_state$ = SubLFiles.deflexical("*RKF-PRONOUN-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$ = SubLFiles.deflexical("*RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        rkf_string_weeders.$rkf_number_stringP_caching_state$ = SubLFiles.deflexical("*RKF-NUMBER-STRING?-CACHING-STATE*", (SubLObject)rkf_string_weeders.NIL);
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    public static SubLObject setup_rkf_string_weeders_file() {
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym1$RKF_PREPOSITION_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym6$RKF_DETERMINER_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym9$RKF_VERB_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym14$RKF_ADJECTIVE_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym19$RKF_ADVERB_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym22$RKF_NOUN_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym25$RKF_CONJUNCTION_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym30$RKF_PRONOUN_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym33$RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING_);
        memoization_state.note_globally_cached_function((SubLObject)rkf_string_weeders.$sym37$RKF_NUMBER_STRING_);
        return (SubLObject)rkf_string_weeders.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_string_weeders_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_string_weeders_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_string_weeders_file();
    }
    
    static {
        me = (SubLFile)new rkf_string_weeders();
        rkf_string_weeders.$rkf_preposition_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_determiner_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_verb_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_adjective_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_adverb_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_noun_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_conjunction_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_pronoun_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_unambiguous_non_possessive_pronoun_stringP_caching_state$ = null;
        rkf_string_weeders.$rkf_number_stringP_caching_state$ = null;
        $kw0$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym1$RKF_PREPOSITION_STRING_ = SubLObjectFactory.makeSymbol("RKF-PREPOSITION-STRING?");
        $const2$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $sym3$_RKF_PREPOSITION_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-PREPOSITION-STRING?-CACHING-STATE*");
        $int4$512 = SubLObjectFactory.makeInteger(512);
        $int5$256 = SubLObjectFactory.makeInteger(256);
        $sym6$RKF_DETERMINER_STRING_ = SubLObjectFactory.makeSymbol("RKF-DETERMINER-STRING?");
        $const7$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $sym8$_RKF_DETERMINER_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-DETERMINER-STRING?-CACHING-STATE*");
        $sym9$RKF_VERB_STRING_ = SubLObjectFactory.makeSymbol("RKF-VERB-STRING?");
        $const10$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $sym11$_RKF_VERB_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-VERB-STRING?-CACHING-STATE*");
        $int12$2048 = SubLObjectFactory.makeInteger(2048);
        $int13$1024 = SubLObjectFactory.makeInteger(1024);
        $sym14$RKF_ADJECTIVE_STRING_ = SubLObjectFactory.makeSymbol("RKF-ADJECTIVE-STRING?");
        $const15$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $const16$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $const17$perfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"));
        $sym18$_RKF_ADJECTIVE_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-ADJECTIVE-STRING?-CACHING-STATE*");
        $sym19$RKF_ADVERB_STRING_ = SubLObjectFactory.makeSymbol("RKF-ADVERB-STRING?");
        $const20$Adverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $sym21$_RKF_ADVERB_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-ADVERB-STRING?-CACHING-STATE*");
        $sym22$RKF_NOUN_STRING_ = SubLObjectFactory.makeSymbol("RKF-NOUN-STRING?");
        $const23$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym24$_RKF_NOUN_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-NOUN-STRING?-CACHING-STATE*");
        $sym25$RKF_CONJUNCTION_STRING_ = SubLObjectFactory.makeSymbol("RKF-CONJUNCTION-STRING?");
        $str26$Conjunction = SubLObjectFactory.makeString("Conjunction");
        $const27$SubordinatingConjunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubordinatingConjunction"));
        $const28$CoordinatingConjunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoordinatingConjunction"));
        $sym29$_RKF_CONJUNCTION_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-CONJUNCTION-STRING?-CACHING-STATE*");
        $sym30$RKF_PRONOUN_STRING_ = SubLObjectFactory.makeSymbol("RKF-PRONOUN-STRING?");
        $const31$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $sym32$_RKF_PRONOUN_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-PRONOUN-STRING?-CACHING-STATE*");
        $sym33$RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING_ = SubLObjectFactory.makeSymbol("RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?");
        $const34$WHPronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHPronoun"));
        $const35$PossessivePronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePronoun"));
        $sym36$_RKF_UNAMBIGUOUS_NON_POSSESSIVE_PRONOUN_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?-CACHING-STATE*");
        $sym37$RKF_NUMBER_STRING_ = SubLObjectFactory.makeSymbol("RKF-NUMBER-STRING?");
        $const38$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $sym39$_RKF_NUMBER_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-NUMBER-STRING?-CACHING-STATE*");
        $sym40$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    }
}

/*

	Total time: 153 ms
	
*/