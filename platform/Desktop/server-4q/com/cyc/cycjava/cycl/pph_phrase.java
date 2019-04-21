package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_phrase extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_phrase";
    public static final String myFingerPrint = "179f396f5da8f1ae23f4be889d26b45d4833cc0a681045c5c762a8ccd2887860";
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2604L)
    public static SubLSymbol $pph_phrase_display_agrP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 6187L)
    public static SubLSymbol $pph_warn_about_reverting_phrasesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 6980L)
    private static SubLSymbol $pph_phrase_copy_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 7033L)
    private static SubLSymbol $pph_phrase_copy_nesting_max$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 14094L)
    private static SubLSymbol $pph_phrase_nonlocal_feature_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 15685L)
    private static SubLSymbol $pph_special_types$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 26535L)
    private static SubLSymbol $pph_variable_bindings$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 46399L)
    private static SubLSymbol $pph_sanity_check_phrase_donenessP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 48612L)
    private static SubLSymbol $pph_phrase_destroyer_grace_period$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 48704L)
    private static SubLSymbol $pph_phrase_destroyer$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50428L)
    private static SubLSymbol $warn_about_pph_phrase_destruction_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 56876L)
    private static SubLSymbol $warn_on_invalid_pph_inferencesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 70357L)
    public static SubLSymbol $pph_do_alternatives_max$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73794L)
    private static SubLSymbol $pph_root_mother_list$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 79290L)
    public static SubLSymbol $pph_variant_list_max_count$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 110490L)
    private static SubLSymbol $pph_phrase_category_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 110544L)
    private static SubLSymbol $pph_phrase_category_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119073L)
    private static SubLSymbol $pph_unknown_cycl$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119490L)
    private static SubLSymbol $pph_empty_cycl$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165057L)
    private static SubLSymbol $pph_agr_preds_from_category_cached_caching_state$;
    private static final SubLString $str0$Keeping_generic_arg__S_;
    private static final SubLString $str1$Not_keeping_generic_arg__S_;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$PWHEN;
    private static final SubLSymbol $sym6$VECTORP;
    private static final SubLSymbol $sym7$SIGN_CONSTITUENTS;
    private static final SubLSymbol $sym8$SIGN_DO_CONSTITUENTS;
    private static final SubLSymbol $sym9$CINC;
    private static final SubLString $str10$;
    private static final SubLString $str11$_INVALID_PPH_PHRASE_;
    private static final SubLString $str12$___Dtr___A__;
    private static final SubLString $str13$___PPH_PHRASE__S;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$NOT_FOUND;
    private static final SubLString $str17$__A___S__;
    private static final SubLString $str18$__S__;
    private static final SubLString $str19$_;
    private static final SubLString $str20$__head_;
    private static final SubLString $str21$___Dtrs_;
    private static final SubLString $str22$_Head_;
    private static final SubLString $str23$__S;
    private static final SubLString $str24$___S__A_;
    private static final SubLString $str25$_;
    private static final SubLSymbol $sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE;
    private static final SubLString $str27$Failed_to_paraphrase__S___categor;
    private static final SubLInteger $int28$128;
    private static final SubLInteger $int29$60;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$PIF;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$STACK_PUSH;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$CUNWIND_PROTECT;
    private static final SubLSymbol $sym38$PROGN;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$FIND_OR_CREATE_PPH_PHRASE_COPY_STACK;
    private static final SubLSymbol $sym41$WITH_PPH_PHRASE_COPY_RECURSION_PROTECTION;
    private static final SubLSymbol $sym42$STACK_P;
    private static final SubLString $str43$__Copying_phrase____S;
    private static final SubLString $str44$Can_t_reuse_old_phrase_____S__;
    private static final SubLSymbol $kw45$NON_LOCAL_FEATURES_IGNORED_;
    private static final SubLString $str46$__Copying_nonlocal_features_of___;
    private static final SubLString $str47$__Reusing_copy_of_phrase_____S__;
    private static final SubLString $str48$_PPH_error_level_;
    private static final SubLString $str49$__;
    private static final SubLString $str50$__Recursion_limit___S__exceeded_i;
    private static final SubLSymbol $kw51$COPYING_PHRASE;
    private static final SubLString $str52$__Set_top_level_demerits_to__S;
    private static final SubLString $str53$__Set_output_list_to__S;
    private static final SubLString $str54$__Set_category_to__S;
    private static final SubLString $str55$__Copied_noted_string__S;
    private static final SubLString $str56$__Setting_agr_to__S;
    private static final SubLString $str57$__Set_agr_to__S;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$ATOM;
    private static final SubLSymbol $sym60$CLOSED_LEXICAL_CLASS_STRING_;
    private static final SubLSymbol $sym61$STRINGP;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$SPECIAL_TYPE;
    private static final SubLSymbol $kw64$FOCUS_ARG;
    private static final SubLSymbol $kw65$PERCENT_PHRASE;
    private static final SubLSymbol $kw66$CLARIFYING;
    private static final SubLSymbol $kw67$ARG1;
    private static final SubLSymbol $kw68$ARG2;
    private static final SubLSymbol $kw69$SYMBOL_PHRASE;
    private static final SubLSymbol $kw70$SYMBOL;
    private static final SubLSymbol $kw71$CYCL_PHRASE;
    private static final SubLSymbol $kw72$QUOTED_PARAPHRASE;
    private static final SubLSymbol $kw73$STRING_MENTION;
    private static final SubLSymbol $kw74$NOSPACE;
    private static final SubLSymbol $kw75$VARIABLE_BINDING;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$PHRASE_NAUT;
    private static final SubLSymbol $kw78$QUERY_EL_FORMULA;
    private static final SubLString $str79$Couldn_t_find__S___in__S;
    private static final SubLSymbol $sym80$EL_VAR_;
    private static final SubLSymbol $sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA;
    private static final SubLList $list82;
    private static final SubLString $str83$Couldn_t_find_bindings_for__S;
    private static final SubLInteger $int84$24;
    private static final SubLString $str85$Can_t_resolve__S_due_to__S;
    private static final SubLList $list86;
    private static final SubLSymbol $kw87$TERSE_PARAPHRASE;
    private static final SubLSymbol $kw88$PRECISE_PARAPHRASE;
    private static final SubLSymbol $kw89$CHEMICAL_FORMULA_FROM_LISTS;
    private static final SubLList $list90;
    private static final SubLSymbol $kw91$CONDITIONAL_PHRASE;
    private static final SubLString $str92$NEW_PPH_CONDITIONAL_PHRASE_passed;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$ARG3;
    private static final SubLString $str95$__ConditionalPhraseFn_expects_a_c;
    private static final SubLSymbol $kw96$COORDINATION;
    private static final SubLSymbol $kw97$UNORDERED;
    private static final SubLList $list98;
    private static final SubLObject $const99$FormulaArgFn;
    private static final SubLSymbol $kw100$AND;
    private static final SubLSymbol $kw101$BUT;
    private static final SubLSymbol $kw102$OR;
    private static final SubLSymbol $kw103$NONE;
    private static final SubLObject $const104$and;
    private static final SubLObject $const105$or;
    private static final SubLSymbol $sym106$_ID_STRING;
    private static final SubLObject $const107$htmlListTypeIdentifierString;
    private static final SubLList $list108;
    private static final SubLObject $const109$HTMLRepresentationMt;
    private static final SubLObject $const110$CoordinatingConjunction;
    private static final SubLObject $const111$Feminine_NLAttr;
    private static final SubLObject $const112$ThirdPerson_NLAttr;
    private static final SubLSymbol $kw113$NEVER;
    private static final SubLObject $const114$Plural_NLAttr;
    private static final SubLObject $const115$Singular_NLAttr;
    private static final SubLObject $const116$singular_Generic;
    private static final SubLObject $const117$plural_Generic;
    private static final SubLSymbol $kw118$REPEATED;
    private static final SubLList $list119;
    private static final SubLString $str120$Found_non_phrase_dtr___S;
    private static final SubLSymbol $kw121$VERIFIED;
    private static final SubLSymbol $sym122$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P;
    private static final SubLSymbol $sym123$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const124$EverythingPSC;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLObject $const128$The_TheWord;
    private static final SubLObject $const129$Definite_NLAttr;
    private static final SubLSymbol $kw130$DONE_;
    private static final SubLString $str131$_S_not_considered_done_;
    private static final SubLObject $const132$Between_TheWord;
    private static final SubLString $str133$between;
    private static final SubLObject $const134$EnDash_TheSymbol;
    private static final SubLString $str135$Destroying_dtrs_of__S;
    private static final SubLString $str136$Destroyed_failed_phrase_dtrs____N;
    private static final SubLInteger $int137$600;
    private static final SubLSymbol $sym138$_PPH_PHRASE_DESTROYER_;
    private static final SubLSymbol $sym139$VALID_PPH_PHRASE_P;
    private static final SubLSymbol $sym140$DESTROY_PPH_PHRASE_LOW;
    private static final SubLSymbol $sym141$SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND;
    private static final SubLSymbol $kw142$DESTRUCTION_EXCEPTIONS;
    private static final SubLString $str143$Socket_Connection_Handler;
    private static final SubLSymbol $sym144$WARN_ABOUT_PPH_PHRASE_DESTRUCTION;
    private static final SubLString $str145$Destroy_PPH_phrases_is__S_for__S;
    private static final SubLSymbol $sym146$_WARN_ABOUT_PPH_PHRASE_DESTRUCTION_CACHING_STATE_;
    private static final SubLSymbol $kw147$SKIP;
    private static final SubLSymbol $kw148$FREE;
    private static final SubLSymbol $kw149$DESTROYED;
    private static final SubLSymbol $kw150$DEMERITS;
    private static final SubLSymbol $kw151$CASE;
    private static final SubLSymbol $kw152$PROBLEM_DICTIONARY;
    private static final SubLSymbol $kw153$SUID;
    private static final SubLSymbol $kw154$MOTHER;
    private static final SubLSymbol $kw155$LINK_CYCL;
    private static final SubLSymbol $kw156$WU;
    private static final SubLSymbol $kw157$HEAD_DTR_NUM;
    private static final SubLSymbol $kw158$SOURCE_POS;
    private static final SubLSymbol $kw159$ALTERNATIVES;
    private static final SubLSymbol $kw160$RESERVED_FOR_MATRIX_ARG0;
    private static final SubLSymbol $kw161$DEMERITS_REASON;
    private static final SubLSymbol $sym162$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw163$MAX_ALTERNATIVES;
    private static final SubLSymbol $sym164$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str165$___Top_level_CycL___S;
    private static final SubLSymbol $kw166$INFERENCES;
    private static final SubLSymbol $sym167$FIND_INFERENCE_BY_IDS;
    private static final SubLString $str168$__Setting_object_dtr_agr_to_accus;
    private static final SubLSymbol $kw169$ACCUSATIVE;
    private static final SubLString $str170$__Setting_possessive_dtr_agr_to_g;
    private static final SubLSymbol $kw171$GENITIVE;
    private static final SubLObject $const172$PossessivePhrase;
    private static final SubLSymbol $sym173$PPH_PHRASE_CATEGORY;
    private static final SubLString $str174$Dtr_2_of_phrase_is_object_of__S__;
    private static final SubLObject $const175$Verb;
    private static final SubLObject $const176$TransitiveNPFrame;
    private static final SubLString $str177$__Setting_subject_dtr_agr_to_nomi;
    private static final SubLSymbol $kw178$NOMINATIVE;
    private static final SubLList $list179;
    private static final SubLString $str180$_reported_a_;
    private static final SubLString $str181$_problem;
    private static final SubLString $str182$_with_this_additional_info_;
    private static final SubLString $str183$_;
    private static final SubLString $str184$_;
    private static final SubLInteger $int185$500;
    private static final SubLList $list186;
    private static final SubLSymbol $sym187$QUEUE;
    private static final SubLSymbol $sym188$DONE_COUNT;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$ENQUEUE;
    private static final SubLSymbol $sym191$UNTIL;
    private static final SubLSymbol $sym192$QUEUE_EMPTY_P;
    private static final SubLSymbol $sym193$DEQUEUE;
    private static final SubLSymbol $sym194$CDOLIST;
    private static final SubLSymbol $sym195$PPH_PHRASE_LOCAL_ALTERNATIVES;
    private static final SubLSymbol $sym196$__;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$PPH_ERROR;
    private static final SubLString $str199$Done__S_alternatives_of__S;
    private static final SubLString $str200$Setting_phrase_s_mother_to_itself;
    private static final SubLObject $const201$NLSentence;
    private static final SubLString $str202$Mother_is_part_of_cycle___S;
    private static final SubLString $str203$PPH_PHRASE_ADD_JUSTIFICATION_pass;
    private static final SubLSymbol $sym204$SYMBOLP;
    private static final SubLSymbol $sym205$LISTP;
    private static final SubLSymbol $kw206$CODE;
    private static final SubLSymbol $sym207$NL_GENERATION_CACHE_METHOD;
    private static final SubLSymbol $sym208$SUPPORT_P;
    private static final SubLObject $const209$MtUnionFn;
    private static final SubLSymbol $sym210$SUPPORT_SENTENCE;
    private static final SubLSymbol $sym211$PPH_VARIANT_STRING__;
    private static final SubLString $str212$Ignoring_possible_variants_for_me;
    private static final SubLSymbol $sym213$VARIANT_HAS_MISSING_TARGET_;
    private static final SubLString $str214$Generated__D_dtr_variant_lists_fo;
    private static final SubLString $str215$current_phrase;
    private static final SubLSymbol $sym216$PPH_VARIANT_STRING;
    private static final SubLSymbol $sym217$PPH_ANCESTOR_PHRASE_OR_SELF_P;
    private static final SubLSymbol $sym218$PPH_PHRASE_P;
    private static final SubLString $str219$Failed_to_get_string_for_variant_;
    private static final SubLList $list220;
    private static final SubLString $str221$Auto_nested_PPH_phrase_variant__M;
    private static final SubLString $str222$PPH_phrase_variant_with_nesting_d;
    private static final SubLList $list223;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$APPEND;
    private static final SubLSymbol $sym226$PPH_PHRASE_OUTPUT_ITEM_STRING;
    private static final SubLSymbol $kw227$HTML_STRING;
    private static final SubLString $str228$Failed_to_note__S_on__S___Noted_s;
    private static final SubLSymbol $kw229$HTML;
    private static final SubLString $str230$href;
    private static final SubLString $str231$__Adding_new_tag_inside_old___;
    private static final SubLString $str232$__Setting_string_to__S___S_;
    private static final SubLString $str233$_S_is_a_forbidden_paraphrase_for_;
    private static final SubLString $str234$__Output_list_1___S;
    private static final SubLString $str235$__Output_item____S;
    private static final SubLString $str236$__output_item_2____S;
    private static final SubLString $str237$__output_item_3____S;
    private static final SubLString $str238$__output_item_4____S;
    private static final SubLSymbol $sym239$PPH_PHRASE_OUTPUT_ITEM_COPY;
    private static final SubLSymbol $kw240$ANY;
    private static final SubLString $str241$NP_is_heavy_based_on_string__S;
    private static final SubLString $str242$NP_is_heavy_based_on_dtrs_;
    private static final SubLObject $const243$Noun;
    private static final SubLObject $const244$Be_TheWord;
    private static final SubLObject $const245$AuxVerb;
    private static final SubLObject $const246$posForms;
    private static final SubLList $list247;
    private static final SubLList $list248;
    private static final SubLObject $const249$OrdinalAdjective;
    private static final SubLSymbol $sym250$_PPH_PHRASE_CATEGORY_MAX_DEPTH_;
    private static final SubLInteger $int251$99;
    private static final SubLString $str252$Excessive_recursion___S__in_PPH_P;
    private static final SubLString $str253$__Setting_CycL_phrase_s_category_;
    private static final SubLSymbol $kw254$RETURN_NIL;
    private static final SubLString $str255$Possessivizing_NP_;
    private static final SubLString $str256$Nominalizing_a_possessive_;
    private static final SubLSymbol $kw257$OVERRIDE;
    private static final SubLSymbol $kw258$ERROR;
    private static final SubLString $str259$Converting_NP_to__instance_of__Nb;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLString $str262$New_Nbar___S;
    private static final SubLSymbol $sym263$FORT_P;
    private static final SubLObject $const264$Determiner;
    private static final SubLString $str265$Don_t_know_how_to_reconcile__S_an;
    private static final SubLSymbol $kw266$PPH_UNKNOWN_CYCL;
    private static final SubLSymbol $kw267$PPH_EMPTY_CYCL;
    private static final SubLString $str268$Couldn_t_find_another_reference_t;
    private static final SubLString $str269$_S_is_not_a_dtr_of_its_mother____;
    private static final SubLString $str270$__Found_another_reference_to__S__;
    private static final SubLSymbol $kw271$KEEP_OLD_ARG_POSITION;
    private static final SubLSymbol $sym272$PPH_ARG_POSITION_SPECIFIER_;
    private static final SubLSymbol $kw273$SELF;
    private static final SubLString $str274$Replacing__S_____with__S__;
    private static final SubLString $str275$__Setting_arg_position_of__S_to__;
    private static final SubLString $str276$cycls_of_phrases_doesn_t_know_wha;
    private static final SubLSymbol $sym277$ALPHANUMERIC_CHAR_P;
    private static final SubLSymbol $kw278$COMPUTE;
    private static final SubLSymbol $kw279$POS_PRED;
    private static final SubLSymbol $kw280$NL_PREDS;
    private static final SubLSymbol $kw281$DONT_CARE;
    private static final SubLString $str282$Bad_agr_value__S__;
    private static final SubLString $str283$New_target__S___for_non_new_phras;
    private static final SubLString $str284$Don_t_careifying__S;
    private static final SubLString $str285$Bad_agr_constraint___S;
    private static final SubLString $str286$Singleton_agr_constraint_target__;
    private static final SubLSymbol $kw287$SUBJECT_VERB;
    private static final SubLSymbol $kw288$DET_NBAR;
    private static final SubLString $str289$__Can_t_add_new_constraints__S_to;
    private static final SubLString $str290$__Updated_agr_preds_from__S_to__S;
    private static final SubLString $str291$_S_should_be_a_list_of_speech_par;
    private static final SubLString $str292$Impossible_phrase_____S__;
    private static final SubLSymbol $kw293$IMPOSSIBLE;
    private static final SubLString $str294$Impossible_because_of_agr_constra;
    private static final SubLString $str295$Removed__S_from__S___based_on_cat;
    private static final SubLString $str296$Can_t_reconcile__S_and__S_and__S_;
    private static final SubLSymbol $kw297$PEER;
    private static final SubLList $list298;
    private static final SubLList $list299;
    private static final SubLSymbol $sym300$PPH_AGR_PREDS_FROM_CATEGORY_CACHED;
    private static final SubLObject $const301$pronounStrings;
    private static final SubLSymbol $sym302$_PPH_AGR_PREDS_FROM_CATEGORY_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym303$CLEAR_PPH_AGR_PREDS_FROM_CATEGORY_CACHED;
    private static final SubLString $str304$__Phrase__D_is_unfinished_;
    private static final SubLString $str305$Can_t_set_dtrs_of_non_phrase__S;
    private static final SubLString $str306$Adding_old_dtr_to_new_mother____M;
    private static final SubLString $str307$_S_is_not_terminal;
    private static final SubLSymbol $sym308$PPH_PHRASE_VERB_;
    private static final SubLSymbol $sym309$POSITIVE_INTEGER_P;
    private static final SubLObject $ic310;
    private static final SubLString $str311$Can_t_insert_dtr_into_position__D;
    private static final SubLString $str312$Extraction_disparity___Expected__;
    private static final SubLString $str313$Setting_head_dtr_to_initial_dtr__;
    private static final SubLString $str314$Extracting_dtr__D___S;
    private static final SubLString $str315$__Setting_head_dtr_num_from__S;
    private static final SubLString $str316$_to__S__;
    private static final SubLString $str317$Phrase_has_lost_its_head_____S__;
    private static final SubLString $str318$Setting_agr_target_to_itself_;
    private static final SubLString $str319$Setting_agr_target_to_non_existen;
    private static final SubLString $str320$__Setting_agr_target_num_of_dtr__;
    private static final SubLString $str321$PPH_Phrase;
    private static final SubLString $str322$PPH_Phrase_Test_Suite;
    private static final SubLList $list323;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 802L)
    public static SubLObject new_pph_phrase_for_cycl(final SubLObject cycl, SubLObject arg_position_map, SubLObject keep_generic_argsP) {
        if (arg_position_map == pph_phrase.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (keep_generic_argsP == pph_phrase.UNPROVIDED) {
            keep_generic_argsP = pph_vars.$pph_keep_generic_argsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_types.pph_phrase_nautP(cycl)) {
            SubLObject ans = (SubLObject)pph_phrase.NIL;
            final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
            try {
                pph_vars.$pph_keep_generic_argsP$.bind(keep_generic_argsP, thread);
                ans = pph_templates.pph_phrasify_phrase_naut(cycl, arg_position_map);
            }
            finally {
                pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_arg_position_map(phrase, arg_position_map);
        pph_phrase_set_cycl(phrase, cycl);
        if (pph_phrase.NIL != pph_phrase_non_empty_output_list_p(pph_phrase_output_list(phrase))) {
            pph_phrase_set_output_list_cycl(phrase, cycl);
        }
        final SubLObject arg_position = pph_utilities.pph_top_level_arg_position(arg_position_map);
        pph_phrase_set_arg_position(phrase, arg_position);
        if (pph_phrase.NIL != pph_utilities.pph_arg_position_specifierP(cycl)) {
            if (pph_phrase.NIL != keep_generic_argsP) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str0$Keeping_generic_arg__S_, cycl, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            else if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str1$Not_keeping_generic_arg__S_, cycl, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2005L)
    public static SubLObject pph_phrase_do_dtrs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = (SubLObject)pph_phrase.NIL;
        SubLObject phrase = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list2);
        dtr = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list2);
        phrase = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list2);
        dtr_num = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(dtr_num, (SubLObject)pph_phrase.$list4)), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym5$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym6$VECTORP, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym7$SIGN_CONSTITUENTS, phrase)), (SubLObject)ConsesLow.listS((SubLObject)pph_phrase.$sym8$SIGN_DO_CONSTITUENTS, (SubLObject)ConsesLow.list(dtr, phrase), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym9$CINC, dtr_num))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list2);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2356L)
    public static SubLObject verbose_print_pph_phrase(final SubLObject phrase, SubLObject stream) {
        if (stream == pph_phrase.UNPROVIDED) {
            stream = (SubLObject)pph_phrase.T;
        }
        print_pph_phrase(phrase, stream, (SubLObject)pph_phrase.T);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2480L)
    public static SubLObject terse_print_pph_phrase(final SubLObject phrase, SubLObject stream) {
        if (stream == pph_phrase.UNPROVIDED) {
            stream = (SubLObject)pph_phrase.T;
        }
        print_pph_phrase(phrase, stream, (SubLObject)pph_phrase.NIL);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2733L)
    public static SubLObject print_pph_phrase(final SubLObject phrase, SubLObject stream, SubLObject verboseP) {
        if (stream == pph_phrase.UNPROVIDED) {
            stream = (SubLObject)pph_phrase.T;
        }
        if (verboseP == pph_phrase.UNPROVIDED) {
            verboseP = (SubLObject)pph_phrase.NIL;
        }
        return print_pph_phrase_int(phrase, stream, (SubLObject)pph_phrase.$str10$, verboseP, (SubLObject)pph_phrase.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 2882L)
    public static SubLObject print_pph_phrase_int(final SubLObject phrase, final SubLObject stream, final SubLObject phrase_num_string, final SubLObject verboseP, final SubLObject current_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL == pph_data_structures.valid_pph_phrase_p(phrase)) {
            PrintLow.format(stream, (SubLObject)pph_phrase.$str11$_INVALID_PPH_PHRASE_);
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject top_levelP = Equality.eql((SubLObject)pph_phrase.ONE_INTEGER, current_depth);
        SubLObject slots_done_count = (SubLObject)pph_phrase.ZERO_INTEGER;
        final SubLObject terse_slots_max = (SubLObject)pph_phrase.THREE_INTEGER;
        final SubLObject depth_max = (SubLObject)((pph_phrase.NIL != verboseP) ? pph_phrase.FOUR_INTEGER : pph_phrase.ONE_INTEGER);
        SubLObject stopP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == top_levelP) {
            PrintLow.format(stream, (SubLObject)pph_phrase.$str12$___Dtr___A__, phrase_num_string);
        }
        PrintLow.format(stream, (SubLObject)pph_phrase.$str13$___PPH_PHRASE__S, pph_phrase_suid(phrase));
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject slot;
        SubLObject string;
        SubLObject slot_result;
        for (rest = (SubLObject)pph_phrase.NIL, rest = (SubLObject)pph_phrase.$list14; pph_phrase.NIL == stopP && pph_phrase.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            slot = (SubLObject)pph_phrase.NIL;
            string = (SubLObject)pph_phrase.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list15);
            slot = current.first();
            current = (string = current.rest());
            if (pph_phrase.NIL != Symbols.fboundp(slot)) {
                slot_result = Functions.funcall(slot, phrase);
                if (pph_phrase.NIL != slot_result && pph_phrase.NIL == pph_unknown_cycl_p(slot_result) && pph_phrase.NIL == pph_data_structures.dont_care_pph_phrase_agr_p(slot_result) && pph_phrase.$kw16$NOT_FOUND != slot_result) {
                    if (pph_phrase.NIL != pph_string.pph_string_p(slot_result)) {
                        slot_result = pph_string.pph_string_if_non_null_to_output_format(slot_result, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    if (pph_phrase.NIL != verboseP) {
                        PrintLow.format(stream, (SubLObject)pph_phrase.$str17$__A___S__, string, slot_result);
                    }
                    else {
                        PrintLow.format(stream, (SubLObject)pph_phrase.$str18$__S__, slot_result);
                    }
                    slots_done_count = Numbers.add(slots_done_count, (SubLObject)pph_phrase.ONE_INTEGER);
                    if (pph_phrase.NIL == verboseP) {
                        stopP = Numbers.numGE(slots_done_count, terse_slots_max);
                    }
                }
            }
        }
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            if (current_depth.numL(depth_max)) {
                SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject connector;
                    SubLObject dtr_num_string;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                        element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        connector = (SubLObject)((pph_phrase.NIL != top_levelP) ? string_utilities.$empty_string$.getGlobalValue() : pph_phrase.$str19$_);
                        dtr_num_string = Sequences.cconcatenate(phrase_num_string, new SubLObject[] { connector, print_high.princ_to_string(dtr_num) });
                        if (dtr_num.eql(head_dtr_num)) {
                            dtr_num_string = Sequences.cconcatenate(dtr_num_string, (SubLObject)pph_phrase.$str20$__head_);
                        }
                        print_pph_phrase_int(dtr, stream, dtr_num_string, verboseP, number_utilities.f_1X(current_depth));
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                    }
                }
            }
            else if (pph_phrase.NIL == stopP) {
                PrintLow.format(stream, (SubLObject)pph_phrase.$str21$___Dtrs_);
                SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                        element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (dtr_num.eql(head_dtr_num)) {
                            print_high.princ((SubLObject)pph_phrase.$str22$_Head_, stream);
                        }
                        if (pph_phrase.NIL != pph_phrase_doneP(dtr)) {
                            PrintLow.format(stream, (SubLObject)pph_phrase.$str23$__S, pph_phrase_string(dtr, (SubLObject)pph_phrase.UNPROVIDED));
                        }
                        else if (pph_phrase.NIL != pph_phrase.$pph_phrase_display_agrP$.getDynamicValue(thread)) {
                            PrintLow.format(stream, (SubLObject)pph_phrase.$str24$___S__A_, pph_phrase_category(dtr, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_agr(dtr));
                        }
                        else {
                            PrintLow.format(stream, (SubLObject)pph_phrase.$str23$__S, pph_phrase_category(dtr, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_agr(dtr));
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                    }
                }
            }
        }
        print_high.princ((SubLObject)pph_phrase.$str25$_, stream);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 5377L)
    public static SubLObject pph_phrase_create_backup(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backup_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject copy_nonlocal_featuresP = (SubLObject)pph_phrase.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind((SubLObject)pph_phrase.T, thread);
            pph_phrase_copy(phrase, backup_phrase, copy_nonlocal_featuresP);
        }
        finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        return backup_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 5704L)
    public static SubLObject pph_phrase_revert_to_backup(final SubLObject phrase, final SubLObject backup) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_maybe_warn_about_reverting_phrase(pph_phrase_cycl(backup, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_category(backup, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_agr_preds(backup, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_add_problems(phrase, backup);
        pph_phrase_destroy_dtrs_metered(phrase);
        pph_phrase_remove_all_dtrs(phrase);
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind((SubLObject)pph_phrase.T, thread);
            pph_phrase_copy(backup, phrase, (SubLObject)pph_phrase.NIL);
        }
        finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 6253L)
    public static SubLObject pph_maybe_warn_about_reverting_phrase_internal(final SubLObject cycl, final SubLObject category, final SubLObject agr_preds, SubLObject warnP) {
        if (warnP == pph_phrase.UNPROVIDED) {
            warnP = pph_phrase.$pph_warn_about_reverting_phrasesP$.getDynamicValue();
        }
        if (pph_phrase.NIL != warnP) {
            Errors.warn((SubLObject)pph_phrase.$str27$Failed_to_paraphrase__S___categor, cycl, category, agr_preds);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 6253L)
    public static SubLObject pph_maybe_warn_about_reverting_phrase(final SubLObject cycl, final SubLObject category, final SubLObject agr_preds, SubLObject warnP) {
        if (warnP == pph_phrase.UNPROVIDED) {
            warnP = pph_phrase.$pph_warn_about_reverting_phrasesP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == v_memoization_state) {
            return pph_maybe_warn_about_reverting_phrase_internal(cycl, category, agr_preds, warnP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_phrase.$sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_phrase.$sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, (SubLObject)pph_phrase.FOUR_INTEGER, (SubLObject)pph_phrase.$int28$128, (SubLObject)pph_phrase.EQUAL, (SubLObject)pph_phrase.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_phrase.$sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, category, agr_preds, warnP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (category.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (agr_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && warnP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_maybe_warn_about_reverting_phrase_internal(cycl, category, agr_preds, warnP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl, category, agr_preds, warnP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 6551L)
    public static SubLObject pph_phrase_copy(final SubLObject old_phrase, SubLObject target, SubLObject copy_nonlocal_featuresP) {
        if (target == pph_phrase.UNPROVIDED) {
            target = (SubLObject)pph_phrase.NIL;
        }
        if (copy_nonlocal_featuresP == pph_phrase.UNPROVIDED) {
            copy_nonlocal_featuresP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_sentence.pph_sentence_p(old_phrase)) {
            return pph_sentence.pph_sentence_copy(old_phrase, target);
        }
        return pph_phrase_copy_int(old_phrase, dictionary.new_dictionary((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), target, copy_nonlocal_featuresP, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 7089L)
    public static SubLObject with_pph_phrase_copy_recursion_protection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list30);
        phrase = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym31$PIF, (SubLObject)pph_phrase.$list32, (SubLObject)pph_phrase.$list33, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym3$CLET, (SubLObject)pph_phrase.$list34, (SubLObject)ConsesLow.listS((SubLObject)pph_phrase.$sym35$STACK_PUSH, phrase, (SubLObject)pph_phrase.$list36), (SubLObject)ConsesLow.listS((SubLObject)pph_phrase.$sym37$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_phrase.$sym38$PROGN, ConsesLow.append(body, (SubLObject)pph_phrase.NIL)), (SubLObject)pph_phrase.$list39)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list30);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 7639L)
    public static SubLObject find_or_create_pph_phrase_copy_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (pph_phrase.NIL != stacks.stack_p(pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread))) ? pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread) : stacks.create_stack();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 7851L)
    public static SubLObject new_pph_phrase_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_phrase.NIL != stacks.stack_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread)) : pph_macros.$new_pph_phrases$.getDynamicValue(thread);
        return stacks.stack_find(v_object, pph_macros.$new_pph_phrases$.getDynamicValue(thread), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 7984L)
    public static SubLObject pph_phrase_copy_int(final SubLObject old_phrase, final SubLObject copied_phrases, SubLObject target, SubLObject copy_nonlocal_featuresP, SubLObject require_new_phrasesP) {
        if (target == pph_phrase.UNPROVIDED) {
            target = (SubLObject)pph_phrase.NIL;
        }
        if (copy_nonlocal_featuresP == pph_phrase.UNPROVIDED) {
            copy_nonlocal_featuresP = (SubLObject)pph_phrase.T;
        }
        if (require_new_phrasesP == pph_phrase.UNPROVIDED) {
            require_new_phrasesP = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.THREE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str43$__Copying_phrase____S, old_phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL == pph_phrase_p(target, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject done_copy = dictionary.dictionary_lookup(copied_phrases, old_phrase, (SubLObject)pph_phrase.UNPROVIDED);
            if (pph_phrase.NIL == pph_phrase_p(done_copy, (SubLObject)pph_phrase.UNPROVIDED)) {
                target = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            else if (pph_phrase.NIL != require_new_phrasesP && pph_phrase.NIL == new_pph_phrase_p(done_copy)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase.$str44$Can_t_reuse_old_phrase_____S__, done_copy);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                target = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            else {
                if (pph_phrase.NIL == copy_nonlocal_featuresP || pph_phrase.NIL == pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(done_copy, (SubLObject)pph_phrase.$kw45$NON_LOCAL_FEATURES_IGNORED_, (SubLObject)pph_phrase.SIX_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)) {
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.THREE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str47$__Reusing_copy_of_phrase_____S__, done_copy, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    return done_copy;
                }
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str46$__Copying_nonlocal_features_of___, done_copy, old_phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                target = done_copy;
            }
        }
        dictionary.dictionary_enter(copied_phrases, old_phrase, target);
        final SubLObject plist = pph_data_structures.pph_phrase_plist(target);
        SubLObject remainder;
        SubLObject property;
        SubLObject existing_value;
        for (remainder = (SubLObject)pph_phrase.NIL, remainder = plist; pph_phrase.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            existing_value = conses_high.cadr(remainder);
            if (pph_phrase.NIL != pph_phrase_copy_property_p(property, copy_nonlocal_featuresP)) {
                pph_data_structures.pph_phrase_info_clear(target, property);
            }
        }
        SubLObject list_var = (SubLObject)pph_phrase.NIL;
        SubLObject property2 = (SubLObject)pph_phrase.NIL;
        SubLObject n = (SubLObject)pph_phrase.NIL;
        list_var = pph_data_structures.pph_info_vector_slots();
        property2 = list_var.first();
        for (n = (SubLObject)pph_phrase.ZERO_INTEGER; pph_phrase.NIL != list_var; list_var = list_var.rest(), property2 = list_var.first(), n = Numbers.add((SubLObject)pph_phrase.ONE_INTEGER, n)) {
            if (pph_phrase.NIL != pph_phrase_copy_property_p(property2, copy_nonlocal_featuresP)) {
                pph_data_structures.pph_phrase_info_vector_clear(target, n);
            }
        }
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(target, (SubLObject)pph_phrase.$kw45$NON_LOCAL_FEATURES_IGNORED_, (SubLObject)pph_phrase.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == copy_nonlocal_featuresP));
        if (old_phrase.equal(target)) {
            return target;
        }
        if (pph_phrase.NIL != stacks.stack_p(pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread)) && stacks.stack_size(pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread)).numG(pph_phrase.$pph_phrase_copy_nesting_max$.getDynamicValue(thread))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str50$__Recursion_limit___S__exceeded_i) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.$pph_phrase_copy_nesting_max$.getDynamicValue(thread)));
        }
        else {
            final SubLObject _prev_bind_0 = pph_phrase.$pph_phrase_copy_stack$.currentBinding(thread);
            try {
                pph_phrase.$pph_phrase_copy_stack$.bind(find_or_create_pph_phrase_copy_stack(), thread);
                stacks.stack_push(old_phrase, pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread));
                try {
                    final SubLObject old_top_level_demerits = pph_phrase_top_level_demerits(old_phrase);
                    pph_phrase_set_top_level_demerits(target, old_top_level_demerits, (SubLObject)pph_phrase.$kw51$COPYING_PHRASE);
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.FOUR_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str52$__Set_top_level_demerits_to__S, old_top_level_demerits, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    pph_phrase_set_output_list(target, pph_output_list_copy(pph_phrase_output_list(old_phrase)), (SubLObject)pph_phrase.T);
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.FOUR_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str53$__Set_output_list_to__S, pph_phrase_output_list(target), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    pph_phrase_set_category(target, pph_phrase_category(old_phrase, (SubLObject)pph_phrase.NIL), (SubLObject)pph_phrase.NIL);
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.FOUR_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str54$__Set_category_to__S, pph_phrase_category(target, (SubLObject)pph_phrase.NIL), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    if (pph_phrase.NIL != pph_phrase_doneP(old_phrase)) {
                        final SubLObject string = pph_phrase_noted_string(old_phrase, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.$kw16$NOT_FOUND);
                        pph_phrase_note_string(target, string, (SubLObject)pph_phrase.NIL);
                        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str55$__Copied_noted_string__S, (pph_phrase.NIL != pph_string.pph_string_p(string)) ? pph_string.pph_string_if_non_null_to_output_format(string, (SubLObject)pph_phrase.UNPROVIDED) : string, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                        }
                    }
                    if (pph_phrase.NIL != copy_nonlocal_featuresP && pph_phrase.NIL != pph_phrase_has_dtrsP(old_phrase)) {
                        SubLObject new_dtrs = (SubLObject)pph_phrase.NIL;
                        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                        if (document.sign_constituents(old_phrase).isVector()) {
                            final SubLObject vector_var = document.sign_constituents(old_phrase);
                            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject old_phrase_dtr;
                            SubLObject require_newP;
                            SubLObject new_phrase_dtr;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                                old_phrase_dtr = Vectors.aref(vector_var, element_num);
                                require_newP = new_pph_phrase_p(target);
                                new_phrase_dtr = ((pph_phrase.NIL != pph_phrase_p(old_phrase_dtr, (SubLObject)pph_phrase.UNPROVIDED)) ? pph_phrase_copy_dtr(dtr_num, old_phrase_dtr, copied_phrases, require_newP) : old_phrase_dtr);
                                new_dtrs = (SubLObject)ConsesLow.cons(new_phrase_dtr, new_dtrs);
                                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                            }
                        }
                        set_pph_phrase_dtrs_from_list(target, Sequences.nreverse(new_dtrs), (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    else {
                        set_pph_phrase_dtrs_from_list(target, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    pph_phrase_set_cycl(target, pph_phrase_cycl(old_phrase, (SubLObject)pph_phrase.UNPROVIDED));
                    final SubLObject old_agr = pph_phrase_agr(old_phrase);
                    if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(old_agr)) {
                        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.FOUR_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str56$__Setting_agr_to__S, old_agr, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                        }
                        pph_phrase_set_agr(target, pph_data_structures.pph_phrase_agr_copy(old_agr, copied_phrases), (SubLObject)pph_phrase.NIL);
                        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.FOUR_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str57$__Set_agr_to__S, pph_phrase_agr(target), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                        }
                    }
                    pph_phrase_set_justification(target, conses_high.copy_list(pph_phrase_justification(old_phrase)));
                    pph_phrase_set_arg_position_map(target, pph_phrase_arg_position_map(old_phrase));
                    final SubLObject plist2 = pph_data_structures.pph_phrase_plist(old_phrase);
                    SubLObject remainder2;
                    SubLObject property3;
                    SubLObject old_value;
                    SubLObject new_value;
                    for (remainder2 = (SubLObject)pph_phrase.NIL, remainder2 = plist2; pph_phrase.NIL != remainder2; remainder2 = conses_high.cddr(remainder2)) {
                        property3 = remainder2.first();
                        old_value = conses_high.cadr(remainder2);
                        if (pph_phrase.NIL != pph_phrase_copy_property_p(property3, copy_nonlocal_featuresP)) {
                            new_value = ((pph_phrase.NIL != pph_phrase_p(old_value, (SubLObject)pph_phrase.UNPROVIDED)) ? pph_phrase_copy_plist_phrase(property3, old_value, copied_phrases, copy_nonlocal_featuresP) : old_value);
                            pph_phrase_info_set_high(target, property3, new_value);
                        }
                    }
                    if (pph_phrase.NIL != pph_data_structures.pph_phrase_has_info_vector_p(old_phrase)) {
                        SubLObject list_var2 = (SubLObject)pph_phrase.NIL;
                        SubLObject property4 = (SubLObject)pph_phrase.NIL;
                        SubLObject n2 = (SubLObject)pph_phrase.NIL;
                        list_var2 = pph_data_structures.pph_info_vector_slots();
                        property4 = list_var2.first();
                        for (n2 = (SubLObject)pph_phrase.ZERO_INTEGER; pph_phrase.NIL != list_var2; list_var2 = list_var2.rest(), property4 = list_var2.first(), n2 = Numbers.add((SubLObject)pph_phrase.ONE_INTEGER, n2)) {
                            if (pph_phrase.NIL != pph_phrase_copy_property_p(property4, copy_nonlocal_featuresP)) {
                                if (pph_phrase.NIL != pph_data_structures.pph_phrase_info_property_set_p(old_phrase, property4, n2)) {
                                    old_value = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(old_phrase, property4, n2, (SubLObject)pph_phrase.UNPROVIDED);
                                    new_value = ((pph_phrase.NIL != pph_phrase_p(old_value, (SubLObject)pph_phrase.UNPROVIDED)) ? pph_phrase_copy_plist_phrase(property4, old_value, copied_phrases, copy_nonlocal_featuresP) : old_value);
                                    pph_data_structures.pph_phrase_info_vector_set(target, n2, new_value);
                                }
                                else {
                                    pph_data_structures.pph_phrase_info_vector_clear(target, n2);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_phrase.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        stacks.stack_pop(pph_phrase.$pph_phrase_copy_stack$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                pph_phrase.$pph_phrase_copy_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 12864L)
    public static SubLObject pph_phrase_copy_property_p(final SubLObject property, final SubLObject copy_nonlocal_featuresP) {
        if (property == pph_phrase.$kw45$NON_LOCAL_FEATURES_IGNORED_) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == copy_nonlocal_featuresP && pph_phrase.NIL != pph_phrase_nonlocal_feature_property_p(property)) {
            return (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)pph_phrase.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 13224L)
    public static SubLObject pph_phrase_copy_dtr(final SubLObject dtr_num, final SubLObject old_phrase_dtr, final SubLObject copied_phrases, final SubLObject require_newP) {
        return pph_phrase_copy_int(old_phrase_dtr, copied_phrases, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.T, require_newP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 13503L)
    public static SubLObject pph_phrase_copy_plist_phrase(final SubLObject property, final SubLObject old_value, final SubLObject copied_phrases, SubLObject copy_nonlocal_featuresP) {
        if (copy_nonlocal_featuresP == pph_phrase.UNPROVIDED) {
            copy_nonlocal_featuresP = (SubLObject)pph_phrase.T;
        }
        return pph_phrase_copy_int(old_value, copied_phrases, (SubLObject)pph_phrase.NIL, copy_nonlocal_featuresP, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 13828L)
    public static SubLObject pph_phrase_dtr_list(final SubLObject phrase) {
        final SubLObject dtr_vector = pph_phrase_dtrs(phrase);
        return (SubLObject)(dtr_vector.isVector() ? vector_utilities.vector_elements(dtr_vector, (SubLObject)pph_phrase.UNPROVIDED) : pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 14255L)
    public static SubLObject pph_phrase_nonlocal_feature_property_p(final SubLObject property) {
        return subl_promotions.memberP(property, pph_phrase.$pph_phrase_nonlocal_feature_properties$.getGlobalValue(), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 14391L)
    public static SubLObject pph_phrase_verbosity(final SubLObject phrase) {
        final SubLObject string = pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL);
        if (pph_phrase.NIL != string) {
            return pph_content_word_count(string);
        }
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject verbosity = (SubLObject)pph_phrase.ZERO_INTEGER;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_verbosity;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    dtr_verbosity = pph_phrase_verbosity(dtr);
                    if (dtr_verbosity.numG(verbosity)) {
                        verbosity = dtr_verbosity;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return verbosity;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject verbosity = (SubLObject)pph_phrase.ZERO_INTEGER;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    verbosity = Numbers.add(verbosity, pph_phrase_verbosity(dtr));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return verbosity;
        }
        if (pph_phrase.NIL != pph_phrase_has_known_cyclP(phrase)) {
            return list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)pph_phrase.$sym59$ATOM), pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return (SubLObject)pph_phrase.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 15289L)
    public static SubLObject pph_content_word_count(final SubLObject string) {
        final SubLObject strings = pph_string.pph_string_tokenize(string, (SubLObject)pph_phrase.UNPROVIDED);
        return Numbers.add(list_utilities.count_if_not((SubLObject)pph_phrase.$sym60$CLOSED_LEXICAL_CLASS_STRING_, list_utilities.remove_if_not((SubLObject)pph_phrase.$sym61$STRINGP, strings, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), list_utilities.count_if_not((SubLObject)pph_phrase.$sym61$STRINGP, strings, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 15894L)
    public static SubLObject pph_special_type_kwP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, pph_phrase.$pph_special_types$.getGlobalValue(), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16044L)
    public static SubLObject pph_phrase_special_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == v_object || pph_phrase.NIL != pph_special_type_kwP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16163L)
    public static SubLObject pph_phrase_special_type(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw63$SPECIAL_TYPE, (SubLObject)pph_phrase.NINE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16333L)
    public static SubLObject pph_phrase_set_special_type(final SubLObject phrase, final SubLObject special_type) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw63$SPECIAL_TYPE, (SubLObject)pph_phrase.NINE_INTEGER, special_type);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16595L)
    public static SubLObject pph_phrase_clear_special_type(final SubLObject phrase) {
        return pph_phrase_set_special_type(phrase, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16703L)
    public static SubLObject pph_phrase_focus_arg(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw64$FOCUS_ARG, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 16847L)
    public static SubLObject pph_phrase_set_focus_arg(final SubLObject phrase, final SubLObject focus_arg) {
        pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw64$FOCUS_ARG, focus_arg);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 17081L)
    public static SubLObject pph_percent_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_special_type(v_object) == pph_phrase.$kw65$PERCENT_PHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 17367L)
    public static SubLObject new_pph_percent_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_special_type(phrase, (SubLObject)pph_phrase.$kw65$PERCENT_PHRASE);
        final SubLObject percent_cycl = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_cycl(phrase, percent_cycl);
        if (pph_phrase.NIL == pph_utilities.pph_arg_position_specifierP(percent_cycl)) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 17814L)
    public static SubLObject pph_clarifying_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_special_type(v_object) == pph_phrase.$kw66$CLARIFYING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 18108L)
    public static SubLObject new_pph_type_clarifying_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_phrase.NIL;
        }
        final SubLObject clarifying_phrase_dtr = pph_templates.pph_phrasify_phrase_naut(cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_phrase.$kw67$ARG1));
        final SubLObject main_dtr = pph_templates.pph_phrasify_phrase_naut(cycl_utilities.nat_arg2(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_phrase.$kw68$ARG2));
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_arg_position_map(phrase, arg_position_map);
        pph_phrase_set_category_to_np(phrase);
        pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_phrase.ONE_INTEGER);
        set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(clarifying_phrase_dtr, main_dtr), (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject new_agr_target = pph_utilities.new_pph_nth_phrase((SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject new_agr = pph_utilities.new_pph_agr_constraint((SubLObject)pph_phrase.$kw66$CLARIFYING, new_agr_target);
        pph_phrase_set_agr_constraint(clarifying_phrase_dtr, new_agr, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_note_not_done(phrase);
        pph_phrase_note_not_done(clarifying_phrase_dtr);
        pph_phrase_set_special_type(clarifying_phrase_dtr, (SubLObject)pph_phrase.$kw66$CLARIFYING);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 19082L)
    public static SubLObject pph_symbol_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_special_type(v_object) == pph_phrase.$kw69$SYMBOL_PHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 19344L)
    public static SubLObject new_pph_symbol_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_special_type(phrase, (SubLObject)pph_phrase.$kw69$SYMBOL_PHRASE);
        final SubLObject symbol_cycl = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw70$SYMBOL, symbol_cycl);
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 19747L)
    public static SubLObject pph_symbol_phrase_symbol(final SubLObject v_pph_phrase) {
        return pph_data_structures.pph_phrase_info_lookup(v_pph_phrase, (SubLObject)pph_phrase.$kw70$SYMBOL, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 19857L)
    public static SubLObject pph_cycl_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_special_type(v_object) == pph_phrase.$kw71$CYCL_PHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 20128L)
    public static SubLObject new_pph_cycl_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject cycl = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_special_type(phrase, (SubLObject)pph_phrase.$kw71$CYCL_PHRASE);
        pph_phrase_set_cycl(phrase, cycl);
        if (pph_phrase.NIL == pph_utilities.pph_arg_position_specifierP(cycl)) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 20532L)
    public static SubLObject pph_quoted_paraphrase_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_special_type(v_object) == pph_phrase.$kw72$QUOTED_PARAPHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 20901L)
    public static SubLObject new_pph_quoted_paraphrase_phrase(final SubLObject phrase_naut) {
        return quote_pph_phrase(pph_templates.pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 21129L)
    public static SubLObject quote_pph_phrase(final SubLObject phrase) {
        final SubLObject new_mother = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_special_type(new_mother, (SubLObject)pph_phrase.$kw72$QUOTED_PARAPHRASE);
        pph_phrase_set_only_dtr(new_mother, phrase);
        pph_phrase_set_cycl(new_mother, pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
        pph_phrase_set_arg_position_map(new_mother, pph_phrase_arg_position_map(phrase));
        return new_mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 21559L)
    public static SubLObject pph_string_mention_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_special_type(v_object) == pph_phrase.$kw73$STRING_MENTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 21863L)
    public static SubLObject new_pph_string_mention_phrase(final SubLObject phrase_naut) {
        return quote_pph_phrase(pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.NIL, cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 22068L)
    public static SubLObject pph_meta_phrase_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(obj, (SubLObject)pph_phrase.UNPROVIDED) && (pph_phrase.NIL != pph_conditional_phrase_p(obj) || pph_phrase.NIL != pph_variable_binding_phrase_p(obj) || pph_phrase.NIL != pph_quoted_paraphrase_phrase_p(obj) || pph_phrase.NIL != pph_terse_phrase_p(obj) || pph_phrase.NIL != pph_precise_phrase_p(obj) || pph_phrase.NIL != pph_nospace_phrase_p(obj) || pph_phrase.NIL != pph_coordination_phrase_p(obj) || pph_phrase.NIL != pph_repeated_phrase_p(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 22544L)
    public static SubLObject pph_nospace_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL) == pph_phrase.$kw74$NOSPACE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 22903L)
    public static SubLObject new_pph_nospace_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLObject nested_phrase = pph_templates.pph_phrase_from_concatenate_phrases_naut(phrase_naut, arg_position_map);
        final SubLObject phrase = convert_pph_phrase_to_nospace_phrase(nested_phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 23276L)
    public static SubLObject convert_pph_phrase_to_nospace_phrase(final SubLObject nested_phrase) {
        final SubLObject phrase = pph_phrase_copy(nested_phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw74$NOSPACE, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 23605L)
    public static SubLObject pph_variable_binding_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_variable_binding_phrase_query_template(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL) == pph_phrase.$kw75$VARIABLE_BINDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 23976L)
    public static SubLObject new_pph_variable_binding_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject query_el_formula = (SubLObject)pph_phrase.NIL;
        SubLObject sub_phrase_naut = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list76);
        query_el_formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list76);
        sub_phrase_naut = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject nested_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw75$VARIABLE_BINDING, (SubLObject)pph_phrase.UNPROVIDED);
            pph_variable_binding_phrase_set_query_template(phrase, query_el_formula);
            pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw77$PHRASE_NAUT, sub_phrase_naut);
            pph_phrase_set_only_dtr(phrase, nested_phrase);
            if (pph_phrase.NIL == pph_utilities.pph_cycl_template_p(query_el_formula)) {
                pph_variable_binding_phrase_try_to_resolve_bindings(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            }
            return phrase;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list76);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 24664L)
    public static SubLObject pph_variable_binding_phrase_query_template(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw78$QUERY_EL_FORMULA, (SubLObject)pph_phrase.EIGHT_INTEGER, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 24822L)
    public static SubLObject pph_variable_binding_phrase_phrase_naut_subst(final SubLObject v_pph_phrase, final SubLObject old_term, final SubLObject new_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_phrase_naut = pph_variable_binding_phrase_phrase_naut(v_pph_phrase);
        SubLObject replacedP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != cycl_utilities.expression_find(old_term, old_phrase_naut, (SubLObject)pph_phrase.NIL, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), (SubLObject)pph_phrase.UNPROVIDED)) {
            pph_variable_binding_phrase_set_phrase_naut(v_pph_phrase, cycl_utilities.expression_subst(new_term, old_term, old_phrase_naut, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), (SubLObject)pph_phrase.UNPROVIDED));
            replacedP = (SubLObject)pph_phrase.T;
        }
        else if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str79$Couldn_t_find__S___in__S, old_term, old_phrase_naut);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return replacedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 25417L)
    public static SubLObject pph_variable_binding_phrase_phrase_naut(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw77$PHRASE_NAUT, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 25541L)
    public static SubLObject pph_variable_binding_phrase_set_phrase_naut(final SubLObject phrase, final SubLObject phrase_naut) {
        return pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw77$PHRASE_NAUT, phrase_naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 25686L)
    public static SubLObject pph_variable_binding_phrase_set_query_template(final SubLObject phrase, final SubLObject query_template) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw78$QUERY_EL_FORMULA, (SubLObject)pph_phrase.EIGHT_INTEGER, query_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 25871L)
    public static SubLObject pph_variable_binding_phrase_query_el_formula(final SubLObject phrase, final SubLObject paraphrase_formula) {
        final SubLObject template = pph_variable_binding_phrase_query_template(phrase);
        if (pph_phrase.NIL != pph_utilities.pph_cycl_template_p(template)) {
            final SubLObject template_vars = cycl_utilities.expression_gather(template, (SubLObject)pph_phrase.$sym80$EL_VAR_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject query_formula = pph_utilities.pph_apply_template(template, paraphrase_formula);
            final SubLObject query_vars = cycl_utilities.expression_gather(query_formula, (SubLObject)pph_phrase.$sym80$EL_VAR_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            if (pph_phrase.NIL == conses_high.set_difference(query_vars, template_vars, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
                return query_formula;
            }
            return (SubLObject)pph_phrase.NIL;
        }
        else {
            if (pph_phrase.NIL != el_utilities.el_formula_p(template)) {
                return template;
            }
            return (SubLObject)pph_phrase.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 26586L)
    public static SubLObject pph_variable_bindings_and_supports_from_phrase(final SubLObject phrase, final SubLObject paraphrase_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_el_formula = pph_variable_binding_phrase_query_el_formula(phrase, paraphrase_formula);
        if (pph_phrase.NIL == el_utilities.el_formula_p(query_el_formula)) {
            return Values.values((SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject ans = pph_variable_bindings_and_supports_from_query_el_formula(query_el_formula, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject successP = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_phrase.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            pph_phrase_add_inference(phrase, inference);
        }
        return Values.values(ans, successP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 27109L)
    public static SubLObject pph_variable_bindings_and_supports_from_query_el_formula_internal(final SubLObject query_el_formula, SubLObject mt) {
        if (mt == pph_phrase.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = (SubLObject)pph_phrase.$list82;
        thread.resetMultipleValues();
        final SubLObject ask_result = pph_utilities.pph_query(query_el_formula, mt, v_properties);
        final SubLObject query_runP = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_phrase.NIL == ask_result && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str83$Couldn_t_find_bindings_for__S, query_el_formula);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return Values.values(ask_result.first(), (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != ask_result), inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 27109L)
    public static SubLObject pph_variable_bindings_and_supports_from_query_el_formula(final SubLObject query_el_formula, SubLObject mt) {
        if (mt == pph_phrase.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == v_memoization_state) {
            return pph_variable_bindings_and_supports_from_query_el_formula_internal(query_el_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_phrase.$sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_phrase.$sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.$int84$24, (SubLObject)pph_phrase.EQUAL, (SubLObject)pph_phrase.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_phrase.$sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_el_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (query_el_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_variable_bindings_and_supports_from_query_el_formula_internal(query_el_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query_el_formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 27767L)
    public static SubLObject pph_variable_binding_phrase_substitute_cycl(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_cycl = bindings.apply_bindings(pph_phrase.$pph_variable_bindings$.getDynamicValue(thread), pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
        pph_phrase_set_cycl(phrase, new_cycl);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_variable_binding_phrase_substitute_cycl(dtr);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 28125L)
    public static SubLObject pph_phrase_try_to_resolve_binding_phrases(final SubLObject phrase, SubLObject dont_touch) {
        if (dont_touch == pph_phrase.UNPROVIDED) {
            dont_touch = (SubLObject)pph_phrase.NIL;
        }
        SubLObject failP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_variable_binding_phrase_p(phrase)) {
            pph_variable_binding_phrase_try_to_resolve_bindings(phrase, dont_touch);
            failP = pph_variable_binding_phrase_p(phrase);
        }
        if (pph_phrase.NIL != pph_repeated_phrase_p(phrase)) {
            final SubLObject first_arg_position = pph_repeated_phrase_first_arg_position(phrase);
            final SubLObject first_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(first_arg_position);
            failP = pph_phrase_try_to_resolve_binding_phrases(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER), (SubLObject)ConsesLow.cons(first_cycl_template, dont_touch));
        }
        else if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == failP) {
                        failP = pph_phrase_try_to_resolve_binding_phrases(dtr, dont_touch);
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return failP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 29016L)
    public static SubLObject pph_variable_binding_phrase_try_to_resolve_bindings(final SubLObject phrase, SubLObject dont_touch) {
        if (dont_touch == pph_phrase.UNPROVIDED) {
            dont_touch = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase_root_mother_cycl(phrase);
        SubLObject phrase_naut = pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw77$PHRASE_NAUT, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject map = pph_phrase_arg_position_map(phrase);
        final SubLObject query_template = pph_variable_binding_phrase_query_template(phrase);
        SubLObject cant_touch_thisP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_vars.$pph_resolve_bindings_phrasesP$.getDynamicValue(thread));
        if (pph_phrase.NIL == cant_touch_thisP) {
            SubLObject csome_list_var = dont_touch;
            SubLObject taboo = (SubLObject)pph_phrase.NIL;
            taboo = csome_list_var.first();
            while (pph_phrase.NIL == cant_touch_thisP && pph_phrase.NIL != csome_list_var) {
                if (pph_phrase.NIL != cycl_utilities.expression_find(taboo, query_template, (SubLObject)pph_phrase.NIL, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), (SubLObject)pph_phrase.UNPROVIDED)) {
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase.$str85$Can_t_resolve__S_due_to__S, query_template, taboo);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    cant_touch_thisP = (SubLObject)pph_phrase.T;
                }
                csome_list_var = csome_list_var.rest();
                taboo = csome_list_var.first();
            }
        }
        if (pph_phrase.NIL == cant_touch_thisP) {
            thread.resetMultipleValues();
            final SubLObject bindings_and_supports = pph_variable_bindings_and_supports_from_phrase(phrase, cycl);
            final SubLObject successP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_phrase.NIL != successP) {
                SubLObject current;
                final SubLObject datum = current = bindings_and_supports;
                final SubLObject _prev_bind_0 = pph_phrase.$pph_variable_bindings$.currentBinding(thread);
                try {
                    pph_phrase.$pph_variable_bindings$.bind((SubLObject)pph_phrase.NIL, thread);
                    SubLObject supports = (SubLObject)pph_phrase.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list86);
                    pph_phrase.$pph_variable_bindings$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list86);
                    supports = current.first();
                    current = current.rest();
                    if (pph_phrase.NIL == current) {
                        phrase_naut = bindings.apply_bindings(pph_phrase.$pph_variable_bindings$.getDynamicValue(thread), phrase_naut);
                        final SubLObject inferences = pph_phrase_inferences(phrase);
                        final SubLObject old_just = pph_phrase_justification(phrase);
                        pph_phrase_copy(pph_templates.pph_phrasify_phrase_naut(phrase_naut, map), phrase, (SubLObject)pph_phrase.UNPROVIDED);
                        pph_phrase_set_inferences(phrase, inferences);
                        SubLObject cdolist_list_var = old_just;
                        SubLObject just = (SubLObject)pph_phrase.NIL;
                        just = cdolist_list_var.first();
                        while (pph_phrase.NIL != cdolist_list_var) {
                            pph_phrase_add_justification(phrase, just);
                            cdolist_list_var = cdolist_list_var.rest();
                            just = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2 = supports;
                        SubLObject support = (SubLObject)pph_phrase.NIL;
                        support = cdolist_list_var2.first();
                        while (pph_phrase.NIL != cdolist_list_var2) {
                            pph_phrase_add_justification(phrase, support);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            support = cdolist_list_var2.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list86);
                    }
                }
                finally {
                    pph_phrase.$pph_variable_bindings$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 30364L)
    public static SubLObject pph_terse_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL) == pph_phrase.$kw87$TERSE_PARAPHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 30713L)
    public static SubLObject new_pph_terse_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_templates.pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject nested_phrase = pph_phrase_copy(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw87$TERSE_PARAPHRASE, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 31086L)
    public static SubLObject pph_precise_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL) == pph_phrase.$kw88$PRECISE_PARAPHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 31447L)
    public static SubLObject new_pph_precise_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLObject nested_phrase_naut = cycl_utilities.nat_arg1(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject phrase = new_pph_phrase_for_cycl(nested_phrase_naut, arg_position_map, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject nested_phrase = pph_phrase_copy(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw88$PRECISE_PARAPHRASE, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 31935L)
    public static SubLObject pph_chemical_formula_from_lists_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL) == pph_phrase.$kw89$CHEMICAL_FORMULA_FROM_LISTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 32344L)
    public static SubLObject new_pph_chemical_formula_from_lists_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject element_list = (SubLObject)pph_phrase.NIL;
        SubLObject quantity_list = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list90);
        element_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list90);
        quantity_list = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject elements_phrase = new_pph_phrase_for_cycl(element_list, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject quantities_phrase = new_pph_phrase_for_cycl(quantity_list, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw89$CHEMICAL_FORMULA_FROM_LISTS, (SubLObject)pph_phrase.UNPROVIDED);
            set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(elements_phrase, quantities_phrase), (SubLObject)pph_phrase.UNPROVIDED);
            return phrase;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list90);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 32910L)
    public static SubLObject pph_conditional_phrase_p(final SubLObject v_object) {
        SubLObject ans = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject category = pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL);
            ans = pph_conditional_phrase_category_p(category);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 33300L)
    public static SubLObject pph_conditional_phrase_category_p(final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != list_utilities.proper_list_p(category) && pph_phrase.NIL != list_utilities.lengthE(category, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.UNPROVIDED) && category.first() == pph_phrase.$kw91$CONDITIONAL_PHRASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 33481L)
    public static SubLObject new_pph_conditional_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_phrase.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject args = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        if (!cycl_utilities.nat_arity(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED).numGE((SubLObject)pph_phrase.TWO_INTEGER)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str92$NEW_PPH_CONDITIONAL_PHRASE_passed) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(phrase_naut));
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject test = (SubLObject)pph_phrase.NIL;
        SubLObject phrase_naut_if = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list93);
        test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list93);
        phrase_naut_if = current.first();
        current = current.rest();
        final SubLObject phrase_naut_if_not = (SubLObject)(current.isCons() ? current.first() : ConsesLow.list(pph_functions.bestnlphraseofstringfn(), string_utilities.$empty_string$.getGlobalValue()));
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_phrase.$list93);
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject phrase_if_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_phrase.$kw68$ARG2);
            final SubLObject phrase_if_not_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_phrase.$kw94$ARG3);
            if (pph_phrase.NIL == pph_utilities.pph_usable_condition_testP(test)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase.$str95$__ConditionalPhraseFn_expects_a_c, test);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if_not, phrase_if_not_map);
            }
            pph_phrase_set_category(phrase, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$kw91$CONDITIONAL_PHRASE, test), (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject phrase_if = pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if, phrase_if_map);
            final SubLObject phrase_if_not = pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if_not, phrase_if_not_map);
            set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(phrase_if, phrase_if_not), (SubLObject)pph_phrase.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list93);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 34857L)
    public static SubLObject pph_conditional_phrase_test(final SubLObject phrase) {
        return conses_high.second(pph_phrase_category(phrase, (SubLObject)pph_phrase.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 35066L)
    public static SubLObject pph_conditional_phrase_set_test(final SubLObject phrase, final SubLObject test) {
        pph_phrase_set_category(phrase, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$kw91$CONDITIONAL_PHRASE, test), (SubLObject)pph_phrase.NIL);
        return pph_conditional_phrase_test(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 35340L)
    public static SubLObject pph_conditional_phrase_values(final SubLObject phrase) {
        return pph_phrase_dtr_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 35574L)
    public static SubLObject pph_coordination_phrase_p(final SubLObject v_object) {
        final SubLObject category = pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase.NIL != list_utilities.proper_list_p(category) && category.first() == pph_phrase.$kw96$COORDINATION) {
            return Types.keywordp(conses_high.second(category));
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 36006L)
    public static SubLObject new_pph_coordination_phrase(final SubLObject phrase_naut) {
        final SubLObject dtr_phrase_nauts = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject opr_keyword = pph_opr_key_for_fn(cycl_utilities.nat_functor(phrase_naut));
        final SubLObject list_type = (SubLObject)pph_phrase.$kw97$UNORDERED;
        SubLObject dtrs = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = dtr_phrase_nauts;
        SubLObject dtr_phrase_naut = (SubLObject)pph_phrase.NIL;
        dtr_phrase_naut = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            dtrs = (SubLObject)ConsesLow.cons(pph_templates.pph_phrase_from_gentemplate_phrase(dtr_phrase_naut, (SubLObject)pph_phrase.UNPROVIDED), dtrs);
            cdolist_list_var = cdolist_list_var.rest();
            dtr_phrase_naut = cdolist_list_var.first();
        }
        return new_pph_coordination_phrase_low(Sequences.nreverse(dtrs), opr_keyword, list_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 36502L)
    public static SubLObject new_pph_coordination_phrase_low(final SubLObject phrases, final SubLObject opr_keyword, final SubLObject list_type) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_set_category(phrase, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$kw96$COORDINATION, opr_keyword, list_type), (SubLObject)pph_phrase.UNPROVIDED);
        set_pph_phrase_dtrs_from_list(phrase, phrases, (SubLObject)pph_phrase.UNPROVIDED);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 36771L)
    public static SubLObject new_pph_numbered_list_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject constraint = (SubLObject)pph_phrase.NIL;
        SubLObject list = (SubLObject)pph_phrase.NIL;
        SubLObject list_type = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list98);
        constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list98);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list98);
        list_type = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject opr_keyword = pph_opr_key_for_fn(cycl_utilities.nat_functor(phrase_naut));
            final SubLObject list_type_identifier = pph_list_type_identifier(list_type);
            pph_phrase_set_category(phrase, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$kw96$COORDINATION, opr_keyword, list_type_identifier), (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject dtr = pph_templates.pph_phrase_from_gentemplate_phrase((SubLObject)ConsesLow.list(pph_functions.repeatforsubsequentargsfn(), (SubLObject)ConsesLow.list(pph_phrase.$const99$FormulaArgFn, (SubLObject)pph_phrase.ONE_INTEGER, list), (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), constraint, (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), (SubLObject)ConsesLow.list(pph_phrase.$const99$FormulaArgFn, (SubLObject)pph_phrase.ONE_INTEGER, list)))), (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_only_dtr(phrase, dtr);
            return phrase;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list98);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 37549L)
    public static SubLObject pph_opr_key_for_fn(final SubLObject fn) {
        if (pph_phrase.NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn())) {
            return (SubLObject)pph_phrase.$kw100$AND;
        }
        if (pph_phrase.NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn_but())) {
            return (SubLObject)pph_phrase.$kw101$BUT;
        }
        if (pph_phrase.NIL != kb_utilities.kbeq(fn, pph_functions.nldisjunctionfn())) {
            return (SubLObject)pph_phrase.$kw102$OR;
        }
        return (SubLObject)pph_phrase.$kw103$NONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 37771L)
    public static SubLObject pph_opr_key_for_connective(final SubLObject cycl_connective) {
        if (cycl_connective.eql(pph_phrase.$const104$and)) {
            return (SubLObject)pph_phrase.$kw100$AND;
        }
        if (cycl_connective.eql(pph_phrase.$const105$or)) {
            return (SubLObject)pph_phrase.$kw102$OR;
        }
        return (SubLObject)pph_phrase.$kw103$NONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 37949L)
    public static SubLObject pph_list_type_identifier(final SubLObject list_type) {
        final SubLObject result = pph_utilities.pph_ask_variable((SubLObject)pph_phrase.$sym106$_ID_STRING, (SubLObject)ConsesLow.listS(pph_phrase.$const107$htmlListTypeIdentifierString, list_type, (SubLObject)pph_phrase.$list108), pph_phrase.$const109$HTMLRepresentationMt, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.ONE_INTEGER).first();
        return (SubLObject)((pph_phrase.NIL != result) ? result : pph_phrase.$kw97$UNORDERED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 38204L)
    public static SubLObject pph_bare_string_phrase_p(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase_agr(phrase)) && pph_phrase.NIL == pph_phrase_has_known_cyclP(phrase) && pph_phrase.NIL == pph_phrase_has_dtrsP(phrase) && pph_phrase.NIL != list_utilities.singletonP(pph_phrase_output_list(phrase)) && pph_phrase.NIL != pph_bare_string_output_item_p(pph_phrase_output_list(phrase).first(), (SubLObject)pph_phrase.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 38603L)
    public static SubLObject pph_coordinated_np_info(final SubLObject phrase, SubLObject do_unification) {
        if (do_unification == pph_phrase.UNPROVIDED) {
            do_unification = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_head_dtr_genl_other_thanP(phrase, pph_phrase.$const110$CoordinatingConjunction)) {
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject dtr_count = pph_phrase_dtr_count(phrase);
        if (!dtr_count.numG((SubLObject)pph_phrase.TWO_INTEGER)) {
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject last_dtr = pph_phrase_last_dtr(phrase);
        final SubLObject supposed_conj = (SubLObject)((pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED)) ? pph_phrase_nth_dtr(phrase, Numbers.subtract(pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase.TWO_INTEGER)) : pph_phrase.NIL);
        SubLObject unified_gender = pph_phrase.$const111$Feminine_NLAttr;
        SubLObject unified_person = pph_phrase.$const112$ThirdPerson_NLAttr;
        if (pph_phrase.NIL == pph_phrase_p(supposed_conj, (SubLObject)pph_phrase.UNPROVIDED) || pph_phrase.NIL == pph_phrase_npP(last_dtr)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == pph_utilities.pph_genl_categoryP(pph_phrase_category(supposed_conj, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const110$CoordinatingConjunction, (SubLObject)pph_phrase.UNPROVIDED) && (pph_phrase.NIL == pph_phrase_string(supposed_conj, (SubLObject)pph_phrase.UNPROVIDED) || pph_phrase.NIL == pph_variable_handling.pph_string_is_posP(pph_phrase_string(supposed_conj, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const110$CoordinatingConjunction, (SubLObject)pph_phrase.$kw113$NEVER, (SubLObject)pph_phrase.UNPROVIDED))) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == do_unification) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (!dtr.equal(supposed_conj)) {
                        if (pph_phrase.NIL == pph_utilities.pph_npP(pph_phrase_category(dtr, (SubLObject)pph_phrase.UNPROVIDED))) {
                            return (SubLObject)pph_phrase.NIL;
                        }
                        unified_person = pph_methods.pph_unify_person(unified_person, pph_phrase_person(dtr));
                        unified_gender = pph_methods.pph_unify_gender(unified_gender, pph_phrase_gender(dtr));
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return pph_methods_lexicon.new_pph_pronoun_agr(unified_person, pph_phrase.$const114$Plural_NLAttr, unified_gender);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 41299L)
    public static SubLObject pph_phrase_gender(final SubLObject phrase) {
        return pph_methods.pph_gender(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 41390L)
    public static SubLObject pph_phrase_person(final SubLObject phrase) {
        return pph_methods.pph_person(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 41481L)
    public static SubLObject pph_phrase_number(final SubLObject phrase) {
        return pph_methods.pph_number(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 41572L)
    public static SubLObject pph_agr_pred_from_coordinated_np_number(final SubLObject phrase) {
        final SubLObject the_agr = pph_coordinated_np_info(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == the_agr) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_methods_lexicon.pph_pronoun_agr_number(the_agr).eql(pph_phrase.$const115$Singular_NLAttr)) {
            return pph_phrase.$const116$singular_Generic;
        }
        return pph_phrase.$const117$plural_Generic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 41920L)
    public static SubLObject pph_repeated_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(v_object, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_has_dtrsP(v_object) && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL).isCons() && pph_phrase_category(v_object, (SubLObject)pph_phrase.NIL).first() == pph_phrase.$kw118$REPEATED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 42386L)
    public static SubLObject pph_repeated_phrase_first_arg_position(final SubLObject repeated_phrase) {
        final SubLObject first_arg_specifier = pph_phrase_category(repeated_phrase, (SubLObject)pph_phrase.NIL).rest();
        if (first_arg_specifier.isInteger()) {
            return (SubLObject)ConsesLow.list(first_arg_specifier);
        }
        if (pph_phrase.NIL != pph_utilities.pph_arg_position_specifierP(first_arg_specifier)) {
            return pph_utilities.pph_arg_position_from_template(first_arg_specifier);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 42755L)
    public static SubLObject pph_repeated_phrase_references_argP(final SubLObject phrase, final SubLObject arg) {
        final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg);
        final SubLObject first_arg_position = pph_repeated_phrase_first_arg_position(phrase);
        return Numbers.numLE(first_arg_position.first(), arg_position.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 43021L)
    public static SubLObject new_pph_repeated_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject first_arg_specifier = (SubLObject)pph_phrase.NIL;
        SubLObject first_phrase_naut = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list119);
        first_arg_specifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list119);
        first_phrase_naut = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            pph_phrase_set_category(phrase, (SubLObject)ConsesLow.cons((SubLObject)pph_phrase.$kw118$REPEATED, first_arg_specifier), (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_only_dtr(phrase, pph_templates.pph_phrase_from_gentemplate_phrase(first_phrase_naut, (SubLObject)pph_phrase.UNPROVIDED));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list119);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 43472L)
    public static SubLObject pph_phrase_p(final SubLObject v_object, SubLObject verify_dtrsP) {
        if (verify_dtrsP == pph_phrase.UNPROVIDED) {
            verify_dtrsP = (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != document.sign_p(v_object) && pph_phrase.NIL != pph_data_structures.paraphrase_phrase_info_bundle_p(document.sign_info(v_object)) && (pph_phrase.NIL == verify_dtrsP || pph_phrase.NIL != pph_phrase_verify_dtrs(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 43804L)
    public static SubLObject pph_phrase_verify_dtrs(final SubLObject phrase) {
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject new_format_string;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase.NIL != pph_phrase_p(dtr, (SubLObject)pph_phrase.UNPROVIDED)) {
                    pph_phrase_verify_dtrs(dtr);
                }
                else {
                    new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str120$Found_non_phrase_dtr___S) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(dtr));
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_phrase.$kw121$VERIFIED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44044L)
    public static SubLObject pph_phrase_non_empty_output_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != v_object && pph_phrase.NIL != pph_phrase_output_list_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44189L)
    public static SubLObject pph_phrase_output_list_p(final SubLObject v_object) {
        return pph_utilities.pph_list_ofP((SubLObject)pph_phrase.$sym122$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44304L)
    public static SubLObject pph_phrase_cycl_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == v_object || pph_phrase.NIL != Types.sublisp_true());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44453L)
    public static SubLObject pph_phrase_case_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == v_object || pph_phrase.NIL != pph_utilities.pph_case_kwP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44550L)
    public static SubLObject pph_phrase_wu_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != at_admitted.generic_arg_p(v_object)) {
            return (SubLObject)pph_phrase.T;
        }
        SubLObject ans = Types.sublisp_null(v_object);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_phrase.$sym123$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_phrase.$const124$EverythingPSC, thread);
            if (pph_phrase.NIL != kb_indexing_datastructures.indexed_term_p(v_object) && pph_phrase.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject pos_forms_pred;
                for (csome_list_var = (SubLObject)pph_phrase.$list125, pos_forms_pred = (SubLObject)pph_phrase.NIL, pos_forms_pred = csome_list_var.first(); pph_phrase.NIL == ans && pph_phrase.NIL != csome_list_var; ans = kb_mapping_utilities.some_pred_value(v_object, pos_forms_pred, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), csome_list_var = csome_list_var.rest(), pos_forms_pred = csome_list_var.first()) {}
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 44921L)
    public static SubLObject pph_phrase_head_dtr_num_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == v_object || v_object.isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 45097L)
    public static SubLObject pph_phrase_indefinite_articleP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != conses_high.member(pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.$list126, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) || pph_phrase.NIL != conses_high.member(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.$list127, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 45391L)
    public static SubLObject pph_phrase_definite_articleP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED).eql(pph_phrase.$const128$The_TheWord)) || pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED).eql(pph_phrase.$const129$Definite_NLAttr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 45653L)
    public static SubLObject pph_phrase_note_done(final SubLObject phrase) {
        pph_phrase_note_done_status(phrase, (SubLObject)pph_phrase.T);
        pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 45874L)
    public static SubLObject pph_phrase_note_not_done(final SubLObject phrase) {
        pph_phrase_note_done_status(phrase, (SubLObject)pph_phrase.NIL);
        final SubLObject mother = pph_phrase_mother(phrase);
        if (pph_phrase.NIL != mother) {
            pph_phrase_note_not_done(mother);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 46213L)
    public static SubLObject pph_phrase_note_done_status(final SubLObject phrase, final SubLObject doneP) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw130$DONE_, (SubLObject)pph_phrase.SEVEN_INTEGER, doneP);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 46463L)
    public static SubLObject pph_phrase_doneP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL == pph_data_structures.valid_pph_phrase_p(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject doneP = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw130$DONE_, (SubLObject)pph_phrase.SEVEN_INTEGER, (SubLObject)pph_phrase.NIL);
        if (pph_phrase.NIL == doneP && pph_phrase.NIL != pph_phrase.$pph_sanity_check_phrase_donenessP$.getDynamicValue(thread) && pph_phrase.NIL != pph_phrase_has_stringP(phrase) && pph_phrase.NIL != string_utilities.non_empty_stringP(pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL)) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str131$_S_not_considered_done_, phrase);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 46936L)
    public static SubLObject pph_phrase_has_stringP(final SubLObject phrase) {
        SubLObject csome_list_var = pph_phrase_output_list(phrase);
        SubLObject item = (SubLObject)pph_phrase.NIL;
        item = csome_list_var.first();
        while (pph_phrase.NIL != csome_list_var) {
            if (pph_phrase.NIL != pph_string.pph_string_p(pph_data_structures.pph_phrase_output_item_string(item))) {
                return (SubLObject)pph_phrase.T;
            }
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 47246L)
    public static SubLObject pph_ranged_det_phrase_p(final SubLObject phrase, SubLObject recurseP) {
        if (recurseP == pph_phrase.UNPROVIDED) {
            recurseP = (SubLObject)pph_phrase.T;
        }
        SubLObject dtrnum = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject this_dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                this_dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_wu(this_dtr, (SubLObject)pph_phrase.UNPROVIDED).eql(pph_phrase.$const132$Between_TheWord) || (pph_phrase.NIL != pph_phrase_string(this_dtr, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != Strings.string_equal(pph_phrase_string(this_dtr, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.$str133$between, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED))) {
                    return (SubLObject)pph_phrase.T;
                }
                if (dtrnum.eql((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL != pph_symbol_phrase_p(this_dtr) && pph_phrase.$const134$EnDash_TheSymbol.eql(pph_data_structures.pph_phrase_info_lookup(this_dtr, (SubLObject)pph_phrase.$kw70$SYMBOL, (SubLObject)pph_phrase.UNPROVIDED))) {
                    return (SubLObject)pph_phrase.T;
                }
                if (pph_phrase.NIL != recurseP && pph_phrase.NIL != pph_ranged_det_phrase_p(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER), (SubLObject)pph_phrase.NIL)) {
                    return (SubLObject)pph_phrase.T;
                }
                dtrnum = Numbers.add(dtrnum, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 47998L)
    public static SubLObject pph_phrase_destroy_dtrs_metered(final SubLObject v_pph_phrase) {
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(v_pph_phrase)) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str135$Destroying_dtrs_of__S, v_pph_phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            final SubLObject old_new_pph_phrase_count = pph_data_structures.pph_phrase_id_index_new_objects_count();
            final SubLObject destruction_result = pph_phrase_destroy_dtrs(v_pph_phrase, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject new_new_pph_phrase_count = pph_data_structures.pph_phrase_id_index_new_objects_count();
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str136$Destroyed_failed_phrase_dtrs____N, old_new_pph_phrase_count, new_new_pph_phrase_count, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 48856L)
    public static SubLObject pph_phrase_destroyer() {
        return pph_phrase.$pph_phrase_destroyer$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 48931L)
    public static SubLObject set_pph_phrase_destruction_grace_period(final SubLObject seconds) {
        return delayed_processor.delayed_processor_set_delay_seconds(pph_phrase.$pph_phrase_destroyer$.getGlobalValue(), seconds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 49075L)
    public static SubLObject smite_doomed_pph_phrases_next_time_around() {
        return delayed_processor.delayed_processor_flush_next_time_around(pph_phrase_destroyer());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 49320L)
    public static SubLObject destroy_pph_phrase(final SubLObject v_pph_phrase, SubLObject exceptions) {
        if (exceptions == pph_phrase.UNPROVIDED) {
            exceptions = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((pph_phrase.NIL == pph_macros.$inside_destroy_new_pph_phrasesP$.getDynamicValue(thread) || pph_phrase.NIL != new_pph_phrase_p(v_pph_phrase)) && pph_phrase.NIL != pph_phrase_p(v_pph_phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            pph_data_structures.pph_phrase_info_set(v_pph_phrase, (SubLObject)pph_phrase.$kw142$DESTRUCTION_EXCEPTIONS, exceptions);
            if (pph_phrase.NIL != bypass_pph_phrase_destroyerP()) {
                destroy_pph_phrase_low(v_pph_phrase);
            }
            else {
                delayed_processor.schedule(pph_phrase.$pph_phrase_destroyer$.getGlobalValue(), v_pph_phrase);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 49742L)
    public static SubLObject bypass_pph_phrase_destroyerP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = (SubLObject)SubLObjectFactory.makeBoolean((pph_phrase.NIL == http_processP((SubLObject)pph_phrase.UNPROVIDED) || pph_phrase.NIL == control_vars.$generated_phrases_browsableP$.getDynamicValue(thread)) && pph_phrase.NIL != pph_vars.$bypass_pph_phrase_destroyerP$.getDynamicValue(thread));
        warn_about_pph_phrase_destruction(value, (SubLObject)pph_phrase.UNPROVIDED);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50071L)
    public static SubLObject http_processP(SubLObject process) {
        if (process == pph_phrase.UNPROVIDED) {
            process = Threads.current_process();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != string_utilities.starts_with(Threads.process_name(process), (SubLObject)pph_phrase.$str143$Socket_Connection_Handler) && pph_phrase.NIL != Sequences.search(print_high.princ_to_string(http_kernel.http_port()), Threads.process_name(process), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50428L)
    public static SubLObject clear_warn_about_pph_phrase_destruction() {
        final SubLObject cs = pph_phrase.$warn_about_pph_phrase_destruction_caching_state$.getGlobalValue();
        if (pph_phrase.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50428L)
    public static SubLObject remove_warn_about_pph_phrase_destruction(final SubLObject value, SubLObject process) {
        if (process == pph_phrase.UNPROVIDED) {
            process = Threads.current_process();
        }
        return memoization_state.caching_state_remove_function_results_with_args(pph_phrase.$warn_about_pph_phrase_destruction_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(value, process), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50428L)
    public static SubLObject warn_about_pph_phrase_destruction_internal(final SubLObject value, final SubLObject process) {
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str145$Destroy_PPH_phrases_is__S_for__S, value, process, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50428L)
    public static SubLObject warn_about_pph_phrase_destruction(final SubLObject value, SubLObject process) {
        if (process == pph_phrase.UNPROVIDED) {
            process = Threads.current_process();
        }
        SubLObject caching_state = pph_phrase.$warn_about_pph_phrase_destruction_caching_state$.getGlobalValue();
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_phrase.$sym144$WARN_ABOUT_PPH_PHRASE_DESTRUCTION, (SubLObject)pph_phrase.$sym146$_WARN_ABOUT_PPH_PHRASE_DESTRUCTION_CACHING_STATE_, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.EQL, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(value, process);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (value.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && process.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(warn_about_pph_phrase_destruction_internal(value, process)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(value, process));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50614L)
    public static SubLObject destroy_pph_phrase_low(final SubLObject v_pph_phrase) {
        final SubLObject id = pph_phrase_suid(v_pph_phrase);
        final SubLObject exceptions = pph_data_structures.pph_phrase_info_lookup(v_pph_phrase, (SubLObject)pph_phrase.$kw142$DESTRUCTION_EXCEPTIONS, (SubLObject)pph_phrase.UNPROVIDED);
        try {
            destroy_pph_phrase_int(v_pph_phrase, exceptions);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)pph_phrase.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (id.isInteger()) {
                    pph_data_structures.pph_phrase_id_index_remove(id);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 50930L)
    public static SubLObject destroy_all_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = pph_data_structures.pph_phrase_id_index();
        SubLObject phrases_to_destroy = (SubLObject)pph_phrase.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            pph_vars.$bypass_pph_phrase_destroyerP$.bind((SubLObject)pph_phrase.T, thread);
            SubLObject release = (SubLObject)pph_phrase.NIL;
            try {
                release = Locks.seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                final SubLObject idx = v_id_index;
                if (pph_phrase.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)pph_phrase.$kw147$SKIP)) {
                    final SubLObject idx_$2 = idx;
                    if (pph_phrase.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)pph_phrase.$kw147$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject phrase;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                            id = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                            phrase = Vectors.aref(vector_var, id);
                            if (pph_phrase.NIL == id_index.id_index_tombstone_p(phrase) || pph_phrase.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_phrase.$kw147$SKIP)) {
                                if (pph_phrase.NIL != id_index.id_index_tombstone_p(phrase)) {
                                    phrase = (SubLObject)pph_phrase.$kw147$SKIP;
                                }
                                phrases_to_destroy = (SubLObject)ConsesLow.cons(phrase, phrases_to_destroy);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx;
                    if (pph_phrase.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$3);
                        SubLObject id2 = (SubLObject)pph_phrase.NIL;
                        SubLObject phrase2 = (SubLObject)pph_phrase.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                phrase2 = Hashtables.getEntryValue(cdohash_entry);
                                phrases_to_destroy = (SubLObject)ConsesLow.cons(phrase2, phrases_to_destroy);
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                SubLObject cdolist_list_var = phrases_to_destroy;
                SubLObject phrase3 = (SubLObject)pph_phrase.NIL;
                phrase3 = cdolist_list_var.first();
                while (pph_phrase.NIL != cdolist_list_var) {
                    destroy_pph_phrase(phrase3, (SubLObject)pph_phrase.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    phrase3 = cdolist_list_var.first();
                }
            }
            finally {
                if (pph_phrase.NIL != release) {
                    Locks.release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                }
            }
        }
        finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
        }
        return pph_data_structures.pph_phrase_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 51359L)
    public static SubLObject destroy_pph_phrase_int(final SubLObject v_pph_phrase, final SubLObject exceptions) {
        pph_drs.remove_phrase_from_discourse_context(v_pph_phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(v_pph_phrase)) {
            pph_phrase_destroy_dtrs(v_pph_phrase, exceptions);
        }
        pph_phrase_free_suid(v_pph_phrase);
        pph_phrase_free_alternatives(v_pph_phrase);
        pph_phrase_free_mother(v_pph_phrase);
        pph_phrase_destroy_info_bundle(v_pph_phrase);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 51748L)
    public static SubLObject pph_phrase_destroy_info_bundle(final SubLObject v_pph_phrase) {
        final SubLObject info_bundle = document.sign_info(v_pph_phrase);
        pph_data_structures._csetf_pph_phrase_info_cycl(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        pph_data_structures._csetf_pph_phrase_info_agr(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        pph_data_structures._csetf_pph_phrase_info_justification(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        pph_data_structures._csetf_pph_phrase_info_output_list(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        pph_data_structures._csetf_pph_phrase_info_arg_position_map(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        pph_data_structures._csetf_pph_phrase_info_other(info_bundle, (SubLObject)pph_phrase.$kw148$FREE);
        document._csetf_sign_info(v_pph_phrase, (SubLObject)pph_phrase.NIL);
        return (SubLObject)pph_phrase.$kw149$DESTROYED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 52260L)
    public static SubLObject pph_phrase_destroy_dtrs(final SubLObject v_pph_phrase, SubLObject exceptions) {
        if (exceptions == pph_phrase.UNPROVIDED) {
            exceptions = (SubLObject)pph_phrase.NIL;
        }
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(v_pph_phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase.NIL != pph_phrase_p(dtr, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == Sequences.find(dtr, exceptions, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
                    destroy_pph_phrase(dtr, exceptions);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        document._csetf_sign_constituents(v_pph_phrase, (SubLObject)pph_phrase.NIL);
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 52561L)
    public static SubLObject pph_phrase_info_set_high(final SubLObject phrase, final SubLObject property, final SubLObject value) {
        if (property.eql((SubLObject)pph_phrase.$kw150$DEMERITS)) {
            return pph_phrase_set_top_level_demerits(phrase, value, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (property.eql((SubLObject)pph_phrase.$kw151$CASE)) {
            return pph_phrase_set_case(phrase, value, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (property.eql((SubLObject)pph_phrase.$kw152$PROBLEM_DICTIONARY)) {
            return pph_phrase_set_top_level_problem_dictionary(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw153$SUID)) {
            return pph_phrase_set_suid(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw154$MOTHER)) {
            return pph_phrase_set_mother(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw155$LINK_CYCL)) {
            return pph_phrase_set_link_cycl(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw156$WU)) {
            return pph_phrase_set_wu(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw157$HEAD_DTR_NUM)) {
            return pph_phrase_set_head_dtr_num(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw158$SOURCE_POS)) {
            return pph_phrase_resolution.pph_phrase_set_source_pos(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw159$ALTERNATIVES)) {
            return pph_phrase_set_alternatives(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw155$LINK_CYCL)) {
            return pph_phrase_set_link_cycl(phrase, value);
        }
        if (property.eql((SubLObject)pph_phrase.$kw130$DONE_)) {
            if (pph_phrase.NIL != value) {
                return pph_phrase_note_done(phrase);
            }
            return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, (SubLObject)pph_phrase.SEVEN_INTEGER, value);
        }
        else {
            if (property.eql((SubLObject)pph_phrase.$kw78$QUERY_EL_FORMULA)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, (SubLObject)pph_phrase.EIGHT_INTEGER, value);
            }
            if (property.eql((SubLObject)pph_phrase.$kw63$SPECIAL_TYPE)) {
                return pph_phrase_set_special_type(phrase, value);
            }
            if (property.eql((SubLObject)pph_phrase.$kw160$RESERVED_FOR_MATRIX_ARG0) || property.eql((SubLObject)pph_phrase.$kw45$NON_LOCAL_FEATURES_IGNORED_)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, (SubLObject)pph_phrase.ONE_INTEGER, value);
            }
            if (property.eql((SubLObject)pph_phrase.$kw45$NON_LOCAL_FEATURES_IGNORED_)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, (SubLObject)pph_phrase.SIX_INTEGER, value);
            }
            return pph_data_structures.pph_phrase_info_set(phrase, property, value);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 54192L)
    public static SubLObject pph_phrase_demerits(final SubLObject phrase) {
        SubLObject total_demerits = pph_phrase_top_level_demerits(phrase);
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_demerits;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                dtr_demerits = pph_phrase_demerits(dtr);
                if (dtr_demerits.isPositive()) {
                    total_demerits = Numbers.add(total_demerits, dtr_demerits);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return total_demerits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 54674L)
    public static SubLObject pph_phrase_contextualized_demerits(final SubLObject phrase) {
        return pph_phrase_demerits(pph_phrase_root_mother(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 54874L)
    public static SubLObject pph_phrase_top_level_demerits(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw150$DEMERITS, (SubLObject)pph_phrase.TEN_INTEGER, (SubLObject)pph_phrase.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 55051L)
    public static SubLObject pph_phrase_top_level_demerits_reason(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw161$DEMERITS_REASON, (SubLObject)pph_phrase.ELEVEN_INTEGER, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 55244L)
    public static SubLObject pph_phrase_set_top_level_demerits(final SubLObject phrase, final SubLObject demerits, SubLObject why) {
        if (why == pph_phrase.UNPROVIDED) {
            why = (SubLObject)pph_phrase.NIL;
        }
        assert pph_phrase.NIL != subl_promotions.non_negative_integer_p(demerits) : demerits;
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw150$DEMERITS, (SubLObject)pph_phrase.TEN_INTEGER, demerits);
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw161$DEMERITS_REASON, (SubLObject)pph_phrase.ELEVEN_INTEGER, why);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 55574L)
    public static SubLObject pph_phrase_increment_top_level_demerits(final SubLObject phrase, SubLObject delta, SubLObject why) {
        if (delta == pph_phrase.UNPROVIDED) {
            delta = (SubLObject)pph_phrase.ONE_INTEGER;
        }
        if (why == pph_phrase.UNPROVIDED) {
            why = (SubLObject)pph_phrase.NIL;
        }
        pph_phrase_set_top_level_demerits(phrase, number_utilities.maximum((SubLObject)ConsesLow.list((SubLObject)pph_phrase.ZERO_INTEGER, Numbers.add(delta, pph_phrase_top_level_demerits(phrase))), (SubLObject)pph_phrase.UNPROVIDED), why);
        return pph_phrase_top_level_demerits(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 55831L)
    public static SubLObject pph_phrase_max_alternatives(final SubLObject phrase) {
        SubLObject max_alternatives = pph_phrase_local_max_alternatives(phrase);
        for (SubLObject focal_phrase = phrase; pph_phrase.NIL == subl_promotions.positive_integer_p(max_alternatives) && pph_phrase.NIL != pph_phrase_p(pph_phrase_mother(focal_phrase), (SubLObject)pph_phrase.UNPROVIDED); focal_phrase = pph_phrase_mother(focal_phrase), max_alternatives = pph_phrase_local_max_alternatives(focal_phrase)) {}
        return max_alternatives;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 56470L)
    public static SubLObject pph_phrase_local_max_alternatives(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw163$MAX_ALTERNATIVES, (SubLObject)pph_phrase.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 56632L)
    public static SubLObject pph_phrase_set_max_alternatives(final SubLObject phrase, final SubLObject max_alternatives) {
        return pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw163$MAX_ALTERNATIVES, max_alternatives);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 56938L)
    public static SubLObject pph_phrase_set_inferences(final SubLObject phrase, final SubLObject inferences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids_es = (SubLObject)pph_phrase.NIL;
        SubLObject err_msg = (SubLObject)pph_phrase.NIL;
        final SubLObject suppress_pph_warningsP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_phrase.$warn_on_invalid_pph_inferencesP$.getDynamicValue(thread));
        SubLObject cdolist_list_var = inferences;
        SubLObject inference = (SubLObject)pph_phrase.NIL;
        inference = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)pph_phrase.NIL, thread);
                pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_phrase.T, thread);
                if (pph_phrase.NIL != pph_error.pph_break_on_errorP()) {
                    ids_es = (SubLObject)ConsesLow.cons(inference_datastructures_inference.inference_ids(inference), ids_es);
                }
                else {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)pph_phrase.$sym164$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                ids_es = (SubLObject)ConsesLow.cons(inference_datastructures_inference.inference_ids(inference), ids_es);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)pph_phrase.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (err_msg.isString() && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(err_msg), (SubLObject)pph_phrase.$str165$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            }
            finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
            }
            err_msg = (SubLObject)pph_phrase.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        }
        pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw166$INFERENCES, Sequences.nreverse(ids_es));
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw166$INFERENCES, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 57464L)
    public static SubLObject pph_phrase_inferences(final SubLObject phrase) {
        SubLObject inferences = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw166$INFERENCES, (SubLObject)pph_phrase.NIL);
        SubLObject ids = (SubLObject)pph_phrase.NIL;
        ids = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            final SubLObject inference = Functions.apply((SubLObject)pph_phrase.$sym167$FIND_INFERENCE_BY_IDS, ids);
            if (pph_phrase.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                inferences = (SubLObject)ConsesLow.cons(inference, inferences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ids = cdolist_list_var.first();
        }
        return Sequences.nreverse(inferences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 57774L)
    public static SubLObject pph_phrase_add_inference(final SubLObject phrase, final SubLObject inference) {
        return pph_phrase_set_inferences(phrase, (SubLObject)ConsesLow.cons(inference, pph_phrase_inferences(phrase)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 57929L)
    public static SubLObject pph_phrase_case(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw151$CASE, (SubLObject)pph_phrase.ZERO_INTEGER, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 58141L)
    public static SubLObject pph_phrase_set_case(final SubLObject phrase, final SubLObject v_case, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL != descend_into_metaP) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_case(dtr, v_case, descend_into_metaP);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        else {
            pph_phrase_set_case_low(phrase, v_case);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 58562L)
    public static SubLObject pph_phrase_set_case_low(final SubLObject phrase, final SubLObject v_case) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw151$CASE, (SubLObject)pph_phrase.ZERO_INTEGER, v_case);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 58690L)
    public static SubLObject pph_phrase_set_cases_recursively(final SubLObject phrase) {
        pph_phrase_set_object_case(phrase);
        pph_phrase_set_subject_case(phrase);
        pph_phrase_set_genitive_case(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 58946L)
    public static SubLObject pph_phrase_set_object_case(final SubLObject phrase) {
        SubLObject cdolist_list_var = pph_phrase_object_dtrs(phrase);
        SubLObject object_phrase = (SubLObject)pph_phrase.NIL;
        object_phrase = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            if (pph_phrase.NIL != pph_phrase_p(object_phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str168$__Setting_object_dtr_agr_to_accus, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                pph_phrase_set_case(object_phrase, (SubLObject)pph_phrase.$kw169$ACCUSATIVE, (SubLObject)pph_phrase.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            object_phrase = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 59319L)
    public static SubLObject pph_phrase_set_genitive_case(final SubLObject phrase) {
        SubLObject cdolist_list_var = pph_phrase_possessive_dtrs(phrase);
        SubLObject possessive_phrase = (SubLObject)pph_phrase.NIL;
        possessive_phrase = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            if (pph_phrase.NIL != pph_phrase_p(possessive_phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str170$__Setting_possessive_dtr_agr_to_g, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                pph_phrase_set_case(possessive_phrase, (SubLObject)pph_phrase.$kw171$GENITIVE, (SubLObject)pph_phrase.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            possessive_phrase = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 59712L)
    public static SubLObject pph_phrase_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = conses_high.union(pph_phrase_prepositional_object_dtrs(phrase), pph_phrase_verb_object_dtrs(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    object_dtrs = ConsesLow.append(object_dtrs, pph_phrase_object_dtrs(dtr));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return object_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 60152L)
    public static SubLObject pph_phrase_possessive_dtrs(final SubLObject phrase) {
        SubLObject possessive_dtrs = list_utilities.find_all(pph_phrase.$const172$PossessivePhrase, pph_phrase_dtr_list(phrase), Symbols.symbol_function((SubLObject)pph_phrase.EQL), Symbols.symbol_function((SubLObject)pph_phrase.$sym173$PPH_PHRASE_CATEGORY));
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    possessive_dtrs = ConsesLow.append(possessive_dtrs, pph_phrase_possessive_dtrs(dtr));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return possessive_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 60610L)
    public static SubLObject pph_phrase_prepositional_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_ppP(phrase) && pph_phrase.TWO_INTEGER.eql(pph_phrase_dtr_count(phrase))) {
            object_dtrs = (SubLObject)ConsesLow.cons(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ONE_INTEGER), object_dtrs);
        }
        return object_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 60953L)
    public static SubLObject pph_phrase_verb_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_clauseP(phrase) && pph_phrase.THREE_INTEGER.eql(pph_phrase_dtr_count(phrase)) && pph_phrase.NIL != pph_phrase_npP(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER)) && pph_phrase.ONE_INTEGER.eql(pph_phrase_head_dtr_num(phrase)) && pph_phrase.NIL != pph_transitive_verb_phraseP(pph_phrase_head_dtr(phrase)) && pph_phrase.NIL != pph_phrase_npP(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.TWO_INTEGER))) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str174$Dtr_2_of_phrase_is_object_of__S__, pph_phrase_wu(pph_phrase_head_dtr(phrase), (SubLObject)pph_phrase.UNPROVIDED), phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            object_dtrs = (SubLObject)ConsesLow.cons(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.TWO_INTEGER), object_dtrs);
        }
        return object_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 61789L)
    public static SubLObject pph_transitive_verb_phraseP(final SubLObject phrase) {
        final SubLObject wu = pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_wu_p(wu) && pph_phrase.NIL != pph_utilities.pph_genlP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const175$Verb, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != subl_promotions.memberP(pph_phrase.$const176$TransitiveNPFrame, lexicon_accessors.frames_of_wordXpos(wu, pph_phrase.$const175$Verb), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 62078L)
    public static SubLObject pph_phrase_set_subject_case(final SubLObject phrase) {
        final SubLObject subject_phrase = pph_phrase_subject_dtr(phrase);
        if (pph_phrase.NIL != pph_phrase_p(subject_phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str177$__Setting_subject_dtr_agr_to_nomi, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            pph_phrase_set_case(subject_phrase, (SubLObject)pph_phrase.$kw178$NOMINATIVE, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 62460L)
    public static SubLObject pph_phrase_subject_dtr(final SubLObject phrase) {
        if (pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        final SubLObject head_dtr = (SubLObject)(head_dtr_num.isInteger() ? pph_phrase_nth_dtr(phrase, head_dtr_num) : pph_phrase.NIL);
        if (pph_phrase.NIL == head_dtr) {
            final SubLObject possible_subject = pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER);
            if (pph_phrase.NIL != pph_phrase_npP(possible_subject) && pph_phrase_dtr_count(phrase).numG((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL != pph_phrase_starts_with_verbP(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ONE_INTEGER))) {
                return possible_subject;
            }
        }
        else {
            if (pph_phrase.NIL != pph_phrase_head_verbP(head_dtr)) {
                return pph_phrase_resolution.pph_phrase_agr_target_phrase(head_dtr, phrase);
            }
            if (pph_phrase.NIL != pph_phrase_sP(head_dtr)) {
                return pph_phrase_subject_dtr(head_dtr);
            }
        }
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase_case(dtr).eql((SubLObject)pph_phrase.$kw178$NOMINATIVE)) {
                    return dtr;
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 63477L)
    public static SubLObject pph_phrase_starts_with_verbP(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_phrase_verbP(phrase)) {
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_phrase_doneP(phrase) && pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_variable_handling.pph_string_is_posP(pph_string.pph_string_tokenize(pph_phrase_string(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED).first(), pph_phrase.$const175$Verb, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase) && pph_phrase.NIL != pph_phrase_starts_with_verbP(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER))) {
            return (SubLObject)pph_phrase.T;
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 63870L)
    public static SubLObject pph_phrase_subjectP(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_phrase_p(phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject mother = pph_phrase_mother(phrase);
            if (pph_phrase.NIL != mother) {
                return Equality.equal(phrase, pph_phrase_subject_dtr(mother));
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 64100L)
    public static SubLObject pph_phrase_top_level_problem_dictionary(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw152$PROBLEM_DICTIONARY, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 64290L)
    public static SubLObject pph_phrase_find_or_create_top_level_problem_dictionary(final SubLObject phrase) {
        SubLObject v_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        if (pph_phrase.NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_phrase.EQL), (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_top_level_problem_dictionary(phrase, v_dictionary);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 64626L)
    public static SubLObject pph_phrase_set_top_level_problem_dictionary(final SubLObject phrase, final SubLObject v_dictionary) {
        pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw152$PROBLEM_DICTIONARY, v_dictionary);
        return pph_phrase_top_level_problem_dictionary(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 64829L)
    public static SubLObject pph_phrase_maybe_dump_problem_reports(final SubLObject phrase, SubLObject top_level_onlyP) {
        if (top_level_onlyP == pph_phrase.UNPROVIDED) {
            top_level_onlyP = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != dictionary.dictionary_p(pph_vars.$pph_problem_reports$.getDynamicValue(thread))) {
            pph_phrase_dump_problem_reports(phrase, top_level_onlyP);
        }
        return pph_vars.$pph_problem_reports$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 65146L)
    public static SubLObject pph_phrase_add_problems(final SubLObject from_phrase, final SubLObject to_phrase) {
        final SubLObject to_phrase_problem_dictionary = pph_phrase_find_or_create_top_level_problem_dictionary(to_phrase);
        final SubLObject from_phrase_problem_dictionary = pph_phrase_compile_problem_dictionary(from_phrase);
        pph_merge_problem_dictionary(from_phrase_problem_dictionary, to_phrase_problem_dictionary);
        return to_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 65583L)
    public static SubLObject pph_phrase_dump_problem_reports(final SubLObject phrase, final SubLObject top_level_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase_problem_dictionary = (pph_phrase.NIL != top_level_onlyP) ? pph_phrase_top_level_problem_dictionary(phrase) : pph_phrase_compile_problem_dictionary(phrase);
        pph_merge_problem_dictionary(phrase_problem_dictionary, pph_vars.$pph_problem_reports$.getDynamicValue(thread));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 65996L)
    public static SubLObject pph_phrase_compile_problem_dictionary(final SubLObject v_pph_phrase) {
        final SubLObject top_level_problem_dictionary = pph_phrase_top_level_problem_dictionary(v_pph_phrase);
        final SubLObject phrase_problem_dictionary = (pph_phrase.NIL != dictionary.dictionary_p(top_level_problem_dictionary)) ? dictionary_utilities.copy_dictionary(top_level_problem_dictionary) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_phrase.EQ), (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject phrase_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(v_pph_phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_problem_dictionary;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                dtr_problem_dictionary = pph_phrase_compile_problem_dictionary(dtr);
                pph_merge_problem_dictionary(dtr_problem_dictionary, phrase_problem_dictionary);
                phrase_num = Numbers.add(phrase_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return phrase_problem_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 66591L)
    public static SubLObject pph_merge_problem_dictionary(final SubLObject from, final SubLObject to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(from)); pph_phrase.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject reporter = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pph_problems = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pph_problems;
            SubLObject pph_problem = (SubLObject)pph_phrase.NIL;
            pph_problem = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                note_pph_problem(to, reporter, pph_problem);
                cdolist_list_var = cdolist_list_var.rest();
                pph_problem = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return to;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 66834L)
    public static SubLObject pph_phrase_reporter_problems(final SubLObject phrase, final SubLObject reporter) {
        final SubLObject problem_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        SubLObject problems = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != dictionary.dictionary_p(problem_dictionary)) {
            problems = dictionary.dictionary_lookup(problem_dictionary, reporter, (SubLObject)pph_phrase.NIL);
        }
        return problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 67240L)
    public static SubLObject pph_phrase_maybe_note_problem(final SubLObject phrase, final SubLObject reporter, final SubLObject problem_type, SubLObject other_info) {
        if (other_info == pph_phrase.UNPROVIDED) {
            other_info = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_vars.pph_problem_reporting_on_p()) {
            pph_phrase_note_problem(phrase, reporter, problem_type, other_info);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 67741L)
    public static SubLObject pph_phrase_note_problem(final SubLObject phrase, final SubLObject reporter, final SubLObject problem_type, final SubLObject other_info) {
        SubLObject problem_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        if (pph_phrase.NIL == dictionary.dictionary_p(problem_dictionary)) {
            problem_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_phrase.EQ), (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_top_level_problem_dictionary(phrase, problem_dictionary);
        }
        return pph_note_problem(problem_dictionary, reporter, problem_type, other_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 68255L)
    public static SubLObject pph_note_problem(final SubLObject problem_dictionary, final SubLObject reporter, final SubLObject problem_type, final SubLObject other_info) {
        final SubLObject problem = new_pph_problem(problem_type, other_info);
        return note_pph_problem(problem_dictionary, reporter, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 68603L)
    public static SubLObject note_pph_problem(final SubLObject problem_dictionary, final SubLObject reporter, final SubLObject problem) {
        dictionary_utilities.dictionary_pushnew(problem_dictionary, reporter, problem, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), (SubLObject)pph_phrase.UNPROVIDED);
        return Values.values(problem, problem_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 68939L)
    public static SubLObject pph_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && pph_phrase.NIL != pph_problem_type_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 69052L)
    public static SubLObject pph_problem_string(final SubLObject reporter, final SubLObject pph_problem) {
        SubLObject problem_type = (SubLObject)pph_phrase.NIL;
        SubLObject other_info = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pph_problem, pph_problem, (SubLObject)pph_phrase.$list179);
        problem_type = pph_problem.first();
        final SubLObject current = other_info = pph_problem.rest();
        return Sequences.cconcatenate(format_nil.format_nil_s_no_copy(reporter), new SubLObject[] { pph_phrase.$str180$_reported_a_, format_nil.format_nil_s_no_copy(problem_type), pph_phrase.$str181$_problem, format_nil.format_nil_a_no_copy((SubLObject)((pph_phrase.NIL != other_info) ? Sequences.cconcatenate((SubLObject)pph_phrase.$str182$_with_this_additional_info_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_phrase.$str183$_, format_nil.format_nil_s_no_copy(other_info) }) : pph_phrase.$str184$_)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 69355L)
    public static SubLObject new_pph_problem(final SubLObject type, SubLObject other_info) {
        if (other_info == pph_phrase.UNPROVIDED) {
            other_info = (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)ConsesLow.cons(type, other_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 69532L)
    public static SubLObject pph_problem_type_p(final SubLObject v_object) {
        return Types.keywordp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 69616L)
    public static SubLObject pph_phrase_suid(final SubLObject phrase) {
        return document.sign_offset(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 69854L)
    public static SubLObject pph_phrase_set_suid(final SubLObject phrase, final SubLObject suid) {
        if (pph_phrase.NIL != suid) {}
        if (suid.isInteger()) {
            pph_data_structures.pph_phrase_id_index_enter(phrase, suid);
        }
        return pph_phrase_set_suid_low(phrase, suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 70122L)
    public static SubLObject pph_phrase_set_suid_low(final SubLObject phrase, final SubLObject suid) {
        document._csetf_sign_offset(phrase, suid);
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 70227L)
    public static SubLObject pph_phrase_free_suid(final SubLObject phrase) {
        return pph_phrase_set_suid_low(phrase, (SubLObject)pph_phrase.$kw148$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 70477L)
    public static SubLObject pph_phrase_do_alternatives(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list186);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject alternative = (SubLObject)pph_phrase.NIL;
        SubLObject direct_alternative_of = (SubLObject)pph_phrase.NIL;
        SubLObject phrase = (SubLObject)pph_phrase.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list186);
        alternative = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list186);
        direct_alternative_of = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_phrase.$list186);
        phrase = current.first();
        current = current.rest();
        if (pph_phrase.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject queue = (SubLObject)pph_phrase.$sym187$QUEUE;
            final SubLObject done_count = (SubLObject)pph_phrase.$sym188$DONE_COUNT;
            return (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(queue, (SubLObject)pph_phrase.$list189), reader.bq_cons(done_count, (SubLObject)pph_phrase.$list4)), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym190$ENQUEUE, phrase, queue), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym191$UNTIL, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym192$QUEUE_EMPTY_P, queue), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(direct_alternative_of, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym193$DEQUEUE, queue))), (SubLObject)ConsesLow.listS((SubLObject)pph_phrase.$sym194$CDOLIST, (SubLObject)ConsesLow.list(alternative, (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym195$PPH_PHRASE_LOCAL_ALTERNATIVES, direct_alternative_of)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym9$CINC, done_count), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym5$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)pph_phrase.$sym196$__, done_count, (SubLObject)pph_phrase.$list197), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym198$PPH_ERROR, (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.$str199$Done__S_alternatives_of__S, done_count, phrase)), (SubLObject)ConsesLow.list((SubLObject)pph_phrase.$sym190$ENQUEUE, alternative, queue)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_phrase.$list186);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 71081L)
    public static SubLObject pph_phrase_alternatives(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alternatives = (SubLObject)pph_phrase.NIL;
        final SubLObject queue = queues.create_queue((SubLObject)pph_phrase.UNPROVIDED);
        SubLObject done_count = (SubLObject)pph_phrase.ZERO_INTEGER;
        queues.enqueue(phrase, queue);
        while (pph_phrase.NIL == queues.queue_empty_p(queue)) {
            final SubLObject ignore_me = queues.dequeue(queue);
            SubLObject cdolist_list_var = pph_phrase_local_alternatives(ignore_me);
            SubLObject alternative = (SubLObject)pph_phrase.NIL;
            alternative = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                final SubLObject item_var = alternative;
                if (pph_phrase.NIL == conses_high.member(item_var, alternatives, Symbols.symbol_function((SubLObject)pph_phrase.EQ), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                    alternatives = (SubLObject)ConsesLow.cons(item_var, alternatives);
                }
                done_count = Numbers.add(done_count, (SubLObject)pph_phrase.ONE_INTEGER);
                if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str199$Done__S_alternatives_of__S) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, phrase));
                }
                queues.enqueue(alternative, queue);
                cdolist_list_var = cdolist_list_var.rest();
                alternative = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(alternatives);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 71308L)
    public static SubLObject pph_phrase_local_alternatives(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_meta_phrase_p(phrase)) {
            return pph_phrase_local_alternatives(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER));
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw159$ALTERNATIVES, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 71563L)
    public static SubLObject pph_phrase_set_alternatives(final SubLObject phrase, final SubLObject alternatives) {
        return pph_phrase_set_alternatives_low(phrase, alternatives);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 71784L)
    public static SubLObject pph_phrase_set_alternatives_low(final SubLObject phrase, final SubLObject alternatives) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw159$ALTERNATIVES, (SubLObject)pph_phrase.TWO_INTEGER, alternatives);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 71946L)
    public static SubLObject pph_phrase_add_alternative(final SubLObject phrase, final SubLObject alternative) {
        pph_phrase_set_alternatives(phrase, (SubLObject)ConsesLow.cons(alternative, pph_phrase_local_alternatives(phrase)));
        pph_phrase_set_mother(alternative, phrase);
        pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(alternative);
        return alternative;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 72636L)
    public static SubLObject pph_phrase_remove_alternative(final SubLObject phrase, final SubLObject alternative) {
        pph_phrase_set_alternatives(phrase, Sequences.remove(alternative, pph_phrase_local_alternatives(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
        return alternative;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 72912L)
    public static SubLObject pph_phrase_free_alternatives(final SubLObject phrase) {
        return pph_phrase_set_alternatives_low(phrase, (SubLObject)pph_phrase.$kw148$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73058L)
    public static SubLObject pph_phrase_mother(final SubLObject phrase) {
        return document.sign_mother(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73231L)
    public static SubLObject pph_phrase_set_mother(final SubLObject phrase, final SubLObject mother) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != mother && phrase.eql(mother) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str200$Setting_phrase_s_mother_to_itself);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        pph_phrase_set_mother_low(phrase, mother);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73541L)
    public static SubLObject pph_phrase_free_mother(final SubLObject phrase) {
        return pph_phrase_set_mother_low(phrase, (SubLObject)pph_phrase.$kw148$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73681L)
    public static SubLObject pph_phrase_set_mother_low(final SubLObject phrase, final SubLObject mother) {
        document._csetf_sign_mother(phrase, mother);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 73891L)
    public static SubLObject pph_phrase_logical_mother(final SubLObject phrase) {
        SubLObject mother = pph_phrase_mother(phrase);
        for (SubLObject seen = set.new_set((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED); pph_phrase.NIL != pph_meta_phrase_p(mother) && pph_phrase.NIL == set.set_memberP(mother, seen); mother = pph_phrase_mother(mother)) {
            set.set_add(mother, seen);
        }
        return mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 74271L)
    public static SubLObject pph_phrase_maximal_projection(final SubLObject phrase) {
        SubLObject projection = phrase;
        SubLObject mother = pph_phrase_mother(phrase);
        final SubLObject seen = set.new_set((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        while (pph_phrase.NIL != pph_phrase_head_dtrP(projection, mother)) {
            set.set_add(mother, seen);
            projection = mother;
            mother = pph_phrase_mother(projection);
        }
        return projection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 74699L)
    public static SubLObject pph_verb_find_sentential_mother(final SubLObject phrase) {
        SubLObject mother = pph_phrase_logical_mother(phrase);
        for (SubLObject seen = set.new_set((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED); pph_phrase.NIL != pph_phrase_p(mother, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == set.set_memberP(mother, seen) && pph_phrase.NIL != pph_phrase_category(mother, (SubLObject)pph_phrase.UNPROVIDED) && !pph_phrase.$const201$NLSentence.eql(pph_phrase_category(mother, (SubLObject)pph_phrase.UNPROVIDED)); mother = pph_phrase_logical_mother(mother)) {
            set.set_add(mother, seen);
        }
        if (pph_phrase.NIL == mother) {
            mother = pph_phrase_logical_mother(phrase);
        }
        return mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 75285L)
    public static SubLObject pph_phrase_root_mother(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mother = (SubLObject)pph_phrase.NIL;
        final SubLObject _prev_bind_0 = pph_phrase.$pph_root_mother_list$.currentBinding(thread);
        try {
            pph_phrase.$pph_root_mother_list$.bind((SubLObject)pph_phrase.NIL, thread);
            mother = pph_phrase_find_root_mother(phrase);
        }
        finally {
            pph_phrase.$pph_root_mother_list$.rebind(_prev_bind_0, thread);
        }
        return mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 75557L)
    public static SubLObject pph_phrase_find_root_mother(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject my_mother = pph_phrase_mother(phrase);
        if (pph_phrase.NIL != conses_high.member(my_mother, pph_phrase.$pph_root_mother_list$.getDynamicValue(thread), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase.$str202$Mother_is_part_of_cycle___S, my_mother);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return my_mother;
        }
        if (pph_phrase.NIL != pph_phrase_p(my_mother, (SubLObject)pph_phrase.UNPROVIDED)) {
            pph_phrase.$pph_root_mother_list$.setDynamicValue((SubLObject)ConsesLow.cons(my_mother, pph_phrase.$pph_root_mother_list$.getDynamicValue(thread)), thread);
            return pph_phrase_find_root_mother(my_mother);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 76057L)
    public static SubLObject pph_phrase_root_mother_cycl(final SubLObject phrase) {
        final SubLObject root_mother = pph_phrase_root_mother(phrase);
        return pph_phrase_cycl(root_mother, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 76211L)
    public static SubLObject pph_phrase_ancestor_p(final SubLObject higher, final SubLObject lower) {
        final SubLObject mother = pph_phrase_mother(lower);
        if (pph_phrase.NIL == pph_phrase_p(mother, (SubLObject)pph_phrase.UNPROVIDED)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (higher.eql(mother)) {
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_phrase_ancestor_p(higher, mother)) {
            return (SubLObject)pph_phrase.T;
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 76496L)
    public static SubLObject pph_phrase_descendant_p(final SubLObject lower, final SubLObject higher) {
        return pph_phrase_ancestor_p(higher, lower);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 76600L)
    public static SubLObject pph_phrase_has_ancestor_of_categoryP(final SubLObject phrase, final SubLObject category) {
        final SubLObject mother = pph_phrase_mother(phrase);
        if (pph_phrase.NIL == pph_phrase_p(mother, (SubLObject)pph_phrase.UNPROVIDED)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (category.equal(pph_phrase_category(mother, (SubLObject)pph_phrase.T))) {
            return (SubLObject)pph_phrase.T;
        }
        return pph_phrase_has_ancestor_of_categoryP(mother, category);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 76925L)
    public static SubLObject pph_phrase_justification(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_justification(document.sign_info(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 77237L)
    public static SubLObject pph_phrase_set_justification(final SubLObject phrase, final SubLObject just) {
        pph_data_structures._csetf_pph_phrase_info_justification(document.sign_info(phrase), just);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 77420L)
    public static SubLObject pph_phrase_add_justification(final SubLObject phrase, final SubLObject just) {
        if (pph_phrase.NIL == just) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str203$PPH_PHRASE_ADD_JUSTIFICATION_pass) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject phrase_just = pph_phrase_justification(phrase);
        if (pph_phrase.NIL == conses_high.member(just, phrase_just, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
            phrase_just = (SubLObject)ConsesLow.cons(just, phrase_just);
        }
        pph_phrase_set_justification(phrase, Sequences.nreverse(phrase_just));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 77775L)
    public static SubLObject pph_phrase_add_justifications_from_phrase(final SubLObject target_phrase, final SubLObject destination_phrase) {
        SubLObject cdolist_list_var = pph_phrase_justification(destination_phrase);
        SubLObject just = (SubLObject)pph_phrase.NIL;
        just = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            pph_phrase_add_justification(target_phrase, just);
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return target_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 78013L)
    public static SubLObject pph_phrase_add_justifications_from_item(final SubLObject target_phrase, final SubLObject output_item) {
        SubLObject cdolist_list_var = pph_data_structures.pph_phrase_output_item_justification(output_item);
        SubLObject just = (SubLObject)pph_phrase.NIL;
        just = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            pph_phrase_add_justification(target_phrase, just);
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return target_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 78247L)
    public static SubLObject pph_code_justification(final SubLObject symbol, SubLObject more_info) {
        if (more_info == pph_phrase.UNPROVIDED) {
            more_info = (SubLObject)pph_phrase.NIL;
        }
        assert pph_phrase.NIL != Types.symbolp(symbol) : symbol;
        assert pph_phrase.NIL != Types.listp(more_info) : more_info;
        return (SubLObject)ConsesLow.cons((SubLObject)pph_phrase.$kw206$CODE, (SubLObject)ConsesLow.cons(symbol, more_info));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 78425L)
    public static SubLObject pph_nl_generation_cache_justification() {
        return pph_code_justification((SubLObject)pph_phrase.$sym207$NL_GENERATION_CACHE_METHOD, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 78544L)
    public static SubLObject pph_phrase_gather_supports(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL == pph_phrase_doneP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        SubLObject supports = list_utilities.remove_if_not((SubLObject)pph_phrase.$sym208$SUPPORT_P, pph_phrase_justification(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                supports = ConsesLow.nconc(supports, pph_phrase_gather_supports(dtr));
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        if (pph_phrase.NIL != list_utilities.empty_list_p(supports) && pph_phrase.NIL != pph_types.pph_lexical_wordP(pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hlmt_czer.canonicalize_hlmt((SubLObject)ConsesLow.list(pph_phrase.$const209$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread))));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                supports = (SubLObject)ConsesLow.cons(removal_modules_lexicon.make_word_strings_support(el_utilities.make_binary_formula(pph_phrase_agr_pred(phrase), pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL))), supports);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.delete_duplicates(supports, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.$sym210$SUPPORT_SENTENCE), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 79411L)
    public static SubLObject pph_phrase_all_variant_dtr_lists(final SubLObject phrase, SubLObject equality_test, SubLObject recursiveP) {
        if (equality_test == pph_phrase.UNPROVIDED) {
            equality_test = (SubLObject)pph_phrase.$sym211$PPH_VARIANT_STRING__;
        }
        if (recursiveP == pph_phrase.UNPROVIDED) {
            recursiveP = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dtr_variants = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_variant_lists = (SubLObject)pph_phrase.NIL;
        final SubLObject arbitrary_cutoff = pph_phrase.$pph_variant_list_max_count$.getDynamicValue(thread);
        if (pph_phrase.NIL == pph_macros.pph_timeout_time_reachedP()) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject this_dtr_variants;
                SubLObject variant_lists;
                SubLObject nospace_variant_lists;
                SubLObject cdolist_list_var;
                SubLObject variant_list;
                SubLObject nospace_variant_list;
                SubLObject cdolist_list_var_$5;
                SubLObject variant;
                SubLObject cdolist_list_var2;
                SubLObject alternate;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    this_dtr_variants = (SubLObject)pph_phrase.NIL;
                    if (pph_phrase.NIL != pph_nospace_phrase_p(dtr)) {
                        variant_lists = pph_phrase_all_variant_dtr_lists(dtr, equality_test, (SubLObject)pph_phrase.T);
                        nospace_variant_lists = (SubLObject)pph_phrase.NIL;
                        cdolist_list_var = variant_lists;
                        variant_list = (SubLObject)pph_phrase.NIL;
                        variant_list = cdolist_list_var.first();
                        while (pph_phrase.NIL != cdolist_list_var) {
                            nospace_variant_list = (SubLObject)pph_phrase.NIL;
                            cdolist_list_var_$5 = variant_list;
                            variant = (SubLObject)pph_phrase.NIL;
                            variant = cdolist_list_var_$5.first();
                            while (pph_phrase.NIL != cdolist_list_var_$5) {
                                nospace_variant_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)pph_phrase.$kw74$NOSPACE, variant), nospace_variant_list);
                                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                variant = cdolist_list_var_$5.first();
                            }
                            nospace_variant_lists = (SubLObject)ConsesLow.cons(Sequences.nreverse(nospace_variant_list), nospace_variant_lists);
                            cdolist_list_var = cdolist_list_var.rest();
                            variant_list = cdolist_list_var.first();
                        }
                        this_dtr_variants = Sequences.nreverse(nospace_variant_lists);
                    }
                    else if (pph_phrase.NIL != pph_meta_phrase_p(dtr)) {
                        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_phrase.$str212$Ignoring_possible_variants_for_me, dtr);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        dtr_variants = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(dtr), dtr_variants);
                    }
                    else {
                        cdolist_list_var2 = (SubLObject)ConsesLow.cons(dtr, pph_phrase_alternatives(dtr));
                        alternate = (SubLObject)pph_phrase.NIL;
                        alternate = cdolist_list_var2.first();
                        while (pph_phrase.NIL != cdolist_list_var2) {
                            if (pph_phrase.NIL != pph_phrase_doneP(alternate)) {
                                if (pph_phrase.NIL != pph_phrase_has_dtrsP(alternate)) {
                                    this_dtr_variants = ConsesLow.append(this_dtr_variants, pph_phrase_all_variant_dtr_lists(alternate, equality_test, (SubLObject)pph_phrase.T));
                                }
                                else {
                                    this_dtr_variants = (SubLObject)ConsesLow.cons(alternate, this_dtr_variants);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            alternate = cdolist_list_var2.first();
                        }
                    }
                    dtr_variants = (SubLObject)ConsesLow.cons(list_utilities.delete_duplicates_from_start(this_dtr_variants, equality_test, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), dtr_variants);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        if (pph_phrase.NIL == recursiveP) {
            SubLObject clean = (SubLObject)pph_phrase.NIL;
            SubLObject cdolist_list_var3 = dtr_variants;
            SubLObject dtr_variant = (SubLObject)pph_phrase.NIL;
            dtr_variant = cdolist_list_var3.first();
            while (pph_phrase.NIL != cdolist_list_var3) {
                clean = (SubLObject)ConsesLow.cons(Sequences.remove_if((SubLObject)pph_phrase.$sym213$VARIANT_HAS_MISSING_TARGET_, dtr_variant, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), clean);
                cdolist_list_var3 = cdolist_list_var3.rest();
                dtr_variant = cdolist_list_var3.first();
            }
            dtr_variants = Sequences.nreverse(clean);
        }
        SubLObject cdolist_list_var3;
        final SubLObject variant_lists2 = cdolist_list_var3 = list_utilities.cartesian_product(Sequences.nreverse(dtr_variants), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject variant_list2 = (SubLObject)pph_phrase.NIL;
        variant_list2 = cdolist_list_var3.first();
        while (pph_phrase.NIL != cdolist_list_var3) {
            dtr_variant_lists = (SubLObject)ConsesLow.cons(variant_list2, dtr_variant_lists);
            cdolist_list_var3 = cdolist_list_var3.rest();
            variant_list2 = cdolist_list_var3.first();
        }
        maybe_warn_about_dtr_variant_lists(dtr_variant_lists, arbitrary_cutoff, phrase);
        return Sequences.subseq(dtr_variant_lists, (SubLObject)pph_phrase.ZERO_INTEGER, Numbers.min(Sequences.length(dtr_variant_lists), arbitrary_cutoff));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 81689L)
    public static SubLObject maybe_warn_about_dtr_variant_lists(final SubLObject dtr_variant_lists, final SubLObject arbitrary_cutoff, final SubLObject phrase) {
        if ((pph_phrase.NIL == arbitrary_cutoff || arbitrary_cutoff.numG((SubLObject)pph_phrase.TEN_INTEGER)) && pph_phrase.NIL != list_utilities.lengthG(dtr_variant_lists, (SubLObject)pph_phrase.TEN_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)) {
            SubLObject phrase_to_try;
            SubLObject cycl;
            for (phrase_to_try = phrase, cycl = pph_phrase_cycl(phrase_to_try, (SubLObject)pph_phrase.UNPROVIDED); pph_phrase.NIL == pph_known_cycl_p(cycl) && pph_phrase.NIL != pph_phrase_mother(phrase_to_try); phrase_to_try = pph_phrase_mother(phrase_to_try), cycl = pph_phrase_cycl(phrase_to_try, (SubLObject)pph_phrase.UNPROVIDED)) {}
            Errors.warn((SubLObject)pph_phrase.$str214$Generated__D_dtr_variant_lists_fo, Sequences.length(dtr_variant_lists), (SubLObject)((pph_phrase.NIL != pph_known_cycl_p(cycl)) ? cycl : pph_phrase.$str215$current_phrase));
            format_nil.print_one_per_line(Mapping.mapcar((SubLObject)pph_phrase.$sym216$PPH_VARIANT_STRING, list_utilities.first_n((SubLObject)pph_phrase.TEN_INTEGER, dtr_variant_lists)), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 82402L)
    public static SubLObject variant_has_missing_targetP(final SubLObject variant, SubLObject variant_list) {
        if (variant_list == pph_phrase.UNPROVIDED) {
            variant_list = variant;
        }
        SubLObject missingP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_p(variant, (SubLObject)pph_phrase.UNPROVIDED)) {
            if (pph_phrase.NIL != variant_phrase_has_missing_targetP(variant, variant_list)) {
                missingP = (SubLObject)pph_phrase.T;
            }
        }
        else if (variant.isList() && pph_phrase.NIL == missingP) {
            SubLObject csome_list_var = variant;
            SubLObject sub = (SubLObject)pph_phrase.NIL;
            sub = csome_list_var.first();
            while (pph_phrase.NIL == missingP && pph_phrase.NIL != csome_list_var) {
                if (pph_phrase.NIL != variant_has_missing_targetP(sub, variant_list)) {
                    missingP = (SubLObject)pph_phrase.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        return missingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 82808L)
    public static SubLObject variant_phrase_has_missing_targetP(final SubLObject variant, final SubLObject variant_list) {
        final SubLObject missingP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(pph_phrase_resolution.pph_phrase_relative_agr_target(variant), (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == list_utilities.tree_find(pph_phrase_resolution.pph_phrase_relative_agr_target(variant), variant_list, (SubLObject)pph_phrase.$sym217$PPH_ANCESTOR_PHRASE_OR_SELF_P, (SubLObject)pph_phrase.UNPROVIDED));
        return missingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 83103L)
    public static SubLObject pph_ancestor_phrase_or_self_p(final SubLObject higher, final SubLObject lower) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(lower, (SubLObject)pph_phrase.UNPROVIDED) && (lower.eql(higher) || pph_phrase.NIL != pph_phrase_ancestor_p(higher, lower)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 83283L)
    public static SubLObject pph_phrase_all_strings(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_phrase.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_doneP(phrase)) {
            if (pph_phrase.NIL != pph_nospace_phrase_p(phrase) || (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase) && pph_phrase.NIL == pph_meta_phrase_p(phrase))) {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                SubLObject cdolist_list_var = pph_phrase_all_variant_dtr_lists(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                SubLObject big_alternative_phrase_list = (SubLObject)pph_phrase.NIL;
                big_alternative_phrase_list = cdolist_list_var.first();
                while (pph_phrase.NIL != cdolist_list_var) {
                    SubLObject dtr_strings = (SubLObject)pph_phrase.NIL;
                    SubLObject cdolist_list_var_$6 = big_alternative_phrase_list;
                    SubLObject variant = (SubLObject)pph_phrase.NIL;
                    variant = cdolist_list_var_$6.first();
                    while (pph_phrase.NIL != cdolist_list_var_$6) {
                        final SubLObject string = pph_variant_string(variant, add_tagsP, phrase);
                        dtr_strings = (SubLObject)ConsesLow.cons(string, dtr_strings);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        variant = cdolist_list_var_$6.first();
                    }
                    final SubLObject string2 = pph_utilities.clean_bunge_nreverse(dtr_strings, (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == nospaceP));
                    if (pph_phrase.NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                        SubLObject supports = list_utilities.remove_if_not((SubLObject)pph_phrase.$sym208$SUPPORT_P, pph_phrase_justification(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                        SubLObject cdolist_list_var_$7 = list_utilities.tree_gather(big_alternative_phrase_list, (SubLObject)pph_phrase.$sym218$PPH_PHRASE_P, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                        SubLObject variant_phrase = (SubLObject)pph_phrase.NIL;
                        variant_phrase = cdolist_list_var_$7.first();
                        while (pph_phrase.NIL != cdolist_list_var_$7) {
                            final SubLObject items_var = pph_phrase_gather_supports(variant_phrase);
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                                    item = Vectors.aref(vector_var, element_num);
                                    supports = (SubLObject)ConsesLow.cons(item, supports);
                                }
                            }
                            else {
                                SubLObject cdolist_list_var_$8 = items_var;
                                SubLObject item2 = (SubLObject)pph_phrase.NIL;
                                item2 = cdolist_list_var_$8.first();
                                while (pph_phrase.NIL != cdolist_list_var_$8) {
                                    supports = (SubLObject)ConsesLow.cons(item2, supports);
                                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                    item2 = cdolist_list_var_$8.first();
                                }
                            }
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            variant_phrase = cdolist_list_var_$7.first();
                        }
                        pph_phrase_resolution.maybe_throw_pph_hl_supports(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), string2, pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED), Sequences.delete_duplicates(supports, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.$sym210$SUPPORT_SENTENCE), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
                    }
                    final SubLObject item_var = string2;
                    if (pph_phrase.NIL == conses_high.member(item_var, strings, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                        strings = (SubLObject)ConsesLow.cons(item_var, strings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    big_alternative_phrase_list = cdolist_list_var.first();
                }
            }
            final SubLObject queue = queues.create_queue((SubLObject)pph_phrase.UNPROVIDED);
            SubLObject done_count = (SubLObject)pph_phrase.ZERO_INTEGER;
            queues.enqueue(phrase, queue);
            while (pph_phrase.NIL == queues.queue_empty_p(queue)) {
                final SubLObject ignore_me = queues.dequeue(queue);
                SubLObject cdolist_list_var2 = pph_phrase_local_alternatives(ignore_me);
                SubLObject alternative = (SubLObject)pph_phrase.NIL;
                alternative = cdolist_list_var2.first();
                while (pph_phrase.NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$9 = pph_alternative_phrase_strings(alternative, add_tagsP);
                    SubLObject alternative_string = (SubLObject)pph_phrase.NIL;
                    alternative_string = cdolist_list_var_$9.first();
                    while (pph_phrase.NIL != cdolist_list_var_$9) {
                        if (pph_phrase.NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                            final SubLObject supports2 = list_utilities.remove_if_not((SubLObject)pph_phrase.$sym208$SUPPORT_P, pph_phrase_gather_supports(alternative), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                            pph_phrase_resolution.maybe_throw_pph_hl_supports(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), alternative_string, pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED), Sequences.delete_duplicates(supports2, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.$sym210$SUPPORT_SENTENCE), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
                        }
                        final SubLObject item_var2 = alternative_string;
                        if (pph_phrase.NIL == conses_high.member(item_var2, strings, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                            strings = (SubLObject)ConsesLow.cons(item_var2, strings);
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        alternative_string = cdolist_list_var_$9.first();
                    }
                    done_count = Numbers.add(done_count, (SubLObject)pph_phrase.ONE_INTEGER);
                    if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str199$Done__S_alternatives_of__S) });
                        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, phrase));
                    }
                    queues.enqueue(alternative, queue);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    alternative = cdolist_list_var2.first();
                }
            }
            final SubLObject item_var3 = pph_phrase_string(phrase, add_tagsP);
            if (pph_phrase.NIL == conses_high.member(item_var3, strings, Symbols.symbol_function((SubLObject)pph_phrase.EQUAL), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                strings = (SubLObject)ConsesLow.cons(item_var3, strings);
            }
        }
        return Sequences.nreverse(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 85170L)
    public static SubLObject pph_variant_string_E_internal(final SubLObject variant1, final SubLObject variant2) {
        return Equality.equal(pph_variant_string(variant1, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), pph_variant_string(variant2, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 85170L)
    public static SubLObject pph_variant_string_E(final SubLObject variant1, final SubLObject variant2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == v_memoization_state) {
            return pph_variant_string_E_internal(variant1, variant2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_phrase.$sym211$PPH_VARIANT_STRING__, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_phrase.$sym211$PPH_VARIANT_STRING__, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.EQUAL, (SubLObject)pph_phrase.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_phrase.$sym211$PPH_VARIANT_STRING__, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(variant1, variant2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (variant1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && variant2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_variant_string_E_internal(variant1, variant2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(variant1, variant2));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 85324L)
    public static SubLObject pph_variant_string_internal(final SubLObject variant, SubLObject add_tagsP, SubLObject matrix_phrase) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_phrase.NIL;
        }
        if (matrix_phrase == pph_phrase.UNPROVIDED) {
            matrix_phrase = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_p(variant, (SubLObject)pph_phrase.UNPROVIDED)) {
            if (pph_phrase.NIL == pph_phrase_doneP(variant)) {
                pph_phrase_resolution.pph_phrase_get_string(variant, pph_phrase_cycl(variant, (SubLObject)pph_phrase.UNPROVIDED), matrix_phrase);
            }
            final SubLObject string = pph_phrase_string(variant, add_tagsP);
            if (pph_phrase.NIL == pph_string.pph_string_p(string)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str219$Failed_to_get_string_for_variant_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(variant));
            }
            pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(variant);
            return string;
        }
        if (pph_phrase.NIL != pattern_match.tree_matches_pattern(variant, (SubLObject)pph_phrase.$list220)) {
            SubLObject result = (SubLObject)pph_phrase.$str10$;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = (SubLObject)pph_phrase.NIL;
            sub = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                result = pph_string.pph_string_concatenate(result, pph_variant_string(sub, add_tagsP, (SubLObject)pph_phrase.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
            return result;
        }
        if (variant.first().eql(variant)) {
            final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str221$Auto_nested_PPH_phrase_variant__M) });
            pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(matrix_phrase));
        }
        else if (pph_phrase.NIL != car_nesting_depth_G(variant, (SubLObject)pph_phrase.TEN_INTEGER)) {
            final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str222$PPH_phrase_variant_with_nesting_d) });
            pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(matrix_phrase));
        }
        else {
            if (pph_phrase.NIL != list_utilities.singletonP(variant)) {
                return pph_variant_string(list_utilities.only_one(variant), add_tagsP, matrix_phrase);
            }
            SubLObject first_result = pph_variant_string(variant.first(), add_tagsP, (SubLObject)pph_phrase.NIL);
            final SubLObject rest_result = pph_variant_string(variant.rest(), add_tagsP, (SubLObject)pph_phrase.NIL);
            final SubLObject no_spaceP = pph_nospace_phrase_p(matrix_phrase);
            if (pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != subl_promotions.memberP(first_result, (SubLObject)pph_phrase.$list223, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), (SubLObject)pph_phrase.UNPROVIDED)) {
                final SubLObject new_determiner = first_result = pph_utilities.select_determiner_string((SubLObject)pph_phrase.$list224, rest_result, pph_phrase.$const116$singular_Generic);
            }
            return (pph_phrase.NIL != no_spaceP) ? pph_string.pph_string_concatenate(first_result, rest_result) : pph_string.pph_bunge((SubLObject)ConsesLow.list(first_result, rest_result));
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 85324L)
    public static SubLObject pph_variant_string(final SubLObject variant, SubLObject add_tagsP, SubLObject matrix_phrase) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_phrase.NIL;
        }
        if (matrix_phrase == pph_phrase.UNPROVIDED) {
            matrix_phrase = (SubLObject)pph_phrase.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == v_memoization_state) {
            return pph_variant_string_internal(variant, add_tagsP, matrix_phrase);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_phrase.$sym216$PPH_VARIANT_STRING, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_phrase.$sym216$PPH_VARIANT_STRING, (SubLObject)pph_phrase.THREE_INTEGER, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.EQUAL, (SubLObject)pph_phrase.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_phrase.$sym216$PPH_VARIANT_STRING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(variant, add_tagsP, matrix_phrase);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (variant.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (add_tagsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && matrix_phrase.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_variant_string_internal(variant, add_tagsP, matrix_phrase)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(variant, add_tagsP, matrix_phrase));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 87192L)
    public static SubLObject car_nesting_depth_G(SubLObject obj, final SubLObject n) {
        SubLObject current_depth;
        for (current_depth = (SubLObject)pph_phrase.ZERO_INTEGER; obj.isCons() && current_depth.numLE(n); obj = obj.first(), current_depth = Numbers.add(current_depth, (SubLObject)pph_phrase.ONE_INTEGER)) {}
        return Numbers.numG(current_depth, n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 87404L)
    public static SubLObject pph_alternative_phrase_strings(final SubLObject alternative_phrase, SubLObject add_tagsP) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_phrase.T;
        }
        return pph_phrase_all_strings(alternative_phrase, add_tagsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 87560L)
    public static SubLObject pph_phrase_all_output_lists(final SubLObject phrase) {
        return pph_phrase_all_output_lists_internal(phrase, (SubLObject)pph_phrase.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 87757L)
    public static SubLObject pph_phrase_all_output_lists_internal(final SubLObject phrase, final SubLObject top_levelP) {
        SubLObject output_lists = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_doneP(phrase)) {
            if (pph_phrase.NIL != pph_meta_phrase_p(phrase) || pph_phrase.NIL != top_levelP || pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) {
                final SubLObject item_var = pph_phrase_output_list(phrase);
                if (pph_phrase.NIL == conses_high.member(item_var, output_lists, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                    output_lists = (SubLObject)ConsesLow.cons(item_var, output_lists);
                }
                SubLObject cdolist_list_var = pph_phrase_alternatives(phrase);
                SubLObject alternative = (SubLObject)pph_phrase.NIL;
                alternative = cdolist_list_var.first();
                while (pph_phrase.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$10 = pph_phrase_all_output_lists_internal(alternative, (SubLObject)pph_phrase.NIL);
                    SubLObject alternative_output_list = (SubLObject)pph_phrase.NIL;
                    alternative_output_list = cdolist_list_var_$10.first();
                    while (pph_phrase.NIL != cdolist_list_var_$10) {
                        final SubLObject item_var2 = alternative_output_list;
                        if (pph_phrase.NIL == conses_high.member(item_var2, output_lists, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                            output_lists = (SubLObject)ConsesLow.cons(item_var2, output_lists);
                        }
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        alternative_output_list = cdolist_list_var_$10.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                SubLObject cdolist_list_var2 = pph_phrase_all_variant_dtr_lists(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                SubLObject big_alternative_phrase_list = (SubLObject)pph_phrase.NIL;
                big_alternative_phrase_list = cdolist_list_var2.first();
                while (pph_phrase.NIL != cdolist_list_var2) {
                    SubLObject dtr_output_lists = (SubLObject)pph_phrase.NIL;
                    SubLObject cdolist_list_var_$11 = big_alternative_phrase_list;
                    SubLObject variant = (SubLObject)pph_phrase.NIL;
                    variant = cdolist_list_var_$11.first();
                    while (pph_phrase.NIL != cdolist_list_var_$11) {
                        final SubLObject item_var3;
                        final SubLObject output_list = item_var3 = pph_variant_output_list(variant);
                        if (pph_phrase.NIL == conses_high.member(item_var3, dtr_output_lists, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                            dtr_output_lists = (SubLObject)ConsesLow.cons(item_var3, dtr_output_lists);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        variant = cdolist_list_var_$11.first();
                    }
                    final SubLObject ordered_olists = Sequences.nreverse(dtr_output_lists);
                    final SubLObject item_var4;
                    final SubLObject new_output_list = item_var4 = (SubLObject)((pph_phrase.NIL != nospaceP) ? ConsesLow.list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(ordered_olists)) : Functions.apply(Symbols.symbol_function((SubLObject)pph_phrase.$sym225$APPEND), ordered_olists));
                    if (pph_phrase.NIL == conses_high.member(item_var4, output_lists, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                        output_lists = (SubLObject)ConsesLow.cons(item_var4, output_lists);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    big_alternative_phrase_list = cdolist_list_var2.first();
                }
            }
        }
        return Sequences.nreverse(output_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 89045L)
    public static SubLObject pph_variant_output_list(final SubLObject variant) {
        if (pph_phrase.NIL != pph_phrase_p(variant, (SubLObject)pph_phrase.UNPROVIDED)) {
            return pph_phrase_output_list(variant);
        }
        if (pph_phrase.NIL != pattern_match.tree_matches_pattern(variant, (SubLObject)pph_phrase.$list220)) {
            SubLObject result = (SubLObject)pph_phrase.NIL;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = (SubLObject)pph_phrase.NIL;
            sub = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(pph_variant_output_list(sub), result);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(Sequences.nreverse(result)));
        }
        SubLObject result = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = variant;
        SubLObject sub = (SubLObject)pph_phrase.NIL;
        sub = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, pph_variant_output_list(sub));
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 89571L)
    public static SubLObject pph_phrase_all_output_items(final SubLObject phrase) {
        SubLObject output_items = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_doneP(phrase)) {
            if (pph_phrase.NIL != pph_meta_phrase_p(phrase) || pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) {
                pph_phrase_consolidate_output_list(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                final SubLObject item_var = list_utilities.only_one(pph_phrase_output_list(phrase));
                if (pph_phrase.NIL == conses_high.member(item_var, output_items, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                    output_items = (SubLObject)ConsesLow.cons(item_var, output_items);
                }
                SubLObject cdolist_list_var = pph_phrase_alternatives(phrase);
                SubLObject alternative = (SubLObject)pph_phrase.NIL;
                alternative = cdolist_list_var.first();
                while (pph_phrase.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$12 = pph_phrase_all_output_items(alternative);
                    SubLObject alternative_output_item = (SubLObject)pph_phrase.NIL;
                    alternative_output_item = cdolist_list_var_$12.first();
                    while (pph_phrase.NIL != cdolist_list_var_$12) {
                        final SubLObject item_var2 = alternative_output_item;
                        if (pph_phrase.NIL == conses_high.member(item_var2, output_items, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                            output_items = (SubLObject)ConsesLow.cons(item_var2, output_items);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        alternative_output_item = cdolist_list_var_$12.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                final SubLObject head_dtr = pph_phrase_head_dtr(phrase);
                final SubLObject agr = (SubLObject)((pph_phrase.NIL != pph_phrase_p(head_dtr, (SubLObject)pph_phrase.UNPROVIDED)) ? pph_phrase_agr_pred(head_dtr) : pph_phrase.NIL);
                SubLObject cdolist_list_var2 = pph_phrase_all_variant_dtr_lists(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                SubLObject big_alternative_phrase_list = (SubLObject)pph_phrase.NIL;
                big_alternative_phrase_list = cdolist_list_var2.first();
                while (pph_phrase.NIL != cdolist_list_var2) {
                    SubLObject backward_alternative_output_item_list = (SubLObject)pph_phrase.NIL;
                    SubLObject cdolist_list_var_$13 = big_alternative_phrase_list;
                    SubLObject variant = (SubLObject)pph_phrase.NIL;
                    variant = cdolist_list_var_$13.first();
                    while (pph_phrase.NIL != cdolist_list_var_$13) {
                        backward_alternative_output_item_list = (SubLObject)ConsesLow.cons(pph_variant_output_item(variant), backward_alternative_output_item_list);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        variant = cdolist_list_var_$13.first();
                    }
                    final SubLObject string = pph_utilities.clean_bunge_nreverse(Mapping.mapcar((SubLObject)pph_phrase.$sym226$PPH_PHRASE_OUTPUT_ITEM_STRING, backward_alternative_output_item_list), (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == nospaceP));
                    final SubLObject cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
                    final SubLObject arg_position = pph_phrase_arg_position(phrase);
                    final SubLObject html_open_tag = (SubLObject)pph_phrase.NIL;
                    final SubLObject html_close_tag = (SubLObject)pph_phrase.NIL;
                    final SubLObject item_var3 = pph_consolidate_output_items(Sequences.nreverse(backward_alternative_output_item_list), string, cycl, arg_position, html_open_tag, html_close_tag, agr, (SubLObject)pph_phrase.UNPROVIDED);
                    if (pph_phrase.NIL == conses_high.member(item_var3, output_items, Symbols.symbol_function((SubLObject)pph_phrase.EQUALP), Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY))) {
                        output_items = (SubLObject)ConsesLow.cons(item_var3, output_items);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    big_alternative_phrase_list = cdolist_list_var2.first();
                }
            }
        }
        return Sequences.nreverse(output_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 91231L)
    public static SubLObject pph_variant_output_item(final SubLObject variant) {
        if (pph_phrase.NIL != pph_phrase_p(variant, (SubLObject)pph_phrase.UNPROVIDED)) {
            return list_utilities.only_one(pph_phrase_consolidate_output_list(variant, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
        }
        if (pph_phrase.NIL != pattern_match.tree_matches_pattern(variant, (SubLObject)pph_phrase.$list220)) {
            SubLObject result = (SubLObject)pph_phrase.NIL;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = (SubLObject)pph_phrase.NIL;
            sub = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(pph_variant_output_item(sub), result);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
            return pph_data_structures.new_pph_phrase_output_item_nospace_group(Sequences.nreverse(result));
        }
        SubLObject result = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = variant.rest();
        SubLObject sub = (SubLObject)pph_phrase.NIL;
        sub = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(pph_variant_output_item(sub), result);
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        }
        return pph_consolidate_output_items(Sequences.nreverse(result), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 91794L)
    public static SubLObject pph_phrase_string_no_tags(final SubLObject phrase) {
        return pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 91950L)
    public static SubLObject pph_phrase_string(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_phrase.T;
        }
        final SubLObject phrase_doneP = pph_phrase_doneP(phrase);
        SubLObject string = (SubLObject)((pph_phrase.NIL != phrase_doneP) ? pph_phrase_noted_string(phrase, add_tagsP, (SubLObject)pph_phrase.UNPROVIDED) : pph_phrase.NIL);
        if (pph_phrase.NIL == pph_string.pph_string_p(string) && pph_phrase.NIL != phrase_doneP) {
            string = pph_phrase_output_list_string(pph_phrase_output_list(phrase), add_tagsP);
            pph_phrase_note_string(phrase, string, add_tagsP);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 92419L)
    public static SubLObject pph_phrase_clear_noted_strings(final SubLObject phrase) {
        pph_data_structures.pph_phrase_info_clear(phrase, (SubLObject)pph_phrase.$kw227$HTML_STRING);
        document._csetf_sign_string(phrase, (SubLObject)pph_phrase.NIL);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 92573L)
    public static SubLObject pph_phrase_note_string(final SubLObject phrase, final SubLObject string, final SubLObject tagsP) {
        if (pph_phrase.NIL != tagsP) {
            pph_data_structures.pph_phrase_info_set(phrase, (SubLObject)pph_phrase.$kw227$HTML_STRING, string);
        }
        else {
            document._csetf_sign_string(phrase, string);
        }
        final SubLObject noted_string = pph_phrase_noted_string(phrase, tagsP, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_string.pph_string_p(string) && pph_phrase.NIL == pph_string.pph_string_equalP(string, noted_string)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str228$Failed_to_note__S_on__S___Noted_s) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(string, phrase, noted_string));
        }
        return noted_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 93032L)
    public static SubLObject pph_phrase_noted_string(final SubLObject phrase, SubLObject tagsP, SubLObject not_found) {
        if (tagsP == pph_phrase.UNPROVIDED) {
            tagsP = (SubLObject)pph_phrase.NIL;
        }
        if (not_found == pph_phrase.UNPROVIDED) {
            not_found = (SubLObject)pph_phrase.$kw16$NOT_FOUND;
        }
        if (pph_phrase.NIL != tagsP) {
            return pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_phrase.$kw227$HTML_STRING, not_found);
        }
        final SubLObject noted_string = document.sign_string(phrase);
        return (pph_phrase.NIL != pph_string.pph_string_p(noted_string)) ? noted_string : not_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 93321L)
    public static SubLObject pph_phrase_maybe_add_anchor_tags(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL == pph_phrase_has_html_anchor_tagsP(phrase)) {
            final SubLObject v_object = pph_phrase_link_cycl(phrase);
            final SubLObject arg_position = pph_phrase_arg_position(phrase);
            if (pph_phrase.NIL != pph_html.pph_use_anchor_tags_for_termP(v_object) && pph_phrase.NIL != pph_html.pph_use_anchor_tags_for_arg_positionP(arg_position)) {
                thread.resetMultipleValues();
                final SubLObject open_tag = pph_html.pph_anchor_tags_for_term(v_object);
                final SubLObject close_tag = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (open_tag.isString() && close_tag.isString()) {
                    pph_phrase_add_html_tags(phrase, open_tag, close_tag);
                }
            }
        }
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 93937L)
    public static SubLObject pph_phrase_output_item_maybe_add_anchor_tags(final SubLObject output_item, final SubLObject item_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_html.pph_use_anchor_tags_for_termP(item_cycl)) {
            thread.resetMultipleValues();
            final SubLObject open_tag = pph_html.pph_anchor_tags_for_term(item_cycl);
            final SubLObject close_tag = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (open_tag.isString() && close_tag.isString()) {
                pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, open_tag, close_tag);
            }
        }
        return output_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 94346L)
    public static SubLObject pph_phrase_has_html_anchor_tagsP(final SubLObject phrase) {
        SubLObject ans = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL == ans) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = pph_phrase_output_list(phrase), item = (SubLObject)pph_phrase.NIL, item = csome_list_var.first(); pph_phrase.NIL == ans && pph_phrase.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_html.pph_html_includes_anchor_open_tagP(pph_data_structures.pph_phrase_output_item_html_open_tag(item)) || pph_phrase.NIL != pph_html.pph_html_includes_anchor_close_tagP(pph_data_structures.pph_phrase_output_item_html_close_tag(item))), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 94722L)
    public static SubLObject pph_phrase_output_list_string_no_tags(final SubLObject output_list) {
        return pph_phrase_output_list_string(output_list, (SubLObject)pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 94850L)
    public static SubLObject pph_phrase_output_list_string(final SubLObject output_list, SubLObject add_tagsP) {
        if (add_tagsP == pph_phrase.UNPROVIDED) {
            add_tagsP = Equality.eql(pph_vars.$paraphrase_mode$.getDynamicValue(), (SubLObject)pph_phrase.$kw229$HTML);
        }
        SubLObject strings = (SubLObject)pph_phrase.NIL;
        SubLObject inside_anchor_tagsP = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = output_list;
        SubLObject item = (SubLObject)pph_phrase.NIL;
        item = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            SubLObject item_string = pph_phrase_output_item_get_string(item, add_tagsP);
            if (pph_phrase.NIL != add_tagsP) {
                final SubLObject item_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                final SubLObject item_open_tagP = (SubLObject)(item_open_tag.isString() ? string_utilities.substringP((SubLObject)pph_phrase.$str230$href, item_open_tag, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED) : pph_phrase.NIL);
                final SubLObject item_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                final SubLObject item_close_tagP = list_utilities.sublisp_boolean(Types.stringp(item_close_tag));
                if (pph_phrase.NIL != item_string && pph_phrase.NIL != inside_anchor_tagsP && pph_phrase.NIL != item_open_tagP) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str231$__Adding_new_tag_inside_old___) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.EMPTY_SUBL_OBJECT_ARRAY));
                    item_string = Sequences.cconcatenate(item_close_tag, item_string);
                }
                inside_anchor_tagsP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != item_open_tagP && pph_phrase.NIL == item_close_tagP);
            }
            final SubLObject var = item_string;
            if (pph_phrase.NIL != var) {
                strings = (SubLObject)ConsesLow.cons(var, strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (pph_phrase.NIL != add_tagsP && pph_phrase.NIL != inside_anchor_tagsP) {
            strings = (SubLObject)ConsesLow.cons(html_macros.$html_anchor_tail$.getGlobalValue(), strings);
        }
        SubLObject string = pph_phrase_output_list_assemble_string(strings);
        if (pph_phrase.NIL == add_tagsP) {
            string = pph_utilities.pph_remove_html_tags(string, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 96166L)
    public static SubLObject pph_phrase_output_list_assemble_string(final SubLObject strings) {
        SubLObject string = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != strings) {
            if (pph_phrase.NIL != list_utilities.singletonP(strings)) {
                string = strings.first();
            }
            else {
                string = pph_utilities.clean_bunge_nreverse(strings, (SubLObject)pph_phrase.UNPROVIDED);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 96551L)
    public static SubLObject pph_phrase_output_item_get_string(final SubLObject item, final SubLObject add_tagsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject item_string = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_p(item)) {
            final SubLObject open_tag_slot_value = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
            final SubLObject open_tag = (pph_phrase.NIL != open_tag_slot_value) ? open_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject close_tag_slot_value = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
            final SubLObject close_tag = (pph_phrase.NIL != close_tag_slot_value) ? close_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject raw_string = pph_data_structures.pph_phrase_output_item_string(item);
            final SubLObject string = (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_phrase.$kw229$HTML && pph_phrase.NIL != add_tagsP) ? pph_utilities.pph_escape(raw_string) : raw_string;
            if (pph_phrase.NIL != pph_string.pph_string_p(string) || (pph_phrase.NIL != add_tagsP && (pph_phrase.NIL != list_utilities.lengthG(open_tag, (SubLObject)pph_phrase.ZERO_INTEGER, (SubLObject)pph_phrase.UNPROVIDED) || pph_phrase.NIL != list_utilities.lengthG(close_tag, (SubLObject)pph_phrase.ZERO_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)))) {
                if (pph_phrase.NIL != pph_string.pph_string_p(string)) {
                    item_string = string;
                }
                if (pph_phrase.NIL != add_tagsP && open_tag.isString()) {
                    item_string = ((pph_phrase.NIL != pph_string.pph_string_p(item_string)) ? pph_string.pph_string_concatenate(open_tag, item_string) : open_tag);
                }
                if (pph_phrase.NIL != add_tagsP && close_tag.isString()) {
                    item_string = ((pph_phrase.NIL != pph_string.pph_string_p(item_string)) ? pph_string.pph_string_concatenate(item_string, close_tag) : close_tag);
                }
            }
        }
        else if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item)) {
            item_string = pph_data_structures.pph_phrase_output_item_nospace_group_get_string(item, add_tagsP);
        }
        else if (pph_phrase.NIL != pph_data_structures.enhanced_pph_output_item_p(item)) {
            item_string = pph_phrase_output_item_get_string(pph_data_structures.enhanced_pph_output_item_item(item), add_tagsP);
        }
        if (pph_phrase.NIL == add_tagsP) {
            item_string = pph_utilities.pph_remove_html_tags(item_string, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return item_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 98178L)
    public static SubLObject pph_phrase_set_string(final SubLObject phrase, final SubLObject string) {
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str232$__Setting_string_to__S___S_, string, pph_string.pph_string_to_utf8(string), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != string) {}
        final SubLObject cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_known_cycl_p(cycl) && pph_phrase.NIL != pph_vars.pph_forbidden_string_for_termP(cycl, string)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.TWO_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str233$_S_is_a_forbidden_paraphrase_for_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(string, cycl));
        }
        pph_phrase_note_string(phrase, pph_utilities.pph_remove_html_tags(string, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.NIL);
        if (pph_phrase.NIL != pph_string.pph_string_p(string)) {
            final SubLObject output_list = pph_phrase_output_list(phrase);
            final SubLObject new_output_item = pph_utilities.pph_html_string_to_output_item(string);
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str234$__Output_list_1___S, output_list, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            final SubLObject pcase_var = Sequences.length(output_list);
            if (!pcase_var.eql((SubLObject)pph_phrase.ZERO_INTEGER)) {
                if (pcase_var.eql((SubLObject)pph_phrase.ONE_INTEGER)) {
                    final SubLObject old_output_item = list_utilities.only_one(output_list);
                    pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, pph_data_structures.pph_phrase_output_item_cycl(old_output_item));
                    pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, pph_data_structures.pph_phrase_output_item_arg_position(old_output_item));
                    pph_data_structures.pph_phrase_output_item_set_agr_pred(new_output_item, pph_data_structures.pph_phrase_output_item_agr_pred(old_output_item));
                }
                else {
                    pph_phrase_consolidate_output_list(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    pph_phrase_set_string(phrase, string);
                }
            }
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str235$__Output_item____S, new_output_item, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_loose_p(new_output_item)) {
                pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str236$__output_item_2____S, new_output_item, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                pph_data_structures.pph_phrase_output_item_set_agr_pred(new_output_item, pph_phrase_agr_pred(phrase));
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str237$__output_item_3____S, new_output_item, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                if (pph_phrase.NIL == pph_utilities.pph_known_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(new_output_item)) && pph_phrase.NIL == pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(new_output_item))) {
                    final SubLObject map = pph_phrase_arg_position_map(phrase);
                    final SubLObject top_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_phrase.NIL, map);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, top_position);
                }
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str238$__output_item_4____S, new_output_item, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_output_item), (SubLObject)pph_phrase.T);
                pph_phrase_note_done(phrase);
            }
        }
        else {
            pph_phrase_set_output_list(phrase, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 100464L)
    public static SubLObject pph_phrase_arg_position(final SubLObject phrase) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
        if (pph_phrase.NIL != list_utilities.singletonP(output_list)) {
            arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_list.first());
        }
        if (pph_phrase.NIL != pph_utilities.pph_unknown_arg_position_p(arg_position) && pph_phrase.NIL == pph_phrase_p(pph_phrase_mother(phrase), (SubLObject)pph_phrase.UNPROVIDED)) {
            arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase_arg_position_map(phrase));
        }
        return arg_position;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 101043L)
    public static SubLObject pph_phrase_set_arg_position(final SubLObject phrase, SubLObject position) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject new_output_item = (SubLObject)pph_phrase.NIL;
        final SubLObject pcase_var = Sequences.length(output_list);
        if (pcase_var.eql((SubLObject)pph_phrase.ZERO_INTEGER)) {
            new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), position, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)pph_phrase.ONE_INTEGER)) {
            new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, position);
        }
        else {
            pph_phrase_consolidate_output_list(phrase, position, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != new_output_item) {
            pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_output_item), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 101735L)
    public static SubLObject pph_output_list_copy(final SubLObject olist) {
        return Mapping.mapcar((SubLObject)pph_phrase.$sym239$PPH_PHRASE_OUTPUT_ITEM_COPY, olist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 101836L)
    public static SubLObject pph_phrase_set_output_list_cycl(final SubLObject phrase, final SubLObject cycl) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject new_output_item = (SubLObject)pph_phrase.NIL;
        final SubLObject pcase_var = Sequences.length(output_list);
        if (pcase_var.eql((SubLObject)pph_phrase.ZERO_INTEGER)) {
            final SubLObject arg_position = pph_phrase_arg_position(phrase);
            new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), arg_position, cycl, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)pph_phrase.ONE_INTEGER)) {
            new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, cycl);
        }
        else {
            pph_phrase_set_cycl(phrase, cycl);
            pph_phrase_consolidate_output_list(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != new_output_item) {
            pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_output_item), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 102679L)
    public static SubLObject pph_phrase_sanity_check_cycl(final SubLObject phrase) {
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 103585L)
    public static SubLObject pph_phrase_set_html_tags(final SubLObject phrase, final SubLObject open_tag, final SubLObject close_tag) {
        if (pph_phrase.NIL != open_tag) {}
        if (pph_phrase.NIL != close_tag) {}
        final SubLObject output_list = pph_phrase_output_list(phrase);
        final SubLObject pcase_var = Sequences.length(output_list);
        if (pcase_var.eql((SubLObject)pph_phrase.ZERO_INTEGER)) {
            final SubLObject new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.NIL, open_tag, close_tag, (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_output_item), (SubLObject)pph_phrase.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)pph_phrase.ONE_INTEGER)) {
            final SubLObject new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            pph_data_structures.pph_phrase_output_item_set_html_tags(new_output_item, open_tag, close_tag);
            pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_output_item), (SubLObject)pph_phrase.UNPROVIDED);
        }
        else {
            final SubLObject new_first_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            final SubLObject new_last_item = pph_data_structures.pph_phrase_output_item_copy(list_utilities.last_one(output_list));
            pph_data_structures.pph_phrase_output_item_set_html_tags(new_first_item, open_tag, (SubLObject)pph_phrase.NIL);
            pph_data_structures.pph_phrase_output_item_set_html_tags(new_last_item, (SubLObject)pph_phrase.NIL, close_tag);
            final SubLObject other_items = conses_high.butlast(output_list.rest(), (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject new_list = (SubLObject)ConsesLow.cons(new_first_item, ConsesLow.append(other_items, (SubLObject)ConsesLow.list(new_last_item)));
            pph_phrase_set_output_list(phrase, new_list, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 105736L)
    public static SubLObject pph_phrase_add_html_tags(final SubLObject phrase, final SubLObject open_tag, final SubLObject close_tag) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        final SubLObject old_first_item = output_list.first();
        final SubLObject old_open_tag = (SubLObject)((pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_loose_p(old_first_item)) ? pph_data_structures.pph_phrase_output_item_html_open_tag(old_first_item) : pph_phrase.NIL);
        final SubLObject old_last_item = list_utilities.last_one(output_list);
        final SubLObject old_close_tag = (SubLObject)((pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_loose_p(old_last_item)) ? pph_data_structures.pph_phrase_output_item_html_close_tag(old_last_item) : pph_phrase.NIL);
        final SubLObject new_open_tag = old_open_tag.isString() ? Sequences.cconcatenate(open_tag, old_open_tag) : open_tag;
        final SubLObject new_close_tag = old_close_tag.isString() ? Sequences.cconcatenate(old_close_tag, close_tag) : close_tag;
        pph_phrase_set_html_tags(phrase, new_open_tag, new_close_tag);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 106571L)
    public static SubLObject pph_phrase_find_or_set_category(final SubLObject phrase) {
        if (pph_phrase.NIL == pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject pred = pph_phrase_agr_pred(phrase);
            if (pph_phrase.$kw240$ANY == pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
                pph_phrase_set_category(phrase, (SubLObject)pph_phrase.$kw240$ANY, (SubLObject)pph_phrase.UNPROVIDED);
            }
            else if (pph_phrase.NIL != pph_utilities.pph_speech_part_predP(pred)) {
                pph_phrase_set_category(phrase, lexicon_accessors.pos_of_pred(pred), (SubLObject)pph_phrase.UNPROVIDED);
            }
            else if (pph_phrase.NIL != pph_utilities.pph_name_string_predP(pred)) {
                pph_phrase_set_category_to_np(phrase);
            }
        }
        return pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 107150L)
    public static SubLObject pph_phrase_set_category_to_np(final SubLObject phrase) {
        pph_phrase_set_category(phrase, pph_utilities.pph_np_category(), (SubLObject)pph_phrase.UNPROVIDED);
        return pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 107299L)
    public static SubLObject pph_phrase_npP(final SubLObject phrase) {
        return pph_utilities.pph_npP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 107390L)
    public static SubLObject pph_heavy_npP(final SubLObject phrase) {
        if (pph_phrase.NIL == pph_phrase_npP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_doneP(phrase) && (pph_phrase.ONE_INTEGER.numG(Sequences.count((SubLObject)Characters.CHAR_space, pph_string.pph_string_to_utf8(pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL)), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) || pph_phrase.NIL != list_utilities.lengthG(pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL), (SubLObject)pph_phrase.TWENTY_INTEGER, (SubLObject)pph_phrase.UNPROVIDED))) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str241$NP_is_heavy_based_on_string__S, pph_string.pph_string_to_utf8(pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL)), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase) && pph_phrase_dtr_count(phrase).numG((SubLObject)pph_phrase.ONE_INTEGER)) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str242$NP_is_heavy_based_on_dtrs_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            return (SubLObject)pph_phrase.T;
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 107936L)
    public static SubLObject pph_phrase_sP(final SubLObject phrase) {
        return pph_utilities.pph_sP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108025L)
    public static SubLObject pph_phrase_nbarP(final SubLObject phrase) {
        return pph_utilities.pph_nbarP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108120L)
    public static SubLObject pph_phrase_nominalP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_head_pos(phrase), pph_phrase.$const243$Noun, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108229L)
    public static SubLObject pph_phrase_possessiveP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const172$PossessivePhrase, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108353L)
    public static SubLObject pph_phrase_verbP(final SubLObject phrase) {
        return pph_utilities.pph_verbP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108448L)
    public static SubLObject pph_phrase_set_category_to_pp(final SubLObject phrase) {
        pph_phrase_set_category(phrase, pph_utilities.pph_pp_category(), (SubLObject)pph_phrase.UNPROVIDED);
        return pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108597L)
    public static SubLObject pph_phrase_ppP(final SubLObject phrase) {
        return pph_utilities.pph_ppP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108688L)
    public static SubLObject pph_phrase_adjpP(final SubLObject phrase) {
        return pph_utilities.pph_adjpP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108783L)
    public static SubLObject pph_phrase_adjP(final SubLObject phrase) {
        return pph_utilities.pph_adjP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108876L)
    public static SubLObject pph_phrase_clauseP(final SubLObject phrase) {
        return pph_utilities.pph_clauseP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 108975L)
    public static SubLObject pph_copula_phraseP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(phrase, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED).eql(pph_phrase.$const244$Be_TheWord));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 109151L)
    public static SubLObject pph_aux_verb_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject aux_verbP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != pph_phrase_p(phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            aux_verbP = pph_utilities.pph_genl_posP(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const245$AuxVerb, (SubLObject)pph_phrase.UNPROVIDED);
            if (pph_phrase.NIL == aux_verbP && pph_phrase.NIL != pph_utilities.pph_ask_lit((SubLObject)ConsesLow.listS(pph_phrase.$const246$posForms, pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.$list247), pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
                final SubLObject mother = pph_phrase_mother(phrase);
                final SubLObject head_dtr_num = pph_phrase_head_dtr_num(mother);
                final SubLObject next_dtr_num = number_utilities.f_1X(head_dtr_num);
                final SubLObject next_dtr = pph_phrase_nth_dtr(mother, next_dtr_num);
                if (pph_phrase.NIL != pph_phrase_p(next_dtr, (SubLObject)pph_phrase.UNPROVIDED)) {
                    final SubLObject next_dtr_string = pph_phrase_string(next_dtr, (SubLObject)pph_phrase.UNPROVIDED);
                    if (pph_phrase.NIL != pph_string.pph_string_p(next_dtr_string) && pph_phrase.NIL != pph_utilities.pph_filter_preds((SubLObject)pph_phrase.$list248, pph_string.preds_of_pph_string(pph_string.pph_string_tokenize(next_dtr_string, (SubLObject)pph_phrase.UNPROVIDED).first(), (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED)) {
                        aux_verbP = (SubLObject)pph_phrase.T;
                    }
                }
            }
        }
        return aux_verbP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 110046L)
    public static SubLObject possibly_modal_verb_phraseP(final SubLObject phrase) {
        final SubLObject wu = pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject string = pph_phrase_string(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_phrase.NIL != wu && pph_phrase.NIL != conses_high.member(wu, pph_question.modal_words(), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) || (pph_phrase.NIL != string && pph_phrase.NIL != conses_high.member(string, pph_question.modal_strings(), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 110331L)
    public static SubLObject pph_ordinal_phraseP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_category(pph_phrase_lexical_head_dtr(phrase), (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const249$OrdinalAdjective, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 110599L)
    public static SubLObject pph_phrase_category(final SubLObject phrase, SubLObject follow_linksP) {
        if (follow_linksP == pph_phrase.UNPROVIDED) {
            follow_linksP = (SubLObject)pph_phrase.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_level_category = document.sign_category(phrase);
        SubLObject category = (SubLObject)pph_phrase.NIL;
        final SubLObject _prev_bind_0 = pph_phrase.$pph_phrase_category_depth$.currentBinding(thread);
        try {
            pph_phrase.$pph_phrase_category_depth$.bind(number_utilities.f_1X(pph_phrase.$pph_phrase_category_depth$.getDynamicValue(thread)), thread);
            if (pph_phrase.$pph_phrase_category_depth$.getDynamicValue(thread).numG(pph_phrase.$pph_phrase_category_max_depth$.getGlobalValue())) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str252$Excessive_recursion___S__in_PPH_P) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.$pph_phrase_category_depth$.getDynamicValue(thread)));
            }
            else if (pph_phrase.NIL != follow_linksP && pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL == pph_quoted_paraphrase_phrase_p(phrase)) {
                category = pph_phrase_category(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER), (SubLObject)pph_phrase.UNPROVIDED);
            }
            else if (pph_phrase.NIL != top_level_category) {
                category = top_level_category;
            }
            else if (pph_phrase.NIL != follow_linksP) {
                if (pph_phrase.NIL != pph_phrase_has_head_dtrP(phrase)) {
                    category = pph_phrase_category(pph_phrase_head_dtr(phrase), (SubLObject)pph_phrase.UNPROVIDED);
                }
            }
        }
        finally {
            pph_phrase.$pph_phrase_category_depth$.rebind(_prev_bind_0, thread);
        }
        return category;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 111611L)
    public static SubLObject pph_phrase_head_pos(final SubLObject phrase) {
        return pph_utilities.pph_pos_of_category(pph_phrase_category(phrase, (SubLObject)pph_phrase.T), (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 111750L)
    public static SubLObject pph_phrase_set_category(final SubLObject phrase, SubLObject category, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        category = pph_utilities.pph_possibly_nartify(category);
        if (pph_phrase.NIL != pph_cycl_phrase_p(phrase) && category != pph_phrase.$kw71$CYCL_PHRASE && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str253$__Setting_CycL_phrase_s_category_, category);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        if (pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL != descend_into_metaP) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_category(dtr, category, descend_into_metaP);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        else {
            document._csetf_sign_category(phrase, category);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 112366L)
    public static SubLObject pph_phrase_update_category(final SubLObject phrase, final SubLObject category, SubLObject descend_into_metaP, SubLObject override_existingP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (override_existingP == pph_phrase.UNPROVIDED) {
            override_existingP = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == pph_sentence.pph_sentence_p(phrase)) {
            if (pph_phrase.NIL != pph_quoted_paraphrase_phrase_p(phrase)) {
                pph_phrase_set_category(phrase, category, (SubLObject)pph_phrase.NIL);
            }
            else if (pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL != descend_into_metaP) {
                SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                        element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (pph_phrase.NIL == pph_quoted_paraphrase_phrase_p(phrase) || pph_phrase.NIL != pph_find_new_category(pph_phrase_category(dtr, (SubLObject)pph_phrase.UNPROVIDED), category, (SubLObject)pph_phrase.$kw254$RETURN_NIL)) {
                            pph_phrase_update_category(dtr, category, descend_into_metaP, override_existingP);
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                    }
                }
            }
            else if (pph_phrase.$const172$PossessivePhrase.eql(category) && pph_phrase.NIL != pph_phrase_npP(phrase)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str255$Possessivizing_NP_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                final SubLObject nested_phrase = pph_phrase_copy(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                pph_phrase_set_only_dtr(phrase, nested_phrase);
                pph_phrase_set_category(phrase, category, (SubLObject)pph_phrase.NIL);
            }
            else if (pph_phrase.NIL != pph_utilities.pph_genl_categoryP(pph_phrase.$const172$PossessivePhrase, pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_utilities.pph_npP(category)) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str256$Nominalizing_a_possessive_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
                final SubLObject nested_phrase = pph_phrase_copy(phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                pph_phrase_set_only_dtr(phrase, nested_phrase);
                pph_phrase_set_category(phrase, category, (SubLObject)pph_phrase.NIL);
            }
            else {
                final SubLObject existing = pph_phrase_category(phrase, descend_into_metaP);
                final SubLObject on_clash = (SubLObject)((pph_phrase.NIL != override_existingP) ? pph_phrase.$kw257$OVERRIDE : pph_phrase.$kw258$ERROR);
                final SubLObject new_category = pph_find_new_category(existing, category, on_clash);
                pph_phrase_maybe_coerce_np_to_nbar(phrase, category, existing);
                pph_phrase_set_category(phrase, new_category, descend_into_metaP);
            }
        }
        return pph_phrase_category(phrase, descend_into_metaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 114254L)
    public static SubLObject pph_phrase_maybe_coerce_np_to_nbar(final SubLObject phrase, final SubLObject category, final SubLObject existing) {
        if (pph_phrase.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_utilities.pph_nbarP(category) && pph_phrase.NIL != pph_utilities.pph_npP(existing)) {
            final SubLObject np_cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject nbar_cycl = (SubLObject)((pph_phrase.NIL != pph_det_nbarP(phrase)) ? pph_phrase_cycl(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ONE_INTEGER), (SubLObject)pph_phrase.UNPROVIDED) : pph_phrase.NIL);
            if (pph_phrase.NIL != pph_utilities.pph_collectionP(np_cycl) || pph_phrase.NIL != pph_utilities.pph_collectionP(nbar_cycl)) {
                pph_phrase_coerce_np_to_nbar(phrase);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 114708L)
    public static SubLObject pph_phrase_coerce_np_to_nbar(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str259$Converting_NP_to__instance_of__Nb, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        final SubLObject instance_dtr = pph_templates.pph_phrasify_phrase_naut(reader.bq_cons(pph_functions.bestnlwordformoflexemefn_constrained(), (SubLObject)pph_phrase.$list260), (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject of_dtr = pph_templates.pph_phrasify_phrase_naut(reader.bq_cons(pph_functions.bestnlwordformoflexemefn_constrained(), (SubLObject)pph_phrase.$list261), (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject pp_dtr = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject nbar = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        set_pph_phrase_dtrs_from_list(pp_dtr, (SubLObject)ConsesLow.list(of_dtr, phrase), (SubLObject)pph_phrase.ZERO_INTEGER);
        pph_phrase_set_category(pp_dtr, pph_utilities.pph_pp_category(), (SubLObject)pph_phrase.UNPROVIDED);
        set_pph_phrase_dtrs_from_list(nbar, (SubLObject)ConsesLow.list(instance_dtr, pp_dtr), (SubLObject)pph_phrase.ZERO_INTEGER);
        pph_phrase_set_category(nbar, pph_utilities.pph_nbar_category(), (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_copy(nbar, phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str262$New_Nbar___S, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 115469L)
    public static SubLObject pph_find_new_category(final SubLObject existing, final SubLObject category, SubLObject on_clash) {
        if (on_clash == pph_phrase.UNPROVIDED) {
            on_clash = (SubLObject)pph_phrase.$kw258$ERROR;
        }
        SubLObject new_category = category;
        if (pph_phrase.NIL != existing) {
            if (pph_phrase.NIL == cycl_utilities.expression_find_if((SubLObject)pph_phrase.$sym263$FORT_P, existing, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
                new_category = existing;
            }
            else if (!existing.equal(category)) {
                if (pph_phrase.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(existing, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const264$Determiner, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_utilities.pph_genl_posP(category, pph_phrase.$const243$Noun, (SubLObject)pph_phrase.UNPROVIDED)) {
                    new_category = existing;
                }
                else if (pph_phrase.NIL != pph_utilities.pph_genl_posP(category, pph_phrase.$const201$NLSentence, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(existing, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const175$Verb, (SubLObject)pph_phrase.UNPROVIDED)) {
                    new_category = category;
                }
                else {
                    final SubLObject old_head_cat = pph_utilities.pph_pos_of_category(existing, (SubLObject)pph_phrase.UNPROVIDED);
                    final SubLObject new_head_cat = pph_phrase_reconcile_categories(pph_utilities.pph_pos_of_category(category, (SubLObject)pph_phrase.UNPROVIDED), old_head_cat, on_clash);
                    final SubLObject phrase_bar_level = lexicon_utilities.maximal_bar_level(existing, category);
                    final SubLObject generic_new_cat = lexicon_utilities.make_cat_with_bar_level(new_head_cat, phrase_bar_level);
                    new_category = ((old_head_cat.equal(new_head_cat) && lexicon_utilities.bar_level(existing, (SubLObject)pph_phrase.UNPROVIDED).eql(phrase_bar_level)) ? pph_phrase_reconcile_categories(existing, generic_new_cat, on_clash) : generic_new_cat);
                }
            }
        }
        return new_category;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 116758L)
    public static SubLObject pph_phrase_reconcile_categories(final SubLObject cat1, final SubLObject cat2, SubLObject on_clash) {
        if (on_clash == pph_phrase.UNPROVIDED) {
            on_clash = (SubLObject)pph_phrase.$kw258$ERROR;
        }
        if (cat1.equal(cat2)) {
            return cat1;
        }
        if (pph_phrase.NIL != pph_better_categoryP(cat1, cat2)) {
            return cat1;
        }
        if (pph_phrase.NIL != pph_better_categoryP(cat2, cat1)) {
            return cat2;
        }
        if (lexicon_utilities.bar_level(cat2, (SubLObject)pph_phrase.UNPROVIDED).numE((SubLObject)pph_phrase.TWO_INTEGER) && pph_phrase.NIL != pph_utilities.pph_genlP(pph_utilities.pph_pos_of_category(cat1, (SubLObject)pph_phrase.UNPROVIDED), pph_utilities.pph_pos_of_category(cat2, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED)) {
            return cat2;
        }
        if (lexicon_utilities.bar_level(cat1, (SubLObject)pph_phrase.UNPROVIDED).numE((SubLObject)pph_phrase.TWO_INTEGER) && pph_phrase.NIL != pph_utilities.pph_genlP(pph_utilities.pph_pos_of_category(cat2, (SubLObject)pph_phrase.UNPROVIDED), pph_utilities.pph_pos_of_category(cat1, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED)) {
            return cat1;
        }
        final SubLObject pcase_var = on_clash;
        if (pcase_var.eql((SubLObject)pph_phrase.$kw258$ERROR)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str265$Don_t_know_how_to_reconcile__S_an) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(cat1, cat2));
            return (SubLObject)pph_phrase.NIL;
        }
        if (pcase_var.eql((SubLObject)pph_phrase.$kw254$RETURN_NIL)) {
            return (SubLObject)pph_phrase.NIL;
        }
        return cat1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 117753L)
    public static SubLObject pph_better_categoryP(final SubLObject cat1, final SubLObject cat2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == cat2 || cat1.isKeyword() || (pph_phrase.NIL != kb_indexing_datastructures.indexed_term_p(cat1) && pph_phrase.NIL != kb_indexing_datastructures.indexed_term_p(cat2) && pph_phrase.NIL != pph_utilities.pph_genl_posP(cat1, cat2, pph_vars.$pph_language_mt$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 118002L)
    public static SubLObject pph_phrase_set_cycl(final SubLObject phrase, final SubLObject cycl) {
        if (pph_phrase.NIL != pph_vars.pph_blacklist_active_p() && pph_phrase.NIL != pph_known_cycl_p(cycl)) {
            final SubLObject string = pph_phrase_noted_string(phrase, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.UNPROVIDED);
            if (pph_phrase.NIL != pph_string.pph_string_p(string) && pph_phrase.NIL != pph_vars.pph_forbidden_string_for_termP(cycl, string)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.TWO_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str233$_S_is_a_forbidden_paraphrase_for_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase_noted_string(phrase, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.UNPROVIDED), cycl));
            }
        }
        pph_data_structures._csetf_pph_phrase_info_cycl(document.sign_info(phrase), cycl);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 118550L)
    public static SubLObject pph_phrase_reset_cycl(final SubLObject phrase, final SubLObject template) {
        if (pph_phrase.NIL == pph_utilities.pph_identity_template_p(template)) {
            final SubLObject cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject arg_position_map = pph_phrase_arg_position_map(phrase);
            pph_phrase_set_cycl(phrase, template);
            pph_phrase_resolution.pph_phrase_replace_generic_args(phrase, cycl, arg_position_map);
        }
        return Values.values(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_arg_position_map(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119216L)
    public static SubLObject pph_unknown_cycl() {
        return pph_phrase.$pph_unknown_cycl$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119283L)
    public static SubLObject pph_unknown_cycl_p(final SubLObject obj) {
        return Equality.eq(obj, pph_phrase.$pph_unknown_cycl$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119364L)
    public static SubLObject pph_known_cycl_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_unknown_cycl_p(obj) && pph_phrase.NIL == pph_empty_cycl_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119639L)
    public static SubLObject pph_empty_cycl() {
        return pph_phrase.$pph_empty_cycl$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119702L)
    public static SubLObject pph_empty_cycl_p(final SubLObject obj) {
        return Equality.eq(obj, pph_phrase.$pph_empty_cycl$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 119779L)
    public static SubLObject pph_phrase_set_link_cycl(final SubLObject phrase, final SubLObject cycl) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw155$LINK_CYCL, (SubLObject)pph_phrase.THREE_INTEGER, cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 120027L)
    public static SubLObject pph_phrase_link_cycl(final SubLObject phrase) {
        final SubLObject explicit = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw155$LINK_CYCL, (SubLObject)pph_phrase.THREE_INTEGER, pph_unknown_cycl());
        if (pph_phrase.NIL != pph_unknown_cycl_p(explicit)) {
            return pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return explicit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 120353L)
    public static SubLObject pph_phrase_cycl(final SubLObject phrase, SubLObject matrix_formula) {
        if (matrix_formula == pph_phrase.UNPROVIDED) {
            matrix_formula = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase) && pph_phrase.NIL != el_utilities.el_formula_p(matrix_formula)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, matrix_formula, pph_phrase_mother(phrase));
            return pph_phrase_cycl(phrase, matrix_formula);
        }
        return pph_data_structures.pph_phrase_info_cycl(document.sign_info(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 120737L)
    public static SubLObject pph_phrase_has_known_cyclP(final SubLObject phrase) {
        return pph_known_cycl_p(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 120845L)
    public static SubLObject pph_phrase_cycl_find_if(final SubLObject phrase, final SubLObject pred) {
        SubLObject ans = cycl_utilities.expression_find_if(pred, pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == ans && pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == ans) {
                        ans = pph_phrase_cycl_find_if(dtr, pred);
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 121230L)
    public static SubLObject pph_phrase_cycl_gather(final SubLObject phrase, final SubLObject pred, SubLObject test) {
        if (test == pph_phrase.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_phrase.EQL);
        }
        SubLObject ans = cycl_utilities.expression_gather(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), pred, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    ans = ConsesLow.append(ans, pph_phrase_cycl_gather(dtr, pred, (SubLObject)pph_phrase.UNPROVIDED));
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return list_utilities.fast_delete_duplicates(ans, test, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 121649L)
    public static SubLObject pph_phrase_gather(final SubLObject phrase, final SubLObject test, SubLObject key) {
        if (key == pph_phrase.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)pph_phrase.IDENTITY);
        }
        SubLObject phrases = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != Functions.funcall(test, Functions.funcall(key, phrase))) {
            phrases = (SubLObject)ConsesLow.cons(phrase, phrases);
        }
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject items_var;
            SubLObject vector_var_$14;
            SubLObject backwardP_var_$15;
            SubLObject length_$16;
            SubLObject v_iteration_$17;
            SubLObject element_num_$18;
            SubLObject item;
            SubLObject cdolist_list_var;
            SubLObject item2;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                items_var = pph_phrase_gather(dtr, test, key);
                if (items_var.isVector()) {
                    vector_var_$14 = items_var;
                    backwardP_var_$15 = (SubLObject)pph_phrase.NIL;
                    for (length_$16 = Sequences.length(vector_var_$14), v_iteration_$17 = (SubLObject)pph_phrase.NIL, v_iteration_$17 = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration_$17.numL(length_$16); v_iteration_$17 = Numbers.add(v_iteration_$17, (SubLObject)pph_phrase.ONE_INTEGER)) {
                        element_num_$18 = ((pph_phrase.NIL != backwardP_var_$15) ? Numbers.subtract(length_$16, v_iteration_$17, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration_$17);
                        item = Vectors.aref(vector_var_$14, element_num_$18);
                        phrases = (SubLObject)ConsesLow.cons(item, phrases);
                    }
                }
                else {
                    cdolist_list_var = items_var;
                    item2 = (SubLObject)pph_phrase.NIL;
                    item2 = cdolist_list_var.first();
                    while (pph_phrase.NIL != cdolist_list_var) {
                        phrases = (SubLObject)ConsesLow.cons(item2, phrases);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 122052L)
    public static SubLObject pph_sole_reference_p(final SubLObject phrase, final SubLObject cycl) {
        final SubLObject mother = pph_phrase_mother(phrase);
        final SubLObject other_reference = pph_phrase_find_other_reference(mother, cycl, phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == other_reference && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str268$Couldn_t_find_another_reference_t, cycl, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return Types.sublisp_null(other_reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 122495L)
    public static SubLObject pph_phrase_find_other_reference(final SubLObject phrase, final SubLObject cycl, final SubLObject besides_phrase, SubLObject done_phrases) {
        if (done_phrases == pph_phrase.UNPROVIDED) {
            done_phrases = set.new_set((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terminalP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_phrase_has_dtrsP(phrase));
        SubLObject other_reference = (SubLObject)pph_phrase.NIL;
        if (phrase.eql(besides_phrase)) {
            other_reference = (SubLObject)pph_phrase.NIL;
        }
        else if (pph_phrase.NIL != set.set_memberP(phrase, done_phrases)) {
            other_reference = (SubLObject)pph_phrase.NIL;
        }
        else if (pph_phrase.NIL != terminalP && cycl.equal(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED))) {
            other_reference = pph_phrase_found_other_reference(phrase, cycl, besides_phrase);
        }
        else if (pph_phrase.NIL != terminalP && pph_phrase.NIL != cycl_utilities.expression_find(cycl, pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == pph_phrase_ancestor_p(phrase, besides_phrase)) {
            other_reference = pph_phrase_found_other_reference(phrase, cycl, besides_phrase);
        }
        if (pph_phrase.NIL == other_reference) {
            set.set_add(phrase, done_phrases);
            if (pph_phrase.NIL == terminalP) {
                SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject found_reference;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                        element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (pph_phrase.NIL == set.set_memberP(dtr, done_phrases) && phrase.eql(pph_phrase_mother(dtr))) {
                            found_reference = pph_phrase_find_other_reference(dtr, cycl, besides_phrase, done_phrases);
                            if (pph_phrase.NIL != found_reference) {
                                other_reference = found_reference;
                            }
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                    }
                }
            }
            if (pph_phrase.NIL == other_reference) {
                final SubLObject mother = pph_phrase_mother(phrase);
                if (pph_phrase.NIL != pph_phrase_p(mother, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == set.set_memberP(mother, done_phrases)) {
                    if (pph_phrase.NIL != Sequences.find(phrase, pph_phrase_dtrs(mother), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
                        final SubLObject found_reference2 = pph_phrase_find_other_reference(mother, cycl, besides_phrase, done_phrases);
                        if (pph_phrase.NIL != found_reference2) {
                            other_reference = found_reference2;
                        }
                    }
                    else if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_phrase.$str269$_S_is_not_a_dtr_of_its_mother____, phrase, mother);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                }
            }
        }
        return other_reference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 124531L)
    public static SubLObject pph_phrase_found_other_reference(final SubLObject phrase, final SubLObject cycl, final SubLObject besides_phrase) {
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str270$__Found_another_reference_to__S__, cycl, besides_phrase, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 124736L)
    public static SubLObject pph_phrase_cycl_subst(final SubLObject v_new, final SubLObject old, final SubLObject phrase, SubLObject test, SubLObject new_arg_position) {
        if (test == pph_phrase.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_phrase.EQL);
        }
        if (new_arg_position == pph_phrase.UNPROVIDED) {
            new_arg_position = (SubLObject)pph_phrase.$kw271$KEEP_OLD_ARG_POSITION;
        }
        SubLObject replacedP = (SubLObject)pph_phrase.NIL;
        final SubLObject penetrate_hl_structuresP = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != cycl_utilities.expression_find(old, pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), penetrate_hl_structuresP, test, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject old_phrase_cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_cycl(phrase, cycl_utilities.expression_subst(v_new, old, old_phrase_cycl, test, (SubLObject)pph_phrase.UNPROVIDED));
            SubLObject new_phrase_cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            new_phrase_cycl = pph_maybe_resolve_formula_arg_expressions(phrase, new_phrase_cycl, v_new, old, old_phrase_cycl, test);
            pph_phrase_cycl_subst_update_on_change(phrase, v_new, old, new_phrase_cycl, new_arg_position);
            replacedP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            pph_conditional_phrase_set_test(phrase, cycl_utilities.expression_subst(v_new, old, pph_conditional_phrase_test(phrase), test, (SubLObject)pph_phrase.UNPROVIDED));
            replacedP = cycl_utilities.expression_find(v_new, pph_conditional_phrase_test(phrase), test, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_replacedP;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    dtr_replacedP = pph_phrase_cycl_subst(v_new, old, dtr, test, new_arg_position);
                    if (pph_phrase.NIL != dtr_replacedP) {
                        replacedP = (SubLObject)pph_phrase.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        if (pph_phrase.NIL != pph_variable_binding_phrase_p(phrase)) {
            final SubLObject old_query_template = pph_variable_binding_phrase_query_template(phrase);
            final SubLObject new_query_template = cycl_utilities.expression_subst(v_new, old, old_query_template, test, (SubLObject)pph_phrase.UNPROVIDED);
            if (!old_query_template.equal(new_query_template)) {
                pph_variable_binding_phrase_set_query_template(phrase, new_query_template);
                replacedP = (SubLObject)pph_phrase.T;
            }
        }
        return replacedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 126434L)
    public static SubLObject pph_maybe_resolve_formula_arg_expressions(final SubLObject phrase, SubLObject new_phrase_cycl, final SubLObject v_new, final SubLObject old, final SubLObject old_phrase_cycl, final SubLObject test) {
        if (pph_phrase.NIL != at_admitted.generic_arg_p(old) && pph_phrase.NIL == pph_utilities.pph_arg_position_specifierP(v_new)) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(old_phrase_cycl, (SubLObject)pph_phrase.$sym272$PPH_ARG_POSITION_SPECIFIER_, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            SubLObject template = (SubLObject)pph_phrase.NIL;
            template = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                if (pph_phrase.NIL != pph_utilities.formula_arg_nautP(template) && pph_phrase.NIL != cycl_utilities.expression_find(old, template, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED)) {
                    new_phrase_cycl = pph_resolve_formula_arg_fn(v_new, old, template, test, new_phrase_cycl);
                }
                pph_phrase_set_cycl(phrase, new_phrase_cycl);
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            }
        }
        return new_phrase_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 127192L)
    public static SubLObject pph_resolve_formula_arg_fn(final SubLObject v_new, final SubLObject old, final SubLObject formula_arg_naut, final SubLObject test, final SubLObject phrase_cycl) {
        final SubLObject formula_arg_naut_with_new = cycl_utilities.expression_subst(v_new, old, formula_arg_naut, test, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject resolved = pph_utilities.pph_apply_template(cycl_utilities.expression_subst((SubLObject)pph_phrase.$kw273$SELF, old, formula_arg_naut, test, (SubLObject)pph_phrase.UNPROVIDED), v_new);
        final SubLObject new_phrase_cycl = cycl_utilities.expression_subst(resolved, formula_arg_naut_with_new, phrase_cycl, test, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str274$Replacing__S_____with__S__, formula_arg_naut_with_new, resolved, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return new_phrase_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 127813L)
    public static SubLObject pph_phrase_cycl_subst_update_on_change(final SubLObject phrase, final SubLObject v_new, final SubLObject old, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        if (pph_phrase.NIL != pph_utilities.pph_arg_position_p(new_arg_position)) {
            pph_phrase_cycl_subst_update_arg_position(phrase, v_new, new_phrase_cycl, new_arg_position);
            pph_phrase_cycl_subst_update_arg_position_map(phrase, v_new, new_phrase_cycl, new_arg_position);
        }
        pph_phrase_cycl_subst_update_output_list_cycl(phrase, v_new, old);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 128457L)
    public static SubLObject pph_phrase_cycl_subst_update_arg_position(final SubLObject phrase, final SubLObject v_new, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        if (new_phrase_cycl.equal(v_new)) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str275$__Setting_arg_position_of__S_to__, v_new, new_arg_position, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            pph_phrase_set_arg_position(phrase, new_arg_position);
        }
        return pph_phrase_arg_position(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 128820L)
    public static SubLObject pph_phrase_cycl_subst_update_arg_position_map(final SubLObject phrase, final SubLObject v_new, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        final SubLObject map = pph_utilities.pph_new_prefix_map(new_arg_position);
        final SubLObject arg_position_in_new_phrase_cycl = (SubLObject)((pph_phrase.NIL != el_utilities.el_formula_p(new_phrase_cycl)) ? cycl_utilities.arg_positions_bfs(v_new, new_phrase_cycl, (SubLObject)pph_phrase.UNPROVIDED).first() : pph_phrase.NIL);
        final SubLObject contextualized_map = pph_utilities.pph_contextualize_map(arg_position_in_new_phrase_cycl, map);
        pph_phrase_set_arg_position_map(phrase, contextualized_map);
        return pph_phrase_arg_position_map(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 129351L)
    public static SubLObject pph_phrase_cycl_subst_update_output_list_cycl(final SubLObject phrase, final SubLObject v_new, final SubLObject old) {
        SubLObject cdolist_list_var = pph_phrase_output_list(phrase);
        SubLObject item = (SubLObject)pph_phrase.NIL;
        item = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            pph_data_structures.pph_phrase_output_item_set_cycl(item, cycl_utilities.expression_subst(v_new, old, pph_data_structures.pph_phrase_output_item_cycl(item), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 129659L)
    public static SubLObject pph_phrase_cycls_of_phrases(final SubLObject the_list) {
        SubLObject cycls = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = the_list;
        SubLObject this_item = (SubLObject)pph_phrase.NIL;
        this_item = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            if (pph_phrase.NIL != pph_phrase_p(this_item, (SubLObject)pph_phrase.UNPROVIDED)) {
                cycls = (SubLObject)ConsesLow.cons(pph_phrase_cycl(this_item, (SubLObject)pph_phrase.UNPROVIDED), cycls);
            }
            else if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_p(this_item)) {
                cycls = (SubLObject)ConsesLow.cons(pph_data_structures.pph_phrase_output_item_cycl(this_item), cycls);
            }
            else if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str276$cycls_of_phrases_doesn_t_know_wha, this_item, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        }
        return Sequences.reverse(cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 130150L)
    public static SubLObject pph_phrase_output_list(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_output_list(document.sign_info(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 130361L)
    public static SubLObject pph_phrase_dtr_output_lists(final SubLObject phrase) {
        SubLObject dtr_olists = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                dtr_olists = (SubLObject)ConsesLow.cons(pph_phrase_output_list(dtr), dtr_olists);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return Sequences.nreverse(dtr_olists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 130683L)
    public static SubLObject pph_phrase_set_output_list(final SubLObject phrase, SubLObject output_list, SubLObject assume_consolidatedP) {
        if (assume_consolidatedP == pph_phrase.UNPROVIDED) {
            assume_consolidatedP = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == assume_consolidatedP) {
            output_list = consolidate_same_arg_items(output_list);
        }
        pph_data_structures._csetf_pph_phrase_info_output_list(document.sign_info(phrase), output_list);
        pph_phrase_clear_noted_strings(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 131114L)
    public static SubLObject consolidate_same_arg_items(final SubLObject output_list) {
        if (pph_phrase.NIL == list_utilities.lengthG(output_list, (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)) {
            return output_list;
        }
        return do_consolidate_same_arg_items(output_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 131281L)
    public static SubLObject do_consolidate_same_arg_items(final SubLObject output_list) {
        SubLObject new_list = (SubLObject)pph_phrase.NIL;
        SubLObject queued_item = (SubLObject)pph_phrase.NIL;
        SubLObject queued_strings = (SubLObject)pph_phrase.NIL;
        SubLObject cdolist_list_var = output_list;
        SubLObject item = (SubLObject)pph_phrase.NIL;
        item = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            if (pph_phrase.NIL != pph_utilities.pph_nl_tagP(pph_data_structures.pph_phrase_output_item_cycl(item)) || pph_phrase.NIL != at_admitted.generic_arg_p(pph_data_structures.pph_phrase_output_item_cycl(item))) {
                final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(item);
                pph_data_structures.pph_phrase_output_item_set_cycl(new_item, pph_unknown_cycl());
                item = new_item;
            }
            final SubLObject item_string = pph_data_structures.pph_phrase_output_item_string(item);
            if (pph_phrase.NIL != queued_item && pph_phrase.NIL != pph_phrase_output_itemE(queued_item, item)) {
                if (pph_phrase.NIL != pph_string.pph_string_p(item_string)) {
                    queued_strings = (SubLObject)ConsesLow.cons(item_string, queued_strings);
                }
                queued_item = pph_phrase_output_item_consolidate_slots(item, queued_item);
            }
            else {
                if (pph_phrase.NIL != queued_item) {
                    if (pph_phrase.NIL != list_utilities.lengthG(queued_strings, (SubLObject)pph_phrase.ZERO_INTEGER, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_nospace_group_p(queued_item)) {
                        queued_item = new_item_from_queued_item(queued_item, queued_strings);
                    }
                    new_list = (SubLObject)ConsesLow.cons(queued_item, new_list);
                }
                queued_item = item;
                queued_strings = (SubLObject)((pph_phrase.NIL != pph_string.pph_string_p(item_string)) ? ConsesLow.list(item_string) : pph_phrase.NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (pph_phrase.NIL != queued_item) {
            if (pph_phrase.NIL != list_utilities.lengthG(queued_strings, (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)) {
                queued_item = new_item_from_queued_item(queued_item, queued_strings);
            }
            new_list = (SubLObject)ConsesLow.cons(queued_item, new_list);
        }
        return Sequences.nreverse(new_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 132626L)
    public static SubLObject new_item_from_queued_item(final SubLObject queued_item, final SubLObject queued_strings) {
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(queued_item);
        final SubLObject new_string = pph_utilities.pph_remove_extra_spaces(pph_utilities.clean_bunge_nreverse(queued_strings, (SubLObject)pph_phrase.UNPROVIDED));
        pph_data_structures.pph_phrase_output_item_set_string(new_item, new_string);
        return new_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 133008L)
    public static SubLObject pph_phrase_output_item_consolidate_slots(final SubLObject item, final SubLObject queued_item) {
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(queued_item);
        final SubLObject arg_position = (pph_phrase.NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(queued_item))) ? pph_data_structures.pph_phrase_output_item_arg_position(item) : pph_data_structures.pph_phrase_output_item_arg_position(queued_item);
        final SubLObject cycl = (pph_phrase.NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(queued_item))) ? pph_data_structures.pph_phrase_output_item_cycl(item) : pph_data_structures.pph_phrase_output_item_cycl(queued_item);
        final SubLObject html_open_tag = (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(queued_item)) ? pph_data_structures.pph_phrase_output_item_html_open_tag(queued_item) : pph_data_structures.pph_phrase_output_item_html_open_tag(item);
        final SubLObject html_close_tag = (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(queued_item)) ? pph_data_structures.pph_phrase_output_item_html_close_tag(queued_item) : pph_data_structures.pph_phrase_output_item_html_close_tag(item);
        final SubLObject agr_pred = (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_agr_pred(queued_item)) ? pph_data_structures.pph_phrase_output_item_agr_pred(queued_item) : pph_data_structures.pph_phrase_output_item_agr_pred(item);
        pph_data_structures.pph_phrase_output_item_set_arg_position(new_item, arg_position);
        pph_data_structures.pph_phrase_output_item_set_cycl(new_item, cycl);
        pph_data_structures.pph_phrase_output_item_set_html_tags(new_item, html_open_tag, html_close_tag);
        pph_data_structures.pph_phrase_output_item_set_agr_pred(new_item, agr_pred);
        return new_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 134334L)
    public static SubLObject pph_phrase_output_itemE(final SubLObject item1, final SubLObject item2) {
        if (pph_phrase.NIL != pph_phrase_output_items_html_unmergeableP(item1, item2)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item1) || pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item2)) {
            return (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_data_structures.pph_phrase_output_item_string(item2).isString() && pph_phrase.NIL != list_utilities.lengthE(pph_data_structures.pph_phrase_output_item_string(item2), (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_utilities.pph_remove_space_beforeP(pph_data_structures.pph_phrase_output_item_string(item2), (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_arg_position(item1) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item1) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item2) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item2)) || (pph_phrase.NIL != pph_bare_string_output_item_p(item2, (SubLObject)pph_phrase.NIL) && pph_phrase.NIL != pph_arg0_item_p(item1)) || (pph_phrase.NIL != pph_bare_string_output_item_p(item1, (SubLObject)pph_phrase.NIL) && pph_phrase.NIL != pph_arg0_item_p(item2)) || (((pph_phrase.NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item1)) && pph_phrase.NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item2))) || pph_phrase.NIL != pph_arg0_item_p(item1) || pph_phrase.NIL != pph_arg0_item_p(item2) || pph_data_structures.pph_phrase_output_item_arg_position(item1).equal(pph_data_structures.pph_phrase_output_item_arg_position(item2))) && (pph_phrase.NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item1)) || pph_phrase.NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item2)) || pph_data_structures.pph_phrase_output_item_cycl(item1).equal(pph_data_structures.pph_phrase_output_item_cycl(item2))) && ((pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item1) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item2)) || pph_data_structures.pph_phrase_output_item_html_open_tag(item1).equal(pph_data_structures.pph_phrase_output_item_html_open_tag(item2))) && ((pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item1) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item2)) || pph_data_structures.pph_phrase_output_item_html_close_tag(item1).equal(pph_data_structures.pph_phrase_output_item_html_close_tag(item2)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 136481L)
    public static SubLObject pph_phrase_output_items_html_unmergeableP(final SubLObject item1, final SubLObject item2) {
        SubLObject okP = (SubLObject)pph_phrase.T;
        if (pph_phrase.NIL != pph_phrase_output_items_have_identical_closed_htmlP(item1, item2)) {
            okP = (SubLObject)pph_phrase.T;
        }
        else if (pph_phrase.NIL != pph_phrase_output_item_has_non_anchor_tagP(item1) || pph_phrase.NIL != pph_phrase_output_item_has_non_anchor_tagP(item2)) {
            okP = (SubLObject)pph_phrase.NIL;
        }
        else if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(item1) && pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(item2)) {
            okP = (SubLObject)pph_phrase.NIL;
        }
        else if (pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(item1) && pph_phrase.NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(item2)) {
            okP = (SubLObject)pph_phrase.NIL;
        }
        else if (pph_phrase.NIL == pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && (pph_phrase.NIL != pph_arg0_item_p(item1) || pph_phrase.NIL != pph_arg0_item_p(item2))) {
            okP = (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 137272L)
    public static SubLObject pph_phrase_output_item_has_non_anchor_tagP(final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_data_structures.pph_phrase_output_item_html_open_tag(item).isString() && pph_phrase.NIL != string_utilities.non_empty_string_p(pph_utilities.pph_remove_html_tags(pph_data_structures.pph_phrase_output_item_html_open_tag(item), (SubLObject)pph_phrase.T))) || (pph_data_structures.pph_phrase_output_item_html_close_tag(item).isString() && pph_phrase.NIL != string_utilities.non_empty_string_p(pph_utilities.pph_remove_html_tags(pph_data_structures.pph_phrase_output_item_html_close_tag(item), (SubLObject)pph_phrase.T))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 137671L)
    public static SubLObject pph_phrase_output_items_have_identical_closed_htmlP(final SubLObject item1, final SubLObject item2) {
        final SubLObject open1 = pph_data_structures.pph_phrase_output_item_html_open_tag(item1);
        final SubLObject open2 = pph_data_structures.pph_phrase_output_item_html_open_tag(item2);
        final SubLObject close1 = pph_data_structures.pph_phrase_output_item_html_close_tag(item1);
        final SubLObject close2 = pph_data_structures.pph_phrase_output_item_html_close_tag(item2);
        return pph_identical_closed_html_tagsP(open1, open2, close1, close2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 138058L)
    public static SubLObject pph_identical_closed_html_tagsP(final SubLObject open1, final SubLObject open2, final SubLObject close1, final SubLObject close2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != string_utilities.non_empty_stringP(open1) && pph_phrase.NIL != string_utilities.non_empty_stringP(open2) && pph_phrase.NIL != string_utilities.non_empty_stringP(close1) && pph_phrase.NIL != string_utilities.non_empty_stringP(close2) && open1.equalp(open2) && close1.equalp(close2) && pph_phrase.NIL != pph_utilities.pph_closed_html_tagsP(open1, close1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 138374L)
    public static SubLObject pph_current_arg0() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_arg0 = (pph_phrase.NIL != pph_current_arg0_specified_p()) ? pph_vars.$pph_current_arg0$.getDynamicValue(thread) : pph_unknown_cycl();
        return current_arg0;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 138623L)
    public static SubLObject pph_current_arg0_specified_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)pph_phrase.$sym263$FORT_P), pph_vars.$pph_current_arg0$.getDynamicValue(thread), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 138732L)
    public static SubLObject pph_current_arg0_position() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_phrase.NIL != pph_utilities.pph_arg_position_p(pph_vars.$pph_current_arg0_position$.getDynamicValue(thread))) ? pph_vars.$pph_current_arg0_position$.getDynamicValue(thread) : pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 138958L)
    public static SubLObject pph_phrase_maybe_reserve_for_arg0(final SubLObject phrase) {
        final SubLObject current_cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL == pph_utilities.pph_arg_position_specifierP(current_cycl) && pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 139441L)
    public static SubLObject pph_phrase_set_cycl_to_current_arg0(final SubLObject phrase) {
        if (pph_phrase.NIL == pph_current_arg0_specified_p()) {
            pph_phrase_set_cycl(phrase, pph_current_arg0());
            pph_phrase_set_output_list_cycl(phrase, pph_current_arg0());
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 139736L)
    public static SubLObject pph_arg0_item_p(final SubLObject item) {
        return pph_arg0_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 139850L)
    public static SubLObject pph_arg0_position_p(final SubLObject arg_position) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_utilities.pph_unknown_arg_position_p(arg_position) && conses_high.last(arg_position, (SubLObject)pph_phrase.UNPROVIDED).equal((SubLObject)pph_phrase.$list4));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 140008L)
    public static SubLObject pph_bare_string_output_item_p(final SubLObject item, final SubLObject allow_punctuationP) {
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_phrase.NIL != allow_punctuationP || pph_phrase.NIL == pph_string.pph_string_p(pph_data_structures.pph_phrase_output_item_string(item)) || pph_phrase.NIL != pph_string.pph_string_find_if((SubLObject)pph_phrase.$sym277$ALPHANUMERIC_CHAR_P, pph_data_structures.pph_phrase_output_item_string(item))) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item) && pph_phrase.NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item) && pph_phrase.NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item)) && pph_phrase.NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 140551L)
    public static SubLObject pph_phrase_set_output_list_with_map(final SubLObject phrase, final SubLObject output_list) {
        pph_phrase_set_output_list(phrase, output_list, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject map = pph_phrase_arg_position_map(phrase);
        SubLObject cdolist_list_var = pph_phrase_output_list(phrase);
        SubLObject item = (SubLObject)pph_phrase.NIL;
        item = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, pph_utilities.pph_arg_position_lookup(pph_data_structures.pph_phrase_output_item_arg_position(item), map));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 140966L)
    public static SubLObject pph_phrase_consolidate_output_list(final SubLObject phrase, SubLObject arg_position, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr_pred) {
        if (arg_position == pph_phrase.UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (html_open_tag == pph_phrase.UNPROVIDED) {
            html_open_tag = (SubLObject)pph_phrase.NIL;
        }
        if (html_close_tag == pph_phrase.UNPROVIDED) {
            html_close_tag = (SubLObject)pph_phrase.NIL;
        }
        if (agr_pred == pph_phrase.UNPROVIDED) {
            agr_pred = pph_phrase_agr_pred(phrase);
        }
        final SubLObject demerits = pph_phrase_demerits(phrase);
        final SubLObject justification = pph_phrase_justification(phrase);
        SubLObject new_list = (SubLObject)pph_phrase.NIL;
        if (pph_phrase.NIL != list_utilities.singletonP(pph_phrase_output_list(phrase))) {
            final SubLObject original_item = pph_phrase_output_list(phrase).first();
            final SubLObject output_item = (pph_phrase.NIL != pph_data_structures.enhanced_pph_output_item_p(original_item)) ? original_item : pph_data_structures.new_enhanced_pph_output_item(original_item, demerits, justification);
            if (pph_phrase.NIL != pph_data_structures.enhanced_pph_output_item_p(original_item)) {
                pph_data_structures.enhanced_pph_output_item_set_demerits(output_item, demerits);
                pph_data_structures.enhanced_pph_output_item_set_justification(output_item, justification);
            }
            pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, arg_position);
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, html_open_tag, html_close_tag);
            pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, agr_pred);
            new_list = (SubLObject)ConsesLow.list(output_item);
        }
        else {
            final SubLObject string = pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL);
            final SubLObject cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
            final SubLObject item_string = (pph_phrase.NIL != pph_string.pph_string_p(string)) ? string : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject consolidated_item = pph_data_structures.new_enhanced_pph_output_item(pph_data_structures.new_pph_phrase_output_item(item_string, arg_position, cycl, html_open_tag, html_close_tag, agr_pred), demerits, justification);
            new_list = (SubLObject)ConsesLow.list(consolidated_item);
        }
        pph_phrase_set_output_list(phrase, new_list, (SubLObject)pph_phrase.UNPROVIDED);
        return pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 142557L)
    public static SubLObject pph_consolidate_output_items(final SubLObject items, SubLObject string, SubLObject cycl, SubLObject arg_position, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr_pred, SubLObject nospaceP) {
        if (string == pph_phrase.UNPROVIDED) {
            string = (SubLObject)pph_phrase.$kw278$COMPUTE;
        }
        if (cycl == pph_phrase.UNPROVIDED) {
            cycl = pph_unknown_cycl();
        }
        if (arg_position == pph_phrase.UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (html_open_tag == pph_phrase.UNPROVIDED) {
            html_open_tag = (SubLObject)pph_phrase.NIL;
        }
        if (html_close_tag == pph_phrase.UNPROVIDED) {
            html_close_tag = (SubLObject)pph_phrase.NIL;
        }
        if (agr_pred == pph_phrase.UNPROVIDED) {
            agr_pred = (SubLObject)pph_phrase.NIL;
        }
        if (nospaceP == pph_phrase.UNPROVIDED) {
            nospaceP = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != list_utilities.singletonP(items)) {
            final SubLObject output_item = items.first();
            pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, arg_position);
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, html_open_tag, html_close_tag);
            pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, agr_pred);
            return output_item;
        }
        final SubLObject item_string = (pph_phrase.NIL != pph_string.pph_string_p(string)) ? string : pph_utilities.clean_bunge_nreverse(Mapping.mapcar((SubLObject)pph_phrase.$sym226$PPH_PHRASE_OUTPUT_ITEM_STRING, Sequences.reverse(items), new SubLObject[] { nospaceP }), (SubLObject)pph_phrase.UNPROVIDED);
        return pph_data_structures.new_pph_phrase_output_item(item_string, arg_position, cycl, html_open_tag, html_close_tag, agr_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 143462L)
    public static SubLObject new_pph_phrase_output_list(final SubLObject string, SubLObject open_tag, SubLObject close_tag, SubLObject agr_pred) {
        if (open_tag == pph_phrase.UNPROVIDED) {
            open_tag = (SubLObject)pph_phrase.NIL;
        }
        if (close_tag == pph_phrase.UNPROVIDED) {
            close_tag = (SubLObject)pph_phrase.NIL;
        }
        if (agr_pred == pph_phrase.UNPROVIDED) {
            agr_pred = (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item(string, pph_utilities.pph_unknown_arg_position(), pph_unknown_cycl(), open_tag, close_tag, agr_pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 143707L)
    public static SubLObject pph_phrase_agr(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_data_structures.pph_phrase_info_agr(document.sign_info(phrase));
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = (SubLObject)pph_phrase.NIL;
            SubLObject first_agr = (SubLObject)pph_phrase.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == pph_data_structures.pph_phrase_agr_p(first_agr)) {
                        first_agr = pph_phrase_agr(dtr);
                    }
                    else if (!first_agr.equalp(pph_phrase_agr(dtr))) {
                        badP = (SubLObject)pph_phrase.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return (SubLObject)((pph_phrase.NIL != badP) ? pph_phrase.NIL : first_agr);
        }
        if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            return phrase_agr;
        }
        if (pph_phrase.NIL == pph_phrase_has_head_dtrP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        final SubLObject head_agr = pph_phrase_agr(pph_phrase_head_dtr(phrase));
        if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(head_agr)) {
            final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(head_agr);
            final SubLObject phrase_agr_$19 = pph_data_structures.new_pph_phrase_agr(abcon, (SubLObject)pph_phrase.UNPROVIDED);
            pph_phrase_set_agr(phrase, phrase_agr_$19, (SubLObject)pph_phrase.NIL);
            return phrase_agr_$19;
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 144665L)
    public static SubLObject pph_phrase_absolute_agr_preds(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase.$kw279$POS_PRED)) {
            return (SubLObject)ConsesLow.list(pph_phrase_agr_target_of_type(phrase, (SubLObject)pph_phrase.$kw279$POS_PRED));
        }
        if (pph_phrase.NIL != pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase.$kw280$NL_PREDS)) {
            return pph_phrase_agr_target_of_type(phrase, (SubLObject)pph_phrase.$kw280$NL_PREDS);
        }
        if (pph_phrase.NIL != pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase.$kw281$DONT_CARE)) {
            return (SubLObject)pph_phrase.$kw240$ANY;
        }
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str282$Bad_agr_value__S__, pph_phrase_agr(phrase));
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return (SubLObject)pph_phrase.$kw240$ANY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 145249L)
    public static SubLObject pph_phrase_set_agr(final SubLObject phrase, final SubLObject agr, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(agr);
        if (pph_phrase.NIL != pph_utilities.pph_peer_agr_constraint_p(relative_constraint) && pph_phrase.NIL != new_pph_phrase_p(pph_utilities.pph_agr_constraint_target(relative_constraint)) && pph_phrase.NIL == new_pph_phrase_p(phrase)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str283$New_target__S___for_non_new_phras) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_utilities.pph_agr_constraint_target(relative_constraint), phrase));
        }
        if (pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL != descend_into_metaP) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_agr(dtr, agr, (SubLObject)pph_phrase.UNPROVIDED);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        else {
            if (pph_phrase.NIL != pph_phrase_agr(phrase) && pph_phrase.NIL == pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase_agr(phrase)) && pph_phrase.NIL != pph_data_structures.dont_care_pph_phrase_agr_p(agr) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str284$Don_t_careifying__S, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            pph_data_structures._csetf_pph_phrase_info_agr(document.sign_info(phrase), agr);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 146263L)
    public static SubLObject pph_phrase_clear_relative_agr(final SubLObject phrase, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        final SubLObject existing = pph_phrase_agr(phrase);
        final SubLObject v_new = pph_data_structures.pph_phrase_agr_copy(existing, (SubLObject)pph_phrase.UNPROVIDED);
        pph_data_structures.pph_phrase_agr_set_relative_constraint(v_new, (SubLObject)pph_phrase.NIL);
        pph_phrase_set_agr(phrase, v_new, descend_into_metaP);
        return pph_phrase_agr(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 146587L)
    public static SubLObject pph_phrase_set_agr_constraint(final SubLObject phrase, final SubLObject agr_constraint, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL == pph_utilities.pph_dont_care_agr_constraint_p(agr_constraint) && pph_phrase.NIL == pph_utilities.pph_impossible_agr_constraint_p(agr_constraint) && pph_phrase.NIL == pph_utilities.pph_agr_constraint_target(agr_constraint)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str285$Bad_agr_constraint___S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(agr_constraint));
        }
        if (pph_phrase.NIL != list_utilities.singletonP(pph_utilities.pph_agr_constraint_target(agr_constraint))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str286$Singleton_agr_constraint_target__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(agr_constraint));
        }
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        if (pph_phrase.NIL != pph_utilities.pph_absolute_agr_constraint_p(agr_constraint)) {
            if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
                pph_data_structures.pph_phrase_agr_set_absolute_constraint(phrase_agr, agr_constraint);
            }
            else {
                pph_phrase_set_agr(phrase, pph_data_structures.new_pph_phrase_agr(agr_constraint, (SubLObject)pph_phrase.UNPROVIDED), descend_into_metaP);
            }
        }
        else if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            pph_data_structures.pph_phrase_agr_set_relative_constraint(phrase_agr, agr_constraint);
        }
        else if (pph_phrase.NIL == pph_meta_phrase_p(phrase)) {
            pph_phrase_set_agr(phrase, pph_data_structures.new_pph_phrase_agr((SubLObject)pph_phrase.NIL, agr_constraint), (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != pph_meta_phrase_p(phrase) && pph_phrase.NIL != descend_into_metaP) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_agr_constraint(dtr, agr_constraint, (SubLObject)pph_phrase.UNPROVIDED);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 147994L)
    public static SubLObject pph_phrase_set_agr_pred(final SubLObject phrase, final SubLObject pred, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        final SubLObject output_list = pph_phrase_output_list(phrase);
        if (pph_phrase.NIL != list_utilities.singletonP(output_list)) {
            final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            pph_data_structures.pph_phrase_output_item_set_agr_pred(new_item, pred);
            pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.list(new_item), (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)pph_phrase.UNPROVIDED) && !pph_phrase.$const264$Determiner.eql(pph_utilities.pph_pos_of_category(pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED))) {
            final SubLObject descend_into_metaP_$20 = (SubLObject)pph_phrase.T;
            final SubLObject override_existingP = (SubLObject)pph_phrase.T;
            pph_phrase_update_category(phrase, lexicon_accessors.pos_of_pred(pred), descend_into_metaP_$20, override_existingP);
        }
        return pph_phrase_set_agr_preds(phrase, (SubLObject)ConsesLow.list(pred), descend_into_metaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 148844L)
    public static SubLObject pph_phrase_set_agr_pred_unless_nil(final SubLObject phrase, final SubLObject agr_pred) {
        if (pph_phrase.NIL != agr_pred) {
            pph_phrase_set_agr_pred(phrase, agr_pred, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 148993L)
    public static SubLObject pph_phrase_add_agr_pred(final SubLObject phrase, final SubLObject agr_pred) {
        return pph_phrase_add_agr_preds(phrase, (SubLObject)ConsesLow.list(agr_pred), (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 149206L)
    public static SubLObject pph_phrase_add_agr_preds(final SubLObject phrase, final SubLObject agr_preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != descend_into_metaP && pph_phrase.NIL != pph_meta_phrase_p(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_add_agr_preds(dtr, agr_preds, (SubLObject)pph_phrase.T);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        else {
            pph_add_agr_preds_to_phrase_agr(agr_preds, pph_phrase_agr(phrase));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 149650L)
    public static SubLObject pph_add_agr_preds_to_phrase_agr(final SubLObject agr_preds, final SubLObject phrase_agr) {
        final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject new_constraint = pph_add_agr_preds_to_agr_constraint(agr_preds, absolute_constraint);
        pph_data_structures.pph_phrase_agr_set_absolute_constraint(phrase_agr, new_constraint);
        return phrase_agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 150155L)
    public static SubLObject pph_add_agr_preds_to_agr_constraint(final SubLObject agr_preds, final SubLObject absolute_constraint) {
        if (pph_phrase.NIL != pph_utilities.pph_dont_care_agr_constraint_p(absolute_constraint)) {
            return pph_phrase_agr_constraint_for_preds(agr_preds);
        }
        if (pph_phrase.$kw240$ANY == agr_preds) {
            return absolute_constraint;
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = pph_utilities.pph_agr_constraint_type(absolute_constraint);
        if (pcase_var.eql((SubLObject)pph_phrase.$kw281$DONT_CARE)) {
            return absolute_constraint;
        }
        if (pcase_var.eql((SubLObject)pph_phrase.$kw280$NL_PREDS)) {
            return pph_add_agr_preds_to_nl_preds(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql((SubLObject)pph_phrase.$kw279$POS_PRED)) {
            return pph_add_agr_preds_to_pos_pred(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql((SubLObject)pph_phrase.$kw287$SUBJECT_VERB)) {
            return pph_add_agr_preds_to_subject_verb(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql((SubLObject)pph_phrase.$kw288$DET_NBAR)) {
            return pph_add_agr_preds_to_det_nbar(absolute_constraint, agr_preds);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 150887L)
    public static SubLObject pph_add_agr_preds_to_subject_verb(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_add_agr_preds_to_relative_agr_constraint(agr_constraint, agr_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 151131L)
    public static SubLObject pph_add_agr_preds_to_det_nbar(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_add_agr_preds_to_relative_agr_constraint(agr_constraint, agr_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 151367L)
    public static SubLObject pph_add_agr_preds_to_relative_agr_constraint(final SubLObject agr_constraint, final SubLObject agr_preds) {
        final SubLObject target = pph_utilities.pph_agr_constraint_target(agr_constraint);
        if (pph_phrase.NIL != pph_utilities.pph_nth_phrase_p(target)) {
            return pph_utilities.new_pph_agr_constraint(pph_utilities.pph_agr_constraint_type(agr_constraint), pph_utilities.pph_add_constraints_to_nth_phrase(target, agr_preds));
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str289$__Can_t_add_new_constraints__S_to) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(agr_preds, agr_constraint));
        return agr_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 151947L)
    public static SubLObject pph_add_agr_preds_to_nl_preds(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_utilities.new_pph_agr_constraint(pph_utilities.pph_agr_constraint_type(agr_constraint), ConsesLow.append(pph_utilities.pph_agr_constraint_target(agr_constraint), agr_preds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 152249L)
    public static SubLObject pph_add_agr_preds_to_pos_pred(final SubLObject agr_constraint, final SubLObject agr_preds) {
        final SubLObject total_agr = pph_utilities.pph_filter_preds((SubLObject)ConsesLow.list(pph_utilities.pph_agr_constraint_target(agr_constraint)), agr_preds, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != list_utilities.singletonP(total_agr)) {
            return pph_utilities.new_pph_agr_constraint((SubLObject)pph_phrase.$kw279$POS_PRED, total_agr.first());
        }
        return pph_utilities.new_pph_agr_constraint((SubLObject)pph_phrase.$kw280$NL_PREDS, total_agr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 152654L)
    public static SubLObject pph_phrase_set_absolute_agr_preds(final SubLObject phrase, final SubLObject preds) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject absolute_contstraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        if (pph_phrase.NIL != pph_utilities.pph_nth_phrase_p(pph_utilities.pph_agr_constraint_target(absolute_contstraint))) {
            pph_utilities.set_pph_nth_phrase_constraints(pph_utilities.pph_agr_constraint_target(absolute_contstraint), preds);
        }
        else {
            pph_phrase_set_agr_preds(phrase, preds, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 153150L)
    public static SubLObject pph_phrase_update_agr_preds(final SubLObject phrase, final SubLObject preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (preds.isList()) {
            if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
                SubLObject cdolist_list_var = pph_conditional_phrase_values(phrase);
                SubLObject option = (SubLObject)pph_phrase.NIL;
                option = cdolist_list_var.first();
                while (pph_phrase.NIL != cdolist_list_var) {
                    pph_phrase_update_agr_preds(option, preds, descend_into_metaP);
                    cdolist_list_var = cdolist_list_var.rest();
                    option = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject existing = pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED);
                final SubLObject v_new = pph_utilities.pph_filter_ordered_preds(preds, existing, (SubLObject)pph_phrase.UNPROVIDED);
                pph_phrase_set_agr_preds(phrase, v_new, descend_into_metaP);
                if (!existing.equal(v_new) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str290$__Updated_agr_preds_from__S_to__S, existing, pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 153887L)
    public static SubLObject pph_phrase_set_agr_preds(final SubLObject phrase, final SubLObject preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        pph_phrase_set_agr_constraint(phrase, pph_phrase_agr_constraint_for_preds(preds), descend_into_metaP);
        final SubLObject olist = pph_phrase_output_list(phrase);
        if (pph_phrase.NIL != list_utilities.singletonP(olist) && pph_phrase.NIL != list_utilities.singletonP(preds)) {
            pph_data_structures.pph_phrase_output_item_set_agr_pred(olist.first(), preds.first());
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 154352L)
    public static SubLObject pph_phrase_set_relative_agr_target(final SubLObject phrase, final SubLObject target) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject constraint_type = pph_utilities.pph_agr_constraint_type(relative_constraint);
        if (pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(relative_constraint)) {
            pph_phrase_set_agr_constraint(phrase, pph_utilities.new_pph_agr_constraint(constraint_type, target), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 154832L)
    public static SubLObject pph_phrase_agr_constraint_for_preds(final SubLObject preds) {
        if (preds == pph_phrase.$kw240$ANY) {
            return pph_utilities.new_pph_dont_care_agr_constraint();
        }
        if (!preds.isList()) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str291$_S_should_be_a_list_of_speech_par) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(preds));
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != list_utilities.singletonP(preds)) {
            return pph_utilities.new_pph_agr_constraint((SubLObject)pph_phrase.$kw279$POS_PRED, preds.first());
        }
        if (pph_phrase.NIL == preds) {
            return pph_utilities.new_pph_impossible_agr_constraint();
        }
        if (preds.isList()) {
            return pph_utilities.new_pph_agr_constraint((SubLObject)pph_phrase.$kw280$NL_PREDS, preds);
        }
        return pph_utilities.new_pph_dont_care_agr_constraint();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 155353L)
    public static SubLObject pph_phrase_check_impossible(final SubLObject phrase, SubLObject check_dtrsP) {
        if (check_dtrsP == pph_phrase.UNPROVIDED) {
            check_dtrsP = (SubLObject)pph_phrase.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_phrase_impossible_p(phrase, check_dtrsP) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str292$Impossible_phrase_____S__, phrase);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 155558L)
    public static SubLObject pph_phrase_impossible_p(final SubLObject phrase, SubLObject check_dtrsP) {
        if (check_dtrsP == pph_phrase.UNPROVIDED) {
            check_dtrsP = (SubLObject)pph_phrase.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_phrase_doneP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_special_type(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_utilities.pph_impossible_agr_constraint_p(pph_phrase_agr_constraint_of_type(phrase, (SubLObject)pph_phrase.$kw293$IMPOSSIBLE))) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_phrase.$str294$Impossible_because_of_agr_constra, phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_phrase_has_known_cyclP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            if (pph_phrase.NIL != check_dtrsP) {
                if (pph_phrase.NIL == pph_variable_binding_phrase_p(phrase)) {
                    if (pph_phrase.NIL == pph_repeated_phrase_p(phrase)) {
                        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
                            SubLObject possible_option = (SubLObject)pph_phrase.NIL;
                            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
                            if (document.sign_constituents(phrase).isVector()) {
                                final SubLObject vector_var = document.sign_constituents(phrase);
                                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject dtr;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                                    dtr = Vectors.aref(vector_var, element_num);
                                    if (pph_phrase.NIL == possible_option && pph_phrase.NIL == pph_phrase_impossible_p(dtr, check_dtrsP)) {
                                        possible_option = dtr;
                                    }
                                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                                }
                            }
                            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == possible_option);
                        }
                        SubLObject dtr_num2 = (SubLObject)pph_phrase.ZERO_INTEGER;
                        if (document.sign_constituents(phrase).isVector()) {
                            final SubLObject vector_var2 = document.sign_constituents(phrase);
                            final SubLObject backwardP_var2 = (SubLObject)pph_phrase.NIL;
                            SubLObject length2;
                            SubLObject v_iteration2;
                            SubLObject element_num2;
                            SubLObject dtr2;
                            for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)pph_phrase.NIL, v_iteration2 = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)pph_phrase.ONE_INTEGER)) {
                                element_num2 = ((pph_phrase.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration2);
                                dtr2 = Vectors.aref(vector_var2, element_num2);
                                if (pph_phrase.NIL != pph_phrase_impossible_p(dtr2, (SubLObject)pph_phrase.UNPROVIDED)) {
                                    return (SubLObject)pph_phrase.T;
                                }
                                dtr_num2 = Numbers.add(dtr_num2, (SubLObject)pph_phrase.ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return (SubLObject)pph_phrase.NIL;
        }
        return (SubLObject)pph_phrase.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 156661L)
    public static SubLObject pph_phrase_get_absolute_agr_from_phrase(final SubLObject phrase) {
        final SubLObject new_preds = pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        return pph_phrase_agr_constraint_for_preds(new_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 156841L)
    public static SubLObject pph_phrase_set_absolute_agr_from_phrase(final SubLObject phrase) {
        final SubLObject new_absolute_agr = pph_phrase_get_absolute_agr_from_phrase(phrase);
        final SubLObject descend_into_metaP = (SubLObject)pph_phrase.NIL;
        pph_phrase_set_agr_constraint(phrase, new_absolute_agr, descend_into_metaP);
        return pph_phrase_absolute_agr_preds(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 157142L)
    public static SubLObject pph_phrase_has_agr_constraint_type_p(final SubLObject phrase, final SubLObject constraint_type) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        if (pph_phrase.NIL == pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            return (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_utilities.pph_absolute_agr_constraint_typeP(constraint_type)) {
            return Equality.eq(constraint_type, pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr)));
        }
        return Equality.eq(constraint_type, pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 157710L)
    public static SubLObject pph_phrase_agr_constraint_of_type(final SubLObject phrase, final SubLObject constraint_type) {
        final SubLObject phrase_agr = pph_data_structures.pph_phrase_info_agr(document.sign_info(phrase));
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = (SubLObject)pph_phrase.NIL;
            SubLObject first_agr_constraint = (SubLObject)pph_phrase.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == pph_data_structures.pph_phrase_agr_p(first_agr_constraint)) {
                        first_agr_constraint = pph_phrase_agr_constraint_of_type(dtr, constraint_type);
                    }
                    else if (!first_agr_constraint.equal(pph_phrase_agr_constraint_of_type(dtr, constraint_type))) {
                        badP = (SubLObject)pph_phrase.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return (SubLObject)((pph_phrase.NIL != badP) ? pph_phrase.NIL : first_agr_constraint);
        }
        if (pph_phrase.NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            final SubLObject candidate = (pph_phrase.NIL != pph_utilities.pph_absolute_agr_constraint_typeP(constraint_type)) ? pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr) : pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
            return (SubLObject)((pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(candidate) && pph_utilities.pph_agr_constraint_type(candidate).eql(constraint_type)) ? candidate : pph_phrase.NIL);
        }
        if (pph_phrase.NIL != pph_utilities.pph_inheritable_agr_constraint_typeP(constraint_type) && pph_phrase.NIL != pph_phrase_has_head_dtrP(phrase)) {
            final SubLObject head_constraint = pph_phrase_agr_constraint_of_type(pph_phrase_head_dtr(phrase), constraint_type);
            return head_constraint;
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 159200L)
    public static SubLObject pph_phrase_agr_target_of_type(final SubLObject phrase, final SubLObject constraint_type) {
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = (SubLObject)pph_phrase.NIL;
            SubLObject first_target = (SubLObject)pph_phrase.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == first_target) {
                        first_target = pph_phrase_agr_target_of_type(dtr, constraint_type);
                    }
                    else if (!first_target.equal(pph_phrase_agr_target_of_type(dtr, constraint_type))) {
                        badP = (SubLObject)pph_phrase.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return (SubLObject)((pph_phrase.NIL != badP) ? pph_phrase.NIL : first_target);
        }
        final SubLObject agr = pph_phrase_agr_constraint_of_type(phrase, constraint_type);
        return (SubLObject)((pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(agr)) ? pph_utilities.pph_agr_constraint_target(agr) : pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 160026L)
    public static SubLObject pph_phrase_agr_pred(final SubLObject phrase) {
        final SubLObject pos_pred_constraint = pph_phrase_agr_constraint_of_type(phrase, (SubLObject)pph_phrase.$kw279$POS_PRED);
        SubLObject agr_pred = (SubLObject)((pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(pos_pred_constraint)) ? pph_utilities.pph_agr_constraint_target(pos_pred_constraint) : pph_phrase.NIL);
        if (pph_phrase.NIL == agr_pred && pph_phrase.NIL != pph_phrase_has_head_dtrP(phrase)) {
            agr_pred = pph_phrase_agr_pred(pph_phrase_head_dtr(phrase));
        }
        return agr_pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 160575L)
    public static SubLObject pph_phrase_category_unknown_p(final SubLObject phrase) {
        final SubLObject phrase_category = pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == phrase_category || pph_phrase.$kw240$ANY == phrase_category);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 160764L)
    public static SubLObject pph_phrase_agr_preds(final SubLObject phrase, SubLObject allow_coercionP) {
        if (allow_coercionP == pph_phrase.UNPROVIDED) {
            allow_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase)) {
            return pph_conditional_phrase_agr_preds(phrase);
        }
        final SubLObject preds_from_agr = pph_phrase_agr_preds_from_agr(phrase);
        final SubLObject phrase_category = pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject category_can_be_coercedP = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != allow_coercionP && (pph_phrase.NIL != pph_phrase_category_unknown_p(phrase) || (pph_phrase.ZERO_INTEGER.eql(lexicon_utilities.bar_level(phrase_category, pph_vars.$pph_language_mt$.getDynamicValue(thread))) && pph_phrase.NIL == lexicon_accessors.closed_lexical_classP(phrase_category, (SubLObject)pph_phrase.UNPROVIDED))));
        final SubLObject preds_from_category = (SubLObject)((pph_phrase.NIL != category_can_be_coercedP) ? pph_phrase.$kw240$ANY : pph_phrase_agr_preds_from_category(phrase));
        final SubLObject preds_from_head = pph_phrase_agr_preds_from_head(phrase);
        final SubLObject initial_filtered = pph_utilities.pph_filter_preds(preds_from_agr, preds_from_head, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject filtered = pph_utilities.pph_filter_preds(initial_filtered, preds_from_category, (SubLObject)pph_phrase.UNPROVIDED);
        if (initial_filtered.isList() && !filtered.equal(initial_filtered) && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str295$Removed__S_from__S___based_on_cat, conses_high.set_difference(initial_filtered, filtered, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED), initial_filtered, pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED), filtered, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        if (pph_phrase.NIL == filtered && pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_phrase.$str296$Can_t_reconcile__S_and__S_and__S_, new SubLObject[] { preds_from_agr, preds_from_head, preds_from_category, phrase });
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return filtered;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 162242L)
    public static SubLObject pph_phrase_agr_preds_from_agr(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        SubLObject absolute_preds = (SubLObject)pph_phrase.$kw240$ANY;
        SubLObject relative_preds = (SubLObject)pph_phrase.$kw240$ANY;
        if (pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(absolute_constraint)) {
            final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(absolute_constraint);
            if (pcase_var.eql((SubLObject)pph_phrase.$kw279$POS_PRED)) {
                absolute_preds = pph_utilities.pph_agr_constraint_target(absolute_constraint);
                if (pph_phrase.NIL != absolute_preds && !absolute_preds.isList()) {
                    absolute_preds = (SubLObject)ConsesLow.list(absolute_preds);
                }
            }
            else if (pcase_var.eql((SubLObject)pph_phrase.$kw280$NL_PREDS)) {
                absolute_preds = pph_utilities.pph_agr_constraint_target(absolute_constraint);
            }
        }
        if (pph_phrase.NIL != pph_utilities.pph_agr_constraint_p(relative_constraint) && pph_phrase.$kw297$PEER == pph_utilities.pph_agr_constraint_type(relative_constraint)) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relative_constraint);
            if (pph_phrase.NIL != pph_phrase_p(target, (SubLObject)pph_phrase.UNPROVIDED)) {
                relative_preds = pph_utilities.pph_peer_agr_preds_for_preds(pph_phrase_agr_preds(target, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED);
            }
        }
        return pph_utilities.pph_filter_preds(absolute_preds, relative_preds, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 163447L)
    public static SubLObject pph_phrase_compatible_with_predsP(final SubLObject phrase, final SubLObject nl_preds) {
        return list_utilities.sublisp_boolean(pph_utilities.pph_filter_preds(pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED), nl_preds, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 163595L)
    public static SubLObject pph_phrase_agr_preds_from_category(final SubLObject phrase) {
        SubLObject agr_preds = (SubLObject)pph_phrase.$kw240$ANY;
        final SubLObject category = pph_phrase_category(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject phrase_string = pph_phrase_string(phrase, (SubLObject)pph_phrase.NIL);
        agr_preds = (SubLObject)((pph_phrase.NIL != pph_utilities.pph_npP(category) && pph_phrase.NIL == cycl_grammar.el_variable_p(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED)) && pph_phrase.NIL == cycl_grammar.cycl_nat_p(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED)) && pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) ? pph_phrase.$list298 : pph_agr_preds_from_category(category, phrase_string));
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 164412L)
    public static SubLObject pph_agr_preds_from_category(final SubLObject category, final SubLObject phrase_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr_preds = (SubLObject)pph_phrase.$kw240$ANY;
        if (pph_phrase.NIL != category) {
            if (pph_phrase.NIL != lexicon_accessors.genl_posP(pph_utilities.pph_pos_of_category(category, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase.$const264$Determiner, (SubLObject)pph_phrase.UNPROVIDED)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                    final SubLObject _prev_bind_0_$21 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject det_agr_preds = agr_preds = (SubLObject)(phrase_string.isString() ? lexicon_accessors.agr_of_det_string(phrase_string) : pph_phrase.$list299);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_phrase.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$21, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                agr_preds = pph_agr_preds_from_category_cached(category, (SubLObject)pph_phrase.UNPROVIDED);
            }
        }
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165057L)
    public static SubLObject clear_pph_agr_preds_from_category_cached() {
        final SubLObject cs = pph_phrase.$pph_agr_preds_from_category_cached_caching_state$.getGlobalValue();
        if (pph_phrase.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165057L)
    public static SubLObject remove_pph_agr_preds_from_category_cached(final SubLObject category, SubLObject language_mt) {
        if (language_mt == pph_phrase.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(pph_phrase.$pph_agr_preds_from_category_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(category, language_mt), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165057L)
    public static SubLObject pph_agr_preds_from_category_cached_internal(final SubLObject category, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr_preds = (SubLObject)pph_phrase.$kw240$ANY;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            if (pph_phrase.NIL != lexicon_accessors.speech_partP(category, (SubLObject)pph_phrase.UNPROVIDED)) {
                final SubLObject best_preds = lexicon_accessors.max_preds_of_pos(category);
                final SubLObject other_preds = list_utilities.fast_set_difference(lexicon_accessors.max_preds_of_pos(category), best_preds, (SubLObject)pph_phrase.UNPROVIDED);
                final SubLObject max_preds = ConsesLow.append(best_preds, other_preds);
                if (pph_phrase.NIL != max_preds) {
                    agr_preds = max_preds;
                }
            }
            else if (pph_phrase.$const172$PossessivePhrase.eql(category) || pph_phrase.NIL != pph_utilities.pph_npP(category)) {
                agr_preds = (SubLObject)ConsesLow.cons(pph_phrase.$const301$pronounStrings, lexicon_accessors.max_preds_of_pos(pph_phrase.$const243$Noun));
            }
            else if (pph_phrase.NIL != kb_indexing_datastructures.indexed_term_p(category)) {
                final SubLObject pos = pph_utilities.pph_pos_of_category(category, (SubLObject)pph_phrase.UNPROVIDED);
                if (pph_phrase.NIL != pos) {
                    agr_preds = lexicon_accessors.max_preds_of_pos(pos);
                }
            }
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165057L)
    public static SubLObject pph_agr_preds_from_category_cached(final SubLObject category, SubLObject language_mt) {
        if (language_mt == pph_phrase.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = pph_phrase.$pph_agr_preds_from_category_cached_caching_state$.getGlobalValue();
        if (pph_phrase.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_phrase.$sym300$PPH_AGR_PREDS_FROM_CATEGORY_CACHED, (SubLObject)pph_phrase.$sym302$_PPH_AGR_PREDS_FROM_CATEGORY_CACHED_CACHING_STATE_, (SubLObject)pph_phrase.NIL, (SubLObject)pph_phrase.EQUAL, (SubLObject)pph_phrase.TWO_INTEGER, (SubLObject)pph_phrase.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)pph_phrase.$sym303$CLEAR_PPH_AGR_PREDS_FROM_CATEGORY_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(category, language_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_phrase.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_phrase.NIL;
            collision = cdolist_list_var.first();
            while (pph_phrase.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (category.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_phrase.NIL != cached_args && pph_phrase.NIL == cached_args.rest() && language_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_agr_preds_from_category_cached_internal(category, language_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(category, language_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 165989L)
    public static SubLObject pph_phrase_agr_preds_from_head(final SubLObject phrase) {
        SubLObject agr_preds = (SubLObject)pph_phrase.$kw240$ANY;
        if (pph_phrase.NIL != pph_phrase_has_head_dtrP(phrase)) {
            agr_preds = pph_phrase_agr_preds(pph_phrase_head_dtr(phrase), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 166346L)
    public static SubLObject pph_conditional_phrase_agr_preds(final SubLObject phrase) {
        SubLObject agr_preds = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                agr_preds = pph_utilities.pph_union_preds(agr_preds, pph_phrase_agr_preds(dtr, (SubLObject)pph_phrase.UNPROVIDED));
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return agr_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 166708L)
    public static SubLObject pph_phrase_compatible_agr_preds(final SubLObject phrase) {
        return pph_phrase_agr_preds(phrase, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 166906L)
    public static SubLObject pph_phrase_wu(final SubLObject phrase, SubLObject descend_into_metaP) {
        if (descend_into_metaP == pph_phrase.UNPROVIDED) {
            descend_into_metaP = (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != descend_into_metaP && pph_phrase.NIL != pph_meta_phrase_p(phrase)) {
            return pph_phrase_wu(pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw156$WU, (SubLObject)pph_phrase.FOUR_INTEGER, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 167263L)
    public static SubLObject pph_phrase_set_wu(final SubLObject phrase, final SubLObject wu) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw156$WU, (SubLObject)pph_phrase.FOUR_INTEGER, wu);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 167458L)
    public static SubLObject pph_phrase_has_wu_onlyP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_wu(phrase, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == pph_phrase_string(phrase, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL == pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 167701L)
    public static SubLObject pph_phrase_arg_position_map(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_arg_position_map(document.sign_info(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 167927L)
    public static SubLObject pph_phrase_arg_position_from_map(final SubLObject phrase) {
        return pph_utilities.pph_top_level_arg_position(pph_phrase_arg_position_map(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 168184L)
    public static SubLObject pph_phrase_set_arg_position_map(final SubLObject phrase, final SubLObject arg_position_map) {
        pph_data_structures._csetf_pph_phrase_info_arg_position_map(document.sign_info(phrase), arg_position_map);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 168456L)
    public static SubLObject pph_phrase_register_local_arg_positions(final SubLObject phrase, final SubLObject old_map) {
        final SubLObject cycl = pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED);
        final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(old_map, cycl);
        pph_phrase_set_arg_position_map(phrase, new_map);
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 168827L)
    public static SubLObject pph_phrase_dtrs(final SubLObject phrase) {
        return document.sign_constituents(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 169028L)
    public static SubLObject pph_phrase_dtr_count(final SubLObject phrase) {
        return document.sign_length(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 169168L)
    public static SubLObject pph_phrase_unfinished_dtr_count(final SubLObject phrase) {
        SubLObject count = (SubLObject)pph_phrase.ZERO_INTEGER;
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase.NIL == pph_phrase_doneP(dtr)) {
                    if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str304$__Phrase__D_is_unfinished_, pph_phrase_suid(dtr), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                    }
                    count = Numbers.add(count, (SubLObject)pph_phrase.ONE_INTEGER);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 169506L)
    public static SubLObject pph_phrase_has_dtrsP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase_dtrs(phrase).isVector() && pph_phrase_dtr_count(phrase).isPositive());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 169689L)
    public static SubLObject pph_phrase_set_dtrs(final SubLObject phrase, final SubLObject dtrs) {
        if (pph_phrase.NIL == pph_phrase_p(phrase, (SubLObject)pph_phrase.NIL)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str305$Can_t_set_dtrs_of_non_phrase__S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(phrase));
        }
        if (pph_phrase.NIL != dtrs) {}
        document._csetf_sign_constituents(phrase, dtrs);
        final SubLObject verifyP = (SubLObject)pph_phrase.NIL;
        final SubLObject mother_new = (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != verifyP && pph_phrase.NIL != new_pph_phrase_p(phrase));
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject new_format_string2;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_phrase.NIL != mother_new && pph_phrase.NIL == new_pph_phrase_p(dtr)) {
                    new_format_string2 = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str306$Adding_old_dtr_to_new_mother____M) });
                    pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(phrase, dtr));
                }
                pph_phrase_set_mother(dtr, phrase);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 170280L)
    public static SubLObject pph_phrase_set_only_dtr(final SubLObject phrase, final SubLObject dtr) {
        pph_phrase_set_dtrs(phrase, Vectors.make_vector((SubLObject)pph_phrase.ONE_INTEGER, dtr));
        pph_phrase_set_mother(dtr, phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 170543L)
    public static SubLObject pph_phrase_add_dtr_to_terminal(final SubLObject phrase, final SubLObject dtr) {
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str307$_S_is_not_terminal) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(phrase));
        }
        pph_phrase_set_mother(dtr, phrase);
        pph_phrase_set_only_dtr(phrase, dtr);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 170784L)
    public static SubLObject pph_phrase_last_dtr(final SubLObject phrase) {
        if (pph_phrase.NIL == pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_phrase.NIL;
        }
        return pph_phrase_nth_dtr(phrase, Numbers.subtract(pph_phrase_dtr_count(phrase), (SubLObject)pph_phrase.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 171020L)
    public static SubLObject pph_phrase_has_multiple_verbsP(final SubLObject phrase) {
        return Numbers.numGE(pph_phrase_verb_count(phrase, (SubLObject)pph_phrase.TWO_INTEGER), (SubLObject)pph_phrase.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 171128L)
    public static SubLObject pph_phrase_verb_count(final SubLObject phrase, SubLObject stop_at) {
        if (stop_at == pph_phrase.UNPROVIDED) {
            stop_at = (SubLObject)pph_phrase.NIL;
        }
        return pph_phrase_count_if(phrase, (SubLObject)pph_phrase.$sym308$PPH_PHRASE_VERB_, stop_at);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 171266L)
    public static SubLObject pph_phrase_count_if(final SubLObject phrase, final SubLObject test, SubLObject stop_at) {
        if (stop_at == pph_phrase.UNPROVIDED) {
            stop_at = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != stop_at && !pph_phrase.assertionsDisabledInClass && pph_phrase.NIL == subl_promotions.positive_integer_p(stop_at)) {
            throw new AssertionError(stop_at);
        }
        return pph_phrase_count_if_internal(phrase, test, stop_at);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 171456L)
    public static SubLObject pph_phrase_count_if_internal(final SubLObject phrase, final SubLObject test, final SubLObject stop_at) {
        SubLObject count = (SubLObject)((pph_phrase.NIL != Functions.funcall(test, phrase)) ? pph_phrase.ONE_INTEGER : pph_phrase.ZERO_INTEGER);
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject new_minimum = (SubLObject)((pph_phrase.NIL != stop_at) ? Numbers.subtract(stop_at, count) : pph_phrase.NIL);
            if (pph_phrase.NIL != new_minimum && new_minimum.numLE((SubLObject)pph_phrase.ZERO_INTEGER)) {
                return count;
            }
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_count;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    dtr_count = pph_phrase_count_if_internal(dtr, test, new_minimum);
                    count = Numbers.add(count, dtr_count);
                    if (pph_phrase.NIL != new_minimum) {
                        new_minimum = Numbers.subtract(new_minimum, dtr_count);
                        if (new_minimum.numLE((SubLObject)pph_phrase.ZERO_INTEGER)) {
                            return count;
                        }
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 172021L)
    public static SubLObject pph_phrase_find_nested_dtr_path(final SubLObject phrase, final SubLObject subphrase, SubLObject path_to_phrase) {
        if (path_to_phrase == pph_phrase.UNPROVIDED) {
            path_to_phrase = (SubLObject)pph_phrase.NIL;
        }
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject result;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (dtr.eql(subphrase)) {
                    return list_utilities.add_to_end(dtr_num, path_to_phrase);
                }
                if (pph_phrase.NIL != pph_phrase_has_dtrsP(dtr)) {
                    result = pph_phrase_find_nested_dtr_path(dtr, subphrase, list_utilities.add_to_end(dtr_num, path_to_phrase));
                    if (pph_phrase.NIL != result) {
                        return result;
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 172436L)
    public static SubLObject pph_phrase_head_dtr_num(final SubLObject phrase) {
        if (pph_phrase.NIL != list_utilities.lengthE(pph_phrase_dtrs(phrase), (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED)) {
            return (SubLObject)pph_phrase.ZERO_INTEGER;
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw157$HEAD_DTR_NUM, (SubLObject)pph_phrase.FIVE_INTEGER, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 172799L)
    public static SubLObject pph_phrase_has_head_dtrP(final SubLObject phrase) {
        return pph_phrase_p(pph_phrase_head_dtr(phrase), (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 172905L)
    public static SubLObject pph_phrase_head_dtr_numP(final SubLObject phrase, final SubLObject dtr_num) {
        return Equality.eql(pph_phrase_head_dtr_num(phrase), dtr_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 173082L)
    public static SubLObject pph_phrase_set_head_dtr_num(final SubLObject phrase, final SubLObject head_dtr_num) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, (SubLObject)pph_phrase.$kw157$HEAD_DTR_NUM, (SubLObject)pph_phrase.FIVE_INTEGER, head_dtr_num);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 173346L)
    public static SubLObject pph_phrase_nth_dtr(final SubLObject phrase, final SubLObject n) {
        if (document.sign_constituents(phrase).isVector() && pph_phrase.NIL != list_utilities.lengthG(document.sign_constituents(phrase), n, (SubLObject)pph_phrase.UNPROVIDED)) {
            return document.sign_get(phrase, n);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 173591L)
    public static SubLObject pph_phrase_head_dtr(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            return pph_phrase_nth_dtr(phrase, head_dtr_num);
        }
        if (pph_phrase.ONE_INTEGER.eql(pph_phrase_dtr_count(phrase))) {
            return pph_phrase_nth_dtr(phrase, (SubLObject)pph_phrase.ZERO_INTEGER);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 173974L)
    public static SubLObject pph_phrase_head_dtr_genlP(final SubLObject phrase, final SubLObject pos) {
        final SubLObject head = pph_phrase_head_dtr(phrase);
        if (pph_phrase.NIL != head) {
            return pph_utilities.pph_genlP(pos, pph_phrase_category(head, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 174328L)
    public static SubLObject pph_phrase_head_dtr_genl_other_thanP(final SubLObject phrase, final SubLObject pos) {
        final SubLObject head = pph_phrase_head_dtr(phrase);
        if (pph_phrase.NIL != head) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == pph_utilities.pph_genlP(pos, pph_phrase_category(head, (SubLObject)pph_phrase.UNPROVIDED), (SubLObject)pph_phrase.UNPROVIDED));
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 174702L)
    public static SubLObject pph_phrase_lexical_head_dtr(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_phrase_has_head_dtrP(phrase)) {
            return pph_phrase_lexical_head_dtr(pph_phrase_head_dtr(phrase));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 174951L)
    public static SubLObject pph_phrase_head_dtrP(final SubLObject embedded, SubLObject matrix) {
        if (matrix == pph_phrase.UNPROVIDED) {
            matrix = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL == matrix) {
            matrix = pph_phrase_logical_mother(embedded);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(matrix, (SubLObject)pph_phrase.UNPROVIDED) && pph_phrase.NIL != pph_phrase_equal(embedded, pph_phrase_head_dtr(matrix)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 175195L)
    public static SubLObject pph_phrase_set_nth_dtr(final SubLObject phrase, final SubLObject n, final SubLObject nth_dtr) {
        pph_phrase_set_mother(nth_dtr, phrase);
        return document.sign_set(phrase, n, nth_dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 175373L)
    public static SubLObject pph_phrase_nth_dtrP(final SubLObject phrase, final SubLObject matrix, final SubLObject num) {
        return Equality.eq(phrase, pph_phrase_nth_dtr(matrix, num));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 175485L)
    public static SubLObject pph_phrase_head_verbP(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_phrase_has_agr_constraint_type_p(phrase, (SubLObject)pph_phrase.$kw287$SUBJECT_VERB)) {
            return (SubLObject)pph_phrase.T;
        }
        if (pph_phrase.NIL != pph_conditional_phrase_p(phrase) || pph_phrase.NIL != pph_coordination_phrase_p(phrase)) {
            SubLObject badP = (SubLObject)pph_phrase.NIL;
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_phrase.NIL == pph_phrase_head_verbP(dtr)) {
                        badP = (SubLObject)pph_phrase.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL == badP);
        }
        return (SubLObject)pph_phrase.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 175875L)
    public static SubLObject pph_det_nbarP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_phrase.NIL != pph_phrase_p(phrase, (SubLObject)pph_phrase.UNPROVIDED) && (pph_phrase.NIL != pph_phrase_resolution.pph_phrase_starts_with_detpP(phrase) || pph_phrase.NIL != pph_phrase_resolution.pph_phrase_starts_with_detP(phrase)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 176109L)
    public static SubLObject pph_justification_bundle(final SubLObject phrase) {
        return (SubLObject)ConsesLow.list(pph_phrase_string(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED), pph_phrase_justification(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 176312L)
    public static SubLObject pph_phrase_equal(final SubLObject phrase1, final SubLObject phrase2) {
        return Equality.equal(phrase1, phrase2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 176487L)
    public static SubLObject new_pph_phrase_with_dtr_list(final SubLObject dtr_list) {
        final SubLObject new_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        set_pph_phrase_dtrs_from_list(new_phrase, dtr_list, (SubLObject)pph_phrase.UNPROVIDED);
        return new_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 176743L)
    public static SubLObject set_pph_phrase_dtrs_from_list(final SubLObject phrase, final SubLObject dtr_list, SubLObject head_dtr_num) {
        if (head_dtr_num == pph_phrase.UNPROVIDED) {
            head_dtr_num = (SubLObject)pph_phrase.NIL;
        }
        final SubLObject dtr_count = Sequences.length(dtr_list);
        final SubLObject dtrs_vector = Vectors.make_vector(dtr_count, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject list_var = (SubLObject)pph_phrase.NIL;
        SubLObject dtr = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase.NIL;
        list_var = dtr_list;
        dtr = list_var.first();
        for (dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER; pph_phrase.NIL != list_var; list_var = list_var.rest(), dtr = list_var.first(), dtr_num = Numbers.add((SubLObject)pph_phrase.ONE_INTEGER, dtr_num)) {
            Vectors.set_aref(dtrs_vector, dtr_num, dtr);
        }
        pph_phrase_set_dtrs(phrase, dtrs_vector);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, head_dtr_num);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 177217L)
    public static SubLObject pph_phrase_remove_all_dtrs(final SubLObject phrase) {
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    pph_phrase_set_mother(dtr, (SubLObject)pph_phrase.NIL);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
            pph_phrase_set_dtrs(phrase, pph_phrase.$ic310);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 177472L)
    public static SubLObject pph_phrase_push(final SubLObject dtr, final SubLObject phrase) {
        final SubLObject phrase_dtrs = (SubLObject)((pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) ? pph_phrase_dtr_list(phrase) : pph_phrase.NIL);
        final SubLObject dtrs = (SubLObject)ConsesLow.cons(dtr, phrase_dtrs);
        set_pph_phrase_dtrs_from_list(phrase, dtrs, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_increment_head_dtr_num(phrase);
        pph_phrase_add_justifications_from_phrase(phrase, dtr);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 177891L)
    public static SubLObject pph_phrase_append(final SubLObject dtr, final SubLObject phrase) {
        final SubLObject phrase_dtrs = (SubLObject)((pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) ? pph_phrase_dtr_list(phrase) : pph_phrase.NIL);
        final SubLObject dtrs = ConsesLow.append(phrase_dtrs, (SubLObject)ConsesLow.list(dtr));
        set_pph_phrase_dtrs_from_list(phrase, dtrs, (SubLObject)pph_phrase.UNPROVIDED);
        pph_phrase_add_justifications_from_phrase(phrase, dtr);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 178304L)
    public static SubLObject pph_phrase_insert_dtr(final SubLObject phrase, final SubLObject new_dtr, final SubLObject num) {
        SubLObject new_dtrs = (SubLObject)pph_phrase.NIL;
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (num.eql(dtr_num)) {
                    new_dtrs = (SubLObject)ConsesLow.cons(new_dtr, new_dtrs);
                }
                new_dtrs = (SubLObject)ConsesLow.cons(dtr, new_dtrs);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        if (pph_phrase.NIL != list_utilities.lengthE(new_dtrs, num, (SubLObject)pph_phrase.UNPROVIDED)) {
            new_dtrs = (SubLObject)ConsesLow.cons(new_dtr, new_dtrs);
        }
        else if (pph_phrase.NIL != list_utilities.lengthL(new_dtrs, num, (SubLObject)pph_phrase.UNPROVIDED)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str311$Can_t_insert_dtr_into_position__D) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(num, Sequences.length(new_dtrs)));
        }
        return set_pph_phrase_dtrs_from_list(phrase, Sequences.reverse(new_dtrs), (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 178911L)
    public static SubLObject pph_phrase_front_head_dtr(final SubLObject phrase) {
        return pph_phrase_front_subphrase((SubLObject)ConsesLow.list(pph_phrase_head_dtr_num(phrase)), pph_phrase_head_dtr(phrase), phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 179147L)
    public static SubLObject pph_phrase_front_subphrase(final SubLObject front_dtr_path, final SubLObject front_dtr, final SubLObject phrase) {
        SubLObject front_dtrs_mother = phrase;
        final SubLObject head_dtrP = pph_phrase_head_dtrP(front_dtr, phrase);
        SubLObject cdolist_list_var = conses_high.butlast(front_dtr_path, (SubLObject)pph_phrase.UNPROVIDED);
        SubLObject dtr_num = (SubLObject)pph_phrase.NIL;
        dtr_num = cdolist_list_var.first();
        while (pph_phrase.NIL != cdolist_list_var) {
            front_dtrs_mother = pph_phrase_nth_dtr(front_dtrs_mother, dtr_num);
            cdolist_list_var = cdolist_list_var.rest();
            dtr_num = cdolist_list_var.first();
        }
        final SubLObject sanity_check = pph_phrase_extract_dtr_num(list_utilities.last_one(front_dtr_path), front_dtrs_mother);
        if (!sanity_check.eql(front_dtr)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str312$Extraction_disparity___Expected__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(front_dtr, sanity_check));
        }
        pph_phrase_push(front_dtr, phrase);
        if (pph_phrase.NIL != head_dtrP) {
            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str313$Setting_head_dtr_to_initial_dtr__, phrase, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
            }
            pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_phrase.ZERO_INTEGER);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 179981L)
    public static SubLObject pph_phrase_remove_dtr(final SubLObject phrase, final SubLObject target_dtr) {
        final SubLObject all_dtrs = pph_phrase_dtr_list(phrase);
        final SubLObject other_dtrs = Sequences.remove(target_dtr, all_dtrs, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        return set_pph_phrase_dtrs_from_list(phrase, other_dtrs, (SubLObject)pph_phrase.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 180198L)
    public static SubLObject pph_phrase_extract_dtr_num(final SubLObject target_dtr_num, final SubLObject phrase) {
        final SubLObject target_dtr = pph_phrase_nth_dtr(phrase, target_dtr_num);
        final SubLObject other_dtrs = Sequences.remove(target_dtr, pph_phrase_dtr_list(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str314$Extracting_dtr__D___S, target_dtr_num, target_dtr, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        set_pph_phrase_dtrs_from_list(phrase, other_dtrs, (SubLObject)pph_phrase.UNPROVIDED);
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str315$__Setting_head_dtr_num_from__S, pph_phrase_head_dtr_num(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        update_pph_head_dtr_num_after_extraction(phrase, target_dtr_num);
        if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str316$_to__S__, pph_phrase_head_dtr_num(phrase), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        }
        return target_dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 180910L)
    public static SubLObject update_pph_head_dtr_num_after_extraction(final SubLObject phrase, final SubLObject extracted_dtr_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_phrase.NIL != pph_phrase_head_dtr_num(phrase)) {
            if (extracted_dtr_num.eql(pph_phrase_head_dtr_num(phrase))) {
                if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER) && pph_phrase.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_phrase.$str317$Phrase_has_lost_its_head_____S__, phrase);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_phrase.NIL);
            }
            else if (pph_phrase_head_dtr_num(phrase).numG(extracted_dtr_num)) {
                pph_phrase_decrement_head_dtr_num(phrase);
            }
        }
        return pph_phrase_head_dtr_num(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 181448L)
    public static SubLObject pph_phrase_decrement_head_dtr_num(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, number_utilities.f_1_(head_dtr_num));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 181718L)
    public static SubLObject pph_phrase_increment_head_dtr_num(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, number_utilities.f_1X(head_dtr_num));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 181988L)
    public static SubLObject update_pph_nth_phrases(final SubLObject phrase, SubLObject front_dtr_num) {
        if (front_dtr_num == pph_phrase.UNPROVIDED) {
            front_dtr_num = (SubLObject)pph_phrase.NIL;
        }
        final SubLObject dtr_count = pph_phrase_dtr_count(phrase);
        SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject agr_constraint;
            SubLObject agr_target;
            SubLObject old_num;
            SubLObject new_num;
            SubLObject new_format_string;
            SubLObject new_target;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                agr_constraint = pph_phrase_agr(dtr);
                agr_target = pph_utilities.pph_agr_constraint_target(agr_constraint);
                if (pph_phrase.NIL != pph_utilities.pph_nth_phrase_p(agr_target)) {
                    old_num = pph_utilities.pph_nth_phrase_num(agr_target);
                    new_num = pph_new_agr_num_from_old(old_num, front_dtr_num);
                    if (!old_num.eql(new_num)) {
                        if (dtr_num.eql(new_num)) {
                            new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str318$Setting_agr_target_to_itself_) });
                            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.EMPTY_SUBL_OBJECT_ARRAY));
                        }
                        else if (new_num.numGE(dtr_count)) {
                            new_format_string = Sequences.cconcatenate((SubLObject)pph_phrase.$str48$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_phrase.ONE_INTEGER), pph_phrase.$str49$__, format_nil.format_nil_a_no_copy((SubLObject)pph_phrase.$str319$Setting_agr_target_to_non_existen) });
                            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_phrase.EMPTY_SUBL_OBJECT_ARRAY));
                        }
                        else {
                            new_target = similar_pph_nth_phrase_with_number(agr_target, new_num);
                            pph_phrase_set_relative_agr_target(dtr, new_target);
                            if (pph_phrase.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_phrase.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_phrase.T, (SubLObject)pph_phrase.$str320$__Setting_agr_target_num_of_dtr__, dtr_num, old_num, pph_utilities.pph_nth_phrase_num(agr_target), (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
                            }
                        }
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 183327L)
    public static SubLObject pph_new_agr_num_from_old(final SubLObject old_num, final SubLObject front_dtr_num) {
        if (old_num.eql(front_dtr_num)) {
            return (SubLObject)pph_phrase.ZERO_INTEGER;
        }
        if (pph_phrase.NIL == front_dtr_num) {
            return number_utilities.f_1X(old_num);
        }
        if (front_dtr_num.numG(old_num)) {
            return number_utilities.f_1X(old_num);
        }
        return old_num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 184010L)
    public static SubLObject similar_pph_nth_phrase_with_number(final SubLObject nth_phrase, final SubLObject number) {
        return pph_utilities.new_pph_nth_phrase(number, pph_utilities.pph_nth_phrase_constraints(nth_phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 184245L)
    public static SubLObject pph_phrase_has_weak_justificationP(final SubLObject phrase) {
        final SubLObject reln = cycl_utilities.formula_operator(pph_phrase_cycl(phrase, (SubLObject)pph_phrase.UNPROVIDED));
        final SubLObject justification = pph_phrase_justification(phrase);
        return (SubLObject)((pph_phrase.NIL != reln && pph_phrase.NIL != assertion_handles.assertion_p(justification)) ? SubLObjectFactory.makeBoolean(!reln.equal(assertions_high.gaf_arg1(justification))) : pph_phrase.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 184653L)
    public static SubLObject gather_weak_justifications(final SubLObject phrase, SubLObject weak_justifications) {
        if (weak_justifications == pph_phrase.UNPROVIDED) {
            weak_justifications = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    weak_justifications = ConsesLow.append(gather_weak_justifications(dtr, (SubLObject)pph_phrase.UNPROVIDED), weak_justifications);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        if (pph_phrase.NIL != pph_phrase_has_weak_justificationP(phrase)) {
            weak_justifications = (SubLObject)ConsesLow.cons(pph_justification_bundle(phrase), weak_justifications);
        }
        return weak_justifications;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-phrase.lisp", position = 185294L)
    public static SubLObject gather_all_justifications(final SubLObject phrase, SubLObject justifications) {
        if (justifications == pph_phrase.UNPROVIDED) {
            justifications = (SubLObject)pph_phrase.NIL;
        }
        if (pph_phrase.NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_phrase.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_phrase.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_phrase.NIL, v_iteration = (SubLObject)pph_phrase.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_phrase.ONE_INTEGER)) {
                    element_num = ((pph_phrase.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_phrase.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    justifications = ConsesLow.append(gather_all_justifications(dtr, (SubLObject)pph_phrase.UNPROVIDED), justifications);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_phrase.ONE_INTEGER);
                }
            }
        }
        if (pph_phrase.NIL != pph_phrase_justification(phrase)) {
            justifications = (SubLObject)ConsesLow.cons(pph_justification_bundle(phrase), justifications);
        }
        return justifications;
    }
    
    public static SubLObject declare_pph_phrase_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_phrase_for_cycl", "NEW-PPH-PHRASE-FOR-CYCL", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_do_dtrs", "PPH-PHRASE-DO-DTRS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "verbose_print_pph_phrase", "VERBOSE-PRINT-PPH-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "terse_print_pph_phrase", "TERSE-PRINT-PPH-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "print_pph_phrase", "PRINT-PPH-PHRASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "print_pph_phrase_int", "PRINT-PPH-PHRASE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_create_backup", "PPH-PHRASE-CREATE-BACKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_revert_to_backup", "PPH-PHRASE-REVERT-TO-BACKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_maybe_warn_about_reverting_phrase_internal", "PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_maybe_warn_about_reverting_phrase", "PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_copy", "PPH-PHRASE-COPY", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_phrase", "with_pph_phrase_copy_recursion_protection", "WITH-PPH-PHRASE-COPY-RECURSION-PROTECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "find_or_create_pph_phrase_copy_stack", "FIND-OR-CREATE-PPH-PHRASE-COPY-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_phrase_p", "NEW-PPH-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_copy_int", "PPH-PHRASE-COPY-INT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_copy_property_p", "PPH-PHRASE-COPY-PROPERTY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_copy_dtr", "PPH-PHRASE-COPY-DTR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_copy_plist_phrase", "PPH-PHRASE-COPY-PLIST-PHRASE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_dtr_list", "PPH-PHRASE-DTR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_nonlocal_feature_property_p", "PPH-PHRASE-NONLOCAL-FEATURE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_verbosity", "PPH-PHRASE-VERBOSITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_content_word_count", "PPH-CONTENT-WORD-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_special_type_kwP", "PPH-SPECIAL-TYPE-KW?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_special_type_p", "PPH-PHRASE-SPECIAL-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_special_type", "PPH-PHRASE-SPECIAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_special_type", "PPH-PHRASE-SET-SPECIAL-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_clear_special_type", "PPH-PHRASE-CLEAR-SPECIAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_focus_arg", "PPH-PHRASE-FOCUS-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_focus_arg", "PPH-PHRASE-SET-FOCUS-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_percent_phrase_p", "PPH-PERCENT-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_percent_phrase", "NEW-PPH-PERCENT-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_clarifying_phrase_p", "PPH-CLARIFYING-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_type_clarifying_phrase", "NEW-PPH-TYPE-CLARIFYING-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_symbol_phrase_p", "PPH-SYMBOL-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_symbol_phrase", "NEW-PPH-SYMBOL-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_symbol_phrase_symbol", "PPH-SYMBOL-PHRASE-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_cycl_phrase_p", "PPH-CYCL-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_cycl_phrase", "NEW-PPH-CYCL-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_quoted_paraphrase_phrase_p", "PPH-QUOTED-PARAPHRASE-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_quoted_paraphrase_phrase", "NEW-PPH-QUOTED-PARAPHRASE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "quote_pph_phrase", "QUOTE-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_string_mention_phrase_p", "PPH-STRING-MENTION-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_string_mention_phrase", "NEW-PPH-STRING-MENTION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_meta_phrase_p", "PPH-META-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_nospace_phrase_p", "PPH-NOSPACE-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_nospace_phrase", "NEW-PPH-NOSPACE-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "convert_pph_phrase_to_nospace_phrase", "CONVERT-PPH-PHRASE-TO-NOSPACE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_p", "PPH-VARIABLE-BINDING-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_variable_binding_phrase", "NEW-PPH-VARIABLE-BINDING-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_query_template", "PPH-VARIABLE-BINDING-PHRASE-QUERY-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_phrase_naut_subst", "PPH-VARIABLE-BINDING-PHRASE-PHRASE-NAUT-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_phrase_naut", "PPH-VARIABLE-BINDING-PHRASE-PHRASE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_set_phrase_naut", "PPH-VARIABLE-BINDING-PHRASE-SET-PHRASE-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_set_query_template", "PPH-VARIABLE-BINDING-PHRASE-SET-QUERY-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_query_el_formula", "PPH-VARIABLE-BINDING-PHRASE-QUERY-EL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_bindings_and_supports_from_phrase", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_bindings_and_supports_from_query_el_formula_internal", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_bindings_and_supports_from_query_el_formula", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_substitute_cycl", "PPH-VARIABLE-BINDING-PHRASE-SUBSTITUTE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_try_to_resolve_binding_phrases", "PPH-PHRASE-TRY-TO-RESOLVE-BINDING-PHRASES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variable_binding_phrase_try_to_resolve_bindings", "PPH-VARIABLE-BINDING-PHRASE-TRY-TO-RESOLVE-BINDINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_terse_phrase_p", "PPH-TERSE-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_terse_phrase", "NEW-PPH-TERSE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_precise_phrase_p", "PPH-PRECISE-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_precise_phrase", "NEW-PPH-PRECISE-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_chemical_formula_from_lists_phrase_p", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_chemical_formula_from_lists_phrase", "NEW-PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_p", "PPH-CONDITIONAL-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_category_p", "PPH-CONDITIONAL-PHRASE-CATEGORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_conditional_phrase", "NEW-PPH-CONDITIONAL-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_test", "PPH-CONDITIONAL-PHRASE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_set_test", "PPH-CONDITIONAL-PHRASE-SET-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_values", "PPH-CONDITIONAL-PHRASE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_coordination_phrase_p", "PPH-COORDINATION-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_coordination_phrase", "NEW-PPH-COORDINATION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_coordination_phrase_low", "NEW-PPH-COORDINATION-PHRASE-LOW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_numbered_list_phrase", "NEW-PPH-NUMBERED-LIST-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_opr_key_for_fn", "PPH-OPR-KEY-FOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_opr_key_for_connective", "PPH-OPR-KEY-FOR-CONNECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_list_type_identifier", "PPH-LIST-TYPE-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_bare_string_phrase_p", "PPH-BARE-STRING-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_coordinated_np_info", "PPH-COORDINATED-NP-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_gender", "PPH-PHRASE-GENDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_person", "PPH-PHRASE-PERSON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_number", "PPH-PHRASE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_agr_pred_from_coordinated_np_number", "PPH-AGR-PRED-FROM-COORDINATED-NP-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_repeated_phrase_p", "PPH-REPEATED-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_repeated_phrase_first_arg_position", "PPH-REPEATED-PHRASE-FIRST-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_repeated_phrase_references_argP", "PPH-REPEATED-PHRASE-REFERENCES-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_repeated_phrase", "NEW-PPH-REPEATED-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_p", "PPH-PHRASE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_verify_dtrs", "PPH-PHRASE-VERIFY-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_non_empty_output_list_p", "PPH-PHRASE-NON-EMPTY-OUTPUT-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_list_p", "PPH-PHRASE-OUTPUT-LIST-P", 1, 0, false);
        new $pph_phrase_output_list_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_p", "PPH-PHRASE-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_case_p", "PPH-PHRASE-CASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_wu_p", "PPH-PHRASE-WU-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr_num_p", "PPH-PHRASE-HEAD-DTR-NUM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_indefinite_articleP", "PPH-PHRASE-INDEFINITE-ARTICLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_definite_articleP", "PPH-PHRASE-DEFINITE-ARTICLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_note_done", "PPH-PHRASE-NOTE-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_note_not_done", "PPH-PHRASE-NOTE-NOT-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_note_done_status", "PPH-PHRASE-NOTE-DONE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_doneP", "PPH-PHRASE-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_stringP", "PPH-PHRASE-HAS-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_ranged_det_phrase_p", "PPH-RANGED-DET-PHRASE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_destroy_dtrs_metered", "PPH-PHRASE-DESTROY-DTRS-METERED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_destroyer", "PPH-PHRASE-DESTROYER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "set_pph_phrase_destruction_grace_period", "SET-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "smite_doomed_pph_phrases_next_time_around", "SMITE-DOOMED-PPH-PHRASES-NEXT-TIME-AROUND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "destroy_pph_phrase", "DESTROY-PPH-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "bypass_pph_phrase_destroyerP", "BYPASS-PPH-PHRASE-DESTROYER?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "http_processP", "HTTP-PROCESS?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "clear_warn_about_pph_phrase_destruction", "CLEAR-WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "remove_warn_about_pph_phrase_destruction", "REMOVE-WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "warn_about_pph_phrase_destruction_internal", "WARN-ABOUT-PPH-PHRASE-DESTRUCTION-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "warn_about_pph_phrase_destruction", "WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "destroy_pph_phrase_low", "DESTROY-PPH-PHRASE-LOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "destroy_all_pph_phrases", "DESTROY-ALL-PPH-PHRASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "destroy_pph_phrase_int", "DESTROY-PPH-PHRASE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_destroy_info_bundle", "PPH-PHRASE-DESTROY-INFO-BUNDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_destroy_dtrs", "PPH-PHRASE-DESTROY-DTRS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_info_set_high", "PPH-PHRASE-INFO-SET-HIGH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_demerits", "PPH-PHRASE-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_contextualized_demerits", "PPH-PHRASE-CONTEXTUALIZED-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_top_level_demerits", "PPH-PHRASE-TOP-LEVEL-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_top_level_demerits_reason", "PPH-PHRASE-TOP-LEVEL-DEMERITS-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_top_level_demerits", "PPH-PHRASE-SET-TOP-LEVEL-DEMERITS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_increment_top_level_demerits", "PPH-PHRASE-INCREMENT-TOP-LEVEL-DEMERITS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_max_alternatives", "PPH-PHRASE-MAX-ALTERNATIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_local_max_alternatives", "PPH-PHRASE-LOCAL-MAX-ALTERNATIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_max_alternatives", "PPH-PHRASE-SET-MAX-ALTERNATIVES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_inferences", "PPH-PHRASE-SET-INFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_inferences", "PPH-PHRASE-INFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_inference", "PPH-PHRASE-ADD-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_case", "PPH-PHRASE-CASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_case", "PPH-PHRASE-SET-CASE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_case_low", "PPH-PHRASE-SET-CASE-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_cases_recursively", "PPH-PHRASE-SET-CASES-RECURSIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_object_case", "PPH-PHRASE-SET-OBJECT-CASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_genitive_case", "PPH-PHRASE-SET-GENITIVE-CASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_object_dtrs", "PPH-PHRASE-OBJECT-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_possessive_dtrs", "PPH-PHRASE-POSSESSIVE-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_prepositional_object_dtrs", "PPH-PHRASE-PREPOSITIONAL-OBJECT-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_verb_object_dtrs", "PPH-PHRASE-VERB-OBJECT-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_transitive_verb_phraseP", "PPH-TRANSITIVE-VERB-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_subject_case", "PPH-PHRASE-SET-SUBJECT-CASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_subject_dtr", "PPH-PHRASE-SUBJECT-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_starts_with_verbP", "PPH-PHRASE-STARTS-WITH-VERB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_subjectP", "PPH-PHRASE-SUBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_top_level_problem_dictionary", "PPH-PHRASE-TOP-LEVEL-PROBLEM-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_find_or_create_top_level_problem_dictionary", "PPH-PHRASE-FIND-OR-CREATE-TOP-LEVEL-PROBLEM-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_top_level_problem_dictionary", "PPH-PHRASE-SET-TOP-LEVEL-PROBLEM-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maybe_dump_problem_reports", "PPH-PHRASE-MAYBE-DUMP-PROBLEM-REPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_problems", "PPH-PHRASE-ADD-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_dump_problem_reports", "PPH-PHRASE-DUMP-PROBLEM-REPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_compile_problem_dictionary", "PPH-PHRASE-COMPILE-PROBLEM-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_merge_problem_dictionary", "PPH-MERGE-PROBLEM-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_reporter_problems", "PPH-PHRASE-REPORTER-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maybe_note_problem", "PPH-PHRASE-MAYBE-NOTE-PROBLEM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_note_problem", "PPH-PHRASE-NOTE-PROBLEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_note_problem", "PPH-NOTE-PROBLEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "note_pph_problem", "NOTE-PPH-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_problem_p", "PPH-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_problem_string", "PPH-PROBLEM-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_problem", "NEW-PPH-PROBLEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_problem_type_p", "PPH-PROBLEM-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_suid", "PPH-PHRASE-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_suid", "PPH-PHRASE-SET-SUID", 2, 0, false);
        new $pph_phrase_set_suid$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_suid_low", "PPH-PHRASE-SET-SUID-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_free_suid", "PPH-PHRASE-FREE-SUID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_do_alternatives", "PPH-PHRASE-DO-ALTERNATIVES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_alternatives", "PPH-PHRASE-ALTERNATIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_local_alternatives", "PPH-PHRASE-LOCAL-ALTERNATIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_alternatives", "PPH-PHRASE-SET-ALTERNATIVES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_alternatives_low", "PPH-PHRASE-SET-ALTERNATIVES-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_alternative", "PPH-PHRASE-ADD-ALTERNATIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_remove_alternative", "PPH-PHRASE-REMOVE-ALTERNATIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_free_alternatives", "PPH-PHRASE-FREE-ALTERNATIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_mother", "PPH-PHRASE-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_mother", "PPH-PHRASE-SET-MOTHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_free_mother", "PPH-PHRASE-FREE-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_mother_low", "PPH-PHRASE-SET-MOTHER-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_logical_mother", "PPH-PHRASE-LOGICAL-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maximal_projection", "PPH-PHRASE-MAXIMAL-PROJECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_verb_find_sentential_mother", "PPH-VERB-FIND-SENTENTIAL-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_root_mother", "PPH-PHRASE-ROOT-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_find_root_mother", "PPH-PHRASE-FIND-ROOT-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_root_mother_cycl", "PPH-PHRASE-ROOT-MOTHER-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_ancestor_p", "PPH-PHRASE-ANCESTOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_descendant_p", "PPH-PHRASE-DESCENDANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_ancestor_of_categoryP", "PPH-PHRASE-HAS-ANCESTOR-OF-CATEGORY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_justification", "PPH-PHRASE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_justification", "PPH-PHRASE-SET-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_justification", "PPH-PHRASE-ADD-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_justifications_from_phrase", "PPH-PHRASE-ADD-JUSTIFICATIONS-FROM-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_justifications_from_item", "PPH-PHRASE-ADD-JUSTIFICATIONS-FROM-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_code_justification", "PPH-CODE-JUSTIFICATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_nl_generation_cache_justification", "PPH-NL-GENERATION-CACHE-JUSTIFICATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_gather_supports", "PPH-PHRASE-GATHER-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_all_variant_dtr_lists", "PPH-PHRASE-ALL-VARIANT-DTR-LISTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "maybe_warn_about_dtr_variant_lists", "MAYBE-WARN-ABOUT-DTR-VARIANT-LISTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "variant_has_missing_targetP", "VARIANT-HAS-MISSING-TARGET?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "variant_phrase_has_missing_targetP", "VARIANT-PHRASE-HAS-MISSING-TARGET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_ancestor_phrase_or_self_p", "PPH-ANCESTOR-PHRASE-OR-SELF-P", 2, 0, false);
        new $pph_ancestor_phrase_or_self_p$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_all_strings", "PPH-PHRASE-ALL-STRINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_string_E_internal", "PPH-VARIANT-STRING-=-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_string_E", "PPH-VARIANT-STRING-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_string_internal", "PPH-VARIANT-STRING-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_string", "PPH-VARIANT-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "car_nesting_depth_G", "CAR-NESTING-DEPTH->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_alternative_phrase_strings", "PPH-ALTERNATIVE-PHRASE-STRINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_all_output_lists", "PPH-PHRASE-ALL-OUTPUT-LISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_all_output_lists_internal", "PPH-PHRASE-ALL-OUTPUT-LISTS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_output_list", "PPH-VARIANT-OUTPUT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_all_output_items", "PPH-PHRASE-ALL-OUTPUT-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_variant_output_item", "PPH-VARIANT-OUTPUT-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_string_no_tags", "PPH-PHRASE-STRING-NO-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_string", "PPH-PHRASE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_clear_noted_strings", "PPH-PHRASE-CLEAR-NOTED-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_note_string", "PPH-PHRASE-NOTE-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_noted_string", "PPH-PHRASE-NOTED-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maybe_add_anchor_tags", "PPH-PHRASE-MAYBE-ADD-ANCHOR-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_item_maybe_add_anchor_tags", "PPH-PHRASE-OUTPUT-ITEM-MAYBE-ADD-ANCHOR-TAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_html_anchor_tagsP", "PPH-PHRASE-HAS-HTML-ANCHOR-TAGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_list_string_no_tags", "PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_list_string", "PPH-PHRASE-OUTPUT-LIST-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_list_assemble_string", "PPH-PHRASE-OUTPUT-LIST-ASSEMBLE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_item_get_string", "PPH-PHRASE-OUTPUT-ITEM-GET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_string", "PPH-PHRASE-SET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_arg_position", "PPH-PHRASE-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_arg_position", "PPH-PHRASE-SET-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_output_list_copy", "PPH-OUTPUT-LIST-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_output_list_cycl", "PPH-PHRASE-SET-OUTPUT-LIST-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_sanity_check_cycl", "PPH-PHRASE-SANITY-CHECK-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_html_tags", "PPH-PHRASE-SET-HTML-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_html_tags", "PPH-PHRASE-ADD-HTML-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_find_or_set_category", "PPH-PHRASE-FIND-OR-SET-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_category_to_np", "PPH-PHRASE-SET-CATEGORY-TO-NP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_npP", "PPH-PHRASE-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_heavy_npP", "PPH-HEAVY-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_sP", "PPH-PHRASE-S?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_nbarP", "PPH-PHRASE-NBAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_nominalP", "PPH-PHRASE-NOMINAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_possessiveP", "PPH-PHRASE-POSSESSIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_verbP", "PPH-PHRASE-VERB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_category_to_pp", "PPH-PHRASE-SET-CATEGORY-TO-PP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_ppP", "PPH-PHRASE-PP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_adjpP", "PPH-PHRASE-ADJP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_adjP", "PPH-PHRASE-ADJ?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_clauseP", "PPH-PHRASE-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_copula_phraseP", "PPH-COPULA-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_aux_verb_phraseP", "PPH-AUX-VERB-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "possibly_modal_verb_phraseP", "POSSIBLY-MODAL-VERB-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_ordinal_phraseP", "PPH-ORDINAL-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_category", "PPH-PHRASE-CATEGORY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_pos", "PPH-PHRASE-HEAD-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_category", "PPH-PHRASE-SET-CATEGORY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_update_category", "PPH-PHRASE-UPDATE-CATEGORY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maybe_coerce_np_to_nbar", "PPH-PHRASE-MAYBE-COERCE-NP-TO-NBAR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_coerce_np_to_nbar", "PPH-PHRASE-COERCE-NP-TO-NBAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_find_new_category", "PPH-FIND-NEW-CATEGORY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_reconcile_categories", "PPH-PHRASE-RECONCILE-CATEGORIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_better_categoryP", "PPH-BETTER-CATEGORY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_cycl", "PPH-PHRASE-SET-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_reset_cycl", "PPH-PHRASE-RESET-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_unknown_cycl", "PPH-UNKNOWN-CYCL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_unknown_cycl_p", "PPH-UNKNOWN-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_known_cycl_p", "PPH-KNOWN-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_empty_cycl", "PPH-EMPTY-CYCL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_empty_cycl_p", "PPH-EMPTY-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_link_cycl", "PPH-PHRASE-SET-LINK-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_link_cycl", "PPH-PHRASE-LINK-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl", "PPH-PHRASE-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_known_cyclP", "PPH-PHRASE-HAS-KNOWN-CYCL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_find_if", "PPH-PHRASE-CYCL-FIND-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_gather", "PPH-PHRASE-CYCL-GATHER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_gather", "PPH-PHRASE-GATHER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_sole_reference_p", "PPH-SOLE-REFERENCE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_find_other_reference", "PPH-PHRASE-FIND-OTHER-REFERENCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_found_other_reference", "PPH-PHRASE-FOUND-OTHER-REFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_subst", "PPH-PHRASE-CYCL-SUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_maybe_resolve_formula_arg_expressions", "PPH-MAYBE-RESOLVE-FORMULA-ARG-EXPRESSIONS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_resolve_formula_arg_fn", "PPH-RESOLVE-FORMULA-ARG-FN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_subst_update_on_change", "PPH-PHRASE-CYCL-SUBST-UPDATE-ON-CHANGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_subst_update_arg_position", "PPH-PHRASE-CYCL-SUBST-UPDATE-ARG-POSITION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_subst_update_arg_position_map", "PPH-PHRASE-CYCL-SUBST-UPDATE-ARG-POSITION-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycl_subst_update_output_list_cycl", "PPH-PHRASE-CYCL-SUBST-UPDATE-OUTPUT-LIST-CYCL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_cycls_of_phrases", "PPH-PHRASE-CYCLS-OF-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_list", "PPH-PHRASE-OUTPUT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_dtr_output_lists", "PPH-PHRASE-DTR-OUTPUT-LISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_output_list", "PPH-PHRASE-SET-OUTPUT-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "consolidate_same_arg_items", "CONSOLIDATE-SAME-ARG-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "do_consolidate_same_arg_items", "DO-CONSOLIDATE-SAME-ARG-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_item_from_queued_item", "NEW-ITEM-FROM-QUEUED-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_item_consolidate_slots", "PPH-PHRASE-OUTPUT-ITEM-CONSOLIDATE-SLOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_itemE", "PPH-PHRASE-OUTPUT-ITEM=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_items_html_unmergeableP", "PPH-PHRASE-OUTPUT-ITEMS-HTML-UNMERGEABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_item_has_non_anchor_tagP", "PPH-PHRASE-OUTPUT-ITEM-HAS-NON-ANCHOR-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_output_items_have_identical_closed_htmlP", "PPH-PHRASE-OUTPUT-ITEMS-HAVE-IDENTICAL-CLOSED-HTML?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_identical_closed_html_tagsP", "PPH-IDENTICAL-CLOSED-HTML-TAGS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_current_arg0", "PPH-CURRENT-ARG0", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_current_arg0_specified_p", "PPH-CURRENT-ARG0-SPECIFIED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_current_arg0_position", "PPH-CURRENT-ARG0-POSITION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_maybe_reserve_for_arg0", "PPH-PHRASE-MAYBE-RESERVE-FOR-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_cycl_to_current_arg0", "PPH-PHRASE-SET-CYCL-TO-CURRENT-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_arg0_item_p", "PPH-ARG0-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_arg0_position_p", "PPH-ARG0-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_bare_string_output_item_p", "PPH-BARE-STRING-OUTPUT-ITEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_output_list_with_map", "PPH-PHRASE-SET-OUTPUT-LIST-WITH-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_consolidate_output_list", "PPH-PHRASE-CONSOLIDATE-OUTPUT-LIST", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_consolidate_output_items", "PPH-CONSOLIDATE-OUTPUT-ITEMS", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_phrase_output_list", "NEW-PPH-PHRASE-OUTPUT-LIST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr", "PPH-PHRASE-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_absolute_agr_preds", "PPH-PHRASE-ABSOLUTE-AGR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_agr", "PPH-PHRASE-SET-AGR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_clear_relative_agr", "PPH-PHRASE-CLEAR-RELATIVE-AGR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_agr_constraint", "PPH-PHRASE-SET-AGR-CONSTRAINT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_agr_pred", "PPH-PHRASE-SET-AGR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_agr_pred_unless_nil", "PPH-PHRASE-SET-AGR-PRED-UNLESS-NIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_agr_pred", "PPH-PHRASE-ADD-AGR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_agr_preds", "PPH-PHRASE-ADD-AGR-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_phrase_agr", "PPH-ADD-AGR-PREDS-TO-PHRASE-AGR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_agr_constraint", "PPH-ADD-AGR-PREDS-TO-AGR-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_subject_verb", "PPH-ADD-AGR-PREDS-TO-SUBJECT-VERB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_det_nbar", "PPH-ADD-AGR-PREDS-TO-DET-NBAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_relative_agr_constraint", "PPH-ADD-AGR-PREDS-TO-RELATIVE-AGR-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_nl_preds", "PPH-ADD-AGR-PREDS-TO-NL-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_add_agr_preds_to_pos_pred", "PPH-ADD-AGR-PREDS-TO-POS-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_absolute_agr_preds", "PPH-PHRASE-SET-ABSOLUTE-AGR-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_update_agr_preds", "PPH-PHRASE-UPDATE-AGR-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_agr_preds", "PPH-PHRASE-SET-AGR-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_relative_agr_target", "PPH-PHRASE-SET-RELATIVE-AGR-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_constraint_for_preds", "PPH-PHRASE-AGR-CONSTRAINT-FOR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_check_impossible", "PPH-PHRASE-CHECK-IMPOSSIBLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_impossible_p", "PPH-PHRASE-IMPOSSIBLE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_get_absolute_agr_from_phrase", "PPH-PHRASE-GET-ABSOLUTE-AGR-FROM-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_absolute_agr_from_phrase", "PPH-PHRASE-SET-ABSOLUTE-AGR-FROM-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_agr_constraint_type_p", "PPH-PHRASE-HAS-AGR-CONSTRAINT-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_constraint_of_type", "PPH-PHRASE-AGR-CONSTRAINT-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_target_of_type", "PPH-PHRASE-AGR-TARGET-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_pred", "PPH-PHRASE-AGR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_category_unknown_p", "PPH-PHRASE-CATEGORY-UNKNOWN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_preds", "PPH-PHRASE-AGR-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_preds_from_agr", "PPH-PHRASE-AGR-PREDS-FROM-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_compatible_with_predsP", "PPH-PHRASE-COMPATIBLE-WITH-PREDS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_preds_from_category", "PPH-PHRASE-AGR-PREDS-FROM-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_agr_preds_from_category", "PPH-AGR-PREDS-FROM-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "clear_pph_agr_preds_from_category_cached", "CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "remove_pph_agr_preds_from_category_cached", "REMOVE-PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_agr_preds_from_category_cached_internal", "PPH-AGR-PREDS-FROM-CATEGORY-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_agr_preds_from_category_cached", "PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_agr_preds_from_head", "PPH-PHRASE-AGR-PREDS-FROM-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_conditional_phrase_agr_preds", "PPH-CONDITIONAL-PHRASE-AGR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_compatible_agr_preds", "PPH-PHRASE-COMPATIBLE-AGR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_wu", "PPH-PHRASE-WU", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_wu", "PPH-PHRASE-SET-WU", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_wu_onlyP", "PPH-PHRASE-HAS-WU-ONLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_arg_position_map", "PPH-PHRASE-ARG-POSITION-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_arg_position_from_map", "PPH-PHRASE-ARG-POSITION-FROM-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_arg_position_map", "PPH-PHRASE-SET-ARG-POSITION-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_register_local_arg_positions", "PPH-PHRASE-REGISTER-LOCAL-ARG-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_dtrs", "PPH-PHRASE-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_dtr_count", "PPH-PHRASE-DTR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_unfinished_dtr_count", "PPH-PHRASE-UNFINISHED-DTR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_dtrsP", "PPH-PHRASE-HAS-DTRS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_dtrs", "PPH-PHRASE-SET-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_only_dtr", "PPH-PHRASE-SET-ONLY-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_add_dtr_to_terminal", "PPH-PHRASE-ADD-DTR-TO-TERMINAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_last_dtr", "PPH-PHRASE-LAST-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_multiple_verbsP", "PPH-PHRASE-HAS-MULTIPLE-VERBS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_verb_count", "PPH-PHRASE-VERB-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_count_if", "PPH-PHRASE-COUNT-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_count_if_internal", "PPH-PHRASE-COUNT-IF-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_find_nested_dtr_path", "PPH-PHRASE-FIND-NESTED-DTR-PATH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr_num", "PPH-PHRASE-HEAD-DTR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_head_dtrP", "PPH-PHRASE-HAS-HEAD-DTR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr_numP", "PPH-PHRASE-HEAD-DTR-NUM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_head_dtr_num", "PPH-PHRASE-SET-HEAD-DTR-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_nth_dtr", "PPH-PHRASE-NTH-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr", "PPH-PHRASE-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr_genlP", "PPH-PHRASE-HEAD-DTR-GENL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtr_genl_other_thanP", "PPH-PHRASE-HEAD-DTR-GENL-OTHER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_lexical_head_dtr", "PPH-PHRASE-LEXICAL-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_dtrP", "PPH-PHRASE-HEAD-DTR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_set_nth_dtr", "PPH-PHRASE-SET-NTH-DTR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_nth_dtrP", "PPH-PHRASE-NTH-DTR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_head_verbP", "PPH-PHRASE-HEAD-VERB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_det_nbarP", "PPH-DET-NBAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_justification_bundle", "PPH-JUSTIFICATION-BUNDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_equal", "PPH-PHRASE-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "new_pph_phrase_with_dtr_list", "NEW-PPH-PHRASE-WITH-DTR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "set_pph_phrase_dtrs_from_list", "SET-PPH-PHRASE-DTRS-FROM-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_remove_all_dtrs", "PPH-PHRASE-REMOVE-ALL-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_push", "PPH-PHRASE-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_append", "PPH-PHRASE-APPEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_insert_dtr", "PPH-PHRASE-INSERT-DTR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_front_head_dtr", "PPH-PHRASE-FRONT-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_front_subphrase", "PPH-PHRASE-FRONT-SUBPHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_remove_dtr", "PPH-PHRASE-REMOVE-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_extract_dtr_num", "PPH-PHRASE-EXTRACT-DTR-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "update_pph_head_dtr_num_after_extraction", "UPDATE-PPH-HEAD-DTR-NUM-AFTER-EXTRACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_decrement_head_dtr_num", "PPH-PHRASE-DECREMENT-HEAD-DTR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_increment_head_dtr_num", "PPH-PHRASE-INCREMENT-HEAD-DTR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "update_pph_nth_phrases", "UPDATE-PPH-NTH-PHRASES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_new_agr_num_from_old", "PPH-NEW-AGR-NUM-FROM-OLD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "similar_pph_nth_phrase_with_number", "SIMILAR-PPH-NTH-PHRASE-WITH-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "pph_phrase_has_weak_justificationP", "PPH-PHRASE-HAS-WEAK-JUSTIFICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "gather_weak_justifications", "GATHER-WEAK-JUSTIFICATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_phrase", "gather_all_justifications", "GATHER-ALL-JUSTIFICATIONS", 1, 1, false);
        return (SubLObject)pph_phrase.NIL;
    }
    
    public static SubLObject init_pph_phrase_file() {
        pph_phrase.$pph_phrase_display_agrP$ = SubLFiles.defparameter("*PPH-PHRASE-DISPLAY-AGR?*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_warn_about_reverting_phrasesP$ = SubLFiles.defparameter("*PPH-WARN-ABOUT-REVERTING-PHRASES?*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_phrase_copy_stack$ = SubLFiles.defparameter("*PPH-PHRASE-COPY-STACK*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_phrase_copy_nesting_max$ = SubLFiles.defparameter("*PPH-PHRASE-COPY-NESTING-MAX*", (SubLObject)pph_phrase.$int29$60);
        pph_phrase.$pph_phrase_nonlocal_feature_properties$ = SubLFiles.deflexical("*PPH-PHRASE-NONLOCAL-FEATURE-PROPERTIES*", (SubLObject)pph_phrase.$list58);
        pph_phrase.$pph_special_types$ = SubLFiles.deflexical("*PPH-SPECIAL-TYPES*", (SubLObject)pph_phrase.$list62);
        pph_phrase.$pph_variable_bindings$ = SubLFiles.defparameter("*PPH-VARIABLE-BINDINGS*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_sanity_check_phrase_donenessP$ = SubLFiles.defparameter("*PPH-SANITY-CHECK-PHRASE-DONENESS?*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_phrase_destroyer_grace_period$ = SubLFiles.deflexical("*PPH-PHRASE-DESTROYER-GRACE-PERIOD*", (SubLObject)pph_phrase.$int137$600);
        pph_phrase.$pph_phrase_destroyer$ = SubLFiles.deflexical("*PPH-PHRASE-DESTROYER*", maybeDefault((SubLObject)pph_phrase.$sym138$_PPH_PHRASE_DESTROYER_, pph_phrase.$pph_phrase_destroyer$, ()->(delayed_processor.new_delayed_processor(pph_phrase.$pph_phrase_destroyer_grace_period$.getGlobalValue(), (SubLObject)pph_phrase.$sym139$VALID_PPH_PHRASE_P, (SubLObject)pph_phrase.$sym140$DESTROY_PPH_PHRASE_LOW))));
        pph_phrase.$warn_about_pph_phrase_destruction_caching_state$ = SubLFiles.deflexical("*WARN-ABOUT-PPH-PHRASE-DESTRUCTION-CACHING-STATE*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$warn_on_invalid_pph_inferencesP$ = SubLFiles.defparameter("*WARN-ON-INVALID-PPH-INFERENCES?*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_do_alternatives_max$ = SubLFiles.defparameter("*PPH-DO-ALTERNATIVES-MAX*", (SubLObject)pph_phrase.$int185$500);
        pph_phrase.$pph_root_mother_list$ = SubLFiles.defparameter("*PPH-ROOT-MOTHER-LIST*", (SubLObject)pph_phrase.NIL);
        pph_phrase.$pph_variant_list_max_count$ = SubLFiles.defparameter("*PPH-VARIANT-LIST-MAX-COUNT*", (SubLObject)pph_phrase.TEN_INTEGER);
        pph_phrase.$pph_phrase_category_depth$ = SubLFiles.defparameter("*PPH-PHRASE-CATEGORY-DEPTH*", (SubLObject)pph_phrase.ZERO_INTEGER);
        pph_phrase.$pph_phrase_category_max_depth$ = SubLFiles.deflexical("*PPH-PHRASE-CATEGORY-MAX-DEPTH*", (SubLObject)(maybeDefault((SubLObject)pph_phrase.$sym250$_PPH_PHRASE_CATEGORY_MAX_DEPTH_, pph_phrase.$pph_phrase_category_max_depth$, pph_phrase.$int251$99)));
        pph_phrase.$pph_unknown_cycl$ = SubLFiles.defconstant("*PPH-UNKNOWN-CYCL*", (SubLObject)pph_phrase.$kw266$PPH_UNKNOWN_CYCL);
        pph_phrase.$pph_empty_cycl$ = SubLFiles.defconstant("*PPH-EMPTY-CYCL*", (SubLObject)pph_phrase.$kw267$PPH_EMPTY_CYCL);
        pph_phrase.$pph_agr_preds_from_category_cached_caching_state$ = SubLFiles.deflexical("*PPH-AGR-PREDS-FROM-CATEGORY-CACHED-CACHING-STATE*", (SubLObject)pph_phrase.NIL);
        return (SubLObject)pph_phrase.NIL;
    }
    
    public static SubLObject setup_pph_phrase_file() {
        memoization_state.note_memoized_function((SubLObject)pph_phrase.$sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE);
        access_macros.register_macro_helper((SubLObject)pph_phrase.$sym40$FIND_OR_CREATE_PPH_PHRASE_COPY_STACK, (SubLObject)pph_phrase.$sym41$WITH_PPH_PHRASE_COPY_RECURSION_PROTECTION);
        memoization_state.note_memoized_function((SubLObject)pph_phrase.$sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_phrase.$sym138$_PPH_PHRASE_DESTROYER_);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_phrase.$sym141$SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND);
        Storage.register_low_memory_callback(Symbols.symbol_function((SubLObject)pph_phrase.$sym141$SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND));
        memoization_state.note_globally_cached_function((SubLObject)pph_phrase.$sym144$WARN_ABOUT_PPH_PHRASE_DESTRUCTION);
        memoization_state.note_memoized_function((SubLObject)pph_phrase.$sym211$PPH_VARIANT_STRING__);
        memoization_state.note_memoized_function((SubLObject)pph_phrase.$sym216$PPH_VARIANT_STRING);
        subl_macro_promotions.declare_defglobal((SubLObject)pph_phrase.$sym250$_PPH_PHRASE_CATEGORY_MAX_DEPTH_);
        memoization_state.note_globally_cached_function((SubLObject)pph_phrase.$sym300$PPH_AGR_PREDS_FROM_CATEGORY_CACHED);
        sunit_external.define_test_category((SubLObject)pph_phrase.$str321$PPH_Phrase, (SubLObject)pph_phrase.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)pph_phrase.$str322$PPH_Phrase_Test_Suite, (SubLObject)pph_phrase.$list323, (SubLObject)pph_phrase.UNPROVIDED, (SubLObject)pph_phrase.UNPROVIDED);
        return (SubLObject)pph_phrase.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_phrase_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_phrase_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_phrase_file();
    }
    
    static {
        me = (SubLFile)new pph_phrase();
        pph_phrase.$pph_phrase_display_agrP$ = null;
        pph_phrase.$pph_warn_about_reverting_phrasesP$ = null;
        pph_phrase.$pph_phrase_copy_stack$ = null;
        pph_phrase.$pph_phrase_copy_nesting_max$ = null;
        pph_phrase.$pph_phrase_nonlocal_feature_properties$ = null;
        pph_phrase.$pph_special_types$ = null;
        pph_phrase.$pph_variable_bindings$ = null;
        pph_phrase.$pph_sanity_check_phrase_donenessP$ = null;
        pph_phrase.$pph_phrase_destroyer_grace_period$ = null;
        pph_phrase.$pph_phrase_destroyer$ = null;
        pph_phrase.$warn_about_pph_phrase_destruction_caching_state$ = null;
        pph_phrase.$warn_on_invalid_pph_inferencesP$ = null;
        pph_phrase.$pph_do_alternatives_max$ = null;
        pph_phrase.$pph_root_mother_list$ = null;
        pph_phrase.$pph_variant_list_max_count$ = null;
        pph_phrase.$pph_phrase_category_depth$ = null;
        pph_phrase.$pph_phrase_category_max_depth$ = null;
        pph_phrase.$pph_unknown_cycl$ = null;
        pph_phrase.$pph_empty_cycl$ = null;
        pph_phrase.$pph_agr_preds_from_category_cached_caching_state$ = null;
        $str0$Keeping_generic_arg__S_ = SubLObjectFactory.makeString("Keeping generic arg ~S.");
        $str1$Not_keeping_generic_arg__S_ = SubLObjectFactory.makeString("Not keeping generic arg ~S.");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DTR"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("DTR-NUM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)pph_phrase.ZERO_INTEGER);
        $sym5$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym6$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym7$SIGN_CONSTITUENTS = SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS");
        $sym8$SIGN_DO_CONSTITUENTS = SubLObjectFactory.makeSymbol("SIGN-DO-CONSTITUENTS");
        $sym9$CINC = SubLObjectFactory.makeSymbol("CINC");
        $str10$ = SubLObjectFactory.makeString("");
        $str11$_INVALID_PPH_PHRASE_ = SubLObjectFactory.makeString("<INVALID PPH PHRASE>");
        $str12$___Dtr___A__ = SubLObjectFactory.makeString("~% Dtr #~A: ");
        $str13$___PPH_PHRASE__S = SubLObjectFactory.makeString("~%<PPH-PHRASE ~S");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-NOTED-STRING"), (SubLObject)SubLObjectFactory.makeString("string")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SIGN-CATEGORY"), (SubLObject)SubLObjectFactory.makeString("category")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-CYCL"), (SubLObject)SubLObjectFactory.makeString("cycl")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR"), (SubLObject)SubLObjectFactory.makeString("agr")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-WU"), (SubLObject)SubLObjectFactory.makeString("wu")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-CASE"), (SubLObject)SubLObjectFactory.makeString("case")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeString("output list")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeString("justification")));
        $list15 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $kw16$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $str17$__A___S__ = SubLObjectFactory.makeString(" ~A: ~S~%");
        $str18$__S__ = SubLObjectFactory.makeString(" ~S~%");
        $str19$_ = SubLObjectFactory.makeString("-");
        $str20$__head_ = SubLObjectFactory.makeString(" (head)");
        $str21$___Dtrs_ = SubLObjectFactory.makeString("~& Dtrs:");
        $str22$_Head_ = SubLObjectFactory.makeString(" Head:");
        $str23$__S = SubLObjectFactory.makeString(" ~S");
        $str24$___S__A_ = SubLObjectFactory.makeString(" (~S ~A)");
        $str25$_ = SubLObjectFactory.makeString(">");
        $sym26$PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE = SubLObjectFactory.makeSymbol("PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE");
        $str27$Failed_to_paraphrase__S___categor = SubLObjectFactory.makeString("Failed to paraphrase ~S~% category: ~S preds: ~S");
        $int28$128 = SubLObjectFactory.makeInteger(128);
        $int29$60 = SubLObjectFactory.makeInteger(60);
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym31$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-STACK*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-STACK*")), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-NESTING-MAX*")));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-ERROR"), (SubLObject)pph_phrase.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY."), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-NESTING-MAX*"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-STACK*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PHRASE-COPY-STACK"))));
        $sym35$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-STACK*"));
        $sym37$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym38$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-POP"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-COPY-STACK*")));
        $sym40$FIND_OR_CREATE_PPH_PHRASE_COPY_STACK = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PHRASE-COPY-STACK");
        $sym41$WITH_PPH_PHRASE_COPY_RECURSION_PROTECTION = SubLObjectFactory.makeSymbol("WITH-PPH-PHRASE-COPY-RECURSION-PROTECTION");
        $sym42$STACK_P = SubLObjectFactory.makeSymbol("STACK-P");
        $str43$__Copying_phrase____S = SubLObjectFactory.makeString("~&Copying phrase~% ~S");
        $str44$Can_t_reuse_old_phrase_____S__ = SubLObjectFactory.makeString("Can't reuse old phrase:~% ~S~%");
        $kw45$NON_LOCAL_FEATURES_IGNORED_ = SubLObjectFactory.makeKeyword("NON-LOCAL-FEATURES-IGNORED?");
        $str46$__Copying_nonlocal_features_of___ = SubLObjectFactory.makeString("~&Copying nonlocal features of~% ~S from~% ~S");
        $str47$__Reusing_copy_of_phrase_____S__ = SubLObjectFactory.makeString("~&Reusing copy of phrase:~% ~S~%");
        $str48$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str49$__ = SubLObjectFactory.makeString(") ");
        $str50$__Recursion_limit___S__exceeded_i = SubLObjectFactory.makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY.");
        $kw51$COPYING_PHRASE = SubLObjectFactory.makeKeyword("COPYING-PHRASE");
        $str52$__Set_top_level_demerits_to__S = SubLObjectFactory.makeString("~&Set top-level demerits to ~S");
        $str53$__Set_output_list_to__S = SubLObjectFactory.makeString("~&Set output list to ~S");
        $str54$__Set_category_to__S = SubLObjectFactory.makeString("~&Set category to ~S");
        $str55$__Copied_noted_string__S = SubLObjectFactory.makeString("~&Copied noted string ~S");
        $str56$__Setting_agr_to__S = SubLObjectFactory.makeString("~&Setting agr to ~S");
        $str57$__Set_agr_to__S = SubLObjectFactory.makeString("~&Set agr to ~S");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MOTHER"), (SubLObject)SubLObjectFactory.makeKeyword("ALTERNATIVES"));
        $sym59$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym60$CLOSED_LEXICAL_CLASS_STRING_ = SubLObjectFactory.makeSymbol("CLOSED-LEXICAL-CLASS-STRING?");
        $sym61$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PERCENT-PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("SYMBOL-PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL-PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-PARAPHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-MENTION"), (SubLObject)SubLObjectFactory.makeKeyword("CLARIFYING"));
        $kw63$SPECIAL_TYPE = SubLObjectFactory.makeKeyword("SPECIAL-TYPE");
        $kw64$FOCUS_ARG = SubLObjectFactory.makeKeyword("FOCUS-ARG");
        $kw65$PERCENT_PHRASE = SubLObjectFactory.makeKeyword("PERCENT-PHRASE");
        $kw66$CLARIFYING = SubLObjectFactory.makeKeyword("CLARIFYING");
        $kw67$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw68$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $kw69$SYMBOL_PHRASE = SubLObjectFactory.makeKeyword("SYMBOL-PHRASE");
        $kw70$SYMBOL = SubLObjectFactory.makeKeyword("SYMBOL");
        $kw71$CYCL_PHRASE = SubLObjectFactory.makeKeyword("CYCL-PHRASE");
        $kw72$QUOTED_PARAPHRASE = SubLObjectFactory.makeKeyword("QUOTED-PARAPHRASE");
        $kw73$STRING_MENTION = SubLObjectFactory.makeKeyword("STRING-MENTION");
        $kw74$NOSPACE = SubLObjectFactory.makeKeyword("NOSPACE");
        $kw75$VARIABLE_BINDING = SubLObjectFactory.makeKeyword("VARIABLE-BINDING");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-EL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-PHRASE-NAUT"));
        $kw77$PHRASE_NAUT = SubLObjectFactory.makeKeyword("PHRASE-NAUT");
        $kw78$QUERY_EL_FORMULA = SubLObjectFactory.makeKeyword("QUERY-EL-FORMULA");
        $str79$Couldn_t_find__S___in__S = SubLObjectFactory.makeString("Couldn't find ~S~% in ~S");
        $sym80$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym81$PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA = SubLObjectFactory.makeSymbol("PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA");
        $list82 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), pph_phrase.ONE_INTEGER, SubLObjectFactory.makeKeyword("FORGET-EXTRA-RESULTS?"), pph_phrase.T, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), pph_phrase.T, SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS") });
        $str83$Couldn_t_find_bindings_for__S = SubLObjectFactory.makeString("Couldn't find bindings for ~S");
        $int84$24 = SubLObjectFactory.makeInteger(24);
        $str85$Can_t_resolve__S_due_to__S = SubLObjectFactory.makeString("Can't resolve ~S due to ~S");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-VARIABLE-BINDINGS*"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $kw87$TERSE_PARAPHRASE = SubLObjectFactory.makeKeyword("TERSE-PARAPHRASE");
        $kw88$PRECISE_PARAPHRASE = SubLObjectFactory.makeKeyword("PRECISE-PARAPHRASE");
        $kw89$CHEMICAL_FORMULA_FROM_LISTS = SubLObjectFactory.makeKeyword("CHEMICAL-FORMULA-FROM-LISTS");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY-LIST"));
        $kw91$CONDITIONAL_PHRASE = SubLObjectFactory.makeKeyword("CONDITIONAL-PHRASE");
        $str92$NEW_PPH_CONDITIONAL_PHRASE_passed = SubLObjectFactory.makeString("NEW-PPH-CONDITIONAL-PHRASE passed bogus phrase-naut: ~S");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-NAUT-IF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-NAUT-IF-NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BESTNLPHRASEOFSTRINGFN")), (SubLObject)SubLObjectFactory.makeSymbol("*EMPTY-STRING*"))));
        $kw94$ARG3 = SubLObjectFactory.makeKeyword("ARG3");
        $str95$__ConditionalPhraseFn_expects_a_c = SubLObjectFactory.makeString("#$ConditionalPhraseFn expects a closed formula for its arg1, not ~S");
        $kw96$COORDINATION = SubLObjectFactory.makeKeyword("COORDINATION");
        $kw97$UNORDERED = SubLObjectFactory.makeKeyword("UNORDERED");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-TYPE"));
        $const99$FormulaArgFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn"));
        $kw100$AND = SubLObjectFactory.makeKeyword("AND");
        $kw101$BUT = SubLObjectFactory.makeKeyword("BUT");
        $kw102$OR = SubLObjectFactory.makeKeyword("OR");
        $kw103$NONE = SubLObjectFactory.makeKeyword("NONE");
        $const104$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const105$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $sym106$_ID_STRING = SubLObjectFactory.makeSymbol("?ID-STRING");
        $const107$htmlListTypeIdentifierString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("htmlListTypeIdentifierString"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ID-STRING"));
        $const109$HTMLRepresentationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HTMLRepresentationMt"));
        $const110$CoordinatingConjunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoordinatingConjunction"));
        $const111$Feminine_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Feminine-NLAttr"));
        $const112$ThirdPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $kw113$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $const114$Plural_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $const115$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $const116$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $const117$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $kw118$REPEATED = SubLObjectFactory.makeKeyword("REPEATED");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-ARG-SPECIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-PHRASE-NAUT"));
        $str120$Found_non_phrase_dtr___S = SubLObjectFactory.makeString("Found non-phrase dtr: ~S");
        $kw121$VERIFIED = SubLObjectFactory.makeKeyword("VERIFIED");
        $sym122$PPH_PHRASE_OUTPUT_ITEM_LOOSE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P");
        $sym123$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const124$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list125 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForms")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posBaseForms")));
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("A-TheWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("An-TheWord")));
        $list127 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr")));
        $const128$The_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The-TheWord"));
        $const129$Definite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $kw130$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $str131$_S_not_considered_done_ = SubLObjectFactory.makeString("~S not considered done.");
        $const132$Between_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Between-TheWord"));
        $str133$between = SubLObjectFactory.makeString("between");
        $const134$EnDash_TheSymbol = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnDash-TheSymbol"));
        $str135$Destroying_dtrs_of__S = SubLObjectFactory.makeString("Destroying dtrs of ~S");
        $str136$Destroyed_failed_phrase_dtrs____N = SubLObjectFactory.makeString("Destroyed failed phrase dtrs.~% New PPH phrase count went from ~S to ~S.~%");
        $int137$600 = SubLObjectFactory.makeInteger(600);
        $sym138$_PPH_PHRASE_DESTROYER_ = SubLObjectFactory.makeSymbol("*PPH-PHRASE-DESTROYER*");
        $sym139$VALID_PPH_PHRASE_P = SubLObjectFactory.makeSymbol("VALID-PPH-PHRASE-P");
        $sym140$DESTROY_PPH_PHRASE_LOW = SubLObjectFactory.makeSymbol("DESTROY-PPH-PHRASE-LOW");
        $sym141$SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND = SubLObjectFactory.makeSymbol("SMITE-DOOMED-PPH-PHRASES-NEXT-TIME-AROUND");
        $kw142$DESTRUCTION_EXCEPTIONS = SubLObjectFactory.makeKeyword("DESTRUCTION-EXCEPTIONS");
        $str143$Socket_Connection_Handler = SubLObjectFactory.makeString("Socket Connection Handler");
        $sym144$WARN_ABOUT_PPH_PHRASE_DESTRUCTION = SubLObjectFactory.makeSymbol("WARN-ABOUT-PPH-PHRASE-DESTRUCTION");
        $str145$Destroy_PPH_phrases_is__S_for__S = SubLObjectFactory.makeString("Destroy PPH phrases is ~S for ~S");
        $sym146$_WARN_ABOUT_PPH_PHRASE_DESTRUCTION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WARN-ABOUT-PPH-PHRASE-DESTRUCTION-CACHING-STATE*");
        $kw147$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw148$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw149$DESTROYED = SubLObjectFactory.makeKeyword("DESTROYED");
        $kw150$DEMERITS = SubLObjectFactory.makeKeyword("DEMERITS");
        $kw151$CASE = SubLObjectFactory.makeKeyword("CASE");
        $kw152$PROBLEM_DICTIONARY = SubLObjectFactory.makeKeyword("PROBLEM-DICTIONARY");
        $kw153$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw154$MOTHER = SubLObjectFactory.makeKeyword("MOTHER");
        $kw155$LINK_CYCL = SubLObjectFactory.makeKeyword("LINK-CYCL");
        $kw156$WU = SubLObjectFactory.makeKeyword("WU");
        $kw157$HEAD_DTR_NUM = SubLObjectFactory.makeKeyword("HEAD-DTR-NUM");
        $kw158$SOURCE_POS = SubLObjectFactory.makeKeyword("SOURCE-POS");
        $kw159$ALTERNATIVES = SubLObjectFactory.makeKeyword("ALTERNATIVES");
        $kw160$RESERVED_FOR_MATRIX_ARG0 = SubLObjectFactory.makeKeyword("RESERVED-FOR-MATRIX-ARG0");
        $kw161$DEMERITS_REASON = SubLObjectFactory.makeKeyword("DEMERITS-REASON");
        $sym162$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw163$MAX_ALTERNATIVES = SubLObjectFactory.makeKeyword("MAX-ALTERNATIVES");
        $sym164$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str165$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $kw166$INFERENCES = SubLObjectFactory.makeKeyword("INFERENCES");
        $sym167$FIND_INFERENCE_BY_IDS = SubLObjectFactory.makeSymbol("FIND-INFERENCE-BY-IDS");
        $str168$__Setting_object_dtr_agr_to_accus = SubLObjectFactory.makeString("~&Setting object dtr agr to accusative case.~%");
        $kw169$ACCUSATIVE = SubLObjectFactory.makeKeyword("ACCUSATIVE");
        $str170$__Setting_possessive_dtr_agr_to_g = SubLObjectFactory.makeString("~&Setting possessive dtr agr to genitive case.~%");
        $kw171$GENITIVE = SubLObjectFactory.makeKeyword("GENITIVE");
        $const172$PossessivePhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $sym173$PPH_PHRASE_CATEGORY = SubLObjectFactory.makeSymbol("PPH-PHRASE-CATEGORY");
        $str174$Dtr_2_of_phrase_is_object_of__S__ = SubLObjectFactory.makeString("Dtr 2 of phrase is object of ~S:~% ~S~%");
        $const175$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const176$TransitiveNPFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame"));
        $str177$__Setting_subject_dtr_agr_to_nomi = SubLObjectFactory.makeString("~&Setting subject dtr agr to nominative case.~%");
        $kw178$NOMINATIVE = SubLObjectFactory.makeKeyword("NOMINATIVE");
        $list179 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-INFO"));
        $str180$_reported_a_ = SubLObjectFactory.makeString(" reported a ");
        $str181$_problem = SubLObjectFactory.makeString(" problem");
        $str182$_with_this_additional_info_ = SubLObjectFactory.makeString(" with this additional info:");
        $str183$_ = SubLObjectFactory.makeString(" ");
        $str184$_ = SubLObjectFactory.makeString(".");
        $int185$500 = SubLObjectFactory.makeInteger(500);
        $list186 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALTERNATIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-ALTERNATIVE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym187$QUEUE = SubLObjectFactory.makeUninternedSymbol("QUEUE");
        $sym188$DONE_COUNT = SubLObjectFactory.makeUninternedSymbol("DONE-COUNT");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE")));
        $sym190$ENQUEUE = SubLObjectFactory.makeSymbol("ENQUEUE");
        $sym191$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym192$QUEUE_EMPTY_P = SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P");
        $sym193$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $sym194$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym195$PPH_PHRASE_LOCAL_ALTERNATIVES = SubLObjectFactory.makeSymbol("PPH-PHRASE-LOCAL-ALTERNATIVES");
        $sym196$__ = SubLObjectFactory.makeSymbol(">=");
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DO-ALTERNATIVES-MAX*"));
        $sym198$PPH_ERROR = SubLObjectFactory.makeSymbol("PPH-ERROR");
        $str199$Done__S_alternatives_of__S = SubLObjectFactory.makeString("Done ~S alternatives of ~S");
        $str200$Setting_phrase_s_mother_to_itself = SubLObjectFactory.makeString("Setting phrase's mother to itself.");
        $const201$NLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $str202$Mother_is_part_of_cycle___S = SubLObjectFactory.makeString("Mother is part of cycle: ~S");
        $str203$PPH_PHRASE_ADD_JUSTIFICATION_pass = SubLObjectFactory.makeString("PPH-PHRASE-ADD-JUSTIFICATION passed NIL.");
        $sym204$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym205$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw206$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym207$NL_GENERATION_CACHE_METHOD = SubLObjectFactory.makeSymbol("NL-GENERATION-CACHE-METHOD");
        $sym208$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $const209$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $sym210$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $sym211$PPH_VARIANT_STRING__ = SubLObjectFactory.makeSymbol("PPH-VARIANT-STRING-=");
        $str212$Ignoring_possible_variants_for_me = SubLObjectFactory.makeString("Ignoring possible variants for meta phrase~% ~S");
        $sym213$VARIANT_HAS_MISSING_TARGET_ = SubLObjectFactory.makeSymbol("VARIANT-HAS-MISSING-TARGET?");
        $str214$Generated__D_dtr_variant_lists_fo = SubLObjectFactory.makeString("Generated ~D dtr variant lists for ~A.");
        $str215$current_phrase = SubLObjectFactory.makeString("current phrase");
        $sym216$PPH_VARIANT_STRING = SubLObjectFactory.makeSymbol("PPH-VARIANT-STRING");
        $sym217$PPH_ANCESTOR_PHRASE_OR_SELF_P = SubLObjectFactory.makeSymbol("PPH-ANCESTOR-PHRASE-OR-SELF-P");
        $sym218$PPH_PHRASE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-P");
        $str219$Failed_to_get_string_for_variant_ = SubLObjectFactory.makeString("Failed to get string for variant~% ~S");
        $list220 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOSPACE"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str221$Auto_nested_PPH_phrase_variant__M = SubLObjectFactory.makeString("Auto-nested PPH phrase variant. Matrix phrase: ~S");
        $str222$PPH_phrase_variant_with_nesting_d = SubLObjectFactory.makeString("PPH phrase variant with nesting depth > 10. Matrix phrase: ~S");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("an"));
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)pph_phrase.NIL);
        $sym225$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym226$PPH_PHRASE_OUTPUT_ITEM_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");
        $kw227$HTML_STRING = SubLObjectFactory.makeKeyword("HTML-STRING");
        $str228$Failed_to_note__S_on__S___Noted_s = SubLObjectFactory.makeString("Failed to note ~S on ~S~% Noted string: ~S.");
        $kw229$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str230$href = SubLObjectFactory.makeString("href");
        $str231$__Adding_new_tag_inside_old___ = SubLObjectFactory.makeString("~&Adding new tag inside old.~%");
        $str232$__Setting_string_to__S___S_ = SubLObjectFactory.makeString("~&Setting string to ~S (~S)");
        $str233$_S_is_a_forbidden_paraphrase_for_ = SubLObjectFactory.makeString("~S is a forbidden paraphrase for ~S");
        $str234$__Output_list_1___S = SubLObjectFactory.makeString("~&Output list 1: ~S");
        $str235$__Output_item____S = SubLObjectFactory.makeString("~&Output item : ~S");
        $str236$__output_item_2____S = SubLObjectFactory.makeString("~&output item 2 : ~S");
        $str237$__output_item_3____S = SubLObjectFactory.makeString("~&output item 3 : ~S");
        $str238$__output_item_4____S = SubLObjectFactory.makeString("~&output item 4 : ~S");
        $sym239$PPH_PHRASE_OUTPUT_ITEM_COPY = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");
        $kw240$ANY = SubLObjectFactory.makeKeyword("ANY");
        $str241$NP_is_heavy_based_on_string__S = SubLObjectFactory.makeString("NP is heavy based on string ~S");
        $str242$NP_is_heavy_based_on_dtrs_ = SubLObjectFactory.makeString("NP is heavy based on dtrs.");
        $const243$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const244$Be_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Be-TheWord"));
        $const245$AuxVerb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb"));
        $const246$posForms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForms"));
        $list247 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb")));
        $list248 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("untensed")));
        $const249$OrdinalAdjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrdinalAdjective"));
        $sym250$_PPH_PHRASE_CATEGORY_MAX_DEPTH_ = SubLObjectFactory.makeSymbol("*PPH-PHRASE-CATEGORY-MAX-DEPTH*");
        $int251$99 = SubLObjectFactory.makeInteger(99);
        $str252$Excessive_recursion___S__in_PPH_P = SubLObjectFactory.makeString("Excessive recursion (~S) in PPH-PHRASE-CATEGORY.");
        $str253$__Setting_CycL_phrase_s_category_ = SubLObjectFactory.makeString("~&Setting CycL phrase's category to ~S.~%");
        $kw254$RETURN_NIL = SubLObjectFactory.makeKeyword("RETURN-NIL");
        $str255$Possessivizing_NP_ = SubLObjectFactory.makeString("Possessivizing NP.");
        $str256$Nominalizing_a_possessive_ = SubLObjectFactory.makeString("Nominalizing a possessive.");
        $kw257$OVERRIDE = SubLObjectFactory.makeKeyword("OVERRIDE");
        $kw258$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str259$Converting_NP_to__instance_of__Nb = SubLObjectFactory.makeString("Converting NP to 'instance of' Nbar: ~S");
        $list260 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Instance-TheWord")));
        $list261 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Of-TheWord")));
        $str262$New_Nbar___S = SubLObjectFactory.makeString("New Nbar: ~S");
        $sym263$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const264$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $str265$Don_t_know_how_to_reconcile__S_an = SubLObjectFactory.makeString("Don't know how to reconcile ~S and ~S.");
        $kw266$PPH_UNKNOWN_CYCL = SubLObjectFactory.makeKeyword("PPH-UNKNOWN-CYCL");
        $kw267$PPH_EMPTY_CYCL = SubLObjectFactory.makeKeyword("PPH-EMPTY-CYCL");
        $str268$Couldn_t_find_another_reference_t = SubLObjectFactory.makeString("Couldn't find another reference to ~S other than~% ~S");
        $str269$_S_is_not_a_dtr_of_its_mother____ = SubLObjectFactory.makeString("~S is not a dtr of its mother~% ~S");
        $str270$__Found_another_reference_to__S__ = SubLObjectFactory.makeString("~&Found another reference to ~S:~% Besides: ~S~% Found: ~S~%");
        $kw271$KEEP_OLD_ARG_POSITION = SubLObjectFactory.makeKeyword("KEEP-OLD-ARG-POSITION");
        $sym272$PPH_ARG_POSITION_SPECIFIER_ = SubLObjectFactory.makeSymbol("PPH-ARG-POSITION-SPECIFIER?");
        $kw273$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str274$Replacing__S_____with__S__ = SubLObjectFactory.makeString("Replacing ~S~%   with ~S~%");
        $str275$__Setting_arg_position_of__S_to__ = SubLObjectFactory.makeString("~&Setting arg-position of ~S to ~S~%");
        $str276$cycls_of_phrases_doesn_t_know_wha = SubLObjectFactory.makeString("cycls-of-phrases doesn't know what to do with ~S");
        $sym277$ALPHANUMERIC_CHAR_P = SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-P");
        $kw278$COMPUTE = SubLObjectFactory.makeKeyword("COMPUTE");
        $kw279$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $kw280$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $kw281$DONT_CARE = SubLObjectFactory.makeKeyword("DONT-CARE");
        $str282$Bad_agr_value__S__ = SubLObjectFactory.makeString("Bad agr value ~S~%");
        $str283$New_target__S___for_non_new_phras = SubLObjectFactory.makeString("New target ~S~% for non-new phrase ~S");
        $str284$Don_t_careifying__S = SubLObjectFactory.makeString("Don't-careifying ~S");
        $str285$Bad_agr_constraint___S = SubLObjectFactory.makeString("Bad agr-constraint: ~S");
        $str286$Singleton_agr_constraint_target__ = SubLObjectFactory.makeString("Singleton agr-constraint target: ~S");
        $kw287$SUBJECT_VERB = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $kw288$DET_NBAR = SubLObjectFactory.makeKeyword("DET-NBAR");
        $str289$__Can_t_add_new_constraints__S_to = SubLObjectFactory.makeString("~&Can't add new constraints ~S to agr-constraint ~S~%");
        $str290$__Updated_agr_preds_from__S_to__S = SubLObjectFactory.makeString("~&Updated agr preds from ~S to ~S.");
        $str291$_S_should_be_a_list_of_speech_par = SubLObjectFactory.makeString("~S should be a list of speech-part or name-string preds.~%");
        $str292$Impossible_phrase_____S__ = SubLObjectFactory.makeString("Impossible phrase:~% ~S~%");
        $kw293$IMPOSSIBLE = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $str294$Impossible_because_of_agr_constra = SubLObjectFactory.makeString("Impossible because of agr constraint:~% ~S");
        $str295$Removed__S_from__S___based_on_cat = SubLObjectFactory.makeString("Removed ~S from ~S~% based on category ~S, leaving ~S");
        $str296$Can_t_reconcile__S_and__S_and__S_ = SubLObjectFactory.makeString("Can't reconcile ~S and ~S and ~S~% on ~S~%");
        $kw297$PEER = SubLObjectFactory.makeKeyword("PEER");
        $list298 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pronounStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")));
        $list299 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $sym300$PPH_AGR_PREDS_FROM_CATEGORY_CACHED = SubLObjectFactory.makeSymbol("PPH-AGR-PREDS-FROM-CATEGORY-CACHED");
        $const301$pronounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pronounStrings"));
        $sym302$_PPH_AGR_PREDS_FROM_CATEGORY_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-AGR-PREDS-FROM-CATEGORY-CACHED-CACHING-STATE*");
        $sym303$CLEAR_PPH_AGR_PREDS_FROM_CATEGORY_CACHED = SubLObjectFactory.makeSymbol("CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED");
        $str304$__Phrase__D_is_unfinished_ = SubLObjectFactory.makeString("~&Phrase ~D is unfinished.");
        $str305$Can_t_set_dtrs_of_non_phrase__S = SubLObjectFactory.makeString("Can't set dtrs of non-phrase ~S");
        $str306$Adding_old_dtr_to_new_mother____M = SubLObjectFactory.makeString("Adding old dtr to new mother.~% Mother: ~S~% Dtr: ~S~%");
        $str307$_S_is_not_terminal = SubLObjectFactory.makeString("~S is not terminal");
        $sym308$PPH_PHRASE_VERB_ = SubLObjectFactory.makeSymbol("PPH-PHRASE-VERB?");
        $sym309$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic310 = Vectors.vector(pph_phrase.EMPTY_SUBL_OBJECT_ARRAY);
        $str311$Can_t_insert_dtr_into_position__D = SubLObjectFactory.makeString("Can't insert dtr into position ~D. Only ~D existing dtr~:P!");
        $str312$Extraction_disparity___Expected__ = SubLObjectFactory.makeString("Extraction disparity.~%Expected~% ~S~%Extracted~% ~S~%");
        $str313$Setting_head_dtr_to_initial_dtr__ = SubLObjectFactory.makeString("Setting head dtr to initial dtr:~% ~S~%");
        $str314$Extracting_dtr__D___S = SubLObjectFactory.makeString("Extracting dtr ~D: ~S");
        $str315$__Setting_head_dtr_num_from__S = SubLObjectFactory.makeString("~&Setting head dtr num from ~S");
        $str316$_to__S__ = SubLObjectFactory.makeString(" to ~S~%");
        $str317$Phrase_has_lost_its_head_____S__ = SubLObjectFactory.makeString("Phrase has lost its head:~% ~S~%");
        $str318$Setting_agr_target_to_itself_ = SubLObjectFactory.makeString("Setting agr target to itself!");
        $str319$Setting_agr_target_to_non_existen = SubLObjectFactory.makeString("Setting agr target to non-existent phrase!");
        $str320$__Setting_agr_target_num_of_dtr__ = SubLObjectFactory.makeString("~&Setting agr target num of dtr ~S from ~S to ~S~%");
        $str321$PPH_Phrase = SubLObjectFactory.makeString("PPH Phrase");
        $str322$PPH_Phrase_Test_Suite = SubLObjectFactory.makeString("PPH Phrase Test Suite");
        $list323 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PPH Phrase"));
    }
    
    public static final class $pph_phrase_output_list_p$UnaryFunction extends UnaryFunction
    {
        public $pph_phrase_output_list_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-OUTPUT-LIST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase.pph_phrase_output_list_p(arg1);
        }
    }
    
    public static final class $pph_phrase_set_suid$BinaryFunction extends BinaryFunction
    {
        public $pph_phrase_set_suid$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PHRASE-SET-SUID"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pph_phrase.pph_phrase_set_suid(arg1, arg2);
        }
    }
    
    public static final class $pph_ancestor_phrase_or_self_p$BinaryFunction extends BinaryFunction
    {
        public $pph_ancestor_phrase_or_self_p$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-ANCESTOR-PHRASE-OR-SELF-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pph_phrase.pph_ancestor_phrase_or_self_p(arg1, arg2);
        }
    }
}

/*

	Total time: 2575 ms
	 synthetic 
*/