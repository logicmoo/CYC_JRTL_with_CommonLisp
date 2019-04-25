package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_problem_store
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store";
  public static final String myFingerPrint = "5a3db69b3ccf0847eb1e19bd524c515f115480df17d98c3bf5d902684a997bc3";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 933L)
  public static SubLSymbol $problem_store_modification_permittedP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1403L)
  public static SubLSymbol $problem_store_multiple_subqueries_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1940L)
  private static SubLSymbol $problem_store_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLSymbol $dtp_problem_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22535L)
  private static SubLSymbol $default_problem_store_problem_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22621L)
  private static SubLSymbol $default_problem_store_link_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22688L)
  private static SubLSymbol $default_problem_store_inference_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22759L)
  private static SubLSymbol $default_problem_store_strategy_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22869L)
  private static SubLSymbol $default_problem_store_proof_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22936L)
  private static SubLSymbol $problem_store_sbhl_resource_space_number$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54172L)
  private static SubLSymbol $max_proof_count_multiplier$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55529L)
  private static SubLSymbol $disable_problem_store_allows_problem_hl_free_vars_optimizationP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56471L)
  private static SubLSymbol $force_problem_identity_depends_on_free_hl_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLSymbol $dtp_problem_store_janitor$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105244L)
  private static SubLSymbol $problem_store_id_to_name_table$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105761L)
  private static SubLSymbol $problem_store_name_to_id_table$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111016L)
  private static SubLSymbol $problem_store_hash_watermark$;
  private static final SubLSymbol $sym0$_PROBLEM_STORE_ID_INDEX_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$ID;
  private static final SubLSymbol $sym6$DO_ID_INDEX;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$IGNORE;
  private static final SubLSymbol $sym9$PROBLEM_STORE_ID_INDEX;
  private static final SubLSymbol $sym10$DO_ALL_PROBLEM_STORES;
  private static final SubLString $str11$Destroying_all_;
  private static final SubLString $str12$_problem_stores;
  private static final SubLString $str13$cdolist;
  private static final SubLSymbol $kw14$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym15$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym16$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym17$_;
  private static final SubLSymbol $sym18$PROBLEM_STORE_CREATION_TIME;
  private static final SubLString $str19$Destroying_;
  private static final SubLString $str20$_problem_stores__all_but_the_last;
  private static final SubLString $str21$_;
  private static final SubLSymbol $sym22$PROBLEM_STORE;
  private static final SubLSymbol $sym23$PROBLEM_STORE_P;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$PRINT_PROBLEM_STORE;
  private static final SubLInteger $int29$21;
  private static final SubLInteger $int30$22;
  private static final SubLInteger $int31$23;
  private static final SubLInteger $int32$24;
  private static final SubLInteger $int33$25;
  private static final SubLInteger $int34$26;
  private static final SubLInteger $int35$27;
  private static final SubLInteger $int36$28;
  private static final SubLInteger $int37$29;
  private static final SubLInteger $int38$30;
  private static final SubLInteger $int39$31;
  private static final SubLInteger $int40$32;
  private static final SubLInteger $int41$33;
  private static final SubLInteger $int42$34;
  private static final SubLInteger $int43$35;
  private static final SubLInteger $int44$36;
  private static final SubLInteger $int45$37;
  private static final SubLInteger $int46$38;
  private static final SubLInteger $int47$39;
  private static final SubLInteger $int48$40;
  private static final SubLInteger $int49$41;
  private static final SubLInteger $int50$42;
  private static final SubLInteger $int51$43;
  private static final SubLInteger $int52$44;
  private static final SubLInteger $int53$45;
  private static final SubLInteger $int54$46;
  private static final SubLInteger $int55$47;
  private static final SubLInteger $int56$48;
  private static final SubLInteger $int57$49;
  private static final SubLSymbol $sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$PROB_STORE_GUID;
  private static final SubLSymbol $sym61$_CSETF_PROB_STORE_GUID;
  private static final SubLSymbol $sym62$PROB_STORE_SUID;
  private static final SubLSymbol $sym63$_CSETF_PROB_STORE_SUID;
  private static final SubLSymbol $sym64$PROB_STORE_LOCK;
  private static final SubLSymbol $sym65$_CSETF_PROB_STORE_LOCK;
  private static final SubLSymbol $sym66$PROB_STORE_CREATION_TIME;
  private static final SubLSymbol $sym67$_CSETF_PROB_STORE_CREATION_TIME;
  private static final SubLSymbol $sym68$PROB_STORE_INFERENCE_ID_INDEX;
  private static final SubLSymbol $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX;
  private static final SubLSymbol $sym70$PROB_STORE_STRATEGY_ID_INDEX;
  private static final SubLSymbol $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX;
  private static final SubLSymbol $sym72$PROB_STORE_PROBLEM_ID_INDEX;
  private static final SubLSymbol $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX;
  private static final SubLSymbol $sym74$PROB_STORE_LINK_ID_INDEX;
  private static final SubLSymbol $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX;
  private static final SubLSymbol $sym76$PROB_STORE_PROOF_ID_INDEX;
  private static final SubLSymbol $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX;
  private static final SubLSymbol $sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX;
  private static final SubLSymbol $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX;
  private static final SubLSymbol $sym80$PROB_STORE_REJECTED_PROOFS;
  private static final SubLSymbol $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS;
  private static final SubLSymbol $sym82$PROB_STORE_PROCESSED_PROOFS;
  private static final SubLSymbol $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS;
  private static final SubLSymbol $sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS;
  private static final SubLSymbol $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS;
  private static final SubLSymbol $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
  private static final SubLSymbol $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
  private static final SubLSymbol $sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX;
  private static final SubLSymbol $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX;
  private static final SubLSymbol $sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED;
  private static final SubLSymbol $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED;
  private static final SubLSymbol $sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX;
  private static final SubLSymbol $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX;
  private static final SubLSymbol $sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX;
  private static final SubLSymbol $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX;
  private static final SubLSymbol $sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
  private static final SubLSymbol $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
  private static final SubLSymbol $sym98$PROB_STORE_MIN_DEPTH_INDEX;
  private static final SubLSymbol $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX;
  private static final SubLSymbol $sym100$PROB_STORE_EQUALITY_REASONING_METHOD;
  private static final SubLSymbol $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD;
  private static final SubLSymbol $sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN;
  private static final SubLSymbol $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN;
  private static final SubLSymbol $sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $sym106$PROB_STORE_MAX_PROBLEM_COUNT;
  private static final SubLSymbol $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT;
  private static final SubLSymbol $sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT;
  private static final SubLSymbol $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT;
  private static final SubLSymbol $sym110$PROB_STORE_REMOVAL_ALLOWED_;
  private static final SubLSymbol $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_;
  private static final SubLSymbol $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $sym116$PROB_STORE_NEGATION_BY_FAILURE_;
  private static final SubLSymbol $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_;
  private static final SubLSymbol $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $sym120$PROB_STORE_DIRECTION;
  private static final SubLSymbol $sym121$_CSETF_PROB_STORE_DIRECTION;
  private static final SubLSymbol $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $sym124$PROB_STORE_REWRITE_ALLOWED_;
  private static final SubLSymbol $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_;
  private static final SubLSymbol $sym126$PROB_STORE_ABDUCTION_ALLOWED_;
  private static final SubLSymbol $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_;
  private static final SubLSymbol $sym128$PROB_STORE_NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $sym132$PROB_STORE_MEMOIZATION_STATE;
  private static final SubLSymbol $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE;
  private static final SubLSymbol $sym134$PROB_STORE_SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $sym136$PROB_STORE_PREPARED_;
  private static final SubLSymbol $sym137$_CSETF_PROB_STORE_PREPARED_;
  private static final SubLSymbol $sym138$PROB_STORE_DESTRUCTION_IMMINENT_;
  private static final SubLSymbol $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_;
  private static final SubLSymbol $sym140$PROB_STORE_META_PROBLEM_STORE;
  private static final SubLSymbol $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE;
  private static final SubLSymbol $sym142$PROB_STORE_STATIC_PROPERTIES;
  private static final SubLSymbol $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES;
  private static final SubLSymbol $sym144$PROB_STORE_JANITOR;
  private static final SubLSymbol $sym145$_CSETF_PROB_STORE_JANITOR;
  private static final SubLSymbol $sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS;
  private static final SubLSymbol $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS;
  private static final SubLSymbol $sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT;
  private static final SubLSymbol $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT;
  private static final SubLSymbol $sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX;
  private static final SubLSymbol $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX;
  private static final SubLSymbol $sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES;
  private static final SubLSymbol $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES;
  private static final SubLSymbol $sym154$PROB_STORE_PROOF_KEEPING_INDEX;
  private static final SubLSymbol $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX;
  private static final SubLSymbol $kw156$GUID;
  private static final SubLSymbol $kw157$SUID;
  private static final SubLSymbol $kw158$LOCK;
  private static final SubLSymbol $kw159$CREATION_TIME;
  private static final SubLSymbol $kw160$INFERENCE_ID_INDEX;
  private static final SubLSymbol $kw161$STRATEGY_ID_INDEX;
  private static final SubLSymbol $kw162$PROBLEM_ID_INDEX;
  private static final SubLSymbol $kw163$LINK_ID_INDEX;
  private static final SubLSymbol $kw164$PROOF_ID_INDEX;
  private static final SubLSymbol $kw165$PROBLEMS_BY_QUERY_INDEX;
  private static final SubLSymbol $kw166$REJECTED_PROOFS;
  private static final SubLSymbol $kw167$PROCESSED_PROOFS;
  private static final SubLSymbol $kw168$POTENTIALLY_PROCESSED_PROBLEMS;
  private static final SubLSymbol $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
  private static final SubLSymbol $kw170$NON_EXPLANATORY_SUBPROOFS_INDEX;
  private static final SubLSymbol $kw171$MOST_RECENT_TACTIC_EXECUTED;
  private static final SubLSymbol $kw172$MIN_PROOF_DEPTH_INDEX;
  private static final SubLSymbol $kw173$MIN_TRANSFORMATION_DEPTH_INDEX;
  private static final SubLSymbol $kw174$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
  private static final SubLSymbol $kw175$MIN_DEPTH_INDEX;
  private static final SubLSymbol $kw176$EQUALITY_REASONING_METHOD;
  private static final SubLSymbol $kw177$EQUALITY_REASONING_DOMAIN;
  private static final SubLSymbol $kw178$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw179$MAX_PROBLEM_COUNT;
  private static final SubLSymbol $kw180$CRAZY_MAX_PROBLEM_COUNT;
  private static final SubLSymbol $kw181$REMOVAL_ALLOWED_;
  private static final SubLSymbol $kw182$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw184$NEGATION_BY_FAILURE_;
  private static final SubLSymbol $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $kw186$DIRECTION;
  private static final SubLSymbol $kw187$EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $kw188$REWRITE_ALLOWED_;
  private static final SubLSymbol $kw189$ABDUCTION_ALLOWED_;
  private static final SubLSymbol $kw190$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw192$MEMOIZATION_STATE;
  private static final SubLSymbol $kw193$SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $kw194$PREPARED_;
  private static final SubLSymbol $kw195$DESTRUCTION_IMMINENT_;
  private static final SubLSymbol $kw196$META_PROBLEM_STORE;
  private static final SubLSymbol $kw197$STATIC_PROPERTIES;
  private static final SubLSymbol $kw198$JANITOR;
  private static final SubLSymbol $kw199$HISTORICAL_ROOT_PROBLEMS;
  private static final SubLSymbol $kw200$HISTORICAL_TACTIC_COUNT;
  private static final SubLSymbol $kw201$COMPLEX_PROBLEM_QUERY_CZER_INDEX;
  private static final SubLSymbol $kw202$COMPLEX_PROBLEM_QUERY_SIGNATURES;
  private static final SubLSymbol $kw203$PROOF_KEEPING_INDEX;
  private static final SubLString $str204$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw205$BEGIN;
  private static final SubLSymbol $sym206$MAKE_PROBLEM_STORE;
  private static final SubLSymbol $kw207$SLOT;
  private static final SubLSymbol $kw208$END;
  private static final SubLSymbol $sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD;
  private static final SubLSymbol $kw210$FREE;
  private static final SubLString $str211$_Invalid_PROBLEM_STORE__s_;
  private static final SubLString $str212$_PROBLEM_STORE__a_size__a_;
  private static final SubLSymbol $sym213$SXHASH_PROBLEM_STORE_METHOD;
  private static final SubLList $list214;
  private static final SubLSymbol $sym215$WITH_LOCK_HELD;
  private static final SubLSymbol $sym216$PROBLEM_STORE_LOCK;
  private static final SubLSymbol $sym217$WITH_PROBLEM_STORE_LOCK_HELD;
  private static final SubLList $list218;
  private static final SubLSymbol $sym219$WITH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym220$PROBLEM_STORE_MEMOIZATION_STATE;
  private static final SubLSymbol $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE;
  private static final SubLSymbol $sym222$SPACE_VAR;
  private static final SubLSymbol $sym223$CLET;
  private static final SubLSymbol $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $sym225$WITH_SBHL_MARKING_SPACE_RESOURCE;
  private static final SubLSymbol $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE;
  private static final SubLSymbol $sym228$STORE_VAR;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$ID;
  private static final SubLSymbol $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX;
  private static final SubLSymbol $sym232$DO_PROBLEM_STORE_INFERENCES;
  private static final SubLList $list233;
  private static final SubLSymbol $sym234$ID;
  private static final SubLSymbol $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX;
  private static final SubLSymbol $sym236$DO_PROBLEM_STORE_STRATEGIES;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$PUNLESS;
  private static final SubLList $list239;
  private static final SubLList $list240;
  private static final SubLList $list241;
  private static final SubLSymbol $kw242$ORDERED;
  private static final SubLSymbol $sym243$ID;
  private static final SubLSymbol $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX;
  private static final SubLSymbol $sym245$DO_PROBLEM_STORE_PROBLEMS;
  private static final SubLList $list246;
  private static final SubLList $list247;
  private static final SubLSymbol $kw248$TYPE;
  private static final SubLSymbol $sym249$ID;
  private static final SubLSymbol $sym250$PROBLEM_STORE_LINK_ID_INDEX;
  private static final SubLSymbol $sym251$DO_PROBLEM_STORE_LINKS;
  private static final SubLSymbol $sym252$PWHEN;
  private static final SubLSymbol $sym253$PROBLEM_LINK_HAS_TYPE_;
  private static final SubLList $list254;
  private static final SubLList $list255;
  private static final SubLSymbol $kw256$PROOF_STATUS;
  private static final SubLSymbol $sym257$ID;
  private static final SubLSymbol $sym258$PROBLEM_STORE_PROOF_ID_INDEX;
  private static final SubLSymbol $sym259$DO_PROBLEM_STORE_PROOFS;
  private static final SubLSymbol $sym260$PROOF_HAS_STATUS_;
  private static final SubLList $list261;
  private static final SubLSymbol $sym262$DO_SET;
  private static final SubLSymbol $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS;
  private static final SubLSymbol $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS;
  private static final SubLList $list265;
  private static final SubLSymbol $sym266$INFERENCE_VAR;
  private static final SubLSymbol $sym267$INFERENCE_STRATEGY_SET;
  private static final SubLInteger $int268$80;
  private static final SubLInteger $int269$120;
  private static final SubLSymbol $sym270$PROBLEM_STORE_PROPERTIES_P;
  private static final SubLSymbol $sym271$PROBLEM_STORE_NAME_P;
  private static final SubLString $str272$A_problem_store_named__s_already_;
  private static final SubLString $str273$Problem_Store_Lock;
  private static final SubLSymbol $sym274$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P;
  private static final SubLSymbol $sym275$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P;
  private static final SubLSymbol $kw276$NONE;
  private static final SubLSymbol $kw277$EMPTY_DOMAIN;
  private static final SubLSymbol $sym278$INTERMEDIATE_STEP_VALIDATION_LEVEL_P;
  private static final SubLSymbol $sym279$MAX_PROBLEM_COUNT_P;
  private static final SubLSymbol $sym280$BOOLEANP;
  private static final SubLSymbol $sym281$INFERENCE_DIRECTION_P;
  private static final SubLString $str282$problem_store_memoization_state;
  private static final SubLString $str283$problem_store_memoization_lock;
  private static final SubLString $str284$Destroying_problem_store__S_at_le;
  private static final SubLSymbol $kw285$SKIP;
  private static final SubLSymbol $sym286$TACTIC_P;
  private static final SubLSymbol $sym287$NEW_PROBLEM_STORE_P;
  private static final SubLSymbol $kw288$FORWARD;
  private static final SubLSymbol $kw289$MOTIVATING_TACTIC;
  private static final SubLSymbol $kw290$TACTICAL;
  private static final SubLSymbol $kw291$CONTENT;
  private static final SubLSymbol $kw292$ANSWER;
  private static final SubLSymbol $kw293$REMOVAL;
  private static final SubLSymbol $kw294$REMOVAL_CONJUNCTIVE;
  private static final SubLSymbol $kw295$TRANSFORMATION;
  private static final SubLSymbol $kw296$REWRITE;
  private static final SubLSymbol $kw297$STRUCTURAL;
  private static final SubLSymbol $kw298$JOIN_ORDERED;
  private static final SubLSymbol $kw299$JOIN;
  private static final SubLSymbol $kw300$SPLIT;
  private static final SubLSymbol $kw301$RESTRICTION;
  private static final SubLSymbol $kw302$RESIDUAL_TRANSFORMATION;
  private static final SubLSymbol $kw303$UNION;
  private static final SubLInteger $int304$212;
  private static final SubLSymbol $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT;
  private static final SubLSymbol $kw306$POSSIBLE;
  private static final SubLSymbol $kw307$EXECUTED;
  private static final SubLSymbol $kw308$DISCARDED;
  private static final SubLSymbol $sym309$_;
  private static final SubLSymbol $sym310$PROOF_SUID;
  private static final SubLSymbol $sym311$PROBLEM_SUID;
  private static final SubLSymbol $sym312$PROBLEM_STORE_SIZE;
  private static final SubLSymbol $sym313$PROBLEM_LINK_SUID;
  private static final SubLSymbol $kw314$UNDETERMINED;
  private static final SubLSymbol $kw315$UNKNOWN;
  private static final SubLSymbol $kw316$NON_PROOF_KEEPING;
  private static final SubLList $list317;
  private static final SubLString $str318$Invalid_proof_keeping_reason__a_f;
  private static final SubLSymbol $sym319$PROOF_REJECTED_;
  private static final SubLSymbol $sym320$PROOF_P;
  private static final SubLSymbol $sym321$PROBLEM_P;
  private static final SubLSymbol $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED;
  private static final SubLSymbol $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED;
  private static final SubLInteger $int324$100;
  private static final SubLSymbol $sym325$PROBLEM_STORE_JANITOR;
  private static final SubLSymbol $sym326$PROBLEM_STORE_JANITOR_P;
  private static final SubLList $list327;
  private static final SubLList $list328;
  private static final SubLList $list329;
  private static final SubLList $list330;
  private static final SubLSymbol $sym331$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list333;
  private static final SubLSymbol $sym334$PROB_STORE_JANITOR_STORE;
  private static final SubLSymbol $sym335$_CSETF_PROB_STORE_JANITOR_STORE;
  private static final SubLSymbol $sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
  private static final SubLSymbol $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
  private static final SubLSymbol $sym338$PROB_STORE_JANITOR_STALE_;
  private static final SubLSymbol $sym339$_CSETF_PROB_STORE_JANITOR_STALE_;
  private static final SubLSymbol $kw340$STORE;
  private static final SubLSymbol $kw341$INDESTRUCTIBLE_PROBLEMS;
  private static final SubLSymbol $kw342$STALE_;
  private static final SubLSymbol $sym343$MAKE_PROBLEM_STORE_JANITOR;
  private static final SubLSymbol $sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD;
  private static final SubLSymbol $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
  private static final SubLSymbol $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
  private static final SubLList $list347;
  private static final SubLSymbol $sym348$PROBLEM_STORE_JANITOR_STORE;
  private static final SubLSymbol $sym349$PROBLEM_DESTRUCTIBLE_;
  private static final SubLSymbol $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_;
  private static final SubLSymbol $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_;
  private static final SubLSymbol $sym352$FIND_PROBLEM_STORE_BY_NAME;
  private static final SubLSymbol $sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME;
  private static final SubLSymbol $kw354$PROBLEM_STORE_NAME;
  private static final SubLSymbol $sym355$DESTROY_PROBLEM_STORE_BY_NAME;
  private static final SubLSymbol $sym356$PROBLEM_STORE_PROPERTY_P;
  private static final SubLString $str357$Problem_store_property__S_reflect;
  private static final SubLInteger $int358$50;
  private static final SubLSymbol $sym359$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT;
  private static final SubLSymbol $kw361$TEST;
  private static final SubLSymbol $kw362$OWNER;
  private static final SubLSymbol $kw363$CLASSES;
  private static final SubLSymbol $kw364$KB;
  private static final SubLSymbol $kw365$TINY;
  private static final SubLSymbol $kw366$WORKING_;
  private static final SubLList $list367;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2134L)
  public static SubLObject new_problem_store_id()
  {
    return id_index.id_index_reserve( $problem_store_id_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2228L)
  public static SubLObject index_problem_store_by_id(final SubLObject store, final SubLObject suid)
  {
    return id_index.id_index_enter( $problem_store_id_index$.getGlobalValue(), suid, store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2346L)
  public static SubLObject unindex_problem_store_by_id(final SubLObject store)
  {
    final SubLObject suid = problem_store_suid( store );
    return id_index.id_index_remove( $problem_store_id_index$.getGlobalValue(), suid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2503L)
  public static SubLObject find_problem_store_by_id(final SubLObject suid)
  {
    return id_index.id_index_lookup( $problem_store_id_index$.getGlobalValue(), suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2611L)
  public static SubLObject problem_store_count()
  {
    return id_index.id_index_count( $problem_store_id_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2704L)
  public static SubLObject problem_store_next_id()
  {
    return id_index.id_index_next_id( $problem_store_id_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2799L)
  public static SubLObject most_recent_problem_store()
  {
    final SubLObject start = problem_store_next_id();
    SubLObject end_var;
    SubLObject i;
    SubLObject store;
    for( end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE( end_var ); i = Numbers.add( i, MINUS_ONE_INTEGER ) )
    {
      store = find_problem_store_by_id( i );
      if( NIL != store )
      {
        return store;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3037L)
  public static SubLObject do_all_problem_stores(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_store_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    problem_store_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym5$ID;
    return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, problem_store_var, $list7, $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3265L)
  public static SubLObject problem_store_id_index()
  {
    return $problem_store_id_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3380L)
  public static SubLObject all_problem_stores()
  {
    return id_index.id_index_values( $problem_store_id_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3514L)
  public static SubLObject destroy_all_problem_stores()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL != all_problem_stores() )
    {
      final SubLObject list_var = all_problem_stores();
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str11$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( all_problem_stores() ) ),
          $str12$_problem_stores
        } ) ) ? Sequences.cconcatenate( $str11$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( all_problem_stores() ) ), $str12$_problem_stores
        } ) : $str13$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject store = NIL;
          store = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw14$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym15$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  destroy_problem_store( store );
                  count = Numbers.add( count, ONE_INTEGER );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw14$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            store = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3959L)
  public static SubLObject destroy_most_problem_stores(SubLObject number_remaining)
  {
    if( number_remaining == UNPROVIDED )
    {
      number_remaining = FIVE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( number_remaining ) : number_remaining;
    SubLObject remaining_count = ZERO_INTEGER;
    SubLObject destroyed_count = ZERO_INTEGER;
    SubLObject stores = Sort.sort( conses_high.copy_list( all_problem_stores() ), $sym17$_, $sym18$PROBLEM_STORE_CREATION_TIME );
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( number_remaining ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      if( NIL != list_utilities.non_empty_list_p( stores ) )
      {
        stores = stores.rest();
        remaining_count = Numbers.add( remaining_count, ONE_INTEGER );
      }
    }
    if( NIL != stores )
    {
      final SubLObject list_var = stores;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str19$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( stores ) ),
          $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy( number_remaining ), $str21$_
        } ) ) ? Sequences.cconcatenate( $str19$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( stores ) ), $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy(
            number_remaining ), $str21$_
        } ) : $str13$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject store = NIL;
          store = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw14$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym15$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  destroy_problem_store( store );
                  destroyed_count = Numbers.add( destroyed_count, ONE_INTEGER );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$4, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw14$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            store = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( destroyed_count, remaining_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject problem_store_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_problem_store( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject problem_store_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $problem_store_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_guid(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_suid(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_lock(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_creation_time(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_inference_id_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_strategy_id_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_problem_id_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_link_id_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_proof_id_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_problems_by_query_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_rejected_proofs(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_processed_proofs(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_potentially_processed_problems(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_non_explanatory_subproofs_possibleP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_non_explanatory_subproofs_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_most_recent_tactic_executed(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_min_proof_depth_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_min_transformation_depth_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField19();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_min_transformation_depth_signature_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.getField20();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_min_depth_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$min_depth_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_equality_reasoning_method(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$equality_reasoning_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_equality_reasoning_domain(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$equality_reasoning_domain;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_intermediate_step_validation_level(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$intermediate_step_validation_level;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_max_problem_count(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$max_problem_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_crazy_max_problem_count(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$crazy_max_problem_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_removal_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$removal_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_transformation_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$transformation_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_add_restriction_layer_of_indirectionP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$add_restriction_layer_of_indirectionP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_negation_by_failureP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$negation_by_failureP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_completeness_minimization_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$completeness_minimization_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_direction(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$direction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_evaluate_subl_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$evaluate_subl_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_rewrite_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$rewrite_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_abduction_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$abduction_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_new_terms_allowedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$new_terms_allowedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_compute_answer_justificationsP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$compute_answer_justificationsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_memoization_state(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$memoization_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_sbhl_resource_space(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$sbhl_resource_space;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_preparedP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$preparedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_destruction_imminentP(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$destruction_imminentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_meta_problem_store(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$meta_problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_static_properties(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$static_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_janitor(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_historical_root_problems(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$historical_root_problems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_historical_tactic_count(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$historical_tactic_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_complex_problem_query_czer_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$complex_problem_query_czer_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_complex_problem_query_signatures(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$complex_problem_query_signatures;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject prob_store_proof_keeping_index(final SubLObject v_object)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$proof_keeping_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_guid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_suid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_creation_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_inference_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_strategy_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_problem_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_link_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_proof_id_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_problems_by_query_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_rejected_proofs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_processed_proofs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_potentially_processed_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_non_explanatory_subproofs_possibleP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_non_explanatory_subproofs_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_most_recent_tactic_executed(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_min_proof_depth_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_min_transformation_depth_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField19( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_min_transformation_depth_signature_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return v_object.setField20( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_min_depth_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$min_depth_index = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_equality_reasoning_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$equality_reasoning_method = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_equality_reasoning_domain(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$equality_reasoning_domain = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_intermediate_step_validation_level(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$intermediate_step_validation_level = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_max_problem_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$max_problem_count = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_crazy_max_problem_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$crazy_max_problem_count = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_removal_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$removal_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_transformation_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$transformation_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_add_restriction_layer_of_indirectionP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$add_restriction_layer_of_indirectionP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_negation_by_failureP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$negation_by_failureP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_completeness_minimization_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$completeness_minimization_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$direction = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_evaluate_subl_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$evaluate_subl_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_rewrite_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$rewrite_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_abduction_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$abduction_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_new_terms_allowedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$new_terms_allowedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_compute_answer_justificationsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$compute_answer_justificationsP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_memoization_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$memoization_state = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_sbhl_resource_space(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$sbhl_resource_space = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_preparedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$preparedP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_destruction_imminentP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$destruction_imminentP = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_meta_problem_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$meta_problem_store = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_static_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$static_properties = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_janitor(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$janitor = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_historical_root_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$historical_root_problems = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_historical_tactic_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$historical_tactic_count = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_complex_problem_query_czer_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$complex_problem_query_czer_index = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_complex_problem_query_signatures(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$complex_problem_query_signatures = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject _csetf_prob_store_proof_keeping_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_p( v_object ) : v_object;
    return ( ($problem_store_native) v_object ).$proof_keeping_index = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject make_problem_store(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $problem_store_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw156$GUID ) )
      {
        _csetf_prob_store_guid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw157$SUID ) )
      {
        _csetf_prob_store_suid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw158$LOCK ) )
      {
        _csetf_prob_store_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw159$CREATION_TIME ) )
      {
        _csetf_prob_store_creation_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw160$INFERENCE_ID_INDEX ) )
      {
        _csetf_prob_store_inference_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw161$STRATEGY_ID_INDEX ) )
      {
        _csetf_prob_store_strategy_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw162$PROBLEM_ID_INDEX ) )
      {
        _csetf_prob_store_problem_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw163$LINK_ID_INDEX ) )
      {
        _csetf_prob_store_link_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw164$PROOF_ID_INDEX ) )
      {
        _csetf_prob_store_proof_id_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw165$PROBLEMS_BY_QUERY_INDEX ) )
      {
        _csetf_prob_store_problems_by_query_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw166$REJECTED_PROOFS ) )
      {
        _csetf_prob_store_rejected_proofs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw167$PROCESSED_PROOFS ) )
      {
        _csetf_prob_store_processed_proofs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw168$POTENTIALLY_PROCESSED_PROBLEMS ) )
      {
        _csetf_prob_store_potentially_processed_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ ) )
      {
        _csetf_prob_store_non_explanatory_subproofs_possibleP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw170$NON_EXPLANATORY_SUBPROOFS_INDEX ) )
      {
        _csetf_prob_store_non_explanatory_subproofs_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw171$MOST_RECENT_TACTIC_EXECUTED ) )
      {
        _csetf_prob_store_most_recent_tactic_executed( v_new, current_value );
      }
      else if( pcase_var.eql( $kw172$MIN_PROOF_DEPTH_INDEX ) )
      {
        _csetf_prob_store_min_proof_depth_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw173$MIN_TRANSFORMATION_DEPTH_INDEX ) )
      {
        _csetf_prob_store_min_transformation_depth_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw174$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX ) )
      {
        _csetf_prob_store_min_transformation_depth_signature_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw175$MIN_DEPTH_INDEX ) )
      {
        _csetf_prob_store_min_depth_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw176$EQUALITY_REASONING_METHOD ) )
      {
        _csetf_prob_store_equality_reasoning_method( v_new, current_value );
      }
      else if( pcase_var.eql( $kw177$EQUALITY_REASONING_DOMAIN ) )
      {
        _csetf_prob_store_equality_reasoning_domain( v_new, current_value );
      }
      else if( pcase_var.eql( $kw178$INTERMEDIATE_STEP_VALIDATION_LEVEL ) )
      {
        _csetf_prob_store_intermediate_step_validation_level( v_new, current_value );
      }
      else if( pcase_var.eql( $kw179$MAX_PROBLEM_COUNT ) )
      {
        _csetf_prob_store_max_problem_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw180$CRAZY_MAX_PROBLEM_COUNT ) )
      {
        _csetf_prob_store_crazy_max_problem_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw181$REMOVAL_ALLOWED_ ) )
      {
        _csetf_prob_store_removal_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw182$TRANSFORMATION_ALLOWED_ ) )
      {
        _csetf_prob_store_transformation_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ ) )
      {
        _csetf_prob_store_add_restriction_layer_of_indirectionP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw184$NEGATION_BY_FAILURE_ ) )
      {
        _csetf_prob_store_negation_by_failureP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_ ) )
      {
        _csetf_prob_store_completeness_minimization_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw186$DIRECTION ) )
      {
        _csetf_prob_store_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw187$EVALUATE_SUBL_ALLOWED_ ) )
      {
        _csetf_prob_store_evaluate_subl_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw188$REWRITE_ALLOWED_ ) )
      {
        _csetf_prob_store_rewrite_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw189$ABDUCTION_ALLOWED_ ) )
      {
        _csetf_prob_store_abduction_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw190$NEW_TERMS_ALLOWED_ ) )
      {
        _csetf_prob_store_new_terms_allowedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_ ) )
      {
        _csetf_prob_store_compute_answer_justificationsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw192$MEMOIZATION_STATE ) )
      {
        _csetf_prob_store_memoization_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw193$SBHL_RESOURCE_SPACE ) )
      {
        _csetf_prob_store_sbhl_resource_space( v_new, current_value );
      }
      else if( pcase_var.eql( $kw194$PREPARED_ ) )
      {
        _csetf_prob_store_preparedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw195$DESTRUCTION_IMMINENT_ ) )
      {
        _csetf_prob_store_destruction_imminentP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw196$META_PROBLEM_STORE ) )
      {
        _csetf_prob_store_meta_problem_store( v_new, current_value );
      }
      else if( pcase_var.eql( $kw197$STATIC_PROPERTIES ) )
      {
        _csetf_prob_store_static_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw198$JANITOR ) )
      {
        _csetf_prob_store_janitor( v_new, current_value );
      }
      else if( pcase_var.eql( $kw199$HISTORICAL_ROOT_PROBLEMS ) )
      {
        _csetf_prob_store_historical_root_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw200$HISTORICAL_TACTIC_COUNT ) )
      {
        _csetf_prob_store_historical_tactic_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw201$COMPLEX_PROBLEM_QUERY_CZER_INDEX ) )
      {
        _csetf_prob_store_complex_problem_query_czer_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw202$COMPLEX_PROBLEM_QUERY_SIGNATURES ) )
      {
        _csetf_prob_store_complex_problem_query_signatures( v_new, current_value );
      }
      else if( pcase_var.eql( $kw203$PROOF_KEEPING_INDEX ) )
      {
        _csetf_prob_store_proof_keeping_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str204$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject visit_defstruct_problem_store(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw205$BEGIN, $sym206$MAKE_PROBLEM_STORE, $int56$48 );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw156$GUID, prob_store_guid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw157$SUID, prob_store_suid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw158$LOCK, prob_store_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw159$CREATION_TIME, prob_store_creation_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw160$INFERENCE_ID_INDEX, prob_store_inference_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw161$STRATEGY_ID_INDEX, prob_store_strategy_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw162$PROBLEM_ID_INDEX, prob_store_problem_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw163$LINK_ID_INDEX, prob_store_link_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw164$PROOF_ID_INDEX, prob_store_proof_id_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw165$PROBLEMS_BY_QUERY_INDEX, prob_store_problems_by_query_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw166$REJECTED_PROOFS, prob_store_rejected_proofs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw167$PROCESSED_PROOFS, prob_store_processed_proofs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw168$POTENTIALLY_PROCESSED_PROBLEMS, prob_store_potentially_processed_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, prob_store_non_explanatory_subproofs_possibleP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw170$NON_EXPLANATORY_SUBPROOFS_INDEX, prob_store_non_explanatory_subproofs_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw171$MOST_RECENT_TACTIC_EXECUTED, prob_store_most_recent_tactic_executed( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw172$MIN_PROOF_DEPTH_INDEX, prob_store_min_proof_depth_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw173$MIN_TRANSFORMATION_DEPTH_INDEX, prob_store_min_transformation_depth_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw174$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, prob_store_min_transformation_depth_signature_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw175$MIN_DEPTH_INDEX, prob_store_min_depth_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw176$EQUALITY_REASONING_METHOD, prob_store_equality_reasoning_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw177$EQUALITY_REASONING_DOMAIN, prob_store_equality_reasoning_domain( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw178$INTERMEDIATE_STEP_VALIDATION_LEVEL, prob_store_intermediate_step_validation_level( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw179$MAX_PROBLEM_COUNT, prob_store_max_problem_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw180$CRAZY_MAX_PROBLEM_COUNT, prob_store_crazy_max_problem_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw181$REMOVAL_ALLOWED_, prob_store_removal_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw182$TRANSFORMATION_ALLOWED_, prob_store_transformation_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, prob_store_add_restriction_layer_of_indirectionP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw184$NEGATION_BY_FAILURE_, prob_store_negation_by_failureP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_, prob_store_completeness_minimization_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw186$DIRECTION, prob_store_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw187$EVALUATE_SUBL_ALLOWED_, prob_store_evaluate_subl_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw188$REWRITE_ALLOWED_, prob_store_rewrite_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw189$ABDUCTION_ALLOWED_, prob_store_abduction_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw190$NEW_TERMS_ALLOWED_, prob_store_new_terms_allowedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_, prob_store_compute_answer_justificationsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw192$MEMOIZATION_STATE, prob_store_memoization_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw193$SBHL_RESOURCE_SPACE, prob_store_sbhl_resource_space( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw194$PREPARED_, prob_store_preparedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw195$DESTRUCTION_IMMINENT_, prob_store_destruction_imminentP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw196$META_PROBLEM_STORE, prob_store_meta_problem_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw197$STATIC_PROPERTIES, prob_store_static_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw198$JANITOR, prob_store_janitor( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw199$HISTORICAL_ROOT_PROBLEMS, prob_store_historical_root_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw200$HISTORICAL_TACTIC_COUNT, prob_store_historical_tactic_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw201$COMPLEX_PROBLEM_QUERY_CZER_INDEX, prob_store_complex_problem_query_czer_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw202$COMPLEX_PROBLEM_QUERY_SIGNATURES, prob_store_complex_problem_query_signatures( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw203$PROOF_KEEPING_INDEX, prob_store_proof_keeping_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw208$END, $sym206$MAKE_PROBLEM_STORE, $int56$48 );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6681L)
  public static SubLObject visit_defstruct_object_problem_store_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_problem_store( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16258L)
  public static SubLObject valid_problem_store_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != problem_store_p( v_object ) && NIL == problem_store_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16395L)
  public static SubLObject id_of_valid_problem_store_p(final SubLObject v_object)
  {
    return valid_problem_store_p( find_problem_store_by_id( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16515L)
  public static SubLObject problem_store_invalid_p(final SubLObject store)
  {
    return Equality.eq( $kw210$FREE, prob_store_equality_reasoning_domain( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16669L)
  public static SubLObject print_problem_store(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != problem_store_invalid_p( v_object ) )
    {
      PrintLow.format( stream, $str211$_Invalid_PROBLEM_STORE__s_, prob_store_suid( v_object ) );
    }
    else
    {
      PrintLow.format( stream, $str212$_PROBLEM_STORE__a_size__a_, problem_store_suid( v_object ), problem_store_size( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17008L)
  public static SubLObject sxhash_problem_store_method(final SubLObject v_object)
  {
    return prob_store_suid( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17090L)
  public static SubLObject with_problem_store_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    store = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym215$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym216$PROBLEM_STORE_LOCK, store ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17283L)
  public static SubLObject problem_store_lock(final SubLObject store)
  {
    return prob_store_lock( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17442L)
  public static SubLObject with_problem_store_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list218 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list218 );
    store = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym219$WITH_MEMOIZATION_STATE, ConsesLow.list( ConsesLow.list( $sym220$PROBLEM_STORE_MEMOIZATION_STATE, store ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list218 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17654L)
  public static SubLObject problem_store_memoization_state(final SubLObject store)
  {
    return prob_store_memoization_state( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17848L)
  public static SubLObject with_problem_store_sbhl_resource_space(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list218 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list218 );
    store = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject space_var = $sym222$SPACE_VAR;
      return ConsesLow.list( $sym223$CLET, ConsesLow.list( ConsesLow.list( space_var, ConsesLow.list( $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE, store ) ) ), ConsesLow.listS( $sym225$WITH_SBHL_MARKING_SPACE_RESOURCE,
          space_var, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, store, space_var ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list218 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18209L)
  public static SubLObject problem_store_sbhl_resource_space(final SubLObject store)
  {
    return prob_store_sbhl_resource_space( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18409L)
  public static SubLObject set_problem_store_sbhl_resource_space(final SubLObject store, final SubLObject space)
  {
    _csetf_prob_store_sbhl_resource_space( store, space );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18684L)
  public static SubLObject with_problem_store_resourcing_and_memoization(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    store = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject store_var = $sym228$STORE_VAR;
    return ConsesLow.list( $sym223$CLET, ConsesLow.list( ConsesLow.list( store_var, store ) ), ConsesLow.list( $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE, ConsesLow.list( store_var ), ConsesLow.listS(
        $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE, ConsesLow.list( store_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18970L)
  public static SubLObject do_problem_store_inferences(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    inference_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list229 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list229 );
      if( NIL == conses_high.member( current_$6, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list229 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym230$ID;
    return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, inference_var, ConsesLow.list( $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX, store ), $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19234L)
  public static SubLObject problem_store_inference_id_index(final SubLObject store)
  {
    return prob_store_inference_id_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19421L)
  public static SubLObject do_problem_store_strategies(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list233 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject strategy_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list233 );
    strategy_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list233 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list233 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list233 );
      if( NIL == conses_high.member( current_$7, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list233 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym234$ID;
    return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, strategy_var, ConsesLow.list( $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX, store ), $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19668L)
  public static SubLObject problem_store_strategy_id_index(final SubLObject store)
  {
    return prob_store_strategy_id_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19853L)
  public static SubLObject do_problem_store_strategic_contexts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list237 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject strategic_context_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list237 );
    strategic_context_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list237 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list237 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list237 );
      if( NIL == conses_high.member( current_$8, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list237 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym238$PUNLESS, done, ConsesLow.listS( $sym223$CLET, ConsesLow.list( reader.bq_cons( strategic_context_var, $list239 ) ), ConsesLow.append( body, NIL ) ), ConsesLow.listS(
        $sym236$DO_PROBLEM_STORE_STRATEGIES, ConsesLow.list( strategic_context_var, store, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20138L)
  public static SubLObject do_problem_store_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list240 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list240 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list240 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list240 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list240 );
      if( NIL == conses_high.member( current_$9, $list241, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list240 );
    }
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw242$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym243$ID;
    return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, problem_var, ConsesLow.list( $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX, store ), $kw242$ORDERED, ordered, $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE,
        id ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20406L)
  public static SubLObject problem_store_problem_id_index(final SubLObject store)
  {
    return prob_store_problem_id_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20587L)
  public static SubLObject do_problem_store_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list246 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list246 );
    link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list246 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list246 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list246 );
      if( NIL == conses_high.member( current_$10, $list247, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list246 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw248$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw242$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym249$ID;
    if( NIL == type )
    {
      return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, link_var, ConsesLow.list( $sym250$PROBLEM_STORE_LINK_ID_INDEX, store ), $kw242$ORDERED, ordered, $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE, id ),
          ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym251$DO_PROBLEM_STORE_LINKS, ConsesLow.list( link_var, store, $kw242$ORDERED, ordered, $kw4$DONE, done ), ConsesLow.listS( $sym252$PWHEN, ConsesLow.list( $sym253$PROBLEM_LINK_HAS_TYPE_,
        link_var, type ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21011L)
  public static SubLObject problem_store_link_id_index(final SubLObject store)
  {
    return prob_store_link_id_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21183L)
  public static SubLObject do_problem_store_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject proof_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list254 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list254 );
      if( NIL == conses_high.member( current_$11, $list255, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list254 );
    }
    final SubLObject proof_status_tail = cdestructuring_bind.property_list_member( $kw256$PROOF_STATUS, current );
    final SubLObject proof_status = ( NIL != proof_status_tail ) ? conses_high.cadr( proof_status_tail ) : NIL;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw242$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym257$ID;
    if( NIL == proof_status )
    {
      return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( id, proof_var, ConsesLow.list( $sym258$PROBLEM_STORE_PROOF_ID_INDEX, store ), $kw242$ORDERED, ordered, $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE,
          id ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym259$DO_PROBLEM_STORE_PROOFS, ConsesLow.list( proof_var, store, $kw242$ORDERED, ordered, $kw4$DONE, done ), ConsesLow.listS( $sym252$PWHEN, ConsesLow.list( $sym260$PROOF_HAS_STATUS_,
        proof_var, proof_status ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21633L)
  public static SubLObject problem_store_proof_id_index(final SubLObject store)
  {
    return prob_store_proof_id_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21808L)
  public static SubLObject do_problem_store_historical_root_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list261 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list261 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list261 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list261 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list261 );
      if( NIL == conses_high.member( current_$12, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list261 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym262$DO_SET, ConsesLow.list( problem_var, ConsesLow.list( $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, store ), $kw4$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22018L)
  public static SubLObject problem_store_historical_root_problems(final SubLObject store)
  {
    return prob_store_historical_root_problems( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22193L)
  public static SubLObject do_inference_strategies(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list265 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject strategy_var = NIL;
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list265 );
    strategy_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list265 );
    inference = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list265 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list265 );
      if( NIL == conses_high.member( current_$13, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list265 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject inference_var = $sym266$INFERENCE_VAR;
    return ConsesLow.list( $sym223$CLET, ConsesLow.list( ConsesLow.list( inference_var, inference ) ), ConsesLow.listS( $sym262$DO_SET, ConsesLow.list( strategy_var, ConsesLow.list( $sym267$INFERENCE_STRATEGY_SET,
        inference_var ), $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 23064L)
  public static SubLObject new_problem_store(SubLObject problem_store_properties)
  {
    if( problem_store_properties == UNPROVIDED )
    {
      problem_store_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p( problem_store_properties ) : problem_store_properties;
    final SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.problem_store_name_p( name ) : name;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != find_problem_store_by_name( name ) )
    {
      Errors.error( $str272$A_problem_store_named__s_already_, name );
    }
    final SubLObject store = make_problem_store( UNPROVIDED );
    final SubLObject suid = new_problem_store_id();
    final SubLObject guid = NIL;
    inference_metrics.increment_problem_store_historical_count();
    _csetf_prob_store_guid( store, guid );
    _csetf_prob_store_suid( store, suid );
    index_problem_store_by_id( store, suid );
    _csetf_prob_store_lock( store, Locks.make_lock( $str273$Problem_Store_Lock ) );
    _csetf_prob_store_creation_time( store, Time.get_universal_time() );
    _csetf_prob_store_preparedP( store, NIL );
    _csetf_prob_store_problem_id_index( store, id_index.new_id_index( $default_problem_store_problem_size$.getGlobalValue(), ZERO_INTEGER ) );
    _csetf_prob_store_inference_id_index( store, id_index.new_id_index( $default_problem_store_inference_size$.getGlobalValue(), ZERO_INTEGER ) );
    _csetf_prob_store_strategy_id_index( store, id_index.new_id_index( $default_problem_store_strategy_size$.getGlobalValue(), ZERO_INTEGER ) );
    _csetf_prob_store_link_id_index( store, id_index.new_id_index( $default_problem_store_link_size$.getGlobalValue(), ZERO_INTEGER ) );
    _csetf_prob_store_proof_id_index( store, id_index.new_id_index( $default_problem_store_proof_size$.getGlobalValue(), ZERO_INTEGER ) );
    _csetf_prob_store_rejected_proofs( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_processed_proofs( store, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_potentially_processed_problems( store, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_non_explanatory_subproofs_possibleP( store, NIL );
    _csetf_prob_store_non_explanatory_subproofs_index( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_most_recent_tactic_executed( store, NIL );
    _csetf_prob_store_min_proof_depth_index( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_min_transformation_depth_index( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_min_transformation_depth_signature_index( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_min_depth_index( store, Hashtables.make_hash_table( ONE_INTEGER, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    final SubLObject name2 = inference_datastructures_enumerated_types.problem_store_properties_name( problem_store_properties );
    set_problem_store_name( store, name2 );
    final SubLObject equality_reasoning_method = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_method( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p( equality_reasoning_method ) : equality_reasoning_method;
    _csetf_prob_store_equality_reasoning_method( store, equality_reasoning_method );
    final SubLObject equality_reasoning_domain = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_domain( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p( equality_reasoning_domain ) : equality_reasoning_domain;
    _csetf_prob_store_equality_reasoning_domain( store, equality_reasoning_domain );
    if( $kw276$NONE == equality_reasoning_domain )
    {
      _csetf_prob_store_problems_by_query_index( store, $kw277$EMPTY_DOMAIN );
    }
    else
    {
      _csetf_prob_store_problems_by_query_index( store, Hashtables.make_hash_table( $default_problem_store_problem_size$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    final SubLObject intermediate_step_validation_level = inference_datastructures_enumerated_types.problem_store_properties_intermediate_step_validation_level( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p( intermediate_step_validation_level ) : intermediate_step_validation_level;
    _csetf_prob_store_intermediate_step_validation_level( store, intermediate_step_validation_level );
    final SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.max_problem_count_p( max_problem_count ) : max_problem_count;
    _csetf_prob_store_max_problem_count( store, max_problem_count );
    final SubLObject crazy_max_problem_count = compute_crazy_max_problem_count( max_problem_count );
    assert NIL != inference_datastructures_enumerated_types.max_problem_count_p( crazy_max_problem_count ) : crazy_max_problem_count;
    _csetf_prob_store_crazy_max_problem_count( store, crazy_max_problem_count );
    final SubLObject removal_allowedP = inference_datastructures_enumerated_types.removal_allowed_by_propertiesP( problem_store_properties );
    assert NIL != Types.booleanp( removal_allowedP ) : removal_allowedP;
    _csetf_prob_store_removal_allowedP( store, removal_allowedP );
    final SubLObject transformation_allowedP = inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP( problem_store_properties );
    assert NIL != Types.booleanp( transformation_allowedP ) : transformation_allowedP;
    _csetf_prob_store_transformation_allowedP( store, transformation_allowedP );
    final SubLObject add_restriction_layer_of_indirectionP = inference_datastructures_enumerated_types.problem_store_properties_add_restriction_layer_of_indirectionP( problem_store_properties );
    assert NIL != Types.booleanp( add_restriction_layer_of_indirectionP ) : add_restriction_layer_of_indirectionP;
    _csetf_prob_store_add_restriction_layer_of_indirectionP( store, add_restriction_layer_of_indirectionP );
    final SubLObject negation_by_failureP = inference_datastructures_enumerated_types.problem_store_properties_negation_by_failureP( problem_store_properties );
    assert NIL != Types.booleanp( negation_by_failureP ) : negation_by_failureP;
    _csetf_prob_store_negation_by_failureP( store, negation_by_failureP );
    final SubLObject completeness_minimization_allowedP = inference_datastructures_enumerated_types.problem_store_properties_completeness_minimization_allowedP( problem_store_properties );
    assert NIL != Types.booleanp( completeness_minimization_allowedP ) : completeness_minimization_allowedP;
    _csetf_prob_store_completeness_minimization_allowedP( store, completeness_minimization_allowedP );
    final SubLObject direction = inference_datastructures_enumerated_types.problem_store_properties_direction( problem_store_properties );
    assert NIL != inference_datastructures_enumerated_types.inference_direction_p( direction ) : direction;
    _csetf_prob_store_direction( store, direction );
    final SubLObject evaluate_subl_allowedP = inference_datastructures_enumerated_types.problem_store_properties_evaluate_subl_allowedP( problem_store_properties );
    assert NIL != Types.booleanp( evaluate_subl_allowedP ) : evaluate_subl_allowedP;
    _csetf_prob_store_evaluate_subl_allowedP( store, evaluate_subl_allowedP );
    final SubLObject rewrite_allowedP = inference_datastructures_enumerated_types.problem_store_properties_rewrite_allowedP( problem_store_properties );
    assert NIL != Types.booleanp( rewrite_allowedP ) : rewrite_allowedP;
    _csetf_prob_store_rewrite_allowedP( store, rewrite_allowedP );
    final SubLObject abduction_allowedP = inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP( problem_store_properties );
    assert NIL != Types.booleanp( abduction_allowedP ) : abduction_allowedP;
    _csetf_prob_store_abduction_allowedP( store, abduction_allowedP );
    final SubLObject new_terms_allowedP = inference_datastructures_enumerated_types.problem_store_properties_new_terms_allowedP( problem_store_properties );
    assert NIL != Types.booleanp( new_terms_allowedP ) : new_terms_allowedP;
    _csetf_prob_store_new_terms_allowedP( store, new_terms_allowedP );
    final SubLObject compute_answer_justificationsP = inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP( problem_store_properties );
    assert NIL != Types.booleanp( compute_answer_justificationsP ) : compute_answer_justificationsP;
    _csetf_prob_store_compute_answer_justificationsP( store, compute_answer_justificationsP );
    _csetf_prob_store_memoization_state( store, memoization_state.new_memoization_state( $str282$problem_store_memoization_state, ReadWriteLocks.new_rw_lock( $str283$problem_store_memoization_lock ), UNPROVIDED,
        UNPROVIDED ) );
    set_problem_store_sbhl_resource_space( store, sbhl_marking_vars.new_sbhl_marking_space_resource( $problem_store_sbhl_resource_space_number$.getGlobalValue() ) );
    _csetf_prob_store_destruction_imminentP( store, NIL );
    _csetf_prob_store_meta_problem_store( store, NIL );
    _csetf_prob_store_static_properties( store, conses_high.copy_list( problem_store_properties ) );
    _csetf_prob_store_janitor( store, new_problem_store_janitor( store ) );
    _csetf_prob_store_historical_root_problems( store, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_historical_tactic_count( store, ZERO_INTEGER );
    _csetf_prob_store_complex_problem_query_czer_index( store, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_prob_store_complex_problem_query_signatures( store, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_store_proof_keeping_index( store, Hashtables.make_hash_table( ZERO_INTEGER, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 30921L)
  public static SubLObject destroy_problem_store(final SubLObject store)
  {
    if( NIL != valid_problem_store_p( store ) )
    {
      final SubLObject running_inferences = problem_store_running_inferences( store );
      if( NIL != running_inferences )
      {
        SubLObject cdolist_list_var = running_inferences;
        SubLObject running_inference = NIL;
        running_inference = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Errors.warn( $str284$Destroying_problem_store__S_at_le, store, running_inference );
          cdolist_list_var = cdolist_list_var.rest();
          running_inference = cdolist_list_var.first();
        }
      }
      try
      {
        destroy_problem_store_int( store );
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          unindex_problem_store_by_id( store );
          _csetf_prob_store_lock( store, $kw210$FREE );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values2 = Values.getValuesAsVector();
          unindex_problem_store_by_id( store );
          _csetf_prob_store_lock( store, $kw210$FREE );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 31482L)
  public static SubLObject destroy_problem_store_int(final SubLObject store)
  {
    inference_metrics.update_maximum_problem_store_historical_problem_count( store );
    note_problem_store_invalid( store );
    final SubLObject meta_problem_store = prob_store_meta_problem_store( store );
    if( NIL != problem_store_p( meta_problem_store ) )
    {
      destroy_problem_store( meta_problem_store );
    }
    _csetf_prob_store_meta_problem_store( store, $kw210$FREE );
    destroy_problem_store_janitor( prob_store_janitor( store ) );
    _csetf_prob_store_janitor( store, $kw210$FREE );
    free_problem_store_name( store );
    _csetf_prob_store_equality_reasoning_method( store, $kw210$FREE );
    _csetf_prob_store_intermediate_step_validation_level( store, $kw210$FREE );
    _csetf_prob_store_max_problem_count( store, $kw210$FREE );
    _csetf_prob_store_crazy_max_problem_count( store, $kw210$FREE );
    _csetf_prob_store_removal_allowedP( store, $kw210$FREE );
    _csetf_prob_store_transformation_allowedP( store, $kw210$FREE );
    _csetf_prob_store_add_restriction_layer_of_indirectionP( store, $kw210$FREE );
    _csetf_prob_store_negation_by_failureP( store, $kw210$FREE );
    _csetf_prob_store_completeness_minimization_allowedP( store, $kw210$FREE );
    _csetf_prob_store_direction( store, $kw210$FREE );
    _csetf_prob_store_evaluate_subl_allowedP( store, $kw210$FREE );
    _csetf_prob_store_rewrite_allowedP( store, $kw210$FREE );
    _csetf_prob_store_abduction_allowedP( store, $kw210$FREE );
    _csetf_prob_store_new_terms_allowedP( store, $kw210$FREE );
    _csetf_prob_store_compute_answer_justificationsP( store, $kw210$FREE );
    _csetf_prob_store_preparedP( store, $kw210$FREE );
    _csetf_prob_store_destruction_imminentP( store, $kw210$FREE );
    _csetf_prob_store_static_properties( store, $kw210$FREE );
    clear_problem_store_proof_keeping_problems( store );
    _csetf_prob_store_proof_keeping_index( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_complex_problem_query_signatures( store ) );
    _csetf_prob_store_complex_problem_query_signatures( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_complex_problem_query_czer_index( store ) );
    _csetf_prob_store_complex_problem_query_czer_index( store, $kw210$FREE );
    set.clear_set( prob_store_historical_root_problems( store ) );
    _csetf_prob_store_historical_root_problems( store, $kw210$FREE );
    _csetf_prob_store_sbhl_resource_space( store, $kw210$FREE );
    _csetf_prob_store_memoization_state( store, $kw210$FREE );
    Hashtables.clrhash( prob_store_min_depth_index( store ) );
    _csetf_prob_store_min_depth_index( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_min_transformation_depth_index( store ) );
    _csetf_prob_store_min_transformation_depth_index( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_min_transformation_depth_signature_index( store ) );
    _csetf_prob_store_min_transformation_depth_signature_index( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_min_proof_depth_index( store ) );
    _csetf_prob_store_min_proof_depth_index( store, $kw210$FREE );
    if( prob_store_problems_by_query_index( store ).isHashtable() )
    {
      Hashtables.clrhash( prob_store_problems_by_query_index( store ) );
    }
    _csetf_prob_store_problems_by_query_index( store, $kw210$FREE );
    SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$14 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            inference_datastructures_inference.destroy_problem_store_inference( inference );
          }
        }
      }
      final SubLObject idx_$15 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$15 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            inference_datastructures_inference.destroy_problem_store_inference( inference2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    id_index.clear_id_index( prob_store_inference_id_index( store ) );
    _csetf_prob_store_inference_id_index( store, $kw210$FREE );
    idx = problem_store_strategy_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$16 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$16, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$16 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          strategy = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( strategy ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( strategy ) )
            {
              strategy = $kw285$SKIP;
            }
            inference_datastructures_strategy.destroy_problem_store_strategy( strategy );
          }
        }
      }
      final SubLObject idx_$17 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$17 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$17 );
        SubLObject id2 = NIL;
        SubLObject strategy2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            strategy2 = Hashtables.getEntryValue( cdohash_entry );
            inference_datastructures_strategy.destroy_problem_store_strategy( strategy2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    id_index.clear_id_index( prob_store_strategy_id_index( store ) );
    _csetf_prob_store_strategy_id_index( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_rejected_proofs( store ) );
    _csetf_prob_store_rejected_proofs( store, $kw210$FREE );
    set.clear_set( prob_store_processed_proofs( store ) );
    _csetf_prob_store_processed_proofs( store, $kw210$FREE );
    set.clear_set( prob_store_potentially_processed_problems( store ) );
    _csetf_prob_store_potentially_processed_problems( store, $kw210$FREE );
    _csetf_prob_store_non_explanatory_subproofs_possibleP( store, $kw210$FREE );
    dictionary.clear_dictionary( prob_store_non_explanatory_subproofs_index( store ) );
    _csetf_prob_store_non_explanatory_subproofs_index( store, $kw210$FREE );
    _csetf_prob_store_most_recent_tactic_executed( store, $kw210$FREE );
    idx = problem_store_proof_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$18 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$18, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$18 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject proof;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          proof = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( proof ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( proof ) )
            {
              proof = $kw285$SKIP;
            }
            inference_datastructures_proof.destroy_problem_store_proof( proof );
          }
        }
      }
      final SubLObject idx_$19 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$19 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$19 );
        SubLObject id2 = NIL;
        SubLObject proof2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            proof2 = Hashtables.getEntryValue( cdohash_entry );
            inference_datastructures_proof.destroy_problem_store_proof( proof2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    id_index.clear_id_index( prob_store_proof_id_index( store ) );
    _csetf_prob_store_proof_id_index( store, $kw210$FREE );
    idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$20 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$20, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$20 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link ) )
            {
              link = $kw285$SKIP;
            }
            inference_datastructures_problem_link.destroy_problem_store_link( link );
          }
        }
      }
      final SubLObject idx_$21 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$21 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$21 );
        SubLObject id2 = NIL;
        SubLObject link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            link2 = Hashtables.getEntryValue( cdohash_entry );
            inference_datastructures_problem_link.destroy_problem_store_link( link2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    id_index.clear_id_index( prob_store_link_id_index( store ) );
    _csetf_prob_store_link_id_index( store, $kw210$FREE );
    idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$22 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$22, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$22 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            inference_datastructures_problem.destroy_problem_store_problem( problem );
          }
        }
      }
      final SubLObject idx_$23 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$23 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$23 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            inference_datastructures_problem.destroy_problem_store_problem( problem2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    id_index.clear_id_index( prob_store_problem_id_index( store ) );
    _csetf_prob_store_problem_id_index( store, $kw210$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36919L)
  public static SubLObject note_problem_store_invalid(final SubLObject store)
  {
    _csetf_prob_store_equality_reasoning_domain( store, $kw210$FREE );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37047L)
  public static SubLObject problem_store_guid(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    SubLObject guid = prob_store_guid( store );
    if( NIL == guid )
    {
      guid = Guids.new_guid();
      _csetf_prob_store_guid( store, guid );
    }
    return guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37365L)
  public static SubLObject problem_store_suid(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_suid( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37481L)
  public static SubLObject problem_store_creation_time(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_creation_time( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37615L)
  public static SubLObject problem_store_rejected_proofs(final SubLObject store)
  {
    return prob_store_rejected_proofs( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37716L)
  public static SubLObject problem_store_processed_proofs(final SubLObject store)
  {
    return prob_store_processed_proofs( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37819L)
  public static SubLObject problem_store_potentially_processed_problems(final SubLObject store)
  {
    return prob_store_potentially_processed_problems( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37950L)
  public static SubLObject problem_store_non_explanatory_subproofs_possibleP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_non_explanatory_subproofs_possibleP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38128L)
  public static SubLObject problem_store_non_explanatory_subproofs_index(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_non_explanatory_subproofs_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38298L)
  public static SubLObject problem_store_most_recent_tactic_executed(final SubLObject store)
  {
    return prob_store_most_recent_tactic_executed( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38423L)
  public static SubLObject problem_store_min_proof_depth_index(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_min_proof_depth_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38573L)
  public static SubLObject problem_store_min_transformation_depth_index(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_min_transformation_depth_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38741L)
  public static SubLObject problem_store_min_transformation_depth_signature_index(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_min_transformation_depth_signature_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38929L)
  public static SubLObject problem_store_min_depth_index(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_min_depth_index( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39067L)
  public static SubLObject problem_store_equality_reasoning_method(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_equality_reasoning_method( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39225L)
  public static SubLObject problem_store_equality_reasoning_domain(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_equality_reasoning_domain( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39383L)
  public static SubLObject problem_store_intermediate_step_validation_level(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_intermediate_step_validation_level( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39559L)
  public static SubLObject problem_store_max_problem_count(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_max_problem_count( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39701L)
  public static SubLObject problem_store_crazy_max_problem_count(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_crazy_max_problem_count( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39855L)
  public static SubLObject problem_store_removal_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_removal_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39995L)
  public static SubLObject problem_store_transformation_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_transformation_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40149L)
  public static SubLObject problem_store_add_restriction_layer_of_indirectionP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_add_restriction_layer_of_indirectionP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40331L)
  public static SubLObject problem_store_negation_by_failureP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_negation_by_failureP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40479L)
  public static SubLObject problem_store_completeness_minimization_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_completeness_minimization_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40655L)
  public static SubLObject problem_store_direction(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_direction( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40781L)
  public static SubLObject problem_store_evaluate_subl_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_evaluate_subl_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40933L)
  public static SubLObject problem_store_rewrite_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_rewrite_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41073L)
  public static SubLObject problem_store_abduction_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_abduction_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41214L)
  public static SubLObject problem_store_new_terms_allowedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_new_terms_allowedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41355L)
  public static SubLObject problem_store_compute_answer_justificationsP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    if( NIL != cyc_testing.testing_real_time_pruningP() )
    {
      return problem_store_forwardP( store );
    }
    return prob_store_compute_answer_justificationsP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41650L)
  public static SubLObject problem_store_preparedP(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    return prob_store_preparedP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41776L)
  public static SubLObject problem_store_destruction_imminentP(final SubLObject store)
  {
    return prob_store_destruction_imminentP( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41889L)
  public static SubLObject problem_store_meta_problem_store(final SubLObject store)
  {
    SubLObject meta_problem_store = prob_store_meta_problem_store( store );
    if( NIL == meta_problem_store )
    {
      meta_problem_store = new_problem_store( problem_store_static_properties( store ) );
      _csetf_prob_store_meta_problem_store( store, meta_problem_store );
    }
    return meta_problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42304L)
  public static SubLObject problem_store_static_properties(final SubLObject store)
  {
    return prob_store_static_properties( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42451L)
  public static SubLObject problem_store_janitor(final SubLObject store)
  {
    return prob_store_janitor( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42536L)
  public static SubLObject note_problem_store_most_recent_tactic_executed(final SubLObject store, final SubLObject tactic)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    _csetf_prob_store_most_recent_tactic_executed( store, tactic );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42887L)
  public static SubLObject set_problem_store_intermediate_step_validation_level(final SubLObject store, final SubLObject value)
  {
    assert NIL != new_problem_store_p( store ) : store;
    assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p( value ) : value;
    _csetf_prob_store_intermediate_step_validation_level( store, value );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43476L)
  public static SubLObject set_problem_store_add_restriction_layer_of_indirectionP(final SubLObject store, final SubLObject value)
  {
    assert NIL != new_problem_store_p( store ) : store;
    assert NIL != Types.booleanp( value ) : value;
    _csetf_prob_store_add_restriction_layer_of_indirectionP( store, value );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43724L)
  public static SubLObject set_problem_store_transformation_allowedP(final SubLObject store, final SubLObject value)
  {
    assert NIL != new_problem_store_p( store ) : store;
    assert NIL != Types.booleanp( value ) : value;
    _csetf_prob_store_transformation_allowedP( store, value );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43944L)
  public static SubLObject set_problem_store_removal_allowedP(final SubLObject store, final SubLObject value)
  {
    assert NIL != new_problem_store_p( store ) : store;
    assert NIL != Types.booleanp( value ) : value;
    _csetf_prob_store_removal_allowedP( store, value );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44150L)
  public static SubLObject set_problem_store_new_terms_allowedP(final SubLObject store, final SubLObject value)
  {
    assert NIL != new_problem_store_p( store ) : store;
    assert NIL != Types.booleanp( value ) : value;
    _csetf_prob_store_new_terms_allowedP( store, value );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44360L)
  public static SubLObject note_problem_store_prepared(final SubLObject store)
  {
    assert NIL != new_problem_store_p( store ) : store;
    _csetf_prob_store_preparedP( store, T );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44512L)
  public static SubLObject note_problem_store_destruction_imminent(final SubLObject store)
  {
    assert NIL != new_problem_store_p( store ) : store;
    _csetf_prob_store_destruction_imminentP( store, T );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44755L)
  public static SubLObject reset_problem_store_janitor(final SubLObject store)
  {
    final SubLObject janitor = problem_store_janitor( store );
    destroy_problem_store_janitor( janitor );
    _csetf_prob_store_janitor( store, new_problem_store_janitor( store ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44991L)
  public static SubLObject problem_store_forwardP(final SubLObject store)
  {
    return Equality.eq( $kw288$FORWARD, problem_store_direction( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45162L)
  public static SubLObject problem_store_newP(final SubLObject store)
  {
    return makeBoolean( NIL == problem_store_preparedP( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45374L)
  public static SubLObject new_problem_store_p(final SubLObject store)
  {
    return makeBoolean( NIL != problem_store_p( store ) && NIL != problem_store_newP( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45494L)
  public static SubLObject problem_store_inference_count(final SubLObject store)
  {
    return id_index.id_index_count( prob_store_inference_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45680L)
  public static SubLObject problem_store_non_recursive_inference_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$24 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$24, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$24 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            if( NIL == conses_high.getf( inference_datastructures_inference.inference_properties( inference ), $kw289$MOTIVATING_TACTIC, UNPROVIDED ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$25 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$25 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$25 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL == conses_high.getf( inference_datastructures_inference.inference_properties( inference2 ), $kw289$MOTIVATING_TACTIC, UNPROVIDED ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45930L)
  public static SubLObject problem_store_has_only_one_inferenceP(final SubLObject store)
  {
    return Numbers.numE( ONE_INTEGER, problem_store_inference_count( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46049L)
  public static SubLObject problem_store_historical_inference_count(final SubLObject store)
  {
    return id_index.id_index_next_id( prob_store_inference_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46252L)
  public static SubLObject find_inference_by_id(final SubLObject store, final SubLObject inference_suid)
  {
    final SubLObject v_id_index = prob_store_inference_id_index( store );
    return id_index.id_index_lookup( v_id_index, inference_suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46429L)
  public static SubLObject find_inference_by_ids(final SubLObject store_suid, final SubLObject inference_suid)
  {
    final SubLObject store = find_problem_store_by_id( store_suid );
    if( NIL != store )
    {
      final SubLObject inference = find_inference_by_id( store, inference_suid );
      return inference;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46662L)
  public static SubLObject first_problem_store_inference(final SubLObject store)
  {
    final SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$26 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$26, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$26 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            return inference;
          }
        }
      }
      final SubLObject idx_$27 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$27 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$27 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          if( Hashtables.iteratorHasNext( cdohash_iterator ) )
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            return inference2;
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46863L)
  public static SubLObject earliest_problem_store_inference(final SubLObject store)
  {
    SubLObject earliest_id = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject earliest_inference = NIL;
    final SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$28 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$28, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$28 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject id_$29;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            id_$29 = inference_datastructures_inference.inference_suid( inference );
            if( id_$29.numL( earliest_id ) )
            {
              earliest_inference = inference;
              earliest_id = id_$29;
            }
          }
        }
      }
      final SubLObject idx_$29 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$29 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$29 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject id_$30 = inference_datastructures_inference.inference_suid( inference2 );
            if( id_$30.numL( earliest_id ) )
            {
              earliest_inference = inference2;
              earliest_id = id_$30;
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return earliest_inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47215L)
  public static SubLObject latest_problem_store_inference(final SubLObject store)
  {
    SubLObject latest_id = MINUS_ONE_INTEGER;
    SubLObject latest_inference = NIL;
    final SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$32 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$32, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$32 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject id_$33;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            id_$33 = inference_datastructures_inference.inference_suid( inference );
            if( id_$33.numG( latest_id ) )
            {
              latest_inference = inference;
              latest_id = id_$33;
            }
          }
        }
      }
      final SubLObject idx_$33 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$33 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$33 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject id_$34 = inference_datastructures_inference.inference_suid( inference2 );
            if( id_$34.numG( latest_id ) )
            {
              latest_inference = inference2;
              latest_id = id_$34;
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return latest_inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47533L)
  public static SubLObject problem_store_running_inferences(final SubLObject store)
  {
    SubLObject running_inferences = NIL;
    final SubLObject idx = problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$36 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$36, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$36 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_inference.running_inference_p( inference ) )
            {
              running_inferences = ConsesLow.cons( inference, running_inferences );
            }
          }
        }
      }
      final SubLObject idx_$37 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$37 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$37 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_inference.running_inference_p( inference2 ) )
            {
              running_inferences = ConsesLow.cons( inference2, running_inferences );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return running_inferences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47789L)
  public static SubLObject problem_store_privateP(final SubLObject store)
  {
    final SubLObject inference = first_problem_store_inference( store );
    if( NIL != inference )
    {
      return inference_datastructures_inference.inference_problem_store_privateP( inference );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47980L)
  public static SubLObject problem_store_strategy_count(final SubLObject store)
  {
    return id_index.id_index_count( prob_store_strategy_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48165L)
  public static SubLObject problem_store_historical_strategy_count(final SubLObject store)
  {
    return id_index.id_index_next_id( problem_store_strategy_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48369L)
  public static SubLObject problem_store_strategies(final SubLObject store)
  {
    return id_index.id_index_values( problem_store_strategy_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48488L)
  public static SubLObject find_strategy_by_id(final SubLObject store, final SubLObject strategy_suid)
  {
    final SubLObject v_id_index = prob_store_strategy_id_index( store );
    return id_index.id_index_lookup( v_id_index, strategy_suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48660L)
  public static SubLObject find_strategy_by_ids(final SubLObject store_suid, final SubLObject strategy_suid)
  {
    final SubLObject store = find_problem_store_by_id( store_suid );
    if( NIL != store )
    {
      final SubLObject strategy = find_strategy_by_id( store, strategy_suid );
      return strategy;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48887L)
  public static SubLObject first_problem_store_strategy(final SubLObject store)
  {
    final SubLObject idx = problem_store_strategy_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$38 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$38, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$38 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          strategy = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( strategy ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( strategy ) )
            {
              strategy = $kw285$SKIP;
            }
            return strategy;
          }
        }
      }
      final SubLObject idx_$39 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$39 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$39 );
        SubLObject id2 = NIL;
        SubLObject strategy2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          if( Hashtables.iteratorHasNext( cdohash_iterator ) )
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            strategy2 = Hashtables.getEntryValue( cdohash_entry );
            return strategy2;
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49073L)
  public static SubLObject problem_store_obvious_strategic_context(final SubLObject store)
  {
    if( ONE_INTEGER.numE( problem_store_strategy_count( store ) ) )
    {
      return first_problem_store_strategy( store );
    }
    final SubLObject bal_strat = problem_store_unique_balancing_tactician( store );
    if( NIL != bal_strat )
    {
      return bal_strat;
    }
    return $kw290$TACTICAL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49490L)
  public static SubLObject problem_store_unique_balancing_tactician(final SubLObject store)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = problem_store_strategies( store );
    SubLObject strategy = NIL;
    strategy = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != balancing_tactician.balancing_tactician_p( strategy ) )
      {
        if( NIL != result )
        {
          return NIL;
        }
        result = strategy;
      }
      cdolist_list_var = cdolist_list_var.rest();
      strategy = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49784L)
  public static SubLObject problem_store_link_count(final SubLObject store)
  {
    return id_index.id_index_count( prob_store_link_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49963L)
  public static SubLObject problem_store_historical_link_count(final SubLObject store)
  {
    return id_index.id_index_next_id( prob_store_link_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50159L)
  public static SubLObject find_problem_link_by_id(final SubLObject store, final SubLObject link_suid)
  {
    final SubLObject v_id_index = prob_store_link_id_index( store );
    return id_index.id_index_lookup( v_id_index, link_suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50323L)
  public static SubLObject find_problem_link_by_ids(final SubLObject store_suid, final SubLObject link_suid)
  {
    final SubLObject store = find_problem_store_by_id( store_suid );
    if( NIL != store )
    {
      return find_problem_link_by_id( store, link_suid );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50532L)
  public static SubLObject problem_store_first_link_of_type(final SubLObject store, final SubLObject type)
  {
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$40 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$40, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$40 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link ) )
            {
              link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( link, type ) )
            {
              return link;
            }
          }
        }
      }
      final SubLObject idx_$41 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$41 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$41 );
        SubLObject id2 = NIL;
        SubLObject link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( link2, type ) )
            {
              return link2;
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50716L)
  public static SubLObject problem_store_link_type_count(final SubLObject store, final SubLObject type)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$42 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$42, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$42 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link ) )
            {
              link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( link, type ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$43 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$43 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$43 );
        SubLObject id2 = NIL;
        SubLObject link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( link2, type ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50945L)
  public static SubLObject problem_store_content_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw291$CONTENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51061L)
  public static SubLObject problem_store_answer_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw292$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51175L)
  public static SubLObject problem_store_removal_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw293$REMOVAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51291L)
  public static SubLObject problem_store_conjunctive_removal_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw294$REMOVAL_CONJUNCTIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51431L)
  public static SubLObject problem_store_transformation_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw295$TRANSFORMATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51561L)
  public static SubLObject problem_store_rewrite_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw296$REWRITE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51677L)
  public static SubLObject problem_store_structural_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw297$STRUCTURAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51799L)
  public static SubLObject problem_store_join_ordered_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw298$JOIN_ORDERED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51925L)
  public static SubLObject problem_store_join_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw299$JOIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52035L)
  public static SubLObject problem_store_split_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw300$SPLIT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52147L)
  public static SubLObject problem_store_restriction_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw301$RESTRICTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52273L)
  public static SubLObject problem_store_residual_transformation_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw302$RESIDUAL_TRANSFORMATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52421L)
  public static SubLObject problem_store_union_link_count(final SubLObject store)
  {
    return problem_store_link_type_count( store, $kw303$UNION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52533L)
  public static SubLObject problem_store_unmanifested_non_focal_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$44 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$44, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$44 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject jo_link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          jo_link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( jo_link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( jo_link ) )
            {
              jo_link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( jo_link, $kw298$JOIN_ORDERED ) && NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(
                jo_link ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$45 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$45 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$45 );
        SubLObject id2 = NIL;
        SubLObject jo_link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            jo_link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( jo_link2, $kw298$JOIN_ORDERED ) && NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(
                jo_link2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52790L)
  public static SubLObject problem_store_problem_count(final SubLObject store)
  {
    return id_index.id_index_count( prob_store_problem_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52970L)
  public static SubLObject problem_store_historical_problem_count(final SubLObject store)
  {
    return id_index.id_index_next_id( prob_store_problem_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53167L)
  public static SubLObject problem_store_emptyP(final SubLObject store)
  {
    return Numbers.numLE( problem_store_problem_count( store ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53304L)
  public static SubLObject compute_crazy_max_problem_count(final SubLObject max_problem_count)
  {
    return number_utilities.potentially_infinite_number_max( number_utilities.potentially_infinite_number_plus( max_problem_count, $int304$212 ), number_utilities.potentially_infinite_number_times( max_problem_count,
        TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53896L)
  public static SubLObject problem_store_max_problem_count_reachedP(final SubLObject store)
  {
    final SubLObject max_problem_count = problem_store_max_problem_count( store );
    return makeBoolean( NIL == number_utilities.positive_infinity_p( max_problem_count ) && problem_store_problem_count( store ).numGE( max_problem_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54359L)
  public static SubLObject problem_store_max_proof_count_reachedP(final SubLObject store)
  {
    final SubLObject max_problem_count = problem_store_max_problem_count( store );
    final SubLObject max_proof_count = number_utilities.potentially_infinite_number_times( max_problem_count, $max_proof_count_multiplier$.getGlobalValue() );
    return makeBoolean( NIL == number_utilities.positive_infinity_p( max_proof_count ) && problem_store_proof_count( store ).numGE( max_proof_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54732L)
  public static SubLObject problem_store_crazy_max_problem_count_exactly_reachedP(final SubLObject store)
  {
    final SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count( store );
    return makeBoolean( NIL == number_utilities.positive_infinity_p( crazy_max_problem_count ) && problem_store_problem_count( store ).numE( crazy_max_problem_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55044L)
  public static SubLObject problem_store_crazy_max_problem_count_reachedP(final SubLObject store)
  {
    final SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count( store );
    return makeBoolean( NIL == number_utilities.positive_infinity_p( crazy_max_problem_count ) && problem_store_problem_count( store ).numGE( crazy_max_problem_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55350L)
  public static SubLObject problem_store_allows_proof_processingP(final SubLObject store)
  {
    return makeBoolean( NIL != problem_store_privateP( store ) && NIL == problem_store_compute_answer_justificationsP( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55623L)
  public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = problem_store_memoization_state( store );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = problem_store_allows_problem_hl_free_vars_optimizationP_int( store );
      }
      finally
      {
        final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55882L)
  public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $disable_problem_store_allows_problem_hl_free_vars_optimizationP$.getDynamicValue( thread ) && NIL == problem_store_compute_answer_justificationsP( store ) && NIL != sksi_query_utilities
        .some_sksi_removal_module_registeredP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55882L)
  public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return problem_store_allows_problem_hl_free_vars_optimizationP_int_internal( store );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, ONE_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, store, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( problem_store_allows_problem_hl_free_vars_optimizationP_int_internal( store ) ) );
      memoization_state.caching_state_put( caching_state, store, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56765L)
  public static SubLObject problem_identity_depends_on_free_hl_varsP(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $force_problem_identity_depends_on_free_hl_vars$.getDynamicValue( thread ) || NIL != problem_store_allows_problem_hl_free_vars_optimizationP( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56969L)
  public static SubLObject find_problem_by_id(final SubLObject store, final SubLObject problem_suid)
  {
    final SubLObject v_id_index = prob_store_problem_id_index( store );
    return id_index.id_index_lookup( v_id_index, problem_suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 57137L)
  public static SubLObject find_problem_by_ids(final SubLObject store_suid, final SubLObject problem_suid)
  {
    final SubLObject store = find_problem_store_by_id( store_suid );
    if( NIL != store )
    {
      return find_problem_by_id( store, problem_suid );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 57342L)
  public static SubLObject find_problem_by_query(final SubLObject store, final SubLObject query, SubLObject free_hl_vars)
  {
    if( free_hl_vars == UNPROVIDED )
    {
      free_hl_vars = NIL;
    }
    final SubLObject domain = problem_store_equality_reasoning_domain( store );
    SubLObject result = NIL;
    if( NIL != inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP( query, domain ) && NIL == result )
    {
      SubLObject csome_list_var = Hashtables.gethash_without_values( query, prob_store_problems_by_query_index( store ), UNPROVIDED );
      SubLObject problem = NIL;
      problem = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( NIL == problem_identity_depends_on_free_hl_varsP( store ) || free_hl_vars.equal( inference_datastructures_problem.problem_free_hl_vars( problem ) ) )
        {
          result = problem;
        }
        csome_list_var = csome_list_var.rest();
        problem = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58059L)
  public static SubLObject problem_store_tactical_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$47 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$47, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$47 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactical_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$48 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$48 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$48 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactical_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58266L)
  public static SubLObject problem_store_unexamined_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$49 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$49, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$49 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$50 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$50 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$50 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58488L)
  public static SubLObject problem_store_examined_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$51 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$51, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$51 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$52 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$52 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$52 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58706L)
  public static SubLObject problem_store_possible_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$53 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$53, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$53 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$54 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$54 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$54 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58924L)
  public static SubLObject problem_store_pending_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$55 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$55, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$55 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$56 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$56 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$56 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59140L)
  public static SubLObject problem_store_finished_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$57 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$57, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$57 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$58 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$58 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$58 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59358L)
  public static SubLObject problem_store_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$59 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$59, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$59 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$60 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$60 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$60 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59568L)
  public static SubLObject problem_store_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$61 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$61, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$61 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$62 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$62 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$62 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59784L)
  public static SubLObject problem_store_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$63 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$63, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$63 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$64 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$64 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$64 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60000L)
  public static SubLObject problem_store_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$65 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$65, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$65 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$66 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$66 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$66 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60219L)
  public static SubLObject problem_store_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$67 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$67, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$67 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$68 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$68 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$68 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60432L)
  public static SubLObject problem_store_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$69 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$69, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$69 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$70 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$70 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$70 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60631L)
  public static SubLObject problem_store_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$71 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$71, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$71 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$72 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$72 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$72 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60832L)
  public static SubLObject problem_store_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$73 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$73, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$73 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$74 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$74 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$74 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61045L)
  public static SubLObject problem_store_unexamined_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$75 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$75, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$75 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$76 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$76 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$76 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61320L)
  public static SubLObject problem_store_examined_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$77 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$77, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$77 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$78 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$78 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$78 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61591L)
  public static SubLObject problem_store_possible_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$79 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$79, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$79 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$80 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$80 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$80 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61862L)
  public static SubLObject problem_store_pending_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$81 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$81, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$81 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$82 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$82 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$82 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62131L)
  public static SubLObject problem_store_finished_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$83 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$83, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$83 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$84 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$84 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$84 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62402L)
  public static SubLObject problem_store_unexamined_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$85 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$85, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$85 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$86 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$86 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$86 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62683L)
  public static SubLObject problem_store_examined_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$87 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$87, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$87 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$88 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$88 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$88 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62960L)
  public static SubLObject problem_store_possible_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$89 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$89, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$89 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$90 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$90 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$90 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63237L)
  public static SubLObject problem_store_pending_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$91 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$91, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$91 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$92 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$92 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$92 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63512L)
  public static SubLObject problem_store_finished_neutral_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$93 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$93, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$93 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$94 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$94 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$94 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63789L)
  public static SubLObject problem_store_unexamined_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$95 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$95, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$95 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$96 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$96 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$96 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64070L)
  public static SubLObject problem_store_examined_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$97 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$97, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$97 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$98 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$98 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$98 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64347L)
  public static SubLObject problem_store_possible_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$99 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$99, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$99 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$100 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$100 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$100 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64624L)
  public static SubLObject problem_store_pending_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$101 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$101, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$101 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$102 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$102 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$102 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64899L)
  public static SubLObject problem_store_finished_no_good_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$103 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$103, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$103 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$104 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$104 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$104 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65176L)
  public static SubLObject problem_store_good_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$105 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$105, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$105 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$106 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$106 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$106 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65448L)
  public static SubLObject problem_store_good_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$107 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$107, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$107 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$108 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$108 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$108 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65714L)
  public static SubLObject problem_store_good_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$109 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$109, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$109 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$110 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$110 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$110 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65966L)
  public static SubLObject problem_store_good_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$111 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$111, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$111 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$112 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$112 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$112 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66220L)
  public static SubLObject problem_store_good_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$113 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$113, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$113 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$114 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$114 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$114 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66486L)
  public static SubLObject problem_store_neutral_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$115 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$115, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$115 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$116 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$116 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$116 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66764L)
  public static SubLObject problem_store_neutral_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$117 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$117, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$117 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$118 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$118 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$118 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67036L)
  public static SubLObject problem_store_neutral_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$119 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$119, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$119 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$120 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$120 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$120 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67294L)
  public static SubLObject problem_store_neutral_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$121 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$121, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$121 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$122 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$122 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$122 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67554L)
  public static SubLObject problem_store_neutral_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$123 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$123, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$123 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$124 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$124 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$124 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_neutral_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67826L)
  public static SubLObject problem_store_no_good_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$125 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$125, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$125 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$126 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$126 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$126 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68104L)
  public static SubLObject problem_store_no_good_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$127 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$127, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$127 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$128 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$128 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$128 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68376L)
  public static SubLObject problem_store_no_good_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$129 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$129, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$129 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$130 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$130 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$130 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68634L)
  public static SubLObject problem_store_no_good_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$131 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$131, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$131 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$132 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$132 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$132 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68894L)
  public static SubLObject problem_store_no_good_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$133 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$133, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$133 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$134 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$134 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$134 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69166L)
  public static SubLObject problem_store_unexamined_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$135 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$135, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$135 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$136 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$136 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$136 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69450L)
  public static SubLObject problem_store_unexamined_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$137 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$137, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$137 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$138 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$138 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$138 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69728L)
  public static SubLObject problem_store_unexamined_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$139 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$139, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$139 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$140 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$140 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$140 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69992L)
  public static SubLObject problem_store_unexamined_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$141 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$141, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$141 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$142 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$142 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$142 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70258L)
  public static SubLObject problem_store_unexamined_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$143 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$143, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$143 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$144 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$144 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$144 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70536L)
  public static SubLObject problem_store_examined_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$145 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$145, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$145 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$146 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$146 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$146 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70816L)
  public static SubLObject problem_store_examined_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$147 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$147, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$147 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$148 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$148 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$148 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71090L)
  public static SubLObject problem_store_examined_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$149 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$149, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$149 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$150 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$150 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$150 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71350L)
  public static SubLObject problem_store_examined_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$151 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$151, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$151 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$152 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$152 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$152 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71612L)
  public static SubLObject problem_store_examined_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$153 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$153, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$153 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$154 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$154 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$154 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_examined_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71886L)
  public static SubLObject problem_store_possible_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$155 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$155, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$155 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$156 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$156 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$156 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72166L)
  public static SubLObject problem_store_possible_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$157 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$157, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$157 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$158 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$158 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$158 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72440L)
  public static SubLObject problem_store_possible_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$159 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$159, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$159 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$160 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$160 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$160 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72700L)
  public static SubLObject problem_store_possible_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$161 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$161, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$161 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$162 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$162 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$162 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72962L)
  public static SubLObject problem_store_possible_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$163 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$163, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$163 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$164 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$164 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$164 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_possible_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73236L)
  public static SubLObject problem_store_pending_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$165 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$165, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$165 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$166 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$166 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$166 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73514L)
  public static SubLObject problem_store_pending_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$167 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$167, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$167 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$168 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$168 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$168 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73786L)
  public static SubLObject problem_store_pending_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$169 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$169, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$169 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$170 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$170 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$170 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74044L)
  public static SubLObject problem_store_pending_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$171 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$171, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$171 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$172 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$172 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$172 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74304L)
  public static SubLObject problem_store_pending_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$173 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$173, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$173 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$174 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$174 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$174 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_pending_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74576L)
  public static SubLObject problem_store_finished_single_literal_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$175 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$175, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$175 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$176 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$176 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$176 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.single_literal_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74856L)
  public static SubLObject problem_store_finished_conjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$177 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$177, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$177 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$178 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$178 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$178 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.conjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75130L)
  public static SubLObject problem_store_finished_join_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$179 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$179, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$179 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.join_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$180 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$180 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$180 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.join_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75390L)
  public static SubLObject problem_store_finished_split_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$181 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$181, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$181 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.split_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$182 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$182 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$182 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.split_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75652L)
  public static SubLObject problem_store_finished_disjunctive_problem_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$183 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$183, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$183 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
      }
      final SubLObject idx_$184 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$184 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$184 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem2 ) && NIL != inference_datastructures_problem.disjunctive_problem_p( problem2 ) )
            {
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75926L)
  public static SubLObject problem_store_executed_removal_tactic_productivities(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    SubLObject tuples = NIL;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$185 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$185, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$185 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        SubLObject problem_tuples;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            problem_tuples = inference_datastructures_problem.problem_executed_removal_tactic_productivities( problem );
            tuples = conses_high.nreconc( problem_tuples, tuples );
          }
        }
      }
      final SubLObject idx_$186 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$186 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$186 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject problem_tuples2 = inference_datastructures_problem.problem_executed_removal_tactic_productivities( problem2 );
            tuples = conses_high.nreconc( problem_tuples2, tuples );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 76441L)
  public static SubLObject problem_store_tactic_with_status_count(final SubLObject store, SubLObject status)
  {
    if( status == UNPROVIDED )
    {
      status = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$187 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$187, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$187 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            count = Numbers.add( count, inference_datastructures_problem.problem_tactic_with_status_count( problem, status ) );
          }
        }
      }
      final SubLObject idx_$188 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$188 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$188 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            count = Numbers.add( count, inference_datastructures_problem.problem_tactic_with_status_count( problem2, status ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 76766L)
  public static SubLObject problem_store_tactic_of_type_with_status_count(final SubLObject store, SubLObject type, SubLObject status)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( status == UNPROVIDED )
    {
      status = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$189 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$189, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$189 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            count = Numbers.add( count, inference_datastructures_problem.problem_tactic_of_type_with_status_count( problem, type, status ) );
          }
        }
      }
      final SubLObject idx_$190 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$190 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$190 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            count = Numbers.add( count, inference_datastructures_problem.problem_tactic_of_type_with_status_count( problem2, type, status ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77130L)
  public static SubLObject problem_store_tactic_count(final SubLObject store)
  {
    return problem_store_tactic_with_status_count( store, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77312L)
  public static SubLObject problem_store_historical_tactic_count(final SubLObject store)
  {
    return prob_store_historical_tactic_count( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77520L)
  public static SubLObject problem_store_increment_historical_tactic_count(final SubLObject store)
  {
    _csetf_prob_store_historical_tactic_count( store, Numbers.add( prob_store_historical_tactic_count( store ), ONE_INTEGER ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77716L)
  public static SubLObject problem_store_possible_tactic_count(final SubLObject store)
  {
    return problem_store_tactic_with_status_count( store, $kw306$POSSIBLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77922L)
  public static SubLObject problem_store_executed_tactic_count(final SubLObject store)
  {
    return problem_store_tactic_with_status_count( store, $kw307$EXECUTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78128L)
  public static SubLObject problem_store_discarded_tactic_count(final SubLObject store)
  {
    return problem_store_tactic_with_status_count( store, $kw308$DISCARDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78337L)
  public static SubLObject problem_store_proof_count(final SubLObject store)
  {
    return id_index.id_index_count( prob_store_proof_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78547L)
  public static SubLObject problem_store_historical_proof_count(final SubLObject store)
  {
    return id_index.id_index_next_id( prob_store_proof_id_index( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78738L)
  public static SubLObject find_proof_by_id(final SubLObject store, final SubLObject proof_suid)
  {
    final SubLObject v_id_index = prob_store_proof_id_index( store );
    return id_index.id_index_lookup( v_id_index, proof_suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78898L)
  public static SubLObject find_proof_by_ids(final SubLObject store_suid, final SubLObject proof_suid)
  {
    final SubLObject store = find_problem_store_by_id( store_suid );
    if( NIL != store )
    {
      return find_proof_by_id( store, proof_suid );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79095L)
  public static SubLObject problem_store_some_rejected_proofsP(final SubLObject store)
  {
    return dictionary.non_empty_dictionary_p( problem_store_rejected_proofs( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79231L)
  public static SubLObject problem_store_rejected_proof_count(final SubLObject store)
  {
    return dictionary.dictionary_length( problem_store_rejected_proofs( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79360L)
  public static SubLObject problem_store_proven_proof_count(final SubLObject store)
  {
    return Numbers.subtract( problem_store_proof_count( store ), problem_store_rejected_proof_count( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79513L)
  public static SubLObject problem_store_all_processed_proofs(final SubLObject store)
  {
    return Sort.sort( set.set_element_list( problem_store_processed_proofs( store ) ), Symbols.symbol_function( $sym309$_ ), Symbols.symbol_function( $sym310$PROOF_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79667L)
  public static SubLObject problem_store_all_potentially_processed_problems(final SubLObject store)
  {
    return Sort.sort( set.set_element_list( problem_store_potentially_processed_problems( store ) ), Symbols.symbol_function( $sym309$_ ), Symbols.symbol_function( $sym311$PROBLEM_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79850L)
  public static SubLObject problem_store_has_some_non_explanatory_subproofP(final SubLObject store)
  {
    return makeBoolean( NIL == dictionary.dictionary_empty_p( problem_store_non_explanatory_subproofs_index( store ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80018L)
  public static SubLObject problem_store_proof_non_explanatory_subproofs(final SubLObject store, final SubLObject proof)
  {
    return dictionary.dictionary_lookup_without_values( problem_store_non_explanatory_subproofs_index( store ), proof, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80201L)
  public static SubLObject problem_store_size(final SubLObject store)
  {
    return Numbers.add( problem_store_problem_count( store ), problem_store_link_count( store ), problem_store_proof_count( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80397L)
  public static SubLObject problem_store_historical_size(final SubLObject store)
  {
    return Numbers.add( problem_store_historical_problem_count( store ), problem_store_historical_link_count( store ), problem_store_historical_proof_count( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80647L)
  public static SubLObject total_size_of_all_problem_stores()
  {
    return number_utilities.summation( Mapping.mapcar( Symbols.symbol_function( $sym312$PROBLEM_STORE_SIZE ), all_problem_stores() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80893L)
  public static SubLObject total_size_of_all_historical_problem_stores()
  {
    return Numbers.add( inference_metrics.problem_historical_count(), inference_metrics.problem_link_historical_count(), inference_metrics.proof_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81187L)
  public static SubLObject problem_store_dependent_link_count(final SubLObject store)
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$191 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$191, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$191 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link ) )
            {
              link = $kw285$SKIP;
            }
            count = Numbers.add( count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems( link ) );
          }
        }
      }
      final SubLObject idx_$192 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$192 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$192 );
        SubLObject id2 = NIL;
        SubLObject link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            link2 = Hashtables.getEntryValue( cdohash_entry );
            count = Numbers.add( count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems( link2 ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81487L)
  public static SubLObject problem_store_most_recent_transformation_link(final SubLObject store)
  {
    SubLObject link = NIL;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$193 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$193, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$193 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link_var;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link_var = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link_var ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link_var ) )
            {
              link_var = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( link_var, $kw295$TRANSFORMATION ) )
            {
              link = link_var;
            }
          }
        }
      }
      final SubLObject idx_$194 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$194 ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$194 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$194 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$194 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw285$SKIP ) ) ? NIL : $kw285$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject link_var2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( ( NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) || NIL == id_index.id_index_tombstone_p( link_var2 ) ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( link_var2,
              $kw295$TRANSFORMATION ) )
          {
            link = link_var2;
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81778L)
  public static SubLObject problem_store_transformation_rules(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    SubLObject considered_rules = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$195 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$195, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$195 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject transformation_link;
        SubLObject rule;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          transformation_link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( transformation_link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( transformation_link ) )
            {
              transformation_link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( transformation_link, $kw295$TRANSFORMATION ) )
            {
              rule = inference_worker_transformation.transformation_link_rule_assertion( transformation_link );
              considered_rules = set_contents.set_contents_add( rule, considered_rules, Symbols.symbol_function( EQ ) );
            }
          }
        }
      }
      final SubLObject idx_$196 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$196 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$196 );
        SubLObject id2 = NIL;
        SubLObject transformation_link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            transformation_link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( transformation_link2, $kw295$TRANSFORMATION ) )
            {
              final SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion( transformation_link2 );
              considered_rules = set_contents.set_contents_add( rule2, considered_rules, Symbols.symbol_function( EQ ) );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return set_contents.set_contents_element_list( considered_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82305L)
  public static SubLObject problem_store_all_non_focal_problems(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    final SubLObject problems = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$197 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$197, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$197 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject join_ordered_link;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          join_ordered_link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( join_ordered_link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( join_ordered_link ) )
            {
              join_ordered_link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( join_ordered_link, $kw298$JOIN_ORDERED ) )
            {
              problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem( join_ordered_link );
              set.set_add( problem, problems );
            }
          }
        }
      }
      final SubLObject idx_$198 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$198 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$198 );
        SubLObject id2 = NIL;
        SubLObject join_ordered_link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            join_ordered_link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( join_ordered_link2, $kw298$JOIN_ORDERED ) )
            {
              final SubLObject problem2 = inference_worker_join_ordered.join_ordered_link_non_focal_problem( join_ordered_link2 );
              set.set_add( problem2, problems );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sort.sort( set.set_element_list( problems ), Symbols.symbol_function( $sym309$_ ), Symbols.symbol_function( $sym311$PROBLEM_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82718L)
  public static SubLObject problem_store_could_recompute_destructiblesP(final SubLObject store)
  {
    final SubLObject janitor = problem_store_janitor( store );
    return problem_store_janitor_staleP( janitor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82892L)
  public static SubLObject problem_store_could_remove_destructiblesP(final SubLObject store)
  {
    final SubLObject janitor = problem_store_janitor( store );
    return makeBoolean( NIL == problem_store_janitor_staleP( janitor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83069L)
  public static SubLObject problem_stores_similarP(final SubLObject store1, final SubLObject store2)
  {
    return Numbers.numE( problem_store_problem_count( store1 ), problem_store_problem_count( store2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83332L)
  public static SubLObject problem_store_transformation_rule_bindings_to_closed(final SubLObject store)
  {
    SubLObject triples = NIL;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$199 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$199, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$199 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject transformation_link;
        SubLObject rule;
        SubLObject v_bindings;
        SubLObject mt;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          transformation_link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( transformation_link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( transformation_link ) )
            {
              transformation_link = $kw285$SKIP;
            }
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( transformation_link, $kw295$TRANSFORMATION ) )
            {
              rule = inference_worker_transformation.transformation_link_rule_assertion( transformation_link );
              v_bindings = inference_worker_transformation.transformation_link_rule_bindings_to_closed( transformation_link );
              mt = inference_datastructures_problem.single_literal_problem_mt( inference_datastructures_problem_link.problem_link_supported_problem( transformation_link ) );
              triples = ConsesLow.cons( ConsesLow.list( rule, v_bindings, mt ), triples );
            }
          }
        }
      }
      final SubLObject idx_$200 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$200 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$200 );
        SubLObject id2 = NIL;
        SubLObject transformation_link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            transformation_link2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem_link.problem_link_has_typeP( transformation_link2, $kw295$TRANSFORMATION ) )
            {
              final SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion( transformation_link2 );
              final SubLObject v_bindings2 = inference_worker_transformation.transformation_link_rule_bindings_to_closed( transformation_link2 );
              final SubLObject mt2 = inference_datastructures_problem.single_literal_problem_mt( inference_datastructures_problem_link.problem_link_supported_problem( transformation_link2 ) );
              triples = ConsesLow.cons( ConsesLow.list( rule2, v_bindings2, mt2 ), triples );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( triples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84094L)
  public static SubLObject problem_store_all_problems(final SubLObject store)
  {
    SubLObject problems = NIL;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$201 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$201, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$201 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            problems = ConsesLow.cons( problem, problems );
          }
        }
      }
      final SubLObject idx_$202 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$202 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$202 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            problems = ConsesLow.cons( problem2, problems );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sort.sort( problems, Symbols.symbol_function( $sym309$_ ), Symbols.symbol_function( $sym311$PROBLEM_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84298L)
  public static SubLObject problem_store_all_problem_queries(final SubLObject store)
  {
    SubLObject queries = NIL;
    final SubLObject idx = problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$203 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$203, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$203 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw285$SKIP;
            }
            queries = ConsesLow.cons( inference_datastructures_problem.problem_query( problem ), queries );
          }
        }
      }
      final SubLObject idx_$204 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$204 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$204 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            queries = ConsesLow.cons( inference_datastructures_problem.problem_query( problem2 ), queries );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( queries );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84507L)
  public static SubLObject problem_store_all_problem_links(final SubLObject store)
  {
    SubLObject links = NIL;
    final SubLObject idx = problem_store_link_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$205 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$205, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$205 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject link;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          link = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( link ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( link ) )
            {
              link = $kw285$SKIP;
            }
            links = ConsesLow.cons( link, links );
          }
        }
      }
      final SubLObject idx_$206 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$206 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$206 );
        SubLObject id2 = NIL;
        SubLObject link2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            link2 = Hashtables.getEntryValue( cdohash_entry );
            links = ConsesLow.cons( link2, links );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sort.sort( links, Symbols.symbol_function( $sym309$_ ), Symbols.symbol_function( $sym313$PROBLEM_LINK_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84703L)
  public static SubLObject problem_store_all_proofs(final SubLObject store)
  {
    SubLObject proofs = NIL;
    final SubLObject idx = problem_store_proof_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw285$SKIP ) )
    {
      final SubLObject idx_$207 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$207, $kw285$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$207 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject proof;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          proof = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( proof ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( proof ) )
            {
              proof = $kw285$SKIP;
            }
            proofs = ConsesLow.cons( proof, proofs );
          }
        }
      }
      final SubLObject idx_$208 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$208 ) || NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$208 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$208 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$208 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw285$SKIP ) ) ? NIL : $kw285$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject proof2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index.id_index_skip_tombstones_p( $kw285$SKIP ) || NIL == id_index.id_index_tombstone_p( proof2 ) )
          {
            proofs = ConsesLow.cons( proof2, proofs );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( proofs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84889L)
  public static SubLObject problem_store_historical_root_problemP(final SubLObject store, final SubLObject problem)
  {
    return set.set_memberP( problem, prob_store_historical_root_problems( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85115L)
  public static SubLObject problem_store_historical_root_problem_count(final SubLObject store)
  {
    return set.set_size( prob_store_historical_root_problems( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85396L)
  public static SubLObject problem_store_problem_with_complex_problem_queryP(final SubLObject store, final SubLObject problem)
  {
    return dictionary_utilities.dictionary_has_keyP( prob_store_complex_problem_query_signatures( store ), problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85684L)
  public static SubLObject problem_store_complex_problem_query_signature(final SubLObject store, final SubLObject problem)
  {
    return dictionary.dictionary_lookup_without_values( prob_store_complex_problem_query_signatures( store ), problem, $kw314$UNDETERMINED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85883L)
  public static SubLObject problem_store_find_complex_problem_query(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars)
  {
    final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature( query );
    final SubLObject index = prob_store_complex_problem_query_czer_index( store );
    SubLObject cdolist_list_var;
    final SubLObject candidate_problems = cdolist_list_var = dictionary.dictionary_lookup_without_values( index, signature, NIL );
    SubLObject problem = NIL;
    problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == problem_identity_depends_on_free_hl_varsP( store ) || free_hl_vars.equal( inference_datastructures_problem.problem_free_hl_vars( problem ) ) )
      {
        final SubLObject candidate_query = inference_datastructures_problem.problem_query( problem );
        final SubLObject problem_variable_map = unification_utilities.compute_variable_map( candidate_query, query );
        if( NIL != problem_variable_map )
        {
          return Values.values( problem, problem_variable_map );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      problem = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86784L)
  public static SubLObject clear_problem_store_proof_keeping_problems(final SubLObject store)
  {
    Hashtables.clrhash( prob_store_proof_keeping_index( store ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86918L)
  public static SubLObject problem_proof_keeping_status(final SubLObject problem)
  {
    return Hashtables.gethash_without_values( problem, prob_store_proof_keeping_index( inference_datastructures_problem.problem_store( problem ) ), $kw315$UNKNOWN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87218L)
  public static SubLObject proof_keeping_problemP(final SubLObject problem)
  {
    final SubLObject status = problem_proof_keeping_status( problem );
    return makeBoolean( status != $kw316$NON_PROOF_KEEPING && status != $kw315$UNKNOWN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87577L)
  public static SubLObject non_proof_keeping_problemP(final SubLObject problem)
  {
    return Equality.eq( $kw316$NON_PROOF_KEEPING, problem_proof_keeping_status( problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87861L)
  public static SubLObject unknown_proof_keeping_problemP(final SubLObject problem)
  {
    return Equality.eq( $kw315$UNKNOWN, problem_proof_keeping_status( problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87983L)
  public static SubLObject note_proof_keeping_problem(final SubLObject problem, final SubLObject reason)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != list_utilities.member_eqP( reason, $list317 ) )
    {
      Errors.error( $str318$Invalid_proof_keeping_reason__a_f, reason, problem );
    }
    Hashtables.sethash( problem, prob_store_proof_keeping_index( inference_datastructures_problem.problem_store( problem ) ), reason );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88274L)
  public static SubLObject note_not_proof_keeping_problem(final SubLObject problem)
  {
    Hashtables.sethash( problem, prob_store_proof_keeping_index( inference_datastructures_problem.problem_store( problem ) ), $kw316$NON_PROOF_KEEPING );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88443L)
  public static SubLObject problem_store_prepare_for_expected_problem_count(final SubLObject store, final SubLObject total)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != subl_promotions.non_negative_integer_p( total ) : total;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject old_table = prob_store_problems_by_query_index( store );
      _csetf_prob_store_problems_by_query_index( store, hash_table_utilities.copy_hashtable( old_table, total ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return id_index.optimize_id_index( prob_store_problem_id_index( store ), total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88898L)
  public static SubLObject problem_store_prepare_for_expected_link_count(final SubLObject store, final SubLObject total)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != subl_promotions.non_negative_integer_p( total ) : total;
    return id_index.optimize_id_index( prob_store_link_id_index( store ), total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89126L)
  public static SubLObject problem_store_prepare_for_expected_proof_count(final SubLObject store, final SubLObject total)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != subl_promotions.non_negative_integer_p( total ) : total;
    return id_index.optimize_id_index( prob_store_proof_id_index( store ), total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89356L)
  public static SubLObject problem_store_new_inference_id(final SubLObject store)
  {
    final SubLObject v_id_index = problem_store_inference_id_index( store );
    SubLObject suid = NIL;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      suid = id_index.id_index_reserve( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89638L)
  public static SubLObject problem_store_new_strategy_id(final SubLObject store)
  {
    final SubLObject v_id_index = problem_store_strategy_id_index( store );
    SubLObject suid = NIL;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      suid = id_index.id_index_reserve( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89868L)
  public static SubLObject problem_store_new_problem_id(final SubLObject store)
  {
    final SubLObject v_id_index = problem_store_problem_id_index( store );
    SubLObject suid = NIL;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      suid = id_index.id_index_reserve( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90096L)
  public static SubLObject problem_store_new_link_id(final SubLObject store)
  {
    final SubLObject v_id_index = problem_store_link_id_index( store );
    SubLObject suid = NIL;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      suid = id_index.id_index_reserve( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90318L)
  public static SubLObject problem_store_new_proof_id(final SubLObject store)
  {
    final SubLObject v_id_index = problem_store_proof_id_index( store );
    SubLObject suid = NIL;
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      suid = id_index.id_index_reserve( v_id_index );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90542L)
  public static SubLObject add_problem_store_inference(final SubLObject store, final SubLObject inference)
  {
    final SubLObject id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter_unlocked_autoextend( prob_store_inference_id_index( store ), id, inference, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90805L)
  public static SubLObject remove_problem_store_inference(final SubLObject store, final SubLObject inference)
  {
    final SubLObject id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_remove( prob_store_inference_id_index( store ), id );
      problem_store_min_proof_depth_index_remove_inference( store, inference );
      problem_store_min_transformation_depth_index_remove_inference( store, inference );
      problem_store_min_transformation_depth_signature_index_remove_inference( store, inference );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91296L)
  public static SubLObject add_problem_store_strategy(final SubLObject store, final SubLObject strategy)
  {
    final SubLObject id = inference_datastructures_strategy.strategy_suid( strategy );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter_unlocked_autoextend( prob_store_strategy_id_index( store ), id, strategy, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91553L)
  public static SubLObject remove_problem_store_strategy(final SubLObject store, final SubLObject strategy)
  {
    final SubLObject id = inference_datastructures_strategy.strategy_suid( strategy );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_remove( prob_store_strategy_id_index( store ), id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91780L)
  public static SubLObject add_problem_store_problem_by_id(final SubLObject store, final SubLObject problem)
  {
    final SubLObject id = inference_datastructures_problem.problem_suid( problem );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter_unlocked_autoextend( prob_store_problem_id_index( store ), id, problem, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92035L)
  public static SubLObject remove_problem_store_problem_by_id(final SubLObject store, final SubLObject problem)
  {
    final SubLObject id = inference_datastructures_problem.problem_suid( problem );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_remove( prob_store_problem_id_index( store ), id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92261L)
  public static SubLObject add_problem_store_problem_by_query(final SubLObject store, final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP( problem ) )
    {
      final SubLObject query = inference_datastructures_problem.problem_query( problem );
      final SubLObject lock = problem_store_lock( store );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        hash_table_utilities.push_hash( query, problem, prob_store_problems_by_query_index( store ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92560L)
  public static SubLObject remove_problem_store_problem_by_query(final SubLObject store, final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP( problem ) )
    {
      final SubLObject query = inference_datastructures_problem.problem_query( problem );
      final SubLObject lock = problem_store_lock( store );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        hash_table_utilities.remove_value_from_hash( query, problem, prob_store_problems_by_query_index( store ), UNPROVIDED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92875L)
  public static SubLObject add_problem_store_link(final SubLObject store, final SubLObject link)
  {
    final SubLObject id = inference_datastructures_problem_link.problem_link_suid( link );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter_unlocked_autoextend( prob_store_link_id_index( store ), id, link, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93116L)
  public static SubLObject remove_problem_store_link(final SubLObject store, final SubLObject link)
  {
    final SubLObject id = inference_datastructures_problem_link.problem_link_suid( link );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_remove( prob_store_link_id_index( store ), id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93331L)
  public static SubLObject add_problem_store_proof(final SubLObject store, final SubLObject proof)
  {
    final SubLObject id = inference_datastructures_proof.proof_suid( proof );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter_unlocked_autoextend( prob_store_proof_id_index( store ), id, proof, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93570L)
  public static SubLObject remove_problem_store_proof(final SubLObject store, final SubLObject proof)
  {
    final SubLObject id = inference_datastructures_proof.proof_suid( proof );
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_remove( prob_store_proof_id_index( store ), id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93782L)
  public static SubLObject problem_store_forget_that_proof_is_rejected(final SubLObject store, final SubLObject proof)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_proof.proof_rejectedP( proof ) : proof;
    final SubLObject rejected_proofs = problem_store_rejected_proofs( store );
    dictionary.dictionary_remove( rejected_proofs, proof );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94064L)
  public static SubLObject problem_store_note_proof_processed(final SubLObject store, final SubLObject proof)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject processed_proofs = problem_store_processed_proofs( store );
    set.set_add( proof, processed_proofs );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94322L)
  public static SubLObject problem_store_note_proof_unprocessed(final SubLObject store, final SubLObject proof)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    final SubLObject processed_proofs = problem_store_processed_proofs( store );
    set.set_remove( proof, processed_proofs );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94584L)
  public static SubLObject problem_store_note_problem_potentially_processed(final SubLObject store, final SubLObject problem)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject potentially_processed_problems = problem_store_potentially_processed_problems( store );
    set.set_add( problem, potentially_processed_problems );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94905L)
  public static SubLObject problem_store_note_problem_unprocessed(final SubLObject store, final SubLObject problem)
  {
    assert NIL != problem_store_p( store ) : store;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject potentially_processed_problems = problem_store_potentially_processed_problems( store );
    set.set_remove( problem, potentially_processed_problems );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95219L)
  public static SubLObject problem_store_note_non_explanatory_subproofs_possible(final SubLObject store)
  {
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_prob_store_non_explanatory_subproofs_possibleP( store, T );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95423L)
  public static SubLObject problem_store_note_non_explanatory_subproof(final SubLObject store, final SubLObject proof, final SubLObject non_explanatory_subproof)
  {
    final SubLObject lock = problem_store_lock( store );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      dictionary_utilities.dictionary_pushnew( problem_store_non_explanatory_subproofs_index( store ), proof, non_explanatory_subproof, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95689L)
  public static SubLObject proof_note_non_explanatory_subproof(final SubLObject proof, final SubLObject non_explanatory_subproof)
  {
    assert NIL != inference_datastructures_proof.proof_p( proof ) : proof;
    assert NIL != inference_datastructures_proof.proof_p( non_explanatory_subproof ) : non_explanatory_subproof;
    final SubLObject store = inference_datastructures_proof.proof_store( proof );
    problem_store_note_non_explanatory_subproof( store, proof, non_explanatory_subproof );
    return proof;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96047L)
  public static SubLObject reset_problem_store_min_depth_index(final SubLObject store)
  {
    _csetf_prob_store_min_depth_index( store, Hashtables.make_hash_table( problem_store_problem_count( store ), Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96230L)
  public static SubLObject problem_store_min_proof_depth_index_remove_inference(final SubLObject store, final SubLObject inference)
  {
    final SubLObject index = problem_store_min_proof_depth_index( store );
    dictionary.dictionary_remove( index, inference );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96438L)
  public static SubLObject problem_store_min_transformation_depth_index_remove_inference(final SubLObject store, final SubLObject inference)
  {
    final SubLObject index = problem_store_min_transformation_depth_index( store );
    dictionary.dictionary_remove( index, inference );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96662L)
  public static SubLObject problem_store_min_transformation_depth_signature_index_remove_inference(final SubLObject store, final SubLObject inference)
  {
    final SubLObject index = problem_store_min_transformation_depth_signature_index( store );
    dictionary.dictionary_remove( index, inference );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96908L)
  public static SubLObject add_problem_store_historical_root_problem(final SubLObject store, final SubLObject problem)
  {
    return set.set_add( problem, prob_store_historical_root_problems( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97056L)
  public static SubLObject remove_problem_store_historical_root_problem(final SubLObject store, final SubLObject problem)
  {
    return set.set_remove( problem, prob_store_historical_root_problems( store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97240L)
  public static SubLObject finalize_problem_store_properties(final SubLObject store)
  {
    if( NIL == problem_store_preparedP( store ) )
    {
      note_problem_store_prepared( store );
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97519L)
  public static SubLObject add_problem_store_complex_problem(final SubLObject store, final SubLObject problem)
  {
    final SubLObject query = inference_datastructures_problem.problem_query( problem );
    final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature( query );
    if( NIL == problem_store_problem_with_complex_problem_queryP( store, problem ) )
    {
      dictionary.dictionary_enter( prob_store_complex_problem_query_signatures( store ), problem, signature );
      dictionary_utilities.dictionary_push( prob_store_complex_problem_query_czer_index( store ), signature, problem );
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97971L)
  public static SubLObject remove_problem_store_complex_problem(final SubLObject store, final SubLObject problem)
  {
    if( NIL != problem_store_problem_with_complex_problem_queryP( store, problem ) )
    {
      final SubLObject signature = dictionary.dictionary_lookup_without_values( prob_store_complex_problem_query_signatures( store ), problem, UNPROVIDED );
      dictionary.dictionary_remove( prob_store_complex_problem_query_signatures( store ), problem );
      dictionary_utilities.dictionary_delete_first_from_value( prob_store_complex_problem_query_czer_index( store ), signature, problem, Symbols.symbol_function( EQ ) );
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98456L)
  public static SubLObject add_problem_store_problem(final SubLObject store, final SubLObject problem)
  {
    add_problem_store_problem_by_id( store, problem );
    add_problem_store_problem_by_query( store, problem );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98662L)
  public static SubLObject remove_problem_store_problem(final SubLObject store, final SubLObject problem)
  {
    remove_problem_store_historical_root_problem( store, problem );
    remove_problem_wrt_reuse( store, problem );
    remove_problem_store_problem_by_id( store, problem );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98900L)
  public static SubLObject remove_problem_wrt_reuse(final SubLObject store, final SubLObject problem)
  {
    remove_problem_store_complex_problem( store, problem );
    remove_problem_store_problem_by_query( store, problem );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99127L)
  public static SubLObject problem_store_note_transformation_rule_considered(final SubLObject store, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = problem_store_memoization_state( store );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        ensure_transformation_rule_considered_noted( rule );
      }
      finally
      {
        final SubLObject _prev_bind_0_$209 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$209, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99407L)
  public static SubLObject problem_store_note_transformation_rule_success(final SubLObject store, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state = problem_store_memoization_state( store );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        ensure_transformation_rule_success_noted( rule );
      }
      finally
      {
        final SubLObject _prev_bind_0_$210 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$210, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99755L)
  public static SubLObject ensure_transformation_rule_considered_noted_internal(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      if( NIL == control_vars.$kbq_run_query_practice_modeP$.getDynamicValue( thread ) )
      {
        inference_analysis.increment_transformation_rule_considered_count( rule, T, UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99755L)
  public static SubLObject ensure_transformation_rule_considered_noted(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return ensure_transformation_rule_considered_noted_internal( rule );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( ensure_transformation_rule_considered_noted_internal( rule ) ) );
      memoization_state.caching_state_put( caching_state, rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100223L)
  public static SubLObject ensure_transformation_rule_success_noted_internal(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      if( NIL != control_vars.$kbq_run_query_practice_modeP$.getDynamicValue( thread ) )
      {
        inference_analysis.increment_transformation_rule_considered_count( rule, T, $int324$100, UNPROVIDED );
        inference_analysis.increment_transformation_rule_success_count( rule, T, $int324$100, UNPROVIDED );
      }
      else if( NIL != subl_promotions.positive_integer_p( $problem_store_multiple_subqueries_count$.getDynamicValue( thread ) ) )
      {
        inference_analysis.increment_transformation_rule_considered_count( rule, T, Numbers.subtract( $problem_store_multiple_subqueries_count$.getDynamicValue( thread ), ONE_INTEGER ), UNPROVIDED );
        inference_analysis.increment_transformation_rule_success_count( rule, T, $problem_store_multiple_subqueries_count$.getDynamicValue( thread ), UNPROVIDED );
      }
      else
      {
        inference_analysis.increment_transformation_rule_success_count( rule, T, UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100223L)
  public static SubLObject ensure_transformation_rule_success_noted(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return ensure_transformation_rule_success_noted_internal( rule );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( ensure_transformation_rule_success_noted_internal( rule ) ) );
      memoization_state.caching_state_put( caching_state, rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject problem_store_janitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject problem_store_janitor_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $problem_store_janitor_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject prob_store_janitor_store(final SubLObject v_object)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject prob_store_janitor_indestructible_problems(final SubLObject v_object)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject prob_store_janitor_staleP(final SubLObject v_object)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject _csetf_prob_store_janitor_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject _csetf_prob_store_janitor_indestructible_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject _csetf_prob_store_janitor_staleP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_store_janitor_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject make_problem_store_janitor(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $problem_store_janitor_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw340$STORE ) )
      {
        _csetf_prob_store_janitor_store( v_new, current_value );
      }
      else if( pcase_var.eql( $kw341$INDESTRUCTIBLE_PROBLEMS ) )
      {
        _csetf_prob_store_janitor_indestructible_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw342$STALE_ ) )
      {
        _csetf_prob_store_janitor_staleP( v_new, current_value );
      }
      else
      {
        Errors.error( $str204$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject visit_defstruct_problem_store_janitor(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw205$BEGIN, $sym343$MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw340$STORE, prob_store_janitor_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw341$INDESTRUCTIBLE_PROBLEMS, prob_store_janitor_indestructible_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw207$SLOT, $kw342$STALE_, prob_store_janitor_staleP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw208$END, $sym343$MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101338L)
  public static SubLObject visit_defstruct_object_problem_store_janitor_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_problem_store_janitor( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102218L)
  public static SubLObject new_problem_store_janitor(final SubLObject store)
  {
    assert NIL != problem_store_p( store ) : store;
    final SubLObject janitor = make_problem_store_janitor( UNPROVIDED );
    _csetf_prob_store_janitor_store( janitor, store );
    _csetf_prob_store_janitor_indestructible_problems( janitor, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    problem_store_janitor_note_stale( janitor );
    return janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102574L)
  public static SubLObject destroy_problem_store_janitor(final SubLObject janitor)
  {
    set.clear_set( prob_store_janitor_indestructible_problems( janitor ) );
    _csetf_prob_store_janitor_indestructible_problems( janitor, $kw210$FREE );
    _csetf_prob_store_janitor_store( janitor, $kw210$FREE );
    problem_store_janitor_note_stale( janitor );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102906L)
  public static SubLObject problem_store_janitor_store(final SubLObject janitor)
  {
    return prob_store_janitor_store( janitor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103019L)
  public static SubLObject problem_store_janitor_staleP(final SubLObject janitor)
  {
    return prob_store_janitor_staleP( janitor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103122L)
  public static SubLObject problem_store_janitor_indestructible_problems(final SubLObject janitor)
  {
    if( NIL != problem_store_janitor_staleP( janitor ) )
    {
      return set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    }
    return prob_store_janitor_indestructible_problems( janitor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103402L)
  public static SubLObject do_problem_store_janitor_indestructible_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject janitor = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    janitor = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$211 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list347 );
      current_$211 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list347 );
      if( NIL == conses_high.member( current_$211, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$211 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list347 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym262$DO_SET, ConsesLow.list( problem_var, ConsesLow.list( $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, janitor ), $kw4$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103644L)
  public static SubLObject do_problem_store_janitor_destructible_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject janitor = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    janitor = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$212 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list347 );
      current_$212 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list347 );
      if( NIL == conses_high.member( current_$212, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$212 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list347 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym245$DO_PROBLEM_STORE_PROBLEMS, ConsesLow.list( problem_var, ConsesLow.list( $sym348$PROBLEM_STORE_JANITOR_STORE, janitor ), $kw4$DONE, done ), ConsesLow.listS( $sym252$PWHEN, ConsesLow
        .list( $sym349$PROBLEM_DESTRUCTIBLE_, problem_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103923L)
  public static SubLObject problem_store_janitor_indestructible_problem_count(final SubLObject janitor)
  {
    return set.set_size( problem_store_janitor_indestructible_problems( janitor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104093L)
  public static SubLObject problem_store_janitor_destructible_problem_count(final SubLObject janitor)
  {
    return Numbers.subtract( problem_store_problem_count( problem_store_janitor_store( janitor ) ), problem_store_janitor_indestructible_problem_count( janitor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104316L)
  public static SubLObject problem_store_janitor_note_stale(final SubLObject janitor)
  {
    _csetf_prob_store_janitor_staleP( janitor, T );
    return janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104465L)
  public static SubLObject problem_store_janitor_note_unstale(final SubLObject janitor)
  {
    _csetf_prob_store_janitor_staleP( janitor, NIL );
    return janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104596L)
  public static SubLObject problem_store_janitor_note_problem_indestructible(final SubLObject janitor, final SubLObject problem)
  {
    assert NIL != problem_store_janitor_p( janitor ) : janitor;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject indestructible_problems = problem_store_janitor_indestructible_problems( janitor );
    set.set_add( problem, indestructible_problems );
    return janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104920L)
  public static SubLObject problem_store_janitor_note_problem_destructible(final SubLObject janitor, final SubLObject problem)
  {
    assert NIL != problem_store_janitor_p( janitor ) : janitor;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject indestructible_problems = problem_store_janitor_indestructible_problems( janitor );
    set.set_remove( problem, indestructible_problems );
    return janitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105391L)
  public static SubLObject problem_store_name(final SubLObject problem_store)
  {
    assert NIL != problem_store_p( problem_store ) : problem_store;
    final SubLObject id = problem_store_suid( problem_store );
    return Hashtables.gethash_without_values( id, $problem_store_id_to_name_table$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105843L)
  public static SubLObject find_problem_store_by_name(final SubLObject name)
  {
    assert NIL != inference_datastructures_enumerated_types.problem_store_name_p( name ) : name;
    if( NIL != name )
    {
      final SubLObject id = Hashtables.gethash_without_values( name, $problem_store_name_to_id_table$.getGlobalValue(), UNPROVIDED );
      if( NIL != id )
      {
        return find_problem_store_by_id( id );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106122L)
  public static SubLObject find_or_create_problem_store_by_name(final SubLObject name, SubLObject problem_store_properties)
  {
    if( problem_store_properties == UNPROVIDED )
    {
      problem_store_properties = NIL;
    }
    assert NIL != inference_datastructures_enumerated_types.problem_store_name_p( name ) : name;
    assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p( problem_store_properties ) : problem_store_properties;
    SubLObject store = find_problem_store_by_name( name );
    if( NIL == store )
    {
      final SubLObject new_properties = conses_high.putf( conses_high.copy_list( problem_store_properties ), $kw354$PROBLEM_STORE_NAME, name );
      store = new_problem_store( new_properties );
    }
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106772L)
  public static SubLObject destroy_problem_store_by_name(final SubLObject name)
  {
    assert NIL != inference_datastructures_enumerated_types.problem_store_name_p( name ) : name;
    return destroy_problem_store( find_problem_store_by_name( name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106935L)
  public static SubLObject rename_problem_store(final SubLObject problem_store, final SubLObject new_name)
  {
    assert NIL != problem_store_p( problem_store ) : problem_store;
    assert NIL != inference_datastructures_enumerated_types.problem_store_name_p( new_name ) : new_name;
    final SubLObject existing_store = find_problem_store_by_name( new_name );
    if( NIL != existing_store && problem_store.eql( existing_store ) )
    {
      return T;
    }
    if( NIL != existing_store )
    {
      return NIL;
    }
    free_problem_store_name( problem_store );
    set_problem_store_name( problem_store, new_name );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 107626L)
  public static SubLObject set_problem_store_name(final SubLObject problem_store, final SubLObject name)
  {
    if( NIL != name )
    {
      final SubLObject id = problem_store_suid( problem_store );
      Hashtables.sethash( id, $problem_store_id_to_name_table$.getGlobalValue(), name );
      Hashtables.sethash( name, $problem_store_name_to_id_table$.getGlobalValue(), id );
    }
    return problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 107923L)
  public static SubLObject free_problem_store_name(final SubLObject problem_store)
  {
    final SubLObject id = problem_store_suid( problem_store );
    final SubLObject name = problem_store_name( problem_store );
    Hashtables.remhash( id, $problem_store_id_to_name_table$.getGlobalValue() );
    Hashtables.remhash( name, $problem_store_name_to_id_table$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 108190L)
  public static SubLObject problem_store_properties(final SubLObject store)
  {
    SubLObject v_properties = NIL;
    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = problem_store_property_value( store, property );
      v_properties = ConsesLow.cons( ConsesLow.cons( property, value ), v_properties );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return list_utilities.alist_to_plist( Sequences.nreverse( v_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 108638L)
  public static SubLObject problem_store_property_value(final SubLObject store, final SubLObject property)
  {
    if( property.eql( $kw189$ABDUCTION_ALLOWED_ ) )
    {
      return problem_store_abduction_allowedP( store );
    }
    if( property.eql( $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ ) )
    {
      return problem_store_add_restriction_layer_of_indirectionP( store );
    }
    if( property.eql( $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_ ) )
    {
      return problem_store_completeness_minimization_allowedP( store );
    }
    if( property.eql( $kw186$DIRECTION ) )
    {
      return problem_store_direction( store );
    }
    if( property.eql( $kw177$EQUALITY_REASONING_DOMAIN ) )
    {
      return problem_store_equality_reasoning_domain( store );
    }
    if( property.eql( $kw176$EQUALITY_REASONING_METHOD ) )
    {
      return problem_store_equality_reasoning_method( store );
    }
    if( property.eql( $kw187$EVALUATE_SUBL_ALLOWED_ ) )
    {
      return problem_store_evaluate_subl_allowedP( store );
    }
    if( property.eql( $kw178$INTERMEDIATE_STEP_VALIDATION_LEVEL ) )
    {
      return problem_store_intermediate_step_validation_level( store );
    }
    if( property.eql( $kw179$MAX_PROBLEM_COUNT ) )
    {
      return problem_store_max_problem_count( store );
    }
    if( property.eql( $kw184$NEGATION_BY_FAILURE_ ) )
    {
      return problem_store_negation_by_failureP( store );
    }
    if( property.eql( $kw190$NEW_TERMS_ALLOWED_ ) )
    {
      return problem_store_new_terms_allowedP( store );
    }
    if( property.eql( $kw354$PROBLEM_STORE_NAME ) )
    {
      return problem_store_name( store );
    }
    if( property.eql( $kw181$REMOVAL_ALLOWED_ ) )
    {
      return problem_store_removal_allowedP( store );
    }
    if( property.eql( $kw188$REWRITE_ALLOWED_ ) )
    {
      return problem_store_rewrite_allowedP( store );
    }
    if( property.eql( $kw182$TRANSFORMATION_ALLOWED_ ) )
    {
      return problem_store_transformation_allowedP( store );
    }
    if( property.eql( $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_ ) )
    {
      return problem_store_compute_answer_justificationsP( store );
    }
    assert NIL != inference_datastructures_enumerated_types.problem_store_property_p( property ) : property;
    return Errors.error( $str357$Problem_store_property__S_reflect, property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 110739L)
  public static SubLObject possibly_optimize_problem_store(final SubLObject store)
  {
    if( NIL != hashify_problem_storeP( store ) )
    {
      hashify_problem_store( store );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111215L)
  public static SubLObject hashify_problem_storeP(final SubLObject store)
  {
    return makeBoolean( problem_store_historical_problem_count( store ).numG( Numbers.multiply( $problem_store_hash_watermark$.getGlobalValue(), problem_store_problem_count( store ) ) ) && NIL == id_index
        .id_index_pessimized_p( problem_store_problem_id_index( store ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111479L)
  public static SubLObject hashify_problem_store(final SubLObject store)
  {
    id_index.pessimize_id_index( problem_store_problem_id_index( store ) );
    id_index.pessimize_id_index( problem_store_link_id_index( store ) );
    id_index.pessimize_id_index( problem_store_proof_id_index( store ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111816L)
  public static SubLObject test_problem_store_property_value_support()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failures = NIL;
    SubLObject store = NIL;
    try
    {
      store = new_problem_store( NIL );
      SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
      SubLObject property = NIL;
      property = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject error_message = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym359$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              problem_store_property_value( store, property );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error_message )
        {
          failures = ConsesLow.cons( ConsesLow.cons( property, error_message ), failures );
        }
        cdolist_list_var = cdolist_list_var.rest();
        property = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        destroy_problem_store( store );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return failures;
  }

  public static SubLObject declare_inference_datastructures_problem_store_file()
  {
    SubLFiles.declareFunction( me, "new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareMacro( me, "do_all_problem_stores", "DO-ALL-PROBLEM-STORES" );
    SubLFiles.declareFunction( me, "problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_most_problem_stores", "DESTROY-MOST-PROBLEM-STORES", 0, 1, false );
    SubLFiles.declareFunction( me, "problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_p", "PROBLEM-STORE-P", 1, 0, false );
    new $problem_store_p$UnaryFunction();
    SubLFiles.declareFunction( me, "prob_store_guid", "PROB-STORE-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_suid", "PROB-STORE-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_lock", "PROB-STORE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_problems_by_query_index", "PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_potentially_processed_problems", "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_historical_tactic_count", "PROB-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_problems_by_query_index", "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_potentially_processed_problems", "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_historical_tactic_count", "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_problem_store", "VISIT-DEFSTRUCT-PROBLEM-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_problem_store_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false );
    SubLFiles.declareMacro( me, "with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD" );
    SubLFiles.declareFunction( me, "problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false );
    SubLFiles.declareMacro( me, "with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE" );
    SubLFiles.declareFunction( me, "problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE" );
    SubLFiles.declareFunction( me, "problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false );
    SubLFiles.declareMacro( me, "with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION" );
    SubLFiles.declareMacro( me, "do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES" );
    SubLFiles.declareFunction( me, "problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES" );
    SubLFiles.declareFunction( me, "problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS" );
    SubLFiles.declareMacro( me, "do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS" );
    SubLFiles.declareFunction( me, "problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_links", "DO-PROBLEM-STORE-LINKS" );
    SubLFiles.declareFunction( me, "problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS" );
    SubLFiles.declareFunction( me, "problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS" );
    SubLFiles.declareFunction( me, "problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_inference_strategies", "DO-INFERENCE-STRATEGIES" );
    SubLFiles.declareFunction( me, "new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_potentially_processed_problems", "PROBLEM-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false );
    SubLFiles.declareFunction( me, "note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_non_recursive_inference_count", "PROBLEM-STORE-NON-RECURSIVE-INFERENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_running_inferences", "PROBLEM-STORE-RUNNING-INFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_problem_hl_free_vars_optimizationP", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_problem_hl_free_vars_optimizationP_int_internal", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_problem_hl_free_vars_optimizationP_int", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_identity_depends_on_free_hl_varsP", "PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false );
    SubLFiles.declareFunction( me, "problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_tactic_count", "PROBLEM-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_increment_historical_tactic_count", "PROBLEM-STORE-INCREMENT-HISTORICAL-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_potentially_processed_problems", "PROBLEM-STORE-ALL-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "total_size_of_all_problem_stores", "TOTAL-SIZE-OF-ALL-PROBLEM-STORES", 0, 0, false );
    SubLFiles.declareFunction( me, "total_size_of_all_historical_problem_stores", "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_problem_potentially_processed", "PROBLEM-STORE-NOTE-PROBLEM-POTENTIALLY-PROCESSED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_problem_unprocessed", "PROBLEM-STORE-NOTE-PROBLEM-UNPROCESSED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false );
    new $problem_store_janitor_p$UnaryFunction();
    SubLFiles.declareFunction( me, "prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_problem_store_janitor", "VISIT-DEFSTRUCT-PROBLEM-STORE-JANITOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_problem_store_janitor_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS" );
    SubLFiles.declareFunction( me, "problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_optimize_problem_store", "POSSIBLY-OPTIMIZE-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "hashify_problem_storeP", "HASHIFY-PROBLEM-STORE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hashify_problem_store", "HASHIFY-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_problem_store_property_value_support", "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_datastructures_problem_store_file()
  {
    $problem_store_modification_permittedP$ = SubLFiles.defparameter( "*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL );
    $problem_store_multiple_subqueries_count$ = SubLFiles.defparameter( "*PROBLEM-STORE-MULTIPLE-SUBQUERIES-COUNT*", NIL );
    $problem_store_id_index$ = SubLFiles.deflexical( "*PROBLEM-STORE-ID-INDEX*", maybeDefault( $sym0$_PROBLEM_STORE_ID_INDEX_, $problem_store_id_index$, () -> ( id_index.new_id_index( UNPROVIDED, UNPROVIDED ) ) ) );
    $dtp_problem_store$ = SubLFiles.defconstant( "*DTP-PROBLEM-STORE*", $sym22$PROBLEM_STORE );
    $default_problem_store_problem_size$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int268$80 );
    $default_problem_store_link_size$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int269$120 );
    $default_problem_store_inference_size$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER );
    $default_problem_store_strategy_size$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue() );
    $default_problem_store_proof_size$ = SubLFiles.deflexical( "*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int48$40 );
    $problem_store_sbhl_resource_space_number$ = SubLFiles.deflexical( "*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER );
    $max_proof_count_multiplier$ = SubLFiles.deflexical( "*MAX-PROOF-COUNT-MULTIPLIER*", TEN_INTEGER );
    $disable_problem_store_allows_problem_hl_free_vars_optimizationP$ = SubLFiles.defparameter( "*DISABLE-PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?*", NIL );
    $force_problem_identity_depends_on_free_hl_vars$ = SubLFiles.defparameter( "*FORCE-PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS*", NIL );
    $dtp_problem_store_janitor$ = SubLFiles.defconstant( "*DTP-PROBLEM-STORE-JANITOR*", $sym325$PROBLEM_STORE_JANITOR );
    $problem_store_id_to_name_table$ = SubLFiles.deflexical( "*PROBLEM-STORE-ID-TO-NAME-TABLE*", maybeDefault( $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_, $problem_store_id_to_name_table$, () -> ( Hashtables
        .make_hash_table( ONE_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ) ) ) );
    $problem_store_name_to_id_table$ = SubLFiles.deflexical( "*PROBLEM-STORE-NAME-TO-ID-TABLE*", maybeDefault( $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_, $problem_store_name_to_id_table$, () -> ( Hashtables
        .make_hash_table( ONE_INTEGER, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $problem_store_hash_watermark$ = SubLFiles.deflexical( "*PROBLEM-STORE-HASH-WATERMARK*", $int358$50 );
    return NIL;
  }

  public static SubLObject setup_inference_datastructures_problem_store_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_PROBLEM_STORE_ID_INDEX_ );
    access_macros.register_macro_helper( $sym9$PROBLEM_STORE_ID_INDEX, $sym10$DO_ALL_PROBLEM_STORES );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function( $sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list59 );
    Structures.def_csetf( $sym60$PROB_STORE_GUID, $sym61$_CSETF_PROB_STORE_GUID );
    Structures.def_csetf( $sym62$PROB_STORE_SUID, $sym63$_CSETF_PROB_STORE_SUID );
    Structures.def_csetf( $sym64$PROB_STORE_LOCK, $sym65$_CSETF_PROB_STORE_LOCK );
    Structures.def_csetf( $sym66$PROB_STORE_CREATION_TIME, $sym67$_CSETF_PROB_STORE_CREATION_TIME );
    Structures.def_csetf( $sym68$PROB_STORE_INFERENCE_ID_INDEX, $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX );
    Structures.def_csetf( $sym70$PROB_STORE_STRATEGY_ID_INDEX, $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX );
    Structures.def_csetf( $sym72$PROB_STORE_PROBLEM_ID_INDEX, $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX );
    Structures.def_csetf( $sym74$PROB_STORE_LINK_ID_INDEX, $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX );
    Structures.def_csetf( $sym76$PROB_STORE_PROOF_ID_INDEX, $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX );
    Structures.def_csetf( $sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX, $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX );
    Structures.def_csetf( $sym80$PROB_STORE_REJECTED_PROOFS, $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS );
    Structures.def_csetf( $sym82$PROB_STORE_PROCESSED_PROOFS, $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS );
    Structures.def_csetf( $sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS, $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS );
    Structures.def_csetf( $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ );
    Structures.def_csetf( $sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX );
    Structures.def_csetf( $sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED );
    Structures.def_csetf( $sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX, $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX );
    Structures.def_csetf( $sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX );
    Structures.def_csetf( $sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX );
    Structures.def_csetf( $sym98$PROB_STORE_MIN_DEPTH_INDEX, $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX );
    Structures.def_csetf( $sym100$PROB_STORE_EQUALITY_REASONING_METHOD, $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD );
    Structures.def_csetf( $sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN, $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN );
    Structures.def_csetf( $sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL );
    Structures.def_csetf( $sym106$PROB_STORE_MAX_PROBLEM_COUNT, $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT );
    Structures.def_csetf( $sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT );
    Structures.def_csetf( $sym110$PROB_STORE_REMOVAL_ALLOWED_, $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ );
    Structures.def_csetf( $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ );
    Structures.def_csetf( $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ );
    Structures.def_csetf( $sym116$PROB_STORE_NEGATION_BY_FAILURE_, $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ );
    Structures.def_csetf( $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ );
    Structures.def_csetf( $sym120$PROB_STORE_DIRECTION, $sym121$_CSETF_PROB_STORE_DIRECTION );
    Structures.def_csetf( $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ );
    Structures.def_csetf( $sym124$PROB_STORE_REWRITE_ALLOWED_, $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_ );
    Structures.def_csetf( $sym126$PROB_STORE_ABDUCTION_ALLOWED_, $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ );
    Structures.def_csetf( $sym128$PROB_STORE_NEW_TERMS_ALLOWED_, $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ );
    Structures.def_csetf( $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ );
    Structures.def_csetf( $sym132$PROB_STORE_MEMOIZATION_STATE, $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE );
    Structures.def_csetf( $sym134$PROB_STORE_SBHL_RESOURCE_SPACE, $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE );
    Structures.def_csetf( $sym136$PROB_STORE_PREPARED_, $sym137$_CSETF_PROB_STORE_PREPARED_ );
    Structures.def_csetf( $sym138$PROB_STORE_DESTRUCTION_IMMINENT_, $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ );
    Structures.def_csetf( $sym140$PROB_STORE_META_PROBLEM_STORE, $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE );
    Structures.def_csetf( $sym142$PROB_STORE_STATIC_PROPERTIES, $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES );
    Structures.def_csetf( $sym144$PROB_STORE_JANITOR, $sym145$_CSETF_PROB_STORE_JANITOR );
    Structures.def_csetf( $sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS, $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS );
    Structures.def_csetf( $sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT, $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT );
    Structures.def_csetf( $sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX );
    Structures.def_csetf( $sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES );
    Structures.def_csetf( $sym154$PROB_STORE_PROOF_KEEPING_INDEX, $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX );
    Equality.identity( $sym22$PROBLEM_STORE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function( $sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function( $sym213$SXHASH_PROBLEM_STORE_METHOD ) );
    access_macros.register_macro_helper( $sym216$PROBLEM_STORE_LOCK, $sym217$WITH_PROBLEM_STORE_LOCK_HELD );
    access_macros.register_macro_helper( $sym220$PROBLEM_STORE_MEMOIZATION_STATE, $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE );
    access_macros.register_macro_helper( $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE );
    access_macros.register_macro_helper( $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE );
    access_macros.register_macro_helper( $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX, $sym232$DO_PROBLEM_STORE_INFERENCES );
    access_macros.register_macro_helper( $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX, $sym236$DO_PROBLEM_STORE_STRATEGIES );
    access_macros.register_macro_helper( $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX, $sym245$DO_PROBLEM_STORE_PROBLEMS );
    access_macros.register_macro_helper( $sym250$PROBLEM_STORE_LINK_ID_INDEX, $sym251$DO_PROBLEM_STORE_LINKS );
    access_macros.register_macro_helper( $sym258$PROBLEM_STORE_PROOF_ID_INDEX, $sym259$DO_PROBLEM_STORE_PROOFS );
    access_macros.register_macro_helper( $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS );
    memoization_state.note_memoized_function( $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT );
    memoization_state.note_memoized_function( $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED );
    memoization_state.note_memoized_function( $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), Symbols.symbol_function( $sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list333 );
    Structures.def_csetf( $sym334$PROB_STORE_JANITOR_STORE, $sym335$_CSETF_PROB_STORE_JANITOR_STORE );
    Structures.def_csetf( $sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS );
    Structures.def_csetf( $sym338$PROB_STORE_JANITOR_STALE_, $sym339$_CSETF_PROB_STORE_JANITOR_STALE_ );
    Equality.identity( $sym325$PROBLEM_STORE_JANITOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), Symbols.symbol_function(
        $sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD ) );
    access_macros.register_macro_helper( $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS );
    subl_macro_promotions.declare_defglobal( $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_ );
    access_macros.register_external_symbol( $sym352$FIND_PROBLEM_STORE_BY_NAME );
    access_macros.register_external_symbol( $sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME );
    access_macros.register_external_symbol( $sym355$DESTROY_PROBLEM_STORE_BY_NAME );
    generic_testing.define_test_case_table_int( $sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, ConsesLow.list( new SubLObject[] { $kw361$TEST, NIL, $kw362$OWNER, NIL, $kw363$CLASSES, NIL, $kw364$KB, $kw365$TINY,
      $kw366$WORKING_, T
    } ), $list367 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_datastructures_problem_store_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_datastructures_problem_store_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_datastructures_problem_store_file();
  }
  static
  {
    me = new inference_datastructures_problem_store();
    $problem_store_modification_permittedP$ = null;
    $problem_store_multiple_subqueries_count$ = null;
    $problem_store_id_index$ = null;
    $dtp_problem_store$ = null;
    $default_problem_store_problem_size$ = null;
    $default_problem_store_link_size$ = null;
    $default_problem_store_inference_size$ = null;
    $default_problem_store_strategy_size$ = null;
    $default_problem_store_proof_size$ = null;
    $problem_store_sbhl_resource_space_number$ = null;
    $max_proof_count_multiplier$ = null;
    $disable_problem_store_allows_problem_hl_free_vars_optimizationP$ = null;
    $force_problem_identity_depends_on_free_hl_vars$ = null;
    $dtp_problem_store_janitor$ = null;
    $problem_store_id_to_name_table$ = null;
    $problem_store_name_to_id_table$ = null;
    $problem_store_hash_watermark$ = null;
    $sym0$_PROBLEM_STORE_ID_INDEX_ = makeSymbol( "*PROBLEM-STORE-ID-INDEX*" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-STORE-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$ID = makeUninternedSymbol( "ID" );
    $sym6$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $list7 = ConsesLow.list( makeSymbol( "PROBLEM-STORE-ID-INDEX" ) );
    $sym8$IGNORE = makeSymbol( "IGNORE" );
    $sym9$PROBLEM_STORE_ID_INDEX = makeSymbol( "PROBLEM-STORE-ID-INDEX" );
    $sym10$DO_ALL_PROBLEM_STORES = makeSymbol( "DO-ALL-PROBLEM-STORES" );
    $str11$Destroying_all_ = makeString( "Destroying all " );
    $str12$_problem_stores = makeString( " problem stores" );
    $str13$cdolist = makeString( "cdolist" );
    $kw14$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym15$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym16$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym17$_ = makeSymbol( ">" );
    $sym18$PROBLEM_STORE_CREATION_TIME = makeSymbol( "PROBLEM-STORE-CREATION-TIME" );
    $str19$Destroying_ = makeString( "Destroying " );
    $str20$_problem_stores__all_but_the_last = makeString( " problem stores (all but the last " );
    $str21$_ = makeString( ")" );
    $sym22$PROBLEM_STORE = makeSymbol( "PROBLEM-STORE" );
    $sym23$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $list24 = ConsesLow.list( new SubLObject[] { makeSymbol( "GUID" ), makeSymbol( "SUID" ), makeSymbol( "LOCK" ), makeSymbol( "CREATION-TIME" ), makeSymbol( "INFERENCE-ID-INDEX" ), makeSymbol( "STRATEGY-ID-INDEX" ),
      makeSymbol( "PROBLEM-ID-INDEX" ), makeSymbol( "LINK-ID-INDEX" ), makeSymbol( "PROOF-ID-INDEX" ), makeSymbol( "PROBLEMS-BY-QUERY-INDEX" ), makeSymbol( "REJECTED-PROOFS" ), makeSymbol( "PROCESSED-PROOFS" ),
      makeSymbol( "POTENTIALLY-PROCESSED-PROBLEMS" ), makeSymbol( "NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" ), makeSymbol( "NON-EXPLANATORY-SUBPROOFS-INDEX" ), makeSymbol( "MOST-RECENT-TACTIC-EXECUTED" ), makeSymbol(
          "MIN-PROOF-DEPTH-INDEX" ), makeSymbol( "MIN-TRANSFORMATION-DEPTH-INDEX" ), makeSymbol( "MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" ), makeSymbol( "MIN-DEPTH-INDEX" ), makeSymbol( "EQUALITY-REASONING-METHOD" ),
      makeSymbol( "EQUALITY-REASONING-DOMAIN" ), makeSymbol( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeSymbol( "MAX-PROBLEM-COUNT" ), makeSymbol( "CRAZY-MAX-PROBLEM-COUNT" ), makeSymbol( "REMOVAL-ALLOWED?" ),
      makeSymbol( "TRANSFORMATION-ALLOWED?" ), makeSymbol( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), makeSymbol( "NEGATION-BY-FAILURE?" ), makeSymbol( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeSymbol( "DIRECTION" ),
      makeSymbol( "EVALUATE-SUBL-ALLOWED?" ), makeSymbol( "REWRITE-ALLOWED?" ), makeSymbol( "ABDUCTION-ALLOWED?" ), makeSymbol( "NEW-TERMS-ALLOWED?" ), makeSymbol( "COMPUTE-ANSWER-JUSTIFICATIONS?" ), makeSymbol(
          "MEMOIZATION-STATE" ), makeSymbol( "SBHL-RESOURCE-SPACE" ), makeSymbol( "PREPARED?" ), makeSymbol( "DESTRUCTION-IMMINENT?" ), makeSymbol( "META-PROBLEM-STORE" ), makeSymbol( "STATIC-PROPERTIES" ), makeSymbol(
              "JANITOR" ), makeSymbol( "HISTORICAL-ROOT-PROBLEMS" ), makeSymbol( "HISTORICAL-TACTIC-COUNT" ), makeSymbol( "COMPLEX-PROBLEM-QUERY-CZER-INDEX" ), makeSymbol( "COMPLEX-PROBLEM-QUERY-SIGNATURES" ),
      makeSymbol( "PROOF-KEEPING-INDEX" )
    } );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "GUID" ), makeKeyword( "SUID" ), makeKeyword( "LOCK" ), makeKeyword( "CREATION-TIME" ), makeKeyword( "INFERENCE-ID-INDEX" ), makeKeyword(
        "STRATEGY-ID-INDEX" ), makeKeyword( "PROBLEM-ID-INDEX" ), makeKeyword( "LINK-ID-INDEX" ), makeKeyword( "PROOF-ID-INDEX" ), makeKeyword( "PROBLEMS-BY-QUERY-INDEX" ), makeKeyword( "REJECTED-PROOFS" ), makeKeyword(
            "PROCESSED-PROOFS" ), makeKeyword( "POTENTIALLY-PROCESSED-PROBLEMS" ), makeKeyword( "NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" ), makeKeyword( "NON-EXPLANATORY-SUBPROOFS-INDEX" ), makeKeyword(
                "MOST-RECENT-TACTIC-EXECUTED" ), makeKeyword( "MIN-PROOF-DEPTH-INDEX" ), makeKeyword( "MIN-TRANSFORMATION-DEPTH-INDEX" ), makeKeyword( "MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" ), makeKeyword(
                    "MIN-DEPTH-INDEX" ), makeKeyword( "EQUALITY-REASONING-METHOD" ), makeKeyword( "EQUALITY-REASONING-DOMAIN" ), makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MAX-PROBLEM-COUNT" ),
      makeKeyword( "CRAZY-MAX-PROBLEM-COUNT" ), makeKeyword( "REMOVAL-ALLOWED?" ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), makeKeyword( "NEGATION-BY-FAILURE?" ),
      makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeKeyword( "DIRECTION" ), makeKeyword( "EVALUATE-SUBL-ALLOWED?" ), makeKeyword( "REWRITE-ALLOWED?" ), makeKeyword( "ABDUCTION-ALLOWED?" ), makeKeyword(
          "NEW-TERMS-ALLOWED?" ), makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" ), makeKeyword( "MEMOIZATION-STATE" ), makeKeyword( "SBHL-RESOURCE-SPACE" ), makeKeyword( "PREPARED?" ), makeKeyword(
              "DESTRUCTION-IMMINENT?" ), makeKeyword( "META-PROBLEM-STORE" ), makeKeyword( "STATIC-PROPERTIES" ), makeKeyword( "JANITOR" ), makeKeyword( "HISTORICAL-ROOT-PROBLEMS" ), makeKeyword(
                  "HISTORICAL-TACTIC-COUNT" ), makeKeyword( "COMPLEX-PROBLEM-QUERY-CZER-INDEX" ), makeKeyword( "COMPLEX-PROBLEM-QUERY-SIGNATURES" ), makeKeyword( "PROOF-KEEPING-INDEX" )
    } );
    $list26 = ConsesLow.list( new SubLObject[] { makeSymbol( "PROB-STORE-GUID" ), makeSymbol( "PROB-STORE-SUID" ), makeSymbol( "PROB-STORE-LOCK" ), makeSymbol( "PROB-STORE-CREATION-TIME" ), makeSymbol(
        "PROB-STORE-INFERENCE-ID-INDEX" ), makeSymbol( "PROB-STORE-STRATEGY-ID-INDEX" ), makeSymbol( "PROB-STORE-PROBLEM-ID-INDEX" ), makeSymbol( "PROB-STORE-LINK-ID-INDEX" ), makeSymbol( "PROB-STORE-PROOF-ID-INDEX" ),
      makeSymbol( "PROB-STORE-PROBLEMS-BY-QUERY-INDEX" ), makeSymbol( "PROB-STORE-REJECTED-PROOFS" ), makeSymbol( "PROB-STORE-PROCESSED-PROOFS" ), makeSymbol( "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS" ), makeSymbol(
          "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" ), makeSymbol( "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX" ), makeSymbol( "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED" ), makeSymbol(
              "PROB-STORE-MIN-PROOF-DEPTH-INDEX" ), makeSymbol( "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX" ), makeSymbol( "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" ), makeSymbol(
                  "PROB-STORE-MIN-DEPTH-INDEX" ), makeSymbol( "PROB-STORE-EQUALITY-REASONING-METHOD" ), makeSymbol( "PROB-STORE-EQUALITY-REASONING-DOMAIN" ), makeSymbol( "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL" ),
      makeSymbol( "PROB-STORE-MAX-PROBLEM-COUNT" ), makeSymbol( "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT" ), makeSymbol( "PROB-STORE-REMOVAL-ALLOWED?" ), makeSymbol( "PROB-STORE-TRANSFORMATION-ALLOWED?" ), makeSymbol(
          "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), makeSymbol( "PROB-STORE-NEGATION-BY-FAILURE?" ), makeSymbol( "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeSymbol( "PROB-STORE-DIRECTION" ),
      makeSymbol( "PROB-STORE-EVALUATE-SUBL-ALLOWED?" ), makeSymbol( "PROB-STORE-REWRITE-ALLOWED?" ), makeSymbol( "PROB-STORE-ABDUCTION-ALLOWED?" ), makeSymbol( "PROB-STORE-NEW-TERMS-ALLOWED?" ), makeSymbol(
          "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?" ), makeSymbol( "PROB-STORE-MEMOIZATION-STATE" ), makeSymbol( "PROB-STORE-SBHL-RESOURCE-SPACE" ), makeSymbol( "PROB-STORE-PREPARED?" ), makeSymbol(
              "PROB-STORE-DESTRUCTION-IMMINENT?" ), makeSymbol( "PROB-STORE-META-PROBLEM-STORE" ), makeSymbol( "PROB-STORE-STATIC-PROPERTIES" ), makeSymbol( "PROB-STORE-JANITOR" ), makeSymbol(
                  "PROB-STORE-HISTORICAL-ROOT-PROBLEMS" ), makeSymbol( "PROB-STORE-HISTORICAL-TACTIC-COUNT" ), makeSymbol( "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX" ), makeSymbol(
                      "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES" ), makeSymbol( "PROB-STORE-PROOF-KEEPING-INDEX" )
    } );
    $list27 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-PROB-STORE-GUID" ), makeSymbol( "_CSETF-PROB-STORE-SUID" ), makeSymbol( "_CSETF-PROB-STORE-LOCK" ), makeSymbol( "_CSETF-PROB-STORE-CREATION-TIME" ),
      makeSymbol( "_CSETF-PROB-STORE-INFERENCE-ID-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-STRATEGY-ID-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-PROBLEM-ID-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-LINK-ID-INDEX" ),
      makeSymbol( "_CSETF-PROB-STORE-PROOF-ID-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-REJECTED-PROOFS" ), makeSymbol( "_CSETF-PROB-STORE-PROCESSED-PROOFS" ),
      makeSymbol( "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS" ), makeSymbol( "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" ), makeSymbol( "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX" ),
      makeSymbol( "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED" ), makeSymbol( "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX" ), makeSymbol(
          "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-MIN-DEPTH-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD" ), makeSymbol(
              "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN" ), makeSymbol( "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeSymbol( "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT" ), makeSymbol(
                  "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT" ), makeSymbol( "_CSETF-PROB-STORE-REMOVAL-ALLOWED?" ), makeSymbol( "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?" ), makeSymbol(
                      "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), makeSymbol( "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?" ), makeSymbol( "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeSymbol(
                          "_CSETF-PROB-STORE-DIRECTION" ), makeSymbol( "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?" ), makeSymbol( "_CSETF-PROB-STORE-REWRITE-ALLOWED?" ), makeSymbol(
                              "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?" ), makeSymbol( "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?" ), makeSymbol( "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?" ), makeSymbol(
                                  "_CSETF-PROB-STORE-MEMOIZATION-STATE" ), makeSymbol( "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE" ), makeSymbol( "_CSETF-PROB-STORE-PREPARED?" ), makeSymbol(
                                      "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?" ), makeSymbol( "_CSETF-PROB-STORE-META-PROBLEM-STORE" ), makeSymbol( "_CSETF-PROB-STORE-STATIC-PROPERTIES" ), makeSymbol(
                                          "_CSETF-PROB-STORE-JANITOR" ), makeSymbol( "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS" ), makeSymbol( "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT" ), makeSymbol(
                                              "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX" ), makeSymbol( "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES" ), makeSymbol(
                                                  "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX" )
    } );
    $sym28$PRINT_PROBLEM_STORE = makeSymbol( "PRINT-PROBLEM-STORE" );
    $int29$21 = makeInteger( 21 );
    $int30$22 = makeInteger( 22 );
    $int31$23 = makeInteger( 23 );
    $int32$24 = makeInteger( 24 );
    $int33$25 = makeInteger( 25 );
    $int34$26 = makeInteger( 26 );
    $int35$27 = makeInteger( 27 );
    $int36$28 = makeInteger( 28 );
    $int37$29 = makeInteger( 29 );
    $int38$30 = makeInteger( 30 );
    $int39$31 = makeInteger( 31 );
    $int40$32 = makeInteger( 32 );
    $int41$33 = makeInteger( 33 );
    $int42$34 = makeInteger( 34 );
    $int43$35 = makeInteger( 35 );
    $int44$36 = makeInteger( 36 );
    $int45$37 = makeInteger( 37 );
    $int46$38 = makeInteger( 38 );
    $int47$39 = makeInteger( 39 );
    $int48$40 = makeInteger( 40 );
    $int49$41 = makeInteger( 41 );
    $int50$42 = makeInteger( 42 );
    $int51$43 = makeInteger( 43 );
    $int52$44 = makeInteger( 44 );
    $int53$45 = makeInteger( 45 );
    $int54$46 = makeInteger( 46 );
    $int55$47 = makeInteger( 47 );
    $int56$48 = makeInteger( 48 );
    $int57$49 = makeInteger( 49 );
    $sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE" );
    $list59 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROBLEM-STORE-P" ) );
    $sym60$PROB_STORE_GUID = makeSymbol( "PROB-STORE-GUID" );
    $sym61$_CSETF_PROB_STORE_GUID = makeSymbol( "_CSETF-PROB-STORE-GUID" );
    $sym62$PROB_STORE_SUID = makeSymbol( "PROB-STORE-SUID" );
    $sym63$_CSETF_PROB_STORE_SUID = makeSymbol( "_CSETF-PROB-STORE-SUID" );
    $sym64$PROB_STORE_LOCK = makeSymbol( "PROB-STORE-LOCK" );
    $sym65$_CSETF_PROB_STORE_LOCK = makeSymbol( "_CSETF-PROB-STORE-LOCK" );
    $sym66$PROB_STORE_CREATION_TIME = makeSymbol( "PROB-STORE-CREATION-TIME" );
    $sym67$_CSETF_PROB_STORE_CREATION_TIME = makeSymbol( "_CSETF-PROB-STORE-CREATION-TIME" );
    $sym68$PROB_STORE_INFERENCE_ID_INDEX = makeSymbol( "PROB-STORE-INFERENCE-ID-INDEX" );
    $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX = makeSymbol( "_CSETF-PROB-STORE-INFERENCE-ID-INDEX" );
    $sym70$PROB_STORE_STRATEGY_ID_INDEX = makeSymbol( "PROB-STORE-STRATEGY-ID-INDEX" );
    $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX = makeSymbol( "_CSETF-PROB-STORE-STRATEGY-ID-INDEX" );
    $sym72$PROB_STORE_PROBLEM_ID_INDEX = makeSymbol( "PROB-STORE-PROBLEM-ID-INDEX" );
    $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX = makeSymbol( "_CSETF-PROB-STORE-PROBLEM-ID-INDEX" );
    $sym74$PROB_STORE_LINK_ID_INDEX = makeSymbol( "PROB-STORE-LINK-ID-INDEX" );
    $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX = makeSymbol( "_CSETF-PROB-STORE-LINK-ID-INDEX" );
    $sym76$PROB_STORE_PROOF_ID_INDEX = makeSymbol( "PROB-STORE-PROOF-ID-INDEX" );
    $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX = makeSymbol( "_CSETF-PROB-STORE-PROOF-ID-INDEX" );
    $sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol( "PROB-STORE-PROBLEMS-BY-QUERY-INDEX" );
    $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol( "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX" );
    $sym80$PROB_STORE_REJECTED_PROOFS = makeSymbol( "PROB-STORE-REJECTED-PROOFS" );
    $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS = makeSymbol( "_CSETF-PROB-STORE-REJECTED-PROOFS" );
    $sym82$PROB_STORE_PROCESSED_PROOFS = makeSymbol( "PROB-STORE-PROCESSED-PROOFS" );
    $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS = makeSymbol( "_CSETF-PROB-STORE-PROCESSED-PROOFS" );
    $sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol( "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS" );
    $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol( "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS" );
    $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol( "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" );
    $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol( "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" );
    $sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol( "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX" );
    $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol( "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX" );
    $sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol( "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED" );
    $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol( "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED" );
    $sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol( "PROB-STORE-MIN-PROOF-DEPTH-INDEX" );
    $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol( "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX" );
    $sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol( "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX" );
    $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol( "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX" );
    $sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol( "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" );
    $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol( "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" );
    $sym98$PROB_STORE_MIN_DEPTH_INDEX = makeSymbol( "PROB-STORE-MIN-DEPTH-INDEX" );
    $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX = makeSymbol( "_CSETF-PROB-STORE-MIN-DEPTH-INDEX" );
    $sym100$PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol( "PROB-STORE-EQUALITY-REASONING-METHOD" );
    $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol( "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD" );
    $sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol( "PROB-STORE-EQUALITY-REASONING-DOMAIN" );
    $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol( "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN" );
    $sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol( "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol( "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $sym106$PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol( "PROB-STORE-MAX-PROBLEM-COUNT" );
    $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol( "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT" );
    $sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol( "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT" );
    $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol( "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT" );
    $sym110$PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol( "PROB-STORE-REMOVAL-ALLOWED?" );
    $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-REMOVAL-ALLOWED?" );
    $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol( "PROB-STORE-TRANSFORMATION-ALLOWED?" );
    $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?" );
    $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol( "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol( "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $sym116$PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol( "PROB-STORE-NEGATION-BY-FAILURE?" );
    $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol( "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?" );
    $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol( "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $sym120$PROB_STORE_DIRECTION = makeSymbol( "PROB-STORE-DIRECTION" );
    $sym121$_CSETF_PROB_STORE_DIRECTION = makeSymbol( "_CSETF-PROB-STORE-DIRECTION" );
    $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol( "PROB-STORE-EVALUATE-SUBL-ALLOWED?" );
    $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?" );
    $sym124$PROB_STORE_REWRITE_ALLOWED_ = makeSymbol( "PROB-STORE-REWRITE-ALLOWED?" );
    $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-REWRITE-ALLOWED?" );
    $sym126$PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol( "PROB-STORE-ABDUCTION-ALLOWED?" );
    $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?" );
    $sym128$PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol( "PROB-STORE-NEW-TERMS-ALLOWED?" );
    $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol( "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?" );
    $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol( "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol( "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $sym132$PROB_STORE_MEMOIZATION_STATE = makeSymbol( "PROB-STORE-MEMOIZATION-STATE" );
    $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE = makeSymbol( "_CSETF-PROB-STORE-MEMOIZATION-STATE" );
    $sym134$PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol( "PROB-STORE-SBHL-RESOURCE-SPACE" );
    $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol( "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE" );
    $sym136$PROB_STORE_PREPARED_ = makeSymbol( "PROB-STORE-PREPARED?" );
    $sym137$_CSETF_PROB_STORE_PREPARED_ = makeSymbol( "_CSETF-PROB-STORE-PREPARED?" );
    $sym138$PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol( "PROB-STORE-DESTRUCTION-IMMINENT?" );
    $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol( "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?" );
    $sym140$PROB_STORE_META_PROBLEM_STORE = makeSymbol( "PROB-STORE-META-PROBLEM-STORE" );
    $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE = makeSymbol( "_CSETF-PROB-STORE-META-PROBLEM-STORE" );
    $sym142$PROB_STORE_STATIC_PROPERTIES = makeSymbol( "PROB-STORE-STATIC-PROPERTIES" );
    $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES = makeSymbol( "_CSETF-PROB-STORE-STATIC-PROPERTIES" );
    $sym144$PROB_STORE_JANITOR = makeSymbol( "PROB-STORE-JANITOR" );
    $sym145$_CSETF_PROB_STORE_JANITOR = makeSymbol( "_CSETF-PROB-STORE-JANITOR" );
    $sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol( "PROB-STORE-HISTORICAL-ROOT-PROBLEMS" );
    $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol( "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS" );
    $sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol( "PROB-STORE-HISTORICAL-TACTIC-COUNT" );
    $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol( "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT" );
    $sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol( "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX" );
    $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol( "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX" );
    $sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol( "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES" );
    $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol( "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES" );
    $sym154$PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol( "PROB-STORE-PROOF-KEEPING-INDEX" );
    $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol( "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX" );
    $kw156$GUID = makeKeyword( "GUID" );
    $kw157$SUID = makeKeyword( "SUID" );
    $kw158$LOCK = makeKeyword( "LOCK" );
    $kw159$CREATION_TIME = makeKeyword( "CREATION-TIME" );
    $kw160$INFERENCE_ID_INDEX = makeKeyword( "INFERENCE-ID-INDEX" );
    $kw161$STRATEGY_ID_INDEX = makeKeyword( "STRATEGY-ID-INDEX" );
    $kw162$PROBLEM_ID_INDEX = makeKeyword( "PROBLEM-ID-INDEX" );
    $kw163$LINK_ID_INDEX = makeKeyword( "LINK-ID-INDEX" );
    $kw164$PROOF_ID_INDEX = makeKeyword( "PROOF-ID-INDEX" );
    $kw165$PROBLEMS_BY_QUERY_INDEX = makeKeyword( "PROBLEMS-BY-QUERY-INDEX" );
    $kw166$REJECTED_PROOFS = makeKeyword( "REJECTED-PROOFS" );
    $kw167$PROCESSED_PROOFS = makeKeyword( "PROCESSED-PROOFS" );
    $kw168$POTENTIALLY_PROCESSED_PROBLEMS = makeKeyword( "POTENTIALLY-PROCESSED-PROBLEMS" );
    $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeKeyword( "NON-EXPLANATORY-SUBPROOFS-POSSIBLE?" );
    $kw170$NON_EXPLANATORY_SUBPROOFS_INDEX = makeKeyword( "NON-EXPLANATORY-SUBPROOFS-INDEX" );
    $kw171$MOST_RECENT_TACTIC_EXECUTED = makeKeyword( "MOST-RECENT-TACTIC-EXECUTED" );
    $kw172$MIN_PROOF_DEPTH_INDEX = makeKeyword( "MIN-PROOF-DEPTH-INDEX" );
    $kw173$MIN_TRANSFORMATION_DEPTH_INDEX = makeKeyword( "MIN-TRANSFORMATION-DEPTH-INDEX" );
    $kw174$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeKeyword( "MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX" );
    $kw175$MIN_DEPTH_INDEX = makeKeyword( "MIN-DEPTH-INDEX" );
    $kw176$EQUALITY_REASONING_METHOD = makeKeyword( "EQUALITY-REASONING-METHOD" );
    $kw177$EQUALITY_REASONING_DOMAIN = makeKeyword( "EQUALITY-REASONING-DOMAIN" );
    $kw178$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw179$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $kw180$CRAZY_MAX_PROBLEM_COUNT = makeKeyword( "CRAZY-MAX-PROBLEM-COUNT" );
    $kw181$REMOVAL_ALLOWED_ = makeKeyword( "REMOVAL-ALLOWED?" );
    $kw182$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw184$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw186$DIRECTION = makeKeyword( "DIRECTION" );
    $kw187$EVALUATE_SUBL_ALLOWED_ = makeKeyword( "EVALUATE-SUBL-ALLOWED?" );
    $kw188$REWRITE_ALLOWED_ = makeKeyword( "REWRITE-ALLOWED?" );
    $kw189$ABDUCTION_ALLOWED_ = makeKeyword( "ABDUCTION-ALLOWED?" );
    $kw190$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw192$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $kw193$SBHL_RESOURCE_SPACE = makeKeyword( "SBHL-RESOURCE-SPACE" );
    $kw194$PREPARED_ = makeKeyword( "PREPARED?" );
    $kw195$DESTRUCTION_IMMINENT_ = makeKeyword( "DESTRUCTION-IMMINENT?" );
    $kw196$META_PROBLEM_STORE = makeKeyword( "META-PROBLEM-STORE" );
    $kw197$STATIC_PROPERTIES = makeKeyword( "STATIC-PROPERTIES" );
    $kw198$JANITOR = makeKeyword( "JANITOR" );
    $kw199$HISTORICAL_ROOT_PROBLEMS = makeKeyword( "HISTORICAL-ROOT-PROBLEMS" );
    $kw200$HISTORICAL_TACTIC_COUNT = makeKeyword( "HISTORICAL-TACTIC-COUNT" );
    $kw201$COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeKeyword( "COMPLEX-PROBLEM-QUERY-CZER-INDEX" );
    $kw202$COMPLEX_PROBLEM_QUERY_SIGNATURES = makeKeyword( "COMPLEX-PROBLEM-QUERY-SIGNATURES" );
    $kw203$PROOF_KEEPING_INDEX = makeKeyword( "PROOF-KEEPING-INDEX" );
    $str204$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw205$BEGIN = makeKeyword( "BEGIN" );
    $sym206$MAKE_PROBLEM_STORE = makeSymbol( "MAKE-PROBLEM-STORE" );
    $kw207$SLOT = makeKeyword( "SLOT" );
    $kw208$END = makeKeyword( "END" );
    $sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD" );
    $kw210$FREE = makeKeyword( "FREE" );
    $str211$_Invalid_PROBLEM_STORE__s_ = makeString( "<Invalid PROBLEM STORE ~s>" );
    $str212$_PROBLEM_STORE__a_size__a_ = makeString( "<PROBLEM STORE ~a size=~a>" );
    $sym213$SXHASH_PROBLEM_STORE_METHOD = makeSymbol( "SXHASH-PROBLEM-STORE-METHOD" );
    $list214 = ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym215$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym216$PROBLEM_STORE_LOCK = makeSymbol( "PROBLEM-STORE-LOCK" );
    $sym217$WITH_PROBLEM_STORE_LOCK_HELD = makeSymbol( "WITH-PROBLEM-STORE-LOCK-HELD" );
    $list218 = ConsesLow.list( ConsesLow.list( makeSymbol( "STORE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym219$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym220$PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol( "PROBLEM-STORE-MEMOIZATION-STATE" );
    $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol( "WITH-PROBLEM-STORE-MEMOIZATION-STATE" );
    $sym222$SPACE_VAR = makeUninternedSymbol( "SPACE-VAR" );
    $sym223$CLET = makeSymbol( "CLET" );
    $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol( "PROBLEM-STORE-SBHL-RESOURCE-SPACE" );
    $sym225$WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol( "WITH-SBHL-MARKING-SPACE-RESOURCE" );
    $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol( "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE" );
    $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol( "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE" );
    $sym228$STORE_VAR = makeUninternedSymbol( "STORE-VAR" );
    $list229 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym230$ID = makeUninternedSymbol( "ID" );
    $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX = makeSymbol( "PROBLEM-STORE-INFERENCE-ID-INDEX" );
    $sym232$DO_PROBLEM_STORE_INFERENCES = makeSymbol( "DO-PROBLEM-STORE-INFERENCES" );
    $list233 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRATEGY-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym234$ID = makeUninternedSymbol( "ID" );
    $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX = makeSymbol( "PROBLEM-STORE-STRATEGY-ID-INDEX" );
    $sym236$DO_PROBLEM_STORE_STRATEGIES = makeSymbol( "DO-PROBLEM-STORE-STRATEGIES" );
    $list237 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRATEGIC-CONTEXT-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym238$PUNLESS = makeSymbol( "PUNLESS" );
    $list239 = ConsesLow.list( makeKeyword( "TACTICAL" ) );
    $list240 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "ORDERED" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list241 = ConsesLow.list( makeKeyword( "ORDERED" ), makeKeyword( "DONE" ) );
    $kw242$ORDERED = makeKeyword( "ORDERED" );
    $sym243$ID = makeUninternedSymbol( "ID" );
    $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX = makeSymbol( "PROBLEM-STORE-PROBLEM-ID-INDEX" );
    $sym245$DO_PROBLEM_STORE_PROBLEMS = makeSymbol( "DO-PROBLEM-STORE-PROBLEMS" );
    $list246 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "ORDERED" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list247 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "ORDERED" ), makeKeyword( "DONE" ) );
    $kw248$TYPE = makeKeyword( "TYPE" );
    $sym249$ID = makeUninternedSymbol( "ID" );
    $sym250$PROBLEM_STORE_LINK_ID_INDEX = makeSymbol( "PROBLEM-STORE-LINK-ID-INDEX" );
    $sym251$DO_PROBLEM_STORE_LINKS = makeSymbol( "DO-PROBLEM-STORE-LINKS" );
    $sym252$PWHEN = makeSymbol( "PWHEN" );
    $sym253$PROBLEM_LINK_HAS_TYPE_ = makeSymbol( "PROBLEM-LINK-HAS-TYPE?" );
    $list254 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "PROOF-STATUS" ), makeSymbol( "ORDERED" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list255 = ConsesLow.list( makeKeyword( "PROOF-STATUS" ), makeKeyword( "ORDERED" ), makeKeyword( "DONE" ) );
    $kw256$PROOF_STATUS = makeKeyword( "PROOF-STATUS" );
    $sym257$ID = makeUninternedSymbol( "ID" );
    $sym258$PROBLEM_STORE_PROOF_ID_INDEX = makeSymbol( "PROBLEM-STORE-PROOF-ID-INDEX" );
    $sym259$DO_PROBLEM_STORE_PROOFS = makeSymbol( "DO-PROBLEM-STORE-PROOFS" );
    $sym260$PROOF_HAS_STATUS_ = makeSymbol( "PROOF-HAS-STATUS?" );
    $list261 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-VAR" ), makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym262$DO_SET = makeSymbol( "DO-SET" );
    $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol( "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS" );
    $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol( "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS" );
    $list265 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRATEGY-VAR" ), makeSymbol( "INFERENCE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym266$INFERENCE_VAR = makeUninternedSymbol( "INFERENCE-VAR" );
    $sym267$INFERENCE_STRATEGY_SET = makeSymbol( "INFERENCE-STRATEGY-SET" );
    $int268$80 = makeInteger( 80 );
    $int269$120 = makeInteger( 120 );
    $sym270$PROBLEM_STORE_PROPERTIES_P = makeSymbol( "PROBLEM-STORE-PROPERTIES-P" );
    $sym271$PROBLEM_STORE_NAME_P = makeSymbol( "PROBLEM-STORE-NAME-P" );
    $str272$A_problem_store_named__s_already_ = makeString( "A problem store named ~s already exists." );
    $str273$Problem_Store_Lock = makeString( "Problem Store Lock" );
    $sym274$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P = makeSymbol( "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P" );
    $sym275$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P = makeSymbol( "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P" );
    $kw276$NONE = makeKeyword( "NONE" );
    $kw277$EMPTY_DOMAIN = makeKeyword( "EMPTY-DOMAIN" );
    $sym278$INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol( "INTERMEDIATE-STEP-VALIDATION-LEVEL-P" );
    $sym279$MAX_PROBLEM_COUNT_P = makeSymbol( "MAX-PROBLEM-COUNT-P" );
    $sym280$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym281$INFERENCE_DIRECTION_P = makeSymbol( "INFERENCE-DIRECTION-P" );
    $str282$problem_store_memoization_state = makeString( "problem store memoization state" );
    $str283$problem_store_memoization_lock = makeString( "problem store memoization lock" );
    $str284$Destroying_problem_store__S_at_le = makeString( "Destroying problem store ~S at least one running inference ~S" );
    $kw285$SKIP = makeKeyword( "SKIP" );
    $sym286$TACTIC_P = makeSymbol( "TACTIC-P" );
    $sym287$NEW_PROBLEM_STORE_P = makeSymbol( "NEW-PROBLEM-STORE-P" );
    $kw288$FORWARD = makeKeyword( "FORWARD" );
    $kw289$MOTIVATING_TACTIC = makeKeyword( "MOTIVATING-TACTIC" );
    $kw290$TACTICAL = makeKeyword( "TACTICAL" );
    $kw291$CONTENT = makeKeyword( "CONTENT" );
    $kw292$ANSWER = makeKeyword( "ANSWER" );
    $kw293$REMOVAL = makeKeyword( "REMOVAL" );
    $kw294$REMOVAL_CONJUNCTIVE = makeKeyword( "REMOVAL-CONJUNCTIVE" );
    $kw295$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $kw296$REWRITE = makeKeyword( "REWRITE" );
    $kw297$STRUCTURAL = makeKeyword( "STRUCTURAL" );
    $kw298$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $kw299$JOIN = makeKeyword( "JOIN" );
    $kw300$SPLIT = makeKeyword( "SPLIT" );
    $kw301$RESTRICTION = makeKeyword( "RESTRICTION" );
    $kw302$RESIDUAL_TRANSFORMATION = makeKeyword( "RESIDUAL-TRANSFORMATION" );
    $kw303$UNION = makeKeyword( "UNION" );
    $int304$212 = makeInteger( 212 );
    $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT = makeSymbol( "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT" );
    $kw306$POSSIBLE = makeKeyword( "POSSIBLE" );
    $kw307$EXECUTED = makeKeyword( "EXECUTED" );
    $kw308$DISCARDED = makeKeyword( "DISCARDED" );
    $sym309$_ = makeSymbol( "<" );
    $sym310$PROOF_SUID = makeSymbol( "PROOF-SUID" );
    $sym311$PROBLEM_SUID = makeSymbol( "PROBLEM-SUID" );
    $sym312$PROBLEM_STORE_SIZE = makeSymbol( "PROBLEM-STORE-SIZE" );
    $sym313$PROBLEM_LINK_SUID = makeSymbol( "PROBLEM-LINK-SUID" );
    $kw314$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $kw315$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw316$NON_PROOF_KEEPING = makeKeyword( "NON-PROOF-KEEPING" );
    $list317 = ConsesLow.list( makeKeyword( "NON-PROOF-KEEPING" ), makeKeyword( "UNKNOWN" ) );
    $str318$Invalid_proof_keeping_reason__a_f = makeString( "Invalid proof-keeping reason ~a for problem ~a" );
    $sym319$PROOF_REJECTED_ = makeSymbol( "PROOF-REJECTED?" );
    $sym320$PROOF_P = makeSymbol( "PROOF-P" );
    $sym321$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED = makeSymbol( "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED" );
    $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED = makeSymbol( "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED" );
    $int324$100 = makeInteger( 100 );
    $sym325$PROBLEM_STORE_JANITOR = makeSymbol( "PROBLEM-STORE-JANITOR" );
    $sym326$PROBLEM_STORE_JANITOR_P = makeSymbol( "PROBLEM-STORE-JANITOR-P" );
    $list327 = ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "INDESTRUCTIBLE-PROBLEMS" ), makeSymbol( "STALE?" ) );
    $list328 = ConsesLow.list( makeKeyword( "STORE" ), makeKeyword( "INDESTRUCTIBLE-PROBLEMS" ), makeKeyword( "STALE?" ) );
    $list329 = ConsesLow.list( makeSymbol( "PROB-STORE-JANITOR-STORE" ), makeSymbol( "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" ), makeSymbol( "PROB-STORE-JANITOR-STALE?" ) );
    $list330 = ConsesLow.list( makeSymbol( "_CSETF-PROB-STORE-JANITOR-STORE" ), makeSymbol( "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" ), makeSymbol( "_CSETF-PROB-STORE-JANITOR-STALE?" ) );
    $sym331$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list333 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROBLEM-STORE-JANITOR-P" ) );
    $sym334$PROB_STORE_JANITOR_STORE = makeSymbol( "PROB-STORE-JANITOR-STORE" );
    $sym335$_CSETF_PROB_STORE_JANITOR_STORE = makeSymbol( "_CSETF-PROB-STORE-JANITOR-STORE" );
    $sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol( "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" );
    $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol( "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" );
    $sym338$PROB_STORE_JANITOR_STALE_ = makeSymbol( "PROB-STORE-JANITOR-STALE?" );
    $sym339$_CSETF_PROB_STORE_JANITOR_STALE_ = makeSymbol( "_CSETF-PROB-STORE-JANITOR-STALE?" );
    $kw340$STORE = makeKeyword( "STORE" );
    $kw341$INDESTRUCTIBLE_PROBLEMS = makeKeyword( "INDESTRUCTIBLE-PROBLEMS" );
    $kw342$STALE_ = makeKeyword( "STALE?" );
    $sym343$MAKE_PROBLEM_STORE_JANITOR = makeSymbol( "MAKE-PROBLEM-STORE-JANITOR" );
    $sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD" );
    $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol( "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" );
    $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol( "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS" );
    $list347 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-VAR" ), makeSymbol( "JANITOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym348$PROBLEM_STORE_JANITOR_STORE = makeSymbol( "PROBLEM-STORE-JANITOR-STORE" );
    $sym349$PROBLEM_DESTRUCTIBLE_ = makeSymbol( "PROBLEM-DESTRUCTIBLE?" );
    $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_ = makeSymbol( "*PROBLEM-STORE-ID-TO-NAME-TABLE*" );
    $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_ = makeSymbol( "*PROBLEM-STORE-NAME-TO-ID-TABLE*" );
    $sym352$FIND_PROBLEM_STORE_BY_NAME = makeSymbol( "FIND-PROBLEM-STORE-BY-NAME" );
    $sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME = makeSymbol( "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME" );
    $kw354$PROBLEM_STORE_NAME = makeKeyword( "PROBLEM-STORE-NAME" );
    $sym355$DESTROY_PROBLEM_STORE_BY_NAME = makeSymbol( "DESTROY-PROBLEM-STORE-BY-NAME" );
    $sym356$PROBLEM_STORE_PROPERTY_P = makeSymbol( "PROBLEM-STORE-PROPERTY-P" );
    $str357$Problem_store_property__S_reflect = makeString( "Problem store property ~S reflection is not yet supported" );
    $int358$50 = makeInteger( 50 );
    $sym359$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT = makeSymbol( "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT" );
    $kw361$TEST = makeKeyword( "TEST" );
    $kw362$OWNER = makeKeyword( "OWNER" );
    $kw363$CLASSES = makeKeyword( "CLASSES" );
    $kw364$KB = makeKeyword( "KB" );
    $kw365$TINY = makeKeyword( "TINY" );
    $kw366$WORKING_ = makeKeyword( "WORKING?" );
    $list367 = ConsesLow.list( ConsesLow.list( NIL, NIL ) );
  }

  public static final class $problem_store_native
      extends
        SubLStructNative
  {
    public SubLObject $guid;
    public SubLObject $suid;
    public SubLObject $lock;
    public SubLObject $creation_time;
    public SubLObject $inference_id_index;
    public SubLObject $strategy_id_index;
    public SubLObject $problem_id_index;
    public SubLObject $link_id_index;
    public SubLObject $proof_id_index;
    public SubLObject $problems_by_query_index;
    public SubLObject $rejected_proofs;
    public SubLObject $processed_proofs;
    public SubLObject $potentially_processed_problems;
    public SubLObject $non_explanatory_subproofs_possibleP;
    public SubLObject $non_explanatory_subproofs_index;
    public SubLObject $most_recent_tactic_executed;
    public SubLObject $min_proof_depth_index;
    public SubLObject $min_transformation_depth_index;
    public SubLObject $min_transformation_depth_signature_index;
    public SubLObject $min_depth_index;
    public SubLObject $equality_reasoning_method;
    public SubLObject $equality_reasoning_domain;
    public SubLObject $intermediate_step_validation_level;
    public SubLObject $max_problem_count;
    public SubLObject $crazy_max_problem_count;
    public SubLObject $removal_allowedP;
    public SubLObject $transformation_allowedP;
    public SubLObject $add_restriction_layer_of_indirectionP;
    public SubLObject $negation_by_failureP;
    public SubLObject $completeness_minimization_allowedP;
    public SubLObject $direction;
    public SubLObject $evaluate_subl_allowedP;
    public SubLObject $rewrite_allowedP;
    public SubLObject $abduction_allowedP;
    public SubLObject $new_terms_allowedP;
    public SubLObject $compute_answer_justificationsP;
    public SubLObject $memoization_state;
    public SubLObject $sbhl_resource_space;
    public SubLObject $preparedP;
    public SubLObject $destruction_imminentP;
    public SubLObject $meta_problem_store;
    public SubLObject $static_properties;
    public SubLObject $janitor;
    public SubLObject $historical_root_problems;
    public SubLObject $historical_tactic_count;
    public SubLObject $complex_problem_query_czer_index;
    public SubLObject $complex_problem_query_signatures;
    public SubLObject $proof_keeping_index;
    private static final SubLStructDeclNative structDecl;

    public $problem_store_native()
    {
      this.$guid = CommonSymbols.NIL;
      this.$suid = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
      this.$creation_time = CommonSymbols.NIL;
      this.$inference_id_index = CommonSymbols.NIL;
      this.$strategy_id_index = CommonSymbols.NIL;
      this.$problem_id_index = CommonSymbols.NIL;
      this.$link_id_index = CommonSymbols.NIL;
      this.$proof_id_index = CommonSymbols.NIL;
      this.$problems_by_query_index = CommonSymbols.NIL;
      this.$rejected_proofs = CommonSymbols.NIL;
      this.$processed_proofs = CommonSymbols.NIL;
      this.$potentially_processed_problems = CommonSymbols.NIL;
      this.$non_explanatory_subproofs_possibleP = CommonSymbols.NIL;
      this.$non_explanatory_subproofs_index = CommonSymbols.NIL;
      this.$most_recent_tactic_executed = CommonSymbols.NIL;
      this.$min_proof_depth_index = CommonSymbols.NIL;
      this.$min_transformation_depth_index = CommonSymbols.NIL;
      this.$min_transformation_depth_signature_index = CommonSymbols.NIL;
      this.$min_depth_index = CommonSymbols.NIL;
      this.$equality_reasoning_method = CommonSymbols.NIL;
      this.$equality_reasoning_domain = CommonSymbols.NIL;
      this.$intermediate_step_validation_level = CommonSymbols.NIL;
      this.$max_problem_count = CommonSymbols.NIL;
      this.$crazy_max_problem_count = CommonSymbols.NIL;
      this.$removal_allowedP = CommonSymbols.NIL;
      this.$transformation_allowedP = CommonSymbols.NIL;
      this.$add_restriction_layer_of_indirectionP = CommonSymbols.NIL;
      this.$negation_by_failureP = CommonSymbols.NIL;
      this.$completeness_minimization_allowedP = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$evaluate_subl_allowedP = CommonSymbols.NIL;
      this.$rewrite_allowedP = CommonSymbols.NIL;
      this.$abduction_allowedP = CommonSymbols.NIL;
      this.$new_terms_allowedP = CommonSymbols.NIL;
      this.$compute_answer_justificationsP = CommonSymbols.NIL;
      this.$memoization_state = CommonSymbols.NIL;
      this.$sbhl_resource_space = CommonSymbols.NIL;
      this.$preparedP = CommonSymbols.NIL;
      this.$destruction_imminentP = CommonSymbols.NIL;
      this.$meta_problem_store = CommonSymbols.NIL;
      this.$static_properties = CommonSymbols.NIL;
      this.$janitor = CommonSymbols.NIL;
      this.$historical_root_problems = CommonSymbols.NIL;
      this.$historical_tactic_count = CommonSymbols.NIL;
      this.$complex_problem_query_czer_index = CommonSymbols.NIL;
      this.$complex_problem_query_signatures = CommonSymbols.NIL;
      this.$proof_keeping_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $problem_store_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$guid;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$suid;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$creation_time;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$inference_id_index;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$strategy_id_index;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$problem_id_index;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$link_id_index;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$proof_id_index;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$problems_by_query_index;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$rejected_proofs;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$processed_proofs;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$potentially_processed_problems;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$non_explanatory_subproofs_possibleP;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$non_explanatory_subproofs_index;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$most_recent_tactic_executed;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$min_proof_depth_index;
    }

    @Override
    public SubLObject getField19()
    {
      return this.$min_transformation_depth_index;
    }

    @Override
    public SubLObject getField20()
    {
      return this.$min_transformation_depth_signature_index;
    }

    public SubLObject getField21()
    {
      return this.$min_depth_index;
    }

    public SubLObject getField22()
    {
      return this.$equality_reasoning_method;
    }

    public SubLObject getField23()
    {
      return this.$equality_reasoning_domain;
    }

    public SubLObject getField24()
    {
      return this.$intermediate_step_validation_level;
    }

    public SubLObject getField25()
    {
      return this.$max_problem_count;
    }

    public SubLObject getField26()
    {
      return this.$crazy_max_problem_count;
    }

    public SubLObject getField27()
    {
      return this.$removal_allowedP;
    }

    public SubLObject getField28()
    {
      return this.$transformation_allowedP;
    }

    public SubLObject getField29()
    {
      return this.$add_restriction_layer_of_indirectionP;
    }

    public SubLObject getField30()
    {
      return this.$negation_by_failureP;
    }

    public SubLObject getField31()
    {
      return this.$completeness_minimization_allowedP;
    }

    public SubLObject getField32()
    {
      return this.$direction;
    }

    public SubLObject getField33()
    {
      return this.$evaluate_subl_allowedP;
    }

    public SubLObject getField34()
    {
      return this.$rewrite_allowedP;
    }

    public SubLObject getField35()
    {
      return this.$abduction_allowedP;
    }

    public SubLObject getField36()
    {
      return this.$new_terms_allowedP;
    }

    public SubLObject getField37()
    {
      return this.$compute_answer_justificationsP;
    }

    public SubLObject getField38()
    {
      return this.$memoization_state;
    }

    public SubLObject getField39()
    {
      return this.$sbhl_resource_space;
    }

    public SubLObject getField40()
    {
      return this.$preparedP;
    }

    public SubLObject getField41()
    {
      return this.$destruction_imminentP;
    }

    public SubLObject getField42()
    {
      return this.$meta_problem_store;
    }

    public SubLObject getField43()
    {
      return this.$static_properties;
    }

    public SubLObject getField44()
    {
      return this.$janitor;
    }

    public SubLObject getField45()
    {
      return this.$historical_root_problems;
    }

    public SubLObject getField46()
    {
      return this.$historical_tactic_count;
    }

    public SubLObject getField47()
    {
      return this.$complex_problem_query_czer_index;
    }

    public SubLObject getField48()
    {
      return this.$complex_problem_query_signatures;
    }

    public SubLObject getField49()
    {
      return this.$proof_keeping_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$guid = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$suid = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$creation_time = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$inference_id_index = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$strategy_id_index = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$problem_id_index = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$link_id_index = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$proof_id_index = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$problems_by_query_index = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$rejected_proofs = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$processed_proofs = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$potentially_processed_problems = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$non_explanatory_subproofs_possibleP = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$non_explanatory_subproofs_index = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$most_recent_tactic_executed = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$min_proof_depth_index = value;
    }

    @Override
    public SubLObject setField19(final SubLObject value)
    {
      return this.$min_transformation_depth_index = value;
    }

    @Override
    public SubLObject setField20(final SubLObject value)
    {
      return this.$min_transformation_depth_signature_index = value;
    }

    public SubLObject setField21(final SubLObject value)
    {
      return this.$min_depth_index = value;
    }

    public SubLObject setField22(final SubLObject value)
    {
      return this.$equality_reasoning_method = value;
    }

    public SubLObject setField23(final SubLObject value)
    {
      return this.$equality_reasoning_domain = value;
    }

    public SubLObject setField24(final SubLObject value)
    {
      return this.$intermediate_step_validation_level = value;
    }

    public SubLObject setField25(final SubLObject value)
    {
      return this.$max_problem_count = value;
    }

    public SubLObject setField26(final SubLObject value)
    {
      return this.$crazy_max_problem_count = value;
    }

    public SubLObject setField27(final SubLObject value)
    {
      return this.$removal_allowedP = value;
    }

    public SubLObject setField28(final SubLObject value)
    {
      return this.$transformation_allowedP = value;
    }

    public SubLObject setField29(final SubLObject value)
    {
      return this.$add_restriction_layer_of_indirectionP = value;
    }

    public SubLObject setField30(final SubLObject value)
    {
      return this.$negation_by_failureP = value;
    }

    public SubLObject setField31(final SubLObject value)
    {
      return this.$completeness_minimization_allowedP = value;
    }

    public SubLObject setField32(final SubLObject value)
    {
      return this.$direction = value;
    }

    public SubLObject setField33(final SubLObject value)
    {
      return this.$evaluate_subl_allowedP = value;
    }

    public SubLObject setField34(final SubLObject value)
    {
      return this.$rewrite_allowedP = value;
    }

    public SubLObject setField35(final SubLObject value)
    {
      return this.$abduction_allowedP = value;
    }

    public SubLObject setField36(final SubLObject value)
    {
      return this.$new_terms_allowedP = value;
    }

    public SubLObject setField37(final SubLObject value)
    {
      return this.$compute_answer_justificationsP = value;
    }

    public SubLObject setField38(final SubLObject value)
    {
      return this.$memoization_state = value;
    }

    public SubLObject setField39(final SubLObject value)
    {
      return this.$sbhl_resource_space = value;
    }

    public SubLObject setField40(final SubLObject value)
    {
      return this.$preparedP = value;
    }

    public SubLObject setField41(final SubLObject value)
    {
      return this.$destruction_imminentP = value;
    }

    public SubLObject setField42(final SubLObject value)
    {
      return this.$meta_problem_store = value;
    }

    public SubLObject setField43(final SubLObject value)
    {
      return this.$static_properties = value;
    }

    public SubLObject setField44(final SubLObject value)
    {
      return this.$janitor = value;
    }

    public SubLObject setField45(final SubLObject value)
    {
      return this.$historical_root_problems = value;
    }

    public SubLObject setField46(final SubLObject value)
    {
      return this.$historical_tactic_count = value;
    }

    public SubLObject setField47(final SubLObject value)
    {
      return this.$complex_problem_query_czer_index = value;
    }

    public SubLObject setField48(final SubLObject value)
    {
      return this.$complex_problem_query_signatures = value;
    }

    public SubLObject setField49(final SubLObject value)
    {
      return this.$proof_keeping_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $problem_store_native.class, $sym22$PROBLEM_STORE, $sym23$PROBLEM_STORE_P, $list24, $list25, new String[] { "$guid", "$suid", "$lock", "$creation_time",
        "$inference_id_index", "$strategy_id_index", "$problem_id_index", "$link_id_index", "$proof_id_index", "$problems_by_query_index", "$rejected_proofs", "$processed_proofs", "$potentially_processed_problems",
        "$non_explanatory_subproofs_possibleP", "$non_explanatory_subproofs_index", "$most_recent_tactic_executed", "$min_proof_depth_index", "$min_transformation_depth_index",
        "$min_transformation_depth_signature_index", "$min_depth_index", "$equality_reasoning_method", "$equality_reasoning_domain", "$intermediate_step_validation_level", "$max_problem_count",
        "$crazy_max_problem_count", "$removal_allowedP", "$transformation_allowedP", "$add_restriction_layer_of_indirectionP", "$negation_by_failureP", "$completeness_minimization_allowedP", "$direction",
        "$evaluate_subl_allowedP", "$rewrite_allowedP", "$abduction_allowedP", "$new_terms_allowedP", "$compute_answer_justificationsP", "$memoization_state", "$sbhl_resource_space", "$preparedP",
        "$destruction_imminentP", "$meta_problem_store", "$static_properties", "$janitor", "$historical_root_problems", "$historical_tactic_count", "$complex_problem_query_czer_index",
        "$complex_problem_query_signatures", "$proof_keeping_index"
      }, $list26, $list27, $sym28$PRINT_PROBLEM_STORE );
    }
  }

  public static final class $problem_store_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $problem_store_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROBLEM-STORE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return problem_store_p( arg1 );
    }
  }

  public static final class $problem_store_janitor_native
      extends
        SubLStructNative
  {
    public SubLObject $store;
    public SubLObject $indestructible_problems;
    public SubLObject $staleP;
    private static final SubLStructDeclNative structDecl;

    public $problem_store_janitor_native()
    {
      this.$store = CommonSymbols.NIL;
      this.$indestructible_problems = CommonSymbols.NIL;
      this.$staleP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $problem_store_janitor_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$store;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$indestructible_problems;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$staleP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$store = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$indestructible_problems = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$staleP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $problem_store_janitor_native.class, $sym325$PROBLEM_STORE_JANITOR, $sym326$PROBLEM_STORE_JANITOR_P, $list327, $list328, new String[] { "$store",
        "$indestructible_problems", "$staleP"
      }, $list329, $list330, $sym331$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $problem_store_janitor_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $problem_store_janitor_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROBLEM-STORE-JANITOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return problem_store_janitor_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3518 ms
 * 
 */