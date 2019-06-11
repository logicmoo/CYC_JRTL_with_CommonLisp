package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import org.armedbear.lisp.Package;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class eval_in_api_registrations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.eval_in_api_registrations";
  public static final String myFingerPrint = "484a94a20de82fd171a68fda2a60bd4ce7c6f7680716e1df7c149ab93b540bdd";
  @SubLTranslatedFile.SubL(source = "cycl/eval-in-api-registrations.lisp", position = 4495L)
  private static SubLSymbol $sublisp_api_predefined_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/eval-in-api-registrations.lisp", position = 22758L)
  private static SubLSymbol $api_host_access_functions$;
  private static final SubLSymbol $sym0$_NULL_OUTPUT_;
  private static final SubLSymbol $sym1$_IT_VERBOSE_;
  private static final SubLSymbol $sym2$_PROGRESS_NOTE_;
  private static final SubLSymbol $sym3$_PROGRESS_SOFAR_;
  private static final SubLSymbol $sym4$_PROGRESS_START_TIME_;
  private static final SubLSymbol $sym5$_PROGRESS_TOTAL_;
  private static final SubLSymbol $sym6$_EVAL_WITH_BINDINGS_;
  private static final SubLSymbol $sym7$_ERROR_OUTPUT_;
  private static final SubLSymbol $sym8$_STANDARD_OUTPUT_;
  private static final SubLSymbol $sym9$_CONTINUE_CERROR__;
  private static final SubLSymbol $sym10$_SILENT_PROGRESS__;
  private static final SubLSymbol $sym11$_IGNORE_BREAKS__;
  private static final SubLSymbol $sym12$_IGNORE_WARNS__;
  private static final SubLSymbol $sym13$_EVAL_IN_API_TRACE_LOG_;
  private static final SubLSymbol $sym14$_EVAL_IN_API_TRACED_FNS_;
  private static final SubLSymbol $sym15$_EVAL_IN_API_ENV_;
  private static final SubLSymbol $sym16$_API_OUTPUT_PROTOCOL_;
  private static final SubLSymbol $sym17$_API_RESULT_METHOD_;
  private static final SubLSymbol $sym18$_API_INPUT_PROTOCOL_;
  private static final SubLSymbol $sym19$_KE_PURPOSE_;
  private static final SubLSymbol $sym20$_THE_CYCLIST_;
  private static final SubLSymbol $sym21$_USE_LOCAL_QUEUE__;
  private static final SubLSymbol $sym22$_RELEVANT_MT_FUNCTION_;
  private static final SubLSymbol $sym23$_CYC_BOOKKEEPING_INFO_;
  private static final SubLSymbol $sym24$_SUPPRESS_SBHL_RECACHING__;
  private static final SubLSymbol $sym25$_PARAPHRASE_PRECISION_;
  private static final SubLSymbol $sym26$_EVAL_IN_API_LEVEL_;
  private static final SubLSymbol $sym27$_SUSPEND_SBHL_TYPE_CHECKING__;
  private static final SubLSymbol $sym28$_REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS_;
  private static final SubLSymbol $sym29$_TASK_PROCESSOR_VERBOSITY_;
  private static final SubLSymbol $sym30$BQ_APPEND;
  private static final SubLSymbol $sym31$BQ_LIST;
  private static final SubLSymbol $sym32$BQ_LIST_;
  private static final SubLSymbol $sym33$BQ_NCONC;
  private static final SubLSymbol $sym34$BQ_VECTOR_APPEND;
  private static final SubLSymbol $sym35$LIST;
  private static final SubLSymbol $sym36$API_BQ_LIST;
  private static final SubLSymbol $sym37$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym38$WITH_PRECISE_PARAPHRASE_ON;
  private static final SubLSymbol $sym39$WITH_PARAPHRASE_PRECISION;
  private static final SubLSymbol $sym40$WITH_BOOKKEEPING_INFO;
  private static final SubLSymbol $sym41$WITH_MT_FUNCTION;
  private static final SubLSymbol $sym42$WITH_GENL_MTS;
  private static final SubLSymbol $sym43$WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym44$WITH_ALL_MTS;
  private static final SubLSymbol $sym45$DO_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $sym46$DO_RULE_INDEX;
  private static final SubLSymbol $sym47$WITHOUT_WFF_SEMANTICS;
  private static final SubLSymbol $sym48$CDOLIST_DONE;
  private static final SubLSymbol $sym49$DO_DICTIONARY;
  private static final SubLSymbol $sym50$PROGRESS_CDOTIMES;
  private static final SubLSymbol $sym51$DO_KB_SUID_TABLE;
  private static final SubLSymbol $sym52$DO_ID_INDEX;
  private static final SubLSymbol $sym53$OLD_DO_ID_INDEX;
  private static final SubLSymbol $sym54$NEW_DO_ID_INDEX;
  private static final SubLSymbol $sym55$DO_CONSTANTS;
  private static final SubLSymbol $sym56$CWITH_OUTPUT_TO_STRING;
  private static final SubLSymbol $sym57$WITH_INPUT_FROM_STRING;
  private static final SubLSymbol $sym58$DO_VECTOR_INDEX;
  private static final SubLSymbol $sym59$IN_MT;
  private static final SubLSymbol $sym60$DO_ITERATOR_WITHOUT_VALUES_PROGRESS;
  private static final SubLSymbol $sym61$WITH_OPEN_STREAM;
  private static final SubLSymbol $sym62$WITH_OPEN_FILE;
  private static final SubLSymbol $sym63$WITH_TCP_CONNECTION;
  private static final SubLObject $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$STRING_TO_GUID;
  private static final SubLSymbol $sym68$GUID_TO_STRING;
  private static final SubLSymbol $sym69$REMOVE_DUPLICATES;
  private static final SubLSymbol $sym70$NEW_BOOKKEEPING_INFO;
  private static final SubLSymbol $sym71$STRING_SUBSTITUTE;
  private static final SubLSymbol $sym72$GENERATE_PHRASE;
  private static final SubLSymbol $sym73$THE_DATE;
  private static final SubLSymbol $sym74$THE_SECOND;
  private static final SubLSymbol $sym75$ISA;
  private static final SubLSymbol $sym76$GENLS;
  private static final SubLSymbol $sym77$WHY_COLLECTIONS_INTERSECT_;
  private static final SubLSymbol $sym78$ARG1_FORMAT;
  private static final SubLSymbol $sym79$ARG2_FORMAT;
  private static final SubLSymbol $sym80$SPECS;
  private static final SubLSymbol $sym81$COLLECTION_LEAVES;
  private static final SubLSymbol $sym82$SIMPLE_INDEXED_TERM_P;
  private static final SubLSymbol $sym83$MAX_SPECS;
  private static final SubLSymbol $sym84$MIN_ISA;
  private static final SubLSymbol $sym85$LOCAL_DISJOINT_WITH;
  private static final SubLSymbol $sym86$DISJOINT_WITH_;
  private static final SubLSymbol $sym87$GENL_SIBLINGS;
  private static final SubLSymbol $sym88$SPEC_SIBLINGS;
  private static final SubLSymbol $sym89$ARG1_ISA;
  private static final SubLSymbol $sym90$ARG2_ISA;
  private static final SubLSymbol $sym91$ARGN_ISA;
  private static final SubLSymbol $sym92$ARGN_GENL;
  private static final SubLSymbol $sym93$ALL_GENLS_IN_ANY_MT;
  private static final SubLSymbol $sym94$ALL_ISA_IN_ANY_MT;
  private static final SubLSymbol $sym95$ALL_FORT_INSTANCES_IN_ALL_MTS;
  private static final SubLSymbol $sym96$ISA_IN_ANY_MT_;
  private static final SubLSymbol $sym97$GENL_IN_ANY_MT_;
  private static final SubLSymbol $sym98$NEW_CONSTANT_NAME_SPEC_P;
  private static final SubLSymbol $sym99$DO_RULE_INDEX_RULES;
  private static final SubLSymbol $sym100$BT_LOWER;
  private static final SubLSymbol $sym101$BT_HIGHER;
  private static final SubLSymbol $sym102$SAMPLE_LEAF_SPECS;
  private static final SubLSymbol $sym103$TACIT_COEXTENSIONAL_;
  private static final SubLSymbol $sym104$EL_WFF_;
  private static final SubLSymbol $sym105$EVALUATABLE_PREDICATE_;
  private static final SubLSymbol $sym106$HIERARCHICAL_COLLECTIONS_;
  private static final SubLSymbol $sym107$NUM_BEST_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym108$API_QUIT;
  private static final SubLSymbol $sym109$NART_P;
  private static final SubLSymbol $sym110$EL_VARIABLE_P;
  private static final SubLSymbol $sym111$PPH_PRECISION_P;
  private static final SubLSymbol $sym112$FORT_FOR_STRING;
  private static final SubLSymbol $sym113$RTP_PARSE_EXP_W_VPP;
  private static final SubLSymbol $sym114$GET_UNIVERSAL_TIME;
  private static final SubLSymbol $sym115$DECODE_UNIVERSAL_TIME;
  private static final SubLSymbol $sym116$FIND_NART;
  private static final SubLSymbol $sym117$CONSTANT_GUID;
  private static final SubLSymbol $sym118$RKF_PHRASE_READER;
  private static final SubLSymbol $sym119$GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES;
  private static final SubLSymbol $sym120$LOAD_TRANSCRIPT_FILE;
  private static final SubLSymbol $sym121$KB_STATISTICS;
  private static final SubLSymbol $sym122$GENL_MT_;
  private static final SubLSymbol $sym123$ALL_SPEC_MTS;
  private static final SubLSymbol $sym124$REMOVAL_ASK;
  private static final SubLSymbol $sym125$DO_NARTS_TABLE;
  private static final SubLSymbol $sym126$ID_INDEX_COUNT;
  private static final SubLSymbol $sym127$ID_INDEX_DENSE_OBJECTS;
  private static final SubLSymbol $sym128$ID_INDEX_EMPTY_P;
  private static final SubLSymbol $sym129$ID_INDEX_SPARSE_ID_THRESHOLD;
  private static final SubLSymbol $sym130$ID_INDEX_NEXT_ID;
  private static final SubLSymbol $sym131$CYCL_NART_P;
  private static final SubLSymbol $sym132$CYCL_NAUT_P;
  private static final SubLSymbol $sym133$RESOLVE_NEW_CONSTANTS;
  private static final SubLSymbol $sym134$CYC_OPENCYC_FEATURE;
  private static final SubLSymbol $sym135$CYC_RESEARCHCYC_FEATURE;
  private static final SubLSymbol $sym136$CANONICALIZE_HLMT;
  private static final SubLSymbol $sym137$NEW_CYC_QUERY;
  private static final SubLSymbol $sym138$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE;
  private static final SubLSymbol $sym139$INFERENCE_REMOVAL_MODULE;
  private static final SubLSymbol $sym140$UNDECLARE_INFERENCE_REMOVAL_MODULE;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLList $list143;
  private static final SubLList $list144;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLList $list147;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$__;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$PHRASE_FOR_MT;
  private static final SubLSymbol $sym155$NOTING_PROGRESS;
  private static final SubLSymbol $sym156$NOTE_PROGRESS;
  private static final SubLSymbol $sym157$NEW_ALEXANDRIA_ITERATOR;
  private static final SubLSymbol $sym158$ALEXANDRIA_KB_STORE_ITERATOR_DONE;
  private static final SubLSymbol $sym159$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym160$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA;
  private static final SubLSymbol $sym161$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED;
  private static final SubLSymbol $sym162$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE;
  private static final SubLSymbol $sym163$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR;
  private static final SubLSymbol $sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER;
  private static final SubLSymbol $sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO;
  private static final SubLSymbol $sym166$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR;
  private static final SubLSymbol $sym167$NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR;
  private static final SubLSymbol $sym168$COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA;
  private static final SubLSymbol $sym169$COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT;
  private static final SubLSymbol $sym170$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE;
  private static final SubLSymbol $sym171$NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR;
  private static final SubLSymbol $sym172$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE;
  private static final SubLSymbol $sym173$NEW_ALEXANDRIA_ALL_FORTS_ITERATOR;
  private static final SubLSymbol $sym174$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE;
  private static final SubLSymbol $sym175$NEW_ALEXANDRIA_ALL_GAFS_ITERATOR;
  private static final SubLSymbol $sym176$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE;
  private static final SubLSymbol $sym177$NEW_ALEXANDRIA_ALL_RULES_ITERATOR;
  private static final SubLSymbol $sym178$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE;
  private static final SubLSymbol $sym179$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR;
  private static final SubLSymbol $sym180$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE;
  private static final SubLSymbol $sym181$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym182$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE;
  private static final SubLSymbol $sym183$NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR;
  private static final SubLSymbol $sym184$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE;
  private static final SubLSymbol $sym185$NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR;
  private static final SubLSymbol $sym186$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE;
  private static final SubLSymbol $sym187$NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR;
  private static final SubLSymbol $sym188$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE;
  private static final SubLSymbol $sym189$NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR;
  private static final SubLSymbol $sym190$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE;
  private static final SubLSymbol $sym191$NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR;
  private static final SubLSymbol $sym192$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE;
  private static final SubLSymbol $sym193$NEW_ALEXANDRIA_ALL_NARTS_ITERATOR;
  private static final SubLSymbol $sym194$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE;
  private static final SubLSymbol $sym195$NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR;
  private static final SubLSymbol $sym196$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE;
  private static final SubLSymbol $sym197$NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR;
  private static final SubLSymbol $sym198$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE;
  private static final SubLSymbol $sym199$NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR;
  private static final SubLSymbol $sym200$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE;
  private static final SubLSymbol $sym201$NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR;
  private static final SubLSymbol $sym202$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE;
  private static final SubLSymbol $sym203$NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR;
  private static final SubLSymbol $sym204$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE;
  private static final SubLSymbol $sym205$NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR;
  private static final SubLSymbol $sym206$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE;
  private static final SubLSymbol $sym207$NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR;
  private static final SubLSymbol $sym208$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE;
  private static final SubLSymbol $sym209$NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR;
  private static final SubLSymbol $sym210$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE;
  private static final SubLSymbol $sym211$NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR;
  private static final SubLSymbol $sym212$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE;
  private static final SubLSymbol $sym213$NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR;
  private static final SubLSymbol $sym214$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE;
  private static final SubLSymbol $sym215$NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR;
  private static final SubLSymbol $sym216$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE;
  private static final SubLSymbol $sym217$NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR;
  private static final SubLSymbol $sym218$COUNT_ALEXANDRIA_TERM_ASSERTIONS;
  private static final SubLSymbol $sym219$CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE;
  private static final SubLSymbol $sym220$NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR;
  private static final SubLSymbol $sym221$COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED;
  private static final SubLSymbol $sym222$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE;
  private static final SubLSymbol $sym223$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR;
  private static final SubLSymbol $sym224$COUNT_ALEXANDRIA_GAF_ARG0;
  private static final SubLSymbol $sym225$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE;
  private static final SubLSymbol $sym226$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT;
  private static final SubLSymbol $sym227$COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT;
  private static final SubLSymbol $sym228$CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE;
  private static final SubLSymbol $sym229$NEW_ALEXANDRIA_GAF_ARG_ITERATOR;
  private static final SubLSymbol $sym230$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE;
  private static final SubLSymbol $sym231$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR;
  private static final SubLSymbol $sym232$COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED;
  private static final SubLSymbol $sym233$COUNT_ALEXANDRIA_GAF_ARG;
  private static final SubLSymbol $sym234$NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR;
  private static final SubLSymbol $sym235$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE;
  private static final SubLSymbol $sym236$COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED;
  private static final SubLSymbol $sym237$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED;
  private static final SubLSymbol $sym238$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED;
  private static final SubLSymbol $sym239$COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED;
  private static final SubLSymbol $sym240$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE;
  private static final SubLSymbol $sym241$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR;
  private static final SubLSymbol $sym242$COUNT_ALEXANDRIA_MT_CONTENTS;
  private static final SubLSymbol $sym243$CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE;
  private static final SubLSymbol $sym244$NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR;
  private static final SubLSymbol $sym245$COUNT_ALEXANDRIA_RULES_WITH_PRED;
  private static final SubLSymbol $sym246$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE;
  private static final SubLSymbol $sym247$NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym248$COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT;
  private static final SubLSymbol $sym249$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE;
  private static final SubLSymbol $sym250$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR;
  private static final SubLSymbol $sym251$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2;
  private static final SubLSymbol $sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S;
  private static final SubLSymbol $sym253$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym254$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT;
  private static final SubLSymbol $sym255$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE;
  private static final SubLSymbol $sym256$NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym257$COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT;
  private static final SubLSymbol $sym258$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE;
  private static final SubLSymbol $sym259$NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR;
  private static final SubLSymbol $sym260$COUNT_ALEXANDRIA_NART_ARG_INDEX;
  private static final SubLSymbol $sym261$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE;
  private static final SubLSymbol $sym262$NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR;
  private static final SubLSymbol $sym263$BEST_STRING_OF_NL_PHRASE_DEFN;
  private static final SubLSymbol $sym264$CYC_1_BYTE_INTEGER;
  private static final SubLSymbol $sym265$CYC_2_BYTE_INTEGER;
  private static final SubLSymbol $sym266$CYC_4_BYTE_INTEGER;
  private static final SubLSymbol $sym267$CYC_8_BYTE_INTEGER;
  private static final SubLSymbol $sym268$CYC_ABSOLUTE_VALUE;
  private static final SubLSymbol $sym269$CYC_ADD_ENGLISH_SUFFIX;
  private static final SubLSymbol $sym270$CYC_ARC_COSECANT;
  private static final SubLSymbol $sym271$CYC_ARC_COSINE;
  private static final SubLSymbol $sym272$CYC_ARC_COTANGENT;
  private static final SubLSymbol $sym273$CYC_ARC_SECANT;
  private static final SubLSymbol $sym274$CYC_ARC_SINE;
  private static final SubLSymbol $sym275$CYC_ARC_TANGENT;
  private static final SubLSymbol $sym276$CYC_ASCII_STRING_P;
  private static final SubLSymbol $sym277$CYC_AVERAGE;
  private static final SubLSymbol $sym278$CYC_BIT_DATATYPE;
  private static final SubLSymbol $sym279$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR;
  private static final SubLSymbol $sym280$CYC_COSECANT;
  private static final SubLSymbol $sym281$CYC_COSINE;
  private static final SubLSymbol $sym282$CYC_COTANGENT;
  private static final SubLSymbol $sym283$CYC_DATE_AFTER;
  private static final SubLSymbol $sym284$CYC_DATE_BEFORE;
  private static final SubLSymbol $sym285$CYC_DATE_DECODE_STRING;
  private static final SubLSymbol $sym286$CYC_DATE_ENCODE_STRING;
  private static final SubLSymbol $sym287$CYC_DATE_FROM_INTEGER;
  private static final SubLSymbol $sym288$CYC_DATE_FROM_STRING;
  private static final SubLSymbol $sym289$CYC_DATE_SUBSUMES;
  private static final SubLSymbol $sym290$CYC_DAY_OF_DATE;
  private static final SubLSymbol $sym291$CYC_DAY_OF_WEEK_AFTER_DATE;
  private static final SubLSymbol $sym292$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE;
  private static final SubLSymbol $sym293$CYC_DAY_OF_WEEK_DEFN;
  private static final SubLSymbol $sym294$CYC_DAY_OF_WEEK_OF_DATE;
  private static final SubLSymbol $sym295$CYC_DAY_OF_WEEK_PRIOR_TO_DATE;
  private static final SubLSymbol $sym296$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE;
  private static final SubLSymbol $sym297$CYC_DIFFERENCE;
  private static final SubLSymbol $sym298$CYC_DIFFERENT;
  private static final SubLSymbol $sym299$CYC_DIFFERENT_SYMBOLS;
  private static final SubLSymbol $sym300$CYC_EVALUATE_SUBL;
  private static final SubLSymbol $sym301$CYC_EVEN_NUMBER;
  private static final SubLSymbol $sym302$CYC_EXP;
  private static final SubLSymbol $sym303$CYC_EXPONENT;
  private static final SubLSymbol $sym304$CYC_EXTENDED_NUMBER_P;
  private static final SubLSymbol $sym305$CYC_GREATER_THAN;
  private static final SubLSymbol $sym306$CYC_GREATER_THAN_OR_EQUAL_TO;
  private static final SubLSymbol $sym307$CYC_GROUND_TERM;
  private static final SubLSymbol $sym308$CYC_GUID_STRING_P;
  private static final SubLSymbol $sym309$CYC_HTTP_URL_ENCODE;
  private static final SubLSymbol $sym310$CYC_IDENTITY;
  private static final SubLSymbol $sym311$CYC_INDEXICAL_REFERENT;
  private static final SubLSymbol $sym312$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR;
  private static final SubLSymbol $sym313$CYC_INDIVIDUAL_NECESSARY;
  private static final SubLSymbol $sym314$CYC_INTEGER;
  private static final SubLSymbol $sym315$CYC_INTEGER_RANGE;
  private static final SubLSymbol $sym316$CYC_INTEGER_TO_STRING;
  private static final SubLSymbol $sym317$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE;
  private static final SubLSymbol $sym318$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE;
  private static final SubLSymbol $sym319$CYC_INVERSE;
  private static final SubLSymbol $sym320$CYC_IP4_ADDRESS;
  private static final SubLSymbol $sym321$CYC_IP4_NETWORK_ADDRESS;
  private static final SubLSymbol $sym322$CYC_LATER_THAN;
  private static final SubLSymbol $sym323$CYC_LESS_THAN;
  private static final SubLSymbol $sym324$CYC_LESS_THAN_OR_EQUAL_TO;
  private static final SubLSymbol $sym325$CYC_LIST_CONCATENATE;
  private static final SubLSymbol $sym326$CYC_LIST_FIRST;
  private static final SubLSymbol $sym327$CYC_LIST_LAST;
  private static final SubLSymbol $sym328$CYC_LIST_LENGTH;
  private static final SubLSymbol $sym329$CYC_LIST_MEMBER_SET;
  private static final SubLSymbol $sym330$CYC_LIST_NTH;
  private static final SubLSymbol $sym331$CYC_LIST_OF_TYPE_NECESSARY;
  private static final SubLSymbol $sym332$CYC_LIST_OF_TYPE_SUFFICIENT;
  private static final SubLSymbol $sym333$CYC_LIST_REST;
  private static final SubLSymbol $sym334$CYC_LIST_REVERSE;
  private static final SubLSymbol $sym335$CYC_LIST_SEARCH;
  private static final SubLSymbol $sym336$CYC_LIST_SUBSEQ;
  private static final SubLSymbol $sym337$CYC_LIST_WITHOUT_REPETITION;
  private static final SubLSymbol $sym338$CYC_LOG;
  private static final SubLSymbol $sym339$CYC_LOGARITHM;
  private static final SubLSymbol $sym340$CYC_MAKE_FORMULA;
  private static final SubLSymbol $sym341$CYC_MAP_FUNCTION_OVER_LIST;
  private static final SubLSymbol $sym342$CYC_MAX_RANGE;
  private static final SubLSymbol $sym343$CYC_MAXIMUM;
  private static final SubLSymbol $sym344$CYC_MIN_RANGE;
  private static final SubLSymbol $sym345$CYC_MINIMUM;
  private static final SubLSymbol $sym346$CYC_MINUS;
  private static final SubLSymbol $sym347$CYC_NEGATIVE_INTEGER;
  private static final SubLSymbol $sym348$CYC_NEGATIVE_NUMBER;
  private static final SubLSymbol $sym349$CYC_NEXT_ITERATED_CYCLIC_INTERVAL;
  private static final SubLSymbol $sym350$CYC_NON_NEGATIVE_INTEGER;
  private static final SubLSymbol $sym351$CYC_NON_NEGATIVE_NUMBER;
  private static final SubLSymbol $sym352$CYC_NON_POSITIVE_INTEGER;
  private static final SubLSymbol $sym353$CYC_NON_POSITIVE_NUMBER;
  private static final SubLSymbol $sym354$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE;
  private static final SubLSymbol $sym355$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE;
  private static final SubLSymbol $sym356$CYC_NUMBER_STRING;
  private static final SubLSymbol $sym357$CYC_NUMERAL_STRING;
  private static final SubLSymbol $sym358$CYC_NUMERIC_STRING_NECESSARY;
  private static final SubLSymbol $sym359$CYC_NUMERICALLY_EQUAL;
  private static final SubLSymbol $sym360$CYC_ODD_NUMBER;
  private static final SubLSymbol $sym361$CYC_PERCENT;
  private static final SubLSymbol $sym362$CYC_PLUS;
  private static final SubLSymbol $sym363$CYC_PLUS_ALL;
  private static final SubLSymbol $sym364$CYC_POSITION;
  private static final SubLSymbol $sym365$CYC_POSITIVE_INTEGER;
  private static final SubLSymbol $sym366$CYC_POSITIVE_NUMBER;
  private static final SubLSymbol $sym367$CYC_POST_REMOVE;
  private static final SubLSymbol $sym368$CYC_PRE_REMOVE;
  private static final SubLSymbol $sym369$CYC_PREFIX_SUBSTRING;
  private static final SubLSymbol $sym370$CYC_PRIME_NUMBER_;
  private static final SubLSymbol $sym371$CYC_QUANTITY_CONVERSION;
  private static final SubLSymbol $sym372$CYC_QUANTITY_INTERSECTS;
  private static final SubLSymbol $sym373$CYC_QUANTITY_SUBSUMES;
  private static final SubLSymbol $sym374$CYC_QUOTIENT;
  private static final SubLSymbol $sym375$CYC_RATIONAL_NUMBER;
  private static final SubLSymbol $sym376$CYC_REAL_0_1;
  private static final SubLSymbol $sym377$CYC_REAL_1_INFINITY;
  private static final SubLSymbol $sym378$CYC_REAL_NUMBER;
  private static final SubLSymbol $sym379$CYC_RECAPITALIZE_SMART;
  private static final SubLSymbol $sym380$CYC_RELATION_ARG;
  private static final SubLSymbol $sym381$CYC_RELATION_ARG_SET;
  private static final SubLSymbol $sym382$CYC_RELATION_ARGS_LIST;
  private static final SubLSymbol $sym383$CYC_RELATION_EXPRESSION_ARITY;
  private static final SubLSymbol $sym384$CYC_REPLACE_SUBSTRING;
  private static final SubLSymbol $sym385$CYC_ROUND_CLOSEST;
  private static final SubLSymbol $sym386$CYC_ROUND_DOWN;
  private static final SubLSymbol $sym387$CYC_ROUND_UP;
  private static final SubLSymbol $sym388$CYC_SCIENTIFIC_NUMBER_FROM_STRING;
  private static final SubLSymbol $sym389$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL;
  private static final SubLSymbol $sym390$CYC_SCIENTIFIC_NUMBER_P;
  private static final SubLSymbol $sym391$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT;
  private static final SubLSymbol $sym392$CYC_SCIENTIFIC_NUMBER_TO_STRING;
  private static final SubLSymbol $sym393$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL;
  private static final SubLSymbol $sym394$CYC_SECANT;
  private static final SubLSymbol $sym395$CYC_SET_DIFFERENCE;
  private static final SubLSymbol $sym396$CYC_SET_EXTENT;
  private static final SubLSymbol $sym397$CYC_SET_OF_TYPE_NECESSARY;
  private static final SubLSymbol $sym398$CYC_SET_OF_TYPE_SUFFICIENT;
  private static final SubLSymbol $sym399$CYC_SIGNIFICANT_DIGITS;
  private static final SubLSymbol $sym400$CYC_SINE;
  private static final SubLSymbol $sym401$CYC_SKSI_SOURCE_ACCESSIBLE;
  private static final SubLSymbol $sym402$CYC_SKSI_SOURCE_ACTIVATED;
  private static final SubLSymbol $sym403$CYC_SKSI_SOURCE_QUERYABLE;
  private static final SubLSymbol $sym404$CYC_SKSI_SOURCE_REGISTERED;
  private static final SubLSymbol $sym405$CYC_SQRT;
  private static final SubLSymbol $sym406$CYC_STRING_CONCAT;
  private static final SubLSymbol $sym407$CYC_STRING_TO_INTEGER;
  private static final SubLSymbol $sym408$CYC_STRING_TO_REAL_NUMBER;
  private static final SubLSymbol $sym409$CYC_STRING_TOKENIZE_NEW;
  private static final SubLSymbol $sym410$CYC_STRING_UPCASE;
  private static final SubLSymbol $sym411$CYC_STRINGS_TO_PHRASE;
  private static final SubLSymbol $sym412$CYC_SUBL_ESCAPE;
  private static final SubLSymbol $sym413$CYC_SUBL_EXPRESSION;
  private static final SubLSymbol $sym414$CYC_SUBL_TEMPLATE;
  private static final SubLSymbol $sym415$CYC_SUBLIST_;
  private static final SubLSymbol $sym416$CYC_SUBSTITUTE_FORMULA;
  private static final SubLSymbol $sym417$CYC_SUBSTITUTE_FORMULA_ARG;
  private static final SubLSymbol $sym418$CYC_SUBSTITUTE_FORMULA_ARG_POSITION;
  private static final SubLSymbol $sym419$CYC_SUBSTRING;
  private static final SubLSymbol $sym420$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE;
  private static final SubLSymbol $sym421$CYC_SUBSTRING_PREDICATE;
  private static final SubLSymbol $sym422$CYC_SUBWORD_PREDICATE;
  private static final SubLSymbol $sym423$CYC_SUFFIX_SUBSTRING;
  private static final SubLSymbol $sym424$CYC_SYSTEM_ATOM;
  private static final SubLSymbol $sym425$CYC_SYSTEM_CHARACTER_P;
  private static final SubLSymbol $sym426$CYC_SYSTEM_INTEGER;
  private static final SubLSymbol $sym427$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P;
  private static final SubLSymbol $sym428$CYC_SYSTEM_REAL_NUMBER_P;
  private static final SubLSymbol $sym429$CYC_SYSTEM_STRING_P;
  private static final SubLSymbol $sym430$CYC_SYSTEM_TERM_P;
  private static final SubLSymbol $sym431$CYC_TANGENT;
  private static final SubLSymbol $sym432$CYC_TIME_ELAPSED;
  private static final SubLSymbol $sym433$CYC_TIME_ELAPSED_DECODE_STRING;
  private static final SubLSymbol $sym434$CYC_TIME_ELAPSED_ENCODE_STRING;
  private static final SubLSymbol $sym435$CYC_TIMES;
  private static final SubLSymbol $sym436$CYC_TRIM_WHITESPACE;
  private static final SubLSymbol $sym437$CYC_TRUE_SUBL;
  private static final SubLSymbol $sym438$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL;
  private static final SubLSymbol $sym439$CYC_UNICODE_DENOTING_ASCII_STRING_P;
  private static final SubLSymbol $sym440$CYC_ZIP_CODE_FIVE_DIGIT;
  private static final SubLSymbol $sym441$CYC_ZIP_CODE_NINE_DIGIT;
  private static final SubLSymbol $sym442$CYCL_ASSERTED_ASSERTION_;
  private static final SubLSymbol $sym443$CYCL_ASSERTION_;
  private static final SubLSymbol $sym444$CYCL_ATOMIC_ASSERTION_;
  private static final SubLSymbol $sym445$CYCL_ATOMIC_SENTENCE_;
  private static final SubLSymbol $sym446$CYCL_ATOMIC_TERM_P;
  private static final SubLSymbol $sym447$CYCL_CLOSED_ATOMIC_SENTENCE_;
  private static final SubLSymbol $sym448$CYCL_CLOSED_ATOMIC_TERM_P;
  private static final SubLSymbol $sym449$CYCL_CLOSED_DENOTATIONAL_TERM_;
  private static final SubLSymbol $sym450$CYCL_CLOSED_EXPRESSION_;
  private static final SubLSymbol $sym451$CYCL_CLOSED_FORMULA_;
  private static final SubLSymbol $sym452$CYCL_CLOSED_NON_ATOMIC_TERM_;
  private static final SubLSymbol $sym453$CYCL_CLOSED_SENTENCE_;
  private static final SubLSymbol $sym454$CYCL_CONSTANT_P;
  private static final SubLSymbol $sym455$CYCL_DEDUCED_ASSERTION_;
  private static final SubLSymbol $sym456$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym457$CYCL_EXPRESSION_ASKABLE_;
  private static final SubLSymbol $sym458$CYCL_EXPRESSION_ASSERTIBLE_;
  private static final SubLSymbol $sym459$CYCL_EXPRESSION_;
  private static final SubLSymbol $sym460$CYCL_FORMULA_;
  private static final SubLSymbol $sym461$CYCL_GAF_ASSERTION_;
  private static final SubLSymbol $sym462$CYCL_INDEXED_TERM_;
  private static final SubLSymbol $sym463$CYCL_NL_SEMANTIC_ASSERTION_;
  private static final SubLSymbol $sym464$CYCL_NON_ATOMIC_REIFIED_TERM_;
  private static final SubLSymbol $sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_;
  private static final SubLSymbol $sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_;
  private static final SubLSymbol $sym467$CYCL_NON_ATOMIC_TERM_;
  private static final SubLSymbol $sym468$CYCL_OPEN_DENOTATIONAL_TERM_;
  private static final SubLSymbol $sym469$CYCL_OPEN_EXPRESSION_;
  private static final SubLSymbol $sym470$CYCL_OPEN_FORMULA_;
  private static final SubLSymbol $sym471$CYCL_OPEN_NON_ATOMIC_TERM_;
  private static final SubLSymbol $sym472$CYCL_OPEN_SENTENCE_;
  private static final SubLSymbol $sym473$CYCL_PROPOSITIONAL_SENTENCE_;
  private static final SubLSymbol $sym474$CYCL_REFORMULATOR_RULE_;
  private static final SubLSymbol $sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_;
  private static final SubLSymbol $sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_;
  private static final SubLSymbol $sym477$CYCL_REIFIED_DENOTATIONAL_TERM_;
  private static final SubLSymbol $sym478$CYCL_REPRESENTED_ATOMIC_TERM_P;
  private static final SubLSymbol $sym479$CYCL_REPRESENTED_TERM_;
  private static final SubLSymbol $sym480$CYCL_RULE_ASSERTION_;
  private static final SubLSymbol $sym481$CYCL_SENTENCE_ASKABLE_;
  private static final SubLSymbol $sym482$CYCL_SENTENCE_ASSERTIBLE_;
  private static final SubLSymbol $sym483$CYCL_SENTENCE_;
  private static final SubLSymbol $sym484$CYCL_SUBL_SYMBOL_P;
  private static final SubLSymbol $sym485$CYCL_UNBOUND_RELATION_FORMULA_P;
  private static final SubLSymbol $sym486$CYCL_VAR_LIST_;
  private static final SubLSymbol $sym487$CYCL_VARIABLE_P;
  private static final SubLSymbol $sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_;
  private static final SubLSymbol $sym489$CYCSECURE_VERSION_OF_SOFTWARE_;
  private static final SubLSymbol $sym490$GAF_;
  private static final SubLSymbol $sym491$GEN_TEMPLATE_RECIPE_P;
  private static final SubLSymbol $sym492$GENERATE_NAMES_FOR_TERM;
  private static final SubLSymbol $sym493$GENERATE_PHRASE_DEFN;
  private static final SubLSymbol $sym494$HL_EXTERNAL_ID_STRING_P;
  private static final SubLSymbol $sym495$IBQE_;
  private static final SubLSymbol $sym496$INTEGERP;
  private static final SubLSymbol $sym497$KEYWORDP;
  private static final SubLSymbol $sym498$KWTE_;
  private static final SubLSymbol $sym499$LISTP;
  private static final SubLSymbol $sym500$MONAD_CYCL_MT_;
  private static final SubLSymbol $sym501$NON_NEGATIVE_SCALAR_INTERVAL_;
  private static final SubLSymbol $sym502$POSITIVE_SCALAR_INTERVAL_;
  private static final SubLSymbol $sym503$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING;
  private static final SubLSymbol $sym504$RTP_SYNTACTIC_CONSTRAINT;
  private static final SubLSymbol $sym505$SCALAR_POINT_VALUE_;
  private static final SubLSymbol $sym506$STRING_W_O_CONTROL_CHARS_;
  private static final SubLSymbol $sym507$STRINGP;
  private static final SubLSymbol $sym508$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P;
  private static final SubLSymbol $sym509$SYMBOLP;
  private static final SubLSymbol $sym510$TEMPORAL_DIMENSION_MT_P;
  private static final SubLSymbol $sym511$TRUE;
  private static final SubLSymbol $sym512$URL_P;
  private static final SubLList $list513;

  @SubLTranslatedFile.SubL(source = "cycl/eval-in-api-registrations.lisp", position = 2833L)
  public static SubLObject api_bq_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject objects;
    final SubLObject current = objects = datum;
    return reader.bq_cons( $sym35$LIST, ConsesLow.append( objects, NIL ) );
  }

  public static SubLObject declare_eval_in_api_registrations_file()
  {
    SubLFiles.declareMacro( me, "api_bq_list", "API-BQ-LIST" );
    return NIL;
  }

  public static SubLObject init_eval_in_api_registrations_file()
  {
    $sublisp_api_predefined_functions$ = SubLFiles.deflexical( "*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list64 );
    $api_host_access_functions$ = SubLFiles.deflexical( "*API-HOST-ACCESS-FUNCTIONS*", $list153 );
    return NIL;
  }

  public static SubLObject setup_eval_in_api_registrations_file()
  {
    eval_in_api.register_api_immutable_global( $sym0$_NULL_OUTPUT_ );
    eval_in_api.register_api_mutable_global( $sym1$_IT_VERBOSE_ );
    eval_in_api.register_api_mutable_global( $sym2$_PROGRESS_NOTE_ );
    eval_in_api.register_api_mutable_global( $sym3$_PROGRESS_SOFAR_ );
    eval_in_api.register_api_mutable_global( $sym4$_PROGRESS_START_TIME_ );
    eval_in_api.register_api_mutable_global( $sym5$_PROGRESS_TOTAL_ );
    eval_in_api.register_api_mutable_global( $sym6$_EVAL_WITH_BINDINGS_ );
    eval_in_api.register_api_mutable_global( $sym7$_ERROR_OUTPUT_ );
    eval_in_api.register_api_mutable_global( $sym8$_STANDARD_OUTPUT_ );
    eval_in_api.register_api_mutable_global( $sym9$_CONTINUE_CERROR__ );
    eval_in_api.register_api_mutable_global( $sym10$_SILENT_PROGRESS__ );
    eval_in_api.register_api_mutable_global( $sym11$_IGNORE_BREAKS__ );
    eval_in_api.register_api_mutable_global( $sym12$_IGNORE_WARNS__ );
    eval_in_api.register_api_mutable_global( $sym13$_EVAL_IN_API_TRACE_LOG_ );
    eval_in_api.register_api_mutable_global( $sym14$_EVAL_IN_API_TRACED_FNS_ );
    eval_in_api.register_api_mutable_global( $sym15$_EVAL_IN_API_ENV_ );
    eval_in_api.register_api_mutable_global( $sym16$_API_OUTPUT_PROTOCOL_ );
    eval_in_api.register_api_mutable_global( $sym17$_API_RESULT_METHOD_ );
    eval_in_api.register_api_mutable_global( $sym18$_API_INPUT_PROTOCOL_ );
    eval_in_api.register_api_mutable_global( $sym19$_KE_PURPOSE_ );
    eval_in_api.register_api_mutable_global( $sym20$_THE_CYCLIST_ );
    eval_in_api.register_api_mutable_global( $sym21$_USE_LOCAL_QUEUE__ );
    eval_in_api.register_api_mutable_global( $sym22$_RELEVANT_MT_FUNCTION_ );
    eval_in_api.register_api_mutable_global( $sym23$_CYC_BOOKKEEPING_INFO_ );
    eval_in_api.register_api_mutable_global( $sym24$_SUPPRESS_SBHL_RECACHING__ );
    eval_in_api.register_api_mutable_global( $sym25$_PARAPHRASE_PRECISION_ );
    eval_in_api.register_api_mutable_global( $sym26$_EVAL_IN_API_LEVEL_ );
    eval_in_api.register_api_mutable_global( $sym27$_SUSPEND_SBHL_TYPE_CHECKING__ );
    eval_in_api.register_api_mutable_global( $sym28$_REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS_ );
    eval_in_api.register_api_mutable_global( $sym29$_TASK_PROCESSOR_VERBOSITY_ );
    utilities_macros.register_api_predefined_macro( $sym30$BQ_APPEND );
    utilities_macros.register_api_predefined_macro( $sym31$BQ_LIST );
    utilities_macros.register_api_predefined_macro( $sym32$BQ_LIST_ );
    utilities_macros.register_api_predefined_macro( $sym33$BQ_NCONC );
    utilities_macros.register_api_predefined_macro( $sym34$BQ_VECTOR_APPEND );
    utilities_macros.register_api_predefined_macro( $sym36$API_BQ_LIST );
    utilities_macros.register_api_predefined_macro( $sym37$CDESTRUCTURING_BIND );
    utilities_macros.register_api_predefined_macro( $sym38$WITH_PRECISE_PARAPHRASE_ON );
    utilities_macros.register_api_predefined_macro( $sym39$WITH_PARAPHRASE_PRECISION );
    utilities_macros.register_api_predefined_macro( $sym40$WITH_BOOKKEEPING_INFO );
    utilities_macros.register_api_predefined_macro( $sym41$WITH_MT_FUNCTION );
    utilities_macros.register_api_predefined_macro( $sym42$WITH_GENL_MTS );
    utilities_macros.register_api_predefined_macro( $sym43$WITH_INFERENCE_MT_RELEVANCE );
    utilities_macros.register_api_predefined_macro( $sym44$WITH_ALL_MTS );
    utilities_macros.register_api_predefined_macro( $sym45$DO_PREDICATE_RULE_INDEX );
    utilities_macros.register_api_predefined_macro( $sym46$DO_RULE_INDEX );
    utilities_macros.register_api_predefined_macro( $sym47$WITHOUT_WFF_SEMANTICS );
    utilities_macros.register_api_predefined_macro( $sym48$CDOLIST_DONE );
    utilities_macros.register_api_predefined_macro( $sym49$DO_DICTIONARY );
    utilities_macros.register_api_predefined_macro( $sym50$PROGRESS_CDOTIMES );
    utilities_macros.register_api_predefined_macro( $sym51$DO_KB_SUID_TABLE );
    utilities_macros.register_api_predefined_macro( $sym52$DO_ID_INDEX );
    utilities_macros.register_api_predefined_macro( $sym53$OLD_DO_ID_INDEX );
    utilities_macros.register_api_predefined_macro( $sym54$NEW_DO_ID_INDEX );
    utilities_macros.register_api_predefined_macro( $sym55$DO_CONSTANTS );
    utilities_macros.register_api_predefined_macro( $sym56$CWITH_OUTPUT_TO_STRING );
    utilities_macros.register_api_predefined_macro( $sym57$WITH_INPUT_FROM_STRING );
    utilities_macros.register_api_predefined_macro( $sym58$DO_VECTOR_INDEX );
    utilities_macros.register_api_predefined_macro( $sym59$IN_MT );
    utilities_macros.register_api_predefined_macro( $sym60$DO_ITERATOR_WITHOUT_VALUES_PROGRESS );
    utilities_macros.register_api_predefined_host_macro( $sym61$WITH_OPEN_STREAM );
    utilities_macros.register_api_predefined_host_macro( $sym62$WITH_OPEN_FILE );
    utilities_macros.register_api_predefined_host_macro( $sym63$WITH_TCP_CONNECTION );
    SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list65;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list66;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    utilities_macros.register_api_predefined_function( $sym67$STRING_TO_GUID );
    utilities_macros.register_api_predefined_function( $sym68$GUID_TO_STRING );
    utilities_macros.register_api_predefined_function( $sym69$REMOVE_DUPLICATES );
    utilities_macros.register_api_predefined_function( $sym70$NEW_BOOKKEEPING_INFO );
    utilities_macros.register_api_predefined_function( $sym71$STRING_SUBSTITUTE );
    utilities_macros.register_api_predefined_function( $sym72$GENERATE_PHRASE );
    utilities_macros.register_api_predefined_function( $sym73$THE_DATE );
    utilities_macros.register_api_predefined_function( $sym74$THE_SECOND );
    utilities_macros.register_api_predefined_function( $sym75$ISA );
    utilities_macros.register_api_predefined_function( $sym76$GENLS );
    utilities_macros.register_api_predefined_function( $sym77$WHY_COLLECTIONS_INTERSECT_ );
    utilities_macros.register_api_predefined_function( $sym78$ARG1_FORMAT );
    utilities_macros.register_api_predefined_function( $sym79$ARG2_FORMAT );
    utilities_macros.register_api_predefined_function( $sym80$SPECS );
    utilities_macros.register_api_predefined_function( $sym81$COLLECTION_LEAVES );
    utilities_macros.register_api_predefined_function( $sym82$SIMPLE_INDEXED_TERM_P );
    utilities_macros.register_api_predefined_function( $sym83$MAX_SPECS );
    utilities_macros.register_api_predefined_function( $sym84$MIN_ISA );
    utilities_macros.register_api_predefined_function( $sym85$LOCAL_DISJOINT_WITH );
    utilities_macros.register_api_predefined_function( $sym86$DISJOINT_WITH_ );
    utilities_macros.register_api_predefined_function( $sym87$GENL_SIBLINGS );
    utilities_macros.register_api_predefined_function( $sym88$SPEC_SIBLINGS );
    utilities_macros.register_api_predefined_function( $sym89$ARG1_ISA );
    utilities_macros.register_api_predefined_function( $sym90$ARG2_ISA );
    utilities_macros.register_api_predefined_function( $sym91$ARGN_ISA );
    utilities_macros.register_api_predefined_function( $sym91$ARGN_ISA );
    utilities_macros.register_api_predefined_function( $sym92$ARGN_GENL );
    utilities_macros.register_api_predefined_function( $sym93$ALL_GENLS_IN_ANY_MT );
    utilities_macros.register_api_predefined_function( $sym94$ALL_ISA_IN_ANY_MT );
    utilities_macros.register_api_predefined_function( $sym95$ALL_FORT_INSTANCES_IN_ALL_MTS );
    utilities_macros.register_api_predefined_function( $sym96$ISA_IN_ANY_MT_ );
    utilities_macros.register_api_predefined_function( $sym97$GENL_IN_ANY_MT_ );
    utilities_macros.register_api_predefined_function( $sym98$NEW_CONSTANT_NAME_SPEC_P );
    utilities_macros.register_api_predefined_function( $sym99$DO_RULE_INDEX_RULES );
    utilities_macros.register_api_predefined_function( $sym100$BT_LOWER );
    utilities_macros.register_api_predefined_function( $sym101$BT_HIGHER );
    utilities_macros.register_api_predefined_function( $sym102$SAMPLE_LEAF_SPECS );
    utilities_macros.register_api_predefined_function( $sym103$TACIT_COEXTENSIONAL_ );
    utilities_macros.register_api_predefined_function( $sym104$EL_WFF_ );
    utilities_macros.register_api_predefined_function( $sym105$EVALUATABLE_PREDICATE_ );
    utilities_macros.register_api_predefined_function( $sym106$HIERARCHICAL_COLLECTIONS_ );
    utilities_macros.register_api_predefined_function( $sym107$NUM_BEST_GAF_LOOKUP_INDEX );
    utilities_macros.register_api_predefined_function( $sym108$API_QUIT );
    utilities_macros.register_api_predefined_function( $sym109$NART_P );
    utilities_macros.register_api_predefined_function( $sym110$EL_VARIABLE_P );
    utilities_macros.register_api_predefined_function( $sym111$PPH_PRECISION_P );
    utilities_macros.register_api_predefined_function( $sym112$FORT_FOR_STRING );
    utilities_macros.register_api_predefined_function( $sym113$RTP_PARSE_EXP_W_VPP );
    utilities_macros.register_api_predefined_function( $sym114$GET_UNIVERSAL_TIME );
    utilities_macros.register_api_predefined_function( $sym115$DECODE_UNIVERSAL_TIME );
    utilities_macros.register_api_predefined_function( $sym116$FIND_NART );
    utilities_macros.register_api_predefined_function( $sym117$CONSTANT_GUID );
    utilities_macros.register_api_predefined_function( $sym118$RKF_PHRASE_READER );
    utilities_macros.register_api_predefined_function( $sym119$GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES );
    utilities_macros.register_api_predefined_function( $sym120$LOAD_TRANSCRIPT_FILE );
    utilities_macros.register_api_predefined_function( $sym121$KB_STATISTICS );
    utilities_macros.register_api_predefined_function( $sym122$GENL_MT_ );
    utilities_macros.register_api_predefined_function( $sym123$ALL_SPEC_MTS );
    utilities_macros.register_api_predefined_function( $sym124$REMOVAL_ASK );
    utilities_macros.register_api_predefined_function( $sym125$DO_NARTS_TABLE );
    utilities_macros.register_api_predefined_function( $sym126$ID_INDEX_COUNT );
    utilities_macros.register_api_predefined_function( $sym127$ID_INDEX_DENSE_OBJECTS );
    utilities_macros.register_api_predefined_function( $sym128$ID_INDEX_EMPTY_P );
    utilities_macros.register_api_predefined_function( $sym129$ID_INDEX_SPARSE_ID_THRESHOLD );
    utilities_macros.register_api_predefined_function( $sym130$ID_INDEX_NEXT_ID );
    utilities_macros.register_api_predefined_function( $sym131$CYCL_NART_P );
    utilities_macros.register_api_predefined_function( $sym132$CYCL_NAUT_P );
    utilities_macros.register_api_predefined_function( $sym133$RESOLVE_NEW_CONSTANTS );
    utilities_macros.register_api_predefined_function( $sym134$CYC_OPENCYC_FEATURE );
    utilities_macros.register_api_predefined_function( $sym135$CYC_RESEARCHCYC_FEATURE );
    utilities_macros.register_api_predefined_function( $sym136$CANONICALIZE_HLMT );
    utilities_macros.register_api_predefined_function( $sym137$NEW_CYC_QUERY );
    utilities_macros.register_api_predefined_function( $sym138$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE );
    utilities_macros.register_api_predefined_function( $sym139$INFERENCE_REMOVAL_MODULE );
    utilities_macros.register_api_predefined_function( $sym140$UNDECLARE_INFERENCE_REMOVAL_MODULE );
    cdolist_list_var = $list141;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list142;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list143;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list144;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list145;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list146;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list147;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list148;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list149;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_macro( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $list150;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      eval_in_api.register_api_mutable_global( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    access_macros.register_external_symbol( $sym151$__ );
    cdolist_list_var = $list152;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    cdolist_list_var = $api_host_access_functions$.getGlobalValue();
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_host_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    utilities_macros.register_api_predefined_function( $sym154$PHRASE_FOR_MT );
    utilities_macros.register_api_predefined_function( $sym155$NOTING_PROGRESS );
    utilities_macros.register_api_predefined_function( $sym156$NOTE_PROGRESS );
    utilities_macros.register_api_predefined_function( $sym157$NEW_ALEXANDRIA_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym158$ALEXANDRIA_KB_STORE_ITERATOR_DONE );
    utilities_macros.register_api_predefined_function( $sym159$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE );
    utilities_macros.register_api_predefined_function( $sym160$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA );
    utilities_macros.register_api_predefined_function( $sym161$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED );
    utilities_macros.register_api_predefined_function( $sym162$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym163$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER );
    utilities_macros.register_api_predefined_function( $sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO );
    utilities_macros.register_api_predefined_function( $sym166$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym167$NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym168$COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA );
    utilities_macros.register_api_predefined_function( $sym169$COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT );
    utilities_macros.register_api_predefined_function( $sym170$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym171$NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym172$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym173$NEW_ALEXANDRIA_ALL_FORTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym174$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym175$NEW_ALEXANDRIA_ALL_GAFS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym176$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym177$NEW_ALEXANDRIA_ALL_RULES_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym178$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym179$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym180$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym181$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym182$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym183$NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym184$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym185$NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym186$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym187$NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym188$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym189$NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym190$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym191$NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym192$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym193$NEW_ALEXANDRIA_ALL_NARTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym194$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym195$NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym196$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym197$NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym198$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym199$NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym200$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym201$NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym202$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym203$NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym204$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym205$NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym206$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym207$NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym208$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym209$NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym210$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym211$NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym212$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym213$NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym214$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym215$NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym216$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym217$NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym218$COUNT_ALEXANDRIA_TERM_ASSERTIONS );
    utilities_macros.register_api_predefined_function( $sym219$CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym220$NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym221$COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED );
    utilities_macros.register_api_predefined_function( $sym222$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym223$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym224$COUNT_ALEXANDRIA_GAF_ARG0 );
    utilities_macros.register_api_predefined_function( $sym225$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym226$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT );
    utilities_macros.register_api_predefined_function( $sym227$COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT );
    utilities_macros.register_api_predefined_function( $sym228$CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym229$NEW_ALEXANDRIA_GAF_ARG_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym230$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym231$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym232$COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED );
    utilities_macros.register_api_predefined_function( $sym233$COUNT_ALEXANDRIA_GAF_ARG );
    utilities_macros.register_api_predefined_function( $sym234$NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym235$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym236$COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED );
    utilities_macros.register_api_predefined_function( $sym237$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym238$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym239$COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym237$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym238$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym239$COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED );
    utilities_macros.register_api_predefined_function( $sym240$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym241$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym242$COUNT_ALEXANDRIA_MT_CONTENTS );
    utilities_macros.register_api_predefined_function( $sym243$CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym244$NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym245$COUNT_ALEXANDRIA_RULES_WITH_PRED );
    utilities_macros.register_api_predefined_function( $sym246$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym247$NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym248$COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT );
    utilities_macros.register_api_predefined_function( $sym249$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym250$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym251$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2 );
    utilities_macros.register_api_predefined_function( $sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S );
    utilities_macros.register_api_predefined_function( $sym253$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym254$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT );
    utilities_macros.register_api_predefined_function( $sym255$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym256$NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym257$COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT );
    utilities_macros.register_api_predefined_function( $sym258$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym259$NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym260$COUNT_ALEXANDRIA_NART_ARG_INDEX );
    utilities_macros.register_api_predefined_function( $sym261$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE );
    utilities_macros.register_api_predefined_function( $sym262$NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR );
    utilities_macros.register_api_predefined_function( $sym263$BEST_STRING_OF_NL_PHRASE_DEFN );
    utilities_macros.register_api_predefined_function( $sym264$CYC_1_BYTE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym265$CYC_2_BYTE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym266$CYC_4_BYTE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym267$CYC_8_BYTE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym268$CYC_ABSOLUTE_VALUE );
    utilities_macros.register_api_predefined_function( $sym269$CYC_ADD_ENGLISH_SUFFIX );
    utilities_macros.register_api_predefined_function( $sym270$CYC_ARC_COSECANT );
    utilities_macros.register_api_predefined_function( $sym271$CYC_ARC_COSINE );
    utilities_macros.register_api_predefined_function( $sym272$CYC_ARC_COTANGENT );
    utilities_macros.register_api_predefined_function( $sym273$CYC_ARC_SECANT );
    utilities_macros.register_api_predefined_function( $sym274$CYC_ARC_SINE );
    utilities_macros.register_api_predefined_function( $sym275$CYC_ARC_TANGENT );
    utilities_macros.register_api_predefined_function( $sym276$CYC_ASCII_STRING_P );
    utilities_macros.register_api_predefined_function( $sym277$CYC_AVERAGE );
    utilities_macros.register_api_predefined_function( $sym278$CYC_BIT_DATATYPE );
    utilities_macros.register_api_predefined_function( $sym279$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR );
    utilities_macros.register_api_predefined_function( $sym280$CYC_COSECANT );
    utilities_macros.register_api_predefined_function( $sym281$CYC_COSINE );
    utilities_macros.register_api_predefined_function( $sym282$CYC_COTANGENT );
    utilities_macros.register_api_predefined_function( $sym283$CYC_DATE_AFTER );
    utilities_macros.register_api_predefined_function( $sym284$CYC_DATE_BEFORE );
    utilities_macros.register_api_predefined_function( $sym285$CYC_DATE_DECODE_STRING );
    utilities_macros.register_api_predefined_function( $sym286$CYC_DATE_ENCODE_STRING );
    utilities_macros.register_api_predefined_function( $sym287$CYC_DATE_FROM_INTEGER );
    utilities_macros.register_api_predefined_function( $sym288$CYC_DATE_FROM_STRING );
    utilities_macros.register_api_predefined_function( $sym289$CYC_DATE_SUBSUMES );
    utilities_macros.register_api_predefined_function( $sym290$CYC_DAY_OF_DATE );
    utilities_macros.register_api_predefined_function( $sym291$CYC_DAY_OF_WEEK_AFTER_DATE );
    utilities_macros.register_api_predefined_function( $sym292$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE );
    utilities_macros.register_api_predefined_function( $sym293$CYC_DAY_OF_WEEK_DEFN );
    utilities_macros.register_api_predefined_function( $sym294$CYC_DAY_OF_WEEK_OF_DATE );
    utilities_macros.register_api_predefined_function( $sym295$CYC_DAY_OF_WEEK_PRIOR_TO_DATE );
    utilities_macros.register_api_predefined_function( $sym296$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE );
    utilities_macros.register_api_predefined_function( $sym297$CYC_DIFFERENCE );
    utilities_macros.register_api_predefined_function( $sym298$CYC_DIFFERENT );
    utilities_macros.register_api_predefined_function( $sym299$CYC_DIFFERENT_SYMBOLS );
    utilities_macros.register_api_predefined_function( $sym300$CYC_EVALUATE_SUBL );
    utilities_macros.register_api_predefined_function( $sym301$CYC_EVEN_NUMBER );
    utilities_macros.register_api_predefined_function( $sym302$CYC_EXP );
    utilities_macros.register_api_predefined_function( $sym303$CYC_EXPONENT );
    utilities_macros.register_api_predefined_function( $sym304$CYC_EXTENDED_NUMBER_P );
    utilities_macros.register_api_predefined_function( $sym305$CYC_GREATER_THAN );
    utilities_macros.register_api_predefined_function( $sym306$CYC_GREATER_THAN_OR_EQUAL_TO );
    utilities_macros.register_api_predefined_function( $sym307$CYC_GROUND_TERM );
    utilities_macros.register_api_predefined_function( $sym308$CYC_GUID_STRING_P );
    utilities_macros.register_api_predefined_function( $sym309$CYC_HTTP_URL_ENCODE );
    utilities_macros.register_api_predefined_function( $sym310$CYC_IDENTITY );
    utilities_macros.register_api_predefined_function( $sym311$CYC_INDEXICAL_REFERENT );
    utilities_macros.register_api_predefined_function( $sym312$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR );
    utilities_macros.register_api_predefined_function( $sym313$CYC_INDIVIDUAL_NECESSARY );
    utilities_macros.register_api_predefined_function( $sym314$CYC_INTEGER );
    utilities_macros.register_api_predefined_function( $sym315$CYC_INTEGER_RANGE );
    utilities_macros.register_api_predefined_function( $sym315$CYC_INTEGER_RANGE );
    utilities_macros.register_api_predefined_function( $sym316$CYC_INTEGER_TO_STRING );
    utilities_macros.register_api_predefined_function( $sym317$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE );
    utilities_macros.register_api_predefined_function( $sym318$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE );
    utilities_macros.register_api_predefined_function( $sym319$CYC_INVERSE );
    utilities_macros.register_api_predefined_function( $sym320$CYC_IP4_ADDRESS );
    utilities_macros.register_api_predefined_function( $sym321$CYC_IP4_NETWORK_ADDRESS );
    utilities_macros.register_api_predefined_function( $sym322$CYC_LATER_THAN );
    utilities_macros.register_api_predefined_function( $sym323$CYC_LESS_THAN );
    utilities_macros.register_api_predefined_function( $sym324$CYC_LESS_THAN_OR_EQUAL_TO );
    utilities_macros.register_api_predefined_function( $sym325$CYC_LIST_CONCATENATE );
    utilities_macros.register_api_predefined_function( $sym326$CYC_LIST_FIRST );
    utilities_macros.register_api_predefined_function( $sym327$CYC_LIST_LAST );
    utilities_macros.register_api_predefined_function( $sym328$CYC_LIST_LENGTH );
    utilities_macros.register_api_predefined_function( $sym329$CYC_LIST_MEMBER_SET );
    utilities_macros.register_api_predefined_function( $sym330$CYC_LIST_NTH );
    utilities_macros.register_api_predefined_function( $sym331$CYC_LIST_OF_TYPE_NECESSARY );
    utilities_macros.register_api_predefined_function( $sym332$CYC_LIST_OF_TYPE_SUFFICIENT );
    utilities_macros.register_api_predefined_function( $sym333$CYC_LIST_REST );
    utilities_macros.register_api_predefined_function( $sym334$CYC_LIST_REVERSE );
    utilities_macros.register_api_predefined_function( $sym335$CYC_LIST_SEARCH );
    utilities_macros.register_api_predefined_function( $sym336$CYC_LIST_SUBSEQ );
    utilities_macros.register_api_predefined_function( $sym337$CYC_LIST_WITHOUT_REPETITION );
    utilities_macros.register_api_predefined_function( $sym338$CYC_LOG );
    utilities_macros.register_api_predefined_function( $sym339$CYC_LOGARITHM );
    utilities_macros.register_api_predefined_function( $sym340$CYC_MAKE_FORMULA );
    utilities_macros.register_api_predefined_function( $sym341$CYC_MAP_FUNCTION_OVER_LIST );
    utilities_macros.register_api_predefined_function( $sym342$CYC_MAX_RANGE );
    utilities_macros.register_api_predefined_function( $sym343$CYC_MAXIMUM );
    utilities_macros.register_api_predefined_function( $sym344$CYC_MIN_RANGE );
    utilities_macros.register_api_predefined_function( $sym345$CYC_MINIMUM );
    utilities_macros.register_api_predefined_function( $sym346$CYC_MINUS );
    utilities_macros.register_api_predefined_function( $sym347$CYC_NEGATIVE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym348$CYC_NEGATIVE_NUMBER );
    utilities_macros.register_api_predefined_function( $sym349$CYC_NEXT_ITERATED_CYCLIC_INTERVAL );
    utilities_macros.register_api_predefined_function( $sym350$CYC_NON_NEGATIVE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym351$CYC_NON_NEGATIVE_NUMBER );
    utilities_macros.register_api_predefined_function( $sym352$CYC_NON_POSITIVE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym353$CYC_NON_POSITIVE_NUMBER );
    utilities_macros.register_api_predefined_function( $sym354$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE );
    utilities_macros.register_api_predefined_function( $sym355$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE );
    utilities_macros.register_api_predefined_function( $sym356$CYC_NUMBER_STRING );
    utilities_macros.register_api_predefined_function( $sym357$CYC_NUMERAL_STRING );
    utilities_macros.register_api_predefined_function( $sym358$CYC_NUMERIC_STRING_NECESSARY );
    utilities_macros.register_api_predefined_function( $sym359$CYC_NUMERICALLY_EQUAL );
    utilities_macros.register_api_predefined_function( $sym360$CYC_ODD_NUMBER );
    utilities_macros.register_api_predefined_function( $sym361$CYC_PERCENT );
    utilities_macros.register_api_predefined_function( $sym362$CYC_PLUS );
    utilities_macros.register_api_predefined_function( $sym363$CYC_PLUS_ALL );
    utilities_macros.register_api_predefined_function( $sym364$CYC_POSITION );
    utilities_macros.register_api_predefined_function( $sym365$CYC_POSITIVE_INTEGER );
    utilities_macros.register_api_predefined_function( $sym366$CYC_POSITIVE_NUMBER );
    utilities_macros.register_api_predefined_function( $sym367$CYC_POST_REMOVE );
    utilities_macros.register_api_predefined_function( $sym368$CYC_PRE_REMOVE );
    utilities_macros.register_api_predefined_function( $sym369$CYC_PREFIX_SUBSTRING );
    utilities_macros.register_api_predefined_function( $sym370$CYC_PRIME_NUMBER_ );
    utilities_macros.register_api_predefined_function( $sym371$CYC_QUANTITY_CONVERSION );
    utilities_macros.register_api_predefined_function( $sym372$CYC_QUANTITY_INTERSECTS );
    utilities_macros.register_api_predefined_function( $sym373$CYC_QUANTITY_SUBSUMES );
    utilities_macros.register_api_predefined_function( $sym374$CYC_QUOTIENT );
    utilities_macros.register_api_predefined_function( $sym375$CYC_RATIONAL_NUMBER );
    utilities_macros.register_api_predefined_function( $sym376$CYC_REAL_0_1 );
    utilities_macros.register_api_predefined_function( $sym377$CYC_REAL_1_INFINITY );
    utilities_macros.register_api_predefined_function( $sym378$CYC_REAL_NUMBER );
    utilities_macros.register_api_predefined_function( $sym379$CYC_RECAPITALIZE_SMART );
    utilities_macros.register_api_predefined_function( $sym380$CYC_RELATION_ARG );
    utilities_macros.register_api_predefined_function( $sym381$CYC_RELATION_ARG_SET );
    utilities_macros.register_api_predefined_function( $sym382$CYC_RELATION_ARGS_LIST );
    utilities_macros.register_api_predefined_function( $sym383$CYC_RELATION_EXPRESSION_ARITY );
    utilities_macros.register_api_predefined_function( $sym384$CYC_REPLACE_SUBSTRING );
    utilities_macros.register_api_predefined_function( $sym385$CYC_ROUND_CLOSEST );
    utilities_macros.register_api_predefined_function( $sym386$CYC_ROUND_DOWN );
    utilities_macros.register_api_predefined_function( $sym387$CYC_ROUND_UP );
    utilities_macros.register_api_predefined_function( $sym388$CYC_SCIENTIFIC_NUMBER_FROM_STRING );
    utilities_macros.register_api_predefined_function( $sym389$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL );
    utilities_macros.register_api_predefined_function( $sym390$CYC_SCIENTIFIC_NUMBER_P );
    utilities_macros.register_api_predefined_function( $sym391$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT );
    utilities_macros.register_api_predefined_function( $sym392$CYC_SCIENTIFIC_NUMBER_TO_STRING );
    utilities_macros.register_api_predefined_function( $sym393$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL );
    utilities_macros.register_api_predefined_function( $sym394$CYC_SECANT );
    utilities_macros.register_api_predefined_function( $sym395$CYC_SET_DIFFERENCE );
    utilities_macros.register_api_predefined_function( $sym396$CYC_SET_EXTENT );
    utilities_macros.register_api_predefined_function( $sym397$CYC_SET_OF_TYPE_NECESSARY );
    utilities_macros.register_api_predefined_function( $sym398$CYC_SET_OF_TYPE_SUFFICIENT );
    utilities_macros.register_api_predefined_function( $sym399$CYC_SIGNIFICANT_DIGITS );
    utilities_macros.register_api_predefined_function( $sym400$CYC_SINE );
    utilities_macros.register_api_predefined_function( $sym401$CYC_SKSI_SOURCE_ACCESSIBLE );
    utilities_macros.register_api_predefined_function( $sym402$CYC_SKSI_SOURCE_ACTIVATED );
    utilities_macros.register_api_predefined_function( $sym403$CYC_SKSI_SOURCE_QUERYABLE );
    utilities_macros.register_api_predefined_function( $sym404$CYC_SKSI_SOURCE_REGISTERED );
    utilities_macros.register_api_predefined_function( $sym405$CYC_SQRT );
    utilities_macros.register_api_predefined_function( $sym406$CYC_STRING_CONCAT );
    utilities_macros.register_api_predefined_function( $sym407$CYC_STRING_TO_INTEGER );
    utilities_macros.register_api_predefined_function( $sym408$CYC_STRING_TO_REAL_NUMBER );
    utilities_macros.register_api_predefined_function( $sym409$CYC_STRING_TOKENIZE_NEW );
    utilities_macros.register_api_predefined_function( $sym410$CYC_STRING_UPCASE );
    utilities_macros.register_api_predefined_function( $sym411$CYC_STRINGS_TO_PHRASE );
    utilities_macros.register_api_predefined_function( $sym412$CYC_SUBL_ESCAPE );
    utilities_macros.register_api_predefined_function( $sym413$CYC_SUBL_EXPRESSION );
    utilities_macros.register_api_predefined_function( $sym414$CYC_SUBL_TEMPLATE );
    utilities_macros.register_api_predefined_function( $sym415$CYC_SUBLIST_ );
    utilities_macros.register_api_predefined_function( $sym416$CYC_SUBSTITUTE_FORMULA );
    utilities_macros.register_api_predefined_function( $sym417$CYC_SUBSTITUTE_FORMULA_ARG );
    utilities_macros.register_api_predefined_function( $sym418$CYC_SUBSTITUTE_FORMULA_ARG_POSITION );
    utilities_macros.register_api_predefined_function( $sym419$CYC_SUBSTRING );
    utilities_macros.register_api_predefined_function( $sym420$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE );
    utilities_macros.register_api_predefined_function( $sym421$CYC_SUBSTRING_PREDICATE );
    utilities_macros.register_api_predefined_function( $sym422$CYC_SUBWORD_PREDICATE );
    utilities_macros.register_api_predefined_function( $sym423$CYC_SUFFIX_SUBSTRING );
    utilities_macros.register_api_predefined_function( $sym424$CYC_SYSTEM_ATOM );
    utilities_macros.register_api_predefined_function( $sym425$CYC_SYSTEM_CHARACTER_P );
    utilities_macros.register_api_predefined_function( $sym426$CYC_SYSTEM_INTEGER );
    utilities_macros.register_api_predefined_function( $sym427$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P );
    utilities_macros.register_api_predefined_function( $sym428$CYC_SYSTEM_REAL_NUMBER_P );
    utilities_macros.register_api_predefined_function( $sym429$CYC_SYSTEM_STRING_P );
    utilities_macros.register_api_predefined_function( $sym430$CYC_SYSTEM_TERM_P );
    utilities_macros.register_api_predefined_function( $sym431$CYC_TANGENT );
    utilities_macros.register_api_predefined_function( $sym432$CYC_TIME_ELAPSED );
    utilities_macros.register_api_predefined_function( $sym433$CYC_TIME_ELAPSED_DECODE_STRING );
    utilities_macros.register_api_predefined_function( $sym434$CYC_TIME_ELAPSED_ENCODE_STRING );
    utilities_macros.register_api_predefined_function( $sym435$CYC_TIMES );
    utilities_macros.register_api_predefined_function( $sym436$CYC_TRIM_WHITESPACE );
    utilities_macros.register_api_predefined_function( $sym437$CYC_TRUE_SUBL );
    utilities_macros.register_api_predefined_function( $sym438$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL );
    utilities_macros.register_api_predefined_function( $sym439$CYC_UNICODE_DENOTING_ASCII_STRING_P );
    utilities_macros.register_api_predefined_function( $sym440$CYC_ZIP_CODE_FIVE_DIGIT );
    utilities_macros.register_api_predefined_function( $sym441$CYC_ZIP_CODE_NINE_DIGIT );
    utilities_macros.register_api_predefined_function( $sym442$CYCL_ASSERTED_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym443$CYCL_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym444$CYCL_ATOMIC_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym445$CYCL_ATOMIC_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym446$CYCL_ATOMIC_TERM_P );
    utilities_macros.register_api_predefined_function( $sym447$CYCL_CLOSED_ATOMIC_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym448$CYCL_CLOSED_ATOMIC_TERM_P );
    utilities_macros.register_api_predefined_function( $sym449$CYCL_CLOSED_DENOTATIONAL_TERM_ );
    utilities_macros.register_api_predefined_function( $sym450$CYCL_CLOSED_EXPRESSION_ );
    utilities_macros.register_api_predefined_function( $sym451$CYCL_CLOSED_FORMULA_ );
    utilities_macros.register_api_predefined_function( $sym452$CYCL_CLOSED_NON_ATOMIC_TERM_ );
    utilities_macros.register_api_predefined_function( $sym453$CYCL_CLOSED_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym454$CYCL_CONSTANT_P );
    utilities_macros.register_api_predefined_function( $sym455$CYCL_DEDUCED_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym456$CYCL_DENOTATIONAL_TERM_P );
    utilities_macros.register_api_predefined_function( $sym457$CYCL_EXPRESSION_ASKABLE_ );
    utilities_macros.register_api_predefined_function( $sym458$CYCL_EXPRESSION_ASSERTIBLE_ );
    utilities_macros.register_api_predefined_function( $sym459$CYCL_EXPRESSION_ );
    utilities_macros.register_api_predefined_function( $sym460$CYCL_FORMULA_ );
    utilities_macros.register_api_predefined_function( $sym461$CYCL_GAF_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym462$CYCL_INDEXED_TERM_ );
    utilities_macros.register_api_predefined_function( $sym463$CYCL_NL_SEMANTIC_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym464$CYCL_NON_ATOMIC_REIFIED_TERM_ );
    utilities_macros.register_api_predefined_function( $sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_ );
    utilities_macros.register_api_predefined_function( $sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ );
    utilities_macros.register_api_predefined_function( $sym467$CYCL_NON_ATOMIC_TERM_ );
    utilities_macros.register_api_predefined_function( $sym468$CYCL_OPEN_DENOTATIONAL_TERM_ );
    utilities_macros.register_api_predefined_function( $sym469$CYCL_OPEN_EXPRESSION_ );
    utilities_macros.register_api_predefined_function( $sym470$CYCL_OPEN_FORMULA_ );
    utilities_macros.register_api_predefined_function( $sym471$CYCL_OPEN_NON_ATOMIC_TERM_ );
    utilities_macros.register_api_predefined_function( $sym472$CYCL_OPEN_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym473$CYCL_PROPOSITIONAL_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym474$CYCL_REFORMULATOR_RULE_ );
    utilities_macros.register_api_predefined_function( $sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_ );
    utilities_macros.register_api_predefined_function( $sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_ );
    utilities_macros.register_api_predefined_function( $sym477$CYCL_REIFIED_DENOTATIONAL_TERM_ );
    utilities_macros.register_api_predefined_function( $sym478$CYCL_REPRESENTED_ATOMIC_TERM_P );
    utilities_macros.register_api_predefined_function( $sym479$CYCL_REPRESENTED_TERM_ );
    utilities_macros.register_api_predefined_function( $sym480$CYCL_RULE_ASSERTION_ );
    utilities_macros.register_api_predefined_function( $sym481$CYCL_SENTENCE_ASKABLE_ );
    utilities_macros.register_api_predefined_function( $sym482$CYCL_SENTENCE_ASSERTIBLE_ );
    utilities_macros.register_api_predefined_function( $sym483$CYCL_SENTENCE_ );
    utilities_macros.register_api_predefined_function( $sym484$CYCL_SUBL_SYMBOL_P );
    utilities_macros.register_api_predefined_function( $sym485$CYCL_UNBOUND_RELATION_FORMULA_P );
    utilities_macros.register_api_predefined_function( $sym486$CYCL_VAR_LIST_ );
    utilities_macros.register_api_predefined_function( $sym487$CYCL_VARIABLE_P );
    utilities_macros.register_api_predefined_function( $sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_ );
    utilities_macros.register_api_predefined_function( $sym489$CYCSECURE_VERSION_OF_SOFTWARE_ );
    utilities_macros.register_api_predefined_function( $sym490$GAF_ );
    utilities_macros.register_api_predefined_function( $sym491$GEN_TEMPLATE_RECIPE_P );
    utilities_macros.register_api_predefined_function( $sym492$GENERATE_NAMES_FOR_TERM );
    utilities_macros.register_api_predefined_function( $sym493$GENERATE_PHRASE_DEFN );
    utilities_macros.register_api_predefined_function( $sym494$HL_EXTERNAL_ID_STRING_P );
    utilities_macros.register_api_predefined_function( $sym495$IBQE_ );
    utilities_macros.register_api_predefined_function( $sym496$INTEGERP );
    utilities_macros.register_api_predefined_function( $sym497$KEYWORDP );
    utilities_macros.register_api_predefined_function( $sym498$KWTE_ );
    utilities_macros.register_api_predefined_function( $sym499$LISTP );
    utilities_macros.register_api_predefined_function( $sym500$MONAD_CYCL_MT_ );
    utilities_macros.register_api_predefined_function( $sym501$NON_NEGATIVE_SCALAR_INTERVAL_ );
    utilities_macros.register_api_predefined_function( $sym502$POSITIVE_SCALAR_INTERVAL_ );
    utilities_macros.register_api_predefined_function( $sym503$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING );
    utilities_macros.register_api_predefined_function( $sym504$RTP_SYNTACTIC_CONSTRAINT );
    utilities_macros.register_api_predefined_function( $sym505$SCALAR_POINT_VALUE_ );
    utilities_macros.register_api_predefined_function( $sym506$STRING_W_O_CONTROL_CHARS_ );
    utilities_macros.register_api_predefined_function( $sym507$STRINGP );
    utilities_macros.register_api_predefined_function( $sym508$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P );
    utilities_macros.register_api_predefined_function( $sym509$SYMBOLP );
    utilities_macros.register_api_predefined_function( $sym510$TEMPORAL_DIMENSION_MT_P );
    utilities_macros.register_api_predefined_function( $sym511$TRUE );
    utilities_macros.register_api_predefined_function( $sym512$URL_P );
    cdolist_list_var = $list513;
    symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      utilities_macros.register_api_predefined_function( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    return NIL;
  }

  private static SubLObject _constant_64_initializer()
  {
	  
    return ConsesLow.list( new SubLObject[] { maybeMake( "*" ), maybeMake( "+" ), maybeMake( "-" ), maybeMake( "/" ), maybeMake( "/=" ), maybeMake( "<" ), maybeMake( "<=" ), maybeMake( "=" ), maybeMake( ">" ),
      maybeMake( ">" ), maybeMake( ">=" ), maybeMake( "ABS" ), maybeMake( "ACONS" ), maybeMake( "ACOS" ), maybeMake( "ADJOIN" ), maybeMake( "ALPHA-CHAR-P" ), maybeMake( "ALPHANUMERICP" ), maybeMake( "APPEND" ),
      maybeMake( "AREF" ), maybeMake( "ASH" ), maybeMake( "ASIN" ), maybeMake( "ASSOC" ), maybeMake( "ASSOC-IF" ), maybeMake( "ATAN" ), maybeMake( "ATOM" ), maybeMake( "BOOLE" ), maybeMake( "BOOLEAN" ),
      maybeMake( "BOTH-CASE-P" ), maybeMake( "BQ-CONS" ), maybeMake( "BQ-VECTOR" ), maybeMake( "BUTLAST" ), maybeMake( "BYTE" ), maybeMake( "CAAR" ), maybeMake( "CADR" ), maybeMake( "CAR" ), maybeMake(
          "CCONCATENATE" ), maybeMake( "CDAR" ), maybeMake( "CDDR" ), maybeMake( "CDR" ), maybeMake( "CEILING" ), maybeMake( "CERROR" ), maybeMake( "CHAR" ), maybeMake( "CHAR-CODE" ), maybeMake(
              "CHAR-DOWNCASE" ), maybeMake( "CHAR-EQUAL" ), maybeMake( "CHAR-GREATERP" ), maybeMake( "CHAR-LESSP" ), maybeMake( "CHAR-NOT-EQUAL" ), maybeMake( "CHAR-NOT-GREATERP" ), maybeMake( "CHAR-NOT-LESSP" ),
      maybeMake( "CHAR-UPCASE" ), maybeMake( "CHAR/=" ), maybeMake( "CHAR<" ), maybeMake( "CHAR<=" ), maybeMake( "CHAR=" ), maybeMake( "CHAR>" ), maybeMake( "CHAR>=" ), maybeMake( "CHARACTERP" ), maybeMake(
          "CLRHASH" ), maybeMake( "CMERGE" ), maybeMake( "CODE-CHAR" ), maybeMake( "CONS" ), maybeMake( "CONSP" ), maybeMake( "CONSTANTP" ), maybeMake( "CONSTRUCT-FILENAME" ), maybeMake( "COPY-ALIST" ),
      maybeMake( "COPY-LIST" ), maybeMake( "COPY-SEQ" ), maybeMake( "COPY-TREE" ), maybeMake( "COS" ), maybeMake( "COUNT" ), maybeMake( "COUNT-IF" ), maybeMake( "CREDUCE" ), maybeMake( "CURRENT-PROCESS" ),
      maybeMake( "DATE-RELATIVE-GUID-P" ), maybeMake( "DECODE-FLOAT" ), maybeMake( "DECODE-UNIVERSAL-TIME" ), maybeMake( "DELETE" ), maybeMake( "DELETE-DUPLICATES" ), maybeMake( "DELETE-IF" ), maybeMake(
          "DIGIT-CHAR" ), maybeMake( "DIGIT-CHAR-P" ), maybeMake( "DISASSEMBLE-INTEGER-TO-FIXNUMS" ), maybeMake( "DPB" ), maybeMake( "EIGHTH" ), maybeMake( "ELT" ), maybeMake( "ENCODE-UNIVERSAL-TIME" ), maybeMake(
              "ENDP" ), EQ, EQL, EQUAL, EQUALP, maybeMake( "EVENP" ), maybeMake( "EXIT" ), maybeMake( "EXP" ), maybeMake( "EXPT" ), maybeMake( "FALSE" ), maybeMake( "FIFTH" ), maybeMake( "FILL" ), maybeMake(
                  "FIND" ), maybeMake( "FIND-IF" ), maybeMake( "FIND-PACKAGE" ), maybeMake( "FIND-SYMBOL" ), maybeMake( "FIRST" ), maybeMake( "FIXNUMP" ), maybeMake( "FLOAT" ), maybeMake( "FLOAT-DIGITS" ),
      maybeMake( "FLOAT-RADIX" ), maybeMake( "FLOAT-SIGN" ), maybeMake( "FLOATP" ), maybeMake( "FLOOR" ), maybeMake( "FORCE-OUTPUT" ), maybeMake( "FORMAT" ), maybeMake( "FOURTH" ), maybeMake( "FRESH-LINE" ),
      maybeMake( "FUNCTION-SPEC-P" ), maybeMake( "FUNCTIONP" ), maybeMake( "GC" ), maybeMake( "GC-DYNAMIC" ), maybeMake( "GC-EPHEMERAL" ), maybeMake( "GC-FULL" ), maybeMake( "GENSYM" ), maybeMake( "GENTEMP" ),
      maybeMake( "GET" ), maybeMake( "GET-DECODED-TIME" ), maybeMake( "GET-INTERNAL-REAL-TIME" ), maybeMake( "GET-INTERNAL-REAL-TIME" ), maybeMake( "GET-INTERNAL-RUN-TIME" ), maybeMake( "GET-UNIVERSAL-TIME" ),
      maybeMake( "GET-UNIVERSAL-TIME" ), maybeMake( "GETF" ), maybeMake( "GETHASH" ), maybeMake( "GETHASH-WITHOUT-VALUES" ), maybeMake( "GUID-P" ), maybeMake( "GUID-STRING-P" ), maybeMake( "GUID-TO-STRING" ),
      maybeMake( "GUID/=" ), maybeMake( "GUID<" ), maybeMake( "GUID<=" ), maybeMake( "GUID=" ), maybeMake( "GUID>" ), maybeMake( "GUID>=" ), maybeMake( "HASH-TABLE-COUNT" ), maybeMake( "HASH-TABLE-P" ),
      maybeMake( "HASH-TABLE-SIZE" ), maybeMake( "HASH-TABLE-TEST" ), IDENTITY, maybeMake( "IGNORE" ), maybeMake( "INFINITY-P" ), maybeMake( "INT/" ), maybeMake( "INTEGER-DECODE-FLOAT" ), maybeMake(
          "INTEGER-LENGTH" ), maybeMake( "INTEGERP" ), maybeMake( "INTERN" ), maybeMake( "INTERRUPT-PROCESS" ), maybeMake( "INTERSECTION" ), maybeMake( "ISQRT" ), maybeMake( "KEYWORDP" ), maybeMake(
              "KILL-PROCESS" ), maybeMake( "LAST" ), maybeMake( "LDB" ), maybeMake( "LDIFF" ), maybeMake( "LENGTH" ), maybeMake( "LISP-IMPLEMENTATION-TYPE" ), maybeMake( "LISP-IMPLEMENTATION-VERSION" ), maybeMake(
                  "LIST" ), maybeMake( "LIST*" ), maybeMake( "LIST-ALL-PACKAGES" ), maybeMake( "LIST-LENGTH" ), maybeMake( "LISTP" ), maybeMake( "LISTP" ), maybeMake( "LOCK-IDLE-P" ), maybeMake( "LOCK-P" ),
      maybeMake( "LOG" ), maybeMake( "LOGAND" ), maybeMake( "LOGANDC1" ), maybeMake( "LOGANDC2" ), maybeMake( "LOGBITP" ), maybeMake( "LOGCOUNT" ), maybeMake( "LOGEQV" ), maybeMake( "LOGIOR" ), maybeMake(
          "LOGNAND" ), maybeMake( "LOGNOR" ), maybeMake( "LOGNOT" ), maybeMake( "LOGORC1" ), maybeMake( "LOGORC2" ), maybeMake( "LOGTEST" ), maybeMake( "LOGXOR" ), maybeMake( "LOWER-CASE-P" ), maybeMake(
              "MAKE-HASH-TABLE" ), maybeMake( "MAKE-LOCK" ), maybeMake( "MAKE-LOCK" ), maybeMake( "MAKE-STRING" ), maybeMake( "MAKUNBOUND" ), maybeMake( "MAX" ), maybeMake( "MEMBER" ), maybeMake( "MEMBER-IF" ),
      maybeMake( "MIN" ), maybeMake( "MINUSP" ), maybeMake( "MISMATCH" ), maybeMake( "MOD" ), maybeMake( "NBUTLAST" ), maybeMake( "NCONC" ), maybeMake( "NEW-GUID" ), maybeMake( "NINTERSECTION" ), maybeMake(
          "NINTH" ), maybeMake( "NOT-A-NUMBER-P" ), maybeMake( "NOTE-PERCENT-PROGRESS" ), maybeMake( "NOTIFY" ), maybeMake( "NRECONC" ), maybeMake( "NREVERSE" ), maybeMake( "NSET-DIFFERENCE" ), maybeMake(
              "NSET-EXCLUSIVE-OR" ), maybeMake( "NSTRING-CAPITALIZE" ), maybeMake( "NSTRING-DOWNCASE" ), maybeMake( "NSTRING-UPCASE" ), maybeMake( "NSUBLIS" ), maybeMake( "NSUBST" ), maybeMake( "NSUBST-IF" ),
      maybeMake( "NSUBSTITUTE" ), maybeMake( "NSUBSTITUTE-IF" ), maybeMake( "NTH" ), maybeMake( "NTHCDR" ), maybeMake( "NULL" ), maybeMake( "NUMBERP" ), maybeMake( "NUMBERP" ), maybeMake( "NUNION" ), maybeMake(
          "ODDP" ), maybeMake( "PAIRLIS" ), maybeMake( "PEEK-CHAR" ), maybeMake( "PLUSP" ), maybeMake( "POSITION" ), maybeMake( "POSITION-IF" ), maybeMake( "PRIN1" ), maybeMake( "PRIN1-TO-STRING" ), maybeMake(
              "PRINC" ), maybeMake( "PRINC-TO-STRING" ), maybeMake( "PRINT" ), maybeMake( "PROCESS-ACTIVE-P" ), maybeMake( "PROCESS-BLOCK" ), maybeMake( "PROCESS-NAME" ), maybeMake( "PROCESS-STATE" ), maybeMake(
                  "PROCESS-UNBLOCK" ), maybeMake( "PROCESS-WAIT" ), maybeMake( "PROCESS-WAIT-WITH-TIMEOUT" ), maybeMake( "PROCESS-WHOSTATE" ), maybeMake( "PROCESSP" ), maybeMake( "RANDOM" ), maybeMake( "RASSOC" ),
      maybeMake( "RASSOC-IF" ), maybeMake( "READ-FROM-STRING" ), maybeMake( "READ-FROM-STRING-IGNORING-ERRORS" ), maybeMake( "REM" ), maybeMake( "REMF" ), maybeMake( "REMHASH" ), maybeMake( "REMOVE" ), maybeMake(
          "REMOVE-DUPLICATES" ), maybeMake( "REMOVE-IF" ), maybeMake( "REPLACE" ), maybeMake( "REST" ), maybeMake( "REVAPPEND" ), maybeMake( "REVERSE" ), maybeMake( "REVERSE" ), maybeMake( "ROOM" ), maybeMake(
              "ROUND" ), maybeMake( "RPLACA" ), maybeMake( "RPLACD" ), maybeMake( "SCALE-FLOAT" ), maybeMake( "SEARCH" ), maybeMake( "SECOND" ), maybeMake( "SEED-RANDOM" ), maybeMake( "SEQUENCEP" ), maybeMake(
                  "SET-AREF" ), maybeMake( "SET-CONSING-STATE" ), maybeMake( "SET-DIFFERENCE" ), maybeMake( "SET-NTH" ), maybeMake( "SEVENTH" ), maybeMake( "SHOW-PROCESSES" ), maybeMake( "SIN" ), maybeMake(
                      "SIXTH" ), maybeMake( "SLEEP" ), maybeMake( "SORT" ), maybeMake( "SQRT" ), maybeMake( "STABLE-SORT" ), maybeMake( "STRING" ), maybeMake( "STRING-CAPITALIZE" ), maybeMake( "STRING-DOWNCASE" ),
      maybeMake( "STRING-EQUAL" ), maybeMake( "STRING-GREATERP" ), maybeMake( "STRING-LEFT-TRIM" ), maybeMake( "STRING-LESSP" ), maybeMake( "STRING-NOT-EQUAL" ), maybeMake( "STRING-NOT-GREATERP" ), maybeMake(
          "STRING-NOT-LESSP" ), maybeMake( "STRING-RIGHT-TRIM" ), maybeMake( "STRING-TO-GUID" ), maybeMake( "STRING-TRIM" ), maybeMake( "STRING-UPCASE" ), maybeMake( "STRING/=" ), maybeMake( "STRING<" ),
      maybeMake( "STRING<=" ), maybeMake( "STRING=" ), maybeMake( "STRING>" ), maybeMake( "STRING>=" ), maybeMake( "STRINGP" ), maybeMake( "SUBLIS" ), maybeMake( "SUBSEQ" ), maybeMake( "SUBSETP" ), maybeMake(
          "SUBST" ), maybeMake( "SUBST-IF" ), maybeMake( "SUBSTITUTE" ), maybeMake( "SUBSTITUTE-IF" ), maybeMake( "SXHASH" ), maybeMake( "SYMBOL-FUNCTION" ), maybeMake( "SYMBOL-NAME" ), maybeMake( "SYMBOLP" ),
      maybeMake( "SYMBOLP" ), maybeMake( "TAILP" ), maybeMake( "TAN" ), maybeMake( "TENTH" ), maybeMake( "TERPRI" ), maybeMake( "THIRD" ), maybeMake( "TREE-EQUAL" ), maybeMake( "TRUE" ), maybeMake( "TRUNCATE" ),
      maybeMake( "TYPE-OF" ), maybeMake( "UNINTERN" ), maybeMake( "UNION" ), maybeMake( "UPPER-CASE-P" ), maybeMake( "VALID-PROCESS-P" ), maybeMake( "VALUES" ), maybeMake( "VECTOR" ), maybeMake( "VECTORP" ),
      maybeMake( "WARN" ), maybeMake( "WRITE-IMAGE" ), maybeMake( "Y-OR-N-P" ), maybeMake( "YES-OR-NO-P" ), maybeMake( "ZEROP" ), maybeMake( "PROPERTY-LIST-MEMBER", "SUBLISP" ), maybeMake(
          "CDESTRUCTURING-BIND-ERROR", "SUBLISP" ), maybeMake( "DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP" ), maybeMake( "DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP" )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_eval_in_api_registrations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_eval_in_api_registrations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_eval_in_api_registrations_file();
  }
  static
  {
    me = new eval_in_api_registrations();
    $sublisp_api_predefined_functions$ = null;
    $api_host_access_functions$ = null;
    $sym0$_NULL_OUTPUT_ = makeSymbol( "*NULL-OUTPUT*" );
    $sym1$_IT_VERBOSE_ = makeSymbol( "*IT-VERBOSE*" );
    $sym2$_PROGRESS_NOTE_ = makeSymbol( "*PROGRESS-NOTE*" );
    $sym3$_PROGRESS_SOFAR_ = makeSymbol( "*PROGRESS-SOFAR*" );
    $sym4$_PROGRESS_START_TIME_ = makeSymbol( "*PROGRESS-START-TIME*" );
    $sym5$_PROGRESS_TOTAL_ = makeSymbol( "*PROGRESS-TOTAL*" );
    $sym6$_EVAL_WITH_BINDINGS_ = makeSymbol( "*EVAL-WITH-BINDINGS*" );
    $sym7$_ERROR_OUTPUT_ = makeSymbol( "*ERROR-OUTPUT*" );
    $sym8$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $sym9$_CONTINUE_CERROR__ = makeSymbol( "*CONTINUE-CERROR?*" );
    $sym10$_SILENT_PROGRESS__ = makeSymbol( "*SILENT-PROGRESS?*" );
    $sym11$_IGNORE_BREAKS__ = makeSymbol( "*IGNORE-BREAKS?*" );
    $sym12$_IGNORE_WARNS__ = makeSymbol( "*IGNORE-WARNS?*" );
    $sym13$_EVAL_IN_API_TRACE_LOG_ = makeSymbol( "*EVAL-IN-API-TRACE-LOG*" );
    $sym14$_EVAL_IN_API_TRACED_FNS_ = makeSymbol( "*EVAL-IN-API-TRACED-FNS*" );
    $sym15$_EVAL_IN_API_ENV_ = makeSymbol( "*EVAL-IN-API-ENV*" );
    $sym16$_API_OUTPUT_PROTOCOL_ = makeSymbol( "*API-OUTPUT-PROTOCOL*" );
    $sym17$_API_RESULT_METHOD_ = makeSymbol( "*API-RESULT-METHOD*" );
    $sym18$_API_INPUT_PROTOCOL_ = makeSymbol( "*API-INPUT-PROTOCOL*" );
    $sym19$_KE_PURPOSE_ = makeSymbol( "*KE-PURPOSE*" );
    $sym20$_THE_CYCLIST_ = makeSymbol( "*THE-CYCLIST*" );
    $sym21$_USE_LOCAL_QUEUE__ = makeSymbol( "*USE-LOCAL-QUEUE?*" );
    $sym22$_RELEVANT_MT_FUNCTION_ = makeSymbol( "*RELEVANT-MT-FUNCTION*" );
    $sym23$_CYC_BOOKKEEPING_INFO_ = makeSymbol( "*CYC-BOOKKEEPING-INFO*" );
    $sym24$_SUPPRESS_SBHL_RECACHING__ = makeSymbol( "*SUPPRESS-SBHL-RECACHING?*" );
    $sym25$_PARAPHRASE_PRECISION_ = makeSymbol( "*PARAPHRASE-PRECISION*" );
    $sym26$_EVAL_IN_API_LEVEL_ = makeSymbol( "*EVAL-IN-API-LEVEL*" );
    $sym27$_SUSPEND_SBHL_TYPE_CHECKING__ = makeSymbol( "*SUSPEND-SBHL-TYPE-CHECKING?*" );
    $sym28$_REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS_ = makeSymbol( "*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*" );
    $sym29$_TASK_PROCESSOR_VERBOSITY_ = makeSymbol( "*TASK-PROCESSOR-VERBOSITY*" );
    $sym30$BQ_APPEND = makeSymbol( "BQ-APPEND" );
    $sym31$BQ_LIST = makeSymbol( "BQ-LIST" );
    $sym32$BQ_LIST_ = makeSymbol( "BQ-LIST*" );
    $sym33$BQ_NCONC = makeSymbol( "BQ-NCONC" );
    $sym34$BQ_VECTOR_APPEND = makeSymbol( "BQ-VECTOR-APPEND" );
    $sym35$LIST = makeSymbol( "LIST" );
    $sym36$API_BQ_LIST = makeSymbol( "API-BQ-LIST" );
    $sym37$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym38$WITH_PRECISE_PARAPHRASE_ON = makeSymbol( "WITH-PRECISE-PARAPHRASE-ON" );
    $sym39$WITH_PARAPHRASE_PRECISION = makeSymbol( "WITH-PARAPHRASE-PRECISION" );
    $sym40$WITH_BOOKKEEPING_INFO = makeSymbol( "WITH-BOOKKEEPING-INFO" );
    $sym41$WITH_MT_FUNCTION = makeSymbol( "WITH-MT-FUNCTION" );
    $sym42$WITH_GENL_MTS = makeSymbol( "WITH-GENL-MTS" );
    $sym43$WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" );
    $sym44$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $sym45$DO_PREDICATE_RULE_INDEX = makeSymbol( "DO-PREDICATE-RULE-INDEX" );
    $sym46$DO_RULE_INDEX = makeSymbol( "DO-RULE-INDEX" );
    $sym47$WITHOUT_WFF_SEMANTICS = makeSymbol( "WITHOUT-WFF-SEMANTICS" );
    $sym48$CDOLIST_DONE = makeSymbol( "CDOLIST-DONE" );
    $sym49$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym50$PROGRESS_CDOTIMES = makeSymbol( "PROGRESS-CDOTIMES" );
    $sym51$DO_KB_SUID_TABLE = makeSymbol( "DO-KB-SUID-TABLE" );
    $sym52$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $sym53$OLD_DO_ID_INDEX = makeSymbol( "OLD-DO-ID-INDEX" );
    $sym54$NEW_DO_ID_INDEX = makeSymbol( "NEW-DO-ID-INDEX" );
    $sym55$DO_CONSTANTS = makeSymbol( "DO-CONSTANTS" );
    $sym56$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym57$WITH_INPUT_FROM_STRING = makeSymbol( "WITH-INPUT-FROM-STRING" );
    $sym58$DO_VECTOR_INDEX = makeSymbol( "DO-VECTOR-INDEX" );
    $sym59$IN_MT = makeSymbol( "IN-MT" );
    $sym60$DO_ITERATOR_WITHOUT_VALUES_PROGRESS = makeSymbol( "DO-ITERATOR-WITHOUT-VALUES-PROGRESS" );
    $sym61$WITH_OPEN_STREAM = makeSymbol( "WITH-OPEN-STREAM" );
    $sym62$WITH_OPEN_FILE = makeSymbol( "WITH-OPEN-FILE" );
    $sym63$WITH_TCP_CONNECTION = makeSymbol( "WITH-TCP-CONNECTION" );
    $list64 = _constant_64_initializer();
    $list65 = ConsesLow.list( new SubLObject[] { makeSymbol( "ADD1" ), makeSymbol( "ADD2" ), makeSymbol( "API-DYNAMIC-VARIABLE-P" ), makeSymbol( "API-LEXICAL-VARIABLE-P" ), makeSymbol( "API-TEST-FN" ), makeSymbol(
        "B-VERIFY" ), makeSymbol( "BOOLEANP" ), makeSymbol( "CFASL-LOAD" ), makeSymbol( "COPY-HASH-TABLE" ), makeSymbol( "CYC-IMAGE-ID" ), makeSymbol( "CYCL-PATCH-NUMBER" ), makeSymbol( "CYCL-SYSTEM-NUMBER" ),
      makeSymbol( "DEF-INFERENCE-TEST" ), makeSymbol( "DEFINE-INFERENCE-TEST" ), makeSymbol( "DIV2" ), makeSymbol( "EVAL-IN-API-PREDEFINED-FN?" ), makeSymbol( "EVAL-IN-API-USER-FN?" ), makeSymbol(
          "FLOAT-PARSE-INTEGER" ), makeSymbol( "FLONUM-DIGIT-LIST" ), makeSymbol( "FROB-CASE" ), makeSymbol( "GENERATE-STALE-DOCUMENTATION-REPORT" ), makeSymbol( "GET-TIME" ), makeSymbol( "GET-TIMEZONE" ), makeSymbol(
              "HALT-CYC-IMAGE" ), makeSymbol( "HERALD-START" ), makeSymbol( "KB-LOADED" ), makeSymbol( "LOAD-WORLD" ), makeSymbol( "LOCK-LOCKER" ), makeSymbol( "LOCK-NAME" ), makeSymbol( "MACROP" ), makeSymbol( "MAX2" ),
      makeSymbol( "MEMBER?" ), makeSymbol( "MIN2" ), makeSymbol( "MINUS" ), makeSymbol( "MULT2" ), makeSymbol( "NAME-CHARACTER" ), makeSymbol( "NCONC2" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ), makeSymbol(
          "NON-TERMINATING-MACRO-SYNTAXP" ), makeSymbol( "NOT-A-LIST-ARGUMENT" ), makeSymbol( "POSSIBLY-GC" ), makeSymbol( "POTENTIAL-NUMBER-P" ), makeSymbol( "PRINT-ASSERT" ), makeSymbol( "PRINT-CREATE" ), makeSymbol(
              "PRINT-KILL" ), makeSymbol( "PROCESS-VALID-P" ), makeSymbol( "PROCESS-YIELD" ), makeSymbol( "RANDOM-ASSERTION" ), makeSymbol( "RANDOM-CONSTANT" ), makeSymbol( "RANDOM-NART" ), makeSymbol( "RELEASE-LOCK" ),
      makeSymbol( "ROUND-DIGITS" ), makeSymbol( "RUN-TEST" ), makeSymbol( "SEIZE-LOCK" ), makeSymbol( "SFORMP" ), makeSymbol( "SINGLE-BYTE-P" ), makeSymbol( "STRING-DESIGNATORP" ), makeSymbol( "SUB1" ), makeSymbol(
          "SUB2" ), makeSymbol( "UPDATE-TEST-RESULTS" ), makeSymbol( "WHITESPACE-1-CHAR-P" ), makeSymbol( "WHITESPACE-2-CHAR-P" )
    } );
    $list66 = ConsesLow.list( new SubLObject[] { makeSymbol( "NEW-DICTIONARY" ), makeSymbol( "DICTIONARY-LENGTH" ), makeSymbol( "CLEAR-DICTIONARY" ), makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "DICTIONARY-PUSH" ),
      makeSymbol( "DICTIONARY-PUSHNEW" ), makeSymbol( "DICTIONARY-REMOVE-FROM-VALUE" ), makeSymbol( "DICTIONARY-REMOVE" ), makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "DICTIONARY-KEYS" ), makeSymbol(
          "DICTIONARY-VALUES" )
    } );
    $sym67$STRING_TO_GUID = makeSymbol( "STRING-TO-GUID" );
    $sym68$GUID_TO_STRING = makeSymbol( "GUID-TO-STRING" );
    $sym69$REMOVE_DUPLICATES = makeSymbol( "REMOVE-DUPLICATES" );
    $sym70$NEW_BOOKKEEPING_INFO = makeSymbol( "NEW-BOOKKEEPING-INFO" );
    $sym71$STRING_SUBSTITUTE = makeSymbol( "STRING-SUBSTITUTE" );
    $sym72$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $sym73$THE_DATE = makeSymbol( "THE-DATE" );
    $sym74$THE_SECOND = makeSymbol( "THE-SECOND" );
    $sym75$ISA = makeSymbol( "ISA" );
    $sym76$GENLS = makeSymbol( "GENLS" );
    $sym77$WHY_COLLECTIONS_INTERSECT_ = makeSymbol( "WHY-COLLECTIONS-INTERSECT?" );
    $sym78$ARG1_FORMAT = makeSymbol( "ARG1-FORMAT" );
    $sym79$ARG2_FORMAT = makeSymbol( "ARG2-FORMAT" );
    $sym80$SPECS = makeSymbol( "SPECS" );
    $sym81$COLLECTION_LEAVES = makeSymbol( "COLLECTION-LEAVES" );
    $sym82$SIMPLE_INDEXED_TERM_P = makeSymbol( "SIMPLE-INDEXED-TERM-P" );
    $sym83$MAX_SPECS = makeSymbol( "MAX-SPECS" );
    $sym84$MIN_ISA = makeSymbol( "MIN-ISA" );
    $sym85$LOCAL_DISJOINT_WITH = makeSymbol( "LOCAL-DISJOINT-WITH" );
    $sym86$DISJOINT_WITH_ = makeSymbol( "DISJOINT-WITH?" );
    $sym87$GENL_SIBLINGS = makeSymbol( "GENL-SIBLINGS" );
    $sym88$SPEC_SIBLINGS = makeSymbol( "SPEC-SIBLINGS" );
    $sym89$ARG1_ISA = makeSymbol( "ARG1-ISA" );
    $sym90$ARG2_ISA = makeSymbol( "ARG2-ISA" );
    $sym91$ARGN_ISA = makeSymbol( "ARGN-ISA" );
    $sym92$ARGN_GENL = makeSymbol( "ARGN-GENL" );
    $sym93$ALL_GENLS_IN_ANY_MT = makeSymbol( "ALL-GENLS-IN-ANY-MT" );
    $sym94$ALL_ISA_IN_ANY_MT = makeSymbol( "ALL-ISA-IN-ANY-MT" );
    $sym95$ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol( "ALL-FORT-INSTANCES-IN-ALL-MTS" );
    $sym96$ISA_IN_ANY_MT_ = makeSymbol( "ISA-IN-ANY-MT?" );
    $sym97$GENL_IN_ANY_MT_ = makeSymbol( "GENL-IN-ANY-MT?" );
    $sym98$NEW_CONSTANT_NAME_SPEC_P = makeSymbol( "NEW-CONSTANT-NAME-SPEC-P" );
    $sym99$DO_RULE_INDEX_RULES = makeSymbol( "DO-RULE-INDEX-RULES" );
    $sym100$BT_LOWER = makeSymbol( "BT-LOWER" );
    $sym101$BT_HIGHER = makeSymbol( "BT-HIGHER" );
    $sym102$SAMPLE_LEAF_SPECS = makeSymbol( "SAMPLE-LEAF-SPECS" );
    $sym103$TACIT_COEXTENSIONAL_ = makeSymbol( "TACIT-COEXTENSIONAL?" );
    $sym104$EL_WFF_ = makeSymbol( "EL-WFF?" );
    $sym105$EVALUATABLE_PREDICATE_ = makeSymbol( "EVALUATABLE-PREDICATE?" );
    $sym106$HIERARCHICAL_COLLECTIONS_ = makeSymbol( "HIERARCHICAL-COLLECTIONS?" );
    $sym107$NUM_BEST_GAF_LOOKUP_INDEX = makeSymbol( "NUM-BEST-GAF-LOOKUP-INDEX" );
    $sym108$API_QUIT = makeSymbol( "API-QUIT" );
    $sym109$NART_P = makeSymbol( "NART-P" );
    $sym110$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $sym111$PPH_PRECISION_P = makeSymbol( "PPH-PRECISION-P" );
    $sym112$FORT_FOR_STRING = makeSymbol( "FORT-FOR-STRING" );
    $sym113$RTP_PARSE_EXP_W_VPP = makeSymbol( "RTP-PARSE-EXP-W/VPP" );
    $sym114$GET_UNIVERSAL_TIME = makeSymbol( "GET-UNIVERSAL-TIME" );
    $sym115$DECODE_UNIVERSAL_TIME = makeSymbol( "DECODE-UNIVERSAL-TIME" );
    $sym116$FIND_NART = makeSymbol( "FIND-NART" );
    $sym117$CONSTANT_GUID = makeSymbol( "CONSTANT-GUID" );
    $sym118$RKF_PHRASE_READER = makeSymbol( "RKF-PHRASE-READER" );
    $sym119$GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES = makeSymbol( "GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES" );
    $sym120$LOAD_TRANSCRIPT_FILE = makeSymbol( "LOAD-TRANSCRIPT-FILE" );
    $sym121$KB_STATISTICS = makeSymbol( "KB-STATISTICS" );
    $sym122$GENL_MT_ = makeSymbol( "GENL-MT?" );
    $sym123$ALL_SPEC_MTS = makeSymbol( "ALL-SPEC-MTS" );
    $sym124$REMOVAL_ASK = makeSymbol( "REMOVAL-ASK" );
    $sym125$DO_NARTS_TABLE = makeSymbol( "DO-NARTS-TABLE" );
    $sym126$ID_INDEX_COUNT = makeSymbol( "ID-INDEX-COUNT" );
    $sym127$ID_INDEX_DENSE_OBJECTS = makeSymbol( "ID-INDEX-DENSE-OBJECTS" );
    $sym128$ID_INDEX_EMPTY_P = makeSymbol( "ID-INDEX-EMPTY-P" );
    $sym129$ID_INDEX_SPARSE_ID_THRESHOLD = makeSymbol( "ID-INDEX-SPARSE-ID-THRESHOLD" );
    $sym130$ID_INDEX_NEXT_ID = makeSymbol( "ID-INDEX-NEXT-ID" );
    $sym131$CYCL_NART_P = makeSymbol( "CYCL-NART-P" );
    $sym132$CYCL_NAUT_P = makeSymbol( "CYCL-NAUT-P" );
    $sym133$RESOLVE_NEW_CONSTANTS = makeSymbol( "RESOLVE-NEW-CONSTANTS" );
    $sym134$CYC_OPENCYC_FEATURE = makeSymbol( "CYC-OPENCYC-FEATURE" );
    $sym135$CYC_RESEARCHCYC_FEATURE = makeSymbol( "CYC-RESEARCHCYC-FEATURE" );
    $sym136$CANONICALIZE_HLMT = makeSymbol( "CANONICALIZE-HLMT" );
    $sym137$NEW_CYC_QUERY = makeSymbol( "NEW-CYC-QUERY" );
    $sym138$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol( "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE" );
    $sym139$INFERENCE_REMOVAL_MODULE = makeSymbol( "INFERENCE-REMOVAL-MODULE" );
    $sym140$UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol( "UNDECLARE-INFERENCE-REMOVAL-MODULE" );
    $list141 = ConsesLow.list( new SubLObject[] { makeSymbol( "UIA-TERM-PHRASE-MEMOIZED" ), makeSymbol( "BLUE-FETCH-UIA-BLUE-EVENT" ), makeSymbol( "BBF-RTV-ALL-EDGES-FROM-NODE" ), makeSymbol(
        "BBF-MIN-FORWARD-AND-BACKWARD-TRUE" ), makeSymbol( "BBF-RTV-ALL-EDGES-BETWEEN" ), makeSymbol( "BBF-ALL-EDGES-SUBSUMED-BY-PREDS" ), makeSymbol( "BBF-FORWARD-TRUE" ), makeSymbol( "BBF-BACKWARD-TRUE" ), makeSymbol(
            "BBF-MIN-FORWARD-TRUE" ), makeSymbol( "BBF-MIN-BACKWARD-TRUE" ), makeSymbol( "BBF-MIN-CEILINGS-FORWARD-TRUE" ), makeSymbol( "BBF-SCRIPT" ), makeSymbol( "BFF-EELD-IRRELEVANT-TERMS" ), makeSymbol(
                "BFF-CYC-KB-SUBSET-COLLECTIONS" ), makeSymbol( "BFF-ARBITRARY-UNIONS" ), makeSymbol( "BFF-MOST-GENERAL-5" ), makeSymbol( "BFF-MOST-GENERAL-10" ), makeSymbol( "BFF-MOST-GENERAL-20" )
    } );
    $list142 = ConsesLow.list( new SubLObject[] { makeSymbol( "GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT" ), makeSymbol( "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT" ), makeSymbol(
        "GET-ORIGINAL-STRING-FOR-QUERY" ), makeSymbol( "PARSED-QUERY-TEMPLATE-P" ), makeSymbol( "CLEAR-INVERTED-INDEX" ), makeSymbol( "INDEX-QUERIES-FROM-NODE" ), makeSymbol( "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS" ),
      makeSymbol( "SUGGEST-LOADING-MT-FOR-CYCL-QUERY" ), makeSymbol( "CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY" ), makeSymbol( "CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY" ), makeSymbol(
          "GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML" ), makeSymbol( "GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML" ), makeSymbol( "JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS" ), makeSymbol(
              "JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS" ), makeSymbol( "MAIL-TO-USER" ), makeSymbol( "MAIL-TO-USER-WITH-CONTENT-TYPE" ), makeSymbol( "APPLICABLE-TEMPLATE-TOPICS-FOR-TERM" ), makeSymbol(
                  "FOCAL-TERM-TYPE-FOR-TOPIC-TYPE" ), makeSymbol( "WFF?" )
    } );
    $list143 = ConsesLow.list( new SubLObject[] { makeSymbol( "PPH-INFERENCE-ANSWER-PROOFS" ), makeSymbol( "GKE-START-CONTINUABLE-QUERY" ), makeSymbol( "GKE-CONTINUE-QUERY" ), makeSymbol( "GKE-STOP-CONTINUABLE-QUERY" ),
      makeSymbol( "GKE-GET-INFERENCE-RESULTS" ), makeSymbol( "GKE-GET-ONE-INFERENCE-RESULT" ), makeSymbol( "GKE-GET-INFERENCE-STATUS" ), makeSymbol( "GKE-GET-INFERENCE-SUSPEND-STATUS" ), makeSymbol(
          "GKE-INFERENCE-COMPLETE?" ), makeSymbol( "GKE-RELEASE-INFERENCE-RESOURCES" ), makeSymbol( "INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT" )
    } );
    $list144 = ConsesLow.list( makeSymbol( "GENERATE-PHRASE-FOR-JAVA" ), makeSymbol( "GET-TERM-LIST-AS-RENDERINGS" ), makeSymbol( "GET-EXAMPLE-INSTANCES-AS-RENDERINGS" ), makeSymbol(
        "GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW" ), makeSymbol( "GET-INSTANCES-AS-RENDERINGS" ), makeSymbol( "DENOTS-OF-STRING" ) );
    $list145 = ConsesLow.list( makeSymbol( "REFORMULATE-UNKNOWN-FET-TERM" ), makeSymbol( "CLEAR-GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT" ), makeSymbol( "GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT" ), makeSymbol(
        "GET-TEMPLATE-TOPIC-IN-XML" ), makeSymbol( "FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT" ), makeSymbol( "GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML" ) );
    $list146 = ConsesLow.list( makeSymbol( "CONSTANT-VIA-STAR-COMPLETION" ), makeSymbol( "DELETE-IF" ), makeSymbol( "EL-NEGATE" ), makeSymbol( "RELATION-P" ), makeSymbol( "ALL-RELATION-CONSTRAINT-SENTENCES" ) );
    $list147 = ConsesLow.list( new SubLObject[] { makeSymbol( "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS" ), makeSymbol( "ANSWER-GUI-QUESTION" ), makeSymbol( "CLEAR-INVERTED-INDEX" ), makeSymbol( "FIND-INFERENCE-BY-ID" ),
      makeSymbol( "FIND-PROBLEM-STORE-BY-ID" ), makeSymbol( "FLATTEN" ), makeSymbol( "GET-ORIGINAL-STRING-FOR-QUERY" ), makeSymbol( "INDEX-QUERIES-FROM-NODE" ), makeSymbol( "INDEXED-QUERIES-FROM-STRING" ), makeSymbol(
          "INFERENCE-INPUT-EL-QUERY" ), makeSymbol( "NART-SUBSTITUTE" ), makeSymbol( "PARSED-QUERY-TEMPLATE-P" ), makeSymbol( "POSITIVE-INFINITY" ), makeSymbol( "PREDICATE-P" ), makeSymbol( "REMOVE-IF-NOT" ), makeSymbol(
              "SKSI-SUPPORTED-EXTERNAL-TERM?" )
    } );
    $list148 = ConsesLow.list( new SubLObject[] { makeSymbol( "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER" ), makeSymbol( "ALIST-ENTER" ), makeSymbol( "ANSWER-GUI-QUESTION" ), makeSymbol(
        "AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS" ), makeSymbol( "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER" ), makeSymbol( "CREATE-KB-MODIFICATION-EVENT-FILTER" ), makeSymbol( "CYCLIST-NOTES" ), makeSymbol(
            "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER" ), makeSymbol( "DELETE-KB-MODIFICATION-EVENT-FILTER" ), makeSymbol( "EXPLANATION-OF-WHY-NOT-WFF" ), makeSymbol( "EXPLANATION-OF-WHY-NOT-WFF-ASK" ),
      makeSymbol( "FIND-ASSERTION-CYCL" ), makeSymbol( "FIND-CONSTANT-BY-GUID" ), makeSymbol( "FIND-INFERENCE-ANSWER-BY-IDS" ), makeSymbol( "FIND-VALID-FET-TOPIC" ), makeSymbol( "GED-TO-XML-STRING" ), makeSymbol(
          "GET-FOLLOWUPS-FOR-ENTITY" ), makeSymbol( "GET-PASSAGES-FOR-ENTITY" ), makeSymbol( "HLMT-MONAD-MT" ), makeSymbol( "HLMT-TEMPORAL-MT" ), makeSymbol( "HTML-VAR-VALUE" ), makeSymbol( "IDENTIFY-ALL-GEQ-ENTITIES" ),
      makeSymbol( "MAKE-INDUCED-TOPIC-TYPE-FOR-TERM" ), makeSymbol( "MYSENTIENT-ARE-VERSIONS-SUPPORTED?" ), makeSymbol( "PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA" ), makeSymbol( "PPH-PROOF-DEPTH" ), makeSymbol(
          "PPH-SUMMARIZE-TERM" ), makeSymbol( "PROOF-SUID" ), makeSymbol( "REGISTER-CYCLIFY-PARSER" ), makeSymbol( "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER" ), makeSymbol( "RETURN-DOCUMENT-AS-STRING" ),
      makeSymbol( "SENTENCIFY-REMOTELY" ), makeSymbol( "TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPE" ), makeSymbol( "TOPICS-RELATED-TO-ENTITY" ), makeSymbol( "WFF-QUERY?" )
    } );
    $list149 = ConsesLow.list( makeSymbol( "WITH-PARAPHRASE-MAPPINGS" ), makeSymbol( "WITHIN-ASSERT" ) );
    $list150 = ConsesLow.list( new SubLObject[] { makeSymbol( "*CB-ASSERTION-HISTORY*" ), makeSymbol( "*CB-CONSTANT-HISTORY*" ), makeSymbol( "*CB-NAT-HISTORY*" ), makeSymbol( "*CB-SENTENCE-HISTORY*" ), makeSymbol(
        "*PARAPHRASE-PRECISION*" ), makeSymbol( "*PPH-ADDRESSEE*" ), makeSymbol( "*PPH-DEMERIT-CUTOFF*" ), makeSymbol( "*PPH-DOMAIN-MT*" ), makeSymbol( "*PPH-LANGUAGE-MT*" ), makeSymbol( "*PPH-LINK-ARG0?*" ), makeSymbol(
            "*PPH-MAXIMIZE-LINKS?*" ), makeSymbol( "*PPH-REPLACE-BULLETED-LIST-TAGS?*" ), makeSymbol( "*PPH-SPEAKER*" ), makeSymbol( "*PPH-SUGGESTED-DEMERIT-CUTOFF*" ), makeSymbol( "*PPH-TERSE-MT-SCOPE?*" ), makeSymbol(
                "*PPH-USE-BULLETED-LISTS?*" ), makeSymbol( "*PPH-USE-INDEXICAL-DATES?*" ), makeSymbol( "*PPH-USE-SMART-VARIABLE-REPLACEMENT?*" ), makeSymbol( "*PPH-USE-TITLE-CAPITALIZATION?*" )
    } );
    $sym151$__ = makeSymbol( "<>" );
    $list152 = ConsesLow.list( makeSymbol( "FI-CREATE-SKOLEM" ), makeSymbol( "FI-MERGE" ), makeSymbol( "FI-REASSERT" ), makeSymbol( "FI-JUSTIFY" ), makeSymbol( "FI-DENOTATION" ), makeSymbol( "FI-TIMESTAMP-CONSTANT" ),
        makeSymbol( "FI-TIMESTAMP-ASSERTION" ) );
    $list153 = ConsesLow.list( new SubLObject[] { makeSymbol( "BROADCAST-STREAM-STREAMS" ), makeSymbol( "CLEAR-INPUT" ), makeSymbol( "CLEAR-OUTPUT" ), makeSymbol( "CLOSE" ), makeSymbol( "CONCATENATED-STREAM-STREAMS" ),
      makeSymbol( "CONSTRUCT-FILENAME" ), makeSymbol( "CURRENT-PROCESS" ), makeSymbol( "CYC-IMAGE-ID" ), makeSymbol( "DIRECTORY" ), makeSymbol( "DIRECTORY-P" ), makeSymbol( "ECHO-STREAM-INPUT-STREAM" ), makeSymbol(
          "ECHO-STREAM-OUTPUT-STREAM" ), makeSymbol( "ENDP" ), makeSymbol( "FILE-AUTHOR" ), makeSymbol( "FILE-LENGTH" ), makeSymbol( "FILE-POSITION" ), makeSymbol( "FILE-STRING-LENGTH" ), makeSymbol( "FILE-WRITE-DATE" ),
      makeSymbol( "FINISH-OUTPUT" ), makeSymbol( "GETF" ), makeSymbol( "GET-FILE-POSITION" ), makeSymbol( "GET-MACHINE-NAME" ), makeSymbol( "GET-NETWORK-NAME" ), makeSymbol( "GET-OUTPUT-STREAM-STRING" ), makeSymbol(
          "GET-PROCESS-ID" ), makeSymbol( "GET-STRING-FROM-USER" ), makeSymbol( "GET-USER-NAME" ), makeSymbol( "INPUT-STREAM-P" ), makeSymbol( "INTERACTIVE-STREAM-P" ), makeSymbol( "INTERN" ), makeSymbol(
              "INTERRUPT-PROCESS" ), makeSymbol( "KEYWORDP" ), makeSymbol( "KILL-PROCESS" ), makeSymbol( "LISP-IMPLEMENTATION-TYPE" ), makeSymbol( "LISP-IMPLEMENTATION-VERSION" ), makeSymbol( "LISTEN" ), makeSymbol(
                  "LONG-SITE-NAME" ), makeSymbol( "MACHINE-INSTANCE" ), makeSymbol( "MACHINE-TYPE" ), makeSymbol( "MACHINE-VERSION" ), makeSymbol( "MAKE-BROADCAST-STREAM" ), makeSymbol( "MAKE-CONCATENATED-STREAM" ),
      makeSymbol( "MAKE-DIRECTORY" ), makeSymbol( "MAKE-ECHO-STREAM" ), makeSymbol( "MAKE-KEYWORD" ), makeSymbol( "MAKE-LIST" ), makeSymbol( "MAKE-LOCK" ), makeSymbol( "MAKE-PACKAGE" ), makeSymbol( "MAKE-PROCESS" ),
      makeSymbol( "MAKE-STRING-INPUT-STREAM" ), makeSymbol( "MAKE-STRING-OUTPUT-STREAM" ), makeSymbol( "MAKE-SYNONYM-STREAM" ), makeSymbol( "MAKE-TWO-WAY-STREAM" ), makeSymbol( "OPEN" ), makeSymbol( "OPEN-BINARY" ),
      makeSymbol( "OPEN-STREAM-P" ), makeSymbol( "OPEN-TCP-STREAM" ), makeSymbol( "OPEN-TCP-STREAM-WITH-TIMEOUT" ), makeSymbol( "OPEN-TEXT" ), makeSymbol( "OUTPUT-STREAM-P" ), makeSymbol( "PACKAGE-LOCKED-P" ),
      makeSymbol( "PACKAGE-NAME" ), makeSymbol( "PACKAGE-NICKNAMES" ), makeSymbol( "PACKAGEP" ), makeSymbol( "PACKAGE-USED-BY-LIST" ), makeSymbol( "PACKAGE-USE-LIST" ), makeSymbol( "PEEK-CHAR" ), makeSymbol(
          "PROBE-FILE" ), makeSymbol( "PROCESS-ACTIVE-P" ), makeSymbol( "PROCESS-BLOCK" ), makeSymbol( "PROCESS-NAME" ), makeSymbol( "PROCESSP" ), makeSymbol( "PROCESS-STATE" ), makeSymbol( "PROCESS-UNBLOCK" ),
      makeSymbol( "PROCESS-WAIT" ), makeSymbol( "PROCESS-WAIT-WITH-TIMEOUT" ), makeSymbol( "PROCESS-WHOSTATE" ), makeSymbol( "PUT" ), makeSymbol( "PUTF" ), makeSymbol( "READ" ), makeSymbol( "READ-BYTE" ), makeSymbol(
          "READ-CHAR" ), makeSymbol( "READ-CHAR-NO-HANG" ), makeSymbol( "READ-DELIMITED-LIST" ), makeSymbol( "READ-IGNORING-ERRORS" ), makeSymbol( "READ-LINE" ), makeSymbol( "READ-PRESERVING-WHITESPACE" ), makeSymbol(
              "READ-SEQUENCE" ), makeSymbol( "REMPROP" ), makeSymbol( "RENAME-FILE" ), makeSymbol( "SHORT-SITE-NAME" ), makeSymbol( "SERVER-SUMMARY" ), makeSymbol( "SHOW-PROCESSES" ), makeSymbol( "SIMPLE-READER-ERROR" ),
      makeSymbol( "SOFTWARE-TYPE" ), makeSymbol( "SOFTWARE-VERSION" ), makeSymbol( "STREAMP" ), makeSymbol( "SYNONYM-STREAM-SYMBOL" ), makeSymbol( "TWO-WAY-STREAM-INPUT-STREAM" ), makeSymbol(
          "TWO-WAY-STREAM-OUTPUT-STREAM" ), makeSymbol( "UNREAD-CHAR" ), makeSymbol( "USER-CONFIRM" ), makeSymbol( "VALID-PROCESS-P" ), makeSymbol( "WRITE" ), makeSymbol( "WRITE-BYTE" ), makeSymbol( "WRITE-CHAR" ),
      makeSymbol( "WRITE-LINE" ), makeSymbol( "WRITE-SEQUENCE" ), makeSymbol( "WRITE-STRING" ), makeSymbol( "WRITE-TO-STRING" )
    } );
    $sym154$PHRASE_FOR_MT = makeSymbol( "PHRASE-FOR-MT" );
    $sym155$NOTING_PROGRESS = makeSymbol( "NOTING-PROGRESS" );
    $sym156$NOTE_PROGRESS = makeSymbol( "NOTE-PROGRESS" );
    $sym157$NEW_ALEXANDRIA_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ITERATOR" );
    $sym158$ALEXANDRIA_KB_STORE_ITERATOR_DONE = makeSymbol( "ALEXANDRIA-KB-STORE-ITERATOR-DONE" );
    $sym159$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE = makeSymbol( "ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE" );
    $sym160$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA = makeSymbol( "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA" );
    $sym161$COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED = makeSymbol( "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED" );
    $sym162$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE" );
    $sym163$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR" );
    $sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER = makeSymbol( "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE" );
    $sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO = makeSymbol( "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR" );
    $sym166$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = makeSymbol( "CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR" );
    $sym167$NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR" );
    $sym168$COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA = makeSymbol( "COUNT-ALEXANDRIA-NATS-MATCHING-FORMULA" );
    $sym169$COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT = makeSymbol( "COUNT-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT" );
    $sym170$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE" );
    $sym171$NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR" );
    $sym172$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE" );
    $sym173$NEW_ALEXANDRIA_ALL_FORTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-FORTS-ITERATOR" );
    $sym174$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE" );
    $sym175$NEW_ALEXANDRIA_ALL_GAFS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-GAFS-ITERATOR" );
    $sym176$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE" );
    $sym177$NEW_ALEXANDRIA_ALL_RULES_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-RULES-ITERATOR" );
    $sym178$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE" );
    $sym179$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR" );
    $sym180$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE" );
    $sym181$NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR" );
    $sym182$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE" );
    $sym183$NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR" );
    $sym184$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE" );
    $sym185$NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR" );
    $sym186$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE" );
    $sym187$NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR" );
    $sym188$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE" );
    $sym189$NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR" );
    $sym190$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE" );
    $sym191$NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR" );
    $sym192$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE" );
    $sym193$NEW_ALEXANDRIA_ALL_NARTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-NARTS-ITERATOR" );
    $sym194$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE" );
    $sym195$NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR" );
    $sym196$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE" );
    $sym197$NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-FLOATS-ITERATOR" );
    $sym198$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE" );
    $sym199$NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-FORMULAS-ITERATOR" );
    $sym200$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE" );
    $sym201$NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR" );
    $sym202$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE" );
    $sym203$NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR" );
    $sym204$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE" );
    $sym205$NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-ITEMS-ITERATOR" );
    $sym206$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE" );
    $sym207$NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR" );
    $sym208$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE" );
    $sym209$NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-NUMBERS-ITERATOR" );
    $sym210$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE" );
    $sym211$NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR" );
    $sym212$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE" );
    $sym213$NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR" );
    $sym214$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE" );
    $sym215$NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR" );
    $sym216$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE" );
    $sym217$NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR" );
    $sym218$COUNT_ALEXANDRIA_TERM_ASSERTIONS = makeSymbol( "COUNT-ALEXANDRIA-TERM-ASSERTIONS" );
    $sym219$CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR-STATE" );
    $sym220$NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR" );
    $sym221$COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED = makeSymbol( "COUNT-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED" );
    $sym222$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE" );
    $sym223$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR" );
    $sym224$COUNT_ALEXANDRIA_GAF_ARG0 = makeSymbol( "COUNT-ALEXANDRIA-GAF-ARG0" );
    $sym225$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE" );
    $sym226$NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR-RELEVANT-MT" );
    $sym227$COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT = makeSymbol( "COUNT-ALEXANDRIA-GAF-ARG0-RELEVANT-MT" );
    $sym228$CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAF-ARGITERATOR-STATE" );
    $sym229$NEW_ALEXANDRIA_GAF_ARG_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-ITERATOR" );
    $sym230$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE" );
    $sym231$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR" );
    $sym232$COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED = makeSymbol( "COUNT-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED" );
    $sym233$COUNT_ALEXANDRIA_GAF_ARG = makeSymbol( "COUNT-ALEXANDRIA-GAF-ARG" );
    $sym234$NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR" );
    $sym235$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE" );
    $sym236$COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED = makeSymbol( "COUNT-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED" );
    $sym237$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED = makeSymbol( "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-PRED" );
    $sym238$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED = makeSymbol( "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR-RELEVANT-PRED" );
    $sym239$COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED = makeSymbol( "COUNT-ALEXANDRIA-MT-CONTENTS-RELEVANT-PRED" );
    $sym240$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE" );
    $sym241$NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR" );
    $sym242$COUNT_ALEXANDRIA_MT_CONTENTS = makeSymbol( "COUNT-ALEXANDRIA-MT-CONTENTS" );
    $sym243$CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-RULES-WITH-PRED-ITERATOR-STATE" );
    $sym244$NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-RULES-WITH-PRED-ITERATOR" );
    $sym245$COUNT_ALEXANDRIA_RULES_WITH_PRED = makeSymbol( "COUNT-ALEXANDRIA-RULES-WITH-PRED" );
    $sym246$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE" );
    $sym247$NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR" );
    $sym248$COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT = makeSymbol( "COUNT-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT" );
    $sym249$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE" );
    $sym250$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR" );
    $sym251$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2 = makeSymbol( "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2" );
    $sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S = makeSymbol( "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE" );
    $sym253$NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR" );
    $sym254$COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT = makeSymbol( "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT" );
    $sym255$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE" );
    $sym256$NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR" );
    $sym257$COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT = makeSymbol( "COUNT-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT" );
    $sym258$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE" );
    $sym259$NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR" );
    $sym260$COUNT_ALEXANDRIA_NART_ARG_INDEX = makeSymbol( "COUNT-ALEXANDRIA-NART-ARG-INDEX" );
    $sym261$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE = makeSymbol( "CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE" );
    $sym262$NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-NART-ARG-INDEX-ITERATOR" );
    $sym263$BEST_STRING_OF_NL_PHRASE_DEFN = makeSymbol( "BEST-STRING-OF-NL-PHRASE-DEFN" );
    $sym264$CYC_1_BYTE_INTEGER = makeSymbol( "CYC-1-BYTE-INTEGER" );
    $sym265$CYC_2_BYTE_INTEGER = makeSymbol( "CYC-2-BYTE-INTEGER" );
    $sym266$CYC_4_BYTE_INTEGER = makeSymbol( "CYC-4-BYTE-INTEGER" );
    $sym267$CYC_8_BYTE_INTEGER = makeSymbol( "CYC-8-BYTE-INTEGER" );
    $sym268$CYC_ABSOLUTE_VALUE = makeSymbol( "CYC-ABSOLUTE-VALUE" );
    $sym269$CYC_ADD_ENGLISH_SUFFIX = makeSymbol( "CYC-ADD-ENGLISH-SUFFIX" );
    $sym270$CYC_ARC_COSECANT = makeSymbol( "CYC-ARC-COSECANT" );
    $sym271$CYC_ARC_COSINE = makeSymbol( "CYC-ARC-COSINE" );
    $sym272$CYC_ARC_COTANGENT = makeSymbol( "CYC-ARC-COTANGENT" );
    $sym273$CYC_ARC_SECANT = makeSymbol( "CYC-ARC-SECANT" );
    $sym274$CYC_ARC_SINE = makeSymbol( "CYC-ARC-SINE" );
    $sym275$CYC_ARC_TANGENT = makeSymbol( "CYC-ARC-TANGENT" );
    $sym276$CYC_ASCII_STRING_P = makeSymbol( "CYC-ASCII-STRING-P" );
    $sym277$CYC_AVERAGE = makeSymbol( "CYC-AVERAGE" );
    $sym278$CYC_BIT_DATATYPE = makeSymbol( "CYC-BIT-DATATYPE" );
    $sym279$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = makeSymbol( "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR" );
    $sym280$CYC_COSECANT = makeSymbol( "CYC-COSECANT" );
    $sym281$CYC_COSINE = makeSymbol( "CYC-COSINE" );
    $sym282$CYC_COTANGENT = makeSymbol( "CYC-COTANGENT" );
    $sym283$CYC_DATE_AFTER = makeSymbol( "CYC-DATE-AFTER" );
    $sym284$CYC_DATE_BEFORE = makeSymbol( "CYC-DATE-BEFORE" );
    $sym285$CYC_DATE_DECODE_STRING = makeSymbol( "CYC-DATE-DECODE-STRING" );
    $sym286$CYC_DATE_ENCODE_STRING = makeSymbol( "CYC-DATE-ENCODE-STRING" );
    $sym287$CYC_DATE_FROM_INTEGER = makeSymbol( "CYC-DATE-FROM-INTEGER" );
    $sym288$CYC_DATE_FROM_STRING = makeSymbol( "CYC-DATE-FROM-STRING" );
    $sym289$CYC_DATE_SUBSUMES = makeSymbol( "CYC-DATE-SUBSUMES" );
    $sym290$CYC_DAY_OF_DATE = makeSymbol( "CYC-DAY-OF-DATE" );
    $sym291$CYC_DAY_OF_WEEK_AFTER_DATE = makeSymbol( "CYC-DAY-OF-WEEK-AFTER-DATE" );
    $sym292$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE = makeSymbol( "CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE" );
    $sym293$CYC_DAY_OF_WEEK_DEFN = makeSymbol( "CYC-DAY-OF-WEEK-DEFN" );
    $sym294$CYC_DAY_OF_WEEK_OF_DATE = makeSymbol( "CYC-DAY-OF-WEEK-OF-DATE" );
    $sym295$CYC_DAY_OF_WEEK_PRIOR_TO_DATE = makeSymbol( "CYC-DAY-OF-WEEK-PRIOR-TO-DATE" );
    $sym296$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE = makeSymbol( "CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE" );
    $sym297$CYC_DIFFERENCE = makeSymbol( "CYC-DIFFERENCE" );
    $sym298$CYC_DIFFERENT = makeSymbol( "CYC-DIFFERENT" );
    $sym299$CYC_DIFFERENT_SYMBOLS = makeSymbol( "CYC-DIFFERENT-SYMBOLS" );
    $sym300$CYC_EVALUATE_SUBL = makeSymbol( "CYC-EVALUATE-SUBL" );
    $sym301$CYC_EVEN_NUMBER = makeSymbol( "CYC-EVEN-NUMBER" );
    $sym302$CYC_EXP = makeSymbol( "CYC-EXP" );
    $sym303$CYC_EXPONENT = makeSymbol( "CYC-EXPONENT" );
    $sym304$CYC_EXTENDED_NUMBER_P = makeSymbol( "CYC-EXTENDED-NUMBER-P" );
    $sym305$CYC_GREATER_THAN = makeSymbol( "CYC-GREATER-THAN" );
    $sym306$CYC_GREATER_THAN_OR_EQUAL_TO = makeSymbol( "CYC-GREATER-THAN-OR-EQUAL-TO" );
    $sym307$CYC_GROUND_TERM = makeSymbol( "CYC-GROUND-TERM" );
    $sym308$CYC_GUID_STRING_P = makeSymbol( "CYC-GUID-STRING-P" );
    $sym309$CYC_HTTP_URL_ENCODE = makeSymbol( "CYC-HTTP-URL-ENCODE" );
    $sym310$CYC_IDENTITY = makeSymbol( "CYC-IDENTITY" );
    $sym311$CYC_INDEXICAL_REFERENT = makeSymbol( "CYC-INDEXICAL-REFERENT" );
    $sym312$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = makeSymbol( "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR" );
    $sym313$CYC_INDIVIDUAL_NECESSARY = makeSymbol( "CYC-INDIVIDUAL-NECESSARY" );
    $sym314$CYC_INTEGER = makeSymbol( "CYC-INTEGER" );
    $sym315$CYC_INTEGER_RANGE = makeSymbol( "CYC-INTEGER-RANGE" );
    $sym316$CYC_INTEGER_TO_STRING = makeSymbol( "CYC-INTEGER-TO-STRING" );
    $sym317$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol( "CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE" );
    $sym318$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol( "CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE" );
    $sym319$CYC_INVERSE = makeSymbol( "CYC-INVERSE" );
    $sym320$CYC_IP4_ADDRESS = makeSymbol( "CYC-IP4-ADDRESS" );
    $sym321$CYC_IP4_NETWORK_ADDRESS = makeSymbol( "CYC-IP4-NETWORK-ADDRESS" );
    $sym322$CYC_LATER_THAN = makeSymbol( "CYC-LATER-THAN" );
    $sym323$CYC_LESS_THAN = makeSymbol( "CYC-LESS-THAN" );
    $sym324$CYC_LESS_THAN_OR_EQUAL_TO = makeSymbol( "CYC-LESS-THAN-OR-EQUAL-TO" );
    $sym325$CYC_LIST_CONCATENATE = makeSymbol( "CYC-LIST-CONCATENATE" );
    $sym326$CYC_LIST_FIRST = makeSymbol( "CYC-LIST-FIRST" );
    $sym327$CYC_LIST_LAST = makeSymbol( "CYC-LIST-LAST" );
    $sym328$CYC_LIST_LENGTH = makeSymbol( "CYC-LIST-LENGTH" );
    $sym329$CYC_LIST_MEMBER_SET = makeSymbol( "CYC-LIST-MEMBER-SET" );
    $sym330$CYC_LIST_NTH = makeSymbol( "CYC-LIST-NTH" );
    $sym331$CYC_LIST_OF_TYPE_NECESSARY = makeSymbol( "CYC-LIST-OF-TYPE-NECESSARY" );
    $sym332$CYC_LIST_OF_TYPE_SUFFICIENT = makeSymbol( "CYC-LIST-OF-TYPE-SUFFICIENT" );
    $sym333$CYC_LIST_REST = makeSymbol( "CYC-LIST-REST" );
    $sym334$CYC_LIST_REVERSE = makeSymbol( "CYC-LIST-REVERSE" );
    $sym335$CYC_LIST_SEARCH = makeSymbol( "CYC-LIST-SEARCH" );
    $sym336$CYC_LIST_SUBSEQ = makeSymbol( "CYC-LIST-SUBSEQ" );
    $sym337$CYC_LIST_WITHOUT_REPETITION = makeSymbol( "CYC-LIST-WITHOUT-REPETITION" );
    $sym338$CYC_LOG = makeSymbol( "CYC-LOG" );
    $sym339$CYC_LOGARITHM = makeSymbol( "CYC-LOGARITHM" );
    $sym340$CYC_MAKE_FORMULA = makeSymbol( "CYC-MAKE-FORMULA" );
    $sym341$CYC_MAP_FUNCTION_OVER_LIST = makeSymbol( "CYC-MAP-FUNCTION-OVER-LIST" );
    $sym342$CYC_MAX_RANGE = makeSymbol( "CYC-MAX-RANGE" );
    $sym343$CYC_MAXIMUM = makeSymbol( "CYC-MAXIMUM" );
    $sym344$CYC_MIN_RANGE = makeSymbol( "CYC-MIN-RANGE" );
    $sym345$CYC_MINIMUM = makeSymbol( "CYC-MINIMUM" );
    $sym346$CYC_MINUS = makeSymbol( "CYC-MINUS" );
    $sym347$CYC_NEGATIVE_INTEGER = makeSymbol( "CYC-NEGATIVE-INTEGER" );
    $sym348$CYC_NEGATIVE_NUMBER = makeSymbol( "CYC-NEGATIVE-NUMBER" );
    $sym349$CYC_NEXT_ITERATED_CYCLIC_INTERVAL = makeSymbol( "CYC-NEXT-ITERATED-CYCLIC-INTERVAL" );
    $sym350$CYC_NON_NEGATIVE_INTEGER = makeSymbol( "CYC-NON-NEGATIVE-INTEGER" );
    $sym351$CYC_NON_NEGATIVE_NUMBER = makeSymbol( "CYC-NON-NEGATIVE-NUMBER" );
    $sym352$CYC_NON_POSITIVE_INTEGER = makeSymbol( "CYC-NON-POSITIVE-INTEGER" );
    $sym353$CYC_NON_POSITIVE_NUMBER = makeSymbol( "CYC-NON-POSITIVE-NUMBER" );
    $sym354$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol( "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE" );
    $sym355$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol( "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE" );
    $sym356$CYC_NUMBER_STRING = makeSymbol( "CYC-NUMBER-STRING" );
    $sym357$CYC_NUMERAL_STRING = makeSymbol( "CYC-NUMERAL-STRING" );
    $sym358$CYC_NUMERIC_STRING_NECESSARY = makeSymbol( "CYC-NUMERIC-STRING-NECESSARY" );
    $sym359$CYC_NUMERICALLY_EQUAL = makeSymbol( "CYC-NUMERICALLY-EQUAL" );
    $sym360$CYC_ODD_NUMBER = makeSymbol( "CYC-ODD-NUMBER" );
    $sym361$CYC_PERCENT = makeSymbol( "CYC-PERCENT" );
    $sym362$CYC_PLUS = makeSymbol( "CYC-PLUS" );
    $sym363$CYC_PLUS_ALL = makeSymbol( "CYC-PLUS-ALL" );
    $sym364$CYC_POSITION = makeSymbol( "CYC-POSITION" );
    $sym365$CYC_POSITIVE_INTEGER = makeSymbol( "CYC-POSITIVE-INTEGER" );
    $sym366$CYC_POSITIVE_NUMBER = makeSymbol( "CYC-POSITIVE-NUMBER" );
    $sym367$CYC_POST_REMOVE = makeSymbol( "CYC-POST-REMOVE" );
    $sym368$CYC_PRE_REMOVE = makeSymbol( "CYC-PRE-REMOVE" );
    $sym369$CYC_PREFIX_SUBSTRING = makeSymbol( "CYC-PREFIX-SUBSTRING" );
    $sym370$CYC_PRIME_NUMBER_ = makeSymbol( "CYC-PRIME-NUMBER?" );
    $sym371$CYC_QUANTITY_CONVERSION = makeSymbol( "CYC-QUANTITY-CONVERSION" );
    $sym372$CYC_QUANTITY_INTERSECTS = makeSymbol( "CYC-QUANTITY-INTERSECTS" );
    $sym373$CYC_QUANTITY_SUBSUMES = makeSymbol( "CYC-QUANTITY-SUBSUMES" );
    $sym374$CYC_QUOTIENT = makeSymbol( "CYC-QUOTIENT" );
    $sym375$CYC_RATIONAL_NUMBER = makeSymbol( "CYC-RATIONAL-NUMBER" );
    $sym376$CYC_REAL_0_1 = makeSymbol( "CYC-REAL-0-1" );
    $sym377$CYC_REAL_1_INFINITY = makeSymbol( "CYC-REAL-1-INFINITY" );
    $sym378$CYC_REAL_NUMBER = makeSymbol( "CYC-REAL-NUMBER" );
    $sym379$CYC_RECAPITALIZE_SMART = makeSymbol( "CYC-RECAPITALIZE-SMART" );
    $sym380$CYC_RELATION_ARG = makeSymbol( "CYC-RELATION-ARG" );
    $sym381$CYC_RELATION_ARG_SET = makeSymbol( "CYC-RELATION-ARG-SET" );
    $sym382$CYC_RELATION_ARGS_LIST = makeSymbol( "CYC-RELATION-ARGS-LIST" );
    $sym383$CYC_RELATION_EXPRESSION_ARITY = makeSymbol( "CYC-RELATION-EXPRESSION-ARITY" );
    $sym384$CYC_REPLACE_SUBSTRING = makeSymbol( "CYC-REPLACE-SUBSTRING" );
    $sym385$CYC_ROUND_CLOSEST = makeSymbol( "CYC-ROUND-CLOSEST" );
    $sym386$CYC_ROUND_DOWN = makeSymbol( "CYC-ROUND-DOWN" );
    $sym387$CYC_ROUND_UP = makeSymbol( "CYC-ROUND-UP" );
    $sym388$CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol( "CYC-SCIENTIFIC-NUMBER-FROM-STRING" );
    $sym389$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol( "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL" );
    $sym390$CYC_SCIENTIFIC_NUMBER_P = makeSymbol( "CYC-SCIENTIFIC-NUMBER-P" );
    $sym391$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol( "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT" );
    $sym392$CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol( "CYC-SCIENTIFIC-NUMBER-TO-STRING" );
    $sym393$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol( "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL" );
    $sym394$CYC_SECANT = makeSymbol( "CYC-SECANT" );
    $sym395$CYC_SET_DIFFERENCE = makeSymbol( "CYC-SET-DIFFERENCE" );
    $sym396$CYC_SET_EXTENT = makeSymbol( "CYC-SET-EXTENT" );
    $sym397$CYC_SET_OF_TYPE_NECESSARY = makeSymbol( "CYC-SET-OF-TYPE-NECESSARY" );
    $sym398$CYC_SET_OF_TYPE_SUFFICIENT = makeSymbol( "CYC-SET-OF-TYPE-SUFFICIENT" );
    $sym399$CYC_SIGNIFICANT_DIGITS = makeSymbol( "CYC-SIGNIFICANT-DIGITS" );
    $sym400$CYC_SINE = makeSymbol( "CYC-SINE" );
    $sym401$CYC_SKSI_SOURCE_ACCESSIBLE = makeSymbol( "CYC-SKSI-SOURCE-ACCESSIBLE" );
    $sym402$CYC_SKSI_SOURCE_ACTIVATED = makeSymbol( "CYC-SKSI-SOURCE-ACTIVATED" );
    $sym403$CYC_SKSI_SOURCE_QUERYABLE = makeSymbol( "CYC-SKSI-SOURCE-QUERYABLE" );
    $sym404$CYC_SKSI_SOURCE_REGISTERED = makeSymbol( "CYC-SKSI-SOURCE-REGISTERED" );
    $sym405$CYC_SQRT = makeSymbol( "CYC-SQRT" );
    $sym406$CYC_STRING_CONCAT = makeSymbol( "CYC-STRING-CONCAT" );
    $sym407$CYC_STRING_TO_INTEGER = makeSymbol( "CYC-STRING-TO-INTEGER" );
    $sym408$CYC_STRING_TO_REAL_NUMBER = makeSymbol( "CYC-STRING-TO-REAL-NUMBER" );
    $sym409$CYC_STRING_TOKENIZE_NEW = makeSymbol( "CYC-STRING-TOKENIZE-NEW" );
    $sym410$CYC_STRING_UPCASE = makeSymbol( "CYC-STRING-UPCASE" );
    $sym411$CYC_STRINGS_TO_PHRASE = makeSymbol( "CYC-STRINGS-TO-PHRASE" );
    $sym412$CYC_SUBL_ESCAPE = makeSymbol( "CYC-SUBL-ESCAPE" );
    $sym413$CYC_SUBL_EXPRESSION = makeSymbol( "CYC-SUBL-EXPRESSION" );
    $sym414$CYC_SUBL_TEMPLATE = makeSymbol( "CYC-SUBL-TEMPLATE" );
    $sym415$CYC_SUBLIST_ = makeSymbol( "CYC-SUBLIST?" );
    $sym416$CYC_SUBSTITUTE_FORMULA = makeSymbol( "CYC-SUBSTITUTE-FORMULA" );
    $sym417$CYC_SUBSTITUTE_FORMULA_ARG = makeSymbol( "CYC-SUBSTITUTE-FORMULA-ARG" );
    $sym418$CYC_SUBSTITUTE_FORMULA_ARG_POSITION = makeSymbol( "CYC-SUBSTITUTE-FORMULA-ARG-POSITION" );
    $sym419$CYC_SUBSTRING = makeSymbol( "CYC-SUBSTRING" );
    $sym420$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = makeSymbol( "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE" );
    $sym421$CYC_SUBSTRING_PREDICATE = makeSymbol( "CYC-SUBSTRING-PREDICATE" );
    $sym422$CYC_SUBWORD_PREDICATE = makeSymbol( "CYC-SUBWORD-PREDICATE" );
    $sym423$CYC_SUFFIX_SUBSTRING = makeSymbol( "CYC-SUFFIX-SUBSTRING" );
    $sym424$CYC_SYSTEM_ATOM = makeSymbol( "CYC-SYSTEM-ATOM" );
    $sym425$CYC_SYSTEM_CHARACTER_P = makeSymbol( "CYC-SYSTEM-CHARACTER-P" );
    $sym426$CYC_SYSTEM_INTEGER = makeSymbol( "CYC-SYSTEM-INTEGER" );
    $sym427$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = makeSymbol( "CYC-SYSTEM-NON-VARIABLE-SYMBOL-P" );
    $sym428$CYC_SYSTEM_REAL_NUMBER_P = makeSymbol( "CYC-SYSTEM-REAL-NUMBER-P" );
    $sym429$CYC_SYSTEM_STRING_P = makeSymbol( "CYC-SYSTEM-STRING-P" );
    $sym430$CYC_SYSTEM_TERM_P = makeSymbol( "CYC-SYSTEM-TERM-P" );
    $sym431$CYC_TANGENT = makeSymbol( "CYC-TANGENT" );
    $sym432$CYC_TIME_ELAPSED = makeSymbol( "CYC-TIME-ELAPSED" );
    $sym433$CYC_TIME_ELAPSED_DECODE_STRING = makeSymbol( "CYC-TIME-ELAPSED-DECODE-STRING" );
    $sym434$CYC_TIME_ELAPSED_ENCODE_STRING = makeSymbol( "CYC-TIME-ELAPSED-ENCODE-STRING" );
    $sym435$CYC_TIMES = makeSymbol( "CYC-TIMES" );
    $sym436$CYC_TRIM_WHITESPACE = makeSymbol( "CYC-TRIM-WHITESPACE" );
    $sym437$CYC_TRUE_SUBL = makeSymbol( "CYC-TRUE-SUBL" );
    $sym438$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = makeSymbol( "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL" );
    $sym439$CYC_UNICODE_DENOTING_ASCII_STRING_P = makeSymbol( "CYC-UNICODE-DENOTING-ASCII-STRING-P" );
    $sym440$CYC_ZIP_CODE_FIVE_DIGIT = makeSymbol( "CYC-ZIP-CODE-FIVE-DIGIT" );
    $sym441$CYC_ZIP_CODE_NINE_DIGIT = makeSymbol( "CYC-ZIP-CODE-NINE-DIGIT" );
    $sym442$CYCL_ASSERTED_ASSERTION_ = makeSymbol( "CYCL-ASSERTED-ASSERTION?" );
    $sym443$CYCL_ASSERTION_ = makeSymbol( "CYCL-ASSERTION?" );
    $sym444$CYCL_ATOMIC_ASSERTION_ = makeSymbol( "CYCL-ATOMIC-ASSERTION?" );
    $sym445$CYCL_ATOMIC_SENTENCE_ = makeSymbol( "CYCL-ATOMIC-SENTENCE?" );
    $sym446$CYCL_ATOMIC_TERM_P = makeSymbol( "CYCL-ATOMIC-TERM-P" );
    $sym447$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol( "CYCL-CLOSED-ATOMIC-SENTENCE?" );
    $sym448$CYCL_CLOSED_ATOMIC_TERM_P = makeSymbol( "CYCL-CLOSED-ATOMIC-TERM-P" );
    $sym449$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol( "CYCL-CLOSED-DENOTATIONAL-TERM?" );
    $sym450$CYCL_CLOSED_EXPRESSION_ = makeSymbol( "CYCL-CLOSED-EXPRESSION?" );
    $sym451$CYCL_CLOSED_FORMULA_ = makeSymbol( "CYCL-CLOSED-FORMULA?" );
    $sym452$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol( "CYCL-CLOSED-NON-ATOMIC-TERM?" );
    $sym453$CYCL_CLOSED_SENTENCE_ = makeSymbol( "CYCL-CLOSED-SENTENCE?" );
    $sym454$CYCL_CONSTANT_P = makeSymbol( "CYCL-CONSTANT-P" );
    $sym455$CYCL_DEDUCED_ASSERTION_ = makeSymbol( "CYCL-DEDUCED-ASSERTION?" );
    $sym456$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym457$CYCL_EXPRESSION_ASKABLE_ = makeSymbol( "CYCL-EXPRESSION-ASKABLE?" );
    $sym458$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol( "CYCL-EXPRESSION-ASSERTIBLE?" );
    $sym459$CYCL_EXPRESSION_ = makeSymbol( "CYCL-EXPRESSION?" );
    $sym460$CYCL_FORMULA_ = makeSymbol( "CYCL-FORMULA?" );
    $sym461$CYCL_GAF_ASSERTION_ = makeSymbol( "CYCL-GAF-ASSERTION?" );
    $sym462$CYCL_INDEXED_TERM_ = makeSymbol( "CYCL-INDEXED-TERM?" );
    $sym463$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol( "CYCL-NL-SEMANTIC-ASSERTION?" );
    $sym464$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol( "CYCL-NON-ATOMIC-REIFIED-TERM?" );
    $sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol( "CYCL-NON-ATOMIC-TERM-ASKABLE?" );
    $sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol( "CYCL-NON-ATOMIC-TERM-ASSERTIBLE?" );
    $sym467$CYCL_NON_ATOMIC_TERM_ = makeSymbol( "CYCL-NON-ATOMIC-TERM?" );
    $sym468$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol( "CYCL-OPEN-DENOTATIONAL-TERM?" );
    $sym469$CYCL_OPEN_EXPRESSION_ = makeSymbol( "CYCL-OPEN-EXPRESSION?" );
    $sym470$CYCL_OPEN_FORMULA_ = makeSymbol( "CYCL-OPEN-FORMULA?" );
    $sym471$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol( "CYCL-OPEN-NON-ATOMIC-TERM?" );
    $sym472$CYCL_OPEN_SENTENCE_ = makeSymbol( "CYCL-OPEN-SENTENCE?" );
    $sym473$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol( "CYCL-PROPOSITIONAL-SENTENCE?" );
    $sym474$CYCL_REFORMULATOR_RULE_ = makeSymbol( "CYCL-REFORMULATOR-RULE?" );
    $sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol( "CYCL-REIFIABLE-DENOTATIONAL-TERM?" );
    $sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol( "CYCL-REIFIABLE-NON-ATOMIC-TERM?" );
    $sym477$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol( "CYCL-REIFIED-DENOTATIONAL-TERM?" );
    $sym478$CYCL_REPRESENTED_ATOMIC_TERM_P = makeSymbol( "CYCL-REPRESENTED-ATOMIC-TERM-P" );
    $sym479$CYCL_REPRESENTED_TERM_ = makeSymbol( "CYCL-REPRESENTED-TERM?" );
    $sym480$CYCL_RULE_ASSERTION_ = makeSymbol( "CYCL-RULE-ASSERTION?" );
    $sym481$CYCL_SENTENCE_ASKABLE_ = makeSymbol( "CYCL-SENTENCE-ASKABLE?" );
    $sym482$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol( "CYCL-SENTENCE-ASSERTIBLE?" );
    $sym483$CYCL_SENTENCE_ = makeSymbol( "CYCL-SENTENCE?" );
    $sym484$CYCL_SUBL_SYMBOL_P = makeSymbol( "CYCL-SUBL-SYMBOL-P" );
    $sym485$CYCL_UNBOUND_RELATION_FORMULA_P = makeSymbol( "CYCL-UNBOUND-RELATION-FORMULA-P" );
    $sym486$CYCL_VAR_LIST_ = makeSymbol( "CYCL-VAR-LIST?" );
    $sym487$CYCL_VARIABLE_P = makeSymbol( "CYCL-VARIABLE-P" );
    $sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_ = makeSymbol( "CYCSECURE-SUB-SOFTWARE-OBJECTS?" );
    $sym489$CYCSECURE_VERSION_OF_SOFTWARE_ = makeSymbol( "CYCSECURE-VERSION-OF-SOFTWARE?" );
    $sym490$GAF_ = makeSymbol( "GAF?" );
    $sym491$GEN_TEMPLATE_RECIPE_P = makeSymbol( "GEN-TEMPLATE-RECIPE-P" );
    $sym492$GENERATE_NAMES_FOR_TERM = makeSymbol( "GENERATE-NAMES-FOR-TERM" );
    $sym493$GENERATE_PHRASE_DEFN = makeSymbol( "GENERATE-PHRASE-DEFN" );
    $sym494$HL_EXTERNAL_ID_STRING_P = makeSymbol( "HL-EXTERNAL-ID-STRING-P" );
    $sym495$IBQE_ = makeSymbol( "IBQE?" );
    $sym496$INTEGERP = makeSymbol( "INTEGERP" );
    $sym497$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym498$KWTE_ = makeSymbol( "KWTE?" );
    $sym499$LISTP = makeSymbol( "LISTP" );
    $sym500$MONAD_CYCL_MT_ = makeSymbol( "MONAD-CYCL-MT?" );
    $sym501$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol( "NON-NEGATIVE-SCALAR-INTERVAL?" );
    $sym502$POSITIVE_SCALAR_INTERVAL_ = makeSymbol( "POSITIVE-SCALAR-INTERVAL?" );
    $sym503$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING = makeSymbol( "PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING" );
    $sym504$RTP_SYNTACTIC_CONSTRAINT = makeSymbol( "RTP-SYNTACTIC-CONSTRAINT" );
    $sym505$SCALAR_POINT_VALUE_ = makeSymbol( "SCALAR-POINT-VALUE?" );
    $sym506$STRING_W_O_CONTROL_CHARS_ = makeSymbol( "STRING-W/O-CONTROL-CHARS?" );
    $sym507$STRINGP = makeSymbol( "STRINGP" );
    $sym508$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol( "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P" );
    $sym509$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym510$TEMPORAL_DIMENSION_MT_P = makeSymbol( "TEMPORAL-DIMENSION-MT-P" );
    $sym511$TRUE = makeSymbol( "TRUE" );
    $sym512$URL_P = makeSymbol( "URL-P" );
    $list513 = ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "NTH-VALUE" ), makeSymbol( "INFERENCE-ALL-ANSWERS" ), makeSymbol( "INFERENCE-ANSWER-JUSTIFICATIONS" ), makeSymbol(
        "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS" ), makeSymbol( "HL-JUSTIFY" ), makeSymbol( "HL-JUSTIFY-EXPANDED" ) );
  }
}
/*
 * 
 * Total time: 445 ms
 * 
 */