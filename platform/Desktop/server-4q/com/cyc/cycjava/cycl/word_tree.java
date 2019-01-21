package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class word_tree extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.word_tree";
    public static final String myFingerPrint = "7282bbb6a9cc391a36c719dd41f736cfe6c122167024969a23e42e63efbb71c9";
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24156L)
    private static SubLSymbol $singular_personal_pronouns$;
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24254L)
    private static SubLSymbol $plural_personal_pronouns$;
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39547L)
    public static SubLSymbol $to_be_forms$;
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54731L)
    public static SubLSymbol $singular_possessive_pronouns$;
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54820L)
    public static SubLSymbol $plural_possessive_pronouns$;
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59355L)
    private static SubLSymbol $category_to_word$;
    private static final SubLSymbol $sym0$WORD_TREE;
    private static final SubLSymbol $sym1$PARSE_TREE;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$ABS_IDX;
    private static final SubLSymbol $sym5$REFS;
    private static final SubLSymbol $sym6$LEXES;
    private static final SubLSymbol $sym7$MODIFIED_DEPENDENT_MEANING_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GET;
    private static final SubLSymbol $kw11$SEMTRANS;
    private static final SubLSymbol $kw12$REPLACE;
    private static final SubLSymbol $sym13$GET_RANKED_LEXES;
    private static final SubLSymbol $sym14$WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD;
    private static final SubLSymbol $sym15$PP_COMP_FILTER_LEXES;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym18$GET_PP_COMPLEMENT;
    private static final SubLSymbol $sym19$GET_HEAD;
    private static final SubLSymbol $kw20$FRAME;
    private static final SubLObject $const21$PPCompFrame;
    private static final SubLObject $const22$EverythingPSC;
    private static final SubLObject $const23$Preposition;
    private static final SubLSymbol $sym24$GET_STRING;
    private static final SubLSymbol $sym25$WORD_TREE_PP_COMP_FILTER_LEXES_METHOD;
    private static final SubLSymbol $sym26$FRAME_FILTER_LEXES;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym29$TREE_KEYWORD_EQ_CLASSES;
    private static final SubLInteger $int30$_5;
    private static final SubLSymbol $sym31$WORD_TREE_FRAME_FILTER_LEXES_METHOD;
    private static final SubLSymbol $sym32$POS_FILTER_LEXES;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym35$GET_CATEGORY;
    private static final SubLSymbol $kw36$PENN_TAGS;
    private static final SubLSymbol $kw37$BACKOFF_PENN_TAGS;
    private static final SubLFloat $float38$0_75;
    private static final SubLSymbol $sym39$WORD_TREE_POS_FILTER_LEXES_METHOD;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$CAR;
    private static final SubLSymbol $sym42$GET_KEYWORD_RENAMINGS;
    private static final SubLSymbol $sym43$WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD;
    private static final SubLSymbol $sym44$CYCLIFY_NUCLEUS;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$PARTITION_SEMANTIC_COMPLEMENTS;
    private static final SubLSymbol $sym48$CYCLIFY_INT;
    private static final SubLSymbol $sym49$GET_MODIFIERS;
    private static final SubLSymbol $sym50$INSTANTIATE_SCOPE;
    private static final SubLSymbol $sym51$WORD_TREE_CYCLIFY_NUCLEUS_METHOD;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$WORD_TREE_CYCLIFY_INT_METHOD;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$GET_SEMANTIC_COMPLEMENTS;
    private static final SubLSymbol $sym59$WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$GET_COMPLEMENTS;
    private static final SubLSymbol $sym63$WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD;
    private static final SubLSymbol $sym64$GET_OBLIQUE_OBJECT;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$WORD_TREE_GET_OBLIQUE_OBJECT_METHOD;
    private static final SubLList $list67;
    private static final SubLSymbol $kw68$OBLIQUE_OBJECT;
    private static final SubLList $list69;
    private static final SubLString $str70$of;
    private static final SubLSymbol $sym71$GET_PPS;
    private static final SubLSymbol $sym72$WORD_TREE_GET_PP_COMPLEMENT_METHOD;
    private static final SubLSymbol $sym73$OBJECT;
    private static final SubLSymbol $sym74$INSTANCE_COUNT;
    private static final SubLSymbol $sym75$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS;
    private static final SubLSymbol $sym76$ISOLATED_P;
    private static final SubLSymbol $sym77$INSTANCE_NUMBER;
    private static final SubLSymbol $sym78$STRING;
    private static final SubLSymbol $sym79$CATEGORY;
    private static final SubLSymbol $sym80$MOTHER;
    private static final SubLSymbol $sym81$IDX;
    private static final SubLSymbol $sym82$MODIFIERS;
    private static final SubLSymbol $sym83$CONTEXT;
    private static final SubLSymbol $sym84$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym85$PARSE_TREE_CONTEXT;
    private static final SubLSymbol $sym86$NEW_VARIABLE;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym89$WORD_TREE_GET_STRING_METHOD;
    private static final SubLSymbol $sym90$GET_ABS_INDEX;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym93$WORD_TREE_GET_ABS_INDEX_METHOD;
    private static final SubLSymbol $sym94$GET_LEXES;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$WORD_TREE_GET_LEXES_METHOD;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym99$WORD_TREE_GET_RANKED_LEXES_METHOD;
    private static final SubLSymbol $sym100$GET_REFS;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$WORD_TREE_GET_REFS_METHOD;
    private static final SubLSymbol $sym104$SET_REFS;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym108$WORD_TREE_SET_REFS_METHOD;
    private static final SubLSymbol $sym109$YIELD;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$WORD_TREE_YIELD_METHOD;
    private static final SubLSymbol $sym112$GET_PARSE_EXPRESSION;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$WORD_TREE_GET_PARSE_EXPRESSION_METHOD;
    private static final SubLSymbol $sym115$GET_HEADS;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$WORD_TREE_GET_HEADS_METHOD;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$WORD_TREE_GET_HEAD_METHOD;
    private static final SubLSymbol $sym120$GET_SEMANTIC_HEADS;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$WORD_TREE_GET_SEMANTIC_HEADS_METHOD;
    private static final SubLSymbol $sym123$LEXIFY_INT;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$PARTICLE_FILTER_LEXES;
    private static final SubLSymbol $sym128$RLE_SEM_EQUAL;
    private static final SubLSymbol $sym129$FABRICATION_FORBIDDEN_;
    private static final SubLSymbol $sym130$FABRICATE;
    private static final SubLSymbol $sym131$NEW_RANKED_LEX_ENTRY;
    private static final SubLSymbol $sym132$WORD_TREE_LEXIFY_INT_METHOD;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym135$FIND;
    private static final SubLSymbol $sym136$PREPOSITIONAL_TREE_P;
    private static final SubLSymbol $sym137$WHPP_TREE_P;
    private static final SubLSymbol $sym138$ROOT_P;
    private static final SubLSymbol $sym139$GET_MOTHER;
    private static final SubLSymbol $sym140$WORD_TREE_GET_PPS_METHOD;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym145$WORD_TREE_GET_MODIFIERS_METHOD;
    private static final SubLSymbol $sym146$GET_MODIFIEDS;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLSymbol $sym149$TEMPORAL_TREE_P;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $kw152$DENOT;
    private static final SubLObject $const153$Date;
    private static final SubLSymbol $sym154$PARSE;
    private static final SubLSymbol $sym155$WORD_TREE_TEMPORAL_TREE_P_METHOD;
    private static final SubLSymbol $sym156$RELATIVE_PRONOUN_P;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym159$GET_DESCENDANT;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$WORD_TREE_RELATIVE_PRONOUN_P_METHOD;
    private static final SubLSymbol $sym162$RETOKENIZE;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$WORD_TREE_RETOKENIZE_METHOD;
    private static final SubLSymbol $sym165$LOGICAL_FORM_INT;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym168$FUNCTION_WORD_TREE;
    private static final SubLSymbol $sym169$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS;
    private static final SubLSymbol $sym170$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym171$MODIFIER_WORD_TREE;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS;
    private static final SubLSymbol $sym174$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym175$COORDINATE_WORD_TREE;
    private static final SubLList $list176;
    private static final SubLSymbol $sym177$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS;
    private static final SubLSymbol $sym178$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$GET_SISTER;
    private static final SubLSymbol $sym181$COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLSymbol $sym182$COORDINATE_PHRASE_P;
    private static final SubLSymbol $sym183$PHRASE_TREE;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$GET_CONJUNCTION;
    private static final SubLSymbol $sym186$PHRASE_TREE_COORDINATE_PHRASE_P_METHOD;
    private static final SubLSymbol $sym187$COORDINATE_PHRASE_TREE;
    private static final SubLSymbol $sym188$NOMINAL_PHRASE_TREE;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS;
    private static final SubLSymbol $sym191$DAUGHTERS;
    private static final SubLSymbol $sym192$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE;
    private static final SubLList $list193;
    private static final SubLSymbol $sym194$COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD;
    private static final SubLSymbol $sym195$UNLIKE_COORDINATE_PHRASE_TREE;
    private static final SubLSymbol $sym196$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS;
    private static final SubLSymbol $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC;
    private static final SubLSymbol $sym198$UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD;
    private static final SubLSymbol $sym199$NOMINAL_WORD_TREE;
    private static final SubLList $list200;
    private static final SubLList $list201;
    private static final SubLList $list202;
    private static final SubLList $list203;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$GET_OVERT_QUANTIFIER;
    private static final SubLSymbol $kw206$NOUN;
    private static final SubLSymbol $kw207$PREP_OBJECT;
    private static final SubLSymbol $kw208$POSSESSOR;
    private static final SubLSymbol $kw209$MODIFIED;
    private static final SubLSymbol $kw210$CD;
    private static final SubLSymbol $kw211$NUMBER;
    private static final SubLSymbol $kw212$POSS_COL;
    private static final SubLObject $const213$Thing;
    private static final SubLSymbol $sym214$NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLSymbol $kw217$TERM;
    private static final SubLSymbol $sym218$NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$GET_QUANTIFIER;
    private static final SubLSymbol $sym221$NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD;
    private static final SubLSymbol $sym222$DEFINITE_DESCRIPTION_P;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$GET_DETERMINER;
    private static final SubLString $str225$the;
    private static final SubLSymbol $sym226$SINGULAR_P;
    private static final SubLSymbol $sym227$GET_POSSESSOR;
    private static final SubLSymbol $sym228$NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD;
    private static final SubLSymbol $sym229$RELATIONAL_NOUN_P;
    private static final SubLList $list230;
    private static final SubLSymbol $sym231$NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD;
    private static final SubLList $list232;
    private static final SubLSymbol $sym233$GET_EXISTENTIAL_NULL_DETERMINER;
    private static final SubLSymbol $sym234$PLURAL_P;
    private static final SubLSymbol $sym235$NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD;
    private static final SubLSymbol $sym236$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym237$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym238$GET_NUMBER;
    private static final SubLList $list239;
    private static final SubLSymbol $sym240$NOMINAL_WORD_TREE_GET_NUMBER_METHOD;
    private static final SubLList $list241;
    private static final SubLSymbol $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym243$NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym246$FIND_LAST;
    private static final SubLSymbol $sym247$DETERMINER_WORD_TREE_P;
    private static final SubLSymbol $sym248$WHADJP_TREE_P;
    private static final SubLSymbol $sym249$FIND_FIRST;
    private static final SubLSymbol $sym250$NOMINAL_WORD_TREE_GET_DETERMINER_METHOD;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym253$QUANTIFIER_TREE_P;
    private static final SubLSymbol $sym254$NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD;
    private static final SubLList $list255;
    private static final SubLSymbol $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLObject $const257$thereExists;
    private static final SubLObject $const258$and;
    private static final SubLSymbol $sym259$WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD;
    private static final SubLSymbol $sym260$LEX_ENTRY;
    private static final SubLSymbol $sym261$SET;
    private static final SubLSymbol $kw262$STRING;
    private static final SubLString $str263$;
    private static final SubLSymbol $kw264$CYC_POS;
    private static final SubLObject $const265$Determiner;
    private static final SubLList $list266;
    private static final SubLObject $const267$DeterminerFrame;
    private static final SubLSymbol $kw268$DT;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym271$NOMINAL_PHRASE_TREE_P;
    private static final SubLSymbol $sym272$POSSESSIVE_P;
    private static final SubLSymbol $sym273$PRP__TREE_P;
    private static final SubLSymbol $sym274$NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD;
    private static final SubLSymbol $sym275$GET_SPECIFIER;
    private static final SubLList $list276;
    private static final SubLSymbol $sym277$NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD;
    private static final SubLSymbol $sym278$GET_ANTECEDENT;
    private static final SubLList $list279;
    private static final SubLSymbol $sym280$NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD;
    private static final SubLSymbol $sym281$GET_GENDER;
    private static final SubLList $list282;
    private static final SubLSymbol $kw283$GENDER;
    private static final SubLSymbol $sym284$NOMINAL_WORD_TREE_GET_GENDER_METHOD;
    private static final SubLSymbol $sym285$GET_PERSON;
    private static final SubLList $list286;
    private static final SubLSymbol $sym287$NOMINAL_WORD_TREE_GET_PERSON_METHOD;
    private static final SubLList $list288;
    private static final SubLSymbol $kw289$SINGULAR;
    private static final SubLSymbol $sym290$NOMINAL_WORD_TREE_SINGULAR_P_METHOD;
    private static final SubLList $list291;
    private static final SubLSymbol $kw292$PLURAL;
    private static final SubLSymbol $sym293$NOMINAL_WORD_TREE_PLURAL_P_METHOD;
    private static final SubLList $list294;
    private static final SubLSymbol $sym295$GET_ANCESTORS;
    private static final SubLSymbol $sym296$GET_DAUGHTER;
    private static final SubLSymbol $sym297$COPULA_P;
    private static final SubLSymbol $sym298$GET_OBJECTS;
    private static final SubLSymbol $sym299$GET_SUBJECT;
    private static final SubLSymbol $sym300$NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLSymbol $sym301$DAUGHTER_COUNT;
    private static final SubLSymbol $kw302$_;
    private static final SubLSymbol $sym303$NN_TREE;
    private static final SubLList $list304;
    private static final SubLSymbol $sym305$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS;
    private static final SubLSymbol $sym306$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE;
    private static final SubLList $list307;
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$NN_TREE_GET_NUMBER_METHOD;
    private static final SubLSymbol $sym310$NAME_WORD_TREE;
    private static final SubLList $list311;
    private static final SubLList $list312;
    private static final SubLList $list313;
    private static final SubLSymbol $sym314$NAME_WORD_TREE_GET_QUANTIFIER_METHOD;
    private static final SubLSymbol $sym315$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS;
    private static final SubLSymbol $sym316$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym317$DOLLAR_WORD_TREE;
    private static final SubLList $list318;
    private static final SubLSymbol $sym319$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS;
    private static final SubLSymbol $sym320$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE;
    private static final SubLList $list321;
    private static final SubLSymbol $sym322$DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD;
    private static final SubLSymbol $sym323$NNP_TREE;
    private static final SubLSymbol $sym324$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS;
    private static final SubLSymbol $sym325$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE;
    private static final SubLSymbol $sym326$NNP_TREE_GET_NUMBER_METHOD;
    private static final SubLSymbol $sym327$NNS_TREE;
    private static final SubLSymbol $sym328$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS;
    private static final SubLSymbol $sym329$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE;
    private static final SubLList $list330;
    private static final SubLList $list331;
    private static final SubLSymbol $sym332$NNS_TREE_GET_NUMBER_METHOD;
    private static final SubLSymbol $sym333$NNPS_TREE;
    private static final SubLSymbol $sym334$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS;
    private static final SubLSymbol $sym335$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE;
    private static final SubLSymbol $sym336$NNPS_TREE_GET_NUMBER_METHOD;
    private static final SubLSymbol $sym337$PRP_TREE;
    private static final SubLList $list338;
    private static final SubLList $list339;
    private static final SubLSymbol $sym340$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS;
    private static final SubLSymbol $sym341$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE;
    private static final SubLList $list342;
    private static final SubLList $list343;
    private static final SubLList $list344;
    private static final SubLSymbol $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD;
    private static final SubLSymbol $sym346$PRP_TREE_GET_NUMBER_METHOD;
    private static final SubLList $list347;
    private static final SubLSymbol $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD;
    private static final SubLString $str349$I;
    private static final SubLString $str350$me;
    private static final SubLString $str351$you;
    private static final SubLString $str352$we;
    private static final SubLString $str353$us;
    private static final SubLSymbol $sym354$PRP_TREE_GET_PERSON_METHOD;
    private static final SubLList $list355;
    private static final SubLSymbol $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD;
    private static final SubLList $list357;
    private static final SubLSymbol $sym358$PRP_TREE_GET_GENDER_METHOD;
    private static final SubLSymbol $sym359$WP_TREE;
    private static final SubLList $list360;
    private static final SubLList $list361;
    private static final SubLSymbol $sym362$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS;
    private static final SubLSymbol $sym363$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE;
    private static final SubLList $list364;
    private static final SubLSymbol $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD;
    private static final SubLSymbol $sym366$WP_TREE_GET_REFS_METHOD;
    private static final SubLList $list367;
    private static final SubLSymbol $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD;
    private static final SubLSymbol $sym369$WP_TREE_GET_ANTECEDENT_METHOD;
    private static final SubLList $list370;
    private static final SubLSymbol $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD;
    private static final SubLSymbol $sym372$WP_TREE_GET_QUANTIFIER_METHOD;
    private static final SubLList $list373;
    private static final SubLSymbol $sym374$WP_TREE_GET_NUMBER_METHOD;
    private static final SubLList $list375;
    private static final SubLList $list376;
    private static final SubLSymbol $sym377$WP_TREE_GET_GENDER_METHOD;
    private static final SubLString $str378$that;
    private static final SubLSymbol $sym379$VERBAL_WORD_TREE;
    private static final SubLList $list380;
    private static final SubLList $list381;
    private static final SubLList $list382;
    private static final SubLSymbol $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym384$GET_PARTICLE;
    private static final SubLObject $const385$ParticleFrameType;
    private static final SubLObject $const386$VerbParticle;
    private static final SubLSymbol $sym387$VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD;
    private static final SubLList $list388;
    private static final SubLSymbol $sym389$GET_SEMANTIC_SUBJECT;
    private static final SubLSymbol $sym390$VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD;
    private static final SubLList $list391;
    private static final SubLList $list392;
    private static final SubLList $list393;
    private static final SubLSymbol $sym394$GET_SEMANTIC_DIRECT_OBJECT;
    private static final SubLSymbol $sym395$GET_SEMANTIC_INDIRECT_OBJECT;
    private static final SubLSymbol $sym396$GET_VERBAL_COMPLEMENT;
    private static final SubLList $list397;
    private static final SubLSymbol $kw398$ACTION;
    private static final SubLSymbol $kw399$SUBJECT;
    private static final SubLSymbol $kw400$OBJECT;
    private static final SubLSymbol $kw401$CLAUSE;
    private static final SubLSymbol $kw402$INF_COMP;
    private static final SubLSymbol $sym403$VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLSymbol $sym404$GET_CONTROLLER;
    private static final SubLList $list405;
    private static final SubLSymbol $sym406$GET_CONTROL_VERB;
    private static final SubLSymbol $sym407$SUBJECT_CONTROLLER_P;
    private static final SubLSymbol $sym408$OBJECT_CONTROLLER_P;
    private static final SubLSymbol $sym409$GET_DIRECT_OBJECT;
    private static final SubLSymbol $sym410$VERBAL_WORD_TREE_GET_CONTROLLER_METHOD;
    private static final SubLList $list411;
    private static final SubLSymbol $sym412$GET_MATRIX_CLAUSE;
    private static final SubLSymbol $sym413$CONTROL_VERB_P;
    private static final SubLSymbol $sym414$VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD;
    private static final SubLList $list415;
    private static final SubLList $list416;
    private static final SubLSymbol $sym417$VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD;
    private static final SubLList $list418;
    private static final SubLList $list419;
    private static final SubLSymbol $sym420$VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD;
    private static final SubLList $list421;
    private static final SubLSymbol $sym422$VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD;
    private static final SubLList $list423;
    private static final SubLSymbol $sym424$VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD;
    private static final SubLSymbol $sym425$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym426$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym427$GET_PREDICATE;
    private static final SubLList $list428;
    private static final SubLSymbol $sym429$GET_SEMANTIC_HEAD;
    private static final SubLSymbol $sym430$VERBAL_WORD_TREE_GET_PREDICATE_METHOD;
    private static final SubLList $list431;
    private static final SubLSymbol $sym432$FINITE_P;
    private static final SubLSymbol $sym433$VERBAL_WORD_TREE_GET_NUMBER_METHOD;
    private static final SubLList $list434;
    private static final SubLSymbol $sym435$VERBAL_WORD_TREE_GET_PERSON_METHOD;
    private static final SubLSymbol $sym436$GET_TENSE;
    private static final SubLList $list437;
    private static final SubLSymbol $sym438$VERBAL_WORD_TREE_GET_TENSE_METHOD;
    private static final SubLList $list439;
    private static final SubLSymbol $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym441$NOMINAL_TREE_P;
    private static final SubLSymbol $sym442$VERBAL_WORD_TREE_GET_SUBJECT_METHOD;
    private static final SubLList $list443;
    private static final SubLSymbol $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym445$GET_INDIRECT_OBJECT;
    private static final SubLSymbol $sym446$STRANDED_P;
    private static final SubLSymbol $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P;
    private static final SubLSymbol $sym448$VERBAL_WORD_TREE_GET_OBJECTS_METHOD;
    private static final SubLSymbol $sym449$GET_MOVED_NPS;
    private static final SubLList $list450;
    private static final SubLSymbol $sym451$WHNP_TREE_P;
    private static final SubLSymbol $sym452$VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD;
    private static final SubLSymbol $sym453$GET_MOVED_OBJECTS;
    private static final SubLList $list454;
    private static final SubLSymbol $sym455$VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD;
    private static final SubLList $list456;
    private static final SubLSymbol $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym458$VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD;
    private static final SubLList $list459;
    private static final SubLSymbol $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym461$VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD;
    private static final SubLList $list462;
    private static final SubLSymbol $sym463$VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD;
    private static final SubLList $list464;
    private static final SubLSymbol $sym465$VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD;
    private static final SubLList $list466;
    private static final SubLSymbol $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym468$VERBAL_PHRASE_TREE_P;
    private static final SubLSymbol $sym469$VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD;
    private static final SubLSymbol $sym470$GET_ADJECTIVAL_COMPLEMENT;
    private static final SubLList $list471;
    private static final SubLSymbol $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym473$ADJP_TREE_P;
    private static final SubLSymbol $sym474$VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD;
    private static final SubLList $list475;
    private static final SubLSymbol $sym476$GET_SEMANTIC_OBJECTS;
    private static final SubLSymbol $sym477$VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list478;
    private static final SubLSymbol $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym480$PRT_TREE_P;
    private static final SubLSymbol $sym481$VERBAL_WORD_TREE_GET_PARTICLE_METHOD;
    private static final SubLSymbol $sym482$GET_INFINITIVE_MARKER;
    private static final SubLList $list483;
    private static final SubLSymbol $kw484$TO;
    private static final SubLSymbol $sym485$VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD;
    private static final SubLSymbol $sym486$DUMMY_TO_P;
    private static final SubLList $list487;
    private static final SubLString $str488$to;
    private static final SubLSymbol $sym489$VERBAL_WORD_TREE_DUMMY_TO_P_METHOD;
    private static final SubLList $list490;
    private static final SubLSymbol $sym491$VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD;
    private static final SubLList $list492;
    private static final SubLSymbol $sym493$VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD;
    private static final SubLSymbol $sym494$GET_ANCESTOR_OBJECTS;
    private static final SubLList $list495;
    private static final SubLSymbol $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym497$VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD;
    private static final SubLSymbol $sym498$INVERTED_P;
    private static final SubLList $list499;
    private static final SubLSymbol $sym500$VERBAL_WORD_TREE_INVERTED_P_METHOD;
    private static final SubLList $list501;
    private static final SubLSymbol $sym502$VERBAL_WORD_TREE_FINITE_P_METHOD;
    private static final SubLSymbol $sym503$PASSIVE_P;
    private static final SubLList $list504;
    private static final SubLSymbol $sym505$VERBAL_WORD_TREE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym506$INFINITIVE_P;
    private static final SubLList $list507;
    private static final SubLSymbol $sym508$VERBAL_WORD_TREE_INFINITIVE_P_METHOD;
    private static final SubLSymbol $sym509$BASE_P;
    private static final SubLList $list510;
    private static final SubLSymbol $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym512$MODAL_VERB_TREE_P;
    private static final SubLString $str513$did;
    private static final SubLSymbol $sym514$VERBAL_WORD_TREE_BASE_P_METHOD;
    private static final SubLSymbol $sym515$VBZ_TREE;
    private static final SubLList $list516;
    private static final SubLList $list517;
    private static final SubLSymbol $sym518$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS;
    private static final SubLSymbol $sym519$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE;
    private static final SubLList $list520;
    private static final SubLSymbol $kw521$PRESENT;
    private static final SubLSymbol $sym522$VBZ_TREE_GET_TENSE_METHOD;
    private static final SubLSymbol $sym523$VBN_TREE;
    private static final SubLList $list524;
    private static final SubLSymbol $sym525$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS;
    private static final SubLSymbol $sym526$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE;
    private static final SubLSymbol $sym527$GET_AUX_VERB;
    private static final SubLList $list528;
    private static final SubLSymbol $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD;
    private static final SubLSymbol $sym530$AUX_VERB_TREE_P;
    private static final SubLSymbol $sym531$VBN_TREE_GET_AUX_VERB_METHOD;
    private static final SubLList $list532;
    private static final SubLSymbol $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD;
    private static final SubLString $str534$by;
    private static final SubLSymbol $sym535$VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD;
    private static final SubLList $list536;
    private static final SubLSymbol $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD;
    private static final SubLSymbol $sym538$VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD;
    private static final SubLList $list539;
    private static final SubLSymbol $sym540$VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD;
    private static final SubLList $list541;
    private static final SubLList $list542;
    private static final SubLSymbol $sym543$VBN_TREE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym544$VBD_TREE;
    private static final SubLSymbol $sym545$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS;
    private static final SubLSymbol $sym546$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE;
    private static final SubLList $list547;
    private static final SubLSymbol $kw548$PAST;
    private static final SubLSymbol $sym549$VBD_TREE_GET_TENSE_METHOD;
    private static final SubLSymbol $sym550$VBP_TREE;
    private static final SubLSymbol $sym551$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS;
    private static final SubLSymbol $sym552$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE;
    private static final SubLSymbol $sym553$VBP_TREE_GET_TENSE_METHOD;
    private static final SubLSymbol $sym554$VB_TREE;
    private static final SubLSymbol $sym555$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS;
    private static final SubLSymbol $sym556$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE;
    private static final SubLList $list557;
    private static final SubLSymbol $kw558$INFINITIVE;
    private static final SubLSymbol $sym559$VB_TREE_GET_TENSE_METHOD;
    private static final SubLSymbol $sym560$VBG_TREE;
    private static final SubLList $list561;
    private static final SubLSymbol $sym562$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS;
    private static final SubLSymbol $sym563$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE;
    private static final SubLSymbol $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD;
    private static final SubLSymbol $sym565$VBG_TREE_GET_AUX_VERB_METHOD;
    private static final SubLList $list566;
    private static final SubLSymbol $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD;
    private static final SubLSymbol $sym568$VBG_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLSymbol $sym569$AUX_VERB_TREE;
    private static final SubLList $list570;
    private static final SubLList $list571;
    private static final SubLList $list572;
    private static final SubLSymbol $sym573$AUX_VERB_TREE_COPULA_P_METHOD;
    private static final SubLList $list574;
    private static final SubLList $list575;
    private static final SubLList $list576;
    private static final SubLSymbol $kw577$COMPLEMENT;
    private static final SubLSymbol $sym578$AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLList $list579;
    private static final SubLSymbol $sym580$AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD;
    private static final SubLList $list581;
    private static final SubLSymbol $sym582$GET_PREPOSITIONAL_COMPLEMENT;
    private static final SubLSymbol $sym583$GET_ADVERBIAL_COMPLEMENT;
    private static final SubLSymbol $sym584$AUX_VERB_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list585;
    private static final SubLSymbol $sym586$AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD;
    private static final SubLList $list587;
    private static final SubLList $list588;
    private static final SubLList $list589;
    private static final SubLList $list590;
    private static final SubLSymbol $sym591$AUX_VERB_TREE_GET_TENSE_METHOD;
    private static final SubLSymbol $sym592$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS;
    private static final SubLSymbol $sym593$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE;
    private static final SubLList $list594;
    private static final SubLSymbol $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD;
    private static final SubLSymbol $sym596$AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD;
    private static final SubLList $list597;
    private static final SubLSymbol $sym598$AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD;
    private static final SubLList $list599;
    private static final SubLSymbol $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD;
    private static final SubLSymbol $sym601$AUX_VERB_TREE_GET_SUBJECT_METHOD;
    private static final SubLList $list602;
    private static final SubLSymbol $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD;
    private static final SubLSymbol $sym604$AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD;
    private static final SubLList $list605;
    private static final SubLSymbol $sym606$AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD;
    private static final SubLList $list607;
    private static final SubLSymbol $sym608$AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD;
    private static final SubLList $list609;
    private static final SubLSymbol $sym610$AUX_VERB_TREE_INVERTED_P_METHOD;
    private static final SubLList $list611;
    private static final SubLSymbol $sym612$AUX_VERB_TREE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym613$MODAL_VERB_TREE;
    private static final SubLList $list614;
    private static final SubLSymbol $sym615$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS;
    private static final SubLSymbol $sym616$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE;
    private static final SubLList $list617;
    private static final SubLSymbol $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD;
    private static final SubLString $str619$will;
    private static final SubLSymbol $kw620$FUTURE;
    private static final SubLSymbol $sym621$MODAL_VERB_TREE_GET_TENSE_METHOD;
    private static final SubLList $list622;
    private static final SubLSymbol $sym623$MODAL_VERB_TREE_GET_OBJECTS_METHOD;
    private static final SubLSymbol $sym624$ADJECTIVAL_WORD_TREE;
    private static final SubLList $list625;
    private static final SubLList $list626;
    private static final SubLList $list627;
    private static final SubLList $list628;
    private static final SubLList $list629;
    private static final SubLSymbol $sym630$ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLList $list631;
    private static final SubLSymbol $sym632$ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLSymbol $sym633$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym634$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE;
    private static final SubLList $list635;
    private static final SubLSymbol $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym637$GET_HEAD_DAUGHTER;
    private static final SubLSymbol $sym638$ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLList $list639;
    private static final SubLSymbol $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym641$SBAR_TREE_P;
    private static final SubLSymbol $sym642$ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD;
    private static final SubLSymbol $sym643$ADVERBIAL_WORD_TREE;
    private static final SubLList $list644;
    private static final SubLList $list645;
    private static final SubLList $list646;
    private static final SubLList $list647;
    private static final SubLList $list648;
    private static final SubLSymbol $sym649$ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLSymbol $sym650$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym651$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE;
    private static final SubLList $list652;
    private static final SubLSymbol $sym653$ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLSymbol $sym654$WRB_WORD_TREE;
    private static final SubLList $list655;
    private static final SubLSymbol $sym656$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS;
    private static final SubLSymbol $sym657$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE;
    private static final SubLList $list659;
    private static final SubLList $list660;
    private static final SubLList $list661;
    private static final SubLList $list662;
    private static final SubLList $list663;
    private static final SubLSymbol $sym664$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLSymbol $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C;
    private static final SubLSymbol $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I;
    private static final SubLList $list667;
    private static final SubLSymbol $sym668$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD;
    private static final SubLList $list669;
    private static final SubLSymbol $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym671$VERBAL_TREE_P;
    private static final SubLSymbol $sym672$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD;
    private static final SubLList $list673;
    private static final SubLSymbol $sym674$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list675;
    private static final SubLSymbol $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym677$PHRASE_TREE_P;
    private static final SubLSymbol $sym678$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLList $list679;
    private static final SubLSymbol $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym681$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD;
    private static final SubLList $list682;
    private static final SubLSymbol $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym684$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD;
    private static final SubLSymbol $sym685$PREPOSITIONAL_WORD_TREE;
    private static final SubLList $list686;
    private static final SubLSymbol $sym687$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym688$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym689$PARTICLE_WORD_TREE;
    private static final SubLList $list690;
    private static final SubLSymbol $sym691$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS;
    private static final SubLSymbol $sym692$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym693$SPECIFIER_WORD_TREE;
    private static final SubLList $list694;
    private static final SubLSymbol $sym695$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS;
    private static final SubLSymbol $sym696$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym697$GET_SPECIFIED;
    private static final SubLList $list698;
    private static final SubLSymbol $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD;
    private static final SubLSymbol $sym700$SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD;
    private static final SubLSymbol $sym701$QUANTIFIER_WORD_TREE;
    private static final SubLList $list702;
    private static final SubLList $list703;
    private static final SubLList $list704;
    private static final SubLList $list705;
    private static final SubLList $list706;
    private static final SubLSymbol $sym707$QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLSymbol $sym708$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS;
    private static final SubLSymbol $sym709$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym710$GET_QUANTIFIED;
    private static final SubLList $list711;
    private static final SubLSymbol $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD;
    private static final SubLSymbol $sym713$QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD;
    private static final SubLList $list714;
    private static final SubLSymbol $sym715$QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD;
    private static final SubLSymbol $sym716$DETERMINER_WORD_TREE;
    private static final SubLSymbol $sym717$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS;
    private static final SubLSymbol $sym718$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym719$PRP__TREE;
    private static final SubLSymbol $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS;
    private static final SubLSymbol $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE;
    private static final SubLList $list722;
    private static final SubLList $list723;
    private static final SubLList $list724;
    private static final SubLSymbol $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD;
    private static final SubLSymbol $sym726$PRP__TREE_GET_NUMBER_METHOD;
    private static final SubLList $list727;
    private static final SubLSymbol $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD;
    private static final SubLString $str729$my;
    private static final SubLString $str730$your;
    private static final SubLString $str731$our;
    private static final SubLSymbol $sym732$PRP__TREE_GET_PERSON_METHOD;
    private static final SubLList $list733;
    private static final SubLSymbol $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD;
    private static final SubLList $list735;
    private static final SubLSymbol $sym736$PRP__TREE_GET_GENDER_METHOD;
    private static final SubLSymbol $sym737$WDT_WORD_TREE;
    private static final SubLList $list738;
    private static final SubLSymbol $sym739$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS;
    private static final SubLSymbol $sym740$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD;
    private static final SubLSymbol $sym742$WDT_WORD_TREE_GET_REFS_METHOD;
    private static final SubLSymbol $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD;
    private static final SubLSymbol $sym744$WDT_WORD_TREE_GET_ANTECEDENT_METHOD;
    private static final SubLSymbol $sym745$POSSESSIVE_WORD_TREE;
    private static final SubLList $list746;
    private static final SubLList $list747;
    private static final SubLList $list748;
    private static final SubLList $list749;
    private static final SubLList $list750;
    private static final SubLSymbol $sym751$GET_POSSESSED;
    private static final SubLSymbol $kw752$POSSESSED;
    private static final SubLSymbol $sym753$POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD;
    private static final SubLSymbol $sym754$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS;
    private static final SubLSymbol $sym755$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE;
    private static final SubLList $list756;
    private static final SubLSymbol $sym757$POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD;
    private static final SubLList $list758;
    private static final SubLSymbol $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym760$POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD;
    private static final SubLList $list761;
    private static final SubLSymbol $sym762$POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD;
    private static final SubLList $list763;
    private static final SubLSymbol $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym765$POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD;
    private static final SubLSymbol $sym766$CARDINAL_WORD_TREE;
    private static final SubLList $list767;
    private static final SubLSymbol $sym768$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym769$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym770$EXISTENTIAL_WORD_TREE;
    private static final SubLSymbol $sym771$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS;
    private static final SubLSymbol $sym772$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE;
    private static final SubLSymbol $sym773$PUNCTUATION_WORD_TREE;
    private static final SubLList $list774;
    private static final SubLSymbol $sym775$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS;
    private static final SubLSymbol $sym776$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE;
    private static final SubLList $list777;
    private static final SubLSymbol $sym778$MULTI_NOUN_TREE;
    private static final SubLList $list779;
    private static final SubLSymbol $sym780$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS;
    private static final SubLSymbol $sym781$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE;
    private static final SubLSymbol $sym782$VECTOR;
    private static final SubLSymbol $sym783$COVERS;
    private static final SubLList $list784;
    private static final SubLList $list785;
    private static final SubLSymbol $sym786$PARSE_TREE_COVERS_METHOD;
    private static final SubLSymbol $sym787$COVERS_MINIMALLY;
    private static final SubLList $list788;
    private static final SubLList $list789;
    private static final SubLSymbol $sym790$PARSE_TREE_COVERS_MINIMALLY_METHOD;
    private static final SubLSymbol $sym791$GET_MINIMALLY_COVERING_SUBTREES;
    private static final SubLList $list792;
    private static final SubLSymbol $sym793$PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject get_word_tree_abs_idx(final SubLObject v_word_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_word_tree, (SubLObject)word_tree.NINE_INTEGER, (SubLObject)word_tree.$sym4$ABS_IDX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject set_word_tree_abs_idx(final SubLObject v_word_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, (SubLObject)word_tree.NINE_INTEGER, (SubLObject)word_tree.$sym4$ABS_IDX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject get_word_tree_refs(final SubLObject v_word_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_word_tree, (SubLObject)word_tree.EIGHT_INTEGER, (SubLObject)word_tree.$sym5$REFS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject set_word_tree_refs(final SubLObject v_word_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, (SubLObject)word_tree.EIGHT_INTEGER, (SubLObject)word_tree.$sym5$REFS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject get_word_tree_lexes(final SubLObject v_word_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_word_tree, (SubLObject)word_tree.SEVEN_INTEGER, (SubLObject)word_tree.$sym6$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject set_word_tree_lexes(final SubLObject v_word_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, (SubLObject)word_tree.SEVEN_INTEGER, (SubLObject)word_tree.$sym6$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_modified_dependent_meaning_p_method(final SubLObject self) {
        SubLObject semtrans = (SubLObject)word_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
        SubLObject rle = (SubLObject)word_tree.NIL;
        rle = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw11$SEMTRANS);
            if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw12$REPLACE, cyclifier.formula_keywords(semtrans), (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED)) {
                return (SubLObject)word_tree.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_pp_comp_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(word_tree.$sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject filtered = (SubLObject)word_tree.NIL;
                final SubLObject pp = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym18$GET_PP_COMPLEMENT);
                final SubLObject pp_head = (SubLObject)((word_tree.NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                SubLObject frame = (SubLObject)word_tree.NIL;
                if (word_tree.NIL != pp_head) {
                    SubLObject cdolist_list_var = lexes;
                    SubLObject rle = (SubLObject)word_tree.NIL;
                    rle = cdolist_list_var.first();
                    while (word_tree.NIL != cdolist_list_var) {
                        frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME);
                        if (word_tree.NIL != cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != isa.isaP(frame, word_tree.$const21$PPCompFrame, word_tree.$const22$EverythingPSC, (SubLObject)word_tree.UNPROVIDED)) {
                            final SubLObject preposition = cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED);
                            final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, word_tree.$const23$Preposition, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED).first();
                            if (prep_string.equalp(methods.funcall_instance_method_with_0_args(pp_head, (SubLObject)word_tree.$sym24$GET_STRING))) {
                                cyclifier.rle_set_confidence(rle, (SubLObject)word_tree.ONE_INTEGER);
                                filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                            }
                        }
                        else {
                            filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rle = cdolist_list_var.first();
                    }
                    lexes = filtered;
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_frame_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(word_tree.$sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject filtered = (SubLObject)word_tree.NIL;
                final SubLObject tree_keywords = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym29$TREE_KEYWORD_EQ_CLASSES);
                SubLObject lex_scores = (SubLObject)word_tree.NIL;
                SubLObject max_score = (SubLObject)word_tree.$int30$_5;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
                SubLObject rle = (SubLObject)word_tree.NIL;
                rle = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject lex_score = cyclifier_interface.lex_entry_score(cyclifier.rle_lex(rle), tree_keywords);
                    cyclifier.rle_set_confidence(rle, lex_score);
                    lex_scores = (SubLObject)ConsesLow.cons(rle, lex_scores);
                    if (lex_score.numG(max_score)) {
                        max_score = lex_score;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                cdolist_list_var = lex_scores;
                rle = (SubLObject)word_tree.NIL;
                rle = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    if (cyclifier.rle_confidence(rle).numE(max_score)) {
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                lexes = filtered;
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_pos_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(word_tree.$sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject filtered = (SubLObject)word_tree.NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = (SubLObject)word_tree.NIL;
                rle = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    if (word_tree.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym35$GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw36$PENN_TAGS), (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, (SubLObject)word_tree.ONE_INTEGER);
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    else if (word_tree.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym35$GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw37$BACKOFF_PENN_TAGS), (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, (SubLObject)word_tree.$float38$0_75);
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                lexes = filtered;
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_tree_keyword_eq_classes_method(final SubLObject self) {
        return cyclifier_interface.keyword_eq_classes(Mapping.mapcar((SubLObject)word_tree.$sym41$CAR, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS).first().first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings) {
        if (renamings == word_tree.UNPROVIDED) {
            renamings = (SubLObject)word_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ndistr_comp_cycls = (SubLObject)word_tree.NIL;
        SubLObject distr_comp_cycls = (SubLObject)word_tree.NIL;
        SubLObject mod_cycls = (SubLObject)word_tree.NIL;
        SubLObject cycls = (SubLObject)word_tree.NIL;
        if (word_tree.NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            try {
                cyclifier_interface.$cyclification_in_progress$.bind((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                if (word_tree.NIL == renamings) {
                    renamings = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES)));
                }
                renamings = cyclifier_interface.group_disjunctive_renamings(renamings);
                thread.resetMultipleValues();
                final SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym47$PARTITION_SEMANTIC_COMPLEMENTS);
                final SubLObject distributing = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = non_distributing;
                SubLObject complement = (SubLObject)word_tree.NIL;
                complement = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
                    if (word_tree.NIL != comp_cycl) {
                        ndistr_comp_cycls = (SubLObject)ConsesLow.cons(comp_cycl, ndistr_comp_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                }
                cdolist_list_var = distributing;
                complement = (SubLObject)word_tree.NIL;
                complement = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
                    if (word_tree.NIL != comp_cycl) {
                        distr_comp_cycls = (SubLObject)ConsesLow.cons(comp_cycl, distr_comp_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                }
                cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym49$GET_MODIFIERS);
                SubLObject modifier = (SubLObject)word_tree.NIL;
                modifier = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
                    if (word_tree.NIL != mod_cycl) {
                        mod_cycls = (SubLObject)ConsesLow.cons(mod_cycl, mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    modifier = cdolist_list_var.first();
                }
                cdolist_list_var = renamings;
                SubLObject conjunction = (SubLObject)word_tree.NIL;
                conjunction = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
                    SubLObject rle = (SubLObject)word_tree.NIL;
                    rle = cdolist_list_var_$1.first();
                    while (word_tree.NIL != cdolist_list_var_$1) {
                        SubLObject my_cycls0 = (SubLObject)word_tree.NIL;
                        SubLObject cdolist_list_var_$2 = conjunction;
                        SubLObject grouping = (SubLObject)word_tree.NIL;
                        grouping = cdolist_list_var_$2.first();
                        while (word_tree.NIL != cdolist_list_var_$2) {
                            SubLObject this_and_mods = (SubLObject)word_tree.NIL;
                            SubLObject cdolist_list_var_$3 = grouping;
                            SubLObject renaming = (SubLObject)word_tree.NIL;
                            renaming = cdolist_list_var_$3.first();
                            while (word_tree.NIL != cdolist_list_var_$3) {
                                this_and_mods = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)), mod_cycls))), this_and_mods);
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                renaming = cdolist_list_var_$3.first();
                            }
                            my_cycls0 = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.indexed_products(this_and_mods)), ndistr_comp_cycls))), my_cycls0);
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            grouping = cdolist_list_var_$2.first();
                        }
                        cycls = ConsesLow.append(cycls, Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.indexed_products(my_cycls0)));
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        rle = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunction = cdolist_list_var.first();
                }
            }
            finally {
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
            }
        }
        return Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(cycls, distr_comp_cycls)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (word_tree.NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread) || word_tree.NIL == conses_high.member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.NIL;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_partition_semantic_complements_method(final SubLObject self) {
        return Values.values(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS), (SubLObject)word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_get_semantic_complements_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_get_oblique_object_method(final SubLObject self) {
        final SubLObject pp = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym18$GET_PP_COMPLEMENT);
        final SubLObject obl_obj = (SubLObject)((word_tree.NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT) : word_tree.NIL);
        return obl_obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_get_pp_complement_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym71$GET_PPS);
        SubLObject pp = (SubLObject)word_tree.NIL;
        pp = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            final SubLObject pp_head = (SubLObject)((word_tree.NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
            final SubLObject pp_head_string = (SubLObject)((word_tree.NIL != pp_head) ? methods.funcall_instance_method_with_0_args(pp_head, (SubLObject)word_tree.$sym24$GET_STRING) : word_tree.NIL);
            if (word_tree.NIL != pp_head_string) {
                SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
                SubLObject rle = (SubLObject)word_tree.NIL;
                rle = cdolist_list_var_$4.first();
                while (word_tree.NIL != cdolist_list_var_$4) {
                    final SubLObject cycl = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw11$SEMTRANS);
                    final SubLObject keywords = cyclifier.formula_keywords(cycl);
                    final SubLObject frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME);
                    if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != isa.isaP(frame, word_tree.$const21$PPCompFrame, word_tree.$const22$EverythingPSC, (SubLObject)word_tree.UNPROVIDED)) {
                        final SubLObject preposition = cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED);
                        final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, word_tree.$const23$Preposition, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED).first();
                        if (prep_string.equalp(pp_head_string)) {
                            return pp;
                        }
                    }
                    else if (word_tree.NIL != conses_high.intersection((SubLObject)word_tree.$list69, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED) && word_tree.$str70$of.equalp(pp_head_string)) {
                        return pp;
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    rle = cdolist_list_var_$4.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pp = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject subloop_reserved_initialize_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject subloop_reserved_initialize_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
    public static SubLObject word_tree_p(final SubLObject v_word_tree) {
        return classes.subloop_instanceof_class(v_word_tree, (SubLObject)word_tree.$sym0$WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 7847L)
    public static SubLObject new_word_tree(final SubLObject string, final SubLObject category, final SubLObject mother, final SubLObject idx, SubLObject lexes, SubLObject v_context) {
        if (lexes == word_tree.UNPROVIDED) {
            lexes = (SubLObject)word_tree.NIL;
        }
        if (v_context == word_tree.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)word_tree.$sym85$PARSE_TREE_CONTEXT);
        }
        final SubLObject self = object.new_class_instance(word_for_category(category));
        parse_tree.set_parse_tree_string(self, string);
        parse_tree.set_parse_tree_category(self, category);
        parse_tree.set_parse_tree_mother(self, mother);
        parse_tree.set_parse_tree_idx(self, idx);
        set_word_tree_lexes(self, lexes);
        parse_tree.set_parse_tree_context(self, v_context);
        set_word_tree_refs(self, (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(v_context, (SubLObject)word_tree.$sym86$NEW_VARIABLE, string)));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8437L)
    public static SubLObject word_tree_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD, string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8559L)
    public static SubLObject word_tree_get_abs_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject abs_idx = get_word_tree_abs_idx(self);
        try {
            thread.throwStack.push(word_tree.$sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD, abs_idx);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_abs_idx(self, abs_idx);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8703L)
    public static SubLObject word_tree_get_lexes_method(final SubLObject self) {
        return Mapping.mapcar((SubLObject)word_tree.$sym41$CAR, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8870L)
    public static SubLObject word_tree_get_ranked_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(word_tree.$sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9014L)
    public static SubLObject word_tree_get_refs_method(final SubLObject self) {
        final SubLObject refs = get_word_tree_refs(self);
        return refs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9145L)
    public static SubLObject word_tree_set_refs_method(final SubLObject self, final SubLObject referents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject refs = get_word_tree_refs(self);
        try {
            thread.throwStack.push(word_tree.$sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                instances.set_slot(self, (SubLObject)word_tree.$sym5$REFS, referents);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_refs(self, refs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9376L)
    public static SubLObject word_tree_yield_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9497L)
    public static SubLObject word_tree_get_parse_expression_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym35$GET_CATEGORY), methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym24$GET_STRING));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9703L)
    public static SubLObject word_tree_get_heads_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9838L)
    public static SubLObject word_tree_get_head_method(final SubLObject self) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9953L)
    public static SubLObject word_tree_get_semantic_heads_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 10106L)
    public static SubLObject word_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
        instances.set_slot(self, (SubLObject)word_tree.$sym6$LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)word_tree.$sym10$GET, instances.get_slot(self, (SubLObject)word_tree.$sym78$STRING))));
        methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym32$POS_FILTER_LEXES);
        if (word_tree.NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) {
            methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym15$PP_COMP_FILTER_LEXES);
            if (word_tree.NIL != verbal_word_tree_p(self)) {
                methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym127$PARTICLE_FILTER_LEXES);
            }
            methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym26$FRAME_FILTER_LEXES);
            instances.set_slot(self, (SubLObject)word_tree.$sym6$LEXES, Sequences.remove_duplicates(instances.get_slot(self, (SubLObject)word_tree.$sym6$LEXES), (SubLObject)word_tree.$sym128$RLE_SEM_EQUAL, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED));
            if (word_tree.NIL == instances.get_slot(self, (SubLObject)word_tree.$sym6$LEXES) && word_tree.NIL == term_lexicon.term_lexicon_p(lexicon) && word_tree.NIL == methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)word_tree.$sym129$FABRICATION_FORBIDDEN_)) {
                final SubLObject fabricated_lexes = methods.funcall_instance_method_with_3_args(lexicon, (SubLObject)word_tree.$sym130$FABRICATE, instances.get_slot(self, (SubLObject)word_tree.$sym78$STRING), Mapping.mapcar((SubLObject)word_tree.$sym41$CAR, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS).first().first()), instances.get_slot(self, (SubLObject)word_tree.$sym79$CATEGORY));
                if (word_tree.NIL != fabricated_lexes) {
                    instances.set_slot(self, (SubLObject)word_tree.$sym6$LEXES, Mapping.mapcar((SubLObject)word_tree.$sym131$NEW_RANKED_LEX_ENTRY, fabricated_lexes));
                }
            }
        }
        return instances.get_slot(self, (SubLObject)word_tree.$sym6$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 11477L)
    public static SubLObject word_tree_get_pps_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject pps = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym136$PREPOSITIONAL_TREE_P, number_utilities.f_1X(idx));
                if (word_tree.NIL != pps) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
                }
                SubLObject tree;
                for (tree = mother, pps = methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym137$WHPP_TREE_P); word_tree.NIL == pps && word_tree.NIL == methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym138$ROOT_P); tree = methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym139$GET_MOTHER), pps = methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym137$WHPP_TREE_P)) {}
                if (word_tree.NIL != pps) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 11984L)
    public static SubLObject word_tree_get_complements_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12112L)
    public static SubLObject word_tree_get_modifiers_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject modifiers = parse_tree.get_parse_tree_modifiers(self);
        try {
            thread.throwStack.push(word_tree.$sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD, modifiers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_modifiers(self, modifiers);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12246L)
    public static SubLObject word_tree_get_modifieds_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12380L)
    public static SubLObject word_tree_temporal_tree_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject lexes = get_word_tree_lexes(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                final SubLObject tokens = string_utilities.split_string(string, (SubLObject)word_tree.UNPROVIDED);
                if (Sequences.length(tokens).numL((SubLObject)word_tree.TWO_INTEGER)) {
                    SubLObject cdolist_list_var;
                    final SubLObject lexes_$5 = cdolist_list_var = methods.funcall_instance_method_with_1_args(term_lexicon.get_term_lexicon(), (SubLObject)word_tree.$sym10$GET, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym24$GET_STRING));
                    SubLObject lex = (SubLObject)word_tree.NIL;
                    lex = cdolist_list_var.first();
                    while (word_tree.NIL != cdolist_list_var) {
                        final SubLObject denot = methods.funcall_instance_method_with_1_args(lex, (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw152$DENOT);
                        if (word_tree.NIL != term.el_fort_p(denot) && word_tree.NIL != at_utilities.more_specific_p(denot, word_tree.$const153$Date, (SubLObject)word_tree.UNPROVIDED)) {
                            Dynamic.sublisp_throw((SubLObject)word_tree.$sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, (SubLObject)word_tree.T);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lex = cdolist_list_var.first();
                    }
                }
                else {
                    final SubLObject v_parse_tree = methods.funcall_instance_method_with_1_args(parser.get_stanford_parser(), (SubLObject)word_tree.$sym154$PARSE, string);
                    final SubLObject head = (SubLObject)((word_tree.NIL != v_parse_tree) ? methods.funcall_instance_method_with_0_args(v_parse_tree, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                    if (word_tree.NIL != head) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(head, (SubLObject)word_tree.$sym149$TEMPORAL_TREE_P));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13052L)
    public static SubLObject word_tree_relative_pronoun_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                if (word_tree.NIL == wdt_word_tree_p(self) && word_tree.NIL == wp_tree_p(self)) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, (SubLObject)word_tree.NIL);
                }
                final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                final SubLObject first_word = (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym159$GET_DESCENDANT, (SubLObject)word_tree.$list160) : word_tree.NIL);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(self.eql(first_word) && word_tree.NIL != relative_clause_p(grandmother)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13469L)
    public static SubLObject word_tree_retokenize_method(final SubLObject self, final SubLObject lexicon) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13568L)
    public static SubLObject word_tree_logical_form_int_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
    public static SubLObject subloop_reserved_initialize_function_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
    public static SubLObject subloop_reserved_initialize_function_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
    public static SubLObject function_word_tree_p(final SubLObject function_word_tree) {
        return classes.subloop_instanceof_class(function_word_tree, (SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
    public static SubLObject subloop_reserved_initialize_modifier_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
    public static SubLObject subloop_reserved_initialize_modifier_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
    public static SubLObject modifier_word_tree_p(final SubLObject modifier_word_tree) {
        return classes.subloop_instanceof_class(modifier_word_tree, (SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
    public static SubLObject subloop_reserved_initialize_coordinate_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
    public static SubLObject subloop_reserved_initialize_coordinate_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
    public static SubLObject coordinate_word_tree_p(final SubLObject coordinate_word_tree) {
        return classes.subloop_instanceof_class(coordinate_word_tree, (SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14037L)
    public static SubLObject coordinate_word_tree_get_complements_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.MINUS_ONE_INTEGER), methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14238L)
    public static SubLObject phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym185$GET_CONJUNCTION));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
    public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
    public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym183$PHRASE_TREE, (SubLObject)word_tree.$sym191$DAUGHTERS, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
    public static SubLObject coordinate_phrase_tree_p(final SubLObject coordinate_phrase_tree) {
        return classes.subloop_instanceof_class(coordinate_phrase_tree, (SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14549L)
    public static SubLObject coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
        return (SubLObject)word_tree.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
    public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
    public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym183$PHRASE_TREE, (SubLObject)word_tree.$sym191$DAUGHTERS, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
    public static SubLObject unlike_coordinate_phrase_tree_p(final SubLObject unlike_coordinate_phrase_tree) {
        return classes.subloop_instanceof_class(unlike_coordinate_phrase_tree, (SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14770L)
    public static SubLObject unlike_coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
        return (SubLObject)word_tree.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list204;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        SubLObject disjuncts = (SubLObject)word_tree.NIL;
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS).first();
        final SubLObject quantifier0 = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER);
        final SubLObject quantifier2 = (SubLObject)((word_tree.NIL != quantifier0) ? methods.funcall_instance_method_with_0_args(quantifier0, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
        if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw206$NOUN, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw206$NOUN, self), conjuncts);
        }
        if (word_tree.NIL != complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw207$PREP_OBJECT, complement), conjuncts);
        }
        if (word_tree.NIL != complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw208$POSSESSOR, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw208$POSSESSOR, complement), conjuncts);
        }
        if (word_tree.NIL != modified && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw209$MODIFIED, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw209$MODIFIED, modified), conjuncts);
        }
        if (word_tree.NIL != quantifier2 && methods.funcall_instance_method_with_0_args(quantifier2, (SubLObject)word_tree.$sym35$GET_CATEGORY).eql((SubLObject)word_tree.$kw210$CD) && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw211$NUMBER, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw211$NUMBER, quantifier2), conjuncts);
        }
        if (word_tree.NIL != complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw212$POSS_COL, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            final SubLObject head = methods.funcall_instance_method_with_0_args(complement, (SubLObject)word_tree.$sym19$GET_HEAD);
            SubLObject cycl = (SubLObject)word_tree.NIL;
            SubLObject col = (SubLObject)word_tree.NIL;
            if (word_tree.NIL != head) {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, (SubLObject)word_tree.$sym94$GET_LEXES);
                SubLObject lex = (SubLObject)word_tree.NIL;
                lex = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    cycl = methods.funcall_instance_method_with_1_args(lex, (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw11$SEMTRANS);
                    col = parse_tree.main_collection(cycl, (SubLObject)word_tree.$kw206$NOUN);
                    disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw212$POSS_COL, col), disjuncts);
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                }
                if (word_tree.NIL == disjuncts) {
                    disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw212$POSS_COL, word_tree.$const213$Thing), disjuncts);
                }
            }
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings_disj) {
        if (renamings_disj == word_tree.UNPROVIDED) {
            renamings_disj = (SubLObject)word_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = (SubLObject)word_tree.NIL;
        SubLObject independent_mods = (SubLObject)word_tree.NIL;
        SubLObject dependent_mods = (SubLObject)word_tree.NIL;
        SubLObject comp_mod_cycls = (SubLObject)word_tree.NIL;
        thread.resetMultipleValues();
        final SubLObject independent_mods_$6 = cyclifier_interface.partition_modifiers(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym49$GET_MODIFIERS));
        final SubLObject dependent_mods_$7 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        independent_mods = independent_mods_$6;
        dependent_mods = dependent_mods_$7;
        if (word_tree.NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            try {
                cyclifier_interface.$cyclification_in_progress$.bind((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                if (word_tree.NIL == renamings_disj) {
                    renamings_disj = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES)));
                }
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS);
                SubLObject complement = (SubLObject)word_tree.NIL;
                complement = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
                    if (word_tree.NIL != comp_cycl) {
                        comp_mod_cycls = (SubLObject)ConsesLow.cons(comp_cycl, comp_mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                }
                cdolist_list_var = independent_mods;
                SubLObject modifier = (SubLObject)word_tree.NIL;
                modifier = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
                    if (word_tree.NIL != mod_cycl) {
                        comp_mod_cycls = (SubLObject)ConsesLow.cons(mod_cycl, comp_mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    modifier = cdolist_list_var.first();
                }
                cdolist_list_var = renamings_disj;
                SubLObject renamings_conj = (SubLObject)word_tree.NIL;
                renamings_conj = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    SubLObject cycls_conj = (SubLObject)word_tree.NIL;
                    SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
                    SubLObject rle = (SubLObject)word_tree.NIL;
                    rle = cdolist_list_var_$8.first();
                    while (word_tree.NIL != cdolist_list_var_$8) {
                        SubLObject cycls_disj = (SubLObject)word_tree.NIL;
                        final SubLObject v_term = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw217$TERM);
                        SubLObject cdolist_list_var_$9 = renamings_conj;
                        SubLObject renaming = (SubLObject)word_tree.NIL;
                        renaming = cdolist_list_var_$9.first();
                        while (word_tree.NIL != cdolist_list_var_$9) {
                            SubLObject my_cycls_with_mods = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)));
                            SubLObject cdolist_list_var_$10 = dependent_mods;
                            SubLObject mod = (SubLObject)word_tree.NIL;
                            mod = cdolist_list_var_$10.first();
                            while (word_tree.NIL != cdolist_list_var_$10) {
                                my_cycls_with_mods = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(mod, (SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS, cyclifier_interface.update_keyword_renamings(methods.funcall_instance_method_with_0_args(mod, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS), (SubLObject)word_tree.$kw12$REPLACE, v_term)), my_cycls_with_mods);
                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                mod = cdolist_list_var_$10.first();
                            }
                            cycls_disj = ConsesLow.append(Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.cross_products(my_cycls_with_mods)), cycls_disj);
                            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                            renaming = cdolist_list_var_$9.first();
                        }
                        if (word_tree.NIL != cycls_disj) {
                            cycls_conj = ConsesLow.append(cycls_disj, cycls_conj);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        rle = cdolist_list_var_$8.first();
                    }
                    cycls = ConsesLow.append(cycls, Mapping.mapcar((SubLObject)word_tree.$sym50$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(cycls_conj, comp_mod_cycls))));
                    cdolist_list_var = cdolist_list_var.rest();
                    renamings_conj = cdolist_list_var.first();
                }
            }
            finally {
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
            }
        }
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (word_tree.NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread) || word_tree.NIL == conses_high.member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym220$GET_QUANTIFIER);
            SubLObject result = (SubLObject)word_tree.NIL;
            result = ((word_tree.NIL != quantifier) ? methods.funcall_instance_method_with_0_args(quantifier, (SubLObject)word_tree.$sym48$CYCLIFY_INT) : methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS));
            return result;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_definite_description_p_method(final SubLObject self) {
        final SubLObject det = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym224$GET_DETERMINER);
        if (word_tree.NIL != det && methods.funcall_instance_method_with_0_args(det, (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str225$the)) {
            return (SubLObject)word_tree.T;
        }
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym19$GET_HEAD);
        if (word_tree.NIL != head && word_tree.NIL != cyclifier_interface.name_word_p(head) && word_tree.NIL != methods.funcall_instance_method_with_0_args(head, (SubLObject)word_tree.$sym226$SINGULAR_P)) {
            return (SubLObject)word_tree.T;
        }
        final SubLObject pos = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR);
        if (word_tree.NIL != pos) {
            return (SubLObject)word_tree.T;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_relational_noun_p_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES);
        SubLObject rle = (SubLObject)word_tree.NIL;
        rle = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            final SubLObject denot = cyclifier.rename_variables(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw11$SEMTRANS), cyclifier.frame_renaming(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME)));
            final SubLObject keywords = cyclifier.formula_keywords(denot);
            SubLObject cdolist_list_var_$11 = (SubLObject)word_tree.$list69;
            SubLObject keyword = (SubLObject)word_tree.NIL;
            keyword = cdolist_list_var_$11.first();
            while (word_tree.NIL != cdolist_list_var_$11) {
                if (word_tree.NIL != subl_promotions.memberP(keyword, keywords, (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
                    return (SubLObject)word_tree.T;
                }
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                keyword = cdolist_list_var_$11.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_get_quantifier_method(final SubLObject self) {
        final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER);
        if (word_tree.NIL != quantifier) {
            return (SubLObject)(methods.funcall_instance_method_with_0_args(quantifier, (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str225$the) ? word_tree.NIL : quantifier);
        }
        if (word_tree.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR) && word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym226$SINGULAR_P)) {
            return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym233$GET_EXISTENTIAL_NULL_DETERMINER);
        }
        if (word_tree.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR) && word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym234$PLURAL_P)) {
            return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym233$GET_EXISTENTIAL_NULL_DETERMINER);
        }
        if (word_tree.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR)) {
            return (SubLObject)word_tree.NIL;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject subloop_reserved_initialize_nominal_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject subloop_reserved_initialize_nominal_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
    public static SubLObject nominal_word_tree_p(final SubLObject nominal_word_tree) {
        return classes.subloop_instanceof_class(nominal_word_tree, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 16028L)
    public static SubLObject nominal_word_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 16262L)
    public static SubLObject nominal_word_tree_get_complements_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_nominal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
            try {
                if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym229$RELATIONAL_NOUN_P)) {
                    SubLObject complement = (SubLObject)word_tree.NIL;
                    complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR);
                    if (word_tree.NIL == complement && word_tree.NIL != mother) {
                        final SubLObject sister = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
                        final SubLObject sister_head = (SubLObject)((word_tree.NIL != sister) ? methods.funcall_instance_method_with_0_args(sister, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                        if (word_tree.NIL != parse_tree.prepositional_or_particle_phrase_tree_p(sister) && word_tree.NIL != sister_head && methods.funcall_instance_method_with_0_args(sister_head, (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str70$of)) {
                            complement = methods.funcall_instance_method_with_0_args(sister, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
                        }
                    }
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, (SubLObject)((word_tree.NIL != complement) ? ConsesLow.list(complement) : word_tree.NIL));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_nominal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17060L)
    public static SubLObject nominal_word_tree_get_determiner_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_nominal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
            try {
                SubLObject det = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym247$DETERMINER_WORD_TREE_P, number_utilities.f_1_(idx));
                if (word_tree.NIL != det) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
                }
                det = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym248$WHADJP_TREE_P);
                if (word_tree.NIL != det) {
                    det = methods.funcall_instance_method_with_1_args(det, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym247$DETERMINER_WORD_TREE_P);
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_nominal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17449L)
    public static SubLObject nominal_word_tree_get_overt_quantifier_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_nominal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
            try {
                final SubLObject quant = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym253$QUANTIFIER_TREE_P, number_utilities.f_1_(idx));
                if (word_tree.NIL != quant) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, quant);
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym224$GET_DETERMINER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_nominal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17758L)
    public static SubLObject word_tree_get_existential_null_determiner_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject v_context = parse_tree.get_parse_tree_context(self);
        try {
            thread.throwStack.push(word_tree.$sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD, get_null_determiner(word_tree.$const257$thereExists, word_tree.$const258$and, self, v_context));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_context(self, v_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17983L)
    public static SubLObject get_null_determiner(final SubLObject quantifier, final SubLObject connective, final SubLObject v_word_tree, SubLObject v_context) {
        if (v_context == word_tree.UNPROVIDED) {
            v_context = (SubLObject)word_tree.NIL;
        }
        final SubLObject lex = object.new_class_instance((SubLObject)word_tree.$sym260$LEX_ENTRY);
        SubLObject word = (SubLObject)word_tree.NIL;
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)word_tree.$sym261$SET, (SubLObject)word_tree.$kw262$STRING, (SubLObject)word_tree.$str263$);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)word_tree.$sym261$SET, (SubLObject)word_tree.$kw264$CYC_POS, word_tree.$const265$Determiner);
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)word_tree.$sym261$SET, (SubLObject)word_tree.$kw11$SEMTRANS, (SubLObject)ConsesLow.list(quantifier, (SubLObject)word_tree.$kw206$NOUN, reader.bq_cons(connective, (SubLObject)word_tree.$list266)));
        methods.funcall_instance_method_with_2_args(lex, (SubLObject)word_tree.$sym261$SET, (SubLObject)word_tree.$kw20$FRAME, word_tree.$const267$DeterminerFrame);
        word = new_word_tree((SubLObject)word_tree.$str263$, (SubLObject)word_tree.$kw268$DT, methods.funcall_instance_method_with_0_args(v_word_tree, (SubLObject)word_tree.$sym139$GET_MOTHER), (SubLObject)word_tree.ZERO_INTEGER, cyclifier.new_even_lex_entry_distribution((SubLObject)ConsesLow.list(lex)), v_context);
        set_word_tree_abs_idx(word, methods.funcall_instance_method_with_0_args(v_word_tree, (SubLObject)word_tree.$sym90$GET_ABS_INDEX));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 18552L)
    public static SubLObject nominal_word_tree_get_possessor_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_nominal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
            try {
                final SubLObject np = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym271$NOMINAL_PHRASE_TREE_P, idx);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, (word_tree.NIL != np && word_tree.NIL != methods.funcall_instance_method_with_0_args(np, (SubLObject)word_tree.$sym272$POSSESSIVE_P)) ? np : methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym273$PRP__TREE_P, idx));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_nominal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 18856L)
    public static SubLObject nominal_word_tree_get_specifier_method(final SubLObject self) {
        SubLObject specifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym224$GET_DETERMINER);
        if (word_tree.NIL == specifier) {
            specifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym220$GET_QUANTIFIER);
        }
        if (word_tree.NIL == specifier) {
            specifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR);
        }
        return specifier;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19192L)
    public static SubLObject nominal_word_tree_get_antecedent_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19350L)
    public static SubLObject nominal_word_tree_get_gender_method(final SubLObject self) {
        SubLObject genders = (SubLObject)word_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym94$GET_LEXES);
        SubLObject lex = (SubLObject)word_tree.NIL;
        lex = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            genders = ConsesLow.append(methods.funcall_instance_method_with_1_args(lex, (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw283$GENDER), genders);
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(genders, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19705L)
    public static SubLObject nominal_word_tree_get_person_method(final SubLObject self) {
        return (SubLObject)word_tree.THREE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19837L)
    public static SubLObject nominal_word_tree_singular_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(conses_high.member((SubLObject)word_tree.$kw289$SINGULAR, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym238$GET_NUMBER), (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20026L)
    public static SubLObject nominal_word_tree_plural_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(conses_high.member((SubLObject)word_tree.$kw292$PLURAL, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym238$GET_NUMBER), (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20215L)
    public static SubLObject non_of_prepositional_tree_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != parse_tree.prepositional_tree_p(tree) && !methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym19$GET_HEAD), (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str70$of));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20377L)
    public static SubLObject nominal_word_tree_get_modifieds_method(final SubLObject self) {
        SubLObject modifieds = (SubLObject)word_tree.NIL;
        final SubLObject ancestors = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS);
        SubLObject successP = (SubLObject)word_tree.NIL;
        if (word_tree.NIL == successP) {
            SubLObject csome_list_var = ancestors;
            SubLObject ancestor = (SubLObject)word_tree.NIL;
            ancestor = csome_list_var.first();
            while (word_tree.NIL == successP && word_tree.NIL != csome_list_var) {
                if (word_tree.NIL != appositive_np_p(ancestor) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.TWO_INTEGER), (SubLObject)word_tree.$sym19$GET_HEAD).eql(self) && word_tree.NIL != methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER) && word_tree.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)word_tree.$sym19$GET_HEAD)) {
                    modifieds = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)word_tree.$sym19$GET_HEAD), modifieds);
                    successP = (SubLObject)word_tree.T;
                }
                csome_list_var = csome_list_var.rest();
                ancestor = csome_list_var.first();
            }
        }
        successP = (SubLObject)word_tree.NIL;
        if (word_tree.NIL == successP) {
            SubLObject csome_list_var = ancestors;
            SubLObject ancestor = (SubLObject)word_tree.NIL;
            ancestor = csome_list_var.first();
            while (word_tree.NIL == successP && word_tree.NIL != csome_list_var) {
                if (word_tree.NIL != parse_tree.verbal_tree_p(ancestor) && word_tree.NIL != methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym297$COPULA_P) && word_tree.NIL != methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym298$GET_OBJECTS) && self.eql(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym298$GET_OBJECTS).first(), (SubLObject)word_tree.$sym19$GET_HEAD)) && word_tree.NIL != methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym299$GET_SUBJECT)) {
                    modifieds = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym299$GET_SUBJECT), modifieds);
                    successP = (SubLObject)word_tree.T;
                }
                csome_list_var = csome_list_var.rest();
                ancestor = csome_list_var.first();
            }
        }
        if (word_tree.NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER))) {
            modifieds = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER), modifieds);
        }
        if (word_tree.NIL != word_tree_temporal_tree_p_method(self)) {
            successP = (SubLObject)word_tree.NIL;
            if (word_tree.NIL == successP) {
                SubLObject csome_list_var = ancestors;
                SubLObject ancestor = (SubLObject)word_tree.NIL;
                ancestor = csome_list_var.first();
                while (word_tree.NIL == successP && word_tree.NIL != csome_list_var) {
                    if (word_tree.NIL != parse_tree.verbal_tree_p(ancestor)) {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym115$GET_HEADS);
                        SubLObject head = (SubLObject)word_tree.NIL;
                        head = cdolist_list_var.first();
                        while (word_tree.NIL != cdolist_list_var) {
                            modifieds = (SubLObject)ConsesLow.cons(head, modifieds);
                            cdolist_list_var = cdolist_list_var.rest();
                            head = cdolist_list_var.first();
                        }
                        successP = (SubLObject)word_tree.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    ancestor = csome_list_var.first();
                }
            }
        }
        return modifieds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 21855L)
    public static SubLObject appositive_np_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != parse_tree.np_tree_p(tree) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym301$DAUGHTER_COUNT).numG((SubLObject)word_tree.TWO_INTEGER) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym301$DAUGHTER_COUNT).numL((SubLObject)word_tree.FIVE_INTEGER) && word_tree.NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER)) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ONE_INTEGER), (SubLObject)word_tree.$sym35$GET_CATEGORY) == word_tree.$kw302$_ && word_tree.NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.TWO_INTEGER)) && (methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym301$DAUGHTER_COUNT).numE((SubLObject)word_tree.THREE_INTEGER) || (methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym301$DAUGHTER_COUNT).numE((SubLObject)word_tree.FOUR_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.THREE_INTEGER), (SubLObject)word_tree.$sym35$GET_CATEGORY) == word_tree.$kw302$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
    public static SubLObject subloop_reserved_initialize_nn_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
    public static SubLObject subloop_reserved_initialize_nn_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
    public static SubLObject nn_tree_p(final SubLObject nn_tree) {
        return classes.subloop_instanceof_class(nn_tree, (SubLObject)word_tree.$sym303$NN_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22565L)
    public static SubLObject nn_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.$list308;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
    public static SubLObject name_word_tree_get_quantifier_method(final SubLObject self) {
        final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER);
        return (word_tree.NIL == quantifier && word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym234$PLURAL_P)) ? methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym233$GET_EXISTENTIAL_NULL_DETERMINER) : quantifier;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
    public static SubLObject subloop_reserved_initialize_name_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
    public static SubLObject subloop_reserved_initialize_name_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
    public static SubLObject name_word_tree_p(final SubLObject name_word_tree) {
        return classes.subloop_instanceof_class(name_word_tree, (SubLObject)word_tree.$sym310$NAME_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
    public static SubLObject subloop_reserved_initialize_dollar_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
    public static SubLObject subloop_reserved_initialize_dollar_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
    public static SubLObject dollar_word_tree_p(final SubLObject dollar_word_tree) {
        return classes.subloop_instanceof_class(dollar_word_tree, (SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22974L)
    public static SubLObject dollar_word_tree_get_overt_quantifier_method(final SubLObject self) {
        final SubLObject quant = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
        if (word_tree.NIL != cardinal_word_tree_p(quant)) {
            return quant;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
    public static SubLObject subloop_reserved_initialize_nnp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
    public static SubLObject subloop_reserved_initialize_nnp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
    public static SubLObject nnp_tree_p(final SubLObject nnp_tree) {
        return classes.subloop_instanceof_class(nnp_tree, (SubLObject)word_tree.$sym323$NNP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23342L)
    public static SubLObject nnp_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.$list308;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
    public static SubLObject subloop_reserved_initialize_nns_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
    public static SubLObject subloop_reserved_initialize_nns_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
    public static SubLObject nns_tree_p(final SubLObject nns_tree) {
        return classes.subloop_instanceof_class(nns_tree, (SubLObject)word_tree.$sym327$NNS_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23575L)
    public static SubLObject nns_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.$list331;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
    public static SubLObject subloop_reserved_initialize_nnps_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
    public static SubLObject subloop_reserved_initialize_nnps_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
    public static SubLObject nnps_tree_p(final SubLObject nnps_tree) {
        return classes.subloop_instanceof_class(nnps_tree, (SubLObject)word_tree.$sym333$NNPS_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23804L)
    public static SubLObject nnps_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.$list331;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
    public static SubLObject subloop_reserved_initialize_prp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
    public static SubLObject subloop_reserved_initialize_prp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
    public static SubLObject prp_tree_p(final SubLObject prp_tree) {
        return classes.subloop_instanceof_class(prp_tree, (SubLObject)word_tree.$sym337$PRP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24336L)
    public static SubLObject prp_tree_get_number_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD);
            try {
                SubLObject numbers = (SubLObject)word_tree.NIL;
                if (word_tree.NIL != subl_promotions.memberP(string, word_tree.$singular_personal_pronouns$.getGlobalValue(), (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) {
                    numbers = (SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw289$SINGULAR, numbers);
                }
                if (word_tree.NIL != subl_promotions.memberP(string, word_tree.$plural_personal_pronouns$.getGlobalValue(), (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) {
                    numbers = (SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw292$PLURAL, numbers);
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD, numbers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24721L)
    public static SubLObject prp_tree_get_person_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD, (SubLObject)(string.equalp((SubLObject)word_tree.$str349$I) ? word_tree.ONE_INTEGER : (string.equalp((SubLObject)word_tree.$str350$me) ? word_tree.ONE_INTEGER : (string.equalp((SubLObject)word_tree.$str351$you) ? word_tree.TWO_INTEGER : (string.equalp((SubLObject)word_tree.$str352$we) ? word_tree.ONE_INTEGER : (string.equalp((SubLObject)word_tree.$str353$us) ? word_tree.ONE_INTEGER : word_tree.THREE_INTEGER))))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25014L)
    public static SubLObject prp_tree_get_gender_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD, conses_high.assoc(string, (SubLObject)word_tree.$list357, (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED).rest());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
    public static SubLObject subloop_reserved_initialize_wp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
    public static SubLObject subloop_reserved_initialize_wp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
    public static SubLObject wp_tree_p(final SubLObject wp_tree) {
        return classes.subloop_instanceof_class(wp_tree, (SubLObject)word_tree.$sym359$WP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25996L)
    public static SubLObject wp_tree_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject refs = get_word_tree_refs(self);
        try {
            thread.throwStack.push(word_tree.$sym365$OUTER_CATCH_FOR_WP_TREE_METHOD);
            try {
                final SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym278$GET_ANTECEDENT);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym365$OUTER_CATCH_FOR_WP_TREE_METHOD, (word_tree.NIL != antecedent) ? methods.funcall_instance_method_with_0_args(antecedent, (SubLObject)word_tree.$sym100$GET_REFS) : refs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_refs(self, refs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym365$OUTER_CATCH_FOR_WP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26214L)
    public static SubLObject wp_tree_get_antecedent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym368$OUTER_CATCH_FOR_WP_TREE_METHOD);
            try {
                final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                final SubLObject great_grandmother = (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                if (word_tree.NIL != parse_tree.np_tree_p(great_grandmother) && word_tree.NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER))) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym368$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym368$OUTER_CATCH_FOR_WP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26647L)
    public static SubLObject wp_tree_get_quantifier_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wp_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym371$OUTER_CATCH_FOR_WP_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym371$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym253$QUANTIFIER_TREE_P, number_utilities.f_1_(idx)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym371$OUTER_CATCH_FOR_WP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26844L)
    public static SubLObject wp_tree_get_number_method(final SubLObject self) {
        return (SubLObject)word_tree.$list308;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27021L)
    public static SubLObject wp_tree_get_gender_method(final SubLObject self) {
        return (SubLObject)word_tree.$list376;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27235L)
    public static SubLObject relative_clause_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != parse_tree.sbar_tree_p(tree) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym301$DAUGHTER_COUNT).numE((SubLObject)word_tree.TWO_INTEGER) && (word_tree.NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER)) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str378$that)) && word_tree.NIL != parse_tree.s_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_particle_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(word_tree.$sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                SubLObject filtered = (SubLObject)word_tree.NIL;
                final SubLObject sentence_particle = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym384$GET_PARTICLE);
                final SubLObject sentence_particle_head = (SubLObject)((word_tree.NIL != sentence_particle) ? methods.funcall_instance_method_with_0_args(sentence_particle, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                SubLObject frame = (SubLObject)word_tree.NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = (SubLObject)word_tree.NIL;
                rle = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME);
                    if (word_tree.NIL != cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != isa.isaP(frame, word_tree.$const385$ParticleFrameType, word_tree.$const22$EverythingPSC, (SubLObject)word_tree.UNPROVIDED)) {
                        if (word_tree.NIL != sentence_particle_head) {
                            final SubLObject required_particle_string = lexicon_accessors.get_strings_of_type(cycl_utilities.formula_arg2(frame, (SubLObject)word_tree.UNPROVIDED), word_tree.$const386$VerbParticle, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED).first();
                            if (required_particle_string.equalp(methods.funcall_instance_method_with_0_args(sentence_particle_head, (SubLObject)word_tree.$sym24$GET_STRING))) {
                                cyclifier.rle_set_confidence(rle, (SubLObject)word_tree.ONE_INTEGER);
                                filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                            }
                        }
                    }
                    else if (word_tree.NIL == sentence_particle_head) {
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                lexes = filtered;
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_partition_semantic_complements_method(final SubLObject self) {
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS);
        if (word_tree.NIL != subject) {
            non_distributing = cyclifier_interface.delete_cyclifiable(subject, non_distributing);
        }
        return Values.values(non_distributing, (SubLObject)((word_tree.NIL != subject) ? ConsesLow.list(subject) : word_tree.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list393;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        SubLObject disjuncts = (SubLObject)word_tree.NIL;
        SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT);
        final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
        final SubLObject cl_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
        if (word_tree.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym35$GET_CATEGORY), (SubLObject)word_tree.$list397, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL == subject) {
            subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
        }
        if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw398$ACTION, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw398$ACTION, self), conjuncts);
        }
        if (word_tree.NIL != subject && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw399$SUBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw399$SUBJECT, subject), conjuncts);
        }
        if (word_tree.NIL != direct_object && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw400$OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw400$OBJECT, direct_object), conjuncts);
        }
        if (word_tree.NIL != indirect_object && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, indirect_object), conjuncts);
        }
        if (word_tree.NIL != oblique_object && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw207$PREP_OBJECT, oblique_object), conjuncts);
        }
        if (word_tree.NIL != modified && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw206$NOUN, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw206$NOUN, modified), conjuncts);
        }
        if (word_tree.NIL != cl_complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw401$CLAUSE, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            SubLObject cdolist_list_var;
            final SubLObject cl_cycls = cdolist_list_var = methods.funcall_instance_method_with_0_args(cl_complement, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
            SubLObject cl_cycl = (SubLObject)word_tree.NIL;
            cl_cycl = cdolist_list_var.first();
            while (word_tree.NIL != cdolist_list_var) {
                cl_cycl = simplifier.lift_conjuncts(cl_cycl);
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw401$CLAUSE, cl_cycl), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                cl_cycl = cdolist_list_var.first();
            }
        }
        if (word_tree.NIL != cl_complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw402$INF_COMP, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw402$INF_COMP, cl_complement), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_get_controller_method(final SubLObject self) {
        final SubLObject control_verb = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym406$GET_CONTROL_VERB);
        if (word_tree.NIL == control_verb) {
            return (SubLObject)word_tree.NIL;
        }
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(control_verb, (SubLObject)word_tree.$sym407$SUBJECT_CONTROLLER_P)) {
            return methods.funcall_instance_method_with_0_args(control_verb, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        }
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(control_verb, (SubLObject)word_tree.$sym408$OBJECT_CONTROLLER_P)) {
            return methods.funcall_instance_method_with_0_args(control_verb, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_get_control_verb_method(final SubLObject self) {
        final SubLObject matrix = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym412$GET_MATRIX_CLAUSE);
        final SubLObject matrix_head = (SubLObject)((word_tree.NIL != matrix) ? methods.funcall_instance_method_with_0_args(matrix, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
        if (word_tree.NIL != matrix_head && word_tree.NIL != methods.funcall_instance_method_with_0_args(matrix_head, (SubLObject)word_tree.$sym413$CONTROL_VERB_P)) {
            return matrix_head;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_object_controller_p_method(final SubLObject self) {
        SubLObject result = (SubLObject)word_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym94$GET_LEXES);
        SubLObject lex = (SubLObject)word_tree.NIL;
        lex = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            result = conses_high.member(methods.funcall_instance_method_with_1_args(lex, (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME), (SubLObject)word_tree.$list416, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED);
            if (word_tree.NIL != result) {
                return list_utilities.sublisp_boolean(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_subject_controller_p_method(final SubLObject self) {
        SubLObject result = (SubLObject)word_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym94$GET_LEXES);
        SubLObject lex = (SubLObject)word_tree.NIL;
        lex = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            result = conses_high.member(methods.funcall_instance_method_with_1_args(lex, (SubLObject)word_tree.$sym10$GET, (SubLObject)word_tree.$kw20$FRAME), (SubLObject)word_tree.$list419, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED);
            if (word_tree.NIL != result) {
                return list_utilities.sublisp_boolean(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_control_verb_p_method(final SubLObject self) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym407$SUBJECT_CONTROLLER_P) || word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym408$OBJECT_CONTROLLER_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_get_matrix_clause_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS);
        SubLObject ancestor = (SubLObject)word_tree.NIL;
        ancestor = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            if (word_tree.NIL != parse_tree.sentential_tree_p(ancestor) && !methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym19$GET_HEAD).eql(self)) {
                return ancestor;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject subloop_reserved_initialize_verbal_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject subloop_reserved_initialize_verbal_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
    public static SubLObject verbal_word_tree_p(final SubLObject verbal_word_tree) {
        return classes.subloop_instanceof_class(verbal_word_tree, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 29841L)
    public static SubLObject verbal_word_tree_get_predicate_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym429$GET_SEMANTIC_HEAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30002L)
    public static SubLObject verbal_word_tree_get_number_method(final SubLObject self) {
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym432$FINITE_P)) {
            final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT);
            return (SubLObject)((word_tree.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)word_tree.$sym238$GET_NUMBER) : word_tree.NIL);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30302L)
    public static SubLObject verbal_word_tree_get_person_method(final SubLObject self) {
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym432$FINITE_P)) {
            final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT);
            return (SubLObject)((word_tree.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)word_tree.$sym285$GET_PERSON) : word_tree.NIL);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30556L)
    public static SubLObject verbal_word_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30726L)
    public static SubLObject verbal_word_tree_get_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject subject = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1_(idx));
                if (word_tree.NIL != subject) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, subject);
                }
                final SubLObject controller = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym404$GET_CONTROLLER);
                if (word_tree.NIL != controller) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, controller);
                }
                if (word_tree.NIL != parse_tree.verbal_tree_p(mother)) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym299$GET_SUBJECT));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 31103L)
    public static SubLObject verbal_word_tree_get_objects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT);
                final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT);
                SubLObject objects = (SubLObject)word_tree.NIL;
                if (word_tree.NIL != indirect_object) {
                    objects = (SubLObject)ConsesLow.cons(indirect_object, objects);
                }
                if (word_tree.NIL != direct_object) {
                    objects = (SubLObject)ConsesLow.cons(direct_object, objects);
                }
                if (word_tree.NIL != mother) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
                    SubLObject pp = (SubLObject)word_tree.NIL;
                    pp = cdolist_list_var.first();
                    while (word_tree.NIL != cdolist_list_var) {
                        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym446$STRANDED_P)) {
                            objects = Sequences.delete(methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT), objects, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pp = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, objects);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 31944L)
    public static SubLObject verbal_word_tree_get_moved_nps_method(final SubLObject self) {
        SubLObject moved = (SubLObject)word_tree.NIL;
        if (word_tree.NIL == moved) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS).rest();
            SubLObject ancestor = (SubLObject)word_tree.NIL;
            ancestor = csome_list_var.first();
            while (word_tree.NIL == moved && word_tree.NIL != csome_list_var) {
                if (word_tree.NIL != parse_tree.verbal_tree_p(ancestor)) {
                    moved = methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym451$WHNP_TREE_P);
                }
                csome_list_var = csome_list_var.rest();
                ancestor = csome_list_var.first();
            }
        }
        return moved;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32258L)
    public static SubLObject verbal_word_tree_get_moved_objects_method(final SubLObject self) {
        return Sequences.delete(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT), methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym449$GET_MOVED_NPS), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32479L)
    public static SubLObject verbal_word_tree_get_direct_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject moved = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym453$GET_MOVED_OBJECTS);
                final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx));
                final SubLObject n = Sequences.length(locals);
                if (n.numE((SubLObject)word_tree.TWO_INTEGER)) {
                    if (word_tree.NIL != methods.funcall_instance_method_with_0_args(conses_high.second(locals), (SubLObject)word_tree.$sym149$TEMPORAL_TREE_P)) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
                    }
                    else {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, conses_high.second(locals));
                    }
                }
                else if (n.numE((SubLObject)word_tree.ONE_INTEGER) && word_tree.NIL == moved) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
                }
                else if (!n.numL((SubLObject)word_tree.TWO_INTEGER) || word_tree.NIL == moved || word_tree.NIL != Dynamic.sublisp_throw((SubLObject)word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first())) {}
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32966L)
    public static SubLObject verbal_word_tree_get_indirect_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
                if (word_tree.NIL != oblique_object) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, oblique_object);
                }
                final SubLObject moved = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym453$GET_MOVED_OBJECTS);
                final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx));
                final SubLObject n = Sequences.length(locals);
                if (n.numE((SubLObject)word_tree.TWO_INTEGER) && word_tree.NIL == methods.funcall_instance_method_with_0_args(conses_high.second(locals), (SubLObject)word_tree.$sym149$TEMPORAL_TREE_P)) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
                }
                else if (!n.numE((SubLObject)word_tree.ONE_INTEGER) || word_tree.NIL == moved || word_tree.NIL != Dynamic.sublisp_throw((SubLObject)word_tree.$sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first())) {}
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33533L)
    public static SubLObject verbal_word_tree_get_semantic_direct_object_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33718L)
    public static SubLObject verbal_word_tree_get_semantic_indirect_object_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33909L)
    public static SubLObject verbal_word_tree_get_verbal_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym468$VERBAL_PHRASE_TREE_P, number_utilities.f_1X(idx)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34113L)
    public static SubLObject verbal_word_tree_get_adjectival_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym473$ADJP_TREE_P, number_utilities.f_1X(idx)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34311L)
    public static SubLObject verbal_word_tree_get_complements_method(final SubLObject self) {
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        final SubLObject complements = ConsesLow.append((SubLObject)((word_tree.NIL != subject) ? ConsesLow.list(subject) : word_tree.NIL), methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym476$GET_SEMANTIC_OBJECTS), (SubLObject)((word_tree.NIL != verbal_complement) ? ConsesLow.list(verbal_complement) : word_tree.NIL));
        return complements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34729L)
    public static SubLObject verbal_word_tree_get_particle_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject particle_phrase = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym480$PRT_TREE_P, number_utilities.f_1X(idx));
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, (SubLObject)((word_tree.NIL != particle_phrase) ? particle_phrase : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34998L)
    public static SubLObject verbal_word_tree_get_infinitive_marker_method(final SubLObject self) {
        final SubLObject vp = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym139$GET_MOTHER);
        final SubLObject candidate = methods.funcall_instance_method_with_1_args(vp, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.MINUS_ONE_INTEGER);
        if (word_tree.NIL != candidate && methods.funcall_instance_method_with_0_args(candidate, (SubLObject)word_tree.$sym35$GET_CATEGORY) == word_tree.$kw484$TO) {
            return candidate;
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35295L)
    public static SubLObject verbal_word_tree_dummy_to_p_method(final SubLObject self) {
        return Equality.eql(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym24$GET_STRING), (SubLObject)word_tree.$str488$to);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35468L)
    public static SubLObject verbal_word_tree_get_semantic_subject_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35642L)
    public static SubLObject verbal_word_tree_get_semantic_objects_method(final SubLObject self) {
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT);
        SubLObject semantic_objects = (SubLObject)word_tree.NIL;
        if (word_tree.NIL != indirect_object) {
            semantic_objects = (SubLObject)ConsesLow.cons(indirect_object, semantic_objects);
        }
        if (word_tree.NIL != direct_object) {
            semantic_objects = (SubLObject)ConsesLow.cons(direct_object, semantic_objects);
        }
        return semantic_objects;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36099L)
    public static SubLObject verbal_word_tree_get_ancestor_objects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym494$GET_ANCESTOR_OBJECTS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36297L)
    public static SubLObject verbal_word_tree_inverted_p_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36440L)
    public static SubLObject verbal_word_tree_finite_p_method(final SubLObject self) {
        return parse_tree.finite_verbal_word_tree_p(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36608L)
    public static SubLObject verbal_word_tree_passive_p_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36776L)
    public static SubLObject verbal_word_tree_infinitive_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym482$GET_INFINITIVE_MARKER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36975L)
    public static SubLObject verbal_word_tree_base_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym506$INFINITIVE_P) || (word_tree.NIL != grandmother && (word_tree.NIL != methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym512$MODAL_VERB_TREE_P) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str513$did)))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
    public static SubLObject subloop_reserved_initialize_vbz_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
    public static SubLObject subloop_reserved_initialize_vbz_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
    public static SubLObject vbz_tree_p(final SubLObject vbz_tree) {
        return classes.subloop_instanceof_class(vbz_tree, (SubLObject)word_tree.$sym515$VBZ_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37520L)
    public static SubLObject vbz_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)word_tree.$kw521$PRESENT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
    public static SubLObject subloop_reserved_initialize_vbn_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
    public static SubLObject subloop_reserved_initialize_vbn_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
    public static SubLObject vbn_tree_p(final SubLObject vbn_tree) {
        return classes.subloop_instanceof_class(vbn_tree, (SubLObject)word_tree.$sym523$VBN_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38024L)
    public static SubLObject vbn_tree_get_aux_verb_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_vbn_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD);
            try {
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD, (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym530$AUX_VERB_TREE_P) : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_vbn_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38278L)
    public static SubLObject vbn_tree_get_semantic_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_vbn_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD);
            try {
                if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym503$PASSIVE_P)) {
                    final SubLObject pps = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P) : word_tree.NIL);
                    SubLObject pphead = (SubLObject)word_tree.NIL;
                    SubLObject preposition = (SubLObject)word_tree.NIL;
                    SubLObject cdolist_list_var = pps;
                    SubLObject pp = (SubLObject)word_tree.NIL;
                    pp = cdolist_list_var.first();
                    while (word_tree.NIL != cdolist_list_var) {
                        pphead = methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym19$GET_HEAD);
                        preposition = (SubLObject)((word_tree.NIL != pphead) ? methods.funcall_instance_method_with_0_args(pphead, (SubLObject)word_tree.$sym24$GET_STRING) : word_tree.NIL);
                        if (preposition.equal((SubLObject)word_tree.$str534$by)) {
                            Dynamic.sublisp_throw((SubLObject)word_tree.$sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(pp, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pp = cdolist_list_var.first();
                    }
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_vbn_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38797L)
    public static SubLObject vbn_tree_get_semantic_direct_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_vbn_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD);
            try {
                if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym503$PASSIVE_P)) {
                    final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx));
                    final SubLObject n = Sequences.length(locals);
                    if (n.numE((SubLObject)word_tree.ONE_INTEGER)) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, locals.first());
                    }
                    else if (n.numE((SubLObject)word_tree.ZERO_INTEGER)) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT));
                    }
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_vbn_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39193L)
    public static SubLObject vbn_tree_get_semantic_indirect_object_method(final SubLObject self) {
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym503$PASSIVE_P)) {
            final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
            return (word_tree.NIL != oblique_object) ? oblique_object : methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT);
        }
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39635L)
    public static SubLObject vbn_tree_passive_p_method(final SubLObject self) {
        final SubLObject aux = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym527$GET_AUX_VERB);
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != aux && word_tree.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(aux, (SubLObject)word_tree.$sym24$GET_STRING), word_tree.$to_be_forms$.getGlobalValue(), (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
    public static SubLObject subloop_reserved_initialize_vbd_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
    public static SubLObject subloop_reserved_initialize_vbd_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
    public static SubLObject vbd_tree_p(final SubLObject vbd_tree) {
        return classes.subloop_instanceof_class(vbd_tree, (SubLObject)word_tree.$sym544$VBD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40035L)
    public static SubLObject vbd_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)word_tree.$kw548$PAST;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
    public static SubLObject subloop_reserved_initialize_vbp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
    public static SubLObject subloop_reserved_initialize_vbp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
    public static SubLObject vbp_tree_p(final SubLObject vbp_tree) {
        return classes.subloop_instanceof_class(vbp_tree, (SubLObject)word_tree.$sym550$VBP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40337L)
    public static SubLObject vbp_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)word_tree.$kw521$PRESENT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
    public static SubLObject subloop_reserved_initialize_vb_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
    public static SubLObject subloop_reserved_initialize_vb_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
    public static SubLObject vb_tree_p(final SubLObject vb_tree) {
        return classes.subloop_instanceof_class(vb_tree, (SubLObject)word_tree.$sym554$VB_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40603L)
    public static SubLObject vb_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)word_tree.$kw558$INFINITIVE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
    public static SubLObject subloop_reserved_initialize_vbg_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
    public static SubLObject subloop_reserved_initialize_vbg_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
    public static SubLObject vbg_tree_p(final SubLObject vbg_tree) {
        return classes.subloop_instanceof_class(vbg_tree, (SubLObject)word_tree.$sym560$VBG_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40927L)
    public static SubLObject vbg_tree_get_aux_verb_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_vbg_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD);
            try {
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD, (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym530$AUX_VERB_TREE_P) : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_vbg_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41181L)
    public static SubLObject vbg_tree_get_modifieds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_vbg_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD);
            try {
                if (word_tree.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym527$GET_AUX_VERB)) {
                    final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                    final SubLObject grandmas_head = (SubLObject)((word_tree.NIL != grandmother && word_tree.NIL != parse_tree.nominal_phrase_tree_p(grandmother)) ? methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD, (SubLObject)((word_tree.NIL != grandmas_head) ? ConsesLow.list(grandmas_head) : word_tree.NIL));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_vbg_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_copula_p_method(final SubLObject self) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list576;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        SubLObject disjuncts = (SubLObject)word_tree.NIL;
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS).first();
        if (word_tree.NIL != subject && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw399$SUBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw399$SUBJECT, subject), conjuncts);
        }
        if (word_tree.NIL != direct_object && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw400$OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw400$OBJECT, direct_object), conjuncts);
        }
        if (word_tree.NIL != complement && (word_tree.NIL == subject || !complement.eql(subject)) && !complement.eql(direct_object) && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw577$COMPLEMENT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            SubLObject comp_cycls = methods.funcall_instance_method_with_0_args(complement, (SubLObject)word_tree.$sym48$CYCLIFY_INT);
            if (word_tree.NIL == comp_cycls) {
                comp_cycls = (SubLObject)ConsesLow.cons((SubLObject)word_tree.NIL, comp_cycls);
            }
            SubLObject cdolist_list_var = comp_cycls;
            SubLObject comp_cycl = (SubLObject)word_tree.NIL;
            comp_cycl = cdolist_list_var.first();
            while (word_tree.NIL != cdolist_list_var) {
                comp_cycl = simplifier.lift_conjuncts(comp_cycl);
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw577$COMPLEMENT, comp_cycl), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                comp_cycl = cdolist_list_var.first();
            }
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_get_semantic_complements_method(final SubLObject self) {
        if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym297$COPULA_P)) {
            return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS);
        }
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        return (SubLObject)((word_tree.NIL != complement) ? ConsesLow.list(complement) : word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_get_complements_method(final SubLObject self) {
        SubLObject complements = (SubLObject)word_tree.NIL;
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT);
        final SubLObject v_object = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        final SubLObject prep_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym582$GET_PREPOSITIONAL_COMPLEMENT);
        final SubLObject adj_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym470$GET_ADJECTIVAL_COMPLEMENT);
        final SubLObject adv_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym583$GET_ADVERBIAL_COMPLEMENT);
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(adv_complement, adj_complement, prep_complement, verbal_complement, v_object, subject);
        SubLObject complement = (SubLObject)word_tree.NIL;
        complement = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            if (word_tree.NIL != complement) {
                complements = (SubLObject)ConsesLow.cons(complement, complements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        }
        return complements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_get_semantic_heads_method(final SubLObject self) {
        final SubLObject main_verb = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        return (SubLObject)((word_tree.NIL != main_verb) ? methods.funcall_instance_method_with_0_args(main_verb, (SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS) : ConsesLow.list(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_get_tense_method(final SubLObject self) {
        return (SubLObject)((word_tree.NIL != conses_high.member(word_tree_get_string_method(self), (SubLObject)word_tree.$list588, (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) ? word_tree.$kw521$PRESENT : ((word_tree.NIL != conses_high.member(word_tree_get_string_method(self), (SubLObject)word_tree.$list589, (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) ? word_tree.$kw548$PAST : ((word_tree.NIL != conses_high.member(word_tree_get_string_method(self), (SubLObject)word_tree.$list590, (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) ? word_tree.$kw558$INFINITIVE : word_tree.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject subloop_reserved_initialize_aux_verb_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject subloop_reserved_initialize_aux_verb_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
    public static SubLObject aux_verb_tree_p(final SubLObject aux_verb_tree) {
        return classes.subloop_instanceof_class(aux_verb_tree, (SubLObject)word_tree.$sym569$AUX_VERB_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 42559L)
    public static SubLObject aux_verb_tree_get_prepositional_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_aux_verb_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
            try {
                final SubLObject pp = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, (SubLObject)((word_tree.NIL != pp) ? pp : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_aux_verb_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 42839L)
    public static SubLObject aux_verb_tree_get_adverbial_complement_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43006L)
    public static SubLObject aux_verb_tree_get_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_aux_verb_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
            try {
                SubLObject subject = (SubLObject)word_tree.NIL;
                if (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym498$INVERTED_P)) {
                    subject = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx));
                }
                else {
                    subject = methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1_(idx));
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, (word_tree.NIL != subject) ? subject : methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym299$GET_SUBJECT));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_aux_verb_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43365L)
    public static SubLObject aux_verb_tree_get_direct_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_aux_verb_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, (word_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym498$INVERTED_P)) ? conses_high.second(methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym135$FIND, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx))) : methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P, number_utilities.f_1X(idx)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_aux_verb_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43693L)
    public static SubLObject aux_verb_tree_get_indirect_object_method(final SubLObject self) {
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        final SubLObject main_verb = (SubLObject)((word_tree.NIL != verbal_complement) ? methods.funcall_instance_method_with_0_args(verbal_complement, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
        return (SubLObject)((word_tree.NIL != main_verb) ? methods.funcall_instance_method_with_0_args(main_verb, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT) : word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44073L)
    public static SubLObject aux_verb_tree_get_semantic_subject_method(final SubLObject self) {
        final SubLObject sister = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
        if (word_tree.NIL != sister && word_tree.NIL != parse_tree.nominal_tree_p(sister)) {
            return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym299$GET_SUBJECT);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44340L)
    public static SubLObject aux_verb_tree_inverted_p_method(final SubLObject self) {
        final SubLObject matrix = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym412$GET_MATRIX_CLAUSE);
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != matrix && ((word_tree.NIL != parse_tree.question_tree_p(matrix) && word_tree.NIL == parse_tree.verbal_phrase_tree_p(methods.funcall_instance_method_with_1_args(matrix, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER))) || word_tree.NIL != parse_tree.sinv_tree_p(matrix)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44683L)
    public static SubLObject aux_verb_tree_passive_p_method(final SubLObject self) {
        final SubLObject main = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
        return (SubLObject)((word_tree.NIL != main) ? methods.funcall_instance_method_with_0_args(main, (SubLObject)word_tree.$sym503$PASSIVE_P) : word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
    public static SubLObject subloop_reserved_initialize_modal_verb_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
    public static SubLObject subloop_reserved_initialize_modal_verb_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
    public static SubLObject modal_verb_tree_p(final SubLObject modal_verb_tree) {
        return classes.subloop_instanceof_class(modal_verb_tree, (SubLObject)word_tree.$sym613$MODAL_VERB_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45133L)
    public static SubLObject modal_verb_tree_get_tense_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_modal_verb_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD, (SubLObject)(string.equalp((SubLObject)word_tree.$str619$will) ? word_tree.$kw620$FUTURE : word_tree.$kw521$PRESENT));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_modal_verb_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_modal_verb_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45433L)
    public static SubLObject modal_verb_tree_get_objects_method(final SubLObject self) {
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
    public static SubLObject adjectival_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list629;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
        final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
        final SubLObject obl_obj_head = (SubLObject)((word_tree.NIL != obl_obj) ? methods.funcall_instance_method_with_0_args(obl_obj, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
        if (word_tree.NIL != modified) {
            if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw206$NOUN, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw206$NOUN, modified), conjuncts);
            }
            if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw398$ACTION, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw398$ACTION, modified), conjuncts);
            }
            if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw12$REPLACE, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
                conjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw12$REPLACE, (SubLObject)word_tree.NIL)), conjuncts);
            }
        }
        if (word_tree.NIL != obl_obj_head && word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw68$OBLIQUE_OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw207$PREP_OBJECT, obl_obj_head), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, (SubLObject)word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
    public static SubLObject adjectival_word_tree_get_complements_method(final SubLObject self) {
        final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS);
        final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
        return ConsesLow.append(modifieds, (SubLObject)((word_tree.NIL != obl_obj) ? ConsesLow.list(obl_obj) : word_tree.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
    public static SubLObject subloop_reserved_initialize_adjectival_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
    public static SubLObject subloop_reserved_initialize_adjectival_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
    public static SubLObject adjectival_word_tree_p(final SubLObject adjectival_word_tree) {
        return classes.subloop_instanceof_class(adjectival_word_tree, (SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45987L)
    public static SubLObject adjectival_word_tree_get_modifieds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_adjectival_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
            try {
                final SubLObject head = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym637$GET_HEAD_DAUGHTER);
                SubLObject complement = (SubLObject)((word_tree.NIL != parse_tree.nominal_tree_p(head)) ? head : word_tree.NIL);
                if (word_tree.NIL == complement && word_tree.NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER))) {
                    complement = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
                }
                if (word_tree.NIL == complement && word_tree.NIL != mother && word_tree.NIL != aux_verb_tree_p(methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.MINUS_ONE_INTEGER))) {
                    final SubLObject subject = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.MINUS_ONE_INTEGER), (SubLObject)word_tree.$sym299$GET_SUBJECT);
                    final SubLObject head_$12 = (SubLObject)((word_tree.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                    if (word_tree.NIL != head_$12) {
                        complement = head_$12;
                    }
                }
                if (word_tree.NIL == complement) {
                    final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                    final SubLObject modified = (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym441$NOMINAL_TREE_P) : word_tree.NIL);
                    final SubLObject mod_head = (SubLObject)((word_tree.NIL != modified) ? methods.funcall_instance_method_with_0_args(modified, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                    if (word_tree.NIL != mod_head) {
                        complement = mod_head;
                    }
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, (SubLObject)((word_tree.NIL != complement) ? ConsesLow.list(complement) : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_adjectival_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47019L)
    public static SubLObject adjectival_word_tree_get_verbal_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_adjectival_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym641$SBAR_TREE_P));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_adjectival_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
    public static SubLObject adverbial_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list648;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
        final SubLObject subject = (SubLObject)((word_tree.NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, (SubLObject)word_tree.$sym299$GET_SUBJECT) : word_tree.NIL);
        final SubLObject v_object = (SubLObject)((word_tree.NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, (SubLObject)word_tree.$sym298$GET_OBJECTS).first() : word_tree.NIL);
        if (word_tree.NIL != modified && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw398$ACTION, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw398$ACTION, modified), conjuncts);
        }
        if (word_tree.NIL != subject && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw399$SUBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw399$SUBJECT, subject), conjuncts);
        }
        if (word_tree.NIL != v_object && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw400$OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw400$OBJECT, v_object), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, (SubLObject)word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
    public static SubLObject subloop_reserved_initialize_adverbial_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
    public static SubLObject subloop_reserved_initialize_adverbial_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
    public static SubLObject adverbial_word_tree_p(final SubLObject adverbial_word_tree) {
        return classes.subloop_instanceof_class(adverbial_word_tree, (SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47485L)
    public static SubLObject adverbial_word_tree_get_modifieds_method(final SubLObject self) {
        final SubLObject sister = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
        if (word_tree.NIL != adjectival_word_tree_p(sister) || word_tree.NIL != adverbial_word_tree_p(sister) || word_tree.NIL != prepositional_or_particle_word_tree_p(sister) || word_tree.NIL != parse_tree.numerical_tree_p(sister)) {
            return (SubLObject)ConsesLow.list(sister);
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS);
        SubLObject ancestor = (SubLObject)word_tree.NIL;
        ancestor = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            if (word_tree.NIL != parse_tree.verbal_phrase_tree_p(ancestor)) {
                return methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
    public static SubLObject subloop_reserved_initialize_wrb_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
    public static SubLObject subloop_reserved_initialize_wrb_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
    public static SubLObject wrb_word_tree_p(final SubLObject wrb_word_tree) {
        return classes.subloop_instanceof_class(wrb_word_tree, (SubLObject)word_tree.$sym654$WRB_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
    public static SubLObject prepositional_or_particle_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list663;
        }
        if (!methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym24$GET_STRING).equalp((SubLObject)word_tree.$str378$that)) {
            SubLObject conjuncts = (SubLObject)word_tree.NIL;
            final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS).first();
            final SubLObject complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT);
            final SubLObject clause = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT);
            if (word_tree.NIL != modified && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw206$NOUN, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != cyclifier_interface.nominal_word_p(modified)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw206$NOUN, modified), conjuncts);
            }
            if (word_tree.NIL != modified && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw398$ACTION, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED) && word_tree.NIL != cyclifier_interface.verbal_word_p(modified)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw398$ACTION, modified), conjuncts);
            }
            if (word_tree.NIL != complement && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw400$OBJECT, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw400$OBJECT, complement), conjuncts);
            }
            if (word_tree.NIL != clause && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw401$CLAUSE, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
                conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw401$CLAUSE, clause), conjuncts);
            }
            return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, (SubLObject)word_tree.NIL);
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
    public static SubLObject prepositional_or_particle_word_tree_p(final SubLObject prepositional_or_particle_word_tree) {
        return classes.subloop_instanceof_class(prepositional_or_particle_word_tree, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48682L)
    public static SubLObject prepositional_or_particle_word_tree_get_oblique_object_method(final SubLObject self) {
        final SubLObject sister = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
        if (word_tree.NIL != sister && (word_tree.NIL != parse_tree.nominal_tree_p(sister) || word_tree.NIL != parse_tree.sentential_tree_p(sister))) {
            return sister;
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS);
        SubLObject ancestor = (SubLObject)word_tree.NIL;
        ancestor = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            if ((word_tree.NIL != parse_tree.sbar_tree_p(ancestor) || word_tree.NIL != parse_tree.sbarq_tree_p(ancestor)) && word_tree.NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER))) {
                return methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 49310L)
    public static SubLObject prepositional_or_particle_word_tree_get_verbal_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prepositional_or_particle_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject idx = parse_tree.get_parse_tree_idx(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, (SubLObject)word_tree.$sym249$FIND_FIRST, (SubLObject)word_tree.$sym671$VERBAL_TREE_P, number_utilities.f_1X(idx)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_idx(self, idx);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prepositional_or_particle_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 49542L)
    public static SubLObject prepositional_or_particle_word_tree_get_complements_method(final SubLObject self) {
        final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym146$GET_MODIFIEDS);
        final SubLObject sister = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
        if (word_tree.NIL != sister && (word_tree.NIL != parse_tree.nominal_tree_p(sister) || word_tree.NIL != parse_tree.sentential_tree_p(sister))) {
            return ConsesLow.append(modifieds, (SubLObject)ConsesLow.list(sister));
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym295$GET_ANCESTORS);
        SubLObject ancestor = (SubLObject)word_tree.NIL;
        ancestor = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            if ((word_tree.NIL != parse_tree.sbar_tree_p(ancestor) || word_tree.NIL != parse_tree.sbarq_tree_p(ancestor)) && word_tree.NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER))) {
                return ConsesLow.append(modifieds, (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(ancestor, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER)));
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        }
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 50243L)
    public static SubLObject prepositional_or_particle_word_tree_get_modifieds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prepositional_or_particle_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
            try {
                SubLObject complements = (SubLObject)word_tree.NIL;
                SubLObject candidates = (SubLObject)word_tree.NIL;
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                final SubLObject grandmother_head = (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                final SubLObject sister = methods.funcall_instance_method_with_1_args(mother, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.ONE_INTEGER);
                if (word_tree.NIL != parse_tree.whpp_tree_p(mother) && word_tree.NIL != parse_tree.question_tree_p(grandmother) && word_tree.NIL != sister && word_tree.NIL != parse_tree.sq_tree_p(sister)) {
                    final SubLObject last_phrase = methods.funcall_instance_method_with_1_args(sister, (SubLObject)word_tree.$sym246$FIND_LAST, (SubLObject)word_tree.$sym677$PHRASE_TREE_P);
                    if (word_tree.NIL != last_phrase) {
                        candidates = methods.funcall_instance_method_with_0_args(last_phrase, (SubLObject)word_tree.$sym115$GET_HEADS);
                    }
                }
                else if (word_tree.NIL != grandmother_head) {
                    candidates = (SubLObject)((word_tree.NIL != aux_verb_tree_p(grandmother_head) && word_tree.NIL != methods.funcall_instance_method_with_0_args(grandmother_head, (SubLObject)word_tree.$sym299$GET_SUBJECT) && word_tree.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, (SubLObject)word_tree.$sym299$GET_SUBJECT), (SubLObject)word_tree.$sym19$GET_HEAD)) ? ConsesLow.list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, (SubLObject)word_tree.$sym299$GET_SUBJECT), (SubLObject)word_tree.$sym19$GET_HEAD)) : ((word_tree.NIL != adjectival_word_tree_p(grandmother_head)) ? word_tree.NIL : (grandmother_head.eql(self) ? word_tree.NIL : ConsesLow.list(grandmother_head))));
                }
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = (SubLObject)word_tree.NIL;
                candidate = cdolist_list_var.first();
                while (word_tree.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(candidate, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS);
                    SubLObject complement = (SubLObject)word_tree.NIL;
                    complement = cdolist_list_var_$13.first();
                    while (word_tree.NIL != cdolist_list_var_$13) {
                        if (complement.eql(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT))) {
                            complements = (SubLObject)ConsesLow.cons(candidate, complements);
                        }
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        complement = cdolist_list_var_$13.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, conses_high.set_difference(candidates, complements, (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prepositional_or_particle_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52268L)
    public static SubLObject prepositional_or_particle_word_tree_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prepositional_or_particle_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
            try {
                SubLObject comp_refs = (SubLObject)word_tree.NIL;
                if (string.equalp((SubLObject)word_tree.$str70$of)) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT), (SubLObject)word_tree.$sym100$GET_REFS);
                    SubLObject ref = (SubLObject)word_tree.NIL;
                    ref = cdolist_list_var.first();
                    while (word_tree.NIL != cdolist_list_var) {
                        comp_refs = (SubLObject)ConsesLow.cons(ref, comp_refs);
                        cdolist_list_var = cdolist_list_var.rest();
                        ref = cdolist_list_var.first();
                    }
                    set_word_tree_refs(self, comp_refs);
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, get_word_tree_refs(self));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prepositional_or_particle_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52630L)
    public static SubLObject prepositional_or_particle_word_tree_get_antecedent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prepositional_or_particle_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
            try {
                if (string.equalp((SubLObject)word_tree.$str378$that)) {
                    final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                    if (word_tree.NIL != parse_tree.np_tree_p(grandmother)) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym19$GET_HEAD));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prepositional_or_particle_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
    public static SubLObject subloop_reserved_initialize_prepositional_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
    public static SubLObject subloop_reserved_initialize_prepositional_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
    public static SubLObject prepositional_word_tree_p(final SubLObject prepositional_word_tree) {
        return classes.subloop_instanceof_class(prepositional_word_tree, (SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
    public static SubLObject subloop_reserved_initialize_particle_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
    public static SubLObject subloop_reserved_initialize_particle_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
    public static SubLObject particle_word_tree_p(final SubLObject particle_word_tree) {
        return classes.subloop_instanceof_class(particle_word_tree, (SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
    public static SubLObject subloop_reserved_initialize_specifier_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
    public static SubLObject subloop_reserved_initialize_specifier_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
    public static SubLObject specifier_word_tree_p(final SubLObject specifier_word_tree) {
        return classes.subloop_instanceof_class(specifier_word_tree, (SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53375L)
    public static SubLObject specifier_word_tree_get_specified_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_specifier_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym19$GET_HEAD));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_specifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_specifier_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
    public static SubLObject quantifier_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list706;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        final SubLObject disjuncts = (SubLObject)word_tree.NIL;
        if (word_tree.NIL != subl_promotions.memberP((SubLObject)word_tree.$kw206$NOUN, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw206$NOUN, self), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
    public static SubLObject subloop_reserved_initialize_quantifier_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
    public static SubLObject subloop_reserved_initialize_quantifier_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
    public static SubLObject quantifier_word_tree_p(final SubLObject quantifier_word_tree) {
        return classes.subloop_instanceof_class(quantifier_word_tree, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53865L)
    public static SubLObject quantifier_word_tree_get_quantified_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_quantifier_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD);
            try {
                if (word_tree.NIL != parse_tree.nominal_phrase_tree_p(mother)) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym19$GET_HEAD));
                }
                else if (word_tree.NIL != parse_tree.whadjp_tree_p(mother)) {
                    final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER);
                    if (word_tree.NIL != grandmother) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym19$GET_HEAD));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_quantifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_quantifier_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54248L)
    public static SubLObject quantifier_word_tree_get_specified_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym710$GET_QUANTIFIED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
    public static SubLObject subloop_reserved_initialize_determiner_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
    public static SubLObject subloop_reserved_initialize_determiner_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
    public static SubLObject determiner_word_tree_p(final SubLObject determiner_word_tree) {
        return classes.subloop_instanceof_class(determiner_word_tree, (SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
    public static SubLObject subloop_reserved_initialize_prpX_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
    public static SubLObject subloop_reserved_initialize_prpX_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
    public static SubLObject prpX_tree_p(final SubLObject prpX_tree) {
        return classes.subloop_instanceof_class(prpX_tree, (SubLObject)word_tree.$sym719$PRP__TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54897L)
    public static SubLObject prpX_tree_get_number_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prpX_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD);
            try {
                SubLObject numbers = (SubLObject)word_tree.NIL;
                if (word_tree.NIL != subl_promotions.memberP(string, word_tree.$singular_possessive_pronouns$.getGlobalValue(), (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) {
                    numbers = (SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw289$SINGULAR, numbers);
                }
                if (word_tree.NIL != subl_promotions.memberP(string, word_tree.$plural_possessive_pronouns$.getGlobalValue(), (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED)) {
                    numbers = (SubLObject)ConsesLow.cons((SubLObject)word_tree.$kw292$PLURAL, numbers);
                }
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD, numbers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prpX_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 55298L)
    public static SubLObject prpX_tree_get_person_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prpX_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD, (SubLObject)(string.equalp((SubLObject)word_tree.$str729$my) ? word_tree.ONE_INTEGER : (string.equalp((SubLObject)word_tree.$str730$your) ? word_tree.TWO_INTEGER : (string.equalp((SubLObject)word_tree.$str731$our) ? word_tree.ONE_INTEGER : word_tree.THREE_INTEGER))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prpX_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 55541L)
    public static SubLObject prpX_tree_get_gender_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prpX_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(word_tree.$sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD, conses_high.assoc(string, (SubLObject)word_tree.$list735, (SubLObject)word_tree.EQUALP, (SubLObject)word_tree.UNPROVIDED).rest());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prpX_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
    public static SubLObject subloop_reserved_initialize_wdt_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
    public static SubLObject subloop_reserved_initialize_wdt_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
    public static SubLObject wdt_word_tree_p(final SubLObject wdt_word_tree) {
        return classes.subloop_instanceof_class(wdt_word_tree, (SubLObject)word_tree.$sym737$WDT_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56210L)
    public static SubLObject wdt_word_tree_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wdt_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject refs = get_word_tree_refs(self);
        try {
            thread.throwStack.push(word_tree.$sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
            try {
                final SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym278$GET_ANTECEDENT);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, (word_tree.NIL != antecedent) ? methods.funcall_instance_method_with_0_args(antecedent, (SubLObject)word_tree.$sym100$GET_REFS) : refs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_tree_refs(self, refs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wdt_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56434L)
    public static SubLObject wdt_word_tree_get_antecedent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wdt_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
            try {
                final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                final SubLObject great_grandmother = (SubLObject)((word_tree.NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                if (word_tree.NIL != parse_tree.np_tree_p(great_grandmother) && word_tree.NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER))) {
                    Dynamic.sublisp_throw((SubLObject)word_tree.$sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, (SubLObject)word_tree.$sym296$GET_DAUGHTER, (SubLObject)word_tree.ZERO_INTEGER));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wdt_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
    public static SubLObject possessive_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == word_tree.UNPROVIDED) {
            keywords = (SubLObject)word_tree.$list750;
        }
        SubLObject conjuncts = (SubLObject)word_tree.NIL;
        final SubLObject possessor = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR);
        final SubLObject possessed = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym751$GET_POSSESSED);
        if (word_tree.NIL != possessor && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw208$POSSESSOR, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw208$POSSESSOR, possessor), conjuncts);
        }
        if (word_tree.NIL != possessed && word_tree.NIL != conses_high.member((SubLObject)word_tree.$kw752$POSSESSED, keywords, (SubLObject)word_tree.EQL, (SubLObject)word_tree.UNPROVIDED)) {
            conjuncts = (SubLObject)ConsesLow.cons(cyclifier_interface.coordinate_keyword_renaming((SubLObject)word_tree.$kw752$POSSESSED, possessed), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, (SubLObject)word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
    public static SubLObject subloop_reserved_initialize_possessive_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
    public static SubLObject subloop_reserved_initialize_possessive_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
    public static SubLObject possessive_word_tree_p(final SubLObject possessive_word_tree) {
        return classes.subloop_instanceof_class(possessive_word_tree, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57342L)
    public static SubLObject possessive_word_tree_get_possessor_method(final SubLObject self) {
        final SubLObject possessor = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym180$GET_SISTER, (SubLObject)word_tree.MINUS_ONE_INTEGER);
        return (SubLObject)((word_tree.NIL != possessor) ? possessor : word_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57592L)
    public static SubLObject possessive_word_tree_get_possessed_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_possessive_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
            try {
                final SubLObject grandmother = (SubLObject)((word_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)word_tree.$sym139$GET_MOTHER) : word_tree.NIL);
                final SubLObject grandmother_head = (SubLObject)((word_tree.NIL != parse_tree.nominal_phrase_tree_p(grandmother)) ? methods.funcall_instance_method_with_0_args(grandmother, (SubLObject)word_tree.$sym19$GET_HEAD) : word_tree.NIL);
                Dynamic.sublisp_throw((SubLObject)word_tree.$sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, (SubLObject)((word_tree.NIL != grandmother_head) ? grandmother_head : word_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_possessive_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57969L)
    public static SubLObject possessive_word_tree_get_complements_method(final SubLObject self) {
        SubLObject complements = (SubLObject)word_tree.NIL;
        final SubLObject possessor = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym227$GET_POSSESSOR);
        final SubLObject possessed = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym751$GET_POSSESSED);
        if (word_tree.NIL != possessed) {
            complements = (SubLObject)ConsesLow.cons(possessed, complements);
        }
        if (word_tree.NIL != possessor) {
            complements = (SubLObject)ConsesLow.cons(possessor, complements);
        }
        return complements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58353L)
    public static SubLObject possessive_word_tree_get_modifieds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_possessive_word_tree_method = (SubLObject)word_tree.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(word_tree.$sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
            try {
                if (word_tree.NIL != mother) {
                    final SubLObject candidate = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym751$GET_POSSESSED);
                    if (word_tree.NIL != candidate && word_tree.NIL == subl_promotions.memberP(mother, methods.funcall_instance_method_with_0_args(candidate, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS), (SubLObject)word_tree.EQ, (SubLObject)word_tree.UNPROVIDED)) {
                        Dynamic.sublisp_throw((SubLObject)word_tree.$sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, (SubLObject)ConsesLow.list(candidate));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_tree.$sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_possessive_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
    public static SubLObject subloop_reserved_initialize_cardinal_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
    public static SubLObject subloop_reserved_initialize_cardinal_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
    public static SubLObject cardinal_word_tree_p(final SubLObject cardinal_word_tree) {
        return classes.subloop_instanceof_class(cardinal_word_tree, (SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
    public static SubLObject subloop_reserved_initialize_existential_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
    public static SubLObject subloop_reserved_initialize_existential_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
    public static SubLObject existential_word_tree_p(final SubLObject existential_word_tree) {
        return classes.subloop_instanceof_class(existential_word_tree, (SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
    public static SubLObject subloop_reserved_initialize_punctuation_word_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
    public static SubLObject subloop_reserved_initialize_punctuation_word_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
    public static SubLObject punctuation_word_tree_p(final SubLObject punctuation_word_tree) {
        return classes.subloop_instanceof_class(punctuation_word_tree, (SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59126L)
    public static SubLObject temporal_tree_p(final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL != parse_tree.parse_tree_p(tree) && word_tree.NIL != methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym149$TEMPORAL_TREE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 61305L)
    public static SubLObject word_for_category(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word = conses_high.assoc(category, word_tree.$category_to_word$.getDynamicValue(thread), (SubLObject)word_tree.UNPROVIDED, (SubLObject)word_tree.UNPROVIDED).rest();
        if (word_tree.NIL == word) {
            word = (SubLObject)word_tree.$sym0$WORD_TREE;
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 61662L)
    public static SubLObject parse_expression_to_word_tree(final SubLObject word_expression, SubLObject mother, SubLObject index, SubLObject v_context) {
        if (mother == word_tree.UNPROVIDED) {
            mother = (SubLObject)word_tree.NIL;
        }
        if (index == word_tree.UNPROVIDED) {
            index = (SubLObject)word_tree.NIL;
        }
        if (v_context == word_tree.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)word_tree.$sym85$PARSE_TREE_CONTEXT);
        }
        return new_word_tree(word_expression_string(word_expression), parse_expression_category(word_expression), mother, index, (SubLObject)word_tree.NIL, v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
    public static SubLObject get_multi_noun_tree_daughters(final SubLObject multi_noun_tree) {
        return classes.subloop_get_access_protected_instance_slot(multi_noun_tree, (SubLObject)word_tree.TEN_INTEGER, (SubLObject)word_tree.$sym191$DAUGHTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
    public static SubLObject set_multi_noun_tree_daughters(final SubLObject multi_noun_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multi_noun_tree, value, (SubLObject)word_tree.TEN_INTEGER, (SubLObject)word_tree.$sym191$DAUGHTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
    public static SubLObject subloop_reserved_initialize_multi_noun_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym74$INSTANCE_COUNT, (SubLObject)word_tree.ZERO_INTEGER);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
    public static SubLObject subloop_reserved_initialize_multi_noun_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym76$ISOLATED_P, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym73$OBJECT, (SubLObject)word_tree.$sym77$INSTANCE_NUMBER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym78$STRING, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym79$CATEGORY, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym80$MOTHER, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym81$IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym82$MODIFIERS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym83$CONTEXT, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym6$LEXES, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym5$REFS, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym4$ABS_IDX, (SubLObject)word_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_tree.$sym778$MULTI_NOUN_TREE, (SubLObject)word_tree.$sym191$DAUGHTERS, (SubLObject)word_tree.NIL);
        return (SubLObject)word_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
    public static SubLObject multi_noun_tree_p(final SubLObject multi_noun_tree) {
        return classes.subloop_instanceof_class(multi_noun_tree, (SubLObject)word_tree.$sym778$MULTI_NOUN_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62231L)
    public static SubLObject new_multi_noun_tree(final SubLObject words) {
        final SubLObject self = object.new_class_instance((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE);
        SubLObject strings = (SubLObject)word_tree.NIL;
        parse_tree.set_parse_tree_category(self, methods.funcall_instance_method_with_0_args(words.first(), (SubLObject)word_tree.$sym35$GET_CATEGORY));
        parse_tree.set_parse_tree_mother(self, methods.funcall_instance_method_with_0_args(words.first(), (SubLObject)word_tree.$sym139$GET_MOTHER));
        set_word_tree_refs(self, methods.funcall_instance_method_with_0_args(words.first(), (SubLObject)word_tree.$sym100$GET_REFS));
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)word_tree.NIL;
        word = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            strings = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(word, (SubLObject)word_tree.$sym24$GET_STRING), strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        parse_tree.set_parse_tree_string(self, string_utilities.bunge(Sequences.nreverse(strings), (SubLObject)word_tree.UNPROVIDED));
        set_multi_noun_tree_daughters(self, Functions.apply((SubLObject)word_tree.$sym782$VECTOR, words));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62856L)
    public static SubLObject parse_expression_category(final SubLObject parse_expression) {
        return parse_expression.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63147L)
    public static SubLObject phrase_expression_daughters(final SubLObject phrase_expression) {
        return phrase_expression.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63325L)
    public static SubLObject phrase_expression_p(final SubLObject parse_expression) {
        return Types.listp(conses_high.second(parse_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63507L)
    public static SubLObject word_expression_p(final SubLObject parse_expression) {
        return Types.stringp(conses_high.second(parse_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63687L)
    public static SubLObject word_expression_string(final SubLObject word_expression) {
        return conses_high.second(word_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63832L)
    public static SubLObject charniak_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().isKeyword() && v_object.rest().isList());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 64035L)
    public static SubLObject charniak_expression_parse_expression(final SubLObject charniak_parser_parse) {
        return conses_high.second(charniak_parser_parse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 64237L)
    public static SubLObject parse_tree_covers_method(final SubLObject self, final SubLObject list_of_strings) {
        final SubLObject yield = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_tree.$sym109$YIELD);
        SubLObject tree_words = (SubLObject)word_tree.NIL;
        SubLObject fail = (SubLObject)word_tree.NIL;
        SubLObject cdolist_list_var = yield;
        SubLObject tree = (SubLObject)word_tree.NIL;
        tree = cdolist_list_var.first();
        while (word_tree.NIL != cdolist_list_var) {
            tree_words = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(tree, (SubLObject)word_tree.$sym24$GET_STRING), tree_words);
            cdolist_list_var = cdolist_list_var.rest();
            tree = cdolist_list_var.first();
        }
        if (word_tree.NIL == fail) {
            SubLObject csome_list_var = list_of_strings;
            SubLObject v_term = (SubLObject)word_tree.NIL;
            v_term = csome_list_var.first();
            while (word_tree.NIL == fail && word_tree.NIL != csome_list_var) {
                SubLObject match = (SubLObject)word_tree.NIL;
                if (word_tree.NIL == match) {
                    SubLObject csome_list_var_$14 = tree_words;
                    SubLObject word = (SubLObject)word_tree.NIL;
                    word = csome_list_var_$14.first();
                    while (word_tree.NIL == match && word_tree.NIL != csome_list_var_$14) {
                        if (v_term.equalp(word)) {
                            match = (SubLObject)word_tree.T;
                        }
                        csome_list_var_$14 = csome_list_var_$14.rest();
                        word = csome_list_var_$14.first();
                    }
                }
                if (word_tree.NIL == match) {
                    fail = (SubLObject)word_tree.T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL == fail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 65070L)
    public static SubLObject parse_tree_covers_minimally_method(final SubLObject self, final SubLObject list_of_strings) {
        if (word_tree.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)word_tree.$sym783$COVERS, list_of_strings)) {
            return (SubLObject)word_tree.NIL;
        }
        SubLObject fail = (SubLObject)word_tree.NIL;
        if (word_tree.NIL != parse_tree.phrase_tree_p(self)) {
            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(self);
            final SubLObject backwardP_var = (SubLObject)word_tree.NIL;
            final SubLObject length = Sequences.length(vector_var);
            SubLObject current;
            final SubLObject datum = current = (SubLObject)((word_tree.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)word_tree.ONE_INTEGER), (SubLObject)word_tree.MINUS_ONE_INTEGER, (SubLObject)word_tree.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)word_tree.ZERO_INTEGER, length, (SubLObject)word_tree.ONE_INTEGER));
            SubLObject start = (SubLObject)word_tree.NIL;
            SubLObject end = (SubLObject)word_tree.NIL;
            SubLObject delta = (SubLObject)word_tree.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)word_tree.$list789);
            start = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)word_tree.$list789);
            end = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)word_tree.$list789);
            delta = current.first();
            current = current.rest();
            if (word_tree.NIL == current) {
                if (word_tree.NIL == fail) {
                    SubLObject end_var;
                    SubLObject element_num;
                    SubLObject daughter;
                    for (end_var = end, element_num = (SubLObject)word_tree.NIL, element_num = start; word_tree.NIL == fail && word_tree.NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var); element_num = Numbers.add(element_num, delta)) {
                        daughter = Vectors.aref(vector_var, element_num);
                        if (word_tree.NIL != methods.funcall_instance_method_with_1_args(daughter, (SubLObject)word_tree.$sym783$COVERS, list_of_strings)) {
                            fail = (SubLObject)word_tree.T;
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)word_tree.$list789);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(word_tree.NIL == fail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 65604L)
    public static SubLObject parse_tree_get_minimally_covering_subtrees_method(final SubLObject self, final SubLObject list_of_strings) {
        SubLObject minimal = (SubLObject)word_tree.NIL;
        final SubLObject queue = queues.create_queue((SubLObject)word_tree.UNPROVIDED);
        queues.enqueue(self, queue);
        while (word_tree.NIL == queues.queue_empty_p(queue)) {
            final SubLObject subtree = queues.dequeue(queue);
            if (word_tree.NIL != methods.funcall_instance_method_with_1_args(subtree, (SubLObject)word_tree.$sym787$COVERS_MINIMALLY, list_of_strings)) {
                minimal = (SubLObject)ConsesLow.cons(subtree, minimal);
            }
            else {
                if (word_tree.NIL == methods.funcall_instance_method_with_1_args(subtree, (SubLObject)word_tree.$sym783$COVERS, list_of_strings) || word_tree.NIL == parse_tree.phrase_tree_p(subtree)) {
                    continue;
                }
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(subtree);
                final SubLObject backwardP_var = (SubLObject)word_tree.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_tree.NIL, v_iteration = (SubLObject)word_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_tree.ONE_INTEGER)) {
                    element_num = ((word_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_tree.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    queues.enqueue(daughter, queue);
                }
            }
        }
        return minimal;
    }
    
    public static SubLObject declare_word_tree_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "get_word_tree_abs_idx", "GET-WORD-TREE-ABS-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "set_word_tree_abs_idx", "SET-WORD-TREE-ABS-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "get_word_tree_refs", "GET-WORD-TREE-REFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "set_word_tree_refs", "SET-WORD-TREE-REFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "get_word_tree_lexes", "GET-WORD-TREE-LEXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "set_word_tree_lexes", "SET-WORD-TREE-LEXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_modified_dependent_meaning_p_method", "WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_pp_comp_filter_lexes_method", "WORD-TREE-PP-COMP-FILTER-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_frame_filter_lexes_method", "WORD-TREE-FRAME-FILTER-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_pos_filter_lexes_method", "WORD-TREE-POS-FILTER-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_tree_keyword_eq_classes_method", "WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_cyclify_nucleus_method", "WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_cyclify_int_method", "WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_keyword_renamings_method", "WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_partition_semantic_complements_method", "WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_semantic_complements_method", "WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_oblique_object_method", "WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_pp_complement_method", "WORD-TREE-GET-PP-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_p", "WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "new_word_tree", "NEW-WORD-TREE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_string_method", "WORD-TREE-GET-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_abs_index_method", "WORD-TREE-GET-ABS-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_lexes_method", "WORD-TREE-GET-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_ranked_lexes_method", "WORD-TREE-GET-RANKED-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_refs_method", "WORD-TREE-GET-REFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_set_refs_method", "WORD-TREE-SET-REFS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_yield_method", "WORD-TREE-YIELD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_parse_expression_method", "WORD-TREE-GET-PARSE-EXPRESSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_heads_method", "WORD-TREE-GET-HEADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_head_method", "WORD-TREE-GET-HEAD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_semantic_heads_method", "WORD-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_lexify_int_method", "WORD-TREE-LEXIFY-INT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_pps_method", "WORD-TREE-GET-PPS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_complements_method", "WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_modifiers_method", "WORD-TREE-GET-MODIFIERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_modifieds_method", "WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_temporal_tree_p_method", "WORD-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_relative_pronoun_p_method", "WORD-TREE-RELATIVE-PRONOUN-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_retokenize_method", "WORD-TREE-RETOKENIZE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_logical_form_int_method", "WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_function_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_function_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "function_word_tree_p", "FUNCTION-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_modifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_modifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "modifier_word_tree_p", "MODIFIER-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_coordinate_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_coordinate_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "coordinate_word_tree_p", "COORDINATE-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "coordinate_word_tree_get_complements_method", "COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "phrase_tree_coordinate_phrase_p_method", "PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "coordinate_phrase_tree_p", "COORDINATE-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "coordinate_phrase_tree_coordinate_phrase_p_method", "COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_unlike_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "unlike_coordinate_phrase_tree_p", "UNLIKE-COORDINATE-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "unlike_coordinate_phrase_tree_coordinate_phrase_p_method", "UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_keyword_renamings_method", "NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_cyclify_nucleus_method", "NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_cyclify_int_method", "NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_definite_description_p_method", "NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_relational_noun_p_method", "NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_quantifier_method", "NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nominal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nominal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_p", "NOMINAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_number_method", "NOMINAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_complements_method", "NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_determiner_method", "NOMINAL-WORD-TREE-GET-DETERMINER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_overt_quantifier_method", "NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_tree_get_existential_null_determiner_method", "WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "get_null_determiner", "GET-NULL-DETERMINER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_possessor_method", "NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_specifier_method", "NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_antecedent_method", "NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_gender_method", "NOMINAL-WORD-TREE-GET-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_person_method", "NOMINAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_singular_p_method", "NOMINAL-WORD-TREE-SINGULAR-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_plural_p_method", "NOMINAL-WORD-TREE-PLURAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "non_of_prepositional_tree_p", "NON-OF-PREPOSITIONAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nominal_word_tree_get_modifieds_method", "NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "appositive_np_p", "APPOSITIVE-NP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nn_tree_p", "NN-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nn_tree_get_number_method", "NN-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "name_word_tree_get_quantifier_method", "NAME-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_name_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_name_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "name_word_tree_p", "NAME-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_dollar_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_dollar_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "dollar_word_tree_p", "DOLLAR-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "dollar_word_tree_get_overt_quantifier_method", "DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nnp_tree_p", "NNP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nnp_tree_get_number_method", "NNP-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nns_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nns_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nns_tree_p", "NNS-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nns_tree_get_number_method", "NNS-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nnps_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_nnps_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nnps_tree_p", "NNPS-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "nnps_tree_get_number_method", "NNPS-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prp_tree_p", "PRP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prp_tree_get_number_method", "PRP-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prp_tree_get_person_method", "PRP-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prp_tree_get_gender_method", "PRP-TREE-GET-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_p", "WP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_get_refs_method", "WP-TREE-GET-REFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_get_antecedent_method", "WP-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_get_quantifier_method", "WP-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_get_number_method", "WP-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wp_tree_get_gender_method", "WP-TREE-GET-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "relative_clause_p", "RELATIVE-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_particle_filter_lexes_method", "VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_partition_semantic_complements_method", "VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_keyword_renamings_method", "VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_controller_method", "VERBAL-WORD-TREE-GET-CONTROLLER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_control_verb_method", "VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_object_controller_p_method", "VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_subject_controller_p_method", "VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_control_verb_p_method", "VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_matrix_clause_method", "VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_verbal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_verbal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_p", "VERBAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_predicate_method", "VERBAL-WORD-TREE-GET-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_number_method", "VERBAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_person_method", "VERBAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_tense_method", "VERBAL-WORD-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_subject_method", "VERBAL-WORD-TREE-GET-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_objects_method", "VERBAL-WORD-TREE-GET-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_moved_nps_method", "VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_moved_objects_method", "VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_direct_object_method", "VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_indirect_object_method", "VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_semantic_direct_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_semantic_indirect_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_verbal_complement_method", "VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_adjectival_complement_method", "VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_complements_method", "VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_particle_method", "VERBAL-WORD-TREE-GET-PARTICLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_infinitive_marker_method", "VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_dummy_to_p_method", "VERBAL-WORD-TREE-DUMMY-TO-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_semantic_subject_method", "VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_semantic_objects_method", "VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_get_ancestor_objects_method", "VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_inverted_p_method", "VERBAL-WORD-TREE-INVERTED-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_finite_p_method", "VERBAL-WORD-TREE-FINITE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_passive_p_method", "VERBAL-WORD-TREE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_infinitive_p_method", "VERBAL-WORD-TREE-INFINITIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "verbal_word_tree_base_p_method", "VERBAL-WORD-TREE-BASE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbz_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbz_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbz_tree_p", "VBZ-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbz_tree_get_tense_method", "VBZ-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_p", "VBN-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_get_aux_verb_method", "VBN-TREE-GET-AUX-VERB-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_get_semantic_subject_method", "VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_get_semantic_direct_object_method", "VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_get_semantic_indirect_object_method", "VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbn_tree_passive_p_method", "VBN-TREE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbd_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbd_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbd_tree_p", "VBD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbd_tree_get_tense_method", "VBD-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbp_tree_p", "VBP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbp_tree_get_tense_method", "VBP-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vb_tree_p", "VB-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vb_tree_get_tense_method", "VB-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbg_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_vbg_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbg_tree_p", "VBG-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbg_tree_get_aux_verb_method", "VBG-TREE-GET-AUX-VERB-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "vbg_tree_get_modifieds_method", "VBG-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_copula_p_method", "AUX-VERB-TREE-COPULA-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_keyword_renamings_method", "AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_semantic_complements_method", "AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_complements_method", "AUX-VERB-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_semantic_heads_method", "AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_tense_method", "AUX-VERB-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_aux_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_aux_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_p", "AUX-VERB-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_prepositional_complement_method", "AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_adverbial_complement_method", "AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_subject_method", "AUX-VERB-TREE-GET-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_direct_object_method", "AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_indirect_object_method", "AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_get_semantic_subject_method", "AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_inverted_p_method", "AUX-VERB-TREE-INVERTED-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "aux_verb_tree_passive_p_method", "AUX-VERB-TREE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_modal_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_modal_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "modal_verb_tree_p", "MODAL-VERB-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "modal_verb_tree_get_tense_method", "MODAL-VERB-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "modal_verb_tree_get_objects_method", "MODAL-VERB-TREE-GET-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adjectival_word_tree_get_keyword_renamings_method", "ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adjectival_word_tree_get_complements_method", "ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_adjectival_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_adjectival_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adjectival_word_tree_p", "ADJECTIVAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adjectival_word_tree_get_modifieds_method", "ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adjectival_word_tree_get_verbal_complement_method", "ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adverbial_word_tree_get_keyword_renamings_method", "ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_adverbial_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_adverbial_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adverbial_word_tree_p", "ADVERBIAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "adverbial_word_tree_get_modifieds_method", "ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wrb_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wrb_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wrb_word_tree_p", "WRB-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_keyword_renamings_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prepositional_or_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prepositional_or_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_p", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_oblique_object_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_verbal_complement_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_complements_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_modifieds_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_refs_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_or_particle_word_tree_get_antecedent_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prepositional_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prepositional_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prepositional_word_tree_p", "PREPOSITIONAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "particle_word_tree_p", "PARTICLE-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_specifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_specifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "specifier_word_tree_p", "SPECIFIER-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "specifier_word_tree_get_specified_method", "SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "quantifier_word_tree_get_keyword_renamings_method", "QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_quantifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_quantifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "quantifier_word_tree_p", "QUANTIFIER-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "quantifier_word_tree_get_quantified_method", "QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "quantifier_word_tree_get_specified_method", "QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_determiner_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_determiner_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "determiner_word_tree_p", "DETERMINER-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prpX_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_prpX_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prpX_tree_p", "PRP$-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prpX_tree_get_number_method", "PRP$-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prpX_tree_get_person_method", "PRP$-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "prpX_tree_get_gender_method", "PRP$-TREE-GET-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wdt_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_wdt_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wdt_word_tree_p", "WDT-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wdt_word_tree_get_refs_method", "WDT-WORD-TREE-GET-REFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "wdt_word_tree_get_antecedent_method", "WDT-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_get_keyword_renamings_method", "POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_possessive_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_possessive_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_p", "POSSESSIVE-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_get_possessor_method", "POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_get_possessed_method", "POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_get_complements_method", "POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "possessive_word_tree_get_modifieds_method", "POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_cardinal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_cardinal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "cardinal_word_tree_p", "CARDINAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_existential_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_existential_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "existential_word_tree_p", "EXISTENTIAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_punctuation_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_punctuation_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "punctuation_word_tree_p", "PUNCTUATION-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "temporal_tree_p", "TEMPORAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_for_category", "WORD-FOR-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "parse_expression_to_word_tree", "PARSE-EXPRESSION-TO-WORD-TREE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "get_multi_noun_tree_daughters", "GET-MULTI-NOUN-TREE-DAUGHTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "set_multi_noun_tree_daughters", "SET-MULTI-NOUN-TREE-DAUGHTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_multi_noun_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "subloop_reserved_initialize_multi_noun_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "multi_noun_tree_p", "MULTI-NOUN-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "new_multi_noun_tree", "NEW-MULTI-NOUN-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "parse_expression_category", "PARSE-EXPRESSION-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "phrase_expression_daughters", "PHRASE-EXPRESSION-DAUGHTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "phrase_expression_p", "PHRASE-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_expression_p", "WORD-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "word_expression_string", "WORD-EXPRESSION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "charniak_expression_p", "CHARNIAK-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "charniak_expression_parse_expression", "CHARNIAK-EXPRESSION-PARSE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "parse_tree_covers_method", "PARSE-TREE-COVERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "parse_tree_covers_minimally_method", "PARSE-TREE-COVERS-MINIMALLY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_tree", "parse_tree_get_minimally_covering_subtrees_method", "PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD", 2, 0, false);
        return (SubLObject)word_tree.NIL;
    }
    
    public static SubLObject init_word_tree_file() {
        word_tree.$singular_personal_pronouns$ = SubLFiles.defconstant("*SINGULAR-PERSONAL-PRONOUNS*", (SubLObject)word_tree.$list342);
        word_tree.$plural_personal_pronouns$ = SubLFiles.defconstant("*PLURAL-PERSONAL-PRONOUNS*", (SubLObject)word_tree.$list343);
        word_tree.$to_be_forms$ = SubLFiles.deflexical("*TO-BE-FORMS*", (SubLObject)word_tree.$list541);
        word_tree.$singular_possessive_pronouns$ = SubLFiles.defconstant("*SINGULAR-POSSESSIVE-PRONOUNS*", (SubLObject)word_tree.$list722);
        word_tree.$plural_possessive_pronouns$ = SubLFiles.defconstant("*PLURAL-POSSESSIVE-PRONOUNS*", (SubLObject)word_tree.$list723);
        word_tree.$category_to_word$ = SubLFiles.defparameter("*CATEGORY-TO-WORD*", (SubLObject)word_tree.$list777);
        return (SubLObject)word_tree.NIL;
    }
    
    public static SubLObject setup_word_tree_file() {
        classes.subloop_new_class((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$list2, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym7$MODIFIED_DEPENDENT_MEANING_P, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list9);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym7$MODIFIED_DEPENDENT_MEANING_P, (SubLObject)word_tree.$sym14$WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym15$PP_COMP_FILTER_LEXES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list16);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym15$PP_COMP_FILTER_LEXES, (SubLObject)word_tree.$sym25$WORD_TREE_PP_COMP_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym26$FRAME_FILTER_LEXES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list27);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym26$FRAME_FILTER_LEXES, (SubLObject)word_tree.$sym31$WORD_TREE_FRAME_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym32$POS_FILTER_LEXES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list33);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym32$POS_FILTER_LEXES, (SubLObject)word_tree.$sym39$WORD_TREE_POS_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym29$TREE_KEYWORD_EQ_CLASSES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list40);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym29$TREE_KEYWORD_EQ_CLASSES, (SubLObject)word_tree.$sym43$WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list45, (SubLObject)word_tree.$list46);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS, (SubLObject)word_tree.$sym51$WORD_TREE_CYCLIFY_NUCLEUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym48$CYCLIFY_INT, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list52);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym48$CYCLIFY_INT, (SubLObject)word_tree.$sym53$WORD_TREE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list54, (SubLObject)word_tree.$list55);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym56$WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym47$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list57);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym47$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym59$WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list61);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym63$WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list65);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT, (SubLObject)word_tree.$sym66$WORD_TREE_GET_OBLIQUE_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym18$GET_PP_COMPLEMENT, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list67);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym18$GET_PP_COMPLEMENT, (SubLObject)word_tree.$sym72$WORD_TREE_GET_PP_COMPLEMENT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym75$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym84$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_word_tree_class((SubLObject)word_tree.$sym0$WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym24$GET_STRING, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list87);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym24$GET_STRING, (SubLObject)word_tree.$sym89$WORD_TREE_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym90$GET_ABS_INDEX, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list91);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym90$GET_ABS_INDEX, (SubLObject)word_tree.$sym93$WORD_TREE_GET_ABS_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym94$GET_LEXES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list95);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym94$GET_LEXES, (SubLObject)word_tree.$sym96$WORD_TREE_GET_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym13$GET_RANKED_LEXES, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list97);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym13$GET_RANKED_LEXES, (SubLObject)word_tree.$sym99$WORD_TREE_GET_RANKED_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list101, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list102);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym103$WORD_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym104$SET_REFS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.$list105, (SubLObject)word_tree.$list106);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym104$SET_REFS, (SubLObject)word_tree.$sym108$WORD_TREE_SET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym109$YIELD, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list110);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym109$YIELD, (SubLObject)word_tree.$sym111$WORD_TREE_YIELD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym112$GET_PARSE_EXPRESSION, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list113);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym112$GET_PARSE_EXPRESSION, (SubLObject)word_tree.$sym114$WORD_TREE_GET_PARSE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym115$GET_HEADS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list116);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym115$GET_HEADS, (SubLObject)word_tree.$sym117$WORD_TREE_GET_HEADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym19$GET_HEAD, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list118);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym19$GET_HEAD, (SubLObject)word_tree.$sym119$WORD_TREE_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list121);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS, (SubLObject)word_tree.$sym122$WORD_TREE_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym123$LEXIFY_INT, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list124, (SubLObject)word_tree.$list125, (SubLObject)word_tree.$list126);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym123$LEXIFY_INT, (SubLObject)word_tree.$sym132$WORD_TREE_LEXIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym71$GET_PPS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list133);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym71$GET_PPS, (SubLObject)word_tree.$sym140$WORD_TREE_GET_PPS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list141);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym142$WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym49$GET_MODIFIERS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list143);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym49$GET_MODIFIERS, (SubLObject)word_tree.$sym145$WORD_TREE_GET_MODIFIERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list147);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym148$WORD_TREE_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym149$TEMPORAL_TREE_P, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list150);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym149$TEMPORAL_TREE_P, (SubLObject)word_tree.$sym155$WORD_TREE_TEMPORAL_TREE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym156$RELATIVE_PRONOUN_P, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list157);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym156$RELATIVE_PRONOUN_P, (SubLObject)word_tree.$sym161$WORD_TREE_RELATIVE_PRONOUN_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym162$RETOKENIZE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list125, (SubLObject)word_tree.$list163);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym162$RETOKENIZE, (SubLObject)word_tree.$sym164$WORD_TREE_RETOKENIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym165$LOGICAL_FORM_INT, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list166);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym165$LOGICAL_FORM_INT, (SubLObject)word_tree.$sym167$WORD_TREE_LOGICAL_FORM_INT_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.$sym169$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.$sym170$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_function_word_tree_class((SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list172);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.$sym173$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.$sym174$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_modifier_word_tree_class((SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list176);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.$sym177$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.$sym178$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_coordinate_word_tree_class((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list179);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym175$COORDINATE_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym181$COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym183$PHRASE_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list184);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym183$PHRASE_TREE, (SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym186$PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym188$NOMINAL_PHRASE_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list189);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym190$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym192$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE);
        subloop_reserved_initialize_coordinate_phrase_tree_class((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list193);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym187$COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym194$COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym188$NOMINAL_PHRASE_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list189);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym196$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC);
        subloop_reserved_initialize_unlike_coordinate_phrase_tree_class((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list193);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym195$UNLIKE_COORDINATE_PHRASE_TREE, (SubLObject)word_tree.$sym182$COORDINATE_PHRASE_P, (SubLObject)word_tree.$sym198$UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list200, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list201);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list202, (SubLObject)word_tree.$list203);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym214$NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list215, (SubLObject)word_tree.$list216);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym44$CYCLIFY_NUCLEUS, (SubLObject)word_tree.$sym218$NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym48$CYCLIFY_INT, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list219);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym48$CYCLIFY_INT, (SubLObject)word_tree.$sym221$NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym222$DEFINITE_DESCRIPTION_P, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list223);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym222$DEFINITE_DESCRIPTION_P, (SubLObject)word_tree.$sym228$NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym229$RELATIONAL_NOUN_P, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list230);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym229$RELATIONAL_NOUN_P, (SubLObject)word_tree.$sym231$NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list232);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym235$NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym236$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym237$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_nominal_word_tree_class((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list239);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym240$NOMINAL_WORD_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list241);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym243$NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym224$GET_DETERMINER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list244);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym224$GET_DETERMINER, (SubLObject)word_tree.$sym250$NOMINAL_WORD_TREE_GET_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list251);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER, (SubLObject)word_tree.$sym254$NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym233$GET_EXISTENTIAL_NULL_DETERMINER, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list255);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$sym233$GET_EXISTENTIAL_NULL_DETERMINER, (SubLObject)word_tree.$sym259$WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym227$GET_POSSESSOR, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list269);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym227$GET_POSSESSOR, (SubLObject)word_tree.$sym274$NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym275$GET_SPECIFIER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list276);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym275$GET_SPECIFIER, (SubLObject)word_tree.$sym277$NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list279);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym280$NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list282);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym284$NOMINAL_WORD_TREE_GET_GENDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list286);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym287$NOMINAL_WORD_TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym226$SINGULAR_P, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list288);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym226$SINGULAR_P, (SubLObject)word_tree.$sym290$NOMINAL_WORD_TREE_SINGULAR_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym234$PLURAL_P, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list291);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym234$PLURAL_P, (SubLObject)word_tree.$sym293$NOMINAL_WORD_TREE_PLURAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list294);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym300$NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list304);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.$sym305$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.$sym306$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE);
        subloop_reserved_initialize_nn_tree_class((SubLObject)word_tree.$sym303$NN_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list307);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym303$NN_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym309$NN_TREE_GET_NUMBER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list311, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list312);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list313);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym314$NAME_WORD_TREE_GET_QUANTIFIER_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.$sym315$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.$sym316$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_name_word_tree_class((SubLObject)word_tree.$sym310$NAME_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list318);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.$sym319$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.$sym320$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_dollar_word_tree_class((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER, (SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list321);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym317$DOLLAR_WORD_TREE, (SubLObject)word_tree.$sym205$GET_OVERT_QUANTIFIER, (SubLObject)word_tree.$sym322$DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list304);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.$sym324$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.$sym325$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE);
        subloop_reserved_initialize_nnp_tree_class((SubLObject)word_tree.$sym323$NNP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list307);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym323$NNP_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym326$NNP_TREE_GET_NUMBER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list304);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.$sym328$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.$sym329$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE);
        subloop_reserved_initialize_nns_tree_class((SubLObject)word_tree.$sym327$NNS_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list330);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym327$NNS_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym332$NNS_TREE_GET_NUMBER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.$sym310$NAME_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list304);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.$sym334$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.$sym335$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE);
        subloop_reserved_initialize_nnps_tree_class((SubLObject)word_tree.$sym333$NNPS_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list330);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym333$NNPS_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym336$NNPS_TREE_GET_NUMBER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list338, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list339);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym340$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym341$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE);
        subloop_reserved_initialize_prp_tree_class((SubLObject)word_tree.$sym337$PRP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list344);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym346$PRP_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list347);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym354$PRP_TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list355);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym337$PRP_TREE, (SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym358$PRP_TREE_GET_GENDER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.$list360, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list361);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym362$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym363$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE);
        subloop_reserved_initialize_wp_tree_class((SubLObject)word_tree.$sym359$WP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list364);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym366$WP_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list367);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym369$WP_TREE_GET_ANTECEDENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list370);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym220$GET_QUANTIFIER, (SubLObject)word_tree.$sym372$WP_TREE_GET_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list373);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym374$WP_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list375);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym359$WP_TREE, (SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym377$WP_TREE_GET_GENDER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list380, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list381);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym127$PARTICLE_FILTER_LEXES, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list382);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym127$PARTICLE_FILTER_LEXES, (SubLObject)word_tree.$sym387$VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym47$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list388);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym47$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym390$VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list391, (SubLObject)word_tree.$list392);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym403$VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym404$GET_CONTROLLER, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list405);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym404$GET_CONTROLLER, (SubLObject)word_tree.$sym410$VERBAL_WORD_TREE_GET_CONTROLLER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym406$GET_CONTROL_VERB, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list411);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym406$GET_CONTROL_VERB, (SubLObject)word_tree.$sym414$VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym408$OBJECT_CONTROLLER_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list415);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym408$OBJECT_CONTROLLER_P, (SubLObject)word_tree.$sym417$VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym407$SUBJECT_CONTROLLER_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list418);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym407$SUBJECT_CONTROLLER_P, (SubLObject)word_tree.$sym420$VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym413$CONTROL_VERB_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list421);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym413$CONTROL_VERB_P, (SubLObject)word_tree.$sym422$VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym412$GET_MATRIX_CLAUSE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list423);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym412$GET_MATRIX_CLAUSE, (SubLObject)word_tree.$sym424$VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym425$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym426$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_verbal_word_tree_class((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym427$GET_PREDICATE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list428);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym427$GET_PREDICATE, (SubLObject)word_tree.$sym430$VERBAL_WORD_TREE_GET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list431);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym433$VERBAL_WORD_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list434);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym435$VERBAL_WORD_TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list437);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym438$VERBAL_WORD_TREE_GET_TENSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym299$GET_SUBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list439);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym299$GET_SUBJECT, (SubLObject)word_tree.$sym442$VERBAL_WORD_TREE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym298$GET_OBJECTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list443);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym298$GET_OBJECTS, (SubLObject)word_tree.$sym448$VERBAL_WORD_TREE_GET_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym449$GET_MOVED_NPS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list450);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym449$GET_MOVED_NPS, (SubLObject)word_tree.$sym452$VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym453$GET_MOVED_OBJECTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list454);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym453$GET_MOVED_OBJECTS, (SubLObject)word_tree.$sym455$VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list456);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT, (SubLObject)word_tree.$sym458$VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list459);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT, (SubLObject)word_tree.$sym461$VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list462);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)word_tree.$sym463$VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list464);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)word_tree.$sym465$VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list466);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym469$VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym470$GET_ADJECTIVAL_COMPLEMENT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list471);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym470$GET_ADJECTIVAL_COMPLEMENT, (SubLObject)word_tree.$sym474$VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list475);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym477$VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym384$GET_PARTICLE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list478);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym384$GET_PARTICLE, (SubLObject)word_tree.$sym481$VERBAL_WORD_TREE_GET_PARTICLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym482$GET_INFINITIVE_MARKER, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list483);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym482$GET_INFINITIVE_MARKER, (SubLObject)word_tree.$sym485$VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym486$DUMMY_TO_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list487);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym486$DUMMY_TO_P, (SubLObject)word_tree.$sym489$VERBAL_WORD_TREE_DUMMY_TO_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list490);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym491$VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym476$GET_SEMANTIC_OBJECTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list492);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym476$GET_SEMANTIC_OBJECTS, (SubLObject)word_tree.$sym493$VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym494$GET_ANCESTOR_OBJECTS, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list495);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym494$GET_ANCESTOR_OBJECTS, (SubLObject)word_tree.$sym497$VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym498$INVERTED_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list499);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym498$INVERTED_P, (SubLObject)word_tree.$sym500$VERBAL_WORD_TREE_INVERTED_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym432$FINITE_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list501);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym432$FINITE_P, (SubLObject)word_tree.$sym502$VERBAL_WORD_TREE_FINITE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list504);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym505$VERBAL_WORD_TREE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym506$INFINITIVE_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list507);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym506$INFINITIVE_P, (SubLObject)word_tree.$sym508$VERBAL_WORD_TREE_INFINITIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym509$BASE_P, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list510);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$sym509$BASE_P, (SubLObject)word_tree.$sym514$VERBAL_WORD_TREE_BASE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list516, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list517);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.$sym518$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.$sym519$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE);
        subloop_reserved_initialize_vbz_tree_class((SubLObject)word_tree.$sym515$VBZ_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list520);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym515$VBZ_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym522$VBZ_TREE_GET_TENSE_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list524);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym525$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym526$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE);
        subloop_reserved_initialize_vbn_tree_class((SubLObject)word_tree.$sym523$VBN_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym527$GET_AUX_VERB, (SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list528);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym527$GET_AUX_VERB, (SubLObject)word_tree.$sym531$VBN_TREE_GET_AUX_VERB_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list532);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym535$VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list536);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym394$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)word_tree.$sym538$VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list539);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym395$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)word_tree.$sym540$VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list542);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym523$VBN_TREE, (SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym543$VBN_TREE_PASSIVE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list516, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list517);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.$sym545$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.$sym546$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE);
        subloop_reserved_initialize_vbd_tree_class((SubLObject)word_tree.$sym544$VBD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list547);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym544$VBD_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym549$VBD_TREE_GET_TENSE_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list516, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list517);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.$sym551$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.$sym552$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE);
        subloop_reserved_initialize_vbp_tree_class((SubLObject)word_tree.$sym550$VBP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list520);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym550$VBP_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym553$VBP_TREE_GET_TENSE_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list517);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.$sym555$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.$sym556$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE);
        subloop_reserved_initialize_vb_tree_class((SubLObject)word_tree.$sym554$VB_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list557);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym554$VB_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym559$VB_TREE_GET_TENSE_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list561);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$sym562$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$sym563$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE);
        subloop_reserved_initialize_vbg_tree_class((SubLObject)word_tree.$sym560$VBG_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym527$GET_AUX_VERB, (SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list528);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$sym527$GET_AUX_VERB, (SubLObject)word_tree.$sym565$VBG_TREE_GET_AUX_VERB_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list566);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym560$VBG_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym568$VBG_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym379$VERBAL_WORD_TREE, (SubLObject)word_tree.$list570, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list571);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym297$COPULA_P, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list572);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym297$COPULA_P, (SubLObject)word_tree.$sym573$AUX_VERB_TREE_COPULA_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list574, (SubLObject)word_tree.$list575);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym578$AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list579);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym58$GET_SEMANTIC_COMPLEMENTS, (SubLObject)word_tree.$sym580$AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list581);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym584$AUX_VERB_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list585);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym120$GET_SEMANTIC_HEADS, (SubLObject)word_tree.$sym586$AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list587);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym591$AUX_VERB_TREE_GET_TENSE_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym592$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym593$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE);
        subloop_reserved_initialize_aux_verb_tree_class((SubLObject)word_tree.$sym569$AUX_VERB_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym582$GET_PREPOSITIONAL_COMPLEMENT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list594);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym582$GET_PREPOSITIONAL_COMPLEMENT, (SubLObject)word_tree.$sym596$AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym583$GET_ADVERBIAL_COMPLEMENT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list597);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym583$GET_ADVERBIAL_COMPLEMENT, (SubLObject)word_tree.$sym598$AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym299$GET_SUBJECT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list599);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym299$GET_SUBJECT, (SubLObject)word_tree.$sym601$AUX_VERB_TREE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list602);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym409$GET_DIRECT_OBJECT, (SubLObject)word_tree.$sym604$AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list605);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym445$GET_INDIRECT_OBJECT, (SubLObject)word_tree.$sym606$AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list607);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym389$GET_SEMANTIC_SUBJECT, (SubLObject)word_tree.$sym608$AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym498$INVERTED_P, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list609);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym498$INVERTED_P, (SubLObject)word_tree.$sym610$AUX_VERB_TREE_INVERTED_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list611);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$sym503$PASSIVE_P, (SubLObject)word_tree.$sym612$AUX_VERB_TREE_PASSIVE_P_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$sym569$AUX_VERB_TREE, (SubLObject)word_tree.$list516, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list614);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$sym615$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$sym616$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE);
        subloop_reserved_initialize_modal_verb_tree_class((SubLObject)word_tree.$sym613$MODAL_VERB_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list617);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$sym436$GET_TENSE, (SubLObject)word_tree.$sym621$MODAL_VERB_TREE_GET_TENSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym298$GET_OBJECTS, (SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list622);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym613$MODAL_VERB_TREE, (SubLObject)word_tree.$sym298$GET_OBJECTS, (SubLObject)word_tree.$sym623$MODAL_VERB_TREE_GET_OBJECTS_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.$list625, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list626);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list627, (SubLObject)word_tree.$list628);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym630$ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list631);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym632$ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym633$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym634$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_adjectival_word_tree_class((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list635);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym638$ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list639);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym624$ADJECTIVAL_WORD_TREE, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym642$ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$sym171$MODIFIER_WORD_TREE, (SubLObject)word_tree.$list644, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list645);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list646, (SubLObject)word_tree.$list647);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym649$ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$sym650$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$sym651$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_adverbial_word_tree_class((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list652);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym653$ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym654$WRB_WORD_TREE, (SubLObject)word_tree.$sym643$ADVERBIAL_WORD_TREE, (SubLObject)word_tree.$list655, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym654$WRB_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym654$WRB_WORD_TREE, (SubLObject)word_tree.$sym656$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym654$WRB_WORD_TREE, (SubLObject)word_tree.$sym657$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_wrb_word_tree_class((SubLObject)word_tree.$sym654$WRB_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.$list659, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list660);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list661, (SubLObject)word_tree.$list662);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym664$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I);
        subloop_reserved_initialize_prepositional_or_particle_word_tree_class((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list667);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym64$GET_OBLIQUE_OBJECT, (SubLObject)word_tree.$sym668$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list669);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym396$GET_VERBAL_COMPLEMENT, (SubLObject)word_tree.$sym672$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list673);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym674$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list675);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym678$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list679);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym681$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list682);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym684$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list686, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE, (SubLObject)word_tree.$sym687$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE, (SubLObject)word_tree.$sym688$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_prepositional_word_tree_class((SubLObject)word_tree.$sym685$PREPOSITIONAL_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)word_tree.$list690, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym691$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE, (SubLObject)word_tree.$sym692$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_particle_word_tree_class((SubLObject)word_tree.$sym689$PARTICLE_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list694);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$sym695$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$sym696$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_specifier_word_tree_class((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym697$GET_SPECIFIED, (SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list698);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$sym697$GET_SPECIFIED, (SubLObject)word_tree.$sym700$SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$list702, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list703);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list704, (SubLObject)word_tree.$list705);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym707$QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym708$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym709$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_quantifier_word_tree_class((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym710$GET_QUANTIFIED, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list711);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym710$GET_QUANTIFIED, (SubLObject)word_tree.$sym713$QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym697$GET_SPECIFIED, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list714);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$sym697$GET_SPECIFIED, (SubLObject)word_tree.$sym715$QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE, (SubLObject)word_tree.$sym717$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE, (SubLObject)word_tree.$sym718$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_determiner_word_tree_class((SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym693$SPECIFIER_WORD_TREE, (SubLObject)word_tree.$list338, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list339);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE);
        subloop_reserved_initialize_prpX_tree_class((SubLObject)word_tree.$sym719$PRP__TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list724);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym238$GET_NUMBER, (SubLObject)word_tree.$sym726$PRP__TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list727);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym285$GET_PERSON, (SubLObject)word_tree.$sym732$PRP__TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list733);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym719$PRP__TREE, (SubLObject)word_tree.$sym281$GET_GENDER, (SubLObject)word_tree.$sym736$PRP__TREE_GET_GENDER_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$sym716$DETERMINER_WORD_TREE, (SubLObject)word_tree.$list655, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list738);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$sym739$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$sym740$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_wdt_word_tree_class((SubLObject)word_tree.$sym737$WDT_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list364);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$sym100$GET_REFS, (SubLObject)word_tree.$sym742$WDT_WORD_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list367);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym737$WDT_WORD_TREE, (SubLObject)word_tree.$sym278$GET_ANTECEDENT, (SubLObject)word_tree.$sym744$WDT_WORD_TREE_GET_ANTECEDENT_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.$list746, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list747);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list748, (SubLObject)word_tree.$list749);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym42$GET_KEYWORD_RENAMINGS, (SubLObject)word_tree.$sym753$POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym754$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym755$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_possessive_word_tree_class((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym227$GET_POSSESSOR, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list756);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym227$GET_POSSESSOR, (SubLObject)word_tree.$sym757$POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym751$GET_POSSESSED, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list758);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym751$GET_POSSESSED, (SubLObject)word_tree.$sym760$POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list761);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym62$GET_COMPLEMENTS, (SubLObject)word_tree.$sym762$POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list763);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym745$POSSESSIVE_WORD_TREE, (SubLObject)word_tree.$sym146$GET_MODIFIEDS, (SubLObject)word_tree.$sym765$POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE, (SubLObject)word_tree.$sym701$QUANTIFIER_WORD_TREE, (SubLObject)word_tree.$list767, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE, (SubLObject)word_tree.$sym768$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE, (SubLObject)word_tree.$sym769$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_cardinal_word_tree_class((SubLObject)word_tree.$sym766$CARDINAL_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE, (SubLObject)word_tree.$sym168$FUNCTION_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE, (SubLObject)word_tree.$sym771$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE, (SubLObject)word_tree.$sym772$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_existential_word_tree_class((SubLObject)word_tree.$sym770$EXISTENTIAL_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE, (SubLObject)word_tree.$sym0$WORD_TREE, (SubLObject)word_tree.$list774, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE, (SubLObject)word_tree.$sym775$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE, (SubLObject)word_tree.$sym776$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE);
        subloop_reserved_initialize_punctuation_word_tree_class((SubLObject)word_tree.$sym773$PUNCTUATION_WORD_TREE);
        classes.subloop_new_class((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE, (SubLObject)word_tree.$sym199$NOMINAL_WORD_TREE, (SubLObject)word_tree.NIL, (SubLObject)word_tree.NIL, (SubLObject)word_tree.$list779);
        classes.class_set_implements_slot_listeners((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE, (SubLObject)word_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE, (SubLObject)word_tree.$sym780$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE, (SubLObject)word_tree.$sym781$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE);
        subloop_reserved_initialize_multi_noun_tree_class((SubLObject)word_tree.$sym778$MULTI_NOUN_TREE);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym783$COVERS, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.$list784, (SubLObject)word_tree.$list785);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym783$COVERS, (SubLObject)word_tree.$sym786$PARSE_TREE_COVERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym787$COVERS_MINIMALLY, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$list8, (SubLObject)word_tree.$list784, (SubLObject)word_tree.$list788);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym787$COVERS_MINIMALLY, (SubLObject)word_tree.$sym790$PARSE_TREE_COVERS_MINIMALLY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_tree.$sym791$GET_MINIMALLY_COVERING_SUBTREES, (SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$list60, (SubLObject)word_tree.$list784, (SubLObject)word_tree.$list792);
        methods.subloop_register_instance_method((SubLObject)word_tree.$sym1$PARSE_TREE, (SubLObject)word_tree.$sym791$GET_MINIMALLY_COVERING_SUBTREES, (SubLObject)word_tree.$sym793$PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD);
        return (SubLObject)word_tree.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_word_tree_file();
    }
    
    @Override
	public void initializeVariables() {
        init_word_tree_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_word_tree_file();
    }
    
    static {
        me = (SubLFile)new word_tree();
        word_tree.$singular_personal_pronouns$ = null;
        word_tree.$plural_personal_pronouns$ = null;
        word_tree.$to_be_forms$ = null;
        word_tree.$singular_possessive_pronouns$ = null;
        word_tree.$plural_possessive_pronouns$ = null;
        word_tree.$category_to_word$ = null;
        $sym0$WORD_TREE = SubLObjectFactory.makeSymbol("WORD-TREE");
        $sym1$PARSE_TREE = SubLObjectFactory.makeSymbol("PARSE-TREE");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-WORD"));
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABS-IDX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ABS-INDEX"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-REFS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PP-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-PRONOUN-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PPS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-KEYWORD-EQ-CLASSES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS-FILTER-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME-FILTER-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PP-COMP-FILTER-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED-DEPENDENT-MEANING-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RETOKENIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym4$ABS_IDX = SubLObjectFactory.makeSymbol("ABS-IDX");
        $sym5$REFS = SubLObjectFactory.makeSymbol("REFS");
        $sym6$LEXES = SubLObjectFactory.makeSymbol("LEXES");
        $sym7$MODIFIED_DEPENDENT_MEANING_P = SubLObjectFactory.makeSymbol("MODIFIED-DEPENDENT-MEANING-P");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL)));
        $sym10$GET = SubLObjectFactory.makeSymbol("GET");
        $kw11$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $kw12$REPLACE = SubLObjectFactory.makeKeyword("REPLACE");
        $sym13$GET_RANKED_LEXES = SubLObjectFactory.makeSymbol("GET-RANKED-LEXES");
        $sym14$WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD");
        $sym15$PP_COMP_FILTER_LEXES = SubLObjectFactory.makeSymbol("PP-COMP-FILTER-LEXES");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PP-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREP-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("PREP-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym18$GET_PP_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-PP-COMPLEMENT");
        $sym19$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $kw20$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $const21$PPCompFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrame"));
        $const22$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const23$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $sym24$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym25$WORD_TREE_PP_COMP_FILTER_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-PP-COMP-FILTER-LEXES-METHOD");
        $sym26$FRAME_FILTER_LEXES = SubLObjectFactory.makeSymbol("FRAME-FILTER-LEXES");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-KEYWORD-EQ-CLASSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORES"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)SubLObjectFactory.makeInteger(-5))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)SubLObjectFactory.makeSymbol("TREE-KEYWORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-SCORES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym29$TREE_KEYWORD_EQ_CLASSES = SubLObjectFactory.makeSymbol("TREE-KEYWORD-EQ-CLASSES");
        $int30$_5 = SubLObjectFactory.makeInteger(-5);
        $sym31$WORD_TREE_FRAME_FILTER_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-FRAME-FILTER-LEXES-METHOD");
        $sym32$POS_FILTER_LEXES = SubLObjectFactory.makeSymbol("POS-FILTER-LEXES");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeDouble(0.75)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym35$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw36$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $kw37$BACKOFF_PENN_TAGS = SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS");
        $float38$0_75 = (SubLFloat)SubLObjectFactory.makeDouble(0.75);
        $sym39$WORD_TREE_POS_FILTER_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-POS-FILTER-LEXES-METHOD");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-EQ-CLASSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS")))))))));
        $sym41$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym42$GET_KEYWORD_RENAMINGS = SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS");
        $sym43$WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD");
        $sym44$CYCLIFY_NUCLEUS = SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NDISTR-COMP-CYCLS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISTR-COMP-CYCLS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCLS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUP-DISJUNCTIVE-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING"), (SubLObject)SubLObjectFactory.makeSymbol("DISTRIBUTING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("NDISTR-COMP-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("DISTRIBUTING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("DISTR-COMP-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS0"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUPING"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-AND-MODS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("GROUPING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-LEX-RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMING"))), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCLS")))), (SubLObject)SubLObjectFactory.makeSymbol("THIS-AND-MODS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-AND-MODS"))), (SubLObject)SubLObjectFactory.makeSymbol("NDISTR-COMP-CYCLS")))), (SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS0")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS0")))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("DISTR-COMP-CYCLS")))))));
        $sym47$PARTITION_SEMANTIC_COMPLEMENTS = SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS");
        $sym48$CYCLIFY_INT = SubLObjectFactory.makeSymbol("CYCLIFY-INT");
        $sym49$GET_MODIFIERS = SubLObjectFactory.makeSymbol("GET-MODIFIERS");
        $sym50$INSTANTIATE_SCOPE = SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE");
        $sym51$WORD_TREE_CYCLIFY_NUCLEUS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-CYCLIFY-NUCLEUS-METHOD");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS"))))));
        $sym53$WORD_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-CYCLIFY-INT-METHOD");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym56$WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"))), (SubLObject)word_tree.NIL)));
        $sym58$GET_SEMANTIC_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS");
        $sym59$WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))));
        $sym62$GET_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-COMPLEMENTS");
        $sym63$WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD");
        $sym64$GET_OBLIQUE_OBJECT = SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PP-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"))));
        $sym66$WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-OBLIQUE-OBJECT-METHOD");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PPS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREP-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("PREP-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PP"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"))), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeString("of"), (SubLObject)SubLObjectFactory.makeSymbol("PP-HEAD-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PP"))))))))));
        $kw68$OBLIQUE_OBJECT = SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"));
        $str70$of = SubLObjectFactory.makeString("of");
        $sym71$GET_PPS = SubLObjectFactory.makeSymbol("GET-PPS");
        $sym72$WORD_TREE_GET_PP_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-PP-COMPLEMENT-METHOD");
        $sym73$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym74$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym75$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS");
        $sym76$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym77$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym78$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym79$CATEGORY = SubLObjectFactory.makeSymbol("CATEGORY");
        $sym80$MOTHER = SubLObjectFactory.makeSymbol("MOTHER");
        $sym81$IDX = SubLObjectFactory.makeSymbol("IDX");
        $sym82$MODIFIERS = SubLObjectFactory.makeSymbol("MODIFIERS");
        $sym83$CONTEXT = SubLObjectFactory.makeSymbol("CONTEXT");
        $sym84$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE");
        $sym85$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $sym86$NEW_VARIABLE = SubLObjectFactory.makeSymbol("NEW-VARIABLE");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the string of this word-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym89$WORD_TREE_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-STRING-METHOD");
        $sym90$GET_ABS_INDEX = SubLObjectFactory.makeSymbol("GET-ABS-INDEX");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integer-p; the absolute index of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ABS-IDX")));
        $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym93$WORD_TREE_GET_ABS_INDEX_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-ABS-INDEX-METHOD");
        $sym94$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of lexical entries of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES"))))));
        $sym96$WORD_TREE_GET_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-LEXES-METHOD");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of ranked lexical entries of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")));
        $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym99$WORD_TREE_GET_RANKED_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-RANKED-LEXES-METHOD");
        $sym100$GET_REFS = SubLObjectFactory.makeSymbol("GET-REFS");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the unique referent of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("REFS")));
        $sym103$WORD_TREE_GET_REFS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-REFS-METHOD");
        $sym104$SET_REFS = SubLObjectFactory.makeSymbol("SET-REFS");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFERENTS"));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param REFS listp; a list of referents\n   @return word-tree; this word tree with its referents updated to REFERENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REFS")), (SubLObject)SubLObjectFactory.makeSymbol("REFERENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym108$WORD_TREE_SET_REFS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-SET-REFS-METHOD");
        $sym109$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the yield of this word tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym111$WORD_TREE_YIELD_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-YIELD-METHOD");
        $sym112$GET_PARSE_EXPRESSION = SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the parse expression of this word tree\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))));
        $sym114$WORD_TREE_GET_PARSE_EXPRESSION_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-PARSE-EXPRESSION-METHOD");
        $sym115$GET_HEADS = SubLObjectFactory.makeSymbol("GET-HEADS");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list containing the head of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym117$WORD_TREE_GET_HEADS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-HEADS-METHOD");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the head of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym119$WORD_TREE_GET_HEAD_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-HEAD-METHOD");
        $sym120$GET_SEMANTIC_HEADS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list containing the semantic head of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym122$WORD_TREE_GET_SEMANTIC_HEADS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-SEMANTIC-HEADS-METHOD");
        $sym123$LEXIFY_INT = SubLObjectFactory.makeSymbol("LEXIFY-INT");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; a version of this word-tree with lexical entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-FILTER-LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-P"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PP-COMP-FILTER-LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-FILTER-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME-FILTER-LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE-SEM-EQUAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-LEXICON-P"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FABRICATED-LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATED-LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RANKED-LEX-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATED-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")))));
        $sym127$PARTICLE_FILTER_LEXES = SubLObjectFactory.makeSymbol("PARTICLE-FILTER-LEXES");
        $sym128$RLE_SEM_EQUAL = SubLObjectFactory.makeSymbol("RLE-SEM-EQUAL");
        $sym129$FABRICATION_FORBIDDEN_ = SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?");
        $sym130$FABRICATE = SubLObjectFactory.makeSymbol("FABRICATE");
        $sym131$NEW_RANKED_LEX_ENTRY = SubLObjectFactory.makeSymbol("NEW-RANKED-LEX-ENTRY");
        $sym132$WORD_TREE_LEXIFY_INT_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-LEXIFY-INT-METHOD");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; pps related to this word, either as an adjunct\n   or as a complement"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHPP-TREE-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHPP-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PPS"))))));
        $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym135$FIND = SubLObjectFactory.makeSymbol("FIND");
        $sym136$PREPOSITIONAL_TREE_P = SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE-P");
        $sym137$WHPP_TREE_P = SubLObjectFactory.makeSymbol("WHPP-TREE-P");
        $sym138$ROOT_P = SubLObjectFactory.makeSymbol("ROOT-P");
        $sym139$GET_MOTHER = SubLObjectFactory.makeSymbol("GET-MOTHER");
        $sym140$WORD_TREE_GET_PPS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-PPS-METHOD");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of complements of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym142$WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-COMPLEMENTS-METHOD");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all modifiers of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIERS")));
        $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym145$WORD_TREE_GET_MODIFIERS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-MODIFIERS-METHOD");
        $sym146$GET_MODIFIEDS = SubLObjectFactory.makeSymbol("GET-MODIFIEDS");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of phrases that this word modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym148$WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-MODIFIEDS-METHOD");
        $sym149$TEMPORAL_TREE_P = SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is temporal, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TERM-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STANFORD-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P")))))))));
        $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $kw152$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $const153$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym154$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym155$WORD_TREE_TEMPORAL_TREE_P_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-TEMPORAL-TREE-P-METHOD");
        $sym156$RELATIVE_PRONOUN_P = SubLObjectFactory.makeSymbol("RELATIVE-PRONOUN-P");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this word is a relative pronoun, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WDT-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)word_tree.ZERO_INTEGER, (SubLObject)word_tree.ZERO_INTEGER)))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-CLAUSE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"))))));
        $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym159$GET_DESCENDANT = SubLObjectFactory.makeSymbol("GET-DESCENDANT");
        $list160 = ConsesLow.list((SubLObject)word_tree.ZERO_INTEGER, (SubLObject)word_tree.ZERO_INTEGER);
        $sym161$WORD_TREE_RELATIVE_PRONOUN_P_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-RELATIVE-PRONOUN-P-METHOD");
        $sym162$RETOKENIZE = SubLObjectFactory.makeSymbol("RETOKENIZE");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym164$WORD_TREE_RETOKENIZE_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-RETOKENIZE-METHOD");
        $sym165$LOGICAL_FORM_INT = SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym167$WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym168$FUNCTION_WORD_TREE = SubLObjectFactory.makeSymbol("FUNCTION-WORD-TREE");
        $sym169$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS");
        $sym170$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE");
        $sym171$MODIFIER_WORD_TREE = SubLObjectFactory.makeSymbol("MODIFIER-WORD-TREE");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym173$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS");
        $sym174$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE");
        $sym175$COORDINATE_WORD_TREE = SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE");
        $list176 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym177$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS");
        $sym178$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; a list of the conjuncts of this conjunction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))));
        $sym180$GET_SISTER = SubLObjectFactory.makeSymbol("GET-SISTER");
        $sym181$COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $sym182$COORDINATE_PHRASE_P = SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-P");
        $sym183$PHRASE_TREE = SubLObjectFactory.makeSymbol("PHRASE-TREE");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase is a coordination, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONJUNCTION"))))));
        $sym185$GET_CONJUNCTION = SubLObjectFactory.makeSymbol("GET-CONJUNCTION");
        $sym186$PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");
        $sym187$COORDINATE_PHRASE_TREE = SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-TREE");
        $sym188$NOMINAL_PHRASE_TREE = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym190$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS");
        $sym191$DAUGHTERS = SubLObjectFactory.makeSymbol("DAUGHTERS");
        $sym192$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE");
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T));
        $sym194$COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");
        $sym195$UNLIKE_COORDINATE_PHRASE_TREE = SubLObjectFactory.makeSymbol("UNLIKE-COORDINATE-PHRASE-TREE");
        $sym196$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS");
        $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE");
        $sym198$UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = SubLObjectFactory.makeSymbol("UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");
        $sym199$NOMINAL_WORD_TREE = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE");
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD"));
        $list201 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SPECIFIER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER")))));
        $list203 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("PREP-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("CD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAIN-COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"))) }));
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"));
        $sym205$GET_OVERT_QUANTIFIER = SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER");
        $kw206$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $kw207$PREP_OBJECT = SubLObjectFactory.makeKeyword("PREP-OBJECT");
        $kw208$POSSESSOR = SubLObjectFactory.makeKeyword("POSSESSOR");
        $kw209$MODIFIED = SubLObjectFactory.makeKeyword("MODIFIED");
        $kw210$CD = SubLObjectFactory.makeKeyword("CD");
        $kw211$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw212$POSS_COL = SubLObjectFactory.makeKeyword("POSS-COL");
        $const213$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym214$NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-DISJ"));
        $list216 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)word_tree.NIL), (SubLObject)SubLObjectFactory.makeSymbol("INDEPENDENT-MODS"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-MODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-MOD-CYCLS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEPENDENT-MODS"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-MODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTITION-MODIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-DISJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-DISJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-MOD-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("INDEPENDENT-MODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-MOD-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-CONJ"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-DISJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS-CONJ"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS-DISJ"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("TERM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS-CONJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS-WITH-MODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-LEX-RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-MODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"))), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), (SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS-WITH-MODS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-DISJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("MY-CYCLS-WITH-MODS"))), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-DISJ"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-DISJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-CONJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-DISJ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-CONJ")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-CONJ"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-MOD-CYCLS"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))));
        $kw217$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym218$NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD");
        $list219 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER")))), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))));
        $sym220$GET_QUANTIFIER = SubLObjectFactory.makeSymbol("GET-QUANTIFIER");
        $sym221$NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD");
        $sym222$DEFINITE_DESCRIPTION_P = SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P");
        $list223 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("the"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))));
        $sym224$GET_DETERMINER = SubLObjectFactory.makeSymbol("GET-DETERMINER");
        $str225$the = SubLObjectFactory.makeString("the");
        $sym226$SINGULAR_P = SubLObjectFactory.makeSymbol("SINGULAR-P");
        $sym227$GET_POSSESSOR = SubLObjectFactory.makeSymbol("GET-POSSESSOR");
        $sym228$NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD");
        $sym229$RELATIONAL_NOUN_P = SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-P");
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAME-VARIABLES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAME-RENAMING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("POSS-COL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.T))))));
        $sym231$NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD");
        $list232 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("the"))), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL)))));
        $sym233$GET_EXISTENTIAL_NULL_DETERMINER = SubLObjectFactory.makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER");
        $sym234$PLURAL_P = SubLObjectFactory.makeSymbol("PLURAL-P");
        $sym235$NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD");
        $sym236$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS");
        $sym237$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE");
        $sym238$GET_NUMBER = SubLObjectFactory.makeSymbol("GET-NUMBER");
        $list239 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this noun with possible number values\n   :SINGULAR and :PLURAL\n   @note this should be overridden by the subclassses"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym240$NOMINAL_WORD_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-NUMBER-METHOD");
        $list241 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the complements of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)SubLObjectFactory.makeSymbol("SISTER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("of"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")))))));
        $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");
        $sym243$NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the determiner of this noun or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHADJP-TREE-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DET"))));
        $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");
        $sym246$FIND_LAST = SubLObjectFactory.makeSymbol("FIND-LAST");
        $sym247$DETERMINER_WORD_TREE_P = SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P");
        $sym248$WHADJP_TREE_P = SubLObjectFactory.makeSymbol("WHADJP-TREE-P");
        $sym249$FIND_FIRST = SubLObjectFactory.makeSymbol("FIND-FIRST");
        $sym250$NOMINAL_WORD_TREE_GET_DETERMINER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-DETERMINER-METHOD");
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER"))))));
        $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");
        $sym253$QUANTIFIER_TREE_P = SubLObjectFactory.makeSymbol("QUANTIFIER-TREE-P");
        $sym254$NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD");
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return determiner-word-tree-p; an empty (null) determiner for this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NULL-DETERMINER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))));
        $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $const257$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const258$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym259$WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD");
        $sym260$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym261$SET = SubLObjectFactory.makeSymbol("SET");
        $kw262$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str263$ = SubLObjectFactory.makeString("");
        $kw264$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $const265$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESTR"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE"));
        $const267$DeterminerFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DeterminerFrame"));
        $kw268$DT = SubLObjectFactory.makeKeyword("DT");
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the possessor phrase of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P")), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSIVE-P")))), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRP$-TREE-P")), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))));
        $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");
        $sym271$NOMINAL_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P");
        $sym272$POSSESSIVE_P = SubLObjectFactory.makeSymbol("POSSESSIVE-P");
        $sym273$PRP__TREE_P = SubLObjectFactory.makeSymbol("PRP$-TREE-P");
        $sym274$NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD");
        $sym275$GET_SPECIFIER = SubLObjectFactory.makeSymbol("GET-SPECIFIER");
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the specifier phrase of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIER"))));
        $sym277$NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD");
        $sym278$GET_ANTECEDENT = SubLObjectFactory.makeSymbol("GET-ANTECEDENT");
        $list279 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the tree that serves as an antecedent to this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym280$NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD");
        $sym281$GET_GENDER = SubLObjectFactory.makeSymbol("GET-GENDER");
        $list282 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of genders of this noun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("GENDER")), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)))));
        $kw283$GENDER = SubLObjectFactory.makeKeyword("GENDER");
        $sym284$NOMINAL_WORD_TREE_GET_GENDER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-GENDER-METHOD");
        $sym285$GET_PERSON = SubLObjectFactory.makeSymbol("GET-PERSON");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the person of this noun; 1, 2, or 3"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.THREE_INTEGER));
        $sym287$NOMINAL_WORD_TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-PERSON-METHOD");
        $list288 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this is singular, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("SINGULAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)))));
        $kw289$SINGULAR = SubLObjectFactory.makeKeyword("SINGULAR");
        $sym290$NOMINAL_WORD_TREE_SINGULAR_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-SINGULAR-P-METHOD");
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolenanp; t if this tree is plural, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)))));
        $kw292$PLURAL = SubLObjectFactory.makeKeyword("PLURAL");
        $sym293$NOMINAL_WORD_TREE_PLURAL_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-PLURAL-P-METHOD");
        $list294 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of trees this nominal word tree modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTORS"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPOSITIVE-NP-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTORS"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTORS"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?"), (SubLObject)word_tree.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"))));
        $sym295$GET_ANCESTORS = SubLObjectFactory.makeSymbol("GET-ANCESTORS");
        $sym296$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym297$COPULA_P = SubLObjectFactory.makeSymbol("COPULA-P");
        $sym298$GET_OBJECTS = SubLObjectFactory.makeSymbol("GET-OBJECTS");
        $sym299$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $sym300$NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD");
        $sym301$DAUGHTER_COUNT = SubLObjectFactory.makeSymbol("DAUGHTER-COUNT");
        $kw302$_ = SubLObjectFactory.makeKeyword(",");
        $sym303$NN_TREE = SubLObjectFactory.makeSymbol("NN-TREE");
        $list304 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym305$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS");
        $sym306$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE");
        $list307 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of all numbers of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SINGULAR")))));
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SINGULAR"));
        $sym309$NN_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NN-TREE-GET-NUMBER-METHOD");
        $sym310$NAME_WORD_TREE = SubLObjectFactory.makeSymbol("NAME-WORD-TREE");
        $list311 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-WORD"));
        $list312 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $list313 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER")))));
        $sym314$NAME_WORD_TREE_GET_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("NAME-WORD-TREE-GET-QUANTIFIER-METHOD");
        $sym315$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS");
        $sym316$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE");
        $sym317$DOLLAR_WORD_TREE = SubLObjectFactory.makeSymbol("DOLLAR-WORD-TREE");
        $list318 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym319$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS");
        $sym320$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE");
        $list321 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT")))));
        $sym322$DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD");
        $sym323$NNP_TREE = SubLObjectFactory.makeSymbol("NNP-TREE");
        $sym324$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS");
        $sym325$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE");
        $sym326$NNP_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NNP-TREE-GET-NUMBER-METHOD");
        $sym327$NNS_TREE = SubLObjectFactory.makeSymbol("NNS-TREE");
        $sym328$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS");
        $sym329$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE");
        $list330 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of all numbers of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLURAL")))));
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLURAL"));
        $sym332$NNS_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NNS-TREE-GET-NUMBER-METHOD");
        $sym333$NNPS_TREE = SubLObjectFactory.makeSymbol("NNPS-TREE");
        $sym334$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS");
        $sym335$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE");
        $sym336$NNPS_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NNPS-TREE-GET-NUMBER-METHOD");
        $sym337$PRP_TREE = SubLObjectFactory.makeSymbol("PRP-TREE");
        $list338 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRONOUN-TREE"));
        $list339 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym340$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS");
        $sym341$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE");
        $list342 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeString("he"), (SubLObject)SubLObjectFactory.makeString("she"), (SubLObject)SubLObjectFactory.makeString("it"), (SubLObject)SubLObjectFactory.makeString("me"), (SubLObject)SubLObjectFactory.makeString("him"), (SubLObject)SubLObjectFactory.makeString("her"));
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("we"), (SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeString("they"), (SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeString("them"));
        $list344 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this pronoun with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("*SINGULAR-PERSONAL-PRONOUNS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeKeyword("SINGULAR"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("*PLURAL-PERSONAL-PRONOUNS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeKeyword("PLURAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))));
        $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");
        $sym346$PRP_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("PRP-TREE-GET-NUMBER-METHOD");
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the person of this pronoun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("I")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("me")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("you")), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("we")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("us")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)word_tree.T, (SubLObject)word_tree.THREE_INTEGER))));
        $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");
        $str349$I = SubLObjectFactory.makeString("I");
        $str350$me = SubLObjectFactory.makeString("me");
        $str351$you = SubLObjectFactory.makeString("you");
        $str352$we = SubLObjectFactory.makeString("we");
        $str353$us = SubLObjectFactory.makeString("us");
        $sym354$PRP_TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("PRP-TREE-GET-PERSON-METHOD");
        $list355 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("me"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("he"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("him"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("she"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("it"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("we"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("they"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("them"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)))));
        $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");
        $list357 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("me"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("he"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("him"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("she"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("it"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("we"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("they"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("them"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")) });
        $sym358$PRP_TREE_GET_GENDER_METHOD = SubLObjectFactory.makeSymbol("PRP-TREE-GET-GENDER-METHOD");
        $sym359$WP_TREE = SubLObjectFactory.makeSymbol("WP-TREE");
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE"));
        $list361 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym362$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS");
        $sym363$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE");
        $list364 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the unique referents of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))), (SubLObject)SubLObjectFactory.makeSymbol("REFS")))));
        $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");
        $sym366$WP_TREE_GET_REFS_METHOD = SubLObjectFactory.makeSymbol("WP-TREE-GET-REFS-METHOD");
        $list367 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GREAT-GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GREAT-GRANDMOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GREAT-GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GREAT-GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER)))));
        $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");
        $sym369$WP_TREE_GET_ANTECEDENT_METHOD = SubLObjectFactory.makeSymbol("WP-TREE-GET-ANTECEDENT-METHOD");
        $list370 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the quantifier of this name, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))));
        $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");
        $sym372$WP_TREE_GET_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("WP-TREE-GET-QUANTIFIER-METHOD");
        $list373 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this wp with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SINGULAR")))));
        $sym374$WP_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("WP-TREE-GET-NUMBER-METHOD");
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")))));
        $list376 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER"));
        $sym377$WP_TREE_GET_GENDER_METHOD = SubLObjectFactory.makeSymbol("WP-TREE-GET-GENDER-METHOD");
        $str378$that = SubLObjectFactory.makeString("that");
        $sym379$VERBAL_WORD_TREE = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE");
        $list380 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD"));
        $list381 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADJECTIVAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MATRIX-CLAUSE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARTICLE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INFINITIVE-MARKER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-TO-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INFINITIVE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-CONTROLLER-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-CONTROLLER-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTROL-VERB"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTROLLER"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOVED-NPS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOVED-OBJECTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-FILTER-LEXES"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $list382 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARTICLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParticleFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-PARTICLE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbParticle")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-PARTICLE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-PARTICLE-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym384$GET_PARTICLE = SubLObjectFactory.makeSymbol("GET-PARTICLE");
        $const385$ParticleFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParticleFrameType"));
        $const386$VerbParticle = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbParticle"));
        $sym387$VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD");
        $list388 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-CYCLIFIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("NON-DISTRIBUTING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")))))));
        $sym389$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $sym390$VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");
        $list391 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeKeyword("INF-COMP"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN")))));
        $list392 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("VBG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("PREP-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CL-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CL-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("CL-CYCLS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CL-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIFT-CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("CL-CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("CL-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INF-COMP"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("INF-COMP"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"))) }));
        $list393 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeKeyword("INF-COMP"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"));
        $sym394$GET_SEMANTIC_DIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT");
        $sym395$GET_SEMANTIC_INDIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT");
        $sym396$GET_VERBAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT");
        $list397 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("VBG"));
        $kw398$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $kw399$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw400$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $kw401$CLAUSE = SubLObjectFactory.makeKeyword("CLAUSE");
        $kw402$INF_COMP = SubLObjectFactory.makeKeyword("INF-COMP");
        $sym403$VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $sym404$GET_CONTROLLER = SubLObjectFactory.makeSymbol("GET-CONTROLLER");
        $list405 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTROL-VERB"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-CONTROLLER-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-CONTROLLER-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"))))))));
        $sym406$GET_CONTROL_VERB = SubLObjectFactory.makeSymbol("GET-CONTROL-VERB");
        $sym407$SUBJECT_CONTROLLER_P = SubLObjectFactory.makeSymbol("SUBJECT-CONTROLLER-P");
        $sym408$OBJECT_CONTROLLER_P = SubLObjectFactory.makeSymbol("OBJECT-CONTROLLER-P");
        $sym409$GET_DIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT");
        $sym410$VERBAL_WORD_TREE_GET_CONTROLLER_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-CONTROLLER-METHOD");
        $list411 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MATRIX-CLAUSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATRIX-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-VERB-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX-HEAD")))));
        $sym412$GET_MATRIX_CLAUSE = SubLObjectFactory.makeSymbol("GET-MATRIX-CLAUSE");
        $sym413$CONTROL_VERB_P = SubLObjectFactory.makeSymbol("CONTROL-VERB-P");
        $sym414$VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD");
        $list415 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectControlFrame")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))))));
        $list416 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectControlFrame")));
        $sym417$VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD");
        $list418 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntransitiveSubjectControlFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveSubjectControlFrame")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))))));
        $list419 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntransitiveSubjectControlFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveSubjectControlFrame")));
        $sym420$VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD");
        $list421 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-CONTROLLER-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-CONTROLLER-P"))))));
        $sym422$VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD");
        $list423 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENTIAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym424$VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD");
        $sym425$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS");
        $sym426$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE");
        $sym427$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $list428 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the predicate of this sentence"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD")))));
        $sym429$GET_SEMANTIC_HEAD = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD");
        $sym430$VERBAL_WORD_TREE_GET_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-PREDICATE-METHOD");
        $list431 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this verb with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"))))))));
        $sym432$FINITE_P = SubLObjectFactory.makeSymbol("FINITE-P");
        $sym433$VERBAL_WORD_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-NUMBER-METHOD");
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the person of this verb; 1, 2, or 3"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"))))))));
        $sym435$VERBAL_WORD_TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-PERSON-METHOD");
        $sym436$GET_TENSE = SubLObjectFactory.makeSymbol("GET-TENSE");
        $list437 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym438$VERBAL_WORD_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-TENSE-METHOD");
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the subject of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROLLER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTROLLER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROLLER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROLLER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))));
        $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym441$NOMINAL_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-TREE-P");
        $sym442$VERBAL_WORD_TREE_GET_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-SUBJECT-METHOD");
        $list443 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all objects of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRANDED-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"))));
        $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym445$GET_INDIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT");
        $sym446$STRANDED_P = SubLObjectFactory.makeSymbol("STRANDED-P");
        $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P");
        $sym448$VERBAL_WORD_TREE_GET_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-OBJECTS-METHOD");
        $sym449$GET_MOVED_NPS = SubLObjectFactory.makeSymbol("GET-MOVED-NPS");
        $list450 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of all non-local nps of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOVED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)SubLObjectFactory.makeSymbol("MOVED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHNP-TREE-P")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"))));
        $sym451$WHNP_TREE_P = SubLObjectFactory.makeSymbol("WHNP-TREE-P");
        $sym452$VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD");
        $sym453$GET_MOVED_OBJECTS = SubLObjectFactory.makeSymbol("GET-MOVED-OBJECTS");
        $list454 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of all non-local ('moved') objects of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOVED-NPS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQ))));
        $sym455$VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD");
        $list456 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the direct object of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOVED-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"))))))));
        $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym458$VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD");
        $list459 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the indirect object of this verb, including oblique objects\n   embedded within a PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOVED-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("MOVED"))))))));
        $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym461$VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD");
        $list462 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic direct object of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT")))));
        $sym463$VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD");
        $list464 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic indirect object of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT")))));
        $sym465$VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");
        $list466 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all verbal complements of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))));
        $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym468$VERBAL_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P");
        $sym469$VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");
        $sym470$GET_ADJECTIVAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-ADJECTIVAL-COMPLEMENT");
        $list471 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return adjp-tree-p; the adjectival complement of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJP-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))));
        $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym473$ADJP_TREE_P = SubLObjectFactory.makeSymbol("ADJP-TREE-P");
        $sym474$VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD");
        $list475 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all complements of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))));
        $sym476$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $sym477$VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $list478 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; this verb's particle phrase, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-PHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRT-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-PHRASE")))));
        $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym480$PRT_TREE_P = SubLObjectFactory.makeSymbol("PRT-TREE-P");
        $sym481$VERBAL_WORD_TREE_GET_PARTICLE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-PARTICLE-METHOD");
        $sym482$GET_INFINITIVE_MARKER = SubLObjectFactory.makeSymbol("GET-INFINITIVE-MARKER");
        $list483 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; this verb's infinitive marker"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.MINUS_ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("TO"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE")))));
        $kw484$TO = SubLObjectFactory.makeKeyword("TO");
        $sym485$VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD");
        $sym486$DUMMY_TO_P = SubLObjectFactory.makeSymbol("DUMMY-TO-P");
        $list487 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this verb is a dummy 'to', nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("to"))));
        $str488$to = SubLObjectFactory.makeString("to");
        $sym489$VERBAL_WORD_TREE_DUMMY_TO_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-DUMMY-TO-P-METHOD");
        $list490 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))));
        $sym491$VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD");
        $list492 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of the semantic subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-OBJECTS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("INDIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-OBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-OBJECTS"))));
        $sym493$VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD");
        $sym494$GET_ANCESTOR_OBJECTS = SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS");
        $list495 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the local syntactic objects of this tree and its ancestors"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS")))));
        $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym497$VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD");
        $sym498$INVERTED_P = SubLObjectFactory.makeSymbol("INVERTED-P");
        $list499 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is inverted, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym500$VERBAL_WORD_TREE_INVERTED_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-INVERTED-P-METHOD");
        $list501 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this word is finite, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINITE-VERBAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym502$VERBAL_WORD_TREE_FINITE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-FINITE-P-METHOD");
        $sym503$PASSIVE_P = SubLObjectFactory.makeSymbol("PASSIVE-P");
        $list504 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym505$VERBAL_WORD_TREE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-PASSIVE-P-METHOD");
        $sym506$INFINITIVE_P = SubLObjectFactory.makeSymbol("INFINITIVE-P");
        $list507 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolenap; t if this verb is in the infinitive form, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INFINITIVE-MARKER"))))));
        $sym508$VERBAL_WORD_TREE_INFINITIVE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-INFINITIVE-P-METHOD");
        $sym509$BASE_P = SubLObjectFactory.makeSymbol("BASE-P");
        $list510 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is in its base form, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INFINITIVE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MODAL-VERB-TREE-P"))), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("did"))))))));
        $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym512$MODAL_VERB_TREE_P = SubLObjectFactory.makeSymbol("MODAL-VERB-TREE-P");
        $str513$did = SubLObjectFactory.makeString("did");
        $sym514$VERBAL_WORD_TREE_BASE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-BASE-P-METHOD");
        $sym515$VBZ_TREE = SubLObjectFactory.makeSymbol("VBZ-TREE");
        $list516 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINITE-VERBAL-WORD-TREE"));
        $list517 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym518$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS");
        $sym519$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE");
        $list520 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("PRESENT")));
        $kw521$PRESENT = SubLObjectFactory.makeKeyword("PRESENT");
        $sym522$VBZ_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VBZ-TREE-GET-TENSE-METHOD");
        $sym523$VBN_TREE = SubLObjectFactory.makeSymbol("VBN-TREE");
        $list524 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-AUX-VERB"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym525$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS");
        $sym526$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE");
        $sym527$GET_AUX_VERB = SubLObjectFactory.makeSymbol("GET-AUX-VERB");
        $list528 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return aux-verb-tree-p; the aux verb of this participle form"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P")))))));
        $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");
        $sym530$AUX_VERB_TREE_P = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P");
        $sym531$VBN_TREE_GET_AUX_VERB_METHOD = SubLObjectFactory.makeSymbol("VBN-TREE-GET-AUX-VERB-METHOD");
        $list532 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))), (SubLObject)SubLObjectFactory.makeSymbol("PPHEAD"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)SubLObjectFactory.makeSymbol("PPS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PPHEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PPHEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PPHEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITION"), (SubLObject)SubLObjectFactory.makeString("by")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))));
        $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");
        $str534$by = SubLObjectFactory.makeString("by");
        $sym535$VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD");
        $list536 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic direct object of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LOCALS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"))))));
        $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");
        $sym538$VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD");
        $list539 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic indirect object of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBLIQUE-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"))))));
        $sym540$VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");
        $list541 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("am"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"), (SubLObject)SubLObjectFactory.makeString("been"), (SubLObject)SubLObjectFactory.makeString("had"), (SubLObject)SubLObjectFactory.makeString("be"));
        $list542 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-AUX-VERB"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("AUX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("AUX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("*TO-BE-FORMS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP))))));
        $sym543$VBN_TREE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("VBN-TREE-PASSIVE-P-METHOD");
        $sym544$VBD_TREE = SubLObjectFactory.makeSymbol("VBD-TREE");
        $sym545$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS");
        $sym546$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE");
        $list547 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("PAST")));
        $kw548$PAST = SubLObjectFactory.makeKeyword("PAST");
        $sym549$VBD_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VBD-TREE-GET-TENSE-METHOD");
        $sym550$VBP_TREE = SubLObjectFactory.makeSymbol("VBP-TREE");
        $sym551$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS");
        $sym552$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE");
        $sym553$VBP_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VBP-TREE-GET-TENSE-METHOD");
        $sym554$VB_TREE = SubLObjectFactory.makeSymbol("VB-TREE");
        $sym555$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS");
        $sym556$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE");
        $list557 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("INFINITIVE")));
        $kw558$INFINITIVE = SubLObjectFactory.makeKeyword("INFINITIVE");
        $sym559$VB_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VB-TREE-GET-TENSE-METHOD");
        $sym560$VBG_TREE = SubLObjectFactory.makeSymbol("VBG-TREE");
        $list561 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-AUX-VERB"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym562$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS");
        $sym563$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE");
        $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VBG-TREE-METHOD");
        $sym565$VBG_TREE_GET_AUX_VERB_METHOD = SubLObjectFactory.makeSymbol("VBG-TREE-GET-AUX-VERB-METHOD");
        $list566 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of constituents this verb modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-AUX-VERB"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMAS-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMAS-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMAS-HEAD")))))));
        $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VBG-TREE-METHOD");
        $sym568$VBG_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("VBG-TREE-GET-MODIFIEDS-METHOD");
        $sym569$AUX_VERB_TREE = SubLObjectFactory.makeSymbol("AUX-VERB-TREE");
        $list570 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINITE-VERBAL-WORD-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-WORD"));
        $list571 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREPOSITIONAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADVERBIAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list572 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"))))));
        $sym573$AUX_VERB_TREE_COPULA_P_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-COPULA-P-METHOD");
        $list574 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT")))));
        $list575 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIFT-CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS")))));
        $list576 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT"));
        $kw577$COMPLEMENT = SubLObjectFactory.makeKeyword("COMPLEMENT");
        $sym578$AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $list579 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")))))));
        $sym580$AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD");
        $list581 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREP-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREPOSITIONAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJ-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADJECTIVAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADV-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADVERBIAL-COMPLEMENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ADV-COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ADJ-COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("PREP-COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))));
        $sym582$GET_PREPOSITIONAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-PREPOSITIONAL-COMPLEMENT");
        $sym583$GET_ADVERBIAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-ADVERBIAL-COMPLEMENT");
        $sym584$AUX_VERB_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-COMPLEMENTS-METHOD");
        $list585 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))));
        $sym586$AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD");
        $list587 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("am"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("have"), (SubLObject)SubLObjectFactory.makeString("has"), (SubLObject)SubLObjectFactory.makeString("do"), (SubLObject)SubLObjectFactory.makeString("does"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)SubLObjectFactory.makeKeyword("PRESENT")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"), (SubLObject)SubLObjectFactory.makeString("had"), (SubLObject)SubLObjectFactory.makeString("did"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)SubLObjectFactory.makeKeyword("PAST")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("be"), (SubLObject)SubLObjectFactory.makeString("do"), (SubLObject)SubLObjectFactory.makeString("have"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)SubLObjectFactory.makeKeyword("INFINITIVE")))));
        $list588 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("am"), (SubLObject)SubLObjectFactory.makeString("are"), (SubLObject)SubLObjectFactory.makeString("have"), (SubLObject)SubLObjectFactory.makeString("has"), (SubLObject)SubLObjectFactory.makeString("do"), (SubLObject)SubLObjectFactory.makeString("does"));
        $list589 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("was"), (SubLObject)SubLObjectFactory.makeString("were"), (SubLObject)SubLObjectFactory.makeString("had"), (SubLObject)SubLObjectFactory.makeString("did"));
        $list590 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("be"), (SubLObject)SubLObjectFactory.makeString("do"), (SubLObject)SubLObjectFactory.makeString("have"));
        $sym591$AUX_VERB_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-TENSE-METHOD");
        $sym592$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS");
        $sym593$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE");
        $list594 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PP"), (SubLObject)SubLObjectFactory.makeSymbol("PP")))));
        $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");
        $sym596$AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD");
        $list597 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return adverbial-word-tree-p; the adverbial complement of this aux verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym598$AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD");
        $list599 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the subject of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))))));
        $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");
        $sym601$AUX_VERB_TREE_GET_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-SUBJECT-METHOD");
        $list602 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))));
        $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");
        $sym604$AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD");
        $list605 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN-VERB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT")))))));
        $sym606$AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD");
        $list607 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic subject of this aux tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))))));
        $sym608$AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD");
        $list609 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is inverted, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MATRIX-CLAUSE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINV-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MATRIX")))))));
        $sym610$AUX_VERB_TREE_INVERTED_P_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-INVERTED-P-METHOD");
        $list611 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P")))))));
        $sym612$AUX_VERB_TREE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("AUX-VERB-TREE-PASSIVE-P-METHOD");
        $sym613$MODAL_VERB_TREE = SubLObjectFactory.makeSymbol("MODAL-VERB-TREE");
        $list614 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym615$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS");
        $sym616$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE");
        $list617 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE\n   @hack 'could' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("will")), (SubLObject)SubLObjectFactory.makeKeyword("FUTURE"), (SubLObject)SubLObjectFactory.makeKeyword("PRESENT"))));
        $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-MODAL-VERB-TREE-METHOD");
        $str619$will = SubLObjectFactory.makeString("will");
        $kw620$FUTURE = SubLObjectFactory.makeKeyword("FUTURE");
        $sym621$MODAL_VERB_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("MODAL-VERB-TREE-GET-TENSE-METHOD");
        $list622 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of objects of this modal"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL));
        $sym623$MODAL_VERB_TREE_GET_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("MODAL-VERB-TREE-GET-OBJECTS-METHOD");
        $sym624$ADJECTIVAL_WORD_TREE = SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE");
        $list625 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD"));
        $list626 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $list627 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT")))));
        $list628 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)word_tree.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("PREP-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ-HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL))));
        $list629 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("REPLACE"), (SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"));
        $sym630$ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $list631 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("OBL-OBJ")))))));
        $sym632$ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $sym633$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS");
        $sym634$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE");
        $list635 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of phrases modified by this adjective"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.MINUS_ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"))))));
        $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD");
        $sym637$GET_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER");
        $sym638$ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD");
        $list639 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return verbal-tree-p; the verbal complement of this adjective"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBAR-TREE-P")))));
        $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD");
        $sym641$SBAR_TREE_P = SubLObjectFactory.makeSymbol("SBAR-TREE-P");
        $sym642$ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");
        $sym643$ADVERBIAL_WORD_TREE = SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE");
        $list644 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD"));
        $list645 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $list646 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT")))));
        $list647 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL))));
        $list648 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $sym649$ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $sym650$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS");
        $sym651$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE");
        $list652 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of phrases modified by this adverb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMERICAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS")))))));
        $sym653$ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD");
        $sym654$WRB_WORD_TREE = SubLObjectFactory.makeSymbol("WRB-WORD-TREE");
        $list655 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE"));
        $sym656$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS");
        $sym657$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE");
        $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE");
        $list659 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD"));
        $list660 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $list661 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE")))));
        $list662 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("that")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL)))));
        $list663 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("CLAUSE"));
        $sym664$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS");
        $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE");
        $list667 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return nominal-tree-p; the singleton lists of complements of this preposition"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENTIAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBAR-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBARQ-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHNP-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER)))));
        $sym668$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD");
        $list669 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return verbal-tree-p; the verbal complement of this preposition or particle"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")))));
        $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");
        $sym671$VERBAL_TREE_P = SubLObjectFactory.makeSymbol("VERBAL-TREE-P");
        $sym672$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");
        $list673 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return nominal-tree-p; the complements of this preposition"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENTIAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBAR-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBARQ-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHNP-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)word_tree.ZERO_INTEGER))))))));
        $sym674$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $list675 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of trees this preposition modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHPP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER")), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQ-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-PHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-PHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-PHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD")), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)word_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQ, (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS")))));
        $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");
        $sym677$PHRASE_TREE_P = SubLObjectFactory.makeSymbol("PHRASE-TREE-P");
        $sym678$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD");
        $list679 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the unique referents of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REFS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("of")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REFS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-WORD-TREE-REFS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORD-TREE-REFS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");
        $sym681$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD");
        $list682 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("that")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))))));
        $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");
        $sym684$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD");
        $sym685$PREPOSITIONAL_WORD_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-WORD-TREE");
        $list686 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE"));
        $sym687$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS");
        $sym688$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE");
        $sym689$PARTICLE_WORD_TREE = SubLObjectFactory.makeSymbol("PARTICLE-WORD-TREE");
        $list690 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-TREE"));
        $sym691$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS");
        $sym692$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE");
        $sym693$SPECIFIER_WORD_TREE = SubLObjectFactory.makeSymbol("SPECIFIER-WORD-TREE");
        $list694 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SPECIFIED"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym695$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS");
        $sym696$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE");
        $sym697$GET_SPECIFIED = SubLObjectFactory.makeSymbol("GET-SPECIFIED");
        $list698 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the tree that this specifier specifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))));
        $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SPECIFIER-WORD-TREE-METHOD");
        $sym700$SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD = SubLObjectFactory.makeSymbol("SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD");
        $sym701$QUANTIFIER_WORD_TREE = SubLObjectFactory.makeSymbol("QUANTIFIER-WORD-TREE");
        $list702 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-WORD"));
        $list703 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIED"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SPECIFIED"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $list704 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("RESTR"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE")))));
        $list705 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS")))));
        $list706 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("RESTR"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE"));
        $sym707$QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $sym708$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS");
        $sym709$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE");
        $sym710$GET_QUANTIFIED = SubLObjectFactory.makeSymbol("GET-QUANTIFIED");
        $list711 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree; the word that restricts the variable that this determiner quantifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHADJP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))))));
        $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUANTIFIER-WORD-TREE-METHOD");
        $sym713$QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD = SubLObjectFactory.makeSymbol("QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD");
        $list714 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree; the word that this specifier specifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIED")))));
        $sym715$QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD = SubLObjectFactory.makeSymbol("QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD");
        $sym716$DETERMINER_WORD_TREE = SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE");
        $sym717$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS");
        $sym718$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE");
        $sym719$PRP__TREE = SubLObjectFactory.makeSymbol("PRP$-TREE");
        $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS");
        $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE");
        $list722 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("my"), (SubLObject)SubLObjectFactory.makeString("your"), (SubLObject)SubLObjectFactory.makeString("his"), (SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeString("its"));
        $list723 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("our"), (SubLObject)SubLObjectFactory.makeString("your"), (SubLObject)SubLObjectFactory.makeString("their"));
        $list724 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this possessive pronoun with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("*SINGULAR-POSSESSIVE-PRONOUNS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeKeyword("SINGULAR"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("*PLURAL-POSSESSIVE-PRONOUNS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeKeyword("PLURAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERS"))));
        $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");
        $sym726$PRP__TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("PRP$-TREE-GET-NUMBER-METHOD");
        $list727 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the person of this noun; 1, 2, or 3"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("my")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("your")), (SubLObject)word_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("our")), (SubLObject)word_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)word_tree.T, (SubLObject)word_tree.THREE_INTEGER))));
        $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");
        $str729$my = SubLObjectFactory.makeString("my");
        $str730$your = SubLObjectFactory.makeString("your");
        $str731$our = SubLObjectFactory.makeString("our");
        $sym732$PRP__TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("PRP$-TREE-GET-PERSON-METHOD");
        $list733 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("my"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("your"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("his"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("its"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("our"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("their"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQUALP)))));
        $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");
        $list735 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("my"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("your"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("his"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("its"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("our"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("their"), (SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")));
        $sym736$PRP__TREE_GET_GENDER_METHOD = SubLObjectFactory.makeSymbol("PRP$-TREE-GET-GENDER-METHOD");
        $sym737$WDT_WORD_TREE = SubLObjectFactory.makeSymbol("WDT-WORD-TREE");
        $list738 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym739$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS");
        $sym740$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE");
        $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD");
        $sym742$WDT_WORD_TREE_GET_REFS_METHOD = SubLObjectFactory.makeSymbol("WDT-WORD-TREE-GET-REFS-METHOD");
        $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD");
        $sym744$WDT_WORD_TREE_GET_ANTECEDENT_METHOD = SubLObjectFactory.makeSymbol("WDT-WORD-TREE-GET-ANTECEDENT-METHOD");
        $sym745$POSSESSIVE_WORD_TREE = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE");
        $list746 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSIVE-WORD"));
        $list747 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSED"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $list748 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED")))));
        $list749 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-KEYWORD-RENAMING"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSED")), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"), (SubLObject)word_tree.NIL))));
        $list750 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED"));
        $sym751$GET_POSSESSED = SubLObjectFactory.makeSymbol("GET-POSSESSED");
        $kw752$POSSESSED = SubLObjectFactory.makeKeyword("POSSESSED");
        $sym753$POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");
        $sym754$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS");
        $sym755$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE");
        $list756 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return nominal-word-tree-p; the word that is the possessor in this possessive relation"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)word_tree.MINUS_ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR")))));
        $sym757$POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD");
        $list758 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return nominal-word-tree-p; the word that is the possessed in this possessive relation"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER-HEAD")))));
        $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");
        $sym760$POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD");
        $list761 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all complements of this tree, in surface order"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSED"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))));
        $sym762$POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD");
        $list763 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the constituents this possessive marker modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)word_tree.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"))))))));
        $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");
        $sym765$POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD");
        $sym766$CARDINAL_WORD_TREE = SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE");
        $list767 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMERICAL-TREE"));
        $sym768$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS");
        $sym769$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE");
        $sym770$EXISTENTIAL_WORD_TREE = SubLObjectFactory.makeSymbol("EXISTENTIAL-WORD-TREE");
        $sym771$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS");
        $sym772$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE");
        $sym773$PUNCTUATION_WORD_TREE = SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE");
        $list774 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD"));
        $sym775$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS");
        $sym776$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE");
        $list777 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeSymbol("NN-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeSymbol("NNS-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeSymbol("NNP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NNPS"), (SubLObject)SubLObjectFactory.makeSymbol("NNPS-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NPS"), (SubLObject)SubLObjectFactory.makeSymbol("NNPS-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NPLIST"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WP"), (SubLObject)SubLObjectFactory.makeSymbol("WP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRP"), (SubLObject)SubLObjectFactory.makeSymbol("PRP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FW"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VBZ"), (SubLObject)SubLObjectFactory.makeSymbol("VBZ-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeSymbol("VBN-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)SubLObjectFactory.makeSymbol("VBD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VBP"), (SubLObject)SubLObjectFactory.makeSymbol("VBP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VB"), (SubLObject)SubLObjectFactory.makeSymbol("VB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VBG"), (SubLObject)SubLObjectFactory.makeSymbol("VBG-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("AUX"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("AUXZ"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("AUXD"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("AUXG"), (SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MD"), (SubLObject)SubLObjectFactory.makeSymbol("MODAL-VERB-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IN"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("JJ"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("JJR"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("JJS"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RB"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WRB"), (SubLObject)SubLObjectFactory.makeSymbol("WRB-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RBR"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RBS"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WDT"), (SubLObject)SubLObjectFactory.makeSymbol("WDT-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRP$"), (SubLObject)SubLObjectFactory.makeSymbol("PRP$-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PDT"), (SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PP$"), (SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RP"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CD"), (SubLObject)SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EX"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTENTIAL-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("$"), (SubLObject)SubLObjectFactory.makeSymbol("DOLLAR-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("."), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword(","), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword(":"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("''"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("``"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("'"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("`"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("("), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword(")"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("-LRB-"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("-RRB-"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LS"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-WORD-TREE")) });
        $sym778$MULTI_NOUN_TREE = SubLObjectFactory.makeSymbol("MULTI-NOUN-TREE");
        $list779 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym780$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS");
        $sym781$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE");
        $sym782$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym783$COVERS = SubLObjectFactory.makeSymbol("COVERS");
        $list784 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS"));
        $list785 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T is the yield of the tree contains every string\n   in LIST-OF-STRINGS, NIL otherwise.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-WORDS"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("TREE-WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATCH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH"), (SubLObject)word_tree.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)word_tree.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")))));
        $sym786$PARSE_TREE_COVERS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-COVERS-METHOD");
        $sym787$COVERS_MINIMALLY = SubLObjectFactory.makeSymbol("COVERS-MINIMALLY");
        $list788 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T all the subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS")), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)word_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS")), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)word_tree.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")))));
        $list789 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $sym790$PARSE_TREE_COVERS_MINIMALLY_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-COVERS-MINIMALLY-METHOD");
        $sym791$GET_MINIMALLY_COVERING_SUBTREES = SubLObjectFactory.makeSymbol("GET-MINIMALLY-COVERING-SUBTREES");
        $list792 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return listp; a list of all the minimal subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MINIMAL"), (SubLObject)word_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS-MINIMALLY")), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)SubLObjectFactory.makeSymbol("MINIMAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS")), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MINIMAL"))));
        $sym793$PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD");
    }
}

/*

	Total time: 5589 ms
	
*/