package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet_import_offline_tasks extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks";
    public static final String myFingerPrint = "02b705ad1b01e52e709a7134c5d79253b0d155029439045f49efe8f02d48bde0";
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 1008L)
    public static SubLSymbol $wni_max_nbr_synset_candidates_having_pos$;
    private static final SubLInteger $int0$100;
    private static final SubLSymbol $sym1$WNI_SET_MAX_NBR_SYNSET_CANDIDATES_HAVING_POS;
    private static final SubLSymbol $sym2$INTEGERP;
    private static final SubLSymbol $sym3$WNI_CANDIDATES_FOR_EXACT_MATCHING;
    private static final SubLSymbol $sym4$FORT_P;
    private static final SubLSymbol $sym5$BOOLEANP;
    private static final SubLSymbol $sym6$NAUT_P;
    private static final SubLObject $const7$WordNet2_0_KS;
    private static final SubLString $str8$WordNet2_0_KS_must_be_registered;
    private static final SubLString $str9$gathering_synsets__;
    private static final SubLString $str10$_A_candidate_synsets__;
    private static final SubLObject $const11$Noun;
    private static final SubLString $str12$_A_individual_synsets__;
    private static final SubLString $str13$_A_individual_candidate_synsets__;
    private static final SubLString $str14$_A_collection_candidate_synsets__;
    private static final SubLString $str15$_A_candidate_synsets_after_applyi;
    private static final SubLString $str16$_A_collection_candidate_synsets_e;
    private static final SubLObject $const17$Verb;
    private static final SubLString $str18$finding_exact_match_sysets;
    private static final SubLString $str19$cdolist;
    private static final SubLObject $const20$WordNetSynsetImportStatus_ReadyFo;
    private static final SubLSymbol $sym21$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym22$CONSP;
    private static final SubLString $str23$invalid_synset_pair___A__;
    private static final SubLSymbol $sym24$WNI_VERBS_WITH_RELATED_NOUNS_FOR_MATCHING;
    private static final SubLSymbol $sym25$WNI_CANDIDATES_FOR_MATCHING;
    private static final SubLString $str26$verbs_with_related_situation_noun;
    private static final SubLString $str27$clearing_cached_html_for_cyc_imag;
    private static final SubLString $str28$gathering__A_synsets__;
    private static final SubLString $str29$finding_verbs_with_mapped_hyperny;
    private static final SubLString $str30$finding_mapped_hypernyms;
    private static final SubLString $str31$gathered__A__A_synsets__;
    private static final SubLSymbol $sym32$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str33$__selected__A__;
    private static final SubLString $str34$__;
    private static final SubLString $str35$_;
    private static final SubLString $str36$__error___A__;
    private static final SubLSymbol $sym37$WNI_REFRESH_CONCEPT_MATCH_HTML_CACHE;
    private static final SubLString $str38$gathering_candidate_synsets__;
    private static final SubLString $str39$gathered__A_synsets__;
    private static final SubLString $str40$caching_concept_match_html;
    private static final SubLList $list41;
    private static final SubLString $str42$_A__;
    private static final SubLSymbol $sym43$WNI_UNMAPPED_HYPERNYMS_OF_INDIVIDUALS;
    private static final SubLString $str44$gathering_individuals__;
    private static final SubLString $str45$finding_unmapped_hypernyms_of_ind;
    private static final SubLSymbol $sym46$WNI_TOPMOST_UNMAPPED_VERBS_FOR_MATCHING;
    private static final SubLString $str47$finding_topmost_unmapped_verbs;
    private static final SubLString $str48$formatting_workflow_pages;
    private static final SubLSymbol $sym49$WNI_VERB_CANDIDATES_FOR_SEMTRANS;
    private static final SubLString $str50$gathering_lexification_candidate_;
    private static final SubLObject $const51$WordNetSynsetImportStatus_ReadyFo;
    private static final SubLString $str52$_A_candidate_synsets_for_lexifica;
    private static final SubLString $str53$_A_verb_candidate_synsets_for_lex;
    private static final SubLString $str54$_A_candidate_synsets_having_no_se;
    private static final SubLObject $const55$Individual;
    private static final SubLString $str56$_A_candidate_synsets_having_a_dir;
    private static final SubLString $str57$Making_workflow_status_assertions;
    private static final SubLObject $const58$WordNetSynsetImportStatus_ReadyFo;
    private static final SubLSymbol $sym59$WNI_DISJOINT_GENLS_INTEGRITY_TEST;
    private static final SubLString $str60$_A_has_disjoint_genls__A__;
    private static final SubLSymbol $sym61$WNI_UNASSERTING_REDUNDANT_GENLS;
    private static final SubLString $str62$Unasserting_redundant_genls;
    private static final SubLString $str63$_A_has_redundant_genls__A__;
    private static final SubLSymbol $sym64$WNI_MARK_EXISTING_MAPPED_TERMS;
    private static final SubLObject $const65$SteveReed;
    private static final SubLObject $const66$ResearchCycProject;
    private static final SubLString $str67$marking_existing_mapped_terms;
    private static final SubLObject $const68$ResearchCycConstant;
    private static final SubLObject $const69$BookkeepingMt;
    private static final SubLObject $const70$ScaffoldingConstant;
    private static final SubLString $str71$_home_reed_temp_new_transcript_1_;
    private static final SubLSymbol $kw72$DIRECTION;
    private static final SubLSymbol $kw73$OUTPUT;
    private static final SubLSymbol $kw74$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw75$CREATE;
    private static final SubLSymbol $kw76$IF_EXISTS;
    private static final SubLSymbol $kw77$OVERWRITE;
    private static final SubLString $str78$_home_reed_temp_new_transcript_ts;
    private static final SubLSymbol $kw79$INPUT;
    private static final SubLString $str80$Unable_to_open__S;
    private static final SubLString $str81$DeterminedIndividual;
    private static final SubLSymbol $sym82$WNI_ROLE_INFO_P;
    private static final SubLString $str83$_bgcolor__wheat_;
    private static final SubLString $str84$;
    private static final SubLString $str85$_____A;
    private static final SubLString $str86$_tr;
    private static final SubLString $str87$__td__img_src__yellow_gif__alt___;
    private static final SubLString $str88$__a___td__td__a_href__cg_wns_edit;
    private static final SubLString $str89$__a___td__td__img_src__yellow_gif;
    private static final SubLString $str90$__a___td__td__input_type__checkbo;
    private static final SubLString $str91$_;
    private static final SubLString $str92$____td___tr_;
    private static final SubLString $str93$redundant;
    private static final SubLString $str94$subsumes__a_href__cg_wns_edit_amp;
    private static final SubLString $str95$__a_;
    private static final SubLString $str96$__td__img_src__yellow_gif__alt___;
    private static final SubLString $str97$__a___td___td__a_href__cg_wns_edi;
    private static final SubLString $str98$__a___td___td__img_src__yellow_gi;
    private static final SubLString $str99$__a___td___td_;
    private static final SubLString $str100$__td___td__input_type__checkbox__;
    private static final SubLString $str101$____td____tr_;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 1336L)
    public static SubLObject wni_set_max_nbr_synset_candidates_having_pos(final SubLObject nbr) {
        assert wordnet_import_offline_tasks.NIL != Types.integerp(nbr) : nbr;
        wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.setDynamicValue(nbr);
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 1503L)
    public static SubLObject wni_candidates_for_exact_matching(final SubLObject pos, SubLObject only_individualsP, SubLObject situation_nounsP, SubLObject restart_synset) {
        if (only_individualsP == wordnet_import_offline_tasks.UNPROVIDED) {
            only_individualsP = (SubLObject)wordnet_import_offline_tasks.NIL;
        }
        if (situation_nounsP == wordnet_import_offline_tasks.UNPROVIDED) {
            situation_nounsP = (SubLObject)wordnet_import_offline_tasks.NIL;
        }
        if (restart_synset == wordnet_import_offline_tasks.UNPROVIDED) {
            restart_synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import_offline_tasks.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(only_individualsP) : only_individualsP;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(situation_nounsP) : situation_nounsP;
        if (wordnet_import_offline_tasks.NIL != restart_synset && !wordnet_import_offline_tasks.assertionsDisabledInClass && wordnet_import_offline_tasks.NIL == narts_high.naut_p(restart_synset)) {
            throw new AssertionError(restart_synset);
        }
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import_offline_tasks.$const7$WordNet2_0_KS, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str8$WordNet2_0_KS_must_be_registered);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str9$gathering_synsets__);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        SubLObject candidate_synsets = wordnet_import.wni_unmapped_synsets_having_mapped_hypernym(pos);
        SubLObject found_restartP = (SubLObject)wordnet_import_offline_tasks.NIL;
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str10$_A_candidate_synsets__, Sequences.length(candidate_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        if (pos.eql(wordnet_import_offline_tasks.$const11$Noun)) {
            final SubLObject synset_individuals = wordnet_import.wni_synset_individuals();
            PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str12$_A_individual_synsets__, Sequences.length(synset_individuals));
            streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            if (wordnet_import_offline_tasks.NIL != only_individualsP) {
                candidate_synsets = keyhash_utilities.fast_intersection(candidate_synsets, synset_individuals, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str13$_A_individual_candidate_synsets__, Sequences.length(candidate_synsets));
                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            }
            else if (wordnet_import_offline_tasks.NIL != situation_nounsP) {
                candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, synset_individuals, (SubLObject)wordnet_import_offline_tasks.EQUAL);
                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str14$_A_collection_candidate_synsets__, Sequences.length(candidate_synsets));
                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            }
            else {
                if (Sequences.length(candidate_synsets).numG(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                    candidate_synsets = list_utilities.first_n(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                }
                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str15$_A_candidate_synsets_after_applyi, Sequences.length(candidate_synsets));
                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                candidate_synsets = wordnet_import.wni_exclude_situations(candidate_synsets);
                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str16$_A_collection_candidate_synsets_e, Sequences.length(candidate_synsets));
                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            }
        }
        else if (pos.eql(wordnet_import_offline_tasks.$const17$Verb)) {
            if (Sequences.length(candidate_synsets).numG(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                candidate_synsets = list_utilities.first_n(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
            }
            candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, wordnet_import.wni_exclude_situations(candidate_synsets), (SubLObject)wordnet_import_offline_tasks.EQUAL);
        }
        if (Sequences.length(candidate_synsets).numG(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
            candidate_synsets = list_utilities.first_n(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str15$_A_candidate_synsets_after_applyi, Sequences.length(candidate_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        candidate_synsets = wordnet_import.wni_exclude_relations(candidate_synsets);
        final SubLObject list_var;
        candidate_synsets = (list_var = wordnet_import.wni_exclude_skipped(candidate_synsets));
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str18$finding_exact_match_sysets, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    if (wordnet_import_offline_tasks.NIL != restart_synset && wordnet_import_offline_tasks.NIL == found_restartP) {
                        if (synset.equal(restart_synset)) {
                            found_restartP = (SubLObject)wordnet_import_offline_tasks.T;
                            SubLObject cdolist_list_var;
                            final SubLObject synset_pairs = cdolist_list_var = wni_candidates_for_exact_matching_helper(synset);
                            SubLObject synset_pair = (SubLObject)wordnet_import_offline_tasks.NIL;
                            synset_pair = cdolist_list_var.first();
                            while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
                                final SubLObject synset_$1 = synset_pair.first();
                                final SubLObject v_term = conses_high.second(synset_pair);
                                wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_$1, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo, synset_$1, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                synset_pair = cdolist_list_var.first();
                            }
                        }
                    }
                    else {
                        SubLObject cdolist_list_var;
                        final SubLObject synset_pairs = cdolist_list_var = wni_candidates_for_exact_matching_helper(synset);
                        SubLObject synset_pair = (SubLObject)wordnet_import_offline_tasks.NIL;
                        synset_pair = cdolist_list_var.first();
                        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
                            final SubLObject synset_$2 = synset_pair.first();
                            final SubLObject v_term = conses_high.second(synset_pair);
                            wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_$2, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                            wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo, synset_$2, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                            streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            synset_pair = cdolist_list_var.first();
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 5624L)
    public static SubLObject wni_candidates_for_exact_matching_helper(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import_offline_tasks.NIL != narts_high.naut_p(synset) : synset;
        SubLObject exact_match_synsets = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject terms = (SubLObject)wordnet_import_offline_tasks.NIL;
        final SubLObject _prev_bind_0 = wordnet_import.$wni_verbose_exact_synset_term_matches$.currentBinding(thread);
        try {
            wordnet_import.$wni_verbose_exact_synset_term_matches$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            terms = wordnet_import.wni_exact_synset_term_matches(synset);
        }
        finally {
            wordnet_import.$wni_verbose_exact_synset_term_matches$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)wordnet_import_offline_tasks.NIL;
        v_term = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            exact_match_synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(synset, v_term), exact_match_synsets);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        final SubLObject list_var = exact_match_synsets;
        assert wordnet_import_offline_tasks.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import_offline_tasks.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var2) {
            assert wordnet_import_offline_tasks.NIL != Types.consp(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        cdolist_list_var = exact_match_synsets;
        SubLObject synset_pair = (SubLObject)wordnet_import_offline_tasks.NIL;
        synset_pair = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!Sequences.length(synset_pair).eql((SubLObject)wordnet_import_offline_tasks.TWO_INTEGER) || wordnet_import_offline_tasks.NIL == narts_high.naut_p(synset_pair.first()) || wordnet_import_offline_tasks.NIL == forts.fort_p(conses_high.second(synset_pair)))) {
                Errors.error((SubLObject)wordnet_import_offline_tasks.$str23$invalid_synset_pair___A__, synset_pair);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_pair = cdolist_list_var.first();
        }
        return exact_match_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 6380L)
    public static SubLObject wni_verbs_with_related_nouns_for_matching() {
        return wni_candidates_for_matching(wordnet_import_offline_tasks.$const17$Verb, (SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 6573L)
    public static SubLObject wni_candidates_for_matching(final SubLObject pos, SubLObject verbs_with_related_situation_nounsP, SubLObject individualsP) {
        if (verbs_with_related_situation_nounsP == wordnet_import_offline_tasks.UNPROVIDED) {
            verbs_with_related_situation_nounsP = (SubLObject)wordnet_import_offline_tasks.NIL;
        }
        if (individualsP == wordnet_import_offline_tasks.UNPROVIDED) {
            individualsP = (SubLObject)wordnet_import_offline_tasks.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import_offline_tasks.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(verbs_with_related_situation_nounsP) : verbs_with_related_situation_nounsP;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(individualsP) : individualsP;
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import_offline_tasks.$const7$WordNet2_0_KS, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str8$WordNet2_0_KS_must_be_registered);
        }
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL != verbs_with_related_situation_nounsP && wordnet_import_offline_tasks.NIL != individualsP) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str26$verbs_with_related_situation_noun);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str27$clearing_cached_html_for_cyc_imag, control_vars.cyc_image_id());
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str28$gathering__A_synsets__, pos);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
        SubLObject error_message = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject html_string = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject nbr_synset_candidates_having_pos = (SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER;
        final SubLObject text = (SubLObject)((wordnet_import_offline_tasks.NIL != verbs_with_related_situation_nounsP) ? wordnet_import_offline_tasks.$str29$finding_verbs_with_mapped_hyperny : wordnet_import_offline_tasks.$str30$finding_mapped_hypernyms);
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str31$gathered__A__A_synsets__, Sequences.length(synsets_having_pos), pos);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject list_var = synsets_having_pos;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((wordnet_import_offline_tasks.NIL != text) ? text : wordnet_import_offline_tasks.$str19$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)wordnet_import_offline_tasks.$sym32$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (nbr_synset_candidates_having_pos.numL(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_term(synset) && wordnet_import_offline_tasks.NIL != wordnet_import.wni_synset_hypernyms_mappedP(synset) && (wordnet_import_offline_tasks.NIL == verbs_with_related_situation_nounsP || wordnet_import_offline_tasks.NIL != wordnet_import.wni_verb_is_derived_from_situation_nounP(synset)) && (!pos.eql(wordnet_import_offline_tasks.$const17$Verb) || wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_is_causerP(synset)) && (!pos.eql(wordnet_import_offline_tasks.$const11$Noun) || wordnet_import_offline_tasks.NIL == individualsP || wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_collectionP(synset))) {
                                    nbr_synset_candidates_having_pos = Numbers.add(nbr_synset_candidates_having_pos, (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER);
                                    PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str33$__selected__A__, synset);
                                    streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                    wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo, synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                    if (wordnet_import_offline_tasks.NIL == verbs_with_related_situation_nounsP) {
                                        final SubLObject _prev_bind_0_$5 = html_macros.$html_stream$.currentBinding(thread);
                                        try {
                                            html_macros.$html_stream$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                                            try {
                                                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                                                cb_wordnet_import_concept_match.wni_concept_match_html(synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                                html_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            html_macros.$html_stream$.rebind(_prev_bind_0_$5, thread);
                                        }
                                        html_string = string_utilities.string_substitute((SubLObject)wordnet_import_offline_tasks.$str34$__, (SubLObject)wordnet_import_offline_tasks.$str35$_, html_string, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                        wordnet_import.wni_insert_concept_match_html(synset, html_string);
                                    }
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)wordnet_import_offline_tasks.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (wordnet_import_offline_tasks.NIL != error_message) {
                        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str36$__error___A__, error_message);
                        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 9136L)
    public static SubLObject wni_refresh_concept_match_html_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import_offline_tasks.$const7$WordNet2_0_KS, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str8$WordNet2_0_KS_must_be_registered);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str27$clearing_cached_html_for_cyc_imag, control_vars.cyc_image_id());
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str38$gathering_candidate_synsets__);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject synsets = wordnet_import.wni_unlocked_synsets_with_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo);
        SubLObject error_message = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject html_string = (SubLObject)wordnet_import_offline_tasks.NIL;
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str39$gathered__A_synsets__, Sequences.length(synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject list_var = synsets;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str40$caching_concept_match_html, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)wordnet_import_offline_tasks.$sym32$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str33$__selected__A__, synset);
                                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                                    try {
                                        html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                                        cb_wordnet_import_concept_match.wni_concept_match_html(synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                        html_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                }
                                finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_string = string_utilities.string_substitute((SubLObject)wordnet_import_offline_tasks.$str34$__, (SubLObject)wordnet_import_offline_tasks.$str35$_, html_string, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                wordnet_import.wni_insert_concept_match_html(synset, html_string);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)wordnet_import_offline_tasks.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (wordnet_import_offline_tasks.NIL != error_message) {
                        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str36$__error___A__, error_message);
                        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 10352L)
    public static SubLObject wni_list_glosses_for_event_synsets() {
        SubLObject cdolist_list_var;
        final SubLObject synsets = cdolist_list_var = wordnet_import.wni_all_hyponyms((SubLObject)wordnet_import_offline_tasks.$list41);
        SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        synset = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str42$_A__, wordnet_import.wni_synset_gloss(synset));
            streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            synset = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 10589L)
    public static SubLObject wni_unmapped_hypernyms_of_individuals() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import_offline_tasks.$const7$WordNet2_0_KS, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str8$WordNet2_0_KS_must_be_registered);
        }
        wordnet_import.wni_delete_all_concept_match_html();
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str44$gathering_individuals__);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject synsets = wordnet_import.wni_synset_individuals();
        final SubLObject hypernyms_dictionary = dictionary.new_dictionary((SubLObject)wordnet_import_offline_tasks.EQUAL, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        SubLObject html_string = (SubLObject)wordnet_import_offline_tasks.NIL;
        final SubLObject list_var = synsets;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str45$finding_unmapped_hypernyms_of_ind, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    if (wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_hypernyms_mappedP(synset)) {
                        SubLObject cdolist_list_var = wordnet_import.wni_hypernyms(synset);
                        SubLObject hypernym = (SubLObject)wordnet_import_offline_tasks.NIL;
                        hypernym = cdolist_list_var.first();
                        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
                            if (wordnet_import_offline_tasks.NIL == dictionary_utilities.dictionary_has_keyP(hypernyms_dictionary, hypernym)) {
                                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str33$__selected__A__, wordnet_import.wni_synset_words(hypernym));
                                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                dictionary.dictionary_enter(hypernyms_dictionary, hypernym, (SubLObject)wordnet_import_offline_tasks.T);
                                wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo, hypernym, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                if (wordnet_import_offline_tasks.NIL != wordnet_import.wni_hypernym_mappedP(hypernym)) {
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                                        try {
                                            html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                                            cb_wordnet_import_concept_match.wni_concept_match_html(hypernym, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                            html_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_string = string_utilities.string_substitute((SubLObject)wordnet_import_offline_tasks.$str34$__, (SubLObject)wordnet_import_offline_tasks.$str35$_, html_string, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                    wordnet_import.wni_insert_concept_match_html(hypernym, html_string);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            hypernym = cdolist_list_var.first();
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 11896L)
    public static SubLObject wni_topmost_unmapped_verbs_for_matching() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wordnet_import_offline_tasks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import_offline_tasks.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import_offline_tasks.$const7$WordNet2_0_KS, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
            Errors.error((SubLObject)wordnet_import_offline_tasks.$str8$WordNet2_0_KS_must_be_registered);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str27$clearing_cached_html_for_cyc_imag, control_vars.cyc_image_id());
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        final SubLObject pos = wordnet_import_offline_tasks.$const17$Verb;
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str28$gathering__A_synsets__, pos);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
        SubLObject synsets = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject html_string = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject nbr_synset_candidates_having_pos = (SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER;
        final SubLObject text = (SubLObject)wordnet_import_offline_tasks.$str47$finding_topmost_unmapped_verbs;
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str31$gathered__A__A_synsets__, Sequences.length(synsets_having_pos), pos);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        SubLObject list_var = synsets_having_pos;
        SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((wordnet_import_offline_tasks.NIL != text) ? text : wordnet_import_offline_tasks.$str19$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    if (nbr_synset_candidates_having_pos.numL(wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_term(synset) && wordnet_import_offline_tasks.NIL == wordnet_import.wni_hypernyms(synset) && (!pos.eql(wordnet_import_offline_tasks.$const17$Verb) || wordnet_import_offline_tasks.NIL == wordnet_import.wni_synset_is_causerP(synset))) {
                        nbr_synset_candidates_having_pos = Numbers.add(nbr_synset_candidates_having_pos, (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER);
                        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str33$__selected__A__, synset);
                        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                        synsets = (SubLObject)ConsesLow.cons(synset, synsets);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str10$_A_candidate_synsets__, Sequences.length(synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        list_var = synsets;
        _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str48$formatting_workflow_pages, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = (SubLObject)wordnet_import_offline_tasks.NIL;
                synset = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const20$WordNetSynsetImportStatus_ReadyFo, synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_stream$.currentBinding(thread);
                    try {
                        html_macros.$html_stream$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                        try {
                            html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                            cb_wordnet_import_concept_match.wni_concept_match_html(synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                            html_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                        }
                        finally {
                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    }
                    finally {
                        html_macros.$html_stream$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_string = string_utilities.string_substitute((SubLObject)wordnet_import_offline_tasks.$str34$__, (SubLObject)wordnet_import_offline_tasks.$str35$_, html_string, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    wordnet_import.wni_insert_concept_match_html(synset, html_string);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 13664L)
    public static SubLObject wni_verb_candidates_for_semtrans() {
        wordnet_import.wni_clear_function_caches();
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str50$gathering_lexification_candidate_);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        final SubLObject lexification_synsets = wordnet_import.wni_unlocked_synsets_with_status(wordnet_import_offline_tasks.$const51$WordNetSynsetImportStatus_ReadyFo);
        SubLObject lexification_verb_synsets = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject no_semtrans_synsets = (SubLObject)wordnet_import_offline_tasks.NIL;
        SubLObject direct_genls_semtrans_synsets = (SubLObject)wordnet_import_offline_tasks.NIL;
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str52$_A_candidate_synsets_for_lexifica, Sequences.length(lexification_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        SubLObject cdolist_list_var = lexification_synsets;
        SubLObject lexification_synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        lexification_synset = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            if (wordnet_import.wni_synset_pos(lexification_synset).eql(wordnet_import_offline_tasks.$const17$Verb)) {
                lexification_verb_synsets = (SubLObject)ConsesLow.cons(lexification_synset, lexification_verb_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lexification_synset = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str53$_A_verb_candidate_synsets_for_lex, Sequences.length(lexification_verb_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        cdolist_list_var = lexification_verb_synsets;
        SubLObject lexification_verb_synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        lexification_verb_synset = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            final SubLObject v_term = wordnet_import.wni_synset_term(lexification_verb_synset);
            if (wordnet_import_offline_tasks.NIL == wordnet_import.wni_term_has_verb_semtransP(v_term)) {
                no_semtrans_synsets = (SubLObject)ConsesLow.cons(lexification_verb_synset, no_semtrans_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lexification_verb_synset = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str54$_A_candidate_synsets_having_no_se, Sequences.length(no_semtrans_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        cdolist_list_var = no_semtrans_synsets;
        SubLObject no_semtrans_synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        no_semtrans_synset = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            final SubLObject v_term = wordnet_import.wni_synset_term(no_semtrans_synset);
            final SubLObject v_genls = genls.genls(v_term, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            SubLObject direct_genls_semtrans_synsetP = (SubLObject)wordnet_import_offline_tasks.NIL;
            SubLObject cdolist_list_var_$19 = v_genls;
            SubLObject genl = (SubLObject)wordnet_import_offline_tasks.NIL;
            genl = cdolist_list_var_$19.first();
            while (wordnet_import_offline_tasks.NIL != cdolist_list_var_$19) {
                if (wordnet_import_offline_tasks.NIL == direct_genls_semtrans_synsetP && !genl.eql(wordnet_import_offline_tasks.$const55$Individual) && wordnet_import_offline_tasks.NIL != wordnet_import.wni_term_has_verb_semtransP(genl)) {
                    direct_genls_semtrans_synsetP = (SubLObject)wordnet_import_offline_tasks.T;
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                genl = cdolist_list_var_$19.first();
            }
            if (wordnet_import_offline_tasks.NIL != direct_genls_semtrans_synsetP) {
                direct_genls_semtrans_synsets = (SubLObject)ConsesLow.cons(no_semtrans_synset, direct_genls_semtrans_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            no_semtrans_synset = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str56$_A_candidate_synsets_having_a_dir, Sequences.length(direct_genls_semtrans_synsets));
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str57$Making_workflow_status_assertions);
        streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
        cdolist_list_var = direct_genls_semtrans_synsets;
        SubLObject direct_genls_semtrans_synset = (SubLObject)wordnet_import_offline_tasks.NIL;
        direct_genls_semtrans_synset = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            wordnet_import.wni_unassert_import_status(wordnet_import_offline_tasks.$const51$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            wordnet_import.wni_assert_import_status(wordnet_import_offline_tasks.$const58$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            direct_genls_semtrans_synset = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 15980L)
    public static SubLObject wni_disjoint_genls_integrity_test() {
        SubLObject cdolist_list_var;
        final SubLObject mapped_terms = cdolist_list_var = wordnet_import.wni_mapped_terms();
        SubLObject mapped_term = (SubLObject)wordnet_import_offline_tasks.NIL;
        mapped_term = cdolist_list_var.first();
        while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
            final SubLObject v_genls = genls.genls(mapped_term, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            final SubLObject cols = ConsesLow.append((SubLObject)ConsesLow.list(mapped_term), v_genls);
            if (wordnet_import_offline_tasks.NIL != disjoint_with.any_disjoint_collection_pairP(cols, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
                PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str60$_A_has_disjoint_genls__A__, mapped_term, v_genls);
                streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_term = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 16458L)
    public static SubLObject wni_unasserting_redundant_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject mapped_terms = list_var = wordnet_import.wni_mapped_terms();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str62$Unasserting_redundant_genls, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject mapped_term = (SubLObject)wordnet_import_offline_tasks.NIL;
                mapped_term = csome_list_var.first();
                while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                    final SubLObject v_genls = genls.genls(mapped_term, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    final SubLObject min_cols = genls.min_cols(v_genls, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    SubLObject cdolist_list_var = v_genls;
                    SubLObject genl = (SubLObject)wordnet_import_offline_tasks.NIL;
                    genl = cdolist_list_var.first();
                    while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
                        if (wordnet_import_offline_tasks.NIL == subl_promotions.memberP(genl, min_cols, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
                            PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str63$_A_has_redundant_genls__A__, mapped_term, genl);
                            streams_high.force_output((SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                            wordnet_import.wni_unassert_genls(mapped_term, genl, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        genl = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    mapped_term = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 17007L)
    public static SubLObject wni_mark_existing_mapped_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapped_terms = wordnet_import.wni_mapped_terms();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(wordnet_import_offline_tasks.$const65$SteveReed, thread);
            api_control_vars.$ke_purpose$.bind(wordnet_import_offline_tasks.$const66$ResearchCycProject, thread);
            final SubLObject list_var = mapped_terms;
            final SubLObject _prev_bind_0_$21 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)wordnet_import_offline_tasks.$str67$marking_existing_mapped_terms, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import_offline_tasks.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject mapped_term = (SubLObject)wordnet_import_offline_tasks.NIL;
                    mapped_term = csome_list_var.first();
                    while (wordnet_import_offline_tasks.NIL != csome_list_var) {
                        if (wordnet_import_offline_tasks.NIL == isa.quoted_isaP(mapped_term, wordnet_import_offline_tasks.$const68$ResearchCycConstant, wordnet_import_offline_tasks.$const69$BookkeepingMt, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED) && wordnet_import_offline_tasks.NIL == isa.quoted_isaP(mapped_term, wordnet_import_offline_tasks.$const70$ScaffoldingConstant, wordnet_import_offline_tasks.$const69$BookkeepingMt, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
                            wordnet_import.wni_assert_quoted_isa_workflow_constant(mapped_term, (SubLObject)wordnet_import_offline_tasks.NIL);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import_offline_tasks.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        mapped_term = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$22, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$21, thread);
            }
        }
        finally {
            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 17782L)
    public static SubLObject wni_transcript_processing_1() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream_var = (SubLObject)wordnet_import_offline_tasks.NIL;
        try {
            final SubLObject out_stream;
            stream_var = (out_stream = StreamsLow.open((SubLObject)wordnet_import_offline_tasks.$str71$_home_reed_temp_new_transcript_1_, new SubLObject[] { wordnet_import_offline_tasks.$kw72$DIRECTION, wordnet_import_offline_tasks.$kw73$OUTPUT, wordnet_import_offline_tasks.$kw74$IF_DOES_NOT_EXIST, wordnet_import_offline_tasks.$kw75$CREATE, wordnet_import_offline_tasks.$kw76$IF_EXISTS, wordnet_import_offline_tasks.$kw77$OVERWRITE }));
            SubLObject assertion_lineP = (SubLObject)wordnet_import_offline_tasks.T;
            SubLObject print_timestamp_lineP = (SubLObject)wordnet_import_offline_tasks.NIL;
            SubLObject stream = (SubLObject)wordnet_import_offline_tasks.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)wordnet_import_offline_tasks.NIL, thread);
                    stream = compatibility.open_text((SubLObject)wordnet_import_offline_tasks.$str78$_home_reed_temp_new_transcript_ts, (SubLObject)wordnet_import_offline_tasks.$kw79$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)wordnet_import_offline_tasks.$str80$Unable_to_open__S, (SubLObject)wordnet_import_offline_tasks.$str78$_home_reed_temp_new_transcript_ts);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = (SubLObject)wordnet_import_offline_tasks.NIL, line = file_utilities.cdolines_get_next_line(infile); wordnet_import_offline_tasks.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        if (wordnet_import_offline_tasks.NIL != assertion_lineP) {
                            assertion_lineP = (SubLObject)wordnet_import_offline_tasks.NIL;
                            if (wordnet_import_offline_tasks.NIL != string_utilities.superstringP(line, (SubLObject)wordnet_import_offline_tasks.$str81$DeterminedIndividual, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED)) {
                                print_high.princ(line, out_stream);
                                streams_high.terpri(out_stream);
                                print_timestamp_lineP = (SubLObject)wordnet_import_offline_tasks.T;
                            }
                        }
                        else {
                            assertion_lineP = (SubLObject)wordnet_import_offline_tasks.T;
                            if (wordnet_import_offline_tasks.NIL != print_timestamp_lineP) {
                                print_high.princ(line, out_stream);
                                streams_high.terpri(out_stream);
                            }
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import_offline_tasks.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (wordnet_import_offline_tasks.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)wordnet_import_offline_tasks.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 18586L)
    public static SubLObject wni_emit_mock_up_table(final SubLObject event_col, final SubLObject fullP) {
        assert wordnet_import_offline_tasks.NIL != forts.fort_p(event_col) : event_col;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(fullP) : fullP;
        final SubLObject wni_role_infos = wordnet_import.wni_gather_roles_and_traits(event_col);
        SubLObject highlightP = (SubLObject)wordnet_import_offline_tasks.T;
        if (wordnet_import_offline_tasks.NIL != fullP) {
            SubLObject cdolist_list_var = wni_role_infos;
            SubLObject wni_role_info = (SubLObject)wordnet_import_offline_tasks.NIL;
            wni_role_info = cdolist_list_var.first();
            while (wordnet_import_offline_tasks.NIL != cdolist_list_var) {
                wni_emit_mock_up_row_full(wni_role_info, highlightP);
                highlightP = (SubLObject)SubLObjectFactory.makeBoolean(wordnet_import_offline_tasks.NIL == highlightP);
                cdolist_list_var = cdolist_list_var.rest();
                wni_role_info = cdolist_list_var.first();
            }
        }
        else {
            SubLObject status = (SubLObject)wordnet_import_offline_tasks.NIL;
            SubLObject cdolist_list_var2 = wni_role_infos;
            SubLObject wni_role_info2 = (SubLObject)wordnet_import_offline_tasks.NIL;
            wni_role_info2 = cdolist_list_var2.first();
            while (wordnet_import_offline_tasks.NIL != cdolist_list_var2) {
                status = wordnet_import.wni_subsumption_status(wni_role_info2);
                if (wordnet_import_offline_tasks.NIL == status) {
                    wni_emit_mock_up_row_brief(wni_role_info2, highlightP);
                    highlightP = (SubLObject)SubLObjectFactory.makeBoolean(wordnet_import_offline_tasks.NIL == highlightP);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                wni_role_info2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 19520L)
    public static SubLObject wni_emit_mock_up_row_brief(final SubLObject wni_role_info, final SubLObject highlightP) {
        assert wordnet_import_offline_tasks.NIL != wordnet_import.wni_role_info_p(wni_role_info) : wni_role_info;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(highlightP) : highlightP;
        final SubLObject bgcolor = (SubLObject)((wordnet_import_offline_tasks.NIL != highlightP) ? wordnet_import_offline_tasks.$str83$_bgcolor__wheat_ : wordnet_import_offline_tasks.$str84$);
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str85$_____A, Sequences.cconcatenate((SubLObject)wordnet_import_offline_tasks.$str86$_tr, new SubLObject[] { bgcolor, wordnet_import_offline_tasks.$str87$__td__img_src__yellow_gif__alt___, cb_utilities.cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), wordnet_import_offline_tasks.$str88$__a___td__td__a_href__cg_wns_edit, cb_utilities.cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), wordnet_import_offline_tasks.$str88$__a___td__td__a_href__cg_wns_edit, cb_utilities.cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), wordnet_import_offline_tasks.$str89$__a___td__td__img_src__yellow_gif, cb_utilities.cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), wordnet_import_offline_tasks.$str90$__a___td__td__input_type__checkbo, cb_utilities.cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), wordnet_import_offline_tasks.$str91$_, cb_utilities.cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), wordnet_import_offline_tasks.$str92$____td___tr_ }));
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import-offline-tasks.lisp", position = 20718L)
    public static SubLObject wni_emit_mock_up_row_full(final SubLObject wni_role_info, final SubLObject highlightP) {
        assert wordnet_import_offline_tasks.NIL != wordnet_import.wni_role_info_p(wni_role_info) : wni_role_info;
        assert wordnet_import_offline_tasks.NIL != Types.booleanp(highlightP) : highlightP;
        SubLObject status_desc = (SubLObject)wordnet_import_offline_tasks.NIL;
        final SubLObject bgcolor = (SubLObject)((wordnet_import_offline_tasks.NIL != highlightP) ? wordnet_import_offline_tasks.$str83$_bgcolor__wheat_ : wordnet_import_offline_tasks.$str84$);
        if (wordnet_import_offline_tasks.NIL != wordnet_import.wni_subsumption_status(wni_role_info)) {
            if (wordnet_import.wni_subsumption_status(wni_role_info) == wordnet_import_offline_tasks.T) {
                status_desc = (SubLObject)wordnet_import_offline_tasks.$str93$redundant;
            }
            else {
                status_desc = Sequences.cconcatenate((SubLObject)wordnet_import_offline_tasks.$str94$subsumes__a_href__cg_wns_edit_amp, new SubLObject[] { cb_utilities.cb_fort_display_string(wordnet_import.wni_subsumption_status(wni_role_info)), wordnet_import_offline_tasks.$str95$__a_ });
            }
        }
        else {
            status_desc = (SubLObject)wordnet_import_offline_tasks.$str91$_;
        }
        PrintLow.format((SubLObject)wordnet_import_offline_tasks.T, (SubLObject)wordnet_import_offline_tasks.$str85$_____A, Sequences.cconcatenate((SubLObject)wordnet_import_offline_tasks.$str86$_tr, new SubLObject[] { bgcolor, wordnet_import_offline_tasks.$str96$__td__img_src__yellow_gif__alt___, cb_utilities.cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), wordnet_import_offline_tasks.$str97$__a___td___td__a_href__cg_wns_edi, cb_utilities.cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), wordnet_import_offline_tasks.$str97$__a___td___td__a_href__cg_wns_edi, cb_utilities.cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), wordnet_import_offline_tasks.$str98$__a___td___td__img_src__yellow_gi, cb_utilities.cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), wordnet_import_offline_tasks.$str99$__a___td___td_, status_desc, wordnet_import_offline_tasks.$str100$__td___td__input_type__checkbox__, cb_utilities.cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), wordnet_import_offline_tasks.$str91$_, cb_utilities.cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), wordnet_import_offline_tasks.$str101$____td____tr_ }));
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    public static SubLObject declare_wordnet_import_offline_tasks_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_set_max_nbr_synset_candidates_having_pos", "WNI-SET-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_candidates_for_exact_matching", "WNI-CANDIDATES-FOR-EXACT-MATCHING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_candidates_for_exact_matching_helper", "WNI-CANDIDATES-FOR-EXACT-MATCHING-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_verbs_with_related_nouns_for_matching", "WNI-VERBS-WITH-RELATED-NOUNS-FOR-MATCHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_candidates_for_matching", "WNI-CANDIDATES-FOR-MATCHING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_refresh_concept_match_html_cache", "WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_list_glosses_for_event_synsets", "WNI-LIST-GLOSSES-FOR-EVENT-SYNSETS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_unmapped_hypernyms_of_individuals", "WNI-UNMAPPED-HYPERNYMS-OF-INDIVIDUALS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_topmost_unmapped_verbs_for_matching", "WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_verb_candidates_for_semtrans", "WNI-VERB-CANDIDATES-FOR-SEMTRANS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_disjoint_genls_integrity_test", "WNI-DISJOINT-GENLS-INTEGRITY-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_unasserting_redundant_genls", "WNI-UNASSERTING-REDUNDANT-GENLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_mark_existing_mapped_terms", "WNI-MARK-EXISTING-MAPPED-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_transcript_processing_1", "WNI-TRANSCRIPT-PROCESSING-1", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_emit_mock_up_table", "WNI-EMIT-MOCK-UP-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_emit_mock_up_row_brief", "WNI-EMIT-MOCK-UP-ROW-BRIEF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks", "wni_emit_mock_up_row_full", "WNI-EMIT-MOCK-UP-ROW-FULL", 2, 0, false);
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    public static SubLObject init_wordnet_import_offline_tasks_file() {
        wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$ = SubLFiles.defparameter("*WNI-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS*", (SubLObject)wordnet_import_offline_tasks.$int0$100);
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    public static SubLObject setup_wordnet_import_offline_tasks_file() {
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym1$WNI_SET_MAX_NBR_SYNSET_CANDIDATES_HAVING_POS);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym3$WNI_CANDIDATES_FOR_EXACT_MATCHING);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym24$WNI_VERBS_WITH_RELATED_NOUNS_FOR_MATCHING);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym25$WNI_CANDIDATES_FOR_MATCHING);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym37$WNI_REFRESH_CONCEPT_MATCH_HTML_CACHE);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym43$WNI_UNMAPPED_HYPERNYMS_OF_INDIVIDUALS);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym46$WNI_TOPMOST_UNMAPPED_VERBS_FOR_MATCHING);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym49$WNI_VERB_CANDIDATES_FOR_SEMTRANS);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym59$WNI_DISJOINT_GENLS_INTEGRITY_TEST);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym61$WNI_UNASSERTING_REDUNDANT_GENLS);
        access_macros.register_external_symbol((SubLObject)wordnet_import_offline_tasks.$sym64$WNI_MARK_EXISTING_MAPPED_TERMS);
        return (SubLObject)wordnet_import_offline_tasks.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wordnet_import_offline_tasks_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wordnet_import_offline_tasks_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wordnet_import_offline_tasks_file();
    }
    
    static {
        me = (SubLFile)new wordnet_import_offline_tasks();
        wordnet_import_offline_tasks.$wni_max_nbr_synset_candidates_having_pos$ = null;
        $int0$100 = SubLObjectFactory.makeInteger(100);
        $sym1$WNI_SET_MAX_NBR_SYNSET_CANDIDATES_HAVING_POS = SubLObjectFactory.makeSymbol("WNI-SET-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS");
        $sym2$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym3$WNI_CANDIDATES_FOR_EXACT_MATCHING = SubLObjectFactory.makeSymbol("WNI-CANDIDATES-FOR-EXACT-MATCHING");
        $sym4$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym5$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym6$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $const7$WordNet2_0_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet2_0-KS"));
        $str8$WordNet2_0_KS_must_be_registered = SubLObjectFactory.makeString("WordNet2_0-KS must be registered");
        $str9$gathering_synsets__ = SubLObjectFactory.makeString("gathering synsets~%");
        $str10$_A_candidate_synsets__ = SubLObjectFactory.makeString("~A candidate synsets~%");
        $const11$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $str12$_A_individual_synsets__ = SubLObjectFactory.makeString("~A individual synsets~%");
        $str13$_A_individual_candidate_synsets__ = SubLObjectFactory.makeString("~A individual candidate synsets~%");
        $str14$_A_collection_candidate_synsets__ = SubLObjectFactory.makeString("~A collection candidate synsets~%");
        $str15$_A_candidate_synsets_after_applyi = SubLObjectFactory.makeString("~A candidate-synsets after applying limit~%~%");
        $str16$_A_collection_candidate_synsets_e = SubLObjectFactory.makeString("~A collection candidate synsets excluding #$Situations~%");
        $const17$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $str18$finding_exact_match_sysets = SubLObjectFactory.makeString("finding exact match sysets");
        $str19$cdolist = SubLObjectFactory.makeString("cdolist");
        $const20$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-ReadyForPossibleMatching"));
        $sym21$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym22$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $str23$invalid_synset_pair___A__ = SubLObjectFactory.makeString("invalid synset-pair: ~A~%");
        $sym24$WNI_VERBS_WITH_RELATED_NOUNS_FOR_MATCHING = SubLObjectFactory.makeSymbol("WNI-VERBS-WITH-RELATED-NOUNS-FOR-MATCHING");
        $sym25$WNI_CANDIDATES_FOR_MATCHING = SubLObjectFactory.makeSymbol("WNI-CANDIDATES-FOR-MATCHING");
        $str26$verbs_with_related_situation_noun = SubLObjectFactory.makeString("verbs-with-related-situation-nouns? and individuals? are mutually exclusive parameters");
        $str27$clearing_cached_html_for_cyc_imag = SubLObjectFactory.makeString("clearing cached html for cyc image: ~A~%");
        $str28$gathering__A_synsets__ = SubLObjectFactory.makeString("gathering ~A synsets~%");
        $str29$finding_verbs_with_mapped_hyperny = SubLObjectFactory.makeString("finding verbs with mapped hypernyms and related noun forms");
        $str30$finding_mapped_hypernyms = SubLObjectFactory.makeString("finding mapped hypernyms");
        $str31$gathered__A__A_synsets__ = SubLObjectFactory.makeString("gathered ~A ~A synsets~%");
        $sym32$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str33$__selected__A__ = SubLObjectFactory.makeString("~%selected ~A~%");
        $str34$__ = SubLObjectFactory.makeString("\\\\");
        $str35$_ = SubLObjectFactory.makeString("\\");
        $str36$__error___A__ = SubLObjectFactory.makeString("~%error: ~A~%");
        $sym37$WNI_REFRESH_CONCEPT_MATCH_HTML_CACHE = SubLObjectFactory.makeSymbol("WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE");
        $str38$gathering_candidate_synsets__ = SubLObjectFactory.makeString("gathering candidate synsets~%");
        $str39$gathered__A_synsets__ = SubLObjectFactory.makeString("gathered ~A synsets~%");
        $str40$caching_concept_match_html = SubLObjectFactory.makeString("caching concept-match html");
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(115839));
        $str42$_A__ = SubLObjectFactory.makeString("~A~%");
        $sym43$WNI_UNMAPPED_HYPERNYMS_OF_INDIVIDUALS = SubLObjectFactory.makeSymbol("WNI-UNMAPPED-HYPERNYMS-OF-INDIVIDUALS");
        $str44$gathering_individuals__ = SubLObjectFactory.makeString("gathering individuals~%");
        $str45$finding_unmapped_hypernyms_of_ind = SubLObjectFactory.makeString("finding unmapped hypernyms of individuals");
        $sym46$WNI_TOPMOST_UNMAPPED_VERBS_FOR_MATCHING = SubLObjectFactory.makeSymbol("WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING");
        $str47$finding_topmost_unmapped_verbs = SubLObjectFactory.makeString("finding topmost unmapped verbs");
        $str48$formatting_workflow_pages = SubLObjectFactory.makeString("formatting workflow pages");
        $sym49$WNI_VERB_CANDIDATES_FOR_SEMTRANS = SubLObjectFactory.makeSymbol("WNI-VERB-CANDIDATES-FOR-SEMTRANS");
        $str50$gathering_lexification_candidate_ = SubLObjectFactory.makeString("gathering lexification candidate synsets~%");
        $const51$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-ReadyForLexification"));
        $str52$_A_candidate_synsets_for_lexifica = SubLObjectFactory.makeString("~A candidate synsets for lexification~%");
        $str53$_A_verb_candidate_synsets_for_lex = SubLObjectFactory.makeString("~A verb candidate synsets for lexification~%");
        $str54$_A_candidate_synsets_having_no_se = SubLObjectFactory.makeString("~A candidate synsets having no semtrans assertion~%");
        $const55$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $str56$_A_candidate_synsets_having_a_dir = SubLObjectFactory.makeString("~A candidate synsets having a direct genls with a semtrans assertion~%");
        $str57$Making_workflow_status_assertions = SubLObjectFactory.makeString("Making workflow status assertions~%");
        $const58$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-ReadyForVerbSemtrans"));
        $sym59$WNI_DISJOINT_GENLS_INTEGRITY_TEST = SubLObjectFactory.makeSymbol("WNI-DISJOINT-GENLS-INTEGRITY-TEST");
        $str60$_A_has_disjoint_genls__A__ = SubLObjectFactory.makeString("~A has disjoint genls ~A~%");
        $sym61$WNI_UNASSERTING_REDUNDANT_GENLS = SubLObjectFactory.makeSymbol("WNI-UNASSERTING-REDUNDANT-GENLS");
        $str62$Unasserting_redundant_genls = SubLObjectFactory.makeString("Unasserting redundant genls");
        $str63$_A_has_redundant_genls__A__ = SubLObjectFactory.makeString("~A has redundant genls ~A~%");
        $sym64$WNI_MARK_EXISTING_MAPPED_TERMS = SubLObjectFactory.makeSymbol("WNI-MARK-EXISTING-MAPPED-TERMS");
        $const65$SteveReed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SteveReed"));
        $const66$ResearchCycProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycProject"));
        $str67$marking_existing_mapped_terms = SubLObjectFactory.makeString("marking existing mapped terms");
        $const68$ResearchCycConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $const69$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $const70$ScaffoldingConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScaffoldingConstant"));
        $str71$_home_reed_temp_new_transcript_1_ = SubLObjectFactory.makeString("/home/reed/temp/new-transcript-1.ts");
        $kw72$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw73$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw74$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw75$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw76$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
        $kw77$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
        $str78$_home_reed_temp_new_transcript_ts = SubLObjectFactory.makeString("/home/reed/temp/new-transcript.ts");
        $kw79$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str80$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str81$DeterminedIndividual = SubLObjectFactory.makeString("DeterminedIndividual");
        $sym82$WNI_ROLE_INFO_P = SubLObjectFactory.makeSymbol("WNI-ROLE-INFO-P");
        $str83$_bgcolor__wheat_ = SubLObjectFactory.makeString(" bgcolor=\"wheat\"");
        $str84$ = SubLObjectFactory.makeString("");
        $str85$_____A = SubLObjectFactory.makeString("~%~%~A");
        $str86$_tr = SubLObjectFactory.makeString("<tr");
        $str87$__td__img_src__yellow_gif__alt___ = SubLObjectFactory.makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><ahref=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str88$__a___td__td__a_href__cg_wns_edit = SubLObjectFactory.makeString("</a></td><td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str89$__a___td__td__img_src__yellow_gif = SubLObjectFactory.makeString("</a></td><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str90$__a___td__td__input_type__checkbo = SubLObjectFactory.makeString("</a></td><td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"value=\"");
        $str91$_ = SubLObjectFactory.makeString(" ");
        $str92$____td___tr_ = SubLObjectFactory.makeString("\"></td></tr>");
        $str93$redundant = SubLObjectFactory.makeString("redundant");
        $str94$subsumes__a_href__cg_wns_edit_amp = SubLObjectFactory.makeString("subsumes <a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str95$__a_ = SubLObjectFactory.makeString("</a>");
        $str96$__td__img_src__yellow_gif__alt___ = SubLObjectFactory.makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str97$__a___td___td__a_href__cg_wns_edi = SubLObjectFactory.makeString("</a></td>\n<td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str98$__a___td___td__img_src__yellow_gi = SubLObjectFactory.makeString("</a></td>\n<td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");
        $str99$__a___td___td_ = SubLObjectFactory.makeString("</a></td>\n<td>");
        $str100$__td___td__input_type__checkbox__ = SubLObjectFactory.makeString("</td>\n<td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"\nvalue=\"");
        $str101$____td____tr_ = SubLObjectFactory.makeString("\"></td>\n</tr>");
    }
}

/*

	Total time: 563 ms
	 synthetic 
*/