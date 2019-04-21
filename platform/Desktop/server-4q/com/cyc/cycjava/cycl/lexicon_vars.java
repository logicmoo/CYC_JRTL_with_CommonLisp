package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexicon_vars";
    public static final String myFingerPrint = "017c1cde5f5ffc02e7e176989998808cd5f873a7573f11c55dc75e74b8562600";
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 655L)
    public static SubLSymbol $psg_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 769L)
    public static SubLSymbol $print_while_building_hashP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 889L)
    public static SubLSymbol $nl_understanding_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 981L)
    public static SubLSymbol $nl_generation_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1069L)
    public static SubLSymbol $nl_relevance_purpose$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1175L)
    public static SubLSymbol $misspellingsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1267L)
    public static SubLSymbol $parse_morphologically$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1392L)
    private static SubLSymbol $parse_morphologically_options$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1758L)
    public static SubLSymbol $exclude_vulgaritiesP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1866L)
    public static SubLSymbol $exclude_slangP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1967L)
    public static SubLSymbol $exclude_archaic_speechP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2079L)
    public static SubLSymbol $exclude_indirect_relationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2859L)
    public static SubLSymbol $lexicon_lookup_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3241L)
    public static SubLSymbol $greedy_nlwe_interpretations$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3393L)
    public static SubLSymbol $favored_pos$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3456L)
    public static SubLSymbol $max_mww_word_length$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3562L)
    public static SubLSymbol $use_acronymsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3659L)
    public static SubLSymbol $use_abbreviationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3769L)
    public static SubLSymbol $use_lexical_abbreviationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3905L)
    public static SubLSymbol $initialize_nl_trie_control_varsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 4025L)
    public static SubLSymbol $wn_pos_cyc_pos_map$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6346L)
    private static SubLSymbol $semtrans_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6964L)
    private static SubLSymbol $multi_word_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7758L)
    public static SubLSymbol $semantic_predicates_excluded_from_lexical_lookup$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 8532L)
    private static SubLSymbol $abbreviation_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9127L)
    private static SubLSymbol $acronym_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9702L)
    private static SubLSymbol $proper_name_predicates_from_kb$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11376L)
    private static SubLSymbol $term_strings_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
    private static SubLSymbol $head_position_pred_cachedP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
    private static SubLSymbol $verb_frames_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14438L)
    public static SubLSymbol $noun_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14495L)
    public static SubLSymbol $pn_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14568L)
    public static SubLSymbol $pn_mass_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14622L)
    public static SubLSymbol $pn_count_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14686L)
    public static SubLSymbol $agentive_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14749L)
    public static SubLSymbol $mass_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14961L)
    public static SubLSymbol $verb_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15272L)
    public static SubLSymbol $adjective_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15381L)
    public static SubLSymbol $adverb_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15484L)
    private static SubLSymbol $all_lexicon_string_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17057L)
    private static SubLSymbol $all_lexicon_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17527L)
    public static SubLSymbol $top_level_nl_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 18251L)
    public static SubLSymbol $root_form_speech_parts$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 18875L)
    public static SubLSymbol $lexicon_cache_code_revision$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19111L)
    public static SubLSymbol $morphology_code_revision$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19277L)
    public static SubLSymbol $nl_trie_code_revision$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19427L)
    private static SubLSymbol $noop_updates_for_lexicon_globals$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20469L)
    private static SubLSymbol $lexicon_global_noop_done_values$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21690L)
    public static SubLSymbol $mwp_reformulate_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21907L)
    public static SubLSymbol $mwp_triefy_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22021L)
    public static SubLSymbol $use_mwpP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22156L)
    public static SubLSymbol $mwp_make_up_basesP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22296L)
    public static SubLSymbol $mwp_semantic_check_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22355L)
    public static SubLSymbol $mwp_syntactic_check_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22414L)
    public static SubLSymbol $mwp_rule_lookup_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22469L)
    public static SubLSymbol $mwp_wff_filter_level$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22517L)
    public static SubLSymbol $mwp_suppress_recursive_analysisP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22649L)
    public static SubLSymbol $nl_affix_types$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22841L)
    public static SubLSymbol $default_lexification_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23026L)
    public static SubLSymbol $default_syntactic_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23135L)
    public static SubLSymbol $default_relational_lexification_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23270L)
    public static SubLSymbol $default_lexification_template_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23395L)
    public static SubLSymbol $default_predicate_lexification_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 23534L)
    public static SubLSymbol $use_sme_lexwiz$;
    private static final SubLSymbol $kw0$GENERATION;
    private static final SubLSymbol $kw1$AS_FALLBACK;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$LEXICON_FILTER_ACTIVE_;
    private static final SubLObject $const5$BaseKB;
    private static final SubLSymbol $sym6$_LEXICON_LOOKUP_MT_;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$IMAGE_DEMO;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$_EXIT;
    private static final SubLSymbol $sym11$_SEMTRANS_PREDS_;
    private static final SubLObject $const12$SemTransPred;
    private static final SubLSymbol $sym13$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const14$EverythingPSC;
    private static final SubLObject $const15$MultiWordForConstantPred;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$_ABBREVIATION_PREDICATES_;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_ACRONYM_PREDICATES_;
    private static final SubLObject $const20$acronymString;
    private static final SubLSymbol $sym21$_PROPER_NAME_PREDICATES_FROM_KB_;
    private static final SubLObject $const22$properNameStrings;
    private static final SubLObject $const23$ProperNamePredicate_General;
    private static final SubLSymbol $sym24$_TERM_STRINGS_PREDS_;
    private static final SubLObject $const25$termStrings;
    private static final SubLObject $const26$HeadMedialMultiWordForConstantPre;
    private static final SubLObject $const27$HeadInitialMultiWordForConstantPr;
    private static final SubLObject $const28$HeadFinalMultiWordForConstantPred;
    private static final SubLSymbol $sym29$HEAD_POSITION_PRED_CACHED_;
    private static final SubLSymbol $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_;
    private static final SubLInteger $int31$256;
    private static final SubLSymbol $sym32$VERB_FRAMES;
    private static final SubLObject $const33$verbSemTrans;
    private static final SubLSymbol $sym34$_VERB_FRAMES_CACHING_STATE_;
    private static final SubLInteger $int35$128;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$UNINITIALIZED;
    private static final SubLSymbol $sym46$VALID_CONSTANT_;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLObject $const49$wordStrings;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$_LEXICON_CACHE_CODE_REVISION_;
    private static final SubLSymbol $sym52$_MORPHOLOGY_CODE_REVISION_;
    private static final SubLSymbol $sym53$_NL_TRIE_CODE_REVISION_;
    private static final SubLSymbol $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_;
    private static final SubLString $str55$Lexicon_global_noop_updates_must_;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$SUPERSTRING_;
    private static final SubLObject $const58$EnglishMt;
    private static final SubLList $list59;
    private static final SubLString $str60$GeneralEnglishMt;
    private static final SubLSymbol $sym61$_DEFAULT_LEXIFICATION_MT_;
    private static final SubLSymbol $sym62$_DEFAULT_SYNTACTIC_MT_;
    private static final SubLString $str63$EnglishParaphraseMt;
    private static final SubLSymbol $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_;
    private static final SubLString $str65$EnglishTemplateMt;
    private static final SubLSymbol $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_;
    private static final SubLString $str67$RelationParaphraseMt;
    private static final SubLSymbol $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_;
    private static final SubLSymbol $sym69$_USE_SME_LEXWIZ_;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 1639L)
    public static SubLObject parse_morphologically_option_p(final SubLObject v_object) {
        return conses_high.member(v_object, lexicon_vars.$parse_morphologically_options$.getGlobalValue(), Symbols.symbol_function((SubLObject)lexicon_vars.EQL), (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2249L)
    public static SubLObject active_lexicon_filtersP() {
        return list_utilities.sublisp_boolean(active_lexicon_filters());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2404L)
    public static SubLObject lexicon_filters() {
        return (SubLObject)lexicon_vars.$list3;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2606L)
    public static SubLObject active_lexicon_filters() {
        return list_utilities.remove_if_not((SubLObject)lexicon_vars.$sym4$LEXICON_FILTER_ACTIVE_, lexicon_filters(), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 2775L)
    public static SubLObject lexicon_filter_activeP(final SubLObject filter) {
        return list_utilities.sublisp_boolean(Eval.eval(filter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 3102L)
    public static SubLObject lexicon_lookup_mt_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_relevance_macros.mt_to_mt_info(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 4448L)
    public static SubLObject set_app(final SubLObject app) {
        if (app == lexicon_vars.$kw8$IMAGE_DEMO) {
            lexicon_vars.$greedy_nlwe_interpretations$.setDynamicValue((SubLObject)lexicon_vars.T);
            lexicon_vars.$use_acronymsP$.setDynamicValue((SubLObject)lexicon_vars.NIL);
            lexicon_vars.$use_abbreviationsP$.setDynamicValue((SubLObject)lexicon_vars.NIL);
            control_vars.$partial_semanticsP$.setDynamicValue((SubLObject)lexicon_vars.T);
            lexicon_vars.$nl_understanding_mts$.setDynamicValue((SubLObject)lexicon_vars.$list9);
        }
        return (SubLObject)lexicon_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5220L)
    public static SubLObject clear_cached_lexical_vars() {
        clear_lex_pred_set(lexicon_vars.$multi_word_preds$.getGlobalValue());
        clear_lex_pred_set(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
        clear_lex_pred_set(lexicon_vars.$term_strings_preds$.getGlobalValue());
        lexicon_vars.$all_lexicon_string_predicates$.setGlobalValue(misc_utilities.uninitialized());
        lexicon_vars.$all_lexicon_predicates$.setGlobalValue((SubLObject)lexicon_vars.NIL);
        clear_lex_pred_set(lexicon_vars.$semtrans_preds$.getGlobalValue());
        return (SubLObject)lexicon_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5672L)
    public static SubLObject lex_pred_set_p(final SubLObject v_object) {
        return locking_map.locking_map_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5747L)
    public static SubLObject lex_pred_set_uninitializedP(final SubLObject v_set) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(v_set);
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            return (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.map_size(v_set).eql((SubLObject)lexicon_vars.ONE_INTEGER) && lexicon_vars.NIL != map_utilities.map_has_keyP(v_set, misc_utilities.uninitialized()));
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 5921L)
    public static SubLObject clear_lex_pred_set(final SubLObject v_set) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(v_set);
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(v_set);
            map_utilities.map_put(v_set, misc_utilities.uninitialized(), (SubLObject)lexicon_vars.T);
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6076L)
    public static SubLObject new_lex_pred_set() {
        return locking_map.create_locking_map(set_utilities.new_singleton_set(misc_utilities.uninitialized(), Symbols.symbol_function((SubLObject)lexicon_vars.EQL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6187L)
    public static SubLObject lex_pred_set_memberP(final SubLObject pred, final SubLObject v_set) {
        return map_utilities.map_has_keyP(v_set, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6271L)
    public static SubLObject lex_pred_set_element_list(final SubLObject v_set) {
        return map_utilities.map_keys(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6459L)
    public static SubLObject initialize_semtrans_preds() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$semtrans_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(lexicon_vars.$semtrans_preds$.getGlobalValue());
            SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts(lexicon_vars.$const12$SemTransPred);
            SubLObject pred = (SubLObject)lexicon_vars.NIL;
            pred = cdolist_list_var.first();
            while (lexicon_vars.NIL != cdolist_list_var) {
                map_utilities.map_put(lexicon_vars.$semtrans_preds$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$semtrans_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 6727L)
    public static SubLObject semtrans_predP(final SubLObject v_term) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$semtrans_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$semtrans_preds$.getGlobalValue())) {
                initialize_semtrans_preds();
            }
            return lex_pred_set_memberP(v_term, lexicon_vars.$semtrans_preds$.getGlobalValue());
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7082L)
    public static SubLObject multi_word_preds() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$multi_word_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$multi_word_preds$.getGlobalValue())) {
                initialize_multi_word_preds();
            }
            return lex_pred_set_element_list(lexicon_vars.$multi_word_preds$.getGlobalValue());
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 7328L)
    public static SubLObject initialize_multi_word_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$multi_word_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            clear_head_position_pred_cachedP();
            map_utilities.map_remove_all(lexicon_vars.$multi_word_preds$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_vars.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$const14$EverythingPSC, thread);
                if (lexicon_vars.NIL != constant_handles.valid_constantP(lexicon_vars.$const15$MultiWordForConstantPred, (SubLObject)lexicon_vars.UNPROVIDED)) {
                    SubLObject cdolist_list_var = isa.all_fort_instances(lexicon_vars.$const15$MultiWordForConstantPred, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                    SubLObject pred = (SubLObject)lexicon_vars.NIL;
                    pred = cdolist_list_var.first();
                    while (lexicon_vars.NIL != cdolist_list_var) {
                        if (lexicon_vars.NIL == hl_prototypes.hl_prototypical_instanceP(pred)) {
                            map_utilities.map_put(lexicon_vars.$multi_word_preds$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$multi_word_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 8598L)
    public static SubLObject abbreviation_predicates() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$abbreviation_predicates$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$abbreviation_predicates$.getGlobalValue())) {
                map_utilities.map_remove_all(lexicon_vars.$abbreviation_predicates$.getGlobalValue());
                SubLObject cdolist_list_var = (SubLObject)lexicon_vars.$list18;
                SubLObject abbrev_pred = (SubLObject)lexicon_vars.NIL;
                abbrev_pred = cdolist_list_var.first();
                while (lexicon_vars.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = genl_predicates.all_spec_preds(abbrev_pred, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                    SubLObject pred = (SubLObject)lexicon_vars.NIL;
                    pred = cdolist_list_var_$1.first();
                    while (lexicon_vars.NIL != cdolist_list_var_$1) {
                        map_utilities.map_put(lexicon_vars.$abbreviation_predicates$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        pred = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    abbrev_pred = cdolist_list_var.first();
                }
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lex_pred_set_element_list(lexicon_vars.$abbreviation_predicates$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9188L)
    public static SubLObject acronym_predicates() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$acronym_predicates$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$acronym_predicates$.getGlobalValue())) {
                SubLObject cdolist_list_var = genl_predicates.all_spec_preds(lexicon_vars.$const20$acronymString, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                SubLObject pred = (SubLObject)lexicon_vars.NIL;
                pred = cdolist_list_var.first();
                while (lexicon_vars.NIL != cdolist_list_var) {
                    map_utilities.map_put(lexicon_vars.$acronym_predicates$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lex_pred_set_element_list(lexicon_vars.$acronym_predicates$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9499L)
    public static SubLObject name_string_preds(SubLObject force_reinitializationP) {
        if (force_reinitializationP == lexicon_vars.UNPROVIDED) {
            force_reinitializationP = (SubLObject)lexicon_vars.NIL;
        }
        return lex_pred_set_element_list(name_string_preds_set(force_reinitializationP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 9824L)
    public static SubLObject name_string_preds_set(SubLObject force_reinitializationP) {
        if (force_reinitializationP == lexicon_vars.UNPROVIDED) {
            force_reinitializationP = (SubLObject)lexicon_vars.NIL;
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue()) || lexicon_vars.NIL != force_reinitializationP) {
                initialize_proper_name_preds();
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 10270L)
    public static SubLObject initialize_proper_name_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_vars.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$const14$EverythingPSC, thread);
                if (lexicon_vars.NIL != constant_handles.valid_constantP(lexicon_vars.$const22$properNameStrings, (SubLObject)lexicon_vars.UNPROVIDED)) {
                    SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(lexicon_vars.$const22$properNameStrings, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                    SubLObject spec_pred = (SubLObject)lexicon_vars.NIL;
                    spec_pred = cdolist_list_var.first();
                    while (lexicon_vars.NIL != cdolist_list_var) {
                        map_utilities.map_put(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue(), spec_pred, (SubLObject)lexicon_vars.T);
                        cdolist_list_var = cdolist_list_var.rest();
                        spec_pred = cdolist_list_var.first();
                    }
                }
                if (lexicon_vars.NIL != constant_handles.valid_constantP(lexicon_vars.$const23$ProperNamePredicate_General, (SubLObject)lexicon_vars.UNPROVIDED)) {
                    SubLObject cdolist_list_var = isa.all_fort_instances(lexicon_vars.$const23$ProperNamePredicate_General, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                    SubLObject pred = (SubLObject)lexicon_vars.NIL;
                    pred = cdolist_list_var.first();
                    while (lexicon_vars.NIL != cdolist_list_var) {
                        map_utilities.map_put(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 10860L)
    public static SubLObject name_string_predP(final SubLObject obj) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue())) {
                initialize_proper_name_preds();
            }
            return lex_pred_set_memberP(obj, lexicon_vars.$proper_name_predicates_from_kb$.getGlobalValue());
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11437L)
    public static SubLObject term_strings_preds(SubLObject force_reinitializationP) {
        if (force_reinitializationP == lexicon_vars.UNPROVIDED) {
            force_reinitializationP = (SubLObject)lexicon_vars.NIL;
        }
        return lex_pred_set_element_list(term_strings_preds_set(force_reinitializationP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11643L)
    public static SubLObject term_strings_preds_set(SubLObject force_reinitializationP) {
        if (force_reinitializationP == lexicon_vars.UNPROVIDED) {
            force_reinitializationP = (SubLObject)lexicon_vars.NIL;
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$term_strings_preds$.getGlobalValue()) || lexicon_vars.NIL != force_reinitializationP) {
                initialize_term_strings_preds();
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$term_strings_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 11984L)
    public static SubLObject initialize_term_strings_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_proper_name_preds();
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(lexicon_vars.$term_strings_preds$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_vars.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$const14$EverythingPSC, thread);
                if (lexicon_vars.NIL != constant_handles.valid_constantP(lexicon_vars.$const25$termStrings, (SubLObject)lexicon_vars.UNPROVIDED)) {
                    SubLObject cdolist_list_var = genl_predicates.all_spec_preds(lexicon_vars.$const25$termStrings, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                    SubLObject pred = (SubLObject)lexicon_vars.NIL;
                    pred = cdolist_list_var.first();
                    while (lexicon_vars.NIL != cdolist_list_var) {
                        if (lexicon_vars.NIL == name_string_predP(pred)) {
                            map_utilities.map_put(lexicon_vars.$term_strings_preds$.getGlobalValue(), pred, (SubLObject)lexicon_vars.T);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lexicon_vars.$term_strings_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 12388L)
    public static SubLObject term_strings_predP(final SubLObject obj) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(lexicon_vars.$term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)lexicon_vars.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (lexicon_vars.NIL != lex_pred_set_uninitializedP(lexicon_vars.$term_strings_preds$.getGlobalValue())) {
                initialize_term_strings_preds();
            }
            return lex_pred_set_memberP(obj, lexicon_vars.$term_strings_preds$.getGlobalValue());
        }
        finally {
            if (lexicon_vars.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 12844L)
    public static SubLObject name_or_term_strings_predP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_vars.NIL != name_string_predP(obj) || lexicon_vars.NIL != term_strings_predP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13062L)
    public static SubLObject nl_agr_predP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_vars.NIL != name_or_term_strings_predP(obj) || lexicon_vars.NIL != lexicon_accessors.speech_part_predP(obj, (SubLObject)lexicon_vars.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13265L)
    public static SubLObject head_medial_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, lexicon_vars.$const26$HeadMedialMultiWordForConstantPre);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13500L)
    public static SubLObject head_initial_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, lexicon_vars.$const27$HeadInitialMultiWordForConstantPr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13737L)
    public static SubLObject head_final_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, lexicon_vars.$const28$HeadFinalMultiWordForConstantPred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
    public static SubLObject clear_head_position_pred_cachedP() {
        final SubLObject cs = lexicon_vars.$head_position_pred_cachedP_caching_state$.getGlobalValue();
        if (lexicon_vars.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
    public static SubLObject remove_head_position_pred_cachedP(final SubLObject pred, final SubLObject type) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_vars.$head_position_pred_cachedP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, type), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
    public static SubLObject head_position_pred_cachedP_internal(final SubLObject pred, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_vars.NIL != constant_handles.valid_constantP(pred, (SubLObject)lexicon_vars.UNPROVIDED) && lexicon_vars.NIL != constant_handles.valid_constantP(type, (SubLObject)lexicon_vars.UNPROVIDED) && lexicon_vars.NIL != isa.isa_in_any_mtP(pred, type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 13970L)
    public static SubLObject head_position_pred_cachedP(final SubLObject pred, final SubLObject type) {
        SubLObject caching_state = lexicon_vars.$head_position_pred_cachedP_caching_state$.getGlobalValue();
        if (lexicon_vars.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_vars.$sym29$HEAD_POSITION_PRED_CACHED_, (SubLObject)lexicon_vars.$sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_, (SubLObject)lexicon_vars.NIL, (SubLObject)lexicon_vars.EQL, (SubLObject)lexicon_vars.TWO_INTEGER, (SubLObject)lexicon_vars.$int31$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_vars.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_vars.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_vars.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_vars.NIL != cached_args && lexicon_vars.NIL == cached_args.rest() && type.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(head_position_pred_cachedP_internal(pred, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, type));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
    public static SubLObject clear_verb_frames() {
        final SubLObject cs = lexicon_vars.$verb_frames_caching_state$.getGlobalValue();
        if (lexicon_vars.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
    public static SubLObject remove_verb_frames(SubLObject mt) {
        if (mt == lexicon_vars.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_vars.$verb_frames_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
    public static SubLObject verb_frames_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_vars.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.pred_refs(lexicon_vars.$const33$verbSemTrans, (SubLObject)lexicon_vars.THREE_INTEGER, (SubLObject)lexicon_vars.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 14144L)
    public static SubLObject verb_frames(SubLObject mt) {
        if (mt == lexicon_vars.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_vars.$verb_frames_caching_state$.getGlobalValue();
        if (lexicon_vars.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_vars.$sym32$VERB_FRAMES, (SubLObject)lexicon_vars.$sym34$_VERB_FRAMES_CACHING_STATE_, (SubLObject)lexicon_vars.$int35$128, (SubLObject)lexicon_vars.EQUAL, (SubLObject)lexicon_vars.ONE_INTEGER, (SubLObject)lexicon_vars.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(verb_frames_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)lexicon_vars.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15553L)
    public static SubLObject all_lexicon_string_predicates() {
        if (lexicon_vars.$kw45$UNINITIALIZED == lexicon_vars.$all_lexicon_string_predicates$.getGlobalValue()) {
            initialize_all_lexicon_string_predicates();
        }
        return lexicon_vars.$all_lexicon_string_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 15755L)
    public static SubLObject initialize_all_lexicon_string_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_vars.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$const14$EverythingPSC, thread);
            lexicon_vars.$all_lexicon_string_predicates$.setGlobalValue(list_utilities.remove_if_not((SubLObject)lexicon_vars.$sym46$VALID_CONSTANT_, (SubLObject)lexicon_vars.$list47, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED));
            lexicon_vars.$all_lexicon_string_predicates$.setGlobalValue(ConsesLow.append(lexicon_vars.$all_lexicon_string_predicates$.getGlobalValue(), conses_high.set_difference(lexicon_accessors.all_speech_part_preds((SubLObject)lexicon_vars.UNPROVIDED), lexicon_vars.$all_lexicon_string_predicates$.getGlobalValue(), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED)));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_lexicon_string_predicates();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17109L)
    public static SubLObject all_lexicon_predicates() {
        if (lexicon_vars.NIL == lexicon_vars.$all_lexicon_predicates$.getGlobalValue()) {
            initialize_all_lexicon_predicates();
        }
        return lexicon_vars.$all_lexicon_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17270L)
    public static SubLObject initialize_all_lexicon_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_vars.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$const14$EverythingPSC, thread);
            lexicon_vars.$all_lexicon_predicates$.setGlobalValue(ConsesLow.append(list_utilities.remove_if_not((SubLObject)lexicon_vars.$sym46$VALID_CONSTANT_, (SubLObject)lexicon_vars.$list48, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED), all_lexicon_string_predicates()));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon_vars.$all_lexicon_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 17586L)
    public static SubLObject initialize_all_speech_part_preds() {
        initialize_all_lexicon_string_predicates();
        initialize_all_lexicon_predicates();
        return lexicon_vars.$all_lexicon_string_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 19486L)
    public static SubLObject declare_noop_updates_for_lexicon_global(final SubLObject global, final SubLObject noop_updates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = noop_updates;
        SubLObject pair = (SubLObject)lexicon_vars.NIL;
        pair = cdolist_list_var.first();
        while (lexicon_vars.NIL != cdolist_list_var) {
            if (lexicon_vars.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (lexicon_vars.NIL == list_utilities.doubletonP(pair) || lexicon_vars.NIL == string_utilities.list_of_string_p(pair))) {
                Errors.error((SubLObject)lexicon_vars.$str55$Lexicon_global_noop_updates_must_, pair);
            }
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject earlier = (SubLObject)lexicon_vars.NIL;
            SubLObject later = (SubLObject)lexicon_vars.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_vars.$list56);
            earlier = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_vars.$list56);
            later = current.first();
            current = current.rest();
            if (lexicon_vars.NIL == current) {
                SubLObject global_alist = list_utilities.alist_lookup(lexicon_vars.$noop_updates_for_lexicon_globals$.getGlobalValue(), global, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
                global_alist = list_utilities.alist_push(global_alist, earlier, later, Symbols.symbol_function((SubLObject)lexicon_vars.EQUAL));
                lexicon_vars.$noop_updates_for_lexicon_globals$.setGlobalValue(list_utilities.alist_enter(lexicon_vars.$noop_updates_for_lexicon_globals$.getGlobalValue(), global, global_alist, (SubLObject)lexicon_vars.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_vars.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return lexicon_vars.$noop_updates_for_lexicon_globals$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20530L)
    public static SubLObject lexicon_global_revision_noop_p(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_vars.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_global_noop_done_values$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_global_noop_done_values$.bind((SubLObject)lexicon_vars.NIL, thread);
            ans = lexicon_global_revision_noop_p_int(global, recorded_value, current_value);
        }
        finally {
            lexicon_vars.$lexicon_global_noop_done_values$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 20907L)
    public static SubLObject lexicon_global_revision_noop_p_int(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_vars.NIL != string_utilities.substringP(recorded_value, current_value, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED)) {
            return (SubLObject)lexicon_vars.T;
        }
        if (lexicon_vars.NIL != subl_promotions.memberP(recorded_value, lexicon_vars.$lexicon_global_noop_done_values$.getDynamicValue(thread), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED)) {
            return (SubLObject)lexicon_vars.NIL;
        }
        lexicon_vars.$lexicon_global_noop_done_values$.setDynamicValue((SubLObject)ConsesLow.cons(recorded_value, lexicon_vars.$lexicon_global_noop_done_values$.getDynamicValue(thread)), thread);
        final SubLObject other_ok_values = noop_updates_for_lexicon_global(global, recorded_value);
        SubLObject noopP = (SubLObject)lexicon_vars.NIL;
        if (lexicon_vars.NIL == noopP) {
            SubLObject csome_list_var;
            SubLObject value;
            for (csome_list_var = other_ok_values, value = (SubLObject)lexicon_vars.NIL, value = csome_list_var.first(); lexicon_vars.NIL == noopP && lexicon_vars.NIL != csome_list_var; noopP = lexicon_global_revision_noop_p_int(global, value, current_value), csome_list_var = csome_list_var.rest(), value = csome_list_var.first()) {}
        }
        return noopP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 21465L)
    public static SubLObject noop_updates_for_lexicon_global(final SubLObject global, final SubLObject recorded_value) {
        final SubLObject global_alist = list_utilities.alist_lookup(lexicon_vars.$noop_updates_for_lexicon_globals$.getGlobalValue(), global, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
        return list_utilities.alist_lookup(global_alist, recorded_value, Symbols.symbol_function((SubLObject)lexicon_vars.$sym57$SUPERSTRING_), (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-vars.lisp", position = 22760L)
    public static SubLObject nl_affix_type_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, lexicon_vars.$nl_affix_types$.getGlobalValue(), (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED);
    }
    
    public static SubLObject declare_lexicon_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "parse_morphologically_option_p", "PARSE-MORPHOLOGICALLY-OPTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "active_lexicon_filtersP", "ACTIVE-LEXICON-FILTERS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lexicon_filters", "LEXICON-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "active_lexicon_filters", "ACTIVE-LEXICON-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lexicon_filter_activeP", "LEXICON-FILTER-ACTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lexicon_lookup_mt_info", "LEXICON-LOOKUP-MT-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "set_app", "SET-APP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "clear_cached_lexical_vars", "CLEAR-CACHED-LEXICAL-VARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lex_pred_set_p", "LEX-PRED-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lex_pred_set_uninitializedP", "LEX-PRED-SET-UNINITIALIZED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "clear_lex_pred_set", "CLEAR-LEX-PRED-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "new_lex_pred_set", "NEW-LEX-PRED-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lex_pred_set_memberP", "LEX-PRED-SET-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lex_pred_set_element_list", "LEX-PRED-SET-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_semtrans_preds", "INITIALIZE-SEMTRANS-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "semtrans_predP", "SEMTRANS-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "multi_word_preds", "MULTI-WORD-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_multi_word_preds", "INITIALIZE-MULTI-WORD-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "abbreviation_predicates", "ABBREVIATION-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "acronym_predicates", "ACRONYM-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "name_string_preds", "NAME-STRING-PREDS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "name_string_preds_set", "NAME-STRING-PREDS-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_proper_name_preds", "INITIALIZE-PROPER-NAME-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "name_string_predP", "NAME-STRING-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "term_strings_preds", "TERM-STRINGS-PREDS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "term_strings_preds_set", "TERM-STRINGS-PREDS-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_term_strings_preds", "INITIALIZE-TERM-STRINGS-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "term_strings_predP", "TERM-STRINGS-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "name_or_term_strings_predP", "NAME-OR-TERM-STRINGS-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "nl_agr_predP", "NL-AGR-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "head_medial_predP", "HEAD-MEDIAL-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "head_initial_predP", "HEAD-INITIAL-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "head_final_predP", "HEAD-FINAL-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "clear_head_position_pred_cachedP", "CLEAR-HEAD-POSITION-PRED-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "remove_head_position_pred_cachedP", "REMOVE-HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "head_position_pred_cachedP_internal", "HEAD-POSITION-PRED-CACHED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "head_position_pred_cachedP", "HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "clear_verb_frames", "CLEAR-VERB-FRAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "remove_verb_frames", "REMOVE-VERB-FRAMES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "verb_frames_internal", "VERB-FRAMES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "verb_frames", "VERB-FRAMES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "all_lexicon_string_predicates", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_all_lexicon_string_predicates", "INITIALIZE-ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "all_lexicon_predicates", "ALL-LEXICON-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_all_lexicon_predicates", "INITIALIZE-ALL-LEXICON-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "initialize_all_speech_part_preds", "INITIALIZE-ALL-SPEECH-PART-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "declare_noop_updates_for_lexicon_global", "DECLARE-NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lexicon_global_revision_noop_p", "LEXICON-GLOBAL-REVISION-NOOP-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "lexicon_global_revision_noop_p_int", "LEXICON-GLOBAL-REVISION-NOOP-P-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "noop_updates_for_lexicon_global", "NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_vars", "nl_affix_type_p", "NL-AFFIX-TYPE-P", 1, 0, false);
        return (SubLObject)lexicon_vars.NIL;
    }
    
    public static SubLObject init_lexicon_vars_file() {
        lexicon_vars.$psg_rules$ = SubLFiles.defparameter("*PSG-RULES*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$print_while_building_hashP$ = SubLFiles.defparameter("*PRINT-WHILE-BUILDING-HASH?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$nl_understanding_mts$ = SubLFiles.defparameter("*NL-UNDERSTANDING-MTS*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$nl_generation_mts$ = SubLFiles.defparameter("*NL-GENERATION-MTS*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$nl_relevance_purpose$ = SubLFiles.defparameter("*NL-RELEVANCE-PURPOSE*", (SubLObject)lexicon_vars.$kw0$GENERATION);
        lexicon_vars.$misspellingsP$ = SubLFiles.defparameter("*MISSPELLINGS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$parse_morphologically$ = SubLFiles.defparameter("*PARSE-MORPHOLOGICALLY*", (SubLObject)lexicon_vars.$kw1$AS_FALLBACK);
        lexicon_vars.$parse_morphologically_options$ = SubLFiles.deflexical("*PARSE-MORPHOLOGICALLY-OPTIONS*", (SubLObject)lexicon_vars.$list2);
        lexicon_vars.$exclude_vulgaritiesP$ = SubLFiles.defparameter("*EXCLUDE-VULGARITIES?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$exclude_slangP$ = SubLFiles.defparameter("*EXCLUDE-SLANG?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$exclude_archaic_speechP$ = SubLFiles.defparameter("*EXCLUDE-ARCHAIC-SPEECH?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$exclude_indirect_relationsP$ = SubLFiles.defparameter("*EXCLUDE-INDIRECT-RELATIONS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$lexicon_lookup_mt$ = SubLFiles.defvar("*LEXICON-LOOKUP-MT*", lexicon_vars.$const5$BaseKB);
        lexicon_vars.$greedy_nlwe_interpretations$ = SubLFiles.defparameter("*GREEDY-NLWE-INTERPRETATIONS*", (SubLObject)lexicon_vars.T);
        lexicon_vars.$favored_pos$ = SubLFiles.defparameter("*FAVORED-POS*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$max_mww_word_length$ = SubLFiles.defparameter("*MAX-MWW-WORD-LENGTH*", (SubLObject)lexicon_vars.TEN_INTEGER);
        lexicon_vars.$use_acronymsP$ = SubLFiles.defparameter("*USE-ACRONYMS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$use_abbreviationsP$ = SubLFiles.defparameter("*USE-ABBREVIATIONS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$use_lexical_abbreviationsP$ = SubLFiles.defparameter("*USE-LEXICAL-ABBREVIATIONS?*", (SubLObject)lexicon_vars.T);
        lexicon_vars.$initialize_nl_trie_control_varsP$ = SubLFiles.defparameter("*INITIALIZE-NL-TRIE-CONTROL-VARS?*", (SubLObject)lexicon_vars.T);
        lexicon_vars.$wn_pos_cyc_pos_map$ = SubLFiles.defparameter("*WN-POS-CYC-POS-MAP*", (SubLObject)lexicon_vars.$list7);
        lexicon_vars.$semtrans_preds$ = SubLFiles.deflexical("*SEMTRANS-PREDS*", maybeDefault((SubLObject)lexicon_vars.$sym11$_SEMTRANS_PREDS_, lexicon_vars.$semtrans_preds$, ()->(new_lex_pred_set())));
        lexicon_vars.$multi_word_preds$ = SubLFiles.deflexical("*MULTI-WORD-PREDS*", new_lex_pred_set());
        lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$ = SubLFiles.defparameter("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", set_utilities.construct_set_from_list((SubLObject)lexicon_vars.$list16, (SubLObject)lexicon_vars.UNPROVIDED, (SubLObject)lexicon_vars.UNPROVIDED));
        lexicon_vars.$abbreviation_predicates$ = SubLFiles.deflexical("*ABBREVIATION-PREDICATES*", maybeDefault((SubLObject)lexicon_vars.$sym17$_ABBREVIATION_PREDICATES_, lexicon_vars.$abbreviation_predicates$, ()->(new_lex_pred_set())));
        lexicon_vars.$acronym_predicates$ = SubLFiles.deflexical("*ACRONYM-PREDICATES*", maybeDefault((SubLObject)lexicon_vars.$sym19$_ACRONYM_PREDICATES_, lexicon_vars.$acronym_predicates$, ()->(new_lex_pred_set())));
        lexicon_vars.$proper_name_predicates_from_kb$ = SubLFiles.deflexical("*PROPER-NAME-PREDICATES-FROM-KB*", maybeDefault((SubLObject)lexicon_vars.$sym21$_PROPER_NAME_PREDICATES_FROM_KB_, lexicon_vars.$proper_name_predicates_from_kb$, ()->(new_lex_pred_set())));
        lexicon_vars.$term_strings_preds$ = SubLFiles.deflexical("*TERM-STRINGS-PREDS*", maybeDefault((SubLObject)lexicon_vars.$sym24$_TERM_STRINGS_PREDS_, lexicon_vars.$term_strings_preds$, ()->(new_lex_pred_set())));
        lexicon_vars.$head_position_pred_cachedP_caching_state$ = SubLFiles.deflexical("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$verb_frames_caching_state$ = SubLFiles.deflexical("*VERB-FRAMES-CACHING-STATE*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$noun_predicates$ = SubLFiles.defparameter("*NOUN-PREDICATES*", (SubLObject)lexicon_vars.$list36);
        lexicon_vars.$pn_predicates$ = SubLFiles.defparameter("*PN-PREDICATES*", (SubLObject)lexicon_vars.$list37);
        lexicon_vars.$pn_mass_predicates$ = SubLFiles.defparameter("*PN-MASS-PREDICATES*", (SubLObject)lexicon_vars.$list38);
        lexicon_vars.$pn_count_predicates$ = SubLFiles.defparameter("*PN-COUNT-PREDICATES*", (SubLObject)lexicon_vars.$list39);
        lexicon_vars.$agentive_preds$ = SubLFiles.defparameter("*AGENTIVE-PREDS*", (SubLObject)lexicon_vars.$list40);
        lexicon_vars.$mass_predicates$ = SubLFiles.defparameter("*MASS-PREDICATES*", (SubLObject)lexicon_vars.$list41);
        lexicon_vars.$verb_predicates$ = SubLFiles.defparameter("*VERB-PREDICATES*", (SubLObject)lexicon_vars.$list42);
        lexicon_vars.$adjective_predicates$ = SubLFiles.defparameter("*ADJECTIVE-PREDICATES*", (SubLObject)lexicon_vars.$list43);
        lexicon_vars.$adverb_predicates$ = SubLFiles.defparameter("*ADVERB-PREDICATES*", (SubLObject)lexicon_vars.$list44);
        lexicon_vars.$all_lexicon_string_predicates$ = SubLFiles.deflexical("*ALL-LEXICON-STRING-PREDICATES*", (SubLObject)lexicon_vars.$kw45$UNINITIALIZED);
        lexicon_vars.$all_lexicon_predicates$ = SubLFiles.deflexical("*ALL-LEXICON-PREDICATES*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$top_level_nl_pred$ = SubLFiles.defconstant("*TOP-LEVEL-NL-PRED*", lexicon_vars.$const49$wordStrings);
        lexicon_vars.$root_form_speech_parts$ = SubLFiles.deflexical("*ROOT-FORM-SPEECH-PARTS*", (SubLObject)lexicon_vars.$list50);
        lexicon_vars.$lexicon_cache_code_revision$ = SubLFiles.deflexical("*LEXICON-CACHE-CODE-REVISION*", (SubLObject)(maybeDefault((SubLObject)lexicon_vars.$sym51$_LEXICON_CACHE_CODE_REVISION_, lexicon_vars.$lexicon_cache_code_revision$, lexicon_vars.NIL)));
        lexicon_vars.$morphology_code_revision$ = SubLFiles.deflexical("*MORPHOLOGY-CODE-REVISION*", (SubLObject)(maybeDefault((SubLObject)lexicon_vars.$sym52$_MORPHOLOGY_CODE_REVISION_, lexicon_vars.$morphology_code_revision$, lexicon_vars.NIL)));
        lexicon_vars.$nl_trie_code_revision$ = SubLFiles.deflexical("*NL-TRIE-CODE-REVISION*", (SubLObject)(maybeDefault((SubLObject)lexicon_vars.$sym53$_NL_TRIE_CODE_REVISION_, lexicon_vars.$nl_trie_code_revision$, lexicon_vars.NIL)));
        lexicon_vars.$noop_updates_for_lexicon_globals$ = SubLFiles.deflexical("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", (SubLObject)(maybeDefault((SubLObject)lexicon_vars.$sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_, lexicon_vars.$noop_updates_for_lexicon_globals$, lexicon_vars.NIL)));
        lexicon_vars.$lexicon_global_noop_done_values$ = SubLFiles.defparameter("*LEXICON-GLOBAL-NOOP-DONE-VALUES*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$mwp_reformulate_resultsP$ = SubLFiles.defparameter("*MWP-REFORMULATE-RESULTS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$mwp_triefy_resultsP$ = SubLFiles.defparameter("*MWP-TRIEFY-RESULTS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$use_mwpP$ = SubLFiles.defparameter("*USE-MWP?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$mwp_make_up_basesP$ = SubLFiles.defparameter("*MWP-MAKE-UP-BASES?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$mwp_semantic_check_mt$ = SubLFiles.defparameter("*MWP-SEMANTIC-CHECK-MT*", lexicon_vars.$const58$EnglishMt);
        lexicon_vars.$mwp_syntactic_check_mt$ = SubLFiles.defparameter("*MWP-SYNTACTIC-CHECK-MT*", lexicon_vars.$const58$EnglishMt);
        lexicon_vars.$mwp_rule_lookup_mt$ = SubLFiles.defparameter("*MWP-RULE-LOOKUP-MT*", lexicon_vars.$const58$EnglishMt);
        lexicon_vars.$mwp_wff_filter_level$ = SubLFiles.defparameter("*MWP-WFF-FILTER-LEVEL*", (SubLObject)lexicon_vars.ONE_INTEGER);
        lexicon_vars.$mwp_suppress_recursive_analysisP$ = SubLFiles.defparameter("*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*", (SubLObject)lexicon_vars.NIL);
        lexicon_vars.$nl_affix_types$ = SubLFiles.defconstant("*NL-AFFIX-TYPES*", (SubLObject)lexicon_vars.$list59);
        lexicon_vars.$default_lexification_mt$ = SubLFiles.defvar("*DEFAULT-LEXIFICATION-MT*", (SubLObject)lexicon_vars.$str60$GeneralEnglishMt);
        lexicon_vars.$default_syntactic_mt$ = SubLFiles.defvar("*DEFAULT-SYNTACTIC-MT*", (SubLObject)lexicon_vars.$str60$GeneralEnglishMt);
        lexicon_vars.$default_relational_lexification_mt$ = SubLFiles.defvar("*DEFAULT-RELATIONAL-LEXIFICATION-MT*", (SubLObject)lexicon_vars.$str63$EnglishParaphraseMt);
        lexicon_vars.$default_lexification_template_mt$ = SubLFiles.defvar("*DEFAULT-LEXIFICATION-TEMPLATE-MT*", (SubLObject)lexicon_vars.$str65$EnglishTemplateMt);
        lexicon_vars.$default_predicate_lexification_mt$ = SubLFiles.defvar("*DEFAULT-PREDICATE-LEXIFICATION-MT*", (SubLObject)lexicon_vars.$str67$RelationParaphraseMt);
        lexicon_vars.$use_sme_lexwiz$ = SubLFiles.defvar("*USE-SME-LEXWIZ*", (SubLObject)lexicon_vars.T);
        return (SubLObject)lexicon_vars.NIL;
    }
    
    public static SubLObject setup_lexicon_vars_file() {
        mt_vars.note_mt_var((SubLObject)lexicon_vars.$sym6$_LEXICON_LOOKUP_MT_, (SubLObject)lexicon_vars.UNPROVIDED);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym11$_SEMTRANS_PREDS_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym17$_ABBREVIATION_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym19$_ACRONYM_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym21$_PROPER_NAME_PREDICATES_FROM_KB_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym24$_TERM_STRINGS_PREDS_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_vars.$sym29$HEAD_POSITION_PRED_CACHED_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_vars.$sym32$VERB_FRAMES);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym51$_LEXICON_CACHE_CODE_REVISION_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym52$_MORPHOLOGY_CODE_REVISION_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym53$_NL_TRIE_CODE_REVISION_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_vars.$sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym61$_DEFAULT_LEXIFICATION_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym61$_DEFAULT_LEXIFICATION_MT_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym62$_DEFAULT_SYNTACTIC_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym62$_DEFAULT_SYNTACTIC_MT_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_);
        utilities_macros.register_html_state_variable((SubLObject)lexicon_vars.$sym69$_USE_SME_LEXWIZ_);
        utilities_macros.register_html_interface_variable((SubLObject)lexicon_vars.$sym69$_USE_SME_LEXWIZ_);
        return (SubLObject)lexicon_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexicon_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexicon_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexicon_vars_file();
    }
    
    static {
        me = (SubLFile)new lexicon_vars();
        lexicon_vars.$psg_rules$ = null;
        lexicon_vars.$print_while_building_hashP$ = null;
        lexicon_vars.$nl_understanding_mts$ = null;
        lexicon_vars.$nl_generation_mts$ = null;
        lexicon_vars.$nl_relevance_purpose$ = null;
        lexicon_vars.$misspellingsP$ = null;
        lexicon_vars.$parse_morphologically$ = null;
        lexicon_vars.$parse_morphologically_options$ = null;
        lexicon_vars.$exclude_vulgaritiesP$ = null;
        lexicon_vars.$exclude_slangP$ = null;
        lexicon_vars.$exclude_archaic_speechP$ = null;
        lexicon_vars.$exclude_indirect_relationsP$ = null;
        lexicon_vars.$lexicon_lookup_mt$ = null;
        lexicon_vars.$greedy_nlwe_interpretations$ = null;
        lexicon_vars.$favored_pos$ = null;
        lexicon_vars.$max_mww_word_length$ = null;
        lexicon_vars.$use_acronymsP$ = null;
        lexicon_vars.$use_abbreviationsP$ = null;
        lexicon_vars.$use_lexical_abbreviationsP$ = null;
        lexicon_vars.$initialize_nl_trie_control_varsP$ = null;
        lexicon_vars.$wn_pos_cyc_pos_map$ = null;
        lexicon_vars.$semtrans_preds$ = null;
        lexicon_vars.$multi_word_preds$ = null;
        lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$ = null;
        lexicon_vars.$abbreviation_predicates$ = null;
        lexicon_vars.$acronym_predicates$ = null;
        lexicon_vars.$proper_name_predicates_from_kb$ = null;
        lexicon_vars.$term_strings_preds$ = null;
        lexicon_vars.$head_position_pred_cachedP_caching_state$ = null;
        lexicon_vars.$verb_frames_caching_state$ = null;
        lexicon_vars.$noun_predicates$ = null;
        lexicon_vars.$pn_predicates$ = null;
        lexicon_vars.$pn_mass_predicates$ = null;
        lexicon_vars.$pn_count_predicates$ = null;
        lexicon_vars.$agentive_preds$ = null;
        lexicon_vars.$mass_predicates$ = null;
        lexicon_vars.$verb_predicates$ = null;
        lexicon_vars.$adjective_predicates$ = null;
        lexicon_vars.$adverb_predicates$ = null;
        lexicon_vars.$all_lexicon_string_predicates$ = null;
        lexicon_vars.$all_lexicon_predicates$ = null;
        lexicon_vars.$top_level_nl_pred$ = null;
        lexicon_vars.$root_form_speech_parts$ = null;
        lexicon_vars.$lexicon_cache_code_revision$ = null;
        lexicon_vars.$morphology_code_revision$ = null;
        lexicon_vars.$nl_trie_code_revision$ = null;
        lexicon_vars.$noop_updates_for_lexicon_globals$ = null;
        lexicon_vars.$lexicon_global_noop_done_values$ = null;
        lexicon_vars.$mwp_reformulate_resultsP$ = null;
        lexicon_vars.$mwp_triefy_resultsP$ = null;
        lexicon_vars.$use_mwpP$ = null;
        lexicon_vars.$mwp_make_up_basesP$ = null;
        lexicon_vars.$mwp_semantic_check_mt$ = null;
        lexicon_vars.$mwp_syntactic_check_mt$ = null;
        lexicon_vars.$mwp_rule_lookup_mt$ = null;
        lexicon_vars.$mwp_wff_filter_level$ = null;
        lexicon_vars.$mwp_suppress_recursive_analysisP$ = null;
        lexicon_vars.$nl_affix_types$ = null;
        lexicon_vars.$default_lexification_mt$ = null;
        lexicon_vars.$default_syntactic_mt$ = null;
        lexicon_vars.$default_relational_lexification_mt$ = null;
        lexicon_vars.$default_lexification_template_mt$ = null;
        lexicon_vars.$default_predicate_lexification_mt$ = null;
        lexicon_vars.$use_sme_lexwiz$ = null;
        $kw0$GENERATION = SubLObjectFactory.makeKeyword("GENERATION");
        $kw1$AS_FALLBACK = SubLObjectFactory.makeKeyword("AS-FALLBACK");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALWAYS"), (SubLObject)SubLObjectFactory.makeKeyword("ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("AS-FALLBACK"), (SubLObject)SubLObjectFactory.makeKeyword("NEVER"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-VULGARITIES?*"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-SLANG?*"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"));
        $sym4$LEXICON_FILTER_ACTIVE_ = SubLObjectFactory.makeSymbol("LEXICON-FILTER-ACTIVE?");
        $const5$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym6$_LEXICON_LOOKUP_MT_ = SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VERB"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADVERB"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"))));
        $kw8$IMAGE_DEMO = SubLObjectFactory.makeKeyword("IMAGE-DEMO");
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $sym10$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym11$_SEMTRANS_PREDS_ = SubLObjectFactory.makeSymbol("*SEMTRANS-PREDS*");
        $const12$SemTransPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SemTransPred"));
        $sym13$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const14$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const15$MultiWordForConstantPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiWordForConstantPred"));
        $list16 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings-GuessedFromName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("middleName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lastName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("middleNameInitial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialsString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stockTickerSymbol")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("epistleAddresseeText")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gospelName-Short")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nicknames")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("atomicSymbol")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sectionTitle")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("referenceWorkEntryTitle")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("executableProgramName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("internetCountryCode")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderTitle")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ksTermString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:label")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programStrings")) });
        $sym17$_ABBREVIATION_PREDICATES_ = SubLObjectFactory.makeSymbol("*ABBREVIATION-PREDICATES*");
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForMultiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForCompoundString")));
        $sym19$_ACRONYM_PREDICATES_ = SubLObjectFactory.makeSymbol("*ACRONYM-PREDICATES*");
        $const20$acronymString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $sym21$_PROPER_NAME_PREDICATES_FROM_KB_ = SubLObjectFactory.makeSymbol("*PROPER-NAME-PREDICATES-FROM-KB*");
        $const22$properNameStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properNameStrings"));
        $const23$ProperNamePredicate_General = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-General"));
        $sym24$_TERM_STRINGS_PREDS_ = SubLObjectFactory.makeSymbol("*TERM-STRINGS-PREDS*");
        $const25$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $const26$HeadMedialMultiWordForConstantPre = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeadMedialMultiWordForConstantPred"));
        $const27$HeadInitialMultiWordForConstantPr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeadInitialMultiWordForConstantPred"));
        $const28$HeadFinalMultiWordForConstantPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeadFinalMultiWordForConstantPred"));
        $sym29$HEAD_POSITION_PRED_CACHED_ = SubLObjectFactory.makeSymbol("HEAD-POSITION-PRED-CACHED?");
        $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*");
        $int31$256 = SubLObjectFactory.makeInteger(256);
        $sym32$VERB_FRAMES = SubLObjectFactory.makeSymbol("VERB-FRAMES");
        $const33$verbSemTrans = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTrans"));
        $sym34$_VERB_FRAMES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VERB-FRAMES-CACHING-STATE*");
        $int35$128 = SubLObjectFactory.makeInteger(128);
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")));
        $list37 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnMassNumber")));
        $list38 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnMassNumber")));
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnPlural")));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Mass")));
        $list42 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Universal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")) });
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree")));
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")));
        $kw45$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym46$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $list47 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properNameStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect")), SubLObjectFactory.makeSymbol("PASTTENSE-UNIVERSAL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Pl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Feminine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Masculine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Feminine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Masculine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Neuter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Neuter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonThirdSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfective-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings")) });
        $list48 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrame")));
        $const49$wordStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings"));
        $list50 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonGradableAdjectiveForm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund")) });
        $sym51$_LEXICON_CACHE_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*LEXICON-CACHE-CODE-REVISION*");
        $sym52$_MORPHOLOGY_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*");
        $sym53$_NL_TRIE_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*NL-TRIE-CODE-REVISION*");
        $sym54$_NOOP_UPDATES_FOR_LEXICON_GLOBALS_ = SubLObjectFactory.makeSymbol("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*");
        $str55$Lexicon_global_noop_updates_must_ = SubLObjectFactory.makeString("Lexicon global noop-updates must be lists of two strings, which ~S isn't.");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EARLIER"), (SubLObject)SubLObjectFactory.makeSymbol("LATER"));
        $sym57$SUPERSTRING_ = SubLObjectFactory.makeSymbol("SUPERSTRING?");
        $const58$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DERIV"), (SubLObject)SubLObjectFactory.makeKeyword("INFL"));
        $str60$GeneralEnglishMt = SubLObjectFactory.makeString("GeneralEnglishMt");
        $sym61$_DEFAULT_LEXIFICATION_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-LEXIFICATION-MT*");
        $sym62$_DEFAULT_SYNTACTIC_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-SYNTACTIC-MT*");
        $str63$EnglishParaphraseMt = SubLObjectFactory.makeString("EnglishParaphraseMt");
        $sym64$_DEFAULT_RELATIONAL_LEXIFICATION_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-RELATIONAL-LEXIFICATION-MT*");
        $str65$EnglishTemplateMt = SubLObjectFactory.makeString("EnglishTemplateMt");
        $sym66$_DEFAULT_LEXIFICATION_TEMPLATE_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-LEXIFICATION-TEMPLATE-MT*");
        $str67$RelationParaphraseMt = SubLObjectFactory.makeString("RelationParaphraseMt");
        $sym68$_DEFAULT_PREDICATE_LEXIFICATION_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-PREDICATE-LEXIFICATION-MT*");
        $sym69$_USE_SME_LEXWIZ_ = SubLObjectFactory.makeSymbol("*USE-SME-LEXWIZ*");
    }
}

/*

	Total time: 259 ms
	
*/