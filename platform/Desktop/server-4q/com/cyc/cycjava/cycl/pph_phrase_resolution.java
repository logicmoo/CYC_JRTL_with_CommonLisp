package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_phrase_resolution extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_phrase_resolution";
    public static final String myFingerPrint = "05c4c76e577c5440d2d27f95a2ed081a3f5d0231984fb247bb605b88443de469";
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 1342L)
    private static SubLSymbol $pph_phrase_get_string_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 1398L)
    private static SubLSymbol $pph_phrase_get_string_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 13937L)
    private static SubLSymbol $pph_repeated_phrase_lists$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 33966L)
    private static SubLSymbol $pph_phrase_transform_nth_reference_phrase$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 55932L)
    private static SubLSymbol $pph_symbol_phrase_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 65611L)
    private static SubLSymbol $pph_coordination_phrase_nesting$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 65710L)
    private static SubLSymbol $pph_coordination_phrase_nesting_max$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 89343L)
    private static SubLSymbol $pph_english_lexical_indefinites$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103246L)
    private static SubLSymbol $pph_detp_nart_cached_caching_state$;
    private static final SubLString $str0$Unable_to_finish;
    private static final SubLString $str1$___A__S__;
    private static final SubLString $str2$Unfinished_dtr;
    private static final SubLInteger $int3$99;
    private static final SubLSymbol $kw4$PHRASE_CYCL;
    private static final SubLString $str5$_PPH_error_level_;
    private static final SubLString $str6$__;
    private static final SubLString $str7$__Exceeded_PPH_PHRASE_GET_STRING_;
    private static final SubLString $str8$__Resolved_conditional_phrase_to_;
    private static final SubLString $str9$Tried_to_generating_CycL_phrase_w;
    private static final SubLString $str10$Resolved_formerly_CycL_phrase_wit;
    private static final SubLString $str11$__Using_CycL_for_object___S___;
    private static final SubLString $str12$__Doing_anaphor_paraphrase_with_f;
    private static final SubLString $str13$__Doing_coordination_paraphrase_w;
    private static final SubLString $str14$__Suspending_bullet_use_for____S_;
    private static final SubLString $str15$__Turning_bullet_use_back_on___;
    private static final SubLString $str16$__Doing_chemical_formula_from_lis;
    private static final SubLString $str17$__Doing_percent_paraphrase___;
    private static final SubLString $str18$__Generating_symbol_paraphrase_of;
    private static final SubLString $str19$__Using_quoted_string_for_string_;
    private static final SubLString $str20$__Using_terse_paraphrase_for__S__;
    private static final SubLString $str21$__Using_precise_paraphrase_for__S;
    private static final SubLSymbol $sym22$PPH_PRECISION_P;
    private static final SubLString $str23$__Unknown_cycl_for__S___;
    private static final SubLString $str24$__Using_precision__S__;
    private static final SubLString $str25$__Using_quoted_paraphrase_for_ter;
    private static final SubLString $str26$Using__S_for_quoted_paraphrase_of;
    private static final SubLString $str27$__Using_nospace_paraphrase_for__S;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$PPH_HL_SUPPORTS_FOUND;
    private static final SubLSymbol $kw30$RESOLVED;
    private static final SubLObject $const31$PossessivePhrase;
    private static final SubLString $str32$Couldn_t_resolve_repeated_dtrs_fo;
    private static final SubLString $str33$__Starting_dtr_resolution_for_phr;
    private static final SubLString $str34$___D_of__D_daughters_unfinished_;
    private static final SubLString $str35$Can_t_resolve_mother_due_to_impos;
    private static final SubLString $str36$__Finished__S_iteration_s____D_of;
    private static final SubLString $str37$Couldn_t_finish__S___because_of_u;
    private static final SubLSymbol $kw38$NOT_RESOLVED;
    private static final SubLSymbol $sym39$PPH_PHRASE_P;
    private static final SubLString $str40$Problem_expanding_repeated_phrase;
    private static final SubLString $str41$PPH_REPEATED_PHRASE_EXPANSION_got;
    private static final SubLSymbol $sym42$_EXIT;
    private static final SubLString $str43$Repeating_phrase__S;
    private static final SubLString $str44$__etc_;
    private static final SubLString $str45$Can_t_get_current_list_item_from_;
    private static final SubLSymbol $kw46$UNSPECIFIED;
    private static final SubLList $list47;
    private static final SubLString $str48$Updating__S_to____S____Result___S;
    private static final SubLSymbol $sym49$PPH_CURRENT_LIST_ITEM_FORMULA_P;
    private static final SubLSymbol $sym50$PPH_CURRENT_LIST_ITEM_FORMULA_ITEM;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLString $str53$__Resolving__S_to__S__;
    private static final SubLList $list54;
    private static final SubLString $str55$;
    private static final SubLString $str56$__Phrase_agr___S__;
    private static final SubLString $str57$___Dtr__D_category_is__S___;
    private static final SubLString $str58$___Dtr__D_agr_is__S___;
    private static final SubLString $str59$__Set_agr_of_dtr___D_to__S___;
    private static final SubLString $str60$___Set_head_agr_to__S___;
    private static final SubLString $str61$__Finished__S____with__D_dtrs____;
    private static final SubLString $str62$___Set_phrase_agr_to__S_based_on_;
    private static final SubLString $str63$___Dtrs_left_unfinished___D___;
    private static final SubLSymbol $kw64$MOTHER;
    private static final SubLString $str65$__Agr_target__mother__not_resolve;
    private static final SubLString $str66$__Phrase_agrees_with_itself_____;
    private static final SubLString $str67$__Agr_target_not_resolved___S___;
    private static final SubLString $str68$_;
    private static final SubLString $str69$Setting_mother_s_output_list_from;
    private static final SubLString $str70$_Dth_dtr_output_list___S;
    private static final SubLSymbol $sym71$PPH_PHRASE_OUTPUT_ITEM_EMPTY_P;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$INCOMPLETE_PPH_PHRASE_P;
    private static final SubLString $str74$__Test_has_unresolved_indexical_p;
    private static final SubLString $str75$__Ran_conditional_test_____S___Re;
    private static final SubLString $str76$Pass;
    private static final SubLString $str77$Fail;
    private static final SubLString $str78$___Initial_winning_phrase_____S__;
    private static final SubLString $str79$___New_phrase___S___with_agr_pred;
    private static final SubLString $str80$___Phrase_has__D_daughters___;
    private static final SubLSymbol $sym81$PPH_NTH_PHRASE_NAUT_P;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$PPH_PHRASE_TRANSFORM_NTH;
    private static final SubLString $str84$Adding_alternatives_for_agr_targe;
    private static final SubLString $str85$Done__S_alternatives_of__S;
    private static final SubLString $str86$Added__D_alternatives_;
    private static final SubLSymbol $kw87$SUBJECT_VERB;
    private static final SubLSymbol $kw88$DET_NBAR;
    private static final SubLSymbol $kw89$PEER;
    private static final SubLSymbol $kw90$TENSE;
    private static final SubLString $str91$__Paraphrasing__S_with_agreement_;
    private static final SubLString $str92$___Output_list_is____S___;
    private static final SubLString $str93$___Arg_position_map_is__S___;
    private static final SubLString $str94$___SUID_is__S___;
    private static final SubLString $str95$_____of_dtrs___S___;
    private static final SubLString $str96$Can_t_resolve_string_of__S;
    private static final SubLSymbol $kw97$CYCL_PHRASE;
    private static final SubLString $str98$Sanity_check_failed__rm_cycl__S_i;
    private static final SubLString $str99$Must_use_reflexive_for____S___due;
    private static final SubLSymbol $kw100$SOURCE_POS;
    private static final SubLString $str101$__Using_arg0_for__S_with_formula_;
    private static final SubLSymbol $kw102$ARG0;
    private static final SubLString $str103$Supposedly___S_isn_t_part_of_old_;
    private static final SubLString $str104$Updated_conditional_test_to__S__;
    private static final SubLString $str105$Updated_test_to____S_using_non_te;
    private static final SubLString $str106$Updated_variable_bindings_query_t;
    private static final SubLString $str107$Updated_variable_bindings_query_t;
    private static final SubLString $str108$__Replacing__S_with__S___;
    private static final SubLList $list109;
    private static final SubLString $str110$Can_t_reconcile__S_and__S_;
    private static final SubLSymbol $kw111$NO_ACTION;
    private static final SubLString $str112$No_current_arg0_to_reserve_for__S;
    private static final SubLSymbol $kw113$NO_CURRENT_ARG0;
    private static final SubLSymbol $kw114$RESERVED_FOR_MATRIX_ARG0;
    private static final SubLSymbol $kw115$HTML;
    private static final SubLSymbol $sym116$_SYMBOL;
    private static final SubLObject $const117$atomicSymbol;
    private static final SubLList $list118;
    private static final SubLSymbol $kw119$SYMBOL;
    private static final SubLObject $const120$nameString;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$_CODE;
    private static final SubLObject $const123$htmlGlyphCode;
    private static final SubLList $list124;
    private static final SubLObject $const125$htmlStringVersionOfCharacter;
    private static final SubLObject $const126$termStrings;
    private static final SubLSymbol $kw127$DECLARATIVE;
    private static final SubLSymbol $kw128$INTERROGATIVE;
    private static final SubLSymbol $kw129$QUESTION;
    private static final SubLSymbol $kw130$DEFAULT;
    private static final SubLString $str131$_;
    private static final SubLString $str132$_;
    private static final SubLSymbol $kw133$NONE;
    private static final SubLSymbol $sym134$ALPHANUMERIC_CHAR_P;
    private static final SubLList $list135;
    private static final SubLInteger $int136$100;
    private static final SubLSymbol $sym137$POSITIVE_INTEGER_P;
    private static final SubLString $str138$Using_significant_digits_cutoff_o;
    private static final SubLString $str139$_;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$ALPHA_CHAR_P;
    private static final SubLString $str142$__Recursion_limit___S__exceeded_i;
    private static final SubLList $list143;
    private static final SubLSymbol $kw144$AND;
    private static final SubLString $str145$Changing_coordination_to__OR__bas;
    private static final SubLSymbol $kw146$OR;
    private static final SubLString $str147$Inserting_dummy_phrase__S;
    private static final SubLObject $const148$Noun;
    private static final SubLObject $const149$plural_Generic;
    private static final SubLObject $const150$singular_Generic;
    private static final SubLString $str151$__Setting_conjunctive_agr_of__S_t;
    private static final SubLObject $const152$No_NLAttr;
    private static final SubLObject $const153$Determiner;
    private static final SubLString $str154$Removed_det_sister_from_mother_;
    private static final SubLString $str155$subject_pointer_is_nth_phrase___S;
    private static final SubLString $str156$__Not_setting_subject_verb_agreem;
    private static final SubLSymbol $kw157$ANY;
    private static final SubLObject $const158$Verb;
    private static final SubLString $str159$__Using_internal_constraints___S_;
    private static final SubLString $str160$___filtered_from__S___;
    private static final SubLString $str161$__Setting_verb_agreement_to__S___;
    private static final SubLString $str162$Using_default_verb_form___S_;
    private static final SubLObject $const163$MeasurableQuantity;
    private static final SubLObject $const164$adjStrings;
    private static final SubLObject $const165$Adjective;
    private static final SubLString $str166$__This_phrase_s_agr_pred_is__S_bu;
    private static final SubLString $str167$__Set_adjective_peer_agreement_to;
    private static final SubLObject $const168$untensed;
    private static final SubLString $str169$__Set_untensed_peer_agreement_to_;
    private static final SubLString $str170$__Set_peer_agreement_to__S___;
    private static final SubLString $str171$__Set_peer_agreement_to_default__;
    private static final SubLObject $const172$tensed;
    private static final SubLString $str173$__Incorporating_tense_agreement__;
    private static final SubLString $str174$_S;
    private static final SubLString $str175$__Using_daughter__D_as_agreement_;
    private static final SubLObject $const176$BareForm_NLAttr;
    private static final SubLString $str177$__Using_hard_coded_null_determine;
    private static final SubLObject $const178$PossessivePronoun_Pre;
    private static final SubLSymbol $kw179$NEVER;
    private static final SubLString $str180$__Setting_det_nbar_agreement_for_;
    private static final SubLString $str181$__Using_null_determiner_for_posse;
    private static final SubLString $str182$__Setting_det_nbar_agreement_for_;
    private static final SubLString $str183$__Setting_determiner_s_agr_pred_f;
    private static final SubLString $str184$__Setting_agr_pred_from_determine;
    private static final SubLSymbol $sym185$EL_VAR_;
    private static final SubLString $str186$__Setting_determiner_nbar_agreeme;
    private static final SubLObject $const187$nonSingular_Generic;
    private static final SubLString $str188$__Setting_determiner_nbar_agreeme;
    private static final SubLString $str189$Couldn_t_determine_agreement_info;
    private static final SubLString $str190$PPH_PHRASE_DTR_NESTED_WITHIN__loo;
    private static final SubLString $str191$some;
    private static final SubLString $str192$__Nbar_is_now__S__;
    private static final SubLObject $const193$ExistingStuffType;
    private static final SubLString $str194$__Using_English_specific_indefini;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLList $list197;
    private static final SubLString $str198$Nbar_string_is__S__Output_list___;
    private static final SubLObject $const199$nounStrings;
    private static final SubLList $list200;
    private static final SubLSymbol $kw201$INDEX;
    private static final SubLObject $const202$Pronoun;
    private static final SubLObject $const203$verbStrings;
    private static final SubLSymbol $sym204$GENL_POS_PRED_;
    private static final SubLObject $const205$singularVerb_Generic;
    private static final SubLString $str206$__Subject_agr___S__;
    private static final SubLObject $const207$SecondPerson_NLAttr;
    private static final SubLObject $const208$secondPersonSg_Generic;
    private static final SubLObject $const209$secondPersonSg_Present;
    private static final SubLObject $const210$FirstPerson_NLAttr;
    private static final SubLObject $const211$firstPersonSg_Generic;
    private static final SubLObject $const212$firstPersonSg_Present;
    private static final SubLString $str213$__Using_tenses__S__;
    private static final SubLSymbol $sym214$PPH_FINITE_VERB_PRED_;
    private static final SubLSymbol $sym215$PPH_NON_PLURAL_NOUN_PRED_;
    private static final SubLSymbol $sym216$PPH_PLURAL_NOUN_PRED_;
    private static final SubLSymbol $sym217$PPH_PLURAL_VERB_PRED_;
    private static final SubLString $str218$__Using_tense__S__;
    private static final SubLObject $const219$nonPlural_Generic;
    private static final SubLObject $const220$pluralVerb_Generic;
    private static final SubLObject $const221$thirdPersonSg_Generic;
    private static final SubLString $str222$__Unifying__S_and__S_to__S___;
    private static final SubLString $str223$Using_agr_preds__S_from_done_head;
    private static final SubLString $str224$Couldn_t_unify__S_and__S___;
    private static final SubLString $str225$__AGRs_are_now____S_and____S___;
    private static final SubLSymbol $sym226$PPH_DETP_NART_CACHED;
    private static final SubLList $list227;
    private static final SubLSymbol $sym228$_PPH_DETP_NART_CACHED_CACHING_STATE_;
    private static final SubLString $str229$__Switching_arg1_and_arg2_in__S__;
    private static final SubLSymbol $kw230$ARG2;
    private static final SubLString $str231$Can_t_switch_arg1_and_arg2_in_rep;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 847L)
    public static SubLObject pph_note_unfinished_phrase(final SubLObject phrase, SubLObject message) {
        if (message == pph_phrase_resolution.UNPROVIDED) {
            message = (SubLObject)pph_phrase_resolution.$str0$Unable_to_finish;
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            pph_phrase_note_unfinished_dtrs(phrase);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str1$___A__S__, message, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 1089L)
    public static SubLObject pph_phrase_note_unfinished_dtrs(final SubLObject phrase) {
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                pph_phrase_note_unfinished_dtrs(dtr);
                if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                    pph_note_unfinished_phrase(dtr, (SubLObject)pph_phrase_resolution.$str2$Unfinished_dtr);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 1458L)
    public static SubLObject pph_phrase_get_string(final SubLObject phrase, SubLObject cycl, SubLObject matrix_phrase) {
        if (cycl == pph_phrase_resolution.UNPROVIDED) {
            cycl = (SubLObject)pph_phrase_resolution.$kw4$PHRASE_CYCL;
        }
        if (matrix_phrase == pph_phrase_resolution.UNPROVIDED) {
            matrix_phrase = (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_phrase_get_string_depth$.currentBinding(thread);
        try {
            pph_phrase_resolution.$pph_phrase_get_string_depth$.bind(number_utilities.f_1X(pph_phrase_resolution.$pph_phrase_get_string_depth$.getDynamicValue(thread)), thread);
            if (pph_phrase_resolution.$pph_phrase_get_string_depth$.getDynamicValue(thread).numG(pph_phrase_resolution.$pph_phrase_get_string_max_depth$.getDynamicValue(thread))) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str7$__Exceeded_PPH_PHRASE_GET_STRING_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase_resolution.$pph_phrase_get_string_max_depth$.getDynamicValue(thread), phrase));
            }
            if (pph_phrase_resolution.$kw4$PHRASE_CYCL == cycl) {
                cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            pph_phrase.pph_phrase_check_impossible(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                    pph_phrase_resolve_condition(phrase, cycl, matrix_phrase);
                    if (pph_phrase_resolution.NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
                        final SubLObject string = pph_phrase_get_string(phrase, cycl, matrix_phrase);
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str8$__Resolved_conditional_phrase_to_, string, pph_phrase.pph_phrase_agr(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                    }
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
                    pph_note_unfinished_phrase(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_cycl_phrase_p(phrase)) {
                    final SubLObject cycl_$1 = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    if (pph_phrase_resolution.NIL != pph_phrase.pph_unknown_cycl_p(cycl_$1)) {
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_phrase_resolution.$str9$Tried_to_generating_CycL_phrase_w, phrase);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        pph_phrase.pph_phrase_clear_special_type(phrase);
                        final SubLObject string2 = pph_phrase_get_string(phrase, cycl_$1, matrix_phrase);
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str10$Resolved_formerly_CycL_phrase_wit, string2, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                    }
                    else if (pph_phrase_resolution.NIL != cycl_variables.el_varP(cycl_$1)) {
                        final SubLObject olist = pph_methods.pph_paraphrase_var_as_var(cycl_$1, (SubLObject)pph_phrase_resolution.NIL, phrase);
                        pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                    else {
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str11$__Using_CycL_for_object___S___, cycl_$1, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_set_string(phrase, print_high.prin1_to_string(function_terms.nart_to_naut(cycl_$1)));
                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    }
                }
                else if (pph_phrase_resolution.NIL != anaphor_needed_for_phraseP(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str12$__Doing_anaphor_paraphrase_with_f, cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    if (pph_phrase_resolution.NIL != reflexive_needed_for_phraseP(phrase)) {
                        pph_phrase.pph_phrase_set_string(phrase, pph_methods_lexicon.pph_introduce_reflexive(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
                    }
                    else {
                        pph_methods_lexicon.pph_generate_pronoun(phrase);
                    }
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_coordination_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str13$__Doing_coordination_paraphrase_w, cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
                    final SubLObject bullets_okP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(mother, (SubLObject)pph_phrase_resolution.UNPROVIDED) || pph_vars.current_generation_level().numG(pph_vars.$pph_use_bulleted_lists_min_level$.getDynamicValue(thread)));
                    final SubLObject suspendP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread) && pph_phrase_resolution.NIL == bullets_okP);
                    final SubLObject _prev_bind_0_$2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread) && pph_phrase_resolution.NIL != bullets_okP), thread);
                        if (pph_phrase_resolution.NIL != suspendP && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str14$__Suspending_bullet_use_for____S_, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                        pph_coordination_phrase_get_string(phrase, cycl);
                        if (pph_phrase_resolution.NIL != suspendP && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str15$__Turning_bullet_use_back_on___, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                    }
                    finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_chemical_formula_from_lists_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str16$__Doing_chemical_formula_from_lis, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_chemical_formula_from_lists_phrase_get_string(phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_percent_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str17$__Doing_percent_paraphrase___, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_percent_phrase_get_string(phrase, cycl);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_symbol_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str18$__Generating_symbol_paraphrase_of, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_symbol_phrase_get_string(phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_string_mention_phrase_p(phrase) && pph_phrase_resolution.NIL != pph_string.pph_string_p(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str19$__Using_quoted_string_for_string_, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_string(pph_phrase.pph_phrase_head_dtr(phrase), format_nil.format_nil_a(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(phrase)) {
                    pph_quoted_phrase_get_string(phrase, matrix_phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
                    pph_nospace_phrase_get_string(phrase, cycl, matrix_phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_terse_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str20$__Using_terse_paraphrase_for__S__, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
                    final SubLObject _prev_bind_0_$3 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_terse_modeP$.bind((SubLObject)pph_phrase_resolution.T, thread);
                        pph_phrase_get_string(dtr, cycl, matrix_phrase);
                    }
                    finally {
                        pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_$3, thread);
                    }
                    pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), (SubLObject)pph_phrase_resolution.NIL);
                    pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    pph_phrase.pph_phrase_note_done(phrase);
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_precise_phrase_p(phrase)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str21$__Using_precise_paraphrase_for__S, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
                    assert pph_phrase_resolution.NIL != pph_utilities.pph_precision_p((SubLObject)pph_phrase_resolution.T) : pph_phrase_resolution.T;
                    final SubLObject _prev_bind_0_$4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind((SubLObject)pph_phrase_resolution.T, thread);
                        pph_vars.$pph_ambiguous_strings$.bind((pph_phrase_resolution.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_phrase_resolution.EQUALP), (SubLObject)pph_phrase_resolution.UNPROVIDED), thread);
                        pph_phrase_get_string(dtr, cycl, matrix_phrase);
                    }
                    finally {
                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$4, thread);
                    }
                    pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), (SubLObject)pph_phrase_resolution.NIL);
                    pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    pph_phrase.pph_phrase_note_done(phrase);
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    pph_phrase_get_string_from_dtrs(phrase, cycl);
                }
                else {
                    if (pph_phrase_resolution.NIL != pph_phrase.pph_unknown_cycl_p(cycl) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase_resolution.$str23$__Unknown_cycl_for__S___, phrase);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    final SubLObject argnum = (SubLObject)((pph_phrase_resolution.NIL != el_utilities.el_formula_p(cycl) && pph_phrase_resolution.NIL == pph_utilities.pph_formula_with_dotsP(cycl)) ? Sequences.position(function_terms.nart_to_naut(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)), cycl, Symbols.symbol_function((SubLObject)pph_phrase_resolution.EQUAL), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED) : pph_phrase_resolution.NIL);
                    assert pph_phrase_resolution.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(argnum, cycl)) : pph_utilities.paraphrase_precision_for_arg(argnum, cycl);
                    final SubLObject _prev_bind_0_$5 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(argnum, cycl), thread);
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str24$__Using_precision__S__, pph_utilities.pph_current_precision(), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                        pph_phrase_resolve_string(phrase, matrix_phrase);
                    }
                    finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
        }
        finally {
            pph_phrase_resolution.$pph_phrase_get_string_depth$.rebind(_prev_bind_0, thread);
        }
        pph_drs.pph_possibly_update_np_index(phrase);
        pph_phrase_maybe_throw_hl_supports(phrase);
        return Values.values(pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 6935L)
    public static SubLObject pph_quoted_phrase_get_string(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str25$__Using_quoted_paraphrase_for_ter, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject agr_preds = pph_utilities.pph_default_nl_preds_for_term(cycl);
        pph_phrase.pph_phrase_set_agr_preds(dtr, agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str26$Using__S_for_quoted_paraphrase_of, agr_preds, cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
        try {
            pph_vars.$pph_type_level_violations$.bind((SubLObject)pph_phrase_resolution.NIL, thread);
            pph_phrase_get_string(dtr, cycl, matrix_phrase);
            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(dtr) && pph_phrase_resolution.NIL == string_utilities.starts_with(pph_phrase.pph_phrase_string(dtr, (SubLObject)pph_phrase_resolution.NIL), constant_reader.constant_reader_prefix())) {
                final SubLObject force = pph_utilities.pph_default_force_for_term(cycl);
                final SubLObject olist = pph_phrase.pph_phrase_output_list(dtr);
                final SubLObject string = pph_phrase.pph_phrase_output_list_string(pph_phrase_output_list_add_sentential_force(olist, force), (SubLObject)pph_phrase_resolution.NIL);
                pph_phrase.pph_phrase_set_string(dtr, string);
                pph_phrase_set_output_list_from_finished_dtrs(phrase);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        finally {
            pph_vars.$pph_type_level_violations$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 8089L)
    public static SubLObject pph_nospace_phrase_get_string(final SubLObject phrase, final SubLObject cycl, final SubLObject matrix_phrase) {
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str27$__Using_nospace_paraphrase_for__S, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        pph_phrase_get_string(dtr, cycl, matrix_phrase);
        pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), (SubLObject)pph_phrase_resolution.NIL);
        pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        pph_phrase.pph_phrase_note_done(phrase);
        pph_phrase.pph_phrase_set_output_list(phrase, pph_nospace_phrase_output_list_from_dtr(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_note_done(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 8670L)
    public static SubLObject pph_phrase_maybe_throw_hl_supports(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread)) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_strings(phrase, (SubLObject)pph_phrase_resolution.NIL);
            SubLObject string = (SubLObject)pph_phrase_resolution.NIL;
            string = cdolist_list_var.first();
            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                maybe_throw_pph_hl_supports(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), string, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase.pph_phrase_gather_supports(phrase));
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            }
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 9048L)
    public static SubLObject maybe_throw_pph_hl_supports(final SubLObject v_term, final SubLObject string, final SubLObject agr_preds, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != list_utilities.non_empty_list_p(supports) && pph_phrase_resolution.NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
            SubLObject current;
            final SubLObject datum = current = pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread);
            SubLObject target_term = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject target_string = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject target_preds = (SubLObject)pph_phrase_resolution.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list28);
            target_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list28);
            target_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list28);
            target_preds = current.first();
            current = current.rest();
            if (pph_phrase_resolution.NIL == current) {
                if (string.equal(target_string) && pph_phrase_resolution.NIL != czer_utilities.equals_elP(v_term, target_term, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_utilities.pph_filter_preds(target_preds, agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                    Dynamic.sublisp_throw((SubLObject)pph_phrase_resolution.$kw29$PPH_HL_SUPPORTS_FOUND, supports);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase_resolution.$list28);
            }
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 9606L)
    public static SubLObject pph_nospace_phrase_output_list_from_dtr(final SubLObject dtr) {
        SubLObject gdtr_olists = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject gdtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(dtr).isVector()) {
            final SubLObject vector_var = document.sign_constituents(dtr);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject gdtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                gdtr = Vectors.aref(vector_var, element_num);
                gdtr_olists = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_output_list(gdtr), gdtr_olists);
                gdtr_num = Numbers.add(gdtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(Sequences.nreverse(gdtr_olists)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 10036L)
    public static SubLObject pph_phrase_get_string_from_dtrs(final SubLObject phrase, final SubLObject formula) {
        pph_phrase.pph_phrase_set_subject_case(phrase);
        final SubLObject the_pred = pph_phrase.pph_agr_pred_from_coordinated_np_number(phrase);
        if (pph_phrase_resolution.NIL != the_pred) {
            pph_phrase.pph_phrase_add_agr_pred(phrase, the_pred);
        }
        final SubLObject resolvedP = pph_phrase_try_to_resolve_dtr_strings(phrase, formula);
        if (resolvedP == pph_phrase_resolution.$kw30$RESOLVED) {
            pph_phrase_set_output_list_from_finished_dtrs(phrase);
            if (pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED).eql(pph_phrase_resolution.$const31$PossessivePhrase)) {
                pph_main.possessivize_pph_phrase(phrase);
            }
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return Values.values(pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 11017L)
    public static SubLObject pph_phrase_try_to_resolve_dtr_strings(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject successP = (SubLObject)pph_phrase_resolution.NIL;
        final SubLObject repeated_phrase_dtrs_resolvedP = pph_phrase_resolve_repeated_phrase_dtrs(phrase, formula);
        if (pph_phrase_resolution.NIL == repeated_phrase_dtrs_resolvedP) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str32$Couldn_t_resolve_repeated_dtrs_fo, phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            abortP = (SubLObject)pph_phrase_resolution.T;
        }
        if (pph_phrase_resolution.NIL == abortP) {
            SubLObject unfinished_dtr_count = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject iteration_count = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str33$__Starting_dtr_resolution_for_phr, pph_phrase.pph_phrase_suid(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            SubLObject new_unfinished_count;
            SubLObject dtr_num;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (new_unfinished_count = (SubLObject)pph_phrase_resolution.NIL, new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase); pph_phrase_resolution.NIL == abortP && !new_unfinished_count.isZero() && !unfinished_dtr_count.eql(new_unfinished_count); new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase)) {
                unfinished_dtr_count = new_unfinished_count;
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str34$___D_of__D_daughters_unfinished_, unfinished_dtr_count, pph_phrase.pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    vector_var = document.sign_constituents(phrase);
                    backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (pph_phrase_resolution.NIL == abortP) {
                            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_impossible_p(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                                    Errors.warn((SubLObject)pph_phrase_resolution.$str35$Can_t_resolve_mother_due_to_impos, dtr);
                                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                abortP = (SubLObject)pph_phrase_resolution.T;
                            }
                            else {
                                pph_phrase_try_to_resolve_dtr_string(dtr, dtr_num, formula, phrase);
                            }
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    }
                }
                iteration_count = Numbers.add(iteration_count, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str36$__Finished__S_iteration_s____D_of, iteration_count, pph_phrase.pph_phrase_unfinished_dtr_count(phrase), pph_phrase.pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            successP = Numbers.zerop(new_unfinished_count);
            if (pph_phrase_resolution.NIL == successP) {
                SubLObject unfinished_dtrs = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject dtr_num2 = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var2 = document.sign_constituents(phrase);
                    final SubLObject backwardP_var2 = (SubLObject)pph_phrase_resolution.NIL;
                    SubLObject length2;
                    SubLObject v_iteration2;
                    SubLObject element_num2;
                    SubLObject dtr2;
                    for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)pph_phrase_resolution.NIL, v_iteration2 = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        element_num2 = ((pph_phrase_resolution.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration2);
                        dtr2 = Vectors.aref(vector_var2, element_num2);
                        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(dtr2)) {
                            unfinished_dtrs = (SubLObject)ConsesLow.cons(dtr2, unfinished_dtrs);
                        }
                        dtr_num2 = Numbers.add(dtr_num2, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    }
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase_resolution.$str37$Couldn_t_finish__S___because_of_u, phrase, unfinished_dtrs);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                pph_note_unfinished_phrase(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        if (pph_phrase_resolution.NIL != successP) {
            return (SubLObject)pph_phrase_resolution.$kw30$RESOLVED;
        }
        return (SubLObject)pph_phrase_resolution.$kw38$NOT_RESOLVED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 12915L)
    public static SubLObject pph_phrase_resolve_repeated_phrase_dtrs(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dtrs = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject found_repeated_phrase_dtrP = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject problemP = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject expansion;
            SubLObject cdolist_list_var;
            SubLObject new_dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_resolution.NIL == problemP) {
                    if (pph_phrase_resolution.NIL == pph_phrase.pph_repeated_phrase_p(dtr)) {
                        new_dtrs = (SubLObject)ConsesLow.cons(dtr, new_dtrs);
                    }
                    else {
                        found_repeated_phrase_dtrP = (SubLObject)pph_phrase_resolution.T;
                        pph_phrase.pph_phrase_set_arg_position_map(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                        expansion = pph_repeated_phrase_expansion(dtr, formula);
                        if (pph_phrase_resolution.NIL != list_utilities.non_empty_list_of_type_p((SubLObject)pph_phrase_resolution.$sym39$PPH_PHRASE_P, expansion)) {
                            cdolist_list_var = expansion;
                            new_dtr = (SubLObject)pph_phrase_resolution.NIL;
                            new_dtr = cdolist_list_var.first();
                            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                                new_dtrs = (SubLObject)ConsesLow.cons(new_dtr, new_dtrs);
                                cdolist_list_var = cdolist_list_var.rest();
                                new_dtr = cdolist_list_var.first();
                            }
                        }
                        else {
                            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                                Errors.warn((SubLObject)pph_phrase_resolution.$str40$Problem_expanding_repeated_phrase, dtr);
                                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            problemP = (SubLObject)pph_phrase_resolution.T;
                        }
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        if (pph_phrase_resolution.NIL != found_repeated_phrase_dtrP) {
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, Sequences.nreverse(new_dtrs), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == problemP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 13992L)
    public static SubLObject pph_repeated_phrase_expansion(final SubLObject repeated_phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL == el_utilities.el_formula_p(formula)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str41$PPH_REPEATED_PHRASE_EXPANSION_got, formula);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)ConsesLow.list(repeated_phrase);
        }
        final SubLObject first_phrase = pph_phrase.pph_phrase_nth_dtr(repeated_phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        final SubLObject first_cycl = pph_phrase.pph_phrase_cycl(first_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject make_generic_arg_sequenceP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(first_phrase) && pph_phrase_resolution.NIL != pph_utilities.pph_arg_position_specifierP(first_cycl));
        return (pph_phrase_resolution.NIL != make_generic_arg_sequenceP) ? pph_generic_arg_sequence(first_phrase, formula) : pph_repeated_phrase_expansion_internal(repeated_phrase, first_phrase, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 14875L)
    public static SubLObject pph_repeated_phrase_expansion_internal(final SubLObject repeated_phrase, final SubLObject first_phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_repeated_phrase_lists$.currentBinding(thread);
        try {
            pph_phrase_resolution.$pph_repeated_phrase_lists$.bind((SubLObject)pph_phrase_resolution.NIL, thread);
            final SubLObject first_arg_position = pph_phrase.pph_repeated_phrase_first_arg_position(repeated_phrase);
            final SubLObject first_arg_num = list_utilities.last_one(first_arg_position);
            final SubLObject first_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(first_arg_position);
            final SubLObject sub_formula = cycl_utilities.hl_to_el((pph_phrase_resolution.NIL != list_utilities.lengthG(first_arg_position, (SubLObject)pph_phrase_resolution.ONE_INTEGER, (SubLObject)pph_phrase_resolution.UNPROVIDED)) ? cycl_utilities.formula_arg_position(formula, conses_high.butlast(first_arg_position, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED) : formula);
            final SubLObject formula_arity = el_utilities.formula_arity(sub_formula, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            SubLObject all_phrases = (SubLObject)pph_phrase_resolution.NIL;
            if (!formula_arity.isInteger()) {
                all_phrases = (SubLObject)ConsesLow.cons(first_phrase, all_phrases);
            }
            else if (first_arg_num.numLE(formula_arity)) {
                all_phrases = (SubLObject)ConsesLow.cons(first_phrase, all_phrases);
                SubLObject curr_arg_num;
                for (curr_arg_num = (SubLObject)pph_phrase_resolution.NIL, curr_arg_num = number_utilities.f_1X(first_arg_num); !curr_arg_num.numG(formula_arity); curr_arg_num = number_utilities.f_1X(curr_arg_num)) {
                    all_phrases = (SubLObject)ConsesLow.cons(pph_one_repeated_phrase(first_phrase, first_arg_position, first_cycl_template, curr_arg_num), all_phrases);
                }
                all_phrases = Sequences.nreverse(all_phrases);
            }
            SubLObject cdolist_list_var = all_phrases;
            SubLObject phrase = (SubLObject)pph_phrase_resolution.NIL;
            phrase = cdolist_list_var.first();
            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$6 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_keep_generic_argsP$.bind((SubLObject)pph_phrase_resolution.T, thread);
                    final SubLObject map = pph_phrase.pph_phrase_arg_position_map(repeated_phrase);
                    pph_phrase_replace_generic_args(phrase, formula, map);
                }
                finally {
                    pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0_$6, thread);
                }
                pph_phrase_resolve_current_list_items(phrase);
                pph_phrase.pph_phrase_try_to_resolve_binding_phrases(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                pph_repeated_phrase_increment();
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
            return all_phrases;
        }
        finally {
            pph_phrase_resolution.$pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 16430L)
    public static SubLObject pph_one_repeated_phrase(final SubLObject first_phrase, final SubLObject first_arg_position, final SubLObject first_cycl_template, final SubLObject curr_arg_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_arg_phrase = pph_phrase.pph_phrase_copy(first_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject curr_arg_position = list_utilities.replace_last(first_arg_position, curr_arg_num);
        final SubLObject curr_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(curr_arg_position);
        pph_phrase.pph_phrase_cycl_subst(curr_cycl_template, first_cycl_template, curr_arg_phrase, Symbols.symbol_function((SubLObject)pph_phrase_resolution.EQUAL), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase.pph_phrase_cycl(curr_arg_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(first_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase_resolution.$str43$Repeating_phrase__S, curr_arg_phrase);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return curr_arg_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 17038L)
    public static SubLObject pph_generic_arg_sequence(final SubLObject first_phrase, final SubLObject formula) {
        SubLObject all_phrases = (SubLObject)pph_phrase_resolution.NIL;
        pph_phrase.pph_phrase_set_string(first_phrase, Sequences.cconcatenate(pph_phrase.pph_phrase_string(first_phrase, (SubLObject)pph_phrase_resolution.NIL), (SubLObject)pph_phrase_resolution.$str44$__etc_));
        all_phrases = (SubLObject)ConsesLow.cons(first_phrase, all_phrases);
        return all_phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 17318L)
    public static SubLObject pph_current_list_item(final SubLObject list_expression, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL == pph_extensional_list_p(list_expression)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str45$Can_t_get_current_list_item_from_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(list_expression));
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject first_index = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        SubLObject index = pph_lookup_current_list_item(list_expression);
        if (pph_phrase_resolution.$kw46$UNSPECIFIED == index) {
            index = first_index;
            pph_phrase_resolution.$pph_repeated_phrase_lists$.setDynamicValue(list_utilities.alist_enter(pph_phrase_resolution.$pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, index, (SubLObject)pph_phrase_resolution.UNPROVIDED), thread);
        }
        return ConsesLow.nth(Numbers.add(index, offset), cycl_utilities.formula_args(list_expression, (SubLObject)pph_phrase_resolution.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 17844L)
    public static SubLObject pph_lookup_current_list_item(final SubLObject list_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(pph_phrase_resolution.$pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, Symbols.symbol_function((SubLObject)pph_phrase_resolution.EQUAL), (SubLObject)pph_phrase_resolution.$kw46$UNSPECIFIED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 17997L)
    public static SubLObject pph_extensional_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != el_utilities.el_formula_p(v_object) && pph_phrase_resolution.NIL != formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)pph_phrase_resolution.$list47));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 18148L)
    public static SubLObject pph_phrase_resolve_current_list_items(final SubLObject phrase) {
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(phrase) && pph_phrase_resolution.NIL == pph_phrase.pph_repeated_phrase_p(phrase)) {
            final SubLObject old_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            final SubLObject new_cycl = pph_resolve_current_list_items(old_cycl);
            pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
            if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                final SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
                final SubLObject new_test = pph_resolve_current_list_items(old_test);
                pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
                if (!old_test.equal(new_test) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str48$Updating__S_to____S____Result___S, old_test, new_test, pph_phrase.pph_conditional_phrase_test(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        pph_phrase_resolve_current_list_items(dtr);
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    }
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 19196L)
    public static SubLObject pph_resolve_current_list_items(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, (SubLObject)pph_phrase_resolution.$sym49$PPH_CURRENT_LIST_ITEM_FORMULA_P, (SubLObject)pph_phrase_resolution.$sym50$PPH_CURRENT_LIST_ITEM_FORMULA_ITEM, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 19377L)
    public static SubLObject pph_current_list_item_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != el_utilities.el_formula_p(v_object) && pph_phrase_resolution.NIL != formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)pph_phrase_resolution.$list51));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 19609L)
    public static SubLObject pph_current_list_item_formula_item(final SubLObject cli_formula) {
        SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(cli_formula, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        SubLObject list_expression = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject offset = (SubLObject)pph_phrase_resolution.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list52);
        list_expression = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list52);
        offset = current.first();
        current = current.rest();
        if (pph_phrase_resolution.NIL == current) {
            ans = pph_current_list_item(list_expression, offset);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase_resolution.$list52);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str53$__Resolving__S_to__S__, cli_formula, ans, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 19902L)
    public static SubLObject pph_repeated_phrase_increment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_alist = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject cdolist_list_var = pph_phrase_resolution.$pph_repeated_phrase_lists$.getDynamicValue(thread);
        SubLObject cons = (SubLObject)pph_phrase_resolution.NIL;
        cons = cdolist_list_var.first();
        while (pph_phrase_resolution.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject list_expression = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject index = (SubLObject)pph_phrase_resolution.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list54);
            list_expression = current.first();
            current = (index = current.rest());
            new_alist = list_utilities.alist_enter(new_alist, list_expression, number_utilities.f_1X(index), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        pph_phrase_resolution.$pph_repeated_phrase_lists$.setDynamicValue(new_alist, thread);
        return pph_phrase_resolution.$pph_repeated_phrase_lists$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 20207L)
    public static SubLObject pph_phrase_try_to_resolve_dtr_string(final SubLObject dtr, final SubLObject dtr_num, final SubLObject formula, final SubLObject phrase) {
        if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(dtr)) {
            pph_phrase_resolve_condition(dtr, formula, phrase);
        }
        if (pph_phrase_resolution.NIL == pph_phrase.pph_conditional_phrase_p(dtr)) {
            pph_phrase_set_dtr_relative_agr(dtr, dtr_num, phrase);
            pph_note_phraseXdtr_agr(dtr, dtr_num, phrase);
            if (pph_phrase_resolution.NIL != pph_phrase.pph_clarifying_phrase_p(dtr)) {
                if (pph_phrase_resolution.NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                    pph_phrase_resolve_clarifying_dtr(dtr, dtr_num, phrase, formula);
                }
                else {
                    pph_phrase.pph_phrase_note_not_done(dtr);
                    pph_note_unfinished_phrase(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(dtr)) {
                pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
                if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                    pph_phrase_unify_pos_preds(phrase, dtr);
                }
            }
            else if (pph_phrase_resolution.NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                pph_phrase_resolve_dtr(dtr, dtr_num, phrase, formula);
            }
            else {
                pph_note_unfinished_phrase(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 21281L)
    public static SubLObject pph_phrase_resolve_clarifying_dtr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase, final SubLObject formula) {
        final SubLObject target = pph_phrase_agr_target_phrase(dtr, phrase);
        final SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject target_string = pph_phrase.pph_phrase_string(target, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != uninformative_paraphrase_p(target_string, target_cycl)) {
            pph_phrase.pph_phrase_note_done(dtr);
        }
        else {
            pph_phrase.pph_phrase_set_string(dtr, (SubLObject)pph_phrase_resolution.$str55$);
        }
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 21690L)
    public static SubLObject pph_note_phraseXdtr_agr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase) {
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str56$__Phrase_agr___S__, pph_phrase.pph_phrase_agr(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str57$___Dtr__D_category_is__S___, dtr_num, pph_phrase.pph_phrase_category(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str58$___Dtr__D_agr_is__S___, dtr_num, pph_phrase.pph_phrase_agr_preds(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 21980L)
    public static SubLObject pph_phrase_set_dtr_relative_agr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase) {
        final SubLObject dtr_agr = pph_phrase.pph_phrase_agr(dtr);
        final SubLObject relative_agr_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(dtr_agr);
        final SubLObject relative_constraint_type = (SubLObject)((pph_phrase_resolution.NIL != pph_utilities.pph_agr_constraint_p(relative_agr_constraint)) ? pph_utilities.pph_agr_constraint_type(relative_agr_constraint) : pph_phrase_resolution.NIL);
        final SubLObject old_target = (SubLObject)((pph_phrase_resolution.NIL != pph_utilities.pph_agr_constraint_typeP(relative_constraint_type)) ? pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type) : pph_phrase_resolution.NIL);
        pph_phrase_set_relative_agr(dtr, phrase);
        if (pph_phrase_resolution.NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            if (pph_phrase_resolution.NIL != old_target && !pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type).equal(old_target) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str59$__Set_agr_of_dtr___D_to__S___, dtr_num, pph_phrase.pph_phrase_agr_constraint_of_type(dtr, relative_constraint_type), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                pph_phrase_unify_pos_preds(phrase, dtr);
                if (pph_phrase_resolution.NIL != old_target && !old_target.equal(pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type)) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str60$___Set_head_agr_to__S___, pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
        }
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 23213L)
    public static SubLObject pph_phrase_resolve_dtr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase, final SubLObject formula) {
        pph_phrase_get_string(dtr, formula, phrase);
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(dtr)) {
            pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str61$__Finished__S____with__D_dtrs____, dtr, pph_phrase.pph_phrase_dtr_count(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str62$___Set_phrase_agr_to__S_based_on_, pph_phrase.pph_phrase_agr(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str63$___Dtrs_left_unfinished___D___, pph_phrase.pph_phrase_unfinished_dtr_count(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        else {
            pph_note_unfinished_phrase(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 24040L)
    public static SubLObject pph_phrase_set_arg0_items(final SubLObject phrase, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase_resolution.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        pph_phrase_maybe_make_arg0_item(phrase, arg_position_map);
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 24474L)
    public static SubLObject pph_phrase_maybe_make_arg0_item(final SubLObject dtr, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase_resolution.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(dtr) && pph_phrase_resolution.NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && pph_phrase_resolution.NIL != pph_phrase_ok_for_arg0P(dtr)) {
            final SubLObject arg0 = pph_phrase_reserved_arg0(dtr);
            final SubLObject arg0_position = pph_phrase_reserved_arg0_position(dtr);
            SubLObject global_arg0_position = pph_utilities.pph_arg_position_lookup(arg0_position, arg_position_map);
            if (pph_phrase_resolution.NIL != pph_utilities.pph_unknown_arg_position_p(global_arg0_position)) {
                global_arg0_position = pph_phrase.pph_current_arg0_position();
            }
            if (pph_phrase_resolution.NIL != pph_utilities.pph_arg_position_p(global_arg0_position) && pph_phrase_resolution.NIL == pph_phrase.pph_unknown_cycl_p(arg0)) {
                pph_phrase_make_arg0_item(dtr, arg0, global_arg0_position);
            }
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 25283L)
    public static SubLObject pph_phrase_make_arg0_item(final SubLObject dtr, final SubLObject arg0, final SubLObject global_arg_position) {
        pph_phrase.pph_phrase_set_arg_position(dtr, global_arg_position);
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_cycl(dtr, arg0);
        }
        pph_phrase.pph_phrase_set_link_cycl(dtr, arg0);
        pph_phrase.pph_phrase_set_output_list_cycl(dtr, arg0);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
        return pph_phrase.pph_phrase_output_list(dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 25692L)
    public static SubLObject pph_phrase_independent_phraseP(final SubLObject phrase) {
        return Types.sublisp_null(pph_data_structures.pph_phrase_agr_relative_constraint(pph_phrase.pph_phrase_agr(phrase)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 25905L)
    public static SubLObject pph_phrase_agr_target_resolvedP(final SubLObject phrase, final SubLObject mother, SubLObject mother_must_be_doneP) {
        if (mother_must_be_doneP == pph_phrase_resolution.UNPROVIDED) {
            mother_must_be_doneP = (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != pph_phrase_independent_phraseP(phrase)) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        final SubLObject agr_target_phrase = pph_phrase_agr_target_phrase(phrase, mother);
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(agr_target_phrase)) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        if (agr_target_phrase == pph_phrase_resolution.$kw64$MOTHER) {
            if (pph_phrase_resolution.NIL != mother_must_be_doneP) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str65$__Agr_target__mother__not_resolve, agr_target_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                return (SubLObject)pph_phrase_resolution.NIL;
            }
            return (SubLObject)pph_phrase_resolution.T;
        }
        else {
            if (phrase.eql(agr_target_phrase)) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase_resolution.$str66$__Phrase_agrees_with_itself_____);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return (SubLObject)pph_phrase_resolution.T;
            }
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str67$__Agr_target_not_resolved___S___, agr_target_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            return (SubLObject)pph_phrase_resolution.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 26661L)
    public static SubLObject pph_phrase_set_output_list_from_finished_dtrs(final SubLObject phrase) {
        if (pph_phrase_resolution.NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
            pph_phrase.pph_phrase_set_output_list(phrase, pph_nospace_phrase_output_list_from_dtr(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER)), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        else if (pph_phrase_resolution.NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(phrase)) {
            final SubLObject nospace_olist = pph_nospace_phrase_output_list_from_dtr(phrase);
            final SubLObject nospace_item = list_utilities.only_one(nospace_olist);
            final SubLObject old_items = pph_data_structures.pph_phrase_output_item_nospace_group_items(nospace_item);
            final SubLObject new_items = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item((SubLObject)pph_phrase_resolution.$str68$_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)), list_utilities.add_to_end((SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item((SubLObject)pph_phrase_resolution.$str68$_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)), old_items));
            pph_data_structures.pph_phrase_output_item_nospace_group_set_items(nospace_item, new_items);
            pph_phrase.pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(nospace_item), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        else {
            SubLObject output_items = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject new_format_string;
                SubLObject dtr_output_list;
                SubLObject cdolist_list_var;
                SubLObject dtr_item;
                SubLObject insert_position;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                        new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str69$Setting_mother_s_output_list_from) });
                        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED), dtr));
                    }
                    dtr_output_list = pph_phrase.pph_phrase_output_list(dtr);
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str70$_Dth_dtr_output_list___S, dtr_num, dtr_output_list, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    cdolist_list_var = dtr_output_list;
                    dtr_item = (SubLObject)pph_phrase_resolution.NIL;
                    dtr_item = cdolist_list_var.first();
                    while (pph_phrase_resolution.NIL != cdolist_list_var) {
                        if (pph_phrase_resolution.NIL != output_items && pph_phrase_resolution.NIL != pph_utilities.pph_final_punctuation_string_p(pph_data_structures.pph_phrase_output_item_string(dtr_item)) && pph_phrase_resolution.NIL != pph_utilities.pph_bulleted_list_end_itemP(output_items.first())) {
                            insert_position = (SubLObject)((pph_phrase_resolution.NIL != pph_utilities.pph_bulleted_list_item_end_itemP(conses_high.second(output_items))) ? pph_phrase_resolution.TWO_INTEGER : pph_phrase_resolution.ONE_INTEGER);
                            output_items = list_utilities.ninsert_by_position(dtr_item, output_items, insert_position);
                        }
                        else {
                            output_items = (SubLObject)ConsesLow.cons(dtr_item, output_items);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        dtr_item = cdolist_list_var.first();
                    }
                    if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                        pph_phrase.pph_phrase_set_agr_preds(phrase, pph_phrase.pph_phrase_agr_preds(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
            pph_phrase.pph_phrase_set_output_list(phrase, Sequences.nreverse(Sequences.delete_if((SubLObject)pph_phrase_resolution.$sym71$PPH_PHRASE_OUTPUT_ITEM_EMPTY_P, output_items, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 28723L)
    public static SubLObject pph_phrase_output_item_empty_p(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != list_utilities.lengthE(pph_data_structures.pph_phrase_output_item_string(item), (SubLObject)pph_phrase_resolution.ZERO_INTEGER, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_open_tag(item)) && pph_phrase_resolution.NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_close_tag(item)) && pph_phrase_resolution.NIL == pph_phrase.pph_known_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 29065L)
    public static SubLObject pph_phrase_arg0_item(final SubLObject arg0, final SubLObject arg0_strings, SubLObject arg0_position) {
        if (arg0_position == pph_phrase_resolution.UNPROVIDED) {
            arg0_position = (SubLObject)pph_phrase_resolution.$list72;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject open_tag = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject close_tag = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != arg0_position && pph_phrase_resolution.NIL != pph_vars.$pph_link_arg0P$.getDynamicValue(thread) && pph_phrase_resolution.NIL != pph_html.pph_use_anchor_tags_for_termP(arg0)) {
            thread.resetMultipleValues();
            final SubLObject open_tag_$7 = pph_html.pph_anchor_tags_for_term(arg0);
            final SubLObject close_tag_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            open_tag = open_tag_$7;
            close_tag = close_tag_$8;
        }
        final SubLObject arg0_item = pph_data_structures.new_pph_phrase_output_item(pph_utilities.clean_bunge_nreverse(arg0_strings, (SubLObject)pph_phrase_resolution.UNPROVIDED), arg0_position, arg0, open_tag, close_tag, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        return arg0_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 29517L)
    public static SubLObject reverse_string_list_term_anchor(final SubLObject strings, final SubLObject v_term) {
        return pph_html.string_term_anchor(pph_utilities.clean_bunge_nreverse(strings, (SubLObject)pph_phrase_resolution.UNPROVIDED), v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 29652L)
    public static SubLObject pph_phrase_arg_dtrs(final SubLObject phrase) {
        SubLObject arg_dtrs = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_resolution.NIL != pph_phrase_arg_phraseP(dtr)) {
                    arg_dtrs = (SubLObject)ConsesLow.cons(dtr_num, arg_dtrs);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return Sequences.nreverse(arg_dtrs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 29935L)
    public static SubLObject pph_phrase_arg_phraseP(final SubLObject phrase) {
        SubLObject arg_phraseP = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL == arg_phraseP) {
            SubLObject csome_list_var = pph_phrase.pph_phrase_output_list(phrase);
            SubLObject item = (SubLObject)pph_phrase_resolution.NIL;
            item = csome_list_var.first();
            while (pph_phrase_resolution.NIL == arg_phraseP && pph_phrase_resolution.NIL != csome_list_var) {
                final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                arg_phraseP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != arg_position && !arg_position.equal((SubLObject)pph_phrase_resolution.$list72));
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        if (pph_phrase_resolution.NIL != arg_phraseP) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != ans || pph_phrase_resolution.NIL != pph_phrase_arg_phraseP(dtr));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
            return ans;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 30520L)
    public static SubLObject pph_phrase_arg0_phraseP(final SubLObject phrase) {
        SubLObject arg_phraseP = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL == arg_phraseP) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = pph_phrase.pph_phrase_output_list(phrase), item = (SubLObject)pph_phrase_resolution.NIL, item = csome_list_var.first(); pph_phrase_resolution.NIL == arg_phraseP && pph_phrase_resolution.NIL != csome_list_var; arg_phraseP = Equality.equal((SubLObject)pph_phrase_resolution.$list72, pph_data_structures.pph_phrase_output_item_arg_position(item)), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
        }
        if (pph_phrase_resolution.NIL != arg_phraseP) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != ans || pph_phrase_resolution.NIL != pph_phrase_arg0_phraseP(dtr));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
            return ans;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 31026L)
    public static SubLObject pph_phrase_resolve_condition(final SubLObject phrase, final SubLObject formula, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_template = pph_phrase.pph_conditional_phrase_test(phrase);
        final SubLObject test = pph_phrase_resolve_indexicals_in_test(test_template, formula, matrix_phrase);
        if (pph_phrase_resolution.NIL != cycl_utilities.expression_find_if((SubLObject)pph_phrase_resolution.$sym73$INCOMPLETE_PPH_PHRASE_P, test, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str74$__Test_has_unresolved_indexical_p, test);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return phrase;
        }
        final SubLObject successP = pph_utilities.pph_ask_boolean(test, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str75$__Ran_conditional_test_____S___Re, test, (SubLObject)((pph_phrase_resolution.NIL != successP) ? pph_phrase_resolution.$str76$Pass : pph_phrase_resolution.$str77$Fail), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject resolved_phrase = (pph_phrase_resolution.NIL != successP) ? pph_phrase.pph_conditional_phrase_values(phrase).first() : conses_high.second(pph_phrase.pph_conditional_phrase_values(phrase));
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str78$___Initial_winning_phrase_____S__, resolved_phrase, pph_phrase.pph_phrase_agr_preds(resolved_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(resolved_phrase)) {
            pph_phrase_resolve_condition(resolved_phrase, formula, matrix_phrase);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind((SubLObject)pph_phrase_resolution.T, thread);
            final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
            final SubLObject just = pph_phrase.pph_phrase_justification(phrase);
            pph_phrase.pph_phrase_copy(resolved_phrase, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            pph_phrase.pph_phrase_set_mother(phrase, mother);
            SubLObject cdolist_list_var = just;
            SubLObject justification = (SubLObject)pph_phrase_resolution.NIL;
            justification = cdolist_list_var.first();
            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                pph_phrase.pph_phrase_add_justification(phrase, justification);
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
            }
        }
        finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str79$___New_phrase___S___with_agr_pred, phrase, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str80$___Phrase_has__D_daughters___, pph_phrase.pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 32828L)
    public static SubLObject incomplete_pph_phrase_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(obj, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 33000L)
    public static SubLObject pph_phrase_resolve_indexicals_in_test(SubLObject dnf_template, final SubLObject formula, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != el_utilities.el_formula_p(formula) && pph_phrase_resolution.NIL != pph_utilities.pph_cycl_template_p(dnf_template)) {
            dnf_template = pph_utilities.pph_apply_template(dnf_template, formula);
        }
        dnf_template = pph_utilities.pph_resolve_indexicals(dnf_template, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_repeated_phrase_lists$.currentBinding(thread);
        try {
            pph_phrase_resolution.$pph_repeated_phrase_lists$.bind((SubLObject)pph_phrase_resolution.NIL, thread);
            dnf_template = pph_resolve_current_list_items(dnf_template);
        }
        finally {
            pph_phrase_resolution.$pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
        }
        if (pph_phrase_resolution.NIL != cycl_utilities.expression_find_if((SubLObject)pph_phrase_resolution.$sym81$PPH_NTH_PHRASE_NAUT_P, dnf_template, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            dnf_template = pph_phrase_resolve_nth_phrases(dnf_template, phrase);
        }
        return dnf_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 33663L)
    public static SubLObject pph_nth_phrase_naut_p(final SubLObject obj) {
        if (pph_phrase_resolution.NIL != el_utilities.possibly_fo_naut_p(obj)) {
            final SubLObject expanded = pph_templates.pph_expand_phrase_nauts(obj);
            return formula_pattern_match.formula_matches_pattern(expanded, (SubLObject)pph_phrase_resolution.$list82);
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 34115L)
    public static SubLObject pph_phrase_resolve_nth_phrases(final SubLObject dnf_template, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
        final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$.currentBinding(thread);
        try {
            pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$.bind(phrase, thread);
            ans = cycl_utilities.expression_transform(dnf_template, (SubLObject)pph_phrase_resolution.$sym81$PPH_NTH_PHRASE_NAUT_P, (SubLObject)pph_phrase_resolution.$sym83$PPH_PHRASE_TRANSFORM_NTH, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        finally {
            pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 34479L)
    public static SubLObject pph_phrase_transform_nth(final SubLObject nth_phrase_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expanded = pph_templates.pph_expand_phrase_nauts(nth_phrase_naut);
        final SubLObject n = cycl_utilities.nat_arg2(expanded, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject dtr_num = number_utilities.f_1_(n);
        return (SubLObject)(pph_phrase.pph_phrase_dtr_count(pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread)).numG(dtr_num) ? pph_phrase.pph_phrase_nth_dtr(pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread), dtr_num) : pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 34917L)
    public static SubLObject pph_phrase_set_relative_agr(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        SubLObject number_added = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(target, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(target) && pph_phrase_resolution.NIL != list_utilities.empty_list_p(pph_phrase.pph_phrase_local_alternatives(phrase))) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str84$Adding_alternatives_for_agr_targe, target, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            final SubLObject queue = queues.create_queue((SubLObject)pph_phrase_resolution.UNPROVIDED);
            SubLObject done_count = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            queues.enqueue(target, queue);
            while (pph_phrase_resolution.NIL == queues.queue_empty_p(queue)) {
                final SubLObject ignore_me = queues.dequeue(queue);
                SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                SubLObject alternative_target = (SubLObject)pph_phrase_resolution.NIL;
                alternative_target = cdolist_list_var.first();
                while (pph_phrase_resolution.NIL != cdolist_list_var) {
                    final SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_phrase_resolution.NIL, (SubLObject)pph_phrase_resolution.NIL);
                    pph_phrase.pph_phrase_set_relative_agr_target(alternative_phrase, alternative_target);
                    pph_phrase_set_relative_agr_internal(alternative_phrase, matrix_phrase);
                    pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                    number_added = Numbers.add(number_added, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    done_count = Numbers.add(done_count, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str85$Done__S_alternatives_of__S) });
                        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, target));
                    }
                    queues.enqueue(alternative_target, queue);
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative_target = cdolist_list_var.first();
                }
            }
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str86$Added__D_alternatives_, number_added, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return pph_phrase_set_relative_agr_internal(phrase, matrix_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 35780L)
    public static SubLObject pph_phrase_set_relative_agr_internal(final SubLObject phrase, final SubLObject matrix_phrase) {
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase_resolution.$kw87$SUBJECT_VERB)) {
            pph_phrase_set_subject_verb_agreement(phrase, matrix_phrase);
        }
        else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase_resolution.$kw88$DET_NBAR)) {
            pph_phrase_set_det_nbar_agreement(phrase, matrix_phrase);
        }
        else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase_resolution.$kw89$PEER)) {
            pph_phrase_set_peer_agreement(phrase, matrix_phrase);
        }
        else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase_resolution.$kw90$TENSE)) {
            pph_phrase_set_tense_agreement(phrase, matrix_phrase);
        }
        return pph_phrase.pph_phrase_agr(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 36390L)
    public static SubLObject pph_phrase_resolve_string(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase_set_relative_agr(phrase, matrix_phrase);
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (pph_phrase_resolution.NIL != pph_types.pph_lexical_wordP(pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
                pph_methods_lexicon.pph_phrase_resolve_string_from_word(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
                pph_utilities.pph_possibly_nartify_phrase(phrase);
                pph_utilities.pph_phrase_rephrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                if (pph_phrase_resolution.NIL != cycl_grammar.el_variable_p(cycl)) {
                    pph_methods_formulas.maybe_register_var_by_arg_constraints(cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str91$__Paraphrasing__S_with_agreement_, cycl, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str92$___Output_list_is____S___, pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str93$___Arg_position_map_is__S___, pph_phrase.pph_phrase_arg_position_map(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str94$___SUID_is__S___, pph_phrase.pph_phrase_suid(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str95$_____of_dtrs___S___, pph_phrase.pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str96$Can_t_resolve_string_of__S, phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 37617L)
    public static SubLObject anaphor_needed_for_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread) && pph_phrase_resolution.NIL == pph_vars.pph_generate_alternative_phrasesP() && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
            final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            v_answer = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_drs.pph_discourse_referentP(phrase_cycl) && pph_phrase_resolution.NIL == pph_macros.pph_mapped_string_for_term(phrase_cycl) && (pph_phrase_resolution.NIL == cycl_variables.el_varP(phrase_cycl) || pph_phrase_resolution.NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP(phrase_cycl)) && pph_phrase_resolution.NIL != pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, (SubLObject)pph_phrase_resolution.T) && pph_phrase_resolution.NIL != pph_drs.pph_anaphoric_to_backward_looking_centerP(phrase) && (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_has_ancestor_of_categoryP(phrase, pph_utilities.pph_np_category()) || pph_phrase_resolution.$const31$PossessivePhrase.eql(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) && pph_phrase_resolution.NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP(phrase_cycl) && pph_phrase_resolution.NIL != pph_category_ok_for_anaphorP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 38743L)
    public static SubLObject pph_category_ok_for_anaphorP(final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.$kw97$CYCL_PHRASE == category || pph_phrase_resolution.NIL != pph_utilities.pph_npP(category) || pph_phrase_resolution.$const31$PossessivePhrase.eql(category));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 39004L)
    public static SubLObject reflexive_needed_for_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL == pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, (SubLObject)pph_phrase_resolution.T)) {
                return (SubLObject)pph_phrase_resolution.NIL;
            }
            if (pph_phrase_resolution.$const31$PossessivePhrase.eql(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
                return (SubLObject)pph_phrase_resolution.NIL;
            }
            final SubLObject rm_phrases = pph_drs.pph_discourse_phrases_for_cycl(phrase_cycl);
            final SubLObject subject_domain = pph_phrase_subject_domain(phrase);
            SubLObject cdolist_list_var = rm_phrases;
            SubLObject rm_phrase = (SubLObject)pph_phrase_resolution.NIL;
            rm_phrase = cdolist_list_var.first();
            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                if (!phrase.eql(rm_phrase) && pph_phrase_resolution.NIL != pph_data_structures.valid_pph_phrase_p(rm_phrase)) {
                    if ((pph_phrase_resolution.NIL == pph_phrase.pph_phrase_p(rm_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED) || !pph_phrase.pph_phrase_cycl(rm_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED).equal(phrase_cycl)) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase_resolution.$str98$Sanity_check_failed__rm_cycl__S_i, pph_phrase.pph_phrase_cycl(rm_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), phrase_cycl);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    if (pph_phrase_resolution.NIL != pph_phrase_dtr_nested_withinP(rm_phrase, subject_domain)) {
                        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str99$Must_use_reflexive_for____S___due, phrase, rm_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        }
                        return (SubLObject)pph_phrase_resolution.T;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                rm_phrase = cdolist_list_var.first();
            }
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 40045L)
    public static SubLObject pph_phrase_source_pos(final SubLObject phrase, SubLObject v_default) {
        if (v_default == pph_phrase_resolution.UNPROVIDED) {
            v_default = (SubLObject)pph_phrase_resolution.NIL;
        }
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase_resolution.$kw100$SOURCE_POS, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 40180L)
    public static SubLObject pph_phrase_set_source_pos(final SubLObject phrase, final SubLObject pos) {
        return pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase_resolution.$kw100$SOURCE_POS, pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 40292L)
    public static SubLObject pph_phrase_replace_generic_args(final SubLObject phrase, final SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase_resolution.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (pph_phrase_resolution.NIL == pph_phrase.pph_repeated_phrase_p(phrase)) {
            pph_phrase_replace_generic_args_top_level(phrase, formula, arg_position_map);
            pph_phrase_replace_generic_args_recursive(phrase, formula, arg_position_map);
        }
        return pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 44694L)
    public static SubLObject pph_phrase_replace_generic_args_top_level(final SubLObject phrase, final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_template = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject apply_templateP = (SubLObject)SubLObjectFactory.makeBoolean(!cycl_template.equal(formula) && pph_phrase_resolution.NIL != pph_utilities.pph_cycl_template_p(cycl_template));
        SubLObject new_cycl = cycl_template;
        if (pph_phrase_resolution.NIL != apply_templateP) {
            new_cycl = pph_utilities.pph_apply_template(cycl_template, formula);
        }
        if (pph_phrase_resolution.NIL != pph_utilities.pph_cycl_template_p(pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            pph_phrase.pph_phrase_set_wu(phrase, pph_utilities.pph_apply_template(pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), formula));
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_update_generic_args_in_conditional_test(phrase, formula);
        }
        else if (pph_phrase_resolution.NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
            pph_phrase_update_generic_args_in_variable_binding_query(phrase, formula);
        }
        if (pph_phrase_resolution.NIL != pph_utilities.pph_arg_position_specifierP(cycl_template) && pph_phrase_resolution.NIL == pph_kept_generic_arg_phrase_p(phrase)) {
            pph_phrase_replace_generic_arg_simple(phrase, cycl_template, new_cycl, arg_position_map);
        }
        else if (pph_phrase_resolution.NIL != pph_utilities.pph_cycl_template_p(cycl_template) && (pph_phrase_resolution.NIL == pph_vars.$pph_keep_generic_argsP$.getDynamicValue(thread) || pph_phrase_resolution.NIL == pph_utilities.pph_cycl_template_p(formula))) {
            pph_phrase.pph_phrase_register_local_arg_positions(phrase, arg_position_map);
        }
        else if (pph_phrase_resolution.NIL != pph_utilities.pph_known_arg_position_p(pph_utilities.pph_arg_position_lookup((SubLObject)pph_phrase_resolution.$list72, arg_position_map)) && pph_phrase_resolution.NIL != pph_phrase.pph_unknown_cycl_p(cycl_template) && pph_phrase_resolution.NIL != pph_phrase_ok_for_arg0P(phrase)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str101$__Using_arg0_for__S_with_formula_, phrase, pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_phrase_resolution.$list72, arg_position_map);
            final SubLObject formula_to_use = pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread);
            final SubLObject arg0 = cycl_utilities.formula_arg0(formula_to_use);
            pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
            pph_phrase.pph_phrase_set_cycl(phrase, arg0);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, arg0);
            final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_phrase_resolution.$kw102$ARG0);
            pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
        }
        else if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str103$Supposedly___S_isn_t_part_of_old_, cycl_template);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
        }
        else if (pph_phrase_resolution.NIL != pph_utilities.pph_identity_map_p(pph_phrase.pph_phrase_arg_position_map(phrase))) {
            pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
        }
        if (pph_phrase_resolution.NIL == pph_kept_generic_arg_phrase_p(phrase) && pph_phrase_resolution.NIL == pph_phrase.pph_unknown_cycl_p(cycl_template)) {
            pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
        }
        pph_phrase.pph_phrase_sanity_check_cycl(phrase);
        return Values.values(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), pph_phrase.pph_phrase_arg_position_map(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 47624L)
    public static SubLObject pph_phrase_update_generic_args_in_conditional_test(final SubLObject phrase, final SubLObject formula) {
        final SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
        final SubLObject new_test = pph_utilities.pph_apply_template(old_test, formula);
        if (!old_test.equal(new_test)) {
            pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str104$Updated_conditional_test_to__S__, pph_phrase.pph_conditional_phrase_test(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            if (pph_phrase_resolution.NIL == pph_utilities.pph_cycl_template_p(formula) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str105$Updated_test_to____S_using_non_te, pph_phrase.pph_conditional_phrase_test(phrase), formula, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return new_test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 48187L)
    public static SubLObject pph_phrase_update_generic_args_in_variable_binding_query(final SubLObject phrase, final SubLObject formula) {
        final SubLObject old_query_template = pph_phrase.pph_variable_binding_phrase_query_template(phrase);
        final SubLObject new_query_template = pph_utilities.pph_apply_template(old_query_template, formula);
        if (!old_query_template.equal(new_query_template)) {
            pph_phrase.pph_variable_binding_phrase_set_query_template(phrase, new_query_template);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str106$Updated_variable_bindings_query_t, new_query_template, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            if (pph_phrase_resolution.NIL == pph_utilities.pph_cycl_template_p(formula) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str107$Updated_variable_bindings_query_t, new_query_template, formula, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return new_query_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 48862L)
    public static SubLObject pph_phrase_replace_generic_arg_simple(final SubLObject phrase, final SubLObject cycl_template, final SubLObject new_cycl, final SubLObject arg_position_map) {
        final SubLObject local_arg_position = pph_utilities.pph_arg_position_from_template(cycl_template);
        final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str108$__Replacing__S_with__S___, cycl_template, new_cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
        pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
        pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
        final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, cycl_template);
        pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 49533L)
    public static SubLObject pph_kept_generic_arg_phrase_p(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != at_admitted.generic_arg_p(cycl) && pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.NIL).equal(pph_utilities.add_quotes_smart(cycl)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 49750L)
    public static SubLObject pph_phrase_ok_for_arg0P(final SubLObject phrase) {
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject result = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_phrase_reserved_for_arg0_p(phrase) && pph_phrase_resolution.NIL != pph_utilities.pph_unknown_arg_position_p(pph_phrase.pph_phrase_arg_position(phrase)) && pph_phrase_resolution.NIL != list_utilities.lengthL(pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_phrase_resolution.TWO_INTEGER, (SubLObject)pph_phrase_resolution.UNPROVIDED) && (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_wu(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED) || (pph_phrase_resolution.NIL != pph_string.non_empty_pph_stringP(string) && pph_phrase_resolution.NIL == pph_utilities.pph_final_punctuation_string_p(string))));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 50305L)
    public static SubLObject pph_phrase_replace_generic_args_recursive(final SubLObject phrase, final SubLObject formula, final SubLObject arg_position_map) {
        SubLObject new_cycl;
        final SubLObject old_cycl = new_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_types.pph_phrase_nautP(new_cycl)) {
            final SubLObject category = pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            SubLObject local_arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            if (pph_phrase_resolution.NIL != agr_pred) {
                new_cycl = (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), agr_pred, new_cycl);
                local_arg_position_map = pph_utilities.pph_contextualize_map((SubLObject)pph_phrase_resolution.$list109, local_arg_position_map);
            }
            if (pph_phrase_resolution.NIL != category) {
                new_cycl = (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), category, new_cycl);
                local_arg_position_map = pph_utilities.pph_contextualize_map((SubLObject)pph_phrase_resolution.$list109, local_arg_position_map);
            }
            final SubLObject best_phrase = pph_phrase.new_pph_phrase_for_cycl(new_cycl, local_arg_position_map, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(best_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                pph_phrase.pph_phrase_copy(best_phrase, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            if (category.eql(pph_phrase_resolution.$const31$PossessivePhrase) && pph_phrase_resolution.NIL != pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
                pph_phrase.pph_phrase_set_category(phrase, category, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL != category && pph_phrase_resolution.NIL == pph_phrase.pph_phrase_reconcile_categories(category, pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str110$Can_t_reconcile__S_and__S_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(category, pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
            }
        }
        else {
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_replace_generic_args(dtr, formula, arg_position_map);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
        }
        return Values.values((pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) ? pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED) : pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase.pph_phrase_arg_position_map(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 52102L)
    public static SubLObject pph_phrase_reserve_matrix_arg0_cycl(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_arg0 = pph_phrase.pph_current_arg0();
        final SubLObject current_arg0_position = pph_phrase.pph_current_arg0_position();
        SubLObject result = (SubLObject)pph_phrase_resolution.$kw111$NO_ACTION;
        if (pph_phrase_resolution.NIL != pph_phrase.pph_unknown_cycl_p(current_arg0)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str112$No_current_arg0_to_reserve_for__S, phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            result = (SubLObject)pph_phrase_resolution.$kw113$NO_CURRENT_ARG0;
        }
        else {
            result = pph_phrase_reserve_arg0(phrase, current_arg0, current_arg0_position);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 52559L)
    public static SubLObject pph_phrase_reset_arg0_reservations(final SubLObject phrase, final SubLObject out, final SubLObject in, final SubLObject arg_position_map) {
        pph_phrase_reset_arg0_reservations_int(phrase, out, in, arg_position_map);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 52814L)
    public static SubLObject pph_phrase_reset_arg0_reservations_int(final SubLObject phrase, final SubLObject out, final SubLObject in, final SubLObject arg_position_map) {
        if (pph_phrase_reserved_arg0(phrase).equal(out)) {
            final SubLObject local_arg_position = pph_phrase_reserved_arg0_position(phrase);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            pph_phrase_reserve_arg0(phrase, in, arg_position);
        }
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                pph_phrase_reset_arg0_reservations_int(dtr, out, in, arg_position_map);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 53306L)
    public static SubLObject pph_phrase_reserve_arg0(final SubLObject phrase, final SubLObject arg0, final SubLObject arg0_position) {
        final SubLObject result = (SubLObject)ConsesLow.cons(arg0, arg0_position);
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase_resolution.$kw114$RESERVED_FOR_MATRIX_ARG0, (SubLObject)pph_phrase_resolution.ONE_INTEGER, result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 53530L)
    public static SubLObject pph_phrase_reserved_arg0(final SubLObject phrase) {
        final SubLObject pair = pph_phrase_reserved_arg0_low(phrase);
        return pair.isCons() ? pair.first() : pph_phrase.pph_unknown_cycl();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 53711L)
    public static SubLObject pph_phrase_reserved_arg0_low(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase_resolution.$kw114$RESERVED_FOR_MATRIX_ARG0, (SubLObject)pph_phrase_resolution.ONE_INTEGER, (SubLObject)pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 53861L)
    public static SubLObject pph_phrase_reserved_arg0_position(final SubLObject phrase) {
        final SubLObject pair = pph_phrase_reserved_arg0_low(phrase);
        return pair.isCons() ? pair.rest() : pph_utilities.pph_unknown_arg_position();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 54059L)
    public static SubLObject pph_phrase_reserved_for_arg0_p(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == pph_phrase.pph_unknown_cycl_p(pph_phrase_reserved_arg0(phrase)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 54189L)
    public static SubLObject pph_chemical_formula_from_lists_phrase_get_string(final SubLObject phrase) {
        SubLObject element_list = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject quantity_list = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject pcase_var;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                pcase_var = dtr_num;
                if (pcase_var.eql((SubLObject)pph_phrase_resolution.ZERO_INTEGER)) {
                    element_list = pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    quantity_list = pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        final SubLObject item = pph_output_item_from_atomic_composition_lists(element_list, quantity_list);
        pph_phrase.pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(item), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        pph_phrase.pph_phrase_note_done(phrase);
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 54747L)
    public static SubLObject pph_output_item_from_atomic_composition_lists(final SubLObject element_list, final SubLObject quantity_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_items = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject abortP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == el_utilities.el_list_p(element_list) || pph_phrase_resolution.NIL == el_utilities.el_list_p(quantity_list) || pph_phrase_resolution.NIL == list_utilities.same_length_p(el_utilities.el_list_items(element_list), el_utilities.el_list_items(quantity_list)));
        if (pph_phrase_resolution.NIL == abortP) {
            SubLObject element = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject element_$9 = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject quantity = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject quantity_$10 = (SubLObject)pph_phrase_resolution.NIL;
            element = cycl_utilities.formula_args(element_list, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            element_$9 = element.first();
            quantity = cycl_utilities.formula_args(quantity_list, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            quantity_$10 = quantity.first();
            while (pph_phrase_resolution.NIL == abortP && (pph_phrase_resolution.NIL != quantity || pph_phrase_resolution.NIL != element)) {
                final SubLObject atomic_symbol = pph_atomic_symbol(element_$9);
                if (atomic_symbol.isString()) {
                    output_items = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase_output_item(atomic_symbol, (SubLObject)pph_phrase_resolution.NIL, element_$9, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED), output_items);
                }
                else {
                    abortP = (SubLObject)pph_phrase_resolution.T;
                }
                if (quantity_$10.isInteger() && quantity_$10.numG((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    final SubLObject quantity_item = pph_data_structures.new_pph_phrase_output_item(print_high.princ_to_string(quantity_$10), (SubLObject)pph_phrase_resolution.NIL, quantity_$10, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_phrase_resolution.$kw115$HTML) {
                        pph_html.pph_phrase_output_item_subscript(quantity_item);
                    }
                    output_items = (SubLObject)ConsesLow.cons(quantity_item, output_items);
                }
                element = element.rest();
                element_$9 = element.first();
                quantity = quantity.rest();
                quantity_$10 = quantity.first();
            }
        }
        return (SubLObject)((pph_phrase_resolution.NIL != abortP) ? pph_phrase_resolution.NIL : pph_data_structures.new_pph_phrase_output_item_nospace_group(Sequences.nreverse(output_items)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 55779L)
    public static SubLObject pph_atomic_symbol(final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_ask_variable((SubLObject)pph_phrase_resolution.$sym116$_SYMBOL, (SubLObject)ConsesLow.listS(pph_phrase_resolution.$const117$atomicSymbol, element, (SubLObject)pph_phrase_resolution.$list118), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_phrase_resolution.NIL, (SubLObject)pph_phrase_resolution.ONE_INTEGER).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 56024L)
    public static SubLObject pph_symbol_phrase_get_string(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject symbol = pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase_resolution.$kw119$SYMBOL, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject string = pph_symbol_string(symbol);
        if (pph_phrase_resolution.NIL != pph_string.pph_string_p(string)) {
            pph_phrase.pph_phrase_set_string(phrase, string);
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase_resolution.$const120$nameString, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        else if (pph_phrase_resolution.NIL != subl_promotions.memberP(phrase, pph_phrase_resolution.$pph_symbol_phrase_stack$.getDynamicValue(thread), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            pph_methods.generate_princ(phrase);
        }
        else {
            final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_symbol_phrase_stack$.currentBinding(thread);
            try {
                pph_phrase_resolution.$pph_symbol_phrase_stack$.bind((SubLObject)ConsesLow.cons(phrase, pph_phrase_resolution.$pph_symbol_phrase_stack$.getDynamicValue(thread)), thread);
                pph_phrase.pph_phrase_set_category(phrase, (SubLObject)pph_phrase_resolution.$list121, (SubLObject)pph_phrase_resolution.NIL);
                pph_phrase.pph_phrase_set_cycl(phrase, symbol);
                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            finally {
                pph_phrase_resolution.$pph_symbol_phrase_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 56705L)
    public static SubLObject pph_symbol_string(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL == kb_indexing_datastructures.indexed_term_p(symbol)) {
            return pph_main.generate_phrase_no_checks(symbol, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        SubLObject string = pph_utilities.pph_ask_variable((SubLObject)pph_phrase_resolution.$sym122$_CODE, (SubLObject)ConsesLow.listS(pph_phrase_resolution.$const123$htmlGlyphCode, symbol, (SubLObject)pph_phrase_resolution.$list124), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED).first();
        if (!string.isString()) {
            string = pph_utilities.pph_ask_variable((SubLObject)pph_phrase_resolution.$sym122$_CODE, (SubLObject)ConsesLow.listS(pph_phrase_resolution.$const125$htmlStringVersionOfCharacter, symbol, (SubLObject)pph_phrase_resolution.$list124), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED).first();
        }
        if (!string.isString()) {
            string = pph_methods_lexicon.some_name_for_term(symbol, pph_phrase_resolution.$const126$termStrings, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
        if (string.isString() && pph_phrase_resolution.NIL != string_utilities.html_escaped_string_p(string)) {
            return unicode_strings.html_escaped_to_unicode_vector(string);
        }
        return pph_string.pph_string_from_cycl_string(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 57431L)
    public static SubLObject pph_phrase_output_list_add_sentential_force(final SubLObject olist, final SubLObject force) {
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE)) {
            pph_phrase_output_list_upcase_leading_smart(olist);
            pph_phrase_output_list_add_period_smart(olist);
        }
        else if (force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            pph_phrase_output_list_upcase_leading_smart(olist);
            pph_phrase_output_list_add_question_mark_smart(olist);
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 57920L)
    public static SubLObject pph_phrase_add_sentential_force(final SubLObject phrase, SubLObject force) {
        if (pph_phrase_resolution.$kw130$DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED));
        }
        final SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
        pph_phrase_output_list_add_sentential_force(olist, force);
        pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 58263L)
    public static SubLObject pph_string_add_sentence_initial_force(final SubLObject string, final SubLObject force) {
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            return pph_utilities.upcase_leading_smart(string);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 58540L)
    public static SubLObject pph_string_add_sentence_final_force(final SubLObject string, final SubLObject force) {
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE)) {
            return pph_string_add_punctuation_smart(string, (SubLObject)pph_phrase_resolution.$str131$_);
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            return pph_string_add_punctuation_smart(string, (SubLObject)pph_phrase_resolution.$str132$_);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 58896L)
    public static SubLObject pph_phrase_output_list_has_sentential_forceP(final SubLObject olist, final SubLObject force) {
        final SubLObject string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_phrase_resolution.NIL);
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != upcased_leading_smartP(string) && pph_phrase_resolution.NIL != ends_with_period_smartP(string));
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != upcased_leading_smartP(string) && pph_phrase_resolution.NIL != ends_with_question_mark_smartP(string));
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw133$NONE)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == upcased_leading_smartP(string));
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 59374L)
    public static SubLObject pph_string_has_sentential_forceP(final SubLObject string, final SubLObject force) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_string_has_sentence_initial_forceP(string, force) && pph_phrase_resolution.NIL != pph_string_has_sentence_final_forceP(string, force));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 59569L)
    public static SubLObject pph_string_has_sentence_initial_forceP(final SubLObject string, final SubLObject force) {
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE)) {
            return upcased_leading_smartP(string);
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            return upcased_leading_smartP(string);
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw133$NONE)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == upcased_leading_smartP(string));
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 59859L)
    public static SubLObject pph_string_has_sentence_final_forceP(final SubLObject string, final SubLObject force) {
        if (force.eql((SubLObject)pph_phrase_resolution.$kw127$DECLARATIVE)) {
            return ends_with_period_smartP(string);
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw128$INTERROGATIVE) || force.eql((SubLObject)pph_phrase_resolution.$kw129$QUESTION)) {
            return ends_with_question_mark_smartP(string);
        }
        if (force.eql((SubLObject)pph_phrase_resolution.$kw133$NONE)) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 60119L)
    public static SubLObject pph_phrase_output_list_upcase_leading_smart(final SubLObject olist) {
        if (pph_phrase_resolution.NIL == olist) {
            return Values.values(olist, (SubLObject)pph_phrase_resolution.NIL);
        }
        SubLObject cdolist_list_var = olist;
        SubLObject item = (SubLObject)pph_phrase_resolution.NIL;
        item = cdolist_list_var.first();
        while (pph_phrase_resolution.NIL != cdolist_list_var) {
            final SubLObject string = pph_data_structures.pph_phrase_output_item_string(item);
            if (pph_phrase_resolution.NIL != pph_string.non_empty_pph_stringP(string) && pph_phrase_resolution.NIL != pph_string.pph_string_find_if((SubLObject)pph_phrase_resolution.$sym134$ALPHANUMERIC_CHAR_P, string)) {
                final SubLObject new_car = pph_phrase_output_item_upcase_leading_smart(item);
                final SubLObject position = Sequences.position(item, olist, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                list_utilities.nreplace_nth(position, new_car, olist);
                return Values.values(olist, (SubLObject)pph_phrase_resolution.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Values.values(olist, (SubLObject)pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 60757L)
    public static SubLObject pph_phrase_output_item_upcase_leading_smart(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject olists = pph_data_structures.pph_phrase_output_item_nospace_group_items(item);
            SubLObject new_olists = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject new_nth_olist = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject n = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            SubLObject upcased_n = (SubLObject)pph_phrase_resolution.NIL;
            if (pph_phrase_resolution.NIL == upcased_n) {
                SubLObject csome_list_var = olists;
                SubLObject olist = (SubLObject)pph_phrase_resolution.NIL;
                olist = csome_list_var.first();
                while (pph_phrase_resolution.NIL == upcased_n && pph_phrase_resolution.NIL != csome_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject new_olist = pph_phrase_output_list_upcase_leading_smart(olist);
                    final SubLObject upcasedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_phrase_resolution.NIL != upcasedP) {
                        new_nth_olist = new_olist;
                        upcased_n = n;
                    }
                    n = Numbers.add(n, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    csome_list_var = csome_list_var.rest();
                    olist = csome_list_var.first();
                }
            }
            if (pph_phrase_resolution.NIL != upcased_n) {
                new_olists = list_utilities.replace_nth(upcased_n, new_nth_olist, olists);
                pph_data_structures.pph_phrase_output_item_nospace_group_set_items(item, new_olists);
            }
            return item;
        }
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(item);
        final SubLObject item_string = pph_string.pph_string_copy(pph_data_structures.pph_phrase_output_item_string(new_item));
        final SubLObject new_item_string = pph_utilities.upcase_leading_smart(item_string);
        pph_data_structures.pph_phrase_output_item_set_string(new_item, new_item_string);
        return new_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 61772L)
    public static SubLObject upcased_leading_smartP(final SubLObject string) {
        if (pph_phrase_resolution.NIL != Characters.upper_case_p(pph_string.pph_string_char(string, (SubLObject)pph_phrase_resolution.ZERO_INTEGER))) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 61910L)
    public static SubLObject ends_with_period_smartP(final SubLObject string) {
        return ends_with_punctuation_smartP(string, (SubLObject)pph_phrase_resolution.$str131$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 62013L)
    public static SubLObject ends_with_question_mark_smartP(final SubLObject string) {
        return ends_with_punctuation_smartP(string, (SubLObject)pph_phrase_resolution.$str132$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 62123L)
    public static SubLObject ends_with_punctuation_smartP(final SubLObject string, final SubLObject punc_string) {
        if (pph_phrase_resolution.NIL != pph_string.pph_string_ends_with(string, punc_string, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 62279L)
    public static SubLObject pph_phrase_output_list_add_period_smart(final SubLObject olist) {
        return pph_phrase_output_list_add_punctuation_smart(olist, (SubLObject)pph_phrase_resolution.$str131$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 62475L)
    public static SubLObject pph_phrase_output_list_add_question_mark_smart(final SubLObject olist) {
        return pph_phrase_output_list_add_punctuation_smart(olist, (SubLObject)pph_phrase_resolution.$str132$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 62678L)
    public static SubLObject pph_phrase_output_list_add_punctuation_smart(final SubLObject olist, final SubLObject punc_string) {
        final SubLObject tail = pph_output_list_nonempty_tail(olist);
        if (pph_phrase_resolution.NIL != tail) {
            SubLObject current;
            final SubLObject datum = current = tail;
            SubLObject last_non_empty_item = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject trailing_items = (SubLObject)pph_phrase_resolution.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list135);
            last_non_empty_item = current.first();
            current = (trailing_items = current.rest());
            final SubLObject last_string = pph_data_structures.pph_phrase_output_item_string(last_non_empty_item);
            if (pph_phrase_resolution.NIL != pph_utilities.pph_punctuation_ok_after_stringP(last_string, punc_string)) {
                final SubLObject new_item = pph_question.new_pph_phrase_filler_item(punc_string);
                ConsesLow.rplacd(tail, (SubLObject)ConsesLow.cons(new_item, trailing_items));
            }
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 63381L)
    public static SubLObject pph_string_add_punctuation_smart(final SubLObject string, final SubLObject punc_string) {
        if (pph_phrase_resolution.NIL != pph_utilities.pph_punctuation_ok_after_stringP(string, punc_string)) {
            return pph_string.pph_string_concatenate(string, punc_string);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 63706L)
    public static SubLObject pph_output_list_nonempty_tail(final SubLObject olist) {
        SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL == ans) {
            SubLObject end_var;
            SubLObject n;
            SubLObject tail;
            for (end_var = number_utilities.f_1X(Sequences.length(olist)), n = (SubLObject)pph_phrase_resolution.NIL, n = (SubLObject)pph_phrase_resolution.ONE_INTEGER; pph_phrase_resolution.NIL == ans && !n.numGE(end_var); n = number_utilities.f_1X(n)) {
                tail = conses_high.last(olist, n);
                if (pph_phrase_resolution.NIL != pph_string.non_empty_pph_stringP(pph_data_structures.pph_phrase_output_item_string(tail.first()))) {
                    ans = tail;
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 64114L)
    public static SubLObject pph_percent_phrase_get_string(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject percent_as_decimal = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (percent_as_decimal.isNumber()) {
            pph_phrase.pph_phrase_set_cycl(phrase, Numbers.multiply((SubLObject)pph_phrase_resolution.$int136$100, percent_as_decimal));
            final SubLObject cutoff = pph_float_precision(percent_as_decimal);
            final SubLObject candidates = list_utilities.remove_if_not((SubLObject)pph_phrase_resolution.$sym137$POSITIVE_INTEGER_P, (SubLObject)ConsesLow.list(cutoff, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
            try {
                pph_vars.$pph_significant_digits_cutoff$.bind((SubLObject)((pph_phrase_resolution.NIL != candidates) ? number_utilities.minimum(candidates, (SubLObject)pph_phrase_resolution.UNPROVIDED) : pph_phrase_resolution.NIL), thread);
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str138$Using_significant_digits_cutoff_o, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread), pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_methods.generate_float(phrase);
            }
            finally {
                pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_0, thread);
            }
            final SubLObject bare_number_olist = pph_phrase.pph_phrase_output_list(phrase);
            final SubLObject new_olist = pph_phrase_output_list_add_punctuation_smart(bare_number_olist, (SubLObject)pph_phrase_resolution.$str139$_);
            pph_phrase.pph_phrase_set_output_list(phrase, new_olist, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        else {
            pph_phrase.pph_phrase_clear_special_type(phrase);
            pph_phrase_get_string(phrase, top_level_cycl, pph_phrase.pph_phrase_logical_mother(phrase));
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 65259L)
    public static SubLObject pph_float_precision(final SubLObject v_float) {
        final SubLObject float_string = print_high.princ_to_string(v_float);
        final SubLObject no_dot = Sequences.remove((SubLObject)Characters.CHAR_period, float_string, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject trimmed = Strings.string_left_trim((SubLObject)pph_phrase_resolution.$list140, no_dot);
        final SubLObject first_alpha_position = Sequences.position_if((SubLObject)pph_phrase_resolution.$sym141$ALPHA_CHAR_P, trimmed, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject cutoff = (pph_phrase_resolution.NIL != first_alpha_position) ? first_alpha_position : Sequences.length(trimmed);
        return (SubLObject)((pph_phrase_resolution.NIL != subl_promotions.positive_integer_p(cutoff)) ? cutoff : pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 65774L)
    public static SubLObject pph_coordination_phrase_get_string(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != pph_nbar_coordination_phrase_p(phrase) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(pph_phrase.pph_phrase_mother(phrase)), (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            final SubLObject determiner_distributed_okP = pph_nbar_coordination_phrase_distribute_determiner(phrase, top_level_cycl);
            if (pph_phrase_resolution.NIL == determiner_distributed_okP) {
                abortP = (SubLObject)pph_phrase_resolution.T;
            }
        }
        if (pph_phrase_resolution.NIL == abortP) {
            final SubLObject _prev_bind_0 = pph_phrase_resolution.$pph_coordination_phrase_nesting$.currentBinding(thread);
            try {
                pph_phrase_resolution.$pph_coordination_phrase_nesting$.bind(number_utilities.f_1X(pph_phrase_resolution.$pph_coordination_phrase_nesting$.getDynamicValue(thread)), thread);
                if (pph_phrase_resolution.$pph_coordination_phrase_nesting$.getDynamicValue(thread).numG(pph_phrase_resolution.$pph_coordination_phrase_nesting_max$.getDynamicValue(thread))) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str142$__Recursion_limit___S__exceeded_i) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase_resolution.$pph_coordination_phrase_nesting_max$.getDynamicValue(thread)));
                }
                else {
                    pph_coordination_phrase_get_string_internal(phrase, top_level_cycl);
                }
            }
            finally {
                pph_phrase_resolution.$pph_coordination_phrase_nesting$.rebind(_prev_bind_0, thread);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 66842L)
    public static SubLObject pph_coordination_phrase_get_string_internal(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject dtrs_resolvedP = pph_phrase_try_to_resolve_dtr_strings(phrase, top_level_cycl);
        if (dtrs_resolvedP == pph_phrase_resolution.$kw30$RESOLVED) {
            SubLObject current;
            final SubLObject datum = current = pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.NIL).rest();
            SubLObject coord_keyword = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject list_type_id_string = (SubLObject)pph_phrase_resolution.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list143);
            coord_keyword = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list143);
            list_type_id_string = current.first();
            current = current.rest();
            if (pph_phrase_resolution.NIL == current) {
                if (coord_keyword.eql((SubLObject)pph_phrase_resolution.$kw144$AND) && pph_phrase_resolution.NIL != pph_phrase_agrees_with_no_quantified_phrase_p(pph_phrase.pph_phrase_maximal_projection(phrase))) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str145$Changing_coordination_to__OR__bas, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    coord_keyword = (SubLObject)pph_phrase_resolution.$kw146$OR;
                }
                final SubLObject opr_item = (SubLObject)((pph_phrase_resolution.NIL != pph_phrase.pph_unknown_cycl_p(top_level_cycl)) ? pph_phrase_resolution.NIL : pph_coordination_phrase_operator_item(phrase, top_level_cycl));
                final SubLObject dtr_olists = pph_phrase.pph_phrase_dtr_output_lists(phrase);
                final SubLObject olist = pph_methods_formulas.pph_junct_olist_from_olists(dtr_olists, coord_keyword, opr_item, list_type_id_string);
                pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                SubLObject idx = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                SubLObject new_dtrs = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject dtr_olist;
                    SubLObject pos;
                    SubLObject dummy_olist;
                    SubLObject dummy_phrase;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        dtr_olist = pph_phrase.pph_phrase_output_list(dtr);
                        pos = find_dtr_olist_in_olist(dtr_olist, olist, idx);
                        if (pph_phrase_resolution.NIL != pos && pos.numG(idx)) {
                            dummy_olist = Sequences.subseq(olist, idx, pos);
                            dummy_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                            pph_phrase.pph_phrase_set_output_list(dummy_phrase, dummy_olist, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                            pph_phrase_get_string(dummy_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                            pph_phrase.pph_phrase_note_done(dummy_phrase);
                            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str147$Inserting_dummy_phrase__S, dummy_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                            }
                            idx = Numbers.add(idx, Sequences.length(dummy_olist));
                            new_dtrs = (SubLObject)ConsesLow.cons(dummy_phrase, new_dtrs);
                        }
                        idx = Numbers.add(idx, Sequences.length(dtr_olist));
                        new_dtrs = (SubLObject)ConsesLow.cons(dtr, new_dtrs);
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    }
                }
                pph_phrase.set_pph_phrase_dtrs_from_list(phrase, Sequences.nreverse(new_dtrs), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
                pph_phrase.pph_phrase_set_category(phrase, pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER), (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.NIL);
                pph_phrase.pph_phrase_set_agr(phrase, pph_data_structures.pph_phrase_agr_copy(pph_phrase.pph_phrase_agr(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER)), (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                if (pph_phrase_resolution.$kw144$AND == coord_keyword && pph_phrase_resolution.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER), (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const148$Noun, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                    final SubLObject agr_pred = pph_phrase.pph_phrase_dtr_count(phrase).numG((SubLObject)pph_phrase_resolution.ONE_INTEGER) ? pph_phrase_resolution.$const149$plural_Generic : pph_phrase_resolution.$const150$singular_Generic;
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str151$__Setting_conjunctive_agr_of__S_t, pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.NIL), agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase_resolution.$list143);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 69400L)
    public static SubLObject find_dtr_olist_in_olist(final SubLObject dtr_olist, final SubLObject olist, final SubLObject idx) {
        return Sequences.search(dtr_olist, olist, Symbols.symbol_function((SubLObject)pph_phrase_resolution.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase_resolution.IDENTITY), (SubLObject)pph_phrase_resolution.ZERO_INTEGER, (SubLObject)pph_phrase_resolution.NIL, idx, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 69526L)
    public static SubLObject pph_phrase_agrees_with_no_quantified_phrase_p(final SubLObject phrase) {
        return pph_no_quantified_det_nbar_phrase_p(pph_phrase_agr_target_phrase(phrase, pph_phrase.pph_phrase_logical_mother(phrase)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 69718L)
    public static SubLObject pph_no_quantified_det_nbar_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(v_object, (SubLObject)pph_phrase_resolution.NIL) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_npP(v_object) && pph_phrase_resolution.TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(v_object)) && (pph_phrase_resolution.NIL != pph_phrase_detpP(pph_phrase.pph_phrase_nth_dtr(v_object, (SubLObject)pph_phrase_resolution.ZERO_INTEGER)) || pph_phrase_resolution.NIL != pph_phrase_determinerP(pph_phrase.pph_phrase_nth_dtr(v_object, (SubLObject)pph_phrase_resolution.ZERO_INTEGER))) && pph_phrase_resolution.$const152$No_NLAttr.eql(pph_phrase_lexical_head_cycl(pph_phrase.pph_phrase_nth_dtr(v_object, (SubLObject)pph_phrase_resolution.ZERO_INTEGER), (SubLObject)pph_phrase_resolution.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 70216L)
    public static SubLObject pph_coordination_phrase_operator_item(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject opr = cycl_utilities.formula_arg0(top_level_cycl);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject opr_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_phrase_resolution.$list72, map);
        final SubLObject opr_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), opr_arg_position, opr, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(opr_item, opr);
        return opr_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 70712L)
    public static SubLObject pph_nbar_coordination_phrase_p(final SubLObject phrase) {
        return pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 70821L)
    public static SubLObject pph_nbar_coordination_phrase_distribute_determiner(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject mother_np = (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_npP(mother)) ? mother : pph_phrase.pph_phrase_mother(mother);
        SubLObject problemP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == pph_phrase.pph_phrase_npP(mother_np));
        final SubLObject det_sister = (SubLObject)((pph_phrase_resolution.NIL != problemP) ? pph_phrase_resolution.NIL : pph_phrase.pph_phrase_nth_dtr(mother_np, (SubLObject)pph_phrase_resolution.ZERO_INTEGER));
        if (pph_phrase_resolution.NIL == problemP && pph_phrase_resolution.TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(mother_np)) && pph_phrase_resolution.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(det_sister, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const153$Determiner, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_only_dtr(mother_np, phrase);
            pph_phrase.pph_phrase_set_head_dtr_num(mother_np, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str154$Removed_det_sister_from_mother_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            final SubLObject repeated_phrase_dtrs_resolvedP = pph_phrase_resolve_repeated_phrase_dtrs(phrase, top_level_cycl);
            if (pph_phrase_resolution.NIL != repeated_phrase_dtrs_resolvedP) {
                SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject nbar_conjunct;
                    SubLObject new_np_conjunct;
                    SubLObject det_sister_copy;
                    SubLObject nbar_conjunct_copy;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                        nbar_conjunct = Vectors.aref(vector_var, element_num);
                        new_np_conjunct = pph_phrase.pph_phrase_copy(nbar_conjunct, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        det_sister_copy = pph_phrase.pph_phrase_copy(det_sister, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        nbar_conjunct_copy = pph_phrase.pph_phrase_copy(nbar_conjunct, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        pph_phrase.pph_phrase_set_relative_agr_target(det_sister_copy, nbar_conjunct_copy);
                        pph_phrase.pph_phrase_set_category_to_np(new_np_conjunct);
                        pph_phrase.set_pph_phrase_dtrs_from_list(new_np_conjunct, (SubLObject)ConsesLow.list(det_sister_copy, nbar_conjunct_copy), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                        pph_phrase.pph_phrase_set_nth_dtr(phrase, dtr_num, new_np_conjunct);
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                    }
                }
            }
            else {
                problemP = (SubLObject)pph_phrase_resolution.T;
            }
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_resolution.NIL == problemP), (SubLObject)((pph_phrase_resolution.NIL != problemP) ? pph_phrase_resolution.NIL : mother_np));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 72431L)
    public static SubLObject pph_phrase_set_subject_verb_agreement(final SubLObject verbal_phrase, final SubLObject matrix_phrase) {
        final SubLObject subject_pointer = pph_phrase.pph_phrase_agr_target_of_type(verbal_phrase, (SubLObject)pph_phrase_resolution.$kw87$SUBJECT_VERB);
        final SubLObject subject_is_nth_phraseP = pph_utilities.pph_nth_phrase_p(subject_pointer);
        SubLObject subject_phrase = (SubLObject)((pph_phrase_resolution.NIL != subject_is_nth_phraseP) ? pph_phrase_resolution.NIL : subject_pointer);
        if (pph_phrase_resolution.NIL != subject_is_nth_phraseP) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase_resolution.$str5$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase_resolution.ONE_INTEGER), pph_phrase_resolution.$str6$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase_resolution.$str155$subject_pointer_is_nth_phrase___S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(subject_pointer));
            subject_phrase = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, pph_utilities.pph_nth_phrase_num(subject_pointer));
        }
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(subject_phrase)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str156$__Not_setting_subject_verb_agreem, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            return verbal_phrase;
        }
        final SubLObject matrix_constraints = (SubLObject)((pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtrP(verbal_phrase, matrix_phrase)) ? pph_phrase.pph_phrase_absolute_agr_preds(matrix_phrase) : pph_phrase_resolution.$kw157$ANY);
        final SubLObject verbs_constraints = pph_utilities.pph_filter_preds(matrix_constraints, pph_phrase.pph_phrase_absolute_agr_preds(verbal_phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject filtered_constraints = pph_utilities.pph_filter_preds(verbs_constraints, lexicon_accessors.max_preds_of_pos(pph_phrase_resolution.$const158$Verb), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        SubLObject verb_preds = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str159$__Using_internal_constraints___S_, filtered_constraints, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        if (!filtered_constraints.equal(verbs_constraints) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str160$___filtered_from__S___, verbs_constraints, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        verb_preds = verb_preds_for_subject(subject_phrase, filtered_constraints);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str161$__Setting_verb_agreement_to__S___, verb_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        pph_phrase.pph_phrase_set_agr_preds(verbal_phrase, verb_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        return pph_phrase.pph_phrase_agr_preds(verbal_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 74303L)
    public static SubLObject pph_phrase_default_verb_pred() {
        final SubLObject default_form = verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str162$Using_default_verb_form___S_, default_form, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return default_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 74518L)
    public static SubLObject pph_phrase_set_peer_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        SubLObject target_agr_pred = pph_phrase.pph_phrase_agr_pred(target);
        if (pph_phrase_resolution.NIL != pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(target, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const163$MeasurableQuantity, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            target_agr_pred = pph_phrase_resolution.$const150$singular_Generic;
        }
        if (pph_phrase_resolution.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_utilities.pph_speech_part_predP(pph_phrase.pph_phrase_agr_pred(phrase)) && pph_phrase_resolution.NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase_resolution.$const164$adjStrings, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            if (pph_phrase_resolution.NIL == pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const165$Adjective, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str166$__This_phrase_s_agr_pred_is__S_bu, pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str167$__Set_adjective_peer_agreement_to, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        else if (pph_phrase_resolution.NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase_resolution.$const168$untensed, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str169$__Set_untensed_peer_agreement_to_, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        else if (pph_phrase_resolution.NIL != target_agr_pred) {
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.pph_peer_agr_for_pred(target_agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str170$__Set_peer_agreement_to__S___, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        else {
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str171$__Set_peer_agreement_to_default__, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 76743L)
    public static SubLObject pph_phrase_set_tense_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        SubLObject agr_preds = (SubLObject)pph_phrase_resolution.$kw157$ANY;
        final SubLObject matrix_preds = pph_phrase.pph_phrase_agr_preds(matrix_phrase.eql((SubLObject)pph_phrase_resolution.$kw64$MOTHER) ? pph_phrase.pph_phrase_mother(phrase) : matrix_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_utilities.pph_nl_pred_listP(matrix_preds)) {
            SubLObject cdolist_list_var = matrix_preds;
            SubLObject matrix_pred = (SubLObject)pph_phrase_resolution.NIL;
            matrix_pred = cdolist_list_var.first();
            while (pph_phrase_resolution.NIL != cdolist_list_var) {
                if (pph_phrase_resolution.NIL != pph_utilities.pph_genl_pos_predP(matrix_pred, pph_phrase_resolution.$const172$tensed, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                    agr_preds = pph_utilities.pph_filter_preds(agr_preds, (SubLObject)ConsesLow.list(matrix_pred), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                matrix_pred = cdolist_list_var.first();
            }
        }
        if (pph_phrase_resolution.NIL != pph_utilities.pph_nl_pred_listP(agr_preds)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str173$__Incorporating_tense_agreement__, agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_agr_preds(phrase, pph_utilities.pph_filter_preds(agr_preds, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 77638L)
    public static SubLObject pph_phrase_set_clarifying_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        final SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject target_string = pph_phrase.pph_phrase_string(target, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != cycl_grammar.cycl_variable_p(target_cycl) && pph_phrase_resolution.NIL != uninformative_paraphrase_p(target_string, target_cycl)) {
            pph_phrase.pph_phrase_set_string(phrase, (SubLObject)pph_phrase_resolution.$str55$);
        }
        else {
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 78068L)
    public static SubLObject uninformative_paraphrase_p(final SubLObject string, final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.equal(PrintLow.format((SubLObject)pph_phrase_resolution.NIL, (SubLObject)pph_phrase_resolution.$str174$_S, cycl)) || string.equal(pph_vars.$pph_blank_string$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 78218L)
    public static SubLObject pph_phrase_agr_target_phrase(final SubLObject phrase, SubLObject matrix_phrase) {
        if (matrix_phrase == pph_phrase_resolution.UNPROVIDED) {
            matrix_phrase = (SubLObject)pph_phrase_resolution.NIL;
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            SubLObject badP = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject first_agr = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase_resolution.NIL == first_agr) {
                        first_agr = pph_phrase_agr_target_phrase(dtr, matrix_phrase);
                    }
                    else if (!first_agr.equal(pph_phrase_agr_target_phrase(dtr, matrix_phrase))) {
                        badP = (SubLObject)pph_phrase_resolution.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
                }
            }
            return (SubLObject)((pph_phrase_resolution.NIL != badP) ? pph_phrase_resolution.NIL : first_agr);
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(matrix_phrase, (SubLObject)pph_phrase_resolution.NIL)) {
            SubLObject target = pph_phrase_relative_agr_target(phrase);
            if (pph_phrase_resolution.NIL != pph_utilities.pph_nth_phrase_p(target)) {
                final SubLObject dtr_num2 = pph_utilities.pph_nth_phrase_num(target);
                target = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, dtr_num2);
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str175$__Using_daughter__D_as_agreement_, dtr_num2, target, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            return target;
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 79223L)
    public static SubLObject pph_phrase_relative_agr_target(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject target = (SubLObject)((pph_phrase_resolution.NIL != relative_constraint) ? pph_utilities.pph_agr_constraint_target(relative_constraint) : pph_phrase_resolution.NIL);
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 79512L)
    public static SubLObject pph_phrase_set_det_nbar_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        final SubLObject phrase_is_detP = Equality.eq(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const153$Determiner);
        final SubLObject det = (pph_phrase_resolution.NIL != phrase_is_detP) ? phrase : target;
        final SubLObject nbar = (pph_phrase_resolution.NIL != phrase_is_detP) ? target : phrase;
        final SubLObject nbar_agr_pred = (SubLObject)((pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(nbar)) ? pph_phrase.pph_phrase_agr_pred(nbar) : pph_phrase_resolution.NIL);
        final SubLObject det_agr_pred = (SubLObject)((pph_phrase_resolution.NIL == phrase_is_detP && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(det)) ? pph_phrase.pph_phrase_agr_pred(det) : pph_phrase_resolution.NIL);
        final SubLObject det_wu = pph_phrase.pph_phrase_wu(det, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            final SubLObject matrix_formula = (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(matrix_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) ? pph_phrase.pph_phrase_cycl(matrix_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED) : pph_phrase.pph_unknown_cycl();
            final SubLObject det_head_cycl = pph_phrase_lexical_head_cycl(det, matrix_formula);
            if (pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase.pph_phrase_cycl(det, (SubLObject)pph_phrase_resolution.UNPROVIDED).eql(pph_phrase_resolution.$const176$BareForm_NLAttr)) {
                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str177$__Using_hard_coded_null_determine, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            else if (pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(nbar) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_indefinite_articleP(det) && pph_phrase_resolution.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                pph_phrase_english_indefinite_article(det, nbar);
            }
            else if (pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(nbar) && pph_phrase_resolution.NIL != pph_variable_handling.pph_string_is_posP(string_utilities.string_tokenize(pph_string.pph_string_to_display(pph_phrase.pph_phrase_string(nbar, (SubLObject)pph_phrase_resolution.NIL)), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED).first(), pph_phrase_resolution.$const178$PossessivePronoun_Pre, (SubLObject)pph_phrase_resolution.$kw179$NEVER, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str180$__Setting_det_nbar_agreement_for_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str181$__Using_null_determiner_for_posse, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            else if (pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase_resolution.NIL != pph_phrase.pph_ranged_det_phrase_p(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str182$__Setting_det_nbar_agreement_for_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_pred(nbar, pph_phrase_resolution.$const149$plural_Generic, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL != phrase_is_detP && pph_phrase_resolution.NIL != nbar_agr_pred) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str183$__Setting_determiner_s_agr_pred_f, nbar_agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_pred(det, nbar_agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL == phrase_is_detP && pph_phrase_resolution.NIL != lexicon_accessors.agreement_lookup(det_wu)) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str184$__Setting_agr_pred_from_determine, det_agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_pred(nbar, lexicon_accessors.agreement_lookup(det_wu), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
            else if (pph_phrase_resolution.NIL != cycl_utilities.expression_find_if((SubLObject)pph_phrase_resolution.$sym185$EL_VAR_, det_head_cycl, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
                if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str186$__Setting_determiner_nbar_agreeme, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase_resolution.$const187$nonSingular_Generic, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(target)) {
                    pph_phrase.pph_phrase_set_agr_pred(target, pph_utilities.numeric_det_agr_pred(det_head_cycl), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
            }
            else if (pph_phrase_resolution.NIL != pph_utilities.pph_numeric_det_cyclP(det_head_cycl)) {
                final SubLObject numeric_agr_pred = pph_utilities.numeric_det_agr_pred(det_head_cycl);
                if (pph_phrase_resolution.NIL != numeric_agr_pred) {
                    final SubLObject filtered = pph_utilities.pph_filter_preds((SubLObject)ConsesLow.list(numeric_agr_pred), pph_phrase.pph_phrase_agr_preds(nbar, (SubLObject)pph_phrase_resolution.UNPROVIDED), (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str188$__Setting_determiner_nbar_agreeme, filtered, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_agr_preds(phrase, filtered, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_doneP(target)) {
                        pph_phrase.pph_phrase_set_agr_preds(target, filtered, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                }
            }
            else if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str189$Couldn_t_determine_agreement_info, phrase, det_head_cycl);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 82975L)
    public static SubLObject pph_phrase_lexical_head_cycl(final SubLObject phrase, SubLObject matrix_formula) {
        if (matrix_formula == pph_phrase_resolution.UNPROVIDED) {
            matrix_formula = (SubLObject)pph_phrase_resolution.NIL;
        }
        SubLObject lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(phrase);
        if (pph_phrase_resolution.NIL != el_utilities.el_formula_p(matrix_formula)) {
            while (pph_phrase_resolution.NIL != pph_phrase.pph_conditional_phrase_p(lexical_head)) {
                pph_phrase_resolve_condition(lexical_head, matrix_formula, pph_phrase.pph_phrase_mother(lexical_head));
                lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(lexical_head);
            }
        }
        return pph_phrase.pph_phrase_cycl(lexical_head, matrix_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 83502L)
    public static SubLObject pph_phrase_dtr_nested_withinP(final SubLObject search_for, final SubLObject ancestor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != subl_promotions.memberP(search_for, pph_phrase.pph_phrase_dtr_list(ancestor), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)pph_phrase_resolution.T;
        }
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_p(ancestor, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase_resolution.$str190$PPH_PHRASE_DTR_NESTED_WITHIN__loo, search_for, ancestor);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(ancestor).isVector()) {
            final SubLObject vector_var = document.sign_constituents(ancestor);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    return pph_phrase_dtr_nested_withinP(search_for, dtr);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 84172L)
    public static SubLObject pph_phrase_subject_of_clause(final SubLObject phrase) {
        final SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject the_subject = (SubLObject)((pph_phrase_resolution.NIL != the_ancestor) ? pph_phrase.pph_phrase_subject_dtr(the_ancestor) : pph_phrase_resolution.NIL);
        if (pph_phrase_resolution.NIL == the_ancestor) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        if (pph_phrase_resolution.NIL == the_subject) {
            return pph_phrase_subject_of_clause(the_ancestor);
        }
        return the_subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 84717L)
    public static SubLObject pph_phrase_subject_domain(final SubLObject phrase) {
        final SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject the_subject = (SubLObject)((pph_phrase_resolution.NIL != the_ancestor) ? pph_phrase.pph_phrase_subject_dtr(the_ancestor) : pph_phrase_resolution.NIL);
        if (pph_phrase_resolution.NIL == the_ancestor) {
            return phrase;
        }
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_sP(the_ancestor)) {
            return the_ancestor;
        }
        if (pph_phrase_resolution.NIL == the_subject) {
            return pph_phrase_subject_domain(the_ancestor);
        }
        if (pph_phrase_resolution.NIL == pph_drs.pph_discourse_rm_lookup(pph_phrase.pph_phrase_cycl(the_subject, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            return pph_phrase_subject_domain(the_ancestor);
        }
        return the_ancestor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 85514L)
    public static SubLObject pph_phrase_find_potential_binders(final SubLObject phrase, SubLObject subjects, SubLObject others, SubLObject just_this_clause) {
        if (subjects == pph_phrase_resolution.UNPROVIDED) {
            subjects = (SubLObject)pph_phrase_resolution.T;
        }
        if (others == pph_phrase_resolution.UNPROVIDED) {
            others = (SubLObject)pph_phrase_resolution.NIL;
        }
        if (just_this_clause == pph_phrase_resolution.UNPROVIDED) {
            just_this_clause = (SubLObject)pph_phrase_resolution.T;
        }
        final SubLObject mom = pph_phrase.pph_phrase_mother(phrase);
        return (SubLObject)((pph_phrase_resolution.NIL != mom) ? pph_phrase_find_potential_binders_int(phrase, mom, phrase, subjects, others, just_this_clause) : pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 86161L)
    public static SubLObject pph_phrase_find_potential_binders_int(final SubLObject phrase, final SubLObject look_in, final SubLObject calling_phrase, final SubLObject subjects, final SubLObject others, final SubLObject embedded_only) {
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_p(look_in, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject the_subject = pph_phrase.pph_phrase_subject_dtr(look_in);
        SubLObject potentials = (SubLObject)pph_phrase_resolution.NIL;
        SubLObject do_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(look_in).isVector()) {
            final SubLObject vector_var = document.sign_constituents(look_in);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (!dtr.eql(calling_phrase)) {
                    if (dtr.eql(the_subject)) {
                        if (pph_phrase_resolution.NIL != subjects) {
                            potentials = (SubLObject)ConsesLow.cons(dtr, potentials);
                        }
                    }
                    else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_npP(dtr) && pph_phrase_resolution.NIL != others) {
                        potentials = (SubLObject)ConsesLow.cons(dtr, potentials);
                    }
                }
                do_num = Numbers.add(do_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        if (pph_phrase_resolution.NIL != the_subject && pph_phrase_resolution.NIL != embedded_only) {
            return potentials;
        }
        final SubLObject next_level = pph_phrase.pph_phrase_mother(look_in);
        final SubLObject recursed = (SubLObject)((pph_phrase_resolution.NIL != next_level) ? pph_phrase_find_potential_binders_int(phrase, next_level, look_in, subjects, others, embedded_only) : pph_phrase_resolution.NIL);
        if (pph_phrase_resolution.NIL != potentials && pph_phrase_resolution.NIL != recursed) {
            return list_utilities.flatten((SubLObject)ConsesLow.list(potentials, recursed));
        }
        return (pph_phrase_resolution.NIL != recursed) ? recursed : potentials;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 87157L)
    public static SubLObject pph_phrase_could_bind_possessive_here(final SubLObject phrase) {
        return pph_phrase_find_potential_binders(phrase, (SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 87623L)
    public static SubLObject pph_phrase_could_bind_reflexive_here(final SubLObject phrase) {
        return pph_phrase_find_potential_binders(phrase, (SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 87964L)
    public static SubLObject pph_phrase_english_indefinite_article(final SubLObject det, final SubLObject nbar) {
        final SubLObject nbar_pos_pred = pph_phrase.pph_phrase_agr_pred(nbar);
        final SubLObject nbar_string = pph_phrase.pph_phrase_string(nbar, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject already_indefiniteP = pph_string.pph_string_starts_with(nbar_string, (SubLObject)pph_phrase_resolution.$str191$some, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject sing_nbarP = (SubLObject)((pph_phrase_resolution.NIL != nbar_pos_pred) ? pph_singular_noun_predP(nbar_pos_pred) : pph_phrase_resolution.NIL);
        if (pph_phrase_resolution.NIL != pph_phrase_english_indefinite_np(det, nbar)) {
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str192$__Nbar_is_now__S__, nbar, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        else if (pph_phrase.pph_phrase_agr_pred(det).eql(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue())) {
            pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
        }
        else if (pph_phrase_resolution.NIL != already_indefiniteP) {
            pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
        }
        else if (pph_phrase_resolution.NIL != sing_nbarP) {
            pph_phrase.pph_phrase_set_string(det, pph_singular_determiner_string(nbar_string));
        }
        else if (pph_phrase_resolution.NIL != list_utilities.lengthG(nbar_string, (SubLObject)pph_phrase_resolution.TWO_INTEGER, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_string.pph_string_starts_with(nbar_string, constant_reader.constant_reader_prefix(), (SubLObject)pph_phrase_resolution.UNPROVIDED) && (pph_phrase_resolution.NIL == fort_types_interface.collection_p(pph_phrase.pph_phrase_cycl(nbar, (SubLObject)pph_phrase_resolution.UNPROVIDED)) || pph_phrase_resolution.NIL == pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(nbar, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const193$ExistingStuffType, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            pph_phrase.pph_phrase_set_string(det, pph_singular_determiner_string(pph_string.pph_substring(nbar_string, (SubLObject)pph_phrase_resolution.TWO_INTEGER, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
        }
        else {
            pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
        }
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str194$__Using_English_specific_indefini, pph_phrase.pph_phrase_string(det, (SubLObject)pph_phrase_resolution.NIL), pph_phrase.pph_phrase_string(nbar, (SubLObject)pph_phrase_resolution.NIL), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(det);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 89520L)
    public static SubLObject pph_phrase_english_indefinite_np(final SubLObject det, final SubLObject nbar) {
        final SubLObject nbar_head = (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(nbar)) ? pph_phrase.pph_phrase_head_dtr(nbar) : nbar;
        SubLObject doneP = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(nbar_head, (SubLObject)pph_phrase_resolution.UNPROVIDED) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(nbar) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_compatible_with_predsP(nbar, (SubLObject)pph_phrase_resolution.$list196) && pph_phrase_resolution.NIL == pph_phrase.pph_cycl_phrase_p(nbar) && (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(nbar), (SubLObject)pph_phrase_resolution.UNPROVIDED) || pph_phrase_resolution.NIL == pph_copular_complementP(pph_phrase.pph_phrase_mother(nbar)))) {
            final SubLObject nbar_head_cycl = pph_phrase.pph_phrase_cycl(nbar_head, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject type;
            SubLObject string;
            for (rest = (SubLObject)pph_phrase_resolution.NIL, rest = pph_phrase_resolution.$pph_english_lexical_indefinites$.getGlobalValue(); pph_phrase_resolution.NIL == doneP && pph_phrase_resolution.NIL != rest; rest = rest.rest()) {
                cons = rest.first();
                datum = (current = cons);
                type = (SubLObject)pph_phrase_resolution.NIL;
                string = (SubLObject)pph_phrase_resolution.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase_resolution.$list197);
                type = current.first();
                current = (string = current.rest());
                if (nbar_head_cycl.eql(type)) {
                    pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                    pph_phrase.pph_phrase_set_string(nbar_head, string);
                    pph_phrase.pph_phrase_set_agr_preds(nbar_head, (SubLObject)pph_phrase_resolution.$list196, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str198$Nbar_string_is__S__Output_list___, pph_phrase.pph_phrase_string(nbar, (SubLObject)pph_phrase_resolution.NIL), pph_phrase.pph_phrase_output_list(nbar), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    if (!nbar.eql(nbar_head)) {
                        pph_phrase_set_output_list_from_finished_dtrs(nbar);
                    }
                    doneP = (SubLObject)pph_phrase_resolution.T;
                }
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 90614L)
    public static SubLObject pph_copular_complementP(final SubLObject np) {
        final SubLObject s = (SubLObject)((pph_phrase_resolution.NIL != pph_phrase.pph_phrase_npP(np)) ? pph_phrase.pph_phrase_mother(np) : pph_phrase_resolution.NIL);
        SubLObject v_answer = (SubLObject)pph_phrase_resolution.NIL;
        if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_p(s, (SubLObject)pph_phrase_resolution.UNPROVIDED) && np.eql(pph_phrase.pph_phrase_nth_dtr(s, (SubLObject)pph_phrase_resolution.TWO_INTEGER)) && pph_phrase_resolution.NIL != pph_phrase.pph_copula_phraseP(pph_phrase.pph_phrase_nth_dtr(s, (SubLObject)pph_phrase_resolution.ONE_INTEGER))) {
            v_answer = (SubLObject)pph_phrase_resolution.T;
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 90945L)
    public static SubLObject pph_noun_predP(final SubLObject pred, SubLObject mt) {
        if (mt == pph_phrase_resolution.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const199$nounStrings, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 91076L)
    public static SubLObject pph_singular_noun_predP(final SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const150$singular_Generic, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 91180L)
    public static SubLObject pph_non_singular_noun_predP(final SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const187$nonSingular_Generic, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 91291L)
    public static SubLObject pph_singular_determiner_string(final SubLObject target_string) {
        return pph_utilities.select_determiner_string((SubLObject)pph_phrase_resolution.$list200, target_string, pph_phrase_resolution.$const150$singular_Generic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 91436L)
    public static SubLObject tense_preds_for_constraints(final SubLObject preds) {
        if (pph_phrase_resolution.NIL == preds || preds == pph_phrase_resolution.$kw157$ANY) {
            return pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect();
        }
        return pph_utilities.pph_filter_preds(pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect(), preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 91869L)
    public static SubLObject tense_pred_for_constraints(final SubLObject preds) {
        if (pph_phrase_resolution.NIL == preds || preds == pph_phrase_resolution.$kw157$ANY) {
            return pph_utilities.pph_present_tense_pred();
        }
        final SubLObject unified = pph_utilities.pph_unify_speech_part_preds(preds);
        SubLObject result = pph_utilities.pph_unify_speech_part_preds((SubLObject)ConsesLow.list(unified, pph_utilities.pph_present_tense_pred()));
        if (pph_phrase_resolution.NIL == result) {
            result = pph_utilities.pph_unify_speech_part_preds((SubLObject)ConsesLow.list(unified, pph_utilities.pph_past_tense_pred()));
        }
        if (pph_phrase_resolution.NIL == result) {
            result = pph_utilities.pph_unify_speech_part_preds((SubLObject)ConsesLow.list(unified, pph_utilities.pph_future_tense_pred()));
        }
        return (pph_phrase_resolution.NIL != result) ? result : unified;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 92520L)
    public static SubLObject verb_pred_for_subject_preds(final SubLObject subj_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = verb_preds_for_subject_preds(subj_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        SubLObject ans = (SubLObject)pph_phrase_resolution.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject ceilings = genl_predicates.min_ceiling_predicates(preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            ans = ((pph_phrase_resolution.NIL != ceilings) ? ceilings.first() : preds.first());
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 92814L)
    public static SubLObject verb_preds_for_subject(final SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == pph_phrase_resolution.UNPROVIDED) {
            internal_constraints = (SubLObject)pph_phrase_resolution.NIL;
        }
        internal_constraints = pph_strengthen_verb_constraints(internal_constraints);
        final SubLObject index = pph_data_structures.pph_phrase_info_lookup(subject_phrase, (SubLObject)pph_phrase_resolution.$kw201$INDEX, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_methods_lexicon.pph_pronoun_agr_p(index)) {
            return verb_preds_for_subject_pronoun(subject_phrase, internal_constraints);
        }
        return verb_preds_for_subject_int(subject_phrase, internal_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 93357L)
    public static SubLObject verb_pred_for_subject(final SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == pph_phrase_resolution.UNPROVIDED) {
            internal_constraints = (SubLObject)pph_phrase_resolution.NIL;
        }
        internal_constraints = pph_strengthen_verb_constraints(internal_constraints);
        if (pph_phrase_resolution.NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(subject_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const202$Pronoun, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return verb_pred_for_subject_pronoun(subject_phrase, internal_constraints);
        }
        return verb_pred_for_subject_int(subject_phrase, internal_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 93876L)
    public static SubLObject pph_strengthen_verb_constraints(final SubLObject internal_constraints) {
        SubLObject constraints = pph_remove_weak_verb_constraints(internal_constraints);
        if (pph_phrase_resolution.NIL == pph_vars.pph_generate_morphological_alternativesP() && (!constraints.isList() || pph_phrase_resolution.NIL != pph_verb_constraints_could_be_present_tenseP((SubLObject)ConsesLow.list(constraints.first())))) {
            constraints = pph_verb_constraints_ensure_present_tense(constraints);
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 94452L)
    public static SubLObject pph_verb_constraints_could_be_present_tenseP(final SubLObject constraints) {
        return list_utilities.sublisp_boolean(pph_verb_constraints_ensure_present_tense(constraints));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 94673L)
    public static SubLObject pph_verb_constraints_ensure_present_tense(final SubLObject constraints) {
        return pph_utilities.pph_filter_preds(constraints, (SubLObject)ConsesLow.list(pph_utilities.pph_present_tense_pred()), (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 94924L)
    public static SubLObject pph_remove_weak_verb_constraints(final SubLObject internal_constraints) {
        final SubLObject remaining = Sequences.remove(pph_phrase_resolution.$const203$verbStrings, internal_constraints, (SubLObject)pph_phrase_resolution.$sym204$GENL_POS_PRED_, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        return (SubLObject)((pph_phrase_resolution.NIL != remaining) ? remaining : pph_phrase_resolution.$kw157$ANY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 95117L)
    public static SubLObject verb_preds_for_subject_int(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        if (pph_phrase_resolution.NIL != pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(subject_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED), pph_phrase_resolution.$const163$MeasurableQuantity, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(pph_phrase_resolution.$const205$singularVerb_Generic);
        }
        SubLObject verb_preds = (SubLObject)pph_phrase_resolution.NIL;
        final SubLObject subject_agr_preds = pph_phrase.pph_phrase_agr_preds(subject_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str206$__Subject_agr___S__, subject_agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        verb_preds = verb_preds_for_subject_preds(subject_agr_preds, internal_constraints);
        return (SubLObject)((pph_phrase_resolution.NIL != verb_preds) ? verb_preds : ConsesLow.list(pph_phrase_default_verb_pred()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 95703L)
    public static SubLObject verb_pred_for_subject_int(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        SubLObject verb_pred = (SubLObject)pph_phrase_resolution.NIL;
        final SubLObject subject_agr_pred = pph_phrase.pph_phrase_agr_pred(subject_phrase);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str206$__Subject_agr___S__, subject_agr_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        verb_pred = verb_pred_for_subject_pred(subject_agr_pred, internal_constraints);
        return (pph_phrase_resolution.NIL != verb_pred) ? verb_pred : pph_phrase_default_verb_pred();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 96077L)
    public static SubLObject verb_preds_for_subject_pronoun(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        final SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL == pph_utilities.pph_english_contextP((SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        if (pph_phrase_resolution.NIL != pph_drs.pph_discourse_referentP(referent) && pph_drs.pph_discourse_person_for_cycl(referent).eql(pph_phrase_resolution.$const207$SecondPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, (SubLObject)ConsesLow.list(pph_phrase_resolution.$const208$secondPersonSg_Generic), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            return (SubLObject)((pph_phrase_resolution.NIL != good_preds) ? good_preds : ConsesLow.list(pph_phrase_resolution.$const209$secondPersonSg_Present));
        }
        if (pph_phrase_resolution.NIL != pph_drs.pph_discourse_referentP(referent) && pph_drs.pph_discourse_person_for_cycl(referent).eql(pph_phrase_resolution.$const210$FirstPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, (SubLObject)ConsesLow.list(pph_phrase_resolution.$const211$firstPersonSg_Generic), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            return (SubLObject)((pph_phrase_resolution.NIL != good_preds) ? good_preds : ConsesLow.list(pph_phrase_resolution.$const212$firstPersonSg_Present));
        }
        return verb_preds_for_subject_int(subject_phrase, internal_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 96922L)
    public static SubLObject verb_pred_for_subject_pronoun(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        final SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL == pph_utilities.pph_english_contextP((SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        if (pph_phrase_resolution.NIL != pph_drs.pph_discourse_referentP(referent) && pph_drs.pph_discourse_person_for_cycl(referent).eql(pph_phrase_resolution.$const207$SecondPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, (SubLObject)ConsesLow.list(pph_phrase_resolution.$const208$secondPersonSg_Generic), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            return (pph_phrase_resolution.NIL != good_preds) ? good_preds.first() : pph_phrase_resolution.$const209$secondPersonSg_Present;
        }
        if (pph_phrase_resolution.NIL != pph_drs.pph_discourse_referentP(referent) && pph_drs.pph_discourse_person_for_cycl(referent).eql(pph_phrase_resolution.$const210$FirstPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, (SubLObject)ConsesLow.list(pph_phrase_resolution.$const211$firstPersonSg_Generic), (SubLObject)pph_phrase_resolution.UNPROVIDED);
            return (pph_phrase_resolution.NIL != good_preds) ? good_preds.first() : pph_phrase_resolution.$const212$firstPersonSg_Present;
        }
        return verb_pred_for_subject_int(subject_phrase, internal_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 97776L)
    public static SubLObject verb_preds_for_subject_preds(final SubLObject subj_preds, SubLObject internal_constraints) {
        if (internal_constraints == pph_phrase_resolution.UNPROVIDED) {
            internal_constraints = (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject tenses = tense_preds_for_constraints(internal_constraints);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str213$__Using_tenses__S__, tenses, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject subj_agr_preds = pph_utilities.pph_peer_agr_for_preds(subj_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != list_utilities.empty_list_p(subj_preds)) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        if (pph_phrase_resolution.NIL != list_utilities.empty_list_p(Sequences.find_if(Symbols.symbol_function((SubLObject)pph_phrase_resolution.$sym214$PPH_FINITE_VERB_PRED_), tenses, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            return tenses;
        }
        if (pph_phrase_resolution.NIL != list_utilities.empty_list_p(list_utilities.find_if_not(Symbols.symbol_function((SubLObject)pph_phrase_resolution.$sym215$PPH_NON_PLURAL_NOUN_PRED_), subj_agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        if (pph_phrase_resolution.NIL != list_utilities.empty_list_p(list_utilities.find_if_not(Symbols.symbol_function((SubLObject)pph_phrase_resolution.$sym216$PPH_PLURAL_NOUN_PRED_), subj_agr_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            return pph_plural_verb_preds_for_tenses(tenses);
        }
        if (pph_phrase_resolution.NIL != list_utilities.empty_list_p(list_utilities.find_if_not(Symbols.symbol_function((SubLObject)pph_phrase_resolution.$sym217$PPH_PLURAL_VERB_PRED_), tenses, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED))) {
            return tenses;
        }
        if (subj_preds.equal((SubLObject)ConsesLow.list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()))) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        return verb_preds_for_subject_preds((SubLObject)ConsesLow.list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()), tenses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 98879L)
    public static SubLObject verb_pred_for_subject_pred(final SubLObject subj_pred, SubLObject internal_constraints) {
        if (internal_constraints == pph_phrase_resolution.UNPROVIDED) {
            internal_constraints = (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject tense = tense_pred_for_constraints(internal_constraints);
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str218$__Using_tense__S__, tense, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        final SubLObject subj_agr_pred = pph_utilities.pph_peer_agr_for_pred(subj_pred, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL == subj_pred) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        if (pph_phrase_resolution.NIL == pph_finite_verb_predP(tense)) {
            return tense;
        }
        if (pph_phrase_resolution.NIL != pph_non_plural_noun_predP(subj_agr_pred)) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        if (pph_phrase_resolution.NIL != pph_plural_noun_predP(subj_agr_pred)) {
            return pph_plural_verb_pred_for_tense(tense);
        }
        if (pph_phrase_resolution.NIL != pph_plural_verb_predP(tense)) {
            return pph_plural_verb_pred_for_tense(tense);
        }
        if (subj_pred.eql(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue())) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        return verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), (SubLObject)ConsesLow.list(tense));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 99853L)
    public static SubLObject pph_finite_verb_predP(final SubLObject pos_pred) {
        return pph_utilities.pph_genl_pos_predP(pos_pred, pph_phrase_resolution.$const172$tensed, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 99951L)
    public static SubLObject pph_non_plural_noun_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const219$nonPlural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100074L)
    public static SubLObject pph_plural_noun_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const149$plural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100190L)
    public static SubLObject pph_plural_verb_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, pph_phrase_resolution.$const220$pluralVerb_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100310L)
    public static SubLObject pph_singular_verb_preds_for_tenses(final SubLObject tenses) {
        return pph_utilities.pph_filter_preds((SubLObject)ConsesLow.list(pph_phrase_resolution.$const221$thirdPersonSg_Generic), tenses, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100437L)
    public static SubLObject pph_singular_verb_pred_for_tense(final SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose(pph_phrase_resolution.$const221$thirdPersonSg_Generic, tense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100576L)
    public static SubLObject pph_plural_verb_preds_for_tenses(final SubLObject tenses) {
        return pph_utilities.pph_filter_preds((SubLObject)ConsesLow.list(pph_phrase_resolution.$const220$pluralVerb_Generic), tenses, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100698L)
    public static SubLObject pph_plural_verb_pred_for_tense(final SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose(pph_phrase_resolution.$const220$pluralVerb_Generic, tense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 100832L)
    public static SubLObject pph_phrase_unify_pos_preds(final SubLObject phrase1, final SubLObject phrase2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject p1_preds = pph_phrase.pph_phrase_agr_preds(phrase1, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        final SubLObject p2_preds = pph_phrase.pph_phrase_agr_preds(phrase2, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (!p1_preds.equal(p2_preds)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject new_preds = pph_utilities.pph_filter_preds(p1_preds, p2_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                if (pph_phrase_resolution.NIL != new_preds) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str222$__Unifying__S_and__S_to__S___, p1_preds, p2_preds, new_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_update_agr_preds(phrase1, p2_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                    pph_phrase.pph_phrase_update_agr_preds(phrase2, p1_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(phrase1) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtrP(phrase1, phrase2)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase_resolution.$str223$Using_agr_preds__S_from_done_head, p1_preds, phrase1, phrase2);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    pph_phrase.pph_phrase_set_agr_preds(phrase2, p1_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                else if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_doneP(phrase2) && pph_phrase_resolution.NIL != pph_phrase.pph_phrase_head_dtrP(phrase2, phrase1)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase_resolution.$str223$Using_agr_preds__S_from_done_head, p2_preds, phrase2, phrase1);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    pph_phrase.pph_phrase_set_agr_preds(phrase1, p2_preds, (SubLObject)pph_phrase_resolution.UNPROVIDED);
                }
                else if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase_resolution.$str224$Couldn_t_unify__S_and__S___, p1_preds, p2_preds);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str225$__AGRs_are_now____S_and____S___, pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return Values.values(pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 102192L)
    public static SubLObject pph_phrase_starts_with_detpP(final SubLObject phrase) {
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        return pph_phrase_detpP(left_dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 102461L)
    public static SubLObject pph_phrase_starts_with_detP(final SubLObject phrase) {
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_phrase_resolution.NIL;
        }
        final SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        return pph_phrase_determinerP(left_dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 102735L)
    public static SubLObject pph_phrase_determinerP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.T), pph_phrase_resolution.$const153$Determiner, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 102909L)
    public static SubLObject pph_phrase_detpP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_categoryP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_phrase_resolution.T), pph_detp_nart(), pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103090L)
    public static SubLObject pph_detp_nart() {
        final SubLObject nart = pph_detp_nart_cached();
        if (pph_phrase_resolution.NIL == nart_handles.nart_p(nart)) {
            clear_pph_detp_nart_cached();
        }
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103246L)
    public static SubLObject clear_pph_detp_nart_cached() {
        final SubLObject cs = pph_phrase_resolution.$pph_detp_nart_cached_caching_state$.getGlobalValue();
        if (pph_phrase_resolution.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103246L)
    public static SubLObject remove_pph_detp_nart_cached() {
        return memoization_state.caching_state_remove_function_results_with_args(pph_phrase_resolution.$pph_detp_nart_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pph_phrase_resolution.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103246L)
    public static SubLObject pph_detp_nart_cached_internal() {
        return narts_high.find_nart((SubLObject)pph_phrase_resolution.$list227);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103246L)
    public static SubLObject pph_detp_nart_cached() {
        SubLObject caching_state = pph_phrase_resolution.$pph_detp_nart_cached_caching_state$.getGlobalValue();
        if (pph_phrase_resolution.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_phrase_resolution.$sym226$PPH_DETP_NART_CACHED, (SubLObject)pph_phrase_resolution.$sym228$_PPH_DETP_NART_CACHED_CACHING_STATE_, (SubLObject)pph_phrase_resolution.NIL, (SubLObject)pph_phrase_resolution.EQL, (SubLObject)pph_phrase_resolution.ZERO_INTEGER, (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_detp_nart_cached_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103343L)
    public static SubLObject pph_wordify_sem_free_noun(final SubLObject phrase) {
        if (pph_phrase_resolution.NIL == pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
            pph_wordify_noun(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 103505L)
    public static SubLObject pph_wordify_noun(final SubLObject phrase) {
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        if (pph_phrase_resolution.NIL != string && pph_phrase_resolution.NIL != pph_noun_stringP(string) && pph_phrase_resolution.NIL == lexicon_accessors.closed_lexical_class_stringP(string, (SubLObject)pph_phrase_resolution.UNPROVIDED)) {
            final SubLObject wu = lexicon_accessors.best_wu_for_string(string, pph_phrase_resolution.$const148$Noun);
            if (pph_phrase_resolution.NIL != wu) {
                final SubLObject pos = lexicon_accessors.best_pos_for_stringXwuXpos(string, wu, pph_phrase_resolution.$const148$Noun);
                pph_phrase.pph_phrase_set_wu(phrase, wu);
                pph_phrase.pph_phrase_set_category(phrase, pos, (SubLObject)pph_phrase_resolution.UNPROVIDED);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 104177L)
    public static SubLObject pph_noun_stringP(final SubLObject string) {
        return rkf_string_weeders.rkf_noun_stringP(string, (SubLObject)pph_phrase_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase-resolution.lisp", position = 104449L)
    public static SubLObject pph_phrase_switch_arg1_and_arg2_in_dtrs(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase_resolution.T, (SubLObject)pph_phrase_resolution.$str229$__Switching_arg1_and_arg2_in__S__, phrase, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED, (SubLObject)pph_phrase_resolution.UNPROVIDED);
        }
        SubLObject dtr_num = (SubLObject)pph_phrase_resolution.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject successP;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase_resolution.NIL, v_iteration = (SubLObject)pph_phrase_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER)) {
                element_num = ((pph_phrase_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase_resolution.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_resolution.NIL != pph_phrase.pph_repeated_phrase_p(dtr) && pph_phrase_resolution.NIL != pph_phrase.pph_repeated_phrase_references_argP(dtr, (SubLObject)pph_phrase_resolution.$kw230$ARG2)) {
                    if (pph_phrase_resolution.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase_resolution.ONE_INTEGER) && pph_phrase_resolution.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase_resolution.$str231$Can_t_switch_arg1_and_arg2_in_rep, dtr);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    return (SubLObject)pph_phrase_resolution.NIL;
                }
                if (pph_phrase_resolution.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    successP = pph_phrase_switch_arg1_and_arg2_in_dtrs(dtr);
                    if (pph_phrase_resolution.NIL == successP) {
                        return (SubLObject)pph_phrase_resolution.NIL;
                    }
                }
                else {
                    pph_phrase.pph_phrase_set_cycl(dtr, pph_utilities.pph_switch_arg1_and_arg2(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_phrase_resolution.UNPROVIDED)));
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase_resolution.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    public static SubLObject declare_pph_phrase_resolution_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_note_unfinished_phrase", "PPH-NOTE-UNFINISHED-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_note_unfinished_dtrs", "PPH-PHRASE-NOTE-UNFINISHED-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_get_string", "PPH-PHRASE-GET-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_quoted_phrase_get_string", "PPH-QUOTED-PHRASE-GET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_nospace_phrase_get_string", "PPH-NOSPACE-PHRASE-GET-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_maybe_throw_hl_supports", "PPH-PHRASE-MAYBE-THROW-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "maybe_throw_pph_hl_supports", "MAYBE-THROW-PPH-HL-SUPPORTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_nospace_phrase_output_list_from_dtr", "PPH-NOSPACE-PHRASE-OUTPUT-LIST-FROM-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_get_string_from_dtrs", "PPH-PHRASE-GET-STRING-FROM-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_try_to_resolve_dtr_strings", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_repeated_phrase_dtrs", "PPH-PHRASE-RESOLVE-REPEATED-PHRASE-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_repeated_phrase_expansion", "PPH-REPEATED-PHRASE-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_repeated_phrase_expansion_internal", "PPH-REPEATED-PHRASE-EXPANSION-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_one_repeated_phrase", "PPH-ONE-REPEATED-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_generic_arg_sequence", "PPH-GENERIC-ARG-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_current_list_item", "PPH-CURRENT-LIST-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_lookup_current_list_item", "PPH-LOOKUP-CURRENT-LIST-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_extensional_list_p", "PPH-EXTENSIONAL-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_current_list_items", "PPH-PHRASE-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_resolve_current_list_items", "PPH-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_current_list_item_formula_p", "PPH-CURRENT-LIST-ITEM-FORMULA-P", 1, 0, false);
        new $pph_current_list_item_formula_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_current_list_item_formula_item", "PPH-CURRENT-LIST-ITEM-FORMULA-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_repeated_phrase_increment", "PPH-REPEATED-PHRASE-INCREMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_try_to_resolve_dtr_string", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_clarifying_dtr", "PPH-PHRASE-RESOLVE-CLARIFYING-DTR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_note_phraseXdtr_agr", "PPH-NOTE-PHRASE&DTR-AGR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_dtr_relative_agr", "PPH-PHRASE-SET-DTR-RELATIVE-AGR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_dtr", "PPH-PHRASE-RESOLVE-DTR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_arg0_items", "PPH-PHRASE-SET-ARG0-ITEMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_maybe_make_arg0_item", "PPH-PHRASE-MAYBE-MAKE-ARG0-ITEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_make_arg0_item", "PPH-PHRASE-MAKE-ARG0-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_independent_phraseP", "PPH-PHRASE-INDEPENDENT-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_agr_target_resolvedP", "PPH-PHRASE-AGR-TARGET-RESOLVED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_output_list_from_finished_dtrs", "PPH-PHRASE-SET-OUTPUT-LIST-FROM-FINISHED-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_item_empty_p", "PPH-PHRASE-OUTPUT-ITEM-EMPTY-P", 1, 0, false);
        new $pph_phrase_output_item_empty_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_arg0_item", "PPH-PHRASE-ARG0-ITEM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "reverse_string_list_term_anchor", "REVERSE-STRING-LIST-TERM-ANCHOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_arg_dtrs", "PPH-PHRASE-ARG-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_arg_phraseP", "PPH-PHRASE-ARG-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_arg0_phraseP", "PPH-PHRASE-ARG0-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_condition", "PPH-PHRASE-RESOLVE-CONDITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "incomplete_pph_phrase_p", "INCOMPLETE-PPH-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_indexicals_in_test", "PPH-PHRASE-RESOLVE-INDEXICALS-IN-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_nth_phrase_naut_p", "PPH-NTH-PHRASE-NAUT-P", 1, 0, false);
        new $pph_nth_phrase_naut_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_nth_phrases", "PPH-PHRASE-RESOLVE-NTH-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_transform_nth", "PPH-PHRASE-TRANSFORM-NTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_relative_agr", "PPH-PHRASE-SET-RELATIVE-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_relative_agr_internal", "PPH-PHRASE-SET-RELATIVE-AGR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_resolve_string", "PPH-PHRASE-RESOLVE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "anaphor_needed_for_phraseP", "ANAPHOR-NEEDED-FOR-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_category_ok_for_anaphorP", "PPH-CATEGORY-OK-FOR-ANAPHOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "reflexive_needed_for_phraseP", "REFLEXIVE-NEEDED-FOR-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_source_pos", "PPH-PHRASE-SOURCE-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_source_pos", "PPH-PHRASE-SET-SOURCE-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_replace_generic_args", "PPH-PHRASE-REPLACE-GENERIC-ARGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_replace_generic_args_top_level", "PPH-PHRASE-REPLACE-GENERIC-ARGS-TOP-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_update_generic_args_in_conditional_test", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-CONDITIONAL-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_update_generic_args_in_variable_binding_query", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-VARIABLE-BINDING-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_replace_generic_arg_simple", "PPH-PHRASE-REPLACE-GENERIC-ARG-SIMPLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_kept_generic_arg_phrase_p", "PPH-KEPT-GENERIC-ARG-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_ok_for_arg0P", "PPH-PHRASE-OK-FOR-ARG0?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_replace_generic_args_recursive", "PPH-PHRASE-REPLACE-GENERIC-ARGS-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserve_matrix_arg0_cycl", "PPH-PHRASE-RESERVE-MATRIX-ARG0-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reset_arg0_reservations", "PPH-PHRASE-RESET-ARG0-RESERVATIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reset_arg0_reservations_int", "PPH-PHRASE-RESET-ARG0-RESERVATIONS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserve_arg0", "PPH-PHRASE-RESERVE-ARG0", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserved_arg0", "PPH-PHRASE-RESERVED-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserved_arg0_low", "PPH-PHRASE-RESERVED-ARG0-LOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserved_arg0_position", "PPH-PHRASE-RESERVED-ARG0-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_reserved_for_arg0_p", "PPH-PHRASE-RESERVED-FOR-ARG0-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_chemical_formula_from_lists_phrase_get_string", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-GET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_output_item_from_atomic_composition_lists", "PPH-OUTPUT-ITEM-FROM-ATOMIC-COMPOSITION-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_atomic_symbol", "PPH-ATOMIC-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_symbol_phrase_get_string", "PPH-SYMBOL-PHRASE-GET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_symbol_string", "PPH-SYMBOL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_add_sentential_force", "PPH-PHRASE-OUTPUT-LIST-ADD-SENTENTIAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_add_sentential_force", "PPH-PHRASE-ADD-SENTENTIAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_add_sentence_initial_force", "PPH-STRING-ADD-SENTENCE-INITIAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_add_sentence_final_force", "PPH-STRING-ADD-SENTENCE-FINAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_has_sentential_forceP", "PPH-PHRASE-OUTPUT-LIST-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_has_sentential_forceP", "PPH-STRING-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_has_sentence_initial_forceP", "PPH-STRING-HAS-SENTENCE-INITIAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_has_sentence_final_forceP", "PPH-STRING-HAS-SENTENCE-FINAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_upcase_leading_smart", "PPH-PHRASE-OUTPUT-LIST-UPCASE-LEADING-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_item_upcase_leading_smart", "PPH-PHRASE-OUTPUT-ITEM-UPCASE-LEADING-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "upcased_leading_smartP", "UPCASED-LEADING-SMART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "ends_with_period_smartP", "ENDS-WITH-PERIOD-SMART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "ends_with_question_mark_smartP", "ENDS-WITH-QUESTION-MARK-SMART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "ends_with_punctuation_smartP", "ENDS-WITH-PUNCTUATION-SMART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_add_period_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PERIOD-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_add_question_mark_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-QUESTION-MARK-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_output_list_add_punctuation_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PUNCTUATION-SMART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_string_add_punctuation_smart", "PPH-STRING-ADD-PUNCTUATION-SMART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_output_list_nonempty_tail", "PPH-OUTPUT-LIST-NONEMPTY-TAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_percent_phrase_get_string", "PPH-PERCENT-PHRASE-GET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_float_precision", "PPH-FLOAT-PRECISION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_coordination_phrase_get_string", "PPH-COORDINATION-PHRASE-GET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_coordination_phrase_get_string_internal", "PPH-COORDINATION-PHRASE-GET-STRING-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "find_dtr_olist_in_olist", "FIND-DTR-OLIST-IN-OLIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_agrees_with_no_quantified_phrase_p", "PPH-PHRASE-AGREES-WITH-NO-QUANTIFIED-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_no_quantified_det_nbar_phrase_p", "PPH-NO-QUANTIFIED-DET-NBAR-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_coordination_phrase_operator_item", "PPH-COORDINATION-PHRASE-OPERATOR-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_nbar_coordination_phrase_p", "PPH-NBAR-COORDINATION-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_nbar_coordination_phrase_distribute_determiner", "PPH-NBAR-COORDINATION-PHRASE-DISTRIBUTE-DETERMINER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_subject_verb_agreement", "PPH-PHRASE-SET-SUBJECT-VERB-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_default_verb_pred", "PPH-PHRASE-DEFAULT-VERB-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_peer_agreement", "PPH-PHRASE-SET-PEER-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_tense_agreement", "PPH-PHRASE-SET-TENSE-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_clarifying_agreement", "PPH-PHRASE-SET-CLARIFYING-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "uninformative_paraphrase_p", "UNINFORMATIVE-PARAPHRASE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_agr_target_phrase", "PPH-PHRASE-AGR-TARGET-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_relative_agr_target", "PPH-PHRASE-RELATIVE-AGR-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_set_det_nbar_agreement", "PPH-PHRASE-SET-DET-NBAR-AGREEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_lexical_head_cycl", "PPH-PHRASE-LEXICAL-HEAD-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_dtr_nested_withinP", "PPH-PHRASE-DTR-NESTED-WITHIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_subject_of_clause", "PPH-PHRASE-SUBJECT-OF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_subject_domain", "PPH-PHRASE-SUBJECT-DOMAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_find_potential_binders", "PPH-PHRASE-FIND-POTENTIAL-BINDERS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_find_potential_binders_int", "PPH-PHRASE-FIND-POTENTIAL-BINDERS-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_could_bind_possessive_here", "PPH-PHRASE-COULD-BIND-POSSESSIVE-HERE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_could_bind_reflexive_here", "PPH-PHRASE-COULD-BIND-REFLEXIVE-HERE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_english_indefinite_article", "PPH-PHRASE-ENGLISH-INDEFINITE-ARTICLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_english_indefinite_np", "PPH-PHRASE-ENGLISH-INDEFINITE-NP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_copular_complementP", "PPH-COPULAR-COMPLEMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_noun_predP", "PPH-NOUN-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_singular_noun_predP", "PPH-SINGULAR-NOUN-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_non_singular_noun_predP", "PPH-NON-SINGULAR-NOUN-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_singular_determiner_string", "PPH-SINGULAR-DETERMINER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "tense_preds_for_constraints", "TENSE-PREDS-FOR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "tense_pred_for_constraints", "TENSE-PRED-FOR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_pred_for_subject_preds", "VERB-PRED-FOR-SUBJECT-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_preds_for_subject", "VERB-PREDS-FOR-SUBJECT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_pred_for_subject", "VERB-PRED-FOR-SUBJECT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_strengthen_verb_constraints", "PPH-STRENGTHEN-VERB-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_verb_constraints_could_be_present_tenseP", "PPH-VERB-CONSTRAINTS-COULD-BE-PRESENT-TENSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_verb_constraints_ensure_present_tense", "PPH-VERB-CONSTRAINTS-ENSURE-PRESENT-TENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_remove_weak_verb_constraints", "PPH-REMOVE-WEAK-VERB-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_preds_for_subject_int", "VERB-PREDS-FOR-SUBJECT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_pred_for_subject_int", "VERB-PRED-FOR-SUBJECT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_preds_for_subject_pronoun", "VERB-PREDS-FOR-SUBJECT-PRONOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_pred_for_subject_pronoun", "VERB-PRED-FOR-SUBJECT-PRONOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_preds_for_subject_preds", "VERB-PREDS-FOR-SUBJECT-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "verb_pred_for_subject_pred", "VERB-PRED-FOR-SUBJECT-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_finite_verb_predP", "PPH-FINITE-VERB-PRED?", 1, 0, false);
        new $pph_finite_verb_predP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_non_plural_noun_predP", "PPH-NON-PLURAL-NOUN-PRED?", 1, 0, false);
        new $pph_non_plural_noun_predP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_plural_noun_predP", "PPH-PLURAL-NOUN-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_plural_verb_predP", "PPH-PLURAL-VERB-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_singular_verb_preds_for_tenses", "PPH-SINGULAR-VERB-PREDS-FOR-TENSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_singular_verb_pred_for_tense", "PPH-SINGULAR-VERB-PRED-FOR-TENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_plural_verb_preds_for_tenses", "PPH-PLURAL-VERB-PREDS-FOR-TENSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_plural_verb_pred_for_tense", "PPH-PLURAL-VERB-PRED-FOR-TENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_unify_pos_preds", "PPH-PHRASE-UNIFY-POS-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_starts_with_detpP", "PPH-PHRASE-STARTS-WITH-DETP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_starts_with_detP", "PPH-PHRASE-STARTS-WITH-DET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_determinerP", "PPH-PHRASE-DETERMINER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_detpP", "PPH-PHRASE-DETP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_detp_nart", "PPH-DETP-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "clear_pph_detp_nart_cached", "CLEAR-PPH-DETP-NART-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "remove_pph_detp_nart_cached", "REMOVE-PPH-DETP-NART-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_detp_nart_cached_internal", "PPH-DETP-NART-CACHED-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_detp_nart_cached", "PPH-DETP-NART-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_wordify_sem_free_noun", "PPH-WORDIFY-SEM-FREE-NOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_wordify_noun", "PPH-WORDIFY-NOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_noun_stringP", "PPH-NOUN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase_resolution", "pph_phrase_switch_arg1_and_arg2_in_dtrs", "PPH-PHRASE-SWITCH-ARG1-AND-ARG2-IN-DTRS", 1, 0, false);
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    public static SubLObject init_pph_phrase_resolution_file() {
        pph_phrase_resolution.$pph_phrase_get_string_depth$ = SubLFiles.defparameter("*PPH-PHRASE-GET-STRING-DEPTH*", (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        pph_phrase_resolution.$pph_phrase_get_string_max_depth$ = SubLFiles.defparameter("*PPH-PHRASE-GET-STRING-MAX-DEPTH*", (SubLObject)pph_phrase_resolution.$int3$99);
        pph_phrase_resolution.$pph_repeated_phrase_lists$ = SubLFiles.defparameter("*PPH-REPEATED-PHRASE-LISTS*", (SubLObject)pph_phrase_resolution.NIL);
        pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$ = SubLFiles.defparameter("*PPH-PHRASE-TRANSFORM-NTH-REFERENCE-PHRASE*", (SubLObject)pph_phrase_resolution.NIL);
        pph_phrase_resolution.$pph_symbol_phrase_stack$ = SubLFiles.defparameter("*PPH-SYMBOL-PHRASE-STACK*", (SubLObject)pph_phrase_resolution.NIL);
        pph_phrase_resolution.$pph_coordination_phrase_nesting$ = SubLFiles.defvar("*PPH-COORDINATION-PHRASE-NESTING*", (SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        pph_phrase_resolution.$pph_coordination_phrase_nesting_max$ = SubLFiles.defparameter("*PPH-COORDINATION-PHRASE-NESTING-MAX*", (SubLObject)pph_phrase_resolution.TEN_INTEGER);
        pph_phrase_resolution.$pph_english_lexical_indefinites$ = SubLFiles.deflexical("*PPH-ENGLISH-LEXICAL-INDEFINITES*", (SubLObject)pph_phrase_resolution.$list195);
        pph_phrase_resolution.$pph_detp_nart_cached_caching_state$ = SubLFiles.deflexical("*PPH-DETP-NART-CACHED-CACHING-STATE*", (SubLObject)pph_phrase_resolution.NIL);
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    public static SubLObject setup_pph_phrase_resolution_file() {
        memoization_state.note_globally_cached_function((SubLObject)pph_phrase_resolution.$sym226$PPH_DETP_NART_CACHED);
        return (SubLObject)pph_phrase_resolution.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_phrase_resolution_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_phrase_resolution_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_phrase_resolution_file();
    }
    
    static {
        me = (SubLFile)new pph_phrase_resolution();
        pph_phrase_resolution.$pph_phrase_get_string_depth$ = null;
        pph_phrase_resolution.$pph_phrase_get_string_max_depth$ = null;
        pph_phrase_resolution.$pph_repeated_phrase_lists$ = null;
        pph_phrase_resolution.$pph_phrase_transform_nth_reference_phrase$ = null;
        pph_phrase_resolution.$pph_symbol_phrase_stack$ = null;
        pph_phrase_resolution.$pph_coordination_phrase_nesting$ = null;
        pph_phrase_resolution.$pph_coordination_phrase_nesting_max$ = null;
        pph_phrase_resolution.$pph_english_lexical_indefinites$ = null;
        pph_phrase_resolution.$pph_detp_nart_cached_caching_state$ = null;
        $str0$Unable_to_finish = SubLObjectFactory.makeString("Unable to finish");
        $str1$___A__S__ = SubLObjectFactory.makeString("~&~A ~S~%");
        $str2$Unfinished_dtr = SubLObjectFactory.makeString("Unfinished dtr");
        $int3$99 = SubLObjectFactory.makeInteger(99);
        $kw4$PHRASE_CYCL = SubLObjectFactory.makeKeyword("PHRASE-CYCL");
        $str5$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str6$__ = SubLObjectFactory.makeString(") ");
        $str7$__Exceeded_PPH_PHRASE_GET_STRING_ = SubLObjectFactory.makeString("~&Exceeded PPH-PHRASE-GET-STRING max depth of ~S.~% Phrase: ~S~%");
        $str8$__Resolved_conditional_phrase_to_ = SubLObjectFactory.makeString("~&Resolved conditional phrase to ~S ~S.");
        $str9$Tried_to_generating_CycL_phrase_w = SubLObjectFactory.makeString("Tried to generating CycL phrase with unknown CycL. Trying again as regular phrase:~% ~S");
        $str10$Resolved_formerly_CycL_phrase_wit = SubLObjectFactory.makeString("Resolved formerly CycL phrase with unknown CycL to ~S");
        $str11$__Using_CycL_for_object___S___ = SubLObjectFactory.makeString("~&Using CycL for object: ~S.~%");
        $str12$__Doing_anaphor_paraphrase_with_f = SubLObjectFactory.makeString("~&Doing anaphor paraphrase with formula ~S.~%");
        $str13$__Doing_coordination_paraphrase_w = SubLObjectFactory.makeString("~&Doing coordination paraphrase with formula ~S.~%");
        $str14$__Suspending_bullet_use_for____S_ = SubLObjectFactory.makeString("~&Suspending bullet use for~% ~S~%");
        $str15$__Turning_bullet_use_back_on___ = SubLObjectFactory.makeString("~&Turning bullet use back on.~%");
        $str16$__Doing_chemical_formula_from_lis = SubLObjectFactory.makeString("~&Doing chemical-formula-from-lists paraphrase.~%");
        $str17$__Doing_percent_paraphrase___ = SubLObjectFactory.makeString("~&Doing percent paraphrase.~%");
        $str18$__Generating_symbol_paraphrase_of = SubLObjectFactory.makeString("~&Generating symbol paraphrase of ~S.~%");
        $str19$__Using_quoted_string_for_string_ = SubLObjectFactory.makeString("~&Using quoted string for string: ~S.~%");
        $str20$__Using_terse_paraphrase_for__S__ = SubLObjectFactory.makeString("~&Using terse paraphrase for ~S~%");
        $str21$__Using_precise_paraphrase_for__S = SubLObjectFactory.makeString("~&Using precise paraphrase for ~S~%");
        $sym22$PPH_PRECISION_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $str23$__Unknown_cycl_for__S___ = SubLObjectFactory.makeString("~&Unknown cycl for ~S.~%");
        $str24$__Using_precision__S__ = SubLObjectFactory.makeString("~&Using precision ~S~%");
        $str25$__Using_quoted_paraphrase_for_ter = SubLObjectFactory.makeString("~&Using quoted paraphrase for term.~%");
        $str26$Using__S_for_quoted_paraphrase_of = SubLObjectFactory.makeString("Using ~S for quoted paraphrase of ~S");
        $str27$__Using_nospace_paraphrase_for__S = SubLObjectFactory.makeString("~&Using nospace paraphrase for ~S~%");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-PREDS"));
        $kw29$PPH_HL_SUPPORTS_FOUND = SubLObjectFactory.makeKeyword("PPH-HL-SUPPORTS-FOUND");
        $kw30$RESOLVED = SubLObjectFactory.makeKeyword("RESOLVED");
        $const31$PossessivePhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $str32$Couldn_t_resolve_repeated_dtrs_fo = SubLObjectFactory.makeString("Couldn't resolve repeated dtrs for ~S");
        $str33$__Starting_dtr_resolution_for_phr = SubLObjectFactory.makeString("~&Starting dtr resolution for phrase ~D");
        $str34$___D_of__D_daughters_unfinished_ = SubLObjectFactory.makeString("~&~D of ~D daughters unfinished.");
        $str35$Can_t_resolve_mother_due_to_impos = SubLObjectFactory.makeString("Can't resolve mother due to impossible dtr:~% ~S");
        $str36$__Finished__S_iteration_s____D_of = SubLObjectFactory.makeString("~&Finished ~S iteration(s): ~D of ~D daughters unfinished.");
        $str37$Couldn_t_finish__S___because_of_u = SubLObjectFactory.makeString("Couldn't finish ~S~% because of unfinished dtrs:~% ~S~%");
        $kw38$NOT_RESOLVED = SubLObjectFactory.makeKeyword("NOT-RESOLVED");
        $sym39$PPH_PHRASE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-P");
        $str40$Problem_expanding_repeated_phrase = SubLObjectFactory.makeString("Problem expanding repeated phrase~% ~S");
        $str41$PPH_REPEATED_PHRASE_EXPANSION_got = SubLObjectFactory.makeString("PPH-REPEATED-PHRASE-EXPANSION got non-formula ~S");
        $sym42$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str43$Repeating_phrase__S = SubLObjectFactory.makeString("Repeating phrase ~S");
        $str44$__etc_ = SubLObjectFactory.makeString(", etc.");
        $str45$Can_t_get_current_list_item_from_ = SubLObjectFactory.makeString("Can't get current list item from ~S");
        $kw46$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $list47 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str48$Updating__S_to____S____Result___S = SubLObjectFactory.makeString("Updating ~S to~% ~S.~% Result: ~S~%");
        $sym49$PPH_CURRENT_LIST_ITEM_FORMULA_P = SubLObjectFactory.makeSymbol("PPH-CURRENT-LIST-ITEM-FORMULA-P");
        $sym50$PPH_CURRENT_LIST_ITEM_FORMULA_ITEM = SubLObjectFactory.makeSymbol("PPH-CURRENT-LIST-ITEM-FORMULA-ITEM");
        $list51 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentListItemFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-EXTENSIONAL-LIST-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $str53$__Resolving__S_to__S__ = SubLObjectFactory.makeString("~&Resolving ~S to ~S~%");
        $list54 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"));
        $str55$ = SubLObjectFactory.makeString("");
        $str56$__Phrase_agr___S__ = SubLObjectFactory.makeString("~&Phrase agr: ~S~%");
        $str57$___Dtr__D_category_is__S___ = SubLObjectFactory.makeString("~& Dtr ~D category is ~S.~%");
        $str58$___Dtr__D_agr_is__S___ = SubLObjectFactory.makeString("~& Dtr ~D agr is ~S.~%");
        $str59$__Set_agr_of_dtr___D_to__S___ = SubLObjectFactory.makeString("~&Set agr of dtr #~D to ~S.~%");
        $str60$___Set_head_agr_to__S___ = SubLObjectFactory.makeString("~& Set head agr to ~S.~%");
        $str61$__Finished__S____with__D_dtrs____ = SubLObjectFactory.makeString("~&Finished ~S~% (with ~D dtrs).~%");
        $str62$___Set_phrase_agr_to__S_based_on_ = SubLObjectFactory.makeString("~& Set phrase agr to ~S based on head dtr.~%");
        $str63$___Dtrs_left_unfinished___D___ = SubLObjectFactory.makeString("~& Dtrs left unfinished: ~D.~%");
        $kw64$MOTHER = SubLObjectFactory.makeKeyword("MOTHER");
        $str65$__Agr_target__mother__not_resolve = SubLObjectFactory.makeString("~&Agr target (mother) not resolved: ~S.~%");
        $str66$__Phrase_agrees_with_itself_____ = SubLObjectFactory.makeString("~&Phrase agrees with itself(!)~%");
        $str67$__Agr_target_not_resolved___S___ = SubLObjectFactory.makeString("~&Agr target not resolved: ~S.~%");
        $str68$_ = SubLObjectFactory.makeString("\"");
        $str69$Setting_mother_s_output_list_from = SubLObjectFactory.makeString("Setting mother's output list from unfinished dtr with CycL ~S:~% ~S~%");
        $str70$_Dth_dtr_output_list___S = SubLObjectFactory.makeString("~Dth dtr output list: ~S");
        $sym71$PPH_PHRASE_OUTPUT_ITEM_EMPTY_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-EMPTY-P");
        $list72 = ConsesLow.list((SubLObject)pph_phrase_resolution.ZERO_INTEGER);
        $sym73$INCOMPLETE_PPH_PHRASE_P = SubLObjectFactory.makeSymbol("INCOMPLETE-PPH-PHRASE-P");
        $str74$__Test_has_unresolved_indexical_p = SubLObjectFactory.makeString("~&Test has unresolved indexical phrases. Postponing: ~S.~%");
        $str75$__Ran_conditional_test_____S___Re = SubLObjectFactory.makeString("~&Ran conditional test:~% ~S~% Result: ~S.~%");
        $str76$Pass = SubLObjectFactory.makeString("Pass");
        $str77$Fail = SubLObjectFactory.makeString("Fail");
        $str78$___Initial_winning_phrase_____S__ = SubLObjectFactory.makeString("~& Initial winning phrase:~% ~S~% with agr preds ~S");
        $str79$___New_phrase___S___with_agr_pred = SubLObjectFactory.makeString("~& New phrase: ~S~% with agr preds ~S");
        $str80$___Phrase_has__D_daughters___ = SubLObjectFactory.makeString("~& Phrase has ~D daughters.~%");
        $sym81$PPH_NTH_PHRASE_NAUT_P = SubLObjectFactory.makeSymbol("PPH-NTH-PHRASE-NAUT-P");
        $list82 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialConstituent")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym83$PPH_PHRASE_TRANSFORM_NTH = SubLObjectFactory.makeSymbol("PPH-PHRASE-TRANSFORM-NTH");
        $str84$Adding_alternatives_for_agr_targe = SubLObjectFactory.makeString("Adding alternatives for agr target~% ~S~% to ~S");
        $str85$Done__S_alternatives_of__S = SubLObjectFactory.makeString("Done ~S alternatives of ~S");
        $str86$Added__D_alternatives_ = SubLObjectFactory.makeString("Added ~D alternatives.");
        $kw87$SUBJECT_VERB = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $kw88$DET_NBAR = SubLObjectFactory.makeKeyword("DET-NBAR");
        $kw89$PEER = SubLObjectFactory.makeKeyword("PEER");
        $kw90$TENSE = SubLObjectFactory.makeKeyword("TENSE");
        $str91$__Paraphrasing__S_with_agreement_ = SubLObjectFactory.makeString("~&Paraphrasing ~S with agreement ~S.~%");
        $str92$___Output_list_is____S___ = SubLObjectFactory.makeString("~& Output list is~% ~S.~%");
        $str93$___Arg_position_map_is__S___ = SubLObjectFactory.makeString("~& Arg-position map is ~S.~%");
        $str94$___SUID_is__S___ = SubLObjectFactory.makeString("~& SUID is ~S.~%");
        $str95$_____of_dtrs___S___ = SubLObjectFactory.makeString("~& # of dtrs: ~S.~%");
        $str96$Can_t_resolve_string_of__S = SubLObjectFactory.makeString("Can't resolve string of ~S");
        $kw97$CYCL_PHRASE = SubLObjectFactory.makeKeyword("CYCL-PHRASE");
        $str98$Sanity_check_failed__rm_cycl__S_i = SubLObjectFactory.makeString("Sanity check failed: rm cycl ~S is not equal to phrase cycl ~S");
        $str99$Must_use_reflexive_for____S___due = SubLObjectFactory.makeString("Must use reflexive for~% ~S~% due to~% ~S");
        $kw100$SOURCE_POS = SubLObjectFactory.makeKeyword("SOURCE-POS");
        $str101$__Using_arg0_for__S_with_formula_ = SubLObjectFactory.makeString("~&Using arg0 for ~S with formula ~S~%");
        $kw102$ARG0 = SubLObjectFactory.makeKeyword("ARG0");
        $str103$Supposedly___S_isn_t_part_of_old_ = SubLObjectFactory.makeString("Supposedly, ~S isn't part of old CycL.");
        $str104$Updated_conditional_test_to__S__ = SubLObjectFactory.makeString("Updated conditional test to ~S~%");
        $str105$Updated_test_to____S_using_non_te = SubLObjectFactory.makeString("Updated test to~% ~S using non-template~% ~S~%");
        $str106$Updated_variable_bindings_query_t = SubLObjectFactory.makeString("Updated variable bindings query-template to ~S~%");
        $str107$Updated_variable_bindings_query_t = SubLObjectFactory.makeString("Updated variable bindings query-template to~% ~S using non-template~% ~S~%");
        $str108$__Replacing__S_with__S___ = SubLObjectFactory.makeString("~&Replacing ~S with ~S.~%");
        $list109 = ConsesLow.list((SubLObject)pph_phrase_resolution.TWO_INTEGER);
        $str110$Can_t_reconcile__S_and__S_ = SubLObjectFactory.makeString("Can't reconcile ~S and ~S.");
        $kw111$NO_ACTION = SubLObjectFactory.makeKeyword("NO-ACTION");
        $str112$No_current_arg0_to_reserve_for__S = SubLObjectFactory.makeString("No current arg0 to reserve for ~S");
        $kw113$NO_CURRENT_ARG0 = SubLObjectFactory.makeKeyword("NO-CURRENT-ARG0");
        $kw114$RESERVED_FOR_MATRIX_ARG0 = SubLObjectFactory.makeKeyword("RESERVED-FOR-MATRIX-ARG0");
        $kw115$HTML = SubLObjectFactory.makeKeyword("HTML");
        $sym116$_SYMBOL = SubLObjectFactory.makeSymbol("?SYMBOL");
        $const117$atomicSymbol = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("atomicSymbol"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SYMBOL"));
        $kw119$SYMBOL = SubLObjectFactory.makeKeyword("SYMBOL");
        $const120$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $list121 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $sym122$_CODE = SubLObjectFactory.makeSymbol("?CODE");
        $const123$htmlGlyphCode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("htmlGlyphCode"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CODE"));
        $const125$htmlStringVersionOfCharacter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("htmlStringVersionOfCharacter"));
        $const126$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $kw127$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw128$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw129$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $kw130$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str131$_ = SubLObjectFactory.makeString(".");
        $str132$_ = SubLObjectFactory.makeString("?");
        $kw133$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym134$ALPHANUMERIC_CHAR_P = SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-P");
        $list135 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LAST-NON-EMPTY-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("TRAILING-ITEMS"));
        $int136$100 = SubLObjectFactory.makeInteger(100);
        $sym137$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $str138$Using_significant_digits_cutoff_o = SubLObjectFactory.makeString("Using significant digits cutoff of ~S for ~S");
        $str139$_ = SubLObjectFactory.makeString("%");
        $list140 = ConsesLow.list((SubLObject)Characters.CHAR_0);
        $sym141$ALPHA_CHAR_P = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $str142$__Recursion_limit___S__exceeded_i = SubLObjectFactory.makeString("~&Recursion limit (~S) exceeded in PPH-COORDINATION-PHRASE-GET-STRING.");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-TYPE-ID-STRING"));
        $kw144$AND = SubLObjectFactory.makeKeyword("AND");
        $str145$Changing_coordination_to__OR__bas = SubLObjectFactory.makeString("Changing coordination to :OR, based on :NO determiner");
        $kw146$OR = SubLObjectFactory.makeKeyword("OR");
        $str147$Inserting_dummy_phrase__S = SubLObjectFactory.makeString("Inserting dummy phrase ~S");
        $const148$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const149$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $const150$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $str151$__Setting_conjunctive_agr_of__S_t = SubLObjectFactory.makeString("~&Setting conjunctive agr of ~S to ~S");
        $const152$No_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("No-NLAttr"));
        $const153$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $str154$Removed_det_sister_from_mother_ = SubLObjectFactory.makeString("Removed det-sister from mother.");
        $str155$subject_pointer_is_nth_phrase___S = SubLObjectFactory.makeString("subject pointer is nth phrase: ~S");
        $str156$__Not_setting_subject_verb_agreem = SubLObjectFactory.makeString("~&Not setting subject verb agreement because subject dtr is not finished.~%");
        $kw157$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const158$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $str159$__Using_internal_constraints___S_ = SubLObjectFactory.makeString("~&Using internal constraints: ~S~%");
        $str160$___filtered_from__S___ = SubLObjectFactory.makeString("...filtered from ~S.~%");
        $str161$__Setting_verb_agreement_to__S___ = SubLObjectFactory.makeString("~&Setting verb agreement to ~S.~%");
        $str162$Using_default_verb_form___S_ = SubLObjectFactory.makeString("Using default verb form: ~S.");
        $const163$MeasurableQuantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeasurableQuantity"));
        $const164$adjStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adjStrings"));
        $const165$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $str166$__This_phrase_s_agr_pred_is__S_bu = SubLObjectFactory.makeString("~&This phrase's agr-pred is ~S but its category is ~S:~%~S");
        $str167$__Set_adjective_peer_agreement_to = SubLObjectFactory.makeString("~&Set adjective peer agreement to ~S.~%");
        $const168$untensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("untensed"));
        $str169$__Set_untensed_peer_agreement_to_ = SubLObjectFactory.makeString("~&Set untensed peer agreement to ~S.~%");
        $str170$__Set_peer_agreement_to__S___ = SubLObjectFactory.makeString("~&Set peer agreement to ~S.~%");
        $str171$__Set_peer_agreement_to_default__ = SubLObjectFactory.makeString("~&Set peer agreement to default: ~S.~%");
        $const172$tensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"));
        $str173$__Incorporating_tense_agreement__ = SubLObjectFactory.makeString("~&Incorporating tense agreement ~S.~%");
        $str174$_S = SubLObjectFactory.makeString("~S");
        $str175$__Using_daughter__D_as_agreement_ = SubLObjectFactory.makeString("~&Using daughter ~D as agreement target:~% ~S");
        $const176$BareForm_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr"));
        $str177$__Using_hard_coded_null_determine = SubLObjectFactory.makeString("~&Using hard-coded null determiner hack for #$BareForm-NLAttr.~%");
        $const178$PossessivePronoun_Pre = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePronoun-Pre"));
        $kw179$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $str180$__Setting_det_nbar_agreement_for_ = SubLObjectFactory.makeString("~&Setting det-nbar agreement for possessive.~%");
        $str181$__Using_null_determiner_for_posse = SubLObjectFactory.makeString("~&Using null determiner for possessive nbar.~%");
        $str182$__Setting_det_nbar_agreement_for_ = SubLObjectFactory.makeString("~&Setting det-nbar agreement for ranged phrase.~%");
        $str183$__Setting_determiner_s_agr_pred_f = SubLObjectFactory.makeString("~&Setting determiner's agr-pred from nbar to ~S.");
        $str184$__Setting_agr_pred_from_determine = SubLObjectFactory.makeString("~&Setting agr-pred from determiner to ~S.");
        $sym185$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $str186$__Setting_determiner_nbar_agreeme = SubLObjectFactory.makeString("~&Setting determiner-nbar agreement based on variable determiner.");
        $const187$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $str188$__Setting_determiner_nbar_agreeme = SubLObjectFactory.makeString("~&Setting determiner-nbar agreement to ~S based on number-denoting determiner.");
        $str189$Couldn_t_determine_agreement_info = SubLObjectFactory.makeString("Couldn't determine agreement information: ~S~% DET-HEAD-CYCL: ~S~%");
        $str190$PPH_PHRASE_DTR_NESTED_WITHIN__loo = SubLObjectFactory.makeString("PPH-PHRASE-DTR-NESTED-WITHIN? looking for dtr ~S in non-PPH-PHRASE ~S~%");
        $str191$some = SubLObjectFactory.makeString("some");
        $str192$__Nbar_is_now__S__ = SubLObjectFactory.makeString("~&Nbar is now ~S~%");
        $const193$ExistingStuffType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingStuffType"));
        $str194$__Using_English_specific_indefini = SubLObjectFactory.makeString("~&Using English-specific indefinite determiner hack: ~S with Nbar ~S.~%");
        $list195 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeString("something")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)SubLObjectFactory.makeString("someone")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), (SubLObject)SubLObjectFactory.makeString("someplace")));
        $list196 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")));
        $list197 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str198$Nbar_string_is__S__Output_list___ = SubLObjectFactory.makeString("Nbar string is ~S. Output list: ~S");
        $const199$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)pph_phrase_resolution.NIL);
        $kw201$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $const202$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $const203$verbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $sym204$GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED?");
        $const205$singularVerb_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singularVerb-Generic"));
        $str206$__Subject_agr___S__ = SubLObjectFactory.makeString("~&Subject agr: ~S~%");
        $const207$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $const208$secondPersonSg_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Generic"));
        $const209$secondPersonSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present"));
        $const210$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"));
        $const211$firstPersonSg_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Generic"));
        $const212$firstPersonSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present"));
        $str213$__Using_tenses__S__ = SubLObjectFactory.makeString("~&Using tenses ~S~%");
        $sym214$PPH_FINITE_VERB_PRED_ = SubLObjectFactory.makeSymbol("PPH-FINITE-VERB-PRED?");
        $sym215$PPH_NON_PLURAL_NOUN_PRED_ = SubLObjectFactory.makeSymbol("PPH-NON-PLURAL-NOUN-PRED?");
        $sym216$PPH_PLURAL_NOUN_PRED_ = SubLObjectFactory.makeSymbol("PPH-PLURAL-NOUN-PRED?");
        $sym217$PPH_PLURAL_VERB_PRED_ = SubLObjectFactory.makeSymbol("PPH-PLURAL-VERB-PRED?");
        $str218$__Using_tense__S__ = SubLObjectFactory.makeString("~&Using tense ~S~%");
        $const219$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $const220$pluralVerb_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-Generic"));
        $const221$thirdPersonSg_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Generic"));
        $str222$__Unifying__S_and__S_to__S___ = SubLObjectFactory.makeString("~&Unifying ~S and ~S to ~S.~%");
        $str223$Using_agr_preds__S_from_done_head = SubLObjectFactory.makeString("Using agr preds ~S from done head dtr~% ~S~% for ~S.");
        $str224$Couldn_t_unify__S_and__S___ = SubLObjectFactory.makeString("Couldn't unify ~S and ~S.~%");
        $str225$__AGRs_are_now____S_and____S___ = SubLObjectFactory.makeString("~&AGRs are now~% ~S and~% ~S.~%");
        $sym226$PPH_DETP_NART_CACHED = SubLObjectFactory.makeSymbol("PPH-DETP-NART-CACHED");
        $list227 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $sym228$_PPH_DETP_NART_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-DETP-NART-CACHED-CACHING-STATE*");
        $str229$__Switching_arg1_and_arg2_in__S__ = SubLObjectFactory.makeString("~&Switching arg1 and arg2 in ~S~%");
        $kw230$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $str231$Can_t_switch_arg1_and_arg2_in_rep = SubLObjectFactory.makeString("Can't switch arg1 and arg2 in repeated phrase~S");
    }
    
    public static final class $pph_current_list_item_formula_p$UnaryFunction extends UnaryFunction
    {
        public $pph_current_list_item_formula_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-CURRENT-LIST-ITEM-FORMULA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_resolution.pph_current_list_item_formula_p(arg1);
        }
    }
    
    public static final class $pph_phrase_output_item_empty_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_item_empty_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-EMPTY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_resolution.pph_phrase_output_item_empty_p(arg1);
        }
    }
    
    public static final class $pph_nth_phrase_naut_p$UnaryFunction extends UnaryFunction
    {
        public $pph_nth_phrase_naut_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-NTH-PHRASE-NAUT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_resolution.pph_nth_phrase_naut_p(arg1);
        }
    }
    
    public static final class $pph_finite_verb_predP$UnaryFunction extends UnaryFunction
    {
        public $pph_finite_verb_predP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-FINITE-VERB-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_resolution.pph_finite_verb_predP(arg1);
        }
    }
    
    public static final class $pph_non_plural_noun_predP$UnaryFunction extends UnaryFunction
    {
        public $pph_non_plural_noun_predP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-NON-PLURAL-NOUN-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_resolution.pph_non_plural_noun_predP(arg1);
        }
    }
}

/*

	Total time: 1206 ms
	
*/