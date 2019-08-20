package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_problem_store extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "5a3db69b3ccf0847eb1e19bd524c515f115480df17d98c3bf5d902684a997bc3";
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 900L)
    public static SubLSymbol $problem_store_modification_permittedP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1400L)
    public static SubLSymbol $problem_store_multiple_subqueries_count$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1900L)
    private static SubLSymbol $problem_store_id_index$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLSymbol $dtp_problem_store$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22500L)
    private static SubLSymbol $default_problem_store_problem_size$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22600L)
    private static SubLSymbol $default_problem_store_link_size$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22600L)
    private static SubLSymbol $default_problem_store_inference_size$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22700L)
    private static SubLSymbol $default_problem_store_strategy_size$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22800L)
    private static SubLSymbol $default_problem_store_proof_size$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22900L)
    private static SubLSymbol $problem_store_sbhl_resource_space_number$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54100L)
    private static SubLSymbol $max_proof_count_multiplier$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55500L)
    private static SubLSymbol $disable_problem_store_allows_problem_hl_free_vars_optimizationP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56400L)
    private static SubLSymbol $force_problem_identity_depends_on_free_hl_vars$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLSymbol $dtp_problem_store_janitor$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105200L)
    private static SubLSymbol $problem_store_id_to_name_table$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105700L)
    private static SubLSymbol $problem_store_name_to_id_table$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111000L)
    private static SubLSymbol $problem_store_hash_watermark$;
    private static SubLSymbol $sym0$_PROBLEM_STORE_ID_INDEX_;
    private static SubLList $list1;
    private static SubLList $list2;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym5$ID;
    private static SubLSymbol $sym6$DO_ID_INDEX;
    private static SubLList $list7;
    private static SubLSymbol $sym8$IGNORE;
    private static SubLSymbol $sym9$PROBLEM_STORE_ID_INDEX;
    private static SubLSymbol $sym10$DO_ALL_PROBLEM_STORES;
    private static SubLString $str11$Destroying_all_;
    private static SubLString $str12$_problem_stores;
    private static SubLString $str13$cdolist;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym15$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $sym16$NON_NEGATIVE_INTEGER_P;
    private static SubLSymbol $sym17$_;
    private static SubLSymbol $sym18$PROBLEM_STORE_CREATION_TIME;
    private static SubLString $str19$Destroying_;
    private static SubLString $str20$_problem_stores__all_but_the_last;
    private static SubLString $str21$_;
    private static SubLSymbol $sym22$PROBLEM_STORE;
    private static SubLSymbol $sym23$PROBLEM_STORE_P;
    private static SubLList $list24;
    private static SubLList $list25;
    private static SubLList $list26;
    private static SubLList $list27;
    private static SubLSymbol $sym28$PRINT_PROBLEM_STORE;
    private static SubLInteger $int$21;
    private static SubLInteger $int$22;
    private static SubLInteger $int$23;
    private static SubLInteger $int$24;
    private static SubLInteger $int$25;
    private static SubLInteger $int$26;
    private static SubLInteger $int$27;
    private static SubLInteger $int$28;
    private static SubLInteger $int$29;
    private static SubLInteger $int$30;
    private static SubLInteger $int$31;
    private static SubLInteger $int$32;
    private static SubLInteger $int$33;
    private static SubLInteger $int$34;
    private static SubLInteger $int$35;
    private static SubLInteger $int$36;
    private static SubLInteger $int$37;
    private static SubLInteger $int$38;
    private static SubLInteger $int$39;
    private static SubLInteger $int$40;
    private static SubLInteger $int$41;
    private static SubLInteger $int$42;
    private static SubLInteger $int$43;
    private static SubLInteger $int$44;
    private static SubLInteger $int$45;
    private static SubLInteger $int$46;
    private static SubLInteger $int$47;
    private static SubLInteger $int$48;
    private static SubLInteger $int$49;
    private static SubLSymbol $sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list59;
    private static SubLSymbol $sym60$PROB_STORE_GUID;
    private static SubLSymbol $sym61$_CSETF_PROB_STORE_GUID;
    private static SubLSymbol $sym62$PROB_STORE_SUID;
    private static SubLSymbol $sym63$_CSETF_PROB_STORE_SUID;
    private static SubLSymbol $sym64$PROB_STORE_LOCK;
    private static SubLSymbol $sym65$_CSETF_PROB_STORE_LOCK;
    private static SubLSymbol $sym66$PROB_STORE_CREATION_TIME;
    private static SubLSymbol $sym67$_CSETF_PROB_STORE_CREATION_TIME;
    private static SubLSymbol $sym68$PROB_STORE_INFERENCE_ID_INDEX;
    private static SubLSymbol $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX;
    private static SubLSymbol $sym70$PROB_STORE_STRATEGY_ID_INDEX;
    private static SubLSymbol $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX;
    private static SubLSymbol $sym72$PROB_STORE_PROBLEM_ID_INDEX;
    private static SubLSymbol $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX;
    private static SubLSymbol $sym74$PROB_STORE_LINK_ID_INDEX;
    private static SubLSymbol $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX;
    private static SubLSymbol $sym76$PROB_STORE_PROOF_ID_INDEX;
    private static SubLSymbol $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX;
    private static SubLSymbol $sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX;
    private static SubLSymbol $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX;
    private static SubLSymbol $sym80$PROB_STORE_REJECTED_PROOFS;
    private static SubLSymbol $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS;
    private static SubLSymbol $sym82$PROB_STORE_PROCESSED_PROOFS;
    private static SubLSymbol $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS;
    private static SubLSymbol $sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS;
    private static SubLSymbol $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS;
    private static SubLSymbol $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
    private static SubLSymbol $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
    private static SubLSymbol $sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX;
    private static SubLSymbol $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX;
    private static SubLSymbol $sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED;
    private static SubLSymbol $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED;
    private static SubLSymbol $sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX;
    private static SubLSymbol $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX;
    private static SubLSymbol $sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX;
    private static SubLSymbol $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX;
    private static SubLSymbol $sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
    private static SubLSymbol $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
    private static SubLSymbol $sym98$PROB_STORE_MIN_DEPTH_INDEX;
    private static SubLSymbol $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX;
    private static SubLSymbol $sym100$PROB_STORE_EQUALITY_REASONING_METHOD;
    private static SubLSymbol $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD;
    private static SubLSymbol $sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN;
    private static SubLSymbol $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN;
    private static SubLSymbol $sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static SubLSymbol $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static SubLSymbol $sym106$PROB_STORE_MAX_PROBLEM_COUNT;
    private static SubLSymbol $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT;
    private static SubLSymbol $sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT;
    private static SubLSymbol $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT;
    private static SubLSymbol $sym110$PROB_STORE_REMOVAL_ALLOWED_;
    private static SubLSymbol $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_;
    private static SubLSymbol $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $sym116$PROB_STORE_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $sym120$PROB_STORE_DIRECTION;
    private static SubLSymbol $sym121$_CSETF_PROB_STORE_DIRECTION;
    private static SubLSymbol $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_;
    private static SubLSymbol $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_;
    private static SubLSymbol $sym124$PROB_STORE_REWRITE_ALLOWED_;
    private static SubLSymbol $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_;
    private static SubLSymbol $sym126$PROB_STORE_ABDUCTION_ALLOWED_;
    private static SubLSymbol $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_;
    private static SubLSymbol $sym128$PROB_STORE_NEW_TERMS_ALLOWED_;
    private static SubLSymbol $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_;
    private static SubLSymbol $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLSymbol $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLSymbol $sym132$PROB_STORE_MEMOIZATION_STATE;
    private static SubLSymbol $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE;
    private static SubLSymbol $sym134$PROB_STORE_SBHL_RESOURCE_SPACE;
    private static SubLSymbol $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE;
    private static SubLSymbol $sym136$PROB_STORE_PREPARED_;
    private static SubLSymbol $sym137$_CSETF_PROB_STORE_PREPARED_;
    private static SubLSymbol $sym138$PROB_STORE_DESTRUCTION_IMMINENT_;
    private static SubLSymbol $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_;
    private static SubLSymbol $sym140$PROB_STORE_META_PROBLEM_STORE;
    private static SubLSymbol $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE;
    private static SubLSymbol $sym142$PROB_STORE_STATIC_PROPERTIES;
    private static SubLSymbol $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES;
    private static SubLSymbol $sym144$PROB_STORE_JANITOR;
    private static SubLSymbol $sym145$_CSETF_PROB_STORE_JANITOR;
    private static SubLSymbol $sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS;
    private static SubLSymbol $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS;
    private static SubLSymbol $sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT;
    private static SubLSymbol $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT;
    private static SubLSymbol $sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX;
    private static SubLSymbol $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX;
    private static SubLSymbol $sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES;
    private static SubLSymbol $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES;
    private static SubLSymbol $sym154$PROB_STORE_PROOF_KEEPING_INDEX;
    private static SubLSymbol $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX;
    private static SubLSymbol $GUID;
    private static SubLSymbol $SUID;
    private static SubLSymbol $LOCK;
    private static SubLSymbol $CREATION_TIME;
    private static SubLSymbol $INFERENCE_ID_INDEX;
    private static SubLSymbol $STRATEGY_ID_INDEX;
    private static SubLSymbol $PROBLEM_ID_INDEX;
    private static SubLSymbol $LINK_ID_INDEX;
    private static SubLSymbol $PROOF_ID_INDEX;
    private static SubLSymbol $PROBLEMS_BY_QUERY_INDEX;
    private static SubLSymbol $REJECTED_PROOFS;
    private static SubLSymbol $PROCESSED_PROOFS;
    private static SubLSymbol $POTENTIALLY_PROCESSED_PROBLEMS;
    private static SubLSymbol $NON_EXPLANATORY_SUBPROOFS_POSSIBLE_;
    private static SubLSymbol $NON_EXPLANATORY_SUBPROOFS_INDEX;
    private static SubLSymbol $MOST_RECENT_TACTIC_EXECUTED;
    private static SubLSymbol $MIN_PROOF_DEPTH_INDEX;
    private static SubLSymbol $MIN_TRANSFORMATION_DEPTH_INDEX;
    private static SubLSymbol $MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX;
    private static SubLSymbol $MIN_DEPTH_INDEX;
    private static SubLSymbol $EQUALITY_REASONING_METHOD;
    private static SubLSymbol $EQUALITY_REASONING_DOMAIN;
    private static SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static SubLSymbol $MAX_PROBLEM_COUNT;
    private static SubLSymbol $CRAZY_MAX_PROBLEM_COUNT;
    private static SubLSymbol $REMOVAL_ALLOWED_;
    private static SubLSymbol $TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $NEGATION_BY_FAILURE_;
    private static SubLSymbol $COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $DIRECTION;
    private static SubLSymbol $EVALUATE_SUBL_ALLOWED_;
    private static SubLSymbol $REWRITE_ALLOWED_;
    private static SubLSymbol $ABDUCTION_ALLOWED_;
    private static SubLSymbol $NEW_TERMS_ALLOWED_;
    private static SubLSymbol $COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLSymbol $MEMOIZATION_STATE;
    private static SubLSymbol $SBHL_RESOURCE_SPACE;
    private static SubLSymbol $PREPARED_;
    private static SubLSymbol $DESTRUCTION_IMMINENT_;
    private static SubLSymbol $META_PROBLEM_STORE;
    private static SubLSymbol $STATIC_PROPERTIES;
    private static SubLSymbol $JANITOR;
    private static SubLSymbol $HISTORICAL_ROOT_PROBLEMS;
    private static SubLSymbol $HISTORICAL_TACTIC_COUNT;
    private static SubLSymbol $COMPLEX_PROBLEM_QUERY_CZER_INDEX;
    private static SubLSymbol $COMPLEX_PROBLEM_QUERY_SIGNATURES;
    private static SubLSymbol $PROOF_KEEPING_INDEX;
    private static SubLString $str204$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym206$MAKE_PROBLEM_STORE;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD;
    private static SubLSymbol $FREE;
    private static SubLString $str211$_Invalid_PROBLEM_STORE__s_;
    private static SubLString $str212$_PROBLEM_STORE__a_size__a_;
    private static SubLSymbol $sym213$SXHASH_PROBLEM_STORE_METHOD;
    private static SubLList $list214;
    private static SubLSymbol $sym215$WITH_LOCK_HELD;
    private static SubLSymbol $sym216$PROBLEM_STORE_LOCK;
    private static SubLSymbol $sym217$WITH_PROBLEM_STORE_LOCK_HELD;
    private static SubLList $list218;
    private static SubLSymbol $sym219$WITH_MEMOIZATION_STATE;
    private static SubLSymbol $sym220$PROBLEM_STORE_MEMOIZATION_STATE;
    private static SubLSymbol $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE;
    private static SubLSymbol $sym222$SPACE_VAR;
    private static SubLSymbol $sym223$CLET;
    private static SubLSymbol $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE;
    private static SubLSymbol $sym225$WITH_SBHL_MARKING_SPACE_RESOURCE;
    private static SubLSymbol $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE;
    private static SubLSymbol $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE;
    private static SubLSymbol $sym228$STORE_VAR;
    private static SubLList $list229;
    private static SubLSymbol $sym230$ID;
    private static SubLSymbol $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX;
    private static SubLSymbol $sym232$DO_PROBLEM_STORE_INFERENCES;
    private static SubLList $list233;
    private static SubLSymbol $sym234$ID;
    private static SubLSymbol $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX;
    private static SubLSymbol $sym236$DO_PROBLEM_STORE_STRATEGIES;
    private static SubLList $list237;
    private static SubLSymbol $sym238$PUNLESS;
    private static SubLList $list239;
    private static SubLList $list240;
    private static SubLList $list241;
    private static SubLSymbol $ORDERED;
    private static SubLSymbol $sym243$ID;
    private static SubLSymbol $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX;
    private static SubLSymbol $sym245$DO_PROBLEM_STORE_PROBLEMS;
    private static SubLList $list246;
    private static SubLList $list247;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $sym249$ID;
    private static SubLSymbol $sym250$PROBLEM_STORE_LINK_ID_INDEX;
    private static SubLSymbol $sym251$DO_PROBLEM_STORE_LINKS;
    private static SubLSymbol $sym252$PWHEN;
    private static SubLSymbol $sym253$PROBLEM_LINK_HAS_TYPE_;
    private static SubLList $list254;
    private static SubLList $list255;
    private static SubLSymbol $PROOF_STATUS;
    private static SubLSymbol $sym257$ID;
    private static SubLSymbol $sym258$PROBLEM_STORE_PROOF_ID_INDEX;
    private static SubLSymbol $sym259$DO_PROBLEM_STORE_PROOFS;
    private static SubLSymbol $sym260$PROOF_HAS_STATUS_;
    private static SubLList $list261;
    private static SubLSymbol $sym262$DO_SET;
    private static SubLSymbol $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS;
    private static SubLSymbol $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS;
    private static SubLList $list265;
    private static SubLSymbol $sym266$INFERENCE_VAR;
    private static SubLSymbol $sym267$INFERENCE_STRATEGY_SET;
    private static SubLInteger $int$80;
    private static SubLInteger $int$120;
    private static SubLSymbol $sym270$PROBLEM_STORE_PROPERTIES_P;
    private static SubLSymbol $sym271$PROBLEM_STORE_NAME_P;
    private static SubLString $str272$A_problem_store_named__s_already_;
    private static SubLString $str273$Problem_Store_Lock;
    private static SubLSymbol $sym274$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P;
    private static SubLSymbol $sym275$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P;
    private static SubLSymbol $NONE;
    private static SubLSymbol $EMPTY_DOMAIN;
    private static SubLSymbol $sym278$INTERMEDIATE_STEP_VALIDATION_LEVEL_P;
    private static SubLSymbol $sym279$MAX_PROBLEM_COUNT_P;
    private static SubLSymbol $sym280$BOOLEANP;
    private static SubLSymbol $sym281$INFERENCE_DIRECTION_P;
    private static SubLString $str282$problem_store_memoization_state;
    private static SubLString $str283$problem_store_memoization_lock;
    private static SubLString $str284$Destroying_problem_store__S_at_le;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym286$TACTIC_P;
    private static SubLSymbol $sym287$NEW_PROBLEM_STORE_P;
    private static SubLSymbol $FORWARD;
    private static SubLSymbol $MOTIVATING_TACTIC;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $CONTENT;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $STRUCTURAL;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $UNION;
    private static SubLInteger $int$212;
    private static SubLSymbol $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $EXECUTED;
    private static SubLSymbol $DISCARDED;
    private static SubLSymbol $sym309$_;
    private static SubLSymbol $sym310$PROOF_SUID;
    private static SubLSymbol $sym311$PROBLEM_SUID;
    private static SubLSymbol $sym312$PROBLEM_STORE_SIZE;
    private static SubLSymbol $sym313$PROBLEM_LINK_SUID;
    private static SubLSymbol $UNDETERMINED;
    private static SubLSymbol $UNKNOWN;
    private static SubLSymbol $NON_PROOF_KEEPING;
    private static SubLList $list317;
    private static SubLString $str318$Invalid_proof_keeping_reason__a_f;
    private static SubLSymbol $sym319$PROOF_REJECTED_;
    private static SubLSymbol $sym320$PROOF_P;
    private static SubLSymbol $sym321$PROBLEM_P;
    private static SubLSymbol $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED;
    private static SubLSymbol $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED;
    private static SubLInteger $int$100;
    private static SubLSymbol $sym325$PROBLEM_STORE_JANITOR;
    private static SubLSymbol $sym326$PROBLEM_STORE_JANITOR_P;
    private static SubLList $list327;
    private static SubLList $list328;
    private static SubLList $list329;
    private static SubLList $list330;
    private static SubLSymbol $sym331$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list333;
    private static SubLSymbol $sym334$PROB_STORE_JANITOR_STORE;
    private static SubLSymbol $sym335$_CSETF_PROB_STORE_JANITOR_STORE;
    private static SubLSymbol $sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
    private static SubLSymbol $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
    private static SubLSymbol $sym338$PROB_STORE_JANITOR_STALE_;
    private static SubLSymbol $sym339$_CSETF_PROB_STORE_JANITOR_STALE_;
    private static SubLSymbol $STORE;
    private static SubLSymbol $INDESTRUCTIBLE_PROBLEMS;
    private static SubLSymbol $STALE_;
    private static SubLSymbol $sym343$MAKE_PROBLEM_STORE_JANITOR;
    private static SubLSymbol $sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD;
    private static SubLSymbol $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
    private static SubLSymbol $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS;
    private static SubLList $list347;
    private static SubLSymbol $sym348$PROBLEM_STORE_JANITOR_STORE;
    private static SubLSymbol $sym349$PROBLEM_DESTRUCTIBLE_;
    private static SubLSymbol $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_;
    private static SubLSymbol $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_;
    private static SubLSymbol $sym352$FIND_PROBLEM_STORE_BY_NAME;
    private static SubLSymbol $sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME;
    private static SubLSymbol $PROBLEM_STORE_NAME;
    private static SubLSymbol $sym355$DESTROY_PROBLEM_STORE_BY_NAME;
    private static SubLSymbol $sym356$PROBLEM_STORE_PROPERTY_P;
    private static SubLString $str357$Problem_store_property__S_reflect;
    private static SubLInteger $int$50;
    private static SubLSymbol $sym359$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLSymbol $sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $TINY;
    private static SubLSymbol $WORKING_;
    private static SubLList $list367;

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2100L)
    public static SubLObject new_problem_store_id() {
        return id_index.id_index_reserve($problem_store_id_index$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2200L)
    public static SubLObject index_problem_store_by_id(SubLObject store, SubLObject suid) {
        return id_index.id_index_enter($problem_store_id_index$.getGlobalValue(), suid, store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2300L)
    public static SubLObject unindex_problem_store_by_id(SubLObject store) {
        SubLObject suid = problem_store_suid(store);
        return id_index.id_index_remove($problem_store_id_index$.getGlobalValue(), suid);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2500L)
    public static SubLObject find_problem_store_by_id(SubLObject suid) {
        return id_index.id_index_lookup($problem_store_id_index$.getGlobalValue(), suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2600L)
    public static SubLObject problem_store_count() {
        return id_index.id_index_count($problem_store_id_index$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2700L)
    public static SubLObject problem_store_next_id() {
        return id_index.id_index_next_id($problem_store_id_index$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2700L)
    public static SubLObject most_recent_problem_store() {
        SubLObject start = problem_store_next_id();
        SubLObject end_var;
        SubLObject i;
        SubLObject store;
        for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = Numbers.add(i, MINUS_ONE_INTEGER)) {
            store = find_problem_store_by_id(i);
            if (NIL != store) {
                return store;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3000L)
    public static SubLObject do_all_problem_stores(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        problem_store_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == conses_high.member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list1);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym5$ID;
        return listS($sym6$DO_ID_INDEX, list(id, problem_store_var, $list7, $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3200L)
    public static SubLObject problem_store_id_index() {
        return $problem_store_id_index$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3300L)
    public static SubLObject all_problem_stores() {
        return id_index.id_index_values($problem_store_id_index$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3500L)
    public static SubLObject destroy_all_problem_stores() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL != all_problem_stores()) {
            SubLObject list_var = all_problem_stores();
            SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((NIL != Sequences.cconcatenate($str11$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(all_problem_stores())), $str12$_problem_stores }))
                        ? Sequences.cconcatenate($str11$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(all_problem_stores())), $str12$_problem_stores })
                        : $str13$cdolist, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject store = NIL;
                    store = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function($sym15$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    destroy_problem_store(store);
                                    count = Numbers.add(count, ONE_INTEGER);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        store = csome_list_var.first();
                    }
                } finally {
                    SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 3900L)
    public static SubLObject destroy_most_problem_stores(SubLObject number_remaining) {
        if (number_remaining == UNPROVIDED) {
            number_remaining = FIVE_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(number_remaining) : number_remaining;
        SubLObject remaining_count = ZERO_INTEGER;
        SubLObject destroyed_count = ZERO_INTEGER;
        SubLObject stores = Sort.sort(conses_high.copy_list(all_problem_stores()), $sym17$_, $sym18$PROBLEM_STORE_CREATION_TIME);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(number_remaining); n = Numbers.add(n, ONE_INTEGER)) {
            if (NIL != list_utilities.non_empty_list_p(stores)) {
                stores = stores.rest();
                remaining_count = Numbers.add(remaining_count, ONE_INTEGER);
            }
        }
        if (NIL != stores) {
            SubLObject list_var = stores;
            SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((NIL != Sequences.cconcatenate($str19$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(stores)), $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy(number_remaining), $str21$_ }))
                        ? Sequences.cconcatenate($str19$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(stores)), $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy(number_remaining), $str21$_ })
                        : $str13$cdolist, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject store = NIL;
                    store = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function($sym15$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    destroy_problem_store(store);
                                    destroyed_count = Numbers.add(destroyed_count, ONE_INTEGER);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        store = csome_list_var.first();
                    }
                } finally {
                    SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(destroyed_count, remaining_count);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject problem_store_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_problem_store(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject problem_store_p(SubLObject v_object) {
        return (v_object.getClass() == $problem_store_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_guid(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_suid(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_lock(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_creation_time(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_inference_id_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_strategy_id_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_problem_id_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_link_id_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_proof_id_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_problems_by_query_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_rejected_proofs(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_processed_proofs(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_potentially_processed_problems(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField14();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_non_explanatory_subproofs_possibleP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField15();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_non_explanatory_subproofs_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField16();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_most_recent_tactic_executed(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField17();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_min_proof_depth_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField18();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_min_transformation_depth_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField19();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_min_transformation_depth_signature_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.getField20();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_min_depth_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$min_depth_index;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_equality_reasoning_method(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$equality_reasoning_method;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_equality_reasoning_domain(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$equality_reasoning_domain;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_intermediate_step_validation_level(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$intermediate_step_validation_level;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_max_problem_count(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$max_problem_count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_crazy_max_problem_count(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$crazy_max_problem_count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_removal_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$removal_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_transformation_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$transformation_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_add_restriction_layer_of_indirectionP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$add_restriction_layer_of_indirectionP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_negation_by_failureP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$negation_by_failureP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_completeness_minimization_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$completeness_minimization_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_direction(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$direction;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_evaluate_subl_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$evaluate_subl_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_rewrite_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$rewrite_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_abduction_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$abduction_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_new_terms_allowedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$new_terms_allowedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_compute_answer_justificationsP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$compute_answer_justificationsP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_memoization_state(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$memoization_state;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_sbhl_resource_space(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$sbhl_resource_space;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_preparedP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$preparedP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_destruction_imminentP(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$destruction_imminentP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_meta_problem_store(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$meta_problem_store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_static_properties(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$static_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_janitor(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_historical_root_problems(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$historical_root_problems;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_historical_tactic_count(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$historical_tactic_count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_complex_problem_query_czer_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$complex_problem_query_czer_index;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_complex_problem_query_signatures(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$complex_problem_query_signatures;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject prob_store_proof_keeping_index(SubLObject v_object) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$proof_keeping_index;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_guid(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_suid(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_lock(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_creation_time(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_inference_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_strategy_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_problem_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_link_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_proof_id_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_problems_by_query_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_rejected_proofs(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_processed_proofs(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_potentially_processed_problems(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField14(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_non_explanatory_subproofs_possibleP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField15(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_non_explanatory_subproofs_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField16(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_most_recent_tactic_executed(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField17(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_min_proof_depth_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField18(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_min_transformation_depth_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField19(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_min_transformation_depth_signature_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return v_object.setField20(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_min_depth_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$min_depth_index = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_equality_reasoning_method(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$equality_reasoning_method = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_equality_reasoning_domain(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$equality_reasoning_domain = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_intermediate_step_validation_level(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$intermediate_step_validation_level = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_max_problem_count(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$max_problem_count = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_crazy_max_problem_count(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$crazy_max_problem_count = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_removal_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$removal_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_transformation_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$transformation_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_add_restriction_layer_of_indirectionP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$add_restriction_layer_of_indirectionP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_negation_by_failureP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$negation_by_failureP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_completeness_minimization_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$completeness_minimization_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_direction(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$direction = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_evaluate_subl_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$evaluate_subl_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_rewrite_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$rewrite_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_abduction_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$abduction_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_new_terms_allowedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$new_terms_allowedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_compute_answer_justificationsP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$compute_answer_justificationsP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_memoization_state(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$memoization_state = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_sbhl_resource_space(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$sbhl_resource_space = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_preparedP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$preparedP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_destruction_imminentP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$destruction_imminentP = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_meta_problem_store(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$meta_problem_store = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_static_properties(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$static_properties = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_janitor(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$janitor = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_historical_root_problems(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$historical_root_problems = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_historical_tactic_count(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$historical_tactic_count = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_complex_problem_query_czer_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$complex_problem_query_czer_index = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_complex_problem_query_signatures(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$complex_problem_query_signatures = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject _csetf_prob_store_proof_keeping_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_p(v_object) : v_object;
        return (($problem_store_native) v_object).$proof_keeping_index = value;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject make_problem_store(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $problem_store_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($GUID)) {
                _csetf_prob_store_guid(v_new, current_value);
            } else if (pcase_var.eql($SUID)) {
                _csetf_prob_store_suid(v_new, current_value);
            } else if (pcase_var.eql($LOCK)) {
                _csetf_prob_store_lock(v_new, current_value);
            } else if (pcase_var.eql($CREATION_TIME)) {
                _csetf_prob_store_creation_time(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE_ID_INDEX)) {
                _csetf_prob_store_inference_id_index(v_new, current_value);
            } else if (pcase_var.eql($STRATEGY_ID_INDEX)) {
                _csetf_prob_store_strategy_id_index(v_new, current_value);
            } else if (pcase_var.eql($PROBLEM_ID_INDEX)) {
                _csetf_prob_store_problem_id_index(v_new, current_value);
            } else if (pcase_var.eql($LINK_ID_INDEX)) {
                _csetf_prob_store_link_id_index(v_new, current_value);
            } else if (pcase_var.eql($PROOF_ID_INDEX)) {
                _csetf_prob_store_proof_id_index(v_new, current_value);
            } else if (pcase_var.eql($PROBLEMS_BY_QUERY_INDEX)) {
                _csetf_prob_store_problems_by_query_index(v_new, current_value);
            } else if (pcase_var.eql($REJECTED_PROOFS)) {
                _csetf_prob_store_rejected_proofs(v_new, current_value);
            } else if (pcase_var.eql($PROCESSED_PROOFS)) {
                _csetf_prob_store_processed_proofs(v_new, current_value);
            } else if (pcase_var.eql($POTENTIALLY_PROCESSED_PROBLEMS)) {
                _csetf_prob_store_potentially_processed_problems(v_new, current_value);
            } else if (pcase_var.eql($NON_EXPLANATORY_SUBPROOFS_POSSIBLE_)) {
                _csetf_prob_store_non_explanatory_subproofs_possibleP(v_new, current_value);
            } else if (pcase_var.eql($NON_EXPLANATORY_SUBPROOFS_INDEX)) {
                _csetf_prob_store_non_explanatory_subproofs_index(v_new, current_value);
            } else if (pcase_var.eql($MOST_RECENT_TACTIC_EXECUTED)) {
                _csetf_prob_store_most_recent_tactic_executed(v_new, current_value);
            } else if (pcase_var.eql($MIN_PROOF_DEPTH_INDEX)) {
                _csetf_prob_store_min_proof_depth_index(v_new, current_value);
            } else if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_INDEX)) {
                _csetf_prob_store_min_transformation_depth_index(v_new, current_value);
            } else if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX)) {
                _csetf_prob_store_min_transformation_depth_signature_index(v_new, current_value);
            } else if (pcase_var.eql($MIN_DEPTH_INDEX)) {
                _csetf_prob_store_min_depth_index(v_new, current_value);
            } else if (pcase_var.eql($EQUALITY_REASONING_METHOD)) {
                _csetf_prob_store_equality_reasoning_method(v_new, current_value);
            } else if (pcase_var.eql($EQUALITY_REASONING_DOMAIN)) {
                _csetf_prob_store_equality_reasoning_domain(v_new, current_value);
            } else if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
                _csetf_prob_store_intermediate_step_validation_level(v_new, current_value);
            } else if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
                _csetf_prob_store_max_problem_count(v_new, current_value);
            } else if (pcase_var.eql($CRAZY_MAX_PROBLEM_COUNT)) {
                _csetf_prob_store_crazy_max_problem_count(v_new, current_value);
            } else if (pcase_var.eql($REMOVAL_ALLOWED_)) {
                _csetf_prob_store_removal_allowedP(v_new, current_value);
            } else if (pcase_var.eql($TRANSFORMATION_ALLOWED_)) {
                _csetf_prob_store_transformation_allowedP(v_new, current_value);
            } else if (pcase_var.eql($ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
                _csetf_prob_store_add_restriction_layer_of_indirectionP(v_new, current_value);
            } else if (pcase_var.eql($NEGATION_BY_FAILURE_)) {
                _csetf_prob_store_negation_by_failureP(v_new, current_value);
            } else if (pcase_var.eql($COMPLETENESS_MINIMIZATION_ALLOWED_)) {
                _csetf_prob_store_completeness_minimization_allowedP(v_new, current_value);
            } else if (pcase_var.eql($DIRECTION)) {
                _csetf_prob_store_direction(v_new, current_value);
            } else if (pcase_var.eql($EVALUATE_SUBL_ALLOWED_)) {
                _csetf_prob_store_evaluate_subl_allowedP(v_new, current_value);
            } else if (pcase_var.eql($REWRITE_ALLOWED_)) {
                _csetf_prob_store_rewrite_allowedP(v_new, current_value);
            } else if (pcase_var.eql($ABDUCTION_ALLOWED_)) {
                _csetf_prob_store_abduction_allowedP(v_new, current_value);
            } else if (pcase_var.eql($NEW_TERMS_ALLOWED_)) {
                _csetf_prob_store_new_terms_allowedP(v_new, current_value);
            } else if (pcase_var.eql($COMPUTE_ANSWER_JUSTIFICATIONS_)) {
                _csetf_prob_store_compute_answer_justificationsP(v_new, current_value);
            } else if (pcase_var.eql($MEMOIZATION_STATE)) {
                _csetf_prob_store_memoization_state(v_new, current_value);
            } else if (pcase_var.eql($SBHL_RESOURCE_SPACE)) {
                _csetf_prob_store_sbhl_resource_space(v_new, current_value);
            } else if (pcase_var.eql($PREPARED_)) {
                _csetf_prob_store_preparedP(v_new, current_value);
            } else if (pcase_var.eql($DESTRUCTION_IMMINENT_)) {
                _csetf_prob_store_destruction_imminentP(v_new, current_value);
            } else if (pcase_var.eql($META_PROBLEM_STORE)) {
                _csetf_prob_store_meta_problem_store(v_new, current_value);
            } else if (pcase_var.eql($STATIC_PROPERTIES)) {
                _csetf_prob_store_static_properties(v_new, current_value);
            } else if (pcase_var.eql($JANITOR)) {
                _csetf_prob_store_janitor(v_new, current_value);
            } else if (pcase_var.eql($HISTORICAL_ROOT_PROBLEMS)) {
                _csetf_prob_store_historical_root_problems(v_new, current_value);
            } else if (pcase_var.eql($HISTORICAL_TACTIC_COUNT)) {
                _csetf_prob_store_historical_tactic_count(v_new, current_value);
            } else if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_CZER_INDEX)) {
                _csetf_prob_store_complex_problem_query_czer_index(v_new, current_value);
            } else if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_SIGNATURES)) {
                _csetf_prob_store_complex_problem_query_signatures(v_new, current_value);
            } else if (pcase_var.eql($PROOF_KEEPING_INDEX)) {
                _csetf_prob_store_proof_keeping_index(v_new, current_value);
            } else {
                Errors.error($str204$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject visit_defstruct_problem_store(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym206$MAKE_PROBLEM_STORE, $int$48);
        Functions.funcall(visitor_fn, obj, $SLOT, $GUID, prob_store_guid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, prob_store_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LOCK, prob_store_lock(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CREATION_TIME, prob_store_creation_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE_ID_INDEX, prob_store_inference_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STRATEGY_ID_INDEX, prob_store_strategy_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEM_ID_INDEX, prob_store_problem_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LINK_ID_INDEX, prob_store_link_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOF_ID_INDEX, prob_store_proof_id_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROBLEMS_BY_QUERY_INDEX, prob_store_problems_by_query_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REJECTED_PROOFS, prob_store_rejected_proofs(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROCESSED_PROOFS, prob_store_processed_proofs(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $POTENTIALLY_PROCESSED_PROBLEMS, prob_store_potentially_processed_problems(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, prob_store_non_explanatory_subproofs_possibleP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SUBPROOFS_INDEX, prob_store_non_explanatory_subproofs_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MOST_RECENT_TACTIC_EXECUTED, prob_store_most_recent_tactic_executed(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MIN_PROOF_DEPTH_INDEX, prob_store_min_proof_depth_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MIN_TRANSFORMATION_DEPTH_INDEX, prob_store_min_transformation_depth_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, prob_store_min_transformation_depth_signature_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MIN_DEPTH_INDEX, prob_store_min_depth_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EQUALITY_REASONING_METHOD, prob_store_equality_reasoning_method(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EQUALITY_REASONING_DOMAIN, prob_store_equality_reasoning_domain(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INTERMEDIATE_STEP_VALIDATION_LEVEL, prob_store_intermediate_step_validation_level(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MAX_PROBLEM_COUNT, prob_store_max_problem_count(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $CRAZY_MAX_PROBLEM_COUNT, prob_store_crazy_max_problem_count(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REMOVAL_ALLOWED_, prob_store_removal_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_ALLOWED_, prob_store_transformation_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, prob_store_add_restriction_layer_of_indirectionP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEGATION_BY_FAILURE_, prob_store_negation_by_failureP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPLETENESS_MINIMIZATION_ALLOWED_, prob_store_completeness_minimization_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DIRECTION, prob_store_direction(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EVALUATE_SUBL_ALLOWED_, prob_store_evaluate_subl_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REWRITE_ALLOWED_, prob_store_rewrite_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ABDUCTION_ALLOWED_, prob_store_abduction_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_TERMS_ALLOWED_, prob_store_new_terms_allowedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPUTE_ANSWER_JUSTIFICATIONS_, prob_store_compute_answer_justificationsP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, prob_store_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SBHL_RESOURCE_SPACE, prob_store_sbhl_resource_space(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PREPARED_, prob_store_preparedP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DESTRUCTION_IMMINENT_, prob_store_destruction_imminentP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $META_PROBLEM_STORE, prob_store_meta_problem_store(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STATIC_PROPERTIES, prob_store_static_properties(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $JANITOR, prob_store_janitor(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HISTORICAL_ROOT_PROBLEMS, prob_store_historical_root_problems(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $HISTORICAL_TACTIC_COUNT, prob_store_historical_tactic_count(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPLEX_PROBLEM_QUERY_CZER_INDEX, prob_store_complex_problem_query_czer_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPLEX_PROBLEM_QUERY_SIGNATURES, prob_store_complex_problem_query_signatures(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOF_KEEPING_INDEX, prob_store_proof_keeping_index(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym206$MAKE_PROBLEM_STORE, $int$48);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 6600L)
    public static SubLObject visit_defstruct_object_problem_store_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_problem_store(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16200L)
    public static SubLObject valid_problem_store_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_store_p(v_object) && NIL == problem_store_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16300L)
    public static SubLObject id_of_valid_problem_store_p(SubLObject v_object) {
        return valid_problem_store_p(find_problem_store_by_id(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16500L)
    public static SubLObject problem_store_invalid_p(SubLObject store) {
        return Equality.eq($FREE, prob_store_equality_reasoning_domain(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16600L)
    public static SubLObject print_problem_store(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != problem_store_invalid_p(v_object)) {
            PrintLow.format(stream, $str211$_Invalid_PROBLEM_STORE__s_, prob_store_suid(v_object));
        } else {
            PrintLow.format(stream, $str212$_PROBLEM_STORE__a_size__a_, problem_store_suid(v_object), problem_store_size(v_object));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17000L)
    public static SubLObject sxhash_problem_store_method(SubLObject v_object) {
        return prob_store_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17000L)
    public static SubLObject with_problem_store_lock_held(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list214);
        store = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym215$WITH_LOCK_HELD, list(list($sym216$PROBLEM_STORE_LOCK, store)), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17200L)
    public static SubLObject problem_store_lock(SubLObject store) {
        return prob_store_lock(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17400L)
    public static SubLObject with_problem_store_memoization_state(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list218);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list218);
        store = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym219$WITH_MEMOIZATION_STATE, list(list($sym220$PROBLEM_STORE_MEMOIZATION_STATE, store)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list218);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17600L)
    public static SubLObject problem_store_memoization_state(SubLObject store) {
        return prob_store_memoization_state(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17800L)
    public static SubLObject with_problem_store_sbhl_resource_space(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list218);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list218);
        store = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject space_var = $sym222$SPACE_VAR;
            return list($sym223$CLET, list(list(space_var, list($sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE, store))), listS($sym225$WITH_SBHL_MARKING_SPACE_RESOURCE, space_var, append(body, NIL)), list($sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, store, space_var));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list218);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18200L)
    public static SubLObject problem_store_sbhl_resource_space(SubLObject store) {
        return prob_store_sbhl_resource_space(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18400L)
    public static SubLObject set_problem_store_sbhl_resource_space(SubLObject store, SubLObject space) {
        _csetf_prob_store_sbhl_resource_space(store, space);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18600L)
    public static SubLObject with_problem_store_resourcing_and_memoization(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list214);
        store = current.first();
        SubLObject body;
        current = (body = current.rest());
        SubLObject store_var = $sym228$STORE_VAR;
        return list($sym223$CLET, list(list(store_var, store)), list($sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE, list(store_var), listS($sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE, list(store_var), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18900L)
    public static SubLObject do_problem_store_inferences(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list229);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list229);
        inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list229);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list229);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list229);
            if (NIL == conses_high.member(current_$6, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list229);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym230$ID;
        return listS($sym6$DO_ID_INDEX, list(id, inference_var, list($sym231$PROBLEM_STORE_INFERENCE_ID_INDEX, store), $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19200L)
    public static SubLObject problem_store_inference_id_index(SubLObject store) {
        return prob_store_inference_id_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19400L)
    public static SubLObject do_problem_store_strategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list233);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list233);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list233);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list233);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list233);
            if (NIL == conses_high.member(current_$7, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list233);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym234$ID;
        return listS($sym6$DO_ID_INDEX, list(id, strategy_var, list($sym235$PROBLEM_STORE_STRATEGY_ID_INDEX, store), $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19600L)
    public static SubLObject problem_store_strategy_id_index(SubLObject store) {
        return prob_store_strategy_id_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19800L)
    public static SubLObject do_problem_store_strategic_contexts(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list237);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategic_context_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list237);
        strategic_context_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list237);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list237);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list237);
            if (NIL == conses_high.member(current_$8, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list237);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym238$PUNLESS, done, listS($sym223$CLET, list(reader.bq_cons(strategic_context_var, $list239)), append(body, NIL)), listS($sym236$DO_PROBLEM_STORE_STRATEGIES, list(strategic_context_var, store, $DONE, done), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20100L)
    public static SubLObject do_problem_store_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list240);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list240);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list240);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list240);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list240);
            if (NIL == conses_high.member(current_$9, $list241, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list240);
        }
        SubLObject ordered_tail = cdestructuring_bind.property_list_member($ORDERED, current);
        SubLObject ordered = (NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym243$ID;
        return listS($sym6$DO_ID_INDEX, list(id, problem_var, list($sym244$PROBLEM_STORE_PROBLEM_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20400L)
    public static SubLObject problem_store_problem_id_index(SubLObject store) {
        return prob_store_problem_id_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20500L)
    public static SubLObject do_problem_store_links(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list246);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list246);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list246);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list246);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list246);
            if (NIL == conses_high.member(current_$10, $list247, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list246);
        }
        SubLObject type_tail = cdestructuring_bind.property_list_member($TYPE, current);
        SubLObject type = (NIL != type_tail) ? conses_high.cadr(type_tail) : NIL;
        SubLObject ordered_tail = cdestructuring_bind.property_list_member($ORDERED, current);
        SubLObject ordered = (NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym249$ID;
        if (NIL == type) {
            return listS($sym6$DO_ID_INDEX, list(id, link_var, list($sym250$PROBLEM_STORE_LINK_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
        }
        return list($sym251$DO_PROBLEM_STORE_LINKS, list(link_var, store, $ORDERED, ordered, $DONE, done), listS($sym252$PWHEN, list($sym253$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21000L)
    public static SubLObject problem_store_link_id_index(SubLObject store) {
        return prob_store_link_id_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21100L)
    public static SubLObject do_problem_store_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list254);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list254);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list254);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list254);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list254);
            if (NIL == conses_high.member(current_$11, $list255, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list254);
        }
        SubLObject proof_status_tail = cdestructuring_bind.property_list_member($PROOF_STATUS, current);
        SubLObject proof_status = (NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : NIL;
        SubLObject ordered_tail = cdestructuring_bind.property_list_member($ORDERED, current);
        SubLObject ordered = (NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject id = $sym257$ID;
        if (NIL == proof_status) {
            return listS($sym6$DO_ID_INDEX, list(id, proof_var, list($sym258$PROBLEM_STORE_PROOF_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list($sym8$IGNORE, id), append(body, NIL));
        }
        return list($sym259$DO_PROBLEM_STORE_PROOFS, list(proof_var, store, $ORDERED, ordered, $DONE, done), listS($sym252$PWHEN, list($sym260$PROOF_HAS_STATUS_, proof_var, proof_status), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21600L)
    public static SubLObject problem_store_proof_id_index(SubLObject store) {
        return prob_store_proof_id_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21800L)
    public static SubLObject do_problem_store_historical_root_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list261);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list261);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list261);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list261);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list261);
            if (NIL == conses_high.member(current_$12, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list261);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym262$DO_SET, list(problem_var, list($sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, store), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22000L)
    public static SubLObject problem_store_historical_root_problems(SubLObject store) {
        return prob_store_historical_root_problems(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 22100L)
    public static SubLObject do_inference_strategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list265);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject inference = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list265);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list265);
        inference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list265);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list265);
            if (NIL == conses_high.member(current_$13, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list265);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject inference_var = $sym266$INFERENCE_VAR;
        return list($sym223$CLET, list(list(inference_var, inference)), listS($sym262$DO_SET, list(strategy_var, list($sym267$INFERENCE_STRATEGY_SET, inference_var), $DONE, done), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 23000L)
    public static SubLObject new_problem_store(SubLObject problem_store_properties) {
        if (problem_store_properties == UNPROVIDED) {
            problem_store_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) : problem_store_properties;
        SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : name;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != find_problem_store_by_name(name)) {
            Errors.error($str272$A_problem_store_named__s_already_, name);
        }
        SubLObject store = make_problem_store(UNPROVIDED);
        SubLObject suid = new_problem_store_id();
        SubLObject guid = NIL;
        inference_metrics.increment_problem_store_historical_count();
        _csetf_prob_store_guid(store, guid);
        _csetf_prob_store_suid(store, suid);
        index_problem_store_by_id(store, suid);
        _csetf_prob_store_lock(store, Locks.make_lock($str273$Problem_Store_Lock));
        _csetf_prob_store_creation_time(store, Time.get_universal_time());
        _csetf_prob_store_preparedP(store, NIL);
        _csetf_prob_store_problem_id_index(store, id_index.new_id_index($default_problem_store_problem_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_inference_id_index(store, id_index.new_id_index($default_problem_store_inference_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_strategy_id_index(store, id_index.new_id_index($default_problem_store_strategy_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_link_id_index(store, id_index.new_id_index($default_problem_store_link_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_proof_id_index(store, id_index.new_id_index($default_problem_store_proof_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_rejected_proofs(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_processed_proofs(store, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_potentially_processed_problems(store, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_non_explanatory_subproofs_possibleP(store, NIL);
        _csetf_prob_store_non_explanatory_subproofs_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_most_recent_tactic_executed(store, NIL);
        _csetf_prob_store_min_proof_depth_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_transformation_depth_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_transformation_depth_signature_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_depth_index(store, Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED));
        SubLObject name2 = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
        set_problem_store_name(store, name2);
        SubLObject equality_reasoning_method = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_method(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p(equality_reasoning_method) : equality_reasoning_method;
        _csetf_prob_store_equality_reasoning_method(store, equality_reasoning_method);
        SubLObject equality_reasoning_domain = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_domain(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p(equality_reasoning_domain) : equality_reasoning_domain;
        _csetf_prob_store_equality_reasoning_domain(store, equality_reasoning_domain);
        if ($NONE == equality_reasoning_domain) {
            _csetf_prob_store_problems_by_query_index(store, $EMPTY_DOMAIN);
        } else {
            _csetf_prob_store_problems_by_query_index(store, Hashtables.make_hash_table($default_problem_store_problem_size$.getGlobalValue(), Symbols.symbol_function(EQUAL), UNPROVIDED));
        }
        SubLObject intermediate_step_validation_level = inference_datastructures_enumerated_types.problem_store_properties_intermediate_step_validation_level(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(intermediate_step_validation_level) : intermediate_step_validation_level;
        _csetf_prob_store_intermediate_step_validation_level(store, intermediate_step_validation_level);
        SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.max_problem_count_p(max_problem_count) : max_problem_count;
        _csetf_prob_store_max_problem_count(store, max_problem_count);
        SubLObject crazy_max_problem_count = compute_crazy_max_problem_count(max_problem_count);
        assert NIL != inference_datastructures_enumerated_types.max_problem_count_p(crazy_max_problem_count) : crazy_max_problem_count;
        _csetf_prob_store_crazy_max_problem_count(store, crazy_max_problem_count);
        SubLObject removal_allowedP = inference_datastructures_enumerated_types.removal_allowed_by_propertiesP(problem_store_properties);
        assert NIL != Types.booleanp(removal_allowedP) : removal_allowedP;
        _csetf_prob_store_removal_allowedP(store, removal_allowedP);
        SubLObject transformation_allowedP = inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(problem_store_properties);
        assert NIL != Types.booleanp(transformation_allowedP) : transformation_allowedP;
        _csetf_prob_store_transformation_allowedP(store, transformation_allowedP);
        SubLObject add_restriction_layer_of_indirectionP = inference_datastructures_enumerated_types.problem_store_properties_add_restriction_layer_of_indirectionP(problem_store_properties);
        assert NIL != Types.booleanp(add_restriction_layer_of_indirectionP) : add_restriction_layer_of_indirectionP;
        _csetf_prob_store_add_restriction_layer_of_indirectionP(store, add_restriction_layer_of_indirectionP);
        SubLObject negation_by_failureP = inference_datastructures_enumerated_types.problem_store_properties_negation_by_failureP(problem_store_properties);
        assert NIL != Types.booleanp(negation_by_failureP) : negation_by_failureP;
        _csetf_prob_store_negation_by_failureP(store, negation_by_failureP);
        SubLObject completeness_minimization_allowedP = inference_datastructures_enumerated_types.problem_store_properties_completeness_minimization_allowedP(problem_store_properties);
        assert NIL != Types.booleanp(completeness_minimization_allowedP) : completeness_minimization_allowedP;
        _csetf_prob_store_completeness_minimization_allowedP(store, completeness_minimization_allowedP);
        SubLObject direction = inference_datastructures_enumerated_types.problem_store_properties_direction(problem_store_properties);
        assert NIL != inference_datastructures_enumerated_types.inference_direction_p(direction) : direction;
        _csetf_prob_store_direction(store, direction);
        SubLObject evaluate_subl_allowedP = inference_datastructures_enumerated_types.problem_store_properties_evaluate_subl_allowedP(problem_store_properties);
        assert NIL != Types.booleanp(evaluate_subl_allowedP) : evaluate_subl_allowedP;
        _csetf_prob_store_evaluate_subl_allowedP(store, evaluate_subl_allowedP);
        SubLObject rewrite_allowedP = inference_datastructures_enumerated_types.problem_store_properties_rewrite_allowedP(problem_store_properties);
        assert NIL != Types.booleanp(rewrite_allowedP) : rewrite_allowedP;
        _csetf_prob_store_rewrite_allowedP(store, rewrite_allowedP);
        SubLObject abduction_allowedP = inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(problem_store_properties);
        assert NIL != Types.booleanp(abduction_allowedP) : abduction_allowedP;
        _csetf_prob_store_abduction_allowedP(store, abduction_allowedP);
        SubLObject new_terms_allowedP = inference_datastructures_enumerated_types.problem_store_properties_new_terms_allowedP(problem_store_properties);
        assert NIL != Types.booleanp(new_terms_allowedP) : new_terms_allowedP;
        _csetf_prob_store_new_terms_allowedP(store, new_terms_allowedP);
        SubLObject compute_answer_justificationsP = inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(problem_store_properties);
        assert NIL != Types.booleanp(compute_answer_justificationsP) : compute_answer_justificationsP;
        _csetf_prob_store_compute_answer_justificationsP(store, compute_answer_justificationsP);
        _csetf_prob_store_memoization_state(store, memoization_state.new_memoization_state($str282$problem_store_memoization_state, ReadWriteLocks.new_rw_lock($str283$problem_store_memoization_lock), UNPROVIDED, UNPROVIDED));
        set_problem_store_sbhl_resource_space(store, sbhl_marking_vars.new_sbhl_marking_space_resource($problem_store_sbhl_resource_space_number$.getGlobalValue()));
        _csetf_prob_store_destruction_imminentP(store, NIL);
        _csetf_prob_store_meta_problem_store(store, NIL);
        _csetf_prob_store_static_properties(store, conses_high.copy_list(problem_store_properties));
        _csetf_prob_store_janitor(store, new_problem_store_janitor(store));
        _csetf_prob_store_historical_root_problems(store, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_historical_tactic_count(store, ZERO_INTEGER);
        _csetf_prob_store_complex_problem_query_czer_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
        _csetf_prob_store_complex_problem_query_signatures(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_proof_keeping_index(store, Hashtables.make_hash_table(ZERO_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED));
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 30900L)
    public static SubLObject destroy_problem_store(SubLObject store) {
        if (NIL != valid_problem_store_p(store)) {
            SubLObject running_inferences = problem_store_running_inferences(store);
            if (NIL != running_inferences) {
                SubLObject cdolist_list_var = running_inferences;
                SubLObject running_inference = NIL;
                running_inference = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    Errors.warn($str284$Destroying_problem_store__S_at_le, store, running_inference);
                    cdolist_list_var = cdolist_list_var.rest();
                    running_inference = cdolist_list_var.first();
                }
            }
            try {
                destroy_problem_store_int(store);
                SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                    SubLObject _values = Values.getValuesAsVector();
                    unindex_problem_store_by_id(store);
                    _csetf_prob_store_lock(store, $FREE);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            } finally {
                SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                    SubLObject _values2 = Values.getValuesAsVector();
                    unindex_problem_store_by_id(store);
                    _csetf_prob_store_lock(store, $FREE);
                    Values.restoreValuesFromVector(_values2);
                } finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 31400L)
    public static SubLObject destroy_problem_store_int(SubLObject store) {
        inference_metrics.update_maximum_problem_store_historical_problem_count(store);
        note_problem_store_invalid(store);
        SubLObject meta_problem_store = prob_store_meta_problem_store(store);
        if (NIL != problem_store_p(meta_problem_store)) {
            destroy_problem_store(meta_problem_store);
        }
        _csetf_prob_store_meta_problem_store(store, $FREE);
        destroy_problem_store_janitor(prob_store_janitor(store));
        _csetf_prob_store_janitor(store, $FREE);
        free_problem_store_name(store);
        _csetf_prob_store_equality_reasoning_method(store, $FREE);
        _csetf_prob_store_intermediate_step_validation_level(store, $FREE);
        _csetf_prob_store_max_problem_count(store, $FREE);
        _csetf_prob_store_crazy_max_problem_count(store, $FREE);
        _csetf_prob_store_removal_allowedP(store, $FREE);
        _csetf_prob_store_transformation_allowedP(store, $FREE);
        _csetf_prob_store_add_restriction_layer_of_indirectionP(store, $FREE);
        _csetf_prob_store_negation_by_failureP(store, $FREE);
        _csetf_prob_store_completeness_minimization_allowedP(store, $FREE);
        _csetf_prob_store_direction(store, $FREE);
        _csetf_prob_store_evaluate_subl_allowedP(store, $FREE);
        _csetf_prob_store_rewrite_allowedP(store, $FREE);
        _csetf_prob_store_abduction_allowedP(store, $FREE);
        _csetf_prob_store_new_terms_allowedP(store, $FREE);
        _csetf_prob_store_compute_answer_justificationsP(store, $FREE);
        _csetf_prob_store_preparedP(store, $FREE);
        _csetf_prob_store_destruction_imminentP(store, $FREE);
        _csetf_prob_store_static_properties(store, $FREE);
        clear_problem_store_proof_keeping_problems(store);
        _csetf_prob_store_proof_keeping_index(store, $FREE);
        dictionary.clear_dictionary(prob_store_complex_problem_query_signatures(store));
        _csetf_prob_store_complex_problem_query_signatures(store, $FREE);
        dictionary.clear_dictionary(prob_store_complex_problem_query_czer_index(store));
        _csetf_prob_store_complex_problem_query_czer_index(store, $FREE);
        set.clear_set(prob_store_historical_root_problems(store));
        _csetf_prob_store_historical_root_problems(store, $FREE);
        _csetf_prob_store_sbhl_resource_space(store, $FREE);
        _csetf_prob_store_memoization_state(store, $FREE);
        Hashtables.clrhash(prob_store_min_depth_index(store));
        _csetf_prob_store_min_depth_index(store, $FREE);
        dictionary.clear_dictionary(prob_store_min_transformation_depth_index(store));
        _csetf_prob_store_min_transformation_depth_index(store, $FREE);
        dictionary.clear_dictionary(prob_store_min_transformation_depth_signature_index(store));
        _csetf_prob_store_min_transformation_depth_signature_index(store, $FREE);
        dictionary.clear_dictionary(prob_store_min_proof_depth_index(store));
        _csetf_prob_store_min_proof_depth_index(store, $FREE);
        if (prob_store_problems_by_query_index(store).isHashtable()) {
            Hashtables.clrhash(prob_store_problems_by_query_index(store));
        }
        _csetf_prob_store_problems_by_query_index(store, $FREE);
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$14 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        inference_datastructures_inference.destroy_problem_store_inference(inference);
                    }
                }
            }
            SubLObject idx_$15 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$15)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$15);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_datastructures_inference.destroy_problem_store_inference(inference2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        id_index.clear_id_index(prob_store_inference_id_index(store));
        _csetf_prob_store_inference_id_index(store, $FREE);
        idx = problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$16 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        inference_datastructures_strategy.destroy_problem_store_strategy(strategy);
                    }
                }
            }
            SubLObject idx_$17 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$17)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$17);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_datastructures_strategy.destroy_problem_store_strategy(strategy2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        id_index.clear_id_index(prob_store_strategy_id_index(store));
        _csetf_prob_store_strategy_id_index(store, $FREE);
        dictionary.clear_dictionary(prob_store_rejected_proofs(store));
        _csetf_prob_store_rejected_proofs(store, $FREE);
        set.clear_set(prob_store_processed_proofs(store));
        _csetf_prob_store_processed_proofs(store, $FREE);
        set.clear_set(prob_store_potentially_processed_problems(store));
        _csetf_prob_store_potentially_processed_problems(store, $FREE);
        _csetf_prob_store_non_explanatory_subproofs_possibleP(store, $FREE);
        dictionary.clear_dictionary(prob_store_non_explanatory_subproofs_index(store));
        _csetf_prob_store_non_explanatory_subproofs_index(store, $FREE);
        _csetf_prob_store_most_recent_tactic_executed(store, $FREE);
        idx = problem_store_proof_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$18 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    proof = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(proof) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(proof)) {
                            proof = $SKIP;
                        }
                        inference_datastructures_proof.destroy_problem_store_proof(proof);
                    }
                }
            }
            SubLObject idx_$19 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$19)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$19);
                SubLObject id2 = NIL;
                SubLObject proof2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        proof2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_datastructures_proof.destroy_problem_store_proof(proof2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        id_index.clear_id_index(prob_store_proof_id_index(store));
        _csetf_prob_store_proof_id_index(store, $FREE);
        idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$20 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        inference_datastructures_problem_link.destroy_problem_store_link(link);
                    }
                }
            }
            SubLObject idx_$21 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_datastructures_problem_link.destroy_problem_store_link(link2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        id_index.clear_id_index(prob_store_link_id_index(store));
        _csetf_prob_store_link_id_index(store, $FREE);
        idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$22 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        inference_datastructures_problem.destroy_problem_store_problem(problem);
                    }
                }
            }
            SubLObject idx_$23 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$23)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$23);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_datastructures_problem.destroy_problem_store_problem(problem2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        id_index.clear_id_index(prob_store_problem_id_index(store));
        _csetf_prob_store_problem_id_index(store, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36900L)
    public static SubLObject note_problem_store_invalid(SubLObject store) {
        _csetf_prob_store_equality_reasoning_domain(store, $FREE);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37000L)
    public static SubLObject problem_store_guid(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        SubLObject guid = prob_store_guid(store);
        if (NIL == guid) {
            guid = Guids.new_guid();
            _csetf_prob_store_guid(store, guid);
        }
        return guid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37300L)
    public static SubLObject problem_store_suid(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_suid(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37400L)
    public static SubLObject problem_store_creation_time(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_creation_time(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37600L)
    public static SubLObject problem_store_rejected_proofs(SubLObject store) {
        return prob_store_rejected_proofs(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37700L)
    public static SubLObject problem_store_processed_proofs(SubLObject store) {
        return prob_store_processed_proofs(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37800L)
    public static SubLObject problem_store_potentially_processed_problems(SubLObject store) {
        return prob_store_potentially_processed_problems(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37900L)
    public static SubLObject problem_store_non_explanatory_subproofs_possibleP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_non_explanatory_subproofs_possibleP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38100L)
    public static SubLObject problem_store_non_explanatory_subproofs_index(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_non_explanatory_subproofs_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38200L)
    public static SubLObject problem_store_most_recent_tactic_executed(SubLObject store) {
        return prob_store_most_recent_tactic_executed(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38400L)
    public static SubLObject problem_store_min_proof_depth_index(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_min_proof_depth_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38500L)
    public static SubLObject problem_store_min_transformation_depth_index(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_min_transformation_depth_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38700L)
    public static SubLObject problem_store_min_transformation_depth_signature_index(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_min_transformation_depth_signature_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38900L)
    public static SubLObject problem_store_min_depth_index(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_min_depth_index(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39000L)
    public static SubLObject problem_store_equality_reasoning_method(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_equality_reasoning_method(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39200L)
    public static SubLObject problem_store_equality_reasoning_domain(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_equality_reasoning_domain(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39300L)
    public static SubLObject problem_store_intermediate_step_validation_level(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_intermediate_step_validation_level(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39500L)
    public static SubLObject problem_store_max_problem_count(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_max_problem_count(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39700L)
    public static SubLObject problem_store_crazy_max_problem_count(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_crazy_max_problem_count(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39800L)
    public static SubLObject problem_store_removal_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_removal_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39900L)
    public static SubLObject problem_store_transformation_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_transformation_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40100L)
    public static SubLObject problem_store_add_restriction_layer_of_indirectionP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_add_restriction_layer_of_indirectionP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40300L)
    public static SubLObject problem_store_negation_by_failureP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_negation_by_failureP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40400L)
    public static SubLObject problem_store_completeness_minimization_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_completeness_minimization_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40600L)
    public static SubLObject problem_store_direction(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_direction(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40700L)
    public static SubLObject problem_store_evaluate_subl_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_evaluate_subl_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40900L)
    public static SubLObject problem_store_rewrite_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_rewrite_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41000L)
    public static SubLObject problem_store_abduction_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_abduction_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41200L)
    public static SubLObject problem_store_new_terms_allowedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_new_terms_allowedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41300L)
    public static SubLObject problem_store_compute_answer_justificationsP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        if (NIL != cyc_testing.testing_real_time_pruningP()) {
            return problem_store_forwardP(store);
        }
        return prob_store_compute_answer_justificationsP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41600L)
    public static SubLObject problem_store_preparedP(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        return prob_store_preparedP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41700L)
    public static SubLObject problem_store_destruction_imminentP(SubLObject store) {
        return prob_store_destruction_imminentP(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41800L)
    public static SubLObject problem_store_meta_problem_store(SubLObject store) {
        SubLObject meta_problem_store = prob_store_meta_problem_store(store);
        if (NIL == meta_problem_store) {
            meta_problem_store = new_problem_store(problem_store_static_properties(store));
            _csetf_prob_store_meta_problem_store(store, meta_problem_store);
        }
        return meta_problem_store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42300L)
    public static SubLObject problem_store_static_properties(SubLObject store) {
        return prob_store_static_properties(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42400L)
    public static SubLObject problem_store_janitor(SubLObject store) {
        return prob_store_janitor(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42500L)
    public static SubLObject note_problem_store_most_recent_tactic_executed(SubLObject store, SubLObject tactic) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        _csetf_prob_store_most_recent_tactic_executed(store, tactic);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42800L)
    public static SubLObject set_problem_store_intermediate_step_validation_level(SubLObject store, SubLObject value) {
        assert NIL != new_problem_store_p(store) : store;
        assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(value) : value;
        _csetf_prob_store_intermediate_step_validation_level(store, value);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43400L)
    public static SubLObject set_problem_store_add_restriction_layer_of_indirectionP(SubLObject store, SubLObject value) {
        assert NIL != new_problem_store_p(store) : store;
        assert NIL != Types.booleanp(value) : value;
        _csetf_prob_store_add_restriction_layer_of_indirectionP(store, value);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43700L)
    public static SubLObject set_problem_store_transformation_allowedP(SubLObject store, SubLObject value) {
        assert NIL != new_problem_store_p(store) : store;
        assert NIL != Types.booleanp(value) : value;
        _csetf_prob_store_transformation_allowedP(store, value);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43900L)
    public static SubLObject set_problem_store_removal_allowedP(SubLObject store, SubLObject value) {
        assert NIL != new_problem_store_p(store) : store;
        assert NIL != Types.booleanp(value) : value;
        _csetf_prob_store_removal_allowedP(store, value);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44100L)
    public static SubLObject set_problem_store_new_terms_allowedP(SubLObject store, SubLObject value) {
        assert NIL != new_problem_store_p(store) : store;
        assert NIL != Types.booleanp(value) : value;
        _csetf_prob_store_new_terms_allowedP(store, value);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44300L)
    public static SubLObject note_problem_store_prepared(SubLObject store) {
        assert NIL != new_problem_store_p(store) : store;
        _csetf_prob_store_preparedP(store, T);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44500L)
    public static SubLObject note_problem_store_destruction_imminent(SubLObject store) {
        assert NIL != new_problem_store_p(store) : store;
        _csetf_prob_store_destruction_imminentP(store, T);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44700L)
    public static SubLObject reset_problem_store_janitor(SubLObject store) {
        SubLObject janitor = problem_store_janitor(store);
        destroy_problem_store_janitor(janitor);
        _csetf_prob_store_janitor(store, new_problem_store_janitor(store));
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44900L)
    public static SubLObject problem_store_forwardP(SubLObject store) {
        return Equality.eq($FORWARD, problem_store_direction(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45100L)
    public static SubLObject problem_store_newP(SubLObject store) {
        return makeBoolean(NIL == problem_store_preparedP(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45300L)
    public static SubLObject new_problem_store_p(SubLObject store) {
        return makeBoolean(NIL != problem_store_p(store) && NIL != problem_store_newP(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45400L)
    public static SubLObject problem_store_inference_count(SubLObject store) {
        return id_index.id_index_count(prob_store_inference_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45600L)
    public static SubLObject problem_store_non_recursive_inference_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$24 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL == conses_high.getf(inference_datastructures_inference.inference_properties(inference), $MOTIVATING_TACTIC, UNPROVIDED)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$25 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$25)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$25);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL == conses_high.getf(inference_datastructures_inference.inference_properties(inference2), $MOTIVATING_TACTIC, UNPROVIDED)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 45900L)
    public static SubLObject problem_store_has_only_one_inferenceP(SubLObject store) {
        return Numbers.numE(ONE_INTEGER, problem_store_inference_count(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46000L)
    public static SubLObject problem_store_historical_inference_count(SubLObject store) {
        return id_index.id_index_next_id(prob_store_inference_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46200L)
    public static SubLObject find_inference_by_id(SubLObject store, SubLObject inference_suid) {
        SubLObject v_id_index = prob_store_inference_id_index(store);
        return id_index.id_index_lookup(v_id_index, inference_suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46400L)
    public static SubLObject find_inference_by_ids(SubLObject store_suid, SubLObject inference_suid) {
        SubLObject store = find_problem_store_by_id(store_suid);
        if (NIL != store) {
            SubLObject inference = find_inference_by_id(store, inference_suid);
            return inference;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46600L)
    public static SubLObject first_problem_store_inference(SubLObject store) {
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        return inference;
                    }
                }
            }
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$27)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        return inference2;
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 46800L)
    public static SubLObject earliest_problem_store_inference(SubLObject store) {
        SubLObject earliest_id = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject earliest_inference = NIL;
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$28 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$28, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$28);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject id_$29;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        id_$29 = inference_datastructures_inference.inference_suid(inference);
                        if (id_$29.numL(earliest_id)) {
                            earliest_inference = inference;
                            earliest_id = id_$29;
                        }
                    }
                }
            }
            SubLObject idx_$29 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$29)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$29);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject id_$30 = inference_datastructures_inference.inference_suid(inference2);
                        if (id_$30.numL(earliest_id)) {
                            earliest_inference = inference2;
                            earliest_id = id_$30;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return earliest_inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47200L)
    public static SubLObject latest_problem_store_inference(SubLObject store) {
        SubLObject latest_id = MINUS_ONE_INTEGER;
        SubLObject latest_inference = NIL;
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$32 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$32, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$32);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject id_$33;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        id_$33 = inference_datastructures_inference.inference_suid(inference);
                        if (id_$33.numG(latest_id)) {
                            latest_inference = inference;
                            latest_id = id_$33;
                        }
                    }
                }
            }
            SubLObject idx_$33 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$33)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$33);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject id_$34 = inference_datastructures_inference.inference_suid(inference2);
                        if (id_$34.numG(latest_id)) {
                            latest_inference = inference2;
                            latest_id = id_$34;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return latest_inference;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47500L)
    public static SubLObject problem_store_running_inferences(SubLObject store) {
        SubLObject running_inferences = NIL;
        SubLObject idx = problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$36 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$36, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$36);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                            running_inferences = cons(inference, running_inferences);
                        }
                    }
                }
            }
            SubLObject idx_$37 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$37)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$37);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_inference.running_inference_p(inference2)) {
                            running_inferences = cons(inference2, running_inferences);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return running_inferences;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47700L)
    public static SubLObject problem_store_privateP(SubLObject store) {
        SubLObject inference = first_problem_store_inference(store);
        if (NIL != inference) {
            return inference_datastructures_inference.inference_problem_store_privateP(inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 47900L)
    public static SubLObject problem_store_strategy_count(SubLObject store) {
        return id_index.id_index_count(prob_store_strategy_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48100L)
    public static SubLObject problem_store_historical_strategy_count(SubLObject store) {
        return id_index.id_index_next_id(problem_store_strategy_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48300L)
    public static SubLObject problem_store_strategies(SubLObject store) {
        return id_index.id_index_values(problem_store_strategy_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48400L)
    public static SubLObject find_strategy_by_id(SubLObject store, SubLObject strategy_suid) {
        SubLObject v_id_index = prob_store_strategy_id_index(store);
        return id_index.id_index_lookup(v_id_index, strategy_suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48600L)
    public static SubLObject find_strategy_by_ids(SubLObject store_suid, SubLObject strategy_suid) {
        SubLObject store = find_problem_store_by_id(store_suid);
        if (NIL != store) {
            SubLObject strategy = find_strategy_by_id(store, strategy_suid);
            return strategy;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 48800L)
    public static SubLObject first_problem_store_strategy(SubLObject store) {
        SubLObject idx = problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$38 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$38);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        return strategy;
                    }
                }
            }
            SubLObject idx_$39 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$39)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$39);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        return strategy2;
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49000L)
    public static SubLObject problem_store_obvious_strategic_context(SubLObject store) {
        if (ONE_INTEGER.numE(problem_store_strategy_count(store))) {
            return first_problem_store_strategy(store);
        }
        SubLObject bal_strat = problem_store_unique_balancing_tactician(store);
        if (NIL != bal_strat) {
            return bal_strat;
        }
        return $TACTICAL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49400L)
    public static SubLObject problem_store_unique_balancing_tactician(SubLObject store) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = problem_store_strategies(store);
        SubLObject strategy = NIL;
        strategy = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != balancing_tactician.balancing_tactician_p(strategy)) {
                if (NIL != result) {
                    return NIL;
                }
                result = strategy;
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategy = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49700L)
    public static SubLObject problem_store_link_count(SubLObject store) {
        return id_index.id_index_count(prob_store_link_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49900L)
    public static SubLObject problem_store_historical_link_count(SubLObject store) {
        return id_index.id_index_next_id(prob_store_link_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50100L)
    public static SubLObject find_problem_link_by_id(SubLObject store, SubLObject link_suid) {
        SubLObject v_id_index = prob_store_link_id_index(store);
        return id_index.id_index_lookup(v_id_index, link_suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50300L)
    public static SubLObject find_problem_link_by_ids(SubLObject store_suid, SubLObject link_suid) {
        SubLObject store = find_problem_store_by_id(store_suid);
        if (NIL != store) {
            return find_problem_link_by_id(store, link_suid);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50500L)
    public static SubLObject problem_store_first_link_of_type(SubLObject store, SubLObject type) {
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$40 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$40, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$40);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                            return link;
                        }
                    }
                }
            }
            SubLObject idx_$41 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$41)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$41);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, type)) {
                            return link2;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50700L)
    public static SubLObject problem_store_link_type_count(SubLObject store, SubLObject type) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$42 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$42, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$42);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$43 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$43)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$43);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, type)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50900L)
    public static SubLObject problem_store_content_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $CONTENT);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51000L)
    public static SubLObject problem_store_answer_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $ANSWER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51100L)
    public static SubLObject problem_store_removal_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51200L)
    public static SubLObject problem_store_conjunctive_removal_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $REMOVAL_CONJUNCTIVE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51400L)
    public static SubLObject problem_store_transformation_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51500L)
    public static SubLObject problem_store_rewrite_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $REWRITE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51600L)
    public static SubLObject problem_store_structural_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $STRUCTURAL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51700L)
    public static SubLObject problem_store_join_ordered_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $JOIN_ORDERED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51900L)
    public static SubLObject problem_store_join_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $JOIN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52000L)
    public static SubLObject problem_store_split_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $SPLIT);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52100L)
    public static SubLObject problem_store_restriction_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $RESTRICTION);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52200L)
    public static SubLObject problem_store_residual_transformation_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $RESIDUAL_TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52400L)
    public static SubLObject problem_store_union_link_count(SubLObject store) {
        return problem_store_link_type_count(store, $UNION);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52500L)
    public static SubLObject problem_store_unmanifested_non_focal_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$44 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$44, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$44);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject jo_link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    jo_link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(jo_link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(jo_link)) {
                            jo_link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED) && NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(jo_link)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$45 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$45)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$45);
                SubLObject id2 = NIL;
                SubLObject jo_link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        jo_link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link2, $JOIN_ORDERED) && NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(jo_link2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52700L)
    public static SubLObject problem_store_problem_count(SubLObject store) {
        return id_index.id_index_count(prob_store_problem_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52900L)
    public static SubLObject problem_store_historical_problem_count(SubLObject store) {
        return id_index.id_index_next_id(prob_store_problem_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53100L)
    public static SubLObject problem_store_emptyP(SubLObject store) {
        return Numbers.numLE(problem_store_problem_count(store), ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53300L)
    public static SubLObject compute_crazy_max_problem_count(SubLObject max_problem_count) {
        return number_utilities.potentially_infinite_number_max(number_utilities.potentially_infinite_number_plus(max_problem_count, $int$212), number_utilities.potentially_infinite_number_times(max_problem_count, TWO_INTEGER));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 53800L)
    public static SubLObject problem_store_max_problem_count_reachedP(SubLObject store) {
        SubLObject max_problem_count = problem_store_max_problem_count(store);
        return makeBoolean(NIL == number_utilities.positive_infinity_p(max_problem_count) && problem_store_problem_count(store).numGE(max_problem_count));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54300L)
    public static SubLObject problem_store_max_proof_count_reachedP(SubLObject store) {
        SubLObject max_problem_count = problem_store_max_problem_count(store);
        SubLObject max_proof_count = number_utilities.potentially_infinite_number_times(max_problem_count, $max_proof_count_multiplier$.getGlobalValue());
        return makeBoolean(NIL == number_utilities.positive_infinity_p(max_proof_count) && problem_store_proof_count(store).numGE(max_proof_count));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 54700L)
    public static SubLObject problem_store_crazy_max_problem_count_exactly_reachedP(SubLObject store) {
        SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count(store);
        return makeBoolean(NIL == number_utilities.positive_infinity_p(crazy_max_problem_count) && problem_store_problem_count(store).numE(crazy_max_problem_count));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55000L)
    public static SubLObject problem_store_crazy_max_problem_count_reachedP(SubLObject store) {
        SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count(store);
        return makeBoolean(NIL == number_utilities.positive_infinity_p(crazy_max_problem_count) && problem_store_problem_count(store).numGE(crazy_max_problem_count));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55300L)
    public static SubLObject problem_store_allows_proof_processingP(SubLObject store) {
        return makeBoolean(NIL != problem_store_privateP(store) && NIL == problem_store_compute_answer_justificationsP(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55600L)
    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject local_state = problem_store_memoization_state(store);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = problem_store_allows_problem_hl_free_vars_optimizationP_int(store);
            } finally {
                SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55800L)
    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $disable_problem_store_allows_problem_hl_free_vars_optimizationP$.getDynamicValue(thread) && NIL == problem_store_compute_answer_justificationsP(store) && NIL != sksi_query_utilities.some_sksi_removal_module_registeredP());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 55800L)
    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(store);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, store, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(store)));
            memoization_state.caching_state_put(caching_state, store, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56700L)
    public static SubLObject problem_identity_depends_on_free_hl_varsP(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != $force_problem_identity_depends_on_free_hl_vars$.getDynamicValue(thread) || NIL != problem_store_allows_problem_hl_free_vars_optimizationP(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 56900L)
    public static SubLObject find_problem_by_id(SubLObject store, SubLObject problem_suid) {
        SubLObject v_id_index = prob_store_problem_id_index(store);
        return id_index.id_index_lookup(v_id_index, problem_suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 57100L)
    public static SubLObject find_problem_by_ids(SubLObject store_suid, SubLObject problem_suid) {
        SubLObject store = find_problem_store_by_id(store_suid);
        if (NIL != store) {
            return find_problem_by_id(store, problem_suid);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 57300L)
    public static SubLObject find_problem_by_query(SubLObject store, SubLObject query, SubLObject free_hl_vars) {
        if (free_hl_vars == UNPROVIDED) {
            free_hl_vars = NIL;
        }
        SubLObject domain = problem_store_equality_reasoning_domain(store);
        SubLObject result = NIL;
        if (NIL != inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, domain) && NIL == result) {
            SubLObject csome_list_var = Hashtables.gethash_without_values(query, prob_store_problems_by_query_index(store), UNPROVIDED);
            SubLObject problem = NIL;
            problem = csome_list_var.first();
            while (NIL == result && NIL != csome_list_var) {
                if (NIL == problem_identity_depends_on_free_hl_varsP(store) || free_hl_vars.equal(inference_datastructures_problem.problem_free_hl_vars(problem))) {
                    result = problem;
                }
                csome_list_var = csome_list_var.rest();
                problem = csome_list_var.first();
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58000L)
    public static SubLObject problem_store_tactical_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$47 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$47, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$47);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactical_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$48 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$48)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$48);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactical_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58200L)
    public static SubLObject problem_store_unexamined_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$49 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$49, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$49);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$50 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$50)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$50);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58400L)
    public static SubLObject problem_store_examined_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$51 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$51, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$51);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$52 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$52)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$52);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58700L)
    public static SubLObject problem_store_possible_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$53 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$53, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$53);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$54 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$54)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$54);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 58900L)
    public static SubLObject problem_store_pending_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$55 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$55, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$55);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$56 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$56)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$56);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59100L)
    public static SubLObject problem_store_finished_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$57 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$57, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$57);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$58 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$58)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$58);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59300L)
    public static SubLObject problem_store_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$59 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$59, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$59);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$60 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$60)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$60);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59500L)
    public static SubLObject problem_store_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$61 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$61, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$61);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$62 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$62)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$62);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 59700L)
    public static SubLObject problem_store_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$63 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$63, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$63);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$64 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$64)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$64);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60000L)
    public static SubLObject problem_store_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$65 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$65, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$65);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$66 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$66)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$66);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60200L)
    public static SubLObject problem_store_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$67 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$67, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$67);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$68 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$68)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$68);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60400L)
    public static SubLObject problem_store_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$69 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$69);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$70 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$70)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$70);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60600L)
    public static SubLObject problem_store_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$71 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$71, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$71);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$72 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$72)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$72);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 60800L)
    public static SubLObject problem_store_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$73 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$73, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$73);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$74 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$74)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$74);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61000L)
    public static SubLObject problem_store_unexamined_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$75 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$75, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$75);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$76 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$76)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$76);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61300L)
    public static SubLObject problem_store_examined_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$77 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$77, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$77);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$78 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$78)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$78);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61500L)
    public static SubLObject problem_store_possible_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$79 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$79, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$79);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$80 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$80)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$80);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 61800L)
    public static SubLObject problem_store_pending_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$81 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$81, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$81);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$82 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$82)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$82);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62100L)
    public static SubLObject problem_store_finished_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$83 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$83, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$83);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$84 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$84)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$84);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62400L)
    public static SubLObject problem_store_unexamined_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$85 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$85, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$85);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$86 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$86)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$86);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62600L)
    public static SubLObject problem_store_examined_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$87 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$87, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$87);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$88 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$88)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$88);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 62900L)
    public static SubLObject problem_store_possible_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$89 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$89, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$89);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$90 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$90)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$90);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63200L)
    public static SubLObject problem_store_pending_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$91 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$91, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$91);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$92 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$92)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$92);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63500L)
    public static SubLObject problem_store_finished_neutral_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$93 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$93, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$93);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$94 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$94)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$94);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 63700L)
    public static SubLObject problem_store_unexamined_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$95 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$95, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$95);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$96 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$96)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$96);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64000L)
    public static SubLObject problem_store_examined_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$97 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$97, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$97);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$98 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$98)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$98);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64300L)
    public static SubLObject problem_store_possible_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$99 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$99, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$99);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$100 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$100)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$100);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64600L)
    public static SubLObject problem_store_pending_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$101 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$101, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$101);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$102 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$102)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$102);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 64800L)
    public static SubLObject problem_store_finished_no_good_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$103 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$103, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$103);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$104 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$104)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$104);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65100L)
    public static SubLObject problem_store_good_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$105 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$105, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$105);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$106 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$106)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$106);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65400L)
    public static SubLObject problem_store_good_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$107 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$107, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$107);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$108 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$108)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$108);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65700L)
    public static SubLObject problem_store_good_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$109 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$109, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$109);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$110 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$110)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$110);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 65900L)
    public static SubLObject problem_store_good_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$111 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$111, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$111);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$112 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$112)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$112);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66200L)
    public static SubLObject problem_store_good_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$113 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$113, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$113);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$114 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$114)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$114);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66400L)
    public static SubLObject problem_store_neutral_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$115 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$115, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$115);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$116 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$116)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$116);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 66700L)
    public static SubLObject problem_store_neutral_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$117 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$117, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$117);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$118 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$118)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$118);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67000L)
    public static SubLObject problem_store_neutral_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$119 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$119, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$119);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$120 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$120)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$120);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67200L)
    public static SubLObject problem_store_neutral_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$121 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$121, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$121);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$122 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$122)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$122);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67500L)
    public static SubLObject problem_store_neutral_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$123 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$123, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$123);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$124 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$124)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$124);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 67800L)
    public static SubLObject problem_store_no_good_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$125 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$125, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$125);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$126 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$126)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$126);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68100L)
    public static SubLObject problem_store_no_good_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$127 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$127, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$127);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$128 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$128)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$128);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68300L)
    public static SubLObject problem_store_no_good_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$129 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$129, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$129);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$130 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$130)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$130);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68600L)
    public static SubLObject problem_store_no_good_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$131 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$131, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$131);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$132 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$132)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$132);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 68800L)
    public static SubLObject problem_store_no_good_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$133 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$133, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$133);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$134 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$134)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$134);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69100L)
    public static SubLObject problem_store_unexamined_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$135 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$135, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$135);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$136 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$136)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$136);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69400L)
    public static SubLObject problem_store_unexamined_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$137 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$137, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$137);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$138 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$138)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$138);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69700L)
    public static SubLObject problem_store_unexamined_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$139 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$139, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$139);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$140 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$140)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$140);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 69900L)
    public static SubLObject problem_store_unexamined_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$141 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$141, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$141);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$142 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$142)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$142);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70200L)
    public static SubLObject problem_store_unexamined_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$143 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$143, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$143);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$144 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$144)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$144);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70500L)
    public static SubLObject problem_store_examined_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$145 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$145, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$145);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$146 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$146)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$146);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 70800L)
    public static SubLObject problem_store_examined_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$147 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$147, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$147);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$148 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$148)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$148);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71000L)
    public static SubLObject problem_store_examined_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$149 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$149, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$149);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$150 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$150)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$150);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71300L)
    public static SubLObject problem_store_examined_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$151 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$151, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$151);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$152 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$152)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$152);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71600L)
    public static SubLObject problem_store_examined_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$153 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$153, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$153);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$154 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$154)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$154);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 71800L)
    public static SubLObject problem_store_possible_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$155 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$155, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$155);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$156 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$156)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$156);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72100L)
    public static SubLObject problem_store_possible_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$157 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$157, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$157);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$158 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$158)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$158);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72400L)
    public static SubLObject problem_store_possible_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$159 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$159, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$159);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$160 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$160)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$160);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72700L)
    public static SubLObject problem_store_possible_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$161 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$161, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$161);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$162 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$162)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$162);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72900L)
    public static SubLObject problem_store_possible_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$163 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$163, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$163);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$164 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$164)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$164);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73200L)
    public static SubLObject problem_store_pending_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$165 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$165, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$165);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$166 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$166)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$166);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73500L)
    public static SubLObject problem_store_pending_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$167 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$167, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$167);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$168 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$168)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$168);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 73700L)
    public static SubLObject problem_store_pending_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$169 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$169, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$169);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$170 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$170)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$170);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74000L)
    public static SubLObject problem_store_pending_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$171 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$171, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$171);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$172 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$172)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$172);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74300L)
    public static SubLObject problem_store_pending_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$173 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$173, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$173);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$174 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$174)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$174);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74500L)
    public static SubLObject problem_store_finished_single_literal_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$175 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$175, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$175);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$176 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$176)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$176);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 74800L)
    public static SubLObject problem_store_finished_conjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$177 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$177, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$177);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$178 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$178)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$178);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75100L)
    public static SubLObject problem_store_finished_join_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$179 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$179, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$179);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.join_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$180 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$180)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$180);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.join_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75300L)
    public static SubLObject problem_store_finished_split_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$181 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$181, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$181);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.split_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$182 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$182)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$182);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.split_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75600L)
    public static SubLObject problem_store_finished_disjunctive_problem_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$183 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$183, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$183);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            SubLObject idx_$184 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$184)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$184);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2) && NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 75900L)
    public static SubLObject problem_store_executed_removal_tactic_productivities(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        SubLObject tuples = NIL;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$185 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$185, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$185);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject problem_tuples;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        problem_tuples = inference_datastructures_problem.problem_executed_removal_tactic_productivities(problem);
                        tuples = conses_high.nreconc(problem_tuples, tuples);
                    }
                }
            }
            SubLObject idx_$186 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$186)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$186);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject problem_tuples2 = inference_datastructures_problem.problem_executed_removal_tactic_productivities(problem2);
                        tuples = conses_high.nreconc(problem_tuples2, tuples);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(tuples);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 76400L)
    public static SubLObject problem_store_tactic_with_status_count(SubLObject store, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$187 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$187, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$187);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        count = Numbers.add(count, inference_datastructures_problem.problem_tactic_with_status_count(problem, status));
                    }
                }
            }
            SubLObject idx_$188 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$188)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$188);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        count = Numbers.add(count, inference_datastructures_problem.problem_tactic_with_status_count(problem2, status));
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 76700L)
    public static SubLObject problem_store_tactic_of_type_with_status_count(SubLObject store, SubLObject type, SubLObject status) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (status == UNPROVIDED) {
            status = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$189 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$189, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$189);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        count = Numbers.add(count, inference_datastructures_problem.problem_tactic_of_type_with_status_count(problem, type, status));
                    }
                }
            }
            SubLObject idx_$190 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$190)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$190);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        count = Numbers.add(count, inference_datastructures_problem.problem_tactic_of_type_with_status_count(problem2, type, status));
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77100L)
    public static SubLObject problem_store_tactic_count(SubLObject store) {
        return problem_store_tactic_with_status_count(store, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77300L)
    public static SubLObject problem_store_historical_tactic_count(SubLObject store) {
        return prob_store_historical_tactic_count(store);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77500L)
    public static SubLObject problem_store_increment_historical_tactic_count(SubLObject store) {
        _csetf_prob_store_historical_tactic_count(store, Numbers.add(prob_store_historical_tactic_count(store), ONE_INTEGER));
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77700L)
    public static SubLObject problem_store_possible_tactic_count(SubLObject store) {
        return problem_store_tactic_with_status_count(store, $POSSIBLE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 77900L)
    public static SubLObject problem_store_executed_tactic_count(SubLObject store) {
        return problem_store_tactic_with_status_count(store, $EXECUTED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78100L)
    public static SubLObject problem_store_discarded_tactic_count(SubLObject store) {
        return problem_store_tactic_with_status_count(store, $DISCARDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78300L)
    public static SubLObject problem_store_proof_count(SubLObject store) {
        return id_index.id_index_count(prob_store_proof_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78500L)
    public static SubLObject problem_store_historical_proof_count(SubLObject store) {
        return id_index.id_index_next_id(prob_store_proof_id_index(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78700L)
    public static SubLObject find_proof_by_id(SubLObject store, SubLObject proof_suid) {
        SubLObject v_id_index = prob_store_proof_id_index(store);
        return id_index.id_index_lookup(v_id_index, proof_suid, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 78800L)
    public static SubLObject find_proof_by_ids(SubLObject store_suid, SubLObject proof_suid) {
        SubLObject store = find_problem_store_by_id(store_suid);
        if (NIL != store) {
            return find_proof_by_id(store, proof_suid);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79000L)
    public static SubLObject problem_store_some_rejected_proofsP(SubLObject store) {
        return dictionary.non_empty_dictionary_p(problem_store_rejected_proofs(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79200L)
    public static SubLObject problem_store_rejected_proof_count(SubLObject store) {
        return dictionary.dictionary_length(problem_store_rejected_proofs(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79300L)
    public static SubLObject problem_store_proven_proof_count(SubLObject store) {
        return Numbers.subtract(problem_store_proof_count(store), problem_store_rejected_proof_count(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79500L)
    public static SubLObject problem_store_all_processed_proofs(SubLObject store) {
        return Sort.sort(set.set_element_list(problem_store_processed_proofs(store)), Symbols.symbol_function($sym309$_), Symbols.symbol_function($sym310$PROOF_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79600L)
    public static SubLObject problem_store_all_potentially_processed_problems(SubLObject store) {
        return Sort.sort(set.set_element_list(problem_store_potentially_processed_problems(store)), Symbols.symbol_function($sym309$_), Symbols.symbol_function($sym311$PROBLEM_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79800L)
    public static SubLObject problem_store_has_some_non_explanatory_subproofP(SubLObject store) {
        return makeBoolean(NIL == dictionary.dictionary_empty_p(problem_store_non_explanatory_subproofs_index(store)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80000L)
    public static SubLObject problem_store_proof_non_explanatory_subproofs(SubLObject store, SubLObject proof) {
        return dictionary.dictionary_lookup_without_values(problem_store_non_explanatory_subproofs_index(store), proof, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80200L)
    public static SubLObject problem_store_size(SubLObject store) {
        return Numbers.add(problem_store_problem_count(store), problem_store_link_count(store), problem_store_proof_count(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80300L)
    public static SubLObject problem_store_historical_size(SubLObject store) {
        return Numbers.add(problem_store_historical_problem_count(store), problem_store_historical_link_count(store), problem_store_historical_proof_count(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80600L)
    public static SubLObject total_size_of_all_problem_stores() {
        return number_utilities.summation(Mapping.mapcar(Symbols.symbol_function($sym312$PROBLEM_STORE_SIZE), all_problem_stores()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80800L)
    public static SubLObject total_size_of_all_historical_problem_stores() {
        return Numbers.add(inference_metrics.problem_historical_count(), inference_metrics.problem_link_historical_count(), inference_metrics.proof_historical_count());
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81100L)
    public static SubLObject problem_store_dependent_link_count(SubLObject store) {
        SubLObject count = ZERO_INTEGER;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$191 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$191, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$191);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        count = Numbers.add(count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link));
                    }
                }
            }
            SubLObject idx_$192 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$192)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$192);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        count = Numbers.add(count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link2));
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81400L)
    public static SubLObject problem_store_most_recent_transformation_link(SubLObject store) {
        SubLObject link = NIL;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$193 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$193, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$193);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link_var;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link_var = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link_var) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link_var)) {
                            link_var = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link_var, $TRANSFORMATION)) {
                            link = link_var;
                        }
                    }
                }
            }
            SubLObject idx_$194 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$194) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$194);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$194);
                SubLObject end_id = id_index.id_index_next_id(idx_$194);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject link_var2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(link_var2)) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link_var2, $TRANSFORMATION)) {
                        link = link_var2;
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 81700L)
    public static SubLObject problem_store_transformation_rules(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        SubLObject considered_rules = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$195 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$195, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$195);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject transformation_link;
                SubLObject rule;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    transformation_link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(transformation_link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(transformation_link)) {
                            transformation_link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                            rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
                            considered_rules = set_contents.set_contents_add(rule, considered_rules, Symbols.symbol_function(EQ));
                        }
                    }
                }
            }
            SubLObject idx_$196 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$196)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$196);
                SubLObject id2 = NIL;
                SubLObject transformation_link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        transformation_link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link2, $TRANSFORMATION)) {
                            SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion(transformation_link2);
                            considered_rules = set_contents.set_contents_add(rule2, considered_rules, Symbols.symbol_function(EQ));
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return set_contents.set_contents_element_list(considered_rules);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82300L)
    public static SubLObject problem_store_all_non_focal_problems(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        SubLObject problems = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$197 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$197, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$197);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject join_ordered_link;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    join_ordered_link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(join_ordered_link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(join_ordered_link)) {
                            join_ordered_link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                            problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
                            set.set_add(problem, problems);
                        }
                    }
                }
            }
            SubLObject idx_$198 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$198)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$198);
                SubLObject id2 = NIL;
                SubLObject join_ordered_link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        join_ordered_link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link2, $JOIN_ORDERED)) {
                            SubLObject problem2 = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link2);
                            set.set_add(problem2, problems);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(set.set_element_list(problems), Symbols.symbol_function($sym309$_), Symbols.symbol_function($sym311$PROBLEM_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82700L)
    public static SubLObject problem_store_could_recompute_destructiblesP(SubLObject store) {
        SubLObject janitor = problem_store_janitor(store);
        return problem_store_janitor_staleP(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 82800L)
    public static SubLObject problem_store_could_remove_destructiblesP(SubLObject store) {
        SubLObject janitor = problem_store_janitor(store);
        return makeBoolean(NIL == problem_store_janitor_staleP(janitor));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83000L)
    public static SubLObject problem_stores_similarP(SubLObject store1, SubLObject store2) {
        return Numbers.numE(problem_store_problem_count(store1), problem_store_problem_count(store2));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83300L)
    public static SubLObject problem_store_transformation_rule_bindings_to_closed(SubLObject store) {
        SubLObject triples = NIL;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$199 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$199, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$199);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject transformation_link;
                SubLObject rule;
                SubLObject v_bindings;
                SubLObject mt;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    transformation_link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(transformation_link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(transformation_link)) {
                            transformation_link = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                            rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
                            v_bindings = inference_worker_transformation.transformation_link_rule_bindings_to_closed(transformation_link);
                            mt = inference_datastructures_problem.single_literal_problem_mt(inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
                            triples = cons(list(rule, v_bindings, mt), triples);
                        }
                    }
                }
            }
            SubLObject idx_$200 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$200)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$200);
                SubLObject id2 = NIL;
                SubLObject transformation_link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        transformation_link2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link2, $TRANSFORMATION)) {
                            SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion(transformation_link2);
                            SubLObject v_bindings2 = inference_worker_transformation.transformation_link_rule_bindings_to_closed(transformation_link2);
                            SubLObject mt2 = inference_datastructures_problem.single_literal_problem_mt(inference_datastructures_problem_link.problem_link_supported_problem(transformation_link2));
                            triples = cons(list(rule2, v_bindings2, mt2), triples);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(triples);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84000L)
    public static SubLObject problem_store_all_problems(SubLObject store) {
        SubLObject problems = NIL;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$201 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$201, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$201);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        problems = cons(problem, problems);
                    }
                }
            }
            SubLObject idx_$202 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$202)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$202);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        problems = cons(problem2, problems);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(problems, Symbols.symbol_function($sym309$_), Symbols.symbol_function($sym311$PROBLEM_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84200L)
    public static SubLObject problem_store_all_problem_queries(SubLObject store) {
        SubLObject queries = NIL;
        SubLObject idx = problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$203 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$203, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$203);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        queries = cons(inference_datastructures_problem.problem_query(problem), queries);
                    }
                }
            }
            SubLObject idx_$204 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$204)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$204);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        queries = cons(inference_datastructures_problem.problem_query(problem2), queries);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(queries);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84500L)
    public static SubLObject problem_store_all_problem_links(SubLObject store) {
        SubLObject links = NIL;
        SubLObject idx = problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$205 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$205, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$205);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        links = cons(link, links);
                    }
                }
            }
            SubLObject idx_$206 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$206)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$206);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        links = cons(link2, links);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(links, Symbols.symbol_function($sym309$_), Symbols.symbol_function($sym313$PROBLEM_LINK_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84700L)
    public static SubLObject problem_store_all_proofs(SubLObject store) {
        SubLObject proofs = NIL;
        SubLObject idx = problem_store_proof_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$207 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$207, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$207);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    proof = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(proof) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(proof)) {
                            proof = $SKIP;
                        }
                        proofs = cons(proof, proofs);
                    }
                }
            }
            SubLObject idx_$208 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$208) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$208);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$208);
                SubLObject end_id = id_index.id_index_next_id(idx_$208);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject proof2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(proof2)) {
                        proofs = cons(proof2, proofs);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(proofs);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84800L)
    public static SubLObject problem_store_historical_root_problemP(SubLObject store, SubLObject problem) {
        return set.set_memberP(problem, prob_store_historical_root_problems(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85100L)
    public static SubLObject problem_store_historical_root_problem_count(SubLObject store) {
        return set.set_size(prob_store_historical_root_problems(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85300L)
    public static SubLObject problem_store_problem_with_complex_problem_queryP(SubLObject store, SubLObject problem) {
        return dictionary_utilities.dictionary_has_keyP(prob_store_complex_problem_query_signatures(store), problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85600L)
    public static SubLObject problem_store_complex_problem_query_signature(SubLObject store, SubLObject problem) {
        return dictionary.dictionary_lookup_without_values(prob_store_complex_problem_query_signatures(store), problem, $UNDETERMINED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85800L)
    public static SubLObject problem_store_find_complex_problem_query(SubLObject store, SubLObject query, SubLObject free_hl_vars) {
        SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
        SubLObject index = prob_store_complex_problem_query_czer_index(store);
        SubLObject cdolist_list_var;
        SubLObject candidate_problems = cdolist_list_var = dictionary.dictionary_lookup_without_values(index, signature, NIL);
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == problem_identity_depends_on_free_hl_varsP(store) || free_hl_vars.equal(inference_datastructures_problem.problem_free_hl_vars(problem))) {
                SubLObject candidate_query = inference_datastructures_problem.problem_query(problem);
                SubLObject problem_variable_map = unification_utilities.compute_variable_map(candidate_query, query);
                if (NIL != problem_variable_map) {
                    return Values.values(problem, problem_variable_map);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86700L)
    public static SubLObject clear_problem_store_proof_keeping_problems(SubLObject store) {
        Hashtables.clrhash(prob_store_proof_keeping_index(store));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86900L)
    public static SubLObject problem_proof_keeping_status(SubLObject problem) {
        return Hashtables.gethash_without_values(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $UNKNOWN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87200L)
    public static SubLObject proof_keeping_problemP(SubLObject problem) {
        SubLObject status = problem_proof_keeping_status(problem);
        return makeBoolean(status != $NON_PROOF_KEEPING && status != $UNKNOWN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87500L)
    public static SubLObject non_proof_keeping_problemP(SubLObject problem) {
        return Equality.eq($NON_PROOF_KEEPING, problem_proof_keeping_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87800L)
    public static SubLObject unknown_proof_keeping_problemP(SubLObject problem) {
        return Equality.eq($UNKNOWN, problem_proof_keeping_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87900L)
    public static SubLObject note_proof_keeping_problem(SubLObject problem, SubLObject reason) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != list_utilities.member_eqP(reason, $list317)) {
            Errors.error($str318$Invalid_proof_keeping_reason__a_f, reason, problem);
        }
        Hashtables.sethash(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), reason);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88200L)
    public static SubLObject note_not_proof_keeping_problem(SubLObject problem) {
        Hashtables.sethash(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $NON_PROOF_KEEPING);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88400L)
    public static SubLObject problem_store_prepare_for_expected_problem_count(SubLObject store, SubLObject total) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != subl_promotions.non_negative_integer_p(total) : total;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject old_table = prob_store_problems_by_query_index(store);
            _csetf_prob_store_problems_by_query_index(store, hash_table_utilities.copy_hashtable(old_table, total));
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return id_index.optimize_id_index(prob_store_problem_id_index(store), total);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 88800L)
    public static SubLObject problem_store_prepare_for_expected_link_count(SubLObject store, SubLObject total) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != subl_promotions.non_negative_integer_p(total) : total;
        return id_index.optimize_id_index(prob_store_link_id_index(store), total);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89100L)
    public static SubLObject problem_store_prepare_for_expected_proof_count(SubLObject store, SubLObject total) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != subl_promotions.non_negative_integer_p(total) : total;
        return id_index.optimize_id_index(prob_store_proof_id_index(store), total);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89300L)
    public static SubLObject problem_store_new_inference_id(SubLObject store) {
        SubLObject v_id_index = problem_store_inference_id_index(store);
        SubLObject suid = NIL;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            suid = id_index.id_index_reserve(v_id_index);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89600L)
    public static SubLObject problem_store_new_strategy_id(SubLObject store) {
        SubLObject v_id_index = problem_store_strategy_id_index(store);
        SubLObject suid = NIL;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            suid = id_index.id_index_reserve(v_id_index);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89800L)
    public static SubLObject problem_store_new_problem_id(SubLObject store) {
        SubLObject v_id_index = problem_store_problem_id_index(store);
        SubLObject suid = NIL;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            suid = id_index.id_index_reserve(v_id_index);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90000L)
    public static SubLObject problem_store_new_link_id(SubLObject store) {
        SubLObject v_id_index = problem_store_link_id_index(store);
        SubLObject suid = NIL;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            suid = id_index.id_index_reserve(v_id_index);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90300L)
    public static SubLObject problem_store_new_proof_id(SubLObject store) {
        SubLObject v_id_index = problem_store_proof_id_index(store);
        SubLObject suid = NIL;
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            suid = id_index.id_index_reserve(v_id_index);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90500L)
    public static SubLObject add_problem_store_inference(SubLObject store, SubLObject inference) {
        SubLObject id = inference_datastructures_inference.inference_suid(inference);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_enter_unlocked_autoextend(prob_store_inference_id_index(store), id, inference, NIL);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90800L)
    public static SubLObject remove_problem_store_inference(SubLObject store, SubLObject inference) {
        SubLObject id = inference_datastructures_inference.inference_suid(inference);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_remove(prob_store_inference_id_index(store), id);
            problem_store_min_proof_depth_index_remove_inference(store, inference);
            problem_store_min_transformation_depth_index_remove_inference(store, inference);
            problem_store_min_transformation_depth_signature_index_remove_inference(store, inference);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91200L)
    public static SubLObject add_problem_store_strategy(SubLObject store, SubLObject strategy) {
        SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_enter_unlocked_autoextend(prob_store_strategy_id_index(store), id, strategy, NIL);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91500L)
    public static SubLObject remove_problem_store_strategy(SubLObject store, SubLObject strategy) {
        SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_remove(prob_store_strategy_id_index(store), id);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91700L)
    public static SubLObject add_problem_store_problem_by_id(SubLObject store, SubLObject problem) {
        SubLObject id = inference_datastructures_problem.problem_suid(problem);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_enter_unlocked_autoextend(prob_store_problem_id_index(store), id, problem, NIL);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92000L)
    public static SubLObject remove_problem_store_problem_by_id(SubLObject store, SubLObject problem) {
        SubLObject id = inference_datastructures_problem.problem_suid(problem);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_remove(prob_store_problem_id_index(store), id);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92200L)
    public static SubLObject add_problem_store_problem_by_query(SubLObject store, SubLObject problem) {
        if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject lock = problem_store_lock(store);
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock(lock);
                hash_table_utilities.push_hash(query, problem, prob_store_problems_by_query_index(store));
            } finally {
                if (NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92500L)
    public static SubLObject remove_problem_store_problem_by_query(SubLObject store, SubLObject problem) {
        if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject lock = problem_store_lock(store);
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock(lock);
                hash_table_utilities.remove_value_from_hash(query, problem, prob_store_problems_by_query_index(store), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92800L)
    public static SubLObject add_problem_store_link(SubLObject store, SubLObject link) {
        SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_enter_unlocked_autoextend(prob_store_link_id_index(store), id, link, NIL);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93100L)
    public static SubLObject remove_problem_store_link(SubLObject store, SubLObject link) {
        SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_remove(prob_store_link_id_index(store), id);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93300L)
    public static SubLObject add_problem_store_proof(SubLObject store, SubLObject proof) {
        SubLObject id = inference_datastructures_proof.proof_suid(proof);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_enter_unlocked_autoextend(prob_store_proof_id_index(store), id, proof, NIL);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93500L)
    public static SubLObject remove_problem_store_proof(SubLObject store, SubLObject proof) {
        SubLObject id = inference_datastructures_proof.proof_suid(proof);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            id_index.id_index_remove(prob_store_proof_id_index(store), id);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93700L)
    public static SubLObject problem_store_forget_that_proof_is_rejected(SubLObject store, SubLObject proof) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_proof.proof_rejectedP(proof) : proof;
        SubLObject rejected_proofs = problem_store_rejected_proofs(store);
        dictionary.dictionary_remove(rejected_proofs, proof);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94000L)
    public static SubLObject problem_store_note_proof_processed(SubLObject store, SubLObject proof) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject processed_proofs = problem_store_processed_proofs(store);
        set.set_add(proof, processed_proofs);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94300L)
    public static SubLObject problem_store_note_proof_unprocessed(SubLObject store, SubLObject proof) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject processed_proofs = problem_store_processed_proofs(store);
        set.set_remove(proof, processed_proofs);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94500L)
    public static SubLObject problem_store_note_problem_potentially_processed(SubLObject store, SubLObject problem) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject potentially_processed_problems = problem_store_potentially_processed_problems(store);
        set.set_add(problem, potentially_processed_problems);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94900L)
    public static SubLObject problem_store_note_problem_unprocessed(SubLObject store, SubLObject problem) {
        assert NIL != problem_store_p(store) : store;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject potentially_processed_problems = problem_store_potentially_processed_problems(store);
        set.set_remove(problem, potentially_processed_problems);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95200L)
    public static SubLObject problem_store_note_non_explanatory_subproofs_possible(SubLObject store) {
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_prob_store_non_explanatory_subproofs_possibleP(store, T);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95400L)
    public static SubLObject problem_store_note_non_explanatory_subproof(SubLObject store, SubLObject proof, SubLObject non_explanatory_subproof) {
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            dictionary_utilities.dictionary_pushnew(problem_store_non_explanatory_subproofs_index(store), proof, non_explanatory_subproof, UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 95600L)
    public static SubLObject proof_note_non_explanatory_subproof(SubLObject proof, SubLObject non_explanatory_subproof) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert NIL != inference_datastructures_proof.proof_p(non_explanatory_subproof) : non_explanatory_subproof;
        SubLObject store = inference_datastructures_proof.proof_store(proof);
        problem_store_note_non_explanatory_subproof(store, proof, non_explanatory_subproof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96000L)
    public static SubLObject reset_problem_store_min_depth_index(SubLObject store) {
        _csetf_prob_store_min_depth_index(store, Hashtables.make_hash_table(problem_store_problem_count(store), Symbols.symbol_function(EQ), UNPROVIDED));
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96200L)
    public static SubLObject problem_store_min_proof_depth_index_remove_inference(SubLObject store, SubLObject inference) {
        SubLObject index = problem_store_min_proof_depth_index(store);
        dictionary.dictionary_remove(index, inference);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96400L)
    public static SubLObject problem_store_min_transformation_depth_index_remove_inference(SubLObject store, SubLObject inference) {
        SubLObject index = problem_store_min_transformation_depth_index(store);
        dictionary.dictionary_remove(index, inference);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96600L)
    public static SubLObject problem_store_min_transformation_depth_signature_index_remove_inference(SubLObject store, SubLObject inference) {
        SubLObject index = problem_store_min_transformation_depth_signature_index(store);
        dictionary.dictionary_remove(index, inference);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96900L)
    public static SubLObject add_problem_store_historical_root_problem(SubLObject store, SubLObject problem) {
        return set.set_add(problem, prob_store_historical_root_problems(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97000L)
    public static SubLObject remove_problem_store_historical_root_problem(SubLObject store, SubLObject problem) {
        return set.set_remove(problem, prob_store_historical_root_problems(store));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97200L)
    public static SubLObject finalize_problem_store_properties(SubLObject store) {
        if (NIL == problem_store_preparedP(store)) {
            note_problem_store_prepared(store);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97500L)
    public static SubLObject add_problem_store_complex_problem(SubLObject store, SubLObject problem) {
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
        if (NIL == problem_store_problem_with_complex_problem_queryP(store, problem)) {
            dictionary.dictionary_enter(prob_store_complex_problem_query_signatures(store), problem, signature);
            dictionary_utilities.dictionary_push(prob_store_complex_problem_query_czer_index(store), signature, problem);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97900L)
    public static SubLObject remove_problem_store_complex_problem(SubLObject store, SubLObject problem) {
        if (NIL != problem_store_problem_with_complex_problem_queryP(store, problem)) {
            SubLObject signature = dictionary.dictionary_lookup_without_values(prob_store_complex_problem_query_signatures(store), problem, UNPROVIDED);
            dictionary.dictionary_remove(prob_store_complex_problem_query_signatures(store), problem);
            dictionary_utilities.dictionary_delete_first_from_value(prob_store_complex_problem_query_czer_index(store), signature, problem, Symbols.symbol_function(EQ));
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98400L)
    public static SubLObject add_problem_store_problem(SubLObject store, SubLObject problem) {
        add_problem_store_problem_by_id(store, problem);
        add_problem_store_problem_by_query(store, problem);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98600L)
    public static SubLObject remove_problem_store_problem(SubLObject store, SubLObject problem) {
        remove_problem_store_historical_root_problem(store, problem);
        remove_problem_wrt_reuse(store, problem);
        remove_problem_store_problem_by_id(store, problem);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98900L)
    public static SubLObject remove_problem_wrt_reuse(SubLObject store, SubLObject problem) {
        remove_problem_store_complex_problem(store, problem);
        remove_problem_store_problem_by_query(store, problem);
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99100L)
    public static SubLObject problem_store_note_transformation_rule_considered(SubLObject store, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = problem_store_memoization_state(store);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                ensure_transformation_rule_considered_noted(rule);
            } finally {
                SubLObject _prev_bind_0_$209 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99400L)
    public static SubLObject problem_store_note_transformation_rule_success(SubLObject store, SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = problem_store_memoization_state(store);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                ensure_transformation_rule_success_noted(rule);
            } finally {
                SubLObject _prev_bind_0_$210 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99700L)
    public static SubLObject ensure_transformation_rule_considered_noted_internal(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.rule_assertionP(rule)) {
            if (NIL == control_vars.$kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
                inference_analysis.increment_transformation_rule_considered_count(rule, T, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 99700L)
    public static SubLObject ensure_transformation_rule_considered_noted(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ensure_transformation_rule_considered_noted_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(ensure_transformation_rule_considered_noted_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100200L)
    public static SubLObject ensure_transformation_rule_success_noted_internal(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.rule_assertionP(rule)) {
            if (NIL != control_vars.$kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
                inference_analysis.increment_transformation_rule_considered_count(rule, T, $int$100, UNPROVIDED);
                inference_analysis.increment_transformation_rule_success_count(rule, T, $int$100, UNPROVIDED);
            } else if (NIL != subl_promotions.positive_integer_p($problem_store_multiple_subqueries_count$.getDynamicValue(thread))) {
                inference_analysis.increment_transformation_rule_considered_count(rule, T, Numbers.subtract($problem_store_multiple_subqueries_count$.getDynamicValue(thread), ONE_INTEGER), UNPROVIDED);
                inference_analysis.increment_transformation_rule_success_count(rule, T, $problem_store_multiple_subqueries_count$.getDynamicValue(thread), UNPROVIDED);
            } else {
                inference_analysis.increment_transformation_rule_success_count(rule, T, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100200L)
    public static SubLObject ensure_transformation_rule_success_noted(SubLObject rule) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ensure_transformation_rule_success_noted_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(ensure_transformation_rule_success_noted_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject problem_store_janitor_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject problem_store_janitor_p(SubLObject v_object) {
        return (v_object.getClass() == $problem_store_janitor_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject prob_store_janitor_store(SubLObject v_object) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject prob_store_janitor_indestructible_problems(SubLObject v_object) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject prob_store_janitor_staleP(SubLObject v_object) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject _csetf_prob_store_janitor_store(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject _csetf_prob_store_janitor_indestructible_problems(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject _csetf_prob_store_janitor_staleP(SubLObject v_object, SubLObject value) {
        assert NIL != problem_store_janitor_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject make_problem_store_janitor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $problem_store_janitor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STORE)) {
                _csetf_prob_store_janitor_store(v_new, current_value);
            } else if (pcase_var.eql($INDESTRUCTIBLE_PROBLEMS)) {
                _csetf_prob_store_janitor_indestructible_problems(v_new, current_value);
            } else if (pcase_var.eql($STALE_)) {
                _csetf_prob_store_janitor_staleP(v_new, current_value);
            } else {
                Errors.error($str204$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject visit_defstruct_problem_store_janitor(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym343$MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $STORE, prob_store_janitor_store(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INDESTRUCTIBLE_PROBLEMS, prob_store_janitor_indestructible_problems(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STALE_, prob_store_janitor_staleP(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym343$MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 101300L)
    public static SubLObject visit_defstruct_object_problem_store_janitor_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_problem_store_janitor(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102200L)
    public static SubLObject new_problem_store_janitor(SubLObject store) {
        assert NIL != problem_store_p(store) : store;
        SubLObject janitor = make_problem_store_janitor(UNPROVIDED);
        _csetf_prob_store_janitor_store(janitor, store);
        _csetf_prob_store_janitor_indestructible_problems(janitor, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        problem_store_janitor_note_stale(janitor);
        return janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102500L)
    public static SubLObject destroy_problem_store_janitor(SubLObject janitor) {
        set.clear_set(prob_store_janitor_indestructible_problems(janitor));
        _csetf_prob_store_janitor_indestructible_problems(janitor, $FREE);
        _csetf_prob_store_janitor_store(janitor, $FREE);
        problem_store_janitor_note_stale(janitor);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 102900L)
    public static SubLObject problem_store_janitor_store(SubLObject janitor) {
        return prob_store_janitor_store(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103000L)
    public static SubLObject problem_store_janitor_staleP(SubLObject janitor) {
        return prob_store_janitor_staleP(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103100L)
    public static SubLObject problem_store_janitor_indestructible_problems(SubLObject janitor) {
        if (NIL != problem_store_janitor_staleP(janitor)) {
            return set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        }
        return prob_store_janitor_indestructible_problems(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103400L)
    public static SubLObject do_problem_store_janitor_indestructible_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject janitor = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        janitor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$211 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list347);
            current_$211 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list347);
            if (NIL == conses_high.member(current_$211, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$211 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list347);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym262$DO_SET, list(problem_var, list($sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, janitor), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103600L)
    public static SubLObject do_problem_store_janitor_destructible_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject janitor = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list347);
        janitor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$212 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list347);
            current_$212 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list347);
            if (NIL == conses_high.member(current_$212, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$212 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list347);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym245$DO_PROBLEM_STORE_PROBLEMS, list(problem_var, list($sym348$PROBLEM_STORE_JANITOR_STORE, janitor), $DONE, done), listS($sym252$PWHEN, list($sym349$PROBLEM_DESTRUCTIBLE_, problem_var), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 103900L)
    public static SubLObject problem_store_janitor_indestructible_problem_count(SubLObject janitor) {
        return set.set_size(problem_store_janitor_indestructible_problems(janitor));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104000L)
    public static SubLObject problem_store_janitor_destructible_problem_count(SubLObject janitor) {
        return Numbers.subtract(problem_store_problem_count(problem_store_janitor_store(janitor)), problem_store_janitor_indestructible_problem_count(janitor));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104300L)
    public static SubLObject problem_store_janitor_note_stale(SubLObject janitor) {
        _csetf_prob_store_janitor_staleP(janitor, T);
        return janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104400L)
    public static SubLObject problem_store_janitor_note_unstale(SubLObject janitor) {
        _csetf_prob_store_janitor_staleP(janitor, NIL);
        return janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104500L)
    public static SubLObject problem_store_janitor_note_problem_indestructible(SubLObject janitor, SubLObject problem) {
        assert NIL != problem_store_janitor_p(janitor) : janitor;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject indestructible_problems = problem_store_janitor_indestructible_problems(janitor);
        set.set_add(problem, indestructible_problems);
        return janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 104900L)
    public static SubLObject problem_store_janitor_note_problem_destructible(SubLObject janitor, SubLObject problem) {
        assert NIL != problem_store_janitor_p(janitor) : janitor;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject indestructible_problems = problem_store_janitor_indestructible_problems(janitor);
        set.set_remove(problem, indestructible_problems);
        return janitor;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105300L)
    public static SubLObject problem_store_name(SubLObject problem_store) {
        assert NIL != problem_store_p(problem_store) : problem_store;
        SubLObject id = problem_store_suid(problem_store);
        return Hashtables.gethash_without_values(id, $problem_store_id_to_name_table$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 105800L)
    public static SubLObject find_problem_store_by_name(SubLObject name) {
        assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : name;
        if (NIL != name) {
            SubLObject id = Hashtables.gethash_without_values(name, $problem_store_name_to_id_table$.getGlobalValue(), UNPROVIDED);
            if (NIL != id) {
                return find_problem_store_by_id(id);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106100L)
    public static SubLObject find_or_create_problem_store_by_name(SubLObject name, SubLObject problem_store_properties) {
        if (problem_store_properties == UNPROVIDED) {
            problem_store_properties = NIL;
        }
        assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : name;
        assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) : problem_store_properties;
        SubLObject store = find_problem_store_by_name(name);
        if (NIL == store) {
            SubLObject new_properties = conses_high.putf(conses_high.copy_list(problem_store_properties), $PROBLEM_STORE_NAME, name);
            store = new_problem_store(new_properties);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106700L)
    public static SubLObject destroy_problem_store_by_name(SubLObject name) {
        assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : name;
        return destroy_problem_store(find_problem_store_by_name(name));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 106900L)
    public static SubLObject rename_problem_store(SubLObject problem_store, SubLObject new_name) {
        assert NIL != problem_store_p(problem_store) : problem_store;
        assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(new_name) : new_name;
        SubLObject existing_store = find_problem_store_by_name(new_name);
        if (NIL != existing_store && problem_store.eql(existing_store)) {
            return T;
        }
        if (NIL != existing_store) {
            return NIL;
        }
        free_problem_store_name(problem_store);
        set_problem_store_name(problem_store, new_name);
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 107600L)
    public static SubLObject set_problem_store_name(SubLObject problem_store, SubLObject name) {
        if (NIL != name) {
            SubLObject id = problem_store_suid(problem_store);
            Hashtables.sethash(id, $problem_store_id_to_name_table$.getGlobalValue(), name);
            Hashtables.sethash(name, $problem_store_name_to_id_table$.getGlobalValue(), id);
        }
        return problem_store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 107900L)
    public static SubLObject free_problem_store_name(SubLObject problem_store) {
        SubLObject id = problem_store_suid(problem_store);
        SubLObject name = problem_store_name(problem_store);
        Hashtables.remhash(id, $problem_store_id_to_name_table$.getGlobalValue());
        Hashtables.remhash(name, $problem_store_name_to_id_table$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 108100L)
    public static SubLObject problem_store_properties(SubLObject store) {
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject value = problem_store_property_value(store, property);
            v_properties = cons(cons(property, value), v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return list_utilities.alist_to_plist(Sequences.nreverse(v_properties));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 108600L)
    public static SubLObject problem_store_property_value(SubLObject store, SubLObject property) {
        if (property.eql($ABDUCTION_ALLOWED_)) {
            return problem_store_abduction_allowedP(store);
        }
        if (property.eql($ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
            return problem_store_add_restriction_layer_of_indirectionP(store);
        }
        if (property.eql($COMPLETENESS_MINIMIZATION_ALLOWED_)) {
            return problem_store_completeness_minimization_allowedP(store);
        }
        if (property.eql($DIRECTION)) {
            return problem_store_direction(store);
        }
        if (property.eql($EQUALITY_REASONING_DOMAIN)) {
            return problem_store_equality_reasoning_domain(store);
        }
        if (property.eql($EQUALITY_REASONING_METHOD)) {
            return problem_store_equality_reasoning_method(store);
        }
        if (property.eql($EVALUATE_SUBL_ALLOWED_)) {
            return problem_store_evaluate_subl_allowedP(store);
        }
        if (property.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
            return problem_store_intermediate_step_validation_level(store);
        }
        if (property.eql($MAX_PROBLEM_COUNT)) {
            return problem_store_max_problem_count(store);
        }
        if (property.eql($NEGATION_BY_FAILURE_)) {
            return problem_store_negation_by_failureP(store);
        }
        if (property.eql($NEW_TERMS_ALLOWED_)) {
            return problem_store_new_terms_allowedP(store);
        }
        if (property.eql($PROBLEM_STORE_NAME)) {
            return problem_store_name(store);
        }
        if (property.eql($REMOVAL_ALLOWED_)) {
            return problem_store_removal_allowedP(store);
        }
        if (property.eql($REWRITE_ALLOWED_)) {
            return problem_store_rewrite_allowedP(store);
        }
        if (property.eql($TRANSFORMATION_ALLOWED_)) {
            return problem_store_transformation_allowedP(store);
        }
        if (property.eql($COMPUTE_ANSWER_JUSTIFICATIONS_)) {
            return problem_store_compute_answer_justificationsP(store);
        }
        assert NIL != inference_datastructures_enumerated_types.problem_store_property_p(property) : property;
        return Errors.error($str357$Problem_store_property__S_reflect, property);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 110700L)
    public static SubLObject possibly_optimize_problem_store(SubLObject store) {
        if (NIL != hashify_problem_storeP(store)) {
            hashify_problem_store(store);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111200L)
    public static SubLObject hashify_problem_storeP(SubLObject store) {
        return makeBoolean(problem_store_historical_problem_count(store).numG(Numbers.multiply($problem_store_hash_watermark$.getGlobalValue(), problem_store_problem_count(store))) && NIL == id_index.id_index_pessimized_p(problem_store_problem_id_index(store)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111400L)
    public static SubLObject hashify_problem_store(SubLObject store) {
        id_index.pessimize_id_index(problem_store_problem_id_index(store));
        id_index.pessimize_id_index(problem_store_link_id_index(store));
        id_index.pessimize_id_index(problem_store_proof_id_index(store));
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 111800L)
    public static SubLObject test_problem_store_property_value_support() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = NIL;
        SubLObject store = NIL;
        try {
            store = new_problem_store(NIL);
            SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
            SubLObject property = NIL;
            property = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject error_message = NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind($sym359$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            problem_store_property_value(store, property);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    failures = cons(cons(property, error_message), failures);
                }
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return failures;
    }

    public static SubLObject declare_inference_datastructures_problem_store_file() {
        declareFunction("new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false);
        declareFunction("index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false);
        declareFunction("unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false);
        declareFunction("find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
        declareFunction("problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false);
        declareFunction("problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false);
        declareFunction("most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false);
        declareMacro("do_all_problem_stores", "DO-ALL-PROBLEM-STORES");
        declareFunction("problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false);
        declareFunction("all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false);
        declareFunction("destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
        declareFunction("destroy_most_problem_stores", "DESTROY-MOST-PROBLEM-STORES", 0, 1, false);
        declareFunction("problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("problem_store_p", "PROBLEM-STORE-P", 1, 0, false);
        new $problem_store_p$UnaryFunction();
        declareFunction("prob_store_guid", "PROB-STORE-GUID", 1, 0, false);
        declareFunction("prob_store_suid", "PROB-STORE-SUID", 1, 0, false);
        declareFunction("prob_store_lock", "PROB-STORE-LOCK", 1, 0, false);
        declareFunction("prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false);
        declareFunction("prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false);
        declareFunction("prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false);
        declareFunction("prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false);
        declareFunction("prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false);
        declareFunction("prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false);
        declareFunction("prob_store_problems_by_query_index", "PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 1, 0, false);
        declareFunction("prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false);
        declareFunction("prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("prob_store_potentially_processed_problems", "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
        declareFunction("prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
        declareFunction("prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
        declareFunction("prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
        declareFunction("prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
        declareFunction("prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
        declareFunction("prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
        declareFunction("prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false);
        declareFunction("prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
        declareFunction("prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
        declareFunction("prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        declareFunction("prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
        declareFunction("prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction("prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false);
        declareFunction("prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction("prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        declareFunction("prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
        declareFunction("prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false);
        declareFunction("prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
        declareFunction("prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false);
        declareFunction("prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false);
        declareFunction("prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
        declareFunction("prob_store_historical_tactic_count", "PROB-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
        declareFunction("prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false);
        declareFunction("prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false);
        declareFunction("prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false);
        declareFunction("_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false);
        declareFunction("_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false);
        declareFunction("_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false);
        declareFunction("_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false);
        declareFunction("_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_problems_by_query_index", "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false);
        declareFunction("_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false);
        declareFunction("_csetf_prob_store_potentially_processed_problems", "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false);
        declareFunction("_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
        declareFunction("_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false);
        declareFunction("_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false);
        declareFunction("_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
        declareFunction("_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
        declareFunction("_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false);
        declareFunction("_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false);
        declareFunction("_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
        declareFunction("_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false);
        declareFunction("_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
        declareFunction("_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false);
        declareFunction("_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false);
        declareFunction("_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false);
        declareFunction("_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false);
        declareFunction("_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_prob_store_historical_tactic_count", "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT", 2, 0, false);
        declareFunction("_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false);
        declareFunction("_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false);
        declareFunction("_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false);
        declareFunction("make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false);
        declareFunction("visit_defstruct_problem_store", "VISIT-DEFSTRUCT-PROBLEM-STORE", 2, 0, false);
        declareFunction("visit_defstruct_object_problem_store_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
        declareFunction("valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false);
        declareFunction("id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false);
        declareFunction("problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false);
        declareFunction("print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false);
        declareFunction("sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false);
        declareMacro("with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD");
        declareFunction("problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false);
        declareMacro("with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE");
        declareFunction("problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false);
        declareMacro("with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
        declareFunction("problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
        declareFunction("set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
        declareMacro("with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION");
        declareMacro("do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES");
        declareFunction("problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false);
        declareMacro("do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES");
        declareFunction("problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false);
        declareMacro("do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS");
        declareMacro("do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS");
        declareFunction("problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false);
        declareMacro("do_problem_store_links", "DO-PROBLEM-STORE-LINKS");
        declareFunction("problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false);
        declareMacro("do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS");
        declareFunction("problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false);
        declareMacro("do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
        declareFunction("problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
        declareMacro("do_inference_strategies", "DO-INFERENCE-STRATEGIES");
        declareFunction("new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false);
        declareFunction("destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false);
        declareFunction("destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false);
        declareFunction("note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false);
        declareFunction("problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false);
        declareFunction("problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false);
        declareFunction("problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false);
        declareFunction("problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false);
        declareFunction("problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("problem_store_potentially_processed_problems", "PROBLEM-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
        declareFunction("problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
        declareFunction("problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
        declareFunction("problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
        declareFunction("problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
        declareFunction("problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
        declareFunction("problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
        declareFunction("problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
        declareFunction("problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
        declareFunction("problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
        declareFunction("problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
        declareFunction("problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
        declareFunction("problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction("problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false);
        declareFunction("problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
        declareFunction("problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
        declareFunction("problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false);
        declareFunction("problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
        declareFunction("problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false);
        declareFunction("problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false);
        declareFunction("note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
        declareFunction("set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
        declareFunction("set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
        declareFunction("set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
        declareFunction("set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false);
        declareFunction("set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
        declareFunction("note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false);
        declareFunction("note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false);
        declareFunction("reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false);
        declareFunction("problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false);
        declareFunction("problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false);
        declareFunction("new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false);
        declareFunction("problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
        declareFunction("problem_store_non_recursive_inference_count", "PROBLEM-STORE-NON-RECURSIVE-INFERENCE-COUNT", 1, 0, false);
        declareFunction("problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false);
        declareFunction("problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false);
        declareFunction("find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false);
        declareFunction("find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false);
        declareFunction("first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false);
        declareFunction("earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
        declareFunction("latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
        declareFunction("problem_store_running_inferences", "PROBLEM-STORE-RUNNING-INFERENCES", 1, 0, false);
        declareFunction("problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false);
        declareFunction("problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
        declareFunction("problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false);
        declareFunction("problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false);
        declareFunction("find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false);
        declareFunction("find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false);
        declareFunction("first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false);
        declareFunction("problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false);
        declareFunction("problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false);
        declareFunction("problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false);
        declareFunction("find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false);
        declareFunction("find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false);
        declareFunction("problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
        declareFunction("problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false);
        declareFunction("problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
        declareFunction("problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false);
        declareFunction("compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
        declareFunction("problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false);
        declareFunction("problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false);
        declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?", 1, 0, false);
        declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int_internal", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT-INTERNAL", 1, 0, false);
        declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT", 1, 0, false);
        declareFunction("problem_identity_depends_on_free_hl_varsP", "PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS?", 1, 0, false);
        declareFunction("find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false);
        declareFunction("find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false);
        declareFunction("find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 1, false);
        declareFunction("problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
        declareFunction("problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
        declareFunction("problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
        declareFunction("problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_historical_tactic_count", "PROBLEM-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_increment_historical_tactic_count", "PROBLEM-STORE-INCREMENT-HISTORICAL-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false);
        declareFunction("problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
        declareFunction("problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false);
        declareFunction("find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false);
        declareFunction("find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false);
        declareFunction("problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false);
        declareFunction("problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
        declareFunction("problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false);
        declareFunction("problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("problem_store_all_potentially_processed_problems", "PROBLEM-STORE-ALL-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
        declareFunction("problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false);
        declareFunction("problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        declareFunction("problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false);
        declareFunction("problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false);
        declareFunction("total_size_of_all_problem_stores", "TOTAL-SIZE-OF-ALL-PROBLEM-STORES", 0, 0, false);
        declareFunction("total_size_of_all_historical_problem_stores", "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES", 0, 0, false);
        declareFunction("problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false);
        declareFunction("problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false);
        declareFunction("problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false);
        declareFunction("problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false);
        declareFunction("problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false);
        declareFunction("problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false);
        declareFunction("problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
        declareFunction("problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false);
        declareFunction("problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false);
        declareFunction("problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false);
        declareFunction("problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false);
        declareFunction("problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false);
        declareFunction("problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false);
        declareFunction("problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false);
        declareFunction("problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 3, 0, false);
        declareFunction("clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
        declareFunction("problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false);
        declareFunction("proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false);
        declareFunction("non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false);
        declareFunction("unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false);
        declareFunction("note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false);
        declareFunction("note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false);
        declareFunction("problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false);
        declareFunction("problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false);
        declareFunction("problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false);
        declareFunction("problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false);
        declareFunction("problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false);
        declareFunction("problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false);
        declareFunction("problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false);
        declareFunction("problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false);
        declareFunction("add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false);
        declareFunction("remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false);
        declareFunction("add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false);
        declareFunction("remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false);
        declareFunction("add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
        declareFunction("remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
        declareFunction("add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
        declareFunction("remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
        declareFunction("add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false);
        declareFunction("remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false);
        declareFunction("add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false);
        declareFunction("problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false);
        declareFunction("problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false);
        declareFunction("problem_store_note_problem_potentially_processed", "PROBLEM-STORE-NOTE-PROBLEM-POTENTIALLY-PROCESSED", 2, 0, false);
        declareFunction("problem_store_note_problem_unprocessed", "PROBLEM-STORE-NOTE-PROBLEM-UNPROCESSED", 2, 0, false);
        declareFunction("problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false);
        declareFunction("problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false);
        declareFunction("proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false);
        declareFunction("reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
        declareFunction("problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
        declareFunction("problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
        declareFunction("problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false);
        declareFunction("add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
        declareFunction("remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
        declareFunction("finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction("add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
        declareFunction("remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
        declareFunction("add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false);
        declareFunction("problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false);
        declareFunction("problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false);
        declareFunction("ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false);
        declareFunction("ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false);
        declareFunction("ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false);
        declareFunction("ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false);
        declareFunction("problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false);
        new $problem_store_janitor_p$UnaryFunction();
        declareFunction("prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false);
        declareFunction("prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
        declareFunction("prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false);
        declareFunction("_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false);
        declareFunction("_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false);
        declareFunction("make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false);
        declareFunction("visit_defstruct_problem_store_janitor", "VISIT-DEFSTRUCT-PROBLEM-STORE-JANITOR", 2, 0, false);
        declareFunction("visit_defstruct_object_problem_store_janitor_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD", 2, 0, false);
        declareFunction("new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false);
        declareFunction("destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false);
        declareFunction("problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false);
        declareFunction("problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false);
        declareFunction("problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
        declareMacro("do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
        declareMacro("do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS");
        declareFunction("problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false);
        declareFunction("problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false);
        declareFunction("problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false);
        declareFunction("problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false);
        declareFunction("problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false);
        declareFunction("find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
        declareFunction("find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
        declareFunction("destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
        declareFunction("rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false);
        declareFunction("set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false);
        declareFunction("free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false);
        declareFunction("problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction("problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false);
        declareFunction("possibly_optimize_problem_store", "POSSIBLY-OPTIMIZE-PROBLEM-STORE", 1, 0, false);
        declareFunction("hashify_problem_storeP", "HASHIFY-PROBLEM-STORE?", 1, 0, false);
        declareFunction("hashify_problem_store", "HASHIFY-PROBLEM-STORE", 1, 0, false);
        declareFunction("test_problem_store_property_value_support", "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_store_file() {
        $problem_store_modification_permittedP$ = defparameter("*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL);
        $problem_store_multiple_subqueries_count$ = defparameter("*PROBLEM-STORE-MULTIPLE-SUBQUERIES-COUNT*", NIL);
        $problem_store_id_index$ = deflexical("*PROBLEM-STORE-ID-INDEX*", maybeDefault($sym0$_PROBLEM_STORE_ID_INDEX_, $problem_store_id_index$, () -> (id_index.new_id_index(UNPROVIDED, UNPROVIDED))));
        $dtp_problem_store$ = defconstant("*DTP-PROBLEM-STORE*", $sym22$PROBLEM_STORE);
        $default_problem_store_problem_size$ = deflexical("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int$80);
        $default_problem_store_link_size$ = deflexical("*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int$120);
        $default_problem_store_inference_size$ = deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER);
        $default_problem_store_strategy_size$ = deflexical("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue());
        $default_problem_store_proof_size$ = deflexical("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int$40);
        $problem_store_sbhl_resource_space_number$ = deflexical("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER);
        $max_proof_count_multiplier$ = deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", TEN_INTEGER);
        $disable_problem_store_allows_problem_hl_free_vars_optimizationP$ = SubLFiles.defparameter("*DISABLE-PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?*", NIL);
        $force_problem_identity_depends_on_free_hl_vars$ = SubLFiles.defparameter("*FORCE-PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS*", NIL);
        $dtp_problem_store_janitor$ = defconstant("*DTP-PROBLEM-STORE-JANITOR*", $sym325$PROBLEM_STORE_JANITOR);
        $problem_store_id_to_name_table$ = deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", maybeDefault($sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_, $problem_store_id_to_name_table$, () -> (Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED))));
        $problem_store_name_to_id_table$ = deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", maybeDefault($sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_, $problem_store_name_to_id_table$, () -> (Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQUAL), UNPROVIDED))));
        $problem_store_hash_watermark$ = deflexical("*PROBLEM-STORE-HASH-WATERMARK*", $int$50);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_store_file() {
        subl_macro_promotions.declare_defglobal($sym0$_PROBLEM_STORE_ID_INDEX_);
        access_macros.register_macro_helper($sym9$PROBLEM_STORE_ID_INDEX, $sym10$DO_ALL_PROBLEM_STORES);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list59);
        Structures.def_csetf($sym60$PROB_STORE_GUID, $sym61$_CSETF_PROB_STORE_GUID);
        Structures.def_csetf($sym62$PROB_STORE_SUID, $sym63$_CSETF_PROB_STORE_SUID);
        Structures.def_csetf($sym64$PROB_STORE_LOCK, $sym65$_CSETF_PROB_STORE_LOCK);
        Structures.def_csetf($sym66$PROB_STORE_CREATION_TIME, $sym67$_CSETF_PROB_STORE_CREATION_TIME);
        Structures.def_csetf($sym68$PROB_STORE_INFERENCE_ID_INDEX, $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX);
        Structures.def_csetf($sym70$PROB_STORE_STRATEGY_ID_INDEX, $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX);
        Structures.def_csetf($sym72$PROB_STORE_PROBLEM_ID_INDEX, $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX);
        Structures.def_csetf($sym74$PROB_STORE_LINK_ID_INDEX, $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX);
        Structures.def_csetf($sym76$PROB_STORE_PROOF_ID_INDEX, $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX);
        Structures.def_csetf($sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX, $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX);
        Structures.def_csetf($sym80$PROB_STORE_REJECTED_PROOFS, $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS);
        Structures.def_csetf($sym82$PROB_STORE_PROCESSED_PROOFS, $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS);
        Structures.def_csetf($sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS, $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS);
        Structures.def_csetf($sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
        Structures.def_csetf($sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX);
        Structures.def_csetf($sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED);
        Structures.def_csetf($sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX, $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX);
        Structures.def_csetf($sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX);
        Structures.def_csetf($sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX);
        Structures.def_csetf($sym98$PROB_STORE_MIN_DEPTH_INDEX, $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX);
        Structures.def_csetf($sym100$PROB_STORE_EQUALITY_REASONING_METHOD, $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD);
        Structures.def_csetf($sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN, $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN);
        Structures.def_csetf($sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL);
        Structures.def_csetf($sym106$PROB_STORE_MAX_PROBLEM_COUNT, $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT);
        Structures.def_csetf($sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT);
        Structures.def_csetf($sym110$PROB_STORE_REMOVAL_ALLOWED_, $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
        Structures.def_csetf($sym112$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
        Structures.def_csetf($sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
        Structures.def_csetf($sym116$PROB_STORE_NEGATION_BY_FAILURE_, $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
        Structures.def_csetf($sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
        Structures.def_csetf($sym120$PROB_STORE_DIRECTION, $sym121$_CSETF_PROB_STORE_DIRECTION);
        Structures.def_csetf($sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
        Structures.def_csetf($sym124$PROB_STORE_REWRITE_ALLOWED_, $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
        Structures.def_csetf($sym126$PROB_STORE_ABDUCTION_ALLOWED_, $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
        Structures.def_csetf($sym128$PROB_STORE_NEW_TERMS_ALLOWED_, $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
        Structures.def_csetf($sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
        Structures.def_csetf($sym132$PROB_STORE_MEMOIZATION_STATE, $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE);
        Structures.def_csetf($sym134$PROB_STORE_SBHL_RESOURCE_SPACE, $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE);
        Structures.def_csetf($sym136$PROB_STORE_PREPARED_, $sym137$_CSETF_PROB_STORE_PREPARED_);
        Structures.def_csetf($sym138$PROB_STORE_DESTRUCTION_IMMINENT_, $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
        Structures.def_csetf($sym140$PROB_STORE_META_PROBLEM_STORE, $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE);
        Structures.def_csetf($sym142$PROB_STORE_STATIC_PROPERTIES, $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES);
        Structures.def_csetf($sym144$PROB_STORE_JANITOR, $sym145$_CSETF_PROB_STORE_JANITOR);
        Structures.def_csetf($sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS, $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS);
        Structures.def_csetf($sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT, $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT);
        Structures.def_csetf($sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX);
        Structures.def_csetf($sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES);
        Structures.def_csetf($sym154$PROB_STORE_PROOF_KEEPING_INDEX, $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX);
        Equality.identity($sym22$PROBLEM_STORE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym213$SXHASH_PROBLEM_STORE_METHOD));
        access_macros.register_macro_helper($sym216$PROBLEM_STORE_LOCK, $sym217$WITH_PROBLEM_STORE_LOCK_HELD);
        access_macros.register_macro_helper($sym220$PROBLEM_STORE_MEMOIZATION_STATE, $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE);
        access_macros.register_macro_helper($sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
        access_macros.register_macro_helper($sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
        access_macros.register_macro_helper($sym231$PROBLEM_STORE_INFERENCE_ID_INDEX, $sym232$DO_PROBLEM_STORE_INFERENCES);
        access_macros.register_macro_helper($sym235$PROBLEM_STORE_STRATEGY_ID_INDEX, $sym236$DO_PROBLEM_STORE_STRATEGIES);
        access_macros.register_macro_helper($sym244$PROBLEM_STORE_PROBLEM_ID_INDEX, $sym245$DO_PROBLEM_STORE_PROBLEMS);
        access_macros.register_macro_helper($sym250$PROBLEM_STORE_LINK_ID_INDEX, $sym251$DO_PROBLEM_STORE_LINKS);
        access_macros.register_macro_helper($sym258$PROBLEM_STORE_PROOF_ID_INDEX, $sym259$DO_PROBLEM_STORE_PROOFS);
        access_macros.register_macro_helper($sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS);
        memoization_state.note_memoized_function($sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT);
        memoization_state.note_memoized_function($sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED);
        memoization_state.note_memoized_function($sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), Symbols.symbol_function($sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list333);
        Structures.def_csetf($sym334$PROB_STORE_JANITOR_STORE, $sym335$_CSETF_PROB_STORE_JANITOR_STORE);
        Structures.def_csetf($sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
        Structures.def_csetf($sym338$PROB_STORE_JANITOR_STALE_, $sym339$_CSETF_PROB_STORE_JANITOR_STALE_);
        Equality.identity($sym325$PROBLEM_STORE_JANITOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), Symbols.symbol_function($sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD));
        access_macros.register_macro_helper($sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
        subl_macro_promotions.declare_defglobal($sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_);
        subl_macro_promotions.declare_defglobal($sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_);
        access_macros.register_external_symbol($sym352$FIND_PROBLEM_STORE_BY_NAME);
        access_macros.register_external_symbol($sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME);
        access_macros.register_external_symbol($sym355$DESTROY_PROBLEM_STORE_BY_NAME);
        generic_testing.define_test_case_table_int($sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list367);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_problem_store_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_problem_store_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_problem_store_file();
    }

    static {
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
        $sym0$_PROBLEM_STORE_ID_INDEX_ = makeSymbol("*PROBLEM-STORE-ID-INDEX*");
        $list1 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list2 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym5$ID = makeUninternedSymbol("ID");
        $sym6$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
        $list7 = list(makeSymbol("PROBLEM-STORE-ID-INDEX"));
        $sym8$IGNORE = makeSymbol("IGNORE");
        $sym9$PROBLEM_STORE_ID_INDEX = makeSymbol("PROBLEM-STORE-ID-INDEX");
        $sym10$DO_ALL_PROBLEM_STORES = makeSymbol("DO-ALL-PROBLEM-STORES");
        $str11$Destroying_all_ = makeString("Destroying all ");
        $str12$_problem_stores = makeString(" problem stores");
        $str13$cdolist = makeString("cdolist");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym15$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym16$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym17$_ = makeSymbol(">");
        $sym18$PROBLEM_STORE_CREATION_TIME = makeSymbol("PROBLEM-STORE-CREATION-TIME");
        $str19$Destroying_ = makeString("Destroying ");
        $str20$_problem_stores__all_but_the_last = makeString(" problem stores (all but the last ");
        $str21$_ = makeString(")");
        $sym22$PROBLEM_STORE = makeSymbol("PROBLEM-STORE");
        $sym23$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $list24 = list(new SubLObject[] { makeSymbol("GUID"), makeSymbol("SUID"), makeSymbol("LOCK"), makeSymbol("CREATION-TIME"), makeSymbol("INFERENCE-ID-INDEX"), makeSymbol("STRATEGY-ID-INDEX"), makeSymbol("PROBLEM-ID-INDEX"), makeSymbol("LINK-ID-INDEX"), makeSymbol("PROOF-ID-INDEX"),
                makeSymbol("PROBLEMS-BY-QUERY-INDEX"), makeSymbol("REJECTED-PROOFS"), makeSymbol("PROCESSED-PROOFS"), makeSymbol("POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-INDEX"),
                makeSymbol("MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("MIN-PROOF-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("MIN-DEPTH-INDEX"), makeSymbol("EQUALITY-REASONING-METHOD"),
                makeSymbol("EQUALITY-REASONING-DOMAIN"), makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("MAX-PROBLEM-COUNT"), makeSymbol("CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("REMOVAL-ALLOWED?"), makeSymbol("TRANSFORMATION-ALLOWED?"),
                makeSymbol("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("NEGATION-BY-FAILURE?"), makeSymbol("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("DIRECTION"), makeSymbol("EVALUATE-SUBL-ALLOWED?"), makeSymbol("REWRITE-ALLOWED?"), makeSymbol("ABDUCTION-ALLOWED?"),
                makeSymbol("NEW-TERMS-ALLOWED?"), makeSymbol("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE-SPACE"), makeSymbol("PREPARED?"), makeSymbol("DESTRUCTION-IMMINENT?"), makeSymbol("META-PROBLEM-STORE"), makeSymbol("STATIC-PROPERTIES"),
                makeSymbol("JANITOR"), makeSymbol("HISTORICAL-ROOT-PROBLEMS"), makeSymbol("HISTORICAL-TACTIC-COUNT"), makeSymbol("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROOF-KEEPING-INDEX") });
        $list25 = list(new SubLObject[] { makeKeyword("GUID"), makeKeyword("SUID"), makeKeyword("LOCK"), makeKeyword("CREATION-TIME"), makeKeyword("INFERENCE-ID-INDEX"), makeKeyword("STRATEGY-ID-INDEX"), makeKeyword("PROBLEM-ID-INDEX"), makeKeyword("LINK-ID-INDEX"), makeKeyword("PROOF-ID-INDEX"),
                makeKeyword("PROBLEMS-BY-QUERY-INDEX"), makeKeyword("REJECTED-PROOFS"), makeKeyword("PROCESSED-PROOFS"), makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX"),
                makeKeyword("MOST-RECENT-TACTIC-EXECUTED"), makeKeyword("MIN-PROOF-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeKeyword("MIN-DEPTH-INDEX"), makeKeyword("EQUALITY-REASONING-METHOD"),
                makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("CRAZY-MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"),
                makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"),
                makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE-SPACE"), makeKeyword("PREPARED?"), makeKeyword("DESTRUCTION-IMMINENT?"), makeKeyword("META-PROBLEM-STORE"), makeKeyword("STATIC-PROPERTIES"),
                makeKeyword("JANITOR"), makeKeyword("HISTORICAL-ROOT-PROBLEMS"), makeKeyword("HISTORICAL-TACTIC-COUNT"), makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeKeyword("PROOF-KEEPING-INDEX") });
        $list26 = list(new SubLObject[] { makeSymbol("PROB-STORE-GUID"), makeSymbol("PROB-STORE-SUID"), makeSymbol("PROB-STORE-LOCK"), makeSymbol("PROB-STORE-CREATION-TIME"), makeSymbol("PROB-STORE-INFERENCE-ID-INDEX"), makeSymbol("PROB-STORE-STRATEGY-ID-INDEX"),
                makeSymbol("PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("PROB-STORE-LINK-ID-INDEX"), makeSymbol("PROB-STORE-PROOF-ID-INDEX"), makeSymbol("PROB-STORE-PROBLEMS-BY-QUERY-INDEX"), makeSymbol("PROB-STORE-REJECTED-PROOFS"), makeSymbol("PROB-STORE-PROCESSED-PROOFS"),
                makeSymbol("PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX"),
                makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN"),
                makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?"),
                makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("PROB-STORE-DIRECTION"), makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?"),
                makeSymbol("PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("PROB-STORE-MEMOIZATION-STATE"), makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE"),
                makeSymbol("PROB-STORE-PREPARED?"), makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("PROB-STORE-META-PROBLEM-STORE"), makeSymbol("PROB-STORE-STATIC-PROPERTIES"), makeSymbol("PROB-STORE-JANITOR"), makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS"),
                makeSymbol("PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX") });
        $list27 = list(new SubLObject[] { makeSymbol("_CSETF-PROB-STORE-GUID"), makeSymbol("_CSETF-PROB-STORE-SUID"), makeSymbol("_CSETF-PROB-STORE-LOCK"), makeSymbol("_CSETF-PROB-STORE-CREATION-TIME"), makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX"),
                makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX"),
                makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"),
                makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"),
                makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN"),
                makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?"),
                makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-DIRECTION"),
                makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"),
                makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE"), makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("_CSETF-PROB-STORE-PREPARED?"), makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE"),
                makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES"), makeSymbol("_CSETF-PROB-STORE-JANITOR"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"),
                makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX") });
        $sym28$PRINT_PROBLEM_STORE = makeSymbol("PRINT-PROBLEM-STORE");
        $int$21 = makeInteger(21);
        $int$22 = makeInteger(22);
        $int$23 = makeInteger(23);
        $int$24 = makeInteger(24);
        $int$25 = makeInteger(25);
        $int$26 = makeInteger(26);
        $int$27 = makeInteger(27);
        $int$28 = makeInteger(28);
        $int$29 = makeInteger(29);
        $int$30 = makeInteger(30);
        $int$31 = makeInteger(31);
        $int$32 = makeInteger(32);
        $int$33 = makeInteger(33);
        $int$34 = makeInteger(34);
        $int$35 = makeInteger(35);
        $int$36 = makeInteger(36);
        $int$37 = makeInteger(37);
        $int$38 = makeInteger(38);
        $int$39 = makeInteger(39);
        $int$40 = makeInteger(40);
        $int$41 = makeInteger(41);
        $int$42 = makeInteger(42);
        $int$43 = makeInteger(43);
        $int$44 = makeInteger(44);
        $int$45 = makeInteger(45);
        $int$46 = makeInteger(46);
        $int$47 = makeInteger(47);
        $int$48 = makeInteger(48);
        $int$49 = makeInteger(49);
        $sym58$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE");
        $list59 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-STORE-P"));
        $sym60$PROB_STORE_GUID = makeSymbol("PROB-STORE-GUID");
        $sym61$_CSETF_PROB_STORE_GUID = makeSymbol("_CSETF-PROB-STORE-GUID");
        $sym62$PROB_STORE_SUID = makeSymbol("PROB-STORE-SUID");
        $sym63$_CSETF_PROB_STORE_SUID = makeSymbol("_CSETF-PROB-STORE-SUID");
        $sym64$PROB_STORE_LOCK = makeSymbol("PROB-STORE-LOCK");
        $sym65$_CSETF_PROB_STORE_LOCK = makeSymbol("_CSETF-PROB-STORE-LOCK");
        $sym66$PROB_STORE_CREATION_TIME = makeSymbol("PROB-STORE-CREATION-TIME");
        $sym67$_CSETF_PROB_STORE_CREATION_TIME = makeSymbol("_CSETF-PROB-STORE-CREATION-TIME");
        $sym68$PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("PROB-STORE-INFERENCE-ID-INDEX");
        $sym69$_CSETF_PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX");
        $sym70$PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("PROB-STORE-STRATEGY-ID-INDEX");
        $sym71$_CSETF_PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX");
        $sym72$PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("PROB-STORE-PROBLEM-ID-INDEX");
        $sym73$_CSETF_PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX");
        $sym74$PROB_STORE_LINK_ID_INDEX = makeSymbol("PROB-STORE-LINK-ID-INDEX");
        $sym75$_CSETF_PROB_STORE_LINK_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX");
        $sym76$PROB_STORE_PROOF_ID_INDEX = makeSymbol("PROB-STORE-PROOF-ID-INDEX");
        $sym77$_CSETF_PROB_STORE_PROOF_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX");
        $sym78$PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol("PROB-STORE-PROBLEMS-BY-QUERY-INDEX");
        $sym79$_CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX");
        $sym80$PROB_STORE_REJECTED_PROOFS = makeSymbol("PROB-STORE-REJECTED-PROOFS");
        $sym81$_CSETF_PROB_STORE_REJECTED_PROOFS = makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS");
        $sym82$PROB_STORE_PROCESSED_PROOFS = makeSymbol("PROB-STORE-PROCESSED-PROOFS");
        $sym83$_CSETF_PROB_STORE_PROCESSED_PROOFS = makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS");
        $sym84$PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol("PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS");
        $sym85$_CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS");
        $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
        $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
        $sym88$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");
        $sym89$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");
        $sym90$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");
        $sym91$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");
        $sym92$PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX");
        $sym93$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX");
        $sym94$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");
        $sym95$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");
        $sym96$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
        $sym97$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
        $sym98$PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-DEPTH-INDEX");
        $sym99$_CSETF_PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX");
        $sym100$PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD");
        $sym101$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD");
        $sym102$PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN");
        $sym103$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN");
        $sym104$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $sym105$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $sym106$PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT");
        $sym107$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT");
        $sym108$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");
        $sym109$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");
        $sym110$PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("PROB-STORE-REMOVAL-ALLOWED?");
        $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?");
        $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?");
        $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?");
        $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $sym116$PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?");
        $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?");
        $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");
        $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");
        $sym120$PROB_STORE_DIRECTION = makeSymbol("PROB-STORE-DIRECTION");
        $sym121$_CSETF_PROB_STORE_DIRECTION = makeSymbol("_CSETF-PROB-STORE-DIRECTION");
        $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?");
        $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?");
        $sym124$PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("PROB-STORE-REWRITE-ALLOWED?");
        $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?");
        $sym126$PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?");
        $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?");
        $sym128$PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?");
        $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?");
        $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");
        $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");
        $sym132$PROB_STORE_MEMOIZATION_STATE = makeSymbol("PROB-STORE-MEMOIZATION-STATE");
        $sym133$_CSETF_PROB_STORE_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE");
        $sym134$PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE");
        $sym135$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE");
        $sym136$PROB_STORE_PREPARED_ = makeSymbol("PROB-STORE-PREPARED?");
        $sym137$_CSETF_PROB_STORE_PREPARED_ = makeSymbol("_CSETF-PROB-STORE-PREPARED?");
        $sym138$PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?");
        $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?");
        $sym140$PROB_STORE_META_PROBLEM_STORE = makeSymbol("PROB-STORE-META-PROBLEM-STORE");
        $sym141$_CSETF_PROB_STORE_META_PROBLEM_STORE = makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE");
        $sym142$PROB_STORE_STATIC_PROPERTIES = makeSymbol("PROB-STORE-STATIC-PROPERTIES");
        $sym143$_CSETF_PROB_STORE_STATIC_PROPERTIES = makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES");
        $sym144$PROB_STORE_JANITOR = makeSymbol("PROB-STORE-JANITOR");
        $sym145$_CSETF_PROB_STORE_JANITOR = makeSymbol("_CSETF-PROB-STORE-JANITOR");
        $sym146$PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS");
        $sym147$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS");
        $sym148$PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol("PROB-STORE-HISTORICAL-TACTIC-COUNT");
        $sym149$_CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol("_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT");
        $sym150$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");
        $sym151$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");
        $sym152$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");
        $sym153$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");
        $sym154$PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX");
        $sym155$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX");
        $GUID = makeKeyword("GUID");
        $SUID = makeKeyword("SUID");
        $LOCK = makeKeyword("LOCK");
        $CREATION_TIME = makeKeyword("CREATION-TIME");
        $INFERENCE_ID_INDEX = makeKeyword("INFERENCE-ID-INDEX");
        $STRATEGY_ID_INDEX = makeKeyword("STRATEGY-ID-INDEX");
        $PROBLEM_ID_INDEX = makeKeyword("PROBLEM-ID-INDEX");
        $LINK_ID_INDEX = makeKeyword("LINK-ID-INDEX");
        $PROOF_ID_INDEX = makeKeyword("PROOF-ID-INDEX");
        $PROBLEMS_BY_QUERY_INDEX = makeKeyword("PROBLEMS-BY-QUERY-INDEX");
        $REJECTED_PROOFS = makeKeyword("REJECTED-PROOFS");
        $PROCESSED_PROOFS = makeKeyword("PROCESSED-PROOFS");
        $POTENTIALLY_PROCESSED_PROBLEMS = makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS");
        $NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
        $NON_EXPLANATORY_SUBPROOFS_INDEX = makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX");
        $MOST_RECENT_TACTIC_EXECUTED = makeKeyword("MOST-RECENT-TACTIC-EXECUTED");
        $MIN_PROOF_DEPTH_INDEX = makeKeyword("MIN-PROOF-DEPTH-INDEX");
        $MIN_TRANSFORMATION_DEPTH_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX");
        $MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
        $MIN_DEPTH_INDEX = makeKeyword("MIN-DEPTH-INDEX");
        $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");
        $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");
        $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
        $CRAZY_MAX_PROBLEM_COUNT = makeKeyword("CRAZY-MAX-PROBLEM-COUNT");
        $REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
        $COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $DIRECTION = makeKeyword("DIRECTION");
        $EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
        $ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
        $NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
        $COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $MEMOIZATION_STATE = makeKeyword("MEMOIZATION-STATE");
        $SBHL_RESOURCE_SPACE = makeKeyword("SBHL-RESOURCE-SPACE");
        $PREPARED_ = makeKeyword("PREPARED?");
        $DESTRUCTION_IMMINENT_ = makeKeyword("DESTRUCTION-IMMINENT?");
        $META_PROBLEM_STORE = makeKeyword("META-PROBLEM-STORE");
        $STATIC_PROPERTIES = makeKeyword("STATIC-PROPERTIES");
        $JANITOR = makeKeyword("JANITOR");
        $HISTORICAL_ROOT_PROBLEMS = makeKeyword("HISTORICAL-ROOT-PROBLEMS");
        $HISTORICAL_TACTIC_COUNT = makeKeyword("HISTORICAL-TACTIC-COUNT");
        $COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX");
        $COMPLEX_PROBLEM_QUERY_SIGNATURES = makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES");
        $PROOF_KEEPING_INDEX = makeKeyword("PROOF-KEEPING-INDEX");
        $str204$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym206$MAKE_PROBLEM_STORE = makeSymbol("MAKE-PROBLEM-STORE");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym209$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD");
        $FREE = makeKeyword("FREE");
        $str211$_Invalid_PROBLEM_STORE__s_ = makeString("<Invalid PROBLEM STORE ~s>");
        $str212$_PROBLEM_STORE__a_size__a_ = makeString("<PROBLEM STORE ~a size=~a>");
        $sym213$SXHASH_PROBLEM_STORE_METHOD = makeSymbol("SXHASH-PROBLEM-STORE-METHOD");
        $list214 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym215$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
        $sym216$PROBLEM_STORE_LOCK = makeSymbol("PROBLEM-STORE-LOCK");
        $sym217$WITH_PROBLEM_STORE_LOCK_HELD = makeSymbol("WITH-PROBLEM-STORE-LOCK-HELD");
        $list218 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym219$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
        $sym220$PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("PROBLEM-STORE-MEMOIZATION-STATE");
        $sym221$WITH_PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-STORE-MEMOIZATION-STATE");
        $sym222$SPACE_VAR = makeUninternedSymbol("SPACE-VAR");
        $sym223$CLET = makeSymbol("CLET");
        $sym224$PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROBLEM-STORE-SBHL-RESOURCE-SPACE");
        $sym225$WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");
        $sym226$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
        $sym227$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
        $sym228$STORE_VAR = makeUninternedSymbol("STORE-VAR");
        $list229 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym230$ID = makeUninternedSymbol("ID");
        $sym231$PROBLEM_STORE_INFERENCE_ID_INDEX = makeSymbol("PROBLEM-STORE-INFERENCE-ID-INDEX");
        $sym232$DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");
        $list233 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym234$ID = makeUninternedSymbol("ID");
        $sym235$PROBLEM_STORE_STRATEGY_ID_INDEX = makeSymbol("PROBLEM-STORE-STRATEGY-ID-INDEX");
        $sym236$DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");
        $list237 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym238$PUNLESS = makeSymbol("PUNLESS");
        $list239 = list(makeKeyword("TACTICAL"));
        $list240 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list241 = list(makeKeyword("ORDERED"), makeKeyword("DONE"));
        $ORDERED = makeKeyword("ORDERED");
        $sym243$ID = makeUninternedSymbol("ID");
        $sym244$PROBLEM_STORE_PROBLEM_ID_INDEX = makeSymbol("PROBLEM-STORE-PROBLEM-ID-INDEX");
        $sym245$DO_PROBLEM_STORE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-PROBLEMS");
        $list246 = list(list(makeSymbol("LINK-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list247 = list(makeKeyword("TYPE"), makeKeyword("ORDERED"), makeKeyword("DONE"));
        $TYPE = makeKeyword("TYPE");
        $sym249$ID = makeUninternedSymbol("ID");
        $sym250$PROBLEM_STORE_LINK_ID_INDEX = makeSymbol("PROBLEM-STORE-LINK-ID-INDEX");
        $sym251$DO_PROBLEM_STORE_LINKS = makeSymbol("DO-PROBLEM-STORE-LINKS");
        $sym252$PWHEN = makeSymbol("PWHEN");
        $sym253$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");
        $list254 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list255 = list(makeKeyword("PROOF-STATUS"), makeKeyword("ORDERED"), makeKeyword("DONE"));
        $PROOF_STATUS = makeKeyword("PROOF-STATUS");
        $sym257$ID = makeUninternedSymbol("ID");
        $sym258$PROBLEM_STORE_PROOF_ID_INDEX = makeSymbol("PROBLEM-STORE-PROOF-ID-INDEX");
        $sym259$DO_PROBLEM_STORE_PROOFS = makeSymbol("DO-PROBLEM-STORE-PROOFS");
        $sym260$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
        $list261 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym262$DO_SET = makeSymbol("DO-SET");
        $sym263$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
        $sym264$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
        $list265 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym266$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
        $sym267$INFERENCE_STRATEGY_SET = makeSymbol("INFERENCE-STRATEGY-SET");
        $int$80 = makeInteger(80);
        $int$120 = makeInteger(120);
        $sym270$PROBLEM_STORE_PROPERTIES_P = makeSymbol("PROBLEM-STORE-PROPERTIES-P");
        $sym271$PROBLEM_STORE_NAME_P = makeSymbol("PROBLEM-STORE-NAME-P");
        $str272$A_problem_store_named__s_already_ = makeString("A problem store named ~s already exists.");
        $str273$Problem_Store_Lock = makeString("Problem Store Lock");
        $sym274$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-METHOD-P");
        $sym275$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P");
        $NONE = makeKeyword("NONE");
        $EMPTY_DOMAIN = makeKeyword("EMPTY-DOMAIN");
        $sym278$INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL-P");
        $sym279$MAX_PROBLEM_COUNT_P = makeSymbol("MAX-PROBLEM-COUNT-P");
        $sym280$BOOLEANP = makeSymbol("BOOLEANP");
        $sym281$INFERENCE_DIRECTION_P = makeSymbol("INFERENCE-DIRECTION-P");
        $str282$problem_store_memoization_state = makeString("problem store memoization state");
        $str283$problem_store_memoization_lock = makeString("problem store memoization lock");
        $str284$Destroying_problem_store__S_at_le = makeString("Destroying problem store ~S at least one running inference ~S");
        $SKIP = makeKeyword("SKIP");
        $sym286$TACTIC_P = makeSymbol("TACTIC-P");
        $sym287$NEW_PROBLEM_STORE_P = makeSymbol("NEW-PROBLEM-STORE-P");
        $FORWARD = makeKeyword("FORWARD");
        $MOTIVATING_TACTIC = makeKeyword("MOTIVATING-TACTIC");
        $TACTICAL = makeKeyword("TACTICAL");
        $CONTENT = makeKeyword("CONTENT");
        $ANSWER = makeKeyword("ANSWER");
        $REMOVAL = makeKeyword("REMOVAL");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $REWRITE = makeKeyword("REWRITE");
        $STRUCTURAL = makeKeyword("STRUCTURAL");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $JOIN = makeKeyword("JOIN");
        $SPLIT = makeKeyword("SPLIT");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $UNION = makeKeyword("UNION");
        $int$212 = makeInteger(212);
        $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT = makeSymbol("PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $EXECUTED = makeKeyword("EXECUTED");
        $DISCARDED = makeKeyword("DISCARDED");
        $sym309$_ = makeSymbol("<");
        $sym310$PROOF_SUID = makeSymbol("PROOF-SUID");
        $sym311$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $sym312$PROBLEM_STORE_SIZE = makeSymbol("PROBLEM-STORE-SIZE");
        $sym313$PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $NON_PROOF_KEEPING = makeKeyword("NON-PROOF-KEEPING");
        $list317 = list(makeKeyword("NON-PROOF-KEEPING"), makeKeyword("UNKNOWN"));
        $str318$Invalid_proof_keeping_reason__a_f = makeString("Invalid proof-keeping reason ~a for problem ~a");
        $sym319$PROOF_REJECTED_ = makeSymbol("PROOF-REJECTED?");
        $sym320$PROOF_P = makeSymbol("PROOF-P");
        $sym321$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym322$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED");
        $sym323$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED");
        $int$100 = makeInteger(100);
        $sym325$PROBLEM_STORE_JANITOR = makeSymbol("PROBLEM-STORE-JANITOR");
        $sym326$PROBLEM_STORE_JANITOR_P = makeSymbol("PROBLEM-STORE-JANITOR-P");
        $list327 = list(makeSymbol("STORE"), makeSymbol("INDESTRUCTIBLE-PROBLEMS"), makeSymbol("STALE?"));
        $list328 = list(makeKeyword("STORE"), makeKeyword("INDESTRUCTIBLE-PROBLEMS"), makeKeyword("STALE?"));
        $list329 = list(makeSymbol("PROB-STORE-JANITOR-STORE"), makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("PROB-STORE-JANITOR-STALE?"));
        $list330 = list(makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE"), makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?"));
        $sym331$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym332$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE");
        $list333 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-STORE-JANITOR-P"));
        $sym334$PROB_STORE_JANITOR_STORE = makeSymbol("PROB-STORE-JANITOR-STORE");
        $sym335$_CSETF_PROB_STORE_JANITOR_STORE = makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE");
        $sym336$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
        $sym337$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
        $sym338$PROB_STORE_JANITOR_STALE_ = makeSymbol("PROB-STORE-JANITOR-STALE?");
        $sym339$_CSETF_PROB_STORE_JANITOR_STALE_ = makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?");
        $STORE = makeKeyword("STORE");
        $INDESTRUCTIBLE_PROBLEMS = makeKeyword("INDESTRUCTIBLE-PROBLEMS");
        $STALE_ = makeKeyword("STALE?");
        $sym343$MAKE_PROBLEM_STORE_JANITOR = makeSymbol("MAKE-PROBLEM-STORE-JANITOR");
        $sym344$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD");
        $sym345$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
        $sym346$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
        $list347 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("JANITOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym348$PROBLEM_STORE_JANITOR_STORE = makeSymbol("PROBLEM-STORE-JANITOR-STORE");
        $sym349$PROBLEM_DESTRUCTIBLE_ = makeSymbol("PROBLEM-DESTRUCTIBLE?");
        $sym350$_PROBLEM_STORE_ID_TO_NAME_TABLE_ = makeSymbol("*PROBLEM-STORE-ID-TO-NAME-TABLE*");
        $sym351$_PROBLEM_STORE_NAME_TO_ID_TABLE_ = makeSymbol("*PROBLEM-STORE-NAME-TO-ID-TABLE*");
        $sym352$FIND_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-PROBLEM-STORE-BY-NAME");
        $sym353$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-OR-CREATE-PROBLEM-STORE-BY-NAME");
        $PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");
        $sym355$DESTROY_PROBLEM_STORE_BY_NAME = makeSymbol("DESTROY-PROBLEM-STORE-BY-NAME");
        $sym356$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $str357$Problem_store_property__S_reflect = makeString("Problem store property ~S reflection is not yet supported");
        $int$50 = makeInteger(50);
        $sym359$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym360$TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT = makeSymbol("TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT");
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $TINY = makeKeyword("TINY");
        $WORKING_ = makeKeyword("WORKING?");
        $list367 = list(list(NIL, NIL));
    }

    public static class $problem_store_native extends SubLStructNative {
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
        private static SubLStructDeclNative structDecl;

        public $problem_store_native() {
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
        public SubLStructDecl getStructDecl() {
            return $problem_store_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$guid;
        }

        @Override
        public SubLObject getField3() {
            return this.$suid;
        }

        @Override
        public SubLObject getField4() {
            return this.$lock;
        }

        @Override
        public SubLObject getField5() {
            return this.$creation_time;
        }

        @Override
        public SubLObject getField6() {
            return this.$inference_id_index;
        }

        @Override
        public SubLObject getField7() {
            return this.$strategy_id_index;
        }

        @Override
        public SubLObject getField8() {
            return this.$problem_id_index;
        }

        @Override
        public SubLObject getField9() {
            return this.$link_id_index;
        }

        @Override
        public SubLObject getField10() {
            return this.$proof_id_index;
        }

        @Override
        public SubLObject getField11() {
            return this.$problems_by_query_index;
        }

        @Override
        public SubLObject getField12() {
            return this.$rejected_proofs;
        }

        @Override
        public SubLObject getField13() {
            return this.$processed_proofs;
        }

        @Override
        public SubLObject getField14() {
            return this.$potentially_processed_problems;
        }

        @Override
        public SubLObject getField15() {
            return this.$non_explanatory_subproofs_possibleP;
        }

        @Override
        public SubLObject getField16() {
            return this.$non_explanatory_subproofs_index;
        }

        @Override
        public SubLObject getField17() {
            return this.$most_recent_tactic_executed;
        }

        @Override
        public SubLObject getField18() {
            return this.$min_proof_depth_index;
        }

        @Override
        public SubLObject getField19() {
            return this.$min_transformation_depth_index;
        }

        @Override
        public SubLObject getField20() {
            return this.$min_transformation_depth_signature_index;
        }

        public SubLObject getField21() {
            return this.$min_depth_index;
        }

        public SubLObject getField22() {
            return this.$equality_reasoning_method;
        }

        public SubLObject getField23() {
            return this.$equality_reasoning_domain;
        }

        public SubLObject getField24() {
            return this.$intermediate_step_validation_level;
        }

        public SubLObject getField25() {
            return this.$max_problem_count;
        }

        public SubLObject getField26() {
            return this.$crazy_max_problem_count;
        }

        public SubLObject getField27() {
            return this.$removal_allowedP;
        }

        public SubLObject getField28() {
            return this.$transformation_allowedP;
        }

        public SubLObject getField29() {
            return this.$add_restriction_layer_of_indirectionP;
        }

        public SubLObject getField30() {
            return this.$negation_by_failureP;
        }

        public SubLObject getField31() {
            return this.$completeness_minimization_allowedP;
        }

        public SubLObject getField32() {
            return this.$direction;
        }

        public SubLObject getField33() {
            return this.$evaluate_subl_allowedP;
        }

        public SubLObject getField34() {
            return this.$rewrite_allowedP;
        }

        public SubLObject getField35() {
            return this.$abduction_allowedP;
        }

        public SubLObject getField36() {
            return this.$new_terms_allowedP;
        }

        public SubLObject getField37() {
            return this.$compute_answer_justificationsP;
        }

        public SubLObject getField38() {
            return this.$memoization_state;
        }

        public SubLObject getField39() {
            return this.$sbhl_resource_space;
        }

        public SubLObject getField40() {
            return this.$preparedP;
        }

        public SubLObject getField41() {
            return this.$destruction_imminentP;
        }

        public SubLObject getField42() {
            return this.$meta_problem_store;
        }

        public SubLObject getField43() {
            return this.$static_properties;
        }

        public SubLObject getField44() {
            return this.$janitor;
        }

        public SubLObject getField45() {
            return this.$historical_root_problems;
        }

        public SubLObject getField46() {
            return this.$historical_tactic_count;
        }

        public SubLObject getField47() {
            return this.$complex_problem_query_czer_index;
        }

        public SubLObject getField48() {
            return this.$complex_problem_query_signatures;
        }

        public SubLObject getField49() {
            return this.$proof_keeping_index;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$guid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$creation_time = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$inference_id_index = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$strategy_id_index = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$problem_id_index = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$link_id_index = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$proof_id_index = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$problems_by_query_index = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$rejected_proofs = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$processed_proofs = value;
        }

        @Override
        public SubLObject setField14(SubLObject value) {
            return this.$potentially_processed_problems = value;
        }

        @Override
        public SubLObject setField15(SubLObject value) {
            return this.$non_explanatory_subproofs_possibleP = value;
        }

        @Override
        public SubLObject setField16(SubLObject value) {
            return this.$non_explanatory_subproofs_index = value;
        }

        @Override
        public SubLObject setField17(SubLObject value) {
            return this.$most_recent_tactic_executed = value;
        }

        @Override
        public SubLObject setField18(SubLObject value) {
            return this.$min_proof_depth_index = value;
        }

        @Override
        public SubLObject setField19(SubLObject value) {
            return this.$min_transformation_depth_index = value;
        }

        @Override
        public SubLObject setField20(SubLObject value) {
            return this.$min_transformation_depth_signature_index = value;
        }

        public SubLObject setField21(SubLObject value) {
            return this.$min_depth_index = value;
        }

        public SubLObject setField22(SubLObject value) {
            return this.$equality_reasoning_method = value;
        }

        public SubLObject setField23(SubLObject value) {
            return this.$equality_reasoning_domain = value;
        }

        public SubLObject setField24(SubLObject value) {
            return this.$intermediate_step_validation_level = value;
        }

        public SubLObject setField25(SubLObject value) {
            return this.$max_problem_count = value;
        }

        public SubLObject setField26(SubLObject value) {
            return this.$crazy_max_problem_count = value;
        }

        public SubLObject setField27(SubLObject value) {
            return this.$removal_allowedP = value;
        }

        public SubLObject setField28(SubLObject value) {
            return this.$transformation_allowedP = value;
        }

        public SubLObject setField29(SubLObject value) {
            return this.$add_restriction_layer_of_indirectionP = value;
        }

        public SubLObject setField30(SubLObject value) {
            return this.$negation_by_failureP = value;
        }

        public SubLObject setField31(SubLObject value) {
            return this.$completeness_minimization_allowedP = value;
        }

        public SubLObject setField32(SubLObject value) {
            return this.$direction = value;
        }

        public SubLObject setField33(SubLObject value) {
            return this.$evaluate_subl_allowedP = value;
        }

        public SubLObject setField34(SubLObject value) {
            return this.$rewrite_allowedP = value;
        }

        public SubLObject setField35(SubLObject value) {
            return this.$abduction_allowedP = value;
        }

        public SubLObject setField36(SubLObject value) {
            return this.$new_terms_allowedP = value;
        }

        public SubLObject setField37(SubLObject value) {
            return this.$compute_answer_justificationsP = value;
        }

        public SubLObject setField38(SubLObject value) {
            return this.$memoization_state = value;
        }

        public SubLObject setField39(SubLObject value) {
            return this.$sbhl_resource_space = value;
        }

        public SubLObject setField40(SubLObject value) {
            return this.$preparedP = value;
        }

        public SubLObject setField41(SubLObject value) {
            return this.$destruction_imminentP = value;
        }

        public SubLObject setField42(SubLObject value) {
            return this.$meta_problem_store = value;
        }

        public SubLObject setField43(SubLObject value) {
            return this.$static_properties = value;
        }

        public SubLObject setField44(SubLObject value) {
            return this.$janitor = value;
        }

        public SubLObject setField45(SubLObject value) {
            return this.$historical_root_problems = value;
        }

        public SubLObject setField46(SubLObject value) {
            return this.$historical_tactic_count = value;
        }

        public SubLObject setField47(SubLObject value) {
            return this.$complex_problem_query_czer_index = value;
        }

        public SubLObject setField48(SubLObject value) {
            return this.$complex_problem_query_signatures = value;
        }

        public SubLObject setField49(SubLObject value) {
            return this.$proof_keeping_index = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($problem_store_native.class, $sym22$PROBLEM_STORE, $sym23$PROBLEM_STORE_P, $list24, $list25,
                    new String[] { "$guid", "$suid", "$lock", "$creation_time", "$inference_id_index", "$strategy_id_index", "$problem_id_index", "$link_id_index", "$proof_id_index", "$problems_by_query_index", "$rejected_proofs", "$processed_proofs", "$potentially_processed_problems",
                            "$non_explanatory_subproofs_possibleP", "$non_explanatory_subproofs_index", "$most_recent_tactic_executed", "$min_proof_depth_index", "$min_transformation_depth_index", "$min_transformation_depth_signature_index", "$min_depth_index", "$equality_reasoning_method",
                            "$equality_reasoning_domain", "$intermediate_step_validation_level", "$max_problem_count", "$crazy_max_problem_count", "$removal_allowedP", "$transformation_allowedP", "$add_restriction_layer_of_indirectionP", "$negation_by_failureP",
                            "$completeness_minimization_allowedP", "$direction", "$evaluate_subl_allowedP", "$rewrite_allowedP", "$abduction_allowedP", "$new_terms_allowedP", "$compute_answer_justificationsP", "$memoization_state", "$sbhl_resource_space", "$preparedP", "$destruction_imminentP",
                            "$meta_problem_store", "$static_properties", "$janitor", "$historical_root_problems", "$historical_tactic_count", "$complex_problem_query_czer_index", "$complex_problem_query_signatures", "$proof_keeping_index" },
                    $list26, $list27, $sym28$PRINT_PROBLEM_STORE);
        }
    }

    public static class $problem_store_p$UnaryFunction extends UnaryFunction {
        public $problem_store_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STORE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return problem_store_p(arg1);
        }
    }

    public static class $problem_store_janitor_native extends SubLStructNative {
        public SubLObject $store;
        public SubLObject $indestructible_problems;
        public SubLObject $staleP;
        private static SubLStructDeclNative structDecl;

        public $problem_store_janitor_native() {
            this.$store = CommonSymbols.NIL;
            this.$indestructible_problems = CommonSymbols.NIL;
            this.$staleP = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $problem_store_janitor_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$store;
        }

        @Override
        public SubLObject getField3() {
            return this.$indestructible_problems;
        }

        @Override
        public SubLObject getField4() {
            return this.$staleP;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$store = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$indestructible_problems = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$staleP = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($problem_store_janitor_native.class, $sym325$PROBLEM_STORE_JANITOR, $sym326$PROBLEM_STORE_JANITOR_P, $list327, $list328, new String[] { "$store", "$indestructible_problems", "$staleP" }, $list329, $list330,
                    $sym331$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $problem_store_janitor_p$UnaryFunction extends UnaryFunction {
        public $problem_store_janitor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STORE-JANITOR-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return problem_store_janitor_p(arg1);
        }
    }
}
/*
 *
 * Total time: 3518 ms
 *
 */