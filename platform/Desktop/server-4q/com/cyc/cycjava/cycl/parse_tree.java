package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_tree
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parse_tree";
  public static final String myFingerPrint = "1e233b7be1ad5e1969a21d10cb12941aab9e1f3f3521bc255820471b7e549e6e";
  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 22761L)
  private static SubLSymbol $phrase_tree_allow_adjacent_daughters_to_merge$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 26800L)
  private static SubLSymbol $category_to_phrase$;
  private static final SubLSymbol $sym0$NOMINAL_TREE;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$VERBAL_TREE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$ADVERBIAL_TREE;
  private static final SubLSymbol $sym5$PREPOSITIONAL_TREE;
  private static final SubLSymbol $sym6$PARTICLE_TREE;
  private static final SubLSymbol $sym7$ADJECTIVAL_TREE;
  private static final SubLSymbol $sym8$QUESTION_TREE;
  private static final SubLSymbol $sym9$WH_TREE;
  private static final SubLSymbol $sym10$NUMERICAL_TREE;
  private static final SubLSymbol $sym11$FINITE_VERBAL_WORD_TREE;
  private static final SubLSymbol $sym12$QUANTIFIER_TREE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$PRONOUN_TREE;
  private static final SubLSymbol $sym15$PARSE_TREE;
  private static final SubLSymbol $sym16$OBJECT;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$CONTEXT;
  private static final SubLSymbol $sym20$MODIFIERS;
  private static final SubLSymbol $sym21$IDX;
  private static final SubLSymbol $sym22$MOTHER;
  private static final SubLSymbol $sym23$CATEGORY;
  private static final SubLSymbol $sym24$STRING;
  private static final SubLSymbol $sym25$GET_CYCLIFIER;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $kw30$LEXICON;
  private static final SubLSymbol $sym31$CYCLIFIER_LEXICON;
  private static final SubLSymbol $kw32$SCORE_FUNCTION;
  private static final SubLSymbol $sym33$CYCLIFICATION_SCORE;
  private static final SubLSymbol $kw34$OUTPUT;
  private static final SubLSymbol $kw35$BRIEF;
  private static final SubLSymbol $kw36$WFF_CHECK_;
  private static final SubLSymbol $kw37$CONTEXT;
  private static final SubLSymbol $kw38$DISAMBIGUATOR;
  private static final SubLSymbol $kw39$COREFERENCE_RESOLVER;
  private static final SubLSymbol $kw40$ERROR_HANDLING;
  private static final SubLSymbol $kw41$THROW;
  private static final SubLSymbol $kw42$SUBCYCLIFIER_POOL;
  private static final SubLSymbol $sym43$DATE_CYCLIFIER;
  private static final SubLSymbol $sym44$CYCLIFIER_LEXICON_P;
  private static final SubLSymbol $sym45$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym46$KEYWORDP;
  private static final SubLSymbol $sym47$PARSE_TREE_CONTEXT_P;
  private static final SubLSymbol $sym48$BOOLEANP;
  private static final SubLList $list49;
  private static final SubLString $str50$Invalid_error_handling_tag__a;
  private static final SubLSymbol $sym51$CYCLIFIER_POOL_P;
  private static final SubLSymbol $sym52$CYCLIFIER;
  private static final SubLSymbol $sym53$LEXIFY;
  private static final SubLSymbol $sym54$PARSE_TREE_CONTEXT;
  private static final SubLSymbol $sym55$DISAMBIGUATE;
  private static final SubLSymbol $sym56$PARSE_TREE_GET_CYCLIFIER_METHOD;
  private static final SubLSymbol $sym57$CYCLIFY;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$HAS_NEXT_;
  private static final SubLSymbol $sym60$NEXT;
  private static final SubLSymbol $sym61$PARSE_TREE_CYCLIFY_METHOD;
  private static final SubLSymbol $sym62$INSTANCE_COUNT;
  private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CLASS;
  private static final SubLSymbol $sym64$ISOLATED_P;
  private static final SubLSymbol $sym65$INSTANCE_NUMBER;
  private static final SubLSymbol $sym66$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_INSTANCE;
  private static final SubLSymbol $sym67$DEEP_COPY;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$NEW;
  private static final SubLSymbol $sym70$PARSE_TREE_DEEP_COPY_METHOD;
  private static final SubLSymbol $sym71$GET_ROOT;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$ROOT_P;
  private static final SubLSymbol $sym74$GET_MOTHER;
  private static final SubLSymbol $sym75$PARSE_TREE_GET_ROOT_METHOD;
  private static final SubLSymbol $sym76$GET_CATEGORY;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym79$PARSE_TREE_GET_CATEGORY_METHOD;
  private static final SubLSymbol $sym80$GET_INDEX;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym83$PARSE_TREE_GET_INDEX_METHOD;
  private static final SubLSymbol $sym84$GET_PATH;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym87$GET_ANCESTORS;
  private static final SubLSymbol $sym88$PARSE_TREE_GET_PATH_METHOD;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym91$PARSE_TREE_GET_MOTHER_METHOD;
  private static final SubLSymbol $sym92$GET_SEMANTIC_HEAD;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$GET_SEMANTIC_HEADS;
  private static final SubLSymbol $sym95$PARSE_TREE_GET_SEMANTIC_HEAD_METHOD;
  private static final SubLSymbol $sym96$GET_COMPLEMENTS;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$GET_HEAD;
  private static final SubLSymbol $sym99$PARSE_TREE_GET_COMPLEMENTS_METHOD;
  private static final SubLSymbol $sym100$GET_MODIFIERS;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$PARSE_TREE_GET_MODIFIERS_METHOD;
  private static final SubLSymbol $sym103$GET_MODIFIEDS;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$PARSE_TREE_GET_MODIFIEDS_METHOD;
  private static final SubLSymbol $sym106$GET_CONTEXT;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym109$PARSE_TREE_GET_CONTEXT_METHOD;
  private static final SubLSymbol $sym110$TEMPORAL_TREE_P;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$PARSE_TREE_TEMPORAL_TREE_P_METHOD;
  private static final SubLSymbol $sym113$CYCLIFIABLE_QUESTION_P;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$PARSE_TREE_CYCLIFIABLE_QUESTION_P_METHOD;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym118$PARSE_TREE_ROOT_P_METHOD;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$LEXIFY_INT;
  private static final SubLSymbol $sym122$PARSE_TREE_LEXIFY_METHOD;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$PARSE_TREE_LEXIFY_INT_METHOD;
  private static final SubLSymbol $sym126$CYCLIFY_INT;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$PARSE_TREE_CYCLIFY_INT_METHOD;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym131$PARSE_TREE_GET_ANCESTORS_METHOD;
  private static final SubLSymbol $sym132$GET_SISTER;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym136$INTEGERP;
  private static final SubLSymbol $sym137$GET_DAUGHTER;
  private static final SubLSymbol $sym138$PARSE_TREE_GET_SISTER_METHOD;
  private static final SubLSymbol $sym139$PRINT;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$PARSE_TREE_PRINT_METHOD;
  private static final SubLString $str143$__W_;
  private static final SubLString $str144$_;
  private static final SubLSymbol $sym145$GET_RANKED_LEXES;
  private static final SubLString $str146$_;
  private static final SubLString $str147$__;
  private static final SubLSymbol $sym148$GET_STRING;
  private static final SubLString $str149$_;
  private static final SubLSymbol $sym150$RETOKENIZE;
  private static final SubLList $list151;
  private static final SubLSymbol $kw152$ALL;
  private static final SubLSymbol $kw153$DFR2L;
  private static final SubLSymbol $sym154$STACK;
  private static final SubLSymbol $sym155$ORDER_VAR;
  private static final SubLSymbol $sym156$POSSIBLE_ORDERS;
  private static final SubLSymbol $sym157$CLET;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$MUST;
  private static final SubLSymbol $sym161$MEMBER_;
  private static final SubLList $list162;
  private static final SubLString $str163$_S_is_not_one_of__S;
  private static final SubLSymbol $sym164$STACK_PUSH;
  private static final SubLSymbol $sym165$UNTIL;
  private static final SubLSymbol $sym166$COR;
  private static final SubLSymbol $sym167$STACK_EMPTY_P;
  private static final SubLSymbol $sym168$CSETQ;
  private static final SubLSymbol $sym169$STACK_POP;
  private static final SubLSymbol $sym170$PWHEN;
  private static final SubLSymbol $sym171$PHRASE_TREE_P;
  private static final SubLSymbol $sym172$DO_VECTOR;
  private static final SubLSymbol $sym173$DAUGHTER;
  private static final SubLSymbol $sym174$GET_PHRASE_TREE_DAUGHTERS;
  private static final SubLSymbol $kw175$BACKWARD_;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$CATEGORIES_VAR;
  private static final SubLSymbol $sym178$DO_PARSE_TREE_SUBTREES;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$FIM;
  private static final SubLList $list181;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$WORD_TREE_P;
  private static final SubLSymbol $sym184$PHRASE_TREE;
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$DAUGHTERS;
  private static final SubLSymbol $sym187$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_CLASS;
  private static final SubLSymbol $sym188$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_INSTANCE;
  private static final SubLSymbol $sym189$GET_HEAD_DAUGHTERS;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym192$GET_HEAD_DAUGHTER;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$PHRASE_TREE_GET_HEAD_DAUGHTER_METHOD;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$GET_HEADS;
  private static final SubLSymbol $sym197$PHRASE_TREE_GET_HEAD_METHOD;
  private static final SubLSymbol $sym198$GET_SEMANTIC_HEAD_DAUGHTERS;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym201$GET_SEMANTIC_HEAD_DAUGHTER;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTER_METHOD;
  private static final SubLSymbol $sym204$GET_REFS;
  private static final SubLList $list205;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$DAUGHTER_COUNT;
  private static final SubLSymbol $kw208$_;
  private static final SubLSymbol $sym209$PHRASE_TREE_GET_REFS_METHOD;
  private static final SubLList $list210;
  private static final SubLSymbol $sym211$PHRASE_TREE_GET_MODIFIERS_METHOD;
  private static final SubLSymbol $sym212$GET_CONJUNCTION;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$COORDINATE_WORD_TREE_P;
  private static final SubLSymbol $sym215$PHRASE_TREE_GET_CONJUNCTION_METHOD;
  private static final SubLList $list216;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$YIELD;
  private static final SubLSymbol $sym219$PHRASE_TREE_LEXIFY_INT_METHOD;
  private static final SubLList $list220;
  private static final SubLSymbol $sym221$PRETERMINAL_P;
  private static final SubLSymbol $sym222$RETOKENIZE_INT;
  private static final SubLSymbol $sym223$GET;
  private static final SubLSymbol $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY;
  private static final SubLList $list225;
  private static final SubLSymbol $sym226$PARTIAL_RETOKENIZE_INT;
  private static final SubLSymbol $sym227$PHRASE_TREE_RETOKENIZE_METHOD;
  private static final SubLList $list228;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym231$LEXIFY_WORDS;
  private static final SubLSymbol $sym232$PHRASE_TREE_RETOKENIZE_INT_METHOD;
  private static final SubLList $list233;
  private static final SubLList $list234;
  private static final SubLSymbol $sym235$PHRASE_TREE_PARTIAL_RETOKENIZE_INT_METHOD;
  private static final SubLList $list236;
  private static final SubLSymbol $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym238$COPY_LIST;
  private static final SubLSymbol $sym239$PHRASE_TREE_YIELD;
  private static final SubLSymbol $sym240$PHRASE_TREE_STRING;
  private static final SubLSymbol $sym241$PHRASE_TREE_ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY_METHOD;
  private static final SubLList $list242;
  private static final SubLSymbol $sym243$INSTANTIATE_SCOPE;
  private static final SubLSymbol $sym244$PHRASE_TREE_CYCLIFY_INT_METHOD;
  private static final SubLList $list245;
  private static final SubLString $str246$__P_;
  private static final SubLString $str247$__;
  private static final SubLList $list248;
  private static final SubLSymbol $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLString $str250$;
  private static final SubLString $str251$_;
  private static final SubLSymbol $sym252$PHRASE_TREE_GET_STRING_METHOD;
  private static final SubLList $list253;
  private static final SubLSymbol $kw254$DFL2R;
  private static final SubLSymbol $sym255$PHRASE_TREE_YIELD_METHOD;
  private static final SubLSymbol $sym256$GET_PARSE_EXPRESSION;
  private static final SubLList $list257;
  private static final SubLSymbol $sym258$PHRASE_TREE_GET_PARSE_EXPRESSION_METHOD;
  private static final SubLList $list259;
  private static final SubLSymbol $sym260$PHRASE_TREE_GET_HEADS_METHOD;
  private static final SubLList $list261;
  private static final SubLSymbol $sym262$PHRASE_TREE_GET_SEMANTIC_HEADS_METHOD;
  private static final SubLList $list263;
  private static final SubLSymbol $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym265$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym266$PHRASE_TREE_GET_DAUGHTER_METHOD;
  private static final SubLSymbol $sym267$GET_DESCENDANT;
  private static final SubLList $list268;
  private static final SubLList $list269;
  private static final SubLSymbol $sym270$LISTP;
  private static final SubLSymbol $sym271$PHRASE_TREE_GET_DESCENDANT_METHOD;
  private static final SubLSymbol $sym272$PARSE_TREE_P;
  private static final SubLSymbol $sym273$SEARCH;
  private static final SubLList $list274;
  private static final SubLList $list275;
  private static final SubLSymbol $sym276$STRINGP;
  private static final SubLSymbol $sym277$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym278$PHRASE_TREE_SEARCH_METHOD;
  private static final SubLList $list279;
  private static final SubLSymbol $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym281$PHRASE_TREE_DAUGHTER_COUNT_METHOD;
  private static final SubLList $list282;
  private static final SubLSymbol $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym284$PHRASE_TREE_PRETERMINAL_P_METHOD;
  private static final SubLSymbol $sym285$HYDRA_P;
  private static final SubLList $list286;
  private static final SubLSymbol $sym287$PHRASE_TREE_HYDRA_P_METHOD;
  private static final SubLSymbol $sym288$FIND;
  private static final SubLList $list289;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLString $str292$start__A__after_stop__A__when_fin;
  private static final SubLSymbol $sym293$PHRASE_TREE_FIND_METHOD;
  private static final SubLSymbol $sym294$FIND_FIRST;
  private static final SubLList $list295;
  private static final SubLList $list296;
  private static final SubLSymbol $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym298$PHRASE_TREE_FIND_FIRST_METHOD;
  private static final SubLSymbol $sym299$FIND_LAST;
  private static final SubLList $list300;
  private static final SubLList $list301;
  private static final SubLSymbol $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym303$PHRASE_TREE_FIND_LAST_METHOD;
  private static final SubLSymbol $sym304$FIND_ALL;
  private static final SubLList $list305;
  private static final SubLSymbol $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym307$PHRASE_TREE_FIND_ALL_METHOD;
  private static final SubLSymbol $sym308$FIND_ALL_SUBTREES_OF_CATEGORIES;
  private static final SubLList $list309;
  private static final SubLList $list310;
  private static final SubLSymbol $sym311$PHRASE_TREE_FIND_ALL_SUBTREES_OF_CATEGORIES_METHOD;
  private static final SubLSymbol $kw312$STRING;
  private static final SubLSymbol $sym313$EL_FORMULA_P;
  private static final SubLObject $const314$EverythingPSC;
  private static final SubLList $list315;
  private static final SubLSymbol $sym316$STRING_;
  private static final SubLSymbol $sym317$GET_VERBAL_COMPLEMENT;
  private static final SubLObject $const318$thereExists;
  private static final SubLList $list319;
  private static final SubLList $list320;
  private static final SubLString $str321$what;
  private static final SubLSymbol $sym322$NOMINAL_PHRASE_TREE;
  private static final SubLList $list323;
  private static final SubLList $list324;
  private static final SubLSymbol $sym325$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_CLASS;
  private static final SubLSymbol $sym326$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_INSTANCE;
  private static final SubLSymbol $sym327$GET_DETERMINER;
  private static final SubLList $list328;
  private static final SubLSymbol $sym329$NOMINAL_PHRASE_TREE_GET_DETERMINER_METHOD;
  private static final SubLSymbol $sym330$GET_OVERT_QUANTIFIER;
  private static final SubLList $list331;
  private static final SubLSymbol $sym332$NOMINAL_PHRASE_TREE_GET_OVERT_QUANTIFIER_METHOD;
  private static final SubLSymbol $sym333$GET_QUANTIFIER;
  private static final SubLList $list334;
  private static final SubLSymbol $sym335$NOMINAL_PHRASE_TREE_GET_QUANTIFIER_METHOD;
  private static final SubLSymbol $sym336$GET_POSSESSOR;
  private static final SubLList $list337;
  private static final SubLSymbol $sym338$NOMINAL_PHRASE_TREE_GET_POSSESSOR_METHOD;
  private static final SubLSymbol $sym339$GET_SPECIFIER;
  private static final SubLList $list340;
  private static final SubLSymbol $sym341$NOMINAL_PHRASE_TREE_GET_SPECIFIER_METHOD;
  private static final SubLSymbol $sym342$POSSESSIVE_P;
  private static final SubLList $list343;
  private static final SubLSymbol $sym344$NOMINAL_PHRASE_TREE_POSSESSIVE_P_METHOD;
  private static final SubLList $list345;
  private static final SubLSymbol $sym346$NOMINAL_PHRASE_TREE_TEMPORAL_TREE_P_METHOD;
  private static final SubLSymbol $sym347$DEFINITE_DESCRIPTION_P;
  private static final SubLList $list348;
  private static final SubLSymbol $sym349$NOMINAL_PHRASE_TREE_DEFINITE_DESCRIPTION_P_METHOD;
  private static final SubLSymbol $sym350$NAME_TREE_P;
  private static final SubLList $list351;
  private static final SubLSymbol $sym352$NOMINAL_PHRASE_TREE_NAME_TREE_P_METHOD;
  private static final SubLSymbol $sym353$GET_GENDER;
  private static final SubLList $list354;
  private static final SubLSymbol $sym355$NOMINAL_PHRASE_TREE_GET_GENDER_METHOD;
  private static final SubLSymbol $sym356$GET_NUMBER;
  private static final SubLList $list357;
  private static final SubLSymbol $sym358$NOMINAL_PHRASE_TREE_GET_NUMBER_METHOD;
  private static final SubLSymbol $sym359$GET_PERSON;
  private static final SubLList $list360;
  private static final SubLSymbol $sym361$NOMINAL_PHRASE_TREE_GET_PERSON_METHOD;
  private static final SubLSymbol $sym362$SINGULAR_P;
  private static final SubLList $list363;
  private static final SubLSymbol $sym364$NOMINAL_PHRASE_TREE_SINGULAR_P_METHOD;
  private static final SubLSymbol $sym365$PLURAL_P;
  private static final SubLList $list366;
  private static final SubLSymbol $sym367$NOMINAL_PHRASE_TREE_PLURAL_P_METHOD;
  private static final SubLList $list368;
  private static final SubLSymbol $sym369$ABSTRACT_LEXICON_P;
  private static final SubLSymbol $sym370$COPY;
  private static final SubLSymbol $sym371$GET_INSTANCE;
  private static final SubLSymbol $kw372$SEMTRANS;
  private static final SubLSymbol $sym373$SET;
  private static final SubLObject $const374$equals;
  private static final SubLSymbol $kw375$NOUN;
  private static final SubLSymbol $sym376$LEXES;
  private static final SubLSymbol $sym377$NOMINAL_PHRASE_TREE_LEXIFY_INT_METHOD;
  private static final SubLList $list378;
  private static final SubLSymbol $kw379$CD;
  private static final SubLSymbol $sym380$COORDINATE_PHRASE_P;
  private static final SubLSymbol $sym381$NOMINAL_TREE_P;
  private static final SubLSymbol $sym382$NOMINAL_WORD_TREE_P;
  private static final SubLSymbol $sym383$NOMINAL_PHRASE_TREE_P;
  private static final SubLSymbol $sym384$NOMINAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym385$NP_TREE;
  private static final SubLSymbol $sym386$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_CLASS;
  private static final SubLSymbol $sym387$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_INSTANCE;
  private static final SubLSymbol $sym388$NPP_TREE;
  private static final SubLSymbol $sym389$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_CLASS;
  private static final SubLSymbol $sym390$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_INSTANCE;
  private static final SubLSymbol $sym391$NX_TREE;
  private static final SubLSymbol $sym392$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_CLASS;
  private static final SubLSymbol $sym393$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_INSTANCE;
  private static final SubLSymbol $sym394$PNP_TREE;
  private static final SubLList $list395;
  private static final SubLSymbol $sym396$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_CLASS;
  private static final SubLSymbol $sym397$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_INSTANCE;
  private static final SubLList $list398;
  private static final SubLSymbol $sym399$PNP_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym400$WHNP_TREE;
  private static final SubLList $list401;
  private static final SubLSymbol $sym402$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_CLASS;
  private static final SubLSymbol $sym403$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_INSTANCE;
  private static final SubLSymbol $sym404$VERBAL_PHRASE_TREE;
  private static final SubLList $list405;
  private static final SubLList $list406;
  private static final SubLSymbol $sym407$CYCLIFY_INT_VP_COORDINATION;
  private static final SubLList $list408;
  private static final SubLSymbol $sym409$GET_SUBJECT;
  private static final SubLSymbol $sym410$CYCLIFY_INT_VP;
  private static final SubLSymbol $sym411$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_COORDINATION_METHOD;
  private static final SubLList $list412;
  private static final SubLSymbol $sym413$GET_SEMANTIC_COMPLEMENTS;
  private static final SubLSymbol $sym414$GET_KEYWORD_RENAMINGS;
  private static final SubLSymbol $sym415$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_METHOD;
  private static final SubLList $list416;
  private static final SubLSymbol $sym417$VP_COORDINATE_PHRASE_P;
  private static final SubLSymbol $sym418$VERBAL_PHRASE_TREE_CYCLIFY_INT_METHOD;
  private static final SubLList $list419;
  private static final SubLSymbol $sym420$CYCLIFIABLE_VERB_PHRASE_P;
  private static final SubLSymbol $sym421$VERBAL_PHRASE_TREE_VP_COORDINATE_PHRASE_P_METHOD;
  private static final SubLSymbol $sym422$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_CLASS;
  private static final SubLSymbol $sym423$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_INSTANCE;
  private static final SubLSymbol $sym424$GET_PREDICATE;
  private static final SubLList $list425;
  private static final SubLSymbol $sym426$VERBAL_PHRASE_TREE_GET_PREDICATE_METHOD;
  private static final SubLList $list427;
  private static final SubLSymbol $sym428$VERBAL_PHRASE_TREE_GET_NUMBER_METHOD;
  private static final SubLList $list429;
  private static final SubLSymbol $sym430$VERBAL_PHRASE_TREE_GET_PERSON_METHOD;
  private static final SubLSymbol $sym431$GET_TENSE;
  private static final SubLList $list432;
  private static final SubLSymbol $sym433$VERBAL_PHRASE_TREE_GET_TENSE_METHOD;
  private static final SubLList $list434;
  private static final SubLSymbol $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym436$VERBAL_PHRASE_TREE_GET_SUBJECT_METHOD;
  private static final SubLSymbol $sym437$GET_OBJECTS;
  private static final SubLList $list438;
  private static final SubLSymbol $sym439$VERBAL_PHRASE_TREE_GET_OBJECTS_METHOD;
  private static final SubLSymbol $sym440$GET_DIRECT_OBJECT;
  private static final SubLList $list441;
  private static final SubLSymbol $sym442$VERBAL_PHRASE_TREE_GET_DIRECT_OBJECT_METHOD;
  private static final SubLSymbol $sym443$GET_INDIRECT_OBJECT;
  private static final SubLList $list444;
  private static final SubLSymbol $sym445$VERBAL_PHRASE_TREE_GET_INDIRECT_OBJECT_METHOD;
  private static final SubLSymbol $sym446$GET_SEMANTIC_DIRECT_OBJECT;
  private static final SubLList $list447;
  private static final SubLSymbol $sym448$VERBAL_PHRASE_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD;
  private static final SubLSymbol $sym449$GET_SEMANTIC_INDIRECT_OBJECT;
  private static final SubLList $list450;
  private static final SubLSymbol $sym451$VERBAL_PHRASE_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD;
  private static final SubLSymbol $sym452$GET_SEMANTIC_SUBJECT;
  private static final SubLList $list453;
  private static final SubLSymbol $sym454$VERBAL_PHRASE_TREE_GET_SEMANTIC_SUBJECT_METHOD;
  private static final SubLSymbol $sym455$GET_SEMANTIC_OBJECTS;
  private static final SubLList $list456;
  private static final SubLSymbol $sym457$VERBAL_PHRASE_TREE_GET_SEMANTIC_OBJECTS_METHOD;
  private static final SubLList $list458;
  private static final SubLSymbol $sym459$VERBAL_PHRASE_TREE_GET_VERBAL_COMPLEMENT_METHOD;
  private static final SubLSymbol $sym460$COPULA_P;
  private static final SubLList $list461;
  private static final SubLSymbol $sym462$VERBAL_PHRASE_TREE_COPULA_P_METHOD;
  private static final SubLSymbol $sym463$DUMMY_TO_P;
  private static final SubLList $list464;
  private static final SubLString $str465$to;
  private static final SubLSymbol $sym466$VERBAL_PHRASE_TREE_DUMMY_TO_P_METHOD;
  private static final SubLSymbol $sym467$PASSIVE_P;
  private static final SubLList $list468;
  private static final SubLSymbol $sym469$VERBAL_PHRASE_TREE_PASSIVE_P_METHOD;
  private static final SubLSymbol $sym470$FINITE_P;
  private static final SubLList $list471;
  private static final SubLSymbol $sym472$VERBAL_PHRASE_TREE_FINITE_P_METHOD;
  private static final SubLSymbol $sym473$PARTITION_SEMANTIC_COMPLEMENTS;
  private static final SubLList $list474;
  private static final SubLSymbol $sym475$VERBAL_PHRASE_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD;
  private static final SubLSymbol $sym476$GET_ANCESTOR_OBJECTS;
  private static final SubLList $list477;
  private static final SubLSymbol $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym479$INVERTED_P;
  private static final SubLSymbol $sym480$VERBAL_PHRASE_TREE_GET_ANCESTOR_OBJECTS_METHOD;
  private static final SubLList $list481;
  private static final SubLSymbol $sym482$VERBAL_WORD_TREE_P;
  private static final SubLSymbol $sym483$VERBAL_PHRASE_TREE_P;
  private static final SubLSymbol $sym484$VERBAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLList $list485;
  private static final SubLSymbol $sym486$VERBAL_PHRASE_TREE_INVERTED_P_METHOD;
  private static final SubLSymbol $sym487$SENTENTIAL_TREE;
  private static final SubLList $list488;
  private static final SubLList $list489;
  private static final SubLSymbol $sym490$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_CLASS;
  private static final SubLSymbol $sym491$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_INSTANCE;
  private static final SubLList $list492;
  private static final SubLSymbol $sym493$SENTENTIAL_TREE_GET_SUBJECT_METHOD;
  private static final SubLList $list494;
  private static final SubLSymbol $sym495$GET_ANTECEDENT;
  private static final SubLSymbol $sym496$SENTENTIAL_TREE_GET_MODIFIEDS_METHOD;
  private static final SubLSymbol $sym497$VP_TREE;
  private static final SubLSymbol $sym498$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_CLASS;
  private static final SubLSymbol $sym499$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_INSTANCE;
  private static final SubLSymbol $sym500$VG_TREE;
  private static final SubLSymbol $sym501$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_CLASS;
  private static final SubLSymbol $sym502$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_INSTANCE;
  private static final SubLSymbol $sym503$S1_TREE;
  private static final SubLSymbol $sym504$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_CLASS;
  private static final SubLSymbol $sym505$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_INSTANCE;
  private static final SubLSymbol $sym506$S_TREE;
  private static final SubLList $list507;
  private static final SubLSymbol $sym508$SUBLOOP_RESERVED_INITIALIZE_S_TREE_CLASS;
  private static final SubLSymbol $sym509$SUBLOOP_RESERVED_INITIALIZE_S_TREE_INSTANCE;
  private static final SubLList $list510;
  private static final SubLSymbol $sym511$OUTER_CATCH_FOR_S_TREE_METHOD;
  private static final SubLSymbol $sym512$S_TREE_GET_ANCESTOR_OBJECTS_METHOD;
  private static final SubLSymbol $sym513$SBAR_TREE;
  private static final SubLSymbol $sym514$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_CLASS;
  private static final SubLSymbol $sym515$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_INSTANCE;
  private static final SubLSymbol $sym516$SBARQ_TREE;
  private static final SubLList $list517;
  private static final SubLList $list518;
  private static final SubLSymbol $sym519$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_CLASS;
  private static final SubLSymbol $sym520$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_INSTANCE;
  private static final SubLList $list521;
  private static final SubLSymbol $sym522$VERBAL_TREE_P;
  private static final SubLSymbol $sym523$SBARQ_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLList $list524;
  private static final SubLSymbol $sym525$SBARQ_TREE_GET_ANCESTOR_OBJECTS_METHOD;
  private static final SubLSymbol $sym526$SQ_TREE;
  private static final SubLList $list527;
  private static final SubLSymbol $sym528$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_CLASS;
  private static final SubLSymbol $sym529$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_INSTANCE;
  private static final SubLList $list530;
  private static final SubLSymbol $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD;
  private static final SubLSymbol $sym532$SQ_TREE_GET_ANCESTOR_OBJECTS_METHOD;
  private static final SubLSymbol $sym533$SINV_TREE;
  private static final SubLSymbol $sym534$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_CLASS;
  private static final SubLSymbol $sym535$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_INSTANCE;
  private static final SubLSymbol $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE;
  private static final SubLList $list537;
  private static final SubLSymbol $sym538$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE;
  private static final SubLSymbol $sym539$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE;
  private static final SubLList $list540;
  private static final SubLSymbol $sym541$PREPOSITIONAL_TREE_P;
  private static final SubLSymbol $sym542$PARTICLE_TREE_P;
  private static final SubLSymbol $sym543$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym544$GET_OBLIQUE_OBJECT;
  private static final SubLList $list545;
  private static final SubLSymbol $sym546$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_OBLIQUE_OBJECT_METHOD;
  private static final SubLSymbol $sym547$STRANDED_P;
  private static final SubLList $list548;
  private static final SubLSymbol $sym549$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_STRANDED_P_METHOD;
  private static final SubLSymbol $sym550$PREPOSITIONAL_PHRASE_TREE;
  private static final SubLList $list551;
  private static final SubLSymbol $sym552$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_CLASS;
  private static final SubLSymbol $sym553$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_INSTANCE;
  private static final SubLSymbol $sym554$PP_TREE;
  private static final SubLSymbol $sym555$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_CLASS;
  private static final SubLSymbol $sym556$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_INSTANCE;
  private static final SubLSymbol $sym557$WHPP_TREE;
  private static final SubLSymbol $sym558$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_CLASS;
  private static final SubLSymbol $sym559$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_INSTANCE;
  private static final SubLSymbol $sym560$PRT_TREE;
  private static final SubLList $list561;
  private static final SubLSymbol $sym562$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_CLASS;
  private static final SubLSymbol $sym563$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_INSTANCE;
  private static final SubLList $list564;
  private static final SubLSymbol $sym565$PRT_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym566$ADJP_TREE;
  private static final SubLList $list567;
  private static final SubLSymbol $sym568$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_CLASS;
  private static final SubLSymbol $sym569$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_INSTANCE;
  private static final SubLList $list570;
  private static final SubLSymbol $sym571$ADJECTIVAL_TREE_P;
  private static final SubLSymbol $sym572$ADJP_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLList $list573;
  private static final SubLSymbol $sym574$ADJP_TREE_GET_MODIFIEDS_METHOD;
  private static final SubLSymbol $sym575$WHADJP_TREE;
  private static final SubLList $list576;
  private static final SubLSymbol $sym577$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_CLASS;
  private static final SubLSymbol $sym578$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_INSTANCE;
  private static final SubLList $list579;
  private static final SubLSymbol $sym580$WHADJP_TREE_LEXIFY_INT_METHOD;
  private static final SubLSymbol $sym581$ADVP_TREE;
  private static final SubLList $list582;
  private static final SubLSymbol $sym583$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_CLASS;
  private static final SubLSymbol $sym584$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_INSTANCE;
  private static final SubLList $list585;
  private static final SubLSymbol $sym586$ADVERBIAL_TREE_P;
  private static final SubLSymbol $sym587$ADVP_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym588$WHADVP_TREE;
  private static final SubLSymbol $sym589$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_CLASS;
  private static final SubLSymbol $sym590$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_INSTANCE;
  private static final SubLSymbol $sym591$FRAG_TREE;
  private static final SubLSymbol $sym592$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_CLASS;
  private static final SubLSymbol $sym593$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_INSTANCE;
  private static final SubLSymbol $sym594$QP_TREE;
  private static final SubLList $list595;
  private static final SubLList $list596;
  private static final SubLSymbol $sym597$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_CLASS;
  private static final SubLSymbol $sym598$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_INSTANCE;
  private static final SubLList $list599;
  private static final SubLSymbol $sym600$CARDINAL_WORD_TREE_P;
  private static final SubLSymbol $sym601$QP_TREE_GET_HEAD_DAUGHTERS_METHOD;
  private static final SubLSymbol $sym602$GET_QUANTIFIED;
  private static final SubLList $list603;
  private static final SubLSymbol $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD;
  private static final SubLSymbol $sym605$QP_TREE_GET_QUANTIFIED_METHOD;
  private static final SubLList $list606;
  private static final SubLSymbol $sym607$CYCLIFY_NUCLEUS;
  private static final SubLObject $const608$thereExistAtLeast;
  private static final SubLObject $const609$and;
  private static final SubLList $list610;
  private static final SubLSymbol $sym611$QP_TREE_CYCLIFY_INT_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 5558L)
  public static SubLObject nominal_tree_p(final SubLObject nominal_tree)
  {
    return interfaces.subloop_instanceof_interface( nominal_tree, $sym0$NOMINAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 5885L)
  public static SubLObject verbal_tree_p(final SubLObject verbal_tree)
  {
    return interfaces.subloop_instanceof_interface( verbal_tree, $sym2$VERBAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6664L)
  public static SubLObject adverbial_tree_p(final SubLObject adverbial_tree)
  {
    return interfaces.subloop_instanceof_interface( adverbial_tree, $sym4$ADVERBIAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6701L)
  public static SubLObject prepositional_tree_p(final SubLObject prepositional_tree)
  {
    return interfaces.subloop_instanceof_interface( prepositional_tree, $sym5$PREPOSITIONAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6742L)
  public static SubLObject particle_tree_p(final SubLObject particle_tree)
  {
    return interfaces.subloop_instanceof_interface( particle_tree, $sym6$PARTICLE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6778L)
  public static SubLObject adjectival_tree_p(final SubLObject adjectival_tree)
  {
    return interfaces.subloop_instanceof_interface( adjectival_tree, $sym7$ADJECTIVAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6816L)
  public static SubLObject question_tree_p(final SubLObject question_tree)
  {
    return interfaces.subloop_instanceof_interface( question_tree, $sym8$QUESTION_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6852L)
  public static SubLObject wh_tree_p(final SubLObject wh_tree)
  {
    return interfaces.subloop_instanceof_interface( wh_tree, $sym9$WH_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6882L)
  public static SubLObject numerical_tree_p(final SubLObject numerical_tree)
  {
    return interfaces.subloop_instanceof_interface( numerical_tree, $sym10$NUMERICAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6919L)
  public static SubLObject finite_verbal_word_tree_p(final SubLObject finite_verbal_word_tree)
  {
    return interfaces.subloop_instanceof_interface( finite_verbal_word_tree, $sym11$FINITE_VERBAL_WORD_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6965L)
  public static SubLObject quantifier_tree_p(final SubLObject quantifier_tree)
  {
    return interfaces.subloop_instanceof_interface( quantifier_tree, $sym12$QUANTIFIER_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7053L)
  public static SubLObject pronoun_tree_p(final SubLObject pronoun_tree)
  {
    return interfaces.subloop_instanceof_interface( pronoun_tree, $sym14$PRONOUN_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_context(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, SIX_INTEGER, $sym19$CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_context(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, SIX_INTEGER, $sym19$CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_modifiers(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, FIVE_INTEGER, $sym20$MODIFIERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_modifiers(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, FIVE_INTEGER, $sym20$MODIFIERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_idx(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, FOUR_INTEGER, $sym21$IDX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_idx(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, FOUR_INTEGER, $sym21$IDX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_mother(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, THREE_INTEGER, $sym22$MOTHER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_mother(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, THREE_INTEGER, $sym22$MOTHER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_category(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, TWO_INTEGER, $sym23$CATEGORY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_category(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, TWO_INTEGER, $sym23$CATEGORY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject get_parse_tree_string(final SubLObject v_parse_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( v_parse_tree, ONE_INTEGER, $sym24$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject set_parse_tree_string(final SubLObject v_parse_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_parse_tree, value, ONE_INTEGER, $sym24$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject parse_tree_get_cyclifier_method(final SubLObject self, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject v_context = get_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject lexicon_tail = cdestructuring_bind.property_list_member( $kw30$LEXICON, current );
        final SubLObject lexicon = ( NIL != lexicon_tail ) ? conses_high.cadr( lexicon_tail ) : object.new_class_instance( $sym31$CYCLIFIER_LEXICON );
        final SubLObject score_function_tail = cdestructuring_bind.property_list_member( $kw32$SCORE_FUNCTION, current );
        final SubLObject score_function = ( NIL != score_function_tail ) ? conses_high.cadr( score_function_tail ) : $sym33$CYCLIFICATION_SCORE;
        final SubLObject output_tail = cdestructuring_bind.property_list_member( $kw34$OUTPUT, current );
        final SubLObject output = ( NIL != output_tail ) ? conses_high.cadr( output_tail ) : $kw35$BRIEF;
        final SubLObject wff_checkP_tail = cdestructuring_bind.property_list_member( $kw36$WFF_CHECK_, current );
        final SubLObject wff_checkP = ( NIL != wff_checkP_tail ) ? conses_high.cadr( wff_checkP_tail ) : T;
        final SubLObject context_tail = cdestructuring_bind.property_list_member( $kw37$CONTEXT, current );
        SubLObject v_context_$1 = ( NIL != context_tail ) ? conses_high.cadr( context_tail ) : NIL;
        final SubLObject disambiguator_tail = cdestructuring_bind.property_list_member( $kw38$DISAMBIGUATOR, current );
        final SubLObject disambiguator = ( NIL != disambiguator_tail ) ? conses_high.cadr( disambiguator_tail ) : NIL;
        final SubLObject coreference_resolver_tail = cdestructuring_bind.property_list_member( $kw39$COREFERENCE_RESOLVER, current );
        final SubLObject v_coreference_resolver = ( NIL != coreference_resolver_tail ) ? conses_high.cadr( coreference_resolver_tail ) : NIL;
        final SubLObject error_handling_tail = cdestructuring_bind.property_list_member( $kw40$ERROR_HANDLING, current );
        final SubLObject error_handling = ( NIL != error_handling_tail ) ? conses_high.cadr( error_handling_tail ) : $kw41$THROW;
        final SubLObject subcyclifier_pool_tail = cdestructuring_bind.property_list_member( $kw42$SUBCYCLIFIER_POOL, current );
        final SubLObject subcyclifier_pool = ( NIL != subcyclifier_pool_tail ) ? conses_high.cadr( subcyclifier_pool_tail )
            : subcyclifier.new_cyclifier_pool( ConsesLow.list( object.new_class_instance( $sym43$DATE_CYCLIFIER ) ) );
        assert NIL != cyclifier_lexicon.cyclifier_lexicon_p( lexicon ) : lexicon;
        assert NIL != Types.function_spec_p( score_function ) : score_function;
        assert NIL != Types.keywordp( output ) : output;
        if( NIL != v_context_$1 && !assertionsDisabledInClass && NIL == context.parse_tree_context_p( v_context_$1 ) )
        {
          throw new AssertionError( v_context_$1 );
        }
        assert NIL != Types.booleanp( wff_checkP ) : wff_checkP;
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( error_handling, $list49, UNPROVIDED, UNPROVIDED ) )
        {
          Errors.error( $str50$Invalid_error_handling_tag__a, error_handling );
        }
        if( NIL != subcyclifier_pool && !assertionsDisabledInClass && NIL == subcyclifier.cyclifier_pool_p( subcyclifier_pool ) )
        {
          throw new AssertionError( subcyclifier_pool );
        }
        final SubLObject v_cyclifier = object.new_class_instance( $sym52$CYCLIFIER );
        cyclifier.set_cyclifier_score_function( v_cyclifier, score_function );
        cyclifier.set_cyclifier_output( v_cyclifier, output );
        cyclifier.set_cyclifier_error_handling( v_cyclifier, error_handling );
        cyclifier.set_cyclifier_subcyclifier_pool( v_cyclifier, subcyclifier_pool );
        if( NIL != lexicon )
        {
          methods.funcall_instance_method_with_1_args( self, $sym53$LEXIFY, lexicon );
        }
        if( NIL != disambiguator )
        {
          if( NIL == v_context_$1 )
          {
            v_context_$1 = object.new_class_instance( $sym54$PARSE_TREE_CONTEXT );
          }
          methods.funcall_instance_method_with_2_args( disambiguator, $sym55$DISAMBIGUATE, self, v_context_$1 );
        }
        cyclifier.set_cyclifier_tree( v_cyclifier, self );
        cyclifier.set_cyclifier_wff_checkP( v_cyclifier, wff_checkP );
        if( NIL != wff_checkP )
        {
          cyclifier.set_cyclifier_memoization_state( v_cyclifier, memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          cyclifier.set_cyclifier_sbhl_resource( v_cyclifier, sbhl_marking_vars.new_sbhl_marking_space_resource( TEN_INTEGER ) );
        }
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD, v_cyclifier );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context( self, v_context );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject parse_tree_cyclify_method(final SubLObject self, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args( self, $sym25$GET_CYCLIFIER, v_properties );
    SubLObject cycls = NIL;
    while ( NIL != methods.funcall_instance_method_with_0_args( v_cyclifier, $sym59$HAS_NEXT_ ))
    {
      cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( v_cyclifier, $sym60$NEXT ), cycls );
    }
    return Sequences.nreverse( cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject subloop_reserved_initialize_parse_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject subloop_reserved_initialize_parse_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
  public static SubLObject parse_tree_p(final SubLObject v_parse_tree)
  {
    return classes.subloop_instanceof_class( v_parse_tree, $sym15$PARSE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 9132L)
  public static SubLObject parse_tree_deep_copy_method(final SubLObject self)
  {
    final SubLObject class_of_self = subloop_structures.instance_class( self );
    final SubLObject v_new = methods.funcall_class_method_with_0_args( class_of_self, $sym69$NEW );
    SubLObject cdolist_list_var;
    final SubLObject all_instance_slots = cdolist_list_var = instances.instances_all_instance_slots( self );
    SubLObject instance_slot = NIL;
    instance_slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject slot_value = instances.get_slot( self, instance_slot );
      SubLObject value_copy = NIL;
      if( NIL != object.object_p( slot_value ) )
      {
        value_copy = methods.funcall_instance_method_with_0_args( slot_value, $sym67$DEEP_COPY );
      }
      else if( slot_value.isList() )
      {
        value_copy = conses_high.copy_list( slot_value );
      }
      else if( slot_value.isVector() )
      {
        value_copy = vector_utilities.copy_vector( slot_value );
      }
      else if( slot_value.isHashtable() )
      {
        value_copy = hash_table_utilities.copy_hashtable( slot_value, UNPROVIDED );
      }
      else
      {
        value_copy = slot_value;
      }
      instances.set_slot( v_new, instance_slot, value_copy );
      cdolist_list_var = cdolist_list_var.rest();
      instance_slot = cdolist_list_var.first();
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 9960L)
  public static SubLObject parse_tree_get_root_method(final SubLObject self)
  {
    SubLObject tree;
    for( tree = self; NIL == methods.funcall_instance_method_with_0_args( tree, $sym73$ROOT_P ); tree = methods.funcall_instance_method_with_0_args( tree, $sym74$GET_MOTHER ) )
    {
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10177L)
  public static SubLObject parse_tree_get_category_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject category = get_parse_tree_category( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD, category );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_category( self, category );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10308L)
  public static SubLObject parse_tree_get_index_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject idx = get_parse_tree_idx( self );
    try
    {
      thread.throwStack.push( $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD, idx );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_idx( self, idx );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10459L)
  public static SubLObject parse_tree_get_path_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject idx = get_parse_tree_idx( self );
    try
    {
      thread.throwStack.push( $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        SubLObject path = ( NIL != idx ) ? ConsesLow.list( idx ) : NIL;
        SubLObject cdolist_list_var = conses_high.butlast( methods.funcall_instance_method_with_0_args( self, $sym87$GET_ANCESTORS ), UNPROVIDED );
        SubLObject ancestor = NIL;
        ancestor = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          path = ConsesLow.cons( methods.funcall_instance_method_with_0_args( ancestor, $sym80$GET_INDEX ), path );
          cdolist_list_var = cdolist_list_var.rest();
          ancestor = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD, path );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_idx( self, idx );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10738L)
  public static SubLObject parse_tree_get_mother_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD, mother );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10861L)
  public static SubLObject parse_tree_get_semantic_head_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym94$GET_SEMANTIC_HEADS ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11113L)
  public static SubLObject parse_tree_get_complements_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym96$GET_COMPLEMENTS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11342L)
  public static SubLObject parse_tree_get_modifiers_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11467L)
  public static SubLObject parse_tree_get_modifieds_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11595L)
  public static SubLObject parse_tree_get_context_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject v_context = get_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD, v_context );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context( self, v_context );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11753L)
  public static SubLObject parse_tree_temporal_tree_p_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11955L)
  public static SubLObject parse_tree_cyclifiable_question_p_method(final SubLObject self)
  {
    return question_tree_p( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12116L)
  public static SubLObject parse_tree_root_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD, makeBoolean( NIL == mother ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12256L)
  public static SubLObject parse_tree_lexify_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_complete$.currentBinding( thread );
    try
    {
      cyclifier_interface.$allow_duplicate_cyclificationsP$.bind( T, thread );
      cyclifier_interface.$cyclification_complete$.bind( NIL, thread );
      methods.funcall_instance_method_with_1_args( self, $sym121$LEXIFY_INT, lexicon );
    }
    finally
    {
      cyclifier_interface.$cyclification_complete$.rebind( _prev_bind_2, thread );
      cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind( _prev_bind_0, thread );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12516L)
  public static SubLObject parse_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12685L)
  public static SubLObject parse_tree_cyclify_int_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12836L)
  public static SubLObject parse_tree_get_ancestors_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD, ( NIL != mother ) ? ConsesLow.cons( mother, methods.funcall_instance_method_with_0_args( mother, $sym87$GET_ANCESTORS ) ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13025L)
  public static SubLObject parse_tree_get_sister_method(final SubLObject self, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_method = NIL;
    final SubLObject idx = get_parse_tree_idx( self );
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
      try
      {
        assert NIL != Types.integerp( index ) : index;
        if( NIL != idx )
        {
          final SubLObject sister_index = Numbers.add( idx, index );
          Dynamic.sublisp_throw( $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD, ( NIL != mother && NIL != subl_promotions.non_negative_integer_p( sister_index ) ) ? methods.funcall_instance_method_with_1_args( mother,
              $sym137$GET_DAUGHTER, Numbers.add( idx, index ) ) : NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_idx( self, idx );
          set_parse_tree_mother( self, mother );
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
      catch_var_for_parse_tree_method = Errors.handleThrowable( ccatch_env_var, $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13475L)
  public static SubLObject parse_tree_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    return pprint_parse_tree( self, stream, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13665L)
  public static SubLObject pprint_word_tree(final SubLObject wt, final SubLObject stream, final SubLObject level)
  {
    final SubLObject indent = THREE_INTEGER;
    final SubLObject base_column = Numbers.multiply( level, indent );
    string_utilities.indent( stream, base_column );
    streams_high.write_string( $str143$__W_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( methods.funcall_instance_method_with_0_args( wt, $sym76$GET_CATEGORY ), stream );
    streams_high.write_string( $str144$_, stream, UNPROVIDED, UNPROVIDED );
    if( NIL != methods.funcall_instance_method_with_0_args( wt, $sym145$GET_RANKED_LEXES ) )
    {
      streams_high.write_string( $str146$_, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str147$__, stream, UNPROVIDED, UNPROVIDED );
    if( NIL != methods.funcall_instance_method_with_0_args( wt, $sym148$GET_STRING ) )
    {
      streams_high.write_string( methods.funcall_instance_method_with_0_args( wt, $sym148$GET_STRING ), stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str149$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    return wt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14193L)
  public static SubLObject pprint_parse_tree(final SubLObject pt, final SubLObject stream, final SubLObject level)
  {
    return ( NIL != phrase_tree_p( pt ) ) ? pprint_phrase_tree( pt, stream, level ) : pprint_word_tree( pt, stream, level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14424L)
  public static SubLObject new_parse_tree(final SubLObject parse_expression, SubLObject lexicon, SubLObject v_context)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym54$PARSE_TREE_CONTEXT );
    }
    return process_modifiers( process_abs_index( retag_aux_verbs( new_parse_tree_int( parse_expression, NIL, ZERO_INTEGER, lexicon, v_context ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14788L)
  public static SubLObject new_parse_tree_int(final SubLObject parse_expression, SubLObject mother, SubLObject index, SubLObject lexicon, SubLObject v_context)
  {
    if( mother == UNPROVIDED )
    {
      mother = NIL;
    }
    if( index == UNPROVIDED )
    {
      index = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym54$PARSE_TREE_CONTEXT );
    }
    final SubLObject tree = ( NIL != word_tree.phrase_expression_p( parse_expression ) ) ? parse_expression_to_phrase_tree( parse_expression, mother, index, lexicon, v_context )
        : word_tree.parse_expression_to_word_tree( parse_expression, mother, index, v_context );
    if( NIL != lexicon )
    {
      methods.funcall_instance_method_with_1_args( tree, $sym150$RETOKENIZE, lexicon );
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 15341L)
  public static SubLObject do_parse_tree_subtrees(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list151 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sub_tree = NIL;
    SubLObject v_parse_tree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list151 );
    sub_tree = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list151 );
    v_parse_tree = current.first();
    current = current.rest();
    final SubLObject doneP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list151 );
    current = current.rest();
    final SubLObject categories = current.isCons() ? current.first() : $kw152$ALL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list151 );
    current = current.rest();
    final SubLObject order = current.isCons() ? current.first() : $kw153$DFR2L;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list151 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list151 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( categories == $kw152$ALL )
    {
      final SubLObject stack = $sym154$STACK;
      final SubLObject order_var = $sym155$ORDER_VAR;
      final SubLObject possible_orders = $sym156$POSSIBLE_ORDERS;
      return ConsesLow.list( $sym157$CLET, ConsesLow.list( reader.bq_cons( stack, $list158 ), ConsesLow.list( order_var, order ), reader.bq_cons( possible_orders, $list159 ), sub_tree ), ConsesLow.list( $sym160$MUST,
          ConsesLow.listS( $sym161$MEMBER_, order_var, possible_orders, $list162 ), $str163$_S_is_not_one_of__S, order_var, possible_orders ), ConsesLow.list( $sym164$STACK_PUSH, v_parse_tree, stack ), ConsesLow.listS(
              $sym165$UNTIL, ConsesLow.list( $sym166$COR, ConsesLow.list( $sym167$STACK_EMPTY_P, stack ), doneP ), ConsesLow.list( $sym168$CSETQ, sub_tree, ConsesLow.list( $sym169$STACK_POP, stack ) ), ConsesLow.append(
                  body, ConsesLow.list( ConsesLow.list( $sym170$PWHEN, ConsesLow.list( $sym171$PHRASE_TREE_P, sub_tree ), ConsesLow.list( $sym172$DO_VECTOR, ConsesLow.list( $sym173$DAUGHTER, ConsesLow.list(
                      $sym174$GET_PHRASE_TREE_DAUGHTERS, sub_tree ), $kw175$BACKWARD_, ConsesLow.listS( EQ, order_var, $list176 ) ), ConsesLow.list( $sym164$STACK_PUSH, $sym173$DAUGHTER, stack ) ) ) ) ) ) );
    }
    final SubLObject categories_var = $sym177$CATEGORIES_VAR;
    return ConsesLow.list( $sym157$CLET, ConsesLow.list( ConsesLow.list( categories_var, categories ) ), ConsesLow.list( $sym178$DO_PARSE_TREE_SUBTREES, ConsesLow.list( sub_tree, v_parse_tree, doneP, $kw152$ALL, order ),
        ConsesLow.listS( $sym170$PWHEN, ConsesLow.list( $sym166$COR, ConsesLow.listS( EQ, categories_var, $list179 ), ConsesLow.list( $sym161$MEMBER_, ConsesLow.listS( $sym180$FIM, sub_tree, $list181 ),
            categories_var ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 16667L)
  public static SubLObject do_parse_tree_word_trees(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_word_tree = NIL;
    SubLObject v_parse_tree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    v_word_tree = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    v_parse_tree = current.first();
    current = current.rest();
    final SubLObject doneP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list182 );
    current = current.rest();
    final SubLObject categories = current.isCons() ? current.first() : $kw152$ALL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list182 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym178$DO_PARSE_TREE_SUBTREES, ConsesLow.listS( v_word_tree, v_parse_tree, doneP, categories, $list176 ), ConsesLow.listS( $sym170$PWHEN, ConsesLow.list( $sym183$WORD_TREE_P, v_word_tree ),
          ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list182 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
  public static SubLObject get_phrase_tree_daughters(final SubLObject phrase_tree)
  {
    return classes.subloop_get_access_protected_instance_slot( phrase_tree, SEVEN_INTEGER, $sym186$DAUGHTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
  public static SubLObject set_phrase_tree_daughters(final SubLObject phrase_tree, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( phrase_tree, value, SEVEN_INTEGER, $sym186$DAUGHTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
  public static SubLObject subloop_reserved_initialize_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
  public static SubLObject subloop_reserved_initialize_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
  public static SubLObject phrase_tree_p(final SubLObject phrase_tree)
  {
    return classes.subloop_instanceof_class( phrase_tree, $sym184$PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 18709L)
  public static SubLObject phrase_tree_get_head_daughters_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 18888L)
  public static SubLObject phrase_tree_get_head_daughter_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym189$GET_HEAD_DAUGHTERS ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19142L)
  public static SubLObject phrase_tree_get_head_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym196$GET_HEADS ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19368L)
  public static SubLObject phrase_tree_get_semantic_head_daughters_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym189$GET_HEAD_DAUGHTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19543L)
  public static SubLObject phrase_tree_get_semantic_head_daughter_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym198$GET_SEMANTIC_HEAD_DAUGHTERS ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19824L)
  public static SubLObject phrase_tree_get_refs_method(final SubLObject self)
  {
    SubLObject heads = methods.funcall_instance_method_with_0_args( self, $sym94$GET_SEMANTIC_HEADS );
    SubLObject refs = NIL;
    if( NIL == heads && methods.funcall_instance_method_with_0_args( self, $sym207$DAUGHTER_COUNT ).numE( ONE_INTEGER ) )
    {
      final SubLObject daughter = methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER );
      if( NIL != quantifier_tree_p( daughter ) && NIL != phrase_tree_p( daughter ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( daughter, $sym137$GET_DAUGHTER,
          ZERO_INTEGER ), $sym76$GET_CATEGORY ).eql( $kw208$_ ) )
      {
        heads = ConsesLow.cons( methods.funcall_instance_method_with_1_args( daughter, $sym137$GET_DAUGHTER, ZERO_INTEGER ), heads );
      }
      else
      {
        heads = ConsesLow.cons( daughter, heads );
      }
    }
    SubLObject cdolist_list_var = heads;
    SubLObject head = NIL;
    head = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args( head, $sym204$GET_REFS );
      SubLObject ref = NIL;
      ref = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        refs = ConsesLow.cons( ref, refs );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        ref = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      head = cdolist_list_var.first();
    }
    return refs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 20652L)
  public static SubLObject phrase_tree_get_modifiers_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym100$GET_MODIFIERS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 20862L)
  public static SubLObject phrase_tree_get_conjunction_method(final SubLObject self)
  {
    return phrase_tree_find_first_method( self, $sym214$COORDINATE_WORD_TREE_P, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 21056L)
  public static SubLObject phrase_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon)
  {
    SubLObject words = NIL;
    SubLObject orig_spelling = NIL;
    SubLObject normalized_spelling = NIL;
    SubLObject first_word1 = NIL;
    SubLObject first_word2 = NIL;
    SubLObject yield = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym73$ROOT_P ) )
    {
      yield = methods.funcall_instance_method_with_0_args( self, $sym218$YIELD );
      words = tree_yield_to_words( yield );
      orig_spelling = document.word_string( Vectors.aref( words, ZERO_INTEGER ) );
      pos_tagger.tagger_normalize_initial_capitalization( pos_tagger.get_tagger(), words );
      normalized_spelling = document.word_string( Vectors.aref( words, ZERO_INTEGER ) );
      first_word1 = yield.first();
      set_parse_tree_string( first_word1, normalized_spelling );
    }
    final SubLObject vector_var = daughters;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      methods.funcall_instance_method_with_1_args( daughter, $sym121$LEXIFY_INT, lexicon );
    }
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym73$ROOT_P ) )
    {
      first_word2 = methods.funcall_instance_method_with_0_args( self, $sym218$YIELD ).first();
      if( methods.funcall_instance_method_with_0_args( first_word1, $sym148$GET_STRING ).equalp( methods.funcall_instance_method_with_0_args( first_word2, $sym148$GET_STRING ) ) )
      {
        set_parse_tree_string( first_word2, orig_spelling );
      }
      else
      {
        final SubLObject tokens = string_utilities.split_string( get_parse_tree_string( first_word2 ), UNPROVIDED );
        final SubLObject new_string = string_utilities.bunge( ConsesLow.cons( orig_spelling, tokens.rest() ), UNPROVIDED );
        set_parse_tree_string( first_word2, new_string );
      }
      process_modifiers( process_abs_index( self ) );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 22837L)
  public static SubLObject phrase_tree_retokenize_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym221$PRETERMINAL_P ) )
    {
      result = methods.funcall_instance_method_with_2_args( self, $sym222$RETOKENIZE_INT, vector_utilities.vector_elements( instances.get_slot( self, $sym186$DAUGHTERS ), UNPROVIDED ), lexicon );
    }
    else if( NIL != methods.funcall_instance_method_with_1_args( lexicon, $sym223$GET, methods.funcall_instance_method_with_0_args( self, $sym148$GET_STRING ) ) )
    {
      result = methods.funcall_instance_method_with_2_args( self, $sym222$RETOKENIZE_INT, methods.funcall_instance_method_with_0_args( self, $sym218$YIELD ), lexicon );
    }
    else if( NIL != $phrase_tree_allow_adjacent_daughters_to_merge$.getDynamicValue( thread ) && NIL != methods.funcall_instance_method_with_1_args( self, $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, lexicon ) )
    {
      SubLObject current;
      final SubLObject datum = current = methods.funcall_instance_method_with_1_args( self, $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, lexicon );
      SubLObject word_lists = NIL;
      SubLObject constit_lists = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list225 );
      word_lists = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list225 );
      constit_lists = current.first();
      current = current.rest();
      if( NIL == current )
      {
        result = methods.funcall_instance_method_with_3_args( self, $sym226$PARTIAL_RETOKENIZE_INT, word_lists, constit_lists, lexicon );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list225 );
      }
    }
    else
    {
      result = self;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 23739L)
  public static SubLObject phrase_tree_retokenize_int_method(final SubLObject self, final SubLObject words, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject v_context = get_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        final SubLObject tokens = methods.funcall_instance_method_with_1_args( lexicon, $sym231$LEXIFY_WORDS, words );
        final SubLObject new_daughters = Vectors.make_vector( Sequences.length( tokens ), UNPROVIDED );
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject new_daughter = word_tree.new_word_tree( token.first(), conses_high.second( token ), self, i, NIL, v_context );
          Vectors.set_aref( new_daughters, i, new_daughter );
          i = Numbers.add( i, ONE_INTEGER );
          cdolist_list_var = cdolist_list_var.rest();
          token = cdolist_list_var.first();
        }
        set_phrase_tree_daughters( self, new_daughters );
        Dynamic.sublisp_throw( $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context( self, v_context );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 24174L)
  public static SubLObject phrase_tree_partial_retokenize_int_method(final SubLObject self, final SubLObject word_lists, final SubLObject daughter_lists, final SubLObject lexicon)
  {
    SubLObject new_daughters = NIL;
    SubLObject words = NIL;
    SubLObject words_$3 = NIL;
    SubLObject daughters = NIL;
    SubLObject daughters_$4 = NIL;
    words = word_lists;
    words_$3 = words.first();
    daughters = daughter_lists;
    daughters_$4 = daughters.first();
    while ( NIL != daughters || NIL != words)
    {
      if( NIL != words_$3 )
      {
        final SubLObject tokens = methods.funcall_instance_method_with_1_args( lexicon, $sym231$LEXIFY_WORDS, words_$3 );
        final SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          new_daughters = ConsesLow.cons( word_tree.new_word_tree( token.first(), conses_high.second( token ), self, i, NIL, instances.get_slot( self, $sym19$CONTEXT ) ), new_daughters );
          cdolist_list_var = cdolist_list_var.rest();
          token = cdolist_list_var.first();
        }
      }
      else
      {
        final SubLObject items_var = daughters_$4;
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            new_daughters = ConsesLow.cons( item, new_daughters );
          }
        }
        else
        {
          SubLObject cdolist_list_var2 = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            new_daughters = ConsesLow.cons( item2, new_daughters );
            cdolist_list_var2 = cdolist_list_var2.rest();
            item2 = cdolist_list_var2.first();
          }
        }
      }
      words = words.rest();
      words_$3 = words.first();
      daughters = daughters.rest();
      daughters_$4 = daughters.first();
    }
    final SubLObject replacement_daughters = list_utilities.list2vector( Sequences.nreverse( new_daughters ) );
    set_phrase_tree_daughters( self, replacement_daughters );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 25041L)
  public static SubLObject phrase_tree_adjacent_daughters_have_lexical_entry_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    final SubLObject string = get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject word_lists = NIL;
        SubLObject daughter_lists = NIL;
        final SubLObject all_daughters = list_utilities.vector2list( get_phrase_tree_daughters( self ) );
        final SubLObject daughter_count = Sequences.length( all_daughters );
        final SubLObject string_$5 = methods.funcall_instance_method_with_0_args( self, $sym148$GET_STRING );
        for( SubLObject current_start = ZERO_INTEGER; current_start.numL( daughter_count ); current_start = Numbers.add( current_start, ONE_INTEGER ) )
        {
          SubLObject num_daughters_used = NIL;
          final SubLObject start_for_iteration = current_start;
          if( NIL == num_daughters_used )
          {
            SubLObject end_var;
            SubLObject num;
            SubLObject daughters_$6;
            SubLObject yield;
            SubLObject raw_string;
            SubLObject current_string;
            for( end_var = start_for_iteration, num = NIL, num = daughter_count; NIL == num_daughters_used && !num.numLE( end_var ); num = Numbers.add( num, MINUS_ONE_INTEGER ) )
            {
              daughters_$6 = list_utilities.first_n( num, all_daughters );
              yield = Mapping.mapcan( Symbols.symbol_function( $sym238$COPY_LIST ), Mapping.mapcar( $sym239$PHRASE_TREE_YIELD, daughters_$6 ), EMPTY_SUBL_OBJECT_ARRAY );
              raw_string = Mapping.mapcar( $sym240$PHRASE_TREE_STRING, yield );
              current_string = string_utilities.bunge_according_to_string( raw_string, string_$5, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL != methods.funcall_instance_method_with_1_args( lexicon, $sym223$GET, current_string ) )
              {
                word_lists = ConsesLow.cons( yield, word_lists );
                daughter_lists = ConsesLow.cons( list_utilities.first_n( num, all_daughters ), daughter_lists );
                num_daughters_used = num;
                current_start = Numbers.add( current_start, num_daughters_used );
              }
            }
          }
          if( NIL == num_daughters_used )
          {
            word_lists = ConsesLow.cons( NIL, word_lists );
            daughter_lists = ConsesLow.cons( ConsesLow.list( ConsesLow.nth( current_start, all_daughters ) ), daughter_lists );
          }
        }
        Dynamic.sublisp_throw( $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, ConsesLow.list( Sequences.nreverse( word_lists ), Sequences.nreverse( daughter_lists ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
          set_parse_tree_string( self, string );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 26389L)
  public static SubLObject phrase_tree_cyclify_int_method(final SubLObject self)
  {
    final SubLObject scycls = subcyclifier.subcyclifier_cyclify( self );
    if( NIL != scycls )
    {
      return scycls;
    }
    final SubLObject heads = methods.funcall_instance_method_with_0_args( self, $sym196$GET_HEADS );
    SubLObject cycls = NIL;
    SubLObject cdolist_list_var = heads;
    SubLObject head = NIL;
    head = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( head, $sym126$CYCLIFY_INT ), cycls );
      cdolist_list_var = cdolist_list_var.rest();
      head = cdolist_list_var.first();
    }
    return Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.cross_products( cycls ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 27690L)
  public static SubLObject parse_expression_to_phrase_tree(final SubLObject phrase_expression, SubLObject mother, SubLObject index, SubLObject lexicon, SubLObject v_context)
  {
    if( mother == UNPROVIDED )
    {
      mother = NIL;
    }
    if( index == UNPROVIDED )
    {
      index = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( v_context == UNPROVIDED )
    {
      v_context = object.new_class_instance( $sym54$PARSE_TREE_CONTEXT );
    }
    final SubLObject self = object.new_class_instance( tree_for_category( word_tree.parse_expression_category( phrase_expression ) ) );
    final SubLObject daughters = Vectors.make_vector( Sequences.length( word_tree.phrase_expression_daughters( phrase_expression ) ), UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    set_parse_tree_category( self, word_tree.parse_expression_category( phrase_expression ) );
    set_parse_tree_mother( self, mother );
    set_parse_tree_idx( self, index );
    set_parse_tree_context( self, v_context );
    SubLObject cdolist_list_var = word_tree.phrase_expression_daughters( phrase_expression );
    SubLObject daughter = NIL;
    daughter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Vectors.set_aref( daughters, i, new_parse_tree_int( daughter, self, i, lexicon, v_context ) );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      daughter = cdolist_list_var.first();
    }
    set_phrase_tree_daughters( self, daughters );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 28698L)
  public static SubLObject tree_for_category(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tree = conses_high.assoc( category, $category_to_phrase$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL == tree )
    {
      tree = $sym184$PHRASE_TREE;
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 28991L)
  public static SubLObject pprint_phrase_tree(final SubLObject pt, final SubLObject stream, final SubLObject level)
  {
    final SubLObject indent = THREE_INTEGER;
    final SubLObject base_column = Numbers.multiply( level, indent );
    string_utilities.indent( stream, base_column );
    streams_high.write_string( $str246$__P_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( get_parse_tree_category( pt ), stream );
    streams_high.write_string( $str247$__, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    final SubLObject vector_var = get_phrase_tree_daughters( pt );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      pprint_parse_tree( daughter, stream, Numbers.add( level, ONE_INTEGER ) );
    }
    string_utilities.indent( stream, base_column );
    streams_high.write_string( $str149$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    return pt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 29531L)
  public static SubLObject phrase_tree_get_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    SubLObject string = get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        if( !string.isString() )
        {
          if( NIL != phrase_tree_get_daughter_method( self, ZERO_INTEGER ) )
          {
            SubLObject s = methods.funcall_instance_method_with_0_args( phrase_tree_get_daughter_method( self, ZERO_INTEGER ), $sym148$GET_STRING );
            SubLObject daughter_string = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for( cdotimes_end_var = Numbers.subtract( phrase_tree_daughter_count_method( self ), ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
            {
              daughter_string = methods.funcall_instance_method_with_0_args( phrase_tree_get_daughter_method( self, number_utilities.f_1X( i ) ), $sym148$GET_STRING );
              s = Sequences.cconcatenate( s, new SubLObject[] { ( NIL != contract_stringP( daughter_string ) ) ? $str250$ : $str251$_, daughter_string
              } );
            }
            string = s;
          }
          else
          {
            string = $str250$;
          }
        }
        Dynamic.sublisp_throw( $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_string( self, string );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30059L)
  public static SubLObject phrase_tree_string(final SubLObject phrase_tree)
  {
    return methods.funcall_instance_method_with_0_args( phrase_tree, $sym148$GET_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30167L)
  public static SubLObject phrase_tree_yield_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject yield = NIL;
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw153$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject daughter = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( self, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      daughter = stacks.stack_pop( stack );
      if( NIL != word_tree.word_tree_p( daughter ) )
      {
        yield = ConsesLow.cons( daughter, yield );
      }
      if( NIL != phrase_tree_p( daughter ) )
      {
        final SubLObject vector_var = get_phrase_tree_daughters( daughter );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter_$7;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter_$7 = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter_$7, stack );
        }
      }
    }
    return yield;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30422L)
  public static SubLObject phrase_tree_yield(final SubLObject tree)
  {
    return methods.funcall_instance_method_with_0_args( tree, $sym218$YIELD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30491L)
  public static SubLObject phrase_tree_get_parse_expression_method(final SubLObject self)
  {
    SubLObject expression = ConsesLow.list( methods.funcall_instance_method_with_0_args( self, $sym76$GET_CATEGORY ) );
    final SubLObject vector_var = get_phrase_tree_daughters( self );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      expression = ConsesLow.cons( methods.funcall_instance_method_with_0_args( daughter, $sym256$GET_PARSE_EXPRESSION ), expression );
    }
    return Sequences.nreverse( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30848L)
  public static SubLObject phrase_tree_get_heads_method(final SubLObject self)
  {
    SubLObject heads = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym189$GET_HEAD_DAUGHTERS );
    SubLObject head_daughter = NIL;
    head_daughter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args( head_daughter, $sym196$GET_HEADS );
      SubLObject head = NIL;
      head = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        heads = ConsesLow.cons( head, heads );
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        head = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      head_daughter = cdolist_list_var.first();
    }
    return Sequences.nreverse( heads );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31142L)
  public static SubLObject phrase_tree_get_semantic_heads_method(final SubLObject self)
  {
    SubLObject heads = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym198$GET_SEMANTIC_HEAD_DAUGHTERS );
    SubLObject head_daughter = NIL;
    head_daughter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9 = methods.funcall_instance_method_with_0_args( head_daughter, $sym94$GET_SEMANTIC_HEADS );
      SubLObject head = NIL;
      head = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        heads = ConsesLow.cons( head, heads );
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        head = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      head_daughter = cdolist_list_var.first();
    }
    return Sequences.nreverse( heads );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31472L)
  public static SubLObject phrase_tree_get_daughter_method(final SubLObject self, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        assert NIL != subl_promotions.non_negative_integer_p( index ) : index;
        if( index.numGE( Sequences.length( daughters ) ) )
        {
          Dynamic.sublisp_throw( $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, NIL );
        }
        Dynamic.sublisp_throw( $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Vectors.aref( daughters, index ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31789L)
  public static SubLObject phrase_tree_get_descendant_method(final SubLObject self, final SubLObject path)
  {
    assert NIL != Types.listp( path ) : path;
    SubLObject tree = self;
    SubLObject dtrs = NIL;
    SubLObject cdolist_list_var = path;
    SubLObject i = NIL;
    i = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dtrs = get_phrase_tree_daughters( tree );
      if( i.numGE( Sequences.length( dtrs ) ) )
      {
        return NIL;
      }
      tree = Vectors.aref( dtrs, i );
      cdolist_list_var = cdolist_list_var.rest();
      i = cdolist_list_var.first();
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32275L)
  public static SubLObject proper_subtree_p(final SubLObject little_tree, final SubLObject big_tree)
  {
    return makeBoolean( !little_tree.eql( big_tree ) && NIL != subtree_p( little_tree, big_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32422L)
  public static SubLObject subtree_p(final SubLObject little_tree, final SubLObject big_tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != parse_tree_p( little_tree ) : little_tree;
    assert NIL != parse_tree_p( big_tree ) : big_tree;
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw153$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject sub = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( big_tree, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      sub = stacks.stack_pop( stack );
      if( little_tree.eql( sub ) )
      {
        return T;
      }
      if( NIL == phrase_tree_p( sub ) )
      {
        continue;
      }
      final SubLObject vector_var = get_phrase_tree_daughters( sub );
      final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject daughter;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        daughter = Vectors.aref( vector_var, element_num );
        stacks.stack_push( daughter, stack );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32826L)
  public static SubLObject phrase_tree_search_method(final SubLObject self, final SubLObject search_string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( search_string ) : search_string;
    assert NIL != subl_promotions.positive_integer_p( n ) : n;
    SubLObject m = ZERO_INTEGER;
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw254$DFL2R;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject word = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( self, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      word = stacks.stack_pop( stack );
      if( NIL != word_tree.word_tree_p( word ) && search_string.equalp( methods.funcall_instance_method_with_0_args( word, $sym148$GET_STRING ) ) )
      {
        m = Numbers.add( m, ONE_INTEGER );
        if( m.numE( n ) )
        {
          return word;
        }
      }
      if( NIL != phrase_tree_p( word ) )
      {
        final SubLObject vector_var = get_phrase_tree_daughters( word );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter, stack );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33321L)
  public static SubLObject phrase_tree_daughter_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.length( daughters ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33489L)
  public static SubLObject phrase_tree_preterminal_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, makeBoolean( NIL == list_utilities.find_if_not( $sym183$WORD_TREE_P, daughters, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33689L)
  public static SubLObject phrase_tree_hydra_p_method(final SubLObject self)
  {
    return Numbers.numG( Sequences.length( methods.funcall_instance_method_with_0_args( self, $sym189$GET_HEAD_DAUGHTERS ) ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33884L)
  public static SubLObject phrase_tree_find_method(final SubLObject self, final SubLObject predicate, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject daughter = NIL;
        final SubLObject stop = ( NIL != end ) ? end : Sequences.length( daughters );
        SubLObject found = NIL;
        if( start.numG( stop ) )
        {
          Errors.warn( $str292$start__A__after_stop__A__when_fin, new SubLObject[] { start, stop, predicate, self
          } );
        }
        SubLObject i;
        for( i = NIL, i = start; !i.numGE( stop ); i = number_utilities.f_1X( i ) )
        {
          daughter = phrase_tree_get_daughter_method( self, i );
          if( NIL != Functions.funcall( predicate, daughter ) )
          {
            found = ConsesLow.cons( daughter, found );
          }
        }
        Dynamic.sublisp_throw( $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.nreverse( found ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 34489L)
  public static SubLObject phrase_tree_find_first_method(final SubLObject self, final SubLObject predicate, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject daughter = NIL;
        SubLObject i;
        for( i = NIL, i = start; !i.numGE( Sequences.length( daughters ) ); i = number_utilities.f_1X( i ) )
        {
          daughter = phrase_tree_get_daughter_method( self, i );
          if( NIL != Functions.funcall( predicate, daughter ) )
          {
            Dynamic.sublisp_throw( $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, daughter );
          }
        }
        Dynamic.sublisp_throw( $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 34914L)
  public static SubLObject phrase_tree_find_last_method(final SubLObject self, final SubLObject predicate, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject daughter = NIL;
        SubLObject i;
        for( i = NIL, i = ( ( NIL != end ) ? end : number_utilities.f_1_( Sequences.length( daughters ) ) ); !i.isNegative(); i = number_utilities.f_1_( i ) )
        {
          daughter = phrase_tree_get_daughter_method( self, i );
          if( NIL != Functions.funcall( predicate, daughter ) )
          {
            Dynamic.sublisp_throw( $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, daughter );
          }
        }
        Dynamic.sublisp_throw( $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 35342L)
  public static SubLObject phrase_tree_find_all_method(final SubLObject self, final SubLObject predicate, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject daughter = NIL;
        final SubLObject stop = ( NIL != end ) ? end : Sequences.length( daughters );
        SubLObject found = NIL;
        SubLObject i;
        SubLObject cdolist_list_var;
        SubLObject the_descendant;
        for( i = NIL, i = start; !i.numE( stop ); i = number_utilities.f_1X( i ) )
        {
          daughter = phrase_tree_get_daughter_method( self, i );
          if( NIL != Functions.funcall( predicate, daughter ) )
          {
            found = ConsesLow.cons( daughter, found );
          }
          if( NIL != phrase_tree_p( daughter ) )
          {
            cdolist_list_var = methods.funcall_instance_method_with_1_args( daughter, $sym304$FIND_ALL, predicate );
            the_descendant = NIL;
            the_descendant = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              found = ConsesLow.cons( the_descendant, found );
              cdolist_list_var = cdolist_list_var.rest();
              the_descendant = cdolist_list_var.first();
            }
          }
        }
        Dynamic.sublisp_throw( $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.nreverse( found ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 35999L)
  public static SubLObject phrase_tree_find_all_subtrees_of_categories_method(final SubLObject self, final SubLObject category_list, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw153$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject subtree = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( self, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      subtree = stacks.stack_pop( stack );
      SubLObject cdolist_list_var = category_list;
      SubLObject cat = NIL;
      cat = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( get_parse_tree_category( subtree ).eql( cat ) )
        {
          result = ConsesLow.cons( subtree, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cat = cdolist_list_var.first();
      }
      if( NIL != phrase_tree_p( subtree ) )
      {
        final SubLObject vector_var = get_phrase_tree_daughters( subtree );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter, stack );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 36499L)
  public static SubLObject tree_yield_to_words(final SubLObject yield)
  {
    final SubLObject words = Vectors.make_vector( Sequences.length( yield ), UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = yield;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Vectors.set_aref( words, i, document.new_word( ConsesLow.list( $kw312$STRING, methods.funcall_instance_method_with_0_args( word, $sym148$GET_STRING ) ) ) );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 36750L)
  public static SubLObject main_collection(final SubLObject cycl, final SubLObject var)
  {
    assert NIL != el_utilities.el_formula_p( cycl ) : cycl;
    final SubLObject col = genls.min_col( at_var_types.formula_variable_isa_constraints( var, cycl, $const314$EverythingPSC, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    return ( NIL != nart_handles.nart_p( col ) ) ? narts_high.nart_el_formula( col ) : col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37035L)
  public static SubLObject contract_stringP(final SubLObject word)
  {
    return conses_high.member( word, $list315, $sym316$STRING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37272L)
  public static SubLObject rightmost_nominal_word(final SubLObject np, SubLObject i)
  {
    if( i == UNPROVIDED )
    {
      i = number_utilities.f_1_( methods.funcall_instance_method_with_0_args( np, $sym207$DAUGHTER_COUNT ) );
    }
    while ( NIL == word_tree.nominal_word_tree_p( methods.funcall_instance_method_with_1_args( np, $sym137$GET_DAUGHTER, i ) ) && !i.isZero())
    {
      i = Numbers.subtract( i, ONE_INTEGER );
    }
    return conflate_nominals( np, i );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37678L)
  public static SubLObject nominal_words(final SubLObject np)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject words = NIL;
    SubLObject next = number_utilities.f_1_( methods.funcall_instance_method_with_0_args( np, $sym207$DAUGHTER_COUNT ) );
    while ( NIL != subl_promotions.non_negative_integer_p( next ))
    {
      thread.resetMultipleValues();
      final SubLObject word = rightmost_nominal_word( np, next );
      final SubLObject i = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != word )
      {
        words = ConsesLow.cons( word, words );
        next = number_utilities.f_1_( i );
      }
      else
      {
        next = MINUS_ONE_INTEGER;
      }
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 38118L)
  public static SubLObject conflate_nominals(final SubLObject tree, final SubLObject start)
  {
    assert NIL != parse_tree_p( tree ) : tree;
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    final SubLObject word = methods.funcall_instance_method_with_1_args( tree, $sym137$GET_DAUGHTER, start );
    SubLObject conflated = NIL;
    SubLObject i = start;
    SubLObject category = NIL;
    SubLObject sister = NIL;
    if( NIL != word_tree.nominal_word_tree_p( word ) )
    {
      conflated = ConsesLow.cons( word, conflated );
      category = methods.funcall_instance_method_with_0_args( word, $sym76$GET_CATEGORY );
      while ( NIL != subl_promotions.positive_integer_p( i ))
      {
        i = Numbers.subtract( i, ONE_INTEGER );
        sister = methods.funcall_instance_method_with_1_args( tree, $sym137$GET_DAUGHTER, i );
        if( methods.funcall_instance_method_with_0_args( sister, $sym76$GET_CATEGORY ).eql( category ) )
        {
          conflated = ConsesLow.cons( sister, conflated );
        }
        else
        {
          i = ZERO_INTEGER;
        }
      }
    }
    if( Sequences.length( conflated ).numG( ONE_INTEGER ) )
    {
      return Values.values( word_tree.new_multi_noun_tree( conflated ), number_utilities.f_1X( Numbers.subtract( start, Sequences.length( conflated ) ) ) );
    }
    return Values.values( conflated.first(), number_utilities.f_1X( Numbers.subtract( start, Sequences.length( conflated ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39151L)
  public static SubLObject process_modifiers(final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw153$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject sub = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( clear_modifiers( tree ), stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      sub = stacks.stack_pop( stack );
      SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( sub, $sym103$GET_MODIFIEDS );
      SubLObject modified = NIL;
      modified = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set_parse_tree_modifiers( modified, ConsesLow.cons( sub, get_parse_tree_modifiers( modified ) ) );
        cdolist_list_var = cdolist_list_var.rest();
        modified = cdolist_list_var.first();
      }
      if( NIL != phrase_tree_p( sub ) )
      {
        final SubLObject vector_var = get_phrase_tree_daughters( sub );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter, stack );
        }
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39470L)
  public static SubLObject process_abs_index(final SubLObject tree)
  {
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( tree, $sym218$YIELD );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      word_tree.set_word_tree_abs_idx( word, i );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39628L)
  public static SubLObject retag_aux_verbs(final SubLObject tree)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( tree, $sym218$YIELD );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != word_tree.aux_verb_tree_p( word ) && NIL == subl_promotions.memberP( methods.funcall_instance_method_with_0_args( word, $sym148$GET_STRING ), word_tree.$to_be_forms$.getGlobalValue(), EQUALP,
          UNPROVIDED ) && NIL == methods.funcall_instance_method_with_0_args( word, $sym317$GET_VERBAL_COMPLEMENT ) )
      {
        final SubLObject new_word = word_tree.new_word_tree( methods.funcall_instance_method_with_0_args( word, $sym148$GET_STRING ), cyclifier_interface.compute_main_verb_tag( word ), methods
            .funcall_instance_method_with_0_args( word, $sym74$GET_MOTHER ), methods.funcall_instance_method_with_0_args( word, $sym80$GET_INDEX ), NIL, methods.funcall_instance_method_with_0_args( word,
                $sym106$GET_CONTEXT ) );
        Vectors.set_aref( instances.get_slot( methods.funcall_instance_method_with_0_args( word, $sym74$GET_MOTHER ), $sym186$DAUGHTERS ), methods.funcall_instance_method_with_0_args( word, $sym80$GET_INDEX ),
            new_word );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40247L)
  public static SubLObject clear_modifiers(final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw153$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw254$DFL2R, $kw153$DFR2L );
    SubLObject sub = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str163$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( tree, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      sub = stacks.stack_pop( stack );
      set_parse_tree_modifiers( sub, NIL );
      if( NIL != phrase_tree_p( sub ) )
      {
        final SubLObject vector_var = get_phrase_tree_daughters( sub );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw254$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter, stack );
        }
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40437L)
  public static SubLObject quantify_existentially(final SubLObject formula, SubLObject v_variables)
  {
    if( v_variables == UNPROVIDED )
    {
      v_variables = el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject cycl = formula;
    SubLObject cdolist_list_var = v_variables;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cycl = ConsesLow.list( $const318$thereExists, var, cycl );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40805L)
  public static SubLObject question_referents(final SubLObject tree)
  {
    assert NIL != parse_tree_p( tree ) : tree;
    final SubLObject words = methods.funcall_instance_method_with_0_args( tree, $sym218$YIELD );
    SubLObject word_string = NIL;
    SubLObject i = ZERO_INTEGER;
    SubLObject question_referents = NIL;
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      word_string = methods.funcall_instance_method_with_0_args( word, $sym148$GET_STRING );
      i = Numbers.add( i, ONE_INTEGER );
      if( NIL != methods.funcall_instance_method_with_0_args( word, $sym74$GET_MOTHER ) && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( word, $sym74$GET_MOTHER ),
          $sym74$GET_MOTHER ) && NIL == word_tree.relative_clause_p( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( word, $sym74$GET_MOTHER ), $sym74$GET_MOTHER ) )
          && NIL != conses_high.member( word_string, $list319, EQUALP, UNPROVIDED ) )
      {
        question_referents = ConsesLow.append( methods.funcall_instance_method_with_0_args( word, $sym204$GET_REFS ), question_referents );
      }
      else if( NIL != subl_promotions.memberP( word_string, $list320, EQUALP, UNPROVIDED ) && NIL != nominal_tree_p( ConsesLow.nth( i, words ) ) )
      {
        question_referents = ConsesLow.append( methods.funcall_instance_method_with_0_args( ConsesLow.nth( i, words ), $sym204$GET_REFS ), question_referents );
      }
      else if( word_string.equalp( $str321$what ) )
      {
        question_referents = ConsesLow.append( methods.funcall_instance_method_with_0_args( word, $sym204$GET_REFS ), question_referents );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return question_referents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
  public static SubLObject subloop_reserved_initialize_nominal_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
  public static SubLObject subloop_reserved_initialize_nominal_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
  public static SubLObject nominal_phrase_tree_p(final SubLObject nominal_phrase_tree)
  {
    return classes.subloop_instanceof_class( nominal_phrase_tree, $sym322$NOMINAL_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 42891L)
  public static SubLObject nominal_phrase_tree_get_determiner_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym327$GET_DETERMINER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43127L)
  public static SubLObject nominal_phrase_tree_get_overt_quantifier_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym330$GET_OVERT_QUANTIFIER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43375L)
  public static SubLObject nominal_phrase_tree_get_quantifier_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym333$GET_QUANTIFIER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43611L)
  public static SubLObject nominal_phrase_tree_get_possessor_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym336$GET_POSSESSOR ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43845L)
  public static SubLObject nominal_phrase_tree_get_specifier_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym339$GET_SPECIFIER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44079L)
  public static SubLObject nominal_phrase_tree_possessive_p_method(final SubLObject self)
  {
    return word_tree.possessive_word_tree_p( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, number_utilities.f_1_( methods.funcall_instance_method_with_0_args( self,
        $sym207$DAUGHTER_COUNT ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44307L)
  public static SubLObject nominal_phrase_tree_temporal_tree_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    if( NIL != head )
    {
      return methods.funcall_instance_method_with_0_args( head, $sym110$TEMPORAL_TREE_P );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44533L)
  public static SubLObject nominal_phrase_tree_definite_description_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head && NIL != nominal_tree_p( head ) ) ? methods.funcall_instance_method_with_0_args( head, $sym347$DEFINITE_DESCRIPTION_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44820L)
  public static SubLObject nominal_phrase_tree_name_tree_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return makeBoolean( NIL != head && NIL != word_tree.name_word_tree_p( head ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45035L)
  public static SubLObject nominal_phrase_tree_get_gender_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym353$GET_GENDER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45301L)
  public static SubLObject nominal_phrase_tree_get_number_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym356$GET_NUMBER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45554L)
  public static SubLObject nominal_phrase_tree_get_person_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym359$GET_PERSON ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45763L)
  public static SubLObject nominal_phrase_tree_singular_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym362$SINGULAR_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45979L)
  public static SubLObject nominal_phrase_tree_plural_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym365$PLURAL_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 46189L)
  public static SubLObject nominal_phrase_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon)
  {
    assert NIL != abstract_lexicon.abstract_lexicon_p( lexicon ) : lexicon;
    final SubLObject vector_var = get_phrase_tree_daughters( self );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      methods.funcall_instance_method_with_1_args( daughter, $sym121$LEXIFY_INT, lexicon );
    }
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym347$DEFINITE_DESCRIPTION_P ) )
    {
      final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
      SubLObject augmented_lexes = NIL;
      if( NIL != head )
      {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( head, $sym145$GET_RANKED_LEXES );
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject lex = ( NIL != rle ) ? methods.funcall_instance_method_with_0_args( cyclifier.rle_lex( rle ), $sym370$COPY ) : NIL;
          if( NIL == introduces_termP( lex ) )
          {
            final SubLObject instance = methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_0_args( self, $sym106$GET_CONTEXT ), $sym371$GET_INSTANCE, self );
            final SubLObject semtrans = methods.funcall_instance_method_with_1_args( lex, $sym223$GET, $kw372$SEMTRANS );
            methods.funcall_instance_method_with_2_args( lex, $sym373$SET, $kw372$SEMTRANS, simplifier.conjoin( ConsesLow.list( semtrans, ConsesLow.list( $const374$equals, $kw375$NOUN, instance ) ), UNPROVIDED ) );
            cyclifier.rle_set_confidence( rle, ONE_INTEGER );
          }
          augmented_lexes = ConsesLow.cons( rle, augmented_lexes );
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        instances.set_slot( head, $sym376$LEXES, augmented_lexes );
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47439L)
  public static SubLObject presupposing_tree_p(final SubLObject tree)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( tree, $sym98$GET_HEAD );
    return makeBoolean( ( NIL != head && NIL != word_tree.name_word_tree_p( head ) && NIL != methods.funcall_instance_method_with_0_args( head, $sym362$SINGULAR_P ) ) || NIL != methods
        .funcall_instance_method_with_0_args( tree, $sym347$DEFINITE_DESCRIPTION_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47683L)
  public static SubLObject introduces_termP(final SubLObject lex)
  {
    final SubLObject semtrans = methods.funcall_instance_method_with_1_args( lex, $sym223$GET, $kw372$SEMTRANS );
    return makeBoolean( cycl_utilities.formula_operator( semtrans ).eql( $const374$equals ) && cycl_utilities.formula_arg1( semtrans, UNPROVIDED ).eql( $kw375$NOUN ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47877L)
  public static SubLObject lex_entry_sem_equal(final SubLObject lex1, final SubLObject lex2)
  {
    return Equality.equal( methods.funcall_instance_method_with_1_args( lex1, $sym223$GET, $kw372$SEMTRANS ), methods.funcall_instance_method_with_1_args( lex2, $sym223$GET, $kw372$SEMTRANS ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47995L)
  public static SubLObject nominal_phrase_tree_get_head_daughters_method(final SubLObject self)
  {
    if( methods.funcall_instance_method_with_0_args( self, $sym207$DAUGHTER_COUNT ).numE( TWO_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( self,
        $sym137$GET_DAUGHTER, ZERO_INTEGER ), $sym76$GET_CATEGORY ).eql( $kw208$_ ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ONE_INTEGER ),
            $sym76$GET_CATEGORY ).eql( $kw379$CD ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) );
    }
    if( methods.funcall_instance_method_with_0_args( self, $sym207$DAUGHTER_COUNT ).numE( ONE_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( self,
        $sym137$GET_DAUGHTER, ZERO_INTEGER ), $sym76$GET_CATEGORY ).eql( $kw379$CD ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) );
    }
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym380$COORDINATE_PHRASE_P ) )
    {
      return methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym381$NOMINAL_TREE_P );
    }
    if( methods.funcall_instance_method_with_0_args( self, $sym207$DAUGHTER_COUNT ).numE( TWO_INTEGER ) && NIL != word_tree.vbg_tree_p( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER,
        ONE_INTEGER ) ) && NIL != word_tree.determiner_word_tree_p( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ONE_INTEGER ) );
    }
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym221$PRETERMINAL_P ) )
    {
      final SubLObject head_daughter = methods.funcall_instance_method_with_1_args( self, $sym299$FIND_LAST, $sym382$NOMINAL_WORD_TREE_P );
      return ( NIL != head_daughter ) ? ConsesLow.list( head_daughter ) : NIL;
    }
    SubLObject head_daughter = methods.funcall_instance_method_with_1_args( self, $sym299$FIND_LAST, $sym382$NOMINAL_WORD_TREE_P );
    if( NIL != head_daughter )
    {
      return ConsesLow.list( head_daughter );
    }
    head_daughter = methods.funcall_instance_method_with_1_args( self, $sym294$FIND_FIRST, $sym383$NOMINAL_PHRASE_TREE_P );
    return ( NIL != head_daughter ) ? ConsesLow.list( head_daughter ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
  public static SubLObject subloop_reserved_initialize_np_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
  public static SubLObject subloop_reserved_initialize_np_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
  public static SubLObject np_tree_p(final SubLObject np_tree)
  {
    return classes.subloop_instanceof_class( np_tree, $sym385$NP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
  public static SubLObject subloop_reserved_initialize_npp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
  public static SubLObject subloop_reserved_initialize_npp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
  public static SubLObject npp_tree_p(final SubLObject npp_tree)
  {
    return classes.subloop_instanceof_class( npp_tree, $sym388$NPP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
  public static SubLObject subloop_reserved_initialize_nx_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
  public static SubLObject subloop_reserved_initialize_nx_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
  public static SubLObject nx_tree_p(final SubLObject nx_tree)
  {
    return classes.subloop_instanceof_class( nx_tree, $sym391$NX_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
  public static SubLObject subloop_reserved_initialize_pnp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
  public static SubLObject subloop_reserved_initialize_pnp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
  public static SubLObject pnp_tree_p(final SubLObject pnp_tree)
  {
    return classes.subloop_instanceof_class( pnp_tree, $sym394$PNP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49570L)
  public static SubLObject pnp_tree_get_head_daughters_method(final SubLObject self)
  {
    return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym299$FIND_LAST, $sym381$NOMINAL_TREE_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
  public static SubLObject subloop_reserved_initialize_whnp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
  public static SubLObject subloop_reserved_initialize_whnp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
  public static SubLObject whnp_tree_p(final SubLObject whnp_tree)
  {
    return classes.subloop_instanceof_class( whnp_tree, $sym400$WHNP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject verbal_phrase_tree_cyclify_int_vp_coordination_method(final SubLObject self)
  {
    final SubLObject scycls = subcyclifier.subcyclifier_cyclify( self );
    if( NIL != scycls )
    {
      return scycls;
    }
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym409$GET_SUBJECT );
    final SubLObject subj_cycls = ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym126$CYCLIFY_INT ) : NIL;
    final SubLObject conjunction = methods.funcall_instance_method_with_0_args( self, $sym212$GET_CONJUNCTION );
    final SubLObject vps = methods.funcall_instance_method_with_0_args( conjunction, $sym96$GET_COMPLEMENTS );
    SubLObject cycls = NIL;
    SubLObject cdolist_list_var = vps;
    SubLObject vp = NIL;
    vp = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( vp, $sym410$CYCLIFY_INT_VP ), cycls );
      cdolist_list_var = cdolist_list_var.rest();
      vp = cdolist_list_var.first();
    }
    return Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( subj_cycls, cycls ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject verbal_phrase_tree_cyclify_int_vp_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject scycls = subcyclifier.subcyclifier_cyclify( self );
    if( NIL != scycls )
    {
      return scycls;
    }
    final SubLObject heads = methods.funcall_instance_method_with_0_args( self, $sym94$GET_SEMANTIC_HEADS );
    SubLObject all_conjunction_cycls = NIL;
    final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym409$GET_SUBJECT );
    SubLObject complements = ( NIL != heads ) ? methods.funcall_instance_method_with_0_args( heads.first(), $sym413$GET_SEMANTIC_COMPLEMENTS ) : NIL;
    SubLObject comp_cycls = NIL;
    SubLObject cycls = NIL;
    complements = cyclifier_interface.delete_cyclifiable( subject, complements );
    if( NIL == subl_promotions.memberP( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ), EQ, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding( thread );
      final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_in_progress$.currentBinding( thread );
      try
      {
        cyclifier_interface.$cyclification_in_progress$.bind( ConsesLow.cons( self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ) ), thread );
        cyclifier_interface.$cyclification_in_progress$.bind( ConsesLow.append( heads, cyclifier_interface.$cyclification_in_progress$.getDynamicValue( thread ) ), thread );
        SubLObject cdolist_list_var = heads;
        SubLObject head = NIL;
        head = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject all_head_cycls = NIL;
          final SubLObject mod_cycls = cyclifier_interface.get_mod_cycls( head );
          SubLObject cdolist_list_var_$10;
          final SubLObject renamings = cdolist_list_var_$10 = methods.funcall_instance_method_with_1_args( head, $sym414$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords( methods.funcall_instance_method_with_0_args(
              head, $sym145$GET_RANKED_LEXES ) ) );
          SubLObject conjunction = NIL;
          conjunction = cdolist_list_var_$10.first();
          while ( NIL != cdolist_list_var_$10)
          {
            SubLObject all_rle_cycls = NIL;
            SubLObject cdolist_list_var_$11 = methods.funcall_instance_method_with_0_args( head, $sym145$GET_RANKED_LEXES );
            SubLObject rle = NIL;
            rle = cdolist_list_var_$11.first();
            while ( NIL != cdolist_list_var_$11)
            {
              SubLObject composite_verbal_cycls = NIL;
              SubLObject cdolist_list_var_$12 = conjunction;
              SubLObject renaming = NIL;
              renaming = cdolist_list_var_$12.first();
              while ( NIL != cdolist_list_var_$12)
              {
                final SubLObject renamed0 = cyclifier_interface.apply_lex_renaming( head, rle, renaming );
                final SubLObject renamed2 = ( NIL != renamed0 ) ? ConsesLow.list( cyclifier.quantify_implicit_subject( renamed0 ) ) : NIL;
                composite_verbal_cycls = list_utilities.alist_pushnew( composite_verbal_cycls, cyclifier_interface.renaming_key( renaming ), Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.cross_products(
                    ConsesLow.cons( renamed2, mod_cycls ) ) ), EQL, UNPROVIDED );
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                renaming = cdolist_list_var_$12.first();
              }
              SubLObject sense_cycls = NIL;
              SubLObject cdolist_list_var_$13 = list_utilities.alist_values( composite_verbal_cycls );
              SubLObject value = NIL;
              value = cdolist_list_var_$13.first();
              while ( NIL != cdolist_list_var_$13)
              {
                sense_cycls = ConsesLow.cons( Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products( value ) ), sense_cycls );
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                value = cdolist_list_var_$13.first();
              }
              all_rle_cycls = ConsesLow.cons( sense_cycls, all_rle_cycls );
              cdolist_list_var_$11 = cdolist_list_var_$11.rest();
              rle = cdolist_list_var_$11.first();
            }
            all_head_cycls = ConsesLow.cons( list_utilities.indexed_products( all_rle_cycls ), all_head_cycls );
            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
            conjunction = cdolist_list_var_$10.first();
          }
          all_conjunction_cycls = ConsesLow.cons( all_head_cycls, all_conjunction_cycls );
          cdolist_list_var = cdolist_list_var.rest();
          head = cdolist_list_var.first();
        }
        cdolist_list_var = complements;
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args( complement, $sym126$CYCLIFY_INT );
          if( NIL != comp_cycl )
          {
            comp_cycls = ConsesLow.cons( comp_cycl, comp_cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          complement = cdolist_list_var.first();
        }
        cdolist_list_var = list_utilities.indexed_products( all_conjunction_cycls );
        SubLObject all_head_cycls2 = NIL;
        all_head_cycls2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cycls2 = NIL;
          SubLObject all_subjects_with_objects_cycls = NIL;
          SubLObject cdolist_list_var_$14 = list_utilities.indexed_products( all_head_cycls2 );
          SubLObject item = NIL;
          item = cdolist_list_var_$14.first();
          while ( NIL != cdolist_list_var_$14)
          {
            SubLObject complete_cycl_for_one_subject = NIL;
            SubLObject cdolist_list_var_$15 = list_utilities.cross_products( item );
            SubLObject item2 = NIL;
            item2 = cdolist_list_var_$15.first();
            while ( NIL != cdolist_list_var_$15)
            {
              complete_cycl_for_one_subject = ConsesLow.append( Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products( item2 ) ), complete_cycl_for_one_subject );
              cdolist_list_var_$15 = cdolist_list_var_$15.rest();
              item2 = cdolist_list_var_$15.first();
            }
            all_subjects_with_objects_cycls = ConsesLow.cons( Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.cross_products( ConsesLow.cons( complete_cycl_for_one_subject, comp_cycls ) ) ),
                all_subjects_with_objects_cycls );
            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
            item = cdolist_list_var_$14.first();
          }
          cycls2 = Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products( all_subjects_with_objects_cycls ) );
          cycls = ConsesLow.append( cycls2, cycls );
          cdolist_list_var = cdolist_list_var.rest();
          all_head_cycls2 = cdolist_list_var.first();
        }
      }
      finally
      {
        cyclifier_interface.$cyclification_in_progress$.rebind( _prev_bind_2, thread );
        cyclifier_interface.$cyclification_in_progress$.rebind( _prev_bind_0, thread );
      }
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject verbal_phrase_tree_cyclify_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue( thread ) || NIL == conses_high.member( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ), EQ,
        UNPROVIDED ) )
    {
      cyclifier_interface.$cyclification_complete$.setDynamicValue( ConsesLow.cons( self, cyclifier_interface.$cyclification_complete$.getDynamicValue( thread ) ), thread );
      final SubLObject scycls = subcyclifier.subcyclifier_cyclify( self );
      if( NIL != scycls )
      {
        return scycls;
      }
      if( NIL != cyclifier_interface.cyclifiable_sentential_phrase_p( self ) )
      {
        final SubLObject head_dtr = methods.funcall_instance_method_with_0_args( self, $sym192$GET_HEAD_DAUGHTER );
        if( NIL != head_dtr )
        {
          return methods.funcall_instance_method_with_0_args( head_dtr, $sym126$CYCLIFY_INT );
        }
      }
      else
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym417$VP_COORDINATE_PHRASE_P ) )
        {
          return methods.funcall_instance_method_with_0_args( self, $sym407$CYCLIFY_INT_VP_COORDINATION );
        }
        final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym409$GET_SUBJECT );
        final SubLObject subj_cycls = ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym126$CYCLIFY_INT ) : NIL;
        final SubLObject vp_cycls = methods.funcall_instance_method_with_0_args( self, $sym410$CYCLIFY_INT_VP );
        SubLObject subj_vp_cycls = ( NIL != subj_cycls ) ? ConsesLow.list( subj_cycls ) : NIL;
        if( NIL != vp_cycls )
        {
          subj_vp_cycls = ConsesLow.cons( vp_cycls, subj_vp_cycls );
        }
        return Mapping.mapcar( $sym243$INSTANTIATE_SCOPE, list_utilities.cross_products( subj_vp_cycls ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject verbal_phrase_tree_vp_coordinate_phrase_p_method(final SubLObject self)
  {
    final SubLObject conjunction = methods.funcall_instance_method_with_0_args( self, $sym212$GET_CONJUNCTION );
    return makeBoolean( NIL != conjunction && NIL == list_utilities.member_if_not( $sym420$CYCLIFIABLE_VERB_PHRASE_P, methods.funcall_instance_method_with_0_args( conjunction, $sym96$GET_COMPLEMENTS ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject subloop_reserved_initialize_verbal_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject subloop_reserved_initialize_verbal_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
  public static SubLObject verbal_phrase_tree_p(final SubLObject verbal_phrase_tree)
  {
    return classes.subloop_instanceof_class( verbal_phrase_tree, $sym404$VERBAL_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51311L)
  public static SubLObject verbal_phrase_tree_get_predicate_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym92$GET_SEMANTIC_HEAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51477L)
  public static SubLObject verbal_phrase_tree_get_number_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym356$GET_NUMBER ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51729L)
  public static SubLObject verbal_phrase_tree_get_person_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym359$GET_PERSON ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51935L)
  public static SubLObject verbal_phrase_tree_get_tense_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym431$GET_TENSE ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52179L)
  public static SubLObject verbal_phrase_tree_get_subject_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_phrase_tree_method = NIL;
    final SubLObject idx = get_parse_tree_idx( self );
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD );
      try
      {
        if( NIL != mother )
        {
          SubLObject subject = methods.funcall_instance_method_with_2_args( mother, $sym299$FIND_LAST, $sym381$NOMINAL_TREE_P, number_utilities.f_1_( idx ) );
          if( NIL == subject && NIL != verbal_tree_p( mother ) )
          {
            subject = methods.funcall_instance_method_with_0_args( mother, $sym409$GET_SUBJECT );
          }
          Dynamic.sublisp_throw( $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, subject );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_idx( self, idx );
          set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52516L)
  public static SubLObject verbal_phrase_tree_get_objects_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym437$GET_OBJECTS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52741L)
  public static SubLObject verbal_phrase_tree_get_direct_object_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym440$GET_DIRECT_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52971L)
  public static SubLObject verbal_phrase_tree_get_indirect_object_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym443$GET_INDIRECT_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53207L)
  public static SubLObject verbal_phrase_tree_get_semantic_direct_object_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym446$GET_SEMANTIC_DIRECT_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53464L)
  public static SubLObject verbal_phrase_tree_get_semantic_indirect_object_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym449$GET_SEMANTIC_INDIRECT_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53727L)
  public static SubLObject verbal_phrase_tree_get_semantic_subject_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym92$GET_SEMANTIC_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym452$GET_SEMANTIC_SUBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53975L)
  public static SubLObject verbal_phrase_tree_get_semantic_objects_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym92$GET_SEMANTIC_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym455$GET_SEMANTIC_OBJECTS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54225L)
  public static SubLObject verbal_phrase_tree_get_verbal_complement_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym317$GET_VERBAL_COMPLEMENT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54470L)
  public static SubLObject verbal_phrase_tree_copula_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != cyclifier_interface.aux_verb_word_p( head ) ) ? methods.funcall_instance_method_with_0_args( head, $sym460$COPULA_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54719L)
  public static SubLObject verbal_phrase_tree_dummy_to_p_method(final SubLObject self)
  {
    return makeBoolean( NIL != word_tree.verbal_word_tree_p( methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD ) ) && methods.funcall_instance_method_with_0_args( methods
        .funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ), $sym148$GET_STRING ).equal( $str465$to ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54994L)
  public static SubLObject verbal_phrase_tree_passive_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym467$PASSIVE_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55228L)
  public static SubLObject verbal_phrase_tree_finite_p_method(final SubLObject self)
  {
    return finite_verbal_word_tree_p( methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55418L)
  public static SubLObject verbal_phrase_tree_partition_semantic_complements_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym473$PARTITION_SEMANTIC_COMPLEMENTS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55970L)
  public static SubLObject verbal_phrase_tree_get_ancestor_objects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_phrase_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym479$INVERTED_P ) )
        {
          Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, ( NIL != verbal_phrase_tree_p( mother ) ) ? methods.funcall_instance_method_with_0_args( mother, $sym476$GET_ANCESTOR_OBJECTS ) : NIL );
        }
        else
        {
          Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, ConsesLow.append( ( NIL != verbal_phrase_tree_p( mother ) ) ? methods.funcall_instance_method_with_0_args( mother,
              $sym476$GET_ANCESTOR_OBJECTS ) : NIL, methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym381$NOMINAL_TREE_P ) ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_verbal_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56378L)
  public static SubLObject verbal_phrase_tree_get_head_daughters_method(final SubLObject self)
  {
    final SubLObject head_daughters = methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym482$VERBAL_WORD_TREE_P );
    return ( NIL != head_daughters ) ? head_daughters : methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym483$VERBAL_PHRASE_TREE_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56662L)
  public static SubLObject verbal_phrase_tree_inverted_p_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym479$INVERTED_P ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
  public static SubLObject subloop_reserved_initialize_sentential_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
  public static SubLObject subloop_reserved_initialize_sentential_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
  public static SubLObject sentential_tree_p(final SubLObject sentential_tree)
  {
    return classes.subloop_instanceof_class( sentential_tree, $sym487$SENTENTIAL_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 57048L)
  public static SubLObject sentential_tree_get_subject_method(final SubLObject self)
  {
    if( NIL != methods.funcall_instance_method_with_0_args( self, $sym479$INVERTED_P ) )
    {
      final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
      final SubLObject head_mother = ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym74$GET_MOTHER ) : NIL;
      if( NIL != head_mother )
      {
        return methods.funcall_instance_method_with_2_args( head_mother, $sym294$FIND_FIRST, $sym381$NOMINAL_TREE_P, number_utilities.f_1X( methods.funcall_instance_method_with_0_args( head, $sym80$GET_INDEX ) ) );
      }
    }
    else
    {
      final SubLObject subject = methods.funcall_instance_method_with_1_args( self, $sym294$FIND_FIRST, $sym381$NOMINAL_TREE_P );
      if( NIL != subject )
      {
        return subject;
      }
      SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym87$GET_ANCESTORS );
      SubLObject ancestor = NIL;
      ancestor = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != verbal_tree_p( ancestor ) )
        {
          return methods.funcall_instance_method_with_0_args( ancestor, $sym409$GET_SUBJECT );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ancestor = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 57627L)
  public static SubLObject sentential_tree_get_modifieds_method(final SubLObject self)
  {
    if( NIL != word_tree.relative_clause_p( self ) )
    {
      final SubLObject first_daughter = methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER );
      final SubLObject first_head = ( NIL != word_tree.word_tree_p( first_daughter ) ) ? methods.funcall_instance_method_with_0_args( first_daughter, $sym98$GET_HEAD ) : NIL;
      final SubLObject modified = ( NIL != word_tree.wp_tree_p( first_head ) ) ? methods.funcall_instance_method_with_0_args( first_head, $sym495$GET_ANTECEDENT ) : NIL;
      final SubLObject mod_head = ( NIL != word_tree.word_tree_p( modified ) ) ? methods.funcall_instance_method_with_0_args( modified, $sym98$GET_HEAD ) : NIL;
      return ( NIL != mod_head ) ? ConsesLow.list( mod_head ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
  public static SubLObject subloop_reserved_initialize_vp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
  public static SubLObject subloop_reserved_initialize_vp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
  public static SubLObject vp_tree_p(final SubLObject vp_tree)
  {
    return classes.subloop_instanceof_class( vp_tree, $sym497$VP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
  public static SubLObject subloop_reserved_initialize_vg_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
  public static SubLObject subloop_reserved_initialize_vg_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
  public static SubLObject vg_tree_p(final SubLObject vg_tree)
  {
    return classes.subloop_instanceof_class( vg_tree, $sym500$VG_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
  public static SubLObject subloop_reserved_initialize_s1_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
  public static SubLObject subloop_reserved_initialize_s1_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
  public static SubLObject s1_tree_p(final SubLObject s1_tree)
  {
    return classes.subloop_instanceof_class( s1_tree, $sym503$S1_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
  public static SubLObject subloop_reserved_initialize_s_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
  public static SubLObject subloop_reserved_initialize_s_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
  public static SubLObject s_tree_p(final SubLObject s_tree)
  {
    return classes.subloop_instanceof_class( s_tree, $sym506$S_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58408L)
  public static SubLObject s_tree_get_ancestor_objects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_s_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym511$OUTER_CATCH_FOR_S_TREE_METHOD );
      try
      {
        final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym409$GET_SUBJECT );
        if( NIL != subject && NIL != methods.funcall_instance_method_with_0_args( self, $sym479$INVERTED_P ) )
        {
          Dynamic.sublisp_throw( $sym511$OUTER_CATCH_FOR_S_TREE_METHOD, ConsesLow.list( subject ) );
        }
        else if( NIL != mother && NIL != word_tree.relative_clause_p( mother ) )
        {
          Dynamic.sublisp_throw( $sym511$OUTER_CATCH_FOR_S_TREE_METHOD, methods.funcall_instance_method_with_0_args( mother, $sym103$GET_MODIFIEDS ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_s_tree_method = Errors.handleThrowable( ccatch_env_var, $sym511$OUTER_CATCH_FOR_S_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_s_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
  public static SubLObject subloop_reserved_initialize_sbar_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
  public static SubLObject subloop_reserved_initialize_sbar_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
  public static SubLObject sbar_tree_p(final SubLObject sbar_tree)
  {
    return classes.subloop_instanceof_class( sbar_tree, $sym513$SBAR_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
  public static SubLObject subloop_reserved_initialize_sbarq_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
  public static SubLObject subloop_reserved_initialize_sbarq_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
  public static SubLObject sbarq_tree_p(final SubLObject sbarq_tree)
  {
    return classes.subloop_instanceof_class( sbarq_tree, $sym516$SBARQ_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59014L)
  public static SubLObject sbarq_tree_get_head_daughters_method(final SubLObject self)
  {
    final SubLObject head_daughter = methods.funcall_instance_method_with_1_args( self, $sym294$FIND_FIRST, $sym522$VERBAL_TREE_P );
    return ( NIL != head_daughter ) ? ConsesLow.list( head_daughter ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59255L)
  public static SubLObject sbarq_tree_get_ancestor_objects_method(final SubLObject self)
  {
    return Sequences.delete( methods.funcall_instance_method_with_0_args( self, $sym409$GET_SUBJECT ), methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym381$NOMINAL_TREE_P ), EQ, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
  public static SubLObject subloop_reserved_initialize_sq_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
  public static SubLObject subloop_reserved_initialize_sq_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
  public static SubLObject sq_tree_p(final SubLObject sq_tree)
  {
    return classes.subloop_instanceof_class( sq_tree, $sym526$SQ_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59620L)
  public static SubLObject sq_tree_get_ancestor_objects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sq_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD, ConsesLow.append( methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym381$NOMINAL_TREE_P ).rest(), ( NIL != verbal_phrase_tree_p(
            mother ) ) ? methods.funcall_instance_method_with_0_args( mother, $sym476$GET_ANCESTOR_OBJECTS ) : NIL ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_sq_tree_method = Errors.handleThrowable( ccatch_env_var, $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sq_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
  public static SubLObject subloop_reserved_initialize_sinv_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
  public static SubLObject subloop_reserved_initialize_sinv_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
  public static SubLObject sinv_tree_p(final SubLObject sinv_tree)
  {
    return classes.subloop_instanceof_class( sinv_tree, $sym533$SINV_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
  public static SubLObject subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
  public static SubLObject subloop_reserved_initialize_prepositional_or_particle_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
  public static SubLObject prepositional_or_particle_phrase_tree_p(final SubLObject prepositional_or_particle_phrase_tree)
  {
    return classes.subloop_instanceof_class( prepositional_or_particle_phrase_tree, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60222L)
  public static SubLObject prepositional_or_particle_phrase_tree_get_head_daughters_method(final SubLObject self)
  {
    if( NIL != word_tree.vbg_tree_p( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) );
    }
    return ConsesLow.append( methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym541$PREPOSITIONAL_TREE_P ), methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym542$PARTICLE_TREE_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60658L)
  public static SubLObject prepositional_or_particle_phrase_tree_get_oblique_object_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym544$GET_OBLIQUE_OBJECT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60936L)
  public static SubLObject prepositional_or_particle_phrase_tree_stranded_p_method(final SubLObject self)
  {
    return makeBoolean( methods.funcall_instance_method_with_0_args( self, $sym207$DAUGHTER_COUNT ).numE( ONE_INTEGER ) && NIL != word_tree.prepositional_or_particle_word_tree_p( methods
        .funcall_instance_method_with_1_args( self, $sym137$GET_DAUGHTER, ZERO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
  public static SubLObject subloop_reserved_initialize_prepositional_phrase_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
  public static SubLObject subloop_reserved_initialize_prepositional_phrase_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
  public static SubLObject prepositional_phrase_tree_p(final SubLObject prepositional_phrase_tree)
  {
    return classes.subloop_instanceof_class( prepositional_phrase_tree, $sym550$PREPOSITIONAL_PHRASE_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
  public static SubLObject subloop_reserved_initialize_pp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
  public static SubLObject subloop_reserved_initialize_pp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
  public static SubLObject pp_tree_p(final SubLObject pp_tree)
  {
    return classes.subloop_instanceof_class( pp_tree, $sym554$PP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
  public static SubLObject subloop_reserved_initialize_whpp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
  public static SubLObject subloop_reserved_initialize_whpp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
  public static SubLObject whpp_tree_p(final SubLObject whpp_tree)
  {
    return classes.subloop_instanceof_class( whpp_tree, $sym557$WHPP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
  public static SubLObject subloop_reserved_initialize_prt_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
  public static SubLObject subloop_reserved_initialize_prt_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
  public static SubLObject prt_tree_p(final SubLObject prt_tree)
  {
    return classes.subloop_instanceof_class( prt_tree, $sym560$PRT_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61730L)
  public static SubLObject prt_tree_get_head_daughters_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym542$PARTICLE_TREE_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
  public static SubLObject subloop_reserved_initialize_adjp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
  public static SubLObject subloop_reserved_initialize_adjp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
  public static SubLObject adjp_tree_p(final SubLObject adjp_tree)
  {
    return classes.subloop_instanceof_class( adjp_tree, $sym566$ADJP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62075L)
  public static SubLObject adjp_tree_get_head_daughters_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym288$FIND, $sym571$ADJECTIVAL_TREE_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62240L)
  public static SubLObject adjp_tree_get_modifieds_method(final SubLObject self)
  {
    final SubLObject head = methods.funcall_instance_method_with_0_args( self, $sym98$GET_HEAD );
    return ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym103$GET_MODIFIEDS ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
  public static SubLObject subloop_reserved_initialize_whadjp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
  public static SubLObject subloop_reserved_initialize_whadjp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
  public static SubLObject whadjp_tree_p(final SubLObject whadjp_tree)
  {
    return classes.subloop_instanceof_class( whadjp_tree, $sym575$WHADJP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62560L)
  public static SubLObject whadjp_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon)
  {
    assert NIL != abstract_lexicon.abstract_lexicon_p( lexicon ) : lexicon;
    final SubLObject vector_var = get_phrase_tree_daughters( self );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      methods.funcall_instance_method_with_1_args( daughter, $sym121$LEXIFY_INT, lexicon );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
  public static SubLObject subloop_reserved_initialize_advp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
  public static SubLObject subloop_reserved_initialize_advp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
  public static SubLObject advp_tree_p(final SubLObject advp_tree)
  {
    return classes.subloop_instanceof_class( advp_tree, $sym581$ADVP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63186L)
  public static SubLObject advp_tree_get_head_daughters_method(final SubLObject self)
  {
    final SubLObject head_dtr = methods.funcall_instance_method_with_1_args( self, $sym299$FIND_LAST, $sym586$ADVERBIAL_TREE_P );
    return ( NIL != head_dtr ) ? ConsesLow.list( head_dtr ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
  public static SubLObject subloop_reserved_initialize_whadvp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
  public static SubLObject subloop_reserved_initialize_whadvp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
  public static SubLObject whadvp_tree_p(final SubLObject whadvp_tree)
  {
    return classes.subloop_instanceof_class( whadvp_tree, $sym588$WHADVP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
  public static SubLObject subloop_reserved_initialize_frag_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
  public static SubLObject subloop_reserved_initialize_frag_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
  public static SubLObject frag_tree_p(final SubLObject frag_tree)
  {
    return classes.subloop_instanceof_class( frag_tree, $sym591$FRAG_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
  public static SubLObject subloop_reserved_initialize_qp_tree_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym62$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
  public static SubLObject subloop_reserved_initialize_qp_tree_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym64$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$OBJECT, $sym65$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym24$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym23$CATEGORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym22$MOTHER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym21$IDX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym20$MODIFIERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$PARSE_TREE, $sym19$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym184$PHRASE_TREE, $sym186$DAUGHTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
  public static SubLObject qp_tree_p(final SubLObject qp_tree)
  {
    return classes.subloop_instanceof_class( qp_tree, $sym594$QP_TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63806L)
  public static SubLObject qp_tree_get_head_daughters_method(final SubLObject self)
  {
    return phrase_tree_find_method( self, $sym600$CARDINAL_WORD_TREE_P, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63974L)
  public static SubLObject qp_tree_get_quantified_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_qp_tree_method = NIL;
    final SubLObject mother = get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD, ( NIL != mother ) ? methods.funcall_instance_method_with_0_args( mother, $sym98$GET_HEAD ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_mother( self, mother );
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
      catch_var_for_qp_tree_method = Errors.handleThrowable( ccatch_env_var, $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_qp_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 64171L)
  public static SubLObject qp_tree_cyclify_int_method(final SubLObject self)
  {
    final SubLObject scycls = subcyclifier.subcyclifier_cyclify( self );
    if( NIL != scycls )
    {
      return scycls;
    }
    SubLObject cycls = NIL;
    final SubLObject number = numeral_parser.string_to_interval( methods.funcall_instance_method_with_0_args( self, $sym148$GET_STRING ) );
    final SubLObject quantified = methods.funcall_instance_method_with_0_args( self, $sym602$GET_QUANTIFIED );
    final SubLObject restrictions = ( NIL != quantified ) ? methods.funcall_instance_method_with_0_args( quantified, $sym607$CYCLIFY_NUCLEUS ) : NIL;
    final SubLObject variable = ( NIL != quantified ) ? methods.funcall_instance_method_with_0_args( quantified, $sym204$GET_REFS ).first() : NIL;
    if( NIL != number )
    {
      SubLObject cdolist_list_var = restrictions;
      SubLObject restriction = NIL;
      restriction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cycls = ConsesLow.cons( cyclifier.new_cyclification( ConsesLow.list( $const608$thereExistAtLeast, number, variable, ConsesLow.listS( $const609$and, restriction, $list610 ) ), self, ONE_INTEGER ), cycls );
        cdolist_list_var = cdolist_list_var.rest();
        restriction = cdolist_list_var.first();
      }
    }
    return cycls;
  }

  public static SubLObject declare_parse_tree_file()
  {
    SubLFiles.declareFunction( me, "nominal_tree_p", "NOMINAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_tree_p", "VERBAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_tree_p", "ADVERBIAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_tree_p", "PREPOSITIONAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "particle_tree_p", "PARTICLE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_tree_p", "ADJECTIVAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "question_tree_p", "QUESTION-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_tree_p", "WH-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "numerical_tree_p", "NUMERICAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "finite_verbal_word_tree_p", "FINITE-VERBAL-WORD-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_tree_p", "QUANTIFIER-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pronoun_tree_p", "PRONOUN-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_context", "GET-PARSE-TREE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_context", "SET-PARSE-TREE-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_modifiers", "GET-PARSE-TREE-MODIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_modifiers", "SET-PARSE-TREE-MODIFIERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_idx", "GET-PARSE-TREE-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_idx", "SET-PARSE-TREE-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_mother", "GET-PARSE-TREE-MOTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_mother", "SET-PARSE-TREE-MOTHER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_category", "GET-PARSE-TREE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_category", "SET-PARSE-TREE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_string", "GET-PARSE-TREE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_string", "SET-PARSE-TREE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_cyclifier_method", "PARSE-TREE-GET-CYCLIFIER-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_tree_cyclify_method", "PARSE-TREE-CYCLIFY-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_p", "PARSE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_deep_copy_method", "PARSE-TREE-DEEP-COPY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_root_method", "PARSE-TREE-GET-ROOT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_category_method", "PARSE-TREE-GET-CATEGORY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_index_method", "PARSE-TREE-GET-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_path_method", "PARSE-TREE-GET-PATH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_mother_method", "PARSE-TREE-GET-MOTHER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_semantic_head_method", "PARSE-TREE-GET-SEMANTIC-HEAD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_complements_method", "PARSE-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_modifiers_method", "PARSE-TREE-GET-MODIFIERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_modifieds_method", "PARSE-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_context_method", "PARSE-TREE-GET-CONTEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_temporal_tree_p_method", "PARSE-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_cyclifiable_question_p_method", "PARSE-TREE-CYCLIFIABLE-QUESTION-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_root_p_method", "PARSE-TREE-ROOT-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_lexify_method", "PARSE-TREE-LEXIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_lexify_int_method", "PARSE-TREE-LEXIFY-INT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_cyclify_int_method", "PARSE-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_ancestors_method", "PARSE-TREE-GET-ANCESTORS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_get_sister_method", "PARSE-TREE-GET-SISTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_print_method", "PARSE-TREE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "pprint_word_tree", "PPRINT-WORD-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "pprint_parse_tree", "PPRINT-PARSE-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_parse_tree", "NEW-PARSE-TREE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_parse_tree_int", "NEW-PARSE-TREE-INT", 1, 4, false );
    SubLFiles.declareMacro( me, "do_parse_tree_subtrees", "DO-PARSE-TREE-SUBTREES" );
    SubLFiles.declareMacro( me, "do_parse_tree_word_trees", "DO-PARSE-TREE-WORD-TREES" );
    SubLFiles.declareFunction( me, "get_phrase_tree_daughters", "GET-PHRASE-TREE-DAUGHTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_phrase_tree_daughters", "SET-PHRASE-TREE-DAUGHTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_p", "PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_head_daughters_method", "PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_head_daughter_method", "PHRASE-TREE-GET-HEAD-DAUGHTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_head_method", "PHRASE-TREE-GET-HEAD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_semantic_head_daughters_method", "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_semantic_head_daughter_method", "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_refs_method", "PHRASE-TREE-GET-REFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_modifiers_method", "PHRASE-TREE-GET-MODIFIERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_conjunction_method", "PHRASE-TREE-GET-CONJUNCTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_lexify_int_method", "PHRASE-TREE-LEXIFY-INT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_retokenize_method", "PHRASE-TREE-RETOKENIZE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_retokenize_int_method", "PHRASE-TREE-RETOKENIZE-INT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_partial_retokenize_int_method", "PHRASE-TREE-PARTIAL-RETOKENIZE-INT-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_adjacent_daughters_have_lexical_entry_method", "PHRASE-TREE-ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_cyclify_int_method", "PHRASE-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_expression_to_phrase_tree", "PARSE-EXPRESSION-TO-PHRASE-TREE", 1, 4, false );
    SubLFiles.declareFunction( me, "tree_for_category", "TREE-FOR-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "pprint_phrase_tree", "PPRINT-PHRASE-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_string_method", "PHRASE-TREE-GET-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_string", "PHRASE-TREE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_yield_method", "PHRASE-TREE-YIELD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_yield", "PHRASE-TREE-YIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_parse_expression_method", "PHRASE-TREE-GET-PARSE-EXPRESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_heads_method", "PHRASE-TREE-GET-HEADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_semantic_heads_method", "PHRASE-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_daughter_method", "PHRASE-TREE-GET-DAUGHTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_descendant_method", "PHRASE-TREE-GET-DESCENDANT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "proper_subtree_p", "PROPER-SUBTREE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subtree_p", "SUBTREE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_search_method", "PHRASE-TREE-SEARCH-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "phrase_tree_daughter_count_method", "PHRASE-TREE-DAUGHTER-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_preterminal_p_method", "PHRASE-TREE-PRETERMINAL-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_hydra_p_method", "PHRASE-TREE-HYDRA-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_find_method", "PHRASE-TREE-FIND-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "phrase_tree_find_first_method", "PHRASE-TREE-FIND-FIRST-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "phrase_tree_find_last_method", "PHRASE-TREE-FIND-LAST-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "phrase_tree_find_all_method", "PHRASE-TREE-FIND-ALL-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "phrase_tree_find_all_subtrees_of_categories_method", "PHRASE-TREE-FIND-ALL-SUBTREES-OF-CATEGORIES-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "tree_yield_to_words", "TREE-YIELD-TO-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "main_collection", "MAIN-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "contract_stringP", "CONTRACT-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "rightmost_nominal_word", "RIGHTMOST-NOMINAL-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "nominal_words", "NOMINAL-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "conflate_nominals", "CONFLATE-NOMINALS", 2, 0, false );
    SubLFiles.declareFunction( me, "process_modifiers", "PROCESS-MODIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "process_abs_index", "PROCESS-ABS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "retag_aux_verbs", "RETAG-AUX-VERBS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_modifiers", "CLEAR-MODIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "quantify_existentially", "QUANTIFY-EXISTENTIALLY", 1, 1, false );
    SubLFiles.declareFunction( me, "question_referents", "QUESTION-REFERENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nominal_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nominal_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_p", "NOMINAL-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_determiner_method", "NOMINAL-PHRASE-TREE-GET-DETERMINER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_overt_quantifier_method", "NOMINAL-PHRASE-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_quantifier_method", "NOMINAL-PHRASE-TREE-GET-QUANTIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_possessor_method", "NOMINAL-PHRASE-TREE-GET-POSSESSOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_specifier_method", "NOMINAL-PHRASE-TREE-GET-SPECIFIER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_possessive_p_method", "NOMINAL-PHRASE-TREE-POSSESSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_temporal_tree_p_method", "NOMINAL-PHRASE-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_definite_description_p_method", "NOMINAL-PHRASE-TREE-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_name_tree_p_method", "NOMINAL-PHRASE-TREE-NAME-TREE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_gender_method", "NOMINAL-PHRASE-TREE-GET-GENDER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_number_method", "NOMINAL-PHRASE-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_person_method", "NOMINAL-PHRASE-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_singular_p_method", "NOMINAL-PHRASE-TREE-SINGULAR-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_plural_p_method", "NOMINAL-PHRASE-TREE-PLURAL-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_lexify_int_method", "NOMINAL-PHRASE-TREE-LEXIFY-INT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "presupposing_tree_p", "PRESUPPOSING-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "introduces_termP", "INTRODUCES-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_entry_sem_equal", "LEX-ENTRY-SEM-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "nominal_phrase_tree_get_head_daughters_method", "NOMINAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_np_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_np_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "np_tree_p", "NP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_npp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_npp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_tree_p", "NPP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nx_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_nx_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nx_tree_p", "NX-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_pnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_pnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pnp_tree_p", "PNP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pnp_tree_get_head_daughters_method", "PNP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "whnp_tree_p", "WHNP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_cyclify_int_vp_coordination_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-COORDINATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_cyclify_int_vp_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_cyclify_int_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_vp_coordinate_phrase_p_method", "VERBAL-PHRASE-TREE-VP-COORDINATE-PHRASE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_verbal_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_verbal_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_p", "VERBAL-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_predicate_method", "VERBAL-PHRASE-TREE-GET-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_number_method", "VERBAL-PHRASE-TREE-GET-NUMBER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_person_method", "VERBAL-PHRASE-TREE-GET-PERSON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_tense_method", "VERBAL-PHRASE-TREE-GET-TENSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_subject_method", "VERBAL-PHRASE-TREE-GET-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_objects_method", "VERBAL-PHRASE-TREE-GET-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_direct_object_method", "VERBAL-PHRASE-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_indirect_object_method", "VERBAL-PHRASE-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_semantic_direct_object_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_semantic_indirect_object_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_semantic_subject_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_semantic_objects_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_verbal_complement_method", "VERBAL-PHRASE-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_copula_p_method", "VERBAL-PHRASE-TREE-COPULA-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_dummy_to_p_method", "VERBAL-PHRASE-TREE-DUMMY-TO-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_passive_p_method", "VERBAL-PHRASE-TREE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_finite_p_method", "VERBAL-PHRASE-TREE-FINITE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_partition_semantic_complements_method", "VERBAL-PHRASE-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_ancestor_objects_method", "VERBAL-PHRASE-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_get_head_daughters_method", "VERBAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_phrase_tree_inverted_p_method", "VERBAL-PHRASE-TREE-INVERTED-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sentential_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sentential_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sentential_tree_p", "SENTENTIAL-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sentential_tree_get_subject_method", "SENTENTIAL-TREE-GET-SUBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sentential_tree_get_modifieds_method", "SENTENTIAL-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vp_tree_p", "VP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vg_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_vg_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "vg_tree_p", "VG-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_s1_tree_class", "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_s1_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "s1_tree_p", "S1-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_s_tree_class", "SUBLOOP-RESERVED-INITIALIZE-S-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_s_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-S-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "s_tree_p", "S-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "s_tree_get_ancestor_objects_method", "S-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sbar_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sbar_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbar_tree_p", "SBAR-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sbarq_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sbarq_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbarq_tree_p", "SBARQ-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbarq_tree_get_head_daughters_method", "SBARQ-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sbarq_tree_get_ancestor_objects_method", "SBARQ-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sq_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sq_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sq_tree_p", "SQ-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sq_tree_get_ancestor_objects_method", "SQ-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sinv_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sinv_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sinv_tree_p", "SINV-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_or_particle_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_phrase_tree_p", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_phrase_tree_get_head_daughters_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_phrase_tree_get_oblique_object_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_phrase_tree_stranded_p_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-STRANDED-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prepositional_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_phrase_tree_p", "PREPOSITIONAL-PHRASE-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_pp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_pp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pp_tree_p", "PP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whpp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whpp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "whpp_tree_p", "WHPP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prt_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_prt_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "prt_tree_p", "PRT-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prt_tree_get_head_daughters_method", "PRT-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adjp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_adjp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "adjp_tree_p", "ADJP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adjp_tree_get_head_daughters_method", "ADJP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "adjp_tree_get_modifieds_method", "ADJP-TREE-GET-MODIFIEDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whadjp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whadjp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "whadjp_tree_p", "WHADJP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "whadjp_tree_lexify_int_method", "WHADJP-TREE-LEXIFY-INT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_advp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_advp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "advp_tree_p", "ADVP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "advp_tree_get_head_daughters_method", "ADVP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whadvp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_whadvp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "whadvp_tree_p", "WHADVP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_frag_tree_class", "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_frag_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "frag_tree_p", "FRAG-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_qp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_qp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "qp_tree_p", "QP-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "qp_tree_get_head_daughters_method", "QP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "qp_tree_get_quantified_method", "QP-TREE-GET-QUANTIFIED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "qp_tree_cyclify_int_method", "QP-TREE-CYCLIFY-INT-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_parse_tree_file()
  {
    $phrase_tree_allow_adjacent_daughters_to_merge$ = SubLFiles.defparameter( "*PHRASE-TREE-ALLOW-ADJACENT-DAUGHTERS-TO-MERGE*", NIL );
    $category_to_phrase$ = SubLFiles.defparameter( "*CATEGORY-TO-PHRASE*", $list245 );
    return NIL;
  }

  public static SubLObject setup_parse_tree_file()
  {
    interfaces.new_interface( $sym0$NOMINAL_TREE, NIL, NIL, $list1 );
    interfaces.new_interface( $sym2$VERBAL_TREE, NIL, NIL, $list3 );
    interfaces.new_interface( $sym4$ADVERBIAL_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym5$PREPOSITIONAL_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym6$PARTICLE_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym7$ADJECTIVAL_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym8$QUESTION_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym9$WH_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym10$NUMERICAL_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym11$FINITE_VERBAL_WORD_TREE, NIL, NIL, NIL );
    interfaces.new_interface( $sym12$QUANTIFIER_TREE, NIL, NIL, $list13 );
    interfaces.new_interface( $sym14$PRONOUN_TREE, NIL, NIL, NIL );
    classes.subloop_new_class( $sym15$PARSE_TREE, $sym16$OBJECT, $list17, T, $list18 );
    classes.class_set_implements_slot_listeners( $sym15$PARSE_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym25$GET_CYCLIFIER, $sym15$PARSE_TREE, $list26, $list27, $list28 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym25$GET_CYCLIFIER, $sym56$PARSE_TREE_GET_CYCLIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym57$CYCLIFY, $sym15$PARSE_TREE, $list26, $list27, $list58 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym57$CYCLIFY, $sym61$PARSE_TREE_CYCLIFY_METHOD );
    classes.subloop_note_class_initialization_function( $sym15$PARSE_TREE, $sym63$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym15$PARSE_TREE, $sym66$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_INSTANCE );
    subloop_reserved_initialize_parse_tree_class( $sym15$PARSE_TREE );
    methods.methods_incorporate_instance_method( $sym67$DEEP_COPY, $sym15$PARSE_TREE, $list26, NIL, $list68 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym67$DEEP_COPY, $sym70$PARSE_TREE_DEEP_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym71$GET_ROOT, $sym15$PARSE_TREE, $list26, NIL, $list72 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym71$GET_ROOT, $sym75$PARSE_TREE_GET_ROOT_METHOD );
    methods.methods_incorporate_instance_method( $sym76$GET_CATEGORY, $sym15$PARSE_TREE, $list26, NIL, $list77 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym76$GET_CATEGORY, $sym79$PARSE_TREE_GET_CATEGORY_METHOD );
    methods.methods_incorporate_instance_method( $sym80$GET_INDEX, $sym15$PARSE_TREE, $list26, NIL, $list81 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym80$GET_INDEX, $sym83$PARSE_TREE_GET_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym84$GET_PATH, $sym15$PARSE_TREE, $list26, NIL, $list85 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym84$GET_PATH, $sym88$PARSE_TREE_GET_PATH_METHOD );
    methods.methods_incorporate_instance_method( $sym74$GET_MOTHER, $sym15$PARSE_TREE, $list26, NIL, $list89 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym74$GET_MOTHER, $sym91$PARSE_TREE_GET_MOTHER_METHOD );
    methods.methods_incorporate_instance_method( $sym92$GET_SEMANTIC_HEAD, $sym15$PARSE_TREE, $list26, NIL, $list93 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym92$GET_SEMANTIC_HEAD, $sym95$PARSE_TREE_GET_SEMANTIC_HEAD_METHOD );
    methods.methods_incorporate_instance_method( $sym96$GET_COMPLEMENTS, $sym15$PARSE_TREE, $list26, NIL, $list97 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym96$GET_COMPLEMENTS, $sym99$PARSE_TREE_GET_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym100$GET_MODIFIERS, $sym15$PARSE_TREE, $list26, NIL, $list101 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym100$GET_MODIFIERS, $sym102$PARSE_TREE_GET_MODIFIERS_METHOD );
    methods.methods_incorporate_instance_method( $sym103$GET_MODIFIEDS, $sym15$PARSE_TREE, $list26, NIL, $list104 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym103$GET_MODIFIEDS, $sym105$PARSE_TREE_GET_MODIFIEDS_METHOD );
    methods.methods_incorporate_instance_method( $sym106$GET_CONTEXT, $sym15$PARSE_TREE, $list26, NIL, $list107 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym106$GET_CONTEXT, $sym109$PARSE_TREE_GET_CONTEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym110$TEMPORAL_TREE_P, $sym15$PARSE_TREE, $list26, NIL, $list111 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym110$TEMPORAL_TREE_P, $sym112$PARSE_TREE_TEMPORAL_TREE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym113$CYCLIFIABLE_QUESTION_P, $sym15$PARSE_TREE, $list26, NIL, $list114 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym113$CYCLIFIABLE_QUESTION_P, $sym115$PARSE_TREE_CYCLIFIABLE_QUESTION_P_METHOD );
    methods.methods_incorporate_instance_method( $sym73$ROOT_P, $sym15$PARSE_TREE, $list26, NIL, $list116 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym73$ROOT_P, $sym118$PARSE_TREE_ROOT_P_METHOD );
    methods.methods_incorporate_instance_method( $sym53$LEXIFY, $sym15$PARSE_TREE, $list26, $list119, $list120 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym53$LEXIFY, $sym122$PARSE_TREE_LEXIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym121$LEXIFY_INT, $sym15$PARSE_TREE, $list123, $list119, $list124 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym121$LEXIFY_INT, $sym125$PARSE_TREE_LEXIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym126$CYCLIFY_INT, $sym15$PARSE_TREE, $list123, NIL, $list127 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym126$CYCLIFY_INT, $sym128$PARSE_TREE_CYCLIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym87$GET_ANCESTORS, $sym15$PARSE_TREE, $list123, NIL, $list129 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym87$GET_ANCESTORS, $sym131$PARSE_TREE_GET_ANCESTORS_METHOD );
    methods.methods_incorporate_instance_method( $sym132$GET_SISTER, $sym15$PARSE_TREE, $list26, $list133, $list134 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym132$GET_SISTER, $sym138$PARSE_TREE_GET_SISTER_METHOD );
    methods.methods_incorporate_instance_method( $sym139$PRINT, $sym15$PARSE_TREE, $list123, $list140, $list141 );
    methods.subloop_register_instance_method( $sym15$PARSE_TREE, $sym139$PRINT, $sym142$PARSE_TREE_PRINT_METHOD );
    classes.subloop_new_class( $sym184$PHRASE_TREE, $sym15$PARSE_TREE, NIL, NIL, $list185 );
    classes.class_set_implements_slot_listeners( $sym184$PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym184$PHRASE_TREE, $sym187$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym184$PHRASE_TREE, $sym188$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_INSTANCE );
    subloop_reserved_initialize_phrase_tree_class( $sym184$PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym184$PHRASE_TREE, $list26, NIL, $list190 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym191$PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym192$GET_HEAD_DAUGHTER, $sym184$PHRASE_TREE, $list26, NIL, $list193 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym192$GET_HEAD_DAUGHTER, $sym194$PHRASE_TREE_GET_HEAD_DAUGHTER_METHOD );
    methods.methods_incorporate_instance_method( $sym98$GET_HEAD, $sym184$PHRASE_TREE, $list26, NIL, $list195 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym98$GET_HEAD, $sym197$PHRASE_TREE_GET_HEAD_METHOD );
    methods.methods_incorporate_instance_method( $sym198$GET_SEMANTIC_HEAD_DAUGHTERS, $sym184$PHRASE_TREE, $list26, NIL, $list199 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym198$GET_SEMANTIC_HEAD_DAUGHTERS, $sym200$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym201$GET_SEMANTIC_HEAD_DAUGHTER, $sym184$PHRASE_TREE, $list26, NIL, $list202 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym201$GET_SEMANTIC_HEAD_DAUGHTER, $sym203$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTER_METHOD );
    methods.methods_incorporate_instance_method( $sym204$GET_REFS, $sym184$PHRASE_TREE, $list205, NIL, $list206 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym204$GET_REFS, $sym209$PHRASE_TREE_GET_REFS_METHOD );
    methods.methods_incorporate_instance_method( $sym100$GET_MODIFIERS, $sym184$PHRASE_TREE, $list26, NIL, $list210 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym100$GET_MODIFIERS, $sym211$PHRASE_TREE_GET_MODIFIERS_METHOD );
    methods.methods_incorporate_instance_method( $sym212$GET_CONJUNCTION, $sym184$PHRASE_TREE, $list26, NIL, $list213 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym212$GET_CONJUNCTION, $sym215$PHRASE_TREE_GET_CONJUNCTION_METHOD );
    methods.methods_incorporate_instance_method( $sym121$LEXIFY_INT, $sym184$PHRASE_TREE, $list216, $list119, $list217 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym121$LEXIFY_INT, $sym219$PHRASE_TREE_LEXIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym150$RETOKENIZE, $sym184$PHRASE_TREE, $list216, $list119, $list220 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym150$RETOKENIZE, $sym227$PHRASE_TREE_RETOKENIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym222$RETOKENIZE_INT, $sym184$PHRASE_TREE, $list123, $list228, $list229 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym222$RETOKENIZE_INT, $sym232$PHRASE_TREE_RETOKENIZE_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym226$PARTIAL_RETOKENIZE_INT, $sym184$PHRASE_TREE, $list216, $list233, $list234 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym226$PARTIAL_RETOKENIZE_INT, $sym235$PHRASE_TREE_PARTIAL_RETOKENIZE_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, $sym184$PHRASE_TREE, $list123, $list119, $list236 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, $sym241$PHRASE_TREE_ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym126$CYCLIFY_INT, $sym184$PHRASE_TREE, $list123, NIL, $list242 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym126$CYCLIFY_INT, $sym244$PHRASE_TREE_CYCLIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym148$GET_STRING, $sym184$PHRASE_TREE, $list26, NIL, $list248 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym148$GET_STRING, $sym252$PHRASE_TREE_GET_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym218$YIELD, $sym184$PHRASE_TREE, $list26, NIL, $list253 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym218$YIELD, $sym255$PHRASE_TREE_YIELD_METHOD );
    methods.methods_incorporate_instance_method( $sym256$GET_PARSE_EXPRESSION, $sym184$PHRASE_TREE, $list26, NIL, $list257 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym256$GET_PARSE_EXPRESSION, $sym258$PHRASE_TREE_GET_PARSE_EXPRESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym196$GET_HEADS, $sym184$PHRASE_TREE, $list26, NIL, $list259 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym196$GET_HEADS, $sym260$PHRASE_TREE_GET_HEADS_METHOD );
    methods.methods_incorporate_instance_method( $sym94$GET_SEMANTIC_HEADS, $sym184$PHRASE_TREE, $list26, NIL, $list261 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym94$GET_SEMANTIC_HEADS, $sym262$PHRASE_TREE_GET_SEMANTIC_HEADS_METHOD );
    methods.methods_incorporate_instance_method( $sym137$GET_DAUGHTER, $sym184$PHRASE_TREE, $list26, $list133, $list263 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym137$GET_DAUGHTER, $sym266$PHRASE_TREE_GET_DAUGHTER_METHOD );
    methods.methods_incorporate_instance_method( $sym267$GET_DESCENDANT, $sym184$PHRASE_TREE, $list26, $list268, $list269 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym267$GET_DESCENDANT, $sym271$PHRASE_TREE_GET_DESCENDANT_METHOD );
    methods.methods_incorporate_instance_method( $sym273$SEARCH, $sym184$PHRASE_TREE, $list26, $list274, $list275 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym273$SEARCH, $sym278$PHRASE_TREE_SEARCH_METHOD );
    methods.methods_incorporate_instance_method( $sym207$DAUGHTER_COUNT, $sym184$PHRASE_TREE, $list26, NIL, $list279 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym207$DAUGHTER_COUNT, $sym281$PHRASE_TREE_DAUGHTER_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym221$PRETERMINAL_P, $sym184$PHRASE_TREE, $list26, NIL, $list282 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym221$PRETERMINAL_P, $sym284$PHRASE_TREE_PRETERMINAL_P_METHOD );
    methods.methods_incorporate_instance_method( $sym285$HYDRA_P, $sym184$PHRASE_TREE, $list26, NIL, $list286 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym285$HYDRA_P, $sym287$PHRASE_TREE_HYDRA_P_METHOD );
    methods.methods_incorporate_instance_method( $sym288$FIND, $sym184$PHRASE_TREE, $list123, $list289, $list290 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym288$FIND, $sym293$PHRASE_TREE_FIND_METHOD );
    methods.methods_incorporate_instance_method( $sym294$FIND_FIRST, $sym184$PHRASE_TREE, $list123, $list295, $list296 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym294$FIND_FIRST, $sym298$PHRASE_TREE_FIND_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym299$FIND_LAST, $sym184$PHRASE_TREE, $list123, $list300, $list301 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym299$FIND_LAST, $sym303$PHRASE_TREE_FIND_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym304$FIND_ALL, $sym184$PHRASE_TREE, $list123, $list289, $list305 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym304$FIND_ALL, $sym307$PHRASE_TREE_FIND_ALL_METHOD );
    methods.methods_incorporate_instance_method( $sym308$FIND_ALL_SUBTREES_OF_CATEGORIES, $sym184$PHRASE_TREE, $list123, $list309, $list310 );
    methods.subloop_register_instance_method( $sym184$PHRASE_TREE, $sym308$FIND_ALL_SUBTREES_OF_CATEGORIES, $sym311$PHRASE_TREE_FIND_ALL_SUBTREES_OF_CATEGORIES_METHOD );
    classes.subloop_new_class( $sym322$NOMINAL_PHRASE_TREE, $sym184$PHRASE_TREE, $list323, NIL, $list324 );
    classes.class_set_implements_slot_listeners( $sym322$NOMINAL_PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym322$NOMINAL_PHRASE_TREE, $sym325$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym322$NOMINAL_PHRASE_TREE, $sym326$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_INSTANCE );
    subloop_reserved_initialize_nominal_phrase_tree_class( $sym322$NOMINAL_PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym327$GET_DETERMINER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list328 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym327$GET_DETERMINER, $sym329$NOMINAL_PHRASE_TREE_GET_DETERMINER_METHOD );
    methods.methods_incorporate_instance_method( $sym330$GET_OVERT_QUANTIFIER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list331 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym330$GET_OVERT_QUANTIFIER, $sym332$NOMINAL_PHRASE_TREE_GET_OVERT_QUANTIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym333$GET_QUANTIFIER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list334 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym333$GET_QUANTIFIER, $sym335$NOMINAL_PHRASE_TREE_GET_QUANTIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym336$GET_POSSESSOR, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list337 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym336$GET_POSSESSOR, $sym338$NOMINAL_PHRASE_TREE_GET_POSSESSOR_METHOD );
    methods.methods_incorporate_instance_method( $sym339$GET_SPECIFIER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list340 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym339$GET_SPECIFIER, $sym341$NOMINAL_PHRASE_TREE_GET_SPECIFIER_METHOD );
    methods.methods_incorporate_instance_method( $sym342$POSSESSIVE_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list343 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym342$POSSESSIVE_P, $sym344$NOMINAL_PHRASE_TREE_POSSESSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym110$TEMPORAL_TREE_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list345 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym110$TEMPORAL_TREE_P, $sym346$NOMINAL_PHRASE_TREE_TEMPORAL_TREE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym347$DEFINITE_DESCRIPTION_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list348 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym347$DEFINITE_DESCRIPTION_P, $sym349$NOMINAL_PHRASE_TREE_DEFINITE_DESCRIPTION_P_METHOD );
    methods.methods_incorporate_instance_method( $sym350$NAME_TREE_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list351 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym350$NAME_TREE_P, $sym352$NOMINAL_PHRASE_TREE_NAME_TREE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym353$GET_GENDER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list354 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym353$GET_GENDER, $sym355$NOMINAL_PHRASE_TREE_GET_GENDER_METHOD );
    methods.methods_incorporate_instance_method( $sym356$GET_NUMBER, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list357 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym356$GET_NUMBER, $sym358$NOMINAL_PHRASE_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym359$GET_PERSON, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list360 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym359$GET_PERSON, $sym361$NOMINAL_PHRASE_TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym362$SINGULAR_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list363 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym362$SINGULAR_P, $sym364$NOMINAL_PHRASE_TREE_SINGULAR_P_METHOD );
    methods.methods_incorporate_instance_method( $sym365$PLURAL_P, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list366 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym365$PLURAL_P, $sym367$NOMINAL_PHRASE_TREE_PLURAL_P_METHOD );
    methods.methods_incorporate_instance_method( $sym121$LEXIFY_INT, $sym322$NOMINAL_PHRASE_TREE, $list216, $list119, $list368 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym121$LEXIFY_INT, $sym377$NOMINAL_PHRASE_TREE_LEXIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym322$NOMINAL_PHRASE_TREE, $list26, NIL, $list378 );
    methods.subloop_register_instance_method( $sym322$NOMINAL_PHRASE_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym384$NOMINAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD );
    classes.subloop_new_class( $sym385$NP_TREE, $sym322$NOMINAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym385$NP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym385$NP_TREE, $sym386$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym385$NP_TREE, $sym387$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_INSTANCE );
    subloop_reserved_initialize_np_tree_class( $sym385$NP_TREE );
    classes.subloop_new_class( $sym388$NPP_TREE, $sym322$NOMINAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym388$NPP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym388$NPP_TREE, $sym389$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym388$NPP_TREE, $sym390$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_INSTANCE );
    subloop_reserved_initialize_npp_tree_class( $sym388$NPP_TREE );
    classes.subloop_new_class( $sym391$NX_TREE, $sym322$NOMINAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym391$NX_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym391$NX_TREE, $sym392$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym391$NX_TREE, $sym393$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_INSTANCE );
    subloop_reserved_initialize_nx_tree_class( $sym391$NX_TREE );
    classes.subloop_new_class( $sym394$PNP_TREE, $sym322$NOMINAL_PHRASE_TREE, NIL, NIL, $list395 );
    classes.class_set_implements_slot_listeners( $sym394$PNP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym394$PNP_TREE, $sym396$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym394$PNP_TREE, $sym397$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_INSTANCE );
    subloop_reserved_initialize_pnp_tree_class( $sym394$PNP_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym394$PNP_TREE, $list26, NIL, $list398 );
    methods.subloop_register_instance_method( $sym394$PNP_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym399$PNP_TREE_GET_HEAD_DAUGHTERS_METHOD );
    classes.subloop_new_class( $sym400$WHNP_TREE, $sym322$NOMINAL_PHRASE_TREE, $list401, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym400$WHNP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym400$WHNP_TREE, $sym402$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym400$WHNP_TREE, $sym403$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_INSTANCE );
    subloop_reserved_initialize_whnp_tree_class( $sym400$WHNP_TREE );
    classes.subloop_new_class( $sym404$VERBAL_PHRASE_TREE, $sym184$PHRASE_TREE, $list405, NIL, $list406 );
    classes.class_set_implements_slot_listeners( $sym404$VERBAL_PHRASE_TREE, NIL );
    methods.methods_incorporate_instance_method( $sym407$CYCLIFY_INT_VP_COORDINATION, $sym404$VERBAL_PHRASE_TREE, $list123, NIL, $list408 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym407$CYCLIFY_INT_VP_COORDINATION, $sym411$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_COORDINATION_METHOD );
    methods.methods_incorporate_instance_method( $sym410$CYCLIFY_INT_VP, $sym404$VERBAL_PHRASE_TREE, $list123, NIL, $list412 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym410$CYCLIFY_INT_VP, $sym415$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_METHOD );
    methods.methods_incorporate_instance_method( $sym126$CYCLIFY_INT, $sym404$VERBAL_PHRASE_TREE, $list123, NIL, $list416 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym126$CYCLIFY_INT, $sym418$VERBAL_PHRASE_TREE_CYCLIFY_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym417$VP_COORDINATE_PHRASE_P, $sym404$VERBAL_PHRASE_TREE, NIL, NIL, $list419 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym417$VP_COORDINATE_PHRASE_P, $sym421$VERBAL_PHRASE_TREE_VP_COORDINATE_PHRASE_P_METHOD );
    classes.subloop_note_class_initialization_function( $sym404$VERBAL_PHRASE_TREE, $sym422$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym404$VERBAL_PHRASE_TREE, $sym423$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_INSTANCE );
    subloop_reserved_initialize_verbal_phrase_tree_class( $sym404$VERBAL_PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym424$GET_PREDICATE, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list425 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym424$GET_PREDICATE, $sym426$VERBAL_PHRASE_TREE_GET_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym356$GET_NUMBER, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list427 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym356$GET_NUMBER, $sym428$VERBAL_PHRASE_TREE_GET_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym359$GET_PERSON, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list429 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym359$GET_PERSON, $sym430$VERBAL_PHRASE_TREE_GET_PERSON_METHOD );
    methods.methods_incorporate_instance_method( $sym431$GET_TENSE, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list432 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym431$GET_TENSE, $sym433$VERBAL_PHRASE_TREE_GET_TENSE_METHOD );
    methods.methods_incorporate_instance_method( $sym409$GET_SUBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list434 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym409$GET_SUBJECT, $sym436$VERBAL_PHRASE_TREE_GET_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym437$GET_OBJECTS, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list438 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym437$GET_OBJECTS, $sym439$VERBAL_PHRASE_TREE_GET_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym440$GET_DIRECT_OBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list441 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym440$GET_DIRECT_OBJECT, $sym442$VERBAL_PHRASE_TREE_GET_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym443$GET_INDIRECT_OBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list444 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym443$GET_INDIRECT_OBJECT, $sym445$VERBAL_PHRASE_TREE_GET_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym446$GET_SEMANTIC_DIRECT_OBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list447 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym446$GET_SEMANTIC_DIRECT_OBJECT, $sym448$VERBAL_PHRASE_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym449$GET_SEMANTIC_INDIRECT_OBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list450 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym449$GET_SEMANTIC_INDIRECT_OBJECT, $sym451$VERBAL_PHRASE_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym452$GET_SEMANTIC_SUBJECT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list453 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym452$GET_SEMANTIC_SUBJECT, $sym454$VERBAL_PHRASE_TREE_GET_SEMANTIC_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym455$GET_SEMANTIC_OBJECTS, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list456 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym455$GET_SEMANTIC_OBJECTS, $sym457$VERBAL_PHRASE_TREE_GET_SEMANTIC_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym317$GET_VERBAL_COMPLEMENT, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list458 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym317$GET_VERBAL_COMPLEMENT, $sym459$VERBAL_PHRASE_TREE_GET_VERBAL_COMPLEMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym460$COPULA_P, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list461 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym460$COPULA_P, $sym462$VERBAL_PHRASE_TREE_COPULA_P_METHOD );
    methods.methods_incorporate_instance_method( $sym463$DUMMY_TO_P, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list464 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym463$DUMMY_TO_P, $sym466$VERBAL_PHRASE_TREE_DUMMY_TO_P_METHOD );
    methods.methods_incorporate_instance_method( $sym467$PASSIVE_P, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list468 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym467$PASSIVE_P, $sym469$VERBAL_PHRASE_TREE_PASSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym470$FINITE_P, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list471 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym470$FINITE_P, $sym472$VERBAL_PHRASE_TREE_FINITE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym473$PARTITION_SEMANTIC_COMPLEMENTS, $sym404$VERBAL_PHRASE_TREE, $list123, NIL, $list474 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym473$PARTITION_SEMANTIC_COMPLEMENTS, $sym475$VERBAL_PHRASE_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym476$GET_ANCESTOR_OBJECTS, $sym404$VERBAL_PHRASE_TREE, $list123, NIL, $list477 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym476$GET_ANCESTOR_OBJECTS, $sym480$VERBAL_PHRASE_TREE_GET_ANCESTOR_OBJECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list481 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym484$VERBAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym479$INVERTED_P, $sym404$VERBAL_PHRASE_TREE, $list26, NIL, $list485 );
    methods.subloop_register_instance_method( $sym404$VERBAL_PHRASE_TREE, $sym479$INVERTED_P, $sym486$VERBAL_PHRASE_TREE_INVERTED_P_METHOD );
    classes.subloop_new_class( $sym487$SENTENTIAL_TREE, $sym404$VERBAL_PHRASE_TREE, $list488, NIL, $list489 );
    classes.class_set_implements_slot_listeners( $sym487$SENTENTIAL_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym487$SENTENTIAL_TREE, $sym490$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym487$SENTENTIAL_TREE, $sym491$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_INSTANCE );
    subloop_reserved_initialize_sentential_tree_class( $sym487$SENTENTIAL_TREE );
    methods.methods_incorporate_instance_method( $sym409$GET_SUBJECT, $sym487$SENTENTIAL_TREE, $list26, NIL, $list492 );
    methods.subloop_register_instance_method( $sym487$SENTENTIAL_TREE, $sym409$GET_SUBJECT, $sym493$SENTENTIAL_TREE_GET_SUBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym103$GET_MODIFIEDS, $sym487$SENTENTIAL_TREE, $list26, NIL, $list494 );
    methods.subloop_register_instance_method( $sym487$SENTENTIAL_TREE, $sym103$GET_MODIFIEDS, $sym496$SENTENTIAL_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym497$VP_TREE, $sym404$VERBAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym497$VP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym497$VP_TREE, $sym498$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym497$VP_TREE, $sym499$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_INSTANCE );
    subloop_reserved_initialize_vp_tree_class( $sym497$VP_TREE );
    classes.subloop_new_class( $sym500$VG_TREE, $sym404$VERBAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym500$VG_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym500$VG_TREE, $sym501$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym500$VG_TREE, $sym502$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_INSTANCE );
    subloop_reserved_initialize_vg_tree_class( $sym500$VG_TREE );
    classes.subloop_new_class( $sym503$S1_TREE, $sym184$PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym503$S1_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym503$S1_TREE, $sym504$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym503$S1_TREE, $sym505$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_INSTANCE );
    subloop_reserved_initialize_s1_tree_class( $sym503$S1_TREE );
    classes.subloop_new_class( $sym506$S_TREE, $sym487$SENTENTIAL_TREE, NIL, NIL, $list507 );
    classes.class_set_implements_slot_listeners( $sym506$S_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym506$S_TREE, $sym508$SUBLOOP_RESERVED_INITIALIZE_S_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym506$S_TREE, $sym509$SUBLOOP_RESERVED_INITIALIZE_S_TREE_INSTANCE );
    subloop_reserved_initialize_s_tree_class( $sym506$S_TREE );
    methods.methods_incorporate_instance_method( $sym476$GET_ANCESTOR_OBJECTS, $sym506$S_TREE, $list26, NIL, $list510 );
    methods.subloop_register_instance_method( $sym506$S_TREE, $sym476$GET_ANCESTOR_OBJECTS, $sym512$S_TREE_GET_ANCESTOR_OBJECTS_METHOD );
    classes.subloop_new_class( $sym513$SBAR_TREE, $sym487$SENTENTIAL_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym513$SBAR_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym513$SBAR_TREE, $sym514$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym513$SBAR_TREE, $sym515$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_INSTANCE );
    subloop_reserved_initialize_sbar_tree_class( $sym513$SBAR_TREE );
    classes.subloop_new_class( $sym516$SBARQ_TREE, $sym487$SENTENTIAL_TREE, $list517, NIL, $list518 );
    classes.class_set_implements_slot_listeners( $sym516$SBARQ_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym516$SBARQ_TREE, $sym519$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym516$SBARQ_TREE, $sym520$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_INSTANCE );
    subloop_reserved_initialize_sbarq_tree_class( $sym516$SBARQ_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym516$SBARQ_TREE, $list26, NIL, $list521 );
    methods.subloop_register_instance_method( $sym516$SBARQ_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym523$SBARQ_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym476$GET_ANCESTOR_OBJECTS, $sym516$SBARQ_TREE, $list123, NIL, $list524 );
    methods.subloop_register_instance_method( $sym516$SBARQ_TREE, $sym476$GET_ANCESTOR_OBJECTS, $sym525$SBARQ_TREE_GET_ANCESTOR_OBJECTS_METHOD );
    classes.subloop_new_class( $sym526$SQ_TREE, $sym487$SENTENTIAL_TREE, $list517, NIL, $list527 );
    classes.class_set_implements_slot_listeners( $sym526$SQ_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym526$SQ_TREE, $sym528$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym526$SQ_TREE, $sym529$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_INSTANCE );
    subloop_reserved_initialize_sq_tree_class( $sym526$SQ_TREE );
    methods.methods_incorporate_instance_method( $sym476$GET_ANCESTOR_OBJECTS, $sym526$SQ_TREE, $list123, NIL, $list530 );
    methods.subloop_register_instance_method( $sym526$SQ_TREE, $sym476$GET_ANCESTOR_OBJECTS, $sym532$SQ_TREE_GET_ANCESTOR_OBJECTS_METHOD );
    classes.subloop_new_class( $sym533$SINV_TREE, $sym404$VERBAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym533$SINV_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym533$SINV_TREE, $sym534$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym533$SINV_TREE, $sym535$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_INSTANCE );
    subloop_reserved_initialize_sinv_tree_class( $sym533$SINV_TREE );
    classes.subloop_new_class( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym184$PHRASE_TREE, NIL, NIL, $list537 );
    classes.class_set_implements_slot_listeners( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym538$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE );
    classes.subloop_note_instance_initialization_function( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym539$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE );
    subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $list26, NIL, $list540 );
    methods.subloop_register_instance_method( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym543$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym544$GET_OBLIQUE_OBJECT, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $list26, NIL, $list545 );
    methods.subloop_register_instance_method( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym544$GET_OBLIQUE_OBJECT, $sym546$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_OBLIQUE_OBJECT_METHOD );
    methods.methods_incorporate_instance_method( $sym547$STRANDED_P, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $list26, NIL, $list548 );
    methods.subloop_register_instance_method( $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $sym547$STRANDED_P, $sym549$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_STRANDED_P_METHOD );
    classes.subloop_new_class( $sym550$PREPOSITIONAL_PHRASE_TREE, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $list551, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym550$PREPOSITIONAL_PHRASE_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym550$PREPOSITIONAL_PHRASE_TREE, $sym552$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym550$PREPOSITIONAL_PHRASE_TREE, $sym553$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_INSTANCE );
    subloop_reserved_initialize_prepositional_phrase_tree_class( $sym550$PREPOSITIONAL_PHRASE_TREE );
    classes.subloop_new_class( $sym554$PP_TREE, $sym550$PREPOSITIONAL_PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym554$PP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym554$PP_TREE, $sym555$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym554$PP_TREE, $sym556$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_INSTANCE );
    subloop_reserved_initialize_pp_tree_class( $sym554$PP_TREE );
    classes.subloop_new_class( $sym557$WHPP_TREE, $sym550$PREPOSITIONAL_PHRASE_TREE, $list401, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym557$WHPP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym557$WHPP_TREE, $sym558$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym557$WHPP_TREE, $sym559$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_INSTANCE );
    subloop_reserved_initialize_whpp_tree_class( $sym557$WHPP_TREE );
    classes.subloop_new_class( $sym560$PRT_TREE, $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, $list561, NIL, $list395 );
    classes.class_set_implements_slot_listeners( $sym560$PRT_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym560$PRT_TREE, $sym562$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym560$PRT_TREE, $sym563$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_INSTANCE );
    subloop_reserved_initialize_prt_tree_class( $sym560$PRT_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym560$PRT_TREE, $list26, NIL, $list564 );
    methods.subloop_register_instance_method( $sym560$PRT_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym565$PRT_TREE_GET_HEAD_DAUGHTERS_METHOD );
    classes.subloop_new_class( $sym566$ADJP_TREE, $sym184$PHRASE_TREE, $list567, NIL, $list395 );
    classes.class_set_implements_slot_listeners( $sym566$ADJP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym566$ADJP_TREE, $sym568$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym566$ADJP_TREE, $sym569$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_INSTANCE );
    subloop_reserved_initialize_adjp_tree_class( $sym566$ADJP_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym566$ADJP_TREE, $list26, NIL, $list570 );
    methods.subloop_register_instance_method( $sym566$ADJP_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym572$ADJP_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym103$GET_MODIFIEDS, $sym566$ADJP_TREE, $list26, NIL, $list573 );
    methods.subloop_register_instance_method( $sym566$ADJP_TREE, $sym103$GET_MODIFIEDS, $sym574$ADJP_TREE_GET_MODIFIEDS_METHOD );
    classes.subloop_new_class( $sym575$WHADJP_TREE, $sym566$ADJP_TREE, $list401, NIL, $list576 );
    classes.class_set_implements_slot_listeners( $sym575$WHADJP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym575$WHADJP_TREE, $sym577$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym575$WHADJP_TREE, $sym578$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_INSTANCE );
    subloop_reserved_initialize_whadjp_tree_class( $sym575$WHADJP_TREE );
    methods.methods_incorporate_instance_method( $sym121$LEXIFY_INT, $sym575$WHADJP_TREE, $list216, $list119, $list579 );
    methods.subloop_register_instance_method( $sym575$WHADJP_TREE, $sym121$LEXIFY_INT, $sym580$WHADJP_TREE_LEXIFY_INT_METHOD );
    classes.subloop_new_class( $sym581$ADVP_TREE, $sym184$PHRASE_TREE, $list582, NIL, $list395 );
    classes.class_set_implements_slot_listeners( $sym581$ADVP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym581$ADVP_TREE, $sym583$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym581$ADVP_TREE, $sym584$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_INSTANCE );
    subloop_reserved_initialize_advp_tree_class( $sym581$ADVP_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym581$ADVP_TREE, $list26, NIL, $list585 );
    methods.subloop_register_instance_method( $sym581$ADVP_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym587$ADVP_TREE_GET_HEAD_DAUGHTERS_METHOD );
    classes.subloop_new_class( $sym588$WHADVP_TREE, $sym581$ADVP_TREE, $list401, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym588$WHADVP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym588$WHADVP_TREE, $sym589$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym588$WHADVP_TREE, $sym590$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_INSTANCE );
    subloop_reserved_initialize_whadvp_tree_class( $sym588$WHADVP_TREE );
    classes.subloop_new_class( $sym591$FRAG_TREE, $sym184$PHRASE_TREE, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym591$FRAG_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym591$FRAG_TREE, $sym592$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym591$FRAG_TREE, $sym593$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_INSTANCE );
    subloop_reserved_initialize_frag_tree_class( $sym591$FRAG_TREE );
    classes.subloop_new_class( $sym594$QP_TREE, $sym184$PHRASE_TREE, $list595, NIL, $list596 );
    classes.class_set_implements_slot_listeners( $sym594$QP_TREE, NIL );
    classes.subloop_note_class_initialization_function( $sym594$QP_TREE, $sym597$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym594$QP_TREE, $sym598$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_INSTANCE );
    subloop_reserved_initialize_qp_tree_class( $sym594$QP_TREE );
    methods.methods_incorporate_instance_method( $sym189$GET_HEAD_DAUGHTERS, $sym594$QP_TREE, $list26, NIL, $list599 );
    methods.subloop_register_instance_method( $sym594$QP_TREE, $sym189$GET_HEAD_DAUGHTERS, $sym601$QP_TREE_GET_HEAD_DAUGHTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym602$GET_QUANTIFIED, $sym594$QP_TREE, $list26, NIL, $list603 );
    methods.subloop_register_instance_method( $sym594$QP_TREE, $sym602$GET_QUANTIFIED, $sym605$QP_TREE_GET_QUANTIFIED_METHOD );
    methods.methods_incorporate_instance_method( $sym126$CYCLIFY_INT, $sym594$QP_TREE, $list123, NIL, $list606 );
    methods.subloop_register_instance_method( $sym594$QP_TREE, $sym126$CYCLIFY_INT, $sym611$QP_TREE_CYCLIFY_INT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parse_tree_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parse_tree_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parse_tree_file();
  }
  static
  {
    me = new parse_tree();
    $phrase_tree_allow_adjacent_daughters_to_merge$ = null;
    $category_to_phrase$ = null;
    $sym0$NOMINAL_TREE = makeSymbol( "NOMINAL-TREE" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-GENDER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PERSON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "SINGULAR-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PLURAL-P" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym2$VERBAL_TREE = makeSymbol( "VERBAL-TREE" );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "GET-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDIRECT-OBJECT" ), NIL, makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL,
          makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FINITE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "GET-LOCAL-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NONLOCAL-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                  makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INVERTED-P" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym4$ADVERBIAL_TREE = makeSymbol( "ADVERBIAL-TREE" );
    $sym5$PREPOSITIONAL_TREE = makeSymbol( "PREPOSITIONAL-TREE" );
    $sym6$PARTICLE_TREE = makeSymbol( "PARTICLE-TREE" );
    $sym7$ADJECTIVAL_TREE = makeSymbol( "ADJECTIVAL-TREE" );
    $sym8$QUESTION_TREE = makeSymbol( "QUESTION-TREE" );
    $sym9$WH_TREE = makeSymbol( "WH-TREE" );
    $sym10$NUMERICAL_TREE = makeSymbol( "NUMERICAL-TREE" );
    $sym11$FINITE_VERBAL_WORD_TREE = makeSymbol( "FINITE-VERBAL-WORD-TREE" );
    $sym12$QUANTIFIER_TREE = makeSymbol( "QUANTIFIER-TREE" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIED" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym14$PRONOUN_TREE = makeSymbol( "PRONOUN-TREE" );
    $sym15$PARSE_TREE = makeSymbol( "PARSE-TREE" );
    $sym16$OBJECT = makeSymbol( "OBJECT" );
    $list17 = ConsesLow.list( makeSymbol( "CYCLIFIABLE" ), makeSymbol( "PARSE-TREE-INTERFACE" ) );
    $list18 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "STRING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CATEGORY" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MOTHER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IDX" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MODIFIERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTEXT" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEEP-COPY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "GET-ROOT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STRING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CATEGORY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDEX" ), NIL, makeKeyword(
                            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PATH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                "GET-MOTHER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SISTER" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword(
                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "YIELD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                        makeSymbol( "GET-PARSE-EXPRESSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEADS" ), NIL, makeKeyword(
                                            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                    "GET-SEMANTIC-HEAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword(
                                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIEDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "GET-CONTEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TEMPORAL-TREE-P" ), NIL, makeKeyword(
                                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFIABLE-QUESTION-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                                                                        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ROOT-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOGICAL-FORM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY" ), ConsesLow.list( makeSymbol( "PROPERTIES" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                                                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CYCLIFIER" ), ConsesLow.list(
                                                                                        makeSymbol( "PROPERTIES" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "COVERS" ), ConsesLow.list( makeSymbol( "LIST-OF-STRINGS" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MINIMALLY-COVERING-SUBTREES" ), ConsesLow.list( makeSymbol( "LIST-OF-STRINGS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-INT" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "COVERS-MINIMALLY" ), ConsesLow.list( makeSymbol( "LIST-OF-STRINGS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword(
                  "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANCESTORS" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym19$CONTEXT = makeSymbol( "CONTEXT" );
    $sym20$MODIFIERS = makeSymbol( "MODIFIERS" );
    $sym21$IDX = makeSymbol( "IDX" );
    $sym22$MOTHER = makeSymbol( "MOTHER" );
    $sym23$CATEGORY = makeSymbol( "CATEGORY" );
    $sym24$STRING = makeSymbol( "STRING" );
    $sym25$GET_CYCLIFIER = makeSymbol( "GET-CYCLIFIER" );
    $list26 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list27 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "PROPERTIES" ) );
    $list28 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "LEXICON" ), ConsesLow.list(
        makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFIER-LEXICON" ) ) ) ), ConsesLow.list( makeSymbol( "SCORE-FUNCTION" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "CYCLIFICATION-SCORE" ) ) ), ConsesLow.list( makeSymbol( "OUTPUT" ), makeKeyword( "BRIEF" ) ), ConsesLow.list( makeSymbol( "WFF-CHECK?" ), T ), makeSymbol( "CONTEXT" ), ConsesLow.list( makeSymbol(
                "DISAMBIGUATOR" ), NIL ), ConsesLow.list( makeSymbol( "COREFERENCE-RESOLVER" ), NIL ), ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "THROW" ) ), ConsesLow.list( makeSymbol(
                    "SUBCYCLIFIER-POOL" ), ConsesLow.list( makeSymbol( "NEW-CYCLIFIER-POOL" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "DATE-CYCLIFIER" ) ) ) ) ) ), makeSymbol( "&ALLOW-OTHER-KEYS" )
        } ), makeSymbol( "PROPERTIES" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol( "CYCLIFIER-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol(
            "SCORE-FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OUTPUT" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ),
                makeSymbol( "CONTEXT" ), makeSymbol( "PARSE-TREE-CONTEXT-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "WFF-CHECK?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "MUST" ),
                    ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword(
                        "IGNORE" ) ) ) ), makeString( "Invalid error-handling tag ~a" ), makeSymbol( "ERROR-HANDLING" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "SUBCYCLIFIER-POOL" ),
                            makeSymbol( "CYCLIFIER-POOL-P" ) ), ConsesLow.list( new SubLObject[]
                            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "CYCLIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SCORE-FUNCTION" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SCORE-FUNCTION" ) ), ConsesLow.list( makeSymbol(
                                    "SET-CYCLIFIER-OUTPUT" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "OUTPUT" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-ERROR-HANDLING" ), makeSymbol( "CYCLIFIER" ), makeSymbol(
                                        "ERROR-HANDLING" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SUBCYCLIFIER-POOL" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SUBCYCLIFIER-POOL" ) ), ConsesLow.list( makeSymbol(
                                            "PWHEN" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol(
                                                "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DISAMBIGUATOR" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ),
                                                    makeSymbol( "CONTEXT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTEXT" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE-CONTEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DISAMBIGUATOR" ), ConsesLow.list( makeSymbol(
                                                            "QUOTE" ), makeSymbol( "DISAMBIGUATE" ) ), makeSymbol( "SELF" ), makeSymbol( "CONTEXT" ) ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol(
                                                                "COREFERENCE-RESOLVER" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-TREE" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SELF" ) ), ConsesLow.list(
                                                                    makeSymbol( "SET-CYCLIFIER-WFF-CHECK?" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "WFF-CHECK?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                                        "WFF-CHECK?" ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-MEMOIZATION-STATE" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol(
                                                                            "NEW-MEMOIZATION-STATE" ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SBHL-RESOURCE" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list(
                                                                                makeSymbol( "NEW-SBHL-MARKING-SPACE-RESOURCE" ), TEN_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLIFIER" ) )
        } )
    } ) );
    $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $kw30$LEXICON = makeKeyword( "LEXICON" );
    $sym31$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $kw32$SCORE_FUNCTION = makeKeyword( "SCORE-FUNCTION" );
    $sym33$CYCLIFICATION_SCORE = makeSymbol( "CYCLIFICATION-SCORE" );
    $kw34$OUTPUT = makeKeyword( "OUTPUT" );
    $kw35$BRIEF = makeKeyword( "BRIEF" );
    $kw36$WFF_CHECK_ = makeKeyword( "WFF-CHECK?" );
    $kw37$CONTEXT = makeKeyword( "CONTEXT" );
    $kw38$DISAMBIGUATOR = makeKeyword( "DISAMBIGUATOR" );
    $kw39$COREFERENCE_RESOLVER = makeKeyword( "COREFERENCE-RESOLVER" );
    $kw40$ERROR_HANDLING = makeKeyword( "ERROR-HANDLING" );
    $kw41$THROW = makeKeyword( "THROW" );
    $kw42$SUBCYCLIFIER_POOL = makeKeyword( "SUBCYCLIFIER-POOL" );
    $sym43$DATE_CYCLIFIER = makeSymbol( "DATE-CYCLIFIER" );
    $sym44$CYCLIFIER_LEXICON_P = makeSymbol( "CYCLIFIER-LEXICON-P" );
    $sym45$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym46$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym47$PARSE_TREE_CONTEXT_P = makeSymbol( "PARSE-TREE-CONTEXT-P" );
    $sym48$BOOLEANP = makeSymbol( "BOOLEANP" );
    $list49 = ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword( "IGNORE" ) );
    $str50$Invalid_error_handling_tag__a = makeString( "Invalid error-handling tag ~a" );
    $sym51$CYCLIFIER_POOL_P = makeSymbol( "CYCLIFIER-POOL-P" );
    $sym52$CYCLIFIER = makeSymbol( "CYCLIFIER" );
    $sym53$LEXIFY = makeSymbol( "LEXIFY" );
    $sym54$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $sym55$DISAMBIGUATE = makeSymbol( "DISAMBIGUATE" );
    $sym56$PARSE_TREE_GET_CYCLIFIER_METHOD = makeSymbol( "PARSE-TREE-GET-CYCLIFIER-METHOD" );
    $sym57$CYCLIFY = makeSymbol( "CYCLIFY" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CYCLIFIER" ) ), makeSymbol( "PROPERTIES" ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "CYCLIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HAS-NEXT?" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ), makeSymbol( "CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "CYCLS" ) ) ) ) );
    $sym59$HAS_NEXT_ = makeSymbol( "HAS-NEXT?" );
    $sym60$NEXT = makeSymbol( "NEXT" );
    $sym61$PARSE_TREE_CYCLIFY_METHOD = makeSymbol( "PARSE-TREE-CYCLIFY-METHOD" );
    $sym62$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym63$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CLASS" );
    $sym64$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym65$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym66$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-INSTANCE" );
    $sym67$DEEP_COPY = makeSymbol( "DEEP-COPY" );
    $list68 = ConsesLow.list( makeString( "@return parse-tree-p; a deep copy of this parse tree.\n   @owner bertolo." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "CLASS-OF-SELF" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "NEW" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), makeSymbol(
            "CLASS-OF-SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "ALL-INSTANCE-SLOTS" ), ConsesLow.list( makeSymbol( "INSTANCES-ALL-INSTANCE-SLOTS" ),
                makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INSTANCE-SLOT" ), makeSymbol( "ALL-INSTANCE-SLOTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                    .list( ConsesLow.list( makeSymbol( "SLOT-VALUE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "INSTANCE-SLOT" ) ) ), ConsesLow.list( makeSymbol( "VALUE-COPY" ),
                        NIL ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-P" ), makeSymbol( "SLOT-VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "VALUE-COPY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SLOT-VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEEP-COPY" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                makeSymbol( "LISTP" ), makeSymbol( "SLOT-VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALUE-COPY" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol(
                                    "SLOT-VALUE" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "VECTORP" ), makeSymbol( "SLOT-VALUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALUE-COPY" ),
                                        ConsesLow.list( makeSymbol( "COPY-VECTOR" ), makeSymbol( "SLOT-VALUE" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "HASH-TABLE-P" ), makeSymbol( "SLOT-VALUE" ) ), ConsesLow
                                            .list( makeSymbol( "CSETQ" ), makeSymbol( "VALUE-COPY" ), ConsesLow.list( makeSymbol( "COPY-HASHTABLE" ), makeSymbol( "SLOT-VALUE" ) ) ) ), ConsesLow.list( T, ConsesLow.list(
                                                makeSymbol( "CSETQ" ), makeSymbol( "VALUE-COPY" ), makeSymbol( "SLOT-VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW" ), makeSymbol(
                                                    "INSTANCE-SLOT" ), makeSymbol( "VALUE-COPY" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW" ) ) ) );
    $sym69$NEW = makeSymbol( "NEW" );
    $sym70$PARSE_TREE_DEEP_COPY_METHOD = makeSymbol( "PARSE-TREE-DEEP-COPY-METHOD" );
    $sym71$GET_ROOT = makeSymbol( "GET-ROOT" );
    $list72 = ConsesLow.list( makeString( "@return phrase-tree-p; the root of this tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "UNTIL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ROOT-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TREE" ) ) ) );
    $sym73$ROOT_P = makeSymbol( "ROOT-P" );
    $sym74$GET_MOTHER = makeSymbol( "GET-MOTHER" );
    $sym75$PARSE_TREE_GET_ROOT_METHOD = makeSymbol( "PARSE-TREE-GET-ROOT-METHOD" );
    $sym76$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $list77 = ConsesLow.list( makeString( "@return keywordp; the category of this parse-tree" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CATEGORY" ) ) );
    $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym79$PARSE_TREE_GET_CATEGORY_METHOD = makeSymbol( "PARSE-TREE-GET-CATEGORY-METHOD" );
    $sym80$GET_INDEX = makeSymbol( "GET-INDEX" );
    $list81 = ConsesLow.list( makeString( "@return non-negative-integer-p; the number of sisters left to this parse tree" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "IDX" ) ) );
    $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym83$PARSE_TREE_GET_INDEX_METHOD = makeSymbol( "PARSE-TREE-GET-INDEX-METHOD" );
    $sym84$GET_PATH = makeSymbol( "GET-PATH" );
    $list85 = ConsesLow.list( makeString( "@return listp; the path from the root to this parse tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PATH" ), ConsesLow.list(
        makeSymbol( "FWHEN" ), makeSymbol( "IDX" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list(
            makeSymbol( "BUTLAST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDEX" ) ) ), makeSymbol( "PATH" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    makeSymbol( "PATH" ) ) ) );
    $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym87$GET_ANCESTORS = makeSymbol( "GET-ANCESTORS" );
    $sym88$PARSE_TREE_GET_PATH_METHOD = makeSymbol( "PARSE-TREE-GET-PATH-METHOD" );
    $list89 = ConsesLow.list( makeString( "@return parse-tree-p; the mother of this tree" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MOTHER" ) ) );
    $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym91$PARSE_TREE_GET_MOTHER_METHOD = makeSymbol( "PARSE-TREE-GET-MOTHER-METHOD" );
    $sym92$GET_SEMANTIC_HEAD = makeSymbol( "GET-SEMANTIC-HEAD" );
    $list93 = ConsesLow.list( makeString( "@return word-tree-p; the (first) semantic head of this phrase\n   @note currently wasteful, since all heads are computed, then discarded" ), ConsesLow.list( makeSymbol( "RET" ),
        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ) ) );
    $sym94$GET_SEMANTIC_HEADS = makeSymbol( "GET-SEMANTIC-HEADS" );
    $sym95$PARSE_TREE_GET_SEMANTIC_HEAD_METHOD = makeSymbol( "PARSE-TREE-GET-SEMANTIC-HEAD-METHOD" );
    $sym96$GET_COMPLEMENTS = makeSymbol( "GET-COMPLEMENTS" );
    $list97 = ConsesLow.list( makeString( "@return listp; a list of all complements of this tree, in surface order" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) ) ) );
    $sym98$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym99$PARSE_TREE_GET_COMPLEMENTS_METHOD = makeSymbol( "PARSE-TREE-GET-COMPLEMENTS-METHOD" );
    $sym100$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $list101 = ConsesLow.list( makeString( "@return listp; a list of modifiers of this tree" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym102$PARSE_TREE_GET_MODIFIERS_METHOD = makeSymbol( "PARSE-TREE-GET-MODIFIERS-METHOD" );
    $sym103$GET_MODIFIEDS = makeSymbol( "GET-MODIFIEDS" );
    $list104 = ConsesLow.list( makeString( "@return listp; the constituents this tree modifies" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym105$PARSE_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "PARSE-TREE-GET-MODIFIEDS-METHOD" );
    $sym106$GET_CONTEXT = makeSymbol( "GET-CONTEXT" );
    $list107 = ConsesLow.list( makeString( "@return parse-tree-context-p; other parse trees created in this tree's context" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONTEXT" ) ) );
    $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym109$PARSE_TREE_GET_CONTEXT_METHOD = makeSymbol( "PARSE-TREE-GET-CONTEXT-METHOD" );
    $sym110$TEMPORAL_TREE_P = makeSymbol( "TEMPORAL-TREE-P" );
    $list111 = ConsesLow.list( makeString( "@return booleanp; t if this tree is temporal, nil otherwise\n   @note this is just a fallback; specific trees override this" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym112$PARSE_TREE_TEMPORAL_TREE_P_METHOD = makeSymbol( "PARSE-TREE-TEMPORAL-TREE-P-METHOD" );
    $sym113$CYCLIFIABLE_QUESTION_P = makeSymbol( "CYCLIFIABLE-QUESTION-P" );
    $list114 = ConsesLow.list( makeString( "@return boolean; t if this is a question, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUESTION-TREE-P" ), makeSymbol( "SELF" ) ) ) );
    $sym115$PARSE_TREE_CYCLIFIABLE_QUESTION_P_METHOD = makeSymbol( "PARSE-TREE-CYCLIFIABLE-QUESTION-P-METHOD" );
    $list116 = ConsesLow.list( makeString( "@return booleanp; t if this tree is the root, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "MOTHER" ) ) ) );
    $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym118$PARSE_TREE_ROOT_P_METHOD = makeSymbol( "PARSE-TREE-ROOT-P-METHOD" );
    $list119 = ConsesLow.list( makeSymbol( "LEXICON" ) );
    $list120 = ConsesLow.list( makeString( "@return parse-tree-p; this parse-tree with lexical entries added" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "*ALLOW-DUPLICATE-CYCLIFICATIONS?*" ), T ), ConsesLow.list( makeSymbol( "*CYCLIFICATION-COMPLETE*" ), NIL ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "LEXIFY-INT" ) ), makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym121$LEXIFY_INT = makeSymbol( "LEXIFY-INT" );
    $sym122$PARSE_TREE_LEXIFY_METHOD = makeSymbol( "PARSE-TREE-LEXIFY-METHOD" );
    $list123 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list124 = ConsesLow.list( makeString( "@return parse-tree-p; this parse-tree with lexical entries added" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "SELF" ) ) );
    $sym125$PARSE_TREE_LEXIFY_INT_METHOD = makeSymbol( "PARSE-TREE-LEXIFY-INT-METHOD" );
    $sym126$CYCLIFY_INT = makeSymbol( "CYCLIFY-INT" );
    $list127 = ConsesLow.list( makeString( "@return listp; the CycL representation of the meaning of this parse-tree" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym128$PARSE_TREE_CYCLIFY_INT_METHOD = makeSymbol( "PARSE-TREE-CYCLIFY-INT-METHOD" );
    $list129 = ConsesLow.list( makeString( "@return listp; the list of ancestors of this parse tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list(
        makeSymbol( "CONS" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTORS" ) ) ) ) ) ) );
    $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym131$PARSE_TREE_GET_ANCESTORS_METHOD = makeSymbol( "PARSE-TREE-GET-ANCESTORS-METHOD" );
    $sym132$GET_SISTER = makeSymbol( "GET-SISTER" );
    $list133 = ConsesLow.list( makeSymbol( "INDEX" ) );
    $list134 = ConsesLow.list( makeString(
        "@return parse-tree-p; the sister INDEX positions to the right of this\n   parse tree if INDEX is positive and to the left if INDEX is negative;\n   nil if there is no such sister" ), ConsesLow.list( makeSymbol(
            "CHECK-TYPE" ), makeSymbol( "INDEX" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "IDX" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "SISTER-INDEX" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "IDX" ), makeSymbol( "INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list(
                    makeSymbol( "CAND" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ), makeSymbol( "SISTER-INDEX" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "IDX" ), makeSymbol( "INDEX" ) ) ) ) ) ) ) );
    $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-METHOD" );
    $sym136$INTEGERP = makeSymbol( "INTEGERP" );
    $sym137$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym138$PARSE_TREE_GET_SISTER_METHOD = makeSymbol( "PARSE-TREE-GET-SISTER-METHOD" );
    $sym139$PRINT = makeSymbol( "PRINT" );
    $list140 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list141 = ConsesLow.list( makeString( "Pretty-prints this phrase-tree to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( "PPRINT-PARSE-TREE" ), makeSymbol( "SELF" ), makeSymbol( "STREAM" ), ZERO_INTEGER ) ) );
    $sym142$PARSE_TREE_PRINT_METHOD = makeSymbol( "PARSE-TREE-PRINT-METHOD" );
    $str143$__W_ = makeString( "#<W(" );
    $str144$_ = makeString( ")" );
    $sym145$GET_RANKED_LEXES = makeSymbol( "GET-RANKED-LEXES" );
    $str146$_ = makeString( "*" );
    $str147$__ = makeString( ": " );
    $sym148$GET_STRING = makeSymbol( "GET-STRING" );
    $str149$_ = makeString( ">" );
    $sym150$RETOKENIZE = makeSymbol( "RETOKENIZE" );
    $list151 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUB-TREE" ), makeSymbol( "PARSE-TREE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE?" ), ConsesLow.list( makeSymbol( "CATEGORIES" ), makeKeyword( "ALL" ) ),
        ConsesLow.list( makeSymbol( "ORDER" ), makeKeyword( "DFR2L" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw152$ALL = makeKeyword( "ALL" );
    $kw153$DFR2L = makeKeyword( "DFR2L" );
    $sym154$STACK = makeUninternedSymbol( "STACK" );
    $sym155$ORDER_VAR = makeUninternedSymbol( "ORDER-VAR" );
    $sym156$POSSIBLE_ORDERS = makeUninternedSymbol( "POSSIBLE-ORDERS" );
    $sym157$CLET = makeSymbol( "CLET" );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) );
    $list159 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "DFL2R" ), makeKeyword( "DFR2L" ) ) );
    $sym160$MUST = makeSymbol( "MUST" );
    $sym161$MEMBER_ = makeSymbol( "MEMBER?" );
    $list162 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) );
    $str163$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $sym164$STACK_PUSH = makeSymbol( "STACK-PUSH" );
    $sym165$UNTIL = makeSymbol( "UNTIL" );
    $sym166$COR = makeSymbol( "COR" );
    $sym167$STACK_EMPTY_P = makeSymbol( "STACK-EMPTY-P" );
    $sym168$CSETQ = makeSymbol( "CSETQ" );
    $sym169$STACK_POP = makeSymbol( "STACK-POP" );
    $sym170$PWHEN = makeSymbol( "PWHEN" );
    $sym171$PHRASE_TREE_P = makeSymbol( "PHRASE-TREE-P" );
    $sym172$DO_VECTOR = makeSymbol( "DO-VECTOR" );
    $sym173$DAUGHTER = makeSymbol( "DAUGHTER" );
    $sym174$GET_PHRASE_TREE_DAUGHTERS = makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" );
    $kw175$BACKWARD_ = makeKeyword( "BACKWARD?" );
    $list176 = ConsesLow.list( makeKeyword( "DFL2R" ) );
    $sym177$CATEGORIES_VAR = makeUninternedSymbol( "CATEGORIES-VAR" );
    $sym178$DO_PARSE_TREE_SUBTREES = makeSymbol( "DO-PARSE-TREE-SUBTREES" );
    $list179 = ConsesLow.list( makeKeyword( "ALL" ) );
    $sym180$FIM = makeSymbol( "FIM" );
    $list181 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) );
    $list182 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-TREE" ), makeSymbol( "PARSE-TREE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE?" ), ConsesLow.list( makeSymbol( "CATEGORIES" ), makeKeyword(
        "ALL" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym183$WORD_TREE_P = makeSymbol( "WORD-TREE-P" );
    $sym184$PHRASE_TREE = makeSymbol( "PHRASE-TREE" );
    $list185 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DAUGHTERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-STRING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DAUGHTER" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DESCENDANT" ), ConsesLow.list( makeSymbol( "PATH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SEARCH" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REFS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DAUGHTER-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "YIELD" ), NIL,
                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARSE-EXPRESSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTER" ), NIL,
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEAD-DAUGHTERS" ),
                                        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEAD-DAUGHTER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-HEADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                "GET-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MODIFIERS" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONJUNCTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COORDINATE-PHRASE-P" ), NIL,
          makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-INT" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "RETOKENIZE" ), ConsesLow.list( makeSymbol( "WORDS" ), makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                  makeSymbol( "RETOKENIZE-INT" ), ConsesLow.list( makeSymbol( "WORDS" ), makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "LOGICAL-FORM-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "PREDICATE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                              makeSymbol( "FIND-FIRST" ), ConsesLow.list( makeSymbol( "PREDICATE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-LAST" ),
                                  ConsesLow.list( makeSymbol( "PREDICATE" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym186$DAUGHTERS = makeSymbol( "DAUGHTERS" );
    $sym187$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-CLASS" );
    $sym188$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-INSTANCE" );
    $sym189$GET_HEAD_DAUGHTERS = makeSymbol( "GET-HEAD-DAUGHTERS" );
    $list190 = ConsesLow.list( makeString( "@return listp; the list of head daughers of this phrase" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym191$PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym192$GET_HEAD_DAUGHTER = makeSymbol( "GET-HEAD-DAUGHTER" );
    $list193 = ConsesLow.list( makeString( "@return parse-tree-p; the (first) head daughter of this phrase\n   @note currently wasteful, since all heads are computed, then discarded" ), ConsesLow.list( makeSymbol(
        "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTERS" ) ) ) ) ) );
    $sym194$PHRASE_TREE_GET_HEAD_DAUGHTER_METHOD = makeSymbol( "PHRASE-TREE-GET-HEAD-DAUGHTER-METHOD" );
    $list195 = ConsesLow.list( makeString( "@return word-tree-p; the (first) head of this phrase\n   @note currently wasteful, since all heads are computed, then discarded" ), ConsesLow.list( makeSymbol( "RET" ),
        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEADS" ) ) ) ) ) );
    $sym196$GET_HEADS = makeSymbol( "GET-HEADS" );
    $sym197$PHRASE_TREE_GET_HEAD_METHOD = makeSymbol( "PHRASE-TREE-GET-HEAD-METHOD" );
    $sym198$GET_SEMANTIC_HEAD_DAUGHTERS = makeSymbol( "GET-SEMANTIC-HEAD-DAUGHTERS" );
    $list199 = ConsesLow.list( makeString( "@return listp; the list of head daughers of this phrase" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTERS" ) ) ) ) );
    $sym200$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD = makeSymbol( "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD" );
    $sym201$GET_SEMANTIC_HEAD_DAUGHTER = makeSymbol( "GET-SEMANTIC-HEAD-DAUGHTER" );
    $list202 = ConsesLow.list( makeString( "@return parse-tree-p; the (first) semantic head daughter of this phrase\n   @note currently wasteful, since all heads are computed, then discarded" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD-DAUGHTERS" ) ) ) ) ) );
    $sym203$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTER_METHOD = makeSymbol( "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTER-METHOD" );
    $sym204$GET_REFS = makeSymbol( "GET-REFS" );
    $list205 = ConsesLow.list( makeKeyword( "READ-ONLY" ), makeKeyword( "PUBLIC" ) );
    $list206 = ConsesLow.list( makeString( "@return listp; the unique referents of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADS" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "REFS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
            .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ),
                        ConsesLow.list( makeSymbol( "QUANTIFIER-TREE-P" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( EQL, ConsesLow.list(
                            makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "$" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ),
                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DAUGHTER" ),
                                        makeSymbol( "HEADS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                                            ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow
                                                .list( makeSymbol( "CPUSH" ), makeSymbol( "REF" ), makeSymbol( "REFS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "REFS" ) ) ) );
    $sym207$DAUGHTER_COUNT = makeSymbol( "DAUGHTER-COUNT" );
    $kw208$_ = makeKeyword( "$" );
    $sym209$PHRASE_TREE_GET_REFS_METHOD = makeSymbol( "PHRASE-TREE-GET-REFS-METHOD" );
    $list210 = ConsesLow.list( makeString( "@return listp; the list of all modifiers of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ) ) ) );
    $sym211$PHRASE_TREE_GET_MODIFIERS_METHOD = makeSymbol( "PHRASE-TREE-GET-MODIFIERS-METHOD" );
    $sym212$GET_CONJUNCTION = makeSymbol( "GET-CONJUNCTION" );
    $list213 = ConsesLow.list( makeString( "@return object; the conjunction of this tree if there is one, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIND-FIRST" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COORDINATE-WORD-TREE-P" ) ) ) ) );
    $sym214$COORDINATE_WORD_TREE_P = makeSymbol( "COORDINATE-WORD-TREE-P" );
    $sym215$PHRASE_TREE_GET_CONJUNCTION_METHOD = makeSymbol( "PHRASE-TREE-GET-CONJUNCTION-METHOD" );
    $list216 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PROTECTED" ) );
    $list217 = ConsesLow.list( makeString( "@return phrase-tree-p; this phrase-tree with lexical entries added" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "WORDS" ), makeSymbol(
        "ORIG-SPELLING" ), makeSymbol( "NORMALIZED-SPELLING" ), makeSymbol( "FIRST-WORD1" ), makeSymbol( "FIRST-WORD2" ), makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "DAUGHTERS" ), ConsesLow.list( makeSymbol(
            "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ROOT-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "YIELD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WORDS" ),
                    ConsesLow.list( makeSymbol( "TREE-YIELD-TO-WORDS" ), makeSymbol( "YIELD" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ORIG-SPELLING" ), ConsesLow.list( makeSymbol( "WORD-STRING" ),
                        ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "WORDS" ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "TAGGER-NORMALIZE-INITIAL-CAPITALIZATION" ), ConsesLow.list( makeSymbol(
                            "GET-TAGGER" ) ), makeSymbol( "WORDS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NORMALIZED-SPELLING" ), ConsesLow.list( makeSymbol( "WORD-STRING" ), ConsesLow.list( makeSymbol(
                                "AREF" ), makeSymbol( "WORDS" ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-WORD1" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "YIELD" ) ) ),
              ConsesLow.list( makeSymbol( "SET-PARSE-TREE-STRING" ), makeSymbol( "FIRST-WORD1" ), makeSymbol( "NORMALIZED-SPELLING" ) )
    } ), ConsesLow.list( makeSymbol( "CDOVECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), makeSymbol( "DAUGHTERS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "LEXIFY-INT" ) ), makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "ROOT-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-WORD2" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FIRST-WORD1" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FIRST-WORD2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ),
                    ConsesLow.list( makeSymbol( "SET-PARSE-TREE-STRING" ), makeSymbol( "FIRST-WORD2" ), makeSymbol( "ORIG-SPELLING" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "TOKENS" ), ConsesLow.list( makeSymbol( "SPLIT-STRING" ), ConsesLow.list( makeSymbol( "GET-PARSE-TREE-STRING" ), makeSymbol( "FIRST-WORD2" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-STRING" ),
                            ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "ORIG-SPELLING" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TOKENS" ) ) ) ) ) ), ConsesLow
                                .list( makeSymbol( "SET-PARSE-TREE-STRING" ), makeSymbol( "FIRST-WORD2" ), makeSymbol( "NEW-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PROCESS-MODIFIERS" ), ConsesLow.list( makeSymbol(
                                    "PROCESS-ABS-INDEX" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym218$YIELD = makeSymbol( "YIELD" );
    $sym219$PHRASE_TREE_LEXIFY_INT_METHOD = makeSymbol( "PHRASE-TREE-LEXIFY-INT-METHOD" );
    $list220 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRETERMINAL-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RETOKENIZE-INT" ) ), ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTERS" ) ) ) ), makeSymbol( "LEXICON" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                        makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RETOKENIZE-INT" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ), makeSymbol( "LEXICON" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                "*PHRASE-TREE-ALLOW-ADJACENT-DAUGHTERS-TO-MERGE*" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY" ) ), makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "WORD-LISTS" ), makeSymbol(
                                        "CONSTIT-LISTS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY" ) ),
                                            makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                "QUOTE" ), makeSymbol( "PARTIAL-RETOKENIZE-INT" ) ), makeSymbol( "WORD-LISTS" ), makeSymbol( "CONSTIT-LISTS" ), makeSymbol( "LEXICON" ) ) ) ) ), ConsesLow.list( T,
                                                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym221$PRETERMINAL_P = makeSymbol( "PRETERMINAL-P" );
    $sym222$RETOKENIZE_INT = makeSymbol( "RETOKENIZE-INT" );
    $sym223$GET = makeSymbol( "GET" );
    $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY = makeSymbol( "ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY" );
    $list225 = ConsesLow.list( makeSymbol( "WORD-LISTS" ), makeSymbol( "CONSTIT-LISTS" ) );
    $sym226$PARTIAL_RETOKENIZE_INT = makeSymbol( "PARTIAL-RETOKENIZE-INT" );
    $sym227$PHRASE_TREE_RETOKENIZE_METHOD = makeSymbol( "PHRASE-TREE-RETOKENIZE-METHOD" );
    $list228 = ConsesLow.list( makeSymbol( "WORDS" ), makeSymbol( "LEXICON" ) );
    $list229 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "LEXIFY-WORDS" ) ), makeSymbol( "WORDS" ) ) ), ConsesLow.list( makeSymbol( "NEW-DAUGHTERS" ), ConsesLow.list( makeSymbol( "MAKE-VECTOR" ), ConsesLow.list( makeSymbol( "LENGTH" ),
            makeSymbol( "TOKENS" ) ) ) ), ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TOKEN" ), makeSymbol( "TOKENS" ) ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-DAUGHTER" ), ConsesLow.list( makeSymbol( "NEW-WORD-TREE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TOKEN" ) ), ConsesLow
                    .list( makeSymbol( "SECOND" ), makeSymbol( "TOKEN" ) ), makeSymbol( "SELF" ), makeSymbol( "I" ), NIL, makeSymbol( "CONTEXT" ) ) ) ), ConsesLow.list( makeSymbol( "SET-AREF" ), makeSymbol(
                        "NEW-DAUGHTERS" ), makeSymbol( "I" ), makeSymbol( "NEW-DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( makeSymbol( "SET-PHRASE-TREE-DAUGHTERS" ),
                            makeSymbol( "SELF" ), makeSymbol( "NEW-DAUGHTERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym231$LEXIFY_WORDS = makeSymbol( "LEXIFY-WORDS" );
    $sym232$PHRASE_TREE_RETOKENIZE_INT_METHOD = makeSymbol( "PHRASE-TREE-RETOKENIZE-INT-METHOD" );
    $list233 = ConsesLow.list( makeSymbol( "WORD-LISTS" ), makeSymbol( "DAUGHTER-LISTS" ), makeSymbol( "LEXICON" ) );
    $list234 = ConsesLow.list( makeString(
        "retokenize only WORD-LISTS according to LEXICON.  There may be additional words in PHRASE-TREE\n   that do not get retokenized. Those words will be re-attached to the phrase with no modification." ), ConsesLow
            .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-DAUGHTERS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-MULTIPLE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORDS" ),
                makeSymbol( "WORD-LISTS" ) ), ConsesLow.list( makeSymbol( "DAUGHTERS" ), makeSymbol( "DAUGHTER-LISTS" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "WORDS" ), ConsesLow.list(
                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEXIFY-WORDS" ) ), makeSymbol( "WORDS" ) ) ), ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TOKEN" ), makeSymbol(
                            "TOKENS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-WORD-TREE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TOKEN" ) ), ConsesLow.list( makeSymbol(
                                "SECOND" ), makeSymbol( "TOKEN" ) ), makeSymbol( "SELF" ), makeSymbol( "I" ), NIL, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "CONTEXT" ) ) ) ), makeSymbol( "NEW-DAUGHTERS" ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CPUSH-ALL" ), makeSymbol( "DAUGHTERS" ), makeSymbol(
                                        "NEW-DAUGHTERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REPLACEMENT-DAUGHTERS" ), ConsesLow.list( makeSymbol( "LIST2VECTOR" ),
                                            ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "NEW-DAUGHTERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ), makeSymbol(
                                                "REPLACEMENT-DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym235$PHRASE_TREE_PARTIAL_RETOKENIZE_INT_METHOD = makeSymbol( "PHRASE-TREE-PARTIAL-RETOKENIZE-INT-METHOD" );
    $list236 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-LISTS" ) ), ConsesLow.list( makeSymbol( "DAUGHTER-LISTS" ) ), ConsesLow.list( makeSymbol(
        "ALL-DAUGHTERS" ), ConsesLow.list( makeSymbol( "VECTOR2LIST" ), ConsesLow.list( makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "DAUGHTER-COUNT" ), ConsesLow
            .list( makeSymbol( "LENGTH" ), makeSymbol( "ALL-DAUGHTERS" ) ) ), ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CURRENT-START" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "CURRENT-START" ),
                    makeSymbol( "DAUGHTER-COUNT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUM-DAUGHTERS-USED" ), NIL ), ConsesLow.list( makeSymbol( "START-FOR-ITERATION" ),
                        makeSymbol( "CURRENT-START" ) ) ), ConsesLow.list( makeSymbol( "DO-NUMBERS" ), ConsesLow.list( new SubLObject[]
                        { makeSymbol( "NUM" ), makeKeyword( "START" ), makeSymbol( "DAUGHTER-COUNT" ), makeKeyword( "END" ), makeSymbol( "START-FOR-ITERATION" ), makeKeyword( "DELTA" ), MINUS_ONE_INTEGER, makeKeyword(
                            "DONE" ), makeSymbol( "NUM-DAUGHTERS-USED" )
    } ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DAUGHTERS" ), ConsesLow.list( makeSymbol( "FIRST-N" ), makeSymbol( "NUM" ), makeSymbol( "ALL-DAUGHTERS" ) ) ), ConsesLow.list(
        makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "MAPCAN" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "COPY-LIST" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "PHRASE-TREE-YIELD" ) ), makeSymbol( "DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "RAW-STRING" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "PHRASE-TREE-STRING" ) ), makeSymbol( "YIELD" ) ) ), ConsesLow.list( makeSymbol( "CURRENT-STRING" ), ConsesLow.list( makeSymbol( "BUNGE-ACCORDING-TO-STRING" ), makeSymbol( "RAW-STRING" ), makeSymbol(
                    "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol(
                        "CURRENT-STRING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "YIELD" ), makeSymbol( "WORD-LISTS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIRST-N" ),
                            makeSymbol( "NUM" ), makeSymbol( "ALL-DAUGHTERS" ) ), makeSymbol( "DAUGHTER-LISTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NUM-DAUGHTERS-USED" ), makeSymbol( "NUM" ) ),
                        ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "CURRENT-START" ), makeSymbol( "NUM-DAUGHTERS-USED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "NUM-DAUGHTERS-USED" ),
                            ConsesLow.list( makeSymbol( "CPUSH" ), NIL, makeSymbol( "WORD-LISTS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NTH" ),
                                makeSymbol( "CURRENT-START" ), makeSymbol( "ALL-DAUGHTERS" ) ) ), makeSymbol( "DAUGHTER-LISTS" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "CURRENT-START" ) ) ) ) ), ConsesLow
                                    .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "WORD-LISTS" ) ), ConsesLow.list( makeSymbol( "NREVERSE" ),
                                        makeSymbol( "DAUGHTER-LISTS" ) ) ) ) ) );
    $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym238$COPY_LIST = makeSymbol( "COPY-LIST" );
    $sym239$PHRASE_TREE_YIELD = makeSymbol( "PHRASE-TREE-YIELD" );
    $sym240$PHRASE_TREE_STRING = makeSymbol( "PHRASE-TREE-STRING" );
    $sym241$PHRASE_TREE_ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY_METHOD = makeSymbol( "PHRASE-TREE-ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY-METHOD" );
    $list242 = ConsesLow.list( makeString( "@return listp; the CycL representation of the meaning of this phrase-tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ),
        ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol(
                "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ), makeSymbol( "CYCLS" ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), makeSymbol(
                        "CYCLS" ) ) ) ) ) );
    $sym243$INSTANTIATE_SCOPE = makeSymbol( "INSTANTIATE-SCOPE" );
    $sym244$PHRASE_TREE_CYCLIFY_INT_METHOD = makeSymbol( "PHRASE-TREE-CYCLIFY-INT-METHOD" );
    $list245 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "NP" ), makeSymbol( "NP-TREE" ) ), ConsesLow.cons( makeKeyword( "NPP" ), makeSymbol( "NPP-TREE" ) ), ConsesLow.cons( makeKeyword( "CNP" ),
        makeSymbol( "NOMINAL-PHRASE-TREE" ) ), ConsesLow.cons( makeKeyword( "NX" ), makeSymbol( "NX-TREE" ) ), ConsesLow.cons( makeKeyword( "PNP" ), makeSymbol( "PNP-TREE" ) ), ConsesLow.cons( makeKeyword( "WHNP" ),
            makeSymbol( "WHNP-TREE" ) ), ConsesLow.cons( makeKeyword( "PRT" ), makeSymbol( "PRT-TREE" ) ), ConsesLow.cons( makeKeyword( "QP" ), makeSymbol( "QP-TREE" ) ), ConsesLow.cons( makeKeyword( "SUB" ), makeSymbol(
                "NOMINAL-PHRASE-TREE" ) ), ConsesLow.cons( makeKeyword( "OBJ" ), makeSymbol( "NOMINAL-PHRASE-TREE" ) ), ConsesLow.cons( makeKeyword( "CONJP" ), makeSymbol( "COORDINATE-PHRASE-TREE" ) ), ConsesLow.cons(
                    makeKeyword( "UCP" ), makeSymbol( "UNLIKE-COORDINATE-PHRASE-TREE" ) ), ConsesLow.cons( makeKeyword( "PRT" ), makeSymbol( "PARTICLE-PHRASE-TREE" ) ), ConsesLow.cons( makeKeyword( "VP" ), makeSymbol(
                        "VP-TREE" ) ), ConsesLow.cons( makeKeyword( "VG" ), makeSymbol( "VG-TREE" ) ), ConsesLow.cons( makeKeyword( "S1" ), makeSymbol( "S1-TREE" ) ), ConsesLow.cons( makeKeyword( "S" ), makeSymbol(
                            "S-TREE" ) ), ConsesLow.cons( makeKeyword( "SBAR" ), makeSymbol( "SBAR-TREE" ) ), ConsesLow.cons( makeKeyword( "SBARQ" ), makeSymbol( "SBARQ-TREE" ) ), ConsesLow.cons( makeKeyword( "SQ" ),
                                makeSymbol( "SQ-TREE" ) ), ConsesLow.cons( makeKeyword( "SINV" ), makeSymbol( "SINV-TREE" ) ), ConsesLow.cons( makeKeyword( "PP" ), makeSymbol( "PP-TREE" ) ), ConsesLow.cons( makeKeyword(
                                    "WHPP" ), makeSymbol( "WHPP-TREE" ) ), ConsesLow.cons( makeKeyword( "ADVP" ), makeSymbol( "ADVP-TREE" ) ), ConsesLow.cons( makeKeyword( "WHADVP" ), makeSymbol( "WHADVP-TREE" ) ),
      ConsesLow.cons( makeKeyword( "ADJP" ), makeSymbol( "ADJP-TREE" ) ), ConsesLow.cons( makeKeyword( "WHADJP" ), makeSymbol( "WHADJP-TREE" ) ), ConsesLow.cons( makeKeyword( "FRAG" ), makeSymbol( "FRAG-TREE" ) ),
      ConsesLow.cons( makeKeyword( "X" ), makeSymbol( "PHRASE-TREE" ) )
    } );
    $str246$__P_ = makeString( "#<P(" );
    $str247$__ = makeString( "):" );
    $list248 = ConsesLow.list( makeString( "@return stringp; the string of this phrase-tree" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "STRING" ) ), ConsesLow.list(
        makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "S" ), ConsesLow.list(
            makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), makeSymbol(
                "DAUGHTER-STRING" ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.list( makeSymbol( "DAUGHTER-COUNT" ), makeSymbol(
                    "SELF" ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DAUGHTER-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol(
                        "SELF" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "S" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "S" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CONTRACT-STRING?" ), makeSymbol(
                                "DAUGHTER-STRING" ) ), makeString( "" ), makeString( " " ) ), makeSymbol( "DAUGHTER-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STRING" ), makeSymbol( "S" ) ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STRING" ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STRING" ) ) );
    $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $str250$ = makeString( "" );
    $str251$_ = makeString( " " );
    $sym252$PHRASE_TREE_GET_STRING_METHOD = makeSymbol( "PHRASE-TREE-GET-STRING-METHOD" );
    $list253 = ConsesLow.list( makeString( "@return listp; the list of words of this phrase-tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "YIELD" ), NIL ) ), ConsesLow.list(
        makeSymbol( "DO-PARSE-TREE-SUBTREES" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "WORD-TREE-P" ), makeSymbol(
            "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DAUGHTER" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "YIELD" ) ) ) );
    $kw254$DFL2R = makeKeyword( "DFL2R" );
    $sym255$PHRASE_TREE_YIELD_METHOD = makeSymbol( "PHRASE-TREE-YIELD-METHOD" );
    $sym256$GET_PARSE_EXPRESSION = makeSymbol( "GET-PARSE-EXPRESSION" );
    $list257 = ConsesLow.list( makeString( "@return listp; the parse-expression of this phrase-tree\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EXPRESSION" ),
        ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
            "DO-VECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PARSE-EXPRESSION" ) ) ), makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                    makeSymbol( "NREVERSE" ), makeSymbol( "EXPRESSION" ) ) ) ) );
    $sym258$PHRASE_TREE_GET_PARSE_EXPRESSION_METHOD = makeSymbol( "PHRASE-TREE-GET-PARSE-EXPRESSION-METHOD" );
    $list259 = ConsesLow.list( makeString( "@return parse-tree-p; the heads of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADS" ), NIL ) ), ConsesLow.list(
        makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTERS" ) ) ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol(
                "HEADS" ) ) ) ) );
    $sym260$PHRASE_TREE_GET_HEADS_METHOD = makeSymbol( "PHRASE-TREE-GET-HEADS-METHOD" );
    $list261 = ConsesLow.list( makeString( "@return parse-tree-p; the semantic heads of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEADS" ), NIL ) ), ConsesLow
        .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-SEMANTIC-HEAD-DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                    .list( makeSymbol( "NREVERSE" ), makeSymbol( "HEADS" ) ) ) ) );
    $sym262$PHRASE_TREE_GET_SEMANTIC_HEADS_METHOD = makeSymbol( "PHRASE-TREE-GET-SEMANTIC-HEADS-METHOD" );
    $list263 = ConsesLow.list( makeString( "@param INDEX integerp\n   @return parse-tree-p; the INDEX'th daughter of this parse tree, or nil if it doesn't exist" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol(
        "INDEX" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "INDEX" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol(
            "DAUGHTERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "DAUGHTERS" ), makeSymbol( "INDEX" ) ) ) );
    $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym265$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym266$PHRASE_TREE_GET_DAUGHTER_METHOD = makeSymbol( "PHRASE-TREE-GET-DAUGHTER-METHOD" );
    $sym267$GET_DESCENDANT = makeSymbol( "GET-DESCENDANT" );
    $list268 = ConsesLow.list( makeSymbol( "PATH" ) );
    $list269 = ConsesLow.list( makeString(
        "@param PATH listp; a list of non-negative integers\n   @return parse-tree-p; the parse tree a location PATH, starting from the root\n   of this phrase-tree, or nil if there is no such parse tree" ), ConsesLow
            .list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PATH" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "SELF" ) ),
                makeSymbol( "DTRS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "PATH" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DTRS" ), ConsesLow.list(
                    makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "TREE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "I" ), ConsesLow.list( makeSymbol(
                        "LENGTH" ), makeSymbol( "DTRS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol(
                            "DTRS" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TREE" ) ) ) );
    $sym270$LISTP = makeSymbol( "LISTP" );
    $sym271$PHRASE_TREE_GET_DESCENDANT_METHOD = makeSymbol( "PHRASE-TREE-GET-DESCENDANT-METHOD" );
    $sym272$PARSE_TREE_P = makeSymbol( "PARSE-TREE-P" );
    $sym273$SEARCH = makeSymbol( "SEARCH" );
    $list274 = ConsesLow.list( makeSymbol( "SEARCH-STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "N" ), ONE_INTEGER ) );
    $list275 = ConsesLow.list( makeString(
        "@param STRING stringp; the string to search for \n   @param N positive-integer-p; the desired occurrence\n   @return parse-tree-p; the first tree whose string is equal to STRING" ), ConsesLow.list( makeSymbol(
            "CHECK-TYPE" ), makeSymbol( "SEARCH-STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "N" ), makeSymbol( "POSITIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol(
                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "M" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "DO-PARSE-TREE-WORD-TREES" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SELF" ) ),
                    ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "SEARCH-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "M" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "M" ),
                            makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "WORD" ) ) ) ) ) ) );
    $sym276$STRINGP = makeSymbol( "STRINGP" );
    $sym277$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym278$PHRASE_TREE_SEARCH_METHOD = makeSymbol( "PHRASE-TREE-SEARCH-METHOD" );
    $list279 = ConsesLow.list( makeString( "@return non-negative-integerp; the number of daughters of this parse tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol(
        "DAUGHTERS" ) ) ) );
    $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym281$PHRASE_TREE_DAUGHTER_COUNT_METHOD = makeSymbol( "PHRASE-TREE-DAUGHTER-COUNT-METHOD" );
    $list282 = ConsesLow.list( makeString( "@return booleanp; t if this phrase tree has all words as daughters, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
        makeSymbol( "FIND-IF-NOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WORD-TREE-P" ) ), makeSymbol( "DAUGHTERS" ) ) ) ) );
    $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym284$PHRASE_TREE_PRETERMINAL_P_METHOD = makeSymbol( "PHRASE-TREE-PRETERMINAL-P-METHOD" );
    $sym285$HYDRA_P = makeSymbol( "HYDRA-P" );
    $list286 = ConsesLow.list( makeString( "@return booleanp; t if this phrase tree is multi-headed (a hydra), nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list(
        makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTERS" ) ) ) ), ONE_INTEGER ) ) );
    $sym287$PHRASE_TREE_HYDRA_P_METHOD = makeSymbol( "PHRASE-TREE-HYDRA-P-METHOD" );
    $sym288$FIND = makeSymbol( "FIND" );
    $list289 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $list290 = ConsesLow.list( makeString( "@param PREDICATE symbolp\n   @return listp; a list of all daughters of this phrase-tree which satisfies\n   PREDICATE, from left to right" ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "STOP" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "END" ), makeSymbol( "END" ), ConsesLow.list( makeSymbol( "LENGTH" ),
            makeSymbol( "DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "FOUND" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "START" ), makeSymbol( "STOP" ) ),
                ConsesLow.list( makeSymbol( "WARN" ), makeString( "start(~A) after stop(~A) when finding ~S in ~S~%" ), makeSymbol( "START" ), makeSymbol( "STOP" ), makeSymbol( "PREDICATE" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "I" ), makeSymbol( "START" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( ConsesLow.list(
            makeSymbol( ">=" ), makeSymbol( "I" ), makeSymbol( "STOP" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ),
                makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "PREDICATE" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                    makeSymbol( "DAUGHTER" ), makeSymbol( "FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "FOUND" ) ) ) ) );
    $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $str292$start__A__after_stop__A__when_fin = makeString( "start(~A) after stop(~A) when finding ~S in ~S~%" );
    $sym293$PHRASE_TREE_FIND_METHOD = makeSymbol( "PHRASE-TREE-FIND-METHOD" );
    $sym294$FIND_FIRST = makeSymbol( "FIND-FIRST" );
    $list295 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ) );
    $list296 = ConsesLow.list( makeString( "@param PREDICATE symbolp\n   @return parse-tree-p; the first daughter of this phrase passing PREDICATE, starting\n   at daughter START" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "I" ), makeSymbol( "START" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
            "I" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "I" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol(
                    "PREDICATE" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DAUGHTER" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym298$PHRASE_TREE_FIND_FIRST_METHOD = makeSymbol( "PHRASE-TREE-FIND-FIRST-METHOD" );
    $sym299$FIND_LAST = makeSymbol( "FIND-LAST" );
    $list300 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "END" ) );
    $list301 = ConsesLow.list( makeString( "@param PREDICATE symbolp\n   @return parse-tree-p; the last daughter of this phrase passing PREDICATE, ending\n   at daughter END" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "I" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "END" ), makeSymbol( "END" ),
            ConsesLow.list( makeSymbol( "1-" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "MINUSP" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ), makeSymbol( "I" ) ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "PREDICATE" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DAUGHTER" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym303$PHRASE_TREE_FIND_LAST_METHOD = makeSymbol( "PHRASE-TREE-FIND-LAST-METHOD" );
    $sym304$FIND_ALL = makeSymbol( "FIND-ALL" );
    $list305 = ConsesLow.list( makeString( "@param PREDICATE symbolp\n   @return listp; a list of all daughters of this phrase-tree whose category is\n   CATEGORY, from left to right, recursing down into daughters" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "STOP" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "END" ), makeSymbol( "END" ), ConsesLow.list(
            makeSymbol( "LENGTH" ), makeSymbol( "DAUGHTERS" ) ) ) ), ConsesLow.list( makeSymbol( "FOUND" ), NIL ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "I" ), makeSymbol(
                "START" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "=" ), makeSymbol( "I" ), makeSymbol( "STOP" ) ) ), ConsesLow.list( makeSymbol(
                    "CSETQ" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "GET-DAUGHTER" ), makeSymbol( "SELF" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "FUNCALL" ), makeSymbol( "PREDICATE" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "DAUGHTER" ), makeSymbol( "FOUND" ) ) ), ConsesLow.list( makeSymbol(
                            "PWHEN" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "THE-DESCENDANT" ), ConsesLow.list(
                                makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-ALL" ) ), makeSymbol( "PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                    makeSymbol( "THE-DESCENDANT" ), makeSymbol( "FOUND" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "FOUND" ) ) ) ) );
    $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym307$PHRASE_TREE_FIND_ALL_METHOD = makeSymbol( "PHRASE-TREE-FIND-ALL-METHOD" );
    $sym308$FIND_ALL_SUBTREES_OF_CATEGORIES = makeSymbol( "FIND-ALL-SUBTREES-OF-CATEGORIES" );
    $list309 = ConsesLow.list( makeSymbol( "CATEGORY-LIST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $list310 = ConsesLow.list( makeString( "@param pos-list listp; a list of keyword syntactic categories\n   @return listp; a list of all subtrees of self that have any of the categories in CATEGORY-LIST" ), ConsesLow
        .list( makeSymbol( "IGNORE" ), makeSymbol( "START" ), makeSymbol( "END" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol(
            "DO-PARSE-TREE-SUBTREES" ), ConsesLow.list( makeSymbol( "SUBTREE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CAT" ), makeSymbol( "CATEGORY-LIST" ) ),
                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "GET-PARSE-TREE-CATEGORY" ), makeSymbol( "SUBTREE" ) ), makeSymbol( "CAT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                    makeSymbol( "SUBTREE" ), makeSymbol( "RESULT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym311$PHRASE_TREE_FIND_ALL_SUBTREES_OF_CATEGORIES_METHOD = makeSymbol( "PHRASE-TREE-FIND-ALL-SUBTREES-OF-CATEGORIES-METHOD" );
    $kw312$STRING = makeKeyword( "STRING" );
    $sym313$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $const314$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list315 = ConsesLow.list( makeString( "'s" ), makeString( "," ), makeString( "." ), makeString( "!" ), makeString( "?" ), makeString( ";" ) );
    $sym316$STRING_ = makeSymbol( "STRING=" );
    $sym317$GET_VERBAL_COMPLEMENT = makeSymbol( "GET-VERBAL-COMPLEMENT" );
    $const318$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $list319 = ConsesLow.list( makeString( "who" ), makeString( "where" ), makeString( "when" ), makeString( "how" ) );
    $list320 = ConsesLow.list( makeString( "which" ), makeString( "what" ) );
    $str321$what = makeString( "what" );
    $sym322$NOMINAL_PHRASE_TREE = makeSymbol( "NOMINAL-PHRASE-TREE" );
    $list323 = ConsesLow.list( makeSymbol( "NOMINAL-TREE" ), makeSymbol( "CYCLIFIABLE-NOUN-PHRASE" ) );
    $list324 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DETERMINER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OVERT-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-POSSESSOR" ), NIL,
          makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SPECIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "POSSESSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TEMPORAL-TREE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "NAME-TREE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PERSON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GENDER" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SINGULAR-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PLURAL-P" ), NIL,
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEFINITE-DESCRIPTION-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                  makeSymbol( "GET-EXISTENTIAL-NULL-DETERMINER" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-INT" ), ConsesLow.list( makeSymbol(
                      "LEXICON" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym325$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-CLASS" );
    $sym326$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-INSTANCE" );
    $sym327$GET_DETERMINER = makeSymbol( "GET-DETERMINER" );
    $list328 = ConsesLow.list( makeString( "@return word-tree-p; the determiner of this NP, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DETERMINER" ) ) ) ) ) ) );
    $sym329$NOMINAL_PHRASE_TREE_GET_DETERMINER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-DETERMINER-METHOD" );
    $sym330$GET_OVERT_QUANTIFIER = makeSymbol( "GET-OVERT-QUANTIFIER" );
    $list331 = ConsesLow.list( makeString( "@return word-tree-p; the quantifier of this NP, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OVERT-QUANTIFIER" ) ) ) ) ) ) );
    $sym332$NOMINAL_PHRASE_TREE_GET_OVERT_QUANTIFIER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-OVERT-QUANTIFIER-METHOD" );
    $sym333$GET_QUANTIFIER = makeSymbol( "GET-QUANTIFIER" );
    $list334 = ConsesLow.list( makeString( "@return word-tree-p; the quantifier of this NP, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIER" ) ) ) ) ) ) );
    $sym335$NOMINAL_PHRASE_TREE_GET_QUANTIFIER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-QUANTIFIER-METHOD" );
    $sym336$GET_POSSESSOR = makeSymbol( "GET-POSSESSOR" );
    $list337 = ConsesLow.list( makeString( "@return word-tree-p; the quantifier of this NP, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ) ) ) );
    $sym338$NOMINAL_PHRASE_TREE_GET_POSSESSOR_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-POSSESSOR-METHOD" );
    $sym339$GET_SPECIFIER = makeSymbol( "GET-SPECIFIER" );
    $list340 = ConsesLow.list( makeString( "@return word-tree-p; the quantifier of this NP, or nil if there is none" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SPECIFIER" ) ) ) ) ) ) );
    $sym341$NOMINAL_PHRASE_TREE_GET_SPECIFIER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-SPECIFIER-METHOD" );
    $sym342$POSSESSIVE_P = makeSymbol( "POSSESSIVE-P" );
    $list343 = ConsesLow.list( makeString( "@return boolean; t if this phrase is a possessive, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "POSSESSIVE-WORD-TREE-P" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ConsesLow.list( makeSymbol( "1-" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ) ) ) ) ) );
    $sym344$NOMINAL_PHRASE_TREE_POSSESSIVE_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-POSSESSIVE-P-METHOD" );
    $list345 = ConsesLow.list( makeString( "@return booleanp; t if this tree is temporal, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
            "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEMPORAL-TREE-P" ) ) ) ) ) ) );
    $sym346$NOMINAL_PHRASE_TREE_TEMPORAL_TREE_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-TEMPORAL-TREE-P-METHOD" );
    $sym347$DEFINITE_DESCRIPTION_P = makeSymbol( "DEFINITE-DESCRIPTION-P" );
    $list348 = ConsesLow.list( makeString( "@return booleanp; t if this tree is a definite description, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), makeSymbol( "HEAD" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "DEFINITE-DESCRIPTION-P" ) ) ) ) ) ) );
    $sym349$NOMINAL_PHRASE_TREE_DEFINITE_DESCRIPTION_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-DEFINITE-DESCRIPTION-P-METHOD" );
    $sym350$NAME_TREE_P = makeSymbol( "NAME-TREE-P" );
    $list351 = ConsesLow.list( makeString( "@return booleanp; t if this tree is a name, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "HEAD" ),
            ConsesLow.list( makeSymbol( "NAME-WORD-TREE-P" ), makeSymbol( "HEAD" ) ) ) ) ) );
    $sym352$NOMINAL_PHRASE_TREE_NAME_TREE_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-NAME-TREE-P-METHOD" );
    $sym353$GET_GENDER = makeSymbol( "GET-GENDER" );
    $list354 = ConsesLow.list( makeString( "@return listp; a list of genders of this np with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-GENDER" ) ) ) ) ) ) );
    $sym355$NOMINAL_PHRASE_TREE_GET_GENDER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-GENDER-METHOD" );
    $sym356$GET_NUMBER = makeSymbol( "GET-NUMBER" );
    $list357 = ConsesLow.list( makeString( "@return listp; a list of numbers of this np with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
            makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NUMBER" ) ) ) ) ) ) );
    $sym358$NOMINAL_PHRASE_TREE_GET_NUMBER_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-NUMBER-METHOD" );
    $sym359$GET_PERSON = makeSymbol( "GET-PERSON" );
    $list360 = ConsesLow.list( makeString( "@return numberp; the person of this noun; 1, 2, or 3" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PERSON" ) ) ) ) ) ) );
    $sym361$NOMINAL_PHRASE_TREE_GET_PERSON_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-PERSON-METHOD" );
    $sym362$SINGULAR_P = makeSymbol( "SINGULAR-P" );
    $list363 = ConsesLow.list( makeString( "@return booleanp; t if this tree is singular, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SINGULAR-P" ) ) ) ) ) ) );
    $sym364$NOMINAL_PHRASE_TREE_SINGULAR_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-SINGULAR-P-METHOD" );
    $sym365$PLURAL_P = makeSymbol( "PLURAL-P" );
    $list366 = ConsesLow.list( makeString( "@return booleanp; t if this tree is plural, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLURAL-P" ) ) ) ) ) ) );
    $sym367$NOMINAL_PHRASE_TREE_PLURAL_P_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-PLURAL-P-METHOD" );
    $list368 = ConsesLow.list( makeString(
        "@return parse-tree-p; a version of this np in which multi-word\n   lemmata have been conflated into single words and each word has\n   lexical entries added\n   @side-effects this tree's daughters will be destructively modified" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol( "ABSTRACT-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "CDOVECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list(
            makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY-INT" ) ),
                makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "DEFINITE-DESCRIPTION-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "AUGMENTED-LEXES" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list(
                            makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "RLE" ), ConsesLow
                                    .list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPY" ) ) ) ) ) ), ConsesLow.list(
                                        makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INTRODUCES-TERM?" ), makeSymbol( "LEX" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                            "INSTANCE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                "GET-CONTEXT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INSTANCE" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow
                                                    .list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ) ), ConsesLow.list(
                                                        makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                                                            "CONJOIN" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                .reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "NOUN" ), makeSymbol( "INSTANCE" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                    "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol(
                                                                        "AUGMENTED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                            "LEXES" ) ), makeSymbol( "AUGMENTED-LEXES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym369$ABSTRACT_LEXICON_P = makeSymbol( "ABSTRACT-LEXICON-P" );
    $sym370$COPY = makeSymbol( "COPY" );
    $sym371$GET_INSTANCE = makeSymbol( "GET-INSTANCE" );
    $kw372$SEMTRANS = makeKeyword( "SEMTRANS" );
    $sym373$SET = makeSymbol( "SET" );
    $const374$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw375$NOUN = makeKeyword( "NOUN" );
    $sym376$LEXES = makeSymbol( "LEXES" );
    $sym377$NOMINAL_PHRASE_TREE_LEXIFY_INT_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-LEXIFY-INT-METHOD" );
    $list378 = ConsesLow.list( makeString( "@return listp; a list of all head daughters of this phrase" ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
        makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), TWO_INTEGER ), ConsesLow.list( EQL, ConsesLow.list(
            makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "$" ) ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "CD" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                        ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "DAUGHTER-COUNT" ) ) ), ONE_INTEGER ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "CD" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                    "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COORDINATE-PHRASE-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ) ) ), ConsesLow.list( ConsesLow
                                .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "DAUGHTER-COUNT" ) ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "VBG-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                        makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "DETERMINER-WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
                                                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRETERMINAL-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                                        .list( ConsesLow.list( makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-WORD-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                makeSymbol( "FWHEN" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HEAD-DAUGHTER" ) ) ) ) ) ), ConsesLow.list( T,
                                                                    ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                            "NOMINAL-WORD-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "RET" ),
                                                                                ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HEAD-DAUGHTER" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                                                                    "CSETQ" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                                                        "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-PHRASE-TREE-P" ) ) ) ),
                                                                                    ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol(
                                                                                        "LIST" ), makeSymbol( "HEAD-DAUGHTER" ) ) ) ) ) ) ) ) ) );
    $kw379$CD = makeKeyword( "CD" );
    $sym380$COORDINATE_PHRASE_P = makeSymbol( "COORDINATE-PHRASE-P" );
    $sym381$NOMINAL_TREE_P = makeSymbol( "NOMINAL-TREE-P" );
    $sym382$NOMINAL_WORD_TREE_P = makeSymbol( "NOMINAL-WORD-TREE-P" );
    $sym383$NOMINAL_PHRASE_TREE_P = makeSymbol( "NOMINAL-PHRASE-TREE-P" );
    $sym384$NOMINAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "NOMINAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym385$NP_TREE = makeSymbol( "NP-TREE" );
    $sym386$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-CLASS" );
    $sym387$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-INSTANCE" );
    $sym388$NPP_TREE = makeSymbol( "NPP-TREE" );
    $sym389$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-CLASS" );
    $sym390$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-INSTANCE" );
    $sym391$NX_TREE = makeSymbol( "NX-TREE" );
    $sym392$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-CLASS" );
    $sym393$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-INSTANCE" );
    $sym394$PNP_TREE = makeSymbol( "PNP-TREE" );
    $list395 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym396$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-CLASS" );
    $sym397$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-INSTANCE" );
    $list398 = ConsesLow.list( makeString( "@return listp; the head daughters of this pnp tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ) ) ) );
    $sym399$PNP_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "PNP-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym400$WHNP_TREE = makeSymbol( "WHNP-TREE" );
    $list401 = ConsesLow.list( makeSymbol( "WH-TREE" ) );
    $sym402$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-CLASS" );
    $sym403$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-INSTANCE" );
    $sym404$VERBAL_PHRASE_TREE = makeSymbol( "VERBAL-PHRASE-TREE" );
    $list405 = ConsesLow.list( makeSymbol( "VERBAL-TREE" ), makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ) );
    $list406 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NUMBER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PERSON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PREDICATE" ), NIL, makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "GET-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ), NIL,
                            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ),
                                    NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COPULA-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "DUMMY-TO-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL,
                                            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FINITE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "VP-COORDINATE-PHRASE-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                        makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                            makeSymbol( "CYCLIFY-INT-VP" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                makeSymbol( "CYCLIFY-INT-VP-COORDINATION" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                        makeSymbol( "INVERTED-P" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym407$CYCLIFY_INT_VP_COORDINATION = makeSymbol( "CYCLIFY-INT-VP-COORDINATION" );
    $list408 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list(
                makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONJUNCTION" ) ) ) ), ConsesLow.list( makeSymbol(
                        "VPS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ),
                            NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "VP" ), makeSymbol( "VPS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ),
                                makeSymbol( "VP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP" ) ) ), makeSymbol( "CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                    "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ),
                                        makeSymbol( "SUBJ-CYCLS" ), makeSymbol( "CYCLS" ) ) ) ) ) ) );
    $sym409$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $sym410$CYCLIFY_INT_VP = makeSymbol( "CYCLIFY-INT-VP" );
    $sym411$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_COORDINATION_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-COORDINATION-METHOD" );
    $list412 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "HEADS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "ALL-CONJUNCTION-CYCLS" ),
                NIL ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list(
                    makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEADS" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "HEADS" ) ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "COMP-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol( "DELETE-CYCLIFIABLE" ), makeSymbol( "SUBJECT" ), makeSymbol( "COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol(
                "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol(
                    "HEADS" ), makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol(
                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-HEAD-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "MOD-CYCLS" ), ConsesLow.list( makeSymbol( "GET-MOD-CYCLS" ), makeSymbol( "HEAD" ) ) ),
                            ConsesLow.list( makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow
                                .list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ) ) ) ),
                        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CONJUNCTION" ), makeSymbol( "RENAMINGS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "ALL-RLE-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPOSITE-VERBAL-CYCLS" ), NIL ) ), ConsesLow.list(
                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "CONJUNCTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                        "RENAMED0" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "HEAD" ), makeSymbol( "RLE" ), makeSymbol( "RENAMING" ) ) ), ConsesLow.list( makeSymbol( "RENAMED" ),
                                            ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "RENAMED0" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "QUANTIFY-IMPLICIT-SUBJECT" ), makeSymbol(
                                                "RENAMED0" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "ALIST-CPUSHNEW" ), makeSymbol( "COMPOSITE-VERBAL-CYCLS" ), ConsesLow.list( makeSymbol( "RENAMING-KEY" ), makeSymbol(
                                                    "RENAMING" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                        "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "RENAMED" ), makeSymbol( "MOD-CYCLS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                            ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "VALUE" ), ConsesLow
                                                                .list( makeSymbol( "ALIST-VALUES" ), makeSymbol( "COMPOSITE-VERBAL-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                                    "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                        "VALUE" ) ) ), makeSymbol( "SENSE-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SENSE-CYCLS" ), makeSymbol(
                                                                            "ALL-RLE-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                "ALL-RLE-CYCLS" ) ), makeSymbol( "ALL-HEAD-CYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ALL-HEAD-CYCLS" ),
                                                                                    makeSymbol( "ALL-CONJUNCTION-CYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ),
                                                                                        makeSymbol( "COMPLEMENTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ),
                                                                                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol(
                                                                                                    "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol( "COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                                                                                                        ConsesLow.list( makeSymbol( "ALL-HEAD-CYCLS" ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                            "ALL-CONJUNCTION-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                "CYCLS0" ), NIL ), ConsesLow.list( makeSymbol( "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ), NIL ) ), ConsesLow.list(
                                                                                                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol(
                                                                                                                        "INDEXED-PRODUCTS" ), makeSymbol( "ALL-HEAD-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                                                                                            ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), NIL ) ),
                                                                                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM2" ), ConsesLow.list(
                                                                                                                                makeSymbol( "CROSS-PRODUCTS" ), makeSymbol( "ITEM" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "CSETQ" ), makeSymbol( "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), ConsesLow.list( makeSymbol(
                                                                                                                                        "APPEND" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                                                                                                                                            "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                "INDEXED-PRODUCTS" ), makeSymbol( "ITEM2" ) ) ), makeSymbol(
                                                                                                                                                    "COMPLETE-CYCL-FOR-ONE-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "CPUSH" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                                                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ),
                                                                                                                                                            ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list(
                                                                                                                                                                makeSymbol( "CONS" ), makeSymbol(
                                                                                                                                                                    "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), makeSymbol(
                                                                                                                                                                        "COMP-CYCLS" ) ) ) ), makeSymbol(
                                                                                                                                                                            "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ) ) ) ),
                                                                                                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS0" ), ConsesLow.list( makeSymbol( "MAPCAR" ),
                                                                                                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                        "INDEXED-PRODUCTS" ), makeSymbol( "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ) ) ) ), ConsesLow.list(
                                                                                                                            makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "APPEND" ),
                                                                                                                                makeSymbol( "CYCLS0" ), makeSymbol( "CYCLS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "RET" ), makeSymbol( "CYCLS" ) ) ) );
    $sym413$GET_SEMANTIC_COMPLEMENTS = makeSymbol( "GET-SEMANTIC-COMPLEMENTS" );
    $sym414$GET_KEYWORD_RENAMINGS = makeSymbol( "GET-KEYWORD-RENAMINGS" );
    $sym415$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-METHOD" );
    $list416 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol(
        "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol(
            "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIABLE-SENTENTIAL-PHRASE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "HEAD-DTR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                    makeSymbol( "HEAD-DTR" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD-DTR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "CYCLIFY-INT" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VP-COORDINATE-PHRASE-P" ) ) ), ConsesLow
                            .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP-COORDINATION" ) ) ) ) ), ConsesLow
                                .list( T, ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                                        makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "VP-CYCLS" ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-VP-CYCLS" ), ConsesLow
                                                .list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJ-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                    makeSymbol( "VP-CYCLS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "VP-CYCLS" ), makeSymbol( "SUBJ-VP-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                        ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ),
                                                            makeSymbol( "SUBJ-VP-CYCLS" ) ) ) ) ) ) ) ) );
    $sym417$VP_COORDINATE_PHRASE_P = makeSymbol( "VP-COORDINATE-PHRASE-P" );
    $sym418$VERBAL_PHRASE_TREE_CYCLIFY_INT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-CYCLIFY-INT-METHOD" );
    $list419 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CONJUNCTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
            makeSymbol( "MEMBER-IF-NOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFIABLE-VERB-PHRASE-P" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) ) ) ) ) );
    $sym420$CYCLIFIABLE_VERB_PHRASE_P = makeSymbol( "CYCLIFIABLE-VERB-PHRASE-P" );
    $sym421$VERBAL_PHRASE_TREE_VP_COORDINATE_PHRASE_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-VP-COORDINATE-PHRASE-P-METHOD" );
    $sym422$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-CLASS" );
    $sym423$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-INSTANCE" );
    $sym424$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $list425 = ConsesLow.list( makeString( "@return word-tree-p; the predicate of this sentence" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD" ) ) ) ) );
    $sym426$VERBAL_PHRASE_TREE_GET_PREDICATE_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-PREDICATE-METHOD" );
    $list427 = ConsesLow.list( makeString( "@return listp; a list of numbers of this vp with possible number values\n   :SINGULAR and :PLURAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
            makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NUMBER" ) ) ) ) ) ) );
    $sym428$VERBAL_PHRASE_TREE_GET_NUMBER_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-NUMBER-METHOD" );
    $list429 = ConsesLow.list( makeString( "@return numberp; the person of this vp; 1, 2, or 3" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PERSON" ) ) ) ) ) ) );
    $sym430$VERBAL_PHRASE_TREE_GET_PERSON_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-PERSON-METHOD" );
    $sym431$GET_TENSE = makeSymbol( "GET-TENSE" );
    $list432 = ConsesLow.list( makeString( "@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
            makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TENSE" ) ) ) ) ) ) );
    $sym433$VERBAL_PHRASE_TREE_GET_TENSE_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-TENSE-METHOD" );
    $list434 = ConsesLow.list( makeString( "@return phrase-tree-p; the subject of this verbal tree" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "IDX" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                "CNOT" ), makeSymbol( "SUBJECT" ) ), ConsesLow.list( makeSymbol( "VERBAL-TREE-P" ), makeSymbol( "MOTHER" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUBJECT" ) ) ) ) );
    $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-PHRASE-TREE-METHOD" );
    $sym436$VERBAL_PHRASE_TREE_GET_SUBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-SUBJECT-METHOD" );
    $sym437$GET_OBJECTS = makeSymbol( "GET-OBJECTS" );
    $list438 = ConsesLow.list( makeString( "@return listp; a list of all objects of this tree, in surface order" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ) ) ) );
    $sym439$VERBAL_PHRASE_TREE_GET_OBJECTS_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-OBJECTS-METHOD" );
    $sym440$GET_DIRECT_OBJECT = makeSymbol( "GET-DIRECT-OBJECT" );
    $list441 = ConsesLow.list( makeString( "@return phrase-tree-p; the direct object of this verb phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DIRECT-OBJECT" ) ) ) ) ) ) );
    $sym442$VERBAL_PHRASE_TREE_GET_DIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-DIRECT-OBJECT-METHOD" );
    $sym443$GET_INDIRECT_OBJECT = makeSymbol( "GET-INDIRECT-OBJECT" );
    $list444 = ConsesLow.list( makeString( "@return phrase-tree-p; the indirect object of this verb phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDIRECT-OBJECT" ) ) ) ) ) ) );
    $sym445$VERBAL_PHRASE_TREE_GET_INDIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-INDIRECT-OBJECT-METHOD" );
    $sym446$GET_SEMANTIC_DIRECT_OBJECT = makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" );
    $list447 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic direct object of this verb phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ) ) ) );
    $sym448$VERBAL_PHRASE_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD" );
    $sym449$GET_SEMANTIC_INDIRECT_OBJECT = makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" );
    $list450 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic indirect object of this verb phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ) ) ) ) ) ) );
    $sym451$VERBAL_PHRASE_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD" );
    $sym452$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $list453 = ConsesLow.list( makeString( "@return phrase-tree-p; the semantic subject of this verbal tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ) ) ) );
    $sym454$VERBAL_PHRASE_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-SEMANTIC-SUBJECT-METHOD" );
    $sym455$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $list456 = ConsesLow.list( makeString( "@return listp; a list of the semantic subject of this verbal tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ) ) ) );
    $sym457$VERBAL_PHRASE_TREE_GET_SEMANTIC_OBJECTS_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-SEMANTIC-OBJECTS-METHOD" );
    $list458 = ConsesLow.list( makeString( "@return listp; a list of all verbal complements of this verbal tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ) ) );
    $sym459$VERBAL_PHRASE_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-VERBAL-COMPLEMENT-METHOD" );
    $sym460$COPULA_P = makeSymbol( "COPULA-P" );
    $list461 = ConsesLow.list( makeString( "@return booleanp; t if this phrase-tree is a copula construction, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            ConsesLow.list( makeSymbol( "AUX-VERB-WORD-P" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPULA-P" ) ) ) ) ) ) );
    $sym462$VERBAL_PHRASE_TREE_COPULA_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-COPULA-P-METHOD" );
    $sym463$DUMMY_TO_P = makeSymbol( "DUMMY-TO-P" );
    $list464 = ConsesLow.list( makeString( "@return booleanp; t if this phrase-tree is a dummy 'to' construction, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
        .list( makeSymbol( "VERBAL-WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( EQUAL, ConsesLow.list(
            makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-STRING" ) ) ), makeString( "to" ) ) ) ) );
    $str465$to = makeString( "to" );
    $sym466$VERBAL_PHRASE_TREE_DUMMY_TO_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-DUMMY-TO-P-METHOD" );
    $sym467$PASSIVE_P = makeSymbol( "PASSIVE-P" );
    $list468 = ConsesLow.list( makeString( "@return booleanp; t if this phrase-tree is a passive construction, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
            makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PASSIVE-P" ) ) ) ) ) ) );
    $sym469$VERBAL_PHRASE_TREE_PASSIVE_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-PASSIVE-P-METHOD" );
    $sym470$FINITE_P = makeSymbol( "FINITE-P" );
    $list471 = ConsesLow.list( makeString( "@return booleanp; t if this phrase tree is finite, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FINITE-VERBAL-WORD-TREE-P" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) );
    $sym472$VERBAL_PHRASE_TREE_FINITE_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-FINITE-P-METHOD" );
    $sym473$PARTITION_SEMANTIC_COMPLEMENTS = makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" );
    $list474 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ) ) ) ) ) ) );
    $sym475$VERBAL_PHRASE_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD" );
    $sym476$GET_ANCESTOR_OBJECTS = makeSymbol( "GET-ANCESTOR-OBJECTS" );
    $list477 = ConsesLow.list( makeString( "@return listp; the local syntactic objects of this tree and its ancestors" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-PHRASE-TREE-P" ), makeSymbol(
            "MOTHER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                .list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-PHRASE-TREE-P" ), makeSymbol( "MOTHER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ) ) ) ) );
    $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-PHRASE-TREE-METHOD" );
    $sym479$INVERTED_P = makeSymbol( "INVERTED-P" );
    $sym480$VERBAL_PHRASE_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-ANCESTOR-OBJECTS-METHOD" );
    $list481 = ConsesLow.list( makeString( "@return listp; the head daughters of this verbal phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD-DAUGHTERS" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBAL-WORD-TREE-P" ) ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "HEAD-DAUGHTERS" ), makeSymbol( "HEAD-DAUGHTERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBAL-PHRASE-TREE-P" ) ) ) ) ) ) );
    $sym482$VERBAL_WORD_TREE_P = makeSymbol( "VERBAL-WORD-TREE-P" );
    $sym483$VERBAL_PHRASE_TREE_P = makeSymbol( "VERBAL-PHRASE-TREE-P" );
    $sym484$VERBAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $list485 = ConsesLow.list( makeString( "@return booleanp; t if this verbal tree is inverted, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ) ) ) ) );
    $sym486$VERBAL_PHRASE_TREE_INVERTED_P_METHOD = makeSymbol( "VERBAL-PHRASE-TREE-INVERTED-P-METHOD" );
    $sym487$SENTENTIAL_TREE = makeSymbol( "SENTENTIAL-TREE" );
    $list488 = ConsesLow.list( makeSymbol( "CYCLIFIABLE-SENTENTIAL-PHRASE" ) );
    $list489 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBJECT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym490$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-CLASS" );
    $sym491$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-INSTANCE" );
    $list492 = ConsesLow.list( makeString( "@return np-tree-p; the subject of this sentence" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "HEAD-MOTHER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD-MOTHER" ), ConsesLow.list( makeSymbol( "RET" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD-MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDEX" ) ) ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "SUBJECT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                        .list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ) ) ) ) ) );
    $sym493$SENTENTIAL_TREE_GET_SUBJECT_METHOD = makeSymbol( "SENTENTIAL-TREE-GET-SUBJECT-METHOD" );
    $list494 = ConsesLow.list( makeString( "@return listp; the constituents this sentence modifies" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "RELATIVE-CLAUSE-P" ), makeSymbol( "SELF" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "FIRST-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "WORD-TREE-P" ), makeSymbol( "FIRST-DAUGHTER" ) ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FIRST-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list(
                    makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "WP-TREE-P" ), makeSymbol( "FIRST-HEAD" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FIRST-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-ANTECEDENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "MOD-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "WORD-TREE-P" ), makeSymbol( "MODIFIED" ) ),
                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                makeSymbol( "FWHEN" ), makeSymbol( "MOD-HEAD" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "MOD-HEAD" ) ) ) ) ) ) );
    $sym495$GET_ANTECEDENT = makeSymbol( "GET-ANTECEDENT" );
    $sym496$SENTENTIAL_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "SENTENTIAL-TREE-GET-MODIFIEDS-METHOD" );
    $sym497$VP_TREE = makeSymbol( "VP-TREE" );
    $sym498$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-CLASS" );
    $sym499$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-INSTANCE" );
    $sym500$VG_TREE = makeSymbol( "VG-TREE" );
    $sym501$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-CLASS" );
    $sym502$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-INSTANCE" );
    $sym503$S1_TREE = makeSymbol( "S1-TREE" );
    $sym504$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-CLASS" );
    $sym505$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-INSTANCE" );
    $sym506$S_TREE = makeSymbol( "S-TREE" );
    $list507 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym508$SUBLOOP_RESERVED_INITIALIZE_S_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-S-TREE-CLASS" );
    $sym509$SUBLOOP_RESERVED_INITIALIZE_S_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-S-TREE-INSTANCE" );
    $list510 = ConsesLow.list( makeString( "@return listp; the local syntactic objects of this tree and its ancestors" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVERTED-P" ) ) ) ), ConsesLow.list( makeSymbol(
                "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJECT" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol(
                    "RELATIVE-CLAUSE-P" ), makeSymbol( "MOTHER" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-MODIFIEDS" ) ) ) ) ) ) ) );
    $sym511$OUTER_CATCH_FOR_S_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-S-TREE-METHOD" );
    $sym512$S_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol( "S-TREE-GET-ANCESTOR-OBJECTS-METHOD" );
    $sym513$SBAR_TREE = makeSymbol( "SBAR-TREE" );
    $sym514$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-CLASS" );
    $sym515$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-INSTANCE" );
    $sym516$SBARQ_TREE = makeSymbol( "SBARQ-TREE" );
    $list517 = ConsesLow.list( makeSymbol( "QUESTION-TREE" ) );
    $list518 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-ANCESTOR-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym519$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-CLASS" );
    $sym520$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-INSTANCE" );
    $list521 = ConsesLow.list( makeString( "@return listp; the head daughters of this sbarq tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBAL-TREE-P" ) ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD-DAUGHTER" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HEAD-DAUGHTER" ) ) ) ) ) );
    $sym522$VERBAL_TREE_P = makeSymbol( "VERBAL-TREE-P" );
    $sym523$SBARQ_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "SBARQ-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $list524 = ConsesLow.list( makeString( "@return listp; the local syntactic objects of this tree and its ancestors" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DELETE" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ) );
    $sym525$SBARQ_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol( "SBARQ-TREE-GET-ANCESTOR-OBJECTS-METHOD" );
    $sym526$SQ_TREE = makeSymbol( "SQ-TREE" );
    $list527 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym528$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-CLASS" );
    $sym529$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-INSTANCE" );
    $list530 = ConsesLow.list( makeString( "@return listp; the local syntactic objects of this tree and its ancestors" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list(
        makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "NOMINAL-TREE-P" ) ) ) ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-PHRASE-TREE-P" ), makeSymbol( "MOTHER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANCESTOR-OBJECTS" ) ) ) ) ) ) );
    $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SQ-TREE-METHOD" );
    $sym532$SQ_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol( "SQ-TREE-GET-ANCESTOR-OBJECTS-METHOD" );
    $sym533$SINV_TREE = makeSymbol( "SINV-TREE" );
    $sym534$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-CLASS" );
    $sym535$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-INSTANCE" );
    $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE" );
    $list537 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-OBLIQUE-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STRANDED-P" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym538$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-CLASS" );
    $sym539$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-INSTANCE" );
    $list540 = ConsesLow.list( makeString( "@return listp; the head daughters of this prepositional-or-particle-phrase-tree" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "VBG-TREE-P" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                .list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "PREPOSITIONAL-TREE-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "PARTICLE-TREE-P" ) ) ) ) ) );
    $sym541$PREPOSITIONAL_TREE_P = makeSymbol( "PREPOSITIONAL-TREE-P" );
    $sym542$PARTICLE_TREE_P = makeSymbol( "PARTICLE-TREE-P" );
    $sym543$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym544$GET_OBLIQUE_OBJECT = makeSymbol( "GET-OBLIQUE-OBJECT" );
    $list545 = ConsesLow.list( makeString( "@return nominal-phrase-tree; the complement np of the prepositional head of this phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ) ) );
    $sym546$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-OBLIQUE-OBJECT-METHOD" );
    $sym547$STRANDED_P = makeSymbol( "STRANDED-P" );
    $list548 = ConsesLow.list( makeString( "@return booleanp; non-nil if the preposition or particle of this phrase is \n   stranded, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "CAND" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), ONE_INTEGER ), ConsesLow.list(
            makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ) );
    $sym549$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_STRANDED_P_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-STRANDED-P-METHOD" );
    $sym550$PREPOSITIONAL_PHRASE_TREE = makeSymbol( "PREPOSITIONAL-PHRASE-TREE" );
    $list551 = ConsesLow.list( makeSymbol( "PREPOSITIONAL-TREE" ) );
    $sym552$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-CLASS" );
    $sym553$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-INSTANCE" );
    $sym554$PP_TREE = makeSymbol( "PP-TREE" );
    $sym555$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-CLASS" );
    $sym556$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-INSTANCE" );
    $sym557$WHPP_TREE = makeSymbol( "WHPP-TREE" );
    $sym558$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-CLASS" );
    $sym559$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-INSTANCE" );
    $sym560$PRT_TREE = makeSymbol( "PRT-TREE" );
    $list561 = ConsesLow.list( makeSymbol( "PARTICLE-TREE" ) );
    $sym562$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-CLASS" );
    $sym563$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-INSTANCE" );
    $list564 = ConsesLow.list( makeString( "@return listp; the head daughters of this prepositional-or-particle-phrase-tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARTICLE-TREE-P" ) ) ) ) );
    $sym565$PRT_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "PRT-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym566$ADJP_TREE = makeSymbol( "ADJP-TREE" );
    $list567 = ConsesLow.list( makeSymbol( "ADJECTIVAL-TREE" ) );
    $sym568$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-CLASS" );
    $sym569$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-INSTANCE" );
    $list570 = ConsesLow.list( makeString( "@return listp; the head daughters of this adjp-tree" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADJECTIVAL-TREE-P" ) ) ) ) );
    $sym571$ADJECTIVAL_TREE_P = makeSymbol( "ADJECTIVAL-TREE-P" );
    $sym572$ADJP_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "ADJP-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $list573 = ConsesLow.list( makeString( "@return listp; the complement of this adjective" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ) );
    $sym574$ADJP_TREE_GET_MODIFIEDS_METHOD = makeSymbol( "ADJP-TREE-GET-MODIFIEDS-METHOD" );
    $sym575$WHADJP_TREE = makeSymbol( "WHADJP-TREE" );
    $list576 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym577$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-CLASS" );
    $sym578$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-INSTANCE" );
    $list579 = ConsesLow.list( makeString(
        "@return parse-tree-p; a version of this np in which multi-word\n   lemmata have been conflated into single words and each word has\n   lexical entries added\n   @side-effects this tree's daughters will be destructively modified" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol( "ABSTRACT-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "CDOVECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), ConsesLow.list(
            makeSymbol( "GET-PHRASE-TREE-DAUGHTERS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY-INT" ) ),
                makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym580$WHADJP_TREE_LEXIFY_INT_METHOD = makeSymbol( "WHADJP-TREE-LEXIFY-INT-METHOD" );
    $sym581$ADVP_TREE = makeSymbol( "ADVP-TREE" );
    $list582 = ConsesLow.list( makeSymbol( "ADVERBIAL-TREE" ) );
    $sym583$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-CLASS" );
    $sym584$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-INSTANCE" );
    $list585 = ConsesLow.list( makeString( "@return listp; a list of head daughters of this adverbial tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD-DTR" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-LAST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADVERBIAL-TREE-P" ) ) ) ) ), ConsesLow
            .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD-DTR" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HEAD-DTR" ) ) ) ) ) );
    $sym586$ADVERBIAL_TREE_P = makeSymbol( "ADVERBIAL-TREE-P" );
    $sym587$ADVP_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "ADVP-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym588$WHADVP_TREE = makeSymbol( "WHADVP-TREE" );
    $sym589$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-CLASS" );
    $sym590$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-INSTANCE" );
    $sym591$FRAG_TREE = makeSymbol( "FRAG-TREE" );
    $sym592$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-CLASS" );
    $sym593$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-INSTANCE" );
    $sym594$QP_TREE = makeSymbol( "QP-TREE" );
    $list595 = ConsesLow.list( makeSymbol( "NUMERICAL-TREE" ), makeSymbol( "QUANTIFIER-TREE" ) );
    $list596 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-HEAD-DAUGHTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-QUANTIFIED" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym597$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-CLASS" );
    $sym598$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-INSTANCE" );
    $list599 = ConsesLow.list( makeString( "@return listp; a list of all head daughters of this phrase" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIND" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "CARDINAL-WORD-TREE-P" ) ) ) ) );
    $sym600$CARDINAL_WORD_TREE_P = makeSymbol( "CARDINAL-WORD-TREE-P" );
    $sym601$QP_TREE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol( "QP-TREE-GET-HEAD-DAUGHTERS-METHOD" );
    $sym602$GET_QUANTIFIED = makeSymbol( "GET-QUANTIFIED" );
    $list603 = ConsesLow.list( makeString( "@return word-tree; the word that restricts the variable that this determiner quantifies" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ),
        makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) );
    $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QP-TREE-METHOD" );
    $sym605$QP_TREE_GET_QUANTIFIED_METHOD = makeSymbol( "QP-TREE-GET-QUANTIFIED-METHOD" );
    $list606 = ConsesLow.list( makeString( "@return listp; the CycL representation of the meaning of this quantifier phrase" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "SCYCLS" ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
            "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol(
                "STRING-TO-INTERVAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "QUANTIFIED" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIED" ) ) ) ), ConsesLow.list( makeSymbol( "RESTRICTIONS" ), ConsesLow.list(
                        makeSymbol( "FWHEN" ), makeSymbol( "QUANTIFIED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ) ) ) ),
                ConsesLow.list( makeSymbol( "VARIABLE" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "QUANTIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "QUANTIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                        ConsesLow.list( makeSymbol( "RESTRICTION" ), makeSymbol( "RESTRICTIONS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-CYCLIFICATION" ), ConsesLow.list( makeSymbol(
                            "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) ), makeSymbol( "NUMBER" ), makeSymbol( "VARIABLE" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ),
                                constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "RESTRICTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "SCOPE" ) ) ) ) ),
                            makeSymbol( "SELF" ), ONE_INTEGER ), makeSymbol( "CYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLS" ) ) ) );
    $sym607$CYCLIFY_NUCLEUS = makeSymbol( "CYCLIFY-NUCLEUS" );
    $const608$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $const609$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list610 = ConsesLow.list( makeKeyword( "SCOPE" ) );
    $sym611$QP_TREE_CYCLIFY_INT_METHOD = makeSymbol( "QP-TREE-CYCLIFY-INT-METHOD" );
  }
}
/*
 * 
 * Total time: 3167 ms synthetic
 */