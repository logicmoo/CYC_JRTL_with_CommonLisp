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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class word_tree
    extends
      SubLTranslatedFile
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
  public static SubLObject get_word_tree_abs_idx(final SubLObject v_word_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_tree, NINE_INTEGER, $sym4$ABS_IDX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject set_word_tree_abs_idx(final SubLObject v_word_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_tree, value, NINE_INTEGER, $sym4$ABS_IDX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject get_word_tree_refs(final SubLObject v_word_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_tree, EIGHT_INTEGER, $sym5$REFS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject set_word_tree_refs(final SubLObject v_word_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_tree, value, EIGHT_INTEGER, $sym5$REFS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject get_word_tree_lexes(final SubLObject v_word_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_tree, SEVEN_INTEGER, $sym6$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject set_word_tree_lexes(final SubLObject v_word_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_tree, value, SEVEN_INTEGER, $sym6$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_modified_dependent_meaning_p_method(final SubLObject self)
  {
    SubLObject semtrans = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
    SubLObject rle = NIL;
    rle = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      semtrans = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw11$SEMTRANS );
      if( NIL != subl_promotions.memberP( $kw12$REPLACE, cyclifier.formula_keywords( semtrans ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      rle = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_pp_comp_filter_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    SubLObject lexes = get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject filtered = NIL;
        final SubLObject pp = methods.funcall_instance_method_with_0_args( self, $sym18$GET_PP_COMPLEMENT );
        final SubLObject pp_head = ( NIL != pp ) ? methods.funcall_instance_method_with_0_args( pp, $sym19$GET_HEAD ) : NIL;
        SubLObject frame = NIL;
        if( NIL != pp_head )
        {
          SubLObject cdolist_list_var = lexes;
          SubLObject rle = NIL;
          rle = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            frame = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw20$FRAME );
            if( NIL != cycl_utilities.formula_arg2( frame, UNPROVIDED ) && NIL != isa.isaP( frame, $const21$PPCompFrame, $const22$EverythingPSC, UNPROVIDED ) )
            {
              final SubLObject preposition = cycl_utilities.formula_arg2( frame, UNPROVIDED );
              final SubLObject prep_string = lexicon_accessors.get_strings_of_type( preposition, $const23$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
              if( prep_string.equalp( methods.funcall_instance_method_with_0_args( pp_head, $sym24$GET_STRING ) ) )
              {
                cyclifier.rle_set_confidence( rle, ONE_INTEGER );
                filtered = ConsesLow.cons( rle, filtered );
              }
            }
            else
            {
              filtered = ConsesLow.cons( rle, filtered );
            }
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
          }
          lexes = filtered;
        }
        Dynamic.sublisp_throw( $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_frame_filter_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    SubLObject lexes = get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject filtered = NIL;
        final SubLObject tree_keywords = methods.funcall_instance_method_with_0_args( self, $sym29$TREE_KEYWORD_EQ_CLASSES );
        SubLObject lex_scores = NIL;
        SubLObject max_score = $int30$_5;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject lex_score = cyclifier_interface.lex_entry_score( cyclifier.rle_lex( rle ), tree_keywords );
          cyclifier.rle_set_confidence( rle, lex_score );
          lex_scores = ConsesLow.cons( rle, lex_scores );
          if( lex_score.numG( max_score ) )
          {
            max_score = lex_score;
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        cdolist_list_var = lex_scores;
        rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( cyclifier.rle_confidence( rle ).numE( max_score ) )
          {
            filtered = ConsesLow.cons( rle, filtered );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        lexes = filtered;
        Dynamic.sublisp_throw( $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_pos_filter_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    SubLObject lexes = get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != conses_high.member( methods.funcall_instance_method_with_0_args( self, $sym35$GET_CATEGORY ), methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw36$PENN_TAGS ),
              UNPROVIDED, UNPROVIDED ) )
          {
            cyclifier.rle_set_confidence( rle, ONE_INTEGER );
            filtered = ConsesLow.cons( rle, filtered );
          }
          else if( NIL != conses_high.member( methods.funcall_instance_method_with_0_args( self, $sym35$GET_CATEGORY ), methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET,
              $kw37$BACKOFF_PENN_TAGS ), UNPROVIDED, UNPROVIDED ) )
          {
            cyclifier.rle_set_confidence( rle, $float38$0_75 );
            filtered = ConsesLow.cons( rle, filtered );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        lexes = filtered;
        Dynamic.sublisp_throw( $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_tree_keyword_eq_classes_method(final SubLObject self)
  {
    return cyclifier_interface.keyword_eq_classes( Mapping.mapcar( $sym41$CAR, methods.funcall_instance_method_with_0_args( self, $sym42$GET_KEYWORD_RENAMINGS ).first().first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings)
  {
    if( renamings == UNPROVIDED )
    {
      renamings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ndistr_comp_cycls = NIL;
    SubLObject distr_comp_cycls = NIL;
    SubLObject mod_cycls = NIL;
    SubLObject cycls = NIL;
    if( NIL == subl_promotions.memberP( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ), EQ, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding( thread );
      try
      {
        cyclifier_interface.$cyclification_in_progress$.bind( ConsesLow.cons( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ) ), thread );
        if( NIL == renamings )
        {
          renamings = methods.funcall_instance_method_with_1_args( self, $sym42$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords( methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES ) ) );
        }
        renamings = cyclifier_interface.group_disjunctive_renamings( renamings );
        thread.resetMultipleValues();
        final SubLObject non_distributing = methods.funcall_instance_method_with_0_args( self, $sym47$PARTITION_SEMANTIC_COMPLEMENTS );
        final SubLObject distributing = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = non_distributing;
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args( complement, $sym48$CYCLIFY_INT );
          if( NIL != comp_cycl )
          {
            ndistr_comp_cycls = ConsesLow.cons( comp_cycl, ndistr_comp_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          complement = cdolist_list_var.first();
        }
        cdolist_list_var = distributing;
        complement = NIL;
        complement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args( complement, $sym48$CYCLIFY_INT );
          if( NIL != comp_cycl )
          {
            distr_comp_cycls = ConsesLow.cons( comp_cycl, distr_comp_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          complement = cdolist_list_var.first();
        }
        cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym49$GET_MODIFIERS );
        SubLObject modifier = NIL;
        modifier = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args( modifier, $sym48$CYCLIFY_INT );
          if( NIL != mod_cycl )
          {
            mod_cycls = ConsesLow.cons( mod_cycl, mod_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          modifier = cdolist_list_var.first();
        }
        cdolist_list_var = renamings;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
          SubLObject rle = NIL;
          rle = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            SubLObject my_cycls0 = NIL;
            SubLObject cdolist_list_var_$2 = conjunction;
            SubLObject grouping = NIL;
            grouping = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              SubLObject this_and_mods = NIL;
              SubLObject cdolist_list_var_$3 = grouping;
              SubLObject renaming = NIL;
              renaming = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                this_and_mods = ConsesLow.cons( Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( ConsesLow.list( cyclifier_interface.apply_lex_renaming( self, rle, renaming ) ),
                    mod_cycls ) ) ), this_and_mods );
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                renaming = cdolist_list_var_$3.first();
              }
              my_cycls0 = ConsesLow.cons( Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.indexed_products(
                  this_and_mods ) ), ndistr_comp_cycls ) ) ), my_cycls0 );
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              grouping = cdolist_list_var_$2.first();
            }
            cycls = ConsesLow.append( cycls, Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.indexed_products( my_cycls0 ) ) );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            rle = cdolist_list_var_$1.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          conjunction = cdolist_list_var.first();
        }
      }
      finally
      {
        cyclifier_interface.$cyclification_in_progress$.rebind( _prev_bind_0, thread );
      }
    }
    return Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( cycls, distr_comp_cycls ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_cyclify_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue( thread ) || NIL == conses_high.member( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ), EQ,
        UNPROVIDED ) )
    {
      cyclifier_interface.$cyclification_complete$.setDynamicValue( ConsesLow.cons( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ) ), thread );
      return methods.funcall_instance_method_with_0_args( self, $sym44$CYCLIFY_NUCLEUS );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_partition_semantic_complements_method(final SubLObject self)
  {
    return Values.values( methods.funcall_instance_method_with_0_args( self, $sym58$GET_SEMANTIC_COMPLEMENTS ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_get_semantic_complements_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym62$GET_COMPLEMENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_get_oblique_object_method(final SubLObject self)
  {
    final SubLObject pp = methods.funcall_instance_method_with_0_args( self, $sym18$GET_PP_COMPLEMENT );
    final SubLObject obl_obj = ( NIL != pp ) ? methods.funcall_instance_method_with_0_args( pp, $sym64$GET_OBLIQUE_OBJECT ) : NIL;
    return obl_obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_get_pp_complement_method(final SubLObject self)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym71$GET_PPS );
    SubLObject pp = NIL;
    pp = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pp_head = ( NIL != pp ) ? methods.funcall_instance_method_with_0_args( pp, $sym19$GET_HEAD ) : NIL;
      final SubLObject pp_head_string = ( NIL != pp_head ) ? methods.funcall_instance_method_with_0_args( pp_head, $sym24$GET_STRING ) : NIL;
      if( NIL != pp_head_string )
      {
        SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
        SubLObject rle = NIL;
        rle = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          final SubLObject cycl = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw11$SEMTRANS );
          final SubLObject keywords = cyclifier.formula_keywords( cycl );
          final SubLObject frame = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw20$FRAME );
          if( NIL != subl_promotions.memberP( $kw68$OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED ) && NIL != cycl_utilities.formula_arg2( frame, UNPROVIDED ) && NIL != isa.isaP( frame, $const21$PPCompFrame,
              $const22$EverythingPSC, UNPROVIDED ) )
          {
            final SubLObject preposition = cycl_utilities.formula_arg2( frame, UNPROVIDED );
            final SubLObject prep_string = lexicon_accessors.get_strings_of_type( preposition, $const23$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
            if( prep_string.equalp( pp_head_string ) )
            {
              return pp;
            }
          }
          else if( NIL != conses_high.intersection( $list69, keywords, EQL, UNPROVIDED ) && $str70$of.equalp( pp_head_string ) )
          {
            return pp;
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          rle = cdolist_list_var_$4.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      pp = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject subloop_reserved_initialize_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject subloop_reserved_initialize_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 5596L)
  public static SubLObject word_tree_p(final SubLObject v_word_tree)
  {
    return classes.subloop_instanceof_class( v_word_tree, $sym0$WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 7847L)
  public static SubLObject new_word_tree(final SubLObject string, final SubLObject category, final SubLObject mother, final SubLObject idx, SubLObject lexes, SubLObject v_context)
  {
    if( lexes == UNPROVIDED )
    {
      lexes = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym85$PARSE_TREE_CONTEXT );
    }
    final SubLObject self = object.new_class_instance( word_for_category( category ) );
    parse_tree.set_parse_tree_string( self, string );
    parse_tree.set_parse_tree_category( self, category );
    parse_tree.set_parse_tree_mother( self, mother );
    parse_tree.set_parse_tree_idx( self, idx );
    set_word_tree_lexes( self, lexes );
    parse_tree.set_parse_tree_context( self, v_context );
    set_word_tree_refs( self, ConsesLow.list( methods.funcall_instance_method_with_1_args( v_context, $sym86$NEW_VARIABLE, string ) ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8437L)
  public static SubLObject word_tree_get_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD, string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8559L)
  public static SubLObject word_tree_get_abs_index_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject abs_idx = get_word_tree_abs_idx( self );
    try
    {
      thread.throwStack.push( $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD, abs_idx );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_abs_idx( self, abs_idx );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8703L)
  public static SubLObject word_tree_get_lexes_method(final SubLObject self)
  {
    return Mapping.mapcar( $sym41$CAR, methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 8870L)
  public static SubLObject word_tree_get_ranked_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject lexes = get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9014L)
  public static SubLObject word_tree_get_refs_method(final SubLObject self)
  {
    final SubLObject refs = get_word_tree_refs( self );
    return refs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9145L)
  public static SubLObject word_tree_set_refs_method(final SubLObject self, final SubLObject referents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject refs = get_word_tree_refs( self );
    try
    {
      thread.throwStack.push( $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        instances.set_slot( self, $sym5$REFS, referents );
        Dynamic.sublisp_throw( $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_refs( self, refs );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9376L)
  public static SubLObject word_tree_yield_method(final SubLObject self)
  {
    return ConsesLow.list( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9497L)
  public static SubLObject word_tree_get_parse_expression_method(final SubLObject self)
  {
    return ConsesLow.list( methods.funcall_instance_method_with_0_args( self, $sym35$GET_CATEGORY ), methods.funcall_instance_method_with_0_args( self, $sym24$GET_STRING ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9703L)
  public static SubLObject word_tree_get_heads_method(final SubLObject self)
  {
    return ConsesLow.list( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9838L)
  public static SubLObject word_tree_get_head_method(final SubLObject self)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 9953L)
  public static SubLObject word_tree_get_semantic_heads_method(final SubLObject self)
  {
    return ConsesLow.list( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 10106L)
  public static SubLObject word_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon)
  {
    instances.set_slot( self, $sym6$LEXES, cyclifier.new_even_lex_entry_distribution( methods.funcall_instance_method_with_1_args( lexicon, $sym10$GET, instances.get_slot( self, $sym78$STRING ) ) ) );
    methods.funcall_instance_method_with_0_args( self, $sym32$POS_FILTER_LEXES );
    if( NIL != semtrans_lexicon.semtrans_lexicon_p( lexicon ) )
    {
      methods.funcall_instance_method_with_0_args( self, $sym15$PP_COMP_FILTER_LEXES );
      if( NIL != verbal_word_tree_p( self ) )
      {
        methods.funcall_instance_method_with_0_args( self, $sym127$PARTICLE_FILTER_LEXES );
      }
      methods.funcall_instance_method_with_0_args( self, $sym26$FRAME_FILTER_LEXES );
      instances.set_slot( self, $sym6$LEXES, Sequences.remove_duplicates( instances.get_slot( self, $sym6$LEXES ), $sym128$RLE_SEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL == instances.get_slot( self, $sym6$LEXES ) && NIL == term_lexicon.term_lexicon_p( lexicon ) && NIL == methods.funcall_instance_method_with_0_args( lexicon, $sym129$FABRICATION_FORBIDDEN_ ) )
      {
        final SubLObject fabricated_lexes = methods.funcall_instance_method_with_3_args( lexicon, $sym130$FABRICATE, instances.get_slot( self, $sym78$STRING ), Mapping.mapcar( $sym41$CAR, methods
            .funcall_instance_method_with_0_args( self, $sym42$GET_KEYWORD_RENAMINGS ).first().first() ), instances.get_slot( self, $sym79$CATEGORY ) );
        if( NIL != fabricated_lexes )
        {
          instances.set_slot( self, $sym6$LEXES, Mapping.mapcar( $sym131$NEW_RANKED_LEX_ENTRY, fabricated_lexes ) );
        }
      }
    }
    return instances.get_slot( self, $sym6$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 11477L)
  public static SubLObject word_tree_get_pps_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject pps = methods.funcall_instance_method_with_2_args( mother, $sym135$FIND, $sym136$PREPOSITIONAL_TREE_P, number_utilities.f_1X( idx ) );
        if( NIL != pps )
        {
          Dynamic.sublisp_throw( $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps );
        }
        SubLObject tree;
        for( tree = mother, pps = methods.funcall_instance_method_with_1_args( tree, $sym135$FIND, $sym137$WHPP_TREE_P ); NIL == pps && NIL == methods.funcall_instance_method_with_0_args( tree,
            $sym138$ROOT_P ); tree = methods.funcall_instance_method_with_0_args( tree, $sym139$GET_MOTHER ), pps = methods.funcall_instance_method_with_1_args( tree, $sym135$FIND, $sym137$WHPP_TREE_P ) )
        {
        }
        if( NIL != pps )
        {
          Dynamic.sublisp_throw( $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 11984L)
  public static SubLObject word_tree_get_complements_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12112L)
  public static SubLObject word_tree_get_modifiers_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject modifiers = parse_tree.get_parse_tree_modifiers( self );
    try
    {
      thread.throwStack.push( $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD, modifiers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_modifiers( self, modifiers );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12246L)
  public static SubLObject word_tree_get_modifieds_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 12380L)
  public static SubLObject word_tree_temporal_tree_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject lexes = get_word_tree_lexes( self );
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        final SubLObject tokens = string_utilities.split_string( string, UNPROVIDED );
        if( Sequences.length( tokens ).numL( TWO_INTEGER ) )
        {
          SubLObject cdolist_list_var;
          final SubLObject lexes_$5 = cdolist_list_var = methods.funcall_instance_method_with_1_args( term_lexicon.get_term_lexicon(), $sym10$GET, methods.funcall_instance_method_with_0_args( self, $sym24$GET_STRING ) );
          SubLObject lex = NIL;
          lex = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject denot = methods.funcall_instance_method_with_1_args( lex, $sym10$GET, $kw152$DENOT );
            if( NIL != term.el_fort_p( denot ) && NIL != at_utilities.more_specific_p( denot, $const153$Date, UNPROVIDED ) )
            {
              Dynamic.sublisp_throw( $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, T );
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
          }
        }
        else
        {
          final SubLObject v_parse_tree = methods.funcall_instance_method_with_1_args( parser.get_stanford_parser(), $sym154$PARSE, string );
          final SubLObject head = ( NIL != v_parse_tree ) ? methods.funcall_instance_method_with_0_args( v_parse_tree, $sym19$GET_HEAD ) : NIL;
          if( NIL != head )
          {
            Dynamic.sublisp_throw( $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( head, $sym149$TEMPORAL_TREE_P ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13052L)
  public static SubLObject word_tree_relative_pronoun_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        if( NIL == wdt_word_tree_p( self ) && NIL == wp_tree_p( self ) )
        {
          Dynamic.sublisp_throw( $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, NIL );
        }
        final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
        final SubLObject first_word = ( NIL != grandmother ) ? methods.funcall_instance_method_with_1_args( grandmother, $sym159$GET_DESCENDANT, $list160 ) : NIL;
        Dynamic.sublisp_throw( $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, makeBoolean( self.eql( first_word ) && NIL != relative_clause_p( grandmother ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13469L)
  public static SubLObject word_tree_retokenize_method(final SubLObject self, final SubLObject lexicon)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13568L)
  public static SubLObject word_tree_logical_form_int_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
  public static SubLObject subloop_reserved_initialize_function_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
  public static SubLObject subloop_reserved_initialize_function_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13695L)
  public static SubLObject function_word_tree_p(final SubLObject function_word_tree)
  {
    return classes.subloop_instanceof_class( function_word_tree, $sym168$FUNCTION_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
  public static SubLObject subloop_reserved_initialize_modifier_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
  public static SubLObject subloop_reserved_initialize_modifier_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13791L)
  public static SubLObject modifier_word_tree_p(final SubLObject modifier_word_tree)
  {
    return classes.subloop_instanceof_class( modifier_word_tree, $sym171$MODIFIER_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
  public static SubLObject subloop_reserved_initialize_coordinate_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
  public static SubLObject subloop_reserved_initialize_coordinate_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 13902L)
  public static SubLObject coordinate_word_tree_p(final SubLObject coordinate_word_tree)
  {
    return classes.subloop_instanceof_class( coordinate_word_tree, $sym175$COORDINATE_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14037L)
  public static SubLObject coordinate_word_tree_get_complements_method(final SubLObject self)
  {
    return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, MINUS_ONE_INTEGER ), methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14238L)
  public static SubLObject phrase_tree_coordinate_phrase_p_method(final SubLObject self)
  {
    return list_utilities.sublisp_boolean( methods.funcall_instance_method_with_0_args( self, $sym185$GET_CONJUNCTION ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
  public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
  public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym183$PHRASE_TREE, $sym191$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14424L)
  public static SubLObject coordinate_phrase_tree_p(final SubLObject coordinate_phrase_tree)
  {
    return classes.subloop_instanceof_class( coordinate_phrase_tree, $sym187$COORDINATE_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14549L)
  public static SubLObject coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
  public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
  public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym183$PHRASE_TREE, $sym191$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14638L)
  public static SubLObject unlike_coordinate_phrase_tree_p(final SubLObject unlike_coordinate_phrase_tree)
  {
    return classes.subloop_instanceof_class( unlike_coordinate_phrase_tree, $sym195$UNLIKE_COORDINATE_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14770L)
  public static SubLObject unlike_coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list204;
    }
    SubLObject conjuncts = NIL;
    SubLObject disjuncts = NIL;
    final SubLObject complement = methods.funcall_instance_method_with_0_args( self, $sym58$GET_SEMANTIC_COMPLEMENTS ).first();
    final SubLObject quantifier0 = methods.funcall_instance_method_with_0_args( self, $sym205$GET_OVERT_QUANTIFIER );
    final SubLObject quantifier2 = ( NIL != quantifier0 ) ? methods.funcall_instance_method_with_0_args( quantifier0, $sym19$GET_HEAD ) : NIL;
    final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
    if( NIL != subl_promotions.memberP( $kw206$NOUN, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw206$NOUN, self ), conjuncts );
    }
    if( NIL != complement && NIL != conses_high.member( $kw68$OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw207$PREP_OBJECT, complement ), conjuncts );
    }
    if( NIL != complement && NIL != conses_high.member( $kw208$POSSESSOR, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw208$POSSESSOR, complement ), conjuncts );
    }
    if( NIL != modified && NIL != conses_high.member( $kw209$MODIFIED, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw209$MODIFIED, modified ), conjuncts );
    }
    if( NIL != quantifier2 && methods.funcall_instance_method_with_0_args( quantifier2, $sym35$GET_CATEGORY ).eql( $kw210$CD ) && NIL != conses_high.member( $kw211$NUMBER, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw211$NUMBER, quantifier2 ), conjuncts );
    }
    if( NIL != complement && NIL != conses_high.member( $kw212$POSS_COL, keywords, EQL, UNPROVIDED ) )
    {
      final SubLObject head = methods.funcall_instance_method_with_0_args( complement, $sym19$GET_HEAD );
      SubLObject cycl = NIL;
      SubLObject col = NIL;
      if( NIL != head )
      {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( head, $sym94$GET_LEXES );
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cycl = methods.funcall_instance_method_with_1_args( lex, $sym10$GET, $kw11$SEMTRANS );
          col = parse_tree.main_collection( cycl, $kw206$NOUN );
          disjuncts = ConsesLow.cons( ConsesLow.cons( $kw212$POSS_COL, col ), disjuncts );
          cdolist_list_var = cdolist_list_var.rest();
          lex = cdolist_list_var.first();
        }
        if( NIL == disjuncts )
        {
          disjuncts = ConsesLow.cons( ConsesLow.cons( $kw212$POSS_COL, $const213$Thing ), disjuncts );
        }
      }
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, disjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings_disj)
  {
    if( renamings_disj == UNPROVIDED )
    {
      renamings_disj = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    SubLObject independent_mods = NIL;
    SubLObject dependent_mods = NIL;
    SubLObject comp_mod_cycls = NIL;
    thread.resetMultipleValues();
    final SubLObject independent_mods_$6 = cyclifier_interface.partition_modifiers( methods.funcall_instance_method_with_0_args( self, $sym49$GET_MODIFIERS ) );
    final SubLObject dependent_mods_$7 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    independent_mods = independent_mods_$6;
    dependent_mods = dependent_mods_$7;
    if( NIL == subl_promotions.memberP( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ), EQ, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding( thread );
      try
      {
        cyclifier_interface.$cyclification_in_progress$.bind( ConsesLow.cons( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ) ), thread );
        if( NIL == renamings_disj )
        {
          renamings_disj = methods.funcall_instance_method_with_1_args( self, $sym42$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords( methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES ) ) );
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym58$GET_SEMANTIC_COMPLEMENTS );
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args( complement, $sym48$CYCLIFY_INT );
          if( NIL != comp_cycl )
          {
            comp_mod_cycls = ConsesLow.cons( comp_cycl, comp_mod_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          complement = cdolist_list_var.first();
        }
        cdolist_list_var = independent_mods;
        SubLObject modifier = NIL;
        modifier = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args( modifier, $sym48$CYCLIFY_INT );
          if( NIL != mod_cycl )
          {
            comp_mod_cycls = ConsesLow.cons( mod_cycl, comp_mod_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          modifier = cdolist_list_var.first();
        }
        cdolist_list_var = renamings_disj;
        SubLObject renamings_conj = NIL;
        renamings_conj = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cycls_conj = NIL;
          SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
          SubLObject rle = NIL;
          rle = cdolist_list_var_$8.first();
          while ( NIL != cdolist_list_var_$8)
          {
            SubLObject cycls_disj = NIL;
            final SubLObject v_term = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw217$TERM );
            SubLObject cdolist_list_var_$9 = renamings_conj;
            SubLObject renaming = NIL;
            renaming = cdolist_list_var_$9.first();
            while ( NIL != cdolist_list_var_$9)
            {
              SubLObject my_cycls_with_mods = ConsesLow.list( ConsesLow.list( cyclifier_interface.apply_lex_renaming( self, rle, renaming ) ) );
              SubLObject cdolist_list_var_$10 = dependent_mods;
              SubLObject mod = NIL;
              mod = cdolist_list_var_$10.first();
              while ( NIL != cdolist_list_var_$10)
              {
                my_cycls_with_mods = ConsesLow.cons( methods.funcall_instance_method_with_1_args( mod, $sym44$CYCLIFY_NUCLEUS, cyclifier_interface.update_keyword_renamings( methods.funcall_instance_method_with_0_args(
                    mod, $sym42$GET_KEYWORD_RENAMINGS ), $kw12$REPLACE, v_term ) ), my_cycls_with_mods );
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                mod = cdolist_list_var_$10.first();
              }
              cycls_disj = ConsesLow.append( Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.cross_products( my_cycls_with_mods ) ), cycls_disj );
              cdolist_list_var_$9 = cdolist_list_var_$9.rest();
              renaming = cdolist_list_var_$9.first();
            }
            if( NIL != cycls_disj )
            {
              cycls_conj = ConsesLow.append( cycls_disj, cycls_conj );
            }
            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
            rle = cdolist_list_var_$8.first();
          }
          cycls = ConsesLow.append( cycls, Mapping.mapcar( $sym50$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( cycls_conj, comp_mod_cycls ) ) ) );
          cdolist_list_var = cdolist_list_var.rest();
          renamings_conj = cdolist_list_var.first();
        }
      }
      finally
      {
        cyclifier_interface.$cyclification_in_progress$.rebind( _prev_bind_0, thread );
      }
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_cyclify_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue( thread ) || NIL == conses_high.member( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ), EQ,
        UNPROVIDED ) )
    {
      cyclifier_interface.$cyclification_complete$.setDynamicValue( ConsesLow.cons( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ) ), thread );
      final SubLObject quantifier = methods.funcall_instance_method_with_0_args( self, $sym220$GET_QUANTIFIER );
      SubLObject result = NIL;
      result = ( ( NIL != quantifier ) ? methods.funcall_instance_method_with_0_args( quantifier, $sym48$CYCLIFY_INT ) : methods.funcall_instance_method_with_0_args( self, $sym44$CYCLIFY_NUCLEUS ) );
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_definite_description_p_method(final SubLObject self)
  {
    final SubLObject det = methods.funcall_instance_method_with_0_args( self, $sym224$GET_DETERMINER );
    if( NIL != det && methods.funcall_instance_method_with_0_args( det, $sym24$GET_STRING ).equalp( $str225$the ) )
    {
      return T;
    }
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym19$GET_HEAD );
    if( NIL != head && NIL != cyclifier_interface.name_word_p( head ) && NIL != methods.funcall_instance_method_with_0_args( head, $sym226$SINGULAR_P ) )
    {
      return T;
    }
    final SubLObject pos = methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR );
    if( NIL != pos )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_relational_noun_p_method(final SubLObject self)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym13$GET_RANKED_LEXES );
    SubLObject rle = NIL;
    rle = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject denot = cyclifier.rename_variables( methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw11$SEMTRANS ), cyclifier.frame_renaming( methods
          .funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw20$FRAME ) ) );
      final SubLObject keywords = cyclifier.formula_keywords( denot );
      SubLObject cdolist_list_var_$11 = $list69;
      SubLObject keyword = NIL;
      keyword = cdolist_list_var_$11.first();
      while ( NIL != cdolist_list_var_$11)
      {
        if( NIL != subl_promotions.memberP( keyword, keywords, EQ, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
        keyword = cdolist_list_var_$11.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      rle = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_get_quantifier_method(final SubLObject self)
  {
    final SubLObject quantifier = methods.funcall_instance_method_with_0_args( self, $sym205$GET_OVERT_QUANTIFIER );
    if( NIL != quantifier )
    {
      return methods.funcall_instance_method_with_0_args( quantifier, $sym24$GET_STRING ).equalp( $str225$the ) ? NIL : quantifier;
    }
    if( NIL == methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR ) && NIL != methods.funcall_instance_method_with_0_args( self, $sym226$SINGULAR_P ) )
    {
      return methods.funcall_instance_method_with_0_args( self, $sym233$GET_EXISTENTIAL_NULL_DETERMINER );
    }
    if( NIL == methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR ) && NIL != methods.funcall_instance_method_with_0_args( self, $sym234$PLURAL_P ) )
    {
      return methods.funcall_instance_method_with_0_args( self, $sym233$GET_EXISTENTIAL_NULL_DETERMINER );
    }
    if( NIL == methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject subloop_reserved_initialize_nominal_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject subloop_reserved_initialize_nominal_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 14866L)
  public static SubLObject nominal_word_tree_p(final SubLObject nominal_word_tree)
  {
    return classes.subloop_instanceof_class( nominal_word_tree, $sym199$NOMINAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 16028L)
  public static SubLObject nominal_word_tree_get_number_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 16262L)
  public static SubLObject nominal_word_tree_get_complements_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_nominal_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym229$RELATIONAL_NOUN_P ) )
        {
          SubLObject complement = NIL;
          complement = methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR );
          if( NIL == complement && NIL != mother )
          {
            final SubLObject sister = methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, ONE_INTEGER );
            final SubLObject sister_head = ( NIL != sister ) ? methods.funcall_instance_method_with_0_args( sister, $sym19$GET_HEAD ) : NIL;
            if( NIL != parse_tree.prepositional_or_particle_phrase_tree_p( sister ) && NIL != sister_head && methods.funcall_instance_method_with_0_args( sister_head, $sym24$GET_STRING ).equalp( $str70$of ) )
            {
              complement = methods.funcall_instance_method_with_0_args( sister, $sym64$GET_OBLIQUE_OBJECT );
            }
          }
          Dynamic.sublisp_throw( $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, ( NIL != complement ) ? ConsesLow.list( complement ) : NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_nominal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_nominal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17060L)
  public static SubLObject nominal_word_tree_get_determiner_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_nominal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
      try
      {
        SubLObject det = methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym247$DETERMINER_WORD_TREE_P, number_utilities.f_1_( idx ) );
        if( NIL != det )
        {
          Dynamic.sublisp_throw( $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det );
        }
        det = methods.funcall_instance_method_with_1_args( mother, $sym246$FIND_LAST, $sym248$WHADJP_TREE_P );
        if( NIL != det )
        {
          det = methods.funcall_instance_method_with_1_args( det, $sym249$FIND_FIRST, $sym247$DETERMINER_WORD_TREE_P );
        }
        Dynamic.sublisp_throw( $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_nominal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_nominal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17449L)
  public static SubLObject nominal_word_tree_get_overt_quantifier_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_nominal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject quant = methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym253$QUANTIFIER_TREE_P, number_utilities.f_1_( idx ) );
        if( NIL != quant )
        {
          Dynamic.sublisp_throw( $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, quant );
        }
        Dynamic.sublisp_throw( $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( self, $sym224$GET_DETERMINER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_nominal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_nominal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17758L)
  public static SubLObject word_tree_get_existential_null_determiner_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject v_context = parse_tree.get_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD, get_null_determiner( $const257$thereExists, $const258$and, self, v_context ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_context( self, v_context );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 17983L)
  public static SubLObject get_null_determiner(final SubLObject quantifier, final SubLObject connective, final SubLObject v_word_tree, SubLObject v_context)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = NIL;
    }
    final SubLObject lex = object.new_class_instance( $sym260$LEX_ENTRY );
    SubLObject word = NIL;
    methods.funcall_instance_method_with_2_args( lex, $sym261$SET, $kw262$STRING, $str263$ );
    methods.funcall_instance_method_with_2_args( lex, $sym261$SET, $kw264$CYC_POS, $const265$Determiner );
    methods.funcall_instance_method_with_2_args( lex, $sym261$SET, $kw11$SEMTRANS, ConsesLow.list( quantifier, $kw206$NOUN, reader.bq_cons( connective, $list266 ) ) );
    methods.funcall_instance_method_with_2_args( lex, $sym261$SET, $kw20$FRAME, $const267$DeterminerFrame );
    word = new_word_tree( $str263$, $kw268$DT, methods.funcall_instance_method_with_0_args( v_word_tree, $sym139$GET_MOTHER ), ZERO_INTEGER, cyclifier.new_even_lex_entry_distribution( ConsesLow.list( lex ) ),
        v_context );
    set_word_tree_abs_idx( word, methods.funcall_instance_method_with_0_args( v_word_tree, $sym90$GET_ABS_INDEX ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 18552L)
  public static SubLObject nominal_word_tree_get_possessor_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_nominal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject np = methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym271$NOMINAL_PHRASE_TREE_P, idx );
        Dynamic.sublisp_throw( $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, ( NIL != np && NIL != methods.funcall_instance_method_with_0_args( np, $sym272$POSSESSIVE_P ) ) ? np
            : methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym273$PRP__TREE_P, idx ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_nominal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_nominal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 18856L)
  public static SubLObject nominal_word_tree_get_specifier_method(final SubLObject self)
  {
    SubLObject specifier = methods.funcall_instance_method_with_0_args( self, $sym224$GET_DETERMINER );
    if( NIL == specifier )
    {
      specifier = methods.funcall_instance_method_with_0_args( self, $sym220$GET_QUANTIFIER );
    }
    if( NIL == specifier )
    {
      specifier = methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR );
    }
    return specifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19192L)
  public static SubLObject nominal_word_tree_get_antecedent_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19350L)
  public static SubLObject nominal_word_tree_get_gender_method(final SubLObject self)
  {
    SubLObject genders = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym94$GET_LEXES );
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      genders = ConsesLow.append( methods.funcall_instance_method_with_1_args( lex, $sym10$GET, $kw283$GENDER ), genders );
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    return Sequences.remove_duplicates( genders, EQL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19705L)
  public static SubLObject nominal_word_tree_get_person_method(final SubLObject self)
  {
    return THREE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 19837L)
  public static SubLObject nominal_word_tree_singular_p_method(final SubLObject self)
  {
    return list_utilities.sublisp_boolean( conses_high.member( $kw289$SINGULAR, methods.funcall_instance_method_with_0_args( self, $sym238$GET_NUMBER ), EQL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20026L)
  public static SubLObject nominal_word_tree_plural_p_method(final SubLObject self)
  {
    return list_utilities.sublisp_boolean( conses_high.member( $kw292$PLURAL, methods.funcall_instance_method_with_0_args( self, $sym238$GET_NUMBER ), EQL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20215L)
  public static SubLObject non_of_prepositional_tree_p(final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.prepositional_tree_p( tree ) && !methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( tree, $sym19$GET_HEAD ), $sym24$GET_STRING ).equalp(
        $str70$of ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 20377L)
  public static SubLObject nominal_word_tree_get_modifieds_method(final SubLObject self)
  {
    SubLObject modifieds = NIL;
    final SubLObject ancestors = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS );
    SubLObject successP = NIL;
    if( NIL == successP )
    {
      SubLObject csome_list_var = ancestors;
      SubLObject ancestor = NIL;
      ancestor = csome_list_var.first();
      while ( NIL == successP && NIL != csome_list_var)
      {
        if( NIL != appositive_np_p( ancestor ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER, TWO_INTEGER ), $sym19$GET_HEAD ).eql( self )
            && NIL != methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER, ZERO_INTEGER ) && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args(
                ancestor, $sym296$GET_DAUGHTER, ZERO_INTEGER ), $sym19$GET_HEAD ) )
        {
          modifieds = ConsesLow.cons( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER, ZERO_INTEGER ), $sym19$GET_HEAD ), modifieds );
          successP = T;
        }
        csome_list_var = csome_list_var.rest();
        ancestor = csome_list_var.first();
      }
    }
    successP = NIL;
    if( NIL == successP )
    {
      SubLObject csome_list_var = ancestors;
      SubLObject ancestor = NIL;
      ancestor = csome_list_var.first();
      while ( NIL == successP && NIL != csome_list_var)
      {
        if( NIL != parse_tree.verbal_tree_p( ancestor ) && NIL != methods.funcall_instance_method_with_0_args( ancestor, $sym297$COPULA_P ) && NIL != methods.funcall_instance_method_with_0_args( ancestor,
            $sym298$GET_OBJECTS ) && self.eql( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( ancestor, $sym298$GET_OBJECTS ).first(), $sym19$GET_HEAD ) ) && NIL != methods
                .funcall_instance_method_with_0_args( ancestor, $sym299$GET_SUBJECT ) )
        {
          modifieds = ConsesLow.cons( methods.funcall_instance_method_with_0_args( ancestor, $sym299$GET_SUBJECT ), modifieds );
          successP = T;
        }
        csome_list_var = csome_list_var.rest();
        ancestor = csome_list_var.first();
      }
    }
    if( NIL != parse_tree.nominal_tree_p( methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER ) ) )
    {
      modifieds = ConsesLow.cons( methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER ), modifieds );
    }
    if( NIL != word_tree_temporal_tree_p_method( self ) )
    {
      successP = NIL;
      if( NIL == successP )
      {
        SubLObject csome_list_var = ancestors;
        SubLObject ancestor = NIL;
        ancestor = csome_list_var.first();
        while ( NIL == successP && NIL != csome_list_var)
        {
          if( NIL != parse_tree.verbal_tree_p( ancestor ) )
          {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( ancestor, $sym115$GET_HEADS );
            SubLObject head = NIL;
            head = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              modifieds = ConsesLow.cons( head, modifieds );
              cdolist_list_var = cdolist_list_var.rest();
              head = cdolist_list_var.first();
            }
            successP = T;
          }
          csome_list_var = csome_list_var.rest();
          ancestor = csome_list_var.first();
        }
      }
    }
    return modifieds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 21855L)
  public static SubLObject appositive_np_p(final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.np_tree_p( tree ) && methods.funcall_instance_method_with_0_args( tree, $sym301$DAUGHTER_COUNT ).numG( TWO_INTEGER ) && methods.funcall_instance_method_with_0_args( tree,
        $sym301$DAUGHTER_COUNT ).numL( FIVE_INTEGER ) && NIL != parse_tree.np_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER, ZERO_INTEGER ) ) && methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER, ONE_INTEGER ), $sym35$GET_CATEGORY ) == $kw302$_ && NIL != parse_tree.np_tree_p( methods
                .funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER, TWO_INTEGER ) ) && ( methods.funcall_instance_method_with_0_args( tree, $sym301$DAUGHTER_COUNT ).numE( THREE_INTEGER ) || ( methods
                    .funcall_instance_method_with_0_args( tree, $sym301$DAUGHTER_COUNT ).numE( FOUR_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree,
                        $sym296$GET_DAUGHTER, THREE_INTEGER ), $sym35$GET_CATEGORY ) == $kw302$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
  public static SubLObject subloop_reserved_initialize_nn_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
  public static SubLObject subloop_reserved_initialize_nn_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22466L)
  public static SubLObject nn_tree_p(final SubLObject nn_tree)
  {
    return classes.subloop_instanceof_class( nn_tree, $sym303$NN_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22565L)
  public static SubLObject nn_tree_get_number_method(final SubLObject self)
  {
    return $list308;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
  public static SubLObject name_word_tree_get_quantifier_method(final SubLObject self)
  {
    final SubLObject quantifier = methods.funcall_instance_method_with_0_args( self, $sym205$GET_OVERT_QUANTIFIER );
    return ( NIL == quantifier && NIL != methods.funcall_instance_method_with_0_args( self, $sym234$PLURAL_P ) ) ? methods.funcall_instance_method_with_0_args( self, $sym233$GET_EXISTENTIAL_NULL_DETERMINER )
        : quantifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
  public static SubLObject subloop_reserved_initialize_name_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
  public static SubLObject subloop_reserved_initialize_name_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22697L)
  public static SubLObject name_word_tree_p(final SubLObject name_word_tree)
  {
    return classes.subloop_instanceof_class( name_word_tree, $sym310$NAME_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
  public static SubLObject subloop_reserved_initialize_dollar_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
  public static SubLObject subloop_reserved_initialize_dollar_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22853L)
  public static SubLObject dollar_word_tree_p(final SubLObject dollar_word_tree)
  {
    return classes.subloop_instanceof_class( dollar_word_tree, $sym317$DOLLAR_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 22974L)
  public static SubLObject dollar_word_tree_get_overt_quantifier_method(final SubLObject self)
  {
    final SubLObject quant = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER );
    if( NIL != cardinal_word_tree_p( quant ) )
    {
      return quant;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
  public static SubLObject subloop_reserved_initialize_nnp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
  public static SubLObject subloop_reserved_initialize_nnp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23239L)
  public static SubLObject nnp_tree_p(final SubLObject nnp_tree)
  {
    return classes.subloop_instanceof_class( nnp_tree, $sym323$NNP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23342L)
  public static SubLObject nnp_tree_get_number_method(final SubLObject self)
  {
    return $list308;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
  public static SubLObject subloop_reserved_initialize_nns_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
  public static SubLObject subloop_reserved_initialize_nns_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23475L)
  public static SubLObject nns_tree_p(final SubLObject nns_tree)
  {
    return classes.subloop_instanceof_class( nns_tree, $sym327$NNS_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23575L)
  public static SubLObject nns_tree_get_number_method(final SubLObject self)
  {
    return $list331;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
  public static SubLObject subloop_reserved_initialize_nnps_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
  public static SubLObject subloop_reserved_initialize_nnps_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23706L)
  public static SubLObject nnps_tree_p(final SubLObject nnps_tree)
  {
    return classes.subloop_instanceof_class( nnps_tree, $sym333$NNPS_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23804L)
  public static SubLObject nnps_tree_get_number_method(final SubLObject self)
  {
    return $list331;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
  public static SubLObject subloop_reserved_initialize_prp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
  public static SubLObject subloop_reserved_initialize_prp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 23936L)
  public static SubLObject prp_tree_p(final SubLObject prp_tree)
  {
    return classes.subloop_instanceof_class( prp_tree, $sym337$PRP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24336L)
  public static SubLObject prp_tree_get_number_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prp_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD );
      try
      {
        SubLObject numbers = NIL;
        if( NIL != subl_promotions.memberP( string, $singular_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED ) )
        {
          numbers = ConsesLow.cons( $kw289$SINGULAR, numbers );
        }
        if( NIL != subl_promotions.memberP( string, $plural_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED ) )
        {
          numbers = ConsesLow.cons( $kw292$PLURAL, numbers );
        }
        Dynamic.sublisp_throw( $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD, numbers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 24721L)
  public static SubLObject prp_tree_get_person_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prp_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD, string.equalp( $str349$I ) ? ONE_INTEGER
            : ( string.equalp( $str350$me ) ? ONE_INTEGER
                : ( string.equalp( $str351$you ) ? TWO_INTEGER : ( string.equalp( $str352$we ) ? ONE_INTEGER : ( string.equalp( $str353$us ) ? ONE_INTEGER : THREE_INTEGER ) ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25014L)
  public static SubLObject prp_tree_get_gender_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prp_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD, conses_high.assoc( string, $list357, EQUALP, UNPROVIDED ).rest() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
  public static SubLObject subloop_reserved_initialize_wp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
  public static SubLObject subloop_reserved_initialize_wp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25669L)
  public static SubLObject wp_tree_p(final SubLObject wp_tree)
  {
    return classes.subloop_instanceof_class( wp_tree, $sym359$WP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 25996L)
  public static SubLObject wp_tree_get_refs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wp_tree_method = NIL;
    final SubLObject refs = get_word_tree_refs( self );
    try
    {
      thread.throwStack.push( $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD );
      try
      {
        final SubLObject antecedent = methods.funcall_instance_method_with_0_args( self, $sym278$GET_ANTECEDENT );
        Dynamic.sublisp_throw( $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD, ( NIL != antecedent ) ? methods.funcall_instance_method_with_0_args( antecedent, $sym100$GET_REFS ) : refs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_refs( self, refs );
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
      catch_var_for_wp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26214L)
  public static SubLObject wp_tree_get_antecedent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wp_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD );
      try
      {
        final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
        final SubLObject great_grandmother = ( NIL != grandmother ) ? methods.funcall_instance_method_with_0_args( grandmother, $sym139$GET_MOTHER ) : NIL;
        if( NIL != parse_tree.np_tree_p( great_grandmother ) && NIL != parse_tree.np_tree_p( methods.funcall_instance_method_with_1_args( great_grandmother, $sym296$GET_DAUGHTER, ZERO_INTEGER ) ) )
        {
          Dynamic.sublisp_throw( $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_1_args( great_grandmother, $sym296$GET_DAUGHTER, ZERO_INTEGER ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_wp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26647L)
  public static SubLObject wp_tree_get_quantifier_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wp_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym253$QUANTIFIER_TREE_P, number_utilities.f_1_( idx ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_wp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 26844L)
  public static SubLObject wp_tree_get_number_method(final SubLObject self)
  {
    return $list308;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27021L)
  public static SubLObject wp_tree_get_gender_method(final SubLObject self)
  {
    return $list376;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27235L)
  public static SubLObject relative_clause_p(final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.sbar_tree_p( tree ) && methods.funcall_instance_method_with_0_args( tree, $sym301$DAUGHTER_COUNT ).numE( TWO_INTEGER ) && ( NIL != parse_tree.whnp_tree_p( methods
        .funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER, ZERO_INTEGER ) ) || methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER,
            ZERO_INTEGER ), $sym24$GET_STRING ).equalp( $str378$that ) ) && NIL != parse_tree.s_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym296$GET_DAUGHTER, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_particle_filter_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    SubLObject lexes = get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        SubLObject filtered = NIL;
        final SubLObject sentence_particle = methods.funcall_instance_method_with_0_args( self, $sym384$GET_PARTICLE );
        final SubLObject sentence_particle_head = ( NIL != sentence_particle ) ? methods.funcall_instance_method_with_0_args( sentence_particle, $sym19$GET_HEAD ) : NIL;
        SubLObject frame = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          frame = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym10$GET, $kw20$FRAME );
          if( NIL != cycl_utilities.formula_arg2( frame, UNPROVIDED ) && NIL != isa.isaP( frame, $const385$ParticleFrameType, $const22$EverythingPSC, UNPROVIDED ) )
          {
            if( NIL != sentence_particle_head )
            {
              final SubLObject required_particle_string = lexicon_accessors.get_strings_of_type( cycl_utilities.formula_arg2( frame, UNPROVIDED ), $const386$VerbParticle, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
              if( required_particle_string.equalp( methods.funcall_instance_method_with_0_args( sentence_particle_head, $sym24$GET_STRING ) ) )
              {
                cyclifier.rle_set_confidence( rle, ONE_INTEGER );
                filtered = ConsesLow.cons( rle, filtered );
              }
            }
          }
          else if( NIL == sentence_particle_head )
          {
            filtered = ConsesLow.cons( rle, filtered );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        lexes = filtered;
        Dynamic.sublisp_throw( $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_lexes( self, lexes );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_partition_semantic_complements_method(final SubLObject self)
  {
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym389$GET_SEMANTIC_SUBJECT );
    SubLObject non_distributing = methods.funcall_instance_method_with_0_args( self, $sym58$GET_SEMANTIC_COMPLEMENTS );
    if( NIL != subject )
    {
      non_distributing = cyclifier_interface.delete_cyclifiable( subject, non_distributing );
    }
    return Values.values( non_distributing, ( NIL != subject ) ? ConsesLow.list( subject ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list393;
    }
    SubLObject conjuncts = NIL;
    SubLObject disjuncts = NIL;
    SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym389$GET_SEMANTIC_SUBJECT );
    final SubLObject direct_object = methods.funcall_instance_method_with_0_args( self, $sym394$GET_SEMANTIC_DIRECT_OBJECT );
    final SubLObject indirect_object = methods.funcall_instance_method_with_0_args( self, $sym395$GET_SEMANTIC_INDIRECT_OBJECT );
    final SubLObject oblique_object = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
    final SubLObject cl_complement = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
    if( NIL != subl_promotions.memberP( methods.funcall_instance_method_with_0_args( self, $sym35$GET_CATEGORY ), $list397, EQL, UNPROVIDED ) && NIL == subject )
    {
      subject = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
    }
    if( NIL != subl_promotions.memberP( $kw398$ACTION, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw398$ACTION, self ), conjuncts );
    }
    if( NIL != subject && NIL != conses_high.member( $kw399$SUBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw399$SUBJECT, subject ), conjuncts );
    }
    if( NIL != direct_object && NIL != conses_high.member( $kw400$OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw400$OBJECT, direct_object ), conjuncts );
    }
    if( NIL != indirect_object && NIL != conses_high.member( $kw68$OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw68$OBLIQUE_OBJECT, indirect_object ), conjuncts );
    }
    if( NIL != oblique_object && NIL != conses_high.member( $kw68$OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw207$PREP_OBJECT, oblique_object ), conjuncts );
    }
    if( NIL != modified && NIL != conses_high.member( $kw206$NOUN, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw206$NOUN, modified ), conjuncts );
    }
    if( NIL != cl_complement && NIL != conses_high.member( $kw401$CLAUSE, keywords, EQL, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject cl_cycls = cdolist_list_var = methods.funcall_instance_method_with_0_args( cl_complement, $sym48$CYCLIFY_INT );
      SubLObject cl_cycl = NIL;
      cl_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cl_cycl = simplifier.lift_conjuncts( cl_cycl );
        disjuncts = ConsesLow.cons( ConsesLow.cons( $kw401$CLAUSE, cl_cycl ), disjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        cl_cycl = cdolist_list_var.first();
      }
    }
    if( NIL != cl_complement && NIL != conses_high.member( $kw402$INF_COMP, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw402$INF_COMP, cl_complement ), conjuncts );
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, disjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_get_controller_method(final SubLObject self)
  {
    final SubLObject control_verb = methods.funcall_instance_method_with_0_args( self, $sym406$GET_CONTROL_VERB );
    if( NIL == control_verb )
    {
      return NIL;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( control_verb, $sym407$SUBJECT_CONTROLLER_P ) )
    {
      return methods.funcall_instance_method_with_0_args( control_verb, $sym389$GET_SEMANTIC_SUBJECT );
    }
    if( NIL != methods.funcall_instance_method_with_0_args( control_verb, $sym408$OBJECT_CONTROLLER_P ) )
    {
      return methods.funcall_instance_method_with_0_args( control_verb, $sym409$GET_DIRECT_OBJECT );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_get_control_verb_method(final SubLObject self)
  {
    final SubLObject matrix = methods.funcall_instance_method_with_0_args( self, $sym412$GET_MATRIX_CLAUSE );
    final SubLObject matrix_head = ( NIL != matrix ) ? methods.funcall_instance_method_with_0_args( matrix, $sym19$GET_HEAD ) : NIL;
    if( NIL != matrix_head && NIL != methods.funcall_instance_method_with_0_args( matrix_head, $sym413$CONTROL_VERB_P ) )
    {
      return matrix_head;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_object_controller_p_method(final SubLObject self)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym94$GET_LEXES );
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = conses_high.member( methods.funcall_instance_method_with_1_args( lex, $sym10$GET, $kw20$FRAME ), $list416, UNPROVIDED, UNPROVIDED );
      if( NIL != result )
      {
        return list_utilities.sublisp_boolean( result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_subject_controller_p_method(final SubLObject self)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym94$GET_LEXES );
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = conses_high.member( methods.funcall_instance_method_with_1_args( lex, $sym10$GET, $kw20$FRAME ), $list419, UNPROVIDED, UNPROVIDED );
      if( NIL != result )
      {
        return list_utilities.sublisp_boolean( result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_control_verb_p_method(final SubLObject self)
  {
    return makeBoolean( NIL != methods.funcall_instance_method_with_0_args( self, $sym407$SUBJECT_CONTROLLER_P ) || NIL != methods.funcall_instance_method_with_0_args( self, $sym408$OBJECT_CONTROLLER_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_get_matrix_clause_method(final SubLObject self)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS );
    SubLObject ancestor = NIL;
    ancestor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != parse_tree.sentential_tree_p( ancestor ) && !methods.funcall_instance_method_with_0_args( ancestor, $sym19$GET_HEAD ).eql( self ) )
      {
        return ancestor;
      }
      cdolist_list_var = cdolist_list_var.rest();
      ancestor = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject subloop_reserved_initialize_verbal_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject subloop_reserved_initialize_verbal_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 27658L)
  public static SubLObject verbal_word_tree_p(final SubLObject verbal_word_tree)
  {
    return classes.subloop_instanceof_class( verbal_word_tree, $sym379$VERBAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 29841L)
  public static SubLObject verbal_word_tree_get_predicate_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym429$GET_SEMANTIC_HEAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30002L)
  public static SubLObject verbal_word_tree_get_number_method(final SubLObject self)
  {
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym432$FINITE_P ) )
    {
      final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT );
      return ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym238$GET_NUMBER ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30302L)
  public static SubLObject verbal_word_tree_get_person_method(final SubLObject self)
  {
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym432$FINITE_P ) )
    {
      final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT );
      return ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym285$GET_PERSON ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30556L)
  public static SubLObject verbal_word_tree_get_tense_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 30726L)
  public static SubLObject verbal_word_tree_get_subject_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject subject = methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym441$NOMINAL_TREE_P, number_utilities.f_1_( idx ) );
        if( NIL != subject )
        {
          Dynamic.sublisp_throw( $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, subject );
        }
        final SubLObject controller = methods.funcall_instance_method_with_0_args( self, $sym404$GET_CONTROLLER );
        if( NIL != controller )
        {
          Dynamic.sublisp_throw( $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, controller );
        }
        if( NIL != parse_tree.verbal_tree_p( mother ) )
        {
          Dynamic.sublisp_throw( $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( mother, $sym299$GET_SUBJECT ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 31103L)
  public static SubLObject verbal_word_tree_get_objects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args( self, $sym409$GET_DIRECT_OBJECT );
        final SubLObject indirect_object = methods.funcall_instance_method_with_0_args( self, $sym445$GET_INDIRECT_OBJECT );
        SubLObject objects = NIL;
        if( NIL != indirect_object )
        {
          objects = ConsesLow.cons( indirect_object, objects );
        }
        if( NIL != direct_object )
        {
          objects = ConsesLow.cons( direct_object, objects );
        }
        if( NIL != mother )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( mother, $sym135$FIND, $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P );
          SubLObject pp = NIL;
          pp = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != methods.funcall_instance_method_with_0_args( pp, $sym446$STRANDED_P ) )
            {
              objects = Sequences.delete( methods.funcall_instance_method_with_0_args( pp, $sym64$GET_OBLIQUE_OBJECT ), objects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pp = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, objects );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 31944L)
  public static SubLObject verbal_word_tree_get_moved_nps_method(final SubLObject self)
  {
    SubLObject moved = NIL;
    if( NIL == moved )
    {
      SubLObject csome_list_var = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS ).rest();
      SubLObject ancestor = NIL;
      ancestor = csome_list_var.first();
      while ( NIL == moved && NIL != csome_list_var)
      {
        if( NIL != parse_tree.verbal_tree_p( ancestor ) )
        {
          moved = methods.funcall_instance_method_with_1_args( ancestor, $sym135$FIND, $sym451$WHNP_TREE_P );
        }
        csome_list_var = csome_list_var.rest();
        ancestor = csome_list_var.first();
      }
    }
    return moved;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32258L)
  public static SubLObject verbal_word_tree_get_moved_objects_method(final SubLObject self)
  {
    return Sequences.delete( methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT ), methods.funcall_instance_method_with_0_args( self, $sym449$GET_MOVED_NPS ), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32479L)
  public static SubLObject verbal_word_tree_get_direct_object_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject moved = methods.funcall_instance_method_with_0_args( self, $sym453$GET_MOVED_OBJECTS );
        final SubLObject locals = methods.funcall_instance_method_with_2_args( mother, $sym135$FIND, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) );
        final SubLObject n = Sequences.length( locals );
        if( n.numE( TWO_INTEGER ) )
        {
          if( NIL != methods.funcall_instance_method_with_0_args( conses_high.second( locals ), $sym149$TEMPORAL_TREE_P ) )
          {
            Dynamic.sublisp_throw( $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first() );
          }
          else
          {
            Dynamic.sublisp_throw( $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, conses_high.second( locals ) );
          }
        }
        else if( n.numE( ONE_INTEGER ) && NIL == moved )
        {
          Dynamic.sublisp_throw( $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first() );
        }
        else if( !n.numL( TWO_INTEGER ) || NIL == moved || NIL != Dynamic.sublisp_throw( $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first() ) )
        {
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 32966L)
  public static SubLObject verbal_word_tree_get_indirect_object_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject oblique_object = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
        if( NIL != oblique_object )
        {
          Dynamic.sublisp_throw( $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, oblique_object );
        }
        final SubLObject moved = methods.funcall_instance_method_with_0_args( self, $sym453$GET_MOVED_OBJECTS );
        final SubLObject locals = methods.funcall_instance_method_with_2_args( mother, $sym135$FIND, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) );
        final SubLObject n = Sequences.length( locals );
        if( n.numE( TWO_INTEGER ) && NIL == methods.funcall_instance_method_with_0_args( conses_high.second( locals ), $sym149$TEMPORAL_TREE_P ) )
        {
          Dynamic.sublisp_throw( $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first() );
        }
        else if( !n.numE( ONE_INTEGER ) || NIL == moved || NIL != Dynamic.sublisp_throw( $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first() ) )
        {
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33533L)
  public static SubLObject verbal_word_tree_get_semantic_direct_object_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym409$GET_DIRECT_OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33718L)
  public static SubLObject verbal_word_tree_get_semantic_indirect_object_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym445$GET_INDIRECT_OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 33909L)
  public static SubLObject verbal_word_tree_get_verbal_complement_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym468$VERBAL_PHRASE_TREE_P, number_utilities.f_1X( idx ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34113L)
  public static SubLObject verbal_word_tree_get_adjectival_complement_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym473$ADJP_TREE_P, number_utilities.f_1X( idx ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34311L)
  public static SubLObject verbal_word_tree_get_complements_method(final SubLObject self)
  {
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym389$GET_SEMANTIC_SUBJECT );
    final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    final SubLObject complements = ConsesLow.append( ( NIL != subject ) ? ConsesLow.list( subject ) : NIL, methods.funcall_instance_method_with_0_args( self, $sym476$GET_SEMANTIC_OBJECTS ), ( NIL != verbal_complement )
        ? ConsesLow.list( verbal_complement )
        : NIL );
    return complements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34729L)
  public static SubLObject verbal_word_tree_get_particle_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject particle_phrase = methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym480$PRT_TREE_P, number_utilities.f_1X( idx ) );
        Dynamic.sublisp_throw( $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, ( NIL != particle_phrase ) ? particle_phrase : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 34998L)
  public static SubLObject verbal_word_tree_get_infinitive_marker_method(final SubLObject self)
  {
    final SubLObject vp = methods.funcall_instance_method_with_0_args( self, $sym139$GET_MOTHER );
    final SubLObject candidate = methods.funcall_instance_method_with_1_args( vp, $sym180$GET_SISTER, MINUS_ONE_INTEGER );
    if( NIL != candidate && methods.funcall_instance_method_with_0_args( candidate, $sym35$GET_CATEGORY ) == $kw484$TO )
    {
      return candidate;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35295L)
  public static SubLObject verbal_word_tree_dummy_to_p_method(final SubLObject self)
  {
    return Equality.eql( methods.funcall_instance_method_with_0_args( self, $sym24$GET_STRING ), $str488$to );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35468L)
  public static SubLObject verbal_word_tree_get_semantic_subject_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 35642L)
  public static SubLObject verbal_word_tree_get_semantic_objects_method(final SubLObject self)
  {
    final SubLObject direct_object = methods.funcall_instance_method_with_0_args( self, $sym394$GET_SEMANTIC_DIRECT_OBJECT );
    final SubLObject indirect_object = methods.funcall_instance_method_with_0_args( self, $sym395$GET_SEMANTIC_INDIRECT_OBJECT );
    SubLObject semantic_objects = NIL;
    if( NIL != indirect_object )
    {
      semantic_objects = ConsesLow.cons( indirect_object, semantic_objects );
    }
    if( NIL != direct_object )
    {
      semantic_objects = ConsesLow.cons( direct_object, semantic_objects );
    }
    return semantic_objects;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36099L)
  public static SubLObject verbal_word_tree_get_ancestor_objects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( mother, $sym494$GET_ANCESTOR_OBJECTS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36297L)
  public static SubLObject verbal_word_tree_inverted_p_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36440L)
  public static SubLObject verbal_word_tree_finite_p_method(final SubLObject self)
  {
    return parse_tree.finite_verbal_word_tree_p( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36608L)
  public static SubLObject verbal_word_tree_passive_p_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36776L)
  public static SubLObject verbal_word_tree_infinitive_p_method(final SubLObject self)
  {
    return list_utilities.sublisp_boolean( methods.funcall_instance_method_with_0_args( self, $sym482$GET_INFINITIVE_MARKER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 36975L)
  public static SubLObject verbal_word_tree_base_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
        Dynamic.sublisp_throw( $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, makeBoolean( NIL != methods.funcall_instance_method_with_0_args( self, $sym506$INFINITIVE_P ) || ( NIL != grandmother && ( NIL != methods
            .funcall_instance_method_with_1_args( grandmother, $sym249$FIND_FIRST, $sym512$MODAL_VERB_TREE_P ) || methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( grandmother,
                $sym296$GET_DAUGHTER, ZERO_INTEGER ), $sym24$GET_STRING ).equalp( $str513$did ) ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
  public static SubLObject subloop_reserved_initialize_vbz_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
  public static SubLObject subloop_reserved_initialize_vbz_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37361L)
  public static SubLObject vbz_tree_p(final SubLObject vbz_tree)
  {
    return classes.subloop_instanceof_class( vbz_tree, $sym515$VBZ_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37520L)
  public static SubLObject vbz_tree_get_tense_method(final SubLObject self)
  {
    return $kw521$PRESENT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
  public static SubLObject subloop_reserved_initialize_vbn_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
  public static SubLObject subloop_reserved_initialize_vbn_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 37689L)
  public static SubLObject vbn_tree_p(final SubLObject vbn_tree)
  {
    return classes.subloop_instanceof_class( vbn_tree, $sym523$VBN_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38024L)
  public static SubLObject vbn_tree_get_aux_verb_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_vbn_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD );
      try
      {
        final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
        Dynamic.sublisp_throw( $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD, ( NIL != grandmother ) ? methods.funcall_instance_method_with_1_args( grandmother, $sym249$FIND_FIRST, $sym530$AUX_VERB_TREE_P ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_vbn_tree_method = Errors.handleThrowable( ccatch_env_var, $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_vbn_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38278L)
  public static SubLObject vbn_tree_get_semantic_subject_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_vbn_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym503$PASSIVE_P ) )
        {
          final SubLObject pps = ( NIL != mother ) ? methods.funcall_instance_method_with_1_args( mother, $sym135$FIND, $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P ) : NIL;
          SubLObject pphead = NIL;
          SubLObject preposition = NIL;
          SubLObject cdolist_list_var = pps;
          SubLObject pp = NIL;
          pp = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            pphead = methods.funcall_instance_method_with_0_args( pp, $sym19$GET_HEAD );
            preposition = ( NIL != pphead ) ? methods.funcall_instance_method_with_0_args( pphead, $sym24$GET_STRING ) : NIL;
            if( preposition.equal( $str534$by ) )
            {
              Dynamic.sublisp_throw( $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args( pp, $sym64$GET_OBLIQUE_OBJECT ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pp = cdolist_list_var.first();
          }
        }
        else
        {
          Dynamic.sublisp_throw( $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_vbn_tree_method = Errors.handleThrowable( ccatch_env_var, $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_vbn_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 38797L)
  public static SubLObject vbn_tree_get_semantic_direct_object_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_vbn_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym503$PASSIVE_P ) )
        {
          final SubLObject locals = methods.funcall_instance_method_with_2_args( mother, $sym135$FIND, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) );
          final SubLObject n = Sequences.length( locals );
          if( n.numE( ONE_INTEGER ) )
          {
            Dynamic.sublisp_throw( $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, locals.first() );
          }
          else if( n.numE( ZERO_INTEGER ) )
          {
            Dynamic.sublisp_throw( $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT ) );
          }
        }
        else
        {
          Dynamic.sublisp_throw( $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args( self, $sym409$GET_DIRECT_OBJECT ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_vbn_tree_method = Errors.handleThrowable( ccatch_env_var, $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_vbn_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39193L)
  public static SubLObject vbn_tree_get_semantic_indirect_object_method(final SubLObject self)
  {
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym503$PASSIVE_P ) )
    {
      final SubLObject oblique_object = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
      return ( NIL != oblique_object ) ? oblique_object : methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT );
    }
    return methods.funcall_instance_method_with_0_args( self, $sym445$GET_INDIRECT_OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39635L)
  public static SubLObject vbn_tree_passive_p_method(final SubLObject self)
  {
    final SubLObject aux = methods.funcall_instance_method_with_0_args( self, $sym527$GET_AUX_VERB );
    return makeBoolean( NIL != aux && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( aux, $sym24$GET_STRING ), $to_be_forms$.getGlobalValue(), EQUALP, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
  public static SubLObject subloop_reserved_initialize_vbd_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
  public static SubLObject subloop_reserved_initialize_vbd_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 39899L)
  public static SubLObject vbd_tree_p(final SubLObject vbd_tree)
  {
    return classes.subloop_instanceof_class( vbd_tree, $sym544$VBD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40035L)
  public static SubLObject vbd_tree_get_tense_method(final SubLObject self)
  {
    return $kw548$PAST;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
  public static SubLObject subloop_reserved_initialize_vbp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
  public static SubLObject subloop_reserved_initialize_vbp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40201L)
  public static SubLObject vbp_tree_p(final SubLObject vbp_tree)
  {
    return classes.subloop_instanceof_class( vbp_tree, $sym550$VBP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40337L)
  public static SubLObject vbp_tree_get_tense_method(final SubLObject self)
  {
    return $kw521$PRESENT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
  public static SubLObject subloop_reserved_initialize_vb_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
  public static SubLObject subloop_reserved_initialize_vb_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40506L)
  public static SubLObject vb_tree_p(final SubLObject vb_tree)
  {
    return classes.subloop_instanceof_class( vb_tree, $sym554$VB_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40603L)
  public static SubLObject vb_tree_get_tense_method(final SubLObject self)
  {
    return $kw558$INFINITIVE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
  public static SubLObject subloop_reserved_initialize_vbg_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
  public static SubLObject subloop_reserved_initialize_vbg_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40774L)
  public static SubLObject vbg_tree_p(final SubLObject vbg_tree)
  {
    return classes.subloop_instanceof_class( vbg_tree, $sym560$VBG_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 40927L)
  public static SubLObject vbg_tree_get_aux_verb_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_vbg_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD );
      try
      {
        final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
        Dynamic.sublisp_throw( $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD, ( NIL != grandmother ) ? methods.funcall_instance_method_with_1_args( grandmother, $sym249$FIND_FIRST, $sym530$AUX_VERB_TREE_P ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_vbg_tree_method = Errors.handleThrowable( ccatch_env_var, $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_vbg_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41181L)
  public static SubLObject vbg_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_vbg_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_0_args( self, $sym527$GET_AUX_VERB ) )
        {
          final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
          final SubLObject grandmas_head = ( NIL != grandmother && NIL != parse_tree.nominal_phrase_tree_p( grandmother ) ) ? methods.funcall_instance_method_with_0_args( grandmother, $sym19$GET_HEAD ) : NIL;
          Dynamic.sublisp_throw( $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD, ( NIL != grandmas_head ) ? ConsesLow.list( grandmas_head ) : NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_vbg_tree_method = Errors.handleThrowable( ccatch_env_var, $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_vbg_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_copula_p_method(final SubLObject self)
  {
    return makeBoolean( NIL == methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list576;
    }
    SubLObject conjuncts = NIL;
    SubLObject disjuncts = NIL;
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym389$GET_SEMANTIC_SUBJECT );
    final SubLObject direct_object = methods.funcall_instance_method_with_0_args( self, $sym394$GET_SEMANTIC_DIRECT_OBJECT );
    final SubLObject complement = methods.funcall_instance_method_with_0_args( self, $sym58$GET_SEMANTIC_COMPLEMENTS ).first();
    if( NIL != subject && NIL != conses_high.member( $kw399$SUBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw399$SUBJECT, subject ), conjuncts );
    }
    if( NIL != direct_object && NIL != conses_high.member( $kw400$OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw400$OBJECT, direct_object ), conjuncts );
    }
    if( NIL != complement && ( NIL == subject || !complement.eql( subject ) ) && !complement.eql( direct_object ) && NIL != conses_high.member( $kw577$COMPLEMENT, keywords, EQL, UNPROVIDED ) )
    {
      SubLObject comp_cycls = methods.funcall_instance_method_with_0_args( complement, $sym48$CYCLIFY_INT );
      if( NIL == comp_cycls )
      {
        comp_cycls = ConsesLow.cons( NIL, comp_cycls );
      }
      SubLObject cdolist_list_var = comp_cycls;
      SubLObject comp_cycl = NIL;
      comp_cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        comp_cycl = simplifier.lift_conjuncts( comp_cycl );
        disjuncts = ConsesLow.cons( ConsesLow.cons( $kw577$COMPLEMENT, comp_cycl ), disjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        comp_cycl = cdolist_list_var.first();
      }
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, disjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_get_semantic_complements_method(final SubLObject self)
  {
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym297$COPULA_P ) )
    {
      return methods.funcall_instance_method_with_0_args( self, $sym62$GET_COMPLEMENTS );
    }
    final SubLObject complement = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    return ( NIL != complement ) ? ConsesLow.list( complement ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_get_complements_method(final SubLObject self)
  {
    SubLObject complements = NIL;
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym389$GET_SEMANTIC_SUBJECT );
    final SubLObject v_object = methods.funcall_instance_method_with_0_args( self, $sym394$GET_SEMANTIC_DIRECT_OBJECT );
    final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    final SubLObject prep_complement = methods.funcall_instance_method_with_0_args( self, $sym582$GET_PREPOSITIONAL_COMPLEMENT );
    final SubLObject adj_complement = methods.funcall_instance_method_with_0_args( self, $sym470$GET_ADJECTIVAL_COMPLEMENT );
    final SubLObject adv_complement = methods.funcall_instance_method_with_0_args( self, $sym583$GET_ADVERBIAL_COMPLEMENT );
    SubLObject cdolist_list_var = ConsesLow.list( adv_complement, adj_complement, prep_complement, verbal_complement, v_object, subject );
    SubLObject complement = NIL;
    complement = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != complement )
      {
        complements = ConsesLow.cons( complement, complements );
      }
      cdolist_list_var = cdolist_list_var.rest();
      complement = cdolist_list_var.first();
    }
    return complements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_get_semantic_heads_method(final SubLObject self)
  {
    final SubLObject main_verb = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    return ( NIL != main_verb ) ? methods.funcall_instance_method_with_0_args( main_verb, $sym120$GET_SEMANTIC_HEADS ) : ConsesLow.list( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_get_tense_method(final SubLObject self)
  {
    return ( NIL != conses_high.member( word_tree_get_string_method( self ), $list588, EQUALP, UNPROVIDED ) ) ? $kw521$PRESENT
        : ( ( NIL != conses_high.member( word_tree_get_string_method( self ), $list589, EQUALP, UNPROVIDED ) ) ? $kw548$PAST
            : ( ( NIL != conses_high.member( word_tree_get_string_method( self ), $list590, EQUALP, UNPROVIDED ) ) ? $kw558$INFINITIVE : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject subloop_reserved_initialize_aux_verb_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject subloop_reserved_initialize_aux_verb_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 41569L)
  public static SubLObject aux_verb_tree_p(final SubLObject aux_verb_tree)
  {
    return classes.subloop_instanceof_class( aux_verb_tree, $sym569$AUX_VERB_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 42559L)
  public static SubLObject aux_verb_tree_get_prepositional_complement_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_aux_verb_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
      try
      {
        final SubLObject pp = methods.funcall_instance_method_with_1_args( mother, $sym249$FIND_FIRST, $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P );
        Dynamic.sublisp_throw( $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, ( NIL != pp ) ? pp : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_aux_verb_tree_method = Errors.handleThrowable( ccatch_env_var, $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_aux_verb_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 42839L)
  public static SubLObject aux_verb_tree_get_adverbial_complement_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43006L)
  public static SubLObject aux_verb_tree_get_subject_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_aux_verb_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
      try
      {
        SubLObject subject = NIL;
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym498$INVERTED_P ) )
        {
          subject = methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) );
        }
        else
        {
          subject = methods.funcall_instance_method_with_2_args( mother, $sym246$FIND_LAST, $sym441$NOMINAL_TREE_P, number_utilities.f_1_( idx ) );
        }
        Dynamic.sublisp_throw( $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, ( NIL != subject ) ? subject : methods.funcall_instance_method_with_0_args( mother, $sym299$GET_SUBJECT ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_aux_verb_tree_method = Errors.handleThrowable( ccatch_env_var, $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_aux_verb_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43365L)
  public static SubLObject aux_verb_tree_get_direct_object_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_aux_verb_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, ( NIL != methods.funcall_instance_method_with_0_args( self, $sym498$INVERTED_P ) ) ? conses_high.second( methods
            .funcall_instance_method_with_2_args( mother, $sym135$FIND, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) ) )
            : methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym441$NOMINAL_TREE_P, number_utilities.f_1X( idx ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_aux_verb_tree_method = Errors.handleThrowable( ccatch_env_var, $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_aux_verb_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 43693L)
  public static SubLObject aux_verb_tree_get_indirect_object_method(final SubLObject self)
  {
    final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    final SubLObject main_verb = ( NIL != verbal_complement ) ? methods.funcall_instance_method_with_0_args( verbal_complement, $sym19$GET_HEAD ) : NIL;
    return ( NIL != main_verb ) ? methods.funcall_instance_method_with_0_args( main_verb, $sym445$GET_INDIRECT_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44073L)
  public static SubLObject aux_verb_tree_get_semantic_subject_method(final SubLObject self)
  {
    final SubLObject sister = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER );
    if( NIL != sister && NIL != parse_tree.nominal_tree_p( sister ) )
    {
      return methods.funcall_instance_method_with_0_args( self, $sym299$GET_SUBJECT );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44340L)
  public static SubLObject aux_verb_tree_inverted_p_method(final SubLObject self)
  {
    final SubLObject matrix = methods.funcall_instance_method_with_0_args( self, $sym412$GET_MATRIX_CLAUSE );
    return makeBoolean( NIL != matrix && ( ( NIL != parse_tree.question_tree_p( matrix ) && NIL == parse_tree.verbal_phrase_tree_p( methods.funcall_instance_method_with_1_args( matrix, $sym296$GET_DAUGHTER,
        ZERO_INTEGER ) ) ) || NIL != parse_tree.sinv_tree_p( matrix ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44683L)
  public static SubLObject aux_verb_tree_passive_p_method(final SubLObject self)
  {
    final SubLObject main = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
    return ( NIL != main ) ? methods.funcall_instance_method_with_0_args( main, $sym503$PASSIVE_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
  public static SubLObject subloop_reserved_initialize_modal_verb_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
  public static SubLObject subloop_reserved_initialize_modal_verb_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 44933L)
  public static SubLObject modal_verb_tree_p(final SubLObject modal_verb_tree)
  {
    return classes.subloop_instanceof_class( modal_verb_tree, $sym613$MODAL_VERB_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45133L)
  public static SubLObject modal_verb_tree_get_tense_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_modal_verb_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD, string.equalp( $str619$will ) ? $kw620$FUTURE : $kw521$PRESENT );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_modal_verb_tree_method = Errors.handleThrowable( ccatch_env_var, $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_modal_verb_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45433L)
  public static SubLObject modal_verb_tree_get_objects_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
  public static SubLObject adjectival_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list629;
    }
    SubLObject conjuncts = NIL;
    final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
    final SubLObject obl_obj = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
    final SubLObject obl_obj_head = ( NIL != obl_obj ) ? methods.funcall_instance_method_with_0_args( obl_obj, $sym19$GET_HEAD ) : NIL;
    if( NIL != modified )
    {
      if( NIL != subl_promotions.memberP( $kw206$NOUN, keywords, EQL, UNPROVIDED ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw206$NOUN, modified ), conjuncts );
      }
      if( NIL != subl_promotions.memberP( $kw398$ACTION, keywords, EQL, UNPROVIDED ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw398$ACTION, modified ), conjuncts );
      }
      if( NIL != subl_promotions.memberP( $kw12$REPLACE, keywords, EQL, UNPROVIDED ) )
      {
        conjuncts = ConsesLow.cons( ConsesLow.list( ConsesLow.cons( $kw12$REPLACE, NIL ) ), conjuncts );
      }
    }
    if( NIL != obl_obj_head && NIL != subl_promotions.memberP( $kw68$OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw207$PREP_OBJECT, obl_obj_head ), conjuncts );
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
  public static SubLObject adjectival_word_tree_get_complements_method(final SubLObject self)
  {
    final SubLObject modifieds = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS );
    final SubLObject obl_obj = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
    return ConsesLow.append( modifieds, ( NIL != obl_obj ) ? ConsesLow.list( obl_obj ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
  public static SubLObject subloop_reserved_initialize_adjectival_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
  public static SubLObject subloop_reserved_initialize_adjectival_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45564L)
  public static SubLObject adjectival_word_tree_p(final SubLObject adjectival_word_tree)
  {
    return classes.subloop_instanceof_class( adjectival_word_tree, $sym624$ADJECTIVAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 45987L)
  public static SubLObject adjectival_word_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_adjectival_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject head = methods.funcall_instance_method_with_0_args( mother, $sym637$GET_HEAD_DAUGHTER );
        SubLObject complement = ( NIL != parse_tree.nominal_tree_p( head ) ) ? head : NIL;
        if( NIL == complement && NIL != parse_tree.nominal_tree_p( methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, ONE_INTEGER ) ) )
        {
          complement = methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, ONE_INTEGER );
        }
        if( NIL == complement && NIL != mother && NIL != aux_verb_tree_p( methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, MINUS_ONE_INTEGER ) ) )
        {
          final SubLObject subject = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, MINUS_ONE_INTEGER ), $sym299$GET_SUBJECT );
          final SubLObject head_$12 = ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym19$GET_HEAD ) : NIL;
          if( NIL != head_$12 )
          {
            complement = head_$12;
          }
        }
        if( NIL == complement )
        {
          final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
          final SubLObject modified = ( NIL != grandmother ) ? methods.funcall_instance_method_with_1_args( grandmother, $sym249$FIND_FIRST, $sym441$NOMINAL_TREE_P ) : NIL;
          final SubLObject mod_head = ( NIL != modified ) ? methods.funcall_instance_method_with_0_args( modified, $sym19$GET_HEAD ) : NIL;
          if( NIL != mod_head )
          {
            complement = mod_head;
          }
        }
        Dynamic.sublisp_throw( $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, ( NIL != complement ) ? ConsesLow.list( complement ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_adjectival_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_adjectival_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47019L)
  public static SubLObject adjectival_word_tree_get_verbal_complement_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_adjectival_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args( mother, $sym249$FIND_FIRST, $sym641$SBAR_TREE_P ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_adjectival_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_adjectival_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
  public static SubLObject adverbial_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list648;
    }
    SubLObject conjuncts = NIL;
    final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
    final SubLObject subject = ( NIL != cyclifier_interface.verbal_word_p( modified ) ) ? methods.funcall_instance_method_with_0_args( modified, $sym299$GET_SUBJECT ) : NIL;
    final SubLObject v_object = ( NIL != cyclifier_interface.verbal_word_p( modified ) ) ? methods.funcall_instance_method_with_0_args( modified, $sym298$GET_OBJECTS ).first() : NIL;
    if( NIL != modified && NIL != conses_high.member( $kw398$ACTION, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw398$ACTION, modified ), conjuncts );
    }
    if( NIL != subject && NIL != conses_high.member( $kw399$SUBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw399$SUBJECT, subject ), conjuncts );
    }
    if( NIL != v_object && NIL != conses_high.member( $kw400$OBJECT, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw400$OBJECT, v_object ), conjuncts );
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
  public static SubLObject subloop_reserved_initialize_adverbial_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
  public static SubLObject subloop_reserved_initialize_adverbial_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47211L)
  public static SubLObject adverbial_word_tree_p(final SubLObject adverbial_word_tree)
  {
    return classes.subloop_instanceof_class( adverbial_word_tree, $sym643$ADVERBIAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47485L)
  public static SubLObject adverbial_word_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLObject sister = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER );
    if( NIL != adjectival_word_tree_p( sister ) || NIL != adverbial_word_tree_p( sister ) || NIL != prepositional_or_particle_word_tree_p( sister ) || NIL != parse_tree.numerical_tree_p( sister ) )
    {
      return ConsesLow.list( sister );
    }
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS );
    SubLObject ancestor = NIL;
    ancestor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != parse_tree.verbal_phrase_tree_p( ancestor ) )
      {
        return methods.funcall_instance_method_with_0_args( ancestor, $sym120$GET_SEMANTIC_HEADS );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ancestor = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
  public static SubLObject subloop_reserved_initialize_wrb_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
  public static SubLObject subloop_reserved_initialize_wrb_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 47987L)
  public static SubLObject wrb_word_tree_p(final SubLObject wrb_word_tree)
  {
    return classes.subloop_instanceof_class( wrb_word_tree, $sym654$WRB_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
  public static SubLObject prepositional_or_particle_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list663;
    }
    if( !methods.funcall_instance_method_with_0_args( self, $sym24$GET_STRING ).equalp( $str378$that ) )
    {
      SubLObject conjuncts = NIL;
      final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS ).first();
      final SubLObject complement = methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT );
      final SubLObject clause = methods.funcall_instance_method_with_0_args( self, $sym396$GET_VERBAL_COMPLEMENT );
      if( NIL != modified && NIL != conses_high.member( $kw206$NOUN, keywords, EQL, UNPROVIDED ) && NIL != cyclifier_interface.nominal_word_p( modified ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw206$NOUN, modified ), conjuncts );
      }
      if( NIL != modified && NIL != conses_high.member( $kw398$ACTION, keywords, EQL, UNPROVIDED ) && NIL != cyclifier_interface.verbal_word_p( modified ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw398$ACTION, modified ), conjuncts );
      }
      if( NIL != complement && NIL != conses_high.member( $kw400$OBJECT, keywords, EQL, UNPROVIDED ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw400$OBJECT, complement ), conjuncts );
      }
      if( NIL != clause && NIL != conses_high.member( $kw401$CLAUSE, keywords, EQL, UNPROVIDED ) )
      {
        conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw401$CLAUSE, clause ), conjuncts );
      }
      return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
  public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
  public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48070L)
  public static SubLObject prepositional_or_particle_word_tree_p(final SubLObject prepositional_or_particle_word_tree)
  {
    return classes.subloop_instanceof_class( prepositional_or_particle_word_tree, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 48682L)
  public static SubLObject prepositional_or_particle_word_tree_get_oblique_object_method(final SubLObject self)
  {
    final SubLObject sister = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER );
    if( NIL != sister && ( NIL != parse_tree.nominal_tree_p( sister ) || NIL != parse_tree.sentential_tree_p( sister ) ) )
    {
      return sister;
    }
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS );
    SubLObject ancestor = NIL;
    ancestor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( ( NIL != parse_tree.sbar_tree_p( ancestor ) || NIL != parse_tree.sbarq_tree_p( ancestor ) ) && NIL != parse_tree.whnp_tree_p( methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER,
          ZERO_INTEGER ) ) )
      {
        return methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER, ZERO_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ancestor = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 49310L)
  public static SubLObject prepositional_or_particle_word_tree_get_verbal_complement_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
    final SubLObject idx = parse_tree.get_parse_tree_idx( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args( mother, $sym249$FIND_FIRST, $sym671$VERBAL_TREE_P, number_utilities.f_1X(
            idx ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_idx( self, idx );
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prepositional_or_particle_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 49542L)
  public static SubLObject prepositional_or_particle_word_tree_get_complements_method(final SubLObject self)
  {
    final SubLObject modifieds = methods.funcall_instance_method_with_0_args( self, $sym146$GET_MODIFIEDS );
    final SubLObject sister = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, ONE_INTEGER );
    if( NIL != sister && ( NIL != parse_tree.nominal_tree_p( sister ) || NIL != parse_tree.sentential_tree_p( sister ) ) )
    {
      return ConsesLow.append( modifieds, ConsesLow.list( sister ) );
    }
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym295$GET_ANCESTORS );
    SubLObject ancestor = NIL;
    ancestor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( ( NIL != parse_tree.sbar_tree_p( ancestor ) || NIL != parse_tree.sbarq_tree_p( ancestor ) ) && NIL != parse_tree.whnp_tree_p( methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER,
          ZERO_INTEGER ) ) )
      {
        return ConsesLow.append( modifieds, ConsesLow.list( methods.funcall_instance_method_with_1_args( ancestor, $sym296$GET_DAUGHTER, ZERO_INTEGER ) ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ancestor = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 50243L)
  public static SubLObject prepositional_or_particle_word_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
      try
      {
        SubLObject complements = NIL;
        SubLObject candidates = NIL;
        final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
        final SubLObject grandmother_head = ( NIL != grandmother ) ? methods.funcall_instance_method_with_0_args( grandmother, $sym19$GET_HEAD ) : NIL;
        final SubLObject sister = methods.funcall_instance_method_with_1_args( mother, $sym180$GET_SISTER, ONE_INTEGER );
        if( NIL != parse_tree.whpp_tree_p( mother ) && NIL != parse_tree.question_tree_p( grandmother ) && NIL != sister && NIL != parse_tree.sq_tree_p( sister ) )
        {
          final SubLObject last_phrase = methods.funcall_instance_method_with_1_args( sister, $sym246$FIND_LAST, $sym677$PHRASE_TREE_P );
          if( NIL != last_phrase )
          {
            candidates = methods.funcall_instance_method_with_0_args( last_phrase, $sym115$GET_HEADS );
          }
        }
        else if( NIL != grandmother_head )
        {
          candidates = ( NIL != aux_verb_tree_p( grandmother_head ) && NIL != methods.funcall_instance_method_with_0_args( grandmother_head, $sym299$GET_SUBJECT ) && NIL != methods.funcall_instance_method_with_0_args(
              methods.funcall_instance_method_with_0_args( grandmother_head, $sym299$GET_SUBJECT ), $sym19$GET_HEAD ) ) ? ConsesLow.list( methods.funcall_instance_method_with_0_args( methods
                  .funcall_instance_method_with_0_args( grandmother_head, $sym299$GET_SUBJECT ), $sym19$GET_HEAD ) )
                  : ( ( NIL != adjectival_word_tree_p( grandmother_head ) ) ? NIL : ( grandmother_head.eql( self ) ? NIL : ConsesLow.list( grandmother_head ) ) );
        }
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args( candidate, $sym62$GET_COMPLEMENTS );
          SubLObject complement = NIL;
          complement = cdolist_list_var_$13.first();
          while ( NIL != cdolist_list_var_$13)
          {
            if( complement.eql( methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT ) ) )
            {
              complements = ConsesLow.cons( candidate, complements );
            }
            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
            complement = cdolist_list_var_$13.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          candidate = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, conses_high.set_difference( candidates, complements, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prepositional_or_particle_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52268L)
  public static SubLObject prepositional_or_particle_word_tree_get_refs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
      try
      {
        SubLObject comp_refs = NIL;
        if( string.equalp( $str70$of ) )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( self, $sym64$GET_OBLIQUE_OBJECT ), $sym100$GET_REFS );
          SubLObject ref = NIL;
          ref = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            comp_refs = ConsesLow.cons( ref, comp_refs );
            cdolist_list_var = cdolist_list_var.rest();
            ref = cdolist_list_var.first();
          }
          set_word_tree_refs( self, comp_refs );
        }
        Dynamic.sublisp_throw( $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, get_word_tree_refs( self ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prepositional_or_particle_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52630L)
  public static SubLObject prepositional_or_particle_word_tree_get_antecedent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
      try
      {
        if( string.equalp( $str378$that ) )
        {
          final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
          if( NIL != parse_tree.np_tree_p( grandmother ) )
          {
            Dynamic.sublisp_throw( $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( grandmother, $sym19$GET_HEAD ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prepositional_or_particle_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
  public static SubLObject subloop_reserved_initialize_prepositional_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
  public static SubLObject subloop_reserved_initialize_prepositional_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 52970L)
  public static SubLObject prepositional_word_tree_p(final SubLObject prepositional_word_tree)
  {
    return classes.subloop_instanceof_class( prepositional_word_tree, $sym685$PREPOSITIONAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
  public static SubLObject subloop_reserved_initialize_particle_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
  public static SubLObject subloop_reserved_initialize_particle_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53120L)
  public static SubLObject particle_word_tree_p(final SubLObject particle_word_tree)
  {
    return classes.subloop_instanceof_class( particle_word_tree, $sym689$PARTICLE_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
  public static SubLObject subloop_reserved_initialize_specifier_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
  public static SubLObject subloop_reserved_initialize_specifier_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53252L)
  public static SubLObject specifier_word_tree_p(final SubLObject specifier_word_tree)
  {
    return classes.subloop_instanceof_class( specifier_word_tree, $sym693$SPECIFIER_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53375L)
  public static SubLObject specifier_word_tree_get_specified_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_specifier_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( mother, $sym19$GET_HEAD ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_specifier_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_specifier_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
  public static SubLObject quantifier_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list706;
    }
    SubLObject conjuncts = NIL;
    final SubLObject disjuncts = NIL;
    if( NIL != subl_promotions.memberP( $kw206$NOUN, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw206$NOUN, self ), conjuncts );
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, disjuncts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
  public static SubLObject subloop_reserved_initialize_quantifier_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
  public static SubLObject subloop_reserved_initialize_quantifier_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53541L)
  public static SubLObject quantifier_word_tree_p(final SubLObject quantifier_word_tree)
  {
    return classes.subloop_instanceof_class( quantifier_word_tree, $sym701$QUANTIFIER_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 53865L)
  public static SubLObject quantifier_word_tree_get_quantified_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_quantifier_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD );
      try
      {
        if( NIL != parse_tree.nominal_phrase_tree_p( mother ) )
        {
          Dynamic.sublisp_throw( $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( mother, $sym19$GET_HEAD ) );
        }
        else if( NIL != parse_tree.whadjp_tree_p( mother ) )
        {
          final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER );
          if( NIL != grandmother )
          {
            Dynamic.sublisp_throw( $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args( grandmother, $sym19$GET_HEAD ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_quantifier_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_quantifier_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54248L)
  public static SubLObject quantifier_word_tree_get_specified_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym710$GET_QUANTIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
  public static SubLObject subloop_reserved_initialize_determiner_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
  public static SubLObject subloop_reserved_initialize_determiner_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54423L)
  public static SubLObject determiner_word_tree_p(final SubLObject determiner_word_tree)
  {
    return classes.subloop_instanceof_class( determiner_word_tree, $sym716$DETERMINER_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
  public static SubLObject subloop_reserved_initialize_prpX_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
  public static SubLObject subloop_reserved_initialize_prpX_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54509L)
  public static SubLObject prpX_tree_p(final SubLObject prpX_tree)
  {
    return classes.subloop_instanceof_class( prpX_tree, $sym719$PRP__TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 54897L)
  public static SubLObject prpX_tree_get_number_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prpX_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD );
      try
      {
        SubLObject numbers = NIL;
        if( NIL != subl_promotions.memberP( string, $singular_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED ) )
        {
          numbers = ConsesLow.cons( $kw289$SINGULAR, numbers );
        }
        if( NIL != subl_promotions.memberP( string, $plural_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED ) )
        {
          numbers = ConsesLow.cons( $kw292$PLURAL, numbers );
        }
        Dynamic.sublisp_throw( $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD, numbers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prpX_tree_method = Errors.handleThrowable( ccatch_env_var, $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prpX_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 55298L)
  public static SubLObject prpX_tree_get_person_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prpX_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD, string.equalp( $str729$my ) ? ONE_INTEGER
            : ( string.equalp( $str730$your ) ? TWO_INTEGER : ( string.equalp( $str731$our ) ? ONE_INTEGER : THREE_INTEGER ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prpX_tree_method = Errors.handleThrowable( ccatch_env_var, $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prpX_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 55541L)
  public static SubLObject prpX_tree_get_gender_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_prpX_tree_method = NIL;
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD, conses_high.assoc( string, $list735, EQUALP, UNPROVIDED ).rest() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_prpX_tree_method = Errors.handleThrowable( ccatch_env_var, $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_prpX_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
  public static SubLObject subloop_reserved_initialize_wdt_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
  public static SubLObject subloop_reserved_initialize_wdt_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56032L)
  public static SubLObject wdt_word_tree_p(final SubLObject wdt_word_tree)
  {
    return classes.subloop_instanceof_class( wdt_word_tree, $sym737$WDT_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56210L)
  public static SubLObject wdt_word_tree_get_refs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wdt_word_tree_method = NIL;
    final SubLObject refs = get_word_tree_refs( self );
    try
    {
      thread.throwStack.push( $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD );
      try
      {
        final SubLObject antecedent = methods.funcall_instance_method_with_0_args( self, $sym278$GET_ANTECEDENT );
        Dynamic.sublisp_throw( $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, ( NIL != antecedent ) ? methods.funcall_instance_method_with_0_args( antecedent, $sym100$GET_REFS ) : refs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_tree_refs( self, refs );
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
      catch_var_for_wdt_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wdt_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56434L)
  public static SubLObject wdt_word_tree_get_antecedent_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wdt_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD );
      try
      {
        final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
        final SubLObject great_grandmother = ( NIL != grandmother ) ? methods.funcall_instance_method_with_0_args( grandmother, $sym139$GET_MOTHER ) : NIL;
        if( NIL != parse_tree.np_tree_p( great_grandmother ) && NIL != parse_tree.np_tree_p( methods.funcall_instance_method_with_1_args( great_grandmother, $sym296$GET_DAUGHTER, ZERO_INTEGER ) ) )
        {
          Dynamic.sublisp_throw( $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args( great_grandmother, $sym296$GET_DAUGHTER, ZERO_INTEGER ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_wdt_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wdt_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
  public static SubLObject possessive_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords)
  {
    if( keywords == UNPROVIDED )
    {
      keywords = $list750;
    }
    SubLObject conjuncts = NIL;
    final SubLObject possessor = methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR );
    final SubLObject possessed = methods.funcall_instance_method_with_0_args( self, $sym751$GET_POSSESSED );
    if( NIL != possessor && NIL != conses_high.member( $kw208$POSSESSOR, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw208$POSSESSOR, possessor ), conjuncts );
    }
    if( NIL != possessed && NIL != conses_high.member( $kw752$POSSESSED, keywords, EQL, UNPROVIDED ) )
    {
      conjuncts = ConsesLow.cons( cyclifier_interface.coordinate_keyword_renaming( $kw752$POSSESSED, possessed ), conjuncts );
    }
    return cyclifier_interface.disjunctive_keyword_renamings( conjuncts, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
  public static SubLObject subloop_reserved_initialize_possessive_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
  public static SubLObject subloop_reserved_initialize_possessive_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 56873L)
  public static SubLObject possessive_word_tree_p(final SubLObject possessive_word_tree)
  {
    return classes.subloop_instanceof_class( possessive_word_tree, $sym745$POSSESSIVE_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57342L)
  public static SubLObject possessive_word_tree_get_possessor_method(final SubLObject self)
  {
    final SubLObject possessor = methods.funcall_instance_method_with_1_args( self, $sym180$GET_SISTER, MINUS_ONE_INTEGER );
    return ( NIL != possessor ) ? possessor : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57592L)
  public static SubLObject possessive_word_tree_get_possessed_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_possessive_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
      try
      {
        final SubLObject grandmother = ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym139$GET_MOTHER ) : NIL;
        final SubLObject grandmother_head = ( NIL != parse_tree.nominal_phrase_tree_p( grandmother ) ) ? methods.funcall_instance_method_with_0_args( grandmother, $sym19$GET_HEAD ) : NIL;
        Dynamic.sublisp_throw( $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, ( NIL != grandmother_head ) ? grandmother_head : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_possessive_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_possessive_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 57969L)
  public static SubLObject possessive_word_tree_get_complements_method(final SubLObject self)
  {
    SubLObject complements = NIL;
    final SubLObject possessor = methods.funcall_instance_method_with_0_args( self, $sym227$GET_POSSESSOR );
    final SubLObject possessed = methods.funcall_instance_method_with_0_args( self, $sym751$GET_POSSESSED );
    if( NIL != possessed )
    {
      complements = ConsesLow.cons( possessed, complements );
    }
    if( NIL != possessor )
    {
      complements = ConsesLow.cons( possessor, complements );
    }
    return complements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58353L)
  public static SubLObject possessive_word_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_possessive_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
      try
      {
        if( NIL != mother )
        {
          final SubLObject candidate = methods.funcall_instance_method_with_0_args( self, $sym751$GET_POSSESSED );
          if( NIL != candidate && NIL == subl_promotions.memberP( mother, methods.funcall_instance_method_with_0_args( candidate, $sym62$GET_COMPLEMENTS ), EQ, UNPROVIDED ) )
          {
            Dynamic.sublisp_throw( $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, ConsesLow.list( candidate ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_possessive_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_possessive_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
  public static SubLObject subloop_reserved_initialize_cardinal_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
  public static SubLObject subloop_reserved_initialize_cardinal_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58815L)
  public static SubLObject cardinal_word_tree_p(final SubLObject cardinal_word_tree)
  {
    return classes.subloop_instanceof_class( cardinal_word_tree, $sym766$CARDINAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
  public static SubLObject subloop_reserved_initialize_existential_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
  public static SubLObject subloop_reserved_initialize_existential_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 58927L)
  public static SubLObject existential_word_tree_p(final SubLObject existential_word_tree)
  {
    return classes.subloop_instanceof_class( existential_word_tree, $sym770$EXISTENTIAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
  public static SubLObject subloop_reserved_initialize_punctuation_word_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
  public static SubLObject subloop_reserved_initialize_punctuation_word_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59019L)
  public static SubLObject punctuation_word_tree_p(final SubLObject punctuation_word_tree)
  {
    return classes.subloop_instanceof_class( punctuation_word_tree, $sym773$PUNCTUATION_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 59126L)
  public static SubLObject temporal_tree_p(final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.parse_tree_p( tree ) && NIL != methods.funcall_instance_method_with_0_args( tree, $sym149$TEMPORAL_TREE_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 61305L)
  public static SubLObject word_for_category(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word = conses_high.assoc( category, $category_to_word$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL == word )
    {
      word = $sym0$WORD_TREE;
    }
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 61662L)
  public static SubLObject parse_expression_to_word_tree(final SubLObject word_expression, SubLObject mother, SubLObject index, SubLObject v_context)
  {
    if( mother == UNPROVIDED )
    {
      mother = NIL;
    }
    if( index == UNPROVIDED )
    {
      index = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym85$PARSE_TREE_CONTEXT );
    }
    return new_word_tree( word_expression_string( word_expression ), parse_expression_category( word_expression ), mother, index, NIL, v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
  public static SubLObject get_multi_noun_tree_daughters(final SubLObject multi_noun_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( multi_noun_tree, TEN_INTEGER, $sym191$DAUGHTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
  public static SubLObject set_multi_noun_tree_daughters(final SubLObject multi_noun_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( multi_noun_tree, value, TEN_INTEGER, $sym191$DAUGHTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
  public static SubLObject subloop_reserved_initialize_multi_noun_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym74$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
  public static SubLObject subloop_reserved_initialize_multi_noun_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym76$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym73$OBJECT, $sym77$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym78$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym79$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym80$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym81$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym82$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$PARSE_TREE, $sym83$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym6$LEXES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym5$REFS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_TREE, $sym4$ABS_IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym778$MULTI_NOUN_TREE, $sym191$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62060L)
  public static SubLObject multi_noun_tree_p(final SubLObject multi_noun_tree)
  {
    return classes.subloop_instanceof_class( multi_noun_tree, $sym778$MULTI_NOUN_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62231L)
  public static SubLObject new_multi_noun_tree(final SubLObject words)
  {
    final SubLObject self = object.new_class_instance( $sym778$MULTI_NOUN_TREE );
    SubLObject strings = NIL;
    parse_tree.set_parse_tree_category( self, methods.funcall_instance_method_with_0_args( words.first(), $sym35$GET_CATEGORY ) );
    parse_tree.set_parse_tree_mother( self, methods.funcall_instance_method_with_0_args( words.first(), $sym139$GET_MOTHER ) );
    set_word_tree_refs( self, methods.funcall_instance_method_with_0_args( words.first(), $sym100$GET_REFS ) );
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      strings = ConsesLow.cons( methods.funcall_instance_method_with_0_args( word, $sym24$GET_STRING ), strings );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    parse_tree.set_parse_tree_string( self, string_utilities.bunge( Sequences.nreverse( strings ), UNPROVIDED ) );
    set_multi_noun_tree_daughters( self, Functions.apply( $sym782$VECTOR, words ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 62856L)
  public static SubLObject parse_expression_category(final SubLObject parse_expression)
  {
    return parse_expression.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63147L)
  public static SubLObject phrase_expression_daughters(final SubLObject phrase_expression)
  {
    return phrase_expression.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63325L)
  public static SubLObject phrase_expression_p(final SubLObject parse_expression)
  {
    return Types.listp( conses_high.second( parse_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63507L)
  public static SubLObject word_expression_p(final SubLObject parse_expression)
  {
    return Types.stringp( conses_high.second( parse_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63687L)
  public static SubLObject word_expression_string(final SubLObject word_expression)
  {
    return conses_high.second( word_expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 63832L)
  public static SubLObject charniak_expression_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && v_object.first().isKeyword() && v_object.rest().isList() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 64035L)
  public static SubLObject charniak_expression_parse_expression(final SubLObject charniak_parser_parse)
  {
    return conses_high.second( charniak_parser_parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 64237L)
  public static SubLObject parse_tree_covers_method(final SubLObject self, final SubLObject list_of_strings)
  {
    final SubLObject yield = methods.funcall_instance_method_with_0_args( self, $sym109$YIELD );
    SubLObject tree_words = NIL;
    SubLObject fail = NIL;
    SubLObject cdolist_list_var = yield;
    SubLObject tree = NIL;
    tree = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      tree_words = ConsesLow.cons( methods.funcall_instance_method_with_0_args( tree, $sym24$GET_STRING ), tree_words );
      cdolist_list_var = cdolist_list_var.rest();
      tree = cdolist_list_var.first();
    }
    if( NIL == fail )
    {
      SubLObject csome_list_var = list_of_strings;
      SubLObject v_term = NIL;
      v_term = csome_list_var.first();
      while ( NIL == fail && NIL != csome_list_var)
      {
        SubLObject match = NIL;
        if( NIL == match )
        {
          SubLObject csome_list_var_$14 = tree_words;
          SubLObject word = NIL;
          word = csome_list_var_$14.first();
          while ( NIL == match && NIL != csome_list_var_$14)
          {
            if( v_term.equalp( word ) )
            {
              match = T;
            }
            csome_list_var_$14 = csome_list_var_$14.rest();
            word = csome_list_var_$14.first();
          }
        }
        if( NIL == match )
        {
          fail = T;
        }
        csome_list_var = csome_list_var.rest();
        v_term = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == fail );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 65070L)
  public static SubLObject parse_tree_covers_minimally_method(final SubLObject self, final SubLObject list_of_strings)
  {
    if( NIL == methods.funcall_instance_method_with_1_args( self, $sym783$COVERS, list_of_strings ) )
    {
      return NIL;
    }
    SubLObject fail = NIL;
    if( NIL != parse_tree.phrase_tree_p( self ) )
    {
      final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( self );
      final SubLObject backwardP_var = NIL;
      final SubLObject length = Sequences.length( vector_var );
      SubLObject current;
      final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
      SubLObject start = NIL;
      SubLObject end = NIL;
      SubLObject delta = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list789 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list789 );
      end = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list789 );
      delta = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == fail )
        {
          SubLObject end_var;
          SubLObject element_num;
          SubLObject daughter;
          for( end_var = end, element_num = NIL, element_num = start; NIL == fail && NIL == subl_macros.do_numbers_endtest( element_num, delta, end_var ); element_num = Numbers.add( element_num, delta ) )
          {
            daughter = Vectors.aref( vector_var, element_num );
            if( NIL != methods.funcall_instance_method_with_1_args( daughter, $sym783$COVERS, list_of_strings ) )
            {
              fail = T;
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list789 );
      }
    }
    return makeBoolean( NIL == fail );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-tree.lisp", position = 65604L)
  public static SubLObject parse_tree_get_minimally_covering_subtrees_method(final SubLObject self, final SubLObject list_of_strings)
  {
    SubLObject minimal = NIL;
    final SubLObject queue = queues.create_queue( UNPROVIDED );
    queues.enqueue( self, queue );
    while ( NIL == queues.queue_empty_p( queue ))
    {
      final SubLObject subtree = queues.dequeue( queue );
      if( NIL != methods.funcall_instance_method_with_1_args( subtree, $sym787$COVERS_MINIMALLY, list_of_strings ) )
      {
        minimal = ConsesLow.cons( subtree, minimal );
      }
      else
      {
        if( NIL == methods.funcall_instance_method_with_1_args( subtree, $sym783$COVERS, list_of_strings ) || NIL == parse_tree.phrase_tree_p( subtree ) )
        {
          continue;
        }
        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( subtree );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          queues.enqueue( daughter, queue );
        }
      }
    }
    return minimal;
  }

  public static SubLObject declare_word_tree_file()
  {
    SubLFiles.declareFunction( me, "get_word_tree_abs_idx", "GET-WORD-TREE-ABS-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_tree_abs_idx", "SET-WORD-TREE-ABS-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_tree_refs", "GET-WORD-TREE-REFS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_tree_refs", "SET-WORD-TREE-REFS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_tree_lexes", "GET-WORD-TREE-LEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_tree_lexes", "SET-WORD-TREE-LEXES", 2, 0, false );
    SubLFiles.declareFunction( me, "word_tree_modified_dependent_meaning_p_method", "WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_pp_comp_filter_lexes_method", "WORD-TREE-PP-COMP-FILTER-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_frame_filter_lexes_method", "WORD-TREE-FRAME-FILTER-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_pos_filter_lexes_method", "WORD-TREE-POS-FILTER-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_tree_keyword_eq_classes_method", "WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_cyclify_nucleus_method", "WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_tree_cyclify_int_method", "WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_keyword_renamings_method", "WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_tree_partition_semantic_complements_method", "WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_semantic_complements_method", "WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_oblique_object_method", "WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_pp_complement_method", "WORD-TREE-GET-PP-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_p", "WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word_tree", "NEW-WORD-TREE", 4, 2, false );
    SubLFiles.declareFunction( me, "word_tree_get_string_method", "WORD-TREE-GET-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_abs_index_method", "WORD-TREE-GET-ABS-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_lexes_method", "WORD-TREE-GET-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_ranked_lexes_method", "WORD-TREE-GET-RANKED-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_refs_method", "WORD-TREE-GET-REFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_set_refs_method", "WORD-TREE-SET-REFS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_tree_yield_method", "WORD-TREE-YIELD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_parse_expression_method", "WORD-TREE-GET-PARSE-EXPRESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_heads_method", "WORD-TREE-GET-HEADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_head_method", "WORD-TREE-GET-HEAD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_semantic_heads_method", "WORD-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_lexify_int_method", "WORD-TREE-LEXIFY-INT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_pps_method", "WORD-TREE-GET-PPS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_complements_method", "WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_modifiers_method", "WORD-TREE-GET-MODIFIERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_modifieds_method", "WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_temporal_tree_p_method", "WORD-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_relative_pronoun_p_method", "WORD-TREE-RELATIVE-PRONOUN-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_retokenize_method", "WORD-TREE-RETOKENIZE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_tree_logical_form_int_method", "WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_function_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_function_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "function_word_tree_p", "FUNCTION-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_modifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_modifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "modifier_word_tree_p", "MODIFIER-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_coordinate_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_coordinate_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "coordinate_word_tree_p", "COORDINATE-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "coordinate_word_tree_get_complements_method", "COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_coordinate_phrase_p_method", "PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "coordinate_phrase_tree_p", "COORDINATE-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "coordinate_phrase_tree_coordinate_phrase_p_method", "COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_unlike_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "unlike_coordinate_phrase_tree_p", "UNLIKE-COORDINATE-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unlike_coordinate_phrase_tree_coordinate_phrase_p_method", "UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_keyword_renamings_method", "NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_cyclify_nucleus_method", "NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_cyclify_int_method", "NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_definite_description_p_method", "NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_relational_noun_p_method", "NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_quantifier_method", "NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nominal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nominal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_p", "NOMINAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_number_method", "NOMINAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_complements_method", "NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_determiner_method", "NOMINAL-WORD-TREE-GET-DETERMINER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_overt_quantifier_method", "NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_existential_null_determiner_method", "WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_null_determiner", "GET-NULL-DETERMINER", 3, 1, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_possessor_method", "NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_specifier_method", "NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_antecedent_method", "NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_gender_method", "NOMINAL-WORD-TREE-GET-GENDER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_person_method", "NOMINAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_singular_p_method", "NOMINAL-WORD-TREE-SINGULAR-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_plural_p_method", "NOMINAL-WORD-TREE-PLURAL-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "non_of_prepositional_tree_p", "NON-OF-PREPOSITIONAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_get_modifieds_method", "NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "appositive_np_p", "APPOSITIVE-NP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nn_tree_p", "NN-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nn_tree_get_number_method", "NN-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "name_word_tree_get_quantifier_method", "NAME-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_name_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_name_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "name_word_tree_p", "NAME-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_dollar_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_dollar_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "dollar_word_tree_p", "DOLLAR-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "dollar_word_tree_get_overt_quantifier_method", "DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nnp_tree_p", "NNP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nnp_tree_get_number_method", "NNP-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nns_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nns_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nns_tree_p", "NNS-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nns_tree_get_number_method", "NNS-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nnps_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nnps_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nnps_tree_p", "NNPS-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nnps_tree_get_number_method", "NNPS-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prp_tree_p", "PRP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prp_tree_get_number_method", "PRP-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prp_tree_get_person_method", "PRP-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prp_tree_get_gender_method", "PRP-TREE-GET-GENDER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_p", "WP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_get_refs_method", "WP-TREE-GET-REFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_get_antecedent_method", "WP-TREE-GET-ANTECEDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_get_quantifier_method", "WP-TREE-GET-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_get_number_method", "WP-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wp_tree_get_gender_method", "WP-TREE-GET-GENDER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "relative_clause_p", "RELATIVE-CLAUSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_particle_filter_lexes_method", "VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_partition_semantic_complements_method", "VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_keyword_renamings_method", "VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_controller_method", "VERBAL-WORD-TREE-GET-CONTROLLER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_control_verb_method", "VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_object_controller_p_method", "VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_subject_controller_p_method", "VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_control_verb_p_method", "VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_matrix_clause_method", "VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_verbal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_verbal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_p", "VERBAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_predicate_method", "VERBAL-WORD-TREE-GET-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_number_method", "VERBAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_person_method", "VERBAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_tense_method", "VERBAL-WORD-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_subject_method", "VERBAL-WORD-TREE-GET-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_objects_method", "VERBAL-WORD-TREE-GET-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_moved_nps_method", "VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_moved_objects_method", "VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_direct_object_method", "VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_indirect_object_method", "VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_semantic_direct_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_semantic_indirect_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_verbal_complement_method", "VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_adjectival_complement_method", "VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_complements_method", "VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_particle_method", "VERBAL-WORD-TREE-GET-PARTICLE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_infinitive_marker_method", "VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_dummy_to_p_method", "VERBAL-WORD-TREE-DUMMY-TO-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_semantic_subject_method", "VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_semantic_objects_method", "VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_get_ancestor_objects_method", "VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_inverted_p_method", "VERBAL-WORD-TREE-INVERTED-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_finite_p_method", "VERBAL-WORD-TREE-FINITE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_passive_p_method", "VERBAL-WORD-TREE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_infinitive_p_method", "VERBAL-WORD-TREE-INFINITIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_base_p_method", "VERBAL-WORD-TREE-BASE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbz_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbz_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vbz_tree_p", "VBZ-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vbz_tree_get_tense_method", "VBZ-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_p", "VBN-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_get_aux_verb_method", "VBN-TREE-GET-AUX-VERB-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_get_semantic_subject_method", "VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_get_semantic_direct_object_method", "VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_get_semantic_indirect_object_method", "VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "vbn_tree_passive_p_method", "VBN-TREE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbd_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbd_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vbd_tree_p", "VBD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vbd_tree_get_tense_method", "VBD-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vbp_tree_p", "VBP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vbp_tree_get_tense_method", "VBP-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vb_tree_p", "VB-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vb_tree_get_tense_method", "VB-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbg_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vbg_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vbg_tree_p", "VBG-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "vbg_tree_get_aux_verb_method", "VBG-TREE-GET-AUX-VERB-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "vbg_tree_get_modifieds_method", "VBG-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_copula_p_method", "AUX-VERB-TREE-COPULA-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_keyword_renamings_method", "AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_semantic_complements_method", "AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_complements_method", "AUX-VERB-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_semantic_heads_method", "AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_tense_method", "AUX-VERB-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_aux_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_aux_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_p", "AUX-VERB-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_prepositional_complement_method", "AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_adverbial_complement_method", "AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_subject_method", "AUX-VERB-TREE-GET-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_direct_object_method", "AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_indirect_object_method", "AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_get_semantic_subject_method", "AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_inverted_p_method", "AUX-VERB-TREE-INVERTED-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_tree_passive_p_method", "AUX-VERB-TREE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_modal_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_modal_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "modal_verb_tree_p", "MODAL-VERB-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "modal_verb_tree_get_tense_method", "MODAL-VERB-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "modal_verb_tree_get_objects_method", "MODAL-VERB-TREE-GET-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_word_tree_get_keyword_renamings_method", "ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "adjectival_word_tree_get_complements_method", "ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adjectival_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adjectival_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_word_tree_p", "ADJECTIVAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_word_tree_get_modifieds_method", "ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_word_tree_get_verbal_complement_method", "ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_word_tree_get_keyword_renamings_method", "ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adverbial_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adverbial_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_word_tree_p", "ADVERBIAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_word_tree_get_modifieds_method", "ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wrb_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wrb_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wrb_word_tree_p", "WRB-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_keyword_renamings_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_or_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_or_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_p", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_oblique_object_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_verbal_complement_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_complements_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_modifieds_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_refs_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_get_antecedent_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_word_tree_p", "PREPOSITIONAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "particle_word_tree_p", "PARTICLE-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_specifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_specifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "specifier_word_tree_p", "SPECIFIER-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "specifier_word_tree_get_specified_method", "SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_word_tree_get_keyword_renamings_method", "QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_quantifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_quantifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_word_tree_p", "QUANTIFIER-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_word_tree_get_quantified_method", "QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_word_tree_get_specified_method", "QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_determiner_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_determiner_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "determiner_word_tree_p", "DETERMINER-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prpX_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prpX_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prpX_tree_p", "PRP$-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prpX_tree_get_number_method", "PRP$-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prpX_tree_get_person_method", "PRP$-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prpX_tree_get_gender_method", "PRP$-TREE-GET-GENDER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wdt_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wdt_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wdt_word_tree_p", "WDT-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wdt_word_tree_get_refs_method", "WDT-WORD-TREE-GET-REFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wdt_word_tree_get_antecedent_method", "WDT-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_get_keyword_renamings_method", "POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_possessive_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_possessive_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_p", "POSSESSIVE-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_get_possessor_method", "POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_get_possessed_method", "POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_get_complements_method", "POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_get_modifieds_method", "POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cardinal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cardinal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cardinal_word_tree_p", "CARDINAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_existential_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_existential_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "existential_word_tree_p", "EXISTENTIAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_punctuation_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_punctuation_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_word_tree_p", "PUNCTUATION-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "temporal_tree_p", "TEMPORAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "word_for_category", "WORD-FOR-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_expression_to_word_tree", "PARSE-EXPRESSION-TO-WORD-TREE", 1, 3, false );
    SubLFiles.declareFunction( me, "get_multi_noun_tree_daughters", "GET-MULTI-NOUN-TREE-DAUGHTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_multi_noun_tree_daughters", "SET-MULTI-NOUN-TREE-DAUGHTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_multi_noun_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_multi_noun_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_noun_tree_p", "MULTI-NOUN-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_multi_noun_tree", "NEW-MULTI-NOUN-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_expression_category", "PARSE-EXPRESSION-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_expression_daughters", "PHRASE-EXPRESSION-DAUGHTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_expression_p", "PHRASE-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "word_expression_p", "WORD-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "word_expression_string", "WORD-EXPRESSION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "charniak_expression_p", "CHARNIAK-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "charniak_expression_parse_expression", "CHARNIAK-EXPRESSION-PARSE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_covers_method", "PARSE-TREE-COVERS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_covers_minimally_method", "PARSE-TREE-COVERS-MINIMALLY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_minimally_covering_subtrees_method", "PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_word_tree_file()
  {
    $singular_personal_pronouns$ = SubLFiles.defconstant( "*SINGULAR-PERSONAL-PRONOUNS*", $list342 );
    $plural_personal_pronouns$ = SubLFiles.defconstant( "*PLURAL-PERSONAL-PRONOUNS*", $list343 );
    $to_be_forms$ = SubLFiles.deflexical( "*TO-BE-FORMS*", $list541 );
    $singular_possessive_pronouns$ = SubLFiles.defconstant( "*SINGULAR-POSSESSIVE-PRONOUNS*", $list722 );
    $plural_possessive_pronouns$ = SubLFiles.defconstant( "*PLURAL-POSSESSIVE-PRONOUNS*", $list723 );
    $category_to_word$ = SubLFiles.defparameter( "*CATEGORY-TO-WORD*", $list777 );
    return NIL;
  }

  public static SubLObject setup_word_tree_file()
  {
    classes.subloop_new_class( $sym0$WORD_TREE, $sym1$PARSE_TREE, $list2, NIL, $list3 );
    classes.class_set_implements_slot_listeners( $sym0$WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym7$MODIFIED_DEPENDENT_MEANING_P, $sym0$WORD_TREE, $list8, NIL, $list9 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym7$MODIFIED_DEPENDENT_MEANING_P, $sym14$WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD );
    methods.methods_incorporate_instance_method( $sym15$PP_COMP_FILTER_LEXES, $sym0$WORD_TREE, $list8, NIL, $list16 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym15$PP_COMP_FILTER_LEXES, $sym25$WORD_TREE_PP_COMP_FILTER_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym26$FRAME_FILTER_LEXES, $sym0$WORD_TREE, $list8, NIL, $list27 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym26$FRAME_FILTER_LEXES, $sym31$WORD_TREE_FRAME_FILTER_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym32$POS_FILTER_LEXES, $sym0$WORD_TREE, $list8, NIL, $list33 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym32$POS_FILTER_LEXES, $sym39$WORD_TREE_POS_FILTER_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym29$TREE_KEYWORD_EQ_CLASSES, $sym0$WORD_TREE, $list8, NIL, $list40 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym29$TREE_KEYWORD_EQ_CLASSES, $sym43$WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD );
    methods.methods_incorporate_instance_method( $sym44$CYCLIFY_NUCLEUS, $sym0$WORD_TREE, $list8, $list45, $list46 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym44$CYCLIFY_NUCLEUS, $sym51$WORD_TREE_CYCLIFY_NUCLEUS_METHOD );
    methods.methods_incorporate_instance_method( $sym48$CYCLIFY_INT, $sym0$WORD_TREE, $list8, NIL, $list52 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym48$CYCLIFY_INT, $sym53$WORD_TREE_CYCLIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym0$WORD_TREE, $list8, $list54, $list55 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym56$WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym47$PARTITION_SEMANTIC_COMPLEMENTS, $sym0$WORD_TREE, $list8, NIL, $list57 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym47$PARTITION_SEMANTIC_COMPLEMENTS, $sym59$WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym58$GET_SEMANTIC_COMPLEMENTS, $sym0$WORD_TREE, $list60, NIL, $list61 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym58$GET_SEMANTIC_COMPLEMENTS, $sym63$WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym64$GET_OBLIQUE_OBJECT, $sym0$WORD_TREE, $list60, NIL, $list65 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym64$GET_OBLIQUE_OBJECT, $sym66$WORD_TREE_GET_OBLIQUE_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym18$GET_PP_COMPLEMENT, $sym0$WORD_TREE, $list60, NIL, $list67 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym18$GET_PP_COMPLEMENT, $sym72$WORD_TREE_GET_PP_COMPLEMENT_METHOD );
    classes.subloop_note_class_initialization_function( $sym0$WORD_TREE, $sym75$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$WORD_TREE, $sym84$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_word_tree_class( $sym0$WORD_TREE );
    methods.methods_incorporate_instance_method( $sym24$GET_STRING, $sym0$WORD_TREE, $list60, NIL, $list87 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym24$GET_STRING, $sym89$WORD_TREE_GET_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym90$GET_ABS_INDEX, $sym0$WORD_TREE, $list60, NIL, $list91 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym90$GET_ABS_INDEX, $sym93$WORD_TREE_GET_ABS_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym94$GET_LEXES, $sym0$WORD_TREE, $list60, NIL, $list95 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym94$GET_LEXES, $sym96$WORD_TREE_GET_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym13$GET_RANKED_LEXES, $sym0$WORD_TREE, $list60, NIL, $list97 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym13$GET_RANKED_LEXES, $sym99$WORD_TREE_GET_RANKED_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym100$GET_REFS, $sym0$WORD_TREE, $list101, NIL, $list102 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym100$GET_REFS, $sym103$WORD_TREE_GET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym104$SET_REFS, $sym0$WORD_TREE, $list60, $list105, $list106 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym104$SET_REFS, $sym108$WORD_TREE_SET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym109$YIELD, $sym0$WORD_TREE, $list60, NIL, $list110 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym109$YIELD, $sym111$WORD_TREE_YIELD_METHOD );
    methods.methods_incorporate_instance_method( $sym112$GET_PARSE_EXPRESSION, $sym0$WORD_TREE, $list60, NIL, $list113 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym112$GET_PARSE_EXPRESSION, $sym114$WORD_TREE_GET_PARSE_EXPRESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym115$GET_HEADS, $sym0$WORD_TREE, $list60, NIL, $list116 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym115$GET_HEADS, $sym117$WORD_TREE_GET_HEADS_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_HEAD, $sym0$WORD_TREE, $list60, NIL, $list118 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym19$GET_HEAD, $sym119$WORD_TREE_GET_HEAD_METHOD );
    methods.methods_incorporate_instance_method( $sym120$GET_SEMANTIC_HEADS, $sym0$WORD_TREE, $list60, NIL, $list121 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym120$GET_SEMANTIC_HEADS, $sym122$WORD_TREE_GET_SEMANTIC_HEADS_METHOD );
    methods.methods_incorporate_instance_method( $sym123$LEXIFY_INT, $sym0$WORD_TREE, $list124, $list125, $list126 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym123$LEXIFY_INT, $sym132$WORD_TREE_LEXIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym71$GET_PPS, $sym0$WORD_TREE, $list60, NIL, $list133 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym71$GET_PPS, $sym140$WORD_TREE_GET_PPS_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym0$WORD_TREE, $list60, NIL, $list141 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym62$GET_COMPLEMENTS, $sym142$WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym49$GET_MODIFIERS, $sym0$WORD_TREE, $list60, NIL, $list143 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym49$GET_MODIFIERS, $sym145$WORD_TREE_GET_MODIFIERS_METHOD );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym0$WORD_TREE, $list60, NIL, $list147 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym146$GET_MODIFIEDS, $sym148$WORD_TREE_GET_MODIFIEDS_METHOD );
    methods.methods_incorporate_instance_method( $sym149$TEMPORAL_TREE_P, $sym0$WORD_TREE, $list60, NIL, $list150 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym149$TEMPORAL_TREE_P, $sym155$WORD_TREE_TEMPORAL_TREE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym156$RELATIVE_PRONOUN_P, $sym0$WORD_TREE, $list60, NIL, $list157 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym156$RELATIVE_PRONOUN_P, $sym161$WORD_TREE_RELATIVE_PRONOUN_P_METHOD );
    methods.methods_incorporate_instance_method( $sym162$RETOKENIZE, $sym0$WORD_TREE, $list8, $list125, $list163 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym162$RETOKENIZE, $sym164$WORD_TREE_RETOKENIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym165$LOGICAL_FORM_INT, $sym0$WORD_TREE, $list8, NIL, $list166 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym165$LOGICAL_FORM_INT, $sym167$WORD_TREE_LOGICAL_FORM_INT_METHOD );
    classes.subloop_new_class( $sym168$FUNCTION_WORD_TREE, $sym0$WORD_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym168$FUNCTION_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym168$FUNCTION_WORD_TREE, $sym169$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym168$FUNCTION_WORD_TREE, $sym170$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_function_word_tree_class( $sym168$FUNCTION_WORD_TREE );
    classes.subloop_new_class( $sym171$MODIFIER_WORD_TREE, $sym0$WORD_TREE, NIL, NIL, $list172 );
    classes.class_set_implements_slot_listeners( $sym171$MODIFIER_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym171$MODIFIER_WORD_TREE, $sym173$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym171$MODIFIER_WORD_TREE, $sym174$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_modifier_word_tree_class( $sym171$MODIFIER_WORD_TREE );
    classes.subloop_new_class( $sym175$COORDINATE_WORD_TREE, $sym168$FUNCTION_WORD_TREE, NIL, NIL, $list176 );
    classes.class_set_implements_slot_listeners( $sym175$COORDINATE_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym175$COORDINATE_WORD_TREE, $sym177$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym175$COORDINATE_WORD_TREE, $sym178$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_coordinate_word_tree_class( $sym175$COORDINATE_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym175$COORDINATE_WORD_TREE, $list60, NIL, $list179 );
    methods.subloop_register_instance_method( $sym175$COORDINATE_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym181$COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym182$COORDINATE_PHRASE_P, $sym183$PHRASE_TREE, $list60, NIL, $list184 );
    methods.subloop_register_instance_method( $sym183$PHRASE_TREE, $sym182$COORDINATE_PHRASE_P, $sym186$PHRASE_TREE_COORDINATE_PHRASE_P_METHOD );
    classes.subloop_new_class( $sym187$COORDINATE_PHRASE_TREE, $sym188$NOMINAL_PHRASE_TREE, NIL, NIL, $list189 );
    classes.class_set_implements_slot_listeners( $sym187$COORDINATE_PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym187$COORDINATE_PHRASE_TREE, $sym190$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym187$COORDINATE_PHRASE_TREE, $sym192$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE );
    subloop_reserved_initialize_coordinate_phrase_tree_class( $sym187$COORDINATE_PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym182$COORDINATE_PHRASE_P, $sym187$COORDINATE_PHRASE_TREE, $list60, NIL, $list193 );
    methods.subloop_register_instance_method( $sym187$COORDINATE_PHRASE_TREE, $sym182$COORDINATE_PHRASE_P, $sym194$COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD );
    classes.subloop_new_class( $sym195$UNLIKE_COORDINATE_PHRASE_TREE, $sym188$NOMINAL_PHRASE_TREE, NIL, NIL, $list189 );
    classes.class_set_implements_slot_listeners( $sym195$UNLIKE_COORDINATE_PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym195$UNLIKE_COORDINATE_PHRASE_TREE, $sym196$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym195$UNLIKE_COORDINATE_PHRASE_TREE, $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC );
    subloop_reserved_initialize_unlike_coordinate_phrase_tree_class( $sym195$UNLIKE_COORDINATE_PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym182$COORDINATE_PHRASE_P, $sym195$UNLIKE_COORDINATE_PHRASE_TREE, $list60, NIL, $list193 );
    methods.subloop_register_instance_method( $sym195$UNLIKE_COORDINATE_PHRASE_TREE, $sym182$COORDINATE_PHRASE_P, $sym198$UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD );
    classes.subloop_new_class( $sym199$NOMINAL_WORD_TREE, $sym0$WORD_TREE, $list200, NIL, $list201 );
    classes.class_set_implements_slot_listeners( $sym199$NOMINAL_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym199$NOMINAL_WORD_TREE, $list8, $list202, $list203 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym214$NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym44$CYCLIFY_NUCLEUS, $sym199$NOMINAL_WORD_TREE, $list8, $list215, $list216 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym44$CYCLIFY_NUCLEUS, $sym218$NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD );
    methods.methods_incorporate_instance_method( $sym48$CYCLIFY_INT, $sym199$NOMINAL_WORD_TREE, $list8, NIL, $list219 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym48$CYCLIFY_INT, $sym221$NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym222$DEFINITE_DESCRIPTION_P, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list223 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym222$DEFINITE_DESCRIPTION_P, $sym228$NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD );
    methods.methods_incorporate_instance_method( $sym229$RELATIONAL_NOUN_P, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list230 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym229$RELATIONAL_NOUN_P, $sym231$NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD );
    methods.methods_incorporate_instance_method( $sym220$GET_QUANTIFIER, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list232 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym220$GET_QUANTIFIER, $sym235$NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD );
    classes.subloop_note_class_initialization_function( $sym199$NOMINAL_WORD_TREE, $sym236$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym199$NOMINAL_WORD_TREE, $sym237$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_nominal_word_tree_class( $sym199$NOMINAL_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list239 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym238$GET_NUMBER, $sym240$NOMINAL_WORD_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list241 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym243$NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym224$GET_DETERMINER, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list244 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym224$GET_DETERMINER, $sym250$NOMINAL_WORD_TREE_GET_DETERMINER_METHOD );
    methods.methods_incorporate_instance_method( $sym205$GET_OVERT_QUANTIFIER, $sym199$NOMINAL_WORD_TREE, $list8, NIL, $list251 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym205$GET_OVERT_QUANTIFIER, $sym254$NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym233$GET_EXISTENTIAL_NULL_DETERMINER, $sym0$WORD_TREE, $list8, NIL, $list255 );
    methods.subloop_register_instance_method( $sym0$WORD_TREE, $sym233$GET_EXISTENTIAL_NULL_DETERMINER, $sym259$WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD );
    methods.methods_incorporate_instance_method( $sym227$GET_POSSESSOR, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list269 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym227$GET_POSSESSOR, $sym274$NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD );
    methods.methods_incorporate_instance_method( $sym275$GET_SPECIFIER, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list276 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym275$GET_SPECIFIER, $sym277$NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym278$GET_ANTECEDENT, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list279 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym278$GET_ANTECEDENT, $sym280$NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD );
    methods.methods_incorporate_instance_method( $sym281$GET_GENDER, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list282 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym281$GET_GENDER, $sym284$NOMINAL_WORD_TREE_GET_GENDER_METHOD );
    methods.methods_incorporate_instance_method( $sym285$GET_PERSON, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list286 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym285$GET_PERSON, $sym287$NOMINAL_WORD_TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym226$SINGULAR_P, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list288 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym226$SINGULAR_P, $sym290$NOMINAL_WORD_TREE_SINGULAR_P_METHOD );
    methods.methods_incorporate_instance_method( $sym234$PLURAL_P, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list291 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym234$PLURAL_P, $sym293$NOMINAL_WORD_TREE_PLURAL_P_METHOD );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym199$NOMINAL_WORD_TREE, $list60, NIL, $list294 );
    methods.subloop_register_instance_method( $sym199$NOMINAL_WORD_TREE, $sym146$GET_MODIFIEDS, $sym300$NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym303$NN_TREE, $sym199$NOMINAL_WORD_TREE, NIL, NIL, $list304 );
    classes.class_set_implements_slot_listeners( $sym303$NN_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym303$NN_TREE, $sym305$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym303$NN_TREE, $sym306$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE );
    subloop_reserved_initialize_nn_tree_class( $sym303$NN_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym303$NN_TREE, $list60, NIL, $list307 );
    methods.subloop_register_instance_method( $sym303$NN_TREE, $sym238$GET_NUMBER, $sym309$NN_TREE_GET_NUMBER_METHOD );
    classes.subloop_new_class( $sym310$NAME_WORD_TREE, $sym199$NOMINAL_WORD_TREE, $list311, NIL, $list312 );
    classes.class_set_implements_slot_listeners( $sym310$NAME_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym220$GET_QUANTIFIER, $sym310$NAME_WORD_TREE, $list60, NIL, $list313 );
    methods.subloop_register_instance_method( $sym310$NAME_WORD_TREE, $sym220$GET_QUANTIFIER, $sym314$NAME_WORD_TREE_GET_QUANTIFIER_METHOD );
    classes.subloop_note_class_initialization_function( $sym310$NAME_WORD_TREE, $sym315$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym310$NAME_WORD_TREE, $sym316$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_name_word_tree_class( $sym310$NAME_WORD_TREE );
    classes.subloop_new_class( $sym317$DOLLAR_WORD_TREE, $sym199$NOMINAL_WORD_TREE, NIL, NIL, $list318 );
    classes.class_set_implements_slot_listeners( $sym317$DOLLAR_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym317$DOLLAR_WORD_TREE, $sym319$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym317$DOLLAR_WORD_TREE, $sym320$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_dollar_word_tree_class( $sym317$DOLLAR_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym205$GET_OVERT_QUANTIFIER, $sym317$DOLLAR_WORD_TREE, $list8, NIL, $list321 );
    methods.subloop_register_instance_method( $sym317$DOLLAR_WORD_TREE, $sym205$GET_OVERT_QUANTIFIER, $sym322$DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD );
    classes.subloop_new_class( $sym323$NNP_TREE, $sym310$NAME_WORD_TREE, NIL, NIL, $list304 );
    classes.class_set_implements_slot_listeners( $sym323$NNP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym323$NNP_TREE, $sym324$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym323$NNP_TREE, $sym325$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE );
    subloop_reserved_initialize_nnp_tree_class( $sym323$NNP_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym323$NNP_TREE, $list60, NIL, $list307 );
    methods.subloop_register_instance_method( $sym323$NNP_TREE, $sym238$GET_NUMBER, $sym326$NNP_TREE_GET_NUMBER_METHOD );
    classes.subloop_new_class( $sym327$NNS_TREE, $sym199$NOMINAL_WORD_TREE, NIL, NIL, $list304 );
    classes.class_set_implements_slot_listeners( $sym327$NNS_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym327$NNS_TREE, $sym328$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym327$NNS_TREE, $sym329$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE );
    subloop_reserved_initialize_nns_tree_class( $sym327$NNS_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym327$NNS_TREE, $list60, NIL, $list330 );
    methods.subloop_register_instance_method( $sym327$NNS_TREE, $sym238$GET_NUMBER, $sym332$NNS_TREE_GET_NUMBER_METHOD );
    classes.subloop_new_class( $sym333$NNPS_TREE, $sym310$NAME_WORD_TREE, NIL, NIL, $list304 );
    classes.class_set_implements_slot_listeners( $sym333$NNPS_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym333$NNPS_TREE, $sym334$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym333$NNPS_TREE, $sym335$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE );
    subloop_reserved_initialize_nnps_tree_class( $sym333$NNPS_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym333$NNPS_TREE, $list60, NIL, $list330 );
    methods.subloop_register_instance_method( $sym333$NNPS_TREE, $sym238$GET_NUMBER, $sym336$NNPS_TREE_GET_NUMBER_METHOD );
    classes.subloop_new_class( $sym337$PRP_TREE, $sym199$NOMINAL_WORD_TREE, $list338, NIL, $list339 );
    classes.class_set_implements_slot_listeners( $sym337$PRP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym337$PRP_TREE, $sym340$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym337$PRP_TREE, $sym341$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE );
    subloop_reserved_initialize_prp_tree_class( $sym337$PRP_TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym337$PRP_TREE, $list60, NIL, $list344 );
    methods.subloop_register_instance_method( $sym337$PRP_TREE, $sym238$GET_NUMBER, $sym346$PRP_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym285$GET_PERSON, $sym337$PRP_TREE, $list60, NIL, $list347 );
    methods.subloop_register_instance_method( $sym337$PRP_TREE, $sym285$GET_PERSON, $sym354$PRP_TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym281$GET_GENDER, $sym337$PRP_TREE, $list60, NIL, $list355 );
    methods.subloop_register_instance_method( $sym337$PRP_TREE, $sym281$GET_GENDER, $sym358$PRP_TREE_GET_GENDER_METHOD );
    classes.subloop_new_class( $sym359$WP_TREE, $sym199$NOMINAL_WORD_TREE, $list360, NIL, $list361 );
    classes.class_set_implements_slot_listeners( $sym359$WP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym359$WP_TREE, $sym362$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym359$WP_TREE, $sym363$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE );
    subloop_reserved_initialize_wp_tree_class( $sym359$WP_TREE );
    methods.methods_incorporate_instance_method( $sym100$GET_REFS, $sym359$WP_TREE, $list60, NIL, $list364 );
    methods.subloop_register_instance_method( $sym359$WP_TREE, $sym100$GET_REFS, $sym366$WP_TREE_GET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym278$GET_ANTECEDENT, $sym359$WP_TREE, $list60, NIL, $list367 );
    methods.subloop_register_instance_method( $sym359$WP_TREE, $sym278$GET_ANTECEDENT, $sym369$WP_TREE_GET_ANTECEDENT_METHOD );
    methods.methods_incorporate_instance_method( $sym220$GET_QUANTIFIER, $sym359$WP_TREE, $list60, NIL, $list370 );
    methods.subloop_register_instance_method( $sym359$WP_TREE, $sym220$GET_QUANTIFIER, $sym372$WP_TREE_GET_QUANTIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym359$WP_TREE, $list60, NIL, $list373 );
    methods.subloop_register_instance_method( $sym359$WP_TREE, $sym238$GET_NUMBER, $sym374$WP_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym281$GET_GENDER, $sym359$WP_TREE, $list60, NIL, $list375 );
    methods.subloop_register_instance_method( $sym359$WP_TREE, $sym281$GET_GENDER, $sym377$WP_TREE_GET_GENDER_METHOD );
    classes.subloop_new_class( $sym379$VERBAL_WORD_TREE, $sym0$WORD_TREE, $list380, NIL, $list381 );
    classes.class_set_implements_slot_listeners( $sym379$VERBAL_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym127$PARTICLE_FILTER_LEXES, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list382 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym127$PARTICLE_FILTER_LEXES, $sym387$VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym47$PARTITION_SEMANTIC_COMPLEMENTS, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list388 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym47$PARTITION_SEMANTIC_COMPLEMENTS, $sym390$VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym379$VERBAL_WORD_TREE, $list8, $list391, $list392 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym403$VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym404$GET_CONTROLLER, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list405 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym404$GET_CONTROLLER, $sym410$VERBAL_WORD_TREE_GET_CONTROLLER_METHOD );
    methods.methods_incorporate_instance_method( $sym406$GET_CONTROL_VERB, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list411 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym406$GET_CONTROL_VERB, $sym414$VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD );
    methods.methods_incorporate_instance_method( $sym408$OBJECT_CONTROLLER_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list415 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym408$OBJECT_CONTROLLER_P, $sym417$VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym407$SUBJECT_CONTROLLER_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list418 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym407$SUBJECT_CONTROLLER_P, $sym420$VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym413$CONTROL_VERB_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list421 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym413$CONTROL_VERB_P, $sym422$VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD );
    methods.methods_incorporate_instance_method( $sym412$GET_MATRIX_CLAUSE, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list423 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym412$GET_MATRIX_CLAUSE, $sym424$VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD );
    classes.subloop_note_class_initialization_function( $sym379$VERBAL_WORD_TREE, $sym425$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym379$VERBAL_WORD_TREE, $sym426$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_verbal_word_tree_class( $sym379$VERBAL_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym427$GET_PREDICATE, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list428 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym427$GET_PREDICATE, $sym430$VERBAL_WORD_TREE_GET_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list431 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym238$GET_NUMBER, $sym433$VERBAL_WORD_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym285$GET_PERSON, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list434 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym285$GET_PERSON, $sym435$VERBAL_WORD_TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list437 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym436$GET_TENSE, $sym438$VERBAL_WORD_TREE_GET_TENSE_METHOD );
    methods.methods_incorporate_instance_method( $sym299$GET_SUBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list439 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym299$GET_SUBJECT, $sym442$VERBAL_WORD_TREE_GET_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym298$GET_OBJECTS, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list443 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym298$GET_OBJECTS, $sym448$VERBAL_WORD_TREE_GET_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym449$GET_MOVED_NPS, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list450 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym449$GET_MOVED_NPS, $sym452$VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD );
    methods.methods_incorporate_instance_method( $sym453$GET_MOVED_OBJECTS, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list454 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym453$GET_MOVED_OBJECTS, $sym455$VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym409$GET_DIRECT_OBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list456 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym409$GET_DIRECT_OBJECT, $sym458$VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym445$GET_INDIRECT_OBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list459 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym445$GET_INDIRECT_OBJECT, $sym461$VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym394$GET_SEMANTIC_DIRECT_OBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list462 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym394$GET_SEMANTIC_DIRECT_OBJECT, $sym463$VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym395$GET_SEMANTIC_INDIRECT_OBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list464 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym395$GET_SEMANTIC_INDIRECT_OBJECT, $sym465$VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym396$GET_VERBAL_COMPLEMENT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list466 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym396$GET_VERBAL_COMPLEMENT, $sym469$VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym470$GET_ADJECTIVAL_COMPLEMENT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list471 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym470$GET_ADJECTIVAL_COMPLEMENT, $sym474$VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list475 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym477$VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym384$GET_PARTICLE, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list478 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym384$GET_PARTICLE, $sym481$VERBAL_WORD_TREE_GET_PARTICLE_METHOD );
    methods.methods_incorporate_instance_method( $sym482$GET_INFINITIVE_MARKER, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list483 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym482$GET_INFINITIVE_MARKER, $sym485$VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD );
    methods.methods_incorporate_instance_method( $sym486$DUMMY_TO_P, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list487 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym486$DUMMY_TO_P, $sym489$VERBAL_WORD_TREE_DUMMY_TO_P_METHOD );
    methods.methods_incorporate_instance_method( $sym389$GET_SEMANTIC_SUBJECT, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list490 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym389$GET_SEMANTIC_SUBJECT, $sym491$VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym476$GET_SEMANTIC_OBJECTS, $sym379$VERBAL_WORD_TREE, $list60, NIL, $list492 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym476$GET_SEMANTIC_OBJECTS, $sym493$VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym494$GET_ANCESTOR_OBJECTS, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list495 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym494$GET_ANCESTOR_OBJECTS, $sym497$VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym498$INVERTED_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list499 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym498$INVERTED_P, $sym500$VERBAL_WORD_TREE_INVERTED_P_METHOD );
    methods.methods_incorporate_instance_method( $sym432$FINITE_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list501 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym432$FINITE_P, $sym502$VERBAL_WORD_TREE_FINITE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym503$PASSIVE_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list504 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym503$PASSIVE_P, $sym505$VERBAL_WORD_TREE_PASSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym506$INFINITIVE_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list507 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym506$INFINITIVE_P, $sym508$VERBAL_WORD_TREE_INFINITIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym509$BASE_P, $sym379$VERBAL_WORD_TREE, $list8, NIL, $list510 );
    methods.subloop_register_instance_method( $sym379$VERBAL_WORD_TREE, $sym509$BASE_P, $sym514$VERBAL_WORD_TREE_BASE_P_METHOD );
    classes.subloop_new_class( $sym515$VBZ_TREE, $sym379$VERBAL_WORD_TREE, $list516, NIL, $list517 );
    classes.class_set_implements_slot_listeners( $sym515$VBZ_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym515$VBZ_TREE, $sym518$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym515$VBZ_TREE, $sym519$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE );
    subloop_reserved_initialize_vbz_tree_class( $sym515$VBZ_TREE );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym515$VBZ_TREE, $list60, NIL, $list520 );
    methods.subloop_register_instance_method( $sym515$VBZ_TREE, $sym436$GET_TENSE, $sym522$VBZ_TREE_GET_TENSE_METHOD );
    classes.subloop_new_class( $sym523$VBN_TREE, $sym379$VERBAL_WORD_TREE, NIL, NIL, $list524 );
    classes.class_set_implements_slot_listeners( $sym523$VBN_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym523$VBN_TREE, $sym525$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym523$VBN_TREE, $sym526$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE );
    subloop_reserved_initialize_vbn_tree_class( $sym523$VBN_TREE );
    methods.methods_incorporate_instance_method( $sym527$GET_AUX_VERB, $sym523$VBN_TREE, $list8, NIL, $list528 );
    methods.subloop_register_instance_method( $sym523$VBN_TREE, $sym527$GET_AUX_VERB, $sym531$VBN_TREE_GET_AUX_VERB_METHOD );
    methods.methods_incorporate_instance_method( $sym389$GET_SEMANTIC_SUBJECT, $sym523$VBN_TREE, $list60, NIL, $list532 );
    methods.subloop_register_instance_method( $sym523$VBN_TREE, $sym389$GET_SEMANTIC_SUBJECT, $sym535$VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym394$GET_SEMANTIC_DIRECT_OBJECT, $sym523$VBN_TREE, $list60, NIL, $list536 );
    methods.subloop_register_instance_method( $sym523$VBN_TREE, $sym394$GET_SEMANTIC_DIRECT_OBJECT, $sym538$VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym395$GET_SEMANTIC_INDIRECT_OBJECT, $sym523$VBN_TREE, $list60, NIL, $list539 );
    methods.subloop_register_instance_method( $sym523$VBN_TREE, $sym395$GET_SEMANTIC_INDIRECT_OBJECT, $sym540$VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym503$PASSIVE_P, $sym523$VBN_TREE, $list8, NIL, $list542 );
    methods.subloop_register_instance_method( $sym523$VBN_TREE, $sym503$PASSIVE_P, $sym543$VBN_TREE_PASSIVE_P_METHOD );
    classes.subloop_new_class( $sym544$VBD_TREE, $sym379$VERBAL_WORD_TREE, $list516, NIL, $list517 );
    classes.class_set_implements_slot_listeners( $sym544$VBD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym544$VBD_TREE, $sym545$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym544$VBD_TREE, $sym546$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE );
    subloop_reserved_initialize_vbd_tree_class( $sym544$VBD_TREE );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym544$VBD_TREE, $list60, NIL, $list547 );
    methods.subloop_register_instance_method( $sym544$VBD_TREE, $sym436$GET_TENSE, $sym549$VBD_TREE_GET_TENSE_METHOD );
    classes.subloop_new_class( $sym550$VBP_TREE, $sym379$VERBAL_WORD_TREE, $list516, NIL, $list517 );
    classes.class_set_implements_slot_listeners( $sym550$VBP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym550$VBP_TREE, $sym551$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym550$VBP_TREE, $sym552$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE );
    subloop_reserved_initialize_vbp_tree_class( $sym550$VBP_TREE );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym550$VBP_TREE, $list60, NIL, $list520 );
    methods.subloop_register_instance_method( $sym550$VBP_TREE, $sym436$GET_TENSE, $sym553$VBP_TREE_GET_TENSE_METHOD );
    classes.subloop_new_class( $sym554$VB_TREE, $sym379$VERBAL_WORD_TREE, NIL, NIL, $list517 );
    classes.class_set_implements_slot_listeners( $sym554$VB_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym554$VB_TREE, $sym555$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym554$VB_TREE, $sym556$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE );
    subloop_reserved_initialize_vb_tree_class( $sym554$VB_TREE );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym554$VB_TREE, $list60, NIL, $list557 );
    methods.subloop_register_instance_method( $sym554$VB_TREE, $sym436$GET_TENSE, $sym559$VB_TREE_GET_TENSE_METHOD );
    classes.subloop_new_class( $sym560$VBG_TREE, $sym379$VERBAL_WORD_TREE, NIL, NIL, $list561 );
    classes.class_set_implements_slot_listeners( $sym560$VBG_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym560$VBG_TREE, $sym562$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym560$VBG_TREE, $sym563$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE );
    subloop_reserved_initialize_vbg_tree_class( $sym560$VBG_TREE );
    methods.methods_incorporate_instance_method( $sym527$GET_AUX_VERB, $sym560$VBG_TREE, $list8, NIL, $list528 );
    methods.subloop_register_instance_method( $sym560$VBG_TREE, $sym527$GET_AUX_VERB, $sym565$VBG_TREE_GET_AUX_VERB_METHOD );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym560$VBG_TREE, $list60, NIL, $list566 );
    methods.subloop_register_instance_method( $sym560$VBG_TREE, $sym146$GET_MODIFIEDS, $sym568$VBG_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym569$AUX_VERB_TREE, $sym379$VERBAL_WORD_TREE, $list570, NIL, $list571 );
    classes.class_set_implements_slot_listeners( $sym569$AUX_VERB_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym297$COPULA_P, $sym569$AUX_VERB_TREE, $list60, NIL, $list572 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym297$COPULA_P, $sym573$AUX_VERB_TREE_COPULA_P_METHOD );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym569$AUX_VERB_TREE, $list8, $list574, $list575 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym578$AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym58$GET_SEMANTIC_COMPLEMENTS, $sym569$AUX_VERB_TREE, $list8, NIL, $list579 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym58$GET_SEMANTIC_COMPLEMENTS, $sym580$AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym569$AUX_VERB_TREE, $list8, NIL, $list581 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym62$GET_COMPLEMENTS, $sym584$AUX_VERB_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym120$GET_SEMANTIC_HEADS, $sym569$AUX_VERB_TREE, $list60, NIL, $list585 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym120$GET_SEMANTIC_HEADS, $sym586$AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym569$AUX_VERB_TREE, $list60, NIL, $list587 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym436$GET_TENSE, $sym591$AUX_VERB_TREE_GET_TENSE_METHOD );
    classes.subloop_note_class_initialization_function( $sym569$AUX_VERB_TREE, $sym592$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym569$AUX_VERB_TREE, $sym593$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE );
    subloop_reserved_initialize_aux_verb_tree_class( $sym569$AUX_VERB_TREE );
    methods.methods_incorporate_instance_method( $sym582$GET_PREPOSITIONAL_COMPLEMENT, $sym569$AUX_VERB_TREE, $list8, NIL, $list594 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym582$GET_PREPOSITIONAL_COMPLEMENT, $sym596$AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym583$GET_ADVERBIAL_COMPLEMENT, $sym569$AUX_VERB_TREE, $list8, NIL, $list597 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym583$GET_ADVERBIAL_COMPLEMENT, $sym598$AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym299$GET_SUBJECT, $sym569$AUX_VERB_TREE, $list60, NIL, $list599 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym299$GET_SUBJECT, $sym601$AUX_VERB_TREE_GET_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym409$GET_DIRECT_OBJECT, $sym569$AUX_VERB_TREE, $list60, NIL, $list602 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym409$GET_DIRECT_OBJECT, $sym604$AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym445$GET_INDIRECT_OBJECT, $sym569$AUX_VERB_TREE, $list60, NIL, $list605 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym445$GET_INDIRECT_OBJECT, $sym606$AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym389$GET_SEMANTIC_SUBJECT, $sym569$AUX_VERB_TREE, $list60, NIL, $list607 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym389$GET_SEMANTIC_SUBJECT, $sym608$AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym498$INVERTED_P, $sym569$AUX_VERB_TREE, $list8, NIL, $list609 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym498$INVERTED_P, $sym610$AUX_VERB_TREE_INVERTED_P_METHOD );
    methods.methods_incorporate_instance_method( $sym503$PASSIVE_P, $sym569$AUX_VERB_TREE, $list8, NIL, $list611 );
    methods.subloop_register_instance_method( $sym569$AUX_VERB_TREE, $sym503$PASSIVE_P, $sym612$AUX_VERB_TREE_PASSIVE_P_METHOD );
    classes.subloop_new_class( $sym613$MODAL_VERB_TREE, $sym569$AUX_VERB_TREE, $list516, NIL, $list614 );
    classes.class_set_implements_slot_listeners( $sym613$MODAL_VERB_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym613$MODAL_VERB_TREE, $sym615$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym613$MODAL_VERB_TREE, $sym616$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE );
    subloop_reserved_initialize_modal_verb_tree_class( $sym613$MODAL_VERB_TREE );
    methods.methods_incorporate_instance_method( $sym436$GET_TENSE, $sym613$MODAL_VERB_TREE, $list60, NIL, $list617 );
    methods.subloop_register_instance_method( $sym613$MODAL_VERB_TREE, $sym436$GET_TENSE, $sym621$MODAL_VERB_TREE_GET_TENSE_METHOD );
    methods.methods_incorporate_instance_method( $sym298$GET_OBJECTS, $sym613$MODAL_VERB_TREE, $list60, NIL, $list622 );
    methods.subloop_register_instance_method( $sym613$MODAL_VERB_TREE, $sym298$GET_OBJECTS, $sym623$MODAL_VERB_TREE_GET_OBJECTS_METHOD );
    classes.subloop_new_class( $sym624$ADJECTIVAL_WORD_TREE, $sym171$MODIFIER_WORD_TREE, $list625, NIL, $list626 );
    classes.class_set_implements_slot_listeners( $sym624$ADJECTIVAL_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym624$ADJECTIVAL_WORD_TREE, $list8, $list627, $list628 );
    methods.subloop_register_instance_method( $sym624$ADJECTIVAL_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym630$ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym624$ADJECTIVAL_WORD_TREE, $list60, NIL, $list631 );
    methods.subloop_register_instance_method( $sym624$ADJECTIVAL_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym632$ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD );
    classes.subloop_note_class_initialization_function( $sym624$ADJECTIVAL_WORD_TREE, $sym633$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym624$ADJECTIVAL_WORD_TREE, $sym634$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_adjectival_word_tree_class( $sym624$ADJECTIVAL_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym624$ADJECTIVAL_WORD_TREE, $list60, NIL, $list635 );
    methods.subloop_register_instance_method( $sym624$ADJECTIVAL_WORD_TREE, $sym146$GET_MODIFIEDS, $sym638$ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD );
    methods.methods_incorporate_instance_method( $sym396$GET_VERBAL_COMPLEMENT, $sym624$ADJECTIVAL_WORD_TREE, $list60, NIL, $list639 );
    methods.subloop_register_instance_method( $sym624$ADJECTIVAL_WORD_TREE, $sym396$GET_VERBAL_COMPLEMENT, $sym642$ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD );
    classes.subloop_new_class( $sym643$ADVERBIAL_WORD_TREE, $sym171$MODIFIER_WORD_TREE, $list644, NIL, $list645 );
    classes.class_set_implements_slot_listeners( $sym643$ADVERBIAL_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym643$ADVERBIAL_WORD_TREE, $list8, $list646, $list647 );
    methods.subloop_register_instance_method( $sym643$ADVERBIAL_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym649$ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    classes.subloop_note_class_initialization_function( $sym643$ADVERBIAL_WORD_TREE, $sym650$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym643$ADVERBIAL_WORD_TREE, $sym651$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_adverbial_word_tree_class( $sym643$ADVERBIAL_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym643$ADVERBIAL_WORD_TREE, $list60, NIL, $list652 );
    methods.subloop_register_instance_method( $sym643$ADVERBIAL_WORD_TREE, $sym146$GET_MODIFIEDS, $sym653$ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym654$WRB_WORD_TREE, $sym643$ADVERBIAL_WORD_TREE, $list655, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym654$WRB_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym654$WRB_WORD_TREE, $sym656$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym654$WRB_WORD_TREE, $sym657$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_wrb_word_tree_class( $sym654$WRB_WORD_TREE );
    classes.subloop_new_class( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym168$FUNCTION_WORD_TREE, $list659, NIL, $list660 );
    classes.class_set_implements_slot_listeners( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list8, $list661, $list662 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym664$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    classes.subloop_note_class_initialization_function( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C );
    classes.subloop_note_instance_initialization_function( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I );
    subloop_reserved_initialize_prepositional_or_particle_word_tree_class( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym64$GET_OBLIQUE_OBJECT, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list667 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym64$GET_OBLIQUE_OBJECT, $sym668$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym396$GET_VERBAL_COMPLEMENT, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list669 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym396$GET_VERBAL_COMPLEMENT, $sym672$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list673 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym674$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list675 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym146$GET_MODIFIEDS, $sym678$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD );
    methods.methods_incorporate_instance_method( $sym100$GET_REFS, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list679 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym100$GET_REFS, $sym681$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym278$GET_ANTECEDENT, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list682 );
    methods.subloop_register_instance_method( $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym278$GET_ANTECEDENT, $sym684$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD );
    classes.subloop_new_class( $sym685$PREPOSITIONAL_WORD_TREE, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list686, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym685$PREPOSITIONAL_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym685$PREPOSITIONAL_WORD_TREE, $sym687$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym685$PREPOSITIONAL_WORD_TREE, $sym688$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_prepositional_word_tree_class( $sym685$PREPOSITIONAL_WORD_TREE );
    classes.subloop_new_class( $sym689$PARTICLE_WORD_TREE, $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list690, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym689$PARTICLE_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym689$PARTICLE_WORD_TREE, $sym691$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym689$PARTICLE_WORD_TREE, $sym692$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_particle_word_tree_class( $sym689$PARTICLE_WORD_TREE );
    classes.subloop_new_class( $sym693$SPECIFIER_WORD_TREE, $sym0$WORD_TREE, NIL, NIL, $list694 );
    classes.class_set_implements_slot_listeners( $sym693$SPECIFIER_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym693$SPECIFIER_WORD_TREE, $sym695$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym693$SPECIFIER_WORD_TREE, $sym696$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_specifier_word_tree_class( $sym693$SPECIFIER_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym697$GET_SPECIFIED, $sym693$SPECIFIER_WORD_TREE, $list60, NIL, $list698 );
    methods.subloop_register_instance_method( $sym693$SPECIFIER_WORD_TREE, $sym697$GET_SPECIFIED, $sym700$SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD );
    classes.subloop_new_class( $sym701$QUANTIFIER_WORD_TREE, $sym693$SPECIFIER_WORD_TREE, $list702, NIL, $list703 );
    classes.class_set_implements_slot_listeners( $sym701$QUANTIFIER_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym701$QUANTIFIER_WORD_TREE, $list8, $list704, $list705 );
    methods.subloop_register_instance_method( $sym701$QUANTIFIER_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym707$QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    classes.subloop_note_class_initialization_function( $sym701$QUANTIFIER_WORD_TREE, $sym708$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym701$QUANTIFIER_WORD_TREE, $sym709$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_quantifier_word_tree_class( $sym701$QUANTIFIER_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym710$GET_QUANTIFIED, $sym701$QUANTIFIER_WORD_TREE, $list60, NIL, $list711 );
    methods.subloop_register_instance_method( $sym701$QUANTIFIER_WORD_TREE, $sym710$GET_QUANTIFIED, $sym713$QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD );
    methods.methods_incorporate_instance_method( $sym697$GET_SPECIFIED, $sym701$QUANTIFIER_WORD_TREE, $list60, NIL, $list714 );
    methods.subloop_register_instance_method( $sym701$QUANTIFIER_WORD_TREE, $sym697$GET_SPECIFIED, $sym715$QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD );
    classes.subloop_new_class( $sym716$DETERMINER_WORD_TREE, $sym701$QUANTIFIER_WORD_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym716$DETERMINER_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym716$DETERMINER_WORD_TREE, $sym717$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym716$DETERMINER_WORD_TREE, $sym718$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_determiner_word_tree_class( $sym716$DETERMINER_WORD_TREE );
    classes.subloop_new_class( $sym719$PRP__TREE, $sym693$SPECIFIER_WORD_TREE, $list338, NIL, $list339 );
    classes.class_set_implements_slot_listeners( $sym719$PRP__TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym719$PRP__TREE, $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym719$PRP__TREE, $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE );
    subloop_reserved_initialize_prpX_tree_class( $sym719$PRP__TREE );
    methods.methods_incorporate_instance_method( $sym238$GET_NUMBER, $sym719$PRP__TREE, $list60, NIL, $list724 );
    methods.subloop_register_instance_method( $sym719$PRP__TREE, $sym238$GET_NUMBER, $sym726$PRP__TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym285$GET_PERSON, $sym719$PRP__TREE, $list60, NIL, $list727 );
    methods.subloop_register_instance_method( $sym719$PRP__TREE, $sym285$GET_PERSON, $sym732$PRP__TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym281$GET_GENDER, $sym719$PRP__TREE, $list60, NIL, $list733 );
    methods.subloop_register_instance_method( $sym719$PRP__TREE, $sym281$GET_GENDER, $sym736$PRP__TREE_GET_GENDER_METHOD );
    classes.subloop_new_class( $sym737$WDT_WORD_TREE, $sym716$DETERMINER_WORD_TREE, $list655, NIL, $list738 );
    classes.class_set_implements_slot_listeners( $sym737$WDT_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym737$WDT_WORD_TREE, $sym739$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym737$WDT_WORD_TREE, $sym740$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_wdt_word_tree_class( $sym737$WDT_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym100$GET_REFS, $sym737$WDT_WORD_TREE, $list60, NIL, $list364 );
    methods.subloop_register_instance_method( $sym737$WDT_WORD_TREE, $sym100$GET_REFS, $sym742$WDT_WORD_TREE_GET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym278$GET_ANTECEDENT, $sym737$WDT_WORD_TREE, $list60, NIL, $list367 );
    methods.subloop_register_instance_method( $sym737$WDT_WORD_TREE, $sym278$GET_ANTECEDENT, $sym744$WDT_WORD_TREE_GET_ANTECEDENT_METHOD );
    classes.subloop_new_class( $sym745$POSSESSIVE_WORD_TREE, $sym168$FUNCTION_WORD_TREE, $list746, NIL, $list747 );
    classes.class_set_implements_slot_listeners( $sym745$POSSESSIVE_WORD_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym42$GET_KEYWORD_RENAMINGS, $sym745$POSSESSIVE_WORD_TREE, $list8, $list748, $list749 );
    methods.subloop_register_instance_method( $sym745$POSSESSIVE_WORD_TREE, $sym42$GET_KEYWORD_RENAMINGS, $sym753$POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD );
    classes.subloop_note_class_initialization_function( $sym745$POSSESSIVE_WORD_TREE, $sym754$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym745$POSSESSIVE_WORD_TREE, $sym755$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_possessive_word_tree_class( $sym745$POSSESSIVE_WORD_TREE );
    methods.methods_incorporate_instance_method( $sym227$GET_POSSESSOR, $sym745$POSSESSIVE_WORD_TREE, $list60, NIL, $list756 );
    methods.subloop_register_instance_method( $sym745$POSSESSIVE_WORD_TREE, $sym227$GET_POSSESSOR, $sym757$POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD );
    methods.methods_incorporate_instance_method( $sym751$GET_POSSESSED, $sym745$POSSESSIVE_WORD_TREE, $list60, NIL, $list758 );
    methods.subloop_register_instance_method( $sym745$POSSESSIVE_WORD_TREE, $sym751$GET_POSSESSED, $sym760$POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD );
    methods.methods_incorporate_instance_method( $sym62$GET_COMPLEMENTS, $sym745$POSSESSIVE_WORD_TREE, $list60, NIL, $list761 );
    methods.subloop_register_instance_method( $sym745$POSSESSIVE_WORD_TREE, $sym62$GET_COMPLEMENTS, $sym762$POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym146$GET_MODIFIEDS, $sym745$POSSESSIVE_WORD_TREE, $list60, NIL, $list763 );
    methods.subloop_register_instance_method( $sym745$POSSESSIVE_WORD_TREE, $sym146$GET_MODIFIEDS, $sym765$POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym766$CARDINAL_WORD_TREE, $sym701$QUANTIFIER_WORD_TREE, $list767, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym766$CARDINAL_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym766$CARDINAL_WORD_TREE, $sym768$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym766$CARDINAL_WORD_TREE, $sym769$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_cardinal_word_tree_class( $sym766$CARDINAL_WORD_TREE );
    classes.subloop_new_class( $sym770$EXISTENTIAL_WORD_TREE, $sym168$FUNCTION_WORD_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym770$EXISTENTIAL_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym770$EXISTENTIAL_WORD_TREE, $sym771$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym770$EXISTENTIAL_WORD_TREE, $sym772$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_existential_word_tree_class( $sym770$EXISTENTIAL_WORD_TREE );
    classes.subloop_new_class( $sym773$PUNCTUATION_WORD_TREE, $sym0$WORD_TREE, $list774, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym773$PUNCTUATION_WORD_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym773$PUNCTUATION_WORD_TREE, $sym775$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym773$PUNCTUATION_WORD_TREE, $sym776$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE );
    subloop_reserved_initialize_punctuation_word_tree_class( $sym773$PUNCTUATION_WORD_TREE );
    classes.subloop_new_class( $sym778$MULTI_NOUN_TREE, $sym199$NOMINAL_WORD_TREE, NIL, NIL, $list779 );
    classes.class_set_implements_slot_listeners( $sym778$MULTI_NOUN_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym778$MULTI_NOUN_TREE, $sym780$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym778$MULTI_NOUN_TREE, $sym781$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE );
    subloop_reserved_initialize_multi_noun_tree_class( $sym778$MULTI_NOUN_TREE );
    methods.methods_incorporate_instance_method( $sym783$COVERS, $sym1$PARSE_TREE, $list60, $list784, $list785 );
    methods.subloop_register_instance_method( $sym1$PARSE_TREE, $sym783$COVERS, $sym786$PARSE_TREE_COVERS_METHOD );
    methods.methods_incorporate_instance_method( $sym787$COVERS_MINIMALLY, $sym1$PARSE_TREE, $list8, $list784, $list788 );
    methods.subloop_register_instance_method( $sym1$PARSE_TREE, $sym787$COVERS_MINIMALLY, $sym790$PARSE_TREE_COVERS_MINIMALLY_METHOD );
    methods.methods_incorporate_instance_method( $sym791$GET_MINIMALLY_COVERING_SUBTREES, $sym1$PARSE_TREE, $list60, $list784, $list792 );
    methods.subloop_register_instance_method( $sym1$PARSE_TREE, $sym791$GET_MINIMALLY_COVERING_SUBTREES, $sym793$PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_word_tree_file();
  }

  @Override
  public void initializeVariables()
  {
    init_word_tree_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_word_tree_file();
  }
  static
  {
    me = new word_tree();
    $singular_personal_pronouns$ = null;
    $plural_personal_pronouns$ = null;
    $to_be_forms$ = null;
    $singular_possessive_pronouns$ = null;
    $plural_possessive_pronouns$ = null;
    $category_to_word$ = null;
    $sym0$WORD_TREE = makeSymbol( "WORD-TREE" );
    $sym1$PARSE_TREE = makeSymbol( "PARSE-TREE" );
    $list2 = ConsesLow.list( makeSymbol( "CYCLIFIABLE-WORD" ) );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LEXES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "REFS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ABS-IDX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STRING" ),
            NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ABS-INDEX" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "GET-LEXES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RANKED-LEXES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REFS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-REFS" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "YIELD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-PARSE-EXPRESSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEADS" ), NIL,
                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PP-COMPLEMENT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OBLIQUE-OBJECT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ),
          NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword(
              "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TEMPORAL-TREE-P" ), NIL, makeKeyword(
                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RELATIVE-PRONOUN-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                          makeSymbol( "GET-PPS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                              .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword(
                                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                      makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-NUCLEUS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                          "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-INT" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TREE-KEYWORD-EQ-CLASSES" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "POS-FILTER-LEXES" ), NIL, makeKeyword( "PROTECTED" ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "FRAME-FILTER-LEXES" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "PP-COMP-FILTER-LEXES" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MODIFIED-DEPENDENT-MEANING-P" ),
                      NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RETOKENIZE" ), ConsesLow.list( makeSymbol( "LEXICON" ) ),
                          makeKeyword( "PROTECTED" ) )
    } );
    $sym4$ABS_IDX = makeSymbol( "ABS-IDX" );
    $sym5$REFS = makeSymbol( "REFS" );
    $sym6$LEXES = makeSymbol( "LEXES" );
    $sym7$MODIFIED_DEPENDENT_MEANING_P = makeSymbol( "MODIFIED-DEPENDENT-MEANING-P" );
    $list8 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ),
            ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                .list( makeSymbol( "MEMBER?" ), makeKeyword( "REPLACE" ), ConsesLow.list( makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), NIL ) ) );
    $sym10$GET = makeSymbol( "GET" );
    $kw11$SEMTRANS = makeKeyword( "SEMTRANS" );
    $kw12$REPLACE = makeKeyword( "REPLACE" );
    $sym13$GET_RANKED_LEXES = makeSymbol( "GET-RANKED-LEXES" );
    $sym14$WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD = makeSymbol( "WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD" );
    $sym15$PP_COMP_FILTER_LEXES = makeSymbol( "PP-COMP-FILTER-LEXES" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PP-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PP-HEAD" ),
                ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ),
                    ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                        .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles
                            .reader_make_constant_shell( makeString( "PPCompFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                .list( ConsesLow.list( makeSymbol( "PREPOSITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PREP-STRING" ), ConsesLow.list(
                                    makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), makeSymbol( "PREPOSITION" ), constant_handles.reader_make_constant_shell( makeString(
                                        "Preposition" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "PREP-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP-HEAD" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list(
                                                makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym18$GET_PP_COMPLEMENT = makeSymbol( "GET-PP-COMPLEMENT" );
    $sym19$GET_HEAD = makeSymbol( "GET-HEAD" );
    $kw20$FRAME = makeKeyword( "FRAME" );
    $const21$PPCompFrame = constant_handles.reader_make_constant_shell( makeString( "PPCompFrame" ) );
    $const22$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const23$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $sym24$GET_STRING = makeSymbol( "GET-STRING" );
    $sym25$WORD_TREE_PP_COMP_FILTER_LEXES_METHOD = makeSymbol( "WORD-TREE-PP-COMP-FILTER-LEXES-METHOD" );
    $sym26$FRAME_FILTER_LEXES = makeSymbol( "FRAME-FILTER-LEXES" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "TREE-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TREE-KEYWORD-EQ-CLASSES" ) ) ) ), ConsesLow.list( makeSymbol( "LEX-SCORES" ), NIL ), ConsesLow.list( makeSymbol( "MAX-SCORE" ),
            makeInteger( -5 ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-SCORE" ), ConsesLow.list( makeSymbol( "LEX-ENTRY-SCORE" ), ConsesLow.list(
                    makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), makeSymbol( "TREE-KEYWORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), makeSymbol( "LEX-SCORE" ) ), ConsesLow
                        .list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "LEX-SCORES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "LEX-SCORE" ), makeSymbol(
                            "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX-SCORE" ), makeSymbol( "LEX-SCORE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                "RLE" ), makeSymbol( "LEX-SCORES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "RLE-CONFIDENCE" ), makeSymbol( "RLE" ) ),
                                    makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ),
                                        makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym29$TREE_KEYWORD_EQ_CLASSES = makeSymbol( "TREE-KEYWORD-EQ-CLASSES" );
    $int30$_5 = makeInteger( -5 );
    $sym31$WORD_TREE_FRAME_FILTER_LEXES_METHOD = makeSymbol( "WORD-TREE-FRAME-FILTER-LEXES-METHOD" );
    $sym32$POS_FILTER_LEXES = makeSymbol( "POS-FILTER-LEXES" );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ),
        makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                makeKeyword( "PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol(
                    "FILTERED" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                            makeKeyword( "BACKOFF-PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), makeDouble( 0.75 ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "LEXES" ) ) ) );
    $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym35$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw36$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $kw37$BACKOFF_PENN_TAGS = makeKeyword( "BACKOFF-PENN-TAGS" );
    $float38$0_75 = makeDouble( 0.75 );
    $sym39$WORD_TREE_POS_FILTER_LEXES_METHOD = makeSymbol( "WORD-TREE-POS-FILTER-LEXES-METHOD" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "KEYWORD-EQ-CLASSES" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CAR" ) ),
        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-KEYWORD-RENAMINGS" ) ) ) ) ) ) ) ) );
    $sym41$CAR = makeSymbol( "CAR" );
    $sym42$GET_KEYWORD_RENAMINGS = makeSymbol( "GET-KEYWORD-RENAMINGS" );
    $sym43$WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD = makeSymbol( "WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD" );
    $sym44$CYCLIFY_NUCLEUS = makeSymbol( "CYCLIFY-NUCLEUS" );
    $list45 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "RENAMINGS" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NDISTR-COMP-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "DISTR-COMP-CYCLS" ), NIL ), ConsesLow.list(
        makeSymbol( "MOD-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
            "RENAMINGS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-RANKED-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "GROUP-DISJUNCTIVE-RENAMINGS" ), makeSymbol( "RENAMINGS" ) ) ),
            ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NON-DISTRIBUTING" ), makeSymbol( "DISTRIBUTING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol( "NON-DISTRIBUTING" ) ),
                    ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                            "NDISTR-COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol( "DISTRIBUTING" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                                        "DISTR-COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOD-CYCL" ),
                                                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                    "PWHEN" ), makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MOD-CYCL" ), makeSymbol( "MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                        "CDOLIST" ), ConsesLow.list( makeSymbol( "CONJUNCTION" ), makeSymbol( "RENAMINGS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ),
                                                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list(
                                                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MY-CYCLS0" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                                    makeSymbol( "GROUPING" ), makeSymbol( "CONJUNCTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                        "THIS-AND-MODS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "GROUPING" ) ), ConsesLow
                                                                            .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol(
                                                                                    "LIST" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "SELF" ), makeSymbol( "RLE" ), makeSymbol( "RENAMING" ) ) ),
                                                                                    makeSymbol( "MOD-CYCLS" ) ) ) ), makeSymbol( "THIS-AND-MODS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                                                        "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                            "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                                                                                                "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                    "THIS-AND-MODS" ) ) ), makeSymbol( "NDISTR-COMP-CYCLS" ) ) ) ), makeSymbol( "MY-CYCLS0" ) ) ) ), ConsesLow.list(
                                                                                                        makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "CYCLS" ),
                                                                                                            ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                                    "MY-CYCLS0" ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                                                                        "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow
                                                                                                                            .list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol(
                                                                                                                                "CYCLS" ), makeSymbol( "DISTR-COMP-CYCLS" ) ) ) ) ) ) );
    $sym47$PARTITION_SEMANTIC_COMPLEMENTS = makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" );
    $sym48$CYCLIFY_INT = makeSymbol( "CYCLIFY-INT" );
    $sym49$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $sym50$INSTANTIATE_SCOPE = makeSymbol( "INSTANTIATE-SCOPE" );
    $sym51$WORD_TREE_CYCLIFY_NUCLEUS_METHOD = makeSymbol( "WORD-TREE-CYCLIFY-NUCLEUS-METHOD" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ) ) ) ) );
    $sym53$WORD_TREE_CYCLIFY_INT_METHOD = makeSymbol( "WORD-TREE-CYCLIFY-INT-METHOD" );
    $list54 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym56$WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-SEMANTIC-COMPLEMENTS" ) ) ), NIL ) ) );
    $sym58$GET_SEMANTIC_COMPLEMENTS = makeSymbol( "GET-SEMANTIC-COMPLEMENTS" );
    $sym59$WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol( "WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD" );
    $list60 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) );
    $sym62$GET_COMPLEMENTS = makeSymbol( "GET-COMPLEMENTS" );
    $sym63$WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol( "WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD" );
    $sym64$GET_OBLIQUE_OBJECT = makeSymbol( "GET-OBLIQUE-OBJECT" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-PP-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBL-OBJ" ) ) ) );
    $sym66$WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol( "WORD-TREE-GET-OBLIQUE-OBJECT-METHOD" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-PPS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PP-HEAD-STRING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP-HEAD" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "PP-HEAD-STRING" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
                            "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "CYCL" ) ) ), ConsesLow.list( makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol(
                                    "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                                        makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
                                            .list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                makeString( "PPCompFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                    ConsesLow.list( makeSymbol( "PREPOSITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PREP-STRING" ),
                                                        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), makeSymbol( "PREPOSITION" ), constant_handles
                                                            .reader_make_constant_shell( makeString( "Preposition" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "PREP-STRING" ),
                                                                makeSymbol( "PP-HEAD-STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PP" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ),
                                                                    ConsesLow.list( makeSymbol( "INTERSECTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword(
                                                                        "POSS-COL" ) ) ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( EQUALP, makeString( "of" ), makeSymbol(
                                                                            "PP-HEAD-STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PP" ) ) ) ) ) ) ) ) ) );
    $kw68$OBLIQUE_OBJECT = makeKeyword( "OBLIQUE-OBJECT" );
    $list69 = ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSS-COL" ) );
    $str70$of = makeString( "of" );
    $sym71$GET_PPS = makeSymbol( "GET-PPS" );
    $sym72$WORD_TREE_GET_PP_COMPLEMENT_METHOD = makeSymbol( "WORD-TREE-GET-PP-COMPLEMENT-METHOD" );
    $sym73$OBJECT = makeSymbol( "OBJECT" );
    $sym74$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym75$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS" );
    $sym76$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym77$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym78$STRING = makeSymbol( "STRING" );
    $sym79$CATEGORY = makeSymbol( "CATEGORY" );
    $sym80$MOTHER = makeSymbol( "MOTHER" );
    $sym81$IDX = makeSymbol( "IDX" );
    $sym82$MODIFIERS = makeSymbol( "MODIFIERS" );
    $sym83$CONTEXT = makeSymbol( "CONTEXT" );
    $sym84$SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE" );
    $sym85$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $sym86$NEW_VARIABLE = makeSymbol( "NEW-VARIABLE" );
    $list87 = ConsesLow.list( makeString( "@return stringp; the string of this word-tree" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STRING" ) ) );
    $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym89$WORD_TREE_GET_STRING_METHOD = makeSymbol( "WORD-TREE-GET-STRING-METHOD" );
    $sym90$GET_ABS_INDEX = makeSymbol( "GET-ABS-INDEX" );
    $list91 = ConsesLow.list( makeString( "@return non-negative-integer-p; the absolute index of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ABS-IDX" ) ) );
    $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym93$WORD_TREE_GET_ABS_INDEX_METHOD = makeSymbol( "WORD-TREE-GET-ABS-INDEX-METHOD" );
    $sym94$GET_LEXES = makeSymbol( "GET-LEXES" );
    $list95 = ConsesLow.list( makeString( "@return listp; the list of lexical entries of this word" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "CAR" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ) ) );
    $sym96$WORD_TREE_GET_LEXES_METHOD = makeSymbol( "WORD-TREE-GET-LEXES-METHOD" );
    $list97 = ConsesLow.list( makeString( "@return listp; the list of ranked lexical entries of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) );
    $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym99$WORD_TREE_GET_RANKED_LEXES_METHOD = makeSymbol( "WORD-TREE-GET-RANKED-LEXES-METHOD" );
    $sym100$GET_REFS = makeSymbol( "GET-REFS" );
    $list101 = ConsesLow.list( makeKeyword( "READ-ONLY" ), makeKeyword( "PUBLIC" ) );
    $list102 = ConsesLow.list( makeString( "@return listp; the unique referent of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "REFS" ) ) );
    $sym103$WORD_TREE_GET_REFS_METHOD = makeSymbol( "WORD-TREE-GET-REFS-METHOD" );
    $sym104$SET_REFS = makeSymbol( "SET-REFS" );
    $list105 = ConsesLow.list( makeSymbol( "REFERENTS" ) );
    $list106 = ConsesLow.list( makeString( "@param REFS listp; a list of referents\n   @return word-tree; this word tree with its referents updated to REFERENTS" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REFS" ) ), makeSymbol( "REFERENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym108$WORD_TREE_SET_REFS_METHOD = makeSymbol( "WORD-TREE-SET-REFS-METHOD" );
    $sym109$YIELD = makeSymbol( "YIELD" );
    $list110 = ConsesLow.list( makeString( "@return listp; the yield of this word tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) );
    $sym111$WORD_TREE_YIELD_METHOD = makeSymbol( "WORD-TREE-YIELD-METHOD" );
    $sym112$GET_PARSE_EXPRESSION = makeSymbol( "GET-PARSE-EXPRESSION" );
    $list113 = ConsesLow.list( makeString( "@return listp; the parse expression of this word tree\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) );
    $sym114$WORD_TREE_GET_PARSE_EXPRESSION_METHOD = makeSymbol( "WORD-TREE-GET-PARSE-EXPRESSION-METHOD" );
    $sym115$GET_HEADS = makeSymbol( "GET-HEADS" );
    $list116 = ConsesLow.list( makeString( "@return listp; a list containing the head of this word" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) );
    $sym117$WORD_TREE_GET_HEADS_METHOD = makeSymbol( "WORD-TREE-GET-HEADS-METHOD" );
    $list118 = ConsesLow.list( makeString( "@return word-tree-p; the head of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym119$WORD_TREE_GET_HEAD_METHOD = makeSymbol( "WORD-TREE-GET-HEAD-METHOD" );
    $sym120$GET_SEMANTIC_HEADS = makeSymbol( "GET-SEMANTIC-HEADS" );
    $list121 = ConsesLow.list( makeString( "@return listp; a list containing the semantic head of this word" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) );
    $sym122$WORD_TREE_GET_SEMANTIC_HEADS_METHOD = makeSymbol( "WORD-TREE-GET-SEMANTIC-HEADS-METHOD" );
    $sym123$LEXIFY_INT = makeSymbol( "LEXIFY-INT" );
    $list124 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PROTECTED" ) );
    $list125 = ConsesLow.list( makeSymbol( "LEXICON" ) );
    $list126 = ConsesLow.list( makeString( "@return parse-tree-p; a version of this word-tree with lexical entries" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "NEW-EVEN-LEX-ENTRY-DISTRIBUTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS-FILTER-LEXES" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "SEMTRANS-LEXICON-P" ), makeSymbol( "LEXICON" ) ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PP-COMP-FILTER-LEXES" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                        makeSymbol( "VERBAL-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "PARTICLE-FILTER-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FRAME-FILTER-LEXES" ) ) ), ConsesLow.list(
                                makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "REMOVE-DUPLICATES" ), ConsesLow.list(
                                    makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "RLE-SEM-EQUAL" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow
                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ) ), ConsesLow.list( makeSymbol( "TERM-LEXICON-P" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FABRICATION-FORBIDDEN?" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                    ConsesLow.list( makeSymbol( "FABRICATED-LEXES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                        "FABRICATE" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING" ) ) ), ConsesLow.list(
                                                            makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CAR" ) ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                                "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                    "GET-KEYWORD-RENAMINGS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "CATEGORY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "FABRICATED-LEXES" ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                                                                            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                                                                makeSymbol( "QUOTE" ), makeSymbol( "NEW-RANKED-LEX-ENTRY" ) ), makeSymbol( "FABRICATED-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                        "LEXES" ) ) ) ) );
    $sym127$PARTICLE_FILTER_LEXES = makeSymbol( "PARTICLE-FILTER-LEXES" );
    $sym128$RLE_SEM_EQUAL = makeSymbol( "RLE-SEM-EQUAL" );
    $sym129$FABRICATION_FORBIDDEN_ = makeSymbol( "FABRICATION-FORBIDDEN?" );
    $sym130$FABRICATE = makeSymbol( "FABRICATE" );
    $sym131$NEW_RANKED_LEX_ENTRY = makeSymbol( "NEW-RANKED-LEX-ENTRY" );
    $sym132$WORD_TREE_LEXIFY_INT_METHOD = makeSymbol( "WORD-TREE-LEXIFY-INT-METHOD" );
    $list133 = ConsesLow.list( makeString( "@return listp; pps related to this word, either as an adjunct\n   or as a complement" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PPS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PREPOSITIONAL-TREE-P" ) ),
            ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PPS" ) ) ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "MOTHER" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WHPP-TREE-P" ) ) ) ), ConsesLow.list( makeSymbol( "UNTIL" ),
                        ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ROOT-P" ) ) ) ), ConsesLow
                            .list( makeSymbol( "CSETQ" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ),
                        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow
                            .list( makeSymbol( "QUOTE" ), makeSymbol( "WHPP-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                "PPS" ) ) ) ) ) );
    $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym135$FIND = makeSymbol( "FIND" );
    $sym136$PREPOSITIONAL_TREE_P = makeSymbol( "PREPOSITIONAL-TREE-P" );
    $sym137$WHPP_TREE_P = makeSymbol( "WHPP-TREE-P" );
    $sym138$ROOT_P = makeSymbol( "ROOT-P" );
    $sym139$GET_MOTHER = makeSymbol( "GET-MOTHER" );
    $sym140$WORD_TREE_GET_PPS_METHOD = makeSymbol( "WORD-TREE-GET-PPS-METHOD" );
    $list141 = ConsesLow.list( makeString( "@return listp; a list of complements of this word" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym142$WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $list143 = ConsesLow.list( makeString( "@return listp; a list of all modifiers of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MODIFIERS" ) ) );
    $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym145$WORD_TREE_GET_MODIFIERS_METHOD = makeSymbol( "WORD-TREE-GET-MODIFIERS-METHOD" );
    $sym146$GET_MODIFIEDS = makeSymbol( "GET-MODIFIEDS" );
    $list147 = ConsesLow.list( makeString( "@return listp; a list of phrases that this word modifies" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym148$WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "WORD-TREE-GET-MODIFIEDS-METHOD" );
    $sym149$TEMPORAL_TREE_P = makeSymbol( "TEMPORAL-TREE-P" );
    $list150 = ConsesLow.list( makeString( "@return booleanp; t if this tree is temporal, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENS" ), ConsesLow.list(
        makeSymbol( "SPLIT-STRING" ), makeSymbol( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "<" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "TOKENS" ) ), TWO_INTEGER ),
            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEXES" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-TERM-LEXICON" ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                            makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "EL-FORT-P" ), makeSymbol( "DENOT" ) ), ConsesLow.list( makeSymbol( "MORE-SPECIFIC-P" ), makeSymbol( "DENOT" ), constant_handles
                                .reader_make_constant_shell( makeString( "Date" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                    "PARSE-TREE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-STANFORD-PARSER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), makeSymbol(
                                        "STRING" ) ) ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                            "PARSE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list(
                                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEMPORAL-TREE-P" ) ) ) ) ) ) ) ) );
    $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $kw152$DENOT = makeKeyword( "DENOT" );
    $const153$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
    $sym154$PARSE = makeSymbol( "PARSE" );
    $sym155$WORD_TREE_TEMPORAL_TREE_P_METHOD = makeSymbol( "WORD-TREE-TEMPORAL-TREE-P-METHOD" );
    $sym156$RELATIVE_PRONOUN_P = makeSymbol( "RELATIVE-PRONOUN-P" );
    $list157 = ConsesLow.list( makeString( "@return boolean; t if this word is a relative pronoun, nil otherwise" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list(
        makeSymbol( "WDT-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "WP-TREE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ),
            ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIRST-WORD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ZERO_INTEGER,
                        ZERO_INTEGER ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQ, makeSymbol( "SELF" ), makeSymbol( "FIRST-WORD" ) ), ConsesLow.list(
                            makeSymbol( "RELATIVE-CLAUSE-P" ), makeSymbol( "GRANDMOTHER" ) ) ) ) ) );
    $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym159$GET_DESCENDANT = makeSymbol( "GET-DESCENDANT" );
    $list160 = ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER );
    $sym161$WORD_TREE_RELATIVE_PRONOUN_P_METHOD = makeSymbol( "WORD-TREE-RELATIVE-PRONOUN-P-METHOD" );
    $sym162$RETOKENIZE = makeSymbol( "RETOKENIZE" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym164$WORD_TREE_RETOKENIZE_METHOD = makeSymbol( "WORD-TREE-RETOKENIZE-METHOD" );
    $sym165$LOGICAL_FORM_INT = makeSymbol( "LOGICAL-FORM-INT" );
    $list166 = ConsesLow.list( makeString( "@return listp; the logical form of this word" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym167$WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym168$FUNCTION_WORD_TREE = makeSymbol( "FUNCTION-WORD-TREE" );
    $sym169$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS" );
    $sym170$SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE" );
    $sym171$MODIFIER_WORD_TREE = makeSymbol( "MODIFIER-WORD-TREE" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM-INT" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym173$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS" );
    $sym174$SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE" );
    $sym175$COORDINATE_WORD_TREE = makeSymbol( "COORDINATE-WORD-TREE" );
    $list176 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym177$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS" );
    $sym178$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE" );
    $list179 = ConsesLow.list( makeString( "@return list; a list of the conjuncts of this conjunction" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ) );
    $sym180$GET_SISTER = makeSymbol( "GET-SISTER" );
    $sym181$COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $sym182$COORDINATE_PHRASE_P = makeSymbol( "COORDINATE-PHRASE-P" );
    $sym183$PHRASE_TREE = makeSymbol( "PHRASE-TREE" );
    $list184 = ConsesLow.list( makeString( "@return booleanp; t if this phrase is a coordination, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONJUNCTION" ) ) ) ) ) );
    $sym185$GET_CONJUNCTION = makeSymbol( "GET-CONJUNCTION" );
    $sym186$PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol( "PHRASE-TREE-COORDINATE-PHRASE-P-METHOD" );
    $sym187$COORDINATE_PHRASE_TREE = makeSymbol( "COORDINATE-PHRASE-TREE" );
    $sym188$NOMINAL_PHRASE_TREE = makeSymbol( "NOMINAL-PHRASE-TREE" );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COORDINATE-PHRASE-P" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym190$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS" );
    $sym191$DAUGHTERS = makeSymbol( "DAUGHTERS" );
    $sym192$SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE" );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym194$COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol( "COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD" );
    $sym195$UNLIKE_COORDINATE_PHRASE_TREE = makeSymbol( "UNLIKE-COORDINATE-PHRASE-TREE" );
    $sym196$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS" );
    $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE" );
    $sym198$UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol( "UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD" );
    $sym199$NOMINAL_WORD_TREE = makeSymbol( "NOMINAL-WORD-TREE" );
    $list200 = ConsesLow.list( makeSymbol( "NOMINAL-TREE" ), makeSymbol( "NOMINAL-WORD" ) );
    $list201 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DETERMINER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword(
                "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-POSSESSOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SPECIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANTECEDENT" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RELATIONAL-NOUN-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEFINITE-DESCRIPTION-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GENDER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PERSON" ), NIL, makeKeyword(
                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SINGULAR-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                        makeSymbol( "PLURAL-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword(
                                            "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-NUCLEUS" ), NIL, makeKeyword(
                                                "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list(
                                                    makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM-INT" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $list202 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "POSSESSOR" ), makeKeyword(
        "OBLIQUE-OBJECT" ), makeKeyword( "MODIFIED" ), makeKeyword( "POSS-COL" ), makeKeyword( "NUMBER" ) ) ) ) );
    $list203 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list(
        makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-OVERT-QUANTIFIER" ) ) ) ), ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                            makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                    makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ),
                                    ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol(
                                        "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                            "POSSESSOR" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSOR" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                                                    .list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "MODIFIED" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "MODIFIED" ),
                                                            makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                                                "QUANTIFIER" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                    "GET-CATEGORY" ) ) ), makeKeyword( "CD" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "NUMBER" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                                        makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                                                                            "NUMBER" ), makeSymbol( "QUANTIFIER" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                                "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "POSS-COL" ), makeSymbol( "KEYWORDS" ), ConsesLow
                                                                                    .list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
                                                                                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                            "GET-HEAD" ) ) ) ), makeSymbol( "CYCL" ), makeSymbol( "COL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ),
                                                                                                ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                                    makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list(
                                                                                                        makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow
                                                                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                "CSETQ" ), makeSymbol( "COL" ), ConsesLow.list( makeSymbol( "MAIN-COLLECTION" ), makeSymbol( "CYCL" ),
                                                                                                                    makeKeyword( "NOUN" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CONS" ),
                                                                                                                        makeKeyword( "POSS-COL" ), makeSymbol( "COL" ) ), makeSymbol( "DISJUNCTS" ) ) ), ConsesLow.list(
                                                                                                                            makeSymbol( "PUNLESS" ), makeSymbol( "DISJUNCTS" ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                                ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "POSS-COL" ), constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "Thing" ) ) ), makeSymbol(
                                                                                                                                        "DISJUNCTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                                                                                            makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ),
                                                                                                                                            makeSymbol( "DISJUNCTS" ) ) )
    } ) );
    $list204 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "POSSESSOR" ), makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "MODIFIED" ), makeKeyword( "POSS-COL" ), makeKeyword( "NUMBER" ) );
    $sym205$GET_OVERT_QUANTIFIER = makeSymbol( "GET-OVERT-QUANTIFIER" );
    $kw206$NOUN = makeKeyword( "NOUN" );
    $kw207$PREP_OBJECT = makeKeyword( "PREP-OBJECT" );
    $kw208$POSSESSOR = makeKeyword( "POSSESSOR" );
    $kw209$MODIFIED = makeKeyword( "MODIFIED" );
    $kw210$CD = makeKeyword( "CD" );
    $kw211$NUMBER = makeKeyword( "NUMBER" );
    $kw212$POSS_COL = makeKeyword( "POSS-COL" );
    $const213$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym214$NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $list215 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "RENAMINGS-DISJ" ) );
    $list216 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS" ), NIL ), makeSymbol( "INDEPENDENT-MODS" ), makeSymbol( "DEPENDENT-MODS" ), ConsesLow.list(
        makeSymbol( "COMP-MOD-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol( "INDEPENDENT-MODS" ), makeSymbol( "DEPENDENT-MODS" ) ), ConsesLow.list( makeSymbol(
            "PARTITION-MODIFIERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "RENAMINGS-DISJ" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS-DISJ" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                            "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol(
                                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                                        "COMP-MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIER" ), makeSymbol( "INDEPENDENT-MODS" ) ), ConsesLow.list( makeSymbol(
                                            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MOD-CYCL" ),
                                                    makeSymbol( "COMP-MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMINGS-CONJ" ), makeSymbol( "RENAMINGS-DISJ" ) ),
                                                        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS-CONJ" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                            makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ),
                                                            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS-DISJ" ), NIL ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list(
                                                                makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                                                                makeKeyword( "TERM" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "RENAMINGS-CONJ" ) ), ConsesLow
                                                                    .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MY-CYCLS-WITH-MODS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
                                                                        makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "SELF" ), makeSymbol( "RLE" ), makeSymbol(
                                                                            "RENAMING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MOD" ), makeSymbol( "DEPENDENT-MODS" ) ),
                                                                                ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                    makeSymbol( "CYCLIFY-NUCLEUS" ) ), ConsesLow.list( makeSymbol( "UPDATE-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                        makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ) ), makeKeyword( "REPLACE" ),
                                                                                        makeSymbol( "TERM" ) ) ), makeSymbol( "MY-CYCLS-WITH-MODS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS-DISJ" ),
                                                                                            ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), makeSymbol( "MY-CYCLS-WITH-MODS" ) ) ),
                                                                                                makeSymbol( "CYCLS-DISJ" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCLS-DISJ" ), ConsesLow.list(
                                                                                                    makeSymbol( "CSETQ" ), makeSymbol( "CYCLS-CONJ" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "CYCLS-DISJ" ),
                                                                                                        makeSymbol( "CYCLS-CONJ" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list(
                                                                                                            makeSymbol( "APPEND" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                                                                                                makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ),
                                                                                                                    ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "CYCLS-CONJ" ), makeSymbol(
                                                                                                                        "COMP-MOD-CYCLS" ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                                            "CYCLS" ) ) ) );
    $kw217$TERM = makeKeyword( "TERM" );
    $sym218$NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD = makeSymbol( "NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD" );
    $list219 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIER" ) ) ) ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ),
            ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "RESULT" ) ) ) ) );
    $sym220$GET_QUANTIFIER = makeSymbol( "GET-QUANTIFIER" );
    $sym221$NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD = makeSymbol( "NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD" );
    $sym222$DEFINITE_DESCRIPTION_P = makeSymbol( "DEFINITE-DESCRIPTION-P" );
    $list223 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-DETERMINER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "DET" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "DET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "the" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "NAME-WORD-P" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SINGULAR-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                            makeSymbol( "POS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                "PWHEN" ), makeSymbol( "POS" ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) );
    $sym224$GET_DETERMINER = makeSymbol( "GET-DETERMINER" );
    $str225$the = makeString( "the" );
    $sym226$SINGULAR_P = makeSymbol( "SINGULAR-P" );
    $sym227$GET_POSSESSOR = makeSymbol( "GET-POSSESSOR" );
    $sym228$NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD = makeSymbol( "NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD" );
    $sym229$RELATIONAL_NOUN_P = makeSymbol( "RELATIONAL-NOUN-P" );
    $list230 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "RENAME-VARIABLES" ), ConsesLow.list( makeSymbol( "FIM" ),
            ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "FRAME-RENAMING" ),
                ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ) ) ), ConsesLow
                    .list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KEYWORD" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSS-COL" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                            makeSymbol( "KEYWORD" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) ) ) );
    $sym231$NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD = makeSymbol( "NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD" );
    $list232 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-OVERT-QUANTIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ),
                makeString( "the" ) ) ), makeSymbol( "QUANTIFIER" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "SINGULAR-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "PLURAL-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ) );
    $sym233$GET_EXISTENTIAL_NULL_DETERMINER = makeSymbol( "GET-EXISTENTIAL-NULL-DETERMINER" );
    $sym234$PLURAL_P = makeSymbol( "PLURAL-P" );
    $sym235$NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD" );
    $sym236$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS" );
    $sym237$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE" );
    $sym238$GET_NUMBER = makeSymbol( "GET-NUMBER" );
    $list239 = ConsesLow.list( makeString( "@return listp; a list of numbers of this noun with possible number values\n   :SINGULAR and :PLURAL\n   @note this should be overridden by the subclassses" ), ConsesLow.list(
        makeSymbol( "RET" ), NIL ) );
    $sym240$NOMINAL_WORD_TREE_GET_NUMBER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-NUMBER-METHOD" );
    $list241 = ConsesLow.list( makeString( "@return listp; the complements of this noun" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "RELATIONAL-NOUN-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMPLEMENT" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMPLEMENT" ), ConsesLow
                .list( makeSymbol( "PWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "SISTER-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                        "SISTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                            .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P" ), makeSymbol( "SISTER" ) ), makeSymbol( "SISTER-HEAD" ), ConsesLow.list( EQUALP, ConsesLow
                                .list( makeSymbol( "FIM" ), makeSymbol( "SISTER-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "of" ) ) ), ConsesLow.list( makeSymbol(
                                    "CSETQ" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-OBLIQUE-OBJECT" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ),
                                            makeSymbol( "COMPLEMENT" ) ) ) ) ) ) );
    $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD" );
    $sym243$NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $list244 = ConsesLow.list( makeString( "@return word-tree-p; the determiner of this noun or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DET" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DETERMINER-WORD-TREE-P" ) ),
            ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DET" ) ) ), ConsesLow.list(
                makeSymbol( "CSETQ" ), makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "WHADJP-TREE-P" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DET" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DETERMINER-WORD-TREE-P" ) ) ) ) ), ConsesLow
                            .list( makeSymbol( "RET" ), makeSymbol( "DET" ) ) ) );
    $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD" );
    $sym246$FIND_LAST = makeSymbol( "FIND-LAST" );
    $sym247$DETERMINER_WORD_TREE_P = makeSymbol( "DETERMINER-WORD-TREE-P" );
    $sym248$WHADJP_TREE_P = makeSymbol( "WHADJP-TREE-P" );
    $sym249$FIND_FIRST = makeSymbol( "FIND-FIRST" );
    $sym250$NOMINAL_WORD_TREE_GET_DETERMINER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-DETERMINER-METHOD" );
    $list251 = ConsesLow.list( makeString( "@return word-tree-p; the visible quantifier of this noun of nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "QUANT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "QUANTIFIER-TREE-P" ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "QUANT" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "QUANT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DETERMINER" ) ) ) ) ) );
    $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD" );
    $sym253$QUANTIFIER_TREE_P = makeSymbol( "QUANTIFIER-TREE-P" );
    $sym254$NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD" );
    $list255 = ConsesLow.list( makeString( "@return determiner-word-tree-p; an empty (null) determiner for this word" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-NULL-DETERMINER" ),
        constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "SELF" ), makeSymbol( "CONTEXT" ) ) ) );
    $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $const257$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const258$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym259$WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD = makeSymbol( "WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD" );
    $sym260$LEX_ENTRY = makeSymbol( "LEX-ENTRY" );
    $sym261$SET = makeSymbol( "SET" );
    $kw262$STRING = makeKeyword( "STRING" );
    $str263$ = makeString( "" );
    $kw264$CYC_POS = makeKeyword( "CYC-POS" );
    $const265$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $list266 = ConsesLow.list( makeKeyword( "RESTR" ), makeKeyword( "SCOPE" ) );
    $const267$DeterminerFrame = constant_handles.reader_make_constant_shell( makeString( "DeterminerFrame" ) );
    $kw268$DT = makeKeyword( "DT" );
    $list269 = ConsesLow.list( makeString( "@return phrase-tree-p; the possessor phrase of this noun" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NP" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-PHRASE-TREE-P" ) ), makeSymbol(
            "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "NP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NP" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POSSESSIVE-P" ) ) ) ), makeSymbol( "NP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRP$-TREE-P" ) ), makeSymbol( "IDX" ) ) ) ) ) );
    $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD" );
    $sym271$NOMINAL_PHRASE_TREE_P = makeSymbol( "NOMINAL-PHRASE-TREE-P" );
    $sym272$POSSESSIVE_P = makeSymbol( "POSSESSIVE-P" );
    $sym273$PRP__TREE_P = makeSymbol( "PRP$-TREE-P" );
    $sym274$NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD" );
    $sym275$GET_SPECIFIER = makeSymbol( "GET-SPECIFIER" );
    $list276 = ConsesLow.list( makeString( "@return phrase-tree-p; the specifier phrase of this noun" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SPECIFIER" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DETERMINER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SPECIFIER" ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "SPECIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIER" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "PUNLESS" ), makeSymbol( "SPECIFIER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SPECIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SPECIFIER" ) ) ) );
    $sym277$NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD" );
    $sym278$GET_ANTECEDENT = makeSymbol( "GET-ANTECEDENT" );
    $list279 = ConsesLow.list( makeString( "@return parse-tree-p; the tree that serves as an antecedent to this noun" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym280$NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD" );
    $sym281$GET_GENDER = makeSymbol( "GET-GENDER" );
    $list282 = ConsesLow.list( makeString( "@return listp; a list of genders of this noun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "GENDERS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENDERS" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "GENDER" ) ), makeSymbol( "GENDERS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                    "REMOVE-DUPLICATES" ), makeSymbol( "GENDERS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ) ) );
    $kw283$GENDER = makeKeyword( "GENDER" );
    $sym284$NOMINAL_WORD_TREE_GET_GENDER_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-GENDER-METHOD" );
    $sym285$GET_PERSON = makeSymbol( "GET-PERSON" );
    $list286 = ConsesLow.list( makeString( "@return numberp; the person of this noun; 1, 2, or 3" ), ConsesLow.list( makeSymbol( "RET" ), THREE_INTEGER ) );
    $sym287$NOMINAL_WORD_TREE_GET_PERSON_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-PERSON-METHOD" );
    $list288 = ConsesLow.list( makeString( "@return booleanp; t if this is singular, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), ConsesLow.list( makeSymbol( "MEMBER" ),
        makeKeyword( "SINGULAR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NUMBER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ) ) );
    $kw289$SINGULAR = makeKeyword( "SINGULAR" );
    $sym290$NOMINAL_WORD_TREE_SINGULAR_P_METHOD = makeSymbol( "NOMINAL-WORD-TREE-SINGULAR-P-METHOD" );
    $list291 = ConsesLow.list( makeString( "@return boolenanp; t if this tree is plural, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), ConsesLow.list( makeSymbol(
        "MEMBER" ), makeKeyword( "PLURAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NUMBER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
            EQL ) ) ) ) );
    $kw292$PLURAL = makeKeyword( "PLURAL" );
    $sym293$NOMINAL_WORD_TREE_PLURAL_P_METHOD = makeSymbol( "NOMINAL-WORD-TREE-PLURAL-P-METHOD" );
    $list294 = ConsesLow.list( makeString( "@return listp; the list of trees this nominal word tree modifies" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MODIFIEDS" ), NIL ),
        ConsesLow.list( makeSymbol( "ANCESTORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol(
            "SUCCESS?" ), NIL ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), makeSymbol( "ANCESTORS" ), makeSymbol( "SUCCESS?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "APPOSITIVE-NP-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol(
                        "SELF" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                            "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ),
                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol( "MODIFIEDS" ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUCCESS?" ), T ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUCCESS?" ), NIL ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list(
                    makeSymbol( "ANCESTOR" ), makeSymbol( "ANCESTORS" ), makeSymbol( "SUCCESS?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                        "VERBAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPULA-P" ) ) ), ConsesLow.list(
                            makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ), ConsesLow.list( EQ, makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ),
                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-SUBJECT" ) ) ), makeSymbol( "MODIFIEDS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUCCESS?" ), T ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                            makeSymbol( "NOMINAL-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ),
                                            ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ),
                                                ONE_INTEGER ), makeSymbol( "MODIFIEDS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "TEMPORAL-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow
                                                    .list( makeSymbol( "CSETQ" ), makeSymbol( "SUCCESS?" ), NIL ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), makeSymbol(
                                                        "ANCESTORS" ), makeSymbol( "SUCCESS?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ),
                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list(
                                                                makeSymbol( "QUOTE" ), makeSymbol( "GET-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "HEAD" ), makeSymbol( "MODIFIEDS" ) ) ),
                                                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUCCESS?" ), T ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MODIFIEDS" ) ) ) );
    $sym295$GET_ANCESTORS = makeSymbol( "GET-ANCESTORS" );
    $sym296$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym297$COPULA_P = makeSymbol( "COPULA-P" );
    $sym298$GET_OBJECTS = makeSymbol( "GET-OBJECTS" );
    $sym299$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $sym300$NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD" );
    $sym301$DAUGHTER_COUNT = makeSymbol( "DAUGHTER-COUNT" );
    $kw302$_ = makeKeyword( "," );
    $sym303$NN_TREE = makeSymbol( "NN-TREE" );
    $list304 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym305$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS" );
    $sym306$SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE" );
    $list307 = ConsesLow.list( makeString( "@return listp; the list of all numbers of this noun" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword(
        "SINGULAR" ) ) ) ) );
    $list308 = ConsesLow.list( makeKeyword( "SINGULAR" ) );
    $sym309$NN_TREE_GET_NUMBER_METHOD = makeSymbol( "NN-TREE-GET-NUMBER-METHOD" );
    $sym310$NAME_WORD_TREE = makeSymbol( "NAME-WORD-TREE" );
    $list311 = ConsesLow.list( makeSymbol( "NAME-WORD" ) );
    $list312 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ) );
    $list313 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-OVERT-QUANTIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ),
            makeSymbol( "QUANTIFIER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLURAL-P" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ), makeSymbol( "QUANTIFIER" ) ) ) ) );
    $sym314$NAME_WORD_TREE_GET_QUANTIFIER_METHOD = makeSymbol( "NAME-WORD-TREE-GET-QUANTIFIER-METHOD" );
    $sym315$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS" );
    $sym316$SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE" );
    $sym317$DOLLAR_WORD_TREE = makeSymbol( "DOLLAR-WORD-TREE" );
    $list318 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OVERT-QUANTIFIER" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym319$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS" );
    $sym320$SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE" );
    $list321 = ConsesLow.list( makeString( "@return word-tree-p; the visible quantifier of this noun of nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "QUANT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
            makeSymbol( "CARDINAL-WORD-TREE-P" ), makeSymbol( "QUANT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "QUANT" ) ) ) ) );
    $sym322$DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = makeSymbol( "DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD" );
    $sym323$NNP_TREE = makeSymbol( "NNP-TREE" );
    $sym324$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS" );
    $sym325$SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE" );
    $sym326$NNP_TREE_GET_NUMBER_METHOD = makeSymbol( "NNP-TREE-GET-NUMBER-METHOD" );
    $sym327$NNS_TREE = makeSymbol( "NNS-TREE" );
    $sym328$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS" );
    $sym329$SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE" );
    $list330 = ConsesLow.list( makeString( "@return listp; the list of all numbers of this noun" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword(
        "PLURAL" ) ) ) ) );
    $list331 = ConsesLow.list( makeKeyword( "PLURAL" ) );
    $sym332$NNS_TREE_GET_NUMBER_METHOD = makeSymbol( "NNS-TREE-GET-NUMBER-METHOD" );
    $sym333$NNPS_TREE = makeSymbol( "NNPS-TREE" );
    $sym334$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS" );
    $sym335$SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE" );
    $sym336$NNPS_TREE_GET_NUMBER_METHOD = makeSymbol( "NNPS-TREE-GET-NUMBER-METHOD" );
    $sym337$PRP_TREE = makeSymbol( "PRP-TREE" );
    $list338 = ConsesLow.list( makeSymbol( "PRONOUN-TREE" ) );
    $list339 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-PERSON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GENDER" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym340$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS" );
    $sym341$SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE" );
    $list342 = ConsesLow.list( makeString( "I" ), makeString( "you" ), makeString( "he" ), makeString( "she" ), makeString( "it" ), makeString( "me" ), makeString( "him" ), makeString( "her" ) );
    $list343 = ConsesLow.list( makeString( "we" ), makeString( "you" ), makeString( "they" ), makeString( "us" ), makeString( "them" ) );
    $list344 = ConsesLow.list( makeString( "@return listp; a list of numbers of this pronoun with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "NUMBERS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "STRING" ), makeSymbol( "*SINGULAR-PERSONAL-PRONOUNS*" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeKeyword( "SINGULAR" ), makeSymbol( "NUMBERS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                makeSymbol( "STRING" ), makeSymbol( "*PLURAL-PERSONAL-PRONOUNS*" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeKeyword( "PLURAL" ), makeSymbol(
                    "NUMBERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NUMBERS" ) ) ) );
    $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP-TREE-METHOD" );
    $sym346$PRP_TREE_GET_NUMBER_METHOD = makeSymbol( "PRP-TREE-GET-NUMBER-METHOD" );
    $list347 = ConsesLow.list( makeString( "@return keywordp; the person of this pronoun" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol(
        "STRING" ), makeString( "I" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "STRING" ), makeString( "me" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "STRING" ),
            makeString( "you" ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "STRING" ), makeString( "we" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "STRING" ),
                makeString( "us" ) ), ONE_INTEGER ), ConsesLow.list( T, THREE_INTEGER ) ) ) );
    $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP-TREE-METHOD" );
    $str349$I = makeString( "I" );
    $str350$me = makeString( "me" );
    $str351$you = makeString( "you" );
    $str352$we = makeString( "we" );
    $str353$us = makeString( "us" );
    $sym354$PRP_TREE_GET_PERSON_METHOD = makeSymbol( "PRP-TREE-GET-PERSON-METHOD" );
    $list355 = ConsesLow.list( makeString( "@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "ASSOC" ), makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( new SubLObject[]
        { ConsesLow.list( makeString( "I" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "me" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list(
            makeString( "you" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "he" ), makeKeyword( "MASCULINE" ) ), ConsesLow.list( makeString( "him" ), makeKeyword(
                "MASCULINE" ) ), ConsesLow.list( makeString( "she" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "her" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "it" ), makeKeyword(
                    "NEUTER" ) ), ConsesLow.list( makeString( "we" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "us" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ),
          ConsesLow.list( makeString( "they" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "them" ), makeKeyword( "MASCULINE" ), makeKeyword(
              "FEMININE" ), makeKeyword( "NEUTER" ) )
        } ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ) ) ) );
    $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP-TREE-METHOD" );
    $list357 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeString( "I" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "me" ), makeKeyword( "MASCULINE" ), makeKeyword(
        "FEMININE" ) ), ConsesLow.list( makeString( "you" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "he" ), makeKeyword( "MASCULINE" ) ), ConsesLow.list( makeString( "him" ),
            makeKeyword( "MASCULINE" ) ), ConsesLow.list( makeString( "she" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "her" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "it" ),
                makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "we" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "us" ), makeKeyword( "MASCULINE" ), makeKeyword(
                    "FEMININE" ) ), ConsesLow.list( makeString( "they" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "them" ), makeKeyword(
                        "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) )
    } );
    $sym358$PRP_TREE_GET_GENDER_METHOD = makeSymbol( "PRP-TREE-GET-GENDER-METHOD" );
    $sym359$WP_TREE = makeSymbol( "WP-TREE" );
    $list360 = ConsesLow.list( makeSymbol( "WH-TREE" ), makeSymbol( "QUANTIFIER-TREE" ) );
    $list361 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REFS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-ANTECEDENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GENDER" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym362$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS" );
    $sym363$SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE" );
    $list364 = ConsesLow.list( makeString( "@return listp; the unique referents of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANTECEDENT" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANTECEDENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol(
            "ANTECEDENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANTECEDENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ), makeSymbol( "REFS" ) ) ) ) );
    $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WP-TREE-METHOD" );
    $sym366$WP_TREE_GET_REFS_METHOD = makeSymbol( "WP-TREE-GET-REFS-METHOD" );
    $list367 = ConsesLow.list( makeString( "@return parse-tree-p; the tree that serves as an antecedent to this wh word" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "GREAT-GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NP-TREE-P" ),
                    makeSymbol( "GREAT-GRANDMOTHER" ) ), ConsesLow.list( makeSymbol( "NP-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GREAT-GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GREAT-GRANDMOTHER" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ) );
    $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WP-TREE-METHOD" );
    $sym369$WP_TREE_GET_ANTECEDENT_METHOD = makeSymbol( "WP-TREE-GET-ANTECEDENT-METHOD" );
    $list370 = ConsesLow.list( makeString( "@return word-tree-p; the quantifier of this name, or nil if there is none" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUANTIFIER-TREE-P" ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "IDX" ) ) ) ) );
    $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WP-TREE-METHOD" );
    $sym372$WP_TREE_GET_QUANTIFIER_METHOD = makeSymbol( "WP-TREE-GET-QUANTIFIER-METHOD" );
    $list373 = ConsesLow.list( makeString( "@return listp; a list of numbers of this wp with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), ConsesLow.list( makeKeyword( "SINGULAR" ) ) ) ) );
    $sym374$WP_TREE_GET_NUMBER_METHOD = makeSymbol( "WP-TREE-GET-NUMBER-METHOD" );
    $list375 = ConsesLow.list( makeString( "@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ) ) ) );
    $list376 = ConsesLow.list( makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) );
    $sym377$WP_TREE_GET_GENDER_METHOD = makeSymbol( "WP-TREE-GET-GENDER-METHOD" );
    $str378$that = makeString( "that" );
    $sym379$VERBAL_WORD_TREE = makeSymbol( "VERBAL-WORD-TREE" );
    $list380 = ConsesLow.list( makeSymbol( "VERBAL-TREE" ), makeSymbol( "VERBAL-WORD" ) );
    $list381 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PERSON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECT-OBJECT" ), NIL,
                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-SEMANTIC-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "GET-ADJECTIVAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MATRIX-CLAUSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "GET-PARTICLE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INFINITIVE-MARKER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "DUMMY-TO-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FINITE-P" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INFINITIVE-P" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BASE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONTROL-VERB-P" ),
              NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SUBJECT-CONTROLLER-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OBJECT-CONTROLLER-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "CONTROL-VERB-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "GET-CONTROL-VERB" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTROLLER" ), NIL, makeKeyword(
                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                      makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MOVED-NPS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MOVED-OBJECTS" ), NIL,
                          makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ),
                              makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword(
                                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTICLE-FILTER-LEXES" ), NIL, makeKeyword(
                                      "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INVERTED-P" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $list382 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PARTICLE" ) ) ) ), ConsesLow.list( makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), makeSymbol( "FRAME" ) ), ConsesLow.list(
                makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                    makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                        makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles
                            .reader_make_constant_shell( makeString( "ParticleFrameType" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REQUIRED-PARTICLE-STRING" ), ConsesLow.list( makeSymbol(
                                    "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "VerbParticle" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "REQUIRED-PARTICLE-STRING" ), ConsesLow.list( makeSymbol(
                                            "FIM" ), makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ),
                                                makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                                                    makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                        "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym384$GET_PARTICLE = makeSymbol( "GET-PARTICLE" );
    $const385$ParticleFrameType = constant_handles.reader_make_constant_shell( makeString( "ParticleFrameType" ) );
    $const386$VerbParticle = constant_handles.reader_make_constant_shell( makeString( "VerbParticle" ) );
    $sym387$VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD = makeSymbol( "VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD" );
    $list388 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "NON-DISTRIBUTING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NON-DISTRIBUTING" ), ConsesLow.list(
                makeSymbol( "DELETE-CYCLIFIABLE" ), makeSymbol( "SUBJECT" ), makeSymbol( "NON-DISTRIBUTING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), makeSymbol(
                    "NON-DISTRIBUTING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJECT" ) ) ) ) ) ) );
    $sym389$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $sym390$VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD" );
    $list391 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword(
        "OBJECT" ), makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "CLAUSE" ), makeKeyword( "INF-COMP" ), makeKeyword( "NOUN" ) ) ) ) );
    $list392 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list(
        makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
            "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                    "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                        "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
                            "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ),
      ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
          "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "VBN" ), makeKeyword( "VBG" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
              .list( makeSymbol( "CNOT" ), makeSymbol( "SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ),
                  makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword(
                      "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                          "ACTION" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                              makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                  makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                      makeSymbol( "CAND" ), makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                          EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "DIRECT-OBJECT" ) ),
                                              makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol(
                                                  "MEMBER" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                                                      .list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "INDIRECT-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                                          makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                                              "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                  makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "OBLIQUE-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow
                                                                      .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                                                          "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                              makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                                                                  makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                                                      makeKeyword( "CLAUSE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol(
                                                                                          "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CL-CYCLS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                              "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                  "CDOLIST" ), ConsesLow.list( makeSymbol( "CL-CYCL" ), makeSymbol( "CL-CYCLS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                      makeSymbol( "CL-CYCL" ), ConsesLow.list( makeSymbol( "LIFT-CONJUNCTS" ), makeSymbol( "CL-CYCL" ) ) ), ConsesLow.list(
                                                                                                          makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "CLAUSE" ), makeSymbol( "CL-CYCL" ) ),
                                                                                                          makeSymbol( "DISJUNCTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                                                                                              makeSymbol( "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "INF-COMP" ), makeSymbol(
                                                                                                                  "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                      ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "INF-COMP" ), makeSymbol(
                                                                                                                          "CL-COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                                                                                                                              .list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol(
                                                                                                                                  "DISJUNCTS" ) ) )
    } ) );
    $list393 = ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ), makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "CLAUSE" ), makeKeyword( "INF-COMP" ), makeKeyword( "NOUN" ) );
    $sym394$GET_SEMANTIC_DIRECT_OBJECT = makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" );
    $sym395$GET_SEMANTIC_INDIRECT_OBJECT = makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" );
    $sym396$GET_VERBAL_COMPLEMENT = makeSymbol( "GET-VERBAL-COMPLEMENT" );
    $list397 = ConsesLow.list( makeKeyword( "VBN" ), makeKeyword( "VBG" ) );
    $kw398$ACTION = makeKeyword( "ACTION" );
    $kw399$SUBJECT = makeKeyword( "SUBJECT" );
    $kw400$OBJECT = makeKeyword( "OBJECT" );
    $kw401$CLAUSE = makeKeyword( "CLAUSE" );
    $kw402$INF_COMP = makeKeyword( "INF-COMP" );
    $sym403$VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $sym404$GET_CONTROLLER = makeSymbol( "GET-CONTROLLER" );
    $list405 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CONTROL-VERB" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "CONTROL-VERB" ) ), ConsesLow.list( makeSymbol(
            "RET" ), NIL ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBJECT-CONTROLLER-P" ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBJECT-CONTROLLER-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DIRECT-OBJECT" ) ) ) ) ) ) ) );
    $sym406$GET_CONTROL_VERB = makeSymbol( "GET-CONTROL-VERB" );
    $sym407$SUBJECT_CONTROLLER_P = makeSymbol( "SUBJECT-CONTROLLER-P" );
    $sym408$OBJECT_CONTROLLER_P = makeSymbol( "OBJECT-CONTROLLER-P" );
    $sym409$GET_DIRECT_OBJECT = makeSymbol( "GET-DIRECT-OBJECT" );
    $sym410$VERBAL_WORD_TREE_GET_CONTROLLER_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-CONTROLLER-METHOD" );
    $list411 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MATRIX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-MATRIX-CLAUSE" ) ) ) ), ConsesLow.list( makeSymbol( "MATRIX-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MATRIX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MATRIX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MATRIX-HEAD" ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "MATRIX-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONTROL-VERB-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MATRIX-HEAD" ) ) ) ) );
    $sym412$GET_MATRIX_CLAUSE = makeSymbol( "GET-MATRIX-CLAUSE" );
    $sym413$CONTROL_VERB_P = makeSymbol( "CONTROL-VERB-P" );
    $sym414$VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD" );
    $list415 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "ObjectControlFrame" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                    .list( makeSymbol( "BOOLEAN" ), makeSymbol( "RESULT" ) ) ) ) ) ) );
    $list416 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ObjectControlFrame" ) ) );
    $sym417$VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD" );
    $list418 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "IntransitiveSubjectControlFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "TransitiveSubjectControlFrame" ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), makeSymbol( "RESULT" ) ) ) ) ) ) );
    $list419 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntransitiveSubjectControlFrame" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TransitiveSubjectControlFrame" ) ) );
    $sym420$VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD" );
    $list421 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SUBJECT-CONTROLLER-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBJECT-CONTROLLER-P" ) ) ) ) ) );
    $sym422$VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD" );
    $list423 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SENTENTIAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list(
            makeSymbol( "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol( "SELF" ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANCESTOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym424$VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD" );
    $sym425$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS" );
    $sym426$SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE" );
    $sym427$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $list428 = ConsesLow.list( makeString( "@return word-tree-p; the predicate of this sentence" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD" ) ) ) ) );
    $sym429$GET_SEMANTIC_HEAD = makeSymbol( "GET-SEMANTIC-HEAD" );
    $sym430$VERBAL_WORD_TREE_GET_PREDICATE_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-PREDICATE-METHOD" );
    $list431 = ConsesLow.list( makeString( "@return listp; a list of numbers of this verb with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FINITE-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NUMBER" ) ) ) ) ) ) ) );
    $sym432$FINITE_P = makeSymbol( "FINITE-P" );
    $sym433$VERBAL_WORD_TREE_GET_NUMBER_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-NUMBER-METHOD" );
    $list434 = ConsesLow.list( makeString( "@return numberp; the person of this verb; 1, 2, or 3" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "FINITE-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol(
                "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PERSON" ) ) ) ) ) ) ) );
    $sym435$VERBAL_WORD_TREE_GET_PERSON_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-PERSON-METHOD" );
    $sym436$GET_TENSE = makeSymbol( "GET-TENSE" );
    $list437 = ConsesLow.list( makeString( "@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym438$VERBAL_WORD_TREE_GET_TENSE_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-TENSE-METHOD" );
    $list439 = ConsesLow.list( makeString( "@return phrase-tree-p; the subject of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1-" ),
            makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                .list( ConsesLow.list( makeSymbol( "CONTROLLER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTROLLER" ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "PWHEN" ), makeSymbol( "CONTROLLER" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONTROLLER" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "VERBAL-TREE-P" ), makeSymbol( "MOTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-SUBJECT" ) ) ) ) ) );
    $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym441$NOMINAL_TREE_P = makeSymbol( "NOMINAL-TREE-P" );
    $sym442$VERBAL_WORD_TREE_GET_SUBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-SUBJECT-METHOD" );
    $list443 = ConsesLow.list( makeString( "@return listp; a list of all objects of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBJECTS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "INDIRECT-OBJECT" ), makeSymbol( "OBJECTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DIRECT-OBJECT" ), ConsesLow
                    .list( makeSymbol( "CPUSH" ), makeSymbol( "DIRECT-OBJECT" ), makeSymbol( "OBJECTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                        ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "STRANDED-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OBJECTS" ), ConsesLow.list( makeSymbol( "DELETE" ), ConsesLow.list( makeSymbol(
                                    "FIM" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ), makeSymbol( "OBJECTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                        makeSymbol( "OBJECTS" ) ) ) );
    $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym445$GET_INDIRECT_OBJECT = makeSymbol( "GET-INDIRECT-OBJECT" );
    $sym446$STRANDED_P = makeSymbol( "STRANDED-P" );
    $sym447$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P" );
    $sym448$VERBAL_WORD_TREE_GET_OBJECTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-OBJECTS-METHOD" );
    $sym449$GET_MOVED_NPS = makeSymbol( "GET-MOVED-NPS" );
    $list450 = ConsesLow.list( makeString( "@return listp; the list of all non-local nps of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "MOVED" ) ), ConsesLow.list( makeSymbol(
        "CSOME" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-ANCESTORS" ) ) ) ), makeSymbol( "MOVED" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                makeSymbol( "MOVED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "WHNP-TREE-P" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MOVED" ) ) ) );
    $sym451$WHNP_TREE_P = makeSymbol( "WHNP-TREE-P" );
    $sym452$VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD" );
    $sym453$GET_MOVED_OBJECTS = makeSymbol( "GET-MOVED-OBJECTS" );
    $list454 = ConsesLow.list( makeString( "@return listp; the list of all non-local ('moved') objects of this verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DELETE" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-MOVED-NPS" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ) );
    $sym455$VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD" );
    $list456 = ConsesLow.list( makeString( "@return phrase-tree-p; the direct object of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOVED" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOVED-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "LOCALS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
                "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "N" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "LOCALS" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "=" ), makeSymbol( "N" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "LOCALS" ) ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "TEMPORAL-TREE-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "LOCALS" ) ) ), ConsesLow.list( makeSymbol(
                            "RET" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "LOCALS" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "N" ),
                                ONE_INTEGER ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "MOVED" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "LOCALS" ) ) ) ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "N" ), TWO_INTEGER ), makeSymbol( "MOVED" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                        makeSymbol( "FIRST" ), makeSymbol( "MOVED" ) ) ) ) ) ) ) );
    $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym458$VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD" );
    $list459 = ConsesLow.list( makeString( "@return phrase-tree-p; the indirect object of this verb, including oblique objects\n   embedded within a PP" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "MOVED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOVED-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "LOCALS" ), ConsesLow
                    .list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow
                        .list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "N" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "LOCALS" ) ) ) ), ConsesLow.list( makeSymbol(
                            "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "N" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "LOCALS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEMPORAL-TREE-P" ) ) ) ) ), ConsesLow.list(
                                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "LOCALS" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ),
                                        makeSymbol( "N" ), ONE_INTEGER ), makeSymbol( "MOVED" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "MOVED" ) ) ) ) ) ) ) );
    $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym461$VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD" );
    $list462 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic direct object of this verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DIRECT-OBJECT" ) ) ) ) );
    $sym463$VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD" );
    $list464 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic indirect object of this verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDIRECT-OBJECT" ) ) ) ) );
    $sym465$VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD" );
    $list466 = ConsesLow.list( makeString( "@return listp; a list of all verbal complements of this verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBAL-PHRASE-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ) );
    $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym468$VERBAL_PHRASE_TREE_P = makeSymbol( "VERBAL-PHRASE-TREE-P" );
    $sym469$VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD" );
    $sym470$GET_ADJECTIVAL_COMPLEMENT = makeSymbol( "GET-ADJECTIVAL-COMPLEMENT" );
    $list471 = ConsesLow.list( makeString( "@return adjp-tree-p; the adjectival complement of this verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADJP-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ) );
    $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym473$ADJP_TREE_P = makeSymbol( "ADJP-TREE-P" );
    $sym474$VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD" );
    $list475 = ConsesLow.list( makeString( "@return listp; a list of all complements of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol( "APPEND" ),
                ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                        "VERBAL-COMPLEMENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COMPLEMENTS" ) ) ) );
    $sym476$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $sym477$VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $list478 = ConsesLow.list( makeString( "@return word-tree-p; this verb's particle phrase, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PARTICLE-PHRASE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "PRT-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PARTICLE-PHRASE" ), makeSymbol(
                "PARTICLE-PHRASE" ) ) ) ) );
    $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym480$PRT_TREE_P = makeSymbol( "PRT-TREE-P" );
    $sym481$VERBAL_WORD_TREE_GET_PARTICLE_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-PARTICLE-METHOD" );
    $sym482$GET_INFINITIVE_MARKER = makeSymbol( "GET-INFINITIVE-MARKER" );
    $list483 = ConsesLow.list( makeString( "@return word-tree-p; this verb's infinitive marker" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VP" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ), ConsesLow.list( makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "VP" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "CANDIDATE" ), ConsesLow
                .list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "TO" ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), makeSymbol( "CANDIDATE" ) ) ) ) );
    $kw484$TO = makeKeyword( "TO" );
    $sym485$VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD" );
    $sym486$DUMMY_TO_P = makeSymbol( "DUMMY-TO-P" );
    $list487 = ConsesLow.list( makeString( "@return boolean; t if this verb is a dummy 'to', nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "to" ) ) ) );
    $str488$to = makeString( "to" );
    $sym489$VERBAL_WORD_TREE_DUMMY_TO_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-DUMMY-TO-P-METHOD" );
    $list490 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic subject of this verbal tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) );
    $sym491$VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD" );
    $list492 = ConsesLow.list( makeString( "@return listp; a list of the semantic subject of this verbal tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECT-OBJECT" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "INDIRECT-OBJECT" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SEMANTIC-OBJECTS" ), NIL ) ), ConsesLow.list(
                makeSymbol( "PWHEN" ), makeSymbol( "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "INDIRECT-OBJECT" ), makeSymbol( "SEMANTIC-OBJECTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                    makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DIRECT-OBJECT" ), makeSymbol( "SEMANTIC-OBJECTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                        "SEMANTIC-OBJECTS" ) ) ) );
    $sym493$VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD" );
    $sym494$GET_ANCESTOR_OBJECTS = makeSymbol( "GET-ANCESTOR-OBJECTS" );
    $list495 = ConsesLow.list( makeString( "@return listp; the local syntactic objects of this tree and its ancestors" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ) ) ) ) );
    $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym497$VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol( "VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD" );
    $sym498$INVERTED_P = makeSymbol( "INVERTED-P" );
    $list499 = ConsesLow.list( makeString( "@return booleanp; t if this verb is inverted, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym500$VERBAL_WORD_TREE_INVERTED_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-INVERTED-P-METHOD" );
    $list501 = ConsesLow.list( makeString( "@return booleanp; t if this word is finite, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FINITE-VERBAL-WORD-TREE-P" ), makeSymbol(
        "SELF" ) ) ) );
    $sym502$VERBAL_WORD_TREE_FINITE_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-FINITE-P-METHOD" );
    $sym503$PASSIVE_P = makeSymbol( "PASSIVE-P" );
    $list504 = ConsesLow.list( makeString( "@return booleanp; t if this verb is the head of a passive construction, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym505$VERBAL_WORD_TREE_PASSIVE_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-PASSIVE-P-METHOD" );
    $sym506$INFINITIVE_P = makeSymbol( "INFINITIVE-P" );
    $list507 = ConsesLow.list( makeString( "@return boolenap; t if this verb is in the infinitive form, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INFINITIVE-MARKER" ) ) ) ) ) );
    $sym508$VERBAL_WORD_TREE_INFINITIVE_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-INFINITIVE-P-METHOD" );
    $sym509$BASE_P = makeSymbol( "BASE-P" );
    $list510 = ConsesLow.list( makeString( "@return booleanp; t if this verb is in its base form, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INFINITIVE-P" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "GRANDMOTHER" ), ConsesLow
                .list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "MODAL-VERB-TREE-P" ) ) ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "did" ) ) ) ) ) ) ) );
    $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym512$MODAL_VERB_TREE_P = makeSymbol( "MODAL-VERB-TREE-P" );
    $str513$did = makeString( "did" );
    $sym514$VERBAL_WORD_TREE_BASE_P_METHOD = makeSymbol( "VERBAL-WORD-TREE-BASE-P-METHOD" );
    $sym515$VBZ_TREE = makeSymbol( "VBZ-TREE" );
    $list516 = ConsesLow.list( makeSymbol( "FINITE-VERBAL-WORD-TREE" ) );
    $list517 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym518$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS" );
    $sym519$SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE" );
    $list520 = ConsesLow.list( makeString( "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE" ), ConsesLow.list( makeSymbol( "RET" ), makeKeyword( "PRESENT" ) ) );
    $kw521$PRESENT = makeKeyword( "PRESENT" );
    $sym522$VBZ_TREE_GET_TENSE_METHOD = makeSymbol( "VBZ-TREE-GET-TENSE-METHOD" );
    $sym523$VBN_TREE = makeSymbol( "VBN-TREE" );
    $list524 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-AUX-VERB" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-SEMANTIC-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL,
                makeKeyword( "PROTECTED" ) ) );
    $sym525$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS" );
    $sym526$SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE" );
    $sym527$GET_AUX_VERB = makeSymbol( "GET-AUX-VERB" );
    $list528 = ConsesLow.list( makeString( "@return aux-verb-tree-p; the aux verb of this participle form" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "AUX-VERB-TREE-P" ) ) ) ) ) ) );
    $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VBN-TREE-METHOD" );
    $sym530$AUX_VERB_TREE_P = makeSymbol( "AUX-VERB-TREE-P" );
    $sym531$VBN_TREE_GET_AUX_VERB_METHOD = makeSymbol( "VBN-TREE-GET-AUX-VERB-METHOD" );
    $list532 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic subject of this verbal tree" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "PASSIVE-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PPS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P" ) ) ) ) ), makeSymbol( "PPHEAD" ), makeSymbol( "PREPOSITION" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PP" ), makeSymbol(
                    "PPS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PPHEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREPOSITION" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PPHEAD" ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "PPHEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, makeSymbol( "PREPOSITION" ),
                                makeString( "by" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "GET-OBLIQUE-OBJECT" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-SUBJECT" ) ) ) ) ) );
    $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VBN-TREE-METHOD" );
    $str534$by = makeString( "by" );
    $sym535$VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol( "VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD" );
    $list536 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic direct object of this verb" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "PASSIVE-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LOCALS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
                "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "N" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "LOCALS" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "=" ), makeSymbol( "N" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "LOCALS" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "=" ),
                        makeSymbol( "N" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-SUBJECT" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-DIRECT-OBJECT" ) ) ) ) ) );
    $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VBN-TREE-METHOD" );
    $sym538$VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol( "VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD" );
    $list539 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic indirect object of this verb" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "PASSIVE-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "OBLIQUE-OBJECT" ),
                makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDIRECT-OBJECT" ) ) ) ) ) );
    $sym540$VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol( "VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD" );
    $list541 = ConsesLow.list( makeString( "am" ), makeString( "are" ), makeString( "is" ), makeString( "was" ), makeString( "were" ), makeString( "been" ), makeString( "had" ), makeString( "be" ) );
    $list542 = ConsesLow.list( makeString( "@return booleanp; t if this verb is the head of a passive construction, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "AUX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-AUX-VERB" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "CAND" ), makeSymbol( "AUX" ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "AUX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ),
                makeSymbol( "*TO-BE-FORMS*" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ) ) ) ) );
    $sym543$VBN_TREE_PASSIVE_P_METHOD = makeSymbol( "VBN-TREE-PASSIVE-P-METHOD" );
    $sym544$VBD_TREE = makeSymbol( "VBD-TREE" );
    $sym545$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS" );
    $sym546$SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE" );
    $list547 = ConsesLow.list( makeString( "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE" ), ConsesLow.list( makeSymbol( "RET" ), makeKeyword( "PAST" ) ) );
    $kw548$PAST = makeKeyword( "PAST" );
    $sym549$VBD_TREE_GET_TENSE_METHOD = makeSymbol( "VBD-TREE-GET-TENSE-METHOD" );
    $sym550$VBP_TREE = makeSymbol( "VBP-TREE" );
    $sym551$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS" );
    $sym552$SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE" );
    $sym553$VBP_TREE_GET_TENSE_METHOD = makeSymbol( "VBP-TREE-GET-TENSE-METHOD" );
    $sym554$VB_TREE = makeSymbol( "VB-TREE" );
    $sym555$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS" );
    $sym556$SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE" );
    $list557 = ConsesLow.list( makeString( "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE" ), ConsesLow.list( makeSymbol( "RET" ), makeKeyword( "INFINITIVE" ) ) );
    $kw558$INFINITIVE = makeKeyword( "INFINITIVE" );
    $sym559$VB_TREE_GET_TENSE_METHOD = makeSymbol( "VB-TREE-GET-TENSE-METHOD" );
    $sym560$VBG_TREE = makeSymbol( "VBG-TREE" );
    $list561 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-AUX-VERB" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym562$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS" );
    $sym563$SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE" );
    $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VBG-TREE-METHOD" );
    $sym565$VBG_TREE_GET_AUX_VERB_METHOD = makeSymbol( "VBG-TREE-GET-AUX-VERB-METHOD" );
    $list566 = ConsesLow.list( makeString( "@return listp; a list of constituents this verb modifies" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "GET-AUX-VERB" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ), ConsesLow.list( makeSymbol( "GRANDMAS-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "NOMINAL-PHRASE-TREE-P" ), makeSymbol( "GRANDMOTHER" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMAS-HEAD" ), ConsesLow.list( makeSymbol(
                        "LIST" ), makeSymbol( "GRANDMAS-HEAD" ) ) ) ) ) ) );
    $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VBG-TREE-METHOD" );
    $sym568$VBG_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "VBG-TREE-GET-MODIFIEDS-METHOD" );
    $sym569$AUX_VERB_TREE = makeSymbol( "AUX-VERB-TREE" );
    $list570 = ConsesLow.list( makeSymbol( "FINITE-VERBAL-WORD-TREE" ), makeSymbol( "AUX-VERB-WORD" ) );
    $list571 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEADS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "GET-KEYWORD-RENAMINGS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COPULA-P" ),
                                NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PREPOSITIONAL-COMPLEMENT" ), NIL, makeKeyword(
                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ADVERBIAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "INVERTED-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL,
                                            makeKeyword( "PUBLIC" ) )
    } );
    $list572 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-VERBAL-COMPLEMENT" ) ) ) ) ) );
    $sym573$AUX_VERB_TREE_COPULA_P_METHOD = makeSymbol( "AUX-VERB-TREE-COPULA-P-METHOD" );
    $list574 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ), makeKeyword(
        "COMPLEMENT" ) ) ) ) );
    $list575 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list( makeSymbol(
        "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "DIRECT-OBJECT" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list(
                makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol(
                            "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ),
                                makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                                    "OBJECT" ), makeSymbol( "DIRECT-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ),
                                        ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "SUBJECT" ) ), ConsesLow.list( makeSymbol( "CNOT" ),
                                            ConsesLow.list( EQ, makeSymbol( "COMPLEMENT" ), makeSymbol( "SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQ, makeSymbol( "COMPLEMENT" ), makeSymbol(
                                                "DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "COMPLEMENT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ),
                                        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCLS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMP-CYCLS" ), ConsesLow.list( makeSymbol( "CPUSH" ), NIL,
                                                makeSymbol( "COMP-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-CYCL" ), makeSymbol( "COMP-CYCLS" ) ), ConsesLow.list(
                                                    makeSymbol( "CSETQ" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "LIFT-CONJUNCTS" ), makeSymbol( "COMP-CYCL" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                        ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "COMPLEMENT" ), makeSymbol( "COMP-CYCL" ) ), makeSymbol( "DISJUNCTS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol( "DISJUNCTS" ) ) ) ) );
    $list576 = ConsesLow.list( makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ), makeKeyword( "COMPLEMENT" ) );
    $kw577$COMPLEMENT = makeKeyword( "COMPLEMENT" );
    $sym578$AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $list579 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPULA-P" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
            ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "COMPLEMENT" ) ) ) ) ) ) );
    $sym580$AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol( "AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD" );
    $list581 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEMENTS" ), NIL ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PREP-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "GET-PREPOSITIONAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "ADJ-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-ADJECTIVAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "ADV-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "GET-ADVERBIAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol(
                                "LIST" ), makeSymbol( "ADV-COMPLEMENT" ), makeSymbol( "ADJ-COMPLEMENT" ), makeSymbol( "PREP-COMPLEMENT" ), makeSymbol( "VERBAL-COMPLEMENT" ), makeSymbol( "OBJECT" ), makeSymbol(
                                    "SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMPLEMENT" ), makeSymbol(
                                        "COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COMPLEMENTS" ) ) ) );
    $sym582$GET_PREPOSITIONAL_COMPLEMENT = makeSymbol( "GET-PREPOSITIONAL-COMPLEMENT" );
    $sym583$GET_ADVERBIAL_COMPLEMENT = makeSymbol( "GET-ADVERBIAL-COMPLEMENT" );
    $sym584$AUX_VERB_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "AUX-VERB-TREE-GET-COMPLEMENTS-METHOD" );
    $list585 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MAIN-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym586$AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD = makeSymbol( "AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD" );
    $list587 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol(
        "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "is" ), makeString( "am" ), makeString( "are" ), makeString( "have" ), makeString( "has" ), makeString( "do" ), makeString(
            "does" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), makeKeyword( "PRESENT" ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol(
                "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "was" ), makeString( "were" ), makeString( "had" ), makeString( "did" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    EQUALP ) ), makeKeyword( "PAST" ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        ConsesLow.list( makeString( "be" ), makeString( "do" ), makeString( "have" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), makeKeyword( "INFINITIVE" ) ) ) ) );
    $list588 = ConsesLow.list( makeString( "is" ), makeString( "am" ), makeString( "are" ), makeString( "have" ), makeString( "has" ), makeString( "do" ), makeString( "does" ) );
    $list589 = ConsesLow.list( makeString( "was" ), makeString( "were" ), makeString( "had" ), makeString( "did" ) );
    $list590 = ConsesLow.list( makeString( "be" ), makeString( "do" ), makeString( "have" ) );
    $sym591$AUX_VERB_TREE_GET_TENSE_METHOD = makeSymbol( "AUX-VERB-TREE-GET-TENSE-METHOD" );
    $sym592$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS" );
    $sym593$SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE" );
    $list594 = ConsesLow.list( makeString( "@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), makeSymbol( "PP" ) ) ) ) );
    $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD" );
    $sym596$AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD" );
    $list597 = ConsesLow.list( makeString( "@return adverbial-word-tree-p; the adverbial complement of this aux verb" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym598$AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD" );
    $list599 = ConsesLow.list( makeString( "@return phrase-tree-p; the subject of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SUBJECT" ) ), ConsesLow.list( makeSymbol( "PIF" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list(
                makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list(
                        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "SUBJECT" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ) ) );
    $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD" );
    $sym601$AUX_VERB_TREE_GET_SUBJECT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-SUBJECT-METHOD" );
    $list602 = ConsesLow.list( makeString( "@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "FIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ), ConsesLow.list( makeSymbol( "SECOND" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ),
                makeSymbol( "IDX" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "IDX" ) ) ) ) ) );
    $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD" );
    $sym604$AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD" );
    $list605 = ConsesLow.list( makeString( "@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
            "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MAIN-VERB" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDIRECT-OBJECT" ) ) ) ) ) ) );
    $sym606$AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD" );
    $list607 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic subject of this aux tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SISTER" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
            makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), makeSymbol( "SISTER" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ) ) );
    $sym608$AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol( "AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD" );
    $list609 = ConsesLow.list( makeString( "@return booleanp; t if this verb is inverted, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MATRIX" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MATRIX-CLAUSE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
            "MATRIX" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "QUESTION-TREE-P" ), makeSymbol( "MATRIX" ) ), ConsesLow.list( makeSymbol( "CNOT" ),
                ConsesLow.list( makeSymbol( "VERBAL-PHRASE-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MATRIX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                    ZERO_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "SINV-TREE-P" ), makeSymbol( "MATRIX" ) ) ) ) ) ) );
    $sym610$AUX_VERB_TREE_INVERTED_P_METHOD = makeSymbol( "AUX-VERB-TREE-INVERTED-P-METHOD" );
    $list611 = ConsesLow.list( makeString( "@return booleanp; t if this verb is the head of a passive construction, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "MAIN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
            makeSymbol( "FWHEN" ), makeSymbol( "MAIN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MAIN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PASSIVE-P" ) ) ) ) ) ) );
    $sym612$AUX_VERB_TREE_PASSIVE_P_METHOD = makeSymbol( "AUX-VERB-TREE-PASSIVE-P-METHOD" );
    $sym613$MODAL_VERB_TREE = makeSymbol( "MODAL-VERB-TREE" );
    $list614 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym615$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS" );
    $sym616$SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE" );
    $list617 = ConsesLow.list( makeString(
        "@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE\n   @hack 'could' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?" ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( EQUALP, makeSymbol( "STRING" ), makeString( "will" ) ), makeKeyword( "FUTURE" ), makeKeyword( "PRESENT" ) ) ) );
    $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-MODAL-VERB-TREE-METHOD" );
    $str619$will = makeString( "will" );
    $kw620$FUTURE = makeKeyword( "FUTURE" );
    $sym621$MODAL_VERB_TREE_GET_TENSE_METHOD = makeSymbol( "MODAL-VERB-TREE-GET-TENSE-METHOD" );
    $list622 = ConsesLow.list( makeString( "@return listp; the list of objects of this modal" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym623$MODAL_VERB_TREE_GET_OBJECTS_METHOD = makeSymbol( "MODAL-VERB-TREE-GET-OBJECTS-METHOD" );
    $sym624$ADJECTIVAL_WORD_TREE = makeSymbol( "ADJECTIVAL-WORD-TREE" );
    $list625 = ConsesLow.list( makeSymbol( "ADJECTIVAL-TREE" ), makeSymbol( "ADJECTIVAL-WORD" ) );
    $list626 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-VERBAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword(
                "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ) );
    $list627 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword(
        "REPLACE" ), makeKeyword( "OBLIQUE-OBJECT" ) ) ) ) );
    $list628 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "MODIFIED" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
                        .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                            makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
                                "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol(
                                    "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "REPLACE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
                                        "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "REPLACE" ), NIL ) ), makeSymbol( "CONJUNCTS" ) ) ) ), ConsesLow.list(
                                            makeSymbol( "PWHEN" ), makeSymbol( "OBL-OBJ-HEAD" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "OBLIQUE-OBJECT" ),
                                                makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "OBL-OBJ-HEAD" ) ), makeSymbol( "CONJUNCTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                        ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $list629 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword( "REPLACE" ), makeKeyword( "OBLIQUE-OBJECT" ) );
    $sym630$ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $list631 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-OBLIQUE-OBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "OBL-OBJ" ),
                ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "OBL-OBJ" ) ) ) ) ) ) );
    $sym632$ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $sym633$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS" );
    $sym634$SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE" );
    $list635 = ConsesLow.list( makeString( "@return listp; a list of phrases modified by this adjective" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTER" ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), makeSymbol( "HEAD" ) ), makeSymbol( "HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "PWHEN" ),
                ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ), ConsesLow
                    .list( makeSymbol( "CSETQ" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ),
                        ONE_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MOTHER" ),
                            ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ),
                                MINUS_ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
                                    "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                            "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
                                                "CSETQ" ), makeSymbol( "COMPLEMENT" ), makeSymbol( "HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol(
                                                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol(
                                                        "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow
                                                            .list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol(
                                                                "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                    "MOD-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow
                                                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOD-HEAD" ), ConsesLow.list(
                                                                            makeSymbol( "CSETQ" ), makeSymbol( "COMPLEMENT" ), makeSymbol( "MOD-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                                makeSymbol( "FWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "COMPLEMENT" ) ) ) ) ) );
    $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD" );
    $sym637$GET_HEAD_DAUGHTER = makeSymbol( "GET-HEAD-DAUGHTER" );
    $sym638$ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD" );
    $list639 = ConsesLow.list( makeString( "@return verbal-tree-p; the verbal complement of this adjective" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SBAR-TREE-P" ) ) ) ) );
    $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD" );
    $sym641$SBAR_TREE_P = makeSymbol( "SBAR-TREE-P" );
    $sym642$ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol( "ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD" );
    $sym643$ADVERBIAL_WORD_TREE = makeSymbol( "ADVERBIAL-WORD-TREE" );
    $list644 = ConsesLow.list( makeSymbol( "ADVERBIAL-TREE" ), makeSymbol( "ADVERBIAL-WORD" ) );
    $list645 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ) );
    $list646 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword(
        "OBJECT" ) ) ) ) );
    $list647 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol( "MODIFIED" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol( "MODIFIED" ) ), ConsesLow.list(
                    makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                        "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ), makeSymbol(
                                "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ),
                                    makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ),
                                        makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                            "OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list(
                                                makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $list648 = ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ) );
    $sym649$ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $sym650$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS" );
    $sym651$SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE" );
    $list652 = ConsesLow.list( makeString( "@return listp; a list of phrases modified by this adverb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SISTER" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ),
            ConsesLow.list( makeSymbol( "ADJECTIVAL-WORD-TREE-P" ), makeSymbol( "SISTER" ) ), ConsesLow.list( makeSymbol( "ADVERBIAL-WORD-TREE-P" ), makeSymbol( "SISTER" ) ), ConsesLow.list( makeSymbol(
                "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P" ), makeSymbol( "SISTER" ) ), ConsesLow.list( makeSymbol( "NUMERICAL-TREE-P" ), makeSymbol( "SISTER" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                    makeSymbol( "LIST" ), makeSymbol( "SISTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-PHRASE-TREE-P" ), makeSymbol( "ANCESTOR" ) ),
                            ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ) ) ) );
    $sym653$ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD" );
    $sym654$WRB_WORD_TREE = makeSymbol( "WRB-WORD-TREE" );
    $list655 = ConsesLow.list( makeSymbol( "WH-TREE" ) );
    $sym656$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS" );
    $sym657$SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE" );
    $sym658$PREPOSITIONAL_OR_PARTICLE_WORD_TREE = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE" );
    $list659 = ConsesLow.list( makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD" ) );
    $list660 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OBLIQUE-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-VERBAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REFS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANTECEDENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), NIL,
                    makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM-INT" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $list661 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword(
        "OBJECT" ), makeKeyword( "CLAUSE" ) ) ) ) );
    $list662 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-STRING" ) ) ), makeString( "that" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list(
            makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENT" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CLAUSE" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list(
                            makeSymbol( "NOMINAL-WORD-P" ), makeSymbol( "MODIFIED" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ),
                                makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list(
                                    makeSymbol( "MEMBER" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol(
                                        "MODIFIED" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ),
                                            makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                                                        .list( makeSymbol( "CAND" ), makeSymbol( "CLAUSE" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "CLAUSE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                            makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "CLAUSE" ),
                                                                makeSymbol( "CLAUSE" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ),
                                                                    makeSymbol( "CONJUNCTS" ), NIL ) ) ) ) );
    $list663 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword( "OBJECT" ), makeKeyword( "CLAUSE" ) );
    $sym664$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS" );
    $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE" );
    $list667 = ConsesLow.list( makeString( "@return nominal-tree-p; the singleton lists of complements of this preposition" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SISTER" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
            makeSymbol( "CAND" ), makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), makeSymbol( "SISTER" ) ), ConsesLow.list( makeSymbol( "SENTENTIAL-TREE-P" ),
                makeSymbol( "SISTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SISTER" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                        ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "SBAR-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list( makeSymbol( "SBARQ-TREE-P" ), makeSymbol( "ANCESTOR" ) ) ), ConsesLow
                            .list( makeSymbol( "WHNP-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ),
                        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ) );
    $sym668$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD" );
    $list669 = ConsesLow.list( makeString( "@return verbal-tree-p; the verbal complement of this preposition or particle" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
            "IDX" ) ) ) ) );
    $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD" );
    $sym671$VERBAL_TREE_P = makeSymbol( "VERBAL-TREE-P" );
    $sym672$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD" );
    $list673 = ConsesLow.list( makeString( "@return nominal-tree-p; the complements of this preposition" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MODIFIEDS" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ), ConsesLow.list( makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SISTER" ), ConsesLow
                .list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), makeSymbol( "SISTER" ) ), ConsesLow.list( makeSymbol( "SENTENTIAL-TREE-P" ), makeSymbol( "SISTER" ) ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SISTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                        ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list(
                            makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "SBAR-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list(
                                makeSymbol( "SBARQ-TREE-P" ), makeSymbol( "ANCESTOR" ) ) ), ConsesLow.list( makeSymbol( "WHNP-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "MODIFIEDS" ),
                                        ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                                            ZERO_INTEGER ) ) ) ) ) ) ) );
    $sym674$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $list675 = ConsesLow.list( makeString( "@return listp; a list of trees this preposition modifies" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEMENTS" ), NIL ), ConsesLow
        .list( makeSymbol( "CANDIDATES" ), NIL ), ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-MOTHER" ) ) ) ), ConsesLow.list( makeSymbol( "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WHPP-TREE-P" ), makeSymbol(
                        "MOTHER" ) ), ConsesLow.list( makeSymbol( "QUESTION-TREE-P" ), makeSymbol( "GRANDMOTHER" ) ), makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol( "SQ-TREE-P" ), makeSymbol( "SISTER" ) ) ),
                        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LAST-PHRASE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SISTER" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PHRASE-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LAST-PHRASE" ),
                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CANDIDATES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LAST-PHRASE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "GET-HEADS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CANDIDATES" ), ConsesLow.list(
                                        makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), makeSymbol( "GRANDMOTHER-HEAD" ) ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
                                                .list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                    makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                        "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "GET-HEAD" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADJECTIVAL-WORD-TREE-P" ), makeSymbol( "GRANDMOTHER-HEAD" ) ), NIL ), ConsesLow.list(
                                                                ConsesLow.list( EQ, makeSymbol( "GRANDMOTHER-HEAD" ), makeSymbol( "SELF" ) ), NIL ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                                                    "GRANDMOTHER-HEAD" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CANDIDATE" ), makeSymbol( "CANDIDATES" ) ),
                                                                        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CANDIDATE" ),
                                                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ,
                                                                                makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                    "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CANDIDATE" ), makeSymbol( "COMPLEMENTS" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-DIFFERENCE" ), makeSymbol( "CANDIDATES" ), makeSymbol( "COMPLEMENTS" ) ) ) ) );
    $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD" );
    $sym677$PHRASE_TREE_P = makeSymbol( "PHRASE-TREE-P" );
    $sym678$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD" );
    $list679 = ConsesLow.list( makeString( "@return listp; the unique referents of this word" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-REFS" ), NIL ) ), ConsesLow.list(
        makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "STRING" ), makeString( "of" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIM" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ),
            ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "REF" ), makeSymbol( "COMP-REFS" ) ) ), ConsesLow.list( makeSymbol( "SET-WORD-TREE-REFS" ), makeSymbol( "SELF" ), makeSymbol( "COMP-REFS" ) ) ) ), ConsesLow
                .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-WORD-TREE-REFS" ), makeSymbol( "SELF" ) ) ) );
    $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD" );
    $sym681$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD" );
    $list682 = ConsesLow.list( makeString( "@return parse-tree-p; the tree that serves as an antecedent to this wh word" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "STRING" ),
        makeString( "that" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NP-TREE-P" ),
                makeSymbol( "GRANDMOTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-HEAD" ) ) ) ) ) ) ) );
    $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD" );
    $sym684$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD" );
    $sym685$PREPOSITIONAL_WORD_TREE = makeSymbol( "PREPOSITIONAL-WORD-TREE" );
    $list686 = ConsesLow.list( makeSymbol( "PREPOSITIONAL-TREE" ) );
    $sym687$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS" );
    $sym688$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE" );
    $sym689$PARTICLE_WORD_TREE = makeSymbol( "PARTICLE-WORD-TREE" );
    $list690 = ConsesLow.list( makeSymbol( "PARTICLE-TREE" ) );
    $sym691$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS" );
    $sym692$SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE" );
    $sym693$SPECIFIER_WORD_TREE = makeSymbol( "SPECIFIER-WORD-TREE" );
    $list694 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SPECIFIED" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym695$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS" );
    $sym696$SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE" );
    $sym697$GET_SPECIFIED = makeSymbol( "GET-SPECIFIED" );
    $list698 = ConsesLow.list( makeString( "@return parse-tree-p; the tree that this specifier specifies" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) );
    $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SPECIFIER-WORD-TREE-METHOD" );
    $sym700$SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD = makeSymbol( "SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD" );
    $sym701$QUANTIFIER_WORD_TREE = makeSymbol( "QUANTIFIER-WORD-TREE" );
    $list702 = ConsesLow.list( makeSymbol( "QUANTIFIER-TREE" ), makeSymbol( "QUANTIFIER-WORD" ) );
    $list703 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIED" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-SPECIFIED" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol(
            "KEYWORDS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ) );
    $list704 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "RESTR" ), makeKeyword(
        "SCOPE" ) ) ) ) );
    $list705 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ) ), ConsesLow.list( makeSymbol(
        "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
            makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol( "DISJUNCTS" ) ) ) ) );
    $list706 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "RESTR" ), makeKeyword( "SCOPE" ) );
    $sym707$QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $sym708$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS" );
    $sym709$SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE" );
    $sym710$GET_QUANTIFIED = makeSymbol( "GET-QUANTIFIED" );
    $list711 = ConsesLow.list( makeString( "@return word-tree; the word that restricts the variable that this determiner quantifies" ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "NOMINAL-PHRASE-TREE-P" ), makeSymbol( "MOTHER" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-HEAD" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "WHADJP-TREE-P" ), makeSymbol( "MOTHER" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ) ) ) );
    $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUANTIFIER-WORD-TREE-METHOD" );
    $sym713$QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD = makeSymbol( "QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD" );
    $list714 = ConsesLow.list( makeString( "@return word-tree; the word that this specifier specifies" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIED" ) ) ) ) );
    $sym715$QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD = makeSymbol( "QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD" );
    $sym716$DETERMINER_WORD_TREE = makeSymbol( "DETERMINER-WORD-TREE" );
    $sym717$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS" );
    $sym718$SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE" );
    $sym719$PRP__TREE = makeSymbol( "PRP$-TREE" );
    $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS" );
    $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE" );
    $list722 = ConsesLow.list( makeString( "my" ), makeString( "your" ), makeString( "his" ), makeString( "her" ), makeString( "its" ) );
    $list723 = ConsesLow.list( makeString( "our" ), makeString( "your" ), makeString( "their" ) );
    $list724 = ConsesLow.list( makeString( "@return listp; a list of numbers of this possessive pronoun with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "NUMBERS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "STRING" ), makeSymbol( "*SINGULAR-POSSESSIVE-PRONOUNS*" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeKeyword( "SINGULAR" ), makeSymbol( "NUMBERS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                "MEMBER?" ), makeSymbol( "STRING" ), makeSymbol( "*PLURAL-POSSESSIVE-PRONOUNS*" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeKeyword( "PLURAL" ),
                    makeSymbol( "NUMBERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NUMBERS" ) ) ) );
    $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP$-TREE-METHOD" );
    $sym726$PRP__TREE_GET_NUMBER_METHOD = makeSymbol( "PRP$-TREE-GET-NUMBER-METHOD" );
    $list727 = ConsesLow.list( makeString( "@return numberp; the person of this noun; 1, 2, or 3" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( EQUALP,
        makeSymbol( "STRING" ), makeString( "my" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "STRING" ), makeString( "your" ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( EQUALP,
            makeSymbol( "STRING" ), makeString( "our" ) ), ONE_INTEGER ), ConsesLow.list( T, THREE_INTEGER ) ) ) );
    $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP$-TREE-METHOD" );
    $str729$my = makeString( "my" );
    $str730$your = makeString( "your" );
    $str731$our = makeString( "our" );
    $sym732$PRP__TREE_GET_PERSON_METHOD = makeSymbol( "PRP$-TREE-GET-PERSON-METHOD" );
    $list733 = ConsesLow.list( makeString( "@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "ASSOC" ), makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "my" ), makeKeyword( "MASCULINE" ),
            makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "your" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "his" ), makeKeyword(
                "MASCULINE" ) ), ConsesLow.list( makeString( "her" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "its" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "our" ), makeKeyword(
                    "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "their" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ) ) ),
            ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ) ) ) );
    $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PRP$-TREE-METHOD" );
    $list735 = ConsesLow.list( ConsesLow.list( makeString( "my" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "your" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ),
        makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "his" ), makeKeyword( "MASCULINE" ) ), ConsesLow.list( makeString( "her" ), makeKeyword( "FEMININE" ) ), ConsesLow.list( makeString( "its" ), makeKeyword(
            "NEUTER" ) ), ConsesLow.list( makeString( "our" ), makeKeyword( "MASCULINE" ), makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ), ConsesLow.list( makeString( "their" ), makeKeyword( "MASCULINE" ),
                makeKeyword( "FEMININE" ), makeKeyword( "NEUTER" ) ) );
    $sym736$PRP__TREE_GET_GENDER_METHOD = makeSymbol( "PRP$-TREE-GET-GENDER-METHOD" );
    $sym737$WDT_WORD_TREE = makeSymbol( "WDT-WORD-TREE" );
    $list738 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REFS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-ANTECEDENT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym739$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS" );
    $sym740$SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE" );
    $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD" );
    $sym742$WDT_WORD_TREE_GET_REFS_METHOD = makeSymbol( "WDT-WORD-TREE-GET-REFS-METHOD" );
    $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD" );
    $sym744$WDT_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol( "WDT-WORD-TREE-GET-ANTECEDENT-METHOD" );
    $sym745$POSSESSIVE_WORD_TREE = makeSymbol( "POSSESSIVE-WORD-TREE" );
    $list746 = ConsesLow.list( makeSymbol( "POSSESSIVE-WORD" ) );
    $list747 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-POSSESSOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-POSSESSED" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol(
                "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM-INT" ), NIL,
                    makeKeyword( "PROTECTED" ) ) );
    $list748 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSSESSED" ) ) ) ) );
    $list749 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "POSSESSOR" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "POSSESSED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "POSSESSOR" ), ConsesLow.list( makeSymbol(
                "MEMBER" ), makeKeyword( "POSSESSOR" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSOR" ), makeSymbol( "POSSESSOR" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                        makeSymbol( "POSSESSED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "POSSESSED" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list(
                            makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSED" ), makeSymbol( "POSSESSED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $list750 = ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSSESSED" ) );
    $sym751$GET_POSSESSED = makeSymbol( "GET-POSSESSED" );
    $kw752$POSSESSED = makeKeyword( "POSSESSED" );
    $sym753$POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD" );
    $sym754$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS" );
    $sym755$SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE" );
    $list756 = ConsesLow.list( makeString( "@return nominal-word-tree-p; the word that is the possessor in this possessive relation" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "POSSESSOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "POSSESSOR" ), makeSymbol( "POSSESSOR" ) ) ) ) );
    $sym757$POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD" );
    $list758 = ConsesLow.list( makeString( "@return nominal-word-tree-p; the word that is the possessed in this possessive relation" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "GRANDMOTHER-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "NOMINAL-PHRASE-TREE-P" ), makeSymbol( "GRANDMOTHER" ) ), ConsesLow
                .list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                    "FWHEN" ), makeSymbol( "GRANDMOTHER-HEAD" ), makeSymbol( "GRANDMOTHER-HEAD" ) ) ) ) );
    $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD" );
    $sym760$POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD" );
    $list761 = ConsesLow.list( makeString( "@return listp; a list of all complements of this tree, in surface order" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEMENTS" ),
        NIL ), ConsesLow.list( makeSymbol( "POSSESSOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol(
            "POSSESSED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                "POSSESSED" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "POSSESSED" ), makeSymbol( "COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "POSSESSOR" ), ConsesLow.list(
                    makeSymbol( "CPUSH" ), makeSymbol( "POSSESSOR" ), makeSymbol( "COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COMPLEMENTS" ) ) ) );
    $sym762$POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD" );
    $list763 = ConsesLow.list( makeString( "@return listp; the constituents this possessive marker modifies" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSED" ) ) ) ) ), ConsesLow.list(
            makeSymbol( "PWHEN" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "CANDIDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                    "LIST" ), makeSymbol( "CANDIDATE" ) ) ) ) ) ) ) );
    $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD" );
    $sym765$POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD" );
    $sym766$CARDINAL_WORD_TREE = makeSymbol( "CARDINAL-WORD-TREE" );
    $list767 = ConsesLow.list( makeSymbol( "NUMERICAL-TREE" ) );
    $sym768$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS" );
    $sym769$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE" );
    $sym770$EXISTENTIAL_WORD_TREE = makeSymbol( "EXISTENTIAL-WORD-TREE" );
    $sym771$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS" );
    $sym772$SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE" );
    $sym773$PUNCTUATION_WORD_TREE = makeSymbol( "PUNCTUATION-WORD-TREE" );
    $list774 = ConsesLow.list( makeSymbol( "PUNCTUATION-WORD" ) );
    $sym775$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS" );
    $sym776$SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE" );
    $list777 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "NN" ), makeSymbol( "NN-TREE" ) ), ConsesLow.cons( makeKeyword( "NNS" ), makeSymbol( "NNS-TREE" ) ), ConsesLow.cons( makeKeyword( "NNP" ),
        makeSymbol( "NNP-TREE" ) ), ConsesLow.cons( makeKeyword( "NNPS" ), makeSymbol( "NNPS-TREE" ) ), ConsesLow.cons( makeKeyword( "NPS" ), makeSymbol( "NNPS-TREE" ) ), ConsesLow.cons( makeKeyword( "NP" ), makeSymbol(
            "NAME-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "NPLIST" ), makeSymbol( "NOMINAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "WP" ), makeSymbol( "WP-TREE" ) ), ConsesLow.cons( makeKeyword( "PP" ),
                makeSymbol( "NOMINAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "PRP" ), makeSymbol( "PRP-TREE" ) ), ConsesLow.cons( makeKeyword( "FW" ), makeSymbol( "NOMINAL-WORD-TREE" ) ), ConsesLow.cons(
                    makeKeyword( "VBZ" ), makeSymbol( "VBZ-TREE" ) ), ConsesLow.cons( makeKeyword( "VBN" ), makeSymbol( "VBN-TREE" ) ), ConsesLow.cons( makeKeyword( "VBD" ), makeSymbol( "VBD-TREE" ) ), ConsesLow.cons(
                        makeKeyword( "VBP" ), makeSymbol( "VBP-TREE" ) ), ConsesLow.cons( makeKeyword( "VB" ), makeSymbol( "VB-TREE" ) ), ConsesLow.cons( makeKeyword( "VBG" ), makeSymbol( "VBG-TREE" ) ), ConsesLow.cons(
                            makeKeyword( "AUX" ), makeSymbol( "AUX-VERB-TREE" ) ), ConsesLow.cons( makeKeyword( "AUXZ" ), makeSymbol( "AUX-VERB-TREE" ) ), ConsesLow.cons( makeKeyword( "AUXD" ), makeSymbol(
                                "AUX-VERB-TREE" ) ), ConsesLow.cons( makeKeyword( "AUXG" ), makeSymbol( "AUX-VERB-TREE" ) ), ConsesLow.cons( makeKeyword( "MD" ), makeSymbol( "MODAL-VERB-TREE" ) ), ConsesLow.cons(
                                    makeKeyword( "IN" ), makeSymbol( "PREPOSITIONAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "TO" ), makeSymbol( "PREPOSITIONAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "CC" ),
                                        makeSymbol( "COORDINATE-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "JJ" ), makeSymbol( "ADJECTIVAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "JJR" ), makeSymbol(
                                            "ADJECTIVAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "JJS" ), makeSymbol( "ADJECTIVAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "RB" ), makeSymbol(
                                                "ADVERBIAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "WRB" ), makeSymbol( "WRB-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "RBR" ), makeSymbol(
                                                    "ADVERBIAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "RBS" ), makeSymbol( "ADVERBIAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "DT" ), makeSymbol(
                                                        "DETERMINER-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "WDT" ), makeSymbol( "WDT-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "PRP$" ), makeSymbol(
                                                            "PRP$-TREE" ) ), ConsesLow.cons( makeKeyword( "PDT" ), makeSymbol( "DETERMINER-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "PP$" ), makeSymbol(
                                                                "DETERMINER-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "RP" ), makeSymbol( "PARTICLE-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "POS" ), makeSymbol(
                                                                    "POSSESSIVE-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "CD" ), makeSymbol( "CARDINAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "EX" ), makeSymbol(
                                                                        "EXISTENTIAL-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "$" ), makeSymbol( "DOLLAR-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "." ), makeSymbol(
                                                                            "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "," ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( ":" ),
                                                                                makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "''" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons(
                                                                                    makeKeyword( "``" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "'" ), makeSymbol(
                                                                                        "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "`" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons(
                                                                                            makeKeyword( "(" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( ")" ), makeSymbol(
                                                                                                "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "-LRB-" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow
                                                                                                    .cons( makeKeyword( "-RRB-" ), makeSymbol( "PUNCTUATION-WORD-TREE" ) ), ConsesLow.cons( makeKeyword( "LS" ), makeSymbol(
                                                                                                        "PUNCTUATION-WORD-TREE" ) )
    } );
    $sym778$MULTI_NOUN_TREE = makeSymbol( "MULTI-NOUN-TREE" );
    $list779 = ConsesLow.list( ConsesLow.list( makeSymbol( "DAUGHTERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ) );
    $sym780$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS" );
    $sym781$SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE" );
    $sym782$VECTOR = makeSymbol( "VECTOR" );
    $sym783$COVERS = makeSymbol( "COVERS" );
    $list784 = ConsesLow.list( makeSymbol( "LIST-OF-STRINGS" ) );
    $list785 = ConsesLow.list( makeString(
        "@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T is the yield of the tree contains every string\n   in LIST-OF-STRINGS, NIL otherwise.\n   @owner bertolo" ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list(
                makeSymbol( "TREE-WORDS" ), NIL ), ConsesLow.list( makeSymbol( "FAIL" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "YIELD" ) ), ConsesLow.list(
                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "TREE-WORDS" ) ) ), ConsesLow.list(
                        makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "LIST-OF-STRINGS" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "MATCH" ) ),
                            ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "TREE-WORDS" ), makeSymbol( "MATCH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP,
                                makeSymbol( "TERM" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MATCH" ), T ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "MATCH" ),
                                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), T ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "FAIL" ) ) ) ) );
    $sym786$PARSE_TREE_COVERS_METHOD = makeSymbol( "PARSE-TREE-COVERS-METHOD" );
    $sym787$COVERS_MINIMALLY = makeSymbol( "COVERS-MINIMALLY" );
    $list788 = ConsesLow.list( makeString( "@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T all the subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo" ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COVERS" ) ), makeSymbol( "LIST-OF-STRINGS" ) ), ConsesLow
            .list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ),
                makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "DO-VECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ), makeKeyword(
                    "ELEMENT-NUM" ), NIL, makeKeyword( "DONE" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "COVERS" ) ), makeSymbol( "LIST-OF-STRINGS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), T ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                            makeSymbol( "CNOT" ), makeSymbol( "FAIL" ) ) ) ) );
    $list789 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $sym790$PARSE_TREE_COVERS_MINIMALLY_METHOD = makeSymbol( "PARSE-TREE-COVERS-MINIMALLY-METHOD" );
    $sym791$GET_MINIMALLY_COVERING_SUBTREES = makeSymbol( "GET-MINIMALLY-COVERING-SUBTREES" );
    $list792 = ConsesLow.list( makeString(
        "@param LIST-OF-STRINGS listp; a list of strings\n   @return listp; a list of all the minimal subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo" ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MINIMAL" ), NIL ), ConsesLow.list( makeSymbol( "QUEUE" ), ConsesLow.list( makeSymbol( "CREATE-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol(
                "ENQUEUE" ), makeSymbol( "SELF" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol( "UNTIL" ), ConsesLow.list( makeSymbol( "QUEUE-EMPTY-P" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol(
                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBTREE" ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "SUBTREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COVERS-MINIMALLY" ) ), makeSymbol( "LIST-OF-STRINGS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                            makeSymbol( "SUBTREE" ), makeSymbol( "MINIMAL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBTREE" ),
                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COVERS" ) ), makeSymbol( "LIST-OF-STRINGS" ) ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "SUBTREE" ) ) ), ConsesLow
                                    .list( makeSymbol( "DO-VECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SUBTREE" ) ) ), ConsesLow.list(
                                        makeSymbol( "ENQUEUE" ), makeSymbol( "DAUGHTER" ), makeSymbol( "QUEUE" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MINIMAL" ) ) ) );
    $sym793$PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD = makeSymbol( "PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD" );
  }
}
/*
 * 
 * Total time: 5589 ms
 * 
 */