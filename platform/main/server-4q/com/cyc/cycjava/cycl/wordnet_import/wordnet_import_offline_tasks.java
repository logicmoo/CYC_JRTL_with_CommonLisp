/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.narts_high.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WORDNET-IMPORT-OFFLINE-TASKS
 * source file: /cyc/top/cycl/wordnet-import/wordnet-import-offline-tasks.lisp
 * created:     2019/07/03 17:38:13
 */
public final class wordnet_import_offline_tasks extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt83$ = makeString("");

    public static final SubLFile me = new wordnet_import_offline_tasks();

 public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks";


    // defparameter
    // Definitions
    /**
     * the number of synset candidates selected by speech part for subsequent
     * filtering
     */
    @LispMethod(comment = "the number of synset candidates selected by speech part for subsequent\r\nfiltering\ndefparameter\nthe number of synset candidates selected by speech part for subsequent\nfiltering")
    public static final SubLSymbol $wni_max_nbr_synset_candidates_having_pos$ = makeSymbol("*WNI-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS*");

    private static final SubLSymbol WNI_SET_MAX_NBR_SYNSET_CANDIDATES_HAVING_POS = makeSymbol("WNI-SET-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS");

    private static final SubLSymbol WNI_CANDIDATES_FOR_EXACT_MATCHING = makeSymbol("WNI-CANDIDATES-FOR-EXACT-MATCHING");

    private static final SubLObject $const7$WordNet2_0_KS = reader_make_constant_shell("WordNet2_0-KS");

    static private final SubLString $str8$WordNet2_0_KS_must_be_registered = makeString("WordNet2_0-KS must be registered");

    static private final SubLString $str9$gathering_synsets__ = makeString("gathering synsets~%");

    static private final SubLString $str10$_A_candidate_synsets__ = makeString("~A candidate synsets~%");



    static private final SubLString $str12$_A_individual_synsets__ = makeString("~A individual synsets~%");

    static private final SubLString $str13$_A_individual_candidate_synsets__ = makeString("~A individual candidate synsets~%");

    static private final SubLString $str14$_A_collection_candidate_synsets__ = makeString("~A collection candidate synsets~%");

    static private final SubLString $str15$_A_candidate_synsets_after_applyi = makeString("~A candidate-synsets after applying limit~%~%");

    static private final SubLString $str16$_A_collection_candidate_synsets_e = makeString("~A collection candidate synsets excluding #$Situations~%");



    static private final SubLString $$$finding_exact_match_sysets = makeString("finding exact match sysets");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLObject $const20$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForPossibleMatching");

    private static final SubLString $str23$invalid_synset_pair___A__ = makeString("invalid synset-pair: ~A~%");

    private static final SubLSymbol WNI_VERBS_WITH_RELATED_NOUNS_FOR_MATCHING = makeSymbol("WNI-VERBS-WITH-RELATED-NOUNS-FOR-MATCHING");

    private static final SubLSymbol WNI_CANDIDATES_FOR_MATCHING = makeSymbol("WNI-CANDIDATES-FOR-MATCHING");

    private static final SubLString $str26$verbs_with_related_situation_noun = makeString("verbs-with-related-situation-nouns? and individuals? are mutually exclusive parameters");

    private static final SubLString $str27$clearing_cached_html_for_cyc_imag = makeString("clearing cached html for cyc image: ~A~%");

    private static final SubLString $str28$gathering__A_synsets__ = makeString("gathering ~A synsets~%");

    private static final SubLString $str29$finding_verbs_with_mapped_hyperny = makeString("finding verbs with mapped hypernyms and related noun forms");

    private static final SubLString $$$finding_mapped_hypernyms = makeString("finding mapped hypernyms");

    private static final SubLString $str31$gathered__A__A_synsets__ = makeString("gathered ~A ~A synsets~%");

    private static final SubLString $str33$__selected__A__ = makeString("~%selected ~A~%");

    private static final SubLString $str34$__ = makeString("\\\\");

    private static final SubLString $str35$_ = makeString("\\");

    private static final SubLString $str36$__error___A__ = makeString("~%error: ~A~%");

    private static final SubLSymbol WNI_REFRESH_CONCEPT_MATCH_HTML_CACHE = makeSymbol("WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE");

    private static final SubLString $str38$gathering_candidate_synsets__ = makeString("gathering candidate synsets~%");

    private static final SubLString $str39$gathered__A_synsets__ = makeString("gathered ~A synsets~%");

    private static final SubLString $str40$caching_concept_match_html = makeString("caching concept-match html");

    private static final SubLList $list41 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(115839));

    private static final SubLString $str42$_A__ = makeString("~A~%");

    private static final SubLSymbol WNI_UNMAPPED_HYPERNYMS_OF_INDIVIDUALS = makeSymbol("WNI-UNMAPPED-HYPERNYMS-OF-INDIVIDUALS");

    private static final SubLString $str44$gathering_individuals__ = makeString("gathering individuals~%");

    private static final SubLString $str45$finding_unmapped_hypernyms_of_ind = makeString("finding unmapped hypernyms of individuals");

    private static final SubLSymbol WNI_TOPMOST_UNMAPPED_VERBS_FOR_MATCHING = makeSymbol("WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING");

    private static final SubLString $$$finding_topmost_unmapped_verbs = makeString("finding topmost unmapped verbs");

    private static final SubLString $$$formatting_workflow_pages = makeString("formatting workflow pages");

    private static final SubLSymbol WNI_VERB_CANDIDATES_FOR_SEMTRANS = makeSymbol("WNI-VERB-CANDIDATES-FOR-SEMTRANS");

    private static final SubLString $str50$gathering_lexification_candidate_ = makeString("gathering lexification candidate synsets~%");

    private static final SubLObject $const51$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForLexification");

    private static final SubLString $str52$_A_candidate_synsets_for_lexifica = makeString("~A candidate synsets for lexification~%");

    private static final SubLString $str53$_A_verb_candidate_synsets_for_lex = makeString("~A verb candidate synsets for lexification~%");

    private static final SubLString $str54$_A_candidate_synsets_having_no_se = makeString("~A candidate synsets having no semtrans assertion~%");



    private static final SubLString $str56$_A_candidate_synsets_having_a_dir = makeString("~A candidate synsets having a direct genls with a semtrans assertion~%");

    private static final SubLString $str57$Making_workflow_status_assertions = makeString("Making workflow status assertions~%");

    private static final SubLObject $const58$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForVerbSemtrans");

    private static final SubLSymbol WNI_DISJOINT_GENLS_INTEGRITY_TEST = makeSymbol("WNI-DISJOINT-GENLS-INTEGRITY-TEST");

    private static final SubLString $str60$_A_has_disjoint_genls__A__ = makeString("~A has disjoint genls ~A~%");

    private static final SubLSymbol WNI_UNASSERTING_REDUNDANT_GENLS = makeSymbol("WNI-UNASSERTING-REDUNDANT-GENLS");

    private static final SubLString $$$Unasserting_redundant_genls = makeString("Unasserting redundant genls");

    private static final SubLString $str63$_A_has_redundant_genls__A__ = makeString("~A has redundant genls ~A~%");

    private static final SubLSymbol WNI_MARK_EXISTING_MAPPED_TERMS = makeSymbol("WNI-MARK-EXISTING-MAPPED-TERMS");





    private static final SubLString $$$marking_existing_mapped_terms = makeString("marking existing mapped terms");







    private static final SubLString $str71$_home_reed_temp_new_transcript_1_ = makeString("/home/reed/temp/new-transcript-1.ts");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLString $str78$_home_reed_temp_new_transcript_ts = makeString("/home/reed/temp/new-transcript.ts");

    private static final SubLString $str80$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$DeterminedIndividual = makeString("DeterminedIndividual");

    private static final SubLSymbol WNI_ROLE_INFO_P = makeSymbol("WNI-ROLE-INFO-P");

    private static final SubLString $str83$_bgcolor__wheat_ = makeString(" bgcolor=\"wheat\"");

    private static final SubLString $str84$ = makeString("");

    private static final SubLString $str85$_____A = makeString("~%~%~A");

    private static final SubLString $str86$_tr = makeString("<tr");

    private static final SubLString $str87$__td__img_src__yellow_gif__alt___ = makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><ahref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str88$__a___td__td__a_href__cg_wns_edit = makeString("</a></td><td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str89$__a___td__td__img_src__yellow_gif = makeString("</a></td><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str90$__a___td__td__input_type__checkbo = makeString("</a></td><td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"value=\"");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str92$____td___tr_ = makeString("\"></td></tr>");

    private static final SubLString $$$redundant = makeString("redundant");

    private static final SubLString $str94$subsumes__a_href__cg_wns_edit_amp = makeString("subsumes <a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str95$__a_ = makeString("</a>");

    private static final SubLString $str96$__td__img_src__yellow_gif__alt___ = makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str97$__a___td___td__a_href__cg_wns_edi = makeString("</a></td>\n<td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str98$__a___td___td__img_src__yellow_gi = makeString("</a></td>\n<td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    private static final SubLString $str99$__a___td___td_ = makeString("</a></td>\n<td>");

    private static final SubLString $str100$__td___td__input_type__checkbox__ = makeString("</td>\n<td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"\nvalue=\"");

    private static final SubLString $str101$____td____tr_ = makeString("\"></td>\n</tr>");

    public static final SubLObject wni_set_max_nbr_synset_candidates_having_pos_alt(SubLObject nbr) {
        SubLTrampolineFile.checkType(nbr, INTEGERP);
        $wni_max_nbr_synset_candidates_having_pos$.setDynamicValue(nbr);
        return NIL;
    }

    public static SubLObject wni_set_max_nbr_synset_candidates_having_pos(final SubLObject nbr) {
        assert NIL != integerp(nbr) : "! integerp(nbr) " + ("Types.integerp(nbr) " + "CommonSymbols.NIL != Types.integerp(nbr) ") + nbr;
        $wni_max_nbr_synset_candidates_having_pos$.setDynamicValue(nbr);
        return NIL;
    }

    /**
     * Finds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?
     * indicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only
     * Individuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are
     * selected, specs of #$Situation are excluded.
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @param only-individuals?
     * 		; booleanp
     * @param situation-nouns?
     * 		; booleanp
     * @param restart-synset
     * 		; naut-p
     */
    @LispMethod(comment = "Finds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?\r\nindicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only\r\nIndividuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are\r\nselected, specs of #$Situation are excluded.\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@param only-individuals?\r\n\t\t; booleanp\r\n@param situation-nouns?\r\n\t\t; booleanp\r\n@param restart-synset\r\n\t\t; naut-p\nFinds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?\nindicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only\nIndividuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are\nselected, specs of #$Situation are excluded.")
    public static final SubLObject wni_candidates_for_exact_matching_alt(SubLObject pos, SubLObject only_individualsP, SubLObject situation_nounsP, SubLObject restart_synset) {
        if (only_individualsP == UNPROVIDED) {
            only_individualsP = NIL;
        }
        if (situation_nounsP == UNPROVIDED) {
            situation_nounsP = NIL;
        }
        if (restart_synset == UNPROVIDED) {
            restart_synset = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pos, FORT_P);
            SubLTrampolineFile.checkType(only_individualsP, BOOLEANP);
            SubLTrampolineFile.checkType(situation_nounsP, BOOLEANP);
            if (NIL != restart_synset) {
                SubLTrampolineFile.checkType(restart_synset, NAUT_P);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED)) {
                    Errors.error($str_alt8$WordNet2_0_KS_must_be_registered);
                }
            }
            format(T, $str_alt9$gathering_synsets__);
            force_output(UNPROVIDED);
            {
                SubLObject candidate_synsets = wordnet_import.wni_unmapped_synsets_having_mapped_hypernym(pos);
                SubLObject found_restartP = NIL;
                format(T, $str_alt10$_A_candidate_synsets__, length(candidate_synsets));
                force_output(UNPROVIDED);
                if (pos == $$Noun) {
                    {
                        SubLObject synset_individuals = wordnet_import.wni_synset_individuals();
                        format(T, $str_alt12$_A_individual_synsets__, length(synset_individuals));
                        force_output(UNPROVIDED);
                        if (NIL != only_individualsP) {
                            candidate_synsets = keyhash_utilities.fast_intersection(candidate_synsets, synset_individuals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            format(T, $str_alt13$_A_individual_candidate_synsets__, length(candidate_synsets));
                            force_output(UNPROVIDED);
                        } else {
                            if (NIL != situation_nounsP) {
                                candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, synset_individuals, EQUAL);
                                format(T, $str_alt14$_A_collection_candidate_synsets__, length(candidate_synsets));
                                force_output(UNPROVIDED);
                            } else {
                                if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                                    candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                                }
                                format(T, $str_alt15$_A_candidate_synsets_after_applyi, length(candidate_synsets));
                                force_output(UNPROVIDED);
                                candidate_synsets = wordnet_import.wni_exclude_situations(candidate_synsets);
                                format(T, $str_alt16$_A_collection_candidate_synsets_e, length(candidate_synsets));
                                force_output(UNPROVIDED);
                            }
                        }
                    }
                } else {
                    if (pos == $$Verb) {
                        if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                            candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                        }
                        candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, wordnet_import.wni_exclude_situations(candidate_synsets), EQUAL);
                    }
                }
                if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                    candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                }
                format(T, $str_alt15$_A_candidate_synsets_after_applyi, length(candidate_synsets));
                force_output(UNPROVIDED);
                candidate_synsets = wordnet_import.wni_exclude_relations(candidate_synsets);
                candidate_synsets = wordnet_import.wni_exclude_skipped(candidate_synsets);
                {
                    SubLObject list_var = candidate_synsets;
                    $progress_note$.setDynamicValue($$$finding_exact_match_sysets, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject synset = NIL;
                                for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if ((NIL != restart_synset) && (NIL == found_restartP)) {
                                        if (synset.equal(restart_synset)) {
                                            found_restartP = T;
                                            {
                                                SubLObject synset_pairs = com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks.wni_candidates_for_exact_matching_helper(synset);
                                                SubLObject cdolist_list_var = synset_pairs;
                                                SubLObject synset_pair = NIL;
                                                for (synset_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject synset_1 = synset_pair.first();
                                                        SubLObject v_term = second(synset_pair);
                                                        wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_1, UNPROVIDED);
                                                        wordnet_import.wni_assert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, synset_1, UNPROVIDED);
                                                        force_output(UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject synset_pairs = com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks.wni_candidates_for_exact_matching_helper(synset);
                                            SubLObject cdolist_list_var = synset_pairs;
                                            SubLObject synset_pair = NIL;
                                            for (synset_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_pair = cdolist_list_var.first()) {
                                                {
                                                    SubLObject synset_2 = synset_pair.first();
                                                    SubLObject v_term = second(synset_pair);
                                                    wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_2, UNPROVIDED);
                                                    wordnet_import.wni_assert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, synset_2, UNPROVIDED);
                                                    force_output(UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Finds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?
     * indicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only
     * Individuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are
     * selected, specs of #$Situation are excluded.
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @param only-individuals?
     * 		; booleanp
     * @param situation-nouns?
     * 		; booleanp
     * @param restart-synset
     * 		; naut-p
     */
    @LispMethod(comment = "Finds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?\r\nindicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only\r\nIndividuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are\r\nselected, specs of #$Situation are excluded.\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@param only-individuals?\r\n\t\t; booleanp\r\n@param situation-nouns?\r\n\t\t; booleanp\r\n@param restart-synset\r\n\t\t; naut-p\nFinds and performs status assertions for synsets that are candidates for exact matching. ONLY-INDIVIDUALS?\nindicates whether the noun synset candidates are restricted to #$Individuals.  When T, select only\nIndividuals, otherwise for nouns select only Collections.  SITUATION-NOUNS? indicates that when nouns are\nselected, specs of #$Situation are excluded.")
    public static SubLObject wni_candidates_for_exact_matching(final SubLObject pos, SubLObject only_individualsP, SubLObject situation_nounsP, SubLObject restart_synset) {
        if (only_individualsP == UNPROVIDED) {
            only_individualsP = NIL;
        }
        if (situation_nounsP == UNPROVIDED) {
            situation_nounsP = NIL;
        }
        if (restart_synset == UNPROVIDED) {
            restart_synset = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(only_individualsP) : "! booleanp(only_individualsP) " + ("Types.booleanp(only_individualsP) " + "CommonSymbols.NIL != Types.booleanp(only_individualsP) ") + only_individualsP;
        assert NIL != booleanp(situation_nounsP) : "! booleanp(situation_nounsP) " + ("Types.booleanp(situation_nounsP) " + "CommonSymbols.NIL != Types.booleanp(situation_nounsP) ") + situation_nounsP;
        if (((NIL != restart_synset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == narts_high.naut_p(restart_synset))) {
            throw new AssertionError(restart_synset);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED))) {
            Errors.error($str8$WordNet2_0_KS_must_be_registered);
        }
        format(T, $str9$gathering_synsets__);
        force_output(UNPROVIDED);
        SubLObject candidate_synsets = wordnet_import.wni_unmapped_synsets_having_mapped_hypernym(pos);
        SubLObject found_restartP = NIL;
        format(T, $str10$_A_candidate_synsets__, length(candidate_synsets));
        force_output(UNPROVIDED);
        if (pos.eql($$Noun)) {
            final SubLObject synset_individuals = wordnet_import.wni_synset_individuals();
            format(T, $str12$_A_individual_synsets__, length(synset_individuals));
            force_output(UNPROVIDED);
            if (NIL != only_individualsP) {
                candidate_synsets = keyhash_utilities.fast_intersection(candidate_synsets, synset_individuals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format(T, $str13$_A_individual_candidate_synsets__, length(candidate_synsets));
                force_output(UNPROVIDED);
            } else
                if (NIL != situation_nounsP) {
                    candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, synset_individuals, EQUAL);
                    format(T, $str14$_A_collection_candidate_synsets__, length(candidate_synsets));
                    force_output(UNPROVIDED);
                } else {
                    if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                        candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                    }
                    format(T, $str15$_A_candidate_synsets_after_applyi, length(candidate_synsets));
                    force_output(UNPROVIDED);
                    candidate_synsets = wordnet_import.wni_exclude_situations(candidate_synsets);
                    format(T, $str16$_A_collection_candidate_synsets_e, length(candidate_synsets));
                    force_output(UNPROVIDED);
                }

        } else
            if (pos.eql($$Verb)) {
                if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
                    candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
                }
                candidate_synsets = list_utilities.fast_set_difference(candidate_synsets, wordnet_import.wni_exclude_situations(candidate_synsets), EQUAL);
            }

        if (length(candidate_synsets).numG($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread))) {
            candidate_synsets = list_utilities.first_n($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread), candidate_synsets);
        }
        format(T, $str15$_A_candidate_synsets_after_applyi, length(candidate_synsets));
        force_output(UNPROVIDED);
        candidate_synsets = wordnet_import.wni_exclude_relations(candidate_synsets);
        final SubLObject list_var;
        candidate_synsets = list_var = wordnet_import.wni_exclude_skipped(candidate_synsets);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$finding_exact_match_sysets, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if ((NIL != restart_synset) && (NIL == found_restartP)) {
                        if (synset.equal(restart_synset)) {
                            found_restartP = T;
                            SubLObject cdolist_list_var;
                            final SubLObject synset_pairs = cdolist_list_var = wni_candidates_for_exact_matching_helper(synset);
                            SubLObject synset_pair = NIL;
                            synset_pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject synset_$1 = synset_pair.first();
                                final SubLObject v_term = second(synset_pair);
                                wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_$1, UNPROVIDED);
                                wordnet_import.wni_assert_import_status($const20$WordNetSynsetImportStatus_ReadyFo, synset_$1, UNPROVIDED);
                                force_output(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                synset_pair = cdolist_list_var.first();
                            } 
                        }
                    } else {
                        SubLObject cdolist_list_var;
                        final SubLObject synset_pairs = cdolist_list_var = wni_candidates_for_exact_matching_helper(synset);
                        SubLObject synset_pair = NIL;
                        synset_pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject synset_$2 = synset_pair.first();
                            final SubLObject v_term = second(synset_pair);
                            wordnet_import.wni_assert_likely_synset_mapping(v_term, synset_$2, UNPROVIDED);
                            wordnet_import.wni_assert_import_status($const20$WordNetSynsetImportStatus_ReadyFo, synset_$2, UNPROVIDED);
                            force_output(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            synset_pair = cdolist_list_var.first();
                        } 
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Applies exact match criteria to the given SYNSET and returns any exact match pairs (synset term).
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Applies exact match criteria to the given SYNSET and returns any exact match pairs (synset term).\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static final SubLObject wni_candidates_for_exact_matching_helper_alt(SubLObject synset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject exact_match_synsets = NIL;
                SubLObject terms = NIL;
                {
                    SubLObject _prev_bind_0 = wordnet_import.$wni_verbose_exact_synset_term_matches$.currentBinding(thread);
                    try {
                        wordnet_import.$wni_verbose_exact_synset_term_matches$.bind(T, thread);
                        terms = wordnet_import.wni_exact_synset_term_matches(synset);
                    } finally {
                        wordnet_import.$wni_verbose_exact_synset_term_matches$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        exact_match_synsets = cons(list(synset, v_term), exact_match_synsets);
                    }
                }
                {
                    SubLObject list_var = exact_match_synsets;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, CONSP);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = exact_match_synsets;
                    SubLObject synset_pair = NIL;
                    for (synset_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_pair = cdolist_list_var.first()) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((length(synset_pair) == TWO_INTEGER) && (NIL != naut_p(synset_pair.first()))) && (NIL != fort_p(second(synset_pair))))) {
                                Errors.error($str_alt22$invalid_synset_pair___A__, synset_pair);
                            }
                        }
                    }
                }
                return exact_match_synsets;
            }
        }
    }

    /**
     * Applies exact match criteria to the given SYNSET and returns any exact match pairs (synset term).
     *
     * @param synset
     * 		; naut-p
     * @return listp
     */
    @LispMethod(comment = "Applies exact match criteria to the given SYNSET and returns any exact match pairs (synset term).\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@return listp")
    public static SubLObject wni_candidates_for_exact_matching_helper(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        SubLObject exact_match_synsets = NIL;
        SubLObject terms = NIL;
        final SubLObject _prev_bind_0 = wordnet_import.$wni_verbose_exact_synset_term_matches$.currentBinding(thread);
        try {
            wordnet_import.$wni_verbose_exact_synset_term_matches$.bind(T, thread);
            terms = wordnet_import.wni_exact_synset_term_matches(synset);
        } finally {
            wordnet_import.$wni_verbose_exact_synset_term_matches$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            exact_match_synsets = cons(list(synset, v_term), exact_match_synsets);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject list_var = exact_match_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != consp(elem) : "! consp(elem) " + ("Types.consp(elem) " + "CommonSymbols.NIL != Types.consp(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        cdolist_list_var = exact_match_synsets;
        SubLObject synset_pair = NIL;
        synset_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!length(synset_pair).eql(TWO_INTEGER)) || (NIL == narts_high.naut_p(synset_pair.first()))) || (NIL == forts.fort_p(second(synset_pair))))) {
                Errors.error($str23$invalid_synset_pair___A__, synset_pair);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_pair = cdolist_list_var.first();
        } 
        return exact_match_synsets;
    }

    public static final SubLObject wni_verbs_with_related_nouns_for_matching_alt() {
        return com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks.wni_candidates_for_matching($$Verb, T, UNPROVIDED);
    }

    public static SubLObject wni_verbs_with_related_nouns_for_matching() {
        return wni_candidates_for_matching($$Verb, T, UNPROVIDED);
    }

    /**
     * Finds and performs status assertions for synsets that are candidates for matching.
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @param verbs-with-related-nouns?
     * 		; booleanp, indicates that only verbs with related nouns are selected
     * @param individuals?
     * 		; booleanp, indicates that only noun individuals are selected
     */
    @LispMethod(comment = "Finds and performs status assertions for synsets that are candidates for matching.\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@param verbs-with-related-nouns?\r\n\t\t; booleanp, indicates that only verbs with related nouns are selected\r\n@param individuals?\r\n\t\t; booleanp, indicates that only noun individuals are selected")
    public static final SubLObject wni_candidates_for_matching_alt(SubLObject pos, SubLObject verbs_with_related_situation_nounsP, SubLObject individualsP) {
        if (verbs_with_related_situation_nounsP == UNPROVIDED) {
            verbs_with_related_situation_nounsP = NIL;
        }
        if (individualsP == UNPROVIDED) {
            individualsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pos, FORT_P);
            SubLTrampolineFile.checkType(verbs_with_related_situation_nounsP, BOOLEANP);
            SubLTrampolineFile.checkType(individualsP, BOOLEANP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED)) {
                    Errors.error($str_alt8$WordNet2_0_KS_must_be_registered);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ((NIL != verbs_with_related_situation_nounsP) && (NIL != individualsP)) {
                    Errors.error($str_alt25$verbs_with_related_situation_noun);
                }
            }
            format(T, $str_alt26$clearing_cached_html_for_cyc_imag, cyc_image_id());
            force_output(UNPROVIDED);
            wordnet_import.wni_delete_all_concept_match_html();
            format(T, $str_alt27$gathering__A_synsets__, pos);
            force_output(UNPROVIDED);
            {
                SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
                SubLObject error_message = NIL;
                SubLObject html_string = NIL;
                SubLObject nbr_synset_candidates_having_pos = ZERO_INTEGER;
                SubLObject text = (NIL != verbs_with_related_situation_nounsP) ? ((SubLObject) ($str_alt28$finding_verbs_with_mapped_hyperny)) : $$$finding_mapped_hypernyms;
                format(T, $str_alt30$gathered__A__A_synsets__, length(synsets_having_pos), pos);
                force_output(UNPROVIDED);
                {
                    SubLObject list_var = synsets_having_pos;
                    $progress_note$.setDynamicValue(text, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject synset = NIL;
                                for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_3 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if (((((nbr_synset_candidates_having_pos.numL($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && (NIL == wordnet_import.wni_synset_term(synset))) && (NIL != wordnet_import.wni_synset_hypernyms_mappedP(synset))) && ((NIL == verbs_with_related_situation_nounsP) || (NIL != wordnet_import.wni_verb_is_derived_from_situation_nounP(synset)))) && ((pos != $$Verb) || (NIL == wordnet_import.wni_synset_is_causerP(synset)))) && (((pos != $$Noun) || (NIL == individualsP)) || (NIL == wordnet_import.wni_synset_collectionP(synset)))) {
                                                        nbr_synset_candidates_having_pos = add(nbr_synset_candidates_having_pos, ONE_INTEGER);
                                                        format(T, $str_alt32$__selected__A__, synset);
                                                        force_output(UNPROVIDED);
                                                        wordnet_import.wni_assert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, synset, UNPROVIDED);
                                                        if (NIL == verbs_with_related_situation_nounsP) {
                                                            {
                                                                SubLObject _prev_bind_0_4 = html_macros.$html_stream$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_stream$.bind(NIL, thread);
                                                                    try {
                                                                        html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                                                        cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                                                                        html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_stream$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                            html_string = string_utilities.string_substitute($str_alt33$__, $str_alt34$_, html_string, UNPROVIDED);
                                                            wordnet_import.wni_insert_concept_match_html(synset, html_string);
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        format(T, $str_alt35$__error___A__, error_message);
                                        force_output(UNPROVIDED);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Finds and performs status assertions for synsets that are candidates for matching.
     *
     * @param pos
     * 		; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb
     * @param verbs-with-related-nouns?
     * 		; booleanp, indicates that only verbs with related nouns are selected
     * @param individuals?
     * 		; booleanp, indicates that only noun individuals are selected
     */
    @LispMethod(comment = "Finds and performs status assertions for synsets that are candidates for matching.\r\n\r\n@param pos\r\n\t\t; fort-p, either #$Noun, #$Verb, #$Adjective or #$Adverb\r\n@param verbs-with-related-nouns?\r\n\t\t; booleanp, indicates that only verbs with related nouns are selected\r\n@param individuals?\r\n\t\t; booleanp, indicates that only noun individuals are selected")
    public static SubLObject wni_candidates_for_matching(final SubLObject pos, SubLObject verbs_with_related_situation_nounsP, SubLObject individualsP) {
        if (verbs_with_related_situation_nounsP == UNPROVIDED) {
            verbs_with_related_situation_nounsP = NIL;
        }
        if (individualsP == UNPROVIDED) {
            individualsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(pos) : "! forts.fort_p(pos) " + ("forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) ") + pos;
        assert NIL != booleanp(verbs_with_related_situation_nounsP) : "! booleanp(verbs_with_related_situation_nounsP) " + ("Types.booleanp(verbs_with_related_situation_nounsP) " + "CommonSymbols.NIL != Types.booleanp(verbs_with_related_situation_nounsP) ") + verbs_with_related_situation_nounsP;
        assert NIL != booleanp(individualsP) : "! booleanp(individualsP) " + ("Types.booleanp(individualsP) " + "CommonSymbols.NIL != Types.booleanp(individualsP) ") + individualsP;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED))) {
            Errors.error($str8$WordNet2_0_KS_must_be_registered);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != verbs_with_related_situation_nounsP)) && (NIL != individualsP)) {
            Errors.error($str26$verbs_with_related_situation_noun);
        }
        format(T, $str27$clearing_cached_html_for_cyc_imag, cyc_image_id());
        force_output(UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        format(T, $str28$gathering__A_synsets__, pos);
        force_output(UNPROVIDED);
        final SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
        SubLObject error_message = NIL;
        SubLObject html_string = NIL;
        SubLObject nbr_synset_candidates_having_pos = ZERO_INTEGER;
        final SubLObject text = (NIL != verbs_with_related_situation_nounsP) ? $str29$finding_verbs_with_mapped_hyperny : $$$finding_mapped_hypernyms;
        format(T, $str31$gathered__A__A_synsets__, length(synsets_having_pos), pos);
        force_output(UNPROVIDED);
        final SubLObject list_var = synsets_having_pos;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != text ? text : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (((((nbr_synset_candidates_having_pos.numL($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && (NIL == wordnet_import.wni_synset_term(synset))) && (NIL != wordnet_import.wni_synset_hypernyms_mappedP(synset))) && ((NIL == verbs_with_related_situation_nounsP) || (NIL != wordnet_import.wni_verb_is_derived_from_situation_nounP(synset)))) && ((!pos.eql($$Verb)) || (NIL == wordnet_import.wni_synset_is_causerP(synset)))) && (((!pos.eql($$Noun)) || (NIL == individualsP)) || (NIL == wordnet_import.wni_synset_collectionP(synset)))) {
                                    nbr_synset_candidates_having_pos = add(nbr_synset_candidates_having_pos, ONE_INTEGER);
                                    format(T, $str33$__selected__A__, synset);
                                    force_output(UNPROVIDED);
                                    wordnet_import.wni_assert_import_status($const20$WordNetSynsetImportStatus_ReadyFo, synset, UNPROVIDED);
                                    if (NIL == verbs_with_related_situation_nounsP) {
                                        final SubLObject _prev_bind_0_$5 = html_macros.$html_stream$.currentBinding(thread);
                                        try {
                                            html_macros.$html_stream$.bind(NIL, thread);
                                            try {
                                                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                                cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                                                html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                            } finally {
                                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_stream$.rebind(_prev_bind_0_$5, thread);
                                        }
                                        html_string = string_utilities.string_substitute($str34$__, $str35$_, html_string, UNPROVIDED);
                                        wordnet_import.wni_insert_concept_match_html(synset, html_string);
                                    }
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error_message) {
                        format(T, $str36$__error___A__, error_message);
                        force_output(UNPROVIDED);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Finds all the possible candidates for matching according to status assertions and
     * recomputes their corresponding concept-match html pages.  This is required when a new image is used.
     */
    @LispMethod(comment = "Finds all the possible candidates for matching according to status assertions and\r\nrecomputes their corresponding concept-match html pages.  This is required when a new image is used.\nFinds all the possible candidates for matching according to status assertions and\nrecomputes their corresponding concept-match html pages.  This is required when a new image is used.")
    public static final SubLObject wni_refresh_concept_match_html_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED)) {
                    Errors.error($str_alt8$WordNet2_0_KS_must_be_registered);
                }
            }
            format(T, $str_alt26$clearing_cached_html_for_cyc_imag, cyc_image_id());
            force_output(UNPROVIDED);
            wordnet_import.wni_delete_all_concept_match_html();
            format(T, $str_alt37$gathering_candidate_synsets__);
            force_output(UNPROVIDED);
            {
                SubLObject synsets = wordnet_import.wni_unlocked_synsets_with_status($const19$WordNetSynsetImportStatus_ReadyFo);
                SubLObject error_message = NIL;
                SubLObject html_string = NIL;
                format(T, $str_alt38$gathered__A_synsets__, length(synsets));
                force_output(UNPROVIDED);
                {
                    SubLObject list_var = synsets;
                    $progress_note$.setDynamicValue($str_alt39$caching_concept_match_html, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject synset = NIL;
                                for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    format(T, $str_alt32$__selected__A__, synset);
                                                    force_output(UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_7 = html_macros.$html_stream$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_stream$.bind(NIL, thread);
                                                            try {
                                                                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                                                cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                                                                html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_stream$.rebind(_prev_bind_0_7, thread);
                                                        }
                                                    }
                                                    html_string = string_utilities.string_substitute($str_alt33$__, $str_alt34$_, html_string, UNPROVIDED);
                                                    wordnet_import.wni_insert_concept_match_html(synset, html_string);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        format(T, $str_alt35$__error___A__, error_message);
                                        force_output(UNPROVIDED);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Finds all the possible candidates for matching according to status assertions and
     * recomputes their corresponding concept-match html pages.  This is required when a new image is used.
     */
    @LispMethod(comment = "Finds all the possible candidates for matching according to status assertions and\r\nrecomputes their corresponding concept-match html pages.  This is required when a new image is used.\nFinds all the possible candidates for matching according to status assertions and\nrecomputes their corresponding concept-match html pages.  This is required when a new image is used.")
    public static SubLObject wni_refresh_concept_match_html_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED))) {
            Errors.error($str8$WordNet2_0_KS_must_be_registered);
        }
        format(T, $str27$clearing_cached_html_for_cyc_imag, cyc_image_id());
        force_output(UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        format(T, $str38$gathering_candidate_synsets__);
        force_output(UNPROVIDED);
        final SubLObject synsets = wordnet_import.wni_unlocked_synsets_with_status($const20$WordNetSynsetImportStatus_ReadyFo);
        SubLObject error_message = NIL;
        SubLObject html_string = NIL;
        format(T, $str39$gathered__A_synsets__, length(synsets));
        force_output(UNPROVIDED);
        final SubLObject list_var = synsets;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str40$caching_concept_match_html, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                format(T, $str33$__selected__A__, synset);
                                force_output(UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(NIL, thread);
                                    try {
                                        html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                        cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                                        html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                    } finally {
                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_string = string_utilities.string_substitute($str34$__, $str35$_, html_string, UNPROVIDED);
                                wordnet_import.wni_insert_concept_match_html(synset, html_string);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error_message) {
                        format(T, $str36$__error___A__, error_message);
                        force_output(UNPROVIDED);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject wni_list_glosses_for_event_synsets_alt() {
        {
            SubLObject synsets = wordnet_import.wni_all_hyponyms($list_alt40);
            SubLObject cdolist_list_var = synsets;
            SubLObject synset = NIL;
            for (synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset = cdolist_list_var.first()) {
                format(T, $str_alt41$_A__, wordnet_import.wni_synset_gloss(synset));
                force_output(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject wni_list_glosses_for_event_synsets() {
        SubLObject cdolist_list_var;
        final SubLObject synsets = cdolist_list_var = wordnet_import.wni_all_hyponyms($list41);
        SubLObject synset = NIL;
        synset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str42$_A__, wordnet_import.wni_synset_gloss(synset));
            force_output(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            synset = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Finds and performs status assertions for unmapped hypernyms of individuals.
     */
    @LispMethod(comment = "Finds and performs status assertions for unmapped hypernyms of individuals.")
    public static final SubLObject wni_unmapped_hypernyms_of_individuals_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED)) {
                    Errors.error($str_alt8$WordNet2_0_KS_must_be_registered);
                }
            }
            wordnet_import.wni_delete_all_concept_match_html();
            format(T, $str_alt43$gathering_individuals__);
            force_output(UNPROVIDED);
            {
                SubLObject synsets = wordnet_import.wni_synset_individuals();
                SubLObject hypernyms_dictionary = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                SubLObject html_string = NIL;
                SubLObject list_var = synsets;
                $progress_note$.setDynamicValue($str_alt44$finding_unmapped_hypernyms_of_ind, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject synset = NIL;
                            for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL == wordnet_import.wni_synset_hypernyms_mappedP(synset)) {
                                    {
                                        SubLObject cdolist_list_var = wordnet_import.wni_hypernyms(synset);
                                        SubLObject hypernym = NIL;
                                        for (hypernym = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hypernym = cdolist_list_var.first()) {
                                            if (NIL == dictionary_utilities.dictionary_has_keyP(hypernyms_dictionary, hypernym)) {
                                                format(T, $str_alt32$__selected__A__, wordnet_import.wni_synset_words(hypernym));
                                                force_output(UNPROVIDED);
                                                dictionary.dictionary_enter(hypernyms_dictionary, hypernym, T);
                                                wordnet_import.wni_assert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, hypernym, UNPROVIDED);
                                                if (NIL != wordnet_import.wni_hypernym_mappedP(hypernym)) {
                                                    {
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_stream$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_stream$.bind(NIL, thread);
                                                            try {
                                                                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                                                cb_wordnet_import_concept_match.wni_concept_match_html(hypernym, UNPROVIDED);
                                                                html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_stream$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_string = string_utilities.string_substitute($str_alt33$__, $str_alt34$_, html_string, UNPROVIDED);
                                                    wordnet_import.wni_insert_concept_match_html(hypernym, html_string);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Finds and performs status assertions for unmapped hypernyms of individuals.
     */
    @LispMethod(comment = "Finds and performs status assertions for unmapped hypernyms of individuals.")
    public static SubLObject wni_unmapped_hypernyms_of_individuals() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED))) {
            Errors.error($str8$WordNet2_0_KS_must_be_registered);
        }
        wordnet_import.wni_delete_all_concept_match_html();
        format(T, $str44$gathering_individuals__);
        force_output(UNPROVIDED);
        final SubLObject synsets = wordnet_import.wni_synset_individuals();
        final SubLObject hypernyms_dictionary = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        SubLObject html_string = NIL;
        final SubLObject list_var = synsets;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str45$finding_unmapped_hypernyms_of_ind, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == wordnet_import.wni_synset_hypernyms_mappedP(synset)) {
                        SubLObject cdolist_list_var = wordnet_import.wni_hypernyms(synset);
                        SubLObject hypernym = NIL;
                        hypernym = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == dictionary_utilities.dictionary_has_keyP(hypernyms_dictionary, hypernym)) {
                                format(T, $str33$__selected__A__, wordnet_import.wni_synset_words(hypernym));
                                force_output(UNPROVIDED);
                                dictionary.dictionary_enter(hypernyms_dictionary, hypernym, T);
                                wordnet_import.wni_assert_import_status($const20$WordNetSynsetImportStatus_ReadyFo, hypernym, UNPROVIDED);
                                if (NIL != wordnet_import.wni_hypernym_mappedP(hypernym)) {
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(NIL, thread);
                                        try {
                                            html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                            cb_wordnet_import_concept_match.wni_concept_match_html(hypernym, UNPROVIDED);
                                            html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                        } finally {
                                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_string = string_utilities.string_substitute($str34$__, $str35$_, html_string, UNPROVIDED);
                                    wordnet_import.wni_insert_concept_match_html(hypernym, html_string);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            hypernym = cdolist_list_var.first();
                        } 
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Finds and performs status assertions for topmost unmapped verbs that are candidates for matching.
     */
    @LispMethod(comment = "Finds and performs status assertions for topmost unmapped verbs that are candidates for matching.")
    public static final SubLObject wni_topmost_unmapped_verbs_for_matching_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED)) {
                    Errors.error($str_alt8$WordNet2_0_KS_must_be_registered);
                }
            }
            format(T, $str_alt26$clearing_cached_html_for_cyc_imag, cyc_image_id());
            force_output(UNPROVIDED);
            wordnet_import.wni_delete_all_concept_match_html();
            {
                SubLObject pos = $$Verb;
                format(T, $str_alt27$gathering__A_synsets__, pos);
                force_output(UNPROVIDED);
                {
                    SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
                    SubLObject synsets = NIL;
                    SubLObject html_string = NIL;
                    SubLObject nbr_synset_candidates_having_pos = ZERO_INTEGER;
                    SubLObject text = $$$finding_topmost_unmapped_verbs;
                    format(T, $str_alt30$gathered__A__A_synsets__, length(synsets_having_pos), pos);
                    force_output(UNPROVIDED);
                    {
                        SubLObject list_var = synsets_having_pos;
                        $progress_note$.setDynamicValue(text, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject synset = NIL;
                                    for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (((nbr_synset_candidates_having_pos.numL($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && (NIL == wordnet_import.wni_synset_term(synset))) && (NIL == wordnet_import.wni_hypernyms(synset))) && ((pos != $$Verb) || (NIL == wordnet_import.wni_synset_is_causerP(synset)))) {
                                            nbr_synset_candidates_having_pos = add(nbr_synset_candidates_having_pos, ONE_INTEGER);
                                            format(T, $str_alt32$__selected__A__, synset);
                                            force_output(UNPROVIDED);
                                            synsets = cons(synset, synsets);
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    format(T, $str_alt10$_A_candidate_synsets__, length(synsets));
                    force_output(UNPROVIDED);
                    {
                        SubLObject list_var = synsets;
                        $progress_note$.setDynamicValue($$$formatting_workflow_pages, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject synset = NIL;
                                    for (synset = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , synset = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        wordnet_import.wni_assert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, synset, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_11 = html_macros.$html_stream$.currentBinding(thread);
                                            try {
                                                html_macros.$html_stream$.bind(NIL, thread);
                                                try {
                                                    html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                                                    cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                                                    html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_stream$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        html_string = string_utilities.string_substitute($str_alt33$__, $str_alt34$_, html_string, UNPROVIDED);
                                        wordnet_import.wni_insert_concept_match_html(synset, html_string);
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    force_output(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * Finds and performs status assertions for topmost unmapped verbs that are candidates for matching.
     */
    @LispMethod(comment = "Finds and performs status assertions for topmost unmapped verbs that are candidates for matching.")
    public static SubLObject wni_topmost_unmapped_verbs_for_matching() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const7$WordNet2_0_KS, UNPROVIDED))) {
            Errors.error($str8$WordNet2_0_KS_must_be_registered);
        }
        format(T, $str27$clearing_cached_html_for_cyc_imag, cyc_image_id());
        force_output(UNPROVIDED);
        wordnet_import.wni_delete_all_concept_match_html();
        final SubLObject pos = $$Verb;
        format(T, $str28$gathering__A_synsets__, pos);
        force_output(UNPROVIDED);
        final SubLObject synsets_having_pos = wordnet_import.wni_synsets_having_pos(pos);
        SubLObject synsets = NIL;
        SubLObject html_string = NIL;
        SubLObject nbr_synset_candidates_having_pos = ZERO_INTEGER;
        final SubLObject text = $$$finding_topmost_unmapped_verbs;
        format(T, $str31$gathered__A__A_synsets__, length(synsets_having_pos), pos);
        force_output(UNPROVIDED);
        SubLObject list_var = synsets_having_pos;
        SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != text ? text : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (((nbr_synset_candidates_having_pos.numL($wni_max_nbr_synset_candidates_having_pos$.getDynamicValue(thread)) && (NIL == wordnet_import.wni_synset_term(synset))) && (NIL == wordnet_import.wni_hypernyms(synset))) && ((!pos.eql($$Verb)) || (NIL == wordnet_import.wni_synset_is_causerP(synset)))) {
                        nbr_synset_candidates_having_pos = add(nbr_synset_candidates_having_pos, ONE_INTEGER);
                        format(T, $str33$__selected__A__, synset);
                        force_output(UNPROVIDED);
                        synsets = cons(synset, synsets);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        format(T, $str10$_A_candidate_synsets__, length(synsets));
        force_output(UNPROVIDED);
        list_var = synsets;
        _prev_bind_0 = $progress_note$.currentBinding(thread);
        _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        _prev_bind_3 = $progress_total$.currentBinding(thread);
        _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$formatting_workflow_pages, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    wordnet_import.wni_assert_import_status($const20$WordNetSynsetImportStatus_ReadyFo, synset, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_stream$.currentBinding(thread);
                    try {
                        html_macros.$html_stream$.bind(NIL, thread);
                        try {
                            html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            cb_wordnet_import_concept_match.wni_concept_match_html(synset, UNPROVIDED);
                            html_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                        } finally {
                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_stream$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_string = string_utilities.string_substitute($str34$__, $str35$_, html_string, UNPROVIDED);
                    wordnet_import.wni_insert_concept_match_html(synset, html_string);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        force_output(UNPROVIDED);
        return NIL;
    }

    /**
     * Mark verb term candidates for lexification.
     */
    @LispMethod(comment = "Mark verb term candidates for lexification.")
    public static final SubLObject wni_verb_candidates_for_semtrans_alt() {
        wordnet_import.wni_clear_function_caches();
        format(T, $str_alt49$gathering_lexification_candidate_);
        force_output(UNPROVIDED);
        {
            SubLObject lexification_synsets = wordnet_import.wni_unlocked_synsets_with_status($const50$WordNetSynsetImportStatus_ReadyFo);
            SubLObject lexification_verb_synsets = NIL;
            SubLObject no_semtrans_synsets = NIL;
            SubLObject direct_genls_semtrans_synsets = NIL;
            format(T, $str_alt51$_A_candidate_synsets_for_lexifica, length(lexification_synsets));
            force_output(UNPROVIDED);
            {
                SubLObject cdolist_list_var = lexification_synsets;
                SubLObject lexification_synset = NIL;
                for (lexification_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexification_synset = cdolist_list_var.first()) {
                    if (wordnet_import.wni_synset_pos(lexification_synset) == $$Verb) {
                        lexification_verb_synsets = cons(lexification_synset, lexification_verb_synsets);
                    }
                }
            }
            format(T, $str_alt52$_A_verb_candidate_synsets_for_lex, length(lexification_verb_synsets));
            force_output(UNPROVIDED);
            {
                SubLObject cdolist_list_var = lexification_verb_synsets;
                SubLObject lexification_verb_synset = NIL;
                for (lexification_verb_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexification_verb_synset = cdolist_list_var.first()) {
                    {
                        SubLObject v_term = wordnet_import.wni_synset_term(lexification_verb_synset);
                        if (NIL == wordnet_import.wni_term_has_verb_semtransP(v_term)) {
                            no_semtrans_synsets = cons(lexification_verb_synset, no_semtrans_synsets);
                        }
                    }
                }
            }
            format(T, $str_alt53$_A_candidate_synsets_having_no_se, length(no_semtrans_synsets));
            force_output(UNPROVIDED);
            {
                SubLObject cdolist_list_var = no_semtrans_synsets;
                SubLObject no_semtrans_synset = NIL;
                for (no_semtrans_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , no_semtrans_synset = cdolist_list_var.first()) {
                    {
                        SubLObject v_term = wordnet_import.wni_synset_term(no_semtrans_synset);
                        SubLObject v_genls = genls.genls(v_term, UNPROVIDED, UNPROVIDED);
                        SubLObject direct_genls_semtrans_synsetP = NIL;
                        SubLObject cdolist_list_var_13 = v_genls;
                        SubLObject genl = NIL;
                        for (genl = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , genl = cdolist_list_var_13.first()) {
                            if (((NIL == direct_genls_semtrans_synsetP) && (genl != $$Individual)) && (NIL != wordnet_import.wni_term_has_verb_semtransP(genl))) {
                                direct_genls_semtrans_synsetP = T;
                            }
                        }
                        if (NIL != direct_genls_semtrans_synsetP) {
                            direct_genls_semtrans_synsets = cons(no_semtrans_synset, direct_genls_semtrans_synsets);
                        }
                    }
                }
            }
            format(T, $str_alt55$_A_candidate_synsets_having_a_dir, length(direct_genls_semtrans_synsets));
            force_output(UNPROVIDED);
            format(T, $str_alt56$Making_workflow_status_assertions);
            force_output(UNPROVIDED);
            {
                SubLObject cdolist_list_var = direct_genls_semtrans_synsets;
                SubLObject direct_genls_semtrans_synset = NIL;
                for (direct_genls_semtrans_synset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direct_genls_semtrans_synset = cdolist_list_var.first()) {
                    wordnet_import.wni_unassert_import_status($const50$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, UNPROVIDED);
                    wordnet_import.wni_assert_import_status($const57$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * Mark verb term candidates for lexification.
     */
    @LispMethod(comment = "Mark verb term candidates for lexification.")
    public static SubLObject wni_verb_candidates_for_semtrans() {
        wordnet_import.wni_clear_function_caches();
        format(T, $str50$gathering_lexification_candidate_);
        force_output(UNPROVIDED);
        final SubLObject lexification_synsets = wordnet_import.wni_unlocked_synsets_with_status($const51$WordNetSynsetImportStatus_ReadyFo);
        SubLObject lexification_verb_synsets = NIL;
        SubLObject no_semtrans_synsets = NIL;
        SubLObject direct_genls_semtrans_synsets = NIL;
        format(T, $str52$_A_candidate_synsets_for_lexifica, length(lexification_synsets));
        force_output(UNPROVIDED);
        SubLObject cdolist_list_var = lexification_synsets;
        SubLObject lexification_synset = NIL;
        lexification_synset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (wordnet_import.wni_synset_pos(lexification_synset).eql($$Verb)) {
                lexification_verb_synsets = cons(lexification_synset, lexification_verb_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lexification_synset = cdolist_list_var.first();
        } 
        format(T, $str53$_A_verb_candidate_synsets_for_lex, length(lexification_verb_synsets));
        force_output(UNPROVIDED);
        cdolist_list_var = lexification_verb_synsets;
        SubLObject lexification_verb_synset = NIL;
        lexification_verb_synset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = wordnet_import.wni_synset_term(lexification_verb_synset);
            if (NIL == wordnet_import.wni_term_has_verb_semtransP(v_term)) {
                no_semtrans_synsets = cons(lexification_verb_synset, no_semtrans_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lexification_verb_synset = cdolist_list_var.first();
        } 
        format(T, $str54$_A_candidate_synsets_having_no_se, length(no_semtrans_synsets));
        force_output(UNPROVIDED);
        cdolist_list_var = no_semtrans_synsets;
        SubLObject no_semtrans_synset = NIL;
        no_semtrans_synset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = wordnet_import.wni_synset_term(no_semtrans_synset);
            final SubLObject v_genls = genls.genls(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject direct_genls_semtrans_synsetP = NIL;
            SubLObject cdolist_list_var_$19 = v_genls;
            SubLObject genl = NIL;
            genl = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                if (((NIL == direct_genls_semtrans_synsetP) && (!genl.eql($$Individual))) && (NIL != wordnet_import.wni_term_has_verb_semtransP(genl))) {
                    direct_genls_semtrans_synsetP = T;
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                genl = cdolist_list_var_$19.first();
            } 
            if (NIL != direct_genls_semtrans_synsetP) {
                direct_genls_semtrans_synsets = cons(no_semtrans_synset, direct_genls_semtrans_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            no_semtrans_synset = cdolist_list_var.first();
        } 
        format(T, $str56$_A_candidate_synsets_having_a_dir, length(direct_genls_semtrans_synsets));
        force_output(UNPROVIDED);
        format(T, $str57$Making_workflow_status_assertions);
        force_output(UNPROVIDED);
        cdolist_list_var = direct_genls_semtrans_synsets;
        SubLObject direct_genls_semtrans_synset = NIL;
        direct_genls_semtrans_synset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wordnet_import.wni_unassert_import_status($const51$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, UNPROVIDED);
            wordnet_import.wni_assert_import_status($const58$WordNetSynsetImportStatus_ReadyFo, direct_genls_semtrans_synset, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            direct_genls_semtrans_synset = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject wni_disjoint_genls_integrity_test_alt() {
        {
            SubLObject mapped_terms = wordnet_import.wni_mapped_terms();
            SubLObject cdolist_list_var = mapped_terms;
            SubLObject mapped_term = NIL;
            for (mapped_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_term = cdolist_list_var.first()) {
                {
                    SubLObject v_genls = genls.genls(mapped_term, UNPROVIDED, UNPROVIDED);
                    SubLObject cols = append(list(mapped_term), v_genls);
                    if (NIL != disjoint_with.any_disjoint_collection_pairP(cols, UNPROVIDED)) {
                        format(T, $str_alt59$_A_has_disjoint_genls__A__, mapped_term, v_genls);
                        force_output(UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject wni_disjoint_genls_integrity_test() {
        SubLObject cdolist_list_var;
        final SubLObject mapped_terms = cdolist_list_var = wordnet_import.wni_mapped_terms();
        SubLObject mapped_term = NIL;
        mapped_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_genls = genls.genls(mapped_term, UNPROVIDED, UNPROVIDED);
            final SubLObject cols = append(list(mapped_term), v_genls);
            if (NIL != disjoint_with.any_disjoint_collection_pairP(cols, UNPROVIDED)) {
                format(T, $str60$_A_has_disjoint_genls__A__, mapped_term, v_genls);
                force_output(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject wni_unasserting_redundant_genls_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapped_terms = wordnet_import.wni_mapped_terms();
                SubLObject list_var = mapped_terms;
                $progress_note$.setDynamicValue($$$Unasserting_redundant_genls, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject mapped_term = NIL;
                            for (mapped_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , mapped_term = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject v_genls = genls.genls(mapped_term, UNPROVIDED, UNPROVIDED);
                                    SubLObject min_cols = genls.min_cols(v_genls, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var = v_genls;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                        if (NIL == subl_promotions.memberP(genl, min_cols, UNPROVIDED, UNPROVIDED)) {
                                            format(T, $str_alt62$_A_has_redundant_genls__A__, mapped_term, genl);
                                            force_output(UNPROVIDED);
                                            wordnet_import.wni_unassert_genls(mapped_term, genl, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject wni_unasserting_redundant_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject mapped_terms = list_var = wordnet_import.wni_mapped_terms();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Unasserting_redundant_genls, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject mapped_term = NIL;
                mapped_term = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject v_genls = genls.genls(mapped_term, UNPROVIDED, UNPROVIDED);
                    final SubLObject min_cols = genls.min_cols(v_genls, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = v_genls;
                    SubLObject genl = NIL;
                    genl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == subl_promotions.memberP(genl, min_cols, UNPROVIDED, UNPROVIDED)) {
                            format(T, $str63$_A_has_redundant_genls__A__, mapped_term, genl);
                            force_output(UNPROVIDED);
                            wordnet_import.wni_unassert_genls(mapped_term, genl, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        genl = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    mapped_term = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Performs a one-time marking of (existing) mapped terms, ensuring that they will all be
     * included in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to
     * redundantly map them.
     */
    @LispMethod(comment = "Performs a one-time marking of (existing) mapped terms, ensuring that they will all be\r\nincluded in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to\r\nredundantly map them.\nPerforms a one-time marking of (existing) mapped terms, ensuring that they will all be\nincluded in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to\nredundantly map them.")
    public static final SubLObject wni_mark_existing_mapped_terms_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapped_terms = wordnet_import.wni_mapped_terms();
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$ke_purpose$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind($$SteveReed, thread);
                        api_control_vars.$ke_purpose$.bind($$ResearchCycProject, thread);
                        {
                            SubLObject list_var = mapped_terms;
                            $progress_note$.setDynamicValue($$$marking_existing_mapped_terms, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_14 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_15 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject mapped_term = NIL;
                                        for (mapped_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , mapped_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (!((NIL != isa.quoted_isaP(mapped_term, $$ResearchCycConstant, $$BookkeepingMt, UNPROVIDED)) || (NIL != isa.quoted_isaP(mapped_term, $$ScaffoldingConstant, $$BookkeepingMt, UNPROVIDED)))) {
                                                wordnet_import.wni_assert_quoted_isa_workflow_constant(mapped_term, NIL);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_15, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$ke_purpose$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Performs a one-time marking of (existing) mapped terms, ensuring that they will all be
     * included in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to
     * redundantly map them.
     */
    @LispMethod(comment = "Performs a one-time marking of (existing) mapped terms, ensuring that they will all be\r\nincluded in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to\r\nredundantly map them.\nPerforms a one-time marking of (existing) mapped terms, ensuring that they will all be\nincluded in ResearchCyc builds.  Otherwise, RCyc WN users would be prompted to\nredundantly map them.")
    public static SubLObject wni_mark_existing_mapped_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapped_terms = wordnet_import.wni_mapped_terms();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($$SteveReed, thread);
            api_control_vars.$ke_purpose$.bind($$ResearchCycProject, thread);
            final SubLObject list_var = mapped_terms;
            final SubLObject _prev_bind_0_$21 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$marking_existing_mapped_terms, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject mapped_term = NIL;
                    mapped_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if ((NIL == isa.quoted_isaP(mapped_term, $$ResearchCycConstant, $$BookkeepingMt, UNPROVIDED)) && (NIL == isa.quoted_isaP(mapped_term, $$ScaffoldingConstant, $$BookkeepingMt, UNPROVIDED))) {
                            wordnet_import.wni_assert_quoted_isa_workflow_constant(mapped_term, NIL);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        mapped_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$22, thread);
                $progress_note$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject wni_transcript_processing_1_alt() {
        {
            SubLObject stream_var = NIL;
            try {
                stream_var = StreamsLow.open($str_alt70$_home_reed_temp_new_transcript_1_, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE });
                {
                    SubLObject out_stream = stream_var;
                    SubLObject assertion_lineP = T;
                    SubLObject print_timestamp_lineP = NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text($str_alt77$_home_reed_temp_new_transcript_ts, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt79$Unable_to_open__S, $str_alt77$_home_reed_temp_new_transcript_ts);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        if (NIL != assertion_lineP) {
                                            assertion_lineP = NIL;
                                            if (NIL != string_utilities.superstringP(line, $$$DeterminedIndividual, UNPROVIDED, UNPROVIDED)) {
                                                princ(line, out_stream);
                                                terpri(out_stream);
                                                print_timestamp_lineP = T;
                                            }
                                        } else {
                                            assertion_lineP = T;
                                            if (NIL != print_timestamp_lineP) {
                                                princ(line, out_stream);
                                                terpri(out_stream);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != stream_var) {
                            close(stream_var, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject wni_transcript_processing_1() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream_var = NIL;
        try {
            final SubLObject out_stream;
            stream_var = out_stream = StreamsLow.open($str71$_home_reed_temp_new_transcript_1_, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE });
            SubLObject assertion_lineP = T;
            SubLObject print_timestamp_lineP = NIL;
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($str78$_home_reed_temp_new_transcript_ts, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str80$Unable_to_open__S, $str78$_home_reed_temp_new_transcript_ts);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        if (NIL != assertion_lineP) {
                            assertion_lineP = NIL;
                            if (NIL != string_utilities.superstringP(line, $$$DeterminedIndividual, UNPROVIDED, UNPROVIDED)) {
                                princ(line, out_stream);
                                terpri(out_stream);
                                print_timestamp_lineP = T;
                            }
                        } else {
                            assertion_lineP = T;
                            if (NIL != print_timestamp_lineP) {
                                princ(line, out_stream);
                                terpri(out_stream);
                            }
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != stream_var) {
                    close(stream_var, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    /**
     * Emits an HTML mock-up table for the given EVENT-COL. When FULL?, then the
     * status column is emitted and all rows are output.  Otherwise non-nil
     * status columns are omitted.
     */
    @LispMethod(comment = "Emits an HTML mock-up table for the given EVENT-COL. When FULL?, then the\r\nstatus column is emitted and all rows are output.  Otherwise non-nil\r\nstatus columns are omitted.\nEmits an HTML mock-up table for the given EVENT-COL. When FULL?, then the\nstatus column is emitted and all rows are output.  Otherwise non-nil\nstatus columns are omitted.")
    public static final SubLObject wni_emit_mock_up_table_alt(SubLObject event_col, SubLObject fullP) {
        SubLTrampolineFile.checkType(event_col, FORT_P);
        SubLTrampolineFile.checkType(fullP, BOOLEANP);
        {
            SubLObject wni_role_infos = wordnet_import.wni_gather_roles_and_traits(event_col);
            SubLObject highlightP = T;
            if (NIL != fullP) {
                {
                    SubLObject cdolist_list_var = wni_role_infos;
                    SubLObject wni_role_info = NIL;
                    for (wni_role_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , wni_role_info = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks.wni_emit_mock_up_row_full(wni_role_info, highlightP);
                        highlightP = makeBoolean(NIL == highlightP);
                    }
                }
            } else {
                {
                    SubLObject status = NIL;
                    SubLObject cdolist_list_var = wni_role_infos;
                    SubLObject wni_role_info = NIL;
                    for (wni_role_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , wni_role_info = cdolist_list_var.first()) {
                        status = wordnet_import.wni_subsumption_status(wni_role_info);
                        if (NIL == status) {
                            com.cyc.cycjava.cycl.wordnet_import.wordnet_import_offline_tasks.wni_emit_mock_up_row_brief(wni_role_info, highlightP);
                            highlightP = makeBoolean(NIL == highlightP);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Emits an HTML mock-up table for the given EVENT-COL. When FULL?, then the
     * status column is emitted and all rows are output.  Otherwise non-nil
     * status columns are omitted.
     */
    @LispMethod(comment = "Emits an HTML mock-up table for the given EVENT-COL. When FULL?, then the\r\nstatus column is emitted and all rows are output.  Otherwise non-nil\r\nstatus columns are omitted.\nEmits an HTML mock-up table for the given EVENT-COL. When FULL?, then the\nstatus column is emitted and all rows are output.  Otherwise non-nil\nstatus columns are omitted.")
    public static SubLObject wni_emit_mock_up_table(final SubLObject event_col, final SubLObject fullP) {
        assert NIL != forts.fort_p(event_col) : "! forts.fort_p(event_col) " + ("forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) ") + event_col;
        assert NIL != booleanp(fullP) : "! booleanp(fullP) " + ("Types.booleanp(fullP) " + "CommonSymbols.NIL != Types.booleanp(fullP) ") + fullP;
        final SubLObject wni_role_infos = wordnet_import.wni_gather_roles_and_traits(event_col);
        SubLObject highlightP = T;
        if (NIL != fullP) {
            SubLObject cdolist_list_var = wni_role_infos;
            SubLObject wni_role_info = NIL;
            wni_role_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                wni_emit_mock_up_row_full(wni_role_info, highlightP);
                highlightP = makeBoolean(NIL == highlightP);
                cdolist_list_var = cdolist_list_var.rest();
                wni_role_info = cdolist_list_var.first();
            } 
        } else {
            SubLObject status = NIL;
            SubLObject cdolist_list_var2 = wni_role_infos;
            SubLObject wni_role_info2 = NIL;
            wni_role_info2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                status = wordnet_import.wni_subsumption_status(wni_role_info2);
                if (NIL == status) {
                    wni_emit_mock_up_row_brief(wni_role_info2, highlightP);
                    highlightP = makeBoolean(NIL == highlightP);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                wni_role_info2 = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    /**
     * Emits an HTML mock up row for the given role, filler, defining-col, and defining-pred.
     */
    @LispMethod(comment = "Emits an HTML mock up row for the given role, filler, defining-col, and defining-pred.")
    public static final SubLObject wni_emit_mock_up_row_brief_alt(SubLObject wni_role_info, SubLObject highlightP) {
        SubLTrampolineFile.checkType(wni_role_info, WNI_ROLE_INFO_P);
        SubLTrampolineFile.checkType(highlightP, BOOLEANP);
        {
            SubLObject bgcolor = (NIL != highlightP) ? ((SubLObject) ($str_alt82$_bgcolor__wheat_)) : $str_alt83$;
            format(T, $str_alt84$_____A, cconcatenate($str_alt85$_tr, new SubLObject[]{ bgcolor, $str_alt86$__td__img_src__yellow_gif__alt___, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str_alt87$__a___td__td__a_href__cg_wns_edit, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str_alt87$__a___td__td__a_href__cg_wns_edit, cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), $str_alt88$__a___td__td__img_src__yellow_gif, cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), $str_alt89$__a___td__td__input_type__checkbo, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str_alt90$_, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str_alt91$____td___tr_ }));
        }
        return NIL;
    }

    /**
     * Emits an HTML mock up row for the given role, filler, defining-col, and defining-pred.
     */
    @LispMethod(comment = "Emits an HTML mock up row for the given role, filler, defining-col, and defining-pred.")
    public static SubLObject wni_emit_mock_up_row_brief(final SubLObject wni_role_info, final SubLObject highlightP) {
        assert NIL != wordnet_import.wni_role_info_p(wni_role_info) : "! wordnet_import.wni_role_info_p(wni_role_info) " + ("wordnet_import.wni_role_info_p(wni_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(wni_role_info) ") + wni_role_info;
        assert NIL != booleanp(highlightP) : "! booleanp(highlightP) " + ("Types.booleanp(highlightP) " + "CommonSymbols.NIL != Types.booleanp(highlightP) ") + highlightP;
        final SubLObject bgcolor = (NIL != highlightP) ? $str83$_bgcolor__wheat_ : $str84$;
        format(T, $str85$_____A, cconcatenate($str86$_tr, new SubLObject[]{ bgcolor, $str87$__td__img_src__yellow_gif__alt___, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str88$__a___td__td__a_href__cg_wns_edit, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str88$__a___td__td__a_href__cg_wns_edit, cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), $str89$__a___td__td__img_src__yellow_gif, cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), $str90$__a___td__td__input_type__checkbo, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $$$_, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str92$____td___tr_ }));
        return NIL;
    }

    /**
     * Emits an HTML mock up row for the given role, filler, defining-col, defining-pred and
     * status.
     */
    @LispMethod(comment = "Emits an HTML mock up row for the given role, filler, defining-col, defining-pred and\r\nstatus.\nEmits an HTML mock up row for the given role, filler, defining-col, defining-pred and\nstatus.")
    public static final SubLObject wni_emit_mock_up_row_full_alt(SubLObject wni_role_info, SubLObject highlightP) {
        SubLTrampolineFile.checkType(wni_role_info, WNI_ROLE_INFO_P);
        SubLTrampolineFile.checkType(highlightP, BOOLEANP);
        {
            SubLObject status_desc = NIL;
            SubLObject bgcolor = (NIL != highlightP) ? ((SubLObject) ($str_alt82$_bgcolor__wheat_)) : $str_alt83$;
            if (NIL != wordnet_import.wni_subsumption_status(wni_role_info)) {
                if (wordnet_import.wni_subsumption_status(wni_role_info) == T) {
                    status_desc = $$$redundant;
                } else {
                    status_desc = cconcatenate($str_alt93$subsumes__a_href__cg_wns_edit_amp, new SubLObject[]{ cb_fort_display_string(wordnet_import.wni_subsumption_status(wni_role_info)), $str_alt94$__a_ });
                }
            } else {
                status_desc = $str_alt90$_;
            }
            format(T, $str_alt84$_____A, cconcatenate($str_alt85$_tr, new SubLObject[]{ bgcolor, $str_alt95$__td__img_src__yellow_gif__alt___, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str_alt96$__a___td___td__a_href__cg_wns_edi, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str_alt96$__a___td___td__a_href__cg_wns_edi, cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), $str_alt97$__a___td___td__img_src__yellow_gi, cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), $str_alt98$__a___td___td_, status_desc, $str_alt99$__td___td__input_type__checkbox__, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str_alt90$_, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str_alt100$____td____tr_ }));
        }
        return NIL;
    }

    /**
     * Emits an HTML mock up row for the given role, filler, defining-col, defining-pred and
     * status.
     */
    @LispMethod(comment = "Emits an HTML mock up row for the given role, filler, defining-col, defining-pred and\r\nstatus.\nEmits an HTML mock up row for the given role, filler, defining-col, defining-pred and\nstatus.")
    public static SubLObject wni_emit_mock_up_row_full(final SubLObject wni_role_info, final SubLObject highlightP) {
        assert NIL != wordnet_import.wni_role_info_p(wni_role_info) : "! wordnet_import.wni_role_info_p(wni_role_info) " + ("wordnet_import.wni_role_info_p(wni_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(wni_role_info) ") + wni_role_info;
        assert NIL != booleanp(highlightP) : "! booleanp(highlightP) " + ("Types.booleanp(highlightP) " + "CommonSymbols.NIL != Types.booleanp(highlightP) ") + highlightP;
        SubLObject status_desc = NIL;
        final SubLObject bgcolor = (NIL != highlightP) ? $str83$_bgcolor__wheat_ : $str84$;
        if (NIL != wordnet_import.wni_subsumption_status(wni_role_info)) {
            if (wordnet_import.wni_subsumption_status(wni_role_info) == T) {
                status_desc = $$$redundant;
            } else {
                status_desc = cconcatenate($str94$subsumes__a_href__cg_wns_edit_amp, new SubLObject[]{ cb_fort_display_string(wordnet_import.wni_subsumption_status(wni_role_info)), $str95$__a_ });
            }
        } else {
            status_desc = $$$_;
        }
        format(T, $str85$_____A, cconcatenate($str86$_tr, new SubLObject[]{ bgcolor, $str96$__td__img_src__yellow_gif__alt___, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $str97$__a___td___td__a_href__cg_wns_edi, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str97$__a___td___td__a_href__cg_wns_edi, cb_fort_display_string(wordnet_import.wni_defining_col(wni_role_info)), $str98$__a___td___td__img_src__yellow_gi, cb_fort_display_string(wordnet_import.wni_defining_pred(wni_role_info)), $str99$__a___td___td_, status_desc, $str100$__td___td__input_type__checkbox__, cb_fort_display_string(wordnet_import.wni_role(wni_role_info)), $$$_, cb_fort_display_string(wordnet_import.wni_filler(wni_role_info)), $str101$____td____tr_ }));
        return NIL;
    }

    static private final SubLString $str_alt8$WordNet2_0_KS_must_be_registered = makeString("WordNet2_0-KS must be registered");

    static private final SubLString $str_alt9$gathering_synsets__ = makeString("gathering synsets~%");

    static private final SubLString $str_alt10$_A_candidate_synsets__ = makeString("~A candidate synsets~%");

    public static SubLObject declare_wordnet_import_offline_tasks_file() {
        declareFunction("wni_set_max_nbr_synset_candidates_having_pos", "WNI-SET-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS", 1, 0, false);
        declareFunction("wni_candidates_for_exact_matching", "WNI-CANDIDATES-FOR-EXACT-MATCHING", 1, 3, false);
        declareFunction("wni_candidates_for_exact_matching_helper", "WNI-CANDIDATES-FOR-EXACT-MATCHING-HELPER", 1, 0, false);
        declareFunction("wni_verbs_with_related_nouns_for_matching", "WNI-VERBS-WITH-RELATED-NOUNS-FOR-MATCHING", 0, 0, false);
        declareFunction("wni_candidates_for_matching", "WNI-CANDIDATES-FOR-MATCHING", 1, 2, false);
        declareFunction("wni_refresh_concept_match_html_cache", "WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE", 0, 0, false);
        declareFunction("wni_list_glosses_for_event_synsets", "WNI-LIST-GLOSSES-FOR-EVENT-SYNSETS", 0, 0, false);
        declareFunction("wni_unmapped_hypernyms_of_individuals", "WNI-UNMAPPED-HYPERNYMS-OF-INDIVIDUALS", 0, 0, false);
        declareFunction("wni_topmost_unmapped_verbs_for_matching", "WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING", 0, 0, false);
        declareFunction("wni_verb_candidates_for_semtrans", "WNI-VERB-CANDIDATES-FOR-SEMTRANS", 0, 0, false);
        declareFunction("wni_disjoint_genls_integrity_test", "WNI-DISJOINT-GENLS-INTEGRITY-TEST", 0, 0, false);
        declareFunction("wni_unasserting_redundant_genls", "WNI-UNASSERTING-REDUNDANT-GENLS", 0, 0, false);
        declareFunction("wni_mark_existing_mapped_terms", "WNI-MARK-EXISTING-MAPPED-TERMS", 0, 0, false);
        declareFunction("wni_transcript_processing_1", "WNI-TRANSCRIPT-PROCESSING-1", 0, 0, false);
        declareFunction("wni_emit_mock_up_table", "WNI-EMIT-MOCK-UP-TABLE", 2, 0, false);
        declareFunction("wni_emit_mock_up_row_brief", "WNI-EMIT-MOCK-UP-ROW-BRIEF", 2, 0, false);
        declareFunction("wni_emit_mock_up_row_full", "WNI-EMIT-MOCK-UP-ROW-FULL", 2, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt12$_A_individual_synsets__ = makeString("~A individual synsets~%");

    static private final SubLString $str_alt13$_A_individual_candidate_synsets__ = makeString("~A individual candidate synsets~%");

    static private final SubLString $str_alt14$_A_collection_candidate_synsets__ = makeString("~A collection candidate synsets~%");

    static private final SubLString $str_alt15$_A_candidate_synsets_after_applyi = makeString("~A candidate-synsets after applying limit~%~%");

    static private final SubLString $str_alt16$_A_collection_candidate_synsets_e = makeString("~A collection candidate synsets excluding #$Situations~%");

    public static final SubLObject $const19$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForPossibleMatching");

    static private final SubLString $str_alt22$invalid_synset_pair___A__ = makeString("invalid synset-pair: ~A~%");

    static private final SubLString $str_alt25$verbs_with_related_situation_noun = makeString("verbs-with-related-situation-nouns? and individuals? are mutually exclusive parameters");

    static private final SubLString $str_alt26$clearing_cached_html_for_cyc_imag = makeString("clearing cached html for cyc image: ~A~%");

    static private final SubLString $str_alt27$gathering__A_synsets__ = makeString("gathering ~A synsets~%");

    static private final SubLString $str_alt28$finding_verbs_with_mapped_hyperny = makeString("finding verbs with mapped hypernyms and related noun forms");

    public static SubLObject init_wordnet_import_offline_tasks_file() {
        defparameter("*WNI-MAX-NBR-SYNSET-CANDIDATES-HAVING-POS*", $int$100);
        return NIL;
    }

    public static SubLObject setup_wordnet_import_offline_tasks_file() {
        register_external_symbol(WNI_SET_MAX_NBR_SYNSET_CANDIDATES_HAVING_POS);
        register_external_symbol(WNI_CANDIDATES_FOR_EXACT_MATCHING);
        register_external_symbol(WNI_VERBS_WITH_RELATED_NOUNS_FOR_MATCHING);
        register_external_symbol(WNI_CANDIDATES_FOR_MATCHING);
        register_external_symbol(WNI_REFRESH_CONCEPT_MATCH_HTML_CACHE);
        register_external_symbol(WNI_UNMAPPED_HYPERNYMS_OF_INDIVIDUALS);
        register_external_symbol(WNI_TOPMOST_UNMAPPED_VERBS_FOR_MATCHING);
        register_external_symbol(WNI_VERB_CANDIDATES_FOR_SEMTRANS);
        register_external_symbol(WNI_DISJOINT_GENLS_INTEGRITY_TEST);
        register_external_symbol(WNI_UNASSERTING_REDUNDANT_GENLS);
        register_external_symbol(WNI_MARK_EXISTING_MAPPED_TERMS);
        return NIL;
    }

    static private final SubLString $str_alt30$gathered__A__A_synsets__ = makeString("gathered ~A ~A synsets~%");

    static private final SubLString $str_alt32$__selected__A__ = makeString("~%selected ~A~%");

    static private final SubLString $str_alt33$__ = makeString("\\\\");

    static private final SubLString $str_alt34$_ = makeString("\\");

    static private final SubLString $str_alt35$__error___A__ = makeString("~%error: ~A~%");

    static private final SubLString $str_alt37$gathering_candidate_synsets__ = makeString("gathering candidate synsets~%");

    static private final SubLString $str_alt38$gathered__A_synsets__ = makeString("gathered ~A synsets~%");

    @Override
    public void declareFunctions() {
        declare_wordnet_import_offline_tasks_file();
    }

    static private final SubLString $str_alt39$caching_concept_match_html = makeString("caching concept-match html");

    @Override
    public void initializeVariables() {
        init_wordnet_import_offline_tasks_file();
    }

    static private final SubLList $list_alt40 = list(reader_make_constant_shell("WordNetSynsetFn"), makeInteger(115839));

    @Override
    public void runTopLevelForms() {
        setup_wordnet_import_offline_tasks_file();
    }

    static private final SubLString $str_alt41$_A__ = makeString("~A~%");

    static {
    }

    static private final SubLString $str_alt43$gathering_individuals__ = makeString("gathering individuals~%");

    static private final SubLString $str_alt44$finding_unmapped_hypernyms_of_ind = makeString("finding unmapped hypernyms of individuals");

    static private final SubLString $str_alt49$gathering_lexification_candidate_ = makeString("gathering lexification candidate synsets~%");

    public static final SubLObject $const50$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForLexification");

    static private final SubLString $str_alt51$_A_candidate_synsets_for_lexifica = makeString("~A candidate synsets for lexification~%");

    static private final SubLString $str_alt52$_A_verb_candidate_synsets_for_lex = makeString("~A verb candidate synsets for lexification~%");

    static private final SubLString $str_alt53$_A_candidate_synsets_having_no_se = makeString("~A candidate synsets having no semtrans assertion~%");

    static private final SubLString $str_alt55$_A_candidate_synsets_having_a_dir = makeString("~A candidate synsets having a direct genls with a semtrans assertion~%");

    static private final SubLString $str_alt56$Making_workflow_status_assertions = makeString("Making workflow status assertions~%");

    public static final SubLObject $const57$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForVerbSemtrans");

    static private final SubLString $str_alt59$_A_has_disjoint_genls__A__ = makeString("~A has disjoint genls ~A~%");

    static private final SubLString $str_alt62$_A_has_redundant_genls__A__ = makeString("~A has redundant genls ~A~%");

    static private final SubLString $str_alt70$_home_reed_temp_new_transcript_1_ = makeString("/home/reed/temp/new-transcript-1.ts");

    static private final SubLString $str_alt77$_home_reed_temp_new_transcript_ts = makeString("/home/reed/temp/new-transcript.ts");

    static private final SubLString $str_alt79$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt82$_bgcolor__wheat_ = makeString(" bgcolor=\"wheat\"");

    static private final SubLString $str_alt84$_____A = makeString("~%~%~A");

    static private final SubLString $str_alt85$_tr = makeString("<tr");

    static private final SubLString $str_alt86$__td__img_src__yellow_gif__alt___ = makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><ahref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt87$__a___td__td__a_href__cg_wns_edit = makeString("</a></td><td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt88$__a___td__td__img_src__yellow_gif = makeString("</a></td><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt89$__a___td__td__input_type__checkbo = makeString("</a></td><td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"value=\"");

    static private final SubLString $str_alt90$_ = makeString(" ");

    static private final SubLString $str_alt91$____td___tr_ = makeString("\"></td></tr>");

    static private final SubLString $str_alt93$subsumes__a_href__cg_wns_edit_amp = makeString("subsumes <a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt94$__a_ = makeString("</a>");

    static private final SubLString $str_alt95$__td__img_src__yellow_gif__alt___ = makeString("><td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt96$__a___td___td__a_href__cg_wns_edi = makeString("</a></td>\n<td><a href=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt97$__a___td___td__img_src__yellow_gi = makeString("</a></td>\n<td><img src=\"yellow.gif\" alt=\"[Def]\" align=\"top\" border=\"0\"><a\nhref=\"cg?wns-edit&amp;100519742\" target=\"main\">");

    static private final SubLString $str_alt98$__a___td___td_ = makeString("</a></td>\n<td>");

    static private final SubLString $str_alt99$__td___td__input_type__checkbox__ = makeString("</td>\n<td><input type=\"checkbox\" name=\"genlPredsWRTTypes\"\nvalue=\"");

    static private final SubLString $str_alt100$____td____tr_ = makeString("\"></td>\n</tr>");
}

/**
 * Total time: 563 ms synthetic
 */
