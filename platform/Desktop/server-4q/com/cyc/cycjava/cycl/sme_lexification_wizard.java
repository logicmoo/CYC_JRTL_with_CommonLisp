package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sme_lexification_wizard
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sme_lexification_wizard";
  public static final String myFingerPrint = "b4bc8929b1ccb81e4bf9c5ac2368e29cff8ab167f45685dd8848abbdbeb4c3b9";
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 9577L)
  private static SubLSymbol $sme_lexification_object_id_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 9857L)
  private static SubLSymbol $sme_lexwiz_initializedP$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 9985L)
  public static SubLSymbol $sme_forge_aheadP$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10108L)
  public static SubLSymbol $verify_beforehandP$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10238L)
  public static SubLSymbol $use_inferred_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10375L)
  private static SubLSymbol $use_blackboardP$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10625L)
  public static SubLSymbol $newline_tab$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10759L)
  private static SubLSymbol $sme_parts_of_speech$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10979L)
  private static SubLSymbol $next_sme_lexification_id$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 11130L)
  private static SubLSymbol $use_genformat_template$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 11266L)
  private static SubLSymbol $lexwiz_person_sub_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 11488L)
  private static SubLSymbol $known_name_titles$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 11598L)
  private static SubLSymbol $family_name_first_groups$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 11871L)
  private static SubLSymbol $lexwiz_abbreviation_check_min_words$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 12069L)
  private static SubLSymbol $sme_lexwiz_title$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 12570L)
  private static SubLSymbol $lexwiz_welcome_message$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 13201L)
  private static SubLSymbol $lexwiz_initialization_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 13442L)
  private static SubLSymbol $phrase_specification_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 14494L)
  private static SubLSymbol $proper_name_status_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 15204L)
  private static SubLSymbol $headword_selection_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 15741L)
  private static SubLSymbol $headword_guessing_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 16268L)
  private static SubLSymbol $sample_sentence_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 17497L)
  private static SubLSymbol $argument_part_of_speech_tip$;
  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLSymbol $dtp_sme_lexification_settings$;
  private static final SubLSymbol $sym0$_SME_LEXIFICATION_OBJECT_ID_HASH_;
  private static final SubLInteger $int1$25;
  private static final SubLSymbol $sym2$_SME_LEXWIZ_INITIALIZED__;
  private static final SubLString $str3$_a_a;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_NEXT_SME_LEXIFICATION_ID_;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$_KNOWN_NAME_TITLES_;
  private static final SubLList $list8;
  private static final SubLString $str9$Dictionary_Assistant;
  private static final SubLString $str10$Welcome_to_the_Subject_Matter_Exp;
  private static final SubLString $str11$The_initialization_may_take_sever;
  private static final SubLString $str12$Choose_a_phrase_that_clearly_dist;
  private static final SubLString $str13$Normally__capitalized_phrases_are;
  private static final SubLString $str14$examples____video_sports_game____;
  private static final SubLString $str15$The_headword_is_the_word_that_is_;
  private static final SubLString $str16$The_sentence_should_be_general_en;
  private static final SubLString $str17$The_choices_for_the_phrasal_part_;
  private static final SubLSymbol $sym18$SME_LEXIFICATION_SETTINGS;
  private static final SubLSymbol $sym19$SME_LEXIFICATION_SETTINGS_P;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym25$SME_LEXIFICATION_SETTINGS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$SME_LEXWIZ_IS_ABBREVIATION_;
  private static final SubLSymbol $sym28$_CSETF_SME_LEXWIZ_IS_ABBREVIATION_;
  private static final SubLSymbol $sym29$SME_LEXWIZ_NEW_MAPPING_;
  private static final SubLSymbol $sym30$_CSETF_SME_LEXWIZ_NEW_MAPPING_;
  private static final SubLSymbol $sym31$SME_LEXWIZ_OK_;
  private static final SubLSymbol $sym32$_CSETF_SME_LEXWIZ_OK_;
  private static final SubLSymbol $sym33$SME_LEXWIZ_SAMPLE_SENTENCE;
  private static final SubLSymbol $sym34$_CSETF_SME_LEXWIZ_SAMPLE_SENTENCE;
  private static final SubLSymbol $sym35$SME_LEXWIZ_SENTENCE_WORDS;
  private static final SubLSymbol $sym36$_CSETF_SME_LEXWIZ_SENTENCE_WORDS;
  private static final SubLSymbol $sym37$SME_LEXWIZ_SENTENCE_ARGS;
  private static final SubLSymbol $sym38$_CSETF_SME_LEXWIZ_SENTENCE_ARGS;
  private static final SubLSymbol $sym39$SME_LEXWIZ_ARG_OFFSETS;
  private static final SubLSymbol $sym40$_CSETF_SME_LEXWIZ_ARG_OFFSETS;
  private static final SubLSymbol $sym41$SME_LEXWIZ_CURRENT_ARG;
  private static final SubLSymbol $sym42$_CSETF_SME_LEXWIZ_CURRENT_ARG;
  private static final SubLSymbol $sym43$SME_LEXWIZ_ARG_SPEECH_PARTS;
  private static final SubLSymbol $sym44$_CSETF_SME_LEXWIZ_ARG_SPEECH_PARTS;
  private static final SubLSymbol $sym45$SME_LEXWIZ_PROPER_SUB_PREDICATES;
  private static final SubLSymbol $sym46$_CSETF_SME_LEXWIZ_PROPER_SUB_PREDICATES;
  private static final SubLSymbol $kw47$IS_ABBREVIATION_;
  private static final SubLSymbol $kw48$NEW_MAPPING_;
  private static final SubLSymbol $kw49$OK_;
  private static final SubLSymbol $kw50$SAMPLE_SENTENCE;
  private static final SubLSymbol $kw51$SENTENCE_WORDS;
  private static final SubLSymbol $kw52$SENTENCE_ARGS;
  private static final SubLSymbol $kw53$ARG_OFFSETS;
  private static final SubLSymbol $kw54$CURRENT_ARG;
  private static final SubLSymbol $kw55$ARG_SPEECH_PARTS;
  private static final SubLSymbol $kw56$PROPER_SUB_PREDICATES;
  private static final SubLString $str57$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw58$BEGIN;
  private static final SubLSymbol $sym59$MAKE_SME_LEXIFICATION_SETTINGS;
  private static final SubLSymbol $kw60$SLOT;
  private static final SubLSymbol $kw61$END;
  private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_SME_LEXIFICATION_SETTINGS_METHOD;
  private static final SubLSymbol $sym63$INTERFACE_PROXY;
  private static final SubLSymbol $sym64$OBJECT;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$INSTANCE_COUNT;
  private static final SubLSymbol $sym67$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_CLASS;
  private static final SubLSymbol $sym68$ISOLATED_P;
  private static final SubLSymbol $sym69$INSTANCE_NUMBER;
  private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_INSTANCE;
  private static final SubLSymbol $sym71$QUESTION_ANSWERING_AGENT;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$USER_DATA;
  private static final SubLSymbol $sym74$CLIENT_DATA;
  private static final SubLSymbol $sym75$CALLBACK_FUNCTION;
  private static final SubLSymbol $sym76$PROXY;
  private static final SubLSymbol $sym77$FIELD_LABELS;
  private static final SubLSymbol $sym78$FIELD_WIDTH;
  private static final SubLSymbol $sym79$ANSWER;
  private static final SubLSymbol $sym80$DEFAULT;
  private static final SubLSymbol $sym81$VALUES;
  private static final SubLSymbol $sym82$DESCRIPTIONS;
  private static final SubLSymbol $sym83$CHOICES;
  private static final SubLSymbol $sym84$ERROR_MESSAGE;
  private static final SubLSymbol $sym85$QUESTION_TYPE;
  private static final SubLSymbol $sym86$TIP;
  private static final SubLSymbol $sym87$QUESTION;
  private static final SubLSymbol $sym88$TITLE;
  private static final SubLSymbol $sym89$ID;
  private static final SubLSymbol $sym90$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_CLASS;
  private static final SubLSymbol $sym91$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_INSTANCE;
  private static final SubLSymbol $sym92$SME_LEXIFICATION_STATE;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$INTERLOCUTOR_AGENT;
  private static final SubLSymbol $sym95$LEXWIZ_SETTINGS;
  private static final SubLSymbol $sym96$LEXWIZ_PARAMETERS;
  private static final SubLSymbol $sym97$NEXT_STATES;
  private static final SubLSymbol $sym98$STATE;
  private static final SubLSymbol $sym99$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_CLASS;
  private static final SubLSymbol $sym100$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_INSTANCE;
  private static final SubLSymbol $sym101$SME_LEXIFICATION_INTERLOCUTOR;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$SME_STATE;
  private static final SubLSymbol $sym104$PREVIOUS_ID;
  private static final SubLSymbol $sym105$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_CLASS;
  private static final SubLSymbol $sym106$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_INSTANC;
  private static final SubLSymbol $sym107$SME_LI_PRE_GENERAL;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_CLASS;
  private static final SubLSymbol $sym110$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_INSTANCE;
  private static final SubLSymbol $sym111$SME_LI_PROPER_NAME;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_CLASS;
  private static final SubLSymbol $sym114$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_INSTANCE;
  private static final SubLSymbol $sym115$SME_LI_DENOTATIONAL;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_CLASS;
  private static final SubLSymbol $sym118$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_INSTANCE;
  private static final SubLSymbol $sym119$SME_LI_RELATIONAL;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_CLASS;
  private static final SubLSymbol $sym122$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_INSTANCE;
  private static final SubLSymbol $sym123$SME_LI_POST_GENERAL;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_CLASS;
  private static final SubLSymbol $sym126$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_INSTANCE;
  private static final SubLSymbol $sym127$SME_LEXIFICATION_WIZARD;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$QUESTION_ANSWERING_AGENT_CLASS;
  private static final SubLSymbol $sym130$NEW_CURRENT_INTERACTION;
  private static final SubLSymbol $sym131$CURRENT_INTERACTION;
  private static final SubLSymbol $sym132$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_CLASS;
  private static final SubLSymbol $sym133$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_INSTANCE;
  private static final SubLSymbol $sym134$INITIALIZE;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym138$QUESTION_ANSWERING_AGENT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym139$SET_QUESTION;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $kw143$BOOLEAN;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym146$QUESTION_ANSWERING_AGENT_SET_QUESTION_METHOD;
  private static final SubLSymbol $sym147$DISPLAY_QUESTION;
  private static final SubLList $list148;
  private static final SubLString $str149$Warning__;
  private static final SubLString $str150$question_answering_agent__display;
  private static final SubLSymbol $sym151$QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
  private static final SubLSymbol $sym152$GET_RESPONSE;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym155$QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD;
  private static final SubLSymbol $sym156$VALIDATE_RESPONSE;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLString $str159$answer__s__;
  private static final SubLString $str160$choices__s__;
  private static final SubLString $str161$values__s__;
  private static final SubLString $str162$pos__a__neg__a__;
  private static final SubLSymbol $kw163$ENUMERATED;
  private static final SubLSymbol $kw164$MULTIPLE_SELECTION;
  private static final SubLSymbol $kw165$FREE_FORM;
  private static final SubLSymbol $kw166$MULTIPLE_FREE_FORM;
  private static final SubLString $str167$Unknown_question_type___a__;
  private static final SubLString $str168$validated_answer__s__;
  private static final SubLSymbol $sym169$NOTIFY_CLIENT;
  private static final SubLSymbol $kw170$INPUT_VALIDATED;
  private static final SubLSymbol $sym171$QUESTION_ANSWERING_AGENT_VALIDATE_RESPONSE_METHOD;
  private static final SubLSymbol $sym172$SET_CALLBACK_FUNCTION;
  private static final SubLList $list173;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym176$QUESTION_ANSWERING_AGENT_SET_CALLBACK_FUNCTION_METHOD;
  private static final SubLSymbol $sym177$SET_CLIENT_DATA;
  private static final SubLList $list178;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym181$QUESTION_ANSWERING_AGENT_SET_CLIENT_DATA_METHOD;
  private static final SubLSymbol $sym182$SET_USER_DATA;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym186$QUESTION_ANSWERING_AGENT_SET_USER_DATA_METHOD;
  private static final SubLSymbol $sym187$SET_PROXY;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym191$QUESTION_ANSWERING_AGENT_SET_PROXY_METHOD;
  private static final SubLList $list192;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLString $str195$callback_function__a__client_data;
  private static final SubLSymbol $sym196$QUESTION_ANSWERING_AGENT_NOTIFY_CLIENT_METHOD;
  private static final SubLSymbol $sym197$POSITIVE_CHOICE;
  private static final SubLList $list198;
  private static final SubLSymbol $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym200$QUESTION_ANSWERING_AGENT_POSITIVE_CHOICE_METHOD;
  private static final SubLSymbol $sym201$NEGATIVE_CHOICE;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym204$QUESTION_ANSWERING_AGENT_NEGATIVE_CHOICE_METHOD;
  private static final SubLSymbol $sym205$COPY;
  private static final SubLList $list206;
  private static final SubLList $list207;
  private static final SubLSymbol $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym209$QUESTION_ANSWERING_AGENT_COPY_METHOD;
  private static final SubLSymbol $sym210$NEW_COPY;
  private static final SubLList $list211;
  private static final SubLSymbol $sym212$NEW;
  private static final SubLSymbol $sym213$QUESTION_ANSWERING_AGENT_NEW_COPY_METHOD;
  private static final SubLList $list214;
  private static final SubLSymbol $sym215$INTERFACE_PROXY_INITIALIZE_METHOD;
  private static final SubLSymbol $sym216$INIT_SESSION;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$INTERFACE_PROXY_INIT_SESSION_METHOD;
  private static final SubLSymbol $sym219$END_SESSION;
  private static final SubLList $list220;
  private static final SubLSymbol $sym221$INTERFACE_PROXY_END_SESSION_METHOD;
  private static final SubLSymbol $sym222$CREATE_CONSTANT;
  private static final SubLList $list223;
  private static final SubLList $list224;
  private static final SubLSymbol $sym225$INTERFACE_PROXY_CREATE_CONSTANT_METHOD;
  private static final SubLSymbol $sym226$DESCRIBE_TERM;
  private static final SubLList $list227;
  private static final SubLList $list228;
  private static final SubLSymbol $sym229$INTERFACE_PROXY_DESCRIBE_TERM_METHOD;
  private static final SubLSymbol $sym230$RESOLVE_TERM;
  private static final SubLList $list231;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$LEX_DESCRIBE_TERM;
  private static final SubLSymbol $sym234$LIST;
  private static final SubLSymbol $sym235$INTERFACE_PROXY_RESOLVE_TERM_METHOD;
  private static final SubLSymbol $sym236$MUMBLE;
  private static final SubLList $list237;
  private static final SubLList $list238;
  private static final SubLString $str239$__mumbling___a__;
  private static final SubLSymbol $sym240$INTERFACE_PROXY_MUMBLE_METHOD;
  private static final SubLSymbol $sym241$FORGE_AHEAD_;
  private static final SubLList $list242;
  private static final SubLSymbol $sym243$INTERFACE_PROXY_FORGE_AHEAD__METHOD;
  private static final SubLList $list244;
  private static final SubLSymbol $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym246$SME_LEXIFICATION_STATE_INITIALIZE_METHOD;
  private static final SubLList $list247;
  private static final SubLSymbol $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym249$SME_LEXIFICATION_STATE_COPY_METHOD;
  private static final SubLSymbol $sym250$GET_ID;
  private static final SubLList $list251;
  private static final SubLSymbol $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym253$SME_LEXIFICATION_STATE_GET_ID_METHOD;
  private static final SubLSymbol $sym254$SET_STATES;
  private static final SubLList $list255;
  private static final SubLList $list256;
  private static final SubLSymbol $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym258$SME_LEXIFICATION_STATE_SET_STATES_METHOD;
  private static final SubLSymbol $sym259$GET_STATES;
  private static final SubLList $list260;
  private static final SubLSymbol $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym262$SME_LEXIFICATION_STATE_GET_STATES_METHOD;
  private static final SubLSymbol $sym263$CURRENT_STATE;
  private static final SubLList $list264;
  private static final SubLSymbol $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym266$SME_LEXIFICATION_STATE_CURRENT_STATE_METHOD;
  private static final SubLSymbol $sym267$CURRENT_SETTINGS;
  private static final SubLList $list268;
  private static final SubLSymbol $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym270$SME_LEXIFICATION_STATE_CURRENT_SETTINGS_METHOD;
  private static final SubLSymbol $sym271$ADVANCE;
  private static final SubLList $list272;
  private static final SubLSymbol $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym274$SME_LEXIFICATION_STATE_ADVANCE_METHOD;
  private static final SubLList $list275;
  private static final SubLSymbol $sym276$SME_LEXIFICATION_STATE_NEW_COPY_METHOD;
  private static final SubLSymbol $sym277$LIST_VALUES;
  private static final SubLList $list278;
  private static final SubLSymbol $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLSymbol $sym280$SME_LEXIFICATION_STATE_LIST_VALUES_METHOD;
  private static final SubLSymbol $sym281$TRACE_VALUES;
  private static final SubLList $list282;
  private static final SubLList $list283;
  private static final SubLSymbol $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD;
  private static final SubLString $str285$_a_s__;
  private static final SubLString $str286$SME_lexification_state__;
  private static final SubLSymbol $sym287$SME_LEXIFICATION_STATE_TRACE_VALUES_METHOD;
  private static final SubLList $list288;
  private static final SubLList $list289;
  private static final SubLSymbol $sym290$SME_LEXIFICATION_INTERLOCUTOR_INITIALIZE_METHOD;
  private static final SubLSymbol $sym291$DONE_;
  private static final SubLList $list292;
  private static final SubLSymbol $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym294$SME_LEXIFICATION_INTERLOCUTOR_DONE__METHOD;
  private static final SubLSymbol $sym295$INITIATE_INTERACTION;
  private static final SubLList $list296;
  private static final SubLList $list297;
  private static final SubLString $str298$callback_fn__of_type__a____a__;
  private static final SubLString $str299$question_answering_agent_class__o;
  private static final SubLSymbol $sym300$NEXT_INTERACTION;
  private static final SubLSymbol $sym301$SME_LEXIFICATION_INTERLOCUTOR_INITIATE_INTERACTION_METHOD;
  private static final SubLSymbol $sym302$UPDATE_NOTIFICATION_INFO;
  private static final SubLList $list303;
  private static final SubLSymbol $sym304$PROCESS_STATUS_UPDATE;
  private static final SubLSymbol $sym305$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_NOTIFICATION_INFO_METHOD;
  private static final SubLList $list306;
  private static final SubLString $str307$sme_state__;
  private static final SubLString $str308$current_state___a__;
  private static final SubLString $str309$next_states___a__;
  private static final SubLString $str310$Unexpected_state___a__;
  private static final SubLSymbol $sym311$SME_LEXIFICATION_INTERLOCUTOR_NEXT_INTERACTION_METHOD;
  private static final SubLSymbol $sym312$END_INTERACTION;
  private static final SubLList $list313;
  private static final SubLSymbol $kw314$DONE;
  private static final SubLSymbol $sym315$SME_LEXIFICATION_INTERLOCUTOR_END_INTERACTION_METHOD;
  private static final SubLSymbol $sym316$RESET_STATE;
  private static final SubLList $list317;
  private static final SubLList $list318;
  private static final SubLString $str319$Resetting_SME_lexwiz_to_older_sta;
  private static final SubLString $str320$old_sme_state__;
  private static final SubLString $str321$sme_state__before___;
  private static final SubLString $str322$sme_state__after___;
  private static final SubLString $str323$done_with_state_reset__;
  private static final SubLString $str324$Unable_to_resolve_SME_lexificatio;
  private static final SubLSymbol $sym325$SME_LEXIFICATION_INTERLOCUTOR_RESET_STATE_METHOD;
  private static final SubLList $list326;
  private static final SubLList $list327;
  private static final SubLString $str328$sme_li_process_status_update_stat;
  private static final SubLSymbol $kw329$OUTPUT_DONE;
  private static final SubLSymbol $kw330$INPUT_READY;
  private static final SubLString $str331$id__a_previous_id__a_agent_id__a_;
  private static final SubLString $str332$Unexpected_status___a__;
  private static final SubLSymbol $sym333$SME_LEXIFICATION_INTERLOCUTOR_PROCESS_STATUS_UPDATE_METHOD;
  private static final SubLSymbol $sym334$ASK_GENERIC_BOOLEAN;
  private static final SubLList $list335;
  private static final SubLList $list336;
  private static final SubLSymbol $sym337$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_BOOLEAN_METHOD;
  private static final SubLSymbol $sym338$ASK_GENERIC_ENUMERATED;
  private static final SubLList $list339;
  private static final SubLList $list340;
  private static final SubLSymbol $sym341$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_ENUMERATED_METHOD;
  private static final SubLSymbol $sym342$ASK_GENERIC_MULTIPLE_SELECTION;
  private static final SubLList $list343;
  private static final SubLList $list344;
  private static final SubLSymbol $sym345$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_SELECTION_METH;
  private static final SubLSymbol $sym346$ASK_GENERIC_FREE_FORM;
  private static final SubLList $list347;
  private static final SubLList $list348;
  private static final SubLSymbol $sym349$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_FREE_FORM_METHOD;
  private static final SubLSymbol $sym350$ASK_GENERIC_MULTIPLE_FREE_FORM;
  private static final SubLList $list351;
  private static final SubLList $list352;
  private static final SubLSymbol $sym353$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_FREE_FORM_METH;
  private static final SubLList $list354;
  private static final SubLSymbol $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym356$SME_LEXIFICATION_INTERLOCUTOR_DISPLAY_QUESTION_METHOD;
  private static final SubLSymbol $sym357$GET_ANSWER;
  private static final SubLList $list358;
  private static final SubLSymbol $sym359$SME_LEXIFICATION_INTERLOCUTOR_GET_ANSWER_METHOD;
  private static final SubLSymbol $sym360$SET_ANSWER;
  private static final SubLList $list361;
  private static final SubLList $list362;
  private static final SubLSymbol $sym363$SME_LEXIFICATION_INTERLOCUTOR_SET_ANSWER_METHOD;
  private static final SubLSymbol $sym364$GET_INTERLOCUTOR_AGENT;
  private static final SubLList $list365;
  private static final SubLSymbol $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLString $str367$____assertion_failed___a______;
  private static final SubLSymbol $sym368$SME_LEXIFICATION_INTERLOCUTOR_GET_INTERLOCUTOR_AGENT_METHOD;
  private static final SubLSymbol $sym369$SET_INTERLOCUTOR_AGENT;
  private static final SubLList $list370;
  private static final SubLList $list371;
  private static final SubLSymbol $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym373$SME_LEXIFICATION_INTERLOCUTOR_SET_INTERLOCUTOR_AGENT_METHOD;
  private static final SubLSymbol $sym374$SET_DEFAULT;
  private static final SubLList $list375;
  private static final SubLList $list376;
  private static final SubLSymbol $sym377$SME_LEXIFICATION_INTERLOCUTOR_SET_DEFAULT_METHOD;
  private static final SubLSymbol $sym378$CHECK_GENERIC;
  private static final SubLList $list379;
  private static final SubLList $list380;
  private static final SubLString $str381$LEXWIZ__S;
  private static final SubLSymbol $sym382$CSETF;
  private static final SubLSymbol $sym383$SME_LEXIFICATION_INTERLOCUTOR_CHECK_GENERIC_METHOD;
  private static final SubLSymbol $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym385$SME_LEXIFICATION_INTERLOCUTOR_SET_CALLBACK_FUNCTION_METHOD;
  private static final SubLSymbol $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym387$SME_LEXIFICATION_INTERLOCUTOR_SET_PROXY_METHOD;
  private static final SubLList $list388;
  private static final SubLSymbol $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym390$SME_LEXIFICATION_INTERLOCUTOR_NOTIFY_CLIENT_METHOD;
  private static final SubLList $list391;
  private static final SubLSymbol $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym393$SME_LEXIFICATION_INTERLOCUTOR_MUMBLE_METHOD;
  private static final SubLList $list394;
  private static final SubLSymbol $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym396$SME_LEXIFICATION_INTERLOCUTOR_FORGE_AHEAD__METHOD;
  private static final SubLSymbol $sym397$PHRASE_DENOTATIONS;
  private static final SubLList $list398;
  private static final SubLList $list399;
  private static final SubLSymbol $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym401$SME_LEXIFICATION_INTERLOCUTOR_PHRASE_DENOTATIONS_METHOD;
  private static final SubLList $list402;
  private static final SubLSymbol $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD;
  private static final SubLSymbol $sym404$SME_LEXIFICATION_INTERLOCUTOR_DESCRIBE_TERM_METHOD;
  private static final SubLSymbol $sym405$UPDATE_LEXIFICATION_PARAMETERS;
  private static final SubLList $list406;
  private static final SubLSymbol $sym407$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_LEXIFICATION_PARAMETERS_METH;
  private static final SubLList $list408;
  private static final SubLList $list409;
  private static final SubLSymbol $sym410$SME_LI_PRE_GENERAL_INITIALIZE_METHOD;
  private static final SubLSymbol $sym411$DO_INITIALIZATION;
  private static final SubLList $list412;
  private static final SubLString $str413$Performing_dictionary_assistant_i;
  private static final SubLString $str414$_a_____a;
  private static final SubLString $str415$Press_OK_to_proceed_;
  private static final SubLSymbol $sym416$SME_LI_PRE_GENERAL_DO_INITIALIZATION_METHOD;
  private static final SubLSymbol $sym417$CHECK_INITIALIZATION;
  private static final SubLList $list418;
  private static final SubLSymbol $sym419$SME_LI_PRE_GENERAL_CHECK_INITIALIZATION_METHOD;
  private static final SubLSymbol $sym420$ASK_TERM;
  private static final SubLList $list421;
  private static final SubLSymbol $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str423$Determining_concept_to_be_lexifie;
  private static final SubLString $str424$Which_concept_s_lexical_informati;
  private static final SubLString $str425$This_is_usually_the_name_of_the_t;
  private static final SubLInteger $int426$60;
  private static final SubLSymbol $sym427$SME_LI_PRE_GENERAL_ASK_TERM_METHOD;
  private static final SubLSymbol $sym428$CHECK_TERM;
  private static final SubLList $list429;
  private static final SubLSymbol $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str431$A_valid_concept_must_be_specified;
  private static final SubLList $list432;
  private static final SubLSymbol $sym433$SME_LI_PRE_GENERAL_CHECK_TERM_METHOD;
  private static final SubLList $list434;
  private static final SubLSymbol $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLSymbol $sym436$SME_LI_PRE_GENERAL_RESOLVE_TERM_METHOD;
  private static final SubLSymbol $sym437$ASK_TERM_SELECTION;
  private static final SubLList $list438;
  private static final SubLSymbol $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str440$Unexpected_term_parameter___s__;
  private static final SubLString $str441$Clarifying_term_to_be_lexified;
  private static final SubLString $str442$Which_of_the_following_terms_do_y;
  private static final SubLSymbol $sym443$SECOND;
  private static final SubLSymbol $sym444$FIRST;
  private static final SubLSymbol $sym445$SME_LI_PRE_GENERAL_ASK_TERM_SELECTION_METHOD;
  private static final SubLSymbol $sym446$CHECK_TERM_SELECTION;
  private static final SubLList $list447;
  private static final SubLSymbol $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLList $list449;
  private static final SubLSymbol $sym450$SME_LI_PRE_GENERAL_CHECK_TERM_SELECTION_METHOD;
  private static final SubLSymbol $sym451$ASK_PHRASE;
  private static final SubLList $list452;
  private static final SubLSymbol $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str454$Checking_phrase_for_the_lexificat;
  private static final SubLString $str455$How_would_you_like_to_refer_to_th;
  private static final SubLString $str456$Assuming_you_don_t_want_to_use_th;
  private static final SubLString $str457$;
  private static final SubLSymbol $sym458$SME_LI_PRE_GENERAL_ASK_PHRASE_METHOD;
  private static final SubLSymbol $sym459$CHECK_PHRASE;
  private static final SubLList $list460;
  private static final SubLSymbol $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str462$A_valid_phrase_must_be_specified;
  private static final SubLList $list463;
  private static final SubLSymbol $sym464$SME_LI_PRE_GENERAL_CHECK_PHRASE_METHOD;
  private static final SubLSymbol $sym465$ASK_AMBIGUITY;
  private static final SubLList $list466;
  private static final SubLSymbol $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str468$Checking_phrase_ambiguity;
  private static final SubLString $str469$In_addition_to___a___phrase__s_al;
  private static final SubLSymbol $sym470$SME_LI_PRE_GENERAL_ASK_AMBIGUITY_METHOD;
  private static final SubLSymbol $sym471$CHECK_AMBIGUITY;
  private static final SubLList $list472;
  private static final SubLSymbol $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLList $list474;
  private static final SubLSymbol $sym475$SME_LI_PRE_GENERAL_CHECK_AMBIGUITY_METHOD;
  private static final SubLSymbol $sym476$ASK_PROPER_NAME_STATUS;
  private static final SubLList $list477;
  private static final SubLSymbol $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD;
  private static final SubLString $str479$Checking_whether_the_phrase_is_a_;
  private static final SubLString $str480$Is_the_phrase___a__a_name_;
  private static final SubLSymbol $sym481$UPPER_CASE_P;
  private static final SubLString $str482$is;
  private static final SubLString $str483$isn_t;
  private static final SubLString $str484$Assuming_phrase__s__a_a_proper_na;
  private static final SubLSymbol $sym485$SME_LI_PRE_GENERAL_ASK_PROPER_NAME_STATUS_METHOD;
  private static final SubLSymbol $sym486$CHECK_PROPER_NAME_STATUS;
  private static final SubLList $list487;
  private static final SubLSymbol $sym488$SME_LI_PRE_GENERAL_CHECK_PROPER_NAME_STATUS_METHOD;
  private static final SubLList $list489;
  private static final SubLList $list490;
  private static final SubLSymbol $sym491$SME_LI_PROPER_NAME_INITIALIZE_METHOD;
  private static final SubLSymbol $sym492$ASK_ABBREVIATION_STATUS;
  private static final SubLList $list493;
  private static final SubLSymbol $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLString $str495$Checking_abbreviation_predication;
  private static final SubLString $str496$Is__s_an_abbreviation_;
  private static final SubLString $str497$uppercase;
  private static final SubLString $str498$_;
  private static final SubLString $str499$ends_with_period;
  private static final SubLString $str500$Checking_whether__s_is_an_abbrevi;
  private static final SubLSymbol $sym501$SME_LI_PROPER_NAME_ASK_ABBREVIATION_STATUS_METHOD;
  private static final SubLSymbol $sym502$CHECK_ABBREVIATION_STATUS;
  private static final SubLList $list503;
  private static final SubLSymbol $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLSymbol $sym505$SME_LI_PROPER_NAME_CHECK_ABBREVIATION_STATUS_METHOD;
  private static final SubLSymbol $sym506$ASK_PREDICATE_TYPE;
  private static final SubLList $list507;
  private static final SubLSymbol $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLString $str509$abbreviation_types;
  private static final SubLString $str510$specialized_kinds_of_names;
  private static final SubLString $str511$Determining_proper_name_type;
  private static final SubLString $str512$If__s_is_one_of_the__a_of_names_l;
  private static final SubLString $str513$When_in_doubt__select_the_default;
  private static final SubLString $str514$No_specialized_proper_name_types_;
  private static final SubLSymbol $sym515$SME_LI_PROPER_NAME_ASK_PREDICATE_TYPE_METHOD;
  private static final SubLSymbol $sym516$CHECK_PREDICATE_TYPE;
  private static final SubLList $list517;
  private static final SubLSymbol $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLString $str519$n_a;
  private static final SubLSymbol $sym520$SME_LI_PROPER_NAME_CHECK_PREDICATE_TYPE_METHOD;
  private static final SubLSymbol $sym521$ASK_REFINED_PREDICATION;
  private static final SubLList $list522;
  private static final SubLSymbol $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLObject $const524$Person;
  private static final SubLString $str525$Checking_constituents_of_the_huma;
  private static final SubLString $str526$Checking_for_possible_abbreviatio;
  private static final SubLString $str527$For_the_name__s__please_complete_;
  private static final SubLString $str528$nameString;
  private static final SubLString $str529$for_a_person;
  private static final SubLString $str530$quite_long;
  private static final SubLString $str531$Since__s_is__a__checking_addition;
  private static final SubLSymbol $sym532$SME_LI_PROPER_NAME_ASK_REFINED_PREDICATION_METHOD;
  private static final SubLSymbol $sym533$CHECK_REFINED_PREDICATION;
  private static final SubLList $list534;
  private static final SubLSymbol $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD;
  private static final SubLSymbol $sym536$SME_LI_PROPER_NAME_CHECK_REFINED_PREDICATION_METHOD;
  private static final SubLSymbol $sym537$INFER_PROPER_NAME_SUB_PREDICATIONS;
  private static final SubLList $list538;
  private static final SubLList $list539;
  private static final SubLString $str540$_;
  private static final SubLString $str541$Assuming_family_name_given_first_;
  private static final SubLObject $const542$familyName;
  private static final SubLObject $const543$givenNames;
  private static final SubLObject $const544$middleName;
  private static final SubLObject $const545$titleOfPerson_String;
  private static final SubLObject $const546$nameSuffix;
  private static final SubLObject $const547$initialsString;
  private static final SubLString $str548$_first_letters_of_names__ex__FDR_;
  private static final SubLObject $const549$initialismString;
  private static final SubLString $str550$_first_letters__ex__UNHCR__NATO__;
  private static final SubLObject $const551$acronymString;
  private static final SubLString $str552$_prefixes__ex__RADAR___RAdio_Dete;
  private static final SubLObject $const553$abbreviationString_PN;
  private static final SubLString $str554$_short_form__ex__dict___parens_;
  private static final SubLString $str555$Unexpected_pred__s_in_infer_prope;
  private static final SubLSymbol $sym556$SME_LI_PROPER_NAME_INFER_PROPER_NAME_SUB_PREDICATIONS_METHOD;
  private static final SubLList $list557;
  private static final SubLList $list558;
  private static final SubLSymbol $sym559$SME_LI_DENOTATIONAL_INITIALIZE_METHOD;
  private static final SubLSymbol $sym560$GUESS_HEADWORD_POSITION;
  private static final SubLList $list561;
  private static final SubLSymbol $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLString $str563$Guessing_the_headword_of_the_phra;
  private static final SubLString $str564$Is__s_a_type_of__s_;
  private static final SubLSymbol $sym565$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const566$EverythingPSC;
  private static final SubLString $str567$Since__s_is_a_type_of__s__assumin;
  private static final SubLSymbol $sym568$SME_LI_DENOTATIONAL_GUESS_HEADWORD_POSITION_METHOD;
  private static final SubLSymbol $sym569$CHECK_GUESSED_HEADWORD_POSITION;
  private static final SubLList $list570;
  private static final SubLSymbol $sym571$SME_LI_DENOTATIONAL_CHECK_GUESSED_HEADWORD_POSITION_METHOD;
  private static final SubLSymbol $sym572$ASK_HEADWORD_POSITION;
  private static final SubLList $list573;
  private static final SubLSymbol $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLString $str575$Checking_the_qualified_word_of_th;
  private static final SubLString $str576$In__s__which_word_is_being_qualif;
  private static final SubLSymbol $sym577$TO_STRING;
  private static final SubLSymbol $sym578$SME_LI_DENOTATIONAL_ASK_HEADWORD_POSITION_METHOD;
  private static final SubLSymbol $sym579$CHECK_HEADWORD_POSITION;
  private static final SubLList $list580;
  private static final SubLString $str581$invalid_headword_offset___a__;
  private static final SubLString $str582$The_headword_position_must_be_spe;
  private static final SubLList $list583;
  private static final SubLSymbol $sym584$SME_LI_DENOTATIONAL_CHECK_HEADWORD_POSITION_METHOD;
  private static final SubLSymbol $sym585$ASK_PART_OF_SPEECH;
  private static final SubLList $list586;
  private static final SubLSymbol $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLString $str588$Determining_how_the_word___a__is_;
  private static final SubLString $str589$Checking_usage_of___a_;
  private static final SubLString $str590$Pre_selecting__a_as_part_of_speec;
  private static final SubLString $str591$Which_of_the_following_sounds_bes;
  private static final SubLSymbol $sym592$SME_LI_DENOTATIONAL_ASK_PART_OF_SPEECH_METHOD;
  private static final SubLSymbol $sym593$CHECK_PART_OF_SPEECH;
  private static final SubLList $list594;
  private static final SubLSymbol $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLString $str596$invalid_headword_part_of_speech__;
  private static final SubLString $str597$The_headword_part_of_speech_must_;
  private static final SubLList $list598;
  private static final SubLSymbol $sym599$SME_LI_DENOTATIONAL_CHECK_PART_OF_SPEECH_METHOD;
  private static final SubLSymbol $sym600$SHOW_HEADWORD_VARIATIONS;
  private static final SubLList $list601;
  private static final SubLSymbol $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLString $str603$Checking_variant_phrases_due_to_v;
  private static final SubLString $str604$Are_the_following_good_ways_to_re;
  private static final SubLString $str605$The_main_thing_to_check_for_is_od;
  private static final SubLString $str606$There_are_no_variations_for_the_p;
  private static final SubLString $str607$Assuming_that_the_following_varia;
  private static final SubLSymbol $sym608$SME_LI_DENOTATIONAL_SHOW_HEADWORD_VARIATIONS_METHOD;
  private static final SubLSymbol $sym609$CHECK_HEADWORD_VARIATIONS;
  private static final SubLList $list610;
  private static final SubLList $list611;
  private static final SubLSymbol $sym612$SME_LI_DENOTATIONAL_CHECK_HEADWORD_VARIATIONS_METHOD;
  private static final SubLSymbol $sym613$ADD_LEXICAL_MAPPING;
  private static final SubLList $list614;
  private static final SubLList $list615;
  private static final SubLObject $const616$EnglishMt;
  private static final SubLObject $const617$EnglishWord;
  private static final SubLSymbol $sym618$SME_LI_DENOTATIONAL_ADD_LEXICAL_MAPPING_METHOD;
  private static final SubLSymbol $sym619$REMOVE_LEXICAL_MAPPING;
  private static final SubLList $list620;
  private static final SubLSymbol $sym621$SME_LI_DENOTATIONAL_REMOVE_LEXICAL_MAPPING_METHOD;
  private static final SubLSymbol $sym622$DO_LEXICAL_MAPPING;
  private static final SubLList $list623;
  private static final SubLList $list624;
  private static final SubLSymbol $sym625$SME_LI_DENOTATIONAL_DO_LEXICAL_MAPPING_METHOD;
  private static final SubLSymbol $sym626$DERIVE_PART_OF_SPEECH_EXAMPLES;
  private static final SubLList $list627;
  private static final SubLList $list628;
  private static final SubLSymbol $sym629$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLES_METHOD;
  private static final SubLSymbol $sym630$DERIVE_PART_OF_SPEECH_EXAMPLE;
  private static final SubLList $list631;
  private static final SubLList $list632;
  private static final SubLObject $const633$Thing;
  private static final SubLSymbol $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD;
  private static final SubLObject $const635$Verb;
  private static final SubLObject $const636$DeVerbalNoun;
  private static final SubLString $str637$a;
  private static final SubLObject $const638$CountNoun;
  private static final SubLString $str639$many__a___a__a__countable_noun_li;
  private static final SubLObject $const640$MassNoun;
  private static final SubLString $str641$much__a__some__a__uncountable_nou;
  private static final SubLObject $const642$AgentiveNoun;
  private static final SubLString $str643$_a__a_is_able_to__a__agentive_nou;
  private static final SubLObject $const644$GerundiveNoun;
  private static final SubLString $str645$_a_involves_ability_to__a__gerund;
  private static final SubLObject $const646$ProperCountNoun;
  private static final SubLString $str647$proper_name_for_countable_objects;
  private static final SubLObject $const648$ProperMassNoun;
  private static final SubLString $str649$proper_name_for_substance_like_ob;
  private static final SubLString $str650$to__a___a_unexpectedly__verb_like;
  private static final SubLObject $const651$Adjective;
  private static final SubLString $str652$very__a__most__a__adjective_like_;
  private static final SubLObject $const653$Adverb;
  private static final SubLString $str654$so__a__as__a_as______adverb_like_;
  private static final SubLString $str655$Unable_to_derive_example_for_part;
  private static final SubLSymbol $sym656$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLE_METHOD;
  private static final SubLObject $const657$infinitive;
  private static final SubLSymbol $sym658$DISABLE_SPEECH_PART_SELECTION;
  private static final SubLList $list659;
  private static final SubLList $list660;
  private static final SubLString $str661$adjectival_suffix;
  private static final SubLString $str662$Enabling_adjective_for__s_since__;
  private static final SubLString $str663$Disabling_simple_noun_for__s_sinc;
  private static final SubLList $list664;
  private static final SubLString $str665$Enabling_verb_for__s_since_it_is_;
  private static final SubLObject $const666$Event;
  private static final SubLString $str667$Enabling_verb_for__s_since___a__i;
  private static final SubLString $str668$Unexpected_part_of_speech__during;
  private static final SubLSymbol $sym669$SME_LI_DENOTATIONAL_DISABLE_SPEECH_PART_SELECTION_METHOD;
  private static final SubLSymbol $sym670$SME_LI_RELATIONAL_INITIALIZE_METHOD;
  private static final SubLList $list671;
  private static final SubLList $list672;
  private static final SubLList $list673;
  private static final SubLList $list674;
  private static final SubLList $list675;
  private static final SubLString $str676$initial_state_sequence__s__;
  private static final SubLString $str677$sme_li_relational_next_states___a;
  private static final SubLSymbol $sym678$SME_LI_RELATIONAL_INITIATE_INTERACTION_METHOD;
  private static final SubLSymbol $sym679$ASK_SAMPLE_SENTENCE;
  private static final SubLList $list680;
  private static final SubLSymbol $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLString $str682$Determining_relation_template;
  private static final SubLString $str683$phrase;
  private static final SubLString $str684$sentence;
  private static final SubLString $str685$Enter_a__a_illustrating_the___a__;
  private static final SubLSymbol $sym686$SME_LI_RELATIONAL_ASK_SAMPLE_SENTENCE_METHOD;
  private static final SubLSymbol $sym687$CHECK_SAMPLE_SENTENCE;
  private static final SubLList $list688;
  private static final SubLSymbol $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLSymbol $sym690$SME_LI_RELATIONAL_CHECK_SAMPLE_SENTENCE_METHOD;
  private static final SubLSymbol $sym691$ASK_ARGUMENT_VALUES;
  private static final SubLList $list692;
  private static final SubLSymbol $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLString $str694$Determining_relational_arguments;
  private static final SubLString $str695$Select_phrase_for_argument__a___a;
  private static final SubLSymbol $sym696$SME_LI_RELATIONAL_ASK_ARGUMENT_VALUES_METHOD;
  private static final SubLSymbol $sym697$CHECK_ARGUMENT_VALUES;
  private static final SubLList $list698;
  private static final SubLSymbol $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLSymbol $sym700$EXTRACT_INTEGER;
  private static final SubLSymbol $sym701$SME_LI_RELATIONAL_CHECK_ARGUMENT_VALUES_METHOD;
  private static final SubLSymbol $sym702$ASK_ARGUMENT_PART_OF_SPEECH;
  private static final SubLList $list703;
  private static final SubLSymbol $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLSymbol $sym705$STRING_FOR_FORT;
  private static final SubLString $str706$Determining_part_of_speech_for_ar;
  private static final SubLString $str707$Select_part_of_speech_for__s;
  private static final SubLSymbol $sym708$SME_LI_RELATIONAL_ASK_ARGUMENT_PART_OF_SPEECH_METHOD;
  private static final SubLSymbol $sym709$CHECK_ARGUMENT_PART_OF_SPEECH;
  private static final SubLList $list710;
  private static final SubLSymbol $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLObject $const712$Noun;
  private static final SubLSymbol $sym713$SME_LI_RELATIONAL_CHECK_ARGUMENT_PART_OF_SPEECH_METHOD;
  private static final SubLSymbol $sym714$DERIVE_RELATIONAL_TEMPLATES;
  private static final SubLList $list715;
  private static final SubLSymbol $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD;
  private static final SubLString $str717$_S;
  private static final SubLSymbol $sym718$SME_LI_RELATIONAL_DERIVE_RELATIONAL_TEMPLATES_METHOD;
  private static final SubLList $list719;
  private static final SubLList $list720;
  private static final SubLSymbol $sym721$SME_LI_POST_GENERAL_INITIALIZE_METHOD;
  private static final SubLSymbol $sym722$ASK_PREFERRED_LEXIFICATION_STATUS;
  private static final SubLList $list723;
  private static final SubLSymbol $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD;
  private static final SubLString $str725$Checking_status_of_preferred_refe;
  private static final SubLString $str726$Is___a__the_most_common_way_of_re;
  private static final SubLSymbol $sym727$STRINGP;
  private static final SubLString $str728$Other_ways_of_referring_to__a_are;
  private static final SubLSymbol $sym729$SME_LI_POST_GENERAL_ASK_PREFERRED_LEXIFICATION_STATUS_METHOD;
  private static final SubLSymbol $sym730$CHECK_PREFERRED_LEXIFICATION_STATUS;
  private static final SubLList $list731;
  private static final SubLSymbol $sym732$SME_LI_POST_GENERAL_CHECK_PREFERRED_LEXIFICATION_STATUS_METHOD;
  private static final SubLSymbol $sym733$DO_LEXIFICATION;
  private static final SubLList $list734;
  private static final SubLSymbol $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD;
  private static final SubLString $str736$Checking_results_of_lexification;
  private static final SubLString $str737$Problem_processing_the_lexificati;
  private static final SubLString $str738$Lexification_complete_;
  private static final SubLString $str739$_a____Press_OK_to_proceed;
  private static final SubLString $str740$This_type_of_error_shouldn_t_occu;
  private static final SubLSymbol $sym741$SME_LI_POST_GENERAL_DO_LEXIFICATION_METHOD;
  private static final SubLSymbol $sym742$CHECK_LEXIFICATION;
  private static final SubLList $list743;
  private static final SubLSymbol $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD;
  private static final SubLString $str745$Done_mapping_phrase__s_into_conce;
  private static final SubLSymbol $sym746$SME_LI_POST_GENERAL_CHECK_LEXIFICATION_METHOD;
  private static final SubLList $list747;
  private static final SubLSymbol $kw748$GET_PRE_GENERAL;
  private static final SubLList $list749;
  private static final SubLSymbol $sym750$RKF_BB_PROXY;
  private static final SubLSymbol $sym751$HTML_QUESTION_ANSWERING_AGENT;
  private static final SubLSymbol $sym752$SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD;
  private static final SubLList $list753;
  private static final SubLSymbol $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym755$SME_LEXIFICATION_WIZARD_COPY_METHOD;
  private static final SubLList $list756;
  private static final SubLSymbol $sym757$SME_LEXIFICATION_WIZARD_NEW_COPY_METHOD;
  private static final SubLSymbol $sym758$SET_TERM;
  private static final SubLList $list759;
  private static final SubLList $list760;
  private static final SubLSymbol $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym762$SME_LEXIFICATION_WIZARD_SET_TERM_METHOD;
  private static final SubLSymbol $sym763$GET_TERM;
  private static final SubLList $list764;
  private static final SubLSymbol $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym766$SME_LEXIFICATION_WIZARD_GET_TERM_METHOD;
  private static final SubLSymbol $sym767$SET_PHRASE;
  private static final SubLList $list768;
  private static final SubLList $list769;
  private static final SubLSymbol $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym771$SME_LEXIFICATION_WIZARD_SET_PHRASE_METHOD;
  private static final SubLSymbol $sym772$GET_PHRASE;
  private static final SubLList $list773;
  private static final SubLSymbol $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym775$SME_LEXIFICATION_WIZARD_GET_PHRASE_METHOD;
  private static final SubLSymbol $sym776$SET_MT;
  private static final SubLList $list777;
  private static final SubLList $list778;
  private static final SubLSymbol $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym780$SME_LEXIFICATION_WIZARD_SET_MT_METHOD;
  private static final SubLSymbol $sym781$GET_MT;
  private static final SubLList $list782;
  private static final SubLSymbol $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym784$SME_LEXIFICATION_WIZARD_GET_MT_METHOD;
  private static final SubLSymbol $sym785$SET_LEXICAL_MT;
  private static final SubLList $list786;
  private static final SubLSymbol $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym788$SME_LEXIFICATION_WIZARD_SET_LEXICAL_MT_METHOD;
  private static final SubLSymbol $sym789$SET_PARSING_MT;
  private static final SubLList $list790;
  private static final SubLSymbol $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym792$SME_LEXIFICATION_WIZARD_SET_PARSING_MT_METHOD;
  private static final SubLSymbol $sym793$SET_GENERATION_MT;
  private static final SubLList $list794;
  private static final SubLSymbol $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD;
  private static final SubLSymbol $sym796$SME_LEXIFICATION_WIZARD_SET_GENERATION_MT_METHOD;
  private static final SubLSymbol $sym797$LEXIFY;
  private static final SubLList $list798;
  private static final SubLList $list799;
  private static final SubLSymbol $sym800$SME_LEXIFICATION_WIZARD_LEXIFY_METHOD;
  private static final SubLSymbol $sym801$LEXIFY_FIRST_TERMSTRING;
  private static final SubLList $list802;
  private static final SubLList $list803;
  private static final SubLSymbol $sym804$SME_LEXIFICATION_WIZARD_LEXIFY_FIRST_TERMSTRING_METHOD;
  private static final SubLSymbol $sym805$CONTINUE_LEXIFY;
  private static final SubLList $list806;
  private static final SubLSymbol $kw807$GET_SPECIFIC;
  private static final SubLSymbol $kw808$NEED_INPUT;
  private static final SubLSymbol $kw809$GET_POST_GENERAL;
  private static final SubLString $str810$Unexpected_state_keyword___a__;
  private static final SubLSymbol $sym811$SME_LEXIFICATION_WIZARD_CONTINUE_LEXIFY_METHOD;
  private static final SubLList $list812;
  private static final SubLList $list813;
  private static final SubLString $str814$sme_lexwiz_process_status_update_;
  private static final SubLList $list815;
  private static final SubLString $str816$current_interaction___s__;
  private static final SubLSymbol $sym817$SME_LEXIFICATION_WIZARD_PROCESS_STATUS_UPDATE_METHOD;
  private static final SubLList $list818;
  private static final SubLSymbol $sym819$SME_LEXIFICATION_WIZARD_UPDATE_LEXIFICATION_PARAMETERS_METHOD;
  private static final SubLSymbol $sym820$POS_OF_STRING;
  private static final SubLSymbol $sym821$APPEND;
  private static final SubLList $list822;
  private static final SubLSymbol $kw823$DET;
  private static final SubLList $list824;
  private static final SubLString $str825$SME_Lexification_settings____S__;
  private static final SubLString $str826$A_normal__a;
  private static final SubLString $str827$abbreviation;
  private static final SubLString $str828$name;
  private static final SubLList $list829;
  private static final SubLList $list830;
  private static final SubLString $str831$_a___a;
  private static final SubLString $str832$__;
  private static final SubLSymbol $sym833$STRING_;
  private static final SubLString $str834$non_null_headword_position_and_pa;
  private static final SubLString $str835$Invalid_headword_position__a_for_;
  private static final SubLString $str836$__title;
  private static final SubLObject $const837$Title;
  private static final SubLObject $const838$SalutationMapping;
  private static final SubLObject $const839$codeMapping;
  private static final SubLSymbol $sym840$LEX_FORT_FOR_STRING;
  private static final SubLSymbol $sym841$CLOSED_LEXICAL_CLASS_STRING_;

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 10485L)
  public static SubLObject sme_lexwiz_use_blackboardP()
  {
    return list_utilities.sublisp_boolean( $use_blackboardP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 12503L)
  public static SubLObject sme_lexwiz_title()
  {
    return $sme_lexwiz_title$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 14411L)
  public static SubLObject phrase_specification_tip()
  {
    return $phrase_specification_tip$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 18210L)
  public static SubLObject lex_describe_instance(final SubLObject level, final SubLObject v_object)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexification_settings_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexification_settings_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sme_lexification_settings_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_is_abbreviationP(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_new_mappingP(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_okP(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_sample_sentence(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_sentence_words(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_sentence_args(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_arg_offsets(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_current_arg(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_arg_speech_parts(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject sme_lexwiz_proper_sub_predicates(final SubLObject v_object)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_is_abbreviationP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_new_mappingP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_okP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_sample_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_sentence_words(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_sentence_args(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_arg_offsets(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_current_arg(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_arg_speech_parts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject _csetf_sme_lexwiz_proper_sub_predicates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sme_lexification_settings_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject make_sme_lexification_settings(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sme_lexification_settings_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw47$IS_ABBREVIATION_ ) )
      {
        _csetf_sme_lexwiz_is_abbreviationP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$NEW_MAPPING_ ) )
      {
        _csetf_sme_lexwiz_new_mappingP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$OK_ ) )
      {
        _csetf_sme_lexwiz_okP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SAMPLE_SENTENCE ) )
      {
        _csetf_sme_lexwiz_sample_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$SENTENCE_WORDS ) )
      {
        _csetf_sme_lexwiz_sentence_words( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$SENTENCE_ARGS ) )
      {
        _csetf_sme_lexwiz_sentence_args( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$ARG_OFFSETS ) )
      {
        _csetf_sme_lexwiz_arg_offsets( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$CURRENT_ARG ) )
      {
        _csetf_sme_lexwiz_current_arg( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$ARG_SPEECH_PARTS ) )
      {
        _csetf_sme_lexwiz_arg_speech_parts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$PROPER_SUB_PREDICATES ) )
      {
        _csetf_sme_lexwiz_proper_sub_predicates( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject visit_defstruct_sme_lexification_settings(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym59$MAKE_SME_LEXIFICATION_SETTINGS, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw47$IS_ABBREVIATION_, sme_lexwiz_is_abbreviationP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw48$NEW_MAPPING_, sme_lexwiz_new_mappingP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw49$OK_, sme_lexwiz_okP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw50$SAMPLE_SENTENCE, sme_lexwiz_sample_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw51$SENTENCE_WORDS, sme_lexwiz_sentence_words( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw52$SENTENCE_ARGS, sme_lexwiz_sentence_args( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw53$ARG_OFFSETS, sme_lexwiz_arg_offsets( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw54$CURRENT_ARG, sme_lexwiz_current_arg( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw55$ARG_SPEECH_PARTS, sme_lexwiz_arg_speech_parts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw56$PROPER_SUB_PREDICATES, sme_lexwiz_proper_sub_predicates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym59$MAKE_SME_LEXIFICATION_SETTINGS, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 19359L)
  public static SubLObject visit_defstruct_object_sme_lexification_settings_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sme_lexification_settings( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 20603L)
  public static SubLObject subloop_reserved_initialize_interface_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 20603L)
  public static SubLObject subloop_reserved_initialize_interface_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 20603L)
  public static SubLObject interface_proxy_p(final SubLObject interface_proxy)
  {
    return classes.subloop_instanceof_class( interface_proxy, $sym63$INTERFACE_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_user_data(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, SEVENTEEN_INTEGER, $sym73$USER_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_user_data(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, SEVENTEEN_INTEGER, $sym73$USER_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_client_data(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, SIXTEEN_INTEGER, $sym74$CLIENT_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_client_data(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, SIXTEEN_INTEGER, $sym74$CLIENT_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_callback_function(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, FIFTEEN_INTEGER, $sym75$CALLBACK_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_callback_function(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, FIFTEEN_INTEGER, $sym75$CALLBACK_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_proxy(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, FOURTEEN_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_proxy(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, FOURTEEN_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_field_labels(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, THIRTEEN_INTEGER, $sym77$FIELD_LABELS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_field_labels(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, THIRTEEN_INTEGER, $sym77$FIELD_LABELS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_field_width(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, TWELVE_INTEGER, $sym78$FIELD_WIDTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_field_width(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, TWELVE_INTEGER, $sym78$FIELD_WIDTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_answer(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, ELEVEN_INTEGER, $sym79$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_answer(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, ELEVEN_INTEGER, $sym79$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_default(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, TEN_INTEGER, $sym80$DEFAULT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_default(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, TEN_INTEGER, $sym80$DEFAULT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_values(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, NINE_INTEGER, $sym81$VALUES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_values(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, NINE_INTEGER, $sym81$VALUES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_descriptions(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, EIGHT_INTEGER, $sym82$DESCRIPTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_descriptions(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, EIGHT_INTEGER, $sym82$DESCRIPTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_choices(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, SEVEN_INTEGER, $sym83$CHOICES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_choices(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, SEVEN_INTEGER, $sym83$CHOICES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_error_message(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, SIX_INTEGER, $sym84$ERROR_MESSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_error_message(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, SIX_INTEGER, $sym84$ERROR_MESSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_question_type(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, FIVE_INTEGER, $sym85$QUESTION_TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_question_type(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, FIVE_INTEGER, $sym85$QUESTION_TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_tip(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, FOUR_INTEGER, $sym86$TIP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_tip(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, FOUR_INTEGER, $sym86$TIP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_question(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, THREE_INTEGER, $sym87$QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_question(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, THREE_INTEGER, $sym87$QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_title(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, TWO_INTEGER, $sym88$TITLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_title(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, TWO_INTEGER, $sym88$TITLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject get_question_answering_agent_id(final SubLObject question_answering_agent)
  {
    return classes.subloop_get_access_protected_instance_slot( question_answering_agent, ONE_INTEGER, $sym89$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject set_question_answering_agent_id(final SubLObject question_answering_agent, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( question_answering_agent, value, ONE_INTEGER, $sym89$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject subloop_reserved_initialize_question_answering_agent_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject subloop_reserved_initialize_question_answering_agent_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym89$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym88$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym87$QUESTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym86$TIP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym85$QUESTION_TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym84$ERROR_MESSAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym83$CHOICES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym82$DESCRIPTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym81$VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym80$DEFAULT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym79$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym78$FIELD_WIDTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym77$FIELD_LABELS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym71$QUESTION_ANSWERING_AGENT, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 21456L)
  public static SubLObject question_answering_agent_p(final SubLObject question_answering_agent)
  {
    return classes.subloop_instanceof_class( question_answering_agent, $sym71$QUESTION_ANSWERING_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_interlocutor_agent(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, SIX_INTEGER, $sym94$INTERLOCUTOR_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_interlocutor_agent(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, SIX_INTEGER, $sym94$INTERLOCUTOR_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_lexwiz_settings(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, FIVE_INTEGER, $sym95$LEXWIZ_SETTINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_lexwiz_settings(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, FIVE_INTEGER, $sym95$LEXWIZ_SETTINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_lexwiz_parameters(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, FOUR_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_lexwiz_parameters(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, FOUR_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_next_states(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, THREE_INTEGER, $sym97$NEXT_STATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_next_states(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, THREE_INTEGER, $sym97$NEXT_STATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_state(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, TWO_INTEGER, $sym98$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_state(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, TWO_INTEGER, $sym98$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject get_sme_lexification_state_id(final SubLObject sme_lexification_state)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_state, ONE_INTEGER, $sym89$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject set_sme_lexification_state_id(final SubLObject sme_lexification_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_state, value, ONE_INTEGER, $sym89$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_state_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_state_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym89$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym98$STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym97$NEXT_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$SME_LEXIFICATION_STATE, $sym94$INTERLOCUTOR_AGENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 24501L)
  public static SubLObject sme_lexification_state_p(final SubLObject sme_lexification_state)
  {
    return classes.subloop_instanceof_class( sme_lexification_state, $sym92$SME_LEXIFICATION_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_user_data(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, EIGHT_INTEGER, $sym73$USER_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_user_data(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, EIGHT_INTEGER, $sym73$USER_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_client_data(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, SEVEN_INTEGER, $sym74$CLIENT_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_client_data(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, SEVEN_INTEGER, $sym74$CLIENT_DATA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_callback_function(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, SIX_INTEGER, $sym75$CALLBACK_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_callback_function(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, SIX_INTEGER, $sym75$CALLBACK_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_proxy(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, FIVE_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_proxy(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, FIVE_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_sme_state(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, FOUR_INTEGER, $sym103$SME_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_sme_state(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, FOUR_INTEGER, $sym103$SME_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_lexwiz_settings(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, THREE_INTEGER, $sym95$LEXWIZ_SETTINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_lexwiz_settings(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, THREE_INTEGER, $sym95$LEXWIZ_SETTINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_lexwiz_parameters(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, TWO_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_lexwiz_parameters(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, TWO_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject get_sme_lexification_interlocutor_previous_id(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_get_access_protected_instance_slot( sme_lexification_interlocutor, ONE_INTEGER, $sym104$PREVIOUS_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject set_sme_lexification_interlocutor_previous_id(final SubLObject sme_lexification_interlocutor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sme_lexification_interlocutor, value, ONE_INTEGER, $sym104$PREVIOUS_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_interlocutor_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_interlocutor_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 26626L)
  public static SubLObject sme_lexification_interlocutor_p(final SubLObject sme_lexification_interlocutor)
  {
    return classes.subloop_instanceof_class( sme_lexification_interlocutor, $sym101$SME_LEXIFICATION_INTERLOCUTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 30255L)
  public static SubLObject subloop_reserved_initialize_sme_li_pre_general_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 30255L)
  public static SubLObject subloop_reserved_initialize_sme_li_pre_general_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 30255L)
  public static SubLObject sme_li_pre_general_p(final SubLObject sme_li_pre_general)
  {
    return classes.subloop_instanceof_class( sme_li_pre_general, $sym107$SME_LI_PRE_GENERAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31122L)
  public static SubLObject subloop_reserved_initialize_sme_li_proper_name_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31122L)
  public static SubLObject subloop_reserved_initialize_sme_li_proper_name_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31122L)
  public static SubLObject sme_li_proper_name_p(final SubLObject sme_li_proper_name)
  {
    return classes.subloop_instanceof_class( sme_li_proper_name, $sym111$SME_LI_PROPER_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31758L)
  public static SubLObject subloop_reserved_initialize_sme_li_denotational_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31758L)
  public static SubLObject subloop_reserved_initialize_sme_li_denotational_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 31758L)
  public static SubLObject sme_li_denotational_p(final SubLObject sme_li_denotational)
  {
    return classes.subloop_instanceof_class( sme_li_denotational, $sym115$SME_LI_DENOTATIONAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33062L)
  public static SubLObject subloop_reserved_initialize_sme_li_relational_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33062L)
  public static SubLObject subloop_reserved_initialize_sme_li_relational_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33062L)
  public static SubLObject sme_li_relational_p(final SubLObject sme_li_relational)
  {
    return classes.subloop_instanceof_class( sme_li_relational, $sym119$SME_LI_RELATIONAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33654L)
  public static SubLObject subloop_reserved_initialize_sme_li_post_general_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33654L)
  public static SubLObject subloop_reserved_initialize_sme_li_post_general_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym104$PREVIOUS_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym95$LEXWIZ_SETTINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym103$SME_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym75$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym74$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym73$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 33654L)
  public static SubLObject sme_li_post_general_p(final SubLObject sme_li_post_general)
  {
    return classes.subloop_instanceof_class( sme_li_post_general, $sym123$SME_LI_POST_GENERAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_question_answering_agent_class(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, SEVEN_INTEGER, $sym129$QUESTION_ANSWERING_AGENT_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_question_answering_agent_class(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, SEVEN_INTEGER, $sym129$QUESTION_ANSWERING_AGENT_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_proxy(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, SIX_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_proxy(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, SIX_INTEGER, $sym76$PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_new_current_interaction(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, FIVE_INTEGER, $sym130$NEW_CURRENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_new_current_interaction(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, FIVE_INTEGER, $sym130$NEW_CURRENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_current_interaction(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, FOUR_INTEGER, $sym131$CURRENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_current_interaction(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, FOUR_INTEGER, $sym131$CURRENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_lexwiz_parameters(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, THREE_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_lexwiz_parameters(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, THREE_INTEGER, $sym96$LEXWIZ_PARAMETERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_next_states(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, TWO_INTEGER, $sym97$NEXT_STATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_next_states(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, TWO_INTEGER, $sym97$NEXT_STATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject get_sme_lexification_wizard_state(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_get_access_protected_instance_slot( v_sme_lexification_wizard, ONE_INTEGER, $sym98$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject set_sme_lexification_wizard_state(final SubLObject v_sme_lexification_wizard, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_sme_lexification_wizard, value, ONE_INTEGER, $sym98$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_wizard_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym66$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject subloop_reserved_initialize_sme_lexification_wizard_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym68$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym64$OBJECT, $sym69$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym98$STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym97$NEXT_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym96$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym131$CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym130$NEW_CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym76$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym127$SME_LEXIFICATION_WIZARD, $sym129$QUESTION_ANSWERING_AGENT_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 34233L)
  public static SubLObject sme_lexification_wizard_p(final SubLObject v_sme_lexification_wizard)
  {
    return classes.subloop_instanceof_class( v_sme_lexification_wizard, $sym127$SME_LEXIFICATION_WIZARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 35965L)
  public static SubLObject question_answering_agent_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject user_data = get_question_answering_agent_user_data( self );
    SubLObject client_data = get_question_answering_agent_client_data( self );
    SubLObject callback_function = get_question_answering_agent_callback_function( self );
    SubLObject field_labels = get_question_answering_agent_field_labels( self );
    SubLObject field_width = get_question_answering_agent_field_width( self );
    SubLObject v_answer = get_question_answering_agent_answer( self );
    SubLObject values = get_question_answering_agent_values( self );
    SubLObject descriptions = get_question_answering_agent_descriptions( self );
    SubLObject choices = get_question_answering_agent_choices( self );
    SubLObject error_message = get_question_answering_agent_error_message( self );
    SubLObject question_type = get_question_answering_agent_question_type( self );
    SubLObject tip = get_question_answering_agent_tip( self );
    SubLObject v_question = get_question_answering_agent_question( self );
    SubLObject title = get_question_answering_agent_title( self );
    try
    {
      thread.throwStack.push( $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        object.object_initialize_method( self );
        title = NIL;
        v_question = NIL;
        tip = NIL;
        question_type = NIL;
        error_message = NIL;
        choices = NIL;
        descriptions = NIL;
        values = NIL;
        v_answer = NIL;
        field_width = NIL;
        field_labels = NIL;
        callback_function = NIL;
        user_data = NIL;
        client_data = NIL;
        Dynamic.sublisp_throw( $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_user_data( self, user_data );
          set_question_answering_agent_client_data( self, client_data );
          set_question_answering_agent_callback_function( self, callback_function );
          set_question_answering_agent_field_labels( self, field_labels );
          set_question_answering_agent_field_width( self, field_width );
          set_question_answering_agent_answer( self, v_answer );
          set_question_answering_agent_values( self, values );
          set_question_answering_agent_descriptions( self, descriptions );
          set_question_answering_agent_choices( self, choices );
          set_question_answering_agent_error_message( self, error_message );
          set_question_answering_agent_question_type( self, question_type );
          set_question_answering_agent_tip( self, tip );
          set_question_answering_agent_question( self, v_question );
          set_question_answering_agent_title( self, title );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 36596L)
  public static SubLObject question_answering_agent_set_question_method(final SubLObject self, final SubLObject new_question, SubLObject new_title, SubLObject new_type, SubLObject new_choices)
  {
    if( new_title == UNPROVIDED )
    {
      new_title = $sme_lexwiz_title$.getGlobalValue();
    }
    if( new_type == UNPROVIDED )
    {
      new_type = $kw143$BOOLEAN;
    }
    if( new_choices == UNPROVIDED )
    {
      new_choices = $list144;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject v_answer = get_question_answering_agent_answer( self );
    SubLObject v_default = get_question_answering_agent_default( self );
    SubLObject choices = get_question_answering_agent_choices( self );
    SubLObject error_message = get_question_answering_agent_error_message( self );
    SubLObject question_type = get_question_answering_agent_question_type( self );
    SubLObject v_question = get_question_answering_agent_question( self );
    SubLObject title = get_question_answering_agent_title( self );
    try
    {
      thread.throwStack.push( $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        v_question = new_question;
        title = new_title;
        question_type = new_type;
        choices = new_choices;
        v_answer = NIL;
        error_message = NIL;
        v_default = NIL;
        Dynamic.sublisp_throw( $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_answer( self, v_answer );
          set_question_answering_agent_default( self, v_default );
          set_question_answering_agent_choices( self, choices );
          set_question_answering_agent_error_message( self, error_message );
          set_question_answering_agent_question_type( self, question_type );
          set_question_answering_agent_question( self, v_question );
          set_question_answering_agent_title( self, title );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 37142L)
  public static SubLObject question_answering_agent_display_question_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str150$question_answering_agent__display ), self );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 37387L)
  public static SubLObject question_answering_agent_get_response_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    final SubLObject v_answer = get_question_answering_agent_answer( self );
    try
    {
      thread.throwStack.push( $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, v_answer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_answer( self, v_answer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 37620L)
  public static SubLObject question_answering_agent_validate_response_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = get_question_answering_agent_answer( self );
    final SubLObject values = get_question_answering_agent_values( self );
    final SubLObject choices = get_question_answering_agent_choices( self );
    final SubLObject question_type = get_question_answering_agent_question_type( self );
    final SubLObject possible_answers = ( NIL != values ) ? values : choices;
    SubLObject valid = NIL;
    lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), self );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str159$answer__s__, v_answer );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str160$choices__s__, choices );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str161$values__s__, values );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    final SubLObject pcase_var = question_type;
    if( pcase_var.eql( $kw143$BOOLEAN ) )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str162$pos__a__neg__a__, question_answering_agent_positive_choice_method( self ), question_answering_agent_negative_choice_method( self ) );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      if( v_answer.equalp( question_answering_agent_positive_choice_method( self ) ) || v_answer.equalp( question_answering_agent_negative_choice_method( self ) ) )
      {
        valid = T;
        v_answer = Equality.equalp( v_answer, question_answering_agent_positive_choice_method( self ) );
        set_question_answering_agent_answer( self, v_answer );
      }
    }
    else if( pcase_var.eql( $kw163$ENUMERATED ) )
    {
      if( v_answer.isList() )
      {
        v_answer = v_answer.first();
        set_question_answering_agent_answer( self, v_answer );
      }
      valid = conses_high.member( v_answer, possible_answers, Symbols.symbol_function( EQUALP ), UNPROVIDED );
      if( NIL == valid && v_answer.isString() && NIL != string_utilities.is_numericP( v_answer ) )
      {
        final SubLObject position = reader.parse_integer( v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( position.numGE( ZERO_INTEGER ) && position.numL( Sequences.length( possible_answers ) ) )
        {
          v_answer = Sequences.elt( possible_answers, position );
          set_question_answering_agent_answer( self, v_answer );
          valid = T;
        }
      }
    }
    else if( pcase_var.eql( $kw164$MULTIPLE_SELECTION ) )
    {
      if( v_answer.isString() && NIL == string_utilities.is_numericP( v_answer ) )
      {
        v_answer = lexification_utilities.lex_string_tokenize( v_answer, T );
        set_question_answering_agent_answer( self, v_answer );
      }
      if( v_answer.isList() )
      {
        valid = Sequences.search( v_answer, possible_answers, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == valid && v_answer.isString() )
      {
        SubLObject new_answer = NIL;
        SubLObject invalid = NIL;
        SubLObject cdolist_list_var = string_utilities.parse_numeric_range( v_answer );
        SubLObject position2 = NIL;
        position2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( position2.numGE( ZERO_INTEGER ) && position2.numL( Sequences.length( possible_answers ) ) )
          {
            new_answer = ConsesLow.cons( Sequences.elt( possible_answers, position2 ), new_answer );
          }
          else
          {
            invalid = T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          position2 = cdolist_list_var.first();
        }
        valid = makeBoolean( NIL != new_answer && NIL == invalid );
        v_answer = new_answer;
        set_question_answering_agent_answer( self, v_answer );
      }
    }
    else if( pcase_var.eql( $kw165$FREE_FORM ) )
    {
      valid = string_utilities.non_empty_stringP( string_utilities.trim_whitespace( v_answer ) );
    }
    else if( pcase_var.eql( $kw166$MULTIPLE_FREE_FORM ) )
    {
      valid = T;
      if( NIL == valid )
      {
        SubLObject csome_list_var;
        SubLObject sub_answer;
        for( csome_list_var = v_answer, sub_answer = NIL, sub_answer = csome_list_var.first(); NIL == valid && NIL != csome_list_var; valid = string_utilities.non_empty_stringP( string_utilities.trim_whitespace(
            sub_answer ) ), csome_list_var = csome_list_var.rest(), sub_answer = csome_list_var.first() )
        {
        }
      }
    }
    else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str167$Unknown_question_type___a__ ), question_type );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str168$validated_answer__s__, v_answer );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    methods.funcall_instance_method_with_1_args( self, $sym169$NOTIFY_CLIENT, $kw170$INPUT_VALIDATED );
    return valid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 40964L)
  public static SubLObject question_answering_agent_set_callback_function_method(final SubLObject self, final SubLObject new_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject callback_function = get_question_answering_agent_callback_function( self );
    try
    {
      thread.throwStack.push( $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        callback_function = new_function;
        Dynamic.sublisp_throw( $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_callback_function( self, callback_function );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 41279L)
  public static SubLObject question_answering_agent_set_client_data_method(final SubLObject self, final SubLObject callback_data)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject client_data = get_question_answering_agent_client_data( self );
    try
    {
      thread.throwStack.push( $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        client_data = callback_data;
        Dynamic.sublisp_throw( $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_client_data( self, client_data );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 41503L)
  public static SubLObject question_answering_agent_set_user_data_method(final SubLObject self, final SubLObject new_user_data)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject user_data = get_question_answering_agent_user_data( self );
    try
    {
      thread.throwStack.push( $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        user_data = new_user_data;
        Dynamic.sublisp_throw( $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_user_data( self, user_data );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 41721L)
  public static SubLObject question_answering_agent_set_proxy_method(final SubLObject self, final SubLObject new_proxy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject proxy = get_question_answering_agent_proxy( self );
    try
    {
      thread.throwStack.push( $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        proxy = new_proxy;
        Dynamic.sublisp_throw( $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 41911L)
  public static SubLObject question_answering_agent_notify_client_method(final SubLObject self, final SubLObject status)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    final SubLObject user_data = get_question_answering_agent_user_data( self );
    final SubLObject client_data = get_question_answering_agent_client_data( self );
    final SubLObject callback_function = get_question_answering_agent_callback_function( self );
    try
    {
      thread.throwStack.push( $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str195$callback_function__a__client_data, new SubLObject[] { callback_function, client_data, user_data
          } );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        if( NIL != callback_function )
        {
          Functions.funcall( callback_function, client_data, status, self, user_data );
        }
        Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_user_data( self, user_data );
          set_question_answering_agent_client_data( self, client_data );
          set_question_answering_agent_callback_function( self, callback_function );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 42306L)
  public static SubLObject question_answering_agent_positive_choice_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    final SubLObject choices = get_question_answering_agent_choices( self );
    try
    {
      thread.throwStack.push( $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, choices.first() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_choices( self, choices );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 42500L)
  public static SubLObject question_answering_agent_negative_choice_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    final SubLObject choices = get_question_answering_agent_choices( self );
    try
    {
      thread.throwStack.push( $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, conses_high.second( choices ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_choices( self, choices );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 42694L)
  public static SubLObject question_answering_agent_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_answering_agent_method = NIL;
    SubLObject user_data = get_question_answering_agent_user_data( self );
    SubLObject client_data = get_question_answering_agent_client_data( self );
    SubLObject callback_function = get_question_answering_agent_callback_function( self );
    SubLObject proxy = get_question_answering_agent_proxy( self );
    SubLObject field_labels = get_question_answering_agent_field_labels( self );
    SubLObject field_width = get_question_answering_agent_field_width( self );
    SubLObject v_answer = get_question_answering_agent_answer( self );
    SubLObject v_default = get_question_answering_agent_default( self );
    SubLObject values = get_question_answering_agent_values( self );
    SubLObject descriptions = get_question_answering_agent_descriptions( self );
    SubLObject choices = get_question_answering_agent_choices( self );
    SubLObject error_message = get_question_answering_agent_error_message( self );
    SubLObject question_type = get_question_answering_agent_question_type( self );
    SubLObject tip = get_question_answering_agent_tip( self );
    SubLObject v_question = get_question_answering_agent_question( self );
    SubLObject title = get_question_answering_agent_title( self );
    SubLObject id = get_question_answering_agent_id( self );
    try
    {
      thread.throwStack.push( $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        id = instances.get_slot( other, $sym89$ID );
        title = instances.get_slot( other, $sym88$TITLE );
        v_question = instances.get_slot( other, $sym87$QUESTION );
        tip = instances.get_slot( other, $sym86$TIP );
        question_type = instances.get_slot( other, $sym85$QUESTION_TYPE );
        error_message = instances.get_slot( other, $sym84$ERROR_MESSAGE );
        choices = conses_high.copy_list( instances.get_slot( other, $sym83$CHOICES ) );
        descriptions = conses_high.copy_list( instances.get_slot( other, $sym82$DESCRIPTIONS ) );
        values = conses_high.copy_list( instances.get_slot( other, $sym81$VALUES ) );
        v_default = instances.get_slot( other, $sym80$DEFAULT );
        v_answer = instances.get_slot( other, $sym79$ANSWER );
        field_width = instances.get_slot( other, $sym78$FIELD_WIDTH );
        field_labels = instances.get_slot( other, $sym77$FIELD_LABELS );
        proxy = instances.get_slot( other, $sym76$PROXY );
        callback_function = instances.get_slot( other, $sym75$CALLBACK_FUNCTION );
        client_data = instances.get_slot( other, $sym74$CLIENT_DATA );
        user_data = instances.get_slot( other, $sym73$USER_DATA );
        Dynamic.sublisp_throw( $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answering_agent_user_data( self, user_data );
          set_question_answering_agent_client_data( self, client_data );
          set_question_answering_agent_callback_function( self, callback_function );
          set_question_answering_agent_proxy( self, proxy );
          set_question_answering_agent_field_labels( self, field_labels );
          set_question_answering_agent_field_width( self, field_width );
          set_question_answering_agent_answer( self, v_answer );
          set_question_answering_agent_default( self, v_default );
          set_question_answering_agent_values( self, values );
          set_question_answering_agent_descriptions( self, descriptions );
          set_question_answering_agent_choices( self, choices );
          set_question_answering_agent_error_message( self, error_message );
          set_question_answering_agent_question_type( self, question_type );
          set_question_answering_agent_tip( self, tip );
          set_question_answering_agent_question( self, v_question );
          set_question_answering_agent_title( self, title );
          set_question_answering_agent_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 43763L)
  public static SubLObject question_answering_agent_new_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLObject new_object = methods.funcall_class_method_with_0_args( other, $sym212$NEW );
    methods.funcall_instance_method_with_1_args( new_object, $sym205$COPY, other );
    return new_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 44053L)
  public static SubLObject interface_proxy_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 44299L)
  public static SubLObject interface_proxy_init_session_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 44432L)
  public static SubLObject interface_proxy_end_session_method(final SubLObject self)
  {
    cb_sme_lexification_wizard.cb_invoke_sme_lexification_wizard( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 44761L)
  public static SubLObject interface_proxy_create_constant_method(final SubLObject self, final SubLObject constant_name)
  {
    return ke.ke_create_now( constant_name, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 44942L)
  public static SubLObject interface_proxy_describe_term_method(final SubLObject self, final SubLObject v_term)
  {
    return pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 45093L)
  public static SubLObject interface_proxy_resolve_term_method(final SubLObject self, final SubLObject term_label)
  {
    final SubLObject term_denots = lexicon_accessors.all_denots_of_string( term_label, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject term_descriptions = Mapping.mapcar( Symbols.symbol_function( $sym233$LEX_DESCRIBE_TERM ), term_denots );
    return Mapping.mapcar( Symbols.symbol_function( $sym234$LIST ), term_denots, new SubLObject[] { term_descriptions
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 45450L)
  public static SubLObject interface_proxy_mumble_method(final SubLObject self, final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str239$__mumbling___a__, message );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 45648L)
  public static SubLObject interface_proxy_forge_aheadP_method(final SubLObject self)
  {
    return $sme_forge_aheadP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 45892L)
  public static SubLObject new_sme_lexification_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = lexification_wizard.new_lexification_id();
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_verbose$.getGlobalValue() ) )
    {
      $next_sme_lexification_id$.setGlobalValue( Numbers.add( $next_sme_lexification_id$.getGlobalValue(), ONE_INTEGER ) );
      id = string_utilities.to_string( $next_sme_lexification_id$.getGlobalValue() );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 46510L)
  public static SubLObject sme_lexification_state_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    SubLObject interlocutor_agent = get_sme_lexification_state_interlocutor_agent( self );
    SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings( self );
    SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters( self );
    SubLObject next_states = get_sme_lexification_state_next_states( self );
    SubLObject state = get_sme_lexification_state_state( self );
    SubLObject id = get_sme_lexification_state_id( self );
    try
    {
      thread.throwStack.push( $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        object.object_initialize_method( self );
        id = new_sme_lexification_id();
        state = NIL;
        next_states = NIL;
        lexwiz_parameters = lexification_wizard.make_lexification_parameters( UNPROVIDED );
        lexwiz_settings = make_sme_lexification_settings( UNPROVIDED );
        interlocutor_agent = methods.funcall_class_method_with_0_args( $sym71$QUESTION_ANSWERING_AGENT, $sym212$NEW );
        Dynamic.sublisp_throw( $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_interlocutor_agent( self, interlocutor_agent );
          set_sme_lexification_state_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_state_lexwiz_parameters( self, lexwiz_parameters );
          set_sme_lexification_state_next_states( self, next_states );
          set_sme_lexification_state_state( self, state );
          set_sme_lexification_state_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 46955L)
  public static SubLObject sme_lexification_state_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    SubLObject interlocutor_agent = get_sme_lexification_state_interlocutor_agent( self );
    SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings( self );
    SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters( self );
    SubLObject next_states = get_sme_lexification_state_next_states( self );
    SubLObject state = get_sme_lexification_state_state( self );
    try
    {
      thread.throwStack.push( $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        state = instances.get_slot( other, $sym98$STATE );
        next_states = conses_high.copy_list( instances.get_slot( other, $sym97$NEXT_STATES ) );
        lexwiz_parameters = lexification_wizard.copy_lexification_parameters( instances.get_slot( other, $sym96$LEXWIZ_PARAMETERS ) );
        lexwiz_settings = copy_sme_lexification_settings( instances.get_slot( other, $sym95$LEXWIZ_SETTINGS ) );
        interlocutor_agent = methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym210$NEW_COPY, instances.get_slot( other, $sym94$INTERLOCUTOR_AGENT ) );
        Dynamic.sublisp_throw( $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_interlocutor_agent( self, interlocutor_agent );
          set_sme_lexification_state_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_state_lexwiz_parameters( self, lexwiz_parameters );
          set_sme_lexification_state_next_states( self, next_states );
          set_sme_lexification_state_state( self, state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 47660L)
  public static SubLObject sme_lexification_state_get_id_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject id = get_sme_lexification_state_id( self );
    try
    {
      thread.throwStack.push( $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, id );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 47790L)
  public static SubLObject sme_lexification_state_set_states_method(final SubLObject self, final SubLObject state_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    SubLObject next_states = get_sme_lexification_state_next_states( self );
    try
    {
      thread.throwStack.push( $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        next_states = state_list;
        Dynamic.sublisp_throw( $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_next_states( self, next_states );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 47982L)
  public static SubLObject sme_lexification_state_get_states_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject next_states = get_sme_lexification_state_next_states( self );
    try
    {
      thread.throwStack.push( $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, next_states );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_next_states( self, next_states );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 48142L)
  public static SubLObject sme_lexification_state_current_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject state = get_sme_lexification_state_state( self );
    try
    {
      thread.throwStack.push( $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_state( self, state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 48286L)
  public static SubLObject sme_lexification_state_current_settings_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, lexwiz_parameters );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 48454L)
  public static SubLObject sme_lexification_state_advance_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    SubLObject next_states = get_sme_lexification_state_next_states( self );
    SubLObject state = get_sme_lexification_state_state( self );
    try
    {
      thread.throwStack.push( $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        state = next_states.first();
        next_states = next_states.rest();
        Dynamic.sublisp_throw( $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_next_states( self, next_states );
          set_sme_lexification_state_state( self, state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 48697L)
  public static SubLObject sme_lexification_state_new_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLObject new_state = methods.funcall_class_method_with_0_args( $sym92$SME_LEXIFICATION_STATE, $sym212$NEW );
    methods.funcall_instance_method_with_1_args( new_state, $sym205$COPY, other );
    return new_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 49145L)
  public static SubLObject sme_lexification_state_list_values_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters( self );
    final SubLObject next_states = get_sme_lexification_state_next_states( self );
    final SubLObject state = get_sme_lexification_state_state( self );
    final SubLObject id = get_sme_lexification_state_id( self );
    try
    {
      thread.throwStack.push( $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, ConsesLow.list( id, state, next_states, lexification_wizard.list_lexification_parameters( lexwiz_parameters, T, UNPROVIDED ),
            list_sme_lexification_settings( lexwiz_settings, T ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_state_lexwiz_parameters( self, lexwiz_parameters );
          set_sme_lexification_state_next_states( self, next_states );
          set_sme_lexification_state_state( self, state );
          set_sme_lexification_state_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 49428L)
  public static SubLObject sme_lexification_state_trace_values_method(final SubLObject self, SubLObject label, SubLObject debug_level)
  {
    if( label == UNPROVIDED )
    {
      label = NIL;
    }
    if( debug_level == UNPROVIDED )
    {
      debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_state_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
      try
      {
        if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( debug_level ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str285$_a_s__, ( NIL != label ) ? label : $str286$SME_lexification_state__, sme_lexification_state_list_values_method( self ) );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), self );
        lexification_wizard.trace_lexification_parameters( lexwiz_parameters, lexification_utilities.$lex_most_verbose$.getGlobalValue() );
        trace_sme_lexification_settings( lexwiz_settings, lexification_utilities.$lex_most_verbose$.getGlobalValue() );
        Dynamic.sublisp_throw( $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_state_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_state_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_state_method = Errors.handleThrowable( ccatch_env_var, $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 49931L)
  public static SubLObject sme_lexification_interlocutor_initialize_method(final SubLObject self)
  {
    SubLObject callback_function = get_sme_lexification_interlocutor_callback_function( self );
    SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    object.object_initialize_method( self );
    callback_function = NIL;
    set_sme_lexification_interlocutor_callback_function( self, callback_function );
    sme_state = methods.funcall_class_method_with_0_args( $sym92$SME_LEXIFICATION_STATE, $sym212$NEW );
    set_sme_lexification_interlocutor_sme_state( self, sme_state );
    proxy = methods.funcall_class_method_with_0_args( $sym63$INTERFACE_PROXY, $sym212$NEW );
    set_sme_lexification_interlocutor_proxy( self, proxy );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 50439L)
  public static SubLObject sme_lexification_interlocutor_doneP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    try
    {
      thread.throwStack.push( $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        final SubLObject next_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
        Dynamic.sublisp_throw( $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, Types.sublisp_null( next_states ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 50684L)
  public static SubLObject sme_lexification_interlocutor_initiate_interaction_method(final SubLObject self, final SubLObject session_parameters, final SubLObject callback_fn, final SubLObject instance_data,
      final SubLObject new_proxy, final SubLObject question_answering_agent_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user_data = get_sme_lexification_interlocutor_user_data( self );
    final SubLObject client_data = get_sme_lexification_interlocutor_client_data( self );
    final SubLObject callback_function = get_sme_lexification_interlocutor_callback_function( self );
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str298$callback_fn__of_type__a____a__, Types.type_of( callback_fn ), callback_fn );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str299$question_answering_agent_class__o, Types.type_of( question_answering_agent_class ), question_answering_agent_class );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    set_sme_lexification_interlocutor_lexwiz_parameters( self, session_parameters );
    lexwiz_settings = make_sme_lexification_settings( UNPROVIDED );
    set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
    instances.set_slot( sme_state, $sym96$LEXWIZ_PARAMETERS, session_parameters );
    instances.set_slot( sme_state, $sym95$LEXWIZ_SETTINGS, lexwiz_settings );
    set_sme_lexification_interlocutor_callback_function( self, callback_fn );
    set_sme_lexification_interlocutor_client_data( self, instance_data );
    set_sme_lexification_interlocutor_user_data( self, session_parameters );
    set_sme_lexification_interlocutor_proxy( self, new_proxy );
    sme_lexification_interlocutor_set_interlocutor_agent_method( self, methods.funcall_class_method_with_0_args( question_answering_agent_class, $sym212$NEW ) );
    sme_lexification_interlocutor_update_notification_info_method( self );
    methods.funcall_instance_method_with_0_args( self, $sym300$NEXT_INTERACTION );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 52693L)
  public static SubLObject sme_lexification_interlocutor_update_notification_info_method(final SubLObject self)
  {
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    final SubLObject my_notification_fn = methods.resolve_method( $sym304$PROCESS_STATUS_UPDATE, $sym101$SME_LEXIFICATION_INTERLOCUTOR );
    methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym172$SET_CALLBACK_FUNCTION, my_notification_fn );
    methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym177$SET_CLIENT_DATA, self );
    methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym182$SET_USER_DATA, lexwiz_parameters );
    methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym187$SET_PROXY, proxy );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 53484L)
  public static SubLObject sme_lexification_interlocutor_next_interaction_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    SubLObject previous_id = get_sme_lexification_interlocutor_previous_id( self );
    previous_id = methods.funcall_instance_method_with_0_args( sme_state, $sym250$GET_ID );
    set_sme_lexification_interlocutor_previous_id( self, previous_id );
    methods.funcall_instance_method_with_1_args( sme_state, $sym281$TRACE_VALUES, $str307$sme_state__ );
    lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), sme_state );
    sme_lexification_interlocutor_update_lexification_parameters_method( self );
    instances.set_slot( sme_state, $sym95$LEXWIZ_SETTINGS, copy_sme_lexification_settings( lexwiz_settings ) );
    if( NIL == $use_blackboardP$.getGlobalValue() )
    {
      sme_state = methods.funcall_class_method_with_1_args( $sym92$SME_LEXIFICATION_STATE, $sym210$NEW_COPY, sme_state );
      set_sme_lexification_interlocutor_sme_state( self, sme_state );
      sme_lexification_interlocutor_update_notification_info_method( self );
    }
    methods.funcall_instance_method_with_0_args( sme_state, $sym271$ADVANCE );
    final SubLObject id = methods.funcall_instance_method_with_0_args( sme_state, $sym250$GET_ID );
    lexification_wizard.set_lexification_object( id, sme_state );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str308$current_state___a__, methods.funcall_instance_method_with_0_args( sme_state, $sym263$CURRENT_STATE ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str309$next_states___a__, methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    final SubLObject state = methods.funcall_instance_method_with_0_args( sme_state, $sym263$CURRENT_STATE );
    if( NIL != object.object_implements_method_p_method( self, state ) )
    {
      methods.funcall_instance_method_with_0_args( self, state );
    }
    else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str310$Unexpected_state___a__ ), state );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 55342L)
  public static SubLObject sme_lexification_interlocutor_end_interaction_method(final SubLObject self)
  {
    sme_lexification_interlocutor_notify_client_method( self, $kw314$DONE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 55633L)
  public static SubLObject sme_lexification_interlocutor_reset_state_method(final SubLObject self, final SubLObject state_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject previous_id = get_sme_lexification_interlocutor_previous_id( self );
    final SubLObject old_sme_state = lexification_wizard.get_lexification_object( state_id );
    if( NIL != old_sme_state )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str319$Resetting_SME_lexwiz_to_older_sta, state_id );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      methods.funcall_instance_method_with_1_args( old_sme_state, $sym281$TRACE_VALUES, $str320$old_sme_state__ );
      methods.funcall_instance_method_with_1_args( sme_state, $sym281$TRACE_VALUES, $str321$sme_state__before___ );
      sme_state = methods.funcall_class_method_with_1_args( $sym92$SME_LEXIFICATION_STATE, $sym210$NEW_COPY, old_sme_state );
      set_sme_lexification_interlocutor_sme_state( self, sme_state );
      methods.funcall_instance_method_with_1_args( sme_state, $sym281$TRACE_VALUES, $str322$sme_state__after___ );
      set_sme_lexification_interlocutor_previous_id( self, state_id );
      sme_lexification_interlocutor_update_lexification_parameters_method( self );
      lexwiz_settings = copy_sme_lexification_settings( instances.get_slot( sme_state, $sym95$LEXWIZ_SETTINGS ) );
      set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_verbose$.getGlobalValue() ) && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE(
          Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$.getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str323$done_with_state_reset__ );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
    }
    else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str324$Unable_to_resolve_SME_lexificatio ), state_id );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return sme_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 56980L)
  public static SubLObject sme_lexification_interlocutor_process_status_update_method(final SubLObject self, final SubLObject status, SubLObject server, SubLObject current_user_data)
  {
    if( server == UNPROVIDED )
    {
      server = NIL;
    }
    if( current_user_data == UNPROVIDED )
    {
      current_user_data = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject previous_id = get_sme_lexification_interlocutor_previous_id( self );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str328$sme_li_process_status_update_stat, new SubLObject[] { status, server, current_user_data
      } );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    interlocutor_agent = server;
    if( status.eql( $kw329$OUTPUT_DONE ) )
    {
      methods.funcall_instance_method_with_0_args( interlocutor_agent, $sym152$GET_RESPONSE );
    }
    else if( status.eql( $kw330$INPUT_READY ) )
    {
      methods.funcall_instance_method_with_0_args( interlocutor_agent, $sym156$VALIDATE_RESPONSE );
    }
    else if( status.eql( $kw170$INPUT_VALIDATED ) )
    {
      lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, NIL );
      final SubLObject id = methods.funcall_instance_method_with_0_args( sme_state, $sym250$GET_ID );
      final SubLObject agent_id = instances.get_slot( interlocutor_agent, $sym89$ID );
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str331$id__a_previous_id__a_agent_id__a_, new SubLObject[] { id, previous_id, agent_id
        } );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      if( !agent_id.equal( previous_id ) && !agent_id.equal( id ) && NIL == $use_blackboardP$.getGlobalValue() )
      {
        sme_lexification_interlocutor_reset_state_method( self, agent_id );
      }
      methods.funcall_instance_method_with_0_args( self, $sym300$NEXT_INTERACTION );
    }
    else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str332$Unexpected_status___a__ ), status );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 58954L)
  public static SubLObject sme_lexification_interlocutor_ask_generic_boolean_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject v_default)
  {
    if( tip == UNPROVIDED )
    {
      tip = NIL;
    }
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym86$TIP, tip );
    methods.funcall_instance_method_with_3_args( interlocutor_agent, $sym139$SET_QUESTION, v_question, title, $kw143$BOOLEAN );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, v_default );
    sme_lexification_interlocutor_display_question_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 59487L)
  public static SubLObject sme_lexification_interlocutor_ask_generic_enumerated_method(final SubLObject self, final SubLObject title, final SubLObject v_question, final SubLObject choices, SubLObject tip,
      SubLObject values, SubLObject default_offset)
  {
    if( tip == UNPROVIDED )
    {
      tip = NIL;
    }
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( default_offset == UNPROVIDED )
    {
      default_offset = NIL;
    }
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym86$TIP, tip );
    instances.set_slot( interlocutor_agent, $sym81$VALUES, values );
    methods.funcall_instance_method_with_4_args( interlocutor_agent, $sym139$SET_QUESTION, v_question, title, $kw163$ENUMERATED, choices );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, default_offset );
    sme_lexification_interlocutor_display_question_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 60143L)
  public static SubLObject sme_lexification_interlocutor_ask_generic_multiple_selection_method(final SubLObject self, final SubLObject title, final SubLObject v_question, final SubLObject choices, SubLObject tip,
      SubLObject values, SubLObject default_offsets)
  {
    if( tip == UNPROVIDED )
    {
      tip = NIL;
    }
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( default_offsets == UNPROVIDED )
    {
      default_offsets = NIL;
    }
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym86$TIP, tip );
    instances.set_slot( interlocutor_agent, $sym81$VALUES, values );
    methods.funcall_instance_method_with_4_args( interlocutor_agent, $sym139$SET_QUESTION, v_question, title, $kw164$MULTIPLE_SELECTION, choices );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, default_offsets );
    sme_lexification_interlocutor_display_question_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 60826L)
  public static SubLObject sme_lexification_interlocutor_ask_generic_free_form_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject size, SubLObject v_default)
  {
    if( tip == UNPROVIDED )
    {
      tip = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = TEN_INTEGER;
    }
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym86$TIP, tip );
    instances.set_slot( interlocutor_agent, $sym78$FIELD_WIDTH, size );
    methods.funcall_instance_method_with_3_args( interlocutor_agent, $sym139$SET_QUESTION, v_question, title, $kw165$FREE_FORM );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, v_default );
    sme_lexification_interlocutor_display_question_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 61368L)
  public static SubLObject sme_lexification_interlocutor_ask_generic_multiple_free_form_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject labels,
      SubLObject size, SubLObject defaults, SubLObject descriptions)
  {
    if( tip == UNPROVIDED )
    {
      tip = NIL;
    }
    if( labels == UNPROVIDED )
    {
      labels = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( defaults == UNPROVIDED )
    {
      defaults = NIL;
    }
    if( descriptions == UNPROVIDED )
    {
      descriptions = NIL;
    }
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym86$TIP, tip );
    instances.set_slot( interlocutor_agent, $sym78$FIELD_WIDTH, size );
    instances.set_slot( interlocutor_agent, $sym77$FIELD_LABELS, labels );
    methods.funcall_instance_method_with_3_args( interlocutor_agent, $sym139$SET_QUESTION, v_question, title, $kw166$MULTIPLE_FREE_FORM );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, defaults );
    instances.set_slot( interlocutor_agent, $sym82$DESCRIPTIONS, descriptions );
    sme_lexification_interlocutor_display_question_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 62028L)
  public static SubLObject sme_lexification_interlocutor_display_question_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
        instances.set_slot( interlocutor_agent, $sym84$ERROR_MESSAGE, lexification_wizard.lexwiz_error_message( lexwiz_parameters ) );
        lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, NIL );
        instances.set_slot( interlocutor_agent, $sym89$ID, methods.funcall_instance_method_with_0_args( sme_state, $sym250$GET_ID ) );
        sme_lexification_interlocutor_update_lexification_parameters_method( self );
        instances.set_slot( sme_state, $sym95$LEXWIZ_SETTINGS, copy_sme_lexification_settings( lexwiz_settings ) );
        methods.funcall_instance_method_with_0_args( interlocutor_agent, $sym147$DISPLAY_QUESTION );
        Dynamic.sublisp_throw( $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 62882L)
  public static SubLObject sme_lexification_interlocutor_get_answer_method(final SubLObject self)
  {
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    return instances.get_slot( interlocutor_agent, $sym79$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 63129L)
  public static SubLObject sme_lexification_interlocutor_set_answer_method(final SubLObject self, final SubLObject new_answer)
  {
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym79$ANSWER, new_answer );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 63483L)
  public static SubLObject sme_lexification_interlocutor_get_interlocutor_agent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    try
    {
      thread.throwStack.push( $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        if( NIL == sme_state && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ),
            lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str367$____assertion_failed___a______ ), $sym103$SME_STATE );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        if( NIL != sme_state )
        {
          Dynamic.sublisp_throw( $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, instances.get_slot( sme_state, $sym94$INTERLOCUTOR_AGENT ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 63763L)
  public static SubLObject sme_lexification_interlocutor_set_interlocutor_agent_method(final SubLObject self, final SubLObject new_agent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    try
    {
      thread.throwStack.push( $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        if( NIL == sme_state && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ),
            lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str367$____assertion_failed___a______ ), $sym103$SME_STATE );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        if( NIL != sme_state )
        {
          instances.set_slot( sme_state, $sym94$INTERLOCUTOR_AGENT, new_agent );
        }
        Dynamic.sublisp_throw( $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 64048L)
  public static SubLObject sme_lexification_interlocutor_set_default_method(final SubLObject self, final SubLObject new_default)
  {
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    instances.set_slot( interlocutor_agent, $sym80$DEFAULT, new_default );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 64330L)
  public static SubLObject sme_lexification_interlocutor_check_generic_method(final SubLObject self, final SubLObject field)
  {
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    final SubLObject response = instances.get_slot( interlocutor_agent, $sym79$ANSWER );
    final SubLObject field_accessor = Packages.intern( PrintLow.format( NIL, $str381$LEXWIZ__S, field ), UNPROVIDED );
    Eval.eval( ConsesLow.list( $sym382$CSETF, ConsesLow.list( field_accessor, lexwiz_parameters ), response ) );
    methods.funcall_instance_method_with_0_args( self, $sym300$NEXT_INTERACTION );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 64943L)
  public static SubLObject sme_lexification_interlocutor_set_callback_function_method(final SubLObject self, final SubLObject new_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    SubLObject callback_function = get_sme_lexification_interlocutor_callback_function( self );
    try
    {
      thread.throwStack.push( $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        callback_function = new_function;
        Dynamic.sublisp_throw( $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_callback_function( self, callback_function );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 65171L)
  public static SubLObject sme_lexification_interlocutor_set_proxy_method(final SubLObject self, final SubLObject new_proxy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    try
    {
      thread.throwStack.push( $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        proxy = new_proxy;
        Dynamic.sublisp_throw( $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 65366L)
  public static SubLObject sme_lexification_interlocutor_notify_client_method(final SubLObject self, final SubLObject status)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject user_data = get_sme_lexification_interlocutor_user_data( self );
    final SubLObject client_data = get_sme_lexification_interlocutor_client_data( self );
    final SubLObject callback_function = get_sme_lexification_interlocutor_callback_function( self );
    try
    {
      thread.throwStack.push( $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        if( NIL != callback_function )
        {
          Functions.funcall( callback_function, client_data, status, self, user_data );
        }
        Dynamic.sublisp_throw( $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_user_data( self, user_data );
          set_sme_lexification_interlocutor_client_data( self, client_data );
          set_sme_lexification_interlocutor_callback_function( self, callback_function );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 65628L)
  public static SubLObject sme_lexification_interlocutor_mumble_method(final SubLObject self, final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    try
    {
      thread.throwStack.push( $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        if( NIL != proxy )
        {
          Dynamic.sublisp_throw( $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, methods.funcall_instance_method_with_1_args( proxy, $sym236$MUMBLE, message ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 65842L)
  public static SubLObject sme_lexification_interlocutor_forge_aheadP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    try
    {
      thread.throwStack.push( $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        if( NIL != proxy )
        {
          Dynamic.sublisp_throw( $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, methods.funcall_instance_method_with_0_args( proxy, $sym241$FORGE_AHEAD_ ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 66053L)
  public static SubLObject sme_lexification_interlocutor_phrase_denotations_method(final SubLObject self, final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, lexicon_accessors.all_denots_of_string( phrase, NIL, lexification_wizard.lexwiz_lexical_mt( lexwiz_parameters ),
            UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 66341L)
  public static SubLObject sme_lexification_interlocutor_describe_term_method(final SubLObject self, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, ( NIL != proxy ) ? methods.funcall_instance_method_with_1_args( proxy, $sym226$DESCRIBE_TERM, v_term )
            : lexification_utilities.lex_describe_term( v_term, lexification_wizard.lexwiz_lexical_mt( lexwiz_parameters ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_proxy( self, proxy );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable( ccatch_env_var, $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_interlocutor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 66666L)
  public static SubLObject sme_lexification_interlocutor_update_lexification_parameters_method(final SubLObject self)
  {
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method( self );
    final SubLObject new_lexification_parameters = lexification_wizard.copy_lexification_parameters( lexwiz_parameters );
    instances.set_slot( sme_state, $sym96$LEXWIZ_PARAMETERS, new_lexification_parameters );
    methods.funcall_instance_method_with_1_args( interlocutor_agent, $sym182$SET_USER_DATA, new_lexification_parameters );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 67155L)
  public static SubLObject sme_li_pre_general_initialize_method(final SubLObject self)
  {
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    sme_lexification_interlocutor_initialize_method( self );
    sme_state = instances.get_slot( self, $sym103$SME_STATE );
    set_sme_lexification_interlocutor_sme_state( self, sme_state );
    final SubLObject state_sequence = $list409;
    methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, state_sequence );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 68097L)
  public static SubLObject sme_li_pre_general_do_initialization_method(final SubLObject self)
  {
    final SubLObject title = $str413$Performing_dictionary_assistant_i;
    final SubLObject v_question = PrintLow.format( NIL, $str414$_a_____a, $lexwiz_welcome_message$.getGlobalValue(), $str415$Press_OK_to_proceed_ );
    final SubLObject choices = NIL;
    final SubLObject tip = $lexwiz_initialization_tip$.getGlobalValue();
    if( NIL != $sme_lexwiz_initializedP$.getGlobalValue() )
    {
      sme_lexification_interlocutor_next_interaction_method( self );
    }
    else
    {
      sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, choices, tip, UNPROVIDED, UNPROVIDED );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 68590L)
  public static SubLObject sme_li_pre_general_check_initialization_method(final SubLObject self)
  {
    if( NIL == $sme_lexwiz_initializedP$.getGlobalValue() )
    {
      init_sme_lexification_wizard();
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 68872L)
  public static SubLObject sme_li_pre_general_ask_term_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        final SubLObject term_label = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject title = PrintLow.format( NIL, $str423$Determining_concept_to_be_lexifie );
        final SubLObject v_question = PrintLow.format( NIL, $str424$Which_concept_s_lexical_informati );
        final SubLObject tip = $str425$This_is_usually_the_name_of_the_t;
        final SubLObject size = $int426$60;
        if( NIL != forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) || ( NIL != string_utilities.non_empty_stringP( term_label ) && NIL != lexification_utilities.lex_empty_stringP( lexification_wizard
            .lexwiz_error_message( lexwiz_parameters ) ) ) )
        {
          sme_lexification_interlocutor_set_answer_method( self, term_label );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_free_form_method( self, title, v_question, tip, size, term_label );
        }
        Dynamic.sublisp_throw( $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 69742L)
  public static SubLObject sme_li_pre_general_check_term_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        if( NIL == forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
        {
          final SubLObject term_label = sme_lexification_interlocutor_get_answer_method( self );
          lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, sme_li_pre_general_resolve_term_method( self, term_label ) );
          if( !Sequences.length( lexification_wizard.lexwiz_term( lexwiz_parameters ) ).numG( ZERO_INTEGER ) )
          {
            lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, term_label );
            lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, $str431$A_valid_concept_must_be_specified );
            SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
            new_states = ConsesLow.append( $list432, new_states );
            methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
          }
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 70803L)
  public static SubLObject sme_li_pre_general_resolve_term_method(final SubLObject self, final SubLObject term_label)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    try
    {
      thread.throwStack.push( $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        SubLObject term_clarifications = ConsesLow.list( ConsesLow.list( lexification_utilities.lex_fort_for_string( term_label ), term_label ) );
        if( NIL != proxy )
        {
          term_clarifications = methods.funcall_instance_method_with_1_args( proxy, $sym230$RESOLVE_TERM, term_label );
        }
        Dynamic.sublisp_throw( $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, term_clarifications );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 71212L)
  public static SubLObject sme_li_pre_general_ask_term_selection_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        lexification_wizard.trace_lexification_parameters( lexwiz_parameters, UNPROVIDED );
        if( NIL != forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
        {
          sme_lexification_interlocutor_next_interaction_method( self );
          Dynamic.sublisp_throw( $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
        }
        if( !lexification_wizard.lexwiz_term( lexwiz_parameters ).isList() )
        {
          if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
              .getGlobalValue() ) ) )
          {
            PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str440$Unexpected_term_parameter___s__ ), lexification_wizard.lexwiz_term(
                lexwiz_parameters ) );
            streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
          }
          Dynamic.sublisp_throw( $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
        }
        final SubLObject term_clarifications = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject title = PrintLow.format( NIL, $str441$Clarifying_term_to_be_lexified );
        final SubLObject v_question = PrintLow.format( NIL, $str442$Which_of_the_following_terms_do_y );
        final SubLObject choices = Mapping.mapcar( Symbols.symbol_function( $sym443$SECOND ), term_clarifications );
        final SubLObject values = Mapping.mapcar( Symbols.symbol_function( $sym444$FIRST ), term_clarifications );
        final SubLObject default_offset = NIL;
        final SubLObject tip = NIL;
        if( Sequences.length( choices ).numE( ONE_INTEGER ) )
        {
          lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, term_clarifications.first().first() );
        }
        if( NIL != forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, choices, tip, values, default_offset );
        }
        Dynamic.sublisp_throw( $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 72357L)
  public static SubLObject sme_li_pre_general_check_term_selection_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        if( NIL == forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
        {
          lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, lexification_utilities.lex_fort_for_string( sme_lexification_interlocutor_get_answer_method( self ) ) );
        }
        if( NIL == forts.fort_p( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
        {
          lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, $str431$A_valid_concept_must_be_specified );
          SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
          new_states = ConsesLow.append( $list449, new_states );
          methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 73086L)
  public static SubLObject sme_li_pre_general_ask_phrase_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject title = PrintLow.format( NIL, $str454$Checking_phrase_for_the_lexificat );
        final SubLObject v_question = PrintLow.format( NIL, $str455$How_would_you_like_to_refer_to_th, term_desc );
        final SubLObject tip = $phrase_specification_tip$.getGlobalValue();
        final SubLObject size = $int426$60;
        SubLObject skipP = string_utilities.non_empty_stringP( phrase );
        SubLObject v_default = NIL;
        if( NIL == skipP && NIL == sme_lexwiz_okP( lexwiz_settings ) )
        {
          phrase = ( v_default = lexification_utilities.preferred_loose_lexification_phrase_for_term( v_term ) );
          sme_lexification_interlocutor_set_answer_method( self, phrase );
          if( NIL != $use_inferred_phrasesP$.getGlobalValue() )
          {
            skipP = string_utilities.non_empty_stringP( v_default );
          }
        }
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
        if( NIL != skipP && NIL != lexicon_utilities.is_determinerP( phrase_words.first(), UNPROVIDED, UNPROVIDED ) && NIL != fort_types_interface.collection_in_any_mtP( v_term ) )
        {
          final SubLObject message = PrintLow.format( NIL, $str456$Assuming_you_don_t_want_to_use_th, phrase_words.first(), phrase );
          v_default = lexification_utilities.join_words( phrase_words.rest() );
          lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, $str457$ );
          skipP = NIL;
          sme_lexification_interlocutor_mumble_method( self, message );
        }
        if( NIL != skipP )
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_free_form_method( self, title, v_question, tip, size, v_default );
        }
        Dynamic.sublisp_throw( $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 74743L)
  public static SubLObject sme_li_pre_general_check_phrase_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        SubLObject phrase = lex_normalize_string( lexification_wizard.lexwiz_phrase( lexwiz_parameters ) );
        lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, phrase );
        if( NIL != lexification_utilities.lex_empty_stringP( phrase ) )
        {
          phrase = lex_normalize_string( sme_lexification_interlocutor_get_answer_method( self ) );
          lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, phrase );
          if( NIL != lexification_utilities.lex_empty_stringP( phrase ) )
          {
            lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, $str462$A_valid_phrase_must_be_specified );
            SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
            new_states = ConsesLow.append( $list463, new_states );
            methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
          }
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 75731L)
  public static SubLObject sme_li_pre_general_ask_ambiguity_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject title = PrintLow.format( NIL, $str468$Checking_phrase_ambiguity );
        final SubLObject other_terms = Sequences.remove( v_term, sme_lexification_interlocutor_phrase_denotations_method( self, phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject other_term_descs = map_method( self, $sym226$DESCRIBE_TERM, other_terms );
        final SubLObject v_question = PrintLow.format( NIL, $str469$In_addition_to___a___phrase__s_al, new SubLObject[] { term_desc, phrase, $newline_tab$.getGlobalValue(), string_utilities.join_strings(
            other_term_descs, $newline_tab$.getGlobalValue() )
        } );
        final SubLObject skipP = Types.sublisp_null( other_terms );
        sme_lexification_interlocutor_set_answer_method( self, skipP );
        if( NIL != skipP )
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, UNPROVIDED, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 76606L)
  public static SubLObject sme_li_pre_general_check_ambiguity_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        final SubLObject okP = sme_lexification_interlocutor_get_answer_method( self );
        if( NIL == okP )
        {
          _csetf_sme_lexwiz_okP( lexwiz_settings, T );
          lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, $str457$ );
          SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
          new_states = ConsesLow.append( $list474, new_states );
          methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 77373L)
  public static SubLObject sme_li_pre_general_ask_proper_name_status_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_pre_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject title = $str479$Checking_whether_the_phrase_is_a_;
        final SubLObject v_question = PrintLow.format( NIL, $str480$Is_the_phrase___a__a_name_, phrase );
        final SubLObject tip = $proper_name_status_tip$.getGlobalValue();
        final SubLObject nameableP = lexification_utilities.is_nameable_entityP( lexification_wizard.lexwiz_term( lexwiz_parameters ) );
        final SubLObject has_uppercase_letterP = Numbers.numG( Sequences.count_if( Symbols.symbol_function( $sym481$UPPER_CASE_P ), phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ZERO_INTEGER );
        final SubLObject use_inferred_typeP = makeBoolean( NIL != sme_lexification_interlocutor_forge_aheadP_method( self ) && ( NIL != nameableP || NIL == has_uppercase_letterP ) );
        final SubLObject skipP = makeBoolean( NIL != lexification_utilities.is_relationalP( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) || NIL != use_inferred_typeP );
        if( NIL != skipP )
        {
          final SubLObject qualifier = ( NIL != nameableP ) ? $str482$is : $str483$isn_t;
          final SubLObject reason = PrintLow.format( NIL, $str484$Assuming_phrase__s__a_a_proper_na, new SubLObject[] { phrase, qualifier, term_desc, qualifier
          } );
          if( NIL != use_inferred_typeP )
          {
            sme_lexification_interlocutor_mumble_method( self, reason );
          }
          sme_lexification_interlocutor_set_answer_method( self, nameableP );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, tip, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_pre_general_method = Errors.handleThrowable( ccatch_env_var, $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_pre_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 79111L)
  public static SubLObject sme_li_pre_general_check_proper_name_status_method(final SubLObject self)
  {
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    if( NIL == lexification_utilities.is_relationalP( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
    {
      lexification_wizard._csetf_lexwiz_is_properP( lexwiz_parameters, sme_lexification_interlocutor_get_answer_method( self ) );
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 79446L)
  public static SubLObject sme_li_proper_name_initialize_method(final SubLObject self)
  {
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    sme_lexification_interlocutor_initialize_method( self );
    sme_state = instances.get_slot( self, $sym103$SME_STATE );
    set_sme_lexification_interlocutor_sme_state( self, sme_state );
    methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, $list490 );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 80128L)
  public static SubLObject sme_li_proper_name_ask_abbreviation_status_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject title = $str495$Checking_abbreviation_predication;
        final SubLObject v_question = PrintLow.format( NIL, $str496$Is__s_an_abbreviation_, phrase );
        final SubLObject no_spaceP = makeBoolean( NIL == string_utilities.char_position( Characters.CHAR_space, phrase, UNPROVIDED ) );
        SubLObject reason = NIL;
        if( NIL != no_spaceP )
        {
          if( NIL != string_utilities.upper_case_string_p( phrase ) )
          {
            reason = $str497$uppercase;
          }
          if( NIL != string_utilities.ends_with( phrase, $str498$_, UNPROVIDED ) )
          {
            reason = $str499$ends_with_period;
          }
        }
        if( NIL != reason )
        {
          final SubLObject message = PrintLow.format( NIL, $str500$Checking_whether__s_is_an_abbrevi, phrase, reason );
          sme_lexification_interlocutor_mumble_method( self, message );
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 81138L)
  public static SubLObject sme_li_proper_name_check_abbreviation_status_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    try
    {
      thread.throwStack.push( $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        _csetf_sme_lexwiz_is_abbreviationP( lexwiz_settings, sme_lexification_interlocutor_get_answer_method( self ) );
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 81393L)
  public static SubLObject sme_li_proper_name_ask_predicate_type_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        final SubLObject is_abbreviationP = sme_lexwiz_is_abbreviationP( lexwiz_settings );
        final SubLObject pred_type = ( NIL != is_abbreviationP ) ? $str509$abbreviation_types : $str510$specialized_kinds_of_names;
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject title = $str511$Determining_proper_name_type;
        final SubLObject v_question = PrintLow.format( NIL, $str512$If__s_is_one_of_the__a_of_names_l, phrase, pred_type );
        final SubLObject tip = $str513$When_in_doubt__select_the_default;
        thread.resetMultipleValues();
        final SubLObject choices = determine_proper_name_pred_choices( v_term, is_abbreviationP );
        final SubLObject predicates = thread.secondMultipleValue();
        final SubLObject default_offset = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL == choices )
        {
          final SubLObject message = PrintLow.format( NIL, $str514$No_specialized_proper_name_types_, term_desc );
          sme_lexification_interlocutor_mumble_method( self, message );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, choices, tip, predicates, default_offset );
        }
        Dynamic.sublisp_throw( $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 82725L)
  public static SubLObject sme_li_proper_name_check_predicate_type_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        final SubLObject proper_name_pred = sme_lexification_interlocutor_get_answer_method( self );
        if( !proper_name_pred.equal( $str519$n_a ) )
        {
          lexification_wizard._csetf_lexwiz_proper_name_pred( lexwiz_parameters, proper_name_pred );
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 83075L)
  public static SubLObject sme_li_proper_name_ask_refined_predication_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        final SubLObject pred = lexification_wizard.lexwiz_proper_name_pred( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject cyc_term = lexification_utilities.lex_fort_for_string( v_term );
        final SubLObject is_personP = isa.isa_in_any_mtP( cyc_term, $const524$Person );
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject title = ( NIL != is_personP ) ? $str525$Checking_constituents_of_the_huma : $str526$Checking_for_possible_abbreviatio;
        final SubLObject v_question = PrintLow.format( NIL, $str527$For_the_name__s__please_complete_, phrase );
        final SubLObject preds = ( NIL != is_personP ) ? $lexwiz_person_sub_predicates$.getGlobalValue() : filter_abbreviation_predicates( cyc_term );
        final SubLObject labels = Mapping.mapcar( Symbols.symbol_function( $sym233$LEX_DESCRIBE_TERM ), preds );
        SubLObject defaults = NIL;
        SubLObject descriptions = NIL;
        final SubLObject tip = NIL;
        final SubLObject sizes = NIL;
        thread.resetMultipleValues();
        final SubLObject defaults_$1 = sme_li_proper_name_infer_proper_name_sub_predications_method( self, cyc_term, phrase, preds );
        final SubLObject descriptions_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        defaults = defaults_$1;
        descriptions = descriptions_$2;
        _csetf_sme_lexwiz_proper_sub_predicates( lexwiz_settings, preds );
        sme_lexification_interlocutor_set_answer_method( self, NIL );
        if( ( NIL != is_personP && pred.equal( $str528$nameString ) && Sequences.length( name_tokenize( phrase ) ).numG( ONE_INTEGER ) ) || Sequences.length( name_tokenize( phrase ) ).numGE(
            $lexwiz_abbreviation_check_min_words$.getGlobalValue() ) )
        {
          final SubLObject reason = ( NIL != is_personP ) ? $str529$for_a_person : $str530$quite_long;
          final SubLObject message = PrintLow.format( NIL, $str531$Since__s_is__a__checking_addition, phrase, reason );
          sme_lexification_interlocutor_mumble_method( self, message );
          sme_lexification_interlocutor_ask_generic_multiple_free_form_method( self, title, v_question, tip, labels, sizes, defaults, descriptions );
        }
        else
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 85134L)
  public static SubLObject sme_li_proper_name_check_refined_predication_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_proper_name_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
      try
      {
        final SubLObject refined_predications = sme_lexification_interlocutor_get_answer_method( self );
        final SubLObject predicates = sme_lexwiz_proper_sub_predicates( lexwiz_settings );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        SubLObject list_var = NIL;
        SubLObject predication = NIL;
        SubLObject i = NIL;
        list_var = refined_predications;
        predication = list_var.first();
        for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), predication = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
        {
          if( NIL != string_utilities.non_empty_stringP( predication ) )
          {
            final SubLObject predicate = Sequences.elt( predicates, i );
            lexification_wizard._csetf_lexwiz_other_formulas( lexwiz_parameters, ConsesLow.cons( ConsesLow.list( predicate, v_term, predication ), lexification_wizard.lexwiz_other_formulas( lexwiz_parameters ) ) );
          }
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_proper_name_method = Errors.handleThrowable( ccatch_env_var, $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_proper_name_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 85786L)
  public static SubLObject sme_li_proper_name_infer_proper_name_sub_predications_method(final SubLObject self, final SubLObject v_term, SubLObject phrase, final SubLObject proper_name_predicates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject title = $str457$;
    SubLObject suffix = $str457$;
    final SubLObject is_personP = Equality.equal( $lexwiz_person_sub_predicates$.getGlobalValue(), proper_name_predicates );
    SubLObject sub_predications = NIL;
    SubLObject descriptions = NIL;
    SubLObject name_tokens = name_tokenize( phrase );
    if( NIL != is_name_titleP( name_tokens.first() ) || ( Sequences.length( name_tokens.first() ).numG( TWO_INTEGER ) && NIL != string_utilities.ends_with( name_tokens.first(), $str498$_, UNPROVIDED ) ) )
    {
      title = name_tokens.first();
      phrase = lexification_utilities.join_words( name_tokens.rest() );
    }
    name_tokens = name_tokenize( phrase );
    if( NIL != string_utilities.ends_with( list_utilities.penultimate_one( name_tokens ), $str540$_, UNPROVIDED ) )
    {
      suffix = list_utilities.last_one( name_tokens );
      phrase = lexification_utilities.join_words( list_utilities.remove_last( name_tokens ) );
      phrase = string_utilities.trim_sides( phrase, Characters.CHAR_comma );
    }
    name_tokens = name_tokenize( phrase );
    final SubLObject family_name_firstP = has_family_name_firstP( v_term );
    final SubLObject family_name_position = ( NIL != family_name_firstP ) ? ZERO_INTEGER : number_utilities.f_1_( Sequences.length( name_tokens ) );
    final SubLObject given_name_position = ( NIL != family_name_firstP ) ? number_utilities.f_1_( Sequences.length( name_tokens ) ) : ZERO_INTEGER;
    final SubLObject middle_name_position = ( NIL != family_name_firstP ) ? number_utilities.f_1_( given_name_position ) : ONE_INTEGER;
    if( NIL != family_name_firstP )
    {
      sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str541$Assuming_family_name_given_first_, phrase ) );
    }
    SubLObject cdolist_list_var = proper_name_predicates;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject sub_name = $str457$;
      SubLObject description = $str457$;
      final SubLObject pcase_var = predicate;
      if( pcase_var.eql( $const542$familyName ) )
      {
        sub_name = Sequences.elt( name_tokens, family_name_position );
      }
      else if( pcase_var.eql( $const543$givenNames ) )
      {
        if( !family_name_position.numE( given_name_position ) )
        {
          final SubLObject given_name = Sequences.elt( name_tokens, given_name_position );
          if( NIL == name_abbreviationP( given_name ) )
          {
            sub_name = given_name;
          }
        }
      }
      else if( pcase_var.eql( $const544$middleName ) )
      {
        if( Sequences.length( name_tokens ).numG( TWO_INTEGER ) )
        {
          final SubLObject middle_name = Sequences.elt( name_tokens, middle_name_position );
          if( NIL == name_abbreviationP( middle_name ) )
          {
            sub_name = middle_name;
          }
        }
      }
      else if( pcase_var.eql( $const545$titleOfPerson_String ) )
      {
        sub_name = title;
      }
      else if( pcase_var.eql( $const546$nameSuffix ) )
      {
        sub_name = suffix;
      }
      else if( pcase_var.eql( $const547$initialsString ) )
      {
        if( NIL == is_personP )
        {
          description = $str548$_first_letters_of_names__ex__FDR_;
        }
      }
      else if( pcase_var.eql( $const549$initialismString ) )
      {
        description = $str550$_first_letters__ex__UNHCR__NATO__;
      }
      else if( pcase_var.eql( $const551$acronymString ) )
      {
        description = $str552$_prefixes__ex__RADAR___RAdio_Dete;
      }
      else if( pcase_var.eql( $const553$abbreviationString_PN ) )
      {
        description = $str554$_short_form__ex__dict___parens_;
      }
      else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str555$Unexpected_pred__s_in_infer_prope ), predicate );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      sub_predications = ConsesLow.cons( sub_name, sub_predications );
      descriptions = ConsesLow.cons( description, descriptions );
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( sub_predications ), Sequences.nreverse( descriptions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 89631L)
  public static SubLObject name_abbreviationP(final SubLObject name)
  {
    return makeBoolean( Sequences.length( name ).numE( ONE_INTEGER ) || NIL != string_utilities.ends_with( name, $str498$_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 89963L)
  public static SubLObject sme_li_denotational_initialize_method(final SubLObject self)
  {
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    sme_lexification_interlocutor_initialize_method( self );
    sme_state = instances.get_slot( self, $sym103$SME_STATE );
    set_sme_lexification_interlocutor_sme_state( self, sme_state );
    methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, $list558 );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 90701L)
  public static SubLObject sme_li_denotational_guess_headword_position_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
        final SubLObject title = $str563$Guessing_the_headword_of_the_phra;
        final SubLObject guessed_offset = lexification_utilities.most_likely_headword( phrase_words );
        final SubLObject guessed_headword = Sequences.elt( phrase_words, guessed_offset );
        final SubLObject v_question = PrintLow.format( NIL, $str564$Is__s_a_type_of__s_, phrase, guessed_headword );
        final SubLObject tip = $headword_guessing_tip$.getGlobalValue();
        SubLObject skipP = Numbers.numE( Sequences.length( phrase_words ), ONE_INTEGER );
        lexification_wizard._csetf_lexwiz_headword_position( lexwiz_parameters, number_utilities.f_1X( guessed_offset ) );
        final SubLObject headword_denots = sme_lexification_interlocutor_phrase_denotations_method( self, guessed_headword );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym565$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const566$EverythingPSC, thread );
          if( NIL != conses_high.intersection( headword_denots, ConsesLow.cons( v_term, genls.min_genls( v_term, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED ) )
          {
            sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str567$Since__s_is_a_type_of__s__assumin, phrase, guessed_headword ) );
            sme_lexification_interlocutor_set_answer_method( self, T );
            skipP = T;
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        if( NIL == skipP )
        {
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, tip, UNPROVIDED );
        }
        else
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 92507L)
  public static SubLObject sme_li_denotational_check_guessed_headword_position_method(final SubLObject self)
  {
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject headword_okP = sme_lexification_interlocutor_get_answer_method( self );
    if( NIL == headword_okP )
    {
      final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
      final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
      final SubLObject rejected_position = lexification_wizard.lexwiz_headword_position( lexwiz_parameters );
      if( NIL != list_utilities.lengthG( phrase_words, TWO_INTEGER, UNPROVIDED ) )
      {
        lexification_wizard._csetf_lexwiz_headword_position( lexwiz_parameters, MINUS_ONE_INTEGER );
      }
      else if( NIL != list_utilities.lengthE( phrase_words, TWO_INTEGER, UNPROVIDED ) )
      {
        lexification_wizard._csetf_lexwiz_headword_position( lexwiz_parameters, Numbers.subtract( THREE_INTEGER, rejected_position ) );
      }
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 93332L)
  public static SubLObject sme_li_denotational_ask_headword_position_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject title = $str575$Checking_the_qualified_word_of_th;
        final SubLObject v_question = PrintLow.format( NIL, $str576$In__s__which_word_is_being_qualif, phrase );
        final SubLObject tip = $headword_selection_tip$.getGlobalValue();
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
        final SubLObject offsets = Mapping.mapcar( Symbols.symbol_function( $sym577$TO_STRING ), list_utilities.num_list( Sequences.length( phrase_words ), UNPROVIDED ) );
        final SubLObject default_position = lexification_wizard.lexwiz_headword_position( lexwiz_parameters );
        if( Sequences.length( phrase_words ).numG( ONE_INTEGER ) && default_position.numLE( ZERO_INTEGER ) )
        {
          sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, phrase_words, tip, offsets, UNPROVIDED );
        }
        else
        {
          sme_lexification_interlocutor_set_answer_method( self, offsets.first() );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 94397L)
  public static SubLObject sme_li_denotational_check_headword_position_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( lexification_wizard.lexwiz_phrase( lexwiz_parameters ), NIL );
    final SubLObject v_answer = sme_lexification_interlocutor_get_answer_method( self );
    final SubLObject headword_offset = ( NIL != string_utilities.non_empty_stringP( v_answer ) ) ? lexification_utilities.extract_integer( v_answer, UNPROVIDED ) : MINUS_ONE_INTEGER;
    if( lexification_wizard.lexwiz_headword_position( lexwiz_parameters ).numLE( ZERO_INTEGER ) )
    {
      lexification_wizard._csetf_lexwiz_headword_position( lexwiz_parameters, number_utilities.f_1X( headword_offset ) );
      if( !headword_offset.numGE( ZERO_INTEGER ) || !headword_offset.numL( Sequences.length( phrase_words ) ) )
      {
        if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
            .getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str581$invalid_headword_offset___a__, headword_offset );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, $str582$The_headword_position_must_be_spe );
        SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
        new_states = ConsesLow.append( $list583, new_states );
        methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
      }
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 95504L)
  public static SubLObject sme_li_denotational_ask_part_of_speech_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( lexification_wizard.lexwiz_phrase( lexwiz_parameters ), NIL );
        final SubLObject headword_position = lexification_wizard.lexwiz_headword_position( lexwiz_parameters );
        final SubLObject headword = Sequences.elt( phrase_words, number_utilities.f_1_( headword_position ) );
        SubLObject title = PrintLow.format( NIL, $str588$Determining_how_the_word___a__is_, headword, lexification_wizard.lexwiz_phrase( lexwiz_parameters ) );
        final SubLObject tip = NIL;
        SubLObject v_default = NIL;
        if( Sequences.length( phrase_words ).numE( ONE_INTEGER ) )
        {
          title = PrintLow.format( NIL, $str589$Checking_usage_of___a_, headword );
        }
        thread.resetMultipleValues();
        final SubLObject choices = sme_li_denotational_derive_part_of_speech_examples_method( self, headword, phrase_words, headword_position, v_term );
        final SubLObject part_of_speech_values = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject default_pos = most_likely_headword_part_of_speech( headword, part_of_speech_values );
        if( NIL != default_pos )
        {
          sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str590$Pre_selecting__a_as_part_of_speec, lexification_utilities.lex_describe_term( default_pos, UNPROVIDED ), headword ) );
          v_default = Sequences.position( default_pos, part_of_speech_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, $str591$Which_of_the_following_sounds_bes, choices, tip, part_of_speech_values, v_default );
        Dynamic.sublisp_throw( $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 97504L)
  public static SubLObject sme_li_denotational_check_part_of_speech_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject part_of_speech = lexification_utilities.lex_fort_for_string( sme_lexification_interlocutor_get_answer_method( self ) );
        lexification_wizard._csetf_lexwiz_headword_part_of_speech( lexwiz_parameters, part_of_speech );
        if( NIL == part_of_speech )
        {
          if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
              .getGlobalValue() ) ) )
          {
            PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str596$invalid_headword_part_of_speech__, part_of_speech );
            streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
          }
          lexification_wizard._csetf_lexwiz_error_message( lexwiz_parameters, $str597$The_headword_part_of_speech_must_ );
          SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
          new_states = ConsesLow.append( $list598, new_states );
          methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_sme_state( self, sme_state );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 98308L)
  public static SubLObject sme_li_denotational_show_headword_variations_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject mapping_mt = lexification_wizard.determine_lexical_mapping_mt( lexification_wizard.lexwiz_mt( lexwiz_parameters ), UNPROVIDED );
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
        final SubLObject headword_position = lexification_wizard.lexwiz_headword_position( lexwiz_parameters );
        final SubLObject headword = Sequences.elt( phrase_words, number_utilities.f_1_( headword_position ) );
        final SubLObject part_of_speech = lexification_wizard.lexwiz_headword_part_of_speech( lexwiz_parameters );
        _csetf_sme_lexwiz_new_mappingP( lexwiz_settings, makeBoolean( NIL == lexicon_accessors.words_of_stringXspeech_part( headword, part_of_speech, NIL, mapping_mt, UNPROVIDED ) ) );
        sme_li_denotational_add_lexical_mapping_method( self, headword, part_of_speech, mapping_mt, UNPROVIDED );
        final SubLObject variants = derive_part_of_speech_variations( phrase, headword_position, part_of_speech, mapping_mt );
        final SubLObject title = PrintLow.format( NIL, $str603$Checking_variant_phrases_due_to_v, headword );
        SubLObject v_question = PrintLow.format( NIL, $str604$Are_the_following_good_ways_to_re, new SubLObject[] { term_desc, $newline_tab$.getGlobalValue(), string_utilities.join_strings( variants, $newline_tab$
            .getGlobalValue() )
        } );
        final SubLObject tip = $str605$The_main_thing_to_check_for_is_od;
        if( NIL == variants )
        {
          v_question = PrintLow.format( NIL, $str606$There_are_no_variations_for_the_p, phrase );
        }
        if( NIL != sme_lexification_interlocutor_forge_aheadP_method( self ) )
        {
          final SubLObject message = PrintLow.format( NIL, $str607$Assuming_that_the_following_varia, phrase, ( NIL != variants ) ? string_utilities.join_strings( variants, UNPROVIDED ) : $str519$n_a );
          sme_lexification_interlocutor_mumble_method( self, message );
          sme_lexification_interlocutor_set_answer_method( self, T );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, tip, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 100592L)
  public static SubLObject sme_li_denotational_check_headword_variations_method(final SubLObject self)
  {
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( lexification_wizard.lexwiz_phrase( lexwiz_parameters ), NIL );
    final SubLObject mapping_mt = lexification_wizard.determine_lexical_mapping_mt( lexification_wizard.lexwiz_mt( lexwiz_parameters ), UNPROVIDED );
    final SubLObject headword_position = lexification_wizard.lexwiz_headword_position( lexwiz_parameters );
    final SubLObject headword = Sequences.elt( phrase_words, number_utilities.f_1_( headword_position ) );
    final SubLObject part_of_speech = lexification_wizard.lexwiz_headword_part_of_speech( lexwiz_parameters );
    final SubLObject okP = sme_lexification_interlocutor_get_answer_method( self );
    if( NIL == okP )
    {
      if( NIL != sme_lexwiz_new_mappingP( lexwiz_settings ) )
      {
        sme_li_denotational_remove_lexical_mapping_method( self, headword, part_of_speech, mapping_mt, UNPROVIDED );
      }
      SubLObject new_states = methods.funcall_instance_method_with_0_args( sme_state, $sym259$GET_STATES );
      new_states = ConsesLow.append( $list611, new_states );
      methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, new_states );
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 101913L)
  public static SubLObject sme_li_denotational_add_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, SubLObject mt, SubLObject word_type)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const616$EnglishMt;
    }
    if( word_type == UNPROVIDED )
    {
      word_type = $const617$EnglishWord;
    }
    if( NIL == lexicon_accessors.words_of_stringXspeech_part( wordform, part_of_speech, NIL, mt, UNPROVIDED ) )
    {
      return sme_li_denotational_do_lexical_mapping_method( self, wordform, part_of_speech, mt, word_type, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 102367L)
  public static SubLObject sme_li_denotational_remove_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, SubLObject mt, SubLObject word_type)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const616$EnglishMt;
    }
    if( word_type == UNPROVIDED )
    {
      word_type = $const617$EnglishWord;
    }
    return sme_li_denotational_do_lexical_mapping_method( self, wordform, part_of_speech, mt, word_type, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 102744L)
  public static SubLObject sme_li_denotational_do_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, final SubLObject word_type,
      final SubLObject addP)
  {
    final SubLObject proxy = get_sme_lexification_interlocutor_proxy( self );
    final SubLObject create_constant_fn = methods.resolve_method( $sym222$CREATE_CONSTANT, class_name_from_object( proxy ) );
    return lexification_wizard.do_lexical_mapping_int( wordform, part_of_speech, mt, word_type, addP, create_constant_fn, proxy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 103239L)
  public static SubLObject sme_li_denotational_derive_part_of_speech_examples_method(final SubLObject self, final SubLObject headword, final SubLObject phrase_words, final SubLObject headword_position,
      final SubLObject v_term)
  {
    SubLObject examples = NIL;
    final SubLObject candidates = $sme_parts_of_speech$.getGlobalValue();
    SubLObject parts_of_speech = NIL;
    SubLObject cdolist_list_var = candidates;
    SubLObject part_of_speech = NIL;
    part_of_speech = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject headword_position_zero_index = number_utilities.f_1_( headword_position );
      final SubLObject example = sme_li_denotational_derive_part_of_speech_example_method( self, headword, phrase_words, headword_position_zero_index, part_of_speech, v_term );
      if( NIL != example )
      {
        examples = ConsesLow.cons( example, examples );
        parts_of_speech = ConsesLow.cons( part_of_speech, parts_of_speech );
      }
      cdolist_list_var = cdolist_list_var.rest();
      part_of_speech = cdolist_list_var.first();
    }
    return Values.values( Sequences.reverse( examples ), Sequences.reverse( parts_of_speech ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 104293L)
  public static SubLObject sme_li_denotational_derive_part_of_speech_example_method(final SubLObject self, final SubLObject word, final SubLObject phrase_words, final SubLObject headword_position,
      final SubLObject part_of_speech, SubLObject v_term)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = $const633$Thing;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_denotational_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
      try
      {
        final SubLObject phrase = string_utilities.bunge( phrase_words, UNPROVIDED );
        final SubLObject mt = lexification_wizard.lexwiz_mt( lexwiz_parameters );
        final SubLObject singular_word = lexification_utilities.singularize_word( word, mt );
        final SubLObject singular_phrase = string_utilities.bunge( list_utilities.replace_nth( headword_position, singular_word, phrase_words ), UNPROVIDED );
        final SubLObject lowercase_word = Strings.string_downcase( word, UNPROVIDED, UNPROVIDED );
        final SubLObject lowercase_phrase = string_utilities.bunge( list_utilities.replace_nth( headword_position, lowercase_word, phrase_words ), UNPROVIDED );
        final SubLObject plural_word = lexification_utilities.pluralize_word( singular_word, mt );
        final SubLObject plural_phrase = string_utilities.bunge( list_utilities.replace_nth( headword_position, plural_word, phrase_words ), UNPROVIDED );
        final SubLObject infinitive_word = ( NIL != lexicon_accessors.genl_posP( part_of_speech, $const635$Verb, UNPROVIDED ) || NIL != lexicon_accessors.genl_posP( part_of_speech, $const636$DeVerbalNoun, UNPROVIDED ) )
            ? sme_li_inflected_verb_to_infinitive( word )
            : NIL;
        final SubLObject infinitive_phrase = string_utilities.bunge( list_utilities.replace_nth( headword_position, infinitive_word, phrase_words ), UNPROVIDED );
        SubLObject a_det = pph_utilities.add_determiner( singular_phrase ).first();
        if( NIL == a_det )
        {
          a_det = $str637$a;
        }
        if( NIL != sme_li_denotational_disable_speech_part_selection_method( self, word, part_of_speech, v_term ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, NIL );
        }
        if( part_of_speech.eql( $const638$CountNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str639$many__a___a__a__countable_noun_li, new SubLObject[] { plural_phrase, a_det, singular_phrase
          } ) );
        }
        else if( part_of_speech.eql( $const640$MassNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str641$much__a__some__a__uncountable_nou, lowercase_phrase, lowercase_phrase ) );
        }
        else if( part_of_speech.eql( $const642$AgentiveNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str643$_a__a_is_able_to__a__agentive_nou, new SubLObject[] { a_det, singular_phrase, infinitive_word
          } ) );
        }
        else if( part_of_speech.eql( $const644$GerundiveNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str645$_a_involves_ability_to__a__gerund, singular_phrase, infinitive_phrase ) );
        }
        else if( part_of_speech.eql( $const646$ProperCountNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str647$proper_name_for_countable_objects ) );
        }
        else if( part_of_speech.eql( $const648$ProperMassNoun ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str649$proper_name_for_substance_like_ob ) );
        }
        else if( part_of_speech.eql( $const635$Verb ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str650$to__a___a_unexpectedly__verb_like, infinitive_phrase, phrase ) );
        }
        else if( part_of_speech.eql( $const651$Adjective ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str652$very__a__most__a__adjective_like_, phrase, phrase ) );
        }
        else if( part_of_speech.eql( $const653$Adverb ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, PrintLow.format( NIL, $str654$so__a__as__a_as______adverb_like_, phrase, phrase ) );
        }
        else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
            .getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str655$Unable_to_derive_example_for_part ), part_of_speech );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_denotational_method = Errors.handleThrowable( ccatch_env_var, $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_denotational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 107508L)
  public static SubLObject sme_li_inflected_verb_to_infinitive(final SubLObject inflected_verb)
  {
    SubLObject infinitive = NIL;
    if( NIL == infinitive )
    {
      SubLObject csome_list_var;
      SubLObject word;
      for( csome_list_var = lexicon_cache.words_of_string( inflected_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED ), word = NIL, word = csome_list_var.first(); NIL == infinitive
          && NIL != csome_list_var; infinitive = lexicon_cache.first_string_of_wordXpred( word, $const657$infinitive, UNPROVIDED ), csome_list_var = csome_list_var.rest(), word = csome_list_var.first() )
      {
      }
    }
    if( infinitive.isString() )
    {
      return infinitive;
    }
    return morphology.inflected_verb_to_infinitive( inflected_verb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 107845L)
  public static SubLObject sme_li_denotational_disable_speech_part_selection_method(final SubLObject self, final SubLObject word, final SubLObject part_of_speech, SubLObject v_term)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = $const633$Thing;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject singular_word = lexification_utilities.singularize_word( word, UNPROVIDED );
    final SubLObject term_desc = lexification_utilities.lex_describe_term( v_term, UNPROVIDED );
    SubLObject disableP = NIL;
    if( part_of_speech.eql( $const651$Adjective ) )
    {
      final SubLObject term_is_attributeP = NIL;
      final SubLObject reason = $str661$adjectival_suffix;
      if( NIL == lexification_utilities.likely_adjectiveP( word, UNPROVIDED ) )
      {
        disableP = makeBoolean( NIL == term_is_attributeP );
      }
      if( NIL == disableP )
      {
        sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str662$Enabling_adjective_for__s_since__, word, reason ) );
      }
    }
    else if( part_of_speech.eql( $const653$Adverb ) )
    {
      if( NIL == lexification_utilities.likely_adverbP( word, UNPROVIDED ) )
      {
        disableP = T;
      }
    }
    else if( part_of_speech.eql( $const642$AgentiveNoun ) )
    {
      if( NIL == lexification_utilities.likely_has_part_of_speechP( $const642$AgentiveNoun, singular_word, UNPROVIDED ) )
      {
        disableP = T;
      }
    }
    else if( part_of_speech.eql( $const644$GerundiveNoun ) )
    {
      if( NIL == lexification_utilities.likely_has_part_of_speechP( $const644$GerundiveNoun, singular_word, UNPROVIDED ) )
      {
        disableP = T;
      }
    }
    else if( part_of_speech.eql( $const646$ProperCountNoun ) || part_of_speech.eql( $const648$ProperMassNoun ) )
    {
      disableP = string_utilities.lower_case_string_p( word );
    }
    else if( part_of_speech.eql( $const638$CountNoun ) )
    {
      final SubLObject word_units = lexicon_accessors.words_of_stringXspeech_part( word, $const638$CountNoun, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == disableP )
      {
        SubLObject csome_list_var = $list664;
        SubLObject speech_part = NIL;
        speech_part = csome_list_var.first();
        while ( NIL == disableP && NIL != csome_list_var)
        {
          if( NIL != subl_promotions.memberP( speech_part, lexicon_accessors.pos_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) && ( NIL == word_units || NIL != conses_high.intersection(
              word_units, lexicon_accessors.words_of_stringXspeech_part( word, speech_part, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) ) )
          {
            sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str663$Disabling_simple_noun_for__s_sinc, word, lexification_utilities.lex_describe_term( speech_part, UNPROVIDED ) ) );
            disableP = T;
          }
          csome_list_var = csome_list_var.rest();
          speech_part = csome_list_var.first();
        }
      }
    }
    else if( !part_of_speech.eql( $const640$MassNoun ) )
    {
      if( part_of_speech.eql( $const635$Verb ) )
      {
        if( NIL != lexification_utilities.likely_verbP( singular_word, UNPROVIDED ) )
        {
          sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str665$Enabling_verb_for__s_since_it_is_, word ) );
        }
        else if( NIL != genls.genl_in_any_mtP( v_term, $const666$Event ) )
        {
          sme_lexification_interlocutor_mumble_method( self, PrintLow.format( NIL, $str667$Enabling_verb_for__s_since___a__i, word, term_desc ) );
        }
        else
        {
          disableP = T;
        }
      }
      else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str668$Unexpected_part_of_speech__during ), part_of_speech );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
    }
    return disableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 111545L)
  public static SubLObject sme_li_relational_initialize_method(final SubLObject self)
  {
    sme_lexification_interlocutor_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 111828L)
  public static SubLObject sme_li_relational_initiate_interaction_method(final SubLObject self, final SubLObject session_parameters, final SubLObject callback_fn, final SubLObject callbackup_data,
      final SubLObject new_proxy, final SubLObject question_answering_agent_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    final SubLObject v_term = lexification_wizard.lexwiz_term( session_parameters );
    final SubLObject num_args = lexification_utilities.lex_arity_in_any_mt( v_term );
    final SubLObject initial_states = $list673;
    final SubLObject arg_states = $list674;
    final SubLObject final_states = $list675;
    final SubLObject state_sequence = conses_high.copy_list( initial_states );
    if( lexification_wizard.lexwiz_lexical_mt( session_parameters ).equal( lexicon_vars.$default_lexification_mt$.getDynamicValue( thread ) ) )
    {
      lexification_wizard._csetf_lexwiz_lexical_mt( session_parameters, misc_kb_utilities.fort_for_string( lexicon_vars.$default_predicate_lexification_mt$.getDynamicValue( thread ) ) );
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str676$initial_state_sequence__s__, state_sequence );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( num_args ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ConsesLow.nconc( state_sequence, conses_high.copy_list( arg_states ) );
    }
    ConsesLow.nconc( state_sequence, conses_high.copy_list( final_states ) );
    methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, state_sequence );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str677$sme_li_relational_next_states___a, state_sequence );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    sme_lexification_interlocutor_initiate_interaction_method( self, session_parameters, callback_fn, callbackup_data, new_proxy, question_answering_agent_class );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 113352L)
  public static SubLObject sme_li_relational_ask_sample_sentence_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject title = $str682$Determining_relation_template;
        final SubLObject phrase_type = ( NIL != lexification_utilities.is_functionalP( v_term ) ) ? $str683$phrase : $str684$sentence;
        final SubLObject v_question = PrintLow.format( NIL, $str685$Enter_a__a_illustrating_the___a__, phrase_type, term_desc );
        SubLObject tip = $sample_sentence_tip$.getGlobalValue();
        final SubLObject term_comments = lexification_utilities.get_term_comments( v_term );
        final SubLObject size = $int426$60;
        final SubLObject v_default = phrase;
        if( NIL != string_utilities.non_empty_stringP( term_comments ) )
        {
          tip = PrintLow.format( NIL, $str414$_a_____a, term_comments, tip );
        }
        Dynamic.sublisp_throw( $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, sme_lexification_interlocutor_ask_generic_free_form_method( self, title, v_question, tip, size, v_default ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 114177L)
  public static SubLObject sme_li_relational_check_sample_sentence_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    try
    {
      thread.throwStack.push( $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        _csetf_sme_lexwiz_current_arg( lexwiz_settings, ONE_INTEGER );
        final SubLObject sentence = sme_lexification_interlocutor_get_answer_method( self );
        _csetf_sme_lexwiz_sample_sentence( lexwiz_settings, sentence );
        _csetf_sme_lexwiz_sentence_words( lexwiz_settings, lexification_utilities.lex_string_tokenize( sentence, T ) );
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 114591L)
  public static SubLObject sme_li_relational_ask_argument_values_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject sentence = sme_lexwiz_sample_sentence( lexwiz_settings );
        final SubLObject word_choices = lexification_utilities.lex_string_tokenize( sentence, T );
        final SubLObject arg_num = sme_lexwiz_current_arg( lexwiz_settings );
        final SubLObject title = $str694$Determining_relational_arguments;
        final SubLObject v_arg_type = lexification_utilities.get_relation_argument_type( v_term, arg_num );
        final SubLObject arg_type_description = lexification_utilities.lex_describe_term( v_arg_type, UNPROVIDED );
        final SubLObject v_question = PrintLow.format( NIL, $str695$Select_phrase_for_argument__a___a, new SubLObject[] { arg_num, arg_type_description, term_desc
        } );
        final SubLObject offsets = Mapping.mapcar( Symbols.symbol_function( $sym577$TO_STRING ), list_utilities.num_list( Sequences.length( word_choices ), UNPROVIDED ) );
        final SubLObject tip = lexification_utilities.get_term_comments( v_term );
        Dynamic.sublisp_throw( $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, sme_lexification_interlocutor_ask_generic_multiple_selection_method( self, title, v_question, word_choices, tip, offsets, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 115456L)
  public static SubLObject sme_li_relational_check_argument_values_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    try
    {
      thread.throwStack.push( $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject offsets = Mapping.mapcar( Symbols.symbol_function( $sym700$EXTRACT_INTEGER ), sme_lexification_interlocutor_get_answer_method( self ) );
        final SubLObject words = sme_lexwiz_sentence_words( lexwiz_settings );
        final SubLObject start = offsets.first();
        final SubLObject end = number_utilities.f_1X( list_utilities.last_one( offsets ) );
        final SubLObject arg_phrase = lexification_utilities.join_words( Sequences.subseq( words, start, end ) );
        _csetf_sme_lexwiz_arg_offsets( lexwiz_settings, ConsesLow.cons( ConsesLow.list( start, end ), sme_lexwiz_arg_offsets( lexwiz_settings ) ) );
        _csetf_sme_lexwiz_sentence_args( lexwiz_settings, ConsesLow.cons( arg_phrase, sme_lexwiz_sentence_args( lexwiz_settings ) ) );
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 116161L)
  public static SubLObject sme_li_relational_ask_argument_part_of_speech_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    try
    {
      thread.throwStack.push( $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject arg_phrase = sme_lexwiz_sentence_args( lexwiz_settings ).first();
        final SubLObject speech_parts = rtp_phrase_parts_of_speech( arg_phrase );
        final SubLObject choices = Mapping.mapcar( Symbols.symbol_function( $sym705$STRING_FOR_FORT ), speech_parts );
        final SubLObject title = $str706$Determining_part_of_speech_for_ar;
        final SubLObject v_question = PrintLow.format( NIL, $str707$Select_part_of_speech_for__s, arg_phrase );
        final SubLObject tip = $argument_part_of_speech_tip$.getGlobalValue();
        if( Sequences.length( choices ).numG( ONE_INTEGER ) )
        {
          sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, choices, tip, speech_parts, UNPROVIDED );
        }
        else
        {
          sme_lexification_interlocutor_set_answer_method( self, speech_parts.first() );
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 117243L)
  public static SubLObject sme_li_relational_check_argument_part_of_speech_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject num_args = lexification_utilities.lex_arity_in_any_mt( v_term );
        SubLObject speech_part = lexification_utilities.lex_fort_for_string( sme_lexification_interlocutor_get_answer_method( self ) );
        if( NIL == forts.fort_p( speech_part ) )
        {
          speech_part = $const712$Noun;
        }
        _csetf_sme_lexwiz_arg_speech_parts( lexwiz_settings, ConsesLow.cons( speech_part, sme_lexwiz_arg_speech_parts( lexwiz_settings ) ) );
        _csetf_sme_lexwiz_current_arg( lexwiz_settings, number_utilities.f_1X( sme_lexwiz_current_arg( lexwiz_settings ) ) );
        if( sme_lexwiz_current_arg( lexwiz_settings ).numG( num_args ) )
        {
          sme_li_relational_derive_relational_templates_method( self );
        }
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 118103L)
  public static SubLObject sme_li_relational_derive_relational_templates_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_relational_method = NIL;
    final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
      try
      {
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject arg_offsets = Sequences.reverse( sme_lexwiz_arg_offsets( lexwiz_settings ) );
        final SubLObject arg_speech_parts = Sequences.reverse( sme_lexwiz_arg_speech_parts( lexwiz_settings ) );
        final SubLObject sentence_words = sme_lexwiz_sentence_words( lexwiz_settings );
        thread.resetMultipleValues();
        final SubLObject parse_template = relation_lexifier.lexify_relation( v_term, arg_offsets, sentence_words, arg_speech_parts, UNPROVIDED, UNPROVIDED );
        final SubLObject new_generation_template = thread.secondMultipleValue();
        final SubLObject old_generation_template = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != $use_genformat_template$.getGlobalValue() )
        {
          lexification_wizard._csetf_lexwiz_template( lexwiz_parameters, conses_high.third( old_generation_template ) );
          lexification_wizard._csetf_lexwiz_template_args( lexwiz_parameters, PrintLow.format( NIL, $str717$_S, conses_high.fourth( old_generation_template ) ) );
        }
        else
        {
          lexification_wizard._csetf_lexwiz_template( lexwiz_parameters, new_generation_template );
          lexification_wizard._csetf_lexwiz_template_args( lexwiz_parameters, NIL );
        }
        lexification_wizard._csetf_lexwiz_parse_template_formula( lexwiz_parameters, parse_template );
        Dynamic.sublisp_throw( $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_settings( self, lexwiz_settings );
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_relational_method = Errors.handleThrowable( ccatch_env_var, $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_relational_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 119367L)
  public static SubLObject sme_li_post_general_initialize_method(final SubLObject self)
  {
    SubLObject sme_state = get_sme_lexification_interlocutor_sme_state( self );
    sme_lexification_interlocutor_initialize_method( self );
    sme_state = instances.get_slot( self, $sym103$SME_STATE );
    set_sme_lexification_interlocutor_sme_state( self, sme_state );
    methods.funcall_instance_method_with_1_args( sme_state, $sym254$SET_STATES, $list720 );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 120282L)
  public static SubLObject sme_li_post_general_ask_preferred_lexification_status_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_post_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject lex_term = lexification_utilities.string_for_fort( v_term );
        final SubLObject title = $str725$Checking_status_of_preferred_refe;
        final SubLObject v_question = PrintLow.format( NIL, $str726$Is___a__the_most_common_way_of_re, phrase, term_desc );
        final SubLObject other_phrases = Sequences.remove( phrase, list_utilities.remove_if_not( $sym727$STRINGP, lexification_utilities.lexified_phrases_for_term( v_term, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject tip = ( NIL != other_phrases ) ? PrintLow.format( NIL, $str728$Other_ways_of_referring_to__a_are, new SubLObject[] { lex_term, Characters.CHAR_tab, string_utilities.join_strings( other_phrases,
            $newline_tab$.getGlobalValue() )
        } ) : NIL;
        SubLObject skipP = lexification_utilities.is_relationalP( lexification_wizard.lexwiz_term( lexwiz_parameters ) );
        if( phrase.equalp( term_desc ) && NIL == other_phrases )
        {
          sme_lexification_interlocutor_set_answer_method( self, T );
          skipP = T;
        }
        if( NIL != skipP )
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        else
        {
          sme_lexification_interlocutor_ask_generic_boolean_method( self, title, v_question, tip, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_post_general_method = Errors.handleThrowable( ccatch_env_var, $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_post_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 122314L)
  public static SubLObject sme_li_post_general_check_preferred_lexification_status_method(final SubLObject self)
  {
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    if( NIL == lexification_utilities.is_relationalP( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
    {
      lexification_wizard._csetf_lexwiz_is_preferredP( lexwiz_parameters, sme_lexification_interlocutor_get_answer_method( self ) );
    }
    sme_lexification_interlocutor_next_interaction_method( self );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 122675L)
  public static SubLObject sme_li_post_general_do_lexification_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_post_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
      try
      {
        lexification_wizard.trace_lexification_parameters( lexwiz_parameters, UNPROVIDED );
        lexification_wizard.derive_lexification_formula( lexwiz_parameters );
        lexification_wizard.perform_lexification( lexwiz_parameters );
        final SubLObject title = $str736$Checking_results_of_lexification;
        final SubLObject error_in_lexificationP = string_utilities.non_empty_stringP( lexification_wizard.lexwiz_error_message( lexwiz_parameters ) );
        final SubLObject status = ( NIL != error_in_lexificationP ) ? $str737$Problem_processing_the_lexificati : $str738$Lexification_complete_;
        final SubLObject v_question = PrintLow.format( NIL, $str739$_a____Press_OK_to_proceed, status );
        final SubLObject choices = NIL;
        final SubLObject tip = ( NIL != error_in_lexificationP ) ? PrintLow.format( NIL, $str740$This_type_of_error_shouldn_t_occu, lexification_wizard.lexwiz_error_message( lexwiz_parameters ) ) : NIL;
        if( NIL != error_in_lexificationP )
        {
          sme_lexification_interlocutor_ask_generic_enumerated_method( self, title, v_question, choices, tip, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          sme_lexification_interlocutor_next_interaction_method( self );
        }
        Dynamic.sublisp_throw( $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_post_general_method = Errors.handleThrowable( ccatch_env_var, $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_post_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 123842L)
  public static SubLObject sme_li_post_general_check_lexification_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_li_post_general_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
      try
      {
        final SubLObject phrase = lexification_wizard.lexwiz_phrase( lexwiz_parameters );
        final SubLObject v_term = lexification_wizard.lexwiz_term( lexwiz_parameters );
        final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method( self, v_term );
        final SubLObject completion_message = PrintLow.format( NIL, $str745$Done_mapping_phrase__s_into_conce, phrase, term_desc );
        sme_lexification_interlocutor_mumble_method( self, completion_message );
        sme_lexification_interlocutor_next_interaction_method( self );
        Dynamic.sublisp_throw( $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_interlocutor_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_li_post_general_method = Errors.handleThrowable( ccatch_env_var, $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_li_post_general_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 124280L)
  public static SubLObject sme_lexification_wizard_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class( self );
    SubLObject proxy = get_sme_lexification_wizard_proxy( self );
    SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction( self );
    SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    SubLObject next_states = get_sme_lexification_wizard_next_states( self );
    SubLObject state = get_sme_lexification_wizard_state( self );
    object.object_initialize_method( self );
    lexification_wizard.init_lexification_wizard( UNPROVIDED );
    state = $kw748$GET_PRE_GENERAL;
    set_sme_lexification_wizard_state( self, state );
    next_states = $list749;
    set_sme_lexification_wizard_next_states( self, next_states );
    lexwiz_parameters = lexification_wizard.copy_lexification_parameters( lexification_wizard.$lexwiz_defaults$.getDynamicValue( thread ) );
    set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
    current_interaction = NIL;
    set_sme_lexification_wizard_current_interaction( self, current_interaction );
    new_current_interaction = NIL;
    set_sme_lexification_wizard_new_current_interaction( self, new_current_interaction );
    proxy = methods.funcall_class_method_with_0_args( $sym63$INTERFACE_PROXY, $sym212$NEW );
    set_sme_lexification_wizard_proxy( self, proxy );
    if( NIL != $use_blackboardP$.getGlobalValue() && NIL == rkf_sme_lexification_wizard.$simulated_blackboardP$.getGlobalValue() )
    {
      proxy = methods.funcall_class_method_with_0_args( $sym750$RKF_BB_PROXY, $sym212$NEW );
      set_sme_lexification_wizard_proxy( self, proxy );
    }
    question_answering_agent_class = $sym751$HTML_QUESTION_ANSWERING_AGENT;
    set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 125325L)
  public static SubLObject sme_lexification_wizard_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class( self );
    SubLObject proxy = get_sme_lexification_wizard_proxy( self );
    SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction( self );
    SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    SubLObject next_states = get_sme_lexification_wizard_next_states( self );
    SubLObject state = get_sme_lexification_wizard_state( self );
    try
    {
      thread.throwStack.push( $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        state = instances.get_slot( other, $sym98$STATE );
        next_states = instances.get_slot( other, $sym97$NEXT_STATES );
        lexwiz_parameters = lexification_wizard.copy_lexification_parameters( instances.get_slot( other, $sym96$LEXWIZ_PARAMETERS ) );
        current_interaction = instances.get_slot( other, $sym131$CURRENT_INTERACTION );
        new_current_interaction = instances.get_slot( other, $sym130$NEW_CURRENT_INTERACTION );
        proxy = instances.get_slot( other, $sym76$PROXY );
        question_answering_agent_class = instances.get_slot( other, $sym129$QUESTION_ANSWERING_AGENT_CLASS );
        Dynamic.sublisp_throw( $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
          set_sme_lexification_wizard_proxy( self, proxy );
          set_sme_lexification_wizard_new_current_interaction( self, new_current_interaction );
          set_sme_lexification_wizard_current_interaction( self, current_interaction );
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          set_sme_lexification_wizard_next_states( self, next_states );
          set_sme_lexification_wizard_state( self, state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 126048L)
  public static SubLObject sme_lexification_wizard_new_copy_method(final SubLObject self, final SubLObject other)
  {
    final SubLObject new_lexwiz = methods.funcall_class_method_with_0_args( $sym127$SME_LEXIFICATION_WIZARD, $sym212$NEW );
    methods.funcall_instance_method_with_1_args( new_lexwiz, $sym205$COPY, other );
    return new_lexwiz;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 126355L)
  public static SubLObject sme_lexification_wizard_set_term_method(final SubLObject self, final SubLObject new_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, new_term );
        }
        Dynamic.sublisp_throw( $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 126557L)
  public static SubLObject sme_lexification_wizard_get_term_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          Dynamic.sublisp_throw( $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_term( lexwiz_parameters ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 126738L)
  public static SubLObject sme_lexification_wizard_set_phrase_method(final SubLObject self, final SubLObject new_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, new_phrase );
        }
        Dynamic.sublisp_throw( $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 126956L)
  public static SubLObject sme_lexification_wizard_get_phrase_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          Dynamic.sublisp_throw( $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_phrase( lexwiz_parameters ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 127144L)
  public static SubLObject sme_lexification_wizard_set_mt_method(final SubLObject self, final SubLObject new_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_mt( lexwiz_parameters, new_mt );
        }
        Dynamic.sublisp_throw( $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 127342L)
  public static SubLObject sme_lexification_wizard_get_mt_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          Dynamic.sublisp_throw( $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_mt( lexwiz_parameters ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 127534L)
  public static SubLObject sme_lexification_wizard_set_lexical_mt_method(final SubLObject self, final SubLObject new_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_lexical_mt( lexwiz_parameters, misc_kb_utilities.fort_for_string( new_mt ) );
        }
        Dynamic.sublisp_throw( $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 127770L)
  public static SubLObject sme_lexification_wizard_set_parsing_mt_method(final SubLObject self, final SubLObject new_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_parse_template_mt( lexwiz_parameters, new_mt );
        }
        Dynamic.sublisp_throw( $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 128040L)
  public static SubLObject sme_lexification_wizard_set_generation_mt_method(final SubLObject self, final SubLObject new_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    try
    {
      thread.throwStack.push( $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != lexwiz_parameters )
        {
          lexification_wizard._csetf_lexwiz_generation_mt( lexwiz_parameters, new_mt );
        }
        Dynamic.sublisp_throw( $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 128319L)
  public static SubLObject sme_lexification_wizard_lexify_method(final SubLObject self, SubLObject v_term, SubLObject phrase, SubLObject mt)
  {
    if( v_term == UNPROVIDED )
    {
      v_term = NIL;
    }
    if( phrase == UNPROVIDED )
    {
      phrase = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class( self );
    final SubLObject proxy = get_sme_lexification_wizard_proxy( self );
    SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction( self );
    SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    if( NIL != v_term )
    {
      lexification_wizard._csetf_lexwiz_term( lexwiz_parameters, v_term );
    }
    if( NIL != phrase )
    {
      lexification_wizard._csetf_lexwiz_phrase( lexwiz_parameters, phrase );
    }
    if( NIL != mt )
    {
      lexification_wizard._csetf_lexwiz_mt( lexwiz_parameters, mt );
    }
    if( lexification_wizard.lexwiz_mt( lexwiz_parameters ).isString() )
    {
      lexification_wizard._csetf_lexwiz_mt( lexwiz_parameters, misc_kb_utilities.fort_for_string( lexification_wizard.lexwiz_mt( lexwiz_parameters ) ) );
    }
    current_interaction = methods.funcall_class_method_with_0_args( $sym107$SME_LI_PRE_GENERAL, $sym212$NEW );
    set_sme_lexification_wizard_current_interaction( self, current_interaction );
    new_current_interaction = current_interaction;
    set_sme_lexification_wizard_new_current_interaction( self, new_current_interaction );
    final SubLObject notification_fn = methods.resolve_method( $sym304$PROCESS_STATUS_UPDATE, $sym127$SME_LEXIFICATION_WIZARD );
    methods.funcall_instance_method_with_5_args( current_interaction, $sym295$INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 129441L)
  public static SubLObject sme_lexification_wizard_lexify_first_termstring_method(final SubLObject self, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject phrase = lexicon_utilities.first_termstring_phrase( v_term );
    return sme_lexification_wizard_lexify_method( self, v_term, phrase, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 129748L)
  public static SubLObject sme_lexification_wizard_continue_lexify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class( self );
    final SubLObject proxy = get_sme_lexification_wizard_proxy( self );
    SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction( self );
    SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    SubLObject next_states = get_sme_lexification_wizard_next_states( self );
    SubLObject state = get_sme_lexification_wizard_state( self );
    state = next_states.first();
    set_sme_lexification_wizard_state( self, state );
    next_states = next_states.rest();
    set_sme_lexification_wizard_next_states( self, next_states );
    final SubLObject notification_fn = methods.resolve_method( $sym304$PROCESS_STATUS_UPDATE, $sym127$SME_LEXIFICATION_WIZARD );
    SubLObject interaction_class = NIL;
    final SubLObject pcase_var = state;
    if( pcase_var.eql( $kw807$GET_SPECIFIC ) )
    {
      lexification_wizard._csetf_lexwiz_state( lexwiz_parameters, $kw808$NEED_INPUT );
      if( NIL != lexification_utilities.is_relationalP( lexification_wizard.lexwiz_term( lexwiz_parameters ) ) )
      {
        interaction_class = $sym119$SME_LI_RELATIONAL;
      }
      else if( NIL != lexification_wizard.lexwiz_is_properP( lexwiz_parameters ) )
      {
        interaction_class = $sym111$SME_LI_PROPER_NAME;
      }
      else
      {
        interaction_class = $sym115$SME_LI_DENOTATIONAL;
      }
      current_interaction = methods.funcall_class_method_with_0_args( interaction_class, $sym212$NEW );
      set_sme_lexification_wizard_current_interaction( self, current_interaction );
      new_current_interaction = current_interaction;
      set_sme_lexification_wizard_new_current_interaction( self, new_current_interaction );
      methods.funcall_instance_method_with_5_args( current_interaction, $sym295$INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class );
      lexification_wizard.trace_lexification_parameters( lexwiz_parameters, UNPROVIDED );
    }
    else if( pcase_var.eql( $kw809$GET_POST_GENERAL ) )
    {
      lexification_wizard._csetf_lexwiz_state( lexwiz_parameters, $kw314$DONE );
      current_interaction = methods.funcall_class_method_with_0_args( $sym123$SME_LI_POST_GENERAL, $sym212$NEW );
      set_sme_lexification_wizard_current_interaction( self, current_interaction );
      new_current_interaction = current_interaction;
      set_sme_lexification_wizard_new_current_interaction( self, new_current_interaction );
      methods.funcall_instance_method_with_5_args( current_interaction, $sym295$INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class );
    }
    else if( pcase_var.eql( $kw314$DONE ) )
    {
      if( NIL != proxy )
      {
        methods.funcall_instance_method_with_0_args( proxy, $sym219$END_SESSION );
      }
    }
    else if( NIL != state && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str810$Unexpected_state_keyword___a__ ), state );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 132082L)
  public static SubLObject sme_lexification_wizard_process_status_update_method(final SubLObject self, final SubLObject status, SubLObject server, SubLObject user_data)
  {
    if( server == UNPROVIDED )
    {
      server = NIL;
    }
    if( user_data == UNPROVIDED )
    {
      user_data = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str814$sme_lexwiz_process_status_update_, new SubLObject[] { status, server, user_data
      } );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( !server.eql( current_interaction ) && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ),
        lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str367$____assertion_failed___a______ ), $list815 );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( NIL != current_interaction )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str816$current_interaction___s__, current_interaction );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), current_interaction );
      sme_lexification_wizard_update_lexification_parameters_method( self );
    }
    final SubLObject use_cloneP = makeBoolean( NIL == $use_blackboardP$.getGlobalValue() );
    final SubLObject lexwiz_clone = ( NIL != use_cloneP ) ? methods.funcall_class_method_with_1_args( $sym127$SME_LEXIFICATION_WIZARD, $sym210$NEW_COPY, self ) : self;
    methods.funcall_instance_method_with_0_args( lexwiz_clone, $sym805$CONTINUE_LEXIFY );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 133297L)
  public static SubLObject sme_lexification_wizard_update_lexification_parameters_method(final SubLObject self)
  {
    final SubLObject current_interaction = get_sme_lexification_wizard_current_interaction( self );
    SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters( self );
    if( NIL != current_interaction )
    {
      final SubLObject revised_lexwiz_parameters = instances.get_slot( current_interaction, $sym96$LEXWIZ_PARAMETERS );
      lexification_wizard.trace_lexification_parameters( revised_lexwiz_parameters, UNPROVIDED );
      lexwiz_parameters = lexification_wizard.copy_lexification_parameters( revised_lexwiz_parameters );
      set_sme_lexification_wizard_lexwiz_parameters( self, lexwiz_parameters );
      instances.set_slot( current_interaction, $sym96$LEXWIZ_PARAMETERS, lexwiz_parameters );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 133900L)
  public static SubLObject rtp_parts_of_speech(final SubLObject words)
  {
    final SubLObject word_speech_parts = Mapping.mapcar( Symbols.symbol_function( $sym820$POS_OF_STRING ), words );
    final SubLObject all_speech_parts = Functions.apply( Symbols.symbol_function( $sym821$APPEND ), word_speech_parts );
    return Sequences.remove_duplicates( ConsesLow.cons( $const712$Noun, all_speech_parts ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 134593L)
  public static SubLObject rtp_phrase_parts_of_speech(final SubLObject phrase)
  {
    final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
    SubLObject speech_parts = NIL;
    if( NIL != lexicon_accessors.known_proper_noun_phraseP( phrase ) )
    {
      speech_parts = $list822;
    }
    else
    {
      if( NIL == phrase_words )
      {
        return NIL;
      }
      if( Sequences.length( phrase_words ).numE( ONE_INTEGER ) )
      {
        speech_parts = lexicon_accessors.pos_of_string( phrase_words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        final SubLObject first_word_speech_parts = lexicon_accessors.pos_of_string( phrase_words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == speech_parts )
        {
          SubLObject csome_list_var = first_word_speech_parts;
          SubLObject speech_part = NIL;
          speech_part = csome_list_var.first();
          while ( NIL == speech_parts && NIL != csome_list_var)
          {
            if( lexification_utilities.keyword_for_pos( speech_part, UNPROVIDED ) == $kw823$DET )
            {
              speech_parts = $list824;
            }
            csome_list_var = csome_list_var.rest();
            speech_part = csome_list_var.first();
          }
        }
        if( NIL == speech_parts )
        {
          speech_parts = lexicon_accessors.pos_of_string( list_utilities.last_one( phrase_words ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return Sequences.remove_duplicates( ConsesLow.cons( $const712$Noun, relation_lexifier.get_rtp_useful_speech_parts( speech_parts ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 136465L)
  public static SubLObject list_sme_lexification_settings(final SubLObject v_object, SubLObject include_idP)
  {
    if( include_idP == UNPROVIDED )
    {
      include_idP = NIL;
    }
    SubLObject settings = ConsesLow.list( new SubLObject[] { sme_lexwiz_is_abbreviationP( v_object ), sme_lexwiz_new_mappingP( v_object ), sme_lexwiz_okP( v_object ), sme_lexwiz_sample_sentence( v_object ),
      sme_lexwiz_sentence_words( v_object ), sme_lexwiz_sentence_args( v_object ), sme_lexwiz_arg_offsets( v_object ), sme_lexwiz_current_arg( v_object ), sme_lexwiz_arg_speech_parts( v_object ),
      sme_lexwiz_proper_sub_predicates( v_object )
    } );
    if( NIL != include_idP )
    {
      settings = ConsesLow.cons( v_object, settings );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 137491L)
  public static SubLObject copy_sme_lexification_settings(final SubLObject other)
  {
    final SubLObject v_new = make_sme_lexification_settings( UNPROVIDED );
    _csetf_sme_lexwiz_is_abbreviationP( v_new, sme_lexwiz_is_abbreviationP( other ) );
    _csetf_sme_lexwiz_new_mappingP( v_new, sme_lexwiz_new_mappingP( other ) );
    _csetf_sme_lexwiz_okP( v_new, sme_lexwiz_okP( other ) );
    _csetf_sme_lexwiz_sample_sentence( v_new, sme_lexwiz_sample_sentence( other ) );
    _csetf_sme_lexwiz_sentence_words( v_new, conses_high.copy_list( sme_lexwiz_sentence_words( other ) ) );
    _csetf_sme_lexwiz_sentence_args( v_new, conses_high.copy_list( sme_lexwiz_sentence_args( other ) ) );
    _csetf_sme_lexwiz_arg_offsets( v_new, conses_high.copy_list( sme_lexwiz_arg_offsets( other ) ) );
    _csetf_sme_lexwiz_current_arg( v_new, sme_lexwiz_current_arg( other ) );
    _csetf_sme_lexwiz_arg_speech_parts( v_new, sme_lexwiz_arg_speech_parts( other ) );
    _csetf_sme_lexwiz_proper_sub_predicates( v_new, sme_lexwiz_proper_sub_predicates( other ) );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 138505L)
  public static SubLObject trace_sme_lexification_settings(final SubLObject v_object, SubLObject debug_level)
  {
    if( debug_level == UNPROVIDED )
    {
      debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( debug_level ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str825$SME_Lexification_settings____S__, list_sme_lexification_settings( v_object, UNPROVIDED ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 138893L)
  public static SubLObject reset_sme_lexification_parameters()
  {
    lexification_wizard.reset_lexification_parameters( UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 139054L)
  public static SubLObject set_object_data(final SubLObject id, final SubLObject object_data)
  {
    return Hashtables.sethash( id, $sme_lexification_object_id_hash$.getGlobalValue(), object_data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 139237L)
  public static SubLObject get_object_data(final SubLObject id)
  {
    return Hashtables.gethash( id, $sme_lexification_object_id_hash$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 139411L)
  public static SubLObject init_proper_name_pred_choices()
  {
    determine_proper_name_pred_choices( NIL, T );
    determine_proper_name_pred_choices( NIL, NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 139768L)
  public static SubLObject determine_proper_name_pred_choices(final SubLObject v_term, SubLObject is_abbreviationP)
  {
    if( is_abbreviationP == UNPROVIDED )
    {
      is_abbreviationP = NIL;
    }
    final SubLObject all_abbreviation_preds = Mapping.mapcar( Symbols.symbol_function( $sym705$STRING_FOR_FORT ), lexification_utilities.get_abbreviation_predicates() );
    final SubLObject filtered_preds = Sequences.remove( $str528$nameString, lexification_wizard.filter_proper_name_predicates( v_term ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject abbreviation_preds = conses_high.intersection( all_abbreviation_preds, filtered_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject regular_preds = conses_high.set_difference( filtered_preds, abbreviation_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject preds_to_chose_from = ( NIL != is_abbreviationP ) ? abbreviation_preds : regular_preds;
    final SubLObject normal_name_text = PrintLow.format( NIL, $str826$A_normal__a, ( NIL != is_abbreviationP ) ? $str827$abbreviation : $str828$name );
    final SubLObject pre_choices = ConsesLow.list( normal_name_text, $str457$ );
    final SubLObject pre_predicates = ConsesLow.list( $str528$nameString, $str457$ );
    final SubLObject post_choices = $list829;
    final SubLObject post_predicates = $list830;
    final SubLObject default_offset = ZERO_INTEGER;
    SubLObject choices = NIL;
    SubLObject predicates = NIL;
    SubLObject cdolist_list_var = Sort.sort( preds_to_chose_from, Symbols.symbol_function( $sym833$STRING_ ), UNPROVIDED );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_desciption = lexification_utilities.lex_describe_term( lexification_utilities.lex_fort_for_string( pred ), UNPROVIDED );
      final SubLObject examples = list_utilities.remove_if_not( Symbols.symbol_function( $sym727$STRINGP ), lexification_utilities.examples_for_pred( lexification_utilities.lex_fort_for_string( pred ), UNPROVIDED ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject formatted_examples = PrintLow.format( NIL, $str831$_a___a, pred_desciption, string_utilities.join_strings( examples, $str832$__ ) );
      choices = ConsesLow.cons( formatted_examples, choices );
      predicates = ConsesLow.cons( pred, predicates );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    if( NIL != choices )
    {
      choices = ConsesLow.append( pre_choices, Sequences.reverse( choices ), post_choices );
      predicates = ConsesLow.append( pre_predicates, Sequences.reverse( predicates ), post_predicates );
    }
    return Values.values( choices, predicates, default_offset );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 141929L)
  public static SubLObject derive_part_of_speech_variations(final SubLObject phrase, final SubLObject headword_position, final SubLObject part_of_speech, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == headword_position || NIL == part_of_speech ) )
    {
      Errors.error( $str834$non_null_headword_position_and_pa );
    }
    SubLObject variations = NIL;
    final SubLObject phrase_words = lexification_utilities.lex_string_tokenize( phrase, NIL );
    final SubLObject headword = Sequences.elt( phrase_words, number_utilities.f_1_( headword_position ) );
    final SubLObject pos_keyword = lexification_utilities.precise_keyword_for_pos( part_of_speech, UNPROVIDED );
    if( NIL == headword && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str149$Warning__, $str835$Invalid_headword_position__a_for_ ), headword_position, phrase );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    SubLObject cdolist_list_var = lexicon_utilities.word_variants( headword, pos_keyword, T, NIL, lexical_mt );
    SubLObject headword_variant = NIL;
    headword_variant = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variant_words = list_utilities.replace_nth( number_utilities.f_1_( headword_position ), headword_variant, phrase_words );
      final SubLObject variation = lexification_utilities.join_words( variant_words );
      if( !variation.equalp( phrase ) )
      {
        final SubLObject item_var = variation;
        if( NIL == conses_high.member( item_var, variations, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          variations = ConsesLow.cons( item_var, variations );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      headword_variant = cdolist_list_var.first();
    }
    return variations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 143349L)
  public static SubLObject most_likely_headword_part_of_speech(final SubLObject headword, final SubLObject speech_parts)
  {
    SubLObject max_usage = ZERO_INTEGER;
    SubLObject most_common_speech_part = NIL;
    SubLObject cdolist_list_var = speech_parts;
    SubLObject speech_part = NIL;
    speech_part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject usage = lexification_utilities.wordform_part_of_speech_usage( headword, speech_part );
      if( usage.numG( max_usage ) )
      {
        most_common_speech_part = speech_part;
        max_usage = usage;
      }
      cdolist_list_var = cdolist_list_var.rest();
      speech_part = cdolist_list_var.first();
    }
    return most_common_speech_part;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 144140L)
  public static SubLObject init_sme_lexification_wizard()
  {
    if( NIL == $sme_lexwiz_initializedP$.getGlobalValue() )
    {
      init_proper_name_pred_choices();
      $sme_lexwiz_initializedP$.setGlobalValue( T );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 144521L)
  public static SubLObject class_name_from_object(final SubLObject v_object)
  {
    if( NIL != v_object )
    {
      return subloop_structures.class_name( subloop_structures.instance_class( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 144718L)
  public static SubLObject initialize_name_titles()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $known_name_titles$.setGlobalValue( NIL );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym565$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const566$EverythingPSC, thread );
      SubLObject cdolist_list_var = isa.all_fort_instances( $const837$Title, UNPROVIDED, UNPROVIDED );
      SubLObject title = NIL;
      title = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject title_desc = lexification_utilities.lex_describe_term( title, UNPROVIDED );
        final SubLObject item_var;
        title_desc = ( item_var = string_utilities.strip_trailer( title_desc, $str836$__title ) );
        if( NIL == conses_high.member( item_var, $known_name_titles$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $known_name_titles$.setGlobalValue( ConsesLow.cons( item_var, $known_name_titles$.getGlobalValue() ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        title = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_values_in_any_mt( $const838$SalutationMapping, $const839$codeMapping, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject title2 = NIL;
    title2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject item_var2 = title2;
      if( NIL == conses_high.member( item_var2, $known_name_titles$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $known_name_titles$.setGlobalValue( ConsesLow.cons( item_var2, $known_name_titles$.getGlobalValue() ) );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      title2 = cdolist_list_var2.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 145376L)
  public static SubLObject is_name_titleP(final SubLObject string)
  {
    if( NIL == $known_name_titles$.getGlobalValue() )
    {
      initialize_name_titles();
    }
    return subl_promotions.memberP( string, $known_name_titles$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 145688L)
  public static SubLObject has_family_name_firstP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject family_name_firstP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym565$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const566$EverythingPSC, thread );
      family_name_firstP = isa.isa_anyP( v_term, $family_name_first_groups$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return family_name_firstP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 146243L)
  public static SubLObject name_tokenize(final SubLObject string)
  {
    return Sequences.remove( $str457$, string_utilities.string_tokenize( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 146531L)
  public static SubLObject filter_abbreviation_predicates(final SubLObject v_term)
  {
    final SubLObject all_abbreviation_preds = Mapping.mapcar( Symbols.symbol_function( $sym705$STRING_FOR_FORT ), lexification_utilities.get_abbreviation_predicates() );
    final SubLObject filtered_preds = Sequences.remove( $str528$nameString, lexification_wizard.filter_proper_name_predicates( v_term ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject abbreviation_preds = conses_high.intersection( all_abbreviation_preds, filtered_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    return Mapping.mapcar( Symbols.symbol_function( $sym840$LEX_FORT_FOR_STRING ), abbreviation_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 147228L)
  public static SubLObject derive_initialism(final SubLObject phrase)
  {
    final SubLObject name_tokens = Sequences.remove_if( Symbols.symbol_function( $sym841$CLOSED_LEXICAL_CLASS_STRING_ ), name_tokenize( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject initialism = Strings.make_string( Sequences.length( name_tokens ), UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = name_tokens;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != list_utilities.lengthG( word, ZERO_INTEGER, UNPROVIDED ) )
      {
        Strings.set_char( initialism, i, Strings.sublisp_char( word, ZERO_INTEGER ) );
      }
    }
    return initialism;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 147798L)
  public static SubLObject lex_normalize_string(final SubLObject phrase)
  {
    if( phrase.isString() )
    {
      return string_utilities.trim_whitespace( string_utilities.unquote_string( phrase ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard.lisp", position = 148201L)
  public static SubLObject map_method(final SubLObject instance, final SubLObject method_name, final SubLObject input_list)
  {
    final SubLObject class_name = class_name_from_object( instance );
    final SubLObject method_fn = methods.resolve_method( method_name, class_name );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = input_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( Functions.funcall( method_fn, instance, item ), result );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_sme_lexification_wizard_file()
  {
    SubLFiles.declareFunction( me, "sme_lexwiz_use_blackboardP", "SME-LEXWIZ-USE-BLACKBOARD?", 0, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_title", "SME-LEXWIZ-TITLE", 0, 0, false );
    SubLFiles.declareFunction( me, "phrase_specification_tip", "PHRASE-SPECIFICATION-TIP", 0, 0, false );
    SubLFiles.declareFunction( me, "lex_describe_instance", "LEX-DESCRIBE-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_settings_print_function_trampoline", "SME-LEXIFICATION-SETTINGS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_settings_p", "SME-LEXIFICATION-SETTINGS-P", 1, 0, false );
    new $sme_lexification_settings_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sme_lexwiz_is_abbreviationP", "SME-LEXWIZ-IS-ABBREVIATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_new_mappingP", "SME-LEXWIZ-NEW-MAPPING?", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_okP", "SME-LEXWIZ-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_sample_sentence", "SME-LEXWIZ-SAMPLE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_sentence_words", "SME-LEXWIZ-SENTENCE-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_sentence_args", "SME-LEXWIZ-SENTENCE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_arg_offsets", "SME-LEXWIZ-ARG-OFFSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_current_arg", "SME-LEXWIZ-CURRENT-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_arg_speech_parts", "SME-LEXWIZ-ARG-SPEECH-PARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_proper_sub_predicates", "SME-LEXWIZ-PROPER-SUB-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_is_abbreviationP", "_CSETF-SME-LEXWIZ-IS-ABBREVIATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_new_mappingP", "_CSETF-SME-LEXWIZ-NEW-MAPPING?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_okP", "_CSETF-SME-LEXWIZ-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_sample_sentence", "_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_sentence_words", "_CSETF-SME-LEXWIZ-SENTENCE-WORDS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_sentence_args", "_CSETF-SME-LEXWIZ-SENTENCE-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_arg_offsets", "_CSETF-SME-LEXWIZ-ARG-OFFSETS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_current_arg", "_CSETF-SME-LEXWIZ-CURRENT-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_arg_speech_parts", "_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sme_lexwiz_proper_sub_predicates", "_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sme_lexification_settings", "MAKE-SME-LEXIFICATION-SETTINGS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sme_lexification_settings", "VISIT-DEFSTRUCT-SME-LEXIFICATION-SETTINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sme_lexification_settings_method", "VISIT-DEFSTRUCT-OBJECT-SME-LEXIFICATION-SETTINGS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_interface_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_interface_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_p", "INTERFACE-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_user_data", "GET-QUESTION-ANSWERING-AGENT-USER-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_user_data", "SET-QUESTION-ANSWERING-AGENT-USER-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_client_data", "GET-QUESTION-ANSWERING-AGENT-CLIENT-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_client_data", "SET-QUESTION-ANSWERING-AGENT-CLIENT-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_callback_function", "GET-QUESTION-ANSWERING-AGENT-CALLBACK-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_callback_function", "SET-QUESTION-ANSWERING-AGENT-CALLBACK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_proxy", "GET-QUESTION-ANSWERING-AGENT-PROXY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_proxy", "SET-QUESTION-ANSWERING-AGENT-PROXY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_field_labels", "GET-QUESTION-ANSWERING-AGENT-FIELD-LABELS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_field_labels", "SET-QUESTION-ANSWERING-AGENT-FIELD-LABELS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_field_width", "GET-QUESTION-ANSWERING-AGENT-FIELD-WIDTH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_field_width", "SET-QUESTION-ANSWERING-AGENT-FIELD-WIDTH", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_answer", "GET-QUESTION-ANSWERING-AGENT-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_answer", "SET-QUESTION-ANSWERING-AGENT-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_default", "GET-QUESTION-ANSWERING-AGENT-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_default", "SET-QUESTION-ANSWERING-AGENT-DEFAULT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_values", "GET-QUESTION-ANSWERING-AGENT-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_values", "SET-QUESTION-ANSWERING-AGENT-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_descriptions", "GET-QUESTION-ANSWERING-AGENT-DESCRIPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_descriptions", "SET-QUESTION-ANSWERING-AGENT-DESCRIPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_choices", "GET-QUESTION-ANSWERING-AGENT-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_choices", "SET-QUESTION-ANSWERING-AGENT-CHOICES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_error_message", "GET-QUESTION-ANSWERING-AGENT-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_error_message", "SET-QUESTION-ANSWERING-AGENT-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_question_type", "GET-QUESTION-ANSWERING-AGENT-QUESTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_question_type", "SET-QUESTION-ANSWERING-AGENT-QUESTION-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_tip", "GET-QUESTION-ANSWERING-AGENT-TIP", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_tip", "SET-QUESTION-ANSWERING-AGENT-TIP", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_question", "GET-QUESTION-ANSWERING-AGENT-QUESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_question", "SET-QUESTION-ANSWERING-AGENT-QUESTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_title", "GET-QUESTION-ANSWERING-AGENT-TITLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_title", "SET-QUESTION-ANSWERING-AGENT-TITLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answering_agent_id", "GET-QUESTION-ANSWERING-AGENT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answering_agent_id", "SET-QUESTION-ANSWERING-AGENT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_p", "QUESTION-ANSWERING-AGENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_interlocutor_agent", "GET-SME-LEXIFICATION-STATE-INTERLOCUTOR-AGENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_interlocutor_agent", "SET-SME-LEXIFICATION-STATE-INTERLOCUTOR-AGENT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_lexwiz_settings", "GET-SME-LEXIFICATION-STATE-LEXWIZ-SETTINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_lexwiz_settings", "SET-SME-LEXIFICATION-STATE-LEXWIZ-SETTINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_lexwiz_parameters", "GET-SME-LEXIFICATION-STATE-LEXWIZ-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_lexwiz_parameters", "SET-SME-LEXIFICATION-STATE-LEXWIZ-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_next_states", "GET-SME-LEXIFICATION-STATE-NEXT-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_next_states", "SET-SME-LEXIFICATION-STATE-NEXT-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_state", "GET-SME-LEXIFICATION-STATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_state", "SET-SME-LEXIFICATION-STATE-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_state_id", "GET-SME-LEXIFICATION-STATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_state_id", "SET-SME-LEXIFICATION-STATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_state_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_p", "SME-LEXIFICATION-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_user_data", "GET-SME-LEXIFICATION-INTERLOCUTOR-USER-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_user_data", "SET-SME-LEXIFICATION-INTERLOCUTOR-USER-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_client_data", "GET-SME-LEXIFICATION-INTERLOCUTOR-CLIENT-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_client_data", "SET-SME-LEXIFICATION-INTERLOCUTOR-CLIENT-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_callback_function", "GET-SME-LEXIFICATION-INTERLOCUTOR-CALLBACK-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_callback_function", "SET-SME-LEXIFICATION-INTERLOCUTOR-CALLBACK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_proxy", "GET-SME-LEXIFICATION-INTERLOCUTOR-PROXY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_proxy", "SET-SME-LEXIFICATION-INTERLOCUTOR-PROXY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_sme_state", "GET-SME-LEXIFICATION-INTERLOCUTOR-SME-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_sme_state", "SET-SME-LEXIFICATION-INTERLOCUTOR-SME-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_lexwiz_settings", "GET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-SETTINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_lexwiz_settings", "SET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-SETTINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_lexwiz_parameters", "GET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_lexwiz_parameters", "SET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_interlocutor_previous_id", "GET-SME-LEXIFICATION-INTERLOCUTOR-PREVIOUS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_interlocutor_previous_id", "SET-SME-LEXIFICATION-INTERLOCUTOR-PREVIOUS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_interlocutor_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_interlocutor_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_p", "SME-LEXIFICATION-INTERLOCUTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_pre_general_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_pre_general_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_p", "SME-LI-PRE-GENERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_proper_name_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_proper_name_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_p", "SME-LI-PROPER-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_denotational_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_denotational_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_p", "SME-LI-DENOTATIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_relational_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_relational_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_p", "SME-LI-RELATIONAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_post_general_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_li_post_general_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_p", "SME-LI-POST-GENERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_question_answering_agent_class", "GET-SME-LEXIFICATION-WIZARD-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_question_answering_agent_class", "SET-SME-LEXIFICATION-WIZARD-QUESTION-ANSWERING-AGENT-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_proxy", "GET-SME-LEXIFICATION-WIZARD-PROXY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_proxy", "SET-SME-LEXIFICATION-WIZARD-PROXY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_new_current_interaction", "GET-SME-LEXIFICATION-WIZARD-NEW-CURRENT-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_new_current_interaction", "SET-SME-LEXIFICATION-WIZARD-NEW-CURRENT-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_current_interaction", "GET-SME-LEXIFICATION-WIZARD-CURRENT-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_current_interaction", "SET-SME-LEXIFICATION-WIZARD-CURRENT-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_lexwiz_parameters", "GET-SME-LEXIFICATION-WIZARD-LEXWIZ-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_lexwiz_parameters", "SET-SME-LEXIFICATION-WIZARD-LEXWIZ-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_next_states", "GET-SME-LEXIFICATION-WIZARD-NEXT-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_next_states", "SET-SME-LEXIFICATION-WIZARD-NEXT-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sme_lexification_wizard_state", "GET-SME-LEXIFICATION-WIZARD-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sme_lexification_wizard_state", "SET-SME-LEXIFICATION-WIZARD-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_p", "SME-LEXIFICATION-WIZARD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_initialize_method", "QUESTION-ANSWERING-AGENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_set_question_method", "QUESTION-ANSWERING-AGENT-SET-QUESTION-METHOD", 2, 3, false );
    SubLFiles.declareFunction( me, "question_answering_agent_display_question_method", "QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_get_response_method", "QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_validate_response_method", "QUESTION-ANSWERING-AGENT-VALIDATE-RESPONSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_set_callback_function_method", "QUESTION-ANSWERING-AGENT-SET-CALLBACK-FUNCTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_set_client_data_method", "QUESTION-ANSWERING-AGENT-SET-CLIENT-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_set_user_data_method", "QUESTION-ANSWERING-AGENT-SET-USER-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_set_proxy_method", "QUESTION-ANSWERING-AGENT-SET-PROXY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_notify_client_method", "QUESTION-ANSWERING-AGENT-NOTIFY-CLIENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_positive_choice_method", "QUESTION-ANSWERING-AGENT-POSITIVE-CHOICE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_negative_choice_method", "QUESTION-ANSWERING-AGENT-NEGATIVE-CHOICE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_copy_method", "QUESTION-ANSWERING-AGENT-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answering_agent_new_copy_method", "QUESTION-ANSWERING-AGENT-NEW-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_initialize_method", "INTERFACE-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_init_session_method", "INTERFACE-PROXY-INIT-SESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_end_session_method", "INTERFACE-PROXY-END-SESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_create_constant_method", "INTERFACE-PROXY-CREATE-CONSTANT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_describe_term_method", "INTERFACE-PROXY-DESCRIBE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_resolve_term_method", "INTERFACE-PROXY-RESOLVE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_mumble_method", "INTERFACE-PROXY-MUMBLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_proxy_forge_aheadP_method", "INTERFACE-PROXY-FORGE-AHEAD?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sme_lexification_id", "NEW-SME-LEXIFICATION-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_initialize_method", "SME-LEXIFICATION-STATE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_copy_method", "SME-LEXIFICATION-STATE-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_get_id_method", "SME-LEXIFICATION-STATE-GET-ID-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_set_states_method", "SME-LEXIFICATION-STATE-SET-STATES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_get_states_method", "SME-LEXIFICATION-STATE-GET-STATES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_current_state_method", "SME-LEXIFICATION-STATE-CURRENT-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_current_settings_method", "SME-LEXIFICATION-STATE-CURRENT-SETTINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_advance_method", "SME-LEXIFICATION-STATE-ADVANCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_new_copy_method", "SME-LEXIFICATION-STATE-NEW-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_list_values_method", "SME-LEXIFICATION-STATE-LIST-VALUES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_state_trace_values_method", "SME-LEXIFICATION-STATE-TRACE-VALUES-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_initialize_method", "SME-LEXIFICATION-INTERLOCUTOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_doneP_method", "SME-LEXIFICATION-INTERLOCUTOR-DONE?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_initiate_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-INITIATE-INTERACTION-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_update_notification_info_method", "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-NOTIFICATION-INFO-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_next_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-NEXT-INTERACTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_end_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-END-INTERACTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_reset_state_method", "SME-LEXIFICATION-INTERLOCUTOR-RESET-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_process_status_update_method", "SME-LEXIFICATION-INTERLOCUTOR-PROCESS-STATUS-UPDATE-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_ask_generic_boolean_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-BOOLEAN-METHOD", 3, 2, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_ask_generic_enumerated_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-ENUMERATED-METHOD", 4, 3, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_ask_generic_multiple_selection_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-SELECTION-METHOD", 4, 3, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_ask_generic_free_form_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-FREE-FORM-METHOD", 3, 3, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_ask_generic_multiple_free_form_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-FREE-FORM-METHOD", 3, 5, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_display_question_method", "SME-LEXIFICATION-INTERLOCUTOR-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_get_answer_method", "SME-LEXIFICATION-INTERLOCUTOR-GET-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_set_answer_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_get_interlocutor_agent_method", "SME-LEXIFICATION-INTERLOCUTOR-GET-INTERLOCUTOR-AGENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_set_interlocutor_agent_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-INTERLOCUTOR-AGENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_set_default_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-DEFAULT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_check_generic_method", "SME-LEXIFICATION-INTERLOCUTOR-CHECK-GENERIC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_set_callback_function_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-CALLBACK-FUNCTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_set_proxy_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-PROXY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_notify_client_method", "SME-LEXIFICATION-INTERLOCUTOR-NOTIFY-CLIENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_mumble_method", "SME-LEXIFICATION-INTERLOCUTOR-MUMBLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_forge_aheadP_method", "SME-LEXIFICATION-INTERLOCUTOR-FORGE-AHEAD?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_phrase_denotations_method", "SME-LEXIFICATION-INTERLOCUTOR-PHRASE-DENOTATIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_describe_term_method", "SME-LEXIFICATION-INTERLOCUTOR-DESCRIBE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_interlocutor_update_lexification_parameters_method", "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-LEXIFICATION-PARAMETERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_initialize_method", "SME-LI-PRE-GENERAL-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_do_initialization_method", "SME-LI-PRE-GENERAL-DO-INITIALIZATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_initialization_method", "SME-LI-PRE-GENERAL-CHECK-INITIALIZATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_ask_term_method", "SME-LI-PRE-GENERAL-ASK-TERM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_term_method", "SME-LI-PRE-GENERAL-CHECK-TERM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_resolve_term_method", "SME-LI-PRE-GENERAL-RESOLVE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_ask_term_selection_method", "SME-LI-PRE-GENERAL-ASK-TERM-SELECTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_term_selection_method", "SME-LI-PRE-GENERAL-CHECK-TERM-SELECTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_ask_phrase_method", "SME-LI-PRE-GENERAL-ASK-PHRASE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_phrase_method", "SME-LI-PRE-GENERAL-CHECK-PHRASE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_ask_ambiguity_method", "SME-LI-PRE-GENERAL-ASK-AMBIGUITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_ambiguity_method", "SME-LI-PRE-GENERAL-CHECK-AMBIGUITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_ask_proper_name_status_method", "SME-LI-PRE-GENERAL-ASK-PROPER-NAME-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_pre_general_check_proper_name_status_method", "SME-LI-PRE-GENERAL-CHECK-PROPER-NAME-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_initialize_method", "SME-LI-PROPER-NAME-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_ask_abbreviation_status_method", "SME-LI-PROPER-NAME-ASK-ABBREVIATION-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_check_abbreviation_status_method", "SME-LI-PROPER-NAME-CHECK-ABBREVIATION-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_ask_predicate_type_method", "SME-LI-PROPER-NAME-ASK-PREDICATE-TYPE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_check_predicate_type_method", "SME-LI-PROPER-NAME-CHECK-PREDICATE-TYPE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_ask_refined_predication_method", "SME-LI-PROPER-NAME-ASK-REFINED-PREDICATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_check_refined_predication_method", "SME-LI-PROPER-NAME-CHECK-REFINED-PREDICATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_proper_name_infer_proper_name_sub_predications_method", "SME-LI-PROPER-NAME-INFER-PROPER-NAME-SUB-PREDICATIONS-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "name_abbreviationP", "NAME-ABBREVIATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_initialize_method", "SME-LI-DENOTATIONAL-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_guess_headword_position_method", "SME-LI-DENOTATIONAL-GUESS-HEADWORD-POSITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_check_guessed_headword_position_method", "SME-LI-DENOTATIONAL-CHECK-GUESSED-HEADWORD-POSITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_ask_headword_position_method", "SME-LI-DENOTATIONAL-ASK-HEADWORD-POSITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_check_headword_position_method", "SME-LI-DENOTATIONAL-CHECK-HEADWORD-POSITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_ask_part_of_speech_method", "SME-LI-DENOTATIONAL-ASK-PART-OF-SPEECH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_check_part_of_speech_method", "SME-LI-DENOTATIONAL-CHECK-PART-OF-SPEECH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_show_headword_variations_method", "SME-LI-DENOTATIONAL-SHOW-HEADWORD-VARIATIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_check_headword_variations_method", "SME-LI-DENOTATIONAL-CHECK-HEADWORD-VARIATIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_add_lexical_mapping_method", "SME-LI-DENOTATIONAL-ADD-LEXICAL-MAPPING-METHOD", 3, 2, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_remove_lexical_mapping_method", "SME-LI-DENOTATIONAL-REMOVE-LEXICAL-MAPPING-METHOD", 3, 2, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_do_lexical_mapping_method", "SME-LI-DENOTATIONAL-DO-LEXICAL-MAPPING-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_derive_part_of_speech_examples_method", "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLES-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_derive_part_of_speech_example_method", "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLE-METHOD", 5, 1, false );
    SubLFiles.declareFunction( me, "sme_li_inflected_verb_to_infinitive", "SME-LI-INFLECTED-VERB-TO-INFINITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_denotational_disable_speech_part_selection_method", "SME-LI-DENOTATIONAL-DISABLE-SPEECH-PART-SELECTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "sme_li_relational_initialize_method", "SME-LI-RELATIONAL-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_initiate_interaction_method", "SME-LI-RELATIONAL-INITIATE-INTERACTION-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_ask_sample_sentence_method", "SME-LI-RELATIONAL-ASK-SAMPLE-SENTENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_check_sample_sentence_method", "SME-LI-RELATIONAL-CHECK-SAMPLE-SENTENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_ask_argument_values_method", "SME-LI-RELATIONAL-ASK-ARGUMENT-VALUES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_check_argument_values_method", "SME-LI-RELATIONAL-CHECK-ARGUMENT-VALUES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_ask_argument_part_of_speech_method", "SME-LI-RELATIONAL-ASK-ARGUMENT-PART-OF-SPEECH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_check_argument_part_of_speech_method", "SME-LI-RELATIONAL-CHECK-ARGUMENT-PART-OF-SPEECH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_relational_derive_relational_templates_method", "SME-LI-RELATIONAL-DERIVE-RELATIONAL-TEMPLATES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_initialize_method", "SME-LI-POST-GENERAL-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_ask_preferred_lexification_status_method", "SME-LI-POST-GENERAL-ASK-PREFERRED-LEXIFICATION-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_check_preferred_lexification_status_method", "SME-LI-POST-GENERAL-CHECK-PREFERRED-LEXIFICATION-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_do_lexification_method", "SME-LI-POST-GENERAL-DO-LEXIFICATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_li_post_general_check_lexification_method", "SME-LI-POST-GENERAL-CHECK-LEXIFICATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_initialize_method", "SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_copy_method", "SME-LEXIFICATION-WIZARD-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_new_copy_method", "SME-LEXIFICATION-WIZARD-NEW-COPY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_term_method", "SME-LEXIFICATION-WIZARD-SET-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_get_term_method", "SME-LEXIFICATION-WIZARD-GET-TERM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_phrase_method", "SME-LEXIFICATION-WIZARD-SET-PHRASE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_get_phrase_method", "SME-LEXIFICATION-WIZARD-GET-PHRASE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_mt_method", "SME-LEXIFICATION-WIZARD-SET-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_get_mt_method", "SME-LEXIFICATION-WIZARD-GET-MT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_lexical_mt_method", "SME-LEXIFICATION-WIZARD-SET-LEXICAL-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_parsing_mt_method", "SME-LEXIFICATION-WIZARD-SET-PARSING-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_set_generation_mt_method", "SME-LEXIFICATION-WIZARD-SET-GENERATION-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_lexify_method", "SME-LEXIFICATION-WIZARD-LEXIFY-METHOD", 1, 3, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_lexify_first_termstring_method", "SME-LEXIFICATION-WIZARD-LEXIFY-FIRST-TERMSTRING-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_continue_lexify_method", "SME-LEXIFICATION-WIZARD-CONTINUE-LEXIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_process_status_update_method", "SME-LEXIFICATION-WIZARD-PROCESS-STATUS-UPDATE-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "sme_lexification_wizard_update_lexification_parameters_method", "SME-LEXIFICATION-WIZARD-UPDATE-LEXIFICATION-PARAMETERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_parts_of_speech", "RTP-PARTS-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_phrase_parts_of_speech", "RTP-PHRASE-PARTS-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "list_sme_lexification_settings", "LIST-SME-LEXIFICATION-SETTINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "copy_sme_lexification_settings", "COPY-SME-LEXIFICATION-SETTINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "trace_sme_lexification_settings", "TRACE-SME-LEXIFICATION-SETTINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "reset_sme_lexification_parameters", "RESET-SME-LEXIFICATION-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "set_object_data", "SET-OBJECT-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_data", "GET-OBJECT-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "init_proper_name_pred_choices", "INIT-PROPER-NAME-PRED-CHOICES", 0, 0, false );
    SubLFiles.declareFunction( me, "determine_proper_name_pred_choices", "DETERMINE-PROPER-NAME-PRED-CHOICES", 1, 1, false );
    SubLFiles.declareFunction( me, "derive_part_of_speech_variations", "DERIVE-PART-OF-SPEECH-VARIATIONS", 3, 1, false );
    SubLFiles.declareFunction( me, "most_likely_headword_part_of_speech", "MOST-LIKELY-HEADWORD-PART-OF-SPEECH", 2, 0, false );
    SubLFiles.declareFunction( me, "init_sme_lexification_wizard", "INIT-SME-LEXIFICATION-WIZARD", 0, 0, false );
    SubLFiles.declareFunction( me, "class_name_from_object", "CLASS-NAME-FROM-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_name_titles", "INITIALIZE-NAME-TITLES", 0, 0, false );
    SubLFiles.declareFunction( me, "is_name_titleP", "IS-NAME-TITLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "has_family_name_firstP", "HAS-FAMILY-NAME-FIRST?", 1, 0, false );
    SubLFiles.declareFunction( me, "name_tokenize", "NAME-TOKENIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_abbreviation_predicates", "FILTER-ABBREVIATION-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "derive_initialism", "DERIVE-INITIALISM", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_normalize_string", "LEX-NORMALIZE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "map_method", "MAP-METHOD", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_sme_lexification_wizard_file()
  {
    $sme_lexification_object_id_hash$ = SubLFiles.deflexical( "*SME-LEXIFICATION-OBJECT-ID-HASH*", maybeDefault( $sym0$_SME_LEXIFICATION_OBJECT_ID_HASH_, $sme_lexification_object_id_hash$, () -> ( Hashtables
        .make_hash_table( $int1$25, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $sme_lexwiz_initializedP$ = SubLFiles.deflexical( "*SME-LEXWIZ-INITIALIZED?*", ( maybeDefault( $sym2$_SME_LEXWIZ_INITIALIZED__, $sme_lexwiz_initializedP$, NIL ) ) );
    $sme_forge_aheadP$ = SubLFiles.deflexical( "*SME-FORGE-AHEAD?*", NIL );
    $verify_beforehandP$ = SubLFiles.deflexical( "*VERIFY-BEFOREHAND?*", T );
    $use_inferred_phrasesP$ = SubLFiles.deflexical( "*USE-INFERRED-PHRASES?*", NIL );
    $use_blackboardP$ = SubLFiles.deflexical( "*USE-BLACKBOARD?*", NIL );
    $newline_tab$ = SubLFiles.defconstant( "*NEWLINE-TAB*", PrintLow.format( NIL, $str3$_a_a, Characters.CHAR_newline, Characters.CHAR_tab ) );
    $sme_parts_of_speech$ = SubLFiles.deflexical( "*SME-PARTS-OF-SPEECH*", $list4 );
    $next_sme_lexification_id$ = SubLFiles.deflexical( "*NEXT-SME-LEXIFICATION-ID*", ( maybeDefault( $sym5$_NEXT_SME_LEXIFICATION_ID_, $next_sme_lexification_id$, ZERO_INTEGER ) ) );
    $use_genformat_template$ = SubLFiles.deflexical( "*USE-GENFORMAT-TEMPLATE*", NIL );
    $lexwiz_person_sub_predicates$ = SubLFiles.deflexical( "*LEXWIZ-PERSON-SUB-PREDICATES*", $list6 );
    $known_name_titles$ = SubLFiles.deflexical( "*KNOWN-NAME-TITLES*", ( maybeDefault( $sym7$_KNOWN_NAME_TITLES_, $known_name_titles$, NIL ) ) );
    $family_name_first_groups$ = SubLFiles.deflexical( "*FAMILY-NAME-FIRST-GROUPS*", $list8 );
    $lexwiz_abbreviation_check_min_words$ = SubLFiles.deflexical( "*LEXWIZ-ABBREVIATION-CHECK-MIN-WORDS*", FOUR_INTEGER );
    $sme_lexwiz_title$ = SubLFiles.deflexical( "*SME-LEXWIZ-TITLE*", $str9$Dictionary_Assistant );
    $lexwiz_welcome_message$ = SubLFiles.deflexical( "*LEXWIZ-WELCOME-MESSAGE*", $str10$Welcome_to_the_Subject_Matter_Exp );
    $lexwiz_initialization_tip$ = SubLFiles.deflexical( "*LEXWIZ-INITIALIZATION-TIP*", $str11$The_initialization_may_take_sever );
    $phrase_specification_tip$ = SubLFiles.deflexical( "*PHRASE-SPECIFICATION-TIP*", $str12$Choose_a_phrase_that_clearly_dist );
    $proper_name_status_tip$ = SubLFiles.deflexical( "*PROPER-NAME-STATUS-TIP*", $str13$Normally__capitalized_phrases_are );
    $headword_selection_tip$ = SubLFiles.deflexical( "*HEADWORD-SELECTION-TIP*", $str14$examples____video_sports_game____ );
    $headword_guessing_tip$ = SubLFiles.deflexical( "*HEADWORD-GUESSING-TIP*", $str15$The_headword_is_the_word_that_is_ );
    $sample_sentence_tip$ = SubLFiles.deflexical( "*SAMPLE-SENTENCE-TIP*", $str16$The_sentence_should_be_general_en );
    $argument_part_of_speech_tip$ = SubLFiles.deflexical( "*ARGUMENT-PART-OF-SPEECH-TIP*", $str17$The_choices_for_the_phrasal_part_ );
    $dtp_sme_lexification_settings$ = SubLFiles.defconstant( "*DTP-SME-LEXIFICATION-SETTINGS*", $sym18$SME_LEXIFICATION_SETTINGS );
    return NIL;
  }

  public static SubLObject setup_sme_lexification_wizard_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SME_LEXIFICATION_OBJECT_ID_HASH_ );
    subl_macro_promotions.declare_defglobal( $sym2$_SME_LEXWIZ_INITIALIZED__ );
    subl_macro_promotions.declare_defglobal( $sym5$_NEXT_SME_LEXIFICATION_ID_ );
    subl_macro_promotions.declare_defglobal( $sym7$_KNOWN_NAME_TITLES_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sme_lexification_settings$.getGlobalValue(), Symbols.symbol_function(
        $sym25$SME_LEXIFICATION_SETTINGS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list26 );
    Structures.def_csetf( $sym27$SME_LEXWIZ_IS_ABBREVIATION_, $sym28$_CSETF_SME_LEXWIZ_IS_ABBREVIATION_ );
    Structures.def_csetf( $sym29$SME_LEXWIZ_NEW_MAPPING_, $sym30$_CSETF_SME_LEXWIZ_NEW_MAPPING_ );
    Structures.def_csetf( $sym31$SME_LEXWIZ_OK_, $sym32$_CSETF_SME_LEXWIZ_OK_ );
    Structures.def_csetf( $sym33$SME_LEXWIZ_SAMPLE_SENTENCE, $sym34$_CSETF_SME_LEXWIZ_SAMPLE_SENTENCE );
    Structures.def_csetf( $sym35$SME_LEXWIZ_SENTENCE_WORDS, $sym36$_CSETF_SME_LEXWIZ_SENTENCE_WORDS );
    Structures.def_csetf( $sym37$SME_LEXWIZ_SENTENCE_ARGS, $sym38$_CSETF_SME_LEXWIZ_SENTENCE_ARGS );
    Structures.def_csetf( $sym39$SME_LEXWIZ_ARG_OFFSETS, $sym40$_CSETF_SME_LEXWIZ_ARG_OFFSETS );
    Structures.def_csetf( $sym41$SME_LEXWIZ_CURRENT_ARG, $sym42$_CSETF_SME_LEXWIZ_CURRENT_ARG );
    Structures.def_csetf( $sym43$SME_LEXWIZ_ARG_SPEECH_PARTS, $sym44$_CSETF_SME_LEXWIZ_ARG_SPEECH_PARTS );
    Structures.def_csetf( $sym45$SME_LEXWIZ_PROPER_SUB_PREDICATES, $sym46$_CSETF_SME_LEXWIZ_PROPER_SUB_PREDICATES );
    Equality.identity( $sym18$SME_LEXIFICATION_SETTINGS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sme_lexification_settings$.getGlobalValue(), Symbols.symbol_function(
        $sym62$VISIT_DEFSTRUCT_OBJECT_SME_LEXIFICATION_SETTINGS_METHOD ) );
    classes.subloop_new_class( $sym63$INTERFACE_PROXY, $sym64$OBJECT, NIL, NIL, $list65 );
    classes.class_set_implements_slot_listeners( $sym63$INTERFACE_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym63$INTERFACE_PROXY, $sym67$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym63$INTERFACE_PROXY, $sym70$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_INSTANCE );
    subloop_reserved_initialize_interface_proxy_class( $sym63$INTERFACE_PROXY );
    classes.subloop_new_class( $sym71$QUESTION_ANSWERING_AGENT, $sym64$OBJECT, NIL, NIL, $list72 );
    classes.class_set_implements_slot_listeners( $sym71$QUESTION_ANSWERING_AGENT, NIL );
    classes.subloop_note_class_initialization_function( $sym71$QUESTION_ANSWERING_AGENT, $sym90$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym71$QUESTION_ANSWERING_AGENT, $sym91$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_INSTANCE );
    subloop_reserved_initialize_question_answering_agent_class( $sym71$QUESTION_ANSWERING_AGENT );
    classes.subloop_new_class( $sym92$SME_LEXIFICATION_STATE, $sym64$OBJECT, NIL, NIL, $list93 );
    classes.class_set_implements_slot_listeners( $sym92$SME_LEXIFICATION_STATE, NIL );
    classes.subloop_note_class_initialization_function( $sym92$SME_LEXIFICATION_STATE, $sym99$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym92$SME_LEXIFICATION_STATE, $sym100$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_INSTANCE );
    subloop_reserved_initialize_sme_lexification_state_class( $sym92$SME_LEXIFICATION_STATE );
    classes.subloop_new_class( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym64$OBJECT, NIL, NIL, $list102 );
    classes.class_set_implements_slot_listeners( $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL );
    classes.subloop_note_class_initialization_function( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym105$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym106$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_INSTANC );
    subloop_reserved_initialize_sme_lexification_interlocutor_class( $sym101$SME_LEXIFICATION_INTERLOCUTOR );
    classes.subloop_new_class( $sym107$SME_LI_PRE_GENERAL, $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list108 );
    classes.class_set_implements_slot_listeners( $sym107$SME_LI_PRE_GENERAL, NIL );
    classes.subloop_note_class_initialization_function( $sym107$SME_LI_PRE_GENERAL, $sym109$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_CLASS );
    classes.subloop_note_instance_initialization_function( $sym107$SME_LI_PRE_GENERAL, $sym110$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_INSTANCE );
    subloop_reserved_initialize_sme_li_pre_general_class( $sym107$SME_LI_PRE_GENERAL );
    classes.subloop_new_class( $sym111$SME_LI_PROPER_NAME, $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list112 );
    classes.class_set_implements_slot_listeners( $sym111$SME_LI_PROPER_NAME, NIL );
    classes.subloop_note_class_initialization_function( $sym111$SME_LI_PROPER_NAME, $sym113$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_CLASS );
    classes.subloop_note_instance_initialization_function( $sym111$SME_LI_PROPER_NAME, $sym114$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_INSTANCE );
    subloop_reserved_initialize_sme_li_proper_name_class( $sym111$SME_LI_PROPER_NAME );
    classes.subloop_new_class( $sym115$SME_LI_DENOTATIONAL, $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list116 );
    classes.class_set_implements_slot_listeners( $sym115$SME_LI_DENOTATIONAL, NIL );
    classes.subloop_note_class_initialization_function( $sym115$SME_LI_DENOTATIONAL, $sym117$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_CLASS );
    classes.subloop_note_instance_initialization_function( $sym115$SME_LI_DENOTATIONAL, $sym118$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_INSTANCE );
    subloop_reserved_initialize_sme_li_denotational_class( $sym115$SME_LI_DENOTATIONAL );
    classes.subloop_new_class( $sym119$SME_LI_RELATIONAL, $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list120 );
    classes.class_set_implements_slot_listeners( $sym119$SME_LI_RELATIONAL, NIL );
    classes.subloop_note_class_initialization_function( $sym119$SME_LI_RELATIONAL, $sym121$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_CLASS );
    classes.subloop_note_instance_initialization_function( $sym119$SME_LI_RELATIONAL, $sym122$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_INSTANCE );
    subloop_reserved_initialize_sme_li_relational_class( $sym119$SME_LI_RELATIONAL );
    classes.subloop_new_class( $sym123$SME_LI_POST_GENERAL, $sym101$SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list124 );
    classes.class_set_implements_slot_listeners( $sym123$SME_LI_POST_GENERAL, NIL );
    classes.subloop_note_class_initialization_function( $sym123$SME_LI_POST_GENERAL, $sym125$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_CLASS );
    classes.subloop_note_instance_initialization_function( $sym123$SME_LI_POST_GENERAL, $sym126$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_INSTANCE );
    subloop_reserved_initialize_sme_li_post_general_class( $sym123$SME_LI_POST_GENERAL );
    classes.subloop_new_class( $sym127$SME_LEXIFICATION_WIZARD, $sym64$OBJECT, NIL, NIL, $list128 );
    classes.class_set_implements_slot_listeners( $sym127$SME_LEXIFICATION_WIZARD, NIL );
    classes.subloop_note_class_initialization_function( $sym127$SME_LEXIFICATION_WIZARD, $sym132$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym127$SME_LEXIFICATION_WIZARD, $sym133$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_INSTANCE );
    subloop_reserved_initialize_sme_lexification_wizard_class( $sym127$SME_LEXIFICATION_WIZARD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym71$QUESTION_ANSWERING_AGENT, $list135, NIL, $list136 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym134$INITIALIZE, $sym138$QUESTION_ANSWERING_AGENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym139$SET_QUESTION, $sym71$QUESTION_ANSWERING_AGENT, $list140, $list141, $list142 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym139$SET_QUESTION, $sym146$QUESTION_ANSWERING_AGENT_SET_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym147$DISPLAY_QUESTION, $sym71$QUESTION_ANSWERING_AGENT, $list140, NIL, $list148 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym147$DISPLAY_QUESTION, $sym151$QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym152$GET_RESPONSE, $sym71$QUESTION_ANSWERING_AGENT, $list140, NIL, $list153 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym152$GET_RESPONSE, $sym155$QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym156$VALIDATE_RESPONSE, $sym71$QUESTION_ANSWERING_AGENT, $list157, NIL, $list158 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym156$VALIDATE_RESPONSE, $sym171$QUESTION_ANSWERING_AGENT_VALIDATE_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym172$SET_CALLBACK_FUNCTION, $sym71$QUESTION_ANSWERING_AGENT, $list140, $list173, $list174 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym172$SET_CALLBACK_FUNCTION, $sym176$QUESTION_ANSWERING_AGENT_SET_CALLBACK_FUNCTION_METHOD );
    methods.methods_incorporate_instance_method( $sym177$SET_CLIENT_DATA, $sym71$QUESTION_ANSWERING_AGENT, $list140, $list178, $list179 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym177$SET_CLIENT_DATA, $sym181$QUESTION_ANSWERING_AGENT_SET_CLIENT_DATA_METHOD );
    methods.methods_incorporate_instance_method( $sym182$SET_USER_DATA, $sym71$QUESTION_ANSWERING_AGENT, $list140, $list183, $list184 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym182$SET_USER_DATA, $sym186$QUESTION_ANSWERING_AGENT_SET_USER_DATA_METHOD );
    methods.methods_incorporate_instance_method( $sym187$SET_PROXY, $sym71$QUESTION_ANSWERING_AGENT, $list140, $list188, $list189 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym187$SET_PROXY, $sym191$QUESTION_ANSWERING_AGENT_SET_PROXY_METHOD );
    methods.methods_incorporate_instance_method( $sym169$NOTIFY_CLIENT, $sym71$QUESTION_ANSWERING_AGENT, $list135, $list192, $list193 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym169$NOTIFY_CLIENT, $sym196$QUESTION_ANSWERING_AGENT_NOTIFY_CLIENT_METHOD );
    methods.methods_incorporate_instance_method( $sym197$POSITIVE_CHOICE, $sym71$QUESTION_ANSWERING_AGENT, $list135, NIL, $list198 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym197$POSITIVE_CHOICE, $sym200$QUESTION_ANSWERING_AGENT_POSITIVE_CHOICE_METHOD );
    methods.methods_incorporate_instance_method( $sym201$NEGATIVE_CHOICE, $sym71$QUESTION_ANSWERING_AGENT, $list135, NIL, $list202 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym201$NEGATIVE_CHOICE, $sym204$QUESTION_ANSWERING_AGENT_NEGATIVE_CHOICE_METHOD );
    methods.methods_incorporate_instance_method( $sym205$COPY, $sym71$QUESTION_ANSWERING_AGENT, $list135, $list206, $list207 );
    methods.subloop_register_instance_method( $sym71$QUESTION_ANSWERING_AGENT, $sym205$COPY, $sym209$QUESTION_ANSWERING_AGENT_COPY_METHOD );
    methods.methods_incorporate_class_method( $sym210$NEW_COPY, $sym71$QUESTION_ANSWERING_AGENT, $list135, $list206, $list211 );
    methods.subloop_register_class_method( $sym71$QUESTION_ANSWERING_AGENT, $sym210$NEW_COPY, $sym213$QUESTION_ANSWERING_AGENT_NEW_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym63$INTERFACE_PROXY, $list135, NIL, $list214 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym134$INITIALIZE, $sym215$INTERFACE_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym216$INIT_SESSION, $sym63$INTERFACE_PROXY, $list135, NIL, $list217 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym216$INIT_SESSION, $sym218$INTERFACE_PROXY_INIT_SESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym219$END_SESSION, $sym63$INTERFACE_PROXY, $list135, NIL, $list220 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym219$END_SESSION, $sym221$INTERFACE_PROXY_END_SESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym222$CREATE_CONSTANT, $sym63$INTERFACE_PROXY, $list135, $list223, $list224 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym222$CREATE_CONSTANT, $sym225$INTERFACE_PROXY_CREATE_CONSTANT_METHOD );
    methods.methods_incorporate_instance_method( $sym226$DESCRIBE_TERM, $sym63$INTERFACE_PROXY, $list135, $list227, $list228 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym226$DESCRIBE_TERM, $sym229$INTERFACE_PROXY_DESCRIBE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym230$RESOLVE_TERM, $sym63$INTERFACE_PROXY, $list135, $list231, $list232 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym230$RESOLVE_TERM, $sym235$INTERFACE_PROXY_RESOLVE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym236$MUMBLE, $sym63$INTERFACE_PROXY, $list140, $list237, $list238 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym236$MUMBLE, $sym240$INTERFACE_PROXY_MUMBLE_METHOD );
    methods.methods_incorporate_instance_method( $sym241$FORGE_AHEAD_, $sym63$INTERFACE_PROXY, $list140, NIL, $list242 );
    methods.subloop_register_instance_method( $sym63$INTERFACE_PROXY, $sym241$FORGE_AHEAD_, $sym243$INTERFACE_PROXY_FORGE_AHEAD__METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list244 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym134$INITIALIZE, $sym246$SME_LEXIFICATION_STATE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym205$COPY, $sym92$SME_LEXIFICATION_STATE, $list135, $list206, $list247 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym205$COPY, $sym249$SME_LEXIFICATION_STATE_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym250$GET_ID, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list251 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym250$GET_ID, $sym253$SME_LEXIFICATION_STATE_GET_ID_METHOD );
    methods.methods_incorporate_instance_method( $sym254$SET_STATES, $sym92$SME_LEXIFICATION_STATE, $list135, $list255, $list256 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym254$SET_STATES, $sym258$SME_LEXIFICATION_STATE_SET_STATES_METHOD );
    methods.methods_incorporate_instance_method( $sym259$GET_STATES, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list260 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym259$GET_STATES, $sym262$SME_LEXIFICATION_STATE_GET_STATES_METHOD );
    methods.methods_incorporate_instance_method( $sym263$CURRENT_STATE, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list264 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym263$CURRENT_STATE, $sym266$SME_LEXIFICATION_STATE_CURRENT_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym267$CURRENT_SETTINGS, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list268 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym267$CURRENT_SETTINGS, $sym270$SME_LEXIFICATION_STATE_CURRENT_SETTINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym271$ADVANCE, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list272 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym271$ADVANCE, $sym274$SME_LEXIFICATION_STATE_ADVANCE_METHOD );
    methods.methods_incorporate_class_method( $sym210$NEW_COPY, $sym92$SME_LEXIFICATION_STATE, $list135, $list206, $list275 );
    methods.subloop_register_class_method( $sym92$SME_LEXIFICATION_STATE, $sym210$NEW_COPY, $sym276$SME_LEXIFICATION_STATE_NEW_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym277$LIST_VALUES, $sym92$SME_LEXIFICATION_STATE, $list135, NIL, $list278 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym277$LIST_VALUES, $sym280$SME_LEXIFICATION_STATE_LIST_VALUES_METHOD );
    methods.methods_incorporate_instance_method( $sym281$TRACE_VALUES, $sym92$SME_LEXIFICATION_STATE, $list135, $list282, $list283 );
    methods.subloop_register_instance_method( $sym92$SME_LEXIFICATION_STATE, $sym281$TRACE_VALUES, $sym287$SME_LEXIFICATION_STATE_TRACE_VALUES_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list288, NIL, $list289 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym134$INITIALIZE, $sym290$SME_LEXIFICATION_INTERLOCUTOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym291$DONE_, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list292 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym291$DONE_, $sym294$SME_LEXIFICATION_INTERLOCUTOR_DONE__METHOD );
    methods.methods_incorporate_instance_method( $sym295$INITIATE_INTERACTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, $list296, $list297 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym295$INITIATE_INTERACTION, $sym301$SME_LEXIFICATION_INTERLOCUTOR_INITIATE_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym302$UPDATE_NOTIFICATION_INFO, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, NIL, $list303 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym302$UPDATE_NOTIFICATION_INFO, $sym305$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_NOTIFICATION_INFO_METHOD );
    methods.methods_incorporate_instance_method( $sym300$NEXT_INTERACTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, NIL, $list306 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym300$NEXT_INTERACTION, $sym311$SME_LEXIFICATION_INTERLOCUTOR_NEXT_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym312$END_INTERACTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list313 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym312$END_INTERACTION, $sym315$SME_LEXIFICATION_INTERLOCUTOR_END_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym316$RESET_STATE, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, $list317, $list318 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym316$RESET_STATE, $sym325$SME_LEXIFICATION_INTERLOCUTOR_RESET_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym304$PROCESS_STATUS_UPDATE, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, $list326, $list327 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym304$PROCESS_STATUS_UPDATE, $sym333$SME_LEXIFICATION_INTERLOCUTOR_PROCESS_STATUS_UPDATE_METHOD );
    methods.methods_incorporate_instance_method( $sym334$ASK_GENERIC_BOOLEAN, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list335, $list336 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym334$ASK_GENERIC_BOOLEAN, $sym337$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_BOOLEAN_METHOD );
    methods.methods_incorporate_instance_method( $sym338$ASK_GENERIC_ENUMERATED, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list339, $list340 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym338$ASK_GENERIC_ENUMERATED, $sym341$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_ENUMERATED_METHOD );
    methods.methods_incorporate_instance_method( $sym342$ASK_GENERIC_MULTIPLE_SELECTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list343, $list344 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym342$ASK_GENERIC_MULTIPLE_SELECTION, $sym345$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_SELECTION_METH );
    methods.methods_incorporate_instance_method( $sym346$ASK_GENERIC_FREE_FORM, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list347, $list348 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym346$ASK_GENERIC_FREE_FORM, $sym349$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_FREE_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym350$ASK_GENERIC_MULTIPLE_FREE_FORM, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list351, $list352 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym350$ASK_GENERIC_MULTIPLE_FREE_FORM, $sym353$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_FREE_FORM_METH );
    methods.methods_incorporate_instance_method( $sym147$DISPLAY_QUESTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list354 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym147$DISPLAY_QUESTION, $sym356$SME_LEXIFICATION_INTERLOCUTOR_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym357$GET_ANSWER, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list358 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym357$GET_ANSWER, $sym359$SME_LEXIFICATION_INTERLOCUTOR_GET_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym360$SET_ANSWER, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list361, $list362 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym360$SET_ANSWER, $sym363$SME_LEXIFICATION_INTERLOCUTOR_SET_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym364$GET_INTERLOCUTOR_AGENT, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list365 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym364$GET_INTERLOCUTOR_AGENT, $sym368$SME_LEXIFICATION_INTERLOCUTOR_GET_INTERLOCUTOR_AGENT_METHOD );
    methods.methods_incorporate_instance_method( $sym369$SET_INTERLOCUTOR_AGENT, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list135, $list370, $list371 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym369$SET_INTERLOCUTOR_AGENT, $sym373$SME_LEXIFICATION_INTERLOCUTOR_SET_INTERLOCUTOR_AGENT_METHOD );
    methods.methods_incorporate_instance_method( $sym374$SET_DEFAULT, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list135, $list375, $list376 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym374$SET_DEFAULT, $sym377$SME_LEXIFICATION_INTERLOCUTOR_SET_DEFAULT_METHOD );
    methods.methods_incorporate_instance_method( $sym378$CHECK_GENERIC, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list157, $list379, $list380 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym378$CHECK_GENERIC, $sym383$SME_LEXIFICATION_INTERLOCUTOR_CHECK_GENERIC_METHOD );
    methods.methods_incorporate_instance_method( $sym172$SET_CALLBACK_FUNCTION, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list173, $list174 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym172$SET_CALLBACK_FUNCTION, $sym385$SME_LEXIFICATION_INTERLOCUTOR_SET_CALLBACK_FUNCTION_METHOD );
    methods.methods_incorporate_instance_method( $sym187$SET_PROXY, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list188, $list189 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym187$SET_PROXY, $sym387$SME_LEXIFICATION_INTERLOCUTOR_SET_PROXY_METHOD );
    methods.methods_incorporate_instance_method( $sym169$NOTIFY_CLIENT, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list192, $list388 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym169$NOTIFY_CLIENT, $sym390$SME_LEXIFICATION_INTERLOCUTOR_NOTIFY_CLIENT_METHOD );
    methods.methods_incorporate_instance_method( $sym236$MUMBLE, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list237, $list391 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym236$MUMBLE, $sym393$SME_LEXIFICATION_INTERLOCUTOR_MUMBLE_METHOD );
    methods.methods_incorporate_instance_method( $sym241$FORGE_AHEAD_, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list394 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym241$FORGE_AHEAD_, $sym396$SME_LEXIFICATION_INTERLOCUTOR_FORGE_AHEAD__METHOD );
    methods.methods_incorporate_instance_method( $sym397$PHRASE_DENOTATIONS, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list398, $list399 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym397$PHRASE_DENOTATIONS, $sym401$SME_LEXIFICATION_INTERLOCUTOR_PHRASE_DENOTATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym226$DESCRIBE_TERM, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list140, $list227, $list402 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym226$DESCRIBE_TERM, $sym404$SME_LEXIFICATION_INTERLOCUTOR_DESCRIBE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym405$UPDATE_LEXIFICATION_PARAMETERS, $sym101$SME_LEXIFICATION_INTERLOCUTOR, $list288, NIL, $list406 );
    methods.subloop_register_instance_method( $sym101$SME_LEXIFICATION_INTERLOCUTOR, $sym405$UPDATE_LEXIFICATION_PARAMETERS, $sym407$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_LEXIFICATION_PARAMETERS_METH );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym107$SME_LI_PRE_GENERAL, $list288, NIL, $list408 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym134$INITIALIZE, $sym410$SME_LI_PRE_GENERAL_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym411$DO_INITIALIZATION, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list412 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym411$DO_INITIALIZATION, $sym416$SME_LI_PRE_GENERAL_DO_INITIALIZATION_METHOD );
    methods.methods_incorporate_instance_method( $sym417$CHECK_INITIALIZATION, $sym107$SME_LI_PRE_GENERAL, $list157, NIL, $list418 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym417$CHECK_INITIALIZATION, $sym419$SME_LI_PRE_GENERAL_CHECK_INITIALIZATION_METHOD );
    methods.methods_incorporate_instance_method( $sym420$ASK_TERM, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list421 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym420$ASK_TERM, $sym427$SME_LI_PRE_GENERAL_ASK_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym428$CHECK_TERM, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list429 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym428$CHECK_TERM, $sym433$SME_LI_PRE_GENERAL_CHECK_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym230$RESOLVE_TERM, $sym107$SME_LI_PRE_GENERAL, $list140, $list231, $list434 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym230$RESOLVE_TERM, $sym436$SME_LI_PRE_GENERAL_RESOLVE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym437$ASK_TERM_SELECTION, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list438 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym437$ASK_TERM_SELECTION, $sym445$SME_LI_PRE_GENERAL_ASK_TERM_SELECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym446$CHECK_TERM_SELECTION, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list447 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym446$CHECK_TERM_SELECTION, $sym450$SME_LI_PRE_GENERAL_CHECK_TERM_SELECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym451$ASK_PHRASE, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list452 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym451$ASK_PHRASE, $sym458$SME_LI_PRE_GENERAL_ASK_PHRASE_METHOD );
    methods.methods_incorporate_instance_method( $sym459$CHECK_PHRASE, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list460 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym459$CHECK_PHRASE, $sym464$SME_LI_PRE_GENERAL_CHECK_PHRASE_METHOD );
    methods.methods_incorporate_instance_method( $sym465$ASK_AMBIGUITY, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list466 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym465$ASK_AMBIGUITY, $sym470$SME_LI_PRE_GENERAL_ASK_AMBIGUITY_METHOD );
    methods.methods_incorporate_instance_method( $sym471$CHECK_AMBIGUITY, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list472 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym471$CHECK_AMBIGUITY, $sym475$SME_LI_PRE_GENERAL_CHECK_AMBIGUITY_METHOD );
    methods.methods_incorporate_instance_method( $sym476$ASK_PROPER_NAME_STATUS, $sym107$SME_LI_PRE_GENERAL, $list140, NIL, $list477 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym476$ASK_PROPER_NAME_STATUS, $sym485$SME_LI_PRE_GENERAL_ASK_PROPER_NAME_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym486$CHECK_PROPER_NAME_STATUS, $sym107$SME_LI_PRE_GENERAL, $list157, NIL, $list487 );
    methods.subloop_register_instance_method( $sym107$SME_LI_PRE_GENERAL, $sym486$CHECK_PROPER_NAME_STATUS, $sym488$SME_LI_PRE_GENERAL_CHECK_PROPER_NAME_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym111$SME_LI_PROPER_NAME, $list288, NIL, $list489 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym134$INITIALIZE, $sym491$SME_LI_PROPER_NAME_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym492$ASK_ABBREVIATION_STATUS, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list493 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym492$ASK_ABBREVIATION_STATUS, $sym501$SME_LI_PROPER_NAME_ASK_ABBREVIATION_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym502$CHECK_ABBREVIATION_STATUS, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list503 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym502$CHECK_ABBREVIATION_STATUS, $sym505$SME_LI_PROPER_NAME_CHECK_ABBREVIATION_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym506$ASK_PREDICATE_TYPE, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list507 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym506$ASK_PREDICATE_TYPE, $sym515$SME_LI_PROPER_NAME_ASK_PREDICATE_TYPE_METHOD );
    methods.methods_incorporate_instance_method( $sym516$CHECK_PREDICATE_TYPE, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list517 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym516$CHECK_PREDICATE_TYPE, $sym520$SME_LI_PROPER_NAME_CHECK_PREDICATE_TYPE_METHOD );
    methods.methods_incorporate_instance_method( $sym521$ASK_REFINED_PREDICATION, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list522 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym521$ASK_REFINED_PREDICATION, $sym532$SME_LI_PROPER_NAME_ASK_REFINED_PREDICATION_METHOD );
    methods.methods_incorporate_instance_method( $sym533$CHECK_REFINED_PREDICATION, $sym111$SME_LI_PROPER_NAME, $list140, NIL, $list534 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym533$CHECK_REFINED_PREDICATION, $sym536$SME_LI_PROPER_NAME_CHECK_REFINED_PREDICATION_METHOD );
    methods.methods_incorporate_instance_method( $sym537$INFER_PROPER_NAME_SUB_PREDICATIONS, $sym111$SME_LI_PROPER_NAME, $list140, $list538, $list539 );
    methods.subloop_register_instance_method( $sym111$SME_LI_PROPER_NAME, $sym537$INFER_PROPER_NAME_SUB_PREDICATIONS, $sym556$SME_LI_PROPER_NAME_INFER_PROPER_NAME_SUB_PREDICATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym115$SME_LI_DENOTATIONAL, $list288, NIL, $list557 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym134$INITIALIZE, $sym559$SME_LI_DENOTATIONAL_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym560$GUESS_HEADWORD_POSITION, $sym115$SME_LI_DENOTATIONAL, $list140, NIL, $list561 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym560$GUESS_HEADWORD_POSITION, $sym568$SME_LI_DENOTATIONAL_GUESS_HEADWORD_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym569$CHECK_GUESSED_HEADWORD_POSITION, $sym115$SME_LI_DENOTATIONAL, $list157, NIL, $list570 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym569$CHECK_GUESSED_HEADWORD_POSITION, $sym571$SME_LI_DENOTATIONAL_CHECK_GUESSED_HEADWORD_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym572$ASK_HEADWORD_POSITION, $sym115$SME_LI_DENOTATIONAL, $list140, NIL, $list573 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym572$ASK_HEADWORD_POSITION, $sym578$SME_LI_DENOTATIONAL_ASK_HEADWORD_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym579$CHECK_HEADWORD_POSITION, $sym115$SME_LI_DENOTATIONAL, $list157, NIL, $list580 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym579$CHECK_HEADWORD_POSITION, $sym584$SME_LI_DENOTATIONAL_CHECK_HEADWORD_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym585$ASK_PART_OF_SPEECH, $sym115$SME_LI_DENOTATIONAL, $list140, NIL, $list586 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym585$ASK_PART_OF_SPEECH, $sym592$SME_LI_DENOTATIONAL_ASK_PART_OF_SPEECH_METHOD );
    methods.methods_incorporate_instance_method( $sym593$CHECK_PART_OF_SPEECH, $sym115$SME_LI_DENOTATIONAL, $list140, NIL, $list594 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym593$CHECK_PART_OF_SPEECH, $sym599$SME_LI_DENOTATIONAL_CHECK_PART_OF_SPEECH_METHOD );
    methods.methods_incorporate_instance_method( $sym600$SHOW_HEADWORD_VARIATIONS, $sym115$SME_LI_DENOTATIONAL, $list140, NIL, $list601 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym600$SHOW_HEADWORD_VARIATIONS, $sym608$SME_LI_DENOTATIONAL_SHOW_HEADWORD_VARIATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym609$CHECK_HEADWORD_VARIATIONS, $sym115$SME_LI_DENOTATIONAL, $list157, NIL, $list610 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym609$CHECK_HEADWORD_VARIATIONS, $sym612$SME_LI_DENOTATIONAL_CHECK_HEADWORD_VARIATIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym613$ADD_LEXICAL_MAPPING, $sym115$SME_LI_DENOTATIONAL, $list157, $list614, $list615 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym613$ADD_LEXICAL_MAPPING, $sym618$SME_LI_DENOTATIONAL_ADD_LEXICAL_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym619$REMOVE_LEXICAL_MAPPING, $sym115$SME_LI_DENOTATIONAL, $list157, $list614, $list620 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym619$REMOVE_LEXICAL_MAPPING, $sym621$SME_LI_DENOTATIONAL_REMOVE_LEXICAL_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym622$DO_LEXICAL_MAPPING, $sym115$SME_LI_DENOTATIONAL, $list157, $list623, $list624 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym622$DO_LEXICAL_MAPPING, $sym625$SME_LI_DENOTATIONAL_DO_LEXICAL_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym626$DERIVE_PART_OF_SPEECH_EXAMPLES, $sym115$SME_LI_DENOTATIONAL, $list140, $list627, $list628 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym626$DERIVE_PART_OF_SPEECH_EXAMPLES, $sym629$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLES_METHOD );
    methods.methods_incorporate_instance_method( $sym630$DERIVE_PART_OF_SPEECH_EXAMPLE, $sym115$SME_LI_DENOTATIONAL, $list140, $list631, $list632 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym630$DERIVE_PART_OF_SPEECH_EXAMPLE, $sym656$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLE_METHOD );
    methods.methods_incorporate_instance_method( $sym658$DISABLE_SPEECH_PART_SELECTION, $sym115$SME_LI_DENOTATIONAL, $list140, $list659, $list660 );
    methods.subloop_register_instance_method( $sym115$SME_LI_DENOTATIONAL, $sym658$DISABLE_SPEECH_PART_SELECTION, $sym669$SME_LI_DENOTATIONAL_DISABLE_SPEECH_PART_SELECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym119$SME_LI_RELATIONAL, $list288, NIL, $list214 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym134$INITIALIZE, $sym670$SME_LI_RELATIONAL_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym295$INITIATE_INTERACTION, $sym119$SME_LI_RELATIONAL, $list157, $list671, $list672 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym295$INITIATE_INTERACTION, $sym678$SME_LI_RELATIONAL_INITIATE_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym679$ASK_SAMPLE_SENTENCE, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list680 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym679$ASK_SAMPLE_SENTENCE, $sym686$SME_LI_RELATIONAL_ASK_SAMPLE_SENTENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym687$CHECK_SAMPLE_SENTENCE, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list688 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym687$CHECK_SAMPLE_SENTENCE, $sym690$SME_LI_RELATIONAL_CHECK_SAMPLE_SENTENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym691$ASK_ARGUMENT_VALUES, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list692 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym691$ASK_ARGUMENT_VALUES, $sym696$SME_LI_RELATIONAL_ASK_ARGUMENT_VALUES_METHOD );
    methods.methods_incorporate_instance_method( $sym697$CHECK_ARGUMENT_VALUES, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list698 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym697$CHECK_ARGUMENT_VALUES, $sym701$SME_LI_RELATIONAL_CHECK_ARGUMENT_VALUES_METHOD );
    methods.methods_incorporate_instance_method( $sym702$ASK_ARGUMENT_PART_OF_SPEECH, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list703 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym702$ASK_ARGUMENT_PART_OF_SPEECH, $sym708$SME_LI_RELATIONAL_ASK_ARGUMENT_PART_OF_SPEECH_METHOD );
    methods.methods_incorporate_instance_method( $sym709$CHECK_ARGUMENT_PART_OF_SPEECH, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list710 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym709$CHECK_ARGUMENT_PART_OF_SPEECH, $sym713$SME_LI_RELATIONAL_CHECK_ARGUMENT_PART_OF_SPEECH_METHOD );
    methods.methods_incorporate_instance_method( $sym714$DERIVE_RELATIONAL_TEMPLATES, $sym119$SME_LI_RELATIONAL, $list140, NIL, $list715 );
    methods.subloop_register_instance_method( $sym119$SME_LI_RELATIONAL, $sym714$DERIVE_RELATIONAL_TEMPLATES, $sym718$SME_LI_RELATIONAL_DERIVE_RELATIONAL_TEMPLATES_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym123$SME_LI_POST_GENERAL, $list288, NIL, $list719 );
    methods.subloop_register_instance_method( $sym123$SME_LI_POST_GENERAL, $sym134$INITIALIZE, $sym721$SME_LI_POST_GENERAL_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym722$ASK_PREFERRED_LEXIFICATION_STATUS, $sym123$SME_LI_POST_GENERAL, $list140, NIL, $list723 );
    methods.subloop_register_instance_method( $sym123$SME_LI_POST_GENERAL, $sym722$ASK_PREFERRED_LEXIFICATION_STATUS, $sym729$SME_LI_POST_GENERAL_ASK_PREFERRED_LEXIFICATION_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym730$CHECK_PREFERRED_LEXIFICATION_STATUS, $sym123$SME_LI_POST_GENERAL, $list157, NIL, $list731 );
    methods.subloop_register_instance_method( $sym123$SME_LI_POST_GENERAL, $sym730$CHECK_PREFERRED_LEXIFICATION_STATUS, $sym732$SME_LI_POST_GENERAL_CHECK_PREFERRED_LEXIFICATION_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym733$DO_LEXIFICATION, $sym123$SME_LI_POST_GENERAL, $list140, NIL, $list734 );
    methods.subloop_register_instance_method( $sym123$SME_LI_POST_GENERAL, $sym733$DO_LEXIFICATION, $sym741$SME_LI_POST_GENERAL_DO_LEXIFICATION_METHOD );
    methods.methods_incorporate_instance_method( $sym742$CHECK_LEXIFICATION, $sym123$SME_LI_POST_GENERAL, $list140, NIL, $list743 );
    methods.subloop_register_instance_method( $sym123$SME_LI_POST_GENERAL, $sym742$CHECK_LEXIFICATION, $sym746$SME_LI_POST_GENERAL_CHECK_LEXIFICATION_METHOD );
    methods.methods_incorporate_instance_method( $sym134$INITIALIZE, $sym127$SME_LEXIFICATION_WIZARD, $list288, NIL, $list747 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym134$INITIALIZE, $sym752$SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym205$COPY, $sym127$SME_LEXIFICATION_WIZARD, $list135, $list206, $list753 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym205$COPY, $sym755$SME_LEXIFICATION_WIZARD_COPY_METHOD );
    methods.methods_incorporate_class_method( $sym210$NEW_COPY, $sym127$SME_LEXIFICATION_WIZARD, $list135, $list206, $list756 );
    methods.subloop_register_class_method( $sym127$SME_LEXIFICATION_WIZARD, $sym210$NEW_COPY, $sym757$SME_LEXIFICATION_WIZARD_NEW_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym758$SET_TERM, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list759, $list760 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym758$SET_TERM, $sym762$SME_LEXIFICATION_WIZARD_SET_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym763$GET_TERM, $sym127$SME_LEXIFICATION_WIZARD, $list140, NIL, $list764 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym763$GET_TERM, $sym766$SME_LEXIFICATION_WIZARD_GET_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym767$SET_PHRASE, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list768, $list769 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym767$SET_PHRASE, $sym771$SME_LEXIFICATION_WIZARD_SET_PHRASE_METHOD );
    methods.methods_incorporate_instance_method( $sym772$GET_PHRASE, $sym127$SME_LEXIFICATION_WIZARD, $list140, NIL, $list773 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym772$GET_PHRASE, $sym775$SME_LEXIFICATION_WIZARD_GET_PHRASE_METHOD );
    methods.methods_incorporate_instance_method( $sym776$SET_MT, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list777, $list778 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym776$SET_MT, $sym780$SME_LEXIFICATION_WIZARD_SET_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym781$GET_MT, $sym127$SME_LEXIFICATION_WIZARD, $list140, NIL, $list782 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym781$GET_MT, $sym784$SME_LEXIFICATION_WIZARD_GET_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym785$SET_LEXICAL_MT, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list777, $list786 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym785$SET_LEXICAL_MT, $sym788$SME_LEXIFICATION_WIZARD_SET_LEXICAL_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym789$SET_PARSING_MT, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list777, $list790 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym789$SET_PARSING_MT, $sym792$SME_LEXIFICATION_WIZARD_SET_PARSING_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym793$SET_GENERATION_MT, $sym127$SME_LEXIFICATION_WIZARD, $list140, $list777, $list794 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym793$SET_GENERATION_MT, $sym796$SME_LEXIFICATION_WIZARD_SET_GENERATION_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym797$LEXIFY, $sym127$SME_LEXIFICATION_WIZARD, $list288, $list798, $list799 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym797$LEXIFY, $sym800$SME_LEXIFICATION_WIZARD_LEXIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym801$LEXIFY_FIRST_TERMSTRING, $sym127$SME_LEXIFICATION_WIZARD, $list288, $list802, $list803 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym801$LEXIFY_FIRST_TERMSTRING, $sym804$SME_LEXIFICATION_WIZARD_LEXIFY_FIRST_TERMSTRING_METHOD );
    methods.methods_incorporate_instance_method( $sym805$CONTINUE_LEXIFY, $sym127$SME_LEXIFICATION_WIZARD, $list288, NIL, $list806 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym805$CONTINUE_LEXIFY, $sym811$SME_LEXIFICATION_WIZARD_CONTINUE_LEXIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym304$PROCESS_STATUS_UPDATE, $sym127$SME_LEXIFICATION_WIZARD, $list288, $list812, $list813 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym304$PROCESS_STATUS_UPDATE, $sym817$SME_LEXIFICATION_WIZARD_PROCESS_STATUS_UPDATE_METHOD );
    methods.methods_incorporate_instance_method( $sym405$UPDATE_LEXIFICATION_PARAMETERS, $sym127$SME_LEXIFICATION_WIZARD, $list288, NIL, $list818 );
    methods.subloop_register_instance_method( $sym127$SME_LEXIFICATION_WIZARD, $sym405$UPDATE_LEXIFICATION_PARAMETERS, $sym819$SME_LEXIFICATION_WIZARD_UPDATE_LEXIFICATION_PARAMETERS_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sme_lexification_wizard_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sme_lexification_wizard_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sme_lexification_wizard_file();
  }
  static
  {
    me = new sme_lexification_wizard();
    $sme_lexification_object_id_hash$ = null;
    $sme_lexwiz_initializedP$ = null;
    $sme_forge_aheadP$ = null;
    $verify_beforehandP$ = null;
    $use_inferred_phrasesP$ = null;
    $use_blackboardP$ = null;
    $newline_tab$ = null;
    $sme_parts_of_speech$ = null;
    $next_sme_lexification_id$ = null;
    $use_genformat_template$ = null;
    $lexwiz_person_sub_predicates$ = null;
    $known_name_titles$ = null;
    $family_name_first_groups$ = null;
    $lexwiz_abbreviation_check_min_words$ = null;
    $sme_lexwiz_title$ = null;
    $lexwiz_welcome_message$ = null;
    $lexwiz_initialization_tip$ = null;
    $phrase_specification_tip$ = null;
    $proper_name_status_tip$ = null;
    $headword_selection_tip$ = null;
    $headword_guessing_tip$ = null;
    $sample_sentence_tip$ = null;
    $argument_part_of_speech_tip$ = null;
    $dtp_sme_lexification_settings$ = null;
    $sym0$_SME_LEXIFICATION_OBJECT_ID_HASH_ = makeSymbol( "*SME-LEXIFICATION-OBJECT-ID-HASH*" );
    $int1$25 = makeInteger( 25 );
    $sym2$_SME_LEXWIZ_INITIALIZED__ = makeSymbol( "*SME-LEXWIZ-INITIALIZED?*" );
    $str3$_a_a = makeString( "~a~a" );
    $list4 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), constant_handles
        .reader_make_constant_shell( makeString( "AgentiveNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ),
      constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ), constant_handles.reader_make_constant_shell( makeString(
          "ProperCountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) )
    } );
    $sym5$_NEXT_SME_LEXIFICATION_ID_ = makeSymbol( "*NEXT-SME-LEXIFICATION-ID*" );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "titleOfPerson-String" ) ), constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), constant_handles
        .reader_make_constant_shell( makeString( "middleName" ) ), constant_handles.reader_make_constant_shell( makeString( "familyName" ) ), constant_handles.reader_make_constant_shell( makeString( "nameSuffix" ) ),
        constant_handles.reader_make_constant_shell( makeString( "initialsString" ) ) );
    $sym7$_KNOWN_NAME_TITLES_ = makeSymbol( "*KNOWN-NAME-TITLES*" );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ChinesePerson" ) ), constant_handles.reader_make_constant_shell( makeString( "KoreanPerson" ) ), constant_handles
        .reader_make_constant_shell( makeString( "JapanesePerson" ) ), constant_handles.reader_make_constant_shell( makeString( "VietnamesePerson" ) ) );
    $str9$Dictionary_Assistant = makeString( "Dictionary Assistant" );
    $str10$Welcome_to_the_Subject_Matter_Exp = makeString(
        "Welcome to the Subject Matter Expert Lexification Wizard (SME LexWiz for short). The wizard will ask you a series of questions so that it can determine how to best represent a phrase use to refer to a given concept. This process is called lexification since lexical properties of the phrase are ascertained, such as its grammatical category.\n\nBefore proceeding, the utility must first be initialized. For instance, example lexifications will be retrieved from the knolwledge base for illustrative purposes." );
    $str11$The_initialization_may_take_sever = makeString( "The initialization may take several minutes, depending upon your system, but it needs to be performed only once, at startup." );
    $str12$Choose_a_phrase_that_clearly_dist = makeString(
        "Choose a phrase that clearly distinguishes the Cyc term in question, yet reflects common ways of referring to the term. However, it is important to avoid being overly specific as well as being overly general.\n\nFor example, for the term 'MakingCoffee-TheBeverage', the phrase \"making a coffee beverage\" is overly precise. Instead, \"making coffee\" is preferred since \"coffee\" in this phrase only refers to the beverage, and not for instance to the beans or to grounds. In contrast, for the term 'Paint-Dry', \"paint\" would be overly general, since this can also refer to liquid paint as well. Instead \"dry paint\" would be preferable.\n\nIf you want to use more than one word or phrase to refer to the term, complete the wizard for the current term and then begin again with the same term, but with a different word or phrase." );
    $str13$Normally__capitalized_phrases_are = makeString(
        "Normally, capitalized phrases are proper names. Some lowercase phrases may be proper names as well; those which refer to specific people (e.g., \"e. e. cummings\") or entities (e.g., \"priceline.com\"), or those which are scientific names for specific organisms, compounds, etc. (e.g., \"plexus brachialis\"). But in most cases, lowercase phrases refer to classes of individuals and to concepts rather than to specific individuals.\n\nExample proper names (particular individuals):\n\tMother Teresa\n\tIBM\n\tAcquired Immune Deficiency Syndrome\n\nExample common nouns or phrases (categories):\n\tcat\n\tthing\n\tNissan car" );
    $str14$examples____video_sports_game____ = makeString(
        "examples:\n\t\"video sports game\" => \"game\"\n\t\"load a weapon\" => \"load\"\n\t\"soccer arena in the Netherlands\" => \"arena\"\n\nNote: The headword will undergo inflectional changes, such as for pluralization. For example, pluralizing the above phrases only affects the headword: \"video sports games\", \"loads a weapon\", and \"soccer arenas in the Netherlands\"." );
    $str15$The_headword_is_the_word_that_is_ = makeString(
        "The headword is the word that is being qualified by the other words in the phrase. It often indicates the general class of the concept described by the phrase. And, it determines the grammatic function of the phrase.\n\nFor example, in the noun phrase \"metal desk\", the noun \"desk\" is the headword qualified by \"metal\". Similarly, the verb \"sleeping\" is the headword of the verb phrases \"sleeping on the job\" and \"quietly sleeping\"." );
    $str16$The_sentence_should_be_general_en = makeString(
        "The sentence should be general enough to reflect common ways of referring to the relation, but it should be specific enough to avoid confusion with similar relations. A case of being too general would be the following as a sample for the 'hasPets' relation:\n\tJohn has a doberman.\nThis would not distinguish the relation from other has-type relations, such as 'hasStyle' (consider \"John has a crew cut\"). On the otherhand, the following would be too specific:\n\tJohn cares for, feeds, and provides shelter for a doberman.\nInstead, the following would be better than either:\n\tJohn's pet is a doberman.\n\nAnother example of the right level of generality would be the following sample sentence for the relation 'infectionTypeTransmittedDuring':\n\tThe infection anthrax is transmitted during contact with infected animals.\nNote that although 'infection anthrax' might seem redundant, this helps distinguish this from other forms of transmission, such as electronic communications (consider \"The e-mail is transmitted during the evening\")." );
    $str17$The_choices_for_the_phrasal_part_ = makeString(
        "The choices for the phrasal part of speech correspond to the traditional grammatic categories\n\tNoun: refers to a person, place, thing, etc. (e.g., open '[the door]')\n\tVerbal: refers to an action, process, state of being, etc. (e.g., [close] the window)\n\tAdjectival: generally used to modify noun phrases (e.g., '[fast] cars')\n\tAdverbial: generally used to modify verb phrases (e.g., 'sleep [deeply]')\n\tPrepositional: relational phrase starting with preposition (e.g., 'sleeping [in the park])" );
    $sym18$SME_LEXIFICATION_SETTINGS = makeSymbol( "SME-LEXIFICATION-SETTINGS" );
    $sym19$SME_LEXIFICATION_SETTINGS_P = makeSymbol( "SME-LEXIFICATION-SETTINGS-P" );
    $list20 = ConsesLow.list( new SubLObject[] { makeSymbol( "IS-ABBREVIATION?" ), makeSymbol( "NEW-MAPPING?" ), makeSymbol( "OK?" ), makeSymbol( "SAMPLE-SENTENCE" ), makeSymbol( "SENTENCE-WORDS" ), makeSymbol(
        "SENTENCE-ARGS" ), makeSymbol( "ARG-OFFSETS" ), makeSymbol( "CURRENT-ARG" ), makeSymbol( "ARG-SPEECH-PARTS" ), makeSymbol( "PROPER-SUB-PREDICATES" )
    } );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "IS-ABBREVIATION?" ), makeKeyword( "NEW-MAPPING?" ), makeKeyword( "OK?" ), makeKeyword( "SAMPLE-SENTENCE" ), makeKeyword( "SENTENCE-WORDS" ), makeKeyword(
        "SENTENCE-ARGS" ), makeKeyword( "ARG-OFFSETS" ), makeKeyword( "CURRENT-ARG" ), makeKeyword( "ARG-SPEECH-PARTS" ), makeKeyword( "PROPER-SUB-PREDICATES" )
    } );
    $list22 = ConsesLow.list( new SubLObject[] { makeSymbol( "SME-LEXWIZ-IS-ABBREVIATION?" ), makeSymbol( "SME-LEXWIZ-NEW-MAPPING?" ), makeSymbol( "SME-LEXWIZ-OK?" ), makeSymbol( "SME-LEXWIZ-SAMPLE-SENTENCE" ),
      makeSymbol( "SME-LEXWIZ-SENTENCE-WORDS" ), makeSymbol( "SME-LEXWIZ-SENTENCE-ARGS" ), makeSymbol( "SME-LEXWIZ-ARG-OFFSETS" ), makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "SME-LEXWIZ-ARG-SPEECH-PARTS" ),
      makeSymbol( "SME-LEXWIZ-PROPER-SUB-PREDICATES" )
    } );
    $list23 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SME-LEXWIZ-IS-ABBREVIATION?" ), makeSymbol( "_CSETF-SME-LEXWIZ-NEW-MAPPING?" ), makeSymbol( "_CSETF-SME-LEXWIZ-OK?" ), makeSymbol(
        "_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE" ), makeSymbol( "_CSETF-SME-LEXWIZ-SENTENCE-WORDS" ), makeSymbol( "_CSETF-SME-LEXWIZ-SENTENCE-ARGS" ), makeSymbol( "_CSETF-SME-LEXWIZ-ARG-OFFSETS" ), makeSymbol(
            "_CSETF-SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS" ), makeSymbol( "_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES" )
    } );
    $sym24$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym25$SME_LEXIFICATION_SETTINGS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SME-LEXIFICATION-SETTINGS-PRINT-FUNCTION-TRAMPOLINE" );
    $list26 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SME-LEXIFICATION-SETTINGS-P" ) );
    $sym27$SME_LEXWIZ_IS_ABBREVIATION_ = makeSymbol( "SME-LEXWIZ-IS-ABBREVIATION?" );
    $sym28$_CSETF_SME_LEXWIZ_IS_ABBREVIATION_ = makeSymbol( "_CSETF-SME-LEXWIZ-IS-ABBREVIATION?" );
    $sym29$SME_LEXWIZ_NEW_MAPPING_ = makeSymbol( "SME-LEXWIZ-NEW-MAPPING?" );
    $sym30$_CSETF_SME_LEXWIZ_NEW_MAPPING_ = makeSymbol( "_CSETF-SME-LEXWIZ-NEW-MAPPING?" );
    $sym31$SME_LEXWIZ_OK_ = makeSymbol( "SME-LEXWIZ-OK?" );
    $sym32$_CSETF_SME_LEXWIZ_OK_ = makeSymbol( "_CSETF-SME-LEXWIZ-OK?" );
    $sym33$SME_LEXWIZ_SAMPLE_SENTENCE = makeSymbol( "SME-LEXWIZ-SAMPLE-SENTENCE" );
    $sym34$_CSETF_SME_LEXWIZ_SAMPLE_SENTENCE = makeSymbol( "_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE" );
    $sym35$SME_LEXWIZ_SENTENCE_WORDS = makeSymbol( "SME-LEXWIZ-SENTENCE-WORDS" );
    $sym36$_CSETF_SME_LEXWIZ_SENTENCE_WORDS = makeSymbol( "_CSETF-SME-LEXWIZ-SENTENCE-WORDS" );
    $sym37$SME_LEXWIZ_SENTENCE_ARGS = makeSymbol( "SME-LEXWIZ-SENTENCE-ARGS" );
    $sym38$_CSETF_SME_LEXWIZ_SENTENCE_ARGS = makeSymbol( "_CSETF-SME-LEXWIZ-SENTENCE-ARGS" );
    $sym39$SME_LEXWIZ_ARG_OFFSETS = makeSymbol( "SME-LEXWIZ-ARG-OFFSETS" );
    $sym40$_CSETF_SME_LEXWIZ_ARG_OFFSETS = makeSymbol( "_CSETF-SME-LEXWIZ-ARG-OFFSETS" );
    $sym41$SME_LEXWIZ_CURRENT_ARG = makeSymbol( "SME-LEXWIZ-CURRENT-ARG" );
    $sym42$_CSETF_SME_LEXWIZ_CURRENT_ARG = makeSymbol( "_CSETF-SME-LEXWIZ-CURRENT-ARG" );
    $sym43$SME_LEXWIZ_ARG_SPEECH_PARTS = makeSymbol( "SME-LEXWIZ-ARG-SPEECH-PARTS" );
    $sym44$_CSETF_SME_LEXWIZ_ARG_SPEECH_PARTS = makeSymbol( "_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS" );
    $sym45$SME_LEXWIZ_PROPER_SUB_PREDICATES = makeSymbol( "SME-LEXWIZ-PROPER-SUB-PREDICATES" );
    $sym46$_CSETF_SME_LEXWIZ_PROPER_SUB_PREDICATES = makeSymbol( "_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES" );
    $kw47$IS_ABBREVIATION_ = makeKeyword( "IS-ABBREVIATION?" );
    $kw48$NEW_MAPPING_ = makeKeyword( "NEW-MAPPING?" );
    $kw49$OK_ = makeKeyword( "OK?" );
    $kw50$SAMPLE_SENTENCE = makeKeyword( "SAMPLE-SENTENCE" );
    $kw51$SENTENCE_WORDS = makeKeyword( "SENTENCE-WORDS" );
    $kw52$SENTENCE_ARGS = makeKeyword( "SENTENCE-ARGS" );
    $kw53$ARG_OFFSETS = makeKeyword( "ARG-OFFSETS" );
    $kw54$CURRENT_ARG = makeKeyword( "CURRENT-ARG" );
    $kw55$ARG_SPEECH_PARTS = makeKeyword( "ARG-SPEECH-PARTS" );
    $kw56$PROPER_SUB_PREDICATES = makeKeyword( "PROPER-SUB-PREDICATES" );
    $str57$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw58$BEGIN = makeKeyword( "BEGIN" );
    $sym59$MAKE_SME_LEXIFICATION_SETTINGS = makeSymbol( "MAKE-SME-LEXIFICATION-SETTINGS" );
    $kw60$SLOT = makeKeyword( "SLOT" );
    $kw61$END = makeKeyword( "END" );
    $sym62$VISIT_DEFSTRUCT_OBJECT_SME_LEXIFICATION_SETTINGS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SME-LEXIFICATION-SETTINGS-METHOD" );
    $sym63$INTERFACE_PROXY = makeSymbol( "INTERFACE-PROXY" );
    $sym64$OBJECT = makeSymbol( "OBJECT" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT-SESSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "END-SESSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-CONSTANT" ), ConsesLow.list( makeSymbol( "CONSTANT-NAME" ) ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DESCRIBE-TERM" ), ConsesLow.list( makeSymbol( "TERM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "RESOLVE-TERM" ), ConsesLow.list( makeSymbol( "LABEL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MUMBLE" ), ConsesLow.list( makeSymbol(
                "MESSAGE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FORGE-AHEAD?" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym66$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym67$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-CLASS" );
    $sym68$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym69$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym70$SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-INSTANCE" );
    $sym71$QUESTION_ANSWERING_AGENT = makeSymbol( "QUESTION-ANSWERING-AGENT" );
    $list72 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TIP" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "QUESTION-TYPE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ERROR-MESSAGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "CHOICES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DESCRIPTIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow
          .list( makeSymbol( "VALUES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEFAULT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
              makeSymbol( "ANSWER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "FIELD-WIDTH" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                  makeSymbol( "FIELD-LABELS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PROXY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                      makeSymbol( "CALLBACK-FUNCTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CLIENT-DATA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "USER-DATA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-QUESTION" ), ConsesLow.list( makeSymbol(
          "NEW-QUESTION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NEW-TITLE" ), makeSymbol( "*SME-LEXWIZ-TITLE*" ) ), ConsesLow.list( makeSymbol( "NEW-TYPE" ), makeKeyword( "BOOLEAN" ) ), ConsesLow
              .list( makeSymbol( "NEW-CHOICES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "Yes" ), makeString( "No" ) ) ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-QUESTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RESPONSE" ), NIL, makeKeyword(
                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "VALIDATE-RESPONSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "SET-CALLBACK-FUNCTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CLIENT-DATA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                              makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-USER-DATA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PROXY" ), NIL,
                                  makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NOTIFY-CLIENT" ), ConsesLow.list( makeSymbol( "STATUS" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITIVE-CHOICE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEGATIVE-CHOICE" ), NIL,
          makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-CLASS-METHOD" ), makeSymbol( "NEW-COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym73$USER_DATA = makeSymbol( "USER-DATA" );
    $sym74$CLIENT_DATA = makeSymbol( "CLIENT-DATA" );
    $sym75$CALLBACK_FUNCTION = makeSymbol( "CALLBACK-FUNCTION" );
    $sym76$PROXY = makeSymbol( "PROXY" );
    $sym77$FIELD_LABELS = makeSymbol( "FIELD-LABELS" );
    $sym78$FIELD_WIDTH = makeSymbol( "FIELD-WIDTH" );
    $sym79$ANSWER = makeSymbol( "ANSWER" );
    $sym80$DEFAULT = makeSymbol( "DEFAULT" );
    $sym81$VALUES = makeSymbol( "VALUES" );
    $sym82$DESCRIPTIONS = makeSymbol( "DESCRIPTIONS" );
    $sym83$CHOICES = makeSymbol( "CHOICES" );
    $sym84$ERROR_MESSAGE = makeSymbol( "ERROR-MESSAGE" );
    $sym85$QUESTION_TYPE = makeSymbol( "QUESTION-TYPE" );
    $sym86$TIP = makeSymbol( "TIP" );
    $sym87$QUESTION = makeSymbol( "QUESTION" );
    $sym88$TITLE = makeSymbol( "TITLE" );
    $sym89$ID = makeSymbol( "ID" );
    $sym90$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-CLASS" );
    $sym91$SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-INSTANCE" );
    $sym92$SME_LEXIFICATION_STATE = makeSymbol( "SME-LEXIFICATION-STATE" );
    $list93 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STATE" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NEXT-STATES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-PARAMETERS" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-SETTINGS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), makeKeyword( "INSTANCE" ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ID" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "SET-STATES" ), ConsesLow.list( makeSymbol( "STATE-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STATES" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "CURRENT-SETTINGS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADVANCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                                    "NEW-COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LIST-VALUES" ), NIL, makeKeyword(
                                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TRACE-VALUES" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "LABEL" ), ConsesLow
                                            .list( makeSymbol( "DEBUG-LEVEL" ), makeSymbol( "*LEX-VERBOSE*" ) ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym94$INTERLOCUTOR_AGENT = makeSymbol( "INTERLOCUTOR-AGENT" );
    $sym95$LEXWIZ_SETTINGS = makeSymbol( "LEXWIZ-SETTINGS" );
    $sym96$LEXWIZ_PARAMETERS = makeSymbol( "LEXWIZ-PARAMETERS" );
    $sym97$NEXT_STATES = makeSymbol( "NEXT-STATES" );
    $sym98$STATE = makeSymbol( "STATE" );
    $sym99$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-CLASS" );
    $sym100$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-INSTANCE" );
    $sym101$SME_LEXIFICATION_INTERLOCUTOR = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR" );
    $list102 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PREVIOUS-ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-PARAMETERS" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-SETTINGS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SME-STATE" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PROXY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CALLBACK-FUNCTION" ), makeKeyword(
                "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CLIENT-DATA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "USER-DATA" ), makeKeyword(
                    "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DONE?" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIATE-INTERACTION" ), ConsesLow.list( makeSymbol( "SESSION-PARAMETERS" ), makeSymbol( "CALLBACK-FN" ), makeSymbol( "CALLBACK-DATA" ), makeSymbol(
                            "PROXY" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "UPDATE-NOTIFICATION-INFO" ), NIL,
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT-INTERACTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "END-INTERACTION" ), ConsesLow.list( makeSymbol( "SESSION-PARAMETERS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "RESET-STATE" ), ConsesLow.list( makeSymbol( "STATE-ID" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                            makeSymbol( "PROCESS-STATUS-UPDATE" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SERVER" ), makeSymbol( "USER-DATA" ) ), makeKeyword(
                                                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-GENERIC-BOOLEAN" ), ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ),
                                                    makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), makeSymbol( "DEFAULT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                        "ASK-GENERIC-ENUMERATED" ), ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
                                                            "TIP" ), makeSymbol( "VALUES" ), makeSymbol( "DEFAULT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "ASK-GENERIC-MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ),
                                                                    makeSymbol( "VALUES" ), makeSymbol( "DEFAULT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                        "ASK-GENERIC-MULTIPLE-FREE-FORM" ), ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ),
                                                                            makeSymbol( "LABELS" ), makeSymbol( "SIZE" ), makeSymbol( "DEFAULTS" ), makeSymbol( "DESCRIPTIONS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                                                                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-QUESTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ANSWER" ), ConsesLow.list( makeSymbol( "ANSWER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                                                                        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANSWER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "AGENT" ) ), makeKeyword(
                                                                                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERLOCUTOR-AGENT" ), NIL,
                                                                                                    makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DEFAULT" ),
                                                                                                        ConsesLow.list( makeSymbol( "DEFAULT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-GENERIC" ), ConsesLow.list( makeSymbol( "FIELD" ) ), makeKeyword(
                                                                                                                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CALLBACK-FUNCTION" ),
                                                                                                                    NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                                                        "SET-PROXY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                                                                            makeSymbol( "NOTIFY-CLIENT" ), ConsesLow.list( makeSymbol( "STATUS" ) ), makeKeyword(
                                                                                                                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                                                                    "MUMBLE" ), ConsesLow.list( makeSymbol( "MESSAGE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FORGE-AHEAD?" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PHRASE-DENOTATIONS" ), ConsesLow
          .list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DESCRIBE-TERM" ), ConsesLow.list( makeSymbol( "TERM" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym103$SME_STATE = makeSymbol( "SME-STATE" );
    $sym104$PREVIOUS_ID = makeSymbol( "PREVIOUS-ID" );
    $sym105$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-CLASS" );
    $sym106$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-INSTANCE" );
    $sym107$SME_LI_PRE_GENERAL = makeSymbol( "SME-LI-PRE-GENERAL" );
    $list108 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DO-INITIALIZATION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-INITIALIZATION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-TERM" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-TERM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RESOLVE-TERM" ), ConsesLow.list(
          makeSymbol( "LABEL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-TERM-SELECTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-TERM-SELECTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-PHRASE" ), NIL, makeKeyword(
                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-PHRASE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "ASK-AMBIGUITY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-AMBIGUITY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                          "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-PROPER-NAME-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-PROPER-NAME-STATUS" ),
                              NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym109$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-CLASS" );
    $sym110$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-INSTANCE" );
    $sym111$SME_LI_PROPER_NAME = makeSymbol( "SME-LI-PROPER-NAME" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-ABBREVIATION-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "CHECK-ABBREVIATION-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-PREDICATE-TYPE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-PREDICATE-TYPE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-REFINED-PREDICATION" ), NIL,
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-REFINED-PREDICATION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "INFER-PROPER-NAME-SUB-PREDICATIONS" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "PROPER-NAME-PREDICATES" ) ), makeKeyword(
                        "PUBLIC" ) ) );
    $sym113$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-CLASS" );
    $sym114$SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-INSTANCE" );
    $sym115$SME_LI_DENOTATIONAL = makeSymbol( "SME-LI-DENOTATIONAL" );
    $list116 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GUESS-HEADWORD-POSITION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-GUESSED-HEADWORD-POSITION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-HEADWORD-POSITION" ), NIL,
            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-HEADWORD-POSITION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "ASK-PART-OF-SPEECH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-PART-OF-SPEECH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SHOW-HEADWORD-VARIATIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "CHECK-HEADWORD-VARIATIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-LEXICAL-MAPPING" ), ConsesLow.list( makeSymbol( "WORDFORM" ),
                            makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ) ), ConsesLow.list(
                                makeSymbol( "WORD-TYPE" ), constant_handles.reader_make_constant_shell( makeString( "EnglishWord" ) ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                    makeSymbol( "REMOVE-LEXICAL-MAPPING" ), ConsesLow.list( makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ),
                                        constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ) ), ConsesLow.list( makeSymbol( "WORD-TYPE" ), constant_handles.reader_make_constant_shell( makeString(
                                            "EnglishWord" ) ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DO-LEXICAL-MAPPING" ), ConsesLow.list( makeSymbol(
                                                "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MT" ), makeSymbol( "WORD-TYPE" ), makeSymbol( "ADD?" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLES" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "TERM" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLE" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
          makeSymbol( "TERM" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "DISABLE-SPEECH-PART-SELECTION" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TERM" ), constant_handles
                  .reader_make_constant_shell( makeString( "Thing" ) ) ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym117$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-CLASS" );
    $sym118$SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-INSTANCE" );
    $sym119$SME_LI_RELATIONAL = makeSymbol( "SME-LI-RELATIONAL" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-SAMPLE-SENTENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "CHECK-SAMPLE-SENTENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-ARGUMENT-VALUES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-ARGUMENT-VALUES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-ARGUMENT-PART-OF-SPEECH" ), NIL,
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-ARGUMENT-PART-OF-SPEECH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "DERIVE-RELATIONAL-TEMPLATES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym121$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-CLASS" );
    $sym122$SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-INSTANCE" );
    $sym123$SME_LI_POST_GENERAL = makeSymbol( "SME-LI-POST-GENERAL" );
    $list124 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-PREFERRED-LEXIFICATION-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "CHECK-PREFERRED-LEXIFICATION-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DO-LEXIFICATION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CHECK-LEXIFICATION" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym125$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-CLASS" );
    $sym126$SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-INSTANCE" );
    $sym127$SME_LEXIFICATION_WIZARD = makeSymbol( "SME-LEXIFICATION-WIZARD" );
    $list128 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "STATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NEXT-STATES" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-PARAMETERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CURRENT-INTERACTION" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NEW-CURRENT-INTERACTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PROXY" ),
                makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TERM" ), ConsesLow.list( makeSymbol( "TERM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "GET-TERM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PHRASE" ), ConsesLow.list( makeSymbol( "PHRASE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PHRASE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-MT" ), ConsesLow.list(
          makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LEXICAL-MT" ), ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
              .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PARSING-MT" ), ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "SET-GENERATION-MT" ), ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-FIRST-TERMSTRING" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONTINUE-LEXIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-STATUS-UPDATE" ),
          ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SERVER" ), makeSymbol( "USER-DATA" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
              makeSymbol( "COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "NEW-COPY" ), ConsesLow.list( makeSymbol( "OTHER" ) ),
                  makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym129$QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" );
    $sym130$NEW_CURRENT_INTERACTION = makeSymbol( "NEW-CURRENT-INTERACTION" );
    $sym131$CURRENT_INTERACTION = makeSymbol( "CURRENT-INTERACTION" );
    $sym132$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-CLASS" );
    $sym133$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-INSTANCE" );
    $sym134$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list135 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( new SubLObject[] { makeSymbol( "CSETQ" ), makeSymbol( "TITLE" ), NIL, makeSymbol( "QUESTION" ), NIL,
      makeSymbol( "TIP" ), NIL, makeSymbol( "QUESTION-TYPE" ), NIL, makeSymbol( "ERROR-MESSAGE" ), NIL, makeSymbol( "CHOICES" ), NIL, makeSymbol( "DESCRIPTIONS" ), NIL, makeSymbol( "VALUES" ), NIL, makeSymbol(
          "ANSWER" ), NIL, makeSymbol( "FIELD-WIDTH" ), NIL, makeSymbol( "FIELD-LABELS" ), NIL, makeSymbol( "CALLBACK-FUNCTION" ), NIL, makeSymbol( "USER-DATA" ), NIL, makeSymbol( "CLIENT-DATA" ), NIL
    } ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym138$QUESTION_ANSWERING_AGENT_INITIALIZE_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-INITIALIZE-METHOD" );
    $sym139$SET_QUESTION = makeSymbol( "SET-QUESTION" );
    $list140 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list141 = ConsesLow.list( makeSymbol( "NEW-QUESTION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NEW-TITLE" ), makeSymbol( "*SME-LEXWIZ-TITLE*" ) ), ConsesLow.list( makeSymbol( "NEW-TYPE" ),
        makeKeyword( "BOOLEAN" ) ), ConsesLow.list( makeSymbol( "NEW-CHOICES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "Yes" ), makeString( "No" ) ) ) ) );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION" ), makeSymbol( "NEW-QUESTION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TITLE" ), makeSymbol( "NEW-TITLE" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-TYPE" ), makeSymbol( "NEW-TYPE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CHOICES" ), makeSymbol( "NEW-CHOICES" ) ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR-MESSAGE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT" ), NIL ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw143$BOOLEAN = makeKeyword( "BOOLEAN" );
    $list144 = ConsesLow.list( makeString( "Yes" ), makeString( "No" ) );
    $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym146$QUESTION_ANSWERING_AGENT_SET_QUESTION_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-SET-QUESTION-METHOD" );
    $sym147$DISPLAY_QUESTION = makeSymbol( "DISPLAY-QUESTION" );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString( "question-answering-agent::display-question shouldn't be invoked (object=~a)~%" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $str149$Warning__ = makeString( "Warning: " );
    $str150$question_answering_agent__display = makeString( "question-answering-agent::display-question shouldn't be invoked (object=~a)~%" );
    $sym151$QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD" );
    $sym152$GET_RESPONSE = makeSymbol( "GET-RESPONSE" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWER" ) ) );
    $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym155$QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD" );
    $sym156$VALIDATE_RESPONSE = makeSymbol( "VALIDATE-RESPONSE" );
    $list157 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list158 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSSIBLE-ANSWERS" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "VALUES" ),
        makeSymbol( "VALUES" ), makeSymbol( "CHOICES" ) ) ), makeSymbol( "VALID" ) ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-INSTANCE" ), makeSymbol( "*LEX-VERY-VERBOSE*" ), makeSymbol( "SELF" ) ), ConsesLow.list(
            makeSymbol( "LEX-DEBUG-OUT" ), makeString( "answer=~s~%" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-VERY-DETAILED*" ), makeString( "choices=~s~%" ), makeSymbol(
                "CHOICES" ) ), ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-VERY-DETAILED*" ), makeString( "values=~s~%" ), makeSymbol( "VALUES" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
                    "QUESTION-TYPE" ), ConsesLow.list( makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-VERY-DETAILED*" ), makeString( "pos=~a; neg=~a~%" ), ConsesLow.list(
                        makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "NEGATIVE-CHOICE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                            makeSymbol( "COR" ), ConsesLow.list( EQUALP, makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( EQUALP, makeSymbol( "ANSWER" ),
                                ConsesLow.list( makeSymbol( "NEGATIVE-CHOICE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALID" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                    makeSymbol( "ANSWER" ), ConsesLow.list( EQUALP, makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ) ) ) ) ), ConsesLow.list( makeKeyword(
                                        "ENUMERATED" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                            "ANSWER" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALID" ), ConsesLow.list( makeSymbol(
                                                "MEMBER" ), makeSymbol( "ANSWER" ), makeSymbol( "POSSIBLE-ANSWERS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                    ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "VALID" ) ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ANSWER" ) ),
                                                        ConsesLow.list( makeSymbol( "IS-NUMERIC?" ), makeSymbol( "ANSWER" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                            "POSITION" ), ConsesLow.list( makeSymbol( "PARSE-INTEGER" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                "CAND" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "POSITION" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "POSITION" ),
                                                                    ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "POSSIBLE-ANSWERS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), ConsesLow
                                                                        .list( makeSymbol( "ELT" ), makeSymbol( "POSSIBLE-ANSWERS" ), makeSymbol( "POSITION" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                            "VALID" ), T ) ) ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                                "CAND" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                                                                    makeSymbol( "IS-NUMERIC?" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), ConsesLow
                                                                                        .list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "ANSWER" ), T ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                                                                            makeSymbol( "LISTP" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALID" ), ConsesLow.list(
                                                                                                makeSymbol( "SEARCH" ), makeSymbol( "ANSWER" ), makeSymbol( "POSSIBLE-ANSWERS" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                                                                                    EQUALP ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                                                                                                        "CNOT" ), makeSymbol( "VALID" ) ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ANSWER" ) ) ), ConsesLow
                                                                                                            .list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "NEW-ANSWER" ), makeSymbol( "INVALID" ) ), ConsesLow
                                                                                                                .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol(
                                                                                                                    "PARSE-NUMERIC-RANGE" ), makeSymbol( "ANSWER" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                                                                                                                        .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "POSITION" ),
                                                                                                                            ZERO_INTEGER ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "POSITION" ), ConsesLow.list(
                                                                                                                                makeSymbol( "LENGTH" ), makeSymbol( "POSSIBLE-ANSWERS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "CPUSH" ), ConsesLow.list( makeSymbol( "ELT" ), makeSymbol( "POSSIBLE-ANSWERS" ),
                                                                                                                                        makeSymbol( "POSITION" ) ), makeSymbol( "NEW-ANSWER" ) ), ConsesLow.list(
                                                                                                                                            makeSymbol( "CSETQ" ), makeSymbol( "INVALID" ), T ) ) ), ConsesLow.list(
                                                                                                                                                makeSymbol( "CSETQ" ), makeSymbol( "VALID" ), ConsesLow.list( makeSymbol(
                                                                                                                                                    "CAND" ), makeSymbol( "NEW-ANSWER" ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "CNOT" ), makeSymbol( "INVALID" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                            "CSETQ" ), makeSymbol( "ANSWER" ), makeSymbol(
                                                                                                                                                                "NEW-ANSWER" ) ) ) ) ), ConsesLow.list( makeKeyword(
                                                                                                                                                                    "FREE-FORM" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                                                                        makeSymbol( "VALID" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                            "NON-EMPTY-STRING?" ), ConsesLow.list(
                                                                                                                                                                                makeSymbol( "TRIM-WHITESPACE" ), makeSymbol(
                                                                                                                                                                                    "ANSWER" ) ) ) ) ), ConsesLow.list(
                                                                                                                                                                                        makeKeyword( "MULTIPLE-FREE-FORM" ),
                                                                                                                                                                                        ConsesLow.list( makeSymbol(
                                                                                                                                                                                            "CSETQ" ), makeSymbol(
                                                                                                                                                                                                "VALID" ), T ), ConsesLow
                                                                                                                                                                                                    .list( makeSymbol(
                                                                                                                                                                                                        "CSOME" ), ConsesLow
                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "SUB-ANSWER" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "ANSWER" ),
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "VALID" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "CSETQ" ),
                                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                                "VALID" ),
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                makeSymbol(
                                                                                                                                                                                                                    "NON-EMPTY-STRING?" ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "TRIM-WHITESPACE" ),
                                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                                            "SUB-ANSWER" ) ) ) ) ) ),
                    ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString( "Unknown question type: ~a~%" ), makeSymbol( "QUESTION-TYPE" ) ) ) ), ConsesLow.list( makeSymbol(
                        "LEX-DEBUG-OUT" ), makeString( "validated answer=~s~%" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "NOTIFY-CLIENT" ) ), makeKeyword( "INPUT-VALIDATED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VALID" ) )
    } ) );
    $str159$answer__s__ = makeString( "answer=~s~%" );
    $str160$choices__s__ = makeString( "choices=~s~%" );
    $str161$values__s__ = makeString( "values=~s~%" );
    $str162$pos__a__neg__a__ = makeString( "pos=~a; neg=~a~%" );
    $kw163$ENUMERATED = makeKeyword( "ENUMERATED" );
    $kw164$MULTIPLE_SELECTION = makeKeyword( "MULTIPLE-SELECTION" );
    $kw165$FREE_FORM = makeKeyword( "FREE-FORM" );
    $kw166$MULTIPLE_FREE_FORM = makeKeyword( "MULTIPLE-FREE-FORM" );
    $str167$Unknown_question_type___a__ = makeString( "Unknown question type: ~a~%" );
    $str168$validated_answer__s__ = makeString( "validated answer=~s~%" );
    $sym169$NOTIFY_CLIENT = makeSymbol( "NOTIFY-CLIENT" );
    $kw170$INPUT_VALIDATED = makeKeyword( "INPUT-VALIDATED" );
    $sym171$QUESTION_ANSWERING_AGENT_VALIDATE_RESPONSE_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-VALIDATE-RESPONSE-METHOD" );
    $sym172$SET_CALLBACK_FUNCTION = makeSymbol( "SET-CALLBACK-FUNCTION" );
    $list173 = ConsesLow.list( makeSymbol( "NEW-FUNCTION" ) );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CALLBACK-FUNCTION" ), makeSymbol( "NEW-FUNCTION" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym176$QUESTION_ANSWERING_AGENT_SET_CALLBACK_FUNCTION_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-SET-CALLBACK-FUNCTION-METHOD" );
    $sym177$SET_CLIENT_DATA = makeSymbol( "SET-CLIENT-DATA" );
    $list178 = ConsesLow.list( makeSymbol( "CALLBACK-DATA" ) );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-DATA" ), makeSymbol( "CALLBACK-DATA" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym181$QUESTION_ANSWERING_AGENT_SET_CLIENT_DATA_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-SET-CLIENT-DATA-METHOD" );
    $sym182$SET_USER_DATA = makeSymbol( "SET-USER-DATA" );
    $list183 = ConsesLow.list( makeSymbol( "NEW-USER-DATA" ) );
    $list184 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "USER-DATA" ), makeSymbol( "NEW-USER-DATA" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym186$QUESTION_ANSWERING_AGENT_SET_USER_DATA_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-SET-USER-DATA-METHOD" );
    $sym187$SET_PROXY = makeSymbol( "SET-PROXY" );
    $list188 = ConsesLow.list( makeSymbol( "NEW-PROXY" ) );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), makeSymbol( "NEW-PROXY" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym191$QUESTION_ANSWERING_AGENT_SET_PROXY_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-SET-PROXY-METHOD" );
    $list192 = ConsesLow.list( makeSymbol( "STATUS" ) );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-VERY-DETAILED*" ), makeString( "callback-function=~a; client-data=~a~% user-data=~a" ), makeSymbol( "CALLBACK-FUNCTION" ),
        makeSymbol( "CLIENT-DATA" ), makeSymbol( "USER-DATA" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CALLBACK-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "CALLBACK-FUNCTION" ),
            makeSymbol( "CLIENT-DATA" ), makeSymbol( "STATUS" ), makeSymbol( "SELF" ), makeSymbol( "USER-DATA" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $str195$callback_function__a__client_data = makeString( "callback-function=~a; client-data=~a~% user-data=~a" );
    $sym196$QUESTION_ANSWERING_AGENT_NOTIFY_CLIENT_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-NOTIFY-CLIENT-METHOD" );
    $sym197$POSITIVE_CHOICE = makeSymbol( "POSITIVE-CHOICE" );
    $list198 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "CHOICES" ) ) ) );
    $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym200$QUESTION_ANSWERING_AGENT_POSITIVE_CHOICE_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-POSITIVE-CHOICE-METHOD" );
    $sym201$NEGATIVE_CHOICE = makeSymbol( "NEGATIVE-CHOICE" );
    $list202 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "CHOICES" ) ) ) );
    $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym204$QUESTION_ANSWERING_AGENT_NEGATIVE_CHOICE_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-NEGATIVE-CHOICE-METHOD" );
    $sym205$COPY = makeSymbol( "COPY" );
    $list206 = ConsesLow.list( makeSymbol( "OTHER" ) );
    $list207 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "ID" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "TITLE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "QUESTION" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIP" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "TIP" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-TYPE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "QUESTION-TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "ERROR-MESSAGE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CHOICES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol(
                                "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CHOICES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DESCRIPTIONS" ), ConsesLow
                                    .list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DESCRIPTIONS" ) ) ) ) ),
      ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
          makeSymbol( "VALUES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
              makeSymbol( "DEFAULT" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                  makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIELD-WIDTH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                      makeSymbol( "FIELD-WIDTH" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIELD-LABELS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol(
                          "QUOTE" ), makeSymbol( "FIELD-LABELS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list(
                              makeSymbol( "QUOTE" ), makeSymbol( "PROXY" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CALLBACK-FUNCTION" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ),
                                  ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CALLBACK-FUNCTION" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-DATA" ), ConsesLow.list( makeSymbol(
                                      "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CLIENT-DATA" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "USER-DATA" ),
                                          ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "USER-DATA" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                              makeSymbol( "SELF" ) )
    } );
    $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym209$QUESTION_ANSWERING_AGENT_COPY_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-COPY-METHOD" );
    $sym210$NEW_COPY = makeSymbol( "NEW-COPY" );
    $list211 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-OBJECT" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), makeSymbol( "OTHER" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPY" ) ),
            makeSymbol( "OTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-OBJECT" ) ) ) );
    $sym212$NEW = makeSymbol( "NEW" );
    $sym213$QUESTION_ANSWERING_AGENT_NEW_COPY_METHOD = makeSymbol( "QUESTION-ANSWERING-AGENT-NEW-COPY-METHOD" );
    $list214 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym215$INTERFACE_PROXY_INITIALIZE_METHOD = makeSymbol( "INTERFACE-PROXY-INITIALIZE-METHOD" );
    $sym216$INIT_SESSION = makeSymbol( "INIT-SESSION" );
    $list217 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym218$INTERFACE_PROXY_INIT_SESSION_METHOD = makeSymbol( "INTERFACE-PROXY-INIT-SESSION-METHOD" );
    $sym219$END_SESSION = makeSymbol( "END-SESSION" );
    $list220 = ConsesLow.list( ConsesLow.list( makeSymbol( "CB-INVOKE-SME-LEXIFICATION-WIZARD" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym221$INTERFACE_PROXY_END_SESSION_METHOD = makeSymbol( "INTERFACE-PROXY-END-SESSION-METHOD" );
    $sym222$CREATE_CONSTANT = makeSymbol( "CREATE-CONSTANT" );
    $list223 = ConsesLow.list( makeSymbol( "CONSTANT-NAME" ) );
    $list224 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "KE-CREATE-NOW" ), makeSymbol( "CONSTANT-NAME" ) ) ) );
    $sym225$INTERFACE_PROXY_CREATE_CONSTANT_METHOD = makeSymbol( "INTERFACE-PROXY-CREATE-CONSTANT-METHOD" );
    $sym226$DESCRIBE_TERM = makeSymbol( "DESCRIBE-TERM" );
    $list227 = ConsesLow.list( makeSymbol( "TERM" ) );
    $list228 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GENERATE-PHRASE" ), makeSymbol( "TERM" ) ) ) );
    $sym229$INTERFACE_PROXY_DESCRIBE_TERM_METHOD = makeSymbol( "INTERFACE-PROXY-DESCRIBE-TERM-METHOD" );
    $sym230$RESOLVE_TERM = makeSymbol( "RESOLVE-TERM" );
    $list231 = ConsesLow.list( makeSymbol( "TERM-LABEL" ) );
    $list232 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-DENOTS" ), ConsesLow.list( makeSymbol( "ALL-DENOTS-OF-STRING" ), makeSymbol( "TERM-LABEL" ) ) ),
        ConsesLow.list( makeSymbol( "TERM-DESCRIPTIONS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "LEX-DESCRIBE-TERM" ) ), makeSymbol( "TERM-DENOTS" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "LIST" ) ), makeSymbol( "TERM-DENOTS" ), makeSymbol(
            "TERM-DESCRIPTIONS" ) ) ) ) );
    $sym233$LEX_DESCRIBE_TERM = makeSymbol( "LEX-DESCRIBE-TERM" );
    $sym234$LIST = makeSymbol( "LIST" );
    $sym235$INTERFACE_PROXY_RESOLVE_TERM_METHOD = makeSymbol( "INTERFACE-PROXY-RESOLVE-TERM-METHOD" );
    $sym236$MUMBLE = makeSymbol( "MUMBLE" );
    $list237 = ConsesLow.list( makeSymbol( "MESSAGE" ) );
    $list238 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*TRACE-OUTPUT*" ), makeString( "~&mumbling: ~a~%" ), makeSymbol( "MESSAGE" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $str239$__mumbling___a__ = makeString( "~&mumbling: ~a~%" );
    $sym240$INTERFACE_PROXY_MUMBLE_METHOD = makeSymbol( "INTERFACE-PROXY-MUMBLE-METHOD" );
    $sym241$FORGE_AHEAD_ = makeSymbol( "FORGE-AHEAD?" );
    $list242 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "*SME-FORGE-AHEAD?*" ) ) );
    $sym243$INTERFACE_PROXY_FORGE_AHEAD__METHOD = makeSymbol( "INTERFACE-PROXY-FORGE-AHEAD?-METHOD" );
    $list244 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "NEW-SME-LEXIFICATION-ID" ) ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-STATES" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "MAKE-LEXIFICATION-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-SETTINGS" ), ConsesLow.list( makeSymbol(
                "MAKE-SME-LEXIFICATION-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "QUESTION-ANSWERING-AGENT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym246$SME_LEXIFICATION_STATE_INITIALIZE_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-INITIALIZE-METHOD" );
    $list247 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "STATE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-STATES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "NEXT-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "COPY-LEXIFICATION-PARAMETERS" ), ConsesLow
                .list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                    "LEXWIZ-SETTINGS" ), ConsesLow.list( makeSymbol( "COPY-SME-LEXIFICATION-SETTINGS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEXWIZ-SETTINGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ),
                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW-COPY" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "INTERLOCUTOR-AGENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym249$SME_LEXIFICATION_STATE_COPY_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-COPY-METHOD" );
    $sym250$GET_ID = makeSymbol( "GET-ID" );
    $list251 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ID" ) ) );
    $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym253$SME_LEXIFICATION_STATE_GET_ID_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-GET-ID-METHOD" );
    $sym254$SET_STATES = makeSymbol( "SET-STATES" );
    $list255 = ConsesLow.list( makeSymbol( "STATE-LIST" ) );
    $list256 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-STATES" ), makeSymbol( "STATE-LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym258$SME_LEXIFICATION_STATE_SET_STATES_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-SET-STATES-METHOD" );
    $sym259$GET_STATES = makeSymbol( "GET-STATES" );
    $list260 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEXT-STATES" ) ) );
    $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym262$SME_LEXIFICATION_STATE_GET_STATES_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-GET-STATES-METHOD" );
    $sym263$CURRENT_STATE = makeSymbol( "CURRENT-STATE" );
    $list264 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STATE" ) ) );
    $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym266$SME_LEXIFICATION_STATE_CURRENT_STATE_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-CURRENT-STATE-METHOD" );
    $sym267$CURRENT_SETTINGS = makeSymbol( "CURRENT-SETTINGS" );
    $list268 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) );
    $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym270$SME_LEXIFICATION_STATE_CURRENT_SETTINGS_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-CURRENT-SETTINGS-METHOD" );
    $sym271$ADVANCE = makeSymbol( "ADVANCE" );
    $list272 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NEXT-STATES" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "NEXT-STATES" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "NEXT-STATES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STATE" ) ) );
    $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym274$SME_LEXIFICATION_STATE_ADVANCE_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-ADVANCE-METHOD" );
    $list275 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "SME-LEXIFICATION-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-STATE" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "COPY" ) ), makeSymbol( "OTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-STATE" ) ) ) );
    $sym276$SME_LEXIFICATION_STATE_NEW_COPY_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-NEW-COPY-METHOD" );
    $sym277$LIST_VALUES = makeSymbol( "LIST-VALUES" );
    $list278 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ID" ), makeSymbol( "STATE" ), makeSymbol( "NEXT-STATES" ), ConsesLow.list( makeSymbol(
        "LIST-LEXIFICATION-PARAMETERS" ), makeSymbol( "LEXWIZ-PARAMETERS" ), T ), ConsesLow.list( makeSymbol( "LIST-SME-LEXIFICATION-SETTINGS" ), makeSymbol( "LEXWIZ-SETTINGS" ), T ) ) ) );
    $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $sym280$SME_LEXIFICATION_STATE_LIST_VALUES_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-LIST-VALUES-METHOD" );
    $sym281$TRACE_VALUES = makeSymbol( "TRACE-VALUES" );
    $list282 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "LABEL" ), ConsesLow.list( makeSymbol( "DEBUG-LEVEL" ), makeSymbol( "*LEX-VERBOSE*" ) ) );
    $list283 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "DEBUG-LEVEL" ), makeString( "~a~s~%" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "LABEL" ), makeSymbol( "LABEL" ),
        makeString( "SME lexification state: " ) ), ConsesLow.list( makeSymbol( "LIST-VALUES" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-INSTANCE" ), makeSymbol( "*LEX-VERY-VERBOSE*" ),
            makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "TRACE-LEXIFICATION-PARAMETERS" ), makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "*LEX-MOST-VERBOSE*" ) ), ConsesLow.list( makeSymbol(
                "TRACE-SME-LEXIFICATION-SETTINGS" ), makeSymbol( "LEXWIZ-SETTINGS" ), makeSymbol( "*LEX-MOST-VERBOSE*" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD" );
    $str285$_a_s__ = makeString( "~a~s~%" );
    $str286$SME_lexification_state__ = makeString( "SME lexification state: " );
    $sym287$SME_LEXIFICATION_STATE_TRACE_VALUES_METHOD = makeSymbol( "SME-LEXIFICATION-STATE-TRACE-VALUES-METHOD" );
    $list288 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PROTECTED" ) );
    $list289 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CALLBACK-FUNCTION" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LEXIFICATION-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INTERFACE-PROXY" ) ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym290$SME_LEXIFICATION_INTERLOCUTOR_INITIALIZE_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-INITIALIZE-METHOD" );
    $sym291$DONE_ = makeSymbol( "DONE?" );
    $list292 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEXT-STATES" ) ) ) ) );
    $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym294$SME_LEXIFICATION_INTERLOCUTOR_DONE__METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-DONE?-METHOD" );
    $sym295$INITIATE_INTERACTION = makeSymbol( "INITIATE-INTERACTION" );
    $list296 = ConsesLow.list( makeSymbol( "SESSION-PARAMETERS" ), makeSymbol( "CALLBACK-FN" ), makeSymbol( "INSTANCE-DATA" ), makeSymbol( "NEW-PROXY" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) );
    $list297 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "callback-fn (of type ~a): ~a~%" ), ConsesLow.list( makeSymbol( "TYPE-OF" ), makeSymbol( "CALLBACK-FN" ) ),
        makeSymbol( "CALLBACK-FN" ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "question-answering-agent-class (of type ~a): ~a~%" ), ConsesLow.list( makeSymbol( "TYPE-OF" ), makeSymbol(
            "QUESTION-ANSWERING-AGENT-CLASS" ) ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "SESSION-PARAMETERS" ) ),
      ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-SETTINGS" ), ConsesLow.list( makeSymbol( "MAKE-SME-LEXIFICATION-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SME-STATE" ),
          ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol(
              "QUOTE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), makeSymbol( "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CALLBACK-FUNCTION" ), makeSymbol( "CALLBACK-FN" ) ), ConsesLow.list(
                  makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-DATA" ), makeSymbol( "INSTANCE-DATA" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "USER-DATA" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow
                      .list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), makeSymbol( "NEW-PROXY" ) ), ConsesLow.list( makeSymbol( "SET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                          "FUNCALL-CLASS-METHOD" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol(
                              "UPDATE-NOTIFICATION-INFO" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                  "NEXT-INTERACTION" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL )
    } );
    $str298$callback_fn__of_type__a____a__ = makeString( "callback-fn (of type ~a): ~a~%" );
    $str299$question_answering_agent_class__o = makeString( "question-answering-agent-class (of type ~a): ~a~%" );
    $sym300$NEXT_INTERACTION = makeSymbol( "NEXT-INTERACTION" );
    $sym301$SME_LEXIFICATION_INTERLOCUTOR_INITIATE_INTERACTION_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-INITIATE-INTERACTION-METHOD" );
    $sym302$UPDATE_NOTIFICATION_INFO = makeSymbol( "UPDATE-NOTIFICATION-INFO" );
    $list303 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "MY-NOTIFICATION-FN" ), ConsesLow.list( makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROCESS-STATUS-UPDATE" ) ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "SET-CALLBACK-FUNCTION" ) ), makeSymbol( "MY-NOTIFICATION-FN" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "SET-CLIENT-DATA" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "SET-USER-DATA" ) ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SET-PROXY" ) ), makeSymbol( "PROXY" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym304$PROCESS_STATUS_UPDATE = makeSymbol( "PROCESS-STATUS-UPDATE" );
    $sym305$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_NOTIFICATION_INFO_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-NOTIFICATION-INFO-METHOD" );
    $list306 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREVIOUS-ID" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-ID" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TRACE-VALUES" ) ), makeString(
            "sme state: " ) ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-INSTANCE" ), makeSymbol( "*LEX-VERY-VERBOSE*" ), makeSymbol( "SME-STATE" ) ), ConsesLow.list( makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ),
                makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol(
                    "COPY-SME-LEXIFICATION-SETTINGS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*USE-BLACKBOARD?*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                        "SME-STATE" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LEXIFICATION-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                            makeSymbol( "NEW-COPY" ) ), makeSymbol( "SME-STATE" ) ) ), ConsesLow.list( makeSymbol( "UPDATE-NOTIFICATION-INFO" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADVANCE" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                                    .list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ID" ) ) ) ) ),
                                    ConsesLow.list( makeSymbol( "SET-LEXIFICATION-OBJECT" ), makeSymbol( "ID" ), makeSymbol( "SME-STATE" ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString(
                                        "current state: ~a~%" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                            "CURRENT-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-VERY-DETAILED*" ), makeString( "next states: ~a~%" ), ConsesLow.list( makeSymbol(
                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                    ConsesLow.list( ConsesLow.list( makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol(
                                                        "QUOTE" ), makeSymbol( "CURRENT-STATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "IMPLEMENTS-METHOD-P" ), makeSymbol( "SELF" ),
                                                            makeSymbol( "STATE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), makeSymbol( "STATE" ) ), ConsesLow.list( makeSymbol(
                                                                "LEX-WARN" ), makeString( "Unexpected state: ~a~%" ), makeSymbol( "STATE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $str307$sme_state__ = makeString( "sme state: " );
    $str308$current_state___a__ = makeString( "current state: ~a~%" );
    $str309$next_states___a__ = makeString( "next states: ~a~%" );
    $str310$Unexpected_state___a__ = makeString( "Unexpected state: ~a~%" );
    $sym311$SME_LEXIFICATION_INTERLOCUTOR_NEXT_INTERACTION_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-NEXT-INTERACTION-METHOD" );
    $sym312$END_INTERACTION = makeSymbol( "END-INTERACTION" );
    $list313 = ConsesLow.list( ConsesLow.list( makeSymbol( "NOTIFY-CLIENT" ), makeSymbol( "SELF" ), makeKeyword( "DONE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw314$DONE = makeKeyword( "DONE" );
    $sym315$SME_LEXIFICATION_INTERLOCUTOR_END_INTERACTION_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-END-INTERACTION-METHOD" );
    $sym316$RESET_STATE = makeSymbol( "RESET-STATE" );
    $list317 = ConsesLow.list( makeSymbol( "STATE-ID" ) );
    $list318 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OLD-SME-STATE" ), ConsesLow.list( makeSymbol( "GET-LEXIFICATION-OBJECT" ), makeSymbol( "STATE-ID" ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "OLD-SME-STATE" ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "Resetting SME lexwiz to older state ~a~%" ), makeSymbol( "STATE-ID" ) ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TRACE-VALUES" ) ), makeString( "old-sme-state: " ) ), ConsesLow.list( makeSymbol(
                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TRACE-VALUES" ) ), makeString( "sme-state (before): " ) ), ConsesLow.list( makeSymbol(
                    "CSETQ" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LEXIFICATION-STATE" ) ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "NEW-COPY" ) ), makeSymbol( "OLD-SME-STATE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                            makeSymbol( "TRACE-VALUES" ) ), makeString( "sme-state (after): " ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREVIOUS-ID" ), makeSymbol( "STATE-ID" ) ), ConsesLow.list(
                                makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-SETTINGS" ), ConsesLow.list( makeSymbol(
                                    "COPY-SME-LEXIFICATION-SETTINGS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ) ),
          ConsesLow.list( makeSymbol( "LEX-DEBUG" ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "done with state reset~%" ) ) )
        } ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString( "Unable to resolve SME lexification state for ~a~%" ), makeSymbol( "STATE-ID" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
            "SME-STATE" ) ) ) );
    $str319$Resetting_SME_lexwiz_to_older_sta = makeString( "Resetting SME lexwiz to older state ~a~%" );
    $str320$old_sme_state__ = makeString( "old-sme-state: " );
    $str321$sme_state__before___ = makeString( "sme-state (before): " );
    $str322$sme_state__after___ = makeString( "sme-state (after): " );
    $str323$done_with_state_reset__ = makeString( "done with state reset~%" );
    $str324$Unable_to_resolve_SME_lexificatio = makeString( "Unable to resolve SME lexification state for ~a~%" );
    $sym325$SME_LEXIFICATION_INTERLOCUTOR_RESET_STATE_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-RESET-STATE-METHOD" );
    $list326 = ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SERVER" ), makeSymbol( "CURRENT-USER-DATA" ) );
    $list327 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "CURRENT-USER-DATA" ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString(
        "sme-li process-status-update status=~a server=~a user-data=~a~%" ), makeSymbol( "STATUS" ), makeSymbol( "SERVER" ), makeSymbol( "CURRENT-USER-DATA" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
            ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "INTERLOCUTOR-AGENT" ), makeSymbol( "SERVER" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "STATUS" ), ConsesLow.list( makeKeyword( "OUTPUT-DONE" ), ConsesLow.list( makeSymbol(
                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RESPONSE" ) ) ) ), ConsesLow.list( makeKeyword( "INPUT-READY" ), ConsesLow
                        .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VALIDATE-RESPONSE" ) ) ) ), ConsesLow.list( makeKeyword(
                            "INPUT-VALIDATED" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ), ConsesLow.list( makeSymbol(
                                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "GET-ID" ) ) ) ), ConsesLow.list( makeSymbol( "AGENT-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "ID" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "id=~a previous-id=~a agent-id=~a~%" ), makeSymbol( "ID" ), makeSymbol(
                                            "PREVIOUS-ID" ), makeSymbol( "AGENT-ID" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQUAL, makeSymbol( "AGENT-ID" ),
                                                makeSymbol( "PREVIOUS-ID" ) ), ConsesLow.list( EQUAL, makeSymbol( "AGENT-ID" ), makeSymbol( "ID" ) ), makeSymbol( "*USE-BLACKBOARD?*" ) ), ConsesLow.list( makeSymbol(
                                                    "RESET-STATE" ), makeSymbol( "SELF" ), makeSymbol( "AGENT-ID" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "NEXT-INTERACTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString(
                                                            "Unexpected status: ~a~%" ), makeSymbol( "STATUS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str328$sme_li_process_status_update_stat = makeString( "sme-li process-status-update status=~a server=~a user-data=~a~%" );
    $kw329$OUTPUT_DONE = makeKeyword( "OUTPUT-DONE" );
    $kw330$INPUT_READY = makeKeyword( "INPUT-READY" );
    $str331$id__a_previous_id__a_agent_id__a_ = makeString( "id=~a previous-id=~a agent-id=~a~%" );
    $str332$Unexpected_status___a__ = makeString( "Unexpected status: ~a~%" );
    $sym333$SME_LEXIFICATION_INTERLOCUTOR_PROCESS_STATUS_UPDATE_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-PROCESS-STATUS-UPDATE-METHOD" );
    $sym334$ASK_GENERIC_BOOLEAN = makeSymbol( "ASK-GENERIC-BOOLEAN" );
    $list335 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), makeSymbol( "DEFAULT" ) );
    $list336 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIP" ) ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-QUESTION" ) ), makeSymbol( "QUESTION" ), makeSymbol( "TITLE" ), makeKeyword(
                "BOOLEAN" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "DEFAULT" ) ), ConsesLow.list(
                    makeSymbol( "DISPLAY-QUESTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym337$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_BOOLEAN_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-BOOLEAN-METHOD" );
    $sym338$ASK_GENERIC_ENUMERATED = makeSymbol( "ASK-GENERIC-ENUMERATED" );
    $list339 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), makeSymbol( "VALUES" ), makeSymbol( "DEFAULT-OFFSET" ) );
    $list340 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIP" ) ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VALUES" ) ), makeSymbol( "VALUES" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-QUESTION" ) ), makeSymbol( "QUESTION" ), makeSymbol( "TITLE" ), makeKeyword( "ENUMERATED" ), makeSymbol( "CHOICES" ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "DEFAULT-OFFSET" ) ), ConsesLow.list( makeSymbol(
            "DISPLAY-QUESTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym341$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_ENUMERATED_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-ENUMERATED-METHOD" );
    $sym342$ASK_GENERIC_MULTIPLE_SELECTION = makeSymbol( "ASK-GENERIC-MULTIPLE-SELECTION" );
    $list343 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), makeSymbol( "VALUES" ), makeSymbol( "DEFAULT-OFFSETS" ) );
    $list344 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIP" ) ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VALUES" ) ), makeSymbol( "VALUES" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-QUESTION" ) ), makeSymbol( "QUESTION" ), makeSymbol( "TITLE" ), makeKeyword( "MULTIPLE-SELECTION" ), makeSymbol(
                    "CHOICES" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "DEFAULT-OFFSETS" ) ),
        ConsesLow.list( makeSymbol( "DISPLAY-QUESTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym345$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_SELECTION_METH = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-SELECTION-METHOD" );
    $sym346$ASK_GENERIC_FREE_FORM = makeSymbol( "ASK-GENERIC-FREE-FORM" );
    $list347 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), ConsesLow.list( makeSymbol( "SIZE" ), TEN_INTEGER ), makeSymbol( "DEFAULT" ) );
    $list348 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIP" ) ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIELD-WIDTH" ) ), makeSymbol( "SIZE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-QUESTION" ) ), makeSymbol( "QUESTION" ), makeSymbol( "TITLE" ), makeKeyword( "FREE-FORM" ) ), ConsesLow.list( makeSymbol(
                    "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "DISPLAY-QUESTION" ),
                        makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym349$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_FREE_FORM_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-FREE-FORM-METHOD" );
    $sym350$ASK_GENERIC_MULTIPLE_FREE_FORM = makeSymbol( "ASK-GENERIC-MULTIPLE-FREE-FORM" );
    $list351 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TIP" ), makeSymbol( "LABELS" ), makeSymbol( "SIZE" ), makeSymbol( "DEFAULTS" ), makeSymbol(
        "DESCRIPTIONS" ) );
    $list352 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ),
        makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIP" ) ), makeSymbol( "TIP" ) ), ConsesLow.list(
            makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIELD-WIDTH" ) ), makeSymbol( "SIZE" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIELD-LABELS" ) ), makeSymbol( "LABELS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                    "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-QUESTION" ) ), makeSymbol( "QUESTION" ), makeSymbol( "TITLE" ), makeKeyword( "MULTIPLE-FREE-FORM" ) ), ConsesLow.list(
                        makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "DEFAULTS" ) ), ConsesLow.list( makeSymbol(
                            "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DESCRIPTIONS" ) ), makeSymbol( "DESCRIPTIONS" ) ), ConsesLow.list( makeSymbol(
                                "DISPLAY-QUESTION" ), makeSymbol( "SELF" ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym353$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_FREE_FORM_METH = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-FREE-FORM-METHOD" );
    $list354 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ERROR-MESSAGE" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ),
            makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ), ConsesLow.list( makeSymbol(
                "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ID" ) ) ) ), ConsesLow.list( makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                        makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "COPY-SME-LEXIFICATION-SETTINGS" ), makeSymbol(
                            "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "DISPLAY-QUESTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym356$SME_LEXIFICATION_INTERLOCUTOR_DISPLAY_QUESTION_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-DISPLAY-QUESTION-METHOD" );
    $sym357$GET_ANSWER = makeSymbol( "GET-ANSWER" );
    $list358 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ) ) );
    $sym359$SME_LEXIFICATION_INTERLOCUTOR_GET_ANSWER_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-GET-ANSWER-METHOD" );
    $sym360$SET_ANSWER = makeSymbol( "SET-ANSWER" );
    $list361 = ConsesLow.list( makeSymbol( "NEW-ANSWER" ) );
    $list362 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ), makeSymbol( "NEW-ANSWER" ) ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) ) );
    $sym363$SME_LEXIFICATION_INTERLOCUTOR_SET_ANSWER_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-SET-ANSWER-METHOD" );
    $sym364$GET_INTERLOCUTOR_AGENT = makeSymbol( "GET-INTERLOCUTOR-AGENT" );
    $list365 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ASSERTION" ), makeSymbol( "SME-STATE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( "GET-SLOT" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INTERLOCUTOR-AGENT" ) ) ) ) ) );
    $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $str367$____assertion_failed___a______ = makeString( "*** assertion failed: ~a ***~%" );
    $sym368$SME_LEXIFICATION_INTERLOCUTOR_GET_INTERLOCUTOR_AGENT_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-GET-INTERLOCUTOR-AGENT-METHOD" );
    $sym369$SET_INTERLOCUTOR_AGENT = makeSymbol( "SET-INTERLOCUTOR-AGENT" );
    $list370 = ConsesLow.list( makeSymbol( "NEW-AGENT" ) );
    $list371 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ASSERTION" ), makeSymbol( "SME-STATE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
        makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INTERLOCUTOR-AGENT" ) ), makeSymbol( "NEW-AGENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym373$SME_LEXIFICATION_INTERLOCUTOR_SET_INTERLOCUTOR_AGENT_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-SET-INTERLOCUTOR-AGENT-METHOD" );
    $sym374$SET_DEFAULT = makeSymbol( "SET-DEFAULT" );
    $list375 = ConsesLow.list( makeSymbol( "NEW-DEFAULT" ) );
    $list376 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFAULT" ) ), makeSymbol( "NEW-DEFAULT" ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), NIL ) );
    $sym377$SME_LEXIFICATION_INTERLOCUTOR_SET_DEFAULT_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-SET-DEFAULT-METHOD" );
    $sym378$CHECK_GENERIC = makeSymbol( "CHECK-GENERIC" );
    $list379 = ConsesLow.list( makeSymbol( "FIELD" ) );
    $list380 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list(
            makeSymbol( "FIELD-ACCESSOR" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "LEXWIZ-~S" ), makeSymbol( "FIELD" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "EVAL" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CSETF" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "FIELD-ACCESSOR" ), makeSymbol(
                    "LEXWIZ-PARAMETERS" ) ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "NEXT-INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str381$LEXWIZ__S = makeString( "LEXWIZ-~S" );
    $sym382$CSETF = makeSymbol( "CSETF" );
    $sym383$SME_LEXIFICATION_INTERLOCUTOR_CHECK_GENERIC_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-CHECK-GENERIC-METHOD" );
    $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym385$SME_LEXIFICATION_INTERLOCUTOR_SET_CALLBACK_FUNCTION_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-SET-CALLBACK-FUNCTION-METHOD" );
    $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym387$SME_LEXIFICATION_INTERLOCUTOR_SET_PROXY_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-SET-PROXY-METHOD" );
    $list388 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CALLBACK-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "CALLBACK-FUNCTION" ), makeSymbol( "CLIENT-DATA" ),
        makeSymbol( "STATUS" ), makeSymbol( "SELF" ), makeSymbol( "USER-DATA" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym390$SME_LEXIFICATION_INTERLOCUTOR_NOTIFY_CLIENT_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-NOTIFY-CLIENT-METHOD" );
    $list391 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "MUMBLE" ) ), makeSymbol( "MESSAGE" ) ) ) ) );
    $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym393$SME_LEXIFICATION_INTERLOCUTOR_MUMBLE_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-MUMBLE-METHOD" );
    $list394 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "FORGE-AHEAD?" ) ) ) ) ) );
    $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym396$SME_LEXIFICATION_INTERLOCUTOR_FORGE_AHEAD__METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-FORGE-AHEAD?-METHOD" );
    $sym397$PHRASE_DENOTATIONS = makeSymbol( "PHRASE-DENOTATIONS" );
    $list398 = ConsesLow.list( makeSymbol( "PHRASE" ) );
    $list399 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ALL-DENOTS-OF-STRING" ), makeSymbol( "PHRASE" ), NIL, ConsesLow.list( makeSymbol( "LEXWIZ-LEXICAL-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ) ) );
    $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym401$SME_LEXIFICATION_INTERLOCUTOR_PHRASE_DENOTATIONS_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-PHRASE-DENOTATIONS-METHOD" );
    $list402 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "DESCRIBE-TERM" ) ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-TERM" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-LEXICAL-MT" ),
            makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ) );
    $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD" );
    $sym404$SME_LEXIFICATION_INTERLOCUTOR_DESCRIBE_TERM_METHOD = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-DESCRIBE-TERM-METHOD" );
    $sym405$UPDATE_LEXIFICATION_PARAMETERS = makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" );
    $list406 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "GET-INTERLOCUTOR-AGENT" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "NEW-LEXIFICATION-PARAMETERS" ), ConsesLow.list( makeSymbol( "COPY-LEXIFICATION-PARAMETERS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-LEXIFICATION-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                makeSymbol( "INTERLOCUTOR-AGENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-USER-DATA" ) ), makeSymbol( "NEW-LEXIFICATION-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym407$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_LEXIFICATION_PARAMETERS_METH = makeSymbol( "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-LEXIFICATION-PARAMETERS-METHOD" );
    $list408 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATE-SEQUENCE" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "DO-INITIALIZATION" ), makeSymbol( "CHECK-INITIALIZATION" ), makeSymbol( "ASK-TERM" ), makeSymbol( "CHECK-TERM" ), makeSymbol( "ASK-TERM-SELECTION" ), makeSymbol( "CHECK-TERM-SELECTION" ),
              makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ), makeSymbol( "ASK-AMBIGUITY" ), makeSymbol( "CHECK-AMBIGUITY" ), makeSymbol( "ASK-PROPER-NAME-STATUS" ), makeSymbol( "CHECK-PROPER-NAME-STATUS" ),
              makeSymbol( "END-INTERACTION" )
    } ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "STATE-SEQUENCE" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list409 = ConsesLow.list( new SubLObject[] { makeSymbol( "DO-INITIALIZATION" ), makeSymbol( "CHECK-INITIALIZATION" ), makeSymbol( "ASK-TERM" ), makeSymbol( "CHECK-TERM" ), makeSymbol( "ASK-TERM-SELECTION" ),
      makeSymbol( "CHECK-TERM-SELECTION" ), makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ), makeSymbol( "ASK-AMBIGUITY" ), makeSymbol( "CHECK-AMBIGUITY" ), makeSymbol( "ASK-PROPER-NAME-STATUS" ), makeSymbol(
          "CHECK-PROPER-NAME-STATUS" ), makeSymbol( "END-INTERACTION" )
    } );
    $sym410$SME_LI_PRE_GENERAL_INITIALIZE_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-INITIALIZE-METHOD" );
    $sym411$DO_INITIALIZATION = makeSymbol( "DO-INITIALIZATION" );
    $list412 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeString( "Performing dictionary assistant initialization" ) ), ConsesLow.list( makeSymbol(
        "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a~%~%~a" ), makeSymbol( "*LEXWIZ-WELCOME-MESSAGE*" ), makeString( "Press OK to proceed." ) ) ), ConsesLow.list( makeSymbol( "CHOICES" ),
            NIL ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol( "*LEXWIZ-INITIALIZATION-TIP*" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "*SME-LEXWIZ-INITIALIZED?*" ), ConsesLow.list( makeSymbol(
                "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ),
                    makeSymbol( "TIP" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $str413$Performing_dictionary_assistant_i = makeString( "Performing dictionary assistant initialization" );
    $str414$_a_____a = makeString( "~a~%~%~a" );
    $str415$Press_OK_to_proceed_ = makeString( "Press OK to proceed." );
    $sym416$SME_LI_PRE_GENERAL_DO_INITIALIZATION_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-DO-INITIALIZATION-METHOD" );
    $sym417$CHECK_INITIALIZATION = makeSymbol( "CHECK-INITIALIZATION" );
    $list418 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*SME-LEXWIZ-INITIALIZED?*" ), ConsesLow.list( makeSymbol( "INIT-SME-LEXIFICATION-WIZARD" ) ) ), ConsesLow.list( makeSymbol(
        "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym419$SME_LI_PRE_GENERAL_CHECK_INITIALIZATION_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-INITIALIZATION-METHOD" );
    $sym420$ASK_TERM = makeSymbol( "ASK-TERM" );
    $list421 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-LABEL" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ),
        ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Determining concept to be lexified" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol(
            "FORMAT" ), NIL, makeString( "Which concept's lexical information would you like to refine?" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeString(
                "This is usually the name of the term you created using the Concept Creator Tool" ) ), ConsesLow.list( makeSymbol( "SIZE" ), makeInteger( 60 ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                    makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                        makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "TERM-LABEL" ) ), ConsesLow.list( makeSymbol( "LEX-EMPTY-STRING?" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol(
                            "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), makeSymbol( "TERM-LABEL" ) ), ConsesLow.list(
                                makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-FREE-FORM" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ),
                                    makeSymbol( "TIP" ), makeSymbol( "SIZE" ), makeSymbol( "TERM-LABEL" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str423$Determining_concept_to_be_lexifie = makeString( "Determining concept to be lexified" );
    $str424$Which_concept_s_lexical_informati = makeString( "Which concept's lexical information would you like to refine?" );
    $str425$This_is_usually_the_name_of_the_t = makeString( "This is usually the name of the term you created using the Concept Creator Tool" );
    $int426$60 = makeInteger( 60 );
    $sym427$SME_LI_PRE_GENERAL_ASK_TERM_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-ASK-TERM-METHOD" );
    $sym428$CHECK_TERM = makeSymbol( "CHECK-TERM" );
    $list429 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-LABEL" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list(
            makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "RESOLVE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM-LABEL" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                    "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "TERM-LABEL" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                        "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "A valid concept must be specified" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                            makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ) ),
                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-TERM" ),
                                makeSymbol( "CHECK-TERM" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                        T ) );
    $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str431$A_valid_concept_must_be_specified = makeString( "A valid concept must be specified" );
    $list432 = ConsesLow.list( makeSymbol( "ASK-TERM" ), makeSymbol( "CHECK-TERM" ) );
    $sym433$SME_LI_PRE_GENERAL_CHECK_TERM_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-TERM-METHOD" );
    $list434 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-CLARIFICATIONS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ),
        ConsesLow.list( makeSymbol( "LEX-FORT-FOR-STRING" ), makeSymbol( "TERM-LABEL" ) ), makeSymbol( "TERM-LABEL" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "TERM-CLARIFICATIONS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RESOLVE-TERM" ) ),
                makeSymbol( "TERM-LABEL" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TERM-CLARIFICATIONS" ) ) ) );
    $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $sym436$SME_LI_PRE_GENERAL_RESOLVE_TERM_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-RESOLVE-TERM-METHOD" );
    $sym437$ASK_TERM_SELECTION = makeSymbol( "ASK-TERM-SELECTION" );
    $list438 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACE-LEXIFICATION-PARAMETERS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow
        .list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list(
            makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LISTP" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString(
                "Unexpected term parameter: ~s~%" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-CLARIFICATIONS" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ),
                        ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Clarifying term to be lexified" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                            "Which of the following terms do you mean?" ) ) ), ConsesLow.list( makeSymbol( "CHOICES" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                                "SECOND" ) ), makeSymbol( "TERM-CLARIFICATIONS" ) ) ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                                    "FIRST" ) ), makeSymbol( "TERM-CLARIFICATIONS" ) ) ), makeSymbol( "DEFAULT-OFFSET" ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ),
                                        ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
                                            "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TERM-CLARIFICATIONS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                "PIF" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol(
                                                    "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol(
                                                        "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "TIP" ), makeSymbol( "VALUES" ), makeSymbol( "DEFAULT-OFFSET" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                            T ) ) );
    $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str440$Unexpected_term_parameter___s__ = makeString( "Unexpected term parameter: ~s~%" );
    $str441$Clarifying_term_to_be_lexified = makeString( "Clarifying term to be lexified" );
    $str442$Which_of_the_following_terms_do_y = makeString( "Which of the following terms do you mean?" );
    $sym443$SECOND = makeSymbol( "SECOND" );
    $sym444$FIRST = makeSymbol( "FIRST" );
    $sym445$SME_LI_PRE_GENERAL_ASK_TERM_SELECTION_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-ASK-TERM-SELECTION-METHOD" );
    $sym446$CHECK_TERM_SELECTION = makeSymbol( "CHECK-TERM-SELECTION" );
    $list447 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
        makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "LEX-FORT-FOR-STRING" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ),
            makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FORT-P" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
                .list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "A valid concept must be specified" ) ), ConsesLow.list( makeSymbol(
                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
                            .list( makeSymbol( "ASK-TERM" ), makeSymbol( "CHECK-TERM" ), makeSymbol( "ASK-TERM-SELECTION" ), makeSymbol( "CHECK-TERM-SELECTION" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list(
                                makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ), ConsesLow.list(
                                    makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $list449 = ConsesLow.list( makeSymbol( "ASK-TERM" ), makeSymbol( "CHECK-TERM" ), makeSymbol( "ASK-TERM-SELECTION" ), makeSymbol( "CHECK-TERM-SELECTION" ) );
    $sym450$SME_LI_PRE_GENERAL_CHECK_TERM_SELECTION_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-TERM-SELECTION-METHOD" );
    $sym451$ASK_PHRASE = makeSymbol( "ASK-PHRASE" );
    $list452 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list(
            makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                "Checking phrase for the lexification" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "How would you like to refer to the concept '~a'?" ),
                    makeSymbol( "TERM-DESC" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol( "*PHRASE-SPECIFICATION-TIP*" ) ), ConsesLow.list( makeSymbol( "SIZE" ), makeInteger( 60 ) ), ConsesLow.list( makeSymbol(
                        "SKIP?" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "PHRASE" ) ) ), makeSymbol( "DEFAULT" )
    } ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-OK?" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "PREFERRED-LOOSE-LEXIFICATION-PHRASE-FOR-TERM" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "DEFAULT" ), makeSymbol( "PHRASE" ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), makeSymbol( "PHRASE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                "*USE-INFERRED-PHRASES?*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "DEFAULT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "PHRASE" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                        ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "IS-DETERMINER?" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "PHRASE-WORDS" ) ) ), ConsesLow
                            .list( makeSymbol( "COLLECTION-IN-ANY-MT?" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MESSAGE" ), ConsesLow.list(
                                makeSymbol( "FORMAT" ), NIL, makeString( "Assuming you don't want to use the determiner ~s in the phrase ~s" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "PHRASE-WORDS" ) ),
                                makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT" ), ConsesLow.list( makeSymbol( "JOIN-WORDS" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol(
                                    "PHRASE-WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "" ) ), ConsesLow.list(
                                        makeSymbol( "CSETQ" ), makeSymbol( "SKIP?" ), NIL ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "MESSAGE" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                            "PIF" ), makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-FREE-FORM" ), makeSymbol(
                                                "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "TIP" ), makeSymbol( "SIZE" ), makeSymbol( "DEFAULT" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                    T ) ) );
    $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str454$Checking_phrase_for_the_lexificat = makeString( "Checking phrase for the lexification" );
    $str455$How_would_you_like_to_refer_to_th = makeString( "How would you like to refer to the concept '~a'?" );
    $str456$Assuming_you_don_t_want_to_use_th = makeString( "Assuming you don't want to use the determiner ~s in the phrase ~s" );
    $str457$ = makeString( "" );
    $sym458$SME_LI_PRE_GENERAL_ASK_PHRASE_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-ASK-PHRASE-METHOD" );
    $sym459$CHECK_PHRASE = makeSymbol( "CHECK-PHRASE" );
    $list460 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEX-NORMALIZE-STRING" ), ConsesLow.list( makeSymbol(
        "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "PHRASE" ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LEX-EMPTY-STRING?" ), makeSymbol( "PHRASE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol(
            "LEX-NORMALIZE-STRING" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
                "LEXWIZ-PARAMETERS" ) ), makeSymbol( "PHRASE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LEX-EMPTY-STRING?" ), makeSymbol( "PHRASE" ) ), ConsesLow.list( makeSymbol(
                    "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "A valid phrase must be specified" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                        ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                                makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow
                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow
                                        .list( makeSymbol( "RET" ), T ) );
    $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str462$A_valid_phrase_must_be_specified = makeString( "A valid phrase must be specified" );
    $list463 = ConsesLow.list( makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ) );
    $sym464$SME_LI_PRE_GENERAL_CHECK_PHRASE_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-PHRASE-METHOD" );
    $sym465$ASK_AMBIGUITY = makeSymbol( "ASK-AMBIGUITY" );
    $list466 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ),
            makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Checking phrase ambiguity" ) ) ), ConsesLow.list( makeSymbol(
                "OTHER-TERMS" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "PHRASE-DENOTATIONS" ), makeSymbol( "SELF" ), makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list(
                    makeSymbol( "OTHER-TERM-DESCS" ), ConsesLow.list( makeSymbol( "MAP-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DESCRIBE-TERM" ) ), makeSymbol(
                        "OTHER-TERMS" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                            "In addition to '~a', phrase ~s also refers to the following:~a~a~%~%Is that OK?" ), makeSymbol( "TERM-DESC" ), makeSymbol( "PHRASE" ), makeSymbol( "*NEWLINE-TAB*" ), ConsesLow.list(
                                makeSymbol( "JOIN-STRINGS" ), makeSymbol( "OTHER-TERM-DESCS" ), makeSymbol( "*NEWLINE-TAB*" ) ) ) ), ConsesLow.list( makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "NULL" ),
                                    makeSymbol( "OTHER-TERMS" ) ) ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), makeSymbol( "SKIP?" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
                                        "SKIP?" ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol( "SELF" ), makeSymbol(
                                            "TITLE" ), makeSymbol( "QUESTION" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str468$Checking_phrase_ambiguity = makeString( "Checking phrase ambiguity" );
    $str469$In_addition_to___a___phrase__s_al = makeString( "In addition to '~a', phrase ~s also refers to the following:~a~a~%~%Is that OK?" );
    $sym470$SME_LI_PRE_GENERAL_ASK_AMBIGUITY_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-ASK-AMBIGUITY-METHOD" );
    $sym471$CHECK_AMBIGUITY = makeSymbol( "CHECK-AMBIGUITY" );
    $list472 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OK?" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), makeSymbol( "OK?" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-OK?" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), T ), ConsesLow.list( makeSymbol( "CSETF" ),
            ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATES" ),
                ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ), makeSymbol(
                        "ASK-AMBIGUITY" ), makeSymbol( "CHECK-AMBIGUITY" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                "RET" ), T ) );
    $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $list474 = ConsesLow.list( makeSymbol( "ASK-PHRASE" ), makeSymbol( "CHECK-PHRASE" ), makeSymbol( "ASK-AMBIGUITY" ), makeSymbol( "CHECK-AMBIGUITY" ) );
    $sym475$SME_LI_PRE_GENERAL_CHECK_AMBIGUITY_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-AMBIGUITY-METHOD" );
    $sym476$ASK_PROPER_NAME_STATUS = makeSymbol( "ASK-PROPER-NAME-STATUS" );
    $list477 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list(
            makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeString( "Checking whether the phrase is a proper name" ) ), ConsesLow.list(
                makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Is the phrase \"~a\" a name?" ), makeSymbol( "PHRASE" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol(
                    "*PROPER-NAME-STATUS-TIP*" ) ), ConsesLow.list( makeSymbol( "NAMEABLE?" ), ConsesLow.list( makeSymbol( "IS-NAMEABLE-ENTITY?" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
                        "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "HAS-UPPERCASE-LETTER?" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "COUNT-IF" ), ConsesLow.list( makeSymbol(
                            "FUNCTION" ), makeSymbol( "UPPER-CASE-P" ) ), makeSymbol( "PHRASE" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "USE-INFERRED-TYPE?" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
                                .list( makeSymbol( "FORGE-AHEAD?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "NAMEABLE?" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol(
                                    "HAS-UPPERCASE-LETTER?" ) ) ) ) ), ConsesLow.list( makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "IS-RELATIONAL?" ), ConsesLow.list(
                                        makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), makeSymbol( "USE-INFERRED-TYPE?" ) ) )
    } ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "SKIP?" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUALIFIER" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol(
        "NAMEABLE?" ), makeString( "is" ), makeString( "isn't" ) ) ), ConsesLow.list( makeSymbol( "REASON" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
            "Assuming phrase ~s ~a a proper name since concept '~a' ~a a nameable entity" ), makeSymbol( "PHRASE" ), makeSymbol( "QUALIFIER" ), makeSymbol( "TERM-DESC" ), makeSymbol( "QUALIFIER" ) ) ) ), ConsesLow.list(
                makeSymbol( "PWHEN" ), makeSymbol( "USE-INFERRED-TYPE?" ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "REASON" ) ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol(
                    "SELF" ), makeSymbol( "NAMEABLE?" ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol( "SELF" ),
                        makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "TIP" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD" );
    $str479$Checking_whether_the_phrase_is_a_ = makeString( "Checking whether the phrase is a proper name" );
    $str480$Is_the_phrase___a__a_name_ = makeString( "Is the phrase \"~a\" a name?" );
    $sym481$UPPER_CASE_P = makeSymbol( "UPPER-CASE-P" );
    $str482$is = makeString( "is" );
    $str483$isn_t = makeString( "isn't" );
    $str484$Assuming_phrase__s__a_a_proper_na = makeString( "Assuming phrase ~s ~a a proper name since concept '~a' ~a a nameable entity" );
    $sym485$SME_LI_PRE_GENERAL_ASK_PROPER_NAME_STATUS_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-ASK-PROPER-NAME-STATUS-METHOD" );
    $sym486$CHECK_PROPER_NAME_STATUS = makeSymbol( "CHECK-PROPER-NAME-STATUS" );
    $list487 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "IS-RELATIONAL?" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
        makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-IS-PROPER?" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol(
            "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym488$SME_LI_PRE_GENERAL_CHECK_PROPER_NAME_STATUS_METHOD = makeSymbol( "SME-LI-PRE-GENERAL-CHECK-PROPER-NAME-STATUS-METHOD" );
    $list489 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "SET-STATES" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-ABBREVIATION-STATUS" ), makeSymbol( "CHECK-ABBREVIATION-STATUS" ), makeSymbol( "ASK-PREDICATE-TYPE" ),
                makeSymbol( "CHECK-PREDICATE-TYPE" ), makeSymbol( "ASK-REFINED-PREDICATION" ), makeSymbol( "CHECK-REFINED-PREDICATION" ), makeSymbol( "END-INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    makeSymbol( "SELF" ) ) );
    $list490 = ConsesLow.list( makeSymbol( "ASK-ABBREVIATION-STATUS" ), makeSymbol( "CHECK-ABBREVIATION-STATUS" ), makeSymbol( "ASK-PREDICATE-TYPE" ), makeSymbol( "CHECK-PREDICATE-TYPE" ), makeSymbol(
        "ASK-REFINED-PREDICATION" ), makeSymbol( "CHECK-REFINED-PREDICATION" ), makeSymbol( "END-INTERACTION" ) );
    $sym491$SME_LI_PROPER_NAME_INITIALIZE_METHOD = makeSymbol( "SME-LI-PROPER-NAME-INITIALIZE-METHOD" );
    $sym492$ASK_ABBREVIATION_STATUS = makeSymbol( "ASK-ABBREVIATION-STATUS" );
    $list493 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "TITLE" ), makeString( "Checking abbreviation predication" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Is ~s an abbreviation?" ),
            makeSymbol( "PHRASE" ) ) ), ConsesLow.list( makeSymbol( "NO-SPACE?" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "CHAR-POSITION" ), Characters.CHAR_space, makeSymbol( "PHRASE" ) ) ) ),
        makeSymbol( "REASON" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NO-SPACE?" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "UPPER-CASE-STRING-P" ), makeSymbol( "PHRASE" ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "REASON" ), makeString( "uppercase" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ENDS-WITH" ), makeSymbol( "PHRASE" ),
                makeString( "." ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "REASON" ), makeString( "ends with period" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "REASON" ), ConsesLow.list(
                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MESSAGE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Checking whether ~s is an abbreviation since ~a" ), makeSymbol(
                        "PHRASE" ), makeSymbol( "REASON" ) ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "MESSAGE" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol(
                            "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $str495$Checking_abbreviation_predication = makeString( "Checking abbreviation predication" );
    $str496$Is__s_an_abbreviation_ = makeString( "Is ~s an abbreviation?" );
    $str497$uppercase = makeString( "uppercase" );
    $str498$_ = makeString( "." );
    $str499$ends_with_period = makeString( "ends with period" );
    $str500$Checking_whether__s_is_an_abbrevi = makeString( "Checking whether ~s is an abbreviation since ~a" );
    $sym501$SME_LI_PROPER_NAME_ASK_ABBREVIATION_STATUS_METHOD = makeSymbol( "SME-LI-PROPER-NAME-ASK-ABBREVIATION-STATUS-METHOD" );
    $sym502$CHECK_ABBREVIATION_STATUS = makeSymbol( "CHECK-ABBREVIATION-STATUS" );
    $list503 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-IS-ABBREVIATION?" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "GET-ANSWER" ),
        makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $sym505$SME_LI_PROPER_NAME_CHECK_ABBREVIATION_STATUS_METHOD = makeSymbol( "SME-LI-PROPER-NAME-CHECK-ABBREVIATION-STATUS-METHOD" );
    $sym506$ASK_PREDICATE_TYPE = makeSymbol( "ASK-PREDICATE-TYPE" );
    $list507 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "IS-ABBREVIATION?" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-IS-ABBREVIATION?" ), makeSymbol(
        "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "PRED-TYPE" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "IS-ABBREVIATION?" ), makeString( "abbreviation types" ), makeString(
            "specialized kinds of names" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ),
                ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
                    "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeString( "Determining proper name type" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
                        makeString( "If ~s is one of the ~a of names listed below, specify the correct type. Otherwise, just press OK." ), makeSymbol( "PHRASE" ), makeSymbol( "PRED-TYPE" ) ) ), ConsesLow.list(
                            makeSymbol( "TIP" ), makeString(
                                "When in doubt, select the default. For example, currently there are no specializations for people's name including title (e.g., \"General Francisco Franco\")." ) ) ), ConsesLow.list(
                                    makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "CHOICES" ), makeSymbol( "PREDICATES" ), makeSymbol( "DEFAULT-OFFSET" ) ), ConsesLow.list( makeSymbol(
                                        "DETERMINE-PROPER-NAME-PRED-CHOICES" ), makeSymbol( "TERM" ), makeSymbol( "IS-ABBREVIATION?" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ),
                                            makeSymbol( "CHOICES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MESSAGE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
                                                makeString( "No specialized proper name types apply to '~a'" ), makeSymbol( "TERM-DESC" ) ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol(
                                                    "MESSAGE" ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ),
                                                        makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "TIP" ), makeSymbol( "PREDICATES" ), makeSymbol( "DEFAULT-OFFSET" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $str509$abbreviation_types = makeString( "abbreviation types" );
    $str510$specialized_kinds_of_names = makeString( "specialized kinds of names" );
    $str511$Determining_proper_name_type = makeString( "Determining proper name type" );
    $str512$If__s_is_one_of_the__a_of_names_l = makeString( "If ~s is one of the ~a of names listed below, specify the correct type. Otherwise, just press OK." );
    $str513$When_in_doubt__select_the_default = makeString(
        "When in doubt, select the default. For example, currently there are no specializations for people's name including title (e.g., \"General Francisco Franco\")." );
    $str514$No_specialized_proper_name_types_ = makeString( "No specialized proper name types apply to '~a'" );
    $sym515$SME_LI_PROPER_NAME_ASK_PREDICATE_TYPE_METHOD = makeSymbol( "SME-LI-PROPER-NAME-ASK-PREDICATE-TYPE-METHOD" );
    $sym516$CHECK_PREDICATE_TYPE = makeSymbol( "CHECK-PREDICATE-TYPE" );
    $list517 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PROPER-NAME-PRED" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, makeSymbol( "PROPER-NAME-PRED" ), makeString( "n/a" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PROPER-NAME-PRED" ),
            makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "PROPER-NAME-PRED" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $str519$n_a = makeString( "n/a" );
    $sym520$SME_LI_PROPER_NAME_CHECK_PREDICATE_TYPE_METHOD = makeSymbol( "SME-LI-PROPER-NAME-CHECK-PREDICATE-TYPE-METHOD" );
    $sym521$ASK_REFINED_PREDICATION = makeSymbol( "ASK-REFINED-PREDICATION" );
    $list522 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "LEXWIZ-PROPER-NAME-PRED" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "CYC-TERM" ), ConsesLow.list(
            makeSymbol( "LEX-FORT-FOR-STRING" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "IS-PERSON?" ), ConsesLow.list( makeSymbol( "ISA-IN-ANY-MT?" ), makeSymbol( "CYC-TERM" ), constant_handles
                .reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
                    makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "IS-PERSON?" ), makeString( "Checking constituents of the human name" ), makeString(
                        "Checking for possible abbreviations" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "For the name ~s, please complete the following:" ),
                            makeSymbol( "PHRASE" ) ) ), ConsesLow.list( makeSymbol( "PREDS" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "IS-PERSON?" ), makeSymbol( "*LEXWIZ-PERSON-SUB-PREDICATES*" ), ConsesLow
                                .list( makeSymbol( "FILTER-ABBREVIATION-PREDICATES" ), makeSymbol( "CYC-TERM" ) ) ) ), ConsesLow.list( makeSymbol( "LABELS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                    makeSymbol( "FUNCTION" ), makeSymbol( "LEX-DESCRIBE-TERM" ) ), makeSymbol( "PREDS" ) ) ), makeSymbol( "DEFAULTS" ), makeSymbol( "DESCRIPTIONS" ), makeSymbol( "TIP" ), makeSymbol(
                                        "SIZES" )
    } ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol( "DEFAULTS" ), makeSymbol( "DESCRIPTIONS" ) ), ConsesLow.list( makeSymbol( "INFER-PROPER-NAME-SUB-PREDICATIONS" ), makeSymbol(
        "SELF" ), makeSymbol( "CYC-TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "PREDS" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-PROPER-SUB-PREDICATES" ), makeSymbol(
            "LEXWIZ-SETTINGS" ) ), makeSymbol( "PREDS" ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
                .list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "IS-PERSON?" ), ConsesLow.list( EQUAL, makeSymbol( "PRED" ), makeString( "nameString" ) ), ConsesLow.list( makeSymbol( ">" ),
                    ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "NAME-TOKENIZE" ), makeSymbol( "PHRASE" ) ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( ">=" ), ConsesLow.list( makeSymbol(
                        "LENGTH" ), ConsesLow.list( makeSymbol( "NAME-TOKENIZE" ), makeSymbol( "PHRASE" ) ) ), makeSymbol( "*LEXWIZ-ABBREVIATION-CHECK-MIN-WORDS*" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                            .list( ConsesLow.list( makeSymbol( "REASON" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "IS-PERSON?" ), makeString( "for a person" ), makeString( "quite long" ) ) ), ConsesLow.list(
                                makeSymbol( "MESSAGE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Since ~s is ~a, checking additional name types" ), makeSymbol( "PHRASE" ), makeSymbol( "REASON" ) ) ) ),
                            ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "MESSAGE" ) ), ConsesLow.list( new SubLObject[]
                            { makeSymbol( "ASK-GENERIC-MULTIPLE-FREE-FORM" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "TIP" ), makeSymbol( "LABELS" ), makeSymbol( "SIZES" ),
                              makeSymbol( "DEFAULTS" ), makeSymbol( "DESCRIPTIONS" )
                            } ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $const524$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $str525$Checking_constituents_of_the_huma = makeString( "Checking constituents of the human name" );
    $str526$Checking_for_possible_abbreviatio = makeString( "Checking for possible abbreviations" );
    $str527$For_the_name__s__please_complete_ = makeString( "For the name ~s, please complete the following:" );
    $str528$nameString = makeString( "nameString" );
    $str529$for_a_person = makeString( "for a person" );
    $str530$quite_long = makeString( "quite long" );
    $str531$Since__s_is__a__checking_addition = makeString( "Since ~s is ~a, checking additional name types" );
    $sym532$SME_LI_PROPER_NAME_ASK_REFINED_PREDICATION_METHOD = makeSymbol( "SME-LI-PROPER-NAME-ASK-REFINED-PREDICATION-METHOD" );
    $sym533$CHECK_REFINED_PREDICATION = makeSymbol( "CHECK-REFINED-PREDICATION" );
    $list534 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REFINED-PREDICATIONS" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "PREDICATES" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-PROPER-SUB-PREDICATES" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol(
            "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "PREDICATION" ), makeSymbol( "I" ), makeSymbol(
                "REFINED-PREDICATIONS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "PREDICATION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                    ConsesLow.list( makeSymbol( "PREDICATE" ), ConsesLow.list( makeSymbol( "ELT" ), makeSymbol( "PREDICATES" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                        "BQ-LIST" ), makeSymbol( "PREDICATE" ), makeSymbol( "TERM" ), makeSymbol( "PREDICATION" ) ), ConsesLow.list( makeSymbol( "LEXWIZ-OTHER-FORMULAS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD" );
    $sym536$SME_LI_PROPER_NAME_CHECK_REFINED_PREDICATION_METHOD = makeSymbol( "SME-LI-PROPER-NAME-CHECK-REFINED-PREDICATION-METHOD" );
    $sym537$INFER_PROPER_NAME_SUB_PREDICATIONS = makeSymbol( "INFER-PROPER-NAME-SUB-PREDICATIONS" );
    $list538 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "PROPER-NAME-PREDICATES" ) );
    $list539 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeString( "" ) ), ConsesLow.list( makeSymbol( "SUFFIX" ), makeString( "" ) ), ConsesLow.list(
        makeSymbol( "IS-PERSON?" ), ConsesLow.list( EQUAL, makeSymbol( "*LEXWIZ-PERSON-SUB-PREDICATES*" ), makeSymbol( "PROPER-NAME-PREDICATES" ) ) ), makeSymbol( "SUB-PREDICATIONS" ), makeSymbol( "DESCRIPTIONS" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-TOKENS" ), ConsesLow.list( makeSymbol( "NAME-TOKENIZE" ), makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "IS-NAME-TITLE?" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NAME-TOKENS" ) ) ), ConsesLow.list( makeSymbol( "CAND" ),
                ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NAME-TOKENS" ) ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "ENDS-WITH" ),
                    ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NAME-TOKENS" ) ), makeString( "." ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FIRST" ),
                        makeSymbol( "NAME-TOKENS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "JOIN-WORDS" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol(
                            "NAME-TOKENS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-TOKENS" ), ConsesLow.list( makeSymbol( "NAME-TOKENIZE" ), makeSymbol(
                                "PHRASE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ENDS-WITH" ), ConsesLow.list( makeSymbol( "PENULTIMATE-ONE" ), makeSymbol( "NAME-TOKENS" ) ),
                                    makeString( "," ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUFFIX" ), ConsesLow.list( makeSymbol( "LAST-ONE" ), makeSymbol( "NAME-TOKENS" ) ) ), ConsesLow.list(
                                        makeSymbol( "CSETQ" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "JOIN-WORDS" ), ConsesLow.list( makeSymbol( "REMOVE-LAST" ), makeSymbol( "NAME-TOKENS" ) ) ) ), ConsesLow
                                            .list( makeSymbol( "CSETQ" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "TRIM-SIDES" ), makeSymbol( "PHRASE" ), Characters.CHAR_comma ) ) ) ), ConsesLow.list(
                                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-TOKENS" ), ConsesLow.list( makeSymbol( "NAME-TOKENIZE" ), makeSymbol( "PHRASE" ) ) ), ConsesLow
                                                    .list( makeSymbol( "FAMILY-NAME-FIRST?" ), ConsesLow.list( makeSymbol( "HAS-FAMILY-NAME-FIRST?" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol(
                                                        "FAMILY-NAME-POSITION" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "FAMILY-NAME-FIRST?" ), ZERO_INTEGER, ConsesLow.list( makeSymbol( "1-" ), ConsesLow.list(
                                                            makeSymbol( "LENGTH" ), makeSymbol( "NAME-TOKENS" ) ) ) ) ), ConsesLow.list( makeSymbol( "GIVEN-NAME-POSITION" ), ConsesLow.list( makeSymbol( "FIF" ),
                                                                makeSymbol( "FAMILY-NAME-FIRST?" ), ConsesLow.list( makeSymbol( "1-" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "NAME-TOKENS" ) ) ),
                                                                ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "MIDDLE-NAME-POSITION" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "FAMILY-NAME-FIRST?" ), ConsesLow
                                                                    .list( makeSymbol( "1-" ), makeSymbol( "GIVEN-NAME-POSITION" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                                        "FAMILY-NAME-FIRST?" ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                                            "Assuming family name given first in ~s based on ethnicity" ), makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow
                                                                                .list( makeSymbol( "PREDICATE" ), makeSymbol( "PROPER-NAME-PREDICATES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                                                                                    .list( makeSymbol( "SUB-NAME" ), makeString( "" ) ), ConsesLow.list( makeSymbol( "DESCRIPTION" ), makeString( "" ) ) ), ConsesLow.list(
                                                                                        new SubLObject[]
                                                                                        { makeSymbol( "PCASE" ), makeSymbol( "PREDICATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                            "familyName" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUB-NAME" ), ConsesLow.list( makeSymbol( "ELT" ),
                                                                                                makeSymbol( "NAME-TOKENS" ), makeSymbol( "FAMILY-NAME-POSITION" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                    .reader_make_constant_shell( makeString( "givenNames" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                                                                                                        makeSymbol( "=" ), makeSymbol( "FAMILY-NAME-POSITION" ), makeSymbol( "GIVEN-NAME-POSITION" ) ), ConsesLow.list(
                                                                                                            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GIVEN-NAME" ), ConsesLow.list( makeSymbol(
                                                                                                                "ELT" ), makeSymbol( "NAME-TOKENS" ), makeSymbol( "GIVEN-NAME-POSITION" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                    "PUNLESS" ), ConsesLow.list( makeSymbol( "NAME-ABBREVIATION?" ), makeSymbol( "GIVEN-NAME" ) ), ConsesLow
                                                                                                                        .list( makeSymbol( "CSETQ" ), makeSymbol( "SUB-NAME" ), makeSymbol( "GIVEN-NAME" ) ) ) ) ) ),
                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "middleName" ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                                              ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "NAME-TOKENS" ) ), TWO_INTEGER ),
                                                                                              ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MIDDLE-NAME" ), ConsesLow.list( makeSymbol(
                                                                                                  "ELT" ), makeSymbol( "NAME-TOKENS" ), makeSymbol( "MIDDLE-NAME-POSITION" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                                                                                                      ConsesLow.list( makeSymbol( "NAME-ABBREVIATION?" ), makeSymbol( "MIDDLE-NAME" ) ), ConsesLow.list( makeSymbol(
                                                                                                          "CSETQ" ), makeSymbol( "SUB-NAME" ), makeSymbol( "MIDDLE-NAME" ) ) ) ) ) ), ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "titleOfPerson-String" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                  makeSymbol( "SUB-NAME" ), makeSymbol( "TITLE" ) ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "nameSuffix" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                          makeSymbol( "SUB-NAME" ), makeSymbol( "SUFFIX" ) ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "initialsString" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                  "PUNLESS" ), makeSymbol( "IS-PERSON?" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                                      makeSymbol( "DESCRIPTION" ), makeString(
                                                                                                                                          "(first letters of names; ex: FDR, JFK)" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "initialismString" ) ), ConsesLow
                                                                                                                                                  .list( makeSymbol( "CSETQ" ), makeSymbol( "DESCRIPTION" ), makeString(
                                                                                                                                                      "(first letters; ex: UNHCR, NATO, scuba)" ) ) ), ConsesLow.list(
                                                                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "acronymString" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                                                                  makeSymbol( "DESCRIPTION" ), makeString(
                                                                                                                                                                      "(prefixes; ex: RADAR = RAdio Detection)" ) ) ),
                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "abbreviationString-PN" ) ), ConsesLow.list( makeSymbol(
                                                                                              "CSETQ" ), makeSymbol( "DESCRIPTION" ), makeString( "(short form; ex: dict., parens)" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                  "OTHERWISE" ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString(
                                                                                                      "Unexpected pred ~s in infer-proper-name-sub-predications~%" ), makeSymbol( "PREDICATE" ) ) )
                                                                                        } ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SUB-NAME" ), makeSymbol( "SUB-PREDICATIONS" ) ), ConsesLow.list(
                                                                                            makeSymbol( "CPUSH" ), makeSymbol( "DESCRIPTION" ), makeSymbol( "DESCRIPTIONS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                                                                ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "SUB-PREDICATIONS" ) ),
                                                                                                    ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "DESCRIPTIONS" ) ) ) ) ) );
    $str540$_ = makeString( "," );
    $str541$Assuming_family_name_given_first_ = makeString( "Assuming family name given first in ~s based on ethnicity" );
    $const542$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $const543$givenNames = constant_handles.reader_make_constant_shell( makeString( "givenNames" ) );
    $const544$middleName = constant_handles.reader_make_constant_shell( makeString( "middleName" ) );
    $const545$titleOfPerson_String = constant_handles.reader_make_constant_shell( makeString( "titleOfPerson-String" ) );
    $const546$nameSuffix = constant_handles.reader_make_constant_shell( makeString( "nameSuffix" ) );
    $const547$initialsString = constant_handles.reader_make_constant_shell( makeString( "initialsString" ) );
    $str548$_first_letters_of_names__ex__FDR_ = makeString( "(first letters of names; ex: FDR, JFK)" );
    $const549$initialismString = constant_handles.reader_make_constant_shell( makeString( "initialismString" ) );
    $str550$_first_letters__ex__UNHCR__NATO__ = makeString( "(first letters; ex: UNHCR, NATO, scuba)" );
    $const551$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $str552$_prefixes__ex__RADAR___RAdio_Dete = makeString( "(prefixes; ex: RADAR = RAdio Detection)" );
    $const553$abbreviationString_PN = constant_handles.reader_make_constant_shell( makeString( "abbreviationString-PN" ) );
    $str554$_short_form__ex__dict___parens_ = makeString( "(short form; ex: dict., parens)" );
    $str555$Unexpected_pred__s_in_infer_prope = makeString( "Unexpected pred ~s in infer-proper-name-sub-predications~%" );
    $sym556$SME_LI_PROPER_NAME_INFER_PROPER_NAME_SUB_PREDICATIONS_METHOD = makeSymbol( "SME-LI-PROPER-NAME-INFER-PROPER-NAME-SUB-PREDICATIONS-METHOD" );
    $list557 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "SET-STATES" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "GUESS-HEADWORD-POSITION" ), makeSymbol( "CHECK-GUESSED-HEADWORD-POSITION" ), makeSymbol( "ASK-HEADWORD-POSITION" ), makeSymbol( "CHECK-HEADWORD-POSITION" ), makeSymbol( "ASK-PART-OF-SPEECH" ),
              makeSymbol( "CHECK-PART-OF-SPEECH" ), makeSymbol( "SHOW-HEADWORD-VARIATIONS" ), makeSymbol( "CHECK-HEADWORD-VARIATIONS" ), makeSymbol( "END-INTERACTION" )
    } ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list558 = ConsesLow.list( new SubLObject[] { makeSymbol( "GUESS-HEADWORD-POSITION" ), makeSymbol( "CHECK-GUESSED-HEADWORD-POSITION" ), makeSymbol( "ASK-HEADWORD-POSITION" ), makeSymbol( "CHECK-HEADWORD-POSITION" ),
      makeSymbol( "ASK-PART-OF-SPEECH" ), makeSymbol( "CHECK-PART-OF-SPEECH" ), makeSymbol( "SHOW-HEADWORD-VARIATIONS" ), makeSymbol( "CHECK-HEADWORD-VARIATIONS" ), makeSymbol( "END-INTERACTION" )
    } );
    $sym559$SME_LI_DENOTATIONAL_INITIALIZE_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-INITIALIZE-METHOD" );
    $sym560$GUESS_HEADWORD_POSITION = makeSymbol( "GUESS-HEADWORD-POSITION" );
    $list561 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow
            .list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "PHRASE" ), NIL ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeString( "Guessing the headword of the phrase" ) ), ConsesLow.list( makeSymbol(
                "GUESSED-OFFSET" ), ConsesLow.list( makeSymbol( "MOST-LIKELY-HEADWORD" ), makeSymbol( "PHRASE-WORDS" ) ) ), ConsesLow.list( makeSymbol( "GUESSED-HEADWORD" ), ConsesLow.list( makeSymbol( "ELT" ),
                    makeSymbol( "PHRASE-WORDS" ), makeSymbol( "GUESSED-OFFSET" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Is ~s a type of ~s?" ),
                        makeSymbol( "PHRASE" ), makeSymbol( "GUESSED-HEADWORD" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol( "*HEADWORD-GUESSING-TIP*" ) ), ConsesLow.list( makeSymbol( "SKIP?" ), ConsesLow.list(
                            makeSymbol( "=" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PHRASE-WORDS" ) ), ONE_INTEGER ) )
    } ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "GUESSED-OFFSET" ) ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADWORD-DENOTS" ), ConsesLow.list( makeSymbol( "PHRASE-DENOTATIONS" ), makeSymbol( "SELF" ), makeSymbol(
            "GUESSED-HEADWORD" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INTERSECTION" ), makeSymbol( "HEADWORD-DENOTS" ), ConsesLow.list(
                makeSymbol( "CONS" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "MIN-GENLS" ), makeSymbol( "TERM" ) ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                    "FORMAT" ), NIL, makeString( "Since ~s is a type of ~s, assuming headword is latter" ), makeSymbol( "PHRASE" ), makeSymbol( "GUESSED-HEADWORD" ) ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ),
                        makeSymbol( "SELF" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SKIP?" ), T ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol(
                            "SKIP?" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol(
                                "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $str563$Guessing_the_headword_of_the_phra = makeString( "Guessing the headword of the phrase" );
    $str564$Is__s_a_type_of__s_ = makeString( "Is ~s a type of ~s?" );
    $sym565$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const566$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str567$Since__s_is_a_type_of__s__assumin = makeString( "Since ~s is a type of ~s, assuming headword is latter" );
    $sym568$SME_LI_DENOTATIONAL_GUESS_HEADWORD_POSITION_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-GUESS-HEADWORD-POSITION-METHOD" );
    $sym569$CHECK_GUESSED_HEADWORD_POSITION = makeSymbol( "CHECK-GUESSED-HEADWORD-POSITION" );
    $list570 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADWORD-OK?" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), makeSymbol( "HEADWORD-OK?" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
            "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "PHRASE" ), NIL ) ), ConsesLow.list( makeSymbol(
                "REJECTED-POSITION" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "LENGTH>" ), makeSymbol( "PHRASE-WORDS" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ),
                        MINUS_ONE_INTEGER ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "LENGTH=" ), makeSymbol( "PHRASE-WORDS" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                            "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "-" ), THREE_INTEGER, makeSymbol( "REJECTED-POSITION" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym571$SME_LI_DENOTATIONAL_CHECK_GUESSED_HEADWORD_POSITION_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-CHECK-GUESSED-HEADWORD-POSITION-METHOD" );
    $sym572$ASK_HEADWORD_POSITION = makeSymbol( "ASK-HEADWORD-POSITION" );
    $list573 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "TITLE" ), makeString( "Checking the qualified word of the phrase" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
            "In ~s, which word is being qualified by the others?" ), makeSymbol( "PHRASE" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol( "*HEADWORD-SELECTION-TIP*" ) ), ConsesLow.list( makeSymbol(
                "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "PHRASE" ), NIL ) ), ConsesLow.list( makeSymbol( "OFFSETS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                    makeSymbol( "FUNCTION" ), makeSymbol( "TO-STRING" ) ), ConsesLow.list( makeSymbol( "NUM-LIST" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PHRASE-WORDS" ) ) ) ) ), ConsesLow.list(
                        makeSymbol( "DEFAULT-POSITION" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                            makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PHRASE-WORDS" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "<=" ), makeSymbol(
                                "DEFAULT-POSITION" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol(
                                    "PHRASE-WORDS" ), makeSymbol( "TIP" ), makeSymbol( "OFFSETS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), ConsesLow
                                        .list( makeSymbol( "FIRST" ), makeSymbol( "OFFSETS" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                            T ) ) );
    $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $str575$Checking_the_qualified_word_of_th = makeString( "Checking the qualified word of the phrase" );
    $str576$In__s__which_word_is_being_qualif = makeString( "In ~s, which word is being qualified by the others?" );
    $sym577$TO_STRING = makeSymbol( "TO-STRING" );
    $sym578$SME_LI_DENOTATIONAL_ASK_HEADWORD_POSITION_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-ASK-HEADWORD-POSITION-METHOD" );
    $sym579$CHECK_HEADWORD_POSITION = makeSymbol( "CHECK-HEADWORD-POSITION" );
    $list580 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), ConsesLow.list( makeSymbol(
        "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ) ), ConsesLow.list( makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
            "HEADWORD-OFFSET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "EXTRACT-INTEGER" ), makeSymbol(
                "ANSWER" ) ), MINUS_ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<=" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol(
                    "LEXWIZ-PARAMETERS" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list(
                        makeSymbol( "1+" ), makeSymbol( "HEADWORD-OFFSET" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol(
                            "HEADWORD-OFFSET" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "HEADWORD-OFFSET" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PHRASE-WORDS" ) ) ) ), ConsesLow
                                .list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "invalid headword offset: ~a~%" ), makeSymbol( "HEADWORD-OFFSET" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                                    "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString( "The headword position must be specified" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                        ConsesLow.list( makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                            "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                ConsesLow.list( makeSymbol( "ASK-HEADWORD-POSITION" ), makeSymbol( "CHECK-HEADWORD-POSITION" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol(
                                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $str581$invalid_headword_offset___a__ = makeString( "invalid headword offset: ~a~%" );
    $str582$The_headword_position_must_be_spe = makeString( "The headword position must be specified" );
    $list583 = ConsesLow.list( makeSymbol( "ASK-HEADWORD-POSITION" ), makeSymbol( "CHECK-HEADWORD-POSITION" ) );
    $sym584$SME_LI_DENOTATIONAL_CHECK_HEADWORD_POSITION_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-CHECK-HEADWORD-POSITION-METHOD" );
    $sym585$ASK_PART_OF_SPEECH = makeSymbol( "ASK-PART-OF-SPEECH" );
    $list586 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ) ), ConsesLow.list( makeSymbol(
            "HEADWORD-POSITION" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "HEADWORD" ), ConsesLow.list( makeSymbol( "ELT" ),
                makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "HEADWORD-POSITION" ) ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                    "Determining how the word '~a' is used in ~s" ), makeSymbol( "HEADWORD" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "TIP" ),
                        NIL ), makeSymbol( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PHRASE-WORDS" ) ), ONE_INTEGER ),
                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Checking usage of '~a'" ), makeSymbol( "HEADWORD" ) ) ) ), ConsesLow
                                .list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "CHOICES" ), makeSymbol( "PART-OF-SPEECH-VALUES" ) ), ConsesLow.list( makeSymbol(
                                    "DERIVE-PART-OF-SPEECH-EXAMPLES" ), makeSymbol( "SELF" ), makeSymbol( "HEADWORD" ), makeSymbol( "PHRASE-WORDS" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol( "TERM" ) ), ConsesLow
                                        .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEFAULT-POS" ), ConsesLow.list( makeSymbol( "MOST-LIKELY-HEADWORD-PART-OF-SPEECH" ), makeSymbol(
                                            "HEADWORD" ), makeSymbol( "PART-OF-SPEECH-VALUES" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DEFAULT-POS" ), ConsesLow.list( makeSymbol( "MUMBLE" ),
                                                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Pre-selecting ~a as part-of-speech for ~s since most common usage in lexicon" ), ConsesLow
                                                    .list( makeSymbol( "LEX-DESCRIBE-TERM" ), makeSymbol( "DEFAULT-POS" ) ), makeSymbol( "HEADWORD" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT" ),
                                                        ConsesLow.list( makeSymbol( "POSITION" ), makeSymbol( "DEFAULT-POS" ), makeSymbol( "PART-OF-SPEECH-VALUES" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeString( "Which of the following sounds best?" ), makeSymbol( "CHOICES" ),
                                                            makeSymbol( "TIP" ), makeSymbol( "PART-OF-SPEECH-VALUES" ), makeSymbol( "DEFAULT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $str588$Determining_how_the_word___a__is_ = makeString( "Determining how the word '~a' is used in ~s" );
    $str589$Checking_usage_of___a_ = makeString( "Checking usage of '~a'" );
    $str590$Pre_selecting__a_as_part_of_speec = makeString( "Pre-selecting ~a as part-of-speech for ~s since most common usage in lexicon" );
    $str591$Which_of_the_following_sounds_bes = makeString( "Which of the following sounds best?" );
    $sym592$SME_LI_DENOTATIONAL_ASK_PART_OF_SPEECH_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-ASK-PART-OF-SPEECH-METHOD" );
    $sym593$CHECK_PART_OF_SPEECH = makeSymbol( "CHECK-PART-OF-SPEECH" );
    $list594 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( makeSymbol( "LEX-FORT-FOR-STRING" ), ConsesLow.list( makeSymbol(
        "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-PART-OF-SPEECH" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol(
            "PART-OF-SPEECH" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "invalid headword part-of-speech: ~a~%" ), makeSymbol(
                "PART-OF-SPEECH" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeString(
                    "The headword part-of-speech must be specified" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol(
                        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "NEW-STATES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-PART-OF-SPEECH" ), makeSymbol( "CHECK-PART-OF-SPEECH" ) ) ),
                                makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ),
                                    makeSymbol( "NEW-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $str596$invalid_headword_part_of_speech__ = makeString( "invalid headword part-of-speech: ~a~%" );
    $str597$The_headword_part_of_speech_must_ = makeString( "The headword part-of-speech must be specified" );
    $list598 = ConsesLow.list( makeSymbol( "ASK-PART-OF-SPEECH" ), makeSymbol( "CHECK-PART-OF-SPEECH" ) );
    $sym599$SME_LI_DENOTATIONAL_CHECK_PART_OF_SPEECH_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-CHECK-PART-OF-SPEECH-METHOD" );
    $sym600$SHOW_HEADWORD_VARIATIONS = makeSymbol( "SHOW-HEADWORD-VARIATIONS" );
    $list601 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ),
            makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "MAPPING-MT" ), ConsesLow.list( makeSymbol( "DETERMINE-LEXICAL-MAPPING-MT" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol(
                "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "PHRASE" ), NIL ) ), ConsesLow.list( makeSymbol(
                    "HEADWORD-POSITION" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "HEADWORD" ), ConsesLow.list( makeSymbol( "ELT" ),
                        makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "HEADWORD-POSITION" ) ) ) ), ConsesLow.list( makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( makeSymbol(
                            "LEXWIZ-HEADWORD-PART-OF-SPEECH" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-NEW-MAPPING?" ), makeSymbol(
                                "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "WORDS-OF-STRING&SPEECH-PART" ), makeSymbol( "HEADWORD" ), makeSymbol( "PART-OF-SPEECH" ), NIL,
                                    makeSymbol( "MAPPING-MT" ) ) ) ), ConsesLow.list( makeSymbol( "ADD-LEXICAL-MAPPING" ), makeSymbol( "SELF" ), makeSymbol( "HEADWORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol(
                                        "MAPPING-MT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VARIANTS" ), ConsesLow.list( makeSymbol( "DERIVE-PART-OF-SPEECH-VARIATIONS" ),
                                            makeSymbol( "PHRASE" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MAPPING-MT" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow
                                                .list( makeSymbol( "FORMAT" ), NIL, makeString( "Checking variant phrases due to variations of headword '~a'" ), makeSymbol( "HEADWORD" ) ) ), ConsesLow.list( makeSymbol(
                                                    "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Are the following good ways to refer to '~a'?~a~a" ), makeSymbol( "TERM-DESC" ), makeSymbol(
                                                        "*NEWLINE-TAB*" ), ConsesLow.list( makeSymbol( "JOIN-STRINGS" ), makeSymbol( "VARIANTS" ), makeSymbol( "*NEWLINE-TAB*" ) ) ) ), ConsesLow.list( makeSymbol( "TIP" ),
                                                            makeString(
                                                                "The main thing to check for is odd looking phrases, such as \"loadings a weapon\" as a variation of \"loading a weapon\". Note that there might not be variations. This may or may not be a problem, depending on the part of speech selected. For example, mass nouns like \"sand\" won't have variations." ) ) ),
                                            ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "VARIANTS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
                                                makeString( "There are no variations for the phrase ~s. This should only occur with headwords that are mass nouns.~%~%Is that OK?" ), makeSymbol( "PHRASE" ) ) ) ),
                                            ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FORGE-AHEAD?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                                makeSymbol( "MESSAGE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Assuming that the following variations of ~s are OK: ~a" ), makeSymbol( "PHRASE" ),
                                                    ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "VARIANTS" ), ConsesLow.list( makeSymbol( "JOIN-STRINGS" ), makeSymbol( "VARIANTS" ) ), makeString( "n/a" ) ) ) ) ),
                                                ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "MESSAGE" ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), T ), ConsesLow
                                                    .list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ),
                                                        makeSymbol( "QUESTION" ), makeSymbol( "TIP" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $str603$Checking_variant_phrases_due_to_v = makeString( "Checking variant phrases due to variations of headword '~a'" );
    $str604$Are_the_following_good_ways_to_re = makeString( "Are the following good ways to refer to '~a'?~a~a" );
    $str605$The_main_thing_to_check_for_is_od = makeString(
        "The main thing to check for is odd looking phrases, such as \"loadings a weapon\" as a variation of \"loading a weapon\". Note that there might not be variations. This may or may not be a problem, depending on the part of speech selected. For example, mass nouns like \"sand\" won't have variations." );
    $str606$There_are_no_variations_for_the_p = makeString( "There are no variations for the phrase ~s. This should only occur with headwords that are mass nouns.~%~%Is that OK?" );
    $str607$Assuming_that_the_following_varia = makeString( "Assuming that the following variations of ~s are OK: ~a" );
    $sym608$SME_LI_DENOTATIONAL_SHOW_HEADWORD_VARIATIONS_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-SHOW-HEADWORD-VARIATIONS-METHOD" );
    $sym609$CHECK_HEADWORD_VARIATIONS = makeSymbol( "CHECK-HEADWORD-VARIATIONS" );
    $list610 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), ConsesLow.list( makeSymbol(
        "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ) ), ConsesLow.list( makeSymbol( "MAPPING-MT" ), ConsesLow.list( makeSymbol( "DETERMINE-LEXICAL-MAPPING-MT" ), ConsesLow.list( makeSymbol(
            "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "HEADWORD-POSITION" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ),
        ConsesLow.list( makeSymbol( "HEADWORD" ), ConsesLow.list( makeSymbol( "ELT" ), makeSymbol( "PHRASE-WORDS" ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "HEADWORD-POSITION" ) ) ) ), ConsesLow.list(
            makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( makeSymbol( "LEXWIZ-HEADWORD-PART-OF-SPEECH" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "OK?" ), ConsesLow.list( makeSymbol(
                "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "OK?" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-NEW-MAPPING?" ),
                    makeSymbol( "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "REMOVE-LEXICAL-MAPPING" ), makeSymbol( "SELF" ), makeSymbol( "HEADWORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol(
                        "MAPPING-MT" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STATES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATES" ), ConsesLow.list( makeSymbol(
                                "APPEND" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-PART-OF-SPEECH" ), makeSymbol( "CHECK-PART-OF-SPEECH" ), makeSymbol( "SHOW-HEADWORD-VARIATIONS" ),
                                    makeSymbol( "CHECK-HEADWORD-VARIATIONS" ) ) ), makeSymbol( "NEW-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "NEW-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list(
                                            makeSymbol( "RET" ), T ) ) );
    $list611 = ConsesLow.list( makeSymbol( "ASK-PART-OF-SPEECH" ), makeSymbol( "CHECK-PART-OF-SPEECH" ), makeSymbol( "SHOW-HEADWORD-VARIATIONS" ), makeSymbol( "CHECK-HEADWORD-VARIATIONS" ) );
    $sym612$SME_LI_DENOTATIONAL_CHECK_HEADWORD_VARIATIONS_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-CHECK-HEADWORD-VARIATIONS-METHOD" );
    $sym613$ADD_LEXICAL_MAPPING = makeSymbol( "ADD-LEXICAL-MAPPING" );
    $list614 = ConsesLow.list( makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString(
        "EnglishMt" ) ) ), ConsesLow.list( makeSymbol( "WORD-TYPE" ), constant_handles.reader_make_constant_shell( makeString( "EnglishWord" ) ) ) );
    $list615 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "WORDS-OF-STRING&SPEECH-PART" ), makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), NIL, makeSymbol( "MT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DO-LEXICAL-MAPPING" ), makeSymbol( "SELF" ), makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MT" ), makeSymbol(
            "WORD-TYPE" ), T ) ) ) );
    $const616$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const617$EnglishWord = constant_handles.reader_make_constant_shell( makeString( "EnglishWord" ) );
    $sym618$SME_LI_DENOTATIONAL_ADD_LEXICAL_MAPPING_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-ADD-LEXICAL-MAPPING-METHOD" );
    $sym619$REMOVE_LEXICAL_MAPPING = makeSymbol( "REMOVE-LEXICAL-MAPPING" );
    $list620 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DO-LEXICAL-MAPPING" ), makeSymbol( "SELF" ), makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MT" ),
        makeSymbol( "WORD-TYPE" ), NIL ) ) );
    $sym621$SME_LI_DENOTATIONAL_REMOVE_LEXICAL_MAPPING_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-REMOVE-LEXICAL-MAPPING-METHOD" );
    $sym622$DO_LEXICAL_MAPPING = makeSymbol( "DO-LEXICAL-MAPPING" );
    $list623 = ConsesLow.list( makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MT" ), makeSymbol( "WORD-TYPE" ), makeSymbol( "ADD?" ) );
    $list624 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CREATE-CONSTANT-FN" ), ConsesLow.list( makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "CREATE-CONSTANT" ) ), ConsesLow.list( makeSymbol( "CLASS-NAME-FROM-OBJECT" ), makeSymbol( "PROXY" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "DO-LEXICAL-MAPPING-INT" ), makeSymbol( "WORDFORM" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "MT" ), makeSymbol( "WORD-TYPE" ), makeSymbol( "ADD?" ), makeSymbol( "CREATE-CONSTANT-FN" ), makeSymbol(
                "PROXY" ) ) ) ) );
    $sym625$SME_LI_DENOTATIONAL_DO_LEXICAL_MAPPING_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-DO-LEXICAL-MAPPING-METHOD" );
    $sym626$DERIVE_PART_OF_SPEECH_EXAMPLES = makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLES" );
    $list627 = ConsesLow.list( makeSymbol( "HEADWORD" ), makeSymbol( "PHRASE-WORDS" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol( "TERM" ) );
    $list628 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EXAMPLES" ), NIL ), ConsesLow.list( makeSymbol( "CANDIDATES" ), makeSymbol( "*SME-PARTS-OF-SPEECH*" ) ),
        ConsesLow.list( makeSymbol( "PARTS-OF-SPEECH" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "CANDIDATES" ) ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADWORD-POSITION-ZERO-INDEX" ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "HEADWORD-POSITION" ) ) ), ConsesLow.list( makeSymbol( "EXAMPLE" ),
                ConsesLow.list( makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLE" ), makeSymbol( "SELF" ), makeSymbol( "HEADWORD" ), makeSymbol( "PHRASE-WORDS" ), makeSymbol( "HEADWORD-POSITION-ZERO-INDEX" ), makeSymbol(
                    "PART-OF-SPEECH" ), makeSymbol( "TERM" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "EXAMPLE" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "EXAMPLE" ), makeSymbol(
                        "EXAMPLES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "PARTS-OF-SPEECH" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                            "VALUES" ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "EXAMPLES" ) ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "PARTS-OF-SPEECH" ) ) ) ) ) );
    $sym629$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLES_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLES-METHOD" );
    $sym630$DERIVE_PART_OF_SPEECH_EXAMPLE = makeSymbol( "DERIVE-PART-OF-SPEECH-EXAMPLE" );
    $list631 = ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "PHRASE-WORDS" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TERM" ),
        constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) );
    $list632 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "PHRASE-WORDS" ) ) ),
      ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "SINGULAR-WORD" ), ConsesLow.list( makeSymbol( "SINGULARIZE-WORD" ),
          makeSymbol( "WORD" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "SINGULAR-PHRASE" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "REPLACE-NTH" ), makeSymbol(
              "HEADWORD-POSITION" ), makeSymbol( "SINGULAR-WORD" ), makeSymbol( "PHRASE-WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "LOWERCASE-WORD" ), ConsesLow.list( makeSymbol( "STRING-DOWNCASE" ), makeSymbol(
                  "WORD" ) ) ), ConsesLow.list( makeSymbol( "LOWERCASE-PHRASE" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "REPLACE-NTH" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol(
                      "LOWERCASE-WORD" ), makeSymbol( "PHRASE-WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "PLURAL-WORD" ), ConsesLow.list( makeSymbol( "PLURALIZE-WORD" ), makeSymbol( "SINGULAR-WORD" ), makeSymbol(
                          "MT" ) ) ), ConsesLow.list( makeSymbol( "PLURAL-PHRASE" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "REPLACE-NTH" ), makeSymbol( "HEADWORD-POSITION" ), makeSymbol(
                              "PLURAL-WORD" ), makeSymbol( "PHRASE-WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "INFINITIVE-WORD" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow
                                  .list( makeSymbol( "GENL-POS?" ), makeSymbol( "PART-OF-SPEECH" ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), ConsesLow.list( makeSymbol( "GENL-POS?" ),
                                      makeSymbol( "PART-OF-SPEECH" ), constant_handles.reader_make_constant_shell( makeString( "DeVerbalNoun" ) ) ) ), ConsesLow.list( makeSymbol( "SME-LI-INFLECTED-VERB-TO-INFINITIVE" ),
                                          makeSymbol( "WORD" ) ) ) ), ConsesLow.list( makeSymbol( "INFINITIVE-PHRASE" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "REPLACE-NTH" ), makeSymbol(
                                              "HEADWORD-POSITION" ), makeSymbol( "INFINITIVE-WORD" ), makeSymbol( "PHRASE-WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "A-DET" ), ConsesLow.list( makeSymbol( "FIRST" ),
                                                  ConsesLow.list( makeSymbol( "ADD-DETERMINER" ), makeSymbol( "SINGULAR-PHRASE" ) ) ) )
    } ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "A-DET" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "A-DET" ), makeString( "a" ) ) ), ConsesLow.list(
        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "DISABLE-SPEECH-PART-SELECTION" ), makeSymbol( "SELF" ), makeSymbol( "WORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "TERM" ) ), ConsesLow.list(
            makeSymbol( "RET" ), NIL ) ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "PCASE" ), makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                makeSymbol( "FORMAT" ), NIL, makeString( "many ~a; ~a ~a: countable noun like 'book'" ), makeSymbol( "PLURAL-PHRASE" ), makeSymbol( "A-DET" ), makeSymbol( "SINGULAR-PHRASE" ) ) ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                        "much ~a; some ~a: uncountable noun like 'sand'" ), makeSymbol( "LOWERCASE-PHRASE" ), makeSymbol( "LOWERCASE-PHRASE" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "AgentiveNoun" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a ~a is able to ~a: agentive noun like 'farmer'" ), makeSymbol(
                                "A-DET" ), makeSymbol( "SINGULAR-PHRASE" ), makeSymbol( "INFINITIVE-WORD" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ), ConsesLow
                                    .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a involves ability to ~a: gerundive noun (verbal -ing form)" ), makeSymbol( "SINGULAR-PHRASE" ),
                                        makeSymbol( "INFINITIVE-PHRASE" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                            ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "proper name for countable objects (e.g., Corvettes, Koreans)" ) ) ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "ProperMassNoun" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                    "proper name for substance-like objects or concepts (e.g., Gruyere, Taoism)" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                        "Verb" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "to ~a; ~a unexpectedly: verb like 'cry'" ), makeSymbol(
                                                            "INFINITIVE-PHRASE" ), makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), ConsesLow.list(
                                                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "very ~a; most ~a: adjective like 'pretty'" ), makeSymbol( "PHRASE" ),
                                                                    makeSymbol( "PHRASE" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ), ConsesLow.list( makeSymbol(
                                                                        "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "so ~a; as ~a as ...: adverb like 'surely'" ), makeSymbol( "PHRASE" ), makeSymbol(
                                                                            "PHRASE" ) ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString(
                                                                                "Unable to derive example for part-of-speech ~a~%" ), makeSymbol( "PART-OF-SPEECH" ) ) )
    } ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $const633$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD" );
    $const635$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const636$DeVerbalNoun = constant_handles.reader_make_constant_shell( makeString( "DeVerbalNoun" ) );
    $str637$a = makeString( "a" );
    $const638$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $str639$many__a___a__a__countable_noun_li = makeString( "many ~a; ~a ~a: countable noun like 'book'" );
    $const640$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $str641$much__a__some__a__uncountable_nou = makeString( "much ~a; some ~a: uncountable noun like 'sand'" );
    $const642$AgentiveNoun = constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) );
    $str643$_a__a_is_able_to__a__agentive_nou = makeString( "~a ~a is able to ~a: agentive noun like 'farmer'" );
    $const644$GerundiveNoun = constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) );
    $str645$_a_involves_ability_to__a__gerund = makeString( "~a involves ability to ~a: gerundive noun (verbal -ing form)" );
    $const646$ProperCountNoun = constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) );
    $str647$proper_name_for_countable_objects = makeString( "proper name for countable objects (e.g., Corvettes, Koreans)" );
    $const648$ProperMassNoun = constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) );
    $str649$proper_name_for_substance_like_ob = makeString( "proper name for substance-like objects or concepts (e.g., Gruyere, Taoism)" );
    $str650$to__a___a_unexpectedly__verb_like = makeString( "to ~a; ~a unexpectedly: verb like 'cry'" );
    $const651$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $str652$very__a__most__a__adjective_like_ = makeString( "very ~a; most ~a: adjective like 'pretty'" );
    $const653$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $str654$so__a__as__a_as______adverb_like_ = makeString( "so ~a; as ~a as ...: adverb like 'surely'" );
    $str655$Unable_to_derive_example_for_part = makeString( "Unable to derive example for part-of-speech ~a~%" );
    $sym656$SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLE_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLE-METHOD" );
    $const657$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $sym658$DISABLE_SPEECH_PART_SELECTION = makeSymbol( "DISABLE-SPEECH-PART-SELECTION" );
    $list659 = ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "PART-OF-SPEECH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TERM" ), constant_handles.reader_make_constant_shell( makeString(
        "Thing" ) ) ) );
    $list660 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SINGULAR-WORD" ), ConsesLow.list( makeSymbol( "SINGULARIZE-WORD" ), makeSymbol( "WORD" ) ) ), ConsesLow
        .list( makeSymbol( "TERM-DESC" ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-TERM" ), makeSymbol( "TERM" ) ) ), makeSymbol( "DISABLE?" ) ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "PCASE" ), makeSymbol( "PART-OF-SPEECH" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "TERM-IS-ATTRIBUTE?" ), NIL ), ConsesLow.list( makeSymbol( "REASON" ), makeString( "adjectival suffix" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
                "LIKELY-ADJECTIVE?" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "TERM-IS-ATTRIBUTE?" ) ) ) ), ConsesLow
                    .list( makeSymbol( "PUNLESS" ), makeSymbol( "DISABLE?" ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                        "Enabling adjective for ~s since ~a" ), makeSymbol( "WORD" ), makeSymbol( "REASON" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ), ConsesLow
                            .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LIKELY-ADVERB?" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), T ) ) ), ConsesLow
                                .list( constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LIKELY-HAS-PART-OF-SPEECH?" ),
                                    constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) ), makeSymbol( "SINGULAR-WORD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), T ) ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LIKELY-HAS-PART-OF-SPEECH?" ),
              constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ), makeSymbol( "SINGULAR-WORD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), T ) ) ), ConsesLow.list(
                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) ) ), ConsesLow.list(
                      makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), ConsesLow.list( makeSymbol( "LOWER-CASE-STRING-P" ), makeSymbol( "WORD" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "CountNoun" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-UNITS" ), ConsesLow.list( makeSymbol( "WORDS-OF-STRING&SPEECH-PART" ),
                              makeSymbol( "WORD" ), constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "SPEECH-PART" ),
                                  ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "GerundiveNoun" ) ) ) ), makeSymbol( "DISABLE?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                                          makeSymbol( "SPEECH-PART" ), ConsesLow.list( makeSymbol( "POS-OF-STRING" ), makeSymbol( "WORD" ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ),
                                              makeSymbol( "WORD-UNITS" ) ), ConsesLow.list( makeSymbol( "INTERSECTION" ), makeSymbol( "WORD-UNITS" ), ConsesLow.list( makeSymbol( "WORDS-OF-STRING&SPEECH-PART" ),
                                                  makeSymbol( "WORD" ), makeSymbol( "SPEECH-PART" ) ) ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
                                                      makeString( "Disabling simple noun for ~s since better as ~a" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-TERM" ), makeSymbol(
                                                          "SPEECH-PART" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), T ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "MassNoun" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ), ConsesLow.list( makeSymbol( "PCOND" ),
                                                                  ConsesLow.list( ConsesLow.list( makeSymbol( "LIKELY-VERB?" ), makeSymbol( "SINGULAR-WORD" ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol(
                                                                      "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Enabling verb for ~s since it is a likely verb" ), makeSymbol( "WORD" ) ) ) ),
                                                                  ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-IN-ANY-MT?" ), makeSymbol( "TERM" ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "Event" ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                                          "Enabling verb for ~s since '~a' is a type of event" ), makeSymbol( "WORD" ), makeSymbol( "TERM-DESC" ) ) ) ), ConsesLow.list( T, ConsesLow.list(
                                                                              makeSymbol( "CSETQ" ), makeSymbol( "DISABLE?" ), T ) ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol(
                                                                                  "LEX-WARN" ), makeString( "Unexpected part of speech [during disable check]: ~s~%" ), makeSymbol( "PART-OF-SPEECH" ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DISABLE?" ) ) ) );
    $str661$adjectival_suffix = makeString( "adjectival suffix" );
    $str662$Enabling_adjective_for__s_since__ = makeString( "Enabling adjective for ~s since ~a" );
    $str663$Disabling_simple_noun_for__s_sinc = makeString( "Disabling simple noun for ~s since better as ~a" );
    $list664 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ) );
    $str665$Enabling_verb_for__s_since_it_is_ = makeString( "Enabling verb for ~s since it is a likely verb" );
    $const666$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $str667$Enabling_verb_for__s_since___a__i = makeString( "Enabling verb for ~s since '~a' is a type of event" );
    $str668$Unexpected_part_of_speech__during = makeString( "Unexpected part of speech [during disable check]: ~s~%" );
    $sym669$SME_LI_DENOTATIONAL_DISABLE_SPEECH_PART_SELECTION_METHOD = makeSymbol( "SME-LI-DENOTATIONAL-DISABLE-SPEECH-PART-SELECTION-METHOD" );
    $sym670$SME_LI_RELATIONAL_INITIALIZE_METHOD = makeSymbol( "SME-LI-RELATIONAL-INITIALIZE-METHOD" );
    $list671 = ConsesLow.list( makeSymbol( "SESSION-PARAMETERS" ), makeSymbol( "CALLBACK-FN" ), makeSymbol( "CALLBACKUP-DATA" ), makeSymbol( "NEW-PROXY" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) );
    $list672 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "SESSION-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "NUM-ARGS" ), ConsesLow.list( makeSymbol( "LEX-ARITY-IN-ANY-MT" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "INITIAL-STATES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
            .list( makeSymbol( "ASK-SAMPLE-SENTENCE" ), makeSymbol( "CHECK-SAMPLE-SENTENCE" ) ) ) ), ConsesLow.list( makeSymbol( "ARG-STATES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol(
                "ASK-ARGUMENT-VALUES" ), makeSymbol( "CHECK-ARGUMENT-VALUES" ), makeSymbol( "ASK-ARGUMENT-PART-OF-SPEECH" ), makeSymbol( "CHECK-ARGUMENT-PART-OF-SPEECH" ) ) ) ), ConsesLow.list( makeSymbol(
                    "FINAL-STATES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "END-INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "STATE-SEQUENCE" ), ConsesLow.list( makeSymbol(
                        "COPY-LIST" ), makeSymbol( "INITIAL-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "LEXWIZ-LEXICAL-MT" ), makeSymbol(
                            "SESSION-PARAMETERS" ) ), makeSymbol( "*DEFAULT-LEXIFICATION-MT*" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-LEXICAL-MT" ), makeSymbol(
                                "SESSION-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FORT-FOR-STRING" ), makeSymbol( "*DEFAULT-PREDICATE-LEXIFICATION-MT*" ) ) ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ),
                                    makeString( "initial state-sequence=~s~%" ), makeSymbol( "STATE-SEQUENCE" ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "NUM-ARGS" ) ),
                                        ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "STATE-SEQUENCE" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "ARG-STATES" ) ) ) ), ConsesLow.list( makeSymbol(
                                            "NCONC" ), makeSymbol( "STATE-SEQUENCE" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "FINAL-STATES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                                                makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STATES" ) ), makeSymbol( "STATE-SEQUENCE" ) ), ConsesLow.list( makeSymbol(
                                                    "LEX-DEBUG-OUT" ), makeString( "sme-li-relational next-states: ~a~%" ), makeSymbol( "STATE-SEQUENCE" ) ) ), ConsesLow.list( makeSymbol( "INITIATE-INTERACTION" ),
                                                        makeSymbol( "SUPER" ), makeSymbol( "SESSION-PARAMETERS" ), makeSymbol( "CALLBACK-FN" ), makeSymbol( "CALLBACKUP-DATA" ), makeSymbol( "NEW-PROXY" ), makeSymbol(
                                                            "QUESTION-ANSWERING-AGENT-CLASS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list673 = ConsesLow.list( makeSymbol( "ASK-SAMPLE-SENTENCE" ), makeSymbol( "CHECK-SAMPLE-SENTENCE" ) );
    $list674 = ConsesLow.list( makeSymbol( "ASK-ARGUMENT-VALUES" ), makeSymbol( "CHECK-ARGUMENT-VALUES" ), makeSymbol( "ASK-ARGUMENT-PART-OF-SPEECH" ), makeSymbol( "CHECK-ARGUMENT-PART-OF-SPEECH" ) );
    $list675 = ConsesLow.list( makeSymbol( "END-INTERACTION" ) );
    $str676$initial_state_sequence__s__ = makeString( "initial state-sequence=~s~%" );
    $str677$sme_li_relational_next_states___a = makeString( "sme-li-relational next-states: ~a~%" );
    $sym678$SME_LI_RELATIONAL_INITIATE_INTERACTION_METHOD = makeSymbol( "SME-LI-RELATIONAL-INITIATE-INTERACTION-METHOD" );
    $sym679$ASK_SAMPLE_SENTENCE = makeSymbol( "ASK-SAMPLE-SENTENCE" );
    $list680 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list(
            makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeString( "Determining relation template" ) ), ConsesLow.list( makeSymbol(
                "PHRASE-TYPE" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "IS-FUNCTIONAL?" ), makeSymbol( "TERM" ) ), makeString( "phrase" ), makeString( "sentence" ) ) ), ConsesLow.list(
                    makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Enter a ~a illustrating the '~a' relation:" ), makeSymbol( "PHRASE-TYPE" ), makeSymbol( "TERM-DESC" ) ) ), ConsesLow
                        .list( makeSymbol( "TIP" ), makeSymbol( "*SAMPLE-SENTENCE-TIP*" ) ), ConsesLow.list( makeSymbol( "TERM-COMMENTS" ), ConsesLow.list( makeSymbol( "GET-TERM-COMMENTS" ), makeSymbol( "TERM" ) ) ),
      ConsesLow.list( makeSymbol( "SIZE" ), makeInteger( 60 ) ), ConsesLow.list( makeSymbol( "DEFAULT" ), makeSymbol( "PHRASE" ) )
    } ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol( "TERM-COMMENTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIP" ), ConsesLow.list( makeSymbol(
        "FORMAT" ), NIL, makeString( "~a~%~%~a" ), makeSymbol( "TERM-COMMENTS" ), makeSymbol( "TIP" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ASK-GENERIC-FREE-FORM" ), makeSymbol(
            "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "TIP" ), makeSymbol( "SIZE" ), makeSymbol( "DEFAULT" ) ) ) ) );
    $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $str682$Determining_relation_template = makeString( "Determining relation template" );
    $str683$phrase = makeString( "phrase" );
    $str684$sentence = makeString( "sentence" );
    $str685$Enter_a__a_illustrating_the___a__ = makeString( "Enter a ~a illustrating the '~a' relation:" );
    $sym686$SME_LI_RELATIONAL_ASK_SAMPLE_SENTENCE_METHOD = makeSymbol( "SME-LI-RELATIONAL-ASK-SAMPLE-SENTENCE-METHOD" );
    $sym687$CHECK_SAMPLE_SENTENCE = makeSymbol( "CHECK-SAMPLE-SENTENCE" );
    $list688 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
            "SME-LEXWIZ-SAMPLE-SENTENCE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), makeSymbol( "SENTENCE" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-SENTENCE-WORDS" ), makeSymbol(
                "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol( "SENTENCE" ), T ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list(
                    makeSymbol( "RET" ), T ) );
    $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $sym690$SME_LI_RELATIONAL_CHECK_SAMPLE_SENTENCE_METHOD = makeSymbol( "SME-LI-RELATIONAL-CHECK-SAMPLE-SENTENCE-METHOD" );
    $sym691$ASK_ARGUMENT_VALUES = makeSymbol( "ASK-ARGUMENT-VALUES" );
    $list692 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "SENTENCE" ),
            ConsesLow.list( makeSymbol( "SME-LEXWIZ-SAMPLE-SENTENCE" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "WORD-CHOICES" ), ConsesLow.list( makeSymbol( "LEX-STRING-TOKENIZE" ), makeSymbol(
                "SENTENCE" ), T ) ), ConsesLow.list( makeSymbol( "ARG-NUM" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ),
                    makeString( "Determining relational arguments" ) ), ConsesLow.list( makeSymbol( "ARG-TYPE" ), ConsesLow.list( makeSymbol( "GET-RELATION-ARGUMENT-TYPE" ), makeSymbol( "TERM" ), makeSymbol(
                        "ARG-NUM" ) ) ), ConsesLow.list( makeSymbol( "ARG-TYPE-DESCRIPTION" ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-TERM" ), makeSymbol( "ARG-TYPE" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ),
                            ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Select phrase for argument ~a (~a) of relation '~a'" ), makeSymbol( "ARG-NUM" ), makeSymbol( "ARG-TYPE-DESCRIPTION" ), makeSymbol(
                                "TERM-DESC" ) ) ), ConsesLow.list( makeSymbol( "OFFSETS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TO-STRING" ) ), ConsesLow.list(
                                    makeSymbol( "NUM-LIST" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "WORD-CHOICES" ) ) ) ) ), ConsesLow.list( makeSymbol( "TIP" ), ConsesLow.list( makeSymbol(
                                        "GET-TERM-COMMENTS" ), makeSymbol( "TERM" ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ASK-GENERIC-MULTIPLE-SELECTION" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "WORD-CHOICES" ),
        makeSymbol( "TIP" ), makeSymbol( "OFFSETS" ) ) ) ) );
    $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $str694$Determining_relational_arguments = makeString( "Determining relational arguments" );
    $str695$Select_phrase_for_argument__a___a = makeString( "Select phrase for argument ~a (~a) of relation '~a'" );
    $sym696$SME_LI_RELATIONAL_ASK_ARGUMENT_VALUES_METHOD = makeSymbol( "SME-LI-RELATIONAL-ASK-ARGUMENT-VALUES-METHOD" );
    $sym697$CHECK_ARGUMENT_VALUES = makeSymbol( "CHECK-ARGUMENT-VALUES" );
    $list698 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OFFSETS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
        "EXTRACT-INTEGER" ) ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "WORDS" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-SENTENCE-WORDS" ), makeSymbol(
            "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "START" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "OFFSETS" ) ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list( makeSymbol( "1+" ),
                ConsesLow.list( makeSymbol( "LAST-ONE" ), makeSymbol( "OFFSETS" ) ) ) ), ConsesLow.list( makeSymbol( "ARG-PHRASE" ), ConsesLow.list( makeSymbol( "JOIN-WORDS" ), ConsesLow.list( makeSymbol( "SUBSEQ" ),
                    makeSymbol( "WORDS" ), makeSymbol( "START" ), makeSymbol( "END" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "START" ), makeSymbol( "END" ) ),
                        ConsesLow.list( makeSymbol( "SME-LEXWIZ-ARG-OFFSETS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ARG-PHRASE" ), ConsesLow.list( makeSymbol(
                            "SME-LEXWIZ-SENTENCE-ARGS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $sym700$EXTRACT_INTEGER = makeSymbol( "EXTRACT-INTEGER" );
    $sym701$SME_LI_RELATIONAL_CHECK_ARGUMENT_VALUES_METHOD = makeSymbol( "SME-LI-RELATIONAL-CHECK-ARGUMENT-VALUES-METHOD" );
    $sym702$ASK_ARGUMENT_PART_OF_SPEECH = makeSymbol( "ASK-ARGUMENT-PART-OF-SPEECH" );
    $list703 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-PHRASE" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
        "SME-LEXWIZ-SENTENCE-ARGS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ), ConsesLow.list( makeSymbol( "SPEECH-PARTS" ), ConsesLow.list( makeSymbol( "RTP-PHRASE-PARTS-OF-SPEECH" ), makeSymbol( "ARG-PHRASE" ) ) ),
        ConsesLow.list( makeSymbol( "CHOICES" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING-FOR-FORT" ) ), makeSymbol( "SPEECH-PARTS" ) ) ), ConsesLow.list(
            makeSymbol( "TITLE" ), makeString( "Determining part of speech for argument subphrase" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                "Select part of speech for ~s" ), makeSymbol( "ARG-PHRASE" ) ) ), ConsesLow.list( makeSymbol( "TIP" ), makeSymbol( "*ARGUMENT-PART-OF-SPEECH-TIP*" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                    .list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol( "SELF" ), makeSymbol(
                        "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "TIP" ), makeSymbol( "SPEECH-PARTS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                            "SET-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "SPEECH-PARTS" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $sym705$STRING_FOR_FORT = makeSymbol( "STRING-FOR-FORT" );
    $str706$Determining_part_of_speech_for_ar = makeString( "Determining part of speech for argument subphrase" );
    $str707$Select_part_of_speech_for__s = makeString( "Select part of speech for ~s" );
    $sym708$SME_LI_RELATIONAL_ASK_ARGUMENT_PART_OF_SPEECH_METHOD = makeSymbol( "SME-LI-RELATIONAL-ASK-ARGUMENT-PART-OF-SPEECH-METHOD" );
    $sym709$CHECK_ARGUMENT_PART_OF_SPEECH = makeSymbol( "CHECK-ARGUMENT-PART-OF-SPEECH" );
    $list710 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "NUM-ARGS" ), ConsesLow.list( makeSymbol( "LEX-ARITY-IN-ANY-MT" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "SPEECH-PART" ), ConsesLow.list( makeSymbol( "LEX-FORT-FOR-STRING" ),
            ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FORT-P" ), makeSymbol( "SPEECH-PART" ) ), ConsesLow.list(
                makeSymbol( "CSETQ" ), makeSymbol( "SPEECH-PART" ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SPEECH-PART" ), ConsesLow
                    .list( makeSymbol( "SME-LEXWIZ-ARG-SPEECH-PARTS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol(
                        "LEXWIZ-SETTINGS" ) ), ConsesLow.list( makeSymbol( "1+" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                            ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-CURRENT-ARG" ), makeSymbol( "LEXWIZ-SETTINGS" ) ), makeSymbol( "NUM-ARGS" ) ), ConsesLow.list( makeSymbol(
                                "DERIVE-RELATIONAL-TEMPLATES" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $const712$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $sym713$SME_LI_RELATIONAL_CHECK_ARGUMENT_PART_OF_SPEECH_METHOD = makeSymbol( "SME-LI-RELATIONAL-CHECK-ARGUMENT-PART-OF-SPEECH-METHOD" );
    $sym714$DERIVE_RELATIONAL_TEMPLATES = makeSymbol( "DERIVE-RELATIONAL-TEMPLATES" );
    $list715 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "ARG-OFFSETS" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-ARG-OFFSETS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ), ConsesLow.list( makeSymbol(
            "ARG-SPEECH-PARTS" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-ARG-SPEECH-PARTS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ), ConsesLow.list( makeSymbol(
                "SENTENCE-WORDS" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-SENTENCE-WORDS" ), makeSymbol( "LEXWIZ-SETTINGS" ) ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol(
                    "PARSE-TEMPLATE" ), makeSymbol( "NEW-GENERATION-TEMPLATE" ), makeSymbol( "OLD-GENERATION-TEMPLATE" ) ), ConsesLow.list( makeSymbol( "LEXIFY-RELATION" ), makeSymbol( "TERM" ), makeSymbol(
                        "ARG-OFFSETS" ), makeSymbol( "SENTENCE-WORDS" ), makeSymbol( "ARG-SPEECH-PARTS" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "*USE-GENFORMAT-TEMPLATE*" ), ConsesLow.list( makeSymbol(
                            "PROGN" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TEMPLATE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "THIRD" ), makeSymbol(
                                "OLD-GENERATION-TEMPLATE" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TEMPLATE-ARGS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list(
                                    makeSymbol( "FORMAT" ), NIL, makeString( "~S" ), ConsesLow.list( makeSymbol( "FOURTH" ), makeSymbol( "OLD-GENERATION-TEMPLATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                                        ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TEMPLATE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-GENERATION-TEMPLATE" ) ), ConsesLow
                                            .list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TEMPLATE-ARGS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), NIL ) ) ), ConsesLow.list( makeSymbol( "CSETF" ),
                                                ConsesLow.list( makeSymbol( "LEXWIZ-PARSE-TEMPLATE-FORMULA" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "PARSE-TEMPLATE" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                    T ) ) );
    $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD" );
    $str717$_S = makeString( "~S" );
    $sym718$SME_LI_RELATIONAL_DERIVE_RELATIONAL_TEMPLATES_METHOD = makeSymbol( "SME-LI-RELATIONAL-DERIVE-RELATIONAL-TEMPLATES-METHOD" );
    $list719 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SME-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "SET-STATES" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ASK-PREFERRED-LEXIFICATION-STATUS" ), makeSymbol( "CHECK-PREFERRED-LEXIFICATION-STATUS" ), makeSymbol(
                "DO-LEXIFICATION" ), makeSymbol( "CHECK-LEXIFICATION" ), makeSymbol( "END-INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list720 = ConsesLow.list( makeSymbol( "ASK-PREFERRED-LEXIFICATION-STATUS" ), makeSymbol( "CHECK-PREFERRED-LEXIFICATION-STATUS" ), makeSymbol( "DO-LEXIFICATION" ), makeSymbol( "CHECK-LEXIFICATION" ), makeSymbol(
        "END-INTERACTION" ) );
    $sym721$SME_LI_POST_GENERAL_INITIALIZE_METHOD = makeSymbol( "SME-LI-POST-GENERAL-INITIALIZE-METHOD" );
    $sym722$ASK_PREFERRED_LEXIFICATION_STATUS = makeSymbol( "ASK-PREFERRED-LEXIFICATION-STATUS" );
    $list723 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list(
            makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "LEX-TERM" ), ConsesLow.list( makeSymbol( "STRING-FOR-FORT" ), makeSymbol( "TERM" ) ) ), ConsesLow
                .list( makeSymbol( "TITLE" ), makeString( "Checking status of preferred reference" ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                    "Is \"~a\" the most common way of referring to the concept '~a'?" ), makeSymbol( "PHRASE" ), makeSymbol( "TERM-DESC" ) ) ), ConsesLow.list( makeSymbol( "OTHER-PHRASES" ), ConsesLow.list( makeSymbol(
                        "REMOVE" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "REMOVE-IF-NOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol(
                            "LEXIFIED-PHRASES-FOR-TERM" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ) ), ConsesLow.list( makeSymbol( "TIP" ), ConsesLow.list( makeSymbol( "FWHEN" ),
                                makeSymbol( "OTHER-PHRASES" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Other ways of referring to ~a are the following:~%~a~a~%" ), makeSymbol( "LEX-TERM" ),
                                    Characters.CHAR_tab, ConsesLow.list( makeSymbol( "JOIN-STRINGS" ), makeSymbol( "OTHER-PHRASES" ), makeSymbol( "*NEWLINE-TAB*" ) ) ) ) ), ConsesLow.list( makeSymbol( "SKIP?" ),
                                        ConsesLow.list( makeSymbol( "IS-RELATIONAL?" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) )
    } ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQUALP, makeSymbol( "PHRASE" ), makeSymbol( "TERM-DESC" ) ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
        "OTHER-PHRASES" ) ) ), ConsesLow.list( makeSymbol( "SET-ANSWER" ), makeSymbol( "SELF" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SKIP?" ), T ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
            "SKIP?" ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "ASK-GENERIC-BOOLEAN" ), makeSymbol( "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ),
                makeSymbol( "TIP" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD" );
    $str725$Checking_status_of_preferred_refe = makeString( "Checking status of preferred reference" );
    $str726$Is___a__the_most_common_way_of_re = makeString( "Is \"~a\" the most common way of referring to the concept '~a'?" );
    $sym727$STRINGP = makeSymbol( "STRINGP" );
    $str728$Other_ways_of_referring_to__a_are = makeString( "Other ways of referring to ~a are the following:~%~a~a~%" );
    $sym729$SME_LI_POST_GENERAL_ASK_PREFERRED_LEXIFICATION_STATUS_METHOD = makeSymbol( "SME-LI-POST-GENERAL-ASK-PREFERRED-LEXIFICATION-STATUS-METHOD" );
    $sym730$CHECK_PREFERRED_LEXIFICATION_STATUS = makeSymbol( "CHECK-PREFERRED-LEXIFICATION-STATUS" );
    $list731 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "IS-RELATIONAL?" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
        makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-IS-PREFERRED?" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "GET-ANSWER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
            makeSymbol( "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym732$SME_LI_POST_GENERAL_CHECK_PREFERRED_LEXIFICATION_STATUS_METHOD = makeSymbol( "SME-LI-POST-GENERAL-CHECK-PREFERRED-LEXIFICATION-STATUS-METHOD" );
    $sym733$DO_LEXIFICATION = makeSymbol( "DO-LEXIFICATION" );
    $list734 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACE-LEXIFICATION-PARAMETERS" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "DERIVE-LEXIFICATION-FORMULA" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "PERFORM-LEXIFICATION" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ),
            makeString( "Checking results of lexification" ) ), ConsesLow.list( makeSymbol( "ERROR-IN-LEXIFICATION?" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), ConsesLow.list( makeSymbol(
                "LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "STATUS" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "ERROR-IN-LEXIFICATION?" ), makeString(
                    "Problem processing the lexification" ), makeString( "Lexification complete." ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                        "~a~%~%Press OK to proceed" ), makeSymbol( "STATUS" ) ) ), ConsesLow.list( makeSymbol( "CHOICES" ), NIL ), ConsesLow.list( makeSymbol( "TIP" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                            "ERROR-IN-LEXIFICATION?" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                "This type of error shouldn't occur under normal circumstances. Contact Cycorp and provide the following diagnosis: ~a" ), ConsesLow.list( makeSymbol( "LEXWIZ-ERROR-MESSAGE" ), makeSymbol(
                                    "LEXWIZ-PARAMETERS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "ERROR-IN-LEXIFICATION?" ), ConsesLow.list( makeSymbol( "ASK-GENERIC-ENUMERATED" ), makeSymbol(
                                        "SELF" ), makeSymbol( "TITLE" ), makeSymbol( "QUESTION" ), makeSymbol( "CHOICES" ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "NEXT-INTERACTION" ), makeSymbol(
                                            "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD" );
    $str736$Checking_results_of_lexification = makeString( "Checking results of lexification" );
    $str737$Problem_processing_the_lexificati = makeString( "Problem processing the lexification" );
    $str738$Lexification_complete_ = makeString( "Lexification complete." );
    $str739$_a____Press_OK_to_proceed = makeString( "~a~%~%Press OK to proceed" );
    $str740$This_type_of_error_shouldn_t_occu = makeString( "This type of error shouldn't occur under normal circumstances. Contact Cycorp and provide the following diagnosis: ~a" );
    $sym741$SME_LI_POST_GENERAL_DO_LEXIFICATION_METHOD = makeSymbol( "SME-LI-POST-GENERAL-DO-LEXIFICATION-METHOD" );
    $sym742$CHECK_LEXIFICATION = makeSymbol( "CHECK-LEXIFICATION" );
    $list743 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow
        .list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "TERM-DESC" ), ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ),
            makeSymbol( "SELF" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "COMPLETION-MESSAGE" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Done mapping phrase ~s into concept '~a'" ),
                makeSymbol( "PHRASE" ), makeSymbol( "TERM-DESC" ) ) ) ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol( "SELF" ), makeSymbol( "COMPLETION-MESSAGE" ) ), ConsesLow.list( makeSymbol(
                    "NEXT-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD" );
    $str745$Done_mapping_phrase__s_into_conce = makeString( "Done mapping phrase ~s into concept '~a'" );
    $sym746$SME_LI_POST_GENERAL_CHECK_LEXIFICATION_METHOD = makeSymbol( "SME-LI-POST-GENERAL-CHECK-LEXIFICATION-METHOD" );
    $list747 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "INIT-LEXIFICATION-WIZARD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "STATE" ), makeKeyword( "GET-PRE-GENERAL" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-STATES" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "GET-SPECIFIC" ),
            makeKeyword( "GET-POST-GENERAL" ), makeKeyword( "DONE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "COPY-LEXIFICATION-PARAMETERS" ),
                makeSymbol( "*LEXWIZ-DEFAULTS*" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-CURRENT-INTERACTION" ),
                    NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INTERFACE-PROXY" ) ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*USE-BLACKBOARD?*" ), ConsesLow.list(
                            makeSymbol( "CNOT" ), makeSymbol( "*SIMULATED-BLACKBOARD?*" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow
                                .list( makeSymbol( "QUOTE" ), makeSymbol( "RKF-BB-PROXY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                    "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-QUESTION-ANSWERING-AGENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                        "SELF" ) )
    } );
    $kw748$GET_PRE_GENERAL = makeKeyword( "GET-PRE-GENERAL" );
    $list749 = ConsesLow.list( makeKeyword( "GET-SPECIFIC" ), makeKeyword( "GET-POST-GENERAL" ), makeKeyword( "DONE" ) );
    $sym750$RKF_BB_PROXY = makeSymbol( "RKF-BB-PROXY" );
    $sym751$HTML_QUESTION_ANSWERING_AGENT = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT" );
    $sym752$SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD" );
    $list753 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "STATE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-STATES" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "NEXT-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "COPY-LEXIFICATION-PARAMETERS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list(
                    makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CURRENT-INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                        "NEW-CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW-CURRENT-INTERACTION" ) ) ) ), ConsesLow.list(
                            makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROXY" ) ) ) ), ConsesLow
                                .list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym755$SME_LEXIFICATION_WIZARD_COPY_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-COPY-METHOD" );
    $list756 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-LEXWIZ" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "SME-LEXIFICATION-WIZARD" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-LEXWIZ" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPY" ) ), makeSymbol( "OTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-LEXWIZ" ) ) ) );
    $sym757$SME_LEXIFICATION_WIZARD_NEW_COPY_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-NEW-COPY-METHOD" );
    $sym758$SET_TERM = makeSymbol( "SET-TERM" );
    $list759 = ConsesLow.list( makeSymbol( "NEW-TERM" ) );
    $list760 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-TERM" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym762$SME_LEXIFICATION_WIZARD_SET_TERM_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-TERM-METHOD" );
    $sym763$GET_TERM = makeSymbol( "GET-TERM" );
    $list764 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ) ) );
    $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym766$SME_LEXIFICATION_WIZARD_GET_TERM_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-GET-TERM-METHOD" );
    $sym767$SET_PHRASE = makeSymbol( "SET-PHRASE" );
    $list768 = ConsesLow.list( makeSymbol( "NEW-PHRASE" ) );
    $list769 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-PHRASE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym771$SME_LEXIFICATION_WIZARD_SET_PHRASE_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-PHRASE-METHOD" );
    $sym772$GET_PHRASE = makeSymbol( "GET-PHRASE" );
    $list773 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ) ) );
    $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym775$SME_LEXIFICATION_WIZARD_GET_PHRASE_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-GET-PHRASE-METHOD" );
    $sym776$SET_MT = makeSymbol( "SET-MT" );
    $list777 = ConsesLow.list( makeSymbol( "NEW-MT" ) );
    $list778 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-MT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym780$SME_LEXIFICATION_WIZARD_SET_MT_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-MT-METHOD" );
    $sym781$GET_MT = makeSymbol( "GET-MT" );
    $list782 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ) ) ) );
    $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym784$SME_LEXIFICATION_WIZARD_GET_MT_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-GET-MT-METHOD" );
    $sym785$SET_LEXICAL_MT = makeSymbol( "SET-LEXICAL-MT" );
    $list786 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-LEXICAL-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FORT-FOR-STRING" ), makeSymbol( "NEW-MT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym788$SME_LEXIFICATION_WIZARD_SET_LEXICAL_MT_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-LEXICAL-MT-METHOD" );
    $sym789$SET_PARSING_MT = makeSymbol( "SET-PARSING-MT" );
    $list790 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PARSE-TEMPLATE-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-MT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym792$SME_LEXIFICATION_WIZARD_SET_PARSING_MT_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-PARSING-MT-METHOD" );
    $sym793$SET_GENERATION_MT = makeSymbol( "SET-GENERATION-MT" );
    $list794 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-GENERATION-MT" ), makeSymbol(
        "LEXWIZ-PARAMETERS" ) ), makeSymbol( "NEW-MT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym796$SME_LEXIFICATION_WIZARD_SET_GENERATION_MT_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-SET-GENERATION-MT-METHOD" );
    $sym797$LEXIFY = makeSymbol( "LEXIFY" );
    $list798 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "MT" ) );
    $list799 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ),
        makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ),
            makeSymbol( "PHRASE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ),
                makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "STRINGP" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list(
                    makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "FORT-FOR-STRING" ), ConsesLow.list( makeSymbol( "LEXWIZ-MT" ),
                        makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SME-LI-PRE-GENERAL" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                "NEW-CURRENT-INTERACTION" ), makeSymbol( "CURRENT-INTERACTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NOTIFICATION-FN" ), ConsesLow.list(
                                    makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROCESS-STATUS-UPDATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "SME-LEXIFICATION-WIZARD" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                            makeSymbol( "INITIATE-INTERACTION" ) ), makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "NOTIFICATION-FN" ), makeSymbol( "SELF" ), makeSymbol( "PROXY" ), makeSymbol(
                                                "QUESTION-ANSWERING-AGENT-CLASS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym800$SME_LEXIFICATION_WIZARD_LEXIFY_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-LEXIFY-METHOD" );
    $sym801$LEXIFY_FIRST_TERMSTRING = makeSymbol( "LEXIFY-FIRST-TERMSTRING" );
    $list802 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $list803 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PHRASE" ), ConsesLow.list( makeSymbol( "FIRST-TERMSTRING-PHRASE" ), makeSymbol( "TERM" ) ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LEXIFY" ), makeSymbol( "SELF" ), makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "MT" ) ) ) ) );
    $sym804$SME_LEXIFICATION_WIZARD_LEXIFY_FIRST_TERMSTRING_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-LEXIFY-FIRST-TERMSTRING-METHOD" );
    $sym805$CONTINUE_LEXIFY = makeSymbol( "CONTINUE-LEXIFY" );
    $list806 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NEXT-STATES" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "NEXT-STATES" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "NEXT-STATES" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NOTIFICATION-FN" ), ConsesLow.list(
            makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROCESS-STATUS-UPDATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LEXIFICATION-WIZARD" ) ) ) ),
            makeSymbol( "INTERACTION-CLASS" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "STATE" ), ConsesLow.list( makeKeyword( "GET-SPECIFIC" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list(
                makeSymbol( "LEXWIZ-STATE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeKeyword( "NEED-INPUT" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "IS-RELATIONAL?" ),
                    ConsesLow.list( makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERACTION-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "SME-LI-RELATIONAL" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEXWIZ-IS-PROPER?" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "INTERACTION-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LI-PROPER-NAME" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                "INTERACTION-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LI-DENOTATIONAL" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ),
                                    ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), makeSymbol( "INTERACTION-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol(
                                        "CSETQ" ), makeSymbol( "NEW-CURRENT-INTERACTION" ), makeSymbol( "CURRENT-INTERACTION" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                            "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIATE-INTERACTION" ) ), makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "NOTIFICATION-FN" ),
                                            makeSymbol( "SELF" ), makeSymbol( "PROXY" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ) ), ConsesLow.list( makeSymbol( "TRACE-LEXIFICATION-PARAMETERS" ), makeSymbol(
                                                "LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeKeyword( "GET-POST-GENERAL" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "LEXWIZ-STATE" ),
                                                    makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeKeyword( "DONE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol(
                                                        "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LI-POST-GENERAL" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-CURRENT-INTERACTION" ), makeSymbol( "CURRENT-INTERACTION" ) ), ConsesLow.list(
                                                                makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIATE-INTERACTION" ) ),
                                                                makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "NOTIFICATION-FN" ), makeSymbol( "SELF" ), makeSymbol( "PROXY" ), makeSymbol(
                                                                    "QUESTION-ANSWERING-AGENT-CLASS" ) ) ), ConsesLow.list( makeKeyword( "DONE" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PROXY" ), ConsesLow
                                                                        .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-SESSION" ) ) ) ) ),
                ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "STATE" ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString( "Unexpected state keyword: ~a~%" ),
                    makeSymbol( "STATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $kw807$GET_SPECIFIC = makeKeyword( "GET-SPECIFIC" );
    $kw808$NEED_INPUT = makeKeyword( "NEED-INPUT" );
    $kw809$GET_POST_GENERAL = makeKeyword( "GET-POST-GENERAL" );
    $str810$Unexpected_state_keyword___a__ = makeString( "Unexpected state keyword: ~a~%" );
    $sym811$SME_LEXIFICATION_WIZARD_CONTINUE_LEXIFY_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-CONTINUE-LEXIFY-METHOD" );
    $list812 = ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SERVER" ), makeSymbol( "USER-DATA" ) );
    $list813 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "STATUS" ), makeSymbol( "USER-DATA" ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString(
        "sme-lexwiz process-status-update status=~a server=~a user-data=~a~%" ), makeSymbol( "STATUS" ), makeSymbol( "SERVER" ), makeSymbol( "USER-DATA" ) ), ConsesLow.list( makeSymbol( "LEX-ASSERTION" ), ConsesLow.list(
            EQ, makeSymbol( "SERVER" ), makeSymbol( "CURRENT-INTERACTION" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString(
                "current interaction: ~s~%" ), makeSymbol( "CURRENT-INTERACTION" ) ), ConsesLow.list( makeSymbol( "LEX-DESCRIBE-INSTANCE" ), makeSymbol( "*LEX-VERY-VERBOSE*" ), makeSymbol( "CURRENT-INTERACTION" ) ),
                ConsesLow.list( makeSymbol( "UPDATE-LEXIFICATION-PARAMETERS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "USE-CLONE?" ), ConsesLow.list(
                    makeSymbol( "CNOT" ), makeSymbol( "*USE-BLACKBOARD?*" ) ) ), ConsesLow.list( makeSymbol( "LEXWIZ-CLONE" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "USE-CLONE?" ), ConsesLow.list( makeSymbol(
                        "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SME-LEXIFICATION-WIZARD" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW-COPY" ) ), makeSymbol(
                            "SELF" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LEXWIZ-CLONE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "CONTINUE-LEXIFY" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str814$sme_lexwiz_process_status_update_ = makeString( "sme-lexwiz process-status-update status=~a server=~a user-data=~a~%" );
    $list815 = ConsesLow.list( EQ, makeSymbol( "SERVER" ), makeSymbol( "CURRENT-INTERACTION" ) );
    $str816$current_interaction___s__ = makeString( "current interaction: ~s~%" );
    $sym817$SME_LEXIFICATION_WIZARD_PROCESS_STATUS_UPDATE_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-PROCESS-STATUS-UPDATE-METHOD" );
    $list818 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REVISED-LEXWIZ-PARAMETERS" ),
        ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "TRACE-LEXIFICATION-PARAMETERS" ), makeSymbol( "REVISED-LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXWIZ-PARAMETERS" ), ConsesLow.list( makeSymbol(
                "COPY-LEXIFICATION-PARAMETERS" ), makeSymbol( "REVISED-LEXWIZ-PARAMETERS" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "LEXWIZ-PARAMETERS" ) ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym819$SME_LEXIFICATION_WIZARD_UPDATE_LEXIFICATION_PARAMETERS_METHOD = makeSymbol( "SME-LEXIFICATION-WIZARD-UPDATE-LEXIFICATION-PARAMETERS-METHOD" );
    $sym820$POS_OF_STRING = makeSymbol( "POS-OF-STRING" );
    $sym821$APPEND = makeSymbol( "APPEND" );
    $list822 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) );
    $kw823$DET = makeKeyword( "DET" );
    $list824 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $str825$SME_Lexification_settings____S__ = makeString( "SME Lexification settings:~%~S~%" );
    $str826$A_normal__a = makeString( "A normal ~a" );
    $str827$abbreviation = makeString( "abbreviation" );
    $str828$name = makeString( "name" );
    $list829 = ConsesLow.list( makeString( "None of the above" ) );
    $list830 = ConsesLow.list( makeString( "nameString" ) );
    $str831$_a___a = makeString( "~a: ~a" );
    $str832$__ = makeString( "; " );
    $sym833$STRING_ = makeSymbol( "STRING<" );
    $str834$non_null_headword_position_and_pa = makeString( "non-null headword-position and part-of-speech required for derive-part-of-speech-variations" );
    $str835$Invalid_headword_position__a_for_ = makeString( "Invalid headword position ~a for ~s~%" );
    $str836$__title = makeString( "- title" );
    $const837$Title = constant_handles.reader_make_constant_shell( makeString( "Title" ) );
    $const838$SalutationMapping = constant_handles.reader_make_constant_shell( makeString( "SalutationMapping" ) );
    $const839$codeMapping = constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) );
    $sym840$LEX_FORT_FOR_STRING = makeSymbol( "LEX-FORT-FOR-STRING" );
    $sym841$CLOSED_LEXICAL_CLASS_STRING_ = makeSymbol( "CLOSED-LEXICAL-CLASS-STRING?" );
  }

  public static final class $sme_lexification_settings_native
      extends
        SubLStructNative
  {
    public SubLObject $is_abbreviationP;
    public SubLObject $new_mappingP;
    public SubLObject $okP;
    public SubLObject $sample_sentence;
    public SubLObject $sentence_words;
    public SubLObject $sentence_args;
    public SubLObject $arg_offsets;
    public SubLObject $current_arg;
    public SubLObject $arg_speech_parts;
    public SubLObject $proper_sub_predicates;
    private static final SubLStructDeclNative structDecl;

    public $sme_lexification_settings_native()
    {
      this.$is_abbreviationP = CommonSymbols.NIL;
      this.$new_mappingP = CommonSymbols.NIL;
      this.$okP = CommonSymbols.NIL;
      this.$sample_sentence = CommonSymbols.NIL;
      this.$sentence_words = CommonSymbols.NIL;
      this.$sentence_args = CommonSymbols.NIL;
      this.$arg_offsets = CommonSymbols.NIL;
      this.$current_arg = CommonSymbols.NIL;
      this.$arg_speech_parts = CommonSymbols.NIL;
      this.$proper_sub_predicates = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sme_lexification_settings_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$is_abbreviationP;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$new_mappingP;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$okP;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$sample_sentence;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$sentence_words;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$sentence_args;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$arg_offsets;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$current_arg;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$arg_speech_parts;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$proper_sub_predicates;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$is_abbreviationP = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$new_mappingP = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$okP = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$sample_sentence = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$sentence_words = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$sentence_args = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$arg_offsets = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$current_arg = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$arg_speech_parts = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$proper_sub_predicates = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sme_lexification_settings_native.class, $sym18$SME_LEXIFICATION_SETTINGS, $sym19$SME_LEXIFICATION_SETTINGS_P, $list20, $list21, new String[] { "$is_abbreviationP",
        "$new_mappingP", "$okP", "$sample_sentence", "$sentence_words", "$sentence_args", "$arg_offsets", "$current_arg", "$arg_speech_parts", "$proper_sub_predicates"
      }, $list22, $list23, $sym24$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sme_lexification_settings_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sme_lexification_settings_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SME-LEXIFICATION-SETTINGS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sme_lexification_settings_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 5606 ms
 * 
 */