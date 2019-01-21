package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class coreference_resolution extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.coreference_resolution";
    public static final String myFingerPrint = "9d9b365d35455cbc84ad80e6f5e93d5a4a06039ea2c05523677227f3866929e3";
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLSymbol $dtp_coreference_resolution_discourse_struct$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLSymbol $dtp_reference_info$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36437L)
    private static SubLSymbol $cr_non_person$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLSymbol $dtp_referent_struct$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 67734L)
    private static SubLSymbol $cr_courtesy_titles$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 78139L)
    private static SubLSymbol $cr_sentence_switch_id_base$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 78830L)
    private static SubLSymbol $cr_parses_switch_id_base$;
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 78889L)
    private static SubLSymbol $cr_more_info_switch_id_base$;
    private static final SubLSymbol $sym0$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT;
    private static final SubLSymbol $sym1$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$CRD_IMPLEMENTATION;
    private static final SubLSymbol $sym10$_CSETF_CRD_IMPLEMENTATION;
    private static final SubLSymbol $sym11$CRD_PARSER;
    private static final SubLSymbol $sym12$_CSETF_CRD_PARSER;
    private static final SubLSymbol $sym13$CRD_USE_PSP_;
    private static final SubLSymbol $sym14$_CSETF_CRD_USE_PSP_;
    private static final SubLSymbol $sym15$CRD_MAX_SUFFICIENT_RECENTNESS;
    private static final SubLSymbol $sym16$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS;
    private static final SubLSymbol $sym17$CRD_MAX_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $sym18$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $sym19$CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $sym20$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $sym21$CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $sym22$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $sym23$CRD_REFERENCE_NOTE_HASH;
    private static final SubLSymbol $sym24$_CSETF_CRD_REFERENCE_NOTE_HASH;
    private static final SubLSymbol $sym25$CRD_RECENT_REFERENCES;
    private static final SubLSymbol $sym26$_CSETF_CRD_RECENT_REFERENCES;
    private static final SubLSymbol $sym27$CRD_SENTENCES;
    private static final SubLSymbol $sym28$_CSETF_CRD_SENTENCES;
    private static final SubLSymbol $kw29$IMPLEMENTATION;
    private static final SubLSymbol $kw30$PARSER;
    private static final SubLSymbol $kw31$USE_PSP_;
    private static final SubLSymbol $kw32$MAX_SUFFICIENT_RECENTNESS;
    private static final SubLSymbol $kw33$MAX_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $kw34$MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $kw35$MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN;
    private static final SubLSymbol $kw36$REFERENCE_NOTE_HASH;
    private static final SubLSymbol $kw37$RECENT_REFERENCES;
    private static final SubLSymbol $kw38$SENTENCES;
    private static final SubLString $str39$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw40$BEGIN;
    private static final SubLSymbol $sym41$MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT;
    private static final SubLSymbol $kw42$SLOT;
    private static final SubLSymbol $kw43$END;
    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_ME;
    private static final SubLSymbol $sym45$STANFORD_PARSER;
    private static final SubLSymbol $kw46$CODE;
    private static final SubLInteger $int47$50;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$COREF_DISCOURSE_VAR;
    private static final SubLSymbol $sym50$REFERENCE_VAR;
    private static final SubLSymbol $sym51$RECENT_REFERENCES_VAR;
    private static final SubLSymbol $sym52$CLET;
    private static final SubLSymbol $sym53$DO_PARSE_TREE_SUBTREES;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$PUNLESS;
    private static final SubLSymbol $sym56$CAND;
    private static final SubLSymbol $sym57$NP_TREE_P;
    private static final SubLSymbol $sym58$IS_THE_ONLY_HEAD_DAUGHTER_OF_AN_NP_;
    private static final SubLSymbol $sym59$RESOLVE_REFERENCE;
    private static final SubLSymbol $sym60$CPUSH;
    private static final SubLSymbol $sym61$PARSE_TREE_P;
    private static final SubLString $str62$_S_is_not_valid_input_for_the_cor;
    private static final SubLSymbol $kw63$INPUT;
    private static final SubLString $str64$Unable_to_open__S;
    private static final SubLSymbol $sym65$INPUT_STREAM_P;
    private static final SubLSymbol $sym66$STRINGP;
    private static final SubLString $str67$Got_invalid_parse_result_for__S__;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$DFL2R;
    private static final SubLSymbol $kw70$DFR2L;
    private static final SubLString $str71$_S_is_not_one_of__S;
    private static final SubLSymbol $kw72$ALL;
    private static final SubLSymbol $sym73$GET_CATEGORY;
    private static final SubLSymbol $sym74$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym75$REFERENT_STRUCT_REFERENCES;
    private static final SubLSymbol $sym76$PARSE;
    private static final SubLSymbol $sym77$GET_MOTHER;
    private static final SubLSymbol $sym78$GET_HEAD_DAUGHTERS;
    private static final SubLSymbol $kw79$POSSIBLE_ANAPHOR_;
    private static final SubLSymbol $kw80$POSSIBLE_ANTECEDENT_;
    private static final SubLSymbol $kw81$STANDARD_ANAPHOR;
    private static final SubLSymbol $sym82$GET_ANCESTORS;
    private static final SubLSymbol $kw83$POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $kw84$LIKELY_ANTECEDENTS;
    private static final SubLSymbol $kw85$BEST_ANTECEDENT;
    private static final SubLSymbol $kw86$FUNCTIONAL_DEPENDENCY;
    private static final SubLSymbol $kw87$ANAPHOR_WITH_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $kw88$ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $kw89$NON_ANAPHOR_POSSIBLE_ANTECEDENT;
    private static final SubLSymbol $kw90$NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT;
    private static final SubLSymbol $kw91$KB;
    private static final SubLString $str92$The__KB_implementation_of_corefer;
    private static final SubLString $str93$Don_t_know_about__S_implementatio;
    private static final SubLSymbol $kw94$DONT_KNOW_YET;
    private static final SubLSymbol $sym95$REFERENCE_POSSIBLE_ANAPHOR__CALCULATE;
    private static final SubLSymbol $sym96$REFERENCE_POSSIBLE_ANTECEDENT__CALCULATE;
    private static final SubLSymbol $sym97$REFERENCE_POSSIBLE_ANTECEDENTS_CALCULATE;
    private static final SubLSymbol $sym98$REFERENCE_LIKELY_ANTECEDENTS_CALCULATE;
    private static final SubLSymbol $sym99$REFERENCE_BEST_ANTECEDENT_CALCULATE;
    private static final SubLSymbol $sym100$REFERENCE_FUNCTIONAL_DEPENDENCY_CALCULATE;
    private static final SubLString $str101$Don_t_know_how_to_calculate_refer;
    private static final SubLString $str102$Don_t_know_how_to_get_reference_s;
    private static final SubLString $str103$Don_t_know_how_to_set_reference_s;
    private static final SubLSymbol $sym104$REFERENCE_INFO;
    private static final SubLSymbol $sym105$REFERENCE_INFO_P;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$PRINT_REFERENCE_INFO;
    private static final SubLSymbol $sym111$REFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$REFERENCE_INFO_INDEX_NUMBER;
    private static final SubLSymbol $sym114$_CSETF_REFERENCE_INFO_INDEX_NUMBER;
    private static final SubLSymbol $sym115$REFERENCE_INFO_TREE;
    private static final SubLSymbol $sym116$_CSETF_REFERENCE_INFO_TREE;
    private static final SubLSymbol $sym117$REFERENCE_INFO_CYCLS;
    private static final SubLSymbol $sym118$_CSETF_REFERENCE_INFO_CYCLS;
    private static final SubLSymbol $sym119$REFERENCE_INFO_POSSIBLE_ANTECEDENT_;
    private static final SubLSymbol $sym120$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENT_;
    private static final SubLSymbol $sym121$REFERENCE_INFO_POSSIBLE_ANAPHOR_;
    private static final SubLSymbol $sym122$_CSETF_REFERENCE_INFO_POSSIBLE_ANAPHOR_;
    private static final SubLSymbol $sym123$REFERENCE_INFO_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $sym124$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENTS;
    private static final SubLSymbol $sym125$REFERENCE_INFO_LIKELY_ANTECEDENTS;
    private static final SubLSymbol $sym126$_CSETF_REFERENCE_INFO_LIKELY_ANTECEDENTS;
    private static final SubLSymbol $sym127$REFERENCE_INFO_BEST_ANTECEDENT;
    private static final SubLSymbol $sym128$_CSETF_REFERENCE_INFO_BEST_ANTECEDENT;
    private static final SubLSymbol $sym129$REFERENCE_INFO_FUNCTIONAL_DEPENDENCY;
    private static final SubLSymbol $sym130$_CSETF_REFERENCE_INFO_FUNCTIONAL_DEPENDENCY;
    private static final SubLSymbol $sym131$REFERENCE_INFO_REFERENT;
    private static final SubLSymbol $sym132$_CSETF_REFERENCE_INFO_REFERENT;
    private static final SubLSymbol $kw133$INDEX_NUMBER;
    private static final SubLSymbol $kw134$TREE;
    private static final SubLSymbol $kw135$CYCLS;
    private static final SubLSymbol $kw136$REFERENT;
    private static final SubLSymbol $sym137$MAKE_REFERENCE_INFO;
    private static final SubLSymbol $sym138$VISIT_DEFSTRUCT_OBJECT_REFERENCE_INFO_METHOD;
    private static final SubLString $str139$_S;
    private static final SubLSymbol $sym140$GET_STRING;
    private static final SubLObject $const141$Thing;
    private static final SubLSymbol $kw142$UNKNOWN;
    private static final SubLObject $const143$Ungendered_NLAttr;
    private static final SubLObject $const144$Neuter_NLAttr;
    private static final SubLObject $const145$Masculine_NLAttr;
    private static final SubLObject $const146$MaleHuman;
    private static final SubLObject $const147$Feminine_NLAttr;
    private static final SubLObject $const148$FemaleHuman;
    private static final SubLString $str149$Didn_t_know_there_was_such_a_gend;
    private static final SubLSymbol $sym150$CYCLIFY;
    private static final SubLSymbol $sym151$_REFERENT;
    private static final SubLSymbol $sym152$POSSIBLY_CYCLIFIER_REFERENT_STAND_IN;
    private static final SubLObject $const153$InstanceFn;
    private static final SubLObject $const154$CollectionDifferenceFn;
    private static final SubLObject $const155$Person;
    private static final SubLObject $const156$UnmarkedNumber_NLAttr;
    private static final SubLObject $const157$Singular_NLAttr;
    private static final SubLObject $const158$Group;
    private static final SubLSymbol $sym159$GET_NUMBER;
    private static final SubLSymbol $kw160$SINGULAR;
    private static final SubLSymbol $kw161$PLURAL;
    private static final SubLObject $const162$Plural_NLAttr;
    private static final SubLString $str163$Don_t_know_about_the_number__S;
    private static final SubLSymbol $sym164$GET_GENDER;
    private static final SubLSymbol $kw165$MASCULINE;
    private static final SubLSymbol $kw166$FEMININE;
    private static final SubLSymbol $kw167$NEUTER;
    private static final SubLString $str168$Don_t_know_about_the_gender__S;
    private static final SubLSymbol $sym169$REFERENT_STRUCT;
    private static final SubLSymbol $sym170$REFERENT_STRUCT_P;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$PRINT_REFERENT_STRUCT;
    private static final SubLSymbol $sym176$REFERENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$_CSETF_REFERENT_STRUCT_REFERENCES;
    private static final SubLSymbol $sym179$REFERENT_STRUCT_EQUALS;
    private static final SubLSymbol $sym180$_CSETF_REFERENT_STRUCT_EQUALS;
    private static final SubLSymbol $sym181$REFERENT_STRUCT_TYPES;
    private static final SubLSymbol $sym182$_CSETF_REFERENT_STRUCT_TYPES;
    private static final SubLSymbol $sym183$REFERENT_STRUCT_FACTS;
    private static final SubLSymbol $sym184$_CSETF_REFERENT_STRUCT_FACTS;
    private static final SubLSymbol $sym185$REFERENT_STRUCT_GENDER;
    private static final SubLSymbol $sym186$_CSETF_REFERENT_STRUCT_GENDER;
    private static final SubLSymbol $sym187$REFERENT_STRUCT_NUMBER;
    private static final SubLSymbol $sym188$_CSETF_REFERENT_STRUCT_NUMBER;
    private static final SubLSymbol $kw189$REFERENCES;
    private static final SubLSymbol $kw190$EQUALS;
    private static final SubLSymbol $kw191$TYPES;
    private static final SubLSymbol $kw192$FACTS;
    private static final SubLSymbol $kw193$GENDER;
    private static final SubLSymbol $kw194$NUMBER;
    private static final SubLSymbol $sym195$MAKE_REFERENT_STRUCT;
    private static final SubLSymbol $sym196$VISIT_DEFSTRUCT_OBJECT_REFERENT_STRUCT_METHOD;
    private static final SubLString $str197$Equals___S__;
    private static final SubLString $str198$Types___S__;
    private static final SubLString $str199$Facts___S__;
    private static final SubLString $str200$Gender___S__;
    private static final SubLString $str201$Number___S__;
    private static final SubLString $str202$References___;
    private static final SubLString $str203$_S_;
    private static final SubLString $str204$_;
    private static final SubLObject $const205$Generic_NLAttr;
    private static final SubLSymbol $kw206$NON_ANAPHOR;
    private static final SubLSymbol $kw207$ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE;
    private static final SubLSymbol $kw208$LIKELY_ACCOMODATABLE_ANAPHOR;
    private static final SubLSymbol $sym209$RESTRICTIVE_CLAUSE_TREE_P;
    private static final SubLString $str210$that;
    private static final SubLSymbol $sym211$GET_DAUGHTER;
    private static final SubLSymbol $sym212$OF_PP_TREE_P;
    private static final SubLString $str213$of;
    private static final SubLSymbol $sym214$GET_HEAD_DAUGHTER;
    private static final SubLSymbol $kw215$PRP_;
    private static final SubLSymbol $sym216$POSSESSIVE_P;
    private static final SubLSymbol $kw217$DT;
    private static final SubLSymbol $sym218$KB_DEMONSTRATIVE_NL_ATTR_P;
    private static final SubLObject $const219$Determiner;
    private static final SubLObject $const220$Demonstrative_NLAttrType;
    private static final SubLObject $const221$Definite_NLAttr;
    private static final SubLSymbol $sym222$DEFINITE_DESCRIPTION_P;
    private static final SubLSymbol $sym223$GET_HEAD;
    private static final SubLObject $const224$FirstPerson_NLAttr;
    private static final SubLObject $const225$SecondPerson_NLAttr;
    private static final SubLSymbol $sym226$GET_PERSON;
    private static final SubLSymbol $sym227$REFERENCE_POSSIBLY_REFERS_TO__CODE;
    private static final SubLSymbol $sym228$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const229$EverythingPSC;
    private static final SubLObject $const230$fewIfAny;
    private static final SubLObject $const231$InferencePSC;
    private static final SubLSymbol $kw232$MAX_TIME;
    private static final SubLObject $const233$not;
    private static final SubLObject $const234$thereExists;
    private static final SubLObject $const235$and;
    private static final SubLObject $const236$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym237$REFERENCE_LIKELY_REFERS_TO__CODE;
    private static final SubLObject $const238$Collection;
    private static final SubLSymbol $sym239$_PRED;
    private static final SubLObject $const240$or;
    private static final SubLObject $const241$relationAllExists;
    private static final SubLObject $const242$relationExistsAll;
    private static final SubLList $list243;
    private static final SubLObject $const244$genls;
    private static final SubLObject $const245$isa;
    private static final SubLString $str246$Don_t_know_what_category_of_refer;
    private static final SubLInteger $int247$30;
    private static final SubLObject $const248$CycNounLearnerLexicalMt;
    private static final SubLObject $const249$Pronoun;
    private static final SubLObject $const250$YearFn;
    private static final SubLSymbol $sym251$INTEGERP;
    private static final SubLInteger $int252$100;
    private static final SubLInteger $int253$5000;
    private static final SubLSymbol $kw254$NP;
    private static final SubLObject $const255$NounPhrase;
    private static final SubLSymbol $kw256$VB;
    private static final SubLSymbol $kw257$VBD;
    private static final SubLSymbol $kw258$VBG;
    private static final SubLSymbol $kw259$VBN;
    private static final SubLSymbol $kw260$VBP;
    private static final SubLSymbol $kw261$VBZ;
    private static final SubLObject $const262$Verb;
    private static final SubLSymbol $kw263$NN;
    private static final SubLSymbol $kw264$NNS;
    private static final SubLSymbol $kw265$NNP;
    private static final SubLSymbol $kw266$NNPS;
    private static final SubLObject $const267$Noun;
    private static final SubLSymbol $kw268$PRP;
    private static final SubLSymbol $kw269$PDT;
    private static final SubLSymbol $kw270$EX;
    private static final SubLObject $const271$There_Existential;
    private static final SubLSymbol $kw272$QP;
    private static final SubLSymbol $kw273$ANY;
    private static final SubLString $str274$Don_t_know_the_POS_category_for__;
    private static final SubLList $list275;
    private static final SubLObject $const276$InstanceNamedFn;
    private static final SubLList $list277;
    private static final SubLSymbol $kw278$MASC;
    private static final SubLSymbol $kw279$FEM;
    private static final SubLObject $const280$NLDefinitenessFn;
    private static final SubLObject $const281$NLNumberFn;
    private static final SubLSymbol $sym282$KB_NL_DEFINITENESS_ATTRIBUTE_P;
    private static final SubLSymbol $kw283$OUTPUT;
    private static final SubLString $str284$_cyc_top_data_nl_coreference_test;
    private static final SubLString $str285$____Sentence____S__;
    private static final SubLString $str286$____Not_parsed_;
    private static final SubLString $str287$____Reference___S____Cycls___S___;
    private static final SubLString $str288$Best_antecedent__;
    private static final SubLString $str289$__Likely_antecedents__;
    private static final SubLString $str290$None___;
    private static final SubLString $str291$____________________;
    private static final SubLString $str292$__Possible_antecedents__;
    private static final SubLString $str293$______________________;
    private static final SubLString $str294$Anaphor_with_no_possible_antecede;
    private static final SubLString $str295$Not_an_anaphor___;
    private static final SubLString $str296$Anaphor_resolving_to_background_k;
    private static final SubLString $str297$Likely_accomodatable_anaphor___;
    private static final SubLString $str298$Got_unexpected_value_from_REFEREN;
    private static final SubLString $str299$_;
    private static final SubLString $str300$____;
    private static final SubLString $str301$__S;
    private static final SubLString $str302$100_;
    private static final SubLString $str303$sent;
    private static final SubLString $str304$Sentence___;
    private static final SubLString $str305$Show;
    private static final SubLString $str306$Hide;
    private static final SubLSymbol $kw307$VISIBLE;
    private static final SubLSymbol $kw308$TEXT;
    private static final SubLString $str309$Not_parsed_;
    private static final SubLString $str310$parses;
    private static final SubLString $str311$more;
    private static final SubLString $str312$Reference___S;
    private static final SubLString $str313$Parses_;
    private static final SubLSymbol $kw314$INVISIBLE;
    private static final SubLString $str315$Show_more;
    private static final SubLString $str316$Likely_antecedents__;
    private static final SubLString $str317$None_;
    private static final SubLString $str318$Possible_antecedents__;
    private static final SubLString $str319$Anaphor_with_no_possible_antecede;
    private static final SubLString $str320$Functional_dependency__;
    private static final SubLString $str321$Not_an_anaphor_;
    private static final SubLString $str322$Anaphor_resolving_to_background_k;
    private static final SubLString $str323$Likely_accomodatable_anaphor_;
    private static final SubLString $str324$Got_unexpected_value_from_REFEREN;
    private static final SubLString $str325$__;
    private static final SubLList $list326;
    private static final SubLString $str327$Related_to__S_via_;
    private static final SubLString $str328$Don_t_recognize__S_as_a_functiona;
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject coreference_resolution_discourse_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)coreference_resolution.ZERO_INTEGER);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject coreference_resolution_discourse_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $coreference_resolution_discourse_struct_native.class) ? coreference_resolution.T : coreference_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_implementation(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_parser(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_use_pspP(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_max_sufficient_recentness(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_max_possible_antecedents(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_max_sufficient_recentness_for_gendered_pronoun(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_max_possible_antecedents_for_gendered_pronoun(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_reference_note_hash(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_recent_references(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject crd_sentences(final SubLObject v_object) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_implementation(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_parser(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_use_pspP(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_max_sufficient_recentness(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_max_possible_antecedents(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_max_sufficient_recentness_for_gendered_pronoun(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_max_possible_antecedents_for_gendered_pronoun(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_reference_note_hash(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_recent_references(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject _csetf_crd_sentences(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != coreference_resolution_discourse_struct_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject make_coreference_resolution_discourse_struct(SubLObject arglist) {
        if (arglist == coreference_resolution.UNPROVIDED) {
            arglist = (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject v_new = (SubLObject)new $coreference_resolution_discourse_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)coreference_resolution.NIL, next = arglist; coreference_resolution.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw29$IMPLEMENTATION)) {
                _csetf_crd_implementation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw30$PARSER)) {
                _csetf_crd_parser(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw31$USE_PSP_)) {
                _csetf_crd_use_pspP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw32$MAX_SUFFICIENT_RECENTNESS)) {
                _csetf_crd_max_sufficient_recentness(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw33$MAX_POSSIBLE_ANTECEDENTS)) {
                _csetf_crd_max_possible_antecedents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw34$MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN)) {
                _csetf_crd_max_sufficient_recentness_for_gendered_pronoun(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw35$MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN)) {
                _csetf_crd_max_possible_antecedents_for_gendered_pronoun(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw36$REFERENCE_NOTE_HASH)) {
                _csetf_crd_reference_note_hash(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw37$RECENT_REFERENCES)) {
                _csetf_crd_recent_references(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw38$SENTENCES)) {
                _csetf_crd_sentences(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)coreference_resolution.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject visit_defstruct_coreference_resolution_discourse_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw40$BEGIN, (SubLObject)coreference_resolution.$sym41$MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, (SubLObject)coreference_resolution.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw29$IMPLEMENTATION, crd_implementation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw30$PARSER, crd_parser(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw31$USE_PSP_, crd_use_pspP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw32$MAX_SUFFICIENT_RECENTNESS, crd_max_sufficient_recentness(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw33$MAX_POSSIBLE_ANTECEDENTS, crd_max_possible_antecedents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw34$MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, crd_max_sufficient_recentness_for_gendered_pronoun(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw35$MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, crd_max_possible_antecedents_for_gendered_pronoun(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw36$REFERENCE_NOTE_HASH, crd_reference_note_hash(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw37$RECENT_REFERENCES, crd_recent_references(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw38$SENTENCES, crd_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw43$END, (SubLObject)coreference_resolution.$sym41$MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, (SubLObject)coreference_resolution.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 916L)
    public static SubLObject visit_defstruct_object_coreference_resolution_discourse_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_coreference_resolution_discourse_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 2797L)
    public static SubLObject new_coref_discourse(SubLObject max_sufficient_recentness, SubLObject max_possible_antecedents, SubLObject max_sufficient_recentness_for_gendered_pronoun, SubLObject max_possible_antecedents_for_gendered_pronoun, SubLObject use_pspP, SubLObject v_parser, SubLObject implementation) {
        if (max_sufficient_recentness == coreference_resolution.UNPROVIDED) {
            max_sufficient_recentness = (SubLObject)coreference_resolution.FIVE_INTEGER;
        }
        if (max_possible_antecedents == coreference_resolution.UNPROVIDED) {
            max_possible_antecedents = (SubLObject)coreference_resolution.FIVE_INTEGER;
        }
        if (max_sufficient_recentness_for_gendered_pronoun == coreference_resolution.UNPROVIDED) {
            max_sufficient_recentness_for_gendered_pronoun = (SubLObject)coreference_resolution.TWO_INTEGER;
        }
        if (max_possible_antecedents_for_gendered_pronoun == coreference_resolution.UNPROVIDED) {
            max_possible_antecedents_for_gendered_pronoun = (SubLObject)coreference_resolution.TWO_INTEGER;
        }
        if (use_pspP == coreference_resolution.UNPROVIDED) {
            use_pspP = (SubLObject)coreference_resolution.T;
        }
        if (v_parser == coreference_resolution.UNPROVIDED) {
            v_parser = object.new_class_instance((SubLObject)coreference_resolution.$sym45$STANFORD_PARSER);
        }
        if (implementation == coreference_resolution.UNPROVIDED) {
            implementation = (SubLObject)coreference_resolution.$kw46$CODE;
        }
        return make_coreference_resolution_discourse_struct((SubLObject)ConsesLow.list(new SubLObject[] { coreference_resolution.$kw32$MAX_SUFFICIENT_RECENTNESS, max_sufficient_recentness, coreference_resolution.$kw33$MAX_POSSIBLE_ANTECEDENTS, max_possible_antecedents, coreference_resolution.$kw34$MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, max_sufficient_recentness_for_gendered_pronoun, coreference_resolution.$kw35$MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, max_possible_antecedents_for_gendered_pronoun, coreference_resolution.$kw31$USE_PSP_, use_pspP, coreference_resolution.$kw30$PARSER, v_parser, coreference_resolution.$kw29$IMPLEMENTATION, implementation, coreference_resolution.$kw36$REFERENCE_NOTE_HASH, Hashtables.make_hash_table((SubLObject)coreference_resolution.$int47$50, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED), coreference_resolution.$kw37$RECENT_REFERENCES, coreference_resolution.NIL, coreference_resolution.$kw38$SENTENCES, coreference_resolution.NIL }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 3722L)
    public static SubLObject coref_discourse_p(final SubLObject v_object) {
        return coreference_resolution_discourse_struct_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 3825L)
    public static SubLObject coreference_resolution_referenceP(final SubLObject v_object, final SubLObject coref_discourse) {
        return reference_note_p(reference_note(v_object, coref_discourse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 4137L)
    public static SubLObject reference_note_p(final SubLObject v_object) {
        return reference_info_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 4215L)
    public static SubLObject reference_note(final SubLObject reference, final SubLObject coref_discourse) {
        return Hashtables.gethash(reference, crd_reference_note_hash(coref_discourse), (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 4417L)
    public static SubLObject set_reference_note(final SubLObject reference, final SubLObject note, final SubLObject coref_discourse) {
        return Hashtables.sethash(reference, crd_reference_note_hash(coref_discourse), note);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 4562L)
    public static SubLObject resolve_coreferences_in_parse_tree(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject coref_discourse = (SubLObject)coreference_resolution.NIL;
        SubLObject v_parse_tree = (SubLObject)coreference_resolution.NIL;
        SubLObject sentence_references_var = (SubLObject)coreference_resolution.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)coreference_resolution.$list48);
        coref_discourse = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)coreference_resolution.$list48);
        v_parse_tree = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)coreference_resolution.$list48);
        sentence_references_var = current.first();
        current = current.rest();
        if (coreference_resolution.NIL == current) {
            final SubLObject coref_discourse_var = (SubLObject)coreference_resolution.$sym49$COREF_DISCOURSE_VAR;
            final SubLObject reference_var = (SubLObject)coreference_resolution.$sym50$REFERENCE_VAR;
            final SubLObject recent_references_var = (SubLObject)coreference_resolution.$sym51$RECENT_REFERENCES_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym52$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(coref_discourse_var, coref_discourse), (SubLObject)ConsesLow.list(recent_references_var, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym25$CRD_RECENT_REFERENCES, coref_discourse_var))), (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym53$DO_PARSE_TREE_SUBTREES, (SubLObject)ConsesLow.listS(reference_var, v_parse_tree, (SubLObject)coreference_resolution.$list54), (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym55$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym56$CAND, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym57$NP_TREE_P, reference_var), (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym58$IS_THE_ONLY_HEAD_DAUGHTER_OF_AN_NP_, reference_var)), (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym59$RESOLVE_REFERENCE, coref_discourse_var, reference_var, sentence_references_var, recent_references_var), (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$sym60$CPUSH, reference_var, sentence_references_var))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)coreference_resolution.$list48);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 5293L)
    public static SubLObject resolve_coreferences(final SubLObject input, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        if (coreference_resolution.NIL != list_utilities.list_of_type_p(Symbols.symbol_function((SubLObject)coreference_resolution.$sym61$PARSE_TREE_P), input)) {
            return resolve_coreferences_in_list_of_parse_trees(input, coref_discourse);
        }
        if (coreference_resolution.NIL != document.document_p(input)) {
            return resolve_coreferences_in_document(input, coref_discourse);
        }
        if (input.isStream() && coreference_resolution.NIL != streams_high.input_stream_p(input)) {
            return resolve_coreferences_in_stream(input, coref_discourse);
        }
        if (coreference_resolution.NIL != file_utilities.pathname_designator_p(input) && coreference_resolution.NIL != Filesys.probe_file(input)) {
            return resolve_coreferences_in_text_file(input, coref_discourse);
        }
        if (input.isString()) {
            return resolve_coreferences_in_string(input, coref_discourse);
        }
        Errors.error((SubLObject)coreference_resolution.$str62$_S_is_not_valid_input_for_the_cor, input);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 6290L)
    public static SubLObject resolve_coreferences_in_text_file(final SubLObject text_file, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        SubLObject stream = (SubLObject)coreference_resolution.NIL;
        try {
            stream = compatibility.open_text(text_file, (SubLObject)coreference_resolution.$kw63$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)coreference_resolution.$str64$Unable_to_open__S, text_file);
            }
            final SubLObject stream_$1 = stream;
            coref_discourse = resolve_coreferences_in_stream(stream_$1, coref_discourse);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)coreference_resolution.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 6615L)
    public static SubLObject resolve_coreferences_in_stream(final SubLObject stream, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        assert coreference_resolution.NIL != streams_high.input_stream_p(stream) : stream;
        return resolve_coreferences_in_document(document.new_document(stream, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED), coref_discourse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 6899L)
    public static SubLObject resolve_coreferences_in_string(final SubLObject string, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        assert coreference_resolution.NIL != Types.stringp(string) : string;
        return resolve_coreferences_in_document(document.new_document(string, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED), coref_discourse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 7176L)
    public static SubLObject resolve_coreferences_in_document(final SubLObject v_document, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (coreference_resolution.NIL == coref_discourse) {
            coref_discourse = new_coref_discourse((SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = parsing_vars.$use_ternary_np_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$use_ternary_np_tagsP$.bind((SubLObject)coreference_resolution.NIL, thread);
            final SubLObject vector_var = document.document_paragraphs(v_document);
            final SubLObject backwardP_var = (SubLObject)coreference_resolution.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject paragraph;
            SubLObject vector_var_$2;
            SubLObject backwardP_var_$3;
            SubLObject length_$4;
            SubLObject v_iteration_$5;
            SubLObject element_num_$6;
            SubLObject sentence;
            SubLObject sentence_string;
            SubLObject v_parse_tree;
            SubLObject sentence_references;
            SubLObject coref_discourse_var;
            SubLObject recent_references_var;
            SubLObject categories_var;
            SubLObject stack;
            SubLObject order_var;
            SubLObject possible_orders;
            SubLObject reference_var;
            SubLObject vector_var_$3;
            SubLObject backwardP_var_$4;
            SubLObject length_$5;
            SubLObject v_iteration_$6;
            SubLObject element_num_$7;
            SubLObject daughter;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)coreference_resolution.NIL, v_iteration = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                element_num = ((coreference_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration);
                paragraph = Vectors.aref(vector_var, element_num);
                vector_var_$2 = document.paragraph_sentences(paragraph);
                backwardP_var_$3 = (SubLObject)coreference_resolution.NIL;
                for (length_$4 = Sequences.length(vector_var_$2), v_iteration_$5 = (SubLObject)coreference_resolution.NIL, v_iteration_$5 = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration_$5.numL(length_$4); v_iteration_$5 = Numbers.add(v_iteration_$5, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                    element_num_$6 = ((coreference_resolution.NIL != backwardP_var_$3) ? Numbers.subtract(length_$4, v_iteration_$5, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration_$5);
                    sentence = Vectors.aref(vector_var_$2, element_num_$6);
                    sentence_string = document.sentence_string(sentence);
                    v_parse_tree = crd_parse(coref_discourse, sentence_string);
                    sentence_references = (SubLObject)coreference_resolution.NIL;
                    if (coreference_resolution.NIL == parse_tree.parse_tree_p(v_parse_tree)) {
                        Errors.warn((SubLObject)coreference_resolution.$str67$Got_invalid_parse_result_for__S__, sentence_string, v_parse_tree);
                        crd_add_sentence(coref_discourse, sentence_string);
                    }
                    else {
                        crd_add_sentence(coref_discourse, v_parse_tree);
                        coref_discourse_var = coref_discourse;
                        recent_references_var = crd_recent_references(coref_discourse_var);
                        categories_var = (SubLObject)coreference_resolution.$list68;
                        stack = stacks.create_stack();
                        order_var = (SubLObject)coreference_resolution.$kw69$DFL2R;
                        possible_orders = (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw69$DFL2R, (SubLObject)coreference_resolution.$kw70$DFR2L);
                        reference_var = (SubLObject)coreference_resolution.NIL;
                        if (coreference_resolution.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && coreference_resolution.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
                            Errors.error((SubLObject)coreference_resolution.$str71$_S_is_not_one_of__S, order_var, possible_orders);
                        }
                        stacks.stack_push(v_parse_tree, stack);
                        while (coreference_resolution.NIL == stacks.stack_empty_p(stack)) {
                            reference_var = stacks.stack_pop(stack);
                            if ((categories_var == coreference_resolution.$kw72$ALL || coreference_resolution.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(reference_var, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY), categories_var, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED)) && (coreference_resolution.NIL == parse_tree.np_tree_p(reference_var) || coreference_resolution.NIL == is_the_only_head_daughter_of_an_npP(reference_var))) {
                                resolve_reference(coref_discourse_var, reference_var, sentence_references, recent_references_var);
                                sentence_references = (SubLObject)ConsesLow.cons(reference_var, sentence_references);
                            }
                            if (coreference_resolution.NIL != parse_tree.phrase_tree_p(reference_var)) {
                                vector_var_$3 = parse_tree.get_phrase_tree_daughters(reference_var);
                                backwardP_var_$4 = Equality.eq(order_var, (SubLObject)coreference_resolution.$kw69$DFL2R);
                                for (length_$5 = Sequences.length(vector_var_$3), v_iteration_$6 = (SubLObject)coreference_resolution.NIL, v_iteration_$6 = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration_$6.numL(length_$5); v_iteration_$6 = Numbers.add(v_iteration_$6, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                                    element_num_$7 = ((coreference_resolution.NIL != backwardP_var_$4) ? Numbers.subtract(length_$5, v_iteration_$6, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration_$6);
                                    daughter = Vectors.aref(vector_var_$3, element_num_$7);
                                    stacks.stack_push(daughter, stack);
                                }
                            }
                        }
                    }
                    note_latest_sentence_references(coref_discourse, sentence_references);
                }
            }
        }
        finally {
            parsing_vars.$use_ternary_np_tagsP$.rebind(_prev_bind_0, thread);
        }
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 8171L)
    public static SubLObject resolve_coreferences_in_list_of_parse_trees(final SubLObject parse_trees, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert coreference_resolution.NIL != list_utilities.non_dotted_list_p(parse_trees) : parse_trees;
        SubLObject cdolist_list_var = parse_trees;
        SubLObject elem = (SubLObject)coreference_resolution.NIL;
        elem = cdolist_list_var.first();
        while (coreference_resolution.NIL != cdolist_list_var) {
            assert coreference_resolution.NIL != parse_tree.parse_tree_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (coreference_resolution.NIL == coref_discourse) {
            coref_discourse = new_coref_discourse((SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        crd_add_sentences(coref_discourse, parse_trees);
        final SubLObject _prev_bind_0 = parsing_vars.$use_ternary_np_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$use_ternary_np_tagsP$.bind((SubLObject)coreference_resolution.NIL, thread);
            cdolist_list_var = parse_trees;
            SubLObject v_parse_tree = (SubLObject)coreference_resolution.NIL;
            v_parse_tree = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                SubLObject sentence_references = (SubLObject)coreference_resolution.NIL;
                final SubLObject coref_discourse_var = coref_discourse;
                final SubLObject recent_references_var = crd_recent_references(coref_discourse_var);
                final SubLObject categories_var = (SubLObject)coreference_resolution.$list68;
                final SubLObject stack = stacks.create_stack();
                final SubLObject order_var = (SubLObject)coreference_resolution.$kw69$DFL2R;
                final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw69$DFL2R, (SubLObject)coreference_resolution.$kw70$DFR2L);
                SubLObject reference_var = (SubLObject)coreference_resolution.NIL;
                if (coreference_resolution.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && coreference_resolution.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
                    Errors.error((SubLObject)coreference_resolution.$str71$_S_is_not_one_of__S, order_var, possible_orders);
                }
                stacks.stack_push(v_parse_tree, stack);
                while (coreference_resolution.NIL == stacks.stack_empty_p(stack)) {
                    reference_var = stacks.stack_pop(stack);
                    if ((categories_var == coreference_resolution.$kw72$ALL || coreference_resolution.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(reference_var, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY), categories_var, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED)) && (coreference_resolution.NIL == parse_tree.np_tree_p(reference_var) || coreference_resolution.NIL == is_the_only_head_daughter_of_an_npP(reference_var))) {
                        resolve_reference(coref_discourse_var, reference_var, sentence_references, recent_references_var);
                        sentence_references = (SubLObject)ConsesLow.cons(reference_var, sentence_references);
                    }
                    if (coreference_resolution.NIL != parse_tree.phrase_tree_p(reference_var)) {
                        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(reference_var);
                        final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)coreference_resolution.$kw69$DFL2R);
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject daughter;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)coreference_resolution.NIL, v_iteration = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                            element_num = ((coreference_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration);
                            daughter = Vectors.aref(vector_var, element_num);
                            stacks.stack_push(daughter, stack);
                        }
                    }
                }
                note_latest_sentence_references(coref_discourse, sentence_references);
                cdolist_list_var = cdolist_list_var.rest();
                v_parse_tree = cdolist_list_var.first();
            }
        }
        finally {
            parsing_vars.$use_ternary_np_tagsP$.rebind(_prev_bind_0, thread);
        }
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 8827L)
    public static SubLObject coref_discourse_coreferring_expressions(final SubLObject coref_discourse) {
        SubLObject referents = (SubLObject)coreference_resolution.NIL;
        final SubLObject cdohash_table = crd_reference_note_hash(coref_discourse);
        SubLObject reference = (SubLObject)coreference_resolution.NIL;
        SubLObject reference_note = (SubLObject)coreference_resolution.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                reference = Hashtables.getEntryKey(cdohash_entry);
                reference_note = Hashtables.getEntryValue(cdohash_entry);
                final SubLObject referent = reference_referent(reference, coref_discourse);
                if (coreference_resolution.NIL != referent) {
                    final SubLObject item_var = referent;
                    if (coreference_resolution.NIL != conses_high.member(item_var, referents, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), Symbols.symbol_function((SubLObject)coreference_resolution.IDENTITY))) {
                        continue;
                    }
                    referents = (SubLObject)ConsesLow.cons(item_var, referents);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)coreference_resolution.$sym75$REFERENT_STRUCT_REFERENCES), referents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 9441L)
    public static SubLObject crd_parse(final SubLObject coref_discourse, final SubLObject sentence_string) {
        final SubLObject v_parser = crd_parser(coref_discourse);
        return methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)coreference_resolution.$sym76$PARSE, sentence_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 9598L)
    public static SubLObject crd_add_sentences(final SubLObject coref_discourse, final SubLObject sentences) {
        _csetf_crd_sentences(coref_discourse, ConsesLow.append(crd_sentences(coref_discourse), sentences));
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 9767L)
    public static SubLObject crd_add_sentence(final SubLObject coref_discourse, final SubLObject sentence) {
        _csetf_crd_sentences(coref_discourse, list_utilities.snoc(sentence, crd_sentences(coref_discourse)));
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 9931L)
    public static SubLObject crd_sentence_string(final SubLObject sentence) {
        if (coreference_resolution.NIL != parse_tree.parse_tree_p(sentence)) {
            return parse_tree_utilities.parse_tree_string(sentence);
        }
        if (sentence.isString()) {
            return sentence;
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 10101L)
    public static SubLObject note_latest_sentence_references(final SubLObject coref_discourse, final SubLObject sentence_references) {
        SubLObject recent_references = crd_recent_references(coref_discourse);
        final SubLObject max_sufficient_recentness = crd_max_sufficient_recentness(coref_discourse);
        recent_references = (SubLObject)ConsesLow.cons(sentence_references, list_utilities.first_n(Numbers.subtract(max_sufficient_recentness, (SubLObject)coreference_resolution.ONE_INTEGER), recent_references));
        _csetf_crd_recent_references(coref_discourse, recent_references);
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 10518L)
    public static SubLObject is_the_only_head_daughter_of_an_npP(final SubLObject reference) {
        final SubLObject mother = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym77$GET_MOTHER);
        if (coreference_resolution.NIL != parse_tree.np_tree_p(mother)) {
            final SubLObject head_daughters_of_mother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)coreference_resolution.$sym78$GET_HEAD_DAUGHTERS);
            return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != list_utilities.singletonP(head_daughters_of_mother) && reference.eql(head_daughters_of_mother.first()));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 10855L)
    public static SubLObject resolve_reference(final SubLObject coref_discourse, final SubLObject reference, final SubLObject sentence_references, final SubLObject recent_references) {
        final SubLObject reference_note = new_reference_note(coref_discourse, reference);
        set_reference_note(reference, reference_note, coref_discourse);
        final SubLObject possible_anaphorP = reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_, coref_discourse, (SubLObject)coreference_resolution.UNPROVIDED);
        final SubLObject possible_antecedentP = reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_, coref_discourse, (SubLObject)coreference_resolution.UNPROVIDED);
        if (possible_anaphorP == coreference_resolution.$kw81$STANDARD_ANAPHOR) {
            SubLObject preceding_references_in_sentence = (SubLObject)coreference_resolution.NIL;
            final SubLObject ancestors = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym82$GET_ANCESTORS);
            SubLObject cdolist_list_var = sentence_references;
            SubLObject sentence_reference = (SubLObject)coreference_resolution.NIL;
            sentence_reference = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                if (coreference_resolution.NIL == subl_promotions.memberP(sentence_reference, ancestors, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
                    preceding_references_in_sentence = (SubLObject)ConsesLow.cons(sentence_reference, preceding_references_in_sentence);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence_reference = cdolist_list_var.first();
            }
            preceding_references_in_sentence = Sequences.nreverse(preceding_references_in_sentence);
            final SubLObject max_recentness = max_sufficient_recentness_for_reference(coref_discourse, reference);
            final SubLObject antecedent_candidates = ConsesLow.append(preceding_references_in_sentence, list_utilities.flatten(list_utilities.first_n(max_recentness, recent_references)));
            final SubLObject possible_antecedents = reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS, coref_discourse, (SubLObject)ConsesLow.list(antecedent_candidates));
            if (coreference_resolution.NIL != list_utilities.non_empty_list_p(possible_antecedents)) {
                final SubLObject likely_antecedents = reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS, coref_discourse, (SubLObject)ConsesLow.list(possible_antecedents));
                reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, coref_discourse, (SubLObject)ConsesLow.list(likely_antecedents, possible_antecedents));
                reference_set(reference, (SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY, (SubLObject)coreference_resolution.NIL, coref_discourse);
                reference_do_implementation_specific_processing(coref_discourse, reference, (SubLObject)coreference_resolution.$kw87$ANAPHOR_WITH_POSSIBLE_ANTECEDENTS);
            }
            else {
                reference_set(reference, (SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS, (SubLObject)coreference_resolution.NIL, coref_discourse);
                reference_set(reference, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, (SubLObject)coreference_resolution.NIL, coref_discourse);
                reference_calculate_and_set(reference, (SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY, coref_discourse, (SubLObject)ConsesLow.list(antecedent_candidates));
                reference_do_implementation_specific_processing(coref_discourse, reference, (SubLObject)coreference_resolution.$kw88$ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS);
            }
        }
        else {
            reference_set(reference, (SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS, (SubLObject)coreference_resolution.NIL, coref_discourse);
            reference_set(reference, (SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS, (SubLObject)coreference_resolution.NIL, coref_discourse);
            reference_set(reference, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, (SubLObject)coreference_resolution.NIL, coref_discourse);
            reference_set(reference, (SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY, (SubLObject)coreference_resolution.NIL, coref_discourse);
            reference_do_implementation_specific_processing(coref_discourse, reference, (SubLObject)((coreference_resolution.NIL != possible_antecedentP) ? coreference_resolution.$kw89$NON_ANAPHOR_POSSIBLE_ANTECEDENT : coreference_resolution.$kw90$NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT));
        }
        return reference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 13556L)
    public static SubLObject max_sufficient_recentness_for_reference(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != reference_gendered_pronounP(coref_discourse, reference)) ? crd_max_sufficient_recentness_for_gendered_pronoun(coref_discourse) : crd_max_sufficient_recentness(coref_discourse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 13860L)
    public static SubLObject max_possible_antecedents_for_reference(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != reference_gendered_pronounP(coref_discourse, reference)) ? crd_max_possible_antecedents_for_gendered_pronoun(coref_discourse) : crd_max_possible_antecedents(coref_discourse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 14161L)
    public static SubLObject reference_gendered_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_gendered_pronounP_code(coref_discourse, reference);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 14687L)
    public static SubLObject reference_calculate_and_set(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, SubLObject args) {
        if (args == coreference_resolution.UNPROVIDED) {
            args = (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject value = reference_calculate(reference, slot, coref_discourse, args);
        reference_set(reference, slot, value, coref_discourse);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 14931L)
    public static SubLObject reference_possibly_calculate(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, SubLObject args) {
        if (args == coreference_resolution.UNPROVIDED) {
            args = (SubLObject)coreference_resolution.NIL;
        }
        SubLObject value = reference_get(reference, slot, coref_discourse);
        if (value == coreference_resolution.$kw94$DONT_KNOW_YET) {
            value = reference_calculate_and_set(reference, slot, coref_discourse, args);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 15232L)
    public static SubLObject reference_calculate(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse, final SubLObject args) {
        if (slot.eql((SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym95$REFERENCE_POSSIBLE_ANAPHOR__CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym96$REFERENCE_POSSIBLE_ANTECEDENT__CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym97$REFERENCE_POSSIBLE_ANTECEDENTS_CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym98$REFERENCE_LIKELY_ANTECEDENTS_CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym99$REFERENCE_BEST_ANTECEDENT_CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY)) {
            return Functions.apply((SubLObject)coreference_resolution.$sym100$REFERENCE_FUNCTIONAL_DEPENDENCY_CALCULATE, reference, new SubLObject[] { coref_discourse, args });
        }
        Errors.error((SubLObject)coreference_resolution.$str101$Don_t_know_how_to_calculate_refer, slot);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 16132L)
    public static SubLObject reference_possible_anaphorP_calculate(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_possible_anaphorP_calculate_code(coref_discourse, reference);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 16865L)
    public static SubLObject reference_possible_antecedentP_calculate(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_possible_antecedentP_calculate_code(coref_discourse, reference);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 17607L)
    public static SubLObject reference_possible_antecedents_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_possible_antecedents_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 18390L)
    public static SubLObject reference_likely_antecedents_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_likely_antecedents_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 19236L)
    public static SubLObject reference_best_antecedent_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject likely_antecedents, final SubLObject possible_antecedents) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_best_antecedent_calculate_code(reference, likely_antecedents, possible_antecedents);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 20332L)
    public static SubLObject reference_functional_dependency_calculate(final SubLObject reference, final SubLObject coref_discourse, final SubLObject candidates) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_functional_dependency_calculate_code(coref_discourse, reference, candidates);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 21150L)
    public static SubLObject reference_get(final SubLObject reference, final SubLObject slot, final SubLObject coref_discourse) {
        final SubLObject reference_note = reference_note(reference, coref_discourse);
        if (slot.eql((SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_)) {
            return reference_note_possible_anaphorP_get(coref_discourse, reference_note);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_)) {
            return reference_note_possible_antecedentP_get(coref_discourse, reference_note);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS)) {
            return reference_note_possible_antecedents_get(coref_discourse, reference_note);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS)) {
            return reference_note_likely_antecedents_get(coref_discourse, reference_note);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT)) {
            return reference_note_best_antecedent_get(coref_discourse, reference_note);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY)) {
            return reference_note_functional_dependency_get(coref_discourse, reference_note);
        }
        Errors.error((SubLObject)coreference_resolution.$str102$Don_t_know_how_to_get_reference_s, slot);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 22080L)
    public static SubLObject reference_note_possible_anaphorP_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_anaphorP_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 22765L)
    public static SubLObject reference_note_possible_antecedentP_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_antecedentP_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 23459L)
    public static SubLObject reference_note_possible_antecedents_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_antecedents_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 24156L)
    public static SubLObject reference_note_likely_antecedents_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_likely_antecedents_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 24847L)
    public static SubLObject reference_note_best_antecedent_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_best_antecedent_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 25528L)
    public static SubLObject reference_note_functional_dependency_get(final SubLObject coref_discourse, final SubLObject reference_note) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_functional_dependency_get(reference_note);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 26239L)
    public static SubLObject reference_set(final SubLObject reference, final SubLObject slot, final SubLObject value, final SubLObject coref_discourse) {
        final SubLObject reference_note = reference_note(reference, coref_discourse);
        if (slot.eql((SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_)) {
            return reference_note_possible_anaphorP_set(coref_discourse, reference_note, value);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_)) {
            return reference_note_possible_antecedentP_set(coref_discourse, reference_note, value);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS)) {
            return reference_note_possible_antecedents_set(coref_discourse, reference_note, value);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS)) {
            return reference_note_likely_antecedents_set(coref_discourse, reference_note, value);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT)) {
            return reference_note_best_antecedent_set(coref_discourse, reference_note, value);
        }
        if (slot.eql((SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY)) {
            return reference_note_functional_dependency_set(coref_discourse, reference_note, value);
        }
        Errors.error((SubLObject)coreference_resolution.$str103$Don_t_know_how_to_set_reference_s, slot);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 27211L)
    public static SubLObject reference_note_possible_anaphorP_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_anaphorP_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 27912L)
    public static SubLObject reference_note_possible_antecedentP_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_antecedentP_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 28622L)
    public static SubLObject reference_note_possible_antecedents_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_possible_antecedents_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 29335L)
    public static SubLObject reference_note_likely_antecedents_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_likely_antecedents_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 30042L)
    public static SubLObject reference_note_best_antecedent_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_best_antecedent_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 30739L)
    public static SubLObject reference_note_functional_dependency_set(final SubLObject coref_discourse, final SubLObject reference_note, final SubLObject value) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_info_functional_dependency_set(reference_note, value);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 31454L)
    public static SubLObject new_reference_note(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return new_reference_info(coref_discourse, reference);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 31957L)
    public static SubLObject reference_do_implementation_specific_processing(final SubLObject coref_discourse, final SubLObject reference, final SubLObject reason) {
        final SubLObject pcase_var;
        final SubLObject implementation = pcase_var = crd_implementation(coref_discourse);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw91$KB)) {
            Errors.error((SubLObject)coreference_resolution.$str92$The__KB_implementation_of_corefer);
        }
        else {
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw46$CODE)) {
                return reference_do_implementation_specific_processing_code(coref_discourse, reference, reason);
            }
            Errors.error((SubLObject)coreference_resolution.$str93$Don_t_know_about__S_implementatio, implementation);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_reference_info(v_object, stream, (SubLObject)coreference_resolution.ZERO_INTEGER);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $reference_info_native.class) ? coreference_resolution.T : coreference_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_index_number(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_tree(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_cycls(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_possible_antecedentP(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_possible_anaphorP(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_possible_antecedents(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_likely_antecedents(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_best_antecedent(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_functional_dependency(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject reference_info_referent(final SubLObject v_object) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_index_number(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_tree(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_cycls(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_possible_antecedentP(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_possible_anaphorP(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_possible_antecedents(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_likely_antecedents(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_best_antecedent(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_functional_dependency(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject _csetf_reference_info_referent(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != reference_info_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject make_reference_info(SubLObject arglist) {
        if (arglist == coreference_resolution.UNPROVIDED) {
            arglist = (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject v_new = (SubLObject)new $reference_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)coreference_resolution.NIL, next = arglist; coreference_resolution.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw133$INDEX_NUMBER)) {
                _csetf_reference_info_index_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw134$TREE)) {
                _csetf_reference_info_tree(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw135$CYCLS)) {
                _csetf_reference_info_cycls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_)) {
                _csetf_reference_info_possible_antecedentP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_)) {
                _csetf_reference_info_possible_anaphorP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS)) {
                _csetf_reference_info_possible_antecedents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS)) {
                _csetf_reference_info_likely_antecedents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT)) {
                _csetf_reference_info_best_antecedent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY)) {
                _csetf_reference_info_functional_dependency(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw136$REFERENT)) {
                _csetf_reference_info_referent(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)coreference_resolution.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject visit_defstruct_reference_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw40$BEGIN, (SubLObject)coreference_resolution.$sym137$MAKE_REFERENCE_INFO, (SubLObject)coreference_resolution.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw133$INDEX_NUMBER, reference_info_index_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw134$TREE, reference_info_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw135$CYCLS, reference_info_cycls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_, reference_info_possible_antecedentP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw79$POSSIBLE_ANAPHOR_, reference_info_possible_anaphorP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS, reference_info_possible_antecedents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw84$LIKELY_ANTECEDENTS, reference_info_likely_antecedents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, reference_info_best_antecedent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw86$FUNCTIONAL_DEPENDENCY, reference_info_functional_dependency(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw136$REFERENT, reference_info_referent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw43$END, (SubLObject)coreference_resolution.$sym137$MAKE_REFERENCE_INFO, (SubLObject)coreference_resolution.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32586L)
    public static SubLObject visit_defstruct_object_reference_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_reference_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 32927L)
    public static SubLObject print_reference_info(final SubLObject reference_info, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (coreference_resolution.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(reference_info, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, reference_info, (SubLObject)coreference_resolution.T, (SubLObject)coreference_resolution.T);
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str139$_S, reference_info_string(reference_info));
            print_macros.print_unreadable_object_postamble(stream, reference_info, (SubLObject)coreference_resolution.NIL, (SubLObject)coreference_resolution.NIL);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33149L)
    public static SubLObject reference_info_string(final SubLObject reference_info) {
        final SubLObject tree = reference_info_tree(reference_info);
        if (coreference_resolution.NIL != parse_tree.parse_tree_p(tree)) {
            return methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym140$GET_STRING);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33334L)
    public static SubLObject reference_info_cycl(final SubLObject reference_info) {
        final SubLObject cycls = reference_info_cycls(reference_info);
        if (coreference_resolution.NIL != cycls) {
            return cycls.first();
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33496L)
    public static SubLObject reference_cycl(final SubLObject reference, final SubLObject coref_discourse) {
        return reference_info_cycl(reference_note(reference, coref_discourse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33630L)
    public static SubLObject reference_cycl_stripped(final SubLObject reference, final SubLObject coref_discourse) {
        return parsing_utilities.strip_nl_tags(reference_cycl(reference, coref_discourse), (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33767L)
    public static SubLObject reference_semantics(final SubLObject reference, final SubLObject coref_discourse) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_psp_semantics(reference, coref_discourse) : reference_cyclifier_semantics(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 33982L)
    public static SubLObject reference_psp_semantics(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject semantics = reference_cycl_stripped(reference, coref_discourse);
        if (coreference_resolution.NIL == semantics || semantics.eql(coreference_resolution.$const141$Thing)) {
            return (SubLObject)coreference_resolution.$kw142$UNKNOWN;
        }
        if (coreference_resolution.NIL == parsing_utilities.cycl_pronoun_p(semantics)) {
            return semantics;
        }
        final SubLObject pcase_var = parsing_utilities.nl_gender_attr_for_cycl(semantics);
        if (pcase_var.eql(coreference_resolution.$const143$Ungendered_NLAttr)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        if (pcase_var.eql(coreference_resolution.$const144$Neuter_NLAttr)) {
            return cr_non_person();
        }
        if (pcase_var.eql(coreference_resolution.$const145$Masculine_NLAttr)) {
            return coreference_resolution.$const146$MaleHuman;
        }
        if (pcase_var.eql(coreference_resolution.$const147$Feminine_NLAttr)) {
            return coreference_resolution.$const148$FemaleHuman;
        }
        Errors.warn((SubLObject)coreference_resolution.$str149$Didn_t_know_there_was_such_a_gend, parsing_utilities.nl_gender_attr_for_cycl(semantics));
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 34836L)
    public static SubLObject reference_cyclifier_semantics(final SubLObject reference) {
        final SubLObject cyclifications = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym150$CYCLIFY);
        if (coreference_resolution.NIL != cyclifications) {
            final SubLObject stand_in_term = guess_referent_stand_in_in_cyclifications(reference, cyclifications);
            SubLObject semantics = cr_existentially_unbind(cyclifications.first());
            if (coreference_resolution.NIL != stand_in_term) {
                semantics = cycl_utilities.expression_subst((SubLObject)coreference_resolution.$sym151$_REFERENT, stand_in_term, semantics, Symbols.symbol_function((SubLObject)coreference_resolution.EQUAL), (SubLObject)coreference_resolution.UNPROVIDED);
            }
            return cr_split_conjunctions(semantics);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 35576L)
    public static SubLObject cr_existentially_unbind(SubLObject sentence) {
        while (coreference_resolution.NIL != el_utilities.el_existential_p(sentence)) {
            sentence = cycl_utilities.formula_arg2(sentence, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 35729L)
    public static SubLObject guess_referent_stand_in_in_cyclifications(final SubLObject reference, final SubLObject cyclifications) {
        return cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)coreference_resolution.$sym152$POSSIBLY_CYCLIFIER_REFERENT_STAND_IN), cyclifications.first(), (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36174L)
    public static SubLObject possibly_cyclifier_referent_stand_in(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != cycl_grammar.el_variable_p(v_object) || coreference_resolution.NIL != instance_fn_nat_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36307L)
    public static SubLObject instance_fn_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != cycl_grammar.cycl_nat_p(v_object) && coreference_resolution.$const153$InstanceFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36475L)
    public static SubLObject cr_non_person() {
        if (coreference_resolution.NIL == coreference_resolution.$cr_non_person$.getGlobalValue()) {
            coreference_resolution.$cr_non_person$.setGlobalValue(el_utilities.make_binary_formula(coreference_resolution.$const154$CollectionDifferenceFn, coreference_resolution.$const141$Thing, coreference_resolution.$const155$Person));
        }
        return coreference_resolution.$cr_non_person$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36659L)
    public static SubLObject reference_number(final SubLObject reference, final SubLObject coref_discourse) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_psp_number(reference, coref_discourse) : reference_cyclifier_number(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 36865L)
    public static SubLObject reference_psp_number(final SubLObject reference, final SubLObject coref_discourse) {
        SubLObject number = parsing_utilities.nl_number_attr_for_cycl(reference_cycl(reference, coref_discourse));
        final SubLObject reference_semantics = reference_psp_semantics(reference, coref_discourse);
        if (number.eql(coreference_resolution.$const156$UnmarkedNumber_NLAttr) && coreference_resolution.NIL != kb_accessors.kb_individual_p(reference_semantics)) {
            number = coreference_resolution.$const157$Singular_NLAttr;
        }
        if (number.eql(coreference_resolution.$const157$Singular_NLAttr) && coreference_resolution.NIL != term.el_fort_p(reference_semantics) && (coreference_resolution.NIL != isa.isa_in_any_mtP(reference_semantics, coreference_resolution.$const158$Group) || coreference_resolution.NIL != genls.genl_in_any_mtP(reference_semantics, coreference_resolution.$const158$Group))) {
            number = coreference_resolution.$const156$UnmarkedNumber_NLAttr;
        }
        return number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 37563L)
    public static SubLObject reference_cyclifier_number(final SubLObject reference) {
        return cr_parse_tree_number_attribute(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 37671L)
    public static SubLObject cr_parse_tree_number_attribute(final SubLObject tree) {
        final SubLObject parse_tree_number = methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym159$GET_NUMBER);
        return parse_tree_number_to_nl_number_attribute(parse_tree_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 37852L)
    public static SubLObject parse_tree_number_to_nl_number_attribute(final SubLObject parse_tree_number) {
        if (coreference_resolution.NIL == list_utilities.singletonP(parse_tree_number)) {
            return coreference_resolution.$const156$UnmarkedNumber_NLAttr;
        }
        final SubLObject pcase_var;
        final SubLObject number_keyword = pcase_var = parse_tree_number.first();
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw160$SINGULAR)) {
            return coreference_resolution.$const157$Singular_NLAttr;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw161$PLURAL)) {
            return coreference_resolution.$const162$Plural_NLAttr;
        }
        Errors.warn((SubLObject)coreference_resolution.$str163$Don_t_know_about_the_number__S, number_keyword);
        return coreference_resolution.$const156$UnmarkedNumber_NLAttr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 38288L)
    public static SubLObject reference_gender(final SubLObject reference, final SubLObject coref_discourse) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_psp_gender(reference, coref_discourse) : reference_cyclifier_gender(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 38494L)
    public static SubLObject reference_psp_gender(final SubLObject reference, final SubLObject coref_discourse) {
        return parsing_utilities.nl_gender_attr_for_cycl(reference_cycl(reference, coref_discourse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 38638L)
    public static SubLObject reference_cyclifier_gender(final SubLObject reference) {
        return cr_parse_tree_gender_attribute(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 38746L)
    public static SubLObject cr_parse_tree_gender_attribute(final SubLObject tree) {
        final SubLObject parse_tree_gender = methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym164$GET_GENDER);
        return parse_tree_gender_to_nl_gender_attribute(parse_tree_gender);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 38927L)
    public static SubLObject parse_tree_gender_to_nl_gender_attribute(final SubLObject parse_tree_gender) {
        if (coreference_resolution.NIL == list_utilities.singletonP(parse_tree_gender)) {
            return coreference_resolution.$const143$Ungendered_NLAttr;
        }
        final SubLObject pcase_var;
        final SubLObject gender_keyword = pcase_var = parse_tree_gender.first();
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw165$MASCULINE)) {
            return coreference_resolution.$const145$Masculine_NLAttr;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw166$FEMININE)) {
            return coreference_resolution.$const147$Feminine_NLAttr;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw167$NEUTER)) {
            return coreference_resolution.$const144$Neuter_NLAttr;
        }
        Errors.warn((SubLObject)coreference_resolution.$str168$Don_t_know_about_the_gender__S, gender_keyword);
        return coreference_resolution.$const143$Ungendered_NLAttr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 39402L)
    public static SubLObject reference_referent(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject reference_info = reference_note(reference, coref_discourse);
        final SubLObject referent = reference_info_referent(reference_info);
        if (coreference_resolution.NIL != referent) {
            return referent;
        }
        final SubLObject best_antecedent = reference_info_best_antecedent(reference_info);
        if (coreference_resolution.NIL != best_antecedent) {
            return reference_referent(best_antecedent, coref_discourse);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 39804L)
    public static SubLObject new_reference_info(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycls = (SubLObject)((coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? cr_get_cycls_for_reference(reference) : coreference_resolution.NIL);
        return make_reference_info((SubLObject)ConsesLow.list(new SubLObject[] { coreference_resolution.$kw134$TREE, reference, coreference_resolution.$kw135$CYCLS, cycls, coreference_resolution.$kw80$POSSIBLE_ANTECEDENT_, coreference_resolution.$kw94$DONT_KNOW_YET, coreference_resolution.$kw79$POSSIBLE_ANAPHOR_, coreference_resolution.$kw94$DONT_KNOW_YET, coreference_resolution.$kw83$POSSIBLE_ANTECEDENTS, coreference_resolution.$kw94$DONT_KNOW_YET, coreference_resolution.$kw84$LIKELY_ANTECEDENTS, coreference_resolution.$kw94$DONT_KNOW_YET, coreference_resolution.$kw85$BEST_ANTECEDENT, coreference_resolution.$kw94$DONT_KNOW_YET, coreference_resolution.$kw136$REFERENT, coreference_resolution.$kw94$DONT_KNOW_YET }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_referent_struct(v_object, stream, (SubLObject)coreference_resolution.ZERO_INTEGER);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $referent_struct_native.class) ? coreference_resolution.T : coreference_resolution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_references(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_equals(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_types(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_facts(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_gender(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject referent_struct_number(final SubLObject v_object) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_references(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_equals(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_types(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_facts(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_gender(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject _csetf_referent_struct_number(final SubLObject v_object, final SubLObject value) {
        assert coreference_resolution.NIL != referent_struct_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject make_referent_struct(SubLObject arglist) {
        if (arglist == coreference_resolution.UNPROVIDED) {
            arglist = (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject v_new = (SubLObject)new $referent_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)coreference_resolution.NIL, next = arglist; coreference_resolution.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)coreference_resolution.$kw189$REFERENCES)) {
                _csetf_referent_struct_references(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw190$EQUALS)) {
                _csetf_referent_struct_equals(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw191$TYPES)) {
                _csetf_referent_struct_types(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw192$FACTS)) {
                _csetf_referent_struct_facts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw193$GENDER)) {
                _csetf_referent_struct_gender(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw194$NUMBER)) {
                _csetf_referent_struct_number(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)coreference_resolution.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject visit_defstruct_referent_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw40$BEGIN, (SubLObject)coreference_resolution.$sym195$MAKE_REFERENT_STRUCT, (SubLObject)coreference_resolution.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw189$REFERENCES, referent_struct_references(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw190$EQUALS, referent_struct_equals(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw191$TYPES, referent_struct_types(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw192$FACTS, referent_struct_facts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw193$GENDER, referent_struct_gender(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw42$SLOT, (SubLObject)coreference_resolution.$kw194$NUMBER, referent_struct_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)coreference_resolution.$kw43$END, (SubLObject)coreference_resolution.$sym195$MAKE_REFERENT_STRUCT, (SubLObject)coreference_resolution.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40294L)
    public static SubLObject visit_defstruct_object_referent_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_referent_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 40795L)
    public static SubLObject print_referent_struct(final SubLObject referent_struct, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (coreference_resolution.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(referent_struct, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, referent_struct, (SubLObject)coreference_resolution.T, (SubLObject)coreference_resolution.T);
            if (coreference_resolution.NIL != referent_struct_equals(referent_struct)) {
                PrintLow.format(stream, (SubLObject)coreference_resolution.$str197$Equals___S__, referent_struct_equals(referent_struct));
            }
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str198$Types___S__, referent_struct_types(referent_struct));
            if (coreference_resolution.NIL != referent_struct_facts(referent_struct)) {
                PrintLow.format(stream, (SubLObject)coreference_resolution.$str199$Facts___S__, referent_struct_facts(referent_struct));
            }
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str200$Gender___S__, referent_struct_gender(referent_struct));
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str201$Number___S__, referent_struct_number(referent_struct));
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str202$References___);
            SubLObject cdolist_list_var = referent_struct_references(referent_struct);
            SubLObject reference = (SubLObject)coreference_resolution.NIL;
            reference = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)coreference_resolution.$str203$_S_, methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym140$GET_STRING));
                cdolist_list_var = cdolist_list_var.rest();
                reference = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)coreference_resolution.$str204$_);
            print_macros.print_unreadable_object_postamble(stream, referent_struct, (SubLObject)coreference_resolution.NIL, (SubLObject)coreference_resolution.NIL);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 41637L)
    public static SubLObject new_referent_struct_for_first_mention(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject referent = make_referent_struct((SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw193$GENDER, coreference_resolution.$const143$Ungendered_NLAttr, (SubLObject)coreference_resolution.$kw194$NUMBER, coreference_resolution.$const156$UnmarkedNumber_NLAttr));
        add_reference_to_referent(coref_discourse, reference, referent);
        return referent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 41931L)
    public static SubLObject add_reference_to_referent(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        _csetf_referent_struct_references(referent, (SubLObject)ConsesLow.cons(reference, referent_struct_references(referent)));
        final SubLObject gender = reference_gender(reference, coref_discourse);
        final SubLObject number = reference_number(reference, coref_discourse);
        final SubLObject semantics = reference_semantics(reference, coref_discourse);
        _csetf_referent_struct_gender(referent, cr_stronger_gender(gender, referent_struct_gender(referent)));
        _csetf_referent_struct_number(referent, cr_stronger_number(number, referent_struct_number(referent)));
        add_semantics_to_referent(coref_discourse, semantics, referent);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 42548L)
    public static SubLObject add_semantics_to_referent(final SubLObject coref_discourse, final SubLObject semantics, final SubLObject referent) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? add_psp_semantics_to_referent(semantics, referent) : add_cyclifier_semantics_to_referent(semantics, referent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 42792L)
    public static SubLObject add_psp_semantics_to_referent(final SubLObject semantics, final SubLObject referent) {
        if (coreference_resolution.NIL != semantics) {
            if (coreference_resolution.NIL != kb_accessors.kb_individual_p(semantics)) {
                _csetf_referent_struct_equals(referent, semantics);
            }
            else if (coreference_resolution.NIL == conses_high.member(semantics, referent_struct_types(referent), Symbols.symbol_function((SubLObject)coreference_resolution.EQUAL), Symbols.symbol_function((SubLObject)coreference_resolution.IDENTITY))) {
                _csetf_referent_struct_types(referent, (SubLObject)ConsesLow.cons(semantics, referent_struct_types(referent)));
            }
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 43178L)
    public static SubLObject add_cyclifier_semantics_to_referent(final SubLObject semantics, final SubLObject referent) {
        _csetf_referent_struct_facts(referent, ConsesLow.append(referent_struct_facts(referent), semantics));
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 43449L)
    public static SubLObject cr_split_conjunctions(final SubLObject sentence) {
        SubLObject subsentences = (SubLObject)ConsesLow.list(sentence);
        SubLObject any_conjunctionP = (SubLObject)coreference_resolution.T;
        while (coreference_resolution.NIL != any_conjunctionP) {
            any_conjunctionP = (SubLObject)coreference_resolution.NIL;
            SubLObject new_subsentences = (SubLObject)coreference_resolution.NIL;
            SubLObject cdolist_list_var = subsentences;
            SubLObject subsentence = (SubLObject)coreference_resolution.NIL;
            subsentence = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                if (coreference_resolution.NIL != el_utilities.el_conjunction_p(subsentence)) {
                    any_conjunctionP = (SubLObject)coreference_resolution.T;
                    new_subsentences = ConsesLow.append(Sequences.reverse(cycl_utilities.formula_args(subsentence, (SubLObject)coreference_resolution.UNPROVIDED)), new_subsentences);
                }
                else {
                    new_subsentences = (SubLObject)ConsesLow.cons(subsentence, new_subsentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subsentence = cdolist_list_var.first();
            }
            subsentences = Sequences.nreverse(new_subsentences);
        }
        return subsentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 43999L)
    public static SubLObject cr_stronger_gender(final SubLObject gender1, final SubLObject gender2) {
        if (gender1.eql(coreference_resolution.$const143$Ungendered_NLAttr)) {
            return gender2;
        }
        if (gender2.eql(coreference_resolution.$const143$Ungendered_NLAttr)) {
            return gender1;
        }
        return gender1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 44466L)
    public static SubLObject cr_stronger_number(final SubLObject number1, final SubLObject number2) {
        if (number1.eql(coreference_resolution.$const156$UnmarkedNumber_NLAttr)) {
            return number2;
        }
        if (number2.eql(coreference_resolution.$const156$UnmarkedNumber_NLAttr)) {
            return number1;
        }
        if (number1.eql(coreference_resolution.$const205$Generic_NLAttr)) {
            return number2;
        }
        if (number2.eql(coreference_resolution.$const205$Generic_NLAttr)) {
            return number1;
        }
        return number1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 45047L)
    public static SubLObject reference_possible_anaphorP_calculate_code(final SubLObject coref_discourse, final SubLObject reference) {
        if (coreference_resolution.NIL == reference_definite_expressionP_code(coref_discourse, reference)) {
            return (SubLObject)coreference_resolution.$kw206$NON_ANAPHOR;
        }
        if (coreference_resolution.NIL != reference_is_first_or_second_person_pronounP(coref_discourse, reference)) {
            return (SubLObject)coreference_resolution.$kw207$ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE;
        }
        if (coreference_resolution.NIL != parse_tree.np_tree_p(reference) && (coreference_resolution.NIL != np_reference_has_possessive_determinerP(reference) || coreference_resolution.NIL != np_reference_has_of_prepositional_phraseP(reference) || coreference_resolution.NIL != np_reference_has_restrictive_clauseP(reference))) {
            return (SubLObject)coreference_resolution.$kw208$LIKELY_ACCOMODATABLE_ANAPHOR;
        }
        return (SubLObject)coreference_resolution.$kw81$STANDARD_ANAPHOR;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 45665L)
    public static SubLObject np_reference_has_restrictive_clauseP(final SubLObject reference) {
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)coreference_resolution.$sym209$RESTRICTIVE_CLAUSE_TREE_P), parse_tree.get_phrase_tree_daughters(reference), (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 45862L)
    public static SubLObject restrictive_clause_tree_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != parse_tree.sbar_tree_p(tree) && coreference_resolution.$str210$that.equalp(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)coreference_resolution.$sym211$GET_DAUGHTER, (SubLObject)coreference_resolution.ZERO_INTEGER), (SubLObject)coreference_resolution.$sym140$GET_STRING)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 46063L)
    public static SubLObject np_reference_has_of_prepositional_phraseP(final SubLObject reference) {
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)coreference_resolution.$sym212$OF_PP_TREE_P), parse_tree.get_phrase_tree_daughters(reference), (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 46252L)
    public static SubLObject of_pp_tree_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != parse_tree.pp_tree_p(tree) && coreference_resolution.$str213$of.equalp(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym214$GET_HEAD_DAUGHTER), (SubLObject)coreference_resolution.$sym140$GET_STRING)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 46447L)
    public static SubLObject np_reference_has_possessive_determinerP(final SubLObject reference) {
        assert coreference_resolution.NIL != parse_tree.np_tree_p(reference) : reference;
        final SubLObject head_phrase = phrasal_reference_head_phrase(reference);
        final SubLObject left_daughter = methods.funcall_instance_method_with_1_args(head_phrase, (SubLObject)coreference_resolution.$sym211$GET_DAUGHTER, (SubLObject)coreference_resolution.ZERO_INTEGER);
        return cr_possessive_determiner_p(left_daughter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 46724L)
    public static SubLObject cr_possessive_determiner_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.$kw215$PRP_ == methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY) || (coreference_resolution.NIL != parse_tree.phrase_tree_p(tree) && coreference_resolution.NIL != methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym216$POSSESSIVE_P)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 46888L)
    public static SubLObject cr_demonstrative_determiner_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.$kw217$DT == methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY) && coreference_resolution.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)coreference_resolution.$sym218$KB_DEMONSTRATIVE_NL_ATTR_P), cr_ps_get_cycls_for_phrase_with_timeout(methods.funcall_instance_method_with_0_args(tree, (SubLObject)coreference_resolution.$sym140$GET_STRING), coreference_resolution.$const219$Determiner, (SubLObject)coreference_resolution.SEVEN_INTEGER, (SubLObject)coreference_resolution.UNPROVIDED), (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 47117L)
    public static SubLObject kb_demonstrative_nl_attr_p(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, coreference_resolution.$const220$Demonstrative_NLAttrType);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 47226L)
    public static SubLObject reference_gendered_pronounP_code(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_gendered_pronounP_psp(reference, coref_discourse) : reference_gendered_pronounP_cyclifier(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 47470L)
    public static SubLObject reference_gendered_pronounP_psp(final SubLObject reference, final SubLObject coref_discourse) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        if (coreference_resolution.NIL != cycl && coreference_resolution.NIL != parsing_utilities.cycl_pronoun_p(cycl)) {
            final SubLObject gender = parsing_utilities.nl_gender_attr_for_cycl(cycl);
            return (SubLObject)SubLObjectFactory.makeBoolean(gender.eql(coreference_resolution.$const145$Masculine_NLAttr) || gender.eql(coreference_resolution.$const147$Feminine_NLAttr));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 47808L)
    public static SubLObject reference_gendered_pronounP_cyclifier(final SubLObject reference) {
        if (coreference_resolution.NIL != reference_is_pronounP_cyclifier(reference)) {
            final SubLObject gender = reference_cyclifier_gender(reference);
            return (SubLObject)SubLObjectFactory.makeBoolean(gender.eql(coreference_resolution.$const145$Masculine_NLAttr) || gender.eql(coreference_resolution.$const147$Feminine_NLAttr));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 48089L)
    public static SubLObject reference_definite_expressionP_code(final SubLObject coref_discourse, final SubLObject reference) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != reference_is_pronounP(coref_discourse, reference) || coreference_resolution.NIL != reference_is_definite_descriptionP(coref_discourse, reference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 48303L)
    public static SubLObject reference_is_definite_descriptionP(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_is_definite_descriptionP_psp(coref_discourse, reference) : reference_is_definite_descriptionP_cyclifier(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 48563L)
    public static SubLObject reference_is_definite_descriptionP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        final SubLObject definiteness = (SubLObject)((coreference_resolution.NIL != cycl) ? parsing_utilities.nl_definiteness_attr_for_cycl(cycl) : coreference_resolution.NIL);
        return Equality.eq(definiteness, coreference_resolution.$const221$Definite_NLAttr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 48826L)
    public static SubLObject reference_is_definite_descriptionP_cyclifier(final SubLObject reference) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym222$DEFINITE_DESCRIPTION_P) && coreference_resolution.NIL == cyclifier_interface.name_word_p(methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym223$GET_HEAD)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 49009L)
    public static SubLObject reference_is_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_is_pronounP_psp(coref_discourse, reference) : reference_is_pronounP_cyclifier(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 49230L)
    public static SubLObject reference_is_pronounP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        return parsing_utilities.cycl_pronoun_p(reference_cycl(reference, coref_discourse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 49370L)
    public static SubLObject reference_is_pronounP_cyclifier(final SubLObject reference) {
        return parse_tree.pronoun_tree_p(methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym223$GET_HEAD));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 49483L)
    public static SubLObject reference_is_first_or_second_person_pronounP(final SubLObject coref_discourse, final SubLObject reference) {
        return (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_is_first_or_second_person_pronounP_psp(coref_discourse, reference) : reference_is_first_or_second_person_pronounP_cyclifier(reference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 49773L)
    public static SubLObject reference_is_first_or_second_person_pronounP_psp(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLObject cycl = reference_cycl(reference, coref_discourse);
        if (coreference_resolution.NIL != parsing_utilities.cycl_pronoun_p(cycl)) {
            final SubLObject person = parsing_utilities.nl_person_attr_for_cycl_pronoun(cycl);
            return (SubLObject)SubLObjectFactory.makeBoolean(person.eql(coreference_resolution.$const224$FirstPerson_NLAttr) || person.eql(coreference_resolution.$const225$SecondPerson_NLAttr));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 50122L)
    public static SubLObject reference_is_first_or_second_person_pronounP_cyclifier(final SubLObject reference) {
        if (coreference_resolution.NIL != reference_is_pronounP_cyclifier(reference)) {
            final SubLObject person = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym226$GET_PERSON);
            return (SubLObject)SubLObjectFactory.makeBoolean(person.eql((SubLObject)coreference_resolution.ONE_INTEGER) || person.eql((SubLObject)coreference_resolution.TWO_INTEGER));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 50376L)
    public static SubLObject reference_possible_antecedentP_calculate_code(final SubLObject coref_discourse, final SubLObject reference) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL == reference_is_first_or_second_person_pronounP(coref_discourse, reference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 50644L)
    public static SubLObject reference_possible_antecedents_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        return filter_antecedent_candidates(coref_discourse, reference, candidates, Symbols.symbol_function((SubLObject)coreference_resolution.$sym227$REFERENCE_POSSIBLY_REFERS_TO__CODE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 50860L)
    public static SubLObject filter_antecedent_candidates(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates, final SubLObject referent_filter_function) {
        SubLObject result = (SubLObject)coreference_resolution.NIL;
        SubLObject referents_seen = (SubLObject)coreference_resolution.NIL;
        SubLObject max_possible_antecedents;
        SubLObject rest;
        SubLObject candidate;
        SubLObject candidate_referent;
        for (max_possible_antecedents = max_possible_antecedents_for_reference(coref_discourse, reference), rest = (SubLObject)coreference_resolution.NIL, rest = candidates; coreference_resolution.NIL == list_utilities.lengthGE(result, max_possible_antecedents, (SubLObject)coreference_resolution.UNPROVIDED) && coreference_resolution.NIL != rest; rest = rest.rest()) {
            candidate = rest.first();
            candidate_referent = reference_referent(candidate, coref_discourse);
            if (coreference_resolution.NIL != candidate_referent && coreference_resolution.NIL == subl_promotions.memberP(candidate_referent, referents_seen, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
                referents_seen = (SubLObject)ConsesLow.cons(candidate_referent, referents_seen);
                if (coreference_resolution.NIL != Functions.funcall(referent_filter_function, coref_discourse, reference, candidate_referent)) {
                    result = (SubLObject)ConsesLow.cons(candidate, result);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 51573L)
    public static SubLObject reference_possibly_refers_toP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != reference_syntactically_possible_referent_forP_code(coref_discourse, reference, candidate_referent) && coreference_resolution.NIL != reference_semantically_possible_referent_forP_code(coref_discourse, reference, candidate_referent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 51891L)
    public static SubLObject reference_syntactically_possible_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        if (coreference_resolution.NIL != reference_and_referent_disagree_in_numberP(coref_discourse, reference, candidate_referent)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        if (coreference_resolution.NIL != reference_and_referent_disagree_in_genderP(coref_discourse, reference, candidate_referent)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        return (SubLObject)coreference_resolution.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 52362L)
    public static SubLObject reference_and_referent_disagree_in_numberP(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        final SubLObject reference_number = reference_number(reference, coref_discourse);
        final SubLObject referent_number = referent_struct_number(referent);
        return parsing_utilities.nl_number_attributes_disagreeP(reference_number, referent_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 52665L)
    public static SubLObject reference_and_referent_disagree_in_genderP(final SubLObject coref_discourse, final SubLObject reference, final SubLObject referent) {
        final SubLObject reference_gender = reference_gender(reference, coref_discourse);
        final SubLObject referent_gender = referent_struct_gender(referent);
        return parsing_utilities.nl_gender_attributes_disagreeP(reference_gender, referent_gender);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 52968L)
    public static SubLObject reference_semantically_possible_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        if (coreference_resolution.NIL != crd_use_pspP(coref_discourse)) {
            final SubLObject referent_types = referent_struct_types(candidate_referent);
            final SubLObject referent_term = referent_struct_equals(candidate_referent);
            return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != reference_semantics_compatible_with_referent_typesP(reference_semantics, referent_types) && coreference_resolution.NIL != reference_semantics_compatible_with_referent_termP(reference_semantics, referent_term));
        }
        final SubLObject referent_facts = referent_struct_facts(candidate_referent);
        return reference_semantics_compatible_with_referent_factsP(reference_semantics, referent_facts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 53825L)
    public static SubLObject reference_semantics_compatible_with_referent_typesP(final SubLObject reference_semantics, final SubLObject referent_types) {
        if (coreference_resolution.NIL == reference_semantics || reference_semantics.equal(cr_non_person())) {
            return (SubLObject)coreference_resolution.T;
        }
        if (reference_semantics == coreference_resolution.$kw142$UNKNOWN) {
            return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != list_utilities.empty_list_p(referent_types) || (coreference_resolution.NIL != list_utilities.singletonP(referent_types) && cr_non_person().equal(referent_types.first())));
        }
        if (coreference_resolution.NIL != subl_promotions.memberP((SubLObject)coreference_resolution.$kw142$UNKNOWN, referent_types, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        SubLObject incompatibleP;
        SubLObject rest;
        SubLObject type;
        for (incompatibleP = (SubLObject)coreference_resolution.NIL, rest = (SubLObject)coreference_resolution.NIL, rest = referent_types; coreference_resolution.NIL == incompatibleP && coreference_resolution.NIL != rest; rest = rest.rest()) {
            type = rest.first();
            if (coreference_resolution.NIL == reference_semantics_compatible_with_referent_typeP(reference_semantics, type)) {
                incompatibleP = (SubLObject)coreference_resolution.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL == incompatibleP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 54530L)
    public static SubLObject reference_semantics_compatible_with_referent_typeP(final SubLObject reference_semantics, final SubLObject referent_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject incompatibleP = (SubLObject)coreference_resolution.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)coreference_resolution.$sym228$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(coreference_resolution.$const229$EverythingPSC, thread);
            incompatibleP = (SubLObject)((coreference_resolution.NIL != fort_types_interface.isa_collectionP(reference_semantics, (SubLObject)coreference_resolution.UNPROVIDED)) ? SubLObjectFactory.makeBoolean((coreference_resolution.NIL != cr_few_if_anyP(referent_type, reference_semantics) || coreference_resolution.NIL != cr_disjoint_withP(referent_type, reference_semantics)) && coreference_resolution.NIL != isa.not_isaP(referent_type, reference_semantics, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED)) : cr_not_isaP(reference_semantics, referent_type));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL == incompatibleP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 55536L)
    public static SubLObject reference_semantics_compatible_with_referent_termP(final SubLObject reference_semantics, final SubLObject referent_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (coreference_resolution.NIL == referent_term) {
            return (SubLObject)coreference_resolution.T;
        }
        if (reference_semantics == coreference_resolution.$kw142$UNKNOWN) {
            return (SubLObject)coreference_resolution.NIL;
        }
        if (coreference_resolution.NIL == reference_semantics) {
            return (SubLObject)coreference_resolution.T;
        }
        SubLObject incompatibleP = (SubLObject)coreference_resolution.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)coreference_resolution.$sym228$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(coreference_resolution.$const229$EverythingPSC, thread);
            incompatibleP = ((coreference_resolution.NIL != fort_types_interface.isa_collectionP(reference_semantics, (SubLObject)coreference_resolution.UNPROVIDED)) ? cr_not_isaP(referent_term, reference_semantics) : disjoint_with.instances_of_disjoint_collectionsP(reference_semantics, referent_term, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL == incompatibleP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 56168L)
    public static SubLObject cr_not_isaP(final SubLObject v_term, final SubLObject collection) {
        if (collection.equal(cr_non_person())) {
            return isa.isaP(v_term, coreference_resolution.$const155$Person, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        return isa.not_isaP(v_term, collection, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 56483L)
    public static SubLObject cr_few_if_anyP(final SubLObject c1, final SubLObject c2) {
        if (c1.equal(cr_non_person())) {
            return genls.genlP(c2, coreference_resolution.$const155$Person, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        if (c2.equal(cr_non_person())) {
            return genls.genlP(c1, coreference_resolution.$const155$Person, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        return few_if_anyP(c1, c2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 56780L)
    public static SubLObject few_if_anyP(final SubLObject c1, final SubLObject c2) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(el_utilities.make_binary_formula(coreference_resolution.$const230$fewIfAny, c1, c2), coreference_resolution.$const231$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw232$MAX_TIME, (SubLObject)coreference_resolution.FOUR_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 56925L)
    public static SubLObject cr_disjoint_withP(final SubLObject c1, final SubLObject c2) {
        if (c1.equal(cr_non_person())) {
            return genls.genlP(c2, coreference_resolution.$const155$Person, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        if (c2.equal(cr_non_person())) {
            return genls.genlP(c1, coreference_resolution.$const155$Person, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        return disjoint_with.disjoint_withP(c1, c2, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 57294L)
    public static SubLObject reference_semantics_compatible_with_referent_factsP(final SubLObject reference_semantics, final SubLObject referent_facts) {
        if (coreference_resolution.NIL == reference_semantics || coreference_resolution.NIL == referent_facts) {
            return (SubLObject)coreference_resolution.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL == inference_kernel.new_cyc_query(el_utilities.make_unary_formula(coreference_resolution.$const233$not, el_utilities.make_binary_formula(coreference_resolution.$const234$thereExists, (SubLObject)coreference_resolution.$sym151$_REFERENT, el_utilities.make_el_formula(coreference_resolution.$const235$and, ConsesLow.append(reference_semantics, referent_facts), (SubLObject)coreference_resolution.UNPROVIDED))), coreference_resolution.$const236$CurrentWorldDataCollectorMt_NonHo, (SubLObject)coreference_resolution.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 57759L)
    public static SubLObject reference_likely_antecedents_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        return filter_antecedent_candidates(coref_discourse, reference, candidates, Symbols.symbol_function((SubLObject)coreference_resolution.$sym237$REFERENCE_LIKELY_REFERS_TO__CODE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 57971L)
    public static SubLObject reference_likely_refers_toP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        return reference_semantically_likely_referent_forP_code(coref_discourse, reference, candidate_referent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 58319L)
    public static SubLObject reference_semantically_likely_referent_forP_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidate_referent) {
        if (coreference_resolution.NIL == crd_use_pspP(coref_discourse)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        if (coreference_resolution.NIL != isa.isa_in_any_mtP(reference_semantics, coreference_resolution.$const238$Collection)) {
            final SubLObject referent_types = referent_struct_types(candidate_referent);
            final SubLObject referent_term = referent_struct_equals(candidate_referent);
            return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != reference_semantics_overlap_with_referent_typesP(reference_semantics, referent_types) || coreference_resolution.NIL != reference_semantics_overlap_with_referent_termP(reference_semantics, referent_term));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 58998L)
    public static SubLObject reference_semantics_overlap_with_referent_typesP(final SubLObject reference_semantics, final SubLObject referent_types) {
        SubLObject cdolist_list_var = referent_types;
        SubLObject type = (SubLObject)coreference_resolution.NIL;
        type = cdolist_list_var.first();
        while (coreference_resolution.NIL != cdolist_list_var) {
            if (coreference_resolution.NIL != reference_semantics_overlap_with_referent_typeP(reference_semantics, type)) {
                return (SubLObject)coreference_resolution.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 59396L)
    public static SubLObject reference_semantics_overlap_with_referent_typeP(final SubLObject reference_semantics, final SubLObject referent_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != isa.isa_in_any_mtP(referent_type, coreference_resolution.$const238$Collection) && (coreference_resolution.NIL != cr_genl_in_any_mtP(referent_type, reference_semantics) || coreference_resolution.NIL != cr_isa_in_any_mtP(referent_type, reference_semantics)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 59889L)
    public static SubLObject reference_semantics_overlap_with_referent_termP(final SubLObject reference_semantics, final SubLObject referent_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(coreference_resolution.NIL != kb_accessors.kb_individual_p(referent_term) && coreference_resolution.NIL != isa.isa_in_any_mtP(referent_term, reference_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 60095L)
    public static SubLObject reference_best_antecedent_calculate_code(final SubLObject reference, final SubLObject likely_antecedents, final SubLObject possible_antecedents) {
        return ((coreference_resolution.NIL != likely_antecedents) ? likely_antecedents : possible_antecedents).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 60342L)
    public static SubLObject reference_functional_dependency_calculate_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject candidates) {
        final SubLObject reference_semantics = reference_semantics(reference, coref_discourse);
        SubLObject dependency = (SubLObject)coreference_resolution.NIL;
        if (coreference_resolution.NIL != cycl_grammar.cycl_denotational_term_p(reference_semantics)) {
            SubLObject referents_seen = (SubLObject)coreference_resolution.NIL;
            SubLObject rest;
            SubLObject candidate;
            SubLObject candidate_referent;
            SubLObject relation;
            for (rest = (SubLObject)coreference_resolution.NIL, rest = candidates; coreference_resolution.NIL == dependency && coreference_resolution.NIL != rest; rest = rest.rest()) {
                candidate = rest.first();
                candidate_referent = reference_referent(candidate, coref_discourse);
                if (coreference_resolution.NIL != candidate_referent && coreference_resolution.NIL == subl_promotions.memberP(candidate_referent, referents_seen, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
                    referents_seen = (SubLObject)ConsesLow.cons(candidate_referent, referents_seen);
                    relation = reference_find_functional_dependency_with(reference_semantics, candidate_referent);
                    if (coreference_resolution.NIL != relation) {
                        dependency = (SubLObject)ConsesLow.list(relation, candidate);
                    }
                }
            }
        }
        return dependency;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 61234L)
    public static SubLObject reference_find_functional_dependency_with(final SubLObject anaphor_semantics, final SubLObject preceding_referent) {
        final SubLObject referent_types = referent_struct_types(preceding_referent);
        final SubLObject referent_term = referent_struct_equals(preceding_referent);
        SubLObject relation;
        SubLObject rest;
        SubLObject type;
        SubLObject relations;
        for (relation = (SubLObject)coreference_resolution.NIL, rest = (SubLObject)coreference_resolution.NIL, rest = referent_types; coreference_resolution.NIL == relation && coreference_resolution.NIL != rest; rest = rest.rest()) {
            type = rest.first();
            if (type != coreference_resolution.$kw142$UNKNOWN) {
                relations = ask_utilities.query_variable((SubLObject)coreference_resolution.$sym239$_PRED, el_utilities.make_binary_formula(coreference_resolution.$const240$or, el_utilities.make_ternary_formula(coreference_resolution.$const241$relationAllExists, (SubLObject)coreference_resolution.$sym239$_PRED, type, anaphor_semantics), el_utilities.make_ternary_formula(coreference_resolution.$const242$relationExistsAll, (SubLObject)coreference_resolution.$sym239$_PRED, anaphor_semantics, type)), coreference_resolution.$const236$CurrentWorldDataCollectorMt_NonHo, (SubLObject)coreference_resolution.$list243);
                if (coreference_resolution.NIL != relations) {
                    relation = relations.first();
                }
            }
        }
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62136L)
    public static SubLObject reference_info_possible_anaphorP_get(final SubLObject reference_info) {
        return reference_info_possible_anaphorP(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62266L)
    public static SubLObject reference_info_possible_antecedentP_get(final SubLObject reference_info) {
        return reference_info_possible_antecedentP(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62402L)
    public static SubLObject reference_info_possible_antecedents_get(final SubLObject reference_info) {
        return reference_info_possible_antecedents(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62538L)
    public static SubLObject reference_info_likely_antecedents_get(final SubLObject reference_info) {
        return reference_info_likely_antecedents(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62670L)
    public static SubLObject reference_info_best_antecedent_get(final SubLObject reference_info) {
        return reference_info_best_antecedent(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62796L)
    public static SubLObject reference_info_functional_dependency_get(final SubLObject reference_info) {
        return reference_info_functional_dependency(reference_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 62934L)
    public static SubLObject reference_info_possible_anaphorP_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_anaphorP(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63090L)
    public static SubLObject reference_info_possible_antecedentP_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_antecedentP(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63252L)
    public static SubLObject reference_info_possible_antecedents_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_possible_antecedents(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63414L)
    public static SubLObject reference_info_likely_antecedents_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_likely_antecedents(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63572L)
    public static SubLObject reference_info_best_antecedent_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_best_antecedent(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63724L)
    public static SubLObject reference_info_functional_dependency_set(final SubLObject reference_info, final SubLObject value) {
        _csetf_reference_info_functional_dependency(reference_info, value);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 63888L)
    public static SubLObject reference_do_implementation_specific_processing_code(final SubLObject coref_discourse, final SubLObject reference, final SubLObject reason) {
        final SubLObject reference_info = reference_note(reference, coref_discourse);
        if (reason.eql((SubLObject)coreference_resolution.$kw87$ANAPHOR_WITH_POSSIBLE_ANTECEDENTS)) {
            _csetf_reference_info_referent(reference_info, (SubLObject)coreference_resolution.NIL);
            add_reference_to_referent(coref_discourse, reference, reference_referent(reference, coref_discourse));
        }
        else if (reason.eql((SubLObject)coreference_resolution.$kw90$NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT)) {
            _csetf_reference_info_referent(reference_info, (SubLObject)coreference_resolution.NIL);
        }
        else if (reason.eql((SubLObject)coreference_resolution.$kw88$ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS) || reason.eql((SubLObject)coreference_resolution.$kw89$NON_ANAPHOR_POSSIBLE_ANTECEDENT)) {
            _csetf_reference_info_referent(reference_info, new_referent_struct_for_first_mention(coref_discourse, reference));
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 64613L)
    public static SubLObject cr_genl_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(el_utilities.make_binary_formula(coreference_resolution.$const244$genls, spec, genl), coreference_resolution.$const231$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw232$MAX_TIME, (SubLObject)coreference_resolution.FOUR_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 64792L)
    public static SubLObject cr_isa_in_any_mtP(final SubLObject v_term, final SubLObject collection) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(el_utilities.make_binary_formula(coreference_resolution.$const245$isa, v_term, collection), coreference_resolution.$const231$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw232$MAX_TIME, (SubLObject)coreference_resolution.FOUR_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 64958L)
    public static SubLObject cr_get_cycls_for_reference(final SubLObject reference) {
        if (coreference_resolution.NIL != parse_tree.np_tree_p(reference)) {
            return cr_get_cycls_for_np_reference(reference);
        }
        if (coreference_resolution.$kw215$PRP_ == methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY)) {
            return cr_get_cycls_for_prpX_reference(reference);
        }
        Errors.warn((SubLObject)coreference_resolution.$str246$Don_t_know_what_category_of_refer, reference);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 65292L)
    public static SubLObject cr_get_cycls_for_np_reference(final SubLObject reference) {
        SubLObject result;
        SubLObject partial_reference;
        SubLObject phrase;
        SubLObject category;
        for (result = (SubLObject)coreference_resolution.NIL, partial_reference = (SubLObject)coreference_resolution.NIL, partial_reference = reference; coreference_resolution.NIL == result && coreference_resolution.NIL == word_tree.word_tree_p(partial_reference) && coreference_resolution.NIL != partial_reference; result = cr_ps_get_cycls_for_phrase_with_timeout(phrase, category, (SubLObject)coreference_resolution.$int247$30, coreference_resolution.$const248$CycNounLearnerLexicalMt), partial_reference = methods.funcall_instance_method_with_0_args(partial_reference, (SubLObject)coreference_resolution.$sym214$GET_HEAD_DAUGHTER)) {
            phrase = methods.funcall_instance_method_with_0_args(partial_reference, (SubLObject)coreference_resolution.$sym140$GET_STRING);
            category = cr_pos_category_for_phrase(partial_reference);
        }
        if (coreference_resolution.NIL != list_utilities.empty_list_p(result)) {
            phrase = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym140$GET_STRING);
            final SubLObject possible_name_semantics = cr_possible_name_phrase_semantics(phrase);
            if (coreference_resolution.NIL != possible_name_semantics) {
                result = (SubLObject)ConsesLow.list(possible_name_semantics);
            }
        }
        if (coreference_resolution.NIL != list_utilities.empty_list_p(result)) {
            result = cr_get_cycls_for_parts_of_reference(reference);
        }
        return cr_filter_subl_from_cycls(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 66155L)
    public static SubLObject cr_get_cycls_for_prpX_reference(final SubLObject reference) {
        final SubLObject phrase = methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym140$GET_STRING);
        final SubLObject category = coreference_resolution.$const249$Pronoun;
        return cr_ps_get_cycls_for_phrase_with_timeout(phrase, category, (SubLObject)coreference_resolution.SEVEN_INTEGER, (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 66358L)
    public static SubLObject cr_filter_subl_from_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)coreference_resolution.NIL;
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = (SubLObject)coreference_resolution.NIL;
        cycl = cdolist_list_var.first();
        while (coreference_resolution.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject stripped_cycl = parsing_utilities.strip_nl_tags(cycl, (SubLObject)coreference_resolution.UNPROVIDED);
            final SubLObject nl_tags = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (stripped_cycl.isInteger()) {
                if (coreference_resolution.NIL != cr_plausible_year_integerP(stripped_cycl)) {
                    result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(coreference_resolution.$const250$YearFn, stripped_cycl), result);
                }
            }
            else if (!stripped_cycl.isNumber() && !stripped_cycl.isString()) {
                if (!stripped_cycl.isKeyword()) {
                    result = (SubLObject)ConsesLow.cons(cycl, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 66962L)
    public static SubLObject cr_plausible_year_integerP(final SubLObject integer) {
        assert coreference_resolution.NIL != Types.integerp(integer) : integer;
        return (SubLObject)SubLObjectFactory.makeBoolean(integer.numG((SubLObject)coreference_resolution.$int252$100) && integer.numL((SubLObject)coreference_resolution.$int253$5000));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 67103L)
    public static SubLObject cr_pos_category_for_phrase(final SubLObject reference) {
        final SubLObject pcase_var;
        final SubLObject penn_tag = pcase_var = reference_penn_tag(reference);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw254$NP)) {
            return coreference_resolution.$const255$NounPhrase;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw256$VB) || pcase_var.eql((SubLObject)coreference_resolution.$kw257$VBD) || pcase_var.eql((SubLObject)coreference_resolution.$kw258$VBG) || pcase_var.eql((SubLObject)coreference_resolution.$kw259$VBN) || pcase_var.eql((SubLObject)coreference_resolution.$kw260$VBP) || pcase_var.eql((SubLObject)coreference_resolution.$kw261$VBZ)) {
            return coreference_resolution.$const262$Verb;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw263$NN) || pcase_var.eql((SubLObject)coreference_resolution.$kw264$NNS) || pcase_var.eql((SubLObject)coreference_resolution.$kw265$NNP) || pcase_var.eql((SubLObject)coreference_resolution.$kw266$NNPS)) {
            return coreference_resolution.$const267$Noun;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw268$PRP) || pcase_var.eql((SubLObject)coreference_resolution.$kw215$PRP_)) {
            return coreference_resolution.$const249$Pronoun;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw217$DT) || pcase_var.eql((SubLObject)coreference_resolution.$kw269$PDT)) {
            return coreference_resolution.$const219$Determiner;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw270$EX)) {
            return coreference_resolution.$const271$There_Existential;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw272$QP)) {
            return (SubLObject)coreference_resolution.$kw273$ANY;
        }
        Errors.warn((SubLObject)coreference_resolution.$str274$Don_t_know_the_POS_category_for__, penn_tag);
        return (SubLObject)coreference_resolution.$kw273$ANY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 67647L)
    public static SubLObject reference_penn_tag(final SubLObject reference) {
        return methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 67959L)
    public static SubLObject strip_final_period(final SubLObject string) {
        if (string_utilities.last_char(string).eql((SubLObject)Characters.CHAR_period)) {
            return string_utilities.string_butlast(string);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 68099L)
    public static SubLObject cr_courtesy_title_p(final SubLObject word) {
        return subl_promotions.memberP(strip_final_period(word), coreference_resolution.$cr_courtesy_titles$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.EQUALP), (SubLObject)coreference_resolution.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 68218L)
    public static SubLObject cr_possible_name_phrase_semantics(final SubLObject phrase) {
        final SubLObject first_word = string_utilities.first_word(phrase, (SubLObject)coreference_resolution.UNPROVIDED);
        if (!first_word.equal(phrase) && coreference_resolution.NIL != cr_courtesy_title_p(first_word)) {
            return (SubLObject)ConsesLow.listS(coreference_resolution.$const276$InstanceNamedFn, phrase, (SubLObject)coreference_resolution.$list277);
        }
        if (coreference_resolution.NIL != Characters.upper_case_p(string_utilities.first_char(phrase))) {
            final SubLObject gender = lexicon_utilities.first_name_gender(first_word);
            SubLObject coll = (SubLObject)coreference_resolution.NIL;
            final SubLObject pcase_var = gender;
            if (pcase_var.eql((SubLObject)coreference_resolution.NIL)) {
                coll = (SubLObject)coreference_resolution.NIL;
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw278$MASC)) {
                coll = coreference_resolution.$const146$MaleHuman;
            }
            else if (pcase_var.eql((SubLObject)coreference_resolution.$kw279$FEM)) {
                coll = coreference_resolution.$const148$FemaleHuman;
            }
            else {
                coll = coreference_resolution.$const155$Person;
            }
            if (coreference_resolution.NIL != coll) {
                return (SubLObject)ConsesLow.list(coreference_resolution.$const276$InstanceNamedFn, phrase, coll);
            }
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 68915L)
    public static SubLObject phrasal_reference_head_phrase(final SubLObject reference) {
        SubLObject head_phrase = reference;
        for (SubLObject head_daughter = methods.funcall_instance_method_with_0_args(head_phrase, (SubLObject)coreference_resolution.$sym214$GET_HEAD_DAUGHTER); coreference_resolution.NIL != parse_tree.phrase_tree_p(head_daughter); head_daughter = methods.funcall_instance_method_with_0_args(head_phrase, (SubLObject)coreference_resolution.$sym214$GET_HEAD_DAUGHTER)) {
            head_phrase = head_daughter;
        }
        return head_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 69244L)
    public static SubLObject cr_get_cycls_for_parts_of_reference(final SubLObject reference) {
        if (coreference_resolution.NIL == parse_tree.np_tree_p(reference)) {
            return (SubLObject)coreference_resolution.NIL;
        }
        final SubLObject head_phrase = phrasal_reference_head_phrase(reference);
        final SubLObject definiteness = cr_discern_definiteness_attribute_of_preterminal_np_phrase(head_phrase);
        final SubLObject number = cr_discern_number_attribute_of_preterminal_np_phrase(head_phrase);
        SubLObject head_cycls = cr_get_cycls_for_head_of_np_phrase(head_phrase);
        if (coreference_resolution.NIL == definiteness && coreference_resolution.NIL == number && coreference_resolution.NIL == head_cycls) {
            return (SubLObject)coreference_resolution.NIL;
        }
        SubLObject with_definiteness = (SubLObject)coreference_resolution.NIL;
        SubLObject with_number = (SubLObject)coreference_resolution.NIL;
        if (coreference_resolution.NIL == head_cycls) {
            head_cycls = (SubLObject)ConsesLow.list(coreference_resolution.$const141$Thing);
        }
        if (coreference_resolution.NIL == definiteness) {
            with_definiteness = head_cycls;
        }
        else {
            SubLObject cdolist_list_var = head_cycls;
            SubLObject cycl = (SubLObject)coreference_resolution.NIL;
            cycl = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                with_definiteness = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(coreference_resolution.$const280$NLDefinitenessFn, definiteness, cycl), with_definiteness);
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            }
            with_definiteness = Sequences.nreverse(with_definiteness);
        }
        if (coreference_resolution.NIL == number) {
            with_number = with_definiteness;
        }
        else {
            SubLObject cdolist_list_var = with_definiteness;
            SubLObject cycl = (SubLObject)coreference_resolution.NIL;
            cycl = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                with_number = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(coreference_resolution.$const281$NLNumberFn, number, cycl), with_number);
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            }
            with_number = Sequences.nreverse(with_number);
        }
        return with_number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 70568L)
    public static SubLObject cr_discern_definiteness_attribute_of_preterminal_np_phrase(final SubLObject phrase) {
        final SubLObject left_leaf = methods.funcall_instance_method_with_1_args(phrase, (SubLObject)coreference_resolution.$sym211$GET_DAUGHTER, (SubLObject)coreference_resolution.ZERO_INTEGER);
        if (coreference_resolution.NIL != word_tree.determiner_word_tree_p(left_leaf)) {
            final SubLObject leaf_string = methods.funcall_instance_method_with_0_args(left_leaf, (SubLObject)coreference_resolution.$sym140$GET_STRING);
            final SubLObject leaf_category = cr_pos_category_for_phrase(left_leaf);
            final SubLObject leaf_cycls = cr_ps_get_cycls_for_phrase_with_timeout(leaf_string, leaf_category, (SubLObject)coreference_resolution.TEN_INTEGER, (SubLObject)coreference_resolution.UNPROVIDED);
            return Sequences.find_if(Symbols.symbol_function((SubLObject)coreference_resolution.$sym282$KB_NL_DEFINITENESS_ATTRIBUTE_P), leaf_cycls, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 71090L)
    public static SubLObject cr_discern_number_attribute_of_preterminal_np_phrase(final SubLObject phrase) {
        final SubLObject head_word = methods.funcall_instance_method_with_0_args(phrase, (SubLObject)coreference_resolution.$sym223$GET_HEAD);
        final SubLObject pcase_var;
        final SubLObject head_penn_tag = pcase_var = (SubLObject)((coreference_resolution.NIL != head_word) ? methods.funcall_instance_method_with_0_args(head_word, (SubLObject)coreference_resolution.$sym73$GET_CATEGORY) : coreference_resolution.NIL);
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw263$NN) || pcase_var.eql((SubLObject)coreference_resolution.$kw265$NNP)) {
            return coreference_resolution.$const157$Singular_NLAttr;
        }
        if (pcase_var.eql((SubLObject)coreference_resolution.$kw264$NNS) || pcase_var.eql((SubLObject)coreference_resolution.$kw266$NNPS)) {
            return coreference_resolution.$const162$Plural_NLAttr;
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 71499L)
    public static SubLObject cr_get_cycls_for_head_of_np_phrase(final SubLObject phrase) {
        final SubLObject head_word = methods.funcall_instance_method_with_0_args(phrase, (SubLObject)coreference_resolution.$sym223$GET_HEAD);
        if (coreference_resolution.NIL != head_word) {
            final SubLObject head_category = cr_pos_category_for_phrase(head_word);
            final SubLObject head_string = methods.funcall_instance_method_with_0_args(head_word, (SubLObject)coreference_resolution.$sym140$GET_STRING);
            return cr_ps_get_cycls_for_phrase_with_timeout(head_string, head_category, (SubLObject)coreference_resolution.FIFTEEN_INTEGER, coreference_resolution.$const248$CycNounLearnerLexicalMt);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 71851L)
    public static SubLObject cr_ps_get_cycls_for_phrase_with_timeout(final SubLObject string, final SubLObject category, final SubLObject timeout, SubLObject mt) {
        if (mt == coreference_resolution.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)coreference_resolution.NIL;
        SubLObject timed_outP_inner = (SubLObject)coreference_resolution.NIL;
        SubLObject timed_outP_outer = (SubLObject)coreference_resolution.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)coreference_resolution.T, thread);
                SubLObject timer = (SubLObject)coreference_resolution.NIL;
                try {
                    final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)coreference_resolution.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(Numbers.add(timeout, (SubLObject)coreference_resolution.TEN_INTEGER), tag);
                        final SubLObject _prev_bind_0_$13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                        try {
                            parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)coreference_resolution.ZERO_INTEGER, thread);
                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                            if (coreference_resolution.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                result = psp_main.ps_get_cycls_for_phrase(string, category, (SubLObject)coreference_resolution.$kw273$ANY, (SubLObject)coreference_resolution.NIL, psp_lexicon.get_default_psp_lexicon(mt, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED), (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
                            }
                            timed_outP_inner = parsing_macros.parsing_timeout_time_reachedP();
                        }
                        finally {
                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)coreference_resolution.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            timed_outP_outer = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(result, timed_outP_inner, timed_outP_outer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 72322L)
    public static SubLObject resolve_coreferences_and_print_to_html_file(final SubLObject input, final SubLObject output_file, SubLObject coref_discourse) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        coref_discourse = resolve_coreferences(input, coref_discourse);
        SubLObject stream = (SubLObject)coreference_resolution.NIL;
        try {
            stream = compatibility.open_text(output_file, (SubLObject)coreference_resolution.$kw283$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)coreference_resolution.$str64$Unable_to_open__S, output_file);
            }
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_print_coreferences(coref_discourse);
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)coreference_resolution.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 72754L)
    public static SubLObject resolve_coreferences_and_print_to_file(final SubLObject input, final SubLObject output_file, SubLObject coref_discourse, SubLObject sentences_to_view) {
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        if (sentences_to_view == coreference_resolution.UNPROVIDED) {
            sentences_to_view = (SubLObject)coreference_resolution.$kw72$ALL;
        }
        SubLObject stream = (SubLObject)coreference_resolution.NIL;
        try {
            stream = compatibility.open_text(output_file, (SubLObject)coreference_resolution.$kw283$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)coreference_resolution.$str64$Unable_to_open__S, output_file);
            }
            final SubLObject stream_$15 = stream;
            coref_discourse = resolve_coreferences_and_print(input, stream_$15, coref_discourse, sentences_to_view);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)coreference_resolution.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 73178L)
    public static SubLObject resolve_coreferences_and_print(SubLObject input, SubLObject stream, SubLObject coref_discourse, SubLObject sentences_to_view) {
        if (input == coreference_resolution.UNPROVIDED) {
            input = (SubLObject)coreference_resolution.$str284$_cyc_top_data_nl_coreference_test;
        }
        if (stream == coreference_resolution.UNPROVIDED) {
            stream = (SubLObject)coreference_resolution.T;
        }
        if (coref_discourse == coreference_resolution.UNPROVIDED) {
            coref_discourse = (SubLObject)coreference_resolution.NIL;
        }
        if (sentences_to_view == coreference_resolution.UNPROVIDED) {
            sentences_to_view = (SubLObject)coreference_resolution.$kw72$ALL;
        }
        coref_discourse = resolve_coreferences(input, coref_discourse);
        print_coreferences(coref_discourse, stream, sentences_to_view);
        return coref_discourse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 73617L)
    public static SubLObject html_print_coreferences_to_file(final SubLObject coref_discourse, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)coreference_resolution.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)coreference_resolution.$kw283$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)coreference_resolution.$str64$Unable_to_open__S, filename);
            }
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_print_coreferences(coref_discourse);
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)coreference_resolution.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 73808L)
    public static SubLObject print_coreferences(final SubLObject coref_discourse, SubLObject stream, SubLObject sentences_to_view) {
        if (stream == coreference_resolution.UNPROVIDED) {
            stream = (SubLObject)coreference_resolution.T;
        }
        if (sentences_to_view == coreference_resolution.UNPROVIDED) {
            sentences_to_view = (SubLObject)coreference_resolution.$kw72$ALL;
        }
        if (sentences_to_view == coreference_resolution.$kw72$ALL) {
            SubLObject cdolist_list_var = crd_sentences(coref_discourse);
            SubLObject string_or_parse_tree = (SubLObject)coreference_resolution.NIL;
            string_or_parse_tree = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                print_sentence_coreferences(coref_discourse, string_or_parse_tree, stream);
                cdolist_list_var = cdolist_list_var.rest();
                string_or_parse_tree = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = sentences_to_view;
            SubLObject sentence_number = (SubLObject)coreference_resolution.NIL;
            sentence_number = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                print_sentence_number_coreferences(coref_discourse, sentence_number, stream);
                cdolist_list_var = cdolist_list_var.rest();
                sentence_number = cdolist_list_var.first();
            }
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 74327L)
    public static SubLObject print_sentence_number_coreferences(final SubLObject coref_discourse, final SubLObject sentence_number, final SubLObject stream) {
        return print_sentence_coreferences(coref_discourse, ConsesLow.nth(sentence_number, crd_sentences(coref_discourse)), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 74536L)
    public static SubLObject print_sentence_coreferences(final SubLObject coref_discourse, final SubLObject sentence, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)coreference_resolution.$str285$____Sentence____S__, crd_sentence_string(sentence));
        if (coreference_resolution.NIL != parse_tree.parse_tree_p(sentence)) {
            return print_tree_coreferences(coref_discourse, sentence, stream);
        }
        if (sentence.isString()) {
            return PrintLow.format(stream, (SubLObject)coreference_resolution.$str286$____Not_parsed_);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 74862L)
    public static SubLObject print_tree_coreferences(final SubLObject coref_discourse, final SubLObject tree, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)coreference_resolution.$kw69$DFL2R;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw69$DFL2R, (SubLObject)coreference_resolution.$kw70$DFR2L);
        SubLObject sub = (SubLObject)coreference_resolution.NIL;
        if (coreference_resolution.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && coreference_resolution.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
            Errors.error((SubLObject)coreference_resolution.$str71$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(tree, stack);
        while (coreference_resolution.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (coreference_resolution.NIL != coreference_resolution_referenceP(sub, coref_discourse)) {
                final SubLObject ref_info = reference_note(sub, coref_discourse);
                PrintLow.format(stream, (SubLObject)coreference_resolution.$str287$____Reference___S____Cycls___S___, methods.funcall_instance_method_with_0_args(sub, (SubLObject)coreference_resolution.$sym140$GET_STRING), reference_info_cycls(ref_info));
                final SubLObject pcase_var = reference_info_possible_anaphorP(ref_info);
                if (pcase_var.eql((SubLObject)coreference_resolution.$kw81$STANDARD_ANAPHOR)) {
                    final SubLObject best = reference_info_best_antecedent(ref_info);
                    final SubLObject likelies = reference_info_likely_antecedents(ref_info);
                    final SubLObject possibles = reference_info_possible_antecedents(ref_info);
                    if (coreference_resolution.NIL != list_utilities.non_empty_list_p(possibles)) {
                        PrintLow.format(stream, (SubLObject)coreference_resolution.$str288$Best_antecedent__);
                        print_strings_of_reference_and_antecedents(coref_discourse, best, stream);
                        PrintLow.format(stream, (SubLObject)coreference_resolution.$str289$__Likely_antecedents__);
                        if (coreference_resolution.NIL != list_utilities.empty_list_p(likelies)) {
                            PrintLow.format(stream, (SubLObject)coreference_resolution.$str290$None___);
                        }
                        else {
                            print_strings_of_reference_and_antecedents(coref_discourse, likelies.first(), stream);
                            SubLObject cdolist_list_var = likelies.rest();
                            SubLObject likely = (SubLObject)coreference_resolution.NIL;
                            likely = cdolist_list_var.first();
                            while (coreference_resolution.NIL != cdolist_list_var) {
                                PrintLow.format(stream, (SubLObject)coreference_resolution.$str291$____________________);
                                print_strings_of_reference_and_antecedents(coref_discourse, likely, stream);
                                cdolist_list_var = cdolist_list_var.rest();
                                likely = cdolist_list_var.first();
                            }
                        }
                        PrintLow.format(stream, (SubLObject)coreference_resolution.$str292$__Possible_antecedents__);
                        print_strings_of_reference_and_antecedents(coref_discourse, possibles.first(), stream);
                        SubLObject cdolist_list_var = possibles.rest();
                        SubLObject possible = (SubLObject)coreference_resolution.NIL;
                        possible = cdolist_list_var.first();
                        while (coreference_resolution.NIL != cdolist_list_var) {
                            PrintLow.format(stream, (SubLObject)coreference_resolution.$str293$______________________);
                            print_strings_of_reference_and_antecedents(coref_discourse, possible, stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            possible = cdolist_list_var.first();
                        }
                    }
                    else {
                        PrintLow.format(stream, (SubLObject)coreference_resolution.$str294$Anaphor_with_no_possible_antecede, reference_info_functional_dependency(ref_info));
                    }
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw206$NON_ANAPHOR)) {
                    PrintLow.format(stream, (SubLObject)coreference_resolution.$str295$Not_an_anaphor___);
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw207$ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE)) {
                    PrintLow.format(stream, (SubLObject)coreference_resolution.$str296$Anaphor_resolving_to_background_k);
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw208$LIKELY_ACCOMODATABLE_ANAPHOR)) {
                    PrintLow.format(stream, (SubLObject)coreference_resolution.$str297$Likely_accomodatable_anaphor___);
                }
                else {
                    PrintLow.format(stream, (SubLObject)coreference_resolution.$str298$Got_unexpected_value_from_REFEREN, reference_info_possible_anaphorP(ref_info));
                }
            }
            if (coreference_resolution.NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)coreference_resolution.$kw69$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)coreference_resolution.NIL, v_iteration = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                    element_num = ((coreference_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 76932L)
    public static SubLObject print_strings_of_reference_and_antecedents(final SubLObject coref_discourse, final SubLObject reference, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)coreference_resolution.$str299$_);
        print_strings_of_reference_and_antecedents_int(coref_discourse, reference, stream);
        PrintLow.format(stream, (SubLObject)coreference_resolution.$str300$____);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 77171L)
    public static SubLObject print_strings_of_reference_and_antecedents_int(final SubLObject coref_discourse, final SubLObject reference, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)coreference_resolution.$str301$__S, methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym140$GET_STRING));
        final SubLObject best = reference_get(reference, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, coref_discourse);
        if (coreference_resolution.NIL != best) {
            print_strings_of_reference_and_antecedents_int(coref_discourse, best, stream);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 77512L)
    public static SubLObject html_print_coreferences(final SubLObject coref_discourse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
        html_utilities.html_markup((SubLObject)coreference_resolution.$str302$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
            final SubLObject sentences = crd_sentences(coref_discourse);
            SubLObject color = (SubLObject)coreference_resolution.NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)coreference_resolution.NIL;
            sentence = cdolist_list_var.first();
            while (coreference_resolution.NIL != cdolist_list_var) {
                color = (color.eql(html_macros.$html_color_white$.getGlobalValue()) ? html_macros.$html_color_lighter_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (coreference_resolution.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                    html_utilities.html_markup(color);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
                        html_print_sentence_coreferences(coref_discourse, sentence);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)coreference_resolution.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 78198L)
    public static SubLObject html_print_sentence_coreferences(final SubLObject coref_discourse, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str304$Sentence___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), crd_sentence_string(sentence));
        if (coreference_resolution.NIL != parse_tree.parse_tree_p(sentence)) {
            final SubLObject switch_id = Sequences.cconcatenate(coreference_resolution.$cr_sentence_switch_id_base$.getGlobalValue(), string_utilities.to_string(object.get_object_instance_number(sentence)));
            dhtml_macros.dhtml_switch_visibility_links(switch_id, (SubLObject)coreference_resolution.$str305$Show, (SubLObject)coreference_resolution.$str306$Hide);
            dhtml_macros.dhtml_set_switched_visibility(switch_id, (SubLObject)coreference_resolution.$kw307$VISIBLE, (SubLObject)coreference_resolution.$kw308$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (coreference_resolution.NIL != switch_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                html_utilities.html_markup(switch_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
                html_print_tree_coreferences(coref_discourse, sentence);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)coreference_resolution.UNPROVIDED);
        }
        else {
            html_utilities.html_newline((SubLObject)coreference_resolution.TWO_INTEGER);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str309$Not_parsed_);
        }
        html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 78948L)
    public static SubLObject html_print_tree_coreferences(final SubLObject coref_discourse, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)coreference_resolution.$kw69$DFL2R;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)coreference_resolution.$kw69$DFL2R, (SubLObject)coreference_resolution.$kw70$DFR2L);
        SubLObject sub = (SubLObject)coreference_resolution.NIL;
        if (coreference_resolution.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && coreference_resolution.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)coreference_resolution.EQ), (SubLObject)coreference_resolution.UNPROVIDED)) {
            Errors.error((SubLObject)coreference_resolution.$str71$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(tree, stack);
        while (coreference_resolution.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (coreference_resolution.NIL != coreference_resolution_referenceP(sub, coref_discourse)) {
                final SubLObject ref_info = reference_note(sub, coref_discourse);
                final SubLObject switch_id_suffix = string_utilities.to_string(object.get_object_instance_number(sub));
                final SubLObject parses_switch_id = Sequences.cconcatenate(coreference_resolution.$cr_parses_switch_id_base$.getGlobalValue(), switch_id_suffix);
                html_utilities.html_newline((SubLObject)coreference_resolution.TWO_INTEGER);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str312$Reference___S, methods.funcall_instance_method_with_0_args(sub, (SubLObject)coreference_resolution.$sym140$GET_STRING));
                html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str313$Parses_);
                dhtml_macros.dhtml_switch_visibility_links(parses_switch_id, (SubLObject)coreference_resolution.$str305$Show, (SubLObject)coreference_resolution.$str306$Hide);
                dhtml_macros.dhtml_set_switched_visibility(parses_switch_id, (SubLObject)coreference_resolution.$kw314$INVISIBLE, (SubLObject)coreference_resolution.$kw308$TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (coreference_resolution.NIL != parses_switch_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                    html_utilities.html_markup(parses_switch_id);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject parses = cdolist_list_var = ((coreference_resolution.NIL != crd_use_pspP(coref_discourse)) ? reference_info_cycls(ref_info) : reference_cyclifier_semantics(sub));
                    SubLObject parse = (SubLObject)coreference_resolution.NIL;
                    parse = cdolist_list_var.first();
                    while (coreference_resolution.NIL != cdolist_list_var) {
                        cb_utilities.cb_form(parse, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        parse = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)coreference_resolution.UNPROVIDED);
                html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                final SubLObject pcase_var = reference_info_possible_anaphorP(ref_info);
                if (pcase_var.eql((SubLObject)coreference_resolution.$kw81$STANDARD_ANAPHOR)) {
                    final SubLObject best = reference_info_best_antecedent(ref_info);
                    final SubLObject likelies = reference_info_likely_antecedents(ref_info);
                    final SubLObject possibles = reference_info_possible_antecedents(ref_info);
                    if (coreference_resolution.NIL != list_utilities.non_empty_list_p(possibles)) {
                        final SubLObject more_info_switch_id = Sequences.cconcatenate(coreference_resolution.$cr_more_info_switch_id_base$.getGlobalValue(), switch_id_suffix);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str288$Best_antecedent__);
                        html_print_strings_of_reference_and_antecedents(coref_discourse, best);
                        dhtml_macros.dhtml_switch_visibility_links(more_info_switch_id, (SubLObject)coreference_resolution.$str315$Show_more, (SubLObject)coreference_resolution.$str306$Hide);
                        dhtml_macros.dhtml_set_switched_visibility(more_info_switch_id, (SubLObject)coreference_resolution.$kw314$INVISIBLE, (SubLObject)coreference_resolution.$kw308$TEXT);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (coreference_resolution.NIL != more_info_switch_id) {
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                            html_utilities.html_markup(more_info_switch_id);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)coreference_resolution.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)coreference_resolution.UNPROVIDED);
                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)coreference_resolution.T, thread);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str316$Likely_antecedents__);
                            if (coreference_resolution.NIL != list_utilities.empty_list_p(likelies)) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str317$None_);
                                html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                            }
                            else {
                                html_print_strings_of_reference_and_antecedents(coref_discourse, likelies.first());
                                SubLObject cdolist_list_var2 = likelies.rest();
                                SubLObject likely = (SubLObject)coreference_resolution.NIL;
                                likely = cdolist_list_var2.first();
                                while (coreference_resolution.NIL != cdolist_list_var2) {
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str291$____________________);
                                    html_print_strings_of_reference_and_antecedents(coref_discourse, likely);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    likely = cdolist_list_var2.first();
                                }
                            }
                            html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str318$Possible_antecedents__);
                            html_print_strings_of_reference_and_antecedents(coref_discourse, possibles.first());
                            SubLObject cdolist_list_var2 = possibles.rest();
                            SubLObject possible = (SubLObject)coreference_resolution.NIL;
                            possible = cdolist_list_var2.first();
                            while (coreference_resolution.NIL != cdolist_list_var2) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str293$______________________);
                                html_print_strings_of_reference_and_antecedents(coref_discourse, possible);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                possible = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)coreference_resolution.UNPROVIDED);
                    }
                    else {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str319$Anaphor_with_no_possible_antecede);
                        html_utilities.html_newline((SubLObject)coreference_resolution.TWO_INTEGER);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str320$Functional_dependency__);
                        html_print_functional_dependency(reference_info_functional_dependency(ref_info));
                        html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                    }
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw206$NON_ANAPHOR)) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str321$Not_an_anaphor_);
                    html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw207$ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE)) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str322$Anaphor_resolving_to_background_k);
                    html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)coreference_resolution.$kw208$LIKELY_ACCOMODATABLE_ANAPHOR)) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str323$Likely_accomodatable_anaphor_);
                    html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                }
                else {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str324$Got_unexpected_value_from_REFEREN, reference_info_possible_anaphorP(ref_info));
                    html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
                }
            }
            if (coreference_resolution.NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)coreference_resolution.$kw69$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)coreference_resolution.NIL, v_iteration = (SubLObject)coreference_resolution.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER)) {
                    element_num = ((coreference_resolution.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)coreference_resolution.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 82026L)
    public static SubLObject html_print_strings_of_reference_and_antecedents(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str299$_);
        html_print_strings_of_reference_and_antecedents_int(coref_discourse, reference);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str325$__);
        html_utilities.html_newline((SubLObject)coreference_resolution.UNPROVIDED);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 82272L)
    public static SubLObject html_print_strings_of_reference_and_antecedents_int(final SubLObject coref_discourse, final SubLObject reference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str301$__S, methods.funcall_instance_method_with_0_args(reference, (SubLObject)coreference_resolution.$sym140$GET_STRING));
        final SubLObject best = reference_get(reference, (SubLObject)coreference_resolution.$kw85$BEST_ANTECEDENT, coref_discourse);
        if (coreference_resolution.NIL != best) {
            html_print_strings_of_reference_and_antecedents_int(coref_discourse, best);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolution.lisp", position = 82607L)
    public static SubLObject html_print_functional_dependency(final SubLObject func_dep) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (coreference_resolution.NIL != list_utilities.doubletonP(func_dep)) {
            SubLObject relation = (SubLObject)coreference_resolution.NIL;
            SubLObject antecedent = (SubLObject)coreference_resolution.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(func_dep, func_dep, (SubLObject)coreference_resolution.$list326);
            relation = func_dep.first();
            SubLObject current = func_dep.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, func_dep, (SubLObject)coreference_resolution.$list326);
            antecedent = current.first();
            current = current.rest();
            if (coreference_resolution.NIL == current) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str327$Related_to__S_via_, methods.funcall_instance_method_with_0_args(antecedent, (SubLObject)coreference_resolution.$sym140$GET_STRING));
                cb_utilities.cb_form(relation, (SubLObject)coreference_resolution.UNPROVIDED, (SubLObject)coreference_resolution.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(func_dep, (SubLObject)coreference_resolution.$list326);
            }
        }
        else if (coreference_resolution.NIL == func_dep) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)coreference_resolution.$str317$None_);
        }
        else {
            Errors.warn((SubLObject)coreference_resolution.$str328$Don_t_recognize__S_as_a_functiona);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), func_dep);
        }
        return (SubLObject)coreference_resolution.NIL;
    }
    
    public static SubLObject declare_coreference_resolution_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "coreference_resolution_discourse_struct_print_function_trampoline", "COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "coreference_resolution_discourse_struct_p", "COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P", 1, 0, false);
        new $coreference_resolution_discourse_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_implementation", "CRD-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_parser", "CRD-PARSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_use_pspP", "CRD-USE-PSP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_max_sufficient_recentness", "CRD-MAX-SUFFICIENT-RECENTNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_max_possible_antecedents", "CRD-MAX-POSSIBLE-ANTECEDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_max_sufficient_recentness_for_gendered_pronoun", "CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_max_possible_antecedents_for_gendered_pronoun", "CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_reference_note_hash", "CRD-REFERENCE-NOTE-HASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_recent_references", "CRD-RECENT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_sentences", "CRD-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_implementation", "_CSETF-CRD-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_parser", "_CSETF-CRD-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_use_pspP", "_CSETF-CRD-USE-PSP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_max_sufficient_recentness", "_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_max_possible_antecedents", "_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_max_sufficient_recentness_for_gendered_pronoun", "_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_max_possible_antecedents_for_gendered_pronoun", "_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_reference_note_hash", "_CSETF-CRD-REFERENCE-NOTE-HASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_recent_references", "_CSETF-CRD-RECENT-REFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_crd_sentences", "_CSETF-CRD-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "make_coreference_resolution_discourse_struct", "MAKE-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_coreference_resolution_discourse_struct", "VISIT-DEFSTRUCT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_object_coreference_resolution_discourse_struct_method", "VISIT-DEFSTRUCT-OBJECT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "new_coref_discourse", "NEW-COREF-DISCOURSE", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "coref_discourse_p", "COREF-DISCOURSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "coreference_resolution_referenceP", "COREFERENCE-RESOLUTION-REFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_p", "REFERENCE-NOTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note", "REFERENCE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "set_reference_note", "SET-REFERENCE-NOTE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_parse_tree", "RESOLVE-COREFERENCES-IN-PARSE-TREE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences", "RESOLVE-COREFERENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_text_file", "RESOLVE-COREFERENCES-IN-TEXT-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_stream", "RESOLVE-COREFERENCES-IN-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_string", "RESOLVE-COREFERENCES-IN-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_document", "RESOLVE-COREFERENCES-IN-DOCUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_in_list_of_parse_trees", "RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "coref_discourse_coreferring_expressions", "COREF-DISCOURSE-COREFERRING-EXPRESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_parse", "CRD-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_add_sentences", "CRD-ADD-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_add_sentence", "CRD-ADD-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "crd_sentence_string", "CRD-SENTENCE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "note_latest_sentence_references", "NOTE-LATEST-SENTENCE-REFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "is_the_only_head_daughter_of_an_npP", "IS-THE-ONLY-HEAD-DAUGHTER-OF-AN-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_reference", "RESOLVE-REFERENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "max_sufficient_recentness_for_reference", "MAX-SUFFICIENT-RECENTNESS-FOR-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "max_possible_antecedents_for_reference", "MAX-POSSIBLE-ANTECEDENTS-FOR-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_gendered_pronounP", "REFERENCE-GENDERED-PRONOUN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_calculate_and_set", "REFERENCE-CALCULATE-AND-SET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possibly_calculate", "REFERENCE-POSSIBLY-CALCULATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_calculate", "REFERENCE-CALCULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_anaphorP_calculate", "REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_antecedentP_calculate", "REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_antecedents_calculate", "REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_likely_antecedents_calculate", "REFERENCE-LIKELY-ANTECEDENTS-CALCULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_best_antecedent_calculate", "REFERENCE-BEST-ANTECEDENT-CALCULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_functional_dependency_calculate", "REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_get", "REFERENCE-GET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_anaphorP_get", "REFERENCE-NOTE-POSSIBLE-ANAPHOR?-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_antecedentP_get", "REFERENCE-NOTE-POSSIBLE-ANTECEDENT?-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_antecedents_get", "REFERENCE-NOTE-POSSIBLE-ANTECEDENTS-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_likely_antecedents_get", "REFERENCE-NOTE-LIKELY-ANTECEDENTS-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_best_antecedent_get", "REFERENCE-NOTE-BEST-ANTECEDENT-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_functional_dependency_get", "REFERENCE-NOTE-FUNCTIONAL-DEPENDENCY-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_set", "REFERENCE-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_anaphorP_set", "REFERENCE-NOTE-POSSIBLE-ANAPHOR?-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_antecedentP_set", "REFERENCE-NOTE-POSSIBLE-ANTECEDENT?-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_possible_antecedents_set", "REFERENCE-NOTE-POSSIBLE-ANTECEDENTS-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_likely_antecedents_set", "REFERENCE-NOTE-LIKELY-ANTECEDENTS-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_best_antecedent_set", "REFERENCE-NOTE-BEST-ANTECEDENT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_note_functional_dependency_set", "REFERENCE-NOTE-FUNCTIONAL-DEPENDENCY-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "new_reference_note", "NEW-REFERENCE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_do_implementation_specific_processing", "REFERENCE-DO-IMPLEMENTATION-SPECIFIC-PROCESSING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_print_function_trampoline", "REFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_p", "REFERENCE-INFO-P", 1, 0, false);
        new $reference_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_index_number", "REFERENCE-INFO-INDEX-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_tree", "REFERENCE-INFO-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_cycls", "REFERENCE-INFO-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedentP", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_anaphorP", "REFERENCE-INFO-POSSIBLE-ANAPHOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedents", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_likely_antecedents", "REFERENCE-INFO-LIKELY-ANTECEDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_best_antecedent", "REFERENCE-INFO-BEST-ANTECEDENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_functional_dependency", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_referent", "REFERENCE-INFO-REFERENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_index_number", "_CSETF-REFERENCE-INFO-INDEX-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_tree", "_CSETF-REFERENCE-INFO-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_cycls", "_CSETF-REFERENCE-INFO-CYCLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_possible_antecedentP", "_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_possible_anaphorP", "_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_possible_antecedents", "_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_likely_antecedents", "_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_best_antecedent", "_CSETF-REFERENCE-INFO-BEST-ANTECEDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_functional_dependency", "_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_reference_info_referent", "_CSETF-REFERENCE-INFO-REFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "make_reference_info", "MAKE-REFERENCE-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_reference_info", "VISIT-DEFSTRUCT-REFERENCE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_object_reference_info_method", "VISIT-DEFSTRUCT-OBJECT-REFERENCE-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_reference_info", "PRINT-REFERENCE-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_string", "REFERENCE-INFO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_cycl", "REFERENCE-INFO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_cycl", "REFERENCE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_cycl_stripped", "REFERENCE-CYCL-STRIPPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics", "REFERENCE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_psp_semantics", "REFERENCE-PSP-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_cyclifier_semantics", "REFERENCE-CYCLIFIER-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_existentially_unbind", "CR-EXISTENTIALLY-UNBIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "guess_referent_stand_in_in_cyclifications", "GUESS-REFERENT-STAND-IN-IN-CYCLIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "possibly_cyclifier_referent_stand_in", "POSSIBLY-CYCLIFIER-REFERENT-STAND-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "instance_fn_nat_p", "INSTANCE-FN-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_non_person", "CR-NON-PERSON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_number", "REFERENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_psp_number", "REFERENCE-PSP-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_cyclifier_number", "REFERENCE-CYCLIFIER-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_parse_tree_number_attribute", "CR-PARSE-TREE-NUMBER-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "parse_tree_number_to_nl_number_attribute", "PARSE-TREE-NUMBER-TO-NL-NUMBER-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_gender", "REFERENCE-GENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_psp_gender", "REFERENCE-PSP-GENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_cyclifier_gender", "REFERENCE-CYCLIFIER-GENDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_parse_tree_gender_attribute", "CR-PARSE-TREE-GENDER-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "parse_tree_gender_to_nl_gender_attribute", "PARSE-TREE-GENDER-TO-NL-GENDER-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_referent", "REFERENCE-REFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "new_reference_info", "NEW-REFERENCE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_print_function_trampoline", "REFERENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_p", "REFERENT-STRUCT-P", 1, 0, false);
        new $referent_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_references", "REFERENT-STRUCT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_equals", "REFERENT-STRUCT-EQUALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_types", "REFERENT-STRUCT-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_facts", "REFERENT-STRUCT-FACTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_gender", "REFERENT-STRUCT-GENDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "referent_struct_number", "REFERENT-STRUCT-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_references", "_CSETF-REFERENT-STRUCT-REFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_equals", "_CSETF-REFERENT-STRUCT-EQUALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_types", "_CSETF-REFERENT-STRUCT-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_facts", "_CSETF-REFERENT-STRUCT-FACTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_gender", "_CSETF-REFERENT-STRUCT-GENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "_csetf_referent_struct_number", "_CSETF-REFERENT-STRUCT-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "make_referent_struct", "MAKE-REFERENT-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_referent_struct", "VISIT-DEFSTRUCT-REFERENT-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "visit_defstruct_object_referent_struct_method", "VISIT-DEFSTRUCT-OBJECT-REFERENT-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_referent_struct", "PRINT-REFERENT-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "new_referent_struct_for_first_mention", "NEW-REFERENT-STRUCT-FOR-FIRST-MENTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "add_reference_to_referent", "ADD-REFERENCE-TO-REFERENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "add_semantics_to_referent", "ADD-SEMANTICS-TO-REFERENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "add_psp_semantics_to_referent", "ADD-PSP-SEMANTICS-TO-REFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "add_cyclifier_semantics_to_referent", "ADD-CYCLIFIER-SEMANTICS-TO-REFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_split_conjunctions", "CR-SPLIT-CONJUNCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_stronger_gender", "CR-STRONGER-GENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_stronger_number", "CR-STRONGER-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_anaphorP_calculate_code", "REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "np_reference_has_restrictive_clauseP", "NP-REFERENCE-HAS-RESTRICTIVE-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "restrictive_clause_tree_p", "RESTRICTIVE-CLAUSE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "np_reference_has_of_prepositional_phraseP", "NP-REFERENCE-HAS-OF-PREPOSITIONAL-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "of_pp_tree_p", "OF-PP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "np_reference_has_possessive_determinerP", "NP-REFERENCE-HAS-POSSESSIVE-DETERMINER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_possessive_determiner_p", "CR-POSSESSIVE-DETERMINER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_demonstrative_determiner_p", "CR-DEMONSTRATIVE-DETERMINER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "kb_demonstrative_nl_attr_p", "KB-DEMONSTRATIVE-NL-ATTR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_gendered_pronounP_code", "REFERENCE-GENDERED-PRONOUN?-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_gendered_pronounP_psp", "REFERENCE-GENDERED-PRONOUN?-PSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_gendered_pronounP_cyclifier", "REFERENCE-GENDERED-PRONOUN?-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_definite_expressionP_code", "REFERENCE-DEFINITE-EXPRESSION?-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_definite_descriptionP", "REFERENCE-IS-DEFINITE-DESCRIPTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_definite_descriptionP_psp", "REFERENCE-IS-DEFINITE-DESCRIPTION?-PSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_definite_descriptionP_cyclifier", "REFERENCE-IS-DEFINITE-DESCRIPTION?-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_pronounP", "REFERENCE-IS-PRONOUN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_pronounP_psp", "REFERENCE-IS-PRONOUN?-PSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_pronounP_cyclifier", "REFERENCE-IS-PRONOUN?-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_first_or_second_person_pronounP", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_first_or_second_person_pronounP_psp", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?-PSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_is_first_or_second_person_pronounP_cyclifier", "REFERENCE-IS-FIRST-OR-SECOND-PERSON-PRONOUN?-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_antecedentP_calculate_code", "REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possible_antecedents_calculate_code", "REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "filter_antecedent_candidates", "FILTER-ANTECEDENT-CANDIDATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_possibly_refers_toP_code", "REFERENCE-POSSIBLY-REFERS-TO?-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_syntactically_possible_referent_forP_code", "REFERENCE-SYNTACTICALLY-POSSIBLE-REFERENT-FOR?-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_and_referent_disagree_in_numberP", "REFERENCE-AND-REFERENT-DISAGREE-IN-NUMBER?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_and_referent_disagree_in_genderP", "REFERENCE-AND-REFERENT-DISAGREE-IN-GENDER?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantically_possible_referent_forP_code", "REFERENCE-SEMANTICALLY-POSSIBLE-REFERENT-FOR?-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_compatible_with_referent_typesP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TYPES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_compatible_with_referent_typeP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_compatible_with_referent_termP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_not_isaP", "CR-NOT-ISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_few_if_anyP", "CR-FEW-IF-ANY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "few_if_anyP", "FEW-IF-ANY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_disjoint_withP", "CR-DISJOINT-WITH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_compatible_with_referent_factsP", "REFERENCE-SEMANTICS-COMPATIBLE-WITH-REFERENT-FACTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_likely_antecedents_calculate_code", "REFERENCE-LIKELY-ANTECEDENTS-CALCULATE-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_likely_refers_toP_code", "REFERENCE-LIKELY-REFERS-TO?-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantically_likely_referent_forP_code", "REFERENCE-SEMANTICALLY-LIKELY-REFERENT-FOR?-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_overlap_with_referent_typesP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TYPES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_overlap_with_referent_typeP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_semantics_overlap_with_referent_termP", "REFERENCE-SEMANTICS-OVERLAP-WITH-REFERENT-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_best_antecedent_calculate_code", "REFERENCE-BEST-ANTECEDENT-CALCULATE-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_functional_dependency_calculate_code", "REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_find_functional_dependency_with", "REFERENCE-FIND-FUNCTIONAL-DEPENDENCY-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_anaphorP_get", "REFERENCE-INFO-POSSIBLE-ANAPHOR?-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedentP_get", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedents_get", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_likely_antecedents_get", "REFERENCE-INFO-LIKELY-ANTECEDENTS-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_best_antecedent_get", "REFERENCE-INFO-BEST-ANTECEDENT-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_functional_dependency_get", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_anaphorP_set", "REFERENCE-INFO-POSSIBLE-ANAPHOR?-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedentP_set", "REFERENCE-INFO-POSSIBLE-ANTECEDENT?-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_possible_antecedents_set", "REFERENCE-INFO-POSSIBLE-ANTECEDENTS-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_likely_antecedents_set", "REFERENCE-INFO-LIKELY-ANTECEDENTS-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_best_antecedent_set", "REFERENCE-INFO-BEST-ANTECEDENT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_info_functional_dependency_set", "REFERENCE-INFO-FUNCTIONAL-DEPENDENCY-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_do_implementation_specific_processing_code", "REFERENCE-DO-IMPLEMENTATION-SPECIFIC-PROCESSING-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_genl_in_any_mtP", "CR-GENL-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_isa_in_any_mtP", "CR-ISA-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_get_cycls_for_reference", "CR-GET-CYCLS-FOR-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_get_cycls_for_np_reference", "CR-GET-CYCLS-FOR-NP-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_get_cycls_for_prpX_reference", "CR-GET-CYCLS-FOR-PRP$-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_filter_subl_from_cycls", "CR-FILTER-SUBL-FROM-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_plausible_year_integerP", "CR-PLAUSIBLE-YEAR-INTEGER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_pos_category_for_phrase", "CR-POS-CATEGORY-FOR-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "reference_penn_tag", "REFERENCE-PENN-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "strip_final_period", "STRIP-FINAL-PERIOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_courtesy_title_p", "CR-COURTESY-TITLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_possible_name_phrase_semantics", "CR-POSSIBLE-NAME-PHRASE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "phrasal_reference_head_phrase", "PHRASAL-REFERENCE-HEAD-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_get_cycls_for_parts_of_reference", "CR-GET-CYCLS-FOR-PARTS-OF-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_discern_definiteness_attribute_of_preterminal_np_phrase", "CR-DISCERN-DEFINITENESS-ATTRIBUTE-OF-PRETERMINAL-NP-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_discern_number_attribute_of_preterminal_np_phrase", "CR-DISCERN-NUMBER-ATTRIBUTE-OF-PRETERMINAL-NP-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_get_cycls_for_head_of_np_phrase", "CR-GET-CYCLS-FOR-HEAD-OF-NP-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "cr_ps_get_cycls_for_phrase_with_timeout", "CR-PS-GET-CYCLS-FOR-PHRASE-WITH-TIMEOUT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_and_print_to_html_file", "RESOLVE-COREFERENCES-AND-PRINT-TO-HTML-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_and_print_to_file", "RESOLVE-COREFERENCES-AND-PRINT-TO-FILE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "resolve_coreferences_and_print", "RESOLVE-COREFERENCES-AND-PRINT", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_coreferences_to_file", "HTML-PRINT-COREFERENCES-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_coreferences", "PRINT-COREFERENCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_sentence_number_coreferences", "PRINT-SENTENCE-NUMBER-COREFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_sentence_coreferences", "PRINT-SENTENCE-COREFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_tree_coreferences", "PRINT-TREE-COREFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_strings_of_reference_and_antecedents", "PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "print_strings_of_reference_and_antecedents_int", "PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_coreferences", "HTML-PRINT-COREFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_sentence_coreferences", "HTML-PRINT-SENTENCE-COREFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_tree_coreferences", "HTML-PRINT-TREE-COREFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_strings_of_reference_and_antecedents", "HTML-PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_strings_of_reference_and_antecedents_int", "HTML-PRINT-STRINGS-OF-REFERENCE-AND-ANTECEDENTS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolution", "html_print_functional_dependency", "HTML-PRINT-FUNCTIONAL-DEPENDENCY", 1, 0, false);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    public static SubLObject init_coreference_resolution_file() {
        coreference_resolution.$dtp_coreference_resolution_discourse_struct$ = SubLFiles.defconstant("*DTP-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT*", (SubLObject)coreference_resolution.$sym0$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT);
        coreference_resolution.$dtp_reference_info$ = SubLFiles.defconstant("*DTP-REFERENCE-INFO*", (SubLObject)coreference_resolution.$sym104$REFERENCE_INFO);
        coreference_resolution.$cr_non_person$ = SubLFiles.deflexical("*CR-NON-PERSON*", (SubLObject)coreference_resolution.NIL);
        coreference_resolution.$dtp_referent_struct$ = SubLFiles.defconstant("*DTP-REFERENT-STRUCT*", (SubLObject)coreference_resolution.$sym169$REFERENT_STRUCT);
        coreference_resolution.$cr_courtesy_titles$ = SubLFiles.defconstant("*CR-COURTESY-TITLES*", (SubLObject)coreference_resolution.$list275);
        coreference_resolution.$cr_sentence_switch_id_base$ = SubLFiles.defconstant("*CR-SENTENCE-SWITCH-ID-BASE*", (SubLObject)coreference_resolution.$str303$sent);
        coreference_resolution.$cr_parses_switch_id_base$ = SubLFiles.defconstant("*CR-PARSES-SWITCH-ID-BASE*", (SubLObject)coreference_resolution.$str310$parses);
        coreference_resolution.$cr_more_info_switch_id_base$ = SubLFiles.defconstant("*CR-MORE-INFO-SWITCH-ID-BASE*", (SubLObject)coreference_resolution.$str311$more);
        return (SubLObject)coreference_resolution.NIL;
    }
    
    public static SubLObject setup_coreference_resolution_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_coreference_resolution_discourse_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym7$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)coreference_resolution.$list8);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym9$CRD_IMPLEMENTATION, (SubLObject)coreference_resolution.$sym10$_CSETF_CRD_IMPLEMENTATION);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym11$CRD_PARSER, (SubLObject)coreference_resolution.$sym12$_CSETF_CRD_PARSER);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym13$CRD_USE_PSP_, (SubLObject)coreference_resolution.$sym14$_CSETF_CRD_USE_PSP_);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym15$CRD_MAX_SUFFICIENT_RECENTNESS, (SubLObject)coreference_resolution.$sym16$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym17$CRD_MAX_POSSIBLE_ANTECEDENTS, (SubLObject)coreference_resolution.$sym18$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym19$CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN, (SubLObject)coreference_resolution.$sym20$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym21$CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN, (SubLObject)coreference_resolution.$sym22$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym23$CRD_REFERENCE_NOTE_HASH, (SubLObject)coreference_resolution.$sym24$_CSETF_CRD_REFERENCE_NOTE_HASH);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym25$CRD_RECENT_REFERENCES, (SubLObject)coreference_resolution.$sym26$_CSETF_CRD_RECENT_REFERENCES);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym27$CRD_SENTENCES, (SubLObject)coreference_resolution.$sym28$_CSETF_CRD_SENTENCES);
        Equality.identity((SubLObject)coreference_resolution.$sym0$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_coreference_resolution_discourse_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym44$VISIT_DEFSTRUCT_OBJECT_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_ME));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_reference_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym111$REFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)coreference_resolution.$list112);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym113$REFERENCE_INFO_INDEX_NUMBER, (SubLObject)coreference_resolution.$sym114$_CSETF_REFERENCE_INFO_INDEX_NUMBER);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym115$REFERENCE_INFO_TREE, (SubLObject)coreference_resolution.$sym116$_CSETF_REFERENCE_INFO_TREE);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym117$REFERENCE_INFO_CYCLS, (SubLObject)coreference_resolution.$sym118$_CSETF_REFERENCE_INFO_CYCLS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym119$REFERENCE_INFO_POSSIBLE_ANTECEDENT_, (SubLObject)coreference_resolution.$sym120$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENT_);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym121$REFERENCE_INFO_POSSIBLE_ANAPHOR_, (SubLObject)coreference_resolution.$sym122$_CSETF_REFERENCE_INFO_POSSIBLE_ANAPHOR_);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym123$REFERENCE_INFO_POSSIBLE_ANTECEDENTS, (SubLObject)coreference_resolution.$sym124$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENTS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym125$REFERENCE_INFO_LIKELY_ANTECEDENTS, (SubLObject)coreference_resolution.$sym126$_CSETF_REFERENCE_INFO_LIKELY_ANTECEDENTS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym127$REFERENCE_INFO_BEST_ANTECEDENT, (SubLObject)coreference_resolution.$sym128$_CSETF_REFERENCE_INFO_BEST_ANTECEDENT);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym129$REFERENCE_INFO_FUNCTIONAL_DEPENDENCY, (SubLObject)coreference_resolution.$sym130$_CSETF_REFERENCE_INFO_FUNCTIONAL_DEPENDENCY);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym131$REFERENCE_INFO_REFERENT, (SubLObject)coreference_resolution.$sym132$_CSETF_REFERENCE_INFO_REFERENT);
        Equality.identity((SubLObject)coreference_resolution.$sym104$REFERENCE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_reference_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym138$VISIT_DEFSTRUCT_OBJECT_REFERENCE_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_referent_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym176$REFERENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)coreference_resolution.$list177);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym75$REFERENT_STRUCT_REFERENCES, (SubLObject)coreference_resolution.$sym178$_CSETF_REFERENT_STRUCT_REFERENCES);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym179$REFERENT_STRUCT_EQUALS, (SubLObject)coreference_resolution.$sym180$_CSETF_REFERENT_STRUCT_EQUALS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym181$REFERENT_STRUCT_TYPES, (SubLObject)coreference_resolution.$sym182$_CSETF_REFERENT_STRUCT_TYPES);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym183$REFERENT_STRUCT_FACTS, (SubLObject)coreference_resolution.$sym184$_CSETF_REFERENT_STRUCT_FACTS);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym185$REFERENT_STRUCT_GENDER, (SubLObject)coreference_resolution.$sym186$_CSETF_REFERENT_STRUCT_GENDER);
        Structures.def_csetf((SubLObject)coreference_resolution.$sym187$REFERENT_STRUCT_NUMBER, (SubLObject)coreference_resolution.$sym188$_CSETF_REFERENT_STRUCT_NUMBER);
        Equality.identity((SubLObject)coreference_resolution.$sym169$REFERENT_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), coreference_resolution.$dtp_referent_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)coreference_resolution.$sym196$VISIT_DEFSTRUCT_OBJECT_REFERENT_STRUCT_METHOD));
        return (SubLObject)coreference_resolution.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_coreference_resolution_file();
    }
    
    @Override
	public void initializeVariables() {
        init_coreference_resolution_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_coreference_resolution_file();
    }
    
    static {
        me = (SubLFile)new coreference_resolution();
        coreference_resolution.$dtp_coreference_resolution_discourse_struct$ = null;
        coreference_resolution.$dtp_reference_info$ = null;
        coreference_resolution.$cr_non_person$ = null;
        coreference_resolution.$dtp_referent_struct$ = null;
        coreference_resolution.$cr_courtesy_titles$ = null;
        coreference_resolution.$cr_sentence_switch_id_base$ = null;
        coreference_resolution.$cr_parses_switch_id_base$ = null;
        coreference_resolution.$cr_more_info_switch_id_base$ = null;
        $sym0$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT = SubLObjectFactory.makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT");
        $sym1$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_P = SubLObjectFactory.makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("IMPLEMENTATION"), SubLObjectFactory.makeSymbol("PARSER"), SubLObjectFactory.makeSymbol("USE-PSP?"), SubLObjectFactory.makeSymbol("MAX-SUFFICIENT-RECENTNESS"), SubLObjectFactory.makeSymbol("MAX-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("REFERENCE-NOTE-HASH"), SubLObjectFactory.makeSymbol("RECENT-REFERENCES"), SubLObjectFactory.makeSymbol("SENTENCES") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("IMPLEMENTATION"), SubLObjectFactory.makeKeyword("PARSER"), SubLObjectFactory.makeKeyword("USE-PSP?"), SubLObjectFactory.makeKeyword("MAX-SUFFICIENT-RECENTNESS"), SubLObjectFactory.makeKeyword("MAX-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeKeyword("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeKeyword("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeKeyword("REFERENCE-NOTE-HASH"), SubLObjectFactory.makeKeyword("RECENT-REFERENCES"), SubLObjectFactory.makeKeyword("SENTENCES") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CRD-IMPLEMENTATION"), SubLObjectFactory.makeSymbol("CRD-PARSER"), SubLObjectFactory.makeSymbol("CRD-USE-PSP?"), SubLObjectFactory.makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS"), SubLObjectFactory.makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("CRD-REFERENCE-NOTE-HASH"), SubLObjectFactory.makeSymbol("CRD-RECENT-REFERENCES"), SubLObjectFactory.makeSymbol("CRD-SENTENCES") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-CRD-IMPLEMENTATION"), SubLObjectFactory.makeSymbol("_CSETF-CRD-PARSER"), SubLObjectFactory.makeSymbol("_CSETF-CRD-USE-PSP?"), SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS"), SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN"), SubLObjectFactory.makeSymbol("_CSETF-CRD-REFERENCE-NOTE-HASH"), SubLObjectFactory.makeSymbol("_CSETF-CRD-RECENT-REFERENCES"), SubLObjectFactory.makeSymbol("_CSETF-CRD-SENTENCES") });
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P"));
        $sym9$CRD_IMPLEMENTATION = SubLObjectFactory.makeSymbol("CRD-IMPLEMENTATION");
        $sym10$_CSETF_CRD_IMPLEMENTATION = SubLObjectFactory.makeSymbol("_CSETF-CRD-IMPLEMENTATION");
        $sym11$CRD_PARSER = SubLObjectFactory.makeSymbol("CRD-PARSER");
        $sym12$_CSETF_CRD_PARSER = SubLObjectFactory.makeSymbol("_CSETF-CRD-PARSER");
        $sym13$CRD_USE_PSP_ = SubLObjectFactory.makeSymbol("CRD-USE-PSP?");
        $sym14$_CSETF_CRD_USE_PSP_ = SubLObjectFactory.makeSymbol("_CSETF-CRD-USE-PSP?");
        $sym15$CRD_MAX_SUFFICIENT_RECENTNESS = SubLObjectFactory.makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS");
        $sym16$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS = SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS");
        $sym17$CRD_MAX_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS");
        $sym18$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS");
        $sym19$CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeSymbol("CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");
        $sym20$_CSETF_CRD_MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");
        $sym21$CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeSymbol("CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");
        $sym22$_CSETF_CRD_MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeSymbol("_CSETF-CRD-MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");
        $sym23$CRD_REFERENCE_NOTE_HASH = SubLObjectFactory.makeSymbol("CRD-REFERENCE-NOTE-HASH");
        $sym24$_CSETF_CRD_REFERENCE_NOTE_HASH = SubLObjectFactory.makeSymbol("_CSETF-CRD-REFERENCE-NOTE-HASH");
        $sym25$CRD_RECENT_REFERENCES = SubLObjectFactory.makeSymbol("CRD-RECENT-REFERENCES");
        $sym26$_CSETF_CRD_RECENT_REFERENCES = SubLObjectFactory.makeSymbol("_CSETF-CRD-RECENT-REFERENCES");
        $sym27$CRD_SENTENCES = SubLObjectFactory.makeSymbol("CRD-SENTENCES");
        $sym28$_CSETF_CRD_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-CRD-SENTENCES");
        $kw29$IMPLEMENTATION = SubLObjectFactory.makeKeyword("IMPLEMENTATION");
        $kw30$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $kw31$USE_PSP_ = SubLObjectFactory.makeKeyword("USE-PSP?");
        $kw32$MAX_SUFFICIENT_RECENTNESS = SubLObjectFactory.makeKeyword("MAX-SUFFICIENT-RECENTNESS");
        $kw33$MAX_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeKeyword("MAX-POSSIBLE-ANTECEDENTS");
        $kw34$MAX_SUFFICIENT_RECENTNESS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeKeyword("MAX-SUFFICIENT-RECENTNESS-FOR-GENDERED-PRONOUN");
        $kw35$MAX_POSSIBLE_ANTECEDENTS_FOR_GENDERED_PRONOUN = SubLObjectFactory.makeKeyword("MAX-POSSIBLE-ANTECEDENTS-FOR-GENDERED-PRONOUN");
        $kw36$REFERENCE_NOTE_HASH = SubLObjectFactory.makeKeyword("REFERENCE-NOTE-HASH");
        $kw37$RECENT_REFERENCES = SubLObjectFactory.makeKeyword("RECENT-REFERENCES");
        $kw38$SENTENCES = SubLObjectFactory.makeKeyword("SENTENCES");
        $str39$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym41$MAKE_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT = SubLObjectFactory.makeSymbol("MAKE-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT");
        $kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw43$END = SubLObjectFactory.makeKeyword("END");
        $sym44$VISIT_DEFSTRUCT_OBJECT_COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_ME = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-METHOD");
        $sym45$STANFORD_PARSER = SubLObjectFactory.makeSymbol("STANFORD-PARSER");
        $kw46$CODE = SubLObjectFactory.makeKeyword("CODE");
        $int47$50 = SubLObjectFactory.makeInteger(50);
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-REFERENCES-VAR"));
        $sym49$COREF_DISCOURSE_VAR = SubLObjectFactory.makeUninternedSymbol("COREF-DISCOURSE-VAR");
        $sym50$REFERENCE_VAR = SubLObjectFactory.makeUninternedSymbol("REFERENCE-VAR");
        $sym51$RECENT_REFERENCES_VAR = SubLObjectFactory.makeUninternedSymbol("RECENT-REFERENCES-VAR");
        $sym52$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym53$DO_PARSE_TREE_SUBTREES = SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES");
        $list54 = ConsesLow.list((SubLObject)coreference_resolution.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("PRP$"))), (SubLObject)SubLObjectFactory.makeKeyword("DFL2R"));
        $sym55$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym56$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym57$NP_TREE_P = SubLObjectFactory.makeSymbol("NP-TREE-P");
        $sym58$IS_THE_ONLY_HEAD_DAUGHTER_OF_AN_NP_ = SubLObjectFactory.makeSymbol("IS-THE-ONLY-HEAD-DAUGHTER-OF-AN-NP?");
        $sym59$RESOLVE_REFERENCE = SubLObjectFactory.makeSymbol("RESOLVE-REFERENCE");
        $sym60$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym61$PARSE_TREE_P = SubLObjectFactory.makeSymbol("PARSE-TREE-P");
        $str62$_S_is_not_valid_input_for_the_cor = SubLObjectFactory.makeString("~S is not valid input for the coreference resolution module.");
        $kw63$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str64$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym65$INPUT_STREAM_P = SubLObjectFactory.makeSymbol("INPUT-STREAM-P");
        $sym66$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str67$Got_invalid_parse_result_for__S__ = SubLObjectFactory.makeString("Got invalid parse result for ~S: ~S");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("PRP$"));
        $kw69$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $kw70$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $str71$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $kw72$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym73$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym74$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym75$REFERENT_STRUCT_REFERENCES = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-REFERENCES");
        $sym76$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym77$GET_MOTHER = SubLObjectFactory.makeSymbol("GET-MOTHER");
        $sym78$GET_HEAD_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS");
        $kw79$POSSIBLE_ANAPHOR_ = SubLObjectFactory.makeKeyword("POSSIBLE-ANAPHOR?");
        $kw80$POSSIBLE_ANTECEDENT_ = SubLObjectFactory.makeKeyword("POSSIBLE-ANTECEDENT?");
        $kw81$STANDARD_ANAPHOR = SubLObjectFactory.makeKeyword("STANDARD-ANAPHOR");
        $sym82$GET_ANCESTORS = SubLObjectFactory.makeSymbol("GET-ANCESTORS");
        $kw83$POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeKeyword("POSSIBLE-ANTECEDENTS");
        $kw84$LIKELY_ANTECEDENTS = SubLObjectFactory.makeKeyword("LIKELY-ANTECEDENTS");
        $kw85$BEST_ANTECEDENT = SubLObjectFactory.makeKeyword("BEST-ANTECEDENT");
        $kw86$FUNCTIONAL_DEPENDENCY = SubLObjectFactory.makeKeyword("FUNCTIONAL-DEPENDENCY");
        $kw87$ANAPHOR_WITH_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeKeyword("ANAPHOR-WITH-POSSIBLE-ANTECEDENTS");
        $kw88$ANAPHOR_WITH_NO_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeKeyword("ANAPHOR-WITH-NO-POSSIBLE-ANTECEDENTS");
        $kw89$NON_ANAPHOR_POSSIBLE_ANTECEDENT = SubLObjectFactory.makeKeyword("NON-ANAPHOR-POSSIBLE-ANTECEDENT");
        $kw90$NON_ANAPHOR_IMPOSSIBLE_ANTECEDENT = SubLObjectFactory.makeKeyword("NON-ANAPHOR-IMPOSSIBLE-ANTECEDENT");
        $kw91$KB = SubLObjectFactory.makeKeyword("KB");
        $str92$The__KB_implementation_of_corefer = SubLObjectFactory.makeString("The :KB implementation of coreference resolution doesn't exist yet");
        $str93$Don_t_know_about__S_implementatio = SubLObjectFactory.makeString("Don't know about ~S implementation of coreference resolution.");
        $kw94$DONT_KNOW_YET = SubLObjectFactory.makeKeyword("DONT-KNOW-YET");
        $sym95$REFERENCE_POSSIBLE_ANAPHOR__CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-POSSIBLE-ANAPHOR?-CALCULATE");
        $sym96$REFERENCE_POSSIBLE_ANTECEDENT__CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-POSSIBLE-ANTECEDENT?-CALCULATE");
        $sym97$REFERENCE_POSSIBLE_ANTECEDENTS_CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-POSSIBLE-ANTECEDENTS-CALCULATE");
        $sym98$REFERENCE_LIKELY_ANTECEDENTS_CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-LIKELY-ANTECEDENTS-CALCULATE");
        $sym99$REFERENCE_BEST_ANTECEDENT_CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-BEST-ANTECEDENT-CALCULATE");
        $sym100$REFERENCE_FUNCTIONAL_DEPENDENCY_CALCULATE = SubLObjectFactory.makeSymbol("REFERENCE-FUNCTIONAL-DEPENDENCY-CALCULATE");
        $str101$Don_t_know_how_to_calculate_refer = SubLObjectFactory.makeString("Don't know how to calculate reference slot: ~S");
        $str102$Don_t_know_how_to_get_reference_s = SubLObjectFactory.makeString("Don't know how to get reference slot: ~S");
        $str103$Don_t_know_how_to_set_reference_s = SubLObjectFactory.makeString("Don't know how to set reference slot: ~S");
        $sym104$REFERENCE_INFO = SubLObjectFactory.makeSymbol("REFERENCE-INFO");
        $sym105$REFERENCE_INFO_P = SubLObjectFactory.makeSymbol("REFERENCE-INFO-P");
        $list106 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INDEX-NUMBER"), SubLObjectFactory.makeSymbol("TREE"), SubLObjectFactory.makeSymbol("CYCLS"), SubLObjectFactory.makeSymbol("POSSIBLE-ANTECEDENT?"), SubLObjectFactory.makeSymbol("POSSIBLE-ANAPHOR?"), SubLObjectFactory.makeSymbol("POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("LIKELY-ANTECEDENTS"), SubLObjectFactory.makeSymbol("BEST-ANTECEDENT"), SubLObjectFactory.makeSymbol("FUNCTIONAL-DEPENDENCY"), SubLObjectFactory.makeSymbol("REFERENT") });
        $list107 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INDEX-NUMBER"), SubLObjectFactory.makeKeyword("TREE"), SubLObjectFactory.makeKeyword("CYCLS"), SubLObjectFactory.makeKeyword("POSSIBLE-ANTECEDENT?"), SubLObjectFactory.makeKeyword("POSSIBLE-ANAPHOR?"), SubLObjectFactory.makeKeyword("POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeKeyword("LIKELY-ANTECEDENTS"), SubLObjectFactory.makeKeyword("BEST-ANTECEDENT"), SubLObjectFactory.makeKeyword("FUNCTIONAL-DEPENDENCY"), SubLObjectFactory.makeKeyword("REFERENT") });
        $list108 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("REFERENCE-INFO-INDEX-NUMBER"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-TREE"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-CYCLS"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENT?"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANAPHOR?"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-LIKELY-ANTECEDENTS"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-BEST-ANTECEDENT"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-FUNCTIONAL-DEPENDENCY"), SubLObjectFactory.makeSymbol("REFERENCE-INFO-REFERENT") });
        $list109 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-INDEX-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-TREE"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-CYCLS"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-BEST-ANTECEDENT"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY"), SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-REFERENT") });
        $sym110$PRINT_REFERENCE_INFO = SubLObjectFactory.makeSymbol("PRINT-REFERENCE-INFO");
        $sym111$REFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENCE-INFO-P"));
        $sym113$REFERENCE_INFO_INDEX_NUMBER = SubLObjectFactory.makeSymbol("REFERENCE-INFO-INDEX-NUMBER");
        $sym114$_CSETF_REFERENCE_INFO_INDEX_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-INDEX-NUMBER");
        $sym115$REFERENCE_INFO_TREE = SubLObjectFactory.makeSymbol("REFERENCE-INFO-TREE");
        $sym116$_CSETF_REFERENCE_INFO_TREE = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-TREE");
        $sym117$REFERENCE_INFO_CYCLS = SubLObjectFactory.makeSymbol("REFERENCE-INFO-CYCLS");
        $sym118$_CSETF_REFERENCE_INFO_CYCLS = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-CYCLS");
        $sym119$REFERENCE_INFO_POSSIBLE_ANTECEDENT_ = SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENT?");
        $sym120$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENT_ = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENT?");
        $sym121$REFERENCE_INFO_POSSIBLE_ANAPHOR_ = SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANAPHOR?");
        $sym122$_CSETF_REFERENCE_INFO_POSSIBLE_ANAPHOR_ = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANAPHOR?");
        $sym123$REFERENCE_INFO_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeSymbol("REFERENCE-INFO-POSSIBLE-ANTECEDENTS");
        $sym124$_CSETF_REFERENCE_INFO_POSSIBLE_ANTECEDENTS = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-POSSIBLE-ANTECEDENTS");
        $sym125$REFERENCE_INFO_LIKELY_ANTECEDENTS = SubLObjectFactory.makeSymbol("REFERENCE-INFO-LIKELY-ANTECEDENTS");
        $sym126$_CSETF_REFERENCE_INFO_LIKELY_ANTECEDENTS = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-LIKELY-ANTECEDENTS");
        $sym127$REFERENCE_INFO_BEST_ANTECEDENT = SubLObjectFactory.makeSymbol("REFERENCE-INFO-BEST-ANTECEDENT");
        $sym128$_CSETF_REFERENCE_INFO_BEST_ANTECEDENT = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-BEST-ANTECEDENT");
        $sym129$REFERENCE_INFO_FUNCTIONAL_DEPENDENCY = SubLObjectFactory.makeSymbol("REFERENCE-INFO-FUNCTIONAL-DEPENDENCY");
        $sym130$_CSETF_REFERENCE_INFO_FUNCTIONAL_DEPENDENCY = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-FUNCTIONAL-DEPENDENCY");
        $sym131$REFERENCE_INFO_REFERENT = SubLObjectFactory.makeSymbol("REFERENCE-INFO-REFERENT");
        $sym132$_CSETF_REFERENCE_INFO_REFERENT = SubLObjectFactory.makeSymbol("_CSETF-REFERENCE-INFO-REFERENT");
        $kw133$INDEX_NUMBER = SubLObjectFactory.makeKeyword("INDEX-NUMBER");
        $kw134$TREE = SubLObjectFactory.makeKeyword("TREE");
        $kw135$CYCLS = SubLObjectFactory.makeKeyword("CYCLS");
        $kw136$REFERENT = SubLObjectFactory.makeKeyword("REFERENT");
        $sym137$MAKE_REFERENCE_INFO = SubLObjectFactory.makeSymbol("MAKE-REFERENCE-INFO");
        $sym138$VISIT_DEFSTRUCT_OBJECT_REFERENCE_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFERENCE-INFO-METHOD");
        $str139$_S = SubLObjectFactory.makeString("~S");
        $sym140$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $const141$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw142$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const143$Ungendered_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"));
        $const144$Neuter_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Neuter-NLAttr"));
        $const145$Masculine_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Masculine-NLAttr"));
        $const146$MaleHuman = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleHuman"));
        $const147$Feminine_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Feminine-NLAttr"));
        $const148$FemaleHuman = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman"));
        $str149$Didn_t_know_there_was_such_a_gend = SubLObjectFactory.makeString("Didn't know there was such a gender as ~S!");
        $sym150$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $sym151$_REFERENT = SubLObjectFactory.makeSymbol("?REFERENT");
        $sym152$POSSIBLY_CYCLIFIER_REFERENT_STAND_IN = SubLObjectFactory.makeSymbol("POSSIBLY-CYCLIFIER-REFERENT-STAND-IN");
        $const153$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $const154$CollectionDifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn"));
        $const155$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $const156$UnmarkedNumber_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnmarkedNumber-NLAttr"));
        $const157$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $const158$Group = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group"));
        $sym159$GET_NUMBER = SubLObjectFactory.makeSymbol("GET-NUMBER");
        $kw160$SINGULAR = SubLObjectFactory.makeKeyword("SINGULAR");
        $kw161$PLURAL = SubLObjectFactory.makeKeyword("PLURAL");
        $const162$Plural_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $str163$Don_t_know_about_the_number__S = SubLObjectFactory.makeString("Don't know about the number ~S");
        $sym164$GET_GENDER = SubLObjectFactory.makeSymbol("GET-GENDER");
        $kw165$MASCULINE = SubLObjectFactory.makeKeyword("MASCULINE");
        $kw166$FEMININE = SubLObjectFactory.makeKeyword("FEMININE");
        $kw167$NEUTER = SubLObjectFactory.makeKeyword("NEUTER");
        $str168$Don_t_know_about_the_gender__S = SubLObjectFactory.makeString("Don't know about the gender ~S");
        $sym169$REFERENT_STRUCT = SubLObjectFactory.makeSymbol("REFERENT-STRUCT");
        $sym170$REFERENT_STRUCT_P = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-P");
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFERENCES"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALS"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("FACTS"), (SubLObject)SubLObjectFactory.makeSymbol("GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"));
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REFERENCES"), (SubLObject)SubLObjectFactory.makeKeyword("EQUALS"), (SubLObject)SubLObjectFactory.makeKeyword("TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("FACTS"), (SubLObject)SubLObjectFactory.makeKeyword("GENDER"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"));
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-REFERENCES"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-EQUALS"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-FACTS"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-NUMBER"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-REFERENCES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-EQUALS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-FACTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-NUMBER"));
        $sym175$PRINT_REFERENT_STRUCT = SubLObjectFactory.makeSymbol("PRINT-REFERENT-STRUCT");
        $sym176$REFERENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENT-STRUCT-P"));
        $sym178$_CSETF_REFERENT_STRUCT_REFERENCES = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-REFERENCES");
        $sym179$REFERENT_STRUCT_EQUALS = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-EQUALS");
        $sym180$_CSETF_REFERENT_STRUCT_EQUALS = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-EQUALS");
        $sym181$REFERENT_STRUCT_TYPES = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-TYPES");
        $sym182$_CSETF_REFERENT_STRUCT_TYPES = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-TYPES");
        $sym183$REFERENT_STRUCT_FACTS = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-FACTS");
        $sym184$_CSETF_REFERENT_STRUCT_FACTS = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-FACTS");
        $sym185$REFERENT_STRUCT_GENDER = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-GENDER");
        $sym186$_CSETF_REFERENT_STRUCT_GENDER = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-GENDER");
        $sym187$REFERENT_STRUCT_NUMBER = SubLObjectFactory.makeSymbol("REFERENT-STRUCT-NUMBER");
        $sym188$_CSETF_REFERENT_STRUCT_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-REFERENT-STRUCT-NUMBER");
        $kw189$REFERENCES = SubLObjectFactory.makeKeyword("REFERENCES");
        $kw190$EQUALS = SubLObjectFactory.makeKeyword("EQUALS");
        $kw191$TYPES = SubLObjectFactory.makeKeyword("TYPES");
        $kw192$FACTS = SubLObjectFactory.makeKeyword("FACTS");
        $kw193$GENDER = SubLObjectFactory.makeKeyword("GENDER");
        $kw194$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $sym195$MAKE_REFERENT_STRUCT = SubLObjectFactory.makeSymbol("MAKE-REFERENT-STRUCT");
        $sym196$VISIT_DEFSTRUCT_OBJECT_REFERENT_STRUCT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFERENT-STRUCT-METHOD");
        $str197$Equals___S__ = SubLObjectFactory.makeString("Equals: ~S~%");
        $str198$Types___S__ = SubLObjectFactory.makeString("Types: ~S~%");
        $str199$Facts___S__ = SubLObjectFactory.makeString("Facts: ~S~%");
        $str200$Gender___S__ = SubLObjectFactory.makeString("Gender: ~S~%");
        $str201$Number___S__ = SubLObjectFactory.makeString("Number: ~S~%");
        $str202$References___ = SubLObjectFactory.makeString("References: (");
        $str203$_S_ = SubLObjectFactory.makeString("~S ");
        $str204$_ = SubLObjectFactory.makeString(")");
        $const205$Generic_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Generic-NLAttr"));
        $kw206$NON_ANAPHOR = SubLObjectFactory.makeKeyword("NON-ANAPHOR");
        $kw207$ANAPHOR_RESOLVING_TO_BACKGROUND_KNOWLEDGE = SubLObjectFactory.makeKeyword("ANAPHOR-RESOLVING-TO-BACKGROUND-KNOWLEDGE");
        $kw208$LIKELY_ACCOMODATABLE_ANAPHOR = SubLObjectFactory.makeKeyword("LIKELY-ACCOMODATABLE-ANAPHOR");
        $sym209$RESTRICTIVE_CLAUSE_TREE_P = SubLObjectFactory.makeSymbol("RESTRICTIVE-CLAUSE-TREE-P");
        $str210$that = SubLObjectFactory.makeString("that");
        $sym211$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym212$OF_PP_TREE_P = SubLObjectFactory.makeSymbol("OF-PP-TREE-P");
        $str213$of = SubLObjectFactory.makeString("of");
        $sym214$GET_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER");
        $kw215$PRP_ = SubLObjectFactory.makeKeyword("PRP$");
        $sym216$POSSESSIVE_P = SubLObjectFactory.makeSymbol("POSSESSIVE-P");
        $kw217$DT = SubLObjectFactory.makeKeyword("DT");
        $sym218$KB_DEMONSTRATIVE_NL_ATTR_P = SubLObjectFactory.makeSymbol("KB-DEMONSTRATIVE-NL-ATTR-P");
        $const219$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $const220$Demonstrative_NLAttrType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Demonstrative-NLAttrType"));
        $const221$Definite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $sym222$DEFINITE_DESCRIPTION_P = SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P");
        $sym223$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $const224$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"));
        $const225$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $sym226$GET_PERSON = SubLObjectFactory.makeSymbol("GET-PERSON");
        $sym227$REFERENCE_POSSIBLY_REFERS_TO__CODE = SubLObjectFactory.makeSymbol("REFERENCE-POSSIBLY-REFERS-TO?-CODE");
        $sym228$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const229$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const230$fewIfAny = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fewIfAny"));
        $const231$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw232$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $const233$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const234$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const235$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const236$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym237$REFERENCE_LIKELY_REFERS_TO__CODE = SubLObjectFactory.makeSymbol("REFERENCE-LIKELY-REFERS-TO?-CODE");
        $const238$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym239$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $const240$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const241$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $const242$relationExistsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $list243 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)coreference_resolution.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)coreference_resolution.ONE_INTEGER);
        $const244$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const245$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str246$Don_t_know_what_category_of_refer = SubLObjectFactory.makeString("Don't know what category of reference ~S is");
        $int247$30 = SubLObjectFactory.makeInteger(30);
        $const248$CycNounLearnerLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycNounLearnerLexicalMt"));
        $const249$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $const250$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $sym251$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $int252$100 = SubLObjectFactory.makeInteger(100);
        $int253$5000 = SubLObjectFactory.makeInteger(5000);
        $kw254$NP = SubLObjectFactory.makeKeyword("NP");
        $const255$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $kw256$VB = SubLObjectFactory.makeKeyword("VB");
        $kw257$VBD = SubLObjectFactory.makeKeyword("VBD");
        $kw258$VBG = SubLObjectFactory.makeKeyword("VBG");
        $kw259$VBN = SubLObjectFactory.makeKeyword("VBN");
        $kw260$VBP = SubLObjectFactory.makeKeyword("VBP");
        $kw261$VBZ = SubLObjectFactory.makeKeyword("VBZ");
        $const262$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $kw263$NN = SubLObjectFactory.makeKeyword("NN");
        $kw264$NNS = SubLObjectFactory.makeKeyword("NNS");
        $kw265$NNP = SubLObjectFactory.makeKeyword("NNP");
        $kw266$NNPS = SubLObjectFactory.makeKeyword("NNPS");
        $const267$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $kw268$PRP = SubLObjectFactory.makeKeyword("PRP");
        $kw269$PDT = SubLObjectFactory.makeKeyword("PDT");
        $kw270$EX = SubLObjectFactory.makeKeyword("EX");
        $const271$There_Existential = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("There-Existential"));
        $kw272$QP = SubLObjectFactory.makeKeyword("QP");
        $kw273$ANY = SubLObjectFactory.makeKeyword("ANY");
        $str274$Don_t_know_the_POS_category_for__ = SubLObjectFactory.makeString("Don't know the POS category for ~S");
        $list275 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("mr"), SubLObjectFactory.makeString("mrs"), SubLObjectFactory.makeString("miss"), SubLObjectFactory.makeString("ms"), SubLObjectFactory.makeString("dr"), SubLObjectFactory.makeString("prof"), SubLObjectFactory.makeString("cpt"), SubLObjectFactory.makeString("pfc"), SubLObjectFactory.makeString("sgt"), SubLObjectFactory.makeString("rev"), SubLObjectFactory.makeString("lt"), SubLObjectFactory.makeString("sir"), SubLObjectFactory.makeString("adm"), SubLObjectFactory.makeString("col"), SubLObjectFactory.makeString("cpl"), SubLObjectFactory.makeString("gen"), SubLObjectFactory.makeString("brig") });
        $const276$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $list277 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")));
        $kw278$MASC = SubLObjectFactory.makeKeyword("MASC");
        $kw279$FEM = SubLObjectFactory.makeKeyword("FEM");
        $const280$NLDefinitenessFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn"));
        $const281$NLNumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn"));
        $sym282$KB_NL_DEFINITENESS_ATTRIBUTE_P = SubLObjectFactory.makeSymbol("KB-NL-DEFINITENESS-ATTRIBUTE-P");
        $kw283$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str284$_cyc_top_data_nl_coreference_test = SubLObjectFactory.makeString("/cyc/top/data/nl/coreference-test-cases/nachos.txt");
        $str285$____Sentence____S__ = SubLObjectFactory.makeString("~%~%Sentence:  ~S~%");
        $str286$____Not_parsed_ = SubLObjectFactory.makeString("~%~%Not parsed.");
        $str287$____Reference___S____Cycls___S___ = SubLObjectFactory.makeString("~%~%Reference: ~S~%~%Cycls: ~S~%~%");
        $str288$Best_antecedent__ = SubLObjectFactory.makeString("Best antecedent: ");
        $str289$__Likely_antecedents__ = SubLObjectFactory.makeString("~%Likely antecedents: ");
        $str290$None___ = SubLObjectFactory.makeString("None.~%");
        $str291$____________________ = SubLObjectFactory.makeString("                    ");
        $str292$__Possible_antecedents__ = SubLObjectFactory.makeString("~%Possible antecedents: ");
        $str293$______________________ = SubLObjectFactory.makeString("                      ");
        $str294$Anaphor_with_no_possible_antecede = SubLObjectFactory.makeString("Anaphor with no possible antecedents.~%~%Functional dependency: ~S~%");
        $str295$Not_an_anaphor___ = SubLObjectFactory.makeString("Not an anaphor.~%");
        $str296$Anaphor_resolving_to_background_k = SubLObjectFactory.makeString("Anaphor resolving to background knowledge.~%");
        $str297$Likely_accomodatable_anaphor___ = SubLObjectFactory.makeString("Likely accomodatable anaphor.~%");
        $str298$Got_unexpected_value_from_REFEREN = SubLObjectFactory.makeString("Got unexpected value from REFERENCE-INFO-POSSIBLE-ANAPHOR?: ~S~%");
        $str299$_ = SubLObjectFactory.makeString("{");
        $str300$____ = SubLObjectFactory.makeString(" }~%");
        $str301$__S = SubLObjectFactory.makeString(" ~S");
        $str302$100_ = SubLObjectFactory.makeString("100%");
        $str303$sent = SubLObjectFactory.makeString("sent");
        $str304$Sentence___ = SubLObjectFactory.makeString("Sentence:  ");
        $str305$Show = SubLObjectFactory.makeString("Show");
        $str306$Hide = SubLObjectFactory.makeString("Hide");
        $kw307$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw308$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str309$Not_parsed_ = SubLObjectFactory.makeString("Not parsed.");
        $str310$parses = SubLObjectFactory.makeString("parses");
        $str311$more = SubLObjectFactory.makeString("more");
        $str312$Reference___S = SubLObjectFactory.makeString("Reference: ~S");
        $str313$Parses_ = SubLObjectFactory.makeString("Parses:");
        $kw314$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $str315$Show_more = SubLObjectFactory.makeString("Show more");
        $str316$Likely_antecedents__ = SubLObjectFactory.makeString("Likely antecedents: ");
        $str317$None_ = SubLObjectFactory.makeString("None.");
        $str318$Possible_antecedents__ = SubLObjectFactory.makeString("Possible antecedents: ");
        $str319$Anaphor_with_no_possible_antecede = SubLObjectFactory.makeString("Anaphor with no possible antecedents.");
        $str320$Functional_dependency__ = SubLObjectFactory.makeString("Functional dependency: ");
        $str321$Not_an_anaphor_ = SubLObjectFactory.makeString("Not an anaphor.");
        $str322$Anaphor_resolving_to_background_k = SubLObjectFactory.makeString("Anaphor resolving to background knowledge.");
        $str323$Likely_accomodatable_anaphor_ = SubLObjectFactory.makeString("Likely accomodatable anaphor.");
        $str324$Got_unexpected_value_from_REFEREN = SubLObjectFactory.makeString("Got unexpected value from REFERENCE-INFO-POSSIBLE-ANAPHOR?: ~S");
        $str325$__ = SubLObjectFactory.makeString(" }");
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"));
        $str327$Related_to__S_via_ = SubLObjectFactory.makeString("Related to ~S via ");
        $str328$Don_t_recognize__S_as_a_functiona = SubLObjectFactory.makeString("Don't recognize ~S as a functional dependency");
    }
    
    public static final class $coreference_resolution_discourse_struct_native extends SubLStructNative
    {
        public SubLObject $implementation;
        public SubLObject $parser;
        public SubLObject $use_pspP;
        public SubLObject $max_sufficient_recentness;
        public SubLObject $max_possible_antecedents;
        public SubLObject $max_sufficient_recentness_for_gendered_pronoun;
        public SubLObject $max_possible_antecedents_for_gendered_pronoun;
        public SubLObject $reference_note_hash;
        public SubLObject $recent_references;
        public SubLObject $sentences;
        private static final SubLStructDeclNative structDecl;
        
        public $coreference_resolution_discourse_struct_native() {
            this.$implementation = (SubLObject)CommonSymbols.NIL;
            this.$parser = (SubLObject)CommonSymbols.NIL;
            this.$use_pspP = (SubLObject)CommonSymbols.NIL;
            this.$max_sufficient_recentness = (SubLObject)CommonSymbols.NIL;
            this.$max_possible_antecedents = (SubLObject)CommonSymbols.NIL;
            this.$max_sufficient_recentness_for_gendered_pronoun = (SubLObject)CommonSymbols.NIL;
            this.$max_possible_antecedents_for_gendered_pronoun = (SubLObject)CommonSymbols.NIL;
            this.$reference_note_hash = (SubLObject)CommonSymbols.NIL;
            this.$recent_references = (SubLObject)CommonSymbols.NIL;
            this.$sentences = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$coreference_resolution_discourse_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$implementation;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$parser;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$use_pspP;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$max_sufficient_recentness;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$max_possible_antecedents;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$max_sufficient_recentness_for_gendered_pronoun;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$max_possible_antecedents_for_gendered_pronoun;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$reference_note_hash;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$recent_references;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$sentences;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$implementation = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$parser = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$use_pspP = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$max_sufficient_recentness = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$max_possible_antecedents = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$max_sufficient_recentness_for_gendered_pronoun = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$max_possible_antecedents_for_gendered_pronoun = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$reference_note_hash = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$recent_references = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$sentences = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$coreference_resolution_discourse_struct_native.class, coreference_resolution.$sym0$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT, coreference_resolution.$sym1$COREFERENCE_RESOLUTION_DISCOURSE_STRUCT_P, coreference_resolution.$list2, coreference_resolution.$list3, new String[] { "$implementation", "$parser", "$use_pspP", "$max_sufficient_recentness", "$max_possible_antecedents", "$max_sufficient_recentness_for_gendered_pronoun", "$max_possible_antecedents_for_gendered_pronoun", "$reference_note_hash", "$recent_references", "$sentences" }, coreference_resolution.$list4, coreference_resolution.$list5, coreference_resolution.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $coreference_resolution_discourse_struct_p$UnaryFunction extends UnaryFunction
    {
        public $coreference_resolution_discourse_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COREFERENCE-RESOLUTION-DISCOURSE-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return coreference_resolution.coreference_resolution_discourse_struct_p(arg1);
        }
    }
    
    public static final class $reference_info_native extends SubLStructNative
    {
        public SubLObject $index_number;
        public SubLObject $tree;
        public SubLObject $cycls;
        public SubLObject $possible_antecedentP;
        public SubLObject $possible_anaphorP;
        public SubLObject $possible_antecedents;
        public SubLObject $likely_antecedents;
        public SubLObject $best_antecedent;
        public SubLObject $functional_dependency;
        public SubLObject $referent;
        private static final SubLStructDeclNative structDecl;
        
        public $reference_info_native() {
            this.$index_number = (SubLObject)CommonSymbols.NIL;
            this.$tree = (SubLObject)CommonSymbols.NIL;
            this.$cycls = (SubLObject)CommonSymbols.NIL;
            this.$possible_antecedentP = (SubLObject)CommonSymbols.NIL;
            this.$possible_anaphorP = (SubLObject)CommonSymbols.NIL;
            this.$possible_antecedents = (SubLObject)CommonSymbols.NIL;
            this.$likely_antecedents = (SubLObject)CommonSymbols.NIL;
            this.$best_antecedent = (SubLObject)CommonSymbols.NIL;
            this.$functional_dependency = (SubLObject)CommonSymbols.NIL;
            this.$referent = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$reference_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$index_number;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tree;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$cycls;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$possible_antecedentP;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$possible_anaphorP;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$possible_antecedents;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$likely_antecedents;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$best_antecedent;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$functional_dependency;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$referent;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$index_number = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tree = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$cycls = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$possible_antecedentP = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$possible_anaphorP = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$possible_antecedents = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$likely_antecedents = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$best_antecedent = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$functional_dependency = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$referent = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$reference_info_native.class, coreference_resolution.$sym104$REFERENCE_INFO, coreference_resolution.$sym105$REFERENCE_INFO_P, coreference_resolution.$list106, coreference_resolution.$list107, new String[] { "$index_number", "$tree", "$cycls", "$possible_antecedentP", "$possible_anaphorP", "$possible_antecedents", "$likely_antecedents", "$best_antecedent", "$functional_dependency", "$referent" }, coreference_resolution.$list108, coreference_resolution.$list109, coreference_resolution.$sym110$PRINT_REFERENCE_INFO);
        }
    }
    
    public static final class $reference_info_p$UnaryFunction extends UnaryFunction
    {
        public $reference_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REFERENCE-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return coreference_resolution.reference_info_p(arg1);
        }
    }
    
    public static final class $referent_struct_native extends SubLStructNative
    {
        public SubLObject $references;
        public SubLObject $equals;
        public SubLObject $types;
        public SubLObject $facts;
        public SubLObject $gender;
        public SubLObject $number;
        private static final SubLStructDeclNative structDecl;
        
        public $referent_struct_native() {
            this.$references = (SubLObject)CommonSymbols.NIL;
            this.$equals = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$facts = (SubLObject)CommonSymbols.NIL;
            this.$gender = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$referent_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$references;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$equals;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$types;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$facts;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$gender;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$number;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$references = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$equals = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$types = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$facts = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$gender = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$number = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$referent_struct_native.class, coreference_resolution.$sym169$REFERENT_STRUCT, coreference_resolution.$sym170$REFERENT_STRUCT_P, coreference_resolution.$list171, coreference_resolution.$list172, new String[] { "$references", "$equals", "$types", "$facts", "$gender", "$number" }, coreference_resolution.$list173, coreference_resolution.$list174, coreference_resolution.$sym175$PRINT_REFERENT_STRUCT);
        }
    }
    
    public static final class $referent_struct_p$UnaryFunction extends UnaryFunction
    {
        public $referent_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REFERENT-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return coreference_resolution.referent_struct_p(arg1);
        }
    }
}

/*

	Total time: 1165 ms
	
*/