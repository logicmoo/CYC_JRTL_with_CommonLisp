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

public final class parse_tree extends SubLTranslatedFile
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
    public static SubLObject nominal_tree_p(final SubLObject nominal_tree) {
        return interfaces.subloop_instanceof_interface(nominal_tree, (SubLObject)parse_tree.$sym0$NOMINAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 5885L)
    public static SubLObject verbal_tree_p(final SubLObject verbal_tree) {
        return interfaces.subloop_instanceof_interface(verbal_tree, (SubLObject)parse_tree.$sym2$VERBAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6664L)
    public static SubLObject adverbial_tree_p(final SubLObject adverbial_tree) {
        return interfaces.subloop_instanceof_interface(adverbial_tree, (SubLObject)parse_tree.$sym4$ADVERBIAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6701L)
    public static SubLObject prepositional_tree_p(final SubLObject prepositional_tree) {
        return interfaces.subloop_instanceof_interface(prepositional_tree, (SubLObject)parse_tree.$sym5$PREPOSITIONAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6742L)
    public static SubLObject particle_tree_p(final SubLObject particle_tree) {
        return interfaces.subloop_instanceof_interface(particle_tree, (SubLObject)parse_tree.$sym6$PARTICLE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6778L)
    public static SubLObject adjectival_tree_p(final SubLObject adjectival_tree) {
        return interfaces.subloop_instanceof_interface(adjectival_tree, (SubLObject)parse_tree.$sym7$ADJECTIVAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6816L)
    public static SubLObject question_tree_p(final SubLObject question_tree) {
        return interfaces.subloop_instanceof_interface(question_tree, (SubLObject)parse_tree.$sym8$QUESTION_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6852L)
    public static SubLObject wh_tree_p(final SubLObject wh_tree) {
        return interfaces.subloop_instanceof_interface(wh_tree, (SubLObject)parse_tree.$sym9$WH_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6882L)
    public static SubLObject numerical_tree_p(final SubLObject numerical_tree) {
        return interfaces.subloop_instanceof_interface(numerical_tree, (SubLObject)parse_tree.$sym10$NUMERICAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6919L)
    public static SubLObject finite_verbal_word_tree_p(final SubLObject finite_verbal_word_tree) {
        return interfaces.subloop_instanceof_interface(finite_verbal_word_tree, (SubLObject)parse_tree.$sym11$FINITE_VERBAL_WORD_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 6965L)
    public static SubLObject quantifier_tree_p(final SubLObject quantifier_tree) {
        return interfaces.subloop_instanceof_interface(quantifier_tree, (SubLObject)parse_tree.$sym12$QUANTIFIER_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7053L)
    public static SubLObject pronoun_tree_p(final SubLObject pronoun_tree) {
        return interfaces.subloop_instanceof_interface(pronoun_tree, (SubLObject)parse_tree.$sym14$PRONOUN_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_context(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.SIX_INTEGER, (SubLObject)parse_tree.$sym19$CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_context(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.SIX_INTEGER, (SubLObject)parse_tree.$sym19$CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_modifiers(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.FIVE_INTEGER, (SubLObject)parse_tree.$sym20$MODIFIERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_modifiers(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.FIVE_INTEGER, (SubLObject)parse_tree.$sym20$MODIFIERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_idx(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.FOUR_INTEGER, (SubLObject)parse_tree.$sym21$IDX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_idx(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.FOUR_INTEGER, (SubLObject)parse_tree.$sym21$IDX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_mother(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.THREE_INTEGER, (SubLObject)parse_tree.$sym22$MOTHER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_mother(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.THREE_INTEGER, (SubLObject)parse_tree.$sym22$MOTHER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_category(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.TWO_INTEGER, (SubLObject)parse_tree.$sym23$CATEGORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_category(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.TWO_INTEGER, (SubLObject)parse_tree.$sym23$CATEGORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject get_parse_tree_string(final SubLObject v_parse_tree) {
        return classes.subloop_get_access_protected_instance_slot(v_parse_tree, (SubLObject)parse_tree.ONE_INTEGER, (SubLObject)parse_tree.$sym24$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject set_parse_tree_string(final SubLObject v_parse_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parse_tree, value, (SubLObject)parse_tree.ONE_INTEGER, (SubLObject)parse_tree.$sym24$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject parse_tree_get_cyclifier_method(final SubLObject self, SubLObject v_properties) {
        if (v_properties == parse_tree.UNPROVIDED) {
            v_properties = (SubLObject)parse_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject v_context = get_parse_tree_context(self);
        try {
            thread.throwStack.push(parse_tree.$sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                final SubLObject current;
                final SubLObject datum = current = v_properties;
                final SubLObject lexicon_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw30$LEXICON, current);
                final SubLObject lexicon = (parse_tree.NIL != lexicon_tail) ? conses_high.cadr(lexicon_tail) : object.new_class_instance((SubLObject)parse_tree.$sym31$CYCLIFIER_LEXICON);
                final SubLObject score_function_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw32$SCORE_FUNCTION, current);
                final SubLObject score_function = (SubLObject)((parse_tree.NIL != score_function_tail) ? conses_high.cadr(score_function_tail) : parse_tree.$sym33$CYCLIFICATION_SCORE);
                final SubLObject output_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw34$OUTPUT, current);
                final SubLObject output = (SubLObject)((parse_tree.NIL != output_tail) ? conses_high.cadr(output_tail) : parse_tree.$kw35$BRIEF);
                final SubLObject wff_checkP_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw36$WFF_CHECK_, current);
                final SubLObject wff_checkP = (SubLObject)((parse_tree.NIL != wff_checkP_tail) ? conses_high.cadr(wff_checkP_tail) : parse_tree.T);
                final SubLObject context_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw37$CONTEXT, current);
                SubLObject v_context_$1 = (SubLObject)((parse_tree.NIL != context_tail) ? conses_high.cadr(context_tail) : parse_tree.NIL);
                final SubLObject disambiguator_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw38$DISAMBIGUATOR, current);
                final SubLObject disambiguator = (SubLObject)((parse_tree.NIL != disambiguator_tail) ? conses_high.cadr(disambiguator_tail) : parse_tree.NIL);
                final SubLObject coreference_resolver_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw39$COREFERENCE_RESOLVER, current);
                final SubLObject v_coreference_resolver = (SubLObject)((parse_tree.NIL != coreference_resolver_tail) ? conses_high.cadr(coreference_resolver_tail) : parse_tree.NIL);
                final SubLObject error_handling_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw40$ERROR_HANDLING, current);
                final SubLObject error_handling = (SubLObject)((parse_tree.NIL != error_handling_tail) ? conses_high.cadr(error_handling_tail) : parse_tree.$kw41$THROW);
                final SubLObject subcyclifier_pool_tail = cdestructuring_bind.property_list_member((SubLObject)parse_tree.$kw42$SUBCYCLIFIER_POOL, current);
                final SubLObject subcyclifier_pool = (parse_tree.NIL != subcyclifier_pool_tail) ? conses_high.cadr(subcyclifier_pool_tail) : subcyclifier.new_cyclifier_pool((SubLObject)ConsesLow.list(object.new_class_instance((SubLObject)parse_tree.$sym43$DATE_CYCLIFIER)));
                assert parse_tree.NIL != cyclifier_lexicon.cyclifier_lexicon_p(lexicon) : lexicon;
                assert parse_tree.NIL != Types.function_spec_p(score_function) : score_function;
                assert parse_tree.NIL != Types.keywordp(output) : output;
                if (parse_tree.NIL != v_context_$1 && !parse_tree.assertionsDisabledInClass && parse_tree.NIL == context.parse_tree_context_p(v_context_$1)) {
                    throw new AssertionError(v_context_$1);
                }
                assert parse_tree.NIL != Types.booleanp(wff_checkP) : wff_checkP;
                if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == conses_high.member(error_handling, (SubLObject)parse_tree.$list49, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED)) {
                    Errors.error((SubLObject)parse_tree.$str50$Invalid_error_handling_tag__a, error_handling);
                }
                if (parse_tree.NIL != subcyclifier_pool && !parse_tree.assertionsDisabledInClass && parse_tree.NIL == subcyclifier.cyclifier_pool_p(subcyclifier_pool)) {
                    throw new AssertionError(subcyclifier_pool);
                }
                final SubLObject v_cyclifier = object.new_class_instance((SubLObject)parse_tree.$sym52$CYCLIFIER);
                cyclifier.set_cyclifier_score_function(v_cyclifier, score_function);
                cyclifier.set_cyclifier_output(v_cyclifier, output);
                cyclifier.set_cyclifier_error_handling(v_cyclifier, error_handling);
                cyclifier.set_cyclifier_subcyclifier_pool(v_cyclifier, subcyclifier_pool);
                if (parse_tree.NIL != lexicon) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym53$LEXIFY, lexicon);
                }
                if (parse_tree.NIL != disambiguator) {
                    if (parse_tree.NIL == v_context_$1) {
                        v_context_$1 = object.new_class_instance((SubLObject)parse_tree.$sym54$PARSE_TREE_CONTEXT);
                    }
                    methods.funcall_instance_method_with_2_args(disambiguator, (SubLObject)parse_tree.$sym55$DISAMBIGUATE, self, v_context_$1);
                }
                cyclifier.set_cyclifier_tree(v_cyclifier, self);
                cyclifier.set_cyclifier_wff_checkP(v_cyclifier, wff_checkP);
                if (parse_tree.NIL != wff_checkP) {
                    cyclifier.set_cyclifier_memoization_state(v_cyclifier, memoization_state.new_memoization_state((SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED));
                    cyclifier.set_cyclifier_sbhl_resource(v_cyclifier, sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)parse_tree.TEN_INTEGER));
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD, v_cyclifier);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context(self, v_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject parse_tree_cyclify_method(final SubLObject self, SubLObject v_properties) {
        if (v_properties == parse_tree.UNPROVIDED) {
            v_properties = (SubLObject)parse_tree.NIL;
        }
        final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym25$GET_CYCLIFIER, v_properties);
        SubLObject cycls = (SubLObject)parse_tree.NIL;
        while (parse_tree.NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)parse_tree.$sym59$HAS_NEXT_)) {
            cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)parse_tree.$sym60$NEXT), cycls);
        }
        return Sequences.nreverse(cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject subloop_reserved_initialize_parse_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject subloop_reserved_initialize_parse_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 7088L)
    public static SubLObject parse_tree_p(final SubLObject v_parse_tree) {
        return classes.subloop_instanceof_class(v_parse_tree, (SubLObject)parse_tree.$sym15$PARSE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 9132L)
    public static SubLObject parse_tree_deep_copy_method(final SubLObject self) {
        final SubLObject class_of_self = subloop_structures.instance_class(self);
        final SubLObject v_new = methods.funcall_class_method_with_0_args(class_of_self, (SubLObject)parse_tree.$sym69$NEW);
        SubLObject cdolist_list_var;
        final SubLObject all_instance_slots = cdolist_list_var = instances.instances_all_instance_slots(self);
        SubLObject instance_slot = (SubLObject)parse_tree.NIL;
        instance_slot = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            final SubLObject slot_value = instances.get_slot(self, instance_slot);
            SubLObject value_copy = (SubLObject)parse_tree.NIL;
            if (parse_tree.NIL != object.object_p(slot_value)) {
                value_copy = methods.funcall_instance_method_with_0_args(slot_value, (SubLObject)parse_tree.$sym67$DEEP_COPY);
            }
            else if (slot_value.isList()) {
                value_copy = conses_high.copy_list(slot_value);
            }
            else if (slot_value.isVector()) {
                value_copy = vector_utilities.copy_vector(slot_value);
            }
            else if (slot_value.isHashtable()) {
                value_copy = hash_table_utilities.copy_hashtable(slot_value, (SubLObject)parse_tree.UNPROVIDED);
            }
            else {
                value_copy = slot_value;
            }
            instances.set_slot(v_new, instance_slot, value_copy);
            cdolist_list_var = cdolist_list_var.rest();
            instance_slot = cdolist_list_var.first();
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 9960L)
    public static SubLObject parse_tree_get_root_method(final SubLObject self) {
        SubLObject tree;
        for (tree = self; parse_tree.NIL == methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym73$ROOT_P); tree = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym74$GET_MOTHER)) {}
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10177L)
    public static SubLObject parse_tree_get_category_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject category = get_parse_tree_category(self);
        try {
            thread.throwStack.push(parse_tree.$sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD, category);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_category(self, category);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10308L)
    public static SubLObject parse_tree_get_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject idx = get_parse_tree_idx(self);
        try {
            thread.throwStack.push(parse_tree.$sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD, idx);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_idx(self, idx);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10459L)
    public static SubLObject parse_tree_get_path_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject idx = get_parse_tree_idx(self);
        try {
            thread.throwStack.push(parse_tree.$sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                SubLObject path = (SubLObject)((parse_tree.NIL != idx) ? ConsesLow.list(idx) : parse_tree.NIL);
                SubLObject cdolist_list_var = conses_high.butlast(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym87$GET_ANCESTORS), (SubLObject)parse_tree.UNPROVIDED);
                SubLObject ancestor = (SubLObject)parse_tree.NIL;
                ancestor = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    path = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)parse_tree.$sym80$GET_INDEX), path);
                    cdolist_list_var = cdolist_list_var.rest();
                    ancestor = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD, path);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_idx(self, idx);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10738L)
    public static SubLObject parse_tree_get_mother_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD, mother);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 10861L)
    public static SubLObject parse_tree_get_semantic_head_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11113L)
    public static SubLObject parse_tree_get_complements_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym96$GET_COMPLEMENTS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11342L)
    public static SubLObject parse_tree_get_modifiers_method(final SubLObject self) {
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11467L)
    public static SubLObject parse_tree_get_modifieds_method(final SubLObject self) {
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11595L)
    public static SubLObject parse_tree_get_context_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject v_context = get_parse_tree_context(self);
        try {
            thread.throwStack.push(parse_tree.$sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD, v_context);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context(self, v_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11753L)
    public static SubLObject parse_tree_temporal_tree_p_method(final SubLObject self) {
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 11955L)
    public static SubLObject parse_tree_cyclifiable_question_p_method(final SubLObject self) {
        return question_tree_p(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12116L)
    public static SubLObject parse_tree_root_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(parse_tree.NIL == mother));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12256L)
    public static SubLObject parse_tree_lexify_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_complete$.currentBinding(thread);
        try {
            cyclifier_interface.$allow_duplicate_cyclificationsP$.bind((SubLObject)parse_tree.T, thread);
            cyclifier_interface.$cyclification_complete$.bind((SubLObject)parse_tree.NIL, thread);
            methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym121$LEXIFY_INT, lexicon);
        }
        finally {
            cyclifier_interface.$cyclification_complete$.rebind(_prev_bind_2, thread);
            cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind(_prev_bind_0, thread);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12516L)
    public static SubLObject parse_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12685L)
    public static SubLObject parse_tree_cyclify_int_method(final SubLObject self) {
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 12836L)
    public static SubLObject parse_tree_get_ancestors_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD, (SubLObject)((parse_tree.NIL != mother) ? ConsesLow.cons(mother, methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym87$GET_ANCESTORS)) : parse_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13025L)
    public static SubLObject parse_tree_get_sister_method(final SubLObject self, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject idx = get_parse_tree_idx(self);
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
            try {
                assert parse_tree.NIL != Types.integerp(index) : index;
                if (parse_tree.NIL != idx) {
                    final SubLObject sister_index = Numbers.add(idx, index);
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD, (SubLObject)((parse_tree.NIL != mother && parse_tree.NIL != subl_promotions.non_negative_integer_p(sister_index)) ? methods.funcall_instance_method_with_1_args(mother, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, Numbers.add(idx, index)) : parse_tree.NIL));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_idx(self, idx);
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13475L)
    public static SubLObject parse_tree_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        return pprint_parse_tree(self, stream, (SubLObject)parse_tree.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 13665L)
    public static SubLObject pprint_word_tree(final SubLObject wt, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = (SubLObject)parse_tree.THREE_INTEGER;
        final SubLObject base_column = Numbers.multiply(level, indent);
        string_utilities.indent(stream, base_column);
        streams_high.write_string((SubLObject)parse_tree.$str143$__W_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        print_high.princ(methods.funcall_instance_method_with_0_args(wt, (SubLObject)parse_tree.$sym76$GET_CATEGORY), stream);
        streams_high.write_string((SubLObject)parse_tree.$str144$_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(wt, (SubLObject)parse_tree.$sym145$GET_RANKED_LEXES)) {
            streams_high.write_string((SubLObject)parse_tree.$str146$_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)parse_tree.$str147$__, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(wt, (SubLObject)parse_tree.$sym148$GET_STRING)) {
            streams_high.write_string(methods.funcall_instance_method_with_0_args(wt, (SubLObject)parse_tree.$sym148$GET_STRING), stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)parse_tree.$str149$_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        streams_high.terpri(stream);
        return wt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14193L)
    public static SubLObject pprint_parse_tree(final SubLObject pt, final SubLObject stream, final SubLObject level) {
        return (parse_tree.NIL != phrase_tree_p(pt)) ? pprint_phrase_tree(pt, stream, level) : pprint_word_tree(pt, stream, level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14424L)
    public static SubLObject new_parse_tree(final SubLObject parse_expression, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == parse_tree.UNPROVIDED) {
            lexicon = (SubLObject)parse_tree.NIL;
        }
        if (v_context == parse_tree.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parse_tree.$sym54$PARSE_TREE_CONTEXT);
        }
        return process_modifiers(process_abs_index(retag_aux_verbs(new_parse_tree_int(parse_expression, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.ZERO_INTEGER, lexicon, v_context))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 14788L)
    public static SubLObject new_parse_tree_int(final SubLObject parse_expression, SubLObject mother, SubLObject index, SubLObject lexicon, SubLObject v_context) {
        if (mother == parse_tree.UNPROVIDED) {
            mother = (SubLObject)parse_tree.NIL;
        }
        if (index == parse_tree.UNPROVIDED) {
            index = (SubLObject)parse_tree.NIL;
        }
        if (lexicon == parse_tree.UNPROVIDED) {
            lexicon = (SubLObject)parse_tree.NIL;
        }
        if (v_context == parse_tree.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parse_tree.$sym54$PARSE_TREE_CONTEXT);
        }
        final SubLObject tree = (parse_tree.NIL != word_tree.phrase_expression_p(parse_expression)) ? parse_expression_to_phrase_tree(parse_expression, mother, index, lexicon, v_context) : word_tree.parse_expression_to_word_tree(parse_expression, mother, index, v_context);
        if (parse_tree.NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(tree, (SubLObject)parse_tree.$sym150$RETOKENIZE, lexicon);
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 15341L)
    public static SubLObject do_parse_tree_subtrees(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list151);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_tree = (SubLObject)parse_tree.NIL;
        SubLObject v_parse_tree = (SubLObject)parse_tree.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list151);
        sub_tree = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list151);
        v_parse_tree = current.first();
        current = current.rest();
        final SubLObject doneP = (SubLObject)(current.isCons() ? current.first() : parse_tree.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parse_tree.$list151);
        current = current.rest();
        final SubLObject categories = (SubLObject)(current.isCons() ? current.first() : parse_tree.$kw152$ALL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parse_tree.$list151);
        current = current.rest();
        final SubLObject order = (SubLObject)(current.isCons() ? current.first() : parse_tree.$kw153$DFR2L);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parse_tree.$list151);
        current = current.rest();
        if (parse_tree.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree.$list151);
            return (SubLObject)parse_tree.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (categories == parse_tree.$kw152$ALL) {
            final SubLObject stack = (SubLObject)parse_tree.$sym154$STACK;
            final SubLObject order_var = (SubLObject)parse_tree.$sym155$ORDER_VAR;
            final SubLObject possible_orders = (SubLObject)parse_tree.$sym156$POSSIBLE_ORDERS;
            return (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym157$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)parse_tree.$list158), (SubLObject)ConsesLow.list(order_var, order), reader.bq_cons(possible_orders, (SubLObject)parse_tree.$list159), sub_tree), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym160$MUST, (SubLObject)ConsesLow.listS((SubLObject)parse_tree.$sym161$MEMBER_, order_var, possible_orders, (SubLObject)parse_tree.$list162), (SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym164$STACK_PUSH, v_parse_tree, stack), (SubLObject)ConsesLow.listS((SubLObject)parse_tree.$sym165$UNTIL, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym166$COR, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym167$STACK_EMPTY_P, stack), doneP), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym168$CSETQ, sub_tree, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym169$STACK_POP, stack)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym170$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym171$PHRASE_TREE_P, sub_tree), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym172$DO_VECTOR, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym173$DAUGHTER, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym174$GET_PHRASE_TREE_DAUGHTERS, sub_tree), (SubLObject)parse_tree.$kw175$BACKWARD_, (SubLObject)ConsesLow.listS((SubLObject)parse_tree.EQ, order_var, (SubLObject)parse_tree.$list176)), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym164$STACK_PUSH, (SubLObject)parse_tree.$sym173$DAUGHTER, stack)))))));
        }
        final SubLObject categories_var = (SubLObject)parse_tree.$sym177$CATEGORIES_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym157$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(categories_var, categories)), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym178$DO_PARSE_TREE_SUBTREES, (SubLObject)ConsesLow.list(sub_tree, v_parse_tree, doneP, (SubLObject)parse_tree.$kw152$ALL, order), (SubLObject)ConsesLow.listS((SubLObject)parse_tree.$sym170$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym166$COR, (SubLObject)ConsesLow.listS((SubLObject)parse_tree.EQ, categories_var, (SubLObject)parse_tree.$list179), (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym161$MEMBER_, (SubLObject)ConsesLow.listS((SubLObject)parse_tree.$sym180$FIM, sub_tree, (SubLObject)parse_tree.$list181), categories_var)), ConsesLow.append(body, (SubLObject)parse_tree.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 16667L)
    public static SubLObject do_parse_tree_word_trees(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list182);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_word_tree = (SubLObject)parse_tree.NIL;
        SubLObject v_parse_tree = (SubLObject)parse_tree.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list182);
        v_word_tree = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list182);
        v_parse_tree = current.first();
        current = current.rest();
        final SubLObject doneP = (SubLObject)(current.isCons() ? current.first() : parse_tree.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parse_tree.$list182);
        current = current.rest();
        final SubLObject categories = (SubLObject)(current.isCons() ? current.first() : parse_tree.$kw152$ALL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parse_tree.$list182);
        current = current.rest();
        if (parse_tree.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym178$DO_PARSE_TREE_SUBTREES, (SubLObject)ConsesLow.listS(v_word_tree, v_parse_tree, doneP, categories, (SubLObject)parse_tree.$list176), (SubLObject)ConsesLow.listS((SubLObject)parse_tree.$sym170$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parse_tree.$sym183$WORD_TREE_P, v_word_tree), ConsesLow.append(body, (SubLObject)parse_tree.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree.$list182);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
    public static SubLObject get_phrase_tree_daughters(final SubLObject phrase_tree) {
        return classes.subloop_get_access_protected_instance_slot(phrase_tree, (SubLObject)parse_tree.SEVEN_INTEGER, (SubLObject)parse_tree.$sym186$DAUGHTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
    public static SubLObject set_phrase_tree_daughters(final SubLObject phrase_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(phrase_tree, value, (SubLObject)parse_tree.SEVEN_INTEGER, (SubLObject)parse_tree.$sym186$DAUGHTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
    public static SubLObject subloop_reserved_initialize_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
    public static SubLObject subloop_reserved_initialize_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 17116L)
    public static SubLObject phrase_tree_p(final SubLObject phrase_tree) {
        return classes.subloop_instanceof_class(phrase_tree, (SubLObject)parse_tree.$sym184$PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 18709L)
    public static SubLObject phrase_tree_get_head_daughters_method(final SubLObject self) {
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 18888L)
    public static SubLObject phrase_tree_get_head_daughter_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19142L)
    public static SubLObject phrase_tree_get_head_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym196$GET_HEADS).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19368L)
    public static SubLObject phrase_tree_get_semantic_head_daughters_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19543L)
    public static SubLObject phrase_tree_get_semantic_head_daughter_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym198$GET_SEMANTIC_HEAD_DAUGHTERS).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 19824L)
    public static SubLObject phrase_tree_get_refs_method(final SubLObject self) {
        SubLObject heads = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS);
        SubLObject refs = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == heads && methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT).numE((SubLObject)parse_tree.ONE_INTEGER)) {
            final SubLObject daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER);
            if (parse_tree.NIL != quantifier_tree_p(daughter) && parse_tree.NIL != phrase_tree_p(daughter) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)parse_tree.$sym76$GET_CATEGORY).eql((SubLObject)parse_tree.$kw208$_)) {
                heads = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER), heads);
            }
            else {
                heads = (SubLObject)ConsesLow.cons(daughter, heads);
            }
        }
        SubLObject cdolist_list_var = heads;
        SubLObject head = (SubLObject)parse_tree.NIL;
        head = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym204$GET_REFS);
            SubLObject ref = (SubLObject)parse_tree.NIL;
            ref = cdolist_list_var_$2.first();
            while (parse_tree.NIL != cdolist_list_var_$2) {
                refs = (SubLObject)ConsesLow.cons(ref, refs);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                ref = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            head = cdolist_list_var.first();
        }
        return refs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 20652L)
    public static SubLObject phrase_tree_get_modifiers_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym100$GET_MODIFIERS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 20862L)
    public static SubLObject phrase_tree_get_conjunction_method(final SubLObject self) {
        return phrase_tree_find_first_method(self, (SubLObject)parse_tree.$sym214$COORDINATE_WORD_TREE_P, (SubLObject)parse_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 21056L)
    public static SubLObject phrase_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
        SubLObject words = (SubLObject)parse_tree.NIL;
        SubLObject orig_spelling = (SubLObject)parse_tree.NIL;
        SubLObject normalized_spelling = (SubLObject)parse_tree.NIL;
        SubLObject first_word1 = (SubLObject)parse_tree.NIL;
        SubLObject first_word2 = (SubLObject)parse_tree.NIL;
        SubLObject yield = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym73$ROOT_P)) {
            yield = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym218$YIELD);
            words = tree_yield_to_words(yield);
            orig_spelling = document.word_string(Vectors.aref(words, (SubLObject)parse_tree.ZERO_INTEGER));
            pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), words);
            normalized_spelling = document.word_string(Vectors.aref(words, (SubLObject)parse_tree.ZERO_INTEGER));
            first_word1 = yield.first();
            set_parse_tree_string(first_word1, normalized_spelling);
        }
        final SubLObject vector_var = daughters;
        final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
            element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym121$LEXIFY_INT, lexicon);
        }
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym73$ROOT_P)) {
            first_word2 = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym218$YIELD).first();
            if (methods.funcall_instance_method_with_0_args(first_word1, (SubLObject)parse_tree.$sym148$GET_STRING).equalp(methods.funcall_instance_method_with_0_args(first_word2, (SubLObject)parse_tree.$sym148$GET_STRING))) {
                set_parse_tree_string(first_word2, orig_spelling);
            }
            else {
                final SubLObject tokens = string_utilities.split_string(get_parse_tree_string(first_word2), (SubLObject)parse_tree.UNPROVIDED);
                final SubLObject new_string = string_utilities.bunge((SubLObject)ConsesLow.cons(orig_spelling, tokens.rest()), (SubLObject)parse_tree.UNPROVIDED);
                set_parse_tree_string(first_word2, new_string);
            }
            process_modifiers(process_abs_index(self));
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 22837L)
    public static SubLObject phrase_tree_retokenize_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym221$PRETERMINAL_P)) {
            result = methods.funcall_instance_method_with_2_args(self, (SubLObject)parse_tree.$sym222$RETOKENIZE_INT, vector_utilities.vector_elements(instances.get_slot(self, (SubLObject)parse_tree.$sym186$DAUGHTERS), (SubLObject)parse_tree.UNPROVIDED), lexicon);
        }
        else if (parse_tree.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)parse_tree.$sym223$GET, methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym148$GET_STRING))) {
            result = methods.funcall_instance_method_with_2_args(self, (SubLObject)parse_tree.$sym222$RETOKENIZE_INT, methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym218$YIELD), lexicon);
        }
        else if (parse_tree.NIL != parse_tree.$phrase_tree_allow_adjacent_daughters_to_merge$.getDynamicValue(thread) && parse_tree.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, lexicon)) {
            SubLObject current;
            final SubLObject datum = current = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, lexicon);
            SubLObject word_lists = (SubLObject)parse_tree.NIL;
            SubLObject constit_lists = (SubLObject)parse_tree.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list225);
            word_lists = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree.$list225);
            constit_lists = current.first();
            current = current.rest();
            if (parse_tree.NIL == current) {
                result = methods.funcall_instance_method_with_3_args(self, (SubLObject)parse_tree.$sym226$PARTIAL_RETOKENIZE_INT, word_lists, constit_lists, lexicon);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree.$list225);
            }
        }
        else {
            result = self;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 23739L)
    public static SubLObject phrase_tree_retokenize_int_method(final SubLObject self, final SubLObject words, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject v_context = get_parse_tree_context(self);
        try {
            thread.throwStack.push(parse_tree.$sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                final SubLObject tokens = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)parse_tree.$sym231$LEXIFY_WORDS, words);
                final SubLObject new_daughters = Vectors.make_vector(Sequences.length(tokens), (SubLObject)parse_tree.UNPROVIDED);
                SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
                SubLObject cdolist_list_var = tokens;
                SubLObject token = (SubLObject)parse_tree.NIL;
                token = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    final SubLObject new_daughter = word_tree.new_word_tree(token.first(), conses_high.second(token), self, i, (SubLObject)parse_tree.NIL, v_context);
                    Vectors.set_aref(new_daughters, i, new_daughter);
                    i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    token = cdolist_list_var.first();
                }
                set_phrase_tree_daughters(self, new_daughters);
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context(self, v_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 24174L)
    public static SubLObject phrase_tree_partial_retokenize_int_method(final SubLObject self, final SubLObject word_lists, final SubLObject daughter_lists, final SubLObject lexicon) {
        SubLObject new_daughters = (SubLObject)parse_tree.NIL;
        SubLObject words = (SubLObject)parse_tree.NIL;
        SubLObject words_$3 = (SubLObject)parse_tree.NIL;
        SubLObject daughters = (SubLObject)parse_tree.NIL;
        SubLObject daughters_$4 = (SubLObject)parse_tree.NIL;
        words = word_lists;
        words_$3 = words.first();
        daughters = daughter_lists;
        daughters_$4 = daughters.first();
        while (parse_tree.NIL != daughters || parse_tree.NIL != words) {
            if (parse_tree.NIL != words_$3) {
                final SubLObject tokens = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)parse_tree.$sym231$LEXIFY_WORDS, words_$3);
                final SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
                SubLObject cdolist_list_var = tokens;
                SubLObject token = (SubLObject)parse_tree.NIL;
                token = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    new_daughters = (SubLObject)ConsesLow.cons(word_tree.new_word_tree(token.first(), conses_high.second(token), self, i, (SubLObject)parse_tree.NIL, instances.get_slot(self, (SubLObject)parse_tree.$sym19$CONTEXT)), new_daughters);
                    cdolist_list_var = cdolist_list_var.rest();
                    token = cdolist_list_var.first();
                }
            }
            else {
                final SubLObject items_var = daughters_$4;
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                        element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        new_daughters = (SubLObject)ConsesLow.cons(item, new_daughters);
                    }
                }
                else {
                    SubLObject cdolist_list_var2 = items_var;
                    SubLObject item2 = (SubLObject)parse_tree.NIL;
                    item2 = cdolist_list_var2.first();
                    while (parse_tree.NIL != cdolist_list_var2) {
                        new_daughters = (SubLObject)ConsesLow.cons(item2, new_daughters);
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
        final SubLObject replacement_daughters = list_utilities.list2vector(Sequences.nreverse(new_daughters));
        set_phrase_tree_daughters(self, replacement_daughters);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 25041L)
    public static SubLObject phrase_tree_adjacent_daughters_have_lexical_entry_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        final SubLObject string = get_parse_tree_string(self);
        try {
            thread.throwStack.push(parse_tree.$sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject word_lists = (SubLObject)parse_tree.NIL;
                SubLObject daughter_lists = (SubLObject)parse_tree.NIL;
                final SubLObject all_daughters = list_utilities.vector2list(get_phrase_tree_daughters(self));
                final SubLObject daughter_count = Sequences.length(all_daughters);
                final SubLObject string_$5 = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym148$GET_STRING);
                for (SubLObject current_start = (SubLObject)parse_tree.ZERO_INTEGER; current_start.numL(daughter_count); current_start = Numbers.add(current_start, (SubLObject)parse_tree.ONE_INTEGER)) {
                    SubLObject num_daughters_used = (SubLObject)parse_tree.NIL;
                    final SubLObject start_for_iteration = current_start;
                    if (parse_tree.NIL == num_daughters_used) {
                        SubLObject end_var;
                        SubLObject num;
                        SubLObject daughters_$6;
                        SubLObject yield;
                        SubLObject raw_string;
                        SubLObject current_string;
                        for (end_var = start_for_iteration, num = (SubLObject)parse_tree.NIL, num = daughter_count; parse_tree.NIL == num_daughters_used && !num.numLE(end_var); num = Numbers.add(num, (SubLObject)parse_tree.MINUS_ONE_INTEGER)) {
                            daughters_$6 = list_utilities.first_n(num, all_daughters);
                            yield = Mapping.mapcan(Symbols.symbol_function((SubLObject)parse_tree.$sym238$COPY_LIST), Mapping.mapcar((SubLObject)parse_tree.$sym239$PHRASE_TREE_YIELD, daughters_$6), parse_tree.EMPTY_SUBL_OBJECT_ARRAY);
                            raw_string = Mapping.mapcar((SubLObject)parse_tree.$sym240$PHRASE_TREE_STRING, yield);
                            current_string = string_utilities.bunge_according_to_string(raw_string, string_$5, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
                            if (parse_tree.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)parse_tree.$sym223$GET, current_string)) {
                                word_lists = (SubLObject)ConsesLow.cons(yield, word_lists);
                                daughter_lists = (SubLObject)ConsesLow.cons(list_utilities.first_n(num, all_daughters), daughter_lists);
                                num_daughters_used = num;
                                current_start = Numbers.add(current_start, num_daughters_used);
                            }
                        }
                    }
                    if (parse_tree.NIL == num_daughters_used) {
                        word_lists = (SubLObject)ConsesLow.cons((SubLObject)parse_tree.NIL, word_lists);
                        daughter_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ConsesLow.nth(current_start, all_daughters)), daughter_lists);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, (SubLObject)ConsesLow.list(Sequences.nreverse(word_lists), Sequences.nreverse(daughter_lists)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 26389L)
    public static SubLObject phrase_tree_cyclify_int_method(final SubLObject self) {
        final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
        if (parse_tree.NIL != scycls) {
            return scycls;
        }
        final SubLObject heads = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym196$GET_HEADS);
        SubLObject cycls = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = heads;
        SubLObject head = (SubLObject)parse_tree.NIL;
        head = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym126$CYCLIFY_INT), cycls);
            cdolist_list_var = cdolist_list_var.rest();
            head = cdolist_list_var.first();
        }
        return Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.cross_products(cycls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 27690L)
    public static SubLObject parse_expression_to_phrase_tree(final SubLObject phrase_expression, SubLObject mother, SubLObject index, SubLObject lexicon, SubLObject v_context) {
        if (mother == parse_tree.UNPROVIDED) {
            mother = (SubLObject)parse_tree.NIL;
        }
        if (index == parse_tree.UNPROVIDED) {
            index = (SubLObject)parse_tree.NIL;
        }
        if (lexicon == parse_tree.UNPROVIDED) {
            lexicon = (SubLObject)parse_tree.NIL;
        }
        if (v_context == parse_tree.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parse_tree.$sym54$PARSE_TREE_CONTEXT);
        }
        final SubLObject self = object.new_class_instance(tree_for_category(word_tree.parse_expression_category(phrase_expression)));
        final SubLObject daughters = Vectors.make_vector(Sequences.length(word_tree.phrase_expression_daughters(phrase_expression)), (SubLObject)parse_tree.UNPROVIDED);
        SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
        set_parse_tree_category(self, word_tree.parse_expression_category(phrase_expression));
        set_parse_tree_mother(self, mother);
        set_parse_tree_idx(self, index);
        set_parse_tree_context(self, v_context);
        SubLObject cdolist_list_var = word_tree.phrase_expression_daughters(phrase_expression);
        SubLObject daughter = (SubLObject)parse_tree.NIL;
        daughter = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            Vectors.set_aref(daughters, i, new_parse_tree_int(daughter, self, i, lexicon, v_context));
            i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            daughter = cdolist_list_var.first();
        }
        set_phrase_tree_daughters(self, daughters);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 28698L)
    public static SubLObject tree_for_category(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = conses_high.assoc(category, parse_tree.$category_to_phrase$.getDynamicValue(thread), (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED).rest();
        if (parse_tree.NIL == tree) {
            tree = (SubLObject)parse_tree.$sym184$PHRASE_TREE;
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 28991L)
    public static SubLObject pprint_phrase_tree(final SubLObject pt, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = (SubLObject)parse_tree.THREE_INTEGER;
        final SubLObject base_column = Numbers.multiply(level, indent);
        string_utilities.indent(stream, base_column);
        streams_high.write_string((SubLObject)parse_tree.$str246$__P_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        print_high.princ(get_parse_tree_category(pt), stream);
        streams_high.write_string((SubLObject)parse_tree.$str247$__, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        streams_high.terpri(stream);
        final SubLObject vector_var = get_phrase_tree_daughters(pt);
        final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
            element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            pprint_parse_tree(daughter, stream, Numbers.add(level, (SubLObject)parse_tree.ONE_INTEGER));
        }
        string_utilities.indent(stream, base_column);
        streams_high.write_string((SubLObject)parse_tree.$str149$_, stream, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        streams_high.terpri(stream);
        return pt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 29531L)
    public static SubLObject phrase_tree_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        SubLObject string = get_parse_tree_string(self);
        try {
            thread.throwStack.push(parse_tree.$sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                if (!string.isString()) {
                    if (parse_tree.NIL != phrase_tree_get_daughter_method(self, (SubLObject)parse_tree.ZERO_INTEGER)) {
                        SubLObject s = methods.funcall_instance_method_with_0_args(phrase_tree_get_daughter_method(self, (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)parse_tree.$sym148$GET_STRING);
                        SubLObject daughter_string = (SubLObject)parse_tree.NIL;
                        SubLObject cdotimes_end_var;
                        SubLObject i;
                        for (cdotimes_end_var = Numbers.subtract(phrase_tree_daughter_count_method(self), (SubLObject)parse_tree.ONE_INTEGER), i = (SubLObject)parse_tree.NIL, i = (SubLObject)parse_tree.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER)) {
                            daughter_string = methods.funcall_instance_method_with_0_args(phrase_tree_get_daughter_method(self, number_utilities.f_1X(i)), (SubLObject)parse_tree.$sym148$GET_STRING);
                            s = Sequences.cconcatenate(s, new SubLObject[] { (parse_tree.NIL != contract_stringP(daughter_string)) ? parse_tree.$str250$ : parse_tree.$str251$_, daughter_string });
                        }
                        string = s;
                    }
                    else {
                        string = (SubLObject)parse_tree.$str250$;
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30059L)
    public static SubLObject phrase_tree_string(final SubLObject phrase_tree) {
        return methods.funcall_instance_method_with_0_args(phrase_tree, (SubLObject)parse_tree.$sym148$GET_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30167L)
    public static SubLObject phrase_tree_yield_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject yield = (SubLObject)parse_tree.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw153$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject daughter = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(self, stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            daughter = stacks.stack_pop(stack);
            if (parse_tree.NIL != word_tree.word_tree_p(daughter)) {
                yield = (SubLObject)ConsesLow.cons(daughter, yield);
            }
            if (parse_tree.NIL != phrase_tree_p(daughter)) {
                final SubLObject vector_var = get_phrase_tree_daughters(daughter);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter_$7;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                    element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                    daughter_$7 = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter_$7, stack);
                }
            }
        }
        return yield;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30422L)
    public static SubLObject phrase_tree_yield(final SubLObject tree) {
        return methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym218$YIELD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30491L)
    public static SubLObject phrase_tree_get_parse_expression_method(final SubLObject self) {
        SubLObject expression = (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym76$GET_CATEGORY));
        final SubLObject vector_var = get_phrase_tree_daughters(self);
        final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
            element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            expression = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(daughter, (SubLObject)parse_tree.$sym256$GET_PARSE_EXPRESSION), expression);
        }
        return Sequences.nreverse(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 30848L)
    public static SubLObject phrase_tree_get_heads_method(final SubLObject self) {
        SubLObject heads = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS);
        SubLObject head_daughter = (SubLObject)parse_tree.NIL;
        head_daughter = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args(head_daughter, (SubLObject)parse_tree.$sym196$GET_HEADS);
            SubLObject head = (SubLObject)parse_tree.NIL;
            head = cdolist_list_var_$8.first();
            while (parse_tree.NIL != cdolist_list_var_$8) {
                heads = (SubLObject)ConsesLow.cons(head, heads);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                head = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_daughter = cdolist_list_var.first();
        }
        return Sequences.nreverse(heads);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31142L)
    public static SubLObject phrase_tree_get_semantic_heads_method(final SubLObject self) {
        SubLObject heads = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym198$GET_SEMANTIC_HEAD_DAUGHTERS);
        SubLObject head_daughter = (SubLObject)parse_tree.NIL;
        head_daughter = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = methods.funcall_instance_method_with_0_args(head_daughter, (SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS);
            SubLObject head = (SubLObject)parse_tree.NIL;
            head = cdolist_list_var_$9.first();
            while (parse_tree.NIL != cdolist_list_var_$9) {
                heads = (SubLObject)ConsesLow.cons(head, heads);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                head = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_daughter = cdolist_list_var.first();
        }
        return Sequences.nreverse(heads);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31472L)
    public static SubLObject phrase_tree_get_daughter_method(final SubLObject self, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                assert parse_tree.NIL != subl_promotions.non_negative_integer_p(index) : index;
                if (index.numGE(Sequences.length(daughters))) {
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, (SubLObject)parse_tree.NIL);
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Vectors.aref(daughters, index));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 31789L)
    public static SubLObject phrase_tree_get_descendant_method(final SubLObject self, final SubLObject path) {
        assert parse_tree.NIL != Types.listp(path) : path;
        SubLObject tree = self;
        SubLObject dtrs = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = path;
        SubLObject i = (SubLObject)parse_tree.NIL;
        i = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            dtrs = get_phrase_tree_daughters(tree);
            if (i.numGE(Sequences.length(dtrs))) {
                return (SubLObject)parse_tree.NIL;
            }
            tree = Vectors.aref(dtrs, i);
            cdolist_list_var = cdolist_list_var.rest();
            i = cdolist_list_var.first();
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32275L)
    public static SubLObject proper_subtree_p(final SubLObject little_tree, final SubLObject big_tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!little_tree.eql(big_tree) && parse_tree.NIL != subtree_p(little_tree, big_tree));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32422L)
    public static SubLObject subtree_p(final SubLObject little_tree, final SubLObject big_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert parse_tree.NIL != parse_tree_p(little_tree) : little_tree;
        assert parse_tree.NIL != parse_tree_p(big_tree) : big_tree;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw153$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject sub = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(big_tree, stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            if (little_tree.eql(sub)) {
                return (SubLObject)parse_tree.T;
            }
            if (parse_tree.NIL == phrase_tree_p(sub)) {
                continue;
            }
            final SubLObject vector_var = get_phrase_tree_daughters(sub);
            final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject daughter;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                daughter = Vectors.aref(vector_var, element_num);
                stacks.stack_push(daughter, stack);
            }
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 32826L)
    public static SubLObject phrase_tree_search_method(final SubLObject self, final SubLObject search_string, SubLObject n) {
        if (n == parse_tree.UNPROVIDED) {
            n = (SubLObject)parse_tree.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert parse_tree.NIL != Types.stringp(search_string) : search_string;
        assert parse_tree.NIL != subl_promotions.positive_integer_p(n) : n;
        SubLObject m = (SubLObject)parse_tree.ZERO_INTEGER;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw254$DFL2R;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject word = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(self, stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            word = stacks.stack_pop(stack);
            if (parse_tree.NIL != word_tree.word_tree_p(word) && search_string.equalp(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym148$GET_STRING))) {
                m = Numbers.add(m, (SubLObject)parse_tree.ONE_INTEGER);
                if (m.numE(n)) {
                    return word;
                }
            }
            if (parse_tree.NIL != phrase_tree_p(word)) {
                final SubLObject vector_var = get_phrase_tree_daughters(word);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                    element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33321L)
    public static SubLObject phrase_tree_daughter_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.length(daughters));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33489L)
    public static SubLObject phrase_tree_preterminal_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(parse_tree.NIL == list_utilities.find_if_not((SubLObject)parse_tree.$sym183$WORD_TREE_P, daughters, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33689L)
    public static SubLObject phrase_tree_hydra_p_method(final SubLObject self) {
        return Numbers.numG(Sequences.length(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS)), (SubLObject)parse_tree.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 33884L)
    public static SubLObject phrase_tree_find_method(final SubLObject self, final SubLObject predicate, SubLObject start, SubLObject end) {
        if (start == parse_tree.UNPROVIDED) {
            start = (SubLObject)parse_tree.ZERO_INTEGER;
        }
        if (end == parse_tree.UNPROVIDED) {
            end = (SubLObject)parse_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject daughter = (SubLObject)parse_tree.NIL;
                final SubLObject stop = (parse_tree.NIL != end) ? end : Sequences.length(daughters);
                SubLObject found = (SubLObject)parse_tree.NIL;
                if (start.numG(stop)) {
                    Errors.warn((SubLObject)parse_tree.$str292$start__A__after_stop__A__when_fin, new SubLObject[] { start, stop, predicate, self });
                }
                SubLObject i;
                for (i = (SubLObject)parse_tree.NIL, i = start; !i.numGE(stop); i = number_utilities.f_1X(i)) {
                    daughter = phrase_tree_get_daughter_method(self, i);
                    if (parse_tree.NIL != Functions.funcall(predicate, daughter)) {
                        found = (SubLObject)ConsesLow.cons(daughter, found);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.nreverse(found));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 34489L)
    public static SubLObject phrase_tree_find_first_method(final SubLObject self, final SubLObject predicate, SubLObject start) {
        if (start == parse_tree.UNPROVIDED) {
            start = (SubLObject)parse_tree.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject daughter = (SubLObject)parse_tree.NIL;
                SubLObject i;
                for (i = (SubLObject)parse_tree.NIL, i = start; !i.numGE(Sequences.length(daughters)); i = number_utilities.f_1X(i)) {
                    daughter = phrase_tree_get_daughter_method(self, i);
                    if (parse_tree.NIL != Functions.funcall(predicate, daughter)) {
                        Dynamic.sublisp_throw((SubLObject)parse_tree.$sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, daughter);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, (SubLObject)parse_tree.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 34914L)
    public static SubLObject phrase_tree_find_last_method(final SubLObject self, final SubLObject predicate, SubLObject end) {
        if (end == parse_tree.UNPROVIDED) {
            end = (SubLObject)parse_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject daughter = (SubLObject)parse_tree.NIL;
                SubLObject i;
                for (i = (SubLObject)parse_tree.NIL, i = ((parse_tree.NIL != end) ? end : number_utilities.f_1_(Sequences.length(daughters))); !i.isNegative(); i = number_utilities.f_1_(i)) {
                    daughter = phrase_tree_get_daughter_method(self, i);
                    if (parse_tree.NIL != Functions.funcall(predicate, daughter)) {
                        Dynamic.sublisp_throw((SubLObject)parse_tree.$sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, daughter);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, (SubLObject)parse_tree.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 35342L)
    public static SubLObject phrase_tree_find_all_method(final SubLObject self, final SubLObject predicate, SubLObject start, SubLObject end) {
        if (start == parse_tree.UNPROVIDED) {
            start = (SubLObject)parse_tree.ZERO_INTEGER;
        }
        if (end == parse_tree.UNPROVIDED) {
            end = (SubLObject)parse_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject daughters = get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(parse_tree.$sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject daughter = (SubLObject)parse_tree.NIL;
                final SubLObject stop = (parse_tree.NIL != end) ? end : Sequences.length(daughters);
                SubLObject found = (SubLObject)parse_tree.NIL;
                SubLObject i;
                SubLObject cdolist_list_var;
                SubLObject the_descendant;
                for (i = (SubLObject)parse_tree.NIL, i = start; !i.numE(stop); i = number_utilities.f_1X(i)) {
                    daughter = phrase_tree_get_daughter_method(self, i);
                    if (parse_tree.NIL != Functions.funcall(predicate, daughter)) {
                        found = (SubLObject)ConsesLow.cons(daughter, found);
                    }
                    if (parse_tree.NIL != phrase_tree_p(daughter)) {
                        cdolist_list_var = methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym304$FIND_ALL, predicate);
                        the_descendant = (SubLObject)parse_tree.NIL;
                        the_descendant = cdolist_list_var.first();
                        while (parse_tree.NIL != cdolist_list_var) {
                            found = (SubLObject)ConsesLow.cons(the_descendant, found);
                            cdolist_list_var = cdolist_list_var.rest();
                            the_descendant = cdolist_list_var.first();
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, Sequences.nreverse(found));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 35999L)
    public static SubLObject phrase_tree_find_all_subtrees_of_categories_method(final SubLObject self, final SubLObject category_list, SubLObject start, SubLObject end) {
        if (start == parse_tree.UNPROVIDED) {
            start = (SubLObject)parse_tree.ZERO_INTEGER;
        }
        if (end == parse_tree.UNPROVIDED) {
            end = (SubLObject)parse_tree.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)parse_tree.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw153$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject subtree = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(self, stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            subtree = stacks.stack_pop(stack);
            SubLObject cdolist_list_var = category_list;
            SubLObject cat = (SubLObject)parse_tree.NIL;
            cat = cdolist_list_var.first();
            while (parse_tree.NIL != cdolist_list_var) {
                if (get_parse_tree_category(subtree).eql(cat)) {
                    result = (SubLObject)ConsesLow.cons(subtree, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cat = cdolist_list_var.first();
            }
            if (parse_tree.NIL != phrase_tree_p(subtree)) {
                final SubLObject vector_var = get_phrase_tree_daughters(subtree);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                    element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 36499L)
    public static SubLObject tree_yield_to_words(final SubLObject yield) {
        final SubLObject words = Vectors.make_vector(Sequences.length(yield), (SubLObject)parse_tree.UNPROVIDED);
        SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
        SubLObject cdolist_list_var = yield;
        SubLObject word = (SubLObject)parse_tree.NIL;
        word = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            Vectors.set_aref(words, i, document.new_word((SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw312$STRING, methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym148$GET_STRING))));
            i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 36750L)
    public static SubLObject main_collection(final SubLObject cycl, final SubLObject var) {
        assert parse_tree.NIL != el_utilities.el_formula_p(cycl) : cycl;
        final SubLObject col = genls.min_col(at_var_types.formula_variable_isa_constraints(var, cycl, parse_tree.$const314$EverythingPSC, (SubLObject)parse_tree.UNPROVIDED), (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        return (parse_tree.NIL != nart_handles.nart_p(col)) ? narts_high.nart_el_formula(col) : col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37035L)
    public static SubLObject contract_stringP(final SubLObject word) {
        return conses_high.member(word, (SubLObject)parse_tree.$list315, (SubLObject)parse_tree.$sym316$STRING_, (SubLObject)parse_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37272L)
    public static SubLObject rightmost_nominal_word(final SubLObject np, SubLObject i) {
        if (i == parse_tree.UNPROVIDED) {
            i = number_utilities.f_1_(methods.funcall_instance_method_with_0_args(np, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT));
        }
        while (parse_tree.NIL == word_tree.nominal_word_tree_p(methods.funcall_instance_method_with_1_args(np, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, i)) && !i.isZero()) {
            i = Numbers.subtract(i, (SubLObject)parse_tree.ONE_INTEGER);
        }
        return conflate_nominals(np, i);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 37678L)
    public static SubLObject nominal_words(final SubLObject np) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = (SubLObject)parse_tree.NIL;
        SubLObject next = number_utilities.f_1_(methods.funcall_instance_method_with_0_args(np, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT));
        while (parse_tree.NIL != subl_promotions.non_negative_integer_p(next)) {
            thread.resetMultipleValues();
            final SubLObject word = rightmost_nominal_word(np, next);
            final SubLObject i = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (parse_tree.NIL != word) {
                words = (SubLObject)ConsesLow.cons(word, words);
                next = number_utilities.f_1_(i);
            }
            else {
                next = (SubLObject)parse_tree.MINUS_ONE_INTEGER;
            }
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 38118L)
    public static SubLObject conflate_nominals(final SubLObject tree, final SubLObject start) {
        assert parse_tree.NIL != parse_tree_p(tree) : tree;
        assert parse_tree.NIL != subl_promotions.non_negative_integer_p(start) : start;
        final SubLObject word = methods.funcall_instance_method_with_1_args(tree, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, start);
        SubLObject conflated = (SubLObject)parse_tree.NIL;
        SubLObject i = start;
        SubLObject category = (SubLObject)parse_tree.NIL;
        SubLObject sister = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL != word_tree.nominal_word_tree_p(word)) {
            conflated = (SubLObject)ConsesLow.cons(word, conflated);
            category = methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym76$GET_CATEGORY);
            while (parse_tree.NIL != subl_promotions.positive_integer_p(i)) {
                i = Numbers.subtract(i, (SubLObject)parse_tree.ONE_INTEGER);
                sister = methods.funcall_instance_method_with_1_args(tree, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, i);
                if (methods.funcall_instance_method_with_0_args(sister, (SubLObject)parse_tree.$sym76$GET_CATEGORY).eql(category)) {
                    conflated = (SubLObject)ConsesLow.cons(sister, conflated);
                }
                else {
                    i = (SubLObject)parse_tree.ZERO_INTEGER;
                }
            }
        }
        if (Sequences.length(conflated).numG((SubLObject)parse_tree.ONE_INTEGER)) {
            return Values.values(word_tree.new_multi_noun_tree(conflated), number_utilities.f_1X(Numbers.subtract(start, Sequences.length(conflated))));
        }
        return Values.values(conflated.first(), number_utilities.f_1X(Numbers.subtract(start, Sequences.length(conflated))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39151L)
    public static SubLObject process_modifiers(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw153$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject sub = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(clear_modifiers(tree), stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(sub, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS);
            SubLObject modified = (SubLObject)parse_tree.NIL;
            modified = cdolist_list_var.first();
            while (parse_tree.NIL != cdolist_list_var) {
                set_parse_tree_modifiers(modified, (SubLObject)ConsesLow.cons(sub, get_parse_tree_modifiers(modified)));
                cdolist_list_var = cdolist_list_var.rest();
                modified = cdolist_list_var.first();
            }
            if (parse_tree.NIL != phrase_tree_p(sub)) {
                final SubLObject vector_var = get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                    element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39470L)
    public static SubLObject process_abs_index(final SubLObject tree) {
        SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym218$YIELD);
        SubLObject word = (SubLObject)parse_tree.NIL;
        word = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            word_tree.set_word_tree_abs_idx(word, i);
            i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 39628L)
    public static SubLObject retag_aux_verbs(final SubLObject tree) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym218$YIELD);
        SubLObject word = (SubLObject)parse_tree.NIL;
        word = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            if (parse_tree.NIL != word_tree.aux_verb_tree_p(word) && parse_tree.NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym148$GET_STRING), word_tree.$to_be_forms$.getGlobalValue(), (SubLObject)parse_tree.EQUALP, (SubLObject)parse_tree.UNPROVIDED) && parse_tree.NIL == methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym317$GET_VERBAL_COMPLEMENT)) {
                final SubLObject new_word = word_tree.new_word_tree(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym148$GET_STRING), cyclifier_interface.compute_main_verb_tag(word), methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym74$GET_MOTHER), methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym80$GET_INDEX), (SubLObject)parse_tree.NIL, methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym106$GET_CONTEXT));
                Vectors.set_aref(instances.get_slot(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym74$GET_MOTHER), (SubLObject)parse_tree.$sym186$DAUGHTERS), methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym80$GET_INDEX), new_word);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40247L)
    public static SubLObject clear_modifiers(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree.$kw153$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree.$kw254$DFL2R, (SubLObject)parse_tree.$kw153$DFR2L);
        SubLObject sub = (SubLObject)parse_tree.NIL;
        if (parse_tree.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree.EQ), (SubLObject)parse_tree.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree.$str163$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(tree, stack);
        while (parse_tree.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            set_parse_tree_modifiers(sub, (SubLObject)parse_tree.NIL);
            if (parse_tree.NIL != phrase_tree_p(sub)) {
                final SubLObject vector_var = get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree.$kw254$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
                    element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40437L)
    public static SubLObject quantify_existentially(final SubLObject formula, SubLObject v_variables) {
        if (v_variables == parse_tree.UNPROVIDED) {
            v_variables = el_utilities.sentence_free_variables(formula, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
        }
        SubLObject cycl = formula;
        SubLObject cdolist_list_var = v_variables;
        SubLObject var = (SubLObject)parse_tree.NIL;
        var = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            cycl = (SubLObject)ConsesLow.list(parse_tree.$const318$thereExists, var, cycl);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 40805L)
    public static SubLObject question_referents(final SubLObject tree) {
        assert parse_tree.NIL != parse_tree_p(tree) : tree;
        final SubLObject words = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym218$YIELD);
        SubLObject word_string = (SubLObject)parse_tree.NIL;
        SubLObject i = (SubLObject)parse_tree.ZERO_INTEGER;
        SubLObject question_referents = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)parse_tree.NIL;
        word = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            word_string = methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym148$GET_STRING);
            i = Numbers.add(i, (SubLObject)parse_tree.ONE_INTEGER);
            if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym74$GET_MOTHER) && parse_tree.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym74$GET_MOTHER), (SubLObject)parse_tree.$sym74$GET_MOTHER) && parse_tree.NIL == word_tree.relative_clause_p(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym74$GET_MOTHER), (SubLObject)parse_tree.$sym74$GET_MOTHER)) && parse_tree.NIL != conses_high.member(word_string, (SubLObject)parse_tree.$list319, (SubLObject)parse_tree.EQUALP, (SubLObject)parse_tree.UNPROVIDED)) {
                question_referents = ConsesLow.append(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym204$GET_REFS), question_referents);
            }
            else if (parse_tree.NIL != subl_promotions.memberP(word_string, (SubLObject)parse_tree.$list320, (SubLObject)parse_tree.EQUALP, (SubLObject)parse_tree.UNPROVIDED) && parse_tree.NIL != nominal_tree_p(ConsesLow.nth(i, words))) {
                question_referents = ConsesLow.append(methods.funcall_instance_method_with_0_args(ConsesLow.nth(i, words), (SubLObject)parse_tree.$sym204$GET_REFS), question_referents);
            }
            else if (word_string.equalp((SubLObject)parse_tree.$str321$what)) {
                question_referents = ConsesLow.append(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree.$sym204$GET_REFS), question_referents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return question_referents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
    public static SubLObject subloop_reserved_initialize_nominal_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
    public static SubLObject subloop_reserved_initialize_nominal_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 41809L)
    public static SubLObject nominal_phrase_tree_p(final SubLObject nominal_phrase_tree) {
        return classes.subloop_instanceof_class(nominal_phrase_tree, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 42891L)
    public static SubLObject nominal_phrase_tree_get_determiner_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym327$GET_DETERMINER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43127L)
    public static SubLObject nominal_phrase_tree_get_overt_quantifier_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym330$GET_OVERT_QUANTIFIER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43375L)
    public static SubLObject nominal_phrase_tree_get_quantifier_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym333$GET_QUANTIFIER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43611L)
    public static SubLObject nominal_phrase_tree_get_possessor_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym336$GET_POSSESSOR) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 43845L)
    public static SubLObject nominal_phrase_tree_get_specifier_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym339$GET_SPECIFIER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44079L)
    public static SubLObject nominal_phrase_tree_possessive_p_method(final SubLObject self) {
        return word_tree.possessive_word_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, number_utilities.f_1_(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44307L)
    public static SubLObject nominal_phrase_tree_temporal_tree_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        if (parse_tree.NIL != head) {
            return methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym110$TEMPORAL_TREE_P);
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44533L)
    public static SubLObject nominal_phrase_tree_definite_description_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head && parse_tree.NIL != nominal_tree_p(head)) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym347$DEFINITE_DESCRIPTION_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 44820L)
    public static SubLObject nominal_phrase_tree_name_tree_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)SubLObjectFactory.makeBoolean(parse_tree.NIL != head && parse_tree.NIL != word_tree.name_word_tree_p(head));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45035L)
    public static SubLObject nominal_phrase_tree_get_gender_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym353$GET_GENDER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45301L)
    public static SubLObject nominal_phrase_tree_get_number_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym356$GET_NUMBER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45554L)
    public static SubLObject nominal_phrase_tree_get_person_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym359$GET_PERSON) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45763L)
    public static SubLObject nominal_phrase_tree_singular_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym362$SINGULAR_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 45979L)
    public static SubLObject nominal_phrase_tree_plural_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym365$PLURAL_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 46189L)
    public static SubLObject nominal_phrase_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
        assert parse_tree.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : lexicon;
        final SubLObject vector_var = get_phrase_tree_daughters(self);
        final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
            element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym121$LEXIFY_INT, lexicon);
        }
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym347$DEFINITE_DESCRIPTION_P)) {
            final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
            SubLObject augmented_lexes = (SubLObject)parse_tree.NIL;
            if (parse_tree.NIL != head) {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym145$GET_RANKED_LEXES);
                SubLObject rle = (SubLObject)parse_tree.NIL;
                rle = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    final SubLObject lex = (SubLObject)((parse_tree.NIL != rle) ? methods.funcall_instance_method_with_0_args(cyclifier.rle_lex(rle), (SubLObject)parse_tree.$sym370$COPY) : parse_tree.NIL);
                    if (parse_tree.NIL == introduces_termP(lex)) {
                        final SubLObject instance = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym106$GET_CONTEXT), (SubLObject)parse_tree.$sym371$GET_INSTANCE, self);
                        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, (SubLObject)parse_tree.$sym223$GET, (SubLObject)parse_tree.$kw372$SEMTRANS);
                        methods.funcall_instance_method_with_2_args(lex, (SubLObject)parse_tree.$sym373$SET, (SubLObject)parse_tree.$kw372$SEMTRANS, simplifier.conjoin((SubLObject)ConsesLow.list(semtrans, (SubLObject)ConsesLow.list(parse_tree.$const374$equals, (SubLObject)parse_tree.$kw375$NOUN, instance)), (SubLObject)parse_tree.UNPROVIDED));
                        cyclifier.rle_set_confidence(rle, (SubLObject)parse_tree.ONE_INTEGER);
                    }
                    augmented_lexes = (SubLObject)ConsesLow.cons(rle, augmented_lexes);
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                instances.set_slot(head, (SubLObject)parse_tree.$sym376$LEXES, augmented_lexes);
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47439L)
    public static SubLObject presupposing_tree_p(final SubLObject tree) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)SubLObjectFactory.makeBoolean((parse_tree.NIL != head && parse_tree.NIL != word_tree.name_word_tree_p(head) && parse_tree.NIL != methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym362$SINGULAR_P)) || parse_tree.NIL != methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree.$sym347$DEFINITE_DESCRIPTION_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47683L)
    public static SubLObject introduces_termP(final SubLObject lex) {
        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, (SubLObject)parse_tree.$sym223$GET, (SubLObject)parse_tree.$kw372$SEMTRANS);
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_operator(semtrans).eql(parse_tree.$const374$equals) && cycl_utilities.formula_arg1(semtrans, (SubLObject)parse_tree.UNPROVIDED).eql((SubLObject)parse_tree.$kw375$NOUN));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47877L)
    public static SubLObject lex_entry_sem_equal(final SubLObject lex1, final SubLObject lex2) {
        return Equality.equal(methods.funcall_instance_method_with_1_args(lex1, (SubLObject)parse_tree.$sym223$GET, (SubLObject)parse_tree.$kw372$SEMTRANS), methods.funcall_instance_method_with_1_args(lex2, (SubLObject)parse_tree.$sym223$GET, (SubLObject)parse_tree.$kw372$SEMTRANS));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 47995L)
    public static SubLObject nominal_phrase_tree_get_head_daughters_method(final SubLObject self) {
        if (methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT).numE((SubLObject)parse_tree.TWO_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)parse_tree.$sym76$GET_CATEGORY).eql((SubLObject)parse_tree.$kw208$_) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ONE_INTEGER), (SubLObject)parse_tree.$sym76$GET_CATEGORY).eql((SubLObject)parse_tree.$kw379$CD)) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER));
        }
        if (methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT).numE((SubLObject)parse_tree.ONE_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)parse_tree.$sym76$GET_CATEGORY).eql((SubLObject)parse_tree.$kw379$CD)) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER));
        }
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym380$COORDINATE_PHRASE_P)) {
            return methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P);
        }
        if (methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT).numE((SubLObject)parse_tree.TWO_INTEGER) && parse_tree.NIL != word_tree.vbg_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ONE_INTEGER)) && parse_tree.NIL != word_tree.determiner_word_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER))) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ONE_INTEGER));
        }
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym221$PRETERMINAL_P)) {
            final SubLObject head_daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym382$NOMINAL_WORD_TREE_P);
            return (SubLObject)((parse_tree.NIL != head_daughter) ? ConsesLow.list(head_daughter) : parse_tree.NIL);
        }
        SubLObject head_daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym382$NOMINAL_WORD_TREE_P);
        if (parse_tree.NIL != head_daughter) {
            return (SubLObject)ConsesLow.list(head_daughter);
        }
        head_daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym383$NOMINAL_PHRASE_TREE_P);
        return (SubLObject)((parse_tree.NIL != head_daughter) ? ConsesLow.list(head_daughter) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
    public static SubLObject subloop_reserved_initialize_np_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
    public static SubLObject subloop_reserved_initialize_np_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49292L)
    public static SubLObject np_tree_p(final SubLObject np_tree) {
        return classes.subloop_instanceof_class(np_tree, (SubLObject)parse_tree.$sym385$NP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
    public static SubLObject subloop_reserved_initialize_npp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
    public static SubLObject subloop_reserved_initialize_npp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49347L)
    public static SubLObject npp_tree_p(final SubLObject npp_tree) {
        return classes.subloop_instanceof_class(npp_tree, (SubLObject)parse_tree.$sym388$NPP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
    public static SubLObject subloop_reserved_initialize_nx_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
    public static SubLObject subloop_reserved_initialize_nx_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49405L)
    public static SubLObject nx_tree_p(final SubLObject nx_tree) {
        return classes.subloop_instanceof_class(nx_tree, (SubLObject)parse_tree.$sym391$NX_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
    public static SubLObject subloop_reserved_initialize_pnp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
    public static SubLObject subloop_reserved_initialize_pnp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49460L)
    public static SubLObject pnp_tree_p(final SubLObject pnp_tree) {
        return classes.subloop_instanceof_class(pnp_tree, (SubLObject)parse_tree.$sym394$PNP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49570L)
    public static SubLObject pnp_tree_get_head_daughters_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
    public static SubLObject subloop_reserved_initialize_whnp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
    public static SubLObject subloop_reserved_initialize_whnp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49742L)
    public static SubLObject whnp_tree_p(final SubLObject whnp_tree) {
        return classes.subloop_instanceof_class(whnp_tree, (SubLObject)parse_tree.$sym400$WHNP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject verbal_phrase_tree_cyclify_int_vp_coordination_method(final SubLObject self) {
        final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
        if (parse_tree.NIL != scycls) {
            return scycls;
        }
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
        final SubLObject subj_cycls = (SubLObject)((parse_tree.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)parse_tree.$sym126$CYCLIFY_INT) : parse_tree.NIL);
        final SubLObject conjunction = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym212$GET_CONJUNCTION);
        final SubLObject vps = methods.funcall_instance_method_with_0_args(conjunction, (SubLObject)parse_tree.$sym96$GET_COMPLEMENTS);
        SubLObject cycls = (SubLObject)parse_tree.NIL;
        SubLObject cdolist_list_var = vps;
        SubLObject vp = (SubLObject)parse_tree.NIL;
        vp = cdolist_list_var.first();
        while (parse_tree.NIL != cdolist_list_var) {
            cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(vp, (SubLObject)parse_tree.$sym410$CYCLIFY_INT_VP), cycls);
            cdolist_list_var = cdolist_list_var.rest();
            vp = cdolist_list_var.first();
        }
        return Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(subj_cycls, cycls)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject verbal_phrase_tree_cyclify_int_vp_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
        if (parse_tree.NIL != scycls) {
            return scycls;
        }
        final SubLObject heads = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS);
        SubLObject all_conjunction_cycls = (SubLObject)parse_tree.NIL;
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
        SubLObject complements = (SubLObject)((parse_tree.NIL != heads) ? methods.funcall_instance_method_with_0_args(heads.first(), (SubLObject)parse_tree.$sym413$GET_SEMANTIC_COMPLEMENTS) : parse_tree.NIL);
        SubLObject comp_cycls = (SubLObject)parse_tree.NIL;
        SubLObject cycls = (SubLObject)parse_tree.NIL;
        complements = cyclifier_interface.delete_cyclifiable(subject, complements);
        if (parse_tree.NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), (SubLObject)parse_tree.EQ, (SubLObject)parse_tree.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            try {
                cyclifier_interface.$cyclification_in_progress$.bind((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                cyclifier_interface.$cyclification_in_progress$.bind(ConsesLow.append(heads, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                SubLObject cdolist_list_var = heads;
                SubLObject head = (SubLObject)parse_tree.NIL;
                head = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    SubLObject all_head_cycls = (SubLObject)parse_tree.NIL;
                    final SubLObject mod_cycls = cyclifier_interface.get_mod_cycls(head);
                    SubLObject cdolist_list_var_$10;
                    final SubLObject renamings = cdolist_list_var_$10 = methods.funcall_instance_method_with_1_args(head, (SubLObject)parse_tree.$sym414$GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym145$GET_RANKED_LEXES)));
                    SubLObject conjunction = (SubLObject)parse_tree.NIL;
                    conjunction = cdolist_list_var_$10.first();
                    while (parse_tree.NIL != cdolist_list_var_$10) {
                        SubLObject all_rle_cycls = (SubLObject)parse_tree.NIL;
                        SubLObject cdolist_list_var_$11 = methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym145$GET_RANKED_LEXES);
                        SubLObject rle = (SubLObject)parse_tree.NIL;
                        rle = cdolist_list_var_$11.first();
                        while (parse_tree.NIL != cdolist_list_var_$11) {
                            SubLObject composite_verbal_cycls = (SubLObject)parse_tree.NIL;
                            SubLObject cdolist_list_var_$12 = conjunction;
                            SubLObject renaming = (SubLObject)parse_tree.NIL;
                            renaming = cdolist_list_var_$12.first();
                            while (parse_tree.NIL != cdolist_list_var_$12) {
                                final SubLObject renamed0 = cyclifier_interface.apply_lex_renaming(head, rle, renaming);
                                final SubLObject renamed2 = (SubLObject)((parse_tree.NIL != renamed0) ? ConsesLow.list(cyclifier.quantify_implicit_subject(renamed0)) : parse_tree.NIL);
                                composite_verbal_cycls = list_utilities.alist_pushnew(composite_verbal_cycls, cyclifier_interface.renaming_key(renaming), Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(renamed2, mod_cycls))), (SubLObject)parse_tree.EQL, (SubLObject)parse_tree.UNPROVIDED);
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                renaming = cdolist_list_var_$12.first();
                            }
                            SubLObject sense_cycls = (SubLObject)parse_tree.NIL;
                            SubLObject cdolist_list_var_$13 = list_utilities.alist_values(composite_verbal_cycls);
                            SubLObject value = (SubLObject)parse_tree.NIL;
                            value = cdolist_list_var_$13.first();
                            while (parse_tree.NIL != cdolist_list_var_$13) {
                                sense_cycls = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products(value)), sense_cycls);
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                value = cdolist_list_var_$13.first();
                            }
                            all_rle_cycls = (SubLObject)ConsesLow.cons(sense_cycls, all_rle_cycls);
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            rle = cdolist_list_var_$11.first();
                        }
                        all_head_cycls = (SubLObject)ConsesLow.cons(list_utilities.indexed_products(all_rle_cycls), all_head_cycls);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        conjunction = cdolist_list_var_$10.first();
                    }
                    all_conjunction_cycls = (SubLObject)ConsesLow.cons(all_head_cycls, all_conjunction_cycls);
                    cdolist_list_var = cdolist_list_var.rest();
                    head = cdolist_list_var.first();
                }
                cdolist_list_var = complements;
                SubLObject complement = (SubLObject)parse_tree.NIL;
                complement = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, (SubLObject)parse_tree.$sym126$CYCLIFY_INT);
                    if (parse_tree.NIL != comp_cycl) {
                        comp_cycls = (SubLObject)ConsesLow.cons(comp_cycl, comp_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                }
                cdolist_list_var = list_utilities.indexed_products(all_conjunction_cycls);
                SubLObject all_head_cycls2 = (SubLObject)parse_tree.NIL;
                all_head_cycls2 = cdolist_list_var.first();
                while (parse_tree.NIL != cdolist_list_var) {
                    SubLObject cycls2 = (SubLObject)parse_tree.NIL;
                    SubLObject all_subjects_with_objects_cycls = (SubLObject)parse_tree.NIL;
                    SubLObject cdolist_list_var_$14 = list_utilities.indexed_products(all_head_cycls2);
                    SubLObject item = (SubLObject)parse_tree.NIL;
                    item = cdolist_list_var_$14.first();
                    while (parse_tree.NIL != cdolist_list_var_$14) {
                        SubLObject complete_cycl_for_one_subject = (SubLObject)parse_tree.NIL;
                        SubLObject cdolist_list_var_$15 = list_utilities.cross_products(item);
                        SubLObject item2 = (SubLObject)parse_tree.NIL;
                        item2 = cdolist_list_var_$15.first();
                        while (parse_tree.NIL != cdolist_list_var_$15) {
                            complete_cycl_for_one_subject = ConsesLow.append(Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products(item2)), complete_cycl_for_one_subject);
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            item2 = cdolist_list_var_$15.first();
                        }
                        all_subjects_with_objects_cycls = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.cross_products((SubLObject)ConsesLow.cons(complete_cycl_for_one_subject, comp_cycls))), all_subjects_with_objects_cycls);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        item = cdolist_list_var_$14.first();
                    }
                    cycls2 = Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.indexed_products(all_subjects_with_objects_cycls));
                    cycls = ConsesLow.append(cycls2, cycls);
                    cdolist_list_var = cdolist_list_var.rest();
                    all_head_cycls2 = cdolist_list_var.first();
                }
            }
            finally {
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_2, thread);
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
            }
        }
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject verbal_phrase_tree_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree.NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread) || parse_tree.NIL == conses_high.member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), (SubLObject)parse_tree.EQ, (SubLObject)parse_tree.UNPROVIDED)) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue((SubLObject)ConsesLow.cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
            if (parse_tree.NIL != scycls) {
                return scycls;
            }
            if (parse_tree.NIL != cyclifier_interface.cyclifiable_sentential_phrase_p(self)) {
                final SubLObject head_dtr = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym192$GET_HEAD_DAUGHTER);
                if (parse_tree.NIL != head_dtr) {
                    return methods.funcall_instance_method_with_0_args(head_dtr, (SubLObject)parse_tree.$sym126$CYCLIFY_INT);
                }
            }
            else {
                if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym417$VP_COORDINATE_PHRASE_P)) {
                    return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym407$CYCLIFY_INT_VP_COORDINATION);
                }
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
                final SubLObject subj_cycls = (SubLObject)((parse_tree.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)parse_tree.$sym126$CYCLIFY_INT) : parse_tree.NIL);
                final SubLObject vp_cycls = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym410$CYCLIFY_INT_VP);
                SubLObject subj_vp_cycls = (SubLObject)((parse_tree.NIL != subj_cycls) ? ConsesLow.list(subj_cycls) : parse_tree.NIL);
                if (parse_tree.NIL != vp_cycls) {
                    subj_vp_cycls = (SubLObject)ConsesLow.cons(vp_cycls, subj_vp_cycls);
                }
                return Mapping.mapcar((SubLObject)parse_tree.$sym243$INSTANTIATE_SCOPE, list_utilities.cross_products(subj_vp_cycls));
            }
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject verbal_phrase_tree_vp_coordinate_phrase_p_method(final SubLObject self) {
        final SubLObject conjunction = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym212$GET_CONJUNCTION);
        return (SubLObject)SubLObjectFactory.makeBoolean(parse_tree.NIL != conjunction && parse_tree.NIL == list_utilities.member_if_not((SubLObject)parse_tree.$sym420$CYCLIFIABLE_VERB_PHRASE_P, methods.funcall_instance_method_with_0_args(conjunction, (SubLObject)parse_tree.$sym96$GET_COMPLEMENTS), (SubLObject)parse_tree.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject subloop_reserved_initialize_verbal_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject subloop_reserved_initialize_verbal_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 49821L)
    public static SubLObject verbal_phrase_tree_p(final SubLObject verbal_phrase_tree) {
        return classes.subloop_instanceof_class(verbal_phrase_tree, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51311L)
    public static SubLObject verbal_phrase_tree_get_predicate_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym92$GET_SEMANTIC_HEAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51477L)
    public static SubLObject verbal_phrase_tree_get_number_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym356$GET_NUMBER) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51729L)
    public static SubLObject verbal_phrase_tree_get_person_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym359$GET_PERSON) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 51935L)
    public static SubLObject verbal_phrase_tree_get_tense_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym431$GET_TENSE) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52179L)
    public static SubLObject verbal_phrase_tree_get_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject idx = get_parse_tree_idx(self);
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD);
            try {
                if (parse_tree.NIL != mother) {
                    SubLObject subject = methods.funcall_instance_method_with_2_args(mother, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P, number_utilities.f_1_(idx));
                    if (parse_tree.NIL == subject && parse_tree.NIL != verbal_tree_p(mother)) {
                        subject = methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
                    }
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, subject);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_idx(self, idx);
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52516L)
    public static SubLObject verbal_phrase_tree_get_objects_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym437$GET_OBJECTS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52741L)
    public static SubLObject verbal_phrase_tree_get_direct_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym440$GET_DIRECT_OBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 52971L)
    public static SubLObject verbal_phrase_tree_get_indirect_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym443$GET_INDIRECT_OBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53207L)
    public static SubLObject verbal_phrase_tree_get_semantic_direct_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym446$GET_SEMANTIC_DIRECT_OBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53464L)
    public static SubLObject verbal_phrase_tree_get_semantic_indirect_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym449$GET_SEMANTIC_INDIRECT_OBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53727L)
    public static SubLObject verbal_phrase_tree_get_semantic_subject_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym92$GET_SEMANTIC_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym452$GET_SEMANTIC_SUBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 53975L)
    public static SubLObject verbal_phrase_tree_get_semantic_objects_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym92$GET_SEMANTIC_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym455$GET_SEMANTIC_OBJECTS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54225L)
    public static SubLObject verbal_phrase_tree_get_verbal_complement_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym317$GET_VERBAL_COMPLEMENT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54470L)
    public static SubLObject verbal_phrase_tree_copula_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != cyclifier_interface.aux_verb_word_p(head)) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym460$COPULA_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54719L)
    public static SubLObject verbal_phrase_tree_dummy_to_p_method(final SubLObject self) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parse_tree.NIL != word_tree.verbal_word_tree_p(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD)) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)parse_tree.$sym148$GET_STRING).equal((SubLObject)parse_tree.$str465$to));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 54994L)
    public static SubLObject verbal_phrase_tree_passive_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym467$PASSIVE_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55228L)
    public static SubLObject verbal_phrase_tree_finite_p_method(final SubLObject self) {
        return finite_verbal_word_tree_p(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55418L)
    public static SubLObject verbal_phrase_tree_partition_semantic_complements_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym473$PARTITION_SEMANTIC_COMPLEMENTS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 55970L)
    public static SubLObject verbal_phrase_tree_get_ancestor_objects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_phrase_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD);
            try {
                if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym479$INVERTED_P)) {
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, (SubLObject)((parse_tree.NIL != verbal_phrase_tree_p(mother)) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS) : parse_tree.NIL));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD, ConsesLow.append((SubLObject)((parse_tree.NIL != verbal_phrase_tree_p(mother)) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS) : parse_tree.NIL), methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P)));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56378L)
    public static SubLObject verbal_phrase_tree_get_head_daughters_method(final SubLObject self) {
        final SubLObject head_daughters = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym482$VERBAL_WORD_TREE_P);
        return (parse_tree.NIL != head_daughters) ? head_daughters : methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym483$VERBAL_PHRASE_TREE_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56662L)
    public static SubLObject verbal_phrase_tree_inverted_p_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym479$INVERTED_P) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
    public static SubLObject subloop_reserved_initialize_sentential_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
    public static SubLObject subloop_reserved_initialize_sentential_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 56884L)
    public static SubLObject sentential_tree_p(final SubLObject sentential_tree) {
        return classes.subloop_instanceof_class(sentential_tree, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 57048L)
    public static SubLObject sentential_tree_get_subject_method(final SubLObject self) {
        if (parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym479$INVERTED_P)) {
            final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
            final SubLObject head_mother = (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym74$GET_MOTHER) : parse_tree.NIL);
            if (parse_tree.NIL != head_mother) {
                return methods.funcall_instance_method_with_2_args(head_mother, (SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P, number_utilities.f_1X(methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym80$GET_INDEX)));
            }
        }
        else {
            final SubLObject subject = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P);
            if (parse_tree.NIL != subject) {
                return subject;
            }
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym87$GET_ANCESTORS);
            SubLObject ancestor = (SubLObject)parse_tree.NIL;
            ancestor = cdolist_list_var.first();
            while (parse_tree.NIL != cdolist_list_var) {
                if (parse_tree.NIL != verbal_tree_p(ancestor)) {
                    return methods.funcall_instance_method_with_0_args(ancestor, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ancestor = cdolist_list_var.first();
            }
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 57627L)
    public static SubLObject sentential_tree_get_modifieds_method(final SubLObject self) {
        if (parse_tree.NIL != word_tree.relative_clause_p(self)) {
            final SubLObject first_daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER);
            final SubLObject first_head = (SubLObject)((parse_tree.NIL != word_tree.word_tree_p(first_daughter)) ? methods.funcall_instance_method_with_0_args(first_daughter, (SubLObject)parse_tree.$sym98$GET_HEAD) : parse_tree.NIL);
            final SubLObject modified = (SubLObject)((parse_tree.NIL != word_tree.wp_tree_p(first_head)) ? methods.funcall_instance_method_with_0_args(first_head, (SubLObject)parse_tree.$sym495$GET_ANTECEDENT) : parse_tree.NIL);
            final SubLObject mod_head = (SubLObject)((parse_tree.NIL != word_tree.word_tree_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, (SubLObject)parse_tree.$sym98$GET_HEAD) : parse_tree.NIL);
            return (SubLObject)((parse_tree.NIL != mod_head) ? ConsesLow.list(mod_head) : parse_tree.NIL);
        }
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
    public static SubLObject subloop_reserved_initialize_vp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
    public static SubLObject subloop_reserved_initialize_vp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58147L)
    public static SubLObject vp_tree_p(final SubLObject vp_tree) {
        return classes.subloop_instanceof_class(vp_tree, (SubLObject)parse_tree.$sym497$VP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
    public static SubLObject subloop_reserved_initialize_vg_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
    public static SubLObject subloop_reserved_initialize_vg_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58201L)
    public static SubLObject vg_tree_p(final SubLObject vg_tree) {
        return classes.subloop_instanceof_class(vg_tree, (SubLObject)parse_tree.$sym500$VG_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
    public static SubLObject subloop_reserved_initialize_s1_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
    public static SubLObject subloop_reserved_initialize_s1_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58255L)
    public static SubLObject s1_tree_p(final SubLObject s1_tree) {
        return classes.subloop_instanceof_class(s1_tree, (SubLObject)parse_tree.$sym503$S1_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
    public static SubLObject subloop_reserved_initialize_s_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
    public static SubLObject subloop_reserved_initialize_s_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58302L)
    public static SubLObject s_tree_p(final SubLObject s_tree) {
        return classes.subloop_instanceof_class(s_tree, (SubLObject)parse_tree.$sym506$S_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58408L)
    public static SubLObject s_tree_get_ancestor_objects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_s_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym511$OUTER_CATCH_FOR_S_TREE_METHOD);
            try {
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym409$GET_SUBJECT);
                if (parse_tree.NIL != subject && parse_tree.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym479$INVERTED_P)) {
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym511$OUTER_CATCH_FOR_S_TREE_METHOD, (SubLObject)ConsesLow.list(subject));
                }
                else if (parse_tree.NIL != mother && parse_tree.NIL != word_tree.relative_clause_p(mother)) {
                    Dynamic.sublisp_throw((SubLObject)parse_tree.$sym511$OUTER_CATCH_FOR_S_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_s_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym511$OUTER_CATCH_FOR_S_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_s_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
    public static SubLObject subloop_reserved_initialize_sbar_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
    public static SubLObject subloop_reserved_initialize_sbar_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58763L)
    public static SubLObject sbar_tree_p(final SubLObject sbar_tree) {
        return classes.subloop_instanceof_class(sbar_tree, (SubLObject)parse_tree.$sym513$SBAR_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
    public static SubLObject subloop_reserved_initialize_sbarq_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
    public static SubLObject subloop_reserved_initialize_sbarq_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 58816L)
    public static SubLObject sbarq_tree_p(final SubLObject sbarq_tree) {
        return classes.subloop_instanceof_class(sbarq_tree, (SubLObject)parse_tree.$sym516$SBARQ_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59014L)
    public static SubLObject sbarq_tree_get_head_daughters_method(final SubLObject self) {
        final SubLObject head_daughter = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym522$VERBAL_TREE_P);
        return (SubLObject)((parse_tree.NIL != head_daughter) ? ConsesLow.list(head_daughter) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59255L)
    public static SubLObject sbarq_tree_get_ancestor_objects_method(final SubLObject self) {
        return Sequences.delete(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym409$GET_SUBJECT), methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P), (SubLObject)parse_tree.EQ, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
    public static SubLObject subloop_reserved_initialize_sq_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
    public static SubLObject subloop_reserved_initialize_sq_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59482L)
    public static SubLObject sq_tree_p(final SubLObject sq_tree) {
        return classes.subloop_instanceof_class(sq_tree, (SubLObject)parse_tree.$sym526$SQ_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59620L)
    public static SubLObject sq_tree_get_ancestor_objects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sq_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD, ConsesLow.append(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym381$NOMINAL_TREE_P).rest(), (SubLObject)((parse_tree.NIL != verbal_phrase_tree_p(mother)) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS) : parse_tree.NIL)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sq_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sq_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
    public static SubLObject subloop_reserved_initialize_sinv_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
    public static SubLObject subloop_reserved_initialize_sinv_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59901L)
    public static SubLObject sinv_tree_p(final SubLObject sinv_tree) {
        return classes.subloop_instanceof_class(sinv_tree, (SubLObject)parse_tree.$sym533$SINV_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 59957L)
    public static SubLObject prepositional_or_particle_phrase_tree_p(final SubLObject prepositional_or_particle_phrase_tree) {
        return classes.subloop_instanceof_class(prepositional_or_particle_phrase_tree, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60222L)
    public static SubLObject prepositional_or_particle_phrase_tree_get_head_daughters_method(final SubLObject self) {
        if (parse_tree.NIL != word_tree.vbg_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER))) {
            return (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER));
        }
        return ConsesLow.append(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym541$PREPOSITIONAL_TREE_P), methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym542$PARTICLE_TREE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60658L)
    public static SubLObject prepositional_or_particle_phrase_tree_get_oblique_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym544$GET_OBLIQUE_OBJECT) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 60936L)
    public static SubLObject prepositional_or_particle_phrase_tree_stranded_p_method(final SubLObject self) {
        return (SubLObject)SubLObjectFactory.makeBoolean(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT).numE((SubLObject)parse_tree.ONE_INTEGER) && parse_tree.NIL != word_tree.prepositional_or_particle_word_tree_p(methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
    public static SubLObject subloop_reserved_initialize_prepositional_phrase_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
    public static SubLObject subloop_reserved_initialize_prepositional_phrase_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61250L)
    public static SubLObject prepositional_phrase_tree_p(final SubLObject prepositional_phrase_tree) {
        return classes.subloop_instanceof_class(prepositional_phrase_tree, (SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
    public static SubLObject subloop_reserved_initialize_pp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
    public static SubLObject subloop_reserved_initialize_pp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61405L)
    public static SubLObject pp_tree_p(final SubLObject pp_tree) {
        return classes.subloop_instanceof_class(pp_tree, (SubLObject)parse_tree.$sym554$PP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
    public static SubLObject subloop_reserved_initialize_whpp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
    public static SubLObject subloop_reserved_initialize_whpp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61466L)
    public static SubLObject whpp_tree_p(final SubLObject whpp_tree) {
        return classes.subloop_instanceof_class(whpp_tree, (SubLObject)parse_tree.$sym557$WHPP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
    public static SubLObject subloop_reserved_initialize_prt_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
    public static SubLObject subloop_reserved_initialize_prt_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61551L)
    public static SubLObject prt_tree_p(final SubLObject prt_tree) {
        return classes.subloop_instanceof_class(prt_tree, (SubLObject)parse_tree.$sym560$PRT_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61730L)
    public static SubLObject prt_tree_get_head_daughters_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym542$PARTICLE_TREE_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
    public static SubLObject subloop_reserved_initialize_adjp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
    public static SubLObject subloop_reserved_initialize_adjp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 61920L)
    public static SubLObject adjp_tree_p(final SubLObject adjp_tree) {
        return classes.subloop_instanceof_class(adjp_tree, (SubLObject)parse_tree.$sym566$ADJP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62075L)
    public static SubLObject adjp_tree_get_head_daughters_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym571$ADJECTIVAL_TREE_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62240L)
    public static SubLObject adjp_tree_get_modifieds_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym98$GET_HEAD);
        return (SubLObject)((parse_tree.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
    public static SubLObject subloop_reserved_initialize_whadjp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
    public static SubLObject subloop_reserved_initialize_whadjp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62440L)
    public static SubLObject whadjp_tree_p(final SubLObject whadjp_tree) {
        return classes.subloop_instanceof_class(whadjp_tree, (SubLObject)parse_tree.$sym575$WHADJP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 62560L)
    public static SubLObject whadjp_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
        assert parse_tree.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : lexicon;
        final SubLObject vector_var = get_phrase_tree_daughters(self);
        final SubLObject backwardP_var = (SubLObject)parse_tree.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree.NIL, v_iteration = (SubLObject)parse_tree.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree.ONE_INTEGER)) {
            element_num = ((parse_tree.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            methods.funcall_instance_method_with_1_args(daughter, (SubLObject)parse_tree.$sym121$LEXIFY_INT, lexicon);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
    public static SubLObject subloop_reserved_initialize_advp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
    public static SubLObject subloop_reserved_initialize_advp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63032L)
    public static SubLObject advp_tree_p(final SubLObject advp_tree) {
        return classes.subloop_instanceof_class(advp_tree, (SubLObject)parse_tree.$sym581$ADVP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63186L)
    public static SubLObject advp_tree_get_head_daughters_method(final SubLObject self) {
        final SubLObject head_dtr = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym586$ADVERBIAL_TREE_P);
        return (SubLObject)((parse_tree.NIL != head_dtr) ? ConsesLow.list(head_dtr) : parse_tree.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
    public static SubLObject subloop_reserved_initialize_whadvp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
    public static SubLObject subloop_reserved_initialize_whadvp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63423L)
    public static SubLObject whadvp_tree_p(final SubLObject whadvp_tree) {
        return classes.subloop_instanceof_class(whadvp_tree, (SubLObject)parse_tree.$sym588$WHADVP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
    public static SubLObject subloop_reserved_initialize_frag_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
    public static SubLObject subloop_reserved_initialize_frag_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63494L)
    public static SubLObject frag_tree_p(final SubLObject frag_tree) {
        return classes.subloop_instanceof_class(frag_tree, (SubLObject)parse_tree.$sym591$FRAG_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
    public static SubLObject subloop_reserved_initialize_qp_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym62$INSTANCE_COUNT, (SubLObject)parse_tree.ZERO_INTEGER);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
    public static SubLObject subloop_reserved_initialize_qp_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym64$ISOLATED_P, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$sym65$INSTANCE_NUMBER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym24$STRING, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym23$CATEGORY, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym22$MOTHER, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym21$IDX, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym20$MODIFIERS, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym19$CONTEXT, (SubLObject)parse_tree.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym186$DAUGHTERS, (SubLObject)parse_tree.NIL);
        return (SubLObject)parse_tree.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63560L)
    public static SubLObject qp_tree_p(final SubLObject qp_tree) {
        return classes.subloop_instanceof_class(qp_tree, (SubLObject)parse_tree.$sym594$QP_TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63806L)
    public static SubLObject qp_tree_get_head_daughters_method(final SubLObject self) {
        return phrase_tree_find_method(self, (SubLObject)parse_tree.$sym600$CARDINAL_WORD_TREE_P, (SubLObject)parse_tree.UNPROVIDED, (SubLObject)parse_tree.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 63974L)
    public static SubLObject qp_tree_get_quantified_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_qp_tree_method = (SubLObject)parse_tree.NIL;
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree.$sym604$OUTER_CATCH_FOR_QP_TREE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)parse_tree.$sym604$OUTER_CATCH_FOR_QP_TREE_METHOD, (SubLObject)((parse_tree.NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, (SubLObject)parse_tree.$sym98$GET_HEAD) : parse_tree.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_qp_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree.$sym604$OUTER_CATCH_FOR_QP_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_qp_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parse-tree.lisp", position = 64171L)
    public static SubLObject qp_tree_cyclify_int_method(final SubLObject self) {
        final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
        if (parse_tree.NIL != scycls) {
            return scycls;
        }
        SubLObject cycls = (SubLObject)parse_tree.NIL;
        final SubLObject number = numeral_parser.string_to_interval(methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym148$GET_STRING));
        final SubLObject quantified = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree.$sym602$GET_QUANTIFIED);
        final SubLObject restrictions = (SubLObject)((parse_tree.NIL != quantified) ? methods.funcall_instance_method_with_0_args(quantified, (SubLObject)parse_tree.$sym607$CYCLIFY_NUCLEUS) : parse_tree.NIL);
        final SubLObject variable = (SubLObject)((parse_tree.NIL != quantified) ? methods.funcall_instance_method_with_0_args(quantified, (SubLObject)parse_tree.$sym204$GET_REFS).first() : parse_tree.NIL);
        if (parse_tree.NIL != number) {
            SubLObject cdolist_list_var = restrictions;
            SubLObject restriction = (SubLObject)parse_tree.NIL;
            restriction = cdolist_list_var.first();
            while (parse_tree.NIL != cdolist_list_var) {
                cycls = (SubLObject)ConsesLow.cons(cyclifier.new_cyclification((SubLObject)ConsesLow.list(parse_tree.$const608$thereExistAtLeast, number, variable, (SubLObject)ConsesLow.listS(parse_tree.$const609$and, restriction, (SubLObject)parse_tree.$list610)), self, (SubLObject)parse_tree.ONE_INTEGER), cycls);
                cdolist_list_var = cdolist_list_var.rest();
                restriction = cdolist_list_var.first();
            }
        }
        return cycls;
    }
    
    public static SubLObject declare_parse_tree_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_tree_p", "NOMINAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_tree_p", "VERBAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "adverbial_tree_p", "ADVERBIAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_tree_p", "PREPOSITIONAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "particle_tree_p", "PARTICLE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "adjectival_tree_p", "ADJECTIVAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "question_tree_p", "QUESTION-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "wh_tree_p", "WH-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "numerical_tree_p", "NUMERICAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "finite_verbal_word_tree_p", "FINITE-VERBAL-WORD-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "quantifier_tree_p", "QUANTIFIER-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pronoun_tree_p", "PRONOUN-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_context", "GET-PARSE-TREE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_context", "SET-PARSE-TREE-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_modifiers", "GET-PARSE-TREE-MODIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_modifiers", "SET-PARSE-TREE-MODIFIERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_idx", "GET-PARSE-TREE-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_idx", "SET-PARSE-TREE-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_mother", "GET-PARSE-TREE-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_mother", "SET-PARSE-TREE-MOTHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_category", "GET-PARSE-TREE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_category", "SET-PARSE-TREE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_parse_tree_string", "GET-PARSE-TREE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_parse_tree_string", "SET-PARSE-TREE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_cyclifier_method", "PARSE-TREE-GET-CYCLIFIER-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_cyclify_method", "PARSE-TREE-CYCLIFY-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_parse_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_parse_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_p", "PARSE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_deep_copy_method", "PARSE-TREE-DEEP-COPY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_root_method", "PARSE-TREE-GET-ROOT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_category_method", "PARSE-TREE-GET-CATEGORY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_index_method", "PARSE-TREE-GET-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_path_method", "PARSE-TREE-GET-PATH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_mother_method", "PARSE-TREE-GET-MOTHER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_semantic_head_method", "PARSE-TREE-GET-SEMANTIC-HEAD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_complements_method", "PARSE-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_modifiers_method", "PARSE-TREE-GET-MODIFIERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_modifieds_method", "PARSE-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_context_method", "PARSE-TREE-GET-CONTEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_temporal_tree_p_method", "PARSE-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_cyclifiable_question_p_method", "PARSE-TREE-CYCLIFIABLE-QUESTION-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_root_p_method", "PARSE-TREE-ROOT-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_lexify_method", "PARSE-TREE-LEXIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_lexify_int_method", "PARSE-TREE-LEXIFY-INT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_cyclify_int_method", "PARSE-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_ancestors_method", "PARSE-TREE-GET-ANCESTORS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_get_sister_method", "PARSE-TREE-GET-SISTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_tree_print_method", "PARSE-TREE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pprint_word_tree", "PPRINT-WORD-TREE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pprint_parse_tree", "PPRINT-PARSE-TREE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "new_parse_tree", "NEW-PARSE-TREE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "new_parse_tree_int", "NEW-PARSE-TREE-INT", 1, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parse_tree", "do_parse_tree_subtrees", "DO-PARSE-TREE-SUBTREES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parse_tree", "do_parse_tree_word_trees", "DO-PARSE-TREE-WORD-TREES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "get_phrase_tree_daughters", "GET-PHRASE-TREE-DAUGHTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "set_phrase_tree_daughters", "SET-PHRASE-TREE-DAUGHTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_p", "PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_head_daughters_method", "PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_head_daughter_method", "PHRASE-TREE-GET-HEAD-DAUGHTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_head_method", "PHRASE-TREE-GET-HEAD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_semantic_head_daughters_method", "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_semantic_head_daughter_method", "PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_refs_method", "PHRASE-TREE-GET-REFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_modifiers_method", "PHRASE-TREE-GET-MODIFIERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_conjunction_method", "PHRASE-TREE-GET-CONJUNCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_lexify_int_method", "PHRASE-TREE-LEXIFY-INT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_retokenize_method", "PHRASE-TREE-RETOKENIZE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_retokenize_int_method", "PHRASE-TREE-RETOKENIZE-INT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_partial_retokenize_int_method", "PHRASE-TREE-PARTIAL-RETOKENIZE-INT-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_adjacent_daughters_have_lexical_entry_method", "PHRASE-TREE-ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_cyclify_int_method", "PHRASE-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "parse_expression_to_phrase_tree", "PARSE-EXPRESSION-TO-PHRASE-TREE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "tree_for_category", "TREE-FOR-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pprint_phrase_tree", "PPRINT-PHRASE-TREE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_string_method", "PHRASE-TREE-GET-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_string", "PHRASE-TREE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_yield_method", "PHRASE-TREE-YIELD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_yield", "PHRASE-TREE-YIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_parse_expression_method", "PHRASE-TREE-GET-PARSE-EXPRESSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_heads_method", "PHRASE-TREE-GET-HEADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_semantic_heads_method", "PHRASE-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_daughter_method", "PHRASE-TREE-GET-DAUGHTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_get_descendant_method", "PHRASE-TREE-GET-DESCENDANT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "proper_subtree_p", "PROPER-SUBTREE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subtree_p", "SUBTREE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_search_method", "PHRASE-TREE-SEARCH-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_daughter_count_method", "PHRASE-TREE-DAUGHTER-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_preterminal_p_method", "PHRASE-TREE-PRETERMINAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_hydra_p_method", "PHRASE-TREE-HYDRA-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_find_method", "PHRASE-TREE-FIND-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_find_first_method", "PHRASE-TREE-FIND-FIRST-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_find_last_method", "PHRASE-TREE-FIND-LAST-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_find_all_method", "PHRASE-TREE-FIND-ALL-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "phrase_tree_find_all_subtrees_of_categories_method", "PHRASE-TREE-FIND-ALL-SUBTREES-OF-CATEGORIES-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "tree_yield_to_words", "TREE-YIELD-TO-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "main_collection", "MAIN-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "contract_stringP", "CONTRACT-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "rightmost_nominal_word", "RIGHTMOST-NOMINAL-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_words", "NOMINAL-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "conflate_nominals", "CONFLATE-NOMINALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "process_modifiers", "PROCESS-MODIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "process_abs_index", "PROCESS-ABS-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "retag_aux_verbs", "RETAG-AUX-VERBS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "clear_modifiers", "CLEAR-MODIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "quantify_existentially", "QUANTIFY-EXISTENTIALLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "question_referents", "QUESTION-REFERENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_nominal_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_nominal_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_p", "NOMINAL-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_determiner_method", "NOMINAL-PHRASE-TREE-GET-DETERMINER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_overt_quantifier_method", "NOMINAL-PHRASE-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_quantifier_method", "NOMINAL-PHRASE-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_possessor_method", "NOMINAL-PHRASE-TREE-GET-POSSESSOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_specifier_method", "NOMINAL-PHRASE-TREE-GET-SPECIFIER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_possessive_p_method", "NOMINAL-PHRASE-TREE-POSSESSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_temporal_tree_p_method", "NOMINAL-PHRASE-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_definite_description_p_method", "NOMINAL-PHRASE-TREE-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_name_tree_p_method", "NOMINAL-PHRASE-TREE-NAME-TREE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_gender_method", "NOMINAL-PHRASE-TREE-GET-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_number_method", "NOMINAL-PHRASE-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_person_method", "NOMINAL-PHRASE-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_singular_p_method", "NOMINAL-PHRASE-TREE-SINGULAR-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_plural_p_method", "NOMINAL-PHRASE-TREE-PLURAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_lexify_int_method", "NOMINAL-PHRASE-TREE-LEXIFY-INT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "presupposing_tree_p", "PRESUPPOSING-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "introduces_termP", "INTRODUCES-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "lex_entry_sem_equal", "LEX-ENTRY-SEM-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nominal_phrase_tree_get_head_daughters_method", "NOMINAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_np_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_np_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "np_tree_p", "NP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_npp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_npp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "npp_tree_p", "NPP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_nx_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_nx_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NX-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "nx_tree_p", "NX-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_pnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_pnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pnp_tree_p", "PNP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pnp_tree_get_head_daughters_method", "PNP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "whnp_tree_p", "WHNP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_cyclify_int_vp_coordination_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-COORDINATION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_cyclify_int_vp_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_cyclify_int_method", "VERBAL-PHRASE-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_vp_coordinate_phrase_p_method", "VERBAL-PHRASE-TREE-VP-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_verbal_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_verbal_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_p", "VERBAL-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_predicate_method", "VERBAL-PHRASE-TREE-GET-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_number_method", "VERBAL-PHRASE-TREE-GET-NUMBER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_person_method", "VERBAL-PHRASE-TREE-GET-PERSON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_tense_method", "VERBAL-PHRASE-TREE-GET-TENSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_subject_method", "VERBAL-PHRASE-TREE-GET-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_objects_method", "VERBAL-PHRASE-TREE-GET-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_direct_object_method", "VERBAL-PHRASE-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_indirect_object_method", "VERBAL-PHRASE-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_semantic_direct_object_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_semantic_indirect_object_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_semantic_subject_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_semantic_objects_method", "VERBAL-PHRASE-TREE-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_verbal_complement_method", "VERBAL-PHRASE-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_copula_p_method", "VERBAL-PHRASE-TREE-COPULA-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_dummy_to_p_method", "VERBAL-PHRASE-TREE-DUMMY-TO-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_passive_p_method", "VERBAL-PHRASE-TREE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_finite_p_method", "VERBAL-PHRASE-TREE-FINITE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_partition_semantic_complements_method", "VERBAL-PHRASE-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_ancestor_objects_method", "VERBAL-PHRASE-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_get_head_daughters_method", "VERBAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "verbal_phrase_tree_inverted_p_method", "VERBAL-PHRASE-TREE-INVERTED-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sentential_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sentential_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sentential_tree_p", "SENTENTIAL-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sentential_tree_get_subject_method", "SENTENTIAL-TREE-GET-SUBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sentential_tree_get_modifieds_method", "SENTENTIAL-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_vp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_vp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "vp_tree_p", "VP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_vg_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_vg_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VG-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "vg_tree_p", "VG-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_s1_tree_class", "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_s1_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-S1-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "s1_tree_p", "S1-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_s_tree_class", "SUBLOOP-RESERVED-INITIALIZE-S-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_s_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-S-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "s_tree_p", "S-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "s_tree_get_ancestor_objects_method", "S-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sbar_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sbar_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sbar_tree_p", "SBAR-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sbarq_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sbarq_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sbarq_tree_p", "SBARQ-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sbarq_tree_get_head_daughters_method", "SBARQ-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sbarq_tree_get_ancestor_objects_method", "SBARQ-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sq_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sq_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sq_tree_p", "SQ-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sq_tree_get_ancestor_objects_method", "SQ-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sinv_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_sinv_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "sinv_tree_p", "SINV-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prepositional_or_particle_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_or_particle_phrase_tree_p", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_or_particle_phrase_tree_get_head_daughters_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_or_particle_phrase_tree_get_oblique_object_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_or_particle_phrase_tree_stranded_p_method", "PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-STRANDED-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prepositional_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prepositional_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prepositional_phrase_tree_p", "PREPOSITIONAL-PHRASE-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_pp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_pp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "pp_tree_p", "PP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whpp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whpp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "whpp_tree_p", "WHPP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prt_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_prt_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prt_tree_p", "PRT-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "prt_tree_get_head_daughters_method", "PRT-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_adjp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_adjp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "adjp_tree_p", "ADJP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "adjp_tree_get_head_daughters_method", "ADJP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "adjp_tree_get_modifieds_method", "ADJP-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whadjp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whadjp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "whadjp_tree_p", "WHADJP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "whadjp_tree_lexify_int_method", "WHADJP-TREE-LEXIFY-INT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_advp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_advp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "advp_tree_p", "ADVP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "advp_tree_get_head_daughters_method", "ADVP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whadvp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_whadvp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "whadvp_tree_p", "WHADVP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_frag_tree_class", "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_frag_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "frag_tree_p", "FRAG-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_qp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "subloop_reserved_initialize_qp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-QP-TREE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "qp_tree_p", "QP-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "qp_tree_get_head_daughters_method", "QP-TREE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "qp_tree_get_quantified_method", "QP-TREE-GET-QUANTIFIED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parse_tree", "qp_tree_cyclify_int_method", "QP-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
        return (SubLObject)parse_tree.NIL;
    }
    
    public static SubLObject init_parse_tree_file() {
        parse_tree.$phrase_tree_allow_adjacent_daughters_to_merge$ = SubLFiles.defparameter("*PHRASE-TREE-ALLOW-ADJACENT-DAUGHTERS-TO-MERGE*", (SubLObject)parse_tree.NIL);
        parse_tree.$category_to_phrase$ = SubLFiles.defparameter("*CATEGORY-TO-PHRASE*", (SubLObject)parse_tree.$list245);
        return (SubLObject)parse_tree.NIL;
    }
    
    public static SubLObject setup_parse_tree_file() {
        interfaces.new_interface((SubLObject)parse_tree.$sym0$NOMINAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list1);
        interfaces.new_interface((SubLObject)parse_tree.$sym2$VERBAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list3);
        interfaces.new_interface((SubLObject)parse_tree.$sym4$ADVERBIAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym5$PREPOSITIONAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym6$PARTICLE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym7$ADJECTIVAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym8$QUESTION_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym9$WH_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym10$NUMERICAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym11$FINITE_VERBAL_WORD_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        interfaces.new_interface((SubLObject)parse_tree.$sym12$QUANTIFIER_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list13);
        interfaces.new_interface((SubLObject)parse_tree.$sym14$PRONOUN_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.subloop_new_class((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym16$OBJECT, (SubLObject)parse_tree.$list17, (SubLObject)parse_tree.T, (SubLObject)parse_tree.$list18);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym25$GET_CYCLIFIER, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list27, (SubLObject)parse_tree.$list28);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym25$GET_CYCLIFIER, (SubLObject)parse_tree.$sym56$PARSE_TREE_GET_CYCLIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym57$CYCLIFY, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list27, (SubLObject)parse_tree.$list58);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym57$CYCLIFY, (SubLObject)parse_tree.$sym61$PARSE_TREE_CYCLIFY_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym63$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym66$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_INSTANCE);
        subloop_reserved_initialize_parse_tree_class((SubLObject)parse_tree.$sym15$PARSE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym67$DEEP_COPY, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list68);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym67$DEEP_COPY, (SubLObject)parse_tree.$sym70$PARSE_TREE_DEEP_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym71$GET_ROOT, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list72);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym71$GET_ROOT, (SubLObject)parse_tree.$sym75$PARSE_TREE_GET_ROOT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym76$GET_CATEGORY, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list77);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym76$GET_CATEGORY, (SubLObject)parse_tree.$sym79$PARSE_TREE_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym80$GET_INDEX, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list81);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym80$GET_INDEX, (SubLObject)parse_tree.$sym83$PARSE_TREE_GET_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym84$GET_PATH, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list85);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym84$GET_PATH, (SubLObject)parse_tree.$sym88$PARSE_TREE_GET_PATH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym74$GET_MOTHER, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list89);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym74$GET_MOTHER, (SubLObject)parse_tree.$sym91$PARSE_TREE_GET_MOTHER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym92$GET_SEMANTIC_HEAD, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list93);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym92$GET_SEMANTIC_HEAD, (SubLObject)parse_tree.$sym95$PARSE_TREE_GET_SEMANTIC_HEAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym96$GET_COMPLEMENTS, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list97);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym96$GET_COMPLEMENTS, (SubLObject)parse_tree.$sym99$PARSE_TREE_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym100$GET_MODIFIERS, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list101);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym100$GET_MODIFIERS, (SubLObject)parse_tree.$sym102$PARSE_TREE_GET_MODIFIERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list104);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym105$PARSE_TREE_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym106$GET_CONTEXT, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list107);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym106$GET_CONTEXT, (SubLObject)parse_tree.$sym109$PARSE_TREE_GET_CONTEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym110$TEMPORAL_TREE_P, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list111);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym110$TEMPORAL_TREE_P, (SubLObject)parse_tree.$sym112$PARSE_TREE_TEMPORAL_TREE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym113$CYCLIFIABLE_QUESTION_P, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list114);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym113$CYCLIFIABLE_QUESTION_P, (SubLObject)parse_tree.$sym115$PARSE_TREE_CYCLIFIABLE_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym73$ROOT_P, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list116);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym73$ROOT_P, (SubLObject)parse_tree.$sym118$PARSE_TREE_ROOT_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym53$LEXIFY, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list120);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym53$LEXIFY, (SubLObject)parse_tree.$sym122$PARSE_TREE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list124);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym125$PARSE_TREE_LEXIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list127);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym128$PARSE_TREE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym87$GET_ANCESTORS, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list129);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym87$GET_ANCESTORS, (SubLObject)parse_tree.$sym131$PARSE_TREE_GET_ANCESTORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym132$GET_SISTER, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list133, (SubLObject)parse_tree.$list134);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym132$GET_SISTER, (SubLObject)parse_tree.$sym138$PARSE_TREE_GET_SISTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym139$PRINT, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list140, (SubLObject)parse_tree.$list141);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.$sym139$PRINT, (SubLObject)parse_tree.$sym142$PARSE_TREE_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym15$PARSE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list185);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym187$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym188$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_INSTANCE);
        subloop_reserved_initialize_phrase_tree_class((SubLObject)parse_tree.$sym184$PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list190);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym191$PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym192$GET_HEAD_DAUGHTER, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list193);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym192$GET_HEAD_DAUGHTER, (SubLObject)parse_tree.$sym194$PHRASE_TREE_GET_HEAD_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym98$GET_HEAD, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list195);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym98$GET_HEAD, (SubLObject)parse_tree.$sym197$PHRASE_TREE_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym198$GET_SEMANTIC_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list199);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym198$GET_SEMANTIC_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym200$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym201$GET_SEMANTIC_HEAD_DAUGHTER, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list202);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym201$GET_SEMANTIC_HEAD_DAUGHTER, (SubLObject)parse_tree.$sym203$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym204$GET_REFS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list205, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list206);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym204$GET_REFS, (SubLObject)parse_tree.$sym209$PHRASE_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym100$GET_MODIFIERS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list210);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym100$GET_MODIFIERS, (SubLObject)parse_tree.$sym211$PHRASE_TREE_GET_MODIFIERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym212$GET_CONJUNCTION, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list213);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym212$GET_CONJUNCTION, (SubLObject)parse_tree.$sym215$PHRASE_TREE_GET_CONJUNCTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list216, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list217);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym219$PHRASE_TREE_LEXIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym150$RETOKENIZE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list216, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list220);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym150$RETOKENIZE, (SubLObject)parse_tree.$sym227$PHRASE_TREE_RETOKENIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym222$RETOKENIZE_INT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list228, (SubLObject)parse_tree.$list229);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym222$RETOKENIZE_INT, (SubLObject)parse_tree.$sym232$PHRASE_TREE_RETOKENIZE_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym226$PARTIAL_RETOKENIZE_INT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list216, (SubLObject)parse_tree.$list233, (SubLObject)parse_tree.$list234);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym226$PARTIAL_RETOKENIZE_INT, (SubLObject)parse_tree.$sym235$PHRASE_TREE_PARTIAL_RETOKENIZE_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list236);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY, (SubLObject)parse_tree.$sym241$PHRASE_TREE_ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list242);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym244$PHRASE_TREE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym148$GET_STRING, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list248);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym148$GET_STRING, (SubLObject)parse_tree.$sym252$PHRASE_TREE_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym218$YIELD, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list253);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym218$YIELD, (SubLObject)parse_tree.$sym255$PHRASE_TREE_YIELD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym256$GET_PARSE_EXPRESSION, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list257);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym256$GET_PARSE_EXPRESSION, (SubLObject)parse_tree.$sym258$PHRASE_TREE_GET_PARSE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym196$GET_HEADS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list259);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym196$GET_HEADS, (SubLObject)parse_tree.$sym260$PHRASE_TREE_GET_HEADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list261);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym94$GET_SEMANTIC_HEADS, (SubLObject)parse_tree.$sym262$PHRASE_TREE_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list133, (SubLObject)parse_tree.$list263);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym137$GET_DAUGHTER, (SubLObject)parse_tree.$sym266$PHRASE_TREE_GET_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym267$GET_DESCENDANT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list268, (SubLObject)parse_tree.$list269);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym267$GET_DESCENDANT, (SubLObject)parse_tree.$sym271$PHRASE_TREE_GET_DESCENDANT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym273$SEARCH, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.$list274, (SubLObject)parse_tree.$list275);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym273$SEARCH, (SubLObject)parse_tree.$sym278$PHRASE_TREE_SEARCH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym207$DAUGHTER_COUNT, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list279);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym207$DAUGHTER_COUNT, (SubLObject)parse_tree.$sym281$PHRASE_TREE_DAUGHTER_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym221$PRETERMINAL_P, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list282);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym221$PRETERMINAL_P, (SubLObject)parse_tree.$sym284$PHRASE_TREE_PRETERMINAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym285$HYDRA_P, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list286);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym285$HYDRA_P, (SubLObject)parse_tree.$sym287$PHRASE_TREE_HYDRA_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list289, (SubLObject)parse_tree.$list290);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym288$FIND, (SubLObject)parse_tree.$sym293$PHRASE_TREE_FIND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list295, (SubLObject)parse_tree.$list296);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym294$FIND_FIRST, (SubLObject)parse_tree.$sym298$PHRASE_TREE_FIND_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list300, (SubLObject)parse_tree.$list301);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym299$FIND_LAST, (SubLObject)parse_tree.$sym303$PHRASE_TREE_FIND_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym304$FIND_ALL, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list289, (SubLObject)parse_tree.$list305);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym304$FIND_ALL, (SubLObject)parse_tree.$sym307$PHRASE_TREE_FIND_ALL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym308$FIND_ALL_SUBTREES_OF_CATEGORIES, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.$list309, (SubLObject)parse_tree.$list310);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$sym308$FIND_ALL_SUBTREES_OF_CATEGORIES, (SubLObject)parse_tree.$sym311$PHRASE_TREE_FIND_ALL_SUBTREES_OF_CATEGORIES_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list323, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list324);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym325$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym326$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_INSTANCE);
        subloop_reserved_initialize_nominal_phrase_tree_class((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym327$GET_DETERMINER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list328);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym327$GET_DETERMINER, (SubLObject)parse_tree.$sym329$NOMINAL_PHRASE_TREE_GET_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym330$GET_OVERT_QUANTIFIER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list331);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym330$GET_OVERT_QUANTIFIER, (SubLObject)parse_tree.$sym332$NOMINAL_PHRASE_TREE_GET_OVERT_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym333$GET_QUANTIFIER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list334);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym333$GET_QUANTIFIER, (SubLObject)parse_tree.$sym335$NOMINAL_PHRASE_TREE_GET_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym336$GET_POSSESSOR, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list337);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym336$GET_POSSESSOR, (SubLObject)parse_tree.$sym338$NOMINAL_PHRASE_TREE_GET_POSSESSOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym339$GET_SPECIFIER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list340);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym339$GET_SPECIFIER, (SubLObject)parse_tree.$sym341$NOMINAL_PHRASE_TREE_GET_SPECIFIER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym342$POSSESSIVE_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list343);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym342$POSSESSIVE_P, (SubLObject)parse_tree.$sym344$NOMINAL_PHRASE_TREE_POSSESSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym110$TEMPORAL_TREE_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list345);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym110$TEMPORAL_TREE_P, (SubLObject)parse_tree.$sym346$NOMINAL_PHRASE_TREE_TEMPORAL_TREE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym347$DEFINITE_DESCRIPTION_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list348);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym347$DEFINITE_DESCRIPTION_P, (SubLObject)parse_tree.$sym349$NOMINAL_PHRASE_TREE_DEFINITE_DESCRIPTION_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym350$NAME_TREE_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list351);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym350$NAME_TREE_P, (SubLObject)parse_tree.$sym352$NOMINAL_PHRASE_TREE_NAME_TREE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym353$GET_GENDER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list354);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym353$GET_GENDER, (SubLObject)parse_tree.$sym355$NOMINAL_PHRASE_TREE_GET_GENDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym356$GET_NUMBER, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list357);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym356$GET_NUMBER, (SubLObject)parse_tree.$sym358$NOMINAL_PHRASE_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym359$GET_PERSON, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list360);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym359$GET_PERSON, (SubLObject)parse_tree.$sym361$NOMINAL_PHRASE_TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym362$SINGULAR_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list363);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym362$SINGULAR_P, (SubLObject)parse_tree.$sym364$NOMINAL_PHRASE_TREE_SINGULAR_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym365$PLURAL_P, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list366);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym365$PLURAL_P, (SubLObject)parse_tree.$sym367$NOMINAL_PHRASE_TREE_PLURAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list216, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list368);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym377$NOMINAL_PHRASE_TREE_LEXIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list378);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym384$NOMINAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym385$NP_TREE, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym385$NP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym385$NP_TREE, (SubLObject)parse_tree.$sym386$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym385$NP_TREE, (SubLObject)parse_tree.$sym387$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_INSTANCE);
        subloop_reserved_initialize_np_tree_class((SubLObject)parse_tree.$sym385$NP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym388$NPP_TREE, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym388$NPP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym388$NPP_TREE, (SubLObject)parse_tree.$sym389$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym388$NPP_TREE, (SubLObject)parse_tree.$sym390$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_INSTANCE);
        subloop_reserved_initialize_npp_tree_class((SubLObject)parse_tree.$sym388$NPP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym391$NX_TREE, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym391$NX_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym391$NX_TREE, (SubLObject)parse_tree.$sym392$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym391$NX_TREE, (SubLObject)parse_tree.$sym393$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_INSTANCE);
        subloop_reserved_initialize_nx_tree_class((SubLObject)parse_tree.$sym391$NX_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list395);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.$sym396$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.$sym397$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_INSTANCE);
        subloop_reserved_initialize_pnp_tree_class((SubLObject)parse_tree.$sym394$PNP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list398);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym394$PNP_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym399$PNP_TREE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym400$WHNP_TREE, (SubLObject)parse_tree.$sym322$NOMINAL_PHRASE_TREE, (SubLObject)parse_tree.$list401, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym400$WHNP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym400$WHNP_TREE, (SubLObject)parse_tree.$sym402$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym400$WHNP_TREE, (SubLObject)parse_tree.$sym403$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_INSTANCE);
        subloop_reserved_initialize_whnp_tree_class((SubLObject)parse_tree.$sym400$WHNP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list405, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list406);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.NIL);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym407$CYCLIFY_INT_VP_COORDINATION, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list408);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym407$CYCLIFY_INT_VP_COORDINATION, (SubLObject)parse_tree.$sym411$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_COORDINATION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym410$CYCLIFY_INT_VP, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list412);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym410$CYCLIFY_INT_VP, (SubLObject)parse_tree.$sym415$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list416);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym418$VERBAL_PHRASE_TREE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym417$VP_COORDINATE_PHRASE_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list419);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym417$VP_COORDINATE_PHRASE_P, (SubLObject)parse_tree.$sym421$VERBAL_PHRASE_TREE_VP_COORDINATE_PHRASE_P_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym422$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym423$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_INSTANCE);
        subloop_reserved_initialize_verbal_phrase_tree_class((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym424$GET_PREDICATE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list425);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym424$GET_PREDICATE, (SubLObject)parse_tree.$sym426$VERBAL_PHRASE_TREE_GET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym356$GET_NUMBER, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list427);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym356$GET_NUMBER, (SubLObject)parse_tree.$sym428$VERBAL_PHRASE_TREE_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym359$GET_PERSON, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list429);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym359$GET_PERSON, (SubLObject)parse_tree.$sym430$VERBAL_PHRASE_TREE_GET_PERSON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym431$GET_TENSE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list432);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym431$GET_TENSE, (SubLObject)parse_tree.$sym433$VERBAL_PHRASE_TREE_GET_TENSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym409$GET_SUBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list434);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym409$GET_SUBJECT, (SubLObject)parse_tree.$sym436$VERBAL_PHRASE_TREE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym437$GET_OBJECTS, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list438);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym437$GET_OBJECTS, (SubLObject)parse_tree.$sym439$VERBAL_PHRASE_TREE_GET_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym440$GET_DIRECT_OBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list441);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym440$GET_DIRECT_OBJECT, (SubLObject)parse_tree.$sym442$VERBAL_PHRASE_TREE_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym443$GET_INDIRECT_OBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list444);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym443$GET_INDIRECT_OBJECT, (SubLObject)parse_tree.$sym445$VERBAL_PHRASE_TREE_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym446$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list447);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym446$GET_SEMANTIC_DIRECT_OBJECT, (SubLObject)parse_tree.$sym448$VERBAL_PHRASE_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym449$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list450);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym449$GET_SEMANTIC_INDIRECT_OBJECT, (SubLObject)parse_tree.$sym451$VERBAL_PHRASE_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym452$GET_SEMANTIC_SUBJECT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list453);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym452$GET_SEMANTIC_SUBJECT, (SubLObject)parse_tree.$sym454$VERBAL_PHRASE_TREE_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym455$GET_SEMANTIC_OBJECTS, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list456);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym455$GET_SEMANTIC_OBJECTS, (SubLObject)parse_tree.$sym457$VERBAL_PHRASE_TREE_GET_SEMANTIC_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym317$GET_VERBAL_COMPLEMENT, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list458);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym317$GET_VERBAL_COMPLEMENT, (SubLObject)parse_tree.$sym459$VERBAL_PHRASE_TREE_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym460$COPULA_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list461);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym460$COPULA_P, (SubLObject)parse_tree.$sym462$VERBAL_PHRASE_TREE_COPULA_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym463$DUMMY_TO_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list464);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym463$DUMMY_TO_P, (SubLObject)parse_tree.$sym466$VERBAL_PHRASE_TREE_DUMMY_TO_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym467$PASSIVE_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list468);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym467$PASSIVE_P, (SubLObject)parse_tree.$sym469$VERBAL_PHRASE_TREE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym470$FINITE_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list471);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym470$FINITE_P, (SubLObject)parse_tree.$sym472$VERBAL_PHRASE_TREE_FINITE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym473$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list474);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym473$PARTITION_SEMANTIC_COMPLEMENTS, (SubLObject)parse_tree.$sym475$VERBAL_PHRASE_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list477);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym480$VERBAL_PHRASE_TREE_GET_ANCESTOR_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list481);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym484$VERBAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym479$INVERTED_P, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list485);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$sym479$INVERTED_P, (SubLObject)parse_tree.$sym486$VERBAL_PHRASE_TREE_INVERTED_P_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.$list488, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list489);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$sym490$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$sym491$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_INSTANCE);
        subloop_reserved_initialize_sentential_tree_class((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym409$GET_SUBJECT, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list492);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$sym409$GET_SUBJECT, (SubLObject)parse_tree.$sym493$SENTENTIAL_TREE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list494);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym496$SENTENTIAL_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym497$VP_TREE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym497$VP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym497$VP_TREE, (SubLObject)parse_tree.$sym498$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym497$VP_TREE, (SubLObject)parse_tree.$sym499$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_INSTANCE);
        subloop_reserved_initialize_vp_tree_class((SubLObject)parse_tree.$sym497$VP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym500$VG_TREE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym500$VG_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym500$VG_TREE, (SubLObject)parse_tree.$sym501$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym500$VG_TREE, (SubLObject)parse_tree.$sym502$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_INSTANCE);
        subloop_reserved_initialize_vg_tree_class((SubLObject)parse_tree.$sym500$VG_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym503$S1_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym503$S1_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym503$S1_TREE, (SubLObject)parse_tree.$sym504$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym503$S1_TREE, (SubLObject)parse_tree.$sym505$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_INSTANCE);
        subloop_reserved_initialize_s1_tree_class((SubLObject)parse_tree.$sym503$S1_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list507);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.$sym508$SUBLOOP_RESERVED_INITIALIZE_S_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.$sym509$SUBLOOP_RESERVED_INITIALIZE_S_TREE_INSTANCE);
        subloop_reserved_initialize_s_tree_class((SubLObject)parse_tree.$sym506$S_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list510);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym506$S_TREE, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym512$S_TREE_GET_ANCESTOR_OBJECTS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym513$SBAR_TREE, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym513$SBAR_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym513$SBAR_TREE, (SubLObject)parse_tree.$sym514$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym513$SBAR_TREE, (SubLObject)parse_tree.$sym515$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_INSTANCE);
        subloop_reserved_initialize_sbar_tree_class((SubLObject)parse_tree.$sym513$SBAR_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$list517, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list518);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$sym519$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$sym520$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_INSTANCE);
        subloop_reserved_initialize_sbarq_tree_class((SubLObject)parse_tree.$sym516$SBARQ_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list521);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym523$SBARQ_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list524);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym516$SBARQ_TREE, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym525$SBARQ_TREE_GET_ANCESTOR_OBJECTS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.$sym487$SENTENTIAL_TREE, (SubLObject)parse_tree.$list517, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list527);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.$sym528$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.$sym529$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_INSTANCE);
        subloop_reserved_initialize_sq_tree_class((SubLObject)parse_tree.$sym526$SQ_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list530);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym526$SQ_TREE, (SubLObject)parse_tree.$sym476$GET_ANCESTOR_OBJECTS, (SubLObject)parse_tree.$sym532$SQ_TREE_GET_ANCESTOR_OBJECTS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym533$SINV_TREE, (SubLObject)parse_tree.$sym404$VERBAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym533$SINV_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym533$SINV_TREE, (SubLObject)parse_tree.$sym534$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym533$SINV_TREE, (SubLObject)parse_tree.$sym535$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_INSTANCE);
        subloop_reserved_initialize_sinv_tree_class((SubLObject)parse_tree.$sym533$SINV_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list537);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym538$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym539$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE);
        subloop_reserved_initialize_prepositional_or_particle_phrase_tree_class((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list540);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym543$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym544$GET_OBLIQUE_OBJECT, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list545);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym544$GET_OBLIQUE_OBJECT, (SubLObject)parse_tree.$sym546$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_OBLIQUE_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym547$STRANDED_P, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list548);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$sym547$STRANDED_P, (SubLObject)parse_tree.$sym549$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_STRANDED_P_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$list551, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.$sym552$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.$sym553$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_INSTANCE);
        subloop_reserved_initialize_prepositional_phrase_tree_class((SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym554$PP_TREE, (SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym554$PP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym554$PP_TREE, (SubLObject)parse_tree.$sym555$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym554$PP_TREE, (SubLObject)parse_tree.$sym556$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_INSTANCE);
        subloop_reserved_initialize_pp_tree_class((SubLObject)parse_tree.$sym554$PP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym557$WHPP_TREE, (SubLObject)parse_tree.$sym550$PREPOSITIONAL_PHRASE_TREE, (SubLObject)parse_tree.$list401, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym557$WHPP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym557$WHPP_TREE, (SubLObject)parse_tree.$sym558$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym557$WHPP_TREE, (SubLObject)parse_tree.$sym559$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_INSTANCE);
        subloop_reserved_initialize_whpp_tree_class((SubLObject)parse_tree.$sym557$WHPP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.$sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE, (SubLObject)parse_tree.$list561, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list395);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.$sym562$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.$sym563$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_INSTANCE);
        subloop_reserved_initialize_prt_tree_class((SubLObject)parse_tree.$sym560$PRT_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list564);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym560$PRT_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym565$PRT_TREE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list567, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list395);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$sym568$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$sym569$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_INSTANCE);
        subloop_reserved_initialize_adjp_tree_class((SubLObject)parse_tree.$sym566$ADJP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list570);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym572$ADJP_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list573);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$sym103$GET_MODIFIEDS, (SubLObject)parse_tree.$sym574$ADJP_TREE_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.$sym566$ADJP_TREE, (SubLObject)parse_tree.$list401, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list576);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.$sym577$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.$sym578$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_INSTANCE);
        subloop_reserved_initialize_whadjp_tree_class((SubLObject)parse_tree.$sym575$WHADJP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.$list216, (SubLObject)parse_tree.$list119, (SubLObject)parse_tree.$list579);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym575$WHADJP_TREE, (SubLObject)parse_tree.$sym121$LEXIFY_INT, (SubLObject)parse_tree.$sym580$WHADJP_TREE_LEXIFY_INT_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list582, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list395);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$sym583$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$sym584$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_INSTANCE);
        subloop_reserved_initialize_advp_tree_class((SubLObject)parse_tree.$sym581$ADVP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list585);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym587$ADVP_TREE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class((SubLObject)parse_tree.$sym588$WHADVP_TREE, (SubLObject)parse_tree.$sym581$ADVP_TREE, (SubLObject)parse_tree.$list401, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym588$WHADVP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym588$WHADVP_TREE, (SubLObject)parse_tree.$sym589$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym588$WHADVP_TREE, (SubLObject)parse_tree.$sym590$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_INSTANCE);
        subloop_reserved_initialize_whadvp_tree_class((SubLObject)parse_tree.$sym588$WHADVP_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym591$FRAG_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym591$FRAG_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym591$FRAG_TREE, (SubLObject)parse_tree.$sym592$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym591$FRAG_TREE, (SubLObject)parse_tree.$sym593$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_INSTANCE);
        subloop_reserved_initialize_frag_tree_class((SubLObject)parse_tree.$sym591$FRAG_TREE);
        classes.subloop_new_class((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym184$PHRASE_TREE, (SubLObject)parse_tree.$list595, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list596);
        classes.class_set_implements_slot_listeners((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym597$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym598$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_INSTANCE);
        subloop_reserved_initialize_qp_tree_class((SubLObject)parse_tree.$sym594$QP_TREE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list599);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym189$GET_HEAD_DAUGHTERS, (SubLObject)parse_tree.$sym601$QP_TREE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym602$GET_QUANTIFIED, (SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$list26, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list603);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym602$GET_QUANTIFIED, (SubLObject)parse_tree.$sym605$QP_TREE_GET_QUANTIFIED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$list123, (SubLObject)parse_tree.NIL, (SubLObject)parse_tree.$list606);
        methods.subloop_register_instance_method((SubLObject)parse_tree.$sym594$QP_TREE, (SubLObject)parse_tree.$sym126$CYCLIFY_INT, (SubLObject)parse_tree.$sym611$QP_TREE_CYCLIFY_INT_METHOD);
        return (SubLObject)parse_tree.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parse_tree_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parse_tree_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parse_tree_file();
    }
    
    static {
        me = (SubLFile)new parse_tree();
        parse_tree.$phrase_tree_allow_adjacent_daughters_to_merge$ = null;
        parse_tree.$category_to_phrase$ = null;
        $sym0$NOMINAL_TREE = SubLObjectFactory.makeSymbol("NOMINAL-TREE");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym2$VERBAL_TREE = SubLObjectFactory.makeSymbol("VERBAL-TREE");
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LOCAL-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NONLOCAL-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym4$ADVERBIAL_TREE = SubLObjectFactory.makeSymbol("ADVERBIAL-TREE");
        $sym5$PREPOSITIONAL_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE");
        $sym6$PARTICLE_TREE = SubLObjectFactory.makeSymbol("PARTICLE-TREE");
        $sym7$ADJECTIVAL_TREE = SubLObjectFactory.makeSymbol("ADJECTIVAL-TREE");
        $sym8$QUESTION_TREE = SubLObjectFactory.makeSymbol("QUESTION-TREE");
        $sym9$WH_TREE = SubLObjectFactory.makeSymbol("WH-TREE");
        $sym10$NUMERICAL_TREE = SubLObjectFactory.makeSymbol("NUMERICAL-TREE");
        $sym11$FINITE_VERBAL_WORD_TREE = SubLObjectFactory.makeSymbol("FINITE-VERBAL-WORD-TREE");
        $sym12$QUANTIFIER_TREE = SubLObjectFactory.makeSymbol("QUANTIFIER-TREE");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIED"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym14$PRONOUN_TREE = SubLObjectFactory.makeSymbol("PRONOUN-TREE");
        $sym15$PARSE_TREE = SubLObjectFactory.makeSymbol("PARSE-TREE");
        $sym16$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-INTERFACE"));
        $list18 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IDX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEEP-COPY"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ROOT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PATH"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTEXT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-QUESTION-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MINIMALLY-COVERING-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COVERS-MINIMALLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRINGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym19$CONTEXT = SubLObjectFactory.makeSymbol("CONTEXT");
        $sym20$MODIFIERS = SubLObjectFactory.makeSymbol("MODIFIERS");
        $sym21$IDX = SubLObjectFactory.makeSymbol("IDX");
        $sym22$MOTHER = SubLObjectFactory.makeSymbol("MOTHER");
        $sym23$CATEGORY = SubLObjectFactory.makeSymbol("CATEGORY");
        $sym24$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym25$GET_CYCLIFIER = SubLObjectFactory.makeSymbol("GET-CYCLIFIER");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-SCORE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT"), (SubLObject)SubLObjectFactory.makeKeyword("BRIEF")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?"), (SubLObject)parse_tree.T), SubLObjectFactory.makeSymbol("CONTEXT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATOR"), (SubLObject)parse_tree.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-RESOLVER"), (SubLObject)parse_tree.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("THROW")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-POOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFIER-POOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-CYCLIFIER")))))), SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS") }), SubLObjectFactory.makeSymbol("PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE")))), (SubLObject)SubLObjectFactory.makeString("Invalid error-handling tag ~a"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-POOL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-P")), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-SCORE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE-FUNCTION")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-SUBCYCLIFIER-POOL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-POOL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-RESOLVER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-WFF-CHECK?"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-MEMOIZATION-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MEMOIZATION-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-SBHL-RESOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE"), (SubLObject)parse_tree.TEN_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER")) }) }));
        $sym29$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $kw30$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $sym31$CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON");
        $kw32$SCORE_FUNCTION = SubLObjectFactory.makeKeyword("SCORE-FUNCTION");
        $sym33$CYCLIFICATION_SCORE = SubLObjectFactory.makeSymbol("CYCLIFICATION-SCORE");
        $kw34$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw35$BRIEF = SubLObjectFactory.makeKeyword("BRIEF");
        $kw36$WFF_CHECK_ = SubLObjectFactory.makeKeyword("WFF-CHECK?");
        $kw37$CONTEXT = SubLObjectFactory.makeKeyword("CONTEXT");
        $kw38$DISAMBIGUATOR = SubLObjectFactory.makeKeyword("DISAMBIGUATOR");
        $kw39$COREFERENCE_RESOLVER = SubLObjectFactory.makeKeyword("COREFERENCE-RESOLVER");
        $kw40$ERROR_HANDLING = SubLObjectFactory.makeKeyword("ERROR-HANDLING");
        $kw41$THROW = SubLObjectFactory.makeKeyword("THROW");
        $kw42$SUBCYCLIFIER_POOL = SubLObjectFactory.makeKeyword("SUBCYCLIFIER-POOL");
        $sym43$DATE_CYCLIFIER = SubLObjectFactory.makeSymbol("DATE-CYCLIFIER");
        $sym44$CYCLIFIER_LEXICON_P = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-P");
        $sym45$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym46$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym47$PARSE_TREE_CONTEXT_P = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-P");
        $sym48$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"));
        $str50$Invalid_error_handling_tag__a = SubLObjectFactory.makeString("Invalid error-handling tag ~a");
        $sym51$CYCLIFIER_POOL_P = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-P");
        $sym52$CYCLIFIER = SubLObjectFactory.makeSymbol("CYCLIFIER");
        $sym53$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym54$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $sym55$DISAMBIGUATE = SubLObjectFactory.makeSymbol("DISAMBIGUATE");
        $sym56$PARSE_TREE_GET_CYCLIFIER_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-CYCLIFIER-METHOD");
        $sym57$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCLIFIER")), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-NEXT?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")))));
        $sym59$HAS_NEXT_ = SubLObjectFactory.makeSymbol("HAS-NEXT?");
        $sym60$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $sym61$PARSE_TREE_CYCLIFY_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CYCLIFY-METHOD");
        $sym62$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym63$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CLASS");
        $sym64$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym65$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym66$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-INSTANCE");
        $sym67$DEEP_COPY = SubLObjectFactory.makeSymbol("DEEP-COPY");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; a deep copy of this parse tree.\n   @owner bertolo."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCE-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ALL-INSTANCE-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-P"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEEP-COPY"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTORP"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-HASHTABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-COPY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"))));
        $sym69$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym70$PARSE_TREE_DEEP_COPY_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-DEEP-COPY-METHOD");
        $sym71$GET_ROOT = SubLObjectFactory.makeSymbol("GET-ROOT");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the root of this tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"))));
        $sym73$ROOT_P = SubLObjectFactory.makeSymbol("ROOT-P");
        $sym74$GET_MOTHER = SubLObjectFactory.makeSymbol("GET-MOTHER");
        $sym75$PARSE_TREE_GET_ROOT_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-ROOT-METHOD");
        $sym76$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the category of this parse-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY")));
        $sym78$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym79$PARSE_TREE_GET_CATEGORY_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-CATEGORY-METHOD");
        $sym80$GET_INDEX = SubLObjectFactory.makeSymbol("GET-INDEX");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integer-p; the number of sisters left to this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("IDX")));
        $sym82$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym83$PARSE_TREE_GET_INDEX_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-INDEX-METHOD");
        $sym84$GET_PATH = SubLObjectFactory.makeSymbol("GET-PATH");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the path from the root to this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUTLAST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX"))), (SubLObject)SubLObjectFactory.makeSymbol("PATH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PATH"))));
        $sym86$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym87$GET_ANCESTORS = SubLObjectFactory.makeSymbol("GET-ANCESTORS");
        $sym88$PARSE_TREE_GET_PATH_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-PATH-METHOD");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the mother of this tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")));
        $sym90$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym91$PARSE_TREE_GET_MOTHER_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-MOTHER-METHOD");
        $sym92$GET_SEMANTIC_HEAD = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the (first) semantic head of this phrase\n   @note currently wasteful, since all heads are computed, then discarded"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"))))));
        $sym94$GET_SEMANTIC_HEADS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS");
        $sym95$PARSE_TREE_GET_SEMANTIC_HEAD_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-SEMANTIC-HEAD-METHOD");
        $sym96$GET_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-COMPLEMENTS");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all complements of this tree, in surface order"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))))));
        $sym98$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym99$PARSE_TREE_GET_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-COMPLEMENTS-METHOD");
        $sym100$GET_MODIFIERS = SubLObjectFactory.makeSymbol("GET-MODIFIERS");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of modifiers of this tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL));
        $sym102$PARSE_TREE_GET_MODIFIERS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-MODIFIERS-METHOD");
        $sym103$GET_MODIFIEDS = SubLObjectFactory.makeSymbol("GET-MODIFIEDS");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the constituents this tree modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL));
        $sym105$PARSE_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-MODIFIEDS-METHOD");
        $sym106$GET_CONTEXT = SubLObjectFactory.makeSymbol("GET-CONTEXT");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-context-p; other parse trees created in this tree's context"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")));
        $sym108$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym109$PARSE_TREE_GET_CONTEXT_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-CONTEXT-METHOD");
        $sym110$TEMPORAL_TREE_P = SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is temporal, nil otherwise\n   @note this is just a fallback; specific trees override this"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL));
        $sym112$PARSE_TREE_TEMPORAL_TREE_P_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-TEMPORAL-TREE-P-METHOD");
        $sym113$CYCLIFIABLE_QUESTION_P = SubLObjectFactory.makeSymbol("CYCLIFIABLE-QUESTION-P");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this is a question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym115$PARSE_TREE_CYCLIFIABLE_QUESTION_P_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CYCLIFIABLE-QUESTION-P-METHOD");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is the root, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"))));
        $sym117$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym118$PARSE_TREE_ROOT_P_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-ROOT-P-METHOD");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; this parse-tree with lexical entries added"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), (SubLObject)parse_tree.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFICATION-COMPLETE*"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym121$LEXIFY_INT = SubLObjectFactory.makeSymbol("LEXIFY-INT");
        $sym122$PARSE_TREE_LEXIFY_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-LEXIFY-METHOD");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; this parse-tree with lexical entries added"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym125$PARSE_TREE_LEXIFY_INT_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-LEXIFY-INT-METHOD");
        $sym126$CYCLIFY_INT = SubLObjectFactory.makeSymbol("CYCLIFY-INT");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the CycL representation of the meaning of this parse-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL));
        $sym128$PARSE_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CYCLIFY-INT-METHOD");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of ancestors of this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))))));
        $sym130$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym131$PARSE_TREE_GET_ANCESTORS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-ANCESTORS-METHOD");
        $sym132$GET_SISTER = SubLObjectFactory.makeSymbol("GET-SISTER");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"));
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the sister INDEX positions to the right of this\n   parse tree if INDEX is positive and to the left if INDEX is negative;\n   nil if there is no such sister"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SISTER-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeSymbol("SISTER-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"))))))));
        $sym135$OUTER_CATCH_FOR_PARSE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-METHOD");
        $sym136$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym137$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym138$PARSE_TREE_GET_SISTER_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-GET-SISTER-METHOD");
        $sym139$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Pretty-prints this phrase-tree to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPRINT-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)parse_tree.ZERO_INTEGER)));
        $sym142$PARSE_TREE_PRINT_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-PRINT-METHOD");
        $str143$__W_ = SubLObjectFactory.makeString("#<W(");
        $str144$_ = SubLObjectFactory.makeString(")");
        $sym145$GET_RANKED_LEXES = SubLObjectFactory.makeSymbol("GET-RANKED-LEXES");
        $str146$_ = SubLObjectFactory.makeString("*");
        $str147$__ = SubLObjectFactory.makeString(": ");
        $sym148$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $str149$_ = SubLObjectFactory.makeString(">");
        $sym150$RETOKENIZE = SubLObjectFactory.makeSymbol("RETOKENIZE");
        $list151 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("DFR2L"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw152$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw153$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $sym154$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym155$ORDER_VAR = SubLObjectFactory.makeUninternedSymbol("ORDER-VAR");
        $sym156$POSSIBLE_ORDERS = SubLObjectFactory.makeUninternedSymbol("POSSIBLE-ORDERS");
        $sym157$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("DFL2R"), (SubLObject)SubLObjectFactory.makeKeyword("DFR2L")));
        $sym160$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym161$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $list162 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)parse_tree.EQ));
        $str163$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $sym164$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $sym165$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym166$COR = SubLObjectFactory.makeSymbol("COR");
        $sym167$STACK_EMPTY_P = SubLObjectFactory.makeSymbol("STACK-EMPTY-P");
        $sym168$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym169$STACK_POP = SubLObjectFactory.makeSymbol("STACK-POP");
        $sym170$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym171$PHRASE_TREE_P = SubLObjectFactory.makeSymbol("PHRASE-TREE-P");
        $sym172$DO_VECTOR = SubLObjectFactory.makeSymbol("DO-VECTOR");
        $sym173$DAUGHTER = SubLObjectFactory.makeSymbol("DAUGHTER");
        $sym174$GET_PHRASE_TREE_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS");
        $kw175$BACKWARD_ = SubLObjectFactory.makeKeyword("BACKWARD?");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DFL2R"));
        $sym177$CATEGORIES_VAR = SubLObjectFactory.makeUninternedSymbol("CATEGORIES-VAR");
        $sym178$DO_PARSE_TREE_SUBTREES = SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $sym180$FIM = SubLObjectFactory.makeSymbol("FIM");
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym183$WORD_TREE_P = SubLObjectFactory.makeSymbol("WORD-TREE-P");
        $sym184$PHRASE_TREE = SubLObjectFactory.makeSymbol("PHRASE-TREE");
        $list185 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONJUNCTION"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RETOKENIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RETOKENIZE-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym186$DAUGHTERS = SubLObjectFactory.makeSymbol("DAUGHTERS");
        $sym187$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-CLASS");
        $sym188$SUBLOOP_RESERVED_INITIALIZE_PHRASE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHRASE-TREE-INSTANCE");
        $sym189$GET_HEAD_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of head daughers of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL));
        $sym191$PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym192$GET_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the (first) head daughter of this phrase\n   @note currently wasteful, since all heads are computed, then discarded"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"))))));
        $sym194$PHRASE_TREE_GET_HEAD_DAUGHTER_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-HEAD-DAUGHTER-METHOD");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the (first) head of this phrase\n   @note currently wasteful, since all heads are computed, then discarded"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS"))))));
        $sym196$GET_HEADS = SubLObjectFactory.makeSymbol("GET-HEADS");
        $sym197$PHRASE_TREE_GET_HEAD_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-HEAD-METHOD");
        $sym198$GET_SEMANTIC_HEAD_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of head daughers of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS")))));
        $sym200$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD");
        $sym201$GET_SEMANTIC_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTER");
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the (first) semantic head daughter of this phrase\n   @note currently wasteful, since all heads are computed, then discarded"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS"))))));
        $sym203$PHRASE_TREE_GET_SEMANTIC_HEAD_DAUGHTER_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-SEMANTIC-HEAD-DAUGHTER-METHOD");
        $sym204$GET_REFS = SubLObjectFactory.makeSymbol("GET-REFS");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the unique referents of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)parse_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("$"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("REFS"))));
        $sym207$DAUGHTER_COUNT = SubLObjectFactory.makeSymbol("DAUGHTER-COUNT");
        $kw208$_ = SubLObjectFactory.makeKeyword("$");
        $sym209$PHRASE_TREE_GET_REFS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-REFS-METHOD");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of all modifiers of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS")))))));
        $sym211$PHRASE_TREE_GET_MODIFIERS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-MODIFIERS-METHOD");
        $sym212$GET_CONJUNCTION = SubLObjectFactory.makeSymbol("GET-CONJUNCTION");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return object; the conjunction of this tree if there is one, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE-P")))));
        $sym214$COORDINATE_WORD_TREE_P = SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE-P");
        $sym215$PHRASE_TREE_GET_CONJUNCTION_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-CONJUNCTION-METHOD");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; this phrase-tree with lexical entries added"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("ORIG-SPELLING"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED-SPELLING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD1"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-P"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-YIELD-TO-WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ORIG-SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)parse_tree.ZERO_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED-SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)parse_tree.ZERO_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARSE-TREE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD1"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED-SPELLING")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOVECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARSE-TREE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2"), (SubLObject)SubLObjectFactory.makeSymbol("ORIG-SPELLING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("ORIG-SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARSE-TREE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD2"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-MODIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-ABS-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym218$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym219$PHRASE_TREE_LEXIFY_INT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-LEXIFY-INT-METHOD");
        $list220 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRETERMINAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RETOKENIZE-INT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RETOKENIZE-INT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*PHRASE-TREE-ALLOW-ADJACENT-DAUGHTERS-TO-MERGE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTIT-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-RETOKENIZE-INT")), (SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTIT-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym221$PRETERMINAL_P = SubLObjectFactory.makeSymbol("PRETERMINAL-P");
        $sym222$RETOKENIZE_INT = SubLObjectFactory.makeSymbol("RETOKENIZE-INT");
        $sym223$GET = SubLObjectFactory.makeSymbol("GET");
        $sym224$ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY = SubLObjectFactory.makeSymbol("ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTIT-LISTS"));
        $sym226$PARTIAL_RETOKENIZE_INT = SubLObjectFactory.makeSymbol("PARTIAL-RETOKENIZE-INT");
        $sym227$PHRASE_TREE_RETOKENIZE_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-RETOKENIZE-METHOD");
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list229 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-WORDS")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORD-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym230$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym231$LEXIFY_WORDS = SubLObjectFactory.makeSymbol("LEXIFY-WORDS");
        $sym232$PHRASE_TREE_RETOKENIZE_INT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-RETOKENIZE-INT-METHOD");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("retokenize only WORD-LISTS according to LEXICON.  There may be additional words in PHRASE-TREE\n   that do not get retokenized. Those words will be re-attached to the phrase with no modification."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-MULTIPLE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-WORDS")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORD-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)parse_tree.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"))))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH-ALL"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST2VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DAUGHTERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym235$PHRASE_TREE_PARTIAL_RETOKENIZE_INT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-PARTIAL-RETOKENIZE-INT-METHOD");
        $list236 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR2LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-DAUGHTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS-USED"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-FOR-ITERATION"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NUMBERS"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NUM"), SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"), SubLObjectFactory.makeKeyword("END"), SubLObjectFactory.makeSymbol("START-FOR-ITERATION"), SubLObjectFactory.makeKeyword("DELTA"), parse_tree.MINUS_ONE_INTEGER, SubLObjectFactory.makeKeyword("DONE"), SubLObjectFactory.makeSymbol("NUM-DAUGHTERS-USED") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-N"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-DAUGHTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-YIELD")), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE-ACCORDING-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-N"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-DAUGHTERS")), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS-USED"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS-USED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-DAUGHTERS-USED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-DAUGHTERS"))), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-START"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-LISTS"))))));
        $sym237$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym238$COPY_LIST = SubLObjectFactory.makeSymbol("COPY-LIST");
        $sym239$PHRASE_TREE_YIELD = SubLObjectFactory.makeSymbol("PHRASE-TREE-YIELD");
        $sym240$PHRASE_TREE_STRING = SubLObjectFactory.makeSymbol("PHRASE-TREE-STRING");
        $sym241$PHRASE_TREE_ADJACENT_DAUGHTERS_HAVE_LEXICAL_ENTRY_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-ADJACENT-DAUGHTERS-HAVE-LEXICAL-ENTRY-METHOD");
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the CycL representation of the meaning of this phrase-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))))));
        $sym243$INSTANTIATE_SCOPE = SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE");
        $sym244$PHRASE_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-CYCLIFY-INT-METHOD");
        $list245 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeSymbol("NP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeSymbol("NPP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CNP"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NX"), (SubLObject)SubLObjectFactory.makeSymbol("NX-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PNP"), (SubLObject)SubLObjectFactory.makeSymbol("PNP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHNP"), (SubLObject)SubLObjectFactory.makeSymbol("WHNP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRT"), (SubLObject)SubLObjectFactory.makeSymbol("PRT-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("QP"), (SubLObject)SubLObjectFactory.makeSymbol("QP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUB"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONJP"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UCP"), (SubLObject)SubLObjectFactory.makeSymbol("UNLIKE-COORDINATE-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PRT"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-PHRASE-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)SubLObjectFactory.makeSymbol("VP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VG"), (SubLObject)SubLObjectFactory.makeSymbol("VG-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("S1"), (SubLObject)SubLObjectFactory.makeSymbol("S1-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)SubLObjectFactory.makeSymbol("S-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SBAR"), (SubLObject)SubLObjectFactory.makeSymbol("SBAR-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SBARQ"), (SubLObject)SubLObjectFactory.makeSymbol("SBARQ-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SQ"), (SubLObject)SubLObjectFactory.makeSymbol("SQ-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SINV"), (SubLObject)SubLObjectFactory.makeSymbol("SINV-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)SubLObjectFactory.makeSymbol("PP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHPP"), (SubLObject)SubLObjectFactory.makeSymbol("WHPP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADVP"), (SubLObject)SubLObjectFactory.makeSymbol("ADVP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHADVP"), (SubLObject)SubLObjectFactory.makeSymbol("WHADVP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADJP"), (SubLObject)SubLObjectFactory.makeSymbol("ADJP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHADJP"), (SubLObject)SubLObjectFactory.makeSymbol("WHADJP-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FRAG"), (SubLObject)SubLObjectFactory.makeSymbol("FRAG-TREE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("X"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE")) });
        $str246$__P_ = SubLObjectFactory.makeString("#<P(");
        $str247$__ = SubLObjectFactory.makeString("):");
        $list248 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the string of this phrase-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)parse_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTRACT-STRING?"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-STRING")), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString(" ")), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $sym249$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $str250$ = SubLObjectFactory.makeString("");
        $str251$_ = SubLObjectFactory.makeString(" ");
        $sym252$PHRASE_TREE_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-STRING-METHOD");
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of words of this phrase-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))));
        $kw254$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $sym255$PHRASE_TREE_YIELD_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-YIELD-METHOD");
        $sym256$GET_PARSE_EXPRESSION = SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION");
        $list257 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the parse-expression of this phrase-tree\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-EXPRESSION"))), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION")))));
        $sym258$PHRASE_TREE_GET_PARSE_EXPRESSION_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-PARSE-EXPRESSION-METHOD");
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the heads of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")))));
        $sym260$PHRASE_TREE_GET_HEADS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-HEADS-METHOD");
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the semantic heads of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")))));
        $sym262$PHRASE_TREE_GET_SEMANTIC_HEADS_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-SEMANTIC-HEADS-METHOD");
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param INDEX integerp\n   @return parse-tree-p; the INDEX'th daughter of this parse tree, or nil if it doesn't exist"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"))));
        $sym264$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym265$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym266$PHRASE_TREE_GET_DAUGHTER_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-DAUGHTER-METHOD");
        $sym267$GET_DESCENDANT = SubLObjectFactory.makeSymbol("GET-DESCENDANT");
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"));
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PATH listp; a list of non-negative integers\n   @return parse-tree-p; the parse tree a location PATH, starting from the root\n   of this phrase-tree, or nil if there is no such parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("DTRS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("PATH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DTRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DTRS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("DTRS"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"))));
        $sym270$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym271$PHRASE_TREE_GET_DESCENDANT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-DESCENDANT-METHOD");
        $sym272$PARSE_TREE_P = SubLObjectFactory.makeSymbol("PARSE-TREE-P");
        $sym273$SEARCH = SubLObjectFactory.makeSymbol("SEARCH");
        $list274 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)parse_tree.ONE_INTEGER));
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; the string to search for \n   @param N positive-integer-p; the desired occurrence\n   @return parse-tree-p; the first tree whose string is equal to STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("M"), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-WORD-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("M")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("M"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")))))));
        $sym276$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym277$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym278$PHRASE_TREE_SEARCH_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-SEARCH-METHOD");
        $list279 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integerp; the number of daughters of this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS"))));
        $sym280$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym281$PHRASE_TREE_DAUGHTER_COUNT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-DAUGHTER-COUNT-METHOD");
        $list282 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase tree has all words as daughters, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-IF-NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P")), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))));
        $sym283$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym284$PHRASE_TREE_PRETERMINAL_P_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-PRETERMINAL-P-METHOD");
        $sym285$HYDRA_P = SubLObjectFactory.makeSymbol("HYDRA-P");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase tree is multi-headed (a hydra), nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS")))), (SubLObject)parse_tree.ONE_INTEGER)));
        $sym287$PHRASE_TREE_HYDRA_P_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-HYDRA-P-METHOD");
        $sym288$FIND = SubLObjectFactory.makeSymbol("FIND");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $list290 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PREDICATE symbolp\n   @return listp; a list of all daughters of this phrase-tree which satisfies\n   PREDICATE, from left to right"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOUND"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("STOP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("start(~A) after stop(~A) when finding ~S in ~S~%"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("STOP"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("STOP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND")))));
        $sym291$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $str292$start__A__after_stop__A__when_fin = SubLObjectFactory.makeString("start(~A) after stop(~A) when finding ~S in ~S~%");
        $sym293$PHRASE_TREE_FIND_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-FIND-METHOD");
        $sym294$FIND_FIRST = SubLObjectFactory.makeSymbol("FIND-FIRST");
        $list295 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)parse_tree.ZERO_INTEGER));
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PREDICATE symbolp\n   @return parse-tree-p; the first daughter of this phrase passing PREDICATE, starting\n   at daughter START"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL)));
        $sym297$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym298$PHRASE_TREE_FIND_FIRST_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-FIND-FIRST-METHOD");
        $sym299$FIND_LAST = SubLObjectFactory.makeSymbol("FIND-LAST");
        $list300 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PREDICATE symbolp\n   @return parse-tree-p; the last daughter of this phrase passing PREDICATE, ending\n   at daughter END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MINUSP"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree.NIL)));
        $sym302$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym303$PHRASE_TREE_FIND_LAST_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-FIND-LAST-METHOD");
        $sym304$FIND_ALL = SubLObjectFactory.makeSymbol("FIND-ALL");
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PREDICATE symbolp\n   @return listp; a list of all daughters of this phrase-tree whose category is\n   CATEGORY, from left to right, recursing down into daughters"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOUND"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("STOP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-DESCENDANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("THE-DESCENDANT"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND")))));
        $sym306$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym307$PHRASE_TREE_FIND_ALL_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-FIND-ALL-METHOD");
        $sym308$FIND_ALL_SUBTREES_OF_CATEGORIES = SubLObjectFactory.makeSymbol("FIND-ALL-SUBTREES-OF-CATEGORIES");
        $list309 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $list310 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param pos-list listp; a list of keyword syntactic categories\n   @return listp; a list of all subtrees of self that have any of the categories in CATEGORY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAT"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE")), (SubLObject)SubLObjectFactory.makeSymbol("CAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym311$PHRASE_TREE_FIND_ALL_SUBTREES_OF_CATEGORIES_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-FIND-ALL-SUBTREES-OF-CATEGORIES-METHOD");
        $kw312$STRING = SubLObjectFactory.makeKeyword("STRING");
        $sym313$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $const314$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list315 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'s"), (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString("."), (SubLObject)SubLObjectFactory.makeString("!"), (SubLObject)SubLObjectFactory.makeString("?"), (SubLObject)SubLObjectFactory.makeString(";"));
        $sym316$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $sym317$GET_VERBAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT");
        $const318$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $list319 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("who"), (SubLObject)SubLObjectFactory.makeString("where"), (SubLObject)SubLObjectFactory.makeString("when"), (SubLObject)SubLObjectFactory.makeString("how"));
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("which"), (SubLObject)SubLObjectFactory.makeString("what"));
        $str321$what = SubLObjectFactory.makeString("what");
        $sym322$NOMINAL_PHRASE_TREE = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE");
        $list323 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-NOUN-PHRASE"));
        $list324 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SPECIFIER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSIVE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-TREE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym325$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-CLASS");
        $sym326$SUBLOOP_RESERVED_INITIALIZE_NOMINAL_PHRASE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-PHRASE-TREE-INSTANCE");
        $sym327$GET_DETERMINER = SubLObjectFactory.makeSymbol("GET-DETERMINER");
        $list328 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the determiner of this NP, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DETERMINER")))))));
        $sym329$NOMINAL_PHRASE_TREE_GET_DETERMINER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-DETERMINER-METHOD");
        $sym330$GET_OVERT_QUANTIFIER = SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER");
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the quantifier of this NP, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OVERT-QUANTIFIER")))))));
        $sym332$NOMINAL_PHRASE_TREE_GET_OVERT_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-OVERT-QUANTIFIER-METHOD");
        $sym333$GET_QUANTIFIER = SubLObjectFactory.makeSymbol("GET-QUANTIFIER");
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the quantifier of this NP, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIER")))))));
        $sym335$NOMINAL_PHRASE_TREE_GET_QUANTIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-QUANTIFIER-METHOD");
        $sym336$GET_POSSESSOR = SubLObjectFactory.makeSymbol("GET-POSSESSOR");
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the quantifier of this NP, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POSSESSOR")))))));
        $sym338$NOMINAL_PHRASE_TREE_GET_POSSESSOR_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-POSSESSOR-METHOD");
        $sym339$GET_SPECIFIER = SubLObjectFactory.makeSymbol("GET-SPECIFIER");
        $list340 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the quantifier of this NP, or nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SPECIFIER")))))));
        $sym341$NOMINAL_PHRASE_TREE_GET_SPECIFIER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-SPECIFIER-METHOD");
        $sym342$POSSESSIVE_P = SubLObjectFactory.makeSymbol("POSSESSIVE-P");
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this phrase is a possessive, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))))))));
        $sym344$NOMINAL_PHRASE_TREE_POSSESSIVE_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-POSSESSIVE-P-METHOD");
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is temporal, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-TREE-P")))))));
        $sym346$NOMINAL_PHRASE_TREE_TEMPORAL_TREE_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-TEMPORAL-TREE-P-METHOD");
        $sym347$DEFINITE_DESCRIPTION_P = SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P");
        $list348 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is a definite description, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P")))))));
        $sym349$NOMINAL_PHRASE_TREE_DEFINITE_DESCRIPTION_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-DEFINITE-DESCRIPTION-P-METHOD");
        $sym350$NAME_TREE_P = SubLObjectFactory.makeSymbol("NAME-TREE-P");
        $list351 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is a name, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"))))));
        $sym352$NOMINAL_PHRASE_TREE_NAME_TREE_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-NAME-TREE-P-METHOD");
        $sym353$GET_GENDER = SubLObjectFactory.makeSymbol("GET-GENDER");
        $list354 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of genders of this np with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GENDER")))))));
        $sym355$NOMINAL_PHRASE_TREE_GET_GENDER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-GENDER-METHOD");
        $sym356$GET_NUMBER = SubLObjectFactory.makeSymbol("GET-NUMBER");
        $list357 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this np with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER")))))));
        $sym358$NOMINAL_PHRASE_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-NUMBER-METHOD");
        $sym359$GET_PERSON = SubLObjectFactory.makeSymbol("GET-PERSON");
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the person of this noun; 1, 2, or 3"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON")))))));
        $sym361$NOMINAL_PHRASE_TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-PERSON-METHOD");
        $sym362$SINGULAR_P = SubLObjectFactory.makeSymbol("SINGULAR-P");
        $list363 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is singular, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SINGULAR-P")))))));
        $sym364$NOMINAL_PHRASE_TREE_SINGULAR_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-SINGULAR-P-METHOD");
        $sym365$PLURAL_P = SubLObjectFactory.makeSymbol("PLURAL-P");
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this tree is plural, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLURAL-P")))))));
        $sym367$NOMINAL_PHRASE_TREE_PLURAL_P_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-PLURAL-P-METHOD");
        $list368 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; a version of this np in which multi-word\n   lemmata have been conflated into single words and each word has\n   lexical entries added\n   @side-effects this tree's daughters will be destructively modified"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOVECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-DESCRIPTION-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-LEXES"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COPY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTRODUCES-TERM?"), (SubLObject)SubLObjectFactory.makeSymbol("LEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INSTANCE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJOIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)parse_tree.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTED-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym369$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym370$COPY = SubLObjectFactory.makeSymbol("COPY");
        $sym371$GET_INSTANCE = SubLObjectFactory.makeSymbol("GET-INSTANCE");
        $kw372$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $sym373$SET = SubLObjectFactory.makeSymbol("SET");
        $const374$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw375$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $sym376$LEXES = SubLObjectFactory.makeSymbol("LEXES");
        $sym377$NOMINAL_PHRASE_TREE_LEXIFY_INT_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-LEXIFY-INT-METHOD");
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all head daughters of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)parse_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("$")), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("CD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)parse_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("CD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)parse_tree.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VBG-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRETERMINAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER")))))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"))))))))));
        $kw379$CD = SubLObjectFactory.makeKeyword("CD");
        $sym380$COORDINATE_PHRASE_P = SubLObjectFactory.makeSymbol("COORDINATE-PHRASE-P");
        $sym381$NOMINAL_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-TREE-P");
        $sym382$NOMINAL_WORD_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-P");
        $sym383$NOMINAL_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P");
        $sym384$NOMINAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym385$NP_TREE = SubLObjectFactory.makeSymbol("NP-TREE");
        $sym386$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NP-TREE-CLASS");
        $sym387$SUBLOOP_RESERVED_INITIALIZE_NP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NP-TREE-INSTANCE");
        $sym388$NPP_TREE = SubLObjectFactory.makeSymbol("NPP-TREE");
        $sym389$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-CLASS");
        $sym390$SUBLOOP_RESERVED_INITIALIZE_NPP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NPP-TREE-INSTANCE");
        $sym391$NX_TREE = SubLObjectFactory.makeSymbol("NX-TREE");
        $sym392$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NX-TREE-CLASS");
        $sym393$SUBLOOP_RESERVED_INITIALIZE_NX_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NX-TREE-INSTANCE");
        $sym394$PNP_TREE = SubLObjectFactory.makeSymbol("PNP-TREE");
        $list395 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym396$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-CLASS");
        $sym397$SUBLOOP_RESERVED_INITIALIZE_PNP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PNP-TREE-INSTANCE");
        $list398 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this pnp tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"))))));
        $sym399$PNP_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("PNP-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym400$WHNP_TREE = SubLObjectFactory.makeSymbol("WHNP-TREE");
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE"));
        $sym402$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-CLASS");
        $sym403$SUBLOOP_RESERVED_INITIALIZE_WHNP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHNP-TREE-INSTANCE");
        $sym404$VERBAL_PHRASE_TREE = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE");
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-VERB-PHRASE"));
        $list406 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-TO-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VP-COORDINATE-PHRASE-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP-COORDINATION"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym407$CYCLIFY_INT_VP_COORDINATION = SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP-COORDINATION");
        $list408 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONJUNCTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VP"), (SubLObject)SubLObjectFactory.makeSymbol("VPS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP"))), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")))))));
        $sym409$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $sym410$CYCLIFY_INT_VP = SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP");
        $sym411$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_COORDINATION_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-COORDINATION-METHOD");
        $list412 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEADS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-CONJUNCTION-CYCLS"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-CYCLIFIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFICATION-IN-PROGRESS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFICATION-IN-PROGRESS*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-HEAD-CYCLS"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MOD-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-RLE-CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANKED-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-VERBAL-CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMED0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-LEX-RENAMING"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMED0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFY-IMPLICIT-SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMED0")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-VERBAL-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAMING-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMED"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-CYCLS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE-CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-VERBAL-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-RLE-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-RLE-CYCLS")), (SubLObject)SubLObjectFactory.makeSymbol("ALL-HEAD-CYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-HEAD-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-CONJUNCTION-CYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-HEAD-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-CONJUNCTION-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS0"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-HEAD-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), (SubLObject)parse_tree.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM2"))), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-CYCLS")))), (SubLObject)SubLObjectFactory.makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS0"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))));
        $sym413$GET_SEMANTIC_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-COMPLEMENTS");
        $sym414$GET_KEYWORD_RENAMINGS = SubLObjectFactory.makeSymbol("GET-KEYWORD-RENAMINGS");
        $sym415$VERBAL_PHRASE_TREE_CYCLIFY_INT_VP_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-CYCLIFY-INT-VP-METHOD");
        $list416 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VP-COORDINATE-PHRASE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP-COORDINATION"))))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VP-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT-VP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-VP-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VP-CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("VP-CYCLS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-VP-CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE-SCOPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CROSS-PRODUCTS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-VP-CYCLS")))))))));
        $sym417$VP_COORDINATE_PHRASE_P = SubLObjectFactory.makeSymbol("VP-COORDINATE-PHRASE-P");
        $sym418$VERBAL_PHRASE_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-CYCLIFY-INT-METHOD");
        $list419 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONJUNCTION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER-IF-NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-VERB-PHRASE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))))))));
        $sym420$CYCLIFIABLE_VERB_PHRASE_P = SubLObjectFactory.makeSymbol("CYCLIFIABLE-VERB-PHRASE-P");
        $sym421$VERBAL_PHRASE_TREE_VP_COORDINATE_PHRASE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-VP-COORDINATE-PHRASE-P-METHOD");
        $sym422$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-CLASS");
        $sym423$SUBLOOP_RESERVED_INITIALIZE_VERBAL_PHRASE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-PHRASE-TREE-INSTANCE");
        $sym424$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $list425 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree-p; the predicate of this sentence"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD")))));
        $sym426$VERBAL_PHRASE_TREE_GET_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-PREDICATE-METHOD");
        $list427 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of numbers of this vp with possible number values\n   :SINGULAR and :PLURAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NUMBER")))))));
        $sym428$VERBAL_PHRASE_TREE_GET_NUMBER_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-NUMBER-METHOD");
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the person of this vp; 1, 2, or 3"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PERSON")))))));
        $sym430$VERBAL_PHRASE_TREE_GET_PERSON_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-PERSON-METHOD");
        $sym431$GET_TENSE = SubLObjectFactory.makeSymbol("GET-TENSE");
        $list432 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TENSE")))))));
        $sym433$VERBAL_PHRASE_TREE_GET_TENSE_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-TENSE-METHOD");
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("IDX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")))));
        $sym435$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-PHRASE-TREE-METHOD");
        $sym436$VERBAL_PHRASE_TREE_GET_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-SUBJECT-METHOD");
        $sym437$GET_OBJECTS = SubLObjectFactory.makeSymbol("GET-OBJECTS");
        $list438 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all objects of this tree, in surface order"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))))));
        $sym439$VERBAL_PHRASE_TREE_GET_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-OBJECTS-METHOD");
        $sym440$GET_DIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT");
        $list441 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the direct object of this verb phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT")))))));
        $sym442$VERBAL_PHRASE_TREE_GET_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-DIRECT-OBJECT-METHOD");
        $sym443$GET_INDIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT");
        $list444 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the indirect object of this verb phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT")))))));
        $sym445$VERBAL_PHRASE_TREE_GET_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-INDIRECT-OBJECT-METHOD");
        $sym446$GET_SEMANTIC_DIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT");
        $list447 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic direct object of this verb phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))))));
        $sym448$VERBAL_PHRASE_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD");
        $sym449$GET_SEMANTIC_INDIRECT_OBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT");
        $list450 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic indirect object of this verb phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))))));
        $sym451$VERBAL_PHRASE_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");
        $sym452$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $list453 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return phrase-tree-p; the semantic subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))))));
        $sym454$VERBAL_PHRASE_TREE_GET_SEMANTIC_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-SEMANTIC-SUBJECT-METHOD");
        $sym455$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $list456 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of the semantic subject of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS")))))));
        $sym457$VERBAL_PHRASE_TREE_GET_SEMANTIC_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-SEMANTIC-OBJECTS-METHOD");
        $list458 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all verbal complements of this verbal tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))))));
        $sym459$VERBAL_PHRASE_TREE_GET_VERBAL_COMPLEMENT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-VERBAL-COMPLEMENT-METHOD");
        $sym460$COPULA_P = SubLObjectFactory.makeSymbol("COPULA-P");
        $list461 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase-tree is a copula construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA-P")))))));
        $sym462$VERBAL_PHRASE_TREE_COPULA_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-COPULA-P-METHOD");
        $sym463$DUMMY_TO_P = SubLObjectFactory.makeSymbol("DUMMY-TO-P");
        $list464 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase-tree is a dummy 'to' construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)parse_tree.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("to")))));
        $str465$to = SubLObjectFactory.makeString("to");
        $sym466$VERBAL_PHRASE_TREE_DUMMY_TO_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-DUMMY-TO-P-METHOD");
        $sym467$PASSIVE_P = SubLObjectFactory.makeSymbol("PASSIVE-P");
        $list468 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase-tree is a passive construction, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P")))))));
        $sym469$VERBAL_PHRASE_TREE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-PASSIVE-P-METHOD");
        $sym470$FINITE_P = SubLObjectFactory.makeSymbol("FINITE-P");
        $list471 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this phrase tree is finite, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINITE-VERBAL-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))));
        $sym472$VERBAL_PHRASE_TREE_FINITE_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-FINITE-P-METHOD");
        $sym473$PARTITION_SEMANTIC_COMPLEMENTS = SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS");
        $list474 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS")))))));
        $sym475$VERBAL_PHRASE_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");
        $sym476$GET_ANCESTOR_OBJECTS = SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS");
        $list477 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the local syntactic objects of this tree and its ancestors"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")))))));
        $sym478$OUTER_CATCH_FOR_VERBAL_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-PHRASE-TREE-METHOD");
        $sym479$INVERTED_P = SubLObjectFactory.makeSymbol("INVERTED-P");
        $sym480$VERBAL_PHRASE_TREE_GET_ANCESTOR_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-ANCESTOR-OBJECTS-METHOD");
        $list481 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this verbal phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")))))));
        $sym482$VERBAL_WORD_TREE_P = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-P");
        $sym483$VERBAL_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P");
        $sym484$VERBAL_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $list485 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this verbal tree is inverted, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P")))))));
        $sym486$VERBAL_PHRASE_TREE_INVERTED_P_METHOD = SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-INVERTED-P-METHOD");
        $sym487$SENTENTIAL_TREE = SubLObjectFactory.makeSymbol("SENTENTIAL-TREE");
        $list488 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE"));
        $list489 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym490$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-CLASS");
        $sym491$SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-TREE-INSTANCE");
        $list492 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return np-tree-p; the subject of this sentence"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANCESTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))))))));
        $sym493$SENTENTIAL_TREE_GET_SUBJECT_METHOD = SubLObjectFactory.makeSymbol("SENTENTIAL-TREE-GET-SUBJECT-METHOD");
        $list494 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the constituents this sentence modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-CLAUSE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANTECEDENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-HEAD")))))));
        $sym495$GET_ANTECEDENT = SubLObjectFactory.makeSymbol("GET-ANTECEDENT");
        $sym496$SENTENTIAL_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("SENTENTIAL-TREE-GET-MODIFIEDS-METHOD");
        $sym497$VP_TREE = SubLObjectFactory.makeSymbol("VP-TREE");
        $sym498$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VP-TREE-CLASS");
        $sym499$SUBLOOP_RESERVED_INITIALIZE_VP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VP-TREE-INSTANCE");
        $sym500$VG_TREE = SubLObjectFactory.makeSymbol("VG-TREE");
        $sym501$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VG-TREE-CLASS");
        $sym502$SUBLOOP_RESERVED_INITIALIZE_VG_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VG-TREE-INSTANCE");
        $sym503$S1_TREE = SubLObjectFactory.makeSymbol("S1-TREE");
        $sym504$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-S1-TREE-CLASS");
        $sym505$SUBLOOP_RESERVED_INITIALIZE_S1_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-S1-TREE-INSTANCE");
        $sym506$S_TREE = SubLObjectFactory.makeSymbol("S-TREE");
        $list507 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym508$SUBLOOP_RESERVED_INITIALIZE_S_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-S-TREE-CLASS");
        $sym509$SUBLOOP_RESERVED_INITIALIZE_S_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-S-TREE-INSTANCE");
        $list510 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the local syntactic objects of this tree and its ancestors"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-CLAUSE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))))));
        $sym511$OUTER_CATCH_FOR_S_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-S-TREE-METHOD");
        $sym512$S_TREE_GET_ANCESTOR_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("S-TREE-GET-ANCESTOR-OBJECTS-METHOD");
        $sym513$SBAR_TREE = SubLObjectFactory.makeSymbol("SBAR-TREE");
        $sym514$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-CLASS");
        $sym515$SUBLOOP_RESERVED_INITIALIZE_SBAR_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SBAR-TREE-INSTANCE");
        $sym516$SBARQ_TREE = SubLObjectFactory.makeSymbol("SBARQ-TREE");
        $list517 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TREE"));
        $list518 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym519$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-CLASS");
        $sym520$SUBLOOP_RESERVED_INITIALIZE_SBARQ_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SBARQ-TREE-INSTANCE");
        $list521 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this sbarq tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DAUGHTER"))))));
        $sym522$VERBAL_TREE_P = SubLObjectFactory.makeSymbol("VERBAL-TREE-P");
        $sym523$SBARQ_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("SBARQ-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $list524 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the local syntactic objects of this tree and its ancestors"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)parse_tree.EQ))));
        $sym525$SBARQ_TREE_GET_ANCESTOR_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("SBARQ-TREE-GET-ANCESTOR-OBJECTS-METHOD");
        $sym526$SQ_TREE = SubLObjectFactory.makeSymbol("SQ-TREE");
        $list527 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym528$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-CLASS");
        $sym529$SUBLOOP_RESERVED_INITIALIZE_SQ_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SQ-TREE-INSTANCE");
        $list530 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the local syntactic objects of this tree and its ancestors"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANCESTOR-OBJECTS")))))));
        $sym531$OUTER_CATCH_FOR_SQ_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SQ-TREE-METHOD");
        $sym532$SQ_TREE_GET_ANCESTOR_OBJECTS_METHOD = SubLObjectFactory.makeSymbol("SQ-TREE-GET-ANCESTOR-OBJECTS-METHOD");
        $sym533$SINV_TREE = SubLObjectFactory.makeSymbol("SINV-TREE");
        $sym534$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-CLASS");
        $sym535$SUBLOOP_RESERVED_INITIALIZE_SINV_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SINV-TREE-INSTANCE");
        $sym536$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE");
        $list537 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STRANDED-P"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym538$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-CLASS");
        $sym539$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-INSTANCE");
        $list540 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this prepositional-or-particle-phrase-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VBG-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-TREE-P"))))));
        $sym541$PREPOSITIONAL_TREE_P = SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE-P");
        $sym542$PARTICLE_TREE_P = SubLObjectFactory.makeSymbol("PARTICLE-TREE-P");
        $sym543$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym544$GET_OBLIQUE_OBJECT = SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT");
        $list545 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return nominal-phrase-tree; the complement np of the prepositional head of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT")))))));
        $sym546$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_GET_OBLIQUE_OBJECT_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-GET-OBLIQUE-OBJECT-METHOD");
        $sym547$STRANDED_P = SubLObjectFactory.makeSymbol("STRANDED-P");
        $list548 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; non-nil if the preposition or particle of this phrase is \n   stranded, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)parse_tree.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)parse_tree.ZERO_INTEGER)))));
        $sym549$PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_STRANDED_P_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-STRANDED-P-METHOD");
        $sym550$PREPOSITIONAL_PHRASE_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-PHRASE-TREE");
        $list551 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-TREE"));
        $sym552$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-CLASS");
        $sym553$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_PHRASE_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-PHRASE-TREE-INSTANCE");
        $sym554$PP_TREE = SubLObjectFactory.makeSymbol("PP-TREE");
        $sym555$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PP-TREE-CLASS");
        $sym556$SUBLOOP_RESERVED_INITIALIZE_PP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PP-TREE-INSTANCE");
        $sym557$WHPP_TREE = SubLObjectFactory.makeSymbol("WHPP-TREE");
        $sym558$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-CLASS");
        $sym559$SUBLOOP_RESERVED_INITIALIZE_WHPP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHPP-TREE-INSTANCE");
        $sym560$PRT_TREE = SubLObjectFactory.makeSymbol("PRT-TREE");
        $list561 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-TREE"));
        $sym562$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-CLASS");
        $sym563$SUBLOOP_RESERVED_INITIALIZE_PRT_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRT-TREE-INSTANCE");
        $list564 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this prepositional-or-particle-phrase-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTICLE-TREE-P")))));
        $sym565$PRT_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("PRT-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym566$ADJP_TREE = SubLObjectFactory.makeSymbol("ADJP-TREE");
        $list567 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-TREE"));
        $sym568$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-CLASS");
        $sym569$SUBLOOP_RESERVED_INITIALIZE_ADJP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJP-TREE-INSTANCE");
        $list570 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the head daughters of this adjp-tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-TREE-P")))));
        $sym571$ADJECTIVAL_TREE_P = SubLObjectFactory.makeSymbol("ADJECTIVAL-TREE-P");
        $sym572$ADJP_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("ADJP-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $list573 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the complement of this adjective"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS")))))));
        $sym574$ADJP_TREE_GET_MODIFIEDS_METHOD = SubLObjectFactory.makeSymbol("ADJP-TREE-GET-MODIFIEDS-METHOD");
        $sym575$WHADJP_TREE = SubLObjectFactory.makeSymbol("WHADJP-TREE");
        $list576 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym577$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-CLASS");
        $sym578$SUBLOOP_RESERVED_INITIALIZE_WHADJP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHADJP-TREE-INSTANCE");
        $list579 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; a version of this np in which multi-word\n   lemmata have been conflated into single words and each word has\n   lexical entries added\n   @side-effects this tree's daughters will be destructively modified"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOVECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym580$WHADJP_TREE_LEXIFY_INT_METHOD = SubLObjectFactory.makeSymbol("WHADJP-TREE-LEXIFY-INT-METHOD");
        $sym581$ADVP_TREE = SubLObjectFactory.makeSymbol("ADVP-TREE");
        $list582 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-TREE"));
        $sym583$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-CLASS");
        $sym584$SUBLOOP_RESERVED_INITIALIZE_ADVP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVP-TREE-INSTANCE");
        $list585 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of head daughters of this adverbial tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-TREE-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-DTR"))))));
        $sym586$ADVERBIAL_TREE_P = SubLObjectFactory.makeSymbol("ADVERBIAL-TREE-P");
        $sym587$ADVP_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("ADVP-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym588$WHADVP_TREE = SubLObjectFactory.makeSymbol("WHADVP-TREE");
        $sym589$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-CLASS");
        $sym590$SUBLOOP_RESERVED_INITIALIZE_WHADVP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHADVP-TREE-INSTANCE");
        $sym591$FRAG_TREE = SubLObjectFactory.makeSymbol("FRAG-TREE");
        $sym592$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-CLASS");
        $sym593$SUBLOOP_RESERVED_INITIALIZE_FRAG_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FRAG-TREE-INSTANCE");
        $sym594$QP_TREE = SubLObjectFactory.makeSymbol("QP-TREE");
        $list595 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMERICAL-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-TREE"));
        $list596 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIED"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"), (SubLObject)parse_tree.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym597$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QP-TREE-CLASS");
        $sym598$SUBLOOP_RESERVED_INITIALIZE_QP_TREE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QP-TREE-INSTANCE");
        $list599 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of all head daughters of this phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE-P")))));
        $sym600$CARDINAL_WORD_TREE_P = SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE-P");
        $sym601$QP_TREE_GET_HEAD_DAUGHTERS_METHOD = SubLObjectFactory.makeSymbol("QP-TREE-GET-HEAD-DAUGHTERS-METHOD");
        $sym602$GET_QUANTIFIED = SubLObjectFactory.makeSymbol("GET-QUANTIFIED");
        $list603 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-tree; the word that restricts the variable that this determiner quantifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))));
        $sym604$OUTER_CATCH_FOR_QP_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QP-TREE-METHOD");
        $sym605$QP_TREE_GET_QUANTIFIED_METHOD = SubLObjectFactory.makeSymbol("QP-TREE-GET-QUANTIFIED-METHOD");
        $list606 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the CycL representation of the meaning of this quantifier phrase"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TO-INTERVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-QUANTIFIED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESTRICTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESTRICTION"), (SubLObject)SubLObjectFactory.makeSymbol("RESTRICTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("RESTRICTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCOPE"))))), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)parse_tree.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))));
        $sym607$CYCLIFY_NUCLEUS = SubLObjectFactory.makeSymbol("CYCLIFY-NUCLEUS");
        $const608$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $const609$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list610 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCOPE"));
        $sym611$QP_TREE_CYCLIFY_INT_METHOD = SubLObjectFactory.makeSymbol("QP-TREE-CYCLIFY-INT-METHOD");
    }
}

/*

	Total time: 3167 ms
	 synthetic 
*/